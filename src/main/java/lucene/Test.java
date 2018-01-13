package lucene;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;

/**
 * 使用lucene分词
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String line = "我爱中国,中国是发展中国家";
        StringReader reader = new StringReader(line);
        IKSegmenter lucene = new IKSegmenter(reader, true);
        Lexeme lexeme = null;
        while((lexeme=lucene.next())!=null){
            System.out.print(lexeme.getLexemeText()+" | ");
        }
    }
}
