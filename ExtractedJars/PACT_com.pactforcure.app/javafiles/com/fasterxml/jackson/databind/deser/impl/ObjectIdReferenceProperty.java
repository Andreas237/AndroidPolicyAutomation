// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ReadableObjectId

public class ObjectIdReferenceProperty extends SettableBeanProperty
{
	public static final class PropertyReferring extends ReadableObjectId.Referring
	{

		public void handleResolvedForwardReference(Object obj, Object obj1)
			throws IOException
		{
			if(!hasId(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #31  <Method boolean hasId(Object)>
		//*   3    5:ifne            40
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
		//    4    8:new             #33  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:new             #35  <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #38  <Method void StringBuilder()>
		//    9   19:ldc1            #40  <String "Trying to resolve a forward reference with id [">
		//   10   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:aload_1         
		//   12   25:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
		//   13   28:ldc1            #49  <String "] that wasn't previously seen as unresolved.">
		//   14   30:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   15   33:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   16   36:invokespecial   #56  <Method void IllegalArgumentException(String)>
		//   17   39:athrow          
			} else
			{
				_parent.set(_pojo, obj1);
		//   18   40:aload_0         
		//   19   41:getfield        #18  <Field ObjectIdReferenceProperty _parent>
		//   20   44:aload_0         
		//   21   45:getfield        #20  <Field Object _pojo>
		//   22   48:aload_2         
		//   23   49:invokevirtual   #59  <Method void ObjectIdReferenceProperty.set(Object, Object)>
				return;
		//   24   52:return          
			}
		}

		private final ObjectIdReferenceProperty _parent;
		public final Object _pojo;

		public PropertyReferring(ObjectIdReferenceProperty objectidreferenceproperty, UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj)
		{
			super(unresolvedforwardreference, class1);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #16  <Method void ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
			_parent = objectidreferenceproperty;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #18  <Field ObjectIdReferenceProperty _parent>
			_pojo = obj;
		//    7   11:aload_0         
		//    8   12:aload           4
		//    9   14:putfield        #20  <Field Object _pojo>
		//   10   17:return          
		}
	}


	public ObjectIdReferenceProperty(SettableBeanProperty settablebeanproperty, ObjectIdInfo objectidinfo)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void SettableBeanProperty(SettableBeanProperty)>
		_forward = settablebeanproperty;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #20  <Field SettableBeanProperty _forward>
		_objectIdInfo = objectidinfo;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//    9   15:return          
	}

	public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectidreferenceproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (objectidreferenceproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_forward = objectidreferenceproperty._forward;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #20  <Field SettableBeanProperty _forward>
	//    7   11:putfield        #20  <Field SettableBeanProperty _forward>
		_objectIdInfo = objectidreferenceproperty._objectIdInfo;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//   11   19:putfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//   12   22:return          
	}

	public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectidreferenceproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (objectidreferenceproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_forward = objectidreferenceproperty._forward;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #20  <Field SettableBeanProperty _forward>
	//    7   11:putfield        #20  <Field SettableBeanProperty _forward>
		_objectIdInfo = objectidreferenceproperty._objectIdInfo;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//   11   19:putfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//   12   22:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #43  <Method Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//    5    7:pop             
	//    6    8:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		try
		{
			deserializationcontext = ((DeserializationContext) (setAndReturn(obj, deserialize(jsonparser, deserializationcontext))));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #50  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #54  <Method Object setAndReturn(Object, Object)>
	//    7   11:astore_2        
		}
	//*   8   12:aload_2         
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(DeserializationContext deserializationcontext)
	//*  10   14:astore_2        
		{
			boolean flag;
			if(_objectIdInfo != null || _valueDeserializer.getObjectIdReader() != null)
	//*  11   15:aload_0         
	//*  12   16:getfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//*  13   19:ifnonnull       32
	//*  14   22:aload_0         
	//*  15   23:getfield        #58  <Field JsonDeserializer _valueDeserializer>
	//*  16   26:invokevirtual   #64  <Method ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//*  17   29:ifnull          48
				flag = true;
	//   18   32:iconst_1        
	//   19   33:istore          4
			else
	//*  20   35:iload           4
	//*  21   37:ifne            54
	//*  22   40:aload_1         
	//*  23   41:ldc1            #66  <String "Unresolved forward reference but no identity info.">
	//*  24   43:aload_2         
	//*  25   44:invokestatic    #72  <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//*  26   47:athrow          
				flag = false;
	//   27   48:iconst_0        
	//   28   49:istore          4
			if(!flag)
			{
				throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info.", ((Throwable) (deserializationcontext)));
			} else
	//*  29   51:goto            35
			{
				((UnresolvedForwardReference) (deserializationcontext)).getRoid().appendReferring(((ReadableObjectId.Referring) (new PropertyReferring(this, ((UnresolvedForwardReference) (deserializationcontext)), _type.getRawClass(), obj))));
	//   30   54:aload_2         
	//   31   55:invokevirtual   #76  <Method ReadableObjectId UnresolvedForwardReference.getRoid()>
	//   32   58:new             #6   <Class ObjectIdReferenceProperty$PropertyReferring>
	//   33   61:dup             
	//   34   62:aload_0         
	//   35   63:aload_2         
	//   36   64:aload_0         
	//   37   65:getfield        #80  <Field JavaType _type>
	//   38   68:invokevirtual   #86  <Method Class JavaType.getRawClass()>
	//   39   71:aload_3         
	//   40   72:invokespecial   #89  <Method void ObjectIdReferenceProperty$PropertyReferring(ObjectIdReferenceProperty, UnresolvedForwardReference, Class, Object)>
	//   41   75:invokevirtual   #95  <Method void ReadableObjectId.appendReferring(ReadableObjectId$Referring)>
				return ((Object) (null));
	//   42   78:aconst_null     
	//   43   79:areturn         
			}
		}
		return ((Object) (deserializationcontext));
	}

	public Annotation getAnnotation(Class class1)
	{
		return _forward.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method Annotation SettableBeanProperty.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public int getCreatorIndex()
	{
		return _forward.getCreatorIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:invokevirtual   #104 <Method int SettableBeanProperty.getCreatorIndex()>
	//    3    7:ireturn         
	}

	public AnnotatedMember getMember()
	{
		return _forward.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:invokevirtual   #108 <Method AnnotatedMember SettableBeanProperty.getMember()>
	//    3    7:areturn         
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		_forward.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #112 <Method void SettableBeanProperty.set(Object, Object)>
	//    5    9:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		return _forward.setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #113 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new ObjectIdReferenceProperty(this, propertyname)));
	//    0    0:new             #2   <Class ObjectIdReferenceProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #117 <Method void ObjectIdReferenceProperty(ObjectIdReferenceProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (new ObjectIdReferenceProperty(this, jsondeserializer)));
	//    0    0:new             #2   <Class ObjectIdReferenceProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #121 <Method void ObjectIdReferenceProperty(ObjectIdReferenceProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final SettableBeanProperty _forward;
}
