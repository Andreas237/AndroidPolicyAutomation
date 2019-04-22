// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableBeanProperty, NullValueProvider

public static abstract class SettableBeanProperty$Delegating extends SettableBeanProperty
{

	protected SettableBeanProperty _with(SettableBeanProperty settablebeanproperty)
	{
		if(settablebeanproperty == _flddelegate)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//*   3    5:if_acmpne       10
			return ((SettableBeanProperty) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return withDelegate(settablebeanproperty);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #19  <Method SettableBeanProperty withDelegate(SettableBeanProperty)>
	//    9   15:areturn         
	}

	public void assignIndex(int i)
	{
		_flddelegate.assignIndex(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #23  <Method void SettableBeanProperty.assignIndex(int)>
	//    4    8:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		_flddelegate.deserializeAndSet(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #29  <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
	//    6   10:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return _flddelegate.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #34  <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//    6   10:areturn         
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		_flddelegate.fixAccess(deserializationconfig);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
	//    4    8:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		return _flddelegate.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method Annotation SettableBeanProperty.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public int getCreatorIndex()
	{
		return _flddelegate.getCreatorIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #48  <Method int SettableBeanProperty.getCreatorIndex()>
	//    3    7:ireturn         
	}

	protected Class getDeclaringClass()
	{
		return _flddelegate.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #52  <Method Class SettableBeanProperty.getDeclaringClass()>
	//    3    7:areturn         
	}

	public Object getInjectableValueId()
	{
		return _flddelegate.getInjectableValueId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #57  <Method Object SettableBeanProperty.getInjectableValueId()>
	//    3    7:areturn         
	}

	public String getManagedReferenceName()
	{
		return _flddelegate.getManagedReferenceName();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #61  <Method String SettableBeanProperty.getManagedReferenceName()>
	//    3    7:areturn         
	}

	public AnnotatedMember getMember()
	{
		return _flddelegate.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #65  <Method AnnotatedMember SettableBeanProperty.getMember()>
	//    3    7:areturn         
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		return _flddelegate.getObjectIdInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #69  <Method ObjectIdInfo SettableBeanProperty.getObjectIdInfo()>
	//    3    7:areturn         
	}

	public JsonDeserializer getValueDeserializer()
	{
		return _flddelegate.getValueDeserializer();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #73  <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
	//    3    7:areturn         
	}

	public TypeDeserializer getValueTypeDeserializer()
	{
		return _flddelegate.getValueTypeDeserializer();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #78  <Method TypeDeserializer SettableBeanProperty.getValueTypeDeserializer()>
	//    3    7:areturn         
	}

	public boolean hasValueDeserializer()
	{
		return _flddelegate.hasValueDeserializer();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #82  <Method boolean SettableBeanProperty.hasValueDeserializer()>
	//    3    7:ireturn         
	}

	public boolean hasValueTypeDeserializer()
	{
		return _flddelegate.hasValueTypeDeserializer();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #85  <Method boolean SettableBeanProperty.hasValueTypeDeserializer()>
	//    3    7:ireturn         
	}

	public boolean hasViews()
	{
		return _flddelegate.hasViews();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:invokevirtual   #88  <Method boolean SettableBeanProperty.hasViews()>
	//    3    7:ireturn         
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		_flddelegate.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #92  <Method void SettableBeanProperty.set(Object, Object)>
	//    5    9:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		return _flddelegate.setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #96  <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//    5    9:areturn         
	}

	public boolean visibleInView(Class class1)
	{
		return _flddelegate.visibleInView(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #100 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//    4    8:ireturn         
	}

	protected abstract SettableBeanProperty withDelegate(SettableBeanProperty settablebeanproperty);

	public SettableBeanProperty withName(PropertyName propertyname)
	{
		return _with(_flddelegate.withName(propertyname));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #105 <Method SettableBeanProperty SettableBeanProperty.withName(PropertyName)>
	//    5    9:invokevirtual   #107 <Method SettableBeanProperty _with(SettableBeanProperty)>
	//    6   12:areturn         
	}

	public SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider)
	{
		return _with(_flddelegate.withNullProvider(nullvalueprovider));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #111 <Method SettableBeanProperty SettableBeanProperty.withNullProvider(NullValueProvider)>
	//    5    9:invokevirtual   #107 <Method SettableBeanProperty _with(SettableBeanProperty)>
	//    6   12:areturn         
	}

	public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return _with(_flddelegate.withValueDeserializer(jsondeserializer));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field SettableBeanProperty _flddelegate>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #115 <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(JsonDeserializer)>
	//    5    9:invokevirtual   #107 <Method SettableBeanProperty _with(SettableBeanProperty)>
	//    6   12:areturn         
	}

	protected final SettableBeanProperty _flddelegate;

	protected SettableBeanProperty$Delegating(SettableBeanProperty settablebeanproperty)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void SettableBeanProperty(SettableBeanProperty)>
		_flddelegate = settablebeanproperty;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field SettableBeanProperty _flddelegate>
	//    6   10:return          
	}
}
