// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, JsonSetter, Nulls

public static class JsonSetter$Value
	implements JacksonAnnotationValue, Serializable
{

	private static boolean _empty(Nulls nulls, Nulls nulls1)
	{
		return nulls == Nulls.DEFAULT && nulls1 == Nulls.DEFAULT;
	//    0    0:aload_0         
	//    1    1:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//    2    4:if_acmpne       16
	//    3    7:aload_1         
	//    4    8:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//    5   11:if_acmpne       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static JsonSetter$Value construct(Nulls nulls, Nulls nulls1)
	{
		Nulls nulls2 = nulls;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(nulls == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			nulls2 = Nulls.DEFAULT;
	//    4    6:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//    5    9:astore_2        
		nulls = nulls1;
	//    6   10:aload_1         
	//    7   11:astore_0        
		if(nulls1 == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       20
			nulls = Nulls.DEFAULT;
	//   10   16:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//   11   19:astore_0        
		if(_empty(nulls2, nulls))
	//*  12   20:aload_2         
	//*  13   21:aload_0         
	//*  14   22:invokestatic    #47  <Method boolean _empty(Nulls, Nulls)>
	//*  15   25:ifeq            32
			return EMPTY;
	//   16   28:getstatic       #34  <Field JsonSetter$Value EMPTY>
	//   17   31:areturn         
		else
			return new JsonSetter$Value(nulls2, nulls);
	//   18   32:new             #2   <Class JsonSetter$Value>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:invokespecial   #32  <Method void JsonSetter$Value(Nulls, Nulls)>
	//   23   41:areturn         
	}

	public static JsonSetter$Value empty()
	{
		return EMPTY;
	//    0    0:getstatic       #34  <Field JsonSetter$Value EMPTY>
	//    1    3:areturn         
	}

	public static JsonSetter$Value from(JsonSetter jsonsetter)
	{
		if(jsonsetter == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return EMPTY;
	//    2    4:getstatic       #34  <Field JsonSetter$Value EMPTY>
	//    3    7:areturn         
		else
			return construct(jsonsetter.nulls(), jsonsetter.contentNulls());
	//    4    8:aload_0         
	//    5    9:invokeinterface #55  <Method Nulls JsonSetter.nulls()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #58  <Method Nulls JsonSetter.contentNulls()>
	//    8   20:invokestatic    #60  <Method JsonSetter$Value construct(Nulls, Nulls)>
	//    9   23:areturn         
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
		if(obj.getClass() == ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #66  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #66  <Method Class Object.getClass()>
	//*  13   21:if_acmpne       55
		{
			obj = ((Object) ((JsonSetter$Value)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class JsonSetter$Value>
	//   16   28:astore_1        
			return ((JsonSetter$Value) (obj))._nulls == _nulls && ((JsonSetter$Value) (obj))._contentNulls == _contentNulls;
	//   17   29:aload_1         
	//   18   30:getfield        #39  <Field Nulls _nulls>
	//   19   33:aload_0         
	//   20   34:getfield        #39  <Field Nulls _nulls>
	//   21   37:if_acmpne       53
	//   22   40:aload_1         
	//   23   41:getfield        #41  <Field Nulls _contentNulls>
	//   24   44:aload_0         
	//   25   45:getfield        #41  <Field Nulls _contentNulls>
	//   26   48:if_acmpne       53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
		} else
		{
			return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
		}
	}

	public int hashCode()
	{
		return _nulls.ordinal() + (_contentNulls.ordinal() << 2);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Nulls _nulls>
	//    2    4:invokevirtual   #71  <Method int Nulls.ordinal()>
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Nulls _contentNulls>
	//    5   11:invokevirtual   #71  <Method int Nulls.ordinal()>
	//    6   14:iconst_2        
	//    7   15:ishl            
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	public Nulls nonDefaultContentNulls()
	{
		if(_contentNulls == Nulls.DEFAULT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Nulls _contentNulls>
	//*   2    4:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//*   3    7:if_acmpne       12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return _contentNulls;
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field Nulls _contentNulls>
	//    8   16:areturn         
	}

	public Nulls nonDefaultValueNulls()
	{
		if(_nulls == Nulls.DEFAULT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Nulls _nulls>
	//*   2    4:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//*   3    7:if_acmpne       12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return _nulls;
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field Nulls _nulls>
	//    8   16:areturn         
	}

	protected Object readResolve()
	{
		if(_empty(_nulls, _contentNulls))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Nulls _nulls>
	//*   2    4:aload_0         
	//*   3    5:getfield        #41  <Field Nulls _contentNulls>
	//*   4    8:invokestatic    #47  <Method boolean _empty(Nulls, Nulls)>
	//*   5   11:ifeq            18
			return ((Object) (EMPTY));
	//    6   14:getstatic       #34  <Field JsonSetter$Value EMPTY>
	//    7   17:areturn         
		else
			return ((Object) (this));
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public String toString()
	{
		return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", new Object[] {
			_nulls, _contentNulls
		});
	//    0    0:ldc1            #79  <String "JsonSetter.Value(valueNulls=%s,contentNulls=%s)">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #39  <Field Nulls _nulls>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #41  <Field Nulls _contentNulls>
	//   12   19:aastore         
	//   13   20:invokestatic    #85  <Method String String.format(String, Object[])>
	//   14   23:areturn         
	}

	public Class valueFor()
	{
		return com/fasterxml/jackson/annotation/JsonSetter;
	//    0    0:ldc1            #11  <Class JsonSetter>
	//    1    2:areturn         
	}

	public JsonSetter$Value withOverrides(JsonSetter$Value jsonsetter$value)
	{
		if(jsonsetter$value != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          75
		{
			if(jsonsetter$value == EMPTY)
	//*   2    4:aload_1         
	//*   3    5:getstatic       #34  <Field JsonSetter$Value EMPTY>
	//*   4    8:if_acmpne       13
				return this;
	//    5   11:aload_0         
	//    6   12:areturn         
			Nulls nulls = jsonsetter$value._nulls;
	//    7   13:aload_1         
	//    8   14:getfield        #39  <Field Nulls _nulls>
	//    9   17:astore_2        
			Nulls nulls1 = jsonsetter$value._contentNulls;
	//   10   18:aload_1         
	//   11   19:getfield        #41  <Field Nulls _contentNulls>
	//   12   22:astore_3        
			jsonsetter$value = ((JsonSetter$Value) (nulls));
	//   13   23:aload_2         
	//   14   24:astore_1        
			if(nulls == Nulls.DEFAULT)
	//*  15   25:aload_2         
	//*  16   26:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//*  17   29:if_acmpne       37
				jsonsetter$value = ((JsonSetter$Value) (_nulls));
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field Nulls _nulls>
	//   20   36:astore_1        
			nulls = nulls1;
	//   21   37:aload_3         
	//   22   38:astore_2        
			if(nulls1 == Nulls.DEFAULT)
	//*  23   39:aload_3         
	//*  24   40:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//*  25   43:if_acmpne       51
				nulls = _contentNulls;
	//   26   46:aload_0         
	//   27   47:getfield        #41  <Field Nulls _contentNulls>
	//   28   50:astore_2        
			if(jsonsetter$value == _nulls && nulls == _contentNulls)
	//*  29   51:aload_1         
	//*  30   52:aload_0         
	//*  31   53:getfield        #39  <Field Nulls _nulls>
	//*  32   56:if_acmpne       69
	//*  33   59:aload_2         
	//*  34   60:aload_0         
	//*  35   61:getfield        #41  <Field Nulls _contentNulls>
	//*  36   64:if_acmpne       69
				return this;
	//   37   67:aload_0         
	//   38   68:areturn         
			else
				return construct(((Nulls) (jsonsetter$value)), nulls);
	//   39   69:aload_1         
	//   40   70:aload_2         
	//   41   71:invokestatic    #60  <Method JsonSetter$Value construct(Nulls, Nulls)>
	//   42   74:areturn         
		} else
		{
			return this;
	//   43   75:aload_0         
	//   44   76:areturn         
		}
	}

	protected static final JsonSetter$Value EMPTY;
	private static final long serialVersionUID = 1L;
	private final Nulls _contentNulls;
	private final Nulls _nulls;

	static 
	{
		EMPTY = new JsonSetter$Value(Nulls.DEFAULT, Nulls.DEFAULT);
	//    0    0:new             #2   <Class JsonSetter$Value>
	//    1    3:dup             
	//    2    4:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//    3    7:getstatic       #28  <Field Nulls Nulls.DEFAULT>
	//    4   10:invokespecial   #32  <Method void JsonSetter$Value(Nulls, Nulls)>
	//    5   13:putstatic       #34  <Field JsonSetter$Value EMPTY>
	//*   6   16:return          
	}

	protected JsonSetter$Value(Nulls nulls, Nulls nulls1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_nulls = nulls;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field Nulls _nulls>
		_contentNulls = nulls1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field Nulls _contentNulls>
	//    8   14:return          
	}
}
