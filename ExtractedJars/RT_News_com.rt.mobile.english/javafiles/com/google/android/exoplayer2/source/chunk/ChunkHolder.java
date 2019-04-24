// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;


// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			Chunk

public final class ChunkHolder
{

	public ChunkHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void clear()
	{
		chunk = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #16  <Field Chunk chunk>
		endOfStream = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #18  <Field boolean endOfStream>
	//    6   10:return          
	}

	public Chunk chunk;
	public boolean endOfStream;
}
