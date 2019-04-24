// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;


// Referenced classes of package com.google.android.exoplayer2.decoder:
//			Buffer

public abstract class OutputBuffer extends Buffer
{

	public OutputBuffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Buffer()>
	//    2    4:return          
	}

	public abstract void release();

	public int skippedOutputBufferCount;
	public long timeUs;
}
