// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

public class PropertyNamingStrategy
	implements Serializable
{
	public static class KebabCaseStrategy extends PropertyNamingStrategyBase
	{

		public String translate(String s)
		{
			int k;
			if(s != null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
		//*   2    4:aload_1         
		//*   3    5:areturn         
		//*   4    6:aload_1         
		//*   5    7:invokevirtual   #20  <Method int String.length()>
		//*   6   10:istore          6
				if((k = s.length()) != 0)
		//*   7   12:iload           6
		//*   8   14:ifeq            4
				{
					StringBuilder stringbuilder = new StringBuilder((k >> 1) + k);
		//    9   17:new             #22  <Class StringBuilder>
		//   10   20:dup             
		//   11   21:iload           6
		//   12   23:iconst_1        
		//   13   24:ishr            
		//   14   25:iload           6
		//   15   27:iadd            
		//   16   28:invokespecial   #25  <Method void StringBuilder(int)>
		//   17   31:astore          7
					int i = 0;
		//   18   33:iconst_0        
		//   19   34:istore          4
					int j = 0;
		//   20   36:iconst_0        
		//   21   37:istore          5
					while(j < k) 
		//*  22   39:iload           5
		//*  23   41:iload           6
		//*  24   43:icmpge          130
					{
						char c = s.charAt(j);
		//   25   46:aload_1         
		//   26   47:iload           5
		//   27   49:invokevirtual   #29  <Method char String.charAt(int)>
		//   28   52:istore_2        
						char c1 = Character.toLowerCase(c);
		//   29   53:iload_2         
		//   30   54:invokestatic    #35  <Method char Character.toLowerCase(char)>
		//   31   57:istore_3        
						if(c1 == c)
		//*  32   58:iload_3         
		//*  33   59:iload_2         
		//*  34   60:icmpne          103
						{
							if(i > 1)
		//*  35   63:iload           4
		//*  36   65:iconst_1        
		//*  37   66:icmple          84
								stringbuilder.insert(stringbuilder.length() - 1, '-');
		//   38   69:aload           7
		//   39   71:aload           7
		//   40   73:invokevirtual   #36  <Method int StringBuilder.length()>
		//   41   76:iconst_1        
		//   42   77:isub            
		//   43   78:bipush          45
		//   44   80:invokevirtual   #40  <Method StringBuilder StringBuilder.insert(int, char)>
		//   45   83:pop             
							i = 0;
		//   46   84:iconst_0        
		//   47   85:istore          4
						} else
		//*  48   87:aload           7
		//*  49   89:iload_3         
		//*  50   90:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//*  51   93:pop             
		//*  52   94:iload           5
		//*  53   96:iconst_1        
		//*  54   97:iadd            
		//*  55   98:istore          5
		//*  56  100:goto            39
						{
							if(i == 0 && j > 0)
		//*  57  103:iload           4
		//*  58  105:ifne            121
		//*  59  108:iload           5
		//*  60  110:ifle            121
								stringbuilder.append('-');
		//   61  113:aload           7
		//   62  115:bipush          45
		//   63  117:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   64  120:pop             
							i++;
		//   65  121:iload           4
		//   66  123:iconst_1        
		//   67  124:iadd            
		//   68  125:istore          4
						}
						stringbuilder.append(c1);
						j++;
					}
		//*  69  127:goto            87
					return stringbuilder.toString();
		//   70  130:aload           7
		//   71  132:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   72  135:areturn         
				}
			return s;
		}

		public KebabCaseStrategy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
		//    2    4:return          
		}
	}

	public static class LowerCaseStrategy extends PropertyNamingStrategyBase
	{

		public String translate(String s)
		{
			return s.toLowerCase();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #20  <Method String String.toLowerCase()>
		//    2    4:areturn         
		}

		public LowerCaseStrategy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
		//    2    4:return          
		}
	}

	public static class LowerCaseWithUnderscoresStrategy extends SnakeCaseStrategy
	{

		public LowerCaseWithUnderscoresStrategy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PropertyNamingStrategy$SnakeCaseStrategy()>
		//    2    4:return          
		}
	}

	public static class PascalCaseStrategy extends UpperCamelCaseStrategy
	{

		public PascalCaseStrategy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PropertyNamingStrategy$UpperCamelCaseStrategy()>
		//    2    4:return          
		}
	}

	public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy
	{

		public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
		{
			return translate(s);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokevirtual   #16  <Method String translate(String)>
		//    3    5:areturn         
		}

		public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
		{
			return translate(s);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokevirtual   #16  <Method String translate(String)>
		//    3    5:areturn         
		}

		public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
		{
			return translate(s);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokevirtual   #16  <Method String translate(String)>
		//    3    5:areturn         
		}

		public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
		{
			return translate(s);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokevirtual   #16  <Method String translate(String)>
		//    3    5:areturn         
		}

		public abstract String translate(String s);

		public PropertyNamingStrategyBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void PropertyNamingStrategy()>
		//    2    4:return          
		}
	}

	public static class SnakeCaseStrategy extends PropertyNamingStrategyBase
	{

		public String translate(String s)
		{
			if(s != null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnonnull       6
_L1:
			return s;
		//    2    4:aload_1         
		//    3    5:areturn         
_L2:
			int j1 = s.length();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #20  <Method int String.length()>
		//    6   10:istore          8
			StringBuilder stringbuilder = new StringBuilder(j1 * 2);
		//    7   12:new             #22  <Class StringBuilder>
		//    8   15:dup             
		//    9   16:iload           8
		//   10   18:iconst_2        
		//   11   19:imul            
		//   12   20:invokespecial   #25  <Method void StringBuilder(int)>
		//   13   23:astore          9
			int i = 0;
		//   14   25:iconst_0        
		//   15   26:istore_3        
			int l = 0;
		//   16   27:iconst_0        
		//   17   28:istore          6
			int k = 0;
		//   18   30:iconst_0        
		//   19   31:istore          5
			while(k < j1) 
		//*  20   33:iload           5
		//*  21   35:iload           8
		//*  22   37:icmpge          167
			{
label0:
				{
					char c = s.charAt(k);
		//   23   40:aload_1         
		//   24   41:iload           5
		//   25   43:invokevirtual   #29  <Method char String.charAt(int)>
		//   26   46:istore_2        
					int j;
					int i1;
					if(k <= 0)
		//*  27   47:iload           5
		//*  28   49:ifgt            65
					{
						i1 = i;
		//   29   52:iload_3         
		//   30   53:istore          7
						j = l;
		//   31   55:iload           6
		//   32   57:istore          4
						if(c == '_')
							break label0;
		//   33   59:iload_2         
		//   34   60:bipush          95
		//   35   62:icmpeq          139
					}
					if(Character.isUpperCase(c))
		//*  36   65:iload_2         
		//*  37   66:invokestatic    #35  <Method boolean Character.isUpperCase(char)>
		//*  38   69:ifeq            155
					{
						j = i;
		//   39   72:iload_3         
		//   40   73:istore          4
						if(l == 0)
		//*  41   75:iload           6
		//*  42   77:ifne            116
						{
							j = i;
		//   43   80:iload_3         
		//   44   81:istore          4
							if(i > 0)
		//*  45   83:iload_3         
		//*  46   84:ifle            116
							{
								j = i;
		//   47   87:iload_3         
		//   48   88:istore          4
								if(stringbuilder.charAt(i - 1) != '_')
		//*  49   90:aload           9
		//*  50   92:iload_3         
		//*  51   93:iconst_1        
		//*  52   94:isub            
		//*  53   95:invokevirtual   #36  <Method char StringBuilder.charAt(int)>
		//*  54   98:bipush          95
		//*  55  100:icmpeq          116
								{
									stringbuilder.append('_');
		//   56  103:aload           9
		//   57  105:bipush          95
		//   58  107:invokevirtual   #40  <Method StringBuilder StringBuilder.append(char)>
		//   59  110:pop             
									j = i + 1;
		//   60  111:iload_3         
		//   61  112:iconst_1        
		//   62  113:iadd            
		//   63  114:istore          4
								}
							}
						}
						c = Character.toLowerCase(c);
		//   64  116:iload_2         
		//   65  117:invokestatic    #44  <Method char Character.toLowerCase(char)>
		//   66  120:istore_2        
						i = 1;
		//   67  121:iconst_1        
		//   68  122:istore_3        
					} else
		//*  69  123:aload           9
		//*  70  125:iload_2         
		//*  71  126:invokevirtual   #40  <Method StringBuilder StringBuilder.append(char)>
		//*  72  129:pop             
		//*  73  130:iload           4
		//*  74  132:iconst_1        
		//*  75  133:iadd            
		//*  76  134:istore          7
		//*  77  136:iload_3         
		//*  78  137:istore          4
		//*  79  139:iload           5
		//*  80  141:iconst_1        
		//*  81  142:iadd            
		//*  82  143:istore          5
		//*  83  145:iload           7
		//*  84  147:istore_3        
		//*  85  148:iload           4
		//*  86  150:istore          6
		//*  87  152:goto            33
					{
						boolean flag = false;
		//   88  155:iconst_0        
		//   89  156:istore          6
						j = i;
		//   90  158:iload_3         
		//   91  159:istore          4
						i = ((int) (flag));
		//   92  161:iload           6
		//   93  163:istore_3        
					}
					stringbuilder.append(c);
					i1 = j + 1;
					j = i;
				}
				k++;
				i = i1;
				l = j;
			}
		//*  94  164:goto            123
			if(i > 0)
		//*  95  167:iload_3         
		//*  96  168:ifle            4
				return stringbuilder.toString();
		//   97  171:aload           9
		//   98  173:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   99  176:areturn         
			if(true) goto _L1; else goto _L3
_L3:
		}

		public SnakeCaseStrategy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
		//    2    4:return          
		}
	}

	public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase
	{

		public String translate(String s)
		{
			if(s != null && s.length() != 0)
		//*   0    0:aload_1         
		//*   1    1:ifnull          11
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #20  <Method int String.length()>
		//*   4    8:ifne            13
		//*   5   11:aload_1         
		//*   6   12:areturn         
			{
				char c = s.charAt(0);
		//    7   13:aload_1         
		//    8   14:iconst_0        
		//    9   15:invokevirtual   #24  <Method char String.charAt(int)>
		//   10   18:istore_2        
				char c1 = Character.toUpperCase(c);
		//   11   19:iload_2         
		//   12   20:invokestatic    #30  <Method char Character.toUpperCase(char)>
		//   13   23:istore_3        
				if(c != c1)
		//*  14   24:iload_2         
		//*  15   25:iload_3         
		//*  16   26:icmpeq          11
				{
					s = ((String) (new StringBuilder(s)));
		//   17   29:new             #32  <Class StringBuilder>
		//   18   32:dup             
		//   19   33:aload_1         
		//   20   34:invokespecial   #35  <Method void StringBuilder(String)>
		//   21   37:astore_1        
					((StringBuilder) (s)).setCharAt(0, c1);
		//   22   38:aload_1         
		//   23   39:iconst_0        
		//   24   40:iload_3         
		//   25   41:invokevirtual   #39  <Method void StringBuilder.setCharAt(int, char)>
					return ((StringBuilder) (s)).toString();
		//   26   44:aload_1         
		//   27   45:invokevirtual   #43  <Method String StringBuilder.toString()>
		//   28   48:areturn         
				}
			}
			return s;
		}

		public UpperCamelCaseStrategy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
		//    2    4:return          
		}
	}


	public PropertyNamingStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
	//    2    4:return          
	}

	public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
	{
		return s;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
	{
		return s;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
	{
		return s;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
	{
		return s;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES;
	public static final PropertyNamingStrategy KEBAB_CASE = new KebabCaseStrategy();
	public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new PropertyNamingStrategy();
	public static final PropertyNamingStrategy LOWER_CASE = new LowerCaseStrategy();
	public static final PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE;
	public static final PropertyNamingStrategy SNAKE_CASE;
	public static final PropertyNamingStrategy UPPER_CAMEL_CASE;

	static 
	{
		SNAKE_CASE = ((PropertyNamingStrategy) (new SnakeCaseStrategy()));
	//    0    0:new             #23  <Class PropertyNamingStrategy$SnakeCaseStrategy>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void PropertyNamingStrategy$SnakeCaseStrategy()>
	//    3    7:putstatic       #43  <Field PropertyNamingStrategy SNAKE_CASE>
		UPPER_CAMEL_CASE = ((PropertyNamingStrategy) (new UpperCamelCaseStrategy()));
	//    4   10:new             #26  <Class PropertyNamingStrategy$UpperCamelCaseStrategy>
	//    5   13:dup             
	//    6   14:invokespecial   #44  <Method void PropertyNamingStrategy$UpperCamelCaseStrategy()>
	//    7   17:putstatic       #46  <Field PropertyNamingStrategy UPPER_CAMEL_CASE>
	//    8   20:new             #2   <Class PropertyNamingStrategy>
	//    9   23:dup             
	//   10   24:invokespecial   #47  <Method void PropertyNamingStrategy()>
	//   11   27:putstatic       #49  <Field PropertyNamingStrategy LOWER_CAMEL_CASE>
	//   12   30:new             #11  <Class PropertyNamingStrategy$LowerCaseStrategy>
	//   13   33:dup             
	//   14   34:invokespecial   #50  <Method void PropertyNamingStrategy$LowerCaseStrategy()>
	//   15   37:putstatic       #52  <Field PropertyNamingStrategy LOWER_CASE>
	//   16   40:new             #8   <Class PropertyNamingStrategy$KebabCaseStrategy>
	//   17   43:dup             
	//   18   44:invokespecial   #53  <Method void PropertyNamingStrategy$KebabCaseStrategy()>
	//   19   47:putstatic       #55  <Field PropertyNamingStrategy KEBAB_CASE>
		CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = SNAKE_CASE;
	//   20   50:getstatic       #43  <Field PropertyNamingStrategy SNAKE_CASE>
	//   21   53:putstatic       #57  <Field PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES>
		PASCAL_CASE_TO_CAMEL_CASE = UPPER_CAMEL_CASE;
	//   22   56:getstatic       #46  <Field PropertyNamingStrategy UPPER_CAMEL_CASE>
	//   23   59:putstatic       #59  <Field PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE>
	//*  24   62:return          
	}
}
