// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			DefaultSampleValues, TrackEncryptionBox

final class TrackFragment
{

	TrackFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public void fillEncryptionData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.readFully(sampleEncryptionData.data, 0, sampleEncryptionDataLength);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field ParsableByteArray sampleEncryptionData>
	//    3    5:getfield        #47  <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field int sampleEncryptionDataLength>
	//    7   13:invokeinterface #55  <Method void ExtractorInput.readFully(byte[], int, int)>
		sampleEncryptionData.setPosition(0);
	//    8   18:aload_0         
	//    9   19:getfield        #41  <Field ParsableByteArray sampleEncryptionData>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		sampleEncryptionDataNeedsFill = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #61  <Field boolean sampleEncryptionDataNeedsFill>
	//   15   31:return          
	}

	public void fillEncryptionData(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.readBytes(sampleEncryptionData.data, 0, sampleEncryptionDataLength);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field ParsableByteArray sampleEncryptionData>
	//    3    5:getfield        #47  <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field int sampleEncryptionDataLength>
	//    7   13:invokevirtual   #66  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		sampleEncryptionData.setPosition(0);
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field ParsableByteArray sampleEncryptionData>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		sampleEncryptionDataNeedsFill = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #61  <Field boolean sampleEncryptionDataNeedsFill>
	//   15   29:return          
	}

	public long getSamplePresentationTime(int i)
	{
		return sampleDecodingTimeTable[i] + (long)sampleCompositionTimeOffsetTable[i];
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long[] sampleDecodingTimeTable>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:aload_0         
	//    5    7:getfield        #72  <Field int[] sampleCompositionTimeOffsetTable>
	//    6   10:iload_1         
	//    7   11:iaload          
	//    8   12:i2l             
	//    9   13:ladd            
	//   10   14:lreturn         
	}

	public void initEncryptionData(int i)
	{
		ParsableByteArray parsablebytearray = sampleEncryptionData;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ParsableByteArray sampleEncryptionData>
	//    2    4:astore_2        
		if(parsablebytearray == null || parsablebytearray.limit() < i)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #77  <Method int ParsableByteArray.limit()>
	//*   7   13:iload_1         
	//*   8   14:icmpge          29
			sampleEncryptionData = new ParsableByteArray(i);
	//    9   17:aload_0         
	//   10   18:new             #43  <Class ParsableByteArray>
	//   11   21:dup             
	//   12   22:iload_1         
	//   13   23:invokespecial   #79  <Method void ParsableByteArray(int)>
	//   14   26:putfield        #41  <Field ParsableByteArray sampleEncryptionData>
		sampleEncryptionDataLength = i;
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:putfield        #49  <Field int sampleEncryptionDataLength>
		definesEncryptionData = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #81  <Field boolean definesEncryptionData>
		sampleEncryptionDataNeedsFill = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #61  <Field boolean sampleEncryptionDataNeedsFill>
	//   24   44:return          
	}

	public void initTables(int i)
	{
		length = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field int length>
		int ai[] = sampleSizeTable;
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field int[] sampleSizeTable>
	//    5    9:astore_2        
		if(ai == null || ai.length < length)
	//*   6   10:aload_2         
	//*   7   11:ifnull          23
	//*   8   14:aload_2         
	//*   9   15:arraylength     
	//*  10   16:aload_0         
	//*  11   17:getfield        #84  <Field int length>
	//*  12   20:icmpge          66
		{
			i = (i * 125) / 100;
	//   13   23:iload_1         
	//   14   24:bipush          125
	//   15   26:imul            
	//   16   27:bipush          100
	//   17   29:idiv            
	//   18   30:istore_1        
			sampleSizeTable = new int[i];
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:newarray        int[]
	//   22   35:putfield        #86  <Field int[] sampleSizeTable>
			sampleCompositionTimeOffsetTable = new int[i];
	//   23   38:aload_0         
	//   24   39:iload_1         
	//   25   40:newarray        int[]
	//   26   42:putfield        #72  <Field int[] sampleCompositionTimeOffsetTable>
			sampleDecodingTimeTable = new long[i];
	//   27   45:aload_0         
	//   28   46:iload_1         
	//   29   47:newarray        long[]
	//   30   49:putfield        #70  <Field long[] sampleDecodingTimeTable>
			sampleIsSyncFrameTable = new boolean[i];
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:newarray        boolean[]
	//   34   56:putfield        #88  <Field boolean[] sampleIsSyncFrameTable>
			sampleHasSubsampleEncryptionTable = new boolean[i];
	//   35   59:aload_0         
	//   36   60:iload_1         
	//   37   61:newarray        boolean[]
	//   38   63:putfield        #90  <Field boolean[] sampleHasSubsampleEncryptionTable>
		}
	//   39   66:return          
	}

	public void reset()
	{
		length = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #84  <Field int length>
		nextFragmentDecodeTime = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #93  <Field long nextFragmentDecodeTime>
		definesEncryptionData = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #81  <Field boolean definesEncryptionData>
		sampleEncryptionDataNeedsFill = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #61  <Field boolean sampleEncryptionDataNeedsFill>
		trackEncryptionBox = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #95  <Field TrackEncryptionBox trackEncryptionBox>
	//   15   25:return          
	}

	public long auxiliaryDataPosition;
	public long dataPosition;
	public boolean definesEncryptionData;
	public DefaultSampleValues header;
	public int length;
	public long nextFragmentDecodeTime;
	public int sampleCompositionTimeOffsetTable[];
	public long sampleDecodingTimeTable[];
	public ParsableByteArray sampleEncryptionData;
	public int sampleEncryptionDataLength;
	public boolean sampleEncryptionDataNeedsFill;
	public boolean sampleHasSubsampleEncryptionTable[];
	public boolean sampleIsSyncFrameTable[];
	public int sampleSizeTable[];
	public TrackEncryptionBox trackEncryptionBox;
}
