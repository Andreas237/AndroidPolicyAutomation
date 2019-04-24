// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Method;
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

	public void add(AnnotatedMethod annotatedmethod)
	{
		if(_methods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field LinkedHashMap _methods>
	//*   2    4:ifnonnull       18
			_methods = new LinkedHashMap();
	//    3    7:aload_0         
	//    4    8:new             #21  <Class LinkedHashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #22  <Method void LinkedHashMap()>
	//    7   15:putfield        #19  <Field LinkedHashMap _methods>
		_methods.put(((Object) (new MemberKey(annotatedmethod.getAnnotated()))), ((Object) (annotatedmethod)));
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field LinkedHashMap _methods>
	//   10   22:new             #24  <Class MemberKey>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokevirtual   #30  <Method Method AnnotatedMethod.getAnnotated()>
	//   14   30:invokespecial   #33  <Method void MemberKey(Method)>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #37  <Method Object LinkedHashMap.put(Object, Object)>
	//   17   37:pop             
	//   18   38:return          
	}

	public AnnotatedMethod find(String s, Class aclass[])
	{
		if(_methods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field LinkedHashMap _methods>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (AnnotatedMethod)_methods.get(((Object) (new MemberKey(s, aclass))));
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field LinkedHashMap _methods>
	//    7   13:new             #24  <Class MemberKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #42  <Method void MemberKey(String, Class[])>
	//   12   22:invokevirtual   #46  <Method Object LinkedHashMap.get(Object)>
	//   13   25:checkcast       #26  <Class AnnotatedMethod>
	//   14   28:areturn         
	}

	public AnnotatedMethod find(Method method)
	{
		if(_methods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field LinkedHashMap _methods>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (AnnotatedMethod)_methods.get(((Object) (new MemberKey(method))));
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field LinkedHashMap _methods>
	//    7   13:new             #24  <Class MemberKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #33  <Method void MemberKey(Method)>
	//   11   21:invokevirtual   #46  <Method Object LinkedHashMap.get(Object)>
	//   12   24:checkcast       #26  <Class AnnotatedMethod>
	//   13   27:areturn         
	}

	public boolean isEmpty()
	{
		return _methods == null || _methods.size() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LinkedHashMap _methods>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field LinkedHashMap _methods>
	//    5   11:invokevirtual   #55  <Method int LinkedHashMap.size()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public Iterator iterator()
	{
		if(_methods != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field LinkedHashMap _methods>
	//*   2    4:ifnull          20
			return _methods.values().iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field LinkedHashMap _methods>
	//    5   11:invokevirtual   #61  <Method Collection LinkedHashMap.values()>
	//    6   14:invokeinterface #65  <Method Iterator Collection.iterator()>
	//    7   19:areturn         
		else
			return Collections.emptyList().iterator();
	//    8   20:invokestatic    #71  <Method List Collections.emptyList()>
	//    9   23:invokeinterface #74  <Method Iterator List.iterator()>
	//   10   28:areturn         
	}

	public AnnotatedMethod remove(AnnotatedMethod annotatedmethod)
	{
		return remove(annotatedmethod.getAnnotated());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method Method AnnotatedMethod.getAnnotated()>
	//    3    5:invokevirtual   #79  <Method AnnotatedMethod remove(Method)>
	//    4    8:areturn         
	}

	public AnnotatedMethod remove(Method method)
	{
		if(_methods != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field LinkedHashMap _methods>
	//*   2    4:ifnull          26
			return (AnnotatedMethod)_methods.remove(((Object) (new MemberKey(method))));
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field LinkedHashMap _methods>
	//    5   11:new             #24  <Class MemberKey>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #33  <Method void MemberKey(Method)>
	//    9   19:invokevirtual   #81  <Method Object LinkedHashMap.remove(Object)>
	//   10   22:checkcast       #26  <Class AnnotatedMethod>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public int size()
	{
		if(_methods == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field LinkedHashMap _methods>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _methods.size();
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field LinkedHashMap _methods>
	//    7   13:invokevirtual   #55  <Method int LinkedHashMap.size()>
	//    8   16:ireturn         
	}

	protected LinkedHashMap _methods;
}
