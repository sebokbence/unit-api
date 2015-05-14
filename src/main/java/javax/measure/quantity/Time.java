/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014-2015 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package javax.measure.quantity;

import javax.measure.Quantity;


/**
 * Period of existence or persistence.
 * The metric system unit for this quantity is "s" (second).
 *
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 1.3
 *
 * @see Frequency
 * @see Speed
 * @see AngularSpeed
 * @see Acceleration
 * @see AngularAcceleration
 * @see ElectricCurrent
 * @see MassFlowRate
 * @see VolumetricFlowRate
 * @see InformationRate
 * @see Power
 * 
 * @implSpec 
 * SI Base Unit
 */
public interface Time extends Quantity<Time> {
}
