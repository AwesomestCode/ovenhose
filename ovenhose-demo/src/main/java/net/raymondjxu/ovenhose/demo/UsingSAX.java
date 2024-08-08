/**
 * ovenhose
 *
 * Copyright (c) 2009, 2014 Christian Kohlschütter
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.raymondjxu.ovenhose.demo;

import java.net.URL;

import net.raymondjxu.ovenhose.document.TextDocument;
import net.raymondjxu.ovenhose.extractors.ArticleExtractor;
import org.xml.sax.InputSource;

import net.raymondjxu.ovenhose.sax.BoilerpipeSAXInput;
import net.raymondjxu.ovenhose.sax.HTMLFetcher;

/**
 * Demonstrates how to use Boilerpipe when working with {@link InputSource}s.
 */
public class UsingSAX {
  public static void main(final String[] args) throws Exception {
    URL url;
    url =
        new URL(
            "https://www.nytimes.com/1989/11/10/world/clamor-east-east-germany-opens-frontier-west-for-migration-travel-thousands.html");

    final InputSource is = HTMLFetcher.fetch(url).toInputSource();

    final BoilerpipeSAXInput in = new BoilerpipeSAXInput(is);
    final TextDocument doc = in.getTextDocument();

    // You have the choice between different Extractors

    // System.out.println(DefaultExtractor.INSTANCE.getText(doc));
    System.out.println(ArticleExtractor.INSTANCE.getText(doc));
  }
}
