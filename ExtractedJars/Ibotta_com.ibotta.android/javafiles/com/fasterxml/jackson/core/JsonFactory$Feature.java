// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			JsonFactory

public static final class JsonFactory$Feature extends Enum
{

	public static int collectDefaults()
	{
		JsonFactory$Feature ajsonfactory$feature[] = values();
	//    0    0:invokestatic    #51  <Method JsonFactory$Feature[] values()>
	//    1    3:astore          4
		int l = ajsonfactory$feature.length;
	//    2    5:aload           4
	//    3    7:arraylength     
	//    4    8:istore_3        
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_0        
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_0         
	//*  10   14:iload_3         
	//*  11   15:icmpge          51
		{
			JsonFactory$Feature jsonfactory$feature = ajsonfactory$feature[i];
	//   12   18:aload           4
	//   13   20:iload_0         
	//   14   21:aaload          
	//   15   22:astore          5
			k = j;
	//   16   24:iload_1         
	//   17   25:istore_2        
			if(jsonfactory$feature.enabledByDefault())
	//*  18   26:aload           5
	//*  19   28:invokevirtual   #55  <Method boolean enabledByDefault()>
	//*  20   31:ifeq            42
				k = j | jsonfactory$feature.getMask();
	//   21   34:iload_1         
	//   22   35:aload           5
	//   23   37:invokevirtual   #58  <Method int getMask()>
	//   24   40:ior             
	//   25   41:istore_2        
			i++;
	//   26   42:iload_0         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_0        
		}

	//   30   46:iload_2         
	//   31   47:istore_1        
	//*  32   48:goto            13
		return j;
	//   33   51:iload_1         
	//   34   52:ireturn         
	}

	public static JsonFactory$Feature valueOf(String s)
	{
		return (JsonFactory$Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonFactory$Feature, s);
	//    0    0:ldc1            #2   <Class JsonFactory$Feature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFactory$Feature>
	//    4    9:areturn         
	}

	public static JsonFactory$Feature[] values()
	{
		return (JsonFactory$Feature[])((JsonFactory$Feature []) ($VALUES)).clone();
	//    0    0:getstatic       #37  <Field JsonFactory$Feature[] $VALUES>
	//    1    3:invokevirtual   #68  <Method Object _5B_Lcom.fasterxml.jackson.core.JsonFactory$Feature_3B_.clone()>
	//    2    6:checkcast       #64  <Class JsonFactory$Feature[]>
	//    3    9:areturn         
	}

	public boolean enabledByDefault()
	{
		return _defaultState;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean _defaultState>
	//    2    4:ireturn         
	}

	public boolean enabledIn(int i)
	{
		return (i & getMask()) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #58  <Method int getMask()>
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int getMask()
	{
		return 1 << ordinal();
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokevirtual   #73  <Method int ordinal()>
	//    3    5:ishl            
	//    4    6:ireturn         
	}

	private static final JsonFactory$Feature $VALUES[];
	public static final JsonFactory$Feature CANONICALIZE_FIELD_NAMES;
	public static final JsonFactory$Feature FAIL_ON_SYMBOL_HASH_OVERFLOW;
	public static final JsonFactory$Feature INTERN_FIELD_NAMES;
	public static final JsonFactory$Feature USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING;
	private final boolean _defaultState;

	static 
	{
		INTERN_FIELD_NAMES = new JsonFactory$Feature("INTERN_FIELD_NAMES", 0, true);
	//    0    0:new             #2   <Class JsonFactory$Feature>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "INTERN_FIELD_NAMES">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
	//    6   11:putstatic       #26  <Field JsonFactory$Feature INTERN_FIELD_NAMES>
		CANONICALIZE_FIELD_NAMES = new JsonFactory$Feature("CANONICALIZE_FIELD_NAMES", 1, true);
	//    7   14:new             #2   <Class JsonFactory$Feature>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "CANONICALIZE_FIELD_NAMES">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
	//   13   25:putstatic       #29  <Field JsonFactory$Feature CANONICALIZE_FIELD_NAMES>
		FAIL_ON_SYMBOL_HASH_OVERFLOW = new JsonFactory$Feature("FAIL_ON_SYMBOL_HASH_OVERFLOW", 2, true);
	//   14   28:new             #2   <Class JsonFactory$Feature>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "FAIL_ON_SYMBOL_HASH_OVERFLOW">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
	//   20   39:putstatic       #32  <Field JsonFactory$Feature FAIL_ON_SYMBOL_HASH_OVERFLOW>
		USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING = new JsonFactory$Feature("USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING", 3, true);
	//   21   42:new             #2   <Class JsonFactory$Feature>
	//   22   45:dup             
	//   23   46:ldc1            #33  <String "USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
	//   27   53:putstatic       #35  <Field JsonFactory$Feature USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING>
		$VALUES = (new JsonFactory$Feature[] {
			INTERN_FIELD_NAMES, CANONICALIZE_FIELD_NAMES, FAIL_ON_SYMBOL_HASH_OVERFLOW, USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       JsonFactory$Feature[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #26  <Field JsonFactory$Feature INTERN_FIELD_NAMES>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #29  <Field JsonFactory$Feature CANONICALIZE_FIELD_NAMES>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #32  <Field JsonFactory$Feature FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #35  <Field JsonFactory$Feature USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING>
	//   45   83:aastore         
	//   46   84:putstatic       #37  <Field JsonFactory$Feature[] $VALUES>
	//*  47   87:return          
	}

	private JsonFactory$Feature(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		_defaultState = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #43  <Field boolean _defaultState>
	//    7   11:return          
	}
}
