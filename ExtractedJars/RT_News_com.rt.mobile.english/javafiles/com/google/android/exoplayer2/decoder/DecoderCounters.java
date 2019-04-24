// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;


public final class DecoderCounters
{

	public DecoderCounters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public void ensureUpdated()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
	//*   2    2:aload_0         
	//    3    3:monitorexit     
	//    4    4:return          
	}

	public void merge(DecoderCounters decodercounters)
	{
		decoderInitCount = decoderInitCount + decodercounters.decoderInitCount;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field int decoderInitCount>
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field int decoderInitCount>
	//    5    9:iadd            
	//    6   10:putfield        #24  <Field int decoderInitCount>
		decoderReleaseCount = decoderReleaseCount + decodercounters.decoderReleaseCount;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field int decoderReleaseCount>
	//   10   18:aload_1         
	//   11   19:getfield        #26  <Field int decoderReleaseCount>
	//   12   22:iadd            
	//   13   23:putfield        #26  <Field int decoderReleaseCount>
		inputBufferCount = inputBufferCount + decodercounters.inputBufferCount;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #28  <Field int inputBufferCount>
	//   17   31:aload_1         
	//   18   32:getfield        #28  <Field int inputBufferCount>
	//   19   35:iadd            
	//   20   36:putfield        #28  <Field int inputBufferCount>
		skippedInputBufferCount = skippedInputBufferCount + decodercounters.skippedInputBufferCount;
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #30  <Field int skippedInputBufferCount>
	//   24   44:aload_1         
	//   25   45:getfield        #30  <Field int skippedInputBufferCount>
	//   26   48:iadd            
	//   27   49:putfield        #30  <Field int skippedInputBufferCount>
		renderedOutputBufferCount = renderedOutputBufferCount + decodercounters.renderedOutputBufferCount;
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:getfield        #32  <Field int renderedOutputBufferCount>
	//   31   57:aload_1         
	//   32   58:getfield        #32  <Field int renderedOutputBufferCount>
	//   33   61:iadd            
	//   34   62:putfield        #32  <Field int renderedOutputBufferCount>
		skippedOutputBufferCount = skippedOutputBufferCount + decodercounters.skippedOutputBufferCount;
	//   35   65:aload_0         
	//   36   66:aload_0         
	//   37   67:getfield        #34  <Field int skippedOutputBufferCount>
	//   38   70:aload_1         
	//   39   71:getfield        #34  <Field int skippedOutputBufferCount>
	//   40   74:iadd            
	//   41   75:putfield        #34  <Field int skippedOutputBufferCount>
		droppedBufferCount = droppedBufferCount + decodercounters.droppedBufferCount;
	//   42   78:aload_0         
	//   43   79:aload_0         
	//   44   80:getfield        #36  <Field int droppedBufferCount>
	//   45   83:aload_1         
	//   46   84:getfield        #36  <Field int droppedBufferCount>
	//   47   87:iadd            
	//   48   88:putfield        #36  <Field int droppedBufferCount>
		maxConsecutiveDroppedBufferCount = Math.max(maxConsecutiveDroppedBufferCount, decodercounters.maxConsecutiveDroppedBufferCount);
	//   49   91:aload_0         
	//   50   92:aload_0         
	//   51   93:getfield        #38  <Field int maxConsecutiveDroppedBufferCount>
	//   52   96:aload_1         
	//   53   97:getfield        #38  <Field int maxConsecutiveDroppedBufferCount>
	//   54  100:invokestatic    #44  <Method int Math.max(int, int)>
	//   55  103:putfield        #38  <Field int maxConsecutiveDroppedBufferCount>
		droppedToKeyframeCount = droppedToKeyframeCount + decodercounters.droppedToKeyframeCount;
	//   56  106:aload_0         
	//   57  107:aload_0         
	//   58  108:getfield        #46  <Field int droppedToKeyframeCount>
	//   59  111:aload_1         
	//   60  112:getfield        #46  <Field int droppedToKeyframeCount>
	//   61  115:iadd            
	//   62  116:putfield        #46  <Field int droppedToKeyframeCount>
	//   63  119:return          
	}

	public int decoderInitCount;
	public int decoderReleaseCount;
	public int droppedBufferCount;
	public int droppedToKeyframeCount;
	public int inputBufferCount;
	public int maxConsecutiveDroppedBufferCount;
	public int renderedOutputBufferCount;
	public int skippedInputBufferCount;
	public int skippedOutputBufferCount;
}
