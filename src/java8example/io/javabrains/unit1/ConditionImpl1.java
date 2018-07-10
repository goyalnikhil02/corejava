package io.javabrains.unit1;

import io.javabrains.unit1.Unit1Exercise.Condition;

public class ConditionImpl1  implements Condition{

	@Override
	public boolean test(Person p) {
		return p.getLastName().startsWith("C");
	}

}
