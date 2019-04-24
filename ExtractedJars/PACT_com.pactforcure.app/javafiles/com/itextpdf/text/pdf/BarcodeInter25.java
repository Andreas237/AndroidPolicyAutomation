// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, BaseFont, PdfContentByte

public class BarcodeInter25 extends Barcode
{

	public BarcodeInter25()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Barcode()>
		try
		{
			x = 0.8F;
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <Float 0.8F>
	//    4    7:putfield        #25  <Field float x>
			n = 2.0F;
	//    5   10:aload_0         
	//    6   11:fconst_2        
	//    7   12:putfield        #28  <Field float n>
			font = BaseFont.createFont("Helvetica", "winansi", false);
	//    8   15:aload_0         
	//    9   16:ldc1            #30  <String "Helvetica">
	//   10   18:ldc1            #32  <String "winansi">
	//   11   20:iconst_0        
	//   12   21:invokestatic    #38  <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   13   24:putfield        #42  <Field BaseFont font>
			size = 8F;
	//   14   27:aload_0         
	//   15   28:ldc1            #43  <Float 8F>
	//   16   30:putfield        #46  <Field float size>
			baseline = size;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #46  <Field float size>
	//   20   38:putfield        #49  <Field float baseline>
			barHeight = size * 3F;
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #46  <Field float size>
	//   24   46:ldc1            #50  <Float 3F>
	//   25   48:fmul            
	//   26   49:putfield        #53  <Field float barHeight>
			textAlignment = 1;
	//   27   52:aload_0         
	//   28   53:iconst_1        
	//   29   54:putfield        #57  <Field int textAlignment>
			generateChecksum = false;
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:putfield        #61  <Field boolean generateChecksum>
			checksumText = false;
	//   33   62:aload_0         
	//   34   63:iconst_0        
	//   35   64:putfield        #64  <Field boolean checksumText>
			return;
	//   36   67:return          
		}
		catch(Exception exception)
	//*  37   68:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   38   69:new             #66  <Class ExceptionConverter>
	//   39   72:dup             
	//   40   73:aload_1         
	//   41   74:invokespecial   #69  <Method void ExceptionConverter(Exception)>
	//   42   77:athrow          
		}
	}

	public static byte[] getBarsInter25(String s)
	{
		s = keepNumbers(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #75  <Method String keepNumbers(String)>
	//    2    4:astore_0        
		if((s.length() & 1) != 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #81  <Method int String.length()>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:ifeq            31
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.text.length.must.be.even", new Object[0]));
	//    8   14:new             #83  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #85  <String "the.text.length.must.be.even">
	//   11   20:iconst_0        
	//   12   21:anewarray       Object[]
	//   13   24:invokestatic    #93  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   27:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   15   30:athrow          
		byte abyte0[] = new byte[s.length() * 5 + 7];
	//   16   31:aload_0         
	//   17   32:invokevirtual   #81  <Method int String.length()>
	//   18   35:iconst_5        
	//   19   36:imul            
	//   20   37:bipush          7
	//   21   39:iadd            
	//   22   40:newarray        byte[]
	//   23   42:astore          6
		int j = 0 + 1;
	//   24   44:iconst_0        
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_2        
		abyte0[0] = 0;
	//   28   48:aload           6
	//   29   50:iconst_0        
	//   30   51:iconst_0        
	//   31   52:bastore         
		int i = j + 1;
	//   32   53:iload_2         
	//   33   54:iconst_1        
	//   34   55:iadd            
	//   35   56:istore_1        
		abyte0[j] = 0;
	//   36   57:aload           6
	//   37   59:iload_2         
	//   38   60:iconst_0        
	//   39   61:bastore         
		j = i + 1;
	//   40   62:iload_1         
	//   41   63:iconst_1        
	//   42   64:iadd            
	//   43   65:istore_2        
		abyte0[i] = 0;
	//   44   66:aload           6
	//   45   68:iload_1         
	//   46   69:iconst_0        
	//   47   70:bastore         
		abyte0[j] = 0;
	//   48   71:aload           6
	//   49   73:iload_2         
	//   50   74:iconst_0        
	//   51   75:bastore         
		int l = s.length() / 2;
	//   52   76:aload_0         
	//   53   77:invokevirtual   #81  <Method int String.length()>
	//   54   80:iconst_2        
	//   55   81:idiv            
	//   56   82:istore          4
		i = 0;
	//   57   84:iconst_0        
	//   58   85:istore_1        
		j++;
	//   59   86:iload_2         
	//   60   87:iconst_1        
	//   61   88:iadd            
	//   62   89:istore_2        
		for(; i < l; i++)
	//*  63   90:iload_1         
	//*  64   91:iload           4
	//*  65   93:icmpge          184
		{
			char c = s.charAt(i * 2);
	//   66   96:aload_0         
	//   67   97:iload_1         
	//   68   98:iconst_2        
	//   69   99:imul            
	//   70  100:invokevirtual   #100 <Method char String.charAt(int)>
	//   71  103:istore_3        
			char c1 = s.charAt(i * 2 + 1);
	//   72  104:aload_0         
	//   73  105:iload_1         
	//   74  106:iconst_2        
	//   75  107:imul            
	//   76  108:iconst_1        
	//   77  109:iadd            
	//   78  110:invokevirtual   #100 <Method char String.charAt(int)>
	//   79  113:istore          5
			byte abyte1[] = BARS[c - 48];
	//   80  115:getstatic       #14  <Field byte[][] BARS>
	//   81  118:iload_3         
	//   82  119:bipush          48
	//   83  121:isub            
	//   84  122:aaload          
	//   85  123:astore          7
			byte abyte2[] = BARS[c1 - 48];
	//   86  125:getstatic       #14  <Field byte[][] BARS>
	//   87  128:iload           5
	//   88  130:bipush          48
	//   89  132:isub            
	//   90  133:aaload          
	//   91  134:astore          8
			for(int k = 0; k < 5; k++)
	//*  92  136:iconst_0        
	//*  93  137:istore_3        
	//*  94  138:iload_3         
	//*  95  139:iconst_5        
	//*  96  140:icmpge          177
			{
				int i1 = j + 1;
	//   97  143:iload_2         
	//   98  144:iconst_1        
	//   99  145:iadd            
	//  100  146:istore          5
				abyte0[j] = abyte1[k];
	//  101  148:aload           6
	//  102  150:iload_2         
	//  103  151:aload           7
	//  104  153:iload_3         
	//  105  154:baload          
	//  106  155:bastore         
				j = i1 + 1;
	//  107  156:iload           5
	//  108  158:iconst_1        
	//  109  159:iadd            
	//  110  160:istore_2        
				abyte0[i1] = abyte2[k];
	//  111  161:aload           6
	//  112  163:iload           5
	//  113  165:aload           8
	//  114  167:iload_3         
	//  115  168:baload          
	//  116  169:bastore         
			}

	//  117  170:iload_3         
	//  118  171:iconst_1        
	//  119  172:iadd            
	//  120  173:istore_3        
		}

	//  121  174:goto            138
	//  122  177:iload_1         
	//  123  178:iconst_1        
	//  124  179:iadd            
	//  125  180:istore_1        
	//* 126  181:goto            90
		i = j + 1;
	//  127  184:iload_2         
	//  128  185:iconst_1        
	//  129  186:iadd            
	//  130  187:istore_1        
		abyte0[j] = 1;
	//  131  188:aload           6
	//  132  190:iload_2         
	//  133  191:iconst_1        
	//  134  192:bastore         
		j = i + 1;
	//  135  193:iload_1         
	//  136  194:iconst_1        
	//  137  195:iadd            
	//  138  196:istore_2        
		abyte0[i] = 0;
	//  139  197:aload           6
	//  140  199:iload_1         
	//  141  200:iconst_0        
	//  142  201:bastore         
		abyte0[j] = 0;
	//  143  202:aload           6
	//  144  204:iload_2         
	//  145  205:iconst_0        
	//  146  206:bastore         
		return abyte0;
	//  147  207:aload           6
	//  148  209:areturn         
	}

	public static char getChecksum(String s)
	{
		int j = 3;
	//    0    0:iconst_3        
	//    1    1:istore_2        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		for(int i = s.length() - 1; i >= 0; i--)
	//*   4    4:aload_0         
	//*   5    5:invokevirtual   #81  <Method int String.length()>
	//*   6    8:iconst_1        
	//*   7    9:isub            
	//*   8   10:istore_1        
	//*   9   11:iload_1         
	//*  10   12:iflt            39
		{
			k += j * (s.charAt(i) - 48);
	//   11   15:iload_3         
	//   12   16:iload_2         
	//   13   17:aload_0         
	//   14   18:iload_1         
	//   15   19:invokevirtual   #100 <Method char String.charAt(int)>
	//   16   22:bipush          48
	//   17   24:isub            
	//   18   25:imul            
	//   19   26:iadd            
	//   20   27:istore_3        
			j ^= 2;
	//   21   28:iload_2         
	//   22   29:iconst_2        
	//   23   30:ixor            
	//   24   31:istore_2        
		}

	//   25   32:iload_1         
	//   26   33:iconst_1        
	//   27   34:isub            
	//   28   35:istore_1        
	//*  29   36:goto            11
		return (char)((10 - k % 10) % 10 + 48);
	//   30   39:bipush          10
	//   31   41:iload_3         
	//   32   42:bipush          10
	//   33   44:irem            
	//   34   45:isub            
	//   35   46:bipush          10
	//   36   48:irem            
	//   37   49:bipush          48
	//   38   51:iadd            
	//   39   52:int2char        
	//   40   53:ireturn         
	}

	public static String keepNumbers(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #104 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void StringBuffer()>
	//    3    7:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #81  <Method int String.length()>
	//*   9   15:icmpge          49
		{
			char c = s.charAt(i);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #100 <Method char String.charAt(int)>
	//   13   23:istore_1        
			if(c >= '0' && c <= '9')
	//*  14   24:iload_1         
	//*  15   25:bipush          48
	//*  16   27:icmplt          42
	//*  17   30:iload_1         
	//*  18   31:bipush          57
	//*  19   33:icmpgt          42
				stringbuffer.append(c);
	//   20   36:aload_3         
	//   21   37:iload_1         
	//   22   38:invokevirtual   #109 <Method StringBuffer StringBuffer.append(char)>
	//   23   41:pop             
		}

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            10
		return stringbuffer.toString();
	//   29   49:aload_3         
	//   30   50:invokevirtual   #113 <Method String StringBuffer.toString()>
	//   31   53:areturn         
	}

	public Rectangle getBarcodeSize()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		float f1 = 0.0F;
	//    2    2:fconst_0        
	//    3    3:fstore_2        
		if(font != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #42  <Field BaseFont font>
	//*   6    8:ifnull          126
		{
			float f2;
			int i;
			int j;
			String s;
			Object obj;
			if(baseline > 0.0F)
	//*   7   11:aload_0         
	//*   8   12:getfield        #49  <Field float baseline>
	//*   9   15:fconst_0        
	//*  10   16:fcmpl           
	//*  11   17:ifle            209
				f = baseline - font.getFontDescriptor(3, size);
	//   12   20:aload_0         
	//   13   21:getfield        #49  <Field float baseline>
	//   14   24:aload_0         
	//   15   25:getfield        #42  <Field BaseFont font>
	//   16   28:iconst_3        
	//   17   29:aload_0         
	//   18   30:getfield        #46  <Field float size>
	//   19   33:invokevirtual   #119 <Method float BaseFont.getFontDescriptor(int, float)>
	//   20   36:fsub            
	//   21   37:fstore_1        
			else
	//*  22   38:aload_0         
	//*  23   39:getfield        #123 <Field String code>
	//*  24   42:astore          7
	//*  25   44:aload           7
	//*  26   46:astore          6
	//*  27   48:aload_0         
	//*  28   49:getfield        #61  <Field boolean generateChecksum>
	//*  29   52:ifeq            91
	//*  30   55:aload           7
	//*  31   57:astore          6
	//*  32   59:aload_0         
	//*  33   60:getfield        #64  <Field boolean checksumText>
	//*  34   63:ifeq            91
	//*  35   66:new             #125 <Class StringBuilder>
	//*  36   69:dup             
	//*  37   70:invokespecial   #126 <Method void StringBuilder()>
	//*  38   73:aload           7
	//*  39   75:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//*  40   78:aload           7
	//*  41   80:invokestatic    #131 <Method char getChecksum(String)>
	//*  42   83:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//*  43   86:invokevirtual   #135 <Method String StringBuilder.toString()>
	//*  44   89:astore          6
	//*  45   91:aload_0         
	//*  46   92:getfield        #42  <Field BaseFont font>
	//*  47   95:astore          7
	//*  48   97:aload_0         
	//*  49   98:getfield        #138 <Field String altText>
	//*  50  101:ifnull          110
	//*  51  104:aload_0         
	//*  52  105:getfield        #138 <Field String altText>
	//*  53  108:astore          6
	//*  54  110:aload           7
	//*  55  112:aload           6
	//*  56  114:aload_0         
	//*  57  115:getfield        #46  <Field float size>
	//*  58  118:invokevirtual   #142 <Method float BaseFont.getWidthPoint(String, float)>
	//*  59  121:fstore_3        
	//*  60  122:fload_1         
	//*  61  123:fstore_2        
	//*  62  124:fload_3         
	//*  63  125:fstore_1        
	//*  64  126:aload_0         
	//*  65  127:getfield        #123 <Field String code>
	//*  66  130:invokestatic    #75  <Method String keepNumbers(String)>
	//*  67  133:invokevirtual   #81  <Method int String.length()>
	//*  68  136:istore          5
	//*  69  138:iload           5
	//*  70  140:istore          4
	//*  71  142:aload_0         
	//*  72  143:getfield        #61  <Field boolean generateChecksum>
	//*  73  146:ifeq            155
	//*  74  149:iload           5
	//*  75  151:iconst_1        
	//*  76  152:iadd            
	//*  77  153:istore          4
	//*  78  155:new             #144 <Class Rectangle>
	//*  79  158:dup             
	//*  80  159:iload           4
	//*  81  161:i2f             
	//*  82  162:ldc1            #50  <Float 3F>
	//*  83  164:aload_0         
	//*  84  165:getfield        #25  <Field float x>
	//*  85  168:fmul            
	//*  86  169:fconst_2        
	//*  87  170:aload_0         
	//*  88  171:getfield        #25  <Field float x>
	//*  89  174:fmul            
	//*  90  175:aload_0         
	//*  91  176:getfield        #28  <Field float n>
	//*  92  179:fmul            
	//*  93  180:fadd            
	//*  94  181:fmul            
	//*  95  182:ldc1            #145 <Float 6F>
	//*  96  184:aload_0         
	//*  97  185:getfield        #28  <Field float n>
	//*  98  188:fadd            
	//*  99  189:aload_0         
	//* 100  190:getfield        #25  <Field float x>
	//* 101  193:fmul            
	//* 102  194:fadd            
	//* 103  195:fload_1         
	//* 104  196:invokestatic    #151 <Method float Math.max(float, float)>
	//* 105  199:aload_0         
	//* 106  200:getfield        #53  <Field float barHeight>
	//* 107  203:fload_2         
	//* 108  204:fadd            
	//* 109  205:invokespecial   #154 <Method void Rectangle(float, float)>
	//* 110  208:areturn         
				f = -baseline + size;
	//  111  209:aload_0         
	//  112  210:getfield        #49  <Field float baseline>
	//  113  213:fneg            
	//  114  214:aload_0         
	//  115  215:getfield        #46  <Field float size>
	//  116  218:fadd            
	//  117  219:fstore_1        
			obj = ((Object) (code));
			s = ((String) (obj));
			if(generateChecksum)
			{
				s = ((String) (obj));
				if(checksumText)
					s = (new StringBuilder()).append(((String) (obj))).append(getChecksum(((String) (obj)))).toString();
			}
			obj = ((Object) (font));
			if(altText != null)
				s = altText;
			f2 = ((BaseFont) (obj)).getWidthPoint(s, size);
			f1 = f;
			f = f2;
		}
		j = keepNumbers(code).length();
		i = j;
		if(generateChecksum)
			i = j + 1;
		return new Rectangle(Math.max((float)i * (3F * x + 2.0F * x * n) + (6F + n) * x, f), barHeight + f1);
	//* 118  220:goto            38
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		float f1;
		float f2;
		float f3;
		float f4;
		boolean flag;
		String s;
		Object obj = ((Object) (code));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field String code>
	//    2    4:astore          13
		f2 = 0.0F;
	//    3    6:fconst_0        
	//    4    7:fstore          6
		s = ((String) (obj));
	//    5    9:aload           13
	//    6   11:astore          12
		if(font != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #42  <Field BaseFont font>
	//*   9   17:ifnull          99
		{
			s = ((String) (obj));
	//   10   20:aload           13
	//   11   22:astore          12
			if(generateChecksum)
	//*  12   24:aload_0         
	//*  13   25:getfield        #61  <Field boolean generateChecksum>
	//*  14   28:ifeq            67
			{
				s = ((String) (obj));
	//   15   31:aload           13
	//   16   33:astore          12
				if(checksumText)
	//*  17   35:aload_0         
	//*  18   36:getfield        #64  <Field boolean checksumText>
	//*  19   39:ifeq            67
					s = (new StringBuilder()).append(((String) (obj))).append(getChecksum(((String) (obj)))).toString();
	//   20   42:new             #125 <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #126 <Method void StringBuilder()>
	//   23   49:aload           13
	//   24   51:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload           13
	//   26   56:invokestatic    #131 <Method char getChecksum(String)>
	//   27   59:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   28   62:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   29   65:astore          12
			}
			obj = ((Object) (font));
	//   30   67:aload_0         
	//   31   68:getfield        #42  <Field BaseFont font>
	//   32   71:astore          13
			if(altText != null)
	//*  33   73:aload_0         
	//*  34   74:getfield        #138 <Field String altText>
	//*  35   77:ifnull          86
				s = altText;
	//   36   80:aload_0         
	//   37   81:getfield        #138 <Field String altText>
	//   38   84:astore          12
			f2 = ((BaseFont) (obj)).getWidthPoint(s, size);
	//   39   86:aload           13
	//   40   88:aload           12
	//   41   90:aload_0         
	//   42   91:getfield        #46  <Field float size>
	//   43   94:invokevirtual   #142 <Method float BaseFont.getWidthPoint(String, float)>
	//   44   97:fstore          6
		}
		String s1 = keepNumbers(code);
	//   45   99:aload_0         
	//   46  100:getfield        #123 <Field String code>
	//   47  103:invokestatic    #75  <Method String keepNumbers(String)>
	//   48  106:astore          14
		obj = ((Object) (s1));
	//   49  108:aload           14
	//   50  110:astore          13
		if(generateChecksum)
	//*  51  112:aload_0         
	//*  52  113:getfield        #61  <Field boolean generateChecksum>
	//*  53  116:ifeq            144
			obj = ((Object) ((new StringBuilder()).append(s1).append(getChecksum(s1)).toString()));
	//   54  119:new             #125 <Class StringBuilder>
	//   55  122:dup             
	//   56  123:invokespecial   #126 <Method void StringBuilder()>
	//   57  126:aload           14
	//   58  128:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   59  131:aload           14
	//   60  133:invokestatic    #131 <Method char getChecksum(String)>
	//   61  136:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   62  139:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   63  142:astore          13
		float f5 = (float)((String) (obj)).length() * (3F * x + 2.0F * x * n) + (6F + n) * x;
	//   64  144:aload           13
	//   65  146:invokevirtual   #81  <Method int String.length()>
	//   66  149:i2f             
	//   67  150:ldc1            #50  <Float 3F>
	//   68  152:aload_0         
	//   69  153:getfield        #25  <Field float x>
	//   70  156:fmul            
	//   71  157:fconst_2        
	//   72  158:aload_0         
	//   73  159:getfield        #25  <Field float x>
	//   74  162:fmul            
	//   75  163:aload_0         
	//   76  164:getfield        #28  <Field float n>
	//   77  167:fmul            
	//   78  168:fadd            
	//   79  169:fmul            
	//   80  170:ldc1            #145 <Float 6F>
	//   81  172:aload_0         
	//   82  173:getfield        #28  <Field float n>
	//   83  176:fadd            
	//   84  177:aload_0         
	//   85  178:getfield        #25  <Field float x>
	//   86  181:fmul            
	//   87  182:fadd            
	//   88  183:fstore          9
		f3 = 0.0F;
	//   89  185:fconst_0        
	//   90  186:fstore          7
		f4 = 0.0F;
	//   91  188:fconst_0        
	//   92  189:fstore          8
		float f = f3;
	//   93  191:fload           7
	//   94  193:fstore          4
		f1 = f4;
	//   95  195:fload           8
	//   96  197:fstore          5
		int i;
		byte abyte0[];
		switch(textAlignment)
	//*  97  199:aload_0         
	//*  98  200:getfield        #57  <Field int textAlignment>
		{
	//*  99  203:tableswitch     0 2: default 228
	//	               0 249
	//	               1 228
	//	               2 382
		case 1: // '\001'
		default:
			if(f2 > f5)
	//* 100  228:fload           6
	//* 101  230:fload           9
	//* 102  232:fcmpl           
	//* 103  233:ifle            418
			{
				f = (f2 - f5) / 2.0F;
	//  104  236:fload           6
	//  105  238:fload           9
	//  106  240:fsub            
	//  107  241:fconst_2        
	//  108  242:fdiv            
	//  109  243:fstore          4
				f1 = f4;
	//  110  245:fload           8
	//  111  247:fstore          5
			} else
	//* 112  249:fconst_0        
	//* 113  250:fstore          8
	//* 114  252:fconst_0        
	//* 115  253:fstore          6
	//* 116  255:fload           8
	//* 117  257:fstore          7
	//* 118  259:aload_0         
	//* 119  260:getfield        #42  <Field BaseFont font>
	//* 120  263:ifnull          290
	//* 121  266:aload_0         
	//* 122  267:getfield        #49  <Field float baseline>
	//* 123  270:fconst_0        
	//* 124  271:fcmpg           
	//* 125  272:ifgt            434
	//* 126  275:aload_0         
	//* 127  276:getfield        #53  <Field float barHeight>
	//* 128  279:aload_0         
	//* 129  280:getfield        #49  <Field float baseline>
	//* 130  283:fsub            
	//* 131  284:fstore          6
	//* 132  286:fload           8
	//* 133  288:fstore          7
	//* 134  290:aload           13
	//* 135  292:invokestatic    #158 <Method byte[] getBarsInter25(String)>
	//* 136  295:astore          13
	//* 137  297:iconst_1        
	//* 138  298:istore          10
	//* 139  300:aload_2         
	//* 140  301:ifnull          309
	//* 141  304:aload_1         
	//* 142  305:aload_2         
	//* 143  306:invokevirtual   #164 <Method void PdfContentByte.setColorFill(BaseColor)>
	//* 144  309:iconst_0        
	//* 145  310:istore          11
	//* 146  312:iload           11
	//* 147  314:aload           13
	//* 148  316:arraylength     
	//* 149  317:icmpge          481
	//* 150  320:aload           13
	//* 151  322:iload           11
	//* 152  324:baload          
	//* 153  325:ifne            461
	//* 154  328:aload_0         
	//* 155  329:getfield        #25  <Field float x>
	//* 156  332:fstore          8
	//* 157  334:iload           10
	//* 158  336:ifeq            358
	//* 159  339:aload_1         
	//* 160  340:fload           4
	//* 161  342:fload           7
	//* 162  344:fload           8
	//* 163  346:aload_0         
	//* 164  347:getfield        #167 <Field float inkSpreading>
	//* 165  350:fsub            
	//* 166  351:aload_0         
	//* 167  352:getfield        #53  <Field float barHeight>
	//* 168  355:invokevirtual   #171 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 169  358:iload           10
	//* 170  360:ifne            475
	//* 171  363:iconst_1        
	//* 172  364:istore          10
	//* 173  366:fload           4
	//* 174  368:fload           8
	//* 175  370:fadd            
	//* 176  371:fstore          4
	//* 177  373:iload           11
	//* 178  375:iconst_1        
	//* 179  376:iadd            
	//* 180  377:istore          11
	//* 181  379:goto            312
	//* 182  382:fload           6
	//* 183  384:fload           9
	//* 184  386:fcmpl           
	//* 185  387:ifle            404
	//* 186  390:fload           6
	//* 187  392:fload           9
	//* 188  394:fsub            
	//* 189  395:fstore          4
	//* 190  397:fload           8
	//* 191  399:fstore          5
	//* 192  401:goto            249
	//* 193  404:fload           9
	//* 194  406:fload           6
	//* 195  408:fsub            
	//* 196  409:fstore          5
	//* 197  411:fload           7
	//* 198  413:fstore          4
	//* 199  415:goto            249
			{
				f1 = (f5 - f2) / 2.0F;
	//  200  418:fload           9
	//  201  420:fload           6
	//  202  422:fsub            
	//  203  423:fconst_2        
	//  204  424:fdiv            
	//  205  425:fstore          5
				f = f3;
	//  206  427:fload           7
	//  207  429:fstore          4
			}
			break;

		case 0: // '\0'
			break;

		case 2: // '\002'
			break MISSING_BLOCK_LABEL_382;
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
	//* 208  431:goto            249
			{
				f2 = -font.getFontDescriptor(3, size);
	//  209  434:aload_0         
	//  210  435:getfield        #42  <Field BaseFont font>
	//  211  438:iconst_3        
	//  212  439:aload_0         
	//  213  440:getfield        #46  <Field float size>
	//  214  443:invokevirtual   #119 <Method float BaseFont.getFontDescriptor(int, float)>
	//  215  446:fneg            
	//  216  447:fstore          6
				f3 = f2 + baseline;
	//  217  449:fload           6
	//  218  451:aload_0         
	//  219  452:getfield        #49  <Field float baseline>
	//  220  455:fadd            
	//  221  456:fstore          7
			}
		abyte0 = getBarsInter25(((String) (obj)));
		flag = true;
		if(basecolor != null)
			pdfcontentbyte.setColorFill(basecolor);
		i = 0;
		while(i < abyte0.length) 
		{
			if(abyte0[i] == 0)
				f4 = x;
			else
	//* 222  458:goto            290
				f4 = x * n;
	//  223  461:aload_0         
	//  224  462:getfield        #25  <Field float x>
	//  225  465:aload_0         
	//  226  466:getfield        #28  <Field float n>
	//  227  469:fmul            
	//  228  470:fstore          8
			if(flag)
				pdfcontentbyte.rectangle(f, f3, f4 - inkSpreading, barHeight);
			if(!flag)
				flag = true;
			else
	//* 229  472:goto            334
				flag = false;
	//  230  475:iconst_0        
	//  231  476:istore          10
			f += f4;
			i++;
		}
		break MISSING_BLOCK_LABEL_481;
	//  232  478:goto            366
		if(f2 > f5)
		{
			f = f2 - f5;
			f1 = f4;
		} else
		{
			f1 = f5 - f2;
			f = f3;
		}
		break MISSING_BLOCK_LABEL_249;
		pdfcontentbyte.fill();
	//  233  481:aload_1         
	//  234  482:invokevirtual   #174 <Method void PdfContentByte.fill()>
		if(font != null)
	//* 235  485:aload_0         
	//* 236  486:getfield        #42  <Field BaseFont font>
	//* 237  489:ifnull          535
		{
			if(basecolor1 != null)
	//* 238  492:aload_3         
	//* 239  493:ifnull          501
				pdfcontentbyte.setColorFill(basecolor1);
	//  240  496:aload_1         
	//  241  497:aload_3         
	//  242  498:invokevirtual   #164 <Method void PdfContentByte.setColorFill(BaseColor)>
			pdfcontentbyte.beginText();
	//  243  501:aload_1         
	//  244  502:invokevirtual   #177 <Method void PdfContentByte.beginText()>
			pdfcontentbyte.setFontAndSize(font, size);
	//  245  505:aload_1         
	//  246  506:aload_0         
	//  247  507:getfield        #42  <Field BaseFont font>
	//  248  510:aload_0         
	//  249  511:getfield        #46  <Field float size>
	//  250  514:invokevirtual   #181 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
			pdfcontentbyte.setTextMatrix(f1, f2);
	//  251  517:aload_1         
	//  252  518:fload           5
	//  253  520:fload           6
	//  254  522:invokevirtual   #184 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(s);
	//  255  525:aload_1         
	//  256  526:aload           12
	//  257  528:invokevirtual   #187 <Method void PdfContentByte.showText(String)>
			pdfcontentbyte.endText();
	//  258  531:aload_1         
	//  259  532:invokevirtual   #190 <Method void PdfContentByte.endText()>
		}
		return getBarcodeSize();
	//  260  535:aload_0         
	//  261  536:invokevirtual   #192 <Method Rectangle getBarcodeSize()>
	//  262  539:areturn         
	}

	private static final byte BARS[][];

	static 
	{
		byte abyte0[] = {
			0, 0, 1, 1, 0
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
	//   12   15:ldc1            #10  <Int 1>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #10  <Int 1>
	//   17   22:bastore         
	//   18   23:dup             
	//   19   24:iconst_4        
	//   20   25:ldc1            #9   <Int 0>
	//   21   27:bastore         
	//   22   28:astore_0        
		byte abyte1[] = {
			0, 1, 0, 0, 1
		};
	//   23   29:iconst_5        
	//   24   30:newarray        byte[]
	//   25   32:dup             
	//   26   33:iconst_0        
	//   27   34:ldc1            #9   <Int 0>
	//   28   36:bastore         
	//   29   37:dup             
	//   30   38:iconst_1        
	//   31   39:ldc1            #10  <Int 1>
	//   32   41:bastore         
	//   33   42:dup             
	//   34   43:iconst_2        
	//   35   44:ldc1            #9   <Int 0>
	//   36   46:bastore         
	//   37   47:dup             
	//   38   48:iconst_3        
	//   39   49:ldc1            #9   <Int 0>
	//   40   51:bastore         
	//   41   52:dup             
	//   42   53:iconst_4        
	//   43   54:ldc1            #10  <Int 1>
	//   44   56:bastore         
	//   45   57:astore_1        
		byte abyte2[] = {
			1, 1, 0, 0, 0
		};
	//   46   58:iconst_5        
	//   47   59:newarray        byte[]
	//   48   61:dup             
	//   49   62:iconst_0        
	//   50   63:ldc1            #10  <Int 1>
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
	//   66   83:ldc1            #9   <Int 0>
	//   67   85:bastore         
	//   68   86:astore_2        
		byte abyte3[] = {
			0, 0, 1, 0, 1
		};
	//   69   87:iconst_5        
	//   70   88:newarray        byte[]
	//   71   90:dup             
	//   72   91:iconst_0        
	//   73   92:ldc1            #9   <Int 0>
	//   74   94:bastore         
	//   75   95:dup             
	//   76   96:iconst_1        
	//   77   97:ldc1            #9   <Int 0>
	//   78   99:bastore         
	//   79  100:dup             
	//   80  101:iconst_2        
	//   81  102:ldc1            #10  <Int 1>
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
			1, 0, 1, 0, 0
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
	//  104  131:ldc1            #10  <Int 1>
	//  105  133:bastore         
	//  106  134:dup             
	//  107  135:iconst_3        
	//  108  136:ldc1            #9   <Int 0>
	//  109  138:bastore         
	//  110  139:dup             
	//  111  140:iconst_4        
	//  112  141:ldc1            #9   <Int 0>
	//  113  143:bastore         
	//  114  144:astore          4
		byte abyte5[] = {
			1, 0, 0, 1, 0
		};
	//  115  146:iconst_5        
	//  116  147:newarray        byte[]
	//  117  149:dup             
	//  118  150:iconst_0        
	//  119  151:ldc1            #10  <Int 1>
	//  120  153:bastore         
	//  121  154:dup             
	//  122  155:iconst_1        
	//  123  156:ldc1            #9   <Int 0>
	//  124  158:bastore         
	//  125  159:dup             
	//  126  160:iconst_2        
	//  127  161:ldc1            #9   <Int 0>
	//  128  163:bastore         
	//  129  164:dup             
	//  130  165:iconst_3        
	//  131  166:ldc1            #10  <Int 1>
	//  132  168:bastore         
	//  133  169:dup             
	//  134  170:iconst_4        
	//  135  171:ldc1            #9   <Int 0>
	//  136  173:bastore         
	//  137  174:astore          5
		byte abyte6[] = {
			0, 1, 0, 1, 0
		};
	//  138  176:iconst_5        
	//  139  177:newarray        byte[]
	//  140  179:dup             
	//  141  180:iconst_0        
	//  142  181:ldc1            #9   <Int 0>
	//  143  183:bastore         
	//  144  184:dup             
	//  145  185:iconst_1        
	//  146  186:ldc1            #10  <Int 1>
	//  147  188:bastore         
	//  148  189:dup             
	//  149  190:iconst_2        
	//  150  191:ldc1            #9   <Int 0>
	//  151  193:bastore         
	//  152  194:dup             
	//  153  195:iconst_3        
	//  154  196:ldc1            #10  <Int 1>
	//  155  198:bastore         
	//  156  199:dup             
	//  157  200:iconst_4        
	//  158  201:ldc1            #9   <Int 0>
	//  159  203:bastore         
	//  160  204:astore          6
		BARS = (new byte[][] {
			abyte0, new byte[] {
				1, 0, 0, 0, 1
			}, abyte1, abyte2, abyte3, abyte4, new byte[] {
				0, 1, 1, 0, 0
			}, new byte[] {
				0, 0, 0, 1, 1
			}, abyte5, abyte6
		});
	//  161  206:bipush          10
	//  162  208:anewarray       byte[][]
	//  163  211:dup             
	//  164  212:iconst_0        
	//  165  213:aload_0         
	//  166  214:aastore         
	//  167  215:dup             
	//  168  216:iconst_1        
	//  169  217:iconst_5        
	//  170  218:newarray        byte[]
	//  171  220:dup             
	//  172  221:iconst_0        
	//  173  222:ldc1            #10  <Int 1>
	//  174  224:bastore         
	//  175  225:dup             
	//  176  226:iconst_1        
	//  177  227:ldc1            #9   <Int 0>
	//  178  229:bastore         
	//  179  230:dup             
	//  180  231:iconst_2        
	//  181  232:ldc1            #9   <Int 0>
	//  182  234:bastore         
	//  183  235:dup             
	//  184  236:iconst_3        
	//  185  237:ldc1            #9   <Int 0>
	//  186  239:bastore         
	//  187  240:dup             
	//  188  241:iconst_4        
	//  189  242:ldc1            #10  <Int 1>
	//  190  244:bastore         
	//  191  245:aastore         
	//  192  246:dup             
	//  193  247:iconst_2        
	//  194  248:aload_1         
	//  195  249:aastore         
	//  196  250:dup             
	//  197  251:iconst_3        
	//  198  252:aload_2         
	//  199  253:aastore         
	//  200  254:dup             
	//  201  255:iconst_4        
	//  202  256:aload_3         
	//  203  257:aastore         
	//  204  258:dup             
	//  205  259:iconst_5        
	//  206  260:aload           4
	//  207  262:aastore         
	//  208  263:dup             
	//  209  264:bipush          6
	//  210  266:iconst_5        
	//  211  267:newarray        byte[]
	//  212  269:dup             
	//  213  270:iconst_0        
	//  214  271:ldc1            #9   <Int 0>
	//  215  273:bastore         
	//  216  274:dup             
	//  217  275:iconst_1        
	//  218  276:ldc1            #10  <Int 1>
	//  219  278:bastore         
	//  220  279:dup             
	//  221  280:iconst_2        
	//  222  281:ldc1            #10  <Int 1>
	//  223  283:bastore         
	//  224  284:dup             
	//  225  285:iconst_3        
	//  226  286:ldc1            #9   <Int 0>
	//  227  288:bastore         
	//  228  289:dup             
	//  229  290:iconst_4        
	//  230  291:ldc1            #9   <Int 0>
	//  231  293:bastore         
	//  232  294:aastore         
	//  233  295:dup             
	//  234  296:bipush          7
	//  235  298:iconst_5        
	//  236  299:newarray        byte[]
	//  237  301:dup             
	//  238  302:iconst_0        
	//  239  303:ldc1            #9   <Int 0>
	//  240  305:bastore         
	//  241  306:dup             
	//  242  307:iconst_1        
	//  243  308:ldc1            #9   <Int 0>
	//  244  310:bastore         
	//  245  311:dup             
	//  246  312:iconst_2        
	//  247  313:ldc1            #9   <Int 0>
	//  248  315:bastore         
	//  249  316:dup             
	//  250  317:iconst_3        
	//  251  318:ldc1            #10  <Int 1>
	//  252  320:bastore         
	//  253  321:dup             
	//  254  322:iconst_4        
	//  255  323:ldc1            #10  <Int 1>
	//  256  325:bastore         
	//  257  326:aastore         
	//  258  327:dup             
	//  259  328:bipush          8
	//  260  330:aload           5
	//  261  332:aastore         
	//  262  333:dup             
	//  263  334:bipush          9
	//  264  336:aload           6
	//  265  338:aastore         
	//  266  339:putstatic       #14  <Field byte[][] BARS>
	//* 267  342:return          
	}
}
