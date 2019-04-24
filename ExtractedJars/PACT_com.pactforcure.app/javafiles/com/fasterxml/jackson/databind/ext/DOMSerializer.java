// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class DOMSerializer extends StdSerializer
{

	public DOMSerializer()
	{
		super(org/w3c/dom/Node);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class Node>
	//    2    3:invokespecial   #16  <Method void StdSerializer(Class)>
		DOMImplementationRegistry domimplementationregistry;
		try
		{
			domimplementationregistry = DOMImplementationRegistry.newInstance();
	//    3    6:invokestatic    #22  <Method DOMImplementationRegistry DOMImplementationRegistry.newInstance()>
	//    4    9:astore_1        
		}
	//*   5   10:aload_0         
	//*   6   11:aload_1         
	//*   7   12:ldc1            #24  <String "LS">
	//*   8   14:invokevirtual   #28  <Method org.w3c.dom.DOMImplementation DOMImplementationRegistry.getDOMImplementation(String)>
	//*   9   17:checkcast       #30  <Class DOMImplementationLS>
	//*  10   20:putfield        #32  <Field DOMImplementationLS _domImpl>
	//*  11   23:return          
		catch(Exception exception)
	//*  12   24:astore_1        
		{
			throw new IllegalStateException((new StringBuilder()).append("Could not instantiate DOMImplementationRegistry: ").append(exception.getMessage()).toString(), ((Throwable) (exception)));
	//   13   25:new             #34  <Class IllegalStateException>
	//   14   28:dup             
	//   15   29:new             #36  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #38  <Method void StringBuilder()>
	//   18   36:ldc1            #40  <String "Could not instantiate DOMImplementationRegistry: ">
	//   19   38:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #48  <Method String Exception.getMessage()>
	//   22   45:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   24   51:aload_1         
	//   25   52:invokespecial   #54  <Method void IllegalStateException(String, Throwable)>
	//   26   55:athrow          
		}
		_domImpl = (DOMImplementationLS)domimplementationregistry.getDOMImplementation("LS");
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #65  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    5   11:pop             
	//    6   12:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #70  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #74  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Node)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Node>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #81  <Method void serialize(Node, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Node node, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		if(_domImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field DOMImplementationLS _domImpl>
	//*   2    4:ifnonnull       17
		{
			throw new IllegalStateException("Could not find DOM LS");
	//    3    7:new             #34  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #85  <String "Could not find DOM LS">
	//    6   13:invokespecial   #88  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			jsongenerator.writeString(_domImpl.createLSSerializer().writeToString(node));
	//    8   17:aload_2         
	//    9   18:aload_0         
	//   10   19:getfield        #32  <Field DOMImplementationLS _domImpl>
	//   11   22:invokeinterface #92  <Method LSSerializer DOMImplementationLS.createLSSerializer()>
	//   12   27:aload_1         
	//   13   28:invokeinterface #98  <Method String LSSerializer.writeToString(Node)>
	//   14   33:invokevirtual   #103 <Method void JsonGenerator.writeString(String)>
			return;
	//   15   36:return          
		}
	}

	protected final DOMImplementationLS _domImpl;
}
