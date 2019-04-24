// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzass, zzajm, zzakb, zzaoe, 
//			zzasw, zzash, zzasu

public class zzasv extends zzass
{

	public zzasv(zzash zzash)
	{
		super(zzash);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void zzass(zzash)>
		zzbv.zzeo().zzqe();
	//    3    5:invokestatic    #22  <Method zzajm zzbv.zzeo()>
	//    4    8:invokevirtual   #28  <Method void zzajm.zzqe()>
	//    5   11:return          
	}

	private final void zzqf()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzdfi)
	//*   2    2:aload_0         
	//*   3    3:getfield        #32  <Field boolean zzdfi>
	//*   4    6:ifne            20
		{
			zzdfi = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #32  <Field boolean zzdfi>
			zzbv.zzeo().zzqf();
	//    8   14:invokestatic    #22  <Method zzajm zzbv.zzeo()>
	//    9   17:invokevirtual   #34  <Method void zzajm.zzqf()>
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

	public void destroy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzdfh;
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field boolean zzdfh>
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
		zzdfh = true;
	//   10   14:aload_0         
	//   11   15:iconst_1        
	//   12   16:putfield        #39  <Field boolean zzdfh>
		zzam(false);
	//   13   19:aload_0         
	//   14   20:iconst_0        
	//   15   21:invokevirtual   #43  <Method void zzam(boolean)>
		zzakb.v("Initiating WebView self destruct sequence in 3...");
	//   16   24:ldc1            #45  <String "Initiating WebView self destruct sequence in 3...">
	//   17   26:invokestatic    #51  <Method void zzakb.v(String)>
		zzakb.v("Loading blank page in WebView, 2...");
	//   18   29:ldc1            #53  <String "Loading blank page in WebView, 2...">
	//   19   31:invokestatic    #51  <Method void zzakb.v(String)>
		super.loadUrl("about:blank");
	//   20   34:aload_0         
	//   21   35:ldc1            #55  <String "about:blank">
	//   22   37:invokespecial   #58  <Method void zzass.loadUrl(String)>
		this;
	//   23   40:aload_0         
		JVM INSTR monitorexit ;
	//   24   41:monitorexit     
		return;
	//   25   42:return          
		Object obj;
		obj;
	//   26   43:astore_2        
		zzbv.zzeo().zza(((Throwable) (obj)), "AdWebViewImpl.loadUrlUnsafe");
	//   27   44:invokestatic    #22  <Method zzajm zzbv.zzeo()>
	//   28   47:aload_2         
	//   29   48:ldc1            #60  <String "AdWebViewImpl.loadUrlUnsafe">
	//   30   50:invokevirtual   #64  <Method void zzajm.zza(Throwable, String)>
		zzakb.zzd("#007 Could not call remote method.", ((Throwable) (obj)));
	//   31   53:ldc1            #66  <String "#007 Could not call remote method.">
	//   32   55:aload_2         
	//   33   56:invokestatic    #70  <Method void zzakb.zzd(String, Throwable)>
		this;
	//   34   59:aload_0         
		JVM INSTR monitorexit ;
	//   35   60:monitorexit     
		return;
	//   36   61:return          
		obj;
	//   37   62:astore_2        
	//*  38   63:aload_0         
		throw obj;
	//   39   64:monitorexit     
	//   40   65:aload_2         
	//   41   66:athrow          
	}

	public void evaluateJavascript(String s, ValueCallback valuecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isDestroyed())
			break MISSING_BLOCK_LABEL_28;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #78  <Method boolean isDestroyed()>
	//    4    6:ifeq            28
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//    5    9:ldc1            #80  <String "#004 The webview is destroyed. Ignoring action.">
	//    6   11:invokestatic    #83  <Method void zzakb.zzdk(String)>
		if(valuecallback == null)
			break MISSING_BLOCK_LABEL_25;
	//    7   14:aload_2         
	//    8   15:ifnull          25
		valuecallback.onReceiveValue(((Object) (null)));
	//    9   18:aload_2         
	//   10   19:aconst_null     
	//   11   20:invokeinterface #89  <Method void ValueCallback.onReceiveValue(Object)>
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
	//   18   31:invokespecial   #91  <Method void zzass.evaluateJavascript(String, ValueCallback)>
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
		throws Throwable
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isDestroyed())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #78  <Method boolean isDestroyed()>
	//*   4    6:ifne            14
			zzam(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #43  <Method void zzam(boolean)>
		zzqf();
	//    8   14:aload_0         
	//    9   15:invokespecial   #98  <Method void zzqf()>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		((Object)this).finalize();
	//   12   20:aload_0         
	//   13   21:invokespecial   #102 <Method void Object.finalize()>
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
	//   22   32:invokespecial   #102 <Method void Object.finalize()>
		throw exception;
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	public final boolean isDestroyed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzdfh;
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field boolean zzdfh>
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

	public void loadData(String s, String s1, String s2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #78  <Method boolean isDestroyed()>
	//    4    6:ifne            19
		super.loadData(s, s1, s2);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #107 <Method void zzass.loadData(String, String, String)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   13   19:ldc1            #80  <String "#004 The webview is destroyed. Ignoring action.">
	//   14   21:invokestatic    #83  <Method void zzakb.zzdk(String)>
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
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #78  <Method boolean isDestroyed()>
	//    4    6:ifne            23
		super.loadDataWithBaseURL(s, s1, s2, s3, s4);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:aload           5
	//   11   17:invokespecial   #111 <Method void zzass.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   15   23:ldc1            #80  <String "#004 The webview is destroyed. Ignoring action.">
	//   16   25:invokestatic    #83  <Method void zzakb.zzdk(String)>
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
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #78  <Method boolean isDestroyed()>
	//    4    6:ifne            17
		super.loadUrl(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #58  <Method void zzass.loadUrl(String)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   11   17:ldc1            #80  <String "#004 The webview is destroyed. Ignoring action.">
	//   12   19:invokestatic    #83  <Method void zzakb.zzdk(String)>
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
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.onDraw(canvas);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #116 <Method void zzass.onDraw(Canvas)>
			return;
	//    7   13:return          
		}
	}

	public void onPause()
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.onPause();
	//    4    8:aload_0         
	//    5    9:invokespecial   #119 <Method void zzass.onPause()>
			return;
	//    6   12:return          
		}
	}

	public void onResume()
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.onResume();
	//    4    8:aload_0         
	//    5    9:invokespecial   #122 <Method void zzass.onResume()>
			return;
	//    6   12:return          
		}
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		return !isDestroyed() && super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method boolean isDestroyed()>
	//    2    4:ifne            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #126 <Method boolean zzass.onTouchEvent(MotionEvent)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void stopLoading()
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			super.stopLoading();
	//    4    8:aload_0         
	//    5    9:invokespecial   #129 <Method void zzass.stopLoading()>
			return;
	//    6   12:return          
		}
	}

	protected void zzam(boolean flag)
	{
	//    0    0:return          
	}

	public final void zzc(zzasu zzasu)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isDestroyed())
			break MISSING_BLOCK_LABEL_21;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #78  <Method boolean isDestroyed()>
	//    4    6:ifeq            21
		zzakb.v("Blank page loaded, 1...");
	//    5    9:ldc1            #133 <String "Blank page loaded, 1...">
	//    6   11:invokestatic    #51  <Method void zzakb.v(String)>
		zzuk();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #136 <Method void zzuk()>
		this;
	//    9   18:aload_0         
		JVM INSTR monitorexit ;
	//   10   19:monitorexit     
		return;
	//   11   20:return          
		super.zzc(zzasu);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokespecial   #138 <Method void zzass.zzc(zzasu)>
		this;
	//   15   26:aload_0         
		JVM INSTR monitorexit ;
	//   16   27:monitorexit     
		return;
	//   17   28:return          
		zzasu;
	//   18   29:astore_1        
	//*  19   30:aload_0         
		throw zzasu;
	//   20   31:monitorexit     
	//   21   32:aload_1         
	//   22   33:athrow          
	}

	public final void zzuk()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzakb.v("Destroying WebView!");
	//    2    2:ldc1            #140 <String "Destroying WebView!">
	//    3    4:invokestatic    #51  <Method void zzakb.v(String)>
		zzqf();
	//    4    7:aload_0         
	//    5    8:invokespecial   #98  <Method void zzqf()>
		zzaoe.zzcvy.execute(((Runnable) (new zzasw(this))));
	//    6   11:getstatic       #146 <Field Executor zzaoe.zzcvy>
	//    7   14:new             #148 <Class zzasw>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #151 <Method void zzasw(zzasv)>
	//   11   22:invokeinterface #157 <Method void Executor.execute(Runnable)>
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

	final void zzvw()
	{
		super.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void zzass.destroy()>
	//    2    4:return          
	}

	private boolean zzdfh;
	private boolean zzdfi;
}
