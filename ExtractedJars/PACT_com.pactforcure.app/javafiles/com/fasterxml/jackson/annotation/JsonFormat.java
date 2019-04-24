// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue

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
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonFormat$Feature>
		//    4    9:areturn         
		}

		public static Feature[] values()
		{
			return (Feature[])((Feature []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field JsonFormat$Feature[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Feature_3B_.clone()>
		//    2    6:checkcast       #50  <Class JsonFormat$Feature[]>
		//    3    9:areturn         
		}

		private static final Feature $VALUES[];
		public static final Feature ACCEPT_SINGLE_VALUE_AS_ARRAY;
		public static final Feature WRITE_DATES_WITH_ZONE_ID;
		public static final Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
		public static final Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
		public static final Feature WRITE_SORTED_MAP_ENTRIES;

		static 
		{
			ACCEPT_SINGLE_VALUE_AS_ARRAY = new Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
		//    0    0:new             #2   <Class JsonFormat$Feature>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "ACCEPT_SINGLE_VALUE_AS_ARRAY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
		//    5   10:putstatic       #25  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
			WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS = new Feature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 1);
		//    6   13:new             #2   <Class JsonFormat$Feature>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
		//   11   23:putstatic       #28  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
			WRITE_DATES_WITH_ZONE_ID = new Feature("WRITE_DATES_WITH_ZONE_ID", 2);
		//   12   26:new             #2   <Class JsonFormat$Feature>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "WRITE_DATES_WITH_ZONE_ID">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
		//   17   36:putstatic       #31  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
			WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new Feature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 3);
		//   18   39:new             #2   <Class JsonFormat$Feature>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
		//   23   49:putstatic       #34  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
			WRITE_SORTED_MAP_ENTRIES = new Feature("WRITE_SORTED_MAP_ENTRIES", 4);
		//   24   52:new             #2   <Class JsonFormat$Feature>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "WRITE_SORTED_MAP_ENTRIES">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void JsonFormat$Feature(String, int)>
		//   29   62:putstatic       #37  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
			$VALUES = (new Feature[] {
				ACCEPT_SINGLE_VALUE_AS_ARRAY, WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, WRITE_DATES_WITH_ZONE_ID, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, WRITE_SORTED_MAP_ENTRIES
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Feature[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field JsonFormat$Feature ACCEPT_SINGLE_VALUE_AS_ARRAY>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field JsonFormat$Feature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field JsonFormat$Feature WRITE_DATES_WITH_ZONE_ID>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field JsonFormat$Feature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field JsonFormat$Feature WRITE_SORTED_MAP_ENTRIES>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field JsonFormat$Feature[] $VALUES>
		//*  53  102:return          
		}

		private Feature(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
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
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			int l = afeature.length;
		//    2    2:aload_0         
		//    3    3:arraylength     
		//    4    4:istore          4
			for(int j = 0; j < l; j++)
		//*   5    6:iconst_0        
		//*   6    7:istore_3        
		//*   7    8:iload_3         
		//*   8    9:iload           4
		//*   9   11:icmpge          32
				i |= 1 << afeature[j].ordinal();
		//   10   14:iload_2         
		//   11   15:iconst_1        
		//   12   16:aload_0         
		//   13   17:iload_3         
		//   14   18:aaload          
		//   15   19:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//   16   22:ishl            
		//   17   23:ior             
		//   18   24:istore_2        

		//   19   25:iload_3         
		//   20   26:iconst_1        
		//   21   27:iadd            
		//   22   28:istore_3        
		//*  23   29:goto            8
			l = 0;
		//   24   32:iconst_0        
		//   25   33:istore          4
			int i1 = afeature1.length;
		//   26   35:aload_1         
		//   27   36:arraylength     
		//   28   37:istore          5
			for(int k = 0; k < i1; k++)
		//*  29   39:iconst_0        
		//*  30   40:istore_3        
		//*  31   41:iload_3         
		//*  32   42:iload           5
		//*  33   44:icmpge          67
				l |= 1 << afeature1[k].ordinal();
		//   34   47:iload           4
		//   35   49:iconst_1        
		//   36   50:aload_1         
		//   37   51:iload_3         
		//   38   52:aaload          
		//   39   53:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//   40   56:ishl            
		//   41   57:ior             
		//   42   58:istore          4

		//   43   60:iload_3         
		//   44   61:iconst_1        
		//   45   62:iadd            
		//   46   63:istore_3        
		//*  47   64:goto            41
			return new Features(i, l);
		//   48   67:new             #2   <Class JsonFormat$Features>
		//   49   70:dup             
		//   50   71:iload_2         
		//   51   72:iload           4
		//   52   74:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//   53   77:areturn         
		}

		public static Features empty()
		{
			return EMPTY;
		//    0    0:getstatic       #20  <Field JsonFormat$Features EMPTY>
		//    1    3:areturn         
		}

		public boolean equals(Object obj)
		{
			if(obj != this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
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
				if(((Features) (obj))._enabled != _enabled || ((Features) (obj))._disabled != _disabled)
		//*  19   31:aload_1         
		//*  20   32:getfield        #25  <Field int _enabled>
		//*  21   35:aload_0         
		//*  22   36:getfield        #25  <Field int _enabled>
		//*  23   39:icmpne          53
		//*  24   42:aload_1         
		//*  25   43:getfield        #27  <Field int _disabled>
		//*  26   46:aload_0         
		//*  27   47:getfield        #27  <Field int _disabled>
		//*  28   50:icmpeq          5
					return false;
		//   29   53:iconst_0        
		//   30   54:ireturn         
			}
			return true;
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
			if((_enabled & i) != 0)
		//*  12   20:aload_0         
		//*  13   21:getfield        #25  <Field int _enabled>
		//*  14   24:iload_2         
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

		public transient Features with(Feature afeature[])
		{
			int j = _enabled;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int _enabled>
		//    2    4:istore_3        
			int k = afeature.length;
		//    3    5:aload_1         
		//    4    6:arraylength     
		//    5    7:istore          4
			for(int i = 0; i < k; i++)
		//*   6    9:iconst_0        
		//*   7   10:istore_2        
		//*   8   11:iload_2         
		//*   9   12:iload           4
		//*  10   14:icmpge          35
				j |= 1 << afeature[i].ordinal();
		//   11   17:iload_3         
		//   12   18:iconst_1        
		//   13   19:aload_1         
		//   14   20:iload_2         
		//   15   21:aaload          
		//   16   22:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//   17   25:ishl            
		//   18   26:ior             
		//   19   27:istore_3        

		//   20   28:iload_2         
		//   21   29:iconst_1        
		//   22   30:iadd            
		//   23   31:istore_2        
		//*  24   32:goto            11
			if(j == _enabled)
		//*  25   35:iload_3         
		//*  26   36:aload_0         
		//*  27   37:getfield        #25  <Field int _enabled>
		//*  28   40:icmpne          45
				return this;
		//   29   43:aload_0         
		//   30   44:areturn         
			else
				return new Features(j, _disabled);
		//   31   45:new             #2   <Class JsonFormat$Features>
		//   32   48:dup             
		//   33   49:iload_3         
		//   34   50:aload_0         
		//   35   51:getfield        #27  <Field int _disabled>
		//   36   54:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//   37   57:areturn         
		}

		public Features withOverrides(Features features)
		{
			if(features != null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
		//*   2    4:aload_0         
		//*   3    5:areturn         
			{
				int j = features._disabled;
		//    4    6:aload_1         
		//    5    7:getfield        #27  <Field int _disabled>
		//    6   10:istore_3        
				int k = features._enabled;
		//    7   11:aload_1         
		//    8   12:getfield        #25  <Field int _enabled>
		//    9   15:istore          4
				if(j != 0 || k != 0)
		//*  10   17:iload_3         
		//*  11   18:ifne            26
		//*  12   21:iload           4
		//*  13   23:ifeq            4
				{
					if(_enabled == 0 && _disabled == 0)
		//*  14   26:aload_0         
		//*  15   27:getfield        #25  <Field int _enabled>
		//*  16   30:ifne            42
		//*  17   33:aload_0         
		//*  18   34:getfield        #27  <Field int _disabled>
		//*  19   37:ifne            42
						return features;
		//   20   40:aload_1         
		//   21   41:areturn         
					int i = _enabled & ~j | k;
		//   22   42:aload_0         
		//   23   43:getfield        #25  <Field int _enabled>
		//   24   46:iload_3         
		//   25   47:iconst_m1       
		//   26   48:ixor            
		//   27   49:iand            
		//   28   50:iload           4
		//   29   52:ior             
		//   30   53:istore_2        
					j = _disabled & ~k | j;
		//   31   54:aload_0         
		//   32   55:getfield        #27  <Field int _disabled>
		//   33   58:iload           4
		//   34   60:iconst_m1       
		//   35   61:ixor            
		//   36   62:iand            
		//   37   63:iload_3         
		//   38   64:ior             
		//   39   65:istore_3        
					if(i != _enabled || j != _disabled)
		//*  40   66:iload_2         
		//*  41   67:aload_0         
		//*  42   68:getfield        #25  <Field int _enabled>
		//*  43   71:icmpne          82
		//*  44   74:iload_3         
		//*  45   75:aload_0         
		//*  46   76:getfield        #27  <Field int _disabled>
		//*  47   79:icmpeq          4
						return new Features(i, j);
		//   48   82:new             #2   <Class JsonFormat$Features>
		//   49   85:dup             
		//   50   86:iload_2         
		//   51   87:iload_3         
		//   52   88:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//   53   91:areturn         
				}
			}
			return this;
		}

		public transient Features without(Feature afeature[])
		{
			int j = _disabled;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int _disabled>
		//    2    4:istore_3        
			int k = afeature.length;
		//    3    5:aload_1         
		//    4    6:arraylength     
		//    5    7:istore          4
			for(int i = 0; i < k; i++)
		//*   6    9:iconst_0        
		//*   7   10:istore_2        
		//*   8   11:iload_2         
		//*   9   12:iload           4
		//*  10   14:icmpge          35
				j |= 1 << afeature[i].ordinal();
		//   11   17:iload_3         
		//   12   18:iconst_1        
		//   13   19:aload_1         
		//   14   20:iload_2         
		//   15   21:aaload          
		//   16   22:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
		//   17   25:ishl            
		//   18   26:ior             
		//   19   27:istore_3        

		//   20   28:iload_2         
		//   21   29:iconst_1        
		//   22   30:iadd            
		//   23   31:istore_2        
		//*  24   32:goto            11
			if(j == _disabled)
		//*  25   35:iload_3         
		//*  26   36:aload_0         
		//*  27   37:getfield        #27  <Field int _disabled>
		//*  28   40:icmpne          45
				return this;
		//   29   43:aload_0         
		//   30   44:areturn         
			else
				return new Features(_enabled, j);
		//   31   45:new             #2   <Class JsonFormat$Features>
		//   32   48:dup             
		//   33   49:aload_0         
		//   34   50:getfield        #25  <Field int _enabled>
		//   35   53:iload_3         
		//   36   54:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
		//   37   57:areturn         
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
		//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonFormat$Shape>
		//    4    9:areturn         
		}

		public static Shape[] values()
		{
			return (Shape[])((Shape []) ($VALUES)).clone();
		//    0    0:getstatic       #55  <Field JsonFormat$Shape[] $VALUES>
		//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Shape_3B_.clone()>
		//    2    6:checkcast       #66  <Class JsonFormat$Shape[]>
		//    3    9:areturn         
		}

		public boolean isNumeric()
		{
			return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
		//    0    0:aload_0         
		//    1    1:getstatic       #41  <Field JsonFormat$Shape NUMBER>
		//    2    4:if_acmpeq       21
		//    3    7:aload_0         
		//    4    8:getstatic       #47  <Field JsonFormat$Shape NUMBER_INT>
		//    5   11:if_acmpeq       21
		//    6   14:aload_0         
		//    7   15:getstatic       #44  <Field JsonFormat$Shape NUMBER_FLOAT>
		//    8   18:if_acmpne       23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public boolean isStructured()
		{
			return this == OBJECT || this == ARRAY;
		//    0    0:aload_0         
		//    1    1:getstatic       #38  <Field JsonFormat$Shape OBJECT>
		//    2    4:if_acmpeq       14
		//    3    7:aload_0         
		//    4    8:getstatic       #35  <Field JsonFormat$Shape ARRAY>
		//    5   11:if_acmpne       16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		private static final Shape $VALUES[];
		public static final Shape ANY;
		public static final Shape ARRAY;
		public static final Shape BOOLEAN;
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
		//    2    4:ldc1            #23  <String "ANY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//    5   10:putstatic       #29  <Field JsonFormat$Shape ANY>
			SCALAR = new Shape("SCALAR", 1);
		//    6   13:new             #2   <Class JsonFormat$Shape>
		//    7   16:dup             
		//    8   17:ldc1            #30  <String "SCALAR">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   11   23:putstatic       #32  <Field JsonFormat$Shape SCALAR>
			ARRAY = new Shape("ARRAY", 2);
		//   12   26:new             #2   <Class JsonFormat$Shape>
		//   13   29:dup             
		//   14   30:ldc1            #33  <String "ARRAY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   17   36:putstatic       #35  <Field JsonFormat$Shape ARRAY>
			OBJECT = new Shape("OBJECT", 3);
		//   18   39:new             #2   <Class JsonFormat$Shape>
		//   19   42:dup             
		//   20   43:ldc1            #36  <String "OBJECT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   23   49:putstatic       #38  <Field JsonFormat$Shape OBJECT>
			NUMBER = new Shape("NUMBER", 4);
		//   24   52:new             #2   <Class JsonFormat$Shape>
		//   25   55:dup             
		//   26   56:ldc1            #39  <String "NUMBER">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   29   62:putstatic       #41  <Field JsonFormat$Shape NUMBER>
			NUMBER_FLOAT = new Shape("NUMBER_FLOAT", 5);
		//   30   65:new             #2   <Class JsonFormat$Shape>
		//   31   68:dup             
		//   32   69:ldc1            #42  <String "NUMBER_FLOAT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   35   75:putstatic       #44  <Field JsonFormat$Shape NUMBER_FLOAT>
			NUMBER_INT = new Shape("NUMBER_INT", 6);
		//   36   78:new             #2   <Class JsonFormat$Shape>
		//   37   81:dup             
		//   38   82:ldc1            #45  <String "NUMBER_INT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   41   89:putstatic       #47  <Field JsonFormat$Shape NUMBER_INT>
			STRING = new Shape("STRING", 7);
		//   42   92:new             #2   <Class JsonFormat$Shape>
		//   43   95:dup             
		//   44   96:ldc1            #48  <String "STRING">
		//   45   98:bipush          7
		//   46  100:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   47  103:putstatic       #50  <Field JsonFormat$Shape STRING>
			BOOLEAN = new Shape("BOOLEAN", 8);
		//   48  106:new             #2   <Class JsonFormat$Shape>
		//   49  109:dup             
		//   50  110:ldc1            #51  <String "BOOLEAN">
		//   51  112:bipush          8
		//   52  114:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
		//   53  117:putstatic       #53  <Field JsonFormat$Shape BOOLEAN>
			$VALUES = (new Shape[] {
				ANY, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN
			});
		//   54  120:bipush          9
		//   55  122:anewarray       Shape[]
		//   56  125:dup             
		//   57  126:iconst_0        
		//   58  127:getstatic       #29  <Field JsonFormat$Shape ANY>
		//   59  130:aastore         
		//   60  131:dup             
		//   61  132:iconst_1        
		//   62  133:getstatic       #32  <Field JsonFormat$Shape SCALAR>
		//   63  136:aastore         
		//   64  137:dup             
		//   65  138:iconst_2        
		//   66  139:getstatic       #35  <Field JsonFormat$Shape ARRAY>
		//   67  142:aastore         
		//   68  143:dup             
		//   69  144:iconst_3        
		//   70  145:getstatic       #38  <Field JsonFormat$Shape OBJECT>
		//   71  148:aastore         
		//   72  149:dup             
		//   73  150:iconst_4        
		//   74  151:getstatic       #41  <Field JsonFormat$Shape NUMBER>
		//   75  154:aastore         
		//   76  155:dup             
		//   77  156:iconst_5        
		//   78  157:getstatic       #44  <Field JsonFormat$Shape NUMBER_FLOAT>
		//   79  160:aastore         
		//   80  161:dup             
		//   81  162:bipush          6
		//   82  164:getstatic       #47  <Field JsonFormat$Shape NUMBER_INT>
		//   83  167:aastore         
		//   84  168:dup             
		//   85  169:bipush          7
		//   86  171:getstatic       #50  <Field JsonFormat$Shape STRING>
		//   87  174:aastore         
		//   88  175:dup             
		//   89  176:bipush          8
		//   90  178:getstatic       #53  <Field JsonFormat$Shape BOOLEAN>
		//   91  181:aastore         
		//   92  182:putstatic       #55  <Field JsonFormat$Shape[] $VALUES>
		//*  93  185:return          
		}

		private Shape(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void Enum(String, int)>
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
			} else
		//*   8   12:iload_2         
		//*   9   13:ireturn         
			if(obj1 != null)
		//*  10   14:aload_1         
		//*  11   15:ifnull          12
				return obj.equals(obj1);
		//   12   18:aload_0         
		//   13   19:aload_1         
		//   14   20:invokevirtual   #116 <Method boolean Object.equals(Object)>
		//   15   23:ireturn         
			return flag;
		}

		public static final Value empty()
		{
			return EMPTY;
		//    0    0:getstatic       #36  <Field JsonFormat$Value EMPTY>
		//    1    3:areturn         
		}

		public static Value forPattern(String s)
		{
			return new Value(s, ((Shape) (null)), ((Locale) (null)), ((String) (null)), ((TimeZone) (null)), Features.empty());
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    8   12:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//    9   15:areturn         
		}

		public static Value forShape(Shape shape1)
		{
			return new Value(((String) (null)), shape1, ((Locale) (null)), ((String) (null)), ((TimeZone) (null)), Features.empty());
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    8   12:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//    9   15:areturn         
		}

		public static final Value from(JsonFormat jsonformat)
		{
			if(jsonformat == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			else
				return new Value(jsonformat);
		//    4    6:new             #2   <Class JsonFormat$Value>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokespecial   #127 <Method void JsonFormat$Value(JsonFormat)>
		//    8   14:areturn         
		}

		public boolean equals(Object obj)
		{
			boolean flag2 = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			boolean flag3 = false;
		//    2    2:iconst_0        
		//    3    3:istore          4
			boolean flag;
			if(obj == this)
		//*   4    5:aload_1         
		//*   5    6:aload_0         
		//*   6    7:if_acmpne       14
			{
				flag = true;
		//    7   10:iconst_1        
		//    8   11:istore_2        
			} else
		//*   9   12:iload_2         
		//*  10   13:ireturn         
			{
				flag = flag3;
		//   11   14:iload           4
		//   12   16:istore_2        
				if(obj != null)
		//*  13   17:aload_1         
		//*  14   18:ifnull          12
				{
					flag = flag3;
		//   15   21:iload           4
		//   16   23:istore_2        
					if(obj.getClass() == ((Object)this).getClass())
		//*  17   24:aload_1         
		//*  18   25:invokevirtual   #131 <Method Class Object.getClass()>
		//*  19   28:aload_0         
		//*  20   29:invokevirtual   #131 <Method Class Object.getClass()>
		//*  21   32:if_acmpne       12
					{
						obj = ((Object) ((Value)obj));
		//   22   35:aload_1         
		//   23   36:checkcast       #2   <Class JsonFormat$Value>
		//   24   39:astore_1        
						flag = flag3;
		//   25   40:iload           4
		//   26   42:istore_2        
						if(_shape == ((Value) (obj))._shape)
		//*  27   43:aload_0         
		//*  28   44:getfield        #101 <Field JsonFormat$Shape _shape>
		//*  29   47:aload_1         
		//*  30   48:getfield        #101 <Field JsonFormat$Shape _shape>
		//*  31   51:if_acmpne       12
						{
							flag = flag3;
		//   32   54:iload           4
		//   33   56:istore_2        
							if(_features.equals(((Object) (((Value) (obj))._features))))
		//*  34   57:aload_0         
		//*  35   58:getfield        #109 <Field JsonFormat$Features _features>
		//*  36   61:aload_1         
		//*  37   62:getfield        #109 <Field JsonFormat$Features _features>
		//*  38   65:invokevirtual   #132 <Method boolean JsonFormat$Features.equals(Object)>
		//*  39   68:ifeq            12
							{
								boolean flag1;
								if(_equal(((Object) (_timezoneStr)), ((Object) (((Value) (obj))._timezoneStr))) && _equal(((Object) (_pattern)), ((Object) (((Value) (obj))._pattern))) && _equal(((Object) (_timezone)), ((Object) (((Value) (obj))._timezone))) && _equal(((Object) (_locale)), ((Object) (((Value) (obj))._locale))))
		//*  40   71:aload_0         
		//*  41   72:getfield        #107 <Field String _timezoneStr>
		//*  42   75:aload_1         
		//*  43   76:getfield        #107 <Field String _timezoneStr>
		//*  44   79:invokestatic    #134 <Method boolean _equal(Object, Object)>
		//*  45   82:ifeq            131
		//*  46   85:aload_0         
		//*  47   86:getfield        #99  <Field String _pattern>
		//*  48   89:aload_1         
		//*  49   90:getfield        #99  <Field String _pattern>
		//*  50   93:invokestatic    #134 <Method boolean _equal(Object, Object)>
		//*  51   96:ifeq            131
		//*  52   99:aload_0         
		//*  53  100:getfield        #105 <Field TimeZone _timezone>
		//*  54  103:aload_1         
		//*  55  104:getfield        #105 <Field TimeZone _timezone>
		//*  56  107:invokestatic    #134 <Method boolean _equal(Object, Object)>
		//*  57  110:ifeq            131
		//*  58  113:aload_0         
		//*  59  114:getfield        #103 <Field Locale _locale>
		//*  60  117:aload_1         
		//*  61  118:getfield        #103 <Field Locale _locale>
		//*  62  121:invokestatic    #134 <Method boolean _equal(Object, Object)>
		//*  63  124:ifeq            131
									flag1 = flag2;
		//   64  127:iload_3         
		//   65  128:istore_2        
								else
		//*  66  129:iload_2         
		//*  67  130:ireturn         
									flag1 = false;
		//   68  131:iconst_0        
		//   69  132:istore_2        
								return flag1;
							}
						}
					}
				}
			}
			return flag;
		//*  70  133:goto            129
		}

		public Boolean getFeature(Feature feature)
		{
			return _features.get(feature);
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field JsonFormat$Features _features>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #139 <Method Boolean JsonFormat$Features.get(JsonFormat$Feature)>
		//    4    8:areturn         
		}

		public Locale getLocale()
		{
			return _locale;
		//    0    0:aload_0         
		//    1    1:getfield        #103 <Field Locale _locale>
		//    2    4:areturn         
		}

		public String getPattern()
		{
			return _pattern;
		//    0    0:aload_0         
		//    1    1:getfield        #99  <Field String _pattern>
		//    2    4:areturn         
		}

		public Shape getShape()
		{
			return _shape;
		//    0    0:aload_0         
		//    1    1:getfield        #101 <Field JsonFormat$Shape _shape>
		//    2    4:areturn         
		}

		public TimeZone getTimeZone()
		{
			TimeZone timezone2 = _timezone;
		//    0    0:aload_0         
		//    1    1:getfield        #105 <Field TimeZone _timezone>
		//    2    4:astore_2        
			TimeZone timezone1 = timezone2;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(timezone2 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       33
			{
				if(_timezoneStr == null)
		//*   7   11:aload_0         
		//*   8   12:getfield        #107 <Field String _timezoneStr>
		//*   9   15:ifnonnull       20
					return null;
		//   10   18:aconst_null     
		//   11   19:areturn         
				timezone1 = TimeZone.getTimeZone(_timezoneStr);
		//   12   20:aload_0         
		//   13   21:getfield        #107 <Field String _timezoneStr>
		//   14   24:invokestatic    #150 <Method TimeZone TimeZone.getTimeZone(String)>
		//   15   27:astore_1        
				_timezone = timezone1;
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:putfield        #105 <Field TimeZone _timezone>
			}
			return timezone1;
		//   19   33:aload_1         
		//   20   34:areturn         
		}

		public boolean hasLocale()
		{
			return _locale != null;
		//    0    0:aload_0         
		//    1    1:getfield        #103 <Field Locale _locale>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public boolean hasPattern()
		{
			return _pattern != null && _pattern.length() > 0;
		//    0    0:aload_0         
		//    1    1:getfield        #99  <Field String _pattern>
		//    2    4:ifnull          19
		//    3    7:aload_0         
		//    4    8:getfield        #99  <Field String _pattern>
		//    5   11:invokevirtual   #81  <Method int String.length()>
		//    6   14:ifle            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public boolean hasShape()
		{
			return _shape != Shape.ANY;
		//    0    0:aload_0         
		//    1    1:getfield        #101 <Field JsonFormat$Shape _shape>
		//    2    4:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//    3    7:if_acmpeq       12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public boolean hasTimeZone()
		{
			return _timezone != null || _timezoneStr != null && !_timezoneStr.isEmpty();
		//    0    0:aload_0         
		//    1    1:getfield        #105 <Field TimeZone _timezone>
		//    2    4:ifnonnull       24
		//    3    7:aload_0         
		//    4    8:getfield        #107 <Field String _timezoneStr>
		//    5   11:ifnull          26
		//    6   14:aload_0         
		//    7   15:getfield        #107 <Field String _timezoneStr>
		//    8   18:invokevirtual   #158 <Method boolean String.isEmpty()>
		//    9   21:ifne            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public int hashCode()
		{
			int i;
			int j;
			if(_timezoneStr == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #107 <Field String _timezoneStr>
		//*   2    4:ifnonnull       67
				i = 1;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:iload_1         
		//*   6   10:istore_2        
		//*   7   11:aload_0         
		//*   8   12:getfield        #99  <Field String _pattern>
		//*   9   15:ifnull          28
		//*  10   18:iload_1         
		//*  11   19:aload_0         
		//*  12   20:getfield        #99  <Field String _pattern>
		//*  13   23:invokevirtual   #161 <Method int String.hashCode()>
		//*  14   26:ixor            
		//*  15   27:istore_2        
		//*  16   28:iload_2         
		//*  17   29:aload_0         
		//*  18   30:getfield        #101 <Field JsonFormat$Shape _shape>
		//*  19   33:invokevirtual   #162 <Method int JsonFormat$Shape.hashCode()>
		//*  20   36:iadd            
		//*  21   37:istore_2        
		//*  22   38:iload_2         
		//*  23   39:istore_1        
		//*  24   40:aload_0         
		//*  25   41:getfield        #103 <Field Locale _locale>
		//*  26   44:ifnull          57
		//*  27   47:iload_2         
		//*  28   48:aload_0         
		//*  29   49:getfield        #103 <Field Locale _locale>
		//*  30   52:invokevirtual   #163 <Method int Locale.hashCode()>
		//*  31   55:ixor            
		//*  32   56:istore_1        
		//*  33   57:iload_1         
		//*  34   58:aload_0         
		//*  35   59:getfield        #109 <Field JsonFormat$Features _features>
		//*  36   62:invokevirtual   #164 <Method int JsonFormat$Features.hashCode()>
		//*  37   65:iadd            
		//*  38   66:ireturn         
				i = _timezoneStr.hashCode();
		//   39   67:aload_0         
		//   40   68:getfield        #107 <Field String _timezoneStr>
		//   41   71:invokevirtual   #161 <Method int String.hashCode()>
		//   42   74:istore_1        
			j = i;
			if(_pattern != null)
				j = i ^ _pattern.hashCode();
			j += _shape.hashCode();
			i = j;
			if(_locale != null)
				i = j ^ _locale.hashCode();
			return i + _features.hashCode();
		//*  43   75:goto            9
		}

		public String timeZoneAsString()
		{
			if(_timezone != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #105 <Field TimeZone _timezone>
		//*   2    4:ifnull          15
				return _timezone.getID();
		//    3    7:aload_0         
		//    4    8:getfield        #105 <Field TimeZone _timezone>
		//    5   11:invokevirtual   #168 <Method String TimeZone.getID()>
		//    6   14:areturn         
			else
				return _timezoneStr;
		//    7   15:aload_0         
		//    8   16:getfield        #107 <Field String _timezoneStr>
		//    9   19:areturn         
		}

		public String toString()
		{
			return String.format("[pattern=%s,shape=%s,locale=%s,timezone=%s]", new Object[] {
				_pattern, _shape, _locale, _timezoneStr
			});
		//    0    0:ldc1            #171 <String "[pattern=%s,shape=%s,locale=%s,timezone=%s]">
		//    1    2:iconst_4        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #99  <Field String _pattern>
		//    7   12:aastore         
		//    8   13:dup             
		//    9   14:iconst_1        
		//   10   15:aload_0         
		//   11   16:getfield        #101 <Field JsonFormat$Shape _shape>
		//   12   19:aastore         
		//   13   20:dup             
		//   14   21:iconst_2        
		//   15   22:aload_0         
		//   16   23:getfield        #103 <Field Locale _locale>
		//   17   26:aastore         
		//   18   27:dup             
		//   19   28:iconst_3        
		//   20   29:aload_0         
		//   21   30:getfield        #107 <Field String _timezoneStr>
		//   22   33:aastore         
		//   23   34:invokestatic    #175 <Method String String.format(String, Object[])>
		//   24   37:areturn         
		}

		public Class valueFor()
		{
			return com/fasterxml/jackson/annotation/JsonFormat;
		//    0    0:ldc1            #11  <Class JsonFormat>
		//    1    2:areturn         
		}

		public Value withFeature(Feature feature)
		{
			feature = ((Feature) (_features.with(new Feature[] {
				feature
			})));
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field JsonFormat$Features _features>
		//    2    4:iconst_1        
		//    3    5:anewarray       Feature[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_1         
		//    7   11:aastore         
		//    8   12:invokevirtual   #185 <Method JsonFormat$Features JsonFormat$Features.with(JsonFormat$Feature[])>
		//    9   15:astore_1        
			if(feature == _features)
		//*  10   16:aload_1         
		//*  11   17:aload_0         
		//*  12   18:getfield        #109 <Field JsonFormat$Features _features>
		//*  13   21:if_acmpne       26
				return this;
		//   14   24:aload_0         
		//   15   25:areturn         
			else
				return new Value(_pattern, _shape, _locale, _timezoneStr, _timezone, ((Features) (feature)));
		//   16   26:new             #2   <Class JsonFormat$Value>
		//   17   29:dup             
		//   18   30:aload_0         
		//   19   31:getfield        #99  <Field String _pattern>
		//   20   34:aload_0         
		//   21   35:getfield        #101 <Field JsonFormat$Shape _shape>
		//   22   38:aload_0         
		//   23   39:getfield        #103 <Field Locale _locale>
		//   24   42:aload_0         
		//   25   43:getfield        #107 <Field String _timezoneStr>
		//   26   46:aload_0         
		//   27   47:getfield        #105 <Field TimeZone _timezone>
		//   28   50:aload_1         
		//   29   51:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//   30   54:areturn         
		}

		public Value withLocale(Locale locale1)
		{
			return new Value(_pattern, _shape, locale1, _timezoneStr, _timezone, _features);
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #99  <Field String _pattern>
		//    4    8:aload_0         
		//    5    9:getfield        #101 <Field JsonFormat$Shape _shape>
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #107 <Field String _timezoneStr>
		//    9   17:aload_0         
		//   10   18:getfield        #105 <Field TimeZone _timezone>
		//   11   21:aload_0         
		//   12   22:getfield        #109 <Field JsonFormat$Features _features>
		//   13   25:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//   14   28:areturn         
		}

		public final Value withOverrides(Value value)
		{
			Value value1;
			if(value == null || value == EMPTY)
		//*   0    0:aload_1         
		//*   1    1:ifnull          11
		//*   2    4:aload_1         
		//*   3    5:getstatic       #36  <Field JsonFormat$Value EMPTY>
		//*   4    8:if_acmpne       15
			{
				value1 = this;
		//    5   11:aload_0         
		//    6   12:astore_2        
			} else
		//*   7   13:aload_2         
		//*   8   14:areturn         
			{
				value1 = value;
		//    9   15:aload_1         
		//   10   16:astore_2        
				if(this != EMPTY)
		//*  11   17:aload_0         
		//*  12   18:getstatic       #36  <Field JsonFormat$Value EMPTY>
		//*  13   21:if_acmpeq       13
				{
					String s;
label0:
					{
						String s1 = value._pattern;
		//   14   24:aload_1         
		//   15   25:getfield        #99  <Field String _pattern>
		//   16   28:astore_3        
						if(s1 != null)
		//*  17   29:aload_3         
		//*  18   30:ifnull          42
						{
							s = s1;
		//   19   33:aload_3         
		//   20   34:astore_2        
							if(!s1.isEmpty())
								break label0;
		//   21   35:aload_3         
		//   22   36:invokevirtual   #158 <Method boolean String.isEmpty()>
		//   23   39:ifeq            47
						}
						s = _pattern;
		//   24   42:aload_0         
		//   25   43:getfield        #99  <Field String _pattern>
		//   26   46:astore_2        
					}
					Object obj = ((Object) (value._shape));
		//   27   47:aload_1         
		//   28   48:getfield        #101 <Field JsonFormat$Shape _shape>
		//   29   51:astore          4
					Shape shape1 = ((Shape) (obj));
		//   30   53:aload           4
		//   31   55:astore_3        
					if(obj == Shape.ANY)
		//*  32   56:aload           4
		//*  33   58:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//*  34   61:if_acmpne       69
						shape1 = _shape;
		//   35   64:aload_0         
		//   36   65:getfield        #101 <Field JsonFormat$Shape _shape>
		//   37   68:astore_3        
					Object obj1 = ((Object) (value._locale));
		//   38   69:aload_1         
		//   39   70:getfield        #103 <Field Locale _locale>
		//   40   73:astore          5
					obj = obj1;
		//   41   75:aload           5
		//   42   77:astore          4
					if(obj1 == null)
		//*  43   79:aload           5
		//*  44   81:ifnonnull       90
						obj = ((Object) (_locale));
		//   45   84:aload_0         
		//   46   85:getfield        #103 <Field Locale _locale>
		//   47   88:astore          4
					obj1 = ((Object) (_features));
		//   48   90:aload_0         
		//   49   91:getfield        #109 <Field JsonFormat$Features _features>
		//   50   94:astore          5
					Object obj2;
					if(obj1 == null)
		//*  51   96:aload           5
		//*  52   98:ifnonnull       154
						obj1 = ((Object) (value._features));
		//   53  101:aload_1         
		//   54  102:getfield        #109 <Field JsonFormat$Features _features>
		//   55  105:astore          5
					else
		//*  56  107:aload_1         
		//*  57  108:getfield        #107 <Field String _timezoneStr>
		//*  58  111:astore          6
		//*  59  113:aload           6
		//*  60  115:ifnull          126
		//*  61  118:aload           6
		//*  62  120:invokevirtual   #158 <Method boolean String.isEmpty()>
		//*  63  123:ifeq            168
		//*  64  126:aload_0         
		//*  65  127:getfield        #107 <Field String _timezoneStr>
		//*  66  130:astore_1        
		//*  67  131:aload_0         
		//*  68  132:getfield        #105 <Field TimeZone _timezone>
		//*  69  135:astore          6
		//*  70  137:new             #2   <Class JsonFormat$Value>
		//*  71  140:dup             
		//*  72  141:aload_2         
		//*  73  142:aload_3         
		//*  74  143:aload           4
		//*  75  145:aload_1         
		//*  76  146:aload           6
		//*  77  148:aload           5
		//*  78  150:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//*  79  153:areturn         
						obj1 = ((Object) (((Features) (obj1)).withOverrides(value._features)));
		//   80  154:aload           5
		//   81  156:aload_1         
		//   82  157:getfield        #109 <Field JsonFormat$Features _features>
		//   83  160:invokevirtual   #192 <Method JsonFormat$Features JsonFormat$Features.withOverrides(JsonFormat$Features)>
		//   84  163:astore          5
					obj2 = ((Object) (value._timezoneStr));
					if(obj2 == null || ((String) (obj2)).isEmpty())
					{
						value = ((Value) (_timezoneStr));
						obj2 = ((Object) (_timezone));
					} else
		//*  85  165:goto            107
					{
						TimeZone timezone1 = value._timezone;
		//   86  168:aload_1         
		//   87  169:getfield        #105 <Field TimeZone _timezone>
		//   88  172:astore          7
						value = ((Value) (obj2));
		//   89  174:aload           6
		//   90  176:astore_1        
						obj2 = ((Object) (timezone1));
		//   91  177:aload           7
		//   92  179:astore          6
					}
					return new Value(s, shape1, ((Locale) (obj)), ((String) (value)), ((TimeZone) (obj2)), ((Features) (obj1)));
				}
			}
			return value1;
		//*  93  181:goto            137
		}

		public Value withPattern(String s)
		{
			return new Value(s, _shape, _locale, _timezoneStr, _timezone, _features);
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #101 <Field JsonFormat$Shape _shape>
		//    5    9:aload_0         
		//    6   10:getfield        #103 <Field Locale _locale>
		//    7   13:aload_0         
		//    8   14:getfield        #107 <Field String _timezoneStr>
		//    9   17:aload_0         
		//   10   18:getfield        #105 <Field TimeZone _timezone>
		//   11   21:aload_0         
		//   12   22:getfield        #109 <Field JsonFormat$Features _features>
		//   13   25:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//   14   28:areturn         
		}

		public Value withShape(Shape shape1)
		{
			return new Value(_pattern, shape1, _locale, _timezoneStr, _timezone, _features);
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #99  <Field String _pattern>
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #103 <Field Locale _locale>
		//    7   13:aload_0         
		//    8   14:getfield        #107 <Field String _timezoneStr>
		//    9   17:aload_0         
		//   10   18:getfield        #105 <Field TimeZone _timezone>
		//   11   21:aload_0         
		//   12   22:getfield        #109 <Field JsonFormat$Features _features>
		//   13   25:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//   14   28:areturn         
		}

		public Value withTimeZone(TimeZone timezone1)
		{
			return new Value(_pattern, _shape, _locale, ((String) (null)), timezone1, _features);
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #99  <Field String _pattern>
		//    4    8:aload_0         
		//    5    9:getfield        #101 <Field JsonFormat$Shape _shape>
		//    6   12:aload_0         
		//    7   13:getfield        #103 <Field Locale _locale>
		//    8   16:aconst_null     
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #109 <Field JsonFormat$Features _features>
		//   12   22:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//   13   25:areturn         
		}

		public Value withoutFeature(Feature feature)
		{
			feature = ((Feature) (_features.without(new Feature[] {
				feature
			})));
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field JsonFormat$Features _features>
		//    2    4:iconst_1        
		//    3    5:anewarray       Feature[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_1         
		//    7   11:aastore         
		//    8   12:invokevirtual   #200 <Method JsonFormat$Features JsonFormat$Features.without(JsonFormat$Feature[])>
		//    9   15:astore_1        
			if(feature == _features)
		//*  10   16:aload_1         
		//*  11   17:aload_0         
		//*  12   18:getfield        #109 <Field JsonFormat$Features _features>
		//*  13   21:if_acmpne       26
				return this;
		//   14   24:aload_0         
		//   15   25:areturn         
			else
				return new Value(_pattern, _shape, _locale, _timezoneStr, _timezone, ((Features) (feature)));
		//   16   26:new             #2   <Class JsonFormat$Value>
		//   17   29:dup             
		//   18   30:aload_0         
		//   19   31:getfield        #99  <Field String _pattern>
		//   20   34:aload_0         
		//   21   35:getfield        #101 <Field JsonFormat$Shape _shape>
		//   22   38:aload_0         
		//   23   39:getfield        #103 <Field Locale _locale>
		//   24   42:aload_0         
		//   25   43:getfield        #107 <Field String _timezoneStr>
		//   26   46:aload_0         
		//   27   47:getfield        #105 <Field TimeZone _timezone>
		//   28   50:aload_1         
		//   29   51:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//   30   54:areturn         
		}

		private static final Value EMPTY = new Value();
		private static final long serialVersionUID = 1L;
		private final Features _features;
		private final Locale _locale;
		private final String _pattern;
		private final Shape _shape;
		private transient TimeZone _timezone;
		private final String _timezoneStr;

		static 
		{
		//    0    0:new             #2   <Class JsonFormat$Value>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void JsonFormat$Value()>
		//    3    7:putstatic       #36  <Field JsonFormat$Value EMPTY>
		//*   4   10:return          
		}

		public Value()
		{
			this("", Shape.ANY, "", "", Features.empty());
		//    0    0:aload_0         
		//    1    1:ldc1            #39  <String "">
		//    2    3:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//    3    6:ldc1            #39  <String "">
		//    4    8:ldc1            #39  <String "">
		//    5   10:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    6   13:invokespecial   #53  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features)>
		//    7   16:return          
		}

		public Value(JsonFormat jsonformat)
		{
			this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone(), Features.construct(jsonformat));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #58  <Method String JsonFormat.pattern()>
		//    3    7:aload_1         
		//    4    8:invokeinterface #62  <Method JsonFormat$Shape JsonFormat.shape()>
		//    5   13:aload_1         
		//    6   14:invokeinterface #65  <Method String JsonFormat.locale()>
		//    7   19:aload_1         
		//    8   20:invokeinterface #68  <Method String JsonFormat.timezone()>
		//    9   25:aload_1         
		//   10   26:invokestatic    #72  <Method JsonFormat$Features JsonFormat$Features.construct(JsonFormat)>
		//   11   29:invokespecial   #53  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features)>
		//   12   32:return          
		}

		public Value(String s, Shape shape1, String s1, String s2)
		{
			this(s, shape1, s1, s2, Features.empty());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    6    9:invokespecial   #53  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features)>
		//    7   12:return          
		}

		public Value(String s, Shape shape1, String s1, String s2, Features features)
		{
			if(s1 == null || s1.length() == 0 || "##default".equals(((Object) (s1))))
		//*   0    0:aload_3         
		//*   1    1:ifnull          20
		//*   2    4:aload_3         
		//*   3    5:invokevirtual   #81  <Method int String.length()>
		//*   4    8:ifeq            20
		//*   5   11:ldc1            #83  <String "##default">
		//*   6   13:aload_3         
		//*   7   14:invokevirtual   #87  <Method boolean String.equals(Object)>
		//*   8   17:ifeq            61
				s1 = null;
		//    9   20:aconst_null     
		//   10   21:astore_3        
			else
		//*  11   22:aload           4
		//*  12   24:ifnull          45
		//*  13   27:aload           4
		//*  14   29:invokevirtual   #81  <Method int String.length()>
		//*  15   32:ifeq            45
		//*  16   35:ldc1            #83  <String "##default">
		//*  17   37:aload           4
		//*  18   39:invokevirtual   #87  <Method boolean String.equals(Object)>
		//*  19   42:ifeq            73
		//*  20   45:aconst_null     
		//*  21   46:astore          4
		//*  22   48:aload_0         
		//*  23   49:aload_1         
		//*  24   50:aload_2         
		//*  25   51:aload_3         
		//*  26   52:aload           4
		//*  27   54:aconst_null     
		//*  28   55:aload           5
		//*  29   57:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//*  30   60:return          
				s1 = ((String) (new Locale(s1)));
		//   31   61:new             #92  <Class Locale>
		//   32   64:dup             
		//   33   65:aload_3         
		//   34   66:invokespecial   #95  <Method void Locale(String)>
		//   35   69:astore_3        
			if(s2 == null || s2.length() == 0 || "##default".equals(((Object) (s2))))
				s2 = null;
			this(s, shape1, ((Locale) (s1)), s2, ((TimeZone) (null)), features);
		//*  36   70:goto            22
		//*  37   73:goto            48
		}

		public Value(String s, Shape shape1, Locale locale1, String s1, TimeZone timezone1)
		{
			this(s, shape1, locale1, s1, timezone1, Features.empty());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:aload           5
		//    6    8:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    7   11:invokespecial   #90  <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, String, TimeZone, JsonFormat$Features)>
		//    8   14:return          
		}

		public Value(String s, Shape shape1, Locale locale1, String s1, TimeZone timezone1, Features features)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #97  <Method void Object()>
			_pattern = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #99  <Field String _pattern>
			s = ((String) (shape1));
		//    5    9:aload_2         
		//    6   10:astore_1        
			if(shape1 == null)
		//*   7   11:aload_2         
		//*   8   12:ifnonnull       19
				s = ((String) (Shape.ANY));
		//    9   15:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//   10   18:astore_1        
			_shape = ((Shape) (s));
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #101 <Field JsonFormat$Shape _shape>
			_locale = locale1;
		//   14   24:aload_0         
		//   15   25:aload_3         
		//   16   26:putfield        #103 <Field Locale _locale>
			_timezone = timezone1;
		//   17   29:aload_0         
		//   18   30:aload           5
		//   19   32:putfield        #105 <Field TimeZone _timezone>
			_timezoneStr = s1;
		//   20   35:aload_0         
		//   21   36:aload           4
		//   22   38:putfield        #107 <Field String _timezoneStr>
			s = ((String) (features));
		//   23   41:aload           6
		//   24   43:astore_1        
			if(features == null)
		//*  25   44:aload           6
		//*  26   46:ifnonnull       53
				s = ((String) (Features.empty()));
		//   27   49:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//   28   52:astore_1        
			_features = ((Features) (s));
		//   29   53:aload_0         
		//   30   54:aload_1         
		//   31   55:putfield        #109 <Field JsonFormat$Features _features>
		//   32   58:return          
		}

		public Value(String s, Shape shape1, Locale locale1, TimeZone timezone1)
		{
			this(s, shape1, locale1, timezone1, Features.empty());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//    6    9:invokespecial   #113 <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, TimeZone, JsonFormat$Features)>
		//    7   12:return          
		}

		public Value(String s, Shape shape1, Locale locale1, TimeZone timezone1, Features features)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #97  <Method void Object()>
			_pattern = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #99  <Field String _pattern>
			s = ((String) (shape1));
		//    5    9:aload_2         
		//    6   10:astore_1        
			if(shape1 == null)
		//*   7   11:aload_2         
		//*   8   12:ifnonnull       19
				s = ((String) (Shape.ANY));
		//    9   15:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
		//   10   18:astore_1        
			_shape = ((Shape) (s));
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #101 <Field JsonFormat$Shape _shape>
			_locale = locale1;
		//   14   24:aload_0         
		//   15   25:aload_3         
		//   16   26:putfield        #103 <Field Locale _locale>
			_timezone = timezone1;
		//   17   29:aload_0         
		//   18   30:aload           4
		//   19   32:putfield        #105 <Field TimeZone _timezone>
			_timezoneStr = null;
		//   20   35:aload_0         
		//   21   36:aconst_null     
		//   22   37:putfield        #107 <Field String _timezoneStr>
			s = ((String) (features));
		//   23   40:aload           5
		//   24   42:astore_1        
			if(features == null)
		//*  25   43:aload           5
		//*  26   45:ifnonnull       52
				s = ((String) (Features.empty()));
		//   27   48:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
		//   28   51:astore_1        
			_features = ((Features) (s));
		//   29   52:aload_0         
		//   30   53:aload_1         
		//   31   54:putfield        #109 <Field JsonFormat$Features _features>
		//   32   57:return          
		}
	}


	public abstract String locale();

	public abstract String pattern();

	public abstract Shape shape();

	public abstract String timezone();

	public abstract Feature[] with();

	public abstract Feature[] without();

	public static final String DEFAULT_LOCALE = "##default";
	public static final String DEFAULT_TIMEZONE = "##default";
}
