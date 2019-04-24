// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			FragmentedMp4Extractor, TrackFragment, DefaultSampleValues, Track, 
//			TrackEncryptionBox

private static final class FragmentedMp4Extractor$TrackBundle
{

	private TrackEncryptionBox getEncryptionBox()
	{
		int i = fragment.header.sampleDescriptionIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field TrackFragment fragment>
	//    2    4:getfield        #56  <Field DefaultSampleValues TrackFragment.header>
	//    3    7:getfield        #61  <Field int DefaultSampleValues.sampleDescriptionIndex>
	//    4   10:istore_1        
		if(fragment.trackEncryptionBox != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #35  <Field TrackFragment fragment>
	//*   7   15:getfield        #65  <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//*   8   18:ifnull          29
			return fragment.trackEncryptionBox;
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field TrackFragment fragment>
	//   11   25:getfield        #65  <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//   12   28:areturn         
		else
			return track.getSampleDescriptionEncryptionBox(i);
	//   13   29:aload_0         
	//   14   30:getfield        #67  <Field Track track>
	//   15   33:iload_1         
	//   16   34:invokevirtual   #73  <Method TrackEncryptionBox Track.getSampleDescriptionEncryptionBox(int)>
	//   17   37:areturn         
	}

	private void skipSampleEncryptionData()
	{
		if(!fragment.definesEncryptionData)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field TrackFragment fragment>
	//*   2    4:getfield        #77  <Field boolean TrackFragment.definesEncryptionData>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		ParsableByteArray parsablebytearray = fragment.sampleEncryptionData;
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field TrackFragment fragment>
	//    7   15:getfield        #80  <Field ParsableByteArray TrackFragment.sampleEncryptionData>
	//    8   18:astore_1        
		TrackEncryptionBox trackencryptionbox = getEncryptionBox();
	//    9   19:aload_0         
	//   10   20:invokespecial   #82  <Method TrackEncryptionBox getEncryptionBox()>
	//   11   23:astore_2        
		if(trackencryptionbox.initializationVectorSize != 0)
	//*  12   24:aload_2         
	//*  13   25:getfield        #87  <Field int TrackEncryptionBox.initializationVectorSize>
	//*  14   28:ifeq            39
			parsablebytearray.skipBytes(trackencryptionbox.initializationVectorSize);
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:getfield        #87  <Field int TrackEncryptionBox.initializationVectorSize>
	//   18   36:invokevirtual   #90  <Method void ParsableByteArray.skipBytes(int)>
		if(fragment.sampleHasSubsampleEncryptionTable[currentSampleIndex])
	//*  19   39:aload_0         
	//*  20   40:getfield        #35  <Field TrackFragment fragment>
	//*  21   43:getfield        #94  <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//*  22   46:aload_0         
	//*  23   47:getfield        #96  <Field int currentSampleIndex>
	//*  24   50:baload          
	//*  25   51:ifeq            65
			parsablebytearray.skipBytes(6 * parsablebytearray.readUnsignedShort());
	//   26   54:aload_1         
	//   27   55:bipush          6
	//   28   57:aload_1         
	//   29   58:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//   30   61:imul            
	//   31   62:invokevirtual   #90  <Method void ParsableByteArray.skipBytes(int)>
	//   32   65:return          
	}

	public void init(Track track1, DefaultSampleValues defaultsamplevalues)
	{
		track = (Track)Assertions.checkNotNull(((Object) (track1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #108 <Method Object Assertions.checkNotNull(Object)>
	//    3    5:checkcast       #69  <Class Track>
	//    4    8:putfield        #67  <Field Track track>
		defaultSampleValues = (DefaultSampleValues)Assertions.checkNotNull(((Object) (defaultsamplevalues)));
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokestatic    #108 <Method Object Assertions.checkNotNull(Object)>
	//    8   16:checkcast       #58  <Class DefaultSampleValues>
	//    9   19:putfield        #110 <Field DefaultSampleValues defaultSampleValues>
		output.format(track1.format);
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field TrackOutput output>
	//   12   26:aload_1         
	//   13   27:getfield        #114 <Field Format Track.format>
	//   14   30:invokeinterface #119 <Method void TrackOutput.format(Format)>
		reset();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #122 <Method void reset()>
	//   17   39:return          
	}

	public boolean next()
	{
		currentSampleIndex = currentSampleIndex + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #96  <Field int currentSampleIndex>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #96  <Field int currentSampleIndex>
		currentSampleInTrackRun = currentSampleInTrackRun + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #126 <Field int currentSampleInTrackRun>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #126 <Field int currentSampleInTrackRun>
		if(currentSampleInTrackRun == fragment.trunLength[currentTrackRunIndex])
	//*  12   20:aload_0         
	//*  13   21:getfield        #126 <Field int currentSampleInTrackRun>
	//*  14   24:aload_0         
	//*  15   25:getfield        #35  <Field TrackFragment fragment>
	//*  16   28:getfield        #130 <Field int[] TrackFragment.trunLength>
	//*  17   31:aload_0         
	//*  18   32:getfield        #132 <Field int currentTrackRunIndex>
	//*  19   35:iaload          
	//*  20   36:icmpne          56
		{
			currentTrackRunIndex = currentTrackRunIndex + 1;
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #132 <Field int currentTrackRunIndex>
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:putfield        #132 <Field int currentTrackRunIndex>
			currentSampleInTrackRun = 0;
	//   27   49:aload_0         
	//   28   50:iconst_0        
	//   29   51:putfield        #126 <Field int currentSampleInTrackRun>
			return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
		} else
		{
			return true;
	//   32   56:iconst_1        
	//   33   57:ireturn         
		}
	}

	public int outputSampleEncryptionData()
	{
		if(!fragment.definesEncryptionData)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field TrackFragment fragment>
	//*   2    4:getfield        #77  <Field boolean TrackFragment.definesEncryptionData>
	//*   3    7:ifne            12
			return 0;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		TrackEncryptionBox trackencryptionbox = getEncryptionBox();
	//    6   12:aload_0         
	//    7   13:invokespecial   #82  <Method TrackEncryptionBox getEncryptionBox()>
	//    8   16:astore          5
		int i;
		ParsableByteArray parsablebytearray;
		if(trackencryptionbox.initializationVectorSize != 0)
	//*   9   18:aload           5
	//*  10   20:getfield        #87  <Field int TrackEncryptionBox.initializationVectorSize>
	//*  11   23:ifeq            44
		{
			parsablebytearray = fragment.sampleEncryptionData;
	//   12   26:aload_0         
	//   13   27:getfield        #35  <Field TrackFragment fragment>
	//   14   30:getfield        #80  <Field ParsableByteArray TrackFragment.sampleEncryptionData>
	//   15   33:astore          4
			i = trackencryptionbox.initializationVectorSize;
	//   16   35:aload           5
	//   17   37:getfield        #87  <Field int TrackEncryptionBox.initializationVectorSize>
	//   18   40:istore_1        
		} else
	//*  19   41:goto            73
		{
			byte abyte0[] = trackencryptionbox.defaultInitializationVector;
	//   20   44:aload           5
	//   21   46:getfield        #136 <Field byte[] TrackEncryptionBox.defaultInitializationVector>
	//   22   49:astore          5
			defaultInitializationVector.reset(abyte0, abyte0.length);
	//   23   51:aload_0         
	//   24   52:getfield        #45  <Field ParsableByteArray defaultInitializationVector>
	//   25   55:aload           5
	//   26   57:aload           5
	//   27   59:arraylength     
	//   28   60:invokevirtual   #139 <Method void ParsableByteArray.reset(byte[], int)>
			parsablebytearray = defaultInitializationVector;
	//   29   63:aload_0         
	//   30   64:getfield        #45  <Field ParsableByteArray defaultInitializationVector>
	//   31   67:astore          4
			i = abyte0.length;
	//   32   69:aload           5
	//   33   71:arraylength     
	//   34   72:istore_1        
		}
		boolean flag = fragment.sampleHasSubsampleEncryptionTable[currentSampleIndex];
	//   35   73:aload_0         
	//   36   74:getfield        #35  <Field TrackFragment fragment>
	//   37   77:getfield        #94  <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   38   80:aload_0         
	//   39   81:getfield        #96  <Field int currentSampleIndex>
	//   40   84:baload          
	//   41   85:istore_3        
		byte abyte1[] = encryptionSignalByte.data;
	//   42   86:aload_0         
	//   43   87:getfield        #42  <Field ParsableByteArray encryptionSignalByte>
	//   44   90:getfield        #142 <Field byte[] ParsableByteArray.data>
	//   45   93:astore          5
		char c;
		if(flag)
	//*  46   95:iload_3         
	//*  47   96:ifeq            106
			c = '\200';
	//   48   99:sipush          128
	//   49  102:istore_2        
		else
	//*  50  103:goto            108
			c = '\0';
	//   51  106:iconst_0        
	//   52  107:istore_2        
		abyte1[0] = (byte)(c | i);
	//   53  108:aload           5
	//   54  110:iconst_0        
	//   55  111:iload_2         
	//   56  112:iload_1         
	//   57  113:ior             
	//   58  114:int2byte        
	//   59  115:bastore         
		encryptionSignalByte.setPosition(0);
	//   60  116:aload_0         
	//   61  117:getfield        #42  <Field ParsableByteArray encryptionSignalByte>
	//   62  120:iconst_0        
	//   63  121:invokevirtual   #145 <Method void ParsableByteArray.setPosition(int)>
		output.sampleData(encryptionSignalByte, 1);
	//   64  124:aload_0         
	//   65  125:getfield        #30  <Field TrackOutput output>
	//   66  128:aload_0         
	//   67  129:getfield        #42  <Field ParsableByteArray encryptionSignalByte>
	//   68  132:iconst_1        
	//   69  133:invokeinterface #149 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		output.sampleData(parsablebytearray, i);
	//   70  138:aload_0         
	//   71  139:getfield        #30  <Field TrackOutput output>
	//   72  142:aload           4
	//   73  144:iload_1         
	//   74  145:invokeinterface #149 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		if(!flag)
	//*  75  150:iload_3         
	//*  76  151:ifne            158
		{
			return 1 + i;
	//   77  154:iconst_1        
	//   78  155:iload_1         
	//   79  156:iadd            
	//   80  157:ireturn         
		} else
		{
			ParsableByteArray parsablebytearray1 = fragment.sampleEncryptionData;
	//   81  158:aload_0         
	//   82  159:getfield        #35  <Field TrackFragment fragment>
	//   83  162:getfield        #80  <Field ParsableByteArray TrackFragment.sampleEncryptionData>
	//   84  165:astore          4
			int j = parsablebytearray1.readUnsignedShort();
	//   85  167:aload           4
	//   86  169:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//   87  172:istore_2        
			parsablebytearray1.skipBytes(-2);
	//   88  173:aload           4
	//   89  175:bipush          -2
	//   90  177:invokevirtual   #90  <Method void ParsableByteArray.skipBytes(int)>
			j = 2 + 6 * j;
	//   91  180:iconst_2        
	//   92  181:bipush          6
	//   93  183:iload_2         
	//   94  184:imul            
	//   95  185:iadd            
	//   96  186:istore_2        
			output.sampleData(parsablebytearray1, j);
	//   97  187:aload_0         
	//   98  188:getfield        #30  <Field TrackOutput output>
	//   99  191:aload           4
	//  100  193:iload_2         
	//  101  194:invokeinterface #149 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			return 1 + i + j;
	//  102  199:iconst_1        
	//  103  200:iload_1         
	//  104  201:iadd            
	//  105  202:iload_2         
	//  106  203:iadd            
	//  107  204:ireturn         
		}
	}

	public void reset()
	{
		fragment.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field TrackFragment fragment>
	//    2    4:invokevirtual   #150 <Method void TrackFragment.reset()>
		currentSampleIndex = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #96  <Field int currentSampleIndex>
		currentTrackRunIndex = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #132 <Field int currentTrackRunIndex>
		currentSampleInTrackRun = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #126 <Field int currentSampleInTrackRun>
		firstSampleToOutputIndex = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #152 <Field int firstSampleToOutputIndex>
	//   15   27:return          
	}

	public void seek(long l)
	{
		l = C.usToMs(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #160 <Method long C.usToMs(long)>
	//    2    4:lstore_1        
		for(int i = currentSampleIndex; i < fragment.sampleCount && fragment.getSamplePresentationTime(i) < l; i++)
	//*   3    5:aload_0         
	//*   4    6:getfield        #96  <Field int currentSampleIndex>
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:aload_0         
	//*   8   12:getfield        #35  <Field TrackFragment fragment>
	//*   9   15:getfield        #163 <Field int TrackFragment.sampleCount>
	//*  10   18:icmpge          58
	//*  11   21:aload_0         
	//*  12   22:getfield        #35  <Field TrackFragment fragment>
	//*  13   25:iload_3         
	//*  14   26:invokevirtual   #167 <Method long TrackFragment.getSamplePresentationTime(int)>
	//*  15   29:lload_1         
	//*  16   30:lcmp            
	//*  17   31:ifge            58
			if(fragment.sampleIsSyncFrameTable[i])
	//*  18   34:aload_0         
	//*  19   35:getfield        #35  <Field TrackFragment fragment>
	//*  20   38:getfield        #170 <Field boolean[] TrackFragment.sampleIsSyncFrameTable>
	//*  21   41:iload_3         
	//*  22   42:baload          
	//*  23   43:ifeq            51
				firstSampleToOutputIndex = i;
	//   24   46:aload_0         
	//   25   47:iload_3         
	//   26   48:putfield        #152 <Field int firstSampleToOutputIndex>

	//   27   51:iload_3         
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore_3        
	//*  31   55:goto            10
	//   32   58:return          
	}

	public void updateDrmInitData(DrmInitData drminitdata)
	{
		Object obj = ((Object) (track.getSampleDescriptionEncryptionBox(fragment.header.sampleDescriptionIndex)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Track track>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field TrackFragment fragment>
	//    4    8:getfield        #56  <Field DefaultSampleValues TrackFragment.header>
	//    5   11:getfield        #61  <Field int DefaultSampleValues.sampleDescriptionIndex>
	//    6   14:invokevirtual   #73  <Method TrackEncryptionBox Track.getSampleDescriptionEncryptionBox(int)>
	//    7   17:astore_2        
		if(obj != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          30
			obj = ((Object) (((TrackEncryptionBox) (obj)).schemeType));
	//   10   22:aload_2         
	//   11   23:getfield        #176 <Field String TrackEncryptionBox.schemeType>
	//   12   26:astore_2        
		else
	//*  13   27:goto            32
			obj = null;
	//   14   30:aconst_null     
	//   15   31:astore_2        
		output.format(track.format.copyWithDrmInitData(drminitdata.copyWithSchemeType(((String) (obj)))));
	//   16   32:aload_0         
	//   17   33:getfield        #30  <Field TrackOutput output>
	//   18   36:aload_0         
	//   19   37:getfield        #67  <Field Track track>
	//   20   40:getfield        #114 <Field Format Track.format>
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokevirtual   #182 <Method DrmInitData DrmInitData.copyWithSchemeType(String)>
	//   24   48:invokevirtual   #188 <Method Format Format.copyWithDrmInitData(DrmInitData)>
	//   25   51:invokeinterface #119 <Method void TrackOutput.format(Format)>
	//   26   56:return          
	}

	public int currentSampleInTrackRun;
	public int currentSampleIndex;
	public int currentTrackRunIndex;
	private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();
	public DefaultSampleValues defaultSampleValues;
	private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
	public int firstSampleToOutputIndex;
	public final TrackFragment fragment = new TrackFragment();
	public final TrackOutput output;
	public Track track;


/*
	static void access$000(FragmentedMp4Extractor$TrackBundle fragmentedmp4extractor$trackbundle)
	{
		fragmentedmp4extractor$trackbundle.skipSampleEncryptionData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void skipSampleEncryptionData()>
		return;
	//    2    4:return          
	}

*/

	public FragmentedMp4Extractor$TrackBundle(TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		output = trackoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field TrackOutput output>
	//    5    9:aload_0         
	//    6   10:new             #32  <Class TrackFragment>
	//    7   13:dup             
	//    8   14:invokespecial   #33  <Method void TrackFragment()>
	//    9   17:putfield        #35  <Field TrackFragment fragment>
	//   10   20:aload_0         
	//   11   21:new             #37  <Class ParsableByteArray>
	//   12   24:dup             
	//   13   25:iconst_1        
	//   14   26:invokespecial   #40  <Method void ParsableByteArray(int)>
	//   15   29:putfield        #42  <Field ParsableByteArray encryptionSignalByte>
	//   16   32:aload_0         
	//   17   33:new             #37  <Class ParsableByteArray>
	//   18   36:dup             
	//   19   37:invokespecial   #43  <Method void ParsableByteArray()>
	//   20   40:putfield        #45  <Field ParsableByteArray defaultInitializationVector>
	//   21   43:return          
	}
}
