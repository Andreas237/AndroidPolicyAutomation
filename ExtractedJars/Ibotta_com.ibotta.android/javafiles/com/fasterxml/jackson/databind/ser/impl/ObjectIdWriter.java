// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;

public final class ObjectIdWriter
{

	protected ObjectIdWriter(JavaType javatype, SerializableString serializablestring, ObjectIdGenerator objectidgenerator, JsonSerializer jsonserializer, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		idType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field JavaType idType>
		propertyName = serializablestring;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field SerializableString propertyName>
		generator = objectidgenerator;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field ObjectIdGenerator generator>
		serializer = jsonserializer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field JsonSerializer serializer>
		alwaysAsId = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #31  <Field boolean alwaysAsId>
	//   17   31:return          
	}

	public static ObjectIdWriter construct(JavaType javatype, PropertyName propertyname, ObjectIdGenerator objectidgenerator, boolean flag)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(propertyname == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       12
			propertyname = null;
	//    4    7:aconst_null     
	//    5    8:astore_1        
		else
	//*   6    9:goto            17
			propertyname = ((PropertyName) (propertyname.getSimpleName()));
	//    7   12:aload_1         
	//    8   13:invokevirtual   #42  <Method String PropertyName.getSimpleName()>
	//    9   16:astore_1        
		if(propertyname == null)
	//*  10   17:aload_1         
	//*  11   18:ifnonnull       27
			propertyname = ((PropertyName) (obj));
	//   12   21:aload           4
	//   13   23:astore_1        
		else
	//*  14   24:goto            36
			propertyname = ((PropertyName) (new SerializedString(((String) (propertyname)))));
	//   15   27:new             #44  <Class SerializedString>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #47  <Method void SerializedString(String)>
	//   19   35:astore_1        
		return new ObjectIdWriter(javatype, ((SerializableString) (propertyname)), objectidgenerator, ((JsonSerializer) (null)), flag);
	//   20   36:new             #2   <Class ObjectIdWriter>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:aconst_null     
	//   26   44:iload_3         
	//   27   45:invokespecial   #49  <Method void ObjectIdWriter(JavaType, SerializableString, ObjectIdGenerator, JsonSerializer, boolean)>
	//   28   48:areturn         
	}

	public ObjectIdWriter withAlwaysAsId(boolean flag)
	{
		if(flag == alwaysAsId)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field boolean alwaysAsId>
	//*   3    5:icmpne          10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ObjectIdWriter(idType, propertyName, generator, serializer, flag);
	//    6   10:new             #2   <Class ObjectIdWriter>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field JavaType idType>
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field SerializableString propertyName>
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field ObjectIdGenerator generator>
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field JsonSerializer serializer>
	//   16   30:iload_1         
	//   17   31:invokespecial   #49  <Method void ObjectIdWriter(JavaType, SerializableString, ObjectIdGenerator, JsonSerializer, boolean)>
	//   18   34:areturn         
	}

	public ObjectIdWriter withSerializer(JsonSerializer jsonserializer)
	{
		return new ObjectIdWriter(idType, propertyName, generator, jsonserializer, alwaysAsId);
	//    0    0:new             #2   <Class ObjectIdWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field JavaType idType>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field SerializableString propertyName>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field ObjectIdGenerator generator>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field boolean alwaysAsId>
	//   11   21:invokespecial   #49  <Method void ObjectIdWriter(JavaType, SerializableString, ObjectIdGenerator, JsonSerializer, boolean)>
	//   12   24:areturn         
	}

	public final boolean alwaysAsId;
	public final ObjectIdGenerator generator;
	public final JavaType idType;
	public final SerializableString propertyName;
	public final JsonSerializer serializer;
}
