// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.*;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader

final class AdtsReader extends ElementaryStreamReader
{

	public AdtsReader(TrackOutput trackoutput, TrackOutput trackoutput1)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void ElementaryStreamReader(TrackOutput)>
		id3Output = trackoutput1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #69  <Field TrackOutput id3Output>
		trackoutput1.format(MediaFormat.createId3Format());
	//    6   10:aload_2         
	//    7   11:invokestatic    #75  <Method MediaFormat MediaFormat.createId3Format()>
	//    8   14:invokeinterface #81  <Method void TrackOutput.format(MediaFormat)>
	//    9   19:aload_0         
	//   10   20:new             #83  <Class ParsableBitArray>
	//   11   23:dup             
	//   12   24:bipush          7
	//   13   26:newarray        byte[]
	//   14   28:invokespecial   #86  <Method void ParsableBitArray(byte[])>
	//   15   31:putfield        #88  <Field ParsableBitArray adtsScratch>
		id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
	//   16   34:aload_0         
	//   17   35:new             #90  <Class ParsableByteArray>
	//   18   38:dup             
	//   19   39:getstatic       #61  <Field byte[] ID3_IDENTIFIER>
	//   20   42:bipush          10
	//   21   44:invokestatic    #96  <Method byte[] Arrays.copyOf(byte[], int)>
	//   22   47:invokespecial   #97  <Method void ParsableByteArray(byte[])>
	//   23   50:putfield        #99  <Field ParsableByteArray id3HeaderBuffer>
		setFindingSampleState();
	//   24   53:aload_0         
	//   25   54:invokespecial   #102 <Method void setFindingSampleState()>
	//   26   57:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #116 <Method int Math.min(int, int)>
	//    7   13:istore          4
		parsablebytearray.readBytes(abyte0, bytesRead, j);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #110 <Field int bytesRead>
	//   12   21:iload           4
	//   13   23:invokevirtual   #120 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #110 <Field int bytesRead>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:putfield        #110 <Field int bytesRead>
		return bytesRead == i;
	//   20   37:aload_0         
	//   21   38:getfield        #110 <Field int bytesRead>
	//   22   41:iload_3         
	//   23   42:icmpne          47
	//   24   45:iconst_1        
	//   25   46:ireturn         
	//   26   47:iconst_0        
	//   27   48:ireturn         
	}

	private void findNextSample(ParsableByteArray parsablebytearray)
	{
		byte abyte0[] = parsablebytearray.data;
	//    0    0:aload_1         
	//    1    1:getfield        #125 <Field byte[] ParsableByteArray.data>
	//    2    4:astore          7
		int i = parsablebytearray.getPosition();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #128 <Method int ParsableByteArray.getPosition()>
	//    5   10:istore_2        
		int k = parsablebytearray.limit();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #131 <Method int ParsableByteArray.limit()>
	//    8   15:istore          4
		do
		{
			if(i >= k)
				break;
	//    9   17:iload_2         
	//   10   18:iload           4
	//   11   20:icmpge          201
			int j = i + 1;
	//   12   23:iload_2         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_3        
			int l = abyte0[i] & 0xff;
	//   16   27:aload           7
	//   17   29:iload_2         
	//   18   30:baload          
	//   19   31:sipush          255
	//   20   34:iand            
	//   21   35:istore          5
			if(matchState == 512 && l >= 240 && l != 255)
	//*  22   37:aload_0         
	//*  23   38:getfield        #133 <Field int matchState>
	//*  24   41:sipush          512
	//*  25   44:icmpne          95
	//*  26   47:iload           5
	//*  27   49:sipush          240
	//*  28   52:icmplt          95
	//*  29   55:iload           5
	//*  30   57:sipush          255
	//*  31   60:icmpeq          95
			{
				boolean flag = true;
	//   32   63:iconst_1        
	//   33   64:istore          6
				if((l & 1) != 0)
	//*  34   66:iload           5
	//*  35   68:iconst_1        
	//*  36   69:iand            
	//*  37   70:ifne            76
	//*  38   73:goto            79
					flag = false;
	//   39   76:iconst_0        
	//   40   77:istore          6
				hasCrc = flag;
	//   41   79:aload_0         
	//   42   80:iload           6
	//   43   82:putfield        #135 <Field boolean hasCrc>
				setReadingAdtsHeaderState();
	//   44   85:aload_0         
	//   45   86:invokespecial   #138 <Method void setReadingAdtsHeaderState()>
				parsablebytearray.setPosition(j);
	//   46   89:aload_1         
	//   47   90:iload_3         
	//   48   91:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
				return;
	//   49   94:return          
			}
			i = matchState;
	//   50   95:aload_0         
	//   51   96:getfield        #133 <Field int matchState>
	//   52   99:istore_2        
			l |= i;
	//   53  100:iload           5
	//   54  102:iload_2         
	//   55  103:ior             
	//   56  104:istore          5
			if(l != 329)
	//*  57  106:iload           5
	//*  58  108:sipush          329
	//*  59  111:icmpeq          189
			{
				if(l != 511)
	//*  60  114:iload           5
	//*  61  116:sipush          511
	//*  62  119:icmpeq          179
				{
					if(l != 836)
	//*  63  122:iload           5
	//*  64  124:sipush          836
	//*  65  127:icmpeq          169
					{
						if(l != 1075)
	//*  66  130:iload           5
	//*  67  132:sipush          1075
	//*  68  135:icmpeq          159
						{
							if(i != 256)
	//*  69  138:iload_2         
	//*  70  139:sipush          256
	//*  71  142:icmpeq          196
							{
								matchState = 256;
	//   72  145:aload_0         
	//   73  146:sipush          256
	//   74  149:putfield        #133 <Field int matchState>
								i = j - 1;
	//   75  152:iload_3         
	//   76  153:iconst_1        
	//   77  154:isub            
	//   78  155:istore_2        
								continue;
	//   79  156:goto            17
							}
						} else
						{
							setReadingId3HeaderState();
	//   80  159:aload_0         
	//   81  160:invokespecial   #145 <Method void setReadingId3HeaderState()>
							parsablebytearray.setPosition(j);
	//   82  163:aload_1         
	//   83  164:iload_3         
	//   84  165:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
							return;
	//   85  168:return          
						}
					} else
					{
						matchState = 1024;
	//   86  169:aload_0         
	//   87  170:sipush          1024
	//   88  173:putfield        #133 <Field int matchState>
					}
				} else
	//*  89  176:goto            196
				{
					matchState = 512;
	//   90  179:aload_0         
	//   91  180:sipush          512
	//   92  183:putfield        #133 <Field int matchState>
				}
			} else
	//*  93  186:goto            196
			{
				matchState = 768;
	//   94  189:aload_0         
	//   95  190:sipush          768
	//   96  193:putfield        #133 <Field int matchState>
			}
			i = j;
	//   97  196:iload_3         
	//   98  197:istore_2        
		} while(true);
	//   99  198:goto            17
		parsablebytearray.setPosition(i);
	//  100  201:aload_1         
	//  101  202:iload_2         
	//  102  203:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
	//  103  206:return          
	}

	private void parseAdtsHeader()
	{
		adtsScratch.setPosition(0);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ParsableBitArray adtsScratch>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #147 <Method void ParsableBitArray.setPosition(int)>
		if(!hasOutputFormat)
	//*   4    8:aload_0         
	//*   5    9:getfield        #149 <Field boolean hasOutputFormat>
	//*   6   12:ifne            180
		{
			int k = adtsScratch.readBits(2) + 1;
	//    7   15:aload_0         
	//    8   16:getfield        #88  <Field ParsableBitArray adtsScratch>
	//    9   19:iconst_2        
	//   10   20:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   11   23:iconst_1        
	//   12   24:iadd            
	//   13   25:istore_2        
			int i = k;
	//   14   26:iload_2         
	//   15   27:istore_1        
			if(k != 2)
	//*  16   28:iload_2         
	//*  17   29:iconst_2        
	//*  18   30:icmpeq          73
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   19   33:new             #155 <Class StringBuilder>
	//   20   36:dup             
	//   21   37:invokespecial   #157 <Method void StringBuilder()>
	//   22   40:astore_3        
				stringbuilder.append("Detected audio object type: ");
	//   23   41:aload_3         
	//   24   42:ldc1            #159 <String "Detected audio object type: ">
	//   25   44:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
				stringbuilder.append(k);
	//   27   48:aload_3         
	//   28   49:iload_2         
	//   29   50:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   30   53:pop             
				stringbuilder.append(", but assuming AAC LC.");
	//   31   54:aload_3         
	//   32   55:ldc1            #168 <String ", but assuming AAC LC.">
	//   33   57:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
				Log.w("AdtsReader", stringbuilder.toString());
	//   35   61:ldc1            #36  <String "AdtsReader">
	//   36   63:aload_3         
	//   37   64:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   38   67:invokestatic    #178 <Method int Log.w(String, String)>
	//   39   70:pop             
				i = 2;
	//   40   71:iconst_2        
	//   41   72:istore_1        
			}
			k = adtsScratch.readBits(4);
	//   42   73:aload_0         
	//   43   74:getfield        #88  <Field ParsableBitArray adtsScratch>
	//   44   77:iconst_4        
	//   45   78:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   46   81:istore_2        
			adtsScratch.skipBits(1);
	//   47   82:aload_0         
	//   48   83:getfield        #88  <Field ParsableBitArray adtsScratch>
	//   49   86:iconst_1        
	//   50   87:invokevirtual   #181 <Method void ParsableBitArray.skipBits(int)>
			byte abyte0[] = CodecSpecificDataUtil.buildAacAudioSpecificConfig(i, k, adtsScratch.readBits(3));
	//   51   90:iload_1         
	//   52   91:iload_2         
	//   53   92:aload_0         
	//   54   93:getfield        #88  <Field ParsableBitArray adtsScratch>
	//   55   96:iconst_3        
	//   56   97:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   57  100:invokestatic    #187 <Method byte[] CodecSpecificDataUtil.buildAacAudioSpecificConfig(int, int, int)>
	//   58  103:astore_3        
			Pair pair = CodecSpecificDataUtil.parseAacAudioSpecificConfig(abyte0);
	//   59  104:aload_3         
	//   60  105:invokestatic    #191 <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(byte[])>
	//   61  108:astore          4
			MediaFormat mediaformat = MediaFormat.createAudioFormat(((String) (null)), "audio/mp4a-latm", -1, -1, -1L, ((Integer)pair.second).intValue(), ((Integer)pair.first).intValue(), Collections.singletonList(((Object) (abyte0))), ((String) (null)));
	//   62  110:aconst_null     
	//   63  111:ldc1            #193 <String "audio/mp4a-latm">
	//   64  113:iconst_m1       
	//   65  114:iconst_m1       
	//   66  115:ldc2w           #194 <Long -1L>
	//   67  118:aload           4
	//   68  120:getfield        #201 <Field Object Pair.second>
	//   69  123:checkcast       #203 <Class Integer>
	//   70  126:invokevirtual   #206 <Method int Integer.intValue()>
	//   71  129:aload           4
	//   72  131:getfield        #209 <Field Object Pair.first>
	//   73  134:checkcast       #203 <Class Integer>
	//   74  137:invokevirtual   #206 <Method int Integer.intValue()>
	//   75  140:aload_3         
	//   76  141:invokestatic    #215 <Method java.util.List Collections.singletonList(Object)>
	//   77  144:aconst_null     
	//   78  145:invokestatic    #219 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//   79  148:astore_3        
			sampleDurationUs = 0x3d090000L / (long)mediaformat.sampleRate;
	//   80  149:aload_0         
	//   81  150:ldc2w           #220 <Long 0x3d090000L>
	//   82  153:aload_3         
	//   83  154:getfield        #224 <Field int MediaFormat.sampleRate>
	//   84  157:i2l             
	//   85  158:ldiv            
	//   86  159:putfield        #226 <Field long sampleDurationUs>
			output.format(mediaformat);
	//   87  162:aload_0         
	//   88  163:getfield        #229 <Field TrackOutput output>
	//   89  166:aload_3         
	//   90  167:invokeinterface #81  <Method void TrackOutput.format(MediaFormat)>
			hasOutputFormat = true;
	//   91  172:aload_0         
	//   92  173:iconst_1        
	//   93  174:putfield        #149 <Field boolean hasOutputFormat>
		} else
	//*  94  177:goto            189
		{
			adtsScratch.skipBits(10);
	//   95  180:aload_0         
	//   96  181:getfield        #88  <Field ParsableBitArray adtsScratch>
	//   97  184:bipush          10
	//   98  186:invokevirtual   #181 <Method void ParsableBitArray.skipBits(int)>
		}
		adtsScratch.skipBits(4);
	//   99  189:aload_0         
	//  100  190:getfield        #88  <Field ParsableBitArray adtsScratch>
	//  101  193:iconst_4        
	//  102  194:invokevirtual   #181 <Method void ParsableBitArray.skipBits(int)>
		int j = adtsScratch.readBits(13) - 2 - 5;
	//  103  197:aload_0         
	//  104  198:getfield        #88  <Field ParsableBitArray adtsScratch>
	//  105  201:bipush          13
	//  106  203:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//  107  206:iconst_2        
	//  108  207:isub            
	//  109  208:iconst_5        
	//  110  209:isub            
	//  111  210:istore_1        
		if(hasCrc)
	//* 112  211:aload_0         
	//* 113  212:getfield        #135 <Field boolean hasCrc>
	//* 114  215:ifeq            225
			j -= 2;
	//  115  218:iload_1         
	//  116  219:iconst_2        
	//  117  220:isub            
	//  118  221:istore_1        
	//* 119  222:goto            225
		setReadingSampleState(output, sampleDurationUs, 0, j);
	//  120  225:aload_0         
	//  121  226:aload_0         
	//  122  227:getfield        #229 <Field TrackOutput output>
	//  123  230:aload_0         
	//  124  231:getfield        #226 <Field long sampleDurationUs>
	//  125  234:iconst_0        
	//  126  235:iload_1         
	//  127  236:invokespecial   #233 <Method void setReadingSampleState(TrackOutput, long, int, int)>
	//  128  239:return          
	}

	private void parseId3Header()
	{
		id3Output.sampleData(id3HeaderBuffer, 10);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field TrackOutput id3Output>
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field ParsableByteArray id3HeaderBuffer>
	//    4    8:bipush          10
	//    5   10:invokeinterface #238 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		id3HeaderBuffer.setPosition(6);
	//    6   15:aload_0         
	//    7   16:getfield        #99  <Field ParsableByteArray id3HeaderBuffer>
	//    8   19:bipush          6
	//    9   21:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
		setReadingSampleState(id3Output, 0L, 10, id3HeaderBuffer.readSynchSafeInt() + 10);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #69  <Field TrackOutput id3Output>
	//   13   29:lconst_0        
	//   14   30:bipush          10
	//   15   32:aload_0         
	//   16   33:getfield        #99  <Field ParsableByteArray id3HeaderBuffer>
	//   17   36:invokevirtual   #241 <Method int ParsableByteArray.readSynchSafeInt()>
	//   18   39:bipush          10
	//   19   41:iadd            
	//   20   42:invokespecial   #233 <Method void setReadingSampleState(TrackOutput, long, int, int)>
	//   21   45:return          
	}

	private void readSample(ParsableByteArray parsablebytearray)
	{
		int i = Math.min(parsablebytearray.bytesLeft(), sampleSize - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:aload_0         
	//    3    5:getfield        #244 <Field int sampleSize>
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field int bytesRead>
	//    6   12:isub            
	//    7   13:invokestatic    #116 <Method int Math.min(int, int)>
	//    8   16:istore_2        
		currentOutput.sampleData(parsablebytearray, i);
	//    9   17:aload_0         
	//   10   18:getfield        #246 <Field TrackOutput currentOutput>
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokeinterface #238 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		bytesRead = bytesRead + i;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #110 <Field int bytesRead>
	//   17   33:iload_2         
	//   18   34:iadd            
	//   19   35:putfield        #110 <Field int bytesRead>
		i = bytesRead;
	//   20   38:aload_0         
	//   21   39:getfield        #110 <Field int bytesRead>
	//   22   42:istore_2        
		int j = sampleSize;
	//   23   43:aload_0         
	//   24   44:getfield        #244 <Field int sampleSize>
	//   25   47:istore_3        
		if(i == j)
	//*  26   48:iload_2         
	//*  27   49:iload_3         
	//*  28   50:icmpne          87
		{
			currentOutput.sampleMetadata(timeUs, 1, j, 0, ((byte []) (null)));
	//   29   53:aload_0         
	//   30   54:getfield        #246 <Field TrackOutput currentOutput>
	//   31   57:aload_0         
	//   32   58:getfield        #248 <Field long timeUs>
	//   33   61:iconst_1        
	//   34   62:iload_3         
	//   35   63:iconst_0        
	//   36   64:aconst_null     
	//   37   65:invokeinterface #252 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
			timeUs = timeUs + currentSampleDuration;
	//   38   70:aload_0         
	//   39   71:aload_0         
	//   40   72:getfield        #248 <Field long timeUs>
	//   41   75:aload_0         
	//   42   76:getfield        #254 <Field long currentSampleDuration>
	//   43   79:ladd            
	//   44   80:putfield        #248 <Field long timeUs>
			setFindingSampleState();
	//   45   83:aload_0         
	//   46   84:invokespecial   #102 <Method void setFindingSampleState()>
		}
	//   47   87:return          
	}

	private void setFindingSampleState()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #256 <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #110 <Field int bytesRead>
		matchState = 256;
	//    6   10:aload_0         
	//    7   11:sipush          256
	//    8   14:putfield        #133 <Field int matchState>
	//    9   17:return          
	}

	private void setReadingAdtsHeaderState()
	{
		state = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #256 <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #110 <Field int bytesRead>
	//    6   10:return          
	}

	private void setReadingId3HeaderState()
	{
		state = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #256 <Field int state>
		bytesRead = ID3_IDENTIFIER.length;
	//    3    5:aload_0         
	//    4    6:getstatic       #61  <Field byte[] ID3_IDENTIFIER>
	//    5    9:arraylength     
	//    6   10:putfield        #110 <Field int bytesRead>
		sampleSize = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #244 <Field int sampleSize>
		id3HeaderBuffer.setPosition(0);
	//   10   18:aload_0         
	//   11   19:getfield        #99  <Field ParsableByteArray id3HeaderBuffer>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #142 <Method void ParsableByteArray.setPosition(int)>
	//   14   26:return          
	}

	private void setReadingSampleState(TrackOutput trackoutput, long l, int i, int j)
	{
		state = 3;
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:putfield        #256 <Field int state>
		bytesRead = i;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #110 <Field int bytesRead>
		currentOutput = trackoutput;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #246 <Field TrackOutput currentOutput>
		currentSampleDuration = l;
	//    9   16:aload_0         
	//   10   17:lload_2         
	//   11   18:putfield        #254 <Field long currentSampleDuration>
		sampleSize = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #244 <Field int sampleSize>
	//   15   27:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            121
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field int state>
			{
	//*   5   11:tableswitch     0 3: default 40
	//	               0 113
	//	               1 89
	//	               2 51
	//	               3 43
	//*   6   40:goto            0
			case 3: // '\003'
				readSample(parsablebytearray);
	//    7   43:aload_0         
	//    8   44:aload_1         
	//    9   45:invokespecial   #259 <Method void readSample(ParsableByteArray)>
				break;

	//*  10   48:goto            0
			case 2: // '\002'
				byte byte0;
				if(hasCrc)
	//*  11   51:aload_0         
	//*  12   52:getfield        #135 <Field boolean hasCrc>
	//*  13   55:ifeq            64
					byte0 = 7;
	//   14   58:bipush          7
	//   15   60:istore_2        
				else
	//*  16   61:goto            66
					byte0 = 5;
	//   17   64:iconst_5        
	//   18   65:istore_2        
				if(continueRead(parsablebytearray, adtsScratch.data, ((int) (byte0))))
	//*  19   66:aload_0         
	//*  20   67:aload_1         
	//*  21   68:aload_0         
	//*  22   69:getfield        #88  <Field ParsableBitArray adtsScratch>
	//*  23   72:getfield        #260 <Field byte[] ParsableBitArray.data>
	//*  24   75:iload_2         
	//*  25   76:invokespecial   #262 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  26   79:ifeq            0
					parseAdtsHeader();
	//   27   82:aload_0         
	//   28   83:invokespecial   #264 <Method void parseAdtsHeader()>
				break;

	//*  29   86:goto            0
			case 1: // '\001'
				if(continueRead(parsablebytearray, id3HeaderBuffer.data, 10))
	//*  30   89:aload_0         
	//*  31   90:aload_1         
	//*  32   91:aload_0         
	//*  33   92:getfield        #99  <Field ParsableByteArray id3HeaderBuffer>
	//*  34   95:getfield        #125 <Field byte[] ParsableByteArray.data>
	//*  35   98:bipush          10
	//*  36  100:invokespecial   #262 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  37  103:ifeq            0
					parseId3Header();
	//   38  106:aload_0         
	//   39  107:invokespecial   #266 <Method void parseId3Header()>
				break;

	//*  40  110:goto            0
			case 0: // '\0'
				findNextSample(parsablebytearray);
	//   41  113:aload_0         
	//   42  114:aload_1         
	//   43  115:invokespecial   #268 <Method void findNextSample(ParsableByteArray)>
				break;
			}
		} while(true);
	//   44  118:goto            0
	//   45  121:return          
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
	//    2    2:putfield        #248 <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		setFindingSampleState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void setFindingSampleState()>
	//    2    4:return          
	}

	private static final int CRC_SIZE = 2;
	private static final int HEADER_SIZE = 5;
	private static final int ID3_HEADER_SIZE = 10;
	private static final byte ID3_IDENTIFIER[] = {
		73, 68, 51
	};
	private static final int ID3_SIZE_OFFSET = 6;
	private static final int MATCH_STATE_FF = 512;
	private static final int MATCH_STATE_I = 768;
	private static final int MATCH_STATE_ID = 1024;
	private static final int MATCH_STATE_START = 256;
	private static final int MATCH_STATE_VALUE_SHIFT = 8;
	private static final int STATE_FINDING_SAMPLE = 0;
	private static final int STATE_READING_ADTS_HEADER = 2;
	private static final int STATE_READING_ID3_HEADER = 1;
	private static final int STATE_READING_SAMPLE = 3;
	private static final String TAG = "AdtsReader";
	private final ParsableBitArray adtsScratch = new ParsableBitArray(new byte[7]);
	private int bytesRead;
	private TrackOutput currentOutput;
	private long currentSampleDuration;
	private boolean hasCrc;
	private boolean hasOutputFormat;
	private final ParsableByteArray id3HeaderBuffer;
	private final TrackOutput id3Output;
	private int matchState;
	private long sampleDurationUs;
	private int sampleSize;
	private int state;
	private long timeUs;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #57  <Int 73>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #58  <Int 68>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #59  <Int 51>
	//   13   17:bastore         
	//   14   18:putstatic       #61  <Field byte[] ID3_IDENTIFIER>
	//*  15   21:return          
	}
}
