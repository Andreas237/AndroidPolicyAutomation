// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			Separators

public class MinimalPrettyPrinter
	implements PrettyPrinter, Serializable
{

	public MinimalPrettyPrinter()
	{
		this(DEFAULT_ROOT_VALUE_SEPARATOR.toString());
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field SerializedString DEFAULT_ROOT_VALUE_SEPARATOR>
	//    2    4:invokevirtual   #28  <Method String SerializedString.toString()>
	//    3    7:invokespecial   #31  <Method void MinimalPrettyPrinter(String)>
	//    4   10:return          
	}

	public MinimalPrettyPrinter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		_rootValueSeparator = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field String _rootValueSeparator>
		_separators = DEFAULT_SEPARATORS;
	//    5    9:aload_0         
	//    6   10:getstatic       #39  <Field Separators DEFAULT_SEPARATORS>
	//    7   13:putfield        #41  <Field Separators _separators>
	//    8   16:return          
	}

	public void beforeArrayValues(JsonGenerator jsongenerator)
		throws IOException
	{
	//    0    0:return          
	}

	public void beforeObjectEntries(JsonGenerator jsongenerator)
		throws IOException
	{
	//    0    0:return          
	}

	public void writeArrayValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(_separators.getArrayValueSeparator());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Separators _separators>
	//    3    5:invokevirtual   #54  <Method char Separators.getArrayValueSeparator()>
	//    4    8:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    5   11:return          
	}

	public void writeEndArray(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		jsongenerator.writeRaw(']');
	//    0    0:aload_1         
	//    1    1:bipush          93
	//    2    3:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeEndObject(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		jsongenerator.writeRaw('}');
	//    0    0:aload_1         
	//    1    1:bipush          125
	//    2    3:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(_separators.getObjectEntrySeparator());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Separators _separators>
	//    3    5:invokevirtual   #67  <Method char Separators.getObjectEntrySeparator()>
	//    4    8:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    5   11:return          
	}

	public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(_separators.getObjectFieldValueSeparator());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Separators _separators>
	//    3    5:invokevirtual   #71  <Method char Separators.getObjectFieldValueSeparator()>
	//    4    8:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    5   11:return          
	}

	public void writeRootValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		String s = _rootValueSeparator;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String _rootValueSeparator>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			jsongenerator.writeRaw(s);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #74  <Method void JsonGenerator.writeRaw(String)>
	//    8   14:return          
	}

	public void writeStartArray(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw('[');
	//    0    0:aload_1         
	//    1    1:bipush          91
	//    2    3:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public void writeStartObject(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw('{');
	//    0    0:aload_1         
	//    1    1:bipush          123
	//    2    3:invokevirtual   #60  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	private static final long serialVersionUID = 1L;
	protected String _rootValueSeparator;
	protected Separators _separators;
}
