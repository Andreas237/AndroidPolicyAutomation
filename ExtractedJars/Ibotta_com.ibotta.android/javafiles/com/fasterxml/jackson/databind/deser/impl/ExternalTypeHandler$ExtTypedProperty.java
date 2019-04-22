// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ExternalTypeHandler

private static final class ExternalTypeHandler$ExtTypedProperty
{

	public String getDefaultTypeId()
	{
		Class class1 = _typeDeserializer.getDefaultImpl();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypeDeserializer _typeDeserializer>
	//    2    4:invokevirtual   #37  <Method Class TypeDeserializer.getDefaultImpl()>
	//    3    7:astore_1        
		if(class1 == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return _typeDeserializer.getTypeIdResolver().idFromValueAndType(((Object) (null)), class1);
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field TypeDeserializer _typeDeserializer>
	//   10   18:invokevirtual   #41  <Method TypeIdResolver TypeDeserializer.getTypeIdResolver()>
	//   11   21:aconst_null     
	//   12   22:aload_1         
	//   13   23:invokeinterface #47  <Method String TypeIdResolver.idFromValueAndType(Object, Class)>
	//   14   28:areturn         
	}

	public SettableBeanProperty getProperty()
	{
		return _property;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SettableBeanProperty _property>
	//    2    4:areturn         
	}

	public SettableBeanProperty getTypeProperty()
	{
		return _typeProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SettableBeanProperty _typeProperty>
	//    2    4:areturn         
	}

	public String getTypePropertyName()
	{
		return _typePropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String _typePropertyName>
	//    2    4:areturn         
	}

	public boolean hasDefaultType()
	{
		return _typeDeserializer.getDefaultImpl() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypeDeserializer _typeDeserializer>
	//    2    4:invokevirtual   #37  <Method Class TypeDeserializer.getDefaultImpl()>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean hasTypePropertyName(String s)
	{
		return s.equals(((Object) (_typePropertyName)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field String _typePropertyName>
	//    3    5:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    4    8:ireturn         
	}

	public void linkTypeProperty(SettableBeanProperty settablebeanproperty)
	{
		_typeProperty = settablebeanproperty;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field SettableBeanProperty _typeProperty>
	//    3    5:return          
	}

	private final SettableBeanProperty _property;
	private final TypeDeserializer _typeDeserializer;
	private SettableBeanProperty _typeProperty;
	private final String _typePropertyName;

	public ExternalTypeHandler$ExtTypedProperty(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_property = settablebeanproperty;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field SettableBeanProperty _property>
		_typeDeserializer = typedeserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field TypeDeserializer _typeDeserializer>
		_typePropertyName = typedeserializer.getPropertyName();
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #29  <Method String TypeDeserializer.getPropertyName()>
	//   11   19:putfield        #31  <Field String _typePropertyName>
	//   12   22:return          
	}
}
