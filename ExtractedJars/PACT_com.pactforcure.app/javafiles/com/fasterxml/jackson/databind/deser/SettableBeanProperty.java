// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase
	implements Serializable
{

	protected SettableBeanProperty(PropertyName propertyname, JavaType javatype, PropertyMetadata propertymetadata, JsonDeserializer jsondeserializer)
	{
		super(propertymetadata);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #44  <Method void ConcreteBeanPropertyBase(PropertyMetadata)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #46  <Field int _propertyIndex>
		if(propertyname == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       53
			_propName = PropertyName.NO_NAME;
	//    8   14:aload_0         
	//    9   15:getstatic       #51  <Field PropertyName PropertyName.NO_NAME>
	//   10   18:putfield        #53  <Field PropertyName _propName>
		else
	//*  11   21:aload_0         
	//*  12   22:aload_2         
	//*  13   23:putfield        #55  <Field JavaType _type>
	//*  14   26:aload_0         
	//*  15   27:aconst_null     
	//*  16   28:putfield        #57  <Field PropertyName _wrapperName>
	//*  17   31:aload_0         
	//*  18   32:aconst_null     
	//*  19   33:putfield        #59  <Field Annotations _contextAnnotations>
	//*  20   36:aload_0         
	//*  21   37:aconst_null     
	//*  22   38:putfield        #61  <Field ViewMatcher _viewMatcher>
	//*  23   41:aload_0         
	//*  24   42:aconst_null     
	//*  25   43:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//*  26   46:aload_0         
	//*  27   47:aload           4
	//*  28   49:putfield        #65  <Field JsonDeserializer _valueDeserializer>
	//*  29   52:return          
			_propName = propertyname.internSimpleName();
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:invokevirtual   #69  <Method PropertyName PropertyName.internSimpleName()>
	//   33   58:putfield        #53  <Field PropertyName _propName>
		_type = javatype;
		_wrapperName = null;
		_contextAnnotations = null;
		_viewMatcher = null;
		_valueTypeDeserializer = null;
		_valueDeserializer = jsondeserializer;
	//*  34   61:goto            21
	}

	protected SettableBeanProperty(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, TypeDeserializer typedeserializer, Annotations annotations, PropertyMetadata propertymetadata)
	{
		super(propertymetadata);
	//    0    0:aload_0         
	//    1    1:aload           6
	//    2    3:invokespecial   #44  <Method void ConcreteBeanPropertyBase(PropertyMetadata)>
		_propertyIndex = -1;
	//    3    6:aload_0         
	//    4    7:iconst_m1       
	//    5    8:putfield        #46  <Field int _propertyIndex>
		if(propertyname == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       71
			_propName = PropertyName.NO_NAME;
	//    8   15:aload_0         
	//    9   16:getstatic       #51  <Field PropertyName PropertyName.NO_NAME>
	//   10   19:putfield        #53  <Field PropertyName _propName>
		else
	//*  11   22:aload_0         
	//*  12   23:aload_2         
	//*  13   24:putfield        #55  <Field JavaType _type>
	//*  14   27:aload_0         
	//*  15   28:aload_3         
	//*  16   29:putfield        #57  <Field PropertyName _wrapperName>
	//*  17   32:aload_0         
	//*  18   33:aload           5
	//*  19   35:putfield        #59  <Field Annotations _contextAnnotations>
	//*  20   38:aload_0         
	//*  21   39:aconst_null     
	//*  22   40:putfield        #61  <Field ViewMatcher _viewMatcher>
	//*  23   43:aload           4
	//*  24   45:astore_1        
	//*  25   46:aload           4
	//*  26   48:ifnull          58
	//*  27   51:aload           4
	//*  28   53:aload_0         
	//*  29   54:invokevirtual   #78  <Method TypeDeserializer TypeDeserializer.forProperty(com.fasterxml.jackson.databind.BeanProperty)>
	//*  30   57:astore_1        
	//*  31   58:aload_0         
	//*  32   59:aload_1         
	//*  33   60:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//*  34   63:aload_0         
	//*  35   64:getstatic       #39  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//*  36   67:putfield        #65  <Field JsonDeserializer _valueDeserializer>
	//*  37   70:return          
			_propName = propertyname.internSimpleName();
	//   38   71:aload_0         
	//   39   72:aload_1         
	//   40   73:invokevirtual   #69  <Method PropertyName PropertyName.internSimpleName()>
	//   41   76:putfield        #53  <Field PropertyName _propName>
		_type = javatype;
		_wrapperName = propertyname1;
		_contextAnnotations = annotations;
		_viewMatcher = null;
		propertyname = ((PropertyName) (typedeserializer));
		if(typedeserializer != null)
			propertyname = ((PropertyName) (typedeserializer.forProperty(((com.fasterxml.jackson.databind.BeanProperty) (this)))));
		_valueTypeDeserializer = ((TypeDeserializer) (propertyname));
		_valueDeserializer = MISSING_VALUE_DESERIALIZER;
	//*  42   79:goto            22
	}

	protected SettableBeanProperty(SettableBeanProperty settablebeanproperty)
	{
		super(((ConcreteBeanPropertyBase) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #46  <Field int _propertyIndex>
		_propName = settablebeanproperty._propName;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #53  <Field PropertyName _propName>
	//    9   15:putfield        #53  <Field PropertyName _propName>
		_type = settablebeanproperty._type;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #55  <Field JavaType _type>
	//   13   23:putfield        #55  <Field JavaType _type>
		_wrapperName = settablebeanproperty._wrapperName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #57  <Field PropertyName _wrapperName>
	//   17   31:putfield        #57  <Field PropertyName _wrapperName>
		_contextAnnotations = settablebeanproperty._contextAnnotations;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #59  <Field Annotations _contextAnnotations>
	//   21   39:putfield        #59  <Field Annotations _contextAnnotations>
		_valueDeserializer = settablebeanproperty._valueDeserializer;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//   25   47:putfield        #65  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   29   55:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
		_managedReferenceName = settablebeanproperty._managedReferenceName;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #84  <Field String _managedReferenceName>
	//   33   63:putfield        #84  <Field String _managedReferenceName>
		_propertyIndex = settablebeanproperty._propertyIndex;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:getfield        #46  <Field int _propertyIndex>
	//   37   71:putfield        #46  <Field int _propertyIndex>
		_viewMatcher = settablebeanproperty._viewMatcher;
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:getfield        #61  <Field ViewMatcher _viewMatcher>
	//   41   79:putfield        #61  <Field ViewMatcher _viewMatcher>
	//   42   82:return          
	}

	protected SettableBeanProperty(SettableBeanProperty settablebeanproperty, JsonDeserializer jsondeserializer)
	{
		super(((ConcreteBeanPropertyBase) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #46  <Field int _propertyIndex>
		_propName = settablebeanproperty._propName;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #53  <Field PropertyName _propName>
	//    9   15:putfield        #53  <Field PropertyName _propName>
		_type = settablebeanproperty._type;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #55  <Field JavaType _type>
	//   13   23:putfield        #55  <Field JavaType _type>
		_wrapperName = settablebeanproperty._wrapperName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #57  <Field PropertyName _wrapperName>
	//   17   31:putfield        #57  <Field PropertyName _wrapperName>
		_contextAnnotations = settablebeanproperty._contextAnnotations;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #59  <Field Annotations _contextAnnotations>
	//   21   39:putfield        #59  <Field Annotations _contextAnnotations>
		_valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   25   47:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
		_managedReferenceName = settablebeanproperty._managedReferenceName;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #84  <Field String _managedReferenceName>
	//   29   55:putfield        #84  <Field String _managedReferenceName>
		_propertyIndex = settablebeanproperty._propertyIndex;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #46  <Field int _propertyIndex>
	//   33   63:putfield        #46  <Field int _propertyIndex>
		if(jsondeserializer == null)
	//*  34   66:aload_2         
	//*  35   67:ifnonnull       86
			_valueDeserializer = MISSING_VALUE_DESERIALIZER;
	//   36   70:aload_0         
	//   37   71:getstatic       #39  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//   38   74:putfield        #65  <Field JsonDeserializer _valueDeserializer>
		else
	//*  39   77:aload_0         
	//*  40   78:aload_1         
	//*  41   79:getfield        #61  <Field ViewMatcher _viewMatcher>
	//*  42   82:putfield        #61  <Field ViewMatcher _viewMatcher>
	//*  43   85:return          
			_valueDeserializer = jsondeserializer;
	//   44   86:aload_0         
	//   45   87:aload_2         
	//   46   88:putfield        #65  <Field JsonDeserializer _valueDeserializer>
		_viewMatcher = settablebeanproperty._viewMatcher;
	//*  47   91:goto            77
	}

	protected SettableBeanProperty(SettableBeanProperty settablebeanproperty, PropertyName propertyname)
	{
		super(((ConcreteBeanPropertyBase) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #46  <Field int _propertyIndex>
		_propName = propertyname;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #53  <Field PropertyName _propName>
		_type = settablebeanproperty._type;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #55  <Field JavaType _type>
	//   12   20:putfield        #55  <Field JavaType _type>
		_wrapperName = settablebeanproperty._wrapperName;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #57  <Field PropertyName _wrapperName>
	//   16   28:putfield        #57  <Field PropertyName _wrapperName>
		_contextAnnotations = settablebeanproperty._contextAnnotations;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #59  <Field Annotations _contextAnnotations>
	//   20   36:putfield        #59  <Field Annotations _contextAnnotations>
		_valueDeserializer = settablebeanproperty._valueDeserializer;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//   24   44:putfield        #65  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   28   52:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
		_managedReferenceName = settablebeanproperty._managedReferenceName;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:getfield        #84  <Field String _managedReferenceName>
	//   32   60:putfield        #84  <Field String _managedReferenceName>
		_propertyIndex = settablebeanproperty._propertyIndex;
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:getfield        #46  <Field int _propertyIndex>
	//   36   68:putfield        #46  <Field int _propertyIndex>
		_viewMatcher = settablebeanproperty._viewMatcher;
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:getfield        #61  <Field ViewMatcher _viewMatcher>
	//   40   76:putfield        #61  <Field ViewMatcher _viewMatcher>
	//   41   79:return          
	}

	protected SettableBeanProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations)
	{
		this(beanpropertydefinition.getFullName(), javatype, beanpropertydefinition.getWrapperName(), typedeserializer, annotations, beanpropertydefinition.getMetadata());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #93  <Method PropertyName BeanPropertyDefinition.getFullName()>
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #96  <Method PropertyName BeanPropertyDefinition.getWrapperName()>
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload_1         
	//    9   14:invokevirtual   #100 <Method PropertyMetadata BeanPropertyDefinition.getMetadata()>
	//   10   17:invokespecial   #102 <Method void SettableBeanProperty(PropertyName, JavaType, PropertyName, TypeDeserializer, Annotations, PropertyMetadata)>
	//   11   20:return          
	}

	protected SettableBeanProperty(String s, JavaType javatype, PropertyName propertyname, TypeDeserializer typedeserializer, Annotations annotations, boolean flag)
	{
		this(new PropertyName(s), javatype, propertyname, typedeserializer, annotations, PropertyMetadata.construct(flag, ((String) (null)), ((Integer) (null)), ((String) (null))));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class PropertyName>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #105 <Method void PropertyName(String)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:iload           6
	//   10   17:aconst_null     
	//   11   18:aconst_null     
	//   12   19:aconst_null     
	//   13   20:invokestatic    #111 <Method PropertyMetadata PropertyMetadata.construct(boolean, String, Integer, String)>
	//   14   23:invokespecial   #102 <Method void SettableBeanProperty(PropertyName, JavaType, PropertyName, TypeDeserializer, Annotations, PropertyMetadata)>
	//   15   26:return          
	}

	protected IOException _throwAsIOE(JsonParser jsonparser, Exception exception)
		throws IOException
	{
		if(exception instanceof IOException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #116 <Class IOException>
	//*   2    4:ifeq            12
			throw (IOException)exception;
	//    3    7:aload_2         
	//    4    8:checkcast       #116 <Class IOException>
	//    5   11:athrow          
		if(exception instanceof RuntimeException)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #118 <Class RuntimeException>
	//*   8   16:ifeq            24
			throw (RuntimeException)exception;
	//    9   19:aload_2         
	//   10   20:checkcast       #118 <Class RuntimeException>
	//   11   23:athrow          
		for(; ((Throwable) (exception)).getCause() != null; exception = ((Exception) (((Throwable) (exception)).getCause())));
	//   12   24:aload_2         
	//   13   25:invokevirtual   #124 <Method Throwable Throwable.getCause()>
	//   14   28:ifnull          39
	//   15   31:aload_2         
	//   16   32:invokevirtual   #124 <Method Throwable Throwable.getCause()>
	//   17   35:astore_2        
	//*  18   36:goto            24
		throw JsonMappingException.from(jsonparser, ((Throwable) (exception)).getMessage(), ((Throwable) (exception)));
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #128 <Method String Throwable.getMessage()>
	//   22   44:aload_2         
	//   23   45:invokestatic    #134 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//   24   48:athrow          
	}

	protected IOException _throwAsIOE(Exception exception)
		throws IOException
	{
		return _throwAsIOE((JsonParser)null, exception);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #138 <Class JsonParser>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #140 <Method IOException _throwAsIOE(JsonParser, Exception)>
	//    5    9:areturn         
	}

	protected void _throwAsIOE(JsonParser jsonparser, Exception exception, Object obj)
		throws IOException
	{
		if(exception instanceof IllegalArgumentException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #143 <Class IllegalArgumentException>
	//*   2    4:ifeq            118
		{
			StringBuilder stringbuilder;
			if(obj == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       96
				obj = "[NULL]";
	//    5   11:ldc1            #145 <String "[NULL]">
	//    6   13:astore_3        
			else
	//*   7   14:new             #147 <Class StringBuilder>
	//*   8   17:dup             
	//*   9   18:ldc1            #149 <String "Problem deserializing property '">
	//*  10   20:invokespecial   #150 <Method void StringBuilder(String)>
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #153 <Method String getName()>
	//*  13   27:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  14   30:astore          4
	//*  15   32:aload           4
	//*  16   34:ldc1            #159 <String "' (expected type: ">
	//*  17   36:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  18   39:aload_0         
	//*  19   40:invokevirtual   #163 <Method JavaType getType()>
	//*  20   43:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//*  21   46:pop             
	//*  22   47:aload           4
	//*  23   49:ldc1            #168 <String "; actual type: ">
	//*  24   51:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  25   54:aload_3         
	//*  26   55:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  27   58:ldc1            #170 <String ")">
	//*  28   60:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  29   63:pop             
	//*  30   64:aload_2         
	//*  31   65:invokevirtual   #173 <Method String Exception.getMessage()>
	//*  32   68:astore_3        
	//*  33   69:aload_3         
	//*  34   70:ifnull          107
	//*  35   73:aload           4
	//*  36   75:ldc1            #175 <String ", problem: ">
	//*  37   77:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  38   80:aload_3         
	//*  39   81:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//*  40   84:pop             
	//*  41   85:aload_1         
	//*  42   86:aload           4
	//*  43   88:invokevirtual   #178 <Method String StringBuilder.toString()>
	//*  44   91:aload_2         
	//*  45   92:invokestatic    #134 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//*  46   95:athrow          
				obj = ((Object) (obj.getClass().getName()));
	//   47   96:aload_3         
	//   48   97:invokevirtual   #184 <Method Class Object.getClass()>
	//   49  100:invokevirtual   #187 <Method String Class.getName()>
	//   50  103:astore_3        
			stringbuilder = (new StringBuilder("Problem deserializing property '")).append(getName());
			stringbuilder.append("' (expected type: ").append(((Object) (getType())));
			stringbuilder.append("; actual type: ").append(((String) (obj))).append(")");
			obj = ((Object) (exception.getMessage()));
			if(obj != null)
				stringbuilder.append(", problem: ").append(((String) (obj)));
			else
	//*  51  104:goto            14
				stringbuilder.append(" (no error message provided)");
	//   52  107:aload           4
	//   53  109:ldc1            #189 <String " (no error message provided)">
	//   54  111:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   55  114:pop             
			throw JsonMappingException.from(jsonparser, stringbuilder.toString(), ((Throwable) (exception)));
		} else
	//*  56  115:goto            85
		{
			_throwAsIOE(jsonparser, exception);
	//   57  118:aload_0         
	//   58  119:aload_1         
	//   59  120:aload_2         
	//   60  121:invokevirtual   #140 <Method IOException _throwAsIOE(JsonParser, Exception)>
	//   61  124:pop             
			return;
	//   62  125:return          
		}
	}

	protected void _throwAsIOE(Exception exception, Object obj)
		throws IOException
	{
		_throwAsIOE((JsonParser)null, exception, obj);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #138 <Class JsonParser>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #192 <Method void _throwAsIOE(JsonParser, Exception, Object)>
	//    6   10:return          
	}

	public void assignIndex(int i)
	{
		if(_propertyIndex != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int _propertyIndex>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          59
		{
			throw new IllegalStateException((new StringBuilder()).append("Property '").append(getName()).append("' already had index (").append(_propertyIndex).append("), trying to assign ").append(i).toString());
	//    4    8:new             #196 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #147 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #198 <Method void StringBuilder()>
	//    9   19:ldc1            #200 <String "Property '">
	//   10   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #153 <Method String getName()>
	//   13   28:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #202 <String "' already had index (">
	//   15   33:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:getfield        #46  <Field int _propertyIndex>
	//   18   40:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   19   43:ldc1            #207 <String "), trying to assign ">
	//   20   45:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:iload_1         
	//   22   49:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   23   52:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   24   55:invokespecial   #208 <Method void IllegalStateException(String)>
	//   25   58:athrow          
		} else
		{
			_propertyIndex = i;
	//   26   59:aload_0         
	//   27   60:iload_1         
	//   28   61:putfield        #46  <Field int _propertyIndex>
			return;
	//   29   64:return          
		}
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(isRequired())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #214 <Method boolean isRequired()>
	//*   2    4:ifeq            15
		{
			jsonobjectformatvisitor.property(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokeinterface #220 <Method void JsonObjectFormatVisitor.property(com.fasterxml.jackson.databind.BeanProperty)>
			return;
	//    6   14:return          
		} else
		{
			jsonobjectformatvisitor.optionalProperty(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokeinterface #223 <Method void JsonObjectFormatVisitor.optionalProperty(com.fasterxml.jackson.databind.BeanProperty)>
			return;
	//   10   22:return          
		}
	}

	public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #229 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #235 <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       19
			return _valueDeserializer.getNullValue(deserializationcontext);
	//    4   10:aload_0         
	//    5   11:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #241 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//    8   18:areturn         
		if(_valueTypeDeserializer != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//*  11   23:ifnull          40
			return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
	//   12   26:aload_0         
	//   13   27:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   18   36:invokevirtual   #245 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   19   39:areturn         
		else
			return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//   22   44:aload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #247 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   25   49:areturn         
	}

	public abstract void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException;

	public abstract Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException;

	public abstract Annotation getAnnotation(Class class1);

	public Annotation getContextAnnotation(Class class1)
	{
		return _contextAnnotations.get(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Annotations _contextAnnotations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #259 <Method Annotation Annotations.get(Class)>
	//    4   10:areturn         
	}

	public int getCreatorIndex()
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	protected final Class getDeclaringClass()
	{
		return getMember().getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method AnnotatedMember getMember()>
	//    2    4:invokevirtual   #271 <Method Class AnnotatedMember.getDeclaringClass()>
	//    3    7:areturn         
	}

	public PropertyName getFullName()
	{
		return _propName;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PropertyName _propName>
	//    2    4:areturn         
	}

	public Object getInjectableValueId()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getManagedReferenceName()
	{
		return _managedReferenceName;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String _managedReferenceName>
	//    2    4:areturn         
	}

	public abstract AnnotatedMember getMember();

	public final String getName()
	{
		return _propName.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PropertyName _propName>
	//    2    4:invokevirtual   #278 <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		return _objectIdInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field ObjectIdInfo _objectIdInfo>
	//    2    4:areturn         
	}

	public int getPropertyIndex()
	{
		return _propertyIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int _propertyIndex>
	//    2    4:ireturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field JavaType _type>
	//    2    4:areturn         
	}

	public JsonDeserializer getValueDeserializer()
	{
		JsonDeserializer jsondeserializer1 = _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//    2    4:astore_2        
		JsonDeserializer jsondeserializer = jsondeserializer1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsondeserializer1 == MISSING_VALUE_DESERIALIZER)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #39  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//*   7   11:if_acmpne       16
			jsondeserializer = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		return jsondeserializer;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public TypeDeserializer getValueTypeDeserializer()
	{
		return _valueTypeDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//    2    4:areturn         
	}

	public PropertyName getWrapperName()
	{
		return _wrapperName;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field PropertyName _wrapperName>
	//    2    4:areturn         
	}

	public boolean hasValueDeserializer()
	{
		return _valueDeserializer != null && _valueDeserializer != MISSING_VALUE_DESERIALIZER;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field JsonDeserializer _valueDeserializer>
	//    5   11:getstatic       #39  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//    6   14:if_acmpeq       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean hasValueTypeDeserializer()
	{
		return _valueTypeDeserializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasViews()
	{
		return _viewMatcher != null;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ViewMatcher _viewMatcher>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract void set(Object obj, Object obj1)
		throws IOException;

	public abstract Object setAndReturn(Object obj, Object obj1)
		throws IOException;

	public void setManagedReferenceName(String s)
	{
		_managedReferenceName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String _managedReferenceName>
	//    3    5:return          
	}

	public void setObjectIdInfo(ObjectIdInfo objectidinfo)
	{
		_objectIdInfo = objectidinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #282 <Field ObjectIdInfo _objectIdInfo>
	//    3    5:return          
	}

	public void setViews(Class aclass[])
	{
		if(aclass == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			_viewMatcher = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #61  <Field ViewMatcher _viewMatcher>
			return;
	//    5    9:return          
		} else
		{
			_viewMatcher = ViewMatcher.construct(aclass);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #305 <Method ViewMatcher ViewMatcher.construct(Class[])>
	//    9   15:putfield        #61  <Field ViewMatcher _viewMatcher>
			return;
	//   10   18:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("[property '").append(getName()).append("']").toString();
	//    0    0:new             #147 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #198 <Method void StringBuilder()>
	//    3    7:ldc2            #308 <String "[property '">
	//    4   10:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #153 <Method String getName()>
	//    7   17:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:ldc2            #310 <String "']">
	//    9   23:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   10   26:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   11   29:areturn         
	}

	public boolean visibleInView(Class class1)
	{
		return _viewMatcher == null || _viewMatcher.isVisibleForView(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ViewMatcher _viewMatcher>
	//    2    4:ifnull          18
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field ViewMatcher _viewMatcher>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #315 <Method boolean ViewMatcher.isVisibleForView(Class)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public abstract SettableBeanProperty withName(PropertyName propertyname);

	public SettableBeanProperty withName(String s)
	{
		return withName(new PropertyName(s));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class PropertyName>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #105 <Method void PropertyName(String)>
	//    5    9:invokevirtual   #321 <Method SettableBeanProperty withName(PropertyName)>
	//    6   12:areturn         
	}

	public SettableBeanProperty withSimpleName(String s)
	{
		if(_propName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field PropertyName _propName>
	//*   2    4:ifnonnull       26
			s = ((String) (new PropertyName(s)));
	//    3    7:new             #48  <Class PropertyName>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #105 <Method void PropertyName(String)>
	//    7   15:astore_1        
		else
	//*   8   16:aload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #53  <Field PropertyName _propName>
	//*  11   21:if_acmpne       38
	//*  12   24:aload_0         
	//*  13   25:areturn         
			s = ((String) (_propName.withSimpleName(s)));
	//   14   26:aload_0         
	//   15   27:getfield        #53  <Field PropertyName _propName>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #325 <Method PropertyName PropertyName.withSimpleName(String)>
	//   18   34:astore_1        
		if(s == _propName)
			return this;
		else
	//*  19   35:goto            16
			return withName(((PropertyName) (s)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #321 <Method SettableBeanProperty withName(PropertyName)>
	//   23   43:areturn         
	}

	public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer);

	protected static final JsonDeserializer MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
	protected final transient Annotations _contextAnnotations;
	protected String _managedReferenceName;
	protected ObjectIdInfo _objectIdInfo;
	protected final PropertyName _propName;
	protected int _propertyIndex;
	protected final JavaType _type;
	protected final JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
	protected ViewMatcher _viewMatcher;
	protected final PropertyName _wrapperName;

	static 
	{
	//    0    0:new             #31  <Class FailingDeserializer>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "No _valueDeserializer assigned">
	//    3    6:invokespecial   #37  <Method void FailingDeserializer(String)>
	//    4    9:putstatic       #39  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//*   5   12:return          
	}
}
