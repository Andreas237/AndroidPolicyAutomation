// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

public static interface m$g
{

	public abstract EGLSurface a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj);

	public abstract void a(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface);
}
