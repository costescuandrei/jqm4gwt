package com.sksamuel.jqm4gwt.examples.uibinder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.sksamuel.jqm4gwt.JQMContext;
import com.sksamuel.jqm4gwt.JQMPage;
import com.sksamuel.jqm4gwt.JQMPopup;
import com.sksamuel.jqm4gwt.Mobile;
import com.sksamuel.jqm4gwt.button.JQMButton;
import com.sksamuel.jqm4gwt.form.JQMForm;
import com.sksamuel.jqm4gwt.form.SubmissionHandler;
import com.sksamuel.jqm4gwt.form.elements.JQMCheckbox;
import com.sksamuel.jqm4gwt.form.elements.JQMFlip;
import com.sksamuel.jqm4gwt.form.elements.JQMRadioset;
import com.sksamuel.jqm4gwt.form.elements.JQMSlider;
import com.sksamuel.jqm4gwt.form.elements.JQMText;
import com.sksamuel.jqm4gwt.list.JQMList;
import com.sksamuel.jqm4gwt.list.JQMListItem;
import com.sksamuel.jqm4gwt.plugins.datebox.JQMCalBox;

/**
 * @author jraymond
 *         Date: 4/4/13
 *         Time: 11:02 AM
 */
public class TestView1 {

    interface UiBinder extends com.google.gwt.uibinder.client.UiBinder<JQMPage, TestView1> { }

    public static final UiBinder BINDER = GWT.create(TestView1.UiBinder.class);

    public static JQMPage createPage() { return new TestView1().page; }

    private JQMPage page = TestView1.BINDER.createAndBindUi(this);

    private TestView2 nextView = new TestView2();

    @UiField
    JQMPopup popup;

    @UiField
    JQMButton popupOpenButton;

    @UiField
    JQMButton popupCloseButton;

    @UiField
    JQMText text;

    @UiField
    JQMButton disableTextButton;

    @UiField
    JQMButton enableTextButton;

    @UiField
    JQMSlider slider;

    @UiField
    JQMButton disableSliderButton;

    @UiField
    JQMButton enableSliderButton;

    @UiField
    JQMForm form;

    @UiField
    JQMButton navBarBtn1;

    @UiField
    JQMCheckbox cb1;

    @UiField
    JQMCheckbox cb2;

    @UiField
    JQMCheckbox cb3;

    @UiField
    JQMCheckbox cb4;

    @UiField
    JQMButton checkboxInfoBtn;

    @UiField
    JQMRadioset radio1;

    @UiField
    JQMButton radioInfoBtn;

    @UiField
    JQMButton setRadioValBtn;

    @UiField
    JQMButton setRadioNullBtn;

    @UiField
    JQMFlip flip;

    @UiField
    JQMButton flipInfoBtn;

    @UiField
    JQMButton setFlipValBtn;

    @UiField
    JQMButton setFlipNullBtn;

    @UiField
    JQMButton headerTestBtn1;

    @UiField
    JQMButton headerTestBtn2;

    @UiField
    FlowPanel headerPanel1;

    @UiField
    JQMCalBox datePicker;

    @UiField
    JQMButton datePickerGetValueBtn;

    @UiField
    JQMButton datePickerSetNullBtn;

    @UiField
    JQMListItem listItem4;

    @UiField
    JQMButton setListItemTextBtn;

    @UiField
    JQMListItem liCbA;

    @UiField
    JQMListItem liCbC;

    @UiField
    JQMListItem liCbD;

    @UiField
    JQMButton listItemCheckedBtn;

    @UiField
    JQMButton listItemSwitchCheckedBtn;

    @UiField
    JQMList listWithChecked;

    @UiField
    JQMList unorderedList;

    @UiField
    JQMButton ulBtn;

    @UiHandler("popupOpenButton")
    void handlePopupOpenButtonClick(ClickEvent e) {
        popup.open();
    }

    @UiHandler("popupCloseButton")
    void handlePopupCloseButtonClick(ClickEvent e) {
        popup.close();
    }

    @UiHandler("disableTextButton")
    void handleDisableTextButtonClick(ClickEvent e) {
        text.disable();
    }

    @UiHandler("enableTextButton")
    void handleEnableTextButtonClick(ClickEvent e) {
        text.enable();
    }

    @UiHandler("disableSliderButton")
    void handleDisableSliderButtonClick(ClickEvent e) {
        slider.disable();
    }

    @UiHandler("enableSliderButton")
    void handleEnableSliderButtonClick(ClickEvent e) {
        slider.enable();
    }

    @UiHandler("busyButton")
    void handleBusyButtonClick(ClickEvent e) {
        Mobile.busy(true);
        Timer timer = new Timer() {
            @Override
            public void run() {
                Mobile.busy(false);
            }};
        timer.schedule(3000);
    }

    @UiHandler("navBarBtn1")
    void handleNavBarBtn1Click(ClickEvent e) {
        Window.alert("'" + navBarBtn1.getText() + "' is clicked!");
    }

    @UiHandler("checkboxInfoBtn")
    void checkboxInfoBtnClick(ClickEvent e) {
        String cb1Str = "'" + cb1.getText() + "' is " + (cb1.isChecked() ? "checked" : "unchecked");
        String cb2Str = "'" + cb2.getText() + "' is " + (cb2.isChecked() ? "checked" : "unchecked");
        String cb3Str = "'" + cb3.getText() + "' is " + (cb3.isChecked() ? "checked" : "unchecked");
        String cb4Str = "'" + cb4.getText() + "' is " + (cb4.isChecked() ? "checked" : "unchecked");
        Window.alert(cb1Str + "\n" + cb2Str + "\n" + cb3Str + "\n" + cb4Str);
    }

    @UiHandler("radioInfoBtn")
    void radioInfoBtnClick(ClickEvent e) {
        Window.alert("'" + radio1.getText() + "' value is " + radio1.getValue());
    }

    @UiHandler("setRadioValBtn")
    void setRadioValBtnClick(ClickEvent e) {
        radio1.setValue("c");
    }

    @UiHandler("setRadioNullBtn")
    void setRadioNullBtnClick(ClickEvent e) {
        radio1.setValue(null);
    }

    @UiHandler("flipInfoBtn")
    void flipInfoBtnClick(ClickEvent e) {
        Window.alert("'" + flip.getText() + "' value is " + flip.getValue());
    }

    @UiHandler("setFlipValBtn")
    void setFlipValBtnClick(ClickEvent e) {
        flip.setValue("flip2Value");
    }

    @UiHandler("setFlipNullBtn")
    void setFlipNullBtnClick(ClickEvent e) {
        flip.setValue(null);
    }

    @UiHandler("datePickerGetValueBtn")
    void datePickerGetValueBtnClick(ClickEvent e) {
        Window.alert("'" + datePicker.getText() + "' value is " + datePicker.getValue());
    }

    @UiHandler("datePickerSetNullBtn")
    void datePickerSetNullBtnClick(ClickEvent e) {
        datePicker.setValue(null);
    }

    @UiHandler("headerTestBtn1")
    void headerTestBtn1Click(ClickEvent e) {
        boolean visible = Mobile.isVisible(nextView.testPage2.getElement());
        boolean hidden = Mobile.isHidden(nextView.testPage2.getElement());
        String s2 = "nextView.testPage2: visible=" + String.valueOf(visible) + "; hidden="
                    + String.valueOf(hidden) + "; HasVisibility.isVisible()=" + nextView.testPage2.isVisible();

        visible = Mobile.isVisible(page.getElement());
        hidden = Mobile.isHidden(page.getElement());
        String s1 = "This page: visible=" + String.valueOf(visible) + "; hidden="
                    + String.valueOf(hidden) + "; HasVisibility.isVisible()=" + page.isVisible();

        Window.alert(headerTestBtn1.getText() + " is clicked!\n\n" + s1 + "\n\n" + s2);
    }

    @UiHandler("headerTestBtn2")
    void headerTestBtn2Click(ClickEvent e) {
        Window.alert(headerTestBtn2.getText() + " is clicked!");
    }

    @UiHandler("setListItemTextBtn")
    void setListItemTextBtnClick(ClickEvent e) {
        listItem4.setText(null);
    }

    @UiHandler("listItemCheckedBtn")
    void listItemCheckedBtnClick(ClickEvent e) {
        Window.alert(liCbA.getText() + " isChecked(): " + liCbA.isChecked() + "; getCheckBox(): " + liCbA.getCheckBox() + "\n"
                   + liCbC.getText() + " isChecked(): " + liCbC.isChecked() + "\n"
                   + liCbD.getText() + " isChecked(): " + liCbD.isChecked());
        //liCbA.setCheckBox(IconPos.LEFT);
        //listWithChecked.refresh();
    }

    @UiHandler("listItemSwitchCheckedBtn")
    void listItemSwitchCheckedBtnClick(ClickEvent e) {
        boolean v = liCbD.isChecked();
        liCbD.setChecked(!v);
    }

    @UiHandler("ulBtn")
    void ulBtnClick(ClickEvent e) {
        unorderedList.clear();

        JQMListItem li = new JQMListItem("test1", "");
        li.setSplitHref("");
        unorderedList.appendItem(li);

        li = new JQMListItem("test2", "");
        li.setSplitHref("");
        unorderedList.appendItem(li);

        li = new JQMListItem();
        li.setControlGroup(true);
        Label l = new Label("Input1");
        li.addWidget(l);
        TextBox t = new TextBox();
        li.addWidget(t);
        l = new Label("Input2");
        li.addWidget(l);
        t = new TextBox();
        li.addWidget(t);
        li.setSplitHref("");
        unorderedList.appendItem(li);

        //unorderedList.recreate();
        unorderedList.refresh();
    }

    {
        form.setSubmissionHandler(new SubmissionHandler<JQMForm>() {
            @Override
            public void onSubmit(JQMForm form) {
                // Do something here.
            }
        });
        /*radio1.addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                Window.alert("'" + radio1.getText() + "' value changed: " +event.getValue());
            }
        });
        radio1.addSelectionHandler(new SelectionHandler<String>() {
            @Override
            public void onSelection(SelectionEvent<String> event) {
                Window.alert("'" + radio1.getText() + "' selected item: " + event.getSelectedItem());
            }});*/

        headerPanel1.addDomHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("headerPanel1 is clicked!");
            }}, ClickEvent.getType());

        unorderedList.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                JQMListItem item = unorderedList.getClickItem();
                boolean isSplit = unorderedList.getClickIsSplit();
                Window.alert("Clicked: " + item.getText() + "; Split button: " + isSplit);
            }
        });
    }

    public void show() {
        JQMContext.changePage(page);
    }

}
