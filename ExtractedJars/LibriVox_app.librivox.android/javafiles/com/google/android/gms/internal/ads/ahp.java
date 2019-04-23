// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.aw;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahm, ahs, wi, wx, 
//			abj, ahq, ahn, aho

public class ahp extends ahm
	implements ahs
{

	public ahp(Context context, ahn ahn1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ahm(Context)>
		aw.i().h();
	//    3    5:invokestatic    #27  <Method wi aw.i()>
	//    4    8:invokevirtual   #33  <Method void wi.h()>
		a = ahn1;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #35  <Field ahn a>
		super.setWebViewClient(((WebViewClient) (ahn1)));
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokespecial   #39  <Method void ahm.setWebViewClient(WebViewClient)>
	//   11   21:return          
	}

	private final void a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!c)
	//*   2    2:aload_0         
	//*   3    3:getfield        #42  <Field boolean c>
	//*   4    6:ifne            20
		{
			c = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #42  <Field boolean c>
			aw.i().i();
	//    8   14:invokestatic    #27  <Method wi aw.i()>
	//    9   17:invokevirtual   #44  <Method void wi.i()>
		}
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public final boolean C()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = b;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field boolean b>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	protected void D()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		wx.a("Destroying WebView!");
	//    2    2:ldc1            #51  <String "Destroying WebView!">
	//    3    4:invokestatic    #56  <Method void wx.a(String)>
		a();
	//    4    7:aload_0         
	//    5    8:invokespecial   #58  <Method void a()>
		abj.a.execute(((Runnable) (new ahq(this))));
	//    6   11:getstatic       #63  <Field Executor abj.a>
	//    7   14:new             #65  <Class ahq>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #68  <Method void ahq(ahp)>
	//   11   22:invokeinterface #74  <Method void Executor.execute(Runnable)>
		this;
	//   12   27:aload_0         
		JVM INSTR monitorexit ;
	//   13   28:monitorexit     
		return;
	//   14   29:return          
		Exception exception;
		exception;
	//   15   30:astore_1        
	//*  16   31:aload_0         
		throw exception;
	//   17   32:monitorexit     
	//   18   33:aload_1         
	//   19   34:athrow          
	}

	final void M()
	{
		super.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void ahm.destroy()>
	//    2    4:return          
	}

	public final void a(aho aho)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		wx.a("Blank page loaded, 1...");
	//    2    2:ldc1            #81  <String "Blank page loaded, 1...">
	//    3    4:invokestatic    #56  <Method void wx.a(String)>
		D();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #83  <Method void D()>
		this;
	//    6   11:aload_0         
		JVM INSTR monitorexit ;
	//    7   12:monitorexit     
		return;
	//    8   13:return          
		aho;
	//    9   14:astore_1        
	//*  10   15:aload_0         
		throw aho;
	//   11   16:monitorexit     
	//   12   17:aload_1         
	//   13   18:athrow          
	}

	public volatile void addJavascriptInterface(Object obj, String s)
	{
		super.addJavascriptInterface(obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method void ahm.addJavascriptInterface(Object, String)>
	//    4    6:return          
	}

	public volatile void d(String s)
	{
		super.d(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void ahm.d(String)>
	//    3    5:return          
	}

	public void destroy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = b;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field boolean b>
	//    4    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		b = true;
	//   10   14:aload_0         
	//   11   15:iconst_1        
	//   12   16:putfield        #48  <Field boolean b>
		a.a(((ahs) (this)));
	//   13   19:aload_0         
	//   14   20:getfield        #35  <Field ahn a>
	//   15   23:aload_0         
	//   16   24:invokevirtual   #97  <Method void ahn.a(ahs)>
		g(false);
	//   17   27:aload_0         
	//   18   28:iconst_0        
	//   19   29:invokevirtual   #101 <Method void g(boolean)>
		wx.a("Initiating WebView self destruct sequence in 3...");
	//   20   32:ldc1            #103 <String "Initiating WebView self destruct sequence in 3...">
	//   21   34:invokestatic    #56  <Method void wx.a(String)>
		wx.a("Loading blank page in WebView, 2...");
	//   22   37:ldc1            #105 <String "Loading blank page in WebView, 2...">
	//   23   39:invokestatic    #56  <Method void wx.a(String)>
		super.loadUrl("about:blank");
	//   24   42:aload_0         
	//   25   43:ldc1            #107 <String "about:blank">
	//   26   45:invokespecial   #110 <Method void ahm.loadUrl(String)>
		this;
	//   27   48:aload_0         
		JVM INSTR monitorexit ;
	//   28   49:monitorexit     
		return;
	//   29   50:return          
		Object obj;
		obj;
	//   30   51:astore_2        
		aw.i().a(((Throwable) (obj)), "AdWebViewImpl.loadUrlUnsafe");
	//   31   52:invokestatic    #27  <Method wi aw.i()>
	//   32   55:aload_2         
	//   33   56:ldc1            #112 <String "AdWebViewImpl.loadUrlUnsafe">
	//   34   58:invokevirtual   #115 <Method void wi.a(Throwable, String)>
		wx.d("#007 Could not call remote method.", ((Throwable) (obj)));
	//   35   61:ldc1            #117 <String "#007 Could not call remote method.">
	//   36   63:aload_2         
	//   37   64:invokestatic    #120 <Method void wx.d(String, Throwable)>
		this;
	//   38   67:aload_0         
		JVM INSTR monitorexit ;
	//   39   68:monitorexit     
		return;
	//   40   69:return          
		obj;
	//   41   70:astore_2        
	//*  42   71:aload_0         
		throw obj;
	//   43   72:monitorexit     
	//   44   73:aload_2         
	//   45   74:athrow          
	}

	public void evaluateJavascript(String s, ValueCallback valuecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!C())
			break MISSING_BLOCK_LABEL_28;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #126 <Method boolean C()>
	//    4    6:ifeq            28
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//    5    9:ldc1            #128 <String "#004 The webview is destroyed. Ignoring action.">
	//    6   11:invokestatic    #131 <Method void wx.e(String)>
		if(valuecallback == null)
			break MISSING_BLOCK_LABEL_25;
	//    7   14:aload_2         
	//    8   15:ifnull          25
		valuecallback.onReceiveValue(((Object) (null)));
	//    9   18:aload_2         
	//   10   19:aconst_null     
	//   11   20:invokeinterface #137 <Method void ValueCallback.onReceiveValue(Object)>
		this;
	//   12   25:aload_0         
		JVM INSTR monitorexit ;
	//   13   26:monitorexit     
		return;
	//   14   27:return          
		super.evaluateJavascript(s, valuecallback);
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:invokespecial   #139 <Method void ahm.evaluateJavascript(String, ValueCallback)>
		this;
	//   19   34:aload_0         
		JVM INSTR monitorexit ;
	//   20   35:monitorexit     
		return;
	//   21   36:return          
		s;
	//   22   37:astore_1        
	//*  23   38:aload_0         
		throw s;
	//   24   39:monitorexit     
	//   25   40:aload_1         
	//   26   41:athrow          
	}

	protected void finalize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!C())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #126 <Method boolean C()>
	//*   4    6:ifne            14
			g(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #101 <Method void g(boolean)>
		a();
	//    8   14:aload_0         
	//    9   15:invokespecial   #58  <Method void a()>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		((Object)this).finalize();
	//   12   20:aload_0         
	//   13   21:invokespecial   #145 <Method void Object.finalize()>
		return;
	//   14   24:return          
		Exception exception;
		exception;
	//   15   25:astore_1        
		this;
	//   16   26:aload_0         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_1         
	//   19   29:athrow          
		exception;
	//   20   30:astore_1        
		((Object)this).finalize();
	//   21   31:aload_0         
	//   22   32:invokespecial   #145 <Method void Object.finalize()>
		throw exception;
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	protected void g(boolean flag)
	{
	//    0    0:return          
	}

	public void loadData(String s, String s1, String s2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #126 <Method boolean C()>
	//    4    6:ifne            19
		super.loadData(s, s1, s2);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #149 <Method void ahm.loadData(String, String, String)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   13   19:ldc1            #128 <String "#004 The webview is destroyed. Ignoring action.">
	//   14   21:invokestatic    #131 <Method void wx.e(String)>
		this;
	//   15   24:aload_0         
		JVM INSTR monitorexit ;
	//   16   25:monitorexit     
		return;
	//   17   26:return          
		s;
	//   18   27:astore_1        
	//*  19   28:aload_0         
		throw s;
	//   20   29:monitorexit     
	//   21   30:aload_1         
	//   22   31:athrow          
	}

	public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #126 <Method boolean C()>
	//    4    6:ifne            23
		super.loadDataWithBaseURL(s, s1, s2, s3, s4);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:aload           5
	//   11   17:invokespecial   #153 <Method void ahm.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   15   23:ldc1            #128 <String "#004 The webview is destroyed. Ignoring action.">
	//   16   25:invokestatic    #131 <Method void wx.e(String)>
		this;
	//   17   28:aload_0         
		JVM INSTR monitorexit ;
	//   18   29:monitorexit     
		return;
	//   19   30:return          
		s;
	//   20   31:astore_1        
	//*  21   32:aload_0         
		throw s;
	//   22   33:monitorexit     
	//   23   34:aload_1         
	//   24   35:athrow          
	}

	public void loadUrl(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #126 <Method boolean C()>
	//    4    6:ifne            17
		super.loadUrl(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #110 <Method void ahm.loadUrl(String)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   11   17:ldc1            #128 <String "#004 The webview is destroyed. Ignoring action.">
	//   12   19:invokestatic    #131 <Method void wx.e(String)>
		this;
	//   13   22:aload_0         
		JVM INSTR monitorexit ;
	//   14   23:monitorexit     
		return;
	//   15   24:return          
		s;
	//   16   25:astore_1        
	//*  17   26:aload_0         
		throw s;
	//   18   27:monitorexit     
	//   19   28:aload_1         
	//   20   29:athrow          
	}

	protected void onDraw(Canvas canvas)
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean C()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.onDraw(canvas);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #158 <Method void ahm.onDraw(Canvas)>
			return;
	//    7   13:return          
		}
	}

	public void onPause()
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean C()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.onPause();
	//    4    8:aload_0         
	//    5    9:invokespecial   #161 <Method void ahm.onPause()>
			return;
	//    6   12:return          
		}
	}

	public void onResume()
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean C()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.onResume();
	//    4    8:aload_0         
	//    5    9:invokespecial   #164 <Method void ahm.onResume()>
			return;
	//    6   12:return          
		}
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		return !C() && super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method boolean C()>
	//    2    4:ifne            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #168 <Method boolean ahm.onTouchEvent(MotionEvent)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void setWebViewClient(WebViewClient webviewclient)
	{
	//    0    0:return          
	}

	public void stopLoading()
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean C()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.stopLoading();
	//    4    8:aload_0         
	//    5    9:invokespecial   #171 <Method void ahm.stopLoading()>
			return;
	//    6   12:return          
		}
	}

	private final ahn a;
	private boolean b;
	private boolean c;
}
