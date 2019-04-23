// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.flv;

import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.flv:
//			AudioTagPayloadReader, VideoTagPayloadReader, ScriptTagPayloadReader

public final class FlvExtractor
	implements Extractor, SeekMap
{

	public FlvExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #64  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:iconst_4        
	//    6   10:invokespecial   #67  <Method void ParsableByteArray(int)>
	//    7   13:putfield        #69  <Field ParsableByteArray scratch>
	//    8   16:aload_0         
	//    9   17:new             #64  <Class ParsableByteArray>
	//   10   20:dup             
	//   11   21:bipush          9
	//   12   23:invokespecial   #67  <Method void ParsableByteArray(int)>
	//   13   26:putfield        #71  <Field ParsableByteArray headerBuffer>
	//   14   29:aload_0         
	//   15   30:new             #64  <Class ParsableByteArray>
	//   16   33:dup             
	//   17   34:bipush          11
	//   18   36:invokespecial   #67  <Method void ParsableByteArray(int)>
	//   19   39:putfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   20   42:aload_0         
	//   21   43:new             #64  <Class ParsableByteArray>
	//   22   46:dup             
	//   23   47:invokespecial   #74  <Method void ParsableByteArray()>
	//   24   50:putfield        #76  <Field ParsableByteArray tagData>
		parserState = 1;
	//   25   53:aload_0         
	//   26   54:iconst_1        
	//   27   55:putfield        #78  <Field int parserState>
	//   28   58:return          
	}

	private ParsableByteArray prepareTagData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(tagDataSize > tagData.capacity())
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int tagDataSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #76  <Field ParsableByteArray tagData>
	//*   4    8:invokevirtual   #90  <Method int ParsableByteArray.capacity()>
	//*   5   11:icmple          42
		{
			ParsableByteArray parsablebytearray = tagData;
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field ParsableByteArray tagData>
	//    8   18:astore_2        
			parsablebytearray.reset(new byte[Math.max(parsablebytearray.capacity() * 2, tagDataSize)], 0);
	//    9   19:aload_2         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #90  <Method int ParsableByteArray.capacity()>
	//   12   24:iconst_2        
	//   13   25:imul            
	//   14   26:aload_0         
	//   15   27:getfield        #86  <Field int tagDataSize>
	//   16   30:invokestatic    #96  <Method int Math.max(int, int)>
	//   17   33:newarray        byte[]
	//   18   35:iconst_0        
	//   19   36:invokevirtual   #100 <Method void ParsableByteArray.reset(byte[], int)>
		} else
	//*  20   39:goto            50
		{
			tagData.setPosition(0);
	//   21   42:aload_0         
	//   22   43:getfield        #76  <Field ParsableByteArray tagData>
	//   23   46:iconst_0        
	//   24   47:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
		}
		tagData.setLimit(tagDataSize);
	//   25   50:aload_0         
	//   26   51:getfield        #76  <Field ParsableByteArray tagData>
	//   27   54:aload_0         
	//   28   55:getfield        #86  <Field int tagDataSize>
	//   29   58:invokevirtual   #106 <Method void ParsableByteArray.setLimit(int)>
		extractorinput.readFully(tagData.data, 0, tagDataSize);
	//   30   61:aload_1         
	//   31   62:aload_0         
	//   32   63:getfield        #76  <Field ParsableByteArray tagData>
	//   33   66:getfield        #110 <Field byte[] ParsableByteArray.data>
	//   34   69:iconst_0        
	//   35   70:aload_0         
	//   36   71:getfield        #86  <Field int tagDataSize>
	//   37   74:invokeinterface #116 <Method void ExtractorInput.readFully(byte[], int, int)>
		return tagData;
	//   38   79:aload_0         
	//   39   80:getfield        #76  <Field ParsableByteArray tagData>
	//   40   83:areturn         
	}

	private boolean readFlvHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = headerBuffer.data;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ParsableByteArray headerBuffer>
	//    2    4:getfield        #110 <Field byte[] ParsableByteArray.data>
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
	//*  11   18:invokeinterface #122 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  12   23:ifne            28
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
		headerBuffer.setPosition(0);
	//   15   28:aload_0         
	//   16   29:getfield        #71  <Field ParsableByteArray headerBuffer>
	//   17   32:iconst_0        
	//   18   33:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
		headerBuffer.skipBytes(4);
	//   19   36:aload_0         
	//   20   37:getfield        #71  <Field ParsableByteArray headerBuffer>
	//   21   40:iconst_4        
	//   22   41:invokevirtual   #125 <Method void ParsableByteArray.skipBytes(int)>
		int i = headerBuffer.readUnsignedByte();
	//   23   44:aload_0         
	//   24   45:getfield        #71  <Field ParsableByteArray headerBuffer>
	//   25   48:invokevirtual   #128 <Method int ParsableByteArray.readUnsignedByte()>
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
	//*  43   77:ifeq            109
	//*  44   80:aload_0         
	//*  45   81:getfield        #130 <Field AudioTagPayloadReader audioReader>
	//*  46   84:ifnonnull       109
			audioReader = new AudioTagPayloadReader(extractorOutput.track(8));
	//   47   87:aload_0         
	//   48   88:new             #132 <Class AudioTagPayloadReader>
	//   49   91:dup             
	//   50   92:aload_0         
	//   51   93:getfield        #134 <Field ExtractorOutput extractorOutput>
	//   52   96:bipush          8
	//   53   98:invokeinterface #140 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//   54  103:invokespecial   #143 <Method void AudioTagPayloadReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//   55  106:putfield        #130 <Field AudioTagPayloadReader audioReader>
		if(flag1 && videoReader == null)
	//*  56  109:iload_3         
	//*  57  110:ifeq            142
	//*  58  113:aload_0         
	//*  59  114:getfield        #145 <Field VideoTagPayloadReader videoReader>
	//*  60  117:ifnonnull       142
			videoReader = new VideoTagPayloadReader(extractorOutput.track(9));
	//   61  120:aload_0         
	//   62  121:new             #147 <Class VideoTagPayloadReader>
	//   63  124:dup             
	//   64  125:aload_0         
	//   65  126:getfield        #134 <Field ExtractorOutput extractorOutput>
	//   66  129:bipush          9
	//   67  131:invokeinterface #140 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//   68  136:invokespecial   #148 <Method void VideoTagPayloadReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//   69  139:putfield        #145 <Field VideoTagPayloadReader videoReader>
		if(metadataReader == null)
	//*  70  142:aload_0         
	//*  71  143:getfield        #150 <Field ScriptTagPayloadReader metadataReader>
	//*  72  146:ifnonnull       161
			metadataReader = new ScriptTagPayloadReader(((com.google.android.exoplayer.extractor.TrackOutput) (null)));
	//   73  149:aload_0         
	//   74  150:new             #152 <Class ScriptTagPayloadReader>
	//   75  153:dup             
	//   76  154:aconst_null     
	//   77  155:invokespecial   #153 <Method void ScriptTagPayloadReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//   78  158:putfield        #150 <Field ScriptTagPayloadReader metadataReader>
		extractorOutput.endTracks();
	//   79  161:aload_0         
	//   80  162:getfield        #134 <Field ExtractorOutput extractorOutput>
	//   81  165:invokeinterface #156 <Method void ExtractorOutput.endTracks()>
		extractorOutput.seekMap(((SeekMap) (this)));
	//   82  170:aload_0         
	//   83  171:getfield        #134 <Field ExtractorOutput extractorOutput>
	//   84  174:aload_0         
	//   85  175:invokeinterface #160 <Method void ExtractorOutput.seekMap(SeekMap)>
		bytesToNextTagHeader = (headerBuffer.readInt() - 9) + 4;
	//   86  180:aload_0         
	//   87  181:aload_0         
	//   88  182:getfield        #71  <Field ParsableByteArray headerBuffer>
	//   89  185:invokevirtual   #163 <Method int ParsableByteArray.readInt()>
	//   90  188:bipush          9
	//   91  190:isub            
	//   92  191:iconst_4        
	//   93  192:iadd            
	//   94  193:putfield        #165 <Field int bytesToNextTagHeader>
		parserState = 2;
	//   95  196:aload_0         
	//   96  197:iconst_2        
	//   97  198:putfield        #78  <Field int parserState>
		return true;
	//   98  201:iconst_1        
	//   99  202:ireturn         
	}

	private boolean readTagData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
label0:
		{
label1:
			{
label2:
				{
					if(tagType == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field int tagType>
	//*   2    4:bipush          8
	//*   3    6:icmpne          34
					{
						AudioTagPayloadReader audiotagpayloadreader = audioReader;
	//    4    9:aload_0         
	//    5   10:getfield        #130 <Field AudioTagPayloadReader audioReader>
	//    6   13:astore_3        
						if(audiotagpayloadreader != null)
	//*   7   14:aload_3         
	//*   8   15:ifnull          34
						{
							audiotagpayloadreader.consume(prepareTagData(extractorinput), tagTimestampUs);
	//    9   18:aload_3         
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokespecial   #170 <Method ParsableByteArray prepareTagData(ExtractorInput)>
	//   13   24:aload_0         
	//   14   25:getfield        #172 <Field long tagTimestampUs>
	//   15   28:invokevirtual   #176 <Method void AudioTagPayloadReader.consume(ParsableByteArray, long)>
							break label2;
	//   16   31:goto            153
						}
					}
					if(tagType == 9)
	//*  17   34:aload_0         
	//*  18   35:getfield        #168 <Field int tagType>
	//*  19   38:bipush          9
	//*  20   40:icmpne          68
					{
						VideoTagPayloadReader videotagpayloadreader = videoReader;
	//   21   43:aload_0         
	//   22   44:getfield        #145 <Field VideoTagPayloadReader videoReader>
	//   23   47:astore_3        
						if(videotagpayloadreader != null)
	//*  24   48:aload_3         
	//*  25   49:ifnull          68
						{
							videotagpayloadreader.consume(prepareTagData(extractorinput), tagTimestampUs);
	//   26   52:aload_3         
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokespecial   #170 <Method ParsableByteArray prepareTagData(ExtractorInput)>
	//   30   58:aload_0         
	//   31   59:getfield        #172 <Field long tagTimestampUs>
	//   32   62:invokevirtual   #177 <Method void VideoTagPayloadReader.consume(ParsableByteArray, long)>
							break label2;
	//   33   65:goto            153
						}
					}
					if(tagType != 18)
						break label1;
	//   34   68:aload_0         
	//   35   69:getfield        #168 <Field int tagType>
	//   36   72:bipush          18
	//   37   74:icmpne          158
					ScriptTagPayloadReader scripttagpayloadreader = metadataReader;
	//   38   77:aload_0         
	//   39   78:getfield        #150 <Field ScriptTagPayloadReader metadataReader>
	//   40   81:astore_3        
					if(scripttagpayloadreader == null)
						break label1;
	//   41   82:aload_3         
	//   42   83:ifnull          158
					scripttagpayloadreader.consume(prepareTagData(extractorinput), tagTimestampUs);
	//   43   86:aload_3         
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:invokespecial   #170 <Method ParsableByteArray prepareTagData(ExtractorInput)>
	//   47   92:aload_0         
	//   48   93:getfield        #172 <Field long tagTimestampUs>
	//   49   96:invokevirtual   #178 <Method void ScriptTagPayloadReader.consume(ParsableByteArray, long)>
					if(metadataReader.getDurationUs() != -1L)
	//*  50   99:aload_0         
	//*  51  100:getfield        #150 <Field ScriptTagPayloadReader metadataReader>
	//*  52  103:invokevirtual   #182 <Method long ScriptTagPayloadReader.getDurationUs()>
	//*  53  106:ldc2w           #183 <Long -1L>
	//*  54  109:lcmp            
	//*  55  110:ifeq            153
					{
						extractorinput = ((ExtractorInput) (audioReader));
	//   56  113:aload_0         
	//   57  114:getfield        #130 <Field AudioTagPayloadReader audioReader>
	//   58  117:astore_1        
						if(extractorinput != null)
	//*  59  118:aload_1         
	//*  60  119:ifnull          133
							((AudioTagPayloadReader) (extractorinput)).setDurationUs(metadataReader.getDurationUs());
	//   61  122:aload_1         
	//   62  123:aload_0         
	//   63  124:getfield        #150 <Field ScriptTagPayloadReader metadataReader>
	//   64  127:invokevirtual   #182 <Method long ScriptTagPayloadReader.getDurationUs()>
	//   65  130:invokevirtual   #188 <Method void AudioTagPayloadReader.setDurationUs(long)>
						extractorinput = ((ExtractorInput) (videoReader));
	//   66  133:aload_0         
	//   67  134:getfield        #145 <Field VideoTagPayloadReader videoReader>
	//   68  137:astore_1        
						if(extractorinput != null)
	//*  69  138:aload_1         
	//*  70  139:ifnull          153
							((VideoTagPayloadReader) (extractorinput)).setDurationUs(metadataReader.getDurationUs());
	//   71  142:aload_1         
	//   72  143:aload_0         
	//   73  144:getfield        #150 <Field ScriptTagPayloadReader metadataReader>
	//   74  147:invokevirtual   #182 <Method long ScriptTagPayloadReader.getDurationUs()>
	//   75  150:invokevirtual   #189 <Method void VideoTagPayloadReader.setDurationUs(long)>
					}
				}
				flag = true;
	//   76  153:iconst_1        
	//   77  154:istore_2        
				break label0;
	//   78  155:goto            170
			}
			extractorinput.skipFully(tagDataSize);
	//   79  158:aload_1         
	//   80  159:aload_0         
	//   81  160:getfield        #86  <Field int tagDataSize>
	//   82  163:invokeinterface #192 <Method void ExtractorInput.skipFully(int)>
			flag = false;
	//   83  168:iconst_0        
	//   84  169:istore_2        
		}
		bytesToNextTagHeader = 4;
	//   85  170:aload_0         
	//   86  171:iconst_4        
	//   87  172:putfield        #165 <Field int bytesToNextTagHeader>
		parserState = 2;
	//   88  175:aload_0         
	//   89  176:iconst_2        
	//   90  177:putfield        #78  <Field int parserState>
		return flag;
	//   91  180:iload_2         
	//   92  181:ireturn         
	}

	private boolean readTagHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(!extractorinput.readFully(tagHeaderBuffer.data, 0, 11, true))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//*   3    5:getfield        #110 <Field byte[] ParsableByteArray.data>
	//*   4    8:iconst_0        
	//*   5    9:bipush          11
	//*   6   11:iconst_1        
	//*   7   12:invokeinterface #122 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*   8   17:ifne            22
		{
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		} else
		{
			tagHeaderBuffer.setPosition(0);
	//   11   22:aload_0         
	//   12   23:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
			tagType = tagHeaderBuffer.readUnsignedByte();
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   18   35:invokevirtual   #128 <Method int ParsableByteArray.readUnsignedByte()>
	//   19   38:putfield        #168 <Field int tagType>
			tagDataSize = tagHeaderBuffer.readUnsignedInt24();
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   23   46:invokevirtual   #196 <Method int ParsableByteArray.readUnsignedInt24()>
	//   24   49:putfield        #86  <Field int tagDataSize>
			tagTimestampUs = tagHeaderBuffer.readUnsignedInt24();
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   28   57:invokevirtual   #196 <Method int ParsableByteArray.readUnsignedInt24()>
	//   29   60:i2l             
	//   30   61:putfield        #172 <Field long tagTimestampUs>
			tagTimestampUs = ((long)(tagHeaderBuffer.readUnsignedByte() << 24) | tagTimestampUs) * 1000L;
	//   31   64:aload_0         
	//   32   65:aload_0         
	//   33   66:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   34   69:invokevirtual   #128 <Method int ParsableByteArray.readUnsignedByte()>
	//   35   72:bipush          24
	//   36   74:ishl            
	//   37   75:i2l             
	//   38   76:aload_0         
	//   39   77:getfield        #172 <Field long tagTimestampUs>
	//   40   80:lor             
	//   41   81:ldc2w           #197 <Long 1000L>
	//   42   84:lmul            
	//   43   85:putfield        #172 <Field long tagTimestampUs>
			tagHeaderBuffer.skipBytes(3);
	//   44   88:aload_0         
	//   45   89:getfield        #73  <Field ParsableByteArray tagHeaderBuffer>
	//   46   92:iconst_3        
	//   47   93:invokevirtual   #125 <Method void ParsableByteArray.skipBytes(int)>
			parserState = 4;
	//   48   96:aload_0         
	//   49   97:iconst_4        
	//   50   98:putfield        #78  <Field int parserState>
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
	//    2    2:getfield        #165 <Field int bytesToNextTagHeader>
	//    3    5:invokeinterface #192 <Method void ExtractorInput.skipFully(int)>
		bytesToNextTagHeader = 0;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #165 <Field int bytesToNextTagHeader>
		parserState = 3;
	//    7   15:aload_0         
	//    8   16:iconst_3        
	//    9   17:putfield        #78  <Field int parserState>
	//   10   20:return          
	}

	public long getPosition(long l)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field ExtractorOutput extractorOutput>
	//    3    5:return          
	}

	public boolean isSeekable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
_L7:
		parserState;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int parserState>
		JVM INSTR tableswitch 1 4: default 36
	//	               1 67
	//	               2 59
	//	               3 49
	//	               4 39;
	//    2    4:tableswitch     1 4: default 36
	//	               1 67
	//	               2 59
	//	               3 49
	//	               4 39
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		continue; /* Loop/switch isn't completed */
	//    3   36:goto            0
_L2:
		continue; /* Loop/switch isn't completed */
_L5:
		if(readTagData(extractorinput))
	//*   4   39:aload_0         
	//*   5   40:aload_1         
	//*   6   41:invokespecial   #210 <Method boolean readTagData(ExtractorInput)>
	//*   7   44:ifeq            0
			return 0;
	//    8   47:iconst_0        
	//    9   48:ireturn         
		continue; /* Loop/switch isn't completed */
_L4:
		if(!readTagHeader(extractorinput))
	//*  10   49:aload_0         
	//*  11   50:aload_1         
	//*  12   51:invokespecial   #212 <Method boolean readTagHeader(ExtractorInput)>
	//*  13   54:ifne            0
			return -1;
	//   14   57:iconst_m1       
	//   15   58:ireturn         
		continue; /* Loop/switch isn't completed */
_L3:
		skipToTagHeader(extractorinput);
	//   16   59:aload_0         
	//   17   60:aload_1         
	//   18   61:invokespecial   #214 <Method void skipToTagHeader(ExtractorInput)>
		if(true) goto _L7; else goto _L6
	//   19   64:goto            0
_L6:
		if(readFlvHeader(extractorinput)) goto _L7; else goto _L8
	//   20   67:aload_0         
	//   21   68:aload_1         
	//   22   69:invokespecial   #216 <Method boolean readFlvHeader(ExtractorInput)>
	//   23   72:ifne            0
_L8:
		return -1;
	//   24   75:iconst_m1       
	//   25   76:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		parserState = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #78  <Field int parserState>
		bytesToNextTagHeader = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #165 <Field int bytesToNextTagHeader>
	//    6   10:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = scratch.data;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ParsableByteArray scratch>
	//    2    4:getfield        #110 <Field byte[] ParsableByteArray.data>
	//    3    7:astore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		extractorinput.peekFully(abyte0, 0, 3);
	//    6   11:aload_1         
	//    7   12:aload           4
	//    8   14:iconst_0        
	//    9   15:iconst_3        
	//   10   16:invokeinterface #222 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   11   21:aload_0         
	//   12   22:getfield        #69  <Field ParsableByteArray scratch>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
		if(scratch.readUnsignedInt24() != FLV_TAG)
	//*  15   29:aload_0         
	//*  16   30:getfield        #69  <Field ParsableByteArray scratch>
	//*  17   33:invokevirtual   #196 <Method int ParsableByteArray.readUnsignedInt24()>
	//*  18   36:getstatic       #58  <Field int FLV_TAG>
	//*  19   39:icmpeq          44
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		extractorinput.peekFully(scratch.data, 0, 2);
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #69  <Field ParsableByteArray scratch>
	//   25   49:getfield        #110 <Field byte[] ParsableByteArray.data>
	//   26   52:iconst_0        
	//   27   53:iconst_2        
	//   28   54:invokeinterface #222 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   29   59:aload_0         
	//   30   60:getfield        #69  <Field ParsableByteArray scratch>
	//   31   63:iconst_0        
	//   32   64:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
		if((scratch.readUnsignedShort() & 0xfa) != 0)
	//*  33   67:aload_0         
	//*  34   68:getfield        #69  <Field ParsableByteArray scratch>
	//*  35   71:invokevirtual   #225 <Method int ParsableByteArray.readUnsignedShort()>
	//*  36   74:sipush          250
	//*  37   77:iand            
	//*  38   78:ifeq            83
			return false;
	//   39   81:iconst_0        
	//   40   82:ireturn         
		extractorinput.peekFully(scratch.data, 0, 4);
	//   41   83:aload_1         
	//   42   84:aload_0         
	//   43   85:getfield        #69  <Field ParsableByteArray scratch>
	//   44   88:getfield        #110 <Field byte[] ParsableByteArray.data>
	//   45   91:iconst_0        
	//   46   92:iconst_4        
	//   47   93:invokeinterface #222 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   48   98:aload_0         
	//   49   99:getfield        #69  <Field ParsableByteArray scratch>
	//   50  102:iconst_0        
	//   51  103:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
		int i = scratch.readInt();
	//   52  106:aload_0         
	//   53  107:getfield        #69  <Field ParsableByteArray scratch>
	//   54  110:invokevirtual   #163 <Method int ParsableByteArray.readInt()>
	//   55  113:istore_2        
		extractorinput.resetPeekPosition();
	//   56  114:aload_1         
	//   57  115:invokeinterface #228 <Method void ExtractorInput.resetPeekPosition()>
		extractorinput.advancePeekPosition(i);
	//   58  120:aload_1         
	//   59  121:iload_2         
	//   60  122:invokeinterface #231 <Method void ExtractorInput.advancePeekPosition(int)>
		extractorinput.peekFully(scratch.data, 0, 4);
	//   61  127:aload_1         
	//   62  128:aload_0         
	//   63  129:getfield        #69  <Field ParsableByteArray scratch>
	//   64  132:getfield        #110 <Field byte[] ParsableByteArray.data>
	//   65  135:iconst_0        
	//   66  136:iconst_4        
	//   67  137:invokeinterface #222 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   68  142:aload_0         
	//   69  143:getfield        #69  <Field ParsableByteArray scratch>
	//   70  146:iconst_0        
	//   71  147:invokevirtual   #103 <Method void ParsableByteArray.setPosition(int)>
		if(scratch.readInt() == 0)
	//*  72  150:aload_0         
	//*  73  151:getfield        #69  <Field ParsableByteArray scratch>
	//*  74  154:invokevirtual   #163 <Method int ParsableByteArray.readInt()>
	//*  75  157:ifne            162
			flag = true;
	//   76  160:iconst_1        
	//   77  161:istore_3        
		return flag;
	//   78  162:iload_3         
	//   79  163:ireturn         
	}

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
	private ScriptTagPayloadReader metadataReader;
	private int parserState;
	private final ParsableByteArray scratch = new ParsableByteArray(4);
	private final ParsableByteArray tagData = new ParsableByteArray();
	public int tagDataSize;
	private final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
	public long tagTimestampUs;
	public int tagType;
	private VideoTagPayloadReader videoReader;

	static 
	{
	//    0    0:ldc1            #50  <String "FLV">
	//    1    2:invokestatic    #56  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #58  <Field int FLV_TAG>
	//*   3    8:return          
	}
}
