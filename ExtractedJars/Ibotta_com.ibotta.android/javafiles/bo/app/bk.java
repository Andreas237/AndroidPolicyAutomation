// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//			ds, cc, t

public class bk
{

	public bk(ds ds1, ds ds2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean d>
		c = ds1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #34  <Field ds c>
		b = ds2;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #36  <Field ds b>
	//   11   19:return          
	}

	static ds a(bk bk1)
	{
		return bk1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ds c>
	//    2    4:areturn         
	}

	static void a(t t1, ds ds1, ds ds2)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #42  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void HashSet()>
	//    3    7:astore_3        
		cc cc2;
		for(Iterator iterator = ds1.a().iterator(); iterator.hasNext(); t1.a(cc2))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #48  <Method Collection ds.a()>
	//*   6   14:invokeinterface #54  <Method Iterator Collection.iterator()>
	//*   7   19:astore          4
	//*   8   21:aload           4
	//*   9   23:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  10   28:ifeq            109
		{
			cc2 = (cc)iterator.next();
	//   11   31:aload           4
	//   12   33:invokeinterface #64  <Method Object Iterator.next()>
	//   13   38:checkcast       #66  <Class cc>
	//   14   41:astore          5
			String s2 = a;
	//   15   43:getstatic       #24  <Field String a>
	//   16   46:astore          6
			StringBuilder stringbuilder2 = new StringBuilder();
	//   17   48:new             #68  <Class StringBuilder>
	//   18   51:dup             
	//   19   52:invokespecial   #69  <Method void StringBuilder()>
	//   20   55:astore          7
			stringbuilder2.append("Adding event to dispatch from active storage: ");
	//   21   57:aload           7
	//   22   59:ldc1            #71  <String "Adding event to dispatch from active storage: ">
	//   23   61:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   24   64:pop             
			stringbuilder2.append(((Object) (cc2)));
	//   25   65:aload           7
	//   26   67:aload           5
	//   27   69:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   28   72:pop             
			AppboyLogger.v(s2, stringbuilder2.toString());
	//   29   73:aload           6
	//   30   75:aload           7
	//   31   77:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   32   80:invokestatic    #86  <Method int AppboyLogger.v(String, String)>
	//   33   83:pop             
			((Set) (hashset)).add(((Object) (cc2.d())));
	//   34   84:aload_3         
	//   35   85:aload           5
	//   36   87:invokeinterface #88  <Method String cc.d()>
	//   37   92:invokeinterface #94  <Method boolean Set.add(Object)>
	//   38   97:pop             
		}

	//   39   98:aload_0         
	//   40   99:aload           5
	//   41  101:invokeinterface #99  <Method void t.a(cc)>
	//*  42  106:goto            21
		if(ds2 != null)
	//*  43  109:aload_2         
	//*  44  110:ifnull          265
			for(t1 = ((t) (ds2.a().iterator())); ((Iterator) (t1)).hasNext();)
	//*  45  113:aload_2         
	//*  46  114:invokeinterface #48  <Method Collection ds.a()>
	//*  47  119:invokeinterface #54  <Method Iterator Collection.iterator()>
	//*  48  124:astore_0        
	//*  49  125:aload_0         
	//*  50  126:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  51  131:ifeq            265
			{
				cc cc1 = (cc)((Iterator) (t1)).next();
	//   52  134:aload_0         
	//   53  135:invokeinterface #64  <Method Object Iterator.next()>
	//   54  140:checkcast       #66  <Class cc>
	//   55  143:astore          4
				ds2.b(cc1);
	//   56  145:aload_2         
	//   57  146:aload           4
	//   58  148:invokeinterface #101 <Method void ds.b(cc)>
				if(((Set) (hashset)).contains(((Object) (cc1.d()))))
	//*  59  153:aload_3         
	//*  60  154:aload           4
	//*  61  156:invokeinterface #88  <Method String cc.d()>
	//*  62  161:invokeinterface #104 <Method boolean Set.contains(Object)>
	//*  63  166:ifeq            213
				{
					String s = a;
	//   64  169:getstatic       #24  <Field String a>
	//   65  172:astore          5
					StringBuilder stringbuilder = new StringBuilder();
	//   66  174:new             #68  <Class StringBuilder>
	//   67  177:dup             
	//   68  178:invokespecial   #69  <Method void StringBuilder()>
	//   69  181:astore          6
					stringbuilder.append("Event present in both storage providers. Not re-adding to current storage: ");
	//   70  183:aload           6
	//   71  185:ldc1            #106 <String "Event present in both storage providers. Not re-adding to current storage: ">
	//   72  187:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   73  190:pop             
					stringbuilder.append(((Object) (cc1)));
	//   74  191:aload           6
	//   75  193:aload           4
	//   76  195:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   77  198:pop             
					AppboyLogger.d(s, stringbuilder.toString());
	//   78  199:aload           5
	//   79  201:aload           6
	//   80  203:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   81  206:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//   82  209:pop             
				} else
	//*  83  210:goto            125
				{
					String s1 = a;
	//   84  213:getstatic       #24  <Field String a>
	//   85  216:astore          5
					StringBuilder stringbuilder1 = new StringBuilder();
	//   86  218:new             #68  <Class StringBuilder>
	//   87  221:dup             
	//   88  222:invokespecial   #69  <Method void StringBuilder()>
	//   89  225:astore          6
					stringbuilder1.append("Found event in storage from migrated storage provider: ");
	//   90  227:aload           6
	//   91  229:ldc1            #110 <String "Found event in storage from migrated storage provider: ">
	//   92  231:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   93  234:pop             
					stringbuilder1.append(((Object) (cc1)));
	//   94  235:aload           6
	//   95  237:aload           4
	//   96  239:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   97  242:pop             
					AppboyLogger.d(s1, stringbuilder1.toString());
	//   98  243:aload           5
	//   99  245:aload           6
	//  100  247:invokevirtual   #82  <Method String StringBuilder.toString()>
	//  101  250:invokestatic    #108 <Method int AppboyLogger.d(String, String)>
	//  102  253:pop             
					ds1.a(cc1);
	//  103  254:aload_1         
	//  104  255:aload           4
	//  105  257:invokeinterface #111 <Method void ds.a(cc)>
				}
			}

	//* 106  262:goto            125
	//  107  265:return          
	}

	static ds b(bk bk1)
	{
		return bk1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ds b>
	//    2    4:areturn         
	}

	static String b()
	{
		return a;
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:areturn         
	}

	public void a()
	{
		d = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #32  <Field boolean d>
		c.b();
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field ds c>
	//    5    9:invokeinterface #114 <Method void ds.b()>
	//    6   14:return          
	}

	public void a(cc cc1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #68  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #69  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage manager is closed. Not adding event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #116 <String "Storage manager is closed. Not adding event: ">
	//   11   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (cc1)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #119 <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			c.a(cc1);
	//   23   42:aload_0         
	//   24   43:getfield        #34  <Field ds c>
	//   25   46:aload_1         
	//   26   47:invokeinterface #111 <Method void ds.a(cc)>
			return;
	//   27   52:return          
		}
	}

	public void a(Executor executor, t t1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean d>
	//*   2    4:ifeq            17
		{
			AppboyLogger.w(a, "Storage manager is closed. Not starting offline recovery.");
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:ldc1            #122 <String "Storage manager is closed. Not starting offline recovery.">
	//    5   12:invokestatic    #119 <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		} else
		{
			executor.execute(new Runnable(t1) {

				public void run()
				{
					AppboyLogger.d(bk.b(), "Started offline AppboyEvent recovery task.");
				//    0    0:invokestatic    #28  <Method String bk.b()>
				//    1    3:ldc1            #30  <String "Started offline AppboyEvent recovery task.">
				//    2    5:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
				//    3    8:pop             
					bk.a(a, bk.a(b), bk.b(b));
				//    4    9:aload_0         
				//    5   10:getfield        #20  <Field t a>
				//    6   13:aload_0         
				//    7   14:getfield        #18  <Field bk b>
				//    8   17:invokestatic    #39  <Method ds bk.a(bk)>
				//    9   20:aload_0         
				//   10   21:getfield        #18  <Field bk b>
				//   11   24:invokestatic    #41  <Method ds bk.b(bk)>
				//   12   27:invokestatic    #44  <Method void bk.a(t, ds, ds)>
				//   13   30:return          
				}

				final t a;
				final bk b;

			
			{
				b = bk.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bk b>
				a = t1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field t a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   17:aload_1         
	//    9   18:new             #6   <Class bk$1>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:invokespecial   #125 <Method void bk$1(bk, t)>
	//   14   27:invokeinterface #131 <Method void Executor.execute(Runnable)>
			return;
	//   15   32:return          
		}
	}

	public void b(cc cc1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #68  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #69  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage manager is closed. Not deleting event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #133 <String "Storage manager is closed. Not deleting event: ">
	//   11   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (cc1)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #119 <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			c.b(cc1);
	//   23   42:aload_0         
	//   24   43:getfield        #34  <Field ds c>
	//   25   46:aload_1         
	//   26   47:invokeinterface #101 <Method void ds.b(cc)>
			return;
	//   27   52:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bk);
	private final ds b;
	private final ds c;
	private boolean d;

	static 
	{
	//    0    0:ldc1            #2   <Class bk>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String a>
	//*   3    8:return          
	}
}
