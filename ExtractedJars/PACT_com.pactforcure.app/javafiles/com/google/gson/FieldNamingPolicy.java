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
	//*   2    2:invokevirtual   #75  <Method int String.length()>
	//*   3    5:icmpge          31
			return (new StringBuilder()).append(c).append(s.substring(i)).toString();
	//    4    8:new             #77  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #79  <Method void StringBuilder()>
	//    7   15:iload_0         
	//    8   16:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokevirtual   #87  <Method String String.substring(int)>
	//   12   24:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   14   30:areturn         
		else
			return String.valueOf(c);
	//   15   31:iload_0         
	//   16   32:invokestatic    #98  <Method String String.valueOf(char)>
	//   17   35:areturn         
	}

	private static String separateCamelCase(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore          4
		for(int i = 0; i < s.length(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #75  <Method int String.length()>
	//*   9   16:icmpge          61
		{
			char c = s.charAt(i);
	//   10   19:aload_0         
	//   11   20:iload_3         
	//   12   21:invokevirtual   #102 <Method char String.charAt(int)>
	//   13   24:istore_2        
			if(Character.isUpperCase(c) && stringbuilder.length() != 0)
	//*  14   25:iload_2         
	//*  15   26:invokestatic    #108 <Method boolean Character.isUpperCase(char)>
	//*  16   29:ifeq            47
	//*  17   32:aload           4
	//*  18   34:invokevirtual   #109 <Method int StringBuilder.length()>
	//*  19   37:ifeq            47
				stringbuilder.append(s1);
	//   20   40:aload           4
	//   21   42:aload_1         
	//   22   43:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			stringbuilder.append(c);
	//   24   47:aload           4
	//   25   49:iload_2         
	//   26   50:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   27   53:pop             
		}

	//   28   54:iload_3         
	//   29   55:iconst_1        
	//   30   56:iadd            
	//   31   57:istore_3        
	//*  32   58:goto            11
		return stringbuilder.toString();
	//   33   61:aload           4
	//   34   63:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   35   66:areturn         
	}

	private static String upperCaseFirstLetter(String s)
	{
		char c;
		int i;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore          4
		i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		c = s.charAt(0);
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #102 <Method char String.charAt(int)>
	//    9   16:istore_1        
_L8:
		if(i < s.length() - 1 && !Character.isLetter(c)) goto _L2; else goto _L1
	//   10   17:iload_2         
	//   11   18:aload_0         
	//   12   19:invokevirtual   #75  <Method int String.length()>
	//   13   22:iconst_1        
	//   14   23:isub            
	//   15   24:icmpge          34
	//   16   27:iload_1         
	//   17   28:invokestatic    #112 <Method boolean Character.isLetter(char)>
	//   18   31:ifeq            50
_L1:
		if(i != s.length()) goto _L4; else goto _L3
	//   19   34:iload_2         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #75  <Method int String.length()>
	//   22   39:icmpne          70
_L3:
		String s1 = stringbuilder.toString();
	//   23   42:aload           4
	//   24   44:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   25   47:astore_3        
_L6:
		return s1;
	//   26   48:aload_3         
	//   27   49:areturn         
_L2:
		stringbuilder.append(c);
	//   28   50:aload           4
	//   29   52:iload_1         
	//   30   53:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   31   56:pop             
		i++;
	//   32   57:iload_2         
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:istore_2        
		c = s.charAt(i);
	//   36   61:aload_0         
	//   37   62:iload_2         
	//   38   63:invokevirtual   #102 <Method char String.charAt(int)>
	//   39   66:istore_1        
		continue; /* Loop/switch isn't completed */
	//   40   67:goto            17
_L4:
		s1 = s;
	//   41   70:aload_0         
	//   42   71:astore_3        
		if(Character.isUpperCase(c)) goto _L6; else goto _L5
	//   43   72:iload_1         
	//   44   73:invokestatic    #108 <Method boolean Character.isUpperCase(char)>
	//   45   76:ifne            48
_L5:
		return stringbuilder.append(modifyString(Character.toUpperCase(c), s, i + 1)).toString();
	//   46   79:aload           4
	//   47   81:iload_1         
	//   48   82:invokestatic    #116 <Method char Character.toUpperCase(char)>
	//   49   85:aload_0         
	//   50   86:iload_2         
	//   51   87:iconst_1        
	//   52   88:iadd            
	//   53   89:invokestatic    #118 <Method String modifyString(char, String, int)>
	//   54   92:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   55   95:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   56   98:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public static FieldNamingPolicy valueOf(String s)
	{
		return (FieldNamingPolicy)Enum.valueOf(com/google/gson/FieldNamingPolicy, s);
	//    0    0:ldc1            #2   <Class FieldNamingPolicy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #122 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class FieldNamingPolicy>
	//    4    9:areturn         
	}

	public static FieldNamingPolicy[] values()
	{
		return (FieldNamingPolicy[])((FieldNamingPolicy []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field FieldNamingPolicy[] $VALUES>
	//    1    3:invokevirtual   #129 <Method Object _5B_Lcom.google.gson.FieldNamingPolicy_3B_.clone()>
	//    2    6:checkcast       #125 <Class FieldNamingPolicy[]>
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
				return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:invokestatic    #22  <Method String FieldNamingPolicy.access$100(String)>
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
				return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), " "));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:ldc1            #20  <String " ">
			//    3    6:invokestatic    #24  <Method String FieldNamingPolicy.access$200(String, String)>
			//    4    9:invokestatic    #28  <Method String FieldNamingPolicy.access$100(String)>
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
				return FieldNamingPolicy.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:ldc1            #20  <String "_">
			//    3    6:invokestatic    #24  <Method String FieldNamingPolicy.access$200(String, String)>
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
				return FieldNamingPolicy.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #18  <Method String Field.getName()>
			//    2    4:ldc1            #20  <String "-">
			//    3    6:invokestatic    #24  <Method String FieldNamingPolicy.access$200(String, String)>
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


/*
	static String access$100(String s)
	{
		return upperCaseFirstLetter(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method String upperCaseFirstLetter(String)>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(String s, String s1)
	{
		return separateCamelCase(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #67  <Method String separateCamelCase(String, String)>
	//    3    5:areturn         
	}

*/
}
