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
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFormat$Feature>
	//    4    9:areturn         
	}

	public static JsonFormat$Feature[] values()
	{
		return (JsonFormat$Feature[])((JsonFormat$Feature []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field JsonFormat$Feature[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Feature_3B_.clone()>
	//    2    6:checkcast       #50  <Class JsonFormat$Feature[]>
	//    3    9:areturn         
	}

	private static final JsonFormat$Feature $VALUES[];
	public static final JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY;
	public static final JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID;
	public static final JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
	public static final JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
	public static final JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES;

	static 
	{
		ACCEPT_SINGLE_VALUE_AS_ARRAY = new JsonFormat$Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
	//    0    0:new             #2   <Class JsonFormat$Feature>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "ACCEPT_SINGLE_VALUE_AS_ARRAY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
	//    5   10:putstatic       #25  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
		WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS = new JsonFormat$Feature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 1);
	//    6   13:new             #2   <Class JsonFormat$Feature>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
	//   11   23:putstatic       #28  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
		WRITE_DATES_WITH_ZONE_ID = new JsonFormat$Feature("WRITE_DATES_WITH_ZONE_ID", 2);
	//   12   26:new             #2   <Class JsonFormat$Feature>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "WRITE_DATES_WITH_ZONE_ID">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
	//   17   36:putstatic       #31  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
		WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new JsonFormat$Feature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 3);
	//   18   39:new             #2   <Class JsonFormat$Feature>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
	//   23   49:putstatic       #34  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
		WRITE_SORTED_MAP_ENTRIES = new JsonFormat$Feature("WRITE_SORTED_MAP_ENTRIES", 4);
	//   24   52:new             #2   <Class JsonFormat$Feature>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "WRITE_SORTED_MAP_ENTRIES">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
	//   29   62:putstatic       #37  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
		$VALUES = (new JsonFormat$Feature[] {
			ACCEPT_SINGLE_VALUE_AS_ARRAY, WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, WRITE_DATES_WITH_ZONE_ID, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, WRITE_SORTED_MAP_ENTRIES
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       JsonFormat$Feature[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field JsonFormat$Feature[] $VALUES>
	//*  53  102:return          
	}

	private JsonFormat$Feature(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
