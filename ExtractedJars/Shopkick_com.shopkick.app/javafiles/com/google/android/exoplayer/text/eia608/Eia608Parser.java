// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.eia608;

import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer.text.eia608:
//			ClosedCaptionText, ClosedCaptionCtrl, ClosedCaption, ClosedCaptionList

public final class Eia608Parser
{

	Eia608Parser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #43  <Class ParsableBitArray>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void ParsableBitArray()>
	//    6   12:putfield        #46  <Field ParsableBitArray seiBuffer>
	//    7   15:aload_0         
	//    8   16:new             #48  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #49  <Method void StringBuilder()>
	//   11   23:putfield        #51  <Field StringBuilder stringBuilder>
	//   12   26:aload_0         
	//   13   27:new             #53  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #54  <Method void ArrayList()>
	//   16   34:putfield        #56  <Field ArrayList captions>
	//   17   37:return          
	}

	private void addBufferedText()
	{
		if(stringBuilder.length() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field StringBuilder stringBuilder>
	//*   2    4:invokevirtual   #61  <Method int StringBuilder.length()>
	//*   3    7:ifle            40
		{
			captions.add(((Object) (new ClosedCaptionText(stringBuilder.toString()))));
	//    4   10:aload_0         
	//    5   11:getfield        #56  <Field ArrayList captions>
	//    6   14:new             #63  <Class ClosedCaptionText>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field StringBuilder stringBuilder>
	//   10   22:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   11   25:invokespecial   #70  <Method void ClosedCaptionText(String)>
	//   12   28:invokevirtual   #74  <Method boolean ArrayList.add(Object)>
	//   13   31:pop             
			stringBuilder.setLength(0);
	//   14   32:aload_0         
	//   15   33:getfield        #51  <Field StringBuilder stringBuilder>
	//   16   36:iconst_0        
	//   17   37:invokevirtual   #78  <Method void StringBuilder.setLength(int)>
		}
	//   18   40:return          
	}

	private void addCtrl(byte byte0, byte byte1)
	{
		addBufferedText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void addBufferedText()>
		captions.add(((Object) (new ClosedCaptionCtrl(byte0, byte1))));
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ArrayList captions>
	//    4    8:new             #84  <Class ClosedCaptionCtrl>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:iload_2         
	//    8   14:invokespecial   #86  <Method void ClosedCaptionCtrl(byte, byte)>
	//    9   17:invokevirtual   #74  <Method boolean ArrayList.add(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	private void backspace()
	{
		addCtrl((byte)20, (byte)33);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:bipush          33
	//    3    5:invokespecial   #89  <Method void addCtrl(byte, byte)>
	//    4    8:return          
	}

	private static char getChar(byte byte0)
	{
		return (char)BASIC_CHARACTER_SET[(byte0 & 0x7f) - 32];
	//    0    0:getstatic       #31  <Field int[] BASIC_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          127
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:isub            
	//    6   10:iaload          
	//    7   11:int2char        
	//    8   12:ireturn         
	}

	private static char getExtendedEsFrChar(byte byte0)
	{
		return (char)SPECIAL_ES_FR_CHARACTER_SET[byte0 & 0x1f];
	//    0    0:getstatic       #35  <Field int[] SPECIAL_ES_FR_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          31
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:int2char        
	//    6    9:ireturn         
	}

	private static char getExtendedPtDeChar(byte byte0)
	{
		return (char)SPECIAL_PT_DE_CHARACTER_SET[byte0 & 0x1f];
	//    0    0:getstatic       #37  <Field int[] SPECIAL_PT_DE_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          31
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:int2char        
	//    6    9:ireturn         
	}

	private static char getSpecialChar(byte byte0)
	{
		return (char)SPECIAL_CHARACTER_SET[byte0 & 0xf];
	//    0    0:getstatic       #33  <Field int[] SPECIAL_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          15
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:int2char        
	//    6    9:ireturn         
	}

	public static boolean isSeiMessageEia608(int i, int j, ParsableByteArray parsablebytearray)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		if(i == 4)
	//*   2    3:iload_0         
	//*   3    4:iconst_4        
	//*   4    5:icmpne          96
		{
			if(j < 8)
	//*   5    8:iload_1         
	//*   6    9:bipush          8
	//*   7   11:icmpge          16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			i = parsablebytearray.getPosition();
	//   10   16:aload_2         
	//   11   17:invokevirtual   #101 <Method int ParsableByteArray.getPosition()>
	//   12   20:istore_0        
			j = parsablebytearray.readUnsignedByte();
	//   13   21:aload_2         
	//   14   22:invokevirtual   #104 <Method int ParsableByteArray.readUnsignedByte()>
	//   15   25:istore_1        
			int k = parsablebytearray.readUnsignedShort();
	//   16   26:aload_2         
	//   17   27:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedShort()>
	//   18   30:istore_3        
			int l = parsablebytearray.readInt();
	//   19   31:aload_2         
	//   20   32:invokevirtual   #110 <Method int ParsableByteArray.readInt()>
	//   21   35:istore          4
			int i1 = parsablebytearray.readUnsignedByte();
	//   22   37:aload_2         
	//   23   38:invokevirtual   #104 <Method int ParsableByteArray.readUnsignedByte()>
	//   24   41:istore          5
			parsablebytearray.setPosition(i);
	//   25   43:aload_2         
	//   26   44:iload_0         
	//   27   45:invokevirtual   #113 <Method void ParsableByteArray.setPosition(int)>
			boolean flag = flag1;
	//   28   48:iload           7
	//   29   50:istore          6
			if(j == 181)
	//*  30   52:iload_1         
	//*  31   53:sipush          181
	//*  32   56:icmpne          93
			{
				flag = flag1;
	//   33   59:iload           7
	//   34   61:istore          6
				if(k == 49)
	//*  35   63:iload_3         
	//*  36   64:bipush          49
	//*  37   66:icmpne          93
				{
					flag = flag1;
	//   38   69:iload           7
	//   39   71:istore          6
					if(l == 0x47413934)
	//*  40   73:iload           4
	//*  41   75:ldc1            #20  <Int 0x47413934>
	//*  42   77:icmpne          93
					{
						flag = flag1;
	//   43   80:iload           7
	//   44   82:istore          6
						if(i1 == 3)
	//*  45   84:iload           5
	//*  46   86:iconst_3        
	//*  47   87:icmpne          93
							flag = true;
	//   48   90:iconst_1        
	//   49   91:istore          6
					}
				}
			}
			return flag;
	//   50   93:iload           6
	//   51   95:ireturn         
		} else
		{
			return false;
	//   52   96:iconst_0        
	//   53   97:ireturn         
		}
	}

	boolean canParse(String s)
	{
		return s.equals("application/eia-608");
	//    0    0:aload_1         
	//    1    1:ldc1            #117 <String "application/eia-608">
	//    2    3:invokevirtual   #122 <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	ClosedCaptionList parse(SampleHolder sampleholder)
	{
		if(sampleholder.size < 10)
	//*   0    0:aload_1         
	//*   1    1:getfield        #129 <Field int SampleHolder.size>
	//*   2    4:bipush          10
	//*   3    6:icmpge          11
			return null;
	//    4    9:aconst_null     
	//    5   10:areturn         
		captions.clear();
	//    6   11:aload_0         
	//    7   12:getfield        #56  <Field ArrayList captions>
	//    8   15:invokevirtual   #132 <Method void ArrayList.clear()>
		StringBuilder stringbuilder = stringBuilder;
	//    9   18:aload_0         
	//   10   19:getfield        #51  <Field StringBuilder stringBuilder>
	//   11   22:astore          6
		int i = 0;
	//   12   24:iconst_0        
	//   13   25:istore          4
		stringbuilder.setLength(0);
	//   14   27:aload           6
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #78  <Method void StringBuilder.setLength(int)>
		seiBuffer.reset(sampleholder.data.array());
	//   17   33:aload_0         
	//   18   34:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   19   37:aload_1         
	//   20   38:getfield        #136 <Field ByteBuffer SampleHolder.data>
	//   21   41:invokevirtual   #142 <Method byte[] ByteBuffer.array()>
	//   22   44:invokevirtual   #146 <Method void ParsableBitArray.reset(byte[])>
		seiBuffer.skipBits(67);
	//   23   47:aload_0         
	//   24   48:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   25   51:bipush          67
	//   26   53:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
		int j = seiBuffer.readBits(5);
	//   27   56:aload_0         
	//   28   57:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   29   60:iconst_5        
	//   30   61:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   31   64:istore          5
		seiBuffer.skipBits(8);
	//   32   66:aload_0         
	//   33   67:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   34   70:bipush          8
	//   35   72:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
		for(; i < j; i++)
	//*  36   75:iload           4
	//*  37   77:iload           5
	//*  38   79:icmpge          354
		{
			seiBuffer.skipBits(5);
	//   39   82:aload_0         
	//   40   83:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   41   86:iconst_5        
	//   42   87:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
			if(!seiBuffer.readBit())
	//*  43   90:aload_0         
	//*  44   91:getfield        #46  <Field ParsableBitArray seiBuffer>
	//*  45   94:invokevirtual   #157 <Method boolean ParsableBitArray.readBit()>
	//*  46   97:ifne            112
			{
				seiBuffer.skipBits(18);
	//   47  100:aload_0         
	//   48  101:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   49  104:bipush          18
	//   50  106:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
				continue;
	//   51  109:goto            345
			}
			if(seiBuffer.readBits(2) != 0)
	//*  52  112:aload_0         
	//*  53  113:getfield        #46  <Field ParsableBitArray seiBuffer>
	//*  54  116:iconst_2        
	//*  55  117:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//*  56  120:ifeq            135
			{
				seiBuffer.skipBits(16);
	//   57  123:aload_0         
	//   58  124:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   59  127:bipush          16
	//   60  129:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
				continue;
	//   61  132:goto            345
			}
			seiBuffer.skipBits(1);
	//   62  135:aload_0         
	//   63  136:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   64  139:iconst_1        
	//   65  140:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
			byte byte0 = (byte)seiBuffer.readBits(7);
	//   66  143:aload_0         
	//   67  144:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   68  147:bipush          7
	//   69  149:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   70  152:int2byte        
	//   71  153:istore_2        
			seiBuffer.skipBits(1);
	//   72  154:aload_0         
	//   73  155:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   74  158:iconst_1        
	//   75  159:invokevirtual   #149 <Method void ParsableBitArray.skipBits(int)>
			byte byte1 = (byte)seiBuffer.readBits(7);
	//   76  162:aload_0         
	//   77  163:getfield        #46  <Field ParsableBitArray seiBuffer>
	//   78  166:bipush          7
	//   79  168:invokevirtual   #153 <Method int ParsableBitArray.readBits(int)>
	//   80  171:int2byte        
	//   81  172:istore_3        
			if(byte0 == 0 && byte1 == 0)
	//*  82  173:iload_2         
	//*  83  174:ifne            184
	//*  84  177:iload_3         
	//*  85  178:ifne            184
				continue;
	//   86  181:goto            345
			if((byte0 == 17 || byte0 == 25) && (byte1 & 0x70) == 48)
	//*  87  184:iload_2         
	//*  88  185:bipush          17
	//*  89  187:icmpeq          196
	//*  90  190:iload_2         
	//*  91  191:bipush          25
	//*  92  193:icmpne          220
	//*  93  196:iload_3         
	//*  94  197:bipush          112
	//*  95  199:iand            
	//*  96  200:bipush          48
	//*  97  202:icmpne          220
			{
				stringBuilder.append(getSpecialChar(byte1));
	//   98  205:aload_0         
	//   99  206:getfield        #51  <Field StringBuilder stringBuilder>
	//  100  209:iload_3         
	//  101  210:invokestatic    #159 <Method char getSpecialChar(byte)>
	//  102  213:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
	//  103  216:pop             
				continue;
	//  104  217:goto            345
			}
			if((byte0 == 18 || byte0 == 26) && (byte1 & 0x60) == 32)
	//* 105  220:iload_2         
	//* 106  221:bipush          18
	//* 107  223:icmpeq          232
	//* 108  226:iload_2         
	//* 109  227:bipush          26
	//* 110  229:icmpne          260
	//* 111  232:iload_3         
	//* 112  233:bipush          96
	//* 113  235:iand            
	//* 114  236:bipush          32
	//* 115  238:icmpne          260
			{
				backspace();
	//  116  241:aload_0         
	//  117  242:invokespecial   #165 <Method void backspace()>
				stringBuilder.append(getExtendedEsFrChar(byte1));
	//  118  245:aload_0         
	//  119  246:getfield        #51  <Field StringBuilder stringBuilder>
	//  120  249:iload_3         
	//  121  250:invokestatic    #167 <Method char getExtendedEsFrChar(byte)>
	//  122  253:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
	//  123  256:pop             
				continue;
	//  124  257:goto            345
			}
			if((byte0 == 19 || byte0 == 27) && (byte1 & 0x60) == 32)
	//* 125  260:iload_2         
	//* 126  261:bipush          19
	//* 127  263:icmpeq          272
	//* 128  266:iload_2         
	//* 129  267:bipush          27
	//* 130  269:icmpne          300
	//* 131  272:iload_3         
	//* 132  273:bipush          96
	//* 133  275:iand            
	//* 134  276:bipush          32
	//* 135  278:icmpne          300
			{
				backspace();
	//  136  281:aload_0         
	//  137  282:invokespecial   #165 <Method void backspace()>
				stringBuilder.append(getExtendedPtDeChar(byte1));
	//  138  285:aload_0         
	//  139  286:getfield        #51  <Field StringBuilder stringBuilder>
	//  140  289:iload_3         
	//  141  290:invokestatic    #169 <Method char getExtendedPtDeChar(byte)>
	//  142  293:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
	//  143  296:pop             
				continue;
	//  144  297:goto            345
			}
			if(byte0 < 32)
	//* 145  300:iload_2         
	//* 146  301:bipush          32
	//* 147  303:icmpge          315
			{
				addCtrl(byte0, byte1);
	//  148  306:aload_0         
	//  149  307:iload_2         
	//  150  308:iload_3         
	//  151  309:invokespecial   #89  <Method void addCtrl(byte, byte)>
				continue;
	//  152  312:goto            345
			}
			stringBuilder.append(getChar(byte0));
	//  153  315:aload_0         
	//  154  316:getfield        #51  <Field StringBuilder stringBuilder>
	//  155  319:iload_2         
	//  156  320:invokestatic    #171 <Method char getChar(byte)>
	//  157  323:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
	//  158  326:pop             
			if(byte1 >= 32)
	//* 159  327:iload_3         
	//* 160  328:bipush          32
	//* 161  330:icmplt          345
				stringBuilder.append(getChar(byte1));
	//  162  333:aload_0         
	//  163  334:getfield        #51  <Field StringBuilder stringBuilder>
	//  164  337:iload_3         
	//  165  338:invokestatic    #171 <Method char getChar(byte)>
	//  166  341:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
	//  167  344:pop             
		}

	//  168  345:iload           4
	//  169  347:iconst_1        
	//  170  348:iadd            
	//  171  349:istore          4
	//* 172  351:goto            75
		addBufferedText();
	//  173  354:aload_0         
	//  174  355:invokespecial   #82  <Method void addBufferedText()>
		if(captions.isEmpty())
	//* 175  358:aload_0         
	//* 176  359:getfield        #56  <Field ArrayList captions>
	//* 177  362:invokevirtual   #174 <Method boolean ArrayList.isEmpty()>
	//* 178  365:ifeq            370
		{
			return null;
	//  179  368:aconst_null     
	//  180  369:areturn         
		} else
		{
			ClosedCaption aclosedcaption[] = new ClosedCaption[captions.size()];
	//  181  370:aload_0         
	//  182  371:getfield        #56  <Field ArrayList captions>
	//  183  374:invokevirtual   #176 <Method int ArrayList.size()>
	//  184  377:anewarray       ClosedCaption[]
	//  185  380:astore          6
			captions.toArray(((Object []) (aclosedcaption)));
	//  186  382:aload_0         
	//  187  383:getfield        #56  <Field ArrayList captions>
	//  188  386:aload           6
	//  189  388:invokevirtual   #182 <Method Object[] ArrayList.toArray(Object[])>
	//  190  391:pop             
			return new ClosedCaptionList(sampleholder.timeUs, sampleholder.isDecodeOnly(), aclosedcaption);
	//  191  392:new             #184 <Class ClosedCaptionList>
	//  192  395:dup             
	//  193  396:aload_1         
	//  194  397:getfield        #188 <Field long SampleHolder.timeUs>
	//  195  400:aload_1         
	//  196  401:invokevirtual   #191 <Method boolean SampleHolder.isDecodeOnly()>
	//  197  404:aload           6
	//  198  406:invokespecial   #194 <Method void ClosedCaptionList(long, boolean, ClosedCaption[])>
	//  199  409:areturn         
		}
	}

	private static final int BASIC_CHARACTER_SET[] = {
		32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 
		225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 
		52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 
		62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 
		72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 
		82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 
		233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 
		102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 
		112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 
		122, 231, 247, 209, 241, 9632
	};
	private static final int COUNTRY_CODE = 181;
	private static final int PAYLOAD_TYPE_CC = 4;
	private static final int PROVIDER_CODE = 49;
	private static final int SPECIAL_CHARACTER_SET[] = {
		174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 
		232, 226, 234, 238, 244, 251
	};
	private static final int SPECIAL_ES_FR_CHARACTER_SET[] = {
		193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 
		8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 
		202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 
		171, 187
	};
	private static final int SPECIAL_PT_DE_CHARACTER_SET[] = {
		195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 
		125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 
		223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 
		9492, 9496
	};
	private static final int USER_DATA_TYPE_CODE = 3;
	private static final int USER_ID = 0x47413934;
	private final ArrayList captions = new ArrayList();
	private final ParsableBitArray seiBuffer = new ParsableBitArray();
	private final StringBuilder stringBuilder = new StringBuilder();

	static 
	{
	//    0    0:bipush          96
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:bipush          32
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:bipush          33
	//    9   13:iastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:bipush          34
	//   13   18:iastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:bipush          35
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:bipush          36
	//   21   28:iastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:bipush          37
	//   25   33:iastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:bipush          38
	//   29   39:iastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:bipush          39
	//   33   45:iastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:bipush          40
	//   37   51:iastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:bipush          41
	//   41   57:iastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:sipush          225
	//   45   64:iastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:bipush          43
	//   49   70:iastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:bipush          44
	//   53   76:iastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:bipush          45
	//   57   82:iastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:bipush          46
	//   61   88:iastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:bipush          47
	//   65   94:iastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:bipush          48
	//   69  100:iastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:bipush          49
	//   73  106:iastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:bipush          50
	//   77  112:iastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:bipush          51
	//   81  118:iastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:bipush          52
	//   85  124:iastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:bipush          53
	//   89  130:iastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:bipush          54
	//   93  136:iastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:bipush          55
	//   97  142:iastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:bipush          56
	//  101  148:iastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:bipush          57
	//  105  154:iastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:bipush          58
	//  109  160:iastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:bipush          59
	//  113  166:iastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:bipush          60
	//  117  172:iastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:bipush          61
	//  121  178:iastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:bipush          62
	//  125  184:iastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:bipush          63
	//  129  190:iastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:bipush          64
	//  133  196:iastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:bipush          65
	//  137  202:iastore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:bipush          66
	//  141  208:iastore         
	//  142  209:dup             
	//  143  210:bipush          35
	//  144  212:bipush          67
	//  145  214:iastore         
	//  146  215:dup             
	//  147  216:bipush          36
	//  148  218:bipush          68
	//  149  220:iastore         
	//  150  221:dup             
	//  151  222:bipush          37
	//  152  224:bipush          69
	//  153  226:iastore         
	//  154  227:dup             
	//  155  228:bipush          38
	//  156  230:bipush          70
	//  157  232:iastore         
	//  158  233:dup             
	//  159  234:bipush          39
	//  160  236:bipush          71
	//  161  238:iastore         
	//  162  239:dup             
	//  163  240:bipush          40
	//  164  242:bipush          72
	//  165  244:iastore         
	//  166  245:dup             
	//  167  246:bipush          41
	//  168  248:bipush          73
	//  169  250:iastore         
	//  170  251:dup             
	//  171  252:bipush          42
	//  172  254:bipush          74
	//  173  256:iastore         
	//  174  257:dup             
	//  175  258:bipush          43
	//  176  260:bipush          75
	//  177  262:iastore         
	//  178  263:dup             
	//  179  264:bipush          44
	//  180  266:bipush          76
	//  181  268:iastore         
	//  182  269:dup             
	//  183  270:bipush          45
	//  184  272:bipush          77
	//  185  274:iastore         
	//  186  275:dup             
	//  187  276:bipush          46
	//  188  278:bipush          78
	//  189  280:iastore         
	//  190  281:dup             
	//  191  282:bipush          47
	//  192  284:bipush          79
	//  193  286:iastore         
	//  194  287:dup             
	//  195  288:bipush          48
	//  196  290:bipush          80
	//  197  292:iastore         
	//  198  293:dup             
	//  199  294:bipush          49
	//  200  296:bipush          81
	//  201  298:iastore         
	//  202  299:dup             
	//  203  300:bipush          50
	//  204  302:bipush          82
	//  205  304:iastore         
	//  206  305:dup             
	//  207  306:bipush          51
	//  208  308:bipush          83
	//  209  310:iastore         
	//  210  311:dup             
	//  211  312:bipush          52
	//  212  314:bipush          84
	//  213  316:iastore         
	//  214  317:dup             
	//  215  318:bipush          53
	//  216  320:bipush          85
	//  217  322:iastore         
	//  218  323:dup             
	//  219  324:bipush          54
	//  220  326:bipush          86
	//  221  328:iastore         
	//  222  329:dup             
	//  223  330:bipush          55
	//  224  332:bipush          87
	//  225  334:iastore         
	//  226  335:dup             
	//  227  336:bipush          56
	//  228  338:bipush          88
	//  229  340:iastore         
	//  230  341:dup             
	//  231  342:bipush          57
	//  232  344:bipush          89
	//  233  346:iastore         
	//  234  347:dup             
	//  235  348:bipush          58
	//  236  350:bipush          90
	//  237  352:iastore         
	//  238  353:dup             
	//  239  354:bipush          59
	//  240  356:bipush          91
	//  241  358:iastore         
	//  242  359:dup             
	//  243  360:bipush          60
	//  244  362:sipush          233
	//  245  365:iastore         
	//  246  366:dup             
	//  247  367:bipush          61
	//  248  369:bipush          93
	//  249  371:iastore         
	//  250  372:dup             
	//  251  373:bipush          62
	//  252  375:sipush          237
	//  253  378:iastore         
	//  254  379:dup             
	//  255  380:bipush          63
	//  256  382:sipush          243
	//  257  385:iastore         
	//  258  386:dup             
	//  259  387:bipush          64
	//  260  389:sipush          250
	//  261  392:iastore         
	//  262  393:dup             
	//  263  394:bipush          65
	//  264  396:bipush          97
	//  265  398:iastore         
	//  266  399:dup             
	//  267  400:bipush          66
	//  268  402:bipush          98
	//  269  404:iastore         
	//  270  405:dup             
	//  271  406:bipush          67
	//  272  408:bipush          99
	//  273  410:iastore         
	//  274  411:dup             
	//  275  412:bipush          68
	//  276  414:bipush          100
	//  277  416:iastore         
	//  278  417:dup             
	//  279  418:bipush          69
	//  280  420:bipush          101
	//  281  422:iastore         
	//  282  423:dup             
	//  283  424:bipush          70
	//  284  426:bipush          102
	//  285  428:iastore         
	//  286  429:dup             
	//  287  430:bipush          71
	//  288  432:bipush          103
	//  289  434:iastore         
	//  290  435:dup             
	//  291  436:bipush          72
	//  292  438:bipush          104
	//  293  440:iastore         
	//  294  441:dup             
	//  295  442:bipush          73
	//  296  444:bipush          105
	//  297  446:iastore         
	//  298  447:dup             
	//  299  448:bipush          74
	//  300  450:bipush          106
	//  301  452:iastore         
	//  302  453:dup             
	//  303  454:bipush          75
	//  304  456:bipush          107
	//  305  458:iastore         
	//  306  459:dup             
	//  307  460:bipush          76
	//  308  462:bipush          108
	//  309  464:iastore         
	//  310  465:dup             
	//  311  466:bipush          77
	//  312  468:bipush          109
	//  313  470:iastore         
	//  314  471:dup             
	//  315  472:bipush          78
	//  316  474:bipush          110
	//  317  476:iastore         
	//  318  477:dup             
	//  319  478:bipush          79
	//  320  480:bipush          111
	//  321  482:iastore         
	//  322  483:dup             
	//  323  484:bipush          80
	//  324  486:bipush          112
	//  325  488:iastore         
	//  326  489:dup             
	//  327  490:bipush          81
	//  328  492:bipush          113
	//  329  494:iastore         
	//  330  495:dup             
	//  331  496:bipush          82
	//  332  498:bipush          114
	//  333  500:iastore         
	//  334  501:dup             
	//  335  502:bipush          83
	//  336  504:bipush          115
	//  337  506:iastore         
	//  338  507:dup             
	//  339  508:bipush          84
	//  340  510:bipush          116
	//  341  512:iastore         
	//  342  513:dup             
	//  343  514:bipush          85
	//  344  516:bipush          117
	//  345  518:iastore         
	//  346  519:dup             
	//  347  520:bipush          86
	//  348  522:bipush          118
	//  349  524:iastore         
	//  350  525:dup             
	//  351  526:bipush          87
	//  352  528:bipush          119
	//  353  530:iastore         
	//  354  531:dup             
	//  355  532:bipush          88
	//  356  534:bipush          120
	//  357  536:iastore         
	//  358  537:dup             
	//  359  538:bipush          89
	//  360  540:bipush          121
	//  361  542:iastore         
	//  362  543:dup             
	//  363  544:bipush          90
	//  364  546:bipush          122
	//  365  548:iastore         
	//  366  549:dup             
	//  367  550:bipush          91
	//  368  552:sipush          231
	//  369  555:iastore         
	//  370  556:dup             
	//  371  557:bipush          92
	//  372  559:sipush          247
	//  373  562:iastore         
	//  374  563:dup             
	//  375  564:bipush          93
	//  376  566:sipush          209
	//  377  569:iastore         
	//  378  570:dup             
	//  379  571:bipush          94
	//  380  573:sipush          241
	//  381  576:iastore         
	//  382  577:dup             
	//  383  578:bipush          95
	//  384  580:sipush          9632
	//  385  583:iastore         
	//  386  584:putstatic       #31  <Field int[] BASIC_CHARACTER_SET>
	//  387  587:bipush          16
	//  388  589:newarray        int[]
	//  389  591:dup             
	//  390  592:iconst_0        
	//  391  593:sipush          174
	//  392  596:iastore         
	//  393  597:dup             
	//  394  598:iconst_1        
	//  395  599:sipush          176
	//  396  602:iastore         
	//  397  603:dup             
	//  398  604:iconst_2        
	//  399  605:sipush          189
	//  400  608:iastore         
	//  401  609:dup             
	//  402  610:iconst_3        
	//  403  611:sipush          191
	//  404  614:iastore         
	//  405  615:dup             
	//  406  616:iconst_4        
	//  407  617:sipush          8482
	//  408  620:iastore         
	//  409  621:dup             
	//  410  622:iconst_5        
	//  411  623:sipush          162
	//  412  626:iastore         
	//  413  627:dup             
	//  414  628:bipush          6
	//  415  630:sipush          163
	//  416  633:iastore         
	//  417  634:dup             
	//  418  635:bipush          7
	//  419  637:sipush          9834
	//  420  640:iastore         
	//  421  641:dup             
	//  422  642:bipush          8
	//  423  644:sipush          224
	//  424  647:iastore         
	//  425  648:dup             
	//  426  649:bipush          9
	//  427  651:bipush          32
	//  428  653:iastore         
	//  429  654:dup             
	//  430  655:bipush          10
	//  431  657:sipush          232
	//  432  660:iastore         
	//  433  661:dup             
	//  434  662:bipush          11
	//  435  664:sipush          226
	//  436  667:iastore         
	//  437  668:dup             
	//  438  669:bipush          12
	//  439  671:sipush          234
	//  440  674:iastore         
	//  441  675:dup             
	//  442  676:bipush          13
	//  443  678:sipush          238
	//  444  681:iastore         
	//  445  682:dup             
	//  446  683:bipush          14
	//  447  685:sipush          244
	//  448  688:iastore         
	//  449  689:dup             
	//  450  690:bipush          15
	//  451  692:sipush          251
	//  452  695:iastore         
	//  453  696:putstatic       #33  <Field int[] SPECIAL_CHARACTER_SET>
	//  454  699:bipush          32
	//  455  701:newarray        int[]
	//  456  703:dup             
	//  457  704:iconst_0        
	//  458  705:sipush          193
	//  459  708:iastore         
	//  460  709:dup             
	//  461  710:iconst_1        
	//  462  711:sipush          201
	//  463  714:iastore         
	//  464  715:dup             
	//  465  716:iconst_2        
	//  466  717:sipush          211
	//  467  720:iastore         
	//  468  721:dup             
	//  469  722:iconst_3        
	//  470  723:sipush          218
	//  471  726:iastore         
	//  472  727:dup             
	//  473  728:iconst_4        
	//  474  729:sipush          220
	//  475  732:iastore         
	//  476  733:dup             
	//  477  734:iconst_5        
	//  478  735:sipush          252
	//  479  738:iastore         
	//  480  739:dup             
	//  481  740:bipush          6
	//  482  742:sipush          8216
	//  483  745:iastore         
	//  484  746:dup             
	//  485  747:bipush          7
	//  486  749:sipush          161
	//  487  752:iastore         
	//  488  753:dup             
	//  489  754:bipush          8
	//  490  756:bipush          42
	//  491  758:iastore         
	//  492  759:dup             
	//  493  760:bipush          9
	//  494  762:bipush          39
	//  495  764:iastore         
	//  496  765:dup             
	//  497  766:bipush          10
	//  498  768:sipush          8212
	//  499  771:iastore         
	//  500  772:dup             
	//  501  773:bipush          11
	//  502  775:sipush          169
	//  503  778:iastore         
	//  504  779:dup             
	//  505  780:bipush          12
	//  506  782:sipush          8480
	//  507  785:iastore         
	//  508  786:dup             
	//  509  787:bipush          13
	//  510  789:sipush          8226
	//  511  792:iastore         
	//  512  793:dup             
	//  513  794:bipush          14
	//  514  796:sipush          8220
	//  515  799:iastore         
	//  516  800:dup             
	//  517  801:bipush          15
	//  518  803:sipush          8221
	//  519  806:iastore         
	//  520  807:dup             
	//  521  808:bipush          16
	//  522  810:sipush          192
	//  523  813:iastore         
	//  524  814:dup             
	//  525  815:bipush          17
	//  526  817:sipush          194
	//  527  820:iastore         
	//  528  821:dup             
	//  529  822:bipush          18
	//  530  824:sipush          199
	//  531  827:iastore         
	//  532  828:dup             
	//  533  829:bipush          19
	//  534  831:sipush          200
	//  535  834:iastore         
	//  536  835:dup             
	//  537  836:bipush          20
	//  538  838:sipush          202
	//  539  841:iastore         
	//  540  842:dup             
	//  541  843:bipush          21
	//  542  845:sipush          203
	//  543  848:iastore         
	//  544  849:dup             
	//  545  850:bipush          22
	//  546  852:sipush          235
	//  547  855:iastore         
	//  548  856:dup             
	//  549  857:bipush          23
	//  550  859:sipush          206
	//  551  862:iastore         
	//  552  863:dup             
	//  553  864:bipush          24
	//  554  866:sipush          207
	//  555  869:iastore         
	//  556  870:dup             
	//  557  871:bipush          25
	//  558  873:sipush          239
	//  559  876:iastore         
	//  560  877:dup             
	//  561  878:bipush          26
	//  562  880:sipush          212
	//  563  883:iastore         
	//  564  884:dup             
	//  565  885:bipush          27
	//  566  887:sipush          217
	//  567  890:iastore         
	//  568  891:dup             
	//  569  892:bipush          28
	//  570  894:sipush          249
	//  571  897:iastore         
	//  572  898:dup             
	//  573  899:bipush          29
	//  574  901:sipush          219
	//  575  904:iastore         
	//  576  905:dup             
	//  577  906:bipush          30
	//  578  908:sipush          171
	//  579  911:iastore         
	//  580  912:dup             
	//  581  913:bipush          31
	//  582  915:sipush          187
	//  583  918:iastore         
	//  584  919:putstatic       #35  <Field int[] SPECIAL_ES_FR_CHARACTER_SET>
	//  585  922:bipush          32
	//  586  924:newarray        int[]
	//  587  926:dup             
	//  588  927:iconst_0        
	//  589  928:sipush          195
	//  590  931:iastore         
	//  591  932:dup             
	//  592  933:iconst_1        
	//  593  934:sipush          227
	//  594  937:iastore         
	//  595  938:dup             
	//  596  939:iconst_2        
	//  597  940:sipush          205
	//  598  943:iastore         
	//  599  944:dup             
	//  600  945:iconst_3        
	//  601  946:sipush          204
	//  602  949:iastore         
	//  603  950:dup             
	//  604  951:iconst_4        
	//  605  952:sipush          236
	//  606  955:iastore         
	//  607  956:dup             
	//  608  957:iconst_5        
	//  609  958:sipush          210
	//  610  961:iastore         
	//  611  962:dup             
	//  612  963:bipush          6
	//  613  965:sipush          242
	//  614  968:iastore         
	//  615  969:dup             
	//  616  970:bipush          7
	//  617  972:sipush          213
	//  618  975:iastore         
	//  619  976:dup             
	//  620  977:bipush          8
	//  621  979:sipush          245
	//  622  982:iastore         
	//  623  983:dup             
	//  624  984:bipush          9
	//  625  986:bipush          123
	//  626  988:iastore         
	//  627  989:dup             
	//  628  990:bipush          10
	//  629  992:bipush          125
	//  630  994:iastore         
	//  631  995:dup             
	//  632  996:bipush          11
	//  633  998:bipush          92
	//  634 1000:iastore         
	//  635 1001:dup             
	//  636 1002:bipush          12
	//  637 1004:bipush          94
	//  638 1006:iastore         
	//  639 1007:dup             
	//  640 1008:bipush          13
	//  641 1010:bipush          95
	//  642 1012:iastore         
	//  643 1013:dup             
	//  644 1014:bipush          14
	//  645 1016:bipush          124
	//  646 1018:iastore         
	//  647 1019:dup             
	//  648 1020:bipush          15
	//  649 1022:bipush          126
	//  650 1024:iastore         
	//  651 1025:dup             
	//  652 1026:bipush          16
	//  653 1028:sipush          196
	//  654 1031:iastore         
	//  655 1032:dup             
	//  656 1033:bipush          17
	//  657 1035:sipush          228
	//  658 1038:iastore         
	//  659 1039:dup             
	//  660 1040:bipush          18
	//  661 1042:sipush          214
	//  662 1045:iastore         
	//  663 1046:dup             
	//  664 1047:bipush          19
	//  665 1049:sipush          246
	//  666 1052:iastore         
	//  667 1053:dup             
	//  668 1054:bipush          20
	//  669 1056:sipush          223
	//  670 1059:iastore         
	//  671 1060:dup             
	//  672 1061:bipush          21
	//  673 1063:sipush          165
	//  674 1066:iastore         
	//  675 1067:dup             
	//  676 1068:bipush          22
	//  677 1070:sipush          164
	//  678 1073:iastore         
	//  679 1074:dup             
	//  680 1075:bipush          23
	//  681 1077:sipush          9474
	//  682 1080:iastore         
	//  683 1081:dup             
	//  684 1082:bipush          24
	//  685 1084:sipush          197
	//  686 1087:iastore         
	//  687 1088:dup             
	//  688 1089:bipush          25
	//  689 1091:sipush          229
	//  690 1094:iastore         
	//  691 1095:dup             
	//  692 1096:bipush          26
	//  693 1098:sipush          216
	//  694 1101:iastore         
	//  695 1102:dup             
	//  696 1103:bipush          27
	//  697 1105:sipush          248
	//  698 1108:iastore         
	//  699 1109:dup             
	//  700 1110:bipush          28
	//  701 1112:sipush          9484
	//  702 1115:iastore         
	//  703 1116:dup             
	//  704 1117:bipush          29
	//  705 1119:sipush          9488
	//  706 1122:iastore         
	//  707 1123:dup             
	//  708 1124:bipush          30
	//  709 1126:sipush          9492
	//  710 1129:iastore         
	//  711 1130:dup             
	//  712 1131:bipush          31
	//  713 1133:sipush          9496
	//  714 1136:iastore         
	//  715 1137:putstatic       #37  <Field int[] SPECIAL_PT_DE_CHARACTER_SET>
	//* 716 1140:return          
	}
}
