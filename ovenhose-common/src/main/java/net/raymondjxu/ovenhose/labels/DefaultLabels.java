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
package net.raymondjxu.ovenhose.labels;

import net.raymondjxu.ovenhose.document.TextBlock;

/**
 * Some pre-defined labels which can be used in conjunction with {@link TextBlock#addLabel(String)}
 * and {@link TextBlock#hasLabel(String)}.
 */
public final class DefaultLabels {
  public static final String TITLE = "de.l3s.ovenhose/TITLE";
  public static final String ARTICLE_METADATA = "de.l3s.ovenhose/ARTICLE_METADATA";
  public static final String INDICATES_END_OF_TEXT = "de.l3s.ovenhose/INDICATES_END_OF_TEXT";
  public static final String MIGHT_BE_CONTENT = "de.l3s.ovenhose/MIGHT_BE_CONTENT";
  public static final String VERY_LIKELY_CONTENT = "de.l3s.ovenhose/VERY_LIKELY_CONTENT";
  public static final String STRICTLY_NOT_CONTENT = "de.l3s.ovenhose/STRICTLY_NOT_CONTENT";
  public static final String HR = "de.l3s.ovenhose/HR";
  public static final String LI = "de.l3s.ovenhose/LI";

  public static final String HEADING = "de.l3s.ovenhose/HEADING";
  public static final String H1 = "de.l3s.ovenhose/H1";
  public static final String H2 = "de.l3s.ovenhose/H2";
  public static final String H3 = "de.l3s.ovenhose/H3";

  public static final String MARKUP_PREFIX = "<";

  private DefaultLabels() {
    // not to be instantiated
  }
}
