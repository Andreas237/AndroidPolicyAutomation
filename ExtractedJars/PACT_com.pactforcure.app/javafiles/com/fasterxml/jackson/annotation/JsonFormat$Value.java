// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, JsonFormat

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

	public static final JsonFormat$Value empty()
	{
		return EMPTY;
	//    0    0:getstatic       #36  <Field JsonFormat$Value EMPTY>
	//    1    3:areturn         
	}

	public static JsonFormat$Value forPattern(String s)
	{
		return new JsonFormat$Value(s, ((JsonFormat$Shape) (null)), ((Locale) (null)), ((String) (null)), ((TimeZone) (null)), es.empty());
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

	public static JsonFormat$Value forShape(JsonFormat$Shape jsonformat$shape)
	{
		return new JsonFormat$Value(((String) (null)), jsonformat$shape, ((Locale) (null)), ((String) (null)), ((TimeZone) (null)), es.empty());
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

	public static final JsonFormat$Value from(JsonFormat jsonformat)
	{
		if(jsonformat == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new JsonFormat$Value(jsonformat);
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
					obj = ((Object) ((JsonFormat$Value)obj));
	//   22   35:aload_1         
	//   23   36:checkcast       #2   <Class JsonFormat$Value>
	//   24   39:astore_1        
					flag = flag3;
	//   25   40:iload           4
	//   26   42:istore_2        
					if(_shape == ((JsonFormat$Value) (obj))._shape)
	//*  27   43:aload_0         
	//*  28   44:getfield        #101 <Field JsonFormat$Shape _shape>
	//*  29   47:aload_1         
	//*  30   48:getfield        #101 <Field JsonFormat$Shape _shape>
	//*  31   51:if_acmpne       12
					{
						flag = flag3;
	//   32   54:iload           4
	//   33   56:istore_2        
						if(_features.equals(((Object) (((JsonFormat$Value) (obj))._features))))
	//*  34   57:aload_0         
	//*  35   58:getfield        #109 <Field JsonFormat$Features _features>
	//*  36   61:aload_1         
	//*  37   62:getfield        #109 <Field JsonFormat$Features _features>
	//*  38   65:invokevirtual   #132 <Method boolean JsonFormat$Features.equals(Object)>
	//*  39   68:ifeq            12
						{
							boolean flag1;
							if(_equal(((Object) (_timezoneStr)), ((Object) (((JsonFormat$Value) (obj))._timezoneStr))) && _equal(((Object) (_pattern)), ((Object) (((JsonFormat$Value) (obj))._pattern))) && _equal(((Object) (_timezone)), ((Object) (((JsonFormat$Value) (obj))._timezone))) && _equal(((Object) (_locale)), ((Object) (((JsonFormat$Value) (obj))._locale))))
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

	public Boolean getFeature(e e)
	{
		return _features.get(e);
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

	public JsonFormat$Shape getShape()
	{
		return _shape;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field JsonFormat$Shape _shape>
	//    2    4:areturn         
	}

	public TimeZone getTimeZone()
	{
		TimeZone timezone1 = _timezone;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field TimeZone _timezone>
	//    2    4:astore_2        
		TimeZone timezone = timezone1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(timezone1 == null)
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
			timezone = TimeZone.getTimeZone(_timezoneStr);
	//   12   20:aload_0         
	//   13   21:getfield        #107 <Field String _timezoneStr>
	//   14   24:invokestatic    #150 <Method TimeZone TimeZone.getTimeZone(String)>
	//   15   27:astore_1        
			_timezone = timezone;
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:putfield        #105 <Field TimeZone _timezone>
		}
		return timezone;
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
		return _shape != JsonFormat$Shape.ANY;
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

	public JsonFormat$Value withFeature(e e)
	{
		e = ((e) (_features.with(new e[] {
			e
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field JsonFormat$Features _features>
	//    2    4:iconst_1        
	//    3    5:anewarray       e[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokevirtual   #185 <Method JsonFormat$Features JsonFormat$Features.with(JsonFormat$Feature[])>
	//    9   15:astore_1        
		if(e == _features)
	//*  10   16:aload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #109 <Field JsonFormat$Features _features>
	//*  13   21:if_acmpne       26
			return this;
	//   14   24:aload_0         
	//   15   25:areturn         
		else
			return new JsonFormat$Value(_pattern, _shape, _locale, _timezoneStr, _timezone, ((es) (e)));
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

	public JsonFormat$Value withLocale(Locale locale)
	{
		return new JsonFormat$Value(_pattern, _shape, locale, _timezoneStr, _timezone, _features);
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

	public final JsonFormat$Value withOverrides(JsonFormat$Value jsonformat$value)
	{
		JsonFormat$Value jsonformat$value1;
		if(jsonformat$value == null || jsonformat$value == EMPTY)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:getstatic       #36  <Field JsonFormat$Value EMPTY>
	//*   4    8:if_acmpne       15
		{
			jsonformat$value1 = this;
	//    5   11:aload_0         
	//    6   12:astore_2        
		} else
	//*   7   13:aload_2         
	//*   8   14:areturn         
		{
			jsonformat$value1 = jsonformat$value;
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
					String s1 = jsonformat$value._pattern;
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
				Object obj = ((Object) (jsonformat$value._shape));
	//   27   47:aload_1         
	//   28   48:getfield        #101 <Field JsonFormat$Shape _shape>
	//   29   51:astore          4
				JsonFormat$Shape jsonformat$shape = ((JsonFormat$Shape) (obj));
	//   30   53:aload           4
	//   31   55:astore_3        
				if(obj == JsonFormat$Shape.ANY)
	//*  32   56:aload           4
	//*  33   58:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
	//*  34   61:if_acmpne       69
					jsonformat$shape = _shape;
	//   35   64:aload_0         
	//   36   65:getfield        #101 <Field JsonFormat$Shape _shape>
	//   37   68:astore_3        
				Object obj1 = ((Object) (jsonformat$value._locale));
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
					obj1 = ((Object) (jsonformat$value._features));
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
					obj1 = ((Object) (((es) (obj1)).withOverrides(jsonformat$value._features)));
	//   80  154:aload           5
	//   81  156:aload_1         
	//   82  157:getfield        #109 <Field JsonFormat$Features _features>
	//   83  160:invokevirtual   #192 <Method JsonFormat$Features JsonFormat$Features.withOverrides(JsonFormat$Features)>
	//   84  163:astore          5
				obj2 = ((Object) (jsonformat$value._timezoneStr));
				if(obj2 == null || ((String) (obj2)).isEmpty())
				{
					jsonformat$value = ((JsonFormat$Value) (_timezoneStr));
					obj2 = ((Object) (_timezone));
				} else
	//*  85  165:goto            107
				{
					TimeZone timezone = jsonformat$value._timezone;
	//   86  168:aload_1         
	//   87  169:getfield        #105 <Field TimeZone _timezone>
	//   88  172:astore          7
					jsonformat$value = ((JsonFormat$Value) (obj2));
	//   89  174:aload           6
	//   90  176:astore_1        
					obj2 = ((Object) (timezone));
	//   91  177:aload           7
	//   92  179:astore          6
				}
				return new JsonFormat$Value(s, jsonformat$shape, ((Locale) (obj)), ((String) (jsonformat$value)), ((TimeZone) (obj2)), ((es) (obj1)));
			}
		}
		return jsonformat$value1;
	//*  93  181:goto            137
	}

	public JsonFormat$Value withPattern(String s)
	{
		return new JsonFormat$Value(s, _shape, _locale, _timezoneStr, _timezone, _features);
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

	public JsonFormat$Value withShape(JsonFormat$Shape jsonformat$shape)
	{
		return new JsonFormat$Value(_pattern, jsonformat$shape, _locale, _timezoneStr, _timezone, _features);
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

	public JsonFormat$Value withTimeZone(TimeZone timezone)
	{
		return new JsonFormat$Value(_pattern, _shape, _locale, ((String) (null)), timezone, _features);
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

	public JsonFormat$Value withoutFeature(e e)
	{
		e = ((e) (_features.without(new e[] {
			e
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field JsonFormat$Features _features>
	//    2    4:iconst_1        
	//    3    5:anewarray       e[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokevirtual   #200 <Method JsonFormat$Features JsonFormat$Features.without(JsonFormat$Feature[])>
	//    9   15:astore_1        
		if(e == _features)
	//*  10   16:aload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #109 <Field JsonFormat$Features _features>
	//*  13   21:if_acmpne       26
			return this;
	//   14   24:aload_0         
	//   15   25:areturn         
		else
			return new JsonFormat$Value(_pattern, _shape, _locale, _timezoneStr, _timezone, ((es) (e)));
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

	private static final JsonFormat$Value EMPTY = new JsonFormat$Value();
	private static final long serialVersionUID = 1L;
	private final es _features;
	private final Locale _locale;
	private final String _pattern;
	private final JsonFormat$Shape _shape;
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

	public JsonFormat$Value()
	{
		this("", JsonFormat$Shape.ANY, "", "", es.empty());
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "">
	//    2    3:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
	//    3    6:ldc1            #39  <String "">
	//    4    8:ldc1            #39  <String "">
	//    5   10:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
	//    6   13:invokespecial   #53  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features)>
	//    7   16:return          
	}

	public JsonFormat$Value(JsonFormat jsonformat)
	{
		this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone(), es.construct(jsonformat));
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

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, String s1, String s2)
	{
		this(s, jsonformat$shape, s1, s2, es.empty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
	//    6    9:invokespecial   #53  <Method void JsonFormat$Value(String, JsonFormat$Shape, String, String, JsonFormat$Features)>
	//    7   12:return          
	}

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, String s1, String s2, es es)
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
		this(s, jsonformat$shape, ((Locale) (s1)), s2, ((TimeZone) (null)), es);
	//*  36   70:goto            22
	//*  37   73:goto            48
	}

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, Locale locale, String s1, TimeZone timezone)
	{
		this(s, jsonformat$shape, locale, s1, timezone, es.empty());
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

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, Locale locale, String s1, TimeZone timezone, es es)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		_pattern = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #99  <Field String _pattern>
		s = ((String) (jsonformat$shape));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(jsonformat$shape == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			s = ((String) (JsonFormat$Shape.ANY));
	//    9   15:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
	//   10   18:astore_1        
		_shape = ((JsonFormat$Shape) (s));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #101 <Field JsonFormat$Shape _shape>
		_locale = locale;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #103 <Field Locale _locale>
		_timezone = timezone;
	//   17   29:aload_0         
	//   18   30:aload           5
	//   19   32:putfield        #105 <Field TimeZone _timezone>
		_timezoneStr = s1;
	//   20   35:aload_0         
	//   21   36:aload           4
	//   22   38:putfield        #107 <Field String _timezoneStr>
		s = ((String) (es));
	//   23   41:aload           6
	//   24   43:astore_1        
		if(es == null)
	//*  25   44:aload           6
	//*  26   46:ifnonnull       53
			s = ((String) (com.fasterxml.jackson.annotation.es.empty()));
	//   27   49:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
	//   28   52:astore_1        
		_features = ((es) (s));
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:putfield        #109 <Field JsonFormat$Features _features>
	//   32   58:return          
	}

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, Locale locale, TimeZone timezone)
	{
		this(s, jsonformat$shape, locale, timezone, es.empty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
	//    6    9:invokespecial   #113 <Method void JsonFormat$Value(String, JsonFormat$Shape, Locale, TimeZone, JsonFormat$Features)>
	//    7   12:return          
	}

	public JsonFormat$Value(String s, JsonFormat$Shape jsonformat$shape, Locale locale, TimeZone timezone, es es)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		_pattern = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #99  <Field String _pattern>
		s = ((String) (jsonformat$shape));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(jsonformat$shape == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			s = ((String) (JsonFormat$Shape.ANY));
	//    9   15:getstatic       #44  <Field JsonFormat$Shape JsonFormat$Shape.ANY>
	//   10   18:astore_1        
		_shape = ((JsonFormat$Shape) (s));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #101 <Field JsonFormat$Shape _shape>
		_locale = locale;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #103 <Field Locale _locale>
		_timezone = timezone;
	//   17   29:aload_0         
	//   18   30:aload           4
	//   19   32:putfield        #105 <Field TimeZone _timezone>
		_timezoneStr = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #107 <Field String _timezoneStr>
		s = ((String) (es));
	//   23   40:aload           5
	//   24   42:astore_1        
		if(es == null)
	//*  25   43:aload           5
	//*  26   45:ifnonnull       52
			s = ((String) (com.fasterxml.jackson.annotation.es.empty()));
	//   27   48:invokestatic    #50  <Method JsonFormat$Features JsonFormat$Features.empty()>
	//   28   51:astore_1        
		_features = ((es) (s));
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:putfield        #109 <Field JsonFormat$Features _features>
	//   32   57:return          
	}
}
