package domain.model;

import be.kuleuven.cs.som.annotate.*;

public class OilTank {  
/**
 * @invar  Each oil tank can have its contents as contents.
 *       | canHaveAsContents(this.getContents())
 */

/**
 * Initialize this new oil tank with given contents.
 * 
 * @param  contents
 *         The contents for this new oil tank.
 * @pre    This new oil tank can have the given contents as its contents.
 *       | canHaveAsContents(contents)
 * @post   The contents of this new oil tank is equal to the given
 *         contents.
 *       | new.getContents() == contents
 */
public OilTank(long contents) {
	assert this.canHaveAsContents(contents);
	this.contents = contents;
}

/**
 * Return the contents of this oil tank.
 */
@Basic @Raw @Immutable
public long getContents() {
	return this.contents;
}

/**
 * Check whether this oil tank can have the given contents as its contents.
 *  
 * @param  contents
 *         The contents to check.
 * @return 
 *       | result == contents>0
*/
@Raw
public boolean canHaveAsContents(long contents) {
	return false;
}

/**
 * Variable registering the contents of this oil tank.
 */
private final long contents;
}
