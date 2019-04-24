// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import java.util.Locale;

public class LanguageUtils
{

	public LanguageUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String simpleLangTag(Locale locale)
	{
		return locale.getLanguage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method String Locale.getLanguage()>
	//    2    4:areturn         
	}

	public static String toBcp47Language(Locale locale)
	{
		Object obj;
		Object obj1;
		String s;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return locale.toLanguageTag();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #27  <Method String Locale.toLanguageTag()>
	//    5   12:areturn         
		String s1 = locale.getLanguage();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #17  <Method String Locale.getLanguage()>
	//    8   17:astore          4
		String s2 = locale.getCountry();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #30  <Method String Locale.getCountry()>
	//   11   23:astore          5
		locale = ((Locale) (locale.getVariant()));
	//   12   25:aload_0         
	//   13   26:invokevirtual   #33  <Method String Locale.getVariant()>
	//   14   29:astore_0        
		s = s1;
	//   15   30:aload           4
	//   16   32:astore_3        
		obj1 = ((Object) (s2));
	//   17   33:aload           5
	//   18   35:astore_2        
		obj = ((Object) (locale));
	//   19   36:aload_0         
	//   20   37:astore_1        
		if(s1.equals("no"))
	//*  21   38:aload           4
	//*  22   40:ldc1            #35  <String "no">
	//*  23   42:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  24   45:ifeq            92
		{
			s = s1;
	//   25   48:aload           4
	//   26   50:astore_3        
			obj1 = ((Object) (s2));
	//   27   51:aload           5
	//   28   53:astore_2        
			obj = ((Object) (locale));
	//   29   54:aload_0         
	//   30   55:astore_1        
			if(s2.equals("NO"))
	//*  31   56:aload           5
	//*  32   58:ldc1            #43  <String "NO">
	//*  33   60:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  34   63:ifeq            92
			{
				s = s1;
	//   35   66:aload           4
	//   36   68:astore_3        
				obj1 = ((Object) (s2));
	//   37   69:aload           5
	//   38   71:astore_2        
				obj = ((Object) (locale));
	//   39   72:aload_0         
	//   40   73:astore_1        
				if(((String) (locale)).equals("NY"))
	//*  41   74:aload_0         
	//*  42   75:ldc1            #45  <String "NY">
	//*  43   77:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  44   80:ifeq            92
				{
					s = "nn";
	//   45   83:ldc1            #47  <String "nn">
	//   46   85:astore_3        
					obj1 = "NO";
	//   47   86:ldc1            #43  <String "NO">
	//   48   88:astore_2        
					obj = "";
	//   49   89:ldc1            #49  <String "">
	//   50   91:astore_1        
				}
			}
		}
		if(!s.isEmpty() && s.matches("\\p{Alpha}{2,8}")) goto _L2; else goto _L1
	//   51   92:aload_3         
	//   52   93:invokevirtual   #53  <Method boolean String.isEmpty()>
	//   53   96:ifne            108
	//   54   99:aload_3         
	//   55  100:ldc1            #55  <String "\\p{Alpha}{2,8}">
	//   56  102:invokevirtual   #59  <Method boolean String.matches(String)>
	//   57  105:ifne            189
_L1:
		locale = "und";
	//   58  108:ldc1            #61  <String "und">
	//   59  110:astore_0        
_L4:
		s = ((String) (obj1));
	//   60  111:aload_2         
	//   61  112:astore_3        
		if(!((String) (obj1)).matches("\\p{Alpha}{2}|\\p{Digit}{3}"))
	//*  62  113:aload_2         
	//*  63  114:ldc1            #63  <String "\\p{Alpha}{2}|\\p{Digit}{3}">
	//*  64  116:invokevirtual   #59  <Method boolean String.matches(String)>
	//*  65  119:ifne            125
			s = "";
	//   66  122:ldc1            #49  <String "">
	//   67  124:astore_3        
		obj1 = obj;
	//   68  125:aload_1         
	//   69  126:astore_2        
		if(!((String) (obj)).matches("\\p{Alnum}{5,8}|\\p{Digit}\\p{Alnum}{3}"))
	//*  70  127:aload_1         
	//*  71  128:ldc1            #65  <String "\\p{Alnum}{5,8}|\\p{Digit}\\p{Alnum}{3}">
	//*  72  130:invokevirtual   #59  <Method boolean String.matches(String)>
	//*  73  133:ifne            139
			obj1 = "";
	//   74  136:ldc1            #49  <String "">
	//   75  138:astore_2        
		locale = ((Locale) (new StringBuilder(((String) (locale)))));
	//   76  139:new             #67  <Class StringBuilder>
	//   77  142:dup             
	//   78  143:aload_0         
	//   79  144:invokespecial   #70  <Method void StringBuilder(String)>
	//   80  147:astore_0        
		if(!s.isEmpty())
	//*  81  148:aload_3         
	//*  82  149:invokevirtual   #53  <Method boolean String.isEmpty()>
	//*  83  152:ifne            166
			((StringBuilder) (locale)).append('-').append(s);
	//   84  155:aload_0         
	//   85  156:bipush          45
	//   86  158:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   87  161:aload_3         
	//   88  162:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   89  165:pop             
		if(!((String) (obj1)).isEmpty())
	//*  90  166:aload_2         
	//*  91  167:invokevirtual   #53  <Method boolean String.isEmpty()>
	//*  92  170:ifne            184
			((StringBuilder) (locale)).append('-').append(((String) (obj1)));
	//   93  173:aload_0         
	//   94  174:bipush          45
	//   95  176:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   96  179:aload_2         
	//   97  180:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   98  183:pop             
		return ((StringBuilder) (locale)).toString();
	//   99  184:aload_0         
	//  100  185:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  101  188:areturn         
_L2:
		if(s.equals("iw"))
	//* 102  189:aload_3         
	//* 103  190:ldc1            #82  <String "iw">
	//* 104  192:invokevirtual   #41  <Method boolean String.equals(Object)>
	//* 105  195:ifeq            204
			locale = "he";
	//  106  198:ldc1            #84  <String "he">
	//  107  200:astore_0        
		else
	//* 108  201:goto            111
		if(s.equals("in"))
	//* 109  204:aload_3         
	//* 110  205:ldc1            #86  <String "in">
	//* 111  207:invokevirtual   #41  <Method boolean String.equals(Object)>
	//* 112  210:ifeq            219
		{
			locale = "id";
	//  113  213:ldc1            #88  <String "id">
	//  114  215:astore_0        
		} else
	//* 115  216:goto            111
		{
			locale = ((Locale) (s));
	//  116  219:aload_3         
	//  117  220:astore_0        
			if(s.equals("ji"))
	//* 118  221:aload_3         
	//* 119  222:ldc1            #90  <String "ji">
	//* 120  224:invokevirtual   #41  <Method boolean String.equals(Object)>
	//* 121  227:ifeq            111
				locale = "yi";
	//  122  230:ldc1            #92  <String "yi">
	//  123  232:astore_0        
		}
		if(true) goto _L4; else goto _L3
	//  124  233:goto            111
_L3:
	}
}
