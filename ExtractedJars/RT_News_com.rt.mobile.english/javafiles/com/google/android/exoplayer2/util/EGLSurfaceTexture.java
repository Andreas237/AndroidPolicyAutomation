// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.*;
import android.os.Handler;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Util, Assertions

public final class EGLSurfaceTexture
	implements android.graphics.SurfaceTexture.OnFrameAvailableListener, Runnable
{
	public static final class GlException extends RuntimeException
	{

		private GlException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}

	}

	public static interface SecureMode
		extends Annotation
	{
	}


	public EGLSurfaceTexture(Handler handler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		handler = handler1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field Handler handler>
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:newarray        int[]
	//    8   13:putfield        #55  <Field int[] textureIdHolder>
	//    9   16:return          
	}

	private static EGLConfig chooseEGLConfig(EGLDisplay egldisplay)
	{
		EGLConfig aeglconfig[] = new EGLConfig[1];
	//    0    0:iconst_1        
	//    1    1:anewarray       EGLConfig[]
	//    2    4:astore_2        
		int ai[] = new int[1];
	//    3    5:iconst_1        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		boolean flag = EGL14.eglChooseConfig(egldisplay, EGL_CONFIG_ATTRIBUTES, 0, aeglconfig, 0, 1, ai, 0);
	//    6    9:aload_0         
	//    7   10:getstatic       #46  <Field int[] EGL_CONFIG_ATTRIBUTES>
	//    8   13:iconst_0        
	//    9   14:aload_2         
	//   10   15:iconst_0        
	//   11   16:iconst_1        
	//   12   17:aload_3         
	//   13   18:iconst_0        
	//   14   19:invokestatic    #65  <Method boolean EGL14.eglChooseConfig(EGLDisplay, int[], int, EGLConfig[], int, int, int[], int)>
	//   15   22:istore_1        
		if(flag && ai[0] > 0 && aeglconfig[0] != null)
	//*  16   23:iload_1         
	//*  17   24:ifeq            46
	//*  18   27:aload_3         
	//*  19   28:iconst_0        
	//*  20   29:iaload          
	//*  21   30:ifle            46
	//*  22   33:aload_2         
	//*  23   34:iconst_0        
	//*  24   35:aaload          
	//*  25   36:ifnonnull       42
	//*  26   39:goto            46
			return aeglconfig[0];
	//   27   42:aload_2         
	//   28   43:iconst_0        
	//   29   44:aaload          
	//   30   45:areturn         
		else
			throw new GlException(Util.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] {
				Boolean.valueOf(flag), Integer.valueOf(ai[0]), aeglconfig[0]
			}));
	//   31   46:new             #12  <Class EGLSurfaceTexture$GlException>
	//   32   49:dup             
	//   33   50:ldc1            #67  <String "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s">
	//   34   52:iconst_3        
	//   35   53:anewarray       Object[]
	//   36   56:dup             
	//   37   57:iconst_0        
	//   38   58:iload_1         
	//   39   59:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   40   62:aastore         
	//   41   63:dup             
	//   42   64:iconst_1        
	//   43   65:aload_3         
	//   44   66:iconst_0        
	//   45   67:iaload          
	//   46   68:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   47   71:aastore         
	//   48   72:dup             
	//   49   73:iconst_2        
	//   50   74:aload_2         
	//   51   75:iconst_0        
	//   52   76:aaload          
	//   53   77:aastore         
	//   54   78:invokestatic    #84  <Method String Util.formatInvariant(String, Object[])>
	//   55   81:aconst_null     
	//   56   82:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   57   85:athrow          
	}

	private static EGLContext createEGLContext(EGLDisplay egldisplay, EGLConfig eglconfig, int i)
	{
		int ai[];
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            29
		{
			ai = new int[3];
	//    2    4:iconst_3        
	//    3    5:newarray        int[]
	//    4    7:astore_3        
			int[] _tmp = ai;
	//    5    8:aload_3         
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
	//   18   25:pop             
			ai[0] = 12440;
			ai[1] = 2;
			ai[2] = 12344;
		} else
	//*  19   26:goto            61
		{
			ai = new int[5];
	//   20   29:iconst_5        
	//   21   30:newarray        int[]
	//   22   32:astore_3        
			int[] _tmp1 = ai;
	//   23   33:aload_3         
	//   24   34:dup             
	//   25   35:iconst_0        
	//   26   36:sipush          12440
	//   27   39:iastore         
	//   28   40:dup             
	//   29   41:iconst_1        
	//   30   42:iconst_2        
	//   31   43:iastore         
	//   32   44:dup             
	//   33   45:iconst_2        
	//   34   46:sipush          12992
	//   35   49:iastore         
	//   36   50:dup             
	//   37   51:iconst_3        
	//   38   52:iconst_1        
	//   39   53:iastore         
	//   40   54:dup             
	//   41   55:iconst_4        
	//   42   56:sipush          12344
	//   43   59:iastore         
	//   44   60:pop             
			ai[0] = 12440;
			ai[1] = 2;
			ai[2] = 12992;
			ai[3] = 1;
			ai[4] = 12344;
		}
		egldisplay = ((EGLDisplay) (EGL14.eglCreateContext(egldisplay, eglconfig, EGL14.EGL_NO_CONTEXT, ai, 0)));
	//   45   61:aload_0         
	//   46   62:aload_1         
	//   47   63:getstatic       #92  <Field EGLContext EGL14.EGL_NO_CONTEXT>
	//   48   66:aload_3         
	//   49   67:iconst_0        
	//   50   68:invokestatic    #96  <Method EGLContext EGL14.eglCreateContext(EGLDisplay, EGLConfig, EGLContext, int[], int)>
	//   51   71:astore_0        
		if(egldisplay == null)
	//*  52   72:aload_0         
	//*  53   73:ifnonnull       87
			throw new GlException("eglCreateContext failed");
	//   54   76:new             #12  <Class EGLSurfaceTexture$GlException>
	//   55   79:dup             
	//   56   80:ldc1            #98  <String "eglCreateContext failed">
	//   57   82:aconst_null     
	//   58   83:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   59   86:athrow          
		else
			return ((EGLContext) (egldisplay));
	//   60   87:aload_0         
	//   61   88:areturn         
	}

	private static EGLSurface createEGLSurface(EGLDisplay egldisplay, EGLConfig eglconfig, EGLContext eglcontext, int i)
	{
		if(i == 1)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          12
		{
			eglconfig = ((EGLConfig) (EGL14.EGL_NO_SURFACE));
	//    3    5:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//    4    8:astore_1        
		} else
	//*   5    9:goto            129
		{
			int ai[];
			if(i == 2)
	//*   6   12:iload_3         
	//*   7   13:iconst_2        
	//*   8   14:icmpne          66
			{
				ai = new int[7];
	//    9   17:bipush          7
	//   10   19:newarray        int[]
	//   11   21:astore          4
				int[] _tmp = ai;
	//   12   23:aload           4
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:sipush          12375
	//   16   30:iastore         
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:iconst_1        
	//   20   34:iastore         
	//   21   35:dup             
	//   22   36:iconst_2        
	//   23   37:sipush          12374
	//   24   40:iastore         
	//   25   41:dup             
	//   26   42:iconst_3        
	//   27   43:iconst_1        
	//   28   44:iastore         
	//   29   45:dup             
	//   30   46:iconst_4        
	//   31   47:sipush          12992
	//   32   50:iastore         
	//   33   51:dup             
	//   34   52:iconst_5        
	//   35   53:iconst_1        
	//   36   54:iastore         
	//   37   55:dup             
	//   38   56:bipush          6
	//   39   58:sipush          12344
	//   40   61:iastore         
	//   41   62:pop             
				ai[0] = 12375;
				ai[1] = 1;
				ai[2] = 12374;
				ai[3] = 1;
				ai[4] = 12992;
				ai[5] = 1;
				ai[6] = 12344;
			} else
	//*  42   63:goto            100
			{
				ai = new int[5];
	//   43   66:iconst_5        
	//   44   67:newarray        int[]
	//   45   69:astore          4
				int[] _tmp1 = ai;
	//   46   71:aload           4
	//   47   73:dup             
	//   48   74:iconst_0        
	//   49   75:sipush          12375
	//   50   78:iastore         
	//   51   79:dup             
	//   52   80:iconst_1        
	//   53   81:iconst_1        
	//   54   82:iastore         
	//   55   83:dup             
	//   56   84:iconst_2        
	//   57   85:sipush          12374
	//   58   88:iastore         
	//   59   89:dup             
	//   60   90:iconst_3        
	//   61   91:iconst_1        
	//   62   92:iastore         
	//   63   93:dup             
	//   64   94:iconst_4        
	//   65   95:sipush          12344
	//   66   98:iastore         
	//   67   99:pop             
				ai[0] = 12375;
				ai[1] = 1;
				ai[2] = 12374;
				ai[3] = 1;
				ai[4] = 12344;
			}
			EGLSurface eglsurface = EGL14.eglCreatePbufferSurface(egldisplay, eglconfig, ai, 0);
	//   68  100:aload_0         
	//   69  101:aload_1         
	//   70  102:aload           4
	//   71  104:iconst_0        
	//   72  105:invokestatic    #107 <Method EGLSurface EGL14.eglCreatePbufferSurface(EGLDisplay, EGLConfig, int[], int)>
	//   73  108:astore          4
			eglconfig = ((EGLConfig) (eglsurface));
	//   74  110:aload           4
	//   75  112:astore_1        
			if(eglsurface == null)
	//*  76  113:aload           4
	//*  77  115:ifnonnull       129
				throw new GlException("eglCreatePbufferSurface failed");
	//   78  118:new             #12  <Class EGLSurfaceTexture$GlException>
	//   79  121:dup             
	//   80  122:ldc1            #109 <String "eglCreatePbufferSurface failed">
	//   81  124:aconst_null     
	//   82  125:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   83  128:athrow          
		}
		if(!EGL14.eglMakeCurrent(egldisplay, ((EGLSurface) (eglconfig)), ((EGLSurface) (eglconfig)), eglcontext))
	//*  84  129:aload_0         
	//*  85  130:aload_1         
	//*  86  131:aload_1         
	//*  87  132:aload_2         
	//*  88  133:invokestatic    #113 <Method boolean EGL14.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//*  89  136:ifne            150
			throw new GlException("eglMakeCurrent failed");
	//   90  139:new             #12  <Class EGLSurfaceTexture$GlException>
	//   91  142:dup             
	//   92  143:ldc1            #115 <String "eglMakeCurrent failed">
	//   93  145:aconst_null     
	//   94  146:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   95  149:athrow          
		else
			return ((EGLSurface) (eglconfig));
	//   96  150:aload_1         
	//   97  151:areturn         
	}

	private static void generateTextureIds(int ai[])
	{
		GLES20.glGenTextures(1, ai, 0);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #123 <Method void GLES20.glGenTextures(int, int[], int)>
		int i = GLES20.glGetError();
	//    4    6:invokestatic    #127 <Method int GLES20.glGetError()>
	//    5    9:istore_1        
		if(i != 0)
	//*   6   10:iload_1         
	//*   7   11:ifeq            51
		{
			ai = ((int []) (new StringBuilder()));
	//    8   14:new             #129 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #130 <Method void StringBuilder()>
	//   11   21:astore_0        
			((StringBuilder) (ai)).append("glGenTextures failed. Error: ");
	//   12   22:aload_0         
	//   13   23:ldc1            #132 <String "glGenTextures failed. Error: ">
	//   14   25:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			((StringBuilder) (ai)).append(Integer.toHexString(i));
	//   16   29:aload_0         
	//   17   30:iload_1         
	//   18   31:invokestatic    #140 <Method String Integer.toHexString(int)>
	//   19   34:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			throw new GlException(((StringBuilder) (ai)).toString());
	//   21   38:new             #12  <Class EGLSurfaceTexture$GlException>
	//   22   41:dup             
	//   23   42:aload_0         
	//   24   43:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   25   46:aconst_null     
	//   26   47:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   27   50:athrow          
		} else
		{
			return;
	//   28   51:return          
		}
	}

	private static EGLDisplay getDefaultDisplay()
	{
		EGLDisplay egldisplay = EGL14.eglGetDisplay(0);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #150 <Method EGLDisplay EGL14.eglGetDisplay(int)>
	//    2    4:astore_0        
		if(egldisplay == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       20
			throw new GlException("eglGetDisplay failed");
	//    5    9:new             #12  <Class EGLSurfaceTexture$GlException>
	//    6   12:dup             
	//    7   13:ldc1            #152 <String "eglGetDisplay failed">
	//    8   15:aconst_null     
	//    9   16:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   10   19:athrow          
		int ai[] = new int[2];
	//   11   20:iconst_2        
	//   12   21:newarray        int[]
	//   13   23:astore_1        
		if(!EGL14.eglInitialize(egldisplay, ai, 0, ai, 1))
	//*  14   24:aload_0         
	//*  15   25:aload_1         
	//*  16   26:iconst_0        
	//*  17   27:aload_1         
	//*  18   28:iconst_1        
	//*  19   29:invokestatic    #156 <Method boolean EGL14.eglInitialize(EGLDisplay, int[], int, int[], int)>
	//*  20   32:ifne            46
			throw new GlException("eglInitialize failed");
	//   21   35:new             #12  <Class EGLSurfaceTexture$GlException>
	//   22   38:dup             
	//   23   39:ldc1            #158 <String "eglInitialize failed">
	//   24   41:aconst_null     
	//   25   42:invokespecial   #87  <Method void EGLSurfaceTexture$GlException(String, EGLSurfaceTexture$1)>
	//   26   45:athrow          
		else
			return egldisplay;
	//   27   46:aload_0         
	//   28   47:areturn         
	}

	public SurfaceTexture getSurfaceTexture()
	{
		return (SurfaceTexture)Assertions.checkNotNull(((Object) (texture)));
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field SurfaceTexture texture>
	//    2    4:invokestatic    #168 <Method Object Assertions.checkNotNull(Object)>
	//    3    7:checkcast       #170 <Class SurfaceTexture>
	//    4   10:areturn         
	}

	public void init(int i)
	{
		display = getDefaultDisplay();
	//    0    0:aload_0         
	//    1    1:invokestatic    #174 <Method EGLDisplay getDefaultDisplay()>
	//    2    4:putfield        #176 <Field EGLDisplay display>
		EGLConfig eglconfig = chooseEGLConfig(display);
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field EGLDisplay display>
	//    5   11:invokestatic    #178 <Method EGLConfig chooseEGLConfig(EGLDisplay)>
	//    6   14:astore_2        
		context = createEGLContext(display, eglconfig, i);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #176 <Field EGLDisplay display>
	//   10   20:aload_2         
	//   11   21:iload_1         
	//   12   22:invokestatic    #180 <Method EGLContext createEGLContext(EGLDisplay, EGLConfig, int)>
	//   13   25:putfield        #182 <Field EGLContext context>
		surface = createEGLSurface(display, eglconfig, context, i);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #176 <Field EGLDisplay display>
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:getfield        #182 <Field EGLContext context>
	//   20   38:iload_1         
	//   21   39:invokestatic    #184 <Method EGLSurface createEGLSurface(EGLDisplay, EGLConfig, EGLContext, int)>
	//   22   42:putfield        #186 <Field EGLSurface surface>
		generateTextureIds(textureIdHolder);
	//   23   45:aload_0         
	//   24   46:getfield        #55  <Field int[] textureIdHolder>
	//   25   49:invokestatic    #188 <Method void generateTextureIds(int[])>
		texture = new SurfaceTexture(textureIdHolder[0]);
	//   26   52:aload_0         
	//   27   53:new             #170 <Class SurfaceTexture>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:getfield        #55  <Field int[] textureIdHolder>
	//   31   61:iconst_0        
	//   32   62:iaload          
	//   33   63:invokespecial   #190 <Method void SurfaceTexture(int)>
	//   34   66:putfield        #162 <Field SurfaceTexture texture>
		texture.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (this)));
	//   35   69:aload_0         
	//   36   70:getfield        #162 <Field SurfaceTexture texture>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #194 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
	//   39   77:return          
	}

	public void onFrameAvailable(SurfaceTexture surfacetexture)
	{
		handler.post(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #202 <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void release()
	{
		handler.removeCallbacks(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #207 <Method void Handler.removeCallbacks(Runnable)>
		if(texture != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #162 <Field SurfaceTexture texture>
	//*   6   12:ifnull          31
		{
			texture.release();
	//    7   15:aload_0         
	//    8   16:getfield        #162 <Field SurfaceTexture texture>
	//    9   19:invokevirtual   #209 <Method void SurfaceTexture.release()>
			GLES20.glDeleteTextures(1, textureIdHolder, 0);
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #55  <Field int[] textureIdHolder>
	//   13   27:iconst_0        
	//   14   28:invokestatic    #212 <Method void GLES20.glDeleteTextures(int, int[], int)>
		}
		if(display != null && !display.equals(((Object) (EGL14.EGL_NO_DISPLAY))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #176 <Field EGLDisplay display>
	//*  17   35:ifnull          68
	//*  18   38:aload_0         
	//*  19   39:getfield        #176 <Field EGLDisplay display>
	//*  20   42:getstatic       #215 <Field EGLDisplay EGL14.EGL_NO_DISPLAY>
	//*  21   45:invokevirtual   #221 <Method boolean EGLDisplay.equals(Object)>
	//*  22   48:ifne            68
			EGL14.eglMakeCurrent(display, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
	//   23   51:aload_0         
	//   24   52:getfield        #176 <Field EGLDisplay display>
	//   25   55:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//   26   58:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//   27   61:getstatic       #92  <Field EGLContext EGL14.EGL_NO_CONTEXT>
	//   28   64:invokestatic    #113 <Method boolean EGL14.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//   29   67:pop             
		if(surface != null && !surface.equals(((Object) (EGL14.EGL_NO_SURFACE))))
	//*  30   68:aload_0         
	//*  31   69:getfield        #186 <Field EGLSurface surface>
	//*  32   72:ifnull          100
	//*  33   75:aload_0         
	//*  34   76:getfield        #186 <Field EGLSurface surface>
	//*  35   79:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//*  36   82:invokevirtual   #224 <Method boolean EGLSurface.equals(Object)>
	//*  37   85:ifne            100
			EGL14.eglDestroySurface(display, surface);
	//   38   88:aload_0         
	//   39   89:getfield        #176 <Field EGLDisplay display>
	//   40   92:aload_0         
	//   41   93:getfield        #186 <Field EGLSurface surface>
	//   42   96:invokestatic    #228 <Method boolean EGL14.eglDestroySurface(EGLDisplay, EGLSurface)>
	//   43   99:pop             
		if(context != null)
	//*  44  100:aload_0         
	//*  45  101:getfield        #182 <Field EGLContext context>
	//*  46  104:ifnull          119
			EGL14.eglDestroyContext(display, context);
	//   47  107:aload_0         
	//   48  108:getfield        #176 <Field EGLDisplay display>
	//   49  111:aload_0         
	//   50  112:getfield        #182 <Field EGLContext context>
	//   51  115:invokestatic    #232 <Method boolean EGL14.eglDestroyContext(EGLDisplay, EGLContext)>
	//   52  118:pop             
		if(Util.SDK_INT >= 19)
	//*  53  119:getstatic       #235 <Field int Util.SDK_INT>
	//*  54  122:bipush          19
	//*  55  124:icmplt          131
			EGL14.eglReleaseThread();
	//   56  127:invokestatic    #239 <Method boolean EGL14.eglReleaseThread()>
	//   57  130:pop             
		display = null;
	//   58  131:aload_0         
	//   59  132:aconst_null     
	//   60  133:putfield        #176 <Field EGLDisplay display>
		context = null;
	//   61  136:aload_0         
	//   62  137:aconst_null     
	//   63  138:putfield        #182 <Field EGLContext context>
		surface = null;
	//   64  141:aload_0         
	//   65  142:aconst_null     
	//   66  143:putfield        #186 <Field EGLSurface surface>
		texture = null;
	//   67  146:aload_0         
	//   68  147:aconst_null     
	//   69  148:putfield        #162 <Field SurfaceTexture texture>
		return;
	//   70  151:return          
		Exception exception;
		exception;
	//   71  152:astore_1        
		if(display != null && !display.equals(((Object) (EGL14.EGL_NO_DISPLAY))))
	//*  72  153:aload_0         
	//*  73  154:getfield        #176 <Field EGLDisplay display>
	//*  74  157:ifnull          190
	//*  75  160:aload_0         
	//*  76  161:getfield        #176 <Field EGLDisplay display>
	//*  77  164:getstatic       #215 <Field EGLDisplay EGL14.EGL_NO_DISPLAY>
	//*  78  167:invokevirtual   #221 <Method boolean EGLDisplay.equals(Object)>
	//*  79  170:ifne            190
			EGL14.eglMakeCurrent(display, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
	//   80  173:aload_0         
	//   81  174:getfield        #176 <Field EGLDisplay display>
	//   82  177:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//   83  180:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//   84  183:getstatic       #92  <Field EGLContext EGL14.EGL_NO_CONTEXT>
	//   85  186:invokestatic    #113 <Method boolean EGL14.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//   86  189:pop             
		if(surface != null && !surface.equals(((Object) (EGL14.EGL_NO_SURFACE))))
	//*  87  190:aload_0         
	//*  88  191:getfield        #186 <Field EGLSurface surface>
	//*  89  194:ifnull          222
	//*  90  197:aload_0         
	//*  91  198:getfield        #186 <Field EGLSurface surface>
	//*  92  201:getstatic       #103 <Field EGLSurface EGL14.EGL_NO_SURFACE>
	//*  93  204:invokevirtual   #224 <Method boolean EGLSurface.equals(Object)>
	//*  94  207:ifne            222
			EGL14.eglDestroySurface(display, surface);
	//   95  210:aload_0         
	//   96  211:getfield        #176 <Field EGLDisplay display>
	//   97  214:aload_0         
	//   98  215:getfield        #186 <Field EGLSurface surface>
	//   99  218:invokestatic    #228 <Method boolean EGL14.eglDestroySurface(EGLDisplay, EGLSurface)>
	//  100  221:pop             
		if(context != null)
	//* 101  222:aload_0         
	//* 102  223:getfield        #182 <Field EGLContext context>
	//* 103  226:ifnull          241
			EGL14.eglDestroyContext(display, context);
	//  104  229:aload_0         
	//  105  230:getfield        #176 <Field EGLDisplay display>
	//  106  233:aload_0         
	//  107  234:getfield        #182 <Field EGLContext context>
	//  108  237:invokestatic    #232 <Method boolean EGL14.eglDestroyContext(EGLDisplay, EGLContext)>
	//  109  240:pop             
		if(Util.SDK_INT >= 19)
	//* 110  241:getstatic       #235 <Field int Util.SDK_INT>
	//* 111  244:bipush          19
	//* 112  246:icmplt          253
			EGL14.eglReleaseThread();
	//  113  249:invokestatic    #239 <Method boolean EGL14.eglReleaseThread()>
	//  114  252:pop             
		display = null;
	//  115  253:aload_0         
	//  116  254:aconst_null     
	//  117  255:putfield        #176 <Field EGLDisplay display>
		context = null;
	//  118  258:aload_0         
	//  119  259:aconst_null     
	//  120  260:putfield        #182 <Field EGLContext context>
		surface = null;
	//  121  263:aload_0         
	//  122  264:aconst_null     
	//  123  265:putfield        #186 <Field EGLSurface surface>
		texture = null;
	//  124  268:aload_0         
	//  125  269:aconst_null     
	//  126  270:putfield        #162 <Field SurfaceTexture texture>
		throw exception;
	//  127  273:aload_1         
	//  128  274:athrow          
	}

	public void run()
	{
		if(texture != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field SurfaceTexture texture>
	//*   2    4:ifnull          14
			texture.updateTexImage();
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field SurfaceTexture texture>
	//    5   11:invokevirtual   #243 <Method void SurfaceTexture.updateTexImage()>
	//    6   14:return          
	}

	private static final int EGL_CONFIG_ATTRIBUTES[] = {
		12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
		12325, 0, 12327, 12344, 12339, 4, 12344
	};
	private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
	public static final int SECURE_MODE_NONE = 0;
	public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
	public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;
	private EGLContext context;
	private EGLDisplay display;
	private final Handler handler;
	private EGLSurface surface;
	private SurfaceTexture texture;
	private final int textureIdHolder[] = new int[1];

	static 
	{
	//    0    0:bipush          17
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:sipush          12352
	//    5    9:iastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:iconst_4        
	//    9   13:iastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:sipush          12324
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:bipush          8
	//   17   24:iastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:sipush          12323
	//   21   30:iastore         
	//   22   31:dup             
	//   23   32:iconst_5        
	//   24   33:bipush          8
	//   25   35:iastore         
	//   26   36:dup             
	//   27   37:bipush          6
	//   28   39:sipush          12322
	//   29   42:iastore         
	//   30   43:dup             
	//   31   44:bipush          7
	//   32   46:bipush          8
	//   33   48:iastore         
	//   34   49:dup             
	//   35   50:bipush          8
	//   36   52:sipush          12321
	//   37   55:iastore         
	//   38   56:dup             
	//   39   57:bipush          9
	//   40   59:bipush          8
	//   41   61:iastore         
	//   42   62:dup             
	//   43   63:bipush          10
	//   44   65:sipush          12325
	//   45   68:iastore         
	//   46   69:dup             
	//   47   70:bipush          11
	//   48   72:iconst_0        
	//   49   73:iastore         
	//   50   74:dup             
	//   51   75:bipush          12
	//   52   77:sipush          12327
	//   53   80:iastore         
	//   54   81:dup             
	//   55   82:bipush          13
	//   56   84:sipush          12344
	//   57   87:iastore         
	//   58   88:dup             
	//   59   89:bipush          14
	//   60   91:sipush          12339
	//   61   94:iastore         
	//   62   95:dup             
	//   63   96:bipush          15
	//   64   98:iconst_4        
	//   65   99:iastore         
	//   66  100:dup             
	//   67  101:bipush          16
	//   68  103:sipush          12344
	//   69  106:iastore         
	//   70  107:putstatic       #46  <Field int[] EGL_CONFIG_ATTRIBUTES>
	//*  71  110:return          
	}
}
