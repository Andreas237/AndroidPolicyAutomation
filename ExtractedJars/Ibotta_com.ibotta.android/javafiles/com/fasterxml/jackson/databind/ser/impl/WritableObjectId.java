// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			ObjectIdWriter

public final class WritableObjectId
{

	public WritableObjectId(ObjectIdGenerator objectidgenerator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		idWritten = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean idWritten>
		generator = objectidgenerator;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field ObjectIdGenerator generator>
	//    8   14:return          
	}

	public Object generateId(Object obj)
	{
		if(id == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object id>
	//*   2    4:ifnonnull       19
			id = generator.generateId(obj);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field ObjectIdGenerator generator>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #31  <Method Object ObjectIdGenerator.generateId(Object)>
	//    8   16:putfield        #27  <Field Object id>
		return id;
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field Object id>
	//   11   23:areturn         
	}

	public void writeAsField(JsonGenerator jsongenerator, SerializerProvider serializerprovider, ObjectIdWriter objectidwriter)
		throws IOException
	{
		idWritten = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #18  <Field boolean idWritten>
		if(jsongenerator.canWriteObjectId())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #41  <Method boolean JsonGenerator.canWriteObjectId()>
	//*   5    9:ifeq            24
		{
			jsongenerator.writeObjectId(((Object) (String.valueOf(id))));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field Object id>
	//    9   17:invokestatic    #47  <Method String String.valueOf(Object)>
	//   10   20:invokevirtual   #51  <Method void JsonGenerator.writeObjectId(Object)>
			return;
	//   11   23:return          
		}
		com.fasterxml.jackson.core.SerializableString serializablestring = objectidwriter.propertyName;
	//   12   24:aload_3         
	//   13   25:getfield        #57  <Field com.fasterxml.jackson.core.SerializableString ObjectIdWriter.propertyName>
	//   14   28:astore          4
		if(serializablestring != null)
	//*  15   30:aload           4
	//*  16   32:ifnull          54
		{
			jsongenerator.writeFieldName(serializablestring);
	//   17   35:aload_1         
	//   18   36:aload           4
	//   19   38:invokevirtual   #61  <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
			objectidwriter.serializer.serialize(id, jsongenerator, serializerprovider);
	//   20   41:aload_3         
	//   21   42:getfield        #65  <Field JsonSerializer ObjectIdWriter.serializer>
	//   22   45:aload_0         
	//   23   46:getfield        #27  <Field Object id>
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #71  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		}
	//   27   54:return          
	}

	public boolean writeAsId(JsonGenerator jsongenerator, SerializerProvider serializerprovider, ObjectIdWriter objectidwriter)
		throws IOException
	{
		if(id != null && (idWritten || objectidwriter.alwaysAsId))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object id>
	//*   2    4:ifnull          57
	//*   3    7:aload_0         
	//*   4    8:getfield        #18  <Field boolean idWritten>
	//*   5   11:ifne            21
	//*   6   14:aload_3         
	//*   7   15:getfield        #77  <Field boolean ObjectIdWriter.alwaysAsId>
	//*   8   18:ifeq            57
		{
			if(jsongenerator.canWriteObjectId())
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #41  <Method boolean JsonGenerator.canWriteObjectId()>
	//*  11   25:ifeq            42
				jsongenerator.writeObjectRef(((Object) (String.valueOf(id))));
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #27  <Field Object id>
	//   15   33:invokestatic    #47  <Method String String.valueOf(Object)>
	//   16   36:invokevirtual   #80  <Method void JsonGenerator.writeObjectRef(Object)>
			else
	//*  17   39:goto            55
				objectidwriter.serializer.serialize(id, jsongenerator, serializerprovider);
	//   18   42:aload_3         
	//   19   43:getfield        #65  <Field JsonSerializer ObjectIdWriter.serializer>
	//   20   46:aload_0         
	//   21   47:getfield        #27  <Field Object id>
	//   22   50:aload_1         
	//   23   51:aload_2         
	//   24   52:invokevirtual   #71  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
		} else
		{
			return false;
	//   27   57:iconst_0        
	//   28   58:ireturn         
		}
	}

	public final ObjectIdGenerator generator;
	public Object id;
	protected boolean idWritten;
}
