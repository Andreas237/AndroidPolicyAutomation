// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
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
		NamedType namedtype1;
		namedtype1 = namedtype;
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
		if(!hashmap.containsKey(((Object) (namedtype1)))) goto _L2; else goto _L1
	//   20   41:aload           5
	//   21   43:aload           6
	//   22   45:invokevirtual   #45  <Method boolean HashMap.containsKey(Object)>
	//   23   48:ifeq            86
_L1:
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
_L4:
		return;
	//   38   85:return          
_L2:
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
	//*  49  104:ifnull          85
	//*  50  107:aload_1         
	//*  51  108:invokeinterface #62  <Method boolean Collection.isEmpty()>
	//*  52  113:ifne            85
		{
			annotatedclass = ((AnnotatedClass) (((Collection) (annotatedclass)).iterator()));
	//   53  116:aload_1         
	//   54  117:invokeinterface #66  <Method Iterator Collection.iterator()>
	//   55  122:astore_1        
			while(((Iterator) (annotatedclass)).hasNext()) 
	//*  56  123:aload_1         
	//*  57  124:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  58  129:ifeq            85
			{
				namedtype = (NamedType)((Iterator) (annotatedclass)).next();
	//   59  132:aload_1         
	//   60  133:invokeinterface #75  <Method Object Iterator.next()>
	//   61  138:checkcast       #22  <Class NamedType>
	//   62  141:astore_2        
				_collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), mapperconfig), namedtype, mapperconfig, annotationintrospector, hashmap);
	//   63  142:aload_0         
	//   64  143:aload_2         
	//   65  144:invokevirtual   #36  <Method Class NamedType.getType()>
	//   66  147:aload_3         
	//   67  148:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   68  151:aload_2         
	//   69  152:aload_3         
	//   70  153:aload           4
	//   71  155:aload           5
	//   72  157:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
			}
		}
		if(true) goto _L4; else goto _L3
	//   73  160:goto            123
_L3:
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
				for(annotatedclass = ((AnnotatedClass) (((Collection) (annotatedclass)).iterator())); ((Iterator) (annotatedclass)).hasNext(); _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), mapperconfig), namedtype, mapperconfig, set, map))
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
	//   57  132:aload_2         
	//   58  133:invokevirtual   #36  <Method Class NamedType.getType()>
	//   59  136:aload_3         
	//   60  137:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   61  140:aload_2         
	//   62  141:aload_3         
	//   63  142:aload           4
	//   64  144:aload           5
	//   65  146:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
		}
	//*  66  149:goto            112
	//   67  152:return          
	}

	protected Collection _combineNamedAndUnnamed(Set set, Map map)
	{
		ArrayList arraylist = new ArrayList(map.values());
	//    0    0:new             #112 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokeinterface #116 <Method Collection Map.values()>
	//    4   10:invokespecial   #119 <Method void ArrayList(Collection)>
	//    5   13:astore_3        
		for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext(); set.remove(((Object) (((NamedType)((Iterator) (map)).next()).getType()))));
	//    6   14:aload_2         
	//    7   15:invokeinterface #116 <Method Collection Map.values()>
	//    8   20:invokeinterface #66  <Method Iterator Collection.iterator()>
	//    9   25:astore_2        
	//   10   26:aload_2         
	//   11   27:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   12   32:ifeq            57
	//   13   35:aload_1         
	//   14   36:aload_2         
	//   15   37:invokeinterface #75  <Method Object Iterator.next()>
	//   16   42:checkcast       #22  <Class NamedType>
	//   17   45:invokevirtual   #36  <Method Class NamedType.getType()>
	//   18   48:invokeinterface #122 <Method boolean Set.remove(Object)>
	//   19   53:pop             
	//*  20   54:goto            26
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); arraylist.add(((Object) (new NamedType((Class)((Iterator) (set)).next())))));
	//   21   57:aload_1         
	//   22   58:invokeinterface #123 <Method Iterator Set.iterator()>
	//   23   63:astore_1        
	//   24   64:aload_1         
	//   25   65:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   26   70:ifeq            97
	//   27   73:aload_3         
	//   28   74:new             #22  <Class NamedType>
	//   29   77:dup             
	//   30   78:aload_1         
	//   31   79:invokeinterface #75  <Method Object Iterator.next()>
	//   32   84:checkcast       #125 <Class Class>
	//   33   87:invokespecial   #128 <Method void NamedType(Class)>
	//   34   90:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   35   93:pop             
	//*  36   94:goto            64
		return ((Collection) (arraylist));
	//   37   97:aload_3         
	//   38   98:areturn         
	}

	public Collection collectAndResolveSubtypes(AnnotatedClass annotatedclass, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector)
	{
		return collectAndResolveSubtypesByClass(mapperconfig, annotatedclass);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #137 <Method Collection collectAndResolveSubtypesByClass(MapperConfig, AnnotatedClass)>
	//    4    6:areturn         
	}

	public Collection collectAndResolveSubtypes(AnnotatedMember annotatedmember, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, JavaType javatype)
	{
		return collectAndResolveSubtypesByClass(mapperconfig, annotatedmember, javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:aload           4
	//    4    5:invokevirtual   #143 <Method Collection collectAndResolveSubtypesByClass(MapperConfig, AnnotatedMember, JavaType)>
	//    5    8:areturn         
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
	//    5    9:invokespecial   #145 <Method void HashMap()>
	//    6   12:astore          4
		if(_registeredSubtypes != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//*   9   18:ifnull          93
		{
			Class class1 = annotatedclass.getRawType();
	//   10   21:aload_2         
	//   11   22:invokevirtual   #150 <Method Class AnnotatedClass.getRawType()>
	//   12   25:astore          5
			Iterator iterator = _registeredSubtypes.iterator();
	//   13   27:aload_0         
	//   14   28:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
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
					_collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), mapperconfig), namedtype, mapperconfig, annotationintrospector, hashmap);
	//   29   71:aload_0         
	//   30   72:aload           7
	//   31   74:invokevirtual   #36  <Method Class NamedType.getType()>
	//   32   77:aload_1         
	//   33   78:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
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
		HashMap hashmap;
		if(javatype == null)
	//*   3    6:aload_3         
	//*   4    7:ifnonnull       97
			javatype = ((JavaType) (annotatedmember.getRawType()));
	//    5   10:aload_2         
	//    6   11:invokevirtual   #162 <Method Class AnnotatedMember.getRawType()>
	//    7   14:astore_3        
		else
	//*   8   15:new             #41  <Class HashMap>
	//*   9   18:dup             
	//*  10   19:invokespecial   #145 <Method void HashMap()>
	//*  11   22:astore          5
	//*  12   24:aload_0         
	//*  13   25:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//*  14   28:ifnull          105
	//*  15   31:aload_0         
	//*  16   32:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//*  17   35:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//*  18   38:astore          6
	//*  19   40:aload           6
	//*  20   42:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  21   47:ifeq            105
	//*  22   50:aload           6
	//*  23   52:invokeinterface #75  <Method Object Iterator.next()>
	//*  24   57:checkcast       #22  <Class NamedType>
	//*  25   60:astore          7
	//*  26   62:aload_3         
	//*  27   63:aload           7
	//*  28   65:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  29   68:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  30   71:ifeq            40
	//*  31   74:aload_0         
	//*  32   75:aload           7
	//*  33   77:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  34   80:aload_1         
	//*  35   81:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//*  36   84:aload           7
	//*  37   86:aload_1         
	//*  38   87:aload           4
	//*  39   89:aload           5
	//*  40   91:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
	//*  41   94:goto            40
			javatype = ((JavaType) (javatype.getRawClass()));
	//   42   97:aload_3         
	//   43   98:invokevirtual   #167 <Method Class JavaType.getRawClass()>
	//   44  101:astore_3        
		hashmap = new HashMap();
		if(_registeredSubtypes != null)
		{
			Iterator iterator = _registeredSubtypes.iterator();
			do
			{
				if(!iterator.hasNext())
					break;
				NamedType namedtype1 = (NamedType)iterator.next();
				if(((Class) (javatype)).isAssignableFrom(namedtype1.getType()))
					_collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype1.getType(), mapperconfig), namedtype1, mapperconfig, annotationintrospector, hashmap);
			} while(true);
		}
	//*  45  102:goto            15
		annotatedmember = ((AnnotatedMember) (annotationintrospector.findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
	//   46  105:aload           4
	//   47  107:aload_2         
	//   48  108:invokevirtual   #57  <Method java.util.List AnnotationIntrospector.findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   49  111:astore_2        
		if(annotatedmember != null)
	//*  50  112:aload_2         
	//*  51  113:ifnull          166
		{
			NamedType namedtype;
			for(annotatedmember = ((AnnotatedMember) (((Collection) (annotatedmember)).iterator())); ((Iterator) (annotatedmember)).hasNext(); _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), mapperconfig), namedtype, mapperconfig, annotationintrospector, hashmap))
	//*  52  116:aload_2         
	//*  53  117:invokeinterface #66  <Method Iterator Collection.iterator()>
	//*  54  122:astore_2        
	//*  55  123:aload_2         
	//*  56  124:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  57  129:ifeq            166
				namedtype = (NamedType)((Iterator) (annotatedmember)).next();
	//   58  132:aload_2         
	//   59  133:invokeinterface #75  <Method Object Iterator.next()>
	//   60  138:checkcast       #22  <Class NamedType>
	//   61  141:astore          6

	//   62  143:aload_0         
	//   63  144:aload           6
	//   64  146:invokevirtual   #36  <Method Class NamedType.getType()>
	//   65  149:aload_1         
	//   66  150:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   67  153:aload           6
	//   68  155:aload_1         
	//   69  156:aload           4
	//   70  158:aload           5
	//   71  160:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
		}
	//*  72  163:goto            123
		annotatedmember = ((AnnotatedMember) (new NamedType(((Class) (javatype)), ((String) (null)))));
	//   73  166:new             #22  <Class NamedType>
	//   74  169:dup             
	//   75  170:aload_3         
	//   76  171:aconst_null     
	//   77  172:invokespecial   #39  <Method void NamedType(Class, String)>
	//   78  175:astore_2        
		_collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(((Class) (javatype)), mapperconfig), ((NamedType) (annotatedmember)), mapperconfig, annotationintrospector, hashmap);
	//   79  176:aload_0         
	//   80  177:aload_3         
	//   81  178:aload_1         
	//   82  179:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   83  182:aload_2         
	//   84  183:aload_1         
	//   85  184:aload           4
	//   86  186:aload           5
	//   87  188:invokevirtual   #83  <Method void _collectAndResolve(AnnotatedClass, NamedType, MapperConfig, AnnotationIntrospector, HashMap)>
		return ((Collection) (new ArrayList(hashmap.values())));
	//   88  191:new             #112 <Class ArrayList>
	//   89  194:dup             
	//   90  195:aload           5
	//   91  197:invokevirtual   #158 <Method Collection HashMap.values()>
	//   92  200:invokespecial   #119 <Method void ArrayList(Collection)>
	//   93  203:areturn         
	}

	public Collection collectAndResolveSubtypesByTypeId(MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #171 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void HashSet()>
	//    3    7:astore_3        
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    4    8:new             #174 <Class LinkedHashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #175 <Method void LinkedHashMap()>
	//    7   15:astore          4
		_collectAndResolveByTypeId(annotatedclass, new NamedType(annotatedclass.getRawType(), ((String) (null))), mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:new             #22  <Class NamedType>
	//   11   22:dup             
	//   12   23:aload_2         
	//   13   24:invokevirtual   #150 <Method Class AnnotatedClass.getRawType()>
	//   14   27:aconst_null     
	//   15   28:invokespecial   #39  <Method void NamedType(Class, String)>
	//   16   31:aload_1         
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
		if(_registeredSubtypes != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//*  22   42:ifnull          115
		{
			annotatedclass = ((AnnotatedClass) (annotatedclass.getRawType()));
	//   23   45:aload_2         
	//   24   46:invokevirtual   #150 <Method Class AnnotatedClass.getRawType()>
	//   25   49:astore_2        
			Iterator iterator = _registeredSubtypes.iterator();
	//   26   50:aload_0         
	//   27   51:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//   28   54:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//   29   57:astore          5
			do
			{
				if(!iterator.hasNext())
					break;
	//   30   59:aload           5
	//   31   61:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   32   66:ifeq            115
				NamedType namedtype = (NamedType)iterator.next();
	//   33   69:aload           5
	//   34   71:invokeinterface #75  <Method Object Iterator.next()>
	//   35   76:checkcast       #22  <Class NamedType>
	//   36   79:astore          6
				if(((Class) (annotatedclass)).isAssignableFrom(namedtype.getType()))
	//*  37   81:aload_2         
	//*  38   82:aload           6
	//*  39   84:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  40   87:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  41   90:ifeq            59
					_collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), mapperconfig), namedtype, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   42   93:aload_0         
	//   43   94:aload           6
	//   44   96:invokevirtual   #36  <Method Class NamedType.getType()>
	//   45   99:aload_1         
	//   46  100:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   47  103:aload           6
	//   48  105:aload_1         
	//   49  106:aload_3         
	//   50  107:aload           4
	//   51  109:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
			} while(true);
	//   52  112:goto            59
		}
		return _combineNamedAndUnnamed(((Set) (hashset)), ((Map) (linkedhashmap)));
	//   53  115:aload_0         
	//   54  116:aload_3         
	//   55  117:aload           4
	//   56  119:invokevirtual   #177 <Method Collection _combineNamedAndUnnamed(Set, Map)>
	//   57  122:areturn         
	}

	public Collection collectAndResolveSubtypesByTypeId(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    2    4:astore          6
		HashSet hashset;
		LinkedHashMap linkedhashmap;
		NamedType namedtype2;
		if(javatype == null)
	//*   3    6:aload_3         
	//*   4    7:ifnonnull       121
			javatype = ((JavaType) (annotatedmember.getRawType()));
	//    5   10:aload_2         
	//    6   11:invokevirtual   #162 <Method Class AnnotatedMember.getRawType()>
	//    7   14:astore_3        
		else
	//*   8   15:new             #171 <Class HashSet>
	//*   9   18:dup             
	//*  10   19:invokespecial   #172 <Method void HashSet()>
	//*  11   22:astore          4
	//*  12   24:new             #174 <Class LinkedHashMap>
	//*  13   27:dup             
	//*  14   28:invokespecial   #175 <Method void LinkedHashMap()>
	//*  15   31:astore          5
	//*  16   33:new             #22  <Class NamedType>
	//*  17   36:dup             
	//*  18   37:aload_3         
	//*  19   38:aconst_null     
	//*  20   39:invokespecial   #39  <Method void NamedType(Class, String)>
	//*  21   42:astore          7
	//*  22   44:aload_0         
	//*  23   45:aload_3         
	//*  24   46:aload_1         
	//*  25   47:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//*  26   50:aload           7
	//*  27   52:aload_1         
	//*  28   53:aload           4
	//*  29   55:aload           5
	//*  30   57:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
	//*  31   60:aload           6
	//*  32   62:aload_2         
	//*  33   63:invokevirtual   #57  <Method java.util.List AnnotationIntrospector.findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  34   66:astore_2        
	//*  35   67:aload_2         
	//*  36   68:ifnull          129
	//*  37   71:aload_2         
	//*  38   72:invokeinterface #66  <Method Iterator Collection.iterator()>
	//*  39   77:astore_2        
	//*  40   78:aload_2         
	//*  41   79:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  42   84:ifeq            129
	//*  43   87:aload_2         
	//*  44   88:invokeinterface #75  <Method Object Iterator.next()>
	//*  45   93:checkcast       #22  <Class NamedType>
	//*  46   96:astore          6
	//*  47   98:aload_0         
	//*  48   99:aload           6
	//*  49  101:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  50  104:aload_1         
	//*  51  105:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//*  52  108:aload           6
	//*  53  110:aload_1         
	//*  54  111:aload           4
	//*  55  113:aload           5
	//*  56  115:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
	//*  57  118:goto            78
			javatype = ((JavaType) (javatype.getRawClass()));
	//   58  121:aload_3         
	//   59  122:invokevirtual   #167 <Method Class JavaType.getRawClass()>
	//   60  125:astore_3        
		hashset = new HashSet();
		linkedhashmap = new LinkedHashMap();
		namedtype2 = new NamedType(((Class) (javatype)), ((String) (null)));
		_collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(((Class) (javatype)), mapperconfig), namedtype2, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
		annotatedmember = ((AnnotatedMember) (annotationintrospector.findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
		if(annotatedmember != null)
		{
			NamedType namedtype;
			for(annotatedmember = ((AnnotatedMember) (((Collection) (annotatedmember)).iterator())); ((Iterator) (annotatedmember)).hasNext(); _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), mapperconfig), namedtype, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap))))
				namedtype = (NamedType)((Iterator) (annotatedmember)).next();

		}
	//*  61  126:goto            15
		if(_registeredSubtypes != null)
	//*  62  129:aload_0         
	//*  63  130:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//*  64  133:ifnull          199
		{
			annotatedmember = ((AnnotatedMember) (_registeredSubtypes.iterator()));
	//   65  136:aload_0         
	//   66  137:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//   67  140:invokevirtual   #153 <Method Iterator LinkedHashSet.iterator()>
	//   68  143:astore_2        
			do
			{
				if(!((Iterator) (annotatedmember)).hasNext())
					break;
	//   69  144:aload_2         
	//   70  145:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   71  150:ifeq            199
				NamedType namedtype1 = (NamedType)((Iterator) (annotatedmember)).next();
	//   72  153:aload_2         
	//   73  154:invokeinterface #75  <Method Object Iterator.next()>
	//   74  159:checkcast       #22  <Class NamedType>
	//   75  162:astore          6
				if(((Class) (javatype)).isAssignableFrom(namedtype1.getType()))
	//*  76  164:aload_3         
	//*  77  165:aload           6
	//*  78  167:invokevirtual   #36  <Method Class NamedType.getType()>
	//*  79  170:invokevirtual   #157 <Method boolean Class.isAssignableFrom(Class)>
	//*  80  173:ifeq            144
					_collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(namedtype1.getType(), mapperconfig), namedtype1, mapperconfig, ((Set) (hashset)), ((Map) (linkedhashmap)));
	//   81  176:aload_0         
	//   82  177:aload           6
	//   83  179:invokevirtual   #36  <Method Class NamedType.getType()>
	//   84  182:aload_1         
	//   85  183:invokestatic    #81  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   86  186:aload           6
	//   87  188:aload_1         
	//   88  189:aload           4
	//   89  191:aload           5
	//   90  193:invokevirtual   #107 <Method void _collectAndResolveByTypeId(AnnotatedClass, NamedType, MapperConfig, Set, Map)>
			} while(true);
	//   91  196:goto            144
		}
		return _combineNamedAndUnnamed(((Set) (hashset)), ((Map) (linkedhashmap)));
	//   92  199:aload_0         
	//   93  200:aload           4
	//   94  202:aload           5
	//   95  204:invokevirtual   #177 <Method Collection _combineNamedAndUnnamed(Set, Map)>
	//   96  207:areturn         
	}

	public transient void registerSubtypes(NamedType anamedtype[])
	{
		if(_registeredSubtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//*   2    4:ifnonnull       18
			_registeredSubtypes = new LinkedHashSet();
	//    3    7:aload_0         
	//    4    8:new             #152 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #180 <Method void LinkedHashSet()>
	//    7   15:putfield        #147 <Field LinkedHashSet _registeredSubtypes>
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
	//   21   34:getfield        #147 <Field LinkedHashSet _registeredSubtypes>
	//   22   37:aload           4
	//   23   39:invokevirtual   #181 <Method boolean LinkedHashSet.add(Object)>
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
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		for(int j = aclass.length; i < j; i++)
	//*   6    9:aload_1         
	//*   7   10:arraylength     
	//*   8   11:istore_3        
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
	//   19   27:invokespecial   #128 <Method void NamedType(Class)>
	//   20   30:aastore         

	//   21   31:iload_2         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_2        
	//*  25   35:goto            12
		registerSubtypes(anamedtype);
	//   26   38:aload_0         
	//   27   39:aload           4
	//   28   41:invokevirtual   #184 <Method void registerSubtypes(NamedType[])>
	//   29   44:return          
	}

	private static final long serialVersionUID = 1L;
	protected LinkedHashSet _registeredSubtypes;
}
