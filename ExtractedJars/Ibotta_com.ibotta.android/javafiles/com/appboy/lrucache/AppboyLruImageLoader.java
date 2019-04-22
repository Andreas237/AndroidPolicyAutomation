// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.LruCache;
import android.widget.ImageView;
import bo.app.bd;
import com.appboy.IAppboyImageLoader;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.support.*;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.File;

public class AppboyLruImageLoader
	implements IAppboyImageLoader
{
	class a extends AsyncTask
		implements TraceFieldInterface
	{

		public void _nr_setTrace(Trace trace)
		{
			try
			{
				_nr_trace = trace;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field Trace _nr_trace>
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

		protected transient Void a(File afile[])
		{
			Object obj = AppboyLruImageLoader.a(a);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field AppboyLruImageLoader a>
		//    2    4:invokestatic    #35  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
		//    3    7:astore_2        
			obj;
		//    4    8:aload_2         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			afile = ((File []) (afile[0]));
		//    6   10:aload_1         
		//    7   11:iconst_0        
		//    8   12:aaload          
		//    9   13:astore_1        
			try
			{
				AppboyLogger.d(AppboyLruImageLoader.a(), "Initializing disk cache");
		//   10   14:invokestatic    #38  <Method String AppboyLruImageLoader.a()>
		//   11   17:ldc1            #40  <String "Initializing disk cache">
		//   12   19:invokestatic    #46  <Method int AppboyLogger.d(String, String)>
		//   13   22:pop             
				AppboyLruImageLoader.a(a, new bd(((File) (afile)), 1, 1, 0x3200000L));
		//   14   23:aload_0         
		//   15   24:getfield        #18  <Field AppboyLruImageLoader a>
		//   16   27:new             #48  <Class bd>
		//   17   30:dup             
		//   18   31:aload_1         
		//   19   32:iconst_1        
		//   20   33:iconst_1        
		//   21   34:ldc2w           #49  <Long 0x3200000L>
		//   22   37:invokespecial   #53  <Method void bd(File, int, int, long)>
		//   23   40:invokestatic    #56  <Method bd AppboyLruImageLoader.a(AppboyLruImageLoader, bd)>
		//   24   43:pop             
				break MISSING_BLOCK_LABEL_58;
		//   25   44:goto            58
			}
			// Misplaced declaration of an exception variable
			catch(File afile[]) { }
		//   26   47:astore_1        
			AppboyLogger.e(AppboyLruImageLoader.a(), "Caught exception creating new disk cache. Unable to create new disk cache", ((Throwable) (afile)));
		//   27   48:invokestatic    #38  <Method String AppboyLruImageLoader.a()>
		//   28   51:ldc1            #58  <String "Caught exception creating new disk cache. Unable to create new disk cache">
		//   29   53:aload_1         
		//   30   54:invokestatic    #62  <Method int AppboyLogger.e(String, String, Throwable)>
		//   31   57:pop             
			AppboyLruImageLoader.a(a, false);
		//   32   58:aload_0         
		//   33   59:getfield        #18  <Field AppboyLruImageLoader a>
		//   34   62:iconst_0        
		//   35   63:invokestatic    #65  <Method boolean AppboyLruImageLoader.a(AppboyLruImageLoader, boolean)>
		//   36   66:pop             
			AppboyLruImageLoader.a(a).notifyAll();
		//   37   67:aload_0         
		//   38   68:getfield        #18  <Field AppboyLruImageLoader a>
		//   39   71:invokestatic    #35  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
		//   40   74:invokevirtual   #70  <Method void Object.notifyAll()>
			obj;
		//   41   77:aload_2         
			JVM INSTR monitorexit ;
		//   42   78:monitorexit     
			return null;
		//   43   79:aconst_null     
		//   44   80:areturn         
			afile;
		//   45   81:astore_1        
			obj;
		//   46   82:aload_2         
			JVM INSTR monitorexit ;
		//   47   83:monitorexit     
			throw afile;
		//   48   84:aload_1         
		//   49   85:athrow          
		}

		protected Object doInBackground(Object aobj[])
		{
			TraceMachine.enterMethod(_nr_trace, "AppboyLruImageLoader$a#doInBackground", ((java.util.ArrayList) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Trace _nr_trace>
		//    2    4:ldc1            #76  <String "AppboyLruImageLoader$a#doInBackground">
		//    3    6:aconst_null     
		//    4    7:invokestatic    #82  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
			  goto _L1
		//*   5   10:goto            20
_L3:
			TraceMachine.enterMethod(((Trace) (null)), "AppboyLruImageLoader$a#doInBackground", ((java.util.ArrayList) (null)));
		//    6   13:aconst_null     
		//    7   14:ldc1            #76  <String "AppboyLruImageLoader$a#doInBackground">
		//    8   16:aconst_null     
		//    9   17:invokestatic    #82  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
			aobj = ((Object []) (a((File[])aobj)));
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:checkcast       #84  <Class File[]>
		//   13   25:invokevirtual   #86  <Method Void a(File[])>
		//   14   28:astore_1        
			TraceMachine.exitMethod();
		//   15   29:invokestatic    #89  <Method void TraceMachine.exitMethod()>
			TraceMachine.unloadTraceContext(((Object) (this)));
		//   16   32:aload_0         
		//   17   33:invokestatic    #93  <Method void TraceMachine.unloadTraceContext(Object)>
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

		public Trace _nr_trace;
		final AppboyLruImageLoader a;

		private a()
		{
			a = AppboyLruImageLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field AppboyLruImageLoader a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void AsyncTask()>
		//    5    9:return          
		}

	}

	class b extends AsyncTask
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

		private b(Context context, ImageView imageview, AppboyViewBounds appboyviewbounds, String s)
		{
			a = AppboyLruImageLoader.this;
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

	}


	public AppboyLruImageLoader(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void Object()>
	//    6   12:putfield        #42  <Field Object d>
		e = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #44  <Field boolean e>
		f = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #46  <Field boolean f>
		b = ((LruCache) (new LruCache(AppboyImageUtils.getImageLoaderCacheSize()) {

			protected int a(String s, Bitmap bitmap)
			{
				return bitmap.getByteCount();
			//    0    0:aload_2         
			//    1    1:invokevirtual   #26  <Method int Bitmap.getByteCount()>
			//    2    4:ireturn         
			}

			protected int sizeOf(Object obj, Object obj1)
			{
				return a((String)obj, (Bitmap)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class String>
			//    3    5:aload_2         
			//    4    6:checkcast       #22  <Class Bitmap>
			//    5    9:invokevirtual   #32  <Method int a(String, Bitmap)>
			//    6   12:ireturn         
			}

			final AppboyLruImageLoader a;

			
			{
				a = AppboyLruImageLoader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppboyLruImageLoader a>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #18  <Method void LruCache(int)>
			//    6   10:return          
			}
		}
));
	//   13   25:aload_0         
	//   14   26:new             #8   <Class AppboyLruImageLoader$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokestatic    #52  <Method int AppboyImageUtils.getImageLoaderCacheSize()>
	//   18   34:invokespecial   #55  <Method void AppboyLruImageLoader$1(AppboyLruImageLoader, int)>
	//   19   37:putfield        #57  <Field LruCache b>
		context = ((Context) (a(context, "appboy.imageloader.lru.cache")));
	//   20   40:aload_1         
	//   21   41:ldc1            #59  <String "appboy.imageloader.lru.cache">
	//   22   43:invokestatic    #62  <Method File a(Context, String)>
	//   23   46:astore_1        
		a a1 = new a();
	//   24   47:new             #10  <Class AppboyLruImageLoader$a>
	//   25   50:dup             
	//   26   51:aload_0         
	//   27   52:aconst_null     
	//   28   53:invokespecial   #65  <Method void AppboyLruImageLoader$a(AppboyLruImageLoader, AppboyLruImageLoader$1)>
	//   29   56:astore_2        
		File afile[] = new File[1];
	//   30   57:iconst_1        
	//   31   58:anewarray       File[]
	//   32   61:astore_3        
		afile[0] = ((File) (context));
	//   33   62:aload_3         
	//   34   63:iconst_0        
	//   35   64:aload_1         
	//   36   65:aastore         
		if(!(a1 instanceof AsyncTask))
	//*  37   66:aload_2         
	//*  38   67:instanceof      #69  <Class AsyncTask>
	//*  39   70:ifne            80
		{
			a1.execute(((Object []) (afile)));
	//   40   73:aload_2         
	//   41   74:aload_3         
	//   42   75:invokevirtual   #73  <Method AsyncTask AppboyLruImageLoader$a.execute(Object[])>
	//   43   78:pop             
			return;
	//   44   79:return          
		} else
		{
			AsyncTaskInstrumentation.execute((AsyncTask)a1, ((Object []) (afile)));
	//   45   80:aload_2         
	//   46   81:checkcast       #69  <Class AsyncTask>
	//   47   84:aload_3         
	//   48   85:invokestatic    #78  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   49   88:pop             
			return;
	//   50   89:return          
		}
	}

	static bd a(AppboyLruImageLoader appboylruimageloader, bd bd1)
	{
		appboylruimageloader.c = bd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field bd c>
		return bd1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static File a(Context context, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(context.getCacheDir().getPath());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #91  <Method File Context.getCacheDir()>
	//    7   13:invokevirtual   #95  <Method String File.getPath()>
	//    8   16:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(File.separator);
	//   10   20:aload_2         
	//   11   21:getstatic       #102 <Field String File.separator>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(s);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return new File(stringbuilder.toString());
	//   18   34:new             #67  <Class File>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   22   42:invokespecial   #108 <Method void File(String)>
	//   23   45:areturn         
	}

	static Object a(AppboyLruImageLoader appboylruimageloader)
	{
		return appboylruimageloader.d;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object d>
	//    2    4:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #35  <Field String a>
	//    1    3:areturn         
	}

	static boolean a(AppboyLruImageLoader appboylruimageloader, boolean flag)
	{
		appboylruimageloader.e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean e>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b(String s, Bitmap bitmap)
	{
		b.put(((Object) (s)), ((Object) (bitmap)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LruCache b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #118 <Method Object LruCache.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public static void deleteStoredData(Context context)
	{
		context = ((Context) (new File(context.getCacheDir(), "appboy.imageloader.lru.cache")));
	//    0    0:new             #67  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method File Context.getCacheDir()>
	//    4    8:ldc1            #59  <String "appboy.imageloader.lru.cache">
	//    5   10:invokespecial   #122 <Method void File(File, String)>
	//    6   13:astore_0        
		String s = a;
	//    7   14:getstatic       #35  <Field String a>
	//    8   17:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #84  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #85  <Method void StringBuilder()>
	//   12   25:astore_2        
		stringbuilder.append("Deleting lru image cache directory at: ");
	//   13   26:aload_2         
	//   14   27:ldc1            #124 <String "Deleting lru image cache directory at: ">
	//   15   29:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((File) (context)).getAbsolutePath());
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #127 <Method String File.getAbsolutePath()>
	//   20   38:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #131 <Method int AppboyLogger.v(String, String)>
	//   26   50:pop             
		AppboyFileUtils.deleteFileOrDirectory(((File) (context)));
	//   27   51:aload_0         
	//   28   52:invokestatic    #137 <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
	//   29   55:return          
	}

	Bitmap a(Context context, Uri uri, AppboyViewBounds appboyviewbounds)
	{
		return AppboyImageUtils.getBitmap(context, uri, appboyviewbounds);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #141 <Method Bitmap AppboyImageUtils.getBitmap(Context, Uri, AppboyViewBounds)>
	//    4    6:areturn         
	}

	Bitmap a(String s)
	{
		Bitmap bitmap = (Bitmap)b.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LruCache b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #146 <Method Object LruCache.get(Object)>
	//    4    8:checkcast       #148 <Class Bitmap>
	//    5   11:astore_2        
		if(bitmap != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          56
		{
			String s2 = a;
	//    8   16:getstatic       #35  <Field String a>
	//    9   19:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   10   20:new             #84  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #85  <Method void StringBuilder()>
	//   13   27:astore          4
			stringbuilder1.append("Got bitmap from mem cache for key ");
	//   14   29:aload           4
	//   15   31:ldc1            #150 <String "Got bitmap from mem cache for key ">
	//   16   33:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			stringbuilder1.append(s);
	//   18   37:aload           4
	//   19   39:aload_1         
	//   20   40:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			AppboyLogger.v(s2, stringbuilder1.toString());
	//   22   44:aload_3         
	//   23   45:aload           4
	//   24   47:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   25   50:invokestatic    #131 <Method int AppboyLogger.v(String, String)>
	//   26   53:pop             
			return bitmap;
	//   27   54:aload_2         
	//   28   55:areturn         
		}
		bitmap = c(s);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #152 <Method Bitmap c(String)>
	//   32   61:astore_2        
		if(bitmap != null)
	//*  33   62:aload_2         
	//*  34   63:ifnull          112
		{
			String s3 = a;
	//   35   66:getstatic       #35  <Field String a>
	//   36   69:astore_3        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   37   70:new             #84  <Class StringBuilder>
	//   38   73:dup             
	//   39   74:invokespecial   #85  <Method void StringBuilder()>
	//   40   77:astore          4
			stringbuilder2.append("Got bitmap from disk cache for key ");
	//   41   79:aload           4
	//   42   81:ldc1            #154 <String "Got bitmap from disk cache for key ">
	//   43   83:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
			stringbuilder2.append(s);
	//   45   87:aload           4
	//   46   89:aload_1         
	//   47   90:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   48   93:pop             
			AppboyLogger.v(s3, stringbuilder2.toString());
	//   49   94:aload_3         
	//   50   95:aload           4
	//   51   97:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   52  100:invokestatic    #131 <Method int AppboyLogger.v(String, String)>
	//   53  103:pop             
			b(s, bitmap);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:aload_2         
	//   57  107:invokespecial   #156 <Method void b(String, Bitmap)>
			return bitmap;
	//   58  110:aload_2         
	//   59  111:areturn         
		} else
		{
			String s1 = a;
	//   60  112:getstatic       #35  <Field String a>
	//   61  115:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   62  116:new             #84  <Class StringBuilder>
	//   63  119:dup             
	//   64  120:invokespecial   #85  <Method void StringBuilder()>
	//   65  123:astore_3        
			stringbuilder.append("No cache hit for bitmap: ");
	//   66  124:aload_3         
	//   67  125:ldc1            #158 <String "No cache hit for bitmap: ">
	//   68  127:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   69  130:pop             
			stringbuilder.append(s);
	//   70  131:aload_3         
	//   71  132:aload_1         
	//   72  133:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   73  136:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   74  137:aload_2         
	//   75  138:aload_3         
	//   76  139:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   77  142:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   78  145:pop             
			return null;
	//   79  146:aconst_null     
	//   80  147:areturn         
		}
	}

	void a(String s, Bitmap bitmap)
	{
		if(b(s) == null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #162 <Method Bitmap b(String)>
	//*   3    5:ifnonnull       56
		{
			String s1 = a;
	//    4    8:getstatic       #35  <Field String a>
	//    5   11:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #84  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #85  <Method void StringBuilder()>
	//    9   19:astore          4
			stringbuilder.append("Adding bitmap to mem cache for key ");
	//   10   21:aload           4
	//   11   23:ldc1            #164 <String "Adding bitmap to mem cache for key ">
	//   12   25:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(s);
	//   14   29:aload           4
	//   15   31:aload_1         
	//   16   32:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   22   45:pop             
			b.put(((Object) (s)), ((Object) (bitmap)));
	//   23   46:aload_0         
	//   24   47:getfield        #57  <Field LruCache b>
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #118 <Method Object LruCache.put(Object, Object)>
	//   28   55:pop             
		}
		synchronized(d)
	//*  29   56:aload_0         
	//*  30   57:getfield        #42  <Field Object d>
	//*  31   60:astore_3        
	//*  32   61:aload_3         
	//*  33   62:monitorenter    
		{
			if(c != null && !c.b(s))
	//*  34   63:aload_0         
	//*  35   64:getfield        #81  <Field bd c>
	//*  36   67:ifnull          130
	//*  37   70:aload_0         
	//*  38   71:getfield        #81  <Field bd c>
	//*  39   74:aload_1         
	//*  40   75:invokevirtual   #169 <Method boolean bd.b(String)>
	//*  41   78:ifne            130
			{
				String s2 = a;
	//   42   81:getstatic       #35  <Field String a>
	//   43   84:astore          4
				StringBuilder stringbuilder1 = new StringBuilder();
	//   44   86:new             #84  <Class StringBuilder>
	//   45   89:dup             
	//   46   90:invokespecial   #85  <Method void StringBuilder()>
	//   47   93:astore          5
				stringbuilder1.append("Adding bitmap to disk cache for key ");
	//   48   95:aload           5
	//   49   97:ldc1            #171 <String "Adding bitmap to disk cache for key ">
	//   50   99:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
				stringbuilder1.append(s);
	//   52  103:aload           5
	//   53  105:aload_1         
	//   54  106:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
				AppboyLogger.d(s2, stringbuilder1.toString());
	//   56  110:aload           4
	//   57  112:aload           5
	//   58  114:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   59  117:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   60  120:pop             
				c.a(s, bitmap);
	//   61  121:aload_0         
	//   62  122:getfield        #81  <Field bd c>
	//   63  125:aload_1         
	//   64  126:aload_2         
	//   65  127:invokevirtual   #173 <Method void bd.a(String, Bitmap)>
			}
		}
	//   66  130:aload_3         
	//   67  131:monitorexit     
		return;
	//   68  132:return          
		s;
	//   69  133:astore_1        
		obj;
	//   70  134:aload_3         
		JVM INSTR monitorexit ;
	//   71  135:monitorexit     
		throw s;
	//   72  136:aload_1         
	//   73  137:athrow          
	}

	Bitmap b(String s)
	{
		return (Bitmap)b.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LruCache b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #146 <Method Object LruCache.get(Object)>
	//    4    8:checkcast       #148 <Class Bitmap>
	//    5   11:areturn         
	}

	Bitmap c(String s)
	{
label0:
		{
			synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object d>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!e)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field boolean e>
	//    7   11:ifeq            18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		if(c == null || !c.b(s))
			break MISSING_BLOCK_LABEL_49;
	//   12   18:aload_0         
	//   13   19:getfield        #81  <Field bd c>
	//   14   22:ifnull          49
	//   15   25:aload_0         
	//   16   26:getfield        #81  <Field bd c>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #169 <Method boolean bd.b(String)>
	//   19   33:ifeq            49
		s = ((String) (c.a(s)));
	//   20   36:aload_0         
	//   21   37:getfield        #81  <Field bd c>
	//   22   40:aload_1         
	//   23   41:invokevirtual   #175 <Method Bitmap bd.a(String)>
	//   24   44:astore_1        
	//*  25   45:aload_2         
	//*  26   46:monitorexit     
		return ((Bitmap) (s));
	//   27   47:aload_1         
	//   28   48:areturn         
		obj;
	//   29   49:aload_2         
		JVM INSTR monitorexit ;
	//   30   50:monitorexit     
		return null;
	//   31   51:aconst_null     
	//   32   52:areturn         
		s;
	//   33   53:astore_1        
		obj;
	//   34   54:aload_2         
		JVM INSTR monitorexit ;
	//   35   55:monitorexit     
		throw s;
	//   36   56:aload_1         
	//   37   57:athrow          
	}

	public Bitmap getBitmapFromUrl(Context context, String s, AppboyViewBounds appboyviewbounds)
	{
		Bitmap bitmap = a(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #178 <Method Bitmap a(String)>
	//    3    5:astore          4
		if(bitmap != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          15
			return bitmap;
	//    6   12:aload           4
	//    7   14:areturn         
		if(f)
	//*   8   15:aload_0         
	//*   9   16:getfield        #46  <Field boolean f>
	//*  10   19:ifeq            33
		{
			AppboyLogger.d(a, "Cache is currently in offline mode. Not downloading bitmap.");
	//   11   22:getstatic       #35  <Field String a>
	//   12   25:ldc1            #180 <String "Cache is currently in offline mode. Not downloading bitmap.">
	//   13   27:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   14   30:pop             
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
		}
		context = ((Context) (a(context, Uri.parse(s), appboyviewbounds)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #186 <Method Uri Uri.parse(String)>
	//   21   39:aload_3         
	//   22   40:invokevirtual   #188 <Method Bitmap a(Context, Uri, AppboyViewBounds)>
	//   23   43:astore_1        
		if(context != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          54
			a(s, ((Bitmap) (context)));
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:aload_1         
	//   29   51:invokevirtual   #189 <Method void a(String, Bitmap)>
		return ((Bitmap) (context));
	//   30   54:aload_1         
	//   31   55:areturn         
	}

	public void renderUrlIntoView(Context context, String s, ImageView imageview, AppboyViewBounds appboyviewbounds)
	{
		context = ((Context) (new b(context, imageview, appboyviewbounds, s)));
	//    0    0:new             #13  <Class AppboyLruImageLoader$b>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_2         
	//    7   10:aconst_null     
	//    8   11:invokespecial   #194 <Method void AppboyLruImageLoader$b(AppboyLruImageLoader, Context, ImageView, AppboyViewBounds, String, AppboyLruImageLoader$1)>
	//    9   14:astore_1        
		s = ((String) (new Void[0]));
	//   10   15:iconst_0        
	//   11   16:anewarray       Void[]
	//   12   19:astore_2        
		if(!(context instanceof AsyncTask))
	//*  13   20:aload_1         
	//*  14   21:instanceof      #69  <Class AsyncTask>
	//*  15   24:ifne            34
		{
			((b) (context)).execute(((Object []) (s)));
	//   16   27:aload_1         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #197 <Method AsyncTask AppboyLruImageLoader$b.execute(Object[])>
	//   19   32:pop             
			return;
	//   20   33:return          
		} else
		{
			AsyncTaskInstrumentation.execute((AsyncTask)context, ((Object []) (s)));
	//   21   34:aload_1         
	//   22   35:checkcast       #69  <Class AsyncTask>
	//   23   38:aload_2         
	//   24   39:invokestatic    #78  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   25   42:pop             
			return;
	//   26   43:return          
		}
	}

	public void setOffline(boolean flag)
	{
		String s1 = a;
	//    0    0:getstatic       #35  <Field String a>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #84  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #85  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Appboy image loader outbound network requests are now ");
	//    6   13:aload           4
	//    7   15:ldc1            #201 <String "Appboy image loader outbound network requests are now ">
	//    8   17:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		String s;
		if(flag)
	//*  10   21:iload_1         
	//*  11   22:ifeq            31
			s = "disabled";
	//   12   25:ldc1            #203 <String "disabled">
	//   13   27:astore_2        
		else
	//*  14   28:goto            34
			s = "enabled";
	//   15   31:ldc1            #205 <String "enabled">
	//   16   33:astore_2        
		stringbuilder.append(s);
	//   17   34:aload           4
	//   18   36:aload_2         
	//   19   37:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		AppboyLogger.i(s1, stringbuilder.toString());
	//   21   41:aload_3         
	//   22   42:aload           4
	//   23   44:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #208 <Method int AppboyLogger.i(String, String)>
	//   25   50:pop             
		f = flag;
	//   26   51:aload_0         
	//   27   52:iload_1         
	//   28   53:putfield        #46  <Field boolean f>
	//   29   56:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/lrucache/AppboyLruImageLoader);
	private LruCache b;
	private bd c;
	private final Object d = new Object();
	private boolean e;
	private boolean f;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyLruImageLoader>
	//    1    2:invokestatic    #33  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #35  <Field String a>
	//*   3    8:return          
	}
}
