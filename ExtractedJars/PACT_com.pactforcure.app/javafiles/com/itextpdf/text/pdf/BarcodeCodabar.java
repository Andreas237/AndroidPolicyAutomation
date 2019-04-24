// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, BaseFont, PdfContentByte

public class BarcodeCodabar extends Barcode
{

	public BarcodeCodabar()
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
	//   29   54:putfield        #63  <Field int textAlignment>
			generateChecksum = false;
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:putfield        #67  <Field boolean generateChecksum>
			checksumText = false;
	//   33   62:aload_0         
	//   34   63:iconst_0        
	//   35   64:putfield        #70  <Field boolean checksumText>
			startStopText = false;
	//   36   67:aload_0         
	//   37   68:iconst_0        
	//   38   69:putfield        #73  <Field boolean startStopText>
			codeType = 12;
	//   39   72:aload_0         
	//   40   73:bipush          12
	//   41   75:putfield        #76  <Field int codeType>
			return;
	//   42   78:return          
		}
		catch(Exception exception)
	//*  43   79:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   44   80:new             #78  <Class ExceptionConverter>
	//   45   83:dup             
	//   46   84:aload_1         
	//   47   85:invokespecial   #81  <Method void ExceptionConverter(Exception)>
	//   48   88:athrow          
		}
	}

	public static String calculateChecksum(String s)
	{
		if(s.length() < 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #89  <Method int String.length()>
	//*   2    4:iconst_2        
	//*   3    5:icmpge          10
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
		String s1 = s.toUpperCase();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #93  <Method String String.toUpperCase()>
	//    8   14:astore          4
		int i = 0;
	//    9   16:iconst_0        
	//   10   17:istore_1        
		int l = s1.length();
	//   11   18:aload           4
	//   12   20:invokevirtual   #89  <Method int String.length()>
	//   13   23:istore_3        
		for(int j = 0; j < l; j++)
	//*  14   24:iconst_0        
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:iload_3         
	//*  18   28:icmpge          52
			i += "0123456789-$:/.+ABCD".indexOf(((int) (s1.charAt(j))));
	//   19   31:iload_1         
	//   20   32:ldc1            #10  <String "0123456789-$:/.+ABCD">
	//   21   34:aload           4
	//   22   36:iload_2         
	//   23   37:invokevirtual   #97  <Method char String.charAt(int)>
	//   24   40:invokevirtual   #101 <Method int String.indexOf(int)>
	//   25   43:iadd            
	//   26   44:istore_1        

	//   27   45:iload_2         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_2        
	//*  31   49:goto            26
		int k = (i + 15) / 16;
	//   32   52:iload_1         
	//   33   53:bipush          15
	//   34   55:iadd            
	//   35   56:bipush          16
	//   36   58:idiv            
	//   37   59:istore_2        
		return (new StringBuilder()).append(s.substring(0, l - 1)).append("0123456789-$:/.+ABCD".charAt(k * 16 - i)).append(s.substring(l - 1)).toString();
	//   38   60:new             #103 <Class StringBuilder>
	//   39   63:dup             
	//   40   64:invokespecial   #104 <Method void StringBuilder()>
	//   41   67:aload_0         
	//   42   68:iconst_0        
	//   43   69:iload_3         
	//   44   70:iconst_1        
	//   45   71:isub            
	//   46   72:invokevirtual   #108 <Method String String.substring(int, int)>
	//   47   75:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   48   78:ldc1            #10  <String "0123456789-$:/.+ABCD">
	//   49   80:iload_2         
	//   50   81:bipush          16
	//   51   83:imul            
	//   52   84:iload_1         
	//   53   85:isub            
	//   54   86:invokevirtual   #97  <Method char String.charAt(int)>
	//   55   89:invokevirtual   #115 <Method StringBuilder StringBuilder.append(char)>
	//   56   92:aload_0         
	//   57   93:iload_3         
	//   58   94:iconst_1        
	//   59   95:isub            
	//   60   96:invokevirtual   #118 <Method String String.substring(int)>
	//   61   99:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   62  102:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   63  105:areturn         
	}

	public static byte[] getBarsCodabar(String s)
	{
		s = s.toUpperCase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method String String.toUpperCase()>
	//    2    4:astore_0        
		int j = s.length();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #89  <Method int String.length()>
	//    5    9:istore_2        
		if(j < 2)
	//*   6   10:iload_2         
	//*   7   11:iconst_2        
	//*   8   12:icmpge          32
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("codabar.must.have.at.least.a.start.and.stop.character", new Object[0]));
	//    9   15:new             #125 <Class IllegalArgumentException>
	//   10   18:dup             
	//   11   19:ldc1            #127 <String "codabar.must.have.at.least.a.start.and.stop.character">
	//   12   21:iconst_0        
	//   13   22:anewarray       Object[]
	//   14   25:invokestatic    #135 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   28:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   16   31:athrow          
		if("0123456789-$:/.+ABCD".indexOf(((int) (s.charAt(0)))) < 16 || "0123456789-$:/.+ABCD".indexOf(((int) (s.charAt(j - 1)))) < 16)
	//*  17   32:ldc1            #10  <String "0123456789-$:/.+ABCD">
	//*  18   34:aload_0         
	//*  19   35:iconst_0        
	//*  20   36:invokevirtual   #97  <Method char String.charAt(int)>
	//*  21   39:invokevirtual   #101 <Method int String.indexOf(int)>
	//*  22   42:bipush          16
	//*  23   44:icmplt          64
	//*  24   47:ldc1            #10  <String "0123456789-$:/.+ABCD">
	//*  25   49:aload_0         
	//*  26   50:iload_2         
	//*  27   51:iconst_1        
	//*  28   52:isub            
	//*  29   53:invokevirtual   #97  <Method char String.charAt(int)>
	//*  30   56:invokevirtual   #101 <Method int String.indexOf(int)>
	//*  31   59:bipush          16
	//*  32   61:icmpge          81
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("codabar.must.have.one.of.abcd.as.start.stop.character", new Object[0]));
	//   33   64:new             #125 <Class IllegalArgumentException>
	//   34   67:dup             
	//   35   68:ldc1            #140 <String "codabar.must.have.one.of.abcd.as.start.stop.character">
	//   36   70:iconst_0        
	//   37   71:anewarray       Object[]
	//   38   74:invokestatic    #135 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   39   77:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   40   80:athrow          
		byte abyte0[] = new byte[s.length() * 8 - 1];
	//   41   81:aload_0         
	//   42   82:invokevirtual   #89  <Method int String.length()>
	//   43   85:bipush          8
	//   44   87:imul            
	//   45   88:iconst_1        
	//   46   89:isub            
	//   47   90:newarray        byte[]
	//   48   92:astore          4
		for(int i = 0; i < j; i++)
	//*  49   94:iconst_0        
	//*  50   95:istore_1        
	//*  51   96:iload_1         
	//*  52   97:iload_2         
	//*  53   98:icmpge          192
		{
			int k = "0123456789-$:/.+ABCD".indexOf(((int) (s.charAt(i))));
	//   54  101:ldc1            #10  <String "0123456789-$:/.+ABCD">
	//   55  103:aload_0         
	//   56  104:iload_1         
	//   57  105:invokevirtual   #97  <Method char String.charAt(int)>
	//   58  108:invokevirtual   #101 <Method int String.indexOf(int)>
	//   59  111:istore_3        
			if(k >= 16 && i > 0 && i < j - 1)
	//*  60  112:iload_3         
	//*  61  113:bipush          16
	//*  62  115:icmplt          146
	//*  63  118:iload_1         
	//*  64  119:ifle            146
	//*  65  122:iload_1         
	//*  66  123:iload_2         
	//*  67  124:iconst_1        
	//*  68  125:isub            
	//*  69  126:icmpge          146
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("in.codabar.start.stop.characters.are.only.allowed.at.the.extremes", new Object[0]));
	//   70  129:new             #125 <Class IllegalArgumentException>
	//   71  132:dup             
	//   72  133:ldc1            #142 <String "in.codabar.start.stop.characters.are.only.allowed.at.the.extremes">
	//   73  135:iconst_0        
	//   74  136:anewarray       Object[]
	//   75  139:invokestatic    #135 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   76  142:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   77  145:athrow          
			if(k < 0)
	//*  78  146:iload_3         
	//*  79  147:ifge            168
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.character.1.is.illegal.in.codabar", ((int) (s.charAt(i)))));
	//   80  150:new             #125 <Class IllegalArgumentException>
	//   81  153:dup             
	//   82  154:ldc1            #144 <String "the.character.1.is.illegal.in.codabar">
	//   83  156:aload_0         
	//   84  157:iload_1         
	//   85  158:invokevirtual   #97  <Method char String.charAt(int)>
	//   86  161:invokestatic    #147 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   87  164:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   88  167:athrow          
			System.arraycopy(((Object) (BARS[k])), 0, ((Object) (abyte0)), i * 8, 7);
	//   89  168:getstatic       #21  <Field byte[][] BARS>
	//   90  171:iload_3         
	//   91  172:aaload          
	//   92  173:iconst_0        
	//   93  174:aload           4
	//   94  176:iload_1         
	//   95  177:bipush          8
	//   96  179:imul            
	//   97  180:bipush          7
	//   98  182:invokestatic    #153 <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   99  185:iload_1         
	//  100  186:iconst_1        
	//  101  187:iadd            
	//  102  188:istore_1        
	//* 103  189:goto            96
		return abyte0;
	//  104  192:aload           4
	//  105  194:areturn         
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
	//    5    5:getfield        #158 <Field String code>
	//    6    8:astore          7
		String s = s1;
	//    7   10:aload           7
	//    8   12:astore          6
		if(generateChecksum)
	//*   9   14:aload_0         
	//*  10   15:getfield        #67  <Field boolean generateChecksum>
	//*  11   18:ifeq            41
		{
			s = s1;
	//   12   21:aload           7
	//   13   23:astore          6
			if(checksumText)
	//*  14   25:aload_0         
	//*  15   26:getfield        #70  <Field boolean checksumText>
	//*  16   29:ifeq            41
				s = calculateChecksum(code);
	//   17   32:aload_0         
	//   18   33:getfield        #158 <Field String code>
	//   19   36:invokestatic    #160 <Method String calculateChecksum(String)>
	//   20   39:astore          6
		}
		s1 = s;
	//   21   41:aload           6
	//   22   43:astore          7
		if(!startStopText)
	//*  23   45:aload_0         
	//*  24   46:getfield        #73  <Field boolean startStopText>
	//*  25   49:ifne            67
			s1 = s.substring(1, s.length() - 1);
	//   26   52:aload           6
	//   27   54:iconst_1        
	//   28   55:aload           6
	//   29   57:invokevirtual   #89  <Method int String.length()>
	//   30   60:iconst_1        
	//   31   61:isub            
	//   32   62:invokevirtual   #108 <Method String String.substring(int, int)>
	//   33   65:astore          7
		int i;
		byte abyte0[];
		if(font != null)
	//*  34   67:aload_0         
	//*  35   68:getfield        #49  <Field BaseFont font>
	//*  36   71:ifnull          136
		{
			float f2;
			int j;
			Object obj;
			if(baseline > 0.0F)
	//*  37   74:aload_0         
	//*  38   75:getfield        #56  <Field float baseline>
	//*  39   78:fconst_0        
	//*  40   79:fcmpl           
	//*  41   80:ifle            198
				f = baseline - font.getFontDescriptor(3, size);
	//   42   83:aload_0         
	//   43   84:getfield        #56  <Field float baseline>
	//   44   87:aload_0         
	//   45   88:getfield        #49  <Field BaseFont font>
	//   46   91:iconst_3        
	//   47   92:aload_0         
	//   48   93:getfield        #53  <Field float size>
	//   49   96:invokevirtual   #164 <Method float BaseFont.getFontDescriptor(int, float)>
	//   50   99:fsub            
	//   51  100:fstore_1        
			else
	//*  52  101:aload_0         
	//*  53  102:getfield        #49  <Field BaseFont font>
	//*  54  105:astore          6
	//*  55  107:aload_0         
	//*  56  108:getfield        #167 <Field String altText>
	//*  57  111:ifnull          120
	//*  58  114:aload_0         
	//*  59  115:getfield        #167 <Field String altText>
	//*  60  118:astore          7
	//*  61  120:aload           6
	//*  62  122:aload           7
	//*  63  124:aload_0         
	//*  64  125:getfield        #53  <Field float size>
	//*  65  128:invokevirtual   #171 <Method float BaseFont.getWidthPoint(String, float)>
	//*  66  131:fstore_3        
	//*  67  132:fload_1         
	//*  68  133:fstore_2        
	//*  69  134:fload_3         
	//*  70  135:fstore_1        
	//*  71  136:aload_0         
	//*  72  137:getfield        #158 <Field String code>
	//*  73  140:astore          6
	//*  74  142:aload_0         
	//*  75  143:getfield        #67  <Field boolean generateChecksum>
	//*  76  146:ifeq            158
	//*  77  149:aload_0         
	//*  78  150:getfield        #158 <Field String code>
	//*  79  153:invokestatic    #160 <Method String calculateChecksum(String)>
	//*  80  156:astore          6
	//*  81  158:aload           6
	//*  82  160:invokestatic    #173 <Method byte[] getBarsCodabar(String)>
	//*  83  163:astore          6
	//*  84  165:iconst_0        
	//*  85  166:istore          4
	//*  86  168:iconst_0        
	//*  87  169:istore          5
	//*  88  171:iload           5
	//*  89  173:aload           6
	//*  90  175:arraylength     
	//*  91  176:icmpge          212
	//*  92  179:iload           4
	//*  93  181:aload           6
	//*  94  183:iload           5
	//*  95  185:baload          
	//*  96  186:iadd            
	//*  97  187:istore          4
	//*  98  189:iload           5
	//*  99  191:iconst_1        
	//* 100  192:iadd            
	//* 101  193:istore          5
	//* 102  195:goto            171
				f = -baseline + size;
	//  103  198:aload_0         
	//  104  199:getfield        #56  <Field float baseline>
	//  105  202:fneg            
	//  106  203:aload_0         
	//  107  204:getfield        #53  <Field float size>
	//  108  207:fadd            
	//  109  208:fstore_1        
			obj = ((Object) (font));
			if(altText != null)
				s1 = altText;
			f2 = ((BaseFont) (obj)).getWidthPoint(s1, size);
			f1 = f;
			f = f2;
		}
		obj = ((Object) (code));
		if(generateChecksum)
			obj = ((Object) (calculateChecksum(code)));
		abyte0 = getBarsCodabar(((String) (obj)));
		i = 0;
		for(j = 0; j < abyte0.length; j++)
			i += ((int) (abyte0[j]));

	//* 110  209:goto            101
		int k = abyte0.length;
	//  111  212:aload           6
	//  112  214:arraylength     
	//  113  215:istore          5
		return new Rectangle(Math.max(x * ((float)(k - i) + (float)i * n), f), barHeight + f1);
	//  114  217:new             #175 <Class Rectangle>
	//  115  220:dup             
	//  116  221:aload_0         
	//  117  222:getfield        #32  <Field float x>
	//  118  225:iload           5
	//  119  227:iload           4
	//  120  229:isub            
	//  121  230:i2f             
	//  122  231:iload           4
	//  123  233:i2f             
	//  124  234:aload_0         
	//  125  235:getfield        #35  <Field float n>
	//  126  238:fmul            
	//  127  239:fadd            
	//  128  240:fmul            
	//  129  241:fload_1         
	//  130  242:invokestatic    #181 <Method float Math.max(float, float)>
	//  131  245:aload_0         
	//  132  246:getfield        #60  <Field float barHeight>
	//  133  249:fload_2         
	//  134  250:fadd            
	//  135  251:invokespecial   #184 <Method void Rectangle(float, float)>
	//  136  254:areturn         
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		float f1;
		float f2;
		float f3;
		float f4;
		boolean flag;
		Object obj1;
		Object obj = ((Object) (code));
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field String code>
	//    2    4:astore          12
		obj1 = obj;
	//    3    6:aload           12
	//    4    8:astore          13
		if(generateChecksum)
	//*   5   10:aload_0         
	//*   6   11:getfield        #67  <Field boolean generateChecksum>
	//*   7   14:ifeq            37
		{
			obj1 = obj;
	//    8   17:aload           12
	//    9   19:astore          13
			if(checksumText)
	//*  10   21:aload_0         
	//*  11   22:getfield        #70  <Field boolean checksumText>
	//*  12   25:ifeq            37
				obj1 = ((Object) (calculateChecksum(code)));
	//   13   28:aload_0         
	//   14   29:getfield        #158 <Field String code>
	//   15   32:invokestatic    #160 <Method String calculateChecksum(String)>
	//   16   35:astore          13
		}
		obj = obj1;
	//   17   37:aload           13
	//   18   39:astore          12
		if(!startStopText)
	//*  19   41:aload_0         
	//*  20   42:getfield        #73  <Field boolean startStopText>
	//*  21   45:ifne            63
			obj = ((Object) (((String) (obj1)).substring(1, ((String) (obj1)).length() - 1)));
	//   22   48:aload           13
	//   23   50:iconst_1        
	//   24   51:aload           13
	//   25   53:invokevirtual   #89  <Method int String.length()>
	//   26   56:iconst_1        
	//   27   57:isub            
	//   28   58:invokevirtual   #108 <Method String String.substring(int, int)>
	//   29   61:astore          12
		f2 = 0.0F;
	//   30   63:fconst_0        
	//   31   64:fstore          6
		obj1 = obj;
	//   32   66:aload           12
	//   33   68:astore          13
		if(font != null)
	//*  34   70:aload_0         
	//*  35   71:getfield        #49  <Field BaseFont font>
	//*  36   74:ifnull          113
		{
			obj1 = ((Object) (font));
	//   37   77:aload_0         
	//   38   78:getfield        #49  <Field BaseFont font>
	//   39   81:astore          13
			if(altText != null)
	//*  40   83:aload_0         
	//*  41   84:getfield        #167 <Field String altText>
	//*  42   87:ifnull          96
				obj = ((Object) (altText));
	//   43   90:aload_0         
	//   44   91:getfield        #167 <Field String altText>
	//   45   94:astore          12
			f2 = ((BaseFont) (obj1)).getWidthPoint(((String) (obj)), size);
	//   46   96:aload           13
	//   47   98:aload           12
	//   48  100:aload_0         
	//   49  101:getfield        #53  <Field float size>
	//   50  104:invokevirtual   #171 <Method float BaseFont.getWidthPoint(String, float)>
	//   51  107:fstore          6
			obj1 = obj;
	//   52  109:aload           12
	//   53  111:astore          13
		}
		int i;
		if(generateChecksum)
	//*  54  113:aload_0         
	//*  55  114:getfield        #67  <Field boolean generateChecksum>
	//*  56  117:ifeq            169
			obj = ((Object) (calculateChecksum(code)));
	//   57  120:aload_0         
	//   58  121:getfield        #158 <Field String code>
	//   59  124:invokestatic    #160 <Method String calculateChecksum(String)>
	//   60  127:astore          12
		else
	//*  61  129:aload           12
	//*  62  131:invokestatic    #173 <Method byte[] getBarsCodabar(String)>
	//*  63  134:astore          12
	//*  64  136:iconst_0        
	//*  65  137:istore          10
	//*  66  139:iconst_0        
	//*  67  140:istore          11
	//*  68  142:iload           11
	//*  69  144:aload           12
	//*  70  146:arraylength     
	//*  71  147:icmpge          178
	//*  72  150:iload           10
	//*  73  152:aload           12
	//*  74  154:iload           11
	//*  75  156:baload          
	//*  76  157:iadd            
	//*  77  158:istore          10
	//*  78  160:iload           11
	//*  79  162:iconst_1        
	//*  80  163:iadd            
	//*  81  164:istore          11
	//*  82  166:goto            142
			obj = ((Object) (code));
	//   83  169:aload_0         
	//   84  170:getfield        #158 <Field String code>
	//   85  173:astore          12
		obj = ((Object) (getBarsCodabar(((String) (obj)))));
		i = 0;
		for(int j = 0; j < obj.length; j++)
			i += ((int) (obj[j]));

	//*  86  175:goto            129
		int k = obj.length;
	//   87  178:aload           12
	//   88  180:arraylength     
	//   89  181:istore          11
		float f5 = x * ((float)(k - i) + (float)i * n);
	//   90  183:aload_0         
	//   91  184:getfield        #32  <Field float x>
	//   92  187:iload           11
	//   93  189:iload           10
	//   94  191:isub            
	//   95  192:i2f             
	//   96  193:iload           10
	//   97  195:i2f             
	//   98  196:aload_0         
	//   99  197:getfield        #35  <Field float n>
	//  100  200:fmul            
	//  101  201:fadd            
	//  102  202:fmul            
	//  103  203:fstore          9
		f3 = 0.0F;
	//  104  205:fconst_0        
	//  105  206:fstore          7
		f4 = 0.0F;
	//  106  208:fconst_0        
	//  107  209:fstore          8
		float f = f3;
	//  108  211:fload           7
	//  109  213:fstore          4
		f1 = f4;
	//  110  215:fload           8
	//  111  217:fstore          5
		switch(textAlignment)
	//* 112  219:aload_0         
	//* 113  220:getfield        #63  <Field int textAlignment>
		{
	//* 114  223:tableswitch     0 2: default 248
	//	               0 269
	//	               1 248
	//	               2 395
		case 1: // '\001'
		default:
			if(f2 > f5)
	//* 115  248:fload           6
	//* 116  250:fload           9
	//* 117  252:fcmpl           
	//* 118  253:ifle            431
			{
				f = (f2 - f5) / 2.0F;
	//  119  256:fload           6
	//  120  258:fload           9
	//  121  260:fsub            
	//  122  261:fconst_2        
	//  123  262:fdiv            
	//  124  263:fstore          4
				f1 = f4;
	//  125  265:fload           8
	//  126  267:fstore          5
			} else
	//* 127  269:fconst_0        
	//* 128  270:fstore          8
	//* 129  272:fconst_0        
	//* 130  273:fstore          6
	//* 131  275:fload           8
	//* 132  277:fstore          7
	//* 133  279:aload_0         
	//* 134  280:getfield        #49  <Field BaseFont font>
	//* 135  283:ifnull          310
	//* 136  286:aload_0         
	//* 137  287:getfield        #56  <Field float baseline>
	//* 138  290:fconst_0        
	//* 139  291:fcmpg           
	//* 140  292:ifgt            447
	//* 141  295:aload_0         
	//* 142  296:getfield        #60  <Field float barHeight>
	//* 143  299:aload_0         
	//* 144  300:getfield        #56  <Field float baseline>
	//* 145  303:fsub            
	//* 146  304:fstore          6
	//* 147  306:fload           8
	//* 148  308:fstore          7
	//* 149  310:iconst_1        
	//* 150  311:istore          10
	//* 151  313:aload_2         
	//* 152  314:ifnull          322
	//* 153  317:aload_1         
	//* 154  318:aload_2         
	//* 155  319:invokevirtual   #192 <Method void PdfContentByte.setColorFill(BaseColor)>
	//* 156  322:iconst_0        
	//* 157  323:istore          11
	//* 158  325:iload           11
	//* 159  327:aload           12
	//* 160  329:arraylength     
	//* 161  330:icmpge          494
	//* 162  333:aload           12
	//* 163  335:iload           11
	//* 164  337:baload          
	//* 165  338:ifne            474
	//* 166  341:aload_0         
	//* 167  342:getfield        #32  <Field float x>
	//* 168  345:fstore          8
	//* 169  347:iload           10
	//* 170  349:ifeq            371
	//* 171  352:aload_1         
	//* 172  353:fload           4
	//* 173  355:fload           7
	//* 174  357:fload           8
	//* 175  359:aload_0         
	//* 176  360:getfield        #195 <Field float inkSpreading>
	//* 177  363:fsub            
	//* 178  364:aload_0         
	//* 179  365:getfield        #60  <Field float barHeight>
	//* 180  368:invokevirtual   #199 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 181  371:iload           10
	//* 182  373:ifne            488
	//* 183  376:iconst_1        
	//* 184  377:istore          10
	//* 185  379:fload           4
	//* 186  381:fload           8
	//* 187  383:fadd            
	//* 188  384:fstore          4
	//* 189  386:iload           11
	//* 190  388:iconst_1        
	//* 191  389:iadd            
	//* 192  390:istore          11
	//* 193  392:goto            325
	//* 194  395:fload           6
	//* 195  397:fload           9
	//* 196  399:fcmpl           
	//* 197  400:ifle            417
	//* 198  403:fload           6
	//* 199  405:fload           9
	//* 200  407:fsub            
	//* 201  408:fstore          4
	//* 202  410:fload           8
	//* 203  412:fstore          5
	//* 204  414:goto            269
	//* 205  417:fload           9
	//* 206  419:fload           6
	//* 207  421:fsub            
	//* 208  422:fstore          5
	//* 209  424:fload           7
	//* 210  426:fstore          4
	//* 211  428:goto            269
			{
				f1 = (f5 - f2) / 2.0F;
	//  212  431:fload           9
	//  213  433:fload           6
	//  214  435:fsub            
	//  215  436:fconst_2        
	//  216  437:fdiv            
	//  217  438:fstore          5
				f = f3;
	//  218  440:fload           7
	//  219  442:fstore          4
			}
			break;

		case 0: // '\0'
			break;

		case 2: // '\002'
			break MISSING_BLOCK_LABEL_395;
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
	//* 220  444:goto            269
			{
				f2 = -font.getFontDescriptor(3, size);
	//  221  447:aload_0         
	//  222  448:getfield        #49  <Field BaseFont font>
	//  223  451:iconst_3        
	//  224  452:aload_0         
	//  225  453:getfield        #53  <Field float size>
	//  226  456:invokevirtual   #164 <Method float BaseFont.getFontDescriptor(int, float)>
	//  227  459:fneg            
	//  228  460:fstore          6
				f3 = f2 + baseline;
	//  229  462:fload           6
	//  230  464:aload_0         
	//  231  465:getfield        #56  <Field float baseline>
	//  232  468:fadd            
	//  233  469:fstore          7
			}
		flag = true;
		if(basecolor != null)
			pdfcontentbyte.setColorFill(basecolor);
		k = 0;
		while(k < obj.length) 
		{
			if(obj[k] == 0)
				f4 = x;
			else
	//* 234  471:goto            310
				f4 = x * n;
	//  235  474:aload_0         
	//  236  475:getfield        #32  <Field float x>
	//  237  478:aload_0         
	//  238  479:getfield        #35  <Field float n>
	//  239  482:fmul            
	//  240  483:fstore          8
			if(flag)
				pdfcontentbyte.rectangle(f, f3, f4 - inkSpreading, barHeight);
			if(!flag)
				flag = true;
			else
	//* 241  485:goto            347
				flag = false;
	//  242  488:iconst_0        
	//  243  489:istore          10
			f += f4;
			k++;
		}
		break MISSING_BLOCK_LABEL_494;
	//  244  491:goto            379
		if(f2 > f5)
		{
			f = f2 - f5;
			f1 = f4;
		} else
		{
			f1 = f5 - f2;
			f = f3;
		}
		break MISSING_BLOCK_LABEL_269;
		pdfcontentbyte.fill();
	//  245  494:aload_1         
	//  246  495:invokevirtual   #202 <Method void PdfContentByte.fill()>
		if(font != null)
	//* 247  498:aload_0         
	//* 248  499:getfield        #49  <Field BaseFont font>
	//* 249  502:ifnull          548
		{
			if(basecolor1 != null)
	//* 250  505:aload_3         
	//* 251  506:ifnull          514
				pdfcontentbyte.setColorFill(basecolor1);
	//  252  509:aload_1         
	//  253  510:aload_3         
	//  254  511:invokevirtual   #192 <Method void PdfContentByte.setColorFill(BaseColor)>
			pdfcontentbyte.beginText();
	//  255  514:aload_1         
	//  256  515:invokevirtual   #205 <Method void PdfContentByte.beginText()>
			pdfcontentbyte.setFontAndSize(font, size);
	//  257  518:aload_1         
	//  258  519:aload_0         
	//  259  520:getfield        #49  <Field BaseFont font>
	//  260  523:aload_0         
	//  261  524:getfield        #53  <Field float size>
	//  262  527:invokevirtual   #209 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
			pdfcontentbyte.setTextMatrix(f1, f2);
	//  263  530:aload_1         
	//  264  531:fload           5
	//  265  533:fload           6
	//  266  535:invokevirtual   #212 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (obj1)));
	//  267  538:aload_1         
	//  268  539:aload           13
	//  269  541:invokevirtual   #215 <Method void PdfContentByte.showText(String)>
			pdfcontentbyte.endText();
	//  270  544:aload_1         
	//  271  545:invokevirtual   #218 <Method void PdfContentByte.endText()>
		}
		return getBarcodeSize();
	//  272  548:aload_0         
	//  273  549:invokevirtual   #220 <Method Rectangle getBarcodeSize()>
	//  274  552:areturn         
	}

	private static final byte BARS[][];
	private static final String CHARS = "0123456789-$:/.+ABCD";
	private static final int START_STOP_IDX = 16;

	static 
	{
		byte abyte0[] = {
			1, 1, 0, 0, 0, 0, 0
		};
	//    0    0:bipush          7
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #16  <Int 1>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #16  <Int 1>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #17  <Int 0>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #17  <Int 0>
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
	//   30   40:astore_0        
		byte abyte1[] = {
			1, 0, 0, 0, 0, 1, 0
		};
	//   31   41:bipush          7
	//   32   43:newarray        byte[]
	//   33   45:dup             
	//   34   46:iconst_0        
	//   35   47:ldc1            #16  <Int 1>
	//   36   49:bastore         
	//   37   50:dup             
	//   38   51:iconst_1        
	//   39   52:ldc1            #17  <Int 0>
	//   40   54:bastore         
	//   41   55:dup             
	//   42   56:iconst_2        
	//   43   57:ldc1            #17  <Int 0>
	//   44   59:bastore         
	//   45   60:dup             
	//   46   61:iconst_3        
	//   47   62:ldc1            #17  <Int 0>
	//   48   64:bastore         
	//   49   65:dup             
	//   50   66:iconst_4        
	//   51   67:ldc1            #17  <Int 0>
	//   52   69:bastore         
	//   53   70:dup             
	//   54   71:iconst_5        
	//   55   72:ldc1            #16  <Int 1>
	//   56   74:bastore         
	//   57   75:dup             
	//   58   76:bipush          6
	//   59   78:ldc1            #17  <Int 0>
	//   60   80:bastore         
	//   61   81:astore_1        
		byte abyte2[] = {
			0, 1, 0, 0, 1, 0, 0
		};
	//   62   82:bipush          7
	//   63   84:newarray        byte[]
	//   64   86:dup             
	//   65   87:iconst_0        
	//   66   88:ldc1            #17  <Int 0>
	//   67   90:bastore         
	//   68   91:dup             
	//   69   92:iconst_1        
	//   70   93:ldc1            #16  <Int 1>
	//   71   95:bastore         
	//   72   96:dup             
	//   73   97:iconst_2        
	//   74   98:ldc1            #17  <Int 0>
	//   75  100:bastore         
	//   76  101:dup             
	//   77  102:iconst_3        
	//   78  103:ldc1            #17  <Int 0>
	//   79  105:bastore         
	//   80  106:dup             
	//   81  107:iconst_4        
	//   82  108:ldc1            #16  <Int 1>
	//   83  110:bastore         
	//   84  111:dup             
	//   85  112:iconst_5        
	//   86  113:ldc1            #17  <Int 0>
	//   87  115:bastore         
	//   88  116:dup             
	//   89  117:bipush          6
	//   90  119:ldc1            #17  <Int 0>
	//   91  121:bastore         
	//   92  122:astore_2        
		byte abyte3[] = {
			1, 0, 1, 0, 0, 0, 1
		};
	//   93  123:bipush          7
	//   94  125:newarray        byte[]
	//   95  127:dup             
	//   96  128:iconst_0        
	//   97  129:ldc1            #16  <Int 1>
	//   98  131:bastore         
	//   99  132:dup             
	//  100  133:iconst_1        
	//  101  134:ldc1            #17  <Int 0>
	//  102  136:bastore         
	//  103  137:dup             
	//  104  138:iconst_2        
	//  105  139:ldc1            #16  <Int 1>
	//  106  141:bastore         
	//  107  142:dup             
	//  108  143:iconst_3        
	//  109  144:ldc1            #17  <Int 0>
	//  110  146:bastore         
	//  111  147:dup             
	//  112  148:iconst_4        
	//  113  149:ldc1            #17  <Int 0>
	//  114  151:bastore         
	//  115  152:dup             
	//  116  153:iconst_5        
	//  117  154:ldc1            #17  <Int 0>
	//  118  156:bastore         
	//  119  157:dup             
	//  120  158:bipush          6
	//  121  160:ldc1            #16  <Int 1>
	//  122  162:bastore         
	//  123  163:astore_3        
		byte abyte4[] = {
			0, 0, 1, 0, 1, 0, 1
		};
	//  124  164:bipush          7
	//  125  166:newarray        byte[]
	//  126  168:dup             
	//  127  169:iconst_0        
	//  128  170:ldc1            #17  <Int 0>
	//  129  172:bastore         
	//  130  173:dup             
	//  131  174:iconst_1        
	//  132  175:ldc1            #17  <Int 0>
	//  133  177:bastore         
	//  134  178:dup             
	//  135  179:iconst_2        
	//  136  180:ldc1            #16  <Int 1>
	//  137  182:bastore         
	//  138  183:dup             
	//  139  184:iconst_3        
	//  140  185:ldc1            #17  <Int 0>
	//  141  187:bastore         
	//  142  188:dup             
	//  143  189:iconst_4        
	//  144  190:ldc1            #16  <Int 1>
	//  145  192:bastore         
	//  146  193:dup             
	//  147  194:iconst_5        
	//  148  195:ldc1            #17  <Int 0>
	//  149  197:bastore         
	//  150  198:dup             
	//  151  199:bipush          6
	//  152  201:ldc1            #16  <Int 1>
	//  153  203:bastore         
	//  154  204:astore          4
		byte abyte5[] = {
			0, 0, 0, 1, 1, 1, 0
		};
	//  155  206:bipush          7
	//  156  208:newarray        byte[]
	//  157  210:dup             
	//  158  211:iconst_0        
	//  159  212:ldc1            #17  <Int 0>
	//  160  214:bastore         
	//  161  215:dup             
	//  162  216:iconst_1        
	//  163  217:ldc1            #17  <Int 0>
	//  164  219:bastore         
	//  165  220:dup             
	//  166  221:iconst_2        
	//  167  222:ldc1            #17  <Int 0>
	//  168  224:bastore         
	//  169  225:dup             
	//  170  226:iconst_3        
	//  171  227:ldc1            #16  <Int 1>
	//  172  229:bastore         
	//  173  230:dup             
	//  174  231:iconst_4        
	//  175  232:ldc1            #16  <Int 1>
	//  176  234:bastore         
	//  177  235:dup             
	//  178  236:iconst_5        
	//  179  237:ldc1            #16  <Int 1>
	//  180  239:bastore         
	//  181  240:dup             
	//  182  241:bipush          6
	//  183  243:ldc1            #17  <Int 0>
	//  184  245:bastore         
	//  185  246:astore          5
		BARS = (new byte[][] {
			new byte[] {
				0, 0, 0, 0, 0, 1, 1
			}, new byte[] {
				0, 0, 0, 0, 1, 1, 0
			}, new byte[] {
				0, 0, 0, 1, 0, 0, 1
			}, abyte0, new byte[] {
				0, 0, 1, 0, 0, 1, 0
			}, abyte1, new byte[] {
				0, 1, 0, 0, 0, 0, 1
			}, abyte2, new byte[] {
				0, 1, 1, 0, 0, 0, 0
			}, new byte[] {
				1, 0, 0, 1, 0, 0, 0
			}, new byte[] {
				0, 0, 0, 1, 1, 0, 0
			}, new byte[] {
				0, 0, 1, 1, 0, 0, 0
			}, new byte[] {
				1, 0, 0, 0, 1, 0, 1
			}, abyte3, new byte[] {
				1, 0, 1, 0, 1, 0, 0
			}, abyte4, new byte[] {
				0, 0, 1, 1, 0, 1, 0
			}, new byte[] {
				0, 1, 0, 1, 0, 0, 1
			}, new byte[] {
				0, 0, 0, 1, 0, 1, 1
			}, abyte5
		});
	//  186  248:bipush          20
	//  187  250:anewarray       byte[][]
	//  188  253:dup             
	//  189  254:iconst_0        
	//  190  255:bipush          7
	//  191  257:newarray        byte[]
	//  192  259:dup             
	//  193  260:iconst_0        
	//  194  261:ldc1            #17  <Int 0>
	//  195  263:bastore         
	//  196  264:dup             
	//  197  265:iconst_1        
	//  198  266:ldc1            #17  <Int 0>
	//  199  268:bastore         
	//  200  269:dup             
	//  201  270:iconst_2        
	//  202  271:ldc1            #17  <Int 0>
	//  203  273:bastore         
	//  204  274:dup             
	//  205  275:iconst_3        
	//  206  276:ldc1            #17  <Int 0>
	//  207  278:bastore         
	//  208  279:dup             
	//  209  280:iconst_4        
	//  210  281:ldc1            #17  <Int 0>
	//  211  283:bastore         
	//  212  284:dup             
	//  213  285:iconst_5        
	//  214  286:ldc1            #16  <Int 1>
	//  215  288:bastore         
	//  216  289:dup             
	//  217  290:bipush          6
	//  218  292:ldc1            #16  <Int 1>
	//  219  294:bastore         
	//  220  295:aastore         
	//  221  296:dup             
	//  222  297:iconst_1        
	//  223  298:bipush          7
	//  224  300:newarray        byte[]
	//  225  302:dup             
	//  226  303:iconst_0        
	//  227  304:ldc1            #17  <Int 0>
	//  228  306:bastore         
	//  229  307:dup             
	//  230  308:iconst_1        
	//  231  309:ldc1            #17  <Int 0>
	//  232  311:bastore         
	//  233  312:dup             
	//  234  313:iconst_2        
	//  235  314:ldc1            #17  <Int 0>
	//  236  316:bastore         
	//  237  317:dup             
	//  238  318:iconst_3        
	//  239  319:ldc1            #17  <Int 0>
	//  240  321:bastore         
	//  241  322:dup             
	//  242  323:iconst_4        
	//  243  324:ldc1            #16  <Int 1>
	//  244  326:bastore         
	//  245  327:dup             
	//  246  328:iconst_5        
	//  247  329:ldc1            #16  <Int 1>
	//  248  331:bastore         
	//  249  332:dup             
	//  250  333:bipush          6
	//  251  335:ldc1            #17  <Int 0>
	//  252  337:bastore         
	//  253  338:aastore         
	//  254  339:dup             
	//  255  340:iconst_2        
	//  256  341:bipush          7
	//  257  343:newarray        byte[]
	//  258  345:dup             
	//  259  346:iconst_0        
	//  260  347:ldc1            #17  <Int 0>
	//  261  349:bastore         
	//  262  350:dup             
	//  263  351:iconst_1        
	//  264  352:ldc1            #17  <Int 0>
	//  265  354:bastore         
	//  266  355:dup             
	//  267  356:iconst_2        
	//  268  357:ldc1            #17  <Int 0>
	//  269  359:bastore         
	//  270  360:dup             
	//  271  361:iconst_3        
	//  272  362:ldc1            #16  <Int 1>
	//  273  364:bastore         
	//  274  365:dup             
	//  275  366:iconst_4        
	//  276  367:ldc1            #17  <Int 0>
	//  277  369:bastore         
	//  278  370:dup             
	//  279  371:iconst_5        
	//  280  372:ldc1            #17  <Int 0>
	//  281  374:bastore         
	//  282  375:dup             
	//  283  376:bipush          6
	//  284  378:ldc1            #16  <Int 1>
	//  285  380:bastore         
	//  286  381:aastore         
	//  287  382:dup             
	//  288  383:iconst_3        
	//  289  384:aload_0         
	//  290  385:aastore         
	//  291  386:dup             
	//  292  387:iconst_4        
	//  293  388:bipush          7
	//  294  390:newarray        byte[]
	//  295  392:dup             
	//  296  393:iconst_0        
	//  297  394:ldc1            #17  <Int 0>
	//  298  396:bastore         
	//  299  397:dup             
	//  300  398:iconst_1        
	//  301  399:ldc1            #17  <Int 0>
	//  302  401:bastore         
	//  303  402:dup             
	//  304  403:iconst_2        
	//  305  404:ldc1            #16  <Int 1>
	//  306  406:bastore         
	//  307  407:dup             
	//  308  408:iconst_3        
	//  309  409:ldc1            #17  <Int 0>
	//  310  411:bastore         
	//  311  412:dup             
	//  312  413:iconst_4        
	//  313  414:ldc1            #17  <Int 0>
	//  314  416:bastore         
	//  315  417:dup             
	//  316  418:iconst_5        
	//  317  419:ldc1            #16  <Int 1>
	//  318  421:bastore         
	//  319  422:dup             
	//  320  423:bipush          6
	//  321  425:ldc1            #17  <Int 0>
	//  322  427:bastore         
	//  323  428:aastore         
	//  324  429:dup             
	//  325  430:iconst_5        
	//  326  431:aload_1         
	//  327  432:aastore         
	//  328  433:dup             
	//  329  434:bipush          6
	//  330  436:bipush          7
	//  331  438:newarray        byte[]
	//  332  440:dup             
	//  333  441:iconst_0        
	//  334  442:ldc1            #17  <Int 0>
	//  335  444:bastore         
	//  336  445:dup             
	//  337  446:iconst_1        
	//  338  447:ldc1            #16  <Int 1>
	//  339  449:bastore         
	//  340  450:dup             
	//  341  451:iconst_2        
	//  342  452:ldc1            #17  <Int 0>
	//  343  454:bastore         
	//  344  455:dup             
	//  345  456:iconst_3        
	//  346  457:ldc1            #17  <Int 0>
	//  347  459:bastore         
	//  348  460:dup             
	//  349  461:iconst_4        
	//  350  462:ldc1            #17  <Int 0>
	//  351  464:bastore         
	//  352  465:dup             
	//  353  466:iconst_5        
	//  354  467:ldc1            #17  <Int 0>
	//  355  469:bastore         
	//  356  470:dup             
	//  357  471:bipush          6
	//  358  473:ldc1            #16  <Int 1>
	//  359  475:bastore         
	//  360  476:aastore         
	//  361  477:dup             
	//  362  478:bipush          7
	//  363  480:aload_2         
	//  364  481:aastore         
	//  365  482:dup             
	//  366  483:bipush          8
	//  367  485:bipush          7
	//  368  487:newarray        byte[]
	//  369  489:dup             
	//  370  490:iconst_0        
	//  371  491:ldc1            #17  <Int 0>
	//  372  493:bastore         
	//  373  494:dup             
	//  374  495:iconst_1        
	//  375  496:ldc1            #16  <Int 1>
	//  376  498:bastore         
	//  377  499:dup             
	//  378  500:iconst_2        
	//  379  501:ldc1            #16  <Int 1>
	//  380  503:bastore         
	//  381  504:dup             
	//  382  505:iconst_3        
	//  383  506:ldc1            #17  <Int 0>
	//  384  508:bastore         
	//  385  509:dup             
	//  386  510:iconst_4        
	//  387  511:ldc1            #17  <Int 0>
	//  388  513:bastore         
	//  389  514:dup             
	//  390  515:iconst_5        
	//  391  516:ldc1            #17  <Int 0>
	//  392  518:bastore         
	//  393  519:dup             
	//  394  520:bipush          6
	//  395  522:ldc1            #17  <Int 0>
	//  396  524:bastore         
	//  397  525:aastore         
	//  398  526:dup             
	//  399  527:bipush          9
	//  400  529:bipush          7
	//  401  531:newarray        byte[]
	//  402  533:dup             
	//  403  534:iconst_0        
	//  404  535:ldc1            #16  <Int 1>
	//  405  537:bastore         
	//  406  538:dup             
	//  407  539:iconst_1        
	//  408  540:ldc1            #17  <Int 0>
	//  409  542:bastore         
	//  410  543:dup             
	//  411  544:iconst_2        
	//  412  545:ldc1            #17  <Int 0>
	//  413  547:bastore         
	//  414  548:dup             
	//  415  549:iconst_3        
	//  416  550:ldc1            #16  <Int 1>
	//  417  552:bastore         
	//  418  553:dup             
	//  419  554:iconst_4        
	//  420  555:ldc1            #17  <Int 0>
	//  421  557:bastore         
	//  422  558:dup             
	//  423  559:iconst_5        
	//  424  560:ldc1            #17  <Int 0>
	//  425  562:bastore         
	//  426  563:dup             
	//  427  564:bipush          6
	//  428  566:ldc1            #17  <Int 0>
	//  429  568:bastore         
	//  430  569:aastore         
	//  431  570:dup             
	//  432  571:bipush          10
	//  433  573:bipush          7
	//  434  575:newarray        byte[]
	//  435  577:dup             
	//  436  578:iconst_0        
	//  437  579:ldc1            #17  <Int 0>
	//  438  581:bastore         
	//  439  582:dup             
	//  440  583:iconst_1        
	//  441  584:ldc1            #17  <Int 0>
	//  442  586:bastore         
	//  443  587:dup             
	//  444  588:iconst_2        
	//  445  589:ldc1            #17  <Int 0>
	//  446  591:bastore         
	//  447  592:dup             
	//  448  593:iconst_3        
	//  449  594:ldc1            #16  <Int 1>
	//  450  596:bastore         
	//  451  597:dup             
	//  452  598:iconst_4        
	//  453  599:ldc1            #16  <Int 1>
	//  454  601:bastore         
	//  455  602:dup             
	//  456  603:iconst_5        
	//  457  604:ldc1            #17  <Int 0>
	//  458  606:bastore         
	//  459  607:dup             
	//  460  608:bipush          6
	//  461  610:ldc1            #17  <Int 0>
	//  462  612:bastore         
	//  463  613:aastore         
	//  464  614:dup             
	//  465  615:bipush          11
	//  466  617:bipush          7
	//  467  619:newarray        byte[]
	//  468  621:dup             
	//  469  622:iconst_0        
	//  470  623:ldc1            #17  <Int 0>
	//  471  625:bastore         
	//  472  626:dup             
	//  473  627:iconst_1        
	//  474  628:ldc1            #17  <Int 0>
	//  475  630:bastore         
	//  476  631:dup             
	//  477  632:iconst_2        
	//  478  633:ldc1            #16  <Int 1>
	//  479  635:bastore         
	//  480  636:dup             
	//  481  637:iconst_3        
	//  482  638:ldc1            #16  <Int 1>
	//  483  640:bastore         
	//  484  641:dup             
	//  485  642:iconst_4        
	//  486  643:ldc1            #17  <Int 0>
	//  487  645:bastore         
	//  488  646:dup             
	//  489  647:iconst_5        
	//  490  648:ldc1            #17  <Int 0>
	//  491  650:bastore         
	//  492  651:dup             
	//  493  652:bipush          6
	//  494  654:ldc1            #17  <Int 0>
	//  495  656:bastore         
	//  496  657:aastore         
	//  497  658:dup             
	//  498  659:bipush          12
	//  499  661:bipush          7
	//  500  663:newarray        byte[]
	//  501  665:dup             
	//  502  666:iconst_0        
	//  503  667:ldc1            #16  <Int 1>
	//  504  669:bastore         
	//  505  670:dup             
	//  506  671:iconst_1        
	//  507  672:ldc1            #17  <Int 0>
	//  508  674:bastore         
	//  509  675:dup             
	//  510  676:iconst_2        
	//  511  677:ldc1            #17  <Int 0>
	//  512  679:bastore         
	//  513  680:dup             
	//  514  681:iconst_3        
	//  515  682:ldc1            #17  <Int 0>
	//  516  684:bastore         
	//  517  685:dup             
	//  518  686:iconst_4        
	//  519  687:ldc1            #16  <Int 1>
	//  520  689:bastore         
	//  521  690:dup             
	//  522  691:iconst_5        
	//  523  692:ldc1            #17  <Int 0>
	//  524  694:bastore         
	//  525  695:dup             
	//  526  696:bipush          6
	//  527  698:ldc1            #16  <Int 1>
	//  528  700:bastore         
	//  529  701:aastore         
	//  530  702:dup             
	//  531  703:bipush          13
	//  532  705:aload_3         
	//  533  706:aastore         
	//  534  707:dup             
	//  535  708:bipush          14
	//  536  710:bipush          7
	//  537  712:newarray        byte[]
	//  538  714:dup             
	//  539  715:iconst_0        
	//  540  716:ldc1            #16  <Int 1>
	//  541  718:bastore         
	//  542  719:dup             
	//  543  720:iconst_1        
	//  544  721:ldc1            #17  <Int 0>
	//  545  723:bastore         
	//  546  724:dup             
	//  547  725:iconst_2        
	//  548  726:ldc1            #16  <Int 1>
	//  549  728:bastore         
	//  550  729:dup             
	//  551  730:iconst_3        
	//  552  731:ldc1            #17  <Int 0>
	//  553  733:bastore         
	//  554  734:dup             
	//  555  735:iconst_4        
	//  556  736:ldc1            #16  <Int 1>
	//  557  738:bastore         
	//  558  739:dup             
	//  559  740:iconst_5        
	//  560  741:ldc1            #17  <Int 0>
	//  561  743:bastore         
	//  562  744:dup             
	//  563  745:bipush          6
	//  564  747:ldc1            #17  <Int 0>
	//  565  749:bastore         
	//  566  750:aastore         
	//  567  751:dup             
	//  568  752:bipush          15
	//  569  754:aload           4
	//  570  756:aastore         
	//  571  757:dup             
	//  572  758:bipush          16
	//  573  760:bipush          7
	//  574  762:newarray        byte[]
	//  575  764:dup             
	//  576  765:iconst_0        
	//  577  766:ldc1            #17  <Int 0>
	//  578  768:bastore         
	//  579  769:dup             
	//  580  770:iconst_1        
	//  581  771:ldc1            #17  <Int 0>
	//  582  773:bastore         
	//  583  774:dup             
	//  584  775:iconst_2        
	//  585  776:ldc1            #16  <Int 1>
	//  586  778:bastore         
	//  587  779:dup             
	//  588  780:iconst_3        
	//  589  781:ldc1            #16  <Int 1>
	//  590  783:bastore         
	//  591  784:dup             
	//  592  785:iconst_4        
	//  593  786:ldc1            #17  <Int 0>
	//  594  788:bastore         
	//  595  789:dup             
	//  596  790:iconst_5        
	//  597  791:ldc1            #16  <Int 1>
	//  598  793:bastore         
	//  599  794:dup             
	//  600  795:bipush          6
	//  601  797:ldc1            #17  <Int 0>
	//  602  799:bastore         
	//  603  800:aastore         
	//  604  801:dup             
	//  605  802:bipush          17
	//  606  804:bipush          7
	//  607  806:newarray        byte[]
	//  608  808:dup             
	//  609  809:iconst_0        
	//  610  810:ldc1            #17  <Int 0>
	//  611  812:bastore         
	//  612  813:dup             
	//  613  814:iconst_1        
	//  614  815:ldc1            #16  <Int 1>
	//  615  817:bastore         
	//  616  818:dup             
	//  617  819:iconst_2        
	//  618  820:ldc1            #17  <Int 0>
	//  619  822:bastore         
	//  620  823:dup             
	//  621  824:iconst_3        
	//  622  825:ldc1            #16  <Int 1>
	//  623  827:bastore         
	//  624  828:dup             
	//  625  829:iconst_4        
	//  626  830:ldc1            #17  <Int 0>
	//  627  832:bastore         
	//  628  833:dup             
	//  629  834:iconst_5        
	//  630  835:ldc1            #17  <Int 0>
	//  631  837:bastore         
	//  632  838:dup             
	//  633  839:bipush          6
	//  634  841:ldc1            #16  <Int 1>
	//  635  843:bastore         
	//  636  844:aastore         
	//  637  845:dup             
	//  638  846:bipush          18
	//  639  848:bipush          7
	//  640  850:newarray        byte[]
	//  641  852:dup             
	//  642  853:iconst_0        
	//  643  854:ldc1            #17  <Int 0>
	//  644  856:bastore         
	//  645  857:dup             
	//  646  858:iconst_1        
	//  647  859:ldc1            #17  <Int 0>
	//  648  861:bastore         
	//  649  862:dup             
	//  650  863:iconst_2        
	//  651  864:ldc1            #17  <Int 0>
	//  652  866:bastore         
	//  653  867:dup             
	//  654  868:iconst_3        
	//  655  869:ldc1            #16  <Int 1>
	//  656  871:bastore         
	//  657  872:dup             
	//  658  873:iconst_4        
	//  659  874:ldc1            #17  <Int 0>
	//  660  876:bastore         
	//  661  877:dup             
	//  662  878:iconst_5        
	//  663  879:ldc1            #16  <Int 1>
	//  664  881:bastore         
	//  665  882:dup             
	//  666  883:bipush          6
	//  667  885:ldc1            #16  <Int 1>
	//  668  887:bastore         
	//  669  888:aastore         
	//  670  889:dup             
	//  671  890:bipush          19
	//  672  892:aload           5
	//  673  894:aastore         
	//  674  895:putstatic       #21  <Field byte[][] BARS>
	//* 675  898:return          
	}
}
