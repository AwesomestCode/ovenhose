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
package net.raymondjxu.ovenhose.filters.simple;

import net.raymondjxu.ovenhose.BoilerpipeFilter;
import net.raymondjxu.ovenhose.BoilerpipeProcessingException;
import net.raymondjxu.ovenhose.document.TextBlock;
import net.raymondjxu.ovenhose.document.TextDocument;
import net.raymondjxu.ovenhose.labels.DefaultLabels;

/**
 * Marks all blocks that contain a given label as "boilerplate".
 */
public final class LabelToBoilerplateFilter implements BoilerpipeFilter {
  public static final LabelToBoilerplateFilter INSTANCE_STRICTLY_NOT_CONTENT =
      new LabelToBoilerplateFilter(DefaultLabels.STRICTLY_NOT_CONTENT);

  private String[] labels;

  public LabelToBoilerplateFilter(final String... label) {
    this.labels = label;
  }

  public boolean process(final TextDocument doc) throws BoilerpipeProcessingException {

    boolean changes = false;

    BLOCK_LOOP : for (TextBlock tb : doc.getTextBlocks()) {
      if (tb.isContent()) {
        for (String label : labels) {
          if (tb.hasLabel(label)) {
            tb.setIsContent(false);
            changes = true;
            continue BLOCK_LOOP;
          }
        }
      }
    }

    return changes;
  }
}
