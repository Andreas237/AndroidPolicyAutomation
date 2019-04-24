// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

class m$b extends m$a
{

	private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int k, int l)
	{
		if(egl10.eglGetConfigAttrib(egldisplay, eglconfig, k, j))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:iload           4
	//*   4    5:aload_0         
	//*   5    6:getfield        #27  <Field int[] j>
	//*   6    9:invokeinterface #48  <Method boolean EGL10.eglGetConfigAttrib(EGLDisplay, EGLConfig, int, int[])>
	//*   7   14:ifeq            24
			return j[0];
	//    8   17:aload_0         
	//    9   18:getfield        #27  <Field int[] j>
	//   10   21:iconst_0        
	//   11   22:iaload          
	//   12   23:ireturn         
		else
			return l;
	//   13   24:iload           5
	//   14   26:ireturn         
	}

	public EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
	{
		int l = aeglconfig.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          5
		for(int k = 0; k < l; k++)
	//*   3    4:iconst_0        
	//*   4    5:istore          4
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          170
		{
			EGLConfig eglconfig = aeglconfig[k];
	//    8   14:aload_3         
	//    9   15:iload           4
	//   10   17:aaload          
	//   11   18:astore          10
			int i1 = a(egl10, egldisplay, eglconfig, 12325, 0);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:aload           10
	//   16   25:sipush          12325
	//   17   28:iconst_0        
	//   18   29:invokespecial   #51  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   19   32:istore          6
			int j1 = a(egl10, egldisplay, eglconfig, 12326, 0);
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:aload_2         
	//   23   37:aload           10
	//   24   39:sipush          12326
	//   25   42:iconst_0        
	//   26   43:invokespecial   #51  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   27   46:istore          7
			if(i1 < g || j1 < h)
				continue;
	//   28   48:iload           6
	//   29   50:aload_0         
	//   30   51:getfield        #37  <Field int g>
	//   31   54:icmplt          161
	//   32   57:iload           7
	//   33   59:aload_0         
	//   34   60:getfield        #39  <Field int h>
	//   35   63:icmplt          161
			i1 = a(egl10, egldisplay, eglconfig, 12324, 0);
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:aload_2         
	//   39   69:aload           10
	//   40   71:sipush          12324
	//   41   74:iconst_0        
	//   42   75:invokespecial   #51  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   43   78:istore          6
			j1 = a(egl10, egldisplay, eglconfig, 12323, 0);
	//   44   80:aload_0         
	//   45   81:aload_1         
	//   46   82:aload_2         
	//   47   83:aload           10
	//   48   85:sipush          12323
	//   49   88:iconst_0        
	//   50   89:invokespecial   #51  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   51   92:istore          7
			int k1 = a(egl10, egldisplay, eglconfig, 12322, 0);
	//   52   94:aload_0         
	//   53   95:aload_1         
	//   54   96:aload_2         
	//   55   97:aload           10
	//   56   99:sipush          12322
	//   57  102:iconst_0        
	//   58  103:invokespecial   #51  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   59  106:istore          8
			int l1 = a(egl10, egldisplay, eglconfig, 12321, 0);
	//   60  108:aload_0         
	//   61  109:aload_1         
	//   62  110:aload_2         
	//   63  111:aload           10
	//   64  113:sipush          12321
	//   65  116:iconst_0        
	//   66  117:invokespecial   #51  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   67  120:istore          9
			if(i1 == c && j1 == d && k1 == e && l1 == f)
	//*  68  122:iload           6
	//*  69  124:aload_0         
	//*  70  125:getfield        #29  <Field int c>
	//*  71  128:icmpne          161
	//*  72  131:iload           7
	//*  73  133:aload_0         
	//*  74  134:getfield        #31  <Field int d>
	//*  75  137:icmpne          161
	//*  76  140:iload           8
	//*  77  142:aload_0         
	//*  78  143:getfield        #33  <Field int e>
	//*  79  146:icmpne          161
	//*  80  149:iload           9
	//*  81  151:aload_0         
	//*  82  152:getfield        #35  <Field int f>
	//*  83  155:icmpne          161
				return eglconfig;
	//   84  158:aload           10
	//   85  160:areturn         
		}

	//   86  161:iload           4
	//   87  163:iconst_1        
	//   88  164:iadd            
	//   89  165:istore          4
	//*  90  167:goto            7
		return null;
	//   91  170:aconst_null     
	//   92  171:areturn         
	}

	protected int c;
	protected int d;
	protected int e;
	protected int f;
	protected int g;
	protected int h;
	final m i;
	private int j[];

	public m$b(m m1, int k, int l, int i1, int j1, int k1, int l1)
	{
		i = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field m i>
		super(m1, new int[] {
			12324, k, 12323, l, 12322, i1, 12321, j1, 12325, k1, 
			12326, l1, 12344
		});
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:bipush          13
	//    6    9:newarray        int[]
	//    7   11:dup             
	//    8   12:iconst_0        
	//    9   13:sipush          12324
	//   10   16:iastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:iload_2         
	//   14   20:iastore         
	//   15   21:dup             
	//   16   22:iconst_2        
	//   17   23:sipush          12323
	//   18   26:iastore         
	//   19   27:dup             
	//   20   28:iconst_3        
	//   21   29:iload_3         
	//   22   30:iastore         
	//   23   31:dup             
	//   24   32:iconst_4        
	//   25   33:sipush          12322
	//   26   36:iastore         
	//   27   37:dup             
	//   28   38:iconst_5        
	//   29   39:iload           4
	//   30   41:iastore         
	//   31   42:dup             
	//   32   43:bipush          6
	//   33   45:sipush          12321
	//   34   48:iastore         
	//   35   49:dup             
	//   36   50:bipush          7
	//   37   52:iload           5
	//   38   54:iastore         
	//   39   55:dup             
	//   40   56:bipush          8
	//   41   58:sipush          12325
	//   42   61:iastore         
	//   43   62:dup             
	//   44   63:bipush          9
	//   45   65:iload           6
	//   46   67:iastore         
	//   47   68:dup             
	//   48   69:bipush          10
	//   49   71:sipush          12326
	//   50   74:iastore         
	//   51   75:dup             
	//   52   76:bipush          11
	//   53   78:iload           7
	//   54   80:iastore         
	//   55   81:dup             
	//   56   82:bipush          12
	//   57   84:sipush          12344
	//   58   87:iastore         
	//   59   88:invokespecial   #25  <Method void m$a(m, int[])>
		j = new int[1];
	//   60   91:aload_0         
	//   61   92:iconst_1        
	//   62   93:newarray        int[]
	//   63   95:putfield        #27  <Field int[] j>
		c = k;
	//   64   98:aload_0         
	//   65   99:iload_2         
	//   66  100:putfield        #29  <Field int c>
		d = l;
	//   67  103:aload_0         
	//   68  104:iload_3         
	//   69  105:putfield        #31  <Field int d>
		e = i1;
	//   70  108:aload_0         
	//   71  109:iload           4
	//   72  111:putfield        #33  <Field int e>
		f = j1;
	//   73  114:aload_0         
	//   74  115:iload           5
	//   75  117:putfield        #35  <Field int f>
		g = k1;
	//   76  120:aload_0         
	//   77  121:iload           6
	//   78  123:putfield        #37  <Field int g>
		h = l1;
	//   79  126:aload_0         
	//   80  127:iload           7
	//   81  129:putfield        #39  <Field int h>
	//   82  132:return          
	}
}
