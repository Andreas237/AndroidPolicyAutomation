// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

// Referenced classes of package com.google.gson:
//			FieldNamingStrategy

public abstract class FieldNamingPolicy extends Enum
	implements FieldNamingStrategy
{

	private FieldNamingPolicy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
	//    4    6:return          
	}


	private static String modifyString(char c, String s, int i)
	{
		if(i < s.length())
	//*   0    0:iload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #65  <Method int String.length()>
	//*   3    5:icmpge          31
			return (new StringBuilder()).append(c).append(s.substring(i)).toString();
	//    4    8:new             #67  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #69  <Method void StringBuilder()>
	//    7   15:iload_0         
	//    8   16:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokevirtual   #77  <Method String String.substring(int)>
	//   12   24:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   14   30:areturn         
		else
			return String.valueOf(c);
	//   15   31:iload_0         
	//   16   32:invokestatic    #88  <Method String String.valueOf(char)>
	//   17   35:areturn         
	}

	static String separateCamelCase(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore          5
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		for(int j = s.length(); i < j; i++)
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #65  <Method int String.length()>
	//*   8   15:istore          4
	//*   9   17:iload_3         
	//*  10   18:iload           4
	//*  11   20:icmpge          65
		{
			char c = s.charAt(i);
	//   12   23:aload_0         
	//   13   24:iload_3         
	//   14   25:invokevirtual   #94  <Method char String.charAt(int)>
	//   15   28:istore_2        
			if(Character.isUpperCase(c) && stringbuilder.length() != 0)
	//*  16   29:iload_2         
	//*  17   30:invokestatic    #100 <Method boolean Character.isUpperCase(char)>
	//*  18   33:ifeq            51
	//*  19   36:aload           5
	//*  20   38:invokevirtual   #101 <Method int StringBuilder.length()>
	//*  21   41:ifeq            51
				stringbuilder.append(s1);
	//   22   44:aload           5
	//   23   46:aload_1         
	//   24   47:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			stringbuilder.append(c);
	//   26   51:aload           5
	//   27   53:iload_2         
	//   28   54:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   29   57:pop             
		}

	//   30   58:iload_3         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_3        
	//*  34   62:goto            17
		return stringbuilder.toString();
	//   35   65:aload           5
	//   36   67:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   37   70:areturn         
	}

	static String upperCaseFirstLetter(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore          4
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		char c = s.charAt(0);
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #94  <Method char String.charAt(int)>
	//    9   16:istore_1        
		for(int j = s.length(); i < j - 1 && !Character.isLetter(c); c = s.charAt(i))
	//*  10   17:aload_0         
	//*  11   18:invokevirtual   #65  <Method int String.length()>
	//*  12   21:istore_3        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:iconst_1        
	//*  16   25:isub            
	//*  17   26:icmpge          59
	//*  18   29:iload_1         
	//*  19   30:invokestatic    #106 <Method boolean Character.isLetter(char)>
	//*  20   33:ifeq            39
	//*  21   36:goto            59
		{
			stringbuilder.append(c);
	//   22   39:aload           4
	//   23   41:iload_1         
	//   24   42:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   25   45:pop             
			i++;
	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_2        
		}

	//   30   50:aload_0         
	//   31   51:iload_2         
	//   32   52:invokevirtual   #94  <Method char String.charAt(int)>
	//   33   55:istore_1        
	//*  34   56:goto            22
		if(!Character.isUpperCase(c))
	//*  35   59:iload_1         
	//*  36   60:invokestatic    #100 <Method boolean Character.isUpperCase(char)>
	//*  37   63:ifne            86
			return stringbuilder.append(modifyString(Character.toUpperCase(c), s, i + 1)).toString();
	//   38   66:aload           4
	//   39   68:iload_1         
	//   40   69:invokestatic    #110 <Method char Character.toUpperCase(char)>
	//   41   72:aload_0         
	//   42   73:iload_2         
	//   43   74:iconst_1        
	//   44   75:iadd            
	//   45   76:invokestatic    #112 <Method String modifyString(char, String, int)>
	//   46   79:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   47   82:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   48   85:areturn         
		else
			return s;
	//   49   86:aload_0         
	//   50   87:areturn         
	}

	public static FieldNamingPolicy valueOf(String s)
	{
		return (FieldNamingPolicy)Enum.valueOf(com/google/gson/FieldNamingPolicy, s);
	//    0    0:ldc1            #2   <Class FieldNamingPolicy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #116 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class FieldNamingPolicy>
	//    4    9:areturn         
	}

	public static FieldNamingPolicy[] values()
	{
		return (FieldNamingPolicy[])((FieldNamingPolicy []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field FieldNamingPolicy[] $VALUES>
	//    1    3:invokevirtual   #123 <Method Object _5B_Lcom.google.gson.FieldNamingPolicy_3B_.clone()>
	//    2    6:checkcast       #119 <Class FieldNamingPolicy[]>
	//    3    9:areturn         
	}

	private static final FieldNamingPolicy $VALUES[];
	public static final FieldNamingPolicy IDENTITY;
	public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
	public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
	public static final FieldNamingPolicy UPPER_CAMEL_CASE;
	public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;

	static 
	{
		IDENTITY = ((FieldNamingPolicy) (new FieldNamingPolicy("IDENTITY", 0) {

			public String translateName(Field field)
			{
				return field.getName();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void FieldNamingPolicy(String, int, FieldNamingPolicy$1)>
			//    5    7:return          
			}
		}
));
	//    0    0:new             #9   <Class FieldNamingPolicy$1>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "IDENTITY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #32  <Method void FieldNamingPolicy$1(String, int)>
	//    5   10:putstatic       #34  <Field FieldNamingPolicy IDENTITY>
		UPPER_CAMEL_CASE = ((FieldNamingPolicy) (new FieldNamingPolicy("UPPER_CAMEL_CASE", 1) {

			public String translateName(Field field)
			{
				return upperCaseFirstLetter(field.getName());
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:invokestatic    #22  <Method String upperCaseFirstLetter(String)>
			//    3    7:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void FieldNamingPolicy(String, int, FieldNamingPolicy$1)>
			//    5    7:return          
			}
		}
));
	//    6   13:new             #11  <Class FieldNamingPolicy$2>
	//    7   16:dup             
	//    8   17:ldc1            #35  <String "UPPER_CAMEL_CASE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #36  <Method void FieldNamingPolicy$2(String, int)>
	//   11   23:putstatic       #38  <Field FieldNamingPolicy UPPER_CAMEL_CASE>
		UPPER_CAMEL_CASE_WITH_SPACES = ((FieldNamingPolicy) (new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES", 2) {

			public String translateName(Field field)
			{
				return upperCaseFirstLetter(separateCamelCase(field.getName(), " "));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:ldc1            #20  <String " ">
			//    3    6:invokestatic    #24  <Method String separateCamelCase(String, String)>
			//    4    9:invokestatic    #28  <Method String upperCaseFirstLetter(String)>
			//    5   12:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void FieldNamingPolicy(String, int, FieldNamingPolicy$1)>
			//    5    7:return          
			}
		}
));
	//   12   26:new             #13  <Class FieldNamingPolicy$3>
	//   13   29:dup             
	//   14   30:ldc1            #39  <String "UPPER_CAMEL_CASE_WITH_SPACES">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #40  <Method void FieldNamingPolicy$3(String, int)>
	//   17   36:putstatic       #42  <Field FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES>
		LOWER_CASE_WITH_UNDERSCORES = ((FieldNamingPolicy) (new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES", 3) {

			public String translateName(Field field)
			{
				return separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:ldc1            #20  <String "_">
			//    3    6:invokestatic    #24  <Method String separateCamelCase(String, String)>
			//    4    9:getstatic       #30  <Field Locale Locale.ENGLISH>
			//    5   12:invokevirtual   #36  <Method String String.toLowerCase(Locale)>
			//    6   15:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void FieldNamingPolicy(String, int, FieldNamingPolicy$1)>
			//    5    7:return          
			}
		}
));
	//   18   39:new             #15  <Class FieldNamingPolicy$4>
	//   19   42:dup             
	//   20   43:ldc1            #43  <String "LOWER_CASE_WITH_UNDERSCORES">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #44  <Method void FieldNamingPolicy$4(String, int)>
	//   23   49:putstatic       #46  <Field FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES>
		LOWER_CASE_WITH_DASHES = ((FieldNamingPolicy) (new FieldNamingPolicy("LOWER_CASE_WITH_DASHES", 4) {

			public String translateName(Field field)
			{
				return separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:ldc1            #20  <String "-">
			//    3    6:invokestatic    #24  <Method String separateCamelCase(String, String)>
			//    4    9:getstatic       #30  <Field Locale Locale.ENGLISH>
			//    5   12:invokevirtual   #36  <Method String String.toLowerCase(Locale)>
			//    6   15:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void FieldNamingPolicy(String, int, FieldNamingPolicy$1)>
			//    5    7:return          
			}
		}
));
	//   24   52:new             #17  <Class FieldNamingPolicy$5>
	//   25   55:dup             
	//   26   56:ldc1            #47  <String "LOWER_CASE_WITH_DASHES">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #48  <Method void FieldNamingPolicy$5(String, int)>
	//   29   62:putstatic       #50  <Field FieldNamingPolicy LOWER_CASE_WITH_DASHES>
		$VALUES = (new FieldNamingPolicy[] {
			IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       FieldNamingPolicy[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #34  <Field FieldNamingPolicy IDENTITY>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #38  <Field FieldNamingPolicy UPPER_CAMEL_CASE>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #42  <Field FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #46  <Field FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #50  <Field FieldNamingPolicy LOWER_CASE_WITH_DASHES>
	//   51   98:aastore         
	//   52   99:putstatic       #52  <Field FieldNamingPolicy[] $VALUES>
	//*  53  102:return          
	}
}
