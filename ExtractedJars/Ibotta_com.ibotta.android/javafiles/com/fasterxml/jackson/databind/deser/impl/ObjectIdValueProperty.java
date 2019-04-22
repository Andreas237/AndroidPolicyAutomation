// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ObjectIdReader, ReadableObjectId

public final class ObjectIdValueProperty extends SettableBeanProperty
{

	public ObjectIdValueProperty(ObjectIdReader objectidreader, PropertyMetadata propertymetadata)
	{
		super(objectidreader.propertyName, objectidreader.getIdType(), propertymetadata, objectidreader.getDeserializer());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #18  <Field PropertyName ObjectIdReader.propertyName>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method com.fasterxml.jackson.databind.JavaType ObjectIdReader.getIdType()>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #26  <Method JsonDeserializer ObjectIdReader.getDeserializer()>
	//    8   14:invokespecial   #29  <Method void SettableBeanProperty(PropertyName, com.fasterxml.jackson.databind.JavaType, PropertyMetadata, JsonDeserializer)>
		_objectIdReader = objectidreader;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #31  <Field ObjectIdReader _objectIdReader>
	//   12   22:return          
	}

	protected ObjectIdValueProperty(ObjectIdValueProperty objectidvalueproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((SettableBeanProperty) (objectidvalueproperty)), jsondeserializer, nullvalueprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #36  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer, NullValueProvider)>
		_objectIdReader = objectidvalueproperty._objectIdReader;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//    8   12:putfield        #31  <Field ObjectIdReader _objectIdReader>
	//    9   15:return          
	}

	protected ObjectIdValueProperty(ObjectIdValueProperty objectidvalueproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (objectidvalueproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_objectIdReader = objectidvalueproperty._objectIdReader;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//    7   11:putfield        #31  <Field ObjectIdReader _objectIdReader>
	//    8   14:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #50  <Method Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//    5    7:pop             
	//    6    8:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #57  <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #63  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            12
			return ((Object) (null));
	//    4   10:aconst_null     
	//    5   11:areturn         
		jsonparser = ((JsonParser) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field JsonDeserializer _valueDeserializer>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #73  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   11   21:astore_1        
		deserializationcontext.findObjectId(((Object) (jsonparser)), _objectIdReader.generator, _objectIdReader.resolver).bindItem(obj);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//   16   28:getfield        #77  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator ObjectIdReader.generator>
	//   17   31:aload_0         
	//   18   32:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//   19   35:getfield        #81  <Field com.fasterxml.jackson.annotation.ObjectIdResolver ObjectIdReader.resolver>
	//   20   38:invokevirtual   #87  <Method ReadableObjectId DeserializationContext.findObjectId(Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//   21   41:aload_3         
	//   22   42:invokevirtual   #93  <Method void ReadableObjectId.bindItem(Object)>
		deserializationcontext = ((DeserializationContext) (_objectIdReader.idProperty));
	//   23   45:aload_0         
	//   24   46:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//   25   49:getfield        #97  <Field SettableBeanProperty ObjectIdReader.idProperty>
	//   26   52:astore_2        
		if(deserializationcontext != null)
	//*  27   53:aload_2         
	//*  28   54:ifnull          64
			return ((SettableBeanProperty) (deserializationcontext)).setAndReturn(obj, ((Object) (jsonparser)));
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #101 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   33   63:areturn         
		else
			return obj;
	//   34   64:aload_3         
	//   35   65:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedMember getMember()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #109 <Method Object setAndReturn(Object, Object)>
	//    4    6:pop             
	//    5    7:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		SettableBeanProperty settablebeanproperty = _objectIdReader.idProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//    2    4:getfield        #97  <Field SettableBeanProperty ObjectIdReader.idProperty>
	//    3    7:astore_3        
		if(settablebeanproperty != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          19
			return settablebeanproperty.setAndReturn(obj, obj1);
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #101 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   10   18:areturn         
		else
			throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
	//   11   19:new             #111 <Class UnsupportedOperationException>
	//   12   22:dup             
	//   13   23:ldc1            #113 <String "Should not call set() on ObjectIdProperty that has no SettableBeanProperty">
	//   14   25:invokespecial   #116 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new ObjectIdValueProperty(this, propertyname)));
	//    0    0:new             #2   <Class ObjectIdValueProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #120 <Method void ObjectIdValueProperty(ObjectIdValueProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return ((SettableBeanProperty) (new ObjectIdValueProperty(this, _valueDeserializer, nullvalueprovider)));
	//    0    0:new             #2   <Class ObjectIdValueProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field JsonDeserializer _valueDeserializer>
	//    5    9:aload_1         
	//    6   10:invokespecial   #124 <Method void ObjectIdValueProperty(ObjectIdValueProperty, JsonDeserializer, NullValueProvider)>
	//    7   13:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_valueDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new ObjectIdValueProperty(this, jsondeserializer, _nullProvider)));
	//    6   10:new             #2   <Class ObjectIdValueProperty>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #130 <Field NullValueProvider _nullProvider>
	//   12   20:invokespecial   #124 <Method void ObjectIdValueProperty(ObjectIdValueProperty, JsonDeserializer, NullValueProvider)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final ObjectIdReader _objectIdReader;
}
