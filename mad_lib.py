# This is a simple Mad lib game. In this game program asks you to enter some adjectives, nouns and verbs,
# and then puts them in various places of text and finally, gives you resulted funny text.
adj = input("Give me an adjective: ")
adj2 = input("One more adjective: ")
adj3 = input("One more last adjective: ")
noun1 = input("Give me a singular noun: ")
plu_noun1 = input("Give me plural noun: ")
plu_noun2 = input("One more plural noun: ")
verb1 = input("Give me a verb in Present Tense: ")
verb2 = input("One more verb in Pre. tense , plsss: ")

print("Today, every student has a computer small enough to fit into his " + noun1 + ".\n"
      "He can solve any math problem by simply pushing the computer's little " + plu_noun1 + ".\n"
      "Computers can add, multiply, divide, and " + verb1 +".\n"
      "They can also " + verb2 + " better than a human. Some computers are " + adj + ".\n"
      "Others have a/an " + adj2 + " screen that shows all kinds of " + plu_noun2 + " and " + adj3 + " figures.")