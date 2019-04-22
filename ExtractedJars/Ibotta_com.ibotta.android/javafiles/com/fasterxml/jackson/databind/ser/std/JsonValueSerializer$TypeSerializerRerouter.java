// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			JsonValueSerializer

static class JsonValueSerializer$TypeSerializerRerouter extends TypeSerializer
{

	public TypeSerializer forProperty(BeanProperty beanproperty)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #25  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public String getPropertyName()
	{
		return _typeSerializer.getPropertyName();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TypeSerializer _typeSerializer>
	//    2    4:invokevirtual   #30  <Method String TypeSerializer.getPropertyName()>
	//    3    7:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return _typeSerializer.getTypeInclusion();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TypeSerializer _typeSerializer>
	//    2    4:invokevirtual   #34  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As TypeSerializer.getTypeInclusion()>
	//    3    7:areturn         
	}

	public WritableTypeId writeTypePrefix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
		throws IOException
	{
		writabletypeid.forValue = _forObject;
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Object _forObject>
	//    3    5:putfield        #43  <Field Object WritableTypeId.forValue>
		return _typeSerializer.writeTypePrefix(jsongenerator, writabletypeid);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field TypeSerializer _typeSerializer>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #45  <Method WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, WritableTypeId)>
	//    9   17:areturn         
	}

	public WritableTypeId writeTypeSuffix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
		throws IOException
	{
		return _typeSerializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TypeSerializer _typeSerializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #49  <Method WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, WritableTypeId)>
	//    5    9:areturn         
	}

	protected final Object _forObject;
	protected final TypeSerializer _typeSerializer;

	public JsonValueSerializer$TypeSerializerRerouter(TypeSerializer typeserializer, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void TypeSerializer()>
		_typeSerializer = typeserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field TypeSerializer _typeSerializer>
		_forObject = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Object _forObject>
	//    8   14:return          
	}
}
