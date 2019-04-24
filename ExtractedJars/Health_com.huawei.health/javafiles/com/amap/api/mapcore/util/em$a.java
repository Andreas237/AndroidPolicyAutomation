// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			ek, em

public static class em$a extends ek
{

	private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i, int j)
	{
		if(egl10.eglGetConfigAttrib(egldisplay, eglconfig, i, h))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:iload           4
	//*   4    5:aload_0         
	//*   5    6:getfield        #27  <Field int[] h>
	//*   6    9:invokeinterface #46  <Method boolean EGL10.eglGetConfigAttrib(EGLDisplay, EGLConfig, int, int[])>
	//*   7   14:ifeq            24
			return h[0];
	//    8   17:aload_0         
	//    9   18:getfield        #27  <Field int[] h>
	//   10   21:iconst_0        
	//   11   22:iaload          
	//   12   23:ireturn         
		else
			return j;
	//   13   24:iload           5
	//   14   26:ireturn         
	}

	private em$c a(EGL10 egl10, EGLDisplay egldisplay)
	{
		em$c em$c1 = new em$c(((em$1) (null)));
	//    0    0:new             #49  <Class em$c>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #52  <Method void em$c(em$1)>
	//    4    8:astore_3        
		em$c1.a = a(2, true);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:iconst_1        
	//    9   13:invokespecial   #55  <Method int[] a(int, boolean)>
	//   10   16:putfield        #57  <Field int[] em$c.a>
		egl10.eglChooseConfig(egldisplay, em$c1.a, ((EGLConfig []) (null)), 0, em$c1.b);
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:getfield        #57  <Field int[] em$c.a>
	//   15   25:aconst_null     
	//   16   26:iconst_0        
	//   17   27:aload_3         
	//   18   28:getfield        #59  <Field int[] em$c.b>
	//   19   31:invokeinterface #63  <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//   20   36:pop             
		if(em$c1.b[0] <= 0)
	//*  21   37:aload_3         
	//*  22   38:getfield        #59  <Field int[] em$c.b>
	//*  23   41:iconst_0        
	//*  24   42:iaload          
	//*  25   43:ifgt            85
		{
			em$c1.a = a(2, false);
	//   26   46:aload_3         
	//   27   47:aload_0         
	//   28   48:iconst_2        
	//   29   49:iconst_0        
	//   30   50:invokespecial   #55  <Method int[] a(int, boolean)>
	//   31   53:putfield        #57  <Field int[] em$c.a>
			egl10.eglChooseConfig(egldisplay, em$c1.a, ((EGLConfig []) (null)), 0, em$c1.b);
	//   32   56:aload_1         
	//   33   57:aload_2         
	//   34   58:aload_3         
	//   35   59:getfield        #57  <Field int[] em$c.a>
	//   36   62:aconst_null     
	//   37   63:iconst_0        
	//   38   64:aload_3         
	//   39   65:getfield        #59  <Field int[] em$c.b>
	//   40   68:invokeinterface #63  <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//   41   73:pop             
			if(em$c1.b[0] <= 0)
	//*  42   74:aload_3         
	//*  43   75:getfield        #59  <Field int[] em$c.b>
	//*  44   78:iconst_0        
	//*  45   79:iaload          
	//*  46   80:ifgt            85
				return null;
	//   47   83:aconst_null     
	//   48   84:areturn         
		}
		return em$c1;
	//   49   85:aload_3         
	//   50   86:areturn         
	}

	private int[] a(int i, boolean flag)
	{
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          160
		{
			int j = a;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field int a>
	//    5    9:istore_3        
			int k = b;
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field int b>
	//    8   14:istore          4
			int l = c;
	//    9   16:aload_0         
	//   10   17:getfield        #33  <Field int c>
	//   11   20:istore          5
			int i1 = d;
	//   12   22:aload_0         
	//   13   23:getfield        #35  <Field int d>
	//   14   26:istore          6
			int j1 = e;
	//   15   28:aload_0         
	//   16   29:getfield        #37  <Field int e>
	//   17   32:istore          7
			int k1 = f;
	//   18   34:aload_0         
	//   19   35:getfield        #39  <Field int f>
	//   20   38:istore          8
			if(flag)
	//*  21   40:iload_2         
	//*  22   41:ifeq            49
				i = 1;
	//   23   44:iconst_1        
	//   24   45:istore_1        
			else
	//*  25   46:goto            51
				i = 0;
	//   26   49:iconst_0        
	//   27   50:istore_1        
			return (new int[] {
				12324, j, 12323, k, 12322, l, 12321, i1, 12325, j1, 
				12326, k1, 12338, i, 12352, g, 12344
			});
	//   28   51:bipush          17
	//   29   53:newarray        int[]
	//   30   55:dup             
	//   31   56:iconst_0        
	//   32   57:sipush          12324
	//   33   60:iastore         
	//   34   61:dup             
	//   35   62:iconst_1        
	//   36   63:iload_3         
	//   37   64:iastore         
	//   38   65:dup             
	//   39   66:iconst_2        
	//   40   67:sipush          12323
	//   41   70:iastore         
	//   42   71:dup             
	//   43   72:iconst_3        
	//   44   73:iload           4
	//   45   75:iastore         
	//   46   76:dup             
	//   47   77:iconst_4        
	//   48   78:sipush          12322
	//   49   81:iastore         
	//   50   82:dup             
	//   51   83:iconst_5        
	//   52   84:iload           5
	//   53   86:iastore         
	//   54   87:dup             
	//   55   88:bipush          6
	//   56   90:sipush          12321
	//   57   93:iastore         
	//   58   94:dup             
	//   59   95:bipush          7
	//   60   97:iload           6
	//   61   99:iastore         
	//   62  100:dup             
	//   63  101:bipush          8
	//   64  103:sipush          12325
	//   65  106:iastore         
	//   66  107:dup             
	//   67  108:bipush          9
	//   68  110:iload           7
	//   69  112:iastore         
	//   70  113:dup             
	//   71  114:bipush          10
	//   72  116:sipush          12326
	//   73  119:iastore         
	//   74  120:dup             
	//   75  121:bipush          11
	//   76  123:iload           8
	//   77  125:iastore         
	//   78  126:dup             
	//   79  127:bipush          12
	//   80  129:sipush          12338
	//   81  132:iastore         
	//   82  133:dup             
	//   83  134:bipush          13
	//   84  136:iload_1         
	//   85  137:iastore         
	//   86  138:dup             
	//   87  139:bipush          14
	//   88  141:sipush          12352
	//   89  144:iastore         
	//   90  145:dup             
	//   91  146:bipush          15
	//   92  148:getstatic       #20  <Field int g>
	//   93  151:iastore         
	//   94  152:dup             
	//   95  153:bipush          16
	//   96  155:sipush          12344
	//   97  158:iastore         
	//   98  159:areturn         
		}
		if(flag)
	//*  99  160:iload_2         
	//* 100  161:ifeq            227
			return (new int[] {
				12324, a, 12323, b, 12322, c, 12338, 1, 12344
			});
	//  101  164:bipush          9
	//  102  166:newarray        int[]
	//  103  168:dup             
	//  104  169:iconst_0        
	//  105  170:sipush          12324
	//  106  173:iastore         
	//  107  174:dup             
	//  108  175:iconst_1        
	//  109  176:aload_0         
	//  110  177:getfield        #29  <Field int a>
	//  111  180:iastore         
	//  112  181:dup             
	//  113  182:iconst_2        
	//  114  183:sipush          12323
	//  115  186:iastore         
	//  116  187:dup             
	//  117  188:iconst_3        
	//  118  189:aload_0         
	//  119  190:getfield        #31  <Field int b>
	//  120  193:iastore         
	//  121  194:dup             
	//  122  195:iconst_4        
	//  123  196:sipush          12322
	//  124  199:iastore         
	//  125  200:dup             
	//  126  201:iconst_5        
	//  127  202:aload_0         
	//  128  203:getfield        #33  <Field int c>
	//  129  206:iastore         
	//  130  207:dup             
	//  131  208:bipush          6
	//  132  210:sipush          12338
	//  133  213:iastore         
	//  134  214:dup             
	//  135  215:bipush          7
	//  136  217:iconst_1        
	//  137  218:iastore         
	//  138  219:dup             
	//  139  220:bipush          8
	//  140  222:sipush          12344
	//  141  225:iastore         
	//  142  226:areturn         
		else
			return (new int[] {
				12324, a, 12323, b, 12322, c, 12344
			});
	//  143  227:bipush          7
	//  144  229:newarray        int[]
	//  145  231:dup             
	//  146  232:iconst_0        
	//  147  233:sipush          12324
	//  148  236:iastore         
	//  149  237:dup             
	//  150  238:iconst_1        
	//  151  239:aload_0         
	//  152  240:getfield        #29  <Field int a>
	//  153  243:iastore         
	//  154  244:dup             
	//  155  245:iconst_2        
	//  156  246:sipush          12323
	//  157  249:iastore         
	//  158  250:dup             
	//  159  251:iconst_3        
	//  160  252:aload_0         
	//  161  253:getfield        #31  <Field int b>
	//  162  256:iastore         
	//  163  257:dup             
	//  164  258:iconst_4        
	//  165  259:sipush          12322
	//  166  262:iastore         
	//  167  263:dup             
	//  168  264:iconst_5        
	//  169  265:aload_0         
	//  170  266:getfield        #33  <Field int c>
	//  171  269:iastore         
	//  172  270:dup             
	//  173  271:bipush          6
	//  174  273:sipush          12344
	//  175  276:iastore         
	//  176  277:areturn         
	}

	public EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
	{
		int j = aeglconfig.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          5
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore          4
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          173
		{
			EGLConfig eglconfig = aeglconfig[i];
	//    8   14:aload_3         
	//    9   15:iload           4
	//   10   17:aaload          
	//   11   18:astore          10
			int k = a(egl10, egldisplay, eglconfig, 12325, 0);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:aload           10
	//   16   25:sipush          12325
	//   17   28:iconst_0        
	//   18   29:invokespecial   #66  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   19   32:istore          6
			int l = a(egl10, egldisplay, eglconfig, 12326, 0);
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:aload_2         
	//   23   37:aload           10
	//   24   39:sipush          12326
	//   25   42:iconst_0        
	//   26   43:invokespecial   #66  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   27   46:istore          7
			if(k < e || l < f)
	//*  28   48:iload           6
	//*  29   50:aload_0         
	//*  30   51:getfield        #37  <Field int e>
	//*  31   54:icmplt          164
	//*  32   57:iload           7
	//*  33   59:aload_0         
	//*  34   60:getfield        #39  <Field int f>
	//*  35   63:icmpge          69
				continue;
	//   36   66:goto            164
			k = a(egl10, egldisplay, eglconfig, 12324, 0);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:aload_2         
	//   40   72:aload           10
	//   41   74:sipush          12324
	//   42   77:iconst_0        
	//   43   78:invokespecial   #66  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   44   81:istore          6
			l = a(egl10, egldisplay, eglconfig, 12323, 0);
	//   45   83:aload_0         
	//   46   84:aload_1         
	//   47   85:aload_2         
	//   48   86:aload           10
	//   49   88:sipush          12323
	//   50   91:iconst_0        
	//   51   92:invokespecial   #66  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   52   95:istore          7
			int i1 = a(egl10, egldisplay, eglconfig, 12322, 0);
	//   53   97:aload_0         
	//   54   98:aload_1         
	//   55   99:aload_2         
	//   56  100:aload           10
	//   57  102:sipush          12322
	//   58  105:iconst_0        
	//   59  106:invokespecial   #66  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   60  109:istore          8
			int j1 = a(egl10, egldisplay, eglconfig, 12321, 0);
	//   61  111:aload_0         
	//   62  112:aload_1         
	//   63  113:aload_2         
	//   64  114:aload           10
	//   65  116:sipush          12321
	//   66  119:iconst_0        
	//   67  120:invokespecial   #66  <Method int a(EGL10, EGLDisplay, EGLConfig, int, int)>
	//   68  123:istore          9
			if(k == a && l == b && i1 == c && j1 == d)
	//*  69  125:iload           6
	//*  70  127:aload_0         
	//*  71  128:getfield        #29  <Field int a>
	//*  72  131:icmpne          164
	//*  73  134:iload           7
	//*  74  136:aload_0         
	//*  75  137:getfield        #31  <Field int b>
	//*  76  140:icmpne          164
	//*  77  143:iload           8
	//*  78  145:aload_0         
	//*  79  146:getfield        #33  <Field int c>
	//*  80  149:icmpne          164
	//*  81  152:iload           9
	//*  82  154:aload_0         
	//*  83  155:getfield        #35  <Field int d>
	//*  84  158:icmpne          164
				return eglconfig;
	//   85  161:aload           10
	//   86  163:areturn         
		}

	//   87  164:iload           4
	//   88  166:iconst_1        
	//   89  167:iadd            
	//   90  168:istore          4
	//*  91  170:goto            7
		return null;
	//   92  173:aconst_null     
	//   93  174:areturn         
	}

	public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
	{
		Object obj = ((Object) (a(egl10, egldisplay)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #70  <Method em$c a(EGL10, EGLDisplay)>
	//    4    6:astore_3        
		if(obj == null || ((em$c) (obj)).a == null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          18
	//*   7   11:aload_3         
	//*   8   12:getfield        #57  <Field int[] em$c.a>
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		EGLConfig aeglconfig[] = new EGLConfig[((em$c) (obj)).b[0]];
	//   12   20:aload_3         
	//   13   21:getfield        #59  <Field int[] em$c.b>
	//   14   24:iconst_0        
	//   15   25:iaload          
	//   16   26:anewarray       EGLConfig[]
	//   17   29:astore          4
		egl10.eglChooseConfig(egldisplay, ((em$c) (obj)).a, aeglconfig, ((em$c) (obj)).b[0], ((em$c) (obj)).b);
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:aload_3         
	//   21   34:getfield        #57  <Field int[] em$c.a>
	//   22   37:aload           4
	//   23   39:aload_3         
	//   24   40:getfield        #59  <Field int[] em$c.b>
	//   25   43:iconst_0        
	//   26   44:iaload          
	//   27   45:aload_3         
	//   28   46:getfield        #59  <Field int[] em$c.b>
	//   29   49:invokeinterface #63  <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//   30   54:pop             
		EGLConfig eglconfig = a(egl10, egldisplay, aeglconfig);
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:aload_2         
	//   34   58:aload           4
	//   35   60:invokevirtual   #74  <Method EGLConfig a(EGL10, EGLDisplay, EGLConfig[])>
	//   36   63:astore          4
		obj = ((Object) (eglconfig));
	//   37   65:aload           4
	//   38   67:astore_3        
		if(eglconfig == null)
	//*  39   68:aload           4
	//*  40   70:ifnonnull       163
		{
			a = 8;
	//   41   73:aload_0         
	//   42   74:bipush          8
	//   43   76:putfield        #29  <Field int a>
			b = 8;
	//   44   79:aload_0         
	//   45   80:bipush          8
	//   46   82:putfield        #31  <Field int b>
			c = 8;
	//   47   85:aload_0         
	//   48   86:bipush          8
	//   49   88:putfield        #33  <Field int c>
			em$c em$c1 = a(egl10, egldisplay);
	//   50   91:aload_0         
	//   51   92:aload_1         
	//   52   93:aload_2         
	//   53   94:invokespecial   #70  <Method em$c a(EGL10, EGLDisplay)>
	//   54   97:astore          5
			obj = ((Object) (eglconfig));
	//   55   99:aload           4
	//   56  101:astore_3        
			if(em$c1 != null)
	//*  57  102:aload           5
	//*  58  104:ifnull          163
			{
				obj = ((Object) (eglconfig));
	//   59  107:aload           4
	//   60  109:astore_3        
				if(em$c1.a != null)
	//*  61  110:aload           5
	//*  62  112:getfield        #57  <Field int[] em$c.a>
	//*  63  115:ifnull          163
				{
					obj = ((Object) (new EGLConfig[em$c1.b[0]]));
	//   64  118:aload           5
	//   65  120:getfield        #59  <Field int[] em$c.b>
	//   66  123:iconst_0        
	//   67  124:iaload          
	//   68  125:anewarray       EGLConfig[]
	//   69  128:astore_3        
					egl10.eglChooseConfig(egldisplay, em$c1.a, ((EGLConfig []) (obj)), em$c1.b[0], em$c1.b);
	//   70  129:aload_1         
	//   71  130:aload_2         
	//   72  131:aload           5
	//   73  133:getfield        #57  <Field int[] em$c.a>
	//   74  136:aload_3         
	//   75  137:aload           5
	//   76  139:getfield        #59  <Field int[] em$c.b>
	//   77  142:iconst_0        
	//   78  143:iaload          
	//   79  144:aload           5
	//   80  146:getfield        #59  <Field int[] em$c.b>
	//   81  149:invokeinterface #63  <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//   82  154:pop             
					obj = ((Object) (a(egl10, egldisplay, ((EGLConfig []) (obj)))));
	//   83  155:aload_0         
	//   84  156:aload_1         
	//   85  157:aload_2         
	//   86  158:aload_3         
	//   87  159:invokevirtual   #74  <Method EGLConfig a(EGL10, EGLDisplay, EGLConfig[])>
	//   88  162:astore_3        
				}
			}
		}
		return ((EGLConfig) (obj));
	//   89  163:aload_3         
	//   90  164:areturn         
	}

	private static int g = 4;
	protected int a;
	protected int b;
	protected int c;
	protected int d;
	protected int e;
	protected int f;
	private int h[];

	static 
	{
	//    0    0:iconst_4        
	//    1    1:putstatic       #20  <Field int g>
	//*   2    4:return          
	}

	public em$a(int i, int j, int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ek()>
		h = new int[1];
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:newarray        int[]
	//    5    8:putfield        #27  <Field int[] h>
		a = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #29  <Field int a>
		b = j;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:putfield        #31  <Field int b>
		c = k;
	//   12   21:aload_0         
	//   13   22:iload_3         
	//   14   23:putfield        #33  <Field int c>
		d = l;
	//   15   26:aload_0         
	//   16   27:iload           4
	//   17   29:putfield        #35  <Field int d>
		e = i1;
	//   18   32:aload_0         
	//   19   33:iload           5
	//   20   35:putfield        #37  <Field int e>
		f = j1;
	//   21   38:aload_0         
	//   22   39:iload           6
	//   23   41:putfield        #39  <Field int f>
	//   24   44:return          
	}
}
