// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ExternalTypeHandler, BeanPropertyMap

public static class ExternalTypeHandler$Builder
{

	private void _addPropertyIndex(String s, Integer integer)
	{
		Object obj = _nameToPropertyIndex.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map _nameToPropertyIndex>
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method Object Map.get(Object)>
	//    4   10:astore_3        
		if(obj == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       28
		{
			_nameToPropertyIndex.put(((Object) (s)), ((Object) (integer)));
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field Map _nameToPropertyIndex>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//   12   26:pop             
			return;
	//   13   27:return          
		}
		if(obj instanceof List)
	//*  14   28:aload_3         
	//*  15   29:instanceof      #47  <Class List>
	//*  16   32:ifeq            47
		{
			((List)obj).add(((Object) (integer)));
	//   17   35:aload_3         
	//   18   36:checkcast       #47  <Class List>
	//   19   39:aload_2         
	//   20   40:invokeinterface #51  <Method boolean List.add(Object)>
	//   21   45:pop             
			return;
	//   22   46:return          
		} else
		{
			LinkedList linkedlist = new LinkedList();
	//   23   47:new             #53  <Class LinkedList>
	//   24   50:dup             
	//   25   51:invokespecial   #54  <Method void LinkedList()>
	//   26   54:astore          4
			((List) (linkedlist)).add(obj);
	//   27   56:aload           4
	//   28   58:aload_3         
	//   29   59:invokeinterface #51  <Method boolean List.add(Object)>
	//   30   64:pop             
			((List) (linkedlist)).add(((Object) (integer)));
	//   31   65:aload           4
	//   32   67:aload_2         
	//   33   68:invokeinterface #51  <Method boolean List.add(Object)>
	//   34   73:pop             
			_nameToPropertyIndex.put(((Object) (s)), ((Object) (linkedlist)));
	//   35   74:aload_0         
	//   36   75:getfield        #30  <Field Map _nameToPropertyIndex>
	//   37   78:aload_1         
	//   38   79:aload           4
	//   39   81:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//   40   86:pop             
			return;
	//   41   87:return          
		}
	}

	public void addExternal(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
	{
		Integer integer = Integer.valueOf(_properties.size());
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List _properties>
	//    2    4:invokeinterface #60  <Method int List.size()>
	//    3    9:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//    4   12:astore_3        
		_properties.add(((Object) (new Property(settablebeanproperty, typedeserializer))));
	//    5   13:aload_0         
	//    6   14:getfield        #25  <Field List _properties>
	//    7   17:new             #68  <Class ExternalTypeHandler$ExtTypedProperty>
	//    8   20:dup             
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:invokespecial   #70  <Method void ExternalTypeHandler$ExtTypedProperty(SettableBeanProperty, TypeDeserializer)>
	//   12   26:invokeinterface #51  <Method boolean List.add(Object)>
	//   13   31:pop             
		_addPropertyIndex(settablebeanproperty.getName(), integer);
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokevirtual   #76  <Method String SettableBeanProperty.getName()>
	//   17   37:aload_3         
	//   18   38:invokespecial   #78  <Method void _addPropertyIndex(String, Integer)>
		_addPropertyIndex(typedeserializer.getPropertyName(), integer);
	//   19   41:aload_0         
	//   20   42:aload_2         
	//   21   43:invokevirtual   #83  <Method String TypeDeserializer.getPropertyName()>
	//   22   46:aload_3         
	//   23   47:invokespecial   #78  <Method void _addPropertyIndex(String, Integer)>
	//   24   50:return          
	}

	public ExternalTypeHandler build(BeanPropertyMap beanpropertymap)
	{
		int j = _properties.size();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List _properties>
	//    2    4:invokeinterface #60  <Method int List.size()>
	//    3    9:istore_3        
		Property aproperty[] = new Property[j];
	//    4   10:iload_3         
	//    5   11:anewarray       Property[]
	//    6   14:astore          4
		for(int i = 0; i < j; i++)
	//*   7   16:iconst_0        
	//*   8   17:istore_2        
	//*   9   18:iload_2         
	//*  10   19:iload_3         
	//*  11   20:icmpge          74
		{
			Property property = (Property)_properties.get(i);
	//   12   23:aload_0         
	//   13   24:getfield        #25  <Field List _properties>
	//   14   27:iload_2         
	//   15   28:invokeinterface #88  <Method Object List.get(int)>
	//   16   33:checkcast       #68  <Class ExternalTypeHandler$ExtTypedProperty>
	//   17   36:astore          5
			SettableBeanProperty settablebeanproperty = beanpropertymap.find(property.getTypePropertyName());
	//   18   38:aload_1         
	//   19   39:aload           5
	//   20   41:invokevirtual   #91  <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   21   44:invokevirtual   #97  <Method SettableBeanProperty BeanPropertyMap.find(String)>
	//   22   47:astore          6
			if(settablebeanproperty != null)
	//*  23   49:aload           6
	//*  24   51:ifnull          61
				property.linkTypeProperty(settablebeanproperty);
	//   25   54:aload           5
	//   26   56:aload           6
	//   27   58:invokevirtual   #101 <Method void ExternalTypeHandler$ExtTypedProperty.linkTypeProperty(SettableBeanProperty)>
			aproperty[i] = property;
	//   28   61:aload           4
	//   29   63:iload_2         
	//   30   64:aload           5
	//   31   66:aastore         
		}

	//   32   67:iload_2         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_2        
	//*  36   71:goto            18
		return new ExternalTypeHandler(_beanType, aproperty, _nameToPropertyIndex, ((String []) (null)), ((com.fasterxml.jackson.databind.util.TokenBuffer []) (null)));
	//   37   74:new             #6   <Class ExternalTypeHandler>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:getfield        #32  <Field JavaType _beanType>
	//   41   82:aload           4
	//   42   84:aload_0         
	//   43   85:getfield        #30  <Field Map _nameToPropertyIndex>
	//   44   88:aconst_null     
	//   45   89:aconst_null     
	//   46   90:invokespecial   #104 <Method void ExternalTypeHandler(JavaType, ExternalTypeHandler$ExtTypedProperty[], Map, String[], com.fasterxml.jackson.databind.util.TokenBuffer[])>
	//   47   93:areturn         
	}

	private final JavaType _beanType;
	private final Map _nameToPropertyIndex = new HashMap();
	private final List _properties = new ArrayList();

	protected ExternalTypeHandler$Builder(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field List _properties>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void HashMap()>
	//   11   23:putfield        #30  <Field Map _nameToPropertyIndex>
		_beanType = javatype;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #32  <Field JavaType _beanType>
	//   15   31:return          
	}
}
