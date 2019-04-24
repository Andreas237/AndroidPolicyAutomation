// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.*;

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
		ClassIntrospector.MixInResolver mixinresolver;
		Object obj;
		if(_overrides == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//*   2    4:ifnonnull       28
			mixinresolver = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_0         
	//*   6   10:getfield        #28  <Field Map _localMixIns>
	//*   7   13:ifnonnull       41
	//*   8   16:aconst_null     
	//*   9   17:astore_2        
	//*  10   18:new             #2   <Class SimpleMixInResolver>
	//*  11   21:dup             
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokespecial   #54  <Method void SimpleMixInResolver(ClassIntrospector$MixInResolver, Map)>
	//*  15   27:areturn         
			mixinresolver = _overrides.copy();
	//   16   28:aload_0         
	//   17   29:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//   18   32:invokeinterface #56  <Method ClassIntrospector$MixInResolver ClassIntrospector$MixInResolver.copy()>
	//   19   37:astore_1        
		if(_localMixIns == null)
			obj = null;
		else
	//*  20   38:goto            9
			obj = ((Object) (new HashMap(_localMixIns)));
	//   21   41:new             #34  <Class HashMap>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #28  <Field Map _localMixIns>
	//   25   49:invokespecial   #59  <Method void HashMap(Map)>
	//   26   52:astore_2        
		return new SimpleMixInResolver(mixinresolver, ((Map) (obj)));
	//*  27   53:goto            18
	}

	public Class findMixInClassFor(Class class1)
	{
		Class class2;
		Class class3;
		if(_overrides == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//*   2    4:ifnonnull       47
			class2 = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		else
	//*   5    9:aload_2         
	//*   6   10:astore_3        
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       45
	//*   9   15:aload_2         
	//*  10   16:astore_3        
	//*  11   17:aload_0         
	//*  12   18:getfield        #28  <Field Map _localMixIns>
	//*  13   21:ifnull          45
	//*  14   24:aload_0         
	//*  15   25:getfield        #28  <Field Map _localMixIns>
	//*  16   28:new             #37  <Class ClassKey>
	//*  17   31:dup             
	//*  18   32:aload_1         
	//*  19   33:invokespecial   #40  <Method void ClassKey(Class)>
	//*  20   36:invokeinterface #65  <Method Object Map.get(Object)>
	//*  21   41:checkcast       #67  <Class Class>
	//*  22   44:astore_3        
	//*  23   45:aload_3         
	//*  24   46:areturn         
			class2 = _overrides.findMixInClassFor(class1);
	//   25   47:aload_0         
	//   26   48:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//   27   51:aload_1         
	//   28   52:invokeinterface #69  <Method Class ClassIntrospector$MixInResolver.findMixInClassFor(Class)>
	//   29   57:astore_2        
		class3 = class2;
		if(class2 == null)
		{
			class3 = class2;
			if(_localMixIns != null)
				class3 = (Class)_localMixIns.get(((Object) (new ClassKey(class1))));
		}
		return class3;
	//*  30   58:goto            9
	}

	public int localSize()
	{
		if(_localMixIns == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map _localMixIns>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _localMixIns.size();
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field Map _localMixIns>
	//    7   13:invokeinterface #75  <Method int Map.size()>
	//    8   18:ireturn         
	}

	public void setLocalDefinitions(Map map)
	{
		if(map == null || map.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #80  <Method boolean Map.isEmpty()>
	//*   4   10:ifeq            19
		{
			_localMixIns = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #28  <Field Map _localMixIns>
			return;
	//    8   18:return          
		}
		HashMap hashmap = new HashMap(map.size());
	//    9   19:new             #34  <Class HashMap>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokeinterface #75  <Method int Map.size()>
	//   13   29:invokespecial   #83  <Method void HashMap(int)>
	//   14   32:astore_2        
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((Map) (hashmap)).put(((Object) (new ClassKey((Class)entry.getKey()))), entry.getValue()))
	//*  15   33:aload_1         
	//*  16   34:invokeinterface #87  <Method Set Map.entrySet()>
	//*  17   39:invokeinterface #93  <Method Iterator Set.iterator()>
	//*  18   44:astore_1        
	//*  19   45:aload_1         
	//*  20   46:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*  21   51:ifeq            96
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   22   54:aload_1         
	//   23   55:invokeinterface #102 <Method Object Iterator.next()>
	//   24   60:checkcast       #104 <Class java.util.Map$Entry>
	//   25   63:astore_3        

	//   26   64:aload_2         
	//   27   65:new             #37  <Class ClassKey>
	//   28   68:dup             
	//   29   69:aload_3         
	//   30   70:invokeinterface #107 <Method Object java.util.Map$Entry.getKey()>
	//   31   75:checkcast       #67  <Class Class>
	//   32   78:invokespecial   #40  <Method void ClassKey(Class)>
	//   33   81:aload_3         
	//   34   82:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   35   87:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   36   92:pop             
	//*  37   93:goto            45
		_localMixIns = ((Map) (hashmap));
	//   38   96:aload_0         
	//   39   97:aload_2         
	//   40   98:putfield        #28  <Field Map _localMixIns>
	//   41  101:return          
	}

	public SimpleMixInResolver withOverrides(ClassIntrospector.MixInResolver mixinresolver)
	{
		return new SimpleMixInResolver(mixinresolver, _localMixIns);
	//    0    0:new             #2   <Class SimpleMixInResolver>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field Map _localMixIns>
	//    5    9:invokespecial   #54  <Method void SimpleMixInResolver(ClassIntrospector$MixInResolver, Map)>
	//    6   12:areturn         
	}

	public SimpleMixInResolver withoutLocalDefinitions()
	{
		return new SimpleMixInResolver(_overrides, ((Map) (null)));
	//    0    0:new             #2   <Class SimpleMixInResolver>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ClassIntrospector$MixInResolver _overrides>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #54  <Method void SimpleMixInResolver(ClassIntrospector$MixInResolver, Map)>
	//    6   12:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected Map _localMixIns;
	protected final ClassIntrospector.MixInResolver _overrides;
}
