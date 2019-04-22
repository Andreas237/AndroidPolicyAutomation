// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector, AnnotatedClass

public class AnnotatedClassResolver
{

	AnnotatedClassResolver(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_config = mapperconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field MapperConfig _config>
		_type = javatype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field JavaType _type>
		_class = javatype.getRawClass();
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   11   19:putfield        #48  <Field Class _class>
		_mixInResolver = mixinresolver;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #50  <Field ClassIntrospector$MixInResolver _mixInResolver>
		_bindings = javatype.getBindings();
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #54  <Method TypeBindings JavaType.getBindings()>
	//   18   32:putfield        #56  <Field TypeBindings _bindings>
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #62  <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  21   39:ifeq            50
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//   22   42:aload_1         
	//   23   43:invokevirtual   #66  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   24   46:astore_1        
		else
	//*  25   47:goto            52
			mapperconfig = null;
	//   26   50:aconst_null     
	//   27   51:astore_1        
		_intr = ((AnnotationIntrospector) (mapperconfig));
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:putfield        #68  <Field AnnotationIntrospector _intr>
		_primaryMixin = _config.findMixInClassFor(_class);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #38  <Field MapperConfig _config>
	//   34   62:aload_0         
	//   35   63:getfield        #48  <Field Class _class>
	//   36   66:invokevirtual   #72  <Method Class MapperConfig.findMixInClassFor(Class)>
	//   37   69:putfield        #74  <Field Class _primaryMixin>
	//   38   72:return          
	}

	AnnotatedClassResolver(MapperConfig mapperconfig, Class class1, ClassIntrospector.MixInResolver mixinresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_config = mapperconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field MapperConfig _config>
		Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore          4
		_type = null;
	//    7   12:aload_0         
	//    8   13:aconst_null     
	//    9   14:putfield        #40  <Field JavaType _type>
		_class = class1;
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:putfield        #48  <Field Class _class>
		_mixInResolver = mixinresolver;
	//   13   22:aload_0         
	//   14   23:aload_3         
	//   15   24:putfield        #50  <Field ClassIntrospector$MixInResolver _mixInResolver>
		_bindings = TypeBindings.emptyBindings();
	//   16   27:aload_0         
	//   17   28:invokestatic    #82  <Method TypeBindings TypeBindings.emptyBindings()>
	//   18   31:putfield        #56  <Field TypeBindings _bindings>
		if(mapperconfig == null)
	//*  19   34:aload_1         
	//*  20   35:ifnonnull       49
		{
			_intr = null;
	//   21   38:aload_0         
	//   22   39:aconst_null     
	//   23   40:putfield        #68  <Field AnnotationIntrospector _intr>
			_primaryMixin = null;
	//   24   43:aload_0         
	//   25   44:aconst_null     
	//   26   45:putfield        #74  <Field Class _primaryMixin>
			return;
	//   27   48:return          
		}
		class1 = ((Class) (obj));
	//   28   49:aload           4
	//   29   51:astore_2        
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*  30   52:aload_1         
	//*  31   53:invokevirtual   #62  <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  32   56:ifeq            64
			class1 = ((Class) (mapperconfig.getAnnotationIntrospector()));
	//   33   59:aload_1         
	//   34   60:invokevirtual   #66  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   35   63:astore_2        
		_intr = ((AnnotationIntrospector) (class1));
	//   36   64:aload_0         
	//   37   65:aload_2         
	//   38   66:putfield        #68  <Field AnnotationIntrospector _intr>
		_primaryMixin = _config.findMixInClassFor(_class);
	//   39   69:aload_0         
	//   40   70:aload_0         
	//   41   71:getfield        #38  <Field MapperConfig _config>
	//   42   74:aload_0         
	//   43   75:getfield        #48  <Field Class _class>
	//   44   78:invokevirtual   #72  <Method Class MapperConfig.findMixInClassFor(Class)>
	//   45   81:putfield        #74  <Field Class _primaryMixin>
	//   46   84:return          
	}

	private AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector annotationcollector, Annotation aannotation[])
	{
		AnnotationCollector annotationcollector1 = annotationcollector;
	//    0    0:aload_1         
	//    1    1:astore          5
		if(aannotation != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          80
		{
			int j = aannotation.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore          4
			int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_3        
			do
			{
				annotationcollector1 = annotationcollector;
	//    9   13:aload_1         
	//   10   14:astore          5
				if(i >= j)
					break;
	//   11   16:iload_3         
	//   12   17:iload           4
	//   13   19:icmpge          80
				Annotation annotation = aannotation[i];
	//   14   22:aload_2         
	//   15   23:iload_3         
	//   16   24:aaload          
	//   17   25:astore          6
				annotationcollector1 = annotationcollector;
	//   18   27:aload_1         
	//   19   28:astore          5
				if(!annotationcollector.isPresent(annotation))
	//*  20   30:aload_1         
	//*  21   31:aload           6
	//*  22   33:invokevirtual   #89  <Method boolean AnnotationCollector.isPresent(Annotation)>
	//*  23   36:ifne            70
				{
					annotationcollector = annotationcollector.addOrOverride(annotation);
	//   24   39:aload_1         
	//   25   40:aload           6
	//   26   42:invokevirtual   #93  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   27   45:astore_1        
					annotationcollector1 = annotationcollector;
	//   28   46:aload_1         
	//   29   47:astore          5
					if(_intr.isAnnotationBundle(annotation))
	//*  30   49:aload_0         
	//*  31   50:getfield        #68  <Field AnnotationIntrospector _intr>
	//*  32   53:aload           6
	//*  33   55:invokevirtual   #98  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  34   58:ifeq            70
						annotationcollector1 = _addFromBundleIfNotPresent(annotationcollector, annotation);
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:aload           6
	//   38   65:invokespecial   #102 <Method AnnotationCollector _addFromBundleIfNotPresent(AnnotationCollector, Annotation)>
	//   39   68:astore          5
				}
				i++;
	//   40   70:iload_3         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_3        
				annotationcollector = annotationcollector1;
	//   44   74:aload           5
	//   45   76:astore_1        
			} while(true);
	//   46   77:goto            13
		}
		return annotationcollector1;
	//   47   80:aload           5
	//   48   82:areturn         
	}

	private AnnotationCollector _addClassMixIns(AnnotationCollector annotationcollector, Class class1, Class class2)
	{
		AnnotationCollector annotationcollector1 = annotationcollector;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(class2 != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          62
		{
			annotationcollector = _addAnnotationsIfNotPresent(annotationcollector, ClassUtil.findClassAnnotations(class2));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_3         
	//    7   10:invokestatic    #110 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//    8   13:invokespecial   #112 <Method AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector, Annotation[])>
	//    9   16:astore_1        
			class1 = ((Class) (ClassUtil.findSuperClasses(class2, class1, false).iterator()));
	//   10   17:aload_3         
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:invokestatic    #116 <Method List ClassUtil.findSuperClasses(Class, Class, boolean)>
	//   14   23:invokeinterface #122 <Method Iterator List.iterator()>
	//   15   28:astore_2        
			do
			{
				annotationcollector1 = annotationcollector;
	//   16   29:aload_1         
	//   17   30:astore          4
				if(!((Iterator) (class1)).hasNext())
					break;
	//   18   32:aload_2         
	//   19   33:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//   20   38:ifeq            62
				annotationcollector = _addAnnotationsIfNotPresent(annotationcollector, ClassUtil.findClassAnnotations((Class)((Iterator) (class1)).next()));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokeinterface #131 <Method Object Iterator.next()>
	//   25   49:checkcast       #133 <Class Class>
	//   26   52:invokestatic    #110 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//   27   55:invokespecial   #112 <Method AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector, Annotation[])>
	//   28   58:astore_1        
			} while(true);
	//   29   59:goto            29
		}
		return annotationcollector1;
	//   30   62:aload           4
	//   31   64:areturn         
	}

	private AnnotationCollector _addFromBundleIfNotPresent(AnnotationCollector annotationcollector, Annotation annotation)
	{
		Annotation aannotation[] = ClassUtil.findClassAnnotations(annotation.annotationType());
	//    0    0:aload_2         
	//    1    1:invokeinterface #139 <Method Class Annotation.annotationType()>
	//    2    6:invokestatic    #110 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//    3    9:astore          5
		int j = aannotation.length;
	//    4   11:aload           5
	//    5   13:arraylength     
	//    6   14:istore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_3        
		for(annotation = ((Annotation) (annotationcollector)); i < j; annotation = ((Annotation) (annotationcollector)))
	//*   9   18:aload_1         
	//*  10   19:astore_2        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          104
		{
			Annotation annotation1 = aannotation[i];
	//   14   26:aload           5
	//   15   28:iload_3         
	//   16   29:aaload          
	//   17   30:astore          6
			annotationcollector = ((AnnotationCollector) (annotation));
	//   18   32:aload_2         
	//   19   33:astore_1        
			if(!(annotation1 instanceof Target))
	//*  20   34:aload           6
	//*  21   36:instanceof      #141 <Class Target>
	//*  22   39:ifne            95
				if(annotation1 instanceof Retention)
	//*  23   42:aload           6
	//*  24   44:instanceof      #143 <Class Retention>
	//*  25   47:ifeq            55
				{
					annotationcollector = ((AnnotationCollector) (annotation));
	//   26   50:aload_2         
	//   27   51:astore_1        
				} else
	//*  28   52:goto            95
				{
					annotationcollector = ((AnnotationCollector) (annotation));
	//   29   55:aload_2         
	//   30   56:astore_1        
					if(!((AnnotationCollector) (annotation)).isPresent(annotation1))
	//*  31   57:aload_2         
	//*  32   58:aload           6
	//*  33   60:invokevirtual   #89  <Method boolean AnnotationCollector.isPresent(Annotation)>
	//*  34   63:ifne            95
					{
						annotation = ((Annotation) (((AnnotationCollector) (annotation)).addOrOverride(annotation1)));
	//   35   66:aload_2         
	//   36   67:aload           6
	//   37   69:invokevirtual   #93  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   38   72:astore_2        
						annotationcollector = ((AnnotationCollector) (annotation));
	//   39   73:aload_2         
	//   40   74:astore_1        
						if(_intr.isAnnotationBundle(annotation1))
	//*  41   75:aload_0         
	//*  42   76:getfield        #68  <Field AnnotationIntrospector _intr>
	//*  43   79:aload           6
	//*  44   81:invokevirtual   #98  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  45   84:ifeq            95
							annotationcollector = _addFromBundleIfNotPresent(((AnnotationCollector) (annotation)), annotation1);
	//   46   87:aload_0         
	//   47   88:aload_2         
	//   48   89:aload           6
	//   49   91:invokespecial   #102 <Method AnnotationCollector _addFromBundleIfNotPresent(AnnotationCollector, Annotation)>
	//   50   94:astore_1        
					}
				}
			i++;
	//   51   95:iload_3         
	//   52   96:iconst_1        
	//   53   97:iadd            
	//   54   98:istore_3        
		}

	//   55   99:aload_1         
	//   56  100:astore_2        
	//*  57  101:goto            20
		return ((AnnotationCollector) (annotation));
	//   58  104:aload_2         
	//   59  105:areturn         
	}

	static AnnotatedClass createArrayType(MapperConfig mapperconfig, Class class1)
	{
		return new AnnotatedClass(class1);
	//    0    0:new             #147 <Class AnnotatedClass>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #150 <Method void AnnotatedClass(Class)>
	//    4    8:areturn         
	}

	static AnnotatedClass createPrimordial(Class class1)
	{
		return new AnnotatedClass(class1);
	//    0    0:new             #147 <Class AnnotatedClass>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #150 <Method void AnnotatedClass(Class)>
	//    4    8:areturn         
	}

	public static AnnotatedClass resolve(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		if(javatype.isArrayType() && skippableArray(mapperconfig, javatype.getRawClass()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #159 <Method boolean JavaType.isArrayType()>
	//*   2    4:ifeq            27
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//*   6   12:invokestatic    #163 <Method boolean skippableArray(MapperConfig, Class)>
	//*   7   15:ifeq            27
			return createArrayType(mapperconfig, javatype.getRawClass());
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   11   23:invokestatic    #165 <Method AnnotatedClass createArrayType(MapperConfig, Class)>
	//   12   26:areturn         
		else
			return (new AnnotatedClassResolver(mapperconfig, javatype, mixinresolver)).resolveFully();
	//   13   27:new             #2   <Class AnnotatedClassResolver>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #167 <Method void AnnotatedClassResolver(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//   19   37:invokevirtual   #171 <Method AnnotatedClass resolveFully()>
	//   20   40:areturn         
	}

	private Annotations resolveClassAnnotations(List list)
	{
		if(_intr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field AnnotationIntrospector _intr>
	//*   2    4:ifnonnull       11
			return NO_ANNOTATIONS;
	//    3    7:getstatic       #31  <Field Annotations NO_ANNOTATIONS>
	//    4   10:areturn         
		Object obj1 = ((Object) (AnnotationCollector.emptyCollector()));
	//    5   11:invokestatic    #178 <Method AnnotationCollector AnnotationCollector.emptyCollector()>
	//    6   14:astore_3        
		Class class1 = _primaryMixin;
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field Class _primaryMixin>
	//    9   19:astore          4
		Object obj = obj1;
	//   10   21:aload_3         
	//   11   22:astore_2        
		if(class1 != null)
	//*  12   23:aload           4
	//*  13   25:ifnull          40
			obj = ((Object) (_addClassMixIns(((AnnotationCollector) (obj1)), _class, class1)));
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:aload_0         
	//   17   31:getfield        #48  <Field Class _class>
	//   18   34:aload           4
	//   19   36:invokespecial   #180 <Method AnnotationCollector _addClassMixIns(AnnotationCollector, Class, Class)>
	//   20   39:astore_2        
		obj = ((Object) (_addAnnotationsIfNotPresent(((AnnotationCollector) (obj)), ClassUtil.findClassAnnotations(_class))));
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:aload_0         
	//   24   43:getfield        #48  <Field Class _class>
	//   25   46:invokestatic    #110 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//   26   49:invokespecial   #112 <Method AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector, Annotation[])>
	//   27   52:astore_2        
		obj1 = ((Object) (list.iterator()));
	//   28   53:aload_1         
	//   29   54:invokeinterface #122 <Method Iterator List.iterator()>
	//   30   59:astore_3        
		JavaType javatype;
		for(list = ((List) (obj)); ((Iterator) (obj1)).hasNext(); list = ((List) (_addAnnotationsIfNotPresent(((AnnotationCollector) (obj)), ClassUtil.findClassAnnotations(javatype.getRawClass())))))
	//*  31   60:aload_2         
	//*  32   61:astore_1        
	//*  33   62:aload_3         
	//*  34   63:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  35   68:ifeq            131
		{
			javatype = (JavaType)((Iterator) (obj1)).next();
	//   36   71:aload_3         
	//   37   72:invokeinterface #131 <Method Object Iterator.next()>
	//   38   77:checkcast       #42  <Class JavaType>
	//   39   80:astore          4
			obj = ((Object) (list));
	//   40   82:aload_1         
	//   41   83:astore_2        
			if(_mixInResolver != null)
	//*  42   84:aload_0         
	//*  43   85:getfield        #50  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*  44   88:ifnull          114
			{
				obj = ((Object) (javatype.getRawClass()));
	//   45   91:aload           4
	//   46   93:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   47   96:astore_2        
				obj = ((Object) (_addClassMixIns(((AnnotationCollector) (list)), ((Class) (obj)), _mixInResolver.findMixInClassFor(((Class) (obj))))));
	//   48   97:aload_0         
	//   49   98:aload_1         
	//   50   99:aload_2         
	//   51  100:aload_0         
	//   52  101:getfield        #50  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   53  104:aload_2         
	//   54  105:invokeinterface #183 <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   55  110:invokespecial   #180 <Method AnnotationCollector _addClassMixIns(AnnotationCollector, Class, Class)>
	//   56  113:astore_2        
			}
		}

	//   57  114:aload_0         
	//   58  115:aload_2         
	//   59  116:aload           4
	//   60  118:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   61  121:invokestatic    #110 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//   62  124:invokespecial   #112 <Method AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector, Annotation[])>
	//   63  127:astore_1        
	//*  64  128:goto            62
		obj1 = ((Object) (_mixInResolver));
	//   65  131:aload_0         
	//   66  132:getfield        #50  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   67  135:astore_3        
		obj = ((Object) (list));
	//   68  136:aload_1         
	//   69  137:astore_2        
		if(obj1 != null)
	//*  70  138:aload_3         
	//*  71  139:ifnull          158
			obj = ((Object) (_addClassMixIns(((AnnotationCollector) (list)), java/lang/Object, ((ClassIntrospector.MixInResolver) (obj1)).findMixInClassFor(java/lang/Object))));
	//   72  142:aload_0         
	//   73  143:aload_1         
	//   74  144:ldc1            #4   <Class Object>
	//   75  146:aload_3         
	//   76  147:ldc1            #4   <Class Object>
	//   77  149:invokeinterface #183 <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   78  154:invokespecial   #180 <Method AnnotationCollector _addClassMixIns(AnnotationCollector, Class, Class)>
	//   79  157:astore_2        
		return ((AnnotationCollector) (obj)).asAnnotations();
	//   80  158:aload_2         
	//   81  159:invokevirtual   #186 <Method Annotations AnnotationCollector.asAnnotations()>
	//   82  162:areturn         
	}

	public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig mapperconfig, Class class1)
	{
		return resolveWithoutSuperTypes(mapperconfig, class1, ((ClassIntrospector.MixInResolver) (mapperconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #191 <Method AnnotatedClass resolveWithoutSuperTypes(MapperConfig, Class, ClassIntrospector$MixInResolver)>
	//    4    6:areturn         
	}

	public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig mapperconfig, Class class1, ClassIntrospector.MixInResolver mixinresolver)
	{
		if(class1.isArray() && skippableArray(mapperconfig, class1))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #194 <Method boolean Class.isArray()>
	//*   2    4:ifeq            21
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokestatic    #163 <Method boolean skippableArray(MapperConfig, Class)>
	//*   6   12:ifeq            21
			return createArrayType(mapperconfig, class1);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #165 <Method AnnotatedClass createArrayType(MapperConfig, Class)>
	//   10   20:areturn         
		else
			return (new AnnotatedClassResolver(mapperconfig, class1, mixinresolver)).resolveWithoutSuperTypes();
	//   11   21:new             #2   <Class AnnotatedClassResolver>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokespecial   #196 <Method void AnnotatedClassResolver(MapperConfig, Class, ClassIntrospector$MixInResolver)>
	//   17   31:invokevirtual   #198 <Method AnnotatedClass resolveWithoutSuperTypes()>
	//   18   34:areturn         
	}

	private static boolean skippableArray(MapperConfig mapperconfig, Class class1)
	{
		return mapperconfig == null || mapperconfig.findMixInClassFor(class1) == null;
	//    0    0:aload_0         
	//    1    1:ifnull          17
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #72  <Method Class MapperConfig.findMixInClassFor(Class)>
	//    5    9:ifnonnull       15
	//    6   12:goto            17
	//    7   15:iconst_0        
	//    8   16:ireturn         
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	AnnotatedClass resolveFully()
	{
		List list = ClassUtil.findSuperTypes(_type, ((Class) (null)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JavaType _type>
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:invokestatic    #204 <Method List ClassUtil.findSuperTypes(JavaType, Class, boolean)>
	//    5    9:astore_1        
		return new AnnotatedClass(_type, _class, list, _primaryMixin, resolveClassAnnotations(list), _bindings, _intr, _mixInResolver, _config.getTypeFactory());
	//    6   10:new             #147 <Class AnnotatedClass>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field JavaType _type>
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field Class _class>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #74  <Field Class _primaryMixin>
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #206 <Method Annotations resolveClassAnnotations(List)>
	//   18   32:aload_0         
	//   19   33:getfield        #56  <Field TypeBindings _bindings>
	//   20   36:aload_0         
	//   21   37:getfield        #68  <Field AnnotationIntrospector _intr>
	//   22   40:aload_0         
	//   23   41:getfield        #50  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   24   44:aload_0         
	//   25   45:getfield        #38  <Field MapperConfig _config>
	//   26   48:invokevirtual   #210 <Method com.fasterxml.jackson.databind.type.TypeFactory MapperConfig.getTypeFactory()>
	//   27   51:invokespecial   #213 <Method void AnnotatedClass(JavaType, Class, List, Class, Annotations, TypeBindings, AnnotationIntrospector, ClassIntrospector$MixInResolver, com.fasterxml.jackson.databind.type.TypeFactory)>
	//   28   54:areturn         
	}

	AnnotatedClass resolveWithoutSuperTypes()
	{
		List list = Collections.emptyList();
	//    0    0:invokestatic    #219 <Method List Collections.emptyList()>
	//    1    3:astore_1        
		Class class1 = _class;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Class _class>
	//    4    8:astore_2        
		Class class2 = _primaryMixin;
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field Class _primaryMixin>
	//    7   13:astore_3        
		Annotations annotations = resolveClassAnnotations(list);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #206 <Method Annotations resolveClassAnnotations(List)>
	//   11   19:astore          4
		TypeBindings typebindings = _bindings;
	//   12   21:aload_0         
	//   13   22:getfield        #56  <Field TypeBindings _bindings>
	//   14   25:astore          5
		AnnotationIntrospector annotationintrospector = _intr;
	//   15   27:aload_0         
	//   16   28:getfield        #68  <Field AnnotationIntrospector _intr>
	//   17   31:astore          6
		MapperConfig mapperconfig = _config;
	//   18   33:aload_0         
	//   19   34:getfield        #38  <Field MapperConfig _config>
	//   20   37:astore          7
		return new AnnotatedClass(((JavaType) (null)), class1, list, class2, annotations, typebindings, annotationintrospector, ((ClassIntrospector.MixInResolver) (mapperconfig)), mapperconfig.getTypeFactory());
	//   21   39:new             #147 <Class AnnotatedClass>
	//   22   42:dup             
	//   23   43:aconst_null     
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:aload_3         
	//   27   47:aload           4
	//   28   49:aload           5
	//   29   51:aload           6
	//   30   53:aload           7
	//   31   55:aload           7
	//   32   57:invokevirtual   #210 <Method com.fasterxml.jackson.databind.type.TypeFactory MapperConfig.getTypeFactory()>
	//   33   60:invokespecial   #213 <Method void AnnotatedClass(JavaType, Class, List, Class, Annotations, TypeBindings, AnnotationIntrospector, ClassIntrospector$MixInResolver, com.fasterxml.jackson.databind.type.TypeFactory)>
	//   34   63:areturn         
	}

	private static final Annotations NO_ANNOTATIONS = AnnotationCollector.emptyAnnotations();
	private final TypeBindings _bindings;
	private final Class _class;
	private final MapperConfig _config;
	private final AnnotationIntrospector _intr;
	private final ClassIntrospector.MixInResolver _mixInResolver;
	private final Class _primaryMixin;
	private final JavaType _type;

	static 
	{
	//    0    0:invokestatic    #29  <Method Annotations AnnotationCollector.emptyAnnotations()>
	//    1    3:putstatic       #31  <Field Annotations NO_ANNOTATIONS>
	//*   2    6:return          
	}
}
