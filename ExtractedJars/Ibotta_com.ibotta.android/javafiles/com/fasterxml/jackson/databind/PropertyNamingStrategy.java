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
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return s;
		//    2    4:aload_1         
		//    3    5:areturn         
			int k = s.length();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #20  <Method int String.length()>
		//    6   10:istore          6
			if(k == 0)
		//*   7   12:iload           6
		//*   8   14:ifne            19
				return s;
		//    9   17:aload_1         
		//   10   18:areturn         
			StringBuilder stringbuilder = new StringBuilder((k >> 1) + k);
		//   11   19:new             #22  <Class StringBuilder>
		//   12   22:dup             
		//   13   23:iload           6
		//   14   25:iconst_1        
		//   15   26:ishr            
		//   16   27:iload           6
		//   17   29:iadd            
		//   18   30:invokespecial   #25  <Method void StringBuilder(int)>
		//   19   33:astore          7
			int j = 0;
		//   20   35:iconst_0        
		//   21   36:istore          5
			int i = 0;
		//   22   38:iconst_0        
		//   23   39:istore          4
			for(; j < k; j++)
		//*  24   41:iload           5
		//*  25   43:iload           6
		//*  26   45:icmpge          132
			{
				char c = s.charAt(j);
		//   27   48:aload_1         
		//   28   49:iload           5
		//   29   51:invokevirtual   #29  <Method char String.charAt(int)>
		//   30   54:istore_2        
				char c1 = Character.toLowerCase(c);
		//   31   55:iload_2         
		//   32   56:invokestatic    #35  <Method char Character.toLowerCase(char)>
		//   33   59:istore_3        
				if(c1 == c)
		//*  34   60:iload_3         
		//*  35   61:iload_2         
		//*  36   62:icmpne          92
				{
					if(i > 1)
		//*  37   65:iload           4
		//*  38   67:iconst_1        
		//*  39   68:icmple          86
						stringbuilder.insert(stringbuilder.length() - 1, '-');
		//   40   71:aload           7
		//   41   73:aload           7
		//   42   75:invokevirtual   #36  <Method int StringBuilder.length()>
		//   43   78:iconst_1        
		//   44   79:isub            
		//   45   80:bipush          45
		//   46   82:invokevirtual   #40  <Method StringBuilder StringBuilder.insert(int, char)>
		//   47   85:pop             
					i = 0;
		//   48   86:iconst_0        
		//   49   87:istore          4
				} else
		//*  50   89:goto            116
				{
					if(i == 0 && j > 0)
		//*  51   92:iload           4
		//*  52   94:ifne            110
		//*  53   97:iload           5
		//*  54   99:ifle            110
						stringbuilder.append('-');
		//   55  102:aload           7
		//   56  104:bipush          45
		//   57  106:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   58  109:pop             
					i++;
		//   59  110:iload           4
		//   60  112:iconst_1        
		//   61  113:iadd            
		//   62  114:istore          4
				}
				stringbuilder.append(c1);
		//   63  116:aload           7
		//   64  118:iload_3         
		//   65  119:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   66  122:pop             
			}

		//   67  123:iload           5
		//   68  125:iconst_1        
		//   69  126:iadd            
		//   70  127:istore          5
		//*  71  129:goto            41
			return stringbuilder.toString();
		//   72  132:aload           7
		//   73  134:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   74  137:areturn         
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
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return s;
		//    2    4:aload_1         
		//    3    5:areturn         
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
			int k = 0;
		//   14   25:iconst_0        
		//   15   26:istore          5
			int i = 0;
		//   16   28:iconst_0        
		//   17   29:istore_3        
			int j;
			for(int l = 0; k < j1; l = j)
		//*  18   30:iconst_0        
		//*  19   31:istore          6
		//*  20   33:iload           5
		//*  21   35:iload           8
		//*  22   37:icmpge          165
			{
				int i1;
label0:
				{
					char c = s.charAt(k);
		//   23   40:aload_1         
		//   24   41:iload           5
		//   25   43:invokevirtual   #29  <Method char String.charAt(int)>
		//   26   46:istore_2        
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
		//   35   62:icmpeq          149
					}
					if(Character.isUpperCase(c))
		//*  36   65:iload_2         
		//*  37   66:invokestatic    #35  <Method boolean Character.isUpperCase(char)>
		//*  38   69:ifeq            134
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
						l = 1;
		//   67  121:iconst_1        
		//   68  122:istore          6
						i = j;
		//   69  124:iload           4
		//   70  126:istore_3        
						j = l;
		//   71  127:iload           6
		//   72  129:istore          4
					} else
		//*  73  131:goto            137
					{
						j = 0;
		//   74  134:iconst_0        
		//   75  135:istore          4
					}
					stringbuilder.append(c);
		//   76  137:aload           9
		//   77  139:iload_2         
		//   78  140:invokevirtual   #40  <Method StringBuilder StringBuilder.append(char)>
		//   79  143:pop             
					i1 = i + 1;
		//   80  144:iload_3         
		//   81  145:iconst_1        
		//   82  146:iadd            
		//   83  147:istore          7
				}
				k++;
		//   84  149:iload           5
		//   85  151:iconst_1        
		//   86  152:iadd            
		//   87  153:istore          5
				i = i1;
		//   88  155:iload           7
		//   89  157:istore_3        
			}

		//   90  158:iload           4
		//   91  160:istore          6
		//*  92  162:goto            33
			if(i > 0)
		//*  93  165:iload_3         
		//*  94  166:ifle            175
				s = stringbuilder.toString();
		//   95  169:aload           9
		//   96  171:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   97  174:astore_1        
			return s;
		//   98  175:aload_1         
		//   99  176:areturn         
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
			if(s != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          51
			{
				if(s.length() == 0)
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #20  <Method int String.length()>
		//*   4    8:ifne            13
					return s;
		//    5   11:aload_1         
		//    6   12:areturn         
				char c = s.charAt(0);
		//    7   13:aload_1         
		//    8   14:iconst_0        
		//    9   15:invokevirtual   #24  <Method char String.charAt(int)>
		//   10   18:istore_2        
				char c1 = Character.toUpperCase(c);
		//   11   19:iload_2         
		//   12   20:invokestatic    #30  <Method char Character.toUpperCase(char)>
		//   13   23:istore_3        
				if(c == c1)
		//*  14   24:iload_2         
		//*  15   25:iload_3         
		//*  16   26:icmpne          31
				{
					return s;
		//   17   29:aload_1         
		//   18   30:areturn         
				} else
				{
					s = ((String) (new StringBuilder(s)));
		//   19   31:new             #32  <Class StringBuilder>
		//   20   34:dup             
		//   21   35:aload_1         
		//   22   36:invokespecial   #35  <Method void StringBuilder(String)>
		//   23   39:astore_1        
					((StringBuilder) (s)).setCharAt(0, c1);
		//   24   40:aload_1         
		//   25   41:iconst_0        
		//   26   42:iload_3         
		//   27   43:invokevirtual   #39  <Method void StringBuilder.setCharAt(int, char)>
					return ((StringBuilder) (s)).toString();
		//   28   46:aload_1         
		//   29   47:invokevirtual   #43  <Method String StringBuilder.toString()>
		//   30   50:areturn         
				}
			} else
			{
				return s;
		//   31   51:aload_1         
		//   32   52:areturn         
			}
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
	//    1    1:invokespecial   #55  <Method void Object()>
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
	//    0    0:new             #17  <Class PropertyNamingStrategy$SnakeCaseStrategy>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void PropertyNamingStrategy$SnakeCaseStrategy()>
	//    3    7:putstatic       #37  <Field PropertyNamingStrategy SNAKE_CASE>
		UPPER_CAMEL_CASE = ((PropertyNamingStrategy) (new UpperCamelCaseStrategy()));
	//    4   10:new             #20  <Class PropertyNamingStrategy$UpperCamelCaseStrategy>
	//    5   13:dup             
	//    6   14:invokespecial   #38  <Method void PropertyNamingStrategy$UpperCamelCaseStrategy()>
	//    7   17:putstatic       #40  <Field PropertyNamingStrategy UPPER_CAMEL_CASE>
	//    8   20:new             #2   <Class PropertyNamingStrategy>
	//    9   23:dup             
	//   10   24:invokespecial   #41  <Method void PropertyNamingStrategy()>
	//   11   27:putstatic       #43  <Field PropertyNamingStrategy LOWER_CAMEL_CASE>
	//   12   30:new             #11  <Class PropertyNamingStrategy$LowerCaseStrategy>
	//   13   33:dup             
	//   14   34:invokespecial   #44  <Method void PropertyNamingStrategy$LowerCaseStrategy()>
	//   15   37:putstatic       #46  <Field PropertyNamingStrategy LOWER_CASE>
	//   16   40:new             #8   <Class PropertyNamingStrategy$KebabCaseStrategy>
	//   17   43:dup             
	//   18   44:invokespecial   #47  <Method void PropertyNamingStrategy$KebabCaseStrategy()>
	//   19   47:putstatic       #49  <Field PropertyNamingStrategy KEBAB_CASE>
		CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = SNAKE_CASE;
	//   20   50:getstatic       #37  <Field PropertyNamingStrategy SNAKE_CASE>
	//   21   53:putstatic       #51  <Field PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES>
		PASCAL_CASE_TO_CAMEL_CASE = UPPER_CAMEL_CASE;
	//   22   56:getstatic       #40  <Field PropertyNamingStrategy UPPER_CAMEL_CASE>
	//   23   59:putstatic       #53  <Field PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE>
	//*  24   62:return          
	}
}
