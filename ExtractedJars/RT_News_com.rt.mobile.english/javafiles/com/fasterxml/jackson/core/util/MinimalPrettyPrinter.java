// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import java.io.IOException;
import java.io.Serializable;

public class MinimalPrettyPrinter
	implements PrettyPrinter, Serializable
{

	public MinimalPrettyPrinter()
	{
		this(" ");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String " ">
	//    2    3:invokespecial   #22  <Method void MinimalPrettyPrinter(String)>
	//    3    6:return          
	}

	public MinimalPrettyPrinter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		_rootValueSeparator = " ";
	//    2    4:aload_0         
	//    3    5:ldc1            #12  <String " ">
	//    4    7:putfield        #27  <Field String _rootValueSeparator>
		_rootValueSeparator = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #27  <Field String _rootValueSeparator>
	//    8   15:return          
	}

	public void beforeArrayValues(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
	//    0    0:return          
	}

	public void beforeObjectEntries(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
	//    0    0:return          
	}

	public void setRootValueSeparator(String s)
	{
		_rootValueSeparator = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String _rootValueSeparator>
	//    3    5:return          
	}

	public void writeArrayValueSeparator(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw(',');
	//    0    0:aload_1         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeEndArray(JsonGenerator jsongenerator, int i)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw(']');
	//    0    0:aload_1         
	//    1    1:bipush          93
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeEndObject(JsonGenerator jsongenerator, int i)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw('}');
	//    0    0:aload_1         
	//    1    1:bipush          125
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw(',');
	//    0    0:aload_1         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw(':');
	//    0    0:aload_1         
	//    1    1:bipush          58
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeRootValueSeparator(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
		if(_rootValueSeparator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field String _rootValueSeparator>
	//*   2    4:ifnull          15
			jsongenerator.writeRaw(_rootValueSeparator);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field String _rootValueSeparator>
	//    6   12:invokevirtual   #51  <Method void JsonGenerator.writeRaw(String)>
	//    7   15:return          
	}

	public void writeStartArray(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw('[');
	//    0    0:aload_1         
	//    1    1:bipush          91
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeStartObject(JsonGenerator jsongenerator)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeRaw('{');
	//    0    0:aload_1         
	//    1    1:bipush          123
	//    2    3:invokevirtual   #43  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
	private static final long serialVersionUID = 1L;
	protected String _rootValueSeparator;
}
