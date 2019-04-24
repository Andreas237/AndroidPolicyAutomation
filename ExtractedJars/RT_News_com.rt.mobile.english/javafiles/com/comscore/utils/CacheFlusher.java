// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.os.*;
import com.comscore.analytics.Core;

// Referenced classes of package com.comscore.utils:
//			Storage, CSLog

public class CacheFlusher
	implements Runnable
{

	public CacheFlusher(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #20  <Long -1L>
	//    4    8:putfield        #23  <Field long d>
		a = core;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #25  <Field Core a>
	//    8   16:return          
	}

	protected void a()
	{
		if(!a.getStorage().has("plannedFlushTime").booleanValue())
			break MISSING_BLOCK_LABEL_39;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Core a>
	//    2    4:invokevirtual   #34  <Method Storage Core.getStorage()>
	//    3    7:ldc1            #36  <String "plannedFlushTime">
	//    4    9:invokevirtual   #42  <Method Boolean Storage.has(String)>
	//    5   12:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
	//    6   15:ifeq            39
		d = Long.parseLong(a.getStorage().get("plannedFlushTime"), 10);
	//    7   18:aload_0         
	//    8   19:aload_0         
	//    9   20:getfield        #25  <Field Core a>
	//   10   23:invokevirtual   #34  <Method Storage Core.getStorage()>
	//   11   26:ldc1            #36  <String "plannedFlushTime">
	//   12   28:invokevirtual   #52  <Method String Storage.get(String)>
	//   13   31:bipush          10
	//   14   33:invokestatic    #58  <Method long Long.parseLong(String, int)>
	//   15   36:putfield        #23  <Field long d>
		return;
	//   16   39:return          
		Exception exception;
		exception;
	//   17   40:astore_1        
	//   18   41:return          
	}

	protected void a(long l)
	{
		d = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #23  <Field long d>
		a.getStorage().set("plannedFlushTime", Long.toString(l, 10));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field Core a>
	//    5    9:invokevirtual   #34  <Method Storage Core.getStorage()>
	//    6   12:ldc1            #36  <String "plannedFlushTime">
	//    7   14:lload_1         
	//    8   15:bipush          10
	//    9   17:invokestatic    #63  <Method String Long.toString(long, int)>
	//   10   20:invokevirtual   #67  <Method void Storage.set(String, String)>
	//   11   23:return          
	}

	protected void b()
	{
		if(d < 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field long d>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifge            28
			a(SystemClock.uptimeMillis() + a.getCacheFlushingInterval() * 1000L);
	//    5    9:aload_0         
	//    6   10:invokestatic    #73  <Method long SystemClock.uptimeMillis()>
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field Core a>
	//    9   17:invokevirtual   #76  <Method long Core.getCacheFlushingInterval()>
	//   10   20:ldc2w           #77  <Long 1000L>
	//   11   23:lmul            
	//   12   24:ladd            
	//   13   25:invokevirtual   #80  <Method void a(long)>
		b.postAtTime(((Runnable) (this)), d);
	//   14   28:aload_0         
	//   15   29:getfield        #82  <Field Handler b>
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #23  <Field long d>
	//   19   37:invokevirtual   #88  <Method boolean Handler.postAtTime(Runnable, long)>
	//   20   40:pop             
	//   21   41:return          
	}

	protected void c()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a.getCacheFlushingInterval() <= 0L) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field Core a>
	//    4    6:invokevirtual   #76  <Method long Core.getCacheFlushingInterval()>
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:ifle            65
_L1:
		long l = SystemClock.uptimeMillis() + a.getCacheFlushingInterval() * 1000L;
	//    8   14:invokestatic    #73  <Method long SystemClock.uptimeMillis()>
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field Core a>
	//   11   21:invokevirtual   #76  <Method long Core.getCacheFlushingInterval()>
	//   12   24:ldc2w           #77  <Long 1000L>
	//   13   27:lmul            
	//   14   28:ladd            
	//   15   29:lstore_1        
	//*  16   30:goto            33
_L4:
		a(l);
	//   17   33:aload_0         
	//   18   34:lload_1         
	//   19   35:invokevirtual   #80  <Method void a(long)>
		if(b != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #82  <Field Handler b>
	//*  22   42:ifnull          57
		{
			b.removeCallbacks(((Runnable) (this)));
	//   23   45:aload_0         
	//   24   46:getfield        #82  <Field Handler b>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #92  <Method void Handler.removeCallbacks(Runnable)>
			b();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #94  <Method void b()>
		}
		this;
	//   29   57:aload_0         
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		return;
	//   31   59:return          
		Exception exception;
		exception;
	//   32   60:astore_3        
	//*  33   61:aload_0         
		throw exception;
	//   34   62:monitorexit     
	//   35   63:aload_3         
	//   36   64:athrow          
_L2:
		l = -1L;
	//   37   65:ldc2w           #20  <Long -1L>
	//   38   68:lstore_1        
		if(true) goto _L4; else goto _L3
	//   39   69:goto            33
_L3:
	}

	protected void d()
	{
		HandlerThread handlerthread = new HandlerThread("CacheFlusher");
	//    0    0:new             #96  <Class HandlerThread>
	//    1    3:dup             
	//    2    4:ldc1            #98  <String "CacheFlusher">
	//    3    6:invokespecial   #101 <Method void HandlerThread(String)>
	//    4    9:astore_1        
		handlerthread.start();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #104 <Method void HandlerThread.start()>
		b = new Handler(handlerthread.getLooper());
	//    7   14:aload_0         
	//    8   15:new             #84  <Class Handler>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokevirtual   #108 <Method Looper HandlerThread.getLooper()>
	//   12   23:invokespecial   #111 <Method void Handler(Looper)>
	//   13   26:putfield        #82  <Field Handler b>
		a();
	//   14   29:aload_0         
	//   15   30:invokevirtual   #113 <Method void a()>
	//   16   33:return          
	}

	protected void e()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Handler b>
	//*   2    4:ifnull          22
		{
			b.getLooper().quit();
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field Handler b>
	//    5   11:invokevirtual   #115 <Method Looper Handler.getLooper()>
	//    6   14:invokevirtual   #120 <Method void Looper.quit()>
			b = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #82  <Field Handler b>
		}
	//   10   22:return          
	}

	public void run()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSLog.d(((Object) (this)), "run(): Flushing the cache");
	//    2    2:aload_0         
	//    3    3:ldc1            #123 <String "run(): Flushing the cache">
	//    4    5:invokestatic    #128 <Method void CSLog.d(Object, String)>
		a.flush(false);
	//    5    8:aload_0         
	//    6    9:getfield        #25  <Field Core a>
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #132 <Method void Core.flush(boolean)>
		a(-1L);
	//    9   16:aload_0         
	//   10   17:ldc2w           #20  <Long -1L>
	//   11   20:invokevirtual   #80  <Method void a(long)>
		b();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #94  <Method void b()>
		this;
	//   14   27:aload_0         
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		Exception exception;
		exception;
	//   17   30:astore_1        
	//*  18   31:aload_0         
		throw exception;
	//   19   32:monitorexit     
	//   20   33:aload_1         
	//   21   34:athrow          
	}

	public void start()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSLog.d(((Object) (this)), "start()");
	//    2    2:aload_0         
	//    3    3:ldc1            #134 <String "start()">
	//    4    5:invokestatic    #128 <Method void CSLog.d(Object, String)>
		c = true;
	//    5    8:aload_0         
	//    6    9:iconst_1        
	//    7   10:putfield        #136 <Field boolean c>
		if(b == null && a.getCacheFlushingInterval() > 0L && a.getCustomerC2() != null)
	//*   8   13:aload_0         
	//*   9   14:getfield        #82  <Field Handler b>
	//*  10   17:ifnonnull       50
	//*  11   20:aload_0         
	//*  12   21:getfield        #25  <Field Core a>
	//*  13   24:invokevirtual   #76  <Method long Core.getCacheFlushingInterval()>
	//*  14   27:lconst_0        
	//*  15   28:lcmp            
	//*  16   29:ifle            50
	//*  17   32:aload_0         
	//*  18   33:getfield        #25  <Field Core a>
	//*  19   36:invokevirtual   #140 <Method String Core.getCustomerC2()>
	//*  20   39:ifnull          50
		{
			d();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #142 <Method void d()>
			b();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #94  <Method void b()>
		}
		this;
	//   25   50:aload_0         
		JVM INSTR monitorexit ;
	//   26   51:monitorexit     
		return;
	//   27   52:return          
		Exception exception;
		exception;
	//   28   53:astore_1        
	//*  29   54:aload_0         
		throw exception;
	//   30   55:monitorexit     
	//   31   56:aload_1         
	//   32   57:athrow          
	}

	public void stop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSLog.d(((Object) (this)), "stop()");
	//    2    2:aload_0         
	//    3    3:ldc1            #145 <String "stop()">
	//    4    5:invokestatic    #128 <Method void CSLog.d(Object, String)>
		c = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #136 <Field boolean c>
		e();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #147 <Method void e()>
		this;
	//   10   17:aload_0         
		JVM INSTR monitorexit ;
	//   11   18:monitorexit     
		return;
	//   12   19:return          
		Exception exception;
		exception;
	//   13   20:astore_1        
	//*  14   21:aload_0         
		throw exception;
	//   15   22:monitorexit     
	//   16   23:aload_1         
	//   17   24:athrow          
	}

	public void update()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a.getCacheFlushingInterval() <= 0L || a.getCustomerC2() == null)
			break MISSING_BLOCK_LABEL_66;
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field Core a>
	//    4    6:invokevirtual   #76  <Method long Core.getCacheFlushingInterval()>
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:ifle            66
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field Core a>
	//   10   18:invokevirtual   #140 <Method String Core.getCustomerC2()>
	//   11   21:ifnull          66
		if(b == null && c)
	//*  12   24:aload_0         
	//*  13   25:getfield        #82  <Field Handler b>
	//*  14   28:ifnonnull       52
	//*  15   31:aload_0         
	//*  16   32:getfield        #136 <Field boolean c>
	//*  17   35:ifeq            52
		{
			a(-1L);
	//   18   38:aload_0         
	//   19   39:ldc2w           #20  <Long -1L>
	//   20   42:invokevirtual   #80  <Method void a(long)>
			start();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #149 <Method void start()>
			break MISSING_BLOCK_LABEL_77;
	//   23   49:goto            77
		}
		if(b != null)
	//*  24   52:aload_0         
	//*  25   53:getfield        #82  <Field Handler b>
	//*  26   56:ifnull          77
			c();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #151 <Method void c()>
		break MISSING_BLOCK_LABEL_77;
	//   29   63:goto            77
		a(-1L);
	//   30   66:aload_0         
	//   31   67:ldc2w           #20  <Long -1L>
	//   32   70:invokevirtual   #80  <Method void a(long)>
		e();
	//   33   73:aload_0         
	//   34   74:invokevirtual   #147 <Method void e()>
		this;
	//   35   77:aload_0         
		JVM INSTR monitorexit ;
	//   36   78:monitorexit     
		return;
	//   37   79:return          
		Exception exception;
		exception;
	//   38   80:astore_1        
	//*  39   81:aload_0         
		throw exception;
	//   40   82:monitorexit     
	//   41   83:aload_1         
	//   42   84:athrow          
	}

	protected Core a;
	protected Handler b;
	protected boolean c;
	protected long d;
}
