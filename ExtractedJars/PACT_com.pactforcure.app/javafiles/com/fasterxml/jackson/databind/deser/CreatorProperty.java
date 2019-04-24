// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableBeanProperty

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
	//    7   10:invokespecial   #21  <Method void SettableBeanProperty(PropertyName, JavaType, PropertyName, TypeDeserializer, Annotations, PropertyMetadata)>
		_annotated = annotatedparameter;
	//    8   13:aload_0         
	//    9   14:aload           6
	//   10   16:putfield        #23  <Field AnnotatedParameter _annotated>
		_creatorIndex = i;
	//   11   19:aload_0         
	//   12   20:iload           7
	//   13   22:putfield        #25  <Field int _creatorIndex>
		_injectableValueId = obj;
	//   14   25:aload_0         
	//   15   26:aload           8
	//   16   28:putfield        #27  <Field Object _injectableValueId>
		_fallbackSetter = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   20   36:return          
	}

	protected CreatorProperty(CreatorProperty creatorproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (creatorproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_annotated = creatorproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #23  <Field AnnotatedParameter _annotated>
	//    7   11:putfield        #23  <Field AnnotatedParameter _annotated>
		_creatorIndex = creatorproperty._creatorIndex;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #25  <Field int _creatorIndex>
	//   11   19:putfield        #25  <Field int _creatorIndex>
		_injectableValueId = creatorproperty._injectableValueId;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #27  <Field Object _injectableValueId>
	//   15   27:putfield        #27  <Field Object _injectableValueId>
		_fallbackSetter = creatorproperty._fallbackSetter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   19   35:putfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   20   38:return          
	}

	protected CreatorProperty(CreatorProperty creatorproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (creatorproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_annotated = creatorproperty._annotated;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #23  <Field AnnotatedParameter _annotated>
	//    7   11:putfield        #23  <Field AnnotatedParameter _annotated>
		_creatorIndex = creatorproperty._creatorIndex;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #25  <Field int _creatorIndex>
	//   11   19:putfield        #25  <Field int _creatorIndex>
		_injectableValueId = creatorproperty._injectableValueId;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #27  <Field Object _injectableValueId>
	//   15   27:putfield        #27  <Field Object _injectableValueId>
		_fallbackSetter = creatorproperty._fallbackSetter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   19   35:putfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   20   38:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		set(obj, deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #50  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #54  <Method void set(Object, Object)>
	//    7   11:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		return setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #50  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #61  <Method Object setAndReturn(Object, Object)>
	//    7   11:areturn         
	}

	public Object findInjectableValue(DeserializationContext deserializationcontext, Object obj)
	{
		if(_injectableValueId == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object _injectableValueId>
	//*   2    4:ifnonnull       57
			throw new IllegalStateException((new StringBuilder()).append("Property '").append(getName()).append("' (type ").append(((Object)this).getClass().getName()).append(") has no injectable value id configured").toString());
	//    3    7:new             #65  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #67  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void StringBuilder()>
	//    8   18:ldc1            #72  <String "Property '">
	//    9   20:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #80  <Method String getName()>
	//   12   27:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:ldc1            #82  <String "' (type ">
	//   14   32:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_0         
	//   16   36:invokevirtual   #88  <Method Class Object.getClass()>
	//   17   39:invokevirtual   #91  <Method String Class.getName()>
	//   18   42:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc1            #93  <String ") has no injectable value id configured">
	//   20   47:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   22   53:invokespecial   #99  <Method void IllegalStateException(String)>
	//   23   56:athrow          
		else
			return deserializationcontext.findInjectableValue(_injectableValueId, ((com.fasterxml.jackson.databind.BeanProperty) (this)), obj);
	//   24   57:aload_1         
	//   25   58:aload_0         
	//   26   59:getfield        #27  <Field Object _injectableValueId>
	//   27   62:aload_0         
	//   28   63:aload_2         
	//   29   64:invokevirtual   #104 <Method Object DeserializationContext.findInjectableValue(Object, com.fasterxml.jackson.databind.BeanProperty, Object)>
	//   30   67:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		if(_annotated == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AnnotatedParameter _annotated>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotated.getAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field AnnotatedParameter _annotated>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #110 <Method Annotation AnnotatedParameter.getAnnotation(Class)>
	//    9   17:areturn         
	}

	public int getCreatorIndex()
	{
		return _creatorIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _creatorIndex>
	//    2    4:ireturn         
	}

	public Object getInjectableValueId()
	{
		return _injectableValueId;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object _injectableValueId>
	//    2    4:areturn         
	}

	public AnnotatedMember getMember()
	{
		return ((AnnotatedMember) (_annotated));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedParameter _annotated>
	//    2    4:areturn         
	}

	public void inject(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		set(obj, findInjectableValue(deserializationcontext, obj));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #121 <Method Object findInjectableValue(DeserializationContext, Object)>
	//    6    8:invokevirtual   #54  <Method void set(Object, Object)>
	//    7   11:return          
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		if(_fallbackSetter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//*   2    4:ifnonnull       40
		{
			throw new IllegalStateException((new StringBuilder()).append("No fallback setter/field defined: can not use creator property for ").append(((Object)this).getClass().getName()).toString());
	//    3    7:new             #65  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #67  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void StringBuilder()>
	//    8   18:ldc1            #123 <String "No fallback setter/field defined: can not use creator property for ">
	//    9   20:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #88  <Method Class Object.getClass()>
	//   12   27:invokevirtual   #91  <Method String Class.getName()>
	//   13   30:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   15   36:invokespecial   #99  <Method void IllegalStateException(String)>
	//   16   39:athrow          
		} else
		{
			_fallbackSetter.set(obj, obj1);
	//   17   40:aload_0         
	//   18   41:getfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   19   44:aload_1         
	//   20   45:aload_2         
	//   21   46:invokevirtual   #124 <Method void SettableBeanProperty.set(Object, Object)>
			return;
	//   22   49:return          
		}
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		if(_fallbackSetter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//*   2    4:ifnonnull       40
			throw new IllegalStateException((new StringBuilder()).append("No fallback setter/field defined: can not use creator property for ").append(((Object)this).getClass().getName()).toString());
	//    3    7:new             #65  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #67  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void StringBuilder()>
	//    8   18:ldc1            #123 <String "No fallback setter/field defined: can not use creator property for ">
	//    9   20:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #88  <Method Class Object.getClass()>
	//   12   27:invokevirtual   #91  <Method String Class.getName()>
	//   13   30:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   15   36:invokespecial   #99  <Method void IllegalStateException(String)>
	//   16   39:athrow          
		else
			return _fallbackSetter.setAndReturn(obj, obj1);
	//   17   40:aload_0         
	//   18   41:getfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//   19   44:aload_1         
	//   20   45:aload_2         
	//   21   46:invokevirtual   #125 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   22   49:areturn         
	}

	public void setFallbackSetter(SettableBeanProperty settablebeanproperty)
	{
		_fallbackSetter = settablebeanproperty;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field SettableBeanProperty _fallbackSetter>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("[creator property, name '").append(getName()).append("'; inject id '").append(_injectableValueId).append("']").toString();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:ldc1            #129 <String "[creator property, name '">
	//    4    9:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #80  <Method String getName()>
	//    7   16:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #131 <String "'; inject id '">
	//    9   21:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #27  <Field Object _injectableValueId>
	//   12   28:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #136 <String "']">
	//   14   33:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	public CreatorProperty withName(PropertyName propertyname)
	{
		return new CreatorProperty(this, propertyname);
	//    0    0:new             #2   <Class CreatorProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #140 <Method void CreatorProperty(CreatorProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #143 <Method CreatorProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public CreatorProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new CreatorProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class CreatorProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #147 <Method void CreatorProperty(CreatorProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method CreatorProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedParameter _annotated;
	protected final int _creatorIndex;
	protected SettableBeanProperty _fallbackSetter;
	protected final Object _injectableValueId;
}
