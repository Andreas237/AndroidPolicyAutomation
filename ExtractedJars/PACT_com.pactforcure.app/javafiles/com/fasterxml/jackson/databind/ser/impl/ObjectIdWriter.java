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
		if(propertyname == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			propertyname = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:aload_2         
	//*   7    9:iload_3         
	//*   8   10:invokestatic    #39  <Method ObjectIdWriter construct(JavaType, String, ObjectIdGenerator, boolean)>
	//*   9   13:areturn         
			propertyname = ((PropertyName) (propertyname.getSimpleName()));
	//   10   14:aload_1         
	//   11   15:invokevirtual   #45  <Method String PropertyName.getSimpleName()>
	//   12   18:astore_1        
		return construct(javatype, ((String) (propertyname)), objectidgenerator, flag);
	//*  13   19:goto            6
	}

	public static ObjectIdWriter construct(JavaType javatype, String s, ObjectIdGenerator objectidgenerator, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:new             #2   <Class ObjectIdWriter>
	//*   5    9:dup             
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:aconst_null     
	//*  10   14:iload_3         
	//*  11   15:invokespecial   #49  <Method void ObjectIdWriter(JavaType, SerializableString, ObjectIdGenerator, JsonSerializer, boolean)>
	//*  12   18:areturn         
			s = ((String) (new SerializedString(s)));
	//   13   19:new             #51  <Class SerializedString>
	//   14   22:dup             
	//   15   23:aload_1         
	//   16   24:invokespecial   #54  <Method void SerializedString(String)>
	//   17   27:astore_1        
		return new ObjectIdWriter(javatype, ((SerializableString) (s)), objectidgenerator, ((JsonSerializer) (null)), flag);
	//*  18   28:goto            6
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
