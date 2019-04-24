// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.ab;
import android.support.v7.ad;
import android.support.v7.ae;
import android.support.v7.af;
import android.support.v7.ak;
import android.support.v7.an;
import android.support.v7.au;
import android.support.v7.br;
import android.support.v7.g;
import android.support.v7.v;
import android.support.v7.w;
import android.util.Log;
import com.startapp.common.b.a.a;
import com.startapp.common.b.a.b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.truenet.android:
//			LinksData, Link, c, a, 
//			DeviceInfo, ValidationResults, b, RedirectsResult, 
//			ValidationResult, d

public final class TrueNetSDK
	implements com.startapp.common.b.a.a
{
	public static final class a
	{

		public static final String a(a a1, Context context)
		{
			return a1.b(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #32  <Method String b(Context)>
		//    3    5:areturn         
		}

		private final void a(int i, long l)
		{
			TrueNetSDK.requestDelay = l;
		//    0    0:lload_2         
		//    1    1:invokestatic    #39  <Method void TrueNetSDK.access$setRequestDelay$cp(long)>
			TrueNetSDK.intervalPosition = an.a(i, TrueNetSDK.intervals.size() - 1);
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
		//*  43   92:invokestatic    #112 <Method boolean a(com.startapp.common.b.b)>
		//*  44   95:pop             
		//*  45   96:return          
				i = 0;
		//   46   97:iconst_0        
		//   47   98:istore_1        
			if(i == 0)
		//*  48   99:goto            29
				l = TimeUnit.SECONDS.toMillis(((Number)TrueNetSDK.intervals.get(TrueNetSDK.intervalPosition)).longValue());
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
		//    1    1:invokestatic    #139 <Method com.startapp.common.b.a a(Context)>
		//    2    4:pop             
			com.startapp.common.b.a.a((com.startapp.common.b.a.a)new TrueNetSDK());
		//    3    5:new             #6   <Class TrueNetSDK>
		//    4    8:dup             
		//    5    9:invokespecial   #140 <Method void TrueNetSDK()>
		//    6   12:checkcast       #142 <Class a>
		//    7   15:invokestatic    #145 <Method void a(a)>
			a((a)this, context, 0L, 2, ((Object) (null)));
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
			static final class a.d
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
					$res.a = ((Object) (com.truenet.android.a.g.b(TrueNetSDK.initUrl, com.truenet.android.a.a(TrueNetSDK.Companion, a.d.this.b), a.d.this.b)));
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
				final a.d this$0;

			
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
						a a1 = TrueNetSDK.Companion;
				//   21   45:getstatic       #51  <Field TrueNetSDK$a TrueNetSDK.Companion>
				//   22   48:astore_1        
						Context context = b;
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
						static final class a.d._cls2 extends af
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

							public static final a.d._cls2 a = new a.d._cls2();

							static 
							{
							//    0    0:new             #2   <Class TrueNetSDK$a$d$2>
							//    1    3:dup             
							//    2    4:invokespecial   #22  <Method void TrueNetSDK$a$d$2()>
							//    3    7:putstatic       #24  <Field TrueNetSDK$a$d$2 a>
							//*   4   10:return          
							}

						}

						com.truenet.android.a.a(a1, context, ((String) (obj)), (v)com.truenet.android._cls2.a);
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
						com.truenet.android.a.a(TrueNetSDK.Companion, 0, a);
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

			a.d(long l, Context context)
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

			Executors.newSingleThreadExecutor(TrueNetSDK.threadFactory).execute((Runnable)new d(l, context));
		//    0    0:invokestatic    #153 <Method ThreadFactory TrueNetSDK.access$getThreadFactory$cp()>
		//    1    3:invokestatic    #159 <Method ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
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
			obj = ((Object) (new c(context, (List)obj, TrueNetSDK.threadFactory, linksdata.getMaxRedirectTime(), linksdata.getNumOfRedirect(), linksdata.getValidateParallel())));
		//   26   71:new             #213 <Class c>
		//   27   74:dup             
		//   28   75:aload_1         
		//   29   76:aload           4
		//   30   78:checkcast       #45  <Class List>
		//   31   81:invokestatic    #153 <Method ThreadFactory TrueNetSDK.access$getThreadFactory$cp()>
		//   32   84:aload_2         
		//   33   85:invokevirtual   #216 <Method long LinksData.getMaxRedirectTime()>
		//   34   88:aload_2         
		//   35   89:invokevirtual   #219 <Method int LinksData.getNumOfRedirect()>
		//   36   92:aload_2         
		//   37   93:invokevirtual   #222 <Method int LinksData.getValidateParallel()>
		//   38   96:invokespecial   #225 <Method void c(Context, List, ThreadFactory, long, int, int)>
		//   39   99:astore          4
			obj1 = ((Object) (new ConcurrentLinkedQueue()));
		//   40  101:new             #227 <Class ConcurrentLinkedQueue>
		//   41  104:dup             
		//   42  105:invokespecial   #228 <Method void ConcurrentLinkedQueue()>
		//   43  108:astore          5
			static final class a.a extends af
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
				//   11   27:invokestatic    #69  <Method String com.startapp.common.c.b.a(Object)>
				//   12   30:astore_1        
						URL url = TrueNetSDK.resultUrl;
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
					com.truenet.android.a.a(TrueNetSDK.Companion, $context, $links.getSleep());
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

			a.a(LinksData linksdata, ConcurrentLinkedQueue concurrentlinkedqueue, Context context, v v1)
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
			static final class a.b extends af
				implements w
			{

				public Object a(Object obj, Object obj1)
				{
					a((com.truenet.android.b)obj, ((Number)obj1).intValue());
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
					Object obj = ((Object) ((Iterable)b1.d()));
				//    3    6:aload_1         
				//    4    7:invokevirtual   #62  <Method List b.d()>
				//    5   10:checkcast       #64  <Class Iterable>
				//    6   13:astore          6
					Object obj1 = ((Object) ((Collection)new ArrayList(g.a(((Iterable) (obj)), 10))));
				//    7   15:new             #66  <Class ArrayList>
				//    8   18:dup             
				//    9   19:aload           6
				//   10   21:bipush          10
				//   11   23:invokestatic    #71  <Method int g.a(Iterable, int)>
				//   12   26:invokespecial   #72  <Method void ArrayList(int)>
				//   13   29:checkcast       #74  <Class Collection>
				//   14   32:astore          7
					Object obj2 = ((Object) (((Iterable) (obj)).iterator()));
				//   15   34:aload           6
				//   16   36:invokeinterface #78  <Method Iterator Iterable.iterator()>
				//   17   41:astore          8
					while(((Iterator) (obj2)).hasNext()) 
				//*  18   43:aload           8
				//*  19   45:invokeinterface #84  <Method boolean Iterator.hasNext()>
				//*  20   50:ifeq            135
					{
						obj = ((Object) ((b.b)((Iterator) (obj2)).next()));
				//   21   53:aload           8
				//   22   55:invokeinterface #88  <Method Object Iterator.next()>
				//   23   60:checkcast       #90  <Class b$b>
				//   24   63:astore          6
						RedirectsResult redirectsresult = JVM INSTR new #92  <Class RedirectsResult>;
				//   25   65:new             #92  <Class RedirectsResult>
				//   26   68:astore          9
						String s = ((b.b) (obj)).a();
				//   27   70:aload           6
				//   28   72:invokevirtual   #95  <Method String com.truenet.android.b$b.a()>
				//   29   75:astore          10
						long l = ((b.b) (obj)).b();
				//   30   77:aload           6
				//   31   79:invokevirtual   #98  <Method long com.truenet.android.b$b.b()>
				//   32   82:lstore          4
						int j = ((b.b) (obj)).c();
				//   33   84:aload           6
				//   34   86:invokevirtual   #101 <Method int b$b.c()>
				//   35   89:istore_3        
						obj = ((Object) (((b.b) (obj)).d()));
				//   36   90:aload           6
				//   37   92:invokevirtual   #102 <Method List b$b.d()>
				//   38   95:astore          6
						if(obj == null)
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
							obj = ((Object) (g.a()));
				//   52  127:invokestatic    #111 <Method List g.a()>
				//   53  130:astore          6
						redirectsresult.RedirectsResult(s, l, j, ((List) (obj)));
						((Collection) (obj1)).add(((Object) (redirectsresult)));
					}
				//*  54  132:goto            102
					List list = (List)obj1;
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
					obj = ((Object) (JVM INSTR new #126 <Class ValidationResult>));
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
					obj1 = ((Object) (b1.f()));
				//   79  189:aload_1         
				//   80  190:invokevirtual   #139 <Method String b.f()>
				//   81  193:astore          7
					if(obj1 != null && com.truenet.android.a.g.a(new URL(link.getHtmlStorage()), ((String) (obj1)), $context))
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
						obj1 = ((Object) (link.getHtmlStorage()));
				//   95  225:aload           10
				//   96  227:invokevirtual   #144 <Method String Link.getHtmlStorage()>
				//   97  230:astore          7
						obj2 = obj;
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
						obj2 = obj;
				//  139  317:aload           6
				//  140  319:astore          8
						obj1 = "";
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
					((ValidationResult) (obj)).ValidationResult(s1, i, l1, list, s2, ((String) (obj1)), ((String) (b1)), com.truenet.android.a.b(TrueNetSDK.Companion, $context), link.getMetaData());
					if($links.getBulkResponse())
					{
						$bulkQueue.add(obj2);
						return;
					} else
				//* 146  331:goto            264
					{
						b1 = ((com.truenet.android.b) (com.startapp.common.c.b.a(((Object) (new ValidationResults(g.a(obj2)))))));
				//  147  334:new             #186 <Class ValidationResults>
				//  148  337:dup             
				//  149  338:aload           8
				//  150  340:invokestatic    #189 <Method List g.a(Object)>
				//  151  343:invokespecial   #192 <Method void ValidationResults(List)>
				//  152  346:invokestatic    #197 <Method String com.startapp.common.c.b.a(Object)>
				//  153  349:astore_1        
						URL url = TrueNetSDK.resultUrl;
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

			a.b(LinksData linksdata, Context context, ConcurrentLinkedQueue concurrentlinkedqueue)
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
			TrueNetSDK.intervalPosition = 0;
		//    0    0:iconst_0        
		//    1    1:invokestatic    #58  <Method void TrueNetSDK.access$setIntervalPosition$cp(int)>
			TrueNetSDK.requestDelay = 0L;
		//    2    4:lconst_0        
		//    3    5:invokestatic    #39  <Method void TrueNetSDK.access$setRequestDelay$cp(long)>
			s = ((String) ((LinksData)com.startapp.common.c.b.a(s, com/truenet/android/LinksData)));
		//    4    8:aload_2         
		//    5    9:ldc1            #173 <Class LinksData>
		//    6   11:invokestatic    #252 <Method Object com.startapp.common.c.b.a(String, Class)>
		//    7   14:checkcast       #173 <Class LinksData>
		//    8   17:astore_2        
			((LinksData) (s)).getValidation().size();
		//    9   18:aload_2         
		//   10   19:invokevirtual   #176 <Method List LinksData.getValidation()>
		//   11   22:invokeinterface #49  <Method int List.size()>
			JVM INSTR tableswitch 0 0: default 44
		//		               0 65;
		//   12   27:tableswitch     0 0: default 44
		//		               0 65
			   goto _L1 _L2
_L1:
			a a1 = (a)this;
		//   13   44:aload_0         
		//   14   45:checkcast       #2   <Class TrueNetSDK$a>
		//   15   48:astore          4
			ae.a(((Object) (s)), "response");
		//   16   50:aload_2         
		//   17   51:ldc1            #254 <String "response">
		//   18   53:invokestatic    #259 <Method void ae.a(Object, String)>
			a1.a(context, ((LinksData) (s)), v1);
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

		public static final void a(a a1, int i, long l)
		{
			a1.a(i, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:lload_2         
		//    3    3:invokespecial   #272 <Method void a(int, long)>
		//    4    6:return          
		}

		public static final void a(a a1, Context context, long l)
		{
			a1.a(context, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:invokespecial   #266 <Method void a(Context, long)>
		//    4    6:return          
		}

		static volatile void a(a a1, Context context, long l, int i, Object obj)
		{
			if((i & 2) != 0)
		//*   0    0:iload           4
		//*   1    2:iconst_2        
		//*   2    3:iand            
		//*   3    4:ifeq            9
				l = 0L;
		//    4    7:lconst_0        
		//    5    8:lstore_2        
			a1.a(context, l);
		//    6    9:aload_0         
		//    7   10:aload_1         
		//    8   11:lload_2         
		//    9   12:invokespecial   #266 <Method void a(Context, long)>
		//   10   15:return          
		}

		public static final void a(a a1, Context context, String s, v v1)
		{
			a1.a(context, s, v1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #276 <Method void a(Context, String, v)>
		//    5    7:return          
		}

		public static final void a(a a1, Thread thread, Throwable throwable)
		{
			a1.a(thread, throwable);
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
		//   16   28:invokestatic    #313 <Method String com.startapp.common.c.b.a(Object)>
		//   17   31:astore_1        
			ae.a(((Object) (context)), "JSONParser.toJson(info)");
		//   18   32:aload_1         
		//   19   33:ldc2            #315 <String "JSONParser.toJson(info)">
		//   20   36:invokestatic    #259 <Method void ae.a(Object, String)>
			return ((String) (context));
		//   21   39:aload_1         
		//   22   40:areturn         
		}

		public static final String b(a a1, Context context)
		{
			return a1.c(context);
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
				static final class a.c
					implements Runnable
				{

					public final void run()
					{
						boolean flag;
						Object obj;
						if(TrueNetSDK.requestDelay != 0L)
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
						obj = ((Object) (com.truenet.android.a.g.b(TrueNetSDK.initUrl, com.truenet.android.a.a(TrueNetSDK.Companion, a), a)));
						if(obj != null)
						{
							com.truenet.android.a.a(TrueNetSDK.Companion, a, ((String) (obj)), b);
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
							i = TrueNetSDK.intervalPosition;
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
							i = TrueNetSDK.intervalPosition + 1;
					//   43   85:invokestatic    #53  <Method int TrueNetSDK.access$getIntervalPosition$cp()>
					//   44   88:iconst_1        
					//   45   89:iadd            
					//   46   90:istore_1        
						com.truenet.android.a.a(((a) (obj)), i, 0L);
						b.a();
					//*  47   91:goto            68
					}

					final Context a;
					final v b;

			a.c(Context context, v v1)
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

				Executors.newSingleThreadExecutor(TrueNetSDK.threadFactory).execute((Runnable)new c(context, v1));
		//   18   41:invokestatic    #153 <Method ThreadFactory TrueNetSDK.access$getThreadFactory$cp()>
		//   19   44:invokestatic    #159 <Method ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
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
				v1 = ((v) ((a)this));
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
			((a) (v1)).a(thread, ((Throwable) (context)));
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
				if(sharedpreferences.getBoolean("PrefsEnabled", true) && !TrueNetSDK.wasInitCalled)
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
					TrueNetSDK.wasInitCalled = true;
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
				s = ((String) ((a)this));
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
			((a) (s)).a(thread, ((Throwable) (context)));
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
				a a1 = (a)this;
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
				a1.a(thread, ((Throwable) (context)));
		//   32   75:aload_3         
		//   33   76:aload           4
		//   34   78:aload_1         
		//   35   79:invokespecial   #280 <Method void a(Thread, Throwable)>
				return;
		//   36   82:return          
			}
			if(!flag)
				break MISSING_BLOCK_LABEL_55;
			if(!TrueNetSDK.wasInitCalled)
			{
				a(context);
				TrueNetSDK.wasInitCalled = true;
			}
		}

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}

		public a(ab ab)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void TrueNetSDK$a()>
		//    2    4:return          
		}
	}


	public TrueNetSDK()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void Object()>
	//    2    4:return          
	}

	public static final void enable(Context context, boolean flag)
	{
		Companion.a(context, flag);
	//    0    0:getstatic       #73  <Field TrueNetSDK$a Companion>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #196 <Method void com.truenet.android.TrueNetSDK$a.a(Context, boolean)>
	//    4    8:return          
	}

	public static final void with(Context context, String s)
	{
		Companion.a(context, s);
	//    0    0:getstatic       #73  <Field TrueNetSDK$a Companion>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #200 <Method void com.truenet.android.TrueNetSDK$a.a(Context, String)>
	//    4    8:return          
	}

	public b create(int i)
	{
		Log.d("JobManager", "addJobCreator");
	//    0    0:ldc1            #204 <String "JobManager">
	//    1    2:ldc1            #206 <String "addJobCreator">
	//    2    4:invokestatic    #212 <Method int Log.d(String, String)>
	//    3    7:pop             
		static final class c
			implements b
		{

			public final void a(Context context, int j, Map map, com.startapp.common.b.a.b.b b1)
			{
				TrueNetSDK truenetsdk = a;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field TrueNetSDK a>
			//    2    4:astore          5
				truenetsdk;
			//    3    6:aload           5
				JVM INSTR monitorenter ;
			//    4    8:monitorenter    
				if(ae.a(((Object) ((String)map.get("TruenetCheckLinksJob"))), "TruenetJobKey"))
			//*   5    9:aload_3         
			//*   6   10:ldc1            #26  <String "TruenetCheckLinksJob">
			//*   7   12:invokeinterface #32  <Method Object Map.get(Object)>
			//*   8   17:checkcast       #34  <Class String>
			//*   9   20:ldc1            #36  <String "TruenetJobKey">
			//*  10   22:invokestatic    #41  <Method boolean ae.a(Object, Object)>
			//*  11   25:ifeq            60
				{
					a a1 = TrueNetSDK.Companion;
			//   12   28:getstatic       #45  <Field TrueNetSDK$a TrueNetSDK.Companion>
			//   13   31:astore          6
					ae.a(((Object) (context)), "context");
			//   14   33:aload_1         
			//   15   34:ldc1            #47  <String "context">
			//   16   36:invokestatic    #50  <Method void ae.a(Object, String)>
					static final class c.a extends af
						implements v
					{

						public Object a()
						{
							b();
						//    0    0:aload_0         
						//    1    1:invokevirtual   #39  <Method void b()>
							return ((Object) (br.a));
						//    2    4:getstatic       #44  <Field br br.a>
						//    3    7:areturn         
						}

						public final void b()
						{
							Log.d("JobManager", (new StringBuilder()).append("finished ").append(String.valueOf($jobId$inlined)).toString());
						//    0    0:ldc1            #46  <String "JobManager">
						//    1    2:new             #48  <Class StringBuilder>
						//    2    5:dup             
						//    3    6:invokespecial   #50  <Method void StringBuilder()>
						//    4    9:ldc1            #52  <String "finished ">
						//    5   11:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
						//    6   14:aload_0         
						//    7   15:getfield        #28  <Field int $jobId$inlined>
						//    8   18:invokestatic    #62  <Method String String.valueOf(int)>
						//    9   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
						//   10   24:invokevirtual   #66  <Method String StringBuilder.toString()>
						//   11   27:invokestatic    #72  <Method int Log.d(String, String)>
						//   12   30:pop             
							$runnerListener$inlined.a(com.startapp.common.b.a.b.a.a);
						//   13   31:aload_0         
						//   14   32:getfield        #30  <Field com.startapp.common.b.a.b$b $runnerListener$inlined>
						//   15   35:getstatic       #77  <Field com.startapp.common.b.a.b$a com.startapp.common.b.a.b$a.a>
						//   16   38:invokeinterface #82  <Method void com.startapp.common.b.a.b$b.a(com.startapp.common.b.a.b$a)>
						//   17   43:return          
						}

						final Context $context$inlined;
						final Map $extras$inlined;
						final int $jobId$inlined;
						final com.startapp.common.b.a.b.b $runnerListener$inlined;

			c.a(Map map, Context context, int i, com.startapp.common.b.a.b.b b1)
			{
				$extras$inlined = map;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field Map $extras$inlined>
				$context$inlined = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Context $context$inlined>
				$jobId$inlined = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field int $jobId$inlined>
				$runnerListener$inlined = b1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field com.startapp.common.b.a.b$b $runnerListener$inlined>
				super(0);
			//   12   21:aload_0         
			//   13   22:iconst_0        
			//   14   23:invokespecial   #33  <Method void af(int)>
			//   15   26:return          
			}
					}

					a1.a(context, (v)new a(map, context, j, b1));
			//   17   39:aload           6
			//   18   41:aload_1         
			//   19   42:new             #13  <Class TrueNetSDK$c$a>
			//   20   45:dup             
			//   21   46:aload_3         
			//   22   47:aload_1         
			//   23   48:iload_2         
			//   24   49:aload           4
			//   25   51:invokespecial   #53  <Method void TrueNetSDK$c$a(Map, Context, int, com.startapp.common.b.a.b$b)>
			//   26   54:checkcast       #55  <Class v>
			//   27   57:invokevirtual   #60  <Method void com.truenet.android.TrueNetSDK$a.a(Context, v)>
				}
				context = ((Context) (br.a));
			//   28   60:getstatic       #65  <Field br br.a>
			//   29   63:astore_1        
				truenetsdk;
			//   30   64:aload           5
				JVM INSTR monitorexit ;
			//   31   66:monitorexit     
				return;
			//   32   67:return          
				context;
			//   33   68:astore_1        
			//*  34   69:aload           5
				throw context;
			//   35   71:monitorexit     
			//   36   72:aload_1         
			//   37   73:athrow          
			}

			final TrueNetSDK a;

			c(TrueNetSDK truenetsdk)
			{
				a = truenetsdk;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TrueNetSDK a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}

		return (b)new c(this);
	//    4    8:new             #27  <Class TrueNetSDK$c>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #215 <Method void TrueNetSDK$c(TrueNetSDK)>
	//    8   16:checkcast       #217 <Class b>
	//    9   19:areturn         
	}

	private static final String BASE_INIT_URL = new String(new char[] {
		'h', 't', 't', 'p', 's', ':', '/', '/', 'v', 'a', 
		'l', 'i', 'd', 'a', 't', 'i', 'o', 'n', '-', 'e', 
		'n', 'g', 'i', 'n', 'e', '.', 't', 'r', 'u', 'e', 
		'n', 'e', 't', '.', 'a', 'i'
	});
	private static final String BASE_RESULT_URL = new String(new char[] {
		'h', 't', 't', 'p', 's', ':', '/', '/', 'r', 'e', 
		's', 'u', 'l', 't', '-', 'a', 'p', 'i', '.', 't', 
		'r', 'u', 'e', 'n', 'e', 't', '.', 'a', 'i'
	});
	public static final a Companion = new a(((ab) (null)));
	private static final String INIT_URL = (new StringBuilder()).append(BASE_INIT_URL).append("/api/initial").toString();
	private static final int JOB_ID = 101;
	public static final String JOB_TAG = "TruenetCheckLinksJob";
	private static final String PREFS_ENABLED = "PrefsEnabled";
	private static final String PREFS_PUBLISHER_ID = "PrefsPublisherId";
	public static final String PREFS_TAG = "TruenetJobKey";
	private static final String RESULT_URL = (new StringBuilder()).append(BASE_RESULT_URL).append("/api/result").toString();
	private static final URL initUrl = new URL(INIT_URL);
	private static int intervalPosition;
	private static final List intervals = g.a(((Object []) (new Long[] {
		Long.valueOf(5L), Long.valueOf(100L), Long.valueOf(150L), Long.valueOf(200L), Long.valueOf(250L), Long.valueOf(1800L)
	})));
	private static long requestDelay;
	private static final URL resultUrl = new URL(RESULT_URL);
	private static ThreadFactory threadFactory;
	private static boolean wasInitCalled;

	static 
	{
	//    0    0:new             #8   <Class TrueNetSDK$a>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #71  <Method void TrueNetSDK$a(ab)>
	//    4    8:putstatic       #73  <Field TrueNetSDK$a Companion>
	//    5   11:new             #75  <Class String>
	//    6   14:dup             
	//    7   15:bipush          36
	//    8   17:newarray        char[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc1            #76  <Int 104>
	//   12   23:castore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:ldc1            #77  <Int 116>
	//   16   28:castore         
	//   17   29:dup             
	//   18   30:iconst_2        
	//   19   31:ldc1            #77  <Int 116>
	//   20   33:castore         
	//   21   34:dup             
	//   22   35:iconst_3        
	//   23   36:ldc1            #78  <Int 112>
	//   24   38:castore         
	//   25   39:dup             
	//   26   40:iconst_4        
	//   27   41:ldc1            #79  <Int 115>
	//   28   43:castore         
	//   29   44:dup             
	//   30   45:iconst_5        
	//   31   46:ldc1            #80  <Int 58>
	//   32   48:castore         
	//   33   49:dup             
	//   34   50:bipush          6
	//   35   52:ldc1            #81  <Int 47>
	//   36   54:castore         
	//   37   55:dup             
	//   38   56:bipush          7
	//   39   58:ldc1            #81  <Int 47>
	//   40   60:castore         
	//   41   61:dup             
	//   42   62:bipush          8
	//   43   64:ldc1            #82  <Int 118>
	//   44   66:castore         
	//   45   67:dup             
	//   46   68:bipush          9
	//   47   70:ldc1            #83  <Int 97>
	//   48   72:castore         
	//   49   73:dup             
	//   50   74:bipush          10
	//   51   76:ldc1            #84  <Int 108>
	//   52   78:castore         
	//   53   79:dup             
	//   54   80:bipush          11
	//   55   82:ldc1            #85  <Int 105>
	//   56   84:castore         
	//   57   85:dup             
	//   58   86:bipush          12
	//   59   88:ldc1            #86  <Int 100>
	//   60   90:castore         
	//   61   91:dup             
	//   62   92:bipush          13
	//   63   94:ldc1            #83  <Int 97>
	//   64   96:castore         
	//   65   97:dup             
	//   66   98:bipush          14
	//   67  100:ldc1            #77  <Int 116>
	//   68  102:castore         
	//   69  103:dup             
	//   70  104:bipush          15
	//   71  106:ldc1            #85  <Int 105>
	//   72  108:castore         
	//   73  109:dup             
	//   74  110:bipush          16
	//   75  112:ldc1            #87  <Int 111>
	//   76  114:castore         
	//   77  115:dup             
	//   78  116:bipush          17
	//   79  118:ldc1            #88  <Int 110>
	//   80  120:castore         
	//   81  121:dup             
	//   82  122:bipush          18
	//   83  124:ldc1            #89  <Int 45>
	//   84  126:castore         
	//   85  127:dup             
	//   86  128:bipush          19
	//   87  130:ldc1            #38  <Int 101>
	//   88  132:castore         
	//   89  133:dup             
	//   90  134:bipush          20
	//   91  136:ldc1            #88  <Int 110>
	//   92  138:castore         
	//   93  139:dup             
	//   94  140:bipush          21
	//   95  142:ldc1            #90  <Int 103>
	//   96  144:castore         
	//   97  145:dup             
	//   98  146:bipush          22
	//   99  148:ldc1            #85  <Int 105>
	//  100  150:castore         
	//  101  151:dup             
	//  102  152:bipush          23
	//  103  154:ldc1            #88  <Int 110>
	//  104  156:castore         
	//  105  157:dup             
	//  106  158:bipush          24
	//  107  160:ldc1            #38  <Int 101>
	//  108  162:castore         
	//  109  163:dup             
	//  110  164:bipush          25
	//  111  166:ldc1            #91  <Int 46>
	//  112  168:castore         
	//  113  169:dup             
	//  114  170:bipush          26
	//  115  172:ldc1            #77  <Int 116>
	//  116  174:castore         
	//  117  175:dup             
	//  118  176:bipush          27
	//  119  178:ldc1            #92  <Int 114>
	//  120  180:castore         
	//  121  181:dup             
	//  122  182:bipush          28
	//  123  184:ldc1            #93  <Int 117>
	//  124  186:castore         
	//  125  187:dup             
	//  126  188:bipush          29
	//  127  190:ldc1            #38  <Int 101>
	//  128  192:castore         
	//  129  193:dup             
	//  130  194:bipush          30
	//  131  196:ldc1            #88  <Int 110>
	//  132  198:castore         
	//  133  199:dup             
	//  134  200:bipush          31
	//  135  202:ldc1            #38  <Int 101>
	//  136  204:castore         
	//  137  205:dup             
	//  138  206:bipush          32
	//  139  208:ldc1            #77  <Int 116>
	//  140  210:castore         
	//  141  211:dup             
	//  142  212:bipush          33
	//  143  214:ldc1            #91  <Int 46>
	//  144  216:castore         
	//  145  217:dup             
	//  146  218:bipush          34
	//  147  220:ldc1            #83  <Int 97>
	//  148  222:castore         
	//  149  223:dup             
	//  150  224:bipush          35
	//  151  226:ldc1            #85  <Int 105>
	//  152  228:castore         
	//  153  229:invokespecial   #96  <Method void String(char[])>
	//  154  232:putstatic       #98  <Field String BASE_INIT_URL>
	//  155  235:new             #75  <Class String>
	//  156  238:dup             
	//  157  239:bipush          29
	//  158  241:newarray        char[]
	//  159  243:dup             
	//  160  244:iconst_0        
	//  161  245:ldc1            #76  <Int 104>
	//  162  247:castore         
	//  163  248:dup             
	//  164  249:iconst_1        
	//  165  250:ldc1            #77  <Int 116>
	//  166  252:castore         
	//  167  253:dup             
	//  168  254:iconst_2        
	//  169  255:ldc1            #77  <Int 116>
	//  170  257:castore         
	//  171  258:dup             
	//  172  259:iconst_3        
	//  173  260:ldc1            #78  <Int 112>
	//  174  262:castore         
	//  175  263:dup             
	//  176  264:iconst_4        
	//  177  265:ldc1            #79  <Int 115>
	//  178  267:castore         
	//  179  268:dup             
	//  180  269:iconst_5        
	//  181  270:ldc1            #80  <Int 58>
	//  182  272:castore         
	//  183  273:dup             
	//  184  274:bipush          6
	//  185  276:ldc1            #81  <Int 47>
	//  186  278:castore         
	//  187  279:dup             
	//  188  280:bipush          7
	//  189  282:ldc1            #81  <Int 47>
	//  190  284:castore         
	//  191  285:dup             
	//  192  286:bipush          8
	//  193  288:ldc1            #92  <Int 114>
	//  194  290:castore         
	//  195  291:dup             
	//  196  292:bipush          9
	//  197  294:ldc1            #38  <Int 101>
	//  198  296:castore         
	//  199  297:dup             
	//  200  298:bipush          10
	//  201  300:ldc1            #79  <Int 115>
	//  202  302:castore         
	//  203  303:dup             
	//  204  304:bipush          11
	//  205  306:ldc1            #93  <Int 117>
	//  206  308:castore         
	//  207  309:dup             
	//  208  310:bipush          12
	//  209  312:ldc1            #84  <Int 108>
	//  210  314:castore         
	//  211  315:dup             
	//  212  316:bipush          13
	//  213  318:ldc1            #77  <Int 116>
	//  214  320:castore         
	//  215  321:dup             
	//  216  322:bipush          14
	//  217  324:ldc1            #89  <Int 45>
	//  218  326:castore         
	//  219  327:dup             
	//  220  328:bipush          15
	//  221  330:ldc1            #83  <Int 97>
	//  222  332:castore         
	//  223  333:dup             
	//  224  334:bipush          16
	//  225  336:ldc1            #78  <Int 112>
	//  226  338:castore         
	//  227  339:dup             
	//  228  340:bipush          17
	//  229  342:ldc1            #85  <Int 105>
	//  230  344:castore         
	//  231  345:dup             
	//  232  346:bipush          18
	//  233  348:ldc1            #91  <Int 46>
	//  234  350:castore         
	//  235  351:dup             
	//  236  352:bipush          19
	//  237  354:ldc1            #77  <Int 116>
	//  238  356:castore         
	//  239  357:dup             
	//  240  358:bipush          20
	//  241  360:ldc1            #92  <Int 114>
	//  242  362:castore         
	//  243  363:dup             
	//  244  364:bipush          21
	//  245  366:ldc1            #93  <Int 117>
	//  246  368:castore         
	//  247  369:dup             
	//  248  370:bipush          22
	//  249  372:ldc1            #38  <Int 101>
	//  250  374:castore         
	//  251  375:dup             
	//  252  376:bipush          23
	//  253  378:ldc1            #88  <Int 110>
	//  254  380:castore         
	//  255  381:dup             
	//  256  382:bipush          24
	//  257  384:ldc1            #38  <Int 101>
	//  258  386:castore         
	//  259  387:dup             
	//  260  388:bipush          25
	//  261  390:ldc1            #77  <Int 116>
	//  262  392:castore         
	//  263  393:dup             
	//  264  394:bipush          26
	//  265  396:ldc1            #91  <Int 46>
	//  266  398:castore         
	//  267  399:dup             
	//  268  400:bipush          27
	//  269  402:ldc1            #83  <Int 97>
	//  270  404:castore         
	//  271  405:dup             
	//  272  406:bipush          28
	//  273  408:ldc1            #85  <Int 105>
	//  274  410:castore         
	//  275  411:invokespecial   #96  <Method void String(char[])>
	//  276  414:putstatic       #100 <Field String BASE_RESULT_URL>
	//  277  417:new             #102 <Class StringBuilder>
	//  278  420:dup             
	//  279  421:invokespecial   #104 <Method void StringBuilder()>
	//  280  424:getstatic       #98  <Field String BASE_INIT_URL>
	//  281  427:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  282  430:ldc1            #110 <String "/api/initial">
	//  283  432:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  284  435:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  285  438:putstatic       #116 <Field String INIT_URL>
	//  286  441:new             #102 <Class StringBuilder>
	//  287  444:dup             
	//  288  445:invokespecial   #104 <Method void StringBuilder()>
	//  289  448:getstatic       #100 <Field String BASE_RESULT_URL>
	//  290  451:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  291  454:ldc1            #118 <String "/api/result">
	//  292  456:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  293  459:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  294  462:putstatic       #120 <Field String RESULT_URL>
	//  295  465:new             #122 <Class URL>
	//  296  468:dup             
	//  297  469:getstatic       #116 <Field String INIT_URL>
	//  298  472:invokespecial   #125 <Method void URL(String)>
	//  299  475:putstatic       #127 <Field URL initUrl>
	//  300  478:new             #122 <Class URL>
	//  301  481:dup             
	//  302  482:getstatic       #120 <Field String RESULT_URL>
	//  303  485:invokespecial   #125 <Method void URL(String)>
	//  304  488:putstatic       #129 <Field URL resultUrl>
	//  305  491:bipush          6
	//  306  493:anewarray       Long[]
	//  307  496:dup             
	//  308  497:iconst_0        
	//  309  498:ldc2w           #132 <Long 5L>
	//  310  501:invokestatic    #137 <Method Long Long.valueOf(long)>
	//  311  504:aastore         
	//  312  505:dup             
	//  313  506:iconst_1        
	//  314  507:ldc2w           #138 <Long 100L>
	//  315  510:invokestatic    #137 <Method Long Long.valueOf(long)>
	//  316  513:aastore         
	//  317  514:dup             
	//  318  515:iconst_2        
	//  319  516:ldc2w           #140 <Long 150L>
	//  320  519:invokestatic    #137 <Method Long Long.valueOf(long)>
	//  321  522:aastore         
	//  322  523:dup             
	//  323  524:iconst_3        
	//  324  525:ldc2w           #142 <Long 200L>
	//  325  528:invokestatic    #137 <Method Long Long.valueOf(long)>
	//  326  531:aastore         
	//  327  532:dup             
	//  328  533:iconst_4        
	//  329  534:ldc2w           #144 <Long 250L>
	//  330  537:invokestatic    #137 <Method Long Long.valueOf(long)>
	//  331  540:aastore         
	//  332  541:dup             
	//  333  542:iconst_5        
	//  334  543:ldc2w           #146 <Long 1800L>
	//  335  546:invokestatic    #137 <Method Long Long.valueOf(long)>
	//  336  549:aastore         
	//  337  550:invokestatic    #152 <Method List g.a(Object[])>
	//  338  553:putstatic       #154 <Field List intervals>
		static final class b
			implements ThreadFactory
		{

			public final Thread newThread(Runnable runnable)
			{
				runnable = ((Runnable) (new Thread(runnable)));
			//    0    0:new             #26  <Class Thread>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #29  <Method void Thread(Runnable)>
			//    4    8:astore_1        
				((Thread) (runnable)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new d((w)new w(TrueNetSDK.Companion) {

					public final au a()
					{
						return ((au) (ak.a(com/truenet/android/TrueNetSDK$a)));
					//    0    0:ldc1            #22  <Class TrueNetSDK$a>
					//    1    2:invokestatic    #27  <Method android.support.v7.at ak.a(Class)>
					//    2    5:areturn         
					}

					public volatile Object a(Object obj, Object obj1)
					{
						a((Thread)obj, (Throwable)obj1);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #30  <Class Thread>
					//    3    5:aload_2         
					//    4    6:checkcast       #32  <Class Throwable>
					//    5    9:invokevirtual   #35  <Method void a(Thread, Throwable)>
						return ((Object) (br.a));
					//    6   12:getstatic       #40  <Field br br.a>
					//    7   15:areturn         
					}

					public final void a(Thread thread, Throwable throwable)
					{
						ae.b(((Object) (thread)), "p1");
					//    0    0:aload_1         
					//    1    1:ldc1            #43  <String "p1">
					//    2    3:invokestatic    #49  <Method void ae.b(Object, String)>
						ae.b(((Object) (throwable)), "p2");
					//    3    6:aload_2         
					//    4    7:ldc1            #51  <String "p2">
					//    5    9:invokestatic    #49  <Method void ae.b(Object, String)>
						com.truenet.android.a.a((a)receiver, thread, throwable);
					//    6   12:aload_0         
					//    7   13:getfield        #55  <Field Object receiver>
					//    8   16:checkcast       #22  <Class TrueNetSDK$a>
					//    9   19:aload_1         
					//   10   20:aload_2         
					//   11   21:invokestatic    #58  <Method void com.truenet.android.TrueNetSDK$a.a(TrueNetSDK$a, Thread, Throwable)>
					//   12   24:return          
					}

					public final String b()
					{
						return "uncaughtExceptionHandler";
					//    0    0:ldc1            #62  <String "uncaughtExceptionHandler">
					//    1    2:areturn         
					}

					public final String c()
					{
						return "uncaughtExceptionHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)V";
					//    0    0:ldc1            #65  <String "uncaughtExceptionHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)V">
					//    1    2:areturn         
					}

			
			{
			//    0    0:aload_0         
			//    1    1:iconst_2        
			//    2    2:aload_1         
			//    3    3:invokespecial   #17  <Method void ad(int, Object)>
			//    4    6:return          
			}
				}
));
			//    5    9:aload_1         
			//    6   10:new             #31  <Class d>
			//    7   13:dup             
			//    8   14:new             #10  <Class TrueNetSDK$b$1>
			//    9   17:dup             
			//   10   18:getstatic       #35  <Field TrueNetSDK$a TrueNetSDK.Companion>
			//   11   21:invokespecial   #38  <Method void TrueNetSDK$b$1(TrueNetSDK$a)>
			//   12   24:checkcast       #40  <Class w>
			//   13   27:invokespecial   #43  <Method void d(w)>
			//   14   30:checkcast       #45  <Class Thread$UncaughtExceptionHandler>
			//   15   33:invokevirtual   #49  <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
				return ((Thread) (runnable));
			//   16   36:aload_1         
			//   17   37:areturn         
			}

			public static final b a = new b();

			static 
			{
			//    0    0:new             #2   <Class TrueNetSDK$b>
			//    1    3:dup             
			//    2    4:invokespecial   #17  <Method void TrueNetSDK$b()>
			//    3    7:putstatic       #19  <Field TrueNetSDK$b a>
			//*   4   10:return          
			}

			b()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #21  <Method void Object()>
			//    2    4:return          
			}
		}

		threadFactory = (ThreadFactory)com.truenet.android.b.a;
	//  339  556:getstatic       #157 <Field TrueNetSDK$b com.truenet.android.TrueNetSDK$b.a>
	//  340  559:checkcast       #159 <Class ThreadFactory>
	//  341  562:putstatic       #161 <Field ThreadFactory threadFactory>
	//* 342  565:return          
	}


/*
	public static final URL access$getInitUrl$cp()
	{
		return initUrl;
	//    0    0:getstatic       #127 <Field URL initUrl>
	//    1    3:areturn         
	}

*/


/*
	public static final int access$getIntervalPosition$cp()
	{
		return intervalPosition;
	//    0    0:getstatic       #170 <Field int intervalPosition>
	//    1    3:ireturn         
	}

*/


/*
	public static final List access$getIntervals$cp()
	{
		return intervals;
	//    0    0:getstatic       #154 <Field List intervals>
	//    1    3:areturn         
	}

*/


/*
	public static final long access$getRequestDelay$cp()
	{
		return requestDelay;
	//    0    0:getstatic       #176 <Field long requestDelay>
	//    1    3:lreturn         
	}

*/


/*
	public static final URL access$getResultUrl$cp()
	{
		return resultUrl;
	//    0    0:getstatic       #129 <Field URL resultUrl>
	//    1    3:areturn         
	}

*/


/*
	public static final ThreadFactory access$getThreadFactory$cp()
	{
		return threadFactory;
	//    0    0:getstatic       #161 <Field ThreadFactory threadFactory>
	//    1    3:areturn         
	}

*/


/*
	public static final boolean access$getWasInitCalled$cp()
	{
		return wasInitCalled;
	//    0    0:getstatic       #183 <Field boolean wasInitCalled>
	//    1    3:ireturn         
	}

*/


/*
	public static final void access$setIntervalPosition$cp(int i)
	{
		intervalPosition = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #170 <Field int intervalPosition>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setRequestDelay$cp(long l)
	{
		requestDelay = l;
	//    0    0:lload_0         
	//    1    1:putstatic       #176 <Field long requestDelay>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setThreadFactory$cp(ThreadFactory threadfactory)
	{
		threadFactory = threadfactory;
	//    0    0:aload_0         
	//    1    1:putstatic       #161 <Field ThreadFactory threadFactory>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setWasInitCalled$cp(boolean flag)
	{
		wasInitCalled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #183 <Field boolean wasInitCalled>
		return;
	//    2    4:return          
	}

*/
}
