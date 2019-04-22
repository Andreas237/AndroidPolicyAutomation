// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			HandlerInstantiator

public final class BaseSettings
	implements Serializable
{

	public BaseSettings(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, TypeResolverBuilder typeresolverbuilder, DateFormat dateformat, HandlerInstantiator handlerinstantiator, 
			Locale locale, TimeZone timezone, Base64Variant base64variant)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		_classIntrospector = classintrospector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field ClassIntrospector _classIntrospector>
		_annotationIntrospector = annotationintrospector;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
		_propertyNamingStrategy = propertynamingstrategy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field PropertyNamingStrategy _propertyNamingStrategy>
		_typeFactory = typefactory;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field TypeFactory _typeFactory>
		_typeResolverBuilder = typeresolverbuilder;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #59  <Field TypeResolverBuilder _typeResolverBuilder>
		_dateFormat = dateformat;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #61  <Field DateFormat _dateFormat>
		_handlerInstantiator = handlerinstantiator;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #63  <Field HandlerInstantiator _handlerInstantiator>
		_locale = locale;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #65  <Field Locale _locale>
		_timeZone = timezone;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #67  <Field TimeZone _timeZone>
		_defaultBase64 = base64variant;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #69  <Field Base64Variant _defaultBase64>
	//   32   61:return          
	}

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		return _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:areturn         
	}

	public Base64Variant getBase64Variant()
	{
		return _defaultBase64;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Base64Variant _defaultBase64>
	//    2    4:areturn         
	}

	public ClassIntrospector getClassIntrospector()
	{
		return _classIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ClassIntrospector _classIntrospector>
	//    2    4:areturn         
	}

	public DateFormat getDateFormat()
	{
		return _dateFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DateFormat _dateFormat>
	//    2    4:areturn         
	}

	public HandlerInstantiator getHandlerInstantiator()
	{
		return _handlerInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field HandlerInstantiator _handlerInstantiator>
	//    2    4:areturn         
	}

	public Locale getLocale()
	{
		return _locale;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Locale _locale>
	//    2    4:areturn         
	}

	public PropertyNamingStrategy getPropertyNamingStrategy()
	{
		return _propertyNamingStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//    2    4:areturn         
	}

	public TimeZone getTimeZone()
	{
		TimeZone timezone1 = _timeZone;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field TimeZone _timeZone>
	//    2    4:astore_2        
		TimeZone timezone = timezone1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(timezone1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			timezone = DEFAULT_TIMEZONE;
	//    7   11:getstatic       #44  <Field TimeZone DEFAULT_TIMEZONE>
	//    8   14:astore_1        
		return timezone;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _typeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field TypeFactory _typeFactory>
	//    2    4:areturn         
	}

	public TypeResolverBuilder getTypeResolverBuilder()
	{
		return _typeResolverBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field TypeResolverBuilder _typeResolverBuilder>
	//    2    4:areturn         
	}

	public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		if(_annotationIntrospector == annotationintrospector)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, annotationintrospector, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #55  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   13   23:aload_0         
	//   14   24:getfield        #57  <Field TypeFactory _typeFactory>
	//   15   27:aload_0         
	//   16   28:getfield        #59  <Field TypeResolverBuilder _typeResolverBuilder>
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field DateFormat _dateFormat>
	//   19   35:aload_0         
	//   20   36:getfield        #63  <Field HandlerInstantiator _handlerInstantiator>
	//   21   39:aload_0         
	//   22   40:getfield        #65  <Field Locale _locale>
	//   23   43:aload_0         
	//   24   44:getfield        #67  <Field TimeZone _timeZone>
	//   25   47:aload_0         
	//   26   48:getfield        #69  <Field Base64Variant _defaultBase64>
	//   27   51:invokespecial   #95  <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   28   54:areturn         
	}

	public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return withAnnotationIntrospector(AnnotationIntrospectorPair.create(_annotationIntrospector, annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//    3    5:aload_1         
	//    4    6:invokestatic    #102 <Method AnnotationIntrospector AnnotationIntrospectorPair.create(AnnotationIntrospector, AnnotationIntrospector)>
	//    5    9:invokevirtual   #104 <Method BaseSettings withAnnotationIntrospector(AnnotationIntrospector)>
	//    6   12:areturn         
	}

	public BaseSettings withClassIntrospector(ClassIntrospector classintrospector)
	{
		if(_classIntrospector == classintrospector)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field ClassIntrospector _classIntrospector>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(classintrospector, _annotationIntrospector, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//   11   19:aload_0         
	//   12   20:getfield        #55  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   13   23:aload_0         
	//   14   24:getfield        #57  <Field TypeFactory _typeFactory>
	//   15   27:aload_0         
	//   16   28:getfield        #59  <Field TypeResolverBuilder _typeResolverBuilder>
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field DateFormat _dateFormat>
	//   19   35:aload_0         
	//   20   36:getfield        #63  <Field HandlerInstantiator _handlerInstantiator>
	//   21   39:aload_0         
	//   22   40:getfield        #65  <Field Locale _locale>
	//   23   43:aload_0         
	//   24   44:getfield        #67  <Field TimeZone _timeZone>
	//   25   47:aload_0         
	//   26   48:getfield        #69  <Field Base64Variant _defaultBase64>
	//   27   51:invokespecial   #95  <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   28   54:areturn         
	}

	public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationintrospector, _annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//    4    6:invokestatic    #102 <Method AnnotationIntrospector AnnotationIntrospectorPair.create(AnnotationIntrospector, AnnotationIntrospector)>
	//    5    9:invokevirtual   #104 <Method BaseSettings withAnnotationIntrospector(AnnotationIntrospector)>
	//    6   12:areturn         
	}

	public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		if(_propertyNamingStrategy == propertynamingstrategy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, propertynamingstrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #57  <Field TypeFactory _typeFactory>
	//   15   27:aload_0         
	//   16   28:getfield        #59  <Field TypeResolverBuilder _typeResolverBuilder>
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field DateFormat _dateFormat>
	//   19   35:aload_0         
	//   20   36:getfield        #63  <Field HandlerInstantiator _handlerInstantiator>
	//   21   39:aload_0         
	//   22   40:getfield        #65  <Field Locale _locale>
	//   23   43:aload_0         
	//   24   44:getfield        #67  <Field TimeZone _timeZone>
	//   25   47:aload_0         
	//   26   48:getfield        #69  <Field Base64Variant _defaultBase64>
	//   27   51:invokespecial   #95  <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   28   54:areturn         
	}

	public BaseSettings withTypeFactory(TypeFactory typefactory)
	{
		if(_typeFactory == typefactory)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field TypeFactory _typeFactory>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _propertyNamingStrategy, typefactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #53  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #55  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #59  <Field TypeResolverBuilder _typeResolverBuilder>
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field DateFormat _dateFormat>
	//   19   35:aload_0         
	//   20   36:getfield        #63  <Field HandlerInstantiator _handlerInstantiator>
	//   21   39:aload_0         
	//   22   40:getfield        #65  <Field Locale _locale>
	//   23   43:aload_0         
	//   24   44:getfield        #67  <Field TimeZone _timeZone>
	//   25   47:aload_0         
	//   26   48:getfield        #69  <Field Base64Variant _defaultBase64>
	//   27   51:invokespecial   #95  <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   28   54:areturn         
	}

	private static final TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("UTC");
	private static final long serialVersionUID = 1L;
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final ClassIntrospector _classIntrospector;
	protected final DateFormat _dateFormat;
	protected final Base64Variant _defaultBase64;
	protected final HandlerInstantiator _handlerInstantiator;
	protected final Locale _locale;
	protected final PropertyNamingStrategy _propertyNamingStrategy;
	protected final TimeZone _timeZone;
	protected final TypeFactory _typeFactory;
	protected final TypeResolverBuilder _typeResolverBuilder;

	static 
	{
	//    0    0:ldc1            #36  <String "UTC">
	//    1    2:invokestatic    #42  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #44  <Field TimeZone DEFAULT_TIMEZONE>
	//*   3    8:return          
	}
}
