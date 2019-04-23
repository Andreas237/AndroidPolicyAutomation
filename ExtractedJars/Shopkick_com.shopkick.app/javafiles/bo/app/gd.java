// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public final class gd
{

	public static String a(String s, String s1)
	{
		if("".equals(((Object) (s))))
	//*   0    0:ldc1            #20  <String "">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #26  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            11
		{
			return s1;
	//    4    9:aload_1         
	//    5   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #28  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #30  <Method void StringBuilder()>
	//    9   18:astore_2        
			stringbuilder.append(s);
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(".");
	//   14   25:aload_2         
	//   15   26:ldc1            #36  <String ".">
	//   16   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
			stringbuilder.append(s1);
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
			return stringbuilder.toString();
	//   22   38:aload_2         
	//   23   39:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   24   42:areturn         
		}
	}

	public static String a(String s, String s1, Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("[");
	//    8   14:aload_3         
	//    9   15:ldc1            #43  <String "[">
	//   10   17:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(s1);
	//   12   21:aload_3         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		stringbuilder.append("=");
	//   16   27:aload_3         
	//   17   28:ldc1            #45  <String "=">
	//   18   30:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		stringbuilder.append(obj);
	//   20   34:aload_3         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   23   39:pop             
		stringbuilder.append("]");
	//   24   40:aload_3         
	//   25   41:ldc1            #50  <String "]">
	//   26   43:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   27   46:pop             
		return stringbuilder.toString();
	//   28   47:aload_3         
	//   29   48:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   30   51:areturn         
	}

	public static String a(JSONArray jsonarray)
	{
		for(Iterator iterator = a((JSONObject)jsonarray.get(0)).iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #57  <Method Object JSONArray.get(int)>
	//*   3    5:checkcast       #59  <Class JSONObject>
	//*   4    8:invokestatic    #62  <Method Set a(JSONObject)>
	//*   5   11:invokeinterface #68  <Method Iterator Set.iterator()>
	//*   6   16:astore_1        
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            46
		{
			String s = (String)iterator.next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #78  <Method Object Iterator.next()>
	//   12   32:checkcast       #22  <Class String>
	//   13   35:astore_2        
			if(a(s, jsonarray))
	//*  14   36:aload_2         
	//*  15   37:aload_0         
	//*  16   38:invokestatic    #81  <Method boolean a(String, JSONArray)>
	//*  17   41:ifeq            17
				return s;
	//   18   44:aload_2         
	//   19   45:areturn         
		}

		return null;
	//   20   46:aconst_null     
	//   21   47:areturn         
	}

	public static Map a(Collection collection)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #84  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void HashMap()>
	//    3    7:astore_1        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #88  <Method Iterator Collection.iterator()>
	//*   6   14:astore_0        
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            84
		{
			Object obj = ((Iterator) (collection)).next();
	//   10   24:aload_0         
	//   11   25:invokeinterface #78  <Method Object Iterator.next()>
	//   12   30:astore_2        
			Integer integer = (Integer)((Map) (hashmap)).get(obj);
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokeinterface #93  <Method Object Map.get(Object)>
	//   16   38:checkcast       #10  <Class Integer>
	//   17   41:astore_3        
			if(integer == null)
	//*  18   42:aload_3         
	//*  19   43:ifnonnull       60
				((Map) (hashmap)).put(obj, ((Object) (a)));
	//   20   46:aload_1         
	//   21   47:aload_2         
	//   22   48:getstatic       #16  <Field Integer a>
	//   23   51:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   24   56:pop             
			else
	//*  25   57:goto            15
				((Map) (hashmap)).put(obj, ((Object) (new Integer(integer.intValue() + 1))));
	//   26   60:aload_1         
	//   27   61:aload_2         
	//   28   62:new             #10  <Class Integer>
	//   29   65:dup             
	//   30   66:aload_3         
	//   31   67:invokevirtual   #101 <Method int Integer.intValue()>
	//   32   70:iconst_1        
	//   33   71:iadd            
	//   34   72:invokespecial   #14  <Method void Integer(int)>
	//   35   75:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   36   80:pop             
		}

	//*  37   81:goto            15
		return ((Map) (hashmap));
	//   38   84:aload_1         
	//   39   85:areturn         
	}

	public static Map a(JSONArray jsonarray, String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #84  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void HashMap()>
	//    3    7:astore_3        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #107 <Method int JSONArray.length()>
	//*   9   15:icmpge          50
		{
			JSONObject jsonobject = (JSONObject)jsonarray.get(i);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #57  <Method Object JSONArray.get(int)>
	//   13   23:checkcast       #59  <Class JSONObject>
	//   14   26:astore          4
			((Map) (hashmap)).put(jsonobject.get(s), ((Object) (jsonobject)));
	//   15   28:aload_3         
	//   16   29:aload           4
	//   17   31:aload_1         
	//   18   32:invokevirtual   #110 <Method Object JSONObject.get(String)>
	//   19   35:aload           4
	//   20   37:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   21   42:pop             
		}

	//   22   43:iload_2         
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore_2        
	//*  26   47:goto            10
		return ((Map) (hashmap));
	//   27   50:aload_3         
	//   28   51:areturn         
	}

	public static Set a(JSONObject jsonobject)
	{
		TreeSet treeset = new TreeSet();
	//    0    0:new             #113 <Class TreeSet>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void TreeSet()>
	//    3    7:astore_1        
		for(jsonobject = ((JSONObject) (jsonobject.keys())); ((Iterator) (jsonobject)).hasNext(); ((Set) (treeset)).add(((Object) ((String)((Iterator) (jsonobject)).next()))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #117 <Method Iterator JSONObject.keys()>
	//    6   12:astore_0        
	//    7   13:aload_0         
	//    8   14:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokeinterface #78  <Method Object Iterator.next()>
	//   13   29:checkcast       #22  <Class String>
	//   14   32:invokeinterface #120 <Method boolean Set.add(Object)>
	//   15   37:pop             
	//*  16   38:goto            13
		return ((Set) (treeset));
	//   17   41:aload_1         
	//   18   42:areturn         
	}

	public static boolean a(Object obj)
	{
		return !(obj instanceof JSONObject) && !(obj instanceof JSONArray);
	//    0    0:aload_0         
	//    1    1:instanceof      #59  <Class JSONObject>
	//    2    4:ifne            16
	//    3    7:aload_0         
	//    4    8:instanceof      #53  <Class JSONArray>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean a(String s, JSONArray jsonarray)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #123 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void HashSet()>
	//    3    7:astore_3        
		for(int i = 0; i < jsonarray.length();)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #107 <Method int JSONArray.length()>
	//*   9   15:icmpge          98
		{
			Object obj = jsonarray.get(i);
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #57  <Method Object JSONArray.get(int)>
	//   13   23:astore          4
			if(obj instanceof JSONObject)
	//*  14   25:aload           4
	//*  15   27:instanceof      #59  <Class JSONObject>
	//*  16   30:ifeq            96
			{
				obj = ((Object) ((JSONObject)obj));
	//   17   33:aload           4
	//   18   35:checkcast       #59  <Class JSONObject>
	//   19   38:astore          4
				if(((JSONObject) (obj)).has(s))
	//*  20   40:aload           4
	//*  21   42:aload_0         
	//*  22   43:invokevirtual   #128 <Method boolean JSONObject.has(String)>
	//*  23   46:ifeq            94
				{
					obj = ((JSONObject) (obj)).get(s);
	//   24   49:aload           4
	//   25   51:aload_0         
	//   26   52:invokevirtual   #110 <Method Object JSONObject.get(String)>
	//   27   55:astore          4
					if(a(obj) && !((Set) (hashset)).contains(obj))
	//*  28   57:aload           4
	//*  29   59:invokestatic    #130 <Method boolean a(Object)>
	//*  30   62:ifeq            92
	//*  31   65:aload_3         
	//*  32   66:aload           4
	//*  33   68:invokeinterface #133 <Method boolean Set.contains(Object)>
	//*  34   73:ifne            92
					{
						((Set) (hashset)).add(obj);
	//   35   76:aload_3         
	//   36   77:aload           4
	//   37   79:invokeinterface #120 <Method boolean Set.add(Object)>
	//   38   84:pop             
						i++;
	//   39   85:iload_2         
	//   40   86:iconst_1        
	//   41   87:iadd            
	//   42   88:istore_2        
					} else
	//*  43   89:goto            10
					{
						return false;
	//   44   92:iconst_0        
	//   45   93:ireturn         
					}
				} else
				{
					return false;
	//   46   94:iconst_0        
	//   47   95:ireturn         
				}
			} else
			{
				return false;
	//   48   96:iconst_0        
	//   49   97:ireturn         
			}
		}

		return true;
	//   50   98:iconst_1        
	//   51   99:ireturn         
	}

	public static List b(JSONArray jsonarray)
	{
		ArrayList arraylist = new ArrayList(jsonarray.length());
	//    0    0:new             #137 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #107 <Method int JSONArray.length()>
	//    4    8:invokespecial   #138 <Method void ArrayList(int)>
	//    5   11:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #107 <Method int JSONArray.length()>
	//*  11   19:icmpge          41
			((List) (arraylist)).add(jsonarray.get(i));
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #57  <Method Object JSONArray.get(int)>
	//   16   28:invokeinterface #141 <Method boolean List.add(Object)>
	//   17   33:pop             

	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            14
		return ((List) (arraylist));
	//   23   41:aload_2         
	//   24   42:areturn         
	}

	public static boolean c(JSONArray jsonarray)
	{
		for(int i = 0; i < jsonarray.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #107 <Method int JSONArray.length()>
	//*   5    7:icmpge          30
			if(!a(jsonarray.get(i)))
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #57  <Method Object JSONArray.get(int)>
	//*   9   15:invokestatic    #130 <Method boolean a(Object)>
	//*  10   18:ifne            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         

	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            2
		return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
	}

	public static boolean d(JSONArray jsonarray)
	{
		for(int i = 0; i < jsonarray.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #107 <Method int JSONArray.length()>
	//*   5    7:icmpge          30
			if(!(jsonarray.get(i) instanceof JSONObject))
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #57  <Method Object JSONArray.get(int)>
	//*   9   15:instanceof      #59  <Class JSONObject>
	//*  10   18:ifne            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         

	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            2
		return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
	}

	private static Integer a = new Integer(1);

	static 
	{
	//    0    0:new             #10  <Class Integer>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #14  <Method void Integer(int)>
	//    4    8:putstatic       #16  <Field Integer a>
	//*   5   11:return          
	}
}
