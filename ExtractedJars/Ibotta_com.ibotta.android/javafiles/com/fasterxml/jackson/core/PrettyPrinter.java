// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//			JsonGenerator

public interface PrettyPrinter
{

	public abstract void beforeArrayValues(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void beforeObjectEntries(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeArrayValueSeparator(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeEndArray(JsonGenerator jsongenerator, int i)
		throws IOException;

	public abstract void writeEndObject(JsonGenerator jsongenerator, int i)
		throws IOException;

	public abstract void writeObjectEntrySeparator(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeRootValueSeparator(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeStartArray(JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeStartObject(JsonGenerator jsongenerator)
		throws IOException;

	public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
	public static final Separators DEFAULT_SEPARATORS = Separators.createDefaultInstance();

	/* static  */
	/* { */
	//    0    0:invokestatic    #16  <Method Separators Separators.createDefaultInstance()>
	//    1    3:putstatic       #18  <Field Separators DEFAULT_SEPARATORS>
	//    2    6:new             #20  <Class SerializedString>
	//    3    9:dup             
	//    4   10:ldc1            #22  <String " ">
	//    5   12:invokespecial   #26  <Method void SerializedString(String)>
	//    6   15:putstatic       #28  <Field SerializedString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*   7   18:return          
	/* } */
}
