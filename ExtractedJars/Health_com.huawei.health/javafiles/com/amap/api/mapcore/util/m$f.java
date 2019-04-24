// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

public static interface m$f
{

	public abstract EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig);

	public abstract void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext);
}
