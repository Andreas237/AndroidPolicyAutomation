// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonSchema
{

	public JsonSchema(ObjectNode objectnode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		schema = objectnode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ObjectNode schema>
	//    5    9:return          
	}

	public static JsonNode getDefaultSchemaNode()
	{
		ObjectNode objectnode = JsonNodeFactory.instance.objectNode();
	//    0    0:getstatic       #25  <Field JsonNodeFactory JsonNodeFactory.instance>
	//    1    3:invokevirtual   #29  <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    6:astore_0        
		objectnode.put("type", "any");
	//    3    7:aload_0         
	//    4    8:ldc1            #31  <String "type">
	//    5   10:ldc1            #33  <String "any">
	//    6   12:invokevirtual   #39  <Method ObjectNode ObjectNode.put(String, String)>
	//    7   15:pop             
		return ((JsonNode) (objectnode));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(!(obj instanceof JsonSchema))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class JsonSchema>
	//*  11   17:ifne            22
				return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
			obj = ((Object) ((JsonSchema)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class JsonSchema>
	//   16   26:astore_1        
			if(schema == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #15  <Field ObjectNode schema>
	//*  19   31:ifnonnull       43
			{
				if(((JsonSchema) (obj)).schema != null)
	//*  20   34:aload_1         
	//*  21   35:getfield        #15  <Field ObjectNode schema>
	//*  22   38:ifnull          5
					return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			} else
			{
				return schema.equals(((Object) (((JsonSchema) (obj)).schema)));
	//   25   43:aload_0         
	//   26   44:getfield        #15  <Field ObjectNode schema>
	//   27   47:aload_1         
	//   28   48:getfield        #15  <Field ObjectNode schema>
	//   29   51:invokevirtual   #43  <Method boolean ObjectNode.equals(Object)>
	//   30   54:ireturn         
			}
		}
		return true;
	}

	public ObjectNode getSchemaNode()
	{
		return schema;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObjectNode schema>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return schema.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObjectNode schema>
	//    2    4:invokevirtual   #49  <Method int ObjectNode.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return schema.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObjectNode schema>
	//    2    4:invokevirtual   #53  <Method String ObjectNode.toString()>
	//    3    7:areturn         
	}

	private final ObjectNode schema;
}
