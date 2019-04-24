// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml;


public class XMLUtil
{

	public XMLUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String escapeXML(String s, boolean flag)
	{
		int i;
		int j;
		StringBuffer stringbuffer;
		s = ((String) (s.toCharArray()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method char[] String.toCharArray()>
	//    2    4:astore_0        
		j = s.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_3        
		stringbuffer = new StringBuffer();
	//    6    8:new             #19  <Class StringBuffer>
	//    7   11:dup             
	//    8   12:invokespecial   #20  <Method void StringBuffer()>
	//    9   15:astore          5
		i = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
_L8:
		int k;
		if(i >= j)
			break MISSING_BLOCK_LABEL_191;
	//   12   19:iload_2         
	//   13   20:iload_3         
	//   14   21:icmpge          191
		k = ((int) (s[i]));
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:caload          
	//   18   27:istore          4
		k;
	//   19   29:iload           4
		JVM INSTR lookupswitch 5: default 80
	//	               34: 157
	//	               38: 146
	//	               39: 168
	//	               60: 124
	//	               62: 135;
	//   20   31:lookupswitch    5: default 80
	//	               34: 157
	//	               38: 146
	//	               39: 168
	//	               60: 124
	//	               62: 135
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L4:
		break MISSING_BLOCK_LABEL_168;
_L5:
		break; /* Loop/switch isn't completed */
_L1:
		if(!isValidCharacterValue(k))
			break; /* Loop/switch isn't completed */
	//   21   80:iload           4
	//   22   82:invokestatic    #24  <Method boolean isValidCharacterValue(int)>
	//   23   85:ifeq            117
		if(flag && k > 127)
	//*  24   88:iload_1         
	//*  25   89:ifeq            179
	//*  26   92:iload           4
	//*  27   94:bipush          127
	//*  28   96:icmple          179
			stringbuffer.append("&#").append(k).append(';');
	//   29   99:aload           5
	//   30  101:ldc1            #26  <String "&#">
	//   31  103:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//   32  106:iload           4
	//   33  108:invokevirtual   #33  <Method StringBuffer StringBuffer.append(int)>
	//   34  111:bipush          59
	//   35  113:invokevirtual   #36  <Method StringBuffer StringBuffer.append(char)>
	//   36  116:pop             
		else
	//*  37  117:iload_2         
	//*  38  118:iconst_1        
	//*  39  119:iadd            
	//*  40  120:istore_2        
	//*  41  121:goto            19
	//*  42  124:aload           5
	//*  43  126:ldc1            #38  <String "&lt;">
	//*  44  128:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//*  45  131:pop             
	//*  46  132:goto            117
	//*  47  135:aload           5
	//*  48  137:ldc1            #40  <String "&gt;">
	//*  49  139:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//*  50  142:pop             
	//*  51  143:goto            117
	//*  52  146:aload           5
	//*  53  148:ldc1            #42  <String "&amp;">
	//*  54  150:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//*  55  153:pop             
	//*  56  154:goto            117
	//*  57  157:aload           5
	//*  58  159:ldc1            #44  <String "&quot;">
	//*  59  161:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//*  60  164:pop             
	//*  61  165:goto            117
	//*  62  168:aload           5
	//*  63  170:ldc1            #46  <String "&apos;">
	//*  64  172:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//*  65  175:pop             
	//*  66  176:goto            117
			stringbuffer.append((char)k);
	//   67  179:aload           5
	//   68  181:iload           4
	//   69  183:int2char        
	//   70  184:invokevirtual   #36  <Method StringBuffer StringBuffer.append(char)>
	//   71  187:pop             
_L9:
		i++;
		if(true) goto _L8; else goto _L7
_L7:
		stringbuffer.append("&lt;");
		  goto _L9
_L6:
		stringbuffer.append("&gt;");
		  goto _L9
_L3:
		stringbuffer.append("&amp;");
		  goto _L9
_L2:
		stringbuffer.append("&quot;");
		  goto _L9
		stringbuffer.append("&apos;");
		  goto _L9
	//*  72  188:goto            117
		return stringbuffer.toString();
	//   73  191:aload           5
	//   74  193:invokevirtual   #50  <Method String StringBuffer.toString()>
	//   75  196:areturn         
	}

	public static int findInArray(char c, char ac[], int i)
	{
		for(; i < ac.length; i++)
	//*   0    0:iload_2         
	//*   1    1:aload_1         
	//*   2    2:arraylength     
	//*   3    3:icmpge          23
			if(ac[i] == ';')
	//*   4    6:aload_1         
	//*   5    7:iload_2         
	//*   6    8:caload          
	//*   7    9:bipush          59
	//*   8   11:icmpne          16
				return i;
	//    9   14:iload_2         
	//   10   15:ireturn         

	//   11   16:iload_2         
	//   12   17:iconst_1        
	//   13   18:iadd            
	//   14   19:istore_2        
	//*  15   20:goto            0
		return -1;
	//   16   23:iconst_m1       
	//   17   24:ireturn         
	}

	public static String getEncodingName(byte abyte0[])
	{
		int i = abyte0[0] & 0xff;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:sipush          255
	//    4    6:iand            
	//    5    7:istore_1        
		int j = abyte0[1] & 0xff;
	//    6    8:aload_0         
	//    7    9:iconst_1        
	//    8   10:baload          
	//    9   11:sipush          255
	//   10   14:iand            
	//   11   15:istore_2        
		if(i == 254 && j == 255)
	//*  12   16:iload_1         
	//*  13   17:sipush          254
	//*  14   20:icmpne          33
	//*  15   23:iload_2         
	//*  16   24:sipush          255
	//*  17   27:icmpne          33
			return "UTF-16BE";
	//   18   30:ldc1            #56  <String "UTF-16BE">
	//   19   32:areturn         
		if(i == 255 && j == 254)
	//*  20   33:iload_1         
	//*  21   34:sipush          255
	//*  22   37:icmpne          50
	//*  23   40:iload_2         
	//*  24   41:sipush          254
	//*  25   44:icmpne          50
			return "UTF-16LE";
	//   26   47:ldc1            #58  <String "UTF-16LE">
	//   27   49:areturn         
		int k = abyte0[2] & 0xff;
	//   28   50:aload_0         
	//   29   51:iconst_2        
	//   30   52:baload          
	//   31   53:sipush          255
	//   32   56:iand            
	//   33   57:istore_3        
		if(i == 239 && j == 187 && k == 191)
	//*  34   58:iload_1         
	//*  35   59:sipush          239
	//*  36   62:icmpne          82
	//*  37   65:iload_2         
	//*  38   66:sipush          187
	//*  39   69:icmpne          82
	//*  40   72:iload_3         
	//*  41   73:sipush          191
	//*  42   76:icmpne          82
			return "UTF-8";
	//   43   79:ldc1            #60  <String "UTF-8">
	//   44   81:areturn         
		int l = abyte0[3] & 0xff;
	//   45   82:aload_0         
	//   46   83:iconst_3        
	//   47   84:baload          
	//   48   85:sipush          255
	//   49   88:iand            
	//   50   89:istore          4
		if(i == 0 && j == 0 && k == 0 && l == 60)
	//*  51   91:iload_1         
	//*  52   92:ifne            113
	//*  53   95:iload_2         
	//*  54   96:ifne            113
	//*  55   99:iload_3         
	//*  56  100:ifne            113
	//*  57  103:iload           4
	//*  58  105:bipush          60
	//*  59  107:icmpne          113
			return "ISO-10646-UCS-4";
	//   60  110:ldc1            #62  <String "ISO-10646-UCS-4">
	//   61  112:areturn         
		if(i == 60 && j == 0 && k == 0 && l == 0)
	//*  62  113:iload_1         
	//*  63  114:bipush          60
	//*  64  116:icmpne          135
	//*  65  119:iload_2         
	//*  66  120:ifne            135
	//*  67  123:iload_3         
	//*  68  124:ifne            135
	//*  69  127:iload           4
	//*  70  129:ifne            135
			return "ISO-10646-UCS-4";
	//   71  132:ldc1            #62  <String "ISO-10646-UCS-4">
	//   72  134:areturn         
		if(i == 0 && j == 0 && k == 60 && l == 0)
	//*  73  135:iload_1         
	//*  74  136:ifne            157
	//*  75  139:iload_2         
	//*  76  140:ifne            157
	//*  77  143:iload_3         
	//*  78  144:bipush          60
	//*  79  146:icmpne          157
	//*  80  149:iload           4
	//*  81  151:ifne            157
			return "ISO-10646-UCS-4";
	//   82  154:ldc1            #62  <String "ISO-10646-UCS-4">
	//   83  156:areturn         
		if(i == 0 && j == 60 && k == 0 && l == 0)
	//*  84  157:iload_1         
	//*  85  158:ifne            179
	//*  86  161:iload_2         
	//*  87  162:bipush          60
	//*  88  164:icmpne          179
	//*  89  167:iload_3         
	//*  90  168:ifne            179
	//*  91  171:iload           4
	//*  92  173:ifne            179
			return "ISO-10646-UCS-4";
	//   93  176:ldc1            #62  <String "ISO-10646-UCS-4">
	//   94  178:areturn         
		if(i == 0 && j == 60 && k == 0 && l == 63)
	//*  95  179:iload_1         
	//*  96  180:ifne            203
	//*  97  183:iload_2         
	//*  98  184:bipush          60
	//*  99  186:icmpne          203
	//* 100  189:iload_3         
	//* 101  190:ifne            203
	//* 102  193:iload           4
	//* 103  195:bipush          63
	//* 104  197:icmpne          203
			return "UTF-16BE";
	//  105  200:ldc1            #56  <String "UTF-16BE">
	//  106  202:areturn         
		if(i == 60 && j == 0 && k == 63 && l == 0)
	//* 107  203:iload_1         
	//* 108  204:bipush          60
	//* 109  206:icmpne          227
	//* 110  209:iload_2         
	//* 111  210:ifne            227
	//* 112  213:iload_3         
	//* 113  214:bipush          63
	//* 114  216:icmpne          227
	//* 115  219:iload           4
	//* 116  221:ifne            227
			return "UTF-16LE";
	//  117  224:ldc1            #58  <String "UTF-16LE">
	//  118  226:areturn         
		if(i == 76 && j == 111 && k == 167 && l == 148)
	//* 119  227:iload_1         
	//* 120  228:bipush          76
	//* 121  230:icmpne          257
	//* 122  233:iload_2         
	//* 123  234:bipush          111
	//* 124  236:icmpne          257
	//* 125  239:iload_3         
	//* 126  240:sipush          167
	//* 127  243:icmpne          257
	//* 128  246:iload           4
	//* 129  248:sipush          148
	//* 130  251:icmpne          257
			return "CP037";
	//  131  254:ldc1            #64  <String "CP037">
	//  132  256:areturn         
		else
			return "UTF-8";
	//  133  257:ldc1            #60  <String "UTF-8">
	//  134  259:areturn         
	}

	public static boolean isValidCharacterValue(int i)
	{
		return i == 9 || i == 10 || i == 13 || i >= 32 && i <= 55295 || i >= 57344 && i <= 65533 || i >= 0x10000 && i <= 0x10ffff;
	//    0    0:iload_0         
	//    1    1:bipush          9
	//    2    3:icmpeq          54
	//    3    6:iload_0         
	//    4    7:bipush          10
	//    5    9:icmpeq          54
	//    6   12:iload_0         
	//    7   13:bipush          13
	//    8   15:icmpeq          54
	//    9   18:iload_0         
	//   10   19:bipush          32
	//   11   21:icmplt          30
	//   12   24:iload_0         
	//   13   25:ldc1            #65  <Int 55295>
	//   14   27:icmple          54
	//   15   30:iload_0         
	//   16   31:ldc1            #66  <Int 57344>
	//   17   33:icmplt          42
	//   18   36:iload_0         
	//   19   37:ldc1            #67  <Int 65533>
	//   20   39:icmple          54
	//   21   42:iload_0         
	//   22   43:ldc1            #68  <Int 0x10000>
	//   23   45:icmplt          56
	//   24   48:iload_0         
	//   25   49:ldc1            #69  <Int 0x10ffff>
	//   26   51:icmpgt          56
	//   27   54:iconst_1        
	//   28   55:ireturn         
	//   29   56:iconst_0        
	//   30   57:ireturn         
	}

	public static boolean isValidCharacterValue(String s)
	{
		boolean flag;
		try
		{
			flag = isValidCharacterValue(Integer.parseInt(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #78  <Method int Integer.parseInt(String)>
	//    2    4:invokestatic    #24  <Method boolean isValidCharacterValue(int)>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_0        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public static int unescape(String s)
	{
		if("apos".equals(((Object) (s))))
	//*   0    0:ldc1            #81  <String "apos">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            12
			return 39;
	//    4    9:bipush          39
	//    5   11:ireturn         
		if("quot".equals(((Object) (s))))
	//*   6   12:ldc1            #87  <String "quot">
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            24
			return 34;
	//   10   21:bipush          34
	//   11   23:ireturn         
		if("lt".equals(((Object) (s))))
	//*  12   24:ldc1            #89  <String "lt">
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  15   30:ifeq            36
			return 60;
	//   16   33:bipush          60
	//   17   35:ireturn         
		if("gt".equals(((Object) (s))))
	//*  18   36:ldc1            #91  <String "gt">
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  21   42:ifeq            48
			return 62;
	//   22   45:bipush          62
	//   23   47:ireturn         
		return !"amp".equals(((Object) (s))) ? -1 : 38;
	//   24   48:ldc1            #93  <String "amp">
	//   25   50:aload_0         
	//   26   51:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   27   54:ifeq            60
	//   28   57:bipush          38
	//   29   59:ireturn         
	//   30   60:iconst_m1       
	//   31   61:ireturn         
	}

	public static String unescapeXML(String s)
	{
		int l;
		int j1;
		StringBuffer stringbuffer;
		s = ((String) (s.toCharArray()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method char[] String.toCharArray()>
	//    2    4:astore_0        
		j1 = s.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore          7
		stringbuffer = new StringBuffer();
	//    6    9:new             #19  <Class StringBuffer>
	//    7   12:dup             
	//    8   13:invokespecial   #20  <Method void StringBuffer()>
	//    9   16:astore          8
		l = 0;
	//   10   18:iconst_0        
	//   11   19:istore          4
_L12:
		if(l >= j1) goto _L2; else goto _L1
	//   12   21:iload           4
	//   13   23:iload           7
	//   14   25:icmpge          171
_L1:
		int i;
		int k;
		char c;
		c = s[l];
	//   15   28:aload_0         
	//   16   29:iload           4
	//   17   31:caload          
	//   18   32:istore          5
		k = ((int) (c));
	//   19   34:iload           5
	//   20   36:istore_3        
		i = l;
	//   21   37:iload           4
	//   22   39:istore_1        
		if(c != '&') goto _L4; else goto _L3
	//   23   40:iload           5
	//   24   42:bipush          38
	//   25   44:icmpne          124
_L3:
		int j;
		j = findInArray(';', ((char []) (s)), l + 3);
	//   26   47:bipush          59
	//   27   49:aload_0         
	//   28   50:iload           4
	//   29   52:iconst_3        
	//   30   53:iadd            
	//   31   54:invokestatic    #97  <Method int findInArray(char, char[], int)>
	//   32   57:istore_2        
		k = ((int) (c));
	//   33   58:iload           5
	//   34   60:istore_3        
		i = l;
	//   35   61:iload           4
	//   36   63:istore_1        
		if(j <= -1) goto _L4; else goto _L5
	//   37   64:iload_2         
	//   38   65:iconst_m1       
	//   39   66:icmple          124
_L5:
		String s1 = new String(((char []) (s)), l + 1, j - l - 1);
	//   40   69:new             #13  <Class String>
	//   41   72:dup             
	//   42   73:aload_0         
	//   43   74:iload           4
	//   44   76:iconst_1        
	//   45   77:iadd            
	//   46   78:iload_2         
	//   47   79:iload           4
	//   48   81:isub            
	//   49   82:iconst_1        
	//   50   83:isub            
	//   51   84:invokespecial   #100 <Method void String(char[], int, int)>
	//   52   87:astore          9
		if(!s1.startsWith("#")) goto _L7; else goto _L6
	//   53   89:aload           9
	//   54   91:ldc1            #102 <String "#">
	//   55   93:invokevirtual   #105 <Method boolean String.startsWith(String)>
	//   56   96:ifeq            145
_L6:
		s1 = s1.substring(1);
	//   57   99:aload           9
	//   58  101:iconst_1        
	//   59  102:invokevirtual   #109 <Method String String.substring(int)>
	//   60  105:astore          9
		if(!isValidCharacterValue(s1)) goto _L9; else goto _L8
	//   61  107:aload           9
	//   62  109:invokestatic    #111 <Method boolean isValidCharacterValue(String)>
	//   63  112:ifeq            140
_L8:
		k = ((int) ((char)Integer.parseInt(s1)));
	//   64  115:aload           9
	//   65  117:invokestatic    #78  <Method int Integer.parseInt(String)>
	//   66  120:int2char        
	//   67  121:istore_3        
		i = j;
	//   68  122:iload_2         
	//   69  123:istore_1        
_L4:
		stringbuffer.append((char)k);
	//   70  124:aload           8
	//   71  126:iload_3         
	//   72  127:int2char        
	//   73  128:invokevirtual   #36  <Method StringBuffer StringBuffer.append(char)>
	//   74  131:pop             
_L10:
		l = i + 1;
	//   75  132:iload_1         
	//   76  133:iconst_1        
	//   77  134:iadd            
	//   78  135:istore          4
		continue; /* Loop/switch isn't completed */
	//   79  137:goto            21
_L9:
		i = j;
	//   80  140:iload_2         
	//   81  141:istore_1        
		if(true) goto _L10; else goto _L7
	//   82  142:goto            132
_L7:
		int i1 = unescape(s1);
	//   83  145:aload           9
	//   84  147:invokestatic    #113 <Method int unescape(String)>
	//   85  150:istore          6
		k = ((int) (c));
	//   86  152:iload           5
	//   87  154:istore_3        
		i = l;
	//   88  155:iload           4
	//   89  157:istore_1        
		if(i1 > 0)
	//*  90  158:iload           6
	//*  91  160:ifle            124
		{
			k = i1;
	//   92  163:iload           6
	//   93  165:istore_3        
			i = j;
	//   94  166:iload_2         
	//   95  167:istore_1        
		}
		if(true) goto _L4; else goto _L2
	//   96  168:goto            124
_L2:
		return stringbuffer.toString();
	//   97  171:aload           8
	//   98  173:invokevirtual   #50  <Method String StringBuffer.toString()>
	//   99  176:areturn         
		if(true) goto _L12; else goto _L11
_L11:
	}
}
