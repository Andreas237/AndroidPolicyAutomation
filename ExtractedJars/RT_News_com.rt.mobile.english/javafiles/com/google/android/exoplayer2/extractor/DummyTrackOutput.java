// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			TrackOutput, ExtractorInput

public final class DummyTrackOutput
	implements TrackOutput
{

	public DummyTrackOutput()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void format(Format format1)
	{
	//    0    0:return          
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		i = extractorinput.skip(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #25  <Method int ExtractorInput.skip(int)>
	//    3    7:istore_2        
		if(i == -1)
	//*   4    8:iload_2         
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          27
		{
			if(flag)
	//*   7   13:iload_3         
	//*   8   14:ifeq            19
				return -1;
	//    9   17:iconst_m1       
	//   10   18:ireturn         
			else
				throw new EOFException();
	//   11   19:new             #27  <Class EOFException>
	//   12   22:dup             
	//   13   23:invokespecial   #28  <Method void EOFException()>
	//   14   26:athrow          
		} else
		{
			return i;
	//   15   27:iload_2         
	//   16   28:ireturn         
		}
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.skipBytes(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #36  <Method void ParsableByteArray.skipBytes(int)>
	//    3    5:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, TrackOutput.CryptoData cryptodata)
	{
	//    0    0:return          
	}
}
