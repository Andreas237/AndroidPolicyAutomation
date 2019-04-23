// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.ac;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, ov, ys, we, 
//			xe, wd, wx, zzasi, 
//			zzasm, xg, ot, ol, 
//			bad, ad

public final class os extends wt
{

	public os(Context context, ac ac, we we1, bad bad, ol ol, ad ad)
	{
		this(we1, ol, new ov(context, ac, new ys(context), bad, we1, ad));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           5
	//    3    4:new             #21  <Class ov>
	//    4    7:dup             
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:new             #23  <Class ys>
	//    8   13:dup             
	//    9   14:aload_1         
	//   10   15:invokespecial   #26  <Method void ys(Context)>
	//   11   18:aload           4
	//   12   20:aload_3         
	//   13   21:aload           6
	//   14   23:invokespecial   #29  <Method void ov(Context, ac, ys, bad, we, ad)>
	//   15   26:invokespecial   #32  <Method void os(we, ol, ov)>
	//   16   29:return          
	}

	private os(we we1, ol ol, ov ov1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void wt()>
		e = new Object();
	//    2    4:aload_0         
	//    3    5:new             #38  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Object()>
	//    6   12:putfield        #41  <Field Object e>
		c = we1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #43  <Field we c>
		b = we1.b;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #47  <Field zzasm we.b>
	//   13   25:putfield        #48  <Field zzasm b>
		a = ol;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #50  <Field ol a>
		d = ov1;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #52  <Field ov d>
	//   20   38:return          
	}

	static ol a(os os1)
	{
		return os1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ol a>
	//    2    4:areturn         
	}

	public final void a()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		synchronized(e)
	//*   2    2:aload_0         
	//*   3    3:getfield        #41  <Field Object e>
	//*   4    6:astore_3        
	//*   5    7:aload_3         
	//*   6    8:monitorenter    
		{
			f = ((Future) (xe.a(((java.util.concurrent.Callable) (d)))));
	//    7    9:aload_0         
	//    8   10:aload_0         
	//    9   11:getfield        #52  <Field ov d>
	//   10   14:invokestatic    #66  <Method abe xe.a(java.util.concurrent.Callable)>
	//   11   17:putfield        #68  <Field Future f>
		}
	//   12   20:aload_3         
	//   13   21:monitorexit     
		obj1 = ((Object) ((wd)f.get(60000L, TimeUnit.MILLISECONDS)));
	//   14   22:aload_0         
	//   15   23:getfield        #68  <Field Future f>
	//   16   26:ldc2w           #69  <Long 60000L>
	//   17   29:getstatic       #76  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   18   32:invokeinterface #82  <Method Object Future.get(long, TimeUnit)>
	//   19   37:checkcast       #84  <Class wd>
	//   20   40:astore_3        
		byte byte0;
		obj = obj1;
	//   21   41:aload_3         
	//   22   42:astore_2        
		byte0 = -2;
	//   23   43:bipush          -2
	//   24   45:istore_1        
		break MISSING_BLOCK_LABEL_89;
	//   25   46:goto            89
		exception;
	//   26   49:astore          4
		obj1;
	//   27   51:aload_3         
		JVM INSTR monitorexit ;
	//   28   52:monitorexit     
		try
		{
			throw exception;
	//   29   53:aload           4
	//   30   55:athrow          
		}
	//*  31   56:iconst_0        
	//*  32   57:istore_1        
	//*  33   58:goto            89
	//*  34   61:iconst_0        
	//*  35   62:istore_1        
	//*  36   63:goto            89
	//*  37   66:iconst_0        
	//*  38   67:istore_1        
	//*  39   68:goto            89
	//*  40   71:ldc1            #86  <String "Timed out waiting for native ad.">
	//*  41   73:invokestatic    #91  <Method void wx.e(String)>
	//*  42   76:aload_0         
	//*  43   77:getfield        #68  <Field Future f>
	//*  44   80:iconst_1        
	//*  45   81:invokeinterface #95  <Method boolean Future.cancel(boolean)>
	//*  46   86:pop             
	//*  47   87:iconst_2        
	//*  48   88:istore_1        
	//*  49   89:aload_2         
	//*  50   90:ifnull          96
	//*  51   93:goto            290
	//*  52   96:new             #84  <Class wd>
	//*  53   99:dup             
	//*  54  100:aload_0         
	//*  55  101:getfield        #43  <Field we c>
	//*  56  104:getfield        #98  <Field zzasi we.a>
	//*  57  107:getfield        #103 <Field zzwb zzasi.c>
	//*  58  110:aconst_null     
	//*  59  111:aconst_null     
	//*  60  112:iload_1         
	//*  61  113:aconst_null     
	//*  62  114:aconst_null     
	//*  63  115:aload_0         
	//*  64  116:getfield        #48  <Field zzasm b>
	//*  65  119:getfield        #109 <Field int zzasm.k>
	//*  66  122:aload_0         
	//*  67  123:getfield        #48  <Field zzasm b>
	//*  68  126:getfield        #113 <Field long zzasm.j>
	//*  69  129:aload_0         
	//*  70  130:getfield        #43  <Field we c>
	//*  71  133:getfield        #98  <Field zzasi we.a>
	//*  72  136:getfield        #117 <Field String zzasi.i>
	//*  73  139:iconst_0        
	//*  74  140:aconst_null     
	//*  75  141:aconst_null     
	//*  76  142:aconst_null     
	//*  77  143:aconst_null     
	//*  78  144:aconst_null     
	//*  79  145:aload_0         
	//*  80  146:getfield        #48  <Field zzasm b>
	//*  81  149:getfield        #120 <Field long zzasm.h>
	//*  82  152:aload_0         
	//*  83  153:getfield        #43  <Field we c>
	//*  84  156:getfield        #123 <Field zzwf we.d>
	//*  85  159:aload_0         
	//*  86  160:getfield        #48  <Field zzasm b>
	//*  87  163:getfield        #125 <Field long zzasm.f>
	//*  88  166:aload_0         
	//*  89  167:getfield        #43  <Field we c>
	//*  90  170:getfield        #126 <Field long we.f>
	//*  91  173:aload_0         
	//*  92  174:getfield        #48  <Field zzasm b>
	//*  93  177:getfield        #129 <Field long zzasm.m>
	//*  94  180:aload_0         
	//*  95  181:getfield        #48  <Field zzasm b>
	//*  96  184:getfield        #132 <Field String zzasm.n>
	//*  97  187:aload_0         
	//*  98  188:getfield        #43  <Field we c>
	//*  99  191:getfield        #135 <Field org.json.JSONObject we.h>
	//* 100  194:aconst_null     
	//* 101  195:aconst_null     
	//* 102  196:aconst_null     
	//* 103  197:aconst_null     
	//* 104  198:aload_0         
	//* 105  199:getfield        #43  <Field we c>
	//* 106  202:getfield        #47  <Field zzasm we.b>
	//* 107  205:getfield        #139 <Field boolean zzasm.D>
	//* 108  208:aload_0         
	//* 109  209:getfield        #43  <Field we c>
	//* 110  212:getfield        #47  <Field zzasm we.b>
	//* 111  215:getfield        #143 <Field zzaso zzasm.E>
	//* 112  218:aconst_null     
	//* 113  219:aconst_null     
	//* 114  220:aload_0         
	//* 115  221:getfield        #48  <Field zzasm b>
	//* 116  224:getfield        #146 <Field String zzasm.L>
	//* 117  227:aload_0         
	//* 118  228:getfield        #43  <Field we c>
	//* 119  231:getfield        #149 <Field bse we.i>
	//* 120  234:aload_0         
	//* 121  235:getfield        #43  <Field we c>
	//* 122  238:getfield        #47  <Field zzasm we.b>
	//* 123  241:getfield        #152 <Field boolean zzasm.O>
	//* 124  244:iconst_0        
	//* 125  245:aload_0         
	//* 126  246:getfield        #43  <Field we c>
	//* 127  249:getfield        #47  <Field zzasm we.b>
	//* 128  252:getfield        #155 <Field boolean zzasm.Q>
	//* 129  255:aconst_null     
	//* 130  256:aload_0         
	//* 131  257:getfield        #43  <Field we c>
	//* 132  260:getfield        #47  <Field zzasm we.b>
	//* 133  263:getfield        #158 <Field boolean zzasm.S>
	//* 134  266:aload_0         
	//* 135  267:getfield        #43  <Field we c>
	//* 136  270:getfield        #47  <Field zzasm we.b>
	//* 137  273:getfield        #161 <Field String zzasm.T>
	//* 138  276:aload_0         
	//* 139  277:getfield        #43  <Field we c>
	//* 140  280:getfield        #47  <Field zzasm we.b>
	//* 141  283:getfield        #164 <Field boolean zzasm.V>
	//* 142  286:invokespecial   #167 <Method void wd(zzwb, afn, java.util.List, int, java.util.List, java.util.List, int, long, String, boolean, jv, kp, String, jw, jy, long, zzwf, long, long, long, String, org.json.JSONObject, bj, zzawd, java.util.List, java.util.List, boolean, zzaso, String, java.util.List, String, bse, boolean, boolean, boolean, java.util.List, boolean, String, boolean)>
	//* 143  289:astore_2        
	//* 144  290:getstatic       #172 <Field Handler xg.a>
	//* 145  293:new             #174 <Class ot>
	//* 146  296:dup             
	//* 147  297:aload_0         
	//* 148  298:aload_2         
	//* 149  299:invokespecial   #177 <Method void ot(os, wd)>
	//* 150  302:invokevirtual   #183 <Method boolean Handler.post(Runnable)>
	//* 151  305:pop             
	//* 152  306:return          
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			wx.e("Timed out waiting for native ad.");
			f.cancel(true);
			byte0 = 2;
		}
	//* 153  307:astore_3        
	//* 154  308:goto            71
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			byte0 = 0;
		}
	//* 155  311:astore_3        
	//* 156  312:goto            66
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			byte0 = 0;
		}
	//* 157  315:astore_3        
	//* 158  316:goto            61
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			byte0 = 0;
		}
		Object obj2;
		if(obj == null)
			obj = ((Object) (new wd(c.a.c, ((afn) (null)), ((java.util.List) (null)), ((int) (byte0)), ((java.util.List) (null)), ((java.util.List) (null)), b.k, b.j, c.a.i, false, ((jv) (null)), ((kp) (null)), ((String) (null)), ((jw) (null)), ((jy) (null)), b.h, c.d, b.f, c.f, b.m, b.n, c.h, ((bj) (null)), ((zzawd) (null)), ((java.util.List) (null)), ((java.util.List) (null)), c.b.D, c.b.E, ((String) (null)), ((java.util.List) (null)), b.L, c.i, c.b.O, false, c.b.Q, ((java.util.List) (null)), c.b.S, c.b.T, c.b.V)));
		xg.a.post(((Runnable) (new ot(this, ((wd) (obj))))));
		return;
	//* 159  319:astore_3        
	//* 160  320:goto            56
	}

	public final void b_()
	{
		synchronized(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object e>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(f != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #68  <Field Future f>
	//*   7   11:ifnull          25
				f.cancel(true);
	//    8   14:aload_0         
	//    9   15:getfield        #68  <Field Future f>
	//   10   18:iconst_1        
	//   11   19:invokeinterface #95  <Method boolean Future.cancel(boolean)>
	//   12   24:pop             
		}
	//   13   25:aload_1         
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		exception;
	//   16   28:astore_2        
		obj;
	//   17   29:aload_1         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		throw exception;
	//   19   31:aload_2         
	//   20   32:athrow          
	}

	private final ol a;
	private final zzasm b;
	private final we c;
	private final ov d;
	private final Object e;
	private Future f;
}
