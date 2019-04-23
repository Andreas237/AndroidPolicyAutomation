// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw, bnf, boc, bob

public final class zzqk extends Surface
{

	private zzqk(boc boc1, SurfaceTexture surfacetexture, boolean flag)
	{
		super(surfacetexture);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #19  <Method void Surface(SurfaceTexture)>
		d = boc1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field boc d>
		c = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #23  <Field boolean c>
	//    9   15:return          
	}

	zzqk(boc boc1, SurfaceTexture surfacetexture, boolean flag, bob bob)
	{
		this(boc1, surfacetexture, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #27  <Method void zzqk(boc, SurfaceTexture, boolean)>
	//    5    7:return          
	}

	public static zzqk a(Context context, boolean flag)
	{
		if(bnw.a >= 17)
	//*   0    0:getstatic       #33  <Field int bnw.a>
	//*   1    3:bipush          17
	//*   2    5:icmplt          45
		{
			boolean flag1;
			if(flag && !a(context))
	//*   3    8:iload_1         
	//*   4    9:ifeq            27
	//*   5   12:aload_0         
	//*   6   13:invokestatic    #36  <Method boolean a(Context)>
	//*   7   16:ifeq            22
	//*   8   19:goto            27
				flag1 = false;
	//    9   22:iconst_0        
	//   10   23:istore_2        
			else
	//*  11   24:goto            29
				flag1 = true;
	//   12   27:iconst_1        
	//   13   28:istore_2        
			bnf.b(flag1);
	//   14   29:iload_2         
	//   15   30:invokestatic    #41  <Method void bnf.b(boolean)>
			return (new boc()).a(flag);
	//   16   33:new             #43  <Class boc>
	//   17   36:dup             
	//   18   37:invokespecial   #46  <Method void boc()>
	//   19   40:iload_1         
	//   20   41:invokevirtual   #49  <Method zzqk boc.a(boolean)>
	//   21   44:areturn         
		} else
		{
			throw new UnsupportedOperationException("Unsupported prior to API level 17");
	//   22   45:new             #51  <Class UnsupportedOperationException>
	//   23   48:dup             
	//   24   49:ldc1            #53  <String "Unsupported prior to API level 17">
	//   25   51:invokespecial   #56  <Method void UnsupportedOperationException(String)>
	//   26   54:athrow          
		}
	}

	public static boolean a(Context context)
	{
		com/google/android/gms/internal/ads/zzqk;
	//    0    0:ldc1            #2   <Class zzqk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(b) goto _L2; else goto _L1
	//    2    3:getstatic       #58  <Field boolean b>
	//    3    6:ifne            105
_L1:
		if(bnw.a < 17) goto _L4; else goto _L3
	//    4    9:getstatic       #33  <Field int bnw.a>
	//    5   12:bipush          17
	//    6   14:icmplt          101
_L3:
		boolean flag2 = false;
	//    7   17:iconst_0        
	//    8   18:istore_3        
		String s = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
	//    9   19:iconst_0        
	//   10   20:invokestatic    #64  <Method android.opengl.EGLDisplay EGL14.eglGetDisplay(int)>
	//   11   23:sipush          12373
	//   12   26:invokestatic    #68  <Method String EGL14.eglQueryString(android.opengl.EGLDisplay, int)>
	//   13   29:astore          4
		boolean flag1 = flag2;
	//   14   31:iload_3         
	//   15   32:istore_2        
		if(s == null) goto _L6; else goto _L5
	//   16   33:aload           4
	//   17   35:ifnull          97
_L5:
		flag1 = flag2;
	//   18   38:iload_3         
	//   19   39:istore_2        
		if(!s.contains("EGL_EXT_protected_content")) goto _L6; else goto _L7
	//   20   40:aload           4
	//   21   42:ldc1            #70  <String "EGL_EXT_protected_content">
	//   22   44:invokevirtual   #76  <Method boolean String.contains(CharSequence)>
	//   23   47:ifeq            97
	//*  24   50:getstatic       #33  <Field int bnw.a>
	//*  25   53:bipush          24
	//*  26   55:icmpne          120
	//*  27   58:getstatic       #79  <Field String bnw.d>
	//*  28   61:ldc1            #81  <String "SM-G950">
	//*  29   63:invokevirtual   #85  <Method boolean String.startsWith(String)>
	//*  30   66:ifne            80
	//*  31   69:getstatic       #79  <Field String bnw.d>
	//*  32   72:ldc1            #87  <String "SM-G955">
	//*  33   74:invokevirtual   #85  <Method boolean String.startsWith(String)>
	//*  34   77:ifeq            120
	//*  35   80:aload_0         
	//*  36   81:invokevirtual   #93  <Method PackageManager Context.getPackageManager()>
	//*  37   84:ldc1            #95  <String "android.hardware.vr.high_performance">
	//*  38   86:invokevirtual   #100 <Method boolean PackageManager.hasSystemFeature(String)>
	//*  39   89:ifne            120
	//*  40   92:iconst_1        
	//*  41   93:istore_1        
	//*  42   94:goto            122
_L6:
		a = flag1;
	//   43   97:iload_2         
	//   44   98:putstatic       #102 <Field boolean a>
_L4:
		b = true;
	//   45  101:iconst_1        
	//   46  102:putstatic       #58  <Field boolean b>
_L2:
		flag1 = a;
	//   47  105:getstatic       #102 <Field boolean a>
	//   48  108:istore_2        
		com/google/android/gms/internal/ads/zzqk;
	//   49  109:ldc1            #2   <Class zzqk>
		JVM INSTR monitorexit ;
	//   50  111:monitorexit     
		return flag1;
	//   51  112:iload_2         
	//   52  113:ireturn         
		context;
	//   53  114:astore_0        
	//*  54  115:ldc1            #2   <Class zzqk>
		throw context;
	//   55  117:monitorexit     
	//   56  118:aload_0         
	//   57  119:athrow          
_L7:
		boolean flag;
		if(bnw.a == 24 && (bnw.d.startsWith("SM-G950") || bnw.d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))
			flag = true;
		else
			flag = false;
	//   58  120:iconst_0        
	//   59  121:istore_1        
		flag1 = flag2;
	//   60  122:iload_3         
	//   61  123:istore_2        
		if(!flag)
	//*  62  124:iload_1         
	//*  63  125:ifne            97
			flag1 = true;
	//   64  128:iconst_1        
	//   65  129:istore_2        
		if(true) goto _L6; else goto _L8
	//   66  130:goto            97
_L8:
	}

	public final void release()
	{
		super.release();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Surface.release()>
		synchronized(d)
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field boc d>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			if(!e)
	//*   7   11:aload_0         
	//*   8   12:getfield        #107 <Field boolean e>
	//*   9   15:ifne            30
			{
				d.a();
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field boc d>
	//   12   22:invokevirtual   #109 <Method void boc.a()>
				e = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #107 <Field boolean e>
			}
		}
	//   16   30:aload_1         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		exception;
	//   19   33:astore_2        
		boc1;
	//   20   34:aload_1         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw exception;
	//   22   36:aload_2         
	//   23   37:athrow          
	}

	private static boolean a;
	private static boolean b;
	private final boolean c;
	private final boc d;
	private boolean e;
}
