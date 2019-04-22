// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, JsonAutoDetect

public static class JsonAutoDetect$Value
	implements JacksonAnnotationValue, Serializable
{

	private static boolean _equals(JsonAutoDetect$Value jsonautodetect$value, JsonAutoDetect$Value jsonautodetect$value1)
	{
		return jsonautodetect$value._fieldVisibility == jsonautodetect$value1._fieldVisibility && jsonautodetect$value._getterVisibility == jsonautodetect$value1._getterVisibility && jsonautodetect$value._isGetterVisibility == jsonautodetect$value1._isGetterVisibility && jsonautodetect$value._setterVisibility == jsonautodetect$value1._setterVisibility && jsonautodetect$value._creatorVisibility == jsonautodetect$value1._creatorVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
	//    2    4:aload_1         
	//    3    5:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
	//    4    8:if_acmpne       57
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//    7   15:aload_1         
	//    8   16:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//    9   19:if_acmpne       57
	//   10   22:aload_0         
	//   11   23:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//   12   26:aload_1         
	//   13   27:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//   14   30:if_acmpne       57
	//   15   33:aload_0         
	//   16   34:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//   17   37:aload_1         
	//   18   38:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//   19   41:if_acmpne       57
	//   20   44:aload_0         
	//   21   45:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//   22   48:aload_1         
	//   23   49:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//   24   52:if_acmpne       57
	//   25   55:iconst_1        
	//   26   56:ireturn         
	//   27   57:iconst_0        
	//   28   58:ireturn         
	}

	private static JsonAutoDetect$Value _predefined(lity lity, lity lity1, lity lity2, lity lity3, lity lity4)
	{
		if(lity == DEFAULT_FIELD_VISIBILITY)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #35  <Field JsonAutoDetect$Visibility DEFAULT_FIELD_VISIBILITY>
	//*   2    4:if_acmpne       46
		{
			lity = ((lity) (DEFAULT));
	//    3    7:getstatic       #44  <Field JsonAutoDetect$Value DEFAULT>
	//    4   10:astore_0        
			if(lity1 == ((JsonAutoDetect$Value) (lity))._getterVisibility && lity2 == ((JsonAutoDetect$Value) (lity))._isGetterVisibility && lity3 == ((JsonAutoDetect$Value) (lity))._setterVisibility && lity4 == ((JsonAutoDetect$Value) (lity))._creatorVisibility)
	//*   5   11:aload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//*   8   16:if_acmpne       86
	//*   9   19:aload_2         
	//*  10   20:aload_0         
	//*  11   21:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//*  12   24:if_acmpne       86
	//*  13   27:aload_3         
	//*  14   28:aload_0         
	//*  15   29:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//*  16   32:if_acmpne       86
	//*  17   35:aload           4
	//*  18   37:aload_0         
	//*  19   38:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//*  20   41:if_acmpne       86
				return ((JsonAutoDetect$Value) (lity));
	//   21   44:aload_0         
	//   22   45:areturn         
		} else
		if(lity == lity.DEFAULT && lity1 == lity.DEFAULT && lity2 == lity.DEFAULT && lity3 == lity.DEFAULT && lity4 == lity.DEFAULT)
	//*  23   46:aload_0         
	//*  24   47:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//*  25   50:if_acmpne       86
	//*  26   53:aload_1         
	//*  27   54:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//*  28   57:if_acmpne       86
	//*  29   60:aload_2         
	//*  30   61:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//*  31   64:if_acmpne       86
	//*  32   67:aload_3         
	//*  33   68:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//*  34   71:if_acmpne       86
	//*  35   74:aload           4
	//*  36   76:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//*  37   79:if_acmpne       86
			return NO_OVERRIDES;
	//   38   82:getstatic       #48  <Field JsonAutoDetect$Value NO_OVERRIDES>
	//   39   85:areturn         
		return null;
	//   40   86:aconst_null     
	//   41   87:areturn         
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
		return obj.getClass() == ((Object)this).getClass() && _equals(this, (JsonAutoDetect$Value)obj);
	//    9   13:aload_1         
	//   10   14:invokevirtual   #71  <Method Class Object.getClass()>
	//   11   17:aload_0         
	//   12   18:invokevirtual   #71  <Method Class Object.getClass()>
	//   13   21:if_acmpne       37
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:checkcast       #2   <Class JsonAutoDetect$Value>
	//   17   29:invokestatic    #73  <Method boolean _equals(JsonAutoDetect$Value, JsonAutoDetect$Value)>
	//   18   32:ifeq            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public lity getCreatorVisibility()
	{
		return _creatorVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//    2    4:areturn         
	}

	public lity getFieldVisibility()
	{
		return _fieldVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
	//    2    4:areturn         
	}

	public lity getGetterVisibility()
	{
		return _getterVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//    2    4:areturn         
	}

	public lity getIsGetterVisibility()
	{
		return _isGetterVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//    2    4:areturn         
	}

	public lity getSetterVisibility()
	{
		return _setterVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return _fieldVisibility.ordinal() + 1 ^ (_getterVisibility.ordinal() * 3 - _isGetterVisibility.ordinal() * 7) + _setterVisibility.ordinal() * 11 ^ _creatorVisibility.ordinal() * 13;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
	//    2    4:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
	//    3    7:iconst_1        
	//    4    8:iadd            
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//    7   13:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
	//    8   16:iconst_3        
	//    9   17:imul            
	//   10   18:aload_0         
	//   11   19:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//   12   22:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
	//   13   25:bipush          7
	//   14   27:imul            
	//   15   28:isub            
	//   16   29:aload_0         
	//   17   30:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//   18   33:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
	//   19   36:bipush          11
	//   20   38:imul            
	//   21   39:iadd            
	//   22   40:ixor            
	//   23   41:aload_0         
	//   24   42:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//   25   45:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
	//   26   48:bipush          13
	//   27   50:imul            
	//   28   51:ixor            
	//   29   52:ireturn         
	}

	protected Object readResolve()
	{
		JsonAutoDetect$Value jsonautodetect$value1 = _predefined(_fieldVisibility, _getterVisibility, _isGetterVisibility, _setterVisibility, _creatorVisibility);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//   10   20:invokestatic    #88  <Method JsonAutoDetect$Value _predefined(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)>
	//   11   23:astore_2        
		JsonAutoDetect$Value jsonautodetect$value = jsonautodetect$value1;
	//   12   24:aload_2         
	//   13   25:astore_1        
		if(jsonautodetect$value1 == null)
	//*  14   26:aload_2         
	//*  15   27:ifnonnull       32
			jsonautodetect$value = this;
	//   16   30:aload_0         
	//   17   31:astore_1        
		return ((Object) (jsonautodetect$value));
	//   18   32:aload_1         
	//   19   33:areturn         
	}

	public String toString()
	{
		return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", new Object[] {
			_fieldVisibility, _getterVisibility, _isGetterVisibility, _setterVisibility, _creatorVisibility
		});
	//    0    0:ldc1            #92  <String "JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)">
	//    1    2:iconst_5        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:aload_0         
	//   16   23:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
	//   17   26:aastore         
	//   18   27:dup             
	//   19   28:iconst_3        
	//   20   29:aload_0         
	//   21   30:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
	//   22   33:aastore         
	//   23   34:dup             
	//   24   35:iconst_4        
	//   25   36:aload_0         
	//   26   37:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//   27   40:aastore         
	//   28   41:invokestatic    #98  <Method String String.format(String, Object[])>
	//   29   44:areturn         
	}

	public Class valueFor()
	{
		return com/fasterxml/jackson/annotation/JsonAutoDetect;
	//    0    0:ldc1            #11  <Class JsonAutoDetect>
	//    1    2:areturn         
	}

	protected static final JsonAutoDetect$Value DEFAULT;
	private static final lity DEFAULT_FIELD_VISIBILITY;
	protected static final JsonAutoDetect$Value NO_OVERRIDES;
	private static final long serialVersionUID = 1L;
	protected final lity _creatorVisibility;
	protected final lity _fieldVisibility;
	protected final lity _getterVisibility;
	protected final lity _isGetterVisibility;
	protected final lity _setterVisibility;

	static 
	{
		DEFAULT_FIELD_VISIBILITY = lity.PUBLIC_ONLY;
	//    0    0:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    1    3:putstatic       #35  <Field JsonAutoDetect$Visibility DEFAULT_FIELD_VISIBILITY>
		DEFAULT = new JsonAutoDetect$Value(DEFAULT_FIELD_VISIBILITY, lity.PUBLIC_ONLY, lity.PUBLIC_ONLY, lity.ANY, lity.PUBLIC_ONLY);
	//    2    6:new             #2   <Class JsonAutoDetect$Value>
	//    3    9:dup             
	//    4   10:getstatic       #35  <Field JsonAutoDetect$Visibility DEFAULT_FIELD_VISIBILITY>
	//    5   13:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    6   16:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    7   19:getstatic       #38  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.ANY>
	//    8   22:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    9   25:invokespecial   #42  <Method void JsonAutoDetect$Value(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)>
	//   10   28:putstatic       #44  <Field JsonAutoDetect$Value DEFAULT>
		NO_OVERRIDES = new JsonAutoDetect$Value(lity.DEFAULT, lity.DEFAULT, lity.DEFAULT, lity.DEFAULT, lity.DEFAULT);
	//   11   31:new             #2   <Class JsonAutoDetect$Value>
	//   12   34:dup             
	//   13   35:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//   14   38:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//   15   41:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//   16   44:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//   17   47:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
	//   18   50:invokespecial   #42  <Method void JsonAutoDetect$Value(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)>
	//   19   53:putstatic       #48  <Field JsonAutoDetect$Value NO_OVERRIDES>
	//*  20   56:return          
	}

	private JsonAutoDetect$Value(lity lity, lity lity1, lity lity2, lity lity3, lity lity4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		_fieldVisibility = lity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		_getterVisibility = lity1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		_isGetterVisibility = lity2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		_setterVisibility = lity3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		_creatorVisibility = lity4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
	//   17   31:return          
	}
}
