// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			DefaultSampleValues, TrackEncryptionBox

final class TrackFragment
{

	TrackFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public void fillEncryptionData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.readFully(sampleEncryptionData.data, 0, sampleEncryptionDataLength);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field ParsableByteArray sampleEncryptionData>
	//    3    5:getfield        #51  <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field int sampleEncryptionDataLength>
	//    7   13:invokeinterface #59  <Method void ExtractorInput.readFully(byte[], int, int)>
		sampleEncryptionData.setPosition(0);
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field ParsableByteArray sampleEncryptionData>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #63  <Method void ParsableByteArray.setPosition(int)>
		sampleEncryptionDataNeedsFill = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #65  <Field boolean sampleEncryptionDataNeedsFill>
	//   15   31:return          
	}

	public void fillEncryptionData(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.readBytes(sampleEncryptionData.data, 0, sampleEncryptionDataLength);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field ParsableByteArray sampleEncryptionData>
	//    3    5:getfield        #51  <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field int sampleEncryptionDataLength>
	//    7   13:invokevirtual   #70  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		sampleEncryptionData.setPosition(0);
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field ParsableByteArray sampleEncryptionData>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #63  <Method void ParsableByteArray.setPosition(int)>
		sampleEncryptionDataNeedsFill = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #65  <Field boolean sampleEncryptionDataNeedsFill>
	//   15   29:return          
	}

	public long getSamplePresentationTime(int i)
	{
		return sampleDecodingTimeTable[i] + (long)sampleCompositionTimeOffsetTable[i];
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field long[] sampleDecodingTimeTable>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:aload_0         
	//    5    7:getfield        #76  <Field int[] sampleCompositionTimeOffsetTable>
	//    6   10:iload_1         
	//    7   11:iaload          
	//    8   12:i2l             
	//    9   13:ladd            
	//   10   14:lreturn         
	}

	public void initEncryptionData(int i)
	{
		if(sampleEncryptionData == null || sampleEncryptionData.limit() < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ParsableByteArray sampleEncryptionData>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field ParsableByteArray sampleEncryptionData>
	//*   5   11:invokevirtual   #81  <Method int ParsableByteArray.limit()>
	//*   6   14:iload_1         
	//*   7   15:icmpge          30
			sampleEncryptionData = new ParsableByteArray(i);
	//    8   18:aload_0         
	//    9   19:new             #47  <Class ParsableByteArray>
	//   10   22:dup             
	//   11   23:iload_1         
	//   12   24:invokespecial   #83  <Method void ParsableByteArray(int)>
	//   13   27:putfield        #45  <Field ParsableByteArray sampleEncryptionData>
		sampleEncryptionDataLength = i;
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:putfield        #53  <Field int sampleEncryptionDataLength>
		definesEncryptionData = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #85  <Field boolean definesEncryptionData>
		sampleEncryptionDataNeedsFill = true;
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:putfield        #65  <Field boolean sampleEncryptionDataNeedsFill>
	//   23   45:return          
	}

	public void initTables(int i, int j)
	{
		trunCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int trunCount>
		sampleCount = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #91  <Field int sampleCount>
		if(trunLength == null || trunLength.length < i)
	//*   6   10:aload_0         
	//*   7   11:getfield        #93  <Field int[] trunLength>
	//*   8   14:ifnull          26
	//*   9   17:aload_0         
	//*  10   18:getfield        #93  <Field int[] trunLength>
	//*  11   21:arraylength     
	//*  12   22:iload_1         
	//*  13   23:icmpge          40
		{
			trunDataPosition = new long[i];
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:newarray        long[]
	//   17   30:putfield        #95  <Field long[] trunDataPosition>
			trunLength = new int[i];
	//   18   33:aload_0         
	//   19   34:iload_1         
	//   20   35:newarray        int[]
	//   21   37:putfield        #93  <Field int[] trunLength>
		}
		if(sampleSizeTable == null || sampleSizeTable.length < j)
	//*  22   40:aload_0         
	//*  23   41:getfield        #97  <Field int[] sampleSizeTable>
	//*  24   44:ifnull          56
	//*  25   47:aload_0         
	//*  26   48:getfield        #97  <Field int[] sampleSizeTable>
	//*  27   51:arraylength     
	//*  28   52:iload_2         
	//*  29   53:icmpge          99
		{
			i = (j * 125) / 100;
	//   30   56:iload_2         
	//   31   57:bipush          125
	//   32   59:imul            
	//   33   60:bipush          100
	//   34   62:idiv            
	//   35   63:istore_1        
			sampleSizeTable = new int[i];
	//   36   64:aload_0         
	//   37   65:iload_1         
	//   38   66:newarray        int[]
	//   39   68:putfield        #97  <Field int[] sampleSizeTable>
			sampleCompositionTimeOffsetTable = new int[i];
	//   40   71:aload_0         
	//   41   72:iload_1         
	//   42   73:newarray        int[]
	//   43   75:putfield        #76  <Field int[] sampleCompositionTimeOffsetTable>
			sampleDecodingTimeTable = new long[i];
	//   44   78:aload_0         
	//   45   79:iload_1         
	//   46   80:newarray        long[]
	//   47   82:putfield        #74  <Field long[] sampleDecodingTimeTable>
			sampleIsSyncFrameTable = new boolean[i];
	//   48   85:aload_0         
	//   49   86:iload_1         
	//   50   87:newarray        boolean[]
	//   51   89:putfield        #99  <Field boolean[] sampleIsSyncFrameTable>
			sampleHasSubsampleEncryptionTable = new boolean[i];
	//   52   92:aload_0         
	//   53   93:iload_1         
	//   54   94:newarray        boolean[]
	//   55   96:putfield        #101 <Field boolean[] sampleHasSubsampleEncryptionTable>
		}
	//   56   99:return          
	}

	public void reset()
	{
		trunCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #89  <Field int trunCount>
		nextFragmentDecodeTime = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #104 <Field long nextFragmentDecodeTime>
		definesEncryptionData = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #85  <Field boolean definesEncryptionData>
		sampleEncryptionDataNeedsFill = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #65  <Field boolean sampleEncryptionDataNeedsFill>
		trackEncryptionBox = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #106 <Field TrackEncryptionBox trackEncryptionBox>
	//   15   25:return          
	}

	public long atomPosition;
	public long auxiliaryDataPosition;
	public long dataPosition;
	public boolean definesEncryptionData;
	public DefaultSampleValues header;
	public long nextFragmentDecodeTime;
	public int sampleCompositionTimeOffsetTable[];
	public int sampleCount;
	public long sampleDecodingTimeTable[];
	public ParsableByteArray sampleEncryptionData;
	public int sampleEncryptionDataLength;
	public boolean sampleEncryptionDataNeedsFill;
	public boolean sampleHasSubsampleEncryptionTable[];
	public boolean sampleIsSyncFrameTable[];
	public int sampleSizeTable[];
	public TrackEncryptionBox trackEncryptionBox;
	public int trunCount;
	public long trunDataPosition[];
	public int trunLength[];
}
