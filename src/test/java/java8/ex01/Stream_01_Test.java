package java8.ex01;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Test;

import java8.data.Data;
import java8.data.domain.Order;
import java8.data.domain.Pizza;

/**
 * Exercice 01 - Recherche
 */
public class Stream_01_Test {

    @Test
    public void test_stream_filter() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        // TODO récupérer la liste des pizzas dont le prix est >= 1300
        // TODO utiliser l'API Stream
        List<Pizza> result = null;

        assertThat(result, hasSize(3));
        assertThat(result, everyItem(hasProperty("price", anyOf(equalTo(1300), greaterThan(1300)))));
    }

    @Test
    public void test_stream_anyMatch() throws Exception {

        List<Pizza> pizzas = new Data().getPizzas();

        // TODO valider si au moins une pizza à un prix >= 1300
        Boolean result1 = null;

        // TODO valider si au moins une pizza à un prix >= 2000
        Boolean result2 = null;

        assertThat(result1, is(true));
        assertThat(result2, is(false));
    }

    @Test
    public void test_stream_allMatch() throws Exception {

        List<Pizza> pizzas = new Data().getPizzas();

        // TODO valider que toutes les pizzas ont un prix >= 1300
        Boolean result1 = null;

        // TODO valider que toutes les pizzas ont un prix >= 900
        Boolean result2 = null;

        assertThat(result1, is(false));
        assertThat(result2, is(true));
    }


    @Test
    public void test_stream_noneMatch() throws Exception {

        List<Pizza> pizzas = new Data().getPizzas();

        // TODO valider qu'aucune pizza n'a un prix >= 2000
        Boolean result1 = null;

        assertThat(result1, is(true));
    }

    @Test
    public void test_stream_filter_and_match() throws Exception {

        List<Order> orders = new Data().getOrders();

        // TODO récupérer toutes les commandes dont
        // TODO le prénom du client est "Johnny"
        // TODO dont au moins une pizza a un prix >= 1300
        List<Order> result = orders.stream().filter(o -> o.getCustomer().getFirstname().equals("Johnny"))
        		                            .filter(o -> o.getPizzas().stream().anyMatch(p -> p.getPrice()>=1300)).collect(Collectors.toList());

        assertThat(result, hasSize(1));
        assertThat(result.get(0), hasProperty("id", is(8)));
    }

    @Test
    public void test_stream_findFirst() throws Exception {
        List<Order> orders = new Data().getOrders();

        // TODO récupérer une commande faite par un client dont le prénom est "Sophie"
        Optional<Order> result = null;

        assertThat(result.isPresent(), is(false));
    }

    @Test
    public void test_stream_max() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        // TODO Trouver la pizza la plus chère
        Optional<Pizza> result = null;

        assertThat(result.isPresent(), is(true));
        assertThat(result.get(), hasProperty("id", is(5)));
        assertThat(result.get(), hasProperty("name", is("La Cannibale")));
        assertThat(result.get(), hasProperty("price", is(1550)));
    }

    @Test
    public void test_stream_min() throws Exception {
        List<Order> orders = new Data().getOrders();

        List<Pizza> pizzas = new Data().getPizzas();

        // TODO Trouver la pizza la moins chère dont le prix est >= 950
        Optional<Pizza> result = null;

        assertThat(result.isPresent(), is(true));
        assertThat(result.get(), hasProperty("id", is(3)));
        assertThat(result.get(), hasProperty("name", is("La Reine")));
        assertThat(result.get(), hasProperty("price", is(1000)));
    }
}
