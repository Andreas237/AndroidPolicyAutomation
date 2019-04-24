// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, JsonInclude

public static class JsonInclude$Value
	implements JacksonAnnotationValue, Serializable
{

	public static JsonInclude$Value construct(e e, e e1)
	{
		if((e == e.USE_DEFAULTS || e == null) && (e1 == e.USE_DEFAULTS || e1 == null))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*   2    4:if_acmpeq       11
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       26
	//*   5   11:aload_1         
	//*   6   12:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*   7   15:if_acmpeq       22
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       26
			return EMPTY;
	//   10   22:getstatic       #34  <Field JsonInclude$Value EMPTY>
	//   11   25:areturn         
		else
			return new JsonInclude$Value(e, e1);
	//   12   26:new             #2   <Class JsonInclude$Value>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//   17   35:areturn         
	}

	public static JsonInclude$Value empty()
	{
		return EMPTY;
	//    0    0:getstatic       #34  <Field JsonInclude$Value EMPTY>
	//    1    3:areturn         
	}

	public static JsonInclude$Value from(JsonInclude jsoninclude)
	{
		if(jsoninclude == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		e e = jsoninclude.value();
	//    4    6:aload_0         
	//    5    7:invokeinterface #46  <Method JsonInclude$Include JsonInclude.value()>
	//    6   12:astore_1        
		jsoninclude = ((JsonInclude) (jsoninclude.content()));
	//    7   13:aload_0         
	//    8   14:invokeinterface #49  <Method JsonInclude$Include JsonInclude.content()>
	//    9   19:astore_0        
		if(e == e.USE_DEFAULTS && jsoninclude == e.USE_DEFAULTS)
	//*  10   20:aload_1         
	//*  11   21:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*  12   24:if_acmpne       38
	//*  13   27:aload_0         
	//*  14   28:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*  15   31:if_acmpne       38
			return EMPTY;
	//   16   34:getstatic       #34  <Field JsonInclude$Value EMPTY>
	//   17   37:areturn         
		else
			return new JsonInclude$Value(e, ((e) (jsoninclude)));
	//   18   38:new             #2   <Class JsonInclude$Value>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//   23   47:areturn         
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
	//*  10   14:invokevirtual   #61  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #61  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((JsonInclude$Value)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class JsonInclude$Value>
	//   18   30:astore_1        
			if(((JsonInclude$Value) (obj))._valueInclusion != _valueInclusion || ((JsonInclude$Value) (obj))._contentInclusion != _contentInclusion)
	//*  19   31:aload_1         
	//*  20   32:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//*  21   35:aload_0         
	//*  22   36:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//*  23   39:if_acmpne       53
	//*  24   42:aload_1         
	//*  25   43:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//*  26   46:aload_0         
	//*  27   47:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//*  28   50:if_acmpeq       5
				return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		}
		return true;
	}

	public e getContentInclusion()
	{
		return _contentInclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//    2    4:areturn         
	}

	public e getValueInclusion()
	{
		return _valueInclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (_valueInclusion.hashCode() << 2) + _contentInclusion.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//    2    4:invokevirtual   #67  <Method int JsonInclude$Include.hashCode()>
	//    3    7:iconst_2        
	//    4    8:ishl            
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//    7   13:invokevirtual   #67  <Method int JsonInclude$Include.hashCode()>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	protected Object readResolve()
	{
		JsonInclude$Value jsoninclude$value = this;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(_valueInclusion == e.USE_DEFAULTS)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//*   4    6:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*   5    9:if_acmpne       28
		{
			jsoninclude$value = this;
	//    6   12:aload_0         
	//    7   13:astore_1        
			if(_contentInclusion == e.USE_DEFAULTS)
	//*   8   14:aload_0         
	//*   9   15:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//*  10   18:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*  11   21:if_acmpne       28
				jsoninclude$value = EMPTY;
	//   12   24:getstatic       #34  <Field JsonInclude$Value EMPTY>
	//   13   27:astore_1        
		}
		return ((Object) (jsoninclude$value));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public String toString()
	{
		return String.format("[value=%s,content=%s]", new Object[] {
			_valueInclusion, _contentInclusion
		});
	//    0    0:ldc1            #73  <String "[value=%s,content=%s]">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//   12   19:aastore         
	//   13   20:invokestatic    #79  <Method String String.format(String, Object[])>
	//   14   23:areturn         
	}

	public Class valueFor()
	{
		return com/fasterxml/jackson/annotation/JsonInclude;
	//    0    0:ldc1            #11  <Class JsonInclude>
	//    1    2:areturn         
	}

	public JsonInclude$Value withContentInclusion(e e)
	{
		if(e == _contentInclusion)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new JsonInclude$Value(_valueInclusion, e);
	//    6   10:new             #2   <Class JsonInclude$Value>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//   10   18:aload_1         
	//   11   19:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//   12   22:areturn         
	}

	public JsonInclude$Value withOverrides(JsonInclude$Value jsoninclude$value)
	{
		if(jsoninclude$value != null && jsoninclude$value != EMPTY)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:getstatic       #34  <Field JsonInclude$Value EMPTY>
	//*   4    8:if_acmpne       13
	//*   5   11:aload_0         
	//*   6   12:areturn         
		{
			e e = jsoninclude$value._valueInclusion;
	//    7   13:aload_1         
	//    8   14:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//    9   17:astore          4
			jsoninclude$value = ((JsonInclude$Value) (jsoninclude$value._contentInclusion));
	//   10   19:aload_1         
	//   11   20:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//   12   23:astore_1        
			boolean flag;
			boolean flag1;
			if(e != _valueInclusion && e != e.USE_DEFAULTS)
	//*  13   24:aload           4
	//*  14   26:aload_0         
	//*  15   27:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//*  16   30:if_acmpeq       79
	//*  17   33:aload           4
	//*  18   35:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*  19   38:if_acmpeq       79
				flag = true;
	//   20   41:iconst_1        
	//   21   42:istore_2        
			else
	//*  22   43:aload_1         
	//*  23   44:aload_0         
	//*  24   45:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//*  25   48:if_acmpeq       84
	//*  26   51:aload_1         
	//*  27   52:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//*  28   55:if_acmpeq       84
	//*  29   58:iconst_1        
	//*  30   59:istore_3        
	//*  31   60:iload_2         
	//*  32   61:ifeq            103
	//*  33   64:iload_3         
	//*  34   65:ifeq            89
	//*  35   68:new             #2   <Class JsonInclude$Value>
	//*  36   71:dup             
	//*  37   72:aload           4
	//*  38   74:aload_1         
	//*  39   75:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//*  40   78:areturn         
				flag = false;
	//   41   79:iconst_0        
	//   42   80:istore_2        
			if(jsoninclude$value != _contentInclusion && jsoninclude$value != e.USE_DEFAULTS)
				flag1 = true;
			else
	//*  43   81:goto            43
				flag1 = false;
	//   44   84:iconst_0        
	//   45   85:istore_3        
			if(flag)
				if(flag1)
					return new JsonInclude$Value(e, ((e) (jsoninclude$value)));
				else
	//*  46   86:goto            60
					return new JsonInclude$Value(e, _contentInclusion);
	//   47   89:new             #2   <Class JsonInclude$Value>
	//   48   92:dup             
	//   49   93:aload           4
	//   50   95:aload_0         
	//   51   96:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//   52   99:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//   53  102:areturn         
			if(flag1)
	//*  54  103:iload_3         
	//*  55  104:ifeq            11
				return new JsonInclude$Value(_valueInclusion, ((e) (jsoninclude$value)));
	//   56  107:new             #2   <Class JsonInclude$Value>
	//   57  110:dup             
	//   58  111:aload_0         
	//   59  112:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//   60  115:aload_1         
	//   61  116:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//   62  119:areturn         
		}
		return this;
	}

	public JsonInclude$Value withValueInclusion(e e)
	{
		if(e == _valueInclusion)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #39  <Field JsonInclude$Include _valueInclusion>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new JsonInclude$Value(e, _contentInclusion);
	//    6   10:new             #2   <Class JsonInclude$Value>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #41  <Field JsonInclude$Include _contentInclusion>
	//   11   19:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//   12   22:areturn         
	}

	protected static final JsonInclude$Value EMPTY;
	private static final long serialVersionUID = 1L;
	protected final e _contentInclusion;
	protected final e _valueInclusion;

	static 
	{
		EMPTY = new JsonInclude$Value(e.USE_DEFAULTS, e.USE_DEFAULTS);
	//    0    0:new             #2   <Class JsonInclude$Value>
	//    1    3:dup             
	//    2    4:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//    3    7:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//    4   10:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//    5   13:putstatic       #34  <Field JsonInclude$Value EMPTY>
	//*   6   16:return          
	}

	protected JsonInclude$Value(e e, e e1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		e e2 = e;
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(e == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			e2 = e.USE_DEFAULTS;
	//    6   10:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//    7   13:astore_3        
		_valueInclusion = e2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field JsonInclude$Include _valueInclusion>
		e = e1;
	//   11   19:aload_2         
	//   12   20:astore_1        
		if(e1 == null)
	//*  13   21:aload_2         
	//*  14   22:ifnonnull       29
			e = e.USE_DEFAULTS;
	//   15   25:getstatic       #28  <Field JsonInclude$Include JsonInclude$Include.USE_DEFAULTS>
	//   16   28:astore_1        
		_contentInclusion = e;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #41  <Field JsonInclude$Include _contentInclusion>
	//   20   34:return          
	}

	public JsonInclude$Value(JsonInclude jsoninclude)
	{
		this(jsoninclude.value(), jsoninclude.content());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #46  <Method JsonInclude$Include JsonInclude.value()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #49  <Method JsonInclude$Include JsonInclude.content()>
	//    5   13:invokespecial   #32  <Method void JsonInclude$Value(JsonInclude$Include, JsonInclude$Include)>
	//    6   16:return          
	}
}
