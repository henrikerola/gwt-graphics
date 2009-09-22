package com.vaadin.contrib.gwtgraphics.client.shape;

import com.vaadin.contrib.gwtgraphics.client.Shape;
import com.vaadin.contrib.gwtgraphics.client.VectorObject;

/**
 * Embed text into DrawingArea.
 * 
 * @author Henri Kerola / IT Mill Ltd
 * 
 */
public class Text extends Shape {

	/**
	 * Creates a new instance of Text. Position and the text to be rendered are
	 * given as paramaters. Font family is set to "Arial" and font size to 20px.
	 * 
	 * @param x
	 *            the x-coordinate position in pixels
	 * @param y
	 *            the y-coordinate position in pixels
	 * @param text
	 *            the text to be rendered
	 */
	public Text(int x, int y, String text) {
		setX(x);
		setY(y);
		setText(text);
		setFontFamily("Arial");
		setFontSize(20);
	}

	@Override
	protected Class<? extends VectorObject> getType() {
		return Text.class;
	}

	/**
	 * Returns the rendered text.
	 * 
	 * @return the rendered text
	 */
	public String getText() {
		return getImpl().getText(getElement());
	}

	/**
	 * Sets the text to be rendered.
	 * 
	 * @param text
	 *            the text
	 */
	public void setText(String text) {
		getImpl().setText(getElement(), text);
	}

	/**
	 * Returns the font family of the text.
	 * 
	 * @return the font family
	 */
	public String getFontFamily() {
		return getImpl().getTextFontFamily(getElement());
	}

	/**
	 * Sets the font family of the text.
	 * 
	 * @param family
	 *            the font family
	 */
	public void setFontFamily(String family) {
		getImpl().setTextFontFamily(getElement(), family);
	}

	/**
	 * Returns the font size of the text.
	 * 
	 * @return the size
	 */
	public int getFontSize() {
		return getImpl().getTextFontSize(getElement());
	}

	/**
	 * Sets the font size of the text.
	 * 
	 * @param size
	 *            the size
	 */
	public void setFontSize(int size) {
		getImpl().setTextFontSize(getElement(), size);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vaadin.contrib.gwtgraphics.client.Shape#setPropertyDouble(java.lang
	 * .String, double)
	 */
	public void setPropertyDouble(String property, double value) {
		property = property.toLowerCase();
		if ("fontsize".equals(property)) {
			setFontSize((int) value);
		} else {
			super.setPropertyDouble(property, value);
		}
	}
}
