// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.util.Log;
import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

class m$c
	implements m$f
{

	public EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
	{
		int i = m.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field m a>
	//    2    4:invokestatic    #27  <Method int m.a(m)>
	//    3    7:istore          4
		EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
	//    4    9:getstatic       #33  <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//    5   12:astore          6
		int ai[];
		if(m.a(a) != 0)
	//*   6   14:aload_0         
	//*   7   15:getfield        #15  <Field m a>
	//*   8   18:invokestatic    #27  <Method int m.a(m)>
	//*   9   21:ifeq            49
			ai = (new int[] {
				12440, i, 12344
			});
	//   10   24:iconst_3        
	//   11   25:newarray        int[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:sipush          12440
	//   15   32:iastore         
	//   16   33:dup             
	//   17   34:iconst_1        
	//   18   35:iload           4
	//   19   37:iastore         
	//   20   38:dup             
	//   21   39:iconst_2        
	//   22   40:sipush          12344
	//   23   43:iastore         
	//   24   44:astore          5
		else
	//*  25   46:goto            52
			ai = null;
	//   26   49:aconst_null     
	//   27   50:astore          5
		return egl10.eglCreateContext(egldisplay, eglconfig, eglcontext, ai);
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:aload_3         
	//   31   55:aload           6
	//   32   57:aload           5
	//   33   59:invokeinterface #37  <Method EGLContext EGL10.eglCreateContext(EGLDisplay, EGLConfig, EGLContext, int[])>
	//   34   64:areturn         
	}

	public void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
	{
		if(!egl10.eglDestroyContext(egldisplay, eglcontext))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokeinterface #43  <Method boolean EGL10.eglDestroyContext(EGLDisplay, EGLContext)>
	//*   4    8:ifne            56
		{
			Log.e("DefaultContextFactory", (new StringBuilder()).append("display:").append(((Object) (egldisplay))).append(" context: ").append(((Object) (eglcontext))).toString());
	//    5   11:ldc1            #45  <String "DefaultContextFactory">
	//    6   13:new             #47  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #48  <Method void StringBuilder()>
	//    9   20:ldc1            #50  <String "display:">
	//   10   22:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc1            #59  <String " context: ">
	//   14   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:aload_3         
	//   16   35:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   17   38:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   18   41:invokestatic    #69  <Method int Log.e(String, String)>
	//   19   44:pop             
			m$h.a("eglDestroyContex", egl10.eglGetError());
	//   20   45:ldc1            #71  <String "eglDestroyContex">
	//   21   47:aload_1         
	//   22   48:invokeinterface #75  <Method int EGL10.eglGetError()>
	//   23   53:invokestatic    #80  <Method void m$h.a(String, int)>
		}
	//   24   56:return          
	}

	final m a;

	private m$c(m m1)
	{
		a = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field m a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	m$c(m m1, m$1 m$1)
	{
		this(m1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void m$c(m)>
	//    3    5:return          
	}
}
