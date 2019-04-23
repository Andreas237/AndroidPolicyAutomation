// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			TrackOutput, ExtractorInput

public class DummyTrackOutput
	implements TrackOutput
{

	public DummyTrackOutput()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void format(MediaFormat mediaformat)
	{
	//    0    0:return          
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		return extractorinput.skip(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #25  <Method int ExtractorInput.skip(int)>
	//    3    7:ireturn         
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.skipBytes(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #33  <Method void ParsableByteArray.skipBytes(int)>
	//    3    5:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, byte abyte0[])
	{
	//    0    0:return          
	}
}
