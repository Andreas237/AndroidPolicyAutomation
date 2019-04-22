// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, JsonFormat, OptBoolean

public static class JsonFormat$Value
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

	public static final JsonFormat$Value empty()
	{
		return EMPTY;
	//    0    0:getstatic       #38  <Field JsonFormat$Value EMPTY>
	//    1    3:areturn         
	}

	public static JsonFormat$Value merge(JsonFormat$Value jsonformat$value, JsonFormat$Value jsonformat$value1)
	{
		if(jsonformat$value == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return jsonformat$value1;
	//    2    4:aload_1         
	//    3    5:areturn         
		else
			return jsonformat$value.withOverrides(jsonformat$value1);
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
		obj = ((Object) ((JsonFormat$Value)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class JsonFormat$Value>
	//   18   30:astore_1        
		if(_shape == ((JsonFormat$Value) (obj))._shape)
	//*  19   31:aload_0         
	//*  20   32:getfield        #109 <Field JsonFormat$Shape _shape>
	//*  21   35:aload_1         
	//*  22   36:getfield        #109 <Field JsonFormat$Shape _shape>
	//*  23   39:if_acmpne       132
		{
			if(!_features.equals(((Object) (((JsonFormat$Value) (obj))._features))))
	//*  24   42:aload_0         
	//*  25   43:getfield        #117 <Field JsonFormat$Features _features>
	//*  26   46:aload_1         
	//*  27   47:getfield        #117 <Field JsonFormat$Features _features>
	//*  28   50:invokevirtual   #136 <Method boolean JsonFormat$Features.equals(Object)>
	//*  29   53:ifne            58
				return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
			return _equal(((Object) (_lenient)), ((Object) (((JsonFormat$Value) (obj))._lenient))) && _equal(((Object) (_timezoneStr)), ((Object) (((JsonFormat$Value) (obj))._timezoneStr))) && _equal(((Object) (_pattern)), ((Object) (((JsonFormat$Value) (obj))._pattern))) && _equal(((Object) (_timezone)), ((Object) (((JsonFormat$Value) (obj))._timezone))) && _equal(((Object) (_locale)), ((Object) (((JsonFormat$Value) (obj))._locale)));
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

	public Boolean getFeature(e e)
	{
		return _features.get(e);
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

	public JsonFormat$Shape getShape()
	{
		return _shape;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field JsonFormat$Shape _shape>
	//    2    4:areturn         
	}

	public TimeZone getTimeZone()
	{
		TimeZone timezone = _timezone;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field TimeZone _timezone>
	//    2    4:astore_2        
		Object obj = ((Object) (timezone));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(timezone == null)
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
		return _shape != JsonFormat$Shape.ANY;
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

	public final JsonFormat$Value withOverrides(JsonFormat$Value jsonformat$value)
	{
		if(jsonformat$value != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          209
		{
			Object obj = ((Object) (EMPTY));
	//    2    4:getstatic       #38  <Field JsonFormat$Value EMPTY>
	//    3    7:astore_2        
			if(jsonformat$value != obj)
	//*   4    8:aload_1         
	//*   5    9:aload_2         
	//*   6   10:if_acmpeq       209
			{
				if(jsonformat$value == this)
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
					return jsonformat$value;
	//   15   25:aload_1         
	//   16   26:areturn         
				obj = ((Object) (jsonformat$value._pattern));
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
				JsonFormat$Shape jsonformat$shape = jsonformat$value._shape;
	//   30   54:aload_1         
	//   31   55:getfield        #109 <Field JsonFormat$Shape _shape>
	//   32   58:astore_3        
				if(jsonformat$shape == JsonFormat$Shape.ANY)
	//*  33   59:aload_3         
	//*  34   60:getstatic       #46  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
	//*  35   63:if_acmpne       74
					jsonformat$shape = _shape;
	//   36   66:aload_0         
	//   37   67:getfield        #109 <Field JsonFormat$Shape _shape>
	//   38   70:astore_3        
	//*  39   71:goto            74
				Locale locale = jsonformat$value._locale;
	//   40   74:aload_1         
	//   41   75:getfield        #111 <Field Locale _locale>
	//   42   78:astore          4
				if(locale == null)
	//*  43   80:aload           4
	//*  44   82:ifnonnull       94
					locale = _locale;
	//   45   85:aload_0         
	//   46   86:getfield        #111 <Field Locale _locale>
	//   47   89:astore          4
	//*  48   91:goto            94
				es es = _features;
	//   49   94:aload_0         
	//   50   95:getfield        #117 <Field JsonFormat$Features _features>
	//   51   98:astore          5
				if(es == null)
	//*  52  100:aload           5
	//*  53  102:ifnonnull       114
					es = jsonformat$value._features;
	//   54  105:aload_1         
	//   55  106:getfield        #117 <Field JsonFormat$Features _features>
	//   56  109:astore          5
				else
	//*  57  111:goto            125
					es = es.withOverrides(jsonformat$value._features);
	//   58  114:aload           5
	//   59  116:aload_1         
	//   60  117:getfield        #117 <Field JsonFormat$Features _features>
	//   61  120:invokevirtual   #184 <Method JsonFormat$Features JsonFormat$Features.withOverrides(JsonFormat$Features)>
	//   62  123:astore          5
				Boolean boolean1 = jsonformat$value._lenient;
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
				String s = jsonformat$value._timezoneStr;
	//   72  145:aload_1         
	//   73  146:getfield        #115 <Field String _timezoneStr>
	//   74  149:astore          8
				TimeZone timezone;
				if(s != null && !s.isEmpty())
	//*  75  151:aload           8
	//*  76  153:ifnull          179
	//*  77  156:aload           8
	//*  78  158:invokevirtual   #163 <Method boolean String.isEmpty()>
	//*  79  161:ifeq            167
	//*  80  164:goto            179
				{
					timezone = jsonformat$value._timezone;
	//   81  167:aload_1         
	//   82  168:getfield        #113 <Field TimeZone _timezone>
	//   83  171:astore          7
					jsonformat$value = ((JsonFormat$Value) (s));
	//   84  173:aload           8
	//   85  175:astore_1        
				} else
	//*  86  176:goto            190
				{
					jsonformat$value = ((JsonFormat$Value) (_timezoneStr));
	//   87  179:aload_0         
	//   88  180:getfield        #115 <Field String _timezoneStr>
	//   89  183:astore_1        
					timezone = _timezone;
	//   90  184:aload_0         
	//   91  185:getfield        #113 <Field TimeZone _timezone>
	//   92  188:astore          7
				}
				return new JsonFormat$Value(((String) (obj)), jsonformat$shape, locale, ((String) (jsonformat$value)), timezone, es, boolean1);
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

	private static final JsonFormat$Value EMPTY = new JsonFormat$Value();
	private static final long serialVersionUID = 1L;
	private final es _features;
	private final Boolean _lenient;
	private final Locale _locale;
	private final String _pattern;
	private final JsonFormat$Shape _shape;
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

	public JsonFormat$Value()
	{
		this("", JsonFormat$Shape.ANY, "", "", es.empty(), ((Boolean) (null)));
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

	public JsonFormat$Value(JsonFormat jsonformat)
	{
		this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone(), es.construct(jsonformat), jsonformat.lenient().asBoolean());
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

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, String s1, String s2, es es, Boolean boolean1)
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
		this(s, jsonformat$shape, ((Locale) (s1)), s2, ((TimeZone) (null)), es, boolean1);
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

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, Locale locale, String s1, TimeZone timezone, es es, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
		_pattern = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #107 <Field String _pattern>
		s = ((String) (jsonformat$shape));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(jsonformat$shape == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			s = ((String) (JsonFormat$Shape.ANY));
	//    9   15:getstatic       #46  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
	//   10   18:astore_1        
		_shape = ((JsonFormat$Shape) (s));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #109 <Field JsonFormat$Shape _shape>
		_locale = locale;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #111 <Field Locale _locale>
		_timezone = timezone;
	//   17   29:aload_0         
	//   18   30:aload           5
	//   19   32:putfield        #113 <Field TimeZone _timezone>
		_timezoneStr = s1;
	//   20   35:aload_0         
	//   21   36:aload           4
	//   22   38:putfield        #115 <Field String _timezoneStr>
		s = ((String) (es));
	//   23   41:aload           6
	//   24   43:astore_1        
		if(es == null)
	//*  25   44:aload           6
	//*  26   46:ifnonnull       53
			s = ((String) (com.fasterxml.jackson.annotation.es.empty()));
	//   27   49:invokestatic    #52  <Method JsonFormat$Features JsonFormat$Features.empty()>
	//   28   52:astore_1        
		_features = ((es) (s));
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
