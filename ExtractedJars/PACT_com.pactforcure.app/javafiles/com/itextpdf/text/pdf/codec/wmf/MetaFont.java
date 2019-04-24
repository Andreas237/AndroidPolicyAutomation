// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.itextpdf.text.pdf.codec.wmf:
//			MetaObject, MetaState, InputMeta

public class MetaFont extends MetaObject
{

	public MetaFont()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void MetaObject()>
		faceName = "arial";
	//    2    4:aload_0         
	//    3    5:ldc1            #90  <String "arial">
	//    4    7:putfield        #92  <Field String faceName>
		font = null;
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:putfield        #94  <Field BaseFont font>
		type = 3;
	//    8   15:aload_0         
	//    9   16:iconst_3        
	//   10   17:putfield        #97  <Field int type>
	//   11   20:return          
	}

	public float getAngle()
	{
		return angle;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field float angle>
	//    2    4:freturn         
	}

	public BaseFont getFont()
	{
		String s;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(font != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #94  <Field BaseFont font>
	//*   4    6:ifnull          14
			return font;
	//    5    9:aload_0         
	//    6   10:getfield        #94  <Field BaseFont font>
	//    7   13:areturn         
		s = faceName;
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field String faceName>
	//   10   18:astore_3        
		byte byte0;
		if(italic != 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #107 <Field int italic>
	//*  13   23:ifeq            68
			byte0 = 2;
	//   14   26:iconst_2        
	//   15   27:istore_1        
		else
	//*  16   28:aload_0         
	//*  17   29:getfield        #109 <Field int bold>
	//*  18   32:ifeq            37
	//*  19   35:iconst_1        
	//*  20   36:istore_2        
	//*  21   37:aload_0         
	//*  22   38:aload_3         
	//*  23   39:ldc1            #111 <String "Cp1252">
	//*  24   41:iconst_1        
	//*  25   42:ldc1            #112 <Float 10F>
	//*  26   44:iload_1         
	//*  27   45:iload_2         
	//*  28   46:ior             
	//*  29   47:invokestatic    #117 <Method Font FontFactory.getFont(String, String, boolean, float, int)>
	//*  30   50:invokevirtual   #122 <Method BaseFont Font.getBaseFont()>
	//*  31   53:putfield        #94  <Field BaseFont font>
	//*  32   56:aload_0         
	//*  33   57:getfield        #94  <Field BaseFont font>
	//*  34   60:ifnull          73
	//*  35   63:aload_0         
	//*  36   64:getfield        #94  <Field BaseFont font>
	//*  37   67:areturn         
			byte0 = 0;
	//   38   68:iconst_0        
	//   39   69:istore_1        
		if(bold != 0)
			flag = true;
		font = FontFactory.getFont(s, "Cp1252", true, 10F, byte0 | flag).getBaseFont();
		if(font != null)
			return font;
	//*  40   70:goto            28
		if(faceName.indexOf("courier") != -1 || faceName.indexOf("terminal") != -1 || faceName.indexOf("fixedsys") != -1)
	//*  41   73:aload_0         
	//*  42   74:getfield        #92  <Field String faceName>
	//*  43   77:ldc1            #124 <String "courier">
	//*  44   79:invokevirtual   #128 <Method int String.indexOf(String)>
	//*  45   82:iconst_m1       
	//*  46   83:icmpne          112
	//*  47   86:aload_0         
	//*  48   87:getfield        #92  <Field String faceName>
	//*  49   90:ldc1            #130 <String "terminal">
	//*  50   92:invokevirtual   #128 <Method int String.indexOf(String)>
	//*  51   95:iconst_m1       
	//*  52   96:icmpne          112
	//*  53   99:aload_0         
	//*  54  100:getfield        #92  <Field String faceName>
	//*  55  103:ldc1            #132 <String "fixedsys">
	//*  56  105:invokevirtual   #128 <Method int String.indexOf(String)>
	//*  57  108:iconst_m1       
	//*  58  109:icmpeq          144
			s = fontNames[italic + 0 + bold];
	//   59  112:getstatic       #84  <Field String[] fontNames>
	//   60  115:aload_0         
	//   61  116:getfield        #107 <Field int italic>
	//   62  119:iconst_0        
	//   63  120:iadd            
	//   64  121:aload_0         
	//   65  122:getfield        #109 <Field int bold>
	//   66  125:iadd            
	//   67  126:aaload          
	//   68  127:astore_3        
		else
	//*  69  128:aload_0         
	//*  70  129:aload_3         
	//*  71  130:ldc1            #111 <String "Cp1252">
	//*  72  132:iconst_0        
	//*  73  133:invokestatic    #138 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//*  74  136:putfield        #94  <Field BaseFont font>
	//*  75  139:aload_0         
	//*  76  140:getfield        #94  <Field BaseFont font>
	//*  77  143:areturn         
		if(faceName.indexOf("ms sans serif") != -1 || faceName.indexOf("arial") != -1 || faceName.indexOf("system") != -1)
	//*  78  144:aload_0         
	//*  79  145:getfield        #92  <Field String faceName>
	//*  80  148:ldc1            #140 <String "ms sans serif">
	//*  81  150:invokevirtual   #128 <Method int String.indexOf(String)>
	//*  82  153:iconst_m1       
	//*  83  154:icmpne          183
	//*  84  157:aload_0         
	//*  85  158:getfield        #92  <Field String faceName>
	//*  86  161:ldc1            #90  <String "arial">
	//*  87  163:invokevirtual   #128 <Method int String.indexOf(String)>
	//*  88  166:iconst_m1       
	//*  89  167:icmpne          183
	//*  90  170:aload_0         
	//*  91  171:getfield        #92  <Field String faceName>
	//*  92  174:ldc1            #142 <String "system">
	//*  93  176:invokevirtual   #128 <Method int String.indexOf(String)>
	//*  94  179:iconst_m1       
	//*  95  180:icmpeq          202
			s = fontNames[italic + 4 + bold];
	//   96  183:getstatic       #84  <Field String[] fontNames>
	//   97  186:aload_0         
	//   98  187:getfield        #107 <Field int italic>
	//   99  190:iconst_4        
	//  100  191:iadd            
	//  101  192:aload_0         
	//  102  193:getfield        #109 <Field int bold>
	//  103  196:iadd            
	//  104  197:aaload          
	//  105  198:astore_3        
		else
	//* 106  199:goto            128
		if(faceName.indexOf("arial black") != -1)
	//* 107  202:aload_0         
	//* 108  203:getfield        #92  <Field String faceName>
	//* 109  206:ldc1            #144 <String "arial black">
	//* 110  208:invokevirtual   #128 <Method int String.indexOf(String)>
	//* 111  211:iconst_m1       
	//* 112  212:icmpeq          231
			s = fontNames[italic + 4 + 1];
	//  113  215:getstatic       #84  <Field String[] fontNames>
	//  114  218:aload_0         
	//  115  219:getfield        #107 <Field int italic>
	//  116  222:iconst_4        
	//  117  223:iadd            
	//  118  224:iconst_1        
	//  119  225:iadd            
	//  120  226:aaload          
	//  121  227:astore_3        
		else
	//* 122  228:goto            128
		if(faceName.indexOf("times") != -1 || faceName.indexOf("ms serif") != -1 || faceName.indexOf("roman") != -1)
	//* 123  231:aload_0         
	//* 124  232:getfield        #92  <Field String faceName>
	//* 125  235:ldc1            #146 <String "times">
	//* 126  237:invokevirtual   #128 <Method int String.indexOf(String)>
	//* 127  240:iconst_m1       
	//* 128  241:icmpne          270
	//* 129  244:aload_0         
	//* 130  245:getfield        #92  <Field String faceName>
	//* 131  248:ldc1            #148 <String "ms serif">
	//* 132  250:invokevirtual   #128 <Method int String.indexOf(String)>
	//* 133  253:iconst_m1       
	//* 134  254:icmpne          270
	//* 135  257:aload_0         
	//* 136  258:getfield        #92  <Field String faceName>
	//* 137  261:ldc1            #150 <String "roman">
	//* 138  263:invokevirtual   #128 <Method int String.indexOf(String)>
	//* 139  266:iconst_m1       
	//* 140  267:icmpeq          290
		{
			s = fontNames[italic + 8 + bold];
	//  141  270:getstatic       #84  <Field String[] fontNames>
	//  142  273:aload_0         
	//  143  274:getfield        #107 <Field int italic>
	//  144  277:bipush          8
	//  145  279:iadd            
	//  146  280:aload_0         
	//  147  281:getfield        #109 <Field int bold>
	//  148  284:iadd            
	//  149  285:aaload          
	//  150  286:astore_3        
		} else
	//* 151  287:goto            128
		{
label0:
			{
				if(faceName.indexOf("symbol") == -1)
					break label0;
	//  152  290:aload_0         
	//  153  291:getfield        #92  <Field String faceName>
	//  154  294:ldc1            #152 <String "symbol">
	//  155  296:invokevirtual   #128 <Method int String.indexOf(String)>
	//  156  299:iconst_m1       
	//  157  300:icmpeq          313
				s = fontNames[12];
	//  158  303:getstatic       #84  <Field String[] fontNames>
	//  159  306:bipush          12
	//  160  308:aaload          
	//  161  309:astore_3        
			}
		}
_L2:
		int i;
		try
		{
			font = BaseFont.createFont(s, "Cp1252", false);
		}
	//* 162  310:goto            128
	//* 163  313:aload_0         
	//* 164  314:getfield        #154 <Field int pitchAndFamily>
	//* 165  317:istore_1        
	//* 166  318:aload_0         
	//* 167  319:getfield        #154 <Field int pitchAndFamily>
	//* 168  322:iconst_4        
	//* 169  323:ishr            
	//* 170  324:bipush          7
	//* 171  326:iand            
	//* 172  327:tableswitch     1 5: default 360
	//	               1 418
	//	               2 438
	//	               3 399
	//	               4 438
	//	               5 438
	//* 173  360:iload_1         
	//* 174  361:iconst_3        
	//* 175  362:iand            
	//* 176  363:tableswitch     1 1: default 380
	//	               1 457
	//* 177  380:getstatic       #84  <Field String[] fontNames>
	//* 178  383:aload_0         
	//* 179  384:getfield        #107 <Field int italic>
	//* 180  387:iconst_4        
	//* 181  388:iadd            
	//* 182  389:aload_0         
	//* 183  390:getfield        #109 <Field int bold>
	//* 184  393:iadd            
	//* 185  394:aaload          
	//* 186  395:astore_3        
	//* 187  396:goto            128
	//* 188  399:getstatic       #84  <Field String[] fontNames>
	//* 189  402:aload_0         
	//* 190  403:getfield        #107 <Field int italic>
	//* 191  406:iconst_0        
	//* 192  407:iadd            
	//* 193  408:aload_0         
	//* 194  409:getfield        #109 <Field int bold>
	//* 195  412:iadd            
	//* 196  413:aaload          
	//* 197  414:astore_3        
	//* 198  415:goto            128
	//* 199  418:getstatic       #84  <Field String[] fontNames>
	//* 200  421:aload_0         
	//* 201  422:getfield        #107 <Field int italic>
	//* 202  425:bipush          8
	//* 203  427:iadd            
	//* 204  428:aload_0         
	//* 205  429:getfield        #109 <Field int bold>
	//* 206  432:iadd            
	//* 207  433:aaload          
	//* 208  434:astore_3        
	//* 209  435:goto            128
	//* 210  438:getstatic       #84  <Field String[] fontNames>
	//* 211  441:aload_0         
	//* 212  442:getfield        #107 <Field int italic>
	//* 213  445:iconst_4        
	//* 214  446:iadd            
	//* 215  447:aload_0         
	//* 216  448:getfield        #109 <Field int bold>
	//* 217  451:iadd            
	//* 218  452:aaload          
	//* 219  453:astore_3        
	//* 220  454:goto            128
	//* 221  457:getstatic       #84  <Field String[] fontNames>
	//* 222  460:aload_0         
	//* 223  461:getfield        #107 <Field int italic>
	//* 224  464:iconst_0        
	//* 225  465:iadd            
	//* 226  466:aload_0         
	//* 227  467:getfield        #109 <Field int bold>
	//* 228  470:iadd            
	//* 229  471:aaload          
	//* 230  472:astore_3        
	//* 231  473:goto            128
		catch(Exception exception)
	//* 232  476:astore_3        
		{
			throw new ExceptionConverter(exception);
	//  233  477:new             #156 <Class ExceptionConverter>
	//  234  480:dup             
	//  235  481:aload_3         
	//  236  482:invokespecial   #159 <Method void ExceptionConverter(Exception)>
	//  237  485:athrow          
		}
		return font;
		i = pitchAndFamily;
		switch(pitchAndFamily >> 4 & 7)
		{
		default:
			switch(i & 3)
			{
			default:
				s = fontNames[italic + 4 + bold];
				break;

			case 1: // '\001'
				s = fontNames[italic + 0 + bold];
				break;
			}
			break;

		case 3: // '\003'
			s = fontNames[italic + 0 + bold];
			break;

		case 1: // '\001'
			s = fontNames[italic + 8 + bold];
			break;

		case 2: // '\002'
		case 4: // '\004'
		case 5: // '\005'
			s = fontNames[italic + 4 + bold];
			break;
		}
		if(true) goto _L2; else goto _L1
_L1:
	}

	public float getFontSize(MetaState metastate)
	{
		return Math.abs(metastate.transformY(height) - metastate.transformY(0)) * Document.wmfFontCorrection;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #163 <Field int height>
	//    3    5:invokevirtual   #169 <Method float MetaState.transformY(int)>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #169 <Method float MetaState.transformY(int)>
	//    7   13:fsub            
	//    8   14:invokestatic    #175 <Method float Math.abs(float)>
	//    9   17:getstatic       #180 <Field float Document.wmfFontCorrection>
	//   10   20:fmul            
	//   11   21:freturn         
	}

	public void init(InputMeta inputmeta)
		throws IOException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		height = Math.abs(inputmeta.readShort());
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokevirtual   #192 <Method int InputMeta.readShort()>
	//    5    8:invokestatic    #195 <Method int Math.abs(int)>
	//    6   11:putfield        #163 <Field int height>
		inputmeta.skip(2);
	//    7   14:aload_1         
	//    8   15:iconst_2        
	//    9   16:invokevirtual   #199 <Method void InputMeta.skip(int)>
		angle = (float)(((double)inputmeta.readShort() / 1800D) * 3.1415926535897931D);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #192 <Method int InputMeta.readShort()>
	//   13   24:i2d             
	//   14   25:ldc2w           #200 <Double 1800D>
	//   15   28:ddiv            
	//   16   29:ldc2w           #202 <Double 3.1415926535897931D>
	//   17   32:dmul            
	//   18   33:d2f             
	//   19   34:putfield        #101 <Field float angle>
		inputmeta.skip(2);
	//   20   37:aload_1         
	//   21   38:iconst_2        
	//   22   39:invokevirtual   #199 <Method void InputMeta.skip(int)>
		int i;
		boolean flag;
		byte abyte0[];
		if(inputmeta.readShort() >= 600)
	//*  23   42:aload_1         
	//*  24   43:invokevirtual   #192 <Method int InputMeta.readShort()>
	//*  25   46:sipush          600
	//*  26   49:icmplt          179
			i = 1;
	//   27   52:iconst_1        
	//   28   53:istore_2        
		else
	//*  29   54:aload_0         
	//*  30   55:iload_2         
	//*  31   56:putfield        #109 <Field int bold>
	//*  32   59:aload_1         
	//*  33   60:invokevirtual   #206 <Method int InputMeta.readByte()>
	//*  34   63:ifeq            184
	//*  35   66:iconst_2        
	//*  36   67:istore_2        
	//*  37   68:aload_0         
	//*  38   69:iload_2         
	//*  39   70:putfield        #107 <Field int italic>
	//*  40   73:aload_1         
	//*  41   74:invokevirtual   #206 <Method int InputMeta.readByte()>
	//*  42   77:ifeq            189
	//*  43   80:iconst_1        
	//*  44   81:istore          4
	//*  45   83:aload_0         
	//*  46   84:iload           4
	//*  47   86:putfield        #208 <Field boolean underline>
	//*  48   89:aload_1         
	//*  49   90:invokevirtual   #206 <Method int InputMeta.readByte()>
	//*  50   93:ifeq            195
	//*  51   96:iload           5
	//*  52   98:istore          4
	//*  53  100:aload_0         
	//*  54  101:iload           4
	//*  55  103:putfield        #210 <Field boolean strikeout>
	//*  56  106:aload_0         
	//*  57  107:aload_1         
	//*  58  108:invokevirtual   #206 <Method int InputMeta.readByte()>
	//*  59  111:putfield        #212 <Field int charset>
	//*  60  114:aload_1         
	//*  61  115:iconst_3        
	//*  62  116:invokevirtual   #199 <Method void InputMeta.skip(int)>
	//*  63  119:aload_0         
	//*  64  120:aload_1         
	//*  65  121:invokevirtual   #206 <Method int InputMeta.readByte()>
	//*  66  124:putfield        #154 <Field int pitchAndFamily>
	//*  67  127:bipush          32
	//*  68  129:newarray        byte[]
	//*  69  131:astore          6
	//*  70  133:iconst_0        
	//*  71  134:istore_2        
	//*  72  135:iload_2         
	//*  73  136:bipush          32
	//*  74  138:icmpge          150
	//*  75  141:aload_1         
	//*  76  142:invokevirtual   #206 <Method int InputMeta.readByte()>
	//*  77  145:istore_3        
	//*  78  146:iload_3         
	//*  79  147:ifne            201
	//*  80  150:aload_0         
	//*  81  151:new             #54  <Class String>
	//*  82  154:dup             
	//*  83  155:aload           6
	//*  84  157:iconst_0        
	//*  85  158:iload_2         
	//*  86  159:ldc1            #111 <String "Cp1252">
	//*  87  161:invokespecial   #215 <Method void String(byte[], int, int, String)>
	//*  88  164:putfield        #92  <Field String faceName>
	//*  89  167:aload_0         
	//*  90  168:aload_0         
	//*  91  169:getfield        #92  <Field String faceName>
	//*  92  172:invokevirtual   #219 <Method String String.toLowerCase()>
	//*  93  175:putfield        #92  <Field String faceName>
	//*  94  178:return          
			i = 0;
	//   95  179:iconst_0        
	//   96  180:istore_2        
		bold = i;
		if(inputmeta.readByte() != 0)
			i = 2;
		else
	//*  97  181:goto            54
			i = 0;
	//   98  184:iconst_0        
	//   99  185:istore_2        
		italic = i;
		if(inputmeta.readByte() != 0)
			flag = true;
		else
	//* 100  186:goto            68
			flag = false;
	//  101  189:iconst_0        
	//  102  190:istore          4
		underline = flag;
		if(inputmeta.readByte() != 0)
			flag = flag1;
		else
	//* 103  192:goto            83
			flag = false;
	//  104  195:iconst_0        
	//  105  196:istore          4
		strikeout = flag;
		charset = inputmeta.readByte();
		inputmeta.skip(3);
		pitchAndFamily = inputmeta.readByte();
		abyte0 = new byte[32];
		i = 0;
		do
		{
label0:
			{
				int j;
				if(i < 32)
				{
					j = inputmeta.readByte();
					if(j != 0)
						break label0;
				}
				try
				{
					faceName = new String(abyte0, 0, i, "Cp1252");
				}
	//* 106  198:goto            100
	//* 107  201:aload           6
	//* 108  203:iload_2         
	//* 109  204:iload_3         
	//* 110  205:int2byte        
	//* 111  206:bastore         
	//* 112  207:iload_2         
	//* 113  208:iconst_1        
	//* 114  209:iadd            
	//* 115  210:istore_2        
	//* 116  211:goto            135
				// Misplaced declaration of an exception variable
				catch(InputMeta inputmeta)
	//* 117  214:astore_1        
				{
					faceName = new String(abyte0, 0, i);
	//  118  215:aload_0         
	//  119  216:new             #54  <Class String>
	//  120  219:dup             
	//  121  220:aload           6
	//  122  222:iconst_0        
	//  123  223:iload_2         
	//  124  224:invokespecial   #222 <Method void String(byte[], int, int)>
	//  125  227:putfield        #92  <Field String faceName>
				}
				faceName = faceName.toLowerCase();
				return;
			}
			abyte0[i] = (byte)j;
			i++;
		} while(true);
	//* 126  230:goto            167
	}

	public boolean isStrikeout()
	{
		return strikeout;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field boolean strikeout>
	//    2    4:ireturn         
	}

	public boolean isUnderline()
	{
		return underline;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field boolean underline>
	//    2    4:ireturn         
	}

	static final int BOLDTHRESHOLD = 600;
	static final int DEFAULT_PITCH = 0;
	static final int ETO_CLIPPED = 4;
	static final int ETO_OPAQUE = 2;
	static final int FF_DECORATIVE = 5;
	static final int FF_DONTCARE = 0;
	static final int FF_MODERN = 3;
	static final int FF_ROMAN = 1;
	static final int FF_SCRIPT = 4;
	static final int FF_SWISS = 2;
	static final int FIXED_PITCH = 1;
	static final int MARKER_BOLD = 1;
	static final int MARKER_COURIER = 0;
	static final int MARKER_HELVETICA = 4;
	static final int MARKER_ITALIC = 2;
	static final int MARKER_SYMBOL = 12;
	static final int MARKER_TIMES = 8;
	static final int VARIABLE_PITCH = 2;
	static final String fontNames[] = {
		"Courier", "Courier-Bold", "Courier-Oblique", "Courier-BoldOblique", "Helvetica", "Helvetica-Bold", "Helvetica-Oblique", "Helvetica-BoldOblique", "Times-Roman", "Times-Bold", 
		"Times-Italic", "Times-BoldItalic", "Symbol", "ZapfDingbats"
	};
	static final int nameSize = 32;
	float angle;
	int bold;
	int charset;
	String faceName;
	BaseFont font;
	int height;
	int italic;
	int pitchAndFamily;
	boolean strikeout;
	boolean underline;

	static 
	{
	//    0    0:bipush          14
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #56  <String "Courier">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #58  <String "Courier-Bold">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #60  <String "Courier-Oblique">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #62  <String "Courier-BoldOblique">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #64  <String "Helvetica">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #66  <String "Helvetica-Bold">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #68  <String "Helvetica-Oblique">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #70  <String "Helvetica-BoldOblique">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #72  <String "Times-Roman">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #74  <String "Times-Bold">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #76  <String "Times-Italic">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #78  <String "Times-BoldItalic">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #80  <String "Symbol">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #82  <String "ZapfDingbats">
	//   57   82:aastore         
	//   58   83:putstatic       #84  <Field String[] fontNames>
	//*  59   86:return          
	}
}
