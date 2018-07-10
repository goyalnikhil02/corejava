package com.excersie;

import com.excersie.SolutionwithJava7.Condition;

public class ConditionImpl1  implements Condition{

	@Override
	public boolean test(Person p) {
		return p.getLastName().startsWith("C");
	}

}
