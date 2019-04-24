// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.ab;
import android.support.v7.ae;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.SynchronousQueue;

public final class i
{
	public static final class a
	{

		public final String a(Context context)
		{
			ae.b(((Object) (context)), "context");
		//    0    0:aload_1         
		//    1    1:ldc1            #20  <String "context">
		//    2    3:invokestatic    #26  <Method void ae.b(Object, String)>
			if(i.a() != null)
		//*   3    6:invokestatic    #29  <Method String i.a()>
		//*   4    9:ifnull          29
			{
				String s = i.a();
		//    5   12:invokestatic    #29  <Method String i.a()>
		//    6   15:astore_2        
				context = ((Context) (s));
		//    7   16:aload_2         
		//    8   17:astore_1        
				if(s == null)
		//*   9   18:aload_2         
		//*  10   19:ifnonnull       27
				{
					ae.a();
		//   11   22:invokestatic    #31  <Method void ae.a()>
					context = ((Context) (s));
		//   12   25:aload_2         
		//   13   26:astore_1        
				}
			} else
		//*  14   27:aload_1         
		//*  15   28:areturn         
			{
				Object obj = ((Object) (new SynchronousQueue()));
		//   16   29:new             #33  <Class SynchronousQueue>
		//   17   32:dup             
		//   18   33:invokespecial   #34  <Method void SynchronousQueue()>
		//   19   36:astore_2        
				static final class a.a
					implements Runnable
				{

					public final void run()
					{
						Object obj = ((Object) ((new WebView(a)).getSettings()));
					//    0    0:new             #29  <Class WebView>
					//    1    3:dup             
					//    2    4:aload_0         
					//    3    5:getfield        #20  <Field Context a>
					//    4    8:invokespecial   #32  <Method void WebView(Context)>
					//    5   11:invokevirtual   #36  <Method WebSettings WebView.getSettings()>
					//    6   14:astore_1        
						ae.a(obj, "WebView(context).settings");
					//    7   15:aload_1         
					//    8   16:ldc1            #38  <String "WebView(context).settings">
					//    9   18:invokestatic    #43  <Method void ae.a(Object, String)>
						obj = ((Object) (((WebSettings) (obj)).getUserAgentString()));
					//   10   21:aload_1         
					//   11   22:invokevirtual   #49  <Method String WebSettings.getUserAgentString()>
					//   12   25:astore_1        
						b.offer(obj);
					//   13   26:aload_0         
					//   14   27:getfield        #22  <Field SynchronousQueue b>
					//   15   30:aload_1         
					//   16   31:invokevirtual   #55  <Method boolean SynchronousQueue.offer(Object)>
					//   17   34:pop             
					//   18   35:return          
					}

					final Context a;
					final SynchronousQueue b;

			a.a(Context context, SynchronousQueue synchronousqueue)
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Context a>
				b = synchronousqueue;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field SynchronousQueue b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}

				(new Handler(Looper.getMainLooper())).post((Runnable)new a(context, ((SynchronousQueue) (obj))));
		//   20   37:new             #36  <Class Handler>
		//   21   40:dup             
		//   22   41:invokestatic    #42  <Method Looper Looper.getMainLooper()>
		//   23   44:invokespecial   #45  <Method void Handler(Looper)>
		//   24   47:new             #9   <Class i$a$a>
		//   25   50:dup             
		//   26   51:aload_1         
		//   27   52:aload_2         
		//   28   53:invokespecial   #48  <Method void i$a$a(Context, SynchronousQueue)>
		//   29   56:checkcast       #50  <Class Runnable>
		//   30   59:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
		//   31   62:pop             
				i.a((String)((SynchronousQueue) (obj)).take());
		//   32   63:aload_2         
		//   33   64:invokevirtual   #58  <Method Object SynchronousQueue.take()>
		//   34   67:checkcast       #60  <Class String>
		//   35   70:invokestatic    #63  <Method void i.a(String)>
				obj = ((Object) (i.a()));
		//   36   73:invokestatic    #29  <Method String i.a()>
		//   37   76:astore_2        
				context = ((Context) (obj));
		//   38   77:aload_2         
		//   39   78:astore_1        
				if(obj == null)
		//*  40   79:aload_2         
		//*  41   80:ifnonnull       27
				{
					ae.a();
		//   42   83:invokestatic    #31  <Method void ae.a()>
					return ((String) (obj));
		//   43   86:aload_2         
		//   44   87:areturn         
				}
			}
			return ((String) (context));
		}

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

		public a(ab ab)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void i$a()>
		//    2    4:return          
		}
	}


	public static final String a()
	{
		return b;
	//    0    0:getstatic       #25  <Field String b>
	//    1    3:areturn         
	}

	public static final void a(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #25  <Field String b>
	//    2    4:return          
	}

	public static final a a = new a(((ab) (null)));
	private static String b;

	static 
	{
	//    0    0:new             #6   <Class i$a>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #18  <Method void i$a(ab)>
	//    4    8:putstatic       #20  <Field i$a a>
	//*   5   11:return          
	}
}
