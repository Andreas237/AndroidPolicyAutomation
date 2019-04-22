// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, JsonIgnoreProperties

public static class JsonIgnoreProperties$Value
	implements JacksonAnnotationValue, Serializable
{

	private static Set _asSet(String as[])
	{
		if(as != null && as.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            51
		{
			HashSet hashset = new HashSet(as.length);
	//    6   12:new             #59  <Class HashSet>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:arraylength     
	//   10   18:invokespecial   #62  <Method void HashSet(int)>
	//   11   21:astore_3        
			int j = as.length;
	//   12   22:aload_0         
	//   13   23:arraylength     
	//   14   24:istore_2        
			for(int i = 0; i < j; i++)
	//*  15   25:iconst_0        
	//*  16   26:istore_1        
	//*  17   27:iload_1         
	//*  18   28:iload_2         
	//*  19   29:icmpge          49
				((Set) (hashset)).add(((Object) (as[i])));
	//   20   32:aload_3         
	//   21   33:aload_0         
	//   22   34:iload_1         
	//   23   35:aaload          
	//   24   36:invokeinterface #68  <Method boolean Set.add(Object)>
	//   25   41:pop             

	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_1        
	//*  30   46:goto            27
			return ((Set) (hashset));
	//   31   49:aload_3         
	//   32   50:areturn         
		} else
		{
			return Collections.emptySet();
	//   33   51:invokestatic    #34  <Method Set Collections.emptySet()>
	//   34   54:areturn         
		}
	}

	private static boolean _empty(Set set, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
label0:
		{
label1:
			{
				JsonIgnoreProperties$Value jsonignoreproperties$value = EMPTY;
	//    0    0:getstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//    1    3:astore          7
				boolean flag5 = jsonignoreproperties$value._ignoreUnknown;
	//    2    5:aload           7
	//    3    7:getfield        #47  <Field boolean _ignoreUnknown>
	//    4   10:istore          6
				boolean flag4 = false;
	//    5   12:iconst_0        
	//    6   13:istore          5
				if(flag != flag5 || flag1 != jsonignoreproperties$value._allowGetters || flag2 != jsonignoreproperties$value._allowSetters || flag3 != jsonignoreproperties$value._merge)
					break label0;
	//    7   15:iload_1         
	//    8   16:iload           6
	//    9   18:icmpne          69
	//   10   21:iload_2         
	//   11   22:aload           7
	//   12   24:getfield        #49  <Field boolean _allowGetters>
	//   13   27:icmpne          69
	//   14   30:iload_3         
	//   15   31:aload           7
	//   16   33:getfield        #51  <Field boolean _allowSetters>
	//   17   36:icmpne          69
	//   18   39:iload           4
	//   19   41:aload           7
	//   20   43:getfield        #53  <Field boolean _merge>
	//   21   46:icmpne          69
				if(set != null)
	//*  22   49:aload_0         
	//*  23   50:ifnull          65
				{
					flag = flag4;
	//   24   53:iload           5
	//   25   55:istore_1        
					if(set.size() != 0)
						break label1;
	//   26   56:aload_0         
	//   27   57:invokeinterface #75  <Method int Set.size()>
	//   28   62:ifne            67
				}
				flag = true;
	//   29   65:iconst_1        
	//   30   66:istore_1        
			}
			return flag;
	//   31   67:iload_1         
	//   32   68:ireturn         
		}
		return false;
	//   33   69:iconst_0        
	//   34   70:ireturn         
	}

	private static boolean _equals(JsonIgnoreProperties$Value jsonignoreproperties$value, JsonIgnoreProperties$Value jsonignoreproperties$value1)
	{
		return jsonignoreproperties$value._ignoreUnknown == jsonignoreproperties$value1._ignoreUnknown && jsonignoreproperties$value._merge == jsonignoreproperties$value1._merge && jsonignoreproperties$value._allowGetters == jsonignoreproperties$value1._allowGetters && jsonignoreproperties$value._allowSetters == jsonignoreproperties$value1._allowSetters && jsonignoreproperties$value._ignored.equals(((Object) (jsonignoreproperties$value1._ignored)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean _ignoreUnknown>
	//    2    4:aload_1         
	//    3    5:getfield        #47  <Field boolean _ignoreUnknown>
	//    4    8:icmpne          62
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field boolean _merge>
	//    7   15:aload_1         
	//    8   16:getfield        #53  <Field boolean _merge>
	//    9   19:icmpne          62
	//   10   22:aload_0         
	//   11   23:getfield        #49  <Field boolean _allowGetters>
	//   12   26:aload_1         
	//   13   27:getfield        #49  <Field boolean _allowGetters>
	//   14   30:icmpne          62
	//   15   33:aload_0         
	//   16   34:getfield        #51  <Field boolean _allowSetters>
	//   17   37:aload_1         
	//   18   38:getfield        #51  <Field boolean _allowSetters>
	//   19   41:icmpne          62
	//   20   44:aload_0         
	//   21   45:getfield        #45  <Field Set _ignored>
	//   22   48:aload_1         
	//   23   49:getfield        #45  <Field Set _ignored>
	//   24   52:invokeinterface #81  <Method boolean Set.equals(Object)>
	//   25   57:ifeq            62
	//   26   60:iconst_1        
	//   27   61:ireturn         
	//   28   62:iconst_0        
	//   29   63:ireturn         
	}

	private static Set _merge(Set set, Set set1)
	{
		if(set.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #86  <Method boolean Set.isEmpty()>
	//*   2    6:ifeq            11
			return set1;
	//    3    9:aload_1         
	//    4   10:areturn         
		if(set1.isEmpty())
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #86  <Method boolean Set.isEmpty()>
	//*   7   17:ifeq            22
		{
			return set;
	//    8   20:aload_0         
	//    9   21:areturn         
		} else
		{
			HashSet hashset = new HashSet(set.size() + set1.size());
	//   10   22:new             #59  <Class HashSet>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokeinterface #75  <Method int Set.size()>
	//   14   32:aload_1         
	//   15   33:invokeinterface #75  <Method int Set.size()>
	//   16   38:iadd            
	//   17   39:invokespecial   #62  <Method void HashSet(int)>
	//   18   42:astore_2        
			hashset.addAll(((java.util.Collection) (set)));
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:invokevirtual   #90  <Method boolean HashSet.addAll(java.util.Collection)>
	//   22   48:pop             
			hashset.addAll(((java.util.Collection) (set1)));
	//   23   49:aload_2         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #90  <Method boolean HashSet.addAll(java.util.Collection)>
	//   26   54:pop             
			return ((Set) (hashset));
	//   27   55:aload_2         
	//   28   56:areturn         
		}
	}

	public static JsonIgnoreProperties$Value construct(Set set, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		if(_empty(set, flag, flag1, flag2, flag3))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iload_2         
	//*   3    3:iload_3         
	//*   4    4:iload           4
	//*   5    6:invokestatic    #95  <Method boolean _empty(Set, boolean, boolean, boolean, boolean)>
	//*   6    9:ifeq            16
			return EMPTY;
	//    7   12:getstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//    8   15:areturn         
		else
			return new JsonIgnoreProperties$Value(set, flag, flag1, flag2, flag3);
	//    9   16:new             #2   <Class JsonIgnoreProperties$Value>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:iload_2         
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:invokespecial   #38  <Method void JsonIgnoreProperties$Value(Set, boolean, boolean, boolean, boolean)>
	//   17   29:areturn         
	}

	public static JsonIgnoreProperties$Value empty()
	{
		return EMPTY;
	//    0    0:getstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//    1    3:areturn         
	}

	public static JsonIgnoreProperties$Value from(JsonIgnoreProperties jsonignoreproperties)
	{
		if(jsonignoreproperties == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return EMPTY;
	//    2    4:getstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//    3    7:areturn         
		else
			return construct(_asSet(jsonignoreproperties.value()), jsonignoreproperties.ignoreUnknown(), jsonignoreproperties.allowGetters(), jsonignoreproperties.allowSetters(), false);
	//    4    8:aload_0         
	//    5    9:invokeinterface #104 <Method String[] JsonIgnoreProperties.value()>
	//    6   14:invokestatic    #106 <Method Set _asSet(String[])>
	//    7   17:aload_0         
	//    8   18:invokeinterface #109 <Method boolean JsonIgnoreProperties.ignoreUnknown()>
	//    9   23:aload_0         
	//   10   24:invokeinterface #112 <Method boolean JsonIgnoreProperties.allowGetters()>
	//   11   29:aload_0         
	//   12   30:invokeinterface #115 <Method boolean JsonIgnoreProperties.allowSetters()>
	//   13   35:iconst_0        
	//   14   36:invokestatic    #117 <Method JsonIgnoreProperties$Value construct(Set, boolean, boolean, boolean, boolean)>
	//   15   39:areturn         
	}

	public static JsonIgnoreProperties$Value merge(JsonIgnoreProperties$Value jsonignoreproperties$value, JsonIgnoreProperties$Value jsonignoreproperties$value1)
	{
		if(jsonignoreproperties$value == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return jsonignoreproperties$value1;
	//    2    4:aload_1         
	//    3    5:areturn         
		else
			return jsonignoreproperties$value.withOverrides(jsonignoreproperties$value1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #123 <Method JsonIgnoreProperties$Value withOverrides(JsonIgnoreProperties$Value)>
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
		return obj.getClass() == ((Object)this).getClass() && _equals(this, (JsonIgnoreProperties$Value)obj);
	//    9   13:aload_1         
	//   10   14:invokevirtual   #127 <Method Class Object.getClass()>
	//   11   17:aload_0         
	//   12   18:invokevirtual   #127 <Method Class Object.getClass()>
	//   13   21:if_acmpne       37
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:checkcast       #2   <Class JsonIgnoreProperties$Value>
	//   17   29:invokestatic    #129 <Method boolean _equals(JsonIgnoreProperties$Value, JsonIgnoreProperties$Value)>
	//   18   32:ifeq            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public Set findIgnoredForDeserialization()
	{
		if(_allowSetters)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean _allowSetters>
	//*   2    4:ifeq            11
			return Collections.emptySet();
	//    3    7:invokestatic    #34  <Method Set Collections.emptySet()>
	//    4   10:areturn         
		else
			return _ignored;
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field Set _ignored>
	//    7   15:areturn         
	}

	public Set findIgnoredForSerialization()
	{
		if(_allowGetters)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean _allowGetters>
	//*   2    4:ifeq            11
			return Collections.emptySet();
	//    3    7:invokestatic    #34  <Method Set Collections.emptySet()>
	//    4   10:areturn         
		else
			return _ignored;
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field Set _ignored>
	//    7   15:areturn         
	}

	public boolean getIgnoreUnknown()
	{
		return _ignoreUnknown;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean _ignoreUnknown>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int i = _ignored.size();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Set _ignored>
	//    2    4:invokeinterface #75  <Method int Set.size()>
	//    3    9:istore          5
		byte byte0;
		if(_ignoreUnknown)
	//*   4   11:aload_0         
	//*   5   12:getfield        #47  <Field boolean _ignoreUnknown>
	//*   6   15:ifeq            23
			byte0 = 1;
	//    7   18:iconst_1        
	//    8   19:istore_1        
		else
	//*   9   20:goto            26
			byte0 = -3;
	//   10   23:bipush          -3
	//   11   25:istore_1        
		byte byte1;
		if(_allowGetters)
	//*  12   26:aload_0         
	//*  13   27:getfield        #49  <Field boolean _allowGetters>
	//*  14   30:ifeq            38
			byte1 = 3;
	//   15   33:iconst_3        
	//   16   34:istore_2        
		else
	//*  17   35:goto            41
			byte1 = -7;
	//   18   38:bipush          -7
	//   19   40:istore_2        
		byte byte2;
		if(_allowSetters)
	//*  20   41:aload_0         
	//*  21   42:getfield        #51  <Field boolean _allowSetters>
	//*  22   45:ifeq            54
			byte2 = 7;
	//   23   48:bipush          7
	//   24   50:istore_3        
		else
	//*  25   51:goto            57
			byte2 = -11;
	//   26   54:bipush          -11
	//   27   56:istore_3        
		byte byte3;
		if(_merge)
	//*  28   57:aload_0         
	//*  29   58:getfield        #53  <Field boolean _merge>
	//*  30   61:ifeq            71
			byte3 = 11;
	//   31   64:bipush          11
	//   32   66:istore          4
		else
	//*  33   68:goto            75
			byte3 = -13;
	//   34   71:bipush          -13
	//   35   73:istore          4
		return i + byte0 + byte1 + byte2 + byte3;
	//   36   75:iload           5
	//   37   77:iload_1         
	//   38   78:iadd            
	//   39   79:iload_2         
	//   40   80:iadd            
	//   41   81:iload_3         
	//   42   82:iadd            
	//   43   83:iload           4
	//   44   85:iadd            
	//   45   86:ireturn         
	}

	protected Object readResolve()
	{
		if(_empty(_ignored, _ignoreUnknown, _allowGetters, _allowSetters, _merge))
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Set _ignored>
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field boolean _ignoreUnknown>
	//*   4    8:aload_0         
	//*   5    9:getfield        #49  <Field boolean _allowGetters>
	//*   6   12:aload_0         
	//*   7   13:getfield        #51  <Field boolean _allowSetters>
	//*   8   16:aload_0         
	//*   9   17:getfield        #53  <Field boolean _merge>
	//*  10   20:invokestatic    #95  <Method boolean _empty(Set, boolean, boolean, boolean, boolean)>
	//*  11   23:ifeq            30
			return ((Object) (EMPTY));
	//   12   26:getstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//   13   29:areturn         
		else
			return ((Object) (this));
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public String toString()
	{
		return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", new Object[] {
			_ignored, Boolean.valueOf(_ignoreUnknown), Boolean.valueOf(_allowGetters), Boolean.valueOf(_allowSetters), Boolean.valueOf(_merge)
		});
	//    0    0:ldc1            #140 <String "JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)">
	//    1    2:iconst_5        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #45  <Field Set _ignored>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #47  <Field boolean _ignoreUnknown>
	//   12   19:invokestatic    #146 <Method Boolean Boolean.valueOf(boolean)>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_2        
	//   16   25:aload_0         
	//   17   26:getfield        #49  <Field boolean _allowGetters>
	//   18   29:invokestatic    #146 <Method Boolean Boolean.valueOf(boolean)>
	//   19   32:aastore         
	//   20   33:dup             
	//   21   34:iconst_3        
	//   22   35:aload_0         
	//   23   36:getfield        #51  <Field boolean _allowSetters>
	//   24   39:invokestatic    #146 <Method Boolean Boolean.valueOf(boolean)>
	//   25   42:aastore         
	//   26   43:dup             
	//   27   44:iconst_4        
	//   28   45:aload_0         
	//   29   46:getfield        #53  <Field boolean _merge>
	//   30   49:invokestatic    #146 <Method Boolean Boolean.valueOf(boolean)>
	//   31   52:aastore         
	//   32   53:invokestatic    #152 <Method String String.format(String, Object[])>
	//   33   56:areturn         
	}

	public Class valueFor()
	{
		return com/fasterxml/jackson/annotation/JsonIgnoreProperties;
	//    0    0:ldc1            #11  <Class JsonIgnoreProperties>
	//    1    2:areturn         
	}

	public JsonIgnoreProperties$Value withOverrides(JsonIgnoreProperties$Value jsonignoreproperties$value)
	{
		if(jsonignoreproperties$value != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          126
		{
			if(jsonignoreproperties$value == EMPTY)
	//*   2    4:aload_1         
	//*   3    5:getstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//*   4    8:if_acmpne       13
				return this;
	//    5   11:aload_0         
	//    6   12:areturn         
			if(!jsonignoreproperties$value._merge)
	//*   7   13:aload_1         
	//*   8   14:getfield        #53  <Field boolean _merge>
	//*   9   17:ifne            22
				return jsonignoreproperties$value;
	//   10   20:aload_1         
	//   11   21:areturn         
			if(_equals(this, jsonignoreproperties$value))
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #129 <Method boolean _equals(JsonIgnoreProperties$Value, JsonIgnoreProperties$Value)>
	//*  15   27:ifeq            32
				return this;
	//   16   30:aload_0         
	//   17   31:areturn         
			Set set = _merge(_ignored, jsonignoreproperties$value._ignored);
	//   18   32:aload_0         
	//   19   33:getfield        #45  <Field Set _ignored>
	//   20   36:aload_1         
	//   21   37:getfield        #45  <Field Set _ignored>
	//   22   40:invokestatic    #156 <Method Set _merge(Set, Set)>
	//   23   43:astore          5
			boolean flag = _ignoreUnknown;
	//   24   45:aload_0         
	//   25   46:getfield        #47  <Field boolean _ignoreUnknown>
	//   26   49:istore_2        
			boolean flag2 = false;
	//   27   50:iconst_0        
	//   28   51:istore          4
			if(!flag && !jsonignoreproperties$value._ignoreUnknown)
	//*  29   53:iload_2         
	//*  30   54:ifne            72
	//*  31   57:aload_1         
	//*  32   58:getfield        #47  <Field boolean _ignoreUnknown>
	//*  33   61:ifeq            67
	//*  34   64:goto            72
				flag = false;
	//   35   67:iconst_0        
	//   36   68:istore_2        
			else
	//*  37   69:goto            74
				flag = true;
	//   38   72:iconst_1        
	//   39   73:istore_2        
			boolean flag1;
			if(!_allowGetters && !jsonignoreproperties$value._allowGetters)
	//*  40   74:aload_0         
	//*  41   75:getfield        #49  <Field boolean _allowGetters>
	//*  42   78:ifne            96
	//*  43   81:aload_1         
	//*  44   82:getfield        #49  <Field boolean _allowGetters>
	//*  45   85:ifeq            91
	//*  46   88:goto            96
				flag1 = false;
	//   47   91:iconst_0        
	//   48   92:istore_3        
			else
	//*  49   93:goto            98
				flag1 = true;
	//   50   96:iconst_1        
	//   51   97:istore_3        
			if(_allowSetters || jsonignoreproperties$value._allowSetters)
	//*  52   98:aload_0         
	//*  53   99:getfield        #51  <Field boolean _allowSetters>
	//*  54  102:ifne            112
	//*  55  105:aload_1         
	//*  56  106:getfield        #51  <Field boolean _allowSetters>
	//*  57  109:ifeq            115
				flag2 = true;
	//   58  112:iconst_1        
	//   59  113:istore          4
			return construct(set, flag, flag1, flag2, true);
	//   60  115:aload           5
	//   61  117:iload_2         
	//   62  118:iload_3         
	//   63  119:iload           4
	//   64  121:iconst_1        
	//   65  122:invokestatic    #117 <Method JsonIgnoreProperties$Value construct(Set, boolean, boolean, boolean, boolean)>
	//   66  125:areturn         
		} else
		{
			return this;
	//   67  126:aload_0         
	//   68  127:areturn         
		}
	}

	protected static final JsonIgnoreProperties$Value EMPTY = new JsonIgnoreProperties$Value(Collections.emptySet(), false, false, false, true);
	private static final long serialVersionUID = 1L;
	protected final boolean _allowGetters;
	protected final boolean _allowSetters;
	protected final boolean _ignoreUnknown;
	protected final Set _ignored;
	protected final boolean _merge;

	static 
	{
	//    0    0:new             #2   <Class JsonIgnoreProperties$Value>
	//    1    3:dup             
	//    2    4:invokestatic    #34  <Method Set Collections.emptySet()>
	//    3    7:iconst_0        
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:iconst_1        
	//    7   11:invokespecial   #38  <Method void JsonIgnoreProperties$Value(Set, boolean, boolean, boolean, boolean)>
	//    8   14:putstatic       #40  <Field JsonIgnoreProperties$Value EMPTY>
	//*   9   17:return          
	}

	protected JsonIgnoreProperties$Value(Set set, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		if(set == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			_ignored = Collections.emptySet();
	//    4    8:aload_0         
	//    5    9:invokestatic    #34  <Method Set Collections.emptySet()>
	//    6   12:putfield        #45  <Field Set _ignored>
		else
	//*   7   15:goto            23
			_ignored = set;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #45  <Field Set _ignored>
		_ignoreUnknown = flag;
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:putfield        #47  <Field boolean _ignoreUnknown>
		_allowGetters = flag1;
	//   14   28:aload_0         
	//   15   29:iload_3         
	//   16   30:putfield        #49  <Field boolean _allowGetters>
		_allowSetters = flag2;
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:putfield        #51  <Field boolean _allowSetters>
		_merge = flag3;
	//   20   39:aload_0         
	//   21   40:iload           5
	//   22   42:putfield        #53  <Field boolean _merge>
	//   23   45:return          
	}
}
