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
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonInclude$Include>
	//    4    9:areturn         
	}

	public static JsonInclude$Include[] values()
	{
		return (JsonInclude$Include[])((JsonInclude$Include []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field JsonInclude$Include[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonInclude$Include_3B_.clone()>
	//    2    6:checkcast       #54  <Class JsonInclude$Include[]>
	//    3    9:areturn         
	}

	private static final JsonInclude$Include $VALUES[];
	public static final JsonInclude$Include ALWAYS;
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
	//    2    4:ldc1            #20  <String "ALWAYS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void JsonInclude$Include(String, int)>
	//    5   10:putstatic       #26  <Field JsonInclude$Include ALWAYS>
		NON_NULL = new JsonInclude$Include("NON_NULL", 1);
	//    6   13:new             #2   <Class JsonInclude$Include>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "NON_NULL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void JsonInclude$Include(String, int)>
	//   11   23:putstatic       #29  <Field JsonInclude$Include NON_NULL>
		NON_ABSENT = new JsonInclude$Include("NON_ABSENT", 2);
	//   12   26:new             #2   <Class JsonInclude$Include>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "NON_ABSENT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void JsonInclude$Include(String, int)>
	//   17   36:putstatic       #32  <Field JsonInclude$Include NON_ABSENT>
		NON_EMPTY = new JsonInclude$Include("NON_EMPTY", 3);
	//   18   39:new             #2   <Class JsonInclude$Include>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "NON_EMPTY">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void JsonInclude$Include(String, int)>
	//   23   49:putstatic       #35  <Field JsonInclude$Include NON_EMPTY>
		NON_DEFAULT = new JsonInclude$Include("NON_DEFAULT", 4);
	//   24   52:new             #2   <Class JsonInclude$Include>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "NON_DEFAULT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void JsonInclude$Include(String, int)>
	//   29   62:putstatic       #38  <Field JsonInclude$Include NON_DEFAULT>
		USE_DEFAULTS = new JsonInclude$Include("USE_DEFAULTS", 5);
	//   30   65:new             #2   <Class JsonInclude$Include>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "USE_DEFAULTS">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void JsonInclude$Include(String, int)>
	//   35   75:putstatic       #41  <Field JsonInclude$Include USE_DEFAULTS>
		$VALUES = (new JsonInclude$Include[] {
			ALWAYS, NON_NULL, NON_ABSENT, NON_EMPTY, NON_DEFAULT, USE_DEFAULTS
		});
	//   36   78:bipush          6
	//   37   80:anewarray       JsonInclude$Include[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field JsonInclude$Include ALWAYS>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field JsonInclude$Include NON_NULL>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field JsonInclude$Include NON_ABSENT>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field JsonInclude$Include NON_EMPTY>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field JsonInclude$Include NON_DEFAULT>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field JsonInclude$Include USE_DEFAULTS>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field JsonInclude$Include[] $VALUES>
	//*  63  122:return          
	}

	private JsonInclude$Include(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
