// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDeserializer extends StdScalarDeserializer
{

	public PathDeserializer()
	{
		super(java/nio/file/Path);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class Path>
	//    2    3:invokespecial   #16  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method Path deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Path deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(jsontoken != null && jsontoken.isScalarValue())
	//*   3    5:aload_3         
	//*   4    6:ifnull          28
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #39  <Method boolean JsonToken.isScalarValue()>
	//*   7   13:ifeq            28
			return Paths.get(jsonparser.getValueAsString(), new String[0]);
	//    8   16:aload_1         
	//    9   17:invokevirtual   #43  <Method String JsonParser.getValueAsString()>
	//   10   20:iconst_0        
	//   11   21:anewarray       String[]
	//   12   24:invokestatic    #51  <Method Path Paths.get(String, String[])>
	//   13   27:areturn         
		else
			throw deserializationcontext.mappingException(java/nio/file/Path, jsontoken);
	//   14   28:aload_2         
	//   15   29:ldc1            #13  <Class Path>
	//   16   31:aload_3         
	//   17   32:invokevirtual   #57  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   18   35:athrow          
	}

	private static final long serialVersionUID = 1L;
}
