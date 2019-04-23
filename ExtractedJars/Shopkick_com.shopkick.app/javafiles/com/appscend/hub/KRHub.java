// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.hub;

import java.lang.reflect.Method;
import java.util.HashMap;

public class KRHub
{

	public KRHub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		adapters = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field HashMap adapters>
	//    7   15:return          
	}

	public Object adapterForType(String s)
	{
		return adapterForTypeInGroup(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #27  <Method Object adapterForTypeInGroup(String, String)>
	//    4    6:areturn         
	}

	public Object adapterForTypeInGroup(String s, String s1)
	{
		s = ((String) (adaptersForGroup(s1).get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #33  <Method HashMap adaptersForGroup(String)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method Object HashMap.get(Object)>
	//    5    9:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_33;
	//    6   10:aload_1         
	//    7   11:ifnull          33
		if(!(s instanceof Class))
			break MISSING_BLOCK_LABEL_31;
	//    8   14:aload_1         
	//    9   15:instanceof      #39  <Class Class>
	//   10   18:ifeq            31
		s = ((String) (((Class)s).newInstance()));
	//   11   21:aload_1         
	//   12   22:checkcast       #39  <Class Class>
	//   13   25:invokevirtual   #43  <Method Object Class.newInstance()>
	//   14   28:astore_1        
		return ((Object) (s));
	//   15   29:aload_1         
	//   16   30:areturn         
		return ((Object) (s));
	//   17   31:aload_1         
	//   18   32:areturn         
_L2:
		return ((Object) (null));
	//   19   33:aconst_null     
	//   20   34:areturn         
		s;
	//   21   35:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  22   36:goto            33
	}

	public HashMap adaptersForGroup(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s1 = "aps_default_adapter_group";
	//    4    6:ldc1            #8   <String "aps_default_adapter_group">
	//    5    8:astore_2        
		HashMap hashmap = (HashMap)adapters.get(((Object) (s1)));
	//    6    9:aload_0         
	//    7   10:getfield        #20  <Field HashMap adapters>
	//    8   13:aload_2         
	//    9   14:invokevirtual   #37  <Method Object HashMap.get(Object)>
	//   10   17:checkcast       #17  <Class HashMap>
	//   11   20:astore_3        
		s = ((String) (hashmap));
	//   12   21:aload_3         
	//   13   22:astore_1        
		if(hashmap == null)
	//*  14   23:aload_3         
	//*  15   24:ifnonnull       45
		{
			s = ((String) (new HashMap()));
	//   16   27:new             #17  <Class HashMap>
	//   17   30:dup             
	//   18   31:invokespecial   #18  <Method void HashMap()>
	//   19   34:astore_1        
			adapters.put(((Object) (s1)), ((Object) (s)));
	//   20   35:aload_0         
	//   21   36:getfield        #20  <Field HashMap adapters>
	//   22   39:aload_2         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #47  <Method Object HashMap.put(Object, Object)>
	//   25   44:pop             
		}
		return ((HashMap) (s));
	//   26   45:aload_1         
	//   27   46:areturn         
	}

	public void registerAdapter(Object obj)
	{
		registerAdapterInGroup(obj, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #55  <Method void registerAdapterInGroup(Object, String)>
	//    4    6:return          
	}

	public void registerAdapterInGroup(Object obj, String s)
	{
		try
		{
			Method method = obj.getClass().getMethod("type", new Class[0]);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method Class Object.getClass()>
	//    2    4:ldc1            #61  <String "type">
	//    3    6:iconst_0        
	//    4    7:anewarray       Class[]
	//    5   10:invokevirtual   #65  <Method Method Class.getMethod(String, Class[])>
	//    6   13:astore_3        
			adaptersForGroup(s).put(((Object) ((String)method.invoke(obj, new Object[0]))), obj);
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #33  <Method HashMap adaptersForGroup(String)>
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:iconst_0        
	//   13   22:anewarray       Object[]
	//   14   25:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   15   28:checkcast       #73  <Class String>
	//   16   31:aload_1         
	//   17   32:invokevirtual   #47  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			return;
	//   19   36:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  20   37:astore_1        
		{
			return;
	//   21   38:return          
		}
	}

	public void registerClass(Class class1, String s)
	{
		registerClassInGroup(class1, ((String) (null)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokevirtual   #79  <Method void registerClassInGroup(Class, String, String)>
	//    5    7:return          
	}

	public void registerClassInGroup(Class class1, String s, String s1)
	{
		adaptersForGroup(s).put(((Object) (s1)), ((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #33  <Method HashMap adaptersForGroup(String)>
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method Object HashMap.put(Object, Object)>
	//    6   10:pop             
	//    7   11:return          
	}

	public static final String kKRDefaultAdapterGroup = "aps_default_adapter_group";
	HashMap adapters;
}
