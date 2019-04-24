// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPConst;

public class Utils
	implements XMPConst
{

	private Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	static boolean checkUUIDFormat(String s)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		boolean flag1 = true;
	//    2    3:iconst_1        
	//    3    4:istore_3        
		int k = 0;
	//    4    5:iconst_0        
	//    5    6:istore          5
		if(s == null)
	//*   6    8:aload_0         
	//*   7    9:ifnonnull       14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		int i = 0;
	//   10   14:iconst_0        
	//   11   15:istore_2        
		while(i < s.length()) 
	//*  12   16:iload_2         
	//*  13   17:aload_0         
	//*  14   18:invokevirtual   #31  <Method int String.length()>
	//*  15   21:icmpge          94
		{
			int j = k;
	//   16   24:iload           5
	//   17   26:istore          4
			boolean flag = flag1;
	//   18   28:iload_3         
	//   19   29:istore_1        
			if(s.charAt(i) == '-')
	//*  20   30:aload_0         
	//*  21   31:iload_2         
	//*  22   32:invokevirtual   #35  <Method char String.charAt(int)>
	//*  23   35:bipush          45
	//*  24   37:icmpne          76
			{
				j = k + 1;
	//   25   40:iload           5
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore          4
				if(flag1 && (i == 8 || i == 13 || i == 18 || i == 23))
	//*  29   46:iload_3         
	//*  30   47:ifeq            89
	//*  31   50:iload_2         
	//*  32   51:bipush          8
	//*  33   53:icmpeq          74
	//*  34   56:iload_2         
	//*  35   57:bipush          13
	//*  36   59:icmpeq          74
	//*  37   62:iload_2         
	//*  38   63:bipush          18
	//*  39   65:icmpeq          74
	//*  40   68:iload_2         
	//*  41   69:bipush          23
	//*  42   71:icmpne          89
					flag = true;
	//   43   74:iconst_1        
	//   44   75:istore_1        
				else
	//*  45   76:iload_2         
	//*  46   77:iconst_1        
	//*  47   78:iadd            
	//*  48   79:istore_2        
	//*  49   80:iload           4
	//*  50   82:istore          5
	//*  51   84:iload_1         
	//*  52   85:istore_3        
	//*  53   86:goto            16
					flag = false;
	//   54   89:iconst_0        
	//   55   90:istore_1        
			}
			i++;
			k = j;
			flag1 = flag;
		}
	//*  56   91:goto            76
		if(!flag1 || 4 != k || 36 != i)
	//*  57   94:iload_3         
	//*  58   95:ifeq            113
	//*  59   98:iconst_4        
	//*  60   99:iload           5
	//*  61  101:icmpne          113
	//*  62  104:bipush          36
	//*  63  106:iload_2         
	//*  64  107:icmpne          113
	//*  65  110:iload           6
	//*  66  112:ireturn         
			flag2 = false;
	//   67  113:iconst_0        
	//   68  114:istore          6
		return flag2;
	//*  69  116:goto            110
	}

	public static String escapeXML(String s, boolean flag, boolean flag1)
	{
		int i;
		StringBuffer stringbuffer;
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore          4
label0:
		do
		{
label1:
			{
				char c1 = ((char) (flag2));
	//    4    6:iload           6
	//    5    8:istore          5
				if(i < s.length())
	//*   6   10:iload           4
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #31  <Method int String.length()>
	//*   9   16:icmpge          87
				{
					c1 = s.charAt(i);
	//   10   19:aload_0         
	//   11   20:iload           4
	//   12   22:invokevirtual   #35  <Method char String.charAt(int)>
	//   13   25:istore          5
					if(c1 != '<' && c1 != '>' && c1 != '&' && (!flag1 || c1 != '\t' && c1 != '\n' && c1 != '\r') && (!flag || c1 != '"'))
						break label1;
	//   14   27:iload           5
	//   15   29:bipush          60
	//   16   31:icmpeq          84
	//   17   34:iload           5
	//   18   36:bipush          62
	//   19   38:icmpeq          84
	//   20   41:iload           5
	//   21   43:bipush          38
	//   22   45:icmpeq          84
	//   23   48:iload_2         
	//   24   49:ifeq            73
	//   25   52:iload           5
	//   26   54:bipush          9
	//   27   56:icmpeq          84
	//   28   59:iload           5
	//   29   61:bipush          10
	//   30   63:icmpeq          84
	//   31   66:iload           5
	//   32   68:bipush          13
	//   33   70:icmpeq          84
	//   34   73:iload_1         
	//   35   74:ifeq            94
	//   36   77:iload           5
	//   37   79:bipush          34
	//   38   81:icmpne          94
					c1 = '\001';
	//   39   84:iconst_1        
	//   40   85:istore          5
				}
				if(c1 == 0)
	//*  41   87:iload           5
	//*  42   89:ifne            103
					return s;
	//   43   92:aload_0         
	//   44   93:areturn         
				break label0;
			}
			i++;
	//   45   94:iload           4
	//   46   96:iconst_1        
	//   47   97:iadd            
	//   48   98:istore          4
		} while(true);
	//   49  100:goto            6
		stringbuffer = new StringBuffer((s.length() * 4) / 3);
	//   50  103:new             #39  <Class StringBuffer>
	//   51  106:dup             
	//   52  107:aload_0         
	//   53  108:invokevirtual   #31  <Method int String.length()>
	//   54  111:iconst_4        
	//   55  112:imul            
	//   56  113:iconst_3        
	//   57  114:idiv            
	//   58  115:invokespecial   #42  <Method void StringBuffer(int)>
	//   59  118:astore          8
		i = 0;
	//   60  120:iconst_0        
	//   61  121:istore          4
_L7:
		char c;
		if(i >= s.length())
			break MISSING_BLOCK_LABEL_311;
	//   62  123:iload           4
	//   63  125:aload_0         
	//   64  126:invokevirtual   #31  <Method int String.length()>
	//   65  129:icmpge          311
		c = s.charAt(i);
	//   66  132:aload_0         
	//   67  133:iload           4
	//   68  135:invokevirtual   #35  <Method char String.charAt(int)>
	//   69  138:istore_3        
		if(flag1 && (c == '\t' || c == '\n' || c == '\r'))
			break MISSING_BLOCK_LABEL_279;
	//   70  139:iload_2         
	//   71  140:ifeq            161
	//   72  143:iload_3         
	//   73  144:bipush          9
	//   74  146:icmpeq          279
	//   75  149:iload_3         
	//   76  150:bipush          10
	//   77  152:icmpeq          279
	//   78  155:iload_3         
	//   79  156:bipush          13
	//   80  158:icmpeq          279
		c;
	//   81  161:iload_3         
		JVM INSTR lookupswitch 4: default 204
	//	               34: 253
	//	               38: 242
	//	               60: 220
	//	               62: 231;
	//   82  162:lookupswitch    4: default 204
	//	               34: 253
	//	               38: 242
	//	               60: 220
	//	               62: 231
		   goto _L1 _L2 _L3 _L4 _L5
_L4:
		break; /* Loop/switch isn't completed */
_L1:
		stringbuffer.append(c);
	//   83  204:aload           8
	//   84  206:iload_3         
	//   85  207:invokevirtual   #46  <Method StringBuffer StringBuffer.append(char)>
	//   86  210:pop             
_L8:
		i++;
	//   87  211:iload           4
	//   88  213:iconst_1        
	//   89  214:iadd            
	//   90  215:istore          4
		if(true) goto _L7; else goto _L6
	//   91  217:goto            123
_L6:
		stringbuffer.append("&lt;");
	//   92  220:aload           8
	//   93  222:ldc1            #48  <String "&lt;">
	//   94  224:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//   95  227:pop             
		  goto _L8
	//*  96  228:goto            211
_L5:
		stringbuffer.append("&gt;");
	//   97  231:aload           8
	//   98  233:ldc1            #53  <String "&gt;">
	//   99  235:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//  100  238:pop             
		  goto _L8
	//* 101  239:goto            211
_L3:
		stringbuffer.append("&amp;");
	//  102  242:aload           8
	//  103  244:ldc1            #55  <String "&amp;">
	//  104  246:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//  105  249:pop             
		  goto _L8
	//* 106  250:goto            211
_L2:
		String s1;
		if(flag)
	//* 107  253:iload_1         
	//* 108  254:ifeq            272
			s1 = "&quot;";
	//  109  257:ldc1            #57  <String "&quot;">
	//  110  259:astore          7
		else
	//* 111  261:aload           8
	//* 112  263:aload           7
	//* 113  265:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//* 114  268:pop             
	//* 115  269:goto            211
			s1 = "\"";
	//  116  272:ldc1            #59  <String "\"">
	//  117  274:astore          7
		stringbuffer.append(s1);
		  goto _L8
	//* 118  276:goto            261
		stringbuffer.append("&#x");
	//  119  279:aload           8
	//  120  281:ldc1            #61  <String "&#x">
	//  121  283:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//  122  286:pop             
		stringbuffer.append(Integer.toHexString(((int) (c))).toUpperCase());
	//  123  287:aload           8
	//  124  289:iload_3         
	//  125  290:invokestatic    #67  <Method String Integer.toHexString(int)>
	//  126  293:invokevirtual   #71  <Method String String.toUpperCase()>
	//  127  296:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//  128  299:pop             
		stringbuffer.append(';');
	//  129  300:aload           8
	//  130  302:bipush          59
	//  131  304:invokevirtual   #46  <Method StringBuffer StringBuffer.append(char)>
	//  132  307:pop             
		  goto _L8
	//* 133  308:goto            211
		return stringbuffer.toString();
	//  134  311:aload           8
	//  135  313:invokevirtual   #74  <Method String StringBuffer.toString()>
	//  136  316:areturn         
	}

	private static void initCharTables()
	{
		xmlNameChars = new boolean[256];
	//    0    0:sipush          256
	//    1    3:newarray        boolean[]
	//    2    5:putstatic       #76  <Field boolean[] xmlNameChars>
		xmlNameStartChars = new boolean[256];
	//    3    8:sipush          256
	//    4   11:newarray        boolean[]
	//    5   13:putstatic       #78  <Field boolean[] xmlNameStartChars>
		char c = '\0';
	//    6   16:iconst_0        
	//    7   17:istore_0        
		while(c < xmlNameChars.length) 
	//*   8   18:iload_0         
	//*   9   19:getstatic       #76  <Field boolean[] xmlNameChars>
	//*  10   22:arraylength     
	//*  11   23:icmpge          181
		{
			boolean aflag[] = xmlNameStartChars;
	//   12   26:getstatic       #78  <Field boolean[] xmlNameStartChars>
	//   13   29:astore_2        
			boolean flag;
			if(c == 58 || 65 <= c && c <= 90 || c == 95 || 97 <= c && c <= 122 || 192 <= c && c <= 214 || 216 <= c && c <= 246 || 248 <= c && c <= 255)
	//*  14   30:iload_0         
	//*  15   31:bipush          58
	//*  16   33:icmpeq          108
	//*  17   36:bipush          65
	//*  18   38:iload_0         
	//*  19   39:icmpgt          48
	//*  20   42:iload_0         
	//*  21   43:bipush          90
	//*  22   45:icmple          108
	//*  23   48:iload_0         
	//*  24   49:bipush          95
	//*  25   51:icmpeq          108
	//*  26   54:bipush          97
	//*  27   56:iload_0         
	//*  28   57:icmpgt          66
	//*  29   60:iload_0         
	//*  30   61:bipush          122
	//*  31   63:icmple          108
	//*  32   66:sipush          192
	//*  33   69:iload_0         
	//*  34   70:icmpgt          80
	//*  35   73:iload_0         
	//*  36   74:sipush          214
	//*  37   77:icmple          108
	//*  38   80:sipush          216
	//*  39   83:iload_0         
	//*  40   84:icmpgt          94
	//*  41   87:iload_0         
	//*  42   88:sipush          246
	//*  43   91:icmple          108
	//*  44   94:sipush          248
	//*  45   97:iload_0         
	//*  46   98:icmpgt          171
	//*  47  101:iload_0         
	//*  48  102:sipush          255
	//*  49  105:icmpgt          171
				flag = true;
	//   50  108:iconst_1        
	//   51  109:istore_1        
			else
	//*  52  110:aload_2         
	//*  53  111:iload_0         
	//*  54  112:iload_1         
	//*  55  113:bastore         
	//*  56  114:getstatic       #76  <Field boolean[] xmlNameChars>
	//*  57  117:astore_2        
	//*  58  118:getstatic       #78  <Field boolean[] xmlNameStartChars>
	//*  59  121:iload_0         
	//*  60  122:baload          
	//*  61  123:ifne            157
	//*  62  126:iload_0         
	//*  63  127:bipush          45
	//*  64  129:icmpeq          157
	//*  65  132:iload_0         
	//*  66  133:bipush          46
	//*  67  135:icmpeq          157
	//*  68  138:bipush          48
	//*  69  140:iload_0         
	//*  70  141:icmpgt          150
	//*  71  144:iload_0         
	//*  72  145:bipush          57
	//*  73  147:icmple          157
	//*  74  150:iload_0         
	//*  75  151:sipush          183
	//*  76  154:icmpne          176
	//*  77  157:iconst_1        
	//*  78  158:istore_1        
	//*  79  159:aload_2         
	//*  80  160:iload_0         
	//*  81  161:iload_1         
	//*  82  162:bastore         
	//*  83  163:iload_0         
	//*  84  164:iconst_1        
	//*  85  165:iadd            
	//*  86  166:int2char        
	//*  87  167:istore_0        
	//*  88  168:goto            18
				flag = false;
	//   89  171:iconst_0        
	//   90  172:istore_1        
			aflag[c] = flag;
			aflag = xmlNameChars;
			if(xmlNameStartChars[c] || c == 45 || c == 46 || 48 <= c && c <= 57 || c == 183)
				flag = true;
			else
	//*  91  173:goto            110
				flag = false;
	//   92  176:iconst_0        
	//   93  177:istore_1        
			aflag[c] = flag;
			c++;
		}
	//*  94  178:goto            159
	//   95  181:return          
	}

	static boolean isControlChar(char c)
	{
		return (c <= '\037' || c == '\177') && c != '\t' && c != '\n' && c != '\r';
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:icmple          12
	//    3    6:iload_0         
	//    4    7:bipush          127
	//    5    9:icmpne          32
	//    6   12:iload_0         
	//    7   13:bipush          9
	//    8   15:icmpeq          32
	//    9   18:iload_0         
	//   10   19:bipush          10
	//   11   21:icmpeq          32
	//   12   24:iload_0         
	//   13   25:bipush          13
	//   14   27:icmpeq          32
	//   15   30:iconst_1        
	//   16   31:ireturn         
	//   17   32:iconst_0        
	//   18   33:ireturn         
	}

	static boolean isInternalProperty(String s, String s1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!"http://purl.org/dc/elements/1.1/".equals(((Object) (s)))) goto _L2; else goto _L1
	//    2    2:ldc1            #84  <String "http://purl.org/dc/elements/1.1/">
	//    3    4:aload_0         
	//    4    5:invokevirtual   #88  <Method boolean String.equals(Object)>
	//    5    8:ifeq            33
_L1:
		if("dc:format".equals(((Object) (s1))) || "dc:language".equals(((Object) (s1))))
	//*   6   11:ldc1            #90  <String "dc:format">
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*   9   17:ifne            29
	//*  10   20:ldc1            #92  <String "dc:language">
	//*  11   22:aload_1         
	//*  12   23:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  13   26:ifeq            31
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_2        
_L4:
		return flag;
	//   16   31:iload_2         
	//   17   32:ireturn         
_L2:
		if(!"http://ns.adobe.com/xap/1.0/".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   18   33:ldc1            #94  <String "http://ns.adobe.com/xap/1.0/">
	//   19   35:aload_0         
	//   20   36:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   21   39:ifeq            98
		if("xmp:BaseURL".equals(((Object) (s1))) || "xmp:CreatorTool".equals(((Object) (s1))) || "xmp:Format".equals(((Object) (s1))) || "xmp:Locale".equals(((Object) (s1))) || "xmp:MetadataDate".equals(((Object) (s1))) || "xmp:ModifyDate".equals(((Object) (s1))))
	//*  22   42:ldc1            #96  <String "xmp:BaseURL">
	//*  23   44:aload_1         
	//*  24   45:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  25   48:ifne            96
	//*  26   51:ldc1            #98  <String "xmp:CreatorTool">
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  29   57:ifne            96
	//*  30   60:ldc1            #100 <String "xmp:Format">
	//*  31   62:aload_1         
	//*  32   63:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  33   66:ifne            96
	//*  34   69:ldc1            #102 <String "xmp:Locale">
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  37   75:ifne            96
	//*  38   78:ldc1            #104 <String "xmp:MetadataDate">
	//*  39   80:aload_1         
	//*  40   81:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  41   84:ifne            96
	//*  42   87:ldc1            #106 <String "xmp:ModifyDate">
	//*  43   89:aload_1         
	//*  44   90:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  45   93:ifeq            31
			return true;
	//   46   96:iconst_1        
	//   47   97:ireturn         
		if(true) goto _L4; else goto _L3
_L3:
		if(!"http://ns.adobe.com/pdf/1.3/".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   48   98:ldc1            #108 <String "http://ns.adobe.com/pdf/1.3/">
	//   49  100:aload_0         
	//   50  101:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   51  104:ifeq            154
		if("pdf:BaseURL".equals(((Object) (s1))) || "pdf:Creator".equals(((Object) (s1))) || "pdf:ModDate".equals(((Object) (s1))) || "pdf:PDFVersion".equals(((Object) (s1))) || "pdf:Producer".equals(((Object) (s1))))
	//*  52  107:ldc1            #110 <String "pdf:BaseURL">
	//*  53  109:aload_1         
	//*  54  110:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  55  113:ifne            152
	//*  56  116:ldc1            #112 <String "pdf:Creator">
	//*  57  118:aload_1         
	//*  58  119:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  59  122:ifne            152
	//*  60  125:ldc1            #114 <String "pdf:ModDate">
	//*  61  127:aload_1         
	//*  62  128:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  63  131:ifne            152
	//*  64  134:ldc1            #116 <String "pdf:PDFVersion">
	//*  65  136:aload_1         
	//*  66  137:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  67  140:ifne            152
	//*  68  143:ldc1            #118 <String "pdf:Producer">
	//*  69  145:aload_1         
	//*  70  146:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  71  149:ifeq            31
			return true;
	//   72  152:iconst_1        
	//   73  153:ireturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(!"http://ns.adobe.com/tiff/1.0/".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   74  154:ldc1            #120 <String "http://ns.adobe.com/tiff/1.0/">
	//   75  156:aload_0         
	//   76  157:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   77  160:ifeq            194
		flag = true;
	//   78  163:iconst_1        
	//   79  164:istore_2        
		if("tiff:ImageDescription".equals(((Object) (s1))) || "tiff:Artist".equals(((Object) (s1))) || "tiff:Copyright".equals(((Object) (s1))))
	//*  80  165:ldc1            #122 <String "tiff:ImageDescription">
	//*  81  167:aload_1         
	//*  82  168:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  83  171:ifne            192
	//*  84  174:ldc1            #124 <String "tiff:Artist">
	//*  85  176:aload_1         
	//*  86  177:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  87  180:ifne            192
	//*  88  183:ldc1            #126 <String "tiff:Copyright">
	//*  89  185:aload_1         
	//*  90  186:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  91  189:ifeq            31
			return false;
	//   92  192:iconst_0        
	//   93  193:ireturn         
		if(true) goto _L4; else goto _L6
_L6:
		if(!"http://ns.adobe.com/exif/1.0/".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   94  194:ldc1            #128 <String "http://ns.adobe.com/exif/1.0/">
	//   95  196:aload_0         
	//   96  197:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   97  200:ifeq            216
		flag = true;
	//   98  203:iconst_1        
	//   99  204:istore_2        
		if("exif:UserComment".equals(((Object) (s1))))
	//* 100  205:ldc1            #130 <String "exif:UserComment">
	//* 101  207:aload_1         
	//* 102  208:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 103  211:ifeq            31
			return false;
	//  104  214:iconst_0        
	//  105  215:ireturn         
		if(true) goto _L4; else goto _L7
_L7:
		if("http://ns.adobe.com/exif/1.0/aux/".equals(((Object) (s))))
	//* 106  216:ldc1            #132 <String "http://ns.adobe.com/exif/1.0/aux/">
	//* 107  218:aload_0         
	//* 108  219:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 109  222:ifeq            227
			return true;
	//  110  225:iconst_1        
	//  111  226:ireturn         
		if(!"http://ns.adobe.com/photoshop/1.0/".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//  112  227:ldc1            #134 <String "http://ns.adobe.com/photoshop/1.0/">
	//  113  229:aload_0         
	//  114  230:invokevirtual   #88  <Method boolean String.equals(Object)>
	//  115  233:ifeq            247
		if("photoshop:ICCProfile".equals(((Object) (s1))))
	//* 116  236:ldc1            #136 <String "photoshop:ICCProfile">
	//* 117  238:aload_1         
	//* 118  239:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 119  242:ifeq            31
			return true;
	//  120  245:iconst_1        
	//  121  246:ireturn         
		if(true) goto _L4; else goto _L8
_L8:
		if(!"http://ns.adobe.com/camera-raw-settings/1.0/".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//  122  247:ldc1            #138 <String "http://ns.adobe.com/camera-raw-settings/1.0/">
	//  123  249:aload_0         
	//  124  250:invokevirtual   #88  <Method boolean String.equals(Object)>
	//  125  253:ifeq            285
		if("crs:Version".equals(((Object) (s1))) || "crs:RawFileName".equals(((Object) (s1))) || "crs:ToneCurveName".equals(((Object) (s1))))
	//* 126  256:ldc1            #140 <String "crs:Version">
	//* 127  258:aload_1         
	//* 128  259:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 129  262:ifne            283
	//* 130  265:ldc1            #142 <String "crs:RawFileName">
	//* 131  267:aload_1         
	//* 132  268:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 133  271:ifne            283
	//* 134  274:ldc1            #144 <String "crs:ToneCurveName">
	//* 135  276:aload_1         
	//* 136  277:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 137  280:ifeq            31
			return true;
	//  138  283:iconst_1        
	//  139  284:ireturn         
		if(true) goto _L4; else goto _L9
_L9:
		if("http://ns.adobe.com/StockPhoto/1.0/".equals(((Object) (s))))
	//* 140  285:ldc1            #146 <String "http://ns.adobe.com/StockPhoto/1.0/">
	//* 141  287:aload_0         
	//* 142  288:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 143  291:ifeq            296
			return true;
	//  144  294:iconst_1        
	//  145  295:ireturn         
		if("http://ns.adobe.com/xap/1.0/mm/".equals(((Object) (s))))
	//* 146  296:ldc1            #148 <String "http://ns.adobe.com/xap/1.0/mm/">
	//* 147  298:aload_0         
	//* 148  299:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 149  302:ifeq            307
			return true;
	//  150  305:iconst_1        
	//  151  306:ireturn         
		if("http://ns.adobe.com/xap/1.0/t/".equals(((Object) (s))))
	//* 152  307:ldc1            #150 <String "http://ns.adobe.com/xap/1.0/t/">
	//* 153  309:aload_0         
	//* 154  310:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 155  313:ifeq            318
			return true;
	//  156  316:iconst_1        
	//  157  317:ireturn         
		if("http://ns.adobe.com/xap/1.0/t/pg/".equals(((Object) (s))))
	//* 158  318:ldc1            #152 <String "http://ns.adobe.com/xap/1.0/t/pg/">
	//* 159  320:aload_0         
	//* 160  321:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 161  324:ifeq            329
			return true;
	//  162  327:iconst_1        
	//  163  328:ireturn         
		if("http://ns.adobe.com/xap/1.0/g/".equals(((Object) (s))))
	//* 164  329:ldc1            #154 <String "http://ns.adobe.com/xap/1.0/g/">
	//* 165  331:aload_0         
	//* 166  332:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 167  335:ifeq            340
			return true;
	//  168  338:iconst_1        
	//  169  339:ireturn         
		if("http://ns.adobe.com/xap/1.0/g/img/".equals(((Object) (s))))
	//* 170  340:ldc1            #156 <String "http://ns.adobe.com/xap/1.0/g/img/">
	//* 171  342:aload_0         
	//* 172  343:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 173  346:ifeq            351
			return true;
	//  174  349:iconst_1        
	//  175  350:ireturn         
		if("http://ns.adobe.com/xap/1.0/sType/Font#".equals(((Object) (s))))
	//* 176  351:ldc1            #158 <String "http://ns.adobe.com/xap/1.0/sType/Font#">
	//* 177  353:aload_0         
	//* 178  354:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 179  357:ifeq            31
			return true;
	//  180  360:iconst_1        
	//  181  361:ireturn         
		if(true) goto _L4; else goto _L10
_L10:
	}

	private static boolean isNameChar(char c)
	{
		return c <= '\377' && xmlNameChars[c] || isNameStartChar(c) || c >= '\u0300' && c <= '\u036F' || c >= '\u203F' && c <= '\u2040';
	//    0    0:iload_0         
	//    1    1:sipush          255
	//    2    4:icmpgt          15
	//    3    7:getstatic       #76  <Field boolean[] xmlNameChars>
	//    4   10:iload_0         
	//    5   11:baload          
	//    6   12:ifne            50
	//    7   15:iload_0         
	//    8   16:invokestatic    #162 <Method boolean isNameStartChar(char)>
	//    9   19:ifne            50
	//   10   22:iload_0         
	//   11   23:sipush          768
	//   12   26:icmplt          36
	//   13   29:iload_0         
	//   14   30:sipush          879
	//   15   33:icmple          50
	//   16   36:iload_0         
	//   17   37:sipush          8255
	//   18   40:icmplt          52
	//   19   43:iload_0         
	//   20   44:sipush          8256
	//   21   47:icmpgt          52
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	private static boolean isNameStartChar(char c)
	{
		return c <= '\377' && xmlNameStartChars[c] || c >= '\u0100' && c <= '\u02FF' || c >= '\u0370' && c <= '\u037D' || c >= '\u037F' && c <= '\u1FFF' || c >= '\u200C' && c <= '\u200D' || c >= '\u2070' && c <= '\u218F' || c >= '\u2C00' && c <= '\u2FEF' || c >= '\u3001' && c <= '\uD7FF' || c >= '\uF900' && c <= '\uFDCF' || c >= '\uFDF0' && c <= '\uFFFD' || c >= '\0' && c <= '\0';
	//    0    0:iload_0         
	//    1    1:sipush          255
	//    2    4:icmpgt          15
	//    3    7:getstatic       #78  <Field boolean[] xmlNameStartChars>
	//    4   10:iload_0         
	//    5   11:baload          
	//    6   12:ifne            148
	//    7   15:iload_0         
	//    8   16:sipush          256
	//    9   19:icmplt          29
	//   10   22:iload_0         
	//   11   23:sipush          767
	//   12   26:icmple          148
	//   13   29:iload_0         
	//   14   30:sipush          880
	//   15   33:icmplt          43
	//   16   36:iload_0         
	//   17   37:sipush          893
	//   18   40:icmple          148
	//   19   43:iload_0         
	//   20   44:sipush          895
	//   21   47:icmplt          57
	//   22   50:iload_0         
	//   23   51:sipush          8191
	//   24   54:icmple          148
	//   25   57:iload_0         
	//   26   58:sipush          8204
	//   27   61:icmplt          71
	//   28   64:iload_0         
	//   29   65:sipush          8205
	//   30   68:icmple          148
	//   31   71:iload_0         
	//   32   72:sipush          8304
	//   33   75:icmplt          85
	//   34   78:iload_0         
	//   35   79:sipush          8591
	//   36   82:icmple          148
	//   37   85:iload_0         
	//   38   86:sipush          11264
	//   39   89:icmplt          99
	//   40   92:iload_0         
	//   41   93:sipush          12271
	//   42   96:icmple          148
	//   43   99:iload_0         
	//   44  100:sipush          12289
	//   45  103:icmplt          112
	//   46  106:iload_0         
	//   47  107:ldc1            #163 <Int 55295>
	//   48  109:icmple          148
	//   49  112:iload_0         
	//   50  113:ldc1            #164 <Int 63744>
	//   51  115:icmplt          124
	//   52  118:iload_0         
	//   53  119:ldc1            #165 <Int 64975>
	//   54  121:icmple          148
	//   55  124:iload_0         
	//   56  125:ldc1            #166 <Int 65008>
	//   57  127:icmplt          136
	//   58  130:iload_0         
	//   59  131:ldc1            #167 <Int 65533>
	//   60  133:icmple          148
	//   61  136:iload_0         
	//   62  137:ldc1            #168 <Int 0x10000>
	//   63  139:icmplt          150
	//   64  142:iload_0         
	//   65  143:ldc1            #169 <Int 0xeffff>
	//   66  145:icmpgt          150
	//   67  148:iconst_1        
	//   68  149:ireturn         
	//   69  150:iconst_0        
	//   70  151:ireturn         
	}

	public static boolean isXMLName(String s)
	{
		if(s.length() <= 0 || isNameStartChar(s.charAt(0))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method int String.length()>
	//    2    4:ifle            20
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #35  <Method char String.charAt(int)>
	//    6   12:invokestatic    #162 <Method boolean isNameStartChar(char)>
	//    7   15:ifne            20
_L1:
		return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
_L2:
		int i = 1;
	//   10   20:iconst_1        
	//   11   21:istore_1        
label0:
		do
		{
label1:
			{
				if(i >= s.length())
					break label1;
	//   12   22:iload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #31  <Method int String.length()>
	//   15   27:icmpge          48
				if(!isNameChar(s.charAt(i)))
					break label0;
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #35  <Method char String.charAt(int)>
	//   19   35:invokestatic    #172 <Method boolean isNameChar(char)>
	//   20   38:ifeq            18
				i++;
	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_1        
			}
		} while(true);
	//   25   45:goto            22
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   26   48:iconst_1        
	//   27   49:ireturn         
	}

	public static boolean isXMLNameNS(String s)
	{
		if(s.length() <= 0 || isNameStartChar(s.charAt(0)) && s.charAt(0) != ':') goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method int String.length()>
	//    2    4:ifle            30
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #35  <Method char String.charAt(int)>
	//    6   12:invokestatic    #162 <Method boolean isNameStartChar(char)>
	//    7   15:ifeq            28
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #35  <Method char String.charAt(int)>
	//   11   23:bipush          58
	//   12   25:icmpne          30
_L1:
		return false;
	//   13   28:iconst_0        
	//   14   29:ireturn         
_L2:
		int i = 1;
	//   15   30:iconst_1        
	//   16   31:istore_1        
label0:
		do
		{
label1:
			{
				if(i >= s.length())
					break label1;
	//   17   32:iload_1         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #31  <Method int String.length()>
	//   20   37:icmpge          68
				if(!isNameChar(s.charAt(i)) || s.charAt(i) == ':')
					break label0;
	//   21   40:aload_0         
	//   22   41:iload_1         
	//   23   42:invokevirtual   #35  <Method char String.charAt(int)>
	//   24   45:invokestatic    #172 <Method boolean isNameChar(char)>
	//   25   48:ifeq            28
	//   26   51:aload_0         
	//   27   52:iload_1         
	//   28   53:invokevirtual   #35  <Method char String.charAt(int)>
	//   29   56:bipush          58
	//   30   58:icmpeq          28
				i++;
	//   31   61:iload_1         
	//   32   62:iconst_1        
	//   33   63:iadd            
	//   34   64:istore_1        
			}
		} while(true);
	//   35   65:goto            32
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   36   68:iconst_1        
	//   37   69:ireturn         
	}

	public static String normalizeLangValue(String s)
	{
		int i;
		int j;
		StringBuffer stringbuffer;
		if("x-default".equals(((Object) (s))))
	//*   0    0:ldc1            #177 <String "x-default">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            11
			return s;
	//    4    9:aload_0         
	//    5   10:areturn         
		j = 1;
	//    6   11:iconst_1        
	//    7   12:istore_2        
		stringbuffer = new StringBuffer();
	//    8   13:new             #39  <Class StringBuffer>
	//    9   16:dup             
	//   10   17:invokespecial   #178 <Method void StringBuffer()>
	//   11   20:astore          4
		i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
_L8:
		if(i >= s.length()) goto _L2; else goto _L1
	//   14   24:iload_1         
	//   15   25:aload_0         
	//   16   26:invokevirtual   #31  <Method int String.length()>
	//   17   29:icmpge          136
_L1:
		int k = j;
	//   18   32:iload_2         
	//   19   33:istore_3        
		s.charAt(i);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:invokevirtual   #35  <Method char String.charAt(int)>
		JVM INSTR lookupswitch 3: default 72
	//	               32: 93
	//	               45: 102
	//	               95: 102;
	//   23   39:lookupswitch    3: default 72
	//	               32: 93
	//	               45: 102
	//	               95: 102
		   goto _L3 _L4 _L5 _L5
_L4:
		break; /* Loop/switch isn't completed */
_L3:
		if(j != 2)
	//*  24   72:iload_2         
	//*  25   73:iconst_2        
	//*  26   74:icmpeq          117
		{
			stringbuffer.append(Character.toLowerCase(s.charAt(i)));
	//   27   77:aload           4
	//   28   79:aload_0         
	//   29   80:iload_1         
	//   30   81:invokevirtual   #35  <Method char String.charAt(int)>
	//   31   84:invokestatic    #184 <Method char Character.toLowerCase(char)>
	//   32   87:invokevirtual   #46  <Method StringBuffer StringBuffer.append(char)>
	//   33   90:pop             
			k = j;
	//   34   91:iload_2         
	//   35   92:istore_3        
		} else
	//*  36   93:iload_1         
	//*  37   94:iconst_1        
	//*  38   95:iadd            
	//*  39   96:istore_1        
	//*  40   97:iload_3         
	//*  41   98:istore_2        
	//*  42   99:goto            24
	//*  43  102:aload           4
	//*  44  104:bipush          45
	//*  45  106:invokevirtual   #46  <Method StringBuffer StringBuffer.append(char)>
	//*  46  109:pop             
	//*  47  110:iload_2         
	//*  48  111:iconst_1        
	//*  49  112:iadd            
	//*  50  113:istore_3        
	//*  51  114:goto            93
		{
			stringbuffer.append(Character.toUpperCase(s.charAt(i)));
	//   52  117:aload           4
	//   53  119:aload_0         
	//   54  120:iload_1         
	//   55  121:invokevirtual   #35  <Method char String.charAt(int)>
	//   56  124:invokestatic    #186 <Method char Character.toUpperCase(char)>
	//   57  127:invokevirtual   #46  <Method StringBuffer StringBuffer.append(char)>
	//   58  130:pop             
			k = j;
	//   59  131:iload_2         
	//   60  132:istore_3        
		}
_L6:
		i++;
		j = k;
		continue; /* Loop/switch isn't completed */
_L5:
		stringbuffer.append('-');
		k = j + 1;
		if(true) goto _L6; else goto _L2
	//*  61  133:goto            93
_L2:
		return stringbuffer.toString();
	//   62  136:aload           4
	//   63  138:invokevirtual   #74  <Method String StringBuffer.toString()>
	//   64  141:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	static String removeControlChars(String s)
	{
		s = ((String) (new StringBuffer(s)));
	//    0    0:new             #39  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #190 <Method void StringBuffer(String)>
	//    4    8:astore_0        
		for(int i = 0; i < ((StringBuffer) (s)).length(); i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:invokevirtual   #191 <Method int StringBuffer.length()>
	//*  10   16:icmpge          44
			if(isControlChar(((StringBuffer) (s)).charAt(i)))
	//*  11   19:aload_0         
	//*  12   20:iload_1         
	//*  13   21:invokevirtual   #192 <Method char StringBuffer.charAt(int)>
	//*  14   24:invokestatic    #194 <Method boolean isControlChar(char)>
	//*  15   27:ifeq            37
				((StringBuffer) (s)).setCharAt(i, ' ');
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:bipush          32
	//   19   34:invokevirtual   #198 <Method void StringBuffer.setCharAt(int, char)>

	//   20   37:iload_1         
	//   21   38:iconst_1        
	//   22   39:iadd            
	//   23   40:istore_1        
	//*  24   41:goto            11
		return ((StringBuffer) (s)).toString();
	//   25   44:aload_0         
	//   26   45:invokevirtual   #74  <Method String StringBuffer.toString()>
	//   27   48:areturn         
	}

	static String[] splitNameAndValue(String s)
	{
		int j = s.indexOf('=');
	//    0    0:aload_0         
	//    1    1:bipush          61
	//    2    3:invokevirtual   #204 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		int i = 1;
	//    4    7:iconst_1        
	//    5    8:istore_1        
		if(s.charAt(1) == '?')
	//*   6    9:aload_0         
	//*   7   10:iconst_1        
	//*   8   11:invokevirtual   #35  <Method char String.charAt(int)>
	//*   9   14:bipush          63
	//*  10   16:icmpne          23
			i = 1 + 1;
	//   11   19:iconst_1        
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:istore_1        
		String s1 = s.substring(i, j);
	//   15   23:aload_0         
	//   16   24:iload_1         
	//   17   25:iload_2         
	//   18   26:invokevirtual   #208 <Method String String.substring(int, int)>
	//   19   29:astore          5
		i = j + 1;
	//   20   31:iload_2         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
		char c = s.charAt(i);
	//   24   35:aload_0         
	//   25   36:iload_1         
	//   26   37:invokevirtual   #35  <Method char String.charAt(int)>
	//   27   40:istore_3        
		i++;
	//   28   41:iload_1         
	//   29   42:iconst_1        
	//   30   43:iadd            
	//   31   44:istore_1        
		int l = s.length() - 2;
	//   32   45:aload_0         
	//   33   46:invokevirtual   #31  <Method int String.length()>
	//   34   49:iconst_2        
	//   35   50:isub            
	//   36   51:istore          4
		StringBuffer stringbuffer = new StringBuffer(l - j);
	//   37   53:new             #39  <Class StringBuffer>
	//   38   56:dup             
	//   39   57:iload           4
	//   40   59:iload_2         
	//   41   60:isub            
	//   42   61:invokespecial   #42  <Method void StringBuffer(int)>
	//   43   64:astore          6
		do
		{
			if(i >= l)
				break;
	//   44   66:iload_1         
	//   45   67:iload           4
	//   46   69:icmpge          105
			stringbuffer.append(s.charAt(i));
	//   47   72:aload           6
	//   48   74:aload_0         
	//   49   75:iload_1         
	//   50   76:invokevirtual   #35  <Method char String.charAt(int)>
	//   51   79:invokevirtual   #46  <Method StringBuffer StringBuffer.append(char)>
	//   52   82:pop             
			int k = i + 1;
	//   53   83:iload_1         
	//   54   84:iconst_1        
	//   55   85:iadd            
	//   56   86:istore_2        
			i = k;
	//   57   87:iload_2         
	//   58   88:istore_1        
			if(s.charAt(k) == c)
	//*  59   89:aload_0         
	//*  60   90:iload_2         
	//*  61   91:invokevirtual   #35  <Method char String.charAt(int)>
	//*  62   94:iload_3         
	//*  63   95:icmpne          66
				i = k + 1;
	//   64   98:iload_2         
	//   65   99:iconst_1        
	//   66  100:iadd            
	//   67  101:istore_1        
		} while(true);
	//   68  102:goto            66
		return (new String[] {
			s1, stringbuffer.toString()
		});
	//   69  105:iconst_2        
	//   70  106:anewarray       String[]
	//   71  109:dup             
	//   72  110:iconst_0        
	//   73  111:aload           5
	//   74  113:aastore         
	//   75  114:dup             
	//   76  115:iconst_1        
	//   77  116:aload           6
	//   78  118:invokevirtual   #74  <Method String StringBuffer.toString()>
	//   79  121:aastore         
	//   80  122:areturn         
	}

	public static final int UUID_LENGTH = 36;
	public static final int UUID_SEGMENT_COUNT = 4;
	private static boolean xmlNameChars[];
	private static boolean xmlNameStartChars[];

	static 
	{
		initCharTables();
	//    0    0:invokestatic    #19  <Method void initCharTables()>
	//*   1    3:return          
	}
}
