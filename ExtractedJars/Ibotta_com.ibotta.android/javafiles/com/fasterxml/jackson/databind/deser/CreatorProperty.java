// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableBeanProperty, NullValueProvider

public class CreatorProperty extends SettableBeanProperty
{

	public CreatorProperty(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedParameter annotatedparameter, int i, 
			Object obj, PropertyMetadata propertymetadata)
	{
		super(propertyname, javatype, propertyname1, typedeserializer, annotations, propertymetadata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           9
	//    7   10:invokespecial   #23  <Method void SettableBeanProperty(PropertyName, JavaType, PropertyName, TypeDeserializer, Annotations, PropertyMetadata)>
		_annotated = annotatedparameter;
	//    8   13:aload_0         
	//    9   14:aload           6
	//   10   16:putfield        #25  <Field AnnotatedParameter _annotated>
		_creatorIndex = i;
	//   11   19:aload_0         
	//   12   20:iload           7
	//   13   22:putfield        #27  <Field int _creatorIndex>
		_injectableValueId = obj;
	//   14   25:aload_0         
	//   15   26:aload           8
	//   16   28:putfield        #29  <Field Object _injectableValueId>
		_fallbackSetter = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//   20   36:return          
	}

	protected CreatorProperty(CreatorProperty creatorproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((SettableBeanProperty) (creatorproperty)), jsondeserializer, nullvalueprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #36  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer, NullValueProvider)>
		_annotated = creatorproperty._annotated;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #25  <Field AnnotatedParameter _annotated>
	//    8   12:putfield        #25  <Field AnnotatedParameter _annotated>
		_injectableValueId = creatorproperty._injectableValueId;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #29  <Field Object _injectableValueId>
	//   12   20:putfield        #29  <Field Object _injectableValueId>
		_fallbackSetter = creatorproperty._fallbackSetter;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//   16   28:putfield        #31  <Field SettableBeanProperty _fallbackSetter>
		_creatorIndex = creatorproperty._creatorIndex;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #27  <Field int _creatorIndex>
	//   20   36:putfield        #27  <Field int _creatorIndex>
		_ignorable = creatorproperty._ignorable;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getfield        #38  <Field boolean _ignorable>
	//   24   44:putfield        #38  <Field boolean _ignorable>
	//   25   47:return          
	}

	protected CreatorProperty(CreatorProperty creatorproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (creatorproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #44  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = creatorproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #25  <Field AnnotatedParameter _annotated>
	//    7   11:putfield        #25  <Field AnnotatedParameter _annotated>
		_injectableValueId = creatorproperty._injectableValueId;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #29  <Field Object _injectableValueId>
	//   11   19:putfield        #29  <Field Object _injectableValueId>
		_fallbackSetter = creatorproperty._fallbackSetter;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//   15   27:putfield        #31  <Field SettableBeanProperty _fallbackSetter>
		_creatorIndex = creatorproperty._creatorIndex;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #27  <Field int _creatorIndex>
	//   19   35:putfield        #27  <Field int _creatorIndex>
		_ignorable = creatorproperty._ignorable;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #38  <Field boolean _ignorable>
	//   23   43:putfield        #38  <Field boolean _ignorable>
	//   24   46:return          
	}

	private void _reportMissingSetter(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append("No fallback setter/field defined for creator property '");
	//    4    8:aload_3         
	//    5    9:ldc1            #55  <String "No fallback setter/field defined for creator property '">
	//    6   11:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(getName());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #63  <Method String getName()>
	//   11   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((StringBuilder) (obj)).append("'");
	//   13   24:aload_3         
	//   14   25:ldc1            #65  <String "'">
	//   15   27:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   31:aload_3         
	//   18   32:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   19   35:astore_3        
		if(deserializationcontext != null)
	//*  20   36:aload_2         
	//*  21   37:ifnull          51
		{
			deserializationcontext.reportBadDefinition(getType(), ((String) (obj)));
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:invokevirtual   #72  <Method JavaType getType()>
	//   25   45:aload_3         
	//   26   46:invokevirtual   #78  <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   27   49:pop             
			return;
	//   28   50:return          
		} else
		{
			throw InvalidDefinitionException.from(jsonparser, ((String) (obj)), getType());
	//   29   51:aload_1         
	//   30   52:aload_3         
	//   31   53:aload_0         
	//   32   54:invokevirtual   #72  <Method JavaType getType()>
	//   33   57:invokestatic    #84  <Method InvalidDefinitionException InvalidDefinitionException.from(JsonParser, String, JavaType)>
	//   34   60:athrow          
		}
	}

	private final void _verifySetter()
		throws IOException
	{
		if(_fallbackSetter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//*   2    4:ifnonnull       13
			_reportMissingSetter(((JsonParser) (null)), ((DeserializationContext) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokespecial   #88  <Method void _reportMissingSetter(JsonParser, DeserializationContext)>
	//    7   13:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		_verifySetter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void _verifySetter()>
		_fallbackSetter.set(obj, deserialize(jsonparser, deserializationcontext));
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #96  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    9   15:invokevirtual   #100 <Method void SettableBeanProperty.set(Object, Object)>
	//   10   18:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		_verifySetter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void _verifySetter()>
		return _fallbackSetter.setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #96  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    9   15:invokevirtual   #106 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   10   18:areturn         
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		SettableBeanProperty settablebeanproperty = _fallbackSetter;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//    2    4:astore_2        
		if(settablebeanproperty != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			settablebeanproperty.fixAccess(deserializationconfig);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #110 <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
	//    8   14:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		AnnotatedParameter annotatedparameter = _annotated;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnnotatedParameter _annotated>
	//    2    4:astore_2        
		if(annotatedparameter == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotatedparameter.getAnnotation(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #116 <Method Annotation AnnotatedParameter.getAnnotation(Class)>
	//   10   16:areturn         
	}

	public int getCreatorIndex()
	{
		return _creatorIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int _creatorIndex>
	//    2    4:ireturn         
	}

	public Object getInjectableValueId()
	{
		return _injectableValueId;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object _injectableValueId>
	//    2    4:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnnotatedParameter _annotated>
	//    2    4:areturn         
	}

	public boolean isIgnorable()
	{
		return _ignorable;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean _ignorable>
	//    2    4:ireturn         
	}

	public void markAsIgnorable()
	{
		_ignorable = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #38  <Field boolean _ignorable>
	//    3    5:return          
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		_verifySetter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void _verifySetter()>
		_fallbackSetter.set(obj, obj1);
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #100 <Method void SettableBeanProperty.set(Object, Object)>
	//    7   13:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		_verifySetter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void _verifySetter()>
		return _fallbackSetter.setAndReturn(obj, obj1);
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #106 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//    7   13:areturn         
	}

	public void setFallbackSetter(SettableBeanProperty settablebeanproperty)
	{
		_fallbackSetter = settablebeanproperty;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field SettableBeanProperty _fallbackSetter>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[creator property, name '");
	//    4    8:aload_1         
	//    5    9:ldc1            #130 <String "[creator property, name '">
	//    6   11:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #63  <Method String getName()>
	//   11   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("'; inject id '");
	//   13   24:aload_1         
	//   14   25:ldc1            #132 <String "'; inject id '">
	//   15   27:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(_injectableValueId);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #29  <Field Object _injectableValueId>
	//   20   36:invokevirtual   #135 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append("']");
	//   22   40:aload_1         
	//   23   41:ldc1            #137 <String "']">
	//   24   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (new CreatorProperty(this, propertyname)));
	//    0    0:new             #2   <Class CreatorProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #141 <Method void CreatorProperty(CreatorProperty, PropertyName)>
	//    5    9:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return ((SettableBeanProperty) (new CreatorProperty(this, _valueDeserializer, nullvalueprovider)));
	//    0    0:new             #2   <Class CreatorProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #147 <Field JsonDeserializer _valueDeserializer>
	//    5    9:aload_1         
	//    6   10:invokespecial   #149 <Method void CreatorProperty(CreatorProperty, JsonDeserializer, NullValueProvider)>
	//    7   13:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_valueDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((SettableBeanProperty) (new CreatorProperty(this, jsondeserializer, _nullProvider)));
	//    6   10:new             #2   <Class CreatorProperty>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #155 <Field NullValueProvider _nullProvider>
	//   12   20:invokespecial   #149 <Method void CreatorProperty(CreatorProperty, JsonDeserializer, NullValueProvider)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedParameter _annotated;
	protected final int _creatorIndex;
	protected SettableBeanProperty _fallbackSetter;
	protected boolean _ignorable;
	protected final Object _injectableValueId;
}
