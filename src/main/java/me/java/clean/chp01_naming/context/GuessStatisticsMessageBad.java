package me.java.clean.chp01_naming.context;

import static org.graalvm.compiler.debug.TTY.*;

/**
 * 일단 함수가 좀 길다.
 * 세 변수를 함수 전반에서 사용한다.
 */
public class GuessStatisticsMessageBad {
	private void printGuessStatistics(char candidate, int count) {
		String number;
		String verb;
		String pluralModifier;
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
		} else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		String guessMessage = String.format(
			"There %s %s %s%S", verb, number, candidate, pluralModifier
		);
		print(guessMessage);
	}
}
