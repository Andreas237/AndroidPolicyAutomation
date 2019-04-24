// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			LRUMap

public class RootNameLookup
	implements Serializable
{

	public RootNameLookup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_rootNames = new LRUMap(20, 200);
	//    2    4:aload_0         
	//    3    5:new             #19  <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          20
	//    6   11:sipush          200
	//    7   14:invokespecial   #22  <Method void LRUMap(int, int)>
	//    8   17:putfield        #24  <Field LRUMap _rootNames>
	//    9   20:return          
	}

	public PropertyName findRootName(JavaType javatype, MapperConfig mapperconfig)
	{
		return findRootName(javatype.getRawClass(), mapperconfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method Class JavaType.getRawClass()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #36  <Method PropertyName findRootName(Class, MapperConfig)>
	//    5    9:areturn         
	}

	public PropertyName findRootName(Class class1, MapperConfig mapperconfig)
	{
		ClassKey classkey;
label0:
		{
			classkey = new ClassKey(class1);
	//    0    0:new             #40  <Class ClassKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #43  <Method void ClassKey(Class)>
	//    4    8:astore          4
			Object obj = ((Object) ((PropertyName)_rootNames.get(((Object) (classkey)))));
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field LRUMap _rootNames>
	//    7   14:aload           4
	//    8   16:invokevirtual   #47  <Method Object LRUMap.get(Object)>
	//    9   19:checkcast       #49  <Class PropertyName>
	//   10   22:astore_3        
			if(obj != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          29
				return ((PropertyName) (obj));
	//   13   27:aload_3         
	//   14   28:areturn         
			obj = ((Object) (mapperconfig.introspectClassAnnotations(class1)));
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #55  <Method BeanDescription MapperConfig.introspectClassAnnotations(Class)>
	//   18   34:astore_3        
			obj = ((Object) (mapperconfig.getAnnotationIntrospector().findRootName(((BeanDescription) (obj)).getClassInfo())));
	//   19   35:aload_2         
	//   20   36:invokevirtual   #59  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   21   39:aload_3         
	//   22   40:invokevirtual   #65  <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   23   43:invokevirtual   #70  <Method PropertyName AnnotationIntrospector.findRootName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   24   46:astore_3        
			if(obj != null)
	//*  25   47:aload_3         
	//*  26   48:ifnull          60
			{
				mapperconfig = ((MapperConfig) (obj));
	//   27   51:aload_3         
	//   28   52:astore_2        
				if(((PropertyName) (obj)).hasSimpleName())
					break label0;
	//   29   53:aload_3         
	//   30   54:invokevirtual   #74  <Method boolean PropertyName.hasSimpleName()>
	//   31   57:ifne            68
			}
			mapperconfig = ((MapperConfig) (PropertyName.construct(class1.getSimpleName())));
	//   32   60:aload_1         
	//   33   61:invokevirtual   #80  <Method String Class.getSimpleName()>
	//   34   64:invokestatic    #84  <Method PropertyName PropertyName.construct(String)>
	//   35   67:astore_2        
		}
		_rootNames.put(((Object) (classkey)), ((Object) (mapperconfig)));
	//   36   68:aload_0         
	//   37   69:getfield        #24  <Field LRUMap _rootNames>
	//   38   72:aload           4
	//   39   74:aload_2         
	//   40   75:invokevirtual   #88  <Method Object LRUMap.put(Object, Object)>
	//   41   78:pop             
		return ((PropertyName) (mapperconfig));
	//   42   79:aload_2         
	//   43   80:areturn         
	}

	protected Object readResolve()
	{
		return ((Object) (new RootNameLookup()));
	//    0    0:new             #2   <Class RootNameLookup>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void RootNameLookup()>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient LRUMap _rootNames;
}
