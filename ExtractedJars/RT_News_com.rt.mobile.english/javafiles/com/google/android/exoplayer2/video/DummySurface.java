// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.*;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.util.*;

public final class DummySurface extends Surface
{
	private static class DummySurfaceThread extends HandlerThread
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
			SurfaceTexture surfacetexture = eglSurfaceTexture.getSurfaceTexture();
		//    8   16:aload_0         
		//    9   17:getfield        #38  <Field EGLSurfaceTexture eglSurfaceTexture>
		//   10   20:invokevirtual   #53  <Method SurfaceTexture EGLSurfaceTexture.getSurfaceTexture()>
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
			surface = new DummySurface(this, surfacetexture, flag);
		//   19   35:aload_0         
		//   20   36:new             #8   <Class DummySurface>
		//   21   39:dup             
		//   22   40:aload_0         
		//   23   41:aload_3         
		//   24   42:iload_2         
		//   25   43:aconst_null     
		//   26   44:invokespecial   #56  <Method void DummySurface(DummySurface$DummySurfaceThread, SurfaceTexture, boolean, DummySurface$1)>
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
		//		               1 65
		//		               2 30;
		//    2    4:tableswitch     1 2: default 28
		//		               1 65
		//		               2 30
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

		public DummySurfaceThread()
		{
			super("dummySurface");
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "dummySurface">
		//    2    3:invokespecial   #33  <Method void HandlerThread(String)>
		//    3    6:return          
		}
	}


	private DummySurface(DummySurfaceThread dummysurfacethread, SurfaceTexture surfacetexture, boolean flag)
	{
		super(surfacetexture);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #35  <Method void Surface(SurfaceTexture)>
		thread = dummysurfacethread;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #37  <Field DummySurface$DummySurfaceThread thread>
		secure = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #39  <Field boolean secure>
	//    9   15:return          
	}


	private static void assertApiLevel17OrHigher()
	{
		if(Util.SDK_INT < 17)
	//*   0    0:getstatic       #50  <Field int Util.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          18
			throw new UnsupportedOperationException("Unsupported prior to API level 17");
	//    3    8:new             #52  <Class UnsupportedOperationException>
	//    4   11:dup             
	//    5   12:ldc1            #54  <String "Unsupported prior to API level 17">
	//    6   14:invokespecial   #57  <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	private static int getSecureModeV24(Context context)
	{
		if(Util.SDK_INT < 26 && ("samsung".equals(((Object) (Util.MANUFACTURER))) || "XT1650".equals(((Object) (Util.MODEL)))))
	//*   0    0:getstatic       #50  <Field int Util.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          32
	//*   3    8:ldc1            #62  <String "samsung">
	//*   4   10:getstatic       #65  <Field String Util.MANUFACTURER>
	//*   5   13:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*   6   16:ifne            30
	//*   7   19:ldc1            #73  <String "XT1650">
	//*   8   21:getstatic       #76  <Field String Util.MODEL>
	//*   9   24:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  10   27:ifeq            32
			return 0;
	//   11   30:iconst_0        
	//   12   31:ireturn         
		if(Util.SDK_INT < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))
	//*  13   32:getstatic       #50  <Field int Util.SDK_INT>
	//*  14   35:bipush          26
	//*  15   37:icmpge          54
	//*  16   40:aload_0         
	//*  17   41:invokevirtual   #82  <Method PackageManager Context.getPackageManager()>
	//*  18   44:ldc1            #84  <String "android.hardware.vr.high_performance">
	//*  19   46:invokevirtual   #90  <Method boolean PackageManager.hasSystemFeature(String)>
	//*  20   49:ifne            54
			return 0;
	//   21   52:iconst_0        
	//   22   53:ireturn         
		context = ((Context) (EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)));
	//   23   54:iconst_0        
	//   24   55:invokestatic    #96  <Method android.opengl.EGLDisplay EGL14.eglGetDisplay(int)>
	//   25   58:sipush          12373
	//   26   61:invokestatic    #100 <Method String EGL14.eglQueryString(android.opengl.EGLDisplay, int)>
	//   27   64:astore_0        
		if(context == null)
	//*  28   65:aload_0         
	//*  29   66:ifnonnull       71
			return 0;
	//   30   69:iconst_0        
	//   31   70:ireturn         
		if(!((String) (context)).contains("EGL_EXT_protected_content"))
	//*  32   71:aload_0         
	//*  33   72:ldc1            #16  <String "EGL_EXT_protected_content">
	//*  34   74:invokevirtual   #104 <Method boolean String.contains(CharSequence)>
	//*  35   77:ifne            82
			return 0;
	//   36   80:iconst_0        
	//   37   81:ireturn         
		return !((String) (context)).contains("EGL_KHR_surfaceless_context") ? 2 : 1;
	//   38   82:aload_0         
	//   39   83:ldc1            #19  <String "EGL_KHR_surfaceless_context">
	//   40   85:invokevirtual   #104 <Method boolean String.contains(CharSequence)>
	//   41   88:ifeq            93
	//   42   91:iconst_1        
	//   43   92:ireturn         
	//   44   93:iconst_2        
	//   45   94:ireturn         
	}

	public static boolean isSecureSupported(Context context)
	{
		com/google/android/exoplayer2/video/DummySurface;
	//    0    0:ldc1            #2   <Class DummySurface>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag1 = secureModeInitialized;
	//    2    3:getstatic       #109 <Field boolean secureModeInitialized>
	//    3    6:istore_3        
		boolean flag;
		flag = true;
	//    4    7:iconst_1        
	//    5    8:istore_2        
		if(flag1)
			break MISSING_BLOCK_LABEL_39;
	//    6    9:iload_3         
	//    7   10:ifne            39
		int i;
		if(Util.SDK_INT < 24)
	//*   8   13:getstatic       #50  <Field int Util.SDK_INT>
	//*   9   16:bipush          24
	//*  10   18:icmpge          26
		{
			i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
			break MISSING_BLOCK_LABEL_31;
	//   13   23:goto            31
		}
		i = getSecureModeV24(context);
	//   14   26:aload_0         
	//   15   27:invokestatic    #111 <Method int getSecureModeV24(Context)>
	//   16   30:istore_1        
		secureMode = i;
	//   17   31:iload_1         
	//   18   32:putstatic       #113 <Field int secureMode>
		secureModeInitialized = true;
	//   19   35:iconst_1        
	//   20   36:putstatic       #109 <Field boolean secureModeInitialized>
		i = secureMode;
	//   21   39:getstatic       #113 <Field int secureMode>
	//   22   42:istore_1        
		if(i == 0)
	//*  23   43:iload_1         
	//*  24   44:ifeq            50
	//*  25   47:goto            52
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		com/google/android/exoplayer2/video/DummySurface;
	//   28   52:ldc1            #2   <Class DummySurface>
		JVM INSTR monitorexit ;
	//   29   54:monitorexit     
		return flag;
	//   30   55:iload_2         
	//   31   56:ireturn         
		context;
	//   32   57:astore_0        
	//*  33   58:ldc1            #2   <Class DummySurface>
		throw context;
	//   34   60:monitorexit     
	//   35   61:aload_0         
	//   36   62:athrow          
	}

	public static DummySurface newInstanceV17(Context context, boolean flag)
	{
		assertApiLevel17OrHigher();
	//    0    0:invokestatic    #117 <Method void assertApiLevel17OrHigher()>
		int i = 0;
	//    1    3:iconst_0        
	//    2    4:istore_2        
		boolean flag1;
		if(flag && !isSecureSupported(context))
	//*   3    5:iload_1         
	//*   4    6:ifeq            24
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #119 <Method boolean isSecureSupported(Context)>
	//*   7   13:ifeq            19
	//*   8   16:goto            24
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore_3        
		else
	//*  11   21:goto            26
			flag1 = true;
	//   12   24:iconst_1        
	//   13   25:istore_3        
		Assertions.checkState(flag1);
	//   14   26:iload_3         
	//   15   27:invokestatic    #125 <Method void Assertions.checkState(boolean)>
		context = ((Context) (new DummySurfaceThread()));
	//   16   30:new             #8   <Class DummySurface$DummySurfaceThread>
	//   17   33:dup             
	//   18   34:invokespecial   #127 <Method void DummySurface$DummySurfaceThread()>
	//   19   37:astore_0        
		if(flag)
	//*  20   38:iload_1         
	//*  21   39:ifeq            46
			i = secureMode;
	//   22   42:getstatic       #113 <Field int secureMode>
	//   23   45:istore_2        
		return ((DummySurfaceThread) (context)).init(i);
	//   24   46:aload_0         
	//   25   47:iload_2         
	//   26   48:invokevirtual   #131 <Method DummySurface DummySurface$DummySurfaceThread.init(int)>
	//   27   51:areturn         
	}

	public void release()
	{
		super.release();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void Surface.release()>
		synchronized(thread)
	//*   2    4:aload_0         
	//*   3    5:getfield        #37  <Field DummySurface$DummySurfaceThread thread>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			if(!threadReleased)
	//*   7   11:aload_0         
	//*   8   12:getfield        #136 <Field boolean threadReleased>
	//*   9   15:ifne            30
			{
				thread.release();
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field DummySurface$DummySurfaceThread thread>
	//   12   22:invokevirtual   #137 <Method void DummySurface$DummySurfaceThread.release()>
				threadReleased = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #136 <Field boolean threadReleased>
			}
		}
	//   16   30:aload_1         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		exception;
	//   19   33:astore_2        
		dummysurfacethread;
	//   20   34:aload_1         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw exception;
	//   22   36:aload_2         
	//   23   37:athrow          
	}

	private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
	private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
	private static final String TAG = "DummySurface";
	private static int secureMode;
	private static boolean secureModeInitialized;
	public final boolean secure;
	private final DummySurfaceThread thread;
	private boolean threadReleased;
}
