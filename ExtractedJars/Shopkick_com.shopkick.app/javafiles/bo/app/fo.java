// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Process;
import com.appboy.support.*;
import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package bo.app:
//			fk, eb, fr, ez

public class fo
	implements fk
{

	public fo(Context context, ThreadPoolExecutor threadpoolexecutor, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		f = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #37  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void HashMap()>
	//    6   12:putfield        #40  <Field Map f>
		b = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #42  <Field Context b>
		c = threadpoolexecutor;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #44  <Field ThreadPoolExecutor c>
		threadpoolexecutor = ((ThreadPoolExecutor) (new StringBuilder()));
	//   13   25:new             #46  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #47  <Method void StringBuilder()>
	//   16   32:astore_2        
		((StringBuilder) (threadpoolexecutor)).append("com.appboy.storage.triggers.local_assets.");
	//   17   33:aload_2         
	//   18   34:ldc1            #49  <String "com.appboy.storage.triggers.local_assets.">
	//   19   36:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		((StringBuilder) (threadpoolexecutor)).append(s);
	//   21   40:aload_2         
	//   22   41:aload_3         
	//   23   42:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		d = context.getSharedPreferences(((StringBuilder) (threadpoolexecutor)).toString(), 0);
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:aload_2         
	//   28   49:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   29   52:iconst_0        
	//   30   53:invokevirtual   #63  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   31   56:putfield        #65  <Field SharedPreferences d>
		e = a();
	//   32   59:aload_0         
	//   33   60:aload_0         
	//   34   61:invokevirtual   #68  <Method Map a()>
	//   35   64:putfield        #70  <Field Map e>
	//   36   67:return          
	}

	static Map a(fo fo1)
	{
		return fo1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Map e>
	//    2    4:areturn         
	}

	public static void a(Context context)
	{
		context = ((Context) (new File(context.getCacheDir(), "ab_triggers")));
	//    0    0:new             #74  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #78  <Method File Context.getCacheDir()>
	//    4    8:ldc1            #80  <String "ab_triggers">
	//    5   10:invokespecial   #83  <Method void File(File, String)>
	//    6   13:astore_0        
		String s = a;
	//    7   14:getstatic       #30  <Field String a>
	//    8   17:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #46  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #47  <Method void StringBuilder()>
	//   12   25:astore_2        
		stringbuilder.append("Deleting triggers directory at: ");
	//   13   26:aload_2         
	//   14   27:ldc1            #85  <String "Deleting triggers directory at: ">
	//   15   29:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((File) (context)).getAbsolutePath());
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #88  <Method String File.getAbsolutePath()>
	//   20   38:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #92  <Method int AppboyLogger.v(String, String)>
	//   26   50:pop             
		AppboyFileUtils.deleteFileOrDirectory(((File) (context)));
	//   27   51:aload_0         
	//   28   52:invokestatic    #98  <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
	//   29   55:return          
	}

	static String c()
	{
		return a;
	//    0    0:getstatic       #30  <Field String a>
	//    1    3:areturn         
	}

	public String a(eb eb1)
	{
		if(!eb1.a())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #104 <Method boolean eb.a()>
	//*   2    6:ifne            20
		{
			AppboyLogger.d(a, "Prefetch turned off for this triggered action. Not retrieving local asset path.");
	//    3    9:getstatic       #30  <Field String a>
	//    4   12:ldc1            #106 <String "Prefetch turned off for this triggered action. Not retrieving local asset path.">
	//    5   14:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//    6   17:pop             
			return null;
	//    7   18:aconst_null     
	//    8   19:areturn         
		}
		eb1 = ((eb) (eb1.d()));
	//    9   20:aload_1         
	//   10   21:invokeinterface #111 <Method fr eb.d()>
	//   11   26:astore_1        
		if(eb1 == null)
	//*  12   27:aload_1         
	//*  13   28:ifnonnull       42
		{
			AppboyLogger.i(a, "Remote path was null or blank. Not retrieving local asset path.");
	//   14   31:getstatic       #30  <Field String a>
	//   15   34:ldc1            #113 <String "Remote path was null or blank. Not retrieving local asset path.">
	//   16   36:invokestatic    #116 <Method int AppboyLogger.i(String, String)>
	//   17   39:pop             
			return null;
	//   18   40:aconst_null     
	//   19   41:areturn         
		}
		eb1 = ((eb) (((fr) (eb1)).b()));
	//   20   42:aload_1         
	//   21   43:invokevirtual   #120 <Method String fr.b()>
	//   22   46:astore_1        
		if(StringUtils.isNullOrBlank(((String) (eb1))))
	//*  23   47:aload_1         
	//*  24   48:invokestatic    #126 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  25   51:ifeq            65
		{
			AppboyLogger.w(a, "Remote asset path string was null or blank. Not retrieving local asset path.");
	//   26   54:getstatic       #30  <Field String a>
	//   27   57:ldc1            #128 <String "Remote asset path string was null or blank. Not retrieving local asset path.">
	//   28   59:invokestatic    #131 <Method int AppboyLogger.w(String, String)>
	//   29   62:pop             
			return null;
	//   30   63:aconst_null     
	//   31   64:areturn         
		}
		if(e.containsKey(((Object) (eb1))))
	//*  32   65:aload_0         
	//*  33   66:getfield        #70  <Field Map e>
	//*  34   69:aload_1         
	//*  35   70:invokeinterface #137 <Method boolean Map.containsKey(Object)>
	//*  36   75:ifeq            194
		{
			String s = (String)e.get(((Object) (eb1)));
	//   37   78:aload_0         
	//   38   79:getfield        #70  <Field Map e>
	//   39   82:aload_1         
	//   40   83:invokeinterface #141 <Method Object Map.get(Object)>
	//   41   88:checkcast       #143 <Class String>
	//   42   91:astore_2        
			if(!(new File(s)).exists())
	//*  43   92:new             #74  <Class File>
	//*  44   95:dup             
	//*  45   96:aload_2         
	//*  46   97:invokespecial   #146 <Method void File(String)>
	//*  47  100:invokevirtual   #149 <Method boolean File.exists()>
	//*  48  103:ifne            142
			{
				s = a;
	//   49  106:getstatic       #30  <Field String a>
	//   50  109:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   51  110:new             #46  <Class StringBuilder>
	//   52  113:dup             
	//   53  114:invokespecial   #47  <Method void StringBuilder()>
	//   54  117:astore_3        
				stringbuilder.append("Local asset for remote asset path did not exist: ");
	//   55  118:aload_3         
	//   56  119:ldc1            #151 <String "Local asset for remote asset path did not exist: ">
	//   57  121:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   58  124:pop             
				stringbuilder.append(((String) (eb1)));
	//   59  125:aload_3         
	//   60  126:aload_1         
	//   61  127:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   62  130:pop             
				AppboyLogger.w(s, stringbuilder.toString());
	//   63  131:aload_2         
	//   64  132:aload_3         
	//   65  133:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   66  136:invokestatic    #131 <Method int AppboyLogger.w(String, String)>
	//   67  139:pop             
				return null;
	//   68  140:aconst_null     
	//   69  141:areturn         
			} else
			{
				String s2 = a;
	//   70  142:getstatic       #30  <Field String a>
	//   71  145:astore_3        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   72  146:new             #46  <Class StringBuilder>
	//   73  149:dup             
	//   74  150:invokespecial   #47  <Method void StringBuilder()>
	//   75  153:astore          4
				stringbuilder2.append("Retrieving local asset path for remote asset path: ");
	//   76  155:aload           4
	//   77  157:ldc1            #153 <String "Retrieving local asset path for remote asset path: ">
	//   78  159:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   79  162:pop             
				stringbuilder2.append(((String) (eb1)));
	//   80  163:aload           4
	//   81  165:aload_1         
	//   82  166:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   83  169:pop             
				AppboyLogger.i(s2, stringbuilder2.toString());
	//   84  170:aload_3         
	//   85  171:aload           4
	//   86  173:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   87  176:invokestatic    #116 <Method int AppboyLogger.i(String, String)>
	//   88  179:pop             
				f.put(((Object) (eb1)), ((Object) (s)));
	//   89  180:aload_0         
	//   90  181:getfield        #40  <Field Map f>
	//   91  184:aload_1         
	//   92  185:aload_2         
	//   93  186:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   94  191:pop             
				return s;
	//   95  192:aload_2         
	//   96  193:areturn         
			}
		} else
		{
			String s1 = a;
	//   97  194:getstatic       #30  <Field String a>
	//   98  197:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   99  198:new             #46  <Class StringBuilder>
	//  100  201:dup             
	//  101  202:invokespecial   #47  <Method void StringBuilder()>
	//  102  205:astore_3        
			stringbuilder1.append("No local asset path found for remote asset path: ");
	//  103  206:aload_3         
	//  104  207:ldc1            #159 <String "No local asset path found for remote asset path: ">
	//  105  209:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  106  212:pop             
			stringbuilder1.append(((String) (eb1)));
	//  107  213:aload_3         
	//  108  214:aload_1         
	//  109  215:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  110  218:pop             
			AppboyLogger.w(s1, stringbuilder1.toString());
	//  111  219:aload_2         
	//  112  220:aload_3         
	//  113  221:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  114  224:invokestatic    #131 <Method int AppboyLogger.w(String, String)>
	//  115  227:pop             
			return null;
	//  116  228:aconst_null     
	//  117  229:areturn         
		}
	}

	String a(fr fr1)
	{
		Object obj = ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method File b()>
	//    2    4:astore_3        
		String s = fr1.b();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #120 <Method String fr.b()>
	//    5    9:astore_2        
		if(fr1.a().equals(((Object) (ez.a))))
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #165 <Method ez fr.a()>
	//*   8   14:getstatic       #170 <Field ez ez.a>
	//*   9   17:invokevirtual   #173 <Method boolean ez.equals(Object)>
	//*  10   20:ifeq            134
		{
			fr1 = ((fr) (WebContentUtils.getLocalHtmlUrlFromRemoteUrl(((File) (obj)), s)));
	//   11   23:aload_3         
	//   12   24:aload_2         
	//   13   25:invokestatic    #179 <Method String WebContentUtils.getLocalHtmlUrlFromRemoteUrl(File, String)>
	//   14   28:astore_1        
			if(!StringUtils.isNullOrBlank(((String) (fr1))))
	//*  15   29:aload_1         
	//*  16   30:invokestatic    #126 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   33:ifne            91
			{
				obj = ((Object) (a));
	//   18   36:getstatic       #30  <Field String a>
	//   19   39:astore_3        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   20   40:new             #46  <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #47  <Method void StringBuilder()>
	//   23   47:astore          4
				stringbuilder1.append("Storing local triggered action html zip asset at local path ");
	//   24   49:aload           4
	//   25   51:ldc1            #181 <String "Storing local triggered action html zip asset at local path ">
	//   26   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
				stringbuilder1.append(((String) (fr1)));
	//   28   57:aload           4
	//   29   59:aload_1         
	//   30   60:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
				stringbuilder1.append(" for remote path ");
	//   32   64:aload           4
	//   33   66:ldc1            #183 <String " for remote path ">
	//   34   68:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
				stringbuilder1.append(s);
	//   36   72:aload           4
	//   37   74:aload_2         
	//   38   75:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
				AppboyLogger.i(((String) (obj)), stringbuilder1.toString());
	//   40   79:aload_3         
	//   41   80:aload           4
	//   42   82:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   43   85:invokestatic    #116 <Method int AppboyLogger.i(String, String)>
	//   44   88:pop             
				return ((String) (fr1));
	//   45   89:aload_1         
	//   46   90:areturn         
			} else
			{
				fr1 = ((fr) (a));
	//   47   91:getstatic       #30  <Field String a>
	//   48   94:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   49   95:new             #46  <Class StringBuilder>
	//   50   98:dup             
	//   51   99:invokespecial   #47  <Method void StringBuilder()>
	//   52  102:astore_3        
				((StringBuilder) (obj)).append("Failed to store html zip asset for remote path ");
	//   53  103:aload_3         
	//   54  104:ldc1            #185 <String "Failed to store html zip asset for remote path ">
	//   55  106:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   56  109:pop             
				((StringBuilder) (obj)).append(s);
	//   57  110:aload_3         
	//   58  111:aload_2         
	//   59  112:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   60  115:pop             
				((StringBuilder) (obj)).append(". Not storing local asset");
	//   61  116:aload_3         
	//   62  117:ldc1            #187 <String ". Not storing local asset">
	//   63  119:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   64  122:pop             
				AppboyLogger.d(((String) (fr1)), ((StringBuilder) (obj)).toString());
	//   65  123:aload_1         
	//   66  124:aload_3         
	//   67  125:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   68  128:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//   69  131:pop             
				return null;
	//   70  132:aconst_null     
	//   71  133:areturn         
			}
		}
		fr1 = ((fr) (Integer.toString(IntentUtils.getRequestCode())));
	//   72  134:invokestatic    #193 <Method int IntentUtils.getRequestCode()>
	//   73  137:invokestatic    #198 <Method String Integer.toString(int)>
	//   74  140:astore_1        
		fr1 = ((fr) (AppboyFileUtils.downloadFileToPath(((File) (obj)).toString(), s, ((String) (fr1)), ((String) (null)))));
	//   75  141:aload_3         
	//   76  142:invokevirtual   #199 <Method String File.toString()>
	//   77  145:aload_2         
	//   78  146:aload_1         
	//   79  147:aconst_null     
	//   80  148:invokestatic    #203 <Method File AppboyFileUtils.downloadFileToPath(String, String, String, String)>
	//   81  151:astore_1        
		if(fr1 != null)
	//*  82  152:aload_1         
	//*  83  153:ifnull          269
		{
			fr1 = ((fr) (Uri.fromFile(((File) (fr1)))));
	//   84  156:aload_1         
	//   85  157:invokestatic    #209 <Method Uri Uri.fromFile(File)>
	//   86  160:astore_1        
			if(fr1 != null)
	//*  87  161:aload_1         
	//*  88  162:ifnull          226
			{
				String s1 = a;
	//   89  165:getstatic       #30  <Field String a>
	//   90  168:astore_3        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   91  169:new             #46  <Class StringBuilder>
	//   92  172:dup             
	//   93  173:invokespecial   #47  <Method void StringBuilder()>
	//   94  176:astore          4
				stringbuilder2.append("Storing local triggered action image asset at local path ");
	//   95  178:aload           4
	//   96  180:ldc1            #211 <String "Storing local triggered action image asset at local path ">
	//   97  182:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   98  185:pop             
				stringbuilder2.append(((Uri) (fr1)).getPath());
	//   99  186:aload           4
	//  100  188:aload_1         
	//  101  189:invokevirtual   #214 <Method String Uri.getPath()>
	//  102  192:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  103  195:pop             
				stringbuilder2.append(" for remote path ");
	//  104  196:aload           4
	//  105  198:ldc1            #183 <String " for remote path ">
	//  106  200:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  107  203:pop             
				stringbuilder2.append(s);
	//  108  204:aload           4
	//  109  206:aload_2         
	//  110  207:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  111  210:pop             
				AppboyLogger.i(s1, stringbuilder2.toString());
	//  112  211:aload_3         
	//  113  212:aload           4
	//  114  214:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  115  217:invokestatic    #116 <Method int AppboyLogger.i(String, String)>
	//  116  220:pop             
				return ((Uri) (fr1)).getPath();
	//  117  221:aload_1         
	//  118  222:invokevirtual   #214 <Method String Uri.getPath()>
	//  119  225:areturn         
			} else
			{
				fr1 = ((fr) (a));
	//  120  226:getstatic       #30  <Field String a>
	//  121  229:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//  122  230:new             #46  <Class StringBuilder>
	//  123  233:dup             
	//  124  234:invokespecial   #47  <Method void StringBuilder()>
	//  125  237:astore_3        
				stringbuilder.append("Failed to store image asset for remote path ");
	//  126  238:aload_3         
	//  127  239:ldc1            #216 <String "Failed to store image asset for remote path ">
	//  128  241:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  129  244:pop             
				stringbuilder.append(s);
	//  130  245:aload_3         
	//  131  246:aload_2         
	//  132  247:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  133  250:pop             
				stringbuilder.append(". Not storing local asset");
	//  134  251:aload_3         
	//  135  252:ldc1            #187 <String ". Not storing local asset">
	//  136  254:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  137  257:pop             
				AppboyLogger.d(((String) (fr1)), stringbuilder.toString());
	//  138  258:aload_1         
	//  139  259:aload_3         
	//  140  260:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  141  263:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  142  266:pop             
				return null;
	//  143  267:aconst_null     
	//  144  268:areturn         
			}
		} else
		{
			return null;
	//  145  269:aconst_null     
	//  146  270:areturn         
		}
	}

	Map a()
	{
		ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap();
	//    0    0:new             #220 <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void ConcurrentHashMap()>
	//    3    7:astore_1        
		Object obj = ((Object) (d.getAll()));
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field SharedPreferences d>
	//    6   12:invokeinterface #226 <Method Map SharedPreferences.getAll()>
	//    7   17:astore_2        
		if(obj != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          197
		{
			if(((Map) (obj)).size() == 0)
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #229 <Method int Map.size()>
	//*  12   28:ifne            33
				return ((Map) (concurrenthashmap));
	//   13   31:aload_1         
	//   14   32:areturn         
			obj = ((Object) (((Map) (obj)).keySet()));
	//   15   33:aload_2         
	//   16   34:invokeinterface #233 <Method Set Map.keySet()>
	//   17   39:astore_2        
			if(obj != null)
	//*  18   40:aload_2         
	//*  19   41:ifnull          195
			{
				if(((Set) (obj)).size() == 0)
	//*  20   44:aload_2         
	//*  21   45:invokeinterface #236 <Method int Set.size()>
	//*  22   50:ifne            55
					return ((Map) (concurrenthashmap));
	//   23   53:aload_1         
	//   24   54:areturn         
				try
				{
					obj = ((Object) (((Set) (obj)).iterator()));
	//   25   55:aload_2         
	//   26   56:invokeinterface #240 <Method Iterator Set.iterator()>
	//   27   61:astore_2        
					do
					{
						if(!((Iterator) (obj)).hasNext())
							break;
	//   28   62:aload_2         
	//   29   63:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            193
						String s = (String)((Iterator) (obj)).next();
	//   31   71:aload_2         
	//   32   72:invokeinterface #249 <Method Object Iterator.next()>
	//   33   77:checkcast       #143 <Class String>
	//   34   80:astore_3        
						String s1 = d.getString(s, ((String) (null)));
	//   35   81:aload_0         
	//   36   82:getfield        #65  <Field SharedPreferences d>
	//   37   85:aload_3         
	//   38   86:aconst_null     
	//   39   87:invokeinterface #253 <Method String SharedPreferences.getString(String, String)>
	//   40   92:astore          4
						if(!StringUtils.isNullOrBlank(s1))
	//*  41   94:aload           4
	//*  42   96:invokestatic    #126 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  43   99:ifne            62
						{
							String s2 = a;
	//   44  102:getstatic       #30  <Field String a>
	//   45  105:astore          5
							StringBuilder stringbuilder = new StringBuilder();
	//   46  107:new             #46  <Class StringBuilder>
	//   47  110:dup             
	//   48  111:invokespecial   #47  <Method void StringBuilder()>
	//   49  114:astore          6
							stringbuilder.append("Retrieving trigger local asset path ");
	//   50  116:aload           6
	//   51  118:ldc1            #255 <String "Retrieving trigger local asset path ">
	//   52  120:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   53  123:pop             
							stringbuilder.append(s1);
	//   54  124:aload           6
	//   55  126:aload           4
	//   56  128:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   57  131:pop             
							stringbuilder.append(" from local storage for remote path ");
	//   58  132:aload           6
	//   59  134:ldc2            #257 <String " from local storage for remote path ">
	//   60  137:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   61  140:pop             
							stringbuilder.append(s);
	//   62  141:aload           6
	//   63  143:aload_3         
	//   64  144:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   65  147:pop             
							stringbuilder.append(".");
	//   66  148:aload           6
	//   67  150:ldc2            #259 <String ".">
	//   68  153:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   69  156:pop             
							AppboyLogger.d(s2, stringbuilder.toString());
	//   70  157:aload           5
	//   71  159:aload           6
	//   72  161:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   73  164:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//   74  167:pop             
							((Map) (concurrenthashmap)).put(((Object) (s)), ((Object) (s1)));
	//   75  168:aload_1         
	//   76  169:aload_3         
	//   77  170:aload           4
	//   78  172:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   79  177:pop             
						}
					} while(true);
	//   80  178:goto            62
				}
				catch(Exception exception)
	//*  81  181:astore_2        
				{
					AppboyLogger.e(a, "Encountered unexpected exception while parsing stored triggered action local assets.", ((Throwable) (exception)));
	//   82  182:getstatic       #30  <Field String a>
	//   83  185:ldc2            #261 <String "Encountered unexpected exception while parsing stored triggered action local assets.">
	//   84  188:aload_2         
	//   85  189:invokestatic    #264 <Method int AppboyLogger.e(String, String, Throwable)>
	//   86  192:pop             
				}
				return ((Map) (concurrenthashmap));
	//   87  193:aload_1         
	//   88  194:areturn         
			} else
			{
				return ((Map) (concurrenthashmap));
	//   89  195:aload_1         
	//   90  196:areturn         
			}
		} else
		{
			return ((Map) (concurrenthashmap));
	//   91  197:aload_1         
	//   92  198:areturn         
		}
	}

	public void a(List list)
	{
		HashSet hashset;
		hashset = new HashSet();
	//    0    0:new             #269 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #270 <Method void HashSet()>
	//    3    7:astore          4
		HashSet hashset1 = new HashSet();
	//    4    9:new             #269 <Class HashSet>
	//    5   12:dup             
	//    6   13:invokespecial   #270 <Method void HashSet()>
	//    7   16:astore          5
		list = ((List) (list.iterator()));
	//    8   18:aload_1         
	//    9   19:invokeinterface #273 <Method Iterator List.iterator()>
	//   10   24:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   25:aload_1         
	//   12   26:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            261
			eb eb1 = (eb)((Iterator) (list)).next();
	//   14   34:aload_1         
	//   15   35:invokeinterface #249 <Method Object Iterator.next()>
	//   16   40:checkcast       #101 <Class eb>
	//   17   43:astore          6
			fr fr1 = eb1.d();
	//   18   45:aload           6
	//   19   47:invokeinterface #111 <Method fr eb.d()>
	//   20   52:astore          7
			if(fr1 != null && !StringUtils.isNullOrBlank(fr1.b()))
	//*  21   54:aload           7
	//*  22   56:ifnull          25
	//*  23   59:aload           7
	//*  24   61:invokevirtual   #120 <Method String fr.b()>
	//*  25   64:invokestatic    #126 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  26   67:ifne            25
				if(eb1.a())
	//*  27   70:aload           6
	//*  28   72:invokeinterface #104 <Method boolean eb.a()>
	//*  29   77:ifeq            182
				{
					String s2 = a;
	//   30   80:getstatic       #30  <Field String a>
	//   31   83:astore          8
					StringBuilder stringbuilder2 = new StringBuilder();
	//   32   85:new             #46  <Class StringBuilder>
	//   33   88:dup             
	//   34   89:invokespecial   #47  <Method void StringBuilder()>
	//   35   92:astore          9
					stringbuilder2.append("Received new remote path for triggered action ");
	//   36   94:aload           9
	//   37   96:ldc2            #275 <String "Received new remote path for triggered action ">
	//   38   99:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   39  102:pop             
					stringbuilder2.append(eb1.b());
	//   40  103:aload           9
	//   41  105:aload           6
	//   42  107:invokeinterface #276 <Method String eb.b()>
	//   43  112:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   44  115:pop             
					stringbuilder2.append(" at ");
	//   45  116:aload           9
	//   46  118:ldc2            #278 <String " at ">
	//   47  121:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   48  124:pop             
					stringbuilder2.append(fr1.b());
	//   49  125:aload           9
	//   50  127:aload           7
	//   51  129:invokevirtual   #120 <Method String fr.b()>
	//   52  132:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   53  135:pop             
					stringbuilder2.append(".");
	//   54  136:aload           9
	//   55  138:ldc2            #259 <String ".">
	//   56  141:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   57  144:pop             
					AppboyLogger.d(s2, stringbuilder2.toString());
	//   58  145:aload           8
	//   59  147:aload           9
	//   60  149:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   61  152:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//   62  155:pop             
					((Set) (hashset)).add(((Object) (fr1)));
	//   63  156:aload           4
	//   64  158:aload           7
	//   65  160:invokeinterface #281 <Method boolean Set.add(Object)>
	//   66  165:pop             
					((Set) (hashset1)).add(((Object) (fr1.b())));
	//   67  166:aload           5
	//   68  168:aload           7
	//   69  170:invokevirtual   #120 <Method String fr.b()>
	//   70  173:invokeinterface #281 <Method boolean Set.add(Object)>
	//   71  178:pop             
				} else
	//*  72  179:goto            25
				{
					String s3 = a;
	//   73  182:getstatic       #30  <Field String a>
	//   74  185:astore          8
					StringBuilder stringbuilder3 = new StringBuilder();
	//   75  187:new             #46  <Class StringBuilder>
	//   76  190:dup             
	//   77  191:invokespecial   #47  <Method void StringBuilder()>
	//   78  194:astore          9
					stringbuilder3.append("Pre-fetch off for triggered action ");
	//   79  196:aload           9
	//   80  198:ldc2            #283 <String "Pre-fetch off for triggered action ">
	//   81  201:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   82  204:pop             
					stringbuilder3.append(eb1.b());
	//   83  205:aload           9
	//   84  207:aload           6
	//   85  209:invokeinterface #276 <Method String eb.b()>
	//   86  214:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   87  217:pop             
					stringbuilder3.append(". Not pre-fetching assets at remote path ");
	//   88  218:aload           9
	//   89  220:ldc2            #285 <String ". Not pre-fetching assets at remote path ">
	//   90  223:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   91  226:pop             
					stringbuilder3.append(fr1.b());
	//   92  227:aload           9
	//   93  229:aload           7
	//   94  231:invokevirtual   #120 <Method String fr.b()>
	//   95  234:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   96  237:pop             
					stringbuilder3.append(".");
	//   97  238:aload           9
	//   98  240:ldc2            #259 <String ".">
	//   99  243:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  100  246:pop             
					AppboyLogger.d(s3, stringbuilder3.toString());
	//  101  247:aload           8
	//  102  249:aload           9
	//  103  251:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  104  254:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  105  257:pop             
				}
		} while(true);
	//  106  258:goto            25
		list = ((List) (d.edit()));
	//  107  261:aload_0         
	//  108  262:getfield        #65  <Field SharedPreferences d>
	//  109  265:invokeinterface #289 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  110  270:astore_1        
		Iterator iterator = ((Set) (new HashSet(((java.util.Collection) (e.keySet()))))).iterator();
	//  111  271:new             #269 <Class HashSet>
	//  112  274:dup             
	//  113  275:aload_0         
	//  114  276:getfield        #70  <Field Map e>
	//  115  279:invokeinterface #233 <Method Set Map.keySet()>
	//  116  284:invokespecial   #292 <Method void HashSet(java.util.Collection)>
	//  117  287:invokeinterface #240 <Method Iterator Set.iterator()>
	//  118  292:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//  119  294:aload           6
	//  120  296:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//  121  301:ifeq            516
			String s1 = (String)iterator.next();
	//  122  304:aload           6
	//  123  306:invokeinterface #249 <Method Object Iterator.next()>
	//  124  311:checkcast       #143 <Class String>
	//  125  314:astore          7
			if(f.containsKey(((Object) (s1))))
	//* 126  316:aload_0         
	//* 127  317:getfield        #40  <Field Map f>
	//* 128  320:aload           7
	//* 129  322:invokeinterface #137 <Method boolean Map.containsKey(Object)>
	//* 130  327:ifeq            384
			{
				String s4 = a;
	//  131  330:getstatic       #30  <Field String a>
	//  132  333:astore          8
				StringBuilder stringbuilder4 = new StringBuilder();
	//  133  335:new             #46  <Class StringBuilder>
	//  134  338:dup             
	//  135  339:invokespecial   #47  <Method void StringBuilder()>
	//  136  342:astore          9
				stringbuilder4.append("Not removing local path for remote path ");
	//  137  344:aload           9
	//  138  346:ldc2            #294 <String "Not removing local path for remote path ">
	//  139  349:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  140  352:pop             
				stringbuilder4.append(s1);
	//  141  353:aload           9
	//  142  355:aload           7
	//  143  357:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  144  360:pop             
				stringbuilder4.append(" from cache because it is being preserved until the end of the app run.");
	//  145  361:aload           9
	//  146  363:ldc2            #296 <String " from cache because it is being preserved until the end of the app run.">
	//  147  366:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  148  369:pop             
				AppboyLogger.d(s4, stringbuilder4.toString());
	//  149  370:aload           8
	//  150  372:aload           9
	//  151  374:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  152  377:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  153  380:pop             
			} else
	//* 154  381:goto            294
			if(!((Set) (hashset1)).contains(((Object) (s1))))
	//* 155  384:aload           5
	//* 156  386:aload           7
	//* 157  388:invokeinterface #299 <Method boolean Set.contains(Object)>
	//* 158  393:ifne            294
			{
				String s5 = (String)e.get(((Object) (s1)));
	//  159  396:aload_0         
	//  160  397:getfield        #70  <Field Map e>
	//  161  400:aload           7
	//  162  402:invokeinterface #141 <Method Object Map.get(Object)>
	//  163  407:checkcast       #143 <Class String>
	//  164  410:astore          8
				String s7 = a;
	//  165  412:getstatic       #30  <Field String a>
	//  166  415:astore          9
				StringBuilder stringbuilder6 = new StringBuilder();
	//  167  417:new             #46  <Class StringBuilder>
	//  168  420:dup             
	//  169  421:invokespecial   #47  <Method void StringBuilder()>
	//  170  424:astore          10
				stringbuilder6.append("Removing obsolete local path ");
	//  171  426:aload           10
	//  172  428:ldc2            #301 <String "Removing obsolete local path ">
	//  173  431:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  174  434:pop             
				stringbuilder6.append(s5);
	//  175  435:aload           10
	//  176  437:aload           8
	//  177  439:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  178  442:pop             
				stringbuilder6.append(" for obsolete remote path ");
	//  179  443:aload           10
	//  180  445:ldc2            #303 <String " for obsolete remote path ">
	//  181  448:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  182  451:pop             
				stringbuilder6.append(s1);
	//  183  452:aload           10
	//  184  454:aload           7
	//  185  456:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  186  459:pop             
				stringbuilder6.append(" from cache.");
	//  187  460:aload           10
	//  188  462:ldc2            #305 <String " from cache.">
	//  189  465:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  190  468:pop             
				AppboyLogger.d(s7, stringbuilder6.toString());
	//  191  469:aload           9
	//  192  471:aload           10
	//  193  473:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  194  476:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  195  479:pop             
				e.remove(((Object) (s1)));
	//  196  480:aload_0         
	//  197  481:getfield        #70  <Field Map e>
	//  198  484:aload           7
	//  199  486:invokeinterface #308 <Method Object Map.remove(Object)>
	//  200  491:pop             
				((android.content.SharedPreferences.Editor) (list)).remove(s1);
	//  201  492:aload_1         
	//  202  493:aload           7
	//  203  495:invokeinterface #313 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//  204  500:pop             
				AppboyFileUtils.deleteFileOrDirectory(new File(s5));
	//  205  501:new             #74  <Class File>
	//  206  504:dup             
	//  207  505:aload           8
	//  208  507:invokespecial   #146 <Method void File(String)>
	//  209  510:invokestatic    #98  <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
			}
		} while(true);
	//  210  513:goto            294
		((android.content.SharedPreferences.Editor) (list)).apply();
	//  211  516:aload_1         
	//  212  517:invokeinterface #316 <Method void android.content.SharedPreferences$Editor.apply()>
		File afile[] = b().listFiles();
	//  213  522:aload_0         
	//  214  523:invokevirtual   #162 <Method File b()>
	//  215  526:invokevirtual   #320 <Method File[] File.listFiles()>
	//  216  529:astore          5
		if(afile == null) goto _L2; else goto _L1
	//  217  531:aload           5
	//  218  533:ifnull          773
_L1:
		int j = afile.length;
	//  219  536:aload           5
	//  220  538:arraylength     
	//  221  539:istore_3        
		int i = 0;
	//  222  540:iconst_0        
	//  223  541:istore_2        
_L3:
		Object obj;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//  224  542:iload_2         
	//  225  543:iload_3         
	//  226  544:icmpge          773
		obj = ((Object) (afile[i]));
	//  227  547:aload           5
	//  228  549:iload_2         
	//  229  550:aaload          
	//  230  551:astore          7
		String s = ((File) (obj)).getPath();
	//  231  553:aload           7
	//  232  555:invokevirtual   #321 <Method String File.getPath()>
	//  233  558:astore          6
		if(!e.containsValue(((Object) (s))))
	//* 234  560:aload_0         
	//* 235  561:getfield        #70  <Field Map e>
	//* 236  564:aload           6
	//* 237  566:invokeinterface #324 <Method boolean Map.containsValue(Object)>
	//* 238  571:ifne            701
		{
			if(!f.containsValue(((Object) (s))))
	//* 239  574:aload_0         
	//* 240  575:getfield        #40  <Field Map f>
	//* 241  578:aload           6
	//* 242  580:invokeinterface #324 <Method boolean Map.containsValue(Object)>
	//* 243  585:ifne            647
			{
				String s6 = a;
	//  244  588:getstatic       #30  <Field String a>
	//  245  591:astore          8
				StringBuilder stringbuilder5 = new StringBuilder();
	//  246  593:new             #46  <Class StringBuilder>
	//  247  596:dup             
	//  248  597:invokespecial   #47  <Method void StringBuilder()>
	//  249  600:astore          9
				stringbuilder5.append("Deleting obsolete asset ");
	//  250  602:aload           9
	//  251  604:ldc2            #326 <String "Deleting obsolete asset ">
	//  252  607:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  253  610:pop             
				stringbuilder5.append(s);
	//  254  611:aload           9
	//  255  613:aload           6
	//  256  615:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  257  618:pop             
				stringbuilder5.append(" from filesystem.");
	//  258  619:aload           9
	//  259  621:ldc2            #328 <String " from filesystem.">
	//  260  624:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  261  627:pop             
				AppboyLogger.d(s6, stringbuilder5.toString());
	//  262  628:aload           8
	//  263  630:aload           9
	//  264  632:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  265  635:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  266  638:pop             
				AppboyFileUtils.deleteFileOrDirectory(((File) (obj)));
	//  267  639:aload           7
	//  268  641:invokestatic    #98  <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
				break MISSING_BLOCK_LABEL_752;
	//  269  644:goto            752
			}
			StringBuilder stringbuilder1;
			try
			{
				obj = ((Object) (a));
	//  270  647:getstatic       #30  <Field String a>
	//  271  650:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//  272  652:new             #46  <Class StringBuilder>
	//  273  655:dup             
	//  274  656:invokespecial   #47  <Method void StringBuilder()>
	//  275  659:astore          8
				stringbuilder.append("Asset ");
	//  276  661:aload           8
	//  277  663:ldc2            #330 <String "Asset ">
	//  278  666:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  279  669:pop             
				stringbuilder.append(s);
	//  280  670:aload           8
	//  281  672:aload           6
	//  282  674:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  283  677:pop             
				stringbuilder.append(" is being preserved. Not deleting.");
	//  284  678:aload           8
	//  285  680:ldc2            #332 <String " is being preserved. Not deleting.">
	//  286  683:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  287  686:pop             
				AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//  288  687:aload           7
	//  289  689:aload           8
	//  290  691:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  291  694:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  292  697:pop             
				break MISSING_BLOCK_LABEL_752;
	//  293  698:goto            752
			}
	//* 294  701:getstatic       #30  <Field String a>
	//* 295  704:astore          7
	//* 296  706:new             #46  <Class StringBuilder>
	//* 297  709:dup             
	//* 298  710:invokespecial   #47  <Method void StringBuilder()>
	//* 299  713:astore          8
	//* 300  715:aload           8
	//* 301  717:ldc2            #330 <String "Asset ">
	//* 302  720:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 303  723:pop             
	//* 304  724:aload           8
	//* 305  726:aload           6
	//* 306  728:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 307  731:pop             
	//* 308  732:aload           8
	//* 309  734:ldc2            #334 <String " is not obsolete. Not deleting.">
	//* 310  737:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 311  740:pop             
	//* 312  741:aload           7
	//* 313  743:aload           8
	//* 314  745:invokevirtual   #57  <Method String StringBuilder.toString()>
	//* 315  748:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//* 316  751:pop             
	//* 317  752:iload_2         
	//* 318  753:iconst_1        
	//* 319  754:iadd            
	//* 320  755:istore_2        
	//* 321  756:goto            542
			catch(Exception exception)
	//* 322  759:astore          5
			{
				AppboyLogger.d(a, "Exception while deleting obsolete assets from filesystem.", ((Throwable) (exception)));
	//  323  761:getstatic       #30  <Field String a>
	//  324  764:ldc2            #336 <String "Exception while deleting obsolete assets from filesystem.">
	//  325  767:aload           5
	//  326  769:invokestatic    #338 <Method int AppboyLogger.d(String, String, Throwable)>
	//  327  772:pop             
			}
			break; /* Loop/switch isn't completed */
		}
		obj = ((Object) (a));
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Asset ");
		stringbuilder1.append(s);
		stringbuilder1.append(" is not obsolete. Not deleting.");
		AppboyLogger.d(((String) (obj)), stringbuilder1.toString());
		i++;
		if(true) goto _L3; else goto _L2
_L2:
		list = ((List) (new Runnable(((Set) (hashset)), ((android.content.SharedPreferences.Editor) (list))) {

			public void run()
			{
				Process.setThreadPriority(10);
			//    0    0:bipush          10
			//    1    2:invokestatic    #37  <Method void Process.setThreadPriority(int)>
				Iterator iterator1 = a.iterator();
			//    2    5:aload_0         
			//    3    6:getfield        #22  <Field Set a>
			//    4    9:invokeinterface #43  <Method Iterator Set.iterator()>
			//    5   14:astore_1        
				do
				{
					if(!iterator1.hasNext())
						break;
			//    6   15:aload_1         
			//    7   16:invokeinterface #49  <Method boolean Iterator.hasNext()>
			//    8   21:ifeq            217
					Object obj1 = ((Object) ((fr)iterator1.next()));
			//    9   24:aload_1         
			//   10   25:invokeinterface #53  <Method Object Iterator.next()>
			//   11   30:checkcast       #55  <Class fr>
			//   12   33:astore_3        
					String s8 = ((fr) (obj1)).b();
			//   13   34:aload_3         
			//   14   35:invokevirtual   #58  <Method String fr.b()>
			//   15   38:astore_2        
					if(!fo.a(c).containsKey(((Object) (s8))))
			//*  16   39:aload_0         
			//*  17   40:getfield        #20  <Field fo c>
			//*  18   43:invokestatic    #61  <Method Map fo.a(fo)>
			//*  19   46:aload_2         
			//*  20   47:invokeinterface #67  <Method boolean Map.containsKey(Object)>
			//*  21   52:ifne            15
						try
						{
							obj1 = ((Object) (c.a(((fr) (obj1)))));
			//   22   55:aload_0         
			//   23   56:getfield        #20  <Field fo c>
			//   24   59:aload_3         
			//   25   60:invokevirtual   #70  <Method String fo.a(fr)>
			//   26   63:astore_3        
							if(!StringUtils.isNullOrBlank(((String) (obj1))))
			//*  27   64:aload_3         
			//*  28   65:invokestatic    #76  <Method boolean StringUtils.isNullOrBlank(String)>
			//*  29   68:ifne            15
							{
								String s9 = fo.c();
			//   30   71:invokestatic    #78  <Method String fo.c()>
			//   31   74:astore          4
								StringBuilder stringbuilder7 = new StringBuilder();
			//   32   76:new             #80  <Class StringBuilder>
			//   33   79:dup             
			//   34   80:invokespecial   #81  <Method void StringBuilder()>
			//   35   83:astore          5
								stringbuilder7.append("Adding new local path ");
			//   36   85:aload           5
			//   37   87:ldc1            #83  <String "Adding new local path ">
			//   38   89:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   39   92:pop             
								stringbuilder7.append(((String) (obj1)));
			//   40   93:aload           5
			//   41   95:aload_3         
			//   42   96:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   43   99:pop             
								stringbuilder7.append(" for remote path ");
			//   44  100:aload           5
			//   45  102:ldc1            #89  <String " for remote path ">
			//   46  104:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   47  107:pop             
								stringbuilder7.append(s8);
			//   48  108:aload           5
			//   49  110:aload_2         
			//   50  111:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   51  114:pop             
								stringbuilder7.append(" to cache.");
			//   52  115:aload           5
			//   53  117:ldc1            #91  <String " to cache.">
			//   54  119:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   55  122:pop             
								AppboyLogger.d(s9, stringbuilder7.toString());
			//   56  123:aload           4
			//   57  125:aload           5
			//   58  127:invokevirtual   #94  <Method String StringBuilder.toString()>
			//   59  130:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
			//   60  133:pop             
								fo.a(c).put(((Object) (s8)), obj1);
			//   61  134:aload_0         
			//   62  135:getfield        #20  <Field fo c>
			//   63  138:invokestatic    #61  <Method Map fo.a(fo)>
			//   64  141:aload_2         
			//   65  142:aload_3         
			//   66  143:invokeinterface #104 <Method Object Map.put(Object, Object)>
			//   67  148:pop             
								b.putString(s8, ((String) (obj1)));
			//   68  149:aload_0         
			//   69  150:getfield        #24  <Field android.content.SharedPreferences$Editor b>
			//   70  153:aload_2         
			//   71  154:aload_3         
			//   72  155:invokeinterface #110 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
			//   73  160:pop             
							}
						}
			//*  74  161:goto            15
						catch(Exception exception1)
			//*  75  164:astore_3        
						{
							String s10 = fo.c();
			//   76  165:invokestatic    #78  <Method String fo.c()>
			//   77  168:astore          4
							StringBuilder stringbuilder8 = new StringBuilder();
			//   78  170:new             #80  <Class StringBuilder>
			//   79  173:dup             
			//   80  174:invokespecial   #81  <Method void StringBuilder()>
			//   81  177:astore          5
							stringbuilder8.append("Failed to add new local path for remote path ");
			//   82  179:aload           5
			//   83  181:ldc1            #112 <String "Failed to add new local path for remote path ">
			//   84  183:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   85  186:pop             
							stringbuilder8.append(s8);
			//   86  187:aload           5
			//   87  189:aload_2         
			//   88  190:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   89  193:pop             
							stringbuilder8.append(".");
			//   90  194:aload           5
			//   91  196:ldc1            #114 <String ".">
			//   92  198:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
			//   93  201:pop             
							AppboyLogger.d(s10, stringbuilder8.toString(), ((Throwable) (exception1)));
			//   94  202:aload           4
			//   95  204:aload           5
			//   96  206:invokevirtual   #94  <Method String StringBuilder.toString()>
			//   97  209:aload_3         
			//   98  210:invokestatic    #117 <Method int AppboyLogger.d(String, String, Throwable)>
			//   99  213:pop             
						}
				} while(true);
			//  100  214:goto            15
				b.apply();
			//  101  217:aload_0         
			//  102  218:getfield        #24  <Field android.content.SharedPreferences$Editor b>
			//  103  221:invokeinterface #120 <Method void android.content.SharedPreferences$Editor.apply()>
			//  104  226:return          
			}

			final Set a;
			final android.content.SharedPreferences.Editor b;
			final fo c;

			
			{
				c = fo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field fo c>
				a = set;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Set a>
				b = editor;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field android.content.SharedPreferences$Editor b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//  328  773:new             #8   <Class fo$1>
	//  329  776:dup             
	//  330  777:aload_0         
	//  331  778:aload           4
	//  332  780:aload_1         
	//  333  781:invokespecial   #341 <Method void fo$1(fo, Set, android.content.SharedPreferences$Editor)>
	//  334  784:astore_1        
		c.execute(((Runnable) (list)));
	//  335  785:aload_0         
	//  336  786:getfield        #44  <Field ThreadPoolExecutor c>
	//  337  789:aload_1         
	//  338  790:invokevirtual   #347 <Method void ThreadPoolExecutor.execute(Runnable)>
		return;
	//  339  793:return          
	}

	File b()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(b.getCacheDir().getPath());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field Context b>
	//    7   13:invokevirtual   #78  <Method File Context.getCacheDir()>
	//    8   16:invokevirtual   #321 <Method String File.getPath()>
	//    9   19:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append("/");
	//   11   23:aload_1         
	//   12   24:ldc2            #350 <String "/">
	//   13   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append("ab_triggers");
	//   15   31:aload_1         
	//   16   32:ldc1            #80  <String "ab_triggers">
	//   17   34:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		return new File(stringbuilder.toString());
	//   19   38:new             #74  <Class File>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   23   46:invokespecial   #146 <Method void File(String)>
	//   24   49:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/fo);
	private final Context b;
	private final ThreadPoolExecutor c;
	private final SharedPreferences d;
	private Map e;
	private Map f;

	static 
	{
	//    0    0:ldc1            #2   <Class fo>
	//    1    2:invokestatic    #28  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #30  <Field String a>
	//*   3    8:return          
	}
}
