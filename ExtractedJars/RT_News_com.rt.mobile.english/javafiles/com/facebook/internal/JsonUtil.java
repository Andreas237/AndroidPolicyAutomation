// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

class JsonUtil
{
	private static final class JSONObjectEntry
		implements java.util.Map.Entry
	{

		public volatile Object getKey()
		{
			return ((Object) (getKey()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #31  <Method String getKey()>
		//    2    4:areturn         
		}

		public String getKey()
		{
			return key;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String key>
		//    2    4:areturn         
		}

		public Object getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Object value>
		//    2    4:areturn         
		}

		public Object setValue(Object obj)
		{
			throw new UnsupportedOperationException("JSONObjectEntry is immutable");
		//    0    0:new             #37  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #39  <String "JSONObjectEntry is immutable">
		//    3    6:invokespecial   #42  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		private final String key;
		private final Object value;

		JSONObjectEntry(String s, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			key = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String key>
			value = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Object value>
		//    8   14:return          
		}
	}


	JsonUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void jsonObjectClear(JSONObject jsonobject)
	{
		for(jsonobject = ((JSONObject) (jsonobject.keys())); ((Iterator) (jsonobject)).hasNext(); ((Iterator) (jsonobject)).remove())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #20  <Method Iterator JSONObject.keys()>
	//*   2    4:astore_0        
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            30
			((Iterator) (jsonobject)).next();
	//    6   14:aload_0         
	//    7   15:invokeinterface #30  <Method Object Iterator.next()>
	//    8   20:pop             

	//    9   21:aload_0         
	//   10   22:invokeinterface #33  <Method void Iterator.remove()>
	//*  11   27:goto            5
	//   12   30:return          
	}

	static boolean jsonObjectContainsValue(JSONObject jsonobject, Object obj)
	{
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #20  <Method Iterator JSONObject.keys()>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            42
		{
			Object obj1 = jsonobject.opt((String)iterator.next());
	//    6   14:aload_0         
	//    7   15:aload_2         
	//    8   16:invokeinterface #30  <Method Object Iterator.next()>
	//    9   21:checkcast       #37  <Class String>
	//   10   24:invokevirtual   #41  <Method Object JSONObject.opt(String)>
	//   11   27:astore_3        
			if(obj1 != null && obj1.equals(obj))
	//*  12   28:aload_3         
	//*  13   29:ifnull          5
	//*  14   32:aload_3         
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #45  <Method boolean Object.equals(Object)>
	//*  17   37:ifeq            5
				return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		}

		return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	static Set jsonObjectEntrySet(JSONObject jsonobject)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #49  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void HashSet()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashset.add(((Object) (new JSONObjectEntry(s, jsonobject.opt(s))))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #20  <Method Iterator JSONObject.keys()>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            53
			s = (String)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #30  <Method Object Iterator.next()>
	//   12   28:checkcast       #37  <Class String>
	//   13   31:astore_3        

	//   14   32:aload_1         
	//   15   33:new             #6   <Class JsonUtil$JSONObjectEntry>
	//   16   36:dup             
	//   17   37:aload_3         
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #41  <Method Object JSONObject.opt(String)>
	//   21   43:invokespecial   #53  <Method void JsonUtil$JSONObjectEntry(String, Object)>
	//   22   46:invokevirtual   #56  <Method boolean HashSet.add(Object)>
	//   23   49:pop             
	//*  24   50:goto            13
		return ((Set) (hashset));
	//   25   53:aload_1         
	//   26   54:areturn         
	}

	static Set jsonObjectKeySet(JSONObject jsonobject)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #49  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void HashSet()>
	//    3    7:astore_1        
		for(jsonobject = ((JSONObject) (jsonobject.keys())); ((Iterator) (jsonobject)).hasNext(); hashset.add(((Iterator) (jsonobject)).next()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #20  <Method Iterator JSONObject.keys()>
	//    6   12:astore_0        
	//    7   13:aload_0         
	//    8   14:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            36
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokeinterface #30  <Method Object Iterator.next()>
	//   13   29:invokevirtual   #56  <Method boolean HashSet.add(Object)>
	//   14   32:pop             
	//*  15   33:goto            13
		return ((Set) (hashset));
	//   16   36:aload_1         
	//   17   37:areturn         
	}

	static void jsonObjectPutAll(JSONObject jsonobject, Map map)
	{
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #70  <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #75  <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            64
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #30  <Method Object Iterator.next()>
	//    9   27:checkcast       #77  <Class java.util.Map$Entry>
	//   10   30:astore_2        
			try
			{
				jsonobject.putOpt((String)entry.getKey(), entry.getValue());
	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #80  <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #37  <Class String>
	//   15   41:aload_2         
	//   16   42:invokeinterface #83  <Method Object java.util.Map$Entry.getValue()>
	//   17   47:invokevirtual   #87  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   18   50:pop             
			}
	//*  19   51:goto            12
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  20   54:astore_0        
			{
				throw new IllegalArgumentException(((Throwable) (jsonobject)));
	//   21   55:new             #89  <Class IllegalArgumentException>
	//   22   58:dup             
	//   23   59:aload_0         
	//   24   60:invokespecial   #92  <Method void IllegalArgumentException(Throwable)>
	//   25   63:athrow          
			}
		}

	//   26   64:return          
	}

	static Collection jsonObjectValues(JSONObject jsonobject)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #97  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); arraylist.add(jsonobject.opt((String)iterator.next())));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #20  <Method Iterator JSONObject.keys()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            43
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:invokeinterface #30  <Method Object Iterator.next()>
	//   14   30:checkcast       #37  <Class String>
	//   15   33:invokevirtual   #41  <Method Object JSONObject.opt(String)>
	//   16   36:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//   17   39:pop             
	//*  18   40:goto            13
		return ((Collection) (arraylist));
	//   19   43:aload_1         
	//   20   44:areturn         
	}
}
