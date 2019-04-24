// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.opengl.GLDebugHelper;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.*;
import javax.microedition.khronos.opengles.GL;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

static class m$h
{

	private void a(String s)
	{
		a(s, a.eglGetError());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field EGL10 a>
	//    3    5:invokeinterface #39  <Method int EGL10.eglGetError()>
	//    4   10:invokestatic    #42  <Method void a(String, int)>
	//    5   13:return          
	}

	public static void a(String s, int i)
	{
		throw new RuntimeException(b(s, i));
	//    0    0:new             #44  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #47  <Method String b(String, int)>
	//    5    9:invokespecial   #49  <Method void RuntimeException(String)>
	//    6   12:athrow          
	}

	public static void a(String s, String s1, int i)
	{
		Log.w(s, b(s1, i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #47  <Method String b(String, int)>
	//    4    6:invokestatic    #56  <Method int Log.w(String, String)>
	//    5    9:pop             
	//    6   10:return          
	}

	public static String b(String s, int i)
	{
		return (new StringBuilder()).append(s).append(" failed: ").append(i).toString();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #65  <String " failed: ">
	//    6   13:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:iload_1         
	//    8   17:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//    9   20:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   10   23:areturn         
	}

	private void g()
	{
		if(c != null && c != EGL10.EGL_NO_SURFACE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field EGLSurface c>
	//*   2    4:ifnull          81
	//*   3    7:aload_0         
	//*   4    8:getfield        #75  <Field EGLSurface c>
	//*   5   11:getstatic       #78  <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//*   6   14:if_acmpeq       81
		{
			a.eglMakeCurrent(b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
	//    7   17:aload_0         
	//    8   18:getfield        #33  <Field EGL10 a>
	//    9   21:aload_0         
	//   10   22:getfield        #80  <Field EGLDisplay b>
	//   11   25:getstatic       #78  <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//   12   28:getstatic       #78  <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//   13   31:getstatic       #83  <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//   14   34:invokeinterface #87  <Method boolean EGL10.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//   15   39:pop             
			m m1 = (m)f.get();
	//   16   40:aload_0         
	//   17   41:getfield        #27  <Field WeakReference f>
	//   18   44:invokevirtual   #93  <Method Object WeakReference.get()>
	//   19   47:checkcast       #6   <Class m>
	//   20   50:astore_1        
			if(m1 != null)
	//*  21   51:aload_1         
	//*  22   52:ifnull          76
				m.d(m1).a(a, b, c);
	//   23   55:aload_1         
	//   24   56:invokestatic    #96  <Method m$g m.d(m)>
	//   25   59:aload_0         
	//   26   60:getfield        #33  <Field EGL10 a>
	//   27   63:aload_0         
	//   28   64:getfield        #80  <Field EGLDisplay b>
	//   29   67:aload_0         
	//   30   68:getfield        #75  <Field EGLSurface c>
	//   31   71:invokeinterface #101 <Method void m$g.a(EGL10, EGLDisplay, EGLSurface)>
			c = null;
	//   32   76:aload_0         
	//   33   77:aconst_null     
	//   34   78:putfield        #75  <Field EGLSurface c>
		}
	//   35   81:return          
	}

	public void a()
	{
		a = (EGL10)EGLContext.getEGL();
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method javax.microedition.khronos.egl.EGL EGLContext.getEGL()>
	//    2    4:checkcast       #35  <Class EGL10>
	//    3    7:putfield        #33  <Field EGL10 a>
		b = a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field EGL10 a>
	//    7   15:getstatic       #111 <Field Object EGL10.EGL_DEFAULT_DISPLAY>
	//    8   18:invokeinterface #115 <Method EGLDisplay EGL10.eglGetDisplay(Object)>
	//    9   23:putfield        #80  <Field EGLDisplay b>
		if(b == EGL10.EGL_NO_DISPLAY)
	//*  10   26:aload_0         
	//*  11   27:getfield        #80  <Field EGLDisplay b>
	//*  12   30:getstatic       #118 <Field EGLDisplay EGL10.EGL_NO_DISPLAY>
	//*  13   33:if_acmpne       46
			throw new RuntimeException("eglGetDisplay failed");
	//   14   36:new             #44  <Class RuntimeException>
	//   15   39:dup             
	//   16   40:ldc1            #120 <String "eglGetDisplay failed">
	//   17   42:invokespecial   #49  <Method void RuntimeException(String)>
	//   18   45:athrow          
		int ai[] = new int[2];
	//   19   46:iconst_2        
	//   20   47:newarray        int[]
	//   21   49:astore_1        
		if(!a.eglInitialize(b, ai))
	//*  22   50:aload_0         
	//*  23   51:getfield        #33  <Field EGL10 a>
	//*  24   54:aload_0         
	//*  25   55:getfield        #80  <Field EGLDisplay b>
	//*  26   58:aload_1         
	//*  27   59:invokeinterface #124 <Method boolean EGL10.eglInitialize(EGLDisplay, int[])>
	//*  28   64:ifne            77
			throw new RuntimeException("eglInitialize failed");
	//   29   67:new             #44  <Class RuntimeException>
	//   30   70:dup             
	//   31   71:ldc1            #126 <String "eglInitialize failed">
	//   32   73:invokespecial   #49  <Method void RuntimeException(String)>
	//   33   76:athrow          
		m m1 = (m)f.get();
	//   34   77:aload_0         
	//   35   78:getfield        #27  <Field WeakReference f>
	//   36   81:invokevirtual   #93  <Method Object WeakReference.get()>
	//   37   84:checkcast       #6   <Class m>
	//   38   87:astore_1        
		if(m1 == null)
	//*  39   88:aload_1         
	//*  40   89:ifnonnull       105
		{
			d = null;
	//   41   92:aload_0         
	//   42   93:aconst_null     
	//   43   94:putfield        #128 <Field EGLConfig d>
			e = null;
	//   44   97:aload_0         
	//   45   98:aconst_null     
	//   46   99:putfield        #130 <Field EGLContext e>
		} else
	//*  47  102:goto            151
		{
			d = m.b(m1).chooseConfig(a, b);
	//   48  105:aload_0         
	//   49  106:aload_1         
	//   50  107:invokestatic    #133 <Method m$e m.b(m)>
	//   51  110:aload_0         
	//   52  111:getfield        #33  <Field EGL10 a>
	//   53  114:aload_0         
	//   54  115:getfield        #80  <Field EGLDisplay b>
	//   55  118:invokeinterface #139 <Method EGLConfig m$e.chooseConfig(EGL10, EGLDisplay)>
	//   56  123:putfield        #128 <Field EGLConfig d>
			e = m.c(m1).createContext(a, b, d);
	//   57  126:aload_0         
	//   58  127:aload_1         
	//   59  128:invokestatic    #142 <Method m$f m.c(m)>
	//   60  131:aload_0         
	//   61  132:getfield        #33  <Field EGL10 a>
	//   62  135:aload_0         
	//   63  136:getfield        #80  <Field EGLDisplay b>
	//   64  139:aload_0         
	//   65  140:getfield        #128 <Field EGLConfig d>
	//   66  143:invokeinterface #148 <Method EGLContext m$f.createContext(EGL10, EGLDisplay, EGLConfig)>
	//   67  148:putfield        #130 <Field EGLContext e>
		}
		if(e == null || e == EGL10.EGL_NO_CONTEXT)
	//*  68  151:aload_0         
	//*  69  152:getfield        #130 <Field EGLContext e>
	//*  70  155:ifnull          168
	//*  71  158:aload_0         
	//*  72  159:getfield        #130 <Field EGLContext e>
	//*  73  162:getstatic       #83  <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//*  74  165:if_acmpne       179
		{
			e = null;
	//   75  168:aload_0         
	//   76  169:aconst_null     
	//   77  170:putfield        #130 <Field EGLContext e>
			a("createContext");
	//   78  173:aload_0         
	//   79  174:ldc1            #149 <String "createContext">
	//   80  176:invokespecial   #151 <Method void a(String)>
		}
		c = null;
	//   81  179:aload_0         
	//   82  180:aconst_null     
	//   83  181:putfield        #75  <Field EGLSurface c>
	//   84  184:return          
	}

	public boolean b()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field EGL10 a>
	//*   2    4:ifnonnull       17
			throw new RuntimeException("egl not initialized");
	//    3    7:new             #44  <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc1            #154 <String "egl not initialized">
	//    6   13:invokespecial   #49  <Method void RuntimeException(String)>
	//    7   16:athrow          
		if(b == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #80  <Field EGLDisplay b>
	//*  10   21:ifnonnull       34
			throw new RuntimeException("eglDisplay not initialized");
	//   11   24:new             #44  <Class RuntimeException>
	//   12   27:dup             
	//   13   28:ldc1            #156 <String "eglDisplay not initialized">
	//   14   30:invokespecial   #49  <Method void RuntimeException(String)>
	//   15   33:athrow          
		if(d == null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #128 <Field EGLConfig d>
	//*  18   38:ifnonnull       51
			throw new RuntimeException("mEglConfig not initialized");
	//   19   41:new             #44  <Class RuntimeException>
	//   20   44:dup             
	//   21   45:ldc1            #158 <String "mEglConfig not initialized">
	//   22   47:invokespecial   #49  <Method void RuntimeException(String)>
	//   23   50:athrow          
		g();
	//   24   51:aload_0         
	//   25   52:invokespecial   #160 <Method void g()>
		m m1 = (m)f.get();
	//   26   55:aload_0         
	//   27   56:getfield        #27  <Field WeakReference f>
	//   28   59:invokevirtual   #93  <Method Object WeakReference.get()>
	//   29   62:checkcast       #6   <Class m>
	//   30   65:astore_1        
		if(m1 != null)
	//*  31   66:aload_1         
	//*  32   67:ifnull          102
			c = m.d(m1).a(a, b, d, ((Object) (m1.getSurfaceTexture())));
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:invokestatic    #96  <Method m$g m.d(m)>
	//   36   75:aload_0         
	//   37   76:getfield        #33  <Field EGL10 a>
	//   38   79:aload_0         
	//   39   80:getfield        #80  <Field EGLDisplay b>
	//   40   83:aload_0         
	//   41   84:getfield        #128 <Field EGLConfig d>
	//   42   87:aload_1         
	//   43   88:invokevirtual   #164 <Method android.graphics.SurfaceTexture m.getSurfaceTexture()>
	//   44   91:invokeinterface #167 <Method EGLSurface m$g.a(EGL10, EGLDisplay, EGLConfig, Object)>
	//   45   96:putfield        #75  <Field EGLSurface c>
		else
	//*  46   99:goto            107
			c = null;
	//   47  102:aload_0         
	//   48  103:aconst_null     
	//   49  104:putfield        #75  <Field EGLSurface c>
		if(c == null || c == EGL10.EGL_NO_SURFACE)
	//*  50  107:aload_0         
	//*  51  108:getfield        #75  <Field EGLSurface c>
	//*  52  111:ifnull          124
	//*  53  114:aload_0         
	//*  54  115:getfield        #75  <Field EGLSurface c>
	//*  55  118:getstatic       #78  <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//*  56  121:if_acmpne       149
		{
			if(a.eglGetError() == 12299)
	//*  57  124:aload_0         
	//*  58  125:getfield        #33  <Field EGL10 a>
	//*  59  128:invokeinterface #39  <Method int EGL10.eglGetError()>
	//*  60  133:sipush          12299
	//*  61  136:icmpne          147
				Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
	//   62  139:ldc1            #169 <String "EglHelper">
	//   63  141:ldc1            #171 <String "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.">
	//   64  143:invokestatic    #173 <Method int Log.e(String, String)>
	//   65  146:pop             
			return false;
	//   66  147:iconst_0        
	//   67  148:ireturn         
		}
		if(!a.eglMakeCurrent(b, c, c, e))
	//*  68  149:aload_0         
	//*  69  150:getfield        #33  <Field EGL10 a>
	//*  70  153:aload_0         
	//*  71  154:getfield        #80  <Field EGLDisplay b>
	//*  72  157:aload_0         
	//*  73  158:getfield        #75  <Field EGLSurface c>
	//*  74  161:aload_0         
	//*  75  162:getfield        #75  <Field EGLSurface c>
	//*  76  165:aload_0         
	//*  77  166:getfield        #130 <Field EGLContext e>
	//*  78  169:invokeinterface #87  <Method boolean EGL10.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//*  79  174:ifne            195
		{
			a("EGLHelper", "eglMakeCurrent", a.eglGetError());
	//   80  177:ldc1            #175 <String "EGLHelper">
	//   81  179:ldc1            #176 <String "eglMakeCurrent">
	//   82  181:aload_0         
	//   83  182:getfield        #33  <Field EGL10 a>
	//   84  185:invokeinterface #39  <Method int EGL10.eglGetError()>
	//   85  190:invokestatic    #178 <Method void a(String, String, int)>
			return false;
	//   86  193:iconst_0        
	//   87  194:ireturn         
		} else
		{
			return true;
	//   88  195:iconst_1        
	//   89  196:ireturn         
		}
	}

	GL c()
	{
		GL gl1 = e.getGL();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field EGLContext e>
	//    2    4:invokevirtual   #182 <Method GL EGLContext.getGL()>
	//    3    7:astore          4
		m m1 = (m)f.get();
	//    4    9:aload_0         
	//    5   10:getfield        #27  <Field WeakReference f>
	//    6   13:invokevirtual   #93  <Method Object WeakReference.get()>
	//    7   16:checkcast       #6   <Class m>
	//    8   19:astore          5
		Object obj = ((Object) (gl1));
	//    9   21:aload           4
	//   10   23:astore_3        
		if(m1 != null)
	//*  11   24:aload           5
	//*  12   26:ifnull          106
		{
			GL gl = gl1;
	//   13   29:aload           4
	//   14   31:astore_2        
			if(m.e(m1) != null)
	//*  15   32:aload           5
	//*  16   34:invokestatic    #185 <Method m$k m.e(m)>
	//*  17   37:ifnull          53
				gl = m.e(m1).a(gl1);
	//   18   40:aload           5
	//   19   42:invokestatic    #185 <Method m$k m.e(m)>
	//   20   45:aload           4
	//   21   47:invokeinterface #190 <Method GL m$k.a(GL)>
	//   22   52:astore_2        
			obj = ((Object) (gl));
	//   23   53:aload_2         
	//   24   54:astore_3        
			if((m.f(m1) & 3) != 0)
	//*  25   55:aload           5
	//*  26   57:invokestatic    #193 <Method int m.f(m)>
	//*  27   60:iconst_3        
	//*  28   61:iand            
	//*  29   62:ifeq            106
			{
				int i = 0;
	//   30   65:iconst_0        
	//   31   66:istore_1        
				obj = null;
	//   32   67:aconst_null     
	//   33   68:astore_3        
				if((m.f(m1) & 1) != 0)
	//*  34   69:aload           5
	//*  35   71:invokestatic    #193 <Method int m.f(m)>
	//*  36   74:iconst_1        
	//*  37   75:iand            
	//*  38   76:ifeq            81
					i = 1;
	//   39   79:iconst_1        
	//   40   80:istore_1        
				if((m.f(m1) & 2) != 0)
	//*  41   81:aload           5
	//*  42   83:invokestatic    #193 <Method int m.f(m)>
	//*  43   86:iconst_2        
	//*  44   87:iand            
	//*  45   88:ifeq            99
					obj = ((Object) (new m$l()));
	//   46   91:new             #195 <Class m$l>
	//   47   94:dup             
	//   48   95:invokespecial   #196 <Method void m$l()>
	//   49   98:astore_3        
				obj = ((Object) (GLDebugHelper.wrap(gl, i, ((java.io.Writer) (obj)))));
	//   50   99:aload_2         
	//   51  100:iload_1         
	//   52  101:aload_3         
	//   53  102:invokestatic    #202 <Method GL GLDebugHelper.wrap(GL, int, java.io.Writer)>
	//   54  105:astore_3        
			}
		}
		return ((GL) (obj));
	//   55  106:aload_3         
	//   56  107:areturn         
	}

	public int d()
	{
		if(!a.eglSwapBuffers(b, c))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field EGL10 a>
	//*   2    4:aload_0         
	//*   3    5:getfield        #80  <Field EGLDisplay b>
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field EGLSurface c>
	//*   6   12:invokeinterface #206 <Method boolean EGL10.eglSwapBuffers(EGLDisplay, EGLSurface)>
	//*   7   17:ifne            30
			return a.eglGetError();
	//    8   20:aload_0         
	//    9   21:getfield        #33  <Field EGL10 a>
	//   10   24:invokeinterface #39  <Method int EGL10.eglGetError()>
	//   11   29:ireturn         
		else
			return 12288;
	//   12   30:sipush          12288
	//   13   33:ireturn         
	}

	public void e()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void g()>
	//    2    4:return          
	}

	public void f()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field EGLContext e>
	//*   2    4:ifnull          48
		{
			m m1 = (m)f.get();
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field WeakReference f>
	//    5   11:invokevirtual   #93  <Method Object WeakReference.get()>
	//    6   14:checkcast       #6   <Class m>
	//    7   17:astore_1        
			if(m1 != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          43
				m.c(m1).destroyContext(a, b, e);
	//   10   22:aload_1         
	//   11   23:invokestatic    #142 <Method m$f m.c(m)>
	//   12   26:aload_0         
	//   13   27:getfield        #33  <Field EGL10 a>
	//   14   30:aload_0         
	//   15   31:getfield        #80  <Field EGLDisplay b>
	//   16   34:aload_0         
	//   17   35:getfield        #130 <Field EGLContext e>
	//   18   38:invokeinterface #210 <Method void m$f.destroyContext(EGL10, EGLDisplay, EGLContext)>
			e = null;
	//   19   43:aload_0         
	//   20   44:aconst_null     
	//   21   45:putfield        #130 <Field EGLContext e>
		}
		if(b != null)
	//*  22   48:aload_0         
	//*  23   49:getfield        #80  <Field EGLDisplay b>
	//*  24   52:ifnull          74
		{
			a.eglTerminate(b);
	//   25   55:aload_0         
	//   26   56:getfield        #33  <Field EGL10 a>
	//   27   59:aload_0         
	//   28   60:getfield        #80  <Field EGLDisplay b>
	//   29   63:invokeinterface #214 <Method boolean EGL10.eglTerminate(EGLDisplay)>
	//   30   68:pop             
			b = null;
	//   31   69:aload_0         
	//   32   70:aconst_null     
	//   33   71:putfield        #80  <Field EGLDisplay b>
		}
	//   34   74:return          
	}

	EGL10 a;
	EGLDisplay b;
	EGLSurface c;
	EGLConfig d;
	EGLContext e;
	private WeakReference f;

	public m$h(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		f = weakreference;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field WeakReference f>
	//    5    9:return          
	}
}
