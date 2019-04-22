// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			ContextAttributes

public static class ContextAttributes$Impl extends ContextAttributes
	implements Serializable
{

	public static ContextAttributes getEmpty()
	{
		return ((ContextAttributes) (EMPTY));
	//    0    0:getstatic       #34  <Field ContextAttributes$Impl EMPTY>
	//    1    3:areturn         
	}

	public Object getAttribute(Object obj)
	{
		Object obj1 = ((Object) (_nonShared));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map _nonShared>
	//    2    4:astore_2        
		if(obj1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          32
		{
			obj1 = ((Map) (obj1)).get(obj);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #59  <Method Object Map.get(Object)>
	//    8   16:astore_2        
			if(obj1 != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          32
				if(obj1 == NULL_SURROGATE)
	//*  11   21:aload_2         
	//*  12   22:getstatic       #40  <Field Object NULL_SURROGATE>
	//*  13   25:if_acmpne       30
					return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
				else
					return obj1;
	//   16   30:aload_2         
	//   17   31:areturn         
		}
		return _shared.get(obj);
	//   18   32:aload_0         
	//   19   33:getfield        #44  <Field Map _shared>
	//   20   36:aload_1         
	//   21   37:invokeinterface #59  <Method Object Map.get(Object)>
	//   22   42:areturn         
	}

	protected ContextAttributes nonSharedInstance(Object obj, Object obj1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #63  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void HashMap()>
	//    3    7:astore          4
		Object obj2 = obj1;
	//    4    9:aload_2         
	//    5   10:astore_3        
		if(obj1 == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       19
			obj2 = NULL_SURROGATE;
	//    8   15:getstatic       #40  <Field Object NULL_SURROGATE>
	//    9   18:astore_3        
		((Map) (hashmap)).put(obj, obj2);
	//   10   19:aload           4
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:invokeinterface #68  <Method Object Map.put(Object, Object)>
	//   14   28:pop             
		return ((ContextAttributes) (new ContextAttributes$Impl(_shared, ((Map) (hashmap)))));
	//   15   29:new             #2   <Class ContextAttributes$Impl>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #44  <Field Map _shared>
	//   19   37:aload           4
	//   20   39:invokespecial   #70  <Method void ContextAttributes$Impl(Map, Map)>
	//   21   42:areturn         
	}

	public ContextAttributes withPerCallAttribute(Object obj, Object obj1)
	{
		Object obj2 = obj1;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(obj1 == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       62
			if(_shared.containsKey(obj))
	//*   4    6:aload_0         
	//*   5    7:getfield        #44  <Field Map _shared>
	//*   6   10:aload_1         
	//*   7   11:invokeinterface #75  <Method boolean Map.containsKey(Object)>
	//*   8   16:ifeq            26
			{
				obj2 = NULL_SURROGATE;
	//    9   19:getstatic       #40  <Field Object NULL_SURROGATE>
	//   10   22:astore_3        
			} else
	//*  11   23:goto            62
			{
				obj1 = ((Object) (_nonShared));
	//   12   26:aload_0         
	//   13   27:getfield        #46  <Field Map _nonShared>
	//   14   30:astore_2        
				if(obj1 != null)
	//*  15   31:aload_2         
	//*  16   32:ifnull          60
				{
					if(!((Map) (obj1)).containsKey(obj))
	//*  17   35:aload_2         
	//*  18   36:aload_1         
	//*  19   37:invokeinterface #75  <Method boolean Map.containsKey(Object)>
	//*  20   42:ifne            47
					{
						return ((ContextAttributes) (this));
	//   21   45:aload_0         
	//   22   46:areturn         
					} else
					{
						_nonShared.remove(obj);
	//   23   47:aload_0         
	//   24   48:getfield        #46  <Field Map _nonShared>
	//   25   51:aload_1         
	//   26   52:invokeinterface #78  <Method Object Map.remove(Object)>
	//   27   57:pop             
						return ((ContextAttributes) (this));
	//   28   58:aload_0         
	//   29   59:areturn         
					}
				} else
				{
					return ((ContextAttributes) (this));
	//   30   60:aload_0         
	//   31   61:areturn         
				}
			}
		obj1 = ((Object) (_nonShared));
	//   32   62:aload_0         
	//   33   63:getfield        #46  <Field Map _nonShared>
	//   34   66:astore_2        
		if(obj1 == null)
	//*  35   67:aload_2         
	//*  36   68:ifnonnull       78
		{
			return nonSharedInstance(obj, obj2);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:aload_3         
	//   40   74:invokevirtual   #80  <Method ContextAttributes nonSharedInstance(Object, Object)>
	//   41   77:areturn         
		} else
		{
			((Map) (obj1)).put(obj, obj2);
	//   42   78:aload_2         
	//   43   79:aload_1         
	//   44   80:aload_3         
	//   45   81:invokeinterface #68  <Method Object Map.put(Object, Object)>
	//   46   86:pop             
			return ((ContextAttributes) (this));
	//   47   87:aload_0         
	//   48   88:areturn         
		}
	}

	protected static final ContextAttributes$Impl EMPTY = new ContextAttributes$Impl(Collections.emptyMap());
	protected static final Object NULL_SURROGATE = new Object();
	private static final long serialVersionUID = 1L;
	protected transient Map _nonShared;
	protected final Map _shared;

	static 
	{
	//    0    0:new             #2   <Class ContextAttributes$Impl>
	//    1    3:dup             
	//    2    4:invokestatic    #28  <Method Map Collections.emptyMap()>
	//    3    7:invokespecial   #32  <Method void ContextAttributes$Impl(Map)>
	//    4   10:putstatic       #34  <Field ContextAttributes$Impl EMPTY>
	//    5   13:new             #36  <Class Object>
	//    6   16:dup             
	//    7   17:invokespecial   #38  <Method void Object()>
	//    8   20:putstatic       #40  <Field Object NULL_SURROGATE>
	//*   9   23:return          
	}

	protected ContextAttributes$Impl(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void ContextAttributes()>
		_shared = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field Map _shared>
		_nonShared = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #46  <Field Map _nonShared>
	//    8   14:return          
	}

	protected ContextAttributes$Impl(Map map, Map map1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void ContextAttributes()>
		_shared = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field Map _shared>
		_nonShared = map1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field Map _nonShared>
	//    8   14:return          
	}
}
