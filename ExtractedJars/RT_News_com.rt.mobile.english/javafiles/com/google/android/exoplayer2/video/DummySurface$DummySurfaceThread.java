// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.os.*;
import android.util.Log;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;

// Referenced classes of package com.google.android.exoplayer2.video:
//			DummySurface

private static class DummySurface$DummySurfaceThread extends HandlerThread
	implements android.os.Handler.Callback
{

	private void initInternal(int i)
	{
		Assertions.checkNotNull(((Object) (eglSurfaceTexture)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
	//    2    4:invokestatic    #44  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		eglSurfaceTexture.init(i);
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #49  <Method void EGLSurfaceTexture.init(int)>
		android.graphics.SurfaceTexture surfacetexture = eglSurfaceTexture.getSurfaceTexture();
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
	//   10   20:invokevirtual   #53  <Method android.graphics.SurfaceTexture EGLSurfaceTexture.getSurfaceTexture()>
	//   11   23:astore_3        
		boolean flag;
		if(i != 0)
	//*  12   24:iload_1         
	//*  13   25:ifeq            33
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_2        
		else
	//*  16   30:goto            35
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		surface = new DummySurface(this, surfacetexture, flag, ((DummySurface._cls1) (null)));
	//   19   35:aload_0         
	//   20   36:new             #8   <Class DummySurface>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:aload_3         
	//   24   42:iload_2         
	//   25   43:aconst_null     
	//   26   44:invokespecial   #56  <Method void DummySurface(DummySurface$DummySurfaceThread, android.graphics.SurfaceTexture, boolean, DummySurface$1)>
	//   27   47:putfield        #58  <Field DummySurface surface>
	//   28   50:return          
	}

	private void releaseInternal()
	{
		Assertions.checkNotNull(((Object) (eglSurfaceTexture)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
	//    2    4:invokestatic    #44  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		eglSurfaceTexture.release();
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
	//    6   12:invokevirtual   #62  <Method void EGLSurfaceTexture.release()>
	//    7   15:return          
	}

	public boolean handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #75  <Field int Message.what>
		JVM INSTR tableswitch 1 2: default 28
	//	               1 65
	//	               2 30;
	//    2    4:tableswitch     1 2: default 28
	//	               1 65
	//	               2 30
		   goto _L1 _L2 _L3
_L1:
		return true;
	//    3   28:iconst_1        
	//    4   29:ireturn         
_L3:
		releaseInternal();
	//    5   30:aload_0         
	//    6   31:invokespecial   #77  <Method void releaseInternal()>
_L5:
		quit();
	//    7   34:aload_0         
	//    8   35:invokevirtual   #81  <Method boolean quit()>
	//    9   38:pop             
		return true;
	//   10   39:iconst_1        
	//   11   40:ireturn         
		message;
	//   12   41:astore_1        
		break; /* Loop/switch isn't completed */
	//   13   42:goto            58
		message;
	//   14   45:astore_1        
		Log.e("DummySurface", "Failed to release dummy surface", ((Throwable) (message)));
	//   15   46:ldc1            #83  <String "DummySurface">
	//   16   48:ldc1            #85  <String "Failed to release dummy surface">
	//   17   50:aload_1         
	//   18   51:invokestatic    #91  <Method int Log.e(String, String, Throwable)>
	//   19   54:pop             
		if(true) goto _L5; else goto _L4
	//   20   55:goto            34
_L4:
		quit();
	//   21   58:aload_0         
	//   22   59:invokevirtual   #81  <Method boolean quit()>
	//   23   62:pop             
		throw message;
	//   24   63:aload_1         
	//   25   64:athrow          
_L2:
		initInternal(message.arg1);
	//   26   65:aload_0         
	//   27   66:aload_1         
	//   28   67:getfield        #94  <Field int Message.arg1>
	//   29   70:invokespecial   #96  <Method void initInternal(int)>
		this;
	//   30   73:aload_0         
		JVM INSTR monitorenter ;
	//   31   74:monitorenter    
		((Object)this).notify();
	//   32   75:aload_0         
	//   33   76:invokevirtual   #101 <Method void Object.notify()>
		this;
	//   34   79:aload_0         
		JVM INSTR monitorexit ;
	//   35   80:monitorexit     
		return true;
	//   36   81:iconst_1        
	//   37   82:ireturn         
		message;
	//   38   83:astore_1        
		this;
	//   39   84:aload_0         
		JVM INSTR monitorexit ;
	//   40   85:monitorexit     
		throw message;
	//   41   86:aload_1         
	//   42   87:athrow          
		message;
	//   43   88:astore_1        
		  goto _L6
	//*  44   89:goto            152
		message;
	//   45   92:astore_1        
		Log.e("DummySurface", "Failed to initialize dummy surface", ((Throwable) (message)));
	//   46   93:ldc1            #83  <String "DummySurface">
	//   47   95:ldc1            #103 <String "Failed to initialize dummy surface">
	//   48   97:aload_1         
	//   49   98:invokestatic    #91  <Method int Log.e(String, String, Throwable)>
	//   50  101:pop             
		initError = ((Error) (message));
	//   51  102:aload_0         
	//   52  103:aload_1         
	//   53  104:putfield        #105 <Field Error initError>
		this;
	//   54  107:aload_0         
		JVM INSTR monitorenter ;
	//   55  108:monitorenter    
		((Object)this).notify();
	//   56  109:aload_0         
	//   57  110:invokevirtual   #101 <Method void Object.notify()>
		this;
	//   58  113:aload_0         
		JVM INSTR monitorexit ;
	//   59  114:monitorexit     
		return true;
	//   60  115:iconst_1        
	//   61  116:ireturn         
		message;
	//   62  117:astore_1        
		this;
	//   63  118:aload_0         
		JVM INSTR monitorexit ;
	//   64  119:monitorexit     
		throw message;
	//   65  120:aload_1         
	//   66  121:athrow          
		message;
	//   67  122:astore_1        
		Log.e("DummySurface", "Failed to initialize dummy surface", ((Throwable) (message)));
	//   68  123:ldc1            #83  <String "DummySurface">
	//   69  125:ldc1            #103 <String "Failed to initialize dummy surface">
	//   70  127:aload_1         
	//   71  128:invokestatic    #91  <Method int Log.e(String, String, Throwable)>
	//   72  131:pop             
		initException = ((RuntimeException) (message));
	//   73  132:aload_0         
	//   74  133:aload_1         
	//   75  134:putfield        #107 <Field RuntimeException initException>
		this;
	//   76  137:aload_0         
		JVM INSTR monitorenter ;
	//   77  138:monitorenter    
		((Object)this).notify();
	//   78  139:aload_0         
	//   79  140:invokevirtual   #101 <Method void Object.notify()>
		this;
	//   80  143:aload_0         
		JVM INSTR monitorexit ;
	//   81  144:monitorexit     
		return true;
	//   82  145:iconst_1        
	//   83  146:ireturn         
		message;
	//   84  147:astore_1        
		this;
	//   85  148:aload_0         
		JVM INSTR monitorexit ;
	//   86  149:monitorexit     
		throw message;
	//   87  150:aload_1         
	//   88  151:athrow          
_L6:
		this;
	//   89  152:aload_0         
		JVM INSTR monitorenter ;
	//   90  153:monitorenter    
		((Object)this).notify();
	//   91  154:aload_0         
	//   92  155:invokevirtual   #101 <Method void Object.notify()>
		this;
	//   93  158:aload_0         
		JVM INSTR monitorexit ;
	//   94  159:monitorexit     
		throw message;
	//   95  160:aload_1         
	//   96  161:athrow          
		message;
	//   97  162:astore_1        
		this;
	//   98  163:aload_0         
		JVM INSTR monitorexit ;
	//   99  164:monitorexit     
		throw message;
	//  100  165:aload_1         
	//  101  166:athrow          
	}

	public DummySurface init(int i)
	{
		start();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method void start()>
		handler = new Handler(getLooper(), ((android.os.Handler.Callback) (this)));
	//    2    4:aload_0         
	//    3    5:new             #115 <Class Handler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #119 <Method android.os.Looper getLooper()>
	//    7   13:aload_0         
	//    8   14:invokespecial   #122 <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//    9   17:putfield        #124 <Field Handler handler>
		eglSurfaceTexture = new EGLSurfaceTexture(handler);
	//   10   20:aload_0         
	//   11   21:new             #46  <Class EGLSurfaceTexture>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #124 <Field Handler handler>
	//   15   29:invokespecial   #127 <Method void EGLSurfaceTexture(Handler)>
	//   16   32:putfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
		this;
	//   17   35:aload_0         
		JVM INSTR monitorenter ;
	//   18   36:monitorenter    
		Object obj = ((Object) (handler));
	//   19   37:aload_0         
	//   20   38:getfield        #124 <Field Handler handler>
	//   21   41:astore_3        
		boolean flag = false;
	//   22   42:iconst_0        
	//   23   43:istore_2        
		((Handler) (obj)).obtainMessage(1, i, 0).sendToTarget();
	//   24   44:aload_3         
	//   25   45:iconst_1        
	//   26   46:iload_1         
	//   27   47:iconst_0        
	//   28   48:invokevirtual   #131 <Method Message Handler.obtainMessage(int, int, int)>
	//   29   51:invokevirtual   #134 <Method void Message.sendToTarget()>
		i = ((int) (flag));
	//   30   54:iload_2         
	//   31   55:istore_1        
_L2:
		if(surface != null || initException != null)
			break; /* Loop/switch isn't completed */
	//   32   56:aload_0         
	//   33   57:getfield        #58  <Field DummySurface surface>
	//   34   60:ifnonnull       91
	//   35   63:aload_0         
	//   36   64:getfield        #107 <Field RuntimeException initException>
	//   37   67:ifnonnull       91
		obj = ((Object) (initError));
	//   38   70:aload_0         
	//   39   71:getfield        #105 <Field Error initError>
	//   40   74:astore_3        
		if(obj != null)
			break; /* Loop/switch isn't completed */
	//   41   75:aload_3         
	//   42   76:ifnonnull       91
		try
		{
			((Object)this).wait();
	//   43   79:aload_0         
	//   44   80:invokevirtual   #137 <Method void Object.wait()>
		}
	//*  45   83:goto            56
	//*  46   86:iconst_1        
	//*  47   87:istore_1        
	//*  48   88:goto            56
	//*  49   91:aload_0         
	//*  50   92:monitorexit     
	//*  51   93:iload_1         
	//*  52   94:ifeq            103
	//*  53   97:invokestatic    #143 <Method Thread Thread.currentThread()>
	//*  54  100:invokevirtual   #146 <Method void Thread.interrupt()>
	//*  55  103:aload_0         
	//*  56  104:getfield        #107 <Field RuntimeException initException>
	//*  57  107:ifnull          115
	//*  58  110:aload_0         
	//*  59  111:getfield        #107 <Field RuntimeException initException>
	//*  60  114:athrow          
	//*  61  115:aload_0         
	//*  62  116:getfield        #105 <Field Error initError>
	//*  63  119:ifnull          127
	//*  64  122:aload_0         
	//*  65  123:getfield        #105 <Field Error initError>
	//*  66  126:athrow          
	//*  67  127:aload_0         
	//*  68  128:getfield        #58  <Field DummySurface surface>
	//*  69  131:invokestatic    #44  <Method Object Assertions.checkNotNull(Object)>
	//*  70  134:checkcast       #8   <Class DummySurface>
	//*  71  137:areturn         
	//*  72  138:astore_3        
	//*  73  139:aload_0         
	//*  74  140:monitorexit     
	//*  75  141:aload_3         
	//*  76  142:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			i = 1;
		}
		if(true) goto _L2; else goto _L1
_L1:
		this;
		JVM INSTR monitorexit ;
		if(i != 0)
			Thread.currentThread().interrupt();
		if(initException != null)
			throw initException;
		if(initError != null)
			throw initError;
		else
			return (DummySurface)Assertions.checkNotNull(((Object) (surface)));
		Object obj1;
		obj1;
		this;
		JVM INSTR monitorexit ;
		throw obj1;
	//*  77  143:astore_3        
	//*  78  144:goto            86
	}

	public void release()
	{
		Assertions.checkNotNull(((Object) (handler)));
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Handler handler>
	//    2    4:invokestatic    #44  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		handler.sendEmptyMessage(2);
	//    4    8:aload_0         
	//    5    9:getfield        #124 <Field Handler handler>
	//    6   12:iconst_2        
	//    7   13:invokevirtual   #150 <Method boolean Handler.sendEmptyMessage(int)>
	//    8   16:pop             
	//    9   17:return          
	}

	private static final int MSG_INIT = 1;
	private static final int MSG_RELEASE = 2;
	private EGLSurfaceTexture eglSurfaceTexture;
	private Handler handler;
	private Error initError;
	private RuntimeException initException;
	private DummySurface surface;

	public DummySurface$DummySurfaceThread()
	{
		super("dummySurface");
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "dummySurface">
	//    2    3:invokespecial   #33  <Method void HandlerThread(String)>
	//    3    6:return          
	}
}
