// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

abstract class m$a
	implements m$e
{

	private int[] a(int ai[])
	{
		if(m.a(b) != 2 && m.a(b) != 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field m b>
	//*   2    4:invokestatic    #28  <Method int m.a(m)>
	//*   3    7:iconst_2        
	//*   4    8:icmpeq          24
	//*   5   11:aload_0         
	//*   6   12:getfield        #16  <Field m b>
	//*   7   15:invokestatic    #28  <Method int m.a(m)>
	//*   8   18:iconst_3        
	//*   9   19:icmpeq          24
			return ai;
	//   10   22:aload_1         
	//   11   23:areturn         
		int i = ai.length;
	//   12   24:aload_1         
	//   13   25:arraylength     
	//   14   26:istore_2        
		int ai1[] = new int[i + 2];
	//   15   27:iload_2         
	//   16   28:iconst_2        
	//   17   29:iadd            
	//   18   30:newarray        int[]
	//   19   32:astore_3        
		System.arraycopy(((Object) (ai)), 0, ((Object) (ai1)), 0, i - 1);
	//   20   33:aload_1         
	//   21   34:iconst_0        
	//   22   35:aload_3         
	//   23   36:iconst_0        
	//   24   37:iload_2         
	//   25   38:iconst_1        
	//   26   39:isub            
	//   27   40:invokestatic    #34  <Method void System.arraycopy(Object, int, Object, int, int)>
		ai1[i - 1] = 12352;
	//   28   43:aload_3         
	//   29   44:iload_2         
	//   30   45:iconst_1        
	//   31   46:isub            
	//   32   47:sipush          12352
	//   33   50:iastore         
		if(m.a(b) == 2)
	//*  34   51:aload_0         
	//*  35   52:getfield        #16  <Field m b>
	//*  36   55:invokestatic    #28  <Method int m.a(m)>
	//*  37   58:iconst_2        
	//*  38   59:icmpne          69
			ai1[i] = 4;
	//   39   62:aload_3         
	//   40   63:iload_2         
	//   41   64:iconst_4        
	//   42   65:iastore         
		else
	//*  43   66:goto            74
			ai1[i] = 64;
	//   44   69:aload_3         
	//   45   70:iload_2         
	//   46   71:bipush          64
	//   47   73:iastore         
		ai1[i + 1] = 12344;
	//   48   74:aload_3         
	//   49   75:iload_2         
	//   50   76:iconst_1        
	//   51   77:iadd            
	//   52   78:sipush          12344
	//   53   81:iastore         
		return ai1;
	//   54   82:aload_3         
	//   55   83:areturn         
	}

	abstract EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[]);

	public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
	{
		int ai[] = new int[1];
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:astore          4
		if(!egl10.eglChooseConfig(egldisplay, a, ((EGLConfig []) (null)), 0, ai))
	//*   3    5:aload_1         
	//*   4    6:aload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field int[] a>
	//*   7   11:aconst_null     
	//*   8   12:iconst_0        
	//*   9   13:aload           4
	//*  10   15:invokeinterface #43  <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//*  11   20:ifne            33
			throw new IllegalArgumentException("eglChooseConfig failed");
	//   12   23:new             #45  <Class IllegalArgumentException>
	//   13   26:dup             
	//   14   27:ldc1            #47  <String "eglChooseConfig failed">
	//   15   29:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   16   32:athrow          
		int i = ai[0];
	//   17   33:aload           4
	//   18   35:iconst_0        
	//   19   36:iaload          
	//   20   37:istore_3        
		if(i <= 0)
	//*  21   38:iload_3         
	//*  22   39:ifgt            52
			throw new IllegalArgumentException("No configs match configSpec");
	//   23   42:new             #45  <Class IllegalArgumentException>
	//   24   45:dup             
	//   25   46:ldc1            #52  <String "No configs match configSpec">
	//   26   48:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   27   51:athrow          
		EGLConfig aeglconfig[] = new EGLConfig[i];
	//   28   52:iload_3         
	//   29   53:anewarray       EGLConfig[]
	//   30   56:astore          5
		if(!egl10.eglChooseConfig(egldisplay, a, aeglconfig, i, ai))
	//*  31   58:aload_1         
	//*  32   59:aload_2         
	//*  33   60:aload_0         
	//*  34   61:getfield        #24  <Field int[] a>
	//*  35   64:aload           5
	//*  36   66:iload_3         
	//*  37   67:aload           4
	//*  38   69:invokeinterface #43  <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//*  39   74:ifne            87
			throw new IllegalArgumentException("eglChooseConfig#2 failed");
	//   40   77:new             #45  <Class IllegalArgumentException>
	//   41   80:dup             
	//   42   81:ldc1            #56  <String "eglChooseConfig#2 failed">
	//   43   83:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   44   86:athrow          
		egl10 = ((EGL10) (a(egl10, egldisplay, aeglconfig)));
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:aload_2         
	//   48   90:aload           5
	//   49   92:invokevirtual   #58  <Method EGLConfig a(EGL10, EGLDisplay, EGLConfig[])>
	//   50   95:astore_1        
		if(egl10 == null)
	//*  51   96:aload_1         
	//*  52   97:ifnonnull       110
			throw new IllegalArgumentException("No config chosen");
	//   53  100:new             #45  <Class IllegalArgumentException>
	//   54  103:dup             
	//   55  104:ldc1            #60  <String "No config chosen">
	//   56  106:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   57  109:athrow          
		else
			return ((EGLConfig) (egl10));
	//   58  110:aload_1         
	//   59  111:areturn         
	}

	protected int a[];
	final m b;

	public m$a(m m1, int ai[])
	{
		b = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field m b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		a = a(ai);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method int[] a(int[])>
	//    9   15:putfield        #24  <Field int[] a>
	//   10   18:return          
	}
}
