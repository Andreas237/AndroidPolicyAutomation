// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			q, s

class q$1$1
	implements Runnable
{

	public void run()
	{
		try
		{
			ConnectivityManager connectivitymanager = (ConnectivityManager)a.getSystemService("connectivity");
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Context a>
	//    2    4:ldc1            #38  <String "connectivity">
	//    3    6:invokevirtual   #44  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #46  <Class ConnectivityManager>
	//    5   12:astore_1        
			q.a(d.b).a(b, connectivitymanager);
	//    6   13:aload_0         
	//    7   14:getfield        #23  <Field q$1 d>
	//    8   17:getfield        #49  <Field q q$1.b>
	//    9   20:invokestatic    #54  <Method s q.a(q)>
	//   10   23:aload_0         
	//   11   24:getfield        #27  <Field Intent b>
	//   12   27:aload_1         
	//   13   28:invokeinterface #59  <Method void s.a(Intent, ConnectivityManager)>
			d.b.c();
	//   14   33:aload_0         
	//   15   34:getfield        #23  <Field q$1 d>
	//   16   37:getfield        #49  <Field q q$1.b>
	//   17   40:invokevirtual   #61  <Method void q.c()>
		}
	//*  18   43:goto            75
		catch(Exception exception)
	//*  19   46:astore_1        
		{
			AppboyLogger.e(q.f(), "Failed to process connectivity event.", ((Throwable) (exception)));
	//   20   47:invokestatic    #65  <Method String q.f()>
	//   21   50:ldc1            #67  <String "Failed to process connectivity event.">
	//   22   52:aload_1         
	//   23   53:invokestatic    #73  <Method int AppboyLogger.e(String, String, Throwable)>
	//   24   56:pop             
			q.a(d.b, d.a, ((Throwable) (exception)));
	//   25   57:aload_0         
	//   26   58:getfield        #23  <Field q$1 d>
	//   27   61:getfield        #49  <Field q q$1.b>
	//   28   64:aload_0         
	//   29   65:getfield        #23  <Field q$1 d>
	//   30   68:getfield        #76  <Field ad q$1.a>
	//   31   71:aload_1         
	//   32   72:invokestatic    #79  <Method void q.a(q, ad, Throwable)>
		}
		c.finish();
	//   33   75:aload_0         
	//   34   76:getfield        #29  <Field android.content.BroadcastReceiver$PendingResult c>
	//   35   79:invokevirtual   #84  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
	//   36   82:return          
	}

	final Context a;
	final Intent b;
	final android.content.astReceiver.PendingResult c;
	final q._cls1 d;

	q$1$1(q._cls1 _pcls1, Context context, Intent intent, android.content.astReceiver.PendingResult pendingresult)
	{
		d = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field q$1 d>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Context a>
		b = intent;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Intent b>
		c = pendingresult;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field android.content.BroadcastReceiver$PendingResult c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}

	// Unreferenced inner class com/google/ads/interactivemedia/v3/impl/q$1

/* anonymous class */
	class q._cls1
	{

		static final int a[];

		static 
		{
			a = new int[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.values().length];
		//    0    0:invokestatic    #18  <Method com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.values()>
		//    1    3:arraylength     
		//    2    4:newarray        int[]
		//    3    6:putstatic       #20  <Field int[] a>
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.LOADED.ordinal()] = 1;
		//    4    9:getstatic       #20  <Field int[] a>
		//    5   12:getstatic       #24  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.LOADED>
		//    6   15:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//    7   18:iconst_1        
		//    8   19:iastore         
			}
		//*   9   20:getstatic       #20  <Field int[] a>
		//*  10   23:getstatic       #31  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.STARTED>
		//*  11   26:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  12   29:iconst_2        
		//*  13   30:iastore         
		//*  14   31:getstatic       #20  <Field int[] a>
		//*  15   34:getstatic       #34  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.COMPLETED>
		//*  16   37:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  17   40:iconst_3        
		//*  18   41:iastore         
		//*  19   42:getstatic       #20  <Field int[] a>
		//*  20   45:getstatic       #37  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.SKIPPED>
		//*  21   48:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  22   51:iconst_4        
		//*  23   52:iastore         
		//*  24   53:getstatic       #20  <Field int[] a>
		//*  25   56:getstatic       #40  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CONTENT_PAUSE_REQUESTED>
		//*  26   59:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  27   62:iconst_5        
		//*  28   63:iastore         
		//*  29   64:getstatic       #20  <Field int[] a>
		//*  30   67:getstatic       #43  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CONTENT_RESUME_REQUESTED>
		//*  31   70:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  32   73:bipush          6
		//*  33   75:iastore         
		//*  34   76:getstatic       #20  <Field int[] a>
		//*  35   79:getstatic       #46  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CLICKED>
		//*  36   82:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  37   85:bipush          7
		//*  38   87:iastore         
		//*  39   88:getstatic       #20  <Field int[] a>
		//*  40   91:getstatic       #49  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ICON_TAPPED>
		//*  41   94:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
		//*  42   97:bipush          8
		//*  43   99:iastore         
		//*  44  100:return          
			catch(NoSuchFieldError nosuchfielderror) { }
		//   45  101:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.STARTED.ordinal()] = 2;
			}
		//*  46  102:goto            20
			catch(NoSuchFieldError nosuchfielderror1) { }
		//   47  105:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.COMPLETED.ordinal()] = 3;
			}
		//*  48  106:goto            31
			catch(NoSuchFieldError nosuchfielderror2) { }
		//   49  109:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.SKIPPED.ordinal()] = 4;
			}
		//*  50  110:goto            42
			catch(NoSuchFieldError nosuchfielderror3) { }
		//   51  113:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 5;
			}
		//*  52  114:goto            53
			catch(NoSuchFieldError nosuchfielderror4) { }
		//   53  117:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 6;
			}
		//*  54  118:goto            64
			catch(NoSuchFieldError nosuchfielderror5) { }
		//   55  121:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CLICKED.ordinal()] = 7;
			}
		//*  56  122:goto            76
			catch(NoSuchFieldError nosuchfielderror6) { }
		//   57  125:astore_0        
			try
			{
				a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.ICON_TAPPED.ordinal()] = 8;
			}
		//*  58  126:goto            88
			catch(NoSuchFieldError nosuchfielderror7) { }
		//   59  129:astore_0        
		//*  60  130:return          
		}
	}

}
