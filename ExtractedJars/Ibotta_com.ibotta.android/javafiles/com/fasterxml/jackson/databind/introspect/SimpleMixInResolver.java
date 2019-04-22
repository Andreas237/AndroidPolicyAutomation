// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SimpleMixInResolver
	implements ClassIntrospector.MixInResolver, Serializable
{

	public SimpleMixInResolver(ClassIntrospector.MixInResolver mixinresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_overrides = mixinresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//    5    9:return          
	}

	protected SimpleMixInResolver(ClassIntrospector.MixInResolver mixinresolver, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_overrides = mixinresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
		_localMixIns = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Map _localMixIns>
	//    8   14:return          
	}

	public void addLocalDefinition(Class class1, Class class2)
	{
		if(_localMixIns == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map _localMixIns>
	//*   2    4:ifnonnull       18
			_localMixIns = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #34  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #35  <Method void HashMap()>
	//    7   15:putfield        #28  <Field Map _localMixIns>
		_localMixIns.put(((Object) (new ClassKey(class1))), ((Object) (class2)));
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field Map _localMixIns>
	//   10   22:new             #37  <Class ClassKey>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokespecial   #40  <Method void ClassKey(Class)>
	//   14   30:aload_2         
	//   15   31:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   16   36:pop             
	//   17   37:return          
	}

	public volatile ClassIntrospector.MixInResolver copy()
	{
		return ((ClassIntrospector.MixInResolver) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method SimpleMixInResolver copy()>
	//    2    4:areturn         
	}

	public SimpleMixInResolver copy()
	{
		ClassIntrospector.MixInResolver mixinresolver = _overrides;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//    2    4:astore_1        
		HashMap hashmap = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(mixinresolver == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
			mixinresolver = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
		else
	//*   9   13:goto            23
			mixinresolver = mixinresolver.copy();
	//   10   16:aload_1         
	//   11   17:invokeinterface #54  <Method ClassIntrospector$MixInResolver ClassIntrospector$MixInResolver.copy()>
	//   12   22:astore_1        
		Map map = _localMixIns;
	//   13   23:aload_0         
	//   14   24:getfield        #28  <Field Map _localMixIns>
	//   15   27:astore_3        
		if(map != null)
	//*  16   28:aload_3         
	//*  17   29:ifnonnull       35
	//*  18   32:goto            44
			hashmap = new HashMap(map);
	//   19   35:new             #34  <Class HashMap>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokespecial   #57  <Method void HashMap(Map)>
	//   23   43:astore_2        
		return new SimpleMixInResolver(mixinresolver, ((Map) (hashmap)));
	//   24   44:new             #2   <Class SimpleMixInResolver>
	//   25   47:dup             
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:invokespecial   #59  <Method void SimpleMixInResolver(ClassIntrospector$MixInResolver, Map)>
	//   29   53:areturn         
	}

	public Class findMixInClassFor(Class class1)
	{
		Object obj = ((Object) (_overrides));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		else
	//*   7   11:goto            22
			obj = ((Object) (((ClassIntrospector.MixInResolver) (obj)).findMixInClassFor(class1)));
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #63  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   11   21:astore_2        
		Object obj1 = obj;
	//   12   22:aload_2         
	//   13   23:astore_3        
		if(obj == null)
	//*  14   24:aload_2         
	//*  15   25:ifnonnull       60
		{
			Map map = _localMixIns;
	//   16   28:aload_0         
	//   17   29:getfield        #28  <Field Map _localMixIns>
	//   18   32:astore          4
			obj1 = obj;
	//   19   34:aload_2         
	//   20   35:astore_3        
			if(map != null)
	//*  21   36:aload           4
	//*  22   38:ifnull          60
				obj1 = ((Object) ((Class)map.get(((Object) (new ClassKey(class1))))));
	//   23   41:aload           4
	//   24   43:new             #37  <Class ClassKey>
	//   25   46:dup             
	//   26   47:aload_1         
	//   27   48:invokespecial   #40  <Method void ClassKey(Class)>
	//   28   51:invokeinterface #67  <Method Object Map.get(Object)>
	//   29   56:checkcast       #69  <Class Class>
	//   30   59:astore_3        
		}
		return ((Class) (obj1));
	//   31   60:aload_3         
	//   32   61:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected Map _localMixIns;
	protected final ClassIntrospector.MixInResolver _overrides;
}
