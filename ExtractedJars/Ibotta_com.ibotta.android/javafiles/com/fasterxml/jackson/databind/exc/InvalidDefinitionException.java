// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public class InvalidDefinitionException extends JsonMappingException
{

	protected InvalidDefinitionException(JsonGenerator jsongenerator, String s, BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition)
	{
		super(((java.io.Closeable) (jsongenerator)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void JsonMappingException(java.io.Closeable, String)>
		if(beandescription == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       15
			jsongenerator = null;
	//    6   10:aconst_null     
	//    7   11:astore_1        
		else
	//*   8   12:goto            20
			jsongenerator = ((JsonGenerator) (beandescription.getType()));
	//    9   15:aload_3         
	//   10   16:invokevirtual   #21  <Method JavaType BeanDescription.getType()>
	//   11   19:astore_1        
		_type = ((JavaType) (jsongenerator));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #23  <Field JavaType _type>
		_beanDesc = beandescription;
	//   15   25:aload_0         
	//   16   26:aload_3         
	//   17   27:putfield        #25  <Field BeanDescription _beanDesc>
		_property = beanpropertydefinition;
	//   18   30:aload_0         
	//   19   31:aload           4
	//   20   33:putfield        #27  <Field BeanPropertyDefinition _property>
	//   21   36:return          
	}

	protected InvalidDefinitionException(JsonGenerator jsongenerator, String s, JavaType javatype)
	{
		super(((java.io.Closeable) (jsongenerator)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void JsonMappingException(java.io.Closeable, String)>
		_type = javatype;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #23  <Field JavaType _type>
		_beanDesc = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #25  <Field BeanDescription _beanDesc>
		_property = null;
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:putfield        #27  <Field BeanPropertyDefinition _property>
	//   13   21:return          
	}

	protected InvalidDefinitionException(JsonParser jsonparser, String s, BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition)
	{
		super(((java.io.Closeable) (jsonparser)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void JsonMappingException(java.io.Closeable, String)>
		if(beandescription == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       15
			jsonparser = null;
	//    6   10:aconst_null     
	//    7   11:astore_1        
		else
	//*   8   12:goto            20
			jsonparser = ((JsonParser) (beandescription.getType()));
	//    9   15:aload_3         
	//   10   16:invokevirtual   #21  <Method JavaType BeanDescription.getType()>
	//   11   19:astore_1        
		_type = ((JavaType) (jsonparser));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #23  <Field JavaType _type>
		_beanDesc = beandescription;
	//   15   25:aload_0         
	//   16   26:aload_3         
	//   17   27:putfield        #25  <Field BeanDescription _beanDesc>
		_property = beanpropertydefinition;
	//   18   30:aload_0         
	//   19   31:aload           4
	//   20   33:putfield        #27  <Field BeanPropertyDefinition _property>
	//   21   36:return          
	}

	protected InvalidDefinitionException(JsonParser jsonparser, String s, JavaType javatype)
	{
		super(((java.io.Closeable) (jsonparser)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void JsonMappingException(java.io.Closeable, String)>
		_type = javatype;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #23  <Field JavaType _type>
		_beanDesc = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #25  <Field BeanDescription _beanDesc>
		_property = null;
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:putfield        #27  <Field BeanPropertyDefinition _property>
	//   13   21:return          
	}

	public static InvalidDefinitionException from(JsonGenerator jsongenerator, String s, BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition)
	{
		return new InvalidDefinitionException(jsongenerator, s, beandescription, beanpropertydefinition);
	//    0    0:new             #2   <Class InvalidDefinitionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #35  <Method void InvalidDefinitionException(JsonGenerator, String, BeanDescription, BeanPropertyDefinition)>
	//    7   11:areturn         
	}

	public static InvalidDefinitionException from(JsonGenerator jsongenerator, String s, JavaType javatype)
	{
		return new InvalidDefinitionException(jsongenerator, s, javatype);
	//    0    0:new             #2   <Class InvalidDefinitionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #38  <Method void InvalidDefinitionException(JsonGenerator, String, JavaType)>
	//    6   10:areturn         
	}

	public static InvalidDefinitionException from(JsonParser jsonparser, String s, BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition)
	{
		return new InvalidDefinitionException(jsonparser, s, beandescription, beanpropertydefinition);
	//    0    0:new             #2   <Class InvalidDefinitionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #41  <Method void InvalidDefinitionException(JsonParser, String, BeanDescription, BeanPropertyDefinition)>
	//    7   11:areturn         
	}

	public static InvalidDefinitionException from(JsonParser jsonparser, String s, JavaType javatype)
	{
		return new InvalidDefinitionException(jsonparser, s, javatype);
	//    0    0:new             #2   <Class InvalidDefinitionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #44  <Method void InvalidDefinitionException(JsonParser, String, JavaType)>
	//    6   10:areturn         
	}

	protected transient BeanDescription _beanDesc;
	protected transient BeanPropertyDefinition _property;
	protected final JavaType _type;
}
