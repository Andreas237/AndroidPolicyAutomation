// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Rectangle;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, PdfContentByte

public class BarcodePostnet extends Barcode
{

	public BarcodePostnet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Barcode()>
		n = 3.272727F;
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <Float 3.272727F>
	//    4    7:putfield        #23  <Field float n>
		x = 1.44F;
	//    5   10:aload_0         
	//    6   11:ldc1            #24  <Float 1.44F>
	//    7   13:putfield        #27  <Field float x>
		barHeight = 9F;
	//    8   16:aload_0         
	//    9   17:ldc1            #28  <Float 9F>
	//   10   19:putfield        #31  <Field float barHeight>
		size = 3.6F;
	//   11   22:aload_0         
	//   12   23:ldc1            #32  <Float 3.6F>
	//   13   25:putfield        #35  <Field float size>
		codeType = 7;
	//   14   28:aload_0         
	//   15   29:bipush          7
	//   16   31:putfield        #39  <Field int codeType>
	//   17   34:return          
	}

	public static byte[] getBarsPostnet(String s)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = s.length() - 1; i >= 0; i--)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #47  <Method int String.length()>
	//*   4    6:iconst_1        
	//*   5    7:isub            
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iflt            31
			k += s.charAt(i) - 48;
	//    9   13:iload_2         
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokevirtual   #51  <Method char String.charAt(int)>
	//   13   19:bipush          48
	//   14   21:isub            
	//   15   22:iadd            
	//   16   23:istore_2        

	//   17   24:iload_1         
	//   18   25:iconst_1        
	//   19   26:isub            
	//   20   27:istore_1        
	//*  21   28:goto            9
		s = (new StringBuilder()).append(s).append((char)((10 - k % 10) % 10 + 48)).toString();
	//   22   31:new             #53  <Class StringBuilder>
	//   23   34:dup             
	//   24   35:invokespecial   #54  <Method void StringBuilder()>
	//   25   38:aload_0         
	//   26   39:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   27   42:bipush          10
	//   28   44:iload_2         
	//   29   45:bipush          10
	//   30   47:irem            
	//   31   48:isub            
	//   32   49:bipush          10
	//   33   51:irem            
	//   34   52:bipush          48
	//   35   54:iadd            
	//   36   55:int2char        
	//   37   56:invokevirtual   #61  <Method StringBuilder StringBuilder.append(char)>
	//   38   59:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   39   62:astore_0        
		byte abyte0[] = new byte[s.length() * 5 + 2];
	//   40   63:aload_0         
	//   41   64:invokevirtual   #47  <Method int String.length()>
	//   42   67:iconst_5        
	//   43   68:imul            
	//   44   69:iconst_2        
	//   45   70:iadd            
	//   46   71:newarray        byte[]
	//   47   73:astore_3        
		abyte0[0] = 1;
	//   48   74:aload_3         
	//   49   75:iconst_0        
	//   50   76:iconst_1        
	//   51   77:bastore         
		abyte0[abyte0.length - 1] = 1;
	//   52   78:aload_3         
	//   53   79:aload_3         
	//   54   80:arraylength     
	//   55   81:iconst_1        
	//   56   82:isub            
	//   57   83:iconst_1        
	//   58   84:bastore         
		for(int j = 0; j < s.length(); j++)
	//*  59   85:iconst_0        
	//*  60   86:istore_1        
	//*  61   87:iload_1         
	//*  62   88:aload_0         
	//*  63   89:invokevirtual   #47  <Method int String.length()>
	//*  64   92:icmpge          127
		{
			char c = s.charAt(j);
	//   65   95:aload_0         
	//   66   96:iload_1         
	//   67   97:invokevirtual   #51  <Method char String.charAt(int)>
	//   68  100:istore_2        
			System.arraycopy(((Object) (BARS[c - 48])), 0, ((Object) (abyte0)), j * 5 + 1, 5);
	//   69  101:getstatic       #14  <Field byte[][] BARS>
	//   70  104:iload_2         
	//   71  105:bipush          48
	//   72  107:isub            
	//   73  108:aaload          
	//   74  109:iconst_0        
	//   75  110:aload_3         
	//   76  111:iload_1         
	//   77  112:iconst_5        
	//   78  113:imul            
	//   79  114:iconst_1        
	//   80  115:iadd            
	//   81  116:iconst_5        
	//   82  117:invokestatic    #71  <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   83  120:iload_1         
	//   84  121:iconst_1        
	//   85  122:iadd            
	//   86  123:istore_1        
	//*  87  124:goto            87
		return abyte0;
	//   88  127:aload_3         
	//   89  128:areturn         
	}

	public Rectangle getBarcodeSize()
	{
		return new Rectangle((float)((code.length() + 1) * 5 + 1) * n + x, barHeight);
	//    0    0:new             #75  <Class Rectangle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #79  <Field String code>
	//    4    8:invokevirtual   #47  <Method int String.length()>
	//    5   11:iconst_1        
	//    6   12:iadd            
	//    7   13:iconst_5        
	//    8   14:imul            
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:i2f             
	//   12   18:aload_0         
	//   13   19:getfield        #23  <Field float n>
	//   14   22:fmul            
	//   15   23:aload_0         
	//   16   24:getfield        #27  <Field float x>
	//   17   27:fadd            
	//   18   28:aload_0         
	//   19   29:getfield        #31  <Field float barHeight>
	//   20   32:invokespecial   #82  <Method void Rectangle(float, float)>
	//   21   35:areturn         
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		if(basecolor != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          9
			pdfcontentbyte.setColorFill(basecolor);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #90  <Method void PdfContentByte.setColorFill(BaseColor)>
		basecolor = ((BaseColor) (getBarsPostnet(code)));
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field String code>
	//    7   13:invokestatic    #92  <Method byte[] getBarsPostnet(String)>
	//    8   16:astore_2        
		int i = 1;
	//    9   17:iconst_1        
	//   10   18:istore          8
		if(codeType == 8)
	//*  11   20:aload_0         
	//*  12   21:getfield        #39  <Field int codeType>
	//*  13   24:bipush          8
	//*  14   26:icmpne          43
		{
			i = 0;
	//   15   29:iconst_0        
	//   16   30:istore          8
			basecolor[0] = 0;
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:iconst_0        
	//   20   35:bastore         
			basecolor[basecolor.length - 1] = 0;
	//   21   36:aload_2         
	//   22   37:aload_2         
	//   23   38:arraylength     
	//   24   39:iconst_1        
	//   25   40:isub            
	//   26   41:iconst_0        
	//   27   42:bastore         
		}
		float f = 0.0F;
	//   28   43:fconst_0        
	//   29   44:fstore          4
		int j = 0;
	//   30   46:iconst_0        
	//   31   47:istore          9
		while(j < basecolor.length) 
	//*  32   49:iload           9
	//*  33   51:aload_2         
	//*  34   52:arraylength     
	//*  35   53:icmpge          124
		{
			float f2 = x;
	//   36   56:aload_0         
	//   37   57:getfield        #27  <Field float x>
	//   38   60:fstore          6
			float f3 = inkSpreading;
	//   39   62:aload_0         
	//   40   63:getfield        #95  <Field float inkSpreading>
	//   41   66:fstore          7
			float f1;
			if(basecolor[j] == i)
	//*  42   68:aload_2         
	//*  43   69:iload           9
	//*  44   71:baload          
	//*  45   72:iload           8
	//*  46   74:icmpne          115
				f1 = barHeight;
	//   47   77:aload_0         
	//   48   78:getfield        #31  <Field float barHeight>
	//   49   81:fstore          5
			else
	//*  50   83:aload_1         
	//*  51   84:fload           4
	//*  52   86:fconst_0        
	//*  53   87:fload           6
	//*  54   89:fload           7
	//*  55   91:fsub            
	//*  56   92:fload           5
	//*  57   94:invokevirtual   #99  <Method void PdfContentByte.rectangle(float, float, float, float)>
	//*  58   97:fload           4
	//*  59   99:aload_0         
	//*  60  100:getfield        #23  <Field float n>
	//*  61  103:fadd            
	//*  62  104:fstore          4
	//*  63  106:iload           9
	//*  64  108:iconst_1        
	//*  65  109:iadd            
	//*  66  110:istore          9
	//*  67  112:goto            49
				f1 = size;
	//   68  115:aload_0         
	//   69  116:getfield        #35  <Field float size>
	//   70  119:fstore          5
			pdfcontentbyte.rectangle(f, 0.0F, f2 - f3, f1);
			f += n;
			j++;
		}
	//*  71  121:goto            83
		pdfcontentbyte.fill();
	//   72  124:aload_1         
	//   73  125:invokevirtual   #102 <Method void PdfContentByte.fill()>
		return getBarcodeSize();
	//   74  128:aload_0         
	//   75  129:invokevirtual   #104 <Method Rectangle getBarcodeSize()>
	//   76  132:areturn         
	}

	private static final byte BARS[][];

	static 
	{
		byte abyte0[] = {
			0, 0, 0, 1, 1
		};
	//    0    0:iconst_5        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #9   <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #9   <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #9   <Int 0>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #10  <Int 1>
	//   17   22:bastore         
	//   18   23:dup             
	//   19   24:iconst_4        
	//   20   25:ldc1            #10  <Int 1>
	//   21   27:bastore         
	//   22   28:astore_0        
		byte abyte1[] = {
			0, 0, 1, 1, 0
		};
	//   23   29:iconst_5        
	//   24   30:newarray        byte[]
	//   25   32:dup             
	//   26   33:iconst_0        
	//   27   34:ldc1            #9   <Int 0>
	//   28   36:bastore         
	//   29   37:dup             
	//   30   38:iconst_1        
	//   31   39:ldc1            #9   <Int 0>
	//   32   41:bastore         
	//   33   42:dup             
	//   34   43:iconst_2        
	//   35   44:ldc1            #10  <Int 1>
	//   36   46:bastore         
	//   37   47:dup             
	//   38   48:iconst_3        
	//   39   49:ldc1            #10  <Int 1>
	//   40   51:bastore         
	//   41   52:dup             
	//   42   53:iconst_4        
	//   43   54:ldc1            #9   <Int 0>
	//   44   56:bastore         
	//   45   57:astore_1        
		byte abyte2[] = {
			0, 1, 0, 0, 1
		};
	//   46   58:iconst_5        
	//   47   59:newarray        byte[]
	//   48   61:dup             
	//   49   62:iconst_0        
	//   50   63:ldc1            #9   <Int 0>
	//   51   65:bastore         
	//   52   66:dup             
	//   53   67:iconst_1        
	//   54   68:ldc1            #10  <Int 1>
	//   55   70:bastore         
	//   56   71:dup             
	//   57   72:iconst_2        
	//   58   73:ldc1            #9   <Int 0>
	//   59   75:bastore         
	//   60   76:dup             
	//   61   77:iconst_3        
	//   62   78:ldc1            #9   <Int 0>
	//   63   80:bastore         
	//   64   81:dup             
	//   65   82:iconst_4        
	//   66   83:ldc1            #10  <Int 1>
	//   67   85:bastore         
	//   68   86:astore_2        
		byte abyte3[] = {
			1, 0, 0, 0, 1
		};
	//   69   87:iconst_5        
	//   70   88:newarray        byte[]
	//   71   90:dup             
	//   72   91:iconst_0        
	//   73   92:ldc1            #10  <Int 1>
	//   74   94:bastore         
	//   75   95:dup             
	//   76   96:iconst_1        
	//   77   97:ldc1            #9   <Int 0>
	//   78   99:bastore         
	//   79  100:dup             
	//   80  101:iconst_2        
	//   81  102:ldc1            #9   <Int 0>
	//   82  104:bastore         
	//   83  105:dup             
	//   84  106:iconst_3        
	//   85  107:ldc1            #9   <Int 0>
	//   86  109:bastore         
	//   87  110:dup             
	//   88  111:iconst_4        
	//   89  112:ldc1            #10  <Int 1>
	//   90  114:bastore         
	//   91  115:astore_3        
		byte abyte4[] = {
			1, 0, 0, 1, 0
		};
	//   92  116:iconst_5        
	//   93  117:newarray        byte[]
	//   94  119:dup             
	//   95  120:iconst_0        
	//   96  121:ldc1            #10  <Int 1>
	//   97  123:bastore         
	//   98  124:dup             
	//   99  125:iconst_1        
	//  100  126:ldc1            #9   <Int 0>
	//  101  128:bastore         
	//  102  129:dup             
	//  103  130:iconst_2        
	//  104  131:ldc1            #9   <Int 0>
	//  105  133:bastore         
	//  106  134:dup             
	//  107  135:iconst_3        
	//  108  136:ldc1            #10  <Int 1>
	//  109  138:bastore         
	//  110  139:dup             
	//  111  140:iconst_4        
	//  112  141:ldc1            #9   <Int 0>
	//  113  143:bastore         
	//  114  144:astore          4
		BARS = (new byte[][] {
			new byte[] {
				1, 1, 0, 0, 0
			}, abyte0, new byte[] {
				0, 0, 1, 0, 1
			}, abyte1, abyte2, new byte[] {
				0, 1, 0, 1, 0
			}, new byte[] {
				0, 1, 1, 0, 0
			}, abyte3, abyte4, new byte[] {
				1, 0, 1, 0, 0
			}
		});
	//  115  146:bipush          10
	//  116  148:anewarray       byte[][]
	//  117  151:dup             
	//  118  152:iconst_0        
	//  119  153:iconst_5        
	//  120  154:newarray        byte[]
	//  121  156:dup             
	//  122  157:iconst_0        
	//  123  158:ldc1            #10  <Int 1>
	//  124  160:bastore         
	//  125  161:dup             
	//  126  162:iconst_1        
	//  127  163:ldc1            #10  <Int 1>
	//  128  165:bastore         
	//  129  166:dup             
	//  130  167:iconst_2        
	//  131  168:ldc1            #9   <Int 0>
	//  132  170:bastore         
	//  133  171:dup             
	//  134  172:iconst_3        
	//  135  173:ldc1            #9   <Int 0>
	//  136  175:bastore         
	//  137  176:dup             
	//  138  177:iconst_4        
	//  139  178:ldc1            #9   <Int 0>
	//  140  180:bastore         
	//  141  181:aastore         
	//  142  182:dup             
	//  143  183:iconst_1        
	//  144  184:aload_0         
	//  145  185:aastore         
	//  146  186:dup             
	//  147  187:iconst_2        
	//  148  188:iconst_5        
	//  149  189:newarray        byte[]
	//  150  191:dup             
	//  151  192:iconst_0        
	//  152  193:ldc1            #9   <Int 0>
	//  153  195:bastore         
	//  154  196:dup             
	//  155  197:iconst_1        
	//  156  198:ldc1            #9   <Int 0>
	//  157  200:bastore         
	//  158  201:dup             
	//  159  202:iconst_2        
	//  160  203:ldc1            #10  <Int 1>
	//  161  205:bastore         
	//  162  206:dup             
	//  163  207:iconst_3        
	//  164  208:ldc1            #9   <Int 0>
	//  165  210:bastore         
	//  166  211:dup             
	//  167  212:iconst_4        
	//  168  213:ldc1            #10  <Int 1>
	//  169  215:bastore         
	//  170  216:aastore         
	//  171  217:dup             
	//  172  218:iconst_3        
	//  173  219:aload_1         
	//  174  220:aastore         
	//  175  221:dup             
	//  176  222:iconst_4        
	//  177  223:aload_2         
	//  178  224:aastore         
	//  179  225:dup             
	//  180  226:iconst_5        
	//  181  227:iconst_5        
	//  182  228:newarray        byte[]
	//  183  230:dup             
	//  184  231:iconst_0        
	//  185  232:ldc1            #9   <Int 0>
	//  186  234:bastore         
	//  187  235:dup             
	//  188  236:iconst_1        
	//  189  237:ldc1            #10  <Int 1>
	//  190  239:bastore         
	//  191  240:dup             
	//  192  241:iconst_2        
	//  193  242:ldc1            #9   <Int 0>
	//  194  244:bastore         
	//  195  245:dup             
	//  196  246:iconst_3        
	//  197  247:ldc1            #10  <Int 1>
	//  198  249:bastore         
	//  199  250:dup             
	//  200  251:iconst_4        
	//  201  252:ldc1            #9   <Int 0>
	//  202  254:bastore         
	//  203  255:aastore         
	//  204  256:dup             
	//  205  257:bipush          6
	//  206  259:iconst_5        
	//  207  260:newarray        byte[]
	//  208  262:dup             
	//  209  263:iconst_0        
	//  210  264:ldc1            #9   <Int 0>
	//  211  266:bastore         
	//  212  267:dup             
	//  213  268:iconst_1        
	//  214  269:ldc1            #10  <Int 1>
	//  215  271:bastore         
	//  216  272:dup             
	//  217  273:iconst_2        
	//  218  274:ldc1            #10  <Int 1>
	//  219  276:bastore         
	//  220  277:dup             
	//  221  278:iconst_3        
	//  222  279:ldc1            #9   <Int 0>
	//  223  281:bastore         
	//  224  282:dup             
	//  225  283:iconst_4        
	//  226  284:ldc1            #9   <Int 0>
	//  227  286:bastore         
	//  228  287:aastore         
	//  229  288:dup             
	//  230  289:bipush          7
	//  231  291:aload_3         
	//  232  292:aastore         
	//  233  293:dup             
	//  234  294:bipush          8
	//  235  296:aload           4
	//  236  298:aastore         
	//  237  299:dup             
	//  238  300:bipush          9
	//  239  302:iconst_5        
	//  240  303:newarray        byte[]
	//  241  305:dup             
	//  242  306:iconst_0        
	//  243  307:ldc1            #10  <Int 1>
	//  244  309:bastore         
	//  245  310:dup             
	//  246  311:iconst_1        
	//  247  312:ldc1            #9   <Int 0>
	//  248  314:bastore         
	//  249  315:dup             
	//  250  316:iconst_2        
	//  251  317:ldc1            #10  <Int 1>
	//  252  319:bastore         
	//  253  320:dup             
	//  254  321:iconst_3        
	//  255  322:ldc1            #9   <Int 0>
	//  256  324:bastore         
	//  257  325:dup             
	//  258  326:iconst_4        
	//  259  327:ldc1            #9   <Int 0>
	//  260  329:bastore         
	//  261  330:aastore         
	//  262  331:putstatic       #14  <Field byte[][] BARS>
	//* 263  334:return          
	}
}
