// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import android.util.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			DefaultSampleValues, Atom, PsshAtomUtil, TrackFragment, 
//			AtomParsers, Track, TrackEncryptionBox, Sniffer

public final class FragmentedMp4Extractor
	implements Extractor
{
	public static interface Flags
		extends Annotation
	{
	}

	private static final class MetadataSampleInfo
	{

		public final long presentationTimeDeltaUs;
		public final int size;

		public MetadataSampleInfo(long l, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			presentationTimeDeltaUs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #18  <Field long presentationTimeDeltaUs>
			size = i;
		//    5    9:aload_0         
		//    6   10:iload_3         
		//    7   11:putfield        #20  <Field int size>
		//    8   14:return          
		}
	}

	private static final class TrackBundle
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
		static void access$000(TrackBundle trackbundle)
		{
			trackbundle.skipSampleEncryptionData();
		//    0    0:aload_0         
		//    1    1:invokespecial   #51  <Method void skipSampleEncryptionData()>
			return;
		//    2    4:return          
		}

*/

		public TrackBundle(TrackOutput trackoutput)
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


	public FragmentedMp4Extractor()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #146 <Method void FragmentedMp4Extractor(int)>
	//    3    5:return          
	}

	public FragmentedMp4Extractor(int i)
	{
		this(i, ((TimestampAdjuster) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #149 <Method void FragmentedMp4Extractor(int, TimestampAdjuster)>
	//    4    6:return          
	}

	public FragmentedMp4Extractor(int i, TimestampAdjuster timestampadjuster)
	{
		this(i, timestampadjuster, ((Track) (null)), ((DrmInitData) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #152 <Method void FragmentedMp4Extractor(int, TimestampAdjuster, Track, DrmInitData)>
	//    6    8:return          
	}

	public FragmentedMp4Extractor(int i, TimestampAdjuster timestampadjuster, Track track, DrmInitData drminitdata)
	{
		this(i, timestampadjuster, track, drminitdata, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #159 <Method List Collections.emptyList()>
	//    6    9:invokespecial   #162 <Method void FragmentedMp4Extractor(int, TimestampAdjuster, Track, DrmInitData, List)>
	//    7   12:return          
	}

	public FragmentedMp4Extractor(int i, TimestampAdjuster timestampadjuster, Track track, DrmInitData drminitdata, List list)
	{
		this(i, timestampadjuster, track, drminitdata, list, ((TrackOutput) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #165 <Method void FragmentedMp4Extractor(int, TimestampAdjuster, Track, DrmInitData, List, TrackOutput)>
	//    8   12:return          
	}

	public FragmentedMp4Extractor(int i, TimestampAdjuster timestampadjuster, Track track, DrmInitData drminitdata, List list, TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #168 <Method void Object()>
		byte byte0;
		if(track != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          15
			byte0 = 8;
	//    4    8:bipush          8
	//    5   10:istore          7
		else
	//*   6   12:goto            18
			byte0 = 0;
	//    7   15:iconst_0        
	//    8   16:istore          7
		flags = i | byte0;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:iload           7
	//   12   22:ior             
	//   13   23:putfield        #170 <Field int flags>
		timestampAdjuster = timestampadjuster;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #172 <Field TimestampAdjuster timestampAdjuster>
		sideloadedTrack = track;
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:putfield        #174 <Field Track sideloadedTrack>
		sideloadedDrmInitData = drminitdata;
	//   20   36:aload_0         
	//   21   37:aload           4
	//   22   39:putfield        #176 <Field DrmInitData sideloadedDrmInitData>
		closedCaptionFormats = Collections.unmodifiableList(list);
	//   23   42:aload_0         
	//   24   43:aload           5
	//   25   45:invokestatic    #180 <Method List Collections.unmodifiableList(List)>
	//   26   48:putfield        #182 <Field List closedCaptionFormats>
		additionalEmsgTrackOutput = trackoutput;
	//   27   51:aload_0         
	//   28   52:aload           6
	//   29   54:putfield        #184 <Field TrackOutput additionalEmsgTrackOutput>
		atomHeader = new ParsableByteArray(16);
	//   30   57:aload_0         
	//   31   58:new             #186 <Class ParsableByteArray>
	//   32   61:dup             
	//   33   62:bipush          16
	//   34   64:invokespecial   #187 <Method void ParsableByteArray(int)>
	//   35   67:putfield        #189 <Field ParsableByteArray atomHeader>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//   36   70:aload_0         
	//   37   71:new             #186 <Class ParsableByteArray>
	//   38   74:dup             
	//   39   75:getstatic       #194 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   40   78:invokespecial   #197 <Method void ParsableByteArray(byte[])>
	//   41   81:putfield        #199 <Field ParsableByteArray nalStartCode>
		nalPrefix = new ParsableByteArray(5);
	//   42   84:aload_0         
	//   43   85:new             #186 <Class ParsableByteArray>
	//   44   88:dup             
	//   45   89:iconst_5        
	//   46   90:invokespecial   #187 <Method void ParsableByteArray(int)>
	//   47   93:putfield        #201 <Field ParsableByteArray nalPrefix>
		nalBuffer = new ParsableByteArray();
	//   48   96:aload_0         
	//   49   97:new             #186 <Class ParsableByteArray>
	//   50  100:dup             
	//   51  101:invokespecial   #202 <Method void ParsableByteArray()>
	//   52  104:putfield        #204 <Field ParsableByteArray nalBuffer>
		extendedTypeScratch = new byte[16];
	//   53  107:aload_0         
	//   54  108:bipush          16
	//   55  110:newarray        byte[]
	//   56  112:putfield        #206 <Field byte[] extendedTypeScratch>
		containerAtoms = new ArrayDeque();
	//   57  115:aload_0         
	//   58  116:new             #208 <Class ArrayDeque>
	//   59  119:dup             
	//   60  120:invokespecial   #209 <Method void ArrayDeque()>
	//   61  123:putfield        #211 <Field ArrayDeque containerAtoms>
		pendingMetadataSampleInfos = new ArrayDeque();
	//   62  126:aload_0         
	//   63  127:new             #208 <Class ArrayDeque>
	//   64  130:dup             
	//   65  131:invokespecial   #209 <Method void ArrayDeque()>
	//   66  134:putfield        #213 <Field ArrayDeque pendingMetadataSampleInfos>
		trackBundles = new SparseArray();
	//   67  137:aload_0         
	//   68  138:new             #215 <Class SparseArray>
	//   69  141:dup             
	//   70  142:invokespecial   #216 <Method void SparseArray()>
	//   71  145:putfield        #218 <Field SparseArray trackBundles>
		durationUs = 0x1L;
	//   72  148:aload_0         
	//   73  149:ldc2w           #219 <Long 0x1L>
	//   74  152:putfield        #222 <Field long durationUs>
		pendingSeekTimeUs = 0x1L;
	//   75  155:aload_0         
	//   76  156:ldc2w           #219 <Long 0x1L>
	//   77  159:putfield        #224 <Field long pendingSeekTimeUs>
		segmentIndexEarliestPresentationTimeUs = 0x1L;
	//   78  162:aload_0         
	//   79  163:ldc2w           #219 <Long 0x1L>
	//   80  166:putfield        #226 <Field long segmentIndexEarliestPresentationTimeUs>
		enterReadingAtomHeaderState();
	//   81  169:aload_0         
	//   82  170:invokespecial   #229 <Method void enterReadingAtomHeaderState()>
	//   83  173:return          
	}

	private void enterReadingAtomHeaderState()
	{
		parserState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #232 <Field int parserState>
		atomHeaderBytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #234 <Field int atomHeaderBytesRead>
	//    6   10:return          
	}

	private DefaultSampleValues getDefaultSampleValues(SparseArray sparsearray, int i)
	{
		if(sparsearray.size() == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #240 <Method int SparseArray.size()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          17
			return (DefaultSampleValues)sparsearray.valueAt(0);
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//    7   13:checkcast       #246 <Class DefaultSampleValues>
	//    8   16:areturn         
		else
			return (DefaultSampleValues)Assertions.checkNotNull(sparsearray.get(i));
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #249 <Method Object SparseArray.get(int)>
	//   12   22:invokestatic    #255 <Method Object Assertions.checkNotNull(Object)>
	//   13   25:checkcast       #246 <Class DefaultSampleValues>
	//   14   28:areturn         
	}

	private static DrmInitData getDrmInitDataFromAtoms(List list)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #261 <Method int List.size()>
	//    2    6:istore_2        
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		Object obj;
		byte abyte0[];
		for(abyte0 = null; i < j; abyte0 = ((byte []) (obj)))
	//*   5    9:aconst_null     
	//*   6   10:astore          4
	//*   7   12:iload_1         
	//*   8   13:iload_2         
	//*   9   14:icmpge          122
		{
			Object obj1 = ((Object) ((Atom.LeafAtom)list.get(i)));
	//   10   17:aload_0         
	//   11   18:iload_1         
	//   12   19:invokeinterface #262 <Method Object List.get(int)>
	//   13   24:checkcast       #264 <Class Atom$LeafAtom>
	//   14   27:astore          5
			obj = ((Object) (abyte0));
	//   15   29:aload           4
	//   16   31:astore_3        
			if(((Atom.LeafAtom) (obj1)).type == Atom.TYPE_pssh)
	//*  17   32:aload           5
	//*  18   34:getfield        #267 <Field int Atom$LeafAtom.type>
	//*  19   37:getstatic       #272 <Field int Atom.TYPE_pssh>
	//*  20   40:icmpne          112
			{
				obj = ((Object) (abyte0));
	//   21   43:aload           4
	//   22   45:astore_3        
				if(abyte0 == null)
	//*  23   46:aload           4
	//*  24   48:ifnonnull       59
					obj = ((Object) (new ArrayList()));
	//   25   51:new             #274 <Class ArrayList>
	//   26   54:dup             
	//   27   55:invokespecial   #275 <Method void ArrayList()>
	//   28   58:astore_3        
				abyte0 = ((Atom.LeafAtom) (obj1)).data.data;
	//   29   59:aload           5
	//   30   61:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   31   64:getfield        #280 <Field byte[] ParsableByteArray.data>
	//   32   67:astore          4
				obj1 = ((Object) (PsshAtomUtil.parseUuid(abyte0)));
	//   33   69:aload           4
	//   34   71:invokestatic    #286 <Method java.util.UUID PsshAtomUtil.parseUuid(byte[])>
	//   35   74:astore          5
				if(obj1 == null)
	//*  36   76:aload           5
	//*  37   78:ifnonnull       93
					Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
	//   38   81:ldc1            #46  <String "FragmentedMp4Extractor">
	//   39   83:ldc2            #288 <String "Skipped pssh atom (failed to extract uuid)">
	//   40   86:invokestatic    #294 <Method int Log.w(String, String)>
	//   41   89:pop             
				else
	//*  42   90:goto            112
					((ArrayList) (obj)).add(((Object) (new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(((java.util.UUID) (obj1)), "video/mp4", abyte0))));
	//   43   93:aload_3         
	//   44   94:new             #296 <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//   45   97:dup             
	//   46   98:aload           5
	//   47  100:ldc2            #298 <String "video/mp4">
	//   48  103:aload           4
	//   49  105:invokespecial   #301 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(java.util.UUID, String, byte[])>
	//   50  108:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   51  111:pop             
			}
			i++;
	//   52  112:iload_1         
	//   53  113:iconst_1        
	//   54  114:iadd            
	//   55  115:istore_1        
		}

	//   56  116:aload_3         
	//   57  117:astore          4
	//*  58  119:goto            12
		if(abyte0 == null)
	//*  59  122:aload           4
	//*  60  124:ifnonnull       129
			return null;
	//   61  127:aconst_null     
	//   62  128:areturn         
		else
			return new DrmInitData(((List) (abyte0)));
	//   63  129:new             #307 <Class DrmInitData>
	//   64  132:dup             
	//   65  133:aload           4
	//   66  135:invokespecial   #310 <Method void DrmInitData(List)>
	//   67  138:areturn         
	}

	private static TrackBundle getNextFragmentRun(SparseArray sparsearray)
	{
		int j = sparsearray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method int SparseArray.size()>
	//    2    4:istore_2        
		TrackBundle trackbundle = null;
	//    3    5:aconst_null     
	//    4    6:astore          9
		long l = 0xffffffffL;
	//    5    8:ldc2w           #133 <Long 0xffffffffL>
	//    6   11:lstore_3        
		for(int i = 0; i < j;)
	//*   7   12:iconst_0        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:iload_2         
	//*  11   16:icmpge          95
		{
			TrackBundle trackbundle1 = (TrackBundle)sparsearray.valueAt(i);
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//   15   24:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   16   27:astore          10
			long l1;
			if(trackbundle1.currentTrackRunIndex == trackbundle1.fragment.trunCount)
	//*  17   29:aload           10
	//*  18   31:getfield        #316 <Field int FragmentedMp4Extractor$TrackBundle.currentTrackRunIndex>
	//*  19   34:aload           10
	//*  20   36:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//*  21   39:getfield        #325 <Field int TrackFragment.trunCount>
	//*  22   42:icmpne          51
			{
				l1 = l;
	//   23   45:lload_3         
	//   24   46:lstore          5
			} else
	//*  25   48:goto            85
			{
				long l2 = trackbundle1.fragment.trunDataPosition[trackbundle1.currentTrackRunIndex];
	//   26   51:aload           10
	//   27   53:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   28   56:getfield        #329 <Field long[] TrackFragment.trunDataPosition>
	//   29   59:aload           10
	//   30   61:getfield        #316 <Field int FragmentedMp4Extractor$TrackBundle.currentTrackRunIndex>
	//   31   64:laload          
	//   32   65:lstore          7
				l1 = l;
	//   33   67:lload_3         
	//   34   68:lstore          5
				if(l2 < l)
	//*  35   70:lload           7
	//*  36   72:lload_3         
	//*  37   73:lcmp            
	//*  38   74:ifge            85
				{
					trackbundle = trackbundle1;
	//   39   77:aload           10
	//   40   79:astore          9
					l1 = l2;
	//   41   81:lload           7
	//   42   83:lstore          5
				}
			}
			i++;
	//   43   85:iload_1         
	//   44   86:iconst_1        
	//   45   87:iadd            
	//   46   88:istore_1        
			l = l1;
	//   47   89:lload           5
	//   48   91:lstore_3        
		}

	//*  49   92:goto            14
		return trackbundle;
	//   50   95:aload           9
	//   51   97:areturn         
	}

	private static TrackBundle getTrackBundle(SparseArray sparsearray, int i)
	{
		if(sparsearray.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #240 <Method int SparseArray.size()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          17
			return (TrackBundle)sparsearray.valueAt(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//    7   13:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//    8   16:areturn         
		else
			return (TrackBundle)sparsearray.get(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #249 <Method Object SparseArray.get(int)>
	//   12   22:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   13   25:areturn         
	}

	private void maybeInitExtraTracks()
	{
		TrackOutput atrackoutput[] = emsgTrackOutputs;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//    2    4:astore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(atrackoutput == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       134
		{
			emsgTrackOutputs = new TrackOutput[2];
	//    7   13:aload_0         
	//    8   14:iconst_2        
	//    9   15:anewarray       TrackOutput[]
	//   10   18:putfield        #337 <Field TrackOutput[] emsgTrackOutputs>
			int i;
			if(additionalEmsgTrackOutput != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #184 <Field TrackOutput additionalEmsgTrackOutput>
	//*  13   25:ifnull          43
			{
				emsgTrackOutputs[0] = additionalEmsgTrackOutput;
	//   14   28:aload_0         
	//   15   29:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   16   32:iconst_0        
	//   17   33:aload_0         
	//   18   34:getfield        #184 <Field TrackOutput additionalEmsgTrackOutput>
	//   19   37:aastore         
				i = 1;
	//   20   38:iconst_1        
	//   21   39:istore_1        
			} else
	//*  22   40:goto            45
			{
				i = 0;
	//   23   43:iconst_0        
	//   24   44:istore_1        
			}
			int l = i;
	//   25   45:iload_1         
	//   26   46:istore_2        
			if((flags & 4) != 0)
	//*  27   47:aload_0         
	//*  28   48:getfield        #170 <Field int flags>
	//*  29   51:iconst_4        
	//*  30   52:iand            
	//*  31   53:ifeq            83
			{
				emsgTrackOutputs[i] = extractorOutput.track(trackBundles.size(), 4);
	//   32   56:aload_0         
	//   33   57:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   34   60:iload_1         
	//   35   61:aload_0         
	//   36   62:getfield        #341 <Field ExtractorOutput extractorOutput>
	//   37   65:aload_0         
	//   38   66:getfield        #218 <Field SparseArray trackBundles>
	//   39   69:invokevirtual   #240 <Method int SparseArray.size()>
	//   40   72:iconst_4        
	//   41   73:invokeinterface #347 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   42   78:aastore         
				l = i + 1;
	//   43   79:iload_1         
	//   44   80:iconst_1        
	//   45   81:iadd            
	//   46   82:istore_2        
			}
			emsgTrackOutputs = (TrackOutput[])Arrays.copyOf(((Object []) (emsgTrackOutputs)), l);
	//   47   83:aload_0         
	//   48   84:aload_0         
	//   49   85:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   50   88:iload_2         
	//   51   89:invokestatic    #353 <Method Object[] Arrays.copyOf(Object[], int)>
	//   52   92:checkcast       #354 <Class TrackOutput[]>
	//   53   95:putfield        #337 <Field TrackOutput[] emsgTrackOutputs>
			TrackOutput atrackoutput1[] = emsgTrackOutputs;
	//   54   98:aload_0         
	//   55   99:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   56  102:astore          4
			l = atrackoutput1.length;
	//   57  104:aload           4
	//   58  106:arraylength     
	//   59  107:istore_2        
			for(int j = 0; j < l; j++)
	//*  60  108:iconst_0        
	//*  61  109:istore_1        
	//*  62  110:iload_1         
	//*  63  111:iload_2         
	//*  64  112:icmpge          134
				atrackoutput1[j].format(EMSG_FORMAT);
	//   65  115:aload           4
	//   66  117:iload_1         
	//   67  118:aaload          
	//   68  119:getstatic       #142 <Field Format EMSG_FORMAT>
	//   69  122:invokeinterface #358 <Method void TrackOutput.format(Format)>

	//   70  127:iload_1         
	//   71  128:iconst_1        
	//   72  129:iadd            
	//   73  130:istore_1        
		}
	//*  74  131:goto            110
		if(cea608TrackOutputs == null)
	//*  75  134:aload_0         
	//*  76  135:getfield        #360 <Field TrackOutput[] cea608TrackOutputs>
	//*  77  138:ifnonnull       226
		{
			cea608TrackOutputs = new TrackOutput[closedCaptionFormats.size()];
	//   78  141:aload_0         
	//   79  142:aload_0         
	//   80  143:getfield        #182 <Field List closedCaptionFormats>
	//   81  146:invokeinterface #261 <Method int List.size()>
	//   82  151:anewarray       TrackOutput[]
	//   83  154:putfield        #360 <Field TrackOutput[] cea608TrackOutputs>
			for(int k = ((int) (flag)); k < cea608TrackOutputs.length; k++)
	//*  84  157:iload_3         
	//*  85  158:istore_1        
	//*  86  159:iload_1         
	//*  87  160:aload_0         
	//*  88  161:getfield        #360 <Field TrackOutput[] cea608TrackOutputs>
	//*  89  164:arraylength     
	//*  90  165:icmpge          226
			{
				TrackOutput trackoutput = extractorOutput.track(trackBundles.size() + 1 + k, 3);
	//   91  168:aload_0         
	//   92  169:getfield        #341 <Field ExtractorOutput extractorOutput>
	//   93  172:aload_0         
	//   94  173:getfield        #218 <Field SparseArray trackBundles>
	//   95  176:invokevirtual   #240 <Method int SparseArray.size()>
	//   96  179:iconst_1        
	//   97  180:iadd            
	//   98  181:iload_1         
	//   99  182:iadd            
	//  100  183:iconst_3        
	//  101  184:invokeinterface #347 <Method TrackOutput ExtractorOutput.track(int, int)>
	//  102  189:astore          4
				trackoutput.format((Format)closedCaptionFormats.get(k));
	//  103  191:aload           4
	//  104  193:aload_0         
	//  105  194:getfield        #182 <Field List closedCaptionFormats>
	//  106  197:iload_1         
	//  107  198:invokeinterface #262 <Method Object List.get(int)>
	//  108  203:checkcast       #136 <Class Format>
	//  109  206:invokeinterface #358 <Method void TrackOutput.format(Format)>
				cea608TrackOutputs[k] = trackoutput;
	//  110  211:aload_0         
	//  111  212:getfield        #360 <Field TrackOutput[] cea608TrackOutputs>
	//  112  215:iload_1         
	//  113  216:aload           4
	//  114  218:aastore         
			}

	//  115  219:iload_1         
	//  116  220:iconst_1        
	//  117  221:iadd            
	//  118  222:istore_1        
		}
	//* 119  223:goto            159
	//  120  226:return          
	}

	private void onContainerAtomRead(Atom.ContainerAtom containeratom)
		throws ParserException
	{
		if(containeratom.type == Atom.TYPE_moov)
	//*   0    0:aload_1         
	//*   1    1:getfield        #367 <Field int Atom$ContainerAtom.type>
	//*   2    4:getstatic       #370 <Field int Atom.TYPE_moov>
	//*   3    7:icmpne          16
		{
			onMoovContainerAtomRead(containeratom);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #373 <Method void onMoovContainerAtomRead(Atom$ContainerAtom)>
			return;
	//    7   15:return          
		}
		if(containeratom.type == Atom.TYPE_moof)
	//*   8   16:aload_1         
	//*   9   17:getfield        #367 <Field int Atom$ContainerAtom.type>
	//*  10   20:getstatic       #376 <Field int Atom.TYPE_moof>
	//*  11   23:icmpne          32
		{
			onMoofContainerAtomRead(containeratom);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #379 <Method void onMoofContainerAtomRead(Atom$ContainerAtom)>
			return;
	//   15   31:return          
		}
		if(!containerAtoms.isEmpty())
	//*  16   32:aload_0         
	//*  17   33:getfield        #211 <Field ArrayDeque containerAtoms>
	//*  18   36:invokevirtual   #383 <Method boolean ArrayDeque.isEmpty()>
	//*  19   39:ifne            56
			((Atom.ContainerAtom)containerAtoms.peek()).add(containeratom);
	//   20   42:aload_0         
	//   21   43:getfield        #211 <Field ArrayDeque containerAtoms>
	//   22   46:invokevirtual   #387 <Method Object ArrayDeque.peek()>
	//   23   49:checkcast       #366 <Class Atom$ContainerAtom>
	//   24   52:aload_1         
	//   25   53:invokevirtual   #389 <Method void Atom$ContainerAtom.add(Atom$ContainerAtom)>
	//   26   56:return          
	}

	private void onEmsgLeafAtomRead(ParsableByteArray parsablebytearray)
	{
		if(emsgTrackOutputs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//*   2    4:ifnull          186
		{
			if(emsgTrackOutputs.length == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//*   5   11:arraylength     
	//*   6   12:ifne            16
				return;
	//    7   15:return          
			parsablebytearray.setPosition(12);
	//    8   16:aload_1         
	//    9   17:bipush          12
	//   10   19:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
			int k = parsablebytearray.bytesLeft();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #398 <Method int ParsableByteArray.bytesLeft()>
	//   13   26:istore_3        
			parsablebytearray.readNullTerminatedString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #402 <Method String ParsableByteArray.readNullTerminatedString()>
	//   16   31:pop             
			parsablebytearray.readNullTerminatedString();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #402 <Method String ParsableByteArray.readNullTerminatedString()>
	//   19   36:pop             
			long l1 = parsablebytearray.readUnsignedInt();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   22   41:lstore          5
			l1 = Util.scaleLargeTimestamp(parsablebytearray.readUnsignedInt(), 0xf4240L, l1);
	//   23   43:aload_1         
	//   24   44:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   25   47:ldc2w           #407 <Long 0xf4240L>
	//   26   50:lload           5
	//   27   52:invokestatic    #412 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   28   55:lstore          5
			TrackOutput atrackoutput[] = emsgTrackOutputs;
	//   29   57:aload_0         
	//   30   58:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   31   61:astore          7
			int l = atrackoutput.length;
	//   32   63:aload           7
	//   33   65:arraylength     
	//   34   66:istore          4
			for(int i = 0; i < l; i++)
	//*  35   68:iconst_0        
	//*  36   69:istore_2        
	//*  37   70:iload_2         
	//*  38   71:iload           4
	//*  39   73:icmpge          104
			{
				TrackOutput trackoutput = atrackoutput[i];
	//   40   76:aload           7
	//   41   78:iload_2         
	//   42   79:aaload          
	//   43   80:astore          8
				parsablebytearray.setPosition(12);
	//   44   82:aload_1         
	//   45   83:bipush          12
	//   46   85:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
				trackoutput.sampleData(parsablebytearray, k);
	//   47   88:aload           8
	//   48   90:aload_1         
	//   49   91:iload_3         
	//   50   92:invokeinterface #416 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			}

	//   51   97:iload_2         
	//   52   98:iconst_1        
	//   53   99:iadd            
	//   54  100:istore_2        
	//*  55  101:goto            70
			if(segmentIndexEarliestPresentationTimeUs != 0x1L)
	//*  56  104:aload_0         
	//*  57  105:getfield        #226 <Field long segmentIndexEarliestPresentationTimeUs>
	//*  58  108:ldc2w           #219 <Long 0x1L>
	//*  59  111:lcmp            
	//*  60  112:ifeq            158
			{
				parsablebytearray = ((ParsableByteArray) (emsgTrackOutputs));
	//   61  115:aload_0         
	//   62  116:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   63  119:astore_1        
				int i1 = parsablebytearray.length;
	//   64  120:aload_1         
	//   65  121:arraylength     
	//   66  122:istore          4
				for(int j = 0; j < i1; j++)
	//*  67  124:iconst_0        
	//*  68  125:istore_2        
	//*  69  126:iload_2         
	//*  70  127:iload           4
	//*  71  129:icmpge          185
					((TrackOutput) (parsablebytearray[j])).sampleMetadata(segmentIndexEarliestPresentationTimeUs + l1, 1, k, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   72  132:aload_1         
	//   73  133:iload_2         
	//   74  134:aaload          
	//   75  135:aload_0         
	//   76  136:getfield        #226 <Field long segmentIndexEarliestPresentationTimeUs>
	//   77  139:lload           5
	//   78  141:ladd            
	//   79  142:iconst_1        
	//   80  143:iload_3         
	//   81  144:iconst_0        
	//   82  145:aconst_null     
	//   83  146:invokeinterface #420 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>

	//   84  151:iload_2         
	//   85  152:iconst_1        
	//   86  153:iadd            
	//   87  154:istore_2        
			} else
	//*  88  155:goto            126
			{
				pendingMetadataSampleInfos.addLast(((Object) (new MetadataSampleInfo(l1, k))));
	//   89  158:aload_0         
	//   90  159:getfield        #213 <Field ArrayDeque pendingMetadataSampleInfos>
	//   91  162:new             #13  <Class FragmentedMp4Extractor$MetadataSampleInfo>
	//   92  165:dup             
	//   93  166:lload           5
	//   94  168:iload_3         
	//   95  169:invokespecial   #423 <Method void FragmentedMp4Extractor$MetadataSampleInfo(long, int)>
	//   96  172:invokevirtual   #427 <Method void ArrayDeque.addLast(Object)>
				pendingMetadataSampleBytes = pendingMetadataSampleBytes + k;
	//   97  175:aload_0         
	//   98  176:aload_0         
	//   99  177:getfield        #429 <Field int pendingMetadataSampleBytes>
	//  100  180:iload_3         
	//  101  181:iadd            
	//  102  182:putfield        #429 <Field int pendingMetadataSampleBytes>
			}
			return;
	//  103  185:return          
		} else
		{
			return;
	//  104  186:return          
		}
	}

	private void onLeafAtomRead(Atom.LeafAtom leafatom, long l)
		throws ParserException
	{
		if(!containerAtoms.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field ArrayDeque containerAtoms>
	//*   2    4:invokevirtual   #383 <Method boolean ArrayDeque.isEmpty()>
	//*   3    7:ifne            25
		{
			((Atom.ContainerAtom)containerAtoms.peek()).add(leafatom);
	//    4   10:aload_0         
	//    5   11:getfield        #211 <Field ArrayDeque containerAtoms>
	//    6   14:invokevirtual   #387 <Method Object ArrayDeque.peek()>
	//    7   17:checkcast       #366 <Class Atom$ContainerAtom>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #434 <Method void Atom$ContainerAtom.add(Atom$LeafAtom)>
			return;
	//   10   24:return          
		}
		if(leafatom.type == Atom.TYPE_sidx)
	//*  11   25:aload_1         
	//*  12   26:getfield        #267 <Field int Atom$LeafAtom.type>
	//*  13   29:getstatic       #437 <Field int Atom.TYPE_sidx>
	//*  14   32:icmpne          80
		{
			leafatom = ((Atom.LeafAtom) (parseSidx(leafatom.data, l)));
	//   15   35:aload_1         
	//   16   36:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   17   39:lload_2         
	//   18   40:invokestatic    #441 <Method Pair parseSidx(ParsableByteArray, long)>
	//   19   43:astore_1        
			segmentIndexEarliestPresentationTimeUs = ((Long)((Pair) (leafatom)).first).longValue();
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:getfield        #447 <Field Object Pair.first>
	//   23   49:checkcast       #449 <Class Long>
	//   24   52:invokevirtual   #452 <Method long Long.longValue()>
	//   25   55:putfield        #226 <Field long segmentIndexEarliestPresentationTimeUs>
			extractorOutput.seekMap((SeekMap)((Pair) (leafatom)).second);
	//   26   58:aload_0         
	//   27   59:getfield        #341 <Field ExtractorOutput extractorOutput>
	//   28   62:aload_1         
	//   29   63:getfield        #455 <Field Object Pair.second>
	//   30   66:checkcast       #457 <Class SeekMap>
	//   31   69:invokeinterface #461 <Method void ExtractorOutput.seekMap(SeekMap)>
			haveOutputSeekMap = true;
	//   32   74:aload_0         
	//   33   75:iconst_1        
	//   34   76:putfield        #463 <Field boolean haveOutputSeekMap>
			return;
	//   35   79:return          
		}
		if(leafatom.type == Atom.TYPE_emsg)
	//*  36   80:aload_1         
	//*  37   81:getfield        #267 <Field int Atom$LeafAtom.type>
	//*  38   84:getstatic       #466 <Field int Atom.TYPE_emsg>
	//*  39   87:icmpne          98
			onEmsgLeafAtomRead(leafatom.data);
	//   40   90:aload_0         
	//   41   91:aload_1         
	//   42   92:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   43   95:invokespecial   #468 <Method void onEmsgLeafAtomRead(ParsableByteArray)>
	//   44   98:return          
	}

	private void onMoofContainerAtomRead(Atom.ContainerAtom containeratom)
		throws ParserException
	{
		parseMoof(containeratom, trackBundles, flags, extendedTypeScratch);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #218 <Field SparseArray trackBundles>
	//    3    5:aload_0         
	//    4    6:getfield        #170 <Field int flags>
	//    5    9:aload_0         
	//    6   10:getfield        #206 <Field byte[] extendedTypeScratch>
	//    7   13:invokestatic    #472 <Method void parseMoof(Atom$ContainerAtom, SparseArray, int, byte[])>
		if(sideloadedDrmInitData != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #176 <Field DrmInitData sideloadedDrmInitData>
	//*  10   20:ifnull          28
			containeratom = null;
	//   11   23:aconst_null     
	//   12   24:astore_1        
		else
	//*  13   25:goto            36
			containeratom = ((Atom.ContainerAtom) (getDrmInitDataFromAtoms(containeratom.leafChildren)));
	//   14   28:aload_1         
	//   15   29:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//   16   32:invokestatic    #477 <Method DrmInitData getDrmInitDataFromAtoms(List)>
	//   17   35:astore_1        
		boolean flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		if(containeratom != null)
	//*  20   38:aload_1         
	//*  21   39:ifnull          81
		{
			int k = trackBundles.size();
	//   22   42:aload_0         
	//   23   43:getfield        #218 <Field SparseArray trackBundles>
	//   24   46:invokevirtual   #240 <Method int SparseArray.size()>
	//   25   49:istore          4
			for(int i = 0; i < k; i++)
	//*  26   51:iconst_0        
	//*  27   52:istore_2        
	//*  28   53:iload_2         
	//*  29   54:iload           4
	//*  30   56:icmpge          81
				((TrackBundle)trackBundles.valueAt(i)).updateDrmInitData(((DrmInitData) (containeratom)));
	//   31   59:aload_0         
	//   32   60:getfield        #218 <Field SparseArray trackBundles>
	//   33   63:iload_2         
	//   34   64:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//   35   67:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   36   70:aload_1         
	//   37   71:invokevirtual   #481 <Method void FragmentedMp4Extractor$TrackBundle.updateDrmInitData(DrmInitData)>

	//   38   74:iload_2         
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:istore_2        
		}
	//*  42   78:goto            53
		if(pendingSeekTimeUs != 0x1L)
	//*  43   81:aload_0         
	//*  44   82:getfield        #224 <Field long pendingSeekTimeUs>
	//*  45   85:ldc2w           #219 <Long 0x1L>
	//*  46   88:lcmp            
	//*  47   89:ifeq            141
		{
			int l = trackBundles.size();
	//   48   92:aload_0         
	//   49   93:getfield        #218 <Field SparseArray trackBundles>
	//   50   96:invokevirtual   #240 <Method int SparseArray.size()>
	//   51   99:istore          4
			for(int j = ((int) (flag)); j < l; j++)
	//*  52  101:iload_3         
	//*  53  102:istore_2        
	//*  54  103:iload_2         
	//*  55  104:iload           4
	//*  56  106:icmpge          134
				((TrackBundle)trackBundles.valueAt(j)).seek(pendingSeekTimeUs);
	//   57  109:aload_0         
	//   58  110:getfield        #218 <Field SparseArray trackBundles>
	//   59  113:iload_2         
	//   60  114:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//   61  117:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   62  120:aload_0         
	//   63  121:getfield        #224 <Field long pendingSeekTimeUs>
	//   64  124:invokevirtual   #485 <Method void FragmentedMp4Extractor$TrackBundle.seek(long)>

	//   65  127:iload_2         
	//   66  128:iconst_1        
	//   67  129:iadd            
	//   68  130:istore_2        
	//*  69  131:goto            103
			pendingSeekTimeUs = 0x1L;
	//   70  134:aload_0         
	//   71  135:ldc2w           #219 <Long 0x1L>
	//   72  138:putfield        #224 <Field long pendingSeekTimeUs>
		}
	//   73  141:return          
	}

	private void onMoovContainerAtomRead(Atom.ContainerAtom containeratom)
		throws ParserException
	{
		Object obj = ((Object) (sideloadedTrack));
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field Track sideloadedTrack>
	//    2    4:astore          10
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		boolean flag3 = true;
	//    7   12:iconst_1        
	//    8   13:istore          7
		boolean flag2;
		if(obj == null)
	//*   9   15:aload           10
	//*  10   17:ifnonnull       26
			flag2 = true;
	//   11   20:iconst_1        
	//   12   21:istore          6
		else
	//*  13   23:goto            29
			flag2 = false;
	//   14   26:iconst_0        
	//   15   27:istore          6
		Assertions.checkState(flag2, "Unexpected moov box.");
	//   16   29:iload           6
	//   17   31:ldc2            #487 <String "Unexpected moov box.">
	//   18   34:invokestatic    #491 <Method void Assertions.checkState(boolean, Object)>
		if(sideloadedDrmInitData != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #176 <Field DrmInitData sideloadedDrmInitData>
	//*  21   41:ifnull          53
			obj = ((Object) (sideloadedDrmInitData));
	//   22   44:aload_0         
	//   23   45:getfield        #176 <Field DrmInitData sideloadedDrmInitData>
	//   24   48:astore          10
		else
	//*  25   50:goto            62
			obj = ((Object) (getDrmInitDataFromAtoms(containeratom.leafChildren)));
	//   26   53:aload_1         
	//   27   54:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//   28   57:invokestatic    #477 <Method DrmInitData getDrmInitDataFromAtoms(List)>
	//   29   60:astore          10
		Object obj1 = ((Object) (containeratom.getContainerAtomOfType(Atom.TYPE_mvex)));
	//   30   62:aload_1         
	//   31   63:getstatic       #494 <Field int Atom.TYPE_mvex>
	//   32   66:invokevirtual   #498 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   33   69:astore          12
		SparseArray sparsearray = new SparseArray();
	//   34   71:new             #215 <Class SparseArray>
	//   35   74:dup             
	//   36   75:invokespecial   #216 <Method void SparseArray()>
	//   37   78:astore          11
		int i1 = ((Atom.ContainerAtom) (obj1)).leafChildren.size();
	//   38   80:aload           12
	//   39   82:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//   40   85:invokeinterface #261 <Method int List.size()>
	//   41   90:istore_3        
		long l1 = 0x1L;
	//   42   91:ldc2w           #219 <Long 0x1L>
	//   43   94:lstore          8
		for(int i = 0; i < i1; i++)
	//*  44   96:iconst_0        
	//*  45   97:istore_2        
	//*  46   98:iload_2         
	//*  47   99:iload_3         
	//*  48  100:icmpge          192
		{
			Object obj2 = ((Object) ((Atom.LeafAtom)((Atom.ContainerAtom) (obj1)).leafChildren.get(i)));
	//   49  103:aload           12
	//   50  105:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//   51  108:iload_2         
	//   52  109:invokeinterface #262 <Method Object List.get(int)>
	//   53  114:checkcast       #264 <Class Atom$LeafAtom>
	//   54  117:astore          13
			if(((Atom.LeafAtom) (obj2)).type == Atom.TYPE_trex)
	//*  55  119:aload           13
	//*  56  121:getfield        #267 <Field int Atom$LeafAtom.type>
	//*  57  124:getstatic       #501 <Field int Atom.TYPE_trex>
	//*  58  127:icmpne          164
			{
				obj2 = ((Object) (parseTrex(((Atom.LeafAtom) (obj2)).data)));
	//   59  130:aload           13
	//   60  132:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   61  135:invokestatic    #505 <Method Pair parseTrex(ParsableByteArray)>
	//   62  138:astore          13
				sparsearray.put(((Integer)((Pair) (obj2)).first).intValue(), ((Pair) (obj2)).second);
	//   63  140:aload           11
	//   64  142:aload           13
	//   65  144:getfield        #447 <Field Object Pair.first>
	//   66  147:checkcast       #507 <Class Integer>
	//   67  150:invokevirtual   #510 <Method int Integer.intValue()>
	//   68  153:aload           13
	//   69  155:getfield        #455 <Field Object Pair.second>
	//   70  158:invokevirtual   #514 <Method void SparseArray.put(int, Object)>
				continue;
	//   71  161:goto            185
			}
			if(((Atom.LeafAtom) (obj2)).type == Atom.TYPE_mehd)
	//*  72  164:aload           13
	//*  73  166:getfield        #267 <Field int Atom$LeafAtom.type>
	//*  74  169:getstatic       #517 <Field int Atom.TYPE_mehd>
	//*  75  172:icmpne          185
				l1 = parseMehd(((Atom.LeafAtom) (obj2)).data);
	//   76  175:aload           13
	//   77  177:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   78  180:invokestatic    #521 <Method long parseMehd(ParsableByteArray)>
	//   79  183:lstore          8
		}

	//   80  185:iload_2         
	//   81  186:iconst_1        
	//   82  187:iadd            
	//   83  188:istore_2        
	//*  84  189:goto            98
		obj1 = ((Object) (new SparseArray()));
	//   85  192:new             #215 <Class SparseArray>
	//   86  195:dup             
	//   87  196:invokespecial   #216 <Method void SparseArray()>
	//   88  199:astore          12
		int j = containeratom.containerChildren.size();
	//   89  201:aload_1         
	//   90  202:getfield        #524 <Field List Atom$ContainerAtom.containerChildren>
	//   91  205:invokeinterface #261 <Method int List.size()>
	//   92  210:istore_2        
		for(i1 = 0; i1 < j; i1++)
	//*  93  211:iconst_0        
	//*  94  212:istore_3        
	//*  95  213:iload_3         
	//*  96  214:iload_2         
	//*  97  215:icmpge          315
		{
			Object obj3 = ((Object) ((Atom.ContainerAtom)containeratom.containerChildren.get(i1)));
	//   98  218:aload_1         
	//   99  219:getfield        #524 <Field List Atom$ContainerAtom.containerChildren>
	//  100  222:iload_3         
	//  101  223:invokeinterface #262 <Method Object List.get(int)>
	//  102  228:checkcast       #366 <Class Atom$ContainerAtom>
	//  103  231:astore          13
			if(((Atom.ContainerAtom) (obj3)).type != Atom.TYPE_trak)
				continue;
	//  104  233:aload           13
	//  105  235:getfield        #367 <Field int Atom$ContainerAtom.type>
	//  106  238:getstatic       #527 <Field int Atom.TYPE_trak>
	//  107  241:icmpne          308
			Atom.LeafAtom leafatom = containeratom.getLeafAtomOfType(Atom.TYPE_mvhd);
	//  108  244:aload_1         
	//  109  245:getstatic       #530 <Field int Atom.TYPE_mvhd>
	//  110  248:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//  111  251:astore          14
			if((flags & 0x10) != 0)
	//* 112  253:aload_0         
	//* 113  254:getfield        #170 <Field int flags>
	//* 114  257:bipush          16
	//* 115  259:iand            
	//* 116  260:ifeq            269
				flag2 = true;
	//  117  263:iconst_1        
	//  118  264:istore          6
			else
	//* 119  266:goto            272
				flag2 = false;
	//  120  269:iconst_0        
	//  121  270:istore          6
			obj3 = ((Object) (AtomParsers.parseTrak(((Atom.ContainerAtom) (obj3)), leafatom, l1, ((DrmInitData) (obj)), flag2, false)));
	//  122  272:aload           13
	//  123  274:aload           14
	//  124  276:lload           8
	//  125  278:aload           10
	//  126  280:iload           6
	//  127  282:iconst_0        
	//  128  283:invokestatic    #540 <Method Track AtomParsers.parseTrak(Atom$ContainerAtom, Atom$LeafAtom, long, DrmInitData, boolean, boolean)>
	//  129  286:astore          13
			if(obj3 != null)
	//* 130  288:aload           13
	//* 131  290:ifnull          308
				((SparseArray) (obj1)).put(((Track) (obj3)).id, obj3);
	//  132  293:aload           12
	//  133  295:aload           13
	//  134  297:getfield        #545 <Field int Track.id>
	//  135  300:aload           13
	//  136  302:invokevirtual   #514 <Method void SparseArray.put(int, Object)>
		}

	//  137  305:goto            308
	//  138  308:iload_3         
	//  139  309:iconst_1        
	//  140  310:iadd            
	//  141  311:istore_3        
	//* 142  312:goto            213
		i1 = ((SparseArray) (obj1)).size();
	//  143  315:aload           12
	//  144  317:invokevirtual   #240 <Method int SparseArray.size()>
	//  145  320:istore_3        
		if(trackBundles.size() == 0)
	//* 146  321:aload_0         
	//* 147  322:getfield        #218 <Field SparseArray trackBundles>
	//* 148  325:invokevirtual   #240 <Method int SparseArray.size()>
	//* 149  328:ifne            437
		{
			for(int k = ((int) (flag)); k < i1; k++)
	//* 150  331:iload           4
	//* 151  333:istore_2        
	//* 152  334:iload_2         
	//* 153  335:iload_3         
	//* 154  336:icmpge          423
			{
				containeratom = ((Atom.ContainerAtom) ((Track)((SparseArray) (obj1)).valueAt(k)));
	//  155  339:aload           12
	//  156  341:iload_2         
	//  157  342:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//  158  345:checkcast       #542 <Class Track>
	//  159  348:astore_1        
				TrackBundle trackbundle = new TrackBundle(extractorOutput.track(k, ((Track) (containeratom)).type));
	//  160  349:new             #16  <Class FragmentedMp4Extractor$TrackBundle>
	//  161  352:dup             
	//  162  353:aload_0         
	//  163  354:getfield        #341 <Field ExtractorOutput extractorOutput>
	//  164  357:iload_2         
	//  165  358:aload_1         
	//  166  359:getfield        #546 <Field int Track.type>
	//  167  362:invokeinterface #347 <Method TrackOutput ExtractorOutput.track(int, int)>
	//  168  367:invokespecial   #549 <Method void FragmentedMp4Extractor$TrackBundle(TrackOutput)>
	//  169  370:astore          10
				trackbundle.init(((Track) (containeratom)), getDefaultSampleValues(sparsearray, ((Track) (containeratom)).id));
	//  170  372:aload           10
	//  171  374:aload_1         
	//  172  375:aload_0         
	//  173  376:aload           11
	//  174  378:aload_1         
	//  175  379:getfield        #545 <Field int Track.id>
	//  176  382:invokespecial   #551 <Method DefaultSampleValues getDefaultSampleValues(SparseArray, int)>
	//  177  385:invokevirtual   #555 <Method void FragmentedMp4Extractor$TrackBundle.init(Track, DefaultSampleValues)>
				trackBundles.put(((Track) (containeratom)).id, ((Object) (trackbundle)));
	//  178  388:aload_0         
	//  179  389:getfield        #218 <Field SparseArray trackBundles>
	//  180  392:aload_1         
	//  181  393:getfield        #545 <Field int Track.id>
	//  182  396:aload           10
	//  183  398:invokevirtual   #514 <Method void SparseArray.put(int, Object)>
				durationUs = Math.max(durationUs, ((Track) (containeratom)).durationUs);
	//  184  401:aload_0         
	//  185  402:aload_0         
	//  186  403:getfield        #222 <Field long durationUs>
	//  187  406:aload_1         
	//  188  407:getfield        #556 <Field long Track.durationUs>
	//  189  410:invokestatic    #562 <Method long Math.max(long, long)>
	//  190  413:putfield        #222 <Field long durationUs>
			}

	//  191  416:iload_2         
	//  192  417:iconst_1        
	//  193  418:iadd            
	//  194  419:istore_2        
	//* 195  420:goto            334
			maybeInitExtraTracks();
	//  196  423:aload_0         
	//  197  424:invokespecial   #564 <Method void maybeInitExtraTracks()>
			extractorOutput.endTracks();
	//  198  427:aload_0         
	//  199  428:getfield        #341 <Field ExtractorOutput extractorOutput>
	//  200  431:invokeinterface #567 <Method void ExtractorOutput.endTracks()>
			return;
	//  201  436:return          
		}
		if(trackBundles.size() == i1)
	//* 202  437:aload_0         
	//* 203  438:getfield        #218 <Field SparseArray trackBundles>
	//* 204  441:invokevirtual   #240 <Method int SparseArray.size()>
	//* 205  444:iload_3         
	//* 206  445:icmpne          455
			flag2 = flag3;
	//  207  448:iload           7
	//  208  450:istore          6
		else
	//* 209  452:goto            458
			flag2 = false;
	//  210  455:iconst_0        
	//  211  456:istore          6
		Assertions.checkState(flag2);
	//  212  458:iload           6
	//  213  460:invokestatic    #570 <Method void Assertions.checkState(boolean)>
		for(int l = ((int) (flag1)); l < i1; l++)
	//* 214  463:iload           5
	//* 215  465:istore_2        
	//* 216  466:iload_2         
	//* 217  467:iload_3         
	//* 218  468:icmpge          516
		{
			containeratom = ((Atom.ContainerAtom) ((Track)((SparseArray) (obj1)).valueAt(l)));
	//  219  471:aload           12
	//  220  473:iload_2         
	//  221  474:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//  222  477:checkcast       #542 <Class Track>
	//  223  480:astore_1        
			((TrackBundle)trackBundles.get(((Track) (containeratom)).id)).init(((Track) (containeratom)), getDefaultSampleValues(sparsearray, ((Track) (containeratom)).id));
	//  224  481:aload_0         
	//  225  482:getfield        #218 <Field SparseArray trackBundles>
	//  226  485:aload_1         
	//  227  486:getfield        #545 <Field int Track.id>
	//  228  489:invokevirtual   #249 <Method Object SparseArray.get(int)>
	//  229  492:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//  230  495:aload_1         
	//  231  496:aload_0         
	//  232  497:aload           11
	//  233  499:aload_1         
	//  234  500:getfield        #545 <Field int Track.id>
	//  235  503:invokespecial   #551 <Method DefaultSampleValues getDefaultSampleValues(SparseArray, int)>
	//  236  506:invokevirtual   #555 <Method void FragmentedMp4Extractor$TrackBundle.init(Track, DefaultSampleValues)>
		}

	//  237  509:iload_2         
	//  238  510:iconst_1        
	//  239  511:iadd            
	//  240  512:istore_2        
	//* 241  513:goto            466
	//  242  516:return          
	}

	private void outputPendingMetadataSamples(long l)
	{
		while(!pendingMetadataSampleInfos.isEmpty()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field ArrayDeque pendingMetadataSampleInfos>
	//*   2    4:invokevirtual   #383 <Method boolean ArrayDeque.isEmpty()>
	//*   3    7:ifne            89
		{
			MetadataSampleInfo metadatasampleinfo = (MetadataSampleInfo)pendingMetadataSampleInfos.removeFirst();
	//    4   10:aload_0         
	//    5   11:getfield        #213 <Field ArrayDeque pendingMetadataSampleInfos>
	//    6   14:invokevirtual   #574 <Method Object ArrayDeque.removeFirst()>
	//    7   17:checkcast       #13  <Class FragmentedMp4Extractor$MetadataSampleInfo>
	//    8   20:astore          5
			pendingMetadataSampleBytes = pendingMetadataSampleBytes - metadatasampleinfo.size;
	//    9   22:aload_0         
	//   10   23:aload_0         
	//   11   24:getfield        #429 <Field int pendingMetadataSampleBytes>
	//   12   27:aload           5
	//   13   29:getfield        #576 <Field int FragmentedMp4Extractor$MetadataSampleInfo.size>
	//   14   32:isub            
	//   15   33:putfield        #429 <Field int pendingMetadataSampleBytes>
			TrackOutput atrackoutput[] = emsgTrackOutputs;
	//   16   36:aload_0         
	//   17   37:getfield        #337 <Field TrackOutput[] emsgTrackOutputs>
	//   18   40:astore          6
			int j = atrackoutput.length;
	//   19   42:aload           6
	//   20   44:arraylength     
	//   21   45:istore          4
			int i = 0;
	//   22   47:iconst_0        
	//   23   48:istore_3        
			while(i < j) 
	//*  24   49:iload_3         
	//*  25   50:iload           4
	//*  26   52:icmpge          0
			{
				atrackoutput[i].sampleMetadata(l + metadatasampleinfo.presentationTimeDeltaUs, 1, metadatasampleinfo.size, pendingMetadataSampleBytes, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   27   55:aload           6
	//   28   57:iload_3         
	//   29   58:aaload          
	//   30   59:lload_1         
	//   31   60:aload           5
	//   32   62:getfield        #579 <Field long FragmentedMp4Extractor$MetadataSampleInfo.presentationTimeDeltaUs>
	//   33   65:ladd            
	//   34   66:iconst_1        
	//   35   67:aload           5
	//   36   69:getfield        #576 <Field int FragmentedMp4Extractor$MetadataSampleInfo.size>
	//   37   72:aload_0         
	//   38   73:getfield        #429 <Field int pendingMetadataSampleBytes>
	//   39   76:aconst_null     
	//   40   77:invokeinterface #420 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
				i++;
	//   41   82:iload_3         
	//   42   83:iconst_1        
	//   43   84:iadd            
	//   44   85:istore_3        
			}
		}
	//*  45   86:goto            49
	//   46   89:return          
	}

	private static long parseMehd(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		if(Atom.parseFullAtomVersion(parsablebytearray.readInt()) == 0)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//*   5   10:invokestatic    #586 <Method int Atom.parseFullAtomVersion(int)>
	//*   6   13:ifne            21
			return parsablebytearray.readUnsignedInt();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//    9   20:lreturn         
		else
			return parsablebytearray.readUnsignedLongToLong();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   12   25:lreturn         
	}

	private static void parseMoof(Atom.ContainerAtom containeratom, SparseArray sparsearray, int i, byte abyte0[])
		throws ParserException
	{
		int k = containeratom.containerChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #524 <Field List Atom$ContainerAtom.containerChildren>
	//    2    4:invokeinterface #261 <Method int List.size()>
	//    3    9:istore          5
		for(int j = 0; j < k; j++)
	//*   4   11:iconst_0        
	//*   5   12:istore          4
	//*   6   14:iload           4
	//*   7   16:iload           5
	//*   8   18:icmpge          65
		{
			Atom.ContainerAtom containeratom1 = (Atom.ContainerAtom)containeratom.containerChildren.get(j);
	//    9   21:aload_0         
	//   10   22:getfield        #524 <Field List Atom$ContainerAtom.containerChildren>
	//   11   25:iload           4
	//   12   27:invokeinterface #262 <Method Object List.get(int)>
	//   13   32:checkcast       #366 <Class Atom$ContainerAtom>
	//   14   35:astore          6
			if(containeratom1.type == Atom.TYPE_traf)
	//*  15   37:aload           6
	//*  16   39:getfield        #367 <Field int Atom$ContainerAtom.type>
	//*  17   42:getstatic       #592 <Field int Atom.TYPE_traf>
	//*  18   45:icmpne          56
				parseTraf(containeratom1, sparsearray, i, abyte0);
	//   19   48:aload           6
	//   20   50:aload_1         
	//   21   51:iload_2         
	//   22   52:aload_3         
	//   23   53:invokestatic    #595 <Method void parseTraf(Atom$ContainerAtom, SparseArray, int, byte[])>
		}

	//   24   56:iload           4
	//   25   58:iconst_1        
	//   26   59:iadd            
	//   27   60:istore          4
	//*  28   62:goto            14
	//   29   65:return          
	}

	private static void parseSaio(ParsableByteArray parsablebytearray, TrackFragment trackfragment)
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    5   10:istore_2        
		if((Atom.parseFullAtomFlags(i) & 1) == 1)
	//*   6   11:iload_2         
	//*   7   12:invokestatic    #601 <Method int Atom.parseFullAtomFlags(int)>
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:iconst_1        
	//*  11   18:icmpne          27
			parsablebytearray.skipBytes(8);
	//   12   21:aload_0         
	//   13   22:bipush          8
	//   14   24:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.readUnsignedIntToInt();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   17   31:istore_3        
		if(j != 1)
	//*  18   32:iload_3         
	//*  19   33:iconst_1        
	//*  20   34:icmpeq          71
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   21   37:new             #609 <Class StringBuilder>
	//   22   40:dup             
	//   23   41:invokespecial   #610 <Method void StringBuilder()>
	//   24   44:astore_0        
			((StringBuilder) (parsablebytearray)).append("Unexpected saio entry count: ");
	//   25   45:aload_0         
	//   26   46:ldc2            #612 <String "Unexpected saio entry count: ">
	//   27   49:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			((StringBuilder) (parsablebytearray)).append(j);
	//   29   53:aload_0         
	//   30   54:iload_3         
	//   31   55:invokevirtual   #619 <Method StringBuilder StringBuilder.append(int)>
	//   32   58:pop             
			throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//   33   59:new             #364 <Class ParserException>
	//   34   62:dup             
	//   35   63:aload_0         
	//   36   64:invokevirtual   #622 <Method String StringBuilder.toString()>
	//   37   67:invokespecial   #625 <Method void ParserException(String)>
	//   38   70:athrow          
		}
		i = Atom.parseFullAtomVersion(i);
	//   39   71:iload_2         
	//   40   72:invokestatic    #586 <Method int Atom.parseFullAtomVersion(int)>
	//   41   75:istore_2        
		long l1 = trackfragment.auxiliaryDataPosition;
	//   42   76:aload_1         
	//   43   77:getfield        #628 <Field long TrackFragment.auxiliaryDataPosition>
	//   44   80:lstore          6
		long l;
		if(i == 0)
	//*  45   82:iload_2         
	//*  46   83:ifne            95
			l = parsablebytearray.readUnsignedInt();
	//   47   86:aload_0         
	//   48   87:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   49   90:lstore          4
		else
	//*  50   92:goto            101
			l = parsablebytearray.readUnsignedLongToLong();
	//   51   95:aload_0         
	//   52   96:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   53   99:lstore          4
		trackfragment.auxiliaryDataPosition = l1 + l;
	//   54  101:aload_1         
	//   55  102:lload           6
	//   56  104:lload           4
	//   57  106:ladd            
	//   58  107:putfield        #628 <Field long TrackFragment.auxiliaryDataPosition>
	//   59  110:return          
	}

	private static void parseSaiz(TrackEncryptionBox trackencryptionbox, ParsableByteArray parsablebytearray, TrackFragment trackfragment)
		throws ParserException
	{
		int l = trackencryptionbox.initializationVectorSize;
	//    0    0:aload_0         
	//    1    1:getfield        #635 <Field int TrackEncryptionBox.initializationVectorSize>
	//    2    4:istore          6
		parsablebytearray.setPosition(8);
	//    3    6:aload_1         
	//    4    7:bipush          8
	//    5    9:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		int i = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    8   16:invokestatic    #601 <Method int Atom.parseFullAtomFlags(int)>
	//    9   19:istore_3        
		boolean flag = true;
	//   10   20:iconst_1        
	//   11   21:istore          8
		if((i & 1) == 1)
	//*  12   23:iload_3         
	//*  13   24:iconst_1        
	//*  14   25:iand            
	//*  15   26:iconst_1        
	//*  16   27:icmpne          36
			parsablebytearray.skipBytes(8);
	//   17   30:aload_1         
	//   18   31:bipush          8
	//   19   33:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readUnsignedByte();
	//   20   36:aload_1         
	//   21   37:invokevirtual   #638 <Method int ParsableByteArray.readUnsignedByte()>
	//   22   40:istore_3        
		int i1 = parsablebytearray.readUnsignedIntToInt();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   25   45:istore          7
		if(i1 != trackfragment.sampleCount)
	//*  26   47:iload           7
	//*  27   49:aload_2         
	//*  28   50:getfield        #641 <Field int TrackFragment.sampleCount>
	//*  29   53:icmpeq          108
		{
			trackencryptionbox = ((TrackEncryptionBox) (new StringBuilder()));
	//   30   56:new             #609 <Class StringBuilder>
	//   31   59:dup             
	//   32   60:invokespecial   #610 <Method void StringBuilder()>
	//   33   63:astore_0        
			((StringBuilder) (trackencryptionbox)).append("Length mismatch: ");
	//   34   64:aload_0         
	//   35   65:ldc2            #643 <String "Length mismatch: ">
	//   36   68:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			((StringBuilder) (trackencryptionbox)).append(i1);
	//   38   72:aload_0         
	//   39   73:iload           7
	//   40   75:invokevirtual   #619 <Method StringBuilder StringBuilder.append(int)>
	//   41   78:pop             
			((StringBuilder) (trackencryptionbox)).append(", ");
	//   42   79:aload_0         
	//   43   80:ldc2            #645 <String ", ">
	//   44   83:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   45   86:pop             
			((StringBuilder) (trackencryptionbox)).append(trackfragment.sampleCount);
	//   46   87:aload_0         
	//   47   88:aload_2         
	//   48   89:getfield        #641 <Field int TrackFragment.sampleCount>
	//   49   92:invokevirtual   #619 <Method StringBuilder StringBuilder.append(int)>
	//   50   95:pop             
			throw new ParserException(((StringBuilder) (trackencryptionbox)).toString());
	//   51   96:new             #364 <Class ParserException>
	//   52   99:dup             
	//   53  100:aload_0         
	//   54  101:invokevirtual   #622 <Method String StringBuilder.toString()>
	//   55  104:invokespecial   #625 <Method void ParserException(String)>
	//   56  107:athrow          
		}
		int k;
		if(i == 0)
	//*  57  108:iload_3         
	//*  58  109:ifne            175
		{
			trackencryptionbox = ((TrackEncryptionBox) (trackfragment.sampleHasSubsampleEncryptionTable));
	//   59  112:aload_2         
	//   60  113:getfield        #649 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   61  116:astore_0        
			int j = 0;
	//   62  117:iconst_0        
	//   63  118:istore          4
			i = j;
	//   64  120:iload           4
	//   65  122:istore_3        
			do
			{
				k = i;
	//   66  123:iload_3         
	//   67  124:istore          5
				if(j >= i1)
					break;
	//   68  126:iload           4
	//   69  128:iload           7
	//   70  130:icmpge          207
				k = parsablebytearray.readUnsignedByte();
	//   71  133:aload_1         
	//   72  134:invokevirtual   #638 <Method int ParsableByteArray.readUnsignedByte()>
	//   73  137:istore          5
				i += k;
	//   74  139:iload_3         
	//   75  140:iload           5
	//   76  142:iadd            
	//   77  143:istore_3        
				if(k > l)
	//*  78  144:iload           5
	//*  79  146:iload           6
	//*  80  148:icmple          157
					flag = true;
	//   81  151:iconst_1        
	//   82  152:istore          8
				else
	//*  83  154:goto            160
					flag = false;
	//   84  157:iconst_0        
	//   85  158:istore          8
				trackencryptionbox[j] = ((byte) (flag));
	//   86  160:aload_0         
	//   87  161:iload           4
	//   88  163:iload           8
	//   89  165:bastore         
				j++;
	//   90  166:iload           4
	//   91  168:iconst_1        
	//   92  169:iadd            
	//   93  170:istore          4
			} while(true);
	//   94  172:goto            123
		} else
		{
			if(i <= l)
	//*  95  175:iload_3         
	//*  96  176:iload           6
	//*  97  178:icmple          184
	//*  98  181:goto            187
				flag = false;
	//   99  184:iconst_0        
	//  100  185:istore          8
			k = 0 + i * i1;
	//  101  187:iconst_0        
	//  102  188:iload_3         
	//  103  189:iload           7
	//  104  191:imul            
	//  105  192:iadd            
	//  106  193:istore          5
			Arrays.fill(trackfragment.sampleHasSubsampleEncryptionTable, 0, i1, flag);
	//  107  195:aload_2         
	//  108  196:getfield        #649 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//  109  199:iconst_0        
	//  110  200:iload           7
	//  111  202:iload           8
	//  112  204:invokestatic    #653 <Method void Arrays.fill(boolean[], int, int, boolean)>
		}
		trackfragment.initEncryptionData(k);
	//  113  207:aload_2         
	//  114  208:iload           5
	//  115  210:invokevirtual   #656 <Method void TrackFragment.initEncryptionData(int)>
	//  116  213:return          
	}

	private static void parseSenc(ParsableByteArray parsablebytearray, int i, TrackFragment trackfragment)
		throws ParserException
	{
		parsablebytearray.setPosition(8 + i);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:iadd            
	//    4    5:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		i = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    5    8:aload_0         
	//    6    9:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    7   12:invokestatic    #601 <Method int Atom.parseFullAtomFlags(int)>
	//    8   15:istore_1        
		if((i & 1) != 0)
	//*   9   16:iload_1         
	//*  10   17:iconst_1        
	//*  11   18:iand            
	//*  12   19:ifeq            33
			throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
	//   13   22:new             #364 <Class ParserException>
	//   14   25:dup             
	//   15   26:ldc2            #660 <String "Overriding TrackEncryptionBox parameters is unsupported.">
	//   16   29:invokespecial   #625 <Method void ParserException(String)>
	//   17   32:athrow          
		boolean flag;
		if((i & 2) != 0)
	//*  18   33:iload_1         
	//*  19   34:iconst_2        
	//*  20   35:iand            
	//*  21   36:ifeq            44
			flag = true;
	//   22   39:iconst_1        
	//   23   40:istore_3        
		else
	//*  24   41:goto            46
			flag = false;
	//   25   44:iconst_0        
	//   26   45:istore_3        
		i = parsablebytearray.readUnsignedIntToInt();
	//   27   46:aload_0         
	//   28   47:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   29   50:istore_1        
		if(i != trackfragment.sampleCount)
	//*  30   51:iload_1         
	//*  31   52:aload_2         
	//*  32   53:getfield        #641 <Field int TrackFragment.sampleCount>
	//*  33   56:icmpeq          110
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   34   59:new             #609 <Class StringBuilder>
	//   35   62:dup             
	//   36   63:invokespecial   #610 <Method void StringBuilder()>
	//   37   66:astore_0        
			((StringBuilder) (parsablebytearray)).append("Length mismatch: ");
	//   38   67:aload_0         
	//   39   68:ldc2            #643 <String "Length mismatch: ">
	//   40   71:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
			((StringBuilder) (parsablebytearray)).append(i);
	//   42   75:aload_0         
	//   43   76:iload_1         
	//   44   77:invokevirtual   #619 <Method StringBuilder StringBuilder.append(int)>
	//   45   80:pop             
			((StringBuilder) (parsablebytearray)).append(", ");
	//   46   81:aload_0         
	//   47   82:ldc2            #645 <String ", ">
	//   48   85:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   49   88:pop             
			((StringBuilder) (parsablebytearray)).append(trackfragment.sampleCount);
	//   50   89:aload_0         
	//   51   90:aload_2         
	//   52   91:getfield        #641 <Field int TrackFragment.sampleCount>
	//   53   94:invokevirtual   #619 <Method StringBuilder StringBuilder.append(int)>
	//   54   97:pop             
			throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//   55   98:new             #364 <Class ParserException>
	//   56  101:dup             
	//   57  102:aload_0         
	//   58  103:invokevirtual   #622 <Method String StringBuilder.toString()>
	//   59  106:invokespecial   #625 <Method void ParserException(String)>
	//   60  109:athrow          
		} else
		{
			Arrays.fill(trackfragment.sampleHasSubsampleEncryptionTable, 0, i, flag);
	//   61  110:aload_2         
	//   62  111:getfield        #649 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   63  114:iconst_0        
	//   64  115:iload_1         
	//   65  116:iload_3         
	//   66  117:invokestatic    #653 <Method void Arrays.fill(boolean[], int, int, boolean)>
			trackfragment.initEncryptionData(parsablebytearray.bytesLeft());
	//   67  120:aload_2         
	//   68  121:aload_0         
	//   69  122:invokevirtual   #398 <Method int ParsableByteArray.bytesLeft()>
	//   70  125:invokevirtual   #656 <Method void TrackFragment.initEncryptionData(int)>
			trackfragment.fillEncryptionData(parsablebytearray);
	//   71  128:aload_2         
	//   72  129:aload_0         
	//   73  130:invokevirtual   #663 <Method void TrackFragment.fillEncryptionData(ParsableByteArray)>
			return;
	//   74  133:return          
		}
	}

	private static void parseSenc(ParsableByteArray parsablebytearray, TrackFragment trackfragment)
		throws ParserException
	{
		parseSenc(parsablebytearray, 0, trackfragment);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokestatic    #665 <Method void parseSenc(ParsableByteArray, int, TrackFragment)>
	//    4    6:return          
	}

	private static void parseSgpd(ParsableByteArray parsablebytearray, ParsableByteArray parsablebytearray1, String s, TrackFragment trackfragment)
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    5   10:istore          4
		if(parsablebytearray.readInt() != SAMPLE_GROUP_TYPE_seig)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//*   8   16:getstatic       #114 <Field int SAMPLE_GROUP_TYPE_seig>
	//*   9   19:icmpeq          23
			return;
	//   10   22:return          
		if(Atom.parseFullAtomVersion(i) == 1)
	//*  11   23:iload           4
	//*  12   25:invokestatic    #586 <Method int Atom.parseFullAtomVersion(int)>
	//*  13   28:iconst_1        
	//*  14   29:icmpne          37
			parsablebytearray.skipBytes(4);
	//   15   32:aload_0         
	//   16   33:iconst_4        
	//   17   34:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		if(parsablebytearray.readInt() != 1)
	//*  18   37:aload_0         
	//*  19   38:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//*  20   41:iconst_1        
	//*  21   42:icmpeq          56
			throw new ParserException("Entry count in sbgp != 1 (unsupported).");
	//   22   45:new             #364 <Class ParserException>
	//   23   48:dup             
	//   24   49:ldc2            #669 <String "Entry count in sbgp != 1 (unsupported).">
	//   25   52:invokespecial   #625 <Method void ParserException(String)>
	//   26   55:athrow          
		parsablebytearray1.setPosition(8);
	//   27   56:aload_1         
	//   28   57:bipush          8
	//   29   59:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		i = parsablebytearray1.readInt();
	//   30   62:aload_1         
	//   31   63:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//   32   66:istore          4
		if(parsablebytearray1.readInt() != SAMPLE_GROUP_TYPE_seig)
	//*  33   68:aload_1         
	//*  34   69:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//*  35   72:getstatic       #114 <Field int SAMPLE_GROUP_TYPE_seig>
	//*  36   75:icmpeq          79
			return;
	//   37   78:return          
		i = Atom.parseFullAtomVersion(i);
	//   38   79:iload           4
	//   39   81:invokestatic    #586 <Method int Atom.parseFullAtomVersion(int)>
	//   40   84:istore          4
		if(i == 1)
	//*  41   86:iload           4
	//*  42   88:iconst_1        
	//*  43   89:icmpne          112
		{
			if(parsablebytearray1.readUnsignedInt() == 0L)
	//*  44   92:aload_1         
	//*  45   93:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//*  46   96:lconst_0        
	//*  47   97:lcmp            
	//*  48   98:ifne            123
				throw new ParserException("Variable length description in sgpd found (unsupported)");
	//   49  101:new             #364 <Class ParserException>
	//   50  104:dup             
	//   51  105:ldc2            #671 <String "Variable length description in sgpd found (unsupported)">
	//   52  108:invokespecial   #625 <Method void ParserException(String)>
	//   53  111:athrow          
		} else
		if(i >= 2)
	//*  54  112:iload           4
	//*  55  114:iconst_2        
	//*  56  115:icmplt          123
			parsablebytearray1.skipBytes(4);
	//   57  118:aload_1         
	//   58  119:iconst_4        
	//   59  120:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		if(parsablebytearray1.readUnsignedInt() != 1L)
	//*  60  123:aload_1         
	//*  61  124:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//*  62  127:lconst_1        
	//*  63  128:lcmp            
	//*  64  129:ifeq            143
			throw new ParserException("Entry count in sgpd != 1 (unsupported).");
	//   65  132:new             #364 <Class ParserException>
	//   66  135:dup             
	//   67  136:ldc2            #673 <String "Entry count in sgpd != 1 (unsupported).">
	//   68  139:invokespecial   #625 <Method void ParserException(String)>
	//   69  142:athrow          
		parsablebytearray1.skipBytes(1);
	//   70  143:aload_1         
	//   71  144:iconst_1        
	//   72  145:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray1.readUnsignedByte();
	//   73  148:aload_1         
	//   74  149:invokevirtual   #638 <Method int ParsableByteArray.readUnsignedByte()>
	//   75  152:istore          4
		boolean flag;
		if(parsablebytearray1.readUnsignedByte() == 1)
	//*  76  154:aload_1         
	//*  77  155:invokevirtual   #638 <Method int ParsableByteArray.readUnsignedByte()>
	//*  78  158:iconst_1        
	//*  79  159:icmpne          168
			flag = true;
	//   80  162:iconst_1        
	//   81  163:istore          7
		else
	//*  82  165:goto            171
			flag = false;
	//   83  168:iconst_0        
	//   84  169:istore          7
		if(!flag)
	//*  85  171:iload           7
	//*  86  173:ifne            177
			return;
	//   87  176:return          
		int j = parsablebytearray1.readUnsignedByte();
	//   88  177:aload_1         
	//   89  178:invokevirtual   #638 <Method int ParsableByteArray.readUnsignedByte()>
	//   90  181:istore          5
		byte abyte0[] = new byte[16];
	//   91  183:bipush          16
	//   92  185:newarray        byte[]
	//   93  187:astore          8
		parsablebytearray1.readBytes(abyte0, 0, abyte0.length);
	//   94  189:aload_1         
	//   95  190:aload           8
	//   96  192:iconst_0        
	//   97  193:aload           8
	//   98  195:arraylength     
	//   99  196:invokevirtual   #677 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		if(flag && j == 0)
	//* 100  199:iload           7
	//* 101  201:ifeq            231
	//* 102  204:iload           5
	//* 103  206:ifne            231
		{
			int k = parsablebytearray1.readUnsignedByte();
	//  104  209:aload_1         
	//  105  210:invokevirtual   #638 <Method int ParsableByteArray.readUnsignedByte()>
	//  106  213:istore          6
			parsablebytearray = ((ParsableByteArray) (new byte[k]));
	//  107  215:iload           6
	//  108  217:newarray        byte[]
	//  109  219:astore_0        
			parsablebytearray1.readBytes(((byte []) (parsablebytearray)), 0, k);
	//  110  220:aload_1         
	//  111  221:aload_0         
	//  112  222:iconst_0        
	//  113  223:iload           6
	//  114  225:invokevirtual   #677 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		} else
	//* 115  228:goto            233
		{
			parsablebytearray = null;
	//  116  231:aconst_null     
	//  117  232:astore_0        
		}
		trackfragment.definesEncryptionData = true;
	//  118  233:aload_3         
	//  119  234:iconst_1        
	//  120  235:putfield        #680 <Field boolean TrackFragment.definesEncryptionData>
		trackfragment.trackEncryptionBox = new TrackEncryptionBox(flag, s, j, abyte0, (i & 0xf0) >> 4, i & 0xf, ((byte []) (parsablebytearray)));
	//  121  238:aload_3         
	//  122  239:new             #632 <Class TrackEncryptionBox>
	//  123  242:dup             
	//  124  243:iload           7
	//  125  245:aload_2         
	//  126  246:iload           5
	//  127  248:aload           8
	//  128  250:iload           4
	//  129  252:sipush          240
	//  130  255:iand            
	//  131  256:iconst_4        
	//  132  257:ishr            
	//  133  258:iload           4
	//  134  260:bipush          15
	//  135  262:iand            
	//  136  263:aload_0         
	//  137  264:invokespecial   #683 <Method void TrackEncryptionBox(boolean, String, int, byte[], int, int, byte[])>
	//  138  267:putfield        #687 <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//  139  270:return          
	}

	private static Pair parseSidx(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		int i = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//    3    6:aload_0         
	//    4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    5   10:invokestatic    #586 <Method int Atom.parseFullAtomVersion(int)>
	//    6   13:istore_3        
		parsablebytearray.skipBytes(4);
	//    7   14:aload_0         
	//    8   15:iconst_4        
	//    9   16:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		long l8 = parsablebytearray.readUnsignedInt();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   12   23:lstore          14
		long l1;
		if(i == 0)
	//*  13   25:iload_3         
	//*  14   26:ifne            49
		{
			long l2 = parsablebytearray.readUnsignedInt();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   17   33:lstore          8
			l1 = l + parsablebytearray.readUnsignedInt();
	//   18   35:lload_1         
	//   19   36:aload_0         
	//   20   37:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   21   40:ladd            
	//   22   41:lstore          6
			l = l2;
	//   23   43:lload           8
	//   24   45:lstore_1        
		} else
	//*  25   46:goto            73
		{
			l1 = parsablebytearray.readUnsignedLongToLong();
	//   26   49:aload_0         
	//   27   50:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   28   53:lstore          6
			long l3 = l + parsablebytearray.readUnsignedLongToLong();
	//   29   55:lload_1         
	//   30   56:aload_0         
	//   31   57:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   32   60:ladd            
	//   33   61:lstore          8
			l = l1;
	//   34   63:lload           6
	//   35   65:lstore_1        
			l1 = l3;
	//   36   66:lload           8
	//   37   68:lstore          6
		}
	//*  38   70:goto            46
		long l4 = Util.scaleLargeTimestamp(l, 0xf4240L, l8);
	//   39   73:lload_1         
	//   40   74:ldc2w           #407 <Long 0xf4240L>
	//   41   77:lload           14
	//   42   79:invokestatic    #412 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   43   82:lstore          8
		parsablebytearray.skipBytes(2);
	//   44   84:aload_0         
	//   45   85:iconst_2        
	//   46   86:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.readUnsignedShort();
	//   47   89:aload_0         
	//   48   90:invokevirtual   #690 <Method int ParsableByteArray.readUnsignedShort()>
	//   49   93:istore          4
		int ai[] = new int[j];
	//   50   95:iload           4
	//   51   97:newarray        int[]
	//   52   99:astore          19
		long al1[] = new long[j];
	//   53  101:iload           4
	//   54  103:newarray        long[]
	//   55  105:astore          17
		long al2[] = new long[j];
	//   56  107:iload           4
	//   57  109:newarray        long[]
	//   58  111:astore          18
		long al[] = new long[j];
	//   59  113:iload           4
	//   60  115:newarray        long[]
	//   61  117:astore          16
		i = 0;
	//   62  119:iconst_0        
	//   63  120:istore_3        
		long l6 = l4;
	//   64  121:lload           8
	//   65  123:lstore          10
		long l7 = l;
	//   66  125:lload_1         
	//   67  126:lstore          12
		l = l4;
	//   68  128:lload           8
	//   69  130:lstore_1        
		while(i < j) 
	//*  70  131:iload_3         
	//*  71  132:iload           4
	//*  72  134:icmpge          247
		{
			int k = parsablebytearray.readInt();
	//   73  137:aload_0         
	//   74  138:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//   75  141:istore          5
			if((0x80000000 & k) != 0)
	//*  76  143:ldc2            #691 <Int 0x80000000>
	//*  77  146:iload           5
	//*  78  148:iand            
	//*  79  149:ifeq            163
				throw new ParserException("Unhandled indirect reference");
	//   80  152:new             #364 <Class ParserException>
	//   81  155:dup             
	//   82  156:ldc2            #693 <String "Unhandled indirect reference">
	//   83  159:invokespecial   #625 <Method void ParserException(String)>
	//   84  162:athrow          
			long l5 = parsablebytearray.readUnsignedInt();
	//   85  163:aload_0         
	//   86  164:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   87  167:lstore          8
			ai[i] = k & 0x7fffffff;
	//   88  169:aload           19
	//   89  171:iload_3         
	//   90  172:iload           5
	//   91  174:ldc2            #694 <Int 0x7fffffff>
	//   92  177:iand            
	//   93  178:iastore         
			al1[i] = l1;
	//   94  179:aload           17
	//   95  181:iload_3         
	//   96  182:lload           6
	//   97  184:lastore         
			al[i] = l6;
	//   98  185:aload           16
	//   99  187:iload_3         
	//  100  188:lload           10
	//  101  190:lastore         
			l7 += l5;
	//  102  191:lload           12
	//  103  193:lload           8
	//  104  195:ladd            
	//  105  196:lstore          12
			l6 = Util.scaleLargeTimestamp(l7, 0xf4240L, l8);
	//  106  198:lload           12
	//  107  200:ldc2w           #407 <Long 0xf4240L>
	//  108  203:lload           14
	//  109  205:invokestatic    #412 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  110  208:lstore          10
			al2[i] = l6 - al[i];
	//  111  210:aload           18
	//  112  212:iload_3         
	//  113  213:lload           10
	//  114  215:aload           16
	//  115  217:iload_3         
	//  116  218:laload          
	//  117  219:lsub            
	//  118  220:lastore         
			parsablebytearray.skipBytes(4);
	//  119  221:aload_0         
	//  120  222:iconst_4        
	//  121  223:invokevirtual   #604 <Method void ParsableByteArray.skipBytes(int)>
			l5 = ai[i];
	//  122  226:aload           19
	//  123  228:iload_3         
	//  124  229:iaload          
	//  125  230:i2l             
	//  126  231:lstore          8
			i++;
	//  127  233:iload_3         
	//  128  234:iconst_1        
	//  129  235:iadd            
	//  130  236:istore_3        
			l1 += l5;
	//  131  237:lload           6
	//  132  239:lload           8
	//  133  241:ladd            
	//  134  242:lstore          6
		}
	//* 135  244:goto            131
		return Pair.create(((Object) (Long.valueOf(l))), ((Object) (new ChunkIndex(ai, al1, al2, al))));
	//  136  247:lload_1         
	//  137  248:invokestatic    #698 <Method Long Long.valueOf(long)>
	//  138  251:new             #700 <Class ChunkIndex>
	//  139  254:dup             
	//  140  255:aload           19
	//  141  257:aload           17
	//  142  259:aload           18
	//  143  261:aload           16
	//  144  263:invokespecial   #703 <Method void ChunkIndex(int[], long[], long[], long[])>
	//  145  266:invokestatic    #707 <Method Pair Pair.create(Object, Object)>
	//  146  269:areturn         
	}

	private static long parseTfdt(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		if(Atom.parseFullAtomVersion(parsablebytearray.readInt()) == 1)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//*   5   10:invokestatic    #586 <Method int Atom.parseFullAtomVersion(int)>
	//*   6   13:iconst_1        
	//*   7   14:icmpne          22
			return parsablebytearray.readUnsignedLongToLong();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   10   21:lreturn         
		else
			return parsablebytearray.readUnsignedInt();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   13   26:lreturn         
	}

	private static TrackBundle parseTfhd(ParsableByteArray parsablebytearray, SparseArray sparsearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		int l = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    3    6:aload_0         
	//    4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    5   10:invokestatic    #601 <Method int Atom.parseFullAtomFlags(int)>
	//    6   13:istore          5
		sparsearray = ((SparseArray) (getTrackBundle(sparsearray, parsablebytearray.readInt())));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//   10   20:invokestatic    #713 <Method FragmentedMp4Extractor$TrackBundle getTrackBundle(SparseArray, int)>
	//   11   23:astore_1        
		if(sparsearray == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       30
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
		if((l & 1) != 0)
	//*  16   30:iload           5
	//*  17   32:iconst_1        
	//*  18   33:iand            
	//*  19   34:ifeq            61
		{
			long l1 = parsablebytearray.readUnsignedLongToLong();
	//   20   37:aload_0         
	//   21   38:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   22   41:lstore          6
			((TrackBundle) (sparsearray)).fragment.dataPosition = l1;
	//   23   43:aload_1         
	//   24   44:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   25   47:lload           6
	//   26   49:putfield        #716 <Field long TrackFragment.dataPosition>
			((TrackBundle) (sparsearray)).fragment.auxiliaryDataPosition = l1;
	//   27   52:aload_1         
	//   28   53:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   29   56:lload           6
	//   30   58:putfield        #628 <Field long TrackFragment.auxiliaryDataPosition>
		}
		DefaultSampleValues defaultsamplevalues = ((TrackBundle) (sparsearray)).defaultSampleValues;
	//   31   61:aload_1         
	//   32   62:getfield        #720 <Field DefaultSampleValues FragmentedMp4Extractor$TrackBundle.defaultSampleValues>
	//   33   65:astore          8
		int i;
		if((l & 2) != 0)
	//*  34   67:iload           5
	//*  35   69:iconst_2        
	//*  36   70:iand            
	//*  37   71:ifeq            84
			i = parsablebytearray.readUnsignedIntToInt() - 1;
	//   38   74:aload_0         
	//   39   75:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   40   78:iconst_1        
	//   41   79:isub            
	//   42   80:istore_2        
		else
	//*  43   81:goto            90
			i = defaultsamplevalues.sampleDescriptionIndex;
	//   44   84:aload           8
	//   45   86:getfield        #723 <Field int DefaultSampleValues.sampleDescriptionIndex>
	//   46   89:istore_2        
		int j;
		if((l & 8) != 0)
	//*  47   90:iload           5
	//*  48   92:bipush          8
	//*  49   94:iand            
	//*  50   95:ifeq            106
			j = parsablebytearray.readUnsignedIntToInt();
	//   51   98:aload_0         
	//   52   99:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   53  102:istore_3        
		else
	//*  54  103:goto            112
			j = defaultsamplevalues.duration;
	//   55  106:aload           8
	//   56  108:getfield        #726 <Field int DefaultSampleValues.duration>
	//   57  111:istore_3        
		int k;
		if((l & 0x10) != 0)
	//*  58  112:iload           5
	//*  59  114:bipush          16
	//*  60  116:iand            
	//*  61  117:ifeq            129
			k = parsablebytearray.readUnsignedIntToInt();
	//   62  120:aload_0         
	//   63  121:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   64  124:istore          4
		else
	//*  65  126:goto            136
			k = defaultsamplevalues.size;
	//   66  129:aload           8
	//   67  131:getfield        #727 <Field int DefaultSampleValues.size>
	//   68  134:istore          4
		if((l & 0x20) != 0)
	//*  69  136:iload           5
	//*  70  138:bipush          32
	//*  71  140:iand            
	//*  72  141:ifeq            153
			l = parsablebytearray.readUnsignedIntToInt();
	//   73  144:aload_0         
	//   74  145:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   75  148:istore          5
		else
	//*  76  150:goto            160
			l = defaultsamplevalues.flags;
	//   77  153:aload           8
	//   78  155:getfield        #728 <Field int DefaultSampleValues.flags>
	//   79  158:istore          5
		((TrackBundle) (sparsearray)).fragment.header = new DefaultSampleValues(i, j, k, l);
	//   80  160:aload_1         
	//   81  161:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   82  164:new             #246 <Class DefaultSampleValues>
	//   83  167:dup             
	//   84  168:iload_2         
	//   85  169:iload_3         
	//   86  170:iload           4
	//   87  172:iload           5
	//   88  174:invokespecial   #731 <Method void DefaultSampleValues(int, int, int, int)>
	//   89  177:putfield        #734 <Field DefaultSampleValues TrackFragment.header>
		return ((TrackBundle) (sparsearray));
	//   90  180:aload_1         
	//   91  181:areturn         
	}

	private static void parseTraf(Atom.ContainerAtom containeratom, SparseArray sparsearray, int i, byte abyte0[])
		throws ParserException
	{
		sparsearray = ((SparseArray) (parseTfhd(containeratom.getLeafAtomOfType(Atom.TYPE_tfhd).data, sparsearray)));
	//    0    0:aload_0         
	//    1    1:getstatic       #738 <Field int Atom.TYPE_tfhd>
	//    2    4:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    3    7:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//    4   10:aload_1         
	//    5   11:invokestatic    #740 <Method FragmentedMp4Extractor$TrackBundle parseTfhd(ParsableByteArray, SparseArray)>
	//    6   14:astore_1        
		if(sparsearray == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		TrackFragment trackfragment = ((TrackBundle) (sparsearray)).fragment;
	//   10   20:aload_1         
	//   11   21:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   12   24:astore          9
		long l1 = trackfragment.nextFragmentDecodeTime;
	//   13   26:aload           9
	//   14   28:getfield        #743 <Field long TrackFragment.nextFragmentDecodeTime>
	//   15   31:lstore          7
		((TrackBundle) (sparsearray)).reset();
	//   16   33:aload_1         
	//   17   34:invokevirtual   #746 <Method void FragmentedMp4Extractor$TrackBundle.reset()>
		long l = l1;
	//   18   37:lload           7
	//   19   39:lstore          5
		if(containeratom.getLeafAtomOfType(Atom.TYPE_tfdt) != null)
	//*  20   41:aload_0         
	//*  21   42:getstatic       #749 <Field int Atom.TYPE_tfdt>
	//*  22   45:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//*  23   48:ifnull          76
		{
			l = l1;
	//   24   51:lload           7
	//   25   53:lstore          5
			if((i & 2) == 0)
	//*  26   55:iload_2         
	//*  27   56:iconst_2        
	//*  28   57:iand            
	//*  29   58:ifne            76
				l = parseTfdt(containeratom.getLeafAtomOfType(Atom.TYPE_tfdt).data);
	//   30   61:aload_0         
	//   31   62:getstatic       #749 <Field int Atom.TYPE_tfdt>
	//   32   65:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   33   68:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   34   71:invokestatic    #751 <Method long parseTfdt(ParsableByteArray)>
	//   35   74:lstore          5
		}
		parseTruns(containeratom, ((TrackBundle) (sparsearray)), l, i);
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:lload           5
	//   39   80:iload_2         
	//   40   81:invokestatic    #755 <Method void parseTruns(Atom$ContainerAtom, FragmentedMp4Extractor$TrackBundle, long, int)>
		sparsearray = ((SparseArray) (((TrackBundle) (sparsearray)).track.getSampleDescriptionEncryptionBox(trackfragment.header.sampleDescriptionIndex)));
	//   41   84:aload_1         
	//   42   85:getfield        #757 <Field Track FragmentedMp4Extractor$TrackBundle.track>
	//   43   88:aload           9
	//   44   90:getfield        #734 <Field DefaultSampleValues TrackFragment.header>
	//   45   93:getfield        #723 <Field int DefaultSampleValues.sampleDescriptionIndex>
	//   46   96:invokevirtual   #761 <Method TrackEncryptionBox Track.getSampleDescriptionEncryptionBox(int)>
	//   47   99:astore_1        
		Object obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_saiz)));
	//   48  100:aload_0         
	//   49  101:getstatic       #764 <Field int Atom.TYPE_saiz>
	//   50  104:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   51  107:astore          10
		if(obj != null)
	//*  52  109:aload           10
	//*  53  111:ifnull          125
			parseSaiz(((TrackEncryptionBox) (sparsearray)), ((Atom.LeafAtom) (obj)).data, trackfragment);
	//   54  114:aload_1         
	//   55  115:aload           10
	//   56  117:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   57  120:aload           9
	//   58  122:invokestatic    #766 <Method void parseSaiz(TrackEncryptionBox, ParsableByteArray, TrackFragment)>
		obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_saio)));
	//   59  125:aload_0         
	//   60  126:getstatic       #769 <Field int Atom.TYPE_saio>
	//   61  129:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   62  132:astore          10
		if(obj != null)
	//*  63  134:aload           10
	//*  64  136:ifnull          149
			parseSaio(((Atom.LeafAtom) (obj)).data, trackfragment);
	//   65  139:aload           10
	//   66  141:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   67  144:aload           9
	//   68  146:invokestatic    #771 <Method void parseSaio(ParsableByteArray, TrackFragment)>
		obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_senc)));
	//   69  149:aload_0         
	//   70  150:getstatic       #774 <Field int Atom.TYPE_senc>
	//   71  153:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   72  156:astore          10
		if(obj != null)
	//*  73  158:aload           10
	//*  74  160:ifnull          173
			parseSenc(((Atom.LeafAtom) (obj)).data, trackfragment);
	//   75  163:aload           10
	//   76  165:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   77  168:aload           9
	//   78  170:invokestatic    #776 <Method void parseSenc(ParsableByteArray, TrackFragment)>
		obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_sbgp)));
	//   79  173:aload_0         
	//   80  174:getstatic       #779 <Field int Atom.TYPE_sbgp>
	//   81  177:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   82  180:astore          10
		Object obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_sgpd)));
	//   83  182:aload_0         
	//   84  183:getstatic       #782 <Field int Atom.TYPE_sgpd>
	//   85  186:invokevirtual   #534 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   86  189:astore          11
		if(obj != null && obj1 != null)
	//*  87  191:aload           10
	//*  88  193:ifnull          239
	//*  89  196:aload           11
	//*  90  198:ifnull          239
		{
			obj = ((Object) (((Atom.LeafAtom) (obj)).data));
	//   91  201:aload           10
	//   92  203:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   93  206:astore          10
			obj1 = ((Object) (((Atom.LeafAtom) (obj1)).data));
	//   94  208:aload           11
	//   95  210:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   96  213:astore          11
			if(sparsearray != null)
	//*  97  215:aload_1         
	//*  98  216:ifnull          227
				sparsearray = ((SparseArray) (((TrackEncryptionBox) (sparsearray)).schemeType));
	//   99  219:aload_1         
	//  100  220:getfield        #785 <Field String TrackEncryptionBox.schemeType>
	//  101  223:astore_1        
			else
	//* 102  224:goto            229
				sparsearray = null;
	//  103  227:aconst_null     
	//  104  228:astore_1        
			parseSgpd(((ParsableByteArray) (obj)), ((ParsableByteArray) (obj1)), ((String) (sparsearray)), trackfragment);
	//  105  229:aload           10
	//  106  231:aload           11
	//  107  233:aload_1         
	//  108  234:aload           9
	//  109  236:invokestatic    #787 <Method void parseSgpd(ParsableByteArray, ParsableByteArray, String, TrackFragment)>
		}
		int j = containeratom.leafChildren.size();
	//  110  239:aload_0         
	//  111  240:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//  112  243:invokeinterface #261 <Method int List.size()>
	//  113  248:istore          4
		for(i = 0; i < j; i++)
	//* 114  250:iconst_0        
	//* 115  251:istore_2        
	//* 116  252:iload_2         
	//* 117  253:iload           4
	//* 118  255:icmpge          299
		{
			sparsearray = ((SparseArray) ((Atom.LeafAtom)containeratom.leafChildren.get(i)));
	//  119  258:aload_0         
	//  120  259:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//  121  262:iload_2         
	//  122  263:invokeinterface #262 <Method Object List.get(int)>
	//  123  268:checkcast       #264 <Class Atom$LeafAtom>
	//  124  271:astore_1        
			if(((Atom.LeafAtom) (sparsearray)).type == Atom.TYPE_uuid)
	//* 125  272:aload_1         
	//* 126  273:getfield        #267 <Field int Atom$LeafAtom.type>
	//* 127  276:getstatic       #790 <Field int Atom.TYPE_uuid>
	//* 128  279:icmpne          292
				parseUuid(((Atom.LeafAtom) (sparsearray)).data, trackfragment, abyte0);
	//  129  282:aload_1         
	//  130  283:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//  131  286:aload           9
	//  132  288:aload_3         
	//  133  289:invokestatic    #793 <Method void parseUuid(ParsableByteArray, TrackFragment, byte[])>
		}

	//  134  292:iload_2         
	//  135  293:iconst_1        
	//  136  294:iadd            
	//  137  295:istore_2        
	//* 138  296:goto            252
	//  139  299:return          
	}

	private static Pair parseTrex(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		return Pair.create(((Object) (Integer.valueOf(parsablebytearray.readInt()))), ((Object) (new DefaultSampleValues(parsablebytearray.readUnsignedIntToInt() - 1, parsablebytearray.readUnsignedIntToInt(), parsablebytearray.readUnsignedIntToInt(), parsablebytearray.readInt()))));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    5   10:invokestatic    #796 <Method Integer Integer.valueOf(int)>
	//    6   13:new             #246 <Class DefaultSampleValues>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:aload_0         
	//   13   24:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   14   27:aload_0         
	//   15   28:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   16   31:aload_0         
	//   17   32:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//   18   35:invokespecial   #731 <Method void DefaultSampleValues(int, int, int, int)>
	//   19   38:invokestatic    #707 <Method Pair Pair.create(Object, Object)>
	//   20   41:areturn         
	}

	private static int parseTrun(TrackBundle trackbundle, int i, long l, int j, ParsableByteArray parsablebytearray, int k)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload           5
	//    1    2:bipush          8
	//    2    4:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		int j1 = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    3    7:aload           5
	//    4    9:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//    5   12:invokestatic    #601 <Method int Atom.parseFullAtomFlags(int)>
	//    6   15:istore          9
		Track track = trackbundle.track;
	//    7   17:aload_0         
	//    8   18:getfield        #757 <Field Track FragmentedMp4Extractor$TrackBundle.track>
	//    9   21:astore          23
		TrackFragment trackfragment = trackbundle.fragment;
	//   10   23:aload_0         
	//   11   24:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   12   27:astore          24
		DefaultSampleValues defaultsamplevalues = trackfragment.header;
	//   13   29:aload           24
	//   14   31:getfield        #734 <Field DefaultSampleValues TrackFragment.header>
	//   15   34:astore          25
		trackfragment.trunLength[i] = parsablebytearray.readUnsignedIntToInt();
	//   16   36:aload           24
	//   17   38:getfield        #803 <Field int[] TrackFragment.trunLength>
	//   18   41:iload_1         
	//   19   42:aload           5
	//   20   44:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   21   47:iastore         
		trackfragment.trunDataPosition[i] = trackfragment.dataPosition;
	//   22   48:aload           24
	//   23   50:getfield        #329 <Field long[] TrackFragment.trunDataPosition>
	//   24   53:iload_1         
	//   25   54:aload           24
	//   26   56:getfield        #716 <Field long TrackFragment.dataPosition>
	//   27   59:lastore         
		if((j1 & 1) != 0)
	//*  28   60:iload           9
	//*  29   62:iconst_1        
	//*  30   63:iand            
	//*  31   64:ifeq            86
		{
			trackbundle = ((TrackBundle) (trackfragment.trunDataPosition));
	//   32   67:aload           24
	//   33   69:getfield        #329 <Field long[] TrackFragment.trunDataPosition>
	//   34   72:astore_0        
			trackbundle[i] = trackbundle[i] + (long)parsablebytearray.readInt();
	//   35   73:aload_0         
	//   36   74:iload_1         
	//   37   75:aload_0         
	//   38   76:iload_1         
	//   39   77:laload          
	//   40   78:aload           5
	//   41   80:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//   42   83:i2l             
	//   43   84:ladd            
	//   44   85:lastore         
		}
		boolean flag;
		if((j1 & 4) != 0)
	//*  45   86:iload           9
	//*  46   88:iconst_4        
	//*  47   89:iand            
	//*  48   90:ifeq            99
			flag = true;
	//   49   93:iconst_1        
	//   50   94:istore          8
		else
	//*  51   96:goto            102
			flag = false;
	//   52   99:iconst_0        
	//   53  100:istore          8
		int i1 = defaultsamplevalues.flags;
	//   54  102:aload           25
	//   55  104:getfield        #728 <Field int DefaultSampleValues.flags>
	//   56  107:istore          7
		if(flag)
	//*  57  109:iload           8
	//*  58  111:ifeq            121
			i1 = parsablebytearray.readUnsignedIntToInt();
	//   59  114:aload           5
	//   60  116:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   61  119:istore          7
		boolean flag2;
		if((j1 & 0x100) != 0)
	//*  62  121:iload           9
	//*  63  123:sipush          256
	//*  64  126:iand            
	//*  65  127:ifeq            136
			flag2 = true;
	//   66  130:iconst_1        
	//   67  131:istore          10
		else
	//*  68  133:goto            139
			flag2 = false;
	//   69  136:iconst_0        
	//   70  137:istore          10
		boolean flag3;
		if((j1 & 0x200) != 0)
	//*  71  139:iload           9
	//*  72  141:sipush          512
	//*  73  144:iand            
	//*  74  145:ifeq            154
			flag3 = true;
	//   75  148:iconst_1        
	//   76  149:istore          11
		else
	//*  77  151:goto            157
			flag3 = false;
	//   78  154:iconst_0        
	//   79  155:istore          11
		boolean flag4;
		if((j1 & 0x400) != 0)
	//*  80  157:iload           9
	//*  81  159:sipush          1024
	//*  82  162:iand            
	//*  83  163:ifeq            172
			flag4 = true;
	//   84  166:iconst_1        
	//   85  167:istore          12
		else
	//*  86  169:goto            175
			flag4 = false;
	//   87  172:iconst_0        
	//   88  173:istore          12
		boolean flag1;
		if((j1 & 0x800) != 0)
	//*  89  175:iload           9
	//*  90  177:sipush          2048
	//*  91  180:iand            
	//*  92  181:ifeq            190
			flag1 = true;
	//   93  184:iconst_1        
	//   94  185:istore          9
		else
	//*  95  187:goto            193
			flag1 = false;
	//   96  190:iconst_0        
	//   97  191:istore          9
		trackbundle = ((TrackBundle) (track.editListDurations));
	//   98  193:aload           23
	//   99  195:getfield        #806 <Field long[] Track.editListDurations>
	//  100  198:astore_0        
		long l3 = 0L;
	//  101  199:lconst_0        
	//  102  200:lstore          18
		long l2 = l3;
	//  103  202:lload           18
	//  104  204:lstore          16
		if(trackbundle != null)
	//* 105  206:aload_0         
	//* 106  207:ifnull          260
		{
			l2 = l3;
	//  107  210:lload           18
	//  108  212:lstore          16
			if(track.editListDurations.length == 1)
	//* 109  214:aload           23
	//* 110  216:getfield        #806 <Field long[] Track.editListDurations>
	//* 111  219:arraylength     
	//* 112  220:iconst_1        
	//* 113  221:icmpne          260
			{
				l2 = l3;
	//  114  224:lload           18
	//  115  226:lstore          16
				if(track.editListDurations[0] == 0L)
	//* 116  228:aload           23
	//* 117  230:getfield        #806 <Field long[] Track.editListDurations>
	//* 118  233:iconst_0        
	//* 119  234:laload          
	//* 120  235:lconst_0        
	//* 121  236:lcmp            
	//* 122  237:ifne            260
					l2 = Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000L, track.timescale);
	//  123  240:aload           23
	//  124  242:getfield        #809 <Field long[] Track.editListMediaTimes>
	//  125  245:iconst_0        
	//  126  246:laload          
	//  127  247:ldc2w           #810 <Long 1000L>
	//  128  250:aload           23
	//  129  252:getfield        #814 <Field long Track.timescale>
	//  130  255:invokestatic    #412 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  131  258:lstore          16
			}
		}
		int ai[] = trackfragment.sampleSizeTable;
	//  132  260:aload           24
	//  133  262:getfield        #817 <Field int[] TrackFragment.sampleSizeTable>
	//  134  265:astore          26
		trackbundle = ((TrackBundle) (trackfragment.sampleCompositionTimeOffsetTable));
	//  135  267:aload           24
	//  136  269:getfield        #820 <Field int[] TrackFragment.sampleCompositionTimeOffsetTable>
	//  137  272:astore_0        
		long al[] = trackfragment.sampleDecodingTimeTable;
	//  138  273:aload           24
	//  139  275:getfield        #823 <Field long[] TrackFragment.sampleDecodingTimeTable>
	//  140  278:astore          27
		boolean aflag[] = trackfragment.sampleIsSyncFrameTable;
	//  141  280:aload           24
	//  142  282:getfield        #826 <Field boolean[] TrackFragment.sampleIsSyncFrameTable>
	//  143  285:astore          28
		if(track.type == 2 && (j & 1) != 0)
	//* 144  287:aload           23
	//* 145  289:getfield        #546 <Field int Track.type>
	//* 146  292:iconst_2        
	//* 147  293:icmpne          309
	//* 148  296:iload           4
	//* 149  298:iconst_1        
	//* 150  299:iand            
	//* 151  300:ifeq            309
			j = 1;
	//  152  303:iconst_1        
	//  153  304:istore          4
		else
	//* 154  306:goto            312
			j = 0;
	//  155  309:iconst_0        
	//  156  310:istore          4
		int i2 = k + trackfragment.trunLength[i];
	//  157  312:iload           6
	//  158  314:aload           24
	//  159  316:getfield        #803 <Field int[] TrackFragment.trunLength>
	//  160  319:iload_1         
	//  161  320:iaload          
	//  162  321:iadd            
	//  163  322:istore          15
		l3 = track.timescale;
	//  164  324:aload           23
	//  165  326:getfield        #814 <Field long Track.timescale>
	//  166  329:lstore          18
		if(i > 0)
	//* 167  331:iload_1         
	//* 168  332:ifle            344
			l = trackfragment.nextFragmentDecodeTime;
	//  169  335:aload           24
	//  170  337:getfield        #743 <Field long TrackFragment.nextFragmentDecodeTime>
	//  171  340:lstore_2        
	//* 172  341:goto            344
		while(k < i2) 
	//* 173  344:iload           6
	//* 174  346:iload           15
	//* 175  348:icmpge          540
		{
			int k1;
			if(flag2)
	//* 176  351:iload           10
	//* 177  353:ifeq            366
				k1 = parsablebytearray.readUnsignedIntToInt();
	//  178  356:aload           5
	//  179  358:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  180  361:istore          13
			else
	//* 181  363:goto            373
				k1 = defaultsamplevalues.duration;
	//  182  366:aload           25
	//  183  368:getfield        #726 <Field int DefaultSampleValues.duration>
	//  184  371:istore          13
			int l1;
			if(flag3)
	//* 185  373:iload           11
	//* 186  375:ifeq            388
				l1 = parsablebytearray.readUnsignedIntToInt();
	//  187  378:aload           5
	//  188  380:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  189  383:istore          14
			else
	//* 190  385:goto            395
				l1 = defaultsamplevalues.size;
	//  191  388:aload           25
	//  192  390:getfield        #727 <Field int DefaultSampleValues.size>
	//  193  393:istore          14
			if(k == 0 && flag)
	//* 194  395:iload           6
	//* 195  397:ifne            411
	//* 196  400:iload           8
	//* 197  402:ifeq            411
				i = i1;
	//  198  405:iload           7
	//  199  407:istore_1        
			else
	//* 200  408:goto            431
			if(flag4)
	//* 201  411:iload           12
	//* 202  413:ifeq            425
				i = parsablebytearray.readInt();
	//  203  416:aload           5
	//  204  418:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//  205  421:istore_1        
			else
	//* 206  422:goto            431
				i = defaultsamplevalues.flags;
	//  207  425:aload           25
	//  208  427:getfield        #728 <Field int DefaultSampleValues.flags>
	//  209  430:istore_1        
			if(flag1)
	//* 210  431:iload           9
	//* 211  433:ifeq            457
				trackbundle[k] = (int)(((long)parsablebytearray.readInt() * 1000L) / l3);
	//  212  436:aload_0         
	//  213  437:iload           6
	//  214  439:aload           5
	//  215  441:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//  216  444:i2l             
	//  217  445:ldc2w           #810 <Long 1000L>
	//  218  448:lmul            
	//  219  449:lload           18
	//  220  451:ldiv            
	//  221  452:l2i             
	//  222  453:iastore         
			else
	//* 223  454:goto            462
				trackbundle[k] = 0;
	//  224  457:aload_0         
	//  225  458:iload           6
	//  226  460:iconst_0        
	//  227  461:iastore         
			al[k] = Util.scaleLargeTimestamp(l, 1000L, l3) - l2;
	//  228  462:aload           27
	//  229  464:iload           6
	//  230  466:lload_2         
	//  231  467:ldc2w           #810 <Long 1000L>
	//  232  470:lload           18
	//  233  472:invokestatic    #412 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  234  475:lload           16
	//  235  477:lsub            
	//  236  478:lastore         
			ai[k] = l1;
	//  237  479:aload           26
	//  238  481:iload           6
	//  239  483:iload           14
	//  240  485:iastore         
			boolean flag5;
			if((i >> 16 & 1) == 0 && (j == 0 || k == 0))
	//* 241  486:iload_1         
	//* 242  487:bipush          16
	//* 243  489:ishr            
	//* 244  490:iconst_1        
	//* 245  491:iand            
	//* 246  492:ifne            511
	//* 247  495:iload           4
	//* 248  497:ifeq            505
	//* 249  500:iload           6
	//* 250  502:ifne            511
				flag5 = true;
	//  251  505:iconst_1        
	//  252  506:istore          22
			else
	//* 253  508:goto            514
				flag5 = false;
	//  254  511:iconst_0        
	//  255  512:istore          22
			aflag[k] = flag5;
	//  256  514:aload           28
	//  257  516:iload           6
	//  258  518:iload           22
	//  259  520:bastore         
			long l4 = k1;
	//  260  521:iload           13
	//  261  523:i2l             
	//  262  524:lstore          20
			k++;
	//  263  526:iload           6
	//  264  528:iconst_1        
	//  265  529:iadd            
	//  266  530:istore          6
			l += l4;
	//  267  532:lload_2         
	//  268  533:lload           20
	//  269  535:ladd            
	//  270  536:lstore_2        
		}
	//* 271  537:goto            344
		trackfragment.nextFragmentDecodeTime = l;
	//  272  540:aload           24
	//  273  542:lload_2         
	//  274  543:putfield        #743 <Field long TrackFragment.nextFragmentDecodeTime>
		return i2;
	//  275  546:iload           15
	//  276  548:ireturn         
	}

	private static void parseTruns(Atom.ContainerAtom containeratom, TrackBundle trackbundle, long l, int i)
	{
		containeratom = ((Atom.ContainerAtom) (containeratom.leafChildren));
	//    0    0:aload_0         
	//    1    1:getfield        #475 <Field List Atom$ContainerAtom.leafChildren>
	//    2    4:astore_0        
		int k2 = ((List) (containeratom)).size();
	//    3    5:aload_0         
	//    4    6:invokeinterface #261 <Method int List.size()>
	//    5   11:istore          11
		boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          10
		boolean flag1 = false;
	//    8   16:iconst_0        
	//    9   17:istore          8
		boolean flag = flag1;
	//   10   19:iload           8
	//   11   21:istore          5
		int j1 = ((int) (flag));
	//   12   23:iload           5
	//   13   25:istore          7
		int i1 = ((int) (flag));
	//   14   27:iload           5
	//   15   29:istore          6
		for(int j = ((int) (flag1)); j < k2;)
	//*  16   31:iload           8
	//*  17   33:istore          5
	//*  18   35:iload           5
	//*  19   37:iload           11
	//*  20   39:icmpge          138
		{
			Object obj = ((Object) ((Atom.LeafAtom)((List) (containeratom)).get(j)));
	//   21   42:aload_0         
	//   22   43:iload           5
	//   23   45:invokeinterface #262 <Method Object List.get(int)>
	//   24   50:checkcast       #264 <Class Atom$LeafAtom>
	//   25   53:astore          13
			int i2 = i1;
	//   26   55:iload           6
	//   27   57:istore          9
			int k1 = j1;
	//   28   59:iload           7
	//   29   61:istore          8
			if(((Atom.LeafAtom) (obj)).type == Atom.TYPE_trun)
	//*  30   63:aload           13
	//*  31   65:getfield        #267 <Field int Atom$LeafAtom.type>
	//*  32   68:getstatic       #829 <Field int Atom.TYPE_trun>
	//*  33   71:icmpne          121
			{
				obj = ((Object) (((Atom.LeafAtom) (obj)).data));
	//   34   74:aload           13
	//   35   76:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//   36   79:astore          13
				((ParsableByteArray) (obj)).setPosition(12);
	//   37   81:aload           13
	//   38   83:bipush          12
	//   39   85:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
				int l2 = ((ParsableByteArray) (obj)).readUnsignedIntToInt();
	//   40   88:aload           13
	//   41   90:invokevirtual   #607 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   42   93:istore          12
				i2 = i1;
	//   43   95:iload           6
	//   44   97:istore          9
				k1 = j1;
	//   45   99:iload           7
	//   46  101:istore          8
				if(l2 > 0)
	//*  47  103:iload           12
	//*  48  105:ifle            121
				{
					k1 = j1 + l2;
	//   49  108:iload           7
	//   50  110:iload           12
	//   51  112:iadd            
	//   52  113:istore          8
					i2 = i1 + 1;
	//   53  115:iload           6
	//   54  117:iconst_1        
	//   55  118:iadd            
	//   56  119:istore          9
				}
			}
			j++;
	//   57  121:iload           5
	//   58  123:iconst_1        
	//   59  124:iadd            
	//   60  125:istore          5
			i1 = i2;
	//   61  127:iload           9
	//   62  129:istore          6
			j1 = k1;
	//   63  131:iload           8
	//   64  133:istore          7
		}

	//*  65  135:goto            35
		trackbundle.currentTrackRunIndex = 0;
	//   66  138:aload_1         
	//   67  139:iconst_0        
	//   68  140:putfield        #316 <Field int FragmentedMp4Extractor$TrackBundle.currentTrackRunIndex>
		trackbundle.currentSampleInTrackRun = 0;
	//   69  143:aload_1         
	//   70  144:iconst_0        
	//   71  145:putfield        #832 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleInTrackRun>
		trackbundle.currentSampleIndex = 0;
	//   72  148:aload_1         
	//   73  149:iconst_0        
	//   74  150:putfield        #835 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
		trackbundle.fragment.initTables(i1, j1);
	//   75  153:aload_1         
	//   76  154:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   77  157:iload           6
	//   78  159:iload           7
	//   79  161:invokevirtual   #839 <Method void TrackFragment.initTables(int, int)>
		i1 = 0;
	//   80  164:iconst_0        
	//   81  165:istore          6
		j1 = i1;
	//   82  167:iload           6
	//   83  169:istore          7
		for(int k = ((int) (flag2)); k < k2;)
	//*  84  171:iload           10
	//*  85  173:istore          5
	//*  86  175:iload           5
	//*  87  177:iload           11
	//*  88  179:icmpge          255
		{
			Atom.LeafAtom leafatom = (Atom.LeafAtom)((List) (containeratom)).get(k);
	//   89  182:aload_0         
	//   90  183:iload           5
	//   91  185:invokeinterface #262 <Method Object List.get(int)>
	//   92  190:checkcast       #264 <Class Atom$LeafAtom>
	//   93  193:astore          13
			int j2 = i1;
	//   94  195:iload           6
	//   95  197:istore          9
			int l1 = j1;
	//   96  199:iload           7
	//   97  201:istore          8
			if(leafatom.type == Atom.TYPE_trun)
	//*  98  203:aload           13
	//*  99  205:getfield        #267 <Field int Atom$LeafAtom.type>
	//* 100  208:getstatic       #829 <Field int Atom.TYPE_trun>
	//* 101  211:icmpne          238
			{
				l1 = parseTrun(trackbundle, i1, l, i, leafatom.data, j1);
	//  102  214:aload_1         
	//  103  215:iload           6
	//  104  217:lload_2         
	//  105  218:iload           4
	//  106  220:aload           13
	//  107  222:getfield        #278 <Field ParsableByteArray Atom$LeafAtom.data>
	//  108  225:iload           7
	//  109  227:invokestatic    #841 <Method int parseTrun(FragmentedMp4Extractor$TrackBundle, int, long, int, ParsableByteArray, int)>
	//  110  230:istore          8
				j2 = i1 + 1;
	//  111  232:iload           6
	//  112  234:iconst_1        
	//  113  235:iadd            
	//  114  236:istore          9
			}
			k++;
	//  115  238:iload           5
	//  116  240:iconst_1        
	//  117  241:iadd            
	//  118  242:istore          5
			i1 = j2;
	//  119  244:iload           9
	//  120  246:istore          6
			j1 = l1;
	//  121  248:iload           8
	//  122  250:istore          7
		}

	//* 123  252:goto            175
	//  124  255:return          
	}

	private static void parseUuid(ParsableByteArray parsablebytearray, TrackFragment trackfragment, byte abyte0[])
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray.readBytes(abyte0, 0, 16);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iconst_0        
	//    6    9:bipush          16
	//    7   11:invokevirtual   #677 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		if(!Arrays.equals(abyte0, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE))
	//*   8   14:aload_2         
	//*   9   15:getstatic       #130 <Field byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE>
	//*  10   18:invokestatic    #845 <Method boolean Arrays.equals(byte[], byte[])>
	//*  11   21:ifne            25
		{
			return;
	//   12   24:return          
		} else
		{
			parseSenc(parsablebytearray, 16, trackfragment);
	//   13   25:aload_0         
	//   14   26:bipush          16
	//   15   28:aload_1         
	//   16   29:invokestatic    #665 <Method void parseSenc(ParsableByteArray, int, TrackFragment)>
			return;
	//   17   32:return          
		}
	}

	private void processAtomEnded(long l)
		throws ParserException
	{
		for(; !containerAtoms.isEmpty() && ((Atom.ContainerAtom)containerAtoms.peek()).endPosition == l; onContainerAtomRead((Atom.ContainerAtom)containerAtoms.pop()));
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ArrayDeque containerAtoms>
	//    2    4:invokevirtual   #383 <Method boolean ArrayDeque.isEmpty()>
	//    3    7:ifne            45
	//    4   10:aload_0         
	//    5   11:getfield        #211 <Field ArrayDeque containerAtoms>
	//    6   14:invokevirtual   #387 <Method Object ArrayDeque.peek()>
	//    7   17:checkcast       #366 <Class Atom$ContainerAtom>
	//    8   20:getfield        #849 <Field long Atom$ContainerAtom.endPosition>
	//    9   23:lload_1         
	//   10   24:lcmp            
	//   11   25:ifne            45
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #211 <Field ArrayDeque containerAtoms>
	//   15   33:invokevirtual   #852 <Method Object ArrayDeque.pop()>
	//   16   36:checkcast       #366 <Class Atom$ContainerAtom>
	//   17   39:invokespecial   #854 <Method void onContainerAtomRead(Atom$ContainerAtom)>
	//*  18   42:goto            0
		enterReadingAtomHeaderState();
	//   19   45:aload_0         
	//   20   46:invokespecial   #229 <Method void enterReadingAtomHeaderState()>
	//   21   49:return          
	}

	private boolean readAtomHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(atomHeaderBytesRead == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #234 <Field int atomHeaderBytesRead>
	//*   2    4:ifne            65
		{
			if(!extractorinput.readFully(atomHeader.data, 0, 8, true))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #189 <Field ParsableByteArray atomHeader>
	//*   6   12:getfield        #280 <Field byte[] ParsableByteArray.data>
	//*   7   15:iconst_0        
	//*   8   16:bipush          8
	//*   9   18:iconst_1        
	//*  10   19:invokeinterface #866 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  11   24:ifne            29
				return false;
	//   12   27:iconst_0        
	//   13   28:ireturn         
			atomHeaderBytesRead = 8;
	//   14   29:aload_0         
	//   15   30:bipush          8
	//   16   32:putfield        #234 <Field int atomHeaderBytesRead>
			atomHeader.setPosition(0);
	//   17   35:aload_0         
	//   18   36:getfield        #189 <Field ParsableByteArray atomHeader>
	//   19   39:iconst_0        
	//   20   40:invokevirtual   #395 <Method void ParsableByteArray.setPosition(int)>
			atomSize = atomHeader.readUnsignedInt();
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #189 <Field ParsableByteArray atomHeader>
	//   24   48:invokevirtual   #406 <Method long ParsableByteArray.readUnsignedInt()>
	//   25   51:putfield        #868 <Field long atomSize>
			atomType = atomHeader.readInt();
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #189 <Field ParsableByteArray atomHeader>
	//   29   59:invokevirtual   #582 <Method int ParsableByteArray.readInt()>
	//   30   62:putfield        #870 <Field int atomType>
		}
		if(atomSize == 1L)
	//*  31   65:aload_0         
	//*  32   66:getfield        #868 <Field long atomSize>
	//*  33   69:lconst_1        
	//*  34   70:lcmp            
	//*  35   71:ifne            116
		{
			extractorinput.readFully(atomHeader.data, 8, 8);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #189 <Field ParsableByteArray atomHeader>
	//   39   79:getfield        #280 <Field byte[] ParsableByteArray.data>
	//   40   82:bipush          8
	//   41   84:bipush          8
	//   42   86:invokeinterface #872 <Method void ExtractorInput.readFully(byte[], int, int)>
			atomHeaderBytesRead = atomHeaderBytesRead + 8;
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:getfield        #234 <Field int atomHeaderBytesRead>
	//   46   96:bipush          8
	//   47   98:iadd            
	//   48   99:putfield        #234 <Field int atomHeaderBytesRead>
			atomSize = atomHeader.readUnsignedLongToLong();
	//   49  102:aload_0         
	//   50  103:aload_0         
	//   51  104:getfield        #189 <Field ParsableByteArray atomHeader>
	//   52  107:invokevirtual   #589 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   53  110:putfield        #868 <Field long atomSize>
		} else
	//*  54  113:goto            203
		if(atomSize == 0L)
	//*  55  116:aload_0         
	//*  56  117:getfield        #868 <Field long atomSize>
	//*  57  120:lconst_0        
	//*  58  121:lcmp            
	//*  59  122:ifne            203
		{
			long l3 = extractorinput.getLength();
	//   60  125:aload_1         
	//   61  126:invokeinterface #875 <Method long ExtractorInput.getLength()>
	//   62  131:lstore          6
			long l = l3;
	//   63  133:lload           6
	//   64  135:lstore          4
			if(l3 == -1L)
	//*  65  137:lload           6
	//*  66  139:ldc2w           #876 <Long -1L>
	//*  67  142:lcmp            
	//*  68  143:ifne            175
			{
				l = l3;
	//   69  146:lload           6
	//   70  148:lstore          4
				if(!containerAtoms.isEmpty())
	//*  71  150:aload_0         
	//*  72  151:getfield        #211 <Field ArrayDeque containerAtoms>
	//*  73  154:invokevirtual   #383 <Method boolean ArrayDeque.isEmpty()>
	//*  74  157:ifne            175
					l = ((Atom.ContainerAtom)containerAtoms.peek()).endPosition;
	//   75  160:aload_0         
	//   76  161:getfield        #211 <Field ArrayDeque containerAtoms>
	//   77  164:invokevirtual   #387 <Method Object ArrayDeque.peek()>
	//   78  167:checkcast       #366 <Class Atom$ContainerAtom>
	//   79  170:getfield        #849 <Field long Atom$ContainerAtom.endPosition>
	//   80  173:lstore          4
			}
			if(l != -1L)
	//*  81  175:lload           4
	//*  82  177:ldc2w           #876 <Long -1L>
	//*  83  180:lcmp            
	//*  84  181:ifeq            203
				atomSize = (l - extractorinput.getPosition()) + (long)atomHeaderBytesRead;
	//   85  184:aload_0         
	//   86  185:lload           4
	//   87  187:aload_1         
	//   88  188:invokeinterface #880 <Method long ExtractorInput.getPosition()>
	//   89  193:lsub            
	//   90  194:aload_0         
	//   91  195:getfield        #234 <Field int atomHeaderBytesRead>
	//   92  198:i2l             
	//   93  199:ladd            
	//   94  200:putfield        #868 <Field long atomSize>
		}
		if(atomSize < (long)atomHeaderBytesRead)
	//*  95  203:aload_0         
	//*  96  204:getfield        #868 <Field long atomSize>
	//*  97  207:aload_0         
	//*  98  208:getfield        #234 <Field int atomHeaderBytesRead>
	//*  99  211:i2l             
	//* 100  212:lcmp            
	//* 101  213:ifge            227
			throw new ParserException("Atom size less than header length (unsupported).");
	//  102  216:new             #364 <Class ParserException>
	//  103  219:dup             
	//  104  220:ldc2            #882 <String "Atom size less than header length (unsupported).">
	//  105  223:invokespecial   #625 <Method void ParserException(String)>
	//  106  226:athrow          
		long l1 = extractorinput.getPosition() - (long)atomHeaderBytesRead;
	//  107  227:aload_1         
	//  108  228:invokeinterface #880 <Method long ExtractorInput.getPosition()>
	//  109  233:aload_0         
	//  110  234:getfield        #234 <Field int atomHeaderBytesRead>
	//  111  237:i2l             
	//  112  238:lsub            
	//  113  239:lstore          4
		if(atomType == Atom.TYPE_moof)
	//* 114  241:aload_0         
	//* 115  242:getfield        #870 <Field int atomType>
	//* 116  245:getstatic       #376 <Field int Atom.TYPE_moof>
	//* 117  248:icmpne          310
		{
			int j = trackBundles.size();
	//  118  251:aload_0         
	//  119  252:getfield        #218 <Field SparseArray trackBundles>
	//  120  255:invokevirtual   #240 <Method int SparseArray.size()>
	//  121  258:istore_3        
			for(int i = 0; i < j; i++)
	//* 122  259:iconst_0        
	//* 123  260:istore_2        
	//* 124  261:iload_2         
	//* 125  262:iload_3         
	//* 126  263:icmpge          310
			{
				TrackFragment trackfragment = ((TrackBundle)trackBundles.valueAt(i)).fragment;
	//  127  266:aload_0         
	//  128  267:getfield        #218 <Field SparseArray trackBundles>
	//  129  270:iload_2         
	//  130  271:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//  131  274:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//  132  277:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//  133  280:astore          8
				trackfragment.atomPosition = l1;
	//  134  282:aload           8
	//  135  284:lload           4
	//  136  286:putfield        #885 <Field long TrackFragment.atomPosition>
				trackfragment.auxiliaryDataPosition = l1;
	//  137  289:aload           8
	//  138  291:lload           4
	//  139  293:putfield        #628 <Field long TrackFragment.auxiliaryDataPosition>
				trackfragment.dataPosition = l1;
	//  140  296:aload           8
	//  141  298:lload           4
	//  142  300:putfield        #716 <Field long TrackFragment.dataPosition>
			}

	//  143  303:iload_2         
	//  144  304:iconst_1        
	//  145  305:iadd            
	//  146  306:istore_2        
		}
	//* 147  307:goto            261
		if(atomType == Atom.TYPE_mdat)
	//* 148  310:aload_0         
	//* 149  311:getfield        #870 <Field int atomType>
	//* 150  314:getstatic       #888 <Field int Atom.TYPE_mdat>
	//* 151  317:icmpne          377
		{
			currentTrackBundle = null;
	//  152  320:aload_0         
	//  153  321:aconst_null     
	//  154  322:putfield        #890 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
			endOfMdatPosition = l1 + atomSize;
	//  155  325:aload_0         
	//  156  326:lload           4
	//  157  328:aload_0         
	//  158  329:getfield        #868 <Field long atomSize>
	//  159  332:ladd            
	//  160  333:putfield        #892 <Field long endOfMdatPosition>
			if(!haveOutputSeekMap)
	//* 161  336:aload_0         
	//* 162  337:getfield        #463 <Field boolean haveOutputSeekMap>
	//* 163  340:ifne            370
			{
				extractorOutput.seekMap(((SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(durationUs, l1))));
	//  164  343:aload_0         
	//  165  344:getfield        #341 <Field ExtractorOutput extractorOutput>
	//  166  347:new             #894 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//  167  350:dup             
	//  168  351:aload_0         
	//  169  352:getfield        #222 <Field long durationUs>
	//  170  355:lload           4
	//  171  357:invokespecial   #897 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long, long)>
	//  172  360:invokeinterface #461 <Method void ExtractorOutput.seekMap(SeekMap)>
				haveOutputSeekMap = true;
	//  173  365:aload_0         
	//  174  366:iconst_1        
	//  175  367:putfield        #463 <Field boolean haveOutputSeekMap>
			}
			parserState = 2;
	//  176  370:aload_0         
	//  177  371:iconst_2        
	//  178  372:putfield        #232 <Field int parserState>
			return true;
	//  179  375:iconst_1        
	//  180  376:ireturn         
		}
		if(shouldParseContainerAtom(atomType))
	//* 181  377:aload_0         
	//* 182  378:getfield        #870 <Field int atomType>
	//* 183  381:invokestatic    #901 <Method boolean shouldParseContainerAtom(int)>
	//* 184  384:ifeq            451
		{
			long l2 = (extractorinput.getPosition() + atomSize) - 8L;
	//  185  387:aload_1         
	//  186  388:invokeinterface #880 <Method long ExtractorInput.getPosition()>
	//  187  393:aload_0         
	//  188  394:getfield        #868 <Field long atomSize>
	//  189  397:ladd            
	//  190  398:ldc2w           #902 <Long 8L>
	//  191  401:lsub            
	//  192  402:lstore          4
			containerAtoms.push(((Object) (new Atom.ContainerAtom(atomType, l2))));
	//  193  404:aload_0         
	//  194  405:getfield        #211 <Field ArrayDeque containerAtoms>
	//  195  408:new             #366 <Class Atom$ContainerAtom>
	//  196  411:dup             
	//  197  412:aload_0         
	//  198  413:getfield        #870 <Field int atomType>
	//  199  416:lload           4
	//  200  418:invokespecial   #906 <Method void Atom$ContainerAtom(int, long)>
	//  201  421:invokevirtual   #909 <Method void ArrayDeque.push(Object)>
			if(atomSize == (long)atomHeaderBytesRead)
	//* 202  424:aload_0         
	//* 203  425:getfield        #868 <Field long atomSize>
	//* 204  428:aload_0         
	//* 205  429:getfield        #234 <Field int atomHeaderBytesRead>
	//* 206  432:i2l             
	//* 207  433:lcmp            
	//* 208  434:ifne            445
			{
				processAtomEnded(l2);
	//  209  437:aload_0         
	//  210  438:lload           4
	//  211  440:invokespecial   #911 <Method void processAtomEnded(long)>
				return true;
	//  212  443:iconst_1        
	//  213  444:ireturn         
			} else
			{
				enterReadingAtomHeaderState();
	//  214  445:aload_0         
	//  215  446:invokespecial   #229 <Method void enterReadingAtomHeaderState()>
				return true;
	//  216  449:iconst_1        
	//  217  450:ireturn         
			}
		}
		if(shouldParseLeafAtom(atomType))
	//* 218  451:aload_0         
	//* 219  452:getfield        #870 <Field int atomType>
	//* 220  455:invokestatic    #914 <Method boolean shouldParseLeafAtom(int)>
	//* 221  458:ifeq            547
		{
			if(atomHeaderBytesRead != 8)
	//* 222  461:aload_0         
	//* 223  462:getfield        #234 <Field int atomHeaderBytesRead>
	//* 224  465:bipush          8
	//* 225  467:icmpeq          481
				throw new ParserException("Leaf atom defines extended atom size (unsupported).");
	//  226  470:new             #364 <Class ParserException>
	//  227  473:dup             
	//  228  474:ldc2            #916 <String "Leaf atom defines extended atom size (unsupported).">
	//  229  477:invokespecial   #625 <Method void ParserException(String)>
	//  230  480:athrow          
			if(atomSize > 0x7fffffffL)
	//* 231  481:aload_0         
	//* 232  482:getfield        #868 <Field long atomSize>
	//* 233  485:ldc2w           #917 <Long 0x7fffffffL>
	//* 234  488:lcmp            
	//* 235  489:ifle            503
			{
				throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
	//  236  492:new             #364 <Class ParserException>
	//  237  495:dup             
	//  238  496:ldc2            #920 <String "Leaf atom with length > 2147483647 (unsupported).">
	//  239  499:invokespecial   #625 <Method void ParserException(String)>
	//  240  502:athrow          
			} else
			{
				atomData = new ParsableByteArray((int)atomSize);
	//  241  503:aload_0         
	//  242  504:new             #186 <Class ParsableByteArray>
	//  243  507:dup             
	//  244  508:aload_0         
	//  245  509:getfield        #868 <Field long atomSize>
	//  246  512:l2i             
	//  247  513:invokespecial   #187 <Method void ParsableByteArray(int)>
	//  248  516:putfield        #922 <Field ParsableByteArray atomData>
				System.arraycopy(((Object) (atomHeader.data)), 0, ((Object) (atomData.data)), 0, 8);
	//  249  519:aload_0         
	//  250  520:getfield        #189 <Field ParsableByteArray atomHeader>
	//  251  523:getfield        #280 <Field byte[] ParsableByteArray.data>
	//  252  526:iconst_0        
	//  253  527:aload_0         
	//  254  528:getfield        #922 <Field ParsableByteArray atomData>
	//  255  531:getfield        #280 <Field byte[] ParsableByteArray.data>
	//  256  534:iconst_0        
	//  257  535:bipush          8
	//  258  537:invokestatic    #928 <Method void System.arraycopy(Object, int, Object, int, int)>
				parserState = 1;
	//  259  540:aload_0         
	//  260  541:iconst_1        
	//  261  542:putfield        #232 <Field int parserState>
				return true;
	//  262  545:iconst_1        
	//  263  546:ireturn         
			}
		}
		if(atomSize > 0x7fffffffL)
	//* 264  547:aload_0         
	//* 265  548:getfield        #868 <Field long atomSize>
	//* 266  551:ldc2w           #917 <Long 0x7fffffffL>
	//* 267  554:lcmp            
	//* 268  555:ifle            569
		{
			throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
	//  269  558:new             #364 <Class ParserException>
	//  270  561:dup             
	//  271  562:ldc2            #930 <String "Skipping atom with length > 2147483647 (unsupported).">
	//  272  565:invokespecial   #625 <Method void ParserException(String)>
	//  273  568:athrow          
		} else
		{
			atomData = null;
	//  274  569:aload_0         
	//  275  570:aconst_null     
	//  276  571:putfield        #922 <Field ParsableByteArray atomData>
			parserState = 1;
	//  277  574:aload_0         
	//  278  575:iconst_1        
	//  279  576:putfield        #232 <Field int parserState>
			return true;
	//  280  579:iconst_1        
	//  281  580:ireturn         
		}
	}

	private void readAtomPayload(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i = (int)atomSize - atomHeaderBytesRead;
	//    0    0:aload_0         
	//    1    1:getfield        #868 <Field long atomSize>
	//    2    4:l2i             
	//    3    5:aload_0         
	//    4    6:getfield        #234 <Field int atomHeaderBytesRead>
	//    5    9:isub            
	//    6   10:istore_2        
		if(atomData != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #922 <Field ParsableByteArray atomData>
	//*   9   15:ifnull          62
		{
			extractorinput.readFully(atomData.data, 8, i);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #922 <Field ParsableByteArray atomData>
	//   13   23:getfield        #280 <Field byte[] ParsableByteArray.data>
	//   14   26:bipush          8
	//   15   28:iload_2         
	//   16   29:invokeinterface #872 <Method void ExtractorInput.readFully(byte[], int, int)>
			onLeafAtomRead(new Atom.LeafAtom(atomType, atomData), extractorinput.getPosition());
	//   17   34:aload_0         
	//   18   35:new             #264 <Class Atom$LeafAtom>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #870 <Field int atomType>
	//   22   43:aload_0         
	//   23   44:getfield        #922 <Field ParsableByteArray atomData>
	//   24   47:invokespecial   #935 <Method void Atom$LeafAtom(int, ParsableByteArray)>
	//   25   50:aload_1         
	//   26   51:invokeinterface #880 <Method long ExtractorInput.getPosition()>
	//   27   56:invokespecial   #937 <Method void onLeafAtomRead(Atom$LeafAtom, long)>
		} else
	//*  28   59:goto            69
		{
			extractorinput.skipFully(i);
	//   29   62:aload_1         
	//   30   63:iload_2         
	//   31   64:invokeinterface #940 <Method void ExtractorInput.skipFully(int)>
		}
		processAtomEnded(extractorinput.getPosition());
	//   32   69:aload_0         
	//   33   70:aload_1         
	//   34   71:invokeinterface #880 <Method long ExtractorInput.getPosition()>
	//   35   76:invokespecial   #911 <Method void processAtomEnded(long)>
	//   36   79:return          
	}

	private void readEncryptionData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int k = trackBundles.size();
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field SparseArray trackBundles>
	//    2    4:invokevirtual   #240 <Method int SparseArray.size()>
	//    3    7:istore_3        
		TrackBundle trackbundle = null;
	//    4    8:aconst_null     
	//    5    9:astore          8
		long l = 0xffffffffL;
	//    6   11:ldc2w           #133 <Long 0xffffffffL>
	//    7   14:lstore          4
		for(int i = 0; i < k;)
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iload_3         
	//*  12   20:icmpge          109
		{
			TrackFragment trackfragment = ((TrackBundle)trackBundles.valueAt(i)).fragment;
	//   13   23:aload_0         
	//   14   24:getfield        #218 <Field SparseArray trackBundles>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//   17   31:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   18   34:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   19   37:astore          10
			TrackBundle trackbundle1 = trackbundle;
	//   20   39:aload           8
	//   21   41:astore          9
			long l1 = l;
	//   22   43:lload           4
	//   23   45:lstore          6
			if(trackfragment.sampleEncryptionDataNeedsFill)
	//*  24   47:aload           10
	//*  25   49:getfield        #944 <Field boolean TrackFragment.sampleEncryptionDataNeedsFill>
	//*  26   52:ifeq            94
			{
				trackbundle1 = trackbundle;
	//   27   55:aload           8
	//   28   57:astore          9
				l1 = l;
	//   29   59:lload           4
	//   30   61:lstore          6
				if(trackfragment.auxiliaryDataPosition < l)
	//*  31   63:aload           10
	//*  32   65:getfield        #628 <Field long TrackFragment.auxiliaryDataPosition>
	//*  33   68:lload           4
	//*  34   70:lcmp            
	//*  35   71:ifge            94
				{
					l1 = trackfragment.auxiliaryDataPosition;
	//   36   74:aload           10
	//   37   76:getfield        #628 <Field long TrackFragment.auxiliaryDataPosition>
	//   38   79:lstore          6
					trackbundle1 = (TrackBundle)trackBundles.valueAt(i);
	//   39   81:aload_0         
	//   40   82:getfield        #218 <Field SparseArray trackBundles>
	//   41   85:iload_2         
	//   42   86:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//   43   89:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   44   92:astore          9
				}
			}
			i++;
	//   45   94:iload_2         
	//   46   95:iconst_1        
	//   47   96:iadd            
	//   48   97:istore_2        
			trackbundle = trackbundle1;
	//   49   98:aload           9
	//   50  100:astore          8
			l = l1;
	//   51  102:lload           6
	//   52  104:lstore          4
		}

	//*  53  106:goto            18
		if(trackbundle == null)
	//*  54  109:aload           8
	//*  55  111:ifnonnull       120
		{
			parserState = 3;
	//   56  114:aload_0         
	//   57  115:iconst_3        
	//   58  116:putfield        #232 <Field int parserState>
			return;
	//   59  119:return          
		}
		int j = (int)(l - extractorinput.getPosition());
	//   60  120:lload           4
	//   61  122:aload_1         
	//   62  123:invokeinterface #880 <Method long ExtractorInput.getPosition()>
	//   63  128:lsub            
	//   64  129:l2i             
	//   65  130:istore_2        
		if(j < 0)
	//*  66  131:iload_2         
	//*  67  132:ifge            146
		{
			throw new ParserException("Offset to encryption data was negative.");
	//   68  135:new             #364 <Class ParserException>
	//   69  138:dup             
	//   70  139:ldc2            #946 <String "Offset to encryption data was negative.">
	//   71  142:invokespecial   #625 <Method void ParserException(String)>
	//   72  145:athrow          
		} else
		{
			extractorinput.skipFully(j);
	//   73  146:aload_1         
	//   74  147:iload_2         
	//   75  148:invokeinterface #940 <Method void ExtractorInput.skipFully(int)>
			trackbundle.fragment.fillEncryptionData(extractorinput);
	//   76  153:aload           8
	//   77  155:getfield        #320 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   78  158:aload_1         
	//   79  159:invokevirtual   #948 <Method void TrackFragment.fillEncryptionData(ExtractorInput)>
			return;
	//   80  162:return          
		}
	}

	private boolean readSample(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #951 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #953 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #956 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private static boolean shouldParseContainerAtom(int i)
	{
		return i == Atom.TYPE_moov || i == Atom.TYPE_trak || i == Atom.TYPE_mdia || i == Atom.TYPE_minf || i == Atom.TYPE_stbl || i == Atom.TYPE_moof || i == Atom.TYPE_traf || i == Atom.TYPE_mvex || i == Atom.TYPE_edts;
	//    0    0:iload_0         
	//    1    1:getstatic       #370 <Field int Atom.TYPE_moov>
	//    2    4:icmpeq          68
	//    3    7:iload_0         
	//    4    8:getstatic       #527 <Field int Atom.TYPE_trak>
	//    5   11:icmpeq          68
	//    6   14:iload_0         
	//    7   15:getstatic       #959 <Field int Atom.TYPE_mdia>
	//    8   18:icmpeq          68
	//    9   21:iload_0         
	//   10   22:getstatic       #962 <Field int Atom.TYPE_minf>
	//   11   25:icmpeq          68
	//   12   28:iload_0         
	//   13   29:getstatic       #965 <Field int Atom.TYPE_stbl>
	//   14   32:icmpeq          68
	//   15   35:iload_0         
	//   16   36:getstatic       #376 <Field int Atom.TYPE_moof>
	//   17   39:icmpeq          68
	//   18   42:iload_0         
	//   19   43:getstatic       #592 <Field int Atom.TYPE_traf>
	//   20   46:icmpeq          68
	//   21   49:iload_0         
	//   22   50:getstatic       #494 <Field int Atom.TYPE_mvex>
	//   23   53:icmpeq          68
	//   24   56:iload_0         
	//   25   57:getstatic       #968 <Field int Atom.TYPE_edts>
	//   26   60:icmpne          66
	//   27   63:goto            68
	//   28   66:iconst_0        
	//   29   67:ireturn         
	//   30   68:iconst_1        
	//   31   69:ireturn         
	}

	private static boolean shouldParseLeafAtom(int i)
	{
		return i == Atom.TYPE_hdlr || i == Atom.TYPE_mdhd || i == Atom.TYPE_mvhd || i == Atom.TYPE_sidx || i == Atom.TYPE_stsd || i == Atom.TYPE_tfdt || i == Atom.TYPE_tfhd || i == Atom.TYPE_tkhd || i == Atom.TYPE_trex || i == Atom.TYPE_trun || i == Atom.TYPE_pssh || i == Atom.TYPE_saiz || i == Atom.TYPE_saio || i == Atom.TYPE_senc || i == Atom.TYPE_uuid || i == Atom.TYPE_sbgp || i == Atom.TYPE_sgpd || i == Atom.TYPE_elst || i == Atom.TYPE_mehd || i == Atom.TYPE_emsg;
	//    0    0:iload_0         
	//    1    1:getstatic       #971 <Field int Atom.TYPE_hdlr>
	//    2    4:icmpeq          145
	//    3    7:iload_0         
	//    4    8:getstatic       #974 <Field int Atom.TYPE_mdhd>
	//    5   11:icmpeq          145
	//    6   14:iload_0         
	//    7   15:getstatic       #530 <Field int Atom.TYPE_mvhd>
	//    8   18:icmpeq          145
	//    9   21:iload_0         
	//   10   22:getstatic       #437 <Field int Atom.TYPE_sidx>
	//   11   25:icmpeq          145
	//   12   28:iload_0         
	//   13   29:getstatic       #977 <Field int Atom.TYPE_stsd>
	//   14   32:icmpeq          145
	//   15   35:iload_0         
	//   16   36:getstatic       #749 <Field int Atom.TYPE_tfdt>
	//   17   39:icmpeq          145
	//   18   42:iload_0         
	//   19   43:getstatic       #738 <Field int Atom.TYPE_tfhd>
	//   20   46:icmpeq          145
	//   21   49:iload_0         
	//   22   50:getstatic       #980 <Field int Atom.TYPE_tkhd>
	//   23   53:icmpeq          145
	//   24   56:iload_0         
	//   25   57:getstatic       #501 <Field int Atom.TYPE_trex>
	//   26   60:icmpeq          145
	//   27   63:iload_0         
	//   28   64:getstatic       #829 <Field int Atom.TYPE_trun>
	//   29   67:icmpeq          145
	//   30   70:iload_0         
	//   31   71:getstatic       #272 <Field int Atom.TYPE_pssh>
	//   32   74:icmpeq          145
	//   33   77:iload_0         
	//   34   78:getstatic       #764 <Field int Atom.TYPE_saiz>
	//   35   81:icmpeq          145
	//   36   84:iload_0         
	//   37   85:getstatic       #769 <Field int Atom.TYPE_saio>
	//   38   88:icmpeq          145
	//   39   91:iload_0         
	//   40   92:getstatic       #774 <Field int Atom.TYPE_senc>
	//   41   95:icmpeq          145
	//   42   98:iload_0         
	//   43   99:getstatic       #790 <Field int Atom.TYPE_uuid>
	//   44  102:icmpeq          145
	//   45  105:iload_0         
	//   46  106:getstatic       #779 <Field int Atom.TYPE_sbgp>
	//   47  109:icmpeq          145
	//   48  112:iload_0         
	//   49  113:getstatic       #782 <Field int Atom.TYPE_sgpd>
	//   50  116:icmpeq          145
	//   51  119:iload_0         
	//   52  120:getstatic       #983 <Field int Atom.TYPE_elst>
	//   53  123:icmpeq          145
	//   54  126:iload_0         
	//   55  127:getstatic       #517 <Field int Atom.TYPE_mehd>
	//   56  130:icmpeq          145
	//   57  133:iload_0         
	//   58  134:getstatic       #466 <Field int Atom.TYPE_emsg>
	//   59  137:icmpne          143
	//   60  140:goto            145
	//   61  143:iconst_0        
	//   62  144:ireturn         
	//   63  145:iconst_1        
	//   64  146:ireturn         
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #341 <Field ExtractorOutput extractorOutput>
		if(sideloadedTrack != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #174 <Field Track sideloadedTrack>
	//*   5    9:ifnull          75
		{
			extractoroutput = ((ExtractorOutput) (new TrackBundle(extractoroutput.track(0, sideloadedTrack.type))));
	//    6   12:new             #16  <Class FragmentedMp4Extractor$TrackBundle>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:aload_0         
	//   11   19:getfield        #174 <Field Track sideloadedTrack>
	//   12   22:getfield        #546 <Field int Track.type>
	//   13   25:invokeinterface #347 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   14   30:invokespecial   #549 <Method void FragmentedMp4Extractor$TrackBundle(TrackOutput)>
	//   15   33:astore_1        
			((TrackBundle) (extractoroutput)).init(sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #174 <Field Track sideloadedTrack>
	//   19   39:new             #246 <Class DefaultSampleValues>
	//   20   42:dup             
	//   21   43:iconst_0        
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:iconst_0        
	//   25   47:invokespecial   #731 <Method void DefaultSampleValues(int, int, int, int)>
	//   26   50:invokevirtual   #555 <Method void FragmentedMp4Extractor$TrackBundle.init(Track, DefaultSampleValues)>
			trackBundles.put(0, ((Object) (extractoroutput)));
	//   27   53:aload_0         
	//   28   54:getfield        #218 <Field SparseArray trackBundles>
	//   29   57:iconst_0        
	//   30   58:aload_1         
	//   31   59:invokevirtual   #514 <Method void SparseArray.put(int, Object)>
			maybeInitExtraTracks();
	//   32   62:aload_0         
	//   33   63:invokespecial   #564 <Method void maybeInitExtraTracks()>
			extractorOutput.endTracks();
	//   34   66:aload_0         
	//   35   67:getfield        #341 <Field ExtractorOutput extractorOutput>
	//   36   70:invokeinterface #567 <Method void ExtractorOutput.endTracks()>
		}
	//   37   75:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
_L6:
		parserState;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field int parserState>
		JVM INSTR tableswitch 0 2: default 32
	//	               0 58
	//	               1 50
	//	               2 42;
	//    2    4:tableswitch     0 2: default 32
	//	               0 58
	//	               1 50
	//	               2 42
		   goto _L1 _L2 _L3 _L4
_L2:
		continue; /* Loop/switch isn't completed */
_L1:
		if(readSample(extractorinput))
	//*   3   32:aload_0         
	//*   4   33:aload_1         
	//*   5   34:invokespecial   #988 <Method boolean readSample(ExtractorInput)>
	//*   6   37:ifeq            0
			return 0;
	//    7   40:iconst_0        
	//    8   41:ireturn         
		continue; /* Loop/switch isn't completed */
_L4:
		readEncryptionData(extractorinput);
	//    9   42:aload_0         
	//   10   43:aload_1         
	//   11   44:invokespecial   #990 <Method void readEncryptionData(ExtractorInput)>
		continue; /* Loop/switch isn't completed */
	//   12   47:goto            0
_L3:
		readAtomPayload(extractorinput);
	//   13   50:aload_0         
	//   14   51:aload_1         
	//   15   52:invokespecial   #992 <Method void readAtomPayload(ExtractorInput)>
		if(true) goto _L6; else goto _L5
	//   16   55:goto            0
_L5:
		if(readAtomHeader(extractorinput)) goto _L6; else goto _L7
	//   17   58:aload_0         
	//   18   59:aload_1         
	//   19   60:invokespecial   #994 <Method boolean readAtomHeader(ExtractorInput)>
	//   20   63:ifne            0
_L7:
		return -1;
	//   21   66:iconst_m1       
	//   22   67:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		int j = trackBundles.size();
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field SparseArray trackBundles>
	//    2    4:invokevirtual   #240 <Method int SparseArray.size()>
	//    3    7:istore          6
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          5
	//*   6   12:iload           5
	//*   7   14:iload           6
	//*   8   16:icmpge          43
			((TrackBundle)trackBundles.valueAt(i)).reset();
	//    9   19:aload_0         
	//   10   20:getfield        #218 <Field SparseArray trackBundles>
	//   11   23:iload           5
	//   12   25:invokevirtual   #244 <Method Object SparseArray.valueAt(int)>
	//   13   28:checkcast       #16  <Class FragmentedMp4Extractor$TrackBundle>
	//   14   31:invokevirtual   #746 <Method void FragmentedMp4Extractor$TrackBundle.reset()>

	//   15   34:iload           5
	//   16   36:iconst_1        
	//   17   37:iadd            
	//   18   38:istore          5
	//*  19   40:goto            12
		pendingMetadataSampleInfos.clear();
	//   20   43:aload_0         
	//   21   44:getfield        #213 <Field ArrayDeque pendingMetadataSampleInfos>
	//   22   47:invokevirtual   #998 <Method void ArrayDeque.clear()>
		pendingMetadataSampleBytes = 0;
	//   23   50:aload_0         
	//   24   51:iconst_0        
	//   25   52:putfield        #429 <Field int pendingMetadataSampleBytes>
		pendingSeekTimeUs = l1;
	//   26   55:aload_0         
	//   27   56:lload_3         
	//   28   57:putfield        #224 <Field long pendingSeekTimeUs>
		containerAtoms.clear();
	//   29   60:aload_0         
	//   30   61:getfield        #211 <Field ArrayDeque containerAtoms>
	//   31   64:invokevirtual   #998 <Method void ArrayDeque.clear()>
		enterReadingAtomHeaderState();
	//   32   67:aload_0         
	//   33   68:invokespecial   #229 <Method void enterReadingAtomHeaderState()>
	//   34   71:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return Sniffer.sniffFragmented(extractorinput);
	//    0    0:aload_1         
	//    1    1:invokestatic    #1004 <Method boolean Sniffer.sniffFragmented(ExtractorInput)>
	//    2    4:ireturn         
	}

	private static final Format EMSG_FORMAT = Format.createSampleFormat(((String) (null)), "application/x-emsg", 0xffffffffL);
	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new FragmentedMp4Extractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class FragmentedMp4Extractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void FragmentedMp4Extractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	public static final int FLAG_ENABLE_EMSG_TRACK = 4;
	private static final int FLAG_SIDELOADED = 8;
	public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
	public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
	public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
	private static final byte PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE[] = {
		-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
		108, 66, 124, 100, -115, -12
	};
	private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
	private static final int STATE_READING_ATOM_HEADER = 0;
	private static final int STATE_READING_ATOM_PAYLOAD = 1;
	private static final int STATE_READING_ENCRYPTION_DATA = 2;
	private static final int STATE_READING_SAMPLE_CONTINUE = 4;
	private static final int STATE_READING_SAMPLE_START = 3;
	private static final String TAG = "FragmentedMp4Extractor";
	private final TrackOutput additionalEmsgTrackOutput;
	private ParsableByteArray atomData;
	private final ParsableByteArray atomHeader;
	private int atomHeaderBytesRead;
	private long atomSize;
	private int atomType;
	private TrackOutput cea608TrackOutputs[];
	private final List closedCaptionFormats;
	private final ArrayDeque containerAtoms;
	private TrackBundle currentTrackBundle;
	private long durationUs;
	private TrackOutput emsgTrackOutputs[];
	private long endOfMdatPosition;
	private final byte extendedTypeScratch[];
	private ExtractorOutput extractorOutput;
	private final int flags;
	private boolean haveOutputSeekMap;
	private final ParsableByteArray nalBuffer;
	private final ParsableByteArray nalPrefix;
	private final ParsableByteArray nalStartCode;
	private int parserState;
	private int pendingMetadataSampleBytes;
	private final ArrayDeque pendingMetadataSampleInfos;
	private long pendingSeekTimeUs;
	private boolean processSeiNalUnitPayload;
	private int sampleBytesWritten;
	private int sampleCurrentNalBytesRemaining;
	private int sampleSize;
	private long segmentIndexEarliestPresentationTimeUs;
	private final DrmInitData sideloadedDrmInitData;
	private final Track sideloadedTrack;
	private final TimestampAdjuster timestampAdjuster;
	private final SparseArray trackBundles;

	static 
	{
	//    0    0:new             #8   <Class FragmentedMp4Extractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #102 <Method void FragmentedMp4Extractor$1()>
	//    3    7:putstatic       #104 <Field ExtractorsFactory FACTORY>
	//    4   10:ldc1            #106 <String "seig">
	//    5   12:invokestatic    #112 <Method int Util.getIntegerCodeForString(String)>
	//    6   15:putstatic       #114 <Field int SAMPLE_GROUP_TYPE_seig>
	//    7   18:bipush          16
	//    8   20:newarray        byte[]
	//    9   22:dup             
	//   10   23:iconst_0        
	//   11   24:ldc1            #115 <Int -94>
	//   12   26:bastore         
	//   13   27:dup             
	//   14   28:iconst_1        
	//   15   29:ldc1            #116 <Int 57>
	//   16   31:bastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:ldc1            #117 <Int 79>
	//   20   36:bastore         
	//   21   37:dup             
	//   22   38:iconst_3        
	//   23   39:ldc1            #118 <Int 82>
	//   24   41:bastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:ldc1            #119 <Int 90>
	//   28   46:bastore         
	//   29   47:dup             
	//   30   48:iconst_5        
	//   31   49:ldc1            #120 <Int -101>
	//   32   51:bastore         
	//   33   52:dup             
	//   34   53:bipush          6
	//   35   55:ldc1            #117 <Int 79>
	//   36   57:bastore         
	//   37   58:dup             
	//   38   59:bipush          7
	//   39   61:ldc1            #121 <Int 20>
	//   40   63:bastore         
	//   41   64:dup             
	//   42   65:bipush          8
	//   43   67:ldc1            #115 <Int -94>
	//   44   69:bastore         
	//   45   70:dup             
	//   46   71:bipush          9
	//   47   73:ldc1            #122 <Int 68>
	//   48   75:bastore         
	//   49   76:dup             
	//   50   77:bipush          10
	//   51   79:ldc1            #123 <Int 108>
	//   52   81:bastore         
	//   53   82:dup             
	//   54   83:bipush          11
	//   55   85:ldc1            #124 <Int 66>
	//   56   87:bastore         
	//   57   88:dup             
	//   58   89:bipush          12
	//   59   91:ldc1            #125 <Int 124>
	//   60   93:bastore         
	//   61   94:dup             
	//   62   95:bipush          13
	//   63   97:ldc1            #126 <Int 100>
	//   64   99:bastore         
	//   65  100:dup             
	//   66  101:bipush          14
	//   67  103:ldc1            #127 <Int -115>
	//   68  105:bastore         
	//   69  106:dup             
	//   70  107:bipush          15
	//   71  109:ldc1            #128 <Int -12>
	//   72  111:bastore         
	//   73  112:putstatic       #130 <Field byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE>
	//   74  115:aconst_null     
	//   75  116:ldc1            #132 <String "application/x-emsg">
	//   76  118:ldc2w           #133 <Long 0xffffffffL>
	//   77  121:invokestatic    #140 <Method Format Format.createSampleFormat(String, String, long)>
	//   78  124:putstatic       #142 <Field Format EMSG_FORMAT>
	//*  79  127:return          
	}
}
