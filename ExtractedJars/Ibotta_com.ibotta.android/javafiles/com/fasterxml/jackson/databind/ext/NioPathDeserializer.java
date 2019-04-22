// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathDeserializer extends StdScalarDeserializer
{

	public NioPathDeserializer()
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
		if(!jsonparser.hasToken(JsonToken.VALUE_STRING))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #35  <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #41  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifne            21
			return (Path)deserializationcontext.handleUnexpectedToken(java/nio/file/Path, jsonparser);
	//    4   10:aload_2         
	//    5   11:ldc1            #13  <Class Path>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #47  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//    8   17:checkcast       #13  <Class Path>
	//    9   20:areturn         
		jsonparser = ((JsonParser) (jsonparser.getText()));
	//   10   21:aload_1         
	//   11   22:invokevirtual   #51  <Method String JsonParser.getText()>
	//   12   25:astore_1        
		if(((String) (jsonparser)).indexOf(':') < 0)
	//*  13   26:aload_1         
	//*  14   27:bipush          58
	//*  15   29:invokevirtual   #57  <Method int String.indexOf(int)>
	//*  16   32:ifge            44
			return Paths.get(((String) (jsonparser)), new String[0]);
	//   17   35:aload_1         
	//   18   36:iconst_0        
	//   19   37:anewarray       String[]
	//   20   40:invokestatic    #63  <Method Path Paths.get(String, String[])>
	//   21   43:areturn         
		Path path;
		try
		{
			path = Paths.get(new URI(((String) (jsonparser))));
	//   22   44:new             #65  <Class URI>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #68  <Method void URI(String)>
	//   26   52:invokestatic    #71  <Method Path Paths.get(URI)>
	//   27   55:astore_3        
		}
	//*  28   56:aload_3         
	//*  29   57:areturn         
		catch(URISyntaxException urisyntaxexception)
	//*  30   58:astore_3        
		{
			return (Path)deserializationcontext.handleInstantiationProblem(handledType(), ((Object) (jsonparser)), ((Throwable) (urisyntaxexception)));
	//   31   59:aload_2         
	//   32   60:aload_0         
	//   33   61:invokevirtual   #75  <Method Class handledType()>
	//   34   64:aload_1         
	//   35   65:aload_3         
	//   36   66:invokevirtual   #79  <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   37   69:checkcast       #13  <Class Path>
	//   38   72:areturn         
		}
		return path;
	}

	private static final long serialVersionUID = 1L;
}
