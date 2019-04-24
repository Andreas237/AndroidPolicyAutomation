// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//			TypeIdResolver

public abstract class TypeSerializer
{

	public TypeSerializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract TypeSerializer forProperty(BeanProperty beanproperty);

	public abstract String getPropertyName();

	public abstract TypeIdResolver getTypeIdResolver();

	public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();

	public abstract void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException;

	public abstract void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException;

	public abstract void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException, JsonProcessingException;

	public abstract void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException;

	public abstract void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException;

	public abstract void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException;

	public abstract void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException;

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		writeTypePrefixForArray(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method void writeTypePrefixForArray(Object, JsonGenerator)>
	//    4    6:return          
	}

	public abstract void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException;

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		writeTypePrefixForObject(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #39  <Method void writeTypePrefixForObject(Object, JsonGenerator)>
	//    4    6:return          
	}

	public abstract void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException;

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		writeTypePrefixForScalar(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #42  <Method void writeTypePrefixForScalar(Object, JsonGenerator)>
	//    4    6:return          
	}

	public abstract void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException;

	public abstract void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException;
}
