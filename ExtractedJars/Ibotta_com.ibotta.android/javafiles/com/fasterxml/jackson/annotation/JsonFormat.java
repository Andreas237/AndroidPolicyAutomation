// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			OptBoolean, JacksonAnnotationValue

public interface JsonFormat
	extends Annotation
{
	public static final class Feature extends Enum
	{

		public static Feature valueOf(String s)
		{
			return (Feature)Enum.valueOf(com/fasterxml/jackson/annotation/JsonFormat$Feature, s);
		//    0    0:ldc1            #2   <Class JsonFormat$Feature>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonFormat$Feature>
		//    4    9:areturn         
		}

		public static Feature[] values()
		{
			return (Feature[])((Feature []) ($VALUES)).clone();
		//    0    0:getstatic       #47  <Field JsonFormat$Feature[] $VALUES>
		//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Feature_3B_.clone()>
		//    2    6:checkcast       #58  <Class JsonFormat$Feature[]>
		//    3    9:areturn         
		}

		private static final Feature $VALUES[];
		public static final Feature ACCEPT_CASE_INSENSITIVE_PROPERTIES;
		public static final Feature ACCEPT_SINGLE_VALUE_AS_ARRAY;
		public static final Feature ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
		public static final Feature WRITE_DATES_WITH_ZONE_ID;
		public static final Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
		public static final Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
		public static final Feature WRITE_SORTED_MAP_ENTRIES;

		static 
		{
			ACCEPT_SINGLE_VALUE_AS_ARRAY = new Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
		//    0    0:new             #2   <Class JsonFormat$Feature>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "ACCEPT_SINGLE_VALUE_AS_ARRAY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//    5   10:putstatic       #27  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
			ACCEPT_CASE_INSENSITIVE_PROPERTIES = new Feature("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
		//    6   13:new             #2   <Class JsonFormat$Feature>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "ACCEPT_CASE_INSENSITIVE_PROPERTIES">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//   11   23:putstatic       #30  <Field JsonFormat$Feature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
			WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS = new Feature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 2);
		//   12   26:new             #2   <Class JsonFormat$Feature>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//   17   36:putstatic       #33  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
			WRITE_DATES_WITH_ZONE_ID = new Feature("WRITE_DATES_WITH_ZONE_ID", 3);
		//   18   39:new             #2   <Class JsonFormat$Feature>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "WRITE_DATES_WITH_ZONE_ID">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//   23   49:putstatic       #36  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
			WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new Feature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 4);
		//   24   52:new             #2   <Class JsonFormat$Feature>
		//   25   55:dup             
		//   26   56:ldc1            #37  <String "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//   29   62:putstatic       #39  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
			WRITE_SORTED_MAP_ENTRIES = new Feature("WRITE_SORTED_MAP_ENTRIES", 5);
		//   30   65:new             #2   <Class JsonFormat$Feature>
		//   31   68:dup             
		//   32   69:ldc1            #40  <String "WRITE_SORTED_MAP_ENTRIES">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//   35   75:putstatic       #42  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
			ADJUST_DATES_TO_CONTEXT_TIME_ZONE = new Feature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 6);
		//   36   78:new             #2   <Class JsonFormat$Feature>
		//   37   81:dup             
		//   38   82:ldc1            #43  <String "ADJUST_DATES_TO_CONTEXT_TIME_ZONE">
		//   39   84:bipush          6
		//   40   86:invokespecial   #25  <Method void JsonFormat$Feature(String, int)>
		//   41   89:putstatic       #45  <Field JsonFormat$Feature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
			$VALUES = (new Feature[] {
				ACCEPT_SINGLE_VALUE_AS_ARRAY, ACCEPT_CASE_INSENSITIVE_PROPERTIES, WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, WRITE_DATES_WITH_ZONE_ID, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, WRITE_SORTED_MAP_ENTRIES, ADJUST_DATES_TO_CONTEXT_TIME_ZONE
			});
		//   42   92:bipush          7
		//   43   94:anewarray       Feature[]
		//   44   97:dup             
		//   45   98:iconst_0        
		//   46   99:getstatic       #27  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
		//   47  102:aastore         
		//   48  103:dup             
		//   49  104:iconst_1        
		//   50  105:getstatic       #30  <Field JsonFormat$Feature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
		//   51  108:aastore         
		//   52  109:dup             
		//   53  110:iconst_2        
		//   54  111:getstatic       #33  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
		//   55  114:aastore         
		//   56  115:dup             
		//   57  116:iconst_3        
		//   58  117:getstatic       #36  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
		//   59  120:aastore         
		//   60  121:dup             
		//   61  122:iconst_4        
		//   62  123:getstatic       #39  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
		//   63  126:aastore         
		//   64  127:dup             
		//   65  128:iconst_5        
		//   66  129:getstatic       #42  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
		//   67  132:aastore         
		//   68  133:dup             
		//   69  134:bipush          6
		//   70  136:getstatic       #45  <Field JsonFormat$Feature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
		//   71  139:aastore         
		//   72  140:putstatic       #47  <Field JsonFormat$Feature[] $VALUES>
		//*  73  143:return          
		}

		private Feature(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class Features
	{

		public static Features construct(JsonFormat jsonformat)
		{
			return construct(jsonformat.with(), jsonformat.without());
		//    0    0:aload_0         
		//    1    1:invokeinterface #33  <Method JsonFormat$Feature[] JsonFormat.with()>
		//    2    6:aload_0         
		//    3    7:invokeinterface #36  <Method JsonFormat$Feature[] JsonFormat.without()>
		//    4   12:invokestatic    #39  <Method JsonFormat$Features construct(JsonFormat$Feature[], JsonFormat$Feature[])>
		//    5   15:areturn         
		}

		public static Features construct(Feature afeature[], Feature afeature1[])
		{
			int l = afeature.length;
		//    0    0:aload_0         
		//    1    1:arraylength     
		//    2    2:istore          5
			int k = 0;
		//    3    4:iconst_0        
		//    4    5:istore          4
			int j = 0;
		//    5    7:iconst_0        
		//    6    8:istore_3        
			int i = 0;
		//    7    9:iconst_0        
		//    8   10:istore_2        
			for(; j < l; j++)
		//*   9   11:iload_3         
		//*  10   12:iload           5
		//*  11   14:icmpge          35
				i |= 1 << afeature[j].ordinal();
		//   12   17:iload_2         
		//   13   18:iconst_1        
		//   14   19:aload_0         
		//   15   20:iload_3         
		//   16   21:aaload          
		//   17   22:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//   18   25:ishl            
		//   19   26:ior             
		//   20   27:istore_2        

		//   21   28:iload_3         
		//   22   29:iconst_1        
		//   23   30:iadd            
		//   24   31:istore_3        
		//*  25   32:goto            11
			int i1 = afeature1.length;
		//   26   35:aload_1         
		//   27   36:arraylength     
		//   28   37:istore          6
			l = 0;
		//   29   39:iconst_0        
		//   30   40:istore          5
			j = k;
		//   31   42:iload           4
		//   32   44:istore_3        
			k = l;
		//   33   45:iload           5
		//   34   47:istore          4
			for(; j < i1; j++)
		//*  35   49:iload_3         
		//*  36   50:iload           6
		//*  37   52:icmpge          75
				k |= 1 << afeature1[j].ordinal();
		//   38   55:iload           4
		//   39   57:iconst_1        
		//   40   58:aload_1         
		//   41   59:iload_3         
		//   42   60:aaload          
		//   43   61:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//   44   64:ishl            
		//   45   65:ior             
		//   46   66:istore          4

		//   47   68:iload_3         
		//   48   69:iconst_1        
		//   49   70:iadd            
		//   50   71:istore_3        
		//*  51   72:goto            49
			return new Features(i, k);
		//   52   75:new             #2   <Class JsonFormat$Features>
		//   53   78:dup             
		//   54   79:iload_2         
		//   55   80:iload           4
		//   56   82:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//   57   85:areturn         
		}

		public static Features empty()
		{
			return EMPTY;
		//    0    0:getstatic       #20  <Field JsonFormat$Features EMPTY>
		//    1    3:areturn         
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
		//*  10   14:invokevirtual   #53  <Method Class Object.getClass()>
		//*  11   17:aload_0         
		//*  12   18:invokevirtual   #53  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((Features)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class JsonFormat$Features>
		//   18   30:astore_1        
			return ((Features) (obj))._enabled == _enabled && ((Features) (obj))._disabled == _disabled;
		//   19   31:aload_1         
		//   20   32:getfield        #25  <Field int _enabled>
		//   21   35:aload_0         
		//   22   36:getfield        #25  <Field int _enabled>
		//   23   39:icmpne          55
		//   24   42:aload_1         
		//   25   43:getfield        #27  <Field int _disabled>
		//   26   46:aload_0         
		//   27   47:getfield        #27  <Field int _disabled>
		//   28   50:icmpne          55
		//   29   53:iconst_1        
		//   30   54:ireturn         
		//   31   55:iconst_0        
		//   32   56:ireturn         
		}

		public Boolean get(Feature feature)
		{
			int i = 1 << feature.ordinal();
		//    0    0:iconst_1        
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//    3    5:ishl            
		//    4    6:istore_2        
			if((_disabled & i) != 0)
		//*   5    7:aload_0         
		//*   6    8:getfield        #27  <Field int _disabled>
		//*   7   11:iload_2         
		//*   8   12:iand            
		//*   9   13:ifeq            20
				return Boolean.FALSE;
		//   10   16:getstatic       #61  <Field Boolean Boolean.FALSE>
		//   11   19:areturn         
			if((i & _enabled) != 0)
		//*  12   20:iload_2         
		//*  13   21:aload_0         
		//*  14   22:getfield        #25  <Field int _enabled>
		//*  15   25:iand            
		//*  16   26:ifeq            33
				return Boolean.TRUE;
		//   17   29:getstatic       #64  <Field Boolean Boolean.TRUE>
		//   18   32:areturn         
			else
				return null;
		//   19   33:aconst_null     
		//   20   34:areturn         
		}

		public int hashCode()
		{
			return _disabled + _enabled;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int _disabled>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field int _enabled>
		//    4    8:iadd            
		//    5    9:ireturn         
		}

		public Features withOverrides(Features features)
		{
			if(features == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			int l = features._disabled;
		//    4    6:aload_1         
		//    5    7:getfield        #27  <Field int _disabled>
		//    6   10:istore          5
			int i1 = features._enabled;
		//    7   12:aload_1         
		//    8   13:getfield        #25  <Field int _enabled>
		//    9   16:istore          6
			if(l == 0 && i1 == 0)
		//*  10   18:iload           5
		//*  11   20:ifne            30
		//*  12   23:iload           6
		//*  13   25:ifne            30
				return this;
		//   14   28:aload_0         
		//   15   29:areturn         
			if(_enabled == 0 && _disabled == 0)
		//*  16   30:aload_0         
		//*  17   31:getfield        #25  <Field int _enabled>
		//*  18   34:ifne            46
		//*  19   37:aload_0         
		//*  20   38:getfield        #27  <Field int _disabled>
		//*  21   41:ifne            46
				return features;
		//   22   44:aload_1         
		//   23   45:areturn         
			int i = _enabled;
		//   24   46:aload_0         
		//   25   47:getfield        #25  <Field int _enabled>
		//   26   50:istore_2        
			int j = l & i | i1;
		//   27   51:iload           5
		//   28   53:iload_2         
		//   29   54:iand            
		//   30   55:iload           6
		//   31   57:ior             
		//   32   58:istore_3        
			int k = _disabled;
		//   33   59:aload_0         
		//   34   60:getfield        #27  <Field int _disabled>
		//   35   63:istore          4
			l |= i1 & k;
		//   36   65:iload           5
		//   37   67:iload           6
		//   38   69:iload           4
		//   39   71:iand            
		//   40   72:ior             
		//   41   73:istore          5
			if(j == i && l == k)
		//*  42   75:iload_3         
		//*  43   76:iload_2         
		//*  44   77:icmpne          89
		//*  45   80:iload           5
		//*  46   82:iload           4
		//*  47   84:icmpne          89
				return this;
		//   48   87:aload_0         
		//   49   88:areturn         
			else
				return new Features(j, l);
		//   50   89:new             #2   <Class JsonFormat$Features>
		//   51   92:dup             
		//   52   93:iload_3         
		//   53   94:iload           5
		//   54   96:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//   55   99:areturn         
		}

		private static final Features EMPTY = new Features(0, 0);
		private final int _disabled;
		private final int _enabled;

		static 
		{
		//    0    0:new             #2   <Class JsonFormat$Features>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:iconst_0        
		//    4    6:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//    5    9:putstatic       #20  <Field JsonFormat$Features EMPTY>
		//*   6   12:return          
		}

		private Features(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			_enabled = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #25  <Field int _enabled>
			_disabled = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #27  <Field int _disabled>
		//    8   14:return          
		}
	}

	public static final class Shape extends Enum
	{

		public static Shape valueOf(String s)
		{
			return (Shape)Enum.valueOf(com/fasterxml/jackson/annotation/JsonFormat$Shape, s);
		//    0    0:ldc1            #2   <Class JsonFormat$Shape>
		//    1    2:aload_0         
		//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonFormat$Shape>
		//    4    9:areturn         
		}

		public static Shape[] values()
		{
			return (Shape[])((Shape []) ($VALUES)).clone();
		//    0    0:getstatic       #59  <Field JsonFormat$Shape[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Shape_3B_.clone()>
		//    2    6:checkcast       #70  <Class JsonFormat$Shape[]>
		//    3    9:areturn         
		}

		public boolean isNumeric()
		{
			return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
		//    0    0:aload_0         
		//    1    1:getstatic       #45  <Field JsonFormat$Shape NUMBER>
		//    2    4:if_acmpeq       26
		//    3    7:aload_0         
		//    4    8:getstatic       #51  <Field JsonFormat$Shape NUMBER_INT>
		//    5   11:if_acmpeq       26
		//    6   14:aload_0         
		//    7   15:getstatic       #48  <Field JsonFormat$Shape NUMBER_FLOAT>
		//    8   18:if_acmpne       24
		//    9   21:goto            26
		//   10   24:iconst_0        
		//   11   25:ireturn         
		//   12   26:iconst_1        
		//   13   27:ireturn         
		}

		private static final Shape $VALUES[];
		public static final Shape ANY;
		public static final Shape ARRAY;
		public static final Shape BOOLEAN;
		public static final Shape NATURAL;
		public static final Shape NUMBER;
		public static final Shape NUMBER_FLOAT;
		public static final Shape NUMBER_INT;
		public static final Shape OBJECT;
		public static final Shape SCALAR;
		public static final Shape STRING;

		static 
		{
			ANY = new Shape("ANY", 0);
		//    0    0:new             #2   <Class JsonFormat$Shape>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "ANY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//    5   10:putstatic       #30  <Field JsonFormat$Shape ANY>
			NATURAL = new Shape("NATURAL", 1);
		//    6   13:new             #2   <Class JsonFormat$Shape>
		//    7   16:dup             
		//    8   17:ldc1            #31  <String "NATURAL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   11   23:putstatic       #33  <Field JsonFormat$Shape NATURAL>
			SCALAR = new Shape("SCALAR", 2);
		//   12   26:new             #2   <Class JsonFormat$Shape>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "SCALAR">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   17   36:putstatic       #36  <Field JsonFormat$Shape SCALAR>
			ARRAY = new Shape("ARRAY", 3);
		//   18   39:new             #2   <Class JsonFormat$Shape>
		//   19   42:dup             
		//   20   43:ldc1            #37  <String "ARRAY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   23   49:putstatic       #39  <Field JsonFormat$Shape ARRAY>
			OBJECT = new Shape("OBJECT", 4);
		//   24   52:new             #2   <Class JsonFormat$Shape>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "OBJECT">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   29   62:putstatic       #42  <Field JsonFormat$Shape OBJECT>
			NUMBER = new Shape("NUMBER", 5);
		//   30   65:new             #2   <Class JsonFormat$Shape>
		//   31   68:dup             
		//   32   69:ldc1            #43  <String "NUMBER">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   35   75:putstatic       #45  <Field JsonFormat$Shape NUMBER>
			NUMBER_FLOAT = new Shape("NUMBER_FLOAT", 6);
		//   36   78:new             #2   <Class JsonFormat$Shape>
		//   37   81:dup             
		//   38   82:ldc1            #46  <String "NUMBER_FLOAT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   41   89:putstatic       #48  <Field JsonFormat$Shape NUMBER_FLOAT>
			NUMBER_INT = new Shape("NUMBER_INT", 7);
		//   42   92:new             #2   <Class JsonFormat$Shape>
		//   43   95:dup             
		//   44   96:ldc1            #49  <String "NUMBER_INT">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   47  103:putstatic       #51  <Field JsonFormat$Shape NUMBER_INT>
			STRING = new Shape("STRING", 8);
		//   48  106:new             #2   <Class JsonFormat$Shape>
		//   49  109:dup             
		//   50  110:ldc1            #52  <String "STRING">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   53  117:putstatic       #54  <Field JsonFormat$Shape STRING>
			BOOLEAN = new Shape("BOOLEAN", 9);
		//   54  120:new             #2   <Class JsonFormat$Shape>
		//   55  123:dup             
		//   56  124:ldc1            #55  <String "BOOLEAN">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
		//   59  131:putstatic       #57  <Field JsonFormat$Shape BOOLEAN>
			$VALUES = (new Shape[] {
				ANY, NATURAL, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN
			});
		//   60  134:bipush          10
		//   61  136:anewarray       Shape[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #30  <Field JsonFormat$Shape ANY>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #33  <Field JsonFormat$Shape NATURAL>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #36  <Field JsonFormat$Shape SCALAR>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #39  <Field JsonFormat$Shape ARRAY>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #42  <Field JsonFormat$Shape OBJECT>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #45  <Field JsonFormat$Shape NUMBER>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #48  <Field JsonFormat$Shape NUMBER_FLOAT>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #51  <Field JsonFormat$Shape NUMBER_INT>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #54  <Field JsonFormat$Shape STRING>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #57  <Field JsonFormat$Shape BOOLEAN>
		//  101  202:aastore         
		//  102  203:putstatic       #59  <Field JsonFormat$Shape[] $VALUES>
		//* 103  206:return          
		}

		private Shape(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class Value
		implements JacksonAnnotationValue, Serializable
	{

		private static boolean _equal(Object obj, Object obj1)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			if(obj == null)
		//*   2    2:aload_0         
		//*   3    3:ifnonnull       14
			{
				if(obj1 == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       12
					flag = true;
		//    6   10:iconst_1        
		//    7   11:istore_2        
				return flag;
		//    8   12:iload_2         
		//    9   13:ireturn         
			}
			if(obj1 == null)
		//*  10   14:aload_1         
		//*  11   15:ifnonnull       20
				return false;
		//   12   18:iconst_0        
		//   13   19:ireturn         
			else
				return obj.equals(obj1);
		//   14   20:aload_0         
		//   15   21:aload_1         
		//   16   22:invokevirtual   #122 <Method boolean Object.equals(Object)>
		//   17   25:ireturn         
		}

		public static final Value empty()
		{
			return EMPTY;
		//    0    0:getstatic       #38  <Field JsonFormat$Value EMPTY>
		//    1    3:areturn         
		}

		public static Value merge(Value value, Value value1)
		{
			if(value == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return value1;
		//    2    4:aload_1         
		//    3    5:areturn         
			else
				return value.withOverrides(value1);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #131 <Method JsonFormat$Value withOverrides(JsonFormat$Value)>
		//    7   11:areturn         
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
		//*  10   14:invokevirtual   #135 <Method Class Object.getClass()>
		//*  11   17:aload_0         
		//*  12   18:invokevirtual   #135 <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((Value)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class JsonFormat$Value>
		//   18   30:astore_1        
			if(_shape == ((Value) (obj))._shape)
		//*  19   31:aload_0         
		//*  20   32:getfield        #109 <Field JsonFormat$Shape _shape>
		//*  21   35:aload_1         
		//*  22   36:getfield        #109 <Field JsonFormat$Shape _shape>
		//*  23   39:if_acmpne       132
			{
				if(!_features.equals(((Object) (((Value) (obj))._features))))
		//*  24   42:aload_0         
		//*  25   43:getfield        #117 <Field JsonFormat$Features _features>
		//*  26   46:aload_1         
		//*  27   47:getfield        #117 <Field JsonFormat$Features _features>
		//*  28   50:invokevirtual   #136 <Method boolean JsonFormat$Features.equals(Object)>
		//*  29   53:ifne            58
					return false;
		//   30   56:iconst_0        
		//   31   57:ireturn         
				return _equal(((Object) (_lenient)), ((Object) (((Value) (obj))._lenient))) && _equal(((Object) (_timezoneStr)), ((Object) (((Value) (obj))._timezoneStr))) && _equal(((Object) (_pattern)), ((Object) (((Value) (obj))._pattern))) && _equal(((Object) (_timezone)), ((Object) (((Value) (obj))._timezone))) && _equal(((Object) (_locale)), ((Object) (((Value) (obj))._locale)));
		//   32   58:aload_0         
		//   33   59:getfield        #119 <Field Boolean _lenient>
		//   34   62:aload_1         
		//   35   63:getfield        #119 <Field Boolean _lenient>
		//   36   66:invokestatic    #138 <Method boolean _equal(Object, Object)>
		//   37   69:ifeq            130
		//   38   72:aload_0         
		//   39   73:getfield        #115 <Field String _timezoneStr>
		//   40   76:aload_1         
		//   41   77:getfield        #115 <Field String _timezoneStr>
		//   42   80:invokestatic    #138 <Method boolean _equal(Object, Object)>
		//   43   83:ifeq            130
		//   44   86:aload_0         
		//   45   87:getfield        #107 <Field String _pattern>
		//   46   90:aload_1         
		//   47   91:getfield        #107 <Field String _pattern>
		//   48   94:invokestatic    #138 <Method boolean _equal(Object, Object)>
		//   49   97:ifeq            130
		//   50  100:aload_0         
		//   51  101:getfield        #113 <Field TimeZone _timezone>
		//   52  104:aload_1         
		//   53  105:getfield        #113 <Field TimeZone _timezone>
		//   54  108:invokestatic    #138 <Method boolean _equal(Object, Object)>
		//   55  111:ifeq            130
		//   56  114:aload_0         
		//   57  115:getfield        #111 <Field Locale _locale>
		//   58  118:aload_1         
		//   59  119:getfield        #111 <Field Locale _locale>
		//   60  122:invokestatic    #138 <Method boolean _equal(Object, Object)>
		//   61  125:ifeq            130
		//   62  128:iconst_1        
		//   63  129:ireturn         
		//   64  130:iconst_0        
		//   65  131:ireturn         
			} else
			{
				return false;
		//   66  132:iconst_0        
		//   67  133:ireturn         
			}
		}

		public Boolean getFeature(Feature feature)
		{
			return _features.get(feature);
		//    0    0:aload_0         
		//    1    1:getfield        #117 <Field JsonFormat$Features _features>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #143 <Method Boolean JsonFormat$Features.get(JsonFormat$Feature)>
		//    4    8:areturn         
		}

		public Boolean getLenient()
		{
			return _lenient;
		//    0    0:aload_0         
		//    1    1:getfield        #119 <Field Boolean _lenient>
		//    2    4:areturn         
		}

		public Locale getLocale()
		{
			return _locale;
		//    0    0:aload_0         
		//    1    1:getfield        #111 <Field Locale _locale>
		//    2    4:areturn         
		}

		public String getPattern()
		{
			return _pattern;
		//    0    0:aload_0         
		//    1    1:getfield        #107 <Field String _pattern>
		//    2    4:areturn         
		}

		public Shape getShape()
		{
			return _shape;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field JsonFormat$Shape _shape>
		//    2    4:areturn         
		}

		public TimeZone getTimeZone()
		{
			TimeZone timezone1 = _timezone;
		//    0    0:aload_0         
		//    1    1:getfield        #113 <Field TimeZone _timezone>
		//    2    4:astore_2        
			Object obj = ((Object) (timezone1));
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(timezone1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       32
			{
				obj = ((Object) (_timezoneStr));
		//    7   11:aload_0         
		//    8   12:getfield        #115 <Field String _timezoneStr>
		//    9   15:astore_1        
				if(obj == null)
		//*  10   16:aload_1         
		//*  11   17:ifnonnull       22
					return null;
		//   12   20:aconst_null     
		//   13   21:areturn         
				obj = ((Object) (TimeZone.getTimeZone(((String) (obj)))));
		//   14   22:aload_1         
		//   15   23:invokestatic    #155 <Method TimeZone TimeZone.getTimeZone(String)>
		//   16   26:astore_1        
				_timezone = ((TimeZone) (obj));
		//   17   27:aload_0         
		//   18   28:aload_1         
		//   19   29:putfield        #113 <Field TimeZone _timezone>
			}
			return ((TimeZone) (obj));
		//   20   32:aload_1         
		//   21   33:areturn         
		}

		public boolean hasLocale()
		{
			return _locale != null;
		//    0    0:aload_0         
		//    1    1:getfield        #111 <Field Locale _locale>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public boolean hasPattern()
		{
			String s = _pattern;
		//    0    0:aload_0         
		//    1    1:getfield        #107 <Field String _pattern>
		//    2    4:astore_1        
			return s != null && s.length() > 0;
		//    3    5:aload_1         
		//    4    6:ifnull          18
		//    5    9:aload_1         
		//    6   10:invokevirtual   #90  <Method int String.length()>
		//    7   13:ifle            18
		//    8   16:iconst_1        
		//    9   17:ireturn         
		//   10   18:iconst_0        
		//   11   19:ireturn         
		}

		public boolean hasShape()
		{
			return _shape != Shape.ANY;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field JsonFormat$Shape _shape>
		//    2    4:getstatic       #46  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//    3    7:if_acmpeq       12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public boolean hasTimeZone()
		{
			if(_timezone == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #113 <Field TimeZone _timezone>
		//*   2    4:ifnonnull       28
			{
				String s = _timezoneStr;
		//    3    7:aload_0         
		//    4    8:getfield        #115 <Field String _timezoneStr>
		//    5   11:astore_1        
				if(s == null || s.isEmpty())
		//*   6   12:aload_1         
		//*   7   13:ifnull          26
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #163 <Method boolean String.isEmpty()>
		//*  10   20:ifne            26
		//*  11   23:goto            28
					return false;
		//   12   26:iconst_0        
		//   13   27:ireturn         
			}
			return true;
		//   14   28:iconst_1        
		//   15   29:ireturn         
		}

		public int hashCode()
		{
			Object obj = ((Object) (_timezoneStr));
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field String _timezoneStr>
		//    2    4:astore_3        
			int i;
			if(obj == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       14
				i = 1;
		//    5    9:iconst_1        
		//    6   10:istore_1        
			else
		//*   7   11:goto            19
				i = ((String) (obj)).hashCode();
		//    8   14:aload_3         
		//    9   15:invokevirtual   #166 <Method int String.hashCode()>
		//   10   18:istore_1        
			obj = ((Object) (_pattern));
		//   11   19:aload_0         
		//   12   20:getfield        #107 <Field String _pattern>
		//   13   23:astore_3        
			int j = i;
		//   14   24:iload_1         
		//   15   25:istore_2        
			if(obj != null)
		//*  16   26:aload_3         
		//*  17   27:ifnull          37
				j = i ^ ((String) (obj)).hashCode();
		//   18   30:iload_1         
		//   19   31:aload_3         
		//   20   32:invokevirtual   #166 <Method int String.hashCode()>
		//   21   35:ixor            
		//   22   36:istore_2        
			j += _shape.hashCode();
		//   23   37:iload_2         
		//   24   38:aload_0         
		//   25   39:getfield        #109 <Field JsonFormat$Shape _shape>
		//   26   42:invokevirtual   #167 <Method int JsonFormat$Shape.hashCode()>
		//   27   45:iadd            
		//   28   46:istore_2        
			obj = ((Object) (_lenient));
		//   29   47:aload_0         
		//   30   48:getfield        #119 <Field Boolean _lenient>
		//   31   51:astore_3        
			i = j;
		//   32   52:iload_2         
		//   33   53:istore_1        
			if(obj != null)
		//*  34   54:aload_3         
		//*  35   55:ifnull          65
				i = j ^ ((Boolean) (obj)).hashCode();
		//   36   58:iload_2         
		//   37   59:aload_3         
		//   38   60:invokevirtual   #170 <Method int Boolean.hashCode()>
		//   39   63:ixor            
		//   40   64:istore_1        
			obj = ((Object) (_locale));
		//   41   65:aload_0         
		//   42   66:getfield        #111 <Field Locale _locale>
		//   43   69:astore_3        
			j = i;
		//   44   70:iload_1         
		//   45   71:istore_2        
			if(obj != null)
		//*  46   72:aload_3         
		//*  47   73:ifnull          83
				j = i + ((Locale) (obj)).hashCode();
		//   48   76:iload_1         
		//   49   77:aload_3         
		//   50   78:invokevirtual   #171 <Method int Locale.hashCode()>
		//   51   81:iadd            
		//   52   82:istore_2        
			return j ^ _features.hashCode();
		//   53   83:iload_2         
		//   54   84:aload_0         
		//   55   85:getfield        #117 <Field JsonFormat$Features _features>
		//   56   88:invokevirtual   #172 <Method int JsonFormat$Features.hashCode()>
		//   57   91:ixor            
		//   58   92:ireturn         
		}

		public String toString()
		{
			return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s)", new Object[] {
				_pattern, _shape, _lenient, _locale, _timezoneStr
			});
		//    0    0:ldc1            #175 <String "JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s)">
		//    1    2:iconst_5        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #107 <Field String _pattern>
		//    7   12:aastore         
		//    8   13:dup             
		//    9   14:iconst_1        
		//   10   15:aload_0         
		//   11   16:getfield        #109 <Field JsonFormat$Shape _shape>
		//   12   19:aastore         
		//   13   20:dup             
		//   14   21:iconst_2        
		//   15   22:aload_0         
		//   16   23:getfield        #119 <Field Boolean _lenient>
		//   17   26:aastore         
		//   18   27:dup             
		//   19   28:iconst_3        
		//   20   29:aload_0         
		//   21   30:getfield        #111 <Field Locale _locale>
		//   22   33:aastore         
		//   23   34:dup             
		//   24   35:iconst_4        
		//   25   36:aload_0         
		//   26   37:getfield        #115 <Field String _timezoneStr>
		//   27   40:aastore         
		//   28   41:invokestatic    #179 <Method String String.format(String, Object[])>
		//   29   44:areturn         
		}

		public Class valueFor()
		{
			return com/fasterxml/jackson/annotation/JsonFormat;
		//    0    0:ldc1            #11  <Class JsonFormat>
		//    1    2:areturn         
		}

		public final Value withOverrides(Value value)
		{
			if(value != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          209
			{
				Object obj = ((Object) (EMPTY));
		//    2    4:getstatic       #38  <Field JsonFormat$Value EMPTY>
		//    3    7:astore_2        
				if(value != obj)
		//*   4    8:aload_1         
		//*   5    9:aload_2         
		//*   6   10:if_acmpeq       209
				{
					if(value == this)
		//*   7   13:aload_1         
		//*   8   14:aload_0         
		//*   9   15:if_acmpne       20
						return this;
		//   10   18:aload_0         
		//   11   19:areturn         
					if(this == obj)
		//*  12   20:aload_0         
		//*  13   21:aload_2         
		//*  14   22:if_acmpne       27
						return value;
		//   15   25:aload_1         
		//   16   26:areturn         
					obj = ((Object) (value._pattern));
		//   17   27:aload_1         
		//   18   28:getfield        #107 <Field String _pattern>
		//   19   31:astore_2        
					if(obj == null || ((String) (obj)).isEmpty())
		//*  20   32:aload_2         
		//*  21   33:ifnull          49
		//*  22   36:aload_2         
		//*  23   37:invokevirtual   #163 <Method boolean String.isEmpty()>
		//*  24   40:ifeq            46
		//*  25   43:goto            49
		//*  26   46:goto            54
						obj = ((Object) (_pattern));
		//   27   49:aload_0         
		//   28   50:getfield        #107 <Field String _pattern>
		//   29   53:astore_2        
					Shape shape1 = value._shape;
		//   30   54:aload_1         
		//   31   55:getfield        #109 <Field JsonFormat$Shape _shape>
		//   32   58:astore_3        
					if(shape1 == Shape.ANY)
		//*  33   59:aload_3         
		//*  34   60:getstatic       #46  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//*  35   63:if_acmpne       74
						shape1 = _shape;
		//   36   66:aload_0         
		//   37   67:getfield        #109 <Field JsonFormat$Shape _shape>
		//   38   70:astore_3        
		//*  39   71:goto            74
					Locale locale1 = value._locale;
		//   40   74:aload_1         
		//   41   75:getfield        #111 <Field Locale _locale>
		//   42   78:astore          4
					if(locale1 == null)
		//*  43   80:aload           4
		//*  44   82:ifnonnull       94
						locale1 = _locale;
		//   45   85:aload_0         
		//   46   86:getfield        #111 <Field Locale _locale>
		//   47   89:astore          4
		//*  48   91:goto            94
					Features features = _features;
		//   49   94:aload_0         
		//   50   95:getfield        #117 <Field JsonFormat$Features _features>
		//   51   98:astore          5
					if(features == null)
		//*  52  100:aload           5
		//*  53  102:ifnonnull       114
						features = value._features;
		//   54  105:aload_1         
		//   55  106:getfield        #117 <Field JsonFormat$Features _features>
		//   56  109:astore          5
					else
		//*  57  111:goto            125
						features = features.withOverrides(value._features);
		//   58  114:aload           5
		//   59  116:aload_1         
		//   60  117:getfield        #117 <Field JsonFormat$Features _features>
		//   61  120:invokevirtual   #184 <Method JsonFormat$Features JsonFormat$Features.withOverrides(JsonFormat$Features)>
		//   62  123:astore          5
					Boolean boolean1 = value._lenient;
		//   63  125:aload_1         
		//   64  126:getfield        #119 <Field Boolean _lenient>
		//   65  129:astore          6
					if(boolean1 == null)
		//*  66  131:aload           6
		//*  67  133:ifnonnull       145
						boolean1 = _lenient;
		//   68  136:aload_0         
		//   69  137:getfield        #119 <Field Boolean _lenient>
		//   70  140:astore          6
		//*  71  142:goto            145
					String s = value._timezoneStr;
		//   72  145:aload_1         
		//   73  146:getfield        #115 <Field String _timezoneStr>
		//   74  149:astore          8
					TimeZone timezone1;
					if(s != null && !s.isEmpty())
		//*  75  151:aload           8
		//*  76  153:ifnull          179
		//*  77  156:aload           8
		//*  78  158:invokevirtual   #163 <Method boolean String.isEmpty()>
		//*  79  161:ifeq            167
		//*  80  164:goto            179
					{
						timezone1 = value._timezone;
		//   81  167:aload_1         
		//   82  168:getfield        #113 <Field TimeZone _timezone>
		//   83  171:astore          7
						value = ((Value) (s));
		//   84  173:aload           8
		//   85  175:astore_1        
					} else
		//*  86  176:goto            190
					{
						value = ((Value) (_timezoneStr));
		//   87  179:aload_0         
		//   88  180:getfield        #115 <Field String _timezoneStr>
		//   89  183:astore_1        
						timezone1 = _timezone;
		//   90  184:aload_0         
		//   91  185:getfield        #113 <Field TimeZone _timezone>
		//   92  188:astore          7
					}
					return new Value(((String) (obj)), shape1, locale1, ((String) (value)), timezone1, features, boolean1);
		//   93  190:new             #2   <Class JsonFormat$Value>
		//   94  193:dup             
		//   95  194:aload_2         
		//   96  195:aload_3         
		//   97  196:aload           4
		//   98  198:aload_1         
		//   99  199:aload           7
		//  100  201:aload           5
		//  101  203:aload           6
		//  102  205:invokespecial   #104 <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features, Boolean)>
		//  103  208:areturn         
				}
			}
			return this;
		//  104  209:aload_0         
		//  105  210:areturn         
		}

		private static final Value EMPTY = new Value();
		private static final long serialVersionUID = 1L;
		private final Features _features;
		private final Boolean _lenient;
		private final Locale _locale;
		private final String _pattern;
		private final Shape _shape;
		private transient TimeZone _timezone;
		private final String _timezoneStr;

		static 
		{
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:invokespecial   #36  <Method void JsonFormat$Value()>
		//    3    7:putstatic       #38  <Field JsonFormat$Value EMPTY>
		//*   4   10:return          
		}

		public Value()
		{
			this("", Shape.ANY, "", "", Features.empty(), ((Boolean) (null)));
		//    0    0:aload_0         
		//    1    1:ldc1            #41  <String "">
		//    2    3:getstatic       #46  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//    3    6:ldc1            #41  <String "">
		//    4    8:ldc1            #41  <String "">
		//    5   10:invokestatic    #52  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    6   13:aconst_null     
		//    7   14:invokespecial   #55  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features, Boolean)>
		//    8   17:return          
		}

		public Value(JsonFormat jsonformat)
		{
			this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone(), Features.construct(jsonformat), jsonformat.lenient().asBoolean());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #60  <Method String JsonFormat.pattern()>
		//    3    7:aload_1         
		//    4    8:invokeinterface #64  <Method JsonFormat$Shape JsonFormat.shape()>
		//    5   13:aload_1         
		//    6   14:invokeinterface #67  <Method String JsonFormat.locale()>
		//    7   19:aload_1         
		//    8   20:invokeinterface #70  <Method String JsonFormat.timezone()>
		//    9   25:aload_1         
		//   10   26:invokestatic    #74  <Method JsonFormat$Features JsonFormat$Features.construct(JsonFormat)>
		//   11   29:aload_1         
		//   12   30:invokeinterface #78  <Method OptBoolean JsonFormat.lenient()>
		//   13   35:invokevirtual   #84  <Method Boolean OptBoolean.asBoolean()>
		//   14   38:invokespecial   #55  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features, Boolean)>
		//   15   41:return          
		}

		public Value(String s, Shape shape1, String s1, String s2, Features features, Boolean boolean1)
		{
			if(s1 != null && s1.length() != 0 && !"##default".equals(((Object) (s1))))
		//*   0    0:aload_3         
		//*   1    1:ifnull          35
		//*   2    4:aload_3         
		//*   3    5:invokevirtual   #90  <Method int String.length()>
		//*   4    8:ifeq            35
		//*   5   11:ldc1            #92  <String "##default">
		//*   6   13:aload_3         
		//*   7   14:invokevirtual   #96  <Method boolean String.equals(Object)>
		//*   8   17:ifeq            23
		//*   9   20:goto            35
				s1 = ((String) (new Locale(s1)));
		//   10   23:new             #98  <Class Locale>
		//   11   26:dup             
		//   12   27:aload_3         
		//   13   28:invokespecial   #101 <Method void Locale(String)>
		//   14   31:astore_3        
			else
		//*  15   32:goto            37
				s1 = null;
		//   16   35:aconst_null     
		//   17   36:astore_3        
			if(s2 == null || s2.length() == 0 || "##default".equals(((Object) (s2))))
		//*  18   37:aload           4
		//*  19   39:ifnull          66
		//*  20   42:aload           4
		//*  21   44:invokevirtual   #90  <Method int String.length()>
		//*  22   47:ifeq            66
		//*  23   50:ldc1            #92  <String "##default">
		//*  24   52:aload           4
		//*  25   54:invokevirtual   #96  <Method boolean String.equals(Object)>
		//*  26   57:ifeq            63
		//*  27   60:goto            66
		//*  28   63:goto            69
				s2 = null;
		//   29   66:aconst_null     
		//   30   67:astore          4
			this(s, shape1, ((Locale) (s1)), s2, ((TimeZone) (null)), features, boolean1);
		//   31   69:aload_0         
		//   32   70:aload_1         
		//   33   71:aload_2         
		//   34   72:aload_3         
		//   35   73:aload           4
		//   36   75:aconst_null     
		//   37   76:aload           5
		//   38   78:aload           6
		//   39   80:invokespecial   #104 <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features, Boolean)>
		//   40   83:return          
		}

		public Value(String s, Shape shape1, Locale locale1, String s1, TimeZone timezone1, Features features, Boolean boolean1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #105 <Method void Object()>
			_pattern = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #107 <Field String _pattern>
			s = ((String) (shape1));
		//    5    9:aload_2         
		//    6   10:astore_1        
			if(shape1 == null)
		//*   7   11:aload_2         
		//*   8   12:ifnonnull       19
				s = ((String) (Shape.ANY));
		//    9   15:getstatic       #46  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//   10   18:astore_1        
			_shape = ((Shape) (s));
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #109 <Field JsonFormat$Shape _shape>
			_locale = locale1;
		//   14   24:aload_0         
		//   15   25:aload_3         
		//   16   26:putfield        #111 <Field Locale _locale>
			_timezone = timezone1;
		//   17   29:aload_0         
		//   18   30:aload           5
		//   19   32:putfield        #113 <Field TimeZone _timezone>
			_timezoneStr = s1;
		//   20   35:aload_0         
		//   21   36:aload           4
		//   22   38:putfield        #115 <Field String _timezoneStr>
			s = ((String) (features));
		//   23   41:aload           6
		//   24   43:astore_1        
			if(features == null)
		//*  25   44:aload           6
		//*  26   46:ifnonnull       53
				s = ((String) (Features.empty()));
		//   27   49:invokestatic    #52  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//   28   52:astore_1        
			_features = ((Features) (s));
		//   29   53:aload_0         
		//   30   54:aload_1         
		//   31   55:putfield        #117 <Field JsonFormat$Features _features>
			_lenient = boolean1;
		//   32   58:aload_0         
		//   33   59:aload           7
		//   34   61:putfield        #119 <Field Boolean _lenient>
		//   35   64:return          
		}
	}


	public abstract OptBoolean lenient();

	public abstract String locale();

	public abstract String pattern();

	public abstract Shape shape();

	public abstract String timezone();

	public abstract Feature[] with();

	public abstract Feature[] without();
}
