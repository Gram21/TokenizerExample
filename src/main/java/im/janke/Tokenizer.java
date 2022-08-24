package im.janke;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;
import java.util.Properties;

public class Tokenizer {
    private StanfordCoreNLP pipeline;

    public Tokenizer() {
        this(Language.UNSPECIFIED);
    }

    public Tokenizer(Language language) {
        this.pipeline = new StanfordCoreNLP(getProperties(language));
    }

    private Properties getProperties(Language language) {
        Properties properties = new Properties();
        properties.setProperty("annotators", "tokenize");
        properties.setProperty("tokenize.language", language.value());
        return properties;
    }

    public List<String> tokenize(String text) {
        CoreDocument document = getTokenizedDocument(text);
        return document.tokens().stream().map(CoreLabel::originalText).toList();
    }

    public CoreDocument getTokenizedDocument(String text) {
        return pipeline.processToCoreDocument(text);
    }

}
