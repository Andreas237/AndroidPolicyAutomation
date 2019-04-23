// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			fl, fo, fq, fs, 
//			eb, fb, fk, ev, 
//			fn, fh, dl, bu, 
//			dt, bl, aa

public class fp
	implements fl
{

	public fp(Context context, bl bl, ThreadPoolExecutor threadpoolexecutor, aa aa, AppboyConfigurationProvider appboyconfigurationprovider, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		k = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #47  <Field long k>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #45  <Method void Object()>
	//    9   17:putfield        #49  <Field Object a>
		c = context.getApplicationContext();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #55  <Method Context Context.getApplicationContext()>
	//   13   25:putfield        #57  <Field Context c>
		d = bl;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #59  <Field bl d>
		e = aa;
	//   17   33:aload_0         
	//   18   34:aload           4
	//   19   36:putfield        #61  <Field aa e>
		f = appboyconfigurationprovider.getTriggerActionMinimumTimeIntervalInSeconds();
	//   20   39:aload_0         
	//   21   40:aload           5
	//   22   42:invokevirtual   #67  <Method long AppboyConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds()>
	//   23   45:putfield        #69  <Field long f>
		bl = ((bl) (new StringBuilder()));
	//   24   48:new             #71  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #72  <Method void StringBuilder()>
	//   27   55:astore_2        
		((StringBuilder) (bl)).append("com.appboy.storage.triggers.actions");
	//   28   56:aload_2         
	//   29   57:ldc1            #74  <String "com.appboy.storage.triggers.actions">
	//   30   59:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		((StringBuilder) (bl)).append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   32   63:aload_2         
	//   33   64:aload_1         
	//   34   65:aload           6
	//   35   67:aload           7
	//   36   69:invokestatic    #84  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   37   72:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
		g = context.getSharedPreferences(((StringBuilder) (bl)).toString(), 0);
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:aload_2         
	//   42   79:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   43   82:iconst_0        
	//   44   83:invokevirtual   #92  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   45   86:putfield        #94  <Field SharedPreferences g>
		h = ((fk) (new fo(context, threadpoolexecutor, s1)));
	//   46   89:aload_0         
	//   47   90:new             #96  <Class fo>
	//   48   93:dup             
	//   49   94:aload_1         
	//   50   95:aload_3         
	//   51   96:aload           7
	//   52   98:invokespecial   #99  <Method void fo(Context, ThreadPoolExecutor, String)>
	//   53  101:putfield        #101 <Field fk h>
		i = ((fn) (new fq(context, s, s1)));
	//   54  104:aload_0         
	//   55  105:new             #103 <Class fq>
	//   56  108:dup             
	//   57  109:aload_1         
	//   58  110:aload           6
	//   59  112:aload           7
	//   60  114:invokespecial   #106 <Method void fq(Context, String, String)>
	//   61  117:putfield        #108 <Field fn i>
		j = a();
	//   62  120:aload_0         
	//   63  121:aload_0         
	//   64  122:invokevirtual   #111 <Method Map a()>
	//   65  125:putfield        #113 <Field Map j>
	//   66  128:return          
	}

	static Context a(fp fp1)
	{
		return fp1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Context c>
	//    2    4:areturn         
	}

	static aa b(fp fp1)
	{
		return fp1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field aa e>
	//    2    4:areturn         
	}

	Map a()
	{
		HashMap hashmap;
		Object obj;
		hashmap = new HashMap();
	//    0    0:new             #121 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void HashMap()>
	//    3    7:astore_1        
		obj = ((Object) (g.getAll()));
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field SharedPreferences g>
	//    6   12:invokeinterface #127 <Method Map SharedPreferences.getAll()>
	//    7   17:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_272;
	//    8   18:aload_2         
	//    9   19:ifnull          272
		if(((Map) (obj)).size() == 0)
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #133 <Method int Map.size()>
	//*  12   28:ifne            33
			return ((Map) (hashmap));
	//   13   31:aload_1         
	//   14   32:areturn         
		obj = ((Object) (((Map) (obj)).keySet()));
	//   15   33:aload_2         
	//   16   34:invokeinterface #137 <Method Set Map.keySet()>
	//   17   39:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_270;
	//   18   40:aload_2         
	//   19   41:ifnull          270
		if(((Set) (obj)).size() == 0)
	//*  20   44:aload_2         
	//*  21   45:invokeinterface #140 <Method int Set.size()>
	//*  22   50:ifne            55
			return ((Map) (hashmap));
	//   23   53:aload_1         
	//   24   54:areturn         
		obj = ((Object) (((Set) (obj)).iterator()));
	//   25   55:aload_2         
	//   26   56:invokeinterface #144 <Method Iterator Set.iterator()>
	//   27   61:astore_2        
_L3:
		Object obj2;
		String s;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_268;
	//   28   62:aload_2         
	//   29   63:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            268
		obj2 = ((Object) ((String)((Iterator) (obj)).next()));
	//   31   71:aload_2         
	//   32   72:invokeinterface #154 <Method Object Iterator.next()>
	//   33   77:checkcast       #156 <Class String>
	//   34   80:astore_3        
		s = g.getString(((String) (obj2)), ((String) (null)));
	//   35   81:aload_0         
	//   36   82:getfield        #94  <Field SharedPreferences g>
	//   37   85:aload_3         
	//   38   86:aconst_null     
	//   39   87:invokeinterface #160 <Method String SharedPreferences.getString(String, String)>
	//   40   92:astore          4
		if(!StringUtils.isNullOrBlank(s)) goto _L2; else goto _L1
	//   41   94:aload           4
	//   42   96:invokestatic    #164 <Method boolean StringUtils.isNullOrBlank(String)>
	//   43   99:ifeq            153
_L1:
		s = b;
	//   44  102:getstatic       #40  <Field String b>
	//   45  105:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   46  107:new             #71  <Class StringBuilder>
	//   47  110:dup             
	//   48  111:invokespecial   #72  <Method void StringBuilder()>
	//   49  114:astore          5
		stringbuilder.append("Received null or blank serialized triggered action string for action id ");
	//   50  116:aload           5
	//   51  118:ldc1            #166 <String "Received null or blank serialized triggered action string for action id ">
	//   52  120:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   53  123:pop             
		stringbuilder.append(((String) (obj2)));
	//   54  124:aload           5
	//   55  126:aload_3         
	//   56  127:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   57  130:pop             
		stringbuilder.append(" from shared preferences. Not parsing.");
	//   58  131:aload           5
	//   59  133:ldc1            #168 <String " from shared preferences. Not parsing.">
	//   60  135:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   61  138:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   62  139:aload           4
	//   63  141:aload           5
	//   64  143:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   65  146:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//   66  149:pop             
		  goto _L3
	//*  67  150:goto            62
_L2:
		obj2 = ((Object) (fs.b(new JSONObject(s), d)));
	//   68  153:new             #174 <Class JSONObject>
	//   69  156:dup             
	//   70  157:aload           4
	//   71  159:invokespecial   #177 <Method void JSONObject(String)>
	//   72  162:aload_0         
	//   73  163:getfield        #59  <Field bl d>
	//   74  166:invokestatic    #182 <Method eb fs.b(JSONObject, bl)>
	//   75  169:astore_3        
		if(obj2 == null) goto _L3; else goto _L4
	//   76  170:aload_3         
	//   77  171:ifnull          62
_L4:
		((Map) (hashmap)).put(((Object) (((eb) (obj2)).b())), obj2);
	//   78  174:aload_1         
	//   79  175:aload_3         
	//   80  176:invokeinterface #186 <Method String eb.b()>
	//   81  181:aload_3         
	//   82  182:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   83  187:pop             
		String s1 = b;
	//   84  188:getstatic       #40  <Field String b>
	//   85  191:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   86  193:new             #71  <Class StringBuilder>
	//   87  196:dup             
	//   88  197:invokespecial   #72  <Method void StringBuilder()>
	//   89  200:astore          5
		stringbuilder1.append("Retrieving templated triggered action id ");
	//   90  202:aload           5
	//   91  204:ldc1            #192 <String "Retrieving templated triggered action id ">
	//   92  206:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   93  209:pop             
		stringbuilder1.append(((eb) (obj2)).b());
	//   94  210:aload           5
	//   95  212:aload_3         
	//   96  213:invokeinterface #186 <Method String eb.b()>
	//   97  218:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   98  221:pop             
		stringbuilder1.append(" from local storage.");
	//   99  222:aload           5
	//  100  224:ldc1            #194 <String " from local storage.">
	//  101  226:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  102  229:pop             
		AppboyLogger.d(s1, stringbuilder1.toString());
	//  103  230:aload           4
	//  104  232:aload           5
	//  105  234:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  106  237:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//  107  240:pop             
		  goto _L3
	//* 108  241:goto            62
		Object obj1;
		obj1;
	//  109  244:astore_2        
		AppboyLogger.e(b, "Encountered unexpected exception while parsing stored triggered actions.", ((Throwable) (obj1)));
	//  110  245:getstatic       #40  <Field String b>
	//  111  248:ldc1            #198 <String "Encountered unexpected exception while parsing stored triggered actions.">
	//  112  250:aload_2         
	//  113  251:invokestatic    #201 <Method int AppboyLogger.e(String, String, Throwable)>
	//  114  254:pop             
		return ((Map) (hashmap));
	//  115  255:aload_1         
	//  116  256:areturn         
		obj1;
	//  117  257:astore_2        
		AppboyLogger.e(b, "Encountered Json exception while parsing stored triggered actions.", ((Throwable) (obj1)));
	//  118  258:getstatic       #40  <Field String b>
	//  119  261:ldc1            #203 <String "Encountered Json exception while parsing stored triggered actions.">
	//  120  263:aload_2         
	//  121  264:invokestatic    #201 <Method int AppboyLogger.e(String, String, Throwable)>
	//  122  267:pop             
		return ((Map) (hashmap));
	//  123  268:aload_1         
	//  124  269:areturn         
		return ((Map) (hashmap));
	//  125  270:aload_1         
	//  126  271:areturn         
		return ((Map) (hashmap));
	//  127  272:aload_1         
	//  128  273:areturn         
	}

	public void a(fb fb1)
	{
		Object obj = ((Object) (b));
	//    0    0:getstatic       #40  <Field String b>
	//    1    3:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #71  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #72  <Method void StringBuilder()>
	//    5   12:astore          5
		stringbuilder.append("New incoming <");
	//    6   14:aload           5
	//    7   16:ldc1            #208 <String "New incoming <">
	//    8   18:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(fb1.b());
	//   10   22:aload           5
	//   11   24:aload_1         
	//   12   25:invokeinterface #211 <Method String fb.b()>
	//   13   30:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
		stringbuilder.append(">. Searching for matching triggers.");
	//   15   34:aload           5
	//   16   36:ldc1            #213 <String ">. Searching for matching triggers.">
	//   17   38:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   19   42:aload           4
	//   20   44:aload           5
	//   21   46:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   22   49:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//   23   52:pop             
		obj = ((Object) (b(fb1)));
	//   24   53:aload_0         
	//   25   54:aload_1         
	//   26   55:invokevirtual   #216 <Method eb b(fb)>
	//   27   58:astore          4
		if(obj != null)
	//*  28   60:aload           4
	//*  29   62:ifnull          187
		{
			((eb) (obj)).a(h.a(((eb) (obj))));
	//   30   65:aload           4
	//   31   67:aload_0         
	//   32   68:getfield        #101 <Field fk h>
	//   33   71:aload           4
	//   34   73:invokeinterface #221 <Method String fk.a(eb)>
	//   35   78:invokeinterface #223 <Method void eb.a(String)>
			long l;
			if(((eb) (obj)).c().e() != -1)
	//*  36   83:aload           4
	//*  37   85:invokeinterface #226 <Method ev eb.c()>
	//*  38   90:invokeinterface #230 <Method int ev.e()>
	//*  39   95:iconst_m1       
	//*  40   96:icmpeq          123
				l = fb1.d() + (long)((eb) (obj)).c().e();
	//   41   99:aload_1         
	//   42  100:invokeinterface #232 <Method long fb.d()>
	//   43  105:aload           4
	//   44  107:invokeinterface #226 <Method ev eb.c()>
	//   45  112:invokeinterface #230 <Method int ev.e()>
	//   46  117:i2l             
	//   47  118:ladd            
	//   48  119:lstore_2        
			else
	//*  49  120:goto            127
				l = -1L;
	//   50  123:ldc2w           #233 <Long -1L>
	//   51  126:lstore_2        
			(new Handler(Looper.getMainLooper())).postDelayed(new Runnable(((eb) (obj)), fb1, l) {

				public void run()
				{
					a.a(fp.a(d), fp.b(d), b, c);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field eb a>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field fp d>
				//    4    8:invokestatic    #36  <Method Context fp.a(fp)>
				//    5   11:aload_0         
				//    6   12:getfield        #22  <Field fp d>
				//    7   15:invokestatic    #39  <Method aa fp.b(fp)>
				//    8   18:aload_0         
				//    9   19:getfield        #26  <Field fb b>
				//   10   22:aload_0         
				//   11   23:getfield        #28  <Field long c>
				//   12   26:invokeinterface #44  <Method void eb.a(Context, aa, fb, long)>
				//   13   31:return          
				}

				final eb a;
				final fb b;
				final long c;
				final fp d;

			
			{
				d = fp.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field fp d>
				a = eb1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field eb a>
				b = fb1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field fb b>
				c = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #28  <Field long c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
, ((eb) (obj)).c().d() * 1000);
	//   52  127:new             #236 <Class Handler>
	//   53  130:dup             
	//   54  131:invokestatic    #242 <Method Looper Looper.getMainLooper()>
	//   55  134:invokespecial   #245 <Method void Handler(Looper)>
	//   56  137:new             #8   <Class fp$1>
	//   57  140:dup             
	//   58  141:aload_0         
	//   59  142:aload           4
	//   60  144:aload_1         
	//   61  145:lload_2         
	//   62  146:invokespecial   #248 <Method void fp$1(fp, eb, fb, long)>
	//   63  149:aload           4
	//   64  151:invokeinterface #226 <Method ev eb.c()>
	//   65  156:invokeinterface #250 <Method int ev.d()>
	//   66  161:sipush          1000
	//   67  164:imul            
	//   68  165:i2l             
	//   69  166:invokevirtual   #254 <Method boolean Handler.postDelayed(Runnable, long)>
	//   70  169:pop             
			i.a(((eb) (obj)), fb1.c());
	//   71  170:aload_0         
	//   72  171:getfield        #108 <Field fn i>
	//   73  174:aload           4
	//   74  176:aload_1         
	//   75  177:invokeinterface #256 <Method long fb.c()>
	//   76  182:invokeinterface #261 <Method void fn.a(eb, long)>
		}
	//   77  187:return          
	}

	public void a(List list)
	{
		fh fh1;
		fh1 = new fh();
	//    0    0:new             #264 <Class fh>
	//    1    3:dup             
	//    2    4:invokespecial   #265 <Method void fh()>
	//    3    7:astore          4
		if(list == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       24
		{
			AppboyLogger.w(b, "Received a null list of triggers in registerTriggeredActions(). Doing nothing.");
	//    6   13:getstatic       #40  <Field String b>
	//    7   16:ldc2            #267 <String "Received a null list of triggers in registerTriggeredActions(). Doing nothing.">
	//    8   19:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//    9   22:pop             
			return;
	//   10   23:return          
		}
		Object obj = a;
	//   11   24:aload_0         
	//   12   25:getfield        #49  <Field Object a>
	//   13   28:astore_3        
		obj;
	//   14   29:aload_3         
		JVM INSTR monitorenter ;
	//   15   30:monitorenter    
		android.content.SharedPreferences.Editor editor;
		Object obj1;
		j.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #113 <Field Map j>
	//   18   35:invokeinterface #270 <Method void Map.clear()>
		editor = g.edit();
	//   19   40:aload_0         
	//   20   41:getfield        #94  <Field SharedPreferences g>
	//   21   44:invokeinterface #274 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   49:astore          5
		editor.clear();
	//   23   51:aload           5
	//   24   53:invokeinterface #278 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   25   58:pop             
		obj1 = ((Object) (b));
	//   26   59:getstatic       #40  <Field String b>
	//   27   62:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   28   64:new             #71  <Class StringBuilder>
	//   29   67:dup             
	//   30   68:invokespecial   #72  <Method void StringBuilder()>
	//   31   71:astore          7
		stringbuilder.append("Registering ");
	//   32   73:aload           7
	//   33   75:ldc2            #280 <String "Registering ">
	//   34   78:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   35   81:pop             
		stringbuilder.append(list.size());
	//   36   82:aload           7
	//   37   84:aload_1         
	//   38   85:invokeinterface #283 <Method int List.size()>
	//   39   90:invokevirtual   #286 <Method StringBuilder StringBuilder.append(int)>
	//   40   93:pop             
		stringbuilder.append(" new triggered actions.");
	//   41   94:aload           7
	//   42   96:ldc2            #288 <String " new triggered actions.">
	//   43   99:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   44  102:pop             
		AppboyLogger.d(((String) (obj1)), stringbuilder.toString());
	//   45  103:aload           6
	//   46  105:aload           7
	//   47  107:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   48  110:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//   49  113:pop             
		obj1 = ((Object) (list.iterator()));
	//   50  114:aload_1         
	//   51  115:invokeinterface #289 <Method Iterator List.iterator()>
	//   52  120:astore          6
		boolean flag = false;
	//   53  122:iconst_0        
	//   54  123:istore_2        
_L2:
		eb eb1;
		if(!((Iterator) (obj1)).hasNext())
			break; /* Loop/switch isn't completed */
	//   55  124:aload           6
	//   56  126:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   57  131:ifeq            257
		eb1 = (eb)((Iterator) (obj1)).next();
	//   58  134:aload           6
	//   59  136:invokeinterface #154 <Method Object Iterator.next()>
	//   60  141:checkcast       #184 <Class eb>
	//   61  144:astore          7
		String s = b;
	//   62  146:getstatic       #40  <Field String b>
	//   63  149:astore          8
		StringBuilder stringbuilder1 = new StringBuilder();
	//   64  151:new             #71  <Class StringBuilder>
	//   65  154:dup             
	//   66  155:invokespecial   #72  <Method void StringBuilder()>
	//   67  158:astore          9
		stringbuilder1.append("Registering triggered action id ");
	//   68  160:aload           9
	//   69  162:ldc2            #291 <String "Registering triggered action id ">
	//   70  165:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   71  168:pop             
		stringbuilder1.append(eb1.b());
	//   72  169:aload           9
	//   73  171:aload           7
	//   74  173:invokeinterface #186 <Method String eb.b()>
	//   75  178:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   76  181:pop             
		AppboyLogger.d(s, stringbuilder1.toString());
	//   77  182:aload           8
	//   78  184:aload           9
	//   79  186:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   80  189:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//   81  192:pop             
		j.put(((Object) (eb1.b())), ((Object) (eb1)));
	//   82  193:aload_0         
	//   83  194:getfield        #113 <Field Map j>
	//   84  197:aload           7
	//   85  199:invokeinterface #186 <Method String eb.b()>
	//   86  204:aload           7
	//   87  206:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   88  211:pop             
		editor.putString(eb1.b(), ((JSONObject)eb1.forJsonPut()).toString());
	//   89  212:aload           5
	//   90  214:aload           7
	//   91  216:invokeinterface #186 <Method String eb.b()>
	//   92  221:aload           7
	//   93  223:invokeinterface #294 <Method Object eb.forJsonPut()>
	//   94  228:checkcast       #174 <Class JSONObject>
	//   95  231:invokevirtual   #295 <Method String JSONObject.toString()>
	//   96  234:invokeinterface #299 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   97  239:pop             
		if(eb1.a(((fb) (fh1))))
	//*  98  240:aload           7
	//*  99  242:aload           4
	//* 100  244:invokeinterface #302 <Method boolean eb.a(fb)>
	//* 101  249:ifeq            124
			flag = true;
	//  102  252:iconst_1        
	//  103  253:istore_2        
		if(true) goto _L2; else goto _L1
	//  104  254:goto            124
_L1:
		editor.apply();
	//  105  257:aload           5
	//  106  259:invokeinterface #305 <Method void android.content.SharedPreferences$Editor.apply()>
		obj;
	//  107  264:aload_3         
		JVM INSTR monitorexit ;
	//  108  265:monitorexit     
		i.a(list);
	//  109  266:aload_0         
	//  110  267:getfield        #108 <Field fn i>
	//  111  270:aload_1         
	//  112  271:invokeinterface #307 <Method void fn.a(List)>
		h.a(list);
	//  113  276:aload_0         
	//  114  277:getfield        #101 <Field fk h>
	//  115  280:aload_1         
	//  116  281:invokeinterface #308 <Method void fk.a(List)>
		if(flag)
	//* 117  286:iload_2         
	//* 118  287:ifeq            307
		{
			AppboyLogger.i(b, "Test triggered actions found, triggering test event.");
	//  119  290:getstatic       #40  <Field String b>
	//  120  293:ldc2            #310 <String "Test triggered actions found, triggering test event.">
	//  121  296:invokestatic    #312 <Method int AppboyLogger.i(String, String)>
	//  122  299:pop             
			a(((fb) (fh1)));
	//  123  300:aload_0         
	//  124  301:aload           4
	//  125  303:invokevirtual   #314 <Method void a(fb)>
			return;
	//  126  306:return          
		} else
		{
			AppboyLogger.d(b, "No test triggered actions found.");
	//  127  307:getstatic       #40  <Field String b>
	//  128  310:ldc2            #316 <String "No test triggered actions found.">
	//  129  313:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//  130  316:pop             
			return;
	//  131  317:return          
		}
		list;
	//  132  318:astore_1        
		obj;
	//  133  319:aload_3         
		JVM INSTR monitorexit ;
	//  134  320:monitorexit     
		throw list;
	//  135  321:aload_1         
	//  136  322:athrow          
	}

	eb b(fb fb1)
	{
		Object obj1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object a>
	//    2    4:astore          9
		obj1;
	//    3    6:aload           9
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		long l1;
		boolean flag1;
		l1 = dl.a() - k;
	//    5    9:invokestatic    #321 <Method long dl.a()>
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field long k>
	//    8   16:lsub            
	//    9   17:lstore          4
		flag1 = fb1 instanceof fh;
	//   10   19:aload_1         
	//   11   20:instanceof      #264 <Class fh>
	//   12   23:istore          6
		boolean flag;
		flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		if(!flag1)
			break MISSING_BLOCK_LABEL_45;
	//   15   27:iload           6
	//   16   29:ifeq            45
		AppboyLogger.d(b, "Ignoring minimum time interval between triggered actions because the trigger event is a test.");
	//   17   32:getstatic       #40  <Field String b>
	//   18   35:ldc2            #323 <String "Ignoring minimum time interval between triggered actions because the trigger event is a test.">
	//   19   38:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//   20   41:pop             
		break MISSING_BLOCK_LABEL_119;
	//   21   42:goto            119
		String s = b;
	//   22   45:getstatic       #40  <Field String b>
	//   23   48:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   24   50:new             #71  <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #72  <Method void StringBuilder()>
	//   27   57:astore          8
		stringbuilder.append(l1);
	//   28   59:aload           8
	//   29   61:lload           4
	//   30   63:invokevirtual   #326 <Method StringBuilder StringBuilder.append(long)>
	//   31   66:pop             
		stringbuilder.append(" seconds have passed since the last trigger action (minimum interval: ");
	//   32   67:aload           8
	//   33   69:ldc2            #328 <String " seconds have passed since the last trigger action (minimum interval: ">
	//   34   72:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   35   75:pop             
		stringbuilder.append(f);
	//   36   76:aload           8
	//   37   78:aload_0         
	//   38   79:getfield        #69  <Field long f>
	//   39   82:invokevirtual   #326 <Method StringBuilder StringBuilder.append(long)>
	//   40   85:pop             
		stringbuilder.append(").");
	//   41   86:aload           8
	//   42   88:ldc2            #330 <String ").">
	//   43   91:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   45   95:aload           7
	//   46   97:aload           8
	//   47   99:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   48  102:invokestatic    #312 <Method int AppboyLogger.i(String, String)>
	//   49  105:pop             
		int l;
		eb eb1;
		Object obj;
		Object obj2;
		StringBuilder stringbuilder2;
		if(l1 < f)
	//*  50  106:lload           4
	//*  51  108:aload_0         
	//*  52  109:getfield        #69  <Field long f>
	//*  53  112:lcmp            
	//*  54  113:iflt            639
	//*  55  116:goto            119
	//*  56  119:aload_0         
	//*  57  120:getfield        #113 <Field Map j>
	//*  58  123:invokeinterface #334 <Method Collection Map.values()>
	//*  59  128:invokeinterface #337 <Method Iterator Collection.iterator()>
	//*  60  133:astore          10
	//*  61  135:ldc2            #338 <Int 0x80000000>
	//*  62  138:istore_3        
	//*  63  139:aconst_null     
	//*  64  140:astore          7
	//*  65  142:aload           10
	//*  66  144:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  67  149:ifeq            280
	//*  68  152:aload           10
	//*  69  154:invokeinterface #154 <Method Object Iterator.next()>
	//*  70  159:checkcast       #184 <Class eb>
	//*  71  162:astore          8
	//*  72  164:aload           8
	//*  73  166:aload_1         
	//*  74  167:invokeinterface #302 <Method boolean eb.a(fb)>
	//*  75  172:ifeq            142
	//*  76  175:aload_0         
	//*  77  176:getfield        #108 <Field fn i>
	//*  78  179:aload           8
	//*  79  181:invokeinterface #341 <Method boolean fn.a(eb)>
	//*  80  186:ifeq            142
	//*  81  189:getstatic       #40  <Field String b>
	//*  82  192:astore          11
	//*  83  194:new             #71  <Class StringBuilder>
	//*  84  197:dup             
	//*  85  198:invokespecial   #72  <Method void StringBuilder()>
	//*  86  201:astore          12
	//*  87  203:aload           12
	//*  88  205:ldc2            #343 <String "Found potential triggered action for incoming trigger event. Action id ">
	//*  89  208:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  90  211:pop             
	//*  91  212:aload           12
	//*  92  214:aload           8
	//*  93  216:invokeinterface #186 <Method String eb.b()>
	//*  94  221:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  95  224:pop             
	//*  96  225:aload           12
	//*  97  227:ldc2            #345 <String ".">
	//*  98  230:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  99  233:pop             
	//* 100  234:aload           11
	//* 101  236:aload           12
	//* 102  238:invokevirtual   #88  <Method String StringBuilder.toString()>
	//* 103  241:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//* 104  244:pop             
	//* 105  245:aload           8
	//* 106  247:invokeinterface #226 <Method ev eb.c()>
	//* 107  252:astore          11
	//* 108  254:aload           11
	//* 109  256:invokeinterface #347 <Method int ev.c()>
	//* 110  261:iload_3         
	//* 111  262:icmple          142
	//* 112  265:aload           11
	//* 113  267:invokeinterface #347 <Method int ev.c()>
	//* 114  272:istore_3        
	//* 115  273:aload           8
	//* 116  275:astore          7
	//* 117  277:goto            142
	//* 118  280:aload           7
	//* 119  282:ifnull          573
	//* 120  285:getstatic       #40  <Field String b>
	//* 121  288:astore          10
	//* 122  290:new             #71  <Class StringBuilder>
	//* 123  293:dup             
	//* 124  294:invokespecial   #72  <Method void StringBuilder()>
	//* 125  297:astore          11
	//* 126  299:aload           11
	//* 127  301:ldc2            #349 <String "Found best triggered action for incoming trigger event ">
	//* 128  304:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 129  307:pop             
	//* 130  308:aload_1         
	//* 131  309:invokeinterface #352 <Method bu fb.e()>
	//* 132  314:ifnull          644
	//* 133  317:aload_1         
	//* 134  318:invokeinterface #352 <Method bu fb.e()>
	//* 135  323:invokeinterface #355 <Method Object bu.forJsonPut()>
	//* 136  328:checkcast       #174 <Class JSONObject>
	//* 137  331:invokestatic    #360 <Method String dt.a(JSONObject)>
	//* 138  334:astore          8
	//* 139  336:goto            339
	//* 140  339:aload           11
	//* 141  341:aload           8
	//* 142  343:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 143  346:pop             
	//* 144  347:aload           11
	//* 145  349:ldc2            #362 <String ". Matched Action id: ">
	//* 146  352:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 147  355:pop             
	//* 148  356:aload           11
	//* 149  358:aload           7
	//* 150  360:invokeinterface #186 <Method String eb.b()>
	//* 151  365:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 152  368:pop             
	//* 153  369:aload           11
	//* 154  371:ldc2            #345 <String ".">
	//* 155  374:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 156  377:pop             
	//* 157  378:aload           10
	//* 158  380:aload           11
	//* 159  382:invokevirtual   #88  <Method String StringBuilder.toString()>
	//* 160  385:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//* 161  388:pop             
	//* 162  389:iload_2         
	//* 163  390:ifeq            406
	//* 164  393:getstatic       #40  <Field String b>
	//* 165  396:ldc2            #364 <String "Minimum time interval requirement met for matched trigger.">
	//* 166  399:invokestatic    #312 <Method int AppboyLogger.i(String, String)>
	//* 167  402:pop             
	//* 168  403:goto            493
	//* 169  406:aload           7
	//* 170  408:invokeinterface #226 <Method ev eb.c()>
	//* 171  413:invokeinterface #366 <Method int ev.g()>
	//* 172  418:iconst_m1       
	//* 173  419:icmple          509
	//* 174  422:aload           7
	//* 175  424:invokeinterface #226 <Method ev eb.c()>
	//* 176  429:invokeinterface #366 <Method int ev.g()>
	//* 177  434:i2l             
	//* 178  435:lload           4
	//* 179  437:lcmp            
	//* 180  438:ifgt            509
	//* 181  441:getstatic       #40  <Field String b>
	//* 182  444:astore          8
	//* 183  446:new             #71  <Class StringBuilder>
	//* 184  449:dup             
	//* 185  450:invokespecial   #72  <Method void StringBuilder()>
	//* 186  453:astore          10
	//* 187  455:aload           10
	//* 188  457:ldc2            #368 <String "Triggered action override time interval requirement met: ">
	//* 189  460:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 190  463:pop             
	//* 191  464:aload           10
	//* 192  466:aload           7
	//* 193  468:invokeinterface #226 <Method ev eb.c()>
	//* 194  473:invokeinterface #366 <Method int ev.g()>
	//* 195  478:invokevirtual   #286 <Method StringBuilder StringBuilder.append(int)>
	//* 196  481:pop             
	//* 197  482:aload           8
	//* 198  484:aload           10
	//* 199  486:invokevirtual   #88  <Method String StringBuilder.toString()>
	//* 200  489:invokestatic    #312 <Method int AppboyLogger.i(String, String)>
	//* 201  492:pop             
	//* 202  493:aload_0         
	//* 203  494:aload_1         
	//* 204  495:invokeinterface #256 <Method long fb.c()>
	//* 205  500:putfield        #47  <Field long k>
	//* 206  503:aload           9
	//* 207  505:monitorexit     
	//* 208  506:aload           7
	//* 209  508:areturn         
	//* 210  509:getstatic       #40  <Field String b>
	//* 211  512:astore_1        
	//* 212  513:new             #71  <Class StringBuilder>
	//* 213  516:dup             
	//* 214  517:invokespecial   #72  <Method void StringBuilder()>
	//* 215  520:astore          8
	//* 216  522:aload           8
	//* 217  524:ldc2            #370 <String "Minimum time interval requirement and triggered action override time interval requirement of ">
	//* 218  527:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 219  530:pop             
	//* 220  531:aload           8
	//* 221  533:aload           7
	//* 222  535:invokeinterface #226 <Method ev eb.c()>
	//* 223  540:invokeinterface #366 <Method int ev.g()>
	//* 224  545:invokevirtual   #286 <Method StringBuilder StringBuilder.append(int)>
	//* 225  548:pop             
	//* 226  549:aload           8
	//* 227  551:ldc2            #372 <String " not met for matched trigger. Returning null.">
	//* 228  554:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 229  557:pop             
	//* 230  558:aload_1         
	//* 231  559:aload           8
	//* 232  561:invokevirtual   #88  <Method String StringBuilder.toString()>
	//* 233  564:invokestatic    #312 <Method int AppboyLogger.i(String, String)>
	//* 234  567:pop             
	//* 235  568:aload           9
	//* 236  570:monitorexit     
	//* 237  571:aconst_null     
	//* 238  572:areturn         
	//* 239  573:getstatic       #40  <Field String b>
	//* 240  576:astore          7
	//* 241  578:new             #71  <Class StringBuilder>
	//* 242  581:dup             
	//* 243  582:invokespecial   #72  <Method void StringBuilder()>
	//* 244  585:astore          8
	//* 245  587:aload           8
	//* 246  589:ldc2            #374 <String "Failed to match triggered action for incoming <">
	//* 247  592:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 248  595:pop             
	//* 249  596:aload           8
	//* 250  598:aload_1         
	//* 251  599:invokeinterface #211 <Method String fb.b()>
	//* 252  604:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 253  607:pop             
	//* 254  608:aload           8
	//* 255  610:ldc2            #376 <String ">.">
	//* 256  613:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 257  616:pop             
	//* 258  617:aload           7
	//* 259  619:aload           8
	//* 260  621:invokevirtual   #88  <Method String StringBuilder.toString()>
	//* 261  624:invokestatic    #196 <Method int AppboyLogger.d(String, String)>
	//* 262  627:pop             
	//* 263  628:aload           9
	//* 264  630:monitorexit     
	//* 265  631:aconst_null     
	//* 266  632:areturn         
	//* 267  633:astore_1        
	//* 268  634:aload           9
	//* 269  636:monitorexit     
	//* 270  637:aload_1         
	//* 271  638:athrow          
			flag = false;
	//  272  639:iconst_0        
	//  273  640:istore_2        
		obj2 = ((Object) (j.values().iterator()));
		l = 0x80000000;
		eb1 = null;
_L2:
		if(!((Iterator) (obj2)).hasNext())
			break; /* Loop/switch isn't completed */
		obj = ((Object) ((eb)((Iterator) (obj2)).next()));
		if(!((eb) (obj)).a(fb1) || !i.a(((eb) (obj))))
			continue; /* Loop/switch isn't completed */
		Object obj3 = ((Object) (b));
		StringBuilder stringbuilder3 = new StringBuilder();
		stringbuilder3.append("Found potential triggered action for incoming trigger event. Action id ");
		stringbuilder3.append(((eb) (obj)).b());
		stringbuilder3.append(".");
		AppboyLogger.d(((String) (obj3)), stringbuilder3.toString());
		obj3 = ((Object) (((eb) (obj)).c()));
		if(((ev) (obj3)).c() <= l)
			continue; /* Loop/switch isn't completed */
		l = ((ev) (obj3)).c();
		eb1 = ((eb) (obj));
		if(true) goto _L2; else goto _L1
_L1:
		if(eb1 == null) goto _L4; else goto _L3
_L3:
		obj2 = ((Object) (b));
		stringbuilder2 = new StringBuilder();
		stringbuilder2.append("Found best triggered action for incoming trigger event ");
		if(fb1.e() == null) goto _L6; else goto _L5
_L5:
		obj = ((Object) (dt.a((JSONObject)fb1.e().forJsonPut())));
_L8:
		stringbuilder2.append(((String) (obj)));
		stringbuilder2.append(". Matched Action id: ");
		stringbuilder2.append(eb1.b());
		stringbuilder2.append(".");
		AppboyLogger.d(((String) (obj2)), stringbuilder2.toString());
		if(!flag)
			break MISSING_BLOCK_LABEL_406;
		AppboyLogger.i(b, "Minimum time interval requirement met for matched trigger.");
		break MISSING_BLOCK_LABEL_493;
		if(eb1.c().g() <= -1 || (long)eb1.c().g() > l1)
			break MISSING_BLOCK_LABEL_509;
		obj = ((Object) (b));
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Triggered action override time interval requirement met: ");
		stringbuilder1.append(eb1.c().g());
		AppboyLogger.i(((String) (obj)), stringbuilder1.toString());
		k = fb1.c();
		obj1;
		JVM INSTR monitorexit ;
		return eb1;
		fb1 = ((fb) (b));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Minimum time interval requirement and triggered action override time interval requirement of ");
		((StringBuilder) (obj)).append(eb1.c().g());
		((StringBuilder) (obj)).append(" not met for matched trigger. Returning null.");
		AppboyLogger.i(((String) (fb1)), ((StringBuilder) (obj)).toString());
		obj1;
		JVM INSTR monitorexit ;
		return null;
_L4:
		String s1 = b;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Failed to match triggered action for incoming <");
		((StringBuilder) (obj)).append(fb1.b());
		((StringBuilder) (obj)).append(">.");
		AppboyLogger.d(s1, ((StringBuilder) (obj)).toString());
		obj1;
		JVM INSTR monitorexit ;
		return null;
		fb1;
		obj1;
		JVM INSTR monitorexit ;
		throw fb1;
	//* 274  641:goto            119
_L6:
		obj = "";
	//  275  644:ldc2            #378 <String "">
	//  276  647:astore          8
		if(true) goto _L8; else goto _L7
	//  277  649:goto            339
_L7:
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/fp);
	public final Object a = new Object();
	private final Context c;
	private final bl d;
	private final aa e;
	private final long f;
	private final SharedPreferences g;
	private final fk h;
	private final fn i;
	private Map j;
	private volatile long k;

	static 
	{
	//    0    0:ldc1            #2   <Class fp>
	//    1    2:invokestatic    #38  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #40  <Field String b>
	//*   3    8:return          
	}
}
