// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.org.checkerframework.checker.formatter;

import afu.org.checkerframework.checker.formatter.qual.ConversionCategory;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtil
{
	private static class Conversion
	{

		ConversionCategory category()
		{
			return cath;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field ConversionCategory cath>
		//    2    4:areturn         
		}

		int index()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int index>
		//    2    4:ireturn         
		}

		private final ConversionCategory cath;
		private final int index;

		public Conversion(char c, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #18  <Field int index>
			cath = ConversionCategory.fromConversionChar(c);
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokestatic    #24  <Method ConversionCategory ConversionCategory.fromConversionChar(char)>
		//    8   14:putfield        #26  <Field ConversionCategory cath>
		//    9   17:return          
		}
	}

	public static class ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException
	{

		public int getExpected()
		{
			return expected;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int expected>
		//    2    4:ireturn         
		}

		public int getFound()
		{
			return found;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int found>
		//    2    4:ireturn         
		}

		public String getMessage()
		{
			return String.format("Expected %d arguments but found %d.", new Object[] {
				Integer.valueOf(expected), Integer.valueOf(found)
			});
		//    0    0:ldc1            #33  <String "Expected %d arguments but found %d.">
		//    1    2:iconst_2        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #23  <Field int expected>
		//    7   12:invokestatic    #41  <Method Integer Integer.valueOf(int)>
		//    8   15:aastore         
		//    9   16:dup             
		//   10   17:iconst_1        
		//   11   18:aload_0         
		//   12   19:getfield        #25  <Field int found>
		//   13   22:invokestatic    #41  <Method Integer Integer.valueOf(int)>
		//   14   25:aastore         
		//   15   26:invokestatic    #47  <Method String String.format(String, Object[])>
		//   16   29:areturn         
		}

		private static final long serialVersionUID = 0x10366beL;
		private final int expected;
		private final int found;

		public ExcessiveOrMissingFormatArgumentException(int i, int j)
		{
			super("-");
		//    0    0:aload_0         
		//    1    1:ldc1            #18  <String "-">
		//    2    3:invokespecial   #21  <Method void MissingFormatArgumentException(String)>
			expected = i;
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:putfield        #23  <Field int expected>
			found = j;
		//    6   11:aload_0         
		//    7   12:iload_2         
		//    8   13:putfield        #25  <Field int found>
		//    9   16:return          
		}
	}

	public static class IllegalFormatConversionCategoryException extends IllegalFormatConversionException
	{

		public ConversionCategory getExpected()
		{
			return expected;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field ConversionCategory expected>
		//    2    4:areturn         
		}

		public ConversionCategory getFound()
		{
			return found;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field ConversionCategory found>
		//    2    4:areturn         
		}

		public String getMessage()
		{
			return String.format("Expected category %s but found %s.", new Object[] {
				expected, found
			});
		//    0    0:ldc1            #53  <String "Expected category %s but found %s.">
		//    1    2:iconst_2        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #43  <Field ConversionCategory expected>
		//    7   12:aastore         
		//    8   13:dup             
		//    9   14:iconst_1        
		//   10   15:aload_0         
		//   11   16:getfield        #45  <Field ConversionCategory found>
		//   12   19:aastore         
		//   13   20:invokestatic    #57  <Method String String.format(String, Object[])>
		//   14   23:areturn         
		}

		private static final long serialVersionUID = 0x10366beL;
		private final ConversionCategory expected;
		private final ConversionCategory found;

		public IllegalFormatConversionCategoryException(ConversionCategory conversioncategory, ConversionCategory conversioncategory1)
		{
			char c;
			if(conversioncategory.chars.length() == 0)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field String ConversionCategory.chars>
		//*   2    4:invokevirtual   #28  <Method int String.length()>
		//*   3    7:ifne            16
				c = '-';
		//    4   10:bipush          45
		//    5   12:istore_3        
			else
		//*   6   13:goto            25
				c = conversioncategory.chars.charAt(0);
		//    7   16:aload_1         
		//    8   17:getfield        #22  <Field String ConversionCategory.chars>
		//    9   20:iconst_0        
		//   10   21:invokevirtual   #32  <Method char String.charAt(int)>
		//   11   24:istore_3        
			Object obj;
			if(conversioncategory1.types == null)
		//*  12   25:aload_2         
		//*  13   26:getfield        #36  <Field Class[] ConversionCategory.types>
		//*  14   29:ifnonnull       39
				obj = java/lang/Object;
		//   15   32:ldc1            #38  <Class Object>
		//   16   34:astore          4
			else
		//*  17   36:goto            47
				obj = ((Object) (conversioncategory1.types[0]));
		//   18   39:aload_2         
		//   19   40:getfield        #36  <Field Class[] ConversionCategory.types>
		//   20   43:iconst_0        
		//   21   44:aaload          
		//   22   45:astore          4
			super(c, ((Class) (obj)));
		//   23   47:aload_0         
		//   24   48:iload_3         
		//   25   49:aload           4
		//   26   51:invokespecial   #41  <Method void IllegalFormatConversionException(char, Class)>
			expected = conversioncategory;
		//   27   54:aload_0         
		//   28   55:aload_1         
		//   29   56:putfield        #43  <Field ConversionCategory expected>
			found = conversioncategory1;
		//   30   59:aload_0         
		//   31   60:aload_2         
		//   32   61:putfield        #45  <Field ConversionCategory found>
		//   33   64:return          
		}
	}


	public FormatUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static transient String asFormat(String s, ConversionCategory aconversioncategory[])
		throws IllegalFormatException
	{
		ConversionCategory aconversioncategory1[] = formatParameterCategories(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #42  <Method ConversionCategory[] formatParameterCategories(String)>
	//    2    4:astore_3        
		if(aconversioncategory1.length == aconversioncategory.length)
	//*   3    5:aload_3         
	//*   4    6:arraylength     
	//*   5    7:aload_1         
	//*   6    8:arraylength     
	//*   7    9:icmpne          52
		{
			for(int i = 0; i < aconversioncategory.length;)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:aload_1         
	//*  12   16:arraylength     
	//*  13   17:icmpge          50
				if(aconversioncategory[i] == aconversioncategory1[i])
	//*  14   20:aload_1         
	//*  15   21:iload_2         
	//*  16   22:aaload          
	//*  17   23:aload_3         
	//*  18   24:iload_2         
	//*  19   25:aaload          
	//*  20   26:if_acmpne       36
					i++;
	//   21   29:iload_2         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_2        
				else
	//*  25   33:goto            14
					throw new IllegalFormatConversionCategoryException(aconversioncategory[i], aconversioncategory1[i]);
	//   26   36:new             #12  <Class FormatUtil$IllegalFormatConversionCategoryException>
	//   27   39:dup             
	//   28   40:aload_1         
	//   29   41:iload_2         
	//   30   42:aaload          
	//   31   43:aload_3         
	//   32   44:iload_2         
	//   33   45:aaload          
	//   34   46:invokespecial   #45  <Method void FormatUtil$IllegalFormatConversionCategoryException(ConversionCategory, ConversionCategory)>
	//   35   49:athrow          

			return s;
	//   36   50:aload_0         
	//   37   51:areturn         
		} else
		{
			throw new ExcessiveOrMissingFormatArgumentException(aconversioncategory.length, aconversioncategory1.length);
	//   38   52:new             #9   <Class FormatUtil$ExcessiveOrMissingFormatArgumentException>
	//   39   55:dup             
	//   40   56:aload_1         
	//   41   57:arraylength     
	//   42   58:aload_3         
	//   43   59:arraylength     
	//   44   60:invokespecial   #48  <Method void FormatUtil$ExcessiveOrMissingFormatArgumentException(int, int)>
	//   45   63:athrow          
		}
	}

	private static char conversionCharFromFormat(Matcher matcher)
	{
		String s = matcher.group(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokevirtual   #58  <Method String Matcher.group(int)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       21
			return matcher.group(6).charAt(0);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:invokevirtual   #58  <Method String Matcher.group(int)>
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #64  <Method char String.charAt(int)>
	//   11   20:ireturn         
		else
			return s.charAt(0);
	//   12   21:aload_1         
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #64  <Method char String.charAt(int)>
	//   15   26:ireturn         
	}

	public static ConversionCategory[] formatParameterCategories(String s)
		throws IllegalFormatException
	{
		tryFormatSatisfiability(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method void tryFormatSatisfiability(String)>
		Object aobj[] = ((Object []) (parse(s)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #72  <Method FormatUtil$Conversion[] parse(String)>
	//    4    8:astore          11
		HashMap hashmap = new HashMap();
	//    5   10:new             #74  <Class HashMap>
	//    6   13:dup             
	//    7   14:invokespecial   #75  <Method void HashMap()>
	//    8   17:astore          10
		int i2 = aobj.length;
	//    9   19:aload           11
	//   10   21:arraylength     
	//   11   22:istore          8
		boolean flag = false;
	//   12   24:iconst_0        
	//   13   25:istore          7
		int l = -1;
	//   14   27:iconst_m1       
	//   15   28:istore_2        
		int i = l;
	//   16   29:iload_2         
	//   17   30:istore_1        
		int l1 = i;
	//   18   31:iload_1         
	//   19   32:istore          6
		int i1 = 0;
	//   20   34:iconst_0        
	//   21   35:istore_3        
		int j1 = i;
	//   22   36:iload_1         
	//   23   37:istore          4
		while(i1 < i2) 
	//*  24   39:iload_3         
	//*  25   40:iload           8
	//*  26   42:icmpge          186
		{
			Conversion conversion = aobj[i1];
	//   27   45:aload           11
	//   28   47:iload_3         
	//   29   48:aaload          
	//   30   49:astore          12
			int j2 = conversion.index();
	//   31   51:aload           12
	//   32   53:invokevirtual   #79  <Method int FormatUtil$Conversion.index()>
	//   33   56:istore          9
			int k1 = j1;
	//   34   58:iload           4
	//   35   60:istore          5
			int j = l1;
	//   36   62:iload           6
	//   37   64:istore_1        
			switch(j2)
	//*  38   65:iload           9
			{
	//*  39   67:tableswitch     -1 0: default 88
	//	               -1 109
	//	               0 100
			default:
				j = j2 - 1;
	//   40   88:iload           9
	//   41   90:iconst_1        
	//   42   91:isub            
	//   43   92:istore_1        
				k1 = j1;
	//   44   93:iload           4
	//   45   95:istore          5
				break;

	//*  46   97:goto            109
			case 0: // '\0'
				k1 = j1 + 1;
	//   47  100:iload           4
	//   48  102:iconst_1        
	//   49  103:iadd            
	//   50  104:istore          5
				j = k1;
	//   51  106:iload           5
	//   52  108:istore_1        
				break;

			case -1: 
				break;
			}
			l = Math.max(l, j);
	//   53  109:iload_2         
	//   54  110:iload_1         
	//   55  111:invokestatic    #85  <Method int Math.max(int, int)>
	//   56  114:istore_2        
			if(((Map) (hashmap)).containsKey(((Object) (Integer.valueOf(j)))))
	//*  57  115:aload           10
	//*  58  117:iload_1         
	//*  59  118:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//*  60  121:invokeinterface #97  <Method boolean Map.containsKey(Object)>
	//*  61  126:ifeq            147
				s = ((String) ((ConversionCategory)((Map) (hashmap)).get(((Object) (Integer.valueOf(j))))));
	//   62  129:aload           10
	//   63  131:iload_1         
	//   64  132:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//   65  135:invokeinterface #101 <Method Object Map.get(Object)>
	//   66  140:checkcast       #103 <Class ConversionCategory>
	//   67  143:astore_0        
			else
	//*  68  144:goto            151
				s = ((String) (ConversionCategory.UNUSED));
	//   69  147:getstatic       #107 <Field ConversionCategory ConversionCategory.UNUSED>
	//   70  150:astore_0        
			((Map) (hashmap)).put(((Object) (Integer.valueOf(j))), ((Object) (ConversionCategory.intersect(((ConversionCategory) (s)), conversion.category()))));
	//   71  151:aload           10
	//   72  153:iload_1         
	//   73  154:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//   74  157:aload_0         
	//   75  158:aload           12
	//   76  160:invokevirtual   #111 <Method ConversionCategory FormatUtil$Conversion.category()>
	//   77  163:invokestatic    #115 <Method ConversionCategory ConversionCategory.intersect(ConversionCategory, ConversionCategory)>
	//   78  166:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//   79  171:pop             
			i1++;
	//   80  172:iload_3         
	//   81  173:iconst_1        
	//   82  174:iadd            
	//   83  175:istore_3        
			j1 = k1;
	//   84  176:iload           5
	//   85  178:istore          4
			l1 = j;
	//   86  180:iload_1         
	//   87  181:istore          6
		}
	//*  88  183:goto            39
		aobj = ((Object []) (new ConversionCategory[l + 1]));
	//   89  186:iload_2         
	//   90  187:iconst_1        
	//   91  188:iadd            
	//   92  189:anewarray       ConversionCategory[]
	//   93  192:astore          11
		for(int k = ((int) (flag)); k <= l; k++)
	//*  94  194:iload           7
	//*  95  196:istore_1        
	//*  96  197:iload_1         
	//*  97  198:iload_2         
	//*  98  199:icmpgt          250
		{
			if(((Map) (hashmap)).containsKey(((Object) (Integer.valueOf(k)))))
	//*  99  202:aload           10
	//* 100  204:iload_1         
	//* 101  205:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//* 102  208:invokeinterface #97  <Method boolean Map.containsKey(Object)>
	//* 103  213:ifeq            234
				s = ((String) ((ConversionCategory)((Map) (hashmap)).get(((Object) (Integer.valueOf(k))))));
	//  104  216:aload           10
	//  105  218:iload_1         
	//  106  219:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//  107  222:invokeinterface #101 <Method Object Map.get(Object)>
	//  108  227:checkcast       #103 <Class ConversionCategory>
	//  109  230:astore_0        
			else
	//* 110  231:goto            238
				s = ((String) (ConversionCategory.UNUSED));
	//  111  234:getstatic       #107 <Field ConversionCategory ConversionCategory.UNUSED>
	//  112  237:astore_0        
			aobj[k] = ((ConversionCategory) (s));
	//  113  238:aload           11
	//  114  240:iload_1         
	//  115  241:aload_0         
	//  116  242:aastore         
		}

	//  117  243:iload_1         
	//  118  244:iconst_1        
	//  119  245:iadd            
	//  120  246:istore_1        
	//* 121  247:goto            197
		return ((ConversionCategory []) (aobj));
	//  122  250:aload           11
	//  123  252:areturn         
	}

	private static int indexFromFormat(Matcher matcher)
	{
		String s = matcher.group(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #58  <Method String Matcher.group(int)>
	//    3    5:astore_3        
		boolean flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		if(s != null)
	//*   6    8:aload_3         
	//*   7    9:ifnull          27
			return Integer.parseInt(s.substring(0, s.length() - 1));
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:aload_3         
	//   11   15:invokevirtual   #124 <Method int String.length()>
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:invokevirtual   #128 <Method String String.substring(int, int)>
	//   15   23:invokestatic    #132 <Method int Integer.parseInt(String)>
	//   16   26:ireturn         
		byte byte0 = ((byte) (flag));
	//   17   27:iload_2         
	//   18   28:istore_1        
		if(matcher.group(2) != null)
	//*  19   29:aload_0         
	//*  20   30:iconst_2        
	//*  21   31:invokevirtual   #58  <Method String Matcher.group(int)>
	//*  22   34:ifnull          57
		{
			byte0 = ((byte) (flag));
	//   23   37:iload_2         
	//   24   38:istore_1        
			if(matcher.group(2).contains(((CharSequence) (String.valueOf('<')))))
	//*  25   39:aload_0         
	//*  26   40:iconst_2        
	//*  27   41:invokevirtual   #58  <Method String Matcher.group(int)>
	//*  28   44:bipush          60
	//*  29   46:invokestatic    #135 <Method String String.valueOf(char)>
	//*  30   49:invokevirtual   #139 <Method boolean String.contains(CharSequence)>
	//*  31   52:ifeq            57
				byte0 = -1;
	//   32   55:iconst_m1       
	//   33   56:istore_1        
		}
		return ((int) (byte0));
	//   34   57:iload_1         
	//   35   58:ireturn         
	}

	private static Conversion[] parse(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #141 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void ArrayList()>
	//    3    7:astore_2        
		s = ((String) (fsPattern.matcher(((CharSequence) (s)))));
	//    4    8:getstatic       #29  <Field Pattern fsPattern>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #146 <Method Matcher Pattern.matcher(CharSequence)>
	//    7   15:astore_0        
		do
		{
			if(!((Matcher) (s)).find())
				break;
	//    8   16:aload_0         
	//    9   17:invokevirtual   #150 <Method boolean Matcher.find()>
	//   10   20:ifeq            60
			char c = conversionCharFromFormat(((Matcher) (s)));
	//   11   23:aload_0         
	//   12   24:invokestatic    #152 <Method char conversionCharFromFormat(Matcher)>
	//   13   27:istore_1        
			if(c != '%' && c != 'n')
	//*  14   28:iload_1         
	//*  15   29:bipush          37
	//*  16   31:icmpeq          16
	//*  17   34:iload_1         
	//*  18   35:bipush          110
	//*  19   37:icmpeq          16
				arraylist.add(((Object) (new Conversion(c, indexFromFormat(((Matcher) (s)))))));
	//   20   40:aload_2         
	//   21   41:new             #6   <Class FormatUtil$Conversion>
	//   22   44:dup             
	//   23   45:iload_1         
	//   24   46:aload_0         
	//   25   47:invokestatic    #154 <Method int indexFromFormat(Matcher)>
	//   26   50:invokespecial   #157 <Method void FormatUtil$Conversion(char, int)>
	//   27   53:invokevirtual   #160 <Method boolean ArrayList.add(Object)>
	//   28   56:pop             
		} while(true);
	//   29   57:goto            16
		return (Conversion[])arraylist.toArray(((Object []) (new Conversion[arraylist.size()])));
	//   30   60:aload_2         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #163 <Method int ArrayList.size()>
	//   33   65:anewarray       Conversion[]
	//   34   68:invokevirtual   #167 <Method Object[] ArrayList.toArray(Object[])>
	//   35   71:checkcast       #169 <Class FormatUtil$Conversion[]>
	//   36   74:areturn         
	}

	public static void tryFormatSatisfiability(String s)
		throws IllegalFormatException
	{
		String.format(s, (Object[])null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #171 <Class Object[]>
	//    3    5:invokestatic    #175 <Method String String.format(String, Object[])>
	//    4    8:pop             
	//    5    9:return          
	}

	private static final String formatSpecifier = "%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])";
	private static Pattern fsPattern = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");

	static 
	{
	//    0    0:ldc1            #17  <String "%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])">
	//    1    2:invokestatic    #27  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #29  <Field Pattern fsPattern>
	//*   3    8:return          
	}
}
