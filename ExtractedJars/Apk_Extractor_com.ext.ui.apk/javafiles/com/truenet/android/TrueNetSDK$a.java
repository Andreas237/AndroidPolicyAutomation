// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.ab;
import android.support.v7.ae;
import android.support.v7.af;
import android.support.v7.an;
import android.support.v7.br;
import android.support.v7.g;
import android.support.v7.v;
import android.support.v7.w;
import android.util.Log;
import com.startapp.common.b.a;
import com.startapp.common.c.b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK, LinksData, Link, c, 
//			a, DeviceInfo, ValidationResults, b, 
//			RedirectsResult, ValidationResult

public static final class TrueNetSDK$a
{

	public static final String a(TrueNetSDK$a truenetsdk$a, Context context)
	{
		return truenetsdk$a.b(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method String b(Context)>
	//    3    5:areturn         
	}

	private final void a(int i, long l)
	{
		TrueNetSDK.access$setRequestDelay$cp(l);
	//    0    0:lload_2         
	//    1    1:invokestatic    #39  <Method void TrueNetSDK.access$setRequestDelay$cp(long)>
		TrueNetSDK.access$setIntervalPosition$cp(an.a(i, TrueNetSDK.access$getIntervals$cp().size() - 1));
	//    2    4:iload_1         
	//    3    5:invokestatic    #43  <Method List TrueNetSDK.access$getIntervals$cp()>
	//    4    8:invokeinterface #49  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokestatic    #54  <Method int an.a(int, int)>
	//    8   18:invokestatic    #58  <Method void TrueNetSDK.access$setIntervalPosition$cp(int)>
		if(l != 0L)
	//*   9   21:lload_2         
	//*  10   22:lconst_0        
	//*  11   23:lcmp            
	//*  12   24:ifeq            97
			i = 1;
	//   13   27:iconst_1        
	//   14   28:istore_1        
		else
	//*  15   29:iload_1         
	//*  16   30:ifeq            102
	//*  17   33:ldc1            #60  <String "JobManager">
	//*  18   35:new             #62  <Class StringBuilder>
	//*  19   38:dup             
	//*  20   39:invokespecial   #63  <Method void StringBuilder()>
	//*  21   42:ldc1            #65  <String "scheduled millis: ">
	//*  22   44:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  23   47:lload_2         
	//*  24   48:invokestatic    #75  <Method String String.valueOf(long)>
	//*  25   51:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  26   54:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  27   57:invokestatic    #85  <Method int Log.d(String, String)>
	//*  28   60:pop             
	//*  29   61:new             #87  <Class com.startapp.common.b.b$a>
	//*  30   64:dup             
	//*  31   65:bipush          101
	//*  32   67:invokespecial   #89  <Method void com.startapp.common.b.b$a(int)>
	//*  33   70:lload_2         
	//*  34   71:invokevirtual   #92  <Method com.startapp.common.b.b$a com.startapp.common.b.b$a.a(long)>
	//*  35   74:iconst_0        
	//*  36   75:invokevirtual   #95  <Method com.startapp.common.b.b$a com.startapp.common.b.b$a.a(boolean)>
	//*  37   78:ldc1            #97  <String "TruenetCheckLinksJob">
	//*  38   80:ldc1            #99  <String "TruenetJobKey">
	//*  39   82:invokevirtual   #102 <Method com.startapp.common.b.b$a com.startapp.common.b.b$a.a(String, String)>
	//*  40   85:iconst_1        
	//*  41   86:invokevirtual   #104 <Method com.startapp.common.b.b$a com.startapp.common.b.b$a.b(boolean)>
	//*  42   89:invokevirtual   #107 <Method com.startapp.common.b.b com.startapp.common.b.b$a.a()>
	//*  43   92:invokestatic    #112 <Method boolean a.a(com.startapp.common.b.b)>
	//*  44   95:pop             
	//*  45   96:return          
			i = 0;
	//   46   97:iconst_0        
	//   47   98:istore_1        
		if(i == 0)
	//*  48   99:goto            29
			l = TimeUnit.SECONDS.toMillis(((Number)TrueNetSDK.access$getIntervals$cp().get(TrueNetSDK.access$getIntervalPosition$cp())).longValue());
	//   49  102:getstatic       #118 <Field TimeUnit TimeUnit.SECONDS>
	//   50  105:invokestatic    #43  <Method List TrueNetSDK.access$getIntervals$cp()>
	//   51  108:invokestatic    #121 <Method int TrueNetSDK.access$getIntervalPosition$cp()>
	//   52  111:invokeinterface #125 <Method Object List.get(int)>
	//   53  116:checkcast       #127 <Class Number>
	//   54  119:invokevirtual   #131 <Method long Number.longValue()>
	//   55  122:invokevirtual   #135 <Method long TimeUnit.toMillis(long)>
	//   56  125:lstore_2        
		Log.d("JobManager", (new StringBuilder()).append("scheduled millis: ").append(String.valueOf(l)).toString());
		com.startapp.common.b.a.a((new com.startapp.common.b.b.a(101)).a(l).a(false).a("TruenetCheckLinksJob", "TruenetJobKey").b(true).a());
	//*  57  126:goto            33
	}

	private final void a(Context context)
	{
		com.startapp.common.b.a.a(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #139 <Method a a.a(Context)>
	//    2    4:pop             
		com.startapp.common.b.a.a((com.startapp.common.b.a.a)new TrueNetSDK());
	//    3    5:new             #6   <Class TrueNetSDK>
	//    4    8:dup             
	//    5    9:invokespecial   #140 <Method void TrueNetSDK()>
	//    6   12:checkcast       #142 <Class com.startapp.common.b.a.a>
	//    7   15:invokestatic    #145 <Method void a.a(com.startapp.common.b.a.a)>
		a((TrueNetSDK$a)this, context, 0L, 2, ((Object) (null)));
	//    8   18:aload_0         
	//    9   19:checkcast       #2   <Class TrueNetSDK$a>
	//   10   22:aload_1         
	//   11   23:lconst_0        
	//   12   24:iconst_2        
	//   13   25:aconst_null     
	//   14   26:invokestatic    #148 <Method void a(TrueNetSDK$a, Context, long, int, Object)>
	//   15   29:return          
	}

	private final void a(Context context, long l)
	{
		static final class d
			implements Runnable
		{

			public final void run()
			{
				Object obj = ((Object) (new android.support.v7.aj.a()));
			//    0    0:new             #33  <Class android.support.v7.aj$a>
			//    1    3:dup             
			//    2    4:invokespecial   #34  <Method void android.support.v7.aj$a()>
			//    3    7:astore_3        
				obj.a = ((Object) ((String)null));
			//    4    8:aload_3         
			//    5    9:aconst_null     
			//    6   10:checkcast       #36  <Class String>
			//    7   13:putfield        #39  <Field Object android.support.v7.aj$a.a>
				if(a == 0L && ((v)new v(this, ((android.support.v7.aj.a) (obj))) {

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #36  <Method String b()>
			//    2    4:areturn         
			}

			public final String b()
			{
				$res.a = ((Object) (com.truenet.android.a.g.b(TrueNetSDK.access$getInitUrl$cp(), com.truenet.android.TrueNetSDK.a.a(TrueNetSDK.Companion, d.this.b), d.this.b)));
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field android.support.v7.aj$a $res>
			//    2    4:invokestatic    #41  <Method URL TrueNetSDK.access$getInitUrl$cp()>
			//    3    7:getstatic       #45  <Field TrueNetSDK$a TrueNetSDK.Companion>
			//    4   10:aload_0         
			//    5   11:getfield        #25  <Field TrueNetSDK$a$d this$0>
			//    6   14:getfield        #48  <Field Context com.truenet.android.TrueNetSDK$a$d.b>
			//    7   17:invokestatic    #51  <Method String com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, Context)>
			//    8   20:aload_0         
			//    9   21:getfield        #25  <Field TrueNetSDK$a$d this$0>
			//   10   24:getfield        #48  <Field Context com.truenet.android.TrueNetSDK$a$d.b>
			//   11   27:invokestatic    #56  <Method String com.truenet.android.a.g.b(URL, String, Context)>
			//   12   30:putfield        #61  <Field Object android.support.v7.aj$a.a>
				return (String)$res.a;
			//   13   33:aload_0         
			//   14   34:getfield        #27  <Field android.support.v7.aj$a $res>
			//   15   37:getfield        #61  <Field Object android.support.v7.aj$a.a>
			//   16   40:checkcast       #63  <Class String>
			//   17   43:areturn         
			}

			final android.support.v7.aj.a $res;
			final d this$0;

			
			{
				this$0 = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field TrueNetSDK$a$d this$0>
				$res = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field android.support.v7.aj$a $res>
				super(0);
			//    6   10:aload_0         
			//    7   11:iconst_0        
			//    8   12:invokespecial   #30  <Method void af(int)>
			//    9   15:return          
			}
		}
).a() != null)
			//*   8   16:aload_0         
			//*   9   17:getfield        #24  <Field long a>
			//*  10   20:lconst_0        
			//*  11   21:lcmp            
			//*  12   22:ifne            82
			//*  13   25:new             #15  <Class TrueNetSDK$a$d$1>
			//*  14   28:dup             
			//*  15   29:aload_0         
			//*  16   30:aload_3         
			//*  17   31:invokespecial   #42  <Method void TrueNetSDK$a$d$1(TrueNetSDK$a$d, android.support.v7.aj$a)>
			//*  18   34:checkcast       #44  <Class v>
			//*  19   37:invokeinterface #47  <Method Object v.a()>
			//*  20   42:ifnull          82
				{
					TrueNetSDK.a a1 = TrueNetSDK.Companion;
			//   21   45:getstatic       #51  <Field TrueNetSDK$a TrueNetSDK.Companion>
			//   22   48:astore_1        
					Context context1 = b;
			//   23   49:aload_0         
			//   24   50:getfield        #26  <Field Context b>
			//   25   53:astore_2        
					obj = ((Object) ((String)((android.support.v7.aj.a) (obj)).a));
			//   26   54:aload_3         
			//   27   55:getfield        #39  <Field Object android.support.v7.aj$a.a>
			//   28   58:checkcast       #36  <Class String>
			//   29   61:astore_3        
					if(obj == null)
			//*  30   62:aload_3         
			//*  31   63:ifnonnull       69
						ae.a();
			//   32   66:invokestatic    #55  <Method void ae.a()>
					static final class d._cls2 extends af
						implements v
					{

						public Object a()
						{
							b();
						//    0    0:aload_0         
						//    1    1:invokevirtual   #32  <Method void b()>
							return ((Object) (br.a));
						//    2    4:getstatic       #37  <Field br br.a>
						//    3    7:areturn         
						}

						public final void b()
						{
						//    0    0:return          
						}

						public static final d._cls2 a = new d._cls2();

						static 
						{
						//    0    0:new             #2   <Class TrueNetSDK$a$d$2>
						//    1    3:dup             
						//    2    4:invokespecial   #22  <Method void TrueNetSDK$a$d$2()>
						//    3    7:putstatic       #24  <Field TrueNetSDK$a$d$2 a>
						//*   4   10:return          
						}

					}

					com.truenet.android.TrueNetSDK.a.a(a1, context1, ((String) (obj)), (v)com.truenet.android._cls2.a);
			//   33   69:aload_1         
			//   34   70:aload_2         
			//   35   71:aload_3         
			//   36   72:getstatic       #58  <Field TrueNetSDK$a$d$2 com.truenet.android.TrueNetSDK$a$d$2.a>
			//   37   75:checkcast       #44  <Class v>
			//   38   78:invokestatic    #61  <Method void com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, Context, String, v)>
					return;
			//   39   81:return          
				} else
				{
					com.truenet.android.TrueNetSDK.a.a(TrueNetSDK.Companion, 0, a);
			//   40   82:getstatic       #51  <Field TrueNetSDK$a TrueNetSDK.Companion>
			//   41   85:iconst_0        
			//   42   86:aload_0         
			//   43   87:getfield        #24  <Field long a>
			//   44   90:invokestatic    #64  <Method void com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, int, long)>
					return;
			//   45   93:return          
				}
			}

			final long a;
			final Context b;

			d(long l, Context context)
			{
				a = l;
			//    0    0:aload_0         
			//    1    1:lload_1         
			//    2    2:putfield        #24  <Field long a>
				b = context;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #26  <Field Context b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #29  <Method void Object()>
			//    8   14:return          
			}
		}

		Executors.newSingleThreadExecutor(TrueNetSDK.access$getThreadFactory$cp()).execute((Runnable)new d(l, context));
	//    0    0:invokestatic    #153 <Method java.util.concurrent.ThreadFactory TrueNetSDK.access$getThreadFactory$cp()>
	//    1    3:invokestatic    #159 <Method ExecutorService Executors.newSingleThreadExecutor(java.util.concurrent.ThreadFactory)>
	//    2    6:new             #15  <Class TrueNetSDK$a$d>
	//    3    9:dup             
	//    4   10:lload_2         
	//    5   11:aload_1         
	//    6   12:invokespecial   #162 <Method void TrueNetSDK$a$d(long, Context)>
	//    7   15:checkcast       #164 <Class Runnable>
	//    8   18:invokeinterface #170 <Method void ExecutorService.execute(Runnable)>
	//    9   23:return          
	}

	private final void a(Context context, LinksData linksdata, v v1)
	{
		Object obj1 = ((Object) ((Iterable)linksdata.getValidation()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #176 <Method List LinksData.getValidation()>
	//    2    4:checkcast       #178 <Class Iterable>
	//    3    7:astore          5
		Object obj = ((Object) ((Collection)new ArrayList(g.a(((Iterable) (obj1)), 10))));
	//    4    9:new             #180 <Class ArrayList>
	//    5   12:dup             
	//    6   13:aload           5
	//    7   15:bipush          10
	//    8   17:invokestatic    #185 <Method int g.a(Iterable, int)>
	//    9   20:invokespecial   #186 <Method void ArrayList(int)>
	//   10   23:checkcast       #188 <Class Collection>
	//   11   26:astore          4
		for(obj1 = ((Object) (((Iterable) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); ((Collection) (obj)).add(((Object) (((Link)((Iterator) (obj1)).next()).getValidationUrl()))));
	//   12   28:aload           5
	//   13   30:invokeinterface #192 <Method Iterator Iterable.iterator()>
	//   14   35:astore          5
	//   15   37:aload           5
	//   16   39:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   17   44:ifeq            71
	//   18   47:aload           4
	//   19   49:aload           5
	//   20   51:invokeinterface #202 <Method Object Iterator.next()>
	//   21   56:checkcast       #204 <Class Link>
	//   22   59:invokevirtual   #207 <Method String Link.getValidationUrl()>
	//   23   62:invokeinterface #211 <Method boolean Collection.add(Object)>
	//   24   67:pop             
	//*  25   68:goto            37
		obj = ((Object) (new c(context, (List)obj, TrueNetSDK.access$getThreadFactory$cp(), linksdata.getMaxRedirectTime(), linksdata.getNumOfRedirect(), linksdata.getValidateParallel())));
	//   26   71:new             #213 <Class c>
	//   27   74:dup             
	//   28   75:aload_1         
	//   29   76:aload           4
	//   30   78:checkcast       #45  <Class List>
	//   31   81:invokestatic    #153 <Method java.util.concurrent.ThreadFactory TrueNetSDK.access$getThreadFactory$cp()>
	//   32   84:aload_2         
	//   33   85:invokevirtual   #216 <Method long LinksData.getMaxRedirectTime()>
	//   34   88:aload_2         
	//   35   89:invokevirtual   #219 <Method int LinksData.getNumOfRedirect()>
	//   36   92:aload_2         
	//   37   93:invokevirtual   #222 <Method int LinksData.getValidateParallel()>
	//   38   96:invokespecial   #225 <Method void c(Context, List, java.util.concurrent.ThreadFactory, long, int, int)>
	//   39   99:astore          4
		obj1 = ((Object) (new ConcurrentLinkedQueue()));
	//   40  101:new             #227 <Class ConcurrentLinkedQueue>
	//   41  104:dup             
	//   42  105:invokespecial   #228 <Method void ConcurrentLinkedQueue()>
	//   43  108:astore          5
		static final class a extends af
			implements v
		{

			public Object a()
			{
				b();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #41  <Method void b()>
				return ((Object) (br.a));
			//    2    4:getstatic       #46  <Field br br.a>
			//    3    7:areturn         
			}

			public final void b()
			{
				if($links.getBulkResponse())
			//*   0    0:aload_0         
			//*   1    1:getfield        #26  <Field LinksData $links>
			//*   2    4:invokevirtual   #52  <Method boolean LinksData.getBulkResponse()>
			//*   3    7:ifeq            51
				{
					String s = com.startapp.common.c.b.a(((Object) (new ValidationResults(g.a((Iterable)$bulkQueue)))));
			//    4   10:new             #54  <Class ValidationResults>
			//    5   13:dup             
			//    6   14:aload_0         
			//    7   15:getfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
			//    8   18:checkcast       #56  <Class Iterable>
			//    9   21:invokestatic    #61  <Method List g.a(Iterable)>
			//   10   24:invokespecial   #64  <Method void ValidationResults(List)>
			//   11   27:invokestatic    #69  <Method String b.a(Object)>
			//   12   30:astore_1        
					URL url = TrueNetSDK.access$getResultUrl$cp();
			//   13   31:invokestatic    #73  <Method URL TrueNetSDK.access$getResultUrl$cp()>
			//   14   34:astore_2        
					ae.a(((Object) (s)), "json");
			//   15   35:aload_1         
			//   16   36:ldc1            #75  <String "json">
			//   17   38:invokestatic    #80  <Method void ae.a(Object, String)>
					com.truenet.android.a.g.b(url, s, $context);
			//   18   41:aload_2         
			//   19   42:aload_1         
			//   20   43:aload_0         
			//   21   44:getfield        #30  <Field Context $context>
			//   22   47:invokestatic    #85  <Method String com.truenet.android.a.g.b(URL, String, Context)>
			//   23   50:pop             
				}
				com.truenet.android.TrueNetSDK.a.a(TrueNetSDK.Companion, $context, $links.getSleep());
			//   24   51:getstatic       #89  <Field TrueNetSDK$a TrueNetSDK.Companion>
			//   25   54:aload_0         
			//   26   55:getfield        #30  <Field Context $context>
			//   27   58:aload_0         
			//   28   59:getfield        #26  <Field LinksData $links>
			//   29   62:invokevirtual   #93  <Method long LinksData.getSleep()>
			//   30   65:invokestatic    #96  <Method void com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, Context, long)>
				if($links.getSleep() != 0L)
			//*  31   68:aload_0         
			//*  32   69:getfield        #26  <Field LinksData $links>
			//*  33   72:invokevirtual   #93  <Method long LinksData.getSleep()>
			//*  34   75:lconst_0        
			//*  35   76:lcmp            
			//*  36   77:ifeq            90
					$finish.a();
			//   37   80:aload_0         
			//   38   81:getfield        #32  <Field v $finish>
			//   39   84:invokeinterface #98  <Method Object v.a()>
			//   40   89:pop             
			//   41   90:return          
			}

			final ConcurrentLinkedQueue $bulkQueue;
			final Context $context;
			final v $finish;
			final LinksData $links;

			a(LinksData linksdata, ConcurrentLinkedQueue concurrentlinkedqueue, Context context, v v1)
			{
				$links = linksdata;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field LinksData $links>
				$bulkQueue = concurrentlinkedqueue;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
				$context = context;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field Context $context>
				$finish = v1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field v $finish>
				super(0);
			//   12   21:aload_0         
			//   13   22:iconst_0        
			//   14   23:invokespecial   #35  <Method void af(int)>
			//   15   26:return          
			}
		}

		((c) (obj)).a((v)new a(linksdata, ((ConcurrentLinkedQueue) (obj1)), context, v1));
	//   44  110:aload           4
	//   45  112:new             #9   <Class TrueNetSDK$a$a>
	//   46  115:dup             
	//   47  116:aload_2         
	//   48  117:aload           5
	//   49  119:aload_1         
	//   50  120:aload_3         
	//   51  121:invokespecial   #231 <Method void TrueNetSDK$a$a(LinksData, ConcurrentLinkedQueue, Context, v)>
	//   52  124:checkcast       #233 <Class v>
	//   53  127:invokevirtual   #236 <Method void com.truenet.android.c.a(v)>
		static final class b extends af
			implements w
		{

			public Object a(Object obj2, Object obj3)
			{
				a((com.truenet.android.b)obj2, ((Number)obj3).intValue());
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #35  <Class com.truenet.android.b>
			//    3    5:aload_2         
			//    4    6:checkcast       #37  <Class Number>
			//    5    9:invokevirtual   #41  <Method int Number.intValue()>
			//    6   12:invokevirtual   #44  <Method void a(com.truenet.android.b, int)>
				return ((Object) (br.a));
			//    7   15:getstatic       #49  <Field br br.a>
			//    8   18:areturn         
			}

			public final void a(com.truenet.android.b b1, int i)
			{
				ae.b(((Object) (b1)), "info");
			//    0    0:aload_1         
			//    1    1:ldc1            #52  <String "info">
			//    2    3:invokestatic    #58  <Method void ae.b(Object, String)>
				Object obj2 = ((Object) ((Iterable)b1.d()));
			//    3    6:aload_1         
			//    4    7:invokevirtual   #62  <Method List b.d()>
			//    5   10:checkcast       #64  <Class Iterable>
			//    6   13:astore          6
				Object obj3 = ((Object) ((Collection)new ArrayList(g.a(((Iterable) (obj2)), 10))));
			//    7   15:new             #66  <Class ArrayList>
			//    8   18:dup             
			//    9   19:aload           6
			//   10   21:bipush          10
			//   11   23:invokestatic    #71  <Method int g.a(Iterable, int)>
			//   12   26:invokespecial   #72  <Method void ArrayList(int)>
			//   13   29:checkcast       #74  <Class Collection>
			//   14   32:astore          7
				Object obj4 = ((Object) (((Iterable) (obj2)).iterator()));
			//   15   34:aload           6
			//   16   36:invokeinterface #78  <Method Iterator Iterable.iterator()>
			//   17   41:astore          8
				while(((Iterator) (obj4)).hasNext()) 
			//*  18   43:aload           8
			//*  19   45:invokeinterface #84  <Method boolean Iterator.hasNext()>
			//*  20   50:ifeq            135
				{
					obj2 = ((Object) ((b.b)((Iterator) (obj4)).next()));
			//   21   53:aload           8
			//   22   55:invokeinterface #88  <Method Object Iterator.next()>
			//   23   60:checkcast       #90  <Class b$b>
			//   24   63:astore          6
					RedirectsResult redirectsresult = JVM INSTR new #92  <Class RedirectsResult>;
			//   25   65:new             #92  <Class RedirectsResult>
			//   26   68:astore          9
					String s = ((b.b) (obj2)).a();
			//   27   70:aload           6
			//   28   72:invokevirtual   #95  <Method String com.truenet.android.b$b.a()>
			//   29   75:astore          10
					long l = ((b.b) (obj2)).b();
			//   30   77:aload           6
			//   31   79:invokevirtual   #98  <Method long com.truenet.android.b$b.b()>
			//   32   82:lstore          4
					int j = ((b.b) (obj2)).c();
			//   33   84:aload           6
			//   34   86:invokevirtual   #101 <Method int b$b.c()>
			//   35   89:istore_3        
					obj2 = ((Object) (((b.b) (obj2)).d()));
			//   36   90:aload           6
			//   37   92:invokevirtual   #102 <Method List b$b.d()>
			//   38   95:astore          6
					if(obj2 == null)
			//*  39   97:aload           6
			//*  40   99:ifnull          127
			//*  41  102:aload           9
			//*  42  104:aload           10
			//*  43  106:lload           4
			//*  44  108:iload_3         
			//*  45  109:aload           6
			//*  46  111:invokespecial   #105 <Method void RedirectsResult(String, long, int, List)>
			//*  47  114:aload           7
			//*  48  116:aload           9
			//*  49  118:invokeinterface #109 <Method boolean Collection.add(Object)>
			//*  50  123:pop             
			//*  51  124:goto            43
						obj2 = ((Object) (g.a()));
			//   52  127:invokestatic    #111 <Method List g.a()>
			//   53  130:astore          6
					redirectsresult.RedirectsResult(s, l, j, ((List) (obj2)));
					((Collection) (obj3)).add(((Object) (redirectsresult)));
				}
			//*  54  132:goto            102
				List list = (List)obj3;
			//   55  135:aload           7
			//   56  137:checkcast       #113 <Class List>
			//   57  140:astore          9
				Link link = (Link)$links.getValidation().get(i);
			//   58  142:aload_0         
			//   59  143:getfield        #24  <Field LinksData $links>
			//   60  146:invokevirtual   #118 <Method List LinksData.getValidation()>
			//   61  149:iload_2         
			//   62  150:invokeinterface #122 <Method Object List.get(int)>
			//   63  155:checkcast       #124 <Class Link>
			//   64  158:astore          10
				obj2 = ((Object) (JVM INSTR new #126 <Class ValidationResult>));
			//   65  160:new             #126 <Class ValidationResult>
			//   66  163:astore          6
				String s1 = link.getInstanceId();
			//   67  165:aload           10
			//   68  167:invokevirtual   #129 <Method String Link.getInstanceId()>
			//   69  170:astore          11
				i = b1.b();
			//   70  172:aload_1         
			//   71  173:invokevirtual   #131 <Method int com.truenet.android.b.b()>
			//   72  176:istore_2        
				long l1 = b1.c();
			//   73  177:aload_1         
			//   74  178:invokevirtual   #133 <Method long b.c()>
			//   75  181:lstore          4
				String s2 = b1.e();
			//   76  183:aload_1         
			//   77  184:invokevirtual   #136 <Method String b.e()>
			//   78  187:astore          12
				obj3 = ((Object) (b1.f()));
			//   79  189:aload_1         
			//   80  190:invokevirtual   #139 <Method String b.f()>
			//   81  193:astore          7
				if(obj3 != null && com.truenet.android.a.g.a(new URL(link.getHtmlStorage()), ((String) (obj3)), $context))
			//*  82  195:aload           7
			//*  83  197:ifnull          317
			//*  84  200:new             #141 <Class URL>
			//*  85  203:dup             
			//*  86  204:aload           10
			//*  87  206:invokevirtual   #144 <Method String Link.getHtmlStorage()>
			//*  88  209:invokespecial   #147 <Method void URL(String)>
			//*  89  212:aload           7
			//*  90  214:aload_0         
			//*  91  215:getfield        #26  <Field Context $context>
			//*  92  218:invokestatic    #152 <Method boolean com.truenet.android.a.g.a(URL, String, Context)>
			//*  93  221:iconst_1        
			//*  94  222:icmpne          373
				{
					obj3 = ((Object) (link.getHtmlStorage()));
			//   95  225:aload           10
			//   96  227:invokevirtual   #144 <Method String Link.getHtmlStorage()>
			//   97  230:astore          7
					obj4 = obj2;
			//   98  232:aload           6
			//   99  234:astore          8
				} else
			//* 100  236:aload_1         
			//* 101  237:invokevirtual   #155 <Method android.graphics.Bitmap com.truenet.android.b.a()>
			//* 102  240:astore_1        
			//* 103  241:aload_1         
			//* 104  242:ifnull          328
			//* 105  245:aload_1         
			//* 106  246:aload           10
			//* 107  248:invokevirtual   #158 <Method String Link.getImageStorage()>
			//* 108  251:invokestatic    #163 <Method boolean com.truenet.android.a.a.a(android.graphics.Bitmap, String)>
			//* 109  254:iconst_1        
			//* 110  255:icmpne          328
			//* 111  258:aload           10
			//* 112  260:invokevirtual   #158 <Method String Link.getImageStorage()>
			//* 113  263:astore_1        
			//* 114  264:aload           6
			//* 115  266:aload           11
			//* 116  268:iload_2         
			//* 117  269:lload           4
			//* 118  271:aload           9
			//* 119  273:aload           12
			//* 120  275:aload           7
			//* 121  277:aload_1         
			//* 122  278:getstatic       #167 <Field TrueNetSDK$a TrueNetSDK.Companion>
			//* 123  281:aload_0         
			//* 124  282:getfield        #26  <Field Context $context>
			//* 125  285:invokestatic    #170 <Method String com.truenet.android.TrueNetSDK$a.b(TrueNetSDK$a, Context)>
			//* 126  288:aload           10
			//* 127  290:invokevirtual   #173 <Method String Link.getMetaData()>
			//* 128  293:invokespecial   #176 <Method void ValidationResult(String, int, long, List, String, String, String, String, String)>
			//* 129  296:aload_0         
			//* 130  297:getfield        #24  <Field LinksData $links>
			//* 131  300:invokevirtual   #179 <Method boolean LinksData.getBulkResponse()>
			//* 132  303:ifeq            334
			//* 133  306:aload_0         
			//* 134  307:getfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
			//* 135  310:aload           8
			//* 136  312:invokevirtual   #182 <Method boolean ConcurrentLinkedQueue.add(Object)>
			//* 137  315:pop             
			//* 138  316:return          
				{
					obj4 = obj2;
			//  139  317:aload           6
			//  140  319:astore          8
					obj3 = "";
			//  141  321:ldc1            #184 <String "">
			//  142  323:astore          7
				}
				b1 = ((com.truenet.android.b) (b1.a()));
				if(b1 != null && com.truenet.android.a.a.a(((android.graphics.Bitmap) (b1)), link.getImageStorage()))
					b1 = ((com.truenet.android.b) (link.getImageStorage()));
				else
			//* 143  325:goto            236
					b1 = "";
			//  144  328:ldc1            #184 <String "">
			//  145  330:astore_1        
				((ValidationResult) (obj2)).ValidationResult(s1, i, l1, list, s2, ((String) (obj3)), ((String) (b1)), com.truenet.android.TrueNetSDK.a.b(TrueNetSDK.Companion, $context), link.getMetaData());
				if($links.getBulkResponse())
				{
					$bulkQueue.add(obj4);
					return;
				} else
			//* 146  331:goto            264
				{
					b1 = ((com.truenet.android.b) (com.startapp.common.c.b.a(((Object) (new ValidationResults(g.a(obj4)))))));
			//  147  334:new             #186 <Class ValidationResults>
			//  148  337:dup             
			//  149  338:aload           8
			//  150  340:invokestatic    #189 <Method List g.a(Object)>
			//  151  343:invokespecial   #192 <Method void ValidationResults(List)>
			//  152  346:invokestatic    #197 <Method String b.a(Object)>
			//  153  349:astore_1        
					URL url = TrueNetSDK.access$getResultUrl$cp();
			//  154  350:invokestatic    #201 <Method URL TrueNetSDK.access$getResultUrl$cp()>
			//  155  353:astore          6
					ae.a(((Object) (b1)), "json");
			//  156  355:aload_1         
			//  157  356:ldc1            #203 <String "json">
			//  158  358:invokestatic    #205 <Method void ae.a(Object, String)>
					com.truenet.android.a.g.b(url, ((String) (b1)), $context);
			//  159  361:aload           6
			//  160  363:aload_1         
			//  161  364:aload_0         
			//  162  365:getfield        #26  <Field Context $context>
			//  163  368:invokestatic    #208 <Method String com.truenet.android.a.g.b(URL, String, Context)>
			//  164  371:pop             
					return;
			//  165  372:return          
				}
			//* 166  373:goto            317
			}

			final ConcurrentLinkedQueue $bulkQueue;
			final Context $context;
			final LinksData $links;

			b(LinksData linksdata, Context context, ConcurrentLinkedQueue concurrentlinkedqueue)
			{
				$links = linksdata;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field LinksData $links>
				$context = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Context $context>
				$bulkQueue = concurrentlinkedqueue;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
				super(2);
			//    9   15:aload_0         
			//   10   16:iconst_2        
			//   11   17:invokespecial   #31  <Method void af(int)>
			//   12   20:return          
			}
		}

		((c) (obj)).a((w)new b(linksdata, context, ((ConcurrentLinkedQueue) (obj1))));
	//   54  130:aload           4
	//   55  132:new             #11  <Class TrueNetSDK$a$b>
	//   56  135:dup             
	//   57  136:aload_2         
	//   58  137:aload_1         
	//   59  138:aload           5
	//   60  140:invokespecial   #239 <Method void TrueNetSDK$a$b(LinksData, Context, ConcurrentLinkedQueue)>
	//   61  143:checkcast       #241 <Class w>
	//   62  146:invokevirtual   #244 <Method void com.truenet.android.c.a(w)>
	//   63  149:return          
	}

	private final void a(Context context, String s, v v1)
	{
		TrueNetSDK.access$setIntervalPosition$cp(0);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #58  <Method void TrueNetSDK.access$setIntervalPosition$cp(int)>
		TrueNetSDK.access$setRequestDelay$cp(0L);
	//    2    4:lconst_0        
	//    3    5:invokestatic    #39  <Method void TrueNetSDK.access$setRequestDelay$cp(long)>
		s = ((String) ((LinksData)com.startapp.common.c.b.a(s, com/truenet/android/LinksData)));
	//    4    8:aload_2         
	//    5    9:ldc1            #173 <Class LinksData>
	//    6   11:invokestatic    #252 <Method Object b.a(String, Class)>
	//    7   14:checkcast       #173 <Class LinksData>
	//    8   17:astore_2        
		((LinksData) (s)).getValidation().size();
	//    9   18:aload_2         
	//   10   19:invokevirtual   #176 <Method List LinksData.getValidation()>
	//   11   22:invokeinterface #49  <Method int List.size()>
		JVM INSTR tableswitch 0 0: default 44
	//	               0 65;
	//   12   27:tableswitch     0 0: default 44
	//	               0 65
		   goto _L1 _L2
_L1:
		TrueNetSDK$a truenetsdk$a = (TrueNetSDK$a)this;
	//   13   44:aload_0         
	//   14   45:checkcast       #2   <Class TrueNetSDK$a>
	//   15   48:astore          4
		ae.a(((Object) (s)), "response");
	//   16   50:aload_2         
	//   17   51:ldc1            #254 <String "response">
	//   18   53:invokestatic    #259 <Method void ae.a(Object, String)>
		truenetsdk$a.a(context, ((LinksData) (s)), v1);
	//   19   56:aload           4
	//   20   58:aload_1         
	//   21   59:aload_2         
	//   22   60:aload_3         
	//   23   61:invokespecial   #261 <Method void a(Context, LinksData, v)>
_L4:
		return;
	//   24   64:return          
_L2:
		a(context, ((LinksData) (s)).getSleep());
	//   25   65:aload_0         
	//   26   66:checkcast       #2   <Class TrueNetSDK$a>
	//   27   69:aload_1         
	//   28   70:aload_2         
	//   29   71:invokevirtual   #264 <Method long LinksData.getSleep()>
	//   30   74:invokespecial   #266 <Method void a(Context, long)>
		if(((LinksData) (s)).getSleep() != 0L)
	//*  31   77:aload_2         
	//*  32   78:invokevirtual   #264 <Method long LinksData.getSleep()>
	//*  33   81:lconst_0        
	//*  34   82:lcmp            
	//*  35   83:ifeq            64
		{
			v1.a();
	//   36   86:aload_3         
	//   37   87:invokeinterface #268 <Method Object v.a()>
	//   38   92:pop             
			return;
	//   39   93:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static final void a(TrueNetSDK$a truenetsdk$a, int i, long l)
	{
		truenetsdk$a.a(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #272 <Method void a(int, long)>
	//    4    6:return          
	}

	public static final void a(TrueNetSDK$a truenetsdk$a, Context context, long l)
	{
		truenetsdk$a.a(context, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #266 <Method void a(Context, long)>
	//    4    6:return          
	}

	static volatile void a(TrueNetSDK$a truenetsdk$a, Context context, long l, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			l = 0L;
	//    4    7:lconst_0        
	//    5    8:lstore_2        
		truenetsdk$a.a(context, l);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:lload_2         
	//    9   12:invokespecial   #266 <Method void a(Context, long)>
	//   10   15:return          
	}

	public static final void a(TrueNetSDK$a truenetsdk$a, Context context, String s, v v1)
	{
		truenetsdk$a.a(context, s, v1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #276 <Method void a(Context, String, v)>
	//    5    7:return          
	}

	public static final void a(TrueNetSDK$a truenetsdk$a, Thread thread, Throwable throwable)
	{
		truenetsdk$a.a(thread, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #280 <Method void a(Thread, Throwable)>
	//    4    6:return          
	}

	private final void a(Thread thread, Throwable throwable)
	{
		Log.e("TrueNetSDK", (new StringBuilder()).append("Something went wrong in thread: ").append(String.valueOf(thread.getId())).toString(), throwable);
	//    0    0:ldc2            #282 <String "TrueNetSDK">
	//    1    3:new             #62  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #63  <Method void StringBuilder()>
	//    4   10:ldc2            #284 <String "Something went wrong in thread: ">
	//    5   13:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #289 <Method long Thread.getId()>
	//    8   20:invokestatic    #75  <Method String String.valueOf(long)>
	//    9   23:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   26:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   11   29:aload_2         
	//   12   30:invokestatic    #293 <Method int Log.e(String, String, Throwable)>
	//   13   33:pop             
	//   14   34:return          
	}

	private final String b(Context context)
	{
		DeviceInfo deviceinfo = (new com.truenet.android.a(context, ((android.telephony.TelephonyManager) (null)), 2, ((ab) (null)))).a();
	//    0    0:new             #295 <Class com.truenet.android.a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:iconst_2        
	//    5    7:aconst_null     
	//    6    8:invokespecial   #298 <Method void com.truenet.android.a(Context, android.telephony.TelephonyManager, int, ab)>
	//    7   11:invokevirtual   #301 <Method DeviceInfo com.truenet.android.a.a()>
	//    8   14:astore_2        
		deviceinfo.setPublisherId(c(context));
	//    9   15:aload_2         
	//   10   16:aload_0         
	//   11   17:checkcast       #2   <Class TrueNetSDK$a>
	//   12   20:aload_1         
	//   13   21:invokespecial   #304 <Method String c(Context)>
	//   14   24:invokevirtual   #310 <Method void DeviceInfo.setPublisherId(String)>
		context = ((Context) (com.startapp.common.c.b.a(((Object) (deviceinfo)))));
	//   15   27:aload_2         
	//   16   28:invokestatic    #313 <Method String b.a(Object)>
	//   17   31:astore_1        
		ae.a(((Object) (context)), "JSONParser.toJson(info)");
	//   18   32:aload_1         
	//   19   33:ldc2            #315 <String "JSONParser.toJson(info)">
	//   20   36:invokestatic    #259 <Method void ae.a(Object, String)>
		return ((String) (context));
	//   21   39:aload_1         
	//   22   40:areturn         
	}

	public static final String b(TrueNetSDK$a truenetsdk$a, Context context)
	{
		return truenetsdk$a.c(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #304 <Method String c(Context)>
	//    3    5:areturn         
	}

	private final String c(Context context)
	{
		context = ((Context) (context.getSharedPreferences("TruenetJobKey", 0).getString("PrefsPublisherId", "Undefined")));
	//    0    0:aload_1         
	//    1    1:ldc1            #99  <String "TruenetJobKey">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #321 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:ldc2            #323 <String "PrefsPublisherId">
	//    5   10:ldc2            #325 <String "Undefined">
	//    6   13:invokeinterface #331 <Method String SharedPreferences.getString(String, String)>
	//    7   18:astore_1        
		ae.a(((Object) (context)), "prefs.getString(PREFS_PUBLISHER_ID, \"Undefined\")");
	//    8   19:aload_1         
	//    9   20:ldc2            #333 <String "prefs.getString(PREFS_PUBLISHER_ID, \"Undefined\")">
	//   10   23:invokestatic    #259 <Method void ae.a(Object, String)>
		return ((String) (context));
	//   11   26:aload_1         
	//   12   27:areturn         
	}

	public final void a(Context context, v v1)
	{
		ae.b(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc2            #338 <String "context">
	//    2    4:invokestatic    #340 <Method void ae.b(Object, String)>
		ae.b(((Object) (v1)), "finish");
	//    3    7:aload_2         
	//    4    8:ldc2            #342 <String "finish">
	//    5   11:invokestatic    #340 <Method void ae.b(Object, String)>
		if(!context.getSharedPreferences("TruenetJobKey", 0).getBoolean("PrefsEnabled", true))
	//*   6   14:aload_1         
	//*   7   15:ldc1            #99  <String "TruenetJobKey">
	//*   8   17:iconst_0        
	//*   9   18:invokevirtual   #321 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*  10   21:ldc2            #344 <String "PrefsEnabled">
	//*  11   24:iconst_1        
	//*  12   25:invokeinterface #348 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  13   30:ifne            41
		{
			v1.a();
	//   14   33:aload_2         
	//   15   34:invokeinterface #268 <Method Object v.a()>
	//   16   39:pop             
			return;
	//   17   40:return          
		}
		try
		{
			static final class c
				implements Runnable
			{

				public final void run()
				{
					boolean flag;
					Object obj;
					if(TrueNetSDK.access$getRequestDelay$cp() != 0L)
				//*   0    0:invokestatic    #30  <Method long TrueNetSDK.access$getRequestDelay$cp()>
				//*   1    3:lconst_0        
				//*   2    4:lcmp            
				//*   3    5:ifeq            51
						flag = true;
				//    4    8:iconst_1        
				//    5    9:istore_1        
					else
				//*   6   10:invokestatic    #34  <Method URL TrueNetSDK.access$getInitUrl$cp()>
				//*   7   13:getstatic       #38  <Field TrueNetSDK$a TrueNetSDK.Companion>
				//*   8   16:aload_0         
				//*   9   17:getfield        #19  <Field Context a>
				//*  10   20:invokestatic    #41  <Method String com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, Context)>
				//*  11   23:aload_0         
				//*  12   24:getfield        #19  <Field Context a>
				//*  13   27:invokestatic    #46  <Method String com.truenet.android.a.g.b(URL, String, Context)>
				//*  14   30:astore_2        
				//*  15   31:aload_2         
				//*  16   32:ifnull          56
				//*  17   35:getstatic       #38  <Field TrueNetSDK$a TrueNetSDK.Companion>
				//*  18   38:aload_0         
				//*  19   39:getfield        #19  <Field Context a>
				//*  20   42:aload_2         
				//*  21   43:aload_0         
				//*  22   44:getfield        #21  <Field v b>
				//*  23   47:invokestatic    #49  <Method void com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, Context, String, v)>
				//*  24   50:return          
						flag = false;
				//   25   51:iconst_0        
				//   26   52:istore_1        
					obj = ((Object) (com.truenet.android.a.g.b(TrueNetSDK.access$getInitUrl$cp(), com.truenet.android.TrueNetSDK.a.a(TrueNetSDK.Companion, a), a)));
					if(obj != null)
					{
						com.truenet.android.TrueNetSDK.a.a(TrueNetSDK.Companion, a, ((String) (obj)), b);
						return;
					}
				//*  27   53:goto            10
					obj = ((Object) (TrueNetSDK.Companion));
				//   28   56:getstatic       #38  <Field TrueNetSDK$a TrueNetSDK.Companion>
				//   29   59:astore_2        
					int i;
					if(flag)
				//*  30   60:iload_1         
				//*  31   61:ifeq            85
						i = TrueNetSDK.access$getIntervalPosition$cp();
				//   32   64:invokestatic    #53  <Method int TrueNetSDK.access$getIntervalPosition$cp()>
				//   33   67:istore_1        
					else
				//*  34   68:aload_2         
				//*  35   69:iload_1         
				//*  36   70:lconst_0        
				//*  37   71:invokestatic    #56  <Method void com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, int, long)>
				//*  38   74:aload_0         
				//*  39   75:getfield        #21  <Field v b>
				//*  40   78:invokeinterface #61  <Method Object v.a()>
				//*  41   83:pop             
				//*  42   84:return          
						i = TrueNetSDK.access$getIntervalPosition$cp() + 1;
				//   43   85:invokestatic    #53  <Method int TrueNetSDK.access$getIntervalPosition$cp()>
				//   44   88:iconst_1        
				//   45   89:iadd            
				//   46   90:istore_1        
					com.truenet.android.TrueNetSDK.a.a(((TrueNetSDK.a) (obj)), i, 0L);
					b.a();
				//*  47   91:goto            68
				}

				final Context a;
				final v b;

			c(Context context, v v1)
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Context a>
				b = v1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field v b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}

			Executors.newSingleThreadExecutor(TrueNetSDK.access$getThreadFactory$cp()).execute((Runnable)new c(context, v1));
	//   18   41:invokestatic    #153 <Method java.util.concurrent.ThreadFactory TrueNetSDK.access$getThreadFactory$cp()>
	//   19   44:invokestatic    #159 <Method ExecutorService Executors.newSingleThreadExecutor(java.util.concurrent.ThreadFactory)>
	//   20   47:new             #13  <Class TrueNetSDK$a$c>
	//   21   50:dup             
	//   22   51:aload_1         
	//   23   52:aload_2         
	//   24   53:invokespecial   #350 <Method void TrueNetSDK$a$c(Context, v)>
	//   25   56:checkcast       #164 <Class Runnable>
	//   26   59:invokeinterface #170 <Method void ExecutorService.execute(Runnable)>
			return;
	//   27   64:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  28   65:astore_1        
		{
			v1 = ((v) ((TrueNetSDK$a)this));
	//   29   66:aload_0         
	//   30   67:checkcast       #2   <Class TrueNetSDK$a>
	//   31   70:astore_2        
		}
		Thread thread = Thread.currentThread();
	//   32   71:invokestatic    #354 <Method Thread Thread.currentThread()>
	//   33   74:astore_3        
		ae.a(((Object) (thread)), "Thread.currentThread()");
	//   34   75:aload_3         
	//   35   76:ldc2            #356 <String "Thread.currentThread()">
	//   36   79:invokestatic    #259 <Method void ae.a(Object, String)>
		((TrueNetSDK$a) (v1)).a(thread, ((Throwable) (context)));
	//   37   82:aload_2         
	//   38   83:aload_3         
	//   39   84:aload_1         
	//   40   85:invokespecial   #280 <Method void a(Thread, Throwable)>
		return;
	//   41   88:return          
	}

	public final void a(Context context, String s)
	{
		ae.b(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc2            #338 <String "context">
	//    2    4:invokestatic    #340 <Method void ae.b(Object, String)>
		ae.b(((Object) (s)), "publisherID");
	//    3    7:aload_2         
	//    4    8:ldc2            #360 <String "publisherID">
	//    5   11:invokestatic    #340 <Method void ae.b(Object, String)>
		try
		{
			SharedPreferences sharedpreferences = context.getSharedPreferences("TruenetJobKey", 0);
	//    6   14:aload_1         
	//    7   15:ldc1            #99  <String "TruenetJobKey">
	//    8   17:iconst_0        
	//    9   18:invokevirtual   #321 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   10   21:astore_3        
			sharedpreferences.edit().putString("PrefsPublisherId", s).apply();
	//   11   22:aload_3         
	//   12   23:invokeinterface #364 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   28:ldc2            #323 <String "PrefsPublisherId">
	//   14   31:aload_2         
	//   15   32:invokeinterface #370 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   16   37:invokeinterface #373 <Method void android.content.SharedPreferences$Editor.apply()>
			if(sharedpreferences.getBoolean("PrefsEnabled", true) && !TrueNetSDK.access$getWasInitCalled$cp())
	//*  17   42:aload_3         
	//*  18   43:ldc2            #344 <String "PrefsEnabled">
	//*  19   46:iconst_1        
	//*  20   47:invokeinterface #348 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  21   52:ifeq            73
	//*  22   55:invokestatic    #376 <Method boolean TrueNetSDK.access$getWasInitCalled$cp()>
	//*  23   58:ifne            73
			{
				a(context);
	//   24   61:aload_0         
	//   25   62:checkcast       #2   <Class TrueNetSDK$a>
	//   26   65:aload_1         
	//   27   66:invokespecial   #378 <Method void a(Context)>
				TrueNetSDK.access$setWasInitCalled$cp(true);
	//   28   69:iconst_1        
	//   29   70:invokestatic    #382 <Method void TrueNetSDK.access$setWasInitCalled$cp(boolean)>
			}
			return;
	//   30   73:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   74:astore_1        
		{
			s = ((String) ((TrueNetSDK$a)this));
	//   32   75:aload_0         
	//   33   76:checkcast       #2   <Class TrueNetSDK$a>
	//   34   79:astore_2        
		}
		Thread thread = Thread.currentThread();
	//   35   80:invokestatic    #354 <Method Thread Thread.currentThread()>
	//   36   83:astore_3        
		ae.a(((Object) (thread)), "Thread.currentThread()");
	//   37   84:aload_3         
	//   38   85:ldc2            #356 <String "Thread.currentThread()">
	//   39   88:invokestatic    #259 <Method void ae.a(Object, String)>
		((TrueNetSDK$a) (s)).a(thread, ((Throwable) (context)));
	//   40   91:aload_2         
	//   41   92:aload_3         
	//   42   93:aload_1         
	//   43   94:invokespecial   #280 <Method void a(Thread, Throwable)>
	//   44   97:return          
	}

	public final void a(Context context, boolean flag)
	{
		ae.b(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc2            #338 <String "context">
	//    2    4:invokestatic    #340 <Method void ae.b(Object, String)>
		try
		{
			context.getSharedPreferences("TruenetJobKey", 0).edit().putBoolean("PrefsEnabled", flag).apply();
	//    3    7:aload_1         
	//    4    8:ldc1            #99  <String "TruenetJobKey">
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #321 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   14:invokeinterface #364 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   19:ldc2            #344 <String "PrefsEnabled">
	//    9   22:iload_2         
	//   10   23:invokeinterface #387 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   28:invokeinterface #373 <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//*  12   33:iload_2         
	//*  13   34:ifeq            55
	//*  14   37:invokestatic    #376 <Method boolean TrueNetSDK.access$getWasInitCalled$cp()>
	//*  15   40:ifne            55
	//*  16   43:aload_0         
	//*  17   44:checkcast       #2   <Class TrueNetSDK$a>
	//*  18   47:aload_1         
	//*  19   48:invokespecial   #378 <Method void a(Context)>
	//*  20   51:iconst_1        
	//*  21   52:invokestatic    #382 <Method void TrueNetSDK.access$setWasInitCalled$cp(boolean)>
	//*  22   55:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  23   56:astore_1        
		{
			TrueNetSDK$a truenetsdk$a = (TrueNetSDK$a)this;
	//   24   57:aload_0         
	//   25   58:checkcast       #2   <Class TrueNetSDK$a>
	//   26   61:astore_3        
			Thread thread = Thread.currentThread();
	//   27   62:invokestatic    #354 <Method Thread Thread.currentThread()>
	//   28   65:astore          4
			ae.a(((Object) (thread)), "Thread.currentThread()");
	//   29   67:aload           4
	//   30   69:ldc2            #356 <String "Thread.currentThread()">
	//   31   72:invokestatic    #259 <Method void ae.a(Object, String)>
			truenetsdk$a.a(thread, ((Throwable) (context)));
	//   32   75:aload_3         
	//   33   76:aload           4
	//   34   78:aload_1         
	//   35   79:invokespecial   #280 <Method void a(Thread, Throwable)>
			return;
	//   36   82:return          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_55;
		if(!TrueNetSDK.access$getWasInitCalled$cp())
		{
			a(context);
			TrueNetSDK.access$setWasInitCalled$cp(true);
		}
	}

	private TrueNetSDK$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public TrueNetSDK$a(ab ab)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void TrueNetSDK$a()>
	//    2    4:return          
	}
}
