// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class StdKeySerializer extends StdSerializer
{

	public StdKeySerializer()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class Object>
	//    2    3:invokespecial   #12  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return ((JsonNode) (createSchemaNode("string")));
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "string">
	//    2    3:invokevirtual   #29  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String)>
	//    3    6:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Class class1 = obj.getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Class Object.getClass()>
	//    2    4:astore          4
		if(class1 == java/lang/String)
	//*   3    6:aload           4
	//*   4    8:ldc1            #39  <Class String>
	//*   5   10:if_acmpne       24
			obj = ((Object) ((String)obj));
	//    6   13:aload_1         
	//    7   14:checkcast       #39  <Class String>
	//    8   17:astore_1        
		else
	//*   9   18:aload_2         
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #45  <Method void JsonGenerator.writeFieldName(String)>
	//*  12   23:return          
		if(class1.isEnum())
	//*  13   24:aload           4
	//*  14   26:invokevirtual   #51  <Method boolean Class.isEnum()>
	//*  15   29:ifeq            63
		{
			obj = ((Object) ((Enum)obj));
	//   16   32:aload_1         
	//   17   33:checkcast       #53  <Class Enum>
	//   18   36:astore_1        
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*  19   37:aload_3         
	//*  20   38:getstatic       #59  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  21   41:invokevirtual   #65  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  22   44:ifeq            55
				obj = ((Object) (((Enum) (obj)).toString()));
	//   23   47:aload_1         
	//   24   48:invokevirtual   #69  <Method String Enum.toString()>
	//   25   51:astore_1        
			else
	//*  26   52:goto            18
				obj = ((Object) (((Enum) (obj)).name()));
	//   27   55:aload_1         
	//   28   56:invokevirtual   #72  <Method String Enum.name()>
	//   29   59:astore_1        
		} else
	//*  30   60:goto            18
		{
			if(obj instanceof Date)
	//*  31   63:aload_1         
	//*  32   64:instanceof      #74  <Class Date>
	//*  33   67:ifeq            80
			{
				serializerprovider.defaultSerializeDateKey((Date)obj, jsongenerator);
	//   34   70:aload_3         
	//   35   71:aload_1         
	//   36   72:checkcast       #74  <Class Date>
	//   37   75:aload_2         
	//   38   76:invokevirtual   #78  <Method void SerializerProvider.defaultSerializeDateKey(Date, JsonGenerator)>
				return;
	//   39   79:return          
			}
			if(class1 == java/lang/Class)
	//*  40   80:aload           4
	//*  41   82:ldc1            #47  <Class Class>
	//*  42   84:if_acmpne       98
				obj = ((Object) (((Class)obj).getName()));
	//   43   87:aload_1         
	//   44   88:checkcast       #47  <Class Class>
	//   45   91:invokevirtual   #81  <Method String Class.getName()>
	//   46   94:astore_1        
			else
	//*  47   95:goto            18
				obj = ((Object) (obj.toString()));
	//   48   98:aload_1         
	//   49   99:invokevirtual   #82  <Method String Object.toString()>
	//   50  102:astore_1        
		}
		jsongenerator.writeFieldName(((String) (obj)));
	//*  51  103:goto            18
	}
}
