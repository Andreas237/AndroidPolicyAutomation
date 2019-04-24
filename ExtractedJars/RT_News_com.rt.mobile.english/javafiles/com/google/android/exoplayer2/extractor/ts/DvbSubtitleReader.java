// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class DvbSubtitleReader
	implements ElementaryStreamReader
{

	public DvbSubtitleReader(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		subtitleInfos = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field List subtitleInfos>
		outputs = new TrackOutput[list.size()];
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method int List.size()>
	//    8   16:anewarray       TrackOutput[]
	//    9   19:putfield        #35  <Field TrackOutput[] outputs>
	//   10   22:return          
	}

	private boolean checkNextByte(ParsableByteArray parsablebytearray, int i)
	{
		if(parsablebytearray.bytesLeft() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #45  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(parsablebytearray.readUnsignedByte() != i)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//*   7   13:iload_2         
	//*   8   14:icmpeq          22
			writingSample = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #50  <Field boolean writingSample>
		bytesToCheck = bytesToCheck - 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #52  <Field int bytesToCheck>
	//   15   27:iconst_1        
	//   16   28:isub            
	//   17   29:putfield        #52  <Field int bytesToCheck>
		return writingSample;
	//   18   32:aload_0         
	//   19   33:getfield        #50  <Field boolean writingSample>
	//   20   36:ireturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(writingSample)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean writingSample>
	//*   2    4:ifeq            115
		{
			if(bytesToCheck == 2 && !checkNextByte(parsablebytearray, 32))
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field int bytesToCheck>
	//*   5   11:iconst_2        
	//*   6   12:icmpne          26
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:bipush          32
	//*  10   19:invokespecial   #56  <Method boolean checkNextByte(ParsableByteArray, int)>
	//*  11   22:ifne            26
				return;
	//   12   25:return          
			int j = bytesToCheck;
	//   13   26:aload_0         
	//   14   27:getfield        #52  <Field int bytesToCheck>
	//   15   30:istore_3        
			int i = 0;
	//   16   31:iconst_0        
	//   17   32:istore_2        
			if(j == 1 && !checkNextByte(parsablebytearray, 0))
	//*  18   33:iload_3         
	//*  19   34:iconst_1        
	//*  20   35:icmpne          48
	//*  21   38:aload_0         
	//*  22   39:aload_1         
	//*  23   40:iconst_0        
	//*  24   41:invokespecial   #56  <Method boolean checkNextByte(ParsableByteArray, int)>
	//*  25   44:ifne            48
				return;
	//   26   47:return          
			j = parsablebytearray.getPosition();
	//   27   48:aload_1         
	//   28   49:invokevirtual   #59  <Method int ParsableByteArray.getPosition()>
	//   29   52:istore_3        
			int k = parsablebytearray.bytesLeft();
	//   30   53:aload_1         
	//   31   54:invokevirtual   #45  <Method int ParsableByteArray.bytesLeft()>
	//   32   57:istore          4
			TrackOutput atrackoutput[] = outputs;
	//   33   59:aload_0         
	//   34   60:getfield        #35  <Field TrackOutput[] outputs>
	//   35   63:astore          6
			for(int l = atrackoutput.length; i < l; i++)
	//*  36   65:aload           6
	//*  37   67:arraylength     
	//*  38   68:istore          5
	//*  39   70:iload_2         
	//*  40   71:iload           5
	//*  41   73:icmpge          104
			{
				TrackOutput trackoutput = atrackoutput[i];
	//   42   76:aload           6
	//   43   78:iload_2         
	//   44   79:aaload          
	//   45   80:astore          7
				parsablebytearray.setPosition(j);
	//   46   82:aload_1         
	//   47   83:iload_3         
	//   48   84:invokevirtual   #63  <Method void ParsableByteArray.setPosition(int)>
				trackoutput.sampleData(parsablebytearray, k);
	//   49   87:aload           7
	//   50   89:aload_1         
	//   51   90:iload           4
	//   52   92:invokeinterface #67  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			}

	//   53   97:iload_2         
	//   54   98:iconst_1        
	//   55   99:iadd            
	//   56  100:istore_2        
	//*  57  101:goto            70
			sampleBytesWritten = sampleBytesWritten + k;
	//   58  104:aload_0         
	//   59  105:aload_0         
	//   60  106:getfield        #69  <Field int sampleBytesWritten>
	//   61  109:iload           4
	//   62  111:iadd            
	//   63  112:putfield        #69  <Field int sampleBytesWritten>
		}
	//   64  115:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		for(int i = 0; i < outputs.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #35  <Field TrackOutput[] outputs>
	//*   5    7:arraylength     
	//*   6    8:icmpge          91
		{
			TsPayloadReader.DvbSubtitleInfo dvbsubtitleinfo = (TsPayloadReader.DvbSubtitleInfo)subtitleInfos.get(i);
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field List subtitleInfos>
	//    9   15:iload_3         
	//   10   16:invokeinterface #75  <Method Object List.get(int)>
	//   11   21:checkcast       #77  <Class TsPayloadReader$DvbSubtitleInfo>
	//   12   24:astore          4
			trackidgenerator.generateNewId();
	//   13   26:aload_2         
	//   14   27:invokevirtual   #82  <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
			TrackOutput trackoutput = extractoroutput.track(trackidgenerator.getTrackId(), 3);
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokevirtual   #85  <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   18   35:iconst_3        
	//   19   36:invokeinterface #91  <Method TrackOutput ExtractorOutput.track(int, int)>
	//   20   41:astore          5
			trackoutput.format(Format.createImageSampleFormat(trackidgenerator.getFormatId(), "application/dvbsubs", ((String) (null)), -1, 0, Collections.singletonList(((Object) (dvbsubtitleinfo.initializationData))), dvbsubtitleinfo.language, ((com.google.android.exoplayer2.drm.DrmInitData) (null))));
	//   21   43:aload           5
	//   22   45:aload_2         
	//   23   46:invokevirtual   #95  <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//   24   49:ldc1            #97  <String "application/dvbsubs">
	//   25   51:aconst_null     
	//   26   52:iconst_m1       
	//   27   53:iconst_0        
	//   28   54:aload           4
	//   29   56:getfield        #101 <Field byte[] TsPayloadReader$DvbSubtitleInfo.initializationData>
	//   30   59:invokestatic    #107 <Method List Collections.singletonList(Object)>
	//   31   62:aload           4
	//   32   64:getfield        #111 <Field String TsPayloadReader$DvbSubtitleInfo.language>
	//   33   67:aconst_null     
	//   34   68:invokestatic    #117 <Method Format Format.createImageSampleFormat(String, String, String, int, int, List, String, com.google.android.exoplayer2.drm.DrmInitData)>
	//   35   71:invokeinterface #121 <Method void TrackOutput.format(Format)>
			outputs[i] = trackoutput;
	//   36   76:aload_0         
	//   37   77:getfield        #35  <Field TrackOutput[] outputs>
	//   38   80:iload_3         
	//   39   81:aload           5
	//   40   83:aastore         
		}

	//   41   84:iload_3         
	//   42   85:iconst_1        
	//   43   86:iadd            
	//   44   87:istore_3        
	//*  45   88:goto            2
	//   46   91:return          
	}

	public void packetFinished()
	{
		if(writingSample)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean writingSample>
	//*   2    4:ifeq            53
		{
			TrackOutput atrackoutput[] = outputs;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field TrackOutput[] outputs>
	//    5   11:astore_3        
			int j = atrackoutput.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          48
				atrackoutput[i].sampleMetadata(sampleTimeUs, 1, sampleBytesWritten, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:aload_0         
	//   18   26:getfield        #124 <Field long sampleTimeUs>
	//   19   29:iconst_1        
	//   20   30:aload_0         
	//   21   31:getfield        #69  <Field int sampleBytesWritten>
	//   22   34:iconst_0        
	//   23   35:aconst_null     
	//   24   36:invokeinterface #128 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>

	//   25   41:iload_1         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_1        
	//*  29   45:goto            17
			writingSample = false;
	//   30   48:aload_0         
	//   31   49:iconst_0        
	//   32   50:putfield        #50  <Field boolean writingSample>
		}
	//   33   53:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_3         
	//*   1    1:ifne            5
		{
			return;
	//    2    4:return          
		} else
		{
			writingSample = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #50  <Field boolean writingSample>
			sampleTimeUs = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #124 <Field long sampleTimeUs>
			sampleBytesWritten = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #69  <Field int sampleBytesWritten>
			bytesToCheck = 2;
	//   12   20:aload_0         
	//   13   21:iconst_2        
	//   14   22:putfield        #52  <Field int bytesToCheck>
			return;
	//   15   25:return          
		}
	}

	public void seek()
	{
		writingSample = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #50  <Field boolean writingSample>
	//    3    5:return          
	}

	private int bytesToCheck;
	private final TrackOutput outputs[];
	private int sampleBytesWritten;
	private long sampleTimeUs;
	private final List subtitleInfos;
	private boolean writingSample;
}
