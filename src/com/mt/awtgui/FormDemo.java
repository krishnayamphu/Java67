package com.mt.awtgui;

import java.awt.*;

public class FormDemo extends Frame {
    Label lblgender,lblcourse,lblta,lblchoice,lbllist;
    Checkbox cbmale,cbfemale,cbbasic,cbweb;
    CheckboxGroup ckbgender;
    TextArea ta;
    Choice choice;
    List list;
    public FormDemo(){
        ckbgender=new CheckboxGroup();
        lblgender=new Label("Gender:");
        lblcourse=new Label("Course:");
        lblta=new Label("Textarea:");
        lblchoice=new Label("Choice/Combobox:");
        lbllist=new Label("List");

        cbmale=new Checkbox("male",ckbgender,false);
        cbfemale=new Checkbox("female",ckbgender,false);
        cbbasic=new Checkbox("Basic",true);
        cbweb=new Checkbox("Web");
        ta=new TextArea(5,15);
        choice=new Choice();
        choice.addItem("Apple");
        choice.addItem("Mango");
        choice.addItem("Banana");

        list=new List();
        list.add("Students");
        list.add("Teachers");
        list.add("Books");


        setSize(240,400);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Form");
        setResizable(false);

        add(lblgender);
        add(cbmale);
        add(cbfemale);

        add(lblcourse);
        add(cbbasic);
        add(cbweb);

        add(lblta);
        add(ta);

        add(lblchoice);
        add(choice);

        add(lbllist);
        add(list);



    }

    public static void main(String[] args) {
        new FormDemo();
    }
}
