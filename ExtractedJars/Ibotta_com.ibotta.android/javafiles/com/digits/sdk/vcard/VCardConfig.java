// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.vcard;

import java.util.*;

public class VCardConfig
{

	public static boolean appendTypeParamName(int i)
	{
		return isVersion30(i) || (i & 0x4000000) != 0;
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method boolean isVersion30(int)>
	//    2    4:ifne            19
	//    3    7:iload_0         
	//    4    8:ldc1            #79  <Int 0x4000000>
	//    5   10:iand            
	//    6   11:ifeq            17
	//    7   14:goto            19
	//    8   17:iconst_0        
	//    9   18:ireturn         
	//   10   19:iconst_1        
	//   11   20:ireturn         
	}

	public static int getNameOrderType(int i)
	{
		return i & 0xc;
	//    0    0:iload_0         
	//    1    1:bipush          12
	//    2    3:iand            
	//    3    4:ireturn         
	}

	public static boolean isDoCoMo(int i)
	{
		return (i & 0x20000000) != 0;
	//    0    0:iload_0         
	//    1    1:ldc1            #83  <Int 0x20000000>
	//    2    3:iand            
	//    3    4:ifeq            9
	//    4    7:iconst_1        
	//    5    8:ireturn         
	//    6    9:iconst_0        
	//    7   10:ireturn         
	}

	public static boolean isJapaneseDevice(int i)
	{
		return sJapaneseMobileTypeSet.contains(((Object) (Integer.valueOf(i))));
	//    0    0:getstatic       #66  <Field Set sJapaneseMobileTypeSet>
	//    1    3:iload_0         
	//    2    4:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #87  <Method boolean Set.contains(Object)>
	//    4   12:ireturn         
	}

	public static boolean isVersion21(int i)
	{
		return (i & 3) == 0;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iand            
	//    3    3:ifne            8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public static boolean isVersion30(int i)
	{
		return (i & 3) == 1;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iand            
	//    3    3:iconst_1        
	//    4    4:icmpne          9
	//    5    7:iconst_1        
	//    6    8:ireturn         
	//    7    9:iconst_0        
	//    8   10:ireturn         
	}

	public static boolean isVersion40(int i)
	{
		return (i & 3) == 2;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iand            
	//    3    3:iconst_2        
	//    4    4:icmpne          9
	//    5    7:iconst_1        
	//    6    8:ireturn         
	//    7    9:iconst_0        
	//    8   10:ireturn         
	}

	public static boolean needsToConvertPhoneticString(int i)
	{
		return (i & 0x8000000) != 0;
	//    0    0:iload_0         
	//    1    1:ldc1            #91  <Int 0x8000000>
	//    2    3:iand            
	//    3    4:ifeq            9
	//    4    7:iconst_1        
	//    5    8:ireturn         
	//    6    9:iconst_0        
	//    7   10:ireturn         
	}

	static boolean refrainPhoneNumberFormatting(int i)
	{
		return (i & 0x2000000) != 0;
	//    0    0:iload_0         
	//    1    1:ldc1            #93  <Int 0x2000000>
	//    2    3:iand            
	//    3    4:ifeq            9
	//    4    7:iconst_1        
	//    5    8:ireturn         
	//    6    9:iconst_0        
	//    7   10:ireturn         
	}

	public static boolean shouldRefrainQPToNameProperties(int i)
	{
		return !shouldUseQuotedPrintable(i) || (i & 0x10000000) != 0;
	//    0    0:iload_0         
	//    1    1:invokestatic    #97  <Method boolean shouldUseQuotedPrintable(int)>
	//    2    4:ifeq            19
	//    3    7:iload_0         
	//    4    8:ldc1            #98  <Int 0x10000000>
	//    5   10:iand            
	//    6   11:ifeq            17
	//    7   14:goto            19
	//    8   17:iconst_0        
	//    9   18:ireturn         
	//   10   19:iconst_1        
	//   11   20:ireturn         
	}

	public static boolean shouldUseQuotedPrintable(int i)
	{
		return isVersion30(i) ^ true;
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method boolean isVersion30(int)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public static boolean usesDefactProperty(int i)
	{
		return (i & 0x40000000) != 0;
	//    0    0:iload_0         
	//    1    1:ldc1            #100 <Int 0x40000000>
	//    2    3:iand            
	//    3    4:ifeq            9
	//    4    7:iconst_1        
	//    5    8:ireturn         
	//    6    9:iconst_0        
	//    7   10:ireturn         
	}

	public static int VCARD_TYPE_DEFAULT = 0xc0000000;
	static String VCARD_TYPE_V21_GENERIC_STR = "v21_generic";
	private static final Set sJapaneseMobileTypeSet;
	private static final Map sVCardTypeMap;

	static 
	{
		sVCardTypeMap = ((Map) (new HashMap()));
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:putstatic       #26  <Field Map sVCardTypeMap>
		sVCardTypeMap.put(((Object) (VCARD_TYPE_V21_GENERIC_STR)), ((Object) (Integer.valueOf(0xc0000000))));
	//    4   10:getstatic       #26  <Field Map sVCardTypeMap>
	//    5   13:getstatic       #28  <Field String VCARD_TYPE_V21_GENERIC_STR>
	//    6   16:ldc1            #7   <Int 0xc0000000>
	//    7   18:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    8   21:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//    9   26:pop             
		sVCardTypeMap.put("v30_generic", ((Object) (Integer.valueOf(0xc0000001))));
	//   10   27:getstatic       #26  <Field Map sVCardTypeMap>
	//   11   30:ldc1            #42  <String "v30_generic">
	//   12   32:ldc1            #43  <Int 0xc0000001>
	//   13   34:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   14   37:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   15   42:pop             
		sVCardTypeMap.put("v21_europe", ((Object) (Integer.valueOf(0xc0000004))));
	//   16   43:getstatic       #26  <Field Map sVCardTypeMap>
	//   17   46:ldc1            #45  <String "v21_europe">
	//   18   48:ldc1            #46  <Int 0xc0000004>
	//   19   50:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   20   53:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   21   58:pop             
		sVCardTypeMap.put("v30_europe", ((Object) (Integer.valueOf(0xc0000005))));
	//   22   59:getstatic       #26  <Field Map sVCardTypeMap>
	//   23   62:ldc1            #48  <String "v30_europe">
	//   24   64:ldc1            #49  <Int 0xc0000005>
	//   25   66:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   26   69:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   27   74:pop             
		sVCardTypeMap.put("v21_japanese_utf8", ((Object) (Integer.valueOf(0xc0000008))));
	//   28   75:getstatic       #26  <Field Map sVCardTypeMap>
	//   29   78:ldc1            #51  <String "v21_japanese_utf8">
	//   30   80:ldc1            #52  <Int 0xc0000008>
	//   31   82:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   32   85:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   33   90:pop             
		sVCardTypeMap.put("v30_japanese_utf8", ((Object) (Integer.valueOf(0xc0000009))));
	//   34   91:getstatic       #26  <Field Map sVCardTypeMap>
	//   35   94:ldc1            #54  <String "v30_japanese_utf8">
	//   36   96:ldc1            #55  <Int 0xc0000009>
	//   37   98:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   38  101:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   39  106:pop             
		sVCardTypeMap.put("v21_japanese_mobile", ((Object) (Integer.valueOf(0x18000008))));
	//   40  107:getstatic       #26  <Field Map sVCardTypeMap>
	//   41  110:ldc1            #57  <String "v21_japanese_mobile">
	//   42  112:ldc1            #58  <Int 0x18000008>
	//   43  114:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   44  117:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   45  122:pop             
		sVCardTypeMap.put("docomo", ((Object) (Integer.valueOf(0x38000008))));
	//   46  123:getstatic       #26  <Field Map sVCardTypeMap>
	//   47  126:ldc1            #60  <String "docomo">
	//   48  128:ldc1            #61  <Int 0x38000008>
	//   49  130:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   50  133:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   51  138:pop             
		sJapaneseMobileTypeSet = ((Set) (new HashSet()));
	//   52  139:new             #63  <Class HashSet>
	//   53  142:dup             
	//   54  143:invokespecial   #64  <Method void HashSet()>
	//   55  146:putstatic       #66  <Field Set sJapaneseMobileTypeSet>
		sJapaneseMobileTypeSet.add(((Object) (Integer.valueOf(0xc0000008))));
	//   56  149:getstatic       #66  <Field Set sJapaneseMobileTypeSet>
	//   57  152:ldc1            #52  <Int 0xc0000008>
	//   58  154:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   59  157:invokeinterface #72  <Method boolean Set.add(Object)>
	//   60  162:pop             
		sJapaneseMobileTypeSet.add(((Object) (Integer.valueOf(0xc0000009))));
	//   61  163:getstatic       #66  <Field Set sJapaneseMobileTypeSet>
	//   62  166:ldc1            #55  <Int 0xc0000009>
	//   63  168:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   64  171:invokeinterface #72  <Method boolean Set.add(Object)>
	//   65  176:pop             
		sJapaneseMobileTypeSet.add(((Object) (Integer.valueOf(0x18000008))));
	//   66  177:getstatic       #66  <Field Set sJapaneseMobileTypeSet>
	//   67  180:ldc1            #58  <Int 0x18000008>
	//   68  182:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   69  185:invokeinterface #72  <Method boolean Set.add(Object)>
	//   70  190:pop             
		sJapaneseMobileTypeSet.add(((Object) (Integer.valueOf(0x38000008))));
	//   71  191:getstatic       #66  <Field Set sJapaneseMobileTypeSet>
	//   72  194:ldc1            #61  <Int 0x38000008>
	//   73  196:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   74  199:invokeinterface #72  <Method boolean Set.add(Object)>
	//   75  204:pop             
	//*  76  205:return          
	}
}
