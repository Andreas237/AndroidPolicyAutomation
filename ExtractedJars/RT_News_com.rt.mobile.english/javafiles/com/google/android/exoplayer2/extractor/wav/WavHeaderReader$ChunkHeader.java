// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.wav:
//			WavHeaderReader

private static final class WavHeaderReader$ChunkHeader
{

	public static WavHeaderReader$ChunkHeader peek(ExtractorInput extractorinput, ParsableByteArray parsablebytearray)
		throws IOException, InterruptedException
	{
		extractorinput.peekFully(parsablebytearray.data, 0, 8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #35  <Field byte[] ParsableByteArray.data>
	//    3    5:iconst_0        
	//    4    6:bipush          8
	//    5    8:invokeinterface #41  <Method void ExtractorInput.peekFully(byte[], int, int)>
		parsablebytearray.setPosition(0);
	//    6   13:aload_1         
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #45  <Method void ParsableByteArray.setPosition(int)>
		return new WavHeaderReader$ChunkHeader(parsablebytearray.readInt(), parsablebytearray.readLittleEndianUnsignedInt());
	//    9   18:new             #2   <Class WavHeaderReader$ChunkHeader>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:invokevirtual   #49  <Method int ParsableByteArray.readInt()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #53  <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   15   30:invokespecial   #55  <Method void WavHeaderReader$ChunkHeader(int, long)>
	//   16   33:areturn         
	}

	public static final int SIZE_IN_BYTES = 8;
	public final int id;
	public final long size;

	private WavHeaderReader$ChunkHeader(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int id>
		size = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #22  <Field long size>
	//    8   14:return          
	}
}
