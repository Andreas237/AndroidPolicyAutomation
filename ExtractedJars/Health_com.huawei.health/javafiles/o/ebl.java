// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.FilenameFilter;
import java.util.*;

class ebl
{

	static String a(Locale locale)
	{
		String s = locale.getLanguage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method String Locale.getLanguage()>
	//    2    4:astore_2        
		byte byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_1        
		switch(s.hashCode())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #49  <Method int String.hashCode()>
		{
	//*   7   11:lookupswitch    3: default 44
	//	               3404: 61
	//	               3679: 75
	//	               101385: 47
	//*   8   44:goto            86
		case 101385: 
			if(s.equals("fil"))
	//*   9   47:aload_2         
	//*  10   48:ldc1            #51  <String "fil">
	//*  11   50:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  12   53:ifeq            86
				byte0 = 0;
	//   13   56:iconst_0        
	//   14   57:istore_1        
			break;

	//*  15   58:goto            86
		case 3404: 
			if(s.equals("jv"))
	//*  16   61:aload_2         
	//*  17   62:ldc1            #57  <String "jv">
	//*  18   64:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  19   67:ifeq            86
				byte0 = 1;
	//   20   70:iconst_1        
	//   21   71:istore_1        
			break;

	//*  22   72:goto            86
		case 3679: 
			if(s.equals("sr"))
	//*  23   75:aload_2         
	//*  24   76:ldc1            #59  <String "sr">
	//*  25   78:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  26   81:ifeq            86
				byte0 = 2;
	//   27   84:iconst_2        
	//   28   85:istore_1        
			break;
		}
		switch(byte0)
	//*  29   86:iload_1         
		{
	//*  30   87:tableswitch     0 2: default 112
	//	               0 114
	//	               1 117
	//	               2 120
		default:
			return s;
	//   31  112:aload_2         
	//   32  113:areturn         

		case 0: // '\0'
			return "tl";
	//   33  114:ldc1            #61  <String "tl">
	//   34  116:areturn         

		case 1: // '\001'
			return "b+jv+Latn";
	//   35  117:ldc1            #63  <String "b+jv+Latn">
	//   36  119:areturn         

		case 2: // '\002'
			break;
		}
		if(locale.toString().endsWith("#Latn"))
	//*  37  120:aload_0         
	//*  38  121:invokevirtual   #66  <Method String Locale.toString()>
	//*  39  124:ldc1            #68  <String "#Latn">
	//*  40  126:invokevirtual   #72  <Method boolean String.endsWith(String)>
	//*  41  129:ifeq            135
			s = "b+sr+Latn";
	//   42  132:ldc1            #74  <String "b+sr+Latn">
	//   43  134:astore_2        
		return s;
	//   44  135:aload_2         
	//   45  136:areturn         
	}

	private static void a(HashSet hashset)
	{
		hashset.clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method void HashSet.clear()>
		hashset.add("en");
	//    2    4:aload_0         
	//    3    5:ldc1            #79  <String "en">
	//    4    7:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//    5   10:pop             
		hashset.add("es");
	//    6   11:aload_0         
	//    7   12:ldc1            #84  <String "es">
	//    8   14:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//    9   17:pop             
		hashset.add("fr");
	//   10   18:aload_0         
	//   11   19:ldc1            #86  <String "fr">
	//   12   21:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   13   24:pop             
		hashset.add("ru");
	//   14   25:aload_0         
	//   15   26:ldc1            #88  <String "ru">
	//   16   28:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   17   31:pop             
		hashset.add("zh-CN");
	//   18   32:aload_0         
	//   19   33:ldc1            #90  <String "zh-CN">
	//   20   35:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   21   38:pop             
	//   22   39:return          
	}

	static String b(Locale locale)
	{
		String s1 = a(locale);
	//    0    0:aload_0         
	//    1    1:invokestatic    #93  <Method String a(Locale)>
	//    2    4:astore_2        
		locale = ((Locale) ((new StringBuilder()).append(s1).append("-").append(locale.getCountry()).toString()));
	//    3    5:new             #95  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #96  <Method void StringBuilder()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:ldc1            #102 <String "-">
	//    9   18:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #105 <Method String Locale.getCountry()>
	//   12   25:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   14   31:astore_0        
		String s = (String)d.get(((Object) (locale)));
	//   15   32:getstatic       #20  <Field HashMap d>
	//   16   35:aload_0         
	//   17   36:invokevirtual   #110 <Method Object HashMap.get(Object)>
	//   18   39:checkcast       #45  <Class String>
	//   19   42:astore_1        
		locale = ((Locale) (s));
	//   20   43:aload_1         
	//   21   44:astore_0        
		if(s == null)
	//*  22   45:aload_1         
	//*  23   46:ifnonnull       60
			locale = ((Locale) ((String)d.get(((Object) (s1)))));
	//   24   49:getstatic       #20  <Field HashMap d>
	//   25   52:aload_2         
	//   26   53:invokevirtual   #110 <Method Object HashMap.get(Object)>
	//   27   56:checkcast       #45  <Class String>
	//   28   59:astore_0        
		return ((String) (locale));
	//   29   60:aload_0         
	//   30   61:areturn         
	}

	static String b(Locale locale, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #95  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #114 <Method void StringBuilder(int)>
	//    4    9:astore          4
		stringbuilder.append("HuaweiHealth-").append(s1);
	//    5   11:aload           4
	//    6   13:ldc1            #116 <String "HuaweiHealth-">
	//    7   15:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append('-').append(a(locale));
	//   11   23:aload           4
	//   12   25:bipush          45
	//   13   27:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
	//   14   30:aload_0         
	//   15   31:invokestatic    #93  <Method String a(Locale)>
	//   16   34:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		byte byte0 = -1;
	//   18   38:iconst_m1       
	//   19   39:istore_3        
		switch(s.hashCode())
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #49  <Method int String.hashCode()>
		{
	//*  22   44:lookupswitch    9: default 128
	//	               -2086041026: 201
	//	               -1682760824: 187
	//	               -1604002262: 245
	//	               -1577622857: 215
	//	               -1506324005: 159
	//	               -889522763: 230
	//	               123031512: 145
	//	               1654822287: 173
	//	               1979758524: 131
	//*  23  128:goto            257
		case 1979758524: 
			if(s.equals("dbbaf6d9-4571-4276-b7c7-97060956ff1d"))
	//*  24  131:aload_1         
	//*  25  132:ldc1            #121 <String "dbbaf6d9-4571-4276-b7c7-97060956ff1d">
	//*  26  134:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  27  137:ifeq            257
				byte0 = 0;
	//   28  140:iconst_0        
	//   29  141:istore_3        
			break;

	//*  30  142:goto            257
		case 123031512: 
			if(s.equals("00b7a88d-9751-424a-820f-0fea4266e136"))
	//*  31  145:aload_1         
	//*  32  146:ldc1            #123 <String "00b7a88d-9751-424a-820f-0fea4266e136">
	//*  33  148:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  34  151:ifeq            257
				byte0 = 1;
	//   35  154:iconst_1        
	//   36  155:istore_3        
			break;

	//*  37  156:goto            257
		case -1506324005: 
			if(s.equals("7fa4a95b-389d-40df-9d16-1876c3c7536d"))
	//*  38  159:aload_1         
	//*  39  160:ldc1            #125 <String "7fa4a95b-389d-40df-9d16-1876c3c7536d">
	//*  40  162:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  41  165:ifeq            257
				byte0 = 2;
	//   42  168:iconst_2        
	//   43  169:istore_3        
			break;

	//*  44  170:goto            257
		case 1654822287: 
			if(s.equals("773c0893-b83f-493a-90a3-e9a3d20cb810"))
	//*  45  173:aload_1         
	//*  46  174:ldc1            #127 <String "773c0893-b83f-493a-90a3-e9a3d20cb810">
	//*  47  176:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  48  179:ifeq            257
				byte0 = 3;
	//   49  182:iconst_3        
	//   50  183:istore_3        
			break;

	//*  51  184:goto            257
		case -1682760824: 
			if(s.equals("811d6a4a-d290-42f2-9f83-52d7941ea61d"))
	//*  52  187:aload_1         
	//*  53  188:ldc1            #129 <String "811d6a4a-d290-42f2-9f83-52d7941ea61d">
	//*  54  190:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  55  193:ifeq            257
				byte0 = 4;
	//   56  196:iconst_4        
	//   57  197:istore_3        
			break;

	//*  58  198:goto            257
		case -2086041026: 
			if(s.equals("316664bd-efc6-4508-9235-bc6e1bb5aab4"))
	//*  59  201:aload_1         
	//*  60  202:ldc1            #131 <String "316664bd-efc6-4508-9235-bc6e1bb5aab4">
	//*  61  204:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  62  207:ifeq            257
				byte0 = 5;
	//   63  210:iconst_5        
	//   64  211:istore_3        
			break;

	//*  65  212:goto            257
		case -1577622857: 
			if(s.equals("f54090ad-b47b-4794-9856-3d9060e6db88"))
	//*  66  215:aload_1         
	//*  67  216:ldc1            #133 <String "f54090ad-b47b-4794-9856-3d9060e6db88">
	//*  68  218:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  69  221:ifeq            257
				byte0 = 6;
	//   70  224:bipush          6
	//   71  226:istore_3        
			break;

	//*  72  227:goto            257
		case -889522763: 
			if(s.equals("545133de-cae4-4e1e-a6c9-47e1d573d5cb"))
	//*  73  230:aload_1         
	//*  74  231:ldc1            #135 <String "545133de-cae4-4e1e-a6c9-47e1d573d5cb">
	//*  75  233:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  76  236:ifeq            257
				byte0 = 7;
	//   77  239:bipush          7
	//   78  241:istore_3        
			break;

	//*  79  242:goto            257
		case -1604002262: 
			if(s.equals("65e9795a-c06c-4b6f-94a0-bc9e8d1279d7"))
	//*  80  245:aload_1         
	//*  81  246:ldc1            #137 <String "65e9795a-c06c-4b6f-94a0-bc9e8d1279d7">
	//*  82  248:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  83  251:ifeq            257
				byte0 = 8;
	//   84  254:bipush          8
	//   85  256:istore_3        
			break;
		}
		switch(byte0)
	//*  86  257:iload_3         
		{
	//*  87  258:tableswitch     0 8: default 308
	//	               0 311
	//	               1 311
	//	               2 311
	//	               3 311
	//	               4 311
	//	               5 311
	//	               6 311
	//	               7 311
	//	               8 311
	//*  88  308:goto            326
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			stringbuilder.append('-').append(locale.getCountry());
	//   89  311:aload           4
	//   90  313:bipush          45
	//   91  315:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
	//   92  318:aload_0         
	//   93  319:invokevirtual   #105 <Method String Locale.getCountry()>
	//   94  322:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   95  325:pop             
			break;
		}
		stringbuilder.append(".lpk");
	//   96  326:aload           4
	//   97  328:ldc1            #139 <String ".lpk">
	//   98  330:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   99  333:pop             
		return stringbuilder.toString();
	//  100  334:aload           4
	//  101  336:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  102  339:areturn         
	}

	static boolean b(String s)
	{
		return e.contains(((Object) (s)));
	//    0    0:getstatic       #33  <Field HashSet e>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #142 <Method boolean HashSet.contains(Object)>
	//    3    7:ireturn         
	}

	static boolean c(Locale locale)
	{
		String s = a(locale);
	//    0    0:aload_0         
	//    1    1:invokestatic    #93  <Method String a(Locale)>
	//    2    4:astore_1        
		locale = ((Locale) ((new StringBuilder()).append(s).append("-").append(locale.getCountry()).toString()));
	//    3    5:new             #95  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #96  <Method void StringBuilder()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:ldc1            #102 <String "-">
	//    9   18:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #105 <Method String Locale.getCountry()>
	//   12   25:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   14   31:astore_0        
		return a.contains(((Object) (s))) || a.contains(((Object) (locale)));
	//   15   32:getstatic       #28  <Field HashSet a>
	//   16   35:aload_1         
	//   17   36:invokevirtual   #142 <Method boolean HashSet.contains(Object)>
	//   18   39:ifne            52
	//   19   42:getstatic       #28  <Field HashSet a>
	//   20   45:aload_0         
	//   21   46:invokevirtual   #142 <Method boolean HashSet.contains(Object)>
	//   22   49:ifeq            54
	//   23   52:iconst_1        
	//   24   53:ireturn         
	//   25   54:iconst_0        
	//   26   55:ireturn         
	}

	static FilenameFilter e(String s)
	{
		String s1 = (new StringBuilder()).append("-").append(s).toString();
	//    0    0:new             #95  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void StringBuilder()>
	//    3    7:ldc1            #102 <String "-">
	//    4    9:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #106 <Method String StringBuilder.toString()>
	//    8   19:astore_1        
		java.util.Collection collection = d.values();
	//    9   20:getstatic       #20  <Field HashMap d>
	//   10   23:invokevirtual   #149 <Method java.util.Collection HashMap.values()>
	//   11   26:astore_2        
		return ((FilenameFilter) (new _cls3("d3d137ee-e62e-4dcb-aec1-e4283fd8e15f".length(), s, s1, collection)));
	//   12   27:new             #151 <Class ebl$3>
	//   13   30:dup             
	//   14   31:ldc1            #153 <String "d3d137ee-e62e-4dcb-aec1-e4283fd8e15f">
	//   15   33:invokevirtual   #156 <Method int String.length()>
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:invokespecial   #159 <Method void ebl$3(int, String, String, java.util.Collection)>
	//   20   42:areturn         
	}

	private static void e(HashMap hashmap)
	{
		hashmap.clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method void HashMap.clear()>
		hashmap.put("ar", "d3d137ee-e62e-4dcb-aec1-e4283fd8e15f");
	//    2    4:aload_0         
	//    3    5:ldc1            #162 <String "ar">
	//    4    7:ldc1            #153 <String "d3d137ee-e62e-4dcb-aec1-e4283fd8e15f">
	//    5    9:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		hashmap.put("az", "d8724f34-4d20-4c98-85bf-2dc32429aae6");
	//    7   13:aload_0         
	//    8   14:ldc1            #168 <String "az">
	//    9   16:ldc1            #170 <String "d8724f34-4d20-4c98-85bf-2dc32429aae6">
	//   10   18:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   11   21:pop             
		hashmap.put("be", "83898d1b-430a-4dce-81ee-208492c2dc3f");
	//   12   22:aload_0         
	//   13   23:ldc1            #172 <String "be">
	//   14   25:ldc1            #174 <String "83898d1b-430a-4dce-81ee-208492c2dc3f">
	//   15   27:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   16   30:pop             
		hashmap.put("bg", "45d56259-4e82-4aa0-9d52-4163321e99b1");
	//   17   31:aload_0         
	//   18   32:ldc1            #176 <String "bg">
	//   19   34:ldc1            #178 <String "45d56259-4e82-4aa0-9d52-4163321e99b1">
	//   20   36:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   21   39:pop             
		hashmap.put("bn", "7720ecba-cb11-44c3-a463-6faa63269576");
	//   22   40:aload_0         
	//   23   41:ldc1            #180 <String "bn">
	//   24   43:ldc1            #182 <String "7720ecba-cb11-44c3-a463-6faa63269576">
	//   25   45:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   26   48:pop             
		hashmap.put("bo-CN", "dbbaf6d9-4571-4276-b7c7-97060956ff1d");
	//   27   49:aload_0         
	//   28   50:ldc1            #184 <String "bo-CN">
	//   29   52:ldc1            #121 <String "dbbaf6d9-4571-4276-b7c7-97060956ff1d">
	//   30   54:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   31   57:pop             
		hashmap.put("bs", "5ad42971-c757-4a69-8e2f-8156a254fba9");
	//   32   58:aload_0         
	//   33   59:ldc1            #186 <String "bs">
	//   34   61:ldc1            #188 <String "5ad42971-c757-4a69-8e2f-8156a254fba9">
	//   35   63:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   36   66:pop             
		hashmap.put("ca", "f61ea80f-3466-48d0-b8fb-c57671158a93");
	//   37   67:aload_0         
	//   38   68:ldc1            #190 <String "ca">
	//   39   70:ldc1            #192 <String "f61ea80f-3466-48d0-b8fb-c57671158a93">
	//   40   72:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   41   75:pop             
		hashmap.put("cs", "92d52a39-1ece-4430-b48d-31e334a72ddb");
	//   42   76:aload_0         
	//   43   77:ldc1            #194 <String "cs">
	//   44   79:ldc1            #196 <String "92d52a39-1ece-4430-b48d-31e334a72ddb">
	//   45   81:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   46   84:pop             
		hashmap.put("da", "ca58efb4-c91f-46b9-bbf1-3ad96be1a591");
	//   47   85:aload_0         
	//   48   86:ldc1            #198 <String "da">
	//   49   88:ldc1            #200 <String "ca58efb4-c91f-46b9-bbf1-3ad96be1a591">
	//   50   90:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   51   93:pop             
		hashmap.put("de", "895f8fd5-7c02-4ba8-9ce0-d4b4fb183928");
	//   52   94:aload_0         
	//   53   95:ldc1            #202 <String "de">
	//   54   97:ldc1            #204 <String "895f8fd5-7c02-4ba8-9ce0-d4b4fb183928">
	//   55   99:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   56  102:pop             
		hashmap.put("el", "3314d780-6599-42a3-820e-3ff42082fe65");
	//   57  103:aload_0         
	//   58  104:ldc1            #206 <String "el">
	//   59  106:ldc1            #208 <String "3314d780-6599-42a3-820e-3ff42082fe65">
	//   60  108:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   61  111:pop             
		hashmap.put("en", "e7edf7db-00a5-4e3a-9cff-032a854e29ef");
	//   62  112:aload_0         
	//   63  113:ldc1            #79  <String "en">
	//   64  115:ldc1            #210 <String "e7edf7db-00a5-4e3a-9cff-032a854e29ef">
	//   65  117:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   66  120:pop             
		hashmap.put("en-GB", "00b7a88d-9751-424a-820f-0fea4266e136");
	//   67  121:aload_0         
	//   68  122:ldc1            #212 <String "en-GB">
	//   69  124:ldc1            #123 <String "00b7a88d-9751-424a-820f-0fea4266e136">
	//   70  126:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   71  129:pop             
		hashmap.put("es", "f37c88b6-8bcb-46cf-9e79-cb218985f016");
	//   72  130:aload_0         
	//   73  131:ldc1            #84  <String "es">
	//   74  133:ldc1            #214 <String "f37c88b6-8bcb-46cf-9e79-cb218985f016">
	//   75  135:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   76  138:pop             
		hashmap.put("es-US", "7fa4a95b-389d-40df-9d16-1876c3c7536d");
	//   77  139:aload_0         
	//   78  140:ldc1            #216 <String "es-US">
	//   79  142:ldc1            #125 <String "7fa4a95b-389d-40df-9d16-1876c3c7536d">
	//   80  144:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   81  147:pop             
		hashmap.put("et", "9d42fd9e-47b1-4ef0-88d1-7efbb139ea90");
	//   82  148:aload_0         
	//   83  149:ldc1            #218 <String "et">
	//   84  151:ldc1            #220 <String "9d42fd9e-47b1-4ef0-88d1-7efbb139ea90">
	//   85  153:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   86  156:pop             
		hashmap.put("eu", "9263cb22-fa47-475c-bf27-b69d575f8a1a");
	//   87  157:aload_0         
	//   88  158:ldc1            #222 <String "eu">
	//   89  160:ldc1            #224 <String "9263cb22-fa47-475c-bf27-b69d575f8a1a">
	//   90  162:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   91  165:pop             
		hashmap.put("fa", "a3d152dc-f9a3-46f4-9a74-e060e897fa7f");
	//   92  166:aload_0         
	//   93  167:ldc1            #226 <String "fa">
	//   94  169:ldc1            #228 <String "a3d152dc-f9a3-46f4-9a74-e060e897fa7f">
	//   95  171:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   96  174:pop             
		hashmap.put("fi", "6f7b23e6-9b28-4b22-a51c-d62e52a7ed25");
	//   97  175:aload_0         
	//   98  176:ldc1            #230 <String "fi">
	//   99  178:ldc1            #232 <String "6f7b23e6-9b28-4b22-a51c-d62e52a7ed25">
	//  100  180:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  101  183:pop             
		hashmap.put("fr", "ff6d9018-a81c-4a81-b940-949bae12ab83");
	//  102  184:aload_0         
	//  103  185:ldc1            #86  <String "fr">
	//  104  187:ldc1            #234 <String "ff6d9018-a81c-4a81-b940-949bae12ab83">
	//  105  189:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  106  192:pop             
		hashmap.put("gl", "2263422e-76f9-42b3-beed-f171941fc2a2");
	//  107  193:aload_0         
	//  108  194:ldc1            #236 <String "gl">
	//  109  196:ldc1            #238 <String "2263422e-76f9-42b3-beed-f171941fc2a2">
	//  110  198:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  111  201:pop             
		hashmap.put("hi", "cc07c59d-79ef-47df-b4a1-65331c8da8f2");
	//  112  202:aload_0         
	//  113  203:ldc1            #240 <String "hi">
	//  114  205:ldc1            #242 <String "cc07c59d-79ef-47df-b4a1-65331c8da8f2">
	//  115  207:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  116  210:pop             
		hashmap.put("hr", "cc9ccb40-c1c9-49e6-a0c2-9d09a4a246b3");
	//  117  211:aload_0         
	//  118  212:ldc1            #244 <String "hr">
	//  119  214:ldc1            #246 <String "cc9ccb40-c1c9-49e6-a0c2-9d09a4a246b3">
	//  120  216:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  121  219:pop             
		hashmap.put("hu", "30e77e5d-2353-4b43-8a76-c160bff0f4c8");
	//  122  220:aload_0         
	//  123  221:ldc1            #248 <String "hu">
	//  124  223:ldc1            #250 <String "30e77e5d-2353-4b43-8a76-c160bff0f4c8">
	//  125  225:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  126  228:pop             
		hashmap.put("in", "5d026a3f-b342-4011-811e-027738296be9");
	//  127  229:aload_0         
	//  128  230:ldc1            #252 <String "in">
	//  129  232:ldc1            #254 <String "5d026a3f-b342-4011-811e-027738296be9">
	//  130  234:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  131  237:pop             
		hashmap.put("it", "2f20a3d6-5452-4329-bde3-6685b1fe4d5d");
	//  132  238:aload_0         
	//  133  239:ldc2            #256 <String "it">
	//  134  242:ldc2            #258 <String "2f20a3d6-5452-4329-bde3-6685b1fe4d5d">
	//  135  245:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  136  248:pop             
		hashmap.put("iw", "483255af-d468-4d67-98df-7e2c1fc27cb6");
	//  137  249:aload_0         
	//  138  250:ldc2            #260 <String "iw">
	//  139  253:ldc2            #262 <String "483255af-d468-4d67-98df-7e2c1fc27cb6">
	//  140  256:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  141  259:pop             
		hashmap.put("ja", "bdf63458-cea6-44d6-8779-b3755df3a7d9");
	//  142  260:aload_0         
	//  143  261:ldc2            #264 <String "ja">
	//  144  264:ldc2            #266 <String "bdf63458-cea6-44d6-8779-b3755df3a7d9">
	//  145  267:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  146  270:pop             
		hashmap.put("b+jv+Latn", "7247a035-6652-47a8-8dff-d6430cab999e");
	//  147  271:aload_0         
	//  148  272:ldc1            #63  <String "b+jv+Latn">
	//  149  274:ldc2            #268 <String "7247a035-6652-47a8-8dff-d6430cab999e">
	//  150  277:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  151  280:pop             
		hashmap.put("ka", "5f71a4c3-e5cb-48bc-89eb-066ba2c5f582");
	//  152  281:aload_0         
	//  153  282:ldc2            #270 <String "ka">
	//  154  285:ldc2            #272 <String "5f71a4c3-e5cb-48bc-89eb-066ba2c5f582">
	//  155  288:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  156  291:pop             
		hashmap.put("km", "d93d333d-baa4-4d29-9735-986c16b06c04");
	//  157  292:aload_0         
	//  158  293:ldc2            #274 <String "km">
	//  159  296:ldc2            #276 <String "d93d333d-baa4-4d29-9735-986c16b06c04">
	//  160  299:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  161  302:pop             
		hashmap.put("kk", "b60c6246-3d96-4166-b4d9-848ef82b0615");
	//  162  303:aload_0         
	//  163  304:ldc2            #278 <String "kk">
	//  164  307:ldc2            #280 <String "b60c6246-3d96-4166-b4d9-848ef82b0615">
	//  165  310:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  166  313:pop             
		hashmap.put("ko", "df58dd43-4d0e-4737-8880-3078448b50d0");
	//  167  314:aload_0         
	//  168  315:ldc2            #282 <String "ko">
	//  169  318:ldc2            #284 <String "df58dd43-4d0e-4737-8880-3078448b50d0">
	//  170  321:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  171  324:pop             
		hashmap.put("lt", "c5609653-76d5-45b4-aba2-c22cf8006318");
	//  172  325:aload_0         
	//  173  326:ldc2            #286 <String "lt">
	//  174  329:ldc2            #288 <String "c5609653-76d5-45b4-aba2-c22cf8006318">
	//  175  332:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  176  335:pop             
		hashmap.put("lo", "2f88ab42-d93e-4402-aaf2-b1bc98e82911");
	//  177  336:aload_0         
	//  178  337:ldc2            #290 <String "lo">
	//  179  340:ldc2            #292 <String "2f88ab42-d93e-4402-aaf2-b1bc98e82911">
	//  180  343:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  181  346:pop             
		hashmap.put("lv", "057849f6-c973-44f1-b644-924257715ba5");
	//  182  347:aload_0         
	//  183  348:ldc2            #294 <String "lv">
	//  184  351:ldc2            #296 <String "057849f6-c973-44f1-b644-924257715ba5">
	//  185  354:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  186  357:pop             
		hashmap.put("mk", "11e36aec-76e8-495a-8748-282bca501cdb");
	//  187  358:aload_0         
	//  188  359:ldc2            #298 <String "mk">
	//  189  362:ldc2            #300 <String "11e36aec-76e8-495a-8748-282bca501cdb">
	//  190  365:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  191  368:pop             
		hashmap.put("ms", "2527f22e-bf5a-4e88-811b-9dced2178452");
	//  192  369:aload_0         
	//  193  370:ldc2            #302 <String "ms">
	//  194  373:ldc2            #304 <String "2527f22e-bf5a-4e88-811b-9dced2178452">
	//  195  376:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  196  379:pop             
		hashmap.put("my-MM", "773c0893-b83f-493a-90a3-e9a3d20cb810");
	//  197  380:aload_0         
	//  198  381:ldc2            #306 <String "my-MM">
	//  199  384:ldc1            #127 <String "773c0893-b83f-493a-90a3-e9a3d20cb810">
	//  200  386:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  201  389:pop             
		hashmap.put("my-ZG", "811d6a4a-d290-42f2-9f83-52d7941ea61d");
	//  202  390:aload_0         
	//  203  391:ldc2            #308 <String "my-ZG">
	//  204  394:ldc1            #129 <String "811d6a4a-d290-42f2-9f83-52d7941ea61d">
	//  205  396:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  206  399:pop             
		hashmap.put("nb", "01844e75-23ec-4161-be73-1b50c3e91ec6");
	//  207  400:aload_0         
	//  208  401:ldc2            #310 <String "nb">
	//  209  404:ldc2            #312 <String "01844e75-23ec-4161-be73-1b50c3e91ec6">
	//  210  407:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  211  410:pop             
		hashmap.put("ne", "aa7ae85f-9982-4f54-85b8-6fb951cd1754");
	//  212  411:aload_0         
	//  213  412:ldc2            #314 <String "ne">
	//  214  415:ldc2            #316 <String "aa7ae85f-9982-4f54-85b8-6fb951cd1754">
	//  215  418:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  216  421:pop             
		hashmap.put("nl", "c06b09f4-b460-43f9-829b-9e7a01165221");
	//  217  422:aload_0         
	//  218  423:ldc2            #318 <String "nl">
	//  219  426:ldc2            #320 <String "c06b09f4-b460-43f9-829b-9e7a01165221">
	//  220  429:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  221  432:pop             
		hashmap.put("pl", "25dd1f16-6beb-4889-8d7d-27ed52ca8a5b");
	//  222  433:aload_0         
	//  223  434:ldc2            #322 <String "pl">
	//  224  437:ldc2            #324 <String "25dd1f16-6beb-4889-8d7d-27ed52ca8a5b">
	//  225  440:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  226  443:pop             
		hashmap.put("pt", "fc5e3d4a-9a48-42eb-86e8-a7dd3a2c7b17");
	//  227  444:aload_0         
	//  228  445:ldc2            #326 <String "pt">
	//  229  448:ldc2            #328 <String "fc5e3d4a-9a48-42eb-86e8-a7dd3a2c7b17">
	//  230  451:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  231  454:pop             
		hashmap.put("pt-PT", "316664bd-efc6-4508-9235-bc6e1bb5aab4");
	//  232  455:aload_0         
	//  233  456:ldc2            #330 <String "pt-PT">
	//  234  459:ldc1            #131 <String "316664bd-efc6-4508-9235-bc6e1bb5aab4">
	//  235  461:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  236  464:pop             
		hashmap.put("ro", "eec48922-7d06-45da-9b18-9e1d1ba20f36");
	//  237  465:aload_0         
	//  238  466:ldc2            #332 <String "ro">
	//  239  469:ldc2            #334 <String "eec48922-7d06-45da-9b18-9e1d1ba20f36">
	//  240  472:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  241  475:pop             
		hashmap.put("ru", "99e92f30-62cb-44aa-a8dc-8c310cc4a601");
	//  242  476:aload_0         
	//  243  477:ldc1            #88  <String "ru">
	//  244  479:ldc2            #336 <String "99e92f30-62cb-44aa-a8dc-8c310cc4a601">
	//  245  482:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  246  485:pop             
		hashmap.put("si", "6106965a-43ca-4073-9b08-425c9b6d0da9");
	//  247  486:aload_0         
	//  248  487:ldc2            #338 <String "si">
	//  249  490:ldc2            #340 <String "6106965a-43ca-4073-9b08-425c9b6d0da9">
	//  250  493:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  251  496:pop             
		hashmap.put("sk", "76a2795d-ec30-4cb9-befc-0726d30a3d3d");
	//  252  497:aload_0         
	//  253  498:ldc2            #342 <String "sk">
	//  254  501:ldc2            #344 <String "76a2795d-ec30-4cb9-befc-0726d30a3d3d">
	//  255  504:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  256  507:pop             
		hashmap.put("sl", "cf06b336-3671-4690-af89-f08ec0ce038a");
	//  257  508:aload_0         
	//  258  509:ldc2            #346 <String "sl">
	//  259  512:ldc2            #348 <String "cf06b336-3671-4690-af89-f08ec0ce038a">
	//  260  515:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  261  518:pop             
		hashmap.put("sr", "566e2cbc-fc09-4662-9a07-31875786f02d");
	//  262  519:aload_0         
	//  263  520:ldc1            #59  <String "sr">
	//  264  522:ldc2            #350 <String "566e2cbc-fc09-4662-9a07-31875786f02d">
	//  265  525:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  266  528:pop             
		hashmap.put("b+sr+Latn", "f13c1aec-e5b7-4a46-b5be-2cb24d5dc54f");
	//  267  529:aload_0         
	//  268  530:ldc1            #74  <String "b+sr+Latn">
	//  269  532:ldc2            #352 <String "f13c1aec-e5b7-4a46-b5be-2cb24d5dc54f">
	//  270  535:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  271  538:pop             
		hashmap.put("sv", "15ca893d-9c89-4a6b-b3d7-a1d77eef49dd");
	//  272  539:aload_0         
	//  273  540:ldc2            #354 <String "sv">
	//  274  543:ldc2            #356 <String "15ca893d-9c89-4a6b-b3d7-a1d77eef49dd">
	//  275  546:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  276  549:pop             
		hashmap.put("th", "d717575a-cd76-4075-89c4-644ca075c16e");
	//  277  550:aload_0         
	//  278  551:ldc2            #358 <String "th">
	//  279  554:ldc2            #360 <String "d717575a-cd76-4075-89c4-644ca075c16e">
	//  280  557:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  281  560:pop             
		hashmap.put("tl", "1761962d-22a3-41f0-8322-acd68b0b7b35");
	//  282  561:aload_0         
	//  283  562:ldc1            #61  <String "tl">
	//  284  564:ldc2            #362 <String "1761962d-22a3-41f0-8322-acd68b0b7b35">
	//  285  567:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  286  570:pop             
		hashmap.put("tr", "051af358-8d5b-4d97-bdc0-b78b011559e2");
	//  287  571:aload_0         
	//  288  572:ldc2            #364 <String "tr">
	//  289  575:ldc2            #366 <String "051af358-8d5b-4d97-bdc0-b78b011559e2">
	//  290  578:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  291  581:pop             
		hashmap.put("uk", "e83a083a-9a2f-4cb4-9d0c-ebe27f80e1ab");
	//  292  582:aload_0         
	//  293  583:ldc2            #368 <String "uk">
	//  294  586:ldc2            #370 <String "e83a083a-9a2f-4cb4-9d0c-ebe27f80e1ab">
	//  295  589:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  296  592:pop             
		hashmap.put("ur", "d3687605-adff-4a5b-9c80-a76386ed6335");
	//  297  593:aload_0         
	//  298  594:ldc2            #372 <String "ur">
	//  299  597:ldc2            #374 <String "d3687605-adff-4a5b-9c80-a76386ed6335">
	//  300  600:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  301  603:pop             
		hashmap.put("uz", "930ea5dd-ff88-45a9-878b-9251239d3298");
	//  302  604:aload_0         
	//  303  605:ldc2            #376 <String "uz">
	//  304  608:ldc2            #378 <String "930ea5dd-ff88-45a9-878b-9251239d3298">
	//  305  611:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  306  614:pop             
		hashmap.put("vi", "d698da3a-e932-4c66-87ee-ca573d5825f3");
	//  307  615:aload_0         
	//  308  616:ldc2            #380 <String "vi">
	//  309  619:ldc2            #382 <String "d698da3a-e932-4c66-87ee-ca573d5825f3">
	//  310  622:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  311  625:pop             
		hashmap.put("zh-CN", "f54090ad-b47b-4794-9856-3d9060e6db88");
	//  312  626:aload_0         
	//  313  627:ldc1            #90  <String "zh-CN">
	//  314  629:ldc1            #133 <String "f54090ad-b47b-4794-9856-3d9060e6db88">
	//  315  631:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  316  634:pop             
		hashmap.put("zh-HK", "545133de-cae4-4e1e-a6c9-47e1d573d5cb");
	//  317  635:aload_0         
	//  318  636:ldc2            #384 <String "zh-HK">
	//  319  639:ldc1            #135 <String "545133de-cae4-4e1e-a6c9-47e1d573d5cb">
	//  320  641:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  321  644:pop             
		hashmap.put("zh-TW", "65e9795a-c06c-4b6f-94a0-bc9e8d1279d7");
	//  322  645:aload_0         
	//  323  646:ldc2            #386 <String "zh-TW">
	//  324  649:ldc1            #137 <String "65e9795a-c06c-4b6f-94a0-bc9e8d1279d7">
	//  325  651:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  326  654:pop             
		hashmap.put("am", "21126df8-cde2-43f8-9494-4b88fd8710da");
	//  327  655:aload_0         
	//  328  656:ldc2            #388 <String "am">
	//  329  659:ldc2            #390 <String "21126df8-cde2-43f8-9494-4b88fd8710da">
	//  330  662:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  331  665:pop             
		hashmap.put("as", "595017bb-956c-4a93-97d0-9fb9af0cf824");
	//  332  666:aload_0         
	//  333  667:ldc2            #392 <String "as">
	//  334  670:ldc2            #394 <String "595017bb-956c-4a93-97d0-9fb9af0cf824">
	//  335  673:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  336  676:pop             
		hashmap.put("gu", "e32b2cc4-28a8-4745-b944-78805ffcd145");
	//  337  677:aload_0         
	//  338  678:ldc2            #396 <String "gu">
	//  339  681:ldc2            #398 <String "e32b2cc4-28a8-4745-b944-78805ffcd145">
	//  340  684:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  341  687:pop             
		hashmap.put("kn", "dc8ac81a-373f-4ef6-90aa-147353e6ba4a");
	//  342  688:aload_0         
	//  343  689:ldc2            #400 <String "kn">
	//  344  692:ldc2            #402 <String "dc8ac81a-373f-4ef6-90aa-147353e6ba4a">
	//  345  695:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  346  698:pop             
		hashmap.put("mai", "48352726-53bc-49ac-a411-db0bc518a3d4");
	//  347  699:aload_0         
	//  348  700:ldc2            #404 <String "mai">
	//  349  703:ldc2            #406 <String "48352726-53bc-49ac-a411-db0bc518a3d4">
	//  350  706:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  351  709:pop             
		hashmap.put("mi", "7188e716-13b9-4393-a2b0-aa698b1e6e00");
	//  352  710:aload_0         
	//  353  711:ldc2            #408 <String "mi">
	//  354  714:ldc2            #410 <String "7188e716-13b9-4393-a2b0-aa698b1e6e00">
	//  355  717:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  356  720:pop             
		hashmap.put("ml", "ab79caba-35bd-4702-b549-399fa961742b");
	//  357  721:aload_0         
	//  358  722:ldc2            #412 <String "ml">
	//  359  725:ldc2            #414 <String "ab79caba-35bd-4702-b549-399fa961742b">
	//  360  728:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  361  731:pop             
		hashmap.put("mn", "352d742f-e759-4baa-a5a1-24bd3d119e05");
	//  362  732:aload_0         
	//  363  733:ldc2            #416 <String "mn">
	//  364  736:ldc2            #418 <String "352d742f-e759-4baa-a5a1-24bd3d119e05">
	//  365  739:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  366  742:pop             
		hashmap.put("mr", "908db8ce-7131-49cd-808a-71c5fa3cc011");
	//  367  743:aload_0         
	//  368  744:ldc2            #420 <String "mr">
	//  369  747:ldc2            #422 <String "908db8ce-7131-49cd-808a-71c5fa3cc011">
	//  370  750:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  371  753:pop             
		hashmap.put("or", "0a7c4732-ba26-4e8f-a9d9-1db077814c06");
	//  372  754:aload_0         
	//  373  755:ldc2            #424 <String "or">
	//  374  758:ldc2            #426 <String "0a7c4732-ba26-4e8f-a9d9-1db077814c06">
	//  375  761:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  376  764:pop             
		hashmap.put("pa", "9975f20e-afc4-4b31-a3dc-67610271aa19");
	//  377  765:aload_0         
	//  378  766:ldc2            #428 <String "pa">
	//  379  769:ldc2            #430 <String "9975f20e-afc4-4b31-a3dc-67610271aa19">
	//  380  772:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  381  775:pop             
		hashmap.put("sw", "1647ff4a-5415-437f-a1f2-9b17bbebb720");
	//  382  776:aload_0         
	//  383  777:ldc2            #432 <String "sw">
	//  384  780:ldc2            #434 <String "1647ff4a-5415-437f-a1f2-9b17bbebb720">
	//  385  783:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  386  786:pop             
		hashmap.put("ta", "de64a3d9-4e93-4219-a06f-372ec7b6bcac");
	//  387  787:aload_0         
	//  388  788:ldc2            #436 <String "ta">
	//  389  791:ldc2            #438 <String "de64a3d9-4e93-4219-a06f-372ec7b6bcac">
	//  390  794:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  391  797:pop             
		hashmap.put("te", "ee17b8a9-975b-4964-aa55-a06cdd770492");
	//  392  798:aload_0         
	//  393  799:ldc2            #440 <String "te">
	//  394  802:ldc2            #442 <String "ee17b8a9-975b-4964-aa55-a06cdd770492">
	//  395  805:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//  396  808:pop             
	//  397  809:return          
	}

	private static void e(HashSet hashset)
	{
		hashset.clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method void HashSet.clear()>
		hashset.add("1761962d-22a3-41f0-8322-acd68b0b7b35");
	//    2    4:aload_0         
	//    3    5:ldc2            #362 <String "1761962d-22a3-41f0-8322-acd68b0b7b35">
	//    4    8:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//    5   11:pop             
		hashset.add("21126df8-cde2-43f8-9494-4b88fd8710da");
	//    6   12:aload_0         
	//    7   13:ldc2            #390 <String "21126df8-cde2-43f8-9494-4b88fd8710da">
	//    8   16:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//    9   19:pop             
		hashset.add("595017bb-956c-4a93-97d0-9fb9af0cf824");
	//   10   20:aload_0         
	//   11   21:ldc2            #394 <String "595017bb-956c-4a93-97d0-9fb9af0cf824">
	//   12   24:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   13   27:pop             
		hashset.add("e32b2cc4-28a8-4745-b944-78805ffcd145");
	//   14   28:aload_0         
	//   15   29:ldc2            #398 <String "e32b2cc4-28a8-4745-b944-78805ffcd145">
	//   16   32:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   17   35:pop             
		hashset.add("dc8ac81a-373f-4ef6-90aa-147353e6ba4a");
	//   18   36:aload_0         
	//   19   37:ldc2            #402 <String "dc8ac81a-373f-4ef6-90aa-147353e6ba4a">
	//   20   40:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   21   43:pop             
		hashset.add("48352726-53bc-49ac-a411-db0bc518a3d4");
	//   22   44:aload_0         
	//   23   45:ldc2            #406 <String "48352726-53bc-49ac-a411-db0bc518a3d4">
	//   24   48:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   25   51:pop             
		hashset.add("7188e716-13b9-4393-a2b0-aa698b1e6e00");
	//   26   52:aload_0         
	//   27   53:ldc2            #410 <String "7188e716-13b9-4393-a2b0-aa698b1e6e00">
	//   28   56:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   29   59:pop             
		hashset.add("ab79caba-35bd-4702-b549-399fa961742b");
	//   30   60:aload_0         
	//   31   61:ldc2            #414 <String "ab79caba-35bd-4702-b549-399fa961742b">
	//   32   64:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   33   67:pop             
		hashset.add("352d742f-e759-4baa-a5a1-24bd3d119e05");
	//   34   68:aload_0         
	//   35   69:ldc2            #418 <String "352d742f-e759-4baa-a5a1-24bd3d119e05">
	//   36   72:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   37   75:pop             
		hashset.add("908db8ce-7131-49cd-808a-71c5fa3cc011");
	//   38   76:aload_0         
	//   39   77:ldc2            #422 <String "908db8ce-7131-49cd-808a-71c5fa3cc011">
	//   40   80:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   41   83:pop             
		hashset.add("0a7c4732-ba26-4e8f-a9d9-1db077814c06");
	//   42   84:aload_0         
	//   43   85:ldc2            #426 <String "0a7c4732-ba26-4e8f-a9d9-1db077814c06">
	//   44   88:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   45   91:pop             
		hashset.add("9975f20e-afc4-4b31-a3dc-67610271aa19");
	//   46   92:aload_0         
	//   47   93:ldc2            #430 <String "9975f20e-afc4-4b31-a3dc-67610271aa19">
	//   48   96:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   49   99:pop             
		hashset.add("1647ff4a-5415-437f-a1f2-9b17bbebb720");
	//   50  100:aload_0         
	//   51  101:ldc2            #434 <String "1647ff4a-5415-437f-a1f2-9b17bbebb720">
	//   52  104:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   53  107:pop             
		hashset.add("de64a3d9-4e93-4219-a06f-372ec7b6bcac");
	//   54  108:aload_0         
	//   55  109:ldc2            #438 <String "de64a3d9-4e93-4219-a06f-372ec7b6bcac">
	//   56  112:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   57  115:pop             
		hashset.add("ee17b8a9-975b-4964-aa55-a06cdd770492");
	//   58  116:aload_0         
	//   59  117:ldc2            #442 <String "ee17b8a9-975b-4964-aa55-a06cdd770492">
	//   60  120:invokevirtual   #82  <Method boolean HashSet.add(Object)>
	//   61  123:pop             
	//   62  124:return          
	}

	private static final HashSet a;
	private static final HashMap d;
	private static final HashSet e;

	static 
	{
		d = new HashMap();
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void HashMap()>
	//    3    7:putstatic       #20  <Field HashMap d>
		e(d);
	//    4   10:getstatic       #20  <Field HashMap d>
	//    5   13:invokestatic    #23  <Method void e(HashMap)>
		a = new HashSet();
	//    6   16:new             #25  <Class HashSet>
	//    7   19:dup             
	//    8   20:invokespecial   #26  <Method void HashSet()>
	//    9   23:putstatic       #28  <Field HashSet a>
		a(a);
	//   10   26:getstatic       #28  <Field HashSet a>
	//   11   29:invokestatic    #31  <Method void a(HashSet)>
		e = new HashSet();
	//   12   32:new             #25  <Class HashSet>
	//   13   35:dup             
	//   14   36:invokespecial   #26  <Method void HashSet()>
	//   15   39:putstatic       #33  <Field HashSet e>
		e(e);
	//   16   42:getstatic       #33  <Field HashSet e>
	//   17   45:invokestatic    #35  <Method void e(HashSet)>
	//*  18   48:return          
	}

	/* member class not found */
	class _cls3 {}

}
