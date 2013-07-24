/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
public class Encoder extends Coder {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Encoder(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGEncoderUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Encoder(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGEncoderUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(Encoder obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Encoder object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Encoder copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Encoder(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Encoder)
      equal = (((Encoder)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 *  
 * @return	a {@link Encoder}  
 * @throws	InvalidArgument if codec is null or codec cannot decode. 
 *		  
 */
  public static Encoder make(Codec codec) {
    long cPtr = VideoJNI.Encoder_make__SWIG_0(Codec.getCPtr(codec), codec);
    return (cPtr == 0) ? null : new Encoder(cPtr, false);
  }

/**
 * Creates a {@link Encoder} from a given {@link Encoder}  
 * @return	a {@link Encoder}  
 * @throws	InvalidArgument if src is null  
 */
  public static Encoder make(Encoder src) {
    long cPtr = VideoJNI.Encoder_make__SWIG_1(Encoder.getCPtr(src), src);
    return (cPtr == 0) ? null : new Encoder(cPtr, false);
  }

/**
 * Encode the given MediaPicture using this encoder.  
 * The MediaPicture will allocate a buffer to use internally for this, 
 * and  
 * will free it when the frame destroys itself.  
 * Also, when done in order to flush the encoder, caller should call 
 *  
 * this method passing in 0 (null) for frame to tell the encoder  
 * to flush any data it was keeping a hold of.  
 * @param	output [out] The packet to encode into. It will point  
 * to a buffer allocated in the frame. Caller should check MediaPacket.isComplete() 
 *  
 * after call to find out if we had enough information to encode a full 
 * packet.  
 * @param	frame [in/out] The frame to encode  
 * @param	suggestedBufferSize The suggested buffer size to allocate 
 *		 or -1 for choose ourselves.  
 * If -1 we'll allocate a buffer exactly the same size (+1) as the decoded 
 * frame  
 * with the guess that you're encoding a frame because you want to use 
 * LESS space  
 * than that.  
 * return >= 0 on success; <0 on error.  
 */
  public int encodeVideo(MediaPacket output, MediaPicture frame, int suggestedBufferSize) {
    return VideoJNI.Encoder_encodeVideo(swigCPtr, this, MediaPacket.getCPtr(output), output, MediaPicture.getCPtr(frame), frame, suggestedBufferSize);
  }

/**
 * Encode the given MediaAudio using this encoder.  
 * Callers should call this repeatedly on a set of samples until  
 * we consume all the samples.  
 * Also, when done in order to flush the encoder, caller should call 
 *  
 *  
 * to flush any data it was keeping a hold of.  
 * @param	output [out] The packet to encode into. It will point  
 * to a buffer allocated in the frame. Caller should check MediaPacket.isComplete() 
 *  
 * after call to find out if we had enough information to encode a full 
 * packet.  
 * @param	samples [in] The samples to consume  
 * @param	sampleToStartFrom [in] Which sample you want to start with 
 *		  
 * This is usually zero, but if you're using a codec that  
 * packetizes output with small number of samples, you may  
 * need to call encodeAudio repeatedly with different starting  
 * samples to consume all of your samples.  
 * @return	number of samples we consumed when encoding, or negative 
 *		 for errors.  
 */
  public int encodeAudio(MediaPacket output, MediaAudio samples, int sampleToStartFrom) {
    return VideoJNI.Encoder_encodeAudio(swigCPtr, this, MediaPacket.getCPtr(output), output, MediaAudio.getCPtr(samples), samples, sampleToStartFrom);
  }

/**
 * Not final API yet; do not use.  
 */
  public int encodeSubtitle(MediaPacket output, MediaSubtitle subtitles) {
    return VideoJNI.Encoder_encodeSubtitle(swigCPtr, this, MediaPacket.getCPtr(output), output, MediaSubtitle.getCPtr(subtitles), subtitles);
  }

}
