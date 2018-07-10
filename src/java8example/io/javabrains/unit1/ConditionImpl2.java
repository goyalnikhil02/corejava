package io.javabrains.unit1;

import io.javabrains.unit1.Unit1Exercise.Condition;

public class ConditionImpl2 implements Condition {

	@Override
	public boolean test(Person p) {
		// TODO Auto-generated method stub
		return p.getFirstName().startsWith("C");
	}

}
