// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.*;

public abstract class ContextAttributes
{
	public static class Impl extends ContextAttributes
		implements Serializable
	{

		private Map _copy(Map map)
		{
			return ((Map) (new HashMap(map)));
		//    0    0:new             #54  <Class HashMap>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #55  <Method void HashMap(Map)>
		//    4    8:areturn         
		}

		public static ContextAttributes getEmpty()
		{
			return ((ContextAttributes) (EMPTY));
		//    0    0:getstatic       #34  <Field ContextAttributes$Impl EMPTY>
		//    1    3:areturn         
		}

		public Object getAttribute(Object obj)
		{
			if(_nonShared != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field Map _nonShared>
		//*   2    4:ifnull          35
			{
				Object obj1 = _nonShared.get(obj);
		//    3    7:aload_0         
		//    4    8:getfield        #46  <Field Map _nonShared>
		//    5   11:aload_1         
		//    6   12:invokeinterface #65  <Method Object Map.get(Object)>
		//    7   17:astore_2        
				if(obj1 != null)
		//*   8   18:aload_2         
		//*   9   19:ifnull          35
				{
					obj = obj1;
		//   10   22:aload_2         
		//   11   23:astore_1        
					if(obj1 == NULL_SURROGATE)
		//*  12   24:aload_2         
		//*  13   25:getstatic       #40  <Field Object NULL_SURROGATE>
		//*  14   28:if_acmpne       33
						obj = null;
		//   15   31:aconst_null     
		//   16   32:astore_1        
					return obj;
		//   17   33:aload_1         
		//   18   34:areturn         
				}
			}
			return _shared.get(obj);
		//   19   35:aload_0         
		//   20   36:getfield        #44  <Field Map _shared>
		//   21   39:aload_1         
		//   22   40:invokeinterface #65  <Method Object Map.get(Object)>
		//   23   45:areturn         
		}

		protected ContextAttributes nonSharedInstance(Object obj, Object obj1)
		{
			HashMap hashmap = new HashMap();
		//    0    0:new             #54  <Class HashMap>
		//    1    3:dup             
		//    2    4:invokespecial   #68  <Method void HashMap()>
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
		//   13   23:invokeinterface #72  <Method Object Map.put(Object, Object)>
		//   14   28:pop             
			return ((ContextAttributes) (new Impl(_shared, ((Map) (hashmap)))));
		//   15   29:new             #2   <Class ContextAttributes$Impl>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:getfield        #44  <Field Map _shared>
		//   19   37:aload           4
		//   20   39:invokespecial   #74  <Method void ContextAttributes$Impl(Map, Map)>
		//   21   42:areturn         
		}

		public ContextAttributes withPerCallAttribute(Object obj, Object obj1)
		{
			Object obj2;
label0:
			{
label1:
				{
					obj2 = obj1;
		//    0    0:aload_2         
		//    1    1:astore_3        
					if(obj1 == null)
		//*   2    2:aload_2         
		//*   3    3:ifnonnull       25
					{
						obj1 = ((Object) (this));
		//    4    6:aload_0         
		//    5    7:astore_2        
						if(!_shared.containsKey(obj))
							break label1;
		//    6    8:aload_0         
		//    7    9:getfield        #44  <Field Map _shared>
		//    8   12:aload_1         
		//    9   13:invokeinterface #79  <Method boolean Map.containsKey(Object)>
		//   10   18:ifeq            39
						obj2 = NULL_SURROGATE;
		//   11   21:getstatic       #40  <Field Object NULL_SURROGATE>
		//   12   24:astore_3        
					}
					if(_nonShared != null)
						break label0;
		//   13   25:aload_0         
		//   14   26:getfield        #46  <Field Map _nonShared>
		//   15   29:ifnonnull       41
					obj1 = ((Object) (nonSharedInstance(obj, obj2)));
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:aload_3         
		//   19   35:invokevirtual   #81  <Method ContextAttributes nonSharedInstance(Object, Object)>
		//   20   38:astore_2        
				}
				return ((ContextAttributes) (obj1));
		//   21   39:aload_2         
		//   22   40:areturn         
			}
			_nonShared.put(obj, obj2);
		//   23   41:aload_0         
		//   24   42:getfield        #46  <Field Map _nonShared>
		//   25   45:aload_1         
		//   26   46:aload_3         
		//   27   47:invokeinterface #72  <Method Object Map.put(Object, Object)>
		//   28   52:pop             
			return ((ContextAttributes) (this));
		//   29   53:aload_0         
		//   30   54:areturn         
		}

		public ContextAttributes withSharedAttribute(Object obj, Object obj1)
		{
			Object obj2;
			if(this == EMPTY)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #34  <Field ContextAttributes$Impl EMPTY>
		//*   2    4:if_acmpne       35
				obj2 = ((Object) (new HashMap(8)));
		//    3    7:new             #54  <Class HashMap>
		//    4   10:dup             
		//    5   11:bipush          8
		//    6   13:invokespecial   #85  <Method void HashMap(int)>
		//    7   16:astore_3        
			else
		//*   8   17:aload_3         
		//*   9   18:aload_1         
		//*  10   19:aload_2         
		//*  11   20:invokeinterface #72  <Method Object Map.put(Object, Object)>
		//*  12   25:pop             
		//*  13   26:new             #2   <Class ContextAttributes$Impl>
		//*  14   29:dup             
		//*  15   30:aload_3         
		//*  16   31:invokespecial   #32  <Method void ContextAttributes$Impl(Map)>
		//*  17   34:areturn         
				obj2 = ((Object) (_copy(_shared)));
		//   18   35:aload_0         
		//   19   36:aload_0         
		//   20   37:getfield        #44  <Field Map _shared>
		//   21   40:invokespecial   #87  <Method Map _copy(Map)>
		//   22   43:astore_3        
			((Map) (obj2)).put(obj, obj1);
			return ((ContextAttributes) (new Impl(((Map) (obj2)))));
		//*  23   44:goto            17
		}

		public ContextAttributes withSharedAttributes(Map map)
		{
			return ((ContextAttributes) (new Impl(map)));
		//    0    0:new             #2   <Class ContextAttributes$Impl>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #32  <Method void ContextAttributes$Impl(Map)>
		//    4    8:areturn         
		}

		public ContextAttributes withoutSharedAttribute(Object obj)
		{
			while(_shared.isEmpty() || !_shared.containsKey(obj)) 
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field Map _shared>
		//*   2    4:invokeinterface #96  <Method boolean Map.isEmpty()>
		//*   3    9:ifeq            14
				return ((ContextAttributes) (this));
		//    4   12:aload_0         
		//    5   13:areturn         
		//    6   14:aload_0         
		//    7   15:getfield        #44  <Field Map _shared>
		//    8   18:aload_1         
		//    9   19:invokeinterface #79  <Method boolean Map.containsKey(Object)>
		//   10   24:ifeq            12
			if(_shared.size() == 1)
		//*  11   27:aload_0         
		//*  12   28:getfield        #44  <Field Map _shared>
		//*  13   31:invokeinterface #100 <Method int Map.size()>
		//*  14   36:iconst_1        
		//*  15   37:icmpne          44
			{
				return ((ContextAttributes) (EMPTY));
		//   16   40:getstatic       #34  <Field ContextAttributes$Impl EMPTY>
		//   17   43:areturn         
			} else
			{
				Map map = _copy(_shared);
		//   18   44:aload_0         
		//   19   45:aload_0         
		//   20   46:getfield        #44  <Field Map _shared>
		//   21   49:invokespecial   #87  <Method Map _copy(Map)>
		//   22   52:astore_2        
				map.remove(obj);
		//   23   53:aload_2         
		//   24   54:aload_1         
		//   25   55:invokeinterface #103 <Method Object Map.remove(Object)>
		//   26   60:pop             
				return ((ContextAttributes) (new Impl(map)));
		//   27   61:new             #2   <Class ContextAttributes$Impl>
		//   28   64:dup             
		//   29   65:aload_2         
		//   30   66:invokespecial   #32  <Method void ContextAttributes$Impl(Map)>
		//   31   69:areturn         
			}
		}

		protected static final Impl EMPTY = new Impl(Collections.emptyMap());
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

		protected Impl(Map map)
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

		protected Impl(Map map, Map map1)
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


	public ContextAttributes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static ContextAttributes getEmpty()
	{
		return Impl.getEmpty();
	//    0    0:invokestatic    #16  <Method ContextAttributes ContextAttributes$Impl.getEmpty()>
	//    1    3:areturn         
	}

	public abstract Object getAttribute(Object obj);

	public abstract ContextAttributes withPerCallAttribute(Object obj, Object obj1);

	public abstract ContextAttributes withSharedAttribute(Object obj, Object obj1);

	public abstract ContextAttributes withSharedAttributes(Map map);

	public abstract ContextAttributes withoutSharedAttribute(Object obj);
}
