### How to run
1. go to the selected task.
2. type 'gradle test'

# Homework Result
### 1. Accumulate
```
AccumulateTest > accumulateReversedStrings PASSED

AccumulateTest > emptyAccumulateProducesEmptyAccumulation PASSED

AccumulateTest > accumulateWithinAccumulate PASSED

AccumulateTest > accumulateUpperCases PASSED

AccumulateTest > accumulateSquares PASSED
```
### 2. Binary
```
BinaryTest > testBinary11IsDecimal3 PASSED

BinaryTest > testNumberAndWordWhitespaceSeparatedInvalid PASSED

BinaryTest > testBinaryIgnoresLeadingZeros PASSED

BinaryTest > testNumberWithInternalNonBinaryCharactersInvalid PASSED

BinaryTest > testBinary1IsDecimal1 PASSED

BinaryTest > testNumberWithTrailingNonBinaryCharactersInvalid PASSED

BinaryTest > testBinary1001IsDecimal9 PASSED

BinaryTest > testBinary10IsDecimal2 PASSED

BinaryTest > testNumberWithLeadingNonBinaryCharactersInvalid PASSED

BinaryTest > testNumberContainingNonBinaryDigitInvalid PASSED

BinaryTest > testBinary0IsDecimal0 PASSED

BinaryTest > test2NotValidBinaryDigit PASSED

BinaryTest > testBinary100IsDecimal4 PASSED

BinaryTest > testBinary11010IsDecimal26 PASSED

BinaryTest > testBinary10001101000IsDecimal1128 PASSED
```
### 3. Clock
```
ClockAddTest > subtractMoreThanAnHour() PASSED

ClockAddTest > subtractMoreThanTwoHoursWithBorrow() PASSED

ClockAddTest > addMoreThanTwoHoursWithCarry() PASSED

ClockAddTest > subtractAcrossMidnight() PASSED

ClockAddTest > subtractMoreThanOneDay() PASSED

ClockAddTest > addMinutes() PASSED

ClockAddTest > subtractMoreThanTwoHours() PASSED

ClockAddTest > subtractMinutes() PASSED

ClockAddTest > addMoreThanOneHour() PASSED

ClockAddTest > addAcrossMidnight() PASSED

ClockAddTest > addToNextHour() PASSED

ClockAddTest > addMoreThanOneDay() PASSED

ClockAddTest > addNoMinutes() PASSED

ClockAddTest > subtractMoreThanTwoDays() PASSED

ClockAddTest > addMoreThanTwoDays() PASSED

ClockAddTest > subtractToPreviousHour() PASSED

ClockCreationTest > sixtyMinutesIsNextHour() PASSED

ClockCreationTest > hourRollsOver() PASSED

ClockCreationTest > hourAndMinutesRollOverContinuously() PASSED

ClockCreationTest > midnightPrintsAsZero() PASSED

ClockCreationTest > negativeMinutesRollOver() PASSED

ClockCreationTest > negativeSixtyMinutesIsPreviousHour() PASSED

ClockCreationTest > negativeHourRollsOverContinuously() PASSED

ClockCreationTest > minutesRollOverContinuously() PASSED

ClockCreationTest > canPrintTimeWithMinutes() PASSED

ClockCreationTest > negativeHour() PASSED

ClockCreationTest > negativeMinutesRollOverContinuously() PASSED

ClockCreationTest > negativeMinutes() PASSED

ClockCreationTest > negativeHourAndMinutesBothRollOver() PASSED

ClockCreationTest > minutesRollOver() PASSED

ClockCreationTest > negativeHourAndMinutesBothRollOverContinuously() PASSED

ClockCreationTest > hourAndMinutesRollOver() PASSED

ClockCreationTest > hourAndMinutesRollOverToExactlyMidnight() PASSED

ClockCreationTest > hourRollsOverContinuously() PASSED

ClockCreationTest > negativeHourRollsOver() PASSED

ClockCreationTest > canPrintTimeOnTheHour() PASSED

ClockEqualTest > clocksWithNegateHour() PASSED

ClockEqualTest > clocksWithHourOverflowBySeveralDays() PASSED

ClockEqualTest > clocksWithNegativeMinutes() PASSED

ClockEqualTest > clocksWithNegativeMinutesThatWraps() PASSED

ClockEqualTest > clocksWithNegativeHourThatWraps() PASSED

ClockEqualTest > clocksAMinuteApartAreNotEqual() PASSED

ClockEqualTest > clocksWithNegativeHoursAndMinutesThatWrap() PASSED

ClockEqualTest > clocksAnHourApartAreNotEqual() PASSED

ClockEqualTest > clocksWithFullClockAndZeroedClockAreEqual() PASSED

ClockEqualTest > clocksWithHourOverflow() PASSED

ClockEqualTest > clocksWithNegativeMinutesThatWrapsMultipleTimes() PASSED

ClockEqualTest > clocksWithNegativeHourThatWrapsMultipleTimes() PASSED

ClockEqualTest > clocksWithMinuteOverflowBySeveralDays() PASSED

ClockEqualTest > clocksWithMinuteOverflow() PASSED

ClockEqualTest > clocksWithNegativeHoursAndMinutes() PASSED

ClockEqualTest > clocksWithSameTimeAreEqual() PASSED
```
### 4. Acronym
```
AcronymTest > underscoreEmphasis() PASSED

AcronymTest > lowercaseWords() PASSED

AcronymTest > apostrophes() PASSED

AcronymTest > basic() PASSED

AcronymTest > veryLongAbbreviation() PASSED

AcronymTest > nonAcronymAllCapsWord() PASSED

AcronymTest > consecutiveDelimiters() PASSED

AcronymTest > punctuationWithoutWhitespace() PASSED

AcronymTest > punctuation() PASSED
```
### 5. Allergies
```
AllergiesTest > eggsNotAllergicToAnything() PASSED

AllergiesTest > eggsAllergicToEverything() PASSED

AllergiesTest > listNoAllergenScorePartsWithoutHighestValidScore() PASSED

AllergiesTest > listoMoreThanEggsButNotPeanuts() PASSED

AllergiesTest > listNoAllergenScoreParts() PASSED

AllergiesTest > shellfishAllergicToSomethingButNotShellfish() PASSED

AllergiesTest > tomatoesAllergicToTomatoesAndSomethingElse() PASSED

AllergiesTest > listEverything() PASSED

AllergiesTest > catsAllergicToEverything() PASSED

AllergiesTest > pollenAllergicToEverything() PASSED

AllergiesTest > chocolateAllergicToSomethingButNotChocolate() PASSED

AllergiesTest > pollenNotAllergicToAnything() PASSED

AllergiesTest > shellfishNotAllergicToAnything() PASSED

AllergiesTest > listJustPeanuts() PASSED

AllergiesTest > chocolateAllergicOnlyToChocolate() PASSED

AllergiesTest > catsAllergicToSomethingButNotCats() PASSED

AllergiesTest > tomatoesNotAllergicToAnything() PASSED

AllergiesTest > peanutsAllergicToPeanutsAndSomethingElse() PASSED

AllergiesTest > listManyAllergies() PASSED

AllergiesTest > chocolateAllergicToChocolateAndSomethingElse() PASSED

AllergiesTest > eggsAllergicToSomethingButNotEggs() PASSED

AllergiesTest > listJustStrawberries() PASSED

AllergiesTest > peanutsAllergicOnlyToPeanuts() PASSED

AllergiesTest > strawberriesAllergicToEverything() PASSED

AllergiesTest > listNoAllergies() PASSED

AllergiesTest > strawberriesAllergicOnlyToStrawberries() PASSED

AllergiesTest > tomatoesAllergicOnlyToTomatoes() PASSED

AllergiesTest > chocolateNotAllergicToAnything() PASSED

AllergiesTest > strawberriesAllergicToStrawberriesAndSomethingElse() PASSED

AllergiesTest > eggsAllergicOnlyToEggs() PASSED

AllergiesTest > pollenAllergicOnlyToPollen() PASSED

AllergiesTest > catsAllergicToCatsAndSomethingElse() PASSED

AllergiesTest > peanutsAllergicToEverything() PASSED

AllergiesTest > pollenAllergicToSomethingButNotPollen() PASSED

AllergiesTest > peanutsAllergicToSomethingButNotPeanuts() PASSED

AllergiesTest > listJustEggs() PASSED

AllergiesTest > strawberriesNotAllergicToAnything() PASSED

AllergiesTest > tomatoesAllergicToSomethingButNotTomatoes() PASSED

AllergiesTest > shellfishAllergicOnlyToShellfish() PASSED

AllergiesTest > eggsAllergicToEggsAndSomethingElse() PASSED

AllergiesTest > pollenAllergicToPollenAndSomethingElse() PASSED

AllergiesTest > catsNotAllergicToAnything() PASSED

AllergiesTest > peanutsNotAllergicToAnything() PASSED

AllergiesTest > shellfishAllergicToEverything() PASSED

AllergiesTest > tomatoesAllergicToEverything() PASSED

AllergiesTest > listEggsAndPeanuts() PASSED

AllergiesTest > shellfishAllergicToShellfishAndSomethingElse() PASSED

AllergiesTest > strawberriesAllergicToSomethingButNotStrawberries() PASSED

AllergiesTest > catsAllergicOnlyToCats() PASSED

AllergiesTest > chocolateAllergicToEverything() PASSED
```