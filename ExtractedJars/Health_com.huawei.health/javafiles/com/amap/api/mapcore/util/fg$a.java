// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

// Referenced classes of package com.amap.api.mapcore.util:
//			ed, fg, fh

public class fg$a extends ed
{

	private dq$a e()
	{
		dq$a dq$a1 = (dq$a)e.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference e>
	//    2    4:invokevirtual   #33  <Method Object WeakReference.get()>
	//    3    7:checkcast       #35  <Class dq$a>
	//    4   10:astore_1        
		if(this == fg.b(dq$a1))
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #39  <Method fg$a fg.b(dq$a)>
	//*   8   16:if_acmpne       21
			return dq$a1;
	//    9   19:aload_1         
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	protected transient Bitmap a(Boolean aboolean[])
	{
		boolean flag;
		dq$a dq$a1;
		flag = aboolean[0].booleanValue();
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
	//    4    6:istore_2        
		dq$a1 = (dq$a)e.get();
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field WeakReference e>
	//    7   11:invokevirtual   #33  <Method Object WeakReference.get()>
	//    8   14:checkcast       #35  <Class dq$a>
	//    9   17:astore          5
		if(dq$a1 == null)
	//*  10   19:aload           5
	//*  11   21:ifnonnull       26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		String s;
		aboolean = ((Boolean []) (new StringBuilder()));
	//   14   26:new             #50  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #51  <Method void StringBuilder()>
	//   17   33:astore_1        
		((StringBuilder) (aboolean)).append(dq$a1.a);
	//   18   34:aload_1         
	//   19   35:aload           5
	//   20   37:getfield        #54  <Field int dq$a.a>
	//   21   40:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   22   43:pop             
		((StringBuilder) (aboolean)).append("-");
	//   23   44:aload_1         
	//   24   45:ldc1            #60  <String "-">
	//   25   47:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
		((StringBuilder) (aboolean)).append(dq$a1.b);
	//   27   51:aload_1         
	//   28   52:aload           5
	//   29   54:getfield        #65  <Field int dq$a.b>
	//   30   57:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   31   60:pop             
		((StringBuilder) (aboolean)).append("-");
	//   32   61:aload_1         
	//   33   62:ldc1            #60  <String "-">
	//   34   64:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
		((StringBuilder) (aboolean)).append(dq$a1.c);
	//   36   68:aload_1         
	//   37   69:aload           5
	//   38   71:getfield        #68  <Field int dq$a.c>
	//   39   74:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   40   77:pop             
		s = ((StringBuilder) (aboolean)).toString();
	//   41   78:aload_1         
	//   42   79:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   43   82:astore          4
		Object obj = null;
	//   44   84:aconst_null     
	//   45   85:astore_3        
		aboolean = ((Boolean []) (fg.a(d)));
	//   46   86:aload_0         
	//   47   87:getfield        #17  <Field fg d>
	//   48   90:invokestatic    #75  <Method Object fg.a(fg)>
	//   49   93:astore_1        
		aboolean;
	//   50   94:aload_1         
		JVM INSTR monitorenter ;
	//   51   95:monitorenter    
		for(; d.c && !d(); fg.a(d).wait());
	//   52   96:aload_0         
	//   53   97:getfield        #17  <Field fg d>
	//   54  100:getfield        #78  <Field boolean fg.c>
	//   55  103:ifeq            126
	//   56  106:aload_0         
	//   57  107:invokevirtual   #80  <Method boolean d()>
	//   58  110:ifne            126
	//   59  113:aload_0         
	//   60  114:getfield        #17  <Field fg d>
	//   61  117:invokestatic    #75  <Method Object fg.a(fg)>
	//   62  120:invokevirtual   #85  <Method void Object.wait()>
	//*  63  123:goto            96
		aboolean;
	//   64  126:aload_1         
		JVM INSTR monitorexit ;
	//   65  127:monitorexit     
		  goto _L1
	//*  66  128:goto            136
		obj;
	//   67  131:astore_3        
	//*  68  132:aload_1         
		try
	//*  69  133:monitorexit     
		{
			throw obj;
	//   70  134:aload_3         
	//   71  135:athrow          
		}
	//*  72  136:aload_3         
	//*  73  137:astore_1        
	//*  74  138:aload_0         
	//*  75  139:getfield        #17  <Field fg d>
	//*  76  142:invokestatic    #88  <Method fh fg.b(fg)>
	//*  77  145:ifnull          191
	//*  78  148:aload_3         
	//*  79  149:astore_1        
	//*  80  150:aload_0         
	//*  81  151:invokevirtual   #80  <Method boolean d()>
	//*  82  154:ifne            191
	//*  83  157:aload_3         
	//*  84  158:astore_1        
	//*  85  159:aload_0         
	//*  86  160:invokespecial   #90  <Method dq$a e()>
	//*  87  163:ifnull          191
	//*  88  166:aload_3         
	//*  89  167:astore_1        
	//*  90  168:aload_0         
	//*  91  169:getfield        #17  <Field fg d>
	//*  92  172:invokestatic    #93  <Method boolean fg.c(fg)>
	//*  93  175:ifne            191
	//*  94  178:aload_0         
	//*  95  179:getfield        #17  <Field fg d>
	//*  96  182:invokestatic    #88  <Method fh fg.b(fg)>
	//*  97  185:aload           4
	//*  98  187:invokevirtual   #98  <Method Bitmap fh.b(String)>
	//*  99  190:astore_1        
	//* 100  191:aload_1         
	//* 101  192:astore_3        
	//* 102  193:iload_2         
	//* 103  194:ifeq            258
	//* 104  197:aload_1         
	//* 105  198:astore_3        
	//* 106  199:aload_1         
	//* 107  200:ifnonnull       258
	//* 108  203:aload_1         
	//* 109  204:astore_3        
	//* 110  205:aload_0         
	//* 111  206:invokevirtual   #80  <Method boolean d()>
	//* 112  209:ifne            258
	//* 113  212:aload_1         
	//* 114  213:astore_3        
	//* 115  214:aload_0         
	//* 116  215:invokespecial   #90  <Method dq$a e()>
	//* 117  218:ifnull          258
	//* 118  221:aload_1         
	//* 119  222:astore_3        
	//* 120  223:aload_0         
	//* 121  224:getfield        #17  <Field fg d>
	//* 122  227:invokestatic    #93  <Method boolean fg.c(fg)>
	//* 123  230:ifne            258
	//* 124  233:ldc1            #7   <Class fg>
	//* 125  235:monitorenter    
	//* 126  236:aload_0         
	//* 127  237:getfield        #17  <Field fg d>
	//* 128  240:aload           5
	//* 129  242:invokevirtual   #101 <Method Bitmap fg.a(Object)>
	//* 130  245:astore_3        
	//* 131  246:ldc1            #7   <Class fg>
	//* 132  248:monitorexit     
	//* 133  249:goto            258
	//* 134  252:astore_1        
	//* 135  253:ldc1            #7   <Class fg>
	//* 136  255:monitorexit     
	//* 137  256:aload_1         
	//* 138  257:athrow          
	//* 139  258:aload_3         
	//* 140  259:ifnull          285
	//* 141  262:aload_0         
	//* 142  263:getfield        #17  <Field fg d>
	//* 143  266:invokestatic    #88  <Method fh fg.b(fg)>
	//* 144  269:ifnull          285
	//* 145  272:aload_0         
	//* 146  273:getfield        #17  <Field fg d>
	//* 147  276:invokestatic    #88  <Method fh fg.b(fg)>
	//* 148  279:aload           4
	//* 149  281:aload_3         
	//* 150  282:invokevirtual   #104 <Method void fh.a(String, Bitmap)>
	//* 151  285:aload_3         
	//* 152  286:areturn         
		// Misplaced declaration of an exception variable
		catch(Boolean aboolean[])
	//* 153  287:astore_1        
		{
			((Throwable) (aboolean)).printStackTrace();
	//  154  288:aload_1         
	//  155  289:invokevirtual   #107 <Method void Throwable.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_292;
_L1:
		aboolean = ((Boolean []) (obj));
		if(fg.b(d) == null)
			break MISSING_BLOCK_LABEL_191;
		aboolean = ((Boolean []) (obj));
		if(d())
			break MISSING_BLOCK_LABEL_191;
		aboolean = ((Boolean []) (obj));
		if(e() == null)
			break MISSING_BLOCK_LABEL_191;
		aboolean = ((Boolean []) (obj));
		if(!fg.c(d))
			aboolean = ((Boolean []) (fg.b(d).b(s)));
		obj = ((Object) (aboolean));
		if(!flag)
			break MISSING_BLOCK_LABEL_258;
		obj = ((Object) (aboolean));
		if(aboolean != null)
			break MISSING_BLOCK_LABEL_258;
		obj = ((Object) (aboolean));
		if(d())
			break MISSING_BLOCK_LABEL_258;
		obj = ((Object) (aboolean));
		if(e() == null)
			break MISSING_BLOCK_LABEL_258;
		obj = ((Object) (aboolean));
		if(fg.c(d))
			break MISSING_BLOCK_LABEL_258;
		com/amap/api/mapcore/util/fg;
		JVM INSTR monitorenter ;
		obj = ((Object) (d.a(((Object) (dq$a1)))));
		com/amap/api/mapcore/util/fg;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_258;
		aboolean;
		throw aboolean;
		if(obj == null)
			break MISSING_BLOCK_LABEL_285;
		if(fg.b(d) != null)
			fg.b(d).a(s, ((Bitmap) (obj)));
		return ((Bitmap) (obj));
		return null;
	//  156  292:aconst_null     
	//  157  293:areturn         
	}

	protected volatile Object a(Object aobj[])
	{
		return ((Object) (a((Boolean[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #110 <Class Boolean[]>
	//    3    5:invokevirtual   #112 <Method Bitmap a(Boolean[])>
	//    4    8:areturn         
	}

	protected void a(Bitmap bitmap)
	{
		dq$a dq$a1;
		if(d() || fg.c(d))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #80  <Method boolean d()>
	//*   2    4:ifne            74
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field fg d>
	//*   5   11:invokestatic    #93  <Method boolean fg.c(fg)>
	//*   6   14:ifeq            20
	//*   7   17:goto            74
	//*   8   20:aload_0         
	//*   9   21:invokespecial   #90  <Method dq$a e()>
	//*  10   24:astore_2        
	//*  11   25:aload_1         
	//*  12   26:ifnull          67
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #118 <Method boolean Bitmap.isRecycled()>
	//*  15   33:ifne            67
	//*  16   36:aload_2         
	//*  17   37:ifnull          67
	//*  18   40:aload_2         
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #120 <Method void dq$a.a(Bitmap)>
	//*  21   45:aload_0         
	//*  22   46:getfield        #17  <Field fg d>
	//*  23   49:invokestatic    #123 <Method fg$c fg.d(fg)>
	//*  24   52:ifnull          67
	//*  25   55:aload_0         
	//*  26   56:getfield        #17  <Field fg d>
	//*  27   59:invokestatic    #123 <Method fg$c fg.d(fg)>
	//*  28   62:invokeinterface #127 <Method void fg$c.a()>
	//*  29   67:return          
	//*  30   68:astore_1        
	//*  31   69:aload_1         
	//*  32   70:invokevirtual   #107 <Method void Throwable.printStackTrace()>
	//*  33   73:return          
			bitmap = null;
	//   34   74:aconst_null     
	//   35   75:astore_1        
		try
		{
			dq$a1 = e();
		}
		// Misplaced declaration of an exception variable
		catch(Bitmap bitmap)
		{
			((Throwable) (bitmap)).printStackTrace();
			return;
		}
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_67;
		if(bitmap.isRecycled() || dq$a1 == null)
			break MISSING_BLOCK_LABEL_67;
		dq$a1.a(bitmap);
		if(fg.d(d) != null)
			fg.d(d).a();
	//*  36   76:goto            20
	}

	protected volatile void a(Object obj)
	{
		a((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #115 <Class Bitmap>
	//    3    5:invokevirtual   #128 <Method void a(Bitmap)>
	//    4    8:return          
	}

	protected void b(Bitmap bitmap)
	{
		super.b(((Object) (bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void ed.b(Object)>
		bitmap = ((Bitmap) (fg.a(d)));
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field fg d>
	//    5    9:invokestatic    #75  <Method Object fg.a(fg)>
	//    6   12:astore_1        
		bitmap;
	//    7   13:aload_1         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		fg.a(d).notifyAll();
	//    9   15:aload_0         
	//   10   16:getfield        #17  <Field fg d>
	//   11   19:invokestatic    #75  <Method Object fg.a(fg)>
	//   12   22:invokevirtual   #133 <Method void Object.notifyAll()>
		break MISSING_BLOCK_LABEL_33;
	//   13   25:goto            33
		Object obj;
		obj;
	//   14   28:astore_2        
		((Throwable) (obj)).printStackTrace();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #107 <Method void Throwable.printStackTrace()>
		bitmap;
	//   17   33:aload_1         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		return;
	//   19   35:return          
		obj;
	//   20   36:astore_2        
	//*  21   37:aload_1         
		throw obj;
	//   22   38:monitorexit     
	//   23   39:aload_2         
	//   24   40:athrow          
	}

	protected volatile void b(Object obj)
	{
		b((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #115 <Class Bitmap>
	//    3    5:invokevirtual   #135 <Method void b(Bitmap)>
	//    4    8:return          
	}

	final fg d;
	private final WeakReference e;

	public fg$a(fg fg1, dq$a dq$a1)
	{
		d = fg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field fg d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void ed()>
		e = new WeakReference(((Object) (dq$a1)));
	//    5    9:aload_0         
	//    6   10:new             #22  <Class WeakReference>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #25  <Method void WeakReference(Object)>
	//   10   18:putfield        #27  <Field WeakReference e>
	//   11   21:return          
	}
}
