// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package bo.app:
//			fn, eb, ev, eu, 
//			dl

public class fq
	implements fn
{

	public fq(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #31  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("com.appboy.storage.triggers.re_eligibility");
	//    6   13:aload           4
	//    7   15:ldc1            #33  <String "com.appboy.storage.triggers.re_eligibility">
	//    8   17:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokestatic    #43  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   15   29:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload           4
	//   20   37:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #53  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   44:putfield        #55  <Field SharedPreferences b>
		c = a();
	//   24   47:aload_0         
	//   25   48:aload_0         
	//   26   49:invokevirtual   #58  <Method Map a()>
	//   27   52:putfield        #60  <Field Map c>
	//   28   55:return          
	}

	Map a()
	{
		ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap();
	//    0    0:new             #64  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void ConcurrentHashMap()>
	//    3    7:astore_3        
		Object obj = ((Object) (b.getAll()));
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field SharedPreferences b>
	//    6   12:invokeinterface #70  <Method Map SharedPreferences.getAll()>
	//    7   17:astore          4
		if(obj != null)
	//*   8   19:aload           4
	//*   9   21:ifnull          188
		{
			if(((Map) (obj)).size() == 0)
	//*  10   24:aload           4
	//*  11   26:invokeinterface #76  <Method int Map.size()>
	//*  12   31:ifne            36
				return ((Map) (concurrenthashmap));
	//   13   34:aload_3         
	//   14   35:areturn         
			obj = ((Object) (((Map) (obj)).keySet()));
	//   15   36:aload           4
	//   16   38:invokeinterface #80  <Method Set Map.keySet()>
	//   17   43:astore          4
			if(obj != null)
	//*  18   45:aload           4
	//*  19   47:ifnull          186
			{
				if(((Set) (obj)).size() == 0)
	//*  20   50:aload           4
	//*  21   52:invokeinterface #83  <Method int Set.size()>
	//*  22   57:ifne            62
					return ((Map) (concurrenthashmap));
	//   23   60:aload_3         
	//   24   61:areturn         
				try
				{
					long l;
					String s;
					for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Map) (concurrenthashmap)).put(((Object) (s)), ((Object) (Long.valueOf(l)))))
	//*  25   62:aload           4
	//*  26   64:invokeinterface #87  <Method Iterator Set.iterator()>
	//*  27   69:astore          4
	//*  28   71:aload           4
	//*  29   73:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  30   78:ifeq            184
					{
						s = (String)((Iterator) (obj)).next();
	//   31   81:aload           4
	//   32   83:invokeinterface #97  <Method Object Iterator.next()>
	//   33   88:checkcast       #99  <Class String>
	//   34   91:astore          5
						l = b.getLong(s, 0L);
	//   35   93:aload_0         
	//   36   94:getfield        #55  <Field SharedPreferences b>
	//   37   97:aload           5
	//   38   99:lconst_0        
	//   39  100:invokeinterface #103 <Method long SharedPreferences.getLong(String, long)>
	//   40  105:lstore_1        
						String s1 = a;
	//   41  106:getstatic       #23  <Field String a>
	//   42  109:astore          6
						StringBuilder stringbuilder = new StringBuilder();
	//   43  111:new             #30  <Class StringBuilder>
	//   44  114:dup             
	//   45  115:invokespecial   #31  <Method void StringBuilder()>
	//   46  118:astore          7
						stringbuilder.append("Retrieving triggered action id ");
	//   47  120:aload           7
	//   48  122:ldc1            #105 <String "Retrieving triggered action id ">
	//   49  124:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   50  127:pop             
						stringbuilder.append(s);
	//   51  128:aload           7
	//   52  130:aload           5
	//   53  132:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   54  135:pop             
						stringbuilder.append(" eligibility information from local storage.");
	//   55  136:aload           7
	//   56  138:ldc1            #107 <String " eligibility information from local storage.">
	//   57  140:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   58  143:pop             
						AppboyLogger.d(s1, stringbuilder.toString());
	//   59  144:aload           6
	//   60  146:aload           7
	//   61  148:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   62  151:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   63  154:pop             
					}

	//   64  155:aload_3         
	//   65  156:aload           5
	//   66  158:lload_1         
	//   67  159:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   68  162:invokeinterface #121 <Method Object Map.put(Object, Object)>
	//   69  167:pop             
				}
	//*  70  168:goto            71
				catch(Exception exception)
	//*  71  171:astore          4
				{
					AppboyLogger.e(a, "Encountered unexpected exception while parsing stored re-eligibility information.", ((Throwable) (exception)));
	//   72  173:getstatic       #23  <Field String a>
	//   73  176:ldc1            #123 <String "Encountered unexpected exception while parsing stored re-eligibility information.">
	//   74  178:aload           4
	//   75  180:invokestatic    #127 <Method int AppboyLogger.e(String, String, Throwable)>
	//   76  183:pop             
				}
				return ((Map) (concurrenthashmap));
	//   77  184:aload_3         
	//   78  185:areturn         
			} else
			{
				return ((Map) (concurrenthashmap));
	//   79  186:aload_3         
	//   80  187:areturn         
			}
		} else
		{
			return ((Map) (concurrenthashmap));
	//   81  188:aload_3         
	//   82  189:areturn         
		}
	}

	public void a(eb eb1, long l)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #23  <Field String a>
	//    1    3:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #30  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #31  <Method void StringBuilder()>
	//    5   12:astore          5
		stringbuilder.append("Updating re-eligibility for action Id ");
	//    6   14:aload           5
	//    7   16:ldc1            #132 <String "Updating re-eligibility for action Id ">
	//    8   18:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(eb1.b());
	//   10   22:aload           5
	//   11   24:aload_1         
	//   12   25:invokeinterface #136 <Method String eb.b()>
	//   13   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
		stringbuilder.append(" to time ");
	//   15   34:aload           5
	//   16   36:ldc1            #138 <String " to time ">
	//   17   38:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		stringbuilder.append(l);
	//   19   42:aload           5
	//   20   44:lload_2         
	//   21   45:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//   22   48:pop             
		stringbuilder.append(".");
	//   23   49:aload           5
	//   24   51:ldc1            #143 <String ".">
	//   25   53:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   27   57:aload           4
	//   28   59:aload           5
	//   29   61:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   30   64:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   31   67:pop             
		c.put(((Object) (eb1.b())), ((Object) (Long.valueOf(l))));
	//   32   68:aload_0         
	//   33   69:getfield        #60  <Field Map c>
	//   34   72:aload_1         
	//   35   73:invokeinterface #136 <Method String eb.b()>
	//   36   78:lload_2         
	//   37   79:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   38   82:invokeinterface #121 <Method Object Map.put(Object, Object)>
	//   39   87:pop             
		obj = ((Object) (b.edit()));
	//   40   88:aload_0         
	//   41   89:getfield        #55  <Field SharedPreferences b>
	//   42   92:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   43   97:astore          4
		((android.content.SharedPreferences.Editor) (obj)).putLong(eb1.b(), l);
	//   44   99:aload           4
	//   45  101:aload_1         
	//   46  102:invokeinterface #136 <Method String eb.b()>
	//   47  107:lload_2         
	//   48  108:invokeinterface #153 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   49  113:pop             
		((android.content.SharedPreferences.Editor) (obj)).apply();
	//   50  114:aload           4
	//   51  116:invokeinterface #156 <Method void android.content.SharedPreferences$Editor.apply()>
	//   52  121:return          
	}

	public void a(List list)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #159 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void HashSet()>
	//    3    7:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Set) (hashset)).add(((Object) (((eb)((Iterator) (list)).next()).b()))));
	//    4    8:aload_1         
	//    5    9:invokeinterface #163 <Method Iterator List.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            48
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokeinterface #97  <Method Object Iterator.next()>
	//   13   31:checkcast       #134 <Class eb>
	//   14   34:invokeinterface #136 <Method String eb.b()>
	//   15   39:invokeinterface #167 <Method boolean Set.add(Object)>
	//   16   44:pop             
	//*  17   45:goto            15
		Object obj = ((Object) (new HashSet(((java.util.Collection) (c.keySet())))));
	//   18   48:new             #159 <Class HashSet>
	//   19   51:dup             
	//   20   52:aload_0         
	//   21   53:getfield        #60  <Field Map c>
	//   22   56:invokeinterface #80  <Method Set Map.keySet()>
	//   23   61:invokespecial   #170 <Method void HashSet(java.util.Collection)>
	//   24   64:astore_3        
		list = ((List) (b.edit()));
	//   25   65:aload_0         
	//   26   66:getfield        #55  <Field SharedPreferences b>
	//   27   69:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   28   74:astore_1        
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  29   75:aload_3         
	//*  30   76:invokeinterface #87  <Method Iterator Set.iterator()>
	//*  31   81:astore_3        
	//*  32   82:aload_3         
	//*  33   83:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  34   88:ifeq            238
		{
			String s = (String)((Iterator) (obj)).next();
	//   35   91:aload_3         
	//   36   92:invokeinterface #97  <Method Object Iterator.next()>
	//   37   97:checkcast       #99  <Class String>
	//   38  100:astore          4
			if(!((Set) (hashset)).contains(((Object) (s))))
	//*  39  102:aload_2         
	//*  40  103:aload           4
	//*  41  105:invokeinterface #173 <Method boolean Set.contains(Object)>
	//*  42  110:ifne            186
			{
				String s1 = a;
	//   43  113:getstatic       #23  <Field String a>
	//   44  116:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   45  118:new             #30  <Class StringBuilder>
	//   46  121:dup             
	//   47  122:invokespecial   #31  <Method void StringBuilder()>
	//   48  125:astore          6
				stringbuilder.append("Deleting outdated triggered action id ");
	//   49  127:aload           6
	//   50  129:ldc1            #175 <String "Deleting outdated triggered action id ">
	//   51  131:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   52  134:pop             
				stringbuilder.append(s);
	//   53  135:aload           6
	//   54  137:aload           4
	//   55  139:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   56  142:pop             
				stringbuilder.append(" from re-eligibility list.");
	//   57  143:aload           6
	//   58  145:ldc1            #177 <String " from re-eligibility list.">
	//   59  147:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   60  150:pop             
				AppboyLogger.d(s1, stringbuilder.toString());
	//   61  151:aload           5
	//   62  153:aload           6
	//   63  155:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   64  158:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   65  161:pop             
				c.remove(((Object) (s)));
	//   66  162:aload_0         
	//   67  163:getfield        #60  <Field Map c>
	//   68  166:aload           4
	//   69  168:invokeinterface #181 <Method Object Map.remove(Object)>
	//   70  173:pop             
				((android.content.SharedPreferences.Editor) (list)).remove(s);
	//   71  174:aload_1         
	//   72  175:aload           4
	//   73  177:invokeinterface #184 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   74  182:pop             
			} else
	//*  75  183:goto            82
			{
				String s2 = a;
	//   76  186:getstatic       #23  <Field String a>
	//   77  189:astore          5
				StringBuilder stringbuilder1 = new StringBuilder();
	//   78  191:new             #30  <Class StringBuilder>
	//   79  194:dup             
	//   80  195:invokespecial   #31  <Method void StringBuilder()>
	//   81  198:astore          6
				stringbuilder1.append("Retaining triggered action ");
	//   82  200:aload           6
	//   83  202:ldc1            #186 <String "Retaining triggered action ">
	//   84  204:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   85  207:pop             
				stringbuilder1.append(s);
	//   86  208:aload           6
	//   87  210:aload           4
	//   88  212:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   89  215:pop             
				stringbuilder1.append(" in re-eligibility list.");
	//   90  216:aload           6
	//   91  218:ldc1            #188 <String " in re-eligibility list.">
	//   92  220:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   93  223:pop             
				AppboyLogger.d(s2, stringbuilder1.toString());
	//   94  224:aload           5
	//   95  226:aload           6
	//   96  228:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   97  231:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   98  234:pop             
			}
		}

	//*  99  235:goto            82
		((android.content.SharedPreferences.Editor) (list)).apply();
	//  100  238:aload_1         
	//  101  239:invokeinterface #156 <Method void android.content.SharedPreferences$Editor.apply()>
	//  102  244:return          
	}

	public boolean a(eb eb1)
	{
		Object obj = ((Object) (eb1.c().f()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #193 <Method ev eb.c()>
	//    2    6:invokeinterface #199 <Method eu ev.f()>
	//    3   11:astore          4
		if(((eu) (obj)).a())
	//*   4   13:aload           4
	//*   5   15:invokeinterface #203 <Method boolean eu.a()>
	//*   6   20:ifeq            78
		{
			obj = ((Object) (a));
	//    7   23:getstatic       #23  <Field String a>
	//    8   26:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    9   28:new             #30  <Class StringBuilder>
	//   10   31:dup             
	//   11   32:invokespecial   #31  <Method void StringBuilder()>
	//   12   35:astore          5
			stringbuilder.append("Triggered action id ");
	//   13   37:aload           5
	//   14   39:ldc1            #205 <String "Triggered action id ">
	//   15   41:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   16   44:pop             
			stringbuilder.append(eb1.b());
	//   17   45:aload           5
	//   18   47:aload_1         
	//   19   48:invokeinterface #136 <Method String eb.b()>
	//   20   53:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   21   56:pop             
			stringbuilder.append(" always eligible via configuration. Returning true for eligibility status");
	//   22   57:aload           5
	//   23   59:ldc1            #207 <String " always eligible via configuration. Returning true for eligibility status">
	//   24   61:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   25   64:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   26   65:aload           4
	//   27   67:aload           5
	//   28   69:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   29   72:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   30   75:pop             
			return true;
	//   31   76:iconst_1        
	//   32   77:ireturn         
		}
		if(!c.containsKey(((Object) (eb1.b()))))
	//*  33   78:aload_0         
	//*  34   79:getfield        #60  <Field Map c>
	//*  35   82:aload_1         
	//*  36   83:invokeinterface #136 <Method String eb.b()>
	//*  37   88:invokeinterface #210 <Method boolean Map.containsKey(Object)>
	//*  38   93:ifne            151
		{
			obj = ((Object) (a));
	//   39   96:getstatic       #23  <Field String a>
	//   40   99:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41  101:new             #30  <Class StringBuilder>
	//   42  104:dup             
	//   43  105:invokespecial   #31  <Method void StringBuilder()>
	//   44  108:astore          5
			stringbuilder1.append("Triggered action id ");
	//   45  110:aload           5
	//   46  112:ldc1            #205 <String "Triggered action id ">
	//   47  114:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   48  117:pop             
			stringbuilder1.append(eb1.b());
	//   49  118:aload           5
	//   50  120:aload_1         
	//   51  121:invokeinterface #136 <Method String eb.b()>
	//   52  126:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   53  129:pop             
			stringbuilder1.append(" always eligible via never having been triggered. Returning true for eligibility status");
	//   54  130:aload           5
	//   55  132:ldc1            #212 <String " always eligible via never having been triggered. Returning true for eligibility status">
	//   56  134:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   57  137:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder1.toString());
	//   58  138:aload           4
	//   59  140:aload           5
	//   60  142:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   61  145:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   62  148:pop             
			return true;
	//   63  149:iconst_1        
	//   64  150:ireturn         
		}
		if(((eu) (obj)).b())
	//*  65  151:aload           4
	//*  66  153:invokeinterface #214 <Method boolean eu.b()>
	//*  67  158:ifeq            216
		{
			obj = ((Object) (a));
	//   68  161:getstatic       #23  <Field String a>
	//   69  164:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
	//   70  166:new             #30  <Class StringBuilder>
	//   71  169:dup             
	//   72  170:invokespecial   #31  <Method void StringBuilder()>
	//   73  173:astore          5
			stringbuilder2.append("Triggered action id ");
	//   74  175:aload           5
	//   75  177:ldc1            #205 <String "Triggered action id ">
	//   76  179:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   77  182:pop             
			stringbuilder2.append(eb1.b());
	//   78  183:aload           5
	//   79  185:aload_1         
	//   80  186:invokeinterface #136 <Method String eb.b()>
	//   81  191:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   82  194:pop             
			stringbuilder2.append(" no longer eligible due to having been triggered in the past");
	//   83  195:aload           5
	//   84  197:ldc1            #216 <String " no longer eligible due to having been triggered in the past">
	//   85  199:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   86  202:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder2.toString());
	//   87  203:aload           4
	//   88  205:aload           5
	//   89  207:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   90  210:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   91  213:pop             
			return false;
	//   92  214:iconst_0        
	//   93  215:ireturn         
		}
		long l = ((Long)c.get(((Object) (eb1.b())))).longValue();
	//   94  216:aload_0         
	//   95  217:getfield        #60  <Field Map c>
	//   96  220:aload_1         
	//   97  221:invokeinterface #136 <Method String eb.b()>
	//   98  226:invokeinterface #219 <Method Object Map.get(Object)>
	//   99  231:checkcast       #113 <Class Long>
	//  100  234:invokevirtual   #223 <Method long Long.longValue()>
	//  101  237:lstore_2        
		l = dl.a() - l;
	//  102  238:invokestatic    #227 <Method long dl.a()>
	//  103  241:lload_2         
	//  104  242:lsub            
	//  105  243:lstore_2        
		if(l > (long)((eu) (obj)).c().intValue())
	//* 106  244:lload_2         
	//* 107  245:aload           4
	//* 108  247:invokeinterface #230 <Method Integer eu.c()>
	//* 109  252:invokevirtual   #235 <Method int Integer.intValue()>
	//* 110  255:i2l             
	//* 111  256:lcmp            
	//* 112  257:ifle            329
		{
			eb1 = ((eb) (a));
	//  113  260:getstatic       #23  <Field String a>
	//  114  263:astore_1        
			StringBuilder stringbuilder3 = new StringBuilder();
	//  115  264:new             #30  <Class StringBuilder>
	//  116  267:dup             
	//  117  268:invokespecial   #31  <Method void StringBuilder()>
	//  118  271:astore          5
			stringbuilder3.append("Trigger action is re-eligible for display since ");
	//  119  273:aload           5
	//  120  275:ldc1            #237 <String "Trigger action is re-eligible for display since ">
	//  121  277:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  122  280:pop             
			stringbuilder3.append(l);
	//  123  281:aload           5
	//  124  283:lload_2         
	//  125  284:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//  126  287:pop             
			stringbuilder3.append(" seconds have passed since the last time it was triggered (minimum interval: ");
	//  127  288:aload           5
	//  128  290:ldc1            #239 <String " seconds have passed since the last time it was triggered (minimum interval: ">
	//  129  292:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  130  295:pop             
			stringbuilder3.append(((Object) (((eu) (obj)).c())));
	//  131  296:aload           5
	//  132  298:aload           4
	//  133  300:invokeinterface #230 <Method Integer eu.c()>
	//  134  305:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//  135  308:pop             
			stringbuilder3.append(").");
	//  136  309:aload           5
	//  137  311:ldc1            #244 <String ").">
	//  138  313:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  139  316:pop             
			AppboyLogger.d(((String) (eb1)), stringbuilder3.toString());
	//  140  317:aload_1         
	//  141  318:aload           5
	//  142  320:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  143  323:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//  144  326:pop             
			return true;
	//  145  327:iconst_1        
	//  146  328:ireturn         
		} else
		{
			eb1 = ((eb) (a));
	//  147  329:getstatic       #23  <Field String a>
	//  148  332:astore_1        
			StringBuilder stringbuilder4 = new StringBuilder();
	//  149  333:new             #30  <Class StringBuilder>
	//  150  336:dup             
	//  151  337:invokespecial   #31  <Method void StringBuilder()>
	//  152  340:astore          5
			stringbuilder4.append("Trigger action is not re-eligible for display since only ");
	//  153  342:aload           5
	//  154  344:ldc1            #246 <String "Trigger action is not re-eligible for display since only ">
	//  155  346:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  156  349:pop             
			stringbuilder4.append(l);
	//  157  350:aload           5
	//  158  352:lload_2         
	//  159  353:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//  160  356:pop             
			stringbuilder4.append(" seconds have passed since the last time it was triggered (minimum interval: ");
	//  161  357:aload           5
	//  162  359:ldc1            #239 <String " seconds have passed since the last time it was triggered (minimum interval: ">
	//  163  361:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  164  364:pop             
			stringbuilder4.append(((Object) (((eu) (obj)).c())));
	//  165  365:aload           5
	//  166  367:aload           4
	//  167  369:invokeinterface #230 <Method Integer eu.c()>
	//  168  374:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//  169  377:pop             
			stringbuilder4.append(").");
	//  170  378:aload           5
	//  171  380:ldc1            #244 <String ").">
	//  172  382:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  173  385:pop             
			AppboyLogger.d(((String) (eb1)), stringbuilder4.toString());
	//  174  386:aload_1         
	//  175  387:aload           5
	//  176  389:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  177  392:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//  178  395:pop             
			return false;
	//  179  396:iconst_0        
	//  180  397:ireturn         
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/fq);
	private final SharedPreferences b;
	private Map c;

	static 
	{
	//    0    0:ldc1            #2   <Class fq>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//*   3    8:return          
	}
}
