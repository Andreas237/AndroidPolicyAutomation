// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//			Chunk

public final class ChunkOperationHolder
{

	public ChunkOperationHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public void clear()
	{
		queueSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field int queueSize>
		chunk = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field Chunk chunk>
		endOfStream = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #22  <Field boolean endOfStream>
	//    9   15:return          
	}

	public Chunk chunk;
	public boolean endOfStream;
	public int queueSize;
}
