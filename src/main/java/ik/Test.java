package ik;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.StringReader;

/**
 * ik分词器的使用
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String line = "我爱中国,中国是发展中国家";
        Analyzer ikAnalyzer = new IKAnalyzer(true);
        StringReader reader = new StringReader(line);
        TokenStream ts = ikAnalyzer.tokenStream("", reader);
        CharTermAttribute charTermAttribute = ts.getAttribute(CharTermAttribute.class);
        ts.reset();
        while(ts.incrementToken()){
            System.out.print(charTermAttribute.toString()+" | ");
        }
        if(reader!=null){
            reader.close();
        }
    }
}
