// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			NullValueProvider

public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase
	implements Serializable
{
	public static abstract class Delegating extends SettableBeanProperty
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

		protected Delegating(SettableBeanProperty settablebeanproperty)
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


	protected SettableBeanProperty(PropertyName propertyname, JavaType javatype, PropertyMetadata propertymetadata, JsonDeserializer jsondeserializer)
	{
		super(propertymetadata);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #49  <Method void ConcreteBeanPropertyBase(PropertyMetadata)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #51  <Field int _propertyIndex>
		if(propertyname == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       24
			_propName = PropertyName.NO_NAME;
	//    8   14:aload_0         
	//    9   15:getstatic       #56  <Field PropertyName PropertyName.NO_NAME>
	//   10   18:putfield        #58  <Field PropertyName _propName>
		else
	//*  11   21:goto            32
			_propName = propertyname.internSimpleName();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #62  <Method PropertyName PropertyName.internSimpleName()>
	//   15   29:putfield        #58  <Field PropertyName _propName>
		_type = javatype;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #64  <Field JavaType _type>
		_wrapperName = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #66  <Field PropertyName _wrapperName>
		_contextAnnotations = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #68  <Field Annotations _contextAnnotations>
		_viewMatcher = null;
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:putfield        #70  <Field ViewMatcher _viewMatcher>
		_valueTypeDeserializer = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
		_valueDeserializer = jsondeserializer;
	//   31   57:aload_0         
	//   32   58:aload           4
	//   33   60:putfield        #74  <Field JsonDeserializer _valueDeserializer>
		_nullProvider = ((NullValueProvider) (jsondeserializer));
	//   34   63:aload_0         
	//   35   64:aload           4
	//   36   66:putfield        #76  <Field NullValueProvider _nullProvider>
	//   37   69:return          
	}

	protected SettableBeanProperty(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, TypeDeserializer typedeserializer, Annotations annotations, PropertyMetadata propertymetadata)
	{
		super(propertymetadata);
	//    0    0:aload_0         
	//    1    1:aload           6
	//    2    3:invokespecial   #49  <Method void ConcreteBeanPropertyBase(PropertyMetadata)>
		_propertyIndex = -1;
	//    3    6:aload_0         
	//    4    7:iconst_m1       
	//    5    8:putfield        #51  <Field int _propertyIndex>
		if(propertyname == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       25
			_propName = PropertyName.NO_NAME;
	//    8   15:aload_0         
	//    9   16:getstatic       #56  <Field PropertyName PropertyName.NO_NAME>
	//   10   19:putfield        #58  <Field PropertyName _propName>
		else
	//*  11   22:goto            33
			_propName = propertyname.internSimpleName();
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #62  <Method PropertyName PropertyName.internSimpleName()>
	//   15   30:putfield        #58  <Field PropertyName _propName>
		_type = javatype;
	//   16   33:aload_0         
	//   17   34:aload_2         
	//   18   35:putfield        #64  <Field JavaType _type>
		_wrapperName = propertyname1;
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:putfield        #66  <Field PropertyName _wrapperName>
		_contextAnnotations = annotations;
	//   22   43:aload_0         
	//   23   44:aload           5
	//   24   46:putfield        #68  <Field Annotations _contextAnnotations>
		_viewMatcher = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #70  <Field ViewMatcher _viewMatcher>
		propertyname = ((PropertyName) (typedeserializer));
	//   28   54:aload           4
	//   29   56:astore_1        
		if(typedeserializer != null)
	//*  30   57:aload           4
	//*  31   59:ifnull          69
			propertyname = ((PropertyName) (typedeserializer.forProperty(((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//   32   62:aload           4
	//   33   64:aload_0         
	//   34   65:invokevirtual   #85  <Method TypeDeserializer TypeDeserializer.forProperty(com.fasterxml.jackson.databind.BeanProperty)>
	//   35   68:astore_1        
		_valueTypeDeserializer = ((TypeDeserializer) (propertyname));
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:putfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
		propertyname = ((PropertyName) (MISSING_VALUE_DESERIALIZER));
	//   39   74:getstatic       #44  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//   40   77:astore_1        
		_valueDeserializer = ((JsonDeserializer) (propertyname));
	//   41   78:aload_0         
	//   42   79:aload_1         
	//   43   80:putfield        #74  <Field JsonDeserializer _valueDeserializer>
		_nullProvider = ((NullValueProvider) (propertyname));
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:putfield        #76  <Field NullValueProvider _nullProvider>
	//   47   88:return          
	}

	protected SettableBeanProperty(SettableBeanProperty settablebeanproperty)
	{
		super(((ConcreteBeanPropertyBase) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #51  <Field int _propertyIndex>
		_propName = settablebeanproperty._propName;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #58  <Field PropertyName _propName>
	//    9   15:putfield        #58  <Field PropertyName _propName>
		_type = settablebeanproperty._type;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #64  <Field JavaType _type>
	//   13   23:putfield        #64  <Field JavaType _type>
		_wrapperName = settablebeanproperty._wrapperName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #66  <Field PropertyName _wrapperName>
	//   17   31:putfield        #66  <Field PropertyName _wrapperName>
		_contextAnnotations = settablebeanproperty._contextAnnotations;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #68  <Field Annotations _contextAnnotations>
	//   21   39:putfield        #68  <Field Annotations _contextAnnotations>
		_valueDeserializer = settablebeanproperty._valueDeserializer;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//   25   47:putfield        #74  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
	//   29   55:putfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
		_managedReferenceName = settablebeanproperty._managedReferenceName;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #91  <Field String _managedReferenceName>
	//   33   63:putfield        #91  <Field String _managedReferenceName>
		_propertyIndex = settablebeanproperty._propertyIndex;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:getfield        #51  <Field int _propertyIndex>
	//   37   71:putfield        #51  <Field int _propertyIndex>
		_viewMatcher = settablebeanproperty._viewMatcher;
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:getfield        #70  <Field ViewMatcher _viewMatcher>
	//   41   79:putfield        #70  <Field ViewMatcher _viewMatcher>
		_nullProvider = settablebeanproperty._nullProvider;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:getfield        #76  <Field NullValueProvider _nullProvider>
	//   45   87:putfield        #76  <Field NullValueProvider _nullProvider>
	//   46   90:return          
	}

	protected SettableBeanProperty(SettableBeanProperty settablebeanproperty, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider)
	{
		super(((ConcreteBeanPropertyBase) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #51  <Field int _propertyIndex>
		_propName = settablebeanproperty._propName;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #58  <Field PropertyName _propName>
	//    9   15:putfield        #58  <Field PropertyName _propName>
		_type = settablebeanproperty._type;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #64  <Field JavaType _type>
	//   13   23:putfield        #64  <Field JavaType _type>
		_wrapperName = settablebeanproperty._wrapperName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #66  <Field PropertyName _wrapperName>
	//   17   31:putfield        #66  <Field PropertyName _wrapperName>
		_contextAnnotations = settablebeanproperty._contextAnnotations;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #68  <Field Annotations _contextAnnotations>
	//   21   39:putfield        #68  <Field Annotations _contextAnnotations>
		_valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
	//   25   47:putfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
		_managedReferenceName = settablebeanproperty._managedReferenceName;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #91  <Field String _managedReferenceName>
	//   29   55:putfield        #91  <Field String _managedReferenceName>
		_propertyIndex = settablebeanproperty._propertyIndex;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #51  <Field int _propertyIndex>
	//   33   63:putfield        #51  <Field int _propertyIndex>
		if(jsondeserializer == null)
	//*  34   66:aload_2         
	//*  35   67:ifnonnull       80
			_valueDeserializer = MISSING_VALUE_DESERIALIZER;
	//   36   70:aload_0         
	//   37   71:getstatic       #44  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//   38   74:putfield        #74  <Field JsonDeserializer _valueDeserializer>
		else
	//*  39   77:goto            85
			_valueDeserializer = jsondeserializer;
	//   40   80:aload_0         
	//   41   81:aload_2         
	//   42   82:putfield        #74  <Field JsonDeserializer _valueDeserializer>
		_viewMatcher = settablebeanproperty._viewMatcher;
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:getfield        #70  <Field ViewMatcher _viewMatcher>
	//   46   90:putfield        #70  <Field ViewMatcher _viewMatcher>
		settablebeanproperty = ((SettableBeanProperty) (nullvalueprovider));
	//   47   93:aload_3         
	//   48   94:astore_1        
		if(nullvalueprovider == MISSING_VALUE_DESERIALIZER)
	//*  49   95:aload_3         
	//*  50   96:getstatic       #44  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//*  51   99:if_acmpne       107
			settablebeanproperty = ((SettableBeanProperty) (_valueDeserializer));
	//   52  102:aload_0         
	//   53  103:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//   54  106:astore_1        
		_nullProvider = ((NullValueProvider) (settablebeanproperty));
	//   55  107:aload_0         
	//   56  108:aload_1         
	//   57  109:putfield        #76  <Field NullValueProvider _nullProvider>
	//   58  112:return          
	}

	protected SettableBeanProperty(SettableBeanProperty settablebeanproperty, PropertyName propertyname)
	{
		super(((ConcreteBeanPropertyBase) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
		_propertyIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #51  <Field int _propertyIndex>
		_propName = propertyname;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #58  <Field PropertyName _propName>
		_type = settablebeanproperty._type;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #64  <Field JavaType _type>
	//   12   20:putfield        #64  <Field JavaType _type>
		_wrapperName = settablebeanproperty._wrapperName;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #66  <Field PropertyName _wrapperName>
	//   16   28:putfield        #66  <Field PropertyName _wrapperName>
		_contextAnnotations = settablebeanproperty._contextAnnotations;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #68  <Field Annotations _contextAnnotations>
	//   20   36:putfield        #68  <Field Annotations _contextAnnotations>
		_valueDeserializer = settablebeanproperty._valueDeserializer;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//   24   44:putfield        #74  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
	//   28   52:putfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
		_managedReferenceName = settablebeanproperty._managedReferenceName;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:getfield        #91  <Field String _managedReferenceName>
	//   32   60:putfield        #91  <Field String _managedReferenceName>
		_propertyIndex = settablebeanproperty._propertyIndex;
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:getfield        #51  <Field int _propertyIndex>
	//   36   68:putfield        #51  <Field int _propertyIndex>
		_viewMatcher = settablebeanproperty._viewMatcher;
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:getfield        #70  <Field ViewMatcher _viewMatcher>
	//   40   76:putfield        #70  <Field ViewMatcher _viewMatcher>
		_nullProvider = settablebeanproperty._nullProvider;
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:getfield        #76  <Field NullValueProvider _nullProvider>
	//   44   84:putfield        #76  <Field NullValueProvider _nullProvider>
	//   45   87:return          
	}

	protected SettableBeanProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations)
	{
		this(beanpropertydefinition.getFullName(), javatype, beanpropertydefinition.getWrapperName(), typedeserializer, annotations, beanpropertydefinition.getMetadata());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method PropertyName BeanPropertyDefinition.getFullName()>
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #103 <Method PropertyName BeanPropertyDefinition.getWrapperName()>
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload_1         
	//    9   14:invokevirtual   #107 <Method PropertyMetadata BeanPropertyDefinition.getMetadata()>
	//   10   17:invokespecial   #109 <Method void SettableBeanProperty(PropertyName, JavaType, PropertyName, TypeDeserializer, Annotations, PropertyMetadata)>
	//   11   20:return          
	}

	protected IOException _throwAsIOE(JsonParser jsonparser, Exception exception)
		throws IOException
	{
		ClassUtil.throwIfIOE(((Throwable) (exception)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #119 <Method Throwable ClassUtil.throwIfIOE(Throwable)>
	//    2    4:pop             
		ClassUtil.throwIfRTE(((Throwable) (exception)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #122 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//    5    9:pop             
		exception = ((Exception) (ClassUtil.getRootCause(((Throwable) (exception)))));
	//    6   10:aload_2         
	//    7   11:invokestatic    #125 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//    8   14:astore_2        
		throw JsonMappingException.from(jsonparser, ((Throwable) (exception)).getMessage(), ((Throwable) (exception)));
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #131 <Method String Throwable.getMessage()>
	//   12   20:aload_2         
	//   13   21:invokestatic    #137 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//   14   24:athrow          
	}

	protected void _throwAsIOE(JsonParser jsonparser, Exception exception, Object obj)
		throws IOException
	{
		if(exception instanceof IllegalArgumentException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #141 <Class IllegalArgumentException>
	//*   2    4:ifeq            114
		{
			String s = ClassUtil.classNameOf(obj);
	//    3    7:aload_3         
	//    4    8:invokestatic    #145 <Method String ClassUtil.classNameOf(Object)>
	//    5   11:astore          4
			obj = ((Object) (new StringBuilder("Problem deserializing property '")));
	//    6   13:new             #147 <Class StringBuilder>
	//    7   16:dup             
	//    8   17:ldc1            #149 <String "Problem deserializing property '">
	//    9   19:invokespecial   #150 <Method void StringBuilder(String)>
	//   10   22:astore_3        
			((StringBuilder) (obj)).append(getName());
	//   11   23:aload_3         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #153 <Method String getName()>
	//   14   28:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			((StringBuilder) (obj)).append("' (expected type: ");
	//   16   32:aload_3         
	//   17   33:ldc1            #159 <String "' (expected type: ">
	//   18   35:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			((StringBuilder) (obj)).append(((Object) (getType())));
	//   20   39:aload_3         
	//   21   40:aload_0         
	//   22   41:invokevirtual   #163 <Method JavaType getType()>
	//   23   44:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   24   47:pop             
			((StringBuilder) (obj)).append("; actual type: ");
	//   25   48:aload_3         
	//   26   49:ldc1            #168 <String "; actual type: ">
	//   27   51:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (obj)).append(s);
	//   29   55:aload_3         
	//   30   56:aload           4
	//   31   58:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			((StringBuilder) (obj)).append(")");
	//   33   62:aload_3         
	//   34   63:ldc1            #170 <String ")">
	//   35   65:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			s = exception.getMessage();
	//   37   69:aload_2         
	//   38   70:invokevirtual   #173 <Method String Exception.getMessage()>
	//   39   73:astore          4
			if(s != null)
	//*  40   75:aload           4
	//*  41   77:ifnull          97
			{
				((StringBuilder) (obj)).append(", problem: ");
	//   42   80:aload_3         
	//   43   81:ldc1            #175 <String ", problem: ">
	//   44   83:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   45   86:pop             
				((StringBuilder) (obj)).append(s);
	//   46   87:aload_3         
	//   47   88:aload           4
	//   48   90:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   49   93:pop             
			} else
	//*  50   94:goto            104
			{
				((StringBuilder) (obj)).append(" (no error message provided)");
	//   51   97:aload_3         
	//   52   98:ldc1            #177 <String " (no error message provided)">
	//   53  100:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   54  103:pop             
			}
			throw JsonMappingException.from(jsonparser, ((StringBuilder) (obj)).toString(), ((Throwable) (exception)));
	//   55  104:aload_1         
	//   56  105:aload_3         
	//   57  106:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   58  109:aload_2         
	//   59  110:invokestatic    #137 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//   60  113:athrow          
		} else
		{
			_throwAsIOE(jsonparser, exception);
	//   61  114:aload_0         
	//   62  115:aload_1         
	//   63  116:aload_2         
	//   64  117:invokevirtual   #182 <Method IOException _throwAsIOE(JsonParser, Exception)>
	//   65  120:pop             
			return;
	//   66  121:return          
		}
	}

	protected void _throwAsIOE(Exception exception, Object obj)
		throws IOException
	{
		_throwAsIOE((JsonParser)null, exception, obj);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #185 <Class JsonParser>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #187 <Method void _throwAsIOE(JsonParser, Exception, Object)>
	//    6   10:return          
	}

	public void assignIndex(int i)
	{
		if(_propertyIndex == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field int _propertyIndex>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          14
		{
			_propertyIndex = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #51  <Field int _propertyIndex>
			return;
	//    7   13:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #147 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #191 <Method void StringBuilder()>
	//   11   21:astore_2        
			stringbuilder.append("Property '");
	//   12   22:aload_2         
	//   13   23:ldc1            #193 <String "Property '">
	//   14   25:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(getName());
	//   16   29:aload_2         
	//   17   30:aload_0         
	//   18   31:invokevirtual   #153 <Method String getName()>
	//   19   34:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			stringbuilder.append("' already had index (");
	//   21   38:aload_2         
	//   22   39:ldc1            #195 <String "' already had index (">
	//   23   41:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			stringbuilder.append(_propertyIndex);
	//   25   45:aload_2         
	//   26   46:aload_0         
	//   27   47:getfield        #51  <Field int _propertyIndex>
	//   28   50:invokevirtual   #198 <Method StringBuilder StringBuilder.append(int)>
	//   29   53:pop             
			stringbuilder.append("), trying to assign ");
	//   30   54:aload_2         
	//   31   55:ldc1            #200 <String "), trying to assign ">
	//   32   57:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
			stringbuilder.append(i);
	//   34   61:aload_2         
	//   35   62:iload_1         
	//   36   63:invokevirtual   #198 <Method StringBuilder StringBuilder.append(int)>
	//   37   66:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   38   67:new             #202 <Class IllegalStateException>
	//   39   70:dup             
	//   40   71:aload_2         
	//   41   72:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   42   75:invokespecial   #203 <Method void IllegalStateException(String)>
	//   43   78:athrow          
		}
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(isRequired())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #209 <Method boolean isRequired()>
	//*   2    4:ifeq            15
		{
			jsonobjectformatvisitor.property(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokeinterface #215 <Method void JsonObjectFormatVisitor.property(com.fasterxml.jackson.databind.BeanProperty)>
			return;
	//    6   14:return          
		} else
		{
			jsonobjectformatvisitor.optionalProperty(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokeinterface #218 <Method void JsonObjectFormatVisitor.optionalProperty(com.fasterxml.jackson.databind.BeanProperty)>
			return;
	//   10   22:return          
		}
	}

	public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #226 <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #230 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            21
			return _nullProvider.getNullValue(deserializationcontext);
	//    4   10:aload_0         
	//    5   11:getfield        #76  <Field NullValueProvider _nullProvider>
	//    6   14:aload_2         
	//    7   15:invokeinterface #236 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//    8   20:areturn         
		TypeDeserializer typedeserializer = _valueTypeDeserializer;
	//    9   21:aload_0         
	//   10   22:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
	//   11   25:astore_3        
		if(typedeserializer != null)
	//*  12   26:aload_3         
	//*  13   27:ifnull          41
			return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
	//   14   30:aload_0         
	//   15   31:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:aload_3         
	//   19   37:invokevirtual   #242 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   20   40:areturn         
		else
			return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
	//   21   41:aload_0         
	//   22   42:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #244 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   26   50:areturn         
	}

	public abstract void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException;

	public abstract Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException;

	public final Object deserializeWith(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #226 <Field JsonToken JsonToken.VALUE_NULL>
	//*   2    4:invokevirtual   #230 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            33
			if(NullsConstantProvider.isSkipper(_nullProvider))
	//*   4   10:aload_0         
	//*   5   11:getfield        #76  <Field NullValueProvider _nullProvider>
	//*   6   14:invokestatic    #255 <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//*   7   17:ifeq            22
				return obj;
	//    8   20:aload_3         
	//    9   21:areturn         
			else
				return _nullProvider.getNullValue(deserializationcontext);
	//   10   22:aload_0         
	//   11   23:getfield        #76  <Field NullValueProvider _nullProvider>
	//   12   26:aload_2         
	//   13   27:invokeinterface #236 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   14   32:areturn         
		if(_valueTypeDeserializer != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
	//*  17   37:ifnull          66
			deserializationcontext.reportBadDefinition(getType(), String.format("Cannot merge polymorphic property '%s'", new Object[] {
				getName()
			}));
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:invokevirtual   #163 <Method JavaType getType()>
	//   21   45:ldc2            #257 <String "Cannot merge polymorphic property '%s'">
	//   22   48:iconst_1        
	//   23   49:anewarray       Object[]
	//   24   52:dup             
	//   25   53:iconst_0        
	//   26   54:aload_0         
	//   27   55:invokevirtual   #153 <Method String getName()>
	//   28   58:aastore         
	//   29   59:invokestatic    #265 <Method String String.format(String, Object[])>
	//   30   62:invokevirtual   #271 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   31   65:pop             
		return _valueDeserializer.deserialize(jsonparser, deserializationcontext, obj);
	//   32   66:aload_0         
	//   33   67:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:aload_3         
	//   37   73:invokevirtual   #273 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   38   76:areturn         
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
	//    0    0:return          
	}

	public abstract Annotation getAnnotation(Class class1);

	public Annotation getContextAnnotation(Class class1)
	{
		return _contextAnnotations.get(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Annotations _contextAnnotations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #283 <Method Annotation Annotations.get(Class)>
	//    4   10:areturn         
	}

	public int getCreatorIndex()
	{
		throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", new Object[] {
			getName(), ((Object)this).getClass().getName()
		}));
	//    0    0:new             #202 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #288 <String "Internal error: no creator index for property '%s' (of type %s)">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:invokevirtual   #153 <Method String getName()>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_0         
	//   13   21:invokevirtual   #292 <Method Class Object.getClass()>
	//   14   24:invokevirtual   #295 <Method String Class.getName()>
	//   15   27:aastore         
	//   16   28:invokestatic    #265 <Method String String.format(String, Object[])>
	//   17   31:invokespecial   #203 <Method void IllegalStateException(String)>
	//   18   34:athrow          
	}

	protected Class getDeclaringClass()
	{
		return getMember().getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #300 <Method AnnotatedMember getMember()>
	//    2    4:invokevirtual   #304 <Method Class AnnotatedMember.getDeclaringClass()>
	//    3    7:areturn         
	}

	public PropertyName getFullName()
	{
		return _propName;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field PropertyName _propName>
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
	//    1    1:getfield        #91  <Field String _managedReferenceName>
	//    2    4:areturn         
	}

	public abstract AnnotatedMember getMember();

	public final String getName()
	{
		return _propName.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field PropertyName _propName>
	//    2    4:invokevirtual   #311 <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		return _objectIdInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field ObjectIdInfo _objectIdInfo>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JavaType _type>
	//    2    4:areturn         
	}

	public JsonDeserializer getValueDeserializer()
	{
		JsonDeserializer jsondeserializer = _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//    2    4:astore_1        
		if(jsondeserializer == MISSING_VALUE_DESERIALIZER)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #44  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//*   5    9:if_acmpne       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return jsondeserializer;
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public TypeDeserializer getValueTypeDeserializer()
	{
		return _valueTypeDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
	//    2    4:areturn         
	}

	public PropertyName getWrapperName()
	{
		return _wrapperName;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field PropertyName _wrapperName>
	//    2    4:areturn         
	}

	public boolean hasValueDeserializer()
	{
		JsonDeserializer jsondeserializer = _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field JsonDeserializer _valueDeserializer>
	//    2    4:astore_1        
		return jsondeserializer != null && jsondeserializer != MISSING_VALUE_DESERIALIZER;
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:getstatic       #44  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//    7   13:if_acmpeq       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean hasValueTypeDeserializer()
	{
		return _valueTypeDeserializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field TypeDeserializer _valueTypeDeserializer>
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
	//    1    1:getfield        #70  <Field ViewMatcher _viewMatcher>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isIgnorable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void markAsIgnorable()
	{
	//    0    0:return          
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
	//    2    2:putfield        #91  <Field String _managedReferenceName>
	//    3    5:return          
	}

	public void setObjectIdInfo(ObjectIdInfo objectidinfo)
	{
		_objectIdInfo = objectidinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #315 <Field ObjectIdInfo _objectIdInfo>
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
	//    4    6:putfield        #70  <Field ViewMatcher _viewMatcher>
			return;
	//    5    9:return          
		} else
		{
			_viewMatcher = ViewMatcher.construct(aclass);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #340 <Method ViewMatcher ViewMatcher.construct(Class[])>
	//    9   15:putfield        #70  <Field ViewMatcher _viewMatcher>
			return;
	//   10   18:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #147 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #191 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[property '");
	//    4    8:aload_1         
	//    5    9:ldc2            #343 <String "[property '">
	//    6   12:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(getName());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #153 <Method String getName()>
	//   11   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append("']");
	//   13   25:aload_1         
	//   14   26:ldc2            #345 <String "']">
	//   15   29:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		return stringbuilder.toString();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   19   37:areturn         
	}

	public boolean visibleInView(Class class1)
	{
		ViewMatcher viewmatcher = _viewMatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ViewMatcher _viewMatcher>
	//    2    4:astore_2        
		return viewmatcher == null || viewmatcher.isVisibleForView(class1);
	//    3    5:aload_2         
	//    4    6:ifnull          22
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #350 <Method boolean ViewMatcher.isVisibleForView(Class)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public abstract SettableBeanProperty withName(PropertyName propertyname);

	public abstract SettableBeanProperty withNullProvider(NullValueProvider nullvalueprovider);

	public SettableBeanProperty withSimpleName(String s)
	{
		PropertyName propertyname = _propName;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field PropertyName _propName>
	//    2    4:astore_2        
		if(propertyname == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       21
			s = ((String) (new PropertyName(s)));
	//    5    9:new             #53  <Class PropertyName>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #358 <Method void PropertyName(String)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            27
			s = ((String) (propertyname.withSimpleName(s)));
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #361 <Method PropertyName PropertyName.withSimpleName(String)>
	//   14   26:astore_1        
		if(s == _propName)
	//*  15   27:aload_1         
	//*  16   28:aload_0         
	//*  17   29:getfield        #58  <Field PropertyName _propName>
	//*  18   32:if_acmpne       37
			return this;
	//   19   35:aload_0         
	//   20   36:areturn         
		else
			return withName(((PropertyName) (s)));
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #363 <Method SettableBeanProperty withName(PropertyName)>
	//   24   42:areturn         
	}

	public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer);

	protected static final JsonDeserializer MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
	protected final transient Annotations _contextAnnotations;
	protected String _managedReferenceName;
	protected final NullValueProvider _nullProvider;
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
	//    0    0:new             #36  <Class FailingDeserializer>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "No _valueDeserializer assigned">
	//    3    6:invokespecial   #42  <Method void FailingDeserializer(String)>
	//    4    9:putstatic       #44  <Field JsonDeserializer MISSING_VALUE_DESERIALIZER>
	//*   5   12:return          
	}
}
