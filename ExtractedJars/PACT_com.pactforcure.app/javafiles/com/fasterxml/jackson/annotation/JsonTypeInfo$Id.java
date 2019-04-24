// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonTypeInfo

public static final class JsonTypeInfo$Id extends Enum
{

	public static JsonTypeInfo$Id valueOf(String s)
	{
		return (JsonTypeInfo$Id)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$Id, s);
	//    0    0:ldc1            #2   <Class JsonTypeInfo$Id>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonTypeInfo$Id>
	//    4    9:areturn         
	}

	public static JsonTypeInfo$Id[] values()
	{
		return (JsonTypeInfo$Id[])((JsonTypeInfo$Id []) ($VALUES)).clone();
	//    0    0:getstatic       #47  <Field JsonTypeInfo$Id[] $VALUES>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonTypeInfo$Id_3B_.clone()>
	//    2    6:checkcast       #63  <Class JsonTypeInfo$Id[]>
	//    3    9:areturn         
	}

	public String getDefaultPropertyName()
	{
		return _defaultPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String _defaultPropertyName>
	//    2    4:areturn         
	}

	private static final JsonTypeInfo$Id $VALUES[];
	public static final JsonTypeInfo$Id CLASS;
	public static final JsonTypeInfo$Id CUSTOM;
	public static final JsonTypeInfo$Id MINIMAL_CLASS;
	public static final JsonTypeInfo$Id NAME;
	public static final JsonTypeInfo$Id NONE;
	private final String _defaultPropertyName;

	static 
	{
		NONE = new JsonTypeInfo$Id("NONE", 0, ((String) (null)));
	//    0    0:new             #2   <Class JsonTypeInfo$Id>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:aconst_null     
	//    5    8:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
	//    6   11:putstatic       #27  <Field JsonTypeInfo$Id NONE>
		CLASS = new JsonTypeInfo$Id("CLASS", 1, "@class");
	//    7   14:new             #2   <Class JsonTypeInfo$Id>
	//    8   17:dup             
	//    9   18:ldc1            #28  <String "CLASS">
	//   10   20:iconst_1        
	//   11   21:ldc1            #30  <String "@class">
	//   12   23:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
	//   13   26:putstatic       #32  <Field JsonTypeInfo$Id CLASS>
		MINIMAL_CLASS = new JsonTypeInfo$Id("MINIMAL_CLASS", 2, "@c");
	//   14   29:new             #2   <Class JsonTypeInfo$Id>
	//   15   32:dup             
	//   16   33:ldc1            #33  <String "MINIMAL_CLASS">
	//   17   35:iconst_2        
	//   18   36:ldc1            #35  <String "@c">
	//   19   38:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
	//   20   41:putstatic       #37  <Field JsonTypeInfo$Id MINIMAL_CLASS>
		NAME = new JsonTypeInfo$Id("NAME", 3, "@type");
	//   21   44:new             #2   <Class JsonTypeInfo$Id>
	//   22   47:dup             
	//   23   48:ldc1            #38  <String "NAME">
	//   24   50:iconst_3        
	//   25   51:ldc1            #40  <String "@type">
	//   26   53:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
	//   27   56:putstatic       #42  <Field JsonTypeInfo$Id NAME>
		CUSTOM = new JsonTypeInfo$Id("CUSTOM", 4, ((String) (null)));
	//   28   59:new             #2   <Class JsonTypeInfo$Id>
	//   29   62:dup             
	//   30   63:ldc1            #43  <String "CUSTOM">
	//   31   65:iconst_4        
	//   32   66:aconst_null     
	//   33   67:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
	//   34   70:putstatic       #45  <Field JsonTypeInfo$Id CUSTOM>
		$VALUES = (new JsonTypeInfo$Id[] {
			NONE, CLASS, MINIMAL_CLASS, NAME, CUSTOM
		});
	//   35   73:iconst_5        
	//   36   74:anewarray       JsonTypeInfo$Id[]
	//   37   77:dup             
	//   38   78:iconst_0        
	//   39   79:getstatic       #27  <Field JsonTypeInfo$Id NONE>
	//   40   82:aastore         
	//   41   83:dup             
	//   42   84:iconst_1        
	//   43   85:getstatic       #32  <Field JsonTypeInfo$Id CLASS>
	//   44   88:aastore         
	//   45   89:dup             
	//   46   90:iconst_2        
	//   47   91:getstatic       #37  <Field JsonTypeInfo$Id MINIMAL_CLASS>
	//   48   94:aastore         
	//   49   95:dup             
	//   50   96:iconst_3        
	//   51   97:getstatic       #42  <Field JsonTypeInfo$Id NAME>
	//   52  100:aastore         
	//   53  101:dup             
	//   54  102:iconst_4        
	//   55  103:getstatic       #45  <Field JsonTypeInfo$Id CUSTOM>
	//   56  106:aastore         
	//   57  107:putstatic       #47  <Field JsonTypeInfo$Id[] $VALUES>
	//*  58  110:return          
	}

	private JsonTypeInfo$Id(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #51  <Method void Enum(String, int)>
		_defaultPropertyName = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #53  <Field String _defaultPropertyName>
	//    7   11:return          
	}
}
