// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleStream

public final class EmptySampleStream
	implements SampleStream
{

	public EmptySampleStream()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
	//    0    0:return          
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		decoderinputbuffer.setFlags(4);
	//    0    0:aload_2         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #25  <Method void DecoderInputBuffer.setFlags(int)>
		return -4;
	//    3    5:bipush          -4
	//    4    7:ireturn         
	}

	public int skipData(long l)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
