// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.*;

public class StdSubtypeResolver extends SubtypeResolver
	implements Serializable
{

	public StdSubtypeResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void SubtypeResolver()>
	//    2    4:return          
	}

	protected void _collectAndResolve(AnnotatedClass annotatedclass, NamedType namedtype, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, HashMap hashmap)
	{
		NamedType namedtype1 = namedtype;
	//    0    0:aload_2         
	//    1    1:astore          6
		if(!namedtype.hasName())
	//*   2    3:aload_2         
	//*   3    4:invokevirtual   #26  <Method boolean NamedType.hasName()>
	//*   4    7:ifne            41
		{
			String s = annotationintrospector.findTypeName(annotatedclass);
	//    5   10:aload           4
	//    6   12:aload_1         
	//    7   13:invokevirtual   #32  <Method String AnnotationIntrospector.findTypeName(AnnotatedClass)>
	//    8   16:astore          7
			namedtype1 = namedtype;
	//    9   18:aload_2         
	//   10   19:astore          6
			if(s != null)
	//*  11   21:aload           7
	//*  12   23:ifnull          41
				namedtype1 = new NamedType(namedtype.getType(), s);
	//   13   26:new             #22  <Class NamedType>
	//   14   29:dup             
	//   15   30:aload_2         
	//   16   31:invokevirtual   #36  <Method Class NamedType.getType()>
	//   17   34:aload           7
	//   18   36:invokespecial   #39  <Method void NamedType(Class, String)>
	//   19   39:astore          6
		}
		if(hashmap.containsKey(((Object) (namedtype1))))
	//*  20   41:aload           5
	//*  21   43:aload           6
	//*  22   45:invokevirtual   #45  <Method boolean HashMap.containsKey(Object)>
	//*  23   48:ifeq            86
		{
			if(namedtype1.hasName() && !((NamedType)hashmap.get(((Object) (namedtype1)))).hasName())
	//*  24   51:aload           6
	//*  25   53:invokevirtual   #26  <Method boolean NamedType.hasName()>
	//*  26   56:ifeq            85
	//*  27   59:aload           5
	//*  28   61:aload           6
	//*  29   63:invokevirtual   #49  <Method Object HashMap.get(Object)>
	//*  30   66:checkcast       #22  <Class NamedType>
	//*  31   69:invokevirtual   #26  <Method boolean NamedType.hasName()>
	//*  32   72:ifne            85
				hashmap.put(((Object) (namedtype1)), ((Object) (namedtype1)));
	//   33   75:aload           5
	//   34   77:aload           6
	//   35   79:aload           6
	//   36   81:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   37   84:pop             
			return;
	//   38   85:return          
		}
		hashmap.put(((Object) (namedtype1)), ((Object) (namedtype1)));
	//   39   86:aload           5
	//   40   88:aload           6
	//   41   90:aload           6
	//   42   92:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   43   95:pop             
		annotatedclass = ((AnnotatedClass) (annotationintrospector.findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedclass)))));
	//   44   96:aload           4
	//   45   98:aload_1         
	//   46   99:invokevirtual   #57  <Method java.util.List AnnotationIntrospector.findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   47  102:astore_1        
		if(annotatedclass != null && !((Collection) (annotatedclass)).isEmpty())
	//*  48  103:aload_1         
	//*  49  104:ifnull          163
	//*  50  107:aload_1         
	//*  51  108:invokeinterface #62  <Method boolean Collection.isEmpty()>
	//*  52  113:ifne            163
			for(annotatedclass = ((AnnotatedClass) (((Collection) (annotatedclass)).iterator())); ((Iterator) (annotatedclass)).hasNext(); _collectAndResolve(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype.getType()), namedtype, mapperconfig, annotationintrospector, hashmap))
	//*  53  116:aload_1         
	//*  54  117:invokeinterface #66  <Method Iterator Collection.iterator()>
	//*  55  122:astore_1        
	//*  56  123:aload_1         
	//*  57  124:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  58  129:ifeq            163
				namedtype = (NamedType)((Iterator) (annotatedclass)).next();
	//   59  132:aload_1         
	//   60  133:invokeinterface #75  <Method Object Iterator.next()>
	//   61  138:checkcast       #22  <Class NamedType>
	//   62  141:astore_2        

	//   63  142:aload_0         
	//   64  143:aload_3         
	//   65  144:aload_2         
	//   66  145:invokevirtual   #36  <Method Class NamedType.getType()>
	//   67  148:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   68  151:aload_2         
	//   69  152:aload_3         
	//   70  153:aload           4
	//   71  155:aload           5
	//   72  157:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
	//*  73  160:goto            123
	//   74  163:return          
	}

	protected void _collectAndResolveByTypeId(AnnotatedClass annotatedclass, NamedType namedtype, MapperConfig mapperconfig, Set set, Map map)
	{
		AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #93  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    2    4:astore          7
		NamedType namedtype1 = namedtype;
	//    3    6:aload_2         
	//    4    7:astore          6
		if(!namedtype.hasName())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #26  <Method boolean NamedType.hasName()>
	//*   7   13:ifne            47
		{
			String s = annotationintrospector.findTypeName(annotatedclass);
	//    8   16:aload           7
	//    9   18:aload_1         
	//   10   19:invokevirtual   #32  <Method String AnnotationIntrospector.findTypeName(AnnotatedClass)>
	//   11   22:astore          8
			namedtype1 = namedtype;
	//   12   24:aload_2         
	//   13   25:astore          6
			if(s != null)
	//*  14   27:aload           8
	//*  15   29:ifnull          47
				namedtype1 = new NamedType(namedtype.getType(), s);
	//   16   32:new             #22  <Class NamedType>
	//   17   35:dup             
	//   18   36:aload_2         
	//   19   37:invokevirtual   #36  <Method Class NamedType.getType()>
	//   20   40:aload           8
	//   21   42:invokespecial   #39  <Method void NamedType(Class, String)>
	//   22   45:astore          6
		}
		if(namedtype1.hasName())
	//*  23   47:aload           6
	//*  24   49:invokevirtual   #26  <Method boolean NamedType.hasName()>
	//*  25   52:ifeq            70
			map.put(((Object) (namedtype1.getName())), ((Object) (namedtype1)));
	//   26   55:aload           5
	//   27   57:aload           6
	//   28   59:invokevirtual   #97  <Method String NamedType.getName()>
	//   29   62:aload           6
	//   30   64:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   31   69:pop             
		if(set.add(((Object) (namedtype1.getType()))))
	//*  32   70:aload           4
	//*  33   72:aload           6
	//*  34   74:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  35   77:invokeinterface #105 <Method boolean Set.add(Object)>
	//*  36   82:ifeq            152
		{
			annotatedclass = ((AnnotatedClass) (annotationintrospector.findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedclass)))));
	//   37   85:aload           7
	//   38   87:aload_1         
	//   39   88:invokevirtual   #57  <Method java.util.List AnnotationIntrospector.findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   40   91:astore_1        
			if(annotatedclass != null && !((Collection) (annotatedclass)).isEmpty())
	//*  41   92:aload_1         
	//*  42   93:ifnull          152
	//*  43   96:aload_1         
	//*  44   97:invokeinterface #62  <Method boolean Collection.isEmpty()>
	//*  45  102:ifne            152
				for(annotatedclass = ((AnnotatedClass) (((Collection) (annotatedclass)).iterator())); ((Iterator) (annotatedclass)).hasNext(); _collectAndResolveByTypeId(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype.getType()), namedtype, mapperconfig, set, map))
	//*  46  105:aload_1         
	//*  47  106:invokeinterface #66  <Method Iterator Collection.iterator()>
	//*  48  111:astore_1        
	//*  49  112:aload_1         
	//*  50  113:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  51  118:ifeq            152
					namedtype = (NamedType)((Iterator) (annotatedclass)).next();
	//   52  121:aload_1         
	//   53  122:invokeinterface #75  <Method Object Iterator.next()>
	//   54  127:checkcast       #22  <Class NamedType>
	//   55  130:astore_2        

	//   56  131:aload_0         
	//   57  132:aload_3         
	//   58  133:aload_2         
	//   59  134:invokevirtual   #36  <Method Class NamedType.getType()>
	//   60  137:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   61  140:aload_2         
	//   62  141:aload_3         
	//   63  142:aload           4
	//   64  144:aload           5
	//   65  146:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
		}
	//*  66  149:goto            112
	//   67  152:return          
	}

	protected Collection _combineNamedAndUnnamed(Class class1, Set set, Map map)
	{
		ArrayList arraylist = new ArrayList(map.values());
	//    0    0:new             #112 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokeinterface #116 <Method Collection Map.values()>
	//    4   10:invokespecial   #119 <Method void ArrayList(Collection)>
	//    5   13:astore          4
		for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext(); set.remove(((Object) (((NamedType)((Iterator) (map)).next()).getType()))));
	//    6   15:aload_3         
	//    7   16:invokeinterface #116 <Method Collection Map.values()>
	//    8   21:invokeinterface #66  <Method Iterator Collection.iterator()>
	//    9   26:astore_3        
	//   10   27:aload_3         
	//   11   28:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   12   33:ifeq            58
	//   13   36:aload_2         
	//   14   37:aload_3         
	//   15   38:invokeinterface #75  <Method Object Iterator.next()>
	//   16   43:checkcast       #22  <Class NamedType>
	//   17   46:invokevirtual   #36  <Method Class NamedType.getType()>
	//   18   49:invokeinterface #122 <Method boolean Set.remove(Object)>
	//   19   54:pop             
	//*  20   55:goto            27
		set = ((Set) (set.iterator()));
	//   21   58:aload_2         
	//   22   59:invokeinterface #123 <Method Iterator Set.iterator()>
	//   23   64:astore_2        
		do
		{
			if(!((Iterator) (set)).hasNext())
				break;
	//   24   65:aload_2         
	//   25   66:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   26   71:ifeq            119
			map = ((Map) ((Class)((Iterator) (set)).next()));
	//   27   74:aload_2         
	//   28   75:invokeinterface #75  <Method Object Iterator.next()>
	//   29   80:checkcast       #125 <Class Class>
	//   30   83:astore_3        
			if(map != class1 || !Modifier.isAbstract(((Class) (map)).getModifiers()))
	//*  31   84:aload_3         
	//*  32   85:aload_1         
	//*  33   86:if_acmpne       102
	//*  34   89:aload_3         
	//*  35   90:invokevirtual   #129 <Method int Class.getModifiers()>
	//*  36   93:invokestatic    #135 <Method boolean Modifier.isAbstract(int)>
	//*  37   96:ifeq            102
	//*  38   99:goto            65
				arraylist.add(((Object) (new NamedType(((Class) (map))))));
	//   39  102:aload           4
	//   40  104:new             #22  <Class NamedType>
	//   41  107:dup             
	//   42  108:aload_3         
	//   43  109:invokespecial   #138 <Method void NamedType(Class)>
	//   44  112:invokevirtual   #139 <Method boolean ArrayList.add(Object)>
	//   45  115:pop             
		} while(true);
	//   46  116:goto            65
		return ((Collection) (arraylist));
	//   47  119:aload           4
	//   48  121:areturn         
	}

	public Collection collectAndResolveSubtypesByClass(MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    2    4:astore_3        
		HashMap hashmap = new HashMap();
	//    3    5:new             #41  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #143 <Method void HashMap()>
	//    6   12:astore          4
		if(_registeredSubtypes != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//*   9   18:ifnull          93
		{
			Class class1 = annotatedclass.getRawType();
	//   10   21:aload_2         
	//   11   22:invokevirtual   #150 <Method Class AnnotatedClass.getRawType()>
	//   12   25:astore          5
			Iterator iterator = _registeredSubtypes.iterator();
	//   13   27:aload_0         
	//   14   28:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//   15   31:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//   16   34:astore          6
			do
			{
				if(!iterator.hasNext())
					break;
	//   17   36:aload           6
	//   18   38:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   19   43:ifeq            93
				NamedType namedtype = (NamedType)iterator.next();
	//   20   46:aload           6
	//   21   48:invokeinterface #75  <Method Object Iterator.next()>
	//   22   53:checkcast       #22  <Class NamedType>
	//   23   56:astore          7
				if(class1.isAssignableFrom(namedtype.getType()))
	//*  24   58:aload           5
	//*  25   60:aload           7
	//*  26   62:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  27   65:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  28   68:ifeq            36
					_collectAndResolve(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype.getType()), namedtype, mapperconfig, annotationintrospector, hashmap);
	//   29   71:aload_0         
	//   30   72:aload_1         
	//   31   73:aload           7
	//   32   75:invokevirtual   #36  <Method Class NamedType.getType()>
	//   33   78:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   34   81:aload           7
	//   35   83:aload_1         
	//   36   84:aload_3         
	//   37   85:aload           4
	//   38   87:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
			} while(true);
	//   39   90:goto            36
		}
		_collectAndResolve(annotatedclass, new NamedType(annotatedclass.getRawType(), ((String) (null))), mapperconfig, annotationintrospector, hashmap);
	//   40   93:aload_0         
	//   41   94:aload_2         
	//   42   95:new             #22  <Class NamedType>
	//   43   98:dup             
	//   44   99:aload_2         
	//   45  100:invokevirtual   #150 <Method Class AnnotatedClass.getRawType()>
	//   46  103:aconst_null     
	//   47  104:invokespecial   #39  <Method void NamedType(Class, String)>
	//   48  107:aload_1         
	//   49  108:aload_3         
	//   50  109:aload           4
	//   51  111:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
		return ((Collection) (new ArrayList(hashmap.values())));
	//   52  114:new             #112 <Class ArrayList>
	//   53  117:dup             
	//   54  118:aload           4
	//   55  120:invokevirtual   #158 <Method Collection HashMap.values()>
	//   56  123:invokespecial   #119 <Method void ArrayList(Collection)>
	//   57  126:areturn         
	}

	public Collection collectAndResolveSubtypesByClass(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    2    4:astore          4
		if(javatype == null)
	//*   3    6:aload_3         
	//*   4    7:ifnonnull       18
			javatype = ((JavaType) (annotatedmember.getRawType()));
	//    5   10:aload_2         
	//    6   11:invokevirtual   #163 <Method Class AnnotatedMember.getRawType()>
	//    7   14:astore_3        
		else
	//*   8   15:goto            23
			javatype = ((JavaType) (javatype.getRawClass()));
	//    9   18:aload_3         
	//   10   19:invokevirtual   #168 <Method Class JavaType.getRawClass()>
	//   11   22:astore_3        
		HashMap hashmap = new HashMap();
	//   12   23:new             #41  <Class HashMap>
	//   13   26:dup             
	//   14   27:invokespecial   #143 <Method void HashMap()>
	//   15   30:astore          5
		Object obj = ((Object) (_registeredSubtypes));
	//   16   32:aload_0         
	//   17   33:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//   18   36:astore          6
		if(obj != null)
	//*  19   38:aload           6
	//*  20   40:ifnull          107
		{
			obj = ((Object) (((LinkedHashSet) (obj)).iterator()));
	//   21   43:aload           6
	//   22   45:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//   23   48:astore          6
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   24   50:aload           6
	//   25   52:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   26   57:ifeq            107
				NamedType namedtype1 = (NamedType)((Iterator) (obj)).next();
	//   27   60:aload           6
	//   28   62:invokeinterface #75  <Method Object Iterator.next()>
	//   29   67:checkcast       #22  <Class NamedType>
	//   30   70:astore          7
				if(((Class) (javatype)).isAssignableFrom(namedtype1.getType()))
	//*  31   72:aload_3         
	//*  32   73:aload           7
	//*  33   75:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  34   78:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  35   81:ifeq            50
					_collectAndResolve(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype1.getType()), namedtype1, mapperconfig, annotationintrospector, hashmap);
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:aload           7
	//   39   88:invokevirtual   #36  <Method Class NamedType.getType()>
	//   40   91:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   41   94:aload           7
	//   42   96:aload_1         
	//   43   97:aload           4
	//   44   99:aload           5
	//   45  101:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
			} while(true);
	//   46  104:goto            50
		}
		if(annotatedmember != null)
	//*  47  107:aload_2         
	//*  48  108:ifnull          172
		{
			annotatedmember = ((AnnotatedMember) (annotationintrospector.findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
	//   49  111:aload           4
	//   50  113:aload_2         
	//   51  114:invokevirtual   #57  <Method java.util.List AnnotationIntrospector.findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   52  117:astore_2        
			if(annotatedmember != null)
	//*  53  118:aload_2         
	//*  54  119:ifnull          172
			{
				NamedType namedtype;
				for(annotatedmember = ((AnnotatedMember) (((Collection) (annotatedmember)).iterator())); ((Iterator) (annotatedmember)).hasNext(); _collectAndResolve(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype.getType()), namedtype, mapperconfig, annotationintrospector, hashmap))
	//*  55  122:aload_2         
	//*  56  123:invokeinterface #66  <Method Iterator Collection.iterator()>
	//*  57  128:astore_2        
	//*  58  129:aload_2         
	//*  59  130:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  60  135:ifeq            172
					namedtype = (NamedType)((Iterator) (annotatedmember)).next();
	//   61  138:aload_2         
	//   62  139:invokeinterface #75  <Method Object Iterator.next()>
	//   63  144:checkcast       #22  <Class NamedType>
	//   64  147:astore          6

	//   65  149:aload_0         
	//   66  150:aload_1         
	//   67  151:aload           6
	//   68  153:invokevirtual   #36  <Method Class NamedType.getType()>
	//   69  156:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   70  159:aload           6
	//   71  161:aload_1         
	//   72  162:aload           4
	//   73  164:aload           5
	//   74  166:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
			}
		}
	//*  75  169:goto            129
		annotatedmember = ((AnnotatedMember) (new NamedType(((Class) (javatype)), ((String) (null)))));
	//   76  172:new             #22  <Class NamedType>
	//   77  175:dup             
	//   78  176:aload_3         
	//   79  177:aconst_null     
	//   80  178:invokespecial   #39  <Method void NamedType(Class, String)>
	//   81  181:astore_2        
		_collectAndResolve(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, ((Class) (javatype))), ((NamedType) (annotatedmember)), mapperconfig, annotationintrospector, hashmap);
	//   82  182:aload_0         
	//   83  183:aload_1         
	//   84  184:aload_3         
	//   85  185:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   86  188:aload_2         
	//   87  189:aload_1         
	//   88  190:aload           4
	//   89  192:aload           5
	//   90  194:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
		return ((Collection) (new ArrayList(hashmap.values())));
	//   91  197:new             #112 <Class ArrayList>
	//   92  200:dup             
	//   93  201:aload           5
	//   94  203:invokevirtual   #158 <Method Collection HashMap.values()>
	//   95  206:invokespecial   #119 <Method void ArrayList(Collection)>
	//   96  209:areturn         
	}

	public Collection collectAndResolveSubtypesByTypeId(MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		Class class1 = annotatedclass.getRawType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #150 <Method Class AnnotatedClass.getRawType()>
	//    2    4:astore_3        
		HashSet hashset = new HashSet();
	//    3    5:new             #172 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #173 <Method void HashSet()>
	//    6   12:astore          4
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    7   14:new             #175 <Class LinkedHashMap>
	//    8   17:dup             
	//    9   18:invokespecial   #176 <Method void LinkedHashMap()>
	//   10   21:astore          5
		_collectAndResolveByTypeId(annotatedclass, new NamedType(class1, ((String) (null))), mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:new             #22  <Class NamedType>
	//   14   28:dup             
	//   15   29:aload_3         
	//   16   30:aconst_null     
	//   17   31:invokespecial   #39  <Method void NamedType(Class, String)>
	//   18   34:aload_1         
	//   19   35:aload           4
	//   20   37:aload           5
	//   21   39:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
		annotatedclass = ((AnnotatedClass) (_registeredSubtypes));
	//   22   42:aload_0         
	//   23   43:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//   24   46:astore_2        
		if(annotatedclass != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          111
		{
			annotatedclass = ((AnnotatedClass) (((LinkedHashSet) (annotatedclass)).iterator()));
	//   27   51:aload_2         
	//   28   52:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//   29   55:astore_2        
			do
			{
				if(!((Iterator) (annotatedclass)).hasNext())
					break;
	//   30   56:aload_2         
	//   31   57:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   32   62:ifeq            111
				NamedType namedtype = (NamedType)((Iterator) (annotatedclass)).next();
	//   33   65:aload_2         
	//   34   66:invokeinterface #75  <Method Object Iterator.next()>
	//   35   71:checkcast       #22  <Class NamedType>
	//   36   74:astore          6
				if(class1.isAssignableFrom(namedtype.getType()))
	//*  37   76:aload_3         
	//*  38   77:aload           6
	//*  39   79:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  40   82:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  41   85:ifeq            56
					_collectAndResolveByTypeId(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype.getType()), namedtype, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   42   88:aload_0         
	//   43   89:aload_1         
	//   44   90:aload           6
	//   45   92:invokevirtual   #36  <Method Class NamedType.getType()>
	//   46   95:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   47   98:aload           6
	//   48  100:aload_1         
	//   49  101:aload           4
	//   50  103:aload           5
	//   51  105:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
			} while(true);
	//   52  108:goto            56
		}
		return _combineNamedAndUnnamed(class1, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   53  111:aload_0         
	//   54  112:aload_3         
	//   55  113:aload           4
	//   56  115:aload           5
	//   57  117:invokevirtual   #178 <Method Collection _combineNamedAndUnnamed(Class, Set, Map)>
	//   58  120:areturn         
	}

	public Collection collectAndResolveSubtypesByTypeId(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    2    4:astore          6
		javatype = ((JavaType) (javatype.getRawClass()));
	//    3    6:aload_3         
	//    4    7:invokevirtual   #168 <Method Class JavaType.getRawClass()>
	//    5   10:astore_3        
		HashSet hashset = new HashSet();
	//    6   11:new             #172 <Class HashSet>
	//    7   14:dup             
	//    8   15:invokespecial   #173 <Method void HashSet()>
	//    9   18:astore          4
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   10   20:new             #175 <Class LinkedHashMap>
	//   11   23:dup             
	//   12   24:invokespecial   #176 <Method void LinkedHashMap()>
	//   13   27:astore          5
		NamedType namedtype2 = new NamedType(((Class) (javatype)), ((String) (null)));
	//   14   29:new             #22  <Class NamedType>
	//   15   32:dup             
	//   16   33:aload_3         
	//   17   34:aconst_null     
	//   18   35:invokespecial   #39  <Method void NamedType(Class, String)>
	//   19   38:astore          7
		_collectAndResolveByTypeId(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, ((Class) (javatype))), namedtype2, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_3         
	//   23   43:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   24   46:aload           7
	//   25   48:aload_1         
	//   26   49:aload           4
	//   27   51:aload           5
	//   28   53:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
		if(annotatedmember != null)
	//*  29   56:aload_2         
	//*  30   57:ifnull          121
		{
			annotatedmember = ((AnnotatedMember) (annotationintrospector.findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
	//   31   60:aload           6
	//   32   62:aload_2         
	//   33   63:invokevirtual   #57  <Method java.util.List AnnotationIntrospector.findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   34   66:astore_2        
			if(annotatedmember != null)
	//*  35   67:aload_2         
	//*  36   68:ifnull          121
			{
				NamedType namedtype;
				for(annotatedmember = ((AnnotatedMember) (((Collection) (annotatedmember)).iterator())); ((Iterator) (annotatedmember)).hasNext(); _collectAndResolveByTypeId(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype.getType()), namedtype, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap))))
	//*  37   71:aload_2         
	//*  38   72:invokeinterface #66  <Method Iterator Collection.iterator()>
	//*  39   77:astore_2        
	//*  40   78:aload_2         
	//*  41   79:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  42   84:ifeq            121
					namedtype = (NamedType)((Iterator) (annotatedmember)).next();
	//   43   87:aload_2         
	//   44   88:invokeinterface #75  <Method Object Iterator.next()>
	//   45   93:checkcast       #22  <Class NamedType>
	//   46   96:astore          6

	//   47   98:aload_0         
	//   48   99:aload_1         
	//   49  100:aload           6
	//   50  102:invokevirtual   #36  <Method Class NamedType.getType()>
	//   51  105:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   52  108:aload           6
	//   53  110:aload_1         
	//   54  111:aload           4
	//   55  113:aload           5
	//   56  115:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
			}
		}
	//*  57  118:goto            78
		annotatedmember = ((AnnotatedMember) (_registeredSubtypes));
	//   58  121:aload_0         
	//   59  122:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//   60  125:astore_2        
		if(annotatedmember != null)
	//*  61  126:aload_2         
	//*  62  127:ifnull          190
		{
			annotatedmember = ((AnnotatedMember) (((LinkedHashSet) (annotatedmember)).iterator()));
	//   63  130:aload_2         
	//   64  131:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//   65  134:astore_2        
			do
			{
				if(!((Iterator) (annotatedmember)).hasNext())
					break;
	//   66  135:aload_2         
	//   67  136:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   68  141:ifeq            190
				NamedType namedtype1 = (NamedType)((Iterator) (annotatedmember)).next();
	//   69  144:aload_2         
	//   70  145:invokeinterface #75  <Method Object Iterator.next()>
	//   71  150:checkcast       #22  <Class NamedType>
	//   72  153:astore          6
				if(((Class) (javatype)).isAssignableFrom(namedtype1.getType()))
	//*  73  155:aload_3         
	//*  74  156:aload           6
	//*  75  158:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  76  161:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  77  164:ifeq            135
					_collectAndResolveByTypeId(AnnotatedClassResolver.resolveWithoutSuperTypes(mapperconfig, namedtype1.getType()), namedtype1, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   78  167:aload_0         
	//   79  168:aload_1         
	//   80  169:aload           6
	//   81  171:invokevirtual   #36  <Method Class NamedType.getType()>
	//   82  174:invokestatic    #81  <Method AnnotatedClass AnnotatedClassResolver.resolveWithoutSuperTypes(MapperConfig, Class)>
	//   83  177:aload           6
	//   84  179:aload_1         
	//   85  180:aload           4
	//   86  182:aload           5
	//   87  184:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
			} while(true);
	//   88  187:goto            135
		}
		return _combineNamedAndUnnamed(((Class) (javatype)), ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   89  190:aload_0         
	//   90  191:aload_3         
	//   91  192:aload           4
	//   92  194:aload           5
	//   93  196:invokevirtual   #178 <Method Collection _combineNamedAndUnnamed(Class, Set, Map)>
	//   94  199:areturn         
	}

	public void registerSubtypes(Collection collection)
	{
		NamedType anamedtype[] = new NamedType[collection.size()];
	//    0    0:aload_1         
	//    1    1:invokeinterface #182 <Method int Collection.size()>
	//    2    6:anewarray       NamedType[]
	//    3    9:astore_3        
		collection = ((Collection) (collection.iterator()));
	//    4   10:aload_1         
	//    5   11:invokeinterface #66  <Method Iterator Collection.iterator()>
	//    6   16:astore_1        
		for(int i = 0; ((Iterator) (collection)).hasNext(); i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_2        
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            54
			anamedtype[i] = new NamedType((Class)((Iterator) (collection)).next());
	//   12   28:aload_3         
	//   13   29:iload_2         
	//   14   30:new             #22  <Class NamedType>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokeinterface #75  <Method Object Iterator.next()>
	//   18   40:checkcast       #125 <Class Class>
	//   19   43:invokespecial   #138 <Method void NamedType(Class)>
	//   20   46:aastore         

	//   21   47:iload_2         
	//   22   48:iconst_1        
	//   23   49:iadd            
	//   24   50:istore_2        
	//*  25   51:goto            19
		registerSubtypes(anamedtype);
	//   26   54:aload_0         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #185 <Method void registerSubtypes(NamedType[])>
	//   29   59:return          
	}

	public transient void registerSubtypes(NamedType anamedtype[])
	{
		if(_registeredSubtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//*   2    4:ifnonnull       18
			_registeredSubtypes = new LinkedHashSet();
	//    3    7:aload_0         
	//    4    8:new             #152 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #187 <Method void LinkedHashSet()>
	//    7   15:putfield        #145 <Field LinkedHashSet _registeredSubtypes>
		int j = anamedtype.length;
	//    8   18:aload_1         
	//    9   19:arraylength     
	//   10   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          50
		{
			NamedType namedtype = anamedtype[i];
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:astore          4
			_registeredSubtypes.add(((Object) (namedtype)));
	//   20   33:aload_0         
	//   21   34:getfield        #145 <Field LinkedHashSet _registeredSubtypes>
	//   22   37:aload           4
	//   23   39:invokevirtual   #188 <Method boolean LinkedHashSet.add(Object)>
	//   24   42:pop             
		}

	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
	//*  29   47:goto            23
	//   30   50:return          
	}

	public transient void registerSubtypes(Class aclass[])
	{
		NamedType anamedtype[] = new NamedType[aclass.length];
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:anewarray       NamedType[]
	//    3    5:astore          4
		int j = aclass.length;
	//    4    7:aload_1         
	//    5    8:arraylength     
	//    6    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   10:iconst_0        
	//*   8   11:istore_2        
	//*   9   12:iload_2         
	//*  10   13:iload_3         
	//*  11   14:icmpge          38
			anamedtype[i] = new NamedType(aclass[i]);
	//   12   17:aload           4
	//   13   19:iload_2         
	//   14   20:new             #22  <Class NamedType>
	//   15   23:dup             
	//   16   24:aload_1         
	//   17   25:iload_2         
	//   18   26:aaload          
	//   19   27:invokespecial   #138 <Method void NamedType(Class)>
	//   20   30:aastore         

	//   21   31:iload_2         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_2        
	//*  25   35:goto            12
		registerSubtypes(anamedtype);
	//   26   38:aload_0         
	//   27   39:aload           4
	//   28   41:invokevirtual   #185 <Method void registerSubtypes(NamedType[])>
	//   29   44:return          
	}

	private static final long serialVersionUID = 1L;
	protected LinkedHashSet _registeredSubtypes;
}
