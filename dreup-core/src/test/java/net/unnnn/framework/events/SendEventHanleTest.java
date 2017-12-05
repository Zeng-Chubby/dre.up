package net.unnnn.framework.events;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.Assert.*;

public class SendEventHanleTest {
    @Test
    public void handle() {

        EventArgs eventArgs = new EventArgs();

        ArrayList array = new ArrayList<Class>();

        array.add(eventArgs.getClass());

        EventHandlerBase eventHandler = new SendEventHanle(array);

        eventHandler.handle(eventArgs);

        a((A, B, C) -> {

            System.out.println(A + B + C);

        });
    }

    public void a(Consumer<String, String, String> action) {
        action.accept("A","B","C");
    }

    @FunctionalInterface
    interface Consumer<T, T1, T2> {

        /**
         * Performs this operation on the given argument.
         *
         * @param t the input argument
         */
        void accept(T t, T1 t1, T2 t2);

        /**
         * Returns a composed {@code Consumer} that performs, in sequence, this
         * operation followed by the {@code after} operation. If performing either
         * operation throws an exception, it is relayed to the caller of the
         * composed operation.  If performing this operation throws an exception,
         * the {@code after} operation will not be performed.
         *
         * @param after the operation to perform after this operation
         * @return a composed {@code Consumer} that performs in sequence this
         * operation followed by the {@code after} operation
         * @throws NullPointerException if {@code after} is null
         */
        default Consumer<T, T1, T2> andThen(Consumer<T, T1, T2> after) {
            Objects.requireNonNull(after);
            return (T t, T1 t1, T2 t2) -> {
                accept(t, t1, t2);
                after.accept(t, t1, t2);
            };
        }
    }


}

