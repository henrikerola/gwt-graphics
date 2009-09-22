package com.vaadin.contrib.gwtgraphics.client;

import com.vaadin.contrib.gwtgraphics.client.animation.Animatable;

/**
 * Shape is an abstract upper-class for VectorObjects that support filling,
 * stroking and positioning.
 * 
 * @author Henri Kerola / IT Mill Ltd
 * 
 */
public abstract class Shape extends VectorObject implements Strokeable,
		Positionable, Animatable {

	/**
	 * This constructor defines initial fill and stroke properties, which are
	 * common for all subclasses. These properties are:
	 * 
	 * <pre>
	 * setFillColor(&quot;white&quot;);
	 * setStrokeColor(&quot;black&quot;);
	 * setStrokeWidth(1);
	 * </pre>
	 */
	public Shape() {
		setFillColor("white");
		setStrokeColor("black");
		setStrokeWidth(1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itmill.toolkit.incubator.graphics.client.Positionable#getX()
	 */
	public int getX() {
		return getImpl().getX(getElement());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itmill.toolkit.incubator.graphics.client.Positionable#setX(int)
	 */
	public void setX(int x) {
		getImpl().setX(getElement(), x);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itmill.toolkit.incubator.graphics.client.Positionable#getY()
	 */
	public int getY() {
		return getImpl().getY(getElement());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itmill.toolkit.incubator.graphics.client.Positionable#setY(int)
	 */
	public void setY(int y) {
		getImpl().setY(getElement(), y);
	}

	/**
	 * Returns the current fill color of the element.
	 * 
	 * @param color
	 *            the current fill color
	 */
	public String getFillColor() {
		return getImpl().getFillColor(getElement());
	}

	/**
	 * Sets the fill color of the element. The color value is specified using
	 * one of the CSS2 color notations. For example, the following values are
	 * legal:
	 * <ul>
	 * <li>red
	 * <li>#ff0000
	 * <li>#f00
	 * <li>rgb(255, 0, 0)
	 * <li>rgb(100%, 0%, 0%)
	 * </ul>
	 * 
	 * Setting the color to null disables elements filling.
	 * 
	 * @see http://www.w3.org/TR/CSS2/syndata.html#value-def-color
	 * @param color
	 *            the new fill color
	 */
	public void setFillColor(String color) {
		getImpl().setFillColor(getElement(), color);
	}

	/**
	 * Returns the fill opacity of the Shape element.
	 * 
	 * @return the current fill opacity
	 */
	public double getFillOpacity() {
		return getImpl().getFillOpacity(getElement());
	}

	/**
	 * Sets the fill opacity of the Shape element. The initial value 1.0 means
	 * fully opaque fill. On the other hand, value 0.0 means fully transparent
	 * paint.
	 * 
	 * @param opacity
	 *            the new fill opacity
	 */
	public void setFillOpacity(double opacity) {
		getImpl().setFillOpacity(getElement(), opacity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itmill.toolkit.incubator.graphics.client.Strokeable#getStrokeColor()
	 */
	public String getStrokeColor() {
		return getImpl().getStrokeColor(getElement());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itmill.toolkit.incubator.graphics.client.Strokeable#setStrokeColor
	 * (java.lang.String)
	 */
	public void setStrokeColor(String color) {
		getImpl().setStrokeColor(getElement(), color);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itmill.toolkit.incubator.graphics.client.Strokeable#getStrokeWidth()
	 */
	public int getStrokeWidth() {
		return getImpl().getStrokeWidth(getElement());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itmill.toolkit.incubator.graphics.client.Strokeable#setStrokeWidth
	 * (int)
	 */
	public void setStrokeWidth(int width) {
		getImpl().setStrokeWidth(getElement(), width);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itmill.toolkit.incubator.graphics.client.Strokeable#getStrokeOpacity
	 * ()
	 */
	public double getStrokeOpacity() {
		return getImpl().getStrokeOpacity(getElement());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itmill.toolkit.incubator.graphics.client.Strokeable#setStrokeOpacity
	 * (double)
	 */
	public void setStrokeOpacity(double opacity) {
		getImpl().setStrokeOpacity(getElement(), opacity);
	}

	public void setPropertyDouble(String property, double value) {
		property = property.toLowerCase();
		if ("x".equals(property)) {
			setX((int) value);
		} else if ("y".equals(property)) {
			setY((int) value);
		} else if ("fillopacity".equals(property)) {
			setFillOpacity(value);
		} else if ("strokeopacity".equals(property)) {
			setStrokeOpacity(value);
		} else if ("strokewidth".equals(property)) {
			setStrokeWidth((int) value);
		}else if ("rotation".equals(property)) {
			setRotation((int) value);
		} 
	}
}