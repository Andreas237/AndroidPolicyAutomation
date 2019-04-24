// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.flv:
//			ScriptTagPayloadReader, AudioTagPayloadReader, VideoTagPayloadReader

public final class FlvExtractor
	implements Extractor
{

	public FlvExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #72  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:iconst_4        
	//    6   10:invokespecial   #75  <Method void ParsableByteArray(int)>
	//    7   13:putfield        #77  <Field ParsableByteArray scratch>
	//    8   16:aload_0         
	//    9   17:new             #72  <Class ParsableByteArray>
	//   10   20:dup             
	//   11   21:bipush          9
	//   12   23:invokespecial   #75  <Method void ParsableByteArray(int)>
	//   13   26:putfield        #79  <Field ParsableByteArray headerBuffer>
	//   14   29:aload_0         
	//   15   30:new             #72  <Class ParsableByteArray>
	//   16   33:dup             
	//   17   34:bipush          11
	//   18   36:invokespecial   #75  <Method void ParsableByteArray(int)>
	//   19   39:putfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   20   42:aload_0         
	//   21   43:new             #72  <Class ParsableByteArray>
	//   22   46:dup             
	//   23   47:invokespecial   #82  <Method void ParsableByteArray()>
	//   24   50:putfield        #84  <Field ParsableByteArray tagData>
	//   25   53:aload_0         
	//   26   54:new             #86  <Class ScriptTagPayloadReader>
	//   27   57:dup             
	//   28   58:invokespecial   #87  <Method void ScriptTagPayloadReader()>
	//   29   61:putfield        #89  <Field ScriptTagPayloadReader metadataReader>
		state = 1;
	//   30   64:aload_0         
	//   31   65:iconst_1        
	//   32   66:putfield        #91  <Field int state>
		mediaTagTimestampOffsetUs = 0x1L;
	//   33   69:aload_0         
	//   34   70:ldc2w           #92  <Long 0x1L>
	//   35   73:putfield        #95  <Field long mediaTagTimestampOffsetUs>
	//   36   76:return          
	}

	private void ensureReadyForMediaOutput()
	{
		if(!outputSeekMap)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field boolean outputSeekMap>
	//*   2    4:ifne            31
		{
			extractorOutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L))));
	//    3    7:aload_0         
	//    4    8:getfield        #100 <Field ExtractorOutput extractorOutput>
	//    5   11:new             #102 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    6   14:dup             
	//    7   15:ldc2w           #92  <Long 0x1L>
	//    8   18:invokespecial   #105 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    9   21:invokeinterface #111 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
			outputSeekMap = true;
	//   10   26:aload_0         
	//   11   27:iconst_1        
	//   12   28:putfield        #98  <Field boolean outputSeekMap>
		}
		if(mediaTagTimestampOffsetUs == 0x1L)
	//*  13   31:aload_0         
	//*  14   32:getfield        #95  <Field long mediaTagTimestampOffsetUs>
	//*  15   35:ldc2w           #92  <Long 0x1L>
	//*  16   38:lcmp            
	//*  17   39:ifne            72
		{
			long l;
			if(metadataReader.getDurationUs() == 0x1L)
	//*  18   42:aload_0         
	//*  19   43:getfield        #89  <Field ScriptTagPayloadReader metadataReader>
	//*  20   46:invokevirtual   #115 <Method long ScriptTagPayloadReader.getDurationUs()>
	//*  21   49:ldc2w           #92  <Long 0x1L>
	//*  22   52:lcmp            
	//*  23   53:ifne            65
				l = -tagTimestampUs;
	//   24   56:aload_0         
	//   25   57:getfield        #117 <Field long tagTimestampUs>
	//   26   60:lneg            
	//   27   61:lstore_1        
			else
	//*  28   62:goto            67
				l = 0L;
	//   29   65:lconst_0        
	//   30   66:lstore_1        
			mediaTagTimestampOffsetUs = l;
	//   31   67:aload_0         
	//   32   68:lload_1         
	//   33   69:putfield        #95  <Field long mediaTagTimestampOffsetUs>
		}
	//   34   72:return          
	}

	private ParsableByteArray prepareTagData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(tagDataSize > tagData.capacity())
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int tagDataSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #84  <Field ParsableByteArray tagData>
	//*   4    8:invokevirtual   #129 <Method int ParsableByteArray.capacity()>
	//*   5   11:icmple          43
			tagData.reset(new byte[Math.max(tagData.capacity() * 2, tagDataSize)], 0);
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field ParsableByteArray tagData>
	//    8   18:aload_0         
	//    9   19:getfield        #84  <Field ParsableByteArray tagData>
	//   10   22:invokevirtual   #129 <Method int ParsableByteArray.capacity()>
	//   11   25:iconst_2        
	//   12   26:imul            
	//   13   27:aload_0         
	//   14   28:getfield        #125 <Field int tagDataSize>
	//   15   31:invokestatic    #135 <Method int Math.max(int, int)>
	//   16   34:newarray        byte[]
	//   17   36:iconst_0        
	//   18   37:invokevirtual   #139 <Method void ParsableByteArray.reset(byte[], int)>
		else
	//*  19   40:goto            51
			tagData.setPosition(0);
	//   20   43:aload_0         
	//   21   44:getfield        #84  <Field ParsableByteArray tagData>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		tagData.setLimit(tagDataSize);
	//   24   51:aload_0         
	//   25   52:getfield        #84  <Field ParsableByteArray tagData>
	//   26   55:aload_0         
	//   27   56:getfield        #125 <Field int tagDataSize>
	//   28   59:invokevirtual   #145 <Method void ParsableByteArray.setLimit(int)>
		extractorinput.readFully(tagData.data, 0, tagDataSize);
	//   29   62:aload_1         
	//   30   63:aload_0         
	//   31   64:getfield        #84  <Field ParsableByteArray tagData>
	//   32   67:getfield        #149 <Field byte[] ParsableByteArray.data>
	//   33   70:iconst_0        
	//   34   71:aload_0         
	//   35   72:getfield        #125 <Field int tagDataSize>
	//   36   75:invokeinterface #155 <Method void ExtractorInput.readFully(byte[], int, int)>
		return tagData;
	//   37   80:aload_0         
	//   38   81:getfield        #84  <Field ParsableByteArray tagData>
	//   39   84:areturn         
	}

	private boolean readFlvHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = headerBuffer.data;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ParsableByteArray headerBuffer>
	//    2    4:getfield        #149 <Field byte[] ParsableByteArray.data>
	//    3    7:astore          5
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(!extractorinput.readFully(abyte0, 0, 9, true))
	//*   6   11:aload_1         
	//*   7   12:aload           5
	//*   8   14:iconst_0        
	//*   9   15:bipush          9
	//*  10   17:iconst_1        
	//*  11   18:invokeinterface #161 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  12   23:ifne            28
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
		headerBuffer.setPosition(0);
	//   15   28:aload_0         
	//   16   29:getfield        #79  <Field ParsableByteArray headerBuffer>
	//   17   32:iconst_0        
	//   18   33:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		headerBuffer.skipBytes(4);
	//   19   36:aload_0         
	//   20   37:getfield        #79  <Field ParsableByteArray headerBuffer>
	//   21   40:iconst_4        
	//   22   41:invokevirtual   #164 <Method void ParsableByteArray.skipBytes(int)>
		int i = headerBuffer.readUnsignedByte();
	//   23   44:aload_0         
	//   24   45:getfield        #79  <Field ParsableByteArray headerBuffer>
	//   25   48:invokevirtual   #167 <Method int ParsableByteArray.readUnsignedByte()>
	//   26   51:istore          4
		boolean flag;
		if((i & 4) != 0)
	//*  27   53:iload           4
	//*  28   55:iconst_4        
	//*  29   56:iand            
	//*  30   57:ifeq            65
			flag = true;
	//   31   60:iconst_1        
	//   32   61:istore_2        
		else
	//*  33   62:goto            67
			flag = false;
	//   34   65:iconst_0        
	//   35   66:istore_2        
		if((i & 1) != 0)
	//*  36   67:iload           4
	//*  37   69:iconst_1        
	//*  38   70:iand            
	//*  39   71:ifeq            76
			flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
		if(flag && audioReader == null)
	//*  42   76:iload_2         
	//*  43   77:ifeq            110
	//*  44   80:aload_0         
	//*  45   81:getfield        #169 <Field AudioTagPayloadReader audioReader>
	//*  46   84:ifnonnull       110
			audioReader = new AudioTagPayloadReader(extractorOutput.track(8, 1));
	//   47   87:aload_0         
	//   48   88:new             #171 <Class AudioTagPayloadReader>
	//   49   91:dup             
	//   50   92:aload_0         
	//   51   93:getfield        #100 <Field ExtractorOutput extractorOutput>
	//   52   96:bipush          8
	//   53   98:iconst_1        
	//   54   99:invokeinterface #175 <Method com.google.android.exoplayer2.extractor.TrackOutput ExtractorOutput.track(int, int)>
	//   55  104:invokespecial   #178 <Method void AudioTagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput)>
	//   56  107:putfield        #169 <Field AudioTagPayloadReader audioReader>
		if(flag1 && videoReader == null)
	//*  57  110:iload_3         
	//*  58  111:ifeq            144
	//*  59  114:aload_0         
	//*  60  115:getfield        #180 <Field VideoTagPayloadReader videoReader>
	//*  61  118:ifnonnull       144
			videoReader = new VideoTagPayloadReader(extractorOutput.track(9, 2));
	//   62  121:aload_0         
	//   63  122:new             #182 <Class VideoTagPayloadReader>
	//   64  125:dup             
	//   65  126:aload_0         
	//   66  127:getfield        #100 <Field ExtractorOutput extractorOutput>
	//   67  130:bipush          9
	//   68  132:iconst_2        
	//   69  133:invokeinterface #175 <Method com.google.android.exoplayer2.extractor.TrackOutput ExtractorOutput.track(int, int)>
	//   70  138:invokespecial   #183 <Method void VideoTagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput)>
	//   71  141:putfield        #180 <Field VideoTagPayloadReader videoReader>
		extractorOutput.endTracks();
	//   72  144:aload_0         
	//   73  145:getfield        #100 <Field ExtractorOutput extractorOutput>
	//   74  148:invokeinterface #186 <Method void ExtractorOutput.endTracks()>
		bytesToNextTagHeader = (headerBuffer.readInt() - 9) + 4;
	//   75  153:aload_0         
	//   76  154:aload_0         
	//   77  155:getfield        #79  <Field ParsableByteArray headerBuffer>
	//   78  158:invokevirtual   #189 <Method int ParsableByteArray.readInt()>
	//   79  161:bipush          9
	//   80  163:isub            
	//   81  164:iconst_4        
	//   82  165:iadd            
	//   83  166:putfield        #191 <Field int bytesToNextTagHeader>
		state = 2;
	//   84  169:aload_0         
	//   85  170:iconst_2        
	//   86  171:putfield        #91  <Field int state>
		return true;
	//   87  174:iconst_1        
	//   88  175:ireturn         
	}

	private boolean readTagData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i = tagType;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field int tagType>
	//    2    4:istore_2        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore          4
		boolean flag;
		if(i == 8 && audioReader != null)
	//*   5    8:iload_2         
	//*   6    9:bipush          8
	//*   7   11:icmpne          52
	//*   8   14:aload_0         
	//*   9   15:getfield        #169 <Field AudioTagPayloadReader audioReader>
	//*  10   18:ifnull          52
		{
			ensureReadyForMediaOutput();
	//   11   21:aload_0         
	//   12   22:invokespecial   #196 <Method void ensureReadyForMediaOutput()>
			audioReader.consume(prepareTagData(extractorinput), mediaTagTimestampOffsetUs + tagTimestampUs);
	//   13   25:aload_0         
	//   14   26:getfield        #169 <Field AudioTagPayloadReader audioReader>
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #198 <Method ParsableByteArray prepareTagData(ExtractorInput)>
	//   18   34:aload_0         
	//   19   35:getfield        #95  <Field long mediaTagTimestampOffsetUs>
	//   20   38:aload_0         
	//   21   39:getfield        #117 <Field long tagTimestampUs>
	//   22   42:ladd            
	//   23   43:invokevirtual   #202 <Method void AudioTagPayloadReader.consume(ParsableByteArray, long)>
			flag = flag1;
	//   24   46:iload           4
	//   25   48:istore_3        
		} else
	//*  26   49:goto            193
		if(tagType == 9 && videoReader != null)
	//*  27   52:aload_0         
	//*  28   53:getfield        #194 <Field int tagType>
	//*  29   56:bipush          9
	//*  30   58:icmpne          99
	//*  31   61:aload_0         
	//*  32   62:getfield        #180 <Field VideoTagPayloadReader videoReader>
	//*  33   65:ifnull          99
		{
			ensureReadyForMediaOutput();
	//   34   68:aload_0         
	//   35   69:invokespecial   #196 <Method void ensureReadyForMediaOutput()>
			videoReader.consume(prepareTagData(extractorinput), mediaTagTimestampOffsetUs + tagTimestampUs);
	//   36   72:aload_0         
	//   37   73:getfield        #180 <Field VideoTagPayloadReader videoReader>
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokespecial   #198 <Method ParsableByteArray prepareTagData(ExtractorInput)>
	//   41   81:aload_0         
	//   42   82:getfield        #95  <Field long mediaTagTimestampOffsetUs>
	//   43   85:aload_0         
	//   44   86:getfield        #117 <Field long tagTimestampUs>
	//   45   89:ladd            
	//   46   90:invokevirtual   #203 <Method void VideoTagPayloadReader.consume(ParsableByteArray, long)>
			flag = flag1;
	//   47   93:iload           4
	//   48   95:istore_3        
		} else
	//*  49   96:goto            193
		if(tagType == 18 && !outputSeekMap)
	//*  50   99:aload_0         
	//*  51  100:getfield        #194 <Field int tagType>
	//*  52  103:bipush          18
	//*  53  105:icmpne          181
	//*  54  108:aload_0         
	//*  55  109:getfield        #98  <Field boolean outputSeekMap>
	//*  56  112:ifne            181
		{
			metadataReader.consume(prepareTagData(extractorinput), tagTimestampUs);
	//   57  115:aload_0         
	//   58  116:getfield        #89  <Field ScriptTagPayloadReader metadataReader>
	//   59  119:aload_0         
	//   60  120:aload_1         
	//   61  121:invokespecial   #198 <Method ParsableByteArray prepareTagData(ExtractorInput)>
	//   62  124:aload_0         
	//   63  125:getfield        #117 <Field long tagTimestampUs>
	//   64  128:invokevirtual   #204 <Method void ScriptTagPayloadReader.consume(ParsableByteArray, long)>
			long l = metadataReader.getDurationUs();
	//   65  131:aload_0         
	//   66  132:getfield        #89  <Field ScriptTagPayloadReader metadataReader>
	//   67  135:invokevirtual   #115 <Method long ScriptTagPayloadReader.getDurationUs()>
	//   68  138:lstore          5
			flag = flag1;
	//   69  140:iload           4
	//   70  142:istore_3        
			if(l != 0x1L)
	//*  71  143:lload           5
	//*  72  145:ldc2w           #92  <Long 0x1L>
	//*  73  148:lcmp            
	//*  74  149:ifeq            193
			{
				extractorOutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(l))));
	//   75  152:aload_0         
	//   76  153:getfield        #100 <Field ExtractorOutput extractorOutput>
	//   77  156:new             #102 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//   78  159:dup             
	//   79  160:lload           5
	//   80  162:invokespecial   #105 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//   81  165:invokeinterface #111 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
				outputSeekMap = true;
	//   82  170:aload_0         
	//   83  171:iconst_1        
	//   84  172:putfield        #98  <Field boolean outputSeekMap>
				flag = flag1;
	//   85  175:iload           4
	//   86  177:istore_3        
			}
		} else
	//*  87  178:goto            193
		{
			extractorinput.skipFully(tagDataSize);
	//   88  181:aload_1         
	//   89  182:aload_0         
	//   90  183:getfield        #125 <Field int tagDataSize>
	//   91  186:invokeinterface #207 <Method void ExtractorInput.skipFully(int)>
			flag = false;
	//   92  191:iconst_0        
	//   93  192:istore_3        
		}
		bytesToNextTagHeader = 4;
	//   94  193:aload_0         
	//   95  194:iconst_4        
	//   96  195:putfield        #191 <Field int bytesToNextTagHeader>
		state = 2;
	//   97  198:aload_0         
	//   98  199:iconst_2        
	//   99  200:putfield        #91  <Field int state>
		return flag;
	//  100  203:iload_3         
	//  101  204:ireturn         
	}

	private boolean readTagHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(!extractorinput.readFully(tagHeaderBuffer.data, 0, 11, true))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//*   3    5:getfield        #149 <Field byte[] ParsableByteArray.data>
	//*   4    8:iconst_0        
	//*   5    9:bipush          11
	//*   6   11:iconst_1        
	//*   7   12:invokeinterface #161 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*   8   17:ifne            22
		{
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		} else
		{
			tagHeaderBuffer.setPosition(0);
	//   11   22:aload_0         
	//   12   23:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
			tagType = tagHeaderBuffer.readUnsignedByte();
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   18   35:invokevirtual   #167 <Method int ParsableByteArray.readUnsignedByte()>
	//   19   38:putfield        #194 <Field int tagType>
			tagDataSize = tagHeaderBuffer.readUnsignedInt24();
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   23   46:invokevirtual   #211 <Method int ParsableByteArray.readUnsignedInt24()>
	//   24   49:putfield        #125 <Field int tagDataSize>
			tagTimestampUs = tagHeaderBuffer.readUnsignedInt24();
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   28   57:invokevirtual   #211 <Method int ParsableByteArray.readUnsignedInt24()>
	//   29   60:i2l             
	//   30   61:putfield        #117 <Field long tagTimestampUs>
			tagTimestampUs = ((long)(tagHeaderBuffer.readUnsignedByte() << 24) | tagTimestampUs) * 1000L;
	//   31   64:aload_0         
	//   32   65:aload_0         
	//   33   66:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   34   69:invokevirtual   #167 <Method int ParsableByteArray.readUnsignedByte()>
	//   35   72:bipush          24
	//   36   74:ishl            
	//   37   75:i2l             
	//   38   76:aload_0         
	//   39   77:getfield        #117 <Field long tagTimestampUs>
	//   40   80:lor             
	//   41   81:ldc2w           #212 <Long 1000L>
	//   42   84:lmul            
	//   43   85:putfield        #117 <Field long tagTimestampUs>
			tagHeaderBuffer.skipBytes(3);
	//   44   88:aload_0         
	//   45   89:getfield        #81  <Field ParsableByteArray tagHeaderBuffer>
	//   46   92:iconst_3        
	//   47   93:invokevirtual   #164 <Method void ParsableByteArray.skipBytes(int)>
			state = 4;
	//   48   96:aload_0         
	//   49   97:iconst_4        
	//   50   98:putfield        #91  <Field int state>
			return true;
	//   51  101:iconst_1        
	//   52  102:ireturn         
		}
	}

	private void skipToTagHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.skipFully(bytesToNextTagHeader);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #191 <Field int bytesToNextTagHeader>
	//    3    5:invokeinterface #207 <Method void ExtractorInput.skipFully(int)>
		bytesToNextTagHeader = 0;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #191 <Field int bytesToNextTagHeader>
		state = 3;
	//    7   15:aload_0         
	//    8   16:iconst_3        
	//    9   17:putfield        #91  <Field int state>
	//   10   20:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field ExtractorOutput extractorOutput>
	//    3    5:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
_L7:
		state;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int state>
		JVM INSTR tableswitch 1 4: default 36
	//	               1 72
	//	               2 64
	//	               3 54
	//	               4 44;
	//    2    4:tableswitch     1 4: default 36
	//	               1 72
	//	               2 64
	//	               3 54
	//	               4 44
		   goto _L1 _L2 _L3 _L4 _L5
_L2:
		continue; /* Loop/switch isn't completed */
_L1:
		throw new IllegalStateException();
	//    3   36:new             #221 <Class IllegalStateException>
	//    4   39:dup             
	//    5   40:invokespecial   #222 <Method void IllegalStateException()>
	//    6   43:athrow          
_L5:
		if(readTagData(extractorinput))
	//*   7   44:aload_0         
	//*   8   45:aload_1         
	//*   9   46:invokespecial   #224 <Method boolean readTagData(ExtractorInput)>
	//*  10   49:ifeq            0
			return 0;
	//   11   52:iconst_0        
	//   12   53:ireturn         
		continue; /* Loop/switch isn't completed */
_L4:
		if(!readTagHeader(extractorinput))
	//*  13   54:aload_0         
	//*  14   55:aload_1         
	//*  15   56:invokespecial   #226 <Method boolean readTagHeader(ExtractorInput)>
	//*  16   59:ifne            0
			return -1;
	//   17   62:iconst_m1       
	//   18   63:ireturn         
		continue; /* Loop/switch isn't completed */
_L3:
		skipToTagHeader(extractorinput);
	//   19   64:aload_0         
	//   20   65:aload_1         
	//   21   66:invokespecial   #228 <Method void skipToTagHeader(ExtractorInput)>
		if(true) goto _L7; else goto _L6
	//   22   69:goto            0
_L6:
		if(readFlvHeader(extractorinput)) goto _L7; else goto _L8
	//   23   72:aload_0         
	//   24   73:aload_1         
	//   25   74:invokespecial   #230 <Method boolean readFlvHeader(ExtractorInput)>
	//   26   77:ifne            0
_L8:
		return -1;
	//   27   80:iconst_m1       
	//   28   81:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		state = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #91  <Field int state>
		mediaTagTimestampOffsetUs = 0x1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #92  <Long 0x1L>
	//    5    9:putfield        #95  <Field long mediaTagTimestampOffsetUs>
		bytesToNextTagHeader = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #191 <Field int bytesToNextTagHeader>
	//    9   17:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = scratch.data;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field ParsableByteArray scratch>
	//    2    4:getfield        #149 <Field byte[] ParsableByteArray.data>
	//    3    7:astore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		extractorinput.peekFully(abyte0, 0, 3);
	//    6   11:aload_1         
	//    7   12:aload           4
	//    8   14:iconst_0        
	//    9   15:iconst_3        
	//   10   16:invokeinterface #237 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   11   21:aload_0         
	//   12   22:getfield        #77  <Field ParsableByteArray scratch>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		if(scratch.readUnsignedInt24() != FLV_TAG)
	//*  15   29:aload_0         
	//*  16   30:getfield        #77  <Field ParsableByteArray scratch>
	//*  17   33:invokevirtual   #211 <Method int ParsableByteArray.readUnsignedInt24()>
	//*  18   36:getstatic       #68  <Field int FLV_TAG>
	//*  19   39:icmpeq          44
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		extractorinput.peekFully(scratch.data, 0, 2);
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #77  <Field ParsableByteArray scratch>
	//   25   49:getfield        #149 <Field byte[] ParsableByteArray.data>
	//   26   52:iconst_0        
	//   27   53:iconst_2        
	//   28   54:invokeinterface #237 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   29   59:aload_0         
	//   30   60:getfield        #77  <Field ParsableByteArray scratch>
	//   31   63:iconst_0        
	//   32   64:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		if((scratch.readUnsignedShort() & 0xfa) != 0)
	//*  33   67:aload_0         
	//*  34   68:getfield        #77  <Field ParsableByteArray scratch>
	//*  35   71:invokevirtual   #240 <Method int ParsableByteArray.readUnsignedShort()>
	//*  36   74:sipush          250
	//*  37   77:iand            
	//*  38   78:ifeq            83
			return false;
	//   39   81:iconst_0        
	//   40   82:ireturn         
		extractorinput.peekFully(scratch.data, 0, 4);
	//   41   83:aload_1         
	//   42   84:aload_0         
	//   43   85:getfield        #77  <Field ParsableByteArray scratch>
	//   44   88:getfield        #149 <Field byte[] ParsableByteArray.data>
	//   45   91:iconst_0        
	//   46   92:iconst_4        
	//   47   93:invokeinterface #237 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   48   98:aload_0         
	//   49   99:getfield        #77  <Field ParsableByteArray scratch>
	//   50  102:iconst_0        
	//   51  103:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		int i = scratch.readInt();
	//   52  106:aload_0         
	//   53  107:getfield        #77  <Field ParsableByteArray scratch>
	//   54  110:invokevirtual   #189 <Method int ParsableByteArray.readInt()>
	//   55  113:istore_2        
		extractorinput.resetPeekPosition();
	//   56  114:aload_1         
	//   57  115:invokeinterface #243 <Method void ExtractorInput.resetPeekPosition()>
		extractorinput.advancePeekPosition(i);
	//   58  120:aload_1         
	//   59  121:iload_2         
	//   60  122:invokeinterface #246 <Method void ExtractorInput.advancePeekPosition(int)>
		extractorinput.peekFully(scratch.data, 0, 4);
	//   61  127:aload_1         
	//   62  128:aload_0         
	//   63  129:getfield        #77  <Field ParsableByteArray scratch>
	//   64  132:getfield        #149 <Field byte[] ParsableByteArray.data>
	//   65  135:iconst_0        
	//   66  136:iconst_4        
	//   67  137:invokeinterface #237 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   68  142:aload_0         
	//   69  143:getfield        #77  <Field ParsableByteArray scratch>
	//   70  146:iconst_0        
	//   71  147:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		if(scratch.readInt() == 0)
	//*  72  150:aload_0         
	//*  73  151:getfield        #77  <Field ParsableByteArray scratch>
	//*  74  154:invokevirtual   #189 <Method int ParsableByteArray.readInt()>
	//*  75  157:ifne            162
			flag = true;
	//   76  160:iconst_1        
	//   77  161:istore_3        
		return flag;
	//   78  162:iload_3         
	//   79  163:ireturn         
	}

	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new FlvExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class FlvExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void FlvExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final int FLV_HEADER_SIZE = 9;
	private static final int FLV_TAG = Util.getIntegerCodeForString("FLV");
	private static final int FLV_TAG_HEADER_SIZE = 11;
	private static final int STATE_READING_FLV_HEADER = 1;
	private static final int STATE_READING_TAG_DATA = 4;
	private static final int STATE_READING_TAG_HEADER = 3;
	private static final int STATE_SKIPPING_TO_TAG_HEADER = 2;
	private static final int TAG_TYPE_AUDIO = 8;
	private static final int TAG_TYPE_SCRIPT_DATA = 18;
	private static final int TAG_TYPE_VIDEO = 9;
	private AudioTagPayloadReader audioReader;
	private int bytesToNextTagHeader;
	private ExtractorOutput extractorOutput;
	private final ParsableByteArray headerBuffer = new ParsableByteArray(9);
	private long mediaTagTimestampOffsetUs;
	private final ScriptTagPayloadReader metadataReader = new ScriptTagPayloadReader();
	private boolean outputSeekMap;
	private final ParsableByteArray scratch = new ParsableByteArray(4);
	private int state;
	private final ParsableByteArray tagData = new ParsableByteArray();
	private int tagDataSize;
	private final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
	private long tagTimestampUs;
	private int tagType;
	private VideoTagPayloadReader videoReader;

	static 
	{
	//    0    0:new             #8   <Class FlvExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void FlvExtractor$1()>
	//    3    7:putstatic       #58  <Field ExtractorsFactory FACTORY>
	//    4   10:ldc1            #60  <String "FLV">
	//    5   12:invokestatic    #66  <Method int Util.getIntegerCodeForString(String)>
	//    6   15:putstatic       #68  <Field int FLV_TAG>
	//*   7   18:return          
	}
}
