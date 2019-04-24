// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			OggSeeker, StreamReader

private static final class StreamReader$UnseekableOggSeeker
	implements OggSeeker
{

	public SeekMap createSeekMap()
	{
		return ((SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L)));
	//    0    0:new             #20  <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    1    3:dup             
	//    2    4:ldc2w           #21  <Long 0x1L>
	//    3    7:invokespecial   #25  <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    4   10:areturn         
	}

	public long read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return -1L;
	//    0    0:ldc2w           #32  <Long -1L>
	//    1    3:lreturn         
	}

	public long startSeek(long l)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	private StreamReader$UnseekableOggSeeker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	StreamReader$UnseekableOggSeeker(StreamReader._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void StreamReader$UnseekableOggSeeker()>
	//    2    4:return          
	}
}
