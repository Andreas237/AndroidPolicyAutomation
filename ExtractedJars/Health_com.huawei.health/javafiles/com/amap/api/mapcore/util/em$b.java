// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			el, em

public static class em$b extends el
{

	public EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
	{
		try
		{
			egl10 = ((EGL10) (egl10.eglCreateContext(egldisplay, eglconfig, EGL10.EGL_NO_CONTEXT, new int[] {
				12440, 2, 12344
			})));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:getstatic       #22  <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//    4    6:iconst_3        
	//    5    7:newarray        int[]
	//    6    9:dup             
	//    7   10:iconst_0        
	//    8   11:sipush          12440
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:iconst_2        
	//   13   18:iastore         
	//   14   19:dup             
	//   15   20:iconst_2        
	//   16   21:sipush          12344
	//   17   24:iastore         
	//   18   25:invokeinterface #26  <Method EGLContext EGL10.eglCreateContext(EGLDisplay, EGLConfig, EGLContext, int[])>
	//   19   30:astore_1        
		}
	//*  20   31:aload_1         
	//*  21   32:areturn         
		// Misplaced declaration of an exception variable
		catch(EGL10 egl10)
	//*  22   33:astore_1        
		{
			((Throwable) (egl10)).printStackTrace();
	//   23   34:aload_1         
	//   24   35:invokevirtual   #29  <Method void Throwable.printStackTrace()>
			return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
		}
		return ((EGLContext) (egl10));
	}

	public void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
	{
		egl10.eglDestroyContext(egldisplay, eglcontext);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #35  <Method boolean EGL10.eglDestroyContext(EGLDisplay, EGLContext)>
	//    4    8:pop             
	//    5    9:return          
	}

	public em$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void el()>
	//    2    4:return          
	}
}
