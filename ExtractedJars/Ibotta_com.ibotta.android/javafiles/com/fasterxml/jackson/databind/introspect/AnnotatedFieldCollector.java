// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			CollectorBase, TypeResolutionContext, AnnotationCollector, AnnotatedField

public class AnnotatedFieldCollector extends CollectorBase
{
	private static final class FieldBuilder
	{

		public AnnotatedField build()
		{
			return new AnnotatedField(typeContext, field, annotations.asAnnotationMap());
		//    0    0:new             #35  <Class AnnotatedField>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field TypeResolutionContext typeContext>
		//    4    8:aload_0         
		//    5    9:getfield        #22  <Field Field field>
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field AnnotationCollector annotations>
		//    8   16:invokevirtual   #39  <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
		//    9   19:invokespecial   #42  <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
		//   10   22:areturn         
		}

		public AnnotationCollector annotations;
		public final Field field;
		public final TypeResolutionContext typeContext;

		public FieldBuilder(TypeResolutionContext typeresolutioncontext, Field field1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			typeContext = typeresolutioncontext;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field TypeResolutionContext typeContext>
			field = field1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Field field>
			annotations = AnnotationCollector.emptyCollector();
		//    8   14:aload_0         
		//    9   15:invokestatic    #28  <Method AnnotationCollector AnnotationCollector.emptyCollector()>
		//   10   18:putfield        #30  <Field AnnotationCollector annotations>
		//   11   21:return          
		}
	}


	AnnotatedFieldCollector(AnnotationIntrospector annotationintrospector, TypeFactory typefactory, ClassIntrospector.MixInResolver mixinresolver)
	{
		super(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void CollectorBase(AnnotationIntrospector)>
		_typeFactory = typefactory;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field TypeFactory _typeFactory>
		if(annotationintrospector == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			mixinresolver = null;
	//    8   14:aconst_null     
	//    9   15:astore_3        
		_mixInResolver = mixinresolver;
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:putfield        #20  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   13   21:return          
	}

	private void _addFieldMixIns(Class class1, Class class2, Map map)
	{
		for(class1 = ((Class) (ClassUtil.findSuperClasses(class1, class2, true).iterator())); ((Iterator) (class1)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:iconst_1        
	//*   3    3:invokestatic    #29  <Method List ClassUtil.findSuperClasses(Class, Class, boolean)>
	//*   4    6:invokeinterface #35  <Method Iterator List.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            115
		{
			class2 = ((Class) (ClassUtil.getDeclaredFields((Class)((Iterator) (class1)).next())));
	//    9   21:aload_1         
	//   10   22:invokeinterface #45  <Method Object Iterator.next()>
	//   11   27:checkcast       #47  <Class Class>
	//   12   30:invokestatic    #51  <Method Field[] ClassUtil.getDeclaredFields(Class)>
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
	//*  28   57:invokespecial   #55  <Method boolean _isIncludableField(Field)>
	//*  29   60:ifne            66
	//*  30   63:goto            106
				{
					FieldBuilder fieldbuilder = (FieldBuilder)map.get(((Object) (field.getName())));
	//   31   66:aload_3         
	//   32   67:aload           6
	//   33   69:invokevirtual   #61  <Method String Field.getName()>
	//   34   72:invokeinterface #67  <Method Object Map.get(Object)>
	//   35   77:checkcast       #6   <Class AnnotatedFieldCollector$FieldBuilder>
	//   36   80:astore          7
					if(fieldbuilder != null)
	//*  37   82:aload           7
	//*  38   84:ifnull          106
						fieldbuilder.annotations = collectAnnotations(fieldbuilder.annotations, field.getDeclaredAnnotations());
	//   39   87:aload           7
	//   40   89:aload_0         
	//   41   90:aload           7
	//   42   92:getfield        #71  <Field AnnotationCollector AnnotatedFieldCollector$FieldBuilder.annotations>
	//   43   95:aload           6
	//   44   97:invokevirtual   #75  <Method java.lang.annotation.Annotation[] Field.getDeclaredAnnotations()>
	//   45  100:invokevirtual   #79  <Method AnnotationCollector collectAnnotations(AnnotationCollector, java.lang.annotation.Annotation[])>
	//   46  103:putfield        #71  <Field AnnotationCollector AnnotatedFieldCollector$FieldBuilder.annotations>
				}
				i++;
	//   47  106:iload           4
	//   48  108:iconst_1        
	//   49  109:iadd            
	//   50  110:istore          4
			}
		}

	//*  51  112:goto            41
	//   52  115:return          
	}

	private Map _findFields(TypeResolutionContext typeresolutioncontext, JavaType javatype, Map map)
	{
		JavaType javatype1 = javatype.getSuperClass();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #89  <Method JavaType JavaType.getSuperClass()>
	//    2    4:astore          7
		if(javatype1 == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       13
			return map;
	//    5   11:aload_3         
	//    6   12:areturn         
		Class class1 = javatype.getRawClass();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #93  <Method Class JavaType.getRawClass()>
	//    9   17:astore          6
		javatype = ((JavaType) (_findFields(((TypeResolutionContext) (new TypeResolutionContext.Basic(_typeFactory, javatype1.getBindings()))), javatype1, map)));
	//   10   19:aload_0         
	//   11   20:new             #95  <Class TypeResolutionContext$Basic>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:getfield        #18  <Field TypeFactory _typeFactory>
	//   15   28:aload           7
	//   16   30:invokevirtual   #99  <Method com.fasterxml.jackson.databind.type.TypeBindings JavaType.getBindings()>
	//   17   33:invokespecial   #102 <Method void TypeResolutionContext$Basic(TypeFactory, com.fasterxml.jackson.databind.type.TypeBindings)>
	//   18   36:aload           7
	//   19   38:aload_3         
	//   20   39:invokespecial   #104 <Method Map _findFields(TypeResolutionContext, JavaType, Map)>
	//   21   42:astore_2        
		Field afield[] = ClassUtil.getDeclaredFields(class1);
	//   22   43:aload           6
	//   23   45:invokestatic    #51  <Method Field[] ClassUtil.getDeclaredFields(Class)>
	//   24   48:astore          7
		int j = afield.length;
	//   25   50:aload           7
	//   26   52:arraylength     
	//   27   53:istore          5
		for(int i = 0; i < j; i++)
	//*  28   55:iconst_0        
	//*  29   56:istore          4
	//*  30   58:iload           4
	//*  31   60:iload           5
	//*  32   62:icmpge          157
		{
			Field field = afield[i];
	//   33   65:aload           7
	//   34   67:iload           4
	//   35   69:aaload          
	//   36   70:astore          8
			if(!_isIncludableField(field))
	//*  37   72:aload_0         
	//*  38   73:aload           8
	//*  39   75:invokespecial   #55  <Method boolean _isIncludableField(Field)>
	//*  40   78:ifne            84
				continue;
	//   41   81:goto            148
			map = ((Map) (javatype));
	//   42   84:aload_2         
	//   43   85:astore_3        
			if(javatype == null)
	//*  44   86:aload_2         
	//*  45   87:ifnonnull       98
				map = ((Map) (new LinkedHashMap()));
	//   46   90:new             #106 <Class LinkedHashMap>
	//   47   93:dup             
	//   48   94:invokespecial   #109 <Method void LinkedHashMap()>
	//   49   97:astore_3        
			javatype = ((JavaType) (new FieldBuilder(typeresolutioncontext, field)));
	//   50   98:new             #6   <Class AnnotatedFieldCollector$FieldBuilder>
	//   51  101:dup             
	//   52  102:aload_1         
	//   53  103:aload           8
	//   54  105:invokespecial   #112 <Method void AnnotatedFieldCollector$FieldBuilder(TypeResolutionContext, Field)>
	//   55  108:astore_2        
			if(_intr != null)
	//*  56  109:aload_0         
	//*  57  110:getfield        #116 <Field AnnotationIntrospector _intr>
	//*  58  113:ifnull          133
				javatype.annotations = collectAnnotations(((FieldBuilder) (javatype)).annotations, field.getDeclaredAnnotations());
	//   59  116:aload_2         
	//   60  117:aload_0         
	//   61  118:aload_2         
	//   62  119:getfield        #71  <Field AnnotationCollector AnnotatedFieldCollector$FieldBuilder.annotations>
	//   63  122:aload           8
	//   64  124:invokevirtual   #75  <Method java.lang.annotation.Annotation[] Field.getDeclaredAnnotations()>
	//   65  127:invokevirtual   #79  <Method AnnotationCollector collectAnnotations(AnnotationCollector, java.lang.annotation.Annotation[])>
	//   66  130:putfield        #71  <Field AnnotationCollector AnnotatedFieldCollector$FieldBuilder.annotations>
			map.put(((Object) (field.getName())), ((Object) (javatype)));
	//   67  133:aload_3         
	//   68  134:aload           8
	//   69  136:invokevirtual   #61  <Method String Field.getName()>
	//   70  139:aload_2         
	//   71  140:invokeinterface #120 <Method Object Map.put(Object, Object)>
	//   72  145:pop             
			javatype = ((JavaType) (map));
	//   73  146:aload_3         
	//   74  147:astore_2        
		}

	//   75  148:iload           4
	//   76  150:iconst_1        
	//   77  151:iadd            
	//   78  152:istore          4
	//*  79  154:goto            58
		typeresolutioncontext = ((TypeResolutionContext) (_mixInResolver));
	//   80  157:aload_0         
	//   81  158:getfield        #20  <Field ClassIntrospector$MixInResolver _mixInResolver>
	//   82  161:astore_1        
		if(typeresolutioncontext != null)
	//*  83  162:aload_1         
	//*  84  163:ifnull          187
		{
			typeresolutioncontext = ((TypeResolutionContext) (((ClassIntrospector.MixInResolver) (typeresolutioncontext)).findMixInClassFor(class1)));
	//   85  166:aload_1         
	//   86  167:aload           6
	//   87  169:invokeinterface #126 <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   88  174:astore_1        
			if(typeresolutioncontext != null)
	//*  89  175:aload_1         
	//*  90  176:ifnull          187
				_addFieldMixIns(((Class) (typeresolutioncontext)), class1, ((Map) (javatype)));
	//   91  179:aload_0         
	//   92  180:aload_1         
	//   93  181:aload           6
	//   94  183:aload_2         
	//   95  184:invokespecial   #128 <Method void _addFieldMixIns(Class, Class, Map)>
		}
		return ((Map) (javatype));
	//   96  187:aload_2         
	//   97  188:areturn         
	}

	private boolean _isIncludableField(Field field)
	{
		if(field.isSynthetic())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #132 <Method boolean Field.isSynthetic()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		return !Modifier.isStatic(field.getModifiers());
	//    5    9:aload_1         
	//    6   10:invokevirtual   #136 <Method int Field.getModifiers()>
	//    7   13:invokestatic    #142 <Method boolean Modifier.isStatic(int)>
	//    8   16:ifeq            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public static List collectFields(AnnotationIntrospector annotationintrospector, TypeResolutionContext typeresolutioncontext, ClassIntrospector.MixInResolver mixinresolver, TypeFactory typefactory, JavaType javatype)
	{
		return (new AnnotatedFieldCollector(annotationintrospector, typefactory, mixinresolver)).collect(typeresolutioncontext, javatype);
	//    0    0:new             #2   <Class AnnotatedFieldCollector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:invokespecial   #146 <Method void AnnotatedFieldCollector(AnnotationIntrospector, TypeFactory, ClassIntrospector$MixInResolver)>
	//    6   10:aload_1         
	//    7   11:aload           4
	//    8   13:invokevirtual   #150 <Method List collect(TypeResolutionContext, JavaType)>
	//    9   16:areturn         
	}

	List collect(TypeResolutionContext typeresolutioncontext, JavaType javatype)
	{
		javatype = ((JavaType) (_findFields(typeresolutioncontext, javatype, ((Map) (null)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #104 <Method Map _findFields(TypeResolutionContext, JavaType, Map)>
	//    5    7:astore_2        
		if(javatype == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       16
			return Collections.emptyList();
	//    8   12:invokestatic    #157 <Method List Collections.emptyList()>
	//    9   15:areturn         
		typeresolutioncontext = ((TypeResolutionContext) (new ArrayList(((Map) (javatype)).size())));
	//   10   16:new             #159 <Class ArrayList>
	//   11   19:dup             
	//   12   20:aload_2         
	//   13   21:invokeinterface #162 <Method int Map.size()>
	//   14   26:invokespecial   #165 <Method void ArrayList(int)>
	//   15   29:astore_1        
		for(javatype = ((JavaType) (((Map) (javatype)).values().iterator())); ((Iterator) (javatype)).hasNext(); ((List) (typeresolutioncontext)).add(((Object) (((FieldBuilder)((Iterator) (javatype)).next()).build()))));
	//   16   30:aload_2         
	//   17   31:invokeinterface #169 <Method Collection Map.values()>
	//   18   36:invokeinterface #172 <Method Iterator Collection.iterator()>
	//   19   41:astore_2        
	//   20   42:aload_2         
	//   21   43:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//   22   48:ifeq            73
	//   23   51:aload_1         
	//   24   52:aload_2         
	//   25   53:invokeinterface #45  <Method Object Iterator.next()>
	//   26   58:checkcast       #6   <Class AnnotatedFieldCollector$FieldBuilder>
	//   27   61:invokevirtual   #176 <Method AnnotatedField AnnotatedFieldCollector$FieldBuilder.build()>
	//   28   64:invokeinterface #180 <Method boolean List.add(Object)>
	//   29   69:pop             
	//*  30   70:goto            42
		return ((List) (typeresolutioncontext));
	//   31   73:aload_1         
	//   32   74:areturn         
	}

	private final ClassIntrospector.MixInResolver _mixInResolver;
	private final TypeFactory _typeFactory;
}
