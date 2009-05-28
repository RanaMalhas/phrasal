/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package mt.srilm;

public class srilm {
  public static SWIGTYPE_p_unsigned_int new_unsigned_array(int nelements) {
    long cPtr = srilmJNI.new_unsigned_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public static void delete_unsigned_array(SWIGTYPE_p_unsigned_int ary) {
    srilmJNI.delete_unsigned_array(SWIGTYPE_p_unsigned_int.getCPtr(ary));
  }

  public static long unsigned_array_getitem(SWIGTYPE_p_unsigned_int ary, int index) {
    return srilmJNI.unsigned_array_getitem(SWIGTYPE_p_unsigned_int.getCPtr(ary), index);
  }

  public static void unsigned_array_setitem(SWIGTYPE_p_unsigned_int ary, int index, long value) {
    srilmJNI.unsigned_array_setitem(SWIGTYPE_p_unsigned_int.getCPtr(ary), index, value);
  }

  public static SWIGTYPE_p_Vocab initVocab(int start, int end) {
    long cPtr = srilmJNI.initVocab(start, end);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Vocab(cPtr, false);
  }

  public static SWIGTYPE_p_Ngram initLM(int order, SWIGTYPE_p_Vocab vocab) {
    long cPtr = srilmJNI.initLM(order, SWIGTYPE_p_Vocab.getCPtr(vocab));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ngram(cPtr, false);
  }

  public static int readLM(SWIGTYPE_p_Ngram ngram, String filename) {
    return srilmJNI.readLM(SWIGTYPE_p_Ngram.getCPtr(ngram), filename);
  }

  public static float getProb(SWIGTYPE_p_Ngram ngram, SWIGTYPE_p_unsigned_int context, int hist_size, long cur_wrd) {
    return srilmJNI.getProb(SWIGTYPE_p_Ngram.getCPtr(ngram), SWIGTYPE_p_unsigned_int.getCPtr(context), hist_size, cur_wrd);
  }

  public static float getWordProb(SWIGTYPE_p_Ngram ngram, long w, SWIGTYPE_p_unsigned_int context) {
    return srilmJNI.getWordProb(SWIGTYPE_p_Ngram.getCPtr(ngram), w, SWIGTYPE_p_unsigned_int.getCPtr(context));
  }

  public static long getDepth(SWIGTYPE_p_Ngram ngram, SWIGTYPE_p_unsigned_int context, int hist_size) {
    return srilmJNI.getDepth(SWIGTYPE_p_Ngram.getCPtr(ngram), SWIGTYPE_p_unsigned_int.getCPtr(context), hist_size);
  }

  public static long getIndexForWord(SWIGTYPE_p_Vocab vo, String s) {
    return srilmJNI.getIndexForWord(SWIGTYPE_p_Vocab.getCPtr(vo), s);
  }

  public static int getVocab_None() {
    return srilmJNI.getVocab_None();
  }

}
