package com.excersie;

import com.excersie.SolutionwithJava7.Condition;

public class ConditionImpl2 implements Condition {

	@Override
	public boolean test(Person p) {
		return p.getFirstName().startsWith("C");
	}

}
