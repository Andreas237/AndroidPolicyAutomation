// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.util.Log;
import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

static class m$d
	implements m$g
{

	public EGLSurface a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
	{
		try
		{
			egl10 = ((EGL10) (egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, ((int []) (null)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:invokeinterface #26  <Method EGLSurface EGL10.eglCreateWindowSurface(EGLDisplay, EGLConfig, Object, int[])>
	//    6   11:astore_1        
		}
	//*   7   12:aload_1         
	//*   8   13:areturn         
		// Misplaced declaration of an exception variable
		catch(EGL10 egl10)
	//*   9   14:astore_1        
		{
			Log.e("GLSurfaceView", "eglCreateWindowSurface", ((Throwable) (egl10)));
	//   10   15:ldc1            #28  <String "GLSurfaceView">
	//   11   17:ldc1            #29  <String "eglCreateWindowSurface">
	//   12   19:aload_1         
	//   13   20:invokestatic    #35  <Method int Log.e(String, String, Throwable)>
	//   14   23:pop             
			return null;
	//   15   24:aconst_null     
	//   16   25:areturn         
		}
		return ((EGLSurface) (egl10));
	}

	public void a(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface)
	{
		egl10.eglDestroySurface(egldisplay, eglsurface);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #40  <Method boolean EGL10.eglDestroySurface(EGLDisplay, EGLSurface)>
	//    4    8:pop             
	//    5    9:return          
	}

	private m$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	m$d(m$1 m$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void m$d()>
	//    2    4:return          
	}
}
