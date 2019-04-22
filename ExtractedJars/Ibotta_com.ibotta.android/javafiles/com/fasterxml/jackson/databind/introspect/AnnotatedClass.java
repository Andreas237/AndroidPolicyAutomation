// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			Annotated, TypeResolutionContext, AnnotationCollector, AnnotatedCreatorCollector, 
//			AnnotatedFieldCollector, AnnotatedMethodMap, AnnotatedMethodCollector, AnnotatedMethod, 
//			AnnotatedConstructor

public final class AnnotatedClass extends Annotated
	implements TypeResolutionContext
{
	public static final class Creators
	{

		public final List constructors;
		public final List creatorMethods;
		public final AnnotatedConstructor defaultConstructor;

		public Creators(AnnotatedConstructor annotatedconstructor, List list, List list1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			defaultConstructor = annotatedconstructor;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field AnnotatedConstructor defaultConstructor>
			constructors = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field List constructors>
			creatorMethods = list1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field List creatorMethods>
		//   11   19:return          
		}
	}


	AnnotatedClass(JavaType javatype, Class class1, List list, Class class2, Annotations annotations, TypeBindings typebindings, AnnotationIntrospector annotationintrospector, 
			ClassIntrospector.MixInResolver mixinresolver, TypeFactory typefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Annotated()>
		_type = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #57  <Field JavaType _type>
		_class = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #59  <Field Class _class>
		_superTypes = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #61  <Field List _superTypes>
		_primaryMixIn = class2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #63  <Field Class _primaryMixIn>
		_classAnnotations = annotations;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #65  <Field Annotations _classAnnotations>
		_bindings = typebindings;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #67  <Field TypeBindings _bindings>
		_annotationIntrospector = annotationintrospector;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
		_mixInResolver = mixinresolver;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #71  <Field ClassIntrospector$MixInResolver _mixInResolver>
		_typeFactory = typefactory;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #73  <Field TypeFactory _typeFactory>
	//   29   55:return          
	}

	AnnotatedClass(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Annotated()>
		_type = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #57  <Field JavaType _type>
		_class = class1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #59  <Field Class _class>
		_superTypes = Collections.emptyList();
	//    8   14:aload_0         
	//    9   15:invokestatic    #45  <Method List Collections.emptyList()>
	//   10   18:putfield        #61  <Field List _superTypes>
		_primaryMixIn = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #63  <Field Class _primaryMixIn>
		_classAnnotations = AnnotationCollector.emptyAnnotations();
	//   14   26:aload_0         
	//   15   27:invokestatic    #82  <Method Annotations AnnotationCollector.emptyAnnotations()>
	//   16   30:putfield        #65  <Field Annotations _classAnnotations>
		_bindings = TypeBindings.emptyBindings();
	//   17   33:aload_0         
	//   18   34:invokestatic    #88  <Method TypeBindings TypeBindings.emptyBindings()>
	//   19   37:putfield        #67  <Field TypeBindings _bindings>
		_annotationIntrospector = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
		_mixInResolver = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #71  <Field ClassIntrospector$MixInResolver _mixInResolver>
		_typeFactory = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #73  <Field TypeFactory _typeFactory>
	//   29   55:return          
	}

	private final Creators _creators()
	{
		Creators creators = _creators;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field AnnotatedClass$Creators _creators>
	//    2    4:astore_2        
		Object obj = ((Object) (creators));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(creators == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       46
		{
			obj = ((Object) (_type));
	//    7   11:aload_0         
	//    8   12:getfield        #57  <Field JavaType _type>
	//    9   15:astore_1        
			if(obj == null)
	//*  10   16:aload_1         
	//*  11   17:ifnonnull       27
				obj = ((Object) (NO_CREATORS));
	//   12   20:getstatic       #51  <Field AnnotatedClass$Creators NO_CREATORS>
	//   13   23:astore_1        
			else
	//*  14   24:goto            41
				obj = ((Object) (AnnotatedCreatorCollector.collectCreators(_annotationIntrospector, ((TypeResolutionContext) (this)), ((JavaType) (obj)), _primaryMixIn)));
	//   15   27:aload_0         
	//   16   28:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #63  <Field Class _primaryMixIn>
	//   21   37:invokestatic    #98  <Method AnnotatedClass$Creators AnnotatedCreatorCollector.collectCreators(AnnotationIntrospector, TypeResolutionContext, JavaType, Class)>
	//   22   40:astore_1        
			_creators = ((Creators) (obj));
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:putfield        #92  <Field AnnotatedClass$Creators _creators>
		}
		return ((Creators) (obj));
	//   26   46:aload_1         
	//   27   47:areturn         
	}

	private final List _fields()
	{
		List list = _fields;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field List _fields>
	//    2    4:astore_2        
		Object obj = ((Object) (list));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(list == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       50
		{
			obj = ((Object) (_type));
	//    7   11:aload_0         
	//    8   12:getfield        #57  <Field JavaType _type>
	//    9   15:astore_1        
			if(obj == null)
	//*  10   16:aload_1         
	//*  11   17:ifnonnull       27
				obj = ((Object) (Collections.emptyList()));
	//   12   20:invokestatic    #45  <Method List Collections.emptyList()>
	//   13   23:astore_1        
			else
	//*  14   24:goto            45
				obj = ((Object) (AnnotatedFieldCollector.collectFields(_annotationIntrospector, ((TypeResolutionContext) (this)), _mixInResolver, _typeFactory, ((JavaType) (obj)))));
	//   15   27:aload_0         
	//   16   28:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #71  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   20   36:aload_0         
	//   21   37:getfield        #73  <Field TypeFactory _typeFactory>
	//   22   40:aload_1         
	//   23   41:invokestatic    #106 <Method List AnnotatedFieldCollector.collectFields(AnnotationIntrospector, TypeResolutionContext, ClassIntrospector$MixInResolver, TypeFactory, JavaType)>
	//   24   44:astore_1        
			_fields = ((List) (obj));
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:putfield        #100 <Field List _fields>
		}
		return ((List) (obj));
	//   28   50:aload_1         
	//   29   51:areturn         
	}

	private final AnnotatedMethodMap _methods()
	{
		AnnotatedMethodMap annotatedmethodmap = _memberMethods;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field AnnotatedMethodMap _memberMethods>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethodmap));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethodmap == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       62
		{
			obj = ((Object) (_type));
	//    7   11:aload_0         
	//    8   12:getfield        #57  <Field JavaType _type>
	//    9   15:astore_1        
			if(obj == null)
	//*  10   16:aload_1         
	//*  11   17:ifnonnull       31
				obj = ((Object) (new AnnotatedMethodMap()));
	//   12   20:new             #113 <Class AnnotatedMethodMap>
	//   13   23:dup             
	//   14   24:invokespecial   #114 <Method void AnnotatedMethodMap()>
	//   15   27:astore_1        
			else
	//*  16   28:goto            57
				obj = ((Object) (AnnotatedMethodCollector.collectMethods(_annotationIntrospector, ((TypeResolutionContext) (this)), _mixInResolver, _typeFactory, ((JavaType) (obj)), _superTypes, _primaryMixIn)));
	//   17   31:aload_0         
	//   18   32:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #71  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   22   40:aload_0         
	//   23   41:getfield        #73  <Field TypeFactory _typeFactory>
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #61  <Field List _superTypes>
	//   27   49:aload_0         
	//   28   50:getfield        #63  <Field Class _primaryMixIn>
	//   29   53:invokestatic    #120 <Method AnnotatedMethodMap AnnotatedMethodCollector.collectMethods(AnnotationIntrospector, TypeResolutionContext, ClassIntrospector$MixInResolver, TypeFactory, JavaType, List, Class)>
	//   30   56:astore_1        
			_memberMethods = ((AnnotatedMethodMap) (obj));
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:putfield        #111 <Field AnnotatedMethodMap _memberMethods>
		}
		return ((AnnotatedMethodMap) (obj));
	//   34   62:aload_1         
	//   35   63:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!ClassUtil.hasClass(obj, ((Object)this).getClass()))
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #128 <Method Class Object.getClass()>
	//*   8   12:invokestatic    #134 <Method boolean ClassUtil.hasClass(Object, Class)>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		return ((AnnotatedClass)obj)._class == _class;
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class AnnotatedClass>
	//   14   24:getfield        #59  <Field Class _class>
	//   15   27:aload_0         
	//   16   28:getfield        #59  <Field Class _class>
	//   17   31:if_acmpne       36
	//   18   34:iconst_1        
	//   19   35:ireturn         
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	public Iterable fields()
	{
		return ((Iterable) (_fields()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method List _fields()>
	//    2    4:areturn         
	}

	public AnnotatedMethod findMethod(String s, Class aclass[])
	{
		return _methods().find(s, aclass);
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method AnnotatedMethodMap _methods()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #146 <Method AnnotatedMethod AnnotatedMethodMap.find(String, Class[])>
	//    5    9:areturn         
	}

	public Class getAnnotated()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Class _class>
	//    2    4:areturn         
	}

	public volatile AnnotatedElement getAnnotated()
	{
		return ((AnnotatedElement) (getAnnotated()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method Class getAnnotated()>
	//    2    4:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return _classAnnotations.get(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Annotations _classAnnotations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #159 <Method Annotation Annotations.get(Class)>
	//    4   10:areturn         
	}

	public Annotations getAnnotations()
	{
		return _classAnnotations;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Annotations _classAnnotations>
	//    2    4:areturn         
	}

	public List getConstructors()
	{
		return _creators().constructors;
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method AnnotatedClass$Creators _creators()>
	//    2    4:getfield        #167 <Field List AnnotatedClass$Creators.constructors>
	//    3    7:areturn         
	}

	public AnnotatedConstructor getDefaultConstructor()
	{
		return _creators().defaultConstructor;
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method AnnotatedClass$Creators _creators()>
	//    2    4:getfield        #174 <Field AnnotatedConstructor AnnotatedClass$Creators.defaultConstructor>
	//    3    7:areturn         
	}

	public List getFactoryMethods()
	{
		return _creators().creatorMethods;
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method AnnotatedClass$Creators _creators()>
	//    2    4:getfield        #178 <Field List AnnotatedClass$Creators.creatorMethods>
	//    3    7:areturn         
	}

	public String getName()
	{
		return _class.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Class _class>
	//    2    4:invokevirtual   #185 <Method String Class.getName()>
	//    3    7:areturn         
	}

	public Class getRawType()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Class _class>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JavaType _type>
	//    2    4:areturn         
	}

	public boolean hasAnnotation(Class class1)
	{
		return _classAnnotations.has(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Annotations _classAnnotations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #193 <Method boolean Annotations.has(Class)>
	//    4   10:ireturn         
	}

	public boolean hasAnnotations()
	{
		return _classAnnotations.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Annotations _classAnnotations>
	//    2    4:invokeinterface #200 <Method int Annotations.size()>
	//    3    9:ifle            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		return _classAnnotations.hasOneOf(aclass);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Annotations _classAnnotations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #204 <Method boolean Annotations.hasOneOf(Class[])>
	//    4   10:ireturn         
	}

	public int hashCode()
	{
		return _class.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Class _class>
	//    2    4:invokevirtual   #185 <Method String Class.getName()>
	//    3    7:invokevirtual   #210 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public boolean isNonStaticInnerClass()
	{
		Boolean boolean2 = _nonStaticInnerClass;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field Boolean _nonStaticInnerClass>
	//    2    4:astore_2        
		Boolean boolean1 = boolean2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(boolean2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			boolean1 = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(_class));
	//    7   11:aload_0         
	//    8   12:getfield        #59  <Field Class _class>
	//    9   15:invokestatic    #215 <Method boolean ClassUtil.isNonStaticInnerClass(Class)>
	//   10   18:invokestatic    #221 <Method Boolean Boolean.valueOf(boolean)>
	//   11   21:astore_1        
			_nonStaticInnerClass = boolean1;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #213 <Field Boolean _nonStaticInnerClass>
		}
		return boolean1.booleanValue();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #224 <Method boolean Boolean.booleanValue()>
	//   17   31:ireturn         
	}

	public Iterable memberMethods()
	{
		return ((Iterable) (_methods()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method AnnotatedMethodMap _methods()>
	//    2    4:areturn         
	}

	public JavaType resolveType(Type type)
	{
		return _typeFactory.constructType(type, _bindings);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TypeFactory _typeFactory>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field TypeBindings _bindings>
	//    5    9:invokevirtual   #234 <Method JavaType TypeFactory.constructType(Type, TypeBindings)>
	//    6   12:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #237 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #238 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[AnnotedClass ");
	//    4    8:aload_1         
	//    5    9:ldc1            #240 <String "[AnnotedClass ">
	//    6   11:invokevirtual   #244 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(_class.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #59  <Field Class _class>
	//   11   20:invokevirtual   #185 <Method String Class.getName()>
	//   12   23:invokevirtual   #244 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("]");
	//   14   27:aload_1         
	//   15   28:ldc1            #246 <String "]">
	//   16   30:invokevirtual   #244 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	private static final Creators NO_CREATORS = new Creators(((AnnotatedConstructor) (null)), Collections.emptyList(), Collections.emptyList());
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final TypeBindings _bindings;
	protected final Class _class;
	protected final Annotations _classAnnotations;
	protected Creators _creators;
	protected List _fields;
	protected AnnotatedMethodMap _memberMethods;
	protected final ClassIntrospector.MixInResolver _mixInResolver;
	protected transient Boolean _nonStaticInnerClass;
	protected final Class _primaryMixIn;
	protected final List _superTypes;
	protected final JavaType _type;
	protected final TypeFactory _typeFactory;

	static 
	{
	//    0    0:new             #8   <Class AnnotatedClass$Creators>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokestatic    #45  <Method List Collections.emptyList()>
	//    4    8:invokestatic    #45  <Method List Collections.emptyList()>
	//    5   11:invokespecial   #49  <Method void AnnotatedClass$Creators(AnnotatedConstructor, List, List)>
	//    6   14:putstatic       #51  <Field AnnotatedClass$Creators NO_CREATORS>
	//*   7   17:return          
	}
}
