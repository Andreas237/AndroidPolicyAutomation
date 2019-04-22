// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue

public interface JsonInclude
	extends Annotation
{
	public static final class Include extends Enum
	{

		public static Include valueOf(String s)
		{
			return (Include)Enum.valueOf(com/fasterxml/jackson/annotation/JsonInclude$Include, s);
		//    0    0:ldc1            #2   <Class JsonInclude$Include>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonInclude$Include>
		//    4    9:areturn         
		}

		public static Include[] values()
		{
			return (Include[])((Include []) ($VALUES)).clone();
		//    0    0:getstatic       #47  <Field JsonInclude$Include[] $VALUES>
		//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonInclude$Include_3B_.clone()>
		//    2    6:checkcast       #58  <Class JsonInclude$Include[]>
		//    3    9:areturn         
		}

		private static final Include $VALUES[];
		public static final Include ALWAYS;
		public static final Include CUSTOM;
		public static final Include NON_ABSENT;
		public static final Include NON_DEFAULT;
		public static final Include NON_EMPTY;
		public static final Include NON_NULL;
		public static final Include USE_DEFAULTS;

		static 
		{
			ALWAYS = new Include("ALWAYS", 0);
		//    0    0:new             #2   <Class JsonInclude$Include>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "ALWAYS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//    5   10:putstatic       #27  <Field JsonInclude$Include ALWAYS>
			NON_NULL = new Include("NON_NULL", 1);
		//    6   13:new             #2   <Class JsonInclude$Include>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "NON_NULL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//   11   23:putstatic       #30  <Field JsonInclude$Include NON_NULL>
			NON_ABSENT = new Include("NON_ABSENT", 2);
		//   12   26:new             #2   <Class JsonInclude$Include>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "NON_ABSENT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//   17   36:putstatic       #33  <Field JsonInclude$Include NON_ABSENT>
			NON_EMPTY = new Include("NON_EMPTY", 3);
		//   18   39:new             #2   <Class JsonInclude$Include>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "NON_EMPTY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//   23   49:putstatic       #36  <Field JsonInclude$Include NON_EMPTY>
			NON_DEFAULT = new Include("NON_DEFAULT", 4);
		//   24   52:new             #2   <Class JsonInclude$Include>
		//   25   55:dup             
		//   26   56:ldc1            #37  <String "NON_DEFAULT">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//   29   62:putstatic       #39  <Field JsonInclude$Include NON_DEFAULT>
			CUSTOM = new Include("CUSTOM", 5);
		//   30   65:new             #2   <Class JsonInclude$Include>
		//   31   68:dup             
		//   32   69:ldc1            #40  <String "CUSTOM">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//   35   75:putstatic       #42  <Field JsonInclude$Include CUSTOM>
			USE_DEFAULTS = new Include("USE_DEFAULTS", 6);
		//   36   78:new             #2   <Class JsonInclude$Include>
		//   37   81:dup             
		//   38   82:ldc1            #43  <String "USE_DEFAULTS">
		//   39   84:bipush          6
		//   40   86:invokespecial   #25  <Method void JsonInclude$Include(String, int)>
		//   41   89:putstatic       #45  <Field JsonInclude$Include USE_DEFAULTS>
			$VALUES = (new Include[] {
				ALWAYS, NON_NULL, NON_ABSENT, NON_EMPTY, NON_DEFAULT, CUSTOM, USE_DEFAULTS
			});
		//   42   92:bipush          7
		//   43   94:anewarray       Include[]
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

		private Include(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class Value
		implements JacksonAnnotationValue, Serializable
	{

		public static Value construct(Include include, Include include1)
		{
			if(include != Include.USE_DEFAULTS && include != null || include1 != Include.USE_DEFAULTS && include1 != null)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*   2    4:if_acmpeq       11
		//*   3    7:aload_0         
		//*   4    8:ifnonnull       25
		//*   5   11:aload_1         
		//*   6   12:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*   7   15:if_acmpeq       37
		//*   8   18:aload_1         
		//*   9   19:ifnonnull       25
		//*  10   22:goto            37
				return new Value(include, include1, ((Class) (null)), ((Class) (null)));
		//   11   25:new             #2   <Class JsonInclude$Value>
		//   12   28:dup             
		//   13   29:aload_0         
		//   14   30:aload_1         
		//   15   31:aconst_null     
		//   16   32:aconst_null     
		//   17   33:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   18   36:areturn         
			else
				return EMPTY;
		//   19   37:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//   20   40:areturn         
		}

		public static Value construct(Include include, Include include1, Class class1, Class class2)
		{
			Class class3 = class1;
		//    0    0:aload_2         
		//    1    1:astore          4
			if(class1 == java/lang/Void)
		//*   2    3:aload_2         
		//*   3    4:ldc1            #47  <Class Void>
		//*   4    6:if_acmpne       12
				class3 = null;
		//    5    9:aconst_null     
		//    6   10:astore          4
			class1 = class2;
		//    7   12:aload_3         
		//    8   13:astore_2        
			if(class2 == java/lang/Void)
		//*   9   14:aload_3         
		//*  10   15:ldc1            #47  <Class Void>
		//*  11   17:if_acmpne       22
				class1 = null;
		//   12   20:aconst_null     
		//   13   21:astore_2        
			if((include == Include.USE_DEFAULTS || include == null) && (include1 == Include.USE_DEFAULTS || include1 == null) && class3 == null && class1 == null)
		//*  14   22:aload_0         
		//*  15   23:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*  16   26:if_acmpeq       33
		//*  17   29:aload_0         
		//*  18   30:ifnonnull       57
		//*  19   33:aload_1         
		//*  20   34:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*  21   37:if_acmpeq       44
		//*  22   40:aload_1         
		//*  23   41:ifnonnull       57
		//*  24   44:aload           4
		//*  25   46:ifnonnull       57
		//*  26   49:aload_2         
		//*  27   50:ifnonnull       57
				return EMPTY;
		//   28   53:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//   29   56:areturn         
			else
				return new Value(include, include1, class3, class1);
		//   30   57:new             #2   <Class JsonInclude$Value>
		//   31   60:dup             
		//   32   61:aload_0         
		//   33   62:aload_1         
		//   34   63:aload           4
		//   35   65:aload_2         
		//   36   66:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   37   69:areturn         
		}

		public static Value empty()
		{
			return EMPTY;
		//    0    0:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//    1    3:areturn         
		}

		public static Value from(JsonInclude jsoninclude)
		{
			if(jsoninclude == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       8
				return EMPTY;
		//    2    4:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//    3    7:areturn         
			Include include = jsoninclude.value();
		//    4    8:aload_0         
		//    5    9:invokeinterface #65  <Method JsonInclude$Include JsonInclude.value()>
		//    6   14:astore_3        
			Include include1 = jsoninclude.content();
		//    7   15:aload_0         
		//    8   16:invokeinterface #68  <Method JsonInclude$Include JsonInclude.content()>
		//    9   21:astore          4
			if(include == Include.USE_DEFAULTS && include1 == Include.USE_DEFAULTS)
		//*  10   23:aload_3         
		//*  11   24:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*  12   27:if_acmpne       42
		//*  13   30:aload           4
		//*  14   32:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*  15   35:if_acmpne       42
				return EMPTY;
		//   16   38:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//   17   41:areturn         
			Class class2 = jsoninclude.valueFilter();
		//   18   42:aload_0         
		//   19   43:invokeinterface #72  <Method Class JsonInclude.valueFilter()>
		//   20   48:astore_2        
			Class class1 = class2;
		//   21   49:aload_2         
		//   22   50:astore_1        
			if(class2 == java/lang/Void)
		//*  23   51:aload_2         
		//*  24   52:ldc1            #47  <Class Void>
		//*  25   54:if_acmpne       59
				class1 = null;
		//   26   57:aconst_null     
		//   27   58:astore_1        
			class2 = jsoninclude.contentFilter();
		//   28   59:aload_0         
		//   29   60:invokeinterface #75  <Method Class JsonInclude.contentFilter()>
		//   30   65:astore_2        
			jsoninclude = ((JsonInclude) (class2));
		//   31   66:aload_2         
		//   32   67:astore_0        
			if(class2 == java/lang/Void)
		//*  33   68:aload_2         
		//*  34   69:ldc1            #47  <Class Void>
		//*  35   71:if_acmpne       76
				jsoninclude = null;
		//   36   74:aconst_null     
		//   37   75:astore_0        
			return new Value(include, include1, class1, ((Class) (jsoninclude)));
		//   38   76:new             #2   <Class JsonInclude$Value>
		//   39   79:dup             
		//   40   80:aload_3         
		//   41   81:aload           4
		//   42   83:aload_1         
		//   43   84:aload_0         
		//   44   85:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   45   88:areturn         
		}

		public static Value merge(Value value1, Value value2)
		{
			if(value1 == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return value2;
		//    2    4:aload_1         
		//    3    5:areturn         
			else
				return value1.withOverrides(value2);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #81  <Method JsonInclude$Value withOverrides(JsonInclude$Value)>
		//    7   11:areturn         
		}

		public static transient Value mergeAll(Value avalue[])
		{
			int j = avalue.length;
		//    0    0:aload_0         
		//    1    1:arraylength     
		//    2    2:istore_2        
			Value value1 = null;
		//    3    3:aconst_null     
		//    4    4:astore_3        
			for(int i = 0; i < j;)
		//*   5    5:iconst_0        
		//*   6    6:istore_1        
		//*   7    7:iload_1         
		//*   8    8:iload_2         
		//*   9    9:icmpge          55
			{
				Value value3 = avalue[i];
		//   10   12:aload_0         
		//   11   13:iload_1         
		//   12   14:aaload          
		//   13   15:astore          5
				Value value2 = value1;
		//   14   17:aload_3         
		//   15   18:astore          4
				if(value3 != null)
		//*  16   20:aload           5
		//*  17   22:ifnull          45
				{
					if(value1 == null)
		//*  18   25:aload_3         
		//*  19   26:ifnonnull       35
						value1 = value3;
		//   20   29:aload           5
		//   21   31:astore_3        
					else
		//*  22   32:goto            42
						value1 = value1.withOverrides(value3);
		//   23   35:aload_3         
		//   24   36:aload           5
		//   25   38:invokevirtual   #81  <Method JsonInclude$Value withOverrides(JsonInclude$Value)>
		//   26   41:astore_3        
					value2 = value1;
		//   27   42:aload_3         
		//   28   43:astore          4
				}
				i++;
		//   29   45:iload_1         
		//   30   46:iconst_1        
		//   31   47:iadd            
		//   32   48:istore_1        
				value1 = value2;
		//   33   49:aload           4
		//   34   51:astore_3        
			}

		//*  35   52:goto            7
			return value1;
		//   36   55:aload_3         
		//   37   56:areturn         
		}

		public boolean equals(Object obj)
		{
			if(obj == this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(obj.getClass() != ((Object)this).getClass())
		//*   9   13:aload_1         
		//*  10   14:invokevirtual   #88  <Method Class Object.getClass()>
		//*  11   17:aload_0         
		//*  12   18:invokevirtual   #88  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((Value)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class JsonInclude$Value>
		//   18   30:astore_1        
			return ((Value) (obj))._valueInclusion == _valueInclusion && ((Value) (obj))._contentInclusion == _contentInclusion && ((Value) (obj))._valueFilter == _valueFilter && ((Value) (obj))._contentFilter == _contentFilter;
		//   19   31:aload_1         
		//   20   32:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   21   35:aload_0         
		//   22   36:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   23   39:if_acmpne       77
		//   24   42:aload_1         
		//   25   43:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//   26   46:aload_0         
		//   27   47:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//   28   50:if_acmpne       77
		//   29   53:aload_1         
		//   30   54:getfield        #49  <Field Class _valueFilter>
		//   31   57:aload_0         
		//   32   58:getfield        #49  <Field Class _valueFilter>
		//   33   61:if_acmpne       77
		//   34   64:aload_1         
		//   35   65:getfield        #51  <Field Class _contentFilter>
		//   36   68:aload_0         
		//   37   69:getfield        #51  <Field Class _contentFilter>
		//   38   72:if_acmpne       77
		//   39   75:iconst_1        
		//   40   76:ireturn         
		//   41   77:iconst_0        
		//   42   78:ireturn         
		}

		public Class getContentFilter()
		{
			return _contentFilter;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Class _contentFilter>
		//    2    4:areturn         
		}

		public Include getContentInclusion()
		{
			return _contentInclusion;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//    2    4:areturn         
		}

		public Class getValueFilter()
		{
			return _valueFilter;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Class _valueFilter>
		//    2    4:areturn         
		}

		public Include getValueInclusion()
		{
			return _valueInclusion;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return (_valueInclusion.hashCode() << 2) + _contentInclusion.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//    2    4:invokevirtual   #97  <Method int JsonInclude$Include.hashCode()>
		//    3    7:iconst_2        
		//    4    8:ishl            
		//    5    9:aload_0         
		//    6   10:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//    7   13:invokevirtual   #97  <Method int JsonInclude$Include.hashCode()>
		//    8   16:iadd            
		//    9   17:ireturn         
		}

		protected Object readResolve()
		{
			if(_valueInclusion == Include.USE_DEFAULTS && _contentInclusion == Include.USE_DEFAULTS && _valueFilter == null && _contentFilter == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//*   2    4:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*   3    7:if_acmpne       38
		//*   4   10:aload_0         
		//*   5   11:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//*   6   14:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*   7   17:if_acmpne       38
		//*   8   20:aload_0         
		//*   9   21:getfield        #49  <Field Class _valueFilter>
		//*  10   24:ifnonnull       38
		//*  11   27:aload_0         
		//*  12   28:getfield        #51  <Field Class _contentFilter>
		//*  13   31:ifnonnull       38
				return ((Object) (EMPTY));
		//   14   34:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//   15   37:areturn         
			else
				return ((Object) (this));
		//   16   38:aload_0         
		//   17   39:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(80);
		//    0    0:new             #103 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:bipush          80
		//    3    6:invokespecial   #106 <Method void StringBuilder(int)>
		//    4    9:astore_1        
			stringbuilder.append("JsonInclude.Value(value=");
		//    5   10:aload_1         
		//    6   11:ldc1            #108 <String "JsonInclude.Value(value=">
		//    7   13:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(((Object) (_valueInclusion)));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   12   22:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
		//   13   25:pop             
			stringbuilder.append(",content=");
		//   14   26:aload_1         
		//   15   27:ldc1            #117 <String ",content=">
		//   16   29:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
			stringbuilder.append(((Object) (_contentInclusion)));
		//   18   33:aload_1         
		//   19   34:aload_0         
		//   20   35:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//   21   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
		//   22   41:pop             
			if(_valueFilter != null)
		//*  23   42:aload_0         
		//*  24   43:getfield        #49  <Field Class _valueFilter>
		//*  25   46:ifnull          75
			{
				stringbuilder.append(",valueFilter=");
		//   26   49:aload_1         
		//   27   50:ldc1            #119 <String ",valueFilter=">
		//   28   52:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   29   55:pop             
				stringbuilder.append(_valueFilter.getName());
		//   30   56:aload_1         
		//   31   57:aload_0         
		//   32   58:getfield        #49  <Field Class _valueFilter>
		//   33   61:invokevirtual   #124 <Method String Class.getName()>
		//   34   64:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   35   67:pop             
				stringbuilder.append(".class");
		//   36   68:aload_1         
		//   37   69:ldc1            #126 <String ".class">
		//   38   71:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   39   74:pop             
			}
			if(_contentFilter != null)
		//*  40   75:aload_0         
		//*  41   76:getfield        #51  <Field Class _contentFilter>
		//*  42   79:ifnull          108
			{
				stringbuilder.append(",contentFilter=");
		//   43   82:aload_1         
		//   44   83:ldc1            #128 <String ",contentFilter=">
		//   45   85:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   46   88:pop             
				stringbuilder.append(_contentFilter.getName());
		//   47   89:aload_1         
		//   48   90:aload_0         
		//   49   91:getfield        #51  <Field Class _contentFilter>
		//   50   94:invokevirtual   #124 <Method String Class.getName()>
		//   51   97:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   52  100:pop             
				stringbuilder.append(".class");
		//   53  101:aload_1         
		//   54  102:ldc1            #126 <String ".class">
		//   55  104:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   56  107:pop             
			}
			stringbuilder.append(')');
		//   57  108:aload_1         
		//   58  109:bipush          41
		//   59  111:invokevirtual   #131 <Method StringBuilder StringBuilder.append(char)>
		//   60  114:pop             
			return stringbuilder.toString();
		//   61  115:aload_1         
		//   62  116:invokevirtual   #133 <Method String StringBuilder.toString()>
		//   63  119:areturn         
		}

		public Class valueFor()
		{
			return com/fasterxml/jackson/annotation/JsonInclude;
		//    0    0:ldc1            #11  <Class JsonInclude>
		//    1    2:areturn         
		}

		public Value withContentFilter(Class class1)
		{
			Include include;
			if(class1 != null && class1 != java/lang/Void)
		//*   0    0:aload_1         
		//*   1    1:ifnull          20
		//*   2    4:aload_1         
		//*   3    5:ldc1            #47  <Class Void>
		//*   4    7:if_acmpne       13
		//*   5   10:goto            20
			{
				include = Include.CUSTOM;
		//    6   13:getstatic       #140 <Field JsonInclude$Include JsonInclude$Include.CUSTOM>
		//    7   16:astore_2        
			} else
		//*   8   17:goto            26
			{
				include = Include.USE_DEFAULTS;
		//    9   20:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//   10   23:astore_2        
				class1 = null;
		//   11   24:aconst_null     
		//   12   25:astore_1        
			}
			return construct(_valueInclusion, include, _valueFilter, class1);
		//   13   26:aload_0         
		//   14   27:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   15   30:aload_2         
		//   16   31:aload_0         
		//   17   32:getfield        #49  <Field Class _valueFilter>
		//   18   35:aload_1         
		//   19   36:invokestatic    #142 <Method JsonInclude$Value construct(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   20   39:areturn         
		}

		public Value withContentInclusion(Include include)
		{
			if(include == _contentInclusion)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//*   3    5:if_acmpne       10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return new Value(_valueInclusion, include, _valueFilter, _contentFilter);
		//    6   10:new             #2   <Class JsonInclude$Value>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #49  <Field Class _valueFilter>
		//   13   23:aload_0         
		//   14   24:getfield        #51  <Field Class _contentFilter>
		//   15   27:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   16   30:areturn         
		}

		public Value withOverrides(Value value1)
		{
			if(value1 != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          211
			{
				if(value1 == EMPTY)
		//*   2    4:aload_1         
		//*   3    5:getstatic       #38  <Field JsonInclude$Value EMPTY>
		//*   4    8:if_acmpne       13
					return this;
		//    5   11:aload_0         
		//    6   12:areturn         
				Include include = value1._valueInclusion;
		//    7   13:aload_1         
		//    8   14:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//    9   17:astore          6
				Include include1 = value1._contentInclusion;
		//   10   19:aload_1         
		//   11   20:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//   12   23:astore          7
				Class class1 = value1._valueFilter;
		//   13   25:aload_1         
		//   14   26:getfield        #49  <Field Class _valueFilter>
		//   15   29:astore          8
				value1 = ((Value) (value1._contentFilter));
		//   16   31:aload_1         
		//   17   32:getfield        #51  <Field Class _contentFilter>
		//   18   35:astore_1        
				Object obj = ((Object) (_valueInclusion));
		//   19   36:aload_0         
		//   20   37:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   21   40:astore          9
				boolean flag3 = true;
		//   22   42:iconst_1        
		//   23   43:istore          5
				boolean flag;
				if(include != obj && include != Include.USE_DEFAULTS)
		//*  24   45:aload           6
		//*  25   47:aload           9
		//*  26   49:if_acmpeq       65
		//*  27   52:aload           6
		//*  28   54:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*  29   57:if_acmpeq       65
					flag = true;
		//   30   60:iconst_1        
		//   31   61:istore_2        
				else
		//*  32   62:goto            67
					flag = false;
		//   33   65:iconst_0        
		//   34   66:istore_2        
				boolean flag1;
				if(include1 != _contentInclusion && include1 != Include.USE_DEFAULTS)
		//*  35   67:aload           7
		//*  36   69:aload_0         
		//*  37   70:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//*  38   73:if_acmpeq       89
		//*  39   76:aload           7
		//*  40   78:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//*  41   81:if_acmpeq       89
					flag1 = true;
		//   42   84:iconst_1        
		//   43   85:istore_3        
				else
		//*  44   86:goto            91
					flag1 = false;
		//   45   89:iconst_0        
		//   46   90:istore_3        
				obj = ((Object) (_valueFilter));
		//   47   91:aload_0         
		//   48   92:getfield        #49  <Field Class _valueFilter>
		//   49   95:astore          9
				boolean flag2 = flag3;
		//   50   97:iload           5
		//   51   99:istore          4
				if(class1 == obj)
		//*  52  101:aload           8
		//*  53  103:aload           9
		//*  54  105:if_acmpne       124
					if(value1 != obj)
		//*  55  108:aload_1         
		//*  56  109:aload           9
		//*  57  111:if_acmpeq       121
						flag2 = flag3;
		//   58  114:iload           5
		//   59  116:istore          4
					else
		//*  60  118:goto            124
						flag2 = false;
		//   61  121:iconst_0        
		//   62  122:istore          4
				if(flag)
		//*  63  124:iload_2         
		//*  64  125:ifeq            164
					if(flag1)
		//*  65  128:iload_3         
		//*  66  129:ifeq            147
						return new Value(include, include1, class1, ((Class) (value1)));
		//   67  132:new             #2   <Class JsonInclude$Value>
		//   68  135:dup             
		//   69  136:aload           6
		//   70  138:aload           7
		//   71  140:aload           8
		//   72  142:aload_1         
		//   73  143:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   74  146:areturn         
					else
						return new Value(include, _contentInclusion, class1, ((Class) (value1)));
		//   75  147:new             #2   <Class JsonInclude$Value>
		//   76  150:dup             
		//   77  151:aload           6
		//   78  153:aload_0         
		//   79  154:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//   80  157:aload           8
		//   81  159:aload_1         
		//   82  160:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   83  163:areturn         
				if(flag1)
		//*  84  164:iload_3         
		//*  85  165:ifeq            185
					return new Value(_valueInclusion, include1, class1, ((Class) (value1)));
		//   86  168:new             #2   <Class JsonInclude$Value>
		//   87  171:dup             
		//   88  172:aload_0         
		//   89  173:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//   90  176:aload           7
		//   91  178:aload           8
		//   92  180:aload_1         
		//   93  181:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   94  184:areturn         
				if(flag2)
		//*  95  185:iload           4
		//*  96  187:ifeq            209
					return new Value(_valueInclusion, _contentInclusion, class1, ((Class) (value1)));
		//   97  190:new             #2   <Class JsonInclude$Value>
		//   98  193:dup             
		//   99  194:aload_0         
		//  100  195:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//  101  198:aload_0         
		//  102  199:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//  103  202:aload           8
		//  104  204:aload_1         
		//  105  205:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//  106  208:areturn         
				else
					return this;
		//  107  209:aload_0         
		//  108  210:areturn         
			} else
			{
				return this;
		//  109  211:aload_0         
		//  110  212:areturn         
			}
		}

		public Value withValueInclusion(Include include)
		{
			if(include == _valueInclusion)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #43  <Field JsonInclude$Include _valueInclusion>
		//*   3    5:if_acmpne       10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return new Value(include, _contentInclusion, _valueFilter, _contentFilter);
		//    6   10:new             #2   <Class JsonInclude$Value>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #45  <Field JsonInclude$Include _contentInclusion>
		//   11   19:aload_0         
		//   12   20:getfield        #49  <Field Class _valueFilter>
		//   13   23:aload_0         
		//   14   24:getfield        #51  <Field Class _contentFilter>
		//   15   27:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//   16   30:areturn         
		}

		protected static final Value EMPTY;
		private static final long serialVersionUID = 1L;
		protected final Class _contentFilter;
		protected final Include _contentInclusion;
		protected final Class _valueFilter;
		protected final Include _valueInclusion;

		static 
		{
			EMPTY = new Value(Include.USE_DEFAULTS, Include.USE_DEFAULTS, ((Class) (null)), ((Class) (null)));
		//    0    0:new             #2   <Class JsonInclude$Value>
		//    1    3:dup             
		//    2    4:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//    3    7:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//    4   10:aconst_null     
		//    5   11:aconst_null     
		//    6   12:invokespecial   #36  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include, Class, Class)>
		//    7   15:putstatic       #38  <Field JsonInclude$Value EMPTY>
		//*   8   18:return          
		}

		protected Value(Include include, Include include1, Class class1, Class class2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
			Include include2 = include;
		//    2    4:aload_1         
		//    3    5:astore          5
			if(include == null)
		//*   4    7:aload_1         
		//*   5    8:ifnonnull       16
				include2 = Include.USE_DEFAULTS;
		//    6   11:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//    7   14:astore          5
			_valueInclusion = include2;
		//    8   16:aload_0         
		//    9   17:aload           5
		//   10   19:putfield        #43  <Field JsonInclude$Include _valueInclusion>
			include = include1;
		//   11   22:aload_2         
		//   12   23:astore_1        
			if(include1 == null)
		//*  13   24:aload_2         
		//*  14   25:ifnonnull       32
				include = Include.USE_DEFAULTS;
		//   15   28:getstatic       #32  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
		//   16   31:astore_1        
			_contentInclusion = include;
		//   17   32:aload_0         
		//   18   33:aload_1         
		//   19   34:putfield        #45  <Field JsonInclude$Include _contentInclusion>
			include1 = null;
		//   20   37:aconst_null     
		//   21   38:astore_2        
			include = ((Include) (class1));
		//   22   39:aload_3         
		//   23   40:astore_1        
			if(class1 == java/lang/Void)
		//*  24   41:aload_3         
		//*  25   42:ldc1            #47  <Class Void>
		//*  26   44:if_acmpne       49
				include = null;
		//   27   47:aconst_null     
		//   28   48:astore_1        
			_valueFilter = ((Class) (include));
		//   29   49:aload_0         
		//   30   50:aload_1         
		//   31   51:putfield        #49  <Field Class _valueFilter>
			if(class2 == java/lang/Void)
		//*  32   54:aload           4
		//*  33   56:ldc1            #47  <Class Void>
		//*  34   58:if_acmpne       67
				class2 = ((Class) (include1));
		//   35   61:aload_2         
		//   36   62:astore          4
		//*  37   64:goto            67
			_contentFilter = class2;
		//   38   67:aload_0         
		//   39   68:aload           4
		//   40   70:putfield        #51  <Field Class _contentFilter>
		//   41   73:return          
		}
	}


	public abstract Include content();

	public abstract Class contentFilter();

	public abstract Include value();

	public abstract Class valueFilter();
}
