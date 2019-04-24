// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.util:
//			ParsableBitArray, Assertions

public final class CodecSpecificDataUtil
{

	private CodecSpecificDataUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] buildAacAudioSpecificConfig(int i, int j, int k)
	{
		return (new byte[] {
			(byte)(i << 3 & 0xf8 | j >> 1 & 7), (byte)(j << 7 & 0x80 | k << 3 & 0x78)
		});
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:iconst_3        
	//    6    7:ishl            
	//    7    8:sipush          248
	//    8   11:iand            
	//    9   12:iload_1         
	//   10   13:iconst_1        
	//   11   14:ishr            
	//   12   15:bipush          7
	//   13   17:iand            
	//   14   18:ior             
	//   15   19:int2byte        
	//   16   20:bastore         
	//   17   21:dup             
	//   18   22:iconst_1        
	//   19   23:iload_1         
	//   20   24:bipush          7
	//   21   26:ishl            
	//   22   27:sipush          128
	//   23   30:iand            
	//   24   31:iload_2         
	//   25   32:iconst_3        
	//   26   33:ishl            
	//   27   34:bipush          120
	//   28   36:iand            
	//   29   37:ior             
	//   30   38:int2byte        
	//   31   39:bastore         
	//   32   40:areturn         
	}

	public static byte[] buildAacLcAudioSpecificConfig(int i, int j)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int k = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		int i1 = -1;
	//    4    5:iconst_m1       
	//    5    6:istore_3        
		for(; k < AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE.length; k++)
	//*   6    7:iload_2         
	//*   7    8:getstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//*   8   11:arraylength     
	//*   9   12:icmpge          33
			if(i == AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[k])
	//*  10   15:iload_0         
	//*  11   16:getstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//*  12   19:iload_2         
	//*  13   20:iaload          
	//*  14   21:icmpne          26
				i1 = k;
	//   15   24:iload_2         
	//   16   25:istore_3        

	//   17   26:iload_2         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_2        
	//*  21   30:goto            7
		int j1 = -1;
	//   22   33:iconst_m1       
	//   23   34:istore          4
		for(int l = ((int) (flag)); l < AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE.length; l++)
	//*  24   36:iload           5
	//*  25   38:istore_2        
	//*  26   39:iload_2         
	//*  27   40:getstatic       #39  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//*  28   43:arraylength     
	//*  29   44:icmpge          66
			if(j == AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[l])
	//*  30   47:iload_1         
	//*  31   48:getstatic       #39  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//*  32   51:iload_2         
	//*  33   52:iaload          
	//*  34   53:icmpne          59
				j1 = l;
	//   35   56:iload_2         
	//   36   57:istore          4

	//   37   59:iload_2         
	//   38   60:iconst_1        
	//   39   61:iadd            
	//   40   62:istore_2        
	//*  41   63:goto            39
		if(i != -1 && j1 != -1)
	//*  42   66:iload_0         
	//*  43   67:iconst_m1       
	//*  44   68:icmpeq          88
	//*  45   71:iload           4
	//*  46   73:iconst_m1       
	//*  47   74:icmpne          80
	//*  48   77:goto            88
		{
			return buildAacAudioSpecificConfig(2, i1, j1);
	//   49   80:iconst_2        
	//   50   81:iload_3         
	//   51   82:iload           4
	//   52   84:invokestatic    #49  <Method byte[] buildAacAudioSpecificConfig(int, int, int)>
	//   53   87:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   54   88:new             #51  <Class StringBuilder>
	//   55   91:dup             
	//   56   92:invokespecial   #52  <Method void StringBuilder()>
	//   57   95:astore          6
			stringbuilder.append("Invalid sample rate or number of channels: ");
	//   58   97:aload           6
	//   59   99:ldc1            #54  <String "Invalid sample rate or number of channels: ">
	//   60  101:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   61  104:pop             
			stringbuilder.append(i);
	//   62  105:aload           6
	//   63  107:iload_0         
	//   64  108:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   65  111:pop             
			stringbuilder.append(", ");
	//   66  112:aload           6
	//   67  114:ldc1            #63  <String ", ">
	//   68  116:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   69  119:pop             
			stringbuilder.append(j);
	//   70  120:aload           6
	//   71  122:iload_1         
	//   72  123:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   73  126:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   74  127:new             #65  <Class IllegalArgumentException>
	//   75  130:dup             
	//   76  131:aload           6
	//   77  133:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   78  136:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//   79  139:athrow          
		}
	}

	public static byte[] buildNalUnit(byte abyte0[], int i, int j)
	{
		byte abyte1[] = new byte[NAL_START_CODE.length + j];
	//    0    0:getstatic       #30  <Field byte[] NAL_START_CODE>
	//    1    3:arraylength     
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:newarray        byte[]
	//    5    8:astore_3        
		System.arraycopy(((Object) (NAL_START_CODE)), 0, ((Object) (abyte1)), 0, NAL_START_CODE.length);
	//    6    9:getstatic       #30  <Field byte[] NAL_START_CODE>
	//    7   12:iconst_0        
	//    8   13:aload_3         
	//    9   14:iconst_0        
	//   10   15:getstatic       #30  <Field byte[] NAL_START_CODE>
	//   11   18:arraylength     
	//   12   19:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), NAL_START_CODE.length, j);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:aload_3         
	//   16   25:getstatic       #30  <Field byte[] NAL_START_CODE>
	//   17   28:arraylength     
	//   18   29:iload_2         
	//   19   30:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//   20   33:aload_3         
	//   21   34:areturn         
	}

	private static int findNalStartCode(byte abyte0[], int i)
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		for(int k = NAL_START_CODE.length; i <= j - k; i++)
	//*   3    3:getstatic       #30  <Field byte[] NAL_START_CODE>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_1         
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:isub            
	//*  10   12:icmpgt          32
			if(isNalStartCode(abyte0, i))
	//*  11   15:aload_0         
	//*  12   16:iload_1         
	//*  13   17:invokestatic    #86  <Method boolean isNalStartCode(byte[], int)>
	//*  14   20:ifeq            25
				return i;
	//   15   23:iload_1         
	//   16   24:ireturn         

	//   17   25:iload_1         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            8
		return -1;
	//   22   32:iconst_m1       
	//   23   33:ireturn         
	}

	private static int getAacAudioObjectType(ParsableBitArray parsablebitarray)
	{
		int j = parsablebitarray.readBits(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//    3    5:istore_2        
		int i = j;
	//    4    6:iload_2         
	//    5    7:istore_1        
		if(j == 31)
	//*   6    8:iload_2         
	//*   7    9:bipush          31
	//*   8   11:icmpne          24
			i = 32 + parsablebitarray.readBits(6);
	//    9   14:bipush          32
	//   10   16:aload_0         
	//   11   17:bipush          6
	//   12   19:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//   13   22:iadd            
	//   14   23:istore_1        
		return i;
	//   15   24:iload_1         
	//   16   25:ireturn         
	}

	private static int getAacSamplingFrequency(ParsableBitArray parsablebitarray)
	{
		int i = parsablebitarray.readBits(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//    3    5:istore_1        
		if(i == 15)
	//*   4    6:iload_1         
	//*   5    7:bipush          15
	//*   6    9:icmpne          19
			return parsablebitarray.readBits(24);
	//    7   12:aload_0         
	//    8   13:bipush          24
	//    9   15:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//   10   18:ireturn         
		boolean flag;
		if(i < 13)
	//*  11   19:iload_1         
	//*  12   20:bipush          13
	//*  13   22:icmpge          30
			flag = true;
	//   14   25:iconst_1        
	//   15   26:istore_2        
		else
	//*  16   27:goto            32
			flag = false;
	//   17   30:iconst_0        
	//   18   31:istore_2        
		Assertions.checkArgument(flag);
	//   19   32:iload_2         
	//   20   33:invokestatic    #101 <Method void Assertions.checkArgument(boolean)>
		return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[i];
	//   21   36:getstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//   22   39:iload_1         
	//   23   40:iaload          
	//   24   41:ireturn         
	}

	private static boolean isNalStartCode(byte abyte0[], int i)
	{
		if(abyte0.length - i <= NAL_START_CODE.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iload_1         
	//*   3    3:isub            
	//*   4    4:getstatic       #30  <Field byte[] NAL_START_CODE>
	//*   5    7:arraylength     
	//*   6    8:icmpgt          13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		for(int j = 0; j < NAL_START_CODE.length; j++)
	//*   9   13:iconst_0        
	//*  10   14:istore_2        
	//*  11   15:iload_2         
	//*  12   16:getstatic       #30  <Field byte[] NAL_START_CODE>
	//*  13   19:arraylength     
	//*  14   20:icmpge          45
			if(abyte0[i + j] != NAL_START_CODE[j])
	//*  15   23:aload_0         
	//*  16   24:iload_1         
	//*  17   25:iload_2         
	//*  18   26:iadd            
	//*  19   27:baload          
	//*  20   28:getstatic       #30  <Field byte[] NAL_START_CODE>
	//*  21   31:iload_2         
	//*  22   32:baload          
	//*  23   33:icmpeq          38
				return false;
	//   24   36:iconst_0        
	//   25   37:ireturn         

	//   26   38:iload_2         
	//   27   39:iconst_1        
	//   28   40:iadd            
	//   29   41:istore_2        
	//*  30   42:goto            15
		return true;
	//   31   45:iconst_1        
	//   32   46:ireturn         
	}

	public static Pair parseAacAudioSpecificConfig(ParsableBitArray parsablebitarray, boolean flag)
		throws ParserException
	{
		int i;
		int j;
		int k;
label0:
		{
			int i1 = getAacAudioObjectType(parsablebitarray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method int getAacAudioObjectType(ParsableBitArray)>
	//    2    4:istore          6
			i = getAacSamplingFrequency(parsablebitarray);
	//    3    6:aload_0         
	//    4    7:invokestatic    #109 <Method int getAacSamplingFrequency(ParsableBitArray)>
	//    5   10:istore_2        
			int l = parsablebitarray.readBits(4);
	//    6   11:aload_0         
	//    7   12:iconst_4        
	//    8   13:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//    9   16:istore          5
			if(i1 != 5)
	//*  10   18:iload           6
	//*  11   20:iconst_5        
	//*  12   21:icmpeq          38
			{
				j = i1;
	//   13   24:iload           6
	//   14   26:istore_3        
				k = l;
	//   15   27:iload           5
	//   16   29:istore          4
				if(i1 != 29)
					break label0;
	//   17   31:iload           6
	//   18   33:bipush          29
	//   19   35:icmpne          80
			}
			i1 = getAacSamplingFrequency(parsablebitarray);
	//   20   38:aload_0         
	//   21   39:invokestatic    #109 <Method int getAacSamplingFrequency(ParsableBitArray)>
	//   22   42:istore          6
			int j1 = getAacAudioObjectType(parsablebitarray);
	//   23   44:aload_0         
	//   24   45:invokestatic    #107 <Method int getAacAudioObjectType(ParsableBitArray)>
	//   25   48:istore          7
			j = j1;
	//   26   50:iload           7
	//   27   52:istore_3        
			i = i1;
	//   28   53:iload           6
	//   29   55:istore_2        
			k = l;
	//   30   56:iload           5
	//   31   58:istore          4
			if(j1 == 22)
	//*  32   60:iload           7
	//*  33   62:bipush          22
	//*  34   64:icmpne          80
			{
				k = parsablebitarray.readBits(4);
	//   35   67:aload_0         
	//   36   68:iconst_4        
	//   37   69:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//   38   72:istore          4
				i = i1;
	//   39   74:iload           6
	//   40   76:istore_2        
				j = j1;
	//   41   77:iload           7
	//   42   79:istore_3        
			}
		}
		if(flag)
	//*  43   80:iload_1         
	//*  44   81:ifeq            316
		{
			if(j != 17)
	//*  45   84:iload_3         
	//*  46   85:bipush          17
	//*  47   87:icmpeq          213
				switch(j)
	//*  48   90:iload_3         
				{
	//*  49   91:tableswitch     1 4: default 120
	//	               1 213
	//	               2 213
	//	               3 213
	//	               4 213
				default:
					switch(j)
	//*  50  120:iload_3         
					{
	//*  51  121:tableswitch     6 7: default 144
	//	               6 213
	//	               7 213
					default:
						switch(j)
	//*  52  144:iload_3         
						{
	//*  53  145:tableswitch     19 23: default 180
	//	               19 213
	//	               20 213
	//	               21 213
	//	               22 213
	//	               23 213
						default:
							parsablebitarray = ((ParsableBitArray) (new StringBuilder()));
	//   54  180:new             #51  <Class StringBuilder>
	//   55  183:dup             
	//   56  184:invokespecial   #52  <Method void StringBuilder()>
	//   57  187:astore_0        
							((StringBuilder) (parsablebitarray)).append("Unsupported audio object type: ");
	//   58  188:aload_0         
	//   59  189:ldc1            #111 <String "Unsupported audio object type: ">
	//   60  191:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   61  194:pop             
							((StringBuilder) (parsablebitarray)).append(j);
	//   62  195:aload_0         
	//   63  196:iload_3         
	//   64  197:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   65  200:pop             
							throw new ParserException(((StringBuilder) (parsablebitarray)).toString());
	//   66  201:new             #105 <Class ParserException>
	//   67  204:dup             
	//   68  205:aload_0         
	//   69  206:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   70  209:invokespecial   #112 <Method void ParserException(String)>
	//   71  212:athrow          

						case 19: // '\023'
						case 20: // '\024'
						case 21: // '\025'
						case 22: // '\026'
						case 23: // '\027'
							break;
						}
						break;

					case 6: // '\006'
					case 7: // '\007'
						break;
					}
					break;

				case 1: // '\001'
				case 2: // '\002'
				case 3: // '\003'
				case 4: // '\004'
					break;
				}
			parseGaSpecificConfig(parsablebitarray, j, k);
	//   72  213:aload_0         
	//   73  214:iload_3         
	//   74  215:iload           4
	//   75  217:invokestatic    #116 <Method void parseGaSpecificConfig(ParsableBitArray, int, int)>
			switch(j)
	//*  76  220:iload_3         
			{
	//*  77  221:tableswitch     17 23: default 264
	//	               17 267
	//	               18 264
	//	               19 267
	//	               20 267
	//	               21 267
	//	               22 267
	//	               23 267
	//*  78  264:goto            316
			case 17: // '\021'
			case 19: // '\023'
			case 20: // '\024'
			case 21: // '\025'
			case 22: // '\026'
			case 23: // '\027'
				j = parsablebitarray.readBits(2);
	//   79  267:aload_0         
	//   80  268:iconst_2        
	//   81  269:invokevirtual   #94  <Method int ParsableBitArray.readBits(int)>
	//   82  272:istore_3        
				if(j == 2 || j == 3)
	//*  83  273:iload_3         
	//*  84  274:iconst_2        
	//*  85  275:icmpeq          283
	//*  86  278:iload_3         
	//*  87  279:iconst_3        
	//*  88  280:icmpne          316
				{
					parsablebitarray = ((ParsableBitArray) (new StringBuilder()));
	//   89  283:new             #51  <Class StringBuilder>
	//   90  286:dup             
	//   91  287:invokespecial   #52  <Method void StringBuilder()>
	//   92  290:astore_0        
					((StringBuilder) (parsablebitarray)).append("Unsupported epConfig: ");
	//   93  291:aload_0         
	//   94  292:ldc1            #118 <String "Unsupported epConfig: ">
	//   95  294:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   96  297:pop             
					((StringBuilder) (parsablebitarray)).append(j);
	//   97  298:aload_0         
	//   98  299:iload_3         
	//   99  300:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//  100  303:pop             
					throw new ParserException(((StringBuilder) (parsablebitarray)).toString());
	//  101  304:new             #105 <Class ParserException>
	//  102  307:dup             
	//  103  308:aload_0         
	//  104  309:invokevirtual   #69  <Method String StringBuilder.toString()>
	//  105  312:invokespecial   #112 <Method void ParserException(String)>
	//  106  315:athrow          
				}
				break;
			}
		}
		j = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[k];
	//  107  316:getstatic       #39  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//  108  319:iload           4
	//  109  321:iaload          
	//  110  322:istore_3        
		if(j != -1)
	//* 111  323:iload_3         
	//* 112  324:iconst_m1       
	//* 113  325:icmpeq          333
			flag = true;
	//  114  328:iconst_1        
	//  115  329:istore_1        
		else
	//* 116  330:goto            335
			flag = false;
	//  117  333:iconst_0        
	//  118  334:istore_1        
		Assertions.checkArgument(flag);
	//  119  335:iload_1         
	//  120  336:invokestatic    #101 <Method void Assertions.checkArgument(boolean)>
		return Pair.create(((Object) (Integer.valueOf(i))), ((Object) (Integer.valueOf(j))));
	//  121  339:iload_2         
	//  122  340:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//  123  343:iload_3         
	//  124  344:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//  125  347:invokestatic    #130 <Method Pair Pair.create(Object, Object)>
	//  126  350:areturn         
	}

	public static Pair parseAacAudioSpecificConfig(byte abyte0[])
		throws ParserException
	{
		return parseAacAudioSpecificConfig(new ParsableBitArray(abyte0), false);
	//    0    0:new             #90  <Class ParsableBitArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #137 <Method void ParsableBitArray(byte[])>
	//    4    8:iconst_0        
	//    5    9:invokestatic    #139 <Method Pair parseAacAudioSpecificConfig(ParsableBitArray, boolean)>
	//    6   12:areturn         
	}

	private static void parseGaSpecificConfig(ParsableBitArray parsablebitarray, int i, int j)
	{
		parsablebitarray.skipBits(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #144 <Method void ParsableBitArray.skipBits(int)>
		if(parsablebitarray.readBit())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #148 <Method boolean ParsableBitArray.readBit()>
	//*   5    9:ifeq            18
			parsablebitarray.skipBits(14);
	//    6   12:aload_0         
	//    7   13:bipush          14
	//    8   15:invokevirtual   #144 <Method void ParsableBitArray.skipBits(int)>
		boolean flag = parsablebitarray.readBit();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #148 <Method boolean ParsableBitArray.readBit()>
	//   11   22:istore_3        
		if(j == 0)
	//*  12   23:iload_2         
	//*  13   24:ifne            35
			throw new UnsupportedOperationException();
	//   14   27:new             #150 <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:invokespecial   #151 <Method void UnsupportedOperationException()>
	//   17   34:athrow          
		if(i == 6 || i == 20)
	//*  18   35:iload_1         
	//*  19   36:bipush          6
	//*  20   38:icmpeq          47
	//*  21   41:iload_1         
	//*  22   42:bipush          20
	//*  23   44:icmpne          52
			parsablebitarray.skipBits(3);
	//   24   47:aload_0         
	//   25   48:iconst_3        
	//   26   49:invokevirtual   #144 <Method void ParsableBitArray.skipBits(int)>
		if(flag)
	//*  27   52:iload_3         
	//*  28   53:ifeq            102
		{
			if(i == 22)
	//*  29   56:iload_1         
	//*  30   57:bipush          22
	//*  31   59:icmpne          68
				parsablebitarray.skipBits(16);
	//   32   62:aload_0         
	//   33   63:bipush          16
	//   34   65:invokevirtual   #144 <Method void ParsableBitArray.skipBits(int)>
			if(i == 17 || i == 19 || i == 20 || i == 23)
	//*  35   68:iload_1         
	//*  36   69:bipush          17
	//*  37   71:icmpeq          92
	//*  38   74:iload_1         
	//*  39   75:bipush          19
	//*  40   77:icmpeq          92
	//*  41   80:iload_1         
	//*  42   81:bipush          20
	//*  43   83:icmpeq          92
	//*  44   86:iload_1         
	//*  45   87:bipush          23
	//*  46   89:icmpne          97
				parsablebitarray.skipBits(3);
	//   47   92:aload_0         
	//   48   93:iconst_3        
	//   49   94:invokevirtual   #144 <Method void ParsableBitArray.skipBits(int)>
			parsablebitarray.skipBits(1);
	//   50   97:aload_0         
	//   51   98:iconst_1        
	//   52   99:invokevirtual   #144 <Method void ParsableBitArray.skipBits(int)>
		}
	//   53  102:return          
	}

	public static byte[][] splitNalUnits(byte abyte0[])
	{
		if(!isNalStartCode(abyte0, 0))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokestatic    #86  <Method boolean isNalStartCode(byte[], int)>
	//*   3    5:ifne            13
			return (byte[][])null;
	//    4    8:aconst_null     
	//    5    9:checkcast       #155 <Class byte[][]>
	//    6   12:areturn         
		ArrayList arraylist = new ArrayList();
	//    7   13:new             #157 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #158 <Method void ArrayList()>
	//   10   20:astore          4
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		int k;
		do
		{
			((List) (arraylist)).add(((Object) (Integer.valueOf(i))));
	//   13   24:aload           4
	//   14   26:iload_1         
	//   15   27:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   16   30:invokeinterface #164 <Method boolean List.add(Object)>
	//   17   35:pop             
			k = findNalStartCode(abyte0, i + NAL_START_CODE.length);
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:getstatic       #30  <Field byte[] NAL_START_CODE>
	//   21   41:arraylength     
	//   22   42:iadd            
	//   23   43:invokestatic    #166 <Method int findNalStartCode(byte[], int)>
	//   24   46:istore_2        
			i = k;
	//   25   47:iload_2         
	//   26   48:istore_1        
		} while(k != -1);
	//   27   49:iload_2         
	//   28   50:iconst_m1       
	//   29   51:icmpne          24
		byte abyte1[][] = new byte[((List) (arraylist)).size()][];
	//   30   54:aload           4
	//   31   56:invokeinterface #170 <Method int List.size()>
	//   32   61:anewarray       byte[][]
	//   33   64:astore          5
		for(int j = 0; j < ((List) (arraylist)).size(); j++)
	//*  34   66:iconst_0        
	//*  35   67:istore_1        
	//*  36   68:iload_1         
	//*  37   69:aload           4
	//*  38   71:invokeinterface #170 <Method int List.size()>
	//*  39   76:icmpge          161
		{
			int i1 = ((Integer)((List) (arraylist)).get(j)).intValue();
	//   40   79:aload           4
	//   41   81:iload_1         
	//   42   82:invokeinterface #175 <Method Object List.get(int)>
	//   43   87:checkcast       #120 <Class Integer>
	//   44   90:invokevirtual   #178 <Method int Integer.intValue()>
	//   45   93:istore_3        
			int l;
			if(j < ((List) (arraylist)).size() - 1)
	//*  46   94:iload_1         
	//*  47   95:aload           4
	//*  48   97:invokeinterface #170 <Method int List.size()>
	//*  49  102:iconst_1        
	//*  50  103:isub            
	//*  51  104:icmpge          127
				l = ((Integer)((List) (arraylist)).get(j + 1)).intValue();
	//   52  107:aload           4
	//   53  109:iload_1         
	//   54  110:iconst_1        
	//   55  111:iadd            
	//   56  112:invokeinterface #175 <Method Object List.get(int)>
	//   57  117:checkcast       #120 <Class Integer>
	//   58  120:invokevirtual   #178 <Method int Integer.intValue()>
	//   59  123:istore_2        
			else
	//*  60  124:goto            130
				l = abyte0.length;
	//   61  127:aload_0         
	//   62  128:arraylength     
	//   63  129:istore_2        
			byte abyte2[] = new byte[l - i1];
	//   64  130:iload_2         
	//   65  131:iload_3         
	//   66  132:isub            
	//   67  133:newarray        byte[]
	//   68  135:astore          6
			System.arraycopy(((Object) (abyte0)), i1, ((Object) (abyte2)), 0, abyte2.length);
	//   69  137:aload_0         
	//   70  138:iload_3         
	//   71  139:aload           6
	//   72  141:iconst_0        
	//   73  142:aload           6
	//   74  144:arraylength     
	//   75  145:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
			abyte1[j] = abyte2;
	//   76  148:aload           5
	//   77  150:iload_1         
	//   78  151:aload           6
	//   79  153:aastore         
		}

	//   80  154:iload_1         
	//   81  155:iconst_1        
	//   82  156:iadd            
	//   83  157:istore_1        
	//*  84  158:goto            68
		return abyte1;
	//   85  161:aload           5
	//   86  163:areturn         
	}

	private static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
	private static final int AUDIO_OBJECT_TYPE_ER_BSAC = 22;
	private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
	private static final int AUDIO_OBJECT_TYPE_PS = 29;
	private static final int AUDIO_OBJECT_TYPE_SBR = 5;
	private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
	private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[] = {
		0, 1, 2, 3, 4, 5, 6, 8, -1, -1, 
		-1, 7, 8, -1, 8, -1
	};
	private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
	private static final int AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[] = {
		0x17700, 0x15888, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
		11025, 8000, 7350
	};
	private static final byte NAL_START_CODE[] = {
		0, 0, 0, 1
	};

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #27  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #27  <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #27  <Int 0>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #28  <Int 1>
	//   17   22:bastore         
	//   18   23:putstatic       #30  <Field byte[] NAL_START_CODE>
	//   19   26:bipush          13
	//   20   28:newarray        int[]
	//   21   30:dup             
	//   22   31:iconst_0        
	//   23   32:ldc1            #31  <Int 0x17700>
	//   24   34:iastore         
	//   25   35:dup             
	//   26   36:iconst_1        
	//   27   37:ldc1            #32  <Int 0x15888>
	//   28   39:iastore         
	//   29   40:dup             
	//   30   41:iconst_2        
	//   31   42:ldc1            #33  <Int 64000>
	//   32   44:iastore         
	//   33   45:dup             
	//   34   46:iconst_3        
	//   35   47:ldc1            #34  <Int 48000>
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:iconst_4        
	//   39   52:ldc1            #35  <Int 44100>
	//   40   54:iastore         
	//   41   55:dup             
	//   42   56:iconst_5        
	//   43   57:sipush          32000
	//   44   60:iastore         
	//   45   61:dup             
	//   46   62:bipush          6
	//   47   64:sipush          24000
	//   48   67:iastore         
	//   49   68:dup             
	//   50   69:bipush          7
	//   51   71:sipush          22050
	//   52   74:iastore         
	//   53   75:dup             
	//   54   76:bipush          8
	//   55   78:sipush          16000
	//   56   81:iastore         
	//   57   82:dup             
	//   58   83:bipush          9
	//   59   85:sipush          12000
	//   60   88:iastore         
	//   61   89:dup             
	//   62   90:bipush          10
	//   63   92:sipush          11025
	//   64   95:iastore         
	//   65   96:dup             
	//   66   97:bipush          11
	//   67   99:sipush          8000
	//   68  102:iastore         
	//   69  103:dup             
	//   70  104:bipush          12
	//   71  106:sipush          7350
	//   72  109:iastore         
	//   73  110:putstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//   74  113:bipush          16
	//   75  115:newarray        int[]
	//   76  117:dup             
	//   77  118:iconst_0        
	//   78  119:iconst_0        
	//   79  120:iastore         
	//   80  121:dup             
	//   81  122:iconst_1        
	//   82  123:iconst_1        
	//   83  124:iastore         
	//   84  125:dup             
	//   85  126:iconst_2        
	//   86  127:iconst_2        
	//   87  128:iastore         
	//   88  129:dup             
	//   89  130:iconst_3        
	//   90  131:iconst_3        
	//   91  132:iastore         
	//   92  133:dup             
	//   93  134:iconst_4        
	//   94  135:iconst_4        
	//   95  136:iastore         
	//   96  137:dup             
	//   97  138:iconst_5        
	//   98  139:iconst_5        
	//   99  140:iastore         
	//  100  141:dup             
	//  101  142:bipush          6
	//  102  144:bipush          6
	//  103  146:iastore         
	//  104  147:dup             
	//  105  148:bipush          7
	//  106  150:bipush          8
	//  107  152:iastore         
	//  108  153:dup             
	//  109  154:bipush          8
	//  110  156:iconst_m1       
	//  111  157:iastore         
	//  112  158:dup             
	//  113  159:bipush          9
	//  114  161:iconst_m1       
	//  115  162:iastore         
	//  116  163:dup             
	//  117  164:bipush          10
	//  118  166:iconst_m1       
	//  119  167:iastore         
	//  120  168:dup             
	//  121  169:bipush          11
	//  122  171:bipush          7
	//  123  173:iastore         
	//  124  174:dup             
	//  125  175:bipush          12
	//  126  177:bipush          8
	//  127  179:iastore         
	//  128  180:dup             
	//  129  181:bipush          13
	//  130  183:iconst_m1       
	//  131  184:iastore         
	//  132  185:dup             
	//  133  186:bipush          14
	//  134  188:bipush          8
	//  135  190:iastore         
	//  136  191:dup             
	//  137  192:bipush          15
	//  138  194:iconst_m1       
	//  139  195:iastore         
	//  140  196:putstatic       #39  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//* 141  199:return          
	}
}
