package org.stjs.hello;

import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.dom.Form;
import org.stjs.javascript.dom.Input;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;

import static org.stjs.javascript.Global.alert;
import static org.stjs.javascript.Global.window;

/**
 * Created by admin on 23.11.2014.
 */
public class HelloWorld {
    public static void main(String[] args) {
        window.onload = new Callback1<DOMEvent>() {
            @Override
            public void $invoke(DOMEvent ev) {
                Form form = window.document.forms.$get(0);
                Element button = form.elements.$get("say");
                final Input text = form.elements.$get("to");
                button.onclick = new Function1<DOMEvent, Boolean>() {
                    @Override
                    public Boolean $invoke(DOMEvent ev) {
                        alert("Hello " + text.value);
                        return true;
                    }
                };
            }
        };
    };
}