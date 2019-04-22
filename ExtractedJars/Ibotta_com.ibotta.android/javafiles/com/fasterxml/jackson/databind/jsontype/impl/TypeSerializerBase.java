// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public abstract class TypeSerializerBase extends TypeSerializer
{

	protected TypeSerializerBase(TypeIdResolver typeidresolver, BeanProperty beanproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void TypeSerializer()>
		_idResolver = typeidresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field TypeIdResolver _idResolver>
		_property = beanproperty;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field BeanProperty _property>
	//    8   14:return          
	}

	protected void _generateTypeId(WritableTypeId writabletypeid)
	{
		if(writabletypeid.id == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field Object WritableTypeId.id>
	//*   2    4:ifnonnull       42
		{
			Object obj = writabletypeid.forValue;
	//    3    7:aload_1         
	//    4    8:getfield        #29  <Field Object WritableTypeId.forValue>
	//    5   11:astore_2        
			Class class1 = writabletypeid.forValueType;
	//    6   12:aload_1         
	//    7   13:getfield        #33  <Field Class WritableTypeId.forValueType>
	//    8   16:astore_3        
			if(class1 == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       30
				obj = ((Object) (idFromValue(obj)));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #37  <Method String idFromValue(Object)>
	//   14   26:astore_2        
			else
	//*  15   27:goto            37
				obj = ((Object) (idFromValueAndType(obj, class1)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #41  <Method String idFromValueAndType(Object, Class)>
	//   20   36:astore_2        
			writabletypeid.id = obj;
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:putfield        #26  <Field Object WritableTypeId.id>
		}
	//   24   42:return          
	}

	public String getPropertyName()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void handleMissingId(Object obj)
	{
	//    0    0:return          
	}

	protected String idFromValue(Object obj)
	{
		String s = _idResolver.idFromValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TypeIdResolver _idResolver>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method String TypeIdResolver.idFromValue(Object)>
	//    4   10:astore_2        
		if(s == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       20
			handleMissingId(obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #50  <Method void handleMissingId(Object)>
		return s;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	protected String idFromValueAndType(Object obj, Class class1)
	{
		class1 = ((Class) (_idResolver.idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TypeIdResolver _idResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #51  <Method String TypeIdResolver.idFromValueAndType(Object, Class)>
	//    5   11:astore_2        
		if(class1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       21
			handleMissingId(obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #50  <Method void handleMissingId(Object)>
		return ((String) (class1));
	//   11   21:aload_2         
	//   12   22:areturn         
	}

	public WritableTypeId writeTypePrefix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
		throws IOException
	{
		_generateTypeId(writabletypeid);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #59  <Method void _generateTypeId(WritableTypeId)>
		return jsongenerator.writeTypePrefix(writabletypeid);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #64  <Method WritableTypeId JsonGenerator.writeTypePrefix(WritableTypeId)>
	//    6   10:areturn         
	}

	public WritableTypeId writeTypeSuffix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
		throws IOException
	{
		return jsongenerator.writeTypeSuffix(writabletypeid);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #68  <Method WritableTypeId JsonGenerator.writeTypeSuffix(WritableTypeId)>
	//    3    5:areturn         
	}

	protected final TypeIdResolver _idResolver;
	protected final BeanProperty _property;
}
