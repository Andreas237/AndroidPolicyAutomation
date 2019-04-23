// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			gc, fy, gd

public abstract class ga
	implements gc
{

	public ga()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final fy a(JSONArray jsonarray, JSONArray jsonarray1)
	{
		fy fy1 = new fy();
	//    0    0:new             #15  <Class fy>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void fy()>
	//    3    7:astore_3        
		e("", jsonarray, jsonarray1, fy1);
	//    4    8:aload_0         
	//    5    9:ldc1            #18  <String "">
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:invokevirtual   #22  <Method void e(String, JSONArray, JSONArray, fy)>
		return fy1;
	//   10   17:aload_3         
	//   11   18:areturn         
	}

	public final fy a(JSONObject jsonobject, JSONObject jsonobject1)
	{
		fy fy1 = new fy();
	//    0    0:new             #15  <Class fy>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void fy()>
	//    3    7:astore_3        
		c("", jsonobject, jsonobject1, fy1);
	//    4    8:aload_0         
	//    5    9:ldc1            #18  <String "">
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:invokevirtual   #27  <Method void c(String, JSONObject, JSONObject, fy)>
		return fy1;
	//   10   17:aload_3         
	//   11   18:areturn         
	}

	protected void a(String s, JSONArray jsonarray, JSONArray jsonarray1, fy fy1)
	{
		String s1 = gd.a(jsonarray);
	//    0    0:aload_2         
	//    1    1:invokestatic    #32  <Method String gd.a(JSONArray)>
	//    2    4:astore          5
		if(s1 != null && gd.a(s1, jsonarray1))
	//*   3    6:aload           5
	//*   4    8:ifnull          221
	//*   5   11:aload           5
	//*   6   13:aload_3         
	//*   7   14:invokestatic    #35  <Method boolean gd.a(String, JSONArray)>
	//*   8   17:ifne            23
	//*   9   20:goto            221
		{
			jsonarray = ((JSONArray) (gd.a(jsonarray, s1)));
	//   10   23:aload_2         
	//   11   24:aload           5
	//   12   26:invokestatic    #38  <Method Map gd.a(JSONArray, String)>
	//   13   29:astore_2        
			jsonarray1 = ((JSONArray) (gd.a(jsonarray1, s1)));
	//   14   30:aload_3         
	//   15   31:aload           5
	//   16   33:invokestatic    #38  <Method Map gd.a(JSONArray, String)>
	//   17   36:astore_3        
			for(Iterator iterator = ((Map) (jsonarray)).keySet().iterator(); iterator.hasNext();)
	//*  18   37:aload_2         
	//*  19   38:invokeinterface #44  <Method Set Map.keySet()>
	//*  20   43:invokeinterface #50  <Method Iterator Set.iterator()>
	//*  21   48:astore          6
	//*  22   50:aload           6
	//*  23   52:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//*  24   57:ifeq            152
			{
				Object obj = iterator.next();
	//   25   60:aload           6
	//   26   62:invokeinterface #60  <Method Object Iterator.next()>
	//   27   67:astore          7
				if(!((Map) (jsonarray1)).containsKey(obj))
	//*  28   69:aload_3         
	//*  29   70:aload           7
	//*  30   72:invokeinterface #64  <Method boolean Map.containsKey(Object)>
	//*  31   77:ifne            105
				{
					fy1.a(gd.a(s, s1, obj), ((Map) (jsonarray)).get(obj));
	//   32   80:aload           4
	//   33   82:aload_1         
	//   34   83:aload           5
	//   35   85:aload           7
	//   36   87:invokestatic    #67  <Method String gd.a(String, String, Object)>
	//   37   90:aload_2         
	//   38   91:aload           7
	//   39   93:invokeinterface #71  <Method Object Map.get(Object)>
	//   40   98:invokevirtual   #74  <Method fy fy.a(String, Object)>
	//   41  101:pop             
				} else
	//*  42  102:goto            50
				{
					JSONObject jsonobject = (JSONObject)((Map) (jsonarray)).get(obj);
	//   43  105:aload_2         
	//   44  106:aload           7
	//   45  108:invokeinterface #71  <Method Object Map.get(Object)>
	//   46  113:checkcast       #76  <Class JSONObject>
	//   47  116:astore          8
					JSONObject jsonobject1 = (JSONObject)((Map) (jsonarray1)).get(obj);
	//   48  118:aload_3         
	//   49  119:aload           7
	//   50  121:invokeinterface #71  <Method Object Map.get(Object)>
	//   51  126:checkcast       #76  <Class JSONObject>
	//   52  129:astore          9
					a(gd.a(s, s1, obj), ((Object) (jsonobject)), ((Object) (jsonobject1)), fy1);
	//   53  131:aload_0         
	//   54  132:aload_1         
	//   55  133:aload           5
	//   56  135:aload           7
	//   57  137:invokestatic    #67  <Method String gd.a(String, String, Object)>
	//   58  140:aload           8
	//   59  142:aload           9
	//   60  144:aload           4
	//   61  146:invokevirtual   #79  <Method void a(String, Object, Object, fy)>
				}
			}

	//*  62  149:goto            50
			Iterator iterator1 = ((Map) (jsonarray1)).keySet().iterator();
	//   63  152:aload_3         
	//   64  153:invokeinterface #44  <Method Set Map.keySet()>
	//   65  158:invokeinterface #50  <Method Iterator Set.iterator()>
	//   66  163:astore          6
			do
			{
				if(!iterator1.hasNext())
					break;
	//   67  165:aload           6
	//   68  167:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//   69  172:ifeq            220
				Object obj1 = iterator1.next();
	//   70  175:aload           6
	//   71  177:invokeinterface #60  <Method Object Iterator.next()>
	//   72  182:astore          7
				if(!((Map) (jsonarray)).containsKey(obj1))
	//*  73  184:aload_2         
	//*  74  185:aload           7
	//*  75  187:invokeinterface #64  <Method boolean Map.containsKey(Object)>
	//*  76  192:ifne            165
					fy1.b(gd.a(s, s1, obj1), ((Map) (jsonarray1)).get(obj1));
	//   77  195:aload           4
	//   78  197:aload_1         
	//   79  198:aload           5
	//   80  200:aload           7
	//   81  202:invokestatic    #67  <Method String gd.a(String, String, Object)>
	//   82  205:aload_3         
	//   83  206:aload           7
	//   84  208:invokeinterface #71  <Method Object Map.get(Object)>
	//   85  213:invokevirtual   #82  <Method fy fy.b(String, Object)>
	//   86  216:pop             
			} while(true);
	//   87  217:goto            165
			return;
	//   88  220:return          
		} else
		{
			d(s, jsonarray, jsonarray1, fy1);
	//   89  221:aload_0         
	//   90  222:aload_1         
	//   91  223:aload_2         
	//   92  224:aload_3         
	//   93  225:aload           4
	//   94  227:invokevirtual   #85  <Method void d(String, JSONArray, JSONArray, fy)>
			return;
	//   95  230:return          
		}
	}

	protected void a(String s, JSONObject jsonobject, JSONObject jsonobject1, fy fy1)
	{
		jsonobject1 = ((JSONObject) (gd.a(jsonobject1).iterator()));
	//    0    0:aload_3         
	//    1    1:invokestatic    #88  <Method Set gd.a(JSONObject)>
	//    2    4:invokeinterface #50  <Method Iterator Set.iterator()>
	//    3    9:astore_3        
		do
		{
			if(!((Iterator) (jsonobject1)).hasNext())
				break;
	//    4   10:aload_3         
	//    5   11:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            51
			String s1 = (String)((Iterator) (jsonobject1)).next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #60  <Method Object Iterator.next()>
	//    9   25:checkcast       #90  <Class String>
	//   10   28:astore          5
			if(!jsonobject.has(s1))
	//*  11   30:aload_2         
	//*  12   31:aload           5
	//*  13   33:invokevirtual   #94  <Method boolean JSONObject.has(String)>
	//*  14   36:ifne            10
				fy1.b(s, ((Object) (s1)));
	//   15   39:aload           4
	//   16   41:aload_1         
	//   17   42:aload           5
	//   18   44:invokevirtual   #82  <Method fy fy.b(String, Object)>
	//   19   47:pop             
		} while(true);
	//   20   48:goto            10
	//   21   51:return          
	}

	protected void b(String s, JSONArray jsonarray, JSONArray jsonarray1, fy fy1)
	{
		jsonarray = ((JSONArray) (gd.a(((java.util.Collection) (gd.b(jsonarray))))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #97  <Method java.util.List gd.b(JSONArray)>
	//    2    4:invokestatic    #100 <Method Map gd.a(java.util.Collection)>
	//    3    7:astore_2        
		jsonarray1 = ((JSONArray) (gd.a(((java.util.Collection) (gd.b(jsonarray1))))));
	//    4    8:aload_3         
	//    5    9:invokestatic    #97  <Method java.util.List gd.b(JSONArray)>
	//    6   12:invokestatic    #100 <Method Map gd.a(java.util.Collection)>
	//    7   15:astore_3        
		Iterator iterator = ((Map) (jsonarray)).keySet().iterator();
	//    8   16:aload_2         
	//    9   17:invokeinterface #44  <Method Set Map.keySet()>
	//   10   22:invokeinterface #50  <Method Iterator Set.iterator()>
	//   11   27:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   29:aload           5
	//   13   31:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//   14   36:ifeq            221
			Object obj1 = iterator.next();
	//   15   39:aload           5
	//   16   41:invokeinterface #60  <Method Object Iterator.next()>
	//   17   46:astore          6
			if(!((Map) (jsonarray1)).containsKey(obj1))
	//*  18   48:aload_3         
	//*  19   49:aload           6
	//*  20   51:invokeinterface #64  <Method boolean Map.containsKey(Object)>
	//*  21   56:ifne            99
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   22   59:new             #102 <Class StringBuilder>
	//   23   62:dup             
	//   24   63:invokespecial   #103 <Method void StringBuilder()>
	//   25   66:astore          7
				stringbuilder1.append(s);
	//   26   68:aload           7
	//   27   70:aload_1         
	//   28   71:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   29   74:pop             
				stringbuilder1.append("[]");
	//   30   75:aload           7
	//   31   77:ldc1            #109 <String "[]">
	//   32   79:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   33   82:pop             
				fy1.a(stringbuilder1.toString(), obj1);
	//   34   83:aload           4
	//   35   85:aload           7
	//   36   87:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   37   90:aload           6
	//   38   92:invokevirtual   #74  <Method fy fy.a(String, Object)>
	//   39   95:pop             
			} else
	//*  40   96:goto            29
			if(!((Integer)((Map) (jsonarray1)).get(obj1)).equals(((Map) (jsonarray)).get(obj1)))
	//*  41   99:aload_3         
	//*  42  100:aload           6
	//*  43  102:invokeinterface #71  <Method Object Map.get(Object)>
	//*  44  107:checkcast       #115 <Class Integer>
	//*  45  110:aload_2         
	//*  46  111:aload           6
	//*  47  113:invokeinterface #71  <Method Object Map.get(Object)>
	//*  48  118:invokevirtual   #118 <Method boolean Integer.equals(Object)>
	//*  49  121:ifne            29
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   50  124:new             #102 <Class StringBuilder>
	//   51  127:dup             
	//   52  128:invokespecial   #103 <Method void StringBuilder()>
	//   53  131:astore          7
				stringbuilder2.append(s);
	//   54  133:aload           7
	//   55  135:aload_1         
	//   56  136:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   57  139:pop             
				stringbuilder2.append("[]: Expected ");
	//   58  140:aload           7
	//   59  142:ldc1            #120 <String "[]: Expected ">
	//   60  144:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   61  147:pop             
				stringbuilder2.append(((Map) (jsonarray)).get(obj1));
	//   62  148:aload           7
	//   63  150:aload_2         
	//   64  151:aload           6
	//   65  153:invokeinterface #71  <Method Object Map.get(Object)>
	//   66  158:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   67  161:pop             
				stringbuilder2.append(" occurrence(s) of ");
	//   68  162:aload           7
	//   69  164:ldc1            #125 <String " occurrence(s) of ">
	//   70  166:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   71  169:pop             
				stringbuilder2.append(obj1);
	//   72  170:aload           7
	//   73  172:aload           6
	//   74  174:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   75  177:pop             
				stringbuilder2.append(" but got ");
	//   76  178:aload           7
	//   77  180:ldc1            #127 <String " but got ">
	//   78  182:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   79  185:pop             
				stringbuilder2.append(((Map) (jsonarray1)).get(obj1));
	//   80  186:aload           7
	//   81  188:aload_3         
	//   82  189:aload           6
	//   83  191:invokeinterface #71  <Method Object Map.get(Object)>
	//   84  196:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   85  199:pop             
				stringbuilder2.append(" occurrence(s)");
	//   86  200:aload           7
	//   87  202:ldc1            #129 <String " occurrence(s)">
	//   88  204:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   89  207:pop             
				fy1.a(stringbuilder2.toString());
	//   90  208:aload           4
	//   91  210:aload           7
	//   92  212:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   93  215:invokevirtual   #132 <Method void fy.a(String)>
			}
		} while(true);
	//   94  218:goto            29
		jsonarray1 = ((JSONArray) (((Map) (jsonarray1)).keySet().iterator()));
	//   95  221:aload_3         
	//   96  222:invokeinterface #44  <Method Set Map.keySet()>
	//   97  227:invokeinterface #50  <Method Iterator Set.iterator()>
	//   98  232:astore_3        
		do
		{
			if(!((Iterator) (jsonarray1)).hasNext())
				break;
	//   99  233:aload_3         
	//  100  234:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//  101  239:ifeq            301
			Object obj = ((Iterator) (jsonarray1)).next();
	//  102  242:aload_3         
	//  103  243:invokeinterface #60  <Method Object Iterator.next()>
	//  104  248:astore          5
			if(!((Map) (jsonarray)).containsKey(obj))
	//* 105  250:aload_2         
	//* 106  251:aload           5
	//* 107  253:invokeinterface #64  <Method boolean Map.containsKey(Object)>
	//* 108  258:ifne            233
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  109  261:new             #102 <Class StringBuilder>
	//  110  264:dup             
	//  111  265:invokespecial   #103 <Method void StringBuilder()>
	//  112  268:astore          6
				stringbuilder.append(s);
	//  113  270:aload           6
	//  114  272:aload_1         
	//  115  273:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  116  276:pop             
				stringbuilder.append("[]");
	//  117  277:aload           6
	//  118  279:ldc1            #109 <String "[]">
	//  119  281:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  120  284:pop             
				fy1.b(stringbuilder.toString(), obj);
	//  121  285:aload           4
	//  122  287:aload           6
	//  123  289:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  124  292:aload           5
	//  125  294:invokevirtual   #82  <Method fy fy.b(String, Object)>
	//  126  297:pop             
			}
		} while(true);
	//  127  298:goto            233
	//  128  301:return          
	}

	protected void b(String s, JSONObject jsonobject, JSONObject jsonobject1, fy fy1)
	{
		for(Iterator iterator = gd.a(jsonobject).iterator(); iterator.hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #88  <Method Set gd.a(JSONObject)>
	//*   2    4:invokeinterface #50  <Method Iterator Set.iterator()>
	//*   3    9:astore          5
	//*   4   11:aload           5
	//*   5   13:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            89
		{
			String s1 = (String)iterator.next();
	//    7   21:aload           5
	//    8   23:invokeinterface #60  <Method Object Iterator.next()>
	//    9   28:checkcast       #90  <Class String>
	//   10   31:astore          6
			Object obj = jsonobject.get(s1);
	//   11   33:aload_2         
	//   12   34:aload           6
	//   13   36:invokevirtual   #135 <Method Object JSONObject.get(String)>
	//   14   39:astore          7
			if(jsonobject1.has(s1))
	//*  15   41:aload_3         
	//*  16   42:aload           6
	//*  17   44:invokevirtual   #94  <Method boolean JSONObject.has(String)>
	//*  18   47:ifeq            77
			{
				Object obj1 = jsonobject1.get(s1);
	//   19   50:aload_3         
	//   20   51:aload           6
	//   21   53:invokevirtual   #135 <Method Object JSONObject.get(String)>
	//   22   56:astore          8
				a(gd.a(s, s1), obj, obj1, fy1);
	//   23   58:aload_0         
	//   24   59:aload_1         
	//   25   60:aload           6
	//   26   62:invokestatic    #138 <Method String gd.a(String, String)>
	//   27   65:aload           7
	//   28   67:aload           8
	//   29   69:aload           4
	//   30   71:invokevirtual   #79  <Method void a(String, Object, Object, fy)>
			} else
	//*  31   74:goto            11
			{
				fy1.a(s, ((Object) (s1)));
	//   32   77:aload           4
	//   33   79:aload_1         
	//   34   80:aload           6
	//   35   82:invokevirtual   #74  <Method fy fy.a(String, Object)>
	//   36   85:pop             
			}
		}

	//*  37   86:goto            11
	//   38   89:return          
	}

	protected void c(String s, JSONArray jsonarray, JSONArray jsonarray1, fy fy1)
	{
		for(int i = 0; i < jsonarray.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #144 <Method int JSONArray.length()>
	//*   5    9:icmpge          92
		{
			Object obj = jsonarray.get(i);
	//    6   12:aload_2         
	//    7   13:iload           5
	//    8   15:invokevirtual   #147 <Method Object JSONArray.get(int)>
	//    9   18:astore          6
			Object obj1 = jsonarray1.get(i);
	//   10   20:aload_3         
	//   11   21:iload           5
	//   12   23:invokevirtual   #147 <Method Object JSONArray.get(int)>
	//   13   26:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #102 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #103 <Method void StringBuilder()>
	//   17   35:astore          8
			stringbuilder.append(s);
	//   18   37:aload           8
	//   19   39:aload_1         
	//   20   40:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder.append("[");
	//   22   44:aload           8
	//   23   46:ldc1            #149 <String "[">
	//   24   48:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			stringbuilder.append(i);
	//   26   52:aload           8
	//   27   54:iload           5
	//   28   56:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//   29   59:pop             
			stringbuilder.append("]");
	//   30   60:aload           8
	//   31   62:ldc1            #154 <String "]">
	//   32   64:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
			a(stringbuilder.toString(), obj, obj1, fy1);
	//   34   68:aload_0         
	//   35   69:aload           8
	//   36   71:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   37   74:aload           6
	//   38   76:aload           7
	//   39   78:aload           4
	//   40   80:invokevirtual   #79  <Method void a(String, Object, Object, fy)>
		}

	//   41   83:iload           5
	//   42   85:iconst_1        
	//   43   86:iadd            
	//   44   87:istore          5
	//*  45   89:goto            3
	//   46   92:return          
	}

	protected void d(String s, JSONArray jsonarray, JSONArray jsonarray1, fy fy1)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #156 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #157 <Method void HashSet()>
	//    3    7:astore          10
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          5
	//*   6   12:iload           5
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #144 <Method int JSONArray.length()>
	//*   9   18:icmpge          294
		{
			int j;
			Object obj;
label0:
			{
				obj = jsonarray.get(i);
	//   10   21:aload_2         
	//   11   22:iload           5
	//   12   24:invokevirtual   #147 <Method Object JSONArray.get(int)>
	//   13   27:astore          9
				j = 0;
	//   14   29:iconst_0        
	//   15   30:istore          6
				do
				{
					int k = jsonarray1.length();
	//   16   32:aload_3         
	//   17   33:invokevirtual   #144 <Method int JSONArray.length()>
	//   18   36:istore          8
					boolean flag = true;
	//   19   38:iconst_1        
	//   20   39:istore          7
					if(j >= k)
						break;
	//   21   41:iload           6
	//   22   43:iload           8
	//   23   45:icmpge          225
					Object obj1 = jsonarray1.get(j);
	//   24   48:aload_3         
	//   25   49:iload           6
	//   26   51:invokevirtual   #147 <Method Object JSONArray.get(int)>
	//   27   54:astore          11
					if(!((Set) (hashset)).contains(((Object) (Integer.valueOf(j)))) && ((Object) (obj1.getClass())).equals(((Object) (obj.getClass()))))
	//*  28   56:aload           10
	//*  29   58:iload           6
	//*  30   60:invokestatic    #161 <Method Integer Integer.valueOf(int)>
	//*  31   63:invokeinterface #164 <Method boolean Set.contains(Object)>
	//*  32   68:ifne            216
	//*  33   71:aload           11
	//*  34   73:invokevirtual   #168 <Method Class Object.getClass()>
	//*  35   76:aload           9
	//*  36   78:invokevirtual   #168 <Method Class Object.getClass()>
	//*  37   81:invokevirtual   #169 <Method boolean Object.equals(Object)>
	//*  38   84:ifne            90
	//*  39   87:goto            216
						if(obj instanceof JSONObject)
	//*  40   90:aload           9
	//*  41   92:instanceof      #76  <Class JSONObject>
	//*  42   95:ifeq            138
						{
							if(a((JSONObject)obj, (JSONObject)obj1).a())
	//*  43   98:aload_0         
	//*  44   99:aload           9
	//*  45  101:checkcast       #76  <Class JSONObject>
	//*  46  104:aload           11
	//*  47  106:checkcast       #76  <Class JSONObject>
	//*  48  109:invokevirtual   #171 <Method fy a(JSONObject, JSONObject)>
	//*  49  112:invokevirtual   #173 <Method boolean fy.a()>
	//*  50  115:ifeq            216
							{
								((Set) (hashset)).add(((Object) (Integer.valueOf(j))));
	//   51  118:aload           10
	//   52  120:iload           6
	//   53  122:invokestatic    #161 <Method Integer Integer.valueOf(int)>
	//   54  125:invokeinterface #176 <Method boolean Set.add(Object)>
	//   55  130:pop             
								j = ((int) (flag));
	//   56  131:iload           7
	//   57  133:istore          6
								break label0;
	//   58  135:goto            228
							}
						} else
						if(obj instanceof JSONArray)
	//*  59  138:aload           9
	//*  60  140:instanceof      #140 <Class JSONArray>
	//*  61  143:ifeq            186
						{
							if(a((JSONArray)obj, (JSONArray)obj1).a())
	//*  62  146:aload_0         
	//*  63  147:aload           9
	//*  64  149:checkcast       #140 <Class JSONArray>
	//*  65  152:aload           11
	//*  66  154:checkcast       #140 <Class JSONArray>
	//*  67  157:invokevirtual   #178 <Method fy a(JSONArray, JSONArray)>
	//*  68  160:invokevirtual   #173 <Method boolean fy.a()>
	//*  69  163:ifeq            216
							{
								((Set) (hashset)).add(((Object) (Integer.valueOf(j))));
	//   70  166:aload           10
	//   71  168:iload           6
	//   72  170:invokestatic    #161 <Method Integer Integer.valueOf(int)>
	//   73  173:invokeinterface #176 <Method boolean Set.add(Object)>
	//   74  178:pop             
								j = ((int) (flag));
	//   75  179:iload           7
	//   76  181:istore          6
								break label0;
	//   77  183:goto            228
							}
						} else
						if(obj.equals(obj1))
	//*  78  186:aload           9
	//*  79  188:aload           11
	//*  80  190:invokevirtual   #169 <Method boolean Object.equals(Object)>
	//*  81  193:ifeq            216
						{
							((Set) (hashset)).add(((Object) (Integer.valueOf(j))));
	//   82  196:aload           10
	//   83  198:iload           6
	//   84  200:invokestatic    #161 <Method Integer Integer.valueOf(int)>
	//   85  203:invokeinterface #176 <Method boolean Set.add(Object)>
	//   86  208:pop             
							j = ((int) (flag));
	//   87  209:iload           7
	//   88  211:istore          6
							break label0;
	//   89  213:goto            228
						}
					j++;
	//   90  216:iload           6
	//   91  218:iconst_1        
	//   92  219:iadd            
	//   93  220:istore          6
				} while(true);
	//   94  222:goto            32
				j = 0;
	//   95  225:iconst_0        
	//   96  226:istore          6
			}
			if(j == 0)
	//*  97  228:iload           6
	//*  98  230:ifne            285
			{
				jsonarray = ((JSONArray) (new StringBuilder()));
	//   99  233:new             #102 <Class StringBuilder>
	//  100  236:dup             
	//  101  237:invokespecial   #103 <Method void StringBuilder()>
	//  102  240:astore_2        
				((StringBuilder) (jsonarray)).append(s);
	//  103  241:aload_2         
	//  104  242:aload_1         
	//  105  243:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  106  246:pop             
				((StringBuilder) (jsonarray)).append("[");
	//  107  247:aload_2         
	//  108  248:ldc1            #149 <String "[">
	//  109  250:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  110  253:pop             
				((StringBuilder) (jsonarray)).append(i);
	//  111  254:aload_2         
	//  112  255:iload           5
	//  113  257:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//  114  260:pop             
				((StringBuilder) (jsonarray)).append("] Could not find match for element ");
	//  115  261:aload_2         
	//  116  262:ldc1            #180 <String "] Could not find match for element ">
	//  117  264:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  118  267:pop             
				((StringBuilder) (jsonarray)).append(obj);
	//  119  268:aload_2         
	//  120  269:aload           9
	//  121  271:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//  122  274:pop             
				fy1.a(((StringBuilder) (jsonarray)).toString());
	//  123  275:aload           4
	//  124  277:aload_2         
	//  125  278:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  126  281:invokevirtual   #132 <Method void fy.a(String)>
				return;
	//  127  284:return          
			}
		}

	//  128  285:iload           5
	//  129  287:iconst_1        
	//  130  288:iadd            
	//  131  289:istore          5
	//* 132  291:goto            12
	//  133  294:return          
	}
}
