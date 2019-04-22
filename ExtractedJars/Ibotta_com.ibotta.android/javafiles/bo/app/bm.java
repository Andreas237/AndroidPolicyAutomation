// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.models.AppboyGeofence;
import com.appboy.support.AppboyLogger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package bo.app:
//			dx, x, ct

public class bm
{

	bm(Context context, String s, dx dx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("com.appboy.managers.geofences.eligibility.global.");
	//    6   13:aload           4
	//    7   15:ldc1            #39  <String "com.appboy.managers.geofences.eligibility.global.">
	//    8   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(s);
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		a = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload           4
	//   17   32:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   18   35:iconst_0        
	//   19   36:invokevirtual   #53  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   20   39:putfield        #55  <Field SharedPreferences a>
		stringbuilder = new StringBuilder();
	//   21   42:new             #36  <Class StringBuilder>
	//   22   45:dup             
	//   23   46:invokespecial   #37  <Method void StringBuilder()>
	//   24   49:astore          4
		stringbuilder.append("com.appboy.managers.geofences.eligibility.individual.");
	//   25   51:aload           4
	//   26   53:ldc1            #57  <String "com.appboy.managers.geofences.eligibility.individual.">
	//   27   55:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
		stringbuilder.append(s);
	//   29   59:aload           4
	//   30   61:aload_2         
	//   31   62:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:aload           4
	//   36   70:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   37   73:iconst_0        
	//   38   74:invokevirtual   #53  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   39   77:putfield        #59  <Field SharedPreferences b>
		c = a(b);
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:aload_0         
	//   43   83:getfield        #59  <Field SharedPreferences b>
	//   44   86:invokevirtual   #62  <Method Map a(SharedPreferences)>
	//   45   89:putfield        #64  <Field Map c>
		d = a.getLong("last_request_global", 0L);
	//   46   92:aload_0         
	//   47   93:aload_0         
	//   48   94:getfield        #55  <Field SharedPreferences a>
	//   49   97:ldc1            #66  <String "last_request_global">
	//   50   99:lconst_0        
	//   51  100:invokeinterface #72  <Method long SharedPreferences.getLong(String, long)>
	//   52  105:putfield        #74  <Field long d>
		e = a.getLong("last_report_global", 0L);
	//   53  108:aload_0         
	//   54  109:aload_0         
	//   55  110:getfield        #55  <Field SharedPreferences a>
	//   56  113:ldc1            #76  <String "last_report_global">
	//   57  115:lconst_0        
	//   58  116:invokeinterface #72  <Method long SharedPreferences.getLong(String, long)>
	//   59  121:putfield        #78  <Field long e>
		f = dx1.c();
	//   60  124:aload_0         
	//   61  125:aload_3         
	//   62  126:invokevirtual   #83  <Method int dx.c()>
	//   63  129:putfield        #85  <Field int f>
		g = dx1.d();
	//   64  132:aload_0         
	//   65  133:aload_3         
	//   66  134:invokevirtual   #87  <Method int dx.d()>
	//   67  137:putfield        #89  <Field int g>
	//   68  140:return          
	}

	String a(String s)
	{
		String s1;
		try
		{
			s1 = s.split("_", 2)[1];
	//    0    0:aload_1         
	//    1    1:ldc1            #94  <String "_">
	//    2    3:iconst_2        
	//    3    4:invokevirtual   #100 <Method String[] String.split(String, int)>
	//    4    7:iconst_1        
	//    5    8:aaload          
	//    6    9:astore_2        
		}
	//*   7   10:aload_2         
	//*   8   11:areturn         
		catch(Exception exception)
	//*   9   12:astore_2        
		{
			String s2 = h;
	//   10   13:getstatic       #29  <Field String h>
	//   11   16:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   17:new             #36  <Class StringBuilder>
	//   13   20:dup             
	//   14   21:invokespecial   #37  <Method void StringBuilder()>
	//   15   24:astore          4
			stringbuilder.append("Exception trying to parse re-eligibility id: ");
	//   16   26:aload           4
	//   17   28:ldc1            #102 <String "Exception trying to parse re-eligibility id: ">
	//   18   30:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			stringbuilder.append(s);
	//   20   34:aload           4
	//   21   36:aload_1         
	//   22   37:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
			AppboyLogger.i(s2, stringbuilder.toString(), ((Throwable) (exception)));
	//   24   41:aload_3         
	//   25   42:aload           4
	//   26   44:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   27   47:aload_2         
	//   28   48:invokestatic    #106 <Method int AppboyLogger.i(String, String, Throwable)>
	//   29   51:pop             
			return null;
	//   30   52:aconst_null     
	//   31   53:areturn         
		}
		return s1;
	}

	String a(String s, x x1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(x1.toString().toLowerCase(Locale.US));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #111 <Method String x.toString()>
	//    7   13:getstatic       #117 <Field Locale Locale.US>
	//    8   16:invokevirtual   #121 <Method String String.toLowerCase(Locale)>
	//    9   19:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append("_");
	//   11   23:aload_3         
	//   12   24:ldc1            #94  <String "_">
	//   13   26:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(s);
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		return stringbuilder.toString();
	//   19   36:aload_3         
	//   20   37:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   21   40:areturn         
	}

	Map a(SharedPreferences sharedpreferences)
	{
		ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap();
	//    0    0:new             #123 <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void ConcurrentHashMap()>
	//    3    7:astore          4
		Object obj = ((Object) (sharedpreferences.getAll()));
	//    4    9:aload_1         
	//    5   10:invokeinterface #128 <Method Map SharedPreferences.getAll()>
	//    6   15:astore          5
		if(obj != null)
	//*   7   17:aload           5
	//*   8   19:ifnull          171
		{
			if(((Map) (obj)).size() == 0)
	//*   9   22:aload           5
	//*  10   24:invokeinterface #133 <Method int Map.size()>
	//*  11   29:ifne            35
				return ((Map) (concurrenthashmap));
	//   12   32:aload           4
	//   13   34:areturn         
			obj = ((Object) (((Map) (obj)).keySet()));
	//   14   35:aload           5
	//   15   37:invokeinterface #137 <Method Set Map.keySet()>
	//   16   42:astore          5
			if(((Set) (obj)).size() == 0)
	//*  17   44:aload           5
	//*  18   46:invokeinterface #140 <Method int Set.size()>
	//*  19   51:ifne            57
				return ((Map) (concurrenthashmap));
	//   20   54:aload           4
	//   21   56:areturn         
			long l;
			String s;
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Map) (concurrenthashmap)).put(((Object) (s)), ((Object) (Long.valueOf(l)))))
	//*  22   57:aload           5
	//*  23   59:invokeinterface #144 <Method Iterator Set.iterator()>
	//*  24   64:astore          5
	//*  25   66:aload           5
	//*  26   68:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  27   73:ifeq            168
			{
				s = (String)((Iterator) (obj)).next();
	//   28   76:aload           5
	//   29   78:invokeinterface #154 <Method Object Iterator.next()>
	//   30   83:checkcast       #96  <Class String>
	//   31   86:astore          6
				l = sharedpreferences.getLong(s, 0L);
	//   32   88:aload_1         
	//   33   89:aload           6
	//   34   91:lconst_0        
	//   35   92:invokeinterface #72  <Method long SharedPreferences.getLong(String, long)>
	//   36   97:lstore_2        
				String s1 = h;
	//   37   98:getstatic       #29  <Field String h>
	//   38  101:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   39  103:new             #36  <Class StringBuilder>
	//   40  106:dup             
	//   41  107:invokespecial   #37  <Method void StringBuilder()>
	//   42  110:astore          8
				stringbuilder.append("Retrieving geofence id ");
	//   43  112:aload           8
	//   44  114:ldc1            #156 <String "Retrieving geofence id ">
	//   45  116:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   46  119:pop             
				stringbuilder.append(a(s));
	//   47  120:aload           8
	//   48  122:aload_0         
	//   49  123:aload           6
	//   50  125:invokevirtual   #158 <Method String a(String)>
	//   51  128:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   52  131:pop             
				stringbuilder.append(" eligibility information from local storage.");
	//   53  132:aload           8
	//   54  134:ldc1            #160 <String " eligibility information from local storage.">
	//   55  136:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   56  139:pop             
				AppboyLogger.d(s1, stringbuilder.toString());
	//   57  140:aload           7
	//   58  142:aload           8
	//   59  144:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   60  147:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   61  150:pop             
			}

	//   62  151:aload           4
	//   63  153:aload           6
	//   64  155:lload_2         
	//   65  156:invokestatic    #169 <Method Long Long.valueOf(long)>
	//   66  159:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//   67  164:pop             
	//*  68  165:goto            66
			return ((Map) (concurrenthashmap));
	//   69  168:aload           4
	//   70  170:areturn         
		} else
		{
			return ((Map) (concurrenthashmap));
	//   71  171:aload           4
	//   72  173:areturn         
		}
	}

	void a(ct ct1)
	{
		int i = ct1.f();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #180 <Method int ct.f()>
	//    2    4:istore_2        
		if(i >= 0)
	//*   3    5:iload_2         
	//*   4    6:iflt            60
		{
			f = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #85  <Field int f>
			String s = h;
	//    8   14:getstatic       #29  <Field String h>
	//    9   17:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   10   18:new             #36  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #37  <Method void StringBuilder()>
	//   13   25:astore          4
			stringbuilder1.append("Min time since last geofence request reset via server configuration: ");
	//   14   27:aload           4
	//   15   29:ldc1            #182 <String "Min time since last geofence request reset via server configuration: ">
	//   16   31:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder1.append(i);
	//   18   35:aload           4
	//   19   37:iload_2         
	//   20   38:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:pop             
			stringbuilder1.append("s.");
	//   22   42:aload           4
	//   23   44:ldc1            #187 <String "s.">
	//   24   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			AppboyLogger.i(s, stringbuilder1.toString());
	//   26   50:aload_3         
	//   27   51:aload           4
	//   28   53:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   29   56:invokestatic    #189 <Method int AppboyLogger.i(String, String)>
	//   30   59:pop             
		}
		i = ct1.g();
	//   31   60:aload_1         
	//   32   61:invokevirtual   #191 <Method int ct.g()>
	//   33   64:istore_2        
		if(i >= 0)
	//*  34   65:iload_2         
	//*  35   66:iflt            115
		{
			g = i;
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:putfield        #89  <Field int g>
			ct1 = ((ct) (h));
	//   39   74:getstatic       #29  <Field String h>
	//   40   77:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   41   78:new             #36  <Class StringBuilder>
	//   42   81:dup             
	//   43   82:invokespecial   #37  <Method void StringBuilder()>
	//   44   85:astore_3        
			stringbuilder.append("Min time since last geofence report reset via server configuration: ");
	//   45   86:aload_3         
	//   46   87:ldc1            #193 <String "Min time since last geofence report reset via server configuration: ">
	//   47   89:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
			stringbuilder.append(i);
	//   49   93:aload_3         
	//   50   94:iload_2         
	//   51   95:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   52   98:pop             
			stringbuilder.append("s.");
	//   53   99:aload_3         
	//   54  100:ldc1            #187 <String "s.">
	//   55  102:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   56  105:pop             
			AppboyLogger.i(((String) (ct1)), stringbuilder.toString());
	//   57  106:aload_1         
	//   58  107:aload_3         
	//   59  108:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   60  111:invokestatic    #189 <Method int AppboyLogger.i(String, String)>
	//   61  114:pop             
		}
	//   62  115:return          
	}

	void a(List list)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #196 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void HashSet()>
	//    3    7:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Set) (hashset)).add(((Object) (((AppboyGeofence)((Iterator) (list)).next()).getId()))));
	//    4    8:aload_1         
	//    5    9:invokeinterface #200 <Method Iterator List.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            46
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokeinterface #154 <Method Object Iterator.next()>
	//   13   31:checkcast       #202 <Class AppboyGeofence>
	//   14   34:invokevirtual   #205 <Method String AppboyGeofence.getId()>
	//   15   37:invokeinterface #209 <Method boolean Set.add(Object)>
	//   16   42:pop             
	//*  17   43:goto            15
		Object obj = ((Object) (new HashSet(((java.util.Collection) (c.keySet())))));
	//   18   46:new             #196 <Class HashSet>
	//   19   49:dup             
	//   20   50:aload_0         
	//   21   51:getfield        #64  <Field Map c>
	//   22   54:invokeinterface #137 <Method Set Map.keySet()>
	//   23   59:invokespecial   #212 <Method void HashSet(java.util.Collection)>
	//   24   62:astore_3        
		list = ((List) (b.edit()));
	//   25   63:aload_0         
	//   26   64:getfield        #59  <Field SharedPreferences b>
	//   27   67:invokeinterface #216 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   28   72:astore_1        
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  29   73:aload_3         
	//*  30   74:invokeinterface #144 <Method Iterator Set.iterator()>
	//*  31   79:astore_3        
	//*  32   80:aload_3         
	//*  33   81:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  34   86:ifeq            240
		{
			String s = (String)((Iterator) (obj)).next();
	//   35   89:aload_3         
	//   36   90:invokeinterface #154 <Method Object Iterator.next()>
	//   37   95:checkcast       #96  <Class String>
	//   38   98:astore          4
			if(!((Set) (hashset)).contains(((Object) (a(s)))))
	//*  39  100:aload_2         
	//*  40  101:aload_0         
	//*  41  102:aload           4
	//*  42  104:invokevirtual   #158 <Method String a(String)>
	//*  43  107:invokeinterface #219 <Method boolean Set.contains(Object)>
	//*  44  112:ifne            188
			{
				String s1 = h;
	//   45  115:getstatic       #29  <Field String h>
	//   46  118:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   47  120:new             #36  <Class StringBuilder>
	//   48  123:dup             
	//   49  124:invokespecial   #37  <Method void StringBuilder()>
	//   50  127:astore          6
				stringbuilder.append("Deleting outdated re-eligibility id ");
	//   51  129:aload           6
	//   52  131:ldc1            #221 <String "Deleting outdated re-eligibility id ">
	//   53  133:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   54  136:pop             
				stringbuilder.append(s);
	//   55  137:aload           6
	//   56  139:aload           4
	//   57  141:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   58  144:pop             
				stringbuilder.append(" from re-eligibility list.");
	//   59  145:aload           6
	//   60  147:ldc1            #223 <String " from re-eligibility list.">
	//   61  149:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   62  152:pop             
				AppboyLogger.d(s1, stringbuilder.toString());
	//   63  153:aload           5
	//   64  155:aload           6
	//   65  157:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   66  160:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   67  163:pop             
				c.remove(((Object) (s)));
	//   68  164:aload_0         
	//   69  165:getfield        #64  <Field Map c>
	//   70  168:aload           4
	//   71  170:invokeinterface #227 <Method Object Map.remove(Object)>
	//   72  175:pop             
				((android.content.SharedPreferences.Editor) (list)).remove(s);
	//   73  176:aload_1         
	//   74  177:aload           4
	//   75  179:invokeinterface #232 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   76  184:pop             
			} else
	//*  77  185:goto            80
			{
				String s2 = h;
	//   78  188:getstatic       #29  <Field String h>
	//   79  191:astore          5
				StringBuilder stringbuilder1 = new StringBuilder();
	//   80  193:new             #36  <Class StringBuilder>
	//   81  196:dup             
	//   82  197:invokespecial   #37  <Method void StringBuilder()>
	//   83  200:astore          6
				stringbuilder1.append("Retaining re-eligibility id ");
	//   84  202:aload           6
	//   85  204:ldc1            #234 <String "Retaining re-eligibility id ">
	//   86  206:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   87  209:pop             
				stringbuilder1.append(s);
	//   88  210:aload           6
	//   89  212:aload           4
	//   90  214:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   91  217:pop             
				stringbuilder1.append(" in re-eligibility list.");
	//   92  218:aload           6
	//   93  220:ldc1            #236 <String " in re-eligibility list.">
	//   94  222:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   95  225:pop             
				AppboyLogger.d(s2, stringbuilder1.toString());
	//   96  226:aload           5
	//   97  228:aload           6
	//   98  230:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   99  233:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//  100  236:pop             
			}
		}

	//* 101  237:goto            80
		((android.content.SharedPreferences.Editor) (list)).apply();
	//  102  240:aload_1         
	//  103  241:invokeinterface #239 <Method void android.content.SharedPreferences$Editor.apply()>
	//  104  246:return          
	}

	boolean a(long l, AppboyGeofence appboygeofence, x x1)
	{
		if(appboygeofence == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(h, "Geofence passed into getReportEligible() was null.");
	//    2    4:getstatic       #29  <Field String h>
	//    3    7:ldc1            #243 <String "Geofence passed into getReportEligible() was null.">
	//    4    9:invokestatic    #246 <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		}
		String s = appboygeofence.getId();
	//    8   15:aload_3         
	//    9   16:invokevirtual   #205 <Method String AppboyGeofence.getId()>
	//   10   19:astore          10
		Object obj = ((Object) (a(s, x1)));
	//   11   21:aload_0         
	//   12   22:aload           10
	//   13   24:aload           4
	//   14   26:invokevirtual   #248 <Method String a(String, x)>
	//   15   29:astore          11
		int i;
		if(x1.equals(((Object) (x.a))))
	//*  16   31:aload           4
	//*  17   33:getstatic       #251 <Field x x.a>
	//*  18   36:invokevirtual   #254 <Method boolean x.equals(Object)>
	//*  19   39:ifeq            51
			i = appboygeofence.getCooldownEnterSeconds();
	//   20   42:aload_3         
	//   21   43:invokevirtual   #257 <Method int AppboyGeofence.getCooldownEnterSeconds()>
	//   22   46:istore          5
		else
	//*  23   48:goto            57
			i = appboygeofence.getCooldownExitSeconds();
	//   24   51:aload_3         
	//   25   52:invokevirtual   #260 <Method int AppboyGeofence.getCooldownExitSeconds()>
	//   26   55:istore          5
		long l1 = l - e;
	//   27   57:lload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #78  <Field long e>
	//   30   62:lsub            
	//   31   63:lstore          6
		if((long)g > l1)
	//*  32   65:aload_0         
	//*  33   66:getfield        #89  <Field int g>
	//*  34   69:i2l             
	//*  35   70:lload           6
	//*  36   72:lcmp            
	//*  37   73:ifle            154
		{
			appboygeofence = ((AppboyGeofence) (h));
	//   38   76:getstatic       #29  <Field String h>
	//   39   79:astore_3        
			x1 = ((x) (new StringBuilder()));
	//   40   80:new             #36  <Class StringBuilder>
	//   41   83:dup             
	//   42   84:invokespecial   #37  <Method void StringBuilder()>
	//   43   87:astore          4
			((StringBuilder) (x1)).append("Geofence report suppressed since only ");
	//   44   89:aload           4
	//   45   91:ldc2            #262 <String "Geofence report suppressed since only ">
	//   46   94:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   47   97:pop             
			((StringBuilder) (x1)).append(l1);
	//   48   98:aload           4
	//   49  100:lload           6
	//   50  102:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//   51  105:pop             
			((StringBuilder) (x1)).append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
	//   52  106:aload           4
	//   53  108:ldc2            #267 <String " seconds have passed since the last time geofences were reported globally (minimum interval: ">
	//   54  111:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   55  114:pop             
			((StringBuilder) (x1)).append(g);
	//   56  115:aload           4
	//   57  117:aload_0         
	//   58  118:getfield        #89  <Field int g>
	//   59  121:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   60  124:pop             
			((StringBuilder) (x1)).append("). id:");
	//   61  125:aload           4
	//   62  127:ldc2            #269 <String "). id:">
	//   63  130:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   64  133:pop             
			((StringBuilder) (x1)).append(s);
	//   65  134:aload           4
	//   66  136:aload           10
	//   67  138:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   68  141:pop             
			AppboyLogger.d(((String) (appboygeofence)), ((StringBuilder) (x1)).toString());
	//   69  142:aload_3         
	//   70  143:aload           4
	//   71  145:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   72  148:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   73  151:pop             
			return false;
	//   74  152:iconst_0        
	//   75  153:ireturn         
		}
		if(c.containsKey(obj))
	//*  76  154:aload_0         
	//*  77  155:getfield        #64  <Field Map c>
	//*  78  158:aload           11
	//*  79  160:invokeinterface #272 <Method boolean Map.containsKey(Object)>
	//*  80  165:ifeq            376
		{
			long l2 = l - ((Long)c.get(obj)).longValue();
	//   81  168:lload_1         
	//   82  169:aload_0         
	//   83  170:getfield        #64  <Field Map c>
	//   84  173:aload           11
	//   85  175:invokeinterface #275 <Method Object Map.get(Object)>
	//   86  180:checkcast       #165 <Class Long>
	//   87  183:invokevirtual   #279 <Method long Long.longValue()>
	//   88  186:lsub            
	//   89  187:lstore          8
			if((long)i > l2)
	//*  90  189:iload           5
	//*  91  191:i2l             
	//*  92  192:lload           8
	//*  93  194:lcmp            
	//*  94  195:ifle            291
			{
				appboygeofence = ((AppboyGeofence) (h));
	//   95  198:getstatic       #29  <Field String h>
	//   96  201:astore_3        
				obj = ((Object) (new StringBuilder()));
	//   97  202:new             #36  <Class StringBuilder>
	//   98  205:dup             
	//   99  206:invokespecial   #37  <Method void StringBuilder()>
	//  100  209:astore          11
				((StringBuilder) (obj)).append("Geofence report suppressed since only ");
	//  101  211:aload           11
	//  102  213:ldc2            #262 <String "Geofence report suppressed since only ">
	//  103  216:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  104  219:pop             
				((StringBuilder) (obj)).append(l2);
	//  105  220:aload           11
	//  106  222:lload           8
	//  107  224:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//  108  227:pop             
				((StringBuilder) (obj)).append(" seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ");
	//  109  228:aload           11
	//  110  230:ldc2            #281 <String " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ">
	//  111  233:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  112  236:pop             
				((StringBuilder) (obj)).append(i);
	//  113  237:aload           11
	//  114  239:iload           5
	//  115  241:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//  116  244:pop             
				((StringBuilder) (obj)).append("). id:");
	//  117  245:aload           11
	//  118  247:ldc2            #269 <String "). id:">
	//  119  250:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  120  253:pop             
				((StringBuilder) (obj)).append(s);
	//  121  254:aload           11
	//  122  256:aload           10
	//  123  258:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  124  261:pop             
				((StringBuilder) (obj)).append(" transition:");
	//  125  262:aload           11
	//  126  264:ldc2            #283 <String " transition:">
	//  127  267:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  128  270:pop             
				((StringBuilder) (obj)).append(((Object) (x1)));
	//  129  271:aload           11
	//  130  273:aload           4
	//  131  275:invokevirtual   #286 <Method StringBuilder StringBuilder.append(Object)>
	//  132  278:pop             
				AppboyLogger.d(((String) (appboygeofence)), ((StringBuilder) (obj)).toString());
	//  133  279:aload_3         
	//  134  280:aload           11
	//  135  282:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  136  285:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//  137  288:pop             
				return false;
	//  138  289:iconst_0        
	//  139  290:ireturn         
			}
			appboygeofence = ((AppboyGeofence) (h));
	//  140  291:getstatic       #29  <Field String h>
	//  141  294:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//  142  295:new             #36  <Class StringBuilder>
	//  143  298:dup             
	//  144  299:invokespecial   #37  <Method void StringBuilder()>
	//  145  302:astore          12
			stringbuilder.append(l2);
	//  146  304:aload           12
	//  147  306:lload           8
	//  148  308:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//  149  311:pop             
			stringbuilder.append(" seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ");
	//  150  312:aload           12
	//  151  314:ldc2            #281 <String " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ">
	//  152  317:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  153  320:pop             
			stringbuilder.append(i);
	//  154  321:aload           12
	//  155  323:iload           5
	//  156  325:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//  157  328:pop             
			stringbuilder.append("). id:");
	//  158  329:aload           12
	//  159  331:ldc2            #269 <String "). id:">
	//  160  334:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  161  337:pop             
			stringbuilder.append(s);
	//  162  338:aload           12
	//  163  340:aload           10
	//  164  342:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  165  345:pop             
			stringbuilder.append(" transition:");
	//  166  346:aload           12
	//  167  348:ldc2            #283 <String " transition:">
	//  168  351:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  169  354:pop             
			stringbuilder.append(((Object) (x1)));
	//  170  355:aload           12
	//  171  357:aload           4
	//  172  359:invokevirtual   #286 <Method StringBuilder StringBuilder.append(Object)>
	//  173  362:pop             
			AppboyLogger.d(((String) (appboygeofence)), stringbuilder.toString());
	//  174  363:aload_3         
	//  175  364:aload           12
	//  176  366:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  177  369:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//  178  372:pop             
		} else
	//* 179  373:goto            433
		{
			appboygeofence = ((AppboyGeofence) (h));
	//  180  376:getstatic       #29  <Field String h>
	//  181  379:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//  182  380:new             #36  <Class StringBuilder>
	//  183  383:dup             
	//  184  384:invokespecial   #37  <Method void StringBuilder()>
	//  185  387:astore          12
			stringbuilder1.append("Geofence report eligible since this geofence/transition combination has never reported. id:");
	//  186  389:aload           12
	//  187  391:ldc2            #288 <String "Geofence report eligible since this geofence/transition combination has never reported. id:">
	//  188  394:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  189  397:pop             
			stringbuilder1.append(s);
	//  190  398:aload           12
	//  191  400:aload           10
	//  192  402:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  193  405:pop             
			stringbuilder1.append(" ");
	//  194  406:aload           12
	//  195  408:ldc2            #290 <String " ">
	//  196  411:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  197  414:pop             
			stringbuilder1.append(((Object) (x1)));
	//  198  415:aload           12
	//  199  417:aload           4
	//  200  419:invokevirtual   #286 <Method StringBuilder StringBuilder.append(Object)>
	//  201  422:pop             
			AppboyLogger.d(((String) (appboygeofence)), stringbuilder1.toString());
	//  202  423:aload_3         
	//  203  424:aload           12
	//  204  426:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  205  429:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//  206  432:pop             
		}
		appboygeofence = ((AppboyGeofence) (h));
	//  207  433:getstatic       #29  <Field String h>
	//  208  436:astore_3        
		x1 = ((x) (new StringBuilder()));
	//  209  437:new             #36  <Class StringBuilder>
	//  210  440:dup             
	//  211  441:invokespecial   #37  <Method void StringBuilder()>
	//  212  444:astore          4
		((StringBuilder) (x1)).append("Geofence report eligible since ");
	//  213  446:aload           4
	//  214  448:ldc2            #292 <String "Geofence report eligible since ">
	//  215  451:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  216  454:pop             
		((StringBuilder) (x1)).append(l1);
	//  217  455:aload           4
	//  218  457:lload           6
	//  219  459:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//  220  462:pop             
		((StringBuilder) (x1)).append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
	//  221  463:aload           4
	//  222  465:ldc2            #267 <String " seconds have passed since the last time geofences were reported globally (minimum interval: ">
	//  223  468:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  224  471:pop             
		((StringBuilder) (x1)).append(g);
	//  225  472:aload           4
	//  226  474:aload_0         
	//  227  475:getfield        #89  <Field int g>
	//  228  478:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//  229  481:pop             
		((StringBuilder) (x1)).append("). id:");
	//  230  482:aload           4
	//  231  484:ldc2            #269 <String "). id:">
	//  232  487:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  233  490:pop             
		((StringBuilder) (x1)).append(s);
	//  234  491:aload           4
	//  235  493:aload           10
	//  236  495:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//  237  498:pop             
		AppboyLogger.d(((String) (appboygeofence)), ((StringBuilder) (x1)).toString());
	//  238  499:aload_3         
	//  239  500:aload           4
	//  240  502:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  241  505:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//  242  508:pop             
		c.put(obj, ((Object) (Long.valueOf(l))));
	//  243  509:aload_0         
	//  244  510:getfield        #64  <Field Map c>
	//  245  513:aload           11
	//  246  515:lload_1         
	//  247  516:invokestatic    #169 <Method Long Long.valueOf(long)>
	//  248  519:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//  249  524:pop             
		appboygeofence = ((AppboyGeofence) (b.edit()));
	//  250  525:aload_0         
	//  251  526:getfield        #59  <Field SharedPreferences b>
	//  252  529:invokeinterface #216 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  253  534:astore_3        
		((android.content.SharedPreferences.Editor) (appboygeofence)).putLong(((String) (obj)), l);
	//  254  535:aload_3         
	//  255  536:aload           11
	//  256  538:lload_1         
	//  257  539:invokeinterface #296 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  258  544:pop             
		((android.content.SharedPreferences.Editor) (appboygeofence)).apply();
	//  259  545:aload_3         
	//  260  546:invokeinterface #239 <Method void android.content.SharedPreferences$Editor.apply()>
		e = l;
	//  261  551:aload_0         
	//  262  552:lload_1         
	//  263  553:putfield        #78  <Field long e>
		appboygeofence = ((AppboyGeofence) (a.edit()));
	//  264  556:aload_0         
	//  265  557:getfield        #55  <Field SharedPreferences a>
	//  266  560:invokeinterface #216 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  267  565:astore_3        
		((android.content.SharedPreferences.Editor) (appboygeofence)).putLong("last_report_global", l);
	//  268  566:aload_3         
	//  269  567:ldc1            #76  <String "last_report_global">
	//  270  569:lload_1         
	//  271  570:invokeinterface #296 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  272  575:pop             
		((android.content.SharedPreferences.Editor) (appboygeofence)).apply();
	//  273  576:aload_3         
	//  274  577:invokeinterface #239 <Method void android.content.SharedPreferences$Editor.apply()>
		return true;
	//  275  582:iconst_1        
	//  276  583:ireturn         
	}

	protected boolean a(boolean flag, long l)
	{
		long l1 = l - d;
	//    0    0:lload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #74  <Field long d>
	//    3    5:lsub            
	//    4    6:lstore          4
		if(!flag && (long)f > l1)
	//*   5    8:iload_1         
	//*   6    9:ifne            95
	//*   7   12:aload_0         
	//*   8   13:getfield        #85  <Field int f>
	//*   9   16:i2l             
	//*  10   17:lload           4
	//*  11   19:lcmp            
	//*  12   20:ifle            95
		{
			String s = h;
	//   13   23:getstatic       #29  <Field String h>
	//   14   26:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   15   28:new             #36  <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #37  <Method void StringBuilder()>
	//   18   35:astore          7
			stringbuilder.append("Geofence request suppressed since only ");
	//   19   37:aload           7
	//   20   39:ldc2            #299 <String "Geofence request suppressed since only ">
	//   21   42:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
			stringbuilder.append(l1);
	//   23   46:aload           7
	//   24   48:lload           4
	//   25   50:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//   26   53:pop             
			stringbuilder.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
	//   27   54:aload           7
	//   28   56:ldc2            #301 <String " seconds have passed since the last time geofences were requested (minimum interval: ">
	//   29   59:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			stringbuilder.append(f);
	//   31   63:aload           7
	//   32   65:aload_0         
	//   33   66:getfield        #85  <Field int f>
	//   34   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   35   72:pop             
			stringbuilder.append(").");
	//   36   73:aload           7
	//   37   75:ldc2            #303 <String ").">
	//   38   78:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   40   82:aload           6
	//   41   84:aload           7
	//   42   86:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   43   89:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   44   92:pop             
			return false;
	//   45   93:iconst_0        
	//   46   94:ireturn         
		}
		if(flag)
	//*  47   95:iload_1         
	//*  48   96:ifeq            144
		{
			String s1 = h;
	//   49   99:getstatic       #29  <Field String h>
	//   50  102:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//   51  104:new             #36  <Class StringBuilder>
	//   52  107:dup             
	//   53  108:invokespecial   #37  <Method void StringBuilder()>
	//   54  111:astore          7
			stringbuilder1.append("Geofence request eligible. Ignoring rate limit for this geofence request. Elapsed time since last request:");
	//   55  113:aload           7
	//   56  115:ldc2            #305 <String "Geofence request eligible. Ignoring rate limit for this geofence request. Elapsed time since last request:">
	//   57  118:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   58  121:pop             
			stringbuilder1.append(l1);
	//   59  122:aload           7
	//   60  124:lload           4
	//   61  126:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//   62  129:pop             
			AppboyLogger.d(s1, stringbuilder1.toString());
	//   63  130:aload           6
	//   64  132:aload           7
	//   65  134:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   66  137:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   67  140:pop             
		} else
	//*  68  141:goto            214
		{
			String s2 = h;
	//   69  144:getstatic       #29  <Field String h>
	//   70  147:astore          6
			StringBuilder stringbuilder2 = new StringBuilder();
	//   71  149:new             #36  <Class StringBuilder>
	//   72  152:dup             
	//   73  153:invokespecial   #37  <Method void StringBuilder()>
	//   74  156:astore          7
			stringbuilder2.append("Geofence request eligible since ");
	//   75  158:aload           7
	//   76  160:ldc2            #307 <String "Geofence request eligible since ">
	//   77  163:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   78  166:pop             
			stringbuilder2.append(l1);
	//   79  167:aload           7
	//   80  169:lload           4
	//   81  171:invokevirtual   #265 <Method StringBuilder StringBuilder.append(long)>
	//   82  174:pop             
			stringbuilder2.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
	//   83  175:aload           7
	//   84  177:ldc2            #301 <String " seconds have passed since the last time geofences were requested (minimum interval: ">
	//   85  180:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   86  183:pop             
			stringbuilder2.append(f);
	//   87  184:aload           7
	//   88  186:aload_0         
	//   89  187:getfield        #85  <Field int f>
	//   90  190:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   91  193:pop             
			stringbuilder2.append(").");
	//   92  194:aload           7
	//   93  196:ldc2            #303 <String ").">
	//   94  199:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   95  202:pop             
			AppboyLogger.d(s2, stringbuilder2.toString());
	//   96  203:aload           6
	//   97  205:aload           7
	//   98  207:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   99  210:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//  100  213:pop             
		}
		d = l;
	//  101  214:aload_0         
	//  102  215:lload_2         
	//  103  216:putfield        #74  <Field long d>
		android.content.SharedPreferences.Editor editor = a.edit();
	//  104  219:aload_0         
	//  105  220:getfield        #55  <Field SharedPreferences a>
	//  106  223:invokeinterface #216 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  107  228:astore          6
		editor.putLong("last_request_global", d);
	//  108  230:aload           6
	//  109  232:ldc1            #66  <String "last_request_global">
	//  110  234:aload_0         
	//  111  235:getfield        #74  <Field long d>
	//  112  238:invokeinterface #296 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  113  243:pop             
		editor.apply();
	//  114  244:aload           6
	//  115  246:invokeinterface #239 <Method void android.content.SharedPreferences$Editor.apply()>
		return true;
	//  116  251:iconst_1        
	//  117  252:ireturn         
	}

	private static final String h = AppboyLogger.getAppboyLogTag(bo/app/bm);
	final SharedPreferences a;
	final SharedPreferences b;
	Map c;
	long d;
	long e;
	int f;
	int g;

	static 
	{
	//    0    0:ldc1            #2   <Class bm>
	//    1    2:invokestatic    #27  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #29  <Field String h>
	//*   3    8:return          
	}
}
