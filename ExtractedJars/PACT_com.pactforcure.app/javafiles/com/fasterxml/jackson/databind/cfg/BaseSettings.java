// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			HandlerInstantiator

public final class BaseSettings
	implements Serializable
{

	public BaseSettings(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, TypeResolverBuilder typeresolverbuilder, DateFormat dateformat, 
			HandlerInstantiator handlerinstantiator, Locale locale, TimeZone timezone, Base64Variant base64variant)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		_classIntrospector = classintrospector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field ClassIntrospector _classIntrospector>
		_annotationIntrospector = annotationintrospector;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
		_visibilityChecker = visibilitychecker;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field VisibilityChecker _visibilityChecker>
		_propertyNamingStrategy = propertynamingstrategy;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
		_typeFactory = typefactory;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #62  <Field TypeFactory _typeFactory>
		_typeResolverBuilder = typeresolverbuilder;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
		_dateFormat = dateformat;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #66  <Field DateFormat _dateFormat>
		_handlerInstantiator = handlerinstantiator;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #68  <Field HandlerInstantiator _handlerInstantiator>
		_locale = locale;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #70  <Field Locale _locale>
		_timeZone = timezone;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #72  <Field TimeZone _timeZone>
		_defaultBase64 = base64variant;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #74  <Field Base64Variant _defaultBase64>
	//   35   67:return          
	}

	private DateFormat _force(DateFormat dateformat, TimeZone timezone)
	{
		if(dateformat instanceof StdDateFormat)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #80  <Class StdDateFormat>
	//*   2    4:ifeq            16
		{
			return ((DateFormat) (((StdDateFormat)dateformat).withTimeZone(timezone)));
	//    3    7:aload_1         
	//    4    8:checkcast       #80  <Class StdDateFormat>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #84  <Method StdDateFormat StdDateFormat.withTimeZone(TimeZone)>
	//    7   15:areturn         
		} else
		{
			dateformat = (DateFormat)dateformat.clone();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #90  <Method Object DateFormat.clone()>
	//   10   20:checkcast       #86  <Class DateFormat>
	//   11   23:astore_1        
			dateformat.setTimeZone(timezone);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #94  <Method void DateFormat.setTimeZone(TimeZone)>
			return dateformat;
	//   15   29:aload_1         
	//   16   30:areturn         
		}
	}

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		return _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:areturn         
	}

	public Base64Variant getBase64Variant()
	{
		return _defaultBase64;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Base64Variant _defaultBase64>
	//    2    4:areturn         
	}

	public ClassIntrospector getClassIntrospector()
	{
		return _classIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//    2    4:areturn         
	}

	public DateFormat getDateFormat()
	{
		return _dateFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field DateFormat _dateFormat>
	//    2    4:areturn         
	}

	public HandlerInstantiator getHandlerInstantiator()
	{
		return _handlerInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//    2    4:areturn         
	}

	public Locale getLocale()
	{
		return _locale;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Locale _locale>
	//    2    4:areturn         
	}

	public PropertyNamingStrategy getPropertyNamingStrategy()
	{
		return _propertyNamingStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//    2    4:areturn         
	}

	public TimeZone getTimeZone()
	{
		TimeZone timezone1 = _timeZone;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field TimeZone _timeZone>
	//    2    4:astore_2        
		TimeZone timezone = timezone1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(timezone1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			timezone = DEFAULT_TIMEZONE;
	//    7   11:getstatic       #47  <Field TimeZone DEFAULT_TIMEZONE>
	//    8   14:astore_1        
		return timezone;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _typeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field TypeFactory _typeFactory>
	//    2    4:areturn         
	}

	public TypeResolverBuilder getTypeResolverBuilder()
	{
		return _typeResolverBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//    2    4:areturn         
	}

	public VisibilityChecker getVisibilityChecker()
	{
		return _visibilityChecker;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//    2    4:areturn         
	}

	public boolean hasExplicitTimeZone()
	{
		return _timeZone != null;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field TimeZone _timeZone>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public BaseSettings with(Base64Variant base64variant)
	{
		if(base64variant == _defaultBase64)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field Base64Variant _defaultBase64>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, base64variant);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field TypeFactory _typeFactory>
	//   18   34:aload_0         
	//   19   35:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   20   38:aload_0         
	//   21   39:getfield        #66  <Field DateFormat _dateFormat>
	//   22   42:aload_0         
	//   23   43:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   24   46:aload_0         
	//   25   47:getfield        #70  <Field Locale _locale>
	//   26   50:aload_0         
	//   27   51:getfield        #72  <Field TimeZone _timeZone>
	//   28   54:aload_1         
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings with(Locale locale)
	{
		if(_locale == locale)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Locale _locale>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field TypeFactory _typeFactory>
	//   18   34:aload_0         
	//   19   35:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   20   38:aload_0         
	//   21   39:getfield        #66  <Field DateFormat _dateFormat>
	//   22   42:aload_0         
	//   23   43:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings with(TimeZone timezone)
	{
		if(timezone == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new IllegalArgumentException();
	//    2    4:new             #127 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #128 <Method void IllegalArgumentException()>
	//    5   11:athrow          
		if(timezone == _timeZone)
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #72  <Field TimeZone _timeZone>
	//*   9   17:if_acmpne       22
		{
			return this;
	//   10   20:aload_0         
	//   11   21:areturn         
		} else
		{
			DateFormat dateformat = _force(_dateFormat, timezone);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #66  <Field DateFormat _dateFormat>
	//   15   27:aload_1         
	//   16   28:invokespecial   #130 <Method DateFormat _force(DateFormat, TimeZone)>
	//   17   31:astore_2        
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, dateformat, _handlerInstantiator, _locale, timezone, _defaultBase64);
	//   18   32:new             #2   <Class BaseSettings>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   22   40:aload_0         
	//   23   41:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   24   44:aload_0         
	//   25   45:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   26   48:aload_0         
	//   27   49:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   28   52:aload_0         
	//   29   53:getfield        #62  <Field TypeFactory _typeFactory>
	//   30   56:aload_0         
	//   31   57:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   32   60:aload_2         
	//   33   61:aload_0         
	//   34   62:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   35   65:aload_0         
	//   36   66:getfield        #70  <Field Locale _locale>
	//   37   69:aload_1         
	//   38   70:aload_0         
	//   39   71:getfield        #74  <Field Base64Variant _defaultBase64>
	//   40   74:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   41   77:areturn         
		}
	}

	public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		if(_annotationIntrospector == annotationintrospector)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, annotationintrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   13   23:aload_0         
	//   14   24:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   15   27:aload_0         
	//   16   28:getfield        #62  <Field TypeFactory _typeFactory>
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   19   35:aload_0         
	//   20   36:getfield        #66  <Field DateFormat _dateFormat>
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return withAnnotationIntrospector(AnnotationIntrospectorPair.create(_annotationIntrospector, annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//    3    5:aload_1         
	//    4    6:invokestatic    #139 <Method AnnotationIntrospector AnnotationIntrospectorPair.create(AnnotationIntrospector, AnnotationIntrospector)>
	//    5    9:invokevirtual   #141 <Method BaseSettings withAnnotationIntrospector(AnnotationIntrospector)>
	//    6   12:areturn         
	}

	public BaseSettings withClassIntrospector(ClassIntrospector classintrospector)
	{
		if(_classIntrospector == classintrospector)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(classintrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   11   19:aload_0         
	//   12   20:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   13   23:aload_0         
	//   14   24:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   15   27:aload_0         
	//   16   28:getfield        #62  <Field TypeFactory _typeFactory>
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   19   35:aload_0         
	//   20   36:getfield        #66  <Field DateFormat _dateFormat>
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings withDateFormat(DateFormat dateformat)
	{
		if(_dateFormat == dateformat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field DateFormat _dateFormat>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		DateFormat dateformat1 = dateformat;
	//    6   10:aload_1         
	//    7   11:astore_2        
		if(dateformat != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          35
		{
			dateformat1 = dateformat;
	//   10   16:aload_1         
	//   11   17:astore_2        
			if(hasExplicitTimeZone())
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #147 <Method boolean hasExplicitTimeZone()>
	//*  14   22:ifeq            35
				dateformat1 = _force(dateformat, _timeZone);
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #72  <Field TimeZone _timeZone>
	//   19   31:invokespecial   #130 <Method DateFormat _force(DateFormat, TimeZone)>
	//   20   34:astore_2        
		}
		return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, dateformat1, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//   21   35:new             #2   <Class BaseSettings>
	//   22   38:dup             
	//   23   39:aload_0         
	//   24   40:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   25   43:aload_0         
	//   26   44:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   27   47:aload_0         
	//   28   48:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   29   51:aload_0         
	//   30   52:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   31   55:aload_0         
	//   32   56:getfield        #62  <Field TypeFactory _typeFactory>
	//   33   59:aload_0         
	//   34   60:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   35   63:aload_2         
	//   36   64:aload_0         
	//   37   65:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   38   68:aload_0         
	//   39   69:getfield        #70  <Field Locale _locale>
	//   40   72:aload_0         
	//   41   73:getfield        #72  <Field TimeZone _timeZone>
	//   42   76:aload_0         
	//   43   77:getfield        #74  <Field Base64Variant _defaultBase64>
	//   44   80:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   45   83:areturn         
	}

	public BaseSettings withHandlerInstantiator(HandlerInstantiator handlerinstantiator)
	{
		if(_handlerInstantiator == handlerinstantiator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, handlerinstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field TypeFactory _typeFactory>
	//   18   34:aload_0         
	//   19   35:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   20   38:aload_0         
	//   21   39:getfield        #66  <Field DateFormat _dateFormat>
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationintrospector, _annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//    4    6:invokestatic    #139 <Method AnnotationIntrospector AnnotationIntrospectorPair.create(AnnotationIntrospector, AnnotationIntrospector)>
	//    5    9:invokevirtual   #141 <Method BaseSettings withAnnotationIntrospector(AnnotationIntrospector)>
	//    6   12:areturn         
	}

	public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		if(_propertyNamingStrategy == propertynamingstrategy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, propertynamingstrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #62  <Field TypeFactory _typeFactory>
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   19   35:aload_0         
	//   20   36:getfield        #66  <Field DateFormat _dateFormat>
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings withTypeFactory(TypeFactory typefactory)
	{
		if(_typeFactory == typefactory)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field TypeFactory _typeFactory>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, typefactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   19   35:aload_0         
	//   20   36:getfield        #66  <Field DateFormat _dateFormat>
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings withTypeResolverBuilder(TypeResolverBuilder typeresolverbuilder)
	{
		if(_typeResolverBuilder == typeresolverbuilder)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, typeresolverbuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field TypeFactory _typeFactory>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #66  <Field DateFormat _dateFormat>
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
	}

	public BaseSettings withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
	{
		return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(propertyaccessor, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    0    0:new             #2   <Class BaseSettings>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #164 <Method VisibilityChecker VisibilityChecker.withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   11   23:aload_0         
	//   12   24:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field TypeFactory _typeFactory>
	//   15   31:aload_0         
	//   16   32:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   17   35:aload_0         
	//   18   36:getfield        #66  <Field DateFormat _dateFormat>
	//   19   39:aload_0         
	//   20   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   21   43:aload_0         
	//   22   44:getfield        #70  <Field Locale _locale>
	//   23   47:aload_0         
	//   24   48:getfield        #72  <Field TimeZone _timeZone>
	//   25   51:aload_0         
	//   26   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   27   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   28   58:areturn         
	}

	public BaseSettings withVisibilityChecker(VisibilityChecker visibilitychecker)
	{
		if(_visibilityChecker == visibilitychecker)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field VisibilityChecker _visibilityChecker>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BaseSettings(_classIntrospector, _annotationIntrospector, visibilitychecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
	//    6   10:new             #2   <Class BaseSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field ClassIntrospector _classIntrospector>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #60  <Field PropertyNamingStrategy _propertyNamingStrategy>
	//   15   27:aload_0         
	//   16   28:getfield        #62  <Field TypeFactory _typeFactory>
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field TypeResolverBuilder _typeResolverBuilder>
	//   19   35:aload_0         
	//   20   36:getfield        #66  <Field DateFormat _dateFormat>
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field HandlerInstantiator _handlerInstantiator>
	//   23   43:aload_0         
	//   24   44:getfield        #70  <Field Locale _locale>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field TimeZone _timeZone>
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Base64Variant _defaultBase64>
	//   29   55:invokespecial   #123 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   30   58:areturn         
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
	protected final VisibilityChecker _visibilityChecker;

	static 
	{
	//    0    0:ldc1            #39  <String "UTC">
	//    1    2:invokestatic    #45  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #47  <Field TimeZone DEFAULT_TIMEZONE>
	//*   3    8:return          
	}
}
