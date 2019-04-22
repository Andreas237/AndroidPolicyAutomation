// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonInclude

public static final class JsonInclude$Include extends Enum
{

	public static JsonInclude$Include valueOf(String s)
	{
		return (JsonInclude$Include)Enum.valueOf(com/fasterxml/jackson/annotation/JsonInclude$Include, s);
	//    0    0:ldc1            #2   <Class JsonInclude$Include>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonInclude$Include>
	//    4    9:areturn         
	}

	public static JsonInclude$Include[] values()
	{
		return (JsonInclude$Include[])((JsonInclude$Include []) ($VALUES)).clone();
	//    0    0:getstatic       #47  <Field JsonInclude$Include[] $VALUES>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonInclude$Include_3B_.clone()>
	//    2    6:checkcast       #58  <Class JsonInclude$Include[]>
	//    3    9:areturn         
	}

	private static final JsonInclude$Include $VALUES[];
	public static final JsonInclude$Include ALWAYS;
	public static final JsonInclude$Include CUSTOM;
	public static final JsonInclude$Include NON_ABSENT;
	public static final JsonInclude$Include NON_DEFAULT;
	public static final JsonInclude$Include NON_EMPTY;
	public static final JsonInclude$Include NON_NULL;
	public static final JsonInclude$Include USE_DEFAULTS;

	static 
	{
		ALWAYS = new JsonInclude$Include("ALWAYS", 0);
	//    0    0:new             #2   <Class JsonInclude$Include>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "ALWAYS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//    5   10:putstatic       #27  <Field JsonInclude$Include ALWAYS>
		NON_NULL = new JsonInclude$Include("NON_NULL", 1);
	//    6   13:new             #2   <Class JsonInclude$Include>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "NON_NULL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//   11   23:putstatic       #30  <Field JsonInclude$Include NON_NULL>
		NON_ABSENT = new JsonInclude$Include("NON_ABSENT", 2);
	//   12   26:new             #2   <Class JsonInclude$Include>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "NON_ABSENT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//   17   36:putstatic       #33  <Field JsonInclude$Include NON_ABSENT>
		NON_EMPTY = new JsonInclude$Include("NON_EMPTY", 3);
	//   18   39:new             #2   <Class JsonInclude$Include>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "NON_EMPTY">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//   23   49:putstatic       #36  <Field JsonInclude$Include NON_EMPTY>
		NON_DEFAULT = new JsonInclude$Include("NON_DEFAULT", 4);
	//   24   52:new             #2   <Class JsonInclude$Include>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "NON_DEFAULT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//   29   62:putstatic       #39  <Field JsonInclude$Include NON_DEFAULT>
		CUSTOM = new JsonInclude$Include("CUSTOM", 5);
	//   30   65:new             #2   <Class JsonInclude$Include>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "CUSTOM">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//   35   75:putstatic       #42  <Field JsonInclude$Include CUSTOM>
		USE_DEFAULTS = new JsonInclude$Include("USE_DEFAULTS", 6);
	//   36   78:new             #2   <Class JsonInclude$Include>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "USE_DEFAULTS">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
	//   41   89:putstatic       #45  <Field JsonInclude$Include USE_DEFAULTS>
		$VALUES = (new JsonInclude$Include[] {
			ALWAYS, NON_NULL, NON_ABSENT, NON_EMPTY, NON_DEFAULT, CUSTOM, USE_DEFAULTS
		});
	//   42   92:bipush          7
	//   43   94:anewarray       JsonInclude$Include[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #27  <Field JsonInclude$Include ALWAYS>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #30  <Field JsonInclude$Include NON_NULL>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #33  <Field JsonInclude$Include NON_ABSENT>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #36  <Field JsonInclude$Include NON_EMPTY>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #39  <Field JsonInclude$Include NON_DEFAULT>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #42  <Field JsonInclude$Include CUSTOM>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #45  <Field JsonInclude$Include USE_DEFAULTS>
	//   71  139:aastore         
	//   72  140:putstatic       #47  <Field JsonInclude$Include[] $VALUES>
	//*  73  143:return          
	}

	private JsonInclude$Include(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
