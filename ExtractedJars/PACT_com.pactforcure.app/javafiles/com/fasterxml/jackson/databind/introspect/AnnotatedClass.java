// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			Annotated, TypeResolutionContext, AnnotationMap, AnnotatedMember, 
//			AnnotatedMethodMap, AnnotatedMethod, MemberKey, AnnotatedConstructor, 
//			AnnotatedField

public final class AnnotatedClass extends Annotated
	implements TypeResolutionContext
{

	private AnnotatedClass(JavaType javatype, Class class1, TypeBindings typebindings, List list, AnnotationIntrospector annotationintrospector, ClassIntrospector.MixInResolver mixinresolver, TypeFactory typefactory, 
			AnnotationMap annotationmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Annotated()>
		_creatorsResolved = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #52  <Field boolean _creatorsResolved>
		_type = javatype;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #54  <Field JavaType _type>
		_class = class1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #56  <Field Class _class>
		_bindings = typebindings;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #58  <Field TypeBindings _bindings>
		_superTypes = list;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #60  <Field List _superTypes>
		_annotationIntrospector = annotationintrospector;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
		_typeFactory = typefactory;
	//   20   36:aload_0         
	//   21   37:aload           7
	//   22   39:putfield        #64  <Field TypeFactory _typeFactory>
		_mixInResolver = mixinresolver;
	//   23   42:aload_0         
	//   24   43:aload           6
	//   25   45:putfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
		if(_mixInResolver == null)
	//*  26   48:aload_0         
	//*  27   49:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*  28   52:ifnonnull       69
			javatype = null;
	//   29   55:aconst_null     
	//   30   56:astore_1        
		else
	//*  31   57:aload_0         
	//*  32   58:aload_1         
	//*  33   59:putfield        #68  <Field Class _primaryMixIn>
	//*  34   62:aload_0         
	//*  35   63:aload           8
	//*  36   65:putfield        #70  <Field AnnotationMap _classAnnotations>
	//*  37   68:return          
			javatype = ((JavaType) (_mixInResolver.findMixInClassFor(_class)));
	//   38   69:aload_0         
	//   39   70:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   40   73:aload_0         
	//   41   74:getfield        #56  <Field Class _class>
	//   42   77:invokeinterface #76  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   43   82:astore_1        
		_primaryMixIn = ((Class) (javatype));
		_classAnnotations = annotationmap;
	//*  44   83:goto            57
	}

	private AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap annotationmap, Annotation aannotation[])
	{
		if(aannotation != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          102
		{
			List list = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
			int j = aannotation.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore          4
			for(int i = 0; i < j;)
	//*   7   11:iconst_0        
	//*   8   12:istore_3        
	//*   9   13:iload_3         
	//*  10   14:iload           4
	//*  11   16:icmpge          71
			{
				Annotation annotation = aannotation[i];
	//   12   19:aload_2         
	//   13   20:iload_3         
	//   14   21:aaload          
	//   15   22:astore          7
				List list1 = list;
	//   16   24:aload           5
	//   17   26:astore          6
				if(annotationmap.addIfNotPresent(annotation))
	//*  18   28:aload_1         
	//*  19   29:aload           7
	//*  20   31:invokevirtual   #84  <Method boolean AnnotationMap.addIfNotPresent(Annotation)>
	//*  21   34:ifeq            60
				{
					list1 = list;
	//   22   37:aload           5
	//   23   39:astore          6
					if(_isAnnotationBundle(annotation))
	//*  24   41:aload_0         
	//*  25   42:aload           7
	//*  26   44:invokespecial   #87  <Method boolean _isAnnotationBundle(Annotation)>
	//*  27   47:ifeq            60
						list1 = _addFromBundle(annotation, list);
	//   28   50:aload_0         
	//   29   51:aload           7
	//   30   53:aload           5
	//   31   55:invokespecial   #91  <Method List _addFromBundle(Annotation, List)>
	//   32   58:astore          6
				}
				i++;
	//   33   60:iload_3         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_3        
				list = list1;
	//   37   64:aload           6
	//   38   66:astore          5
			}

	//*  39   68:goto            13
			if(list != null)
	//*  40   71:aload           5
	//*  41   73:ifnull          102
				_addAnnotationsIfNotPresent(annotationmap, (Annotation[])list.toArray(((Object []) (new Annotation[list.size()]))));
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:aload           5
	//   45   80:aload           5
	//   46   82:invokeinterface #97  <Method int List.size()>
	//   47   87:anewarray       Annotation[]
	//   48   90:invokeinterface #103 <Method Object[] List.toArray(Object[])>
	//   49   95:checkcast       #105 <Class Annotation[]>
	//   50   98:invokespecial   #107 <Method AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap, Annotation[])>
	//   51  101:pop             
		}
		return annotationmap;
	//   52  102:aload_1         
	//   53  103:areturn         
	}

	private void _addAnnotationsIfNotPresent(AnnotatedMember annotatedmember, Annotation aannotation[])
	{
		if(aannotation != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          101
		{
			List list = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
			int j = aannotation.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore          4
			for(int i = 0; i < j;)
	//*   7   11:iconst_0        
	//*   8   12:istore_3        
	//*   9   13:iload_3         
	//*  10   14:iload           4
	//*  11   16:icmpge          71
			{
				Annotation annotation = aannotation[i];
	//   12   19:aload_2         
	//   13   20:iload_3         
	//   14   21:aaload          
	//   15   22:astore          7
				List list1 = list;
	//   16   24:aload           5
	//   17   26:astore          6
				if(annotatedmember.addIfNotPresent(annotation))
	//*  18   28:aload_1         
	//*  19   29:aload           7
	//*  20   31:invokevirtual   #111 <Method boolean AnnotatedMember.addIfNotPresent(Annotation)>
	//*  21   34:ifeq            60
				{
					list1 = list;
	//   22   37:aload           5
	//   23   39:astore          6
					if(_isAnnotationBundle(annotation))
	//*  24   41:aload_0         
	//*  25   42:aload           7
	//*  26   44:invokespecial   #87  <Method boolean _isAnnotationBundle(Annotation)>
	//*  27   47:ifeq            60
						list1 = _addFromBundle(annotation, list);
	//   28   50:aload_0         
	//   29   51:aload           7
	//   30   53:aload           5
	//   31   55:invokespecial   #91  <Method List _addFromBundle(Annotation, List)>
	//   32   58:astore          6
				}
				i++;
	//   33   60:iload_3         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_3        
				list = list1;
	//   37   64:aload           6
	//   38   66:astore          5
			}

	//*  39   68:goto            13
			if(list != null)
	//*  40   71:aload           5
	//*  41   73:ifnull          101
				_addAnnotationsIfNotPresent(annotatedmember, (Annotation[])list.toArray(((Object []) (new Annotation[list.size()]))));
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:aload           5
	//   45   80:aload           5
	//   46   82:invokeinterface #97  <Method int List.size()>
	//   47   87:anewarray       Annotation[]
	//   48   90:invokeinterface #103 <Method Object[] List.toArray(Object[])>
	//   49   95:checkcast       #105 <Class Annotation[]>
	//   50   98:invokespecial   #113 <Method void _addAnnotationsIfNotPresent(AnnotatedMember, Annotation[])>
		}
	//   51  101:return          
	}

	private List _addFromBundle(Annotation annotation, List list)
	{
		Annotation aannotation[] = ClassUtil.findClassAnnotations(annotation.annotationType());
	//    0    0:aload_1         
	//    1    1:invokeinterface #117 <Method Class Annotation.annotationType()>
	//    2    6:invokestatic    #123 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//    3    9:astore          5
		int j = aannotation.length;
	//    4   11:aload           5
	//    5   13:arraylength     
	//    6   14:istore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_3        
		while(i < j) 
	//*   9   18:iload_3         
	//*  10   19:iload           4
	//*  11   21:icmpge          85
		{
			Annotation annotation1 = aannotation[i];
	//   12   24:aload           5
	//   13   26:iload_3         
	//   14   27:aaload          
	//   15   28:astore          6
			annotation = ((Annotation) (list));
	//   16   30:aload_2         
	//   17   31:astore_1        
			if(!(annotation1 instanceof Target))
	//*  18   32:aload           6
	//*  19   34:instanceof      #125 <Class Target>
	//*  20   37:ifne            50
				if(annotation1 instanceof Retention)
	//*  21   40:aload           6
	//*  22   42:instanceof      #127 <Class Retention>
	//*  23   45:ifeq            59
				{
					annotation = ((Annotation) (list));
	//   24   48:aload_2         
	//   25   49:astore_1        
				} else
	//*  26   50:iload_3         
	//*  27   51:iconst_1        
	//*  28   52:iadd            
	//*  29   53:istore_3        
	//*  30   54:aload_1         
	//*  31   55:astore_2        
	//*  32   56:goto            18
				{
					annotation = ((Annotation) (list));
	//   33   59:aload_2         
	//   34   60:astore_1        
					if(list == null)
	//*  35   61:aload_2         
	//*  36   62:ifnonnull       73
						annotation = ((Annotation) (new ArrayList()));
	//   37   65:new             #129 <Class ArrayList>
	//   38   68:dup             
	//   39   69:invokespecial   #130 <Method void ArrayList()>
	//   40   72:astore_1        
					((List) (annotation)).add(((Object) (annotation1)));
	//   41   73:aload_1         
	//   42   74:aload           6
	//   43   76:invokeinterface #134 <Method boolean List.add(Object)>
	//   44   81:pop             
				}
			i++;
			list = ((List) (annotation));
		}
	//*  45   82:goto            50
		return list;
	//   46   85:aload_2         
	//   47   86:areturn         
	}

	private void _addOrOverrideAnnotations(AnnotatedMember annotatedmember, Annotation aannotation[])
	{
		if(aannotation != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          101
		{
			List list = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
			int j = aannotation.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore          4
			for(int i = 0; i < j;)
	//*   7   11:iconst_0        
	//*   8   12:istore_3        
	//*   9   13:iload_3         
	//*  10   14:iload           4
	//*  11   16:icmpge          71
			{
				Annotation annotation = aannotation[i];
	//   12   19:aload_2         
	//   13   20:iload_3         
	//   14   21:aaload          
	//   15   22:astore          7
				List list1 = list;
	//   16   24:aload           5
	//   17   26:astore          6
				if(annotatedmember.addOrOverride(annotation))
	//*  18   28:aload_1         
	//*  19   29:aload           7
	//*  20   31:invokevirtual   #139 <Method boolean AnnotatedMember.addOrOverride(Annotation)>
	//*  21   34:ifeq            60
				{
					list1 = list;
	//   22   37:aload           5
	//   23   39:astore          6
					if(_isAnnotationBundle(annotation))
	//*  24   41:aload_0         
	//*  25   42:aload           7
	//*  26   44:invokespecial   #87  <Method boolean _isAnnotationBundle(Annotation)>
	//*  27   47:ifeq            60
						list1 = _addFromBundle(annotation, list);
	//   28   50:aload_0         
	//   29   51:aload           7
	//   30   53:aload           5
	//   31   55:invokespecial   #91  <Method List _addFromBundle(Annotation, List)>
	//   32   58:astore          6
				}
				i++;
	//   33   60:iload_3         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_3        
				list = list1;
	//   37   64:aload           6
	//   38   66:astore          5
			}

	//*  39   68:goto            13
			if(list != null)
	//*  40   71:aload           5
	//*  41   73:ifnull          101
				_addOrOverrideAnnotations(annotatedmember, (Annotation[])list.toArray(((Object []) (new Annotation[list.size()]))));
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:aload           5
	//   45   80:aload           5
	//   46   82:invokeinterface #97  <Method int List.size()>
	//   47   87:anewarray       Annotation[]
	//   48   90:invokeinterface #103 <Method Object[] List.toArray(Object[])>
	//   49   95:checkcast       #105 <Class Annotation[]>
	//   50   98:invokespecial   #141 <Method void _addOrOverrideAnnotations(AnnotatedMember, Annotation[])>
		}
	//   51  101:return          
	}

	private AnnotationMap _classAnnotations()
	{
		Object obj;
		obj = ((Object) (_classAnnotations));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AnnotationMap _classAnnotations>
	//    2    4:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_41;
	//    3    5:aload_1         
	//    4    6:ifnonnull       41
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		AnnotationMap annotationmap = _classAnnotations;
	//    7   11:aload_0         
	//    8   12:getfield        #70  <Field AnnotationMap _classAnnotations>
	//    9   15:astore_2        
		obj = ((Object) (annotationmap));
	//   10   16:aload_2         
	//   11   17:astore_1        
		if(annotationmap != null)
			break MISSING_BLOCK_LABEL_32;
	//   12   18:aload_2         
	//   13   19:ifnonnull       32
		obj = ((Object) (_resolveClassAnnotations()));
	//   14   22:aload_0         
	//   15   23:invokespecial   #145 <Method AnnotationMap _resolveClassAnnotations()>
	//   16   26:astore_1        
		_classAnnotations = ((AnnotationMap) (obj));
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:putfield        #70  <Field AnnotationMap _classAnnotations>
		this;
	//   20   32:aload_0         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		return ((AnnotationMap) (obj));
	//   22   34:aload_1         
	//   23   35:areturn         
		obj;
	//   24   36:astore_1        
		this;
	//   25   37:aload_0         
		JVM INSTR monitorexit ;
	//   26   38:monitorexit     
		throw obj;
	//   27   39:aload_1         
	//   28   40:athrow          
		return ((AnnotationMap) (obj));
	//   29   41:aload_1         
	//   30   42:areturn         
	}

	private AnnotationMap _emptyAnnotationMap()
	{
		return new AnnotationMap();
	//    0    0:new             #43  <Class AnnotationMap>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void AnnotationMap()>
	//    3    7:areturn         
	}

	private AnnotationMap[] _emptyAnnotationMaps(int i)
	{
		if(i != 0) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:ifne            10
_L1:
		AnnotationMap aannotationmap[] = NO_ANNOTATION_MAPS;
	//    2    4:getstatic       #45  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//    3    7:astore_3        
_L4:
		return aannotationmap;
	//    4    8:aload_3         
	//    5    9:areturn         
_L2:
		AnnotationMap aannotationmap1[] = new AnnotationMap[i];
	//    6   10:iload_1         
	//    7   11:anewarray       AnnotationMap[]
	//    8   14:astore          4
		int j = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
		do
		{
			aannotationmap = aannotationmap1;
	//   11   18:aload           4
	//   12   20:astore_3        
			if(j >= i)
				continue;
	//   13   21:iload_2         
	//   14   22:iload_1         
	//   15   23:icmpge          8
			aannotationmap1[j] = _emptyAnnotationMap();
	//   16   26:aload           4
	//   17   28:iload_2         
	//   18   29:aload_0         
	//   19   30:invokespecial   #151 <Method AnnotationMap _emptyAnnotationMap()>
	//   20   33:aastore         
			j++;
	//   21   34:iload_2         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_2        
		} while(true);
	//   25   38:goto            18
		if(true) goto _L4; else goto _L3
_L3:
	}

	private final boolean _isAnnotationBundle(Annotation annotation)
	{
		return _annotationIntrospector != null && _annotationIntrospector.isAnnotationBundle(annotation);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #156 <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private boolean _isIncludableConstructor(Constructor constructor)
	{
		return !constructor.isSynthetic();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #164 <Method boolean Constructor.isSynthetic()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private boolean _isIncludableField(Field field)
	{
		while(field.isSynthetic() || Modifier.isStatic(field.getModifiers())) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #170 <Method boolean Field.isSynthetic()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #173 <Method int Field.getModifiers()>
	//    7   13:invokestatic    #179 <Method boolean Modifier.isStatic(int)>
	//    8   16:ifne            7
		return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private AnnotationMap _resolveClassAnnotations()
	{
		AnnotationMap annotationmap = new AnnotationMap();
	//    0    0:new             #43  <Class AnnotationMap>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void AnnotationMap()>
	//    3    7:astore_1        
		if(_annotationIntrospector != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*   6   12:ifnull          106
		{
			if(_primaryMixIn != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #68  <Field Class _primaryMixIn>
	//*   9   19:ifnull          35
				_addClassMixIns(annotationmap, _class, _primaryMixIn);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field Class _class>
	//   14   28:aload_0         
	//   15   29:getfield        #68  <Field Class _primaryMixIn>
	//   16   32:invokevirtual   #183 <Method void _addClassMixIns(AnnotationMap, Class, Class)>
			_addAnnotationsIfNotPresent(annotationmap, ClassUtil.findClassAnnotations(_class));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #56  <Field Class _class>
	//   21   41:invokestatic    #123 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//   22   44:invokespecial   #107 <Method AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap, Annotation[])>
	//   23   47:pop             
			JavaType javatype;
			for(Iterator iterator = _superTypes.iterator(); iterator.hasNext(); _addAnnotationsIfNotPresent(annotationmap, ClassUtil.findClassAnnotations(javatype.getRawClass())))
	//*  24   48:aload_0         
	//*  25   49:getfield        #60  <Field List _superTypes>
	//*  26   52:invokeinterface #187 <Method Iterator List.iterator()>
	//*  27   57:astore_2        
	//*  28   58:aload_2         
	//*  29   59:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*  30   64:ifeq            99
			{
				javatype = (JavaType)iterator.next();
	//   31   67:aload_2         
	//   32   68:invokeinterface #196 <Method Object Iterator.next()>
	//   33   73:checkcast       #198 <Class JavaType>
	//   34   76:astore_3        
				_addClassMixIns(annotationmap, javatype);
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:aload_3         
	//   38   80:invokevirtual   #201 <Method void _addClassMixIns(AnnotationMap, JavaType)>
			}

	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:aload_3         
	//   42   86:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//   43   89:invokestatic    #123 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//   44   92:invokespecial   #107 <Method AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap, Annotation[])>
	//   45   95:pop             
	//*  46   96:goto            58
			_addClassMixIns(annotationmap, java/lang/Object);
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:ldc1            #206 <Class Object>
	//   50  103:invokevirtual   #209 <Method void _addClassMixIns(AnnotationMap, Class)>
		}
		return annotationmap;
	//   51  106:aload_1         
	//   52  107:areturn         
	}

	public static AnnotatedClass construct(JavaType javatype, MapperConfig mapperconfig)
	{
		AnnotationIntrospector annotationintrospector;
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #216 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*   2    4:ifeq            42
			annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #220 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5   11:astore_2        
		else
	//*   6   12:new             #2   <Class AnnotatedClass>
	//*   7   15:dup             
	//*   8   16:aload_0         
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #224 <Method TypeBindings JavaType.getBindings()>
	//*  13   25:aload_0         
	//*  14   26:aconst_null     
	//*  15   27:iconst_0        
	//*  16   28:invokestatic    #228 <Method List ClassUtil.findSuperTypes(JavaType, Class, boolean)>
	//*  17   31:aload_2         
	//*  18   32:aload_1         
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #232 <Method TypeFactory MapperConfig.getTypeFactory()>
	//*  21   37:aconst_null     
	//*  22   38:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//*  23   41:areturn         
			annotationintrospector = null;
	//   24   42:aconst_null     
	//   25   43:astore_2        
		return new AnnotatedClass(javatype, javatype.getRawClass(), javatype.getBindings(), ClassUtil.findSuperTypes(javatype, ((Class) (null)), false), annotationintrospector, ((ClassIntrospector.MixInResolver) (mapperconfig)), mapperconfig.getTypeFactory(), ((AnnotationMap) (null)));
	//*  26   44:goto            12
	}

	public static AnnotatedClass construct(JavaType javatype, MapperConfig mapperconfig, ClassIntrospector.MixInResolver mixinresolver)
	{
		AnnotationIntrospector annotationintrospector;
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #216 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*   2    4:ifeq            42
			annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #220 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5   11:astore_3        
		else
	//*   6   12:new             #2   <Class AnnotatedClass>
	//*   7   15:dup             
	//*   8   16:aload_0         
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #224 <Method TypeBindings JavaType.getBindings()>
	//*  13   25:aload_0         
	//*  14   26:aconst_null     
	//*  15   27:iconst_0        
	//*  16   28:invokestatic    #228 <Method List ClassUtil.findSuperTypes(JavaType, Class, boolean)>
	//*  17   31:aload_3         
	//*  18   32:aload_2         
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #232 <Method TypeFactory MapperConfig.getTypeFactory()>
	//*  21   37:aconst_null     
	//*  22   38:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//*  23   41:areturn         
			annotationintrospector = null;
	//   24   42:aconst_null     
	//   25   43:astore_3        
		return new AnnotatedClass(javatype, javatype.getRawClass(), javatype.getBindings(), ClassUtil.findSuperTypes(javatype, ((Class) (null)), false), annotationintrospector, mixinresolver, mapperconfig.getTypeFactory(), ((AnnotationMap) (null)));
	//*  26   44:goto            12
	}

	public static AnnotatedClass constructWithoutSuperTypes(Class class1, MapperConfig mapperconfig)
	{
		if(mapperconfig == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       24
			return new AnnotatedClass(((JavaType) (null)), class1, TypeBindings.emptyBindings(), Collections.emptyList(), ((AnnotationIntrospector) (null)), ((ClassIntrospector.MixInResolver) (null)), ((TypeFactory) (null)), ((AnnotationMap) (null)));
	//    2    4:new             #2   <Class AnnotatedClass>
	//    3    7:dup             
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:invokestatic    #244 <Method TypeBindings TypeBindings.emptyBindings()>
	//    7   13:invokestatic    #250 <Method List Collections.emptyList()>
	//    8   16:aconst_null     
	//    9   17:aconst_null     
	//   10   18:aconst_null     
	//   11   19:aconst_null     
	//   12   20:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//   13   23:areturn         
		AnnotationIntrospector annotationintrospector;
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #216 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  16   28:ifeq            59
			annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #220 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   19   35:astore_2        
		else
	//*  20   36:new             #2   <Class AnnotatedClass>
	//*  21   39:dup             
	//*  22   40:aconst_null     
	//*  23   41:aload_0         
	//*  24   42:invokestatic    #244 <Method TypeBindings TypeBindings.emptyBindings()>
	//*  25   45:invokestatic    #250 <Method List Collections.emptyList()>
	//*  26   48:aload_2         
	//*  27   49:aload_1         
	//*  28   50:aload_1         
	//*  29   51:invokevirtual   #232 <Method TypeFactory MapperConfig.getTypeFactory()>
	//*  30   54:aconst_null     
	//*  31   55:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//*  32   58:areturn         
			annotationintrospector = null;
	//   33   59:aconst_null     
	//   34   60:astore_2        
		return new AnnotatedClass(((JavaType) (null)), class1, TypeBindings.emptyBindings(), Collections.emptyList(), annotationintrospector, ((ClassIntrospector.MixInResolver) (mapperconfig)), mapperconfig.getTypeFactory(), ((AnnotationMap) (null)));
	//*  35   61:goto            36
	}

	public static AnnotatedClass constructWithoutSuperTypes(Class class1, MapperConfig mapperconfig, ClassIntrospector.MixInResolver mixinresolver)
	{
		if(mapperconfig == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       24
			return new AnnotatedClass(((JavaType) (null)), class1, TypeBindings.emptyBindings(), Collections.emptyList(), ((AnnotationIntrospector) (null)), ((ClassIntrospector.MixInResolver) (null)), ((TypeFactory) (null)), ((AnnotationMap) (null)));
	//    2    4:new             #2   <Class AnnotatedClass>
	//    3    7:dup             
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:invokestatic    #244 <Method TypeBindings TypeBindings.emptyBindings()>
	//    7   13:invokestatic    #250 <Method List Collections.emptyList()>
	//    8   16:aconst_null     
	//    9   17:aconst_null     
	//   10   18:aconst_null     
	//   11   19:aconst_null     
	//   12   20:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//   13   23:areturn         
		AnnotationIntrospector annotationintrospector;
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #216 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  16   28:ifeq            59
			annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #220 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   19   35:astore_3        
		else
	//*  20   36:new             #2   <Class AnnotatedClass>
	//*  21   39:dup             
	//*  22   40:aconst_null     
	//*  23   41:aload_0         
	//*  24   42:invokestatic    #244 <Method TypeBindings TypeBindings.emptyBindings()>
	//*  25   45:invokestatic    #250 <Method List Collections.emptyList()>
	//*  26   48:aload_3         
	//*  27   49:aload_2         
	//*  28   50:aload_1         
	//*  29   51:invokevirtual   #232 <Method TypeFactory MapperConfig.getTypeFactory()>
	//*  30   54:aconst_null     
	//*  31   55:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//*  32   58:areturn         
			annotationintrospector = null;
	//   33   59:aconst_null     
	//   34   60:astore_3        
		return new AnnotatedClass(((JavaType) (null)), class1, TypeBindings.emptyBindings(), Collections.emptyList(), annotationintrospector, mixinresolver, mapperconfig.getTypeFactory(), ((AnnotationMap) (null)));
	//*  35   61:goto            36
	}

	private void resolveCreators()
	{
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		Object aobj[] = ((Object []) (ClassUtil.getConstructors(_class)));
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field Class _class>
	//    4    6:invokestatic    #258 <Method com.fasterxml.jackson.databind.util.ClassUtil$Ctor[] ClassUtil.getConstructors(Class)>
	//    5    9:astore          5
		int k = aobj.length;
	//    6   11:aload           5
	//    7   13:arraylength     
	//    8   14:istore_2        
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_1        
		while(i < k) 
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          117
		{
			com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor = aobj[i];
	//   14   22:aload           5
	//   15   24:iload_1         
	//   16   25:aaload          
	//   17   26:astore          6
			Object obj1 = obj;
	//   18   28:aload_3         
	//   19   29:astore          4
			if(_isIncludableConstructor(ctor.getConstructor()))
	//*  20   31:aload_0         
	//*  21   32:aload           6
	//*  22   34:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//*  23   37:invokespecial   #266 <Method boolean _isIncludableConstructor(Constructor)>
	//*  24   40:ifeq            65
				if(ctor.getParamCount() == 0)
	//*  25   43:aload           6
	//*  26   45:invokevirtual   #269 <Method int com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParamCount()>
	//*  27   48:ifne            75
				{
					_defaultConstructor = _constructDefaultConstructor(ctor, ((TypeResolutionContext) (this)));
	//   28   51:aload_0         
	//   29   52:aload_0         
	//   30   53:aload           6
	//   31   55:aload_0         
	//   32   56:invokevirtual   #273 <Method AnnotatedConstructor _constructDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, TypeResolutionContext)>
	//   33   59:putfield        #275 <Field AnnotatedConstructor _defaultConstructor>
					obj1 = obj;
	//   34   62:aload_3         
	//   35   63:astore          4
				} else
	//*  36   65:iload_1         
	//*  37   66:iconst_1        
	//*  38   67:iadd            
	//*  39   68:istore_1        
	//*  40   69:aload           4
	//*  41   71:astore_3        
	//*  42   72:goto            17
				{
					obj1 = obj;
	//   43   75:aload_3         
	//   44   76:astore          4
					if(obj == null)
	//*  45   78:aload_3         
	//*  46   79:ifnonnull       99
						obj1 = ((Object) (new ArrayList(Math.max(10, aobj.length))));
	//   47   82:new             #129 <Class ArrayList>
	//   48   85:dup             
	//   49   86:bipush          10
	//   50   88:aload           5
	//   51   90:arraylength     
	//   52   91:invokestatic    #281 <Method int Math.max(int, int)>
	//   53   94:invokespecial   #284 <Method void ArrayList(int)>
	//   54   97:astore          4
					((List) (obj1)).add(((Object) (_constructNonDefaultConstructor(ctor, ((TypeResolutionContext) (this))))));
	//   55   99:aload           4
	//   56  101:aload_0         
	//   57  102:aload           6
	//   58  104:aload_0         
	//   59  105:invokevirtual   #287 <Method AnnotatedConstructor _constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, TypeResolutionContext)>
	//   60  108:invokeinterface #134 <Method boolean List.add(Object)>
	//   61  113:pop             
				}
			i++;
			obj = obj1;
		}
	//*  62  114:goto            65
		if(obj == null)
	//*  63  117:aload_3         
	//*  64  118:ifnonnull       261
			_constructors = Collections.emptyList();
	//   65  121:aload_0         
	//   66  122:invokestatic    #250 <Method List Collections.emptyList()>
	//   67  125:putfield        #289 <Field List _constructors>
		else
	//*  68  128:aload_0         
	//*  69  129:getfield        #68  <Field Class _primaryMixIn>
	//*  70  132:ifnull          162
	//*  71  135:aload_0         
	//*  72  136:getfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//*  73  139:ifnonnull       154
	//*  74  142:aload_0         
	//*  75  143:getfield        #289 <Field List _constructors>
	//*  76  146:invokeinterface #292 <Method boolean List.isEmpty()>
	//*  77  151:ifne            162
	//*  78  154:aload_0         
	//*  79  155:aload_0         
	//*  80  156:getfield        #68  <Field Class _primaryMixIn>
	//*  81  159:invokevirtual   #296 <Method void _addConstructorMixIns(Class)>
	//*  82  162:aload_0         
	//*  83  163:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*  84  166:ifnull          269
	//*  85  169:aload_0         
	//*  86  170:getfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//*  87  173:ifnull          195
	//*  88  176:aload_0         
	//*  89  177:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*  90  180:aload_0         
	//*  91  181:getfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//*  92  184:invokevirtual   #300 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//*  93  187:ifeq            195
	//*  94  190:aload_0         
	//*  95  191:aconst_null     
	//*  96  192:putfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//*  97  195:aload_0         
	//*  98  196:getfield        #289 <Field List _constructors>
	//*  99  199:ifnull          269
	//* 100  202:aload_0         
	//* 101  203:getfield        #289 <Field List _constructors>
	//* 102  206:invokeinterface #97  <Method int List.size()>
	//* 103  211:istore_1        
	//* 104  212:iload_1         
	//* 105  213:iconst_1        
	//* 106  214:isub            
	//* 107  215:istore_2        
	//* 108  216:iload_2         
	//* 109  217:iflt            269
	//* 110  220:iload_2         
	//* 111  221:istore_1        
	//* 112  222:aload_0         
	//* 113  223:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//* 114  226:aload_0         
	//* 115  227:getfield        #289 <Field List _constructors>
	//* 116  230:iload_2         
	//* 117  231:invokeinterface #304 <Method Object List.get(int)>
	//* 118  236:checkcast       #110 <Class AnnotatedMember>
	//* 119  239:invokevirtual   #300 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//* 120  242:ifeq            212
	//* 121  245:aload_0         
	//* 122  246:getfield        #289 <Field List _constructors>
	//* 123  249:iload_2         
	//* 124  250:invokeinterface #307 <Method Object List.remove(int)>
	//* 125  255:pop             
	//* 126  256:iload_2         
	//* 127  257:istore_1        
	//* 128  258:goto            212
			_constructors = ((List) (obj));
	//  129  261:aload_0         
	//  130  262:aload_3         
	//  131  263:putfield        #289 <Field List _constructors>
		if(_primaryMixIn != null && (_defaultConstructor != null || !_constructors.isEmpty()))
			_addConstructorMixIns(_primaryMixIn);
		if(_annotationIntrospector != null)
		{
			if(_defaultConstructor != null && _annotationIntrospector.hasIgnoreMarker(((AnnotatedMember) (_defaultConstructor))))
				_defaultConstructor = null;
			if(_constructors != null)
			{
				i = _constructors.size();
				do
				{
					k = i - 1;
					if(k < 0)
						break;
					i = k;
					if(_annotationIntrospector.hasIgnoreMarker((AnnotatedMember)_constructors.get(k)))
					{
						_constructors.remove(k);
						i = k;
					}
				} while(true);
			}
		}
	//* 132  266:goto            128
		obj = null;
	//  133  269:aconst_null     
	//  134  270:astore_3        
		aobj = ((Object []) (_findClassMethods(_class)));
	//  135  271:aload_0         
	//  136  272:aload_0         
	//  137  273:getfield        #56  <Field Class _class>
	//  138  276:invokevirtual   #311 <Method Method[] _findClassMethods(Class)>
	//  139  279:astore          5
		k = aobj.length;
	//  140  281:aload           5
	//  141  283:arraylength     
	//  142  284:istore_2        
		i = 0;
	//  143  285:iconst_0        
	//  144  286:istore_1        
		while(i < k) 
	//* 145  287:iload_1         
	//* 146  288:iload_2         
	//* 147  289:icmpge          355
		{
			Method method = aobj[i];
	//  148  292:aload           5
	//  149  294:iload_1         
	//  150  295:aaload          
	//  151  296:astore          6
			if(Modifier.isStatic(method.getModifiers()))
	//* 152  298:aload           6
	//* 153  300:invokevirtual   #314 <Method int Method.getModifiers()>
	//* 154  303:invokestatic    #179 <Method boolean Modifier.isStatic(int)>
	//* 155  306:ifne            316
	//* 156  309:iload_1         
	//* 157  310:iconst_1        
	//* 158  311:iadd            
	//* 159  312:istore_1        
	//* 160  313:goto            287
			{
				ArrayList arraylist = ((ArrayList) (obj));
	//  161  316:aload_3         
	//  162  317:astore          4
				if(obj == null)
	//* 163  319:aload_3         
	//* 164  320:ifnonnull       334
					arraylist = new ArrayList(8);
	//  165  323:new             #129 <Class ArrayList>
	//  166  326:dup             
	//  167  327:bipush          8
	//  168  329:invokespecial   #284 <Method void ArrayList(int)>
	//  169  332:astore          4
				((List) (arraylist)).add(((Object) (_constructCreatorMethod(method, ((TypeResolutionContext) (this))))));
	//  170  334:aload           4
	//  171  336:aload_0         
	//  172  337:aload           6
	//  173  339:aload_0         
	//  174  340:invokevirtual   #318 <Method AnnotatedMethod _constructCreatorMethod(Method, TypeResolutionContext)>
	//  175  343:invokeinterface #134 <Method boolean List.add(Object)>
	//  176  348:pop             
				obj = ((Object) (arraylist));
	//  177  349:aload           4
	//  178  351:astore_3        
			}
			i++;
		}
	//* 179  352:goto            309
		if(obj != null) goto _L2; else goto _L1
	//  180  355:aload_3         
	//  181  356:ifnonnull       372
_L1:
		_creatorMethods = Collections.emptyList();
	//  182  359:aload_0         
	//  183  360:invokestatic    #250 <Method List Collections.emptyList()>
	//  184  363:putfield        #320 <Field List _creatorMethods>
_L4:
		_creatorsResolved = true;
	//  185  366:aload_0         
	//  186  367:iconst_1        
	//  187  368:putfield        #52  <Field boolean _creatorsResolved>
		return;
	//  188  371:return          
_L2:
		_creatorMethods = ((List) (obj));
	//  189  372:aload_0         
	//  190  373:aload_3         
	//  191  374:putfield        #320 <Field List _creatorMethods>
		if(_primaryMixIn != null)
	//* 192  377:aload_0         
	//* 193  378:getfield        #68  <Field Class _primaryMixIn>
	//* 194  381:ifnull          392
			_addFactoryMixIns(_primaryMixIn);
	//  195  384:aload_0         
	//  196  385:aload_0         
	//  197  386:getfield        #68  <Field Class _primaryMixIn>
	//  198  389:invokevirtual   #323 <Method void _addFactoryMixIns(Class)>
		if(_annotationIntrospector == null)
			continue;
	//  199  392:aload_0         
	//  200  393:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//  201  396:ifnull          366
		int j = _creatorMethods.size();
	//  202  399:aload_0         
	//  203  400:getfield        #320 <Field List _creatorMethods>
	//  204  403:invokeinterface #97  <Method int List.size()>
	//  205  408:istore_1        
		do
		{
			int l = j - 1;
	//  206  409:iload_1         
	//  207  410:iconst_1        
	//  208  411:isub            
	//  209  412:istore_2        
			if(l < 0)
				continue;
	//  210  413:iload_2         
	//  211  414:iflt            366
			j = l;
	//  212  417:iload_2         
	//  213  418:istore_1        
			if(_annotationIntrospector.hasIgnoreMarker((AnnotatedMember)_creatorMethods.get(l)))
	//* 214  419:aload_0         
	//* 215  420:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//* 216  423:aload_0         
	//* 217  424:getfield        #320 <Field List _creatorMethods>
	//* 218  427:iload_2         
	//* 219  428:invokeinterface #304 <Method Object List.get(int)>
	//* 220  433:checkcast       #110 <Class AnnotatedMember>
	//* 221  436:invokevirtual   #300 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//* 222  439:ifeq            409
			{
				_creatorMethods.remove(l);
	//  223  442:aload_0         
	//  224  443:getfield        #320 <Field List _creatorMethods>
	//  225  446:iload_2         
	//  226  447:invokeinterface #307 <Method Object List.remove(int)>
	//  227  452:pop             
				j = l;
	//  228  453:iload_2         
	//  229  454:istore_1        
			}
		} while(true);
	//  230  455:goto            409
		if(true) goto _L4; else goto _L3
_L3:
	}

	private void resolveFields()
	{
		Map map = _findFields(_type, ((TypeResolutionContext) (this)), ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field JavaType _type>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #328 <Method Map _findFields(JavaType, TypeResolutionContext, Map)>
	//    6   10:astore_1        
		if(map == null || map.size() == 0)
	//*   7   11:aload_1         
	//*   8   12:ifnull          24
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #331 <Method int Map.size()>
	//*  11   21:ifne            32
		{
			_fields = Collections.emptyList();
	//   12   24:aload_0         
	//   13   25:invokestatic    #250 <Method List Collections.emptyList()>
	//   14   28:putfield        #333 <Field List _fields>
			return;
	//   15   31:return          
		} else
		{
			_fields = ((List) (new ArrayList(map.size())));
	//   16   32:aload_0         
	//   17   33:new             #129 <Class ArrayList>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokeinterface #331 <Method int Map.size()>
	//   21   43:invokespecial   #284 <Method void ArrayList(int)>
	//   22   46:putfield        #333 <Field List _fields>
			_fields.addAll(map.values());
	//   23   49:aload_0         
	//   24   50:getfield        #333 <Field List _fields>
	//   25   53:aload_1         
	//   26   54:invokeinterface #337 <Method java.util.Collection Map.values()>
	//   27   59:invokeinterface #341 <Method boolean List.addAll(java.util.Collection)>
	//   28   64:pop             
			return;
	//   29   65:return          
		}
	}

	private void resolveMemberMethods()
	{
		Object obj;
		_memberMethods = new AnnotatedMethodMap();
	//    0    0:aload_0         
	//    1    1:new             #346 <Class AnnotatedMethodMap>
	//    2    4:dup             
	//    3    5:invokespecial   #347 <Method void AnnotatedMethodMap()>
	//    4    8:putfield        #349 <Field AnnotatedMethodMap _memberMethods>
		obj = ((Object) (new AnnotatedMethodMap()));
	//    5   11:new             #346 <Class AnnotatedMethodMap>
	//    6   14:dup             
	//    7   15:invokespecial   #347 <Method void AnnotatedMethodMap()>
	//    8   18:astore_2        
		_addMemberMethods(_class, ((TypeResolutionContext) (this)), _memberMethods, _primaryMixIn, ((AnnotatedMethodMap) (obj)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #56  <Field Class _class>
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//   15   29:aload_0         
	//   16   30:getfield        #68  <Field Class _primaryMixIn>
	//   17   33:aload_2         
	//   18   34:invokevirtual   #353 <Method void _addMemberMethods(Class, TypeResolutionContext, AnnotatedMethodMap, Class, AnnotatedMethodMap)>
		Iterator iterator1 = _superTypes.iterator();
	//   19   37:aload_0         
	//   20   38:getfield        #60  <Field List _superTypes>
	//   21   41:invokeinterface #187 <Method Iterator List.iterator()>
	//   22   46:astore_3        
		while(iterator1.hasNext()) 
	//*  23   47:aload_3         
	//*  24   48:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*  25   53:ifeq            132
		{
			JavaType javatype = (JavaType)iterator1.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #196 <Method Object Iterator.next()>
	//   28   62:checkcast       #198 <Class JavaType>
	//   29   65:astore          4
			Class class1;
			TypeResolutionContext.Basic basic;
			if(_mixInResolver == null)
	//*  30   67:aload_0         
	//*  31   68:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*  32   71:ifnonnull       114
				class1 = null;
	//   33   74:aconst_null     
	//   34   75:astore_1        
			else
	//*  35   76:new             #355 <Class TypeResolutionContext$Basic>
	//*  36   79:dup             
	//*  37   80:aload_0         
	//*  38   81:getfield        #64  <Field TypeFactory _typeFactory>
	//*  39   84:aload           4
	//*  40   86:invokevirtual   #224 <Method TypeBindings JavaType.getBindings()>
	//*  41   89:invokespecial   #358 <Method void TypeResolutionContext$Basic(TypeFactory, TypeBindings)>
	//*  42   92:astore          5
	//*  43   94:aload_0         
	//*  44   95:aload           4
	//*  45   97:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//*  46  100:aload           5
	//*  47  102:aload_0         
	//*  48  103:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//*  49  106:aload_1         
	//*  50  107:aload_2         
	//*  51  108:invokevirtual   #353 <Method void _addMemberMethods(Class, TypeResolutionContext, AnnotatedMethodMap, Class, AnnotatedMethodMap)>
	//*  52  111:goto            47
				class1 = _mixInResolver.findMixInClassFor(javatype.getRawClass());
	//   53  114:aload_0         
	//   54  115:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   55  118:aload           4
	//   56  120:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//   57  123:invokeinterface #76  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   58  128:astore_1        
			basic = new TypeResolutionContext.Basic(_typeFactory, javatype.getBindings());
			_addMemberMethods(javatype.getRawClass(), ((TypeResolutionContext) (basic)), _memberMethods, class1, ((AnnotatedMethodMap) (obj)));
		}
	//*  59  129:goto            76
		if(_mixInResolver != null)
	//*  60  132:aload_0         
	//*  61  133:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*  62  136:ifnull          169
		{
			Class class2 = _mixInResolver.findMixInClassFor(java/lang/Object);
	//   63  139:aload_0         
	//   64  140:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   65  143:ldc1            #206 <Class Object>
	//   66  145:invokeinterface #76  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   67  150:astore_1        
			if(class2 != null)
	//*  68  151:aload_1         
	//*  69  152:ifnull          169
				_addMethodMixIns(_class, _memberMethods, class2, ((AnnotatedMethodMap) (obj)));
	//   70  155:aload_0         
	//   71  156:aload_0         
	//   72  157:getfield        #56  <Field Class _class>
	//   73  160:aload_0         
	//   74  161:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//   75  164:aload_1         
	//   76  165:aload_2         
	//   77  166:invokevirtual   #362 <Method void _addMethodMixIns(Class, AnnotatedMethodMap, Class, AnnotatedMethodMap)>
		}
		if(_annotationIntrospector == null || ((AnnotatedMethodMap) (obj)).isEmpty()) goto _L2; else goto _L1
	//   78  169:aload_0         
	//   79  170:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//   80  173:ifnull          257
	//   81  176:aload_2         
	//   82  177:invokevirtual   #363 <Method boolean AnnotatedMethodMap.isEmpty()>
	//   83  180:ifne            257
_L1:
		Iterator iterator = ((AnnotatedMethodMap) (obj)).iterator();
	//   84  183:aload_2         
	//   85  184:invokevirtual   #364 <Method Iterator AnnotatedMethodMap.iterator()>
	//   86  187:astore_1        
_L3:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   87  188:aload_1         
	//   88  189:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   89  194:ifeq            257
		obj = ((Object) ((AnnotatedMethod)iterator.next()));
	//   90  197:aload_1         
	//   91  198:invokeinterface #196 <Method Object Iterator.next()>
	//   92  203:checkcast       #366 <Class AnnotatedMethod>
	//   93  206:astore_2        
		Object obj1 = ((Object) (((Class) (java/lang/Object)).getDeclaredMethod(((AnnotatedMethod) (obj)).getName(), ((AnnotatedMethod) (obj)).getRawParameterTypes())));
	//   94  207:ldc1            #206 <Class Object>
	//   95  209:aload_2         
	//   96  210:invokevirtual   #370 <Method String AnnotatedMethod.getName()>
	//   97  213:aload_2         
	//   98  214:invokevirtual   #374 <Method Class[] AnnotatedMethod.getRawParameterTypes()>
	//   99  217:invokevirtual   #380 <Method Method Class.getDeclaredMethod(String, Class[])>
	//  100  220:astore_3        
		if(obj1 != null)
	//* 101  221:aload_3         
	//* 102  222:ifnull          188
			try
			{
				obj1 = ((Object) (_constructMethod(((Method) (obj1)), ((TypeResolutionContext) (this)))));
	//  103  225:aload_0         
	//  104  226:aload_3         
	//  105  227:aload_0         
	//  106  228:invokevirtual   #383 <Method AnnotatedMethod _constructMethod(Method, TypeResolutionContext)>
	//  107  231:astore_3        
				_addMixOvers(((AnnotatedMethod) (obj)).getAnnotated(), ((AnnotatedMethod) (obj1)), false);
	//  108  232:aload_0         
	//  109  233:aload_2         
	//  110  234:invokevirtual   #387 <Method Method AnnotatedMethod.getAnnotated()>
	//  111  237:aload_3         
	//  112  238:iconst_0        
	//  113  239:invokevirtual   #391 <Method void _addMixOvers(Method, AnnotatedMethod, boolean)>
				_memberMethods.add(((AnnotatedMethod) (obj1)));
	//  114  242:aload_0         
	//  115  243:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//  116  246:aload_3         
	//  117  247:invokevirtual   #394 <Method void AnnotatedMethodMap.add(AnnotatedMethod)>
			}
	//* 118  250:goto            188
			catch(Exception exception) { }
	//  119  253:astore_2        
		if(true) goto _L3; else goto _L2
	//  120  254:goto            188
_L2:
	//  121  257:return          
	}

	protected void _addClassMixIns(AnnotationMap annotationmap, JavaType javatype)
	{
		if(_mixInResolver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*   2    4:ifnull          28
		{
			javatype = ((JavaType) (javatype.getRawClass()));
	//    3    7:aload_2         
	//    4    8:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//    5   11:astore_2        
			_addClassMixIns(annotationmap, ((Class) (javatype)), _mixInResolver.findMixInClassFor(((Class) (javatype))));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   11   19:aload_2         
	//   12   20:invokeinterface #76  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   13   25:invokevirtual   #183 <Method void _addClassMixIns(AnnotationMap, Class, Class)>
		}
	//   14   28:return          
	}

	protected void _addClassMixIns(AnnotationMap annotationmap, Class class1)
	{
		if(_mixInResolver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*   2    4:ifnull          23
			_addClassMixIns(annotationmap, class1, _mixInResolver.findMixInClassFor(class1));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//    8   14:aload_2         
	//    9   15:invokeinterface #76  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   10   20:invokevirtual   #183 <Method void _addClassMixIns(AnnotationMap, Class, Class)>
	//   11   23:return          
	}

	protected void _addClassMixIns(AnnotationMap annotationmap, Class class1, Class class2)
	{
		if(class2 != null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			_addAnnotationsIfNotPresent(annotationmap, ClassUtil.findClassAnnotations(class2));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokestatic    #123 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//    7   11:invokespecial   #107 <Method AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap, Annotation[])>
	//    8   14:pop             
			class1 = ((Class) (ClassUtil.findSuperClasses(class2, class1, false).iterator()));
	//    9   15:aload_3         
	//   10   16:aload_2         
	//   11   17:iconst_0        
	//   12   18:invokestatic    #399 <Method List ClassUtil.findSuperClasses(Class, Class, boolean)>
	//   13   21:invokeinterface #187 <Method Iterator List.iterator()>
	//   14   26:astore_2        
			while(((Iterator) (class1)).hasNext()) 
	//*  15   27:aload_2         
	//*  16   28:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*  17   33:ifeq            4
				_addAnnotationsIfNotPresent(annotationmap, ClassUtil.findClassAnnotations((Class)((Iterator) (class1)).next()));
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokeinterface #196 <Method Object Iterator.next()>
	//   22   44:checkcast       #376 <Class Class>
	//   23   47:invokestatic    #123 <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//   24   50:invokespecial   #107 <Method AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap, Annotation[])>
	//   25   53:pop             
		}
	//*  26   54:goto            27
	}

	protected void _addConstructorMixIns(Class class1)
	{
		int i;
		MemberKey memberkey;
		Class class2;
		Constructor constructor;
		memberkey = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		int j;
		int i1;
		com.fasterxml.jackson.databind.util.ClassUtil.Ctor actor[];
		if(_constructors == null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #289 <Field List _constructors>
	//*   4    7:ifnonnull       86
			i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		else
	//*   7   12:aload_1         
	//*   8   13:invokestatic    #258 <Method com.fasterxml.jackson.databind.util.ClassUtil$Ctor[] ClassUtil.getConstructors(Class)>
	//*   9   16:astore          8
	//*  10   18:aload           8
	//*  11   20:arraylength     
	//*  12   21:istore          5
	//*  13   23:iconst_0        
	//*  14   24:istore_3        
	//*  15   25:iload_3         
	//*  16   26:iload           5
	//*  17   28:icmpge          234
	//*  18   31:aload           8
	//*  19   33:iload_3         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//*  22   38:astore          9
	//*  23   40:aload           9
	//*  24   42:invokevirtual   #403 <Method Class[] Constructor.getParameterTypes()>
	//*  25   45:arraylength     
	//*  26   46:ifne            99
	//*  27   49:aload           6
	//*  28   51:astore          7
	//*  29   53:aload_0         
	//*  30   54:getfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//*  31   57:ifnull          75
	//*  32   60:aload_0         
	//*  33   61:aload           9
	//*  34   63:aload_0         
	//*  35   64:getfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//*  36   67:iconst_0        
	//*  37   68:invokevirtual   #406 <Method void _addMixOvers(Constructor, AnnotatedConstructor, boolean)>
	//*  38   71:aload           6
	//*  39   73:astore          7
	//*  40   75:iload_3         
	//*  41   76:iconst_1        
	//*  42   77:iadd            
	//*  43   78:istore_3        
	//*  44   79:aload           7
	//*  45   81:astore          6
	//*  46   83:goto            25
			i = _constructors.size();
	//   47   86:aload_0         
	//   48   87:getfield        #289 <Field List _constructors>
	//   49   90:invokeinterface #97  <Method int List.size()>
	//   50   95:istore_2        
		actor = ClassUtil.getConstructors(class1);
		i1 = actor.length;
		j = 0;
		if(j >= i1)
			break MISSING_BLOCK_LABEL_234;
		constructor = actor[j].getConstructor();
		if(constructor.getParameterTypes().length != 0)
			break; /* Loop/switch isn't completed */
		class2 = ((Class) (memberkey));
		if(_defaultConstructor != null)
		{
			_addMixOvers(constructor, _defaultConstructor, false);
			class2 = ((Class) (memberkey));
		}
_L4:
		j++;
		memberkey = ((MemberKey) (class2));
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_25;
	//*  51   96:goto            12
_L1:
		int l;
		class1 = ((Class) (memberkey));
	//   52   99:aload           6
	//   53  101:astore_1        
		if(memberkey == null)
	//*  54  102:aload           6
	//*  55  104:ifnonnull       163
		{
			MemberKey amemberkey[] = new MemberKey[i];
	//   56  107:iload_2         
	//   57  108:anewarray       MemberKey[]
	//   58  111:astore          6
			int k = 0;
	//   59  113:iconst_0        
	//   60  114:istore          4
			do
			{
				class1 = ((Class) (amemberkey));
	//   61  116:aload           6
	//   62  118:astore_1        
				if(k >= i)
					break;
	//   63  119:iload           4
	//   64  121:iload_2         
	//   65  122:icmpge          163
				amemberkey[k] = new MemberKey(((AnnotatedConstructor)_constructors.get(k)).getAnnotated());
	//   66  125:aload           6
	//   67  127:iload           4
	//   68  129:new             #408 <Class MemberKey>
	//   69  132:dup             
	//   70  133:aload_0         
	//   71  134:getfield        #289 <Field List _constructors>
	//   72  137:iload           4
	//   73  139:invokeinterface #304 <Method Object List.get(int)>
	//   74  144:checkcast       #410 <Class AnnotatedConstructor>
	//   75  147:invokevirtual   #412 <Method Constructor AnnotatedConstructor.getAnnotated()>
	//   76  150:invokespecial   #415 <Method void MemberKey(Constructor)>
	//   77  153:aastore         
				k++;
	//   78  154:iload           4
	//   79  156:iconst_1        
	//   80  157:iadd            
	//   81  158:istore          4
			} while(true);
	//   82  160:goto            116
		}
		amemberkey = ((MemberKey []) (new MemberKey(constructor)));
	//   83  163:new             #408 <Class MemberKey>
	//   84  166:dup             
	//   85  167:aload           9
	//   86  169:invokespecial   #415 <Method void MemberKey(Constructor)>
	//   87  172:astore          6
		l = 0;
	//   88  174:iconst_0        
	//   89  175:istore          4
		do
		{
			class2 = class1;
	//   90  177:aload_1         
	//   91  178:astore          7
			if(l >= i)
				continue; /* Loop/switch isn't completed */
	//   92  180:iload           4
	//   93  182:iload_2         
	//   94  183:icmpge          75
label0:
			{
				if(((MemberKey) (amemberkey)).equals(((Object) (class1[l]))))
					break label0;
	//   95  186:aload           6
	//   96  188:aload_1         
	//   97  189:iload           4
	//   98  191:aaload          
	//   99  192:invokevirtual   #418 <Method boolean MemberKey.equals(Object)>
	//  100  195:ifne            207
				l++;
	//  101  198:iload           4
	//  102  200:iconst_1        
	//  103  201:iadd            
	//  104  202:istore          4
			}
		} while(true);
	//  105  204:goto            177
		_addMixOvers(constructor, (AnnotatedConstructor)_constructors.get(l), true);
	//  106  207:aload_0         
	//  107  208:aload           9
	//  108  210:aload_0         
	//  109  211:getfield        #289 <Field List _constructors>
	//  110  214:iload           4
	//  111  216:invokeinterface #304 <Method Object List.get(int)>
	//  112  221:checkcast       #410 <Class AnnotatedConstructor>
	//  113  224:iconst_1        
	//  114  225:invokevirtual   #406 <Method void _addMixOvers(Constructor, AnnotatedConstructor, boolean)>
		class2 = class1;
	//  115  228:aload_1         
	//  116  229:astore          7
		if(true) goto _L4; else goto _L3
	//  117  231:goto            75
_L3:
	//  118  234:return          
	}

	protected void _addFactoryMixIns(Class class1)
	{
		int i;
		int l;
		int i1;
		MemberKey memberkey;
		Method amethod[];
		memberkey = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		l = _creatorMethods.size();
	//    2    3:aload_0         
	//    3    4:getfield        #320 <Field List _creatorMethods>
	//    4    7:invokeinterface #97  <Method int List.size()>
	//    5   12:istore          4
		amethod = ClassUtil.getDeclaredMethods(class1);
	//    6   14:aload_1         
	//    7   15:invokestatic    #422 <Method Method[] ClassUtil.getDeclaredMethods(Class)>
	//    8   18:astore          8
		i1 = amethod.length;
	//    9   20:aload           8
	//   10   22:arraylength     
	//   11   23:istore          5
		i = 0;
	//   12   25:iconst_0        
	//   13   26:istore_2        
_L2:
		Class class2;
		Method method;
		if(i >= i1)
			break MISSING_BLOCK_LABEL_204;
	//   14   27:iload_2         
	//   15   28:iload           5
	//   16   30:icmpge          204
		method = amethod[i];
	//   17   33:aload           8
	//   18   35:iload_2         
	//   19   36:aaload          
	//   20   37:astore          9
		if(Modifier.isStatic(method.getModifiers()))
			break; /* Loop/switch isn't completed */
	//   21   39:aload           9
	//   22   41:invokevirtual   #314 <Method int Method.getModifiers()>
	//   23   44:invokestatic    #179 <Method boolean Modifier.isStatic(int)>
	//   24   47:ifne            65
		class2 = ((Class) (memberkey));
	//   25   50:aload           6
	//   26   52:astore          7
_L4:
		i++;
	//   27   54:iload_2         
	//   28   55:iconst_1        
	//   29   56:iadd            
	//   30   57:istore_2        
		memberkey = ((MemberKey) (class2));
	//   31   58:aload           7
	//   32   60:astore          6
		if(true) goto _L2; else goto _L1
	//   33   62:goto            27
_L1:
		class2 = ((Class) (memberkey));
	//   34   65:aload           6
	//   35   67:astore          7
		if(method.getParameterTypes().length == 0) goto _L4; else goto _L3
	//   36   69:aload           9
	//   37   71:invokevirtual   #423 <Method Class[] Method.getParameterTypes()>
	//   38   74:arraylength     
	//   39   75:ifeq            54
_L3:
		int k;
		class1 = ((Class) (memberkey));
	//   40   78:aload           6
	//   41   80:astore_1        
		if(memberkey == null)
	//*  42   81:aload           6
	//*  43   83:ifnonnull       138
		{
			MemberKey amemberkey[] = new MemberKey[l];
	//   44   86:iload           4
	//   45   88:anewarray       MemberKey[]
	//   46   91:astore          6
			int j = 0;
	//   47   93:iconst_0        
	//   48   94:istore_3        
			do
			{
				class1 = ((Class) (amemberkey));
	//   49   95:aload           6
	//   50   97:astore_1        
				if(j >= l)
					break;
	//   51   98:iload_3         
	//   52   99:iload           4
	//   53  101:icmpge          138
				amemberkey[j] = new MemberKey(((AnnotatedMethod)_creatorMethods.get(j)).getAnnotated());
	//   54  104:aload           6
	//   55  106:iload_3         
	//   56  107:new             #408 <Class MemberKey>
	//   57  110:dup             
	//   58  111:aload_0         
	//   59  112:getfield        #320 <Field List _creatorMethods>
	//   60  115:iload_3         
	//   61  116:invokeinterface #304 <Method Object List.get(int)>
	//   62  121:checkcast       #366 <Class AnnotatedMethod>
	//   63  124:invokevirtual   #387 <Method Method AnnotatedMethod.getAnnotated()>
	//   64  127:invokespecial   #426 <Method void MemberKey(Method)>
	//   65  130:aastore         
				j++;
	//   66  131:iload_3         
	//   67  132:iconst_1        
	//   68  133:iadd            
	//   69  134:istore_3        
			} while(true);
	//   70  135:goto            95
		}
		amemberkey = ((MemberKey []) (new MemberKey(method)));
	//   71  138:new             #408 <Class MemberKey>
	//   72  141:dup             
	//   73  142:aload           9
	//   74  144:invokespecial   #426 <Method void MemberKey(Method)>
	//   75  147:astore          6
		k = 0;
	//   76  149:iconst_0        
	//   77  150:istore_3        
_L6:
		class2 = class1;
	//   78  151:aload_1         
	//   79  152:astore          7
		if(k >= l) goto _L4; else goto _L5
	//   80  154:iload_3         
	//   81  155:iload           4
	//   82  157:icmpge          54
_L5:
label0:
		{
			if(((MemberKey) (amemberkey)).equals(((Object) (class1[k]))))
				break label0;
	//   83  160:aload           6
	//   84  162:aload_1         
	//   85  163:iload_3         
	//   86  164:aaload          
	//   87  165:invokevirtual   #418 <Method boolean MemberKey.equals(Object)>
	//   88  168:ifne            178
			k++;
	//   89  171:iload_3         
	//   90  172:iconst_1        
	//   91  173:iadd            
	//   92  174:istore_3        
		}
		  goto _L6
	//*  93  175:goto            151
		_addMixOvers(method, (AnnotatedMethod)_creatorMethods.get(k), true);
	//   94  178:aload_0         
	//   95  179:aload           9
	//   96  181:aload_0         
	//   97  182:getfield        #320 <Field List _creatorMethods>
	//   98  185:iload_3         
	//   99  186:invokeinterface #304 <Method Object List.get(int)>
	//  100  191:checkcast       #366 <Class AnnotatedMethod>
	//  101  194:iconst_1        
	//  102  195:invokevirtual   #391 <Method void _addMixOvers(Method, AnnotatedMethod, boolean)>
		class2 = class1;
	//  103  198:aload_1         
	//  104  199:astore          7
		  goto _L4
	//* 105  201:goto            54
	//  106  204:return          
	}

	protected void _addFieldMixIns(Class class1, Class class2, Map map)
	{
		for(class1 = ((Class) (ClassUtil.findSuperClasses(class1, class2, true).iterator())); ((Iterator) (class1)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:iconst_1        
	//*   3    3:invokestatic    #399 <Method List ClassUtil.findSuperClasses(Class, Class, boolean)>
	//*   4    6:invokeinterface #187 <Method Iterator List.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            107
		{
			class2 = ((Class) (ClassUtil.getDeclaredFields((Class)((Iterator) (class1)).next())));
	//    9   21:aload_1         
	//   10   22:invokeinterface #196 <Method Object Iterator.next()>
	//   11   27:checkcast       #376 <Class Class>
	//   12   30:invokestatic    #432 <Method Field[] ClassUtil.getDeclaredFields(Class)>
	//   13   33:astore_2        
			int j = class2.length;
	//   14   34:aload_2         
	//   15   35:arraylength     
	//   16   36:istore          5
			int i = 0;
	//   17   38:iconst_0        
	//   18   39:istore          4
			while(i < j) 
	//*  19   41:iload           4
	//*  20   43:iload           5
	//*  21   45:icmpge          12
			{
				Field field = ((Field) (class2[i]));
	//   22   48:aload_2         
	//   23   49:iload           4
	//   24   51:aaload          
	//   25   52:astore          6
				if(_isIncludableField(field))
	//*  26   54:aload_0         
	//*  27   55:aload           6
	//*  28   57:invokespecial   #434 <Method boolean _isIncludableField(Field)>
	//*  29   60:ifne            72
	//*  30   63:iload           4
	//*  31   65:iconst_1        
	//*  32   66:iadd            
	//*  33   67:istore          4
	//*  34   69:goto            41
				{
					AnnotatedField annotatedfield = (AnnotatedField)map.get(((Object) (field.getName())));
	//   35   72:aload_3         
	//   36   73:aload           6
	//   37   75:invokevirtual   #435 <Method String Field.getName()>
	//   38   78:invokeinterface #438 <Method Object Map.get(Object)>
	//   39   83:checkcast       #440 <Class AnnotatedField>
	//   40   86:astore          7
					if(annotatedfield != null)
	//*  41   88:aload           7
	//*  42   90:ifnull          63
						_addOrOverrideAnnotations(((AnnotatedMember) (annotatedfield)), field.getDeclaredAnnotations());
	//   43   93:aload_0         
	//   44   94:aload           7
	//   45   96:aload           6
	//   46   98:invokevirtual   #444 <Method Annotation[] Field.getDeclaredAnnotations()>
	//   47  101:invokespecial   #141 <Method void _addOrOverrideAnnotations(AnnotatedMember, Annotation[])>
				}
				i++;
			}
		}

	//*  48  104:goto            63
	//   49  107:return          
	}

	protected void _addMemberMethods(Class class1, TypeResolutionContext typeresolutioncontext, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
	{
		if(class2 != null)
	//*   0    0:aload           4
	//*   1    2:ifnull          15
			_addMethodMixIns(class1, annotatedmethodmap, class2, annotatedmethodmap1);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_3         
	//    5    8:aload           4
	//    6   10:aload           5
	//    7   12:invokevirtual   #362 <Method void _addMethodMixIns(Class, AnnotatedMethodMap, Class, AnnotatedMethodMap)>
		if(class1 != null)
	//*   8   15:aload_1         
	//*   9   16:ifnonnull       20
	//*  10   19:return          
		{
			class1 = ((Class) (_findClassMethods(class1)));
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #311 <Method Method[] _findClassMethods(Class)>
	//   14   25:astore_1        
			int j = class1.length;
	//   15   26:aload_1         
	//   16   27:arraylength     
	//   17   28:istore          7
			int i = 0;
	//   18   30:iconst_0        
	//   19   31:istore          6
			while(i < j) 
	//*  20   33:iload           6
	//*  21   35:iload           7
	//*  22   37:icmpge          19
			{
				class2 = ((Class) (class1[i]));
	//   23   40:aload_1         
	//   24   41:iload           6
	//   25   43:aaload          
	//   26   44:astore          4
				if(_isIncludableMemberMethod(((Method) (class2))))
	//*  27   46:aload_0         
	//*  28   47:aload           4
	//*  29   49:invokevirtual   #449 <Method boolean _isIncludableMemberMethod(Method)>
	//*  30   52:ifne            64
	//*  31   55:iload           6
	//*  32   57:iconst_1        
	//*  33   58:iadd            
	//*  34   59:istore          6
	//*  35   61:goto            33
				{
					AnnotatedMethod annotatedmethod = annotatedmethodmap.find(((Method) (class2)));
	//   36   64:aload_3         
	//   37   65:aload           4
	//   38   67:invokevirtual   #453 <Method AnnotatedMethod AnnotatedMethodMap.find(Method)>
	//   39   70:astore          8
					if(annotatedmethod == null)
	//*  40   72:aload           8
	//*  41   74:ifnonnull       121
					{
						annotatedmethod = _constructMethod(((Method) (class2)), typeresolutioncontext);
	//   42   77:aload_0         
	//   43   78:aload           4
	//   44   80:aload_2         
	//   45   81:invokevirtual   #383 <Method AnnotatedMethod _constructMethod(Method, TypeResolutionContext)>
	//   46   84:astore          8
						annotatedmethodmap.add(annotatedmethod);
	//   47   86:aload_3         
	//   48   87:aload           8
	//   49   89:invokevirtual   #394 <Method void AnnotatedMethodMap.add(AnnotatedMethod)>
						class2 = ((Class) (annotatedmethodmap1.remove(((Method) (class2)))));
	//   50   92:aload           5
	//   51   94:aload           4
	//   52   96:invokevirtual   #455 <Method AnnotatedMethod AnnotatedMethodMap.remove(Method)>
	//   53   99:astore          4
						if(class2 != null)
	//*  54  101:aload           4
	//*  55  103:ifnull          55
							_addMixOvers(((AnnotatedMethod) (class2)).getAnnotated(), annotatedmethod, false);
	//   56  106:aload_0         
	//   57  107:aload           4
	//   58  109:invokevirtual   #387 <Method Method AnnotatedMethod.getAnnotated()>
	//   59  112:aload           8
	//   60  114:iconst_0        
	//   61  115:invokevirtual   #391 <Method void _addMixOvers(Method, AnnotatedMethod, boolean)>
					} else
	//*  62  118:goto            55
					{
						_addMixUnders(((Method) (class2)), annotatedmethod);
	//   63  121:aload_0         
	//   64  122:aload           4
	//   65  124:aload           8
	//   66  126:invokevirtual   #459 <Method void _addMixUnders(Method, AnnotatedMethod)>
						if(annotatedmethod.getDeclaringClass().isInterface() && !((Method) (class2)).getDeclaringClass().isInterface())
	//*  67  129:aload           8
	//*  68  131:invokevirtual   #462 <Method Class AnnotatedMethod.getDeclaringClass()>
	//*  69  134:invokevirtual   #465 <Method boolean Class.isInterface()>
	//*  70  137:ifeq            55
	//*  71  140:aload           4
	//*  72  142:invokevirtual   #466 <Method Class Method.getDeclaringClass()>
	//*  73  145:invokevirtual   #465 <Method boolean Class.isInterface()>
	//*  74  148:ifne            55
							annotatedmethodmap.add(annotatedmethod.withMethod(((Method) (class2))));
	//   75  151:aload_3         
	//   76  152:aload           8
	//   77  154:aload           4
	//   78  156:invokevirtual   #469 <Method AnnotatedMethod AnnotatedMethod.withMethod(Method)>
	//   79  159:invokevirtual   #394 <Method void AnnotatedMethodMap.add(AnnotatedMethod)>
					}
				}
				i++;
			}
		}
	//*  80  162:goto            55
	}

	protected void _addMethodMixIns(Class class1, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
	{
		for(class1 = ((Class) (ClassUtil.findRawSuperTypes(class2, class1, true).iterator())); ((Iterator) (class1)).hasNext();)
	//*   0    0:aload_3         
	//*   1    1:aload_1         
	//*   2    2:iconst_1        
	//*   3    3:invokestatic    #473 <Method List ClassUtil.findRawSuperTypes(Class, Class, boolean)>
	//*   4    6:invokeinterface #187 <Method Iterator List.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            136
		{
			class2 = ((Class) (ClassUtil.getDeclaredMethods((Class)((Iterator) (class1)).next())));
	//    9   21:aload_1         
	//   10   22:invokeinterface #196 <Method Object Iterator.next()>
	//   11   27:checkcast       #376 <Class Class>
	//   12   30:invokestatic    #422 <Method Method[] ClassUtil.getDeclaredMethods(Class)>
	//   13   33:astore_3        
			int j = class2.length;
	//   14   34:aload_3         
	//   15   35:arraylength     
	//   16   36:istore          6
			int i = 0;
	//   17   38:iconst_0        
	//   18   39:istore          5
			while(i < j) 
	//*  19   41:iload           5
	//*  20   43:iload           6
	//*  21   45:icmpge          12
			{
				Method method = ((Method) (class2[i]));
	//   22   48:aload_3         
	//   23   49:iload           5
	//   24   51:aaload          
	//   25   52:astore          7
				if(_isIncludableMemberMethod(method))
	//*  26   54:aload_0         
	//*  27   55:aload           7
	//*  28   57:invokevirtual   #449 <Method boolean _isIncludableMemberMethod(Method)>
	//*  29   60:ifne            72
	//*  30   63:iload           5
	//*  31   65:iconst_1        
	//*  32   66:iadd            
	//*  33   67:istore          5
	//*  34   69:goto            41
				{
					AnnotatedMethod annotatedmethod = annotatedmethodmap.find(method);
	//   35   72:aload_2         
	//   36   73:aload           7
	//   37   75:invokevirtual   #453 <Method AnnotatedMethod AnnotatedMethodMap.find(Method)>
	//   38   78:astore          8
					if(annotatedmethod != null)
	//*  39   80:aload           8
	//*  40   82:ifnull          96
					{
						_addMixUnders(method, annotatedmethod);
	//   41   85:aload_0         
	//   42   86:aload           7
	//   43   88:aload           8
	//   44   90:invokevirtual   #459 <Method void _addMixUnders(Method, AnnotatedMethod)>
					} else
	//*  45   93:goto            63
					{
						AnnotatedMethod annotatedmethod1 = annotatedmethodmap1.find(method);
	//   46   96:aload           4
	//   47   98:aload           7
	//   48  100:invokevirtual   #453 <Method AnnotatedMethod AnnotatedMethodMap.find(Method)>
	//   49  103:astore          8
						if(annotatedmethod1 != null)
	//*  50  105:aload           8
	//*  51  107:ifnull          121
							_addMixUnders(method, annotatedmethod1);
	//   52  110:aload_0         
	//   53  111:aload           7
	//   54  113:aload           8
	//   55  115:invokevirtual   #459 <Method void _addMixUnders(Method, AnnotatedMethod)>
						else
	//*  56  118:goto            63
							annotatedmethodmap1.add(_constructMethod(method, ((TypeResolutionContext) (this))));
	//   57  121:aload           4
	//   58  123:aload_0         
	//   59  124:aload           7
	//   60  126:aload_0         
	//   61  127:invokevirtual   #383 <Method AnnotatedMethod _constructMethod(Method, TypeResolutionContext)>
	//   62  130:invokevirtual   #394 <Method void AnnotatedMethodMap.add(AnnotatedMethod)>
					}
				}
				i++;
			}
		}

	//*  63  133:goto            63
	//   64  136:return          
	}

	protected void _addMixOvers(Constructor constructor, AnnotatedConstructor annotatedconstructor, boolean flag)
	{
		_addOrOverrideAnnotations(((AnnotatedMember) (annotatedconstructor)), constructor.getDeclaredAnnotations());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #475 <Method Annotation[] Constructor.getDeclaredAnnotations()>
	//    4    6:invokespecial   #141 <Method void _addOrOverrideAnnotations(AnnotatedMember, Annotation[])>
		if(flag)
	//*   5    9:iload_3         
	//*   6   10:ifeq            82
		{
			constructor = ((Constructor) (constructor.getParameterAnnotations()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #479 <Method Annotation[][] Constructor.getParameterAnnotations()>
	//    9   17:astore_1        
			int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore          4
			for(int k = constructor.length; i < k; i++)
	//*  12   21:aload_1         
	//*  13   22:arraylength     
	//*  14   23:istore          6
	//*  15   25:iload           4
	//*  16   27:iload           6
	//*  17   29:icmpge          82
			{
				Object obj = constructor[i];
	//   18   32:aload_1         
	//   19   33:iload           4
	//   20   35:aaload          
	//   21   36:astore          8
				int l = obj.length;
	//   22   38:aload           8
	//   23   40:arraylength     
	//   24   41:istore          7
				for(int j = 0; j < l; j++)
	//*  25   43:iconst_0        
	//*  26   44:istore          5
	//*  27   46:iload           5
	//*  28   48:iload           7
	//*  29   50:icmpge          73
					annotatedconstructor.addOrOverrideParam(i, ((Annotation) (obj[j])));
	//   30   53:aload_2         
	//   31   54:iload           4
	//   32   56:aload           8
	//   33   58:iload           5
	//   34   60:aaload          
	//   35   61:invokevirtual   #483 <Method void AnnotatedConstructor.addOrOverrideParam(int, Annotation)>

	//   36   64:iload           5
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore          5
			}

	//   40   70:goto            46
	//   41   73:iload           4
	//   42   75:iconst_1        
	//   43   76:iadd            
	//   44   77:istore          4
		}
	//*  45   79:goto            25
	//   46   82:return          
	}

	protected void _addMixOvers(Method method, AnnotatedMethod annotatedmethod, boolean flag)
	{
		_addOrOverrideAnnotations(((AnnotatedMember) (annotatedmethod)), method.getDeclaredAnnotations());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #485 <Method Annotation[] Method.getDeclaredAnnotations()>
	//    4    6:invokespecial   #141 <Method void _addOrOverrideAnnotations(AnnotatedMember, Annotation[])>
		if(flag)
	//*   5    9:iload_3         
	//*   6   10:ifeq            82
		{
			method = ((Method) (method.getParameterAnnotations()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #486 <Method Annotation[][] Method.getParameterAnnotations()>
	//    9   17:astore_1        
			int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore          4
			for(int k = method.length; i < k; i++)
	//*  12   21:aload_1         
	//*  13   22:arraylength     
	//*  14   23:istore          6
	//*  15   25:iload           4
	//*  16   27:iload           6
	//*  17   29:icmpge          82
			{
				Object obj = method[i];
	//   18   32:aload_1         
	//   19   33:iload           4
	//   20   35:aaload          
	//   21   36:astore          8
				int l = obj.length;
	//   22   38:aload           8
	//   23   40:arraylength     
	//   24   41:istore          7
				for(int j = 0; j < l; j++)
	//*  25   43:iconst_0        
	//*  26   44:istore          5
	//*  27   46:iload           5
	//*  28   48:iload           7
	//*  29   50:icmpge          73
					annotatedmethod.addOrOverrideParam(i, ((Annotation) (obj[j])));
	//   30   53:aload_2         
	//   31   54:iload           4
	//   32   56:aload           8
	//   33   58:iload           5
	//   34   60:aaload          
	//   35   61:invokevirtual   #487 <Method void AnnotatedMethod.addOrOverrideParam(int, Annotation)>

	//   36   64:iload           5
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore          5
			}

	//   40   70:goto            46
	//   41   73:iload           4
	//   42   75:iconst_1        
	//   43   76:iadd            
	//   44   77:istore          4
		}
	//*  45   79:goto            25
	//   46   82:return          
	}

	protected void _addMixUnders(Method method, AnnotatedMethod annotatedmethod)
	{
		_addAnnotationsIfNotPresent(((AnnotatedMember) (annotatedmethod)), method.getDeclaredAnnotations());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #485 <Method Annotation[] Method.getDeclaredAnnotations()>
	//    4    6:invokespecial   #113 <Method void _addAnnotationsIfNotPresent(AnnotatedMember, Annotation[])>
	//    5    9:return          
	}

	protected AnnotationMap _collectRelevantAnnotations(Annotation aannotation[])
	{
		return _addAnnotationsIfNotPresent(new AnnotationMap(), aannotation);
	//    0    0:aload_0         
	//    1    1:new             #43  <Class AnnotationMap>
	//    2    4:dup             
	//    3    5:invokespecial   #147 <Method void AnnotationMap()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #107 <Method AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap, Annotation[])>
	//    6   12:areturn         
	}

	protected AnnotationMap[] _collectRelevantAnnotations(Annotation aannotation[][])
	{
		int j = aannotation.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		AnnotationMap aannotationmap[] = new AnnotationMap[j];
	//    3    3:iload_3         
	//    4    4:anewarray       AnnotationMap[]
	//    5    7:astore          4
		for(int i = 0; i < j; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload_3         
	//*  10   13:icmpge          34
			aannotationmap[i] = _collectRelevantAnnotations(aannotation[i]);
	//   11   16:aload           4
	//   12   18:iload_2         
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:aaload          
	//   17   23:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   18   26:aastore         

	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:istore_2        
	//*  23   31:goto            11
		return aannotationmap;
	//   24   34:aload           4
	//   25   36:areturn         
	}

	protected AnnotatedMethod _constructCreatorMethod(Method method, TypeResolutionContext typeresolutioncontext)
	{
		int i = method.getParameterTypes().length;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #423 <Method Class[] Method.getParameterTypes()>
	//    2    4:arraylength     
	//    3    5:istore_3        
		if(_annotationIntrospector == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*   6   10:ifnonnull       32
			return new AnnotatedMethod(typeresolutioncontext, method, _emptyAnnotationMap(), _emptyAnnotationMaps(i));
	//    7   13:new             #366 <Class AnnotatedMethod>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokespecial   #151 <Method AnnotationMap _emptyAnnotationMap()>
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:invokespecial   #494 <Method AnnotationMap[] _emptyAnnotationMaps(int)>
	//   16   28:invokespecial   #497 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   17   31:areturn         
		if(i == 0)
	//*  18   32:iload_3         
	//*  19   33:ifne            57
			return new AnnotatedMethod(typeresolutioncontext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
	//   20   36:new             #366 <Class AnnotatedMethod>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:aload_1         
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #485 <Method Annotation[] Method.getDeclaredAnnotations()>
	//   27   47:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   28   50:getstatic       #45  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   29   53:invokespecial   #497 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   30   56:areturn         
		else
			return new AnnotatedMethod(typeresolutioncontext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
	//   31   57:new             #366 <Class AnnotatedMethod>
	//   32   60:dup             
	//   33   61:aload_2         
	//   34   62:aload_1         
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokevirtual   #485 <Method Annotation[] Method.getDeclaredAnnotations()>
	//   38   68:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   39   71:aload_0         
	//   40   72:aload_1         
	//   41   73:invokevirtual   #486 <Method Annotation[][] Method.getParameterAnnotations()>
	//   42   76:invokevirtual   #499 <Method AnnotationMap[] _collectRelevantAnnotations(Annotation[][])>
	//   43   79:invokespecial   #497 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   44   82:areturn         
	}

	protected AnnotatedConstructor _constructDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor, TypeResolutionContext typeresolutioncontext)
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       27
			return new AnnotatedConstructor(typeresolutioncontext, ctor.getConstructor(), _emptyAnnotationMap(), NO_ANNOTATION_MAPS);
	//    3    7:new             #410 <Class AnnotatedConstructor>
	//    4   10:dup             
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//    8   16:aload_0         
	//    9   17:invokespecial   #151 <Method AnnotationMap _emptyAnnotationMap()>
	//   10   20:getstatic       #45  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   11   23:invokespecial   #502 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   12   26:areturn         
		else
			return new AnnotatedConstructor(typeresolutioncontext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
	//   13   27:new             #410 <Class AnnotatedConstructor>
	//   14   30:dup             
	//   15   31:aload_2         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #503 <Method Annotation[] com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaredAnnotations()>
	//   21   41:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   22   44:getstatic       #45  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   23   47:invokespecial   #502 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   24   50:areturn         
	}

	protected AnnotatedField _constructField(Field field, TypeResolutionContext typeresolutioncontext)
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       21
			return new AnnotatedField(typeresolutioncontext, field, _emptyAnnotationMap());
	//    3    7:new             #440 <Class AnnotatedField>
	//    4   10:dup             
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokespecial   #151 <Method AnnotationMap _emptyAnnotationMap()>
	//    9   17:invokespecial   #508 <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
	//   10   20:areturn         
		else
			return new AnnotatedField(typeresolutioncontext, field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
	//   11   21:new             #440 <Class AnnotatedField>
	//   12   24:dup             
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #444 <Method Annotation[] Field.getDeclaredAnnotations()>
	//   18   32:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   19   35:invokespecial   #508 <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
	//   20   38:areturn         
	}

	protected AnnotatedMethod _constructMethod(Method method, TypeResolutionContext typeresolutioncontext)
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       22
			return new AnnotatedMethod(typeresolutioncontext, method, _emptyAnnotationMap(), ((AnnotationMap []) (null)));
	//    3    7:new             #366 <Class AnnotatedMethod>
	//    4   10:dup             
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokespecial   #151 <Method AnnotationMap _emptyAnnotationMap()>
	//    9   17:aconst_null     
	//   10   18:invokespecial   #497 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   11   21:areturn         
		else
			return new AnnotatedMethod(typeresolutioncontext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), ((AnnotationMap []) (null)));
	//   12   22:new             #366 <Class AnnotatedMethod>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #485 <Method Annotation[] Method.getDeclaredAnnotations()>
	//   19   33:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   20   36:aconst_null     
	//   21   37:invokespecial   #497 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   22   40:areturn         
	}

	protected AnnotatedConstructor _constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor, TypeResolutionContext typeresolutioncontext)
	{
		int i;
		AnnotationMap aannotationmap1[];
		i = ctor.getParamCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #269 <Method int com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParamCount()>
	//    2    4:istore_3        
		if(_annotationIntrospector == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//*   5    9:ifnonnull       34
			return new AnnotatedConstructor(typeresolutioncontext, ctor.getConstructor(), _emptyAnnotationMap(), _emptyAnnotationMaps(i));
	//    6   12:new             #410 <Class AnnotatedConstructor>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   11   21:aload_0         
	//   12   22:invokespecial   #151 <Method AnnotationMap _emptyAnnotationMap()>
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:invokespecial   #494 <Method AnnotationMap[] _emptyAnnotationMaps(int)>
	//   16   30:invokespecial   #502 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   17   33:areturn         
		if(i == 0)
	//*  18   34:iload_3         
	//*  19   35:ifne            62
			return new AnnotatedConstructor(typeresolutioncontext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
	//   20   38:new             #410 <Class AnnotatedConstructor>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #503 <Method Annotation[] com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaredAnnotations()>
	//   28   52:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//   29   55:getstatic       #45  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   30   58:invokespecial   #502 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   31   61:areturn         
		aannotationmap1 = ((AnnotationMap []) (ctor.getParameterAnnotations()));
	//   32   62:aload_1         
	//   33   63:invokevirtual   #509 <Method Annotation[][] com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParameterAnnotations()>
	//   34   66:astore          6
		if(i == aannotationmap1.length) goto _L2; else goto _L1
	//   35   68:iload_3         
	//   36   69:aload           6
	//   37   71:arraylength     
	//   38   72:icmpeq          268
_L1:
		Object obj;
		Class class1;
		obj = null;
	//   39   75:aconst_null     
	//   40   76:astore          7
		class1 = ctor.getDeclaringClass();
	//   41   78:aload_1         
	//   42   79:invokevirtual   #510 <Method Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaringClass()>
	//   43   82:astore          8
		if(!class1.isEnum() || i != aannotationmap1.length + 2) goto _L4; else goto _L3
	//   44   84:aload           8
	//   45   86:invokevirtual   #513 <Method boolean Class.isEnum()>
	//   46   89:ifeq            202
	//   47   92:iload_3         
	//   48   93:aload           6
	//   49   95:arraylength     
	//   50   96:iconst_2        
	//   51   97:iadd            
	//   52   98:icmpne          202
_L3:
		AnnotationMap aannotationmap[];
		Annotation aannotation[][];
		aannotation = new Annotation[aannotationmap1.length + 2][];
	//   53  101:aload           6
	//   54  103:arraylength     
	//   55  104:iconst_2        
	//   56  105:iadd            
	//   57  106:anewarray       Annotation[][]
	//   58  109:astore          5
		System.arraycopy(((Object) (aannotationmap1)), 0, ((Object) (aannotation)), 2, aannotationmap1.length);
	//   59  111:aload           6
	//   60  113:iconst_0        
	//   61  114:aload           5
	//   62  116:iconst_2        
	//   63  117:aload           6
	//   64  119:arraylength     
	//   65  120:invokestatic    #519 <Method void System.arraycopy(Object, int, Object, int, int)>
		aannotationmap = _collectRelevantAnnotations(aannotation);
	//   66  123:aload_0         
	//   67  124:aload           5
	//   68  126:invokevirtual   #499 <Method AnnotationMap[] _collectRelevantAnnotations(Annotation[][])>
	//   69  129:astore          4
_L6:
		aannotationmap1 = aannotationmap;
	//   70  131:aload           4
	//   71  133:astore          6
		if(aannotationmap == null)
	//*  72  135:aload           4
	//*  73  137:ifnonnull       276
			throw new IllegalStateException((new StringBuilder()).append("Internal error: constructor for ").append(ctor.getDeclaringClass().getName()).append(" has mismatch: ").append(i).append(" parameters; ").append(aannotation.length).append(" sets of annotations").toString());
	//   74  140:new             #521 <Class IllegalStateException>
	//   75  143:dup             
	//   76  144:new             #523 <Class StringBuilder>
	//   77  147:dup             
	//   78  148:invokespecial   #524 <Method void StringBuilder()>
	//   79  151:ldc2            #526 <String "Internal error: constructor for ">
	//   80  154:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//   81  157:aload_1         
	//   82  158:invokevirtual   #510 <Method Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaringClass()>
	//   83  161:invokevirtual   #531 <Method String Class.getName()>
	//   84  164:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//   85  167:ldc2            #533 <String " has mismatch: ">
	//   86  170:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//   87  173:iload_3         
	//   88  174:invokevirtual   #536 <Method StringBuilder StringBuilder.append(int)>
	//   89  177:ldc2            #538 <String " parameters; ">
	//   90  180:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//   91  183:aload           5
	//   92  185:arraylength     
	//   93  186:invokevirtual   #536 <Method StringBuilder StringBuilder.append(int)>
	//   94  189:ldc2            #540 <String " sets of annotations">
	//   95  192:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//   96  195:invokevirtual   #543 <Method String StringBuilder.toString()>
	//   97  198:invokespecial   #546 <Method void IllegalStateException(String)>
	//   98  201:athrow          
		break; /* Loop/switch isn't completed */
_L4:
		aannotation = ((Annotation [][]) (aannotationmap1));
	//   99  202:aload           6
	//  100  204:astore          5
		aannotationmap = ((AnnotationMap []) (obj));
	//  101  206:aload           7
	//  102  208:astore          4
		if(class1.isMemberClass())
	//* 103  210:aload           8
	//* 104  212:invokevirtual   #549 <Method boolean Class.isMemberClass()>
	//* 105  215:ifeq            131
		{
			aannotation = ((Annotation [][]) (aannotationmap1));
	//  106  218:aload           6
	//  107  220:astore          5
			aannotationmap = ((AnnotationMap []) (obj));
	//  108  222:aload           7
	//  109  224:astore          4
			if(i == aannotationmap1.length + 1)
	//* 110  226:iload_3         
	//* 111  227:aload           6
	//* 112  229:arraylength     
	//* 113  230:iconst_1        
	//* 114  231:iadd            
	//* 115  232:icmpne          131
			{
				aannotation = new Annotation[aannotationmap1.length + 1][];
	//  116  235:aload           6
	//  117  237:arraylength     
	//  118  238:iconst_1        
	//  119  239:iadd            
	//  120  240:anewarray       Annotation[][]
	//  121  243:astore          5
				System.arraycopy(((Object) (aannotationmap1)), 0, ((Object) (aannotation)), 1, aannotationmap1.length);
	//  122  245:aload           6
	//  123  247:iconst_0        
	//  124  248:aload           5
	//  125  250:iconst_1        
	//  126  251:aload           6
	//  127  253:arraylength     
	//  128  254:invokestatic    #519 <Method void System.arraycopy(Object, int, Object, int, int)>
				aannotationmap = _collectRelevantAnnotations(aannotation);
	//  129  257:aload_0         
	//  130  258:aload           5
	//  131  260:invokevirtual   #499 <Method AnnotationMap[] _collectRelevantAnnotations(Annotation[][])>
	//  132  263:astore          4
			}
		}
		if(true) goto _L6; else goto _L5
	//  133  265:goto            131
_L2:
		aannotationmap1 = _collectRelevantAnnotations(((Annotation [][]) (aannotationmap1)));
	//  134  268:aload_0         
	//  135  269:aload           6
	//  136  271:invokevirtual   #499 <Method AnnotationMap[] _collectRelevantAnnotations(Annotation[][])>
	//  137  274:astore          6
_L5:
		return new AnnotatedConstructor(typeresolutioncontext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), aannotationmap1);
	//  138  276:new             #410 <Class AnnotatedConstructor>
	//  139  279:dup             
	//  140  280:aload_2         
	//  141  281:aload_1         
	//  142  282:invokevirtual   #264 <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//  143  285:aload_0         
	//  144  286:aload_1         
	//  145  287:invokevirtual   #503 <Method Annotation[] com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaredAnnotations()>
	//  146  290:invokevirtual   #492 <Method AnnotationMap _collectRelevantAnnotations(Annotation[])>
	//  147  293:aload           6
	//  148  295:invokespecial   #502 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//  149  298:areturn         
	}

	protected Method[] _findClassMethods(Class class1)
	{
		Method amethod[];
		try
		{
			amethod = ClassUtil.getDeclaredMethods(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #422 <Method Method[] ClassUtil.getDeclaredMethods(Class)>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:areturn         
		catch(NoClassDefFoundError noclassdeffounderror)
	//*   5    7:astore_2        
		{
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
	//    6    8:invokestatic    #559 <Method Thread Thread.currentThread()>
	//    7   11:invokevirtual   #563 <Method ClassLoader Thread.getContextClassLoader()>
	//    8   14:astore_3        
			if(classloader == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       21
				throw noclassdeffounderror;
	//   11   19:aload_2         
	//   12   20:athrow          
			try
			{
				class1 = classloader.loadClass(class1.getName());
	//   13   21:aload_3         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #531 <Method String Class.getName()>
	//   16   26:invokevirtual   #569 <Method Class ClassLoader.loadClass(String)>
	//   17   29:astore_1        
			}
	//*  18   30:aload_1         
	//*  19   31:invokevirtual   #572 <Method Method[] Class.getDeclaredMethods()>
	//*  20   34:areturn         
			// Misplaced declaration of an exception variable
			catch(Class class1)
	//*  21   35:astore_1        
			{
				throw noclassdeffounderror;
	//   22   36:aload_2         
	//   23   37:athrow          
			}
			return class1.getDeclaredMethods();
		}
		return amethod;
	}

	protected Map _findFields(JavaType javatype, TypeResolutionContext typeresolutioncontext, Map map)
	{
		JavaType javatype1 = javatype.getSuperClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #577 <Method JavaType JavaType.getSuperClass()>
	//    2    4:astore          8
		Object obj = ((Object) (map));
	//    3    6:aload_3         
	//    4    7:astore          6
		if(javatype1 != null)
	//*   5    9:aload           8
	//*   6   11:ifnull          169
		{
			Class class1 = javatype.getRawClass();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #204 <Method Class JavaType.getRawClass()>
	//    9   18:astore          7
			javatype = ((JavaType) (_findFields(javatype1, ((TypeResolutionContext) (new TypeResolutionContext.Basic(_typeFactory, javatype1.getBindings()))), map)));
	//   10   20:aload_0         
	//   11   21:aload           8
	//   12   23:new             #355 <Class TypeResolutionContext$Basic>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:getfield        #64  <Field TypeFactory _typeFactory>
	//   16   31:aload           8
	//   17   33:invokevirtual   #224 <Method TypeBindings JavaType.getBindings()>
	//   18   36:invokespecial   #358 <Method void TypeResolutionContext$Basic(TypeFactory, TypeBindings)>
	//   19   39:aload_3         
	//   20   40:invokevirtual   #328 <Method Map _findFields(JavaType, TypeResolutionContext, Map)>
	//   21   43:astore_1        
			obj = ((Object) (ClassUtil.getDeclaredFields(class1)));
	//   22   44:aload           7
	//   23   46:invokestatic    #432 <Method Field[] ClassUtil.getDeclaredFields(Class)>
	//   24   49:astore          6
			int j = obj.length;
	//   25   51:aload           6
	//   26   53:arraylength     
	//   27   54:istore          5
			int i = 0;
	//   28   56:iconst_0        
	//   29   57:istore          4
			while(i < j) 
	//*  30   59:iload           4
	//*  31   61:iload           5
	//*  32   63:icmpge          129
			{
				Field field = ((Field) (obj[i]));
	//   33   66:aload           6
	//   34   68:iload           4
	//   35   70:aaload          
	//   36   71:astore          8
				if(_isIncludableField(field))
	//*  37   73:aload_0         
	//*  38   74:aload           8
	//*  39   76:invokespecial   #434 <Method boolean _isIncludableField(Field)>
	//*  40   79:ifne            91
	//*  41   82:iload           4
	//*  42   84:iconst_1        
	//*  43   85:iadd            
	//*  44   86:istore          4
	//*  45   88:goto            59
				{
					map = ((Map) (javatype));
	//   46   91:aload_1         
	//   47   92:astore_3        
					if(javatype == null)
	//*  48   93:aload_1         
	//*  49   94:ifnonnull       105
						map = ((Map) (new LinkedHashMap()));
	//   50   97:new             #579 <Class LinkedHashMap>
	//   51  100:dup             
	//   52  101:invokespecial   #580 <Method void LinkedHashMap()>
	//   53  104:astore_3        
					map.put(((Object) (field.getName())), ((Object) (_constructField(field, typeresolutioncontext))));
	//   54  105:aload_3         
	//   55  106:aload           8
	//   56  108:invokevirtual   #435 <Method String Field.getName()>
	//   57  111:aload_0         
	//   58  112:aload           8
	//   59  114:aload_2         
	//   60  115:invokevirtual   #582 <Method AnnotatedField _constructField(Field, TypeResolutionContext)>
	//   61  118:invokeinterface #586 <Method Object Map.put(Object, Object)>
	//   62  123:pop             
					javatype = ((JavaType) (map));
	//   63  124:aload_3         
	//   64  125:astore_1        
				}
				i++;
			}
	//*  65  126:goto            82
			obj = ((Object) (javatype));
	//   66  129:aload_1         
	//   67  130:astore          6
			if(_mixInResolver != null)
	//*  68  132:aload_0         
	//*  69  133:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//*  70  136:ifnull          169
			{
				typeresolutioncontext = ((TypeResolutionContext) (_mixInResolver.findMixInClassFor(class1)));
	//   71  139:aload_0         
	//   72  140:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   73  143:aload           7
	//   74  145:invokeinterface #76  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   75  150:astore_2        
				obj = ((Object) (javatype));
	//   76  151:aload_1         
	//   77  152:astore          6
				if(typeresolutioncontext != null)
	//*  78  154:aload_2         
	//*  79  155:ifnull          169
				{
					_addFieldMixIns(((Class) (typeresolutioncontext)), class1, ((Map) (javatype)));
	//   80  158:aload_0         
	//   81  159:aload_2         
	//   82  160:aload           7
	//   83  162:aload_1         
	//   84  163:invokevirtual   #588 <Method void _addFieldMixIns(Class, Class, Map)>
					obj = ((Object) (javatype));
	//   85  166:aload_1         
	//   86  167:astore          6
				}
			}
		}
		return ((Map) (obj));
	//   87  169:aload           6
	//   88  171:areturn         
	}

	protected boolean _isIncludableMemberMethod(Method method)
	{
		while(Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #314 <Method int Method.getModifiers()>
	//*   2    4:invokestatic    #179 <Method boolean Modifier.isStatic(int)>
	//*   3    7:ifeq            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #590 <Method boolean Method.isSynthetic()>
	//    8   16:ifne            10
	//    9   19:aload_1         
	//   10   20:invokevirtual   #593 <Method boolean Method.isBridge()>
	//   11   23:ifne            10
	//   12   26:aload_1         
	//   13   27:invokevirtual   #423 <Method Class[] Method.getParameterTypes()>
	//   14   30:arraylength     
	//   15   31:iconst_2        
	//   16   32:icmpgt          10
		return true;
	//   17   35:iconst_1        
	//   18   36:ireturn         
	}

	public Iterable annotations()
	{
		return _classAnnotations().annotations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:invokevirtual   #599 <Method Iterable AnnotationMap.annotations()>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || obj.getClass() != ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #603 <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #603 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(((AnnotatedClass)obj)._class != _class)
	//*  14   24:aload_1         
	//*  15   25:checkcast       #2   <Class AnnotatedClass>
	//*  16   28:getfield        #56  <Field Class _class>
	//*  17   31:aload_0         
	//*  18   32:getfield        #56  <Field Class _class>
	//*  19   35:if_acmpeq       5
				return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
		}
		return true;
	}

	public Iterable fields()
	{
		if(_fields == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #333 <Field List _fields>
	//*   2    4:ifnonnull       11
			resolveFields();
	//    3    7:aload_0         
	//    4    8:invokespecial   #606 <Method void resolveFields()>
		return ((Iterable) (_fields));
	//    5   11:aload_0         
	//    6   12:getfield        #333 <Field List _fields>
	//    7   15:areturn         
	}

	public AnnotatedMethod findMethod(String s, Class aclass[])
	{
		if(_memberMethods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//*   2    4:ifnonnull       11
			resolveMemberMethods();
	//    3    7:aload_0         
	//    4    8:invokespecial   #611 <Method void resolveMemberMethods()>
		return _memberMethods.find(s, aclass);
	//    5   11:aload_0         
	//    6   12:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #613 <Method AnnotatedMethod AnnotatedMethodMap.find(String, Class[])>
	//   10   20:areturn         
	}

	protected AnnotationMap getAllAnnotations()
	{
		return _classAnnotations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:areturn         
	}

	public Class getAnnotated()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Class _class>
	//    2    4:areturn         
	}

	public volatile AnnotatedElement getAnnotated()
	{
		return ((AnnotatedElement) (getAnnotated()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #619 <Method Class getAnnotated()>
	//    2    4:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return _classAnnotations().get(class1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #623 <Method Annotation AnnotationMap.get(Class)>
	//    4    8:areturn         
	}

	public Annotations getAnnotations()
	{
		return ((Annotations) (_classAnnotations()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:areturn         
	}

	public List getConstructors()
	{
		if(!_creatorsResolved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean _creatorsResolved>
	//*   2    4:ifne            11
			resolveCreators();
	//    3    7:aload_0         
	//    4    8:invokespecial   #628 <Method void resolveCreators()>
		return _constructors;
	//    5   11:aload_0         
	//    6   12:getfield        #289 <Field List _constructors>
	//    7   15:areturn         
	}

	public AnnotatedConstructor getDefaultConstructor()
	{
		if(!_creatorsResolved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean _creatorsResolved>
	//*   2    4:ifne            11
			resolveCreators();
	//    3    7:aload_0         
	//    4    8:invokespecial   #628 <Method void resolveCreators()>
		return _defaultConstructor;
	//    5   11:aload_0         
	//    6   12:getfield        #275 <Field AnnotatedConstructor _defaultConstructor>
	//    7   15:areturn         
	}

	public int getFieldCount()
	{
		if(_fields == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #333 <Field List _fields>
	//*   2    4:ifnonnull       11
			resolveFields();
	//    3    7:aload_0         
	//    4    8:invokespecial   #606 <Method void resolveFields()>
		return _fields.size();
	//    5   11:aload_0         
	//    6   12:getfield        #333 <Field List _fields>
	//    7   15:invokeinterface #97  <Method int List.size()>
	//    8   20:ireturn         
	}

	public int getMemberMethodCount()
	{
		if(_memberMethods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//*   2    4:ifnonnull       11
			resolveMemberMethods();
	//    3    7:aload_0         
	//    4    8:invokespecial   #611 <Method void resolveMemberMethods()>
		return _memberMethods.size();
	//    5   11:aload_0         
	//    6   12:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//    7   15:invokevirtual   #634 <Method int AnnotatedMethodMap.size()>
	//    8   18:ireturn         
	}

	public int getModifiers()
	{
		return _class.getModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Class _class>
	//    2    4:invokevirtual   #635 <Method int Class.getModifiers()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return _class.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Class _class>
	//    2    4:invokevirtual   #531 <Method String Class.getName()>
	//    3    7:areturn         
	}

	public Class getRawType()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Class _class>
	//    2    4:areturn         
	}

	public List getStaticMethods()
	{
		if(!_creatorsResolved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean _creatorsResolved>
	//*   2    4:ifne            11
			resolveCreators();
	//    3    7:aload_0         
	//    4    8:invokespecial   #628 <Method void resolveCreators()>
		return _creatorMethods;
	//    5   11:aload_0         
	//    6   12:getfield        #320 <Field List _creatorMethods>
	//    7   15:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field JavaType _type>
	//    2    4:areturn         
	}

	public boolean hasAnnotation(Class class1)
	{
		return _classAnnotations().has(class1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #644 <Method boolean AnnotationMap.has(Class)>
	//    4    8:ireturn         
	}

	public boolean hasAnnotations()
	{
		return _classAnnotations().size() > 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:invokevirtual   #647 <Method int AnnotationMap.size()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		return _classAnnotations().hasOneOf(aclass);
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method AnnotationMap _classAnnotations()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #651 <Method boolean AnnotationMap.hasOneOf(Class[])>
	//    4    8:ireturn         
	}

	public int hashCode()
	{
		return _class.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Class _class>
	//    2    4:invokevirtual   #531 <Method String Class.getName()>
	//    3    7:invokevirtual   #657 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public Iterable memberMethods()
	{
		if(_memberMethods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//*   2    4:ifnonnull       11
			resolveMemberMethods();
	//    3    7:aload_0         
	//    4    8:invokespecial   #611 <Method void resolveMemberMethods()>
		return ((Iterable) (_memberMethods));
	//    5   11:aload_0         
	//    6   12:getfield        #349 <Field AnnotatedMethodMap _memberMethods>
	//    7   15:areturn         
	}

	public JavaType resolveType(Type type)
	{
		return _typeFactory.constructType(type, _bindings);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field TypeFactory _typeFactory>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field TypeBindings _bindings>
	//    5    9:invokevirtual   #667 <Method JavaType TypeFactory.constructType(Type, TypeBindings)>
	//    6   12:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[AnnotedClass ").append(_class.getName()).append("]").toString();
	//    0    0:new             #523 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #524 <Method void StringBuilder()>
	//    3    7:ldc2            #669 <String "[AnnotedClass ">
	//    4   10:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #56  <Field Class _class>
	//    7   17:invokevirtual   #531 <Method String Class.getName()>
	//    8   20:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc2            #671 <String "]">
	//   10   26:invokevirtual   #530 <Method StringBuilder StringBuilder.append(String)>
	//   11   29:invokevirtual   #543 <Method String StringBuilder.toString()>
	//   12   32:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #676 <Method AnnotatedClass withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedClass withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedClass(_type, _class, _bindings, _superTypes, _annotationIntrospector, _mixInResolver, _typeFactory, annotationmap);
	//    0    0:new             #2   <Class AnnotatedClass>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field JavaType _type>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field Class _class>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field TypeBindings _bindings>
	//    8   16:aload_0         
	//    9   17:getfield        #60  <Field List _superTypes>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   24:aload_0         
	//   13   25:getfield        #66  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field TypeFactory _typeFactory>
	//   16   32:aload_1         
	//   17   33:invokespecial   #234 <Method void AnnotatedClass(JavaType, Class, TypeBindings, List, AnnotationIntrospector, ClassIntrospector$MixInResolver, TypeFactory, AnnotationMap)>
	//   18   36:areturn         
	}

	private static final AnnotationMap NO_ANNOTATION_MAPS[] = new AnnotationMap[0];
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final TypeBindings _bindings;
	protected final Class _class;
	protected AnnotationMap _classAnnotations;
	protected List _constructors;
	protected List _creatorMethods;
	protected boolean _creatorsResolved;
	protected AnnotatedConstructor _defaultConstructor;
	protected List _fields;
	protected AnnotatedMethodMap _memberMethods;
	protected final ClassIntrospector.MixInResolver _mixInResolver;
	protected final Class _primaryMixIn;
	protected final List _superTypes;
	protected final JavaType _type;
	protected final TypeFactory _typeFactory;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       AnnotationMap[]
	//    2    4:putstatic       #45  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//*   3    7:return          
	}
}
