// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ExternalTypeHandler

public static class ExternalTypeHandler$Builder
{

	public void addExternal(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
	{
		Integer integer = Integer.valueOf(_properties.size());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ArrayList _properties>
	//    2    4:invokevirtual   #34  <Method int ArrayList.size()>
	//    3    7:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//    4   10:astore_3        
		_properties.add(((Object) (new Property(settablebeanproperty, typedeserializer))));
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field ArrayList _properties>
	//    7   15:new             #42  <Class ExternalTypeHandler$ExtTypedProperty>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #44  <Method void ExternalTypeHandler$ExtTypedProperty(SettableBeanProperty, TypeDeserializer)>
	//   12   24:invokevirtual   #48  <Method boolean ArrayList.add(Object)>
	//   13   27:pop             
		_nameToPropertyIndex.put(((Object) (settablebeanproperty.getName())), ((Object) (integer)));
	//   14   28:aload_0         
	//   15   29:getfield        #27  <Field HashMap _nameToPropertyIndex>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #54  <Method String SettableBeanProperty.getName()>
	//   18   36:aload_3         
	//   19   37:invokevirtual   #58  <Method Object HashMap.put(Object, Object)>
	//   20   40:pop             
		_nameToPropertyIndex.put(((Object) (typedeserializer.getPropertyName())), ((Object) (integer)));
	//   21   41:aload_0         
	//   22   42:getfield        #27  <Field HashMap _nameToPropertyIndex>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #63  <Method String TypeDeserializer.getPropertyName()>
	//   25   49:aload_3         
	//   26   50:invokevirtual   #58  <Method Object HashMap.put(Object, Object)>
	//   27   53:pop             
	//   28   54:return          
	}

	public ExternalTypeHandler build()
	{
		return new ExternalTypeHandler((Property[])_properties.toArray(((Object []) (new Property[_properties.size()]))), _nameToPropertyIndex, ((String []) (null)), ((com.fasterxml.jackson.databind.util.TokenBuffer []) (null)));
	//    0    0:new             #6   <Class ExternalTypeHandler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ArrayList _properties>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field ArrayList _properties>
	//    6   12:invokevirtual   #34  <Method int ArrayList.size()>
	//    7   15:anewarray       Property[]
	//    8   18:invokevirtual   #69  <Method Object[] ArrayList.toArray(Object[])>
	//    9   21:checkcast       #71  <Class ExternalTypeHandler$ExtTypedProperty[]>
	//   10   24:aload_0         
	//   11   25:getfield        #27  <Field HashMap _nameToPropertyIndex>
	//   12   28:aconst_null     
	//   13   29:aconst_null     
	//   14   30:invokespecial   #74  <Method void ExternalTypeHandler(ExternalTypeHandler$ExtTypedProperty[], HashMap, String[], com.fasterxml.jackson.databind.util.TokenBuffer[])>
	//   15   33:areturn         
	}

	private final HashMap _nameToPropertyIndex = new HashMap();
	private final ArrayList _properties = new ArrayList();

	public ExternalTypeHandler$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field ArrayList _properties>
	//    7   15:aload_0         
	//    8   16:new             #24  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #25  <Method void HashMap()>
	//   11   23:putfield        #27  <Field HashMap _nameToPropertyIndex>
	//   12   26:return          
	}
}
