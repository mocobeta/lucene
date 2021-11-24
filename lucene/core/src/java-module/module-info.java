/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
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

/** Lucene Core. */
module lucene.core {
  exports org.apache.lucene;
  exports org.apache.lucene.analysis;
  exports org.apache.lucene.analysis.standard;
  exports org.apache.lucene.analysis.tokenattributes;
  exports org.apache.lucene.codecs;
  exports org.apache.lucene.codecs.compressing;
  exports org.apache.lucene.codecs.lucene90;
  exports org.apache.lucene.codecs.lucene90.blocktree;
  exports org.apache.lucene.codecs.lucene90.compressing;
  exports org.apache.lucene.codecs.perfield;
  exports org.apache.lucene.document;
  exports org.apache.lucene.geo;
  exports org.apache.lucene.index;
  exports org.apache.lucene.search;
  exports org.apache.lucene.search.comparators;
  exports org.apache.lucene.search.similarities;
  exports org.apache.lucene.store;
  exports org.apache.lucene.util;
  exports org.apache.lucene.util.automaton;
  exports org.apache.lucene.util.bkd;
  exports org.apache.lucene.util.compress;
  exports org.apache.lucene.util.fst;
  exports org.apache.lucene.util.graph;
  exports org.apache.lucene.util.hnsw;
  exports org.apache.lucene.util.hppc;
  exports org.apache.lucene.util.mutable;
  exports org.apache.lucene.util.packed;

  provides org.apache.lucene.analysis.TokenizerFactory with
      org.apache.lucene.analysis.standard.StandardTokenizerFactory;
  provides org.apache.lucene.codecs.Codec with
      org.apache.lucene.codecs.lucene90.Lucene90Codec;
  provides org.apache.lucene.codecs.DocValuesFormat with
      org.apache.lucene.codecs.lucene90.Lucene90DocValuesFormat;
  provides org.apache.lucene.codecs.KnnVectorsFormat with
      org.apache.lucene.codecs.lucene90.Lucene90HnswVectorsFormat;
  provides org.apache.lucene.codecs.PostingsFormat with
      org.apache.lucene.codecs.lucene90.Lucene90PostingsFormat;
  provides org.apache.lucene.index.SortFieldProvider with
      org.apache.lucene.search.SortField.Provider,
      org.apache.lucene.search.SortedNumericSortField.Provider,
      org.apache.lucene.search.SortedSetSortField.Provider;
}
