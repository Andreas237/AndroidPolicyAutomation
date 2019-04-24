// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class AdtsReader
	implements ElementaryStreamReader
{

	public AdtsReader(boolean flag)
	{
		this(flag, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #73  <Method void AdtsReader(boolean, String)>
	//    4    6:return          
	}

	public AdtsReader(boolean flag, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
		adtsScratch = new ParsableBitArray(new byte[7]);
	//    2    4:aload_0         
	//    3    5:new             #77  <Class ParsableBitArray>
	//    4    8:dup             
	//    5    9:bipush          7
	//    6   11:newarray        byte[]
	//    7   13:invokespecial   #80  <Method void ParsableBitArray(byte[])>
	//    8   16:putfield        #82  <Field ParsableBitArray adtsScratch>
		id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
	//    9   19:aload_0         
	//   10   20:new             #84  <Class ParsableByteArray>
	//   11   23:dup             
	//   12   24:getstatic       #67  <Field byte[] ID3_IDENTIFIER>
	//   13   27:bipush          10
	//   14   29:invokestatic    #90  <Method byte[] Arrays.copyOf(byte[], int)>
	//   15   32:invokespecial   #91  <Method void ParsableByteArray(byte[])>
	//   16   35:putfield        #93  <Field ParsableByteArray id3HeaderBuffer>
		setFindingSampleState();
	//   17   38:aload_0         
	//   18   39:invokespecial   #96  <Method void setFindingSampleState()>
		exposeId3 = flag;
	//   19   42:aload_0         
	//   20   43:iload_1         
	//   21   44:putfield        #98  <Field boolean exposeId3>
		language = s;
	//   22   47:aload_0         
	//   23   48:aload_2         
	//   24   49:putfield        #100 <Field String language>
	//   25   52:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #108 <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #114 <Method int Math.min(int, int)>
	//    7   13:istore          4
		parsablebytearray.readBytes(abyte0, bytesRead, j);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #108 <Field int bytesRead>
	//   12   21:iload           4
	//   13   23:invokevirtual   #118 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #108 <Field int bytesRead>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:putfield        #108 <Field int bytesRead>
		return bytesRead == i;
	//   20   37:aload_0         
	//   21   38:getfield        #108 <Field int bytesRead>
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
	//    1    1:getfield        #123 <Field byte[] ParsableByteArray.data>
	//    2    4:astore          6
		int i = parsablebytearray.getPosition();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #126 <Method int ParsableByteArray.getPosition()>
	//    5   10:istore_2        
		int k = parsablebytearray.limit();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #129 <Method int ParsableByteArray.limit()>
	//    8   15:istore          4
		do
		{
			if(i >= k)
				break;
	//    9   17:iload_2         
	//   10   18:iload           4
	//   11   20:icmpge          198
			int j = i + 1;
	//   12   23:iload_2         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_3        
			i = abyte0[i] & 0xff;
	//   16   27:aload           6
	//   17   29:iload_2         
	//   18   30:baload          
	//   19   31:sipush          255
	//   20   34:iand            
	//   21   35:istore_2        
			if(matchState == 512 && i >= 240 && i != 255)
	//*  22   36:aload_0         
	//*  23   37:getfield        #131 <Field int matchState>
	//*  24   40:sipush          512
	//*  25   43:icmpne          91
	//*  26   46:iload_2         
	//*  27   47:sipush          240
	//*  28   50:icmplt          91
	//*  29   53:iload_2         
	//*  30   54:sipush          255
	//*  31   57:icmpeq          91
			{
				boolean flag = true;
	//   32   60:iconst_1        
	//   33   61:istore          5
				if((i & 1) != 0)
	//*  34   63:iload_2         
	//*  35   64:iconst_1        
	//*  36   65:iand            
	//*  37   66:ifne            72
	//*  38   69:goto            75
					flag = false;
	//   39   72:iconst_0        
	//   40   73:istore          5
				hasCrc = flag;
	//   41   75:aload_0         
	//   42   76:iload           5
	//   43   78:putfield        #133 <Field boolean hasCrc>
				setReadingAdtsHeaderState();
	//   44   81:aload_0         
	//   45   82:invokespecial   #136 <Method void setReadingAdtsHeaderState()>
				parsablebytearray.setPosition(j);
	//   46   85:aload_1         
	//   47   86:iload_3         
	//   48   87:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
				return;
	//   49   90:return          
			}
			i |= matchState;
	//   50   91:iload_2         
	//   51   92:aload_0         
	//   52   93:getfield        #131 <Field int matchState>
	//   53   96:ior             
	//   54   97:istore_2        
			if(i != 329)
	//*  55   98:iload_2         
	//*  56   99:sipush          329
	//*  57  102:icmpeq          186
			{
				if(i != 511)
	//*  58  105:iload_2         
	//*  59  106:sipush          511
	//*  60  109:icmpeq          174
				{
					if(i != 836)
	//*  61  112:iload_2         
	//*  62  113:sipush          836
	//*  63  116:icmpeq          162
					{
						if(i != 1075)
	//*  64  119:iload_2         
	//*  65  120:sipush          1075
	//*  66  123:icmpeq          152
						{
							i = j;
	//   67  126:iload_3         
	//   68  127:istore_2        
							if(matchState != 256)
	//*  69  128:aload_0         
	//*  70  129:getfield        #131 <Field int matchState>
	//*  71  132:sipush          256
	//*  72  135:icmpeq          195
							{
								matchState = 256;
	//   73  138:aload_0         
	//   74  139:sipush          256
	//   75  142:putfield        #131 <Field int matchState>
								i = j - 1;
	//   76  145:iload_3         
	//   77  146:iconst_1        
	//   78  147:isub            
	//   79  148:istore_2        
							}
						} else
	//*  80  149:goto            195
						{
							setReadingId3HeaderState();
	//   81  152:aload_0         
	//   82  153:invokespecial   #143 <Method void setReadingId3HeaderState()>
							parsablebytearray.setPosition(j);
	//   83  156:aload_1         
	//   84  157:iload_3         
	//   85  158:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
							return;
	//   86  161:return          
						}
					} else
					{
						matchState = 1024;
	//   87  162:aload_0         
	//   88  163:sipush          1024
	//   89  166:putfield        #131 <Field int matchState>
						i = j;
	//   90  169:iload_3         
	//   91  170:istore_2        
					}
				} else
	//*  92  171:goto            195
				{
					matchState = 512;
	//   93  174:aload_0         
	//   94  175:sipush          512
	//   95  178:putfield        #131 <Field int matchState>
					i = j;
	//   96  181:iload_3         
	//   97  182:istore_2        
				}
			} else
	//*  98  183:goto            195
			{
				matchState = 768;
	//   99  186:aload_0         
	//  100  187:sipush          768
	//  101  190:putfield        #131 <Field int matchState>
				i = j;
	//  102  193:iload_3         
	//  103  194:istore_2        
			}
		} while(true);
	//  104  195:goto            17
		parsablebytearray.setPosition(i);
	//  105  198:aload_1         
	//  106  199:iload_2         
	//  107  200:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
	//  108  203:return          
	}

	private void parseAdtsHeader()
		throws ParserException
	{
		adtsScratch.setPosition(0);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ParsableBitArray adtsScratch>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #147 <Method void ParsableBitArray.setPosition(int)>
		if(!hasOutputFormat)
	//*   4    8:aload_0         
	//*   5    9:getfield        #149 <Field boolean hasOutputFormat>
	//*   6   12:ifne            186
		{
			int k = adtsScratch.readBits(2) + 1;
	//    7   15:aload_0         
	//    8   16:getfield        #82  <Field ParsableBitArray adtsScratch>
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
	//   21   37:invokespecial   #156 <Method void StringBuilder()>
	//   22   40:astore_3        
				stringbuilder.append("Detected audio object type: ");
	//   23   41:aload_3         
	//   24   42:ldc1            #158 <String "Detected audio object type: ">
	//   25   44:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
				stringbuilder.append(k);
	//   27   48:aload_3         
	//   28   49:iload_2         
	//   29   50:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   30   53:pop             
				stringbuilder.append(", but assuming AAC LC.");
	//   31   54:aload_3         
	//   32   55:ldc1            #167 <String ", but assuming AAC LC.">
	//   33   57:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
				Log.w("AdtsReader", stringbuilder.toString());
	//   35   61:ldc1            #38  <String "AdtsReader">
	//   36   63:aload_3         
	//   37   64:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   38   67:invokestatic    #177 <Method int Log.w(String, String)>
	//   39   70:pop             
				i = 2;
	//   40   71:iconst_2        
	//   41   72:istore_1        
			}
			k = adtsScratch.readBits(4);
	//   42   73:aload_0         
	//   43   74:getfield        #82  <Field ParsableBitArray adtsScratch>
	//   44   77:iconst_4        
	//   45   78:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   46   81:istore_2        
			adtsScratch.skipBits(1);
	//   47   82:aload_0         
	//   48   83:getfield        #82  <Field ParsableBitArray adtsScratch>
	//   49   86:iconst_1        
	//   50   87:invokevirtual   #180 <Method void ParsableBitArray.skipBits(int)>
			byte abyte0[] = CodecSpecificDataUtil.buildAacAudioSpecificConfig(i, k, adtsScratch.readBits(3));
	//   51   90:iload_1         
	//   52   91:iload_2         
	//   53   92:aload_0         
	//   54   93:getfield        #82  <Field ParsableBitArray adtsScratch>
	//   55   96:iconst_3        
	//   56   97:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   57  100:invokestatic    #186 <Method byte[] CodecSpecificDataUtil.buildAacAudioSpecificConfig(int, int, int)>
	//   58  103:astore_3        
			Pair pair = CodecSpecificDataUtil.parseAacAudioSpecificConfig(abyte0);
	//   59  104:aload_3         
	//   60  105:invokestatic    #190 <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(byte[])>
	//   61  108:astore          4
			Format format = Format.createAudioSampleFormat(formatId, "audio/mp4a-latm", ((String) (null)), -1, -1, ((Integer)pair.second).intValue(), ((Integer)pair.first).intValue(), Collections.singletonList(((Object) (abyte0))), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, language);
	//   62  110:aload_0         
	//   63  111:getfield        #192 <Field String formatId>
	//   64  114:ldc1            #194 <String "audio/mp4a-latm">
	//   65  116:aconst_null     
	//   66  117:iconst_m1       
	//   67  118:iconst_m1       
	//   68  119:aload           4
	//   69  121:getfield        #200 <Field Object Pair.second>
	//   70  124:checkcast       #202 <Class Integer>
	//   71  127:invokevirtual   #205 <Method int Integer.intValue()>
	//   72  130:aload           4
	//   73  132:getfield        #208 <Field Object Pair.first>
	//   74  135:checkcast       #202 <Class Integer>
	//   75  138:invokevirtual   #205 <Method int Integer.intValue()>
	//   76  141:aload_3         
	//   77  142:invokestatic    #214 <Method java.util.List Collections.singletonList(Object)>
	//   78  145:aconst_null     
	//   79  146:iconst_0        
	//   80  147:aload_0         
	//   81  148:getfield        #100 <Field String language>
	//   82  151:invokestatic    #220 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   83  154:astore_3        
			sampleDurationUs = 0x3d090000L / (long)format.sampleRate;
	//   84  155:aload_0         
	//   85  156:ldc2w           #221 <Long 0x3d090000L>
	//   86  159:aload_3         
	//   87  160:getfield        #225 <Field int Format.sampleRate>
	//   88  163:i2l             
	//   89  164:ldiv            
	//   90  165:putfield        #227 <Field long sampleDurationUs>
			output.format(format);
	//   91  168:aload_0         
	//   92  169:getfield        #229 <Field TrackOutput output>
	//   93  172:aload_3         
	//   94  173:invokeinterface #235 <Method void TrackOutput.format(Format)>
			hasOutputFormat = true;
	//   95  178:aload_0         
	//   96  179:iconst_1        
	//   97  180:putfield        #149 <Field boolean hasOutputFormat>
		} else
	//*  98  183:goto            195
		{
			adtsScratch.skipBits(10);
	//   99  186:aload_0         
	//  100  187:getfield        #82  <Field ParsableBitArray adtsScratch>
	//  101  190:bipush          10
	//  102  192:invokevirtual   #180 <Method void ParsableBitArray.skipBits(int)>
		}
		adtsScratch.skipBits(4);
	//  103  195:aload_0         
	//  104  196:getfield        #82  <Field ParsableBitArray adtsScratch>
	//  105  199:iconst_4        
	//  106  200:invokevirtual   #180 <Method void ParsableBitArray.skipBits(int)>
		int l = adtsScratch.readBits(13) - 2 - 5;
	//  107  203:aload_0         
	//  108  204:getfield        #82  <Field ParsableBitArray adtsScratch>
	//  109  207:bipush          13
	//  110  209:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//  111  212:iconst_2        
	//  112  213:isub            
	//  113  214:iconst_5        
	//  114  215:isub            
	//  115  216:istore_2        
		int j = l;
	//  116  217:iload_2         
	//  117  218:istore_1        
		if(hasCrc)
	//* 118  219:aload_0         
	//* 119  220:getfield        #133 <Field boolean hasCrc>
	//* 120  223:ifeq            230
			j = l - 2;
	//  121  226:iload_2         
	//  122  227:iconst_2        
	//  123  228:isub            
	//  124  229:istore_1        
		setReadingSampleState(output, sampleDurationUs, 0, j);
	//  125  230:aload_0         
	//  126  231:aload_0         
	//  127  232:getfield        #229 <Field TrackOutput output>
	//  128  235:aload_0         
	//  129  236:getfield        #227 <Field long sampleDurationUs>
	//  130  239:iconst_0        
	//  131  240:iload_1         
	//  132  241:invokespecial   #239 <Method void setReadingSampleState(TrackOutput, long, int, int)>
	//  133  244:return          
	}

	private void parseId3Header()
	{
		id3Output.sampleData(id3HeaderBuffer, 10);
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field TrackOutput id3Output>
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field ParsableByteArray id3HeaderBuffer>
	//    4    8:bipush          10
	//    5   10:invokeinterface #247 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		id3HeaderBuffer.setPosition(6);
	//    6   15:aload_0         
	//    7   16:getfield        #93  <Field ParsableByteArray id3HeaderBuffer>
	//    8   19:bipush          6
	//    9   21:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
		setReadingSampleState(id3Output, 0L, 10, id3HeaderBuffer.readSynchSafeInt() + 10);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #243 <Field TrackOutput id3Output>
	//   13   29:lconst_0        
	//   14   30:bipush          10
	//   15   32:aload_0         
	//   16   33:getfield        #93  <Field ParsableByteArray id3HeaderBuffer>
	//   17   36:invokevirtual   #250 <Method int ParsableByteArray.readSynchSafeInt()>
	//   18   39:bipush          10
	//   19   41:iadd            
	//   20   42:invokespecial   #239 <Method void setReadingSampleState(TrackOutput, long, int, int)>
	//   21   45:return          
	}

	private void readSample(ParsableByteArray parsablebytearray)
	{
		int i = Math.min(parsablebytearray.bytesLeft(), sampleSize - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:aload_0         
	//    3    5:getfield        #253 <Field int sampleSize>
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field int bytesRead>
	//    6   12:isub            
	//    7   13:invokestatic    #114 <Method int Math.min(int, int)>
	//    8   16:istore_2        
		currentOutput.sampleData(parsablebytearray, i);
	//    9   17:aload_0         
	//   10   18:getfield        #255 <Field TrackOutput currentOutput>
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokeinterface #247 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		bytesRead = bytesRead + i;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #108 <Field int bytesRead>
	//   17   33:iload_2         
	//   18   34:iadd            
	//   19   35:putfield        #108 <Field int bytesRead>
		if(bytesRead == sampleSize)
	//*  20   38:aload_0         
	//*  21   39:getfield        #108 <Field int bytesRead>
	//*  22   42:aload_0         
	//*  23   43:getfield        #253 <Field int sampleSize>
	//*  24   46:icmpne          86
		{
			currentOutput.sampleMetadata(timeUs, 1, sampleSize, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   25   49:aload_0         
	//   26   50:getfield        #255 <Field TrackOutput currentOutput>
	//   27   53:aload_0         
	//   28   54:getfield        #257 <Field long timeUs>
	//   29   57:iconst_1        
	//   30   58:aload_0         
	//   31   59:getfield        #253 <Field int sampleSize>
	//   32   62:iconst_0        
	//   33   63:aconst_null     
	//   34   64:invokeinterface #261 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			timeUs = timeUs + currentSampleDuration;
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:getfield        #257 <Field long timeUs>
	//   38   74:aload_0         
	//   39   75:getfield        #263 <Field long currentSampleDuration>
	//   40   78:ladd            
	//   41   79:putfield        #257 <Field long timeUs>
			setFindingSampleState();
	//   42   82:aload_0         
	//   43   83:invokespecial   #96  <Method void setFindingSampleState()>
		}
	//   44   86:return          
	}

	private void setFindingSampleState()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #265 <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #108 <Field int bytesRead>
		matchState = 256;
	//    6   10:aload_0         
	//    7   11:sipush          256
	//    8   14:putfield        #131 <Field int matchState>
	//    9   17:return          
	}

	private void setReadingAdtsHeaderState()
	{
		state = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #265 <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #108 <Field int bytesRead>
	//    6   10:return          
	}

	private void setReadingId3HeaderState()
	{
		state = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #265 <Field int state>
		bytesRead = ID3_IDENTIFIER.length;
	//    3    5:aload_0         
	//    4    6:getstatic       #67  <Field byte[] ID3_IDENTIFIER>
	//    5    9:arraylength     
	//    6   10:putfield        #108 <Field int bytesRead>
		sampleSize = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #253 <Field int sampleSize>
		id3HeaderBuffer.setPosition(0);
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field ParsableByteArray id3HeaderBuffer>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
	//   14   26:return          
	}

	private void setReadingSampleState(TrackOutput trackoutput, long l, int i, int j)
	{
		state = 3;
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:putfield        #265 <Field int state>
		bytesRead = i;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #108 <Field int bytesRead>
		currentOutput = trackoutput;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #255 <Field TrackOutput currentOutput>
		currentSampleDuration = l;
	//    9   16:aload_0         
	//   10   17:lload_2         
	//   11   18:putfield        #263 <Field long currentSampleDuration>
		sampleSize = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #253 <Field int sampleSize>
	//   15   27:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            121
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #265 <Field int state>
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
	//    9   45:invokespecial   #268 <Method void readSample(ParsableByteArray)>
				break;

	//*  10   48:goto            0
			case 2: // '\002'
				byte byte0;
				if(hasCrc)
	//*  11   51:aload_0         
	//*  12   52:getfield        #133 <Field boolean hasCrc>
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
	//*  22   69:getfield        #82  <Field ParsableBitArray adtsScratch>
	//*  23   72:getfield        #269 <Field byte[] ParsableBitArray.data>
	//*  24   75:iload_2         
	//*  25   76:invokespecial   #271 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  26   79:ifeq            0
					parseAdtsHeader();
	//   27   82:aload_0         
	//   28   83:invokespecial   #273 <Method void parseAdtsHeader()>
				break;

	//*  29   86:goto            0
			case 1: // '\001'
				if(continueRead(parsablebytearray, id3HeaderBuffer.data, 10))
	//*  30   89:aload_0         
	//*  31   90:aload_1         
	//*  32   91:aload_0         
	//*  33   92:getfield        #93  <Field ParsableByteArray id3HeaderBuffer>
	//*  34   95:getfield        #123 <Field byte[] ParsableByteArray.data>
	//*  35   98:bipush          10
	//*  36  100:invokespecial   #271 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  37  103:ifeq            0
					parseId3Header();
	//   38  106:aload_0         
	//   39  107:invokespecial   #275 <Method void parseId3Header()>
				break;

	//*  40  110:goto            0
			case 0: // '\0'
				findNextSample(parsablebytearray);
	//   41  113:aload_0         
	//   42  114:aload_1         
	//   43  115:invokespecial   #277 <Method void findNextSample(ParsableByteArray)>
				break;
			}
		} while(true);
	//   44  118:goto            0
	//   45  121:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #284 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		formatId = trackidgenerator.getFormatId();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #287 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//    5    9:putfield        #192 <Field String formatId>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #290 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   10   18:iconst_1        
	//   11   19:invokeinterface #296 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   12   24:putfield        #229 <Field TrackOutput output>
		if(exposeId3)
	//*  13   27:aload_0         
	//*  14   28:getfield        #98  <Field boolean exposeId3>
	//*  15   31:ifeq            76
		{
			trackidgenerator.generateNewId();
	//   16   34:aload_2         
	//   17   35:invokevirtual   #284 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
			id3Output = extractoroutput.track(trackidgenerator.getTrackId(), 4);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #290 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   22   44:iconst_4        
	//   23   45:invokeinterface #296 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   24   50:putfield        #243 <Field TrackOutput id3Output>
			id3Output.format(Format.createSampleFormat(trackidgenerator.getFormatId(), "application/id3", ((String) (null)), -1, ((com.google.android.exoplayer2.drm.DrmInitData) (null))));
	//   25   53:aload_0         
	//   26   54:getfield        #243 <Field TrackOutput id3Output>
	//   27   57:aload_2         
	//   28   58:invokevirtual   #287 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//   29   61:ldc2            #298 <String "application/id3">
	//   30   64:aconst_null     
	//   31   65:iconst_m1       
	//   32   66:aconst_null     
	//   33   67:invokestatic    #302 <Method Format Format.createSampleFormat(String, String, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//   34   70:invokeinterface #235 <Method void TrackOutput.format(Format)>
			return;
	//   35   75:return          
		} else
		{
			id3Output = ((TrackOutput) (new DummyTrackOutput()));
	//   36   76:aload_0         
	//   37   77:new             #304 <Class DummyTrackOutput>
	//   38   80:dup             
	//   39   81:invokespecial   #305 <Method void DummyTrackOutput()>
	//   40   84:putfield        #243 <Field TrackOutput id3Output>
			return;
	//   41   87:return          
		}
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
	//    2    2:putfield        #257 <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		setFindingSampleState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void setFindingSampleState()>
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
	private final ParsableBitArray adtsScratch;
	private int bytesRead;
	private TrackOutput currentOutput;
	private long currentSampleDuration;
	private final boolean exposeId3;
	private String formatId;
	private boolean hasCrc;
	private boolean hasOutputFormat;
	private final ParsableByteArray id3HeaderBuffer;
	private TrackOutput id3Output;
	private final String language;
	private int matchState;
	private TrackOutput output;
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
	//    4    5:ldc1            #63  <Int 73>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #64  <Int 68>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #65  <Int 51>
	//   13   17:bastore         
	//   14   18:putstatic       #67  <Field byte[] ID3_IDENTIFIER>
	//*  15   21:return          
	}
}
