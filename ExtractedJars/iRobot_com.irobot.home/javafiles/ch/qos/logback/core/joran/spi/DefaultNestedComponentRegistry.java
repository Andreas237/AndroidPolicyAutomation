// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			HostClassAndPropertyDouble

public class DefaultNestedComponentRegistry
{

	public DefaultNestedComponentRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		defaultComponentMap = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field Map defaultComponentMap>
	//    7   15:return          
	}

	private Class oneShotFind(Class class1, String s)
	{
		class1 = ((Class) (new HostClassAndPropertyDouble(class1, s)));
	//    0    0:new             #21  <Class HostClassAndPropertyDouble>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #24  <Method void HostClassAndPropertyDouble(Class, String)>
	//    5    9:astore_1        
		return (Class)defaultComponentMap.get(((Object) (class1)));
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field Map defaultComponentMap>
	//    8   14:aload_1         
	//    9   15:invokeinterface #30  <Method Object Map.get(Object)>
	//   10   20:checkcast       #32  <Class Class>
	//   11   23:areturn         
	}

	public void add(Class class1, String s, Class class2)
	{
		class1 = ((Class) (new HostClassAndPropertyDouble(class1, s.toLowerCase())));
	//    0    0:new             #21  <Class HostClassAndPropertyDouble>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method String String.toLowerCase()>
	//    5    9:invokespecial   #24  <Method void HostClassAndPropertyDouble(Class, String)>
	//    6   12:astore_1        
		defaultComponentMap.put(((Object) (class1)), ((Object) (class2)));
	//    7   13:aload_0         
	//    8   14:getfield        #16  <Field Map defaultComponentMap>
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   12   24:pop             
	//   13   25:return          
	}

	public Class findDefaultComponentType(Class class1, String s)
	{
		s = s.toLowerCase();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #42  <Method String String.toLowerCase()>
	//    2    4:astore_2        
		for(; class1 != null; class1 = class1.getSuperclass())
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			Class class2 = oneShotFind(class1, s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #50  <Method Class oneShotFind(Class, String)>
	//    9   15:astore_3        
			if(class2 != null)
	//*  10   16:aload_3         
	//*  11   17:ifnull          22
				return class2;
	//   12   20:aload_3         
	//   13   21:areturn         
		}

	//   14   22:aload_1         
	//   15   23:invokevirtual   #54  <Method Class Class.getSuperclass()>
	//   16   26:astore_1        
	//*  17   27:goto            5
		return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
	}

	Map defaultComponentMap;
}
