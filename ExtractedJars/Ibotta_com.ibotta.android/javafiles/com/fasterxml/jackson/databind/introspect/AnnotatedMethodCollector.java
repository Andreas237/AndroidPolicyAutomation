// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			CollectorBase, MemberKey, AnnotationCollector, AnnotatedMethodMap, 
//			TypeResolutionContext, AnnotatedMethod

public class AnnotatedMethodCollector extends CollectorBase
{
	private static final class MethodBuilder
	{

		public AnnotatedMethod build()
		{
			Method method1 = method;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Method method>
		//    2    4:astore_1        
			if(method1 == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return new AnnotatedMethod(typeContext, method1, annotations.asAnnotationMap(), ((AnnotationMap []) (null)));
		//    7   11:new             #29  <Class AnnotatedMethod>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #20  <Field TypeResolutionContext typeContext>
		//   11   19:aload_1         
		//   12   20:aload_0         
		//   13   21:getfield        #24  <Field AnnotationCollector annotations>
		//   14   24:invokevirtual   #35  <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
		//   15   27:aconst_null     
		//   16   28:invokespecial   #38  <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
		//   17   31:areturn         
		}

		public AnnotationCollector annotations;
		public Method method;
		public TypeResolutionContext typeContext;

		public MethodBuilder(TypeResolutionContext typeresolutioncontext, Method method1, AnnotationCollector annotationcollector)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			typeContext = typeresolutioncontext;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field TypeResolutionContext typeContext>
			method = method1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Method method>
			annotations = annotationcollector;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field AnnotationCollector annotations>
		//   11   19:return          
		}
	}


	AnnotatedMethodCollector(AnnotationIntrospector annotationintrospector, ClassIntrospector.MixInResolver mixinresolver)
	{
		super(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void CollectorBase(AnnotationIntrospector)>
		if(annotationintrospector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			mixinresolver = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		_mixInResolver = mixinresolver;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #16  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   10   16:return          
	}

	private void _addMemberMethods(TypeResolutionContext typeresolutioncontext, Class class1, Map map, Class class2)
	{
		if(class2 != null)
	//*   0    0:aload           4
	//*   1    2:ifnull          14
			_addMethodMixIns(typeresolutioncontext, class1, map, class2);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:invokevirtual   #22  <Method void _addMethodMixIns(TypeResolutionContext, Class, Map, Class)>
		if(class1 == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       19
			return;
	//   10   18:return          
		class2 = ((Class) (ClassUtil.getClassMethods(class1)));
	//   11   19:aload_2         
	//   12   20:invokestatic    #28  <Method Method[] ClassUtil.getClassMethods(Class)>
	//   13   23:astore          4
		int j = class2.length;
	//   14   25:aload           4
	//   15   27:arraylength     
	//   16   28:istore          6
		for(int i = 0; i < j; i++)
	//*  17   30:iconst_0        
	//*  18   31:istore          5
	//*  19   33:iload           5
	//*  20   35:iload           6
	//*  21   37:icmpge          219
		{
			Method method = ((Method) (class2[i]));
	//   22   40:aload           4
	//   23   42:iload           5
	//   24   44:aaload          
	//   25   45:astore          7
			if(!_isIncludableMemberMethod(method))
	//*  26   47:aload_0         
	//*  27   48:aload           7
	//*  28   50:invokespecial   #32  <Method boolean _isIncludableMemberMethod(Method)>
	//*  29   53:ifne            59
				continue;
	//   30   56:goto            210
			Object obj = ((Object) (new MemberKey(method)));
	//   31   59:new             #34  <Class MemberKey>
	//   32   62:dup             
	//   33   63:aload           7
	//   34   65:invokespecial   #37  <Method void MemberKey(Method)>
	//   35   68:astore          8
			class1 = ((Class) ((MethodBuilder)map.get(obj)));
	//   36   70:aload_3         
	//   37   71:aload           8
	//   38   73:invokeinterface #43  <Method Object Map.get(Object)>
	//   39   78:checkcast       #6   <Class AnnotatedMethodCollector$MethodBuilder>
	//   40   81:astore_2        
			if(class1 == null)
	//*  41   82:aload_2         
	//*  42   83:ifnonnull       133
			{
				if(_intr == null)
	//*  43   86:aload_0         
	//*  44   87:getfield        #47  <Field AnnotationIntrospector _intr>
	//*  45   90:ifnonnull       100
					class1 = ((Class) (AnnotationCollector.emptyCollector()));
	//   46   93:invokestatic    #53  <Method AnnotationCollector AnnotationCollector.emptyCollector()>
	//   47   96:astore_2        
				else
	//*  48   97:goto            110
					class1 = ((Class) (collectAnnotations(method.getDeclaredAnnotations())));
	//   49  100:aload_0         
	//   50  101:aload           7
	//   51  103:invokevirtual   #59  <Method java.lang.annotation.Annotation[] Method.getDeclaredAnnotations()>
	//   52  106:invokevirtual   #63  <Method AnnotationCollector collectAnnotations(java.lang.annotation.Annotation[])>
	//   53  109:astore_2        
				map.put(obj, ((Object) (new MethodBuilder(typeresolutioncontext, method, ((AnnotationCollector) (class1))))));
	//   54  110:aload_3         
	//   55  111:aload           8
	//   56  113:new             #6   <Class AnnotatedMethodCollector$MethodBuilder>
	//   57  116:dup             
	//   58  117:aload_1         
	//   59  118:aload           7
	//   60  120:aload_2         
	//   61  121:invokespecial   #66  <Method void AnnotatedMethodCollector$MethodBuilder(TypeResolutionContext, Method, AnnotationCollector)>
	//   62  124:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   63  129:pop             
				continue;
	//   64  130:goto            210
			}
			if(_intr != null)
	//*  65  133:aload_0         
	//*  66  134:getfield        #47  <Field AnnotationIntrospector _intr>
	//*  67  137:ifnull          157
				class1.annotations = collectDefaultAnnotations(((MethodBuilder) (class1)).annotations, method.getDeclaredAnnotations());
	//   68  140:aload_2         
	//   69  141:aload_0         
	//   70  142:aload_2         
	//   71  143:getfield        #74  <Field AnnotationCollector AnnotatedMethodCollector$MethodBuilder.annotations>
	//   72  146:aload           7
	//   73  148:invokevirtual   #59  <Method java.lang.annotation.Annotation[] Method.getDeclaredAnnotations()>
	//   74  151:invokevirtual   #78  <Method AnnotationCollector collectDefaultAnnotations(AnnotationCollector, java.lang.annotation.Annotation[])>
	//   75  154:putfield        #74  <Field AnnotationCollector AnnotatedMethodCollector$MethodBuilder.annotations>
			obj = ((Object) (((MethodBuilder) (class1)).method));
	//   76  157:aload_2         
	//   77  158:getfield        #82  <Field Method AnnotatedMethodCollector$MethodBuilder.method>
	//   78  161:astore          8
			if(obj == null)
	//*  79  163:aload           8
	//*  80  165:ifnonnull       177
			{
				class1.method = method;
	//   81  168:aload_2         
	//   82  169:aload           7
	//   83  171:putfield        #82  <Field Method AnnotatedMethodCollector$MethodBuilder.method>
				continue;
	//   84  174:goto            210
			}
			if(Modifier.isAbstract(((Method) (obj)).getModifiers()) && !Modifier.isAbstract(method.getModifiers()))
	//*  85  177:aload           8
	//*  86  179:invokevirtual   #86  <Method int Method.getModifiers()>
	//*  87  182:invokestatic    #92  <Method boolean Modifier.isAbstract(int)>
	//*  88  185:ifeq            210
	//*  89  188:aload           7
	//*  90  190:invokevirtual   #86  <Method int Method.getModifiers()>
	//*  91  193:invokestatic    #92  <Method boolean Modifier.isAbstract(int)>
	//*  92  196:ifne            210
			{
				class1.method = method;
	//   93  199:aload_2         
	//   94  200:aload           7
	//   95  202:putfield        #82  <Field Method AnnotatedMethodCollector$MethodBuilder.method>
				class1.typeContext = typeresolutioncontext;
	//   96  205:aload_2         
	//   97  206:aload_1         
	//   98  207:putfield        #96  <Field TypeResolutionContext AnnotatedMethodCollector$MethodBuilder.typeContext>
			}
		}

	//   99  210:iload           5
	//  100  212:iconst_1        
	//  101  213:iadd            
	//  102  214:istore          5
	//* 103  216:goto            33
	//  104  219:return          
	}

	private boolean _isIncludableMemberMethod(Method method)
	{
		boolean flag1 = Modifier.isStatic(method.getModifiers());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #86  <Method int Method.getModifiers()>
	//    2    4:invokestatic    #101 <Method boolean Modifier.isStatic(int)>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(!flag1 && !method.isSynthetic())
	//*   6   10:iload_3         
	//*   7   11:ifne            43
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #105 <Method boolean Method.isSynthetic()>
	//*  10   18:ifne            43
		{
			if(method.isBridge())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #108 <Method boolean Method.isBridge()>
	//*  13   25:ifeq            30
				return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
			if(method.getParameterTypes().length <= 2)
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #112 <Method Class[] Method.getParameterTypes()>
	//*  18   34:arraylength     
	//*  19   35:iconst_2        
	//*  20   36:icmpgt          41
				flag = true;
	//   21   39:iconst_1        
	//   22   40:istore_2        
			return flag;
	//   23   41:iload_2         
	//   24   42:ireturn         
		} else
		{
			return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
		}
	}

	public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationintrospector, TypeResolutionContext typeresolutioncontext, ClassIntrospector.MixInResolver mixinresolver, TypeFactory typefactory, JavaType javatype, List list, Class class1)
	{
		return (new AnnotatedMethodCollector(annotationintrospector, mixinresolver)).collect(typefactory, typeresolutioncontext, javatype, list, class1);
	//    0    0:new             #2   <Class AnnotatedMethodCollector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #116 <Method void AnnotatedMethodCollector(AnnotationIntrospector, ClassIntrospector$MixInResolver)>
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:invokevirtual   #120 <Method AnnotatedMethodMap collect(TypeFactory, TypeResolutionContext, JavaType, List, Class)>
	//   11   20:areturn         
	}

	protected void _addMethodMixIns(TypeResolutionContext typeresolutioncontext, Class class1, Map map, Class class2)
	{
		if(_intr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field AnnotationIntrospector _intr>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(class1 = ((Class) (ClassUtil.findRawSuperTypes(class2, class1, true).iterator())); ((Iterator) (class1)).hasNext();)
	//*   4    8:aload           4
	//*   5   10:aload_2         
	//*   6   11:iconst_1        
	//*   7   12:invokestatic    #125 <Method List ClassUtil.findRawSuperTypes(Class, Class, boolean)>
	//*   8   15:invokeinterface #131 <Method Iterator List.iterator()>
	//*   9   20:astore_2        
	//*  10   21:aload_2         
	//*  11   22:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  12   27:ifeq            166
		{
			class2 = ((Class) (ClassUtil.getDeclaredMethods((Class)((Iterator) (class1)).next())));
	//   13   30:aload_2         
	//   14   31:invokeinterface #140 <Method Object Iterator.next()>
	//   15   36:checkcast       #142 <Class Class>
	//   16   39:invokestatic    #145 <Method Method[] ClassUtil.getDeclaredMethods(Class)>
	//   17   42:astore          4
			int j = class2.length;
	//   18   44:aload           4
	//   19   46:arraylength     
	//   20   47:istore          6
			int i = 0;
	//   21   49:iconst_0        
	//   22   50:istore          5
			while(i < j) 
	//*  23   52:iload           5
	//*  24   54:iload           6
	//*  25   56:icmpge          21
			{
				Method method = ((Method) (class2[i]));
	//   26   59:aload           4
	//   27   61:iload           5
	//   28   63:aaload          
	//   29   64:astore          9
				if(_isIncludableMemberMethod(method))
	//*  30   66:aload_0         
	//*  31   67:aload           9
	//*  32   69:invokespecial   #32  <Method boolean _isIncludableMemberMethod(Method)>
	//*  33   72:ifne            78
	//*  34   75:goto            157
				{
					MemberKey memberkey = new MemberKey(method);
	//   35   78:new             #34  <Class MemberKey>
	//   36   81:dup             
	//   37   82:aload           9
	//   38   84:invokespecial   #37  <Method void MemberKey(Method)>
	//   39   87:astore          7
					MethodBuilder methodbuilder = (MethodBuilder)map.get(((Object) (memberkey)));
	//   40   89:aload_3         
	//   41   90:aload           7
	//   42   92:invokeinterface #43  <Method Object Map.get(Object)>
	//   43   97:checkcast       #6   <Class AnnotatedMethodCollector$MethodBuilder>
	//   44  100:astore          8
					java.lang.annotation.Annotation aannotation[] = method.getDeclaredAnnotations();
	//   45  102:aload           9
	//   46  104:invokevirtual   #59  <Method java.lang.annotation.Annotation[] Method.getDeclaredAnnotations()>
	//   47  107:astore          9
					if(methodbuilder == null)
	//*  48  109:aload           8
	//*  49  111:ifnonnull       141
						map.put(((Object) (memberkey)), ((Object) (new MethodBuilder(typeresolutioncontext, ((Method) (null)), collectAnnotations(aannotation)))));
	//   50  114:aload_3         
	//   51  115:aload           7
	//   52  117:new             #6   <Class AnnotatedMethodCollector$MethodBuilder>
	//   53  120:dup             
	//   54  121:aload_1         
	//   55  122:aconst_null     
	//   56  123:aload_0         
	//   57  124:aload           9
	//   58  126:invokevirtual   #63  <Method AnnotationCollector collectAnnotations(java.lang.annotation.Annotation[])>
	//   59  129:invokespecial   #66  <Method void AnnotatedMethodCollector$MethodBuilder(TypeResolutionContext, Method, AnnotationCollector)>
	//   60  132:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   61  137:pop             
					else
	//*  62  138:goto            157
						methodbuilder.annotations = collectDefaultAnnotations(methodbuilder.annotations, aannotation);
	//   63  141:aload           8
	//   64  143:aload_0         
	//   65  144:aload           8
	//   66  146:getfield        #74  <Field AnnotationCollector AnnotatedMethodCollector$MethodBuilder.annotations>
	//   67  149:aload           9
	//   68  151:invokevirtual   #78  <Method AnnotationCollector collectDefaultAnnotations(AnnotationCollector, java.lang.annotation.Annotation[])>
	//   69  154:putfield        #74  <Field AnnotationCollector AnnotatedMethodCollector$MethodBuilder.annotations>
				}
				i++;
	//   70  157:iload           5
	//   71  159:iconst_1        
	//   72  160:iadd            
	//   73  161:istore          5
			}
		}

	//*  74  163:goto            52
	//   75  166:return          
	}

	AnnotatedMethodMap collect(TypeFactory typefactory, TypeResolutionContext typeresolutioncontext, JavaType javatype, List list, Class class1)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #147 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void LinkedHashMap()>
	//    3    7:astore          6
		_addMemberMethods(typeresolutioncontext, javatype.getRawClass(), ((Map) (linkedhashmap)), class1);
	//    4    9:aload_0         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:invokevirtual   #156 <Method Class JavaType.getRawClass()>
	//    8   15:aload           6
	//    9   17:aload           5
	//   10   19:invokespecial   #158 <Method void _addMemberMethods(TypeResolutionContext, Class, Map, Class)>
		for(javatype = ((JavaType) (list.iterator())); ((Iterator) (javatype)).hasNext(); _addMemberMethods(((TypeResolutionContext) (new TypeResolutionContext.Basic(typefactory, ((JavaType) (list)).getBindings()))), ((JavaType) (list)).getRawClass(), ((Map) (linkedhashmap)), ((Class) (typeresolutioncontext))))
	//*  11   22:aload           4
	//*  12   24:invokeinterface #131 <Method Iterator List.iterator()>
	//*  13   29:astore_3        
	//*  14   30:aload_3         
	//*  15   31:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            104
		{
			list = ((List) ((JavaType)((Iterator) (javatype)).next()));
	//   17   39:aload_3         
	//   18   40:invokeinterface #140 <Method Object Iterator.next()>
	//   19   45:checkcast       #152 <Class JavaType>
	//   20   48:astore          4
			typeresolutioncontext = ((TypeResolutionContext) (_mixInResolver));
	//   21   50:aload_0         
	//   22   51:getfield        #16  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   23   54:astore_2        
			if(typeresolutioncontext == null)
	//*  24   55:aload_2         
	//*  25   56:ifnonnull       64
				typeresolutioncontext = null;
	//   26   59:aconst_null     
	//   27   60:astore_2        
			else
	//*  28   61:goto            76
				typeresolutioncontext = ((TypeResolutionContext) (((ClassIntrospector.MixInResolver) (typeresolutioncontext)).findMixInClassFor(((JavaType) (list)).getRawClass())));
	//   29   64:aload_2         
	//   30   65:aload           4
	//   31   67:invokevirtual   #156 <Method Class JavaType.getRawClass()>
	//   32   70:invokeinterface #164 <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   33   75:astore_2        
		}

	//   34   76:aload_0         
	//   35   77:new             #166 <Class TypeResolutionContext$Basic>
	//   36   80:dup             
	//   37   81:aload_1         
	//   38   82:aload           4
	//   39   84:invokevirtual   #170 <Method com.fasterxml.jackson.databind.type.TypeBindings JavaType.getBindings()>
	//   40   87:invokespecial   #173 <Method void TypeResolutionContext$Basic(TypeFactory, com.fasterxml.jackson.databind.type.TypeBindings)>
	//   41   90:aload           4
	//   42   92:invokevirtual   #156 <Method Class JavaType.getRawClass()>
	//   43   95:aload           6
	//   44   97:aload_2         
	//   45   98:invokespecial   #158 <Method void _addMemberMethods(TypeResolutionContext, Class, Map, Class)>
	//*  46  101:goto            30
		if(((Map) (linkedhashmap)).isEmpty())
	//*  47  104:aload           6
	//*  48  106:invokeinterface #176 <Method boolean Map.isEmpty()>
	//*  49  111:ifeq            122
			return new AnnotatedMethodMap();
	//   50  114:new             #178 <Class AnnotatedMethodMap>
	//   51  117:dup             
	//   52  118:invokespecial   #179 <Method void AnnotatedMethodMap()>
	//   53  121:areturn         
		typefactory = ((TypeFactory) (new LinkedHashMap(((Map) (linkedhashmap)).size())));
	//   54  122:new             #147 <Class LinkedHashMap>
	//   55  125:dup             
	//   56  126:aload           6
	//   57  128:invokeinterface #182 <Method int Map.size()>
	//   58  133:invokespecial   #185 <Method void LinkedHashMap(int)>
	//   59  136:astore_1        
		typeresolutioncontext = ((TypeResolutionContext) (((Map) (linkedhashmap)).entrySet().iterator()));
	//   60  137:aload           6
	//   61  139:invokeinterface #189 <Method Set Map.entrySet()>
	//   62  144:invokeinterface #192 <Method Iterator Set.iterator()>
	//   63  149:astore_2        
		do
		{
			if(!((Iterator) (typeresolutioncontext)).hasNext())
				break;
	//   64  150:aload_2         
	//   65  151:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//   66  156:ifeq            206
			javatype = ((JavaType) ((java.util.Map.Entry)((Iterator) (typeresolutioncontext)).next()));
	//   67  159:aload_2         
	//   68  160:invokeinterface #140 <Method Object Iterator.next()>
	//   69  165:checkcast       #194 <Class java.util.Map$Entry>
	//   70  168:astore_3        
			list = ((List) (((MethodBuilder)((java.util.Map.Entry) (javatype)).getValue()).build()));
	//   71  169:aload_3         
	//   72  170:invokeinterface #197 <Method Object java.util.Map$Entry.getValue()>
	//   73  175:checkcast       #6   <Class AnnotatedMethodCollector$MethodBuilder>
	//   74  178:invokevirtual   #201 <Method AnnotatedMethod AnnotatedMethodCollector$MethodBuilder.build()>
	//   75  181:astore          4
			if(list != null)
	//*  76  183:aload           4
	//*  77  185:ifnull          150
				((Map) (typefactory)).put(((java.util.Map.Entry) (javatype)).getKey(), ((Object) (list)));
	//   78  188:aload_1         
	//   79  189:aload_3         
	//   80  190:invokeinterface #204 <Method Object java.util.Map$Entry.getKey()>
	//   81  195:aload           4
	//   82  197:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   83  202:pop             
		} while(true);
	//   84  203:goto            150
		return new AnnotatedMethodMap(((Map) (typefactory)));
	//   85  206:new             #178 <Class AnnotatedMethodMap>
	//   86  209:dup             
	//   87  210:aload_1         
	//   88  211:invokespecial   #207 <Method void AnnotatedMethodMap(Map)>
	//   89  214:areturn         
	}

	private final ClassIntrospector.MixInResolver _mixInResolver;
}
