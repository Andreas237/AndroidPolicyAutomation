// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.*;

public class ReadableObjectId
{
	public static abstract class Referring
	{

		public Class getBeanType()
		{
			return _beanType;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Class _beanType>
		//    2    4:areturn         
		}

		public JsonLocation getLocation()
		{
			return _reference.getLocation();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field UnresolvedForwardReference _reference>
		//    2    4:invokevirtual   #39  <Method JsonLocation UnresolvedForwardReference.getLocation()>
		//    3    7:areturn         
		}

		public abstract void handleResolvedForwardReference(Object obj, Object obj1)
			throws IOException;

		public boolean hasId(Object obj)
		{
			return obj.equals(_reference.getUnresolvedId());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #19  <Field UnresolvedForwardReference _reference>
		//    3    5:invokevirtual   #49  <Method Object UnresolvedForwardReference.getUnresolvedId()>
		//    4    8:invokevirtual   #52  <Method boolean Object.equals(Object)>
		//    5   11:ireturn         
		}

		private final Class _beanType;
		private final UnresolvedForwardReference _reference;

		public Referring(UnresolvedForwardReference unresolvedforwardreference, JavaType javatype)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			_reference = unresolvedforwardreference;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field UnresolvedForwardReference _reference>
			_beanType = javatype.getRawClass();
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #25  <Method Class JavaType.getRawClass()>
		//    8   14:putfield        #27  <Field Class _beanType>
		//    9   17:return          
		}

		public Referring(UnresolvedForwardReference unresolvedforwardreference, Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			_reference = unresolvedforwardreference;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field UnresolvedForwardReference _reference>
			_beanType = class1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field Class _beanType>
		//    8   14:return          
		}
	}


	public ReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_key = idkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    5    9:return          
	}

	public void appendReferring(Referring referring)
	{
		if(_referringProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field LinkedList _referringProperties>
	//*   2    4:ifnonnull       18
			_referringProperties = new LinkedList();
	//    3    7:aload_0         
	//    4    8:new             #30  <Class LinkedList>
	//    5   11:dup             
	//    6   12:invokespecial   #31  <Method void LinkedList()>
	//    7   15:putfield        #28  <Field LinkedList _referringProperties>
		_referringProperties.add(((Object) (referring)));
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field LinkedList _referringProperties>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #35  <Method boolean LinkedList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void bindItem(Object obj)
		throws IOException
	{
		_resolver.bindItem(_key, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ObjectIdResolver _resolver>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    4    8:aload_1         
	//    5    9:invokeinterface #46  <Method void ObjectIdResolver.bindItem(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey, Object)>
		_item = obj;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #48  <Field Object _item>
		Object obj1 = _key.key;
	//    9   19:aload_0         
	//   10   20:getfield        #23  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//   11   23:getfield        #53  <Field Object com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey.key>
	//   12   26:astore_2        
		Object obj2 = ((Object) (_referringProperties));
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field LinkedList _referringProperties>
	//   15   31:astore_3        
		if(obj2 != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          72
		{
			obj2 = ((Object) (((LinkedList) (obj2)).iterator()));
	//   18   36:aload_3         
	//   19   37:invokevirtual   #57  <Method Iterator LinkedList.iterator()>
	//   20   40:astore_3        
			_referringProperties = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #28  <Field LinkedList _referringProperties>
			for(; ((Iterator) (obj2)).hasNext(); ((Referring)((Iterator) (obj2)).next()).handleResolvedForwardReference(obj1, obj));
	//   24   46:aload_3         
	//   25   47:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   26   52:ifeq            72
	//   27   55:aload_3         
	//   28   56:invokeinterface #67  <Method Object Iterator.next()>
	//   29   61:checkcast       #6   <Class ReadableObjectId$Referring>
	//   30   64:aload_2         
	//   31   65:aload_1         
	//   32   66:invokevirtual   #71  <Method void ReadableObjectId$Referring.handleResolvedForwardReference(Object, Object)>
		}
	//*  33   69:goto            46
	//   34   72:return          
	}

	public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey getKey()
	{
		return _key;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    2    4:areturn         
	}

	public boolean hasReferringProperties()
	{
		LinkedList linkedlist = _referringProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field LinkedList _referringProperties>
	//    2    4:astore_1        
		return linkedlist != null && !linkedlist.isEmpty();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #78  <Method boolean LinkedList.isEmpty()>
	//    7   13:ifne            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public Iterator referringProperties()
	{
		LinkedList linkedlist = _referringProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field LinkedList _referringProperties>
	//    2    4:astore_1        
		if(linkedlist == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       18
			return Collections.emptyList().iterator();
	//    5    9:invokestatic    #85  <Method List Collections.emptyList()>
	//    6   12:invokeinterface #88  <Method Iterator List.iterator()>
	//    7   17:areturn         
		else
			return linkedlist.iterator();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #57  <Method Iterator LinkedList.iterator()>
	//   10   22:areturn         
	}

	public Object resolve()
	{
		Object obj = _resolver.resolveId(_key);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ObjectIdResolver _resolver>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    4    8:invokeinterface #95  <Method Object ObjectIdResolver.resolveId(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey)>
	//    5   13:astore_1        
		_item = obj;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #48  <Field Object _item>
		return obj;
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public void setResolver(ObjectIdResolver objectidresolver)
	{
		_resolver = objectidresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field ObjectIdResolver _resolver>
	//    3    5:return          
	}

	public String toString()
	{
		return String.valueOf(((Object) (_key)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    2    4:invokestatic    #105 <Method String String.valueOf(Object)>
	//    3    7:areturn         
	}

	public boolean tryToResolveUnresolved(DeserializationContext deserializationcontext)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected Object _item;
	protected final com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey _key;
	protected LinkedList _referringProperties;
	protected ObjectIdResolver _resolver;
}
