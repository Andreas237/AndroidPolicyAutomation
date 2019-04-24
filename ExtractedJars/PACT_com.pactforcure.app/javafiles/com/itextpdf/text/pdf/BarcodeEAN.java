// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.Arrays;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, BaseFont, PdfContentByte

public class BarcodeEAN extends Barcode
{

	public BarcodeEAN()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Barcode()>
		try
		{
			x = 0.8F;
	//    2    4:aload_0         
	//    3    5:ldc1            #86  <Float 0.8F>
	//    4    7:putfield        #90  <Field float x>
			font = BaseFont.createFont("Helvetica", "winansi", false);
	//    5   10:aload_0         
	//    6   11:ldc1            #92  <String "Helvetica">
	//    7   13:ldc1            #94  <String "winansi">
	//    8   15:iconst_0        
	//    9   16:invokestatic    #100 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   10   19:putfield        #104 <Field BaseFont font>
			size = 8F;
	//   11   22:aload_0         
	//   12   23:ldc1            #105 <Float 8F>
	//   13   25:putfield        #108 <Field float size>
			baseline = size;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #108 <Field float size>
	//   17   33:putfield        #111 <Field float baseline>
			barHeight = size * 3F;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #108 <Field float size>
	//   21   41:ldc1            #112 <Float 3F>
	//   22   43:fmul            
	//   23   44:putfield        #115 <Field float barHeight>
			guardBars = true;
	//   24   47:aload_0         
	//   25   48:iconst_1        
	//   26   49:putfield        #119 <Field boolean guardBars>
			codeType = 1;
	//   27   52:aload_0         
	//   28   53:iconst_1        
	//   29   54:putfield        #122 <Field int codeType>
			code = "";
	//   30   57:aload_0         
	//   31   58:ldc1            #124 <String "">
	//   32   60:putfield        #128 <Field String code>
			return;
	//   33   63:return          
		}
		catch(Exception exception)
	//*  34   64:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   35   65:new             #130 <Class ExceptionConverter>
	//   36   68:dup             
	//   37   69:aload_1         
	//   38   70:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   39   73:athrow          
		}
	}

	public static int calculateEANParity(String s)
	{
		int j = 3;
	//    0    0:iconst_3        
	//    1    1:istore_2        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		for(int i = s.length() - 1; i >= 0; i--)
	//*   4    4:aload_0         
	//*   5    5:invokevirtual   #141 <Method int String.length()>
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
	//   15   19:invokevirtual   #145 <Method char String.charAt(int)>
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
		return (10 - k % 10) % 10;
	//   30   39:bipush          10
	//   31   41:iload_3         
	//   32   42:bipush          10
	//   33   44:irem            
	//   34   45:isub            
	//   35   46:bipush          10
	//   36   48:irem            
	//   37   49:ireturn         
	}

	public static String convertUPCAtoUPCE(String s)
	{
		if(s.length() != 12 || !s.startsWith("0") && !s.startsWith("1"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #141 <Method int String.length()>
	//*   2    4:bipush          12
	//*   3    6:icmpne          27
	//*   4    9:aload_0         
	//*   5   10:ldc1            #149 <String "0">
	//*   6   12:invokevirtual   #153 <Method boolean String.startsWith(String)>
	//*   7   15:ifne            29
	//*   8   18:aload_0         
	//*   9   19:ldc1            #155 <String "1">
	//*  10   21:invokevirtual   #153 <Method boolean String.startsWith(String)>
	//*  11   24:ifne            29
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
		if(s.substring(3, 6).equals("000") || s.substring(3, 6).equals("100") || s.substring(3, 6).equals("200"))
	//*  14   29:aload_0         
	//*  15   30:iconst_3        
	//*  16   31:bipush          6
	//*  17   33:invokevirtual   #159 <Method String String.substring(int, int)>
	//*  18   36:ldc1            #161 <String "000">
	//*  19   38:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  20   41:ifne            74
	//*  21   44:aload_0         
	//*  22   45:iconst_3        
	//*  23   46:bipush          6
	//*  24   48:invokevirtual   #159 <Method String String.substring(int, int)>
	//*  25   51:ldc1            #167 <String "100">
	//*  26   53:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  27   56:ifne            74
	//*  28   59:aload_0         
	//*  29   60:iconst_3        
	//*  30   61:bipush          6
	//*  31   63:invokevirtual   #159 <Method String String.substring(int, int)>
	//*  32   66:ldc1            #169 <String "200">
	//*  33   68:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  34   71:ifeq            148
		{
			if(s.substring(6, 8).equals("00"))
	//*  35   74:aload_0         
	//*  36   75:bipush          6
	//*  37   77:bipush          8
	//*  38   79:invokevirtual   #159 <Method String String.substring(int, int)>
	//*  39   82:ldc1            #171 <String "00">
	//*  40   84:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  41   87:ifeq            395
				return (new StringBuilder()).append(s.substring(0, 1)).append(s.substring(1, 3)).append(s.substring(8, 11)).append(s.substring(3, 4)).append(s.substring(11)).toString();
	//   42   90:new             #173 <Class StringBuilder>
	//   43   93:dup             
	//   44   94:invokespecial   #174 <Method void StringBuilder()>
	//   45   97:aload_0         
	//   46   98:iconst_0        
	//   47   99:iconst_1        
	//   48  100:invokevirtual   #159 <Method String String.substring(int, int)>
	//   49  103:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   50  106:aload_0         
	//   51  107:iconst_1        
	//   52  108:iconst_3        
	//   53  109:invokevirtual   #159 <Method String String.substring(int, int)>
	//   54  112:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   55  115:aload_0         
	//   56  116:bipush          8
	//   57  118:bipush          11
	//   58  120:invokevirtual   #159 <Method String String.substring(int, int)>
	//   59  123:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   60  126:aload_0         
	//   61  127:iconst_3        
	//   62  128:iconst_4        
	//   63  129:invokevirtual   #159 <Method String String.substring(int, int)>
	//   64  132:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:aload_0         
	//   66  136:bipush          11
	//   67  138:invokevirtual   #181 <Method String String.substring(int)>
	//   68  141:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   69  144:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   70  147:areturn         
		} else
		if(s.substring(4, 6).equals("00"))
	//*  71  148:aload_0         
	//*  72  149:iconst_4        
	//*  73  150:bipush          6
	//*  74  152:invokevirtual   #159 <Method String String.substring(int, int)>
	//*  75  155:ldc1            #171 <String "00">
	//*  76  157:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  77  160:ifeq            233
		{
			if(s.substring(6, 9).equals("000"))
	//*  78  163:aload_0         
	//*  79  164:bipush          6
	//*  80  166:bipush          9
	//*  81  168:invokevirtual   #159 <Method String String.substring(int, int)>
	//*  82  171:ldc1            #161 <String "000">
	//*  83  173:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  84  176:ifeq            395
				return (new StringBuilder()).append(s.substring(0, 1)).append(s.substring(1, 4)).append(s.substring(9, 11)).append("3").append(s.substring(11)).toString();
	//   85  179:new             #173 <Class StringBuilder>
	//   86  182:dup             
	//   87  183:invokespecial   #174 <Method void StringBuilder()>
	//   88  186:aload_0         
	//   89  187:iconst_0        
	//   90  188:iconst_1        
	//   91  189:invokevirtual   #159 <Method String String.substring(int, int)>
	//   92  192:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   93  195:aload_0         
	//   94  196:iconst_1        
	//   95  197:iconst_4        
	//   96  198:invokevirtual   #159 <Method String String.substring(int, int)>
	//   97  201:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   98  204:aload_0         
	//   99  205:bipush          9
	//  100  207:bipush          11
	//  101  209:invokevirtual   #159 <Method String String.substring(int, int)>
	//  102  212:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  103  215:ldc1            #187 <String "3">
	//  104  217:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  105  220:aload_0         
	//  106  221:bipush          11
	//  107  223:invokevirtual   #181 <Method String String.substring(int)>
	//  108  226:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  109  229:invokevirtual   #185 <Method String StringBuilder.toString()>
	//  110  232:areturn         
		} else
		if(s.substring(5, 6).equals("0"))
	//* 111  233:aload_0         
	//* 112  234:iconst_5        
	//* 113  235:bipush          6
	//* 114  237:invokevirtual   #159 <Method String String.substring(int, int)>
	//* 115  240:ldc1            #149 <String "0">
	//* 116  242:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 117  245:ifeq            318
		{
			if(s.substring(6, 10).equals("0000"))
	//* 118  248:aload_0         
	//* 119  249:bipush          6
	//* 120  251:bipush          10
	//* 121  253:invokevirtual   #159 <Method String String.substring(int, int)>
	//* 122  256:ldc1            #189 <String "0000">
	//* 123  258:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 124  261:ifeq            395
				return (new StringBuilder()).append(s.substring(0, 1)).append(s.substring(1, 5)).append(s.substring(10, 11)).append("4").append(s.substring(11)).toString();
	//  125  264:new             #173 <Class StringBuilder>
	//  126  267:dup             
	//  127  268:invokespecial   #174 <Method void StringBuilder()>
	//  128  271:aload_0         
	//  129  272:iconst_0        
	//  130  273:iconst_1        
	//  131  274:invokevirtual   #159 <Method String String.substring(int, int)>
	//  132  277:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  133  280:aload_0         
	//  134  281:iconst_1        
	//  135  282:iconst_5        
	//  136  283:invokevirtual   #159 <Method String String.substring(int, int)>
	//  137  286:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  138  289:aload_0         
	//  139  290:bipush          10
	//  140  292:bipush          11
	//  141  294:invokevirtual   #159 <Method String String.substring(int, int)>
	//  142  297:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  143  300:ldc1            #191 <String "4">
	//  144  302:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  145  305:aload_0         
	//  146  306:bipush          11
	//  147  308:invokevirtual   #181 <Method String String.substring(int)>
	//  148  311:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  149  314:invokevirtual   #185 <Method String StringBuilder.toString()>
	//  150  317:areturn         
		} else
		if(s.charAt(10) >= '5' && s.substring(6, 10).equals("0000"))
	//* 151  318:aload_0         
	//* 152  319:bipush          10
	//* 153  321:invokevirtual   #145 <Method char String.charAt(int)>
	//* 154  324:bipush          53
	//* 155  326:icmplt          395
	//* 156  329:aload_0         
	//* 157  330:bipush          6
	//* 158  332:bipush          10
	//* 159  334:invokevirtual   #159 <Method String String.substring(int, int)>
	//* 160  337:ldc1            #189 <String "0000">
	//* 161  339:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 162  342:ifeq            395
			return (new StringBuilder()).append(s.substring(0, 1)).append(s.substring(1, 6)).append(s.substring(10, 11)).append(s.substring(11)).toString();
	//  163  345:new             #173 <Class StringBuilder>
	//  164  348:dup             
	//  165  349:invokespecial   #174 <Method void StringBuilder()>
	//  166  352:aload_0         
	//  167  353:iconst_0        
	//  168  354:iconst_1        
	//  169  355:invokevirtual   #159 <Method String String.substring(int, int)>
	//  170  358:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  171  361:aload_0         
	//  172  362:iconst_1        
	//  173  363:bipush          6
	//  174  365:invokevirtual   #159 <Method String String.substring(int, int)>
	//  175  368:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  176  371:aload_0         
	//  177  372:bipush          10
	//  178  374:bipush          11
	//  179  376:invokevirtual   #159 <Method String String.substring(int, int)>
	//  180  379:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  181  382:aload_0         
	//  182  383:bipush          11
	//  183  385:invokevirtual   #181 <Method String String.substring(int)>
	//  184  388:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  185  391:invokevirtual   #185 <Method String StringBuilder.toString()>
	//  186  394:areturn         
		return null;
	//  187  395:aconst_null     
	//  188  396:areturn         
	}

	public static byte[] getBarsEAN13(String s)
	{
		int ai[] = new int[s.length()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method int String.length()>
	//    2    4:newarray        int[]
	//    3    6:astore          4
		for(int i = 0; i < ai.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload           4
	//*   8   13:arraylength     
	//*   9   14:icmpge          36
			ai[i] = s.charAt(i) - 48;
	//   10   17:aload           4
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #145 <Method char String.charAt(int)>
	//   15   25:bipush          48
	//   16   27:isub            
	//   17   28:iastore         

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//*  22   33:goto            10
		s = ((String) (new byte[59]));
	//   23   36:bipush          59
	//   24   38:newarray        byte[]
	//   25   40:astore_0        
		int k = 0 + 1;
	//   26   41:iconst_0        
	//   27   42:iconst_1        
	//   28   43:iadd            
	//   29   44:istore_2        
		s[0] = 1;
	//   30   45:aload_0         
	//   31   46:iconst_0        
	//   32   47:iconst_1        
	//   33   48:bastore         
		int j = k + 1;
	//   34   49:iload_2         
	//   35   50:iconst_1        
	//   36   51:iadd            
	//   37   52:istore_1        
		s[k] = 1;
	//   38   53:aload_0         
	//   39   54:iload_2         
	//   40   55:iconst_1        
	//   41   56:bastore         
		s[j] = 1;
	//   42   57:aload_0         
	//   43   58:iload_1         
	//   44   59:iconst_1        
	//   45   60:bastore         
		byte abyte0[] = PARITY13[ai[0]];
	//   46   61:getstatic       #73  <Field byte[][] PARITY13>
	//   47   64:aload           4
	//   48   66:iconst_0        
	//   49   67:iaload          
	//   50   68:aaload          
	//   51   69:astore          5
		k = 0;
	//   52   71:iconst_0        
	//   53   72:istore_2        
		j++;
	//   54   73:iload_1         
	//   55   74:iconst_1        
	//   56   75:iadd            
	//   57   76:istore_1        
		while(k < abyte0.length) 
	//*  58   77:iload_2         
	//*  59   78:aload           5
	//*  60   80:arraylength     
	//*  61   81:icmpge          203
		{
			int l = ai[k + 1];
	//   62   84:aload           4
	//   63   86:iload_2         
	//   64   87:iconst_1        
	//   65   88:iadd            
	//   66   89:iaload          
	//   67   90:istore_3        
			byte abyte2[] = BARS[l];
	//   68   91:getstatic       #71  <Field byte[][] BARS>
	//   69   94:iload_3         
	//   70   95:aaload          
	//   71   96:astore          6
			if(abyte0[k] == 0)
	//*  72   98:aload           5
	//*  73  100:iload_2         
	//*  74  101:iaload          
	//*  75  102:ifne            156
			{
				int i1 = j + 1;
	//   76  105:iload_1         
	//   77  106:iconst_1        
	//   78  107:iadd            
	//   79  108:istore_3        
				s[j] = abyte2[0];
	//   80  109:aload_0         
	//   81  110:iload_1         
	//   82  111:aload           6
	//   83  113:iconst_0        
	//   84  114:baload          
	//   85  115:bastore         
				j = i1 + 1;
	//   86  116:iload_3         
	//   87  117:iconst_1        
	//   88  118:iadd            
	//   89  119:istore_1        
				s[i1] = abyte2[1];
	//   90  120:aload_0         
	//   91  121:iload_3         
	//   92  122:aload           6
	//   93  124:iconst_1        
	//   94  125:baload          
	//   95  126:bastore         
				i1 = j + 1;
	//   96  127:iload_1         
	//   97  128:iconst_1        
	//   98  129:iadd            
	//   99  130:istore_3        
				s[j] = abyte2[2];
	//  100  131:aload_0         
	//  101  132:iload_1         
	//  102  133:aload           6
	//  103  135:iconst_2        
	//  104  136:baload          
	//  105  137:bastore         
				j = i1 + 1;
	//  106  138:iload_3         
	//  107  139:iconst_1        
	//  108  140:iadd            
	//  109  141:istore_1        
				s[i1] = abyte2[3];
	//  110  142:aload_0         
	//  111  143:iload_3         
	//  112  144:aload           6
	//  113  146:iconst_3        
	//  114  147:baload          
	//  115  148:bastore         
			} else
	//* 116  149:iload_2         
	//* 117  150:iconst_1        
	//* 118  151:iadd            
	//* 119  152:istore_2        
	//* 120  153:goto            77
			{
				int j1 = j + 1;
	//  121  156:iload_1         
	//  122  157:iconst_1        
	//  123  158:iadd            
	//  124  159:istore_3        
				s[j] = abyte2[3];
	//  125  160:aload_0         
	//  126  161:iload_1         
	//  127  162:aload           6
	//  128  164:iconst_3        
	//  129  165:baload          
	//  130  166:bastore         
				j = j1 + 1;
	//  131  167:iload_3         
	//  132  168:iconst_1        
	//  133  169:iadd            
	//  134  170:istore_1        
				s[j1] = abyte2[2];
	//  135  171:aload_0         
	//  136  172:iload_3         
	//  137  173:aload           6
	//  138  175:iconst_2        
	//  139  176:baload          
	//  140  177:bastore         
				j1 = j + 1;
	//  141  178:iload_1         
	//  142  179:iconst_1        
	//  143  180:iadd            
	//  144  181:istore_3        
				s[j] = abyte2[1];
	//  145  182:aload_0         
	//  146  183:iload_1         
	//  147  184:aload           6
	//  148  186:iconst_1        
	//  149  187:baload          
	//  150  188:bastore         
				j = j1 + 1;
	//  151  189:iload_3         
	//  152  190:iconst_1        
	//  153  191:iadd            
	//  154  192:istore_1        
				s[j1] = abyte2[0];
	//  155  193:aload_0         
	//  156  194:iload_3         
	//  157  195:aload           6
	//  158  197:iconst_0        
	//  159  198:baload          
	//  160  199:bastore         
			}
			k++;
		}
	//* 161  200:goto            149
		k = j + 1;
	//  162  203:iload_1         
	//  163  204:iconst_1        
	//  164  205:iadd            
	//  165  206:istore_2        
		s[j] = 1;
	//  166  207:aload_0         
	//  167  208:iload_1         
	//  168  209:iconst_1        
	//  169  210:bastore         
		j = k + 1;
	//  170  211:iload_2         
	//  171  212:iconst_1        
	//  172  213:iadd            
	//  173  214:istore_1        
		s[k] = 1;
	//  174  215:aload_0         
	//  175  216:iload_2         
	//  176  217:iconst_1        
	//  177  218:bastore         
		k = j + 1;
	//  178  219:iload_1         
	//  179  220:iconst_1        
	//  180  221:iadd            
	//  181  222:istore_2        
		s[j] = 1;
	//  182  223:aload_0         
	//  183  224:iload_1         
	//  184  225:iconst_1        
	//  185  226:bastore         
		j = k + 1;
	//  186  227:iload_2         
	//  187  228:iconst_1        
	//  188  229:iadd            
	//  189  230:istore_1        
		s[k] = 1;
	//  190  231:aload_0         
	//  191  232:iload_2         
	//  192  233:iconst_1        
	//  193  234:bastore         
		k = j + 1;
	//  194  235:iload_1         
	//  195  236:iconst_1        
	//  196  237:iadd            
	//  197  238:istore_2        
		s[j] = 1;
	//  198  239:aload_0         
	//  199  240:iload_1         
	//  200  241:iconst_1        
	//  201  242:bastore         
		for(j = 7; j < 13; j++)
	//* 202  243:bipush          7
	//* 203  245:istore_1        
	//* 204  246:iload_1         
	//* 205  247:bipush          13
	//* 206  249:icmpge          315
		{
			int k1 = ai[j];
	//  207  252:aload           4
	//  208  254:iload_1         
	//  209  255:iaload          
	//  210  256:istore_3        
			byte abyte1[] = BARS[k1];
	//  211  257:getstatic       #71  <Field byte[][] BARS>
	//  212  260:iload_3         
	//  213  261:aaload          
	//  214  262:astore          5
			k1 = k + 1;
	//  215  264:iload_2         
	//  216  265:iconst_1        
	//  217  266:iadd            
	//  218  267:istore_3        
			s[k] = abyte1[0];
	//  219  268:aload_0         
	//  220  269:iload_2         
	//  221  270:aload           5
	//  222  272:iconst_0        
	//  223  273:baload          
	//  224  274:bastore         
			k = k1 + 1;
	//  225  275:iload_3         
	//  226  276:iconst_1        
	//  227  277:iadd            
	//  228  278:istore_2        
			s[k1] = abyte1[1];
	//  229  279:aload_0         
	//  230  280:iload_3         
	//  231  281:aload           5
	//  232  283:iconst_1        
	//  233  284:baload          
	//  234  285:bastore         
			k1 = k + 1;
	//  235  286:iload_2         
	//  236  287:iconst_1        
	//  237  288:iadd            
	//  238  289:istore_3        
			s[k] = abyte1[2];
	//  239  290:aload_0         
	//  240  291:iload_2         
	//  241  292:aload           5
	//  242  294:iconst_2        
	//  243  295:baload          
	//  244  296:bastore         
			k = k1 + 1;
	//  245  297:iload_3         
	//  246  298:iconst_1        
	//  247  299:iadd            
	//  248  300:istore_2        
			s[k1] = abyte1[3];
	//  249  301:aload_0         
	//  250  302:iload_3         
	//  251  303:aload           5
	//  252  305:iconst_3        
	//  253  306:baload          
	//  254  307:bastore         
		}

	//  255  308:iload_1         
	//  256  309:iconst_1        
	//  257  310:iadd            
	//  258  311:istore_1        
	//* 259  312:goto            246
		j = k + 1;
	//  260  315:iload_2         
	//  261  316:iconst_1        
	//  262  317:iadd            
	//  263  318:istore_1        
		s[k] = 1;
	//  264  319:aload_0         
	//  265  320:iload_2         
	//  266  321:iconst_1        
	//  267  322:bastore         
		k = j + 1;
	//  268  323:iload_1         
	//  269  324:iconst_1        
	//  270  325:iadd            
	//  271  326:istore_2        
		s[j] = 1;
	//  272  327:aload_0         
	//  273  328:iload_1         
	//  274  329:iconst_1        
	//  275  330:bastore         
		s[k] = 1;
	//  276  331:aload_0         
	//  277  332:iload_2         
	//  278  333:iconst_1        
	//  279  334:bastore         
		return ((byte []) (s));
	//  280  335:aload_0         
	//  281  336:areturn         
	}

	public static byte[] getBarsEAN8(String s)
	{
		int ai[] = new int[s.length()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method int String.length()>
	//    2    4:newarray        int[]
	//    3    6:astore          4
		for(int i = 0; i < ai.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload           4
	//*   8   13:arraylength     
	//*   9   14:icmpge          36
			ai[i] = s.charAt(i) - 48;
	//   10   17:aload           4
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #145 <Method char String.charAt(int)>
	//   15   25:bipush          48
	//   16   27:isub            
	//   17   28:iastore         

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//*  22   33:goto            10
		s = ((String) (new byte[43]));
	//   23   36:bipush          43
	//   24   38:newarray        byte[]
	//   25   40:astore_0        
		int k = 0 + 1;
	//   26   41:iconst_0        
	//   27   42:iconst_1        
	//   28   43:iadd            
	//   29   44:istore_2        
		s[0] = 1;
	//   30   45:aload_0         
	//   31   46:iconst_0        
	//   32   47:iconst_1        
	//   33   48:bastore         
		int j = k + 1;
	//   34   49:iload_2         
	//   35   50:iconst_1        
	//   36   51:iadd            
	//   37   52:istore_1        
		s[k] = 1;
	//   38   53:aload_0         
	//   39   54:iload_2         
	//   40   55:iconst_1        
	//   41   56:bastore         
		k = j + 1;
	//   42   57:iload_1         
	//   43   58:iconst_1        
	//   44   59:iadd            
	//   45   60:istore_2        
		s[j] = 1;
	//   46   61:aload_0         
	//   47   62:iload_1         
	//   48   63:iconst_1        
	//   49   64:bastore         
		for(j = 0; j < 4; j++)
	//*  50   65:iconst_0        
	//*  51   66:istore_1        
	//*  52   67:iload_1         
	//*  53   68:iconst_4        
	//*  54   69:icmpge          135
		{
			int l = ai[j];
	//   55   72:aload           4
	//   56   74:iload_1         
	//   57   75:iaload          
	//   58   76:istore_3        
			byte abyte0[] = BARS[l];
	//   59   77:getstatic       #71  <Field byte[][] BARS>
	//   60   80:iload_3         
	//   61   81:aaload          
	//   62   82:astore          5
			l = k + 1;
	//   63   84:iload_2         
	//   64   85:iconst_1        
	//   65   86:iadd            
	//   66   87:istore_3        
			s[k] = abyte0[0];
	//   67   88:aload_0         
	//   68   89:iload_2         
	//   69   90:aload           5
	//   70   92:iconst_0        
	//   71   93:baload          
	//   72   94:bastore         
			k = l + 1;
	//   73   95:iload_3         
	//   74   96:iconst_1        
	//   75   97:iadd            
	//   76   98:istore_2        
			s[l] = abyte0[1];
	//   77   99:aload_0         
	//   78  100:iload_3         
	//   79  101:aload           5
	//   80  103:iconst_1        
	//   81  104:baload          
	//   82  105:bastore         
			l = k + 1;
	//   83  106:iload_2         
	//   84  107:iconst_1        
	//   85  108:iadd            
	//   86  109:istore_3        
			s[k] = abyte0[2];
	//   87  110:aload_0         
	//   88  111:iload_2         
	//   89  112:aload           5
	//   90  114:iconst_2        
	//   91  115:baload          
	//   92  116:bastore         
			k = l + 1;
	//   93  117:iload_3         
	//   94  118:iconst_1        
	//   95  119:iadd            
	//   96  120:istore_2        
			s[l] = abyte0[3];
	//   97  121:aload_0         
	//   98  122:iload_3         
	//   99  123:aload           5
	//  100  125:iconst_3        
	//  101  126:baload          
	//  102  127:bastore         
		}

	//  103  128:iload_1         
	//  104  129:iconst_1        
	//  105  130:iadd            
	//  106  131:istore_1        
	//* 107  132:goto            67
		j = k + 1;
	//  108  135:iload_2         
	//  109  136:iconst_1        
	//  110  137:iadd            
	//  111  138:istore_1        
		s[k] = 1;
	//  112  139:aload_0         
	//  113  140:iload_2         
	//  114  141:iconst_1        
	//  115  142:bastore         
		k = j + 1;
	//  116  143:iload_1         
	//  117  144:iconst_1        
	//  118  145:iadd            
	//  119  146:istore_2        
		s[j] = 1;
	//  120  147:aload_0         
	//  121  148:iload_1         
	//  122  149:iconst_1        
	//  123  150:bastore         
		j = k + 1;
	//  124  151:iload_2         
	//  125  152:iconst_1        
	//  126  153:iadd            
	//  127  154:istore_1        
		s[k] = 1;
	//  128  155:aload_0         
	//  129  156:iload_2         
	//  130  157:iconst_1        
	//  131  158:bastore         
		k = j + 1;
	//  132  159:iload_1         
	//  133  160:iconst_1        
	//  134  161:iadd            
	//  135  162:istore_2        
		s[j] = 1;
	//  136  163:aload_0         
	//  137  164:iload_1         
	//  138  165:iconst_1        
	//  139  166:bastore         
		s[k] = 1;
	//  140  167:aload_0         
	//  141  168:iload_2         
	//  142  169:iconst_1        
	//  143  170:bastore         
		j = 4;
	//  144  171:iconst_4        
	//  145  172:istore_1        
		k++;
	//  146  173:iload_2         
	//  147  174:iconst_1        
	//  148  175:iadd            
	//  149  176:istore_2        
		for(; j < 8; j++)
	//* 150  177:iload_1         
	//* 151  178:bipush          8
	//* 152  180:icmpge          246
		{
			int i1 = ai[j];
	//  153  183:aload           4
	//  154  185:iload_1         
	//  155  186:iaload          
	//  156  187:istore_3        
			byte abyte1[] = BARS[i1];
	//  157  188:getstatic       #71  <Field byte[][] BARS>
	//  158  191:iload_3         
	//  159  192:aaload          
	//  160  193:astore          5
			i1 = k + 1;
	//  161  195:iload_2         
	//  162  196:iconst_1        
	//  163  197:iadd            
	//  164  198:istore_3        
			s[k] = abyte1[0];
	//  165  199:aload_0         
	//  166  200:iload_2         
	//  167  201:aload           5
	//  168  203:iconst_0        
	//  169  204:baload          
	//  170  205:bastore         
			k = i1 + 1;
	//  171  206:iload_3         
	//  172  207:iconst_1        
	//  173  208:iadd            
	//  174  209:istore_2        
			s[i1] = abyte1[1];
	//  175  210:aload_0         
	//  176  211:iload_3         
	//  177  212:aload           5
	//  178  214:iconst_1        
	//  179  215:baload          
	//  180  216:bastore         
			i1 = k + 1;
	//  181  217:iload_2         
	//  182  218:iconst_1        
	//  183  219:iadd            
	//  184  220:istore_3        
			s[k] = abyte1[2];
	//  185  221:aload_0         
	//  186  222:iload_2         
	//  187  223:aload           5
	//  188  225:iconst_2        
	//  189  226:baload          
	//  190  227:bastore         
			k = i1 + 1;
	//  191  228:iload_3         
	//  192  229:iconst_1        
	//  193  230:iadd            
	//  194  231:istore_2        
			s[i1] = abyte1[3];
	//  195  232:aload_0         
	//  196  233:iload_3         
	//  197  234:aload           5
	//  198  236:iconst_3        
	//  199  237:baload          
	//  200  238:bastore         
		}

	//  201  239:iload_1         
	//  202  240:iconst_1        
	//  203  241:iadd            
	//  204  242:istore_1        
	//* 205  243:goto            177
		j = k + 1;
	//  206  246:iload_2         
	//  207  247:iconst_1        
	//  208  248:iadd            
	//  209  249:istore_1        
		s[k] = 1;
	//  210  250:aload_0         
	//  211  251:iload_2         
	//  212  252:iconst_1        
	//  213  253:bastore         
		k = j + 1;
	//  214  254:iload_1         
	//  215  255:iconst_1        
	//  216  256:iadd            
	//  217  257:istore_2        
		s[j] = 1;
	//  218  258:aload_0         
	//  219  259:iload_1         
	//  220  260:iconst_1        
	//  221  261:bastore         
		s[k] = 1;
	//  222  262:aload_0         
	//  223  263:iload_2         
	//  224  264:iconst_1        
	//  225  265:bastore         
		return ((byte []) (s));
	//  226  266:aload_0         
	//  227  267:areturn         
	}

	public static byte[] getBarsSupplemental2(String s)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore          5
		for(int i = 0; i < ai.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:aload           5
	//*   7   10:arraylength     
	//*   8   11:icmpge          33
			ai[i] = s.charAt(i) - 48;
	//    9   14:aload           5
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #145 <Method char String.charAt(int)>
	//   14   22:bipush          48
	//   15   24:isub            
	//   16   25:iastore         

	//   17   26:iload_1         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_1        
	//*  21   30:goto            7
		s = ((String) (new byte[13]));
	//   22   33:bipush          13
	//   23   35:newarray        byte[]
	//   24   37:astore_0        
		int k = ai[0];
	//   25   38:aload           5
	//   26   40:iconst_0        
	//   27   41:iaload          
	//   28   42:istore_2        
		int l = ai[1];
	//   29   43:aload           5
	//   30   45:iconst_1        
	//   31   46:iaload          
	//   32   47:istore_3        
		int j1 = 0 + 1;
	//   33   48:iconst_0        
	//   34   49:iconst_1        
	//   35   50:iadd            
	//   36   51:istore          4
		s[0] = 1;
	//   37   53:aload_0         
	//   38   54:iconst_0        
	//   39   55:iconst_1        
	//   40   56:bastore         
		int j = j1 + 1;
	//   41   57:iload           4
	//   42   59:iconst_1        
	//   43   60:iadd            
	//   44   61:istore_1        
		s[j1] = 1;
	//   45   62:aload_0         
	//   46   63:iload           4
	//   47   65:iconst_1        
	//   48   66:bastore         
		s[j] = 2;
	//   49   67:aload_0         
	//   50   68:iload_1         
	//   51   69:iconst_2        
	//   52   70:bastore         
		byte abyte0[] = PARITY2[(k * 10 + l) % 4];
	//   53   71:getstatic       #75  <Field byte[][] PARITY2>
	//   54   74:iload_2         
	//   55   75:bipush          10
	//   56   77:imul            
	//   57   78:iload_3         
	//   58   79:iadd            
	//   59   80:iconst_4        
	//   60   81:irem            
	//   61   82:aaload          
	//   62   83:astore          6
		k = 0;
	//   63   85:iconst_0        
	//   64   86:istore_2        
		j++;
	//   65   87:iload_1         
	//   66   88:iconst_1        
	//   67   89:iadd            
	//   68   90:istore_1        
		while(k < abyte0.length) 
	//*  69   91:iload_2         
	//*  70   92:aload           6
	//*  71   94:arraylength     
	//*  72   95:icmpge          247
		{
			int i1 = j;
	//   73   98:iload_1         
	//   74   99:istore_3        
			if(k == 1)
	//*  75  100:iload_2         
	//*  76  101:iconst_1        
	//*  77  102:icmpne          124
			{
				int k1 = j + 1;
	//   78  105:iload_1         
	//   79  106:iconst_1        
	//   80  107:iadd            
	//   81  108:istore          4
				s[j] = 1;
	//   82  110:aload_0         
	//   83  111:iload_1         
	//   84  112:iconst_1        
	//   85  113:bastore         
				i1 = k1 + 1;
	//   86  114:iload           4
	//   87  116:iconst_1        
	//   88  117:iadd            
	//   89  118:istore_3        
				s[k1] = 1;
	//   90  119:aload_0         
	//   91  120:iload           4
	//   92  122:iconst_1        
	//   93  123:bastore         
			}
			j = ai[k];
	//   94  124:aload           5
	//   95  126:iload_2         
	//   96  127:iaload          
	//   97  128:istore_1        
			byte abyte1[] = BARS[j];
	//   98  129:getstatic       #71  <Field byte[][] BARS>
	//   99  132:iload_1         
	//  100  133:aaload          
	//  101  134:astore          7
			if(abyte0[k] == 0)
	//* 102  136:aload           6
	//* 103  138:iload_2         
	//* 104  139:iaload          
	//* 105  140:ifne            197
			{
				j = i1 + 1;
	//  106  143:iload_3         
	//  107  144:iconst_1        
	//  108  145:iadd            
	//  109  146:istore_1        
				s[i1] = abyte1[0];
	//  110  147:aload_0         
	//  111  148:iload_3         
	//  112  149:aload           7
	//  113  151:iconst_0        
	//  114  152:baload          
	//  115  153:bastore         
				i1 = j + 1;
	//  116  154:iload_1         
	//  117  155:iconst_1        
	//  118  156:iadd            
	//  119  157:istore_3        
				s[j] = abyte1[1];
	//  120  158:aload_0         
	//  121  159:iload_1         
	//  122  160:aload           7
	//  123  162:iconst_1        
	//  124  163:baload          
	//  125  164:bastore         
				int l1 = i1 + 1;
	//  126  165:iload_3         
	//  127  166:iconst_1        
	//  128  167:iadd            
	//  129  168:istore          4
				s[i1] = abyte1[2];
	//  130  170:aload_0         
	//  131  171:iload_3         
	//  132  172:aload           7
	//  133  174:iconst_2        
	//  134  175:baload          
	//  135  176:bastore         
				j = l1 + 1;
	//  136  177:iload           4
	//  137  179:iconst_1        
	//  138  180:iadd            
	//  139  181:istore_1        
				s[l1] = abyte1[3];
	//  140  182:aload_0         
	//  141  183:iload           4
	//  142  185:aload           7
	//  143  187:iconst_3        
	//  144  188:baload          
	//  145  189:bastore         
			} else
	//* 146  190:iload_2         
	//* 147  191:iconst_1        
	//* 148  192:iadd            
	//* 149  193:istore_2        
	//* 150  194:goto            91
			{
				j = i1 + 1;
	//  151  197:iload_3         
	//  152  198:iconst_1        
	//  153  199:iadd            
	//  154  200:istore_1        
				s[i1] = abyte1[3];
	//  155  201:aload_0         
	//  156  202:iload_3         
	//  157  203:aload           7
	//  158  205:iconst_3        
	//  159  206:baload          
	//  160  207:bastore         
				i1 = j + 1;
	//  161  208:iload_1         
	//  162  209:iconst_1        
	//  163  210:iadd            
	//  164  211:istore_3        
				s[j] = abyte1[2];
	//  165  212:aload_0         
	//  166  213:iload_1         
	//  167  214:aload           7
	//  168  216:iconst_2        
	//  169  217:baload          
	//  170  218:bastore         
				int i2 = i1 + 1;
	//  171  219:iload_3         
	//  172  220:iconst_1        
	//  173  221:iadd            
	//  174  222:istore          4
				s[i1] = abyte1[1];
	//  175  224:aload_0         
	//  176  225:iload_3         
	//  177  226:aload           7
	//  178  228:iconst_1        
	//  179  229:baload          
	//  180  230:bastore         
				j = i2 + 1;
	//  181  231:iload           4
	//  182  233:iconst_1        
	//  183  234:iadd            
	//  184  235:istore_1        
				s[i2] = abyte1[0];
	//  185  236:aload_0         
	//  186  237:iload           4
	//  187  239:aload           7
	//  188  241:iconst_0        
	//  189  242:baload          
	//  190  243:bastore         
			}
			k++;
		}
	//* 191  244:goto            190
		return ((byte []) (s));
	//  192  247:aload_0         
	//  193  248:areturn         
	}

	public static byte[] getBarsSupplemental5(String s)
	{
		int ai[] = new int[5];
	//    0    0:iconst_5        
	//    1    1:newarray        int[]
	//    2    3:astore          8
		for(int i = 0; i < ai.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:aload           8
	//*   7   10:arraylength     
	//*   8   11:icmpge          33
			ai[i] = s.charAt(i) - 48;
	//    9   14:aload           8
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #145 <Method char String.charAt(int)>
	//   14   22:bipush          48
	//   15   24:isub            
	//   16   25:iastore         

	//   17   26:iload_1         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_1        
	//*  21   30:goto            7
		s = ((String) (new byte[31]));
	//   22   33:bipush          31
	//   23   35:newarray        byte[]
	//   24   37:astore_0        
		int k = ai[0];
	//   25   38:aload           8
	//   26   40:iconst_0        
	//   27   41:iaload          
	//   28   42:istore_2        
		int l = ai[2];
	//   29   43:aload           8
	//   30   45:iconst_2        
	//   31   46:iaload          
	//   32   47:istore_3        
		int j1 = ai[4];
	//   33   48:aload           8
	//   34   50:iconst_4        
	//   35   51:iaload          
	//   36   52:istore          4
		int j2 = ai[1];
	//   37   54:aload           8
	//   38   56:iconst_1        
	//   39   57:iaload          
	//   40   58:istore          5
		int k2 = ai[3];
	//   41   60:aload           8
	//   42   62:iconst_3        
	//   43   63:iaload          
	//   44   64:istore          6
		int l2 = 0 + 1;
	//   45   66:iconst_0        
	//   46   67:iconst_1        
	//   47   68:iadd            
	//   48   69:istore          7
		s[0] = 1;
	//   49   71:aload_0         
	//   50   72:iconst_0        
	//   51   73:iconst_1        
	//   52   74:bastore         
		int j = l2 + 1;
	//   53   75:iload           7
	//   54   77:iconst_1        
	//   55   78:iadd            
	//   56   79:istore_1        
		s[l2] = 1;
	//   57   80:aload_0         
	//   58   81:iload           7
	//   59   83:iconst_1        
	//   60   84:bastore         
		s[j] = 2;
	//   61   85:aload_0         
	//   62   86:iload_1         
	//   63   87:iconst_2        
	//   64   88:bastore         
		byte abyte0[] = PARITY5[((k + l + j1) * 3 + (j2 + k2) * 9) % 10];
	//   65   89:getstatic       #77  <Field byte[][] PARITY5>
	//   66   92:iload_2         
	//   67   93:iload_3         
	//   68   94:iadd            
	//   69   95:iload           4
	//   70   97:iadd            
	//   71   98:iconst_3        
	//   72   99:imul            
	//   73  100:iload           5
	//   74  102:iload           6
	//   75  104:iadd            
	//   76  105:bipush          9
	//   77  107:imul            
	//   78  108:iadd            
	//   79  109:bipush          10
	//   80  111:irem            
	//   81  112:aaload          
	//   82  113:astore          9
		k = 0;
	//   83  115:iconst_0        
	//   84  116:istore_2        
		j++;
	//   85  117:iload_1         
	//   86  118:iconst_1        
	//   87  119:iadd            
	//   88  120:istore_1        
		while(k < abyte0.length) 
	//*  89  121:iload_2         
	//*  90  122:aload           9
	//*  91  124:arraylength     
	//*  92  125:icmpge          276
		{
			int i1 = j;
	//   93  128:iload_1         
	//   94  129:istore_3        
			if(k != 0)
	//*  95  130:iload_2         
	//*  96  131:ifeq            153
			{
				int k1 = j + 1;
	//   97  134:iload_1         
	//   98  135:iconst_1        
	//   99  136:iadd            
	//  100  137:istore          4
				s[j] = 1;
	//  101  139:aload_0         
	//  102  140:iload_1         
	//  103  141:iconst_1        
	//  104  142:bastore         
				i1 = k1 + 1;
	//  105  143:iload           4
	//  106  145:iconst_1        
	//  107  146:iadd            
	//  108  147:istore_3        
				s[k1] = 1;
	//  109  148:aload_0         
	//  110  149:iload           4
	//  111  151:iconst_1        
	//  112  152:bastore         
			}
			j = ai[k];
	//  113  153:aload           8
	//  114  155:iload_2         
	//  115  156:iaload          
	//  116  157:istore_1        
			byte abyte1[] = BARS[j];
	//  117  158:getstatic       #71  <Field byte[][] BARS>
	//  118  161:iload_1         
	//  119  162:aaload          
	//  120  163:astore          10
			if(abyte0[k] == 0)
	//* 121  165:aload           9
	//* 122  167:iload_2         
	//* 123  168:iaload          
	//* 124  169:ifne            226
			{
				j = i1 + 1;
	//  125  172:iload_3         
	//  126  173:iconst_1        
	//  127  174:iadd            
	//  128  175:istore_1        
				s[i1] = abyte1[0];
	//  129  176:aload_0         
	//  130  177:iload_3         
	//  131  178:aload           10
	//  132  180:iconst_0        
	//  133  181:baload          
	//  134  182:bastore         
				i1 = j + 1;
	//  135  183:iload_1         
	//  136  184:iconst_1        
	//  137  185:iadd            
	//  138  186:istore_3        
				s[j] = abyte1[1];
	//  139  187:aload_0         
	//  140  188:iload_1         
	//  141  189:aload           10
	//  142  191:iconst_1        
	//  143  192:baload          
	//  144  193:bastore         
				int l1 = i1 + 1;
	//  145  194:iload_3         
	//  146  195:iconst_1        
	//  147  196:iadd            
	//  148  197:istore          4
				s[i1] = abyte1[2];
	//  149  199:aload_0         
	//  150  200:iload_3         
	//  151  201:aload           10
	//  152  203:iconst_2        
	//  153  204:baload          
	//  154  205:bastore         
				j = l1 + 1;
	//  155  206:iload           4
	//  156  208:iconst_1        
	//  157  209:iadd            
	//  158  210:istore_1        
				s[l1] = abyte1[3];
	//  159  211:aload_0         
	//  160  212:iload           4
	//  161  214:aload           10
	//  162  216:iconst_3        
	//  163  217:baload          
	//  164  218:bastore         
			} else
	//* 165  219:iload_2         
	//* 166  220:iconst_1        
	//* 167  221:iadd            
	//* 168  222:istore_2        
	//* 169  223:goto            121
			{
				j = i1 + 1;
	//  170  226:iload_3         
	//  171  227:iconst_1        
	//  172  228:iadd            
	//  173  229:istore_1        
				s[i1] = abyte1[3];
	//  174  230:aload_0         
	//  175  231:iload_3         
	//  176  232:aload           10
	//  177  234:iconst_3        
	//  178  235:baload          
	//  179  236:bastore         
				i1 = j + 1;
	//  180  237:iload_1         
	//  181  238:iconst_1        
	//  182  239:iadd            
	//  183  240:istore_3        
				s[j] = abyte1[2];
	//  184  241:aload_0         
	//  185  242:iload_1         
	//  186  243:aload           10
	//  187  245:iconst_2        
	//  188  246:baload          
	//  189  247:bastore         
				int i2 = i1 + 1;
	//  190  248:iload_3         
	//  191  249:iconst_1        
	//  192  250:iadd            
	//  193  251:istore          4
				s[i1] = abyte1[1];
	//  194  253:aload_0         
	//  195  254:iload_3         
	//  196  255:aload           10
	//  197  257:iconst_1        
	//  198  258:baload          
	//  199  259:bastore         
				j = i2 + 1;
	//  200  260:iload           4
	//  201  262:iconst_1        
	//  202  263:iadd            
	//  203  264:istore_1        
				s[i2] = abyte1[0];
	//  204  265:aload_0         
	//  205  266:iload           4
	//  206  268:aload           10
	//  207  270:iconst_0        
	//  208  271:baload          
	//  209  272:bastore         
			}
			k++;
		}
	//* 210  273:goto            219
		return ((byte []) (s));
	//  211  276:aload_0         
	//  212  277:areturn         
	}

	public static byte[] getBarsUPCE(String s)
	{
		int ai[] = new int[s.length()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method int String.length()>
	//    2    4:newarray        int[]
	//    3    6:astore          6
		for(int i = 0; i < ai.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload           6
	//*   8   13:arraylength     
	//*   9   14:icmpge          36
			ai[i] = s.charAt(i) - 48;
	//   10   17:aload           6
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #145 <Method char String.charAt(int)>
	//   15   25:bipush          48
	//   16   27:isub            
	//   17   28:iastore         

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//*  22   33:goto            10
		s = ((String) (new byte[33]));
	//   23   36:bipush          33
	//   24   38:newarray        byte[]
	//   25   40:astore_0        
		int j;
		boolean flag;
		int l;
		byte abyte0[];
		if(ai[0] != 0)
	//*  26   41:aload           6
	//*  27   43:iconst_0        
	//*  28   44:iaload          
	//*  29   45:ifeq            192
			flag = true;
	//   30   48:iconst_1        
	//   31   49:istore_2        
		else
	//*  32   50:iconst_0        
	//*  33   51:iconst_1        
	//*  34   52:iadd            
	//*  35   53:istore_3        
	//*  36   54:aload_0         
	//*  37   55:iconst_0        
	//*  38   56:iconst_1        
	//*  39   57:bastore         
	//*  40   58:iload_3         
	//*  41   59:iconst_1        
	//*  42   60:iadd            
	//*  43   61:istore_1        
	//*  44   62:aload_0         
	//*  45   63:iload_3         
	//*  46   64:iconst_1        
	//*  47   65:bastore         
	//*  48   66:aload_0         
	//*  49   67:iload_1         
	//*  50   68:iconst_1        
	//*  51   69:bastore         
	//*  52   70:getstatic       #79  <Field byte[][] PARITYE>
	//*  53   73:aload           6
	//*  54   75:aload           6
	//*  55   77:arraylength     
	//*  56   78:iconst_1        
	//*  57   79:isub            
	//*  58   80:iaload          
	//*  59   81:aaload          
	//*  60   82:astore          7
	//*  61   84:iconst_1        
	//*  62   85:istore_3        
	//*  63   86:iload_1         
	//*  64   87:iconst_1        
	//*  65   88:iadd            
	//*  66   89:istore_1        
	//*  67   90:iload_3         
	//*  68   91:aload           6
	//*  69   93:arraylength     
	//*  70   94:iconst_1        
	//*  71   95:isub            
	//*  72   96:icmpge          256
	//*  73   99:aload           6
	//*  74  101:iload_3         
	//*  75  102:iaload          
	//*  76  103:istore          4
	//*  77  105:getstatic       #71  <Field byte[][] BARS>
	//*  78  108:iload           4
	//*  79  110:aaload          
	//*  80  111:astore          8
	//*  81  113:aload           7
	//*  82  115:iload_3         
	//*  83  116:iconst_1        
	//*  84  117:isub            
	//*  85  118:iaload          
	//*  86  119:istore          5
	//*  87  121:iload_2         
	//*  88  122:ifeq            197
	//*  89  125:iconst_1        
	//*  90  126:istore          4
	//*  91  128:iload           5
	//*  92  130:iload           4
	//*  93  132:icmpne          203
	//*  94  135:iload_1         
	//*  95  136:iconst_1        
	//*  96  137:iadd            
	//*  97  138:istore          4
	//*  98  140:aload_0         
	//*  99  141:iload_1         
	//* 100  142:aload           8
	//* 101  144:iconst_0        
	//* 102  145:baload          
	//* 103  146:bastore         
	//* 104  147:iload           4
	//* 105  149:iconst_1        
	//* 106  150:iadd            
	//* 107  151:istore_1        
	//* 108  152:aload_0         
	//* 109  153:iload           4
	//* 110  155:aload           8
	//* 111  157:iconst_1        
	//* 112  158:baload          
	//* 113  159:bastore         
	//* 114  160:iload_1         
	//* 115  161:iconst_1        
	//* 116  162:iadd            
	//* 117  163:istore          4
	//* 118  165:aload_0         
	//* 119  166:iload_1         
	//* 120  167:aload           8
	//* 121  169:iconst_2        
	//* 122  170:baload          
	//* 123  171:bastore         
	//* 124  172:iload           4
	//* 125  174:iconst_1        
	//* 126  175:iadd            
	//* 127  176:istore_1        
	//* 128  177:aload_0         
	//* 129  178:iload           4
	//* 130  180:aload           8
	//* 131  182:iconst_3        
	//* 132  183:baload          
	//* 133  184:bastore         
	//* 134  185:iload_3         
	//* 135  186:iconst_1        
	//* 136  187:iadd            
	//* 137  188:istore_3        
	//* 138  189:goto            90
			flag = false;
	//  139  192:iconst_0        
	//  140  193:istore_2        
		l = 0 + 1;
		s[0] = 1;
		j = l + 1;
		s[l] = 1;
		s[j] = 1;
		abyte0 = PARITYE[ai[ai.length - 1]];
		l = 1;
		j++;
		while(l < ai.length - 1) 
		{
			int i1 = ai[l];
			byte abyte1[] = BARS[i1];
			byte byte0 = abyte0[l - 1];
			if(flag)
				i1 = 1;
			else
	//* 141  194:goto            50
				i1 = 0;
	//  142  197:iconst_0        
	//  143  198:istore          4
			if(byte0 == i1)
			{
				i1 = j + 1;
				s[j] = abyte1[0];
				j = i1 + 1;
				s[i1] = abyte1[1];
				i1 = j + 1;
				s[j] = abyte1[2];
				j = i1 + 1;
				s[i1] = abyte1[3];
			} else
	//* 144  200:goto            128
			{
				int j1 = j + 1;
	//  145  203:iload_1         
	//  146  204:iconst_1        
	//  147  205:iadd            
	//  148  206:istore          4
				s[j] = abyte1[3];
	//  149  208:aload_0         
	//  150  209:iload_1         
	//  151  210:aload           8
	//  152  212:iconst_3        
	//  153  213:baload          
	//  154  214:bastore         
				j = j1 + 1;
	//  155  215:iload           4
	//  156  217:iconst_1        
	//  157  218:iadd            
	//  158  219:istore_1        
				s[j1] = abyte1[2];
	//  159  220:aload_0         
	//  160  221:iload           4
	//  161  223:aload           8
	//  162  225:iconst_2        
	//  163  226:baload          
	//  164  227:bastore         
				j1 = j + 1;
	//  165  228:iload_1         
	//  166  229:iconst_1        
	//  167  230:iadd            
	//  168  231:istore          4
				s[j] = abyte1[1];
	//  169  233:aload_0         
	//  170  234:iload_1         
	//  171  235:aload           8
	//  172  237:iconst_1        
	//  173  238:baload          
	//  174  239:bastore         
				j = j1 + 1;
	//  175  240:iload           4
	//  176  242:iconst_1        
	//  177  243:iadd            
	//  178  244:istore_1        
				s[j1] = abyte1[0];
	//  179  245:aload_0         
	//  180  246:iload           4
	//  181  248:aload           8
	//  182  250:iconst_0        
	//  183  251:baload          
	//  184  252:bastore         
			}
			l++;
		}
	//* 185  253:goto            185
		int k = j + 1;
	//  186  256:iload_1         
	//  187  257:iconst_1        
	//  188  258:iadd            
	//  189  259:istore_2        
		s[j] = 1;
	//  190  260:aload_0         
	//  191  261:iload_1         
	//  192  262:iconst_1        
	//  193  263:bastore         
		j = k + 1;
	//  194  264:iload_2         
	//  195  265:iconst_1        
	//  196  266:iadd            
	//  197  267:istore_1        
		s[k] = 1;
	//  198  268:aload_0         
	//  199  269:iload_2         
	//  200  270:iconst_1        
	//  201  271:bastore         
		k = j + 1;
	//  202  272:iload_1         
	//  203  273:iconst_1        
	//  204  274:iadd            
	//  205  275:istore_2        
		s[j] = 1;
	//  206  276:aload_0         
	//  207  277:iload_1         
	//  208  278:iconst_1        
	//  209  279:bastore         
		j = k + 1;
	//  210  280:iload_2         
	//  211  281:iconst_1        
	//  212  282:iadd            
	//  213  283:istore_1        
		s[k] = 1;
	//  214  284:aload_0         
	//  215  285:iload_2         
	//  216  286:iconst_1        
	//  217  287:bastore         
		k = j + 1;
	//  218  288:iload_1         
	//  219  289:iconst_1        
	//  220  290:iadd            
	//  221  291:istore_2        
		s[j] = 1;
	//  222  292:aload_0         
	//  223  293:iload_1         
	//  224  294:iconst_1        
	//  225  295:bastore         
		s[k] = 1;
	//  226  296:aload_0         
	//  227  297:iload_2         
	//  228  298:iconst_1        
	//  229  299:bastore         
		return ((byte []) (s));
	//  230  300:aload_0         
	//  231  301:areturn         
	}

	public Rectangle getBarcodeSize()
	{
		float f2;
		float f = barHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field float barHeight>
	//    2    4:fstore_1        
		f2 = f;
	//    3    5:fload_1         
	//    4    6:fstore_2        
		if(font != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #104 <Field BaseFont font>
	//*   7   11:ifnull          36
			if(baseline <= 0.0F)
	//*   8   14:aload_0         
	//*   9   15:getfield        #111 <Field float baseline>
	//*  10   18:fconst_0        
	//*  11   19:fcmpg           
	//*  12   20:ifgt            97
				f2 = f + (-baseline + size);
	//   13   23:fload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #111 <Field float baseline>
	//   16   28:fneg            
	//   17   29:aload_0         
	//   18   30:getfield        #108 <Field float size>
	//   19   33:fadd            
	//   20   34:fadd            
	//   21   35:fstore_2        
			else
	//*  22   36:aload_0         
	//*  23   37:getfield        #122 <Field int codeType>
	//*  24   40:tableswitch     1 6: default 80
	//	               1 120
	//	               2 169
	//	               3 180
	//	               4 243
	//	               5 306
	//	               6 317
	//*  25   80:new             #201 <Class RuntimeException>
	//*  26   83:dup             
	//*  27   84:ldc1            #203 <String "invalid.code.type">
	//*  28   86:iconst_0        
	//*  29   87:anewarray       Object[]
	//*  30   90:invokestatic    #211 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  31   93:invokespecial   #214 <Method void RuntimeException(String)>
	//*  32   96:athrow          
				f2 = f + (baseline - font.getFontDescriptor(3, size));
	//   33   97:fload_1         
	//   34   98:aload_0         
	//   35   99:getfield        #111 <Field float baseline>
	//   36  102:aload_0         
	//   37  103:getfield        #104 <Field BaseFont font>
	//   38  106:iconst_3        
	//   39  107:aload_0         
	//   40  108:getfield        #108 <Field float size>
	//   41  111:invokevirtual   #218 <Method float BaseFont.getFontDescriptor(int, float)>
	//   42  114:fsub            
	//   43  115:fadd            
	//   44  116:fstore_2        
		codeType;
		JVM INSTR tableswitch 1 6: default 80
	//	               1 120
	//	               2 169
	//	               3 180
	//	               4 243
	//	               5 306
	//	               6 317;
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.code.type", new Object[0]));
	//*  45  117:goto            36
_L2:
		float f1;
		float f3 = x * 95F;
	//   46  120:aload_0         
	//   47  121:getfield        #90  <Field float x>
	//   48  124:ldc1            #219 <Float 95F>
	//   49  126:fmul            
	//   50  127:fstore_3        
		f1 = f3;
	//   51  128:fload_3         
	//   52  129:fstore_1        
		if(font != null)
	//*  53  130:aload_0         
	//*  54  131:getfield        #104 <Field BaseFont font>
	//*  55  134:ifnull          159
			f1 = f3 + font.getWidthPoint(((int) (code.charAt(0))), size);
	//   56  137:fload_3         
	//   57  138:aload_0         
	//   58  139:getfield        #104 <Field BaseFont font>
	//   59  142:aload_0         
	//   60  143:getfield        #128 <Field String code>
	//   61  146:iconst_0        
	//   62  147:invokevirtual   #145 <Method char String.charAt(int)>
	//   63  150:aload_0         
	//   64  151:getfield        #108 <Field float size>
	//   65  154:invokevirtual   #222 <Method float BaseFont.getWidthPoint(int, float)>
	//   66  157:fadd            
	//   67  158:fstore_1        
_L9:
		return new Rectangle(f1, f2);
	//   68  159:new             #224 <Class Rectangle>
	//   69  162:dup             
	//   70  163:fload_1         
	//   71  164:fload_2         
	//   72  165:invokespecial   #227 <Method void Rectangle(float, float)>
	//   73  168:areturn         
_L3:
		f1 = x * 67F;
	//   74  169:aload_0         
	//   75  170:getfield        #90  <Field float x>
	//   76  173:ldc1            #228 <Float 67F>
	//   77  175:fmul            
	//   78  176:fstore_1        
		continue; /* Loop/switch isn't completed */
	//   79  177:goto            159
_L4:
		float f4 = x * 95F;
	//   80  180:aload_0         
	//   81  181:getfield        #90  <Field float x>
	//   82  184:ldc1            #219 <Float 95F>
	//   83  186:fmul            
	//   84  187:fstore_3        
		f1 = f4;
	//   85  188:fload_3         
	//   86  189:fstore_1        
		if(font != null)
	//*  87  190:aload_0         
	//*  88  191:getfield        #104 <Field BaseFont font>
	//*  89  194:ifnull          159
			f1 = f4 + (font.getWidthPoint(((int) (code.charAt(0))), size) + font.getWidthPoint(((int) (code.charAt(11))), size));
	//   90  197:fload_3         
	//   91  198:aload_0         
	//   92  199:getfield        #104 <Field BaseFont font>
	//   93  202:aload_0         
	//   94  203:getfield        #128 <Field String code>
	//   95  206:iconst_0        
	//   96  207:invokevirtual   #145 <Method char String.charAt(int)>
	//   97  210:aload_0         
	//   98  211:getfield        #108 <Field float size>
	//   99  214:invokevirtual   #222 <Method float BaseFont.getWidthPoint(int, float)>
	//  100  217:aload_0         
	//  101  218:getfield        #104 <Field BaseFont font>
	//  102  221:aload_0         
	//  103  222:getfield        #128 <Field String code>
	//  104  225:bipush          11
	//  105  227:invokevirtual   #145 <Method char String.charAt(int)>
	//  106  230:aload_0         
	//  107  231:getfield        #108 <Field float size>
	//  108  234:invokevirtual   #222 <Method float BaseFont.getWidthPoint(int, float)>
	//  109  237:fadd            
	//  110  238:fadd            
	//  111  239:fstore_1        
		continue; /* Loop/switch isn't completed */
	//  112  240:goto            159
_L5:
		float f5 = x * 51F;
	//  113  243:aload_0         
	//  114  244:getfield        #90  <Field float x>
	//  115  247:ldc1            #229 <Float 51F>
	//  116  249:fmul            
	//  117  250:fstore_3        
		f1 = f5;
	//  118  251:fload_3         
	//  119  252:fstore_1        
		if(font != null)
	//* 120  253:aload_0         
	//* 121  254:getfield        #104 <Field BaseFont font>
	//* 122  257:ifnull          159
			f1 = f5 + (font.getWidthPoint(((int) (code.charAt(0))), size) + font.getWidthPoint(((int) (code.charAt(7))), size));
	//  123  260:fload_3         
	//  124  261:aload_0         
	//  125  262:getfield        #104 <Field BaseFont font>
	//  126  265:aload_0         
	//  127  266:getfield        #128 <Field String code>
	//  128  269:iconst_0        
	//  129  270:invokevirtual   #145 <Method char String.charAt(int)>
	//  130  273:aload_0         
	//  131  274:getfield        #108 <Field float size>
	//  132  277:invokevirtual   #222 <Method float BaseFont.getWidthPoint(int, float)>
	//  133  280:aload_0         
	//  134  281:getfield        #104 <Field BaseFont font>
	//  135  284:aload_0         
	//  136  285:getfield        #128 <Field String code>
	//  137  288:bipush          7
	//  138  290:invokevirtual   #145 <Method char String.charAt(int)>
	//  139  293:aload_0         
	//  140  294:getfield        #108 <Field float size>
	//  141  297:invokevirtual   #222 <Method float BaseFont.getWidthPoint(int, float)>
	//  142  300:fadd            
	//  143  301:fadd            
	//  144  302:fstore_1        
		continue; /* Loop/switch isn't completed */
	//  145  303:goto            159
_L6:
		f1 = x * 20F;
	//  146  306:aload_0         
	//  147  307:getfield        #90  <Field float x>
	//  148  310:ldc1            #230 <Float 20F>
	//  149  312:fmul            
	//  150  313:fstore_1        
		continue; /* Loop/switch isn't completed */
	//  151  314:goto            159
_L7:
		f1 = x * 47F;
	//  152  317:aload_0         
	//  153  318:getfield        #90  <Field float x>
	//  154  321:ldc1            #231 <Float 47F>
	//  155  323:fmul            
	//  156  324:fstore_1        
		if(true) goto _L9; else goto _L8
	//  157  325:goto            159
_L8:
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		float f;
		float f1;
		float f3;
		float f7;
		byte abyte0[];
		int ai[];
		Rectangle rectangle;
		rectangle = getBarcodeSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method Rectangle getBarcodeSize()>
	//    2    4:astore          14
		f3 = 0.0F;
	//    3    6:fconst_0        
	//    4    7:fstore          6
		f1 = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore          5
		f = 0.0F;
	//    7   12:fconst_0        
	//    8   13:fstore          4
		f7 = f1;
	//    9   15:fload           5
	//   10   17:fstore          7
		float f8;
		int j1;
		if(font != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #104 <Field BaseFont font>
	//*  13   23:ifnull          50
			if(baseline <= 0.0F)
	//*  14   26:aload_0         
	//*  15   27:getfield        #111 <Field float baseline>
	//*  16   30:fconst_0        
	//*  17   31:fcmpg           
	//*  18   32:ifgt            294
			{
				f = barHeight - baseline;
	//   19   35:aload_0         
	//   20   36:getfield        #115 <Field float barHeight>
	//   21   39:aload_0         
	//   22   40:getfield        #111 <Field float baseline>
	//   23   43:fsub            
	//   24   44:fstore          4
				f7 = f1;
	//   25   46:fload           5
	//   26   48:fstore          7
			} else
	//*  27   50:fload           6
	//*  28   52:fstore          5
	//*  29   54:aload_0         
	//*  30   55:getfield        #122 <Field int codeType>
	//*  31   58:tableswitch     1 4: default 88
	//	               1 321
	//	               2 92
	//	               3 321
	//	               4 321
	//*  32   88:fload           6
	//*  33   90:fstore          5
	//*  34   92:aconst_null     
	//*  35   93:astore          12
	//*  36   95:getstatic       #38  <Field int[] GUARD_EMPTY>
	//*  37   98:astore          13
	//*  38  100:aload_0         
	//*  39  101:getfield        #122 <Field int codeType>
	//*  40  104:tableswitch     1 6: default 144
	//	               1 358
	//	               2 375
	//	               3 392
	//	               4 427
	//	               5 444
	//	               6 456
	//*  41  144:iconst_1        
	//*  42  145:istore          10
	//*  43  147:fconst_0        
	//*  44  148:fstore          6
	//*  45  150:fload           6
	//*  46  152:fstore          8
	//*  47  154:aload_0         
	//*  48  155:getfield        #104 <Field BaseFont font>
	//*  49  158:ifnull          193
	//*  50  161:fload           6
	//*  51  163:fstore          8
	//*  52  165:aload_0         
	//*  53  166:getfield        #111 <Field float baseline>
	//*  54  169:fconst_0        
	//*  55  170:fcmpl           
	//*  56  171:ifle            193
	//*  57  174:fload           6
	//*  58  176:fstore          8
	//*  59  178:aload_0         
	//*  60  179:getfield        #119 <Field boolean guardBars>
	//*  61  182:ifeq            193
	//*  62  185:aload_0         
	//*  63  186:getfield        #111 <Field float baseline>
	//*  64  189:fconst_2        
	//*  65  190:fdiv            
	//*  66  191:fstore          8
	//*  67  193:aload_2         
	//*  68  194:ifnull          202
	//*  69  197:aload_1         
	//*  70  198:aload_2         
	//*  71  199:invokevirtual   #241 <Method void PdfContentByte.setColorFill(BaseColor)>
	//*  72  202:iconst_0        
	//*  73  203:istore          11
	//*  74  205:fload           5
	//*  75  207:fstore          6
	//*  76  209:iload           11
	//*  77  211:aload           12
	//*  78  213:arraylength     
	//*  79  214:icmpge          496
	//*  80  217:aload           12
	//*  81  219:iload           11
	//*  82  221:baload          
	//*  83  222:i2f             
	//*  84  223:aload_0         
	//*  85  224:getfield        #90  <Field float x>
	//*  86  227:fmul            
	//*  87  228:fstore          9
	//*  88  230:iload           10
	//*  89  232:ifeq            270
	//*  90  235:aload           13
	//*  91  237:iload           11
	//*  92  239:invokestatic    #247 <Method int Arrays.binarySearch(int[], int)>
	//*  93  242:iflt            468
	//*  94  245:aload_1         
	//*  95  246:fload           6
	//*  96  248:fload           7
	//*  97  250:fload           8
	//*  98  252:fsub            
	//*  99  253:fload           9
	//* 100  255:aload_0         
	//* 101  256:getfield        #250 <Field float inkSpreading>
	//* 102  259:fsub            
	//* 103  260:aload_0         
	//* 104  261:getfield        #115 <Field float barHeight>
	//* 105  264:fload           8
	//* 106  266:fadd            
	//* 107  267:invokevirtual   #254 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 108  270:iload           10
	//* 109  272:ifne            490
	//* 110  275:iconst_1        
	//* 111  276:istore          10
	//* 112  278:fload           6
	//* 113  280:fload           9
	//* 114  282:fadd            
	//* 115  283:fstore          6
	//* 116  285:iload           11
	//* 117  287:iconst_1        
	//* 118  288:iadd            
	//* 119  289:istore          11
	//* 120  291:goto            209
			{
				f = -font.getFontDescriptor(3, size);
	//  121  294:aload_0         
	//  122  295:getfield        #104 <Field BaseFont font>
	//  123  298:iconst_3        
	//  124  299:aload_0         
	//  125  300:getfield        #108 <Field float size>
	//  126  303:invokevirtual   #218 <Method float BaseFont.getFontDescriptor(int, float)>
	//  127  306:fneg            
	//  128  307:fstore          4
				f7 = f + baseline;
	//  129  309:fload           4
	//  130  311:aload_0         
	//  131  312:getfield        #111 <Field float baseline>
	//  132  315:fadd            
	//  133  316:fstore          7
			}
		f1 = f3;
		codeType;
		JVM INSTR tableswitch 1 4: default 88
	//	               1 321
	//	               2 92
	//	               3 321
	//	               4 321;
		   goto _L1 _L2 _L3 _L2 _L2
_L1:
		f1 = f3;
_L3:
		abyte0 = null;
		ai = GUARD_EMPTY;
		codeType;
		JVM INSTR tableswitch 1 6: default 144
	//	               1 358
	//	               2 375
	//	               3 392
	//	               4 427
	//	               5 444
	//	               6 456;
		   goto _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L4:
		break; /* Loop/switch isn't completed */
	//* 134  318:goto            50
_L2:
		f1 = f3;
	//  135  321:fload           6
	//  136  323:fstore          5
		if(font != null)
	//* 137  325:aload_0         
	//* 138  326:getfield        #104 <Field BaseFont font>
	//* 139  329:ifnull          92
			f1 = 0.0F + font.getWidthPoint(((int) (code.charAt(0))), size);
	//  140  332:fconst_0        
	//  141  333:aload_0         
	//  142  334:getfield        #104 <Field BaseFont font>
	//  143  337:aload_0         
	//  144  338:getfield        #128 <Field String code>
	//  145  341:iconst_0        
	//  146  342:invokevirtual   #145 <Method char String.charAt(int)>
	//  147  345:aload_0         
	//  148  346:getfield        #108 <Field float size>
	//  149  349:invokevirtual   #222 <Method float BaseFont.getWidthPoint(int, float)>
	//  150  352:fadd            
	//  151  353:fstore          5
		continue; /* Loop/switch isn't completed */
	//  152  355:goto            92
_L5:
		abyte0 = getBarsEAN13(code);
	//  153  358:aload_0         
	//  154  359:getfield        #128 <Field String code>
	//  155  362:invokestatic    #256 <Method byte[] getBarsEAN13(String)>
	//  156  365:astore          12
		ai = GUARD_EAN13;
	//  157  367:getstatic       #42  <Field int[] GUARD_EAN13>
	//  158  370:astore          13
		  goto _L11
	//* 159  372:goto            144
_L6:
		abyte0 = getBarsEAN8(code);
	//  160  375:aload_0         
	//  161  376:getfield        #128 <Field String code>
	//  162  379:invokestatic    #258 <Method byte[] getBarsEAN8(String)>
	//  163  382:astore          12
		ai = GUARD_EAN8;
	//  164  384:getstatic       #44  <Field int[] GUARD_EAN8>
	//  165  387:astore          13
		  goto _L11
	//* 166  389:goto            144
_L7:
		abyte0 = getBarsEAN13((new StringBuilder()).append("0").append(code).toString());
	//  167  392:new             #173 <Class StringBuilder>
	//  168  395:dup             
	//  169  396:invokespecial   #174 <Method void StringBuilder()>
	//  170  399:ldc1            #149 <String "0">
	//  171  401:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  172  404:aload_0         
	//  173  405:getfield        #128 <Field String code>
	//  174  408:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  175  411:invokevirtual   #185 <Method String StringBuilder.toString()>
	//  176  414:invokestatic    #256 <Method byte[] getBarsEAN13(String)>
	//  177  417:astore          12
		ai = GUARD_UPCA;
	//  178  419:getstatic       #40  <Field int[] GUARD_UPCA>
	//  179  422:astore          13
		  goto _L11
	//* 180  424:goto            144
_L8:
		abyte0 = getBarsUPCE(code);
	//  181  427:aload_0         
	//  182  428:getfield        #128 <Field String code>
	//  183  431:invokestatic    #260 <Method byte[] getBarsUPCE(String)>
	//  184  434:astore          12
		ai = GUARD_UPCE;
	//  185  436:getstatic       #46  <Field int[] GUARD_UPCE>
	//  186  439:astore          13
		  goto _L11
	//* 187  441:goto            144
_L9:
		abyte0 = getBarsSupplemental2(code);
	//  188  444:aload_0         
	//  189  445:getfield        #128 <Field String code>
	//  190  448:invokestatic    #262 <Method byte[] getBarsSupplemental2(String)>
	//  191  451:astore          12
		  goto _L11
	//* 192  453:goto            144
_L10:
		abyte0 = getBarsSupplemental5(code);
	//  193  456:aload_0         
	//  194  457:getfield        #128 <Field String code>
	//  195  460:invokestatic    #264 <Method byte[] getBarsSupplemental5(String)>
	//  196  463:astore          12
_L11:
		boolean flag = true;
		f3 = 0.0F;
		f8 = f3;
		if(font != null)
		{
			f8 = f3;
			if(baseline > 0.0F)
			{
				f8 = f3;
				if(guardBars)
					f8 = baseline / 2.0F;
			}
		}
		if(basecolor != null)
			pdfcontentbyte.setColorFill(basecolor);
		j1 = 0;
		f3 = f1;
		while(j1 < abyte0.length) 
		{
			float f9 = (float)abyte0[j1] * x;
			if(flag)
				if(Arrays.binarySearch(ai, j1) >= 0)
					pdfcontentbyte.rectangle(f3, f7 - f8, f9 - inkSpreading, barHeight + f8);
				else
	//* 197  465:goto            144
					pdfcontentbyte.rectangle(f3, f7, f9 - inkSpreading, barHeight);
	//  198  468:aload_1         
	//  199  469:fload           6
	//  200  471:fload           7
	//  201  473:fload           9
	//  202  475:aload_0         
	//  203  476:getfield        #250 <Field float inkSpreading>
	//  204  479:fsub            
	//  205  480:aload_0         
	//  206  481:getfield        #115 <Field float barHeight>
	//  207  484:invokevirtual   #254 <Method void PdfContentByte.rectangle(float, float, float, float)>
			if(!flag)
				flag = true;
			else
	//* 208  487:goto            270
				flag = false;
	//  209  490:iconst_0        
	//  210  491:istore          10
			f3 += f9;
			j1++;
		}
	//* 211  493:goto            278
		pdfcontentbyte.fill();
	//  212  496:aload_1         
	//  213  497:invokevirtual   #267 <Method void PdfContentByte.fill()>
		if(font == null) goto _L13; else goto _L12
	//  214  500:aload_0         
	//  215  501:getfield        #104 <Field BaseFont font>
	//  216  504:ifnull          580
_L12:
		if(basecolor1 != null)
	//* 217  507:aload_3         
	//* 218  508:ifnull          516
			pdfcontentbyte.setColorFill(basecolor1);
	//  219  511:aload_1         
	//  220  512:aload_3         
	//  221  513:invokevirtual   #241 <Method void PdfContentByte.setColorFill(BaseColor)>
		pdfcontentbyte.beginText();
	//  222  516:aload_1         
	//  223  517:invokevirtual   #270 <Method void PdfContentByte.beginText()>
		pdfcontentbyte.setFontAndSize(font, size);
	//  224  520:aload_1         
	//  225  521:aload_0         
	//  226  522:getfield        #104 <Field BaseFont font>
	//  227  525:aload_0         
	//  228  526:getfield        #108 <Field float size>
	//  229  529:invokevirtual   #274 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
		codeType;
	//  230  532:aload_0         
	//  231  533:getfield        #122 <Field int codeType>
		JVM INSTR tableswitch 1 6: default 576
	//	               1 583
	//	               2 682
	//	               3 756
	//	               4 887
	//	               5 1020
	//	               6 1020;
	//  232  536:tableswitch     1 6: default 576
	//	               1 583
	//	               2 682
	//	               3 756
	//	               4 887
	//	               5 1020
	//	               6 1020
		   goto _L14 _L15 _L16 _L17 _L18 _L19 _L19
_L14:
		pdfcontentbyte.endText();
	//  233  576:aload_1         
	//  234  577:invokevirtual   #277 <Method void PdfContentByte.endText()>
_L13:
		return rectangle;
	//  235  580:aload           14
	//  236  582:areturn         
_L15:
		pdfcontentbyte.setTextMatrix(0.0F, f);
	//  237  583:aload_1         
	//  238  584:fconst_0        
	//  239  585:fload           4
	//  240  587:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
		pdfcontentbyte.showText(code.substring(0, 1));
	//  241  590:aload_1         
	//  242  591:aload_0         
	//  243  592:getfield        #128 <Field String code>
	//  244  595:iconst_0        
	//  245  596:iconst_1        
	//  246  597:invokevirtual   #159 <Method String String.substring(int, int)>
	//  247  600:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		int i = 1;
	//  248  603:iconst_1        
	//  249  604:istore          10
		while(i < 13) 
	//* 250  606:iload           10
	//* 251  608:bipush          13
	//* 252  610:icmpge          576
		{
			basecolor = ((BaseColor) (code.substring(i, i + 1)));
	//  253  613:aload_0         
	//  254  614:getfield        #128 <Field String code>
	//  255  617:iload           10
	//  256  619:iload           10
	//  257  621:iconst_1        
	//  258  622:iadd            
	//  259  623:invokevirtual   #159 <Method String String.substring(int, int)>
	//  260  626:astore_2        
			float f4 = font.getWidthPoint(((String) (basecolor)), size);
	//  261  627:aload_0         
	//  262  628:getfield        #104 <Field BaseFont font>
	//  263  631:aload_2         
	//  264  632:aload_0         
	//  265  633:getfield        #108 <Field float size>
	//  266  636:invokevirtual   #286 <Method float BaseFont.getWidthPoint(String, float)>
	//  267  639:fstore          6
			pdfcontentbyte.setTextMatrix((TEXTPOS_EAN13[i - 1] * x + f1) - f4 / 2.0F, f);
	//  268  641:aload_1         
	//  269  642:getstatic       #60  <Field float[] TEXTPOS_EAN13>
	//  270  645:iload           10
	//  271  647:iconst_1        
	//  272  648:isub            
	//  273  649:faload          
	//  274  650:aload_0         
	//  275  651:getfield        #90  <Field float x>
	//  276  654:fmul            
	//  277  655:fload           5
	//  278  657:fadd            
	//  279  658:fload           6
	//  280  660:fconst_2        
	//  281  661:fdiv            
	//  282  662:fsub            
	//  283  663:fload           4
	//  284  665:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (basecolor)));
	//  285  668:aload_1         
	//  286  669:aload_2         
	//  287  670:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
			i++;
	//  288  673:iload           10
	//  289  675:iconst_1        
	//  290  676:iadd            
	//  291  677:istore          10
		}
		continue; /* Loop/switch isn't completed */
	//  292  679:goto            606
_L16:
		int j = 0;
	//  293  682:iconst_0        
	//  294  683:istore          10
		while(j < 8) 
	//* 295  685:iload           10
	//* 296  687:bipush          8
	//* 297  689:icmpge          576
		{
			basecolor = ((BaseColor) (code.substring(j, j + 1)));
	//  298  692:aload_0         
	//  299  693:getfield        #128 <Field String code>
	//  300  696:iload           10
	//  301  698:iload           10
	//  302  700:iconst_1        
	//  303  701:iadd            
	//  304  702:invokevirtual   #159 <Method String String.substring(int, int)>
	//  305  705:astore_2        
			f1 = font.getWidthPoint(((String) (basecolor)), size);
	//  306  706:aload_0         
	//  307  707:getfield        #104 <Field BaseFont font>
	//  308  710:aload_2         
	//  309  711:aload_0         
	//  310  712:getfield        #108 <Field float size>
	//  311  715:invokevirtual   #286 <Method float BaseFont.getWidthPoint(String, float)>
	//  312  718:fstore          5
			pdfcontentbyte.setTextMatrix(TEXTPOS_EAN8[j] * x - f1 / 2.0F, f);
	//  313  720:aload_1         
	//  314  721:getstatic       #64  <Field float[] TEXTPOS_EAN8>
	//  315  724:iload           10
	//  316  726:faload          
	//  317  727:aload_0         
	//  318  728:getfield        #90  <Field float x>
	//  319  731:fmul            
	//  320  732:fload           5
	//  321  734:fconst_2        
	//  322  735:fdiv            
	//  323  736:fsub            
	//  324  737:fload           4
	//  325  739:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (basecolor)));
	//  326  742:aload_1         
	//  327  743:aload_2         
	//  328  744:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
			j++;
	//  329  747:iload           10
	//  330  749:iconst_1        
	//  331  750:iadd            
	//  332  751:istore          10
		}
		continue; /* Loop/switch isn't completed */
	//  333  753:goto            685
_L17:
		pdfcontentbyte.setTextMatrix(0.0F, f);
	//  334  756:aload_1         
	//  335  757:fconst_0        
	//  336  758:fload           4
	//  337  760:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
		pdfcontentbyte.showText(code.substring(0, 1));
	//  338  763:aload_1         
	//  339  764:aload_0         
	//  340  765:getfield        #128 <Field String code>
	//  341  768:iconst_0        
	//  342  769:iconst_1        
	//  343  770:invokevirtual   #159 <Method String String.substring(int, int)>
	//  344  773:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		for(int k = 1; k < 11; k++)
	//* 345  776:iconst_1        
	//* 346  777:istore          10
	//* 347  779:iload           10
	//* 348  781:bipush          11
	//* 349  783:icmpge          853
		{
			basecolor = ((BaseColor) (code.substring(k, k + 1)));
	//  350  786:aload_0         
	//  351  787:getfield        #128 <Field String code>
	//  352  790:iload           10
	//  353  792:iload           10
	//  354  794:iconst_1        
	//  355  795:iadd            
	//  356  796:invokevirtual   #159 <Method String String.substring(int, int)>
	//  357  799:astore_2        
			float f5 = font.getWidthPoint(((String) (basecolor)), size);
	//  358  800:aload_0         
	//  359  801:getfield        #104 <Field BaseFont font>
	//  360  804:aload_2         
	//  361  805:aload_0         
	//  362  806:getfield        #108 <Field float size>
	//  363  809:invokevirtual   #286 <Method float BaseFont.getWidthPoint(String, float)>
	//  364  812:fstore          6
			pdfcontentbyte.setTextMatrix((TEXTPOS_EAN13[k] * x + f1) - f5 / 2.0F, f);
	//  365  814:aload_1         
	//  366  815:getstatic       #60  <Field float[] TEXTPOS_EAN13>
	//  367  818:iload           10
	//  368  820:faload          
	//  369  821:aload_0         
	//  370  822:getfield        #90  <Field float x>
	//  371  825:fmul            
	//  372  826:fload           5
	//  373  828:fadd            
	//  374  829:fload           6
	//  375  831:fconst_2        
	//  376  832:fdiv            
	//  377  833:fsub            
	//  378  834:fload           4
	//  379  836:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (basecolor)));
	//  380  839:aload_1         
	//  381  840:aload_2         
	//  382  841:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		}

	//  383  844:iload           10
	//  384  846:iconst_1        
	//  385  847:iadd            
	//  386  848:istore          10
	//* 387  850:goto            779
		pdfcontentbyte.setTextMatrix(x * 95F + f1, f);
	//  388  853:aload_1         
	//  389  854:aload_0         
	//  390  855:getfield        #90  <Field float x>
	//  391  858:ldc1            #219 <Float 95F>
	//  392  860:fmul            
	//  393  861:fload           5
	//  394  863:fadd            
	//  395  864:fload           4
	//  396  866:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
		pdfcontentbyte.showText(code.substring(11, 12));
	//  397  869:aload_1         
	//  398  870:aload_0         
	//  399  871:getfield        #128 <Field String code>
	//  400  874:bipush          11
	//  401  876:bipush          12
	//  402  878:invokevirtual   #159 <Method String String.substring(int, int)>
	//  403  881:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		continue; /* Loop/switch isn't completed */
	//  404  884:goto            576
_L18:
		pdfcontentbyte.setTextMatrix(0.0F, f);
	//  405  887:aload_1         
	//  406  888:fconst_0        
	//  407  889:fload           4
	//  408  891:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
		pdfcontentbyte.showText(code.substring(0, 1));
	//  409  894:aload_1         
	//  410  895:aload_0         
	//  411  896:getfield        #128 <Field String code>
	//  412  899:iconst_0        
	//  413  900:iconst_1        
	//  414  901:invokevirtual   #159 <Method String String.substring(int, int)>
	//  415  904:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		for(int l = 1; l < 7; l++)
	//* 416  907:iconst_1        
	//* 417  908:istore          10
	//* 418  910:iload           10
	//* 419  912:bipush          7
	//* 420  914:icmpge          986
		{
			basecolor = ((BaseColor) (code.substring(l, l + 1)));
	//  421  917:aload_0         
	//  422  918:getfield        #128 <Field String code>
	//  423  921:iload           10
	//  424  923:iload           10
	//  425  925:iconst_1        
	//  426  926:iadd            
	//  427  927:invokevirtual   #159 <Method String String.substring(int, int)>
	//  428  930:astore_2        
			float f6 = font.getWidthPoint(((String) (basecolor)), size);
	//  429  931:aload_0         
	//  430  932:getfield        #104 <Field BaseFont font>
	//  431  935:aload_2         
	//  432  936:aload_0         
	//  433  937:getfield        #108 <Field float size>
	//  434  940:invokevirtual   #286 <Method float BaseFont.getWidthPoint(String, float)>
	//  435  943:fstore          6
			pdfcontentbyte.setTextMatrix((TEXTPOS_EAN13[l - 1] * x + f1) - f6 / 2.0F, f);
	//  436  945:aload_1         
	//  437  946:getstatic       #60  <Field float[] TEXTPOS_EAN13>
	//  438  949:iload           10
	//  439  951:iconst_1        
	//  440  952:isub            
	//  441  953:faload          
	//  442  954:aload_0         
	//  443  955:getfield        #90  <Field float x>
	//  444  958:fmul            
	//  445  959:fload           5
	//  446  961:fadd            
	//  447  962:fload           6
	//  448  964:fconst_2        
	//  449  965:fdiv            
	//  450  966:fsub            
	//  451  967:fload           4
	//  452  969:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (basecolor)));
	//  453  972:aload_1         
	//  454  973:aload_2         
	//  455  974:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		}

	//  456  977:iload           10
	//  457  979:iconst_1        
	//  458  980:iadd            
	//  459  981:istore          10
	//* 460  983:goto            910
		pdfcontentbyte.setTextMatrix(x * 51F + f1, f);
	//  461  986:aload_1         
	//  462  987:aload_0         
	//  463  988:getfield        #90  <Field float x>
	//  464  991:ldc1            #229 <Float 51F>
	//  465  993:fmul            
	//  466  994:fload           5
	//  467  996:fadd            
	//  468  997:fload           4
	//  469  999:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
		pdfcontentbyte.showText(code.substring(7, 8));
	//  470 1002:aload_1         
	//  471 1003:aload_0         
	//  472 1004:getfield        #128 <Field String code>
	//  473 1007:bipush          7
	//  474 1009:bipush          8
	//  475 1011:invokevirtual   #159 <Method String String.substring(int, int)>
	//  476 1014:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
		if(true) goto _L14; else goto _L19
	//  477 1017:goto            576
_L19:
		int i1 = 0;
	//  478 1020:iconst_0        
	//  479 1021:istore          10
		while(i1 < code.length()) 
	//* 480 1023:iload           10
	//* 481 1025:aload_0         
	//* 482 1026:getfield        #128 <Field String code>
	//* 483 1029:invokevirtual   #141 <Method int String.length()>
	//* 484 1032:icmpge          576
		{
			basecolor = ((BaseColor) (code.substring(i1, i1 + 1)));
	//  485 1035:aload_0         
	//  486 1036:getfield        #128 <Field String code>
	//  487 1039:iload           10
	//  488 1041:iload           10
	//  489 1043:iconst_1        
	//  490 1044:iadd            
	//  491 1045:invokevirtual   #159 <Method String String.substring(int, int)>
	//  492 1048:astore_2        
			float f2 = font.getWidthPoint(((String) (basecolor)), size);
	//  493 1049:aload_0         
	//  494 1050:getfield        #104 <Field BaseFont font>
	//  495 1053:aload_2         
	//  496 1054:aload_0         
	//  497 1055:getfield        #108 <Field float size>
	//  498 1058:invokevirtual   #286 <Method float BaseFont.getWidthPoint(String, float)>
	//  499 1061:fstore          5
			pdfcontentbyte.setTextMatrix((7.5F + (float)(i1 * 9)) * x - f2 / 2.0F, f);
	//  500 1063:aload_1         
	//  501 1064:ldc2            #287 <Float 7.5F>
	//  502 1067:iload           10
	//  503 1069:bipush          9
	//  504 1071:imul            
	//  505 1072:i2f             
	//  506 1073:fadd            
	//  507 1074:aload_0         
	//  508 1075:getfield        #90  <Field float x>
	//  509 1078:fmul            
	//  510 1079:fload           5
	//  511 1081:fconst_2        
	//  512 1082:fdiv            
	//  513 1083:fsub            
	//  514 1084:fload           4
	//  515 1086:invokevirtual   #280 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (basecolor)));
	//  516 1089:aload_1         
	//  517 1090:aload_2         
	//  518 1091:invokevirtual   #283 <Method void PdfContentByte.showText(String)>
			i1++;
	//  519 1094:iload           10
	//  520 1096:iconst_1        
	//  521 1097:iadd            
	//  522 1098:istore          10
		}
		if(true) goto _L14; else goto _L20
	//  523 1100:goto            1023
_L20:
		if(true) goto _L3; else goto _L21
_L21:
	}

	private static final byte BARS[][];
	private static final int EVEN = 1;
	private static final int GUARD_EAN13[] = {
		0, 2, 28, 30, 56, 58
	};
	private static final int GUARD_EAN8[] = {
		0, 2, 20, 22, 40, 42
	};
	private static final int GUARD_EMPTY[] = new int[0];
	private static final int GUARD_UPCA[] = {
		0, 2, 4, 6, 28, 30, 52, 54, 56, 58
	};
	private static final int GUARD_UPCE[] = {
		0, 2, 28, 30, 32
	};
	private static final int ODD = 0;
	private static final byte PARITY13[][];
	private static final byte PARITY2[][];
	private static final byte PARITY5[][];
	private static final byte PARITYE[][];
	private static final float TEXTPOS_EAN13[] = {
		6.5F, 13.5F, 20.5F, 27.5F, 34.5F, 41.5F, 53.5F, 60.5F, 67.5F, 74.5F, 
		81.5F, 88.5F
	};
	private static final float TEXTPOS_EAN8[] = {
		6.5F, 13.5F, 20.5F, 27.5F, 39.5F, 46.5F, 53.5F, 60.5F
	};
	private static final int TOTALBARS_EAN13 = 59;
	private static final int TOTALBARS_EAN8 = 43;
	private static final int TOTALBARS_SUPP2 = 13;
	private static final int TOTALBARS_SUPP5 = 31;
	private static final int TOTALBARS_UPCE = 33;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #38  <Field int[] GUARD_EMPTY>
	//    3    6:bipush          10
	//    4    8:newarray        int[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:iconst_0        
	//    8   13:iastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iconst_2        
	//   12   17:iastore         
	//   13   18:dup             
	//   14   19:iconst_2        
	//   15   20:iconst_4        
	//   16   21:iastore         
	//   17   22:dup             
	//   18   23:iconst_3        
	//   19   24:bipush          6
	//   20   26:iastore         
	//   21   27:dup             
	//   22   28:iconst_4        
	//   23   29:bipush          28
	//   24   31:iastore         
	//   25   32:dup             
	//   26   33:iconst_5        
	//   27   34:bipush          30
	//   28   36:iastore         
	//   29   37:dup             
	//   30   38:bipush          6
	//   31   40:bipush          52
	//   32   42:iastore         
	//   33   43:dup             
	//   34   44:bipush          7
	//   35   46:bipush          54
	//   36   48:iastore         
	//   37   49:dup             
	//   38   50:bipush          8
	//   39   52:bipush          56
	//   40   54:iastore         
	//   41   55:dup             
	//   42   56:bipush          9
	//   43   58:bipush          58
	//   44   60:iastore         
	//   45   61:putstatic       #40  <Field int[] GUARD_UPCA>
	//   46   64:bipush          6
	//   47   66:newarray        int[]
	//   48   68:dup             
	//   49   69:iconst_0        
	//   50   70:iconst_0        
	//   51   71:iastore         
	//   52   72:dup             
	//   53   73:iconst_1        
	//   54   74:iconst_2        
	//   55   75:iastore         
	//   56   76:dup             
	//   57   77:iconst_2        
	//   58   78:bipush          28
	//   59   80:iastore         
	//   60   81:dup             
	//   61   82:iconst_3        
	//   62   83:bipush          30
	//   63   85:iastore         
	//   64   86:dup             
	//   65   87:iconst_4        
	//   66   88:bipush          56
	//   67   90:iastore         
	//   68   91:dup             
	//   69   92:iconst_5        
	//   70   93:bipush          58
	//   71   95:iastore         
	//   72   96:putstatic       #42  <Field int[] GUARD_EAN13>
	//   73   99:bipush          6
	//   74  101:newarray        int[]
	//   75  103:dup             
	//   76  104:iconst_0        
	//   77  105:iconst_0        
	//   78  106:iastore         
	//   79  107:dup             
	//   80  108:iconst_1        
	//   81  109:iconst_2        
	//   82  110:iastore         
	//   83  111:dup             
	//   84  112:iconst_2        
	//   85  113:bipush          20
	//   86  115:iastore         
	//   87  116:dup             
	//   88  117:iconst_3        
	//   89  118:bipush          22
	//   90  120:iastore         
	//   91  121:dup             
	//   92  122:iconst_4        
	//   93  123:bipush          40
	//   94  125:iastore         
	//   95  126:dup             
	//   96  127:iconst_5        
	//   97  128:bipush          42
	//   98  130:iastore         
	//   99  131:putstatic       #44  <Field int[] GUARD_EAN8>
	//  100  134:iconst_5        
	//  101  135:newarray        int[]
	//  102  137:dup             
	//  103  138:iconst_0        
	//  104  139:iconst_0        
	//  105  140:iastore         
	//  106  141:dup             
	//  107  142:iconst_1        
	//  108  143:iconst_2        
	//  109  144:iastore         
	//  110  145:dup             
	//  111  146:iconst_2        
	//  112  147:bipush          28
	//  113  149:iastore         
	//  114  150:dup             
	//  115  151:iconst_3        
	//  116  152:bipush          30
	//  117  154:iastore         
	//  118  155:dup             
	//  119  156:iconst_4        
	//  120  157:bipush          32
	//  121  159:iastore         
	//  122  160:putstatic       #46  <Field int[] GUARD_UPCE>
	//  123  163:bipush          12
	//  124  165:newarray        float[]
	//  125  167:dup             
	//  126  168:iconst_0        
	//  127  169:ldc1            #47  <Float 6.5F>
	//  128  171:fastore         
	//  129  172:dup             
	//  130  173:iconst_1        
	//  131  174:ldc1            #48  <Float 13.5F>
	//  132  176:fastore         
	//  133  177:dup             
	//  134  178:iconst_2        
	//  135  179:ldc1            #49  <Float 20.5F>
	//  136  181:fastore         
	//  137  182:dup             
	//  138  183:iconst_3        
	//  139  184:ldc1            #50  <Float 27.5F>
	//  140  186:fastore         
	//  141  187:dup             
	//  142  188:iconst_4        
	//  143  189:ldc1            #51  <Float 34.5F>
	//  144  191:fastore         
	//  145  192:dup             
	//  146  193:iconst_5        
	//  147  194:ldc1            #52  <Float 41.5F>
	//  148  196:fastore         
	//  149  197:dup             
	//  150  198:bipush          6
	//  151  200:ldc1            #53  <Float 53.5F>
	//  152  202:fastore         
	//  153  203:dup             
	//  154  204:bipush          7
	//  155  206:ldc1            #54  <Float 60.5F>
	//  156  208:fastore         
	//  157  209:dup             
	//  158  210:bipush          8
	//  159  212:ldc1            #55  <Float 67.5F>
	//  160  214:fastore         
	//  161  215:dup             
	//  162  216:bipush          9
	//  163  218:ldc1            #56  <Float 74.5F>
	//  164  220:fastore         
	//  165  221:dup             
	//  166  222:bipush          10
	//  167  224:ldc1            #57  <Float 81.5F>
	//  168  226:fastore         
	//  169  227:dup             
	//  170  228:bipush          11
	//  171  230:ldc1            #58  <Float 88.5F>
	//  172  232:fastore         
	//  173  233:putstatic       #60  <Field float[] TEXTPOS_EAN13>
	//  174  236:bipush          8
	//  175  238:newarray        float[]
	//  176  240:dup             
	//  177  241:iconst_0        
	//  178  242:ldc1            #47  <Float 6.5F>
	//  179  244:fastore         
	//  180  245:dup             
	//  181  246:iconst_1        
	//  182  247:ldc1            #48  <Float 13.5F>
	//  183  249:fastore         
	//  184  250:dup             
	//  185  251:iconst_2        
	//  186  252:ldc1            #49  <Float 20.5F>
	//  187  254:fastore         
	//  188  255:dup             
	//  189  256:iconst_3        
	//  190  257:ldc1            #50  <Float 27.5F>
	//  191  259:fastore         
	//  192  260:dup             
	//  193  261:iconst_4        
	//  194  262:ldc1            #61  <Float 39.5F>
	//  195  264:fastore         
	//  196  265:dup             
	//  197  266:iconst_5        
	//  198  267:ldc1            #62  <Float 46.5F>
	//  199  269:fastore         
	//  200  270:dup             
	//  201  271:bipush          6
	//  202  273:ldc1            #53  <Float 53.5F>
	//  203  275:fastore         
	//  204  276:dup             
	//  205  277:bipush          7
	//  206  279:ldc1            #54  <Float 60.5F>
	//  207  281:fastore         
	//  208  282:putstatic       #64  <Field float[] TEXTPOS_EAN8>
		byte abyte0[] = {
			2, 2, 2, 1
		};
	//  209  285:iconst_4        
	//  210  286:newarray        byte[]
	//  211  288:dup             
	//  212  289:iconst_0        
	//  213  290:ldc1            #65  <Int 2>
	//  214  292:bastore         
	//  215  293:dup             
	//  216  294:iconst_1        
	//  217  295:ldc1            #65  <Int 2>
	//  218  297:bastore         
	//  219  298:dup             
	//  220  299:iconst_2        
	//  221  300:ldc1            #65  <Int 2>
	//  222  302:bastore         
	//  223  303:dup             
	//  224  304:iconst_3        
	//  225  305:ldc1            #9   <Int 1>
	//  226  307:bastore         
	//  227  308:astore_0        
		byte abyte1[] = {
			2, 1, 2, 2
		};
	//  228  309:iconst_4        
	//  229  310:newarray        byte[]
	//  230  312:dup             
	//  231  313:iconst_0        
	//  232  314:ldc1            #65  <Int 2>
	//  233  316:bastore         
	//  234  317:dup             
	//  235  318:iconst_1        
	//  236  319:ldc1            #9   <Int 1>
	//  237  321:bastore         
	//  238  322:dup             
	//  239  323:iconst_2        
	//  240  324:ldc1            #65  <Int 2>
	//  241  326:bastore         
	//  242  327:dup             
	//  243  328:iconst_3        
	//  244  329:ldc1            #65  <Int 2>
	//  245  331:bastore         
	//  246  332:astore_1        
		byte abyte2[] = {
			1, 4, 1, 1
		};
	//  247  333:iconst_4        
	//  248  334:newarray        byte[]
	//  249  336:dup             
	//  250  337:iconst_0        
	//  251  338:ldc1            #9   <Int 1>
	//  252  340:bastore         
	//  253  341:dup             
	//  254  342:iconst_1        
	//  255  343:ldc1            #66  <Int 4>
	//  256  345:bastore         
	//  257  346:dup             
	//  258  347:iconst_2        
	//  259  348:ldc1            #9   <Int 1>
	//  260  350:bastore         
	//  261  351:dup             
	//  262  352:iconst_3        
	//  263  353:ldc1            #9   <Int 1>
	//  264  355:bastore         
	//  265  356:astore_2        
		byte abyte3[] = {
			1, 3, 1, 2
		};
	//  266  357:iconst_4        
	//  267  358:newarray        byte[]
	//  268  360:dup             
	//  269  361:iconst_0        
	//  270  362:ldc1            #9   <Int 1>
	//  271  364:bastore         
	//  272  365:dup             
	//  273  366:iconst_1        
	//  274  367:ldc1            #67  <Int 3>
	//  275  369:bastore         
	//  276  370:dup             
	//  277  371:iconst_2        
	//  278  372:ldc1            #9   <Int 1>
	//  279  374:bastore         
	//  280  375:dup             
	//  281  376:iconst_3        
	//  282  377:ldc1            #65  <Int 2>
	//  283  379:bastore         
	//  284  380:astore_3        
		BARS = (new byte[][] {
			new byte[] {
				3, 2, 1, 1
			}, abyte0, abyte1, abyte2, new byte[] {
				1, 1, 3, 2
			}, new byte[] {
				1, 2, 3, 1
			}, new byte[] {
				1, 1, 1, 4
			}, abyte3, new byte[] {
				1, 2, 1, 3
			}, new byte[] {
				3, 1, 1, 2
			}
		});
	//  285  381:bipush          10
	//  286  383:anewarray       byte[][]
	//  287  386:dup             
	//  288  387:iconst_0        
	//  289  388:iconst_4        
	//  290  389:newarray        byte[]
	//  291  391:dup             
	//  292  392:iconst_0        
	//  293  393:ldc1            #67  <Int 3>
	//  294  395:bastore         
	//  295  396:dup             
	//  296  397:iconst_1        
	//  297  398:ldc1            #65  <Int 2>
	//  298  400:bastore         
	//  299  401:dup             
	//  300  402:iconst_2        
	//  301  403:ldc1            #9   <Int 1>
	//  302  405:bastore         
	//  303  406:dup             
	//  304  407:iconst_3        
	//  305  408:ldc1            #9   <Int 1>
	//  306  410:bastore         
	//  307  411:aastore         
	//  308  412:dup             
	//  309  413:iconst_1        
	//  310  414:aload_0         
	//  311  415:aastore         
	//  312  416:dup             
	//  313  417:iconst_2        
	//  314  418:aload_1         
	//  315  419:aastore         
	//  316  420:dup             
	//  317  421:iconst_3        
	//  318  422:aload_2         
	//  319  423:aastore         
	//  320  424:dup             
	//  321  425:iconst_4        
	//  322  426:iconst_4        
	//  323  427:newarray        byte[]
	//  324  429:dup             
	//  325  430:iconst_0        
	//  326  431:ldc1            #9   <Int 1>
	//  327  433:bastore         
	//  328  434:dup             
	//  329  435:iconst_1        
	//  330  436:ldc1            #9   <Int 1>
	//  331  438:bastore         
	//  332  439:dup             
	//  333  440:iconst_2        
	//  334  441:ldc1            #67  <Int 3>
	//  335  443:bastore         
	//  336  444:dup             
	//  337  445:iconst_3        
	//  338  446:ldc1            #65  <Int 2>
	//  339  448:bastore         
	//  340  449:aastore         
	//  341  450:dup             
	//  342  451:iconst_5        
	//  343  452:iconst_4        
	//  344  453:newarray        byte[]
	//  345  455:dup             
	//  346  456:iconst_0        
	//  347  457:ldc1            #9   <Int 1>
	//  348  459:bastore         
	//  349  460:dup             
	//  350  461:iconst_1        
	//  351  462:ldc1            #65  <Int 2>
	//  352  464:bastore         
	//  353  465:dup             
	//  354  466:iconst_2        
	//  355  467:ldc1            #67  <Int 3>
	//  356  469:bastore         
	//  357  470:dup             
	//  358  471:iconst_3        
	//  359  472:ldc1            #9   <Int 1>
	//  360  474:bastore         
	//  361  475:aastore         
	//  362  476:dup             
	//  363  477:bipush          6
	//  364  479:iconst_4        
	//  365  480:newarray        byte[]
	//  366  482:dup             
	//  367  483:iconst_0        
	//  368  484:ldc1            #9   <Int 1>
	//  369  486:bastore         
	//  370  487:dup             
	//  371  488:iconst_1        
	//  372  489:ldc1            #9   <Int 1>
	//  373  491:bastore         
	//  374  492:dup             
	//  375  493:iconst_2        
	//  376  494:ldc1            #9   <Int 1>
	//  377  496:bastore         
	//  378  497:dup             
	//  379  498:iconst_3        
	//  380  499:ldc1            #66  <Int 4>
	//  381  501:bastore         
	//  382  502:aastore         
	//  383  503:dup             
	//  384  504:bipush          7
	//  385  506:aload_3         
	//  386  507:aastore         
	//  387  508:dup             
	//  388  509:bipush          8
	//  389  511:iconst_4        
	//  390  512:newarray        byte[]
	//  391  514:dup             
	//  392  515:iconst_0        
	//  393  516:ldc1            #9   <Int 1>
	//  394  518:bastore         
	//  395  519:dup             
	//  396  520:iconst_1        
	//  397  521:ldc1            #65  <Int 2>
	//  398  523:bastore         
	//  399  524:dup             
	//  400  525:iconst_2        
	//  401  526:ldc1            #9   <Int 1>
	//  402  528:bastore         
	//  403  529:dup             
	//  404  530:iconst_3        
	//  405  531:ldc1            #67  <Int 3>
	//  406  533:bastore         
	//  407  534:aastore         
	//  408  535:dup             
	//  409  536:bipush          9
	//  410  538:iconst_4        
	//  411  539:newarray        byte[]
	//  412  541:dup             
	//  413  542:iconst_0        
	//  414  543:ldc1            #67  <Int 3>
	//  415  545:bastore         
	//  416  546:dup             
	//  417  547:iconst_1        
	//  418  548:ldc1            #9   <Int 1>
	//  419  550:bastore         
	//  420  551:dup             
	//  421  552:iconst_2        
	//  422  553:ldc1            #9   <Int 1>
	//  423  555:bastore         
	//  424  556:dup             
	//  425  557:iconst_3        
	//  426  558:ldc1            #65  <Int 2>
	//  427  560:bastore         
	//  428  561:aastore         
	//  429  562:putstatic       #71  <Field byte[][] BARS>
		abyte0 = (new byte[] {
			0, 0, 0, 0, 0, 0
		});
	//  430  565:bipush          6
	//  431  567:newarray        byte[]
	//  432  569:dup             
	//  433  570:iconst_0        
	//  434  571:ldc1            #17  <Int 0>
	//  435  573:bastore         
	//  436  574:dup             
	//  437  575:iconst_1        
	//  438  576:ldc1            #17  <Int 0>
	//  439  578:bastore         
	//  440  579:dup             
	//  441  580:iconst_2        
	//  442  581:ldc1            #17  <Int 0>
	//  443  583:bastore         
	//  444  584:dup             
	//  445  585:iconst_3        
	//  446  586:ldc1            #17  <Int 0>
	//  447  588:bastore         
	//  448  589:dup             
	//  449  590:iconst_4        
	//  450  591:ldc1            #17  <Int 0>
	//  451  593:bastore         
	//  452  594:dup             
	//  453  595:iconst_5        
	//  454  596:ldc1            #17  <Int 0>
	//  455  598:bastore         
	//  456  599:astore_0        
		abyte1 = (new byte[] {
			0, 0, 1, 1, 1, 0
		});
	//  457  600:bipush          6
	//  458  602:newarray        byte[]
	//  459  604:dup             
	//  460  605:iconst_0        
	//  461  606:ldc1            #17  <Int 0>
	//  462  608:bastore         
	//  463  609:dup             
	//  464  610:iconst_1        
	//  465  611:ldc1            #17  <Int 0>
	//  466  613:bastore         
	//  467  614:dup             
	//  468  615:iconst_2        
	//  469  616:ldc1            #9   <Int 1>
	//  470  618:bastore         
	//  471  619:dup             
	//  472  620:iconst_3        
	//  473  621:ldc1            #9   <Int 1>
	//  474  623:bastore         
	//  475  624:dup             
	//  476  625:iconst_4        
	//  477  626:ldc1            #9   <Int 1>
	//  478  628:bastore         
	//  479  629:dup             
	//  480  630:iconst_5        
	//  481  631:ldc1            #17  <Int 0>
	//  482  633:bastore         
	//  483  634:astore_1        
		abyte2 = (new byte[] {
			0, 1, 0, 0, 1, 1
		});
	//  484  635:bipush          6
	//  485  637:newarray        byte[]
	//  486  639:dup             
	//  487  640:iconst_0        
	//  488  641:ldc1            #17  <Int 0>
	//  489  643:bastore         
	//  490  644:dup             
	//  491  645:iconst_1        
	//  492  646:ldc1            #9   <Int 1>
	//  493  648:bastore         
	//  494  649:dup             
	//  495  650:iconst_2        
	//  496  651:ldc1            #17  <Int 0>
	//  497  653:bastore         
	//  498  654:dup             
	//  499  655:iconst_3        
	//  500  656:ldc1            #17  <Int 0>
	//  501  658:bastore         
	//  502  659:dup             
	//  503  660:iconst_4        
	//  504  661:ldc1            #9   <Int 1>
	//  505  663:bastore         
	//  506  664:dup             
	//  507  665:iconst_5        
	//  508  666:ldc1            #9   <Int 1>
	//  509  668:bastore         
	//  510  669:astore_2        
		abyte3 = (new byte[] {
			0, 1, 1, 0, 0, 1
		});
	//  511  670:bipush          6
	//  512  672:newarray        byte[]
	//  513  674:dup             
	//  514  675:iconst_0        
	//  515  676:ldc1            #17  <Int 0>
	//  516  678:bastore         
	//  517  679:dup             
	//  518  680:iconst_1        
	//  519  681:ldc1            #9   <Int 1>
	//  520  683:bastore         
	//  521  684:dup             
	//  522  685:iconst_2        
	//  523  686:ldc1            #9   <Int 1>
	//  524  688:bastore         
	//  525  689:dup             
	//  526  690:iconst_3        
	//  527  691:ldc1            #17  <Int 0>
	//  528  693:bastore         
	//  529  694:dup             
	//  530  695:iconst_4        
	//  531  696:ldc1            #17  <Int 0>
	//  532  698:bastore         
	//  533  699:dup             
	//  534  700:iconst_5        
	//  535  701:ldc1            #9   <Int 1>
	//  536  703:bastore         
	//  537  704:astore_3        
		byte abyte4[] = {
			0, 1, 0, 1, 0, 1
		};
	//  538  705:bipush          6
	//  539  707:newarray        byte[]
	//  540  709:dup             
	//  541  710:iconst_0        
	//  542  711:ldc1            #17  <Int 0>
	//  543  713:bastore         
	//  544  714:dup             
	//  545  715:iconst_1        
	//  546  716:ldc1            #9   <Int 1>
	//  547  718:bastore         
	//  548  719:dup             
	//  549  720:iconst_2        
	//  550  721:ldc1            #17  <Int 0>
	//  551  723:bastore         
	//  552  724:dup             
	//  553  725:iconst_3        
	//  554  726:ldc1            #9   <Int 1>
	//  555  728:bastore         
	//  556  729:dup             
	//  557  730:iconst_4        
	//  558  731:ldc1            #17  <Int 0>
	//  559  733:bastore         
	//  560  734:dup             
	//  561  735:iconst_5        
	//  562  736:ldc1            #9   <Int 1>
	//  563  738:bastore         
	//  564  739:astore          4
		byte abyte5[] = {
			0, 1, 0, 1, 1, 0
		};
	//  565  741:bipush          6
	//  566  743:newarray        byte[]
	//  567  745:dup             
	//  568  746:iconst_0        
	//  569  747:ldc1            #17  <Int 0>
	//  570  749:bastore         
	//  571  750:dup             
	//  572  751:iconst_1        
	//  573  752:ldc1            #9   <Int 1>
	//  574  754:bastore         
	//  575  755:dup             
	//  576  756:iconst_2        
	//  577  757:ldc1            #17  <Int 0>
	//  578  759:bastore         
	//  579  760:dup             
	//  580  761:iconst_3        
	//  581  762:ldc1            #9   <Int 1>
	//  582  764:bastore         
	//  583  765:dup             
	//  584  766:iconst_4        
	//  585  767:ldc1            #9   <Int 1>
	//  586  769:bastore         
	//  587  770:dup             
	//  588  771:iconst_5        
	//  589  772:ldc1            #17  <Int 0>
	//  590  774:bastore         
	//  591  775:astore          5
		PARITY13 = (new byte[][] {
			abyte0, new byte[] {
				0, 0, 1, 0, 1, 1
			}, new byte[] {
				0, 0, 1, 1, 0, 1
			}, abyte1, abyte2, abyte3, new byte[] {
				0, 1, 1, 1, 0, 0
			}, abyte4, abyte5, new byte[] {
				0, 1, 1, 0, 1, 0
			}
		});
	//  592  777:bipush          10
	//  593  779:anewarray       byte[][]
	//  594  782:dup             
	//  595  783:iconst_0        
	//  596  784:aload_0         
	//  597  785:aastore         
	//  598  786:dup             
	//  599  787:iconst_1        
	//  600  788:bipush          6
	//  601  790:newarray        byte[]
	//  602  792:dup             
	//  603  793:iconst_0        
	//  604  794:ldc1            #17  <Int 0>
	//  605  796:bastore         
	//  606  797:dup             
	//  607  798:iconst_1        
	//  608  799:ldc1            #17  <Int 0>
	//  609  801:bastore         
	//  610  802:dup             
	//  611  803:iconst_2        
	//  612  804:ldc1            #9   <Int 1>
	//  613  806:bastore         
	//  614  807:dup             
	//  615  808:iconst_3        
	//  616  809:ldc1            #17  <Int 0>
	//  617  811:bastore         
	//  618  812:dup             
	//  619  813:iconst_4        
	//  620  814:ldc1            #9   <Int 1>
	//  621  816:bastore         
	//  622  817:dup             
	//  623  818:iconst_5        
	//  624  819:ldc1            #9   <Int 1>
	//  625  821:bastore         
	//  626  822:aastore         
	//  627  823:dup             
	//  628  824:iconst_2        
	//  629  825:bipush          6
	//  630  827:newarray        byte[]
	//  631  829:dup             
	//  632  830:iconst_0        
	//  633  831:ldc1            #17  <Int 0>
	//  634  833:bastore         
	//  635  834:dup             
	//  636  835:iconst_1        
	//  637  836:ldc1            #17  <Int 0>
	//  638  838:bastore         
	//  639  839:dup             
	//  640  840:iconst_2        
	//  641  841:ldc1            #9   <Int 1>
	//  642  843:bastore         
	//  643  844:dup             
	//  644  845:iconst_3        
	//  645  846:ldc1            #9   <Int 1>
	//  646  848:bastore         
	//  647  849:dup             
	//  648  850:iconst_4        
	//  649  851:ldc1            #17  <Int 0>
	//  650  853:bastore         
	//  651  854:dup             
	//  652  855:iconst_5        
	//  653  856:ldc1            #9   <Int 1>
	//  654  858:bastore         
	//  655  859:aastore         
	//  656  860:dup             
	//  657  861:iconst_3        
	//  658  862:aload_1         
	//  659  863:aastore         
	//  660  864:dup             
	//  661  865:iconst_4        
	//  662  866:aload_2         
	//  663  867:aastore         
	//  664  868:dup             
	//  665  869:iconst_5        
	//  666  870:aload_3         
	//  667  871:aastore         
	//  668  872:dup             
	//  669  873:bipush          6
	//  670  875:bipush          6
	//  671  877:newarray        byte[]
	//  672  879:dup             
	//  673  880:iconst_0        
	//  674  881:ldc1            #17  <Int 0>
	//  675  883:bastore         
	//  676  884:dup             
	//  677  885:iconst_1        
	//  678  886:ldc1            #9   <Int 1>
	//  679  888:bastore         
	//  680  889:dup             
	//  681  890:iconst_2        
	//  682  891:ldc1            #9   <Int 1>
	//  683  893:bastore         
	//  684  894:dup             
	//  685  895:iconst_3        
	//  686  896:ldc1            #9   <Int 1>
	//  687  898:bastore         
	//  688  899:dup             
	//  689  900:iconst_4        
	//  690  901:ldc1            #17  <Int 0>
	//  691  903:bastore         
	//  692  904:dup             
	//  693  905:iconst_5        
	//  694  906:ldc1            #17  <Int 0>
	//  695  908:bastore         
	//  696  909:aastore         
	//  697  910:dup             
	//  698  911:bipush          7
	//  699  913:aload           4
	//  700  915:aastore         
	//  701  916:dup             
	//  702  917:bipush          8
	//  703  919:aload           5
	//  704  921:aastore         
	//  705  922:dup             
	//  706  923:bipush          9
	//  707  925:bipush          6
	//  708  927:newarray        byte[]
	//  709  929:dup             
	//  710  930:iconst_0        
	//  711  931:ldc1            #17  <Int 0>
	//  712  933:bastore         
	//  713  934:dup             
	//  714  935:iconst_1        
	//  715  936:ldc1            #9   <Int 1>
	//  716  938:bastore         
	//  717  939:dup             
	//  718  940:iconst_2        
	//  719  941:ldc1            #9   <Int 1>
	//  720  943:bastore         
	//  721  944:dup             
	//  722  945:iconst_3        
	//  723  946:ldc1            #17  <Int 0>
	//  724  948:bastore         
	//  725  949:dup             
	//  726  950:iconst_4        
	//  727  951:ldc1            #9   <Int 1>
	//  728  953:bastore         
	//  729  954:dup             
	//  730  955:iconst_5        
	//  731  956:ldc1            #17  <Int 0>
	//  732  958:bastore         
	//  733  959:aastore         
	//  734  960:putstatic       #73  <Field byte[][] PARITY13>
		abyte0 = (new byte[] {
			0, 1
		});
	//  735  963:iconst_2        
	//  736  964:newarray        byte[]
	//  737  966:dup             
	//  738  967:iconst_0        
	//  739  968:ldc1            #17  <Int 0>
	//  740  970:bastore         
	//  741  971:dup             
	//  742  972:iconst_1        
	//  743  973:ldc1            #9   <Int 1>
	//  744  975:bastore         
	//  745  976:astore_0        
		PARITY2 = (new byte[][] {
			new byte[] {
				0, 0
			}, abyte0, new byte[] {
				1, 0
			}, new byte[] {
				1, 1
			}
		});
	//  746  977:iconst_4        
	//  747  978:anewarray       byte[][]
	//  748  981:dup             
	//  749  982:iconst_0        
	//  750  983:iconst_2        
	//  751  984:newarray        byte[]
	//  752  986:dup             
	//  753  987:iconst_0        
	//  754  988:ldc1            #17  <Int 0>
	//  755  990:bastore         
	//  756  991:dup             
	//  757  992:iconst_1        
	//  758  993:ldc1            #17  <Int 0>
	//  759  995:bastore         
	//  760  996:aastore         
	//  761  997:dup             
	//  762  998:iconst_1        
	//  763  999:aload_0         
	//  764 1000:aastore         
	//  765 1001:dup             
	//  766 1002:iconst_2        
	//  767 1003:iconst_2        
	//  768 1004:newarray        byte[]
	//  769 1006:dup             
	//  770 1007:iconst_0        
	//  771 1008:ldc1            #9   <Int 1>
	//  772 1010:bastore         
	//  773 1011:dup             
	//  774 1012:iconst_1        
	//  775 1013:ldc1            #17  <Int 0>
	//  776 1015:bastore         
	//  777 1016:aastore         
	//  778 1017:dup             
	//  779 1018:iconst_3        
	//  780 1019:iconst_2        
	//  781 1020:newarray        byte[]
	//  782 1022:dup             
	//  783 1023:iconst_0        
	//  784 1024:ldc1            #9   <Int 1>
	//  785 1026:bastore         
	//  786 1027:dup             
	//  787 1028:iconst_1        
	//  788 1029:ldc1            #9   <Int 1>
	//  789 1031:bastore         
	//  790 1032:aastore         
	//  791 1033:putstatic       #75  <Field byte[][] PARITY2>
		abyte0 = (new byte[] {
			1, 0, 0, 1, 0
		});
	//  792 1036:iconst_5        
	//  793 1037:newarray        byte[]
	//  794 1039:dup             
	//  795 1040:iconst_0        
	//  796 1041:ldc1            #9   <Int 1>
	//  797 1043:bastore         
	//  798 1044:dup             
	//  799 1045:iconst_1        
	//  800 1046:ldc1            #17  <Int 0>
	//  801 1048:bastore         
	//  802 1049:dup             
	//  803 1050:iconst_2        
	//  804 1051:ldc1            #17  <Int 0>
	//  805 1053:bastore         
	//  806 1054:dup             
	//  807 1055:iconst_3        
	//  808 1056:ldc1            #9   <Int 1>
	//  809 1058:bastore         
	//  810 1059:dup             
	//  811 1060:iconst_4        
	//  812 1061:ldc1            #17  <Int 0>
	//  813 1063:bastore         
	//  814 1064:astore_0        
		abyte1 = (new byte[] {
			0, 1, 0, 1, 0
		});
	//  815 1065:iconst_5        
	//  816 1066:newarray        byte[]
	//  817 1068:dup             
	//  818 1069:iconst_0        
	//  819 1070:ldc1            #17  <Int 0>
	//  820 1072:bastore         
	//  821 1073:dup             
	//  822 1074:iconst_1        
	//  823 1075:ldc1            #9   <Int 1>
	//  824 1077:bastore         
	//  825 1078:dup             
	//  826 1079:iconst_2        
	//  827 1080:ldc1            #17  <Int 0>
	//  828 1082:bastore         
	//  829 1083:dup             
	//  830 1084:iconst_3        
	//  831 1085:ldc1            #9   <Int 1>
	//  832 1087:bastore         
	//  833 1088:dup             
	//  834 1089:iconst_4        
	//  835 1090:ldc1            #17  <Int 0>
	//  836 1092:bastore         
	//  837 1093:astore_1        
		abyte2 = (new byte[] {
			0, 0, 1, 0, 1
		});
	//  838 1094:iconst_5        
	//  839 1095:newarray        byte[]
	//  840 1097:dup             
	//  841 1098:iconst_0        
	//  842 1099:ldc1            #17  <Int 0>
	//  843 1101:bastore         
	//  844 1102:dup             
	//  845 1103:iconst_1        
	//  846 1104:ldc1            #17  <Int 0>
	//  847 1106:bastore         
	//  848 1107:dup             
	//  849 1108:iconst_2        
	//  850 1109:ldc1            #9   <Int 1>
	//  851 1111:bastore         
	//  852 1112:dup             
	//  853 1113:iconst_3        
	//  854 1114:ldc1            #17  <Int 0>
	//  855 1116:bastore         
	//  856 1117:dup             
	//  857 1118:iconst_4        
	//  858 1119:ldc1            #9   <Int 1>
	//  859 1121:bastore         
	//  860 1122:astore_2        
		PARITY5 = (new byte[][] {
			new byte[] {
				1, 1, 0, 0, 0
			}, new byte[] {
				1, 0, 1, 0, 0
			}, abyte0, new byte[] {
				1, 0, 0, 0, 1
			}, new byte[] {
				0, 1, 1, 0, 0
			}, new byte[] {
				0, 0, 1, 1, 0
			}, new byte[] {
				0, 0, 0, 1, 1
			}, abyte1, new byte[] {
				0, 1, 0, 0, 1
			}, abyte2
		});
	//  861 1123:bipush          10
	//  862 1125:anewarray       byte[][]
	//  863 1128:dup             
	//  864 1129:iconst_0        
	//  865 1130:iconst_5        
	//  866 1131:newarray        byte[]
	//  867 1133:dup             
	//  868 1134:iconst_0        
	//  869 1135:ldc1            #9   <Int 1>
	//  870 1137:bastore         
	//  871 1138:dup             
	//  872 1139:iconst_1        
	//  873 1140:ldc1            #9   <Int 1>
	//  874 1142:bastore         
	//  875 1143:dup             
	//  876 1144:iconst_2        
	//  877 1145:ldc1            #17  <Int 0>
	//  878 1147:bastore         
	//  879 1148:dup             
	//  880 1149:iconst_3        
	//  881 1150:ldc1            #17  <Int 0>
	//  882 1152:bastore         
	//  883 1153:dup             
	//  884 1154:iconst_4        
	//  885 1155:ldc1            #17  <Int 0>
	//  886 1157:bastore         
	//  887 1158:aastore         
	//  888 1159:dup             
	//  889 1160:iconst_1        
	//  890 1161:iconst_5        
	//  891 1162:newarray        byte[]
	//  892 1164:dup             
	//  893 1165:iconst_0        
	//  894 1166:ldc1            #9   <Int 1>
	//  895 1168:bastore         
	//  896 1169:dup             
	//  897 1170:iconst_1        
	//  898 1171:ldc1            #17  <Int 0>
	//  899 1173:bastore         
	//  900 1174:dup             
	//  901 1175:iconst_2        
	//  902 1176:ldc1            #9   <Int 1>
	//  903 1178:bastore         
	//  904 1179:dup             
	//  905 1180:iconst_3        
	//  906 1181:ldc1            #17  <Int 0>
	//  907 1183:bastore         
	//  908 1184:dup             
	//  909 1185:iconst_4        
	//  910 1186:ldc1            #17  <Int 0>
	//  911 1188:bastore         
	//  912 1189:aastore         
	//  913 1190:dup             
	//  914 1191:iconst_2        
	//  915 1192:aload_0         
	//  916 1193:aastore         
	//  917 1194:dup             
	//  918 1195:iconst_3        
	//  919 1196:iconst_5        
	//  920 1197:newarray        byte[]
	//  921 1199:dup             
	//  922 1200:iconst_0        
	//  923 1201:ldc1            #9   <Int 1>
	//  924 1203:bastore         
	//  925 1204:dup             
	//  926 1205:iconst_1        
	//  927 1206:ldc1            #17  <Int 0>
	//  928 1208:bastore         
	//  929 1209:dup             
	//  930 1210:iconst_2        
	//  931 1211:ldc1            #17  <Int 0>
	//  932 1213:bastore         
	//  933 1214:dup             
	//  934 1215:iconst_3        
	//  935 1216:ldc1            #17  <Int 0>
	//  936 1218:bastore         
	//  937 1219:dup             
	//  938 1220:iconst_4        
	//  939 1221:ldc1            #9   <Int 1>
	//  940 1223:bastore         
	//  941 1224:aastore         
	//  942 1225:dup             
	//  943 1226:iconst_4        
	//  944 1227:iconst_5        
	//  945 1228:newarray        byte[]
	//  946 1230:dup             
	//  947 1231:iconst_0        
	//  948 1232:ldc1            #17  <Int 0>
	//  949 1234:bastore         
	//  950 1235:dup             
	//  951 1236:iconst_1        
	//  952 1237:ldc1            #9   <Int 1>
	//  953 1239:bastore         
	//  954 1240:dup             
	//  955 1241:iconst_2        
	//  956 1242:ldc1            #9   <Int 1>
	//  957 1244:bastore         
	//  958 1245:dup             
	//  959 1246:iconst_3        
	//  960 1247:ldc1            #17  <Int 0>
	//  961 1249:bastore         
	//  962 1250:dup             
	//  963 1251:iconst_4        
	//  964 1252:ldc1            #17  <Int 0>
	//  965 1254:bastore         
	//  966 1255:aastore         
	//  967 1256:dup             
	//  968 1257:iconst_5        
	//  969 1258:iconst_5        
	//  970 1259:newarray        byte[]
	//  971 1261:dup             
	//  972 1262:iconst_0        
	//  973 1263:ldc1            #17  <Int 0>
	//  974 1265:bastore         
	//  975 1266:dup             
	//  976 1267:iconst_1        
	//  977 1268:ldc1            #17  <Int 0>
	//  978 1270:bastore         
	//  979 1271:dup             
	//  980 1272:iconst_2        
	//  981 1273:ldc1            #9   <Int 1>
	//  982 1275:bastore         
	//  983 1276:dup             
	//  984 1277:iconst_3        
	//  985 1278:ldc1            #9   <Int 1>
	//  986 1280:bastore         
	//  987 1281:dup             
	//  988 1282:iconst_4        
	//  989 1283:ldc1            #17  <Int 0>
	//  990 1285:bastore         
	//  991 1286:aastore         
	//  992 1287:dup             
	//  993 1288:bipush          6
	//  994 1290:iconst_5        
	//  995 1291:newarray        byte[]
	//  996 1293:dup             
	//  997 1294:iconst_0        
	//  998 1295:ldc1            #17  <Int 0>
	//  999 1297:bastore         
	// 1000 1298:dup             
	// 1001 1299:iconst_1        
	// 1002 1300:ldc1            #17  <Int 0>
	// 1003 1302:bastore         
	// 1004 1303:dup             
	// 1005 1304:iconst_2        
	// 1006 1305:ldc1            #17  <Int 0>
	// 1007 1307:bastore         
	// 1008 1308:dup             
	// 1009 1309:iconst_3        
	// 1010 1310:ldc1            #9   <Int 1>
	// 1011 1312:bastore         
	// 1012 1313:dup             
	// 1013 1314:iconst_4        
	// 1014 1315:ldc1            #9   <Int 1>
	// 1015 1317:bastore         
	// 1016 1318:aastore         
	// 1017 1319:dup             
	// 1018 1320:bipush          7
	// 1019 1322:aload_1         
	// 1020 1323:aastore         
	// 1021 1324:dup             
	// 1022 1325:bipush          8
	// 1023 1327:iconst_5        
	// 1024 1328:newarray        byte[]
	// 1025 1330:dup             
	// 1026 1331:iconst_0        
	// 1027 1332:ldc1            #17  <Int 0>
	// 1028 1334:bastore         
	// 1029 1335:dup             
	// 1030 1336:iconst_1        
	// 1031 1337:ldc1            #9   <Int 1>
	// 1032 1339:bastore         
	// 1033 1340:dup             
	// 1034 1341:iconst_2        
	// 1035 1342:ldc1            #17  <Int 0>
	// 1036 1344:bastore         
	// 1037 1345:dup             
	// 1038 1346:iconst_3        
	// 1039 1347:ldc1            #17  <Int 0>
	// 1040 1349:bastore         
	// 1041 1350:dup             
	// 1042 1351:iconst_4        
	// 1043 1352:ldc1            #9   <Int 1>
	// 1044 1354:bastore         
	// 1045 1355:aastore         
	// 1046 1356:dup             
	// 1047 1357:bipush          9
	// 1048 1359:aload_2         
	// 1049 1360:aastore         
	// 1050 1361:putstatic       #77  <Field byte[][] PARITY5>
		abyte0 = (new byte[] {
			1, 1, 1, 0, 0, 0
		});
	// 1051 1364:bipush          6
	// 1052 1366:newarray        byte[]
	// 1053 1368:dup             
	// 1054 1369:iconst_0        
	// 1055 1370:ldc1            #9   <Int 1>
	// 1056 1372:bastore         
	// 1057 1373:dup             
	// 1058 1374:iconst_1        
	// 1059 1375:ldc1            #9   <Int 1>
	// 1060 1377:bastore         
	// 1061 1378:dup             
	// 1062 1379:iconst_2        
	// 1063 1380:ldc1            #9   <Int 1>
	// 1064 1382:bastore         
	// 1065 1383:dup             
	// 1066 1384:iconst_3        
	// 1067 1385:ldc1            #17  <Int 0>
	// 1068 1387:bastore         
	// 1069 1388:dup             
	// 1070 1389:iconst_4        
	// 1071 1390:ldc1            #17  <Int 0>
	// 1072 1392:bastore         
	// 1073 1393:dup             
	// 1074 1394:iconst_5        
	// 1075 1395:ldc1            #17  <Int 0>
	// 1076 1397:bastore         
	// 1077 1398:astore_0        
		abyte1 = (new byte[] {
			1, 1, 0, 1, 0, 0
		});
	// 1078 1399:bipush          6
	// 1079 1401:newarray        byte[]
	// 1080 1403:dup             
	// 1081 1404:iconst_0        
	// 1082 1405:ldc1            #9   <Int 1>
	// 1083 1407:bastore         
	// 1084 1408:dup             
	// 1085 1409:iconst_1        
	// 1086 1410:ldc1            #9   <Int 1>
	// 1087 1412:bastore         
	// 1088 1413:dup             
	// 1089 1414:iconst_2        
	// 1090 1415:ldc1            #17  <Int 0>
	// 1091 1417:bastore         
	// 1092 1418:dup             
	// 1093 1419:iconst_3        
	// 1094 1420:ldc1            #9   <Int 1>
	// 1095 1422:bastore         
	// 1096 1423:dup             
	// 1097 1424:iconst_4        
	// 1098 1425:ldc1            #17  <Int 0>
	// 1099 1427:bastore         
	// 1100 1428:dup             
	// 1101 1429:iconst_5        
	// 1102 1430:ldc1            #17  <Int 0>
	// 1103 1432:bastore         
	// 1104 1433:astore_1        
		abyte2 = (new byte[] {
			1, 1, 0, 0, 1, 0
		});
	// 1105 1434:bipush          6
	// 1106 1436:newarray        byte[]
	// 1107 1438:dup             
	// 1108 1439:iconst_0        
	// 1109 1440:ldc1            #9   <Int 1>
	// 1110 1442:bastore         
	// 1111 1443:dup             
	// 1112 1444:iconst_1        
	// 1113 1445:ldc1            #9   <Int 1>
	// 1114 1447:bastore         
	// 1115 1448:dup             
	// 1116 1449:iconst_2        
	// 1117 1450:ldc1            #17  <Int 0>
	// 1118 1452:bastore         
	// 1119 1453:dup             
	// 1120 1454:iconst_3        
	// 1121 1455:ldc1            #17  <Int 0>
	// 1122 1457:bastore         
	// 1123 1458:dup             
	// 1124 1459:iconst_4        
	// 1125 1460:ldc1            #9   <Int 1>
	// 1126 1462:bastore         
	// 1127 1463:dup             
	// 1128 1464:iconst_5        
	// 1129 1465:ldc1            #17  <Int 0>
	// 1130 1467:bastore         
	// 1131 1468:astore_2        
		abyte3 = (new byte[] {
			1, 1, 0, 0, 0, 1
		});
	// 1132 1469:bipush          6
	// 1133 1471:newarray        byte[]
	// 1134 1473:dup             
	// 1135 1474:iconst_0        
	// 1136 1475:ldc1            #9   <Int 1>
	// 1137 1477:bastore         
	// 1138 1478:dup             
	// 1139 1479:iconst_1        
	// 1140 1480:ldc1            #9   <Int 1>
	// 1141 1482:bastore         
	// 1142 1483:dup             
	// 1143 1484:iconst_2        
	// 1144 1485:ldc1            #17  <Int 0>
	// 1145 1487:bastore         
	// 1146 1488:dup             
	// 1147 1489:iconst_3        
	// 1148 1490:ldc1            #17  <Int 0>
	// 1149 1492:bastore         
	// 1150 1493:dup             
	// 1151 1494:iconst_4        
	// 1152 1495:ldc1            #17  <Int 0>
	// 1153 1497:bastore         
	// 1154 1498:dup             
	// 1155 1499:iconst_5        
	// 1156 1500:ldc1            #9   <Int 1>
	// 1157 1502:bastore         
	// 1158 1503:astore_3        
		abyte4 = (new byte[] {
			1, 0, 0, 0, 1, 1
		});
	// 1159 1504:bipush          6
	// 1160 1506:newarray        byte[]
	// 1161 1508:dup             
	// 1162 1509:iconst_0        
	// 1163 1510:ldc1            #9   <Int 1>
	// 1164 1512:bastore         
	// 1165 1513:dup             
	// 1166 1514:iconst_1        
	// 1167 1515:ldc1            #17  <Int 0>
	// 1168 1517:bastore         
	// 1169 1518:dup             
	// 1170 1519:iconst_2        
	// 1171 1520:ldc1            #17  <Int 0>
	// 1172 1522:bastore         
	// 1173 1523:dup             
	// 1174 1524:iconst_3        
	// 1175 1525:ldc1            #17  <Int 0>
	// 1176 1527:bastore         
	// 1177 1528:dup             
	// 1178 1529:iconst_4        
	// 1179 1530:ldc1            #9   <Int 1>
	// 1180 1532:bastore         
	// 1181 1533:dup             
	// 1182 1534:iconst_5        
	// 1183 1535:ldc1            #9   <Int 1>
	// 1184 1537:bastore         
	// 1185 1538:astore          4
		abyte5 = (new byte[] {
			1, 0, 1, 0, 0, 1
		});
	// 1186 1540:bipush          6
	// 1187 1542:newarray        byte[]
	// 1188 1544:dup             
	// 1189 1545:iconst_0        
	// 1190 1546:ldc1            #9   <Int 1>
	// 1191 1548:bastore         
	// 1192 1549:dup             
	// 1193 1550:iconst_1        
	// 1194 1551:ldc1            #17  <Int 0>
	// 1195 1553:bastore         
	// 1196 1554:dup             
	// 1197 1555:iconst_2        
	// 1198 1556:ldc1            #9   <Int 1>
	// 1199 1558:bastore         
	// 1200 1559:dup             
	// 1201 1560:iconst_3        
	// 1202 1561:ldc1            #17  <Int 0>
	// 1203 1563:bastore         
	// 1204 1564:dup             
	// 1205 1565:iconst_4        
	// 1206 1566:ldc1            #17  <Int 0>
	// 1207 1568:bastore         
	// 1208 1569:dup             
	// 1209 1570:iconst_5        
	// 1210 1571:ldc1            #9   <Int 1>
	// 1211 1573:bastore         
	// 1212 1574:astore          5
		byte abyte6[] = {
			1, 0, 0, 1, 0, 1
		};
	// 1213 1576:bipush          6
	// 1214 1578:newarray        byte[]
	// 1215 1580:dup             
	// 1216 1581:iconst_0        
	// 1217 1582:ldc1            #9   <Int 1>
	// 1218 1584:bastore         
	// 1219 1585:dup             
	// 1220 1586:iconst_1        
	// 1221 1587:ldc1            #17  <Int 0>
	// 1222 1589:bastore         
	// 1223 1590:dup             
	// 1224 1591:iconst_2        
	// 1225 1592:ldc1            #17  <Int 0>
	// 1226 1594:bastore         
	// 1227 1595:dup             
	// 1228 1596:iconst_3        
	// 1229 1597:ldc1            #9   <Int 1>
	// 1230 1599:bastore         
	// 1231 1600:dup             
	// 1232 1601:iconst_4        
	// 1233 1602:ldc1            #17  <Int 0>
	// 1234 1604:bastore         
	// 1235 1605:dup             
	// 1236 1606:iconst_5        
	// 1237 1607:ldc1            #9   <Int 1>
	// 1238 1609:bastore         
	// 1239 1610:astore          6
		PARITYE = (new byte[][] {
			abyte0, abyte1, abyte2, abyte3, new byte[] {
				1, 0, 1, 1, 0, 0
			}, new byte[] {
				1, 0, 0, 1, 1, 0
			}, abyte4, new byte[] {
				1, 0, 1, 0, 1, 0
			}, abyte5, abyte6
		});
	// 1240 1612:bipush          10
	// 1241 1614:anewarray       byte[][]
	// 1242 1617:dup             
	// 1243 1618:iconst_0        
	// 1244 1619:aload_0         
	// 1245 1620:aastore         
	// 1246 1621:dup             
	// 1247 1622:iconst_1        
	// 1248 1623:aload_1         
	// 1249 1624:aastore         
	// 1250 1625:dup             
	// 1251 1626:iconst_2        
	// 1252 1627:aload_2         
	// 1253 1628:aastore         
	// 1254 1629:dup             
	// 1255 1630:iconst_3        
	// 1256 1631:aload_3         
	// 1257 1632:aastore         
	// 1258 1633:dup             
	// 1259 1634:iconst_4        
	// 1260 1635:bipush          6
	// 1261 1637:newarray        byte[]
	// 1262 1639:dup             
	// 1263 1640:iconst_0        
	// 1264 1641:ldc1            #9   <Int 1>
	// 1265 1643:bastore         
	// 1266 1644:dup             
	// 1267 1645:iconst_1        
	// 1268 1646:ldc1            #17  <Int 0>
	// 1269 1648:bastore         
	// 1270 1649:dup             
	// 1271 1650:iconst_2        
	// 1272 1651:ldc1            #9   <Int 1>
	// 1273 1653:bastore         
	// 1274 1654:dup             
	// 1275 1655:iconst_3        
	// 1276 1656:ldc1            #9   <Int 1>
	// 1277 1658:bastore         
	// 1278 1659:dup             
	// 1279 1660:iconst_4        
	// 1280 1661:ldc1            #17  <Int 0>
	// 1281 1663:bastore         
	// 1282 1664:dup             
	// 1283 1665:iconst_5        
	// 1284 1666:ldc1            #17  <Int 0>
	// 1285 1668:bastore         
	// 1286 1669:aastore         
	// 1287 1670:dup             
	// 1288 1671:iconst_5        
	// 1289 1672:bipush          6
	// 1290 1674:newarray        byte[]
	// 1291 1676:dup             
	// 1292 1677:iconst_0        
	// 1293 1678:ldc1            #9   <Int 1>
	// 1294 1680:bastore         
	// 1295 1681:dup             
	// 1296 1682:iconst_1        
	// 1297 1683:ldc1            #17  <Int 0>
	// 1298 1685:bastore         
	// 1299 1686:dup             
	// 1300 1687:iconst_2        
	// 1301 1688:ldc1            #17  <Int 0>
	// 1302 1690:bastore         
	// 1303 1691:dup             
	// 1304 1692:iconst_3        
	// 1305 1693:ldc1            #9   <Int 1>
	// 1306 1695:bastore         
	// 1307 1696:dup             
	// 1308 1697:iconst_4        
	// 1309 1698:ldc1            #9   <Int 1>
	// 1310 1700:bastore         
	// 1311 1701:dup             
	// 1312 1702:iconst_5        
	// 1313 1703:ldc1            #17  <Int 0>
	// 1314 1705:bastore         
	// 1315 1706:aastore         
	// 1316 1707:dup             
	// 1317 1708:bipush          6
	// 1318 1710:aload           4
	// 1319 1712:aastore         
	// 1320 1713:dup             
	// 1321 1714:bipush          7
	// 1322 1716:bipush          6
	// 1323 1718:newarray        byte[]
	// 1324 1720:dup             
	// 1325 1721:iconst_0        
	// 1326 1722:ldc1            #9   <Int 1>
	// 1327 1724:bastore         
	// 1328 1725:dup             
	// 1329 1726:iconst_1        
	// 1330 1727:ldc1            #17  <Int 0>
	// 1331 1729:bastore         
	// 1332 1730:dup             
	// 1333 1731:iconst_2        
	// 1334 1732:ldc1            #9   <Int 1>
	// 1335 1734:bastore         
	// 1336 1735:dup             
	// 1337 1736:iconst_3        
	// 1338 1737:ldc1            #17  <Int 0>
	// 1339 1739:bastore         
	// 1340 1740:dup             
	// 1341 1741:iconst_4        
	// 1342 1742:ldc1            #9   <Int 1>
	// 1343 1744:bastore         
	// 1344 1745:dup             
	// 1345 1746:iconst_5        
	// 1346 1747:ldc1            #17  <Int 0>
	// 1347 1749:bastore         
	// 1348 1750:aastore         
	// 1349 1751:dup             
	// 1350 1752:bipush          8
	// 1351 1754:aload           5
	// 1352 1756:aastore         
	// 1353 1757:dup             
	// 1354 1758:bipush          9
	// 1355 1760:aload           6
	// 1356 1762:aastore         
	// 1357 1763:putstatic       #79  <Field byte[][] PARITYE>
	//*1358 1766:return          
	}
}
