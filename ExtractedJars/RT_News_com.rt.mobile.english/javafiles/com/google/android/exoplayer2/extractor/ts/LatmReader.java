// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.*;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class LatmReader
	implements ElementaryStreamReader
{

	public LatmReader(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		language = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field String language>
	//    5    9:aload_0         
	//    6   10:new             #58  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:sipush          1024
	//    9   17:invokespecial   #61  <Method void ParsableByteArray(int)>
	//   10   20:putfield        #63  <Field ParsableByteArray sampleDataBuffer>
		sampleBitArray = new ParsableBitArray(sampleDataBuffer.data);
	//   11   23:aload_0         
	//   12   24:new             #65  <Class ParsableBitArray>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//   16   32:getfield        #69  <Field byte[] ParsableByteArray.data>
	//   17   35:invokespecial   #72  <Method void ParsableBitArray(byte[])>
	//   18   38:putfield        #74  <Field ParsableBitArray sampleBitArray>
	//   19   41:return          
	}

	private static long latmGetValue(ParsableBitArray parsablebitarray)
	{
		return (long)parsablebitarray.readBits((parsablebitarray.readBits(2) + 1) * 8);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:bipush          8
	//    7   10:imul            
	//    8   11:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//    9   14:i2l             
	//   10   15:lreturn         
	}

	private void parseAudioMuxElement(ParsableBitArray parsablebitarray)
		throws ParserException
	{
		if(!parsablebitarray.readBit())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #90  <Method boolean ParsableBitArray.readBit()>
	//*   2    4:ifne            20
		{
			streamMuxRead = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #92  <Field boolean streamMuxRead>
			parseStreamMuxConfig(parsablebitarray);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #95  <Method void parseStreamMuxConfig(ParsableBitArray)>
		} else
	//*   9   17:goto            28
		if(!streamMuxRead)
	//*  10   20:aload_0         
	//*  11   21:getfield        #92  <Field boolean streamMuxRead>
	//*  12   24:ifne            28
			return;
	//   13   27:return          
		if(audioMuxVersionA == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field int audioMuxVersionA>
	//*  16   32:ifne            77
		{
			if(numSubframes != 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #99  <Field int numSubframes>
	//*  19   39:ifeq            50
				throw new ParserException();
	//   20   42:new             #86  <Class ParserException>
	//   21   45:dup             
	//   22   46:invokespecial   #100 <Method void ParserException()>
	//   23   49:athrow          
			parsePayloadMux(parsablebitarray, parsePayloadLengthInfo(parsablebitarray));
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokespecial   #104 <Method int parsePayloadLengthInfo(ParsableBitArray)>
	//   29   57:invokespecial   #108 <Method void parsePayloadMux(ParsableBitArray, int)>
			if(otherDataPresent)
	//*  30   60:aload_0         
	//*  31   61:getfield        #110 <Field boolean otherDataPresent>
	//*  32   64:ifeq            76
				parsablebitarray.skipBits((int)otherDataLenBits);
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #112 <Field long otherDataLenBits>
	//   36   72:l2i             
	//   37   73:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   38   76:return          
		} else
		{
			throw new ParserException();
	//   39   77:new             #86  <Class ParserException>
	//   40   80:dup             
	//   41   81:invokespecial   #100 <Method void ParserException()>
	//   42   84:athrow          
		}
	}

	private int parseAudioSpecificConfig(ParsableBitArray parsablebitarray)
		throws ParserException
	{
		int i = parsablebitarray.bitsLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #121 <Method int ParsableBitArray.bitsLeft()>
	//    2    4:istore_2        
		Pair pair = CodecSpecificDataUtil.parseAacAudioSpecificConfig(parsablebitarray, true);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokestatic    #127 <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(ParsableBitArray, boolean)>
	//    6   10:astore_3        
		sampleRateHz = ((Integer)pair.first).intValue();
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:getfield        #133 <Field Object Pair.first>
	//   10   16:checkcast       #135 <Class Integer>
	//   11   19:invokevirtual   #138 <Method int Integer.intValue()>
	//   12   22:putfield        #140 <Field int sampleRateHz>
		channelCount = ((Integer)pair.second).intValue();
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:getfield        #143 <Field Object Pair.second>
	//   16   30:checkcast       #135 <Class Integer>
	//   17   33:invokevirtual   #138 <Method int Integer.intValue()>
	//   18   36:putfield        #145 <Field int channelCount>
		return i - parsablebitarray.bitsLeft();
	//   19   39:iload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #121 <Method int ParsableBitArray.bitsLeft()>
	//   22   44:isub            
	//   23   45:ireturn         
	}

	private void parseFrameLength(ParsableBitArray parsablebitarray)
	{
		frameLengthType = parsablebitarray.readBits(3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//    4    6:putfield        #148 <Field int frameLengthType>
		switch(frameLengthType)
	//*   5    9:aload_0         
	//*   6   10:getfield        #148 <Field int frameLengthType>
		{
	//*   7   13:tableswitch     0 7: default 60
	//	               0 81
	//	               1 74
	//	               2 60
	//	               3 67
	//	               4 67
	//	               5 67
	//	               6 61
	//	               7 61
		case 2: // '\002'
		default:
			return;
	//    8   60:return          

		case 6: // '\006'
		case 7: // '\007'
			parsablebitarray.skipBits(1);
	//    9   61:aload_1         
	//   10   62:iconst_1        
	//   11   63:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   12   66:return          

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			parsablebitarray.skipBits(6);
	//   13   67:aload_1         
	//   14   68:bipush          6
	//   15   70:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   16   73:return          

		case 1: // '\001'
			parsablebitarray.skipBits(9);
	//   17   74:aload_1         
	//   18   75:bipush          9
	//   19   77:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   20   80:return          

		case 0: // '\0'
			parsablebitarray.skipBits(8);
	//   21   81:aload_1         
	//   22   82:bipush          8
	//   23   84:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   24   87:return          
		}
	}

	private int parsePayloadLengthInfo(ParsableBitArray parsablebitarray)
		throws ParserException
	{
		if(frameLengthType == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int frameLengthType>
	//*   2    4:ifne            34
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			int j;
			int k;
			do
			{
				k = parsablebitarray.readBits(8);
	//    5    9:aload_1         
	//    6   10:bipush          8
	//    7   12:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//    8   15:istore          4
				j = i + k;
	//    9   17:iload_2         
	//   10   18:iload           4
	//   11   20:iadd            
	//   12   21:istore_3        
				i = j;
	//   13   22:iload_3         
	//   14   23:istore_2        
			} while(k == 255);
	//   15   24:iload           4
	//   16   26:sipush          255
	//   17   29:icmpeq          9
			return j;
	//   18   32:iload_3         
	//   19   33:ireturn         
		} else
		{
			throw new ParserException();
	//   20   34:new             #86  <Class ParserException>
	//   21   37:dup             
	//   22   38:invokespecial   #100 <Method void ParserException()>
	//   23   41:athrow          
		}
	}

	private void parsePayloadMux(ParsableBitArray parsablebitarray, int i)
	{
		int j = parsablebitarray.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #151 <Method int ParsableBitArray.getPosition()>
	//    2    4:istore_3        
		if((j & 7) == 0)
	//*   3    5:iload_3         
	//*   4    6:bipush          7
	//*   5    8:iand            
	//*   6    9:ifne            25
		{
			sampleDataBuffer.setPosition(j >> 3);
	//    7   12:aload_0         
	//    8   13:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//    9   16:iload_3         
	//   10   17:iconst_3        
	//   11   18:ishr            
	//   12   19:invokevirtual   #154 <Method void ParsableByteArray.setPosition(int)>
		} else
	//*  13   22:goto            49
		{
			parsablebitarray.readBits(sampleDataBuffer.data, 0, i * 8);
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//   17   30:getfield        #69  <Field byte[] ParsableByteArray.data>
	//   18   33:iconst_0        
	//   19   34:iload_2         
	//   20   35:bipush          8
	//   21   37:imul            
	//   22   38:invokevirtual   #157 <Method void ParsableBitArray.readBits(byte[], int, int)>
			sampleDataBuffer.setPosition(0);
	//   23   41:aload_0         
	//   24   42:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #154 <Method void ParsableByteArray.setPosition(int)>
		}
		output.sampleData(sampleDataBuffer, i);
	//   27   49:aload_0         
	//   28   50:getfield        #159 <Field TrackOutput output>
	//   29   53:aload_0         
	//   30   54:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//   31   57:iload_2         
	//   32   58:invokeinterface #165 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		output.sampleMetadata(timeUs, 1, i, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   33   63:aload_0         
	//   34   64:getfield        #159 <Field TrackOutput output>
	//   35   67:aload_0         
	//   36   68:getfield        #167 <Field long timeUs>
	//   37   71:iconst_1        
	//   38   72:iload_2         
	//   39   73:iconst_0        
	//   40   74:aconst_null     
	//   41   75:invokeinterface #171 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		timeUs = timeUs + sampleDurationUs;
	//   42   80:aload_0         
	//   43   81:aload_0         
	//   44   82:getfield        #167 <Field long timeUs>
	//   45   85:aload_0         
	//   46   86:getfield        #173 <Field long sampleDurationUs>
	//   47   89:ladd            
	//   48   90:putfield        #167 <Field long timeUs>
	//   49   93:return          
	}

	private void parseStreamMuxConfig(ParsableBitArray parsablebitarray)
		throws ParserException
	{
		int l = parsablebitarray.readBits(1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//    3    5:istore_3        
		int i;
		if(l == 1)
	//*   4    6:iload_3         
	//*   5    7:iconst_1        
	//*   6    8:icmpne          20
			i = parsablebitarray.readBits(1);
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//   10   16:istore_2        
		else
	//*  11   17:goto            22
			i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
		audioMuxVersionA = i;
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:putfield        #97  <Field int audioMuxVersionA>
		if(audioMuxVersionA == 0)
	//*  17   27:aload_0         
	//*  18   28:getfield        #97  <Field int audioMuxVersionA>
	//*  19   31:ifne            323
		{
			if(l == 1)
	//*  20   34:iload_3         
	//*  21   35:iconst_1        
	//*  22   36:icmpne          44
				latmGetValue(parsablebitarray);
	//   23   39:aload_1         
	//   24   40:invokestatic    #175 <Method long latmGetValue(ParsableBitArray)>
	//   25   43:pop2            
			if(!parsablebitarray.readBit())
	//*  26   44:aload_1         
	//*  27   45:invokevirtual   #90  <Method boolean ParsableBitArray.readBit()>
	//*  28   48:ifne            59
				throw new ParserException();
	//   29   51:new             #86  <Class ParserException>
	//   30   54:dup             
	//   31   55:invokespecial   #100 <Method void ParserException()>
	//   32   58:athrow          
			numSubframes = parsablebitarray.readBits(6);
	//   33   59:aload_0         
	//   34   60:aload_1         
	//   35   61:bipush          6
	//   36   63:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//   37   66:putfield        #99  <Field int numSubframes>
			int j = parsablebitarray.readBits(4);
	//   38   69:aload_1         
	//   39   70:iconst_4        
	//   40   71:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//   41   74:istore_2        
			int i1 = parsablebitarray.readBits(3);
	//   42   75:aload_1         
	//   43   76:iconst_3        
	//   44   77:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//   45   80:istore          4
			if(j == 0 && i1 == 0)
	//*  46   82:iload_2         
	//*  47   83:ifne            315
	//*  48   86:iload           4
	//*  49   88:ifeq            94
	//*  50   91:goto            315
			{
				if(l == 0)
	//*  51   94:iload_3         
	//*  52   95:ifne            215
				{
					int k = parsablebitarray.getPosition();
	//   53   98:aload_1         
	//   54   99:invokevirtual   #151 <Method int ParsableBitArray.getPosition()>
	//   55  102:istore_2        
					int j1 = parseAudioSpecificConfig(parsablebitarray);
	//   56  103:aload_0         
	//   57  104:aload_1         
	//   58  105:invokespecial   #177 <Method int parseAudioSpecificConfig(ParsableBitArray)>
	//   59  108:istore          4
					parsablebitarray.setPosition(k);
	//   60  110:aload_1         
	//   61  111:iload_2         
	//   62  112:invokevirtual   #178 <Method void ParsableBitArray.setPosition(int)>
					byte abyte0[] = new byte[(j1 + 7) / 8];
	//   63  115:iload           4
	//   64  117:bipush          7
	//   65  119:iadd            
	//   66  120:bipush          8
	//   67  122:idiv            
	//   68  123:newarray        byte[]
	//   69  125:astore          6
					parsablebitarray.readBits(abyte0, 0, j1);
	//   70  127:aload_1         
	//   71  128:aload           6
	//   72  130:iconst_0        
	//   73  131:iload           4
	//   74  133:invokevirtual   #157 <Method void ParsableBitArray.readBits(byte[], int, int)>
					Format format1 = Format.createAudioSampleFormat(formatId, "audio/mp4a-latm", ((String) (null)), -1, -1, channelCount, sampleRateHz, Collections.singletonList(((Object) (abyte0))), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, language);
	//   75  136:aload_0         
	//   76  137:getfield        #180 <Field String formatId>
	//   77  140:ldc1            #182 <String "audio/mp4a-latm">
	//   78  142:aconst_null     
	//   79  143:iconst_m1       
	//   80  144:iconst_m1       
	//   81  145:aload_0         
	//   82  146:getfield        #145 <Field int channelCount>
	//   83  149:aload_0         
	//   84  150:getfield        #140 <Field int sampleRateHz>
	//   85  153:aload           6
	//   86  155:invokestatic    #188 <Method java.util.List Collections.singletonList(Object)>
	//   87  158:aconst_null     
	//   88  159:iconst_0        
	//   89  160:aload_0         
	//   90  161:getfield        #56  <Field String language>
	//   91  164:invokestatic    #194 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   92  167:astore          6
					if(!format1.equals(((Object) (format))))
	//*  93  169:aload           6
	//*  94  171:aload_0         
	//*  95  172:getfield        #196 <Field Format format>
	//*  96  175:invokevirtual   #200 <Method boolean Format.equals(Object)>
	//*  97  178:ifne            230
					{
						format = format1;
	//   98  181:aload_0         
	//   99  182:aload           6
	//  100  184:putfield        #196 <Field Format format>
						sampleDurationUs = 0x3d090000L / (long)format1.sampleRate;
	//  101  187:aload_0         
	//  102  188:ldc2w           #201 <Long 0x3d090000L>
	//  103  191:aload           6
	//  104  193:getfield        #205 <Field int Format.sampleRate>
	//  105  196:i2l             
	//  106  197:ldiv            
	//  107  198:putfield        #173 <Field long sampleDurationUs>
						output.format(format1);
	//  108  201:aload_0         
	//  109  202:getfield        #159 <Field TrackOutput output>
	//  110  205:aload           6
	//  111  207:invokeinterface #208 <Method void TrackOutput.format(Format)>
					}
				} else
	//* 112  212:goto            230
				{
					parsablebitarray.skipBits((int)latmGetValue(parsablebitarray) - parseAudioSpecificConfig(parsablebitarray));
	//  113  215:aload_1         
	//  114  216:aload_1         
	//  115  217:invokestatic    #175 <Method long latmGetValue(ParsableBitArray)>
	//  116  220:l2i             
	//  117  221:aload_0         
	//  118  222:aload_1         
	//  119  223:invokespecial   #177 <Method int parseAudioSpecificConfig(ParsableBitArray)>
	//  120  226:isub            
	//  121  227:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
				}
				parseFrameLength(parsablebitarray);
	//  122  230:aload_0         
	//  123  231:aload_1         
	//  124  232:invokespecial   #210 <Method void parseFrameLength(ParsableBitArray)>
				otherDataPresent = parsablebitarray.readBit();
	//  125  235:aload_0         
	//  126  236:aload_1         
	//  127  237:invokevirtual   #90  <Method boolean ParsableBitArray.readBit()>
	//  128  240:putfield        #110 <Field boolean otherDataPresent>
				otherDataLenBits = 0L;
	//  129  243:aload_0         
	//  130  244:lconst_0        
	//  131  245:putfield        #112 <Field long otherDataLenBits>
				boolean flag;
				if(otherDataPresent)
	//* 132  248:aload_0         
	//* 133  249:getfield        #110 <Field boolean otherDataPresent>
	//* 134  252:ifeq            301
					if(l == 1)
	//* 135  255:iload_3         
	//* 136  256:iconst_1        
	//* 137  257:icmpne          271
						otherDataLenBits = latmGetValue(parsablebitarray);
	//  138  260:aload_0         
	//  139  261:aload_1         
	//  140  262:invokestatic    #175 <Method long latmGetValue(ParsableBitArray)>
	//  141  265:putfield        #112 <Field long otherDataLenBits>
					else
	//* 142  268:goto            301
						do
						{
							flag = parsablebitarray.readBit();
	//  143  271:aload_1         
	//  144  272:invokevirtual   #90  <Method boolean ParsableBitArray.readBit()>
	//  145  275:istore          5
							otherDataLenBits = (otherDataLenBits << 8) + (long)parsablebitarray.readBits(8);
	//  146  277:aload_0         
	//  147  278:aload_0         
	//  148  279:getfield        #112 <Field long otherDataLenBits>
	//  149  282:bipush          8
	//  150  284:lshl            
	//  151  285:aload_1         
	//  152  286:bipush          8
	//  153  288:invokevirtual   #82  <Method int ParsableBitArray.readBits(int)>
	//  154  291:i2l             
	//  155  292:ladd            
	//  156  293:putfield        #112 <Field long otherDataLenBits>
						} while(flag);
	//  157  296:iload           5
	//  158  298:ifne            271
				if(parsablebitarray.readBit())
	//* 159  301:aload_1         
	//* 160  302:invokevirtual   #90  <Method boolean ParsableBitArray.readBit()>
	//* 161  305:ifeq            314
					parsablebitarray.skipBits(8);
	//  162  308:aload_1         
	//  163  309:bipush          8
	//  164  311:invokevirtual   #115 <Method void ParsableBitArray.skipBits(int)>
				return;
	//  165  314:return          
			} else
			{
				throw new ParserException();
	//  166  315:new             #86  <Class ParserException>
	//  167  318:dup             
	//  168  319:invokespecial   #100 <Method void ParserException()>
	//  169  322:athrow          
			}
		} else
		{
			throw new ParserException();
	//  170  323:new             #86  <Class ParserException>
	//  171  326:dup             
	//  172  327:invokespecial   #100 <Method void ParserException()>
	//  173  330:athrow          
		}
	}

	private void resetBufferForSize(int i)
	{
		sampleDataBuffer.reset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #214 <Method void ParsableByteArray.reset(int)>
		sampleBitArray.reset(sampleDataBuffer.data);
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field ParsableBitArray sampleBitArray>
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//    8   16:getfield        #69  <Field byte[] ParsableByteArray.data>
	//    9   19:invokevirtual   #216 <Method void ParsableBitArray.reset(byte[])>
	//   10   22:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #221 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            237
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #223 <Field int state>
			{
	//*   5   11:tableswitch     0 3: default 40
	//	               0 220
	//	               1 177
	//	               2 121
	//	               3 43
	//*   6   40:goto            0
			case 3: // '\003'
				int i = Math.min(parsablebytearray.bytesLeft(), sampleSize - bytesRead);
	//    7   43:aload_1         
	//    8   44:invokevirtual   #221 <Method int ParsableByteArray.bytesLeft()>
	//    9   47:aload_0         
	//   10   48:getfield        #225 <Field int sampleSize>
	//   11   51:aload_0         
	//   12   52:getfield        #227 <Field int bytesRead>
	//   13   55:isub            
	//   14   56:invokestatic    #233 <Method int Math.min(int, int)>
	//   15   59:istore_2        
				parsablebytearray.readBytes(sampleBitArray.data, bytesRead, i);
	//   16   60:aload_1         
	//   17   61:aload_0         
	//   18   62:getfield        #74  <Field ParsableBitArray sampleBitArray>
	//   19   65:getfield        #234 <Field byte[] ParsableBitArray.data>
	//   20   68:aload_0         
	//   21   69:getfield        #227 <Field int bytesRead>
	//   22   72:iload_2         
	//   23   73:invokevirtual   #237 <Method void ParsableByteArray.readBytes(byte[], int, int)>
				bytesRead = bytesRead + i;
	//   24   76:aload_0         
	//   25   77:aload_0         
	//   26   78:getfield        #227 <Field int bytesRead>
	//   27   81:iload_2         
	//   28   82:iadd            
	//   29   83:putfield        #227 <Field int bytesRead>
				if(bytesRead == sampleSize)
	//*  30   86:aload_0         
	//*  31   87:getfield        #227 <Field int bytesRead>
	//*  32   90:aload_0         
	//*  33   91:getfield        #225 <Field int sampleSize>
	//*  34   94:icmpne          0
				{
					sampleBitArray.setPosition(0);
	//   35   97:aload_0         
	//   36   98:getfield        #74  <Field ParsableBitArray sampleBitArray>
	//   37  101:iconst_0        
	//   38  102:invokevirtual   #178 <Method void ParsableBitArray.setPosition(int)>
					parseAudioMuxElement(sampleBitArray);
	//   39  105:aload_0         
	//   40  106:aload_0         
	//   41  107:getfield        #74  <Field ParsableBitArray sampleBitArray>
	//   42  110:invokespecial   #239 <Method void parseAudioMuxElement(ParsableBitArray)>
					state = 0;
	//   43  113:aload_0         
	//   44  114:iconst_0        
	//   45  115:putfield        #223 <Field int state>
				}
				break;

	//*  46  118:goto            0
			case 2: // '\002'
				sampleSize = (secondHeaderByte & 0xffffff1f) << 8 | parsablebytearray.readUnsignedByte();
	//   47  121:aload_0         
	//   48  122:aload_0         
	//   49  123:getfield        #241 <Field int secondHeaderByte>
	//   50  126:sipush          -225
	//   51  129:iand            
	//   52  130:bipush          8
	//   53  132:ishl            
	//   54  133:aload_1         
	//   55  134:invokevirtual   #244 <Method int ParsableByteArray.readUnsignedByte()>
	//   56  137:ior             
	//   57  138:putfield        #225 <Field int sampleSize>
				if(sampleSize > sampleDataBuffer.data.length)
	//*  58  141:aload_0         
	//*  59  142:getfield        #225 <Field int sampleSize>
	//*  60  145:aload_0         
	//*  61  146:getfield        #63  <Field ParsableByteArray sampleDataBuffer>
	//*  62  149:getfield        #69  <Field byte[] ParsableByteArray.data>
	//*  63  152:arraylength     
	//*  64  153:icmple          164
					resetBufferForSize(sampleSize);
	//   65  156:aload_0         
	//   66  157:aload_0         
	//   67  158:getfield        #225 <Field int sampleSize>
	//   68  161:invokespecial   #246 <Method void resetBufferForSize(int)>
				bytesRead = 0;
	//   69  164:aload_0         
	//   70  165:iconst_0        
	//   71  166:putfield        #227 <Field int bytesRead>
				state = 3;
	//   72  169:aload_0         
	//   73  170:iconst_3        
	//   74  171:putfield        #223 <Field int state>
				break;

	//*  75  174:goto            0
			case 1: // '\001'
				int j = parsablebytearray.readUnsignedByte();
	//   76  177:aload_1         
	//   77  178:invokevirtual   #244 <Method int ParsableByteArray.readUnsignedByte()>
	//   78  181:istore_2        
				if((j & 0xe0) == 224)
	//*  79  182:iload_2         
	//*  80  183:sipush          224
	//*  81  186:iand            
	//*  82  187:sipush          224
	//*  83  190:icmpne          206
				{
					secondHeaderByte = j;
	//   84  193:aload_0         
	//   85  194:iload_2         
	//   86  195:putfield        #241 <Field int secondHeaderByte>
					state = 2;
	//   87  198:aload_0         
	//   88  199:iconst_2        
	//   89  200:putfield        #223 <Field int state>
				} else
	//*  90  203:goto            0
				if(j != 86)
	//*  91  206:iload_2         
	//*  92  207:bipush          86
	//*  93  209:icmpeq          0
					state = 0;
	//   94  212:aload_0         
	//   95  213:iconst_0        
	//   96  214:putfield        #223 <Field int state>
				break;

	//*  97  217:goto            0
			case 0: // '\0'
				if(parsablebytearray.readUnsignedByte() == 86)
	//*  98  220:aload_1         
	//*  99  221:invokevirtual   #244 <Method int ParsableByteArray.readUnsignedByte()>
	//* 100  224:bipush          86
	//* 101  226:icmpne          0
					state = 1;
	//  102  229:aload_0         
	//  103  230:iconst_1        
	//  104  231:putfield        #223 <Field int state>
				break;
			}
		} while(true);
	//  105  234:goto            0
	//  106  237:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #253 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #256 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//    6   10:iconst_1        
	//    7   11:invokeinterface #262 <Method TrackOutput ExtractorOutput.track(int, int)>
	//    8   16:putfield        #159 <Field TrackOutput output>
		formatId = trackidgenerator.getFormatId();
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #266 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//   12   24:putfield        #180 <Field String formatId>
	//   13   27:return          
	}

	public void packetFinished()
	{
	//    0    0:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		timeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #167 <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #223 <Field int state>
		streamMuxRead = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #92  <Field boolean streamMuxRead>
	//    6   10:return          
	}

	private static final int INITIAL_BUFFER_SIZE = 1024;
	private static final int STATE_FINDING_SYNC_1 = 0;
	private static final int STATE_FINDING_SYNC_2 = 1;
	private static final int STATE_READING_HEADER = 2;
	private static final int STATE_READING_SAMPLE = 3;
	private static final int SYNC_BYTE_FIRST = 86;
	private static final int SYNC_BYTE_SECOND = 224;
	private int audioMuxVersionA;
	private int bytesRead;
	private int channelCount;
	private Format format;
	private String formatId;
	private int frameLengthType;
	private final String language;
	private int numSubframes;
	private long otherDataLenBits;
	private boolean otherDataPresent;
	private TrackOutput output;
	private final ParsableBitArray sampleBitArray;
	private final ParsableByteArray sampleDataBuffer = new ParsableByteArray(1024);
	private long sampleDurationUs;
	private int sampleRateHz;
	private int sampleSize;
	private int secondHeaderByte;
	private int state;
	private boolean streamMuxRead;
	private long timeUs;
}
