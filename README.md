# cs383f2015-lab4
================

Lab 4 for @janyljumadinova's Computer Science 383: Multi-Agent and Robotic Systems at Allegheny College. This lab deals with the Rebellion model in Repast Simphony.

Answers to Part 1 Questions
---------------------------

A = Active
J = Jailed
Q = Quiet

> If the government legitimacy is very high (close to 1), is the general population able to operate in peaceful coexistence (without cops)?

With the government legitimacy high, the population is able to operate in peaceful coexistence.  The result for running the program with its original parameters (.8 legitimacy) causes an increase from 985 Active People, 0 Jailed, and 135 Quiet to 134A, 844J, and 142Q.  When the legitimacy increases to 0.9, all of the 1120 agents are quiet and none of them become active, and thus never rebel during the 150 tick timeframe.  This represents a population that operates peacefully without the presence of cops in a higly legitimate government.  

> Describe what happens in the situations of corruption by reducing the legitimacy variable?

With the original parameter of 0.8 legitimacy an increase from 985 Active People, 0 Jailed, and 135 Quiet to 134A, 844J, and 142Q.  That is an increase of -851A, 844J, and -8Q.  

When the legitimacy decreased to 0.7 the numbers went from 984A, 0J, and 136Q to 148A, 843J, and 129Q. That is an increase of -836A, 843J, -7Q.  Compared to the experiment using the original parameter of 0.8 legitimacy: The numbers of active, jailed, and quiet people were comparable.

When the legitimacy decreased to 0.6 the numbers went from 951A, 0J, 169Q to 169A, 827J, and 142Q.  That is an increase of -782A, 827J, -27Q.  Compared to the experiment using the original parameter of 0.8 legitimacy: the numbers of active, jailed, and quiet people were different, showing that the decreased legitimacy caused fewer people to be quiet and as a result there were more people being jailed and more active people.  

When the legitimacy decreased to 0.5 the numbers went from 930A, 0J, and 190Q to 120A, 839J, and 161Q.  That is an increase of-740A, 839J, -29Q.  Compared to the experiment using the original parameter of 0.8 legitimacy: The numbers of active, jailed, and quiet people there was a greater decrease in the number of quiet people and more active people.  

> What is the effect of lessening of government oppression by reducing the number of cops?

With the original parameter of 0.8 legitimacy an increase from 985 Active People, 0 Jailed, and 135 Quiet to 134A, 844J, and 142Q.  That is an increase of -851A, 844J, and -8Q.  

The results show that in a government with perfect legitimacy, the number of people who are quiet remains constant throughout the experiment at 1120 people.  However, when the legitimacy of the government is lower the number of cops is an important regulating factor.  Looking at the results for a legitimacy of 0.7 with the number of cops at 0.04, 0.02, and 0.00 there is a clear impact on the presence of cops.  At 0.04, there are a total of 148A, 843J, and 129Q people at the end of the experiment.  At 0.02, there are 284A, 760J, and 76Q at the end of the experiment.  Finally, at 0.00 cops, the entire population is active.  This demonstrates how cops regulate the population to constrain rebellion.  In a society without cops, there is no government oppression and nobody is quiet.   




