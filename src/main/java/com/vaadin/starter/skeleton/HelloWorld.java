package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

@Tag("hello-world")
@HtmlImport("frontend://hello-world.html")
public class HelloWorld extends PolymerTemplate<HelloWorld.HelloWorldModel> {

    @Id("vaadinButton")
    private Button vaadinButton;

    public HelloWorld(){
        vaadinButton.addClickListener(e->{
           getElement().getParent().appendChild(new Label("Ouch!").getElement());
        });
    }

    public interface HelloWorldModel extends TemplateModel {
        void setValue(String value);
    }

    public void setValue(String value){
        getModel().setValue(value);
    }
}
