// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.os.Process;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;

// Referenced classes of package bo.app:
//			fo, fr

class fo$1
	implements Runnable
{

	public void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #37  <Method void Process.setThreadPriority(int)>
		Iterator iterator = a.iterator();
	//    2    5:aload_0         
	//    3    6:getfield        #22  <Field Set a>
	//    4    9:invokeinterface #43  <Method Iterator Set.iterator()>
	//    5   14:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   15:aload_1         
	//    7   16:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//    8   21:ifeq            217
			Object obj = ((Object) ((fr)iterator.next()));
	//    9   24:aload_1         
	//   10   25:invokeinterface #53  <Method Object Iterator.next()>
	//   11   30:checkcast       #55  <Class fr>
	//   12   33:astore_3        
			String s = ((fr) (obj)).b();
	//   13   34:aload_3         
	//   14   35:invokevirtual   #58  <Method String fr.b()>
	//   15   38:astore_2        
			if(!fo.a(c).containsKey(((Object) (s))))
	//*  16   39:aload_0         
	//*  17   40:getfield        #20  <Field fo c>
	//*  18   43:invokestatic    #61  <Method Map fo.a(fo)>
	//*  19   46:aload_2         
	//*  20   47:invokeinterface #67  <Method boolean Map.containsKey(Object)>
	//*  21   52:ifne            15
				try
				{
					obj = ((Object) (c.a(((fr) (obj)))));
	//   22   55:aload_0         
	//   23   56:getfield        #20  <Field fo c>
	//   24   59:aload_3         
	//   25   60:invokevirtual   #70  <Method String fo.a(fr)>
	//   26   63:astore_3        
					if(!StringUtils.isNullOrBlank(((String) (obj))))
	//*  27   64:aload_3         
	//*  28   65:invokestatic    #76  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  29   68:ifne            15
					{
						String s1 = fo.c();
	//   30   71:invokestatic    #78  <Method String fo.c()>
	//   31   74:astore          4
						StringBuilder stringbuilder = new StringBuilder();
	//   32   76:new             #80  <Class StringBuilder>
	//   33   79:dup             
	//   34   80:invokespecial   #81  <Method void StringBuilder()>
	//   35   83:astore          5
						stringbuilder.append("Adding new local path ");
	//   36   85:aload           5
	//   37   87:ldc1            #83  <String "Adding new local path ">
	//   38   89:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   39   92:pop             
						stringbuilder.append(((String) (obj)));
	//   40   93:aload           5
	//   41   95:aload_3         
	//   42   96:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   43   99:pop             
						stringbuilder.append(" for remote path ");
	//   44  100:aload           5
	//   45  102:ldc1            #89  <String " for remote path ">
	//   46  104:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   47  107:pop             
						stringbuilder.append(s);
	//   48  108:aload           5
	//   49  110:aload_2         
	//   50  111:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   51  114:pop             
						stringbuilder.append(" to cache.");
	//   52  115:aload           5
	//   53  117:ldc1            #91  <String " to cache.">
	//   54  119:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   55  122:pop             
						AppboyLogger.d(s1, stringbuilder.toString());
	//   56  123:aload           4
	//   57  125:aload           5
	//   58  127:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   59  130:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   60  133:pop             
						fo.a(c).put(((Object) (s)), obj);
	//   61  134:aload_0         
	//   62  135:getfield        #20  <Field fo c>
	//   63  138:invokestatic    #61  <Method Map fo.a(fo)>
	//   64  141:aload_2         
	//   65  142:aload_3         
	//   66  143:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//   67  148:pop             
						b.putString(s, ((String) (obj)));
	//   68  149:aload_0         
	//   69  150:getfield        #24  <Field android.content.SharedPreferences$Editor b>
	//   70  153:aload_2         
	//   71  154:aload_3         
	//   72  155:invokeinterface #110 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   73  160:pop             
					}
				}
	//*  74  161:goto            15
				catch(Exception exception)
	//*  75  164:astore_3        
				{
					String s2 = fo.c();
	//   76  165:invokestatic    #78  <Method String fo.c()>
	//   77  168:astore          4
					StringBuilder stringbuilder1 = new StringBuilder();
	//   78  170:new             #80  <Class StringBuilder>
	//   79  173:dup             
	//   80  174:invokespecial   #81  <Method void StringBuilder()>
	//   81  177:astore          5
					stringbuilder1.append("Failed to add new local path for remote path ");
	//   82  179:aload           5
	//   83  181:ldc1            #112 <String "Failed to add new local path for remote path ">
	//   84  183:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   85  186:pop             
					stringbuilder1.append(s);
	//   86  187:aload           5
	//   87  189:aload_2         
	//   88  190:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   89  193:pop             
					stringbuilder1.append(".");
	//   90  194:aload           5
	//   91  196:ldc1            #114 <String ".">
	//   92  198:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   93  201:pop             
					AppboyLogger.d(s2, stringbuilder1.toString(), ((Throwable) (exception)));
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
	final android.content.dPreferences.Editor b;
	final fo c;

	fo$1(fo fo1, Set set, android.content.dPreferences.Editor editor)
	{
		c = fo1;
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
