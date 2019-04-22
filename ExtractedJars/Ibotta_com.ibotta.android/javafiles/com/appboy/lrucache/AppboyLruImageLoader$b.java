// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.appboy.enums.AppboyViewBounds;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.appboy.lrucache:
//			AppboyLruImageLoader

class AppboyLruImageLoader$b extends AsyncTask
	implements TraceFieldInterface
{

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field Trace _nr_trace>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Trace trace)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	protected transient Bitmap a(Void avoid[])
	{
		TrafficStats.setThreadStatsTag(1337);
	//    0    0:sipush          1337
	//    1    3:invokestatic    #66  <Method void TrafficStats.setThreadStatsTag(int)>
		return a.getBitmapFromUrl(c, e, d);
	//    2    6:aload_0         
	//    3    7:getfield        #26  <Field AppboyLruImageLoader a>
	//    4   10:aload_0         
	//    5   11:getfield        #33  <Field Context c>
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field String e>
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field AppboyViewBounds d>
	//   10   22:invokevirtual   #70  <Method Bitmap AppboyLruImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
	//   11   25:areturn         
	}

	protected void a(Bitmap bitmap)
	{
		ImageView imageview = b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ImageView b>
	//    2    4:astore_2        
		if(imageview != null && ((String)imageview.getTag(com.appboy.R.string.com_appboy_image_lru_cache_image_url_key)).equals(((Object) (e))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          37
	//*   5    9:aload_2         
	//*   6   10:getstatic       #43  <Field int com.appboy.R$string.com_appboy_image_lru_cache_image_url_key>
	//*   7   13:invokevirtual   #75  <Method Object ImageView.getTag(int)>
	//*   8   16:checkcast       #77  <Class String>
	//*   9   19:aload_0         
	//*  10   20:getfield        #37  <Field String e>
	//*  11   23:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  12   26:ifeq            37
			b.setImageBitmap(bitmap);
	//   13   29:aload_0         
	//   14   30:getfield        #31  <Field ImageView b>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #84  <Method void ImageView.setImageBitmap(Bitmap)>
	//   17   37:return          
	}

	protected Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyLruImageLoader$b#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Trace _nr_trace>
	//    2    4:ldc1            #90  <String "AppboyLruImageLoader$b#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #96  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyLruImageLoader$b#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #90  <String "AppboyLruImageLoader$b#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #96  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (a((Void[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #98  <Class Void[]>
	//   13   25:invokevirtual   #100 <Method Bitmap a(Void[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #103 <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #107 <Method void TraceMachine.unloadTraceContext(Object)>
		return ((Object) (aobj));
	//   18   36:aload_1         
	//   19   37:areturn         
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   20   38:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  21   39:goto            13
	}

	protected void onPostExecute(Object obj)
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyLruImageLoader$b#onPostExecute", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Trace _nr_trace>
	//    2    4:ldc1            #110 <String "AppboyLruImageLoader$b#onPostExecute">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #96  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyLruImageLoader$b#onPostExecute", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #110 <String "AppboyLruImageLoader$b#onPostExecute">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #96  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		a((Bitmap)obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #112 <Class Bitmap>
	//   13   25:invokevirtual   #114 <Method void a(Bitmap)>
		TraceMachine.exitMethod();
	//   14   28:invokestatic    #103 <Method void TraceMachine.exitMethod()>
		return;
	//   15   31:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   16   32:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  17   33:goto            13
	}

	public Trace _nr_trace;
	final AppboyLruImageLoader a;
	private final ImageView b;
	private final Context c;
	private final AppboyViewBounds d;
	private final String e;

	private AppboyLruImageLoader$b(AppboyLruImageLoader appboylruimageloader, Context context, ImageView imageview, AppboyViewBounds appboyviewbounds, String s)
	{
		a = appboylruimageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field AppboyLruImageLoader a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void AsyncTask()>
		b = imageview;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #31  <Field ImageView b>
		c = context;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #33  <Field Context c>
		d = appboyviewbounds;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field AppboyViewBounds d>
		e = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field String e>
		imageview.setTag(com.appboy.R.string.com_appboy_image_lru_cache_image_url_key, ((Object) (s)));
	//   17   31:aload_3         
	//   18   32:getstatic       #43  <Field int com.appboy.R$string.com_appboy_image_lru_cache_image_url_key>
	//   19   35:aload           5
	//   20   37:invokevirtual   #49  <Method void ImageView.setTag(int, Object)>
	//   21   40:return          
	}

	AppboyLruImageLoader$b(AppboyLruImageLoader appboylruimageloader, Context context, ImageView imageview, AppboyViewBounds appboyviewbounds, String s, AppboyLruImageLoader$1 appboylruimageloader$1)
	{
		this(appboylruimageloader, context, imageview, appboyviewbounds, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #53  <Method void AppboyLruImageLoader$b(AppboyLruImageLoader, Context, ImageView, AppboyViewBounds, String)>
	//    7   11:return          
	}
}
