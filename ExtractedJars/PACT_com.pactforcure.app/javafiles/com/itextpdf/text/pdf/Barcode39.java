// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, BaseFont, PdfContentByte

public class Barcode39 extends Barcode
{

	public Barcode39()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Barcode()>
		try
		{
			x = 0.8F;
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <Float 0.8F>
	//    4    7:putfield        #32  <Field float x>
			n = 2.0F;
	//    5   10:aload_0         
	//    6   11:fconst_2        
	//    7   12:putfield        #35  <Field float n>
			font = BaseFont.createFont("Helvetica", "winansi", false);
	//    8   15:aload_0         
	//    9   16:ldc1            #37  <String "Helvetica">
	//   10   18:ldc1            #39  <String "winansi">
	//   11   20:iconst_0        
	//   12   21:invokestatic    #45  <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   13   24:putfield        #49  <Field BaseFont font>
			size = 8F;
	//   14   27:aload_0         
	//   15   28:ldc1            #50  <Float 8F>
	//   16   30:putfield        #53  <Field float size>
			baseline = size;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #53  <Field float size>
	//   20   38:putfield        #56  <Field float baseline>
			barHeight = size * 3F;
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #53  <Field float size>
	//   24   46:ldc1            #57  <Float 3F>
	//   25   48:fmul            
	//   26   49:putfield        #60  <Field float barHeight>
			textAlignment = 1;
	//   27   52:aload_0         
	//   28   53:iconst_1        
	//   29   54:putfield        #64  <Field int textAlignment>
			generateChecksum = false;
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:putfield        #68  <Field boolean generateChecksum>
			checksumText = false;
	//   33   62:aload_0         
	//   34   63:iconst_0        
	//   35   64:putfield        #71  <Field boolean checksumText>
			startStopText = true;
	//   36   67:aload_0         
	//   37   68:iconst_1        
	//   38   69:putfield        #74  <Field boolean startStopText>
			extended = false;
	//   39   72:aload_0         
	//   40   73:iconst_0        
	//   41   74:putfield        #77  <Field boolean extended>
			return;
	//   42   77:return          
		}
		catch(Exception exception)
	//*  43   78:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   44   79:new             #79  <Class ExceptionConverter>
	//   45   82:dup             
	//   46   83:aload_1         
	//   47   84:invokespecial   #82  <Method void ExceptionConverter(Exception)>
	//   48   87:athrow          
		}
	}

	public static byte[] getBarsCode39(String s)
	{
		s = (new StringBuilder()).append("*").append(s).append("*").toString();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:ldc1            #89  <String "*">
	//    4    9:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:ldc1            #89  <String "*">
	//    8   18:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   10   24:astore_0        
		byte abyte0[] = new byte[s.length() * 10 - 1];
	//   11   25:aload_0         
	//   12   26:invokevirtual   #103 <Method int String.length()>
	//   13   29:bipush          10
	//   14   31:imul            
	//   15   32:iconst_1        
	//   16   33:isub            
	//   17   34:newarray        byte[]
	//   18   36:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*  19   37:iconst_0        
	//*  20   38:istore_1        
	//*  21   39:iload_1         
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #103 <Method int String.length()>
	//*  24   44:icmpge          103
		{
			int j = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*".indexOf(((int) (s.charAt(i))));
	//   25   47:ldc1            #10  <String "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*">
	//   26   49:aload_0         
	//   27   50:iload_1         
	//   28   51:invokevirtual   #107 <Method char String.charAt(int)>
	//   29   54:invokevirtual   #111 <Method int String.indexOf(int)>
	//   30   57:istore_2        
			if(j < 0)
	//*  31   58:iload_2         
	//*  32   59:ifge            80
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.character.1.is.illegal.in.code.39", ((int) (s.charAt(i)))));
	//   33   62:new             #113 <Class IllegalArgumentException>
	//   34   65:dup             
	//   35   66:ldc1            #115 <String "the.character.1.is.illegal.in.code.39">
	//   36   68:aload_0         
	//   37   69:iload_1         
	//   38   70:invokevirtual   #107 <Method char String.charAt(int)>
	//   39   73:invokestatic    #121 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   40   76:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   41   79:athrow          
			System.arraycopy(((Object) (BARS[j])), 0, ((Object) (abyte0)), i * 10, 9);
	//   42   80:getstatic       #21  <Field byte[][] BARS>
	//   43   83:iload_2         
	//   44   84:aaload          
	//   45   85:iconst_0        
	//   46   86:aload_3         
	//   47   87:iload_1         
	//   48   88:bipush          10
	//   49   90:imul            
	//   50   91:bipush          9
	//   51   93:invokestatic    #130 <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   52   96:iload_1         
	//   53   97:iconst_1        
	//   54   98:iadd            
	//   55   99:istore_1        
	//*  56  100:goto            39
		return abyte0;
	//   57  103:aload_3         
	//   58  104:areturn         
	}

	static char getChecksum(String s)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = 0; i < s.length(); i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:invokevirtual   #103 <Method int String.length()>
	//*   7    9:icmpge          56
		{
			int k = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*".indexOf(((int) (s.charAt(i))));
	//    8   12:ldc1            #10  <String "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*">
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:invokevirtual   #107 <Method char String.charAt(int)>
	//   12   19:invokevirtual   #111 <Method int String.indexOf(int)>
	//   13   22:istore_3        
			if(k < 0)
	//*  14   23:iload_3         
	//*  15   24:ifge            45
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.character.1.is.illegal.in.code.39", ((int) (s.charAt(i)))));
	//   16   27:new             #113 <Class IllegalArgumentException>
	//   17   30:dup             
	//   18   31:ldc1            #115 <String "the.character.1.is.illegal.in.code.39">
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #107 <Method char String.charAt(int)>
	//   22   38:invokestatic    #121 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   23   41:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   24   44:athrow          
			j += k;
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:iadd            
	//   28   48:istore_2        
		}

	//   29   49:iload_1         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_1        
	//*  33   53:goto            4
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*".charAt(j % 43);
	//   34   56:ldc1            #10  <String "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*">
	//   35   58:iload_2         
	//   36   59:bipush          43
	//   37   61:irem            
	//   38   62:invokevirtual   #107 <Method char String.charAt(int)>
	//   39   65:ireturn         
	}

	public static String getCode39Ex(String s)
	{
		StringBuilder stringbuilder = new StringBuilder("");
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #136 <String "">
	//    3    6:invokespecial   #137 <Method void StringBuilder(String)>
	//    4    9:astore          5
		for(int i = 0; i < s.length(); i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #103 <Method int String.length()>
	//*  10   18:icmpge          99
		{
			char c2 = s.charAt(i);
	//   11   21:aload_0         
	//   12   22:iload_3         
	//   13   23:invokevirtual   #107 <Method char String.charAt(int)>
	//   14   26:istore          4
			if(c2 > '\177')
	//*  15   28:iload           4
	//*  16   30:bipush          127
	//*  17   32:icmple          50
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.character.1.is.illegal.in.code.39.extended", ((int) (c2))));
	//   18   35:new             #113 <Class IllegalArgumentException>
	//   19   38:dup             
	//   20   39:ldc1            #139 <String "the.character.1.is.illegal.in.code.39.extended">
	//   21   41:iload           4
	//   22   43:invokestatic    #121 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   23   46:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   24   49:athrow          
			char c = "%U$A$B$C$D$E$F$G$H$I$J$K$L$M$N$O$P$Q$R$S$T$U$V$W$X$Y$Z%A%B%C%D%E  /A/B/C/D/E/F/G/H/I/J/K/L - ./O 0 1 2 3 4 5 6 7 8 9/Z%F%G%H%I%J%V A B C D E F G H I J K L M N O P Q R S T U V W X Y Z%K%L%M%N%O%W+A+B+C+D+E+F+G+H+I+J+K+L+M+N+O+P+Q+R+S+T+U+V+W+X+Y+Z%P%Q%R%S%T".charAt(c2 * 2);
	//   25   50:ldc1            #13  <String "%U$A$B$C$D$E$F$G$H$I$J$K$L$M$N$O$P$Q$R$S$T$U$V$W$X$Y$Z%A%B%C%D%E  /A/B/C/D/E/F/G/H/I/J/K/L - ./O 0 1 2 3 4 5 6 7 8 9/Z%F%G%H%I%J%V A B C D E F G H I J K L M N O P Q R S T U V W X Y Z%K%L%M%N%O%W+A+B+C+D+E+F+G+H+I+J+K+L+M+N+O+P+Q+R+S+T+U+V+W+X+Y+Z%P%Q%R%S%T">
	//   26   52:iload           4
	//   27   54:iconst_2        
	//   28   55:imul            
	//   29   56:invokevirtual   #107 <Method char String.charAt(int)>
	//   30   59:istore_1        
			char c1 = "%U$A$B$C$D$E$F$G$H$I$J$K$L$M$N$O$P$Q$R$S$T$U$V$W$X$Y$Z%A%B%C%D%E  /A/B/C/D/E/F/G/H/I/J/K/L - ./O 0 1 2 3 4 5 6 7 8 9/Z%F%G%H%I%J%V A B C D E F G H I J K L M N O P Q R S T U V W X Y Z%K%L%M%N%O%W+A+B+C+D+E+F+G+H+I+J+K+L+M+N+O+P+Q+R+S+T+U+V+W+X+Y+Z%P%Q%R%S%T".charAt(c2 * 2 + 1);
	//   31   60:ldc1            #13  <String "%U$A$B$C$D$E$F$G$H$I$J$K$L$M$N$O$P$Q$R$S$T$U$V$W$X$Y$Z%A%B%C%D%E  /A/B/C/D/E/F/G/H/I/J/K/L - ./O 0 1 2 3 4 5 6 7 8 9/Z%F%G%H%I%J%V A B C D E F G H I J K L M N O P Q R S T U V W X Y Z%K%L%M%N%O%W+A+B+C+D+E+F+G+H+I+J+K+L+M+N+O+P+Q+R+S+T+U+V+W+X+Y+Z%P%Q%R%S%T">
	//   32   62:iload           4
	//   33   64:iconst_2        
	//   34   65:imul            
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:invokevirtual   #107 <Method char String.charAt(int)>
	//   38   71:istore_2        
			if(c != ' ')
	//*  39   72:iload_1         
	//*  40   73:bipush          32
	//*  41   75:icmpeq          85
				stringbuilder.append(c);
	//   42   78:aload           5
	//   43   80:iload_1         
	//   44   81:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   45   84:pop             
			stringbuilder.append(c1);
	//   46   85:aload           5
	//   47   87:iload_2         
	//   48   88:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   49   91:pop             
		}

	//   50   92:iload_3         
	//   51   93:iconst_1        
	//   52   94:iadd            
	//   53   95:istore_3        
	//*  54   96:goto            13
		return stringbuilder.toString();
	//   55   99:aload           5
	//   56  101:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   57  104:areturn         
	}

	public Rectangle getBarcodeSize()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		float f1 = 0.0F;
	//    2    2:fconst_0        
	//    3    3:fstore_2        
		String s1 = code;
	//    4    4:aload_0         
	//    5    5:getfield        #147 <Field String code>
	//    6    8:astore          8
		if(extended)
	//*   7   10:aload_0         
	//*   8   11:getfield        #77  <Field boolean extended>
	//*   9   14:ifeq            26
			s1 = getCode39Ex(code);
	//   10   17:aload_0         
	//   11   18:getfield        #147 <Field String code>
	//   12   21:invokestatic    #149 <Method String getCode39Ex(String)>
	//   13   24:astore          8
		if(font != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #49  <Field BaseFont font>
	//*  16   30:ifnull          186
		{
			float f2;
			int i;
			int j;
			Object obj;
			String s;
			if(baseline > 0.0F)
	//*  17   33:aload_0         
	//*  18   34:getfield        #56  <Field float baseline>
	//*  19   37:fconst_0        
	//*  20   38:fcmpl           
	//*  21   39:ifle            265
				f = baseline - font.getFontDescriptor(3, size);
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field float baseline>
	//   24   46:aload_0         
	//   25   47:getfield        #49  <Field BaseFont font>
	//   26   50:iconst_3        
	//   27   51:aload_0         
	//   28   52:getfield        #53  <Field float size>
	//   29   55:invokevirtual   #153 <Method float BaseFont.getFontDescriptor(int, float)>
	//   30   58:fsub            
	//   31   59:fstore_1        
			else
	//*  32   60:aload_0         
	//*  33   61:getfield        #147 <Field String code>
	//*  34   64:astore          7
	//*  35   66:aload           7
	//*  36   68:astore          6
	//*  37   70:aload_0         
	//*  38   71:getfield        #68  <Field boolean generateChecksum>
	//*  39   74:ifeq            113
	//*  40   77:aload           7
	//*  41   79:astore          6
	//*  42   81:aload_0         
	//*  43   82:getfield        #71  <Field boolean checksumText>
	//*  44   85:ifeq            113
	//*  45   88:new             #86  <Class StringBuilder>
	//*  46   91:dup             
	//*  47   92:invokespecial   #87  <Method void StringBuilder()>
	//*  48   95:aload           7
	//*  49   97:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  50  100:aload           8
	//*  51  102:invokestatic    #155 <Method char getChecksum(String)>
	//*  52  105:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//*  53  108:invokevirtual   #97  <Method String StringBuilder.toString()>
	//*  54  111:astore          6
	//*  55  113:aload           6
	//*  56  115:astore          7
	//*  57  117:aload_0         
	//*  58  118:getfield        #74  <Field boolean startStopText>
	//*  59  121:ifeq            151
	//*  60  124:new             #86  <Class StringBuilder>
	//*  61  127:dup             
	//*  62  128:invokespecial   #87  <Method void StringBuilder()>
	//*  63  131:ldc1            #89  <String "*">
	//*  64  133:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  65  136:aload           6
	//*  66  138:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  67  141:ldc1            #89  <String "*">
	//*  68  143:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  69  146:invokevirtual   #97  <Method String StringBuilder.toString()>
	//*  70  149:astore          7
	//*  71  151:aload_0         
	//*  72  152:getfield        #49  <Field BaseFont font>
	//*  73  155:astore          6
	//*  74  157:aload_0         
	//*  75  158:getfield        #158 <Field String altText>
	//*  76  161:ifnull          170
	//*  77  164:aload_0         
	//*  78  165:getfield        #158 <Field String altText>
	//*  79  168:astore          7
	//*  80  170:aload           6
	//*  81  172:aload           7
	//*  82  174:aload_0         
	//*  83  175:getfield        #53  <Field float size>
	//*  84  178:invokevirtual   #162 <Method float BaseFont.getWidthPoint(String, float)>
	//*  85  181:fstore_3        
	//*  86  182:fload_1         
	//*  87  183:fstore_2        
	//*  88  184:fload_3         
	//*  89  185:fstore_1        
	//*  90  186:aload           8
	//*  91  188:invokevirtual   #103 <Method int String.length()>
	//*  92  191:iconst_2        
	//*  93  192:iadd            
	//*  94  193:istore          5
	//*  95  195:iload           5
	//*  96  197:istore          4
	//*  97  199:aload_0         
	//*  98  200:getfield        #68  <Field boolean generateChecksum>
	//*  99  203:ifeq            212
	//* 100  206:iload           5
	//* 101  208:iconst_1        
	//* 102  209:iadd            
	//* 103  210:istore          4
	//* 104  212:new             #164 <Class Rectangle>
	//* 105  215:dup             
	//* 106  216:iload           4
	//* 107  218:i2f             
	//* 108  219:ldc1            #165 <Float 6F>
	//* 109  221:aload_0         
	//* 110  222:getfield        #32  <Field float x>
	//* 111  225:fmul            
	//* 112  226:ldc1            #57  <Float 3F>
	//* 113  228:aload_0         
	//* 114  229:getfield        #32  <Field float x>
	//* 115  232:fmul            
	//* 116  233:aload_0         
	//* 117  234:getfield        #35  <Field float n>
	//* 118  237:fmul            
	//* 119  238:fadd            
	//* 120  239:fmul            
	//* 121  240:iload           4
	//* 122  242:iconst_1        
	//* 123  243:isub            
	//* 124  244:i2f             
	//* 125  245:aload_0         
	//* 126  246:getfield        #32  <Field float x>
	//* 127  249:fmul            
	//* 128  250:fadd            
	//* 129  251:fload_1         
	//* 130  252:invokestatic    #171 <Method float Math.max(float, float)>
	//* 131  255:aload_0         
	//* 132  256:getfield        #60  <Field float barHeight>
	//* 133  259:fload_2         
	//* 134  260:fadd            
	//* 135  261:invokespecial   #174 <Method void Rectangle(float, float)>
	//* 136  264:areturn         
				f = -baseline + size;
	//  137  265:aload_0         
	//  138  266:getfield        #56  <Field float baseline>
	//  139  269:fneg            
	//  140  270:aload_0         
	//  141  271:getfield        #53  <Field float size>
	//  142  274:fadd            
	//  143  275:fstore_1        
			s = code;
			obj = ((Object) (s));
			if(generateChecksum)
			{
				obj = ((Object) (s));
				if(checksumText)
					obj = ((Object) ((new StringBuilder()).append(s).append(getChecksum(s1)).toString()));
			}
			s = ((String) (obj));
			if(startStopText)
				s = (new StringBuilder()).append("*").append(((String) (obj))).append("*").toString();
			obj = ((Object) (font));
			if(altText != null)
				s = altText;
			f2 = ((BaseFont) (obj)).getWidthPoint(s, size);
			f1 = f;
			f = f2;
		}
		j = s1.length() + 2;
		i = j;
		if(generateChecksum)
			i = j + 1;
		return new Rectangle(Math.max((float)i * (6F * x + 3F * x * n) + (float)(i - 1) * x, f), barHeight + f1);
	//* 144  276:goto            60
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		float f1;
		float f2;
		float f3;
		float f4;
		boolean flag;
		Object obj;
		Object obj1 = ((Object) (code));
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String code>
	//    2    4:astore          14
		f2 = 0.0F;
	//    3    6:fconst_0        
	//    4    7:fstore          6
		String s = code;
	//    5    9:aload_0         
	//    6   10:getfield        #147 <Field String code>
	//    7   13:astore          12
		if(extended)
	//*   8   15:aload_0         
	//*   9   16:getfield        #77  <Field boolean extended>
	//*  10   19:ifeq            31
			s = getCode39Ex(code);
	//   11   22:aload_0         
	//   12   23:getfield        #147 <Field String code>
	//   13   26:invokestatic    #149 <Method String getCode39Ex(String)>
	//   14   29:astore          12
		obj = obj1;
	//   15   31:aload           14
	//   16   33:astore          13
		if(font != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #49  <Field BaseFont font>
	//*  19   39:ifnull          163
		{
			obj = obj1;
	//   20   42:aload           14
	//   21   44:astore          13
			if(generateChecksum)
	//*  22   46:aload_0         
	//*  23   47:getfield        #68  <Field boolean generateChecksum>
	//*  24   50:ifeq            89
			{
				obj = obj1;
	//   25   53:aload           14
	//   26   55:astore          13
				if(checksumText)
	//*  27   57:aload_0         
	//*  28   58:getfield        #71  <Field boolean checksumText>
	//*  29   61:ifeq            89
					obj = ((Object) ((new StringBuilder()).append(((String) (obj1))).append(getChecksum(s)).toString()));
	//   30   64:new             #86  <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #87  <Method void StringBuilder()>
	//   33   71:aload           14
	//   34   73:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   35   76:aload           12
	//   36   78:invokestatic    #155 <Method char getChecksum(String)>
	//   37   81:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   38   84:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   39   87:astore          13
			}
			obj1 = obj;
	//   40   89:aload           13
	//   41   91:astore          14
			if(startStopText)
	//*  42   93:aload_0         
	//*  43   94:getfield        #74  <Field boolean startStopText>
	//*  44   97:ifeq            127
				obj1 = ((Object) ((new StringBuilder()).append("*").append(((String) (obj))).append("*").toString()));
	//   45  100:new             #86  <Class StringBuilder>
	//   46  103:dup             
	//   47  104:invokespecial   #87  <Method void StringBuilder()>
	//   48  107:ldc1            #89  <String "*">
	//   49  109:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   50  112:aload           13
	//   51  114:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   52  117:ldc1            #89  <String "*">
	//   53  119:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   54  122:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   55  125:astore          14
			obj = ((Object) (font));
	//   56  127:aload_0         
	//   57  128:getfield        #49  <Field BaseFont font>
	//   58  131:astore          13
			if(altText != null)
	//*  59  133:aload_0         
	//*  60  134:getfield        #158 <Field String altText>
	//*  61  137:ifnull          146
				obj1 = ((Object) (altText));
	//   62  140:aload_0         
	//   63  141:getfield        #158 <Field String altText>
	//   64  144:astore          14
			f2 = ((BaseFont) (obj)).getWidthPoint(((String) (obj1)), size);
	//   65  146:aload           13
	//   66  148:aload           14
	//   67  150:aload_0         
	//   68  151:getfield        #53  <Field float size>
	//   69  154:invokevirtual   #162 <Method float BaseFont.getWidthPoint(String, float)>
	//   70  157:fstore          6
			obj = obj1;
	//   71  159:aload           14
	//   72  161:astore          13
		}
		obj1 = ((Object) (s));
	//   73  163:aload           12
	//   74  165:astore          14
		if(generateChecksum)
	//*  75  167:aload_0         
	//*  76  168:getfield        #68  <Field boolean generateChecksum>
	//*  77  171:ifeq            199
			obj1 = ((Object) ((new StringBuilder()).append(s).append(getChecksum(s)).toString()));
	//   78  174:new             #86  <Class StringBuilder>
	//   79  177:dup             
	//   80  178:invokespecial   #87  <Method void StringBuilder()>
	//   81  181:aload           12
	//   82  183:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   83  186:aload           12
	//   84  188:invokestatic    #155 <Method char getChecksum(String)>
	//   85  191:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   86  194:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   87  197:astore          14
		int i = ((String) (obj1)).length() + 2;
	//   88  199:aload           14
	//   89  201:invokevirtual   #103 <Method int String.length()>
	//   90  204:iconst_2        
	//   91  205:iadd            
	//   92  206:istore          10
		float f5 = (float)i * (6F * x + 3F * x * n) + (float)(i - 1) * x;
	//   93  208:iload           10
	//   94  210:i2f             
	//   95  211:ldc1            #165 <Float 6F>
	//   96  213:aload_0         
	//   97  214:getfield        #32  <Field float x>
	//   98  217:fmul            
	//   99  218:ldc1            #57  <Float 3F>
	//  100  220:aload_0         
	//  101  221:getfield        #32  <Field float x>
	//  102  224:fmul            
	//  103  225:aload_0         
	//  104  226:getfield        #35  <Field float n>
	//  105  229:fmul            
	//  106  230:fadd            
	//  107  231:fmul            
	//  108  232:iload           10
	//  109  234:iconst_1        
	//  110  235:isub            
	//  111  236:i2f             
	//  112  237:aload_0         
	//  113  238:getfield        #32  <Field float x>
	//  114  241:fmul            
	//  115  242:fadd            
	//  116  243:fstore          9
		f3 = 0.0F;
	//  117  245:fconst_0        
	//  118  246:fstore          7
		f4 = 0.0F;
	//  119  248:fconst_0        
	//  120  249:fstore          8
		float f = f3;
	//  121  251:fload           7
	//  122  253:fstore          4
		f1 = f4;
	//  123  255:fload           8
	//  124  257:fstore          5
		int j;
		byte abyte0[];
		switch(textAlignment)
	//* 125  259:aload_0         
	//* 126  260:getfield        #64  <Field int textAlignment>
		{
	//* 127  263:tableswitch     0 2: default 288
	//	               0 309
	//	               1 288
	//	               2 442
		case 1: // '\001'
		default:
			if(f2 > f5)
	//* 128  288:fload           6
	//* 129  290:fload           9
	//* 130  292:fcmpl           
	//* 131  293:ifle            478
			{
				f = (f2 - f5) / 2.0F;
	//  132  296:fload           6
	//  133  298:fload           9
	//  134  300:fsub            
	//  135  301:fconst_2        
	//  136  302:fdiv            
	//  137  303:fstore          4
				f1 = f4;
	//  138  305:fload           8
	//  139  307:fstore          5
			} else
	//* 140  309:fconst_0        
	//* 141  310:fstore          8
	//* 142  312:fconst_0        
	//* 143  313:fstore          6
	//* 144  315:fload           8
	//* 145  317:fstore          7
	//* 146  319:aload_0         
	//* 147  320:getfield        #49  <Field BaseFont font>
	//* 148  323:ifnull          350
	//* 149  326:aload_0         
	//* 150  327:getfield        #56  <Field float baseline>
	//* 151  330:fconst_0        
	//* 152  331:fcmpg           
	//* 153  332:ifgt            494
	//* 154  335:aload_0         
	//* 155  336:getfield        #60  <Field float barHeight>
	//* 156  339:aload_0         
	//* 157  340:getfield        #56  <Field float baseline>
	//* 158  343:fsub            
	//* 159  344:fstore          6
	//* 160  346:fload           8
	//* 161  348:fstore          7
	//* 162  350:aload           14
	//* 163  352:invokestatic    #178 <Method byte[] getBarsCode39(String)>
	//* 164  355:astore          12
	//* 165  357:iconst_1        
	//* 166  358:istore          10
	//* 167  360:aload_2         
	//* 168  361:ifnull          369
	//* 169  364:aload_1         
	//* 170  365:aload_2         
	//* 171  366:invokevirtual   #184 <Method void PdfContentByte.setColorFill(BaseColor)>
	//* 172  369:iconst_0        
	//* 173  370:istore          11
	//* 174  372:iload           11
	//* 175  374:aload           12
	//* 176  376:arraylength     
	//* 177  377:icmpge          541
	//* 178  380:aload           12
	//* 179  382:iload           11
	//* 180  384:baload          
	//* 181  385:ifne            521
	//* 182  388:aload_0         
	//* 183  389:getfield        #32  <Field float x>
	//* 184  392:fstore          8
	//* 185  394:iload           10
	//* 186  396:ifeq            418
	//* 187  399:aload_1         
	//* 188  400:fload           4
	//* 189  402:fload           7
	//* 190  404:fload           8
	//* 191  406:aload_0         
	//* 192  407:getfield        #187 <Field float inkSpreading>
	//* 193  410:fsub            
	//* 194  411:aload_0         
	//* 195  412:getfield        #60  <Field float barHeight>
	//* 196  415:invokevirtual   #191 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 197  418:iload           10
	//* 198  420:ifne            535
	//* 199  423:iconst_1        
	//* 200  424:istore          10
	//* 201  426:fload           4
	//* 202  428:fload           8
	//* 203  430:fadd            
	//* 204  431:fstore          4
	//* 205  433:iload           11
	//* 206  435:iconst_1        
	//* 207  436:iadd            
	//* 208  437:istore          11
	//* 209  439:goto            372
	//* 210  442:fload           6
	//* 211  444:fload           9
	//* 212  446:fcmpl           
	//* 213  447:ifle            464
	//* 214  450:fload           6
	//* 215  452:fload           9
	//* 216  454:fsub            
	//* 217  455:fstore          4
	//* 218  457:fload           8
	//* 219  459:fstore          5
	//* 220  461:goto            309
	//* 221  464:fload           9
	//* 222  466:fload           6
	//* 223  468:fsub            
	//* 224  469:fstore          5
	//* 225  471:fload           7
	//* 226  473:fstore          4
	//* 227  475:goto            309
			{
				f1 = (f5 - f2) / 2.0F;
	//  228  478:fload           9
	//  229  480:fload           6
	//  230  482:fsub            
	//  231  483:fconst_2        
	//  232  484:fdiv            
	//  233  485:fstore          5
				f = f3;
	//  234  487:fload           7
	//  235  489:fstore          4
			}
			break;

		case 0: // '\0'
			break;

		case 2: // '\002'
			break MISSING_BLOCK_LABEL_442;
		}
		f4 = 0.0F;
		f2 = 0.0F;
		f3 = f4;
		if(font != null)
			if(baseline <= 0.0F)
			{
				f2 = barHeight - baseline;
				f3 = f4;
			} else
	//* 236  491:goto            309
			{
				f2 = -font.getFontDescriptor(3, size);
	//  237  494:aload_0         
	//  238  495:getfield        #49  <Field BaseFont font>
	//  239  498:iconst_3        
	//  240  499:aload_0         
	//  241  500:getfield        #53  <Field float size>
	//  242  503:invokevirtual   #153 <Method float BaseFont.getFontDescriptor(int, float)>
	//  243  506:fneg            
	//  244  507:fstore          6
				f3 = f2 + baseline;
	//  245  509:fload           6
	//  246  511:aload_0         
	//  247  512:getfield        #56  <Field float baseline>
	//  248  515:fadd            
	//  249  516:fstore          7
			}
		abyte0 = getBarsCode39(((String) (obj1)));
		flag = true;
		if(basecolor != null)
			pdfcontentbyte.setColorFill(basecolor);
		j = 0;
		while(j < abyte0.length) 
		{
			if(abyte0[j] == 0)
				f4 = x;
			else
	//* 250  518:goto            350
				f4 = x * n;
	//  251  521:aload_0         
	//  252  522:getfield        #32  <Field float x>
	//  253  525:aload_0         
	//  254  526:getfield        #35  <Field float n>
	//  255  529:fmul            
	//  256  530:fstore          8
			if(flag)
				pdfcontentbyte.rectangle(f, f3, f4 - inkSpreading, barHeight);
			if(!flag)
				flag = true;
			else
	//* 257  532:goto            394
				flag = false;
	//  258  535:iconst_0        
	//  259  536:istore          10
			f += f4;
			j++;
		}
		break MISSING_BLOCK_LABEL_541;
	//  260  538:goto            426
		if(f2 > f5)
		{
			f = f2 - f5;
			f1 = f4;
		} else
		{
			f1 = f5 - f2;
			f = f3;
		}
		break MISSING_BLOCK_LABEL_309;
		pdfcontentbyte.fill();
	//  261  541:aload_1         
	//  262  542:invokevirtual   #194 <Method void PdfContentByte.fill()>
		if(font != null)
	//* 263  545:aload_0         
	//* 264  546:getfield        #49  <Field BaseFont font>
	//* 265  549:ifnull          595
		{
			if(basecolor1 != null)
	//* 266  552:aload_3         
	//* 267  553:ifnull          561
				pdfcontentbyte.setColorFill(basecolor1);
	//  268  556:aload_1         
	//  269  557:aload_3         
	//  270  558:invokevirtual   #184 <Method void PdfContentByte.setColorFill(BaseColor)>
			pdfcontentbyte.beginText();
	//  271  561:aload_1         
	//  272  562:invokevirtual   #197 <Method void PdfContentByte.beginText()>
			pdfcontentbyte.setFontAndSize(font, size);
	//  273  565:aload_1         
	//  274  566:aload_0         
	//  275  567:getfield        #49  <Field BaseFont font>
	//  276  570:aload_0         
	//  277  571:getfield        #53  <Field float size>
	//  278  574:invokevirtual   #201 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
			pdfcontentbyte.setTextMatrix(f1, f2);
	//  279  577:aload_1         
	//  280  578:fload           5
	//  281  580:fload           6
	//  282  582:invokevirtual   #204 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (obj)));
	//  283  585:aload_1         
	//  284  586:aload           13
	//  285  588:invokevirtual   #207 <Method void PdfContentByte.showText(String)>
			pdfcontentbyte.endText();
	//  286  591:aload_1         
	//  287  592:invokevirtual   #210 <Method void PdfContentByte.endText()>
		}
		return getBarcodeSize();
	//  288  595:aload_0         
	//  289  596:invokevirtual   #212 <Method Rectangle getBarcodeSize()>
	//  290  599:areturn         
	}

	private static final byte BARS[][];
	private static final String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%*";
	private static final String EXTENDED = "%U$A$B$C$D$E$F$G$H$I$J$K$L$M$N$O$P$Q$R$S$T$U$V$W$X$Y$Z%A%B%C%D%E  /A/B/C/D/E/F/G/H/I/J/K/L - ./O 0 1 2 3 4 5 6 7 8 9/Z%F%G%H%I%J%V A B C D E F G H I J K L M N O P Q R S T U V W X Y Z%K%L%M%N%O%W+A+B+C+D+E+F+G+H+I+J+K+L+M+N+O+P+Q+R+S+T+U+V+W+X+Y+Z%P%Q%R%S%T";

	static 
	{
		byte abyte0[] = {
			1, 0, 0, 1, 0, 0, 0, 0, 1
		};
	//    0    0:bipush          9
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #16  <Int 1>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #17  <Int 0>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #17  <Int 0>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #16  <Int 1>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #17  <Int 0>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #17  <Int 0>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #17  <Int 0>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #17  <Int 0>
	//   33   45:bastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #16  <Int 1>
	//   37   51:bastore         
	//   38   52:astore_0        
		byte abyte1[] = {
			0, 0, 1, 1, 0, 0, 0, 0, 1
		};
	//   39   53:bipush          9
	//   40   55:newarray        byte[]
	//   41   57:dup             
	//   42   58:iconst_0        
	//   43   59:ldc1            #17  <Int 0>
	//   44   61:bastore         
	//   45   62:dup             
	//   46   63:iconst_1        
	//   47   64:ldc1            #17  <Int 0>
	//   48   66:bastore         
	//   49   67:dup             
	//   50   68:iconst_2        
	//   51   69:ldc1            #16  <Int 1>
	//   52   71:bastore         
	//   53   72:dup             
	//   54   73:iconst_3        
	//   55   74:ldc1            #16  <Int 1>
	//   56   76:bastore         
	//   57   77:dup             
	//   58   78:iconst_4        
	//   59   79:ldc1            #17  <Int 0>
	//   60   81:bastore         
	//   61   82:dup             
	//   62   83:iconst_5        
	//   63   84:ldc1            #17  <Int 0>
	//   64   86:bastore         
	//   65   87:dup             
	//   66   88:bipush          6
	//   67   90:ldc1            #17  <Int 0>
	//   68   92:bastore         
	//   69   93:dup             
	//   70   94:bipush          7
	//   71   96:ldc1            #17  <Int 0>
	//   72   98:bastore         
	//   73   99:dup             
	//   74  100:bipush          8
	//   75  102:ldc1            #16  <Int 1>
	//   76  104:bastore         
	//   77  105:astore_1        
		byte abyte2[] = {
			0, 0, 0, 1, 0, 0, 1, 0, 1
		};
	//   78  106:bipush          9
	//   79  108:newarray        byte[]
	//   80  110:dup             
	//   81  111:iconst_0        
	//   82  112:ldc1            #17  <Int 0>
	//   83  114:bastore         
	//   84  115:dup             
	//   85  116:iconst_1        
	//   86  117:ldc1            #17  <Int 0>
	//   87  119:bastore         
	//   88  120:dup             
	//   89  121:iconst_2        
	//   90  122:ldc1            #17  <Int 0>
	//   91  124:bastore         
	//   92  125:dup             
	//   93  126:iconst_3        
	//   94  127:ldc1            #16  <Int 1>
	//   95  129:bastore         
	//   96  130:dup             
	//   97  131:iconst_4        
	//   98  132:ldc1            #17  <Int 0>
	//   99  134:bastore         
	//  100  135:dup             
	//  101  136:iconst_5        
	//  102  137:ldc1            #17  <Int 0>
	//  103  139:bastore         
	//  104  140:dup             
	//  105  141:bipush          6
	//  106  143:ldc1            #16  <Int 1>
	//  107  145:bastore         
	//  108  146:dup             
	//  109  147:bipush          7
	//  110  149:ldc1            #17  <Int 0>
	//  111  151:bastore         
	//  112  152:dup             
	//  113  153:bipush          8
	//  114  155:ldc1            #16  <Int 1>
	//  115  157:bastore         
	//  116  158:astore_2        
		byte abyte3[] = {
			1, 0, 0, 1, 0, 0, 1, 0, 0
		};
	//  117  159:bipush          9
	//  118  161:newarray        byte[]
	//  119  163:dup             
	//  120  164:iconst_0        
	//  121  165:ldc1            #16  <Int 1>
	//  122  167:bastore         
	//  123  168:dup             
	//  124  169:iconst_1        
	//  125  170:ldc1            #17  <Int 0>
	//  126  172:bastore         
	//  127  173:dup             
	//  128  174:iconst_2        
	//  129  175:ldc1            #17  <Int 0>
	//  130  177:bastore         
	//  131  178:dup             
	//  132  179:iconst_3        
	//  133  180:ldc1            #16  <Int 1>
	//  134  182:bastore         
	//  135  183:dup             
	//  136  184:iconst_4        
	//  137  185:ldc1            #17  <Int 0>
	//  138  187:bastore         
	//  139  188:dup             
	//  140  189:iconst_5        
	//  141  190:ldc1            #17  <Int 0>
	//  142  192:bastore         
	//  143  193:dup             
	//  144  194:bipush          6
	//  145  196:ldc1            #16  <Int 1>
	//  146  198:bastore         
	//  147  199:dup             
	//  148  200:bipush          7
	//  149  202:ldc1            #17  <Int 0>
	//  150  204:bastore         
	//  151  205:dup             
	//  152  206:bipush          8
	//  153  208:ldc1            #17  <Int 0>
	//  154  210:bastore         
	//  155  211:astore_3        
		byte abyte4[] = {
			0, 0, 1, 1, 0, 0, 1, 0, 0
		};
	//  156  212:bipush          9
	//  157  214:newarray        byte[]
	//  158  216:dup             
	//  159  217:iconst_0        
	//  160  218:ldc1            #17  <Int 0>
	//  161  220:bastore         
	//  162  221:dup             
	//  163  222:iconst_1        
	//  164  223:ldc1            #17  <Int 0>
	//  165  225:bastore         
	//  166  226:dup             
	//  167  227:iconst_2        
	//  168  228:ldc1            #16  <Int 1>
	//  169  230:bastore         
	//  170  231:dup             
	//  171  232:iconst_3        
	//  172  233:ldc1            #16  <Int 1>
	//  173  235:bastore         
	//  174  236:dup             
	//  175  237:iconst_4        
	//  176  238:ldc1            #17  <Int 0>
	//  177  240:bastore         
	//  178  241:dup             
	//  179  242:iconst_5        
	//  180  243:ldc1            #17  <Int 0>
	//  181  245:bastore         
	//  182  246:dup             
	//  183  247:bipush          6
	//  184  249:ldc1            #16  <Int 1>
	//  185  251:bastore         
	//  186  252:dup             
	//  187  253:bipush          7
	//  188  255:ldc1            #17  <Int 0>
	//  189  257:bastore         
	//  190  258:dup             
	//  191  259:bipush          8
	//  192  261:ldc1            #17  <Int 0>
	//  193  263:bastore         
	//  194  264:astore          4
		byte abyte5[] = {
			1, 0, 0, 0, 0, 1, 0, 0, 1
		};
	//  195  266:bipush          9
	//  196  268:newarray        byte[]
	//  197  270:dup             
	//  198  271:iconst_0        
	//  199  272:ldc1            #16  <Int 1>
	//  200  274:bastore         
	//  201  275:dup             
	//  202  276:iconst_1        
	//  203  277:ldc1            #17  <Int 0>
	//  204  279:bastore         
	//  205  280:dup             
	//  206  281:iconst_2        
	//  207  282:ldc1            #17  <Int 0>
	//  208  284:bastore         
	//  209  285:dup             
	//  210  286:iconst_3        
	//  211  287:ldc1            #17  <Int 0>
	//  212  289:bastore         
	//  213  290:dup             
	//  214  291:iconst_4        
	//  215  292:ldc1            #17  <Int 0>
	//  216  294:bastore         
	//  217  295:dup             
	//  218  296:iconst_5        
	//  219  297:ldc1            #16  <Int 1>
	//  220  299:bastore         
	//  221  300:dup             
	//  222  301:bipush          6
	//  223  303:ldc1            #17  <Int 0>
	//  224  305:bastore         
	//  225  306:dup             
	//  226  307:bipush          7
	//  227  309:ldc1            #17  <Int 0>
	//  228  311:bastore         
	//  229  312:dup             
	//  230  313:bipush          8
	//  231  315:ldc1            #16  <Int 1>
	//  232  317:bastore         
	//  233  318:astore          5
		byte abyte6[] = {
			0, 0, 1, 0, 0, 1, 0, 0, 1
		};
	//  234  320:bipush          9
	//  235  322:newarray        byte[]
	//  236  324:dup             
	//  237  325:iconst_0        
	//  238  326:ldc1            #17  <Int 0>
	//  239  328:bastore         
	//  240  329:dup             
	//  241  330:iconst_1        
	//  242  331:ldc1            #17  <Int 0>
	//  243  333:bastore         
	//  244  334:dup             
	//  245  335:iconst_2        
	//  246  336:ldc1            #16  <Int 1>
	//  247  338:bastore         
	//  248  339:dup             
	//  249  340:iconst_3        
	//  250  341:ldc1            #17  <Int 0>
	//  251  343:bastore         
	//  252  344:dup             
	//  253  345:iconst_4        
	//  254  346:ldc1            #17  <Int 0>
	//  255  348:bastore         
	//  256  349:dup             
	//  257  350:iconst_5        
	//  258  351:ldc1            #16  <Int 1>
	//  259  353:bastore         
	//  260  354:dup             
	//  261  355:bipush          6
	//  262  357:ldc1            #17  <Int 0>
	//  263  359:bastore         
	//  264  360:dup             
	//  265  361:bipush          7
	//  266  363:ldc1            #17  <Int 0>
	//  267  365:bastore         
	//  268  366:dup             
	//  269  367:bipush          8
	//  270  369:ldc1            #16  <Int 1>
	//  271  371:bastore         
	//  272  372:astore          6
		byte abyte7[] = {
			0, 0, 1, 0, 1, 1, 0, 0, 0
		};
	//  273  374:bipush          9
	//  274  376:newarray        byte[]
	//  275  378:dup             
	//  276  379:iconst_0        
	//  277  380:ldc1            #17  <Int 0>
	//  278  382:bastore         
	//  279  383:dup             
	//  280  384:iconst_1        
	//  281  385:ldc1            #17  <Int 0>
	//  282  387:bastore         
	//  283  388:dup             
	//  284  389:iconst_2        
	//  285  390:ldc1            #16  <Int 1>
	//  286  392:bastore         
	//  287  393:dup             
	//  288  394:iconst_3        
	//  289  395:ldc1            #17  <Int 0>
	//  290  397:bastore         
	//  291  398:dup             
	//  292  399:iconst_4        
	//  293  400:ldc1            #16  <Int 1>
	//  294  402:bastore         
	//  295  403:dup             
	//  296  404:iconst_5        
	//  297  405:ldc1            #16  <Int 1>
	//  298  407:bastore         
	//  299  408:dup             
	//  300  409:bipush          6
	//  301  411:ldc1            #17  <Int 0>
	//  302  413:bastore         
	//  303  414:dup             
	//  304  415:bipush          7
	//  305  417:ldc1            #17  <Int 0>
	//  306  419:bastore         
	//  307  420:dup             
	//  308  421:bipush          8
	//  309  423:ldc1            #17  <Int 0>
	//  310  425:bastore         
	//  311  426:astore          7
		byte abyte8[] = {
			1, 0, 0, 0, 0, 1, 1, 0, 0
		};
	//  312  428:bipush          9
	//  313  430:newarray        byte[]
	//  314  432:dup             
	//  315  433:iconst_0        
	//  316  434:ldc1            #16  <Int 1>
	//  317  436:bastore         
	//  318  437:dup             
	//  319  438:iconst_1        
	//  320  439:ldc1            #17  <Int 0>
	//  321  441:bastore         
	//  322  442:dup             
	//  323  443:iconst_2        
	//  324  444:ldc1            #17  <Int 0>
	//  325  446:bastore         
	//  326  447:dup             
	//  327  448:iconst_3        
	//  328  449:ldc1            #17  <Int 0>
	//  329  451:bastore         
	//  330  452:dup             
	//  331  453:iconst_4        
	//  332  454:ldc1            #17  <Int 0>
	//  333  456:bastore         
	//  334  457:dup             
	//  335  458:iconst_5        
	//  336  459:ldc1            #16  <Int 1>
	//  337  461:bastore         
	//  338  462:dup             
	//  339  463:bipush          6
	//  340  465:ldc1            #16  <Int 1>
	//  341  467:bastore         
	//  342  468:dup             
	//  343  469:bipush          7
	//  344  471:ldc1            #17  <Int 0>
	//  345  473:bastore         
	//  346  474:dup             
	//  347  475:bipush          8
	//  348  477:ldc1            #17  <Int 0>
	//  349  479:bastore         
	//  350  480:astore          8
		byte abyte9[] = {
			1, 0, 1, 0, 0, 0, 0, 1, 0
		};
	//  351  482:bipush          9
	//  352  484:newarray        byte[]
	//  353  486:dup             
	//  354  487:iconst_0        
	//  355  488:ldc1            #16  <Int 1>
	//  356  490:bastore         
	//  357  491:dup             
	//  358  492:iconst_1        
	//  359  493:ldc1            #17  <Int 0>
	//  360  495:bastore         
	//  361  496:dup             
	//  362  497:iconst_2        
	//  363  498:ldc1            #16  <Int 1>
	//  364  500:bastore         
	//  365  501:dup             
	//  366  502:iconst_3        
	//  367  503:ldc1            #17  <Int 0>
	//  368  505:bastore         
	//  369  506:dup             
	//  370  507:iconst_4        
	//  371  508:ldc1            #17  <Int 0>
	//  372  510:bastore         
	//  373  511:dup             
	//  374  512:iconst_5        
	//  375  513:ldc1            #17  <Int 0>
	//  376  515:bastore         
	//  377  516:dup             
	//  378  517:bipush          6
	//  379  519:ldc1            #17  <Int 0>
	//  380  521:bastore         
	//  381  522:dup             
	//  382  523:bipush          7
	//  383  525:ldc1            #16  <Int 1>
	//  384  527:bastore         
	//  385  528:dup             
	//  386  529:bipush          8
	//  387  531:ldc1            #17  <Int 0>
	//  388  533:bastore         
	//  389  534:astore          9
		byte abyte10[] = {
			1, 0, 0, 0, 1, 0, 0, 1, 0
		};
	//  390  536:bipush          9
	//  391  538:newarray        byte[]
	//  392  540:dup             
	//  393  541:iconst_0        
	//  394  542:ldc1            #16  <Int 1>
	//  395  544:bastore         
	//  396  545:dup             
	//  397  546:iconst_1        
	//  398  547:ldc1            #17  <Int 0>
	//  399  549:bastore         
	//  400  550:dup             
	//  401  551:iconst_2        
	//  402  552:ldc1            #17  <Int 0>
	//  403  554:bastore         
	//  404  555:dup             
	//  405  556:iconst_3        
	//  406  557:ldc1            #17  <Int 0>
	//  407  559:bastore         
	//  408  560:dup             
	//  409  561:iconst_4        
	//  410  562:ldc1            #16  <Int 1>
	//  411  564:bastore         
	//  412  565:dup             
	//  413  566:iconst_5        
	//  414  567:ldc1            #17  <Int 0>
	//  415  569:bastore         
	//  416  570:dup             
	//  417  571:bipush          6
	//  418  573:ldc1            #17  <Int 0>
	//  419  575:bastore         
	//  420  576:dup             
	//  421  577:bipush          7
	//  422  579:ldc1            #16  <Int 1>
	//  423  581:bastore         
	//  424  582:dup             
	//  425  583:bipush          8
	//  426  585:ldc1            #17  <Int 0>
	//  427  587:bastore         
	//  428  588:astore          10
		byte abyte11[] = {
			0, 0, 1, 0, 1, 0, 0, 1, 0
		};
	//  429  590:bipush          9
	//  430  592:newarray        byte[]
	//  431  594:dup             
	//  432  595:iconst_0        
	//  433  596:ldc1            #17  <Int 0>
	//  434  598:bastore         
	//  435  599:dup             
	//  436  600:iconst_1        
	//  437  601:ldc1            #17  <Int 0>
	//  438  603:bastore         
	//  439  604:dup             
	//  440  605:iconst_2        
	//  441  606:ldc1            #16  <Int 1>
	//  442  608:bastore         
	//  443  609:dup             
	//  444  610:iconst_3        
	//  445  611:ldc1            #17  <Int 0>
	//  446  613:bastore         
	//  447  614:dup             
	//  448  615:iconst_4        
	//  449  616:ldc1            #16  <Int 1>
	//  450  618:bastore         
	//  451  619:dup             
	//  452  620:iconst_5        
	//  453  621:ldc1            #17  <Int 0>
	//  454  623:bastore         
	//  455  624:dup             
	//  456  625:bipush          6
	//  457  627:ldc1            #17  <Int 0>
	//  458  629:bastore         
	//  459  630:dup             
	//  460  631:bipush          7
	//  461  633:ldc1            #16  <Int 1>
	//  462  635:bastore         
	//  463  636:dup             
	//  464  637:bipush          8
	//  465  639:ldc1            #17  <Int 0>
	//  466  641:bastore         
	//  467  642:astore          11
		byte abyte12[] = {
			0, 0, 1, 0, 0, 0, 1, 1, 0
		};
	//  468  644:bipush          9
	//  469  646:newarray        byte[]
	//  470  648:dup             
	//  471  649:iconst_0        
	//  472  650:ldc1            #17  <Int 0>
	//  473  652:bastore         
	//  474  653:dup             
	//  475  654:iconst_1        
	//  476  655:ldc1            #17  <Int 0>
	//  477  657:bastore         
	//  478  658:dup             
	//  479  659:iconst_2        
	//  480  660:ldc1            #16  <Int 1>
	//  481  662:bastore         
	//  482  663:dup             
	//  483  664:iconst_3        
	//  484  665:ldc1            #17  <Int 0>
	//  485  667:bastore         
	//  486  668:dup             
	//  487  669:iconst_4        
	//  488  670:ldc1            #17  <Int 0>
	//  489  672:bastore         
	//  490  673:dup             
	//  491  674:iconst_5        
	//  492  675:ldc1            #17  <Int 0>
	//  493  677:bastore         
	//  494  678:dup             
	//  495  679:bipush          6
	//  496  681:ldc1            #16  <Int 1>
	//  497  683:bastore         
	//  498  684:dup             
	//  499  685:bipush          7
	//  500  687:ldc1            #16  <Int 1>
	//  501  689:bastore         
	//  502  690:dup             
	//  503  691:bipush          8
	//  504  693:ldc1            #17  <Int 0>
	//  505  695:bastore         
	//  506  696:astore          12
		byte abyte13[] = {
			1, 1, 0, 0, 0, 0, 0, 0, 1
		};
	//  507  698:bipush          9
	//  508  700:newarray        byte[]
	//  509  702:dup             
	//  510  703:iconst_0        
	//  511  704:ldc1            #16  <Int 1>
	//  512  706:bastore         
	//  513  707:dup             
	//  514  708:iconst_1        
	//  515  709:ldc1            #16  <Int 1>
	//  516  711:bastore         
	//  517  712:dup             
	//  518  713:iconst_2        
	//  519  714:ldc1            #17  <Int 0>
	//  520  716:bastore         
	//  521  717:dup             
	//  522  718:iconst_3        
	//  523  719:ldc1            #17  <Int 0>
	//  524  721:bastore         
	//  525  722:dup             
	//  526  723:iconst_4        
	//  527  724:ldc1            #17  <Int 0>
	//  528  726:bastore         
	//  529  727:dup             
	//  530  728:iconst_5        
	//  531  729:ldc1            #17  <Int 0>
	//  532  731:bastore         
	//  533  732:dup             
	//  534  733:bipush          6
	//  535  735:ldc1            #17  <Int 0>
	//  536  737:bastore         
	//  537  738:dup             
	//  538  739:bipush          7
	//  539  741:ldc1            #17  <Int 0>
	//  540  743:bastore         
	//  541  744:dup             
	//  542  745:bipush          8
	//  543  747:ldc1            #16  <Int 1>
	//  544  749:bastore         
	//  545  750:astore          13
		byte abyte14[] = {
			0, 1, 1, 0, 0, 0, 0, 0, 1
		};
	//  546  752:bipush          9
	//  547  754:newarray        byte[]
	//  548  756:dup             
	//  549  757:iconst_0        
	//  550  758:ldc1            #17  <Int 0>
	//  551  760:bastore         
	//  552  761:dup             
	//  553  762:iconst_1        
	//  554  763:ldc1            #16  <Int 1>
	//  555  765:bastore         
	//  556  766:dup             
	//  557  767:iconst_2        
	//  558  768:ldc1            #16  <Int 1>
	//  559  770:bastore         
	//  560  771:dup             
	//  561  772:iconst_3        
	//  562  773:ldc1            #17  <Int 0>
	//  563  775:bastore         
	//  564  776:dup             
	//  565  777:iconst_4        
	//  566  778:ldc1            #17  <Int 0>
	//  567  780:bastore         
	//  568  781:dup             
	//  569  782:iconst_5        
	//  570  783:ldc1            #17  <Int 0>
	//  571  785:bastore         
	//  572  786:dup             
	//  573  787:bipush          6
	//  574  789:ldc1            #17  <Int 0>
	//  575  791:bastore         
	//  576  792:dup             
	//  577  793:bipush          7
	//  578  795:ldc1            #17  <Int 0>
	//  579  797:bastore         
	//  580  798:dup             
	//  581  799:bipush          8
	//  582  801:ldc1            #16  <Int 1>
	//  583  803:bastore         
	//  584  804:astore          14
		byte abyte15[] = {
			0, 1, 0, 0, 1, 0, 0, 0, 1
		};
	//  585  806:bipush          9
	//  586  808:newarray        byte[]
	//  587  810:dup             
	//  588  811:iconst_0        
	//  589  812:ldc1            #17  <Int 0>
	//  590  814:bastore         
	//  591  815:dup             
	//  592  816:iconst_1        
	//  593  817:ldc1            #16  <Int 1>
	//  594  819:bastore         
	//  595  820:dup             
	//  596  821:iconst_2        
	//  597  822:ldc1            #17  <Int 0>
	//  598  824:bastore         
	//  599  825:dup             
	//  600  826:iconst_3        
	//  601  827:ldc1            #17  <Int 0>
	//  602  829:bastore         
	//  603  830:dup             
	//  604  831:iconst_4        
	//  605  832:ldc1            #16  <Int 1>
	//  606  834:bastore         
	//  607  835:dup             
	//  608  836:iconst_5        
	//  609  837:ldc1            #17  <Int 0>
	//  610  839:bastore         
	//  611  840:dup             
	//  612  841:bipush          6
	//  613  843:ldc1            #17  <Int 0>
	//  614  845:bastore         
	//  615  846:dup             
	//  616  847:bipush          7
	//  617  849:ldc1            #17  <Int 0>
	//  618  851:bastore         
	//  619  852:dup             
	//  620  853:bipush          8
	//  621  855:ldc1            #16  <Int 1>
	//  622  857:bastore         
	//  623  858:astore          15
		byte abyte16[] = {
			1, 1, 0, 0, 1, 0, 0, 0, 0
		};
	//  624  860:bipush          9
	//  625  862:newarray        byte[]
	//  626  864:dup             
	//  627  865:iconst_0        
	//  628  866:ldc1            #16  <Int 1>
	//  629  868:bastore         
	//  630  869:dup             
	//  631  870:iconst_1        
	//  632  871:ldc1            #16  <Int 1>
	//  633  873:bastore         
	//  634  874:dup             
	//  635  875:iconst_2        
	//  636  876:ldc1            #17  <Int 0>
	//  637  878:bastore         
	//  638  879:dup             
	//  639  880:iconst_3        
	//  640  881:ldc1            #17  <Int 0>
	//  641  883:bastore         
	//  642  884:dup             
	//  643  885:iconst_4        
	//  644  886:ldc1            #16  <Int 1>
	//  645  888:bastore         
	//  646  889:dup             
	//  647  890:iconst_5        
	//  648  891:ldc1            #17  <Int 0>
	//  649  893:bastore         
	//  650  894:dup             
	//  651  895:bipush          6
	//  652  897:ldc1            #17  <Int 0>
	//  653  899:bastore         
	//  654  900:dup             
	//  655  901:bipush          7
	//  656  903:ldc1            #17  <Int 0>
	//  657  905:bastore         
	//  658  906:dup             
	//  659  907:bipush          8
	//  660  909:ldc1            #17  <Int 0>
	//  661  911:bastore         
	//  662  912:astore          16
		byte abyte17[] = {
			1, 1, 0, 0, 0, 0, 1, 0, 0
		};
	//  663  914:bipush          9
	//  664  916:newarray        byte[]
	//  665  918:dup             
	//  666  919:iconst_0        
	//  667  920:ldc1            #16  <Int 1>
	//  668  922:bastore         
	//  669  923:dup             
	//  670  924:iconst_1        
	//  671  925:ldc1            #16  <Int 1>
	//  672  927:bastore         
	//  673  928:dup             
	//  674  929:iconst_2        
	//  675  930:ldc1            #17  <Int 0>
	//  676  932:bastore         
	//  677  933:dup             
	//  678  934:iconst_3        
	//  679  935:ldc1            #17  <Int 0>
	//  680  937:bastore         
	//  681  938:dup             
	//  682  939:iconst_4        
	//  683  940:ldc1            #17  <Int 0>
	//  684  942:bastore         
	//  685  943:dup             
	//  686  944:iconst_5        
	//  687  945:ldc1            #17  <Int 0>
	//  688  947:bastore         
	//  689  948:dup             
	//  690  949:bipush          6
	//  691  951:ldc1            #16  <Int 1>
	//  692  953:bastore         
	//  693  954:dup             
	//  694  955:bipush          7
	//  695  957:ldc1            #17  <Int 0>
	//  696  959:bastore         
	//  697  960:dup             
	//  698  961:bipush          8
	//  699  963:ldc1            #17  <Int 0>
	//  700  965:bastore         
	//  701  966:astore          17
		byte abyte18[] = {
			0, 1, 0, 1, 0, 1, 0, 0, 0
		};
	//  702  968:bipush          9
	//  703  970:newarray        byte[]
	//  704  972:dup             
	//  705  973:iconst_0        
	//  706  974:ldc1            #17  <Int 0>
	//  707  976:bastore         
	//  708  977:dup             
	//  709  978:iconst_1        
	//  710  979:ldc1            #16  <Int 1>
	//  711  981:bastore         
	//  712  982:dup             
	//  713  983:iconst_2        
	//  714  984:ldc1            #17  <Int 0>
	//  715  986:bastore         
	//  716  987:dup             
	//  717  988:iconst_3        
	//  718  989:ldc1            #16  <Int 1>
	//  719  991:bastore         
	//  720  992:dup             
	//  721  993:iconst_4        
	//  722  994:ldc1            #17  <Int 0>
	//  723  996:bastore         
	//  724  997:dup             
	//  725  998:iconst_5        
	//  726  999:ldc1            #16  <Int 1>
	//  727 1001:bastore         
	//  728 1002:dup             
	//  729 1003:bipush          6
	//  730 1005:ldc1            #17  <Int 0>
	//  731 1007:bastore         
	//  732 1008:dup             
	//  733 1009:bipush          7
	//  734 1011:ldc1            #17  <Int 0>
	//  735 1013:bastore         
	//  736 1014:dup             
	//  737 1015:bipush          8
	//  738 1017:ldc1            #17  <Int 0>
	//  739 1019:bastore         
	//  740 1020:astore          18
		byte abyte19[] = {
			0, 1, 0, 1, 0, 0, 0, 1, 0
		};
	//  741 1022:bipush          9
	//  742 1024:newarray        byte[]
	//  743 1026:dup             
	//  744 1027:iconst_0        
	//  745 1028:ldc1            #17  <Int 0>
	//  746 1030:bastore         
	//  747 1031:dup             
	//  748 1032:iconst_1        
	//  749 1033:ldc1            #16  <Int 1>
	//  750 1035:bastore         
	//  751 1036:dup             
	//  752 1037:iconst_2        
	//  753 1038:ldc1            #17  <Int 0>
	//  754 1040:bastore         
	//  755 1041:dup             
	//  756 1042:iconst_3        
	//  757 1043:ldc1            #16  <Int 1>
	//  758 1045:bastore         
	//  759 1046:dup             
	//  760 1047:iconst_4        
	//  761 1048:ldc1            #17  <Int 0>
	//  762 1050:bastore         
	//  763 1051:dup             
	//  764 1052:iconst_5        
	//  765 1053:ldc1            #17  <Int 0>
	//  766 1055:bastore         
	//  767 1056:dup             
	//  768 1057:bipush          6
	//  769 1059:ldc1            #17  <Int 0>
	//  770 1061:bastore         
	//  771 1062:dup             
	//  772 1063:bipush          7
	//  773 1065:ldc1            #16  <Int 1>
	//  774 1067:bastore         
	//  775 1068:dup             
	//  776 1069:bipush          8
	//  777 1071:ldc1            #17  <Int 0>
	//  778 1073:bastore         
	//  779 1074:astore          19
		byte abyte20[] = {
			0, 1, 0, 0, 0, 1, 0, 1, 0
		};
	//  780 1076:bipush          9
	//  781 1078:newarray        byte[]
	//  782 1080:dup             
	//  783 1081:iconst_0        
	//  784 1082:ldc1            #17  <Int 0>
	//  785 1084:bastore         
	//  786 1085:dup             
	//  787 1086:iconst_1        
	//  788 1087:ldc1            #16  <Int 1>
	//  789 1089:bastore         
	//  790 1090:dup             
	//  791 1091:iconst_2        
	//  792 1092:ldc1            #17  <Int 0>
	//  793 1094:bastore         
	//  794 1095:dup             
	//  795 1096:iconst_3        
	//  796 1097:ldc1            #17  <Int 0>
	//  797 1099:bastore         
	//  798 1100:dup             
	//  799 1101:iconst_4        
	//  800 1102:ldc1            #17  <Int 0>
	//  801 1104:bastore         
	//  802 1105:dup             
	//  803 1106:iconst_5        
	//  804 1107:ldc1            #16  <Int 1>
	//  805 1109:bastore         
	//  806 1110:dup             
	//  807 1111:bipush          6
	//  808 1113:ldc1            #17  <Int 0>
	//  809 1115:bastore         
	//  810 1116:dup             
	//  811 1117:bipush          7
	//  812 1119:ldc1            #16  <Int 1>
	//  813 1121:bastore         
	//  814 1122:dup             
	//  815 1123:bipush          8
	//  816 1125:ldc1            #17  <Int 0>
	//  817 1127:bastore         
	//  818 1128:astore          20
		BARS = (new byte[][] {
			new byte[] {
				0, 0, 0, 1, 1, 0, 1, 0, 0
			}, abyte0, abyte1, new byte[] {
				1, 0, 1, 1, 0, 0, 0, 0, 0
			}, new byte[] {
				0, 0, 0, 1, 1, 0, 0, 0, 1
			}, new byte[] {
				1, 0, 0, 1, 1, 0, 0, 0, 0
			}, new byte[] {
				0, 0, 1, 1, 1, 0, 0, 0, 0
			}, abyte2, abyte3, abyte4, abyte5, abyte6, new byte[] {
				1, 0, 1, 0, 0, 1, 0, 0, 0
			}, new byte[] {
				0, 0, 0, 0, 1, 1, 0, 0, 1
			}, new byte[] {
				1, 0, 0, 0, 1, 1, 0, 0, 0
			}, abyte7, new byte[] {
				0, 0, 0, 0, 0, 1, 1, 0, 1
			}, abyte8, new byte[] {
				0, 0, 1, 0, 0, 1, 1, 0, 0
			}, new byte[] {
				0, 0, 0, 0, 1, 1, 1, 0, 0
			}, new byte[] {
				1, 0, 0, 0, 0, 0, 0, 1, 1
			}, new byte[] {
				0, 0, 1, 0, 0, 0, 0, 1, 1
			}, abyte9, new byte[] {
				0, 0, 0, 0, 1, 0, 0, 1, 1
			}, abyte10, abyte11, new byte[] {
				0, 0, 0, 0, 0, 0, 1, 1, 1
			}, new byte[] {
				1, 0, 0, 0, 0, 0, 1, 1, 0
			}, abyte12, new byte[] {
				0, 0, 0, 0, 1, 0, 1, 1, 0
			}, abyte13, abyte14, new byte[] {
				1, 1, 1, 0, 0, 0, 0, 0, 0
			}, abyte15, abyte16, new byte[] {
				0, 1, 1, 0, 1, 0, 0, 0, 0
			}, new byte[] {
				0, 1, 0, 0, 0, 0, 1, 0, 1
			}, abyte17, new byte[] {
				0, 1, 1, 0, 0, 0, 1, 0, 0
			}, abyte18, abyte19, abyte20, new byte[] {
				0, 0, 0, 1, 0, 1, 0, 1, 0
			}, new byte[] {
				0, 1, 0, 0, 1, 0, 1, 0, 0
			}
		});
	//  819 1130:bipush          44
	//  820 1132:anewarray       byte[][]
	//  821 1135:dup             
	//  822 1136:iconst_0        
	//  823 1137:bipush          9
	//  824 1139:newarray        byte[]
	//  825 1141:dup             
	//  826 1142:iconst_0        
	//  827 1143:ldc1            #17  <Int 0>
	//  828 1145:bastore         
	//  829 1146:dup             
	//  830 1147:iconst_1        
	//  831 1148:ldc1            #17  <Int 0>
	//  832 1150:bastore         
	//  833 1151:dup             
	//  834 1152:iconst_2        
	//  835 1153:ldc1            #17  <Int 0>
	//  836 1155:bastore         
	//  837 1156:dup             
	//  838 1157:iconst_3        
	//  839 1158:ldc1            #16  <Int 1>
	//  840 1160:bastore         
	//  841 1161:dup             
	//  842 1162:iconst_4        
	//  843 1163:ldc1            #16  <Int 1>
	//  844 1165:bastore         
	//  845 1166:dup             
	//  846 1167:iconst_5        
	//  847 1168:ldc1            #17  <Int 0>
	//  848 1170:bastore         
	//  849 1171:dup             
	//  850 1172:bipush          6
	//  851 1174:ldc1            #16  <Int 1>
	//  852 1176:bastore         
	//  853 1177:dup             
	//  854 1178:bipush          7
	//  855 1180:ldc1            #17  <Int 0>
	//  856 1182:bastore         
	//  857 1183:dup             
	//  858 1184:bipush          8
	//  859 1186:ldc1            #17  <Int 0>
	//  860 1188:bastore         
	//  861 1189:aastore         
	//  862 1190:dup             
	//  863 1191:iconst_1        
	//  864 1192:aload_0         
	//  865 1193:aastore         
	//  866 1194:dup             
	//  867 1195:iconst_2        
	//  868 1196:aload_1         
	//  869 1197:aastore         
	//  870 1198:dup             
	//  871 1199:iconst_3        
	//  872 1200:bipush          9
	//  873 1202:newarray        byte[]
	//  874 1204:dup             
	//  875 1205:iconst_0        
	//  876 1206:ldc1            #16  <Int 1>
	//  877 1208:bastore         
	//  878 1209:dup             
	//  879 1210:iconst_1        
	//  880 1211:ldc1            #17  <Int 0>
	//  881 1213:bastore         
	//  882 1214:dup             
	//  883 1215:iconst_2        
	//  884 1216:ldc1            #16  <Int 1>
	//  885 1218:bastore         
	//  886 1219:dup             
	//  887 1220:iconst_3        
	//  888 1221:ldc1            #16  <Int 1>
	//  889 1223:bastore         
	//  890 1224:dup             
	//  891 1225:iconst_4        
	//  892 1226:ldc1            #17  <Int 0>
	//  893 1228:bastore         
	//  894 1229:dup             
	//  895 1230:iconst_5        
	//  896 1231:ldc1            #17  <Int 0>
	//  897 1233:bastore         
	//  898 1234:dup             
	//  899 1235:bipush          6
	//  900 1237:ldc1            #17  <Int 0>
	//  901 1239:bastore         
	//  902 1240:dup             
	//  903 1241:bipush          7
	//  904 1243:ldc1            #17  <Int 0>
	//  905 1245:bastore         
	//  906 1246:dup             
	//  907 1247:bipush          8
	//  908 1249:ldc1            #17  <Int 0>
	//  909 1251:bastore         
	//  910 1252:aastore         
	//  911 1253:dup             
	//  912 1254:iconst_4        
	//  913 1255:bipush          9
	//  914 1257:newarray        byte[]
	//  915 1259:dup             
	//  916 1260:iconst_0        
	//  917 1261:ldc1            #17  <Int 0>
	//  918 1263:bastore         
	//  919 1264:dup             
	//  920 1265:iconst_1        
	//  921 1266:ldc1            #17  <Int 0>
	//  922 1268:bastore         
	//  923 1269:dup             
	//  924 1270:iconst_2        
	//  925 1271:ldc1            #17  <Int 0>
	//  926 1273:bastore         
	//  927 1274:dup             
	//  928 1275:iconst_3        
	//  929 1276:ldc1            #16  <Int 1>
	//  930 1278:bastore         
	//  931 1279:dup             
	//  932 1280:iconst_4        
	//  933 1281:ldc1            #16  <Int 1>
	//  934 1283:bastore         
	//  935 1284:dup             
	//  936 1285:iconst_5        
	//  937 1286:ldc1            #17  <Int 0>
	//  938 1288:bastore         
	//  939 1289:dup             
	//  940 1290:bipush          6
	//  941 1292:ldc1            #17  <Int 0>
	//  942 1294:bastore         
	//  943 1295:dup             
	//  944 1296:bipush          7
	//  945 1298:ldc1            #17  <Int 0>
	//  946 1300:bastore         
	//  947 1301:dup             
	//  948 1302:bipush          8
	//  949 1304:ldc1            #16  <Int 1>
	//  950 1306:bastore         
	//  951 1307:aastore         
	//  952 1308:dup             
	//  953 1309:iconst_5        
	//  954 1310:bipush          9
	//  955 1312:newarray        byte[]
	//  956 1314:dup             
	//  957 1315:iconst_0        
	//  958 1316:ldc1            #16  <Int 1>
	//  959 1318:bastore         
	//  960 1319:dup             
	//  961 1320:iconst_1        
	//  962 1321:ldc1            #17  <Int 0>
	//  963 1323:bastore         
	//  964 1324:dup             
	//  965 1325:iconst_2        
	//  966 1326:ldc1            #17  <Int 0>
	//  967 1328:bastore         
	//  968 1329:dup             
	//  969 1330:iconst_3        
	//  970 1331:ldc1            #16  <Int 1>
	//  971 1333:bastore         
	//  972 1334:dup             
	//  973 1335:iconst_4        
	//  974 1336:ldc1            #16  <Int 1>
	//  975 1338:bastore         
	//  976 1339:dup             
	//  977 1340:iconst_5        
	//  978 1341:ldc1            #17  <Int 0>
	//  979 1343:bastore         
	//  980 1344:dup             
	//  981 1345:bipush          6
	//  982 1347:ldc1            #17  <Int 0>
	//  983 1349:bastore         
	//  984 1350:dup             
	//  985 1351:bipush          7
	//  986 1353:ldc1            #17  <Int 0>
	//  987 1355:bastore         
	//  988 1356:dup             
	//  989 1357:bipush          8
	//  990 1359:ldc1            #17  <Int 0>
	//  991 1361:bastore         
	//  992 1362:aastore         
	//  993 1363:dup             
	//  994 1364:bipush          6
	//  995 1366:bipush          9
	//  996 1368:newarray        byte[]
	//  997 1370:dup             
	//  998 1371:iconst_0        
	//  999 1372:ldc1            #17  <Int 0>
	// 1000 1374:bastore         
	// 1001 1375:dup             
	// 1002 1376:iconst_1        
	// 1003 1377:ldc1            #17  <Int 0>
	// 1004 1379:bastore         
	// 1005 1380:dup             
	// 1006 1381:iconst_2        
	// 1007 1382:ldc1            #16  <Int 1>
	// 1008 1384:bastore         
	// 1009 1385:dup             
	// 1010 1386:iconst_3        
	// 1011 1387:ldc1            #16  <Int 1>
	// 1012 1389:bastore         
	// 1013 1390:dup             
	// 1014 1391:iconst_4        
	// 1015 1392:ldc1            #16  <Int 1>
	// 1016 1394:bastore         
	// 1017 1395:dup             
	// 1018 1396:iconst_5        
	// 1019 1397:ldc1            #17  <Int 0>
	// 1020 1399:bastore         
	// 1021 1400:dup             
	// 1022 1401:bipush          6
	// 1023 1403:ldc1            #17  <Int 0>
	// 1024 1405:bastore         
	// 1025 1406:dup             
	// 1026 1407:bipush          7
	// 1027 1409:ldc1            #17  <Int 0>
	// 1028 1411:bastore         
	// 1029 1412:dup             
	// 1030 1413:bipush          8
	// 1031 1415:ldc1            #17  <Int 0>
	// 1032 1417:bastore         
	// 1033 1418:aastore         
	// 1034 1419:dup             
	// 1035 1420:bipush          7
	// 1036 1422:aload_2         
	// 1037 1423:aastore         
	// 1038 1424:dup             
	// 1039 1425:bipush          8
	// 1040 1427:aload_3         
	// 1041 1428:aastore         
	// 1042 1429:dup             
	// 1043 1430:bipush          9
	// 1044 1432:aload           4
	// 1045 1434:aastore         
	// 1046 1435:dup             
	// 1047 1436:bipush          10
	// 1048 1438:aload           5
	// 1049 1440:aastore         
	// 1050 1441:dup             
	// 1051 1442:bipush          11
	// 1052 1444:aload           6
	// 1053 1446:aastore         
	// 1054 1447:dup             
	// 1055 1448:bipush          12
	// 1056 1450:bipush          9
	// 1057 1452:newarray        byte[]
	// 1058 1454:dup             
	// 1059 1455:iconst_0        
	// 1060 1456:ldc1            #16  <Int 1>
	// 1061 1458:bastore         
	// 1062 1459:dup             
	// 1063 1460:iconst_1        
	// 1064 1461:ldc1            #17  <Int 0>
	// 1065 1463:bastore         
	// 1066 1464:dup             
	// 1067 1465:iconst_2        
	// 1068 1466:ldc1            #16  <Int 1>
	// 1069 1468:bastore         
	// 1070 1469:dup             
	// 1071 1470:iconst_3        
	// 1072 1471:ldc1            #17  <Int 0>
	// 1073 1473:bastore         
	// 1074 1474:dup             
	// 1075 1475:iconst_4        
	// 1076 1476:ldc1            #17  <Int 0>
	// 1077 1478:bastore         
	// 1078 1479:dup             
	// 1079 1480:iconst_5        
	// 1080 1481:ldc1            #16  <Int 1>
	// 1081 1483:bastore         
	// 1082 1484:dup             
	// 1083 1485:bipush          6
	// 1084 1487:ldc1            #17  <Int 0>
	// 1085 1489:bastore         
	// 1086 1490:dup             
	// 1087 1491:bipush          7
	// 1088 1493:ldc1            #17  <Int 0>
	// 1089 1495:bastore         
	// 1090 1496:dup             
	// 1091 1497:bipush          8
	// 1092 1499:ldc1            #17  <Int 0>
	// 1093 1501:bastore         
	// 1094 1502:aastore         
	// 1095 1503:dup             
	// 1096 1504:bipush          13
	// 1097 1506:bipush          9
	// 1098 1508:newarray        byte[]
	// 1099 1510:dup             
	// 1100 1511:iconst_0        
	// 1101 1512:ldc1            #17  <Int 0>
	// 1102 1514:bastore         
	// 1103 1515:dup             
	// 1104 1516:iconst_1        
	// 1105 1517:ldc1            #17  <Int 0>
	// 1106 1519:bastore         
	// 1107 1520:dup             
	// 1108 1521:iconst_2        
	// 1109 1522:ldc1            #17  <Int 0>
	// 1110 1524:bastore         
	// 1111 1525:dup             
	// 1112 1526:iconst_3        
	// 1113 1527:ldc1            #17  <Int 0>
	// 1114 1529:bastore         
	// 1115 1530:dup             
	// 1116 1531:iconst_4        
	// 1117 1532:ldc1            #16  <Int 1>
	// 1118 1534:bastore         
	// 1119 1535:dup             
	// 1120 1536:iconst_5        
	// 1121 1537:ldc1            #16  <Int 1>
	// 1122 1539:bastore         
	// 1123 1540:dup             
	// 1124 1541:bipush          6
	// 1125 1543:ldc1            #17  <Int 0>
	// 1126 1545:bastore         
	// 1127 1546:dup             
	// 1128 1547:bipush          7
	// 1129 1549:ldc1            #17  <Int 0>
	// 1130 1551:bastore         
	// 1131 1552:dup             
	// 1132 1553:bipush          8
	// 1133 1555:ldc1            #16  <Int 1>
	// 1134 1557:bastore         
	// 1135 1558:aastore         
	// 1136 1559:dup             
	// 1137 1560:bipush          14
	// 1138 1562:bipush          9
	// 1139 1564:newarray        byte[]
	// 1140 1566:dup             
	// 1141 1567:iconst_0        
	// 1142 1568:ldc1            #16  <Int 1>
	// 1143 1570:bastore         
	// 1144 1571:dup             
	// 1145 1572:iconst_1        
	// 1146 1573:ldc1            #17  <Int 0>
	// 1147 1575:bastore         
	// 1148 1576:dup             
	// 1149 1577:iconst_2        
	// 1150 1578:ldc1            #17  <Int 0>
	// 1151 1580:bastore         
	// 1152 1581:dup             
	// 1153 1582:iconst_3        
	// 1154 1583:ldc1            #17  <Int 0>
	// 1155 1585:bastore         
	// 1156 1586:dup             
	// 1157 1587:iconst_4        
	// 1158 1588:ldc1            #16  <Int 1>
	// 1159 1590:bastore         
	// 1160 1591:dup             
	// 1161 1592:iconst_5        
	// 1162 1593:ldc1            #16  <Int 1>
	// 1163 1595:bastore         
	// 1164 1596:dup             
	// 1165 1597:bipush          6
	// 1166 1599:ldc1            #17  <Int 0>
	// 1167 1601:bastore         
	// 1168 1602:dup             
	// 1169 1603:bipush          7
	// 1170 1605:ldc1            #17  <Int 0>
	// 1171 1607:bastore         
	// 1172 1608:dup             
	// 1173 1609:bipush          8
	// 1174 1611:ldc1            #17  <Int 0>
	// 1175 1613:bastore         
	// 1176 1614:aastore         
	// 1177 1615:dup             
	// 1178 1616:bipush          15
	// 1179 1618:aload           7
	// 1180 1620:aastore         
	// 1181 1621:dup             
	// 1182 1622:bipush          16
	// 1183 1624:bipush          9
	// 1184 1626:newarray        byte[]
	// 1185 1628:dup             
	// 1186 1629:iconst_0        
	// 1187 1630:ldc1            #17  <Int 0>
	// 1188 1632:bastore         
	// 1189 1633:dup             
	// 1190 1634:iconst_1        
	// 1191 1635:ldc1            #17  <Int 0>
	// 1192 1637:bastore         
	// 1193 1638:dup             
	// 1194 1639:iconst_2        
	// 1195 1640:ldc1            #17  <Int 0>
	// 1196 1642:bastore         
	// 1197 1643:dup             
	// 1198 1644:iconst_3        
	// 1199 1645:ldc1            #17  <Int 0>
	// 1200 1647:bastore         
	// 1201 1648:dup             
	// 1202 1649:iconst_4        
	// 1203 1650:ldc1            #17  <Int 0>
	// 1204 1652:bastore         
	// 1205 1653:dup             
	// 1206 1654:iconst_5        
	// 1207 1655:ldc1            #16  <Int 1>
	// 1208 1657:bastore         
	// 1209 1658:dup             
	// 1210 1659:bipush          6
	// 1211 1661:ldc1            #16  <Int 1>
	// 1212 1663:bastore         
	// 1213 1664:dup             
	// 1214 1665:bipush          7
	// 1215 1667:ldc1            #17  <Int 0>
	// 1216 1669:bastore         
	// 1217 1670:dup             
	// 1218 1671:bipush          8
	// 1219 1673:ldc1            #16  <Int 1>
	// 1220 1675:bastore         
	// 1221 1676:aastore         
	// 1222 1677:dup             
	// 1223 1678:bipush          17
	// 1224 1680:aload           8
	// 1225 1682:aastore         
	// 1226 1683:dup             
	// 1227 1684:bipush          18
	// 1228 1686:bipush          9
	// 1229 1688:newarray        byte[]
	// 1230 1690:dup             
	// 1231 1691:iconst_0        
	// 1232 1692:ldc1            #17  <Int 0>
	// 1233 1694:bastore         
	// 1234 1695:dup             
	// 1235 1696:iconst_1        
	// 1236 1697:ldc1            #17  <Int 0>
	// 1237 1699:bastore         
	// 1238 1700:dup             
	// 1239 1701:iconst_2        
	// 1240 1702:ldc1            #16  <Int 1>
	// 1241 1704:bastore         
	// 1242 1705:dup             
	// 1243 1706:iconst_3        
	// 1244 1707:ldc1            #17  <Int 0>
	// 1245 1709:bastore         
	// 1246 1710:dup             
	// 1247 1711:iconst_4        
	// 1248 1712:ldc1            #17  <Int 0>
	// 1249 1714:bastore         
	// 1250 1715:dup             
	// 1251 1716:iconst_5        
	// 1252 1717:ldc1            #16  <Int 1>
	// 1253 1719:bastore         
	// 1254 1720:dup             
	// 1255 1721:bipush          6
	// 1256 1723:ldc1            #16  <Int 1>
	// 1257 1725:bastore         
	// 1258 1726:dup             
	// 1259 1727:bipush          7
	// 1260 1729:ldc1            #17  <Int 0>
	// 1261 1731:bastore         
	// 1262 1732:dup             
	// 1263 1733:bipush          8
	// 1264 1735:ldc1            #17  <Int 0>
	// 1265 1737:bastore         
	// 1266 1738:aastore         
	// 1267 1739:dup             
	// 1268 1740:bipush          19
	// 1269 1742:bipush          9
	// 1270 1744:newarray        byte[]
	// 1271 1746:dup             
	// 1272 1747:iconst_0        
	// 1273 1748:ldc1            #17  <Int 0>
	// 1274 1750:bastore         
	// 1275 1751:dup             
	// 1276 1752:iconst_1        
	// 1277 1753:ldc1            #17  <Int 0>
	// 1278 1755:bastore         
	// 1279 1756:dup             
	// 1280 1757:iconst_2        
	// 1281 1758:ldc1            #17  <Int 0>
	// 1282 1760:bastore         
	// 1283 1761:dup             
	// 1284 1762:iconst_3        
	// 1285 1763:ldc1            #17  <Int 0>
	// 1286 1765:bastore         
	// 1287 1766:dup             
	// 1288 1767:iconst_4        
	// 1289 1768:ldc1            #16  <Int 1>
	// 1290 1770:bastore         
	// 1291 1771:dup             
	// 1292 1772:iconst_5        
	// 1293 1773:ldc1            #16  <Int 1>
	// 1294 1775:bastore         
	// 1295 1776:dup             
	// 1296 1777:bipush          6
	// 1297 1779:ldc1            #16  <Int 1>
	// 1298 1781:bastore         
	// 1299 1782:dup             
	// 1300 1783:bipush          7
	// 1301 1785:ldc1            #17  <Int 0>
	// 1302 1787:bastore         
	// 1303 1788:dup             
	// 1304 1789:bipush          8
	// 1305 1791:ldc1            #17  <Int 0>
	// 1306 1793:bastore         
	// 1307 1794:aastore         
	// 1308 1795:dup             
	// 1309 1796:bipush          20
	// 1310 1798:bipush          9
	// 1311 1800:newarray        byte[]
	// 1312 1802:dup             
	// 1313 1803:iconst_0        
	// 1314 1804:ldc1            #16  <Int 1>
	// 1315 1806:bastore         
	// 1316 1807:dup             
	// 1317 1808:iconst_1        
	// 1318 1809:ldc1            #17  <Int 0>
	// 1319 1811:bastore         
	// 1320 1812:dup             
	// 1321 1813:iconst_2        
	// 1322 1814:ldc1            #17  <Int 0>
	// 1323 1816:bastore         
	// 1324 1817:dup             
	// 1325 1818:iconst_3        
	// 1326 1819:ldc1            #17  <Int 0>
	// 1327 1821:bastore         
	// 1328 1822:dup             
	// 1329 1823:iconst_4        
	// 1330 1824:ldc1            #17  <Int 0>
	// 1331 1826:bastore         
	// 1332 1827:dup             
	// 1333 1828:iconst_5        
	// 1334 1829:ldc1            #17  <Int 0>
	// 1335 1831:bastore         
	// 1336 1832:dup             
	// 1337 1833:bipush          6
	// 1338 1835:ldc1            #17  <Int 0>
	// 1339 1837:bastore         
	// 1340 1838:dup             
	// 1341 1839:bipush          7
	// 1342 1841:ldc1            #16  <Int 1>
	// 1343 1843:bastore         
	// 1344 1844:dup             
	// 1345 1845:bipush          8
	// 1346 1847:ldc1            #16  <Int 1>
	// 1347 1849:bastore         
	// 1348 1850:aastore         
	// 1349 1851:dup             
	// 1350 1852:bipush          21
	// 1351 1854:bipush          9
	// 1352 1856:newarray        byte[]
	// 1353 1858:dup             
	// 1354 1859:iconst_0        
	// 1355 1860:ldc1            #17  <Int 0>
	// 1356 1862:bastore         
	// 1357 1863:dup             
	// 1358 1864:iconst_1        
	// 1359 1865:ldc1            #17  <Int 0>
	// 1360 1867:bastore         
	// 1361 1868:dup             
	// 1362 1869:iconst_2        
	// 1363 1870:ldc1            #16  <Int 1>
	// 1364 1872:bastore         
	// 1365 1873:dup             
	// 1366 1874:iconst_3        
	// 1367 1875:ldc1            #17  <Int 0>
	// 1368 1877:bastore         
	// 1369 1878:dup             
	// 1370 1879:iconst_4        
	// 1371 1880:ldc1            #17  <Int 0>
	// 1372 1882:bastore         
	// 1373 1883:dup             
	// 1374 1884:iconst_5        
	// 1375 1885:ldc1            #17  <Int 0>
	// 1376 1887:bastore         
	// 1377 1888:dup             
	// 1378 1889:bipush          6
	// 1379 1891:ldc1            #17  <Int 0>
	// 1380 1893:bastore         
	// 1381 1894:dup             
	// 1382 1895:bipush          7
	// 1383 1897:ldc1            #16  <Int 1>
	// 1384 1899:bastore         
	// 1385 1900:dup             
	// 1386 1901:bipush          8
	// 1387 1903:ldc1            #16  <Int 1>
	// 1388 1905:bastore         
	// 1389 1906:aastore         
	// 1390 1907:dup             
	// 1391 1908:bipush          22
	// 1392 1910:aload           9
	// 1393 1912:aastore         
	// 1394 1913:dup             
	// 1395 1914:bipush          23
	// 1396 1916:bipush          9
	// 1397 1918:newarray        byte[]
	// 1398 1920:dup             
	// 1399 1921:iconst_0        
	// 1400 1922:ldc1            #17  <Int 0>
	// 1401 1924:bastore         
	// 1402 1925:dup             
	// 1403 1926:iconst_1        
	// 1404 1927:ldc1            #17  <Int 0>
	// 1405 1929:bastore         
	// 1406 1930:dup             
	// 1407 1931:iconst_2        
	// 1408 1932:ldc1            #17  <Int 0>
	// 1409 1934:bastore         
	// 1410 1935:dup             
	// 1411 1936:iconst_3        
	// 1412 1937:ldc1            #17  <Int 0>
	// 1413 1939:bastore         
	// 1414 1940:dup             
	// 1415 1941:iconst_4        
	// 1416 1942:ldc1            #16  <Int 1>
	// 1417 1944:bastore         
	// 1418 1945:dup             
	// 1419 1946:iconst_5        
	// 1420 1947:ldc1            #17  <Int 0>
	// 1421 1949:bastore         
	// 1422 1950:dup             
	// 1423 1951:bipush          6
	// 1424 1953:ldc1            #17  <Int 0>
	// 1425 1955:bastore         
	// 1426 1956:dup             
	// 1427 1957:bipush          7
	// 1428 1959:ldc1            #16  <Int 1>
	// 1429 1961:bastore         
	// 1430 1962:dup             
	// 1431 1963:bipush          8
	// 1432 1965:ldc1            #16  <Int 1>
	// 1433 1967:bastore         
	// 1434 1968:aastore         
	// 1435 1969:dup             
	// 1436 1970:bipush          24
	// 1437 1972:aload           10
	// 1438 1974:aastore         
	// 1439 1975:dup             
	// 1440 1976:bipush          25
	// 1441 1978:aload           11
	// 1442 1980:aastore         
	// 1443 1981:dup             
	// 1444 1982:bipush          26
	// 1445 1984:bipush          9
	// 1446 1986:newarray        byte[]
	// 1447 1988:dup             
	// 1448 1989:iconst_0        
	// 1449 1990:ldc1            #17  <Int 0>
	// 1450 1992:bastore         
	// 1451 1993:dup             
	// 1452 1994:iconst_1        
	// 1453 1995:ldc1            #17  <Int 0>
	// 1454 1997:bastore         
	// 1455 1998:dup             
	// 1456 1999:iconst_2        
	// 1457 2000:ldc1            #17  <Int 0>
	// 1458 2002:bastore         
	// 1459 2003:dup             
	// 1460 2004:iconst_3        
	// 1461 2005:ldc1            #17  <Int 0>
	// 1462 2007:bastore         
	// 1463 2008:dup             
	// 1464 2009:iconst_4        
	// 1465 2010:ldc1            #17  <Int 0>
	// 1466 2012:bastore         
	// 1467 2013:dup             
	// 1468 2014:iconst_5        
	// 1469 2015:ldc1            #17  <Int 0>
	// 1470 2017:bastore         
	// 1471 2018:dup             
	// 1472 2019:bipush          6
	// 1473 2021:ldc1            #16  <Int 1>
	// 1474 2023:bastore         
	// 1475 2024:dup             
	// 1476 2025:bipush          7
	// 1477 2027:ldc1            #16  <Int 1>
	// 1478 2029:bastore         
	// 1479 2030:dup             
	// 1480 2031:bipush          8
	// 1481 2033:ldc1            #16  <Int 1>
	// 1482 2035:bastore         
	// 1483 2036:aastore         
	// 1484 2037:dup             
	// 1485 2038:bipush          27
	// 1486 2040:bipush          9
	// 1487 2042:newarray        byte[]
	// 1488 2044:dup             
	// 1489 2045:iconst_0        
	// 1490 2046:ldc1            #16  <Int 1>
	// 1491 2048:bastore         
	// 1492 2049:dup             
	// 1493 2050:iconst_1        
	// 1494 2051:ldc1            #17  <Int 0>
	// 1495 2053:bastore         
	// 1496 2054:dup             
	// 1497 2055:iconst_2        
	// 1498 2056:ldc1            #17  <Int 0>
	// 1499 2058:bastore         
	// 1500 2059:dup             
	// 1501 2060:iconst_3        
	// 1502 2061:ldc1            #17  <Int 0>
	// 1503 2063:bastore         
	// 1504 2064:dup             
	// 1505 2065:iconst_4        
	// 1506 2066:ldc1            #17  <Int 0>
	// 1507 2068:bastore         
	// 1508 2069:dup             
	// 1509 2070:iconst_5        
	// 1510 2071:ldc1            #17  <Int 0>
	// 1511 2073:bastore         
	// 1512 2074:dup             
	// 1513 2075:bipush          6
	// 1514 2077:ldc1            #16  <Int 1>
	// 1515 2079:bastore         
	// 1516 2080:dup             
	// 1517 2081:bipush          7
	// 1518 2083:ldc1            #16  <Int 1>
	// 1519 2085:bastore         
	// 1520 2086:dup             
	// 1521 2087:bipush          8
	// 1522 2089:ldc1            #17  <Int 0>
	// 1523 2091:bastore         
	// 1524 2092:aastore         
	// 1525 2093:dup             
	// 1526 2094:bipush          28
	// 1527 2096:aload           12
	// 1528 2098:aastore         
	// 1529 2099:dup             
	// 1530 2100:bipush          29
	// 1531 2102:bipush          9
	// 1532 2104:newarray        byte[]
	// 1533 2106:dup             
	// 1534 2107:iconst_0        
	// 1535 2108:ldc1            #17  <Int 0>
	// 1536 2110:bastore         
	// 1537 2111:dup             
	// 1538 2112:iconst_1        
	// 1539 2113:ldc1            #17  <Int 0>
	// 1540 2115:bastore         
	// 1541 2116:dup             
	// 1542 2117:iconst_2        
	// 1543 2118:ldc1            #17  <Int 0>
	// 1544 2120:bastore         
	// 1545 2121:dup             
	// 1546 2122:iconst_3        
	// 1547 2123:ldc1            #17  <Int 0>
	// 1548 2125:bastore         
	// 1549 2126:dup             
	// 1550 2127:iconst_4        
	// 1551 2128:ldc1            #16  <Int 1>
	// 1552 2130:bastore         
	// 1553 2131:dup             
	// 1554 2132:iconst_5        
	// 1555 2133:ldc1            #17  <Int 0>
	// 1556 2135:bastore         
	// 1557 2136:dup             
	// 1558 2137:bipush          6
	// 1559 2139:ldc1            #16  <Int 1>
	// 1560 2141:bastore         
	// 1561 2142:dup             
	// 1562 2143:bipush          7
	// 1563 2145:ldc1            #16  <Int 1>
	// 1564 2147:bastore         
	// 1565 2148:dup             
	// 1566 2149:bipush          8
	// 1567 2151:ldc1            #17  <Int 0>
	// 1568 2153:bastore         
	// 1569 2154:aastore         
	// 1570 2155:dup             
	// 1571 2156:bipush          30
	// 1572 2158:aload           13
	// 1573 2160:aastore         
	// 1574 2161:dup             
	// 1575 2162:bipush          31
	// 1576 2164:aload           14
	// 1577 2166:aastore         
	// 1578 2167:dup             
	// 1579 2168:bipush          32
	// 1580 2170:bipush          9
	// 1581 2172:newarray        byte[]
	// 1582 2174:dup             
	// 1583 2175:iconst_0        
	// 1584 2176:ldc1            #16  <Int 1>
	// 1585 2178:bastore         
	// 1586 2179:dup             
	// 1587 2180:iconst_1        
	// 1588 2181:ldc1            #16  <Int 1>
	// 1589 2183:bastore         
	// 1590 2184:dup             
	// 1591 2185:iconst_2        
	// 1592 2186:ldc1            #16  <Int 1>
	// 1593 2188:bastore         
	// 1594 2189:dup             
	// 1595 2190:iconst_3        
	// 1596 2191:ldc1            #17  <Int 0>
	// 1597 2193:bastore         
	// 1598 2194:dup             
	// 1599 2195:iconst_4        
	// 1600 2196:ldc1            #17  <Int 0>
	// 1601 2198:bastore         
	// 1602 2199:dup             
	// 1603 2200:iconst_5        
	// 1604 2201:ldc1            #17  <Int 0>
	// 1605 2203:bastore         
	// 1606 2204:dup             
	// 1607 2205:bipush          6
	// 1608 2207:ldc1            #17  <Int 0>
	// 1609 2209:bastore         
	// 1610 2210:dup             
	// 1611 2211:bipush          7
	// 1612 2213:ldc1            #17  <Int 0>
	// 1613 2215:bastore         
	// 1614 2216:dup             
	// 1615 2217:bipush          8
	// 1616 2219:ldc1            #17  <Int 0>
	// 1617 2221:bastore         
	// 1618 2222:aastore         
	// 1619 2223:dup             
	// 1620 2224:bipush          33
	// 1621 2226:aload           15
	// 1622 2228:aastore         
	// 1623 2229:dup             
	// 1624 2230:bipush          34
	// 1625 2232:aload           16
	// 1626 2234:aastore         
	// 1627 2235:dup             
	// 1628 2236:bipush          35
	// 1629 2238:bipush          9
	// 1630 2240:newarray        byte[]
	// 1631 2242:dup             
	// 1632 2243:iconst_0        
	// 1633 2244:ldc1            #17  <Int 0>
	// 1634 2246:bastore         
	// 1635 2247:dup             
	// 1636 2248:iconst_1        
	// 1637 2249:ldc1            #16  <Int 1>
	// 1638 2251:bastore         
	// 1639 2252:dup             
	// 1640 2253:iconst_2        
	// 1641 2254:ldc1            #16  <Int 1>
	// 1642 2256:bastore         
	// 1643 2257:dup             
	// 1644 2258:iconst_3        
	// 1645 2259:ldc1            #17  <Int 0>
	// 1646 2261:bastore         
	// 1647 2262:dup             
	// 1648 2263:iconst_4        
	// 1649 2264:ldc1            #16  <Int 1>
	// 1650 2266:bastore         
	// 1651 2267:dup             
	// 1652 2268:iconst_5        
	// 1653 2269:ldc1            #17  <Int 0>
	// 1654 2271:bastore         
	// 1655 2272:dup             
	// 1656 2273:bipush          6
	// 1657 2275:ldc1            #17  <Int 0>
	// 1658 2277:bastore         
	// 1659 2278:dup             
	// 1660 2279:bipush          7
	// 1661 2281:ldc1            #17  <Int 0>
	// 1662 2283:bastore         
	// 1663 2284:dup             
	// 1664 2285:bipush          8
	// 1665 2287:ldc1            #17  <Int 0>
	// 1666 2289:bastore         
	// 1667 2290:aastore         
	// 1668 2291:dup             
	// 1669 2292:bipush          36
	// 1670 2294:bipush          9
	// 1671 2296:newarray        byte[]
	// 1672 2298:dup             
	// 1673 2299:iconst_0        
	// 1674 2300:ldc1            #17  <Int 0>
	// 1675 2302:bastore         
	// 1676 2303:dup             
	// 1677 2304:iconst_1        
	// 1678 2305:ldc1            #16  <Int 1>
	// 1679 2307:bastore         
	// 1680 2308:dup             
	// 1681 2309:iconst_2        
	// 1682 2310:ldc1            #17  <Int 0>
	// 1683 2312:bastore         
	// 1684 2313:dup             
	// 1685 2314:iconst_3        
	// 1686 2315:ldc1            #17  <Int 0>
	// 1687 2317:bastore         
	// 1688 2318:dup             
	// 1689 2319:iconst_4        
	// 1690 2320:ldc1            #17  <Int 0>
	// 1691 2322:bastore         
	// 1692 2323:dup             
	// 1693 2324:iconst_5        
	// 1694 2325:ldc1            #17  <Int 0>
	// 1695 2327:bastore         
	// 1696 2328:dup             
	// 1697 2329:bipush          6
	// 1698 2331:ldc1            #16  <Int 1>
	// 1699 2333:bastore         
	// 1700 2334:dup             
	// 1701 2335:bipush          7
	// 1702 2337:ldc1            #17  <Int 0>
	// 1703 2339:bastore         
	// 1704 2340:dup             
	// 1705 2341:bipush          8
	// 1706 2343:ldc1            #16  <Int 1>
	// 1707 2345:bastore         
	// 1708 2346:aastore         
	// 1709 2347:dup             
	// 1710 2348:bipush          37
	// 1711 2350:aload           17
	// 1712 2352:aastore         
	// 1713 2353:dup             
	// 1714 2354:bipush          38
	// 1715 2356:bipush          9
	// 1716 2358:newarray        byte[]
	// 1717 2360:dup             
	// 1718 2361:iconst_0        
	// 1719 2362:ldc1            #17  <Int 0>
	// 1720 2364:bastore         
	// 1721 2365:dup             
	// 1722 2366:iconst_1        
	// 1723 2367:ldc1            #16  <Int 1>
	// 1724 2369:bastore         
	// 1725 2370:dup             
	// 1726 2371:iconst_2        
	// 1727 2372:ldc1            #16  <Int 1>
	// 1728 2374:bastore         
	// 1729 2375:dup             
	// 1730 2376:iconst_3        
	// 1731 2377:ldc1            #17  <Int 0>
	// 1732 2379:bastore         
	// 1733 2380:dup             
	// 1734 2381:iconst_4        
	// 1735 2382:ldc1            #17  <Int 0>
	// 1736 2384:bastore         
	// 1737 2385:dup             
	// 1738 2386:iconst_5        
	// 1739 2387:ldc1            #17  <Int 0>
	// 1740 2389:bastore         
	// 1741 2390:dup             
	// 1742 2391:bipush          6
	// 1743 2393:ldc1            #16  <Int 1>
	// 1744 2395:bastore         
	// 1745 2396:dup             
	// 1746 2397:bipush          7
	// 1747 2399:ldc1            #17  <Int 0>
	// 1748 2401:bastore         
	// 1749 2402:dup             
	// 1750 2403:bipush          8
	// 1751 2405:ldc1            #17  <Int 0>
	// 1752 2407:bastore         
	// 1753 2408:aastore         
	// 1754 2409:dup             
	// 1755 2410:bipush          39
	// 1756 2412:aload           18
	// 1757 2414:aastore         
	// 1758 2415:dup             
	// 1759 2416:bipush          40
	// 1760 2418:aload           19
	// 1761 2420:aastore         
	// 1762 2421:dup             
	// 1763 2422:bipush          41
	// 1764 2424:aload           20
	// 1765 2426:aastore         
	// 1766 2427:dup             
	// 1767 2428:bipush          42
	// 1768 2430:bipush          9
	// 1769 2432:newarray        byte[]
	// 1770 2434:dup             
	// 1771 2435:iconst_0        
	// 1772 2436:ldc1            #17  <Int 0>
	// 1773 2438:bastore         
	// 1774 2439:dup             
	// 1775 2440:iconst_1        
	// 1776 2441:ldc1            #17  <Int 0>
	// 1777 2443:bastore         
	// 1778 2444:dup             
	// 1779 2445:iconst_2        
	// 1780 2446:ldc1            #17  <Int 0>
	// 1781 2448:bastore         
	// 1782 2449:dup             
	// 1783 2450:iconst_3        
	// 1784 2451:ldc1            #16  <Int 1>
	// 1785 2453:bastore         
	// 1786 2454:dup             
	// 1787 2455:iconst_4        
	// 1788 2456:ldc1            #17  <Int 0>
	// 1789 2458:bastore         
	// 1790 2459:dup             
	// 1791 2460:iconst_5        
	// 1792 2461:ldc1            #16  <Int 1>
	// 1793 2463:bastore         
	// 1794 2464:dup             
	// 1795 2465:bipush          6
	// 1796 2467:ldc1            #17  <Int 0>
	// 1797 2469:bastore         
	// 1798 2470:dup             
	// 1799 2471:bipush          7
	// 1800 2473:ldc1            #16  <Int 1>
	// 1801 2475:bastore         
	// 1802 2476:dup             
	// 1803 2477:bipush          8
	// 1804 2479:ldc1            #17  <Int 0>
	// 1805 2481:bastore         
	// 1806 2482:aastore         
	// 1807 2483:dup             
	// 1808 2484:bipush          43
	// 1809 2486:bipush          9
	// 1810 2488:newarray        byte[]
	// 1811 2490:dup             
	// 1812 2491:iconst_0        
	// 1813 2492:ldc1            #17  <Int 0>
	// 1814 2494:bastore         
	// 1815 2495:dup             
	// 1816 2496:iconst_1        
	// 1817 2497:ldc1            #16  <Int 1>
	// 1818 2499:bastore         
	// 1819 2500:dup             
	// 1820 2501:iconst_2        
	// 1821 2502:ldc1            #17  <Int 0>
	// 1822 2504:bastore         
	// 1823 2505:dup             
	// 1824 2506:iconst_3        
	// 1825 2507:ldc1            #17  <Int 0>
	// 1826 2509:bastore         
	// 1827 2510:dup             
	// 1828 2511:iconst_4        
	// 1829 2512:ldc1            #16  <Int 1>
	// 1830 2514:bastore         
	// 1831 2515:dup             
	// 1832 2516:iconst_5        
	// 1833 2517:ldc1            #17  <Int 0>
	// 1834 2519:bastore         
	// 1835 2520:dup             
	// 1836 2521:bipush          6
	// 1837 2523:ldc1            #16  <Int 1>
	// 1838 2525:bastore         
	// 1839 2526:dup             
	// 1840 2527:bipush          7
	// 1841 2529:ldc1            #17  <Int 0>
	// 1842 2531:bastore         
	// 1843 2532:dup             
	// 1844 2533:bipush          8
	// 1845 2535:ldc1            #17  <Int 0>
	// 1846 2537:bastore         
	// 1847 2538:aastore         
	// 1848 2539:putstatic       #21  <Field byte[][] BARS>
	//*1849 2542:return          
	}
}
