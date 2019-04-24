// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Chunk;
import java.util.ArrayList;
import java.util.List;

public class HTMLUtils
{

	public HTMLUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static List sanitize(String s, boolean flag)
	{
		return sanitize(s, flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #14  <Method List sanitize(String, boolean, boolean)>
	//    4    6:areturn         
	}

	private static List sanitize(String s, boolean flag, boolean flag1)
	{
		StringBuilder stringbuilder1 = new StringBuilder();
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void StringBuilder()>
	//    3    7:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #18  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #19  <Method void StringBuilder()>
	//    7   16:astore          7
		char ac[] = s.toCharArray();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #25  <Method char[] String.toCharArray()>
	//   10   22:astore          10
		ArrayList arraylist = new ArrayList();
	//   11   24:new             #27  <Class ArrayList>
	//   12   27:dup             
	//   13   28:invokespecial   #28  <Method void ArrayList()>
	//   14   31:astore          8
		int i;
		int j;
		boolean flag2;
		if(ac.length > 0)
	//*  15   33:aload           10
	//*  16   35:arraylength     
	//*  17   36:ifle            151
			flag2 = Character.isWhitespace(ac[0]);
	//   18   39:aload           10
	//   19   41:iconst_0        
	//   20   42:caload          
	//   21   43:invokestatic    #34  <Method boolean Character.isWhitespace(char)>
	//   22   46:istore          6
		else
	//*  23   48:aload           10
	//*  24   50:arraylength     
	//*  25   51:istore          5
	//*  26   53:iconst_0        
	//*  27   54:istore          4
	//*  28   56:aload           7
	//*  29   58:astore_0        
	//*  30   59:iload           4
	//*  31   61:iload           5
	//*  32   63:icmpge          190
	//*  33   66:aload           10
	//*  34   68:iload           4
	//*  35   70:caload          
	//*  36   71:istore_3        
	//*  37   72:aload_0         
	//*  38   73:astore          7
	//*  39   75:iload           6
	//*  40   77:ifeq            121
	//*  41   80:aload_0         
	//*  42   81:astore          7
	//*  43   83:iload_3         
	//*  44   84:invokestatic    #34  <Method boolean Character.isWhitespace(char)>
	//*  45   87:ifne            121
	//*  46   90:aload           9
	//*  47   92:invokevirtual   #38  <Method int StringBuilder.length()>
	//*  48   95:ifne            157
	//*  49   98:aload           8
	//*  50  100:aload_0         
	//*  51  101:invokevirtual   #42  <Method String StringBuilder.toString()>
	//*  52  104:iload_1         
	//*  53  105:invokestatic    #48  <Method Chunk Chunk.createWhitespace(String, boolean)>
	//*  54  108:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//*  55  111:pop             
	//*  56  112:new             #18  <Class StringBuilder>
	//*  57  115:dup             
	//*  58  116:invokespecial   #19  <Method void StringBuilder()>
	//*  59  119:astore          7
	//*  60  121:iload_3         
	//*  61  122:invokestatic    #34  <Method boolean Character.isWhitespace(char)>
	//*  62  125:istore          6
	//*  63  127:iload           6
	//*  64  129:ifeq            180
	//*  65  132:aload           7
	//*  66  134:iload_3         
	//*  67  135:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//*  68  138:pop             
	//*  69  139:iload           4
	//*  70  141:iconst_1        
	//*  71  142:iadd            
	//*  72  143:istore          4
	//*  73  145:aload           7
	//*  74  147:astore_0        
	//*  75  148:goto            59
			flag2 = true;
	//   76  151:iconst_1        
	//   77  152:istore          6
		j = ac.length;
		i = 0;
		s = ((String) (stringbuilder));
		while(i < j) 
		{
			char c = ac[i];
			Object obj = ((Object) (s));
			if(flag2)
			{
				obj = ((Object) (s));
				if(!Character.isWhitespace(c))
				{
					if(stringbuilder1.length() == 0)
					{
						arraylist.add(((Object) (Chunk.createWhitespace(((StringBuilder) (s)).toString(), flag))));
					} else
	//*  78  154:goto            48
					{
						if(!flag)
	//*  79  157:iload_1         
	//*  80  158:ifeq            174
	//*  81  161:aload           9
	//*  82  163:aload_0         
	//*  83  164:checkcast       #58  <Class CharSequence>
	//*  84  167:invokevirtual   #61  <Method StringBuilder StringBuilder.append(CharSequence)>
	//*  85  170:pop             
	//*  86  171:goto            112
							s = " ";
	//   87  174:ldc1            #63  <String " ">
	//   88  176:astore_0        
						stringbuilder1.append((CharSequence)s);
					}
					obj = ((Object) (new StringBuilder()));
				}
			}
			flag2 = Character.isWhitespace(c);
			if(flag2)
				((StringBuilder) (obj)).append(c);
			else
	//*  89  177:goto            161
				stringbuilder1.append(c);
	//   90  180:aload           9
	//   91  182:iload_3         
	//   92  183:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   93  186:pop             
			i++;
			s = ((String) (obj));
		}
	//*  94  187:goto            139
		if(stringbuilder1.length() > 0)
	//*  95  190:aload           9
	//*  96  192:invokevirtual   #38  <Method int StringBuilder.length()>
	//*  97  195:ifle            244
		{
			String s1;
			if(flag1)
	//*  98  198:iload_2         
	//*  99  199:ifeq            268
				s1 = stringbuilder1.toString().replace(Character.valueOf('\240').charValue(), Character.valueOf(' ').charValue());
	//  100  202:aload           9
	//  101  204:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  102  207:sipush          160
	//  103  210:invokestatic    #67  <Method Character Character.valueOf(char)>
	//  104  213:invokevirtual   #71  <Method char Character.charValue()>
	//  105  216:bipush          32
	//  106  218:invokestatic    #67  <Method Character Character.valueOf(char)>
	//  107  221:invokevirtual   #71  <Method char Character.charValue()>
	//  108  224:invokevirtual   #75  <Method String String.replace(char, char)>
	//  109  227:astore          7
			else
	//* 110  229:aload           8
	//* 111  231:new             #44  <Class Chunk>
	//* 112  234:dup             
	//* 113  235:aload           7
	//* 114  237:invokespecial   #78  <Method void Chunk(String)>
	//* 115  240:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//* 116  243:pop             
	//* 117  244:aload_0         
	//* 118  245:invokevirtual   #38  <Method int StringBuilder.length()>
	//* 119  248:ifle            265
	//* 120  251:aload           8
	//* 121  253:aload_0         
	//* 122  254:invokevirtual   #42  <Method String StringBuilder.toString()>
	//* 123  257:iload_1         
	//* 124  258:invokestatic    #48  <Method Chunk Chunk.createWhitespace(String, boolean)>
	//* 125  261:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//* 126  264:pop             
	//* 127  265:aload           8
	//* 128  267:areturn         
				s1 = stringbuilder1.toString();
	//  129  268:aload           9
	//  130  270:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  131  273:astore          7
			arraylist.add(((Object) (new Chunk(s1))));
		}
		if(((StringBuilder) (s)).length() > 0)
			arraylist.add(((Object) (Chunk.createWhitespace(((StringBuilder) (s)).toString(), flag))));
		return ((List) (arraylist));
	//* 132  275:goto            229
	}

	public static List sanitizeInline(String s, boolean flag)
	{
		return sanitize(s, flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #14  <Method List sanitize(String, boolean, boolean)>
	//    4    6:areturn         
	}

	public static List sanitizeInline(String s, boolean flag, boolean flag1)
	{
		return sanitize(s, flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #14  <Method List sanitize(String, boolean, boolean)>
	//    4    6:areturn         
	}
}
