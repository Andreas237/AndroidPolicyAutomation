// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//			ParsableByteArray, FlacStreamInfo

public final class FlacUtil
{

	private FlacUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static long extractSampleTimestamp(FlacStreamInfo flacstreaminfo, ParsableByteArray parsablebytearray)
	{
		parsablebytearray.skipBytes(4);
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #20  <Method void ParsableByteArray.skipBytes(int)>
		long l1 = parsablebytearray.readUTF8EncodedLong();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method long ParsableByteArray.readUTF8EncodedLong()>
	//    5    9:lstore          4
		long l = l1;
	//    6   11:lload           4
	//    7   13:lstore_2        
		if(flacstreaminfo.minBlockSize == flacstreaminfo.maxBlockSize)
	//*   8   14:aload_0         
	//*   9   15:getfield        #29  <Field int FlacStreamInfo.minBlockSize>
	//*  10   18:aload_0         
	//*  11   19:getfield        #32  <Field int FlacStreamInfo.maxBlockSize>
	//*  12   22:icmpne          34
			l = l1 * (long)flacstreaminfo.minBlockSize;
	//   13   25:lload           4
	//   14   27:aload_0         
	//   15   28:getfield        #29  <Field int FlacStreamInfo.minBlockSize>
	//   16   31:i2l             
	//   17   32:lmul            
	//   18   33:lstore_2        
		return (l * 0xf4240L) / (long)flacstreaminfo.sampleRate;
	//   19   34:lload_2         
	//   20   35:ldc2w           #33  <Long 0xf4240L>
	//   21   38:lmul            
	//   22   39:aload_0         
	//   23   40:getfield        #37  <Field int FlacStreamInfo.sampleRate>
	//   24   43:i2l             
	//   25   44:ldiv            
	//   26   45:lreturn         
	}

	private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
}
