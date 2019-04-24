// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html;

import com.itextpdf.text.BaseColor;
import java.util.HashSet;
import java.util.Set;

public final class HtmlEncoder
{

	private HtmlEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
	//    2    4:return          
	}

	public static String encode(BaseColor basecolor)
	{
		StringBuffer stringbuffer = new StringBuffer("#");
	//    0    0:new             #79  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:ldc1            #81  <String "#">
	//    3    6:invokespecial   #84  <Method void StringBuffer(String)>
	//    4    9:astore_1        
		if(basecolor.getRed() < 16)
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #90  <Method int BaseColor.getRed()>
	//*   7   14:bipush          16
	//*   8   16:icmpge          26
			stringbuffer.append('0');
	//    9   19:aload_1         
	//   10   20:bipush          48
	//   11   22:invokevirtual   #93  <Method StringBuffer StringBuffer.append(char)>
	//   12   25:pop             
		stringbuffer.append(Integer.toString(basecolor.getRed(), 16));
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #90  <Method int BaseColor.getRed()>
	//   16   31:bipush          16
	//   17   33:invokestatic    #98  <Method String Integer.toString(int, int)>
	//   18   36:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   19   39:pop             
		if(basecolor.getGreen() < 16)
	//*  20   40:aload_0         
	//*  21   41:invokevirtual   #104 <Method int BaseColor.getGreen()>
	//*  22   44:bipush          16
	//*  23   46:icmpge          56
			stringbuffer.append('0');
	//   24   49:aload_1         
	//   25   50:bipush          48
	//   26   52:invokevirtual   #93  <Method StringBuffer StringBuffer.append(char)>
	//   27   55:pop             
		stringbuffer.append(Integer.toString(basecolor.getGreen(), 16));
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:invokevirtual   #104 <Method int BaseColor.getGreen()>
	//   31   61:bipush          16
	//   32   63:invokestatic    #98  <Method String Integer.toString(int, int)>
	//   33   66:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   34   69:pop             
		if(basecolor.getBlue() < 16)
	//*  35   70:aload_0         
	//*  36   71:invokevirtual   #107 <Method int BaseColor.getBlue()>
	//*  37   74:bipush          16
	//*  38   76:icmpge          86
			stringbuffer.append('0');
	//   39   79:aload_1         
	//   40   80:bipush          48
	//   41   82:invokevirtual   #93  <Method StringBuffer StringBuffer.append(char)>
	//   42   85:pop             
		stringbuffer.append(Integer.toString(basecolor.getBlue(), 16));
	//   43   86:aload_1         
	//   44   87:aload_0         
	//   45   88:invokevirtual   #107 <Method int BaseColor.getBlue()>
	//   46   91:bipush          16
	//   47   93:invokestatic    #98  <Method String Integer.toString(int, int)>
	//   48   96:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   49   99:pop             
		return stringbuffer.toString();
	//   50  100:aload_1         
	//   51  101:invokevirtual   #108 <Method String StringBuffer.toString()>
	//   52  104:areturn         
	}

	public static String encode(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int String.length()>
	//    2    4:istore_2        
		StringBuffer stringbuffer = new StringBuffer();
	//    3    5:new             #79  <Class StringBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #113 <Method void StringBuffer()>
	//    6   12:astore          4
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_1        
		while(i < j) 
	//*   9   16:iload_1         
	//*  10   17:iload_2         
	//*  11   18:icmpge          72
		{
			char c = s.charAt(i);
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #117 <Method char String.charAt(int)>
	//   15   26:istore_3        
			if(c < '\u0100')
	//*  16   27:iload_3         
	//*  17   28:sipush          256
	//*  18   31:icmpge          52
				stringbuffer.append(HTML_CODE[c]);
	//   19   34:aload           4
	//   20   36:getstatic       #16  <Field String[] HTML_CODE>
	//   21   39:iload_3         
	//   22   40:aaload          
	//   23   41:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   24   44:pop             
			else
	//*  25   45:iload_1         
	//*  26   46:iconst_1        
	//*  27   47:iadd            
	//*  28   48:istore_1        
	//*  29   49:goto            16
				stringbuffer.append("&#").append(((int) (c))).append(';');
	//   30   52:aload           4
	//   31   54:ldc1            #56  <String "&#">
	//   32   56:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   33   59:iload_3         
	//   34   60:invokevirtual   #120 <Method StringBuffer StringBuffer.append(int)>
	//   35   63:bipush          59
	//   36   65:invokevirtual   #93  <Method StringBuffer StringBuffer.append(char)>
	//   37   68:pop             
			i++;
		}
	//*  38   69:goto            45
		return stringbuffer.toString();
	//   39   72:aload           4
	//   40   74:invokevirtual   #108 <Method String StringBuffer.toString()>
	//   41   77:areturn         
	}

	public static String getAlignment(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 8: default 52
	//	               0 55
	//	               1 58
	//	               2 61
	//	               3 64
	//	               4 67
	//	               5 70
	//	               6 73
	//	               7 76
	//	               8 64
		default:
			return "";
	//    2   52:ldc1            #124 <String "">
	//    3   54:areturn         

		case 0: // '\0'
			return "left";
	//    4   55:ldc1            #126 <String "left">
	//    5   57:areturn         

		case 1: // '\001'
			return "center";
	//    6   58:ldc1            #128 <String "center">
	//    7   60:areturn         

		case 2: // '\002'
			return "right";
	//    8   61:ldc1            #130 <String "right">
	//    9   63:areturn         

		case 3: // '\003'
		case 8: // '\b'
			return "justify";
	//   10   64:ldc1            #132 <String "justify">
	//   11   66:areturn         

		case 4: // '\004'
			return "top";
	//   12   67:ldc1            #134 <String "top">
	//   13   69:areturn         

		case 5: // '\005'
			return "middle";
	//   14   70:ldc1            #136 <String "middle">
	//   15   72:areturn         

		case 6: // '\006'
			return "bottom";
	//   16   73:ldc1            #138 <String "bottom">
	//   17   75:areturn         

		case 7: // '\007'
			return "baseline";
	//   18   76:ldc1            #140 <String "baseline">
	//   19   78:areturn         
		}
	}

	public static boolean isNewLineTag(String s)
	{
		return NEWLINETAGS.contains(((Object) (s)));
	//    0    0:getstatic       #61  <Field Set NEWLINETAGS>
	//    1    3:aload_0         
	//    2    4:invokeinterface #145 <Method boolean Set.contains(Object)>
	//    3    9:ireturn         
	}

	private static final String HTML_CODE[];
	private static final Set NEWLINETAGS;

	static 
	{
		HTML_CODE = new String[256];
	//    0    0:sipush          256
	//    1    3:anewarray       String[]
	//    2    6:putstatic       #16  <Field String[] HTML_CODE>
		for(int i = 0; i < 10; i++)
	//*   3    9:iconst_0        
	//*   4   10:istore_0        
	//*   5   11:iload_0         
	//*   6   12:bipush          10
	//*   7   14:icmpge          53
			HTML_CODE[i] = (new StringBuilder()).append("&#00").append(i).append(";").toString();
	//    8   17:getstatic       #16  <Field String[] HTML_CODE>
	//    9   20:iload_0         
	//   10   21:new             #18  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #21  <Method void StringBuilder()>
	//   13   28:ldc1            #23  <String "&#00">
	//   14   30:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:iload_0         
	//   16   34:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   17   37:ldc1            #32  <String ";">
	//   18   39:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   20   45:aastore         

	//   21   46:iload_0         
	//   22   47:iconst_1        
	//   23   48:iadd            
	//   24   49:istore_0        
	//*  25   50:goto            11
		for(int j = 10; j < 32; j++)
	//*  26   53:bipush          10
	//*  27   55:istore_0        
	//*  28   56:iload_0         
	//*  29   57:bipush          32
	//*  30   59:icmpge          98
			HTML_CODE[j] = (new StringBuilder()).append("&#0").append(j).append(";").toString();
	//   31   62:getstatic       #16  <Field String[] HTML_CODE>
	//   32   65:iload_0         
	//   33   66:new             #18  <Class StringBuilder>
	//   34   69:dup             
	//   35   70:invokespecial   #21  <Method void StringBuilder()>
	//   36   73:ldc1            #38  <String "&#0">
	//   37   75:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   38   78:iload_0         
	//   39   79:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   40   82:ldc1            #32  <String ";">
	//   41   84:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   42   87:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   43   90:aastore         

	//   44   91:iload_0         
	//   45   92:iconst_1        
	//   46   93:iadd            
	//   47   94:istore_0        
	//*  48   95:goto            56
		for(int k = 32; k < 128; k++)
	//*  49   98:bipush          32
	//*  50  100:istore_0        
	//*  51  101:iload_0         
	//*  52  102:sipush          128
	//*  53  105:icmpge          125
			HTML_CODE[k] = String.valueOf((char)k);
	//   54  108:getstatic       #16  <Field String[] HTML_CODE>
	//   55  111:iload_0         
	//   56  112:iload_0         
	//   57  113:int2char        
	//   58  114:invokestatic    #42  <Method String String.valueOf(char)>
	//   59  117:aastore         

	//   60  118:iload_0         
	//   61  119:iconst_1        
	//   62  120:iadd            
	//   63  121:istore_0        
	//*  64  122:goto            101
		HTML_CODE[9] = "\t";
	//   65  125:getstatic       #16  <Field String[] HTML_CODE>
	//   66  128:bipush          9
	//   67  130:ldc1            #44  <String "\t">
	//   68  132:aastore         
		HTML_CODE[10] = "<br />\n";
	//   69  133:getstatic       #16  <Field String[] HTML_CODE>
	//   70  136:bipush          10
	//   71  138:ldc1            #46  <String "<br />\n">
	//   72  140:aastore         
		HTML_CODE[34] = "&quot;";
	//   73  141:getstatic       #16  <Field String[] HTML_CODE>
	//   74  144:bipush          34
	//   75  146:ldc1            #48  <String "&quot;">
	//   76  148:aastore         
		HTML_CODE[38] = "&amp;";
	//   77  149:getstatic       #16  <Field String[] HTML_CODE>
	//   78  152:bipush          38
	//   79  154:ldc1            #50  <String "&amp;">
	//   80  156:aastore         
		HTML_CODE[60] = "&lt;";
	//   81  157:getstatic       #16  <Field String[] HTML_CODE>
	//   82  160:bipush          60
	//   83  162:ldc1            #52  <String "&lt;">
	//   84  164:aastore         
		HTML_CODE[62] = "&gt;";
	//   85  165:getstatic       #16  <Field String[] HTML_CODE>
	//   86  168:bipush          62
	//   87  170:ldc1            #54  <String "&gt;">
	//   88  172:aastore         
		for(int l = 128; l < '\u0100'; l++)
	//*  89  173:sipush          128
	//*  90  176:istore_0        
	//*  91  177:iload_0         
	//*  92  178:sipush          256
	//*  93  181:icmpge          220
			HTML_CODE[l] = (new StringBuilder()).append("&#").append(l).append(";").toString();
	//   94  184:getstatic       #16  <Field String[] HTML_CODE>
	//   95  187:iload_0         
	//   96  188:new             #18  <Class StringBuilder>
	//   97  191:dup             
	//   98  192:invokespecial   #21  <Method void StringBuilder()>
	//   99  195:ldc1            #56  <String "&#">
	//  100  197:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  101  200:iload_0         
	//  102  201:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//  103  204:ldc1            #32  <String ";">
	//  104  206:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  105  209:invokevirtual   #36  <Method String StringBuilder.toString()>
	//  106  212:aastore         

	//  107  213:iload_0         
	//  108  214:iconst_1        
	//  109  215:iadd            
	//  110  216:istore_0        
	//* 111  217:goto            177
		NEWLINETAGS = ((Set) (new HashSet()));
	//  112  220:new             #58  <Class HashSet>
	//  113  223:dup             
	//  114  224:invokespecial   #59  <Method void HashSet()>
	//  115  227:putstatic       #61  <Field Set NEWLINETAGS>
		NEWLINETAGS.add("p");
	//  116  230:getstatic       #61  <Field Set NEWLINETAGS>
	//  117  233:ldc1            #63  <String "p">
	//  118  235:invokeinterface #69  <Method boolean Set.add(Object)>
	//  119  240:pop             
		NEWLINETAGS.add("blockquote");
	//  120  241:getstatic       #61  <Field Set NEWLINETAGS>
	//  121  244:ldc1            #71  <String "blockquote">
	//  122  246:invokeinterface #69  <Method boolean Set.add(Object)>
	//  123  251:pop             
		NEWLINETAGS.add("br");
	//  124  252:getstatic       #61  <Field Set NEWLINETAGS>
	//  125  255:ldc1            #73  <String "br">
	//  126  257:invokeinterface #69  <Method boolean Set.add(Object)>
	//  127  262:pop             
	//* 128  263:return          
	}
}
