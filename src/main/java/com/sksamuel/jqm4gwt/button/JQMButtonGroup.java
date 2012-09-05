package com.sksamuel.jqm4gwt.button;

import com.google.gwt.dom.client.Document;
import com.sksamuel.jqm4gwt.HasInline;
import com.sksamuel.jqm4gwt.panel.JQMControlGroup;

/**
 * @author Stephen K Samuel samspade79@gmail.com 5 May 2011 18:09:41
 * 
 *         Groups a collection of {@link JQMButton} instances together
 * 
 * @link http://jquerymobile.com/demos/1.0b1/#/demos/1.0b1/docs/buttons/buttons-
 *       grouped.html
 * 
 */
public class JQMButtonGroup extends JQMControlGroup implements HasInline {

	public JQMButtonGroup() {
		super(Document.get().createDivElement(), "jqm4gwt-buttongroup");
	}

	/**
	 * Returns true if this widget is currently rendering inline
	 */
	@Override
	public boolean isInline() {
		return "true".equals(getElement().getAttribute("data-inline"));
	}

	/**
	 * If inline is true then sets all the buttons in this group to inline,
	 * otherwise sets them to not-inline.
	 * 
	 * If the buttons are in a group then it is best to call this method
	 * instead of setInline on each button
	 */
	@Override
	public void setInline(boolean inline) {
		getElement().setAttribute("data-inline", "true");
		for (int k = 0; k < getWidgetCount(); k++) {
			JQMButton button = (JQMButton) getWidget(k);
			button.setInline(inline);
		}
	}
}
