// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.e;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.cache:
//			i

static final class i$3
	implements Runnable
{

	public void run()
	{
		try
		{
			i$d i$d1 = (i$d)e.b(a, i.c(), b, com/startapp/android/publish/cache/i$d);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Context a>
	//    2    4:invokestatic    #40  <Method String i.c()>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field String b>
	//    5   11:ldc1            #42  <Class i$d>
	//    6   13:invokestatic    #47  <Method Object e.b(Context, String, String, Class)>
	//    7   16:checkcast       #42  <Class i$d>
	//    8   19:astore_1        
			(new Handler(Looper.getMainLooper())).post(new Runnable(i$d1) {

				public void run()
				{
					try
					{
						if(a == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field i$d a>
				//*   2    4:ifnonnull       52
						{
							g.a("DiskAdCacheManager", 4, (new StringBuilder()).append("File not found or error: ").append(b.b).toString());
				//    3    7:ldc1            #28  <String "DiskAdCacheManager">
				//    4    9:iconst_4        
				//    5   10:new             #30  <Class StringBuilder>
				//    6   13:dup             
				//    7   14:invokespecial   #31  <Method void StringBuilder()>
				//    8   17:ldc1            #33  <String "File not found or error: ">
				//    9   19:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
				//   10   22:aload_0         
				//   11   23:getfield        #19  <Field i$3 b>
				//   12   26:getfield        #40  <Field String i$3.b>
				//   13   29:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
				//   14   32:invokevirtual   #44  <Method String StringBuilder.toString()>
				//   15   35:invokestatic    #49  <Method void g.a(String, int, String)>
							b.c.onFailedToReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (null)));
				//   16   38:aload_0         
				//   17   39:getfield        #19  <Field i$3 b>
				//   18   42:getfield        #53  <Field AdEventListener i$3.c>
				//   19   45:aconst_null     
				//   20   46:invokeinterface #59  <Method void AdEventListener.onFailedToReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
							return;
				//   21   51:return          
						}
					}
				//*  22   52:aload_0         
				//*  23   53:getfield        #21  <Field i$d a>
				//*  24   56:invokevirtual   #64  <Method com.startapp.android.publish.adsCommon.g i$d.a()>
				//*  25   59:ifnull          77
				//*  26   62:aload_0         
				//*  27   63:getfield        #21  <Field i$d a>
				//*  28   66:invokevirtual   #64  <Method com.startapp.android.publish.adsCommon.g i$d.a()>
				//*  29   69:invokeinterface #70  <Method boolean com.startapp.android.publish.adsCommon.g.isReady()>
				//*  30   74:ifne            135
				//*  31   77:ldc1            #28  <String "DiskAdCacheManager">
				//*  32   79:iconst_3        
				//*  33   80:ldc1            #72  <String "Disk ad is not ready or null">
				//*  34   82:invokestatic    #49  <Method void g.a(String, int, String)>
				//*  35   85:aload_0         
				//*  36   86:getfield        #19  <Field i$3 b>
				//*  37   89:getfield        #53  <Field AdEventListener i$3.c>
				//*  38   92:aconst_null     
				//*  39   93:invokeinterface #59  <Method void AdEventListener.onFailedToReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
				//*  40   98:return          
					catch(Exception exception1)
				//*  41   99:astore_1        
					{
						f.a(b.a, d.b, "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception", exception1.getMessage(), "");
				//   42  100:aload_0         
				//   43  101:getfield        #19  <Field i$3 b>
				//   44  104:getfield        #75  <Field Context i$3.a>
				//   45  107:getstatic       #80  <Field d d.b>
				//   46  110:ldc1            #82  <String "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception">
				//   47  112:aload_1         
				//   48  113:invokevirtual   #85  <Method String Exception.getMessage()>
				//   49  116:ldc1            #87  <String "">
				//   50  118:invokestatic    #92  <Method void f.a(Context, d, String, String, String)>
						b.c.onFailedToReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (null)));
				//   51  121:aload_0         
				//   52  122:getfield        #19  <Field i$3 b>
				//   53  125:getfield        #53  <Field AdEventListener i$3.c>
				//   54  128:aconst_null     
				//   55  129:invokeinterface #59  <Method void AdEventListener.onFailedToReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
						return;
				//   56  134:return          
					}
					if(a.a() == null || !a.a().isReady())
					{
						g.a("DiskAdCacheManager", 3, "Disk ad is not ready or null");
						b.c.onFailedToReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (null)));
						return;
					}
					if(a.a().hasAdCacheTtlPassed())
				//*  57  135:aload_0         
				//*  58  136:getfield        #21  <Field i$d a>
				//*  59  139:invokevirtual   #64  <Method com.startapp.android.publish.adsCommon.g i$d.a()>
				//*  60  142:invokeinterface #95  <Method boolean com.startapp.android.publish.adsCommon.g.hasAdCacheTtlPassed()>
				//*  61  147:ifeq            172
					{
						g.a("DiskAdCacheManager", 3, "Disk ad TTL has passed");
				//   62  150:ldc1            #28  <String "DiskAdCacheManager">
				//   63  152:iconst_3        
				//   64  153:ldc1            #97  <String "Disk ad TTL has passed">
				//   65  155:invokestatic    #49  <Method void g.a(String, int, String)>
						b.c.onFailedToReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (null)));
				//   66  158:aload_0         
				//   67  159:getfield        #19  <Field i$3 b>
				//   68  162:getfield        #53  <Field AdEventListener i$3.c>
				//   69  165:aconst_null     
				//   70  166:invokeinterface #59  <Method void AdEventListener.onFailedToReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
						return;
				//   71  171:return          
					}
					i.a(b.a, a, b.d, b.c);
				//   72  172:aload_0         
				//   73  173:getfield        #19  <Field i$3 b>
				//   74  176:getfield        #75  <Field Context i$3.a>
				//   75  179:aload_0         
				//   76  180:getfield        #21  <Field i$d a>
				//   77  183:aload_0         
				//   78  184:getfield        #19  <Field i$3 b>
				//   79  187:getfield        #101 <Field i$a com.startapp.android.publish.cache.i$3.d>
				//   80  190:aload_0         
				//   81  191:getfield        #19  <Field i$3 b>
				//   82  194:getfield        #53  <Field AdEventListener i$3.c>
				//   83  197:invokestatic    #106 <Method void i.a(Context, i$d, i$a, AdEventListener)>
					return;
				//   84  200:return          
				}

				final i.d a;
				final i._cls3 b;

			
			{
				b = i._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field i$3 b>
				a = d1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field i$d a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    9   20:new             #49  <Class Handler>
	//   10   23:dup             
	//   11   24:invokestatic    #55  <Method Looper Looper.getMainLooper()>
	//   12   27:invokespecial   #58  <Method void Handler(Looper)>
	//   13   30:new             #13  <Class i$3$1>
	//   14   33:dup             
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:invokespecial   #61  <Method void i$3$1(i$3, i$d)>
	//   18   39:invokevirtual   #65  <Method boolean Handler.post(Runnable)>
	//   19   42:pop             
			return;
	//   20   43:return          
		}
		catch(Exception exception)
	//*  21   44:astore_1        
		{
			f.a(a, d.b, "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception", exception.getMessage(), "");
	//   22   45:aload_0         
	//   23   46:getfield        #24  <Field Context a>
	//   24   49:getstatic       #70  <Field d d.b>
	//   25   52:ldc1            #72  <String "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception">
	//   26   54:aload_1         
	//   27   55:invokevirtual   #75  <Method String Exception.getMessage()>
	//   28   58:ldc1            #77  <String "">
	//   29   60:invokestatic    #82  <Method void f.a(Context, d, String, String, String)>
		}
		c.onFailedToReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (null)));
	//   30   63:aload_0         
	//   31   64:getfield        #28  <Field AdEventListener c>
	//   32   67:aconst_null     
	//   33   68:invokeinterface #88  <Method void AdEventListener.onFailedToReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
	//   34   73:return          
	}

	final Context a;
	final String b;
	final AdEventListener c;
	final i$a d;

	i$3(Context context, String s, AdEventListener adeventlistener, i$a i$a)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String b>
		c = adeventlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field AdEventListener c>
		d = i$a;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field i$a d>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
