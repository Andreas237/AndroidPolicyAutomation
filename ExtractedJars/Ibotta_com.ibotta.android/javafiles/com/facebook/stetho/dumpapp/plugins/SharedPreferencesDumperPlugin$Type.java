// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp.plugins;


// Referenced classes of package com.facebook.stetho.dumpapp.plugins:
//			SharedPreferencesDumperPlugin

private static final class SharedPreferencesDumperPlugin$Type extends Enum
{

	public static StringBuilder appendNamesList(StringBuilder stringbuilder, String s)
	{
		SharedPreferencesDumperPlugin$Type asharedpreferencesdumperplugin$type[] = values();
	//    0    0:invokestatic    #71  <Method SharedPreferencesDumperPlugin$Type[] values()>
	//    1    3:astore          5
		int j = asharedpreferencesdumperplugin$type.length;
	//    2    5:aload           5
	//    3    7:arraylength     
	//    4    8:istore          4
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		boolean flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		for(; i < j; i++)
	//*   9   14:iload_2         
	//*  10   15:iload           4
	//*  11   17:icmpge          58
		{
			SharedPreferencesDumperPlugin$Type sharedpreferencesdumperplugin$type = asharedpreferencesdumperplugin$type[i];
	//   12   20:aload           5
	//   13   22:iload_2         
	//   14   23:aaload          
	//   15   24:astore          6
			if(flag)
	//*  16   26:iload_3         
	//*  17   27:ifeq            35
				flag = false;
	//   18   30:iconst_0        
	//   19   31:istore_3        
			else
	//*  20   32:goto            41
				stringbuilder.append(s);
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   24   40:pop             
			stringbuilder.append(sharedpreferencesdumperplugin$type.name);
	//   25   41:aload_0         
	//   26   42:aload           6
	//   27   44:getfield        #63  <Field String name>
	//   28   47:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   29   50:pop             
		}

	//   30   51:iload_2         
	//   31   52:iconst_1        
	//   32   53:iadd            
	//   33   54:istore_2        
	//*  34   55:goto            14
		return stringbuilder;
	//   35   58:aload_0         
	//   36   59:areturn         
	}

	public static SharedPreferencesDumperPlugin$Type of(String s)
	{
		SharedPreferencesDumperPlugin$Type asharedpreferencesdumperplugin$type[] = values();
	//    0    0:invokestatic    #71  <Method SharedPreferencesDumperPlugin$Type[] values()>
	//    1    3:astore_3        
		int j = asharedpreferencesdumperplugin$type.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          41
		{
			SharedPreferencesDumperPlugin$Type sharedpreferencesdumperplugin$type = asharedpreferencesdumperplugin$type[i];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(sharedpreferencesdumperplugin$type.name.equals(((Object) (s))))
	//*  14   19:aload           4
	//*  15   21:getfield        #63  <Field String name>
	//*  16   24:aload_0         
	//*  17   25:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  18   28:ifeq            34
				return sharedpreferencesdumperplugin$type;
	//   19   31:aload           4
	//   20   33:areturn         
		}

	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_1        
	//*  25   38:goto            9
		return null;
	//   26   41:aconst_null     
	//   27   42:areturn         
	}

	public static SharedPreferencesDumperPlugin$Type valueOf(String s)
	{
		return (SharedPreferencesDumperPlugin$Type)Enum.valueOf(com/facebook/stetho/dumpapp/plugins/SharedPreferencesDumperPlugin$Type, s);
	//    0    0:ldc1            #2   <Class SharedPreferencesDumperPlugin$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SharedPreferencesDumperPlugin$Type>
	//    4    9:areturn         
	}

	public static SharedPreferencesDumperPlugin$Type[] values()
	{
		return (SharedPreferencesDumperPlugin$Type[])((SharedPreferencesDumperPlugin$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #57  <Field SharedPreferencesDumperPlugin$Type[] $VALUES>
	//    1    3:invokevirtual   #96  <Method Object _5B_Lcom.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type_3B_.clone()>
	//    2    6:checkcast       #92  <Class SharedPreferencesDumperPlugin$Type[]>
	//    3    9:areturn         
	}

	private static final SharedPreferencesDumperPlugin$Type $VALUES[];
	public static final SharedPreferencesDumperPlugin$Type BOOLEAN;
	public static final SharedPreferencesDumperPlugin$Type FLOAT;
	public static final SharedPreferencesDumperPlugin$Type INT;
	public static final SharedPreferencesDumperPlugin$Type LONG;
	public static final SharedPreferencesDumperPlugin$Type SET;
	public static final SharedPreferencesDumperPlugin$Type STRING;
	private final String name;

	static 
	{
		BOOLEAN = new SharedPreferencesDumperPlugin$Type("BOOLEAN", 0, "boolean");
	//    0    0:new             #2   <Class SharedPreferencesDumperPlugin$Type>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "BOOLEAN">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "boolean">
	//    5    9:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
	//    6   12:putstatic       #30  <Field SharedPreferencesDumperPlugin$Type BOOLEAN>
		INT = new SharedPreferencesDumperPlugin$Type("INT", 1, "int");
	//    7   15:new             #2   <Class SharedPreferencesDumperPlugin$Type>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "INT">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "int">
	//   12   24:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
	//   13   27:putstatic       #35  <Field SharedPreferencesDumperPlugin$Type INT>
		LONG = new SharedPreferencesDumperPlugin$Type("LONG", 2, "long");
	//   14   30:new             #2   <Class SharedPreferencesDumperPlugin$Type>
	//   15   33:dup             
	//   16   34:ldc1            #36  <String "LONG">
	//   17   36:iconst_2        
	//   18   37:ldc1            #38  <String "long">
	//   19   39:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
	//   20   42:putstatic       #40  <Field SharedPreferencesDumperPlugin$Type LONG>
		FLOAT = new SharedPreferencesDumperPlugin$Type("FLOAT", 3, "float");
	//   21   45:new             #2   <Class SharedPreferencesDumperPlugin$Type>
	//   22   48:dup             
	//   23   49:ldc1            #41  <String "FLOAT">
	//   24   51:iconst_3        
	//   25   52:ldc1            #43  <String "float">
	//   26   54:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
	//   27   57:putstatic       #45  <Field SharedPreferencesDumperPlugin$Type FLOAT>
		STRING = new SharedPreferencesDumperPlugin$Type("STRING", 4, "string");
	//   28   60:new             #2   <Class SharedPreferencesDumperPlugin$Type>
	//   29   63:dup             
	//   30   64:ldc1            #46  <String "STRING">
	//   31   66:iconst_4        
	//   32   67:ldc1            #48  <String "string">
	//   33   69:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
	//   34   72:putstatic       #50  <Field SharedPreferencesDumperPlugin$Type STRING>
		SET = new SharedPreferencesDumperPlugin$Type("SET", 5, "set");
	//   35   75:new             #2   <Class SharedPreferencesDumperPlugin$Type>
	//   36   78:dup             
	//   37   79:ldc1            #51  <String "SET">
	//   38   81:iconst_5        
	//   39   82:ldc1            #53  <String "set">
	//   40   84:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
	//   41   87:putstatic       #55  <Field SharedPreferencesDumperPlugin$Type SET>
		$VALUES = (new SharedPreferencesDumperPlugin$Type[] {
			BOOLEAN, INT, LONG, FLOAT, STRING, SET
		});
	//   42   90:bipush          6
	//   43   92:anewarray       SharedPreferencesDumperPlugin$Type[]
	//   44   95:dup             
	//   45   96:iconst_0        
	//   46   97:getstatic       #30  <Field SharedPreferencesDumperPlugin$Type BOOLEAN>
	//   47  100:aastore         
	//   48  101:dup             
	//   49  102:iconst_1        
	//   50  103:getstatic       #35  <Field SharedPreferencesDumperPlugin$Type INT>
	//   51  106:aastore         
	//   52  107:dup             
	//   53  108:iconst_2        
	//   54  109:getstatic       #40  <Field SharedPreferencesDumperPlugin$Type LONG>
	//   55  112:aastore         
	//   56  113:dup             
	//   57  114:iconst_3        
	//   58  115:getstatic       #45  <Field SharedPreferencesDumperPlugin$Type FLOAT>
	//   59  118:aastore         
	//   60  119:dup             
	//   61  120:iconst_4        
	//   62  121:getstatic       #50  <Field SharedPreferencesDumperPlugin$Type STRING>
	//   63  124:aastore         
	//   64  125:dup             
	//   65  126:iconst_5        
	//   66  127:getstatic       #55  <Field SharedPreferencesDumperPlugin$Type SET>
	//   67  130:aastore         
	//   68  131:putstatic       #57  <Field SharedPreferencesDumperPlugin$Type[] $VALUES>
	//*  69  134:return          
	}

	private SharedPreferencesDumperPlugin$Type(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #63  <Field String name>
	//    7   11:return          
	}
}
