// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonSchema
{

	public static JsonNode getDefaultSchemaNode()
	{
		ObjectNode objectnode = JsonNodeFactory.instance.objectNode();
	//    0    0:getstatic       #15  <Field JsonNodeFactory JsonNodeFactory.instance>
	//    1    3:invokevirtual   #19  <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    6:astore_0        
		objectnode.put("type", "any");
	//    3    7:aload_0         
	//    4    8:ldc1            #21  <String "type">
	//    5   10:ldc1            #23  <String "any">
	//    6   12:invokevirtual   #29  <Method ObjectNode ObjectNode.put(String, String)>
	//    7   15:pop             
		return ((JsonNode) (objectnode));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
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
		ObjectNode objectnode = schema;
	//   17   27:aload_0         
	//   18   28:getfield        #34  <Field ObjectNode schema>
	//   19   31:astore_2        
		if(objectnode == null)
	//*  20   32:aload_2         
	//*  21   33:ifnonnull       47
			return ((JsonSchema) (obj)).schema == null;
	//   22   36:aload_1         
	//   23   37:getfield        #34  <Field ObjectNode schema>
	//   24   40:ifnonnull       45
	//   25   43:iconst_1        
	//   26   44:ireturn         
	//   27   45:iconst_0        
	//   28   46:ireturn         
		else
			return objectnode.equals(((Object) (((JsonSchema) (obj)).schema)));
	//   29   47:aload_2         
	//   30   48:aload_1         
	//   31   49:getfield        #34  <Field ObjectNode schema>
	//   32   52:invokevirtual   #36  <Method boolean ObjectNode.equals(Object)>
	//   33   55:ireturn         
	}

	public int hashCode()
	{
		return schema.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ObjectNode schema>
	//    2    4:invokevirtual   #40  <Method int ObjectNode.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return schema.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ObjectNode schema>
	//    2    4:invokevirtual   #44  <Method String ObjectNode.toString()>
	//    3    7:areturn         
	}

	private final ObjectNode schema;
}
