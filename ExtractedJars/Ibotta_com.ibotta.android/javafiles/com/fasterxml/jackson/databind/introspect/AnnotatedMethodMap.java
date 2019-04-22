// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			MemberKey, AnnotatedMethod

public final class AnnotatedMethodMap
	implements Iterable
{

	public AnnotatedMethodMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public AnnotatedMethodMap(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		_methods = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Map _methods>
	//    5    9:return          
	}

	public AnnotatedMethod find(String s, Class aclass[])
	{
		Map map = _methods;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map _methods>
	//    2    4:astore_3        
		if(map == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (AnnotatedMethod)map.get(((Object) (new MemberKey(s, aclass))));
	//    7   11:aload_3         
	//    8   12:new             #24  <Class MemberKey>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokespecial   #27  <Method void MemberKey(String, Class[])>
	//   13   21:invokeinterface #33  <Method Object Map.get(Object)>
	//   14   26:checkcast       #35  <Class AnnotatedMethod>
	//   15   29:areturn         
	}

	public Iterator iterator()
	{
		Map map = _methods;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map _methods>
	//    2    4:astore_1        
		if(map == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return Collections.emptyIterator();
	//    5    9:invokestatic    #43  <Method Iterator Collections.emptyIterator()>
	//    6   12:areturn         
		else
			return map.values().iterator();
	//    7   13:aload_1         
	//    8   14:invokeinterface #47  <Method Collection Map.values()>
	//    9   19:invokeinterface #51  <Method Iterator Collection.iterator()>
	//   10   24:areturn         
	}

	protected Map _methods;
}
