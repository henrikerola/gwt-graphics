package com.vaadin.contrib.gwtgraphics.client;

/**
 * Classes implementing this class are able to contain VectorObjects.
 * 
 * @author Henri Kerola / IT Mill Ltd
 * 
 */
public interface VectorObjectContainer {

	/**
	 * 
	 * Add the given VectorObject to this VectorObjectContainer.
	 * 
	 * @param vo
	 *            VectorObject to be added
	 * @return added VectorObject
	 */
	public abstract VectorObject add(VectorObject vo);

	/**
	 * Remove the given VectorObject from this VectorObjectContainer.
	 * 
	 * @param vo
	 *            VectorObject to be removed
	 * 
	 * @return removed VectorObject or null if the container doesn't contained
	 *         the given VectorObject
	 */
	public abstract VectorObject remove(VectorObject vo);

	/**
	 * 
	 * Pops the given VectorObject in this VectorObjectContainer on top.
	 * 
	 * @param vo
	 *            VectorObject to be popped on top
	 * @return the popped VectorObject
	 */
	public abstract VectorObject pop(VectorObject vo);

	/**
	 * Removes all contained VectorObjects from this VectorObjectContainer.
	 */
	public abstract void clear();

}