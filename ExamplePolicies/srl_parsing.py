from allennlp.predictors.predictor import Predictor
from nltk import tokenize

paragraph = """The purpose of the Study is to understand genetic risks of PPD and PPP. Phase I of the Study must first identify if you are eligible to participate by asking your comfort with using the English language on your smart device, gender, age and whether you have given live birth. If you are eligible to participate and you sign the Informed Consent, the Study will collect (through the App) personally identifiable information about you such as name, address, and email address. The App will also ask you about your pregnancy history and mood following childbirth, including questions about medical history and your psychological symptoms (e.g. anxiety) in the postpartum period."""

def preprocess(text):
	text = text.replace("e.g.","e<prd>g<prd>")
	return text

def main():
	# parse paragraph into sentences
	print(paragraph)
	text = preprocess(paragraph)
	sents = tokenize.sent_tokenize(text)
	# srl parsing
	predictor = Predictor.from_path("https://s3-us-west-2.amazonaws.com/allennlp/models/srl-model-2018.05.25.tar.gz")
	for sent in sents:
		res = predictor.predict(sentence=sent)
		print('\nSentence:', sent)
		for parsed_res in res['verbs']:
			for key, val in parsed_res.items():
				print(key, val)
	


if __name__ == '__main__':
	main()