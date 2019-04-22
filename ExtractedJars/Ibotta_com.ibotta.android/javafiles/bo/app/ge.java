// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.appboy.support.*;
import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package bo.app:
//			ga, er, gh, fp

public class ge
	implements ga
{

	public ge(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		e = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void HashMap()>
	//    6   12:putfield        #36  <Field Map e>
		b = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #38  <Field Context b>
		StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #40  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #41  <Method void StringBuilder()>
	//   13   27:astore_3        
		stringbuilder.append("com.appboy.storage.triggers.local_assets.");
	//   14   28:aload_3         
	//   15   29:ldc1            #43  <String "com.appboy.storage.triggers.local_assets.">
	//   16   31:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		stringbuilder.append(s);
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		c = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:aload_3         
	//   25   44:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   26   47:iconst_0        
	//   27   48:invokevirtual   #57  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   28   51:putfield        #59  <Field SharedPreferences c>
		d = a();
	//   29   54:aload_0         
	//   30   55:aload_0         
	//   31   56:invokevirtual   #62  <Method Map a()>
	//   32   59:putfield        #64  <Field Map d>
	//   33   62:return          
	}

	public static void a(Context context)
	{
		context = ((Context) (new File(context.getCacheDir(), "ab_triggers")));
	//    0    0:new             #67  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #71  <Method File Context.getCacheDir()>
	//    4    8:ldc1            #73  <String "ab_triggers">
	//    5   10:invokespecial   #76  <Method void File(File, String)>
	//    6   13:astore_0        
		String s = a;
	//    7   14:getstatic       #26  <Field String a>
	//    8   17:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #40  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #41  <Method void StringBuilder()>
	//   12   25:astore_2        
		stringbuilder.append("Deleting triggers directory at: ");
	//   13   26:aload_2         
	//   14   27:ldc1            #78  <String "Deleting triggers directory at: ">
	//   15   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((File) (context)).getAbsolutePath());
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #81  <Method String File.getAbsolutePath()>
	//   20   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #85  <Method int AppboyLogger.v(String, String)>
	//   26   50:pop             
		AppboyFileUtils.deleteFileOrDirectory(((File) (context)));
	//   27   51:aload_0         
	//   28   52:invokestatic    #91  <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
	//   29   55:return          
	}

	private static void a(List list, Set set, Set set1)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #98  <Method Iterator List.iterator()>
	//    2    6:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    3    7:aload_0         
	//    4    8:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            230
			er er1 = (er)((Iterator) (list)).next();
	//    6   16:aload_0         
	//    7   17:invokeinterface #108 <Method Object Iterator.next()>
	//    8   22:checkcast       #110 <Class er>
	//    9   25:astore_3        
			gh gh1 = er1.d();
	//   10   26:aload_3         
	//   11   27:invokeinterface #113 <Method gh er.d()>
	//   12   32:astore          4
			if(gh1 != null && !StringUtils.isNullOrBlank(gh1.b()))
	//*  13   34:aload           4
	//*  14   36:ifnull          7
	//*  15   39:aload           4
	//*  16   41:invokevirtual   #117 <Method String gh.b()>
	//*  17   44:invokestatic    #123 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  18   47:ifne            7
				if(er1.a())
	//*  19   50:aload_3         
	//*  20   51:invokeinterface #125 <Method boolean er.a()>
	//*  21   56:ifeq            155
				{
					String s = a;
	//   22   59:getstatic       #26  <Field String a>
	//   23   62:astore          5
					StringBuilder stringbuilder = new StringBuilder();
	//   24   64:new             #40  <Class StringBuilder>
	//   25   67:dup             
	//   26   68:invokespecial   #41  <Method void StringBuilder()>
	//   27   71:astore          6
					stringbuilder.append("Received new remote path for triggered action ");
	//   28   73:aload           6
	//   29   75:ldc1            #127 <String "Received new remote path for triggered action ">
	//   30   77:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   31   80:pop             
					stringbuilder.append(er1.b());
	//   32   81:aload           6
	//   33   83:aload_3         
	//   34   84:invokeinterface #128 <Method String er.b()>
	//   35   89:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   36   92:pop             
					stringbuilder.append(" at ");
	//   37   93:aload           6
	//   38   95:ldc1            #130 <String " at ">
	//   39   97:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   40  100:pop             
					stringbuilder.append(gh1.b());
	//   41  101:aload           6
	//   42  103:aload           4
	//   43  105:invokevirtual   #117 <Method String gh.b()>
	//   44  108:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   45  111:pop             
					stringbuilder.append(".");
	//   46  112:aload           6
	//   47  114:ldc1            #132 <String ".">
	//   48  116:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   49  119:pop             
					AppboyLogger.d(s, stringbuilder.toString());
	//   50  120:aload           5
	//   51  122:aload           6
	//   52  124:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   53  127:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   54  130:pop             
					set.add(((Object) (gh1)));
	//   55  131:aload_1         
	//   56  132:aload           4
	//   57  134:invokeinterface #140 <Method boolean Set.add(Object)>
	//   58  139:pop             
					set1.add(((Object) (gh1.b())));
	//   59  140:aload_2         
	//   60  141:aload           4
	//   61  143:invokevirtual   #117 <Method String gh.b()>
	//   62  146:invokeinterface #140 <Method boolean Set.add(Object)>
	//   63  151:pop             
				} else
	//*  64  152:goto            7
				{
					String s1 = a;
	//   65  155:getstatic       #26  <Field String a>
	//   66  158:astore          5
					StringBuilder stringbuilder1 = new StringBuilder();
	//   67  160:new             #40  <Class StringBuilder>
	//   68  163:dup             
	//   69  164:invokespecial   #41  <Method void StringBuilder()>
	//   70  167:astore          6
					stringbuilder1.append("Pre-fetch off for triggered action ");
	//   71  169:aload           6
	//   72  171:ldc1            #142 <String "Pre-fetch off for triggered action ">
	//   73  173:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   74  176:pop             
					stringbuilder1.append(er1.b());
	//   75  177:aload           6
	//   76  179:aload_3         
	//   77  180:invokeinterface #128 <Method String er.b()>
	//   78  185:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   79  188:pop             
					stringbuilder1.append(". Not pre-fetching assets at remote path ");
	//   80  189:aload           6
	//   81  191:ldc1            #144 <String ". Not pre-fetching assets at remote path ">
	//   82  193:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   83  196:pop             
					stringbuilder1.append(gh1.b());
	//   84  197:aload           6
	//   85  199:aload           4
	//   86  201:invokevirtual   #117 <Method String gh.b()>
	//   87  204:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   88  207:pop             
					stringbuilder1.append(".");
	//   89  208:aload           6
	//   90  210:ldc1            #132 <String ".">
	//   91  212:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   92  215:pop             
					AppboyLogger.d(s1, stringbuilder1.toString());
	//   93  216:aload           5
	//   94  218:aload           6
	//   95  220:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   96  223:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   97  226:pop             
				}
		} while(true);
	//   98  227:goto            7
	//   99  230:return          
	}

	private static void a(Set set, android.content.SharedPreferences.Editor editor, Map map, Map map1)
	{
		Iterator iterator = ((Set) (new HashSet(((java.util.Collection) (map.keySet()))))).iterator();
	//    0    0:new             #149 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokeinterface #155 <Method Set Map.keySet()>
	//    4   10:invokespecial   #158 <Method void HashSet(java.util.Collection)>
	//    5   13:invokeinterface #159 <Method Iterator Set.iterator()>
	//    6   18:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   20:aload           4
	//    8   22:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//    9   27:ifeq            235
			String s = (String)iterator.next();
	//   10   30:aload           4
	//   11   32:invokeinterface #108 <Method Object Iterator.next()>
	//   12   37:checkcast       #161 <Class String>
	//   13   40:astore          5
			if(map1.containsKey(((Object) (s))))
	//*  14   42:aload_3         
	//*  15   43:aload           5
	//*  16   45:invokeinterface #164 <Method boolean Map.containsKey(Object)>
	//*  17   50:ifeq            105
			{
				String s1 = a;
	//   18   53:getstatic       #26  <Field String a>
	//   19   56:astore          6
				StringBuilder stringbuilder = new StringBuilder();
	//   20   58:new             #40  <Class StringBuilder>
	//   21   61:dup             
	//   22   62:invokespecial   #41  <Method void StringBuilder()>
	//   23   65:astore          7
				stringbuilder.append("Not removing local path for remote path ");
	//   24   67:aload           7
	//   25   69:ldc1            #166 <String "Not removing local path for remote path ">
	//   26   71:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   27   74:pop             
				stringbuilder.append(s);
	//   28   75:aload           7
	//   29   77:aload           5
	//   30   79:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   31   82:pop             
				stringbuilder.append(" from cache because it is being preserved until the end of the app run.");
	//   32   83:aload           7
	//   33   85:ldc1            #168 <String " from cache because it is being preserved until the end of the app run.">
	//   34   87:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   35   90:pop             
				AppboyLogger.d(s1, stringbuilder.toString());
	//   36   91:aload           6
	//   37   93:aload           7
	//   38   95:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   39   98:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   40  101:pop             
			} else
	//*  41  102:goto            20
			if(!set.contains(((Object) (s))))
	//*  42  105:aload_0         
	//*  43  106:aload           5
	//*  44  108:invokeinterface #171 <Method boolean Set.contains(Object)>
	//*  45  113:ifne            20
			{
				String s2 = (String)map.get(((Object) (s)));
	//   46  116:aload_2         
	//   47  117:aload           5
	//   48  119:invokeinterface #175 <Method Object Map.get(Object)>
	//   49  124:checkcast       #161 <Class String>
	//   50  127:astore          6
				map.remove(((Object) (s)));
	//   51  129:aload_2         
	//   52  130:aload           5
	//   53  132:invokeinterface #178 <Method Object Map.remove(Object)>
	//   54  137:pop             
				editor.remove(s);
	//   55  138:aload_1         
	//   56  139:aload           5
	//   57  141:invokeinterface #183 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   58  146:pop             
				if(!StringUtils.isNullOrBlank(s2))
	//*  59  147:aload           6
	//*  60  149:invokestatic    #123 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  61  152:ifne            20
				{
					String s3 = a;
	//   62  155:getstatic       #26  <Field String a>
	//   63  158:astore          7
					StringBuilder stringbuilder1 = new StringBuilder();
	//   64  160:new             #40  <Class StringBuilder>
	//   65  163:dup             
	//   66  164:invokespecial   #41  <Method void StringBuilder()>
	//   67  167:astore          8
					stringbuilder1.append("Removing obsolete local path ");
	//   68  169:aload           8
	//   69  171:ldc1            #185 <String "Removing obsolete local path ">
	//   70  173:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   71  176:pop             
					stringbuilder1.append(s2);
	//   72  177:aload           8
	//   73  179:aload           6
	//   74  181:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   75  184:pop             
					stringbuilder1.append(" for obsolete remote path ");
	//   76  185:aload           8
	//   77  187:ldc1            #187 <String " for obsolete remote path ">
	//   78  189:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   79  192:pop             
					stringbuilder1.append(s);
	//   80  193:aload           8
	//   81  195:aload           5
	//   82  197:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   83  200:pop             
					stringbuilder1.append(" from cache.");
	//   84  201:aload           8
	//   85  203:ldc1            #189 <String " from cache.">
	//   86  205:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   87  208:pop             
					AppboyLogger.d(s3, stringbuilder1.toString());
	//   88  209:aload           7
	//   89  211:aload           8
	//   90  213:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   91  216:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   92  219:pop             
					AppboyFileUtils.deleteFileOrDirectory(new File(s2));
	//   93  220:new             #67  <Class File>
	//   94  223:dup             
	//   95  224:aload           6
	//   96  226:invokespecial   #192 <Method void File(String)>
	//   97  229:invokestatic    #91  <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
				}
			}
		} while(true);
	//   98  232:goto            20
		editor.apply();
	//   99  235:aload_1         
	//  100  236:invokeinterface #195 <Method void android.content.SharedPreferences$Editor.apply()>
	//  101  241:return          
	}

	private void c()
	{
		File afile[] = b().listFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method File b()>
	//    2    4:invokevirtual   #204 <Method File[] File.listFiles()>
	//    3    7:astore_3        
		if(afile == null) goto _L2; else goto _L1
	//    4    8:aload_3         
	//    5    9:ifnull          238
_L1:
		int j = afile.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_1        
_L3:
		Object obj;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   11   17:iload_1         
	//   12   18:iload_2         
	//   13   19:icmpge          238
		obj = ((Object) (afile[i]));
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:astore          5
		String s = ((File) (obj)).getPath();
	//   18   27:aload           5
	//   19   29:invokevirtual   #207 <Method String File.getPath()>
	//   20   32:astore          4
		if(!d.containsValue(((Object) (s))))
	//*  21   34:aload_0         
	//*  22   35:getfield        #64  <Field Map d>
	//*  23   38:aload           4
	//*  24   40:invokeinterface #210 <Method boolean Map.containsValue(Object)>
	//*  25   45:ifne            171
		{
			if(!e.containsValue(((Object) (s))))
	//*  26   48:aload_0         
	//*  27   49:getfield        #36  <Field Map e>
	//*  28   52:aload           4
	//*  29   54:invokeinterface #210 <Method boolean Map.containsValue(Object)>
	//*  30   59:ifne            119
			{
				String s1 = a;
	//   31   62:getstatic       #26  <Field String a>
	//   32   65:astore          6
				StringBuilder stringbuilder2 = new StringBuilder();
	//   33   67:new             #40  <Class StringBuilder>
	//   34   70:dup             
	//   35   71:invokespecial   #41  <Method void StringBuilder()>
	//   36   74:astore          7
				stringbuilder2.append("Deleting obsolete asset ");
	//   37   76:aload           7
	//   38   78:ldc1            #212 <String "Deleting obsolete asset ">
	//   39   80:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
				stringbuilder2.append(s);
	//   41   84:aload           7
	//   42   86:aload           4
	//   43   88:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   44   91:pop             
				stringbuilder2.append(" from filesystem.");
	//   45   92:aload           7
	//   46   94:ldc1            #214 <String " from filesystem.">
	//   47   96:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   48   99:pop             
				AppboyLogger.d(s1, stringbuilder2.toString());
	//   49  100:aload           6
	//   50  102:aload           7
	//   51  104:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   52  107:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   53  110:pop             
				AppboyFileUtils.deleteFileOrDirectory(((File) (obj)));
	//   54  111:aload           5
	//   55  113:invokestatic    #91  <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
				break MISSING_BLOCK_LABEL_220;
	//   56  116:goto            220
			}
			StringBuilder stringbuilder1;
			try
			{
				obj = ((Object) (a));
	//   57  119:getstatic       #26  <Field String a>
	//   58  122:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   59  124:new             #40  <Class StringBuilder>
	//   60  127:dup             
	//   61  128:invokespecial   #41  <Method void StringBuilder()>
	//   62  131:astore          6
				stringbuilder.append("Asset ");
	//   63  133:aload           6
	//   64  135:ldc1            #216 <String "Asset ">
	//   65  137:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   66  140:pop             
				stringbuilder.append(s);
	//   67  141:aload           6
	//   68  143:aload           4
	//   69  145:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   70  148:pop             
				stringbuilder.append(" is being preserved. Not deleting.");
	//   71  149:aload           6
	//   72  151:ldc1            #218 <String " is being preserved. Not deleting.">
	//   73  153:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   74  156:pop             
				AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   75  157:aload           5
	//   76  159:aload           6
	//   77  161:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   78  164:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   79  167:pop             
				break MISSING_BLOCK_LABEL_220;
	//   80  168:goto            220
			}
	//*  81  171:getstatic       #26  <Field String a>
	//*  82  174:astore          5
	//*  83  176:new             #40  <Class StringBuilder>
	//*  84  179:dup             
	//*  85  180:invokespecial   #41  <Method void StringBuilder()>
	//*  86  183:astore          6
	//*  87  185:aload           6
	//*  88  187:ldc1            #216 <String "Asset ">
	//*  89  189:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  90  192:pop             
	//*  91  193:aload           6
	//*  92  195:aload           4
	//*  93  197:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  94  200:pop             
	//*  95  201:aload           6
	//*  96  203:ldc1            #220 <String " is not obsolete. Not deleting.">
	//*  97  205:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  98  208:pop             
	//*  99  209:aload           5
	//* 100  211:aload           6
	//* 101  213:invokevirtual   #51  <Method String StringBuilder.toString()>
	//* 102  216:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//* 103  219:pop             
	//* 104  220:iload_1         
	//* 105  221:iconst_1        
	//* 106  222:iadd            
	//* 107  223:istore_1        
	//* 108  224:goto            17
			catch(Exception exception)
	//* 109  227:astore_3        
			{
				AppboyLogger.d(a, "Exception while deleting obsolete assets from filesystem.", ((Throwable) (exception)));
	//  110  228:getstatic       #26  <Field String a>
	//  111  231:ldc1            #222 <String "Exception while deleting obsolete assets from filesystem.">
	//  112  233:aload_3         
	//  113  234:invokestatic    #225 <Method int AppboyLogger.d(String, String, Throwable)>
	//  114  237:pop             
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
	//  115  238:return          
	}

	public String a(er er1)
	{
		if(!er1.a())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #125 <Method boolean er.a()>
	//*   2    6:ifne            20
		{
			AppboyLogger.d(a, "Prefetch turned off for this triggered action. Not retrieving local asset path.");
	//    3    9:getstatic       #26  <Field String a>
	//    4   12:ldc1            #228 <String "Prefetch turned off for this triggered action. Not retrieving local asset path.">
	//    5   14:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//    6   17:pop             
			return null;
	//    7   18:aconst_null     
	//    8   19:areturn         
		}
		er1 = ((er) (er1.d()));
	//    9   20:aload_1         
	//   10   21:invokeinterface #113 <Method gh er.d()>
	//   11   26:astore_1        
		if(er1 == null)
	//*  12   27:aload_1         
	//*  13   28:ifnonnull       42
		{
			AppboyLogger.i(a, "Remote path was null or blank. Not retrieving local asset path.");
	//   14   31:getstatic       #26  <Field String a>
	//   15   34:ldc1            #230 <String "Remote path was null or blank. Not retrieving local asset path.">
	//   16   36:invokestatic    #233 <Method int AppboyLogger.i(String, String)>
	//   17   39:pop             
			return null;
	//   18   40:aconst_null     
	//   19   41:areturn         
		}
		er1 = ((er) (((gh) (er1)).b()));
	//   20   42:aload_1         
	//   21   43:invokevirtual   #117 <Method String gh.b()>
	//   22   46:astore_1        
		if(StringUtils.isNullOrBlank(((String) (er1))))
	//*  23   47:aload_1         
	//*  24   48:invokestatic    #123 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  25   51:ifeq            65
		{
			AppboyLogger.w(a, "Remote asset path string was null or blank. Not retrieving local asset path.");
	//   26   54:getstatic       #26  <Field String a>
	//   27   57:ldc1            #235 <String "Remote asset path string was null or blank. Not retrieving local asset path.">
	//   28   59:invokestatic    #238 <Method int AppboyLogger.w(String, String)>
	//   29   62:pop             
			return null;
	//   30   63:aconst_null     
	//   31   64:areturn         
		}
		if(d.containsKey(((Object) (er1))))
	//*  32   65:aload_0         
	//*  33   66:getfield        #64  <Field Map d>
	//*  34   69:aload_1         
	//*  35   70:invokeinterface #164 <Method boolean Map.containsKey(Object)>
	//*  36   75:ifeq            194
		{
			String s = (String)d.get(((Object) (er1)));
	//   37   78:aload_0         
	//   38   79:getfield        #64  <Field Map d>
	//   39   82:aload_1         
	//   40   83:invokeinterface #175 <Method Object Map.get(Object)>
	//   41   88:checkcast       #161 <Class String>
	//   42   91:astore_2        
			if(!(new File(s)).exists())
	//*  43   92:new             #67  <Class File>
	//*  44   95:dup             
	//*  45   96:aload_2         
	//*  46   97:invokespecial   #192 <Method void File(String)>
	//*  47  100:invokevirtual   #241 <Method boolean File.exists()>
	//*  48  103:ifne            142
			{
				s = a;
	//   49  106:getstatic       #26  <Field String a>
	//   50  109:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   51  110:new             #40  <Class StringBuilder>
	//   52  113:dup             
	//   53  114:invokespecial   #41  <Method void StringBuilder()>
	//   54  117:astore_3        
				stringbuilder.append("Local asset for remote asset path did not exist: ");
	//   55  118:aload_3         
	//   56  119:ldc1            #243 <String "Local asset for remote asset path did not exist: ">
	//   57  121:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   58  124:pop             
				stringbuilder.append(((String) (er1)));
	//   59  125:aload_3         
	//   60  126:aload_1         
	//   61  127:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   62  130:pop             
				AppboyLogger.w(s, stringbuilder.toString());
	//   63  131:aload_2         
	//   64  132:aload_3         
	//   65  133:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   66  136:invokestatic    #238 <Method int AppboyLogger.w(String, String)>
	//   67  139:pop             
				return null;
	//   68  140:aconst_null     
	//   69  141:areturn         
			} else
			{
				String s2 = a;
	//   70  142:getstatic       #26  <Field String a>
	//   71  145:astore_3        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   72  146:new             #40  <Class StringBuilder>
	//   73  149:dup             
	//   74  150:invokespecial   #41  <Method void StringBuilder()>
	//   75  153:astore          4
				stringbuilder2.append("Retrieving local asset path for remote asset path: ");
	//   76  155:aload           4
	//   77  157:ldc1            #245 <String "Retrieving local asset path for remote asset path: ">
	//   78  159:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   79  162:pop             
				stringbuilder2.append(((String) (er1)));
	//   80  163:aload           4
	//   81  165:aload_1         
	//   82  166:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   83  169:pop             
				AppboyLogger.i(s2, stringbuilder2.toString());
	//   84  170:aload_3         
	//   85  171:aload           4
	//   86  173:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   87  176:invokestatic    #233 <Method int AppboyLogger.i(String, String)>
	//   88  179:pop             
				e.put(((Object) (er1)), ((Object) (s)));
	//   89  180:aload_0         
	//   90  181:getfield        #36  <Field Map e>
	//   91  184:aload_1         
	//   92  185:aload_2         
	//   93  186:invokeinterface #249 <Method Object Map.put(Object, Object)>
	//   94  191:pop             
				return s;
	//   95  192:aload_2         
	//   96  193:areturn         
			}
		} else
		{
			String s1 = a;
	//   97  194:getstatic       #26  <Field String a>
	//   98  197:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   99  198:new             #40  <Class StringBuilder>
	//  100  201:dup             
	//  101  202:invokespecial   #41  <Method void StringBuilder()>
	//  102  205:astore_3        
			stringbuilder1.append("No local asset path found for remote asset path: ");
	//  103  206:aload_3         
	//  104  207:ldc1            #251 <String "No local asset path found for remote asset path: ">
	//  105  209:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  106  212:pop             
			stringbuilder1.append(((String) (er1)));
	//  107  213:aload_3         
	//  108  214:aload_1         
	//  109  215:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  110  218:pop             
			AppboyLogger.w(s1, stringbuilder1.toString());
	//  111  219:aload_2         
	//  112  220:aload_3         
	//  113  221:invokevirtual   #51  <Method String StringBuilder.toString()>
	//  114  224:invokestatic    #238 <Method int AppboyLogger.w(String, String)>
	//  115  227:pop             
			return null;
	//  116  228:aconst_null     
	//  117  229:areturn         
		}
	}

	String a(gh gh1)
	{
		Object obj = ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method File b()>
	//    2    4:astore_3        
		String s = gh1.b();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #117 <Method String gh.b()>
	//    5    9:astore_2        
		if(gh1.a().equals(((Object) (fp.a))))
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #255 <Method fp gh.a()>
	//*   8   14:getstatic       #260 <Field fp fp.a>
	//*   9   17:invokevirtual   #263 <Method boolean fp.equals(Object)>
	//*  10   20:ifeq            138
		{
			gh1 = ((gh) (WebContentUtils.getLocalHtmlUrlFromRemoteUrl(((File) (obj)), s)));
	//   11   23:aload_3         
	//   12   24:aload_2         
	//   13   25:invokestatic    #269 <Method String WebContentUtils.getLocalHtmlUrlFromRemoteUrl(File, String)>
	//   14   28:astore_1        
			if(!StringUtils.isNullOrBlank(((String) (gh1))))
	//*  15   29:aload_1         
	//*  16   30:invokestatic    #123 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   33:ifne            93
			{
				obj = ((Object) (a));
	//   18   36:getstatic       #26  <Field String a>
	//   19   39:astore_3        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   20   40:new             #40  <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #41  <Method void StringBuilder()>
	//   23   47:astore          4
				stringbuilder1.append("Storing local triggered action html zip asset at local path ");
	//   24   49:aload           4
	//   25   51:ldc2            #271 <String "Storing local triggered action html zip asset at local path ">
	//   26   54:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
				stringbuilder1.append(((String) (gh1)));
	//   28   58:aload           4
	//   29   60:aload_1         
	//   30   61:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
				stringbuilder1.append(" for remote path ");
	//   32   65:aload           4
	//   33   67:ldc2            #273 <String " for remote path ">
	//   34   70:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
				stringbuilder1.append(s);
	//   36   74:aload           4
	//   37   76:aload_2         
	//   38   77:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
				AppboyLogger.i(((String) (obj)), stringbuilder1.toString());
	//   40   81:aload_3         
	//   41   82:aload           4
	//   42   84:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   43   87:invokestatic    #233 <Method int AppboyLogger.i(String, String)>
	//   44   90:pop             
				return ((String) (gh1));
	//   45   91:aload_1         
	//   46   92:areturn         
			} else
			{
				gh1 = ((gh) (a));
	//   47   93:getstatic       #26  <Field String a>
	//   48   96:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   49   97:new             #40  <Class StringBuilder>
	//   50  100:dup             
	//   51  101:invokespecial   #41  <Method void StringBuilder()>
	//   52  104:astore_3        
				((StringBuilder) (obj)).append("Failed to store html zip asset for remote path ");
	//   53  105:aload_3         
	//   54  106:ldc2            #275 <String "Failed to store html zip asset for remote path ">
	//   55  109:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
				((StringBuilder) (obj)).append(s);
	//   57  113:aload_3         
	//   58  114:aload_2         
	//   59  115:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   60  118:pop             
				((StringBuilder) (obj)).append(". Not storing local asset");
	//   61  119:aload_3         
	//   62  120:ldc2            #277 <String ". Not storing local asset">
	//   63  123:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   64  126:pop             
				AppboyLogger.d(((String) (gh1)), ((StringBuilder) (obj)).toString());
	//   65  127:aload_1         
	//   66  128:aload_3         
	//   67  129:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   68  132:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   69  135:pop             
				return null;
	//   70  136:aconst_null     
	//   71  137:areturn         
			}
		}
		gh1 = ((gh) (Integer.toString(IntentUtils.getRequestCode())));
	//   72  138:invokestatic    #283 <Method int IntentUtils.getRequestCode()>
	//   73  141:invokestatic    #288 <Method String Integer.toString(int)>
	//   74  144:astore_1        
		gh1 = ((gh) (AppboyFileUtils.downloadFileToPath(((File) (obj)).toString(), s, ((String) (gh1)), ((String) (null)))));
	//   75  145:aload_3         
	//   76  146:invokevirtual   #289 <Method String File.toString()>
	//   77  149:aload_2         
	//   78  150:aload_1         
	//   79  151:aconst_null     
	//   80  152:invokestatic    #293 <Method File AppboyFileUtils.downloadFileToPath(String, String, String, String)>
	//   81  155:astore_1        
		if(gh1 != null)
	//*  82  156:aload_1         
	//*  83  157:ifnull          277
		{
			gh1 = ((gh) (Uri.fromFile(((File) (gh1)))));
	//   84  160:aload_1         
	//   85  161:invokestatic    #299 <Method Uri Uri.fromFile(File)>
	//   86  164:astore_1        
			if(gh1 != null)
	//*  87  165:aload_1         
	//*  88  166:ifnull          232
			{
				String s1 = a;
	//   89  169:getstatic       #26  <Field String a>
	//   90  172:astore_3        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   91  173:new             #40  <Class StringBuilder>
	//   92  176:dup             
	//   93  177:invokespecial   #41  <Method void StringBuilder()>
	//   94  180:astore          4
				stringbuilder2.append("Storing local triggered action image asset at local path ");
	//   95  182:aload           4
	//   96  184:ldc2            #301 <String "Storing local triggered action image asset at local path ">
	//   97  187:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   98  190:pop             
				stringbuilder2.append(((Uri) (gh1)).getPath());
	//   99  191:aload           4
	//  100  193:aload_1         
	//  101  194:invokevirtual   #302 <Method String Uri.getPath()>
	//  102  197:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  103  200:pop             
				stringbuilder2.append(" for remote path ");
	//  104  201:aload           4
	//  105  203:ldc2            #273 <String " for remote path ">
	//  106  206:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  107  209:pop             
				stringbuilder2.append(s);
	//  108  210:aload           4
	//  109  212:aload_2         
	//  110  213:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  111  216:pop             
				AppboyLogger.i(s1, stringbuilder2.toString());
	//  112  217:aload_3         
	//  113  218:aload           4
	//  114  220:invokevirtual   #51  <Method String StringBuilder.toString()>
	//  115  223:invokestatic    #233 <Method int AppboyLogger.i(String, String)>
	//  116  226:pop             
				return ((Uri) (gh1)).getPath();
	//  117  227:aload_1         
	//  118  228:invokevirtual   #302 <Method String Uri.getPath()>
	//  119  231:areturn         
			} else
			{
				gh1 = ((gh) (a));
	//  120  232:getstatic       #26  <Field String a>
	//  121  235:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//  122  236:new             #40  <Class StringBuilder>
	//  123  239:dup             
	//  124  240:invokespecial   #41  <Method void StringBuilder()>
	//  125  243:astore_3        
				stringbuilder.append("Failed to store image asset for remote path ");
	//  126  244:aload_3         
	//  127  245:ldc2            #304 <String "Failed to store image asset for remote path ">
	//  128  248:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  129  251:pop             
				stringbuilder.append(s);
	//  130  252:aload_3         
	//  131  253:aload_2         
	//  132  254:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  133  257:pop             
				stringbuilder.append(". Not storing local asset");
	//  134  258:aload_3         
	//  135  259:ldc2            #277 <String ". Not storing local asset">
	//  136  262:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  137  265:pop             
				AppboyLogger.d(((String) (gh1)), stringbuilder.toString());
	//  138  266:aload_1         
	//  139  267:aload_3         
	//  140  268:invokevirtual   #51  <Method String StringBuilder.toString()>
	//  141  271:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//  142  274:pop             
				return null;
	//  143  275:aconst_null     
	//  144  276:areturn         
			}
		} else
		{
			return null;
	//  145  277:aconst_null     
	//  146  278:areturn         
		}
	}

	Map a()
	{
		ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap();
	//    0    0:new             #306 <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #307 <Method void ConcurrentHashMap()>
	//    3    7:astore_1        
		Object obj = ((Object) (c.getAll()));
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field SharedPreferences c>
	//    6   12:invokeinterface #312 <Method Map SharedPreferences.getAll()>
	//    7   17:astore_2        
		if(obj != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          197
		{
			if(((Map) (obj)).size() == 0)
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #315 <Method int Map.size()>
	//*  12   28:ifne            33
				return ((Map) (concurrenthashmap));
	//   13   31:aload_1         
	//   14   32:areturn         
			obj = ((Object) (((Map) (obj)).keySet()));
	//   15   33:aload_2         
	//   16   34:invokeinterface #155 <Method Set Map.keySet()>
	//   17   39:astore_2        
			if(obj != null)
	//*  18   40:aload_2         
	//*  19   41:ifnull          195
			{
				if(((Set) (obj)).size() == 0)
	//*  20   44:aload_2         
	//*  21   45:invokeinterface #316 <Method int Set.size()>
	//*  22   50:ifne            55
					return ((Map) (concurrenthashmap));
	//   23   53:aload_1         
	//   24   54:areturn         
				try
				{
					obj = ((Object) (((Set) (obj)).iterator()));
	//   25   55:aload_2         
	//   26   56:invokeinterface #159 <Method Iterator Set.iterator()>
	//   27   61:astore_2        
					do
					{
						if(!((Iterator) (obj)).hasNext())
							break;
	//   28   62:aload_2         
	//   29   63:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            193
						String s = (String)((Iterator) (obj)).next();
	//   31   71:aload_2         
	//   32   72:invokeinterface #108 <Method Object Iterator.next()>
	//   33   77:checkcast       #161 <Class String>
	//   34   80:astore_3        
						String s1 = c.getString(s, ((String) (null)));
	//   35   81:aload_0         
	//   36   82:getfield        #59  <Field SharedPreferences c>
	//   37   85:aload_3         
	//   38   86:aconst_null     
	//   39   87:invokeinterface #320 <Method String SharedPreferences.getString(String, String)>
	//   40   92:astore          4
						if(!StringUtils.isNullOrBlank(s1))
	//*  41   94:aload           4
	//*  42   96:invokestatic    #123 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  43   99:ifne            62
						{
							String s2 = a;
	//   44  102:getstatic       #26  <Field String a>
	//   45  105:astore          5
							StringBuilder stringbuilder = new StringBuilder();
	//   46  107:new             #40  <Class StringBuilder>
	//   47  110:dup             
	//   48  111:invokespecial   #41  <Method void StringBuilder()>
	//   49  114:astore          6
							stringbuilder.append("Retrieving trigger local asset path ");
	//   50  116:aload           6
	//   51  118:ldc2            #322 <String "Retrieving trigger local asset path ">
	//   52  121:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   53  124:pop             
							stringbuilder.append(s1);
	//   54  125:aload           6
	//   55  127:aload           4
	//   56  129:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   57  132:pop             
							stringbuilder.append(" from local storage for remote path ");
	//   58  133:aload           6
	//   59  135:ldc2            #324 <String " from local storage for remote path ">
	//   60  138:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   61  141:pop             
							stringbuilder.append(s);
	//   62  142:aload           6
	//   63  144:aload_3         
	//   64  145:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   65  148:pop             
							stringbuilder.append(".");
	//   66  149:aload           6
	//   67  151:ldc1            #132 <String ".">
	//   68  153:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   69  156:pop             
							AppboyLogger.d(s2, stringbuilder.toString());
	//   70  157:aload           5
	//   71  159:aload           6
	//   72  161:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   73  164:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   74  167:pop             
							((Map) (concurrenthashmap)).put(((Object) (s)), ((Object) (s1)));
	//   75  168:aload_1         
	//   76  169:aload_3         
	//   77  170:aload           4
	//   78  172:invokeinterface #249 <Method Object Map.put(Object, Object)>
	//   79  177:pop             
						}
					} while(true);
	//   80  178:goto            62
				}
				catch(Exception exception)
	//*  81  181:astore_2        
				{
					AppboyLogger.e(a, "Encountered unexpected exception while parsing stored triggered action local assets.", ((Throwable) (exception)));
	//   82  182:getstatic       #26  <Field String a>
	//   83  185:ldc2            #326 <String "Encountered unexpected exception while parsing stored triggered action local assets.">
	//   84  188:aload_2         
	//   85  189:invokestatic    #328 <Method int AppboyLogger.e(String, String, Throwable)>
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
		Object obj = ((Object) (new HashSet()));
	//    0    0:new             #149 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void HashSet()>
	//    3    7:astore_2        
		HashSet hashset = new HashSet();
	//    4    8:new             #149 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #331 <Method void HashSet()>
	//    7   15:astore_3        
		a(list, ((Set) (obj)), ((Set) (hashset)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokestatic    #333 <Method void a(List, Set, Set)>
		list = ((List) (c.edit()));
	//   12   22:aload_0         
	//   13   23:getfield        #59  <Field SharedPreferences c>
	//   14   26:invokeinterface #337 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   15   31:astore_1        
		a(((Set) (hashset)), ((android.content.SharedPreferences.Editor) (list)), d, e);
	//   16   32:aload_3         
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #64  <Field Map d>
	//   20   38:aload_0         
	//   21   39:getfield        #36  <Field Map e>
	//   22   42:invokestatic    #339 <Method void a(Set, android.content.SharedPreferences$Editor, Map, Map)>
		c();
	//   23   45:aload_0         
	//   24   46:invokespecial   #341 <Method void c()>
		obj = ((Object) (((Set) (obj)).iterator()));
	//   25   49:aload_2         
	//   26   50:invokeinterface #159 <Method Iterator Set.iterator()>
	//   27   55:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   28   56:aload_2         
	//   29   57:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   30   62:ifeq            302
			Object obj1 = ((Object) ((gh)((Iterator) (obj)).next()));
	//   31   65:aload_2         
	//   32   66:invokeinterface #108 <Method Object Iterator.next()>
	//   33   71:checkcast       #115 <Class gh>
	//   34   74:astore          4
			String s = ((gh) (obj1)).b();
	//   35   76:aload           4
	//   36   78:invokevirtual   #117 <Method String gh.b()>
	//   37   81:astore_3        
			if(d.containsKey(((Object) (s))))
	//*  38   82:aload_0         
	//*  39   83:getfield        #64  <Field Map d>
	//*  40   86:aload_3         
	//*  41   87:invokeinterface #164 <Method boolean Map.containsKey(Object)>
	//*  42   92:ifeq            139
			{
				obj1 = ((Object) (a));
	//   43   95:getstatic       #26  <Field String a>
	//   44   98:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   45  100:new             #40  <Class StringBuilder>
	//   46  103:dup             
	//   47  104:invokespecial   #41  <Method void StringBuilder()>
	//   48  107:astore          5
				stringbuilder.append("Local assets already contains remote path string: ");
	//   49  109:aload           5
	//   50  111:ldc2            #343 <String "Local assets already contains remote path string: ">
	//   51  114:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   52  117:pop             
				stringbuilder.append(s);
	//   53  118:aload           5
	//   54  120:aload_3         
	//   55  121:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   56  124:pop             
				AppboyLogger.d(((String) (obj1)), stringbuilder.toString());
	//   57  125:aload           4
	//   58  127:aload           5
	//   59  129:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   60  132:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//   61  135:pop             
			} else
	//*  62  136:goto            56
			{
				try
				{
					obj1 = ((Object) (a(((gh) (obj1)))));
	//   63  139:aload_0         
	//   64  140:aload           4
	//   65  142:invokevirtual   #345 <Method String a(gh)>
	//   66  145:astore          4
					if(!StringUtils.isNullOrBlank(((String) (obj1))))
	//*  67  147:aload           4
	//*  68  149:invokestatic    #123 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  69  152:ifne            56
					{
						String s1 = a;
	//   70  155:getstatic       #26  <Field String a>
	//   71  158:astore          5
						StringBuilder stringbuilder1 = new StringBuilder();
	//   72  160:new             #40  <Class StringBuilder>
	//   73  163:dup             
	//   74  164:invokespecial   #41  <Method void StringBuilder()>
	//   75  167:astore          6
						stringbuilder1.append("Adding new local path ");
	//   76  169:aload           6
	//   77  171:ldc2            #347 <String "Adding new local path ">
	//   78  174:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   79  177:pop             
						stringbuilder1.append(((String) (obj1)));
	//   80  178:aload           6
	//   81  180:aload           4
	//   82  182:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   83  185:pop             
						stringbuilder1.append(" for remote path ");
	//   84  186:aload           6
	//   85  188:ldc2            #273 <String " for remote path ">
	//   86  191:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   87  194:pop             
						stringbuilder1.append(s);
	//   88  195:aload           6
	//   89  197:aload_3         
	//   90  198:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   91  201:pop             
						stringbuilder1.append(" to cache.");
	//   92  202:aload           6
	//   93  204:ldc2            #349 <String " to cache.">
	//   94  207:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   95  210:pop             
						AppboyLogger.d(s1, stringbuilder1.toString());
	//   96  211:aload           5
	//   97  213:aload           6
	//   98  215:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   99  218:invokestatic    #134 <Method int AppboyLogger.d(String, String)>
	//  100  221:pop             
						d.put(((Object) (s)), obj1);
	//  101  222:aload_0         
	//  102  223:getfield        #64  <Field Map d>
	//  103  226:aload_3         
	//  104  227:aload           4
	//  105  229:invokeinterface #249 <Method Object Map.put(Object, Object)>
	//  106  234:pop             
						((android.content.SharedPreferences.Editor) (list)).putString(s, ((String) (obj1)));
	//  107  235:aload_1         
	//  108  236:aload_3         
	//  109  237:aload           4
	//  110  239:invokeinterface #353 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  111  244:pop             
						((android.content.SharedPreferences.Editor) (list)).apply();
	//  112  245:aload_1         
	//  113  246:invokeinterface #195 <Method void android.content.SharedPreferences$Editor.apply()>
					}
				}
	//* 114  251:goto            56
				catch(Exception exception)
	//* 115  254:astore          4
				{
					String s2 = a;
	//  116  256:getstatic       #26  <Field String a>
	//  117  259:astore          5
					StringBuilder stringbuilder2 = new StringBuilder();
	//  118  261:new             #40  <Class StringBuilder>
	//  119  264:dup             
	//  120  265:invokespecial   #41  <Method void StringBuilder()>
	//  121  268:astore          6
					stringbuilder2.append("Failed to add new local path for remote path ");
	//  122  270:aload           6
	//  123  272:ldc2            #355 <String "Failed to add new local path for remote path ">
	//  124  275:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  125  278:pop             
					stringbuilder2.append(s);
	//  126  279:aload           6
	//  127  281:aload_3         
	//  128  282:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  129  285:pop             
					AppboyLogger.e(s2, stringbuilder2.toString(), ((Throwable) (exception)));
	//  130  286:aload           5
	//  131  288:aload           6
	//  132  290:invokevirtual   #51  <Method String StringBuilder.toString()>
	//  133  293:aload           4
	//  134  295:invokestatic    #328 <Method int AppboyLogger.e(String, String, Throwable)>
	//  135  298:pop             
				}
			}
		} while(true);
	//  136  299:goto            56
	//  137  302:return          
	}

	File b()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(b.getCacheDir().getPath());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field Context b>
	//    7   13:invokevirtual   #71  <Method File Context.getCacheDir()>
	//    8   16:invokevirtual   #207 <Method String File.getPath()>
	//    9   19:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append("/");
	//   11   23:aload_1         
	//   12   24:ldc2            #359 <String "/">
	//   13   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append("ab_triggers");
	//   15   31:aload_1         
	//   16   32:ldc1            #73  <String "ab_triggers">
	//   17   34:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		return new File(stringbuilder.toString());
	//   19   38:new             #67  <Class File>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   23   46:invokespecial   #192 <Method void File(String)>
	//   24   49:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ge);
	private final Context b;
	private final SharedPreferences c;
	private Map d;
	private Map e;

	static 
	{
	//    0    0:ldc1            #2   <Class ge>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String a>
	//*   3    8:return          
	}
}
