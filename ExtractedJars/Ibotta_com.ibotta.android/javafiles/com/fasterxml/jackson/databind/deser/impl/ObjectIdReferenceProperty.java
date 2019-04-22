// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
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
			if(hasId(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #31  <Method boolean hasId(Object)>
		//*   3    5:ifeq            21
			{
				_parent.set(_pojo, obj1);
		//    4    8:aload_0         
		//    5    9:getfield        #18  <Field ObjectIdReferenceProperty _parent>
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field Object _pojo>
		//    8   16:aload_2         
		//    9   17:invokevirtual   #34  <Method void ObjectIdReferenceProperty.set(Object, Object)>
				return;
		//   10   20:return          
			} else
			{
				obj1 = ((Object) (new StringBuilder()));
		//   11   21:new             #36  <Class StringBuilder>
		//   12   24:dup             
		//   13   25:invokespecial   #39  <Method void StringBuilder()>
		//   14   28:astore_2        
				((StringBuilder) (obj1)).append("Trying to resolve a forward reference with id [");
		//   15   29:aload_2         
		//   16   30:ldc1            #41  <String "Trying to resolve a forward reference with id [">
		//   17   32:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   18   35:pop             
				((StringBuilder) (obj1)).append(obj);
		//   19   36:aload_2         
		//   20   37:aload_1         
		//   21   38:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   22   41:pop             
				((StringBuilder) (obj1)).append("] that wasn't previously seen as unresolved.");
		//   23   42:aload_2         
		//   24   43:ldc1            #50  <String "] that wasn't previously seen as unresolved.">
		//   25   45:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
		//   27   49:new             #52  <Class IllegalArgumentException>
		//   28   52:dup             
		//   29   53:aload_2         
		//   30   54:invokevirtual   #56  <Method String StringBuilder.toString()>
		//   31   57:invokespecial   #59  <Method void IllegalArgumentException(String)>
		//   32   60:athrow          
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

	public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectidreferenceproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((SettableBeanProperty) (objectidreferenceproperty)), jsondeserializer, nullvalueprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #29  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer, NullValueProvider)>
		_forward = objectidreferenceproperty._forward;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #20  <Field SettableBeanProperty _forward>
	//    8   12:putfield        #20  <Field SettableBeanProperty _forward>
		_objectIdInfo = objectidreferenceproperty._objectIdInfo;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//   12   20:putfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//   13   23:return          
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
			if(_objectIdInfo == null && _valueDeserializer.getObjectIdReader() == null)
	//*  11   15:aload_0         
	//*  12   16:getfield        #24  <Field ObjectIdInfo _objectIdInfo>
	//*  13   19:ifnonnull       41
	//*  14   22:aload_0         
	//*  15   23:getfield        #58  <Field JsonDeserializer _valueDeserializer>
	//*  16   26:invokevirtual   #64  <Method ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//*  17   29:ifnull          35
	//*  18   32:goto            41
				flag = false;
	//   19   35:iconst_0        
	//   20   36:istore          4
			else
	//*  21   38:goto            44
				flag = true;
	//   22   41:iconst_1        
	//   23   42:istore          4
			if(flag)
	//*  24   44:iload           4
	//*  25   46:ifeq            75
			{
				((UnresolvedForwardReference) (deserializationcontext)).getRoid().appendReferring(((ReadableObjectId.Referring) (new PropertyReferring(this, ((UnresolvedForwardReference) (deserializationcontext)), _type.getRawClass(), obj))));
	//   26   49:aload_2         
	//   27   50:invokevirtual   #68  <Method ReadableObjectId UnresolvedForwardReference.getRoid()>
	//   28   53:new             #6   <Class ObjectIdReferenceProperty$PropertyReferring>
	//   29   56:dup             
	//   30   57:aload_0         
	//   31   58:aload_2         
	//   32   59:aload_0         
	//   33   60:getfield        #72  <Field JavaType _type>
	//   34   63:invokevirtual   #78  <Method Class JavaType.getRawClass()>
	//   35   66:aload_3         
	//   36   67:invokespecial   #81  <Method void ObjectIdReferenceProperty$PropertyReferring(ObjectIdReferenceProperty, UnresolvedForwardReference, Class, Object)>
	//   37   70:invokevirtual   #87  <Method void ReadableObjectId.appendReferring(ReadableObjectId$Referring)>
				return ((Object) (null));
	//   38   73:aconst_null     
	//   39   74:areturn         
			} else
			{
				throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info", ((Throwable) (deserializationcontext)));
	//   40   75:aload_1         
	//   41   76:ldc1            #89  <String "Unresolved forward reference but no identity info">
	//   42   78:aload_2         
	//   43   79:invokestatic    #95  <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//   44   82:athrow          
			}
		}
		return ((Object) (deserializationcontext));
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		SettableBeanProperty settablebeanproperty = _forward;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:astore_2        
		if(settablebeanproperty != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			settablebeanproperty.fixAccess(deserializationconfig);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #99  <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
	//    8   14:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		return _forward.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #103 <Method Annotation SettableBeanProperty.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public int getCreatorIndex()
	{
		return _forward.getCreatorIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:invokevirtual   #108 <Method int SettableBeanProperty.getCreatorIndex()>
	//    3    7:ireturn         
	}

	public AnnotatedMember getMember()
	{
		return _forward.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SettableBeanProperty _forward>
	//    2    4:invokevirtual   #112 <Method AnnotatedMember SettableBeanProperty.getMember()>
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
	//    4    6:invokevirtual   #116 <Method void SettableBeanProperty.set(Object, Object)>
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
	//    4    6:invokevirtual   #117 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new ObjectIdReferenceProperty(this, propertyname)));
	//    0    0:new             #2   <Class ObjectIdReferenceProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #121 <Method void ObjectIdReferenceProperty(ObjectIdReferenceProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return ((SettableBeanProperty) (new ObjectIdReferenceProperty(this, _valueDeserializer, nullvalueprovider)));
	//    0    0:new             #2   <Class ObjectIdReferenceProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field JsonDeserializer _valueDeserializer>
	//    5    9:aload_1         
	//    6   10:invokespecial   #125 <Method void ObjectIdReferenceProperty(ObjectIdReferenceProperty, JsonDeserializer, NullValueProvider)>
	//    7   13:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_valueDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new ObjectIdReferenceProperty(this, jsondeserializer, _nullProvider)));
	//    6   10:new             #2   <Class ObjectIdReferenceProperty>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #131 <Field NullValueProvider _nullProvider>
	//   12   20:invokespecial   #125 <Method void ObjectIdReferenceProperty(ObjectIdReferenceProperty, JsonDeserializer, NullValueProvider)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final SettableBeanProperty _forward;
}
