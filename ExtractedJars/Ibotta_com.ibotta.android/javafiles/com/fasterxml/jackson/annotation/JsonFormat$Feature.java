// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonFormat

public static final class JsonFormat$Feature extends Enum
{

	public static JsonFormat$Feature valueOf(String s)
	{
		return (JsonFormat$Feature)Enum.valueOf(com/fasterxml/jackson/annotation/JsonFormat$Feature, s);
	//    0    0:ldc1            #2   <Class JsonFormat$Feature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFormat$Feature>
	//    4    9:areturn         
	}

	public static JsonFormat$Feature[] values()
	{
		return (JsonFormat$Feature[])((JsonFormat$Feature []) ($VALUES)).clone();
	//    0    0:getstatic       #47  <Field JsonFormat$Feature[] $VALUES>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Feature_3B_.clone()>
	//    2    6:checkcast       #58  <Class JsonFormat$Feature[]>
	//    3    9:areturn         
	}

	private static final JsonFormat$Feature $VALUES[];
	public static final JsonFormat$Feature ACCEPT_CASE_INSENSITIVE_PROPERTIES;
	public static final JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY;
	public static final JsonFormat$Feature ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
	public static final JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID;
	public static final JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
	public static final JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
	public static final JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES;

	static 
	{
		ACCEPT_SINGLE_VALUE_AS_ARRAY = new JsonFormat$Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
	//    0    0:new             #2   <Class JsonFormat$Feature>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "ACCEPT_SINGLE_VALUE_AS_ARRAY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//    5   10:putstatic       #27  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
		ACCEPT_CASE_INSENSITIVE_PROPERTIES = new JsonFormat$Feature("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
	//    6   13:new             #2   <Class JsonFormat$Feature>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "ACCEPT_CASE_INSENSITIVE_PROPERTIES">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//   11   23:putstatic       #30  <Field JsonFormat$Feature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
		WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS = new JsonFormat$Feature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 2);
	//   12   26:new             #2   <Class JsonFormat$Feature>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//   17   36:putstatic       #33  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
		WRITE_DATES_WITH_ZONE_ID = new JsonFormat$Feature("WRITE_DATES_WITH_ZONE_ID", 3);
	//   18   39:new             #2   <Class JsonFormat$Feature>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "WRITE_DATES_WITH_ZONE_ID">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//   23   49:putstatic       #36  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
		WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new JsonFormat$Feature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 4);
	//   24   52:new             #2   <Class JsonFormat$Feature>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//   29   62:putstatic       #39  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
		WRITE_SORTED_MAP_ENTRIES = new JsonFormat$Feature("WRITE_SORTED_MAP_ENTRIES", 5);
	//   30   65:new             #2   <Class JsonFormat$Feature>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "WRITE_SORTED_MAP_ENTRIES">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//   35   75:putstatic       #42  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
		ADJUST_DATES_TO_CONTEXT_TIME_ZONE = new JsonFormat$Feature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 6);
	//   36   78:new             #2   <Class JsonFormat$Feature>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "ADJUST_DATES_TO_CONTEXT_TIME_ZONE">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
	//   41   89:putstatic       #45  <Field JsonFormat$Feature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
		$VALUES = (new JsonFormat$Feature[] {
			ACCEPT_SINGLE_VALUE_AS_ARRAY, ACCEPT_CASE_INSENSITIVE_PROPERTIES, WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, WRITE_DATES_WITH_ZONE_ID, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, WRITE_SORTED_MAP_ENTRIES, ADJUST_DATES_TO_CONTEXT_TIME_ZONE
		});
	//   42   92:bipush          7
	//   43   94:anewarray       JsonFormat$Feature[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #27  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #30  <Field JsonFormat$Feature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #33  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #36  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #39  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #42  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #45  <Field JsonFormat$Feature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
	//   71  139:aastore         
	//   72  140:putstatic       #47  <Field JsonFormat$Feature[] $VALUES>
	//*  73  143:return          
	}

	private JsonFormat$Feature(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
