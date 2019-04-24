// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
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
		//    1    1:getfield        #21  <Field Class _beanType>
		//    2    4:areturn         
		}

		public JsonLocation getLocation()
		{
			return _reference.getLocation();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field UnresolvedForwardReference _reference>
		//    2    4:invokevirtual   #33  <Method JsonLocation UnresolvedForwardReference.getLocation()>
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
		//    3    5:invokevirtual   #43  <Method Object UnresolvedForwardReference.getUnresolvedId()>
		//    4    8:invokevirtual   #46  <Method boolean Object.equals(Object)>
		//    5   11:ireturn         
		}

		private final Class _beanType;
		private final UnresolvedForwardReference _reference;

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
		//    7   11:putfield        #21  <Field Class _beanType>
		//    8   14:return          
		}
	}


	public ReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_key = idkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
		id = idkey.key;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #30  <Field Object com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey.key>
	//    8   14:putfield        #32  <Field Object id>
	//    9   17:return          
	}

	public ReadableObjectId(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		id = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Object id>
		_key = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    8   14:return          
	}

	public void appendReferring(Referring referring)
	{
		if(_referringProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field LinkedList _referringProperties>
	//*   2    4:ifnonnull       18
			_referringProperties = new LinkedList();
	//    3    7:aload_0         
	//    4    8:new             #41  <Class LinkedList>
	//    5   11:dup             
	//    6   12:invokespecial   #42  <Method void LinkedList()>
	//    7   15:putfield        #39  <Field LinkedList _referringProperties>
		_referringProperties.add(((Object) (referring)));
	//    8   18:aload_0         
	//    9   19:getfield        #39  <Field LinkedList _referringProperties>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #46  <Method boolean LinkedList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void bindItem(Object obj)
		throws IOException
	{
		_resolver.bindItem(_key, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ObjectIdResolver _resolver>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    4    8:aload_1         
	//    5    9:invokeinterface #56  <Method void ObjectIdResolver.bindItem(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey, Object)>
		item = obj;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #58  <Field Object item>
		if(_referringProperties != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #39  <Field LinkedList _referringProperties>
	//*  11   23:ifnull          68
		{
			Iterator iterator = _referringProperties.iterator();
	//   12   26:aload_0         
	//   13   27:getfield        #39  <Field LinkedList _referringProperties>
	//   14   30:invokevirtual   #62  <Method Iterator LinkedList.iterator()>
	//   15   33:astore_2        
			_referringProperties = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #39  <Field LinkedList _referringProperties>
			for(; iterator.hasNext(); ((Referring)iterator.next()).handleResolvedForwardReference(id, obj));
	//   19   39:aload_2         
	//   20   40:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            68
	//   22   48:aload_2         
	//   23   49:invokeinterface #72  <Method Object Iterator.next()>
	//   24   54:checkcast       #6   <Class ReadableObjectId$Referring>
	//   25   57:aload_0         
	//   26   58:getfield        #32  <Field Object id>
	//   27   61:aload_1         
	//   28   62:invokevirtual   #76  <Method void ReadableObjectId$Referring.handleResolvedForwardReference(Object, Object)>
		}
	//*  29   65:goto            39
	//   30   68:return          
	}

	public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey getKey()
	{
		return _key;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    2    4:areturn         
	}

	public ObjectIdResolver getResolver()
	{
		return _resolver;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ObjectIdResolver _resolver>
	//    2    4:areturn         
	}

	public boolean hasReferringProperties()
	{
		return _referringProperties != null && !_referringProperties.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field LinkedList _referringProperties>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field LinkedList _referringProperties>
	//    5   11:invokevirtual   #85  <Method boolean LinkedList.isEmpty()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public Iterator referringProperties()
	{
		if(_referringProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field LinkedList _referringProperties>
	//*   2    4:ifnonnull       16
			return Collections.emptyList().iterator();
	//    3    7:invokestatic    #92  <Method List Collections.emptyList()>
	//    4   10:invokeinterface #95  <Method Iterator List.iterator()>
	//    5   15:areturn         
		else
			return _referringProperties.iterator();
	//    6   16:aload_0         
	//    7   17:getfield        #39  <Field LinkedList _referringProperties>
	//    8   20:invokevirtual   #62  <Method Iterator LinkedList.iterator()>
	//    9   23:areturn         
	}

	public Object resolve()
	{
		Object obj = _resolver.resolveId(_key);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ObjectIdResolver _resolver>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    4    8:invokeinterface #102 <Method Object ObjectIdResolver.resolveId(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey)>
	//    5   13:astore_1        
		item = obj;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #58  <Field Object item>
		return obj;
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public void setResolver(ObjectIdResolver objectidresolver)
	{
		_resolver = objectidresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field ObjectIdResolver _resolver>
	//    3    5:return          
	}

	public String toString()
	{
		return String.valueOf(((Object) (_key)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey _key>
	//    2    4:invokestatic    #112 <Method String String.valueOf(Object)>
	//    3    7:areturn         
	}

	public boolean tryToResolveUnresolved(DeserializationContext deserializationcontext)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey _key;
	protected LinkedList _referringProperties;
	protected ObjectIdResolver _resolver;
	public final Object id;
	public Object item;
}
