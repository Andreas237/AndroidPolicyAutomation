// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			azz, p, bwk, m, 
//			ayt, bbb, awp, bbd, 
//			bas, bbc, bav, akh, 
//			ahi

public abstract class baa
	implements azz
{

	protected baa(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		c = new LinkedList();
	//    2    4:aload_0         
	//    3    5:new             #45  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void LinkedList()>
	//    6   12:putfield        #48  <Field LinkedList c>
		d = 0L;
	//    7   15:aload_0         
	//    8   16:lconst_0        
	//    9   17:putfield        #50  <Field long d>
		e = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #52  <Field long e>
		f = 0L;
	//   13   25:aload_0         
	//   14   26:lconst_0        
	//   15   27:putfield        #54  <Field long f>
		g = 0L;
	//   16   30:aload_0         
	//   17   31:lconst_0        
	//   18   32:putfield        #56  <Field long g>
		h = 0L;
	//   19   35:aload_0         
	//   20   36:lconst_0        
	//   21   37:putfield        #58  <Field long h>
		i = 0L;
	//   22   40:aload_0         
	//   23   41:lconst_0        
	//   24   42:putfield        #60  <Field long i>
		j = 0L;
	//   25   45:aload_0         
	//   26   46:lconst_0        
	//   27   47:putfield        #62  <Field long j>
		t = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #64  <Field boolean t>
		p = false;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #66  <Field boolean p>
		try
		{
			e e1 = p.bn;
	//   34   60:getstatic       #72  <Field e p.bn>
	//   35   63:astore_2        
			if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*  36   64:invokestatic    #77  <Method m bwk.e()>
	//*  37   67:aload_2         
	//*  38   68:invokevirtual   #82  <Method Object m.a(e)>
	//*  39   71:checkcast       #84  <Class Boolean>
	//*  40   74:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*  41   77:ifeq            86
			{
				ayt.a();
	//   42   80:invokestatic    #92  <Method void ayt.a()>
				break MISSING_BLOCK_LABEL_93;
	//   43   83:goto            93
			}
		}
	//*  44   86:getstatic       #94  <Field bav a>
	//*  45   89:invokestatic    #99  <Method boolean bbb.a(bav)>
	//*  46   92:pop             
	//*  47   93:aload_0         
	//*  48   94:aload_1         
	//*  49   95:invokevirtual   #105 <Method Resources Context.getResources()>
	//*  50   98:invokevirtual   #111 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//*  51  101:putfield        #113 <Field DisplayMetrics q>
	//*  52  104:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  53  105:astore_1        
		{
			return;
	//   54  106:return          
		}
		bbb.a(a);
		q = context.getResources().getDisplayMetrics();
		return;
	}

	private final String a(Context context, String s1, boolean flag, View view, Activity activity, byte abyte0[])
	{
		if(!flag)
			break MISSING_BLOCK_LABEL_22;
	//    0    0:iload_3         
	//    1    1:ifeq            22
		try
		{
			context = ((Context) (a(context, view, activity)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokevirtual   #121 <Method akh a(Context, View, Activity)>
	//    7   13:astore_1        
			t = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #64  <Field boolean t>
		}
	//*  11   19:goto            29
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:aconst_null     
	//*  15   25:invokevirtual   #124 <Method akh a(Context, ahi)>
	//*  16   28:astore_1        
	//*  17   29:aload_1         
	//*  18   30:ifnull          49
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #129 <Method int awp.d()>
	//*  21   37:ifne            43
	//*  22   40:goto            49
	//*  23   43:aload_1         
	//*  24   44:aload_2         
	//*  25   45:invokestatic    #132 <Method String ayt.a(akh, String)>
	//*  26   48:areturn         
	//*  27   49:iconst_5        
	//*  28   50:invokestatic    #138 <Method String Integer.toString(int)>
	//*  29   53:astore_1        
	//*  30   54:aload_1         
	//*  31   55:areturn         
	//*  32   56:iconst_3        
	//*  33   57:invokestatic    #138 <Method String Integer.toString(int)>
	//*  34   60:areturn         
	//*  35   61:bipush          7
	//*  36   63:invokestatic    #138 <Method String Integer.toString(int)>
	//*  37   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return Integer.toString(7);
		}
	//*  38   67:astore_1        
	//*  39   68:goto            61
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return Integer.toString(3);
		}
		break MISSING_BLOCK_LABEL_29;
		context = ((Context) (a(context, ((ahi) (null)))));
		if(context == null)
			break MISSING_BLOCK_LABEL_49;
		if(((awp) (context)).d() == 0)
			break MISSING_BLOCK_LABEL_49;
		return ayt.a(((akh) (context)), s1);
		context = ((Context) (Integer.toString(5)));
		return ((String) (context));
	//*  40   71:astore_1        
	//*  41   72:goto            56
	}

	protected abstract long a(StackTraceElement astacktraceelement[]);

	protected abstract akh a(Context context, View view, Activity activity);

	protected abstract akh a(Context context, ahi ahi);

	public final String a(Context context)
	{
		if(bbd.a())
	//*   0    0:invokestatic    #144 <Method boolean bbd.a()>
	//*   1    3:ifeq            39
		{
			e e1 = p.bp;
	//    2    6:getstatic       #147 <Field e p.bp>
	//    3    9:astore_2        
			if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   4   10:invokestatic    #77  <Method m bwk.e()>
	//*   5   13:aload_2         
	//*   6   14:invokevirtual   #82  <Method Object m.a(e)>
	//*   7   17:checkcast       #84  <Class Boolean>
	//*   8   20:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   9   23:ifne            29
	//*  10   26:goto            39
				throw new IllegalStateException("The caller must not be called from the UI thread.");
	//   11   29:new             #149 <Class IllegalStateException>
	//   12   32:dup             
	//   13   33:ldc1            #151 <String "The caller must not be called from the UI thread.">
	//   14   35:invokespecial   #154 <Method void IllegalStateException(String)>
	//   15   38:athrow          
		}
		return a(context, ((String) (null)), false, ((View) (null)), ((Activity) (null)), ((byte []) (null)));
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:aconst_null     
	//   19   42:iconst_0        
	//   20   43:aconst_null     
	//   21   44:aconst_null     
	//   22   45:aconst_null     
	//   23   46:invokespecial   #156 <Method String a(Context, String, boolean, View, Activity, byte[])>
	//   24   49:areturn         
	}

	public final String a(Context context, String s1, View view)
	{
		return a(context, s1, view, ((Activity) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #160 <Method String a(Context, String, View, Activity)>
	//    6    8:areturn         
	}

	public final String a(Context context, String s1, View view, Activity activity)
	{
		return a(context, s1, true, view, activity, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aconst_null     
	//    7    8:invokespecial   #156 <Method String a(Context, String, boolean, View, Activity, byte[])>
	//    8   11:areturn         
	}

	public final void a(int i1, int j1, int k1)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field MotionEvent b>
	//    2    4:astore          9
		if(obj != null)
	//*   3    6:aload           9
	//*   4    8:ifnull          16
			((MotionEvent) (obj)).recycle();
	//    5   11:aload           9
	//    6   13:invokevirtual   #168 <Method void MotionEvent.recycle()>
		obj = ((Object) (q));
	//    7   16:aload_0         
	//    8   17:getfield        #113 <Field DisplayMetrics q>
	//    9   20:astore          9
		if(obj != null)
	//*  10   22:aload           9
	//*  11   24:ifnull          82
		{
			long l1 = k1;
	//   12   27:iload_3         
	//   13   28:i2l             
	//   14   29:lstore          7
			float f1 = i1;
	//   15   31:iload_1         
	//   16   32:i2f             
	//   17   33:fstore          4
			float f2 = ((DisplayMetrics) (obj)).density;
	//   18   35:aload           9
	//   19   37:getfield        #173 <Field float DisplayMetrics.density>
	//   20   40:fstore          5
			float f3 = j1;
	//   21   42:iload_2         
	//   22   43:i2f             
	//   23   44:fstore          6
			b = MotionEvent.obtain(0L, l1, 1, f1 * f2, q.density * f3, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
	//   24   46:aload_0         
	//   25   47:lconst_0        
	//   26   48:lload           7
	//   27   50:iconst_1        
	//   28   51:fload           4
	//   29   53:fload           5
	//   30   55:fmul            
	//   31   56:aload_0         
	//   32   57:getfield        #113 <Field DisplayMetrics q>
	//   33   60:getfield        #173 <Field float DisplayMetrics.density>
	//   34   63:fload           6
	//   35   65:fmul            
	//   36   66:fconst_0        
	//   37   67:fconst_0        
	//   38   68:iconst_0        
	//   39   69:fconst_0        
	//   40   70:fconst_0        
	//   41   71:iconst_0        
	//   42   72:iconst_0        
	//   43   73:invokestatic    #177 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, float, float, int, float, float, int, int)>
	//   44   76:putfield        #163 <Field MotionEvent b>
		} else
	//*  45   79:goto            87
		{
			b = null;
	//   46   82:aload_0         
	//   47   83:aconst_null     
	//   48   84:putfield        #163 <Field MotionEvent b>
		}
		p = false;
	//   49   87:aload_0         
	//   50   88:iconst_0        
	//   51   89:putfield        #66  <Field boolean p>
	//   52   92:return          
	}

	public final void a(MotionEvent motionevent)
	{
		boolean flag1;
		boolean flag2 = t;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean t>
	//    2    4:istore          12
		flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          11
		if(flag2)
	//*   5    9:iload           12
	//*   6   11:ifeq            101
		{
			g = 0L;
	//    7   14:aload_0         
	//    8   15:lconst_0        
	//    9   16:putfield        #56  <Field long g>
			f = 0L;
	//   10   19:aload_0         
	//   11   20:lconst_0        
	//   12   21:putfield        #54  <Field long f>
			e = 0L;
	//   13   24:aload_0         
	//   14   25:lconst_0        
	//   15   26:putfield        #52  <Field long e>
			d = 0L;
	//   16   29:aload_0         
	//   17   30:lconst_0        
	//   18   31:putfield        #50  <Field long d>
			h = 0L;
	//   19   34:aload_0         
	//   20   35:lconst_0        
	//   21   36:putfield        #58  <Field long h>
			j = 0L;
	//   22   39:aload_0         
	//   23   40:lconst_0        
	//   24   41:putfield        #62  <Field long j>
			i = 0L;
	//   25   44:aload_0         
	//   26   45:lconst_0        
	//   27   46:putfield        #60  <Field long i>
			for(Iterator iterator = c.iterator(); iterator.hasNext(); ((MotionEvent)iterator.next()).recycle());
	//   28   49:aload_0         
	//   29   50:getfield        #48  <Field LinkedList c>
	//   30   53:invokevirtual   #184 <Method Iterator LinkedList.iterator()>
	//   31   56:astore          13
	//   32   58:aload           13
	//   33   60:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//   34   65:ifeq            84
	//   35   68:aload           13
	//   36   70:invokeinterface #193 <Method Object Iterator.next()>
	//   37   75:checkcast       #165 <Class MotionEvent>
	//   38   78:invokevirtual   #168 <Method void MotionEvent.recycle()>
	//*  39   81:goto            58
			c.clear();
	//   40   84:aload_0         
	//   41   85:getfield        #48  <Field LinkedList c>
	//   42   88:invokevirtual   #196 <Method void LinkedList.clear()>
			b = null;
	//   43   91:aload_0         
	//   44   92:aconst_null     
	//   45   93:putfield        #163 <Field MotionEvent b>
			t = false;
	//   46   96:aload_0         
	//   47   97:iconst_0        
	//   48   98:putfield        #64  <Field boolean t>
		}
		switch(motionevent.getAction())
	//*  49  101:aload_1         
	//*  50  102:invokevirtual   #199 <Method int MotionEvent.getAction()>
		{
	//*  51  105:tableswitch     0 2: default 132
	//	               0 221
	//	               1 135
	//	               2 135
	//*  52  132:goto            244
		case 1: // '\001'
		case 2: // '\002'
			double d1 = motionevent.getRawX();
	//   53  135:aload_1         
	//   54  136:invokevirtual   #203 <Method float MotionEvent.getRawX()>
	//   55  139:f2d             
	//   56  140:dstore_2        
			double d2 = motionevent.getRawY();
	//   57  141:aload_1         
	//   58  142:invokevirtual   #206 <Method float MotionEvent.getRawY()>
	//   59  145:f2d             
	//   60  146:dstore          4
			double d3 = r;
	//   61  148:aload_0         
	//   62  149:getfield        #208 <Field double r>
	//   63  152:dstore          6
			Double.isNaN(d1);
	//   64  154:dload_2         
	//   65  155:invokestatic    #214 <Method boolean Double.isNaN(double)>
	//   66  158:pop             
			d3 = d1 - d3;
	//   67  159:dload_2         
	//   68  160:dload           6
	//   69  162:dsub            
	//   70  163:dstore          6
			double d4 = s;
	//   71  165:aload_0         
	//   72  166:getfield        #216 <Field double s>
	//   73  169:dstore          8
			Double.isNaN(d2);
	//   74  171:dload           4
	//   75  173:invokestatic    #214 <Method boolean Double.isNaN(double)>
	//   76  176:pop             
			d4 = d2 - d4;
	//   77  177:dload           4
	//   78  179:dload           8
	//   79  181:dsub            
	//   80  182:dstore          8
			k = k + Math.sqrt(d3 * d3 + d4 * d4);
	//   81  184:aload_0         
	//   82  185:aload_0         
	//   83  186:getfield        #218 <Field double k>
	//   84  189:dload           6
	//   85  191:dload           6
	//   86  193:dmul            
	//   87  194:dload           8
	//   88  196:dload           8
	//   89  198:dmul            
	//   90  199:dadd            
	//   91  200:invokestatic    #224 <Method double Math.sqrt(double)>
	//   92  203:dadd            
	//   93  204:putfield        #218 <Field double k>
			r = d1;
	//   94  207:aload_0         
	//   95  208:dload_2         
	//   96  209:putfield        #208 <Field double r>
			s = d2;
	//   97  212:aload_0         
	//   98  213:dload           4
	//   99  215:putfield        #216 <Field double s>
			break;

	//* 100  218:goto            244
		case 0: // '\0'
			k = 0.0D;
	//  101  221:aload_0         
	//  102  222:dconst_0        
	//  103  223:putfield        #218 <Field double k>
			r = motionevent.getRawX();
	//  104  226:aload_0         
	//  105  227:aload_1         
	//  106  228:invokevirtual   #203 <Method float MotionEvent.getRawX()>
	//  107  231:f2d             
	//  108  232:putfield        #208 <Field double r>
			s = motionevent.getRawY();
	//  109  235:aload_0         
	//  110  236:aload_1         
	//  111  237:invokevirtual   #206 <Method float MotionEvent.getRawY()>
	//  112  240:f2d             
	//  113  241:putfield        #216 <Field double s>
			break;
		}
		motionevent.getAction();
	//  114  244:aload_1         
	//  115  245:invokevirtual   #199 <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 0 3: default 280
	//	               0 523
	//	               1 447
	//	               2 296
	//	               3 283;
	//  116  248:tableswitch     0 3: default 280
	//	               0 523
	//	               1 447
	//	               2 296
	//	               3 283
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		break; /* Loop/switch isn't completed */
	//  117  280:goto            565
_L5:
		g = g + 1L;
	//  118  283:aload_0         
	//  119  284:aload_0         
	//  120  285:getfield        #56  <Field long g>
	//  121  288:lconst_1        
	//  122  289:ladd            
	//  123  290:putfield        #56  <Field long g>
		break; /* Loop/switch isn't completed */
	//  124  293:goto            565
_L4:
		e = e + (long)(motionevent.getHistorySize() + 1);
	//  125  296:aload_0         
	//  126  297:aload_0         
	//  127  298:getfield        #52  <Field long e>
	//  128  301:aload_1         
	//  129  302:invokevirtual   #227 <Method int MotionEvent.getHistorySize()>
	//  130  305:iconst_1        
	//  131  306:iadd            
	//  132  307:i2l             
	//  133  308:ladd            
	//  134  309:putfield        #52  <Field long e>
		motionevent = ((MotionEvent) (b(motionevent)));
	//  135  312:aload_0         
	//  136  313:aload_1         
	//  137  314:invokevirtual   #230 <Method bbc b(MotionEvent)>
	//  138  317:astore_1        
		if(motionevent == null) goto _L7; else goto _L6
	//  139  318:aload_1         
	//  140  319:ifnull          575
_L6:
		if(((bbc) (motionevent)).d == null || ((bbc) (motionevent)).g == null) goto _L7; else goto _L8
	//  141  322:aload_1         
	//  142  323:getfield        #235 <Field Long bbc.d>
	//  143  326:ifnull          575
	//  144  329:aload_1         
	//  145  330:getfield        #237 <Field Long bbc.g>
	//  146  333:ifnull          575
_L8:
		boolean flag = true;
	//  147  336:iconst_1        
	//  148  337:istore          10
	//* 149  339:goto            342
_L12:
		if(!flag) goto _L10; else goto _L9
	//  150  342:iload           10
	//  151  344:ifeq            371
_L9:
		i = i + (((bbc) (motionevent)).d.longValue() + ((bbc) (motionevent)).g.longValue());
	//  152  347:aload_0         
	//  153  348:aload_0         
	//  154  349:getfield        #60  <Field long i>
	//  155  352:aload_1         
	//  156  353:getfield        #235 <Field Long bbc.d>
	//  157  356:invokevirtual   #243 <Method long Long.longValue()>
	//  158  359:aload_1         
	//  159  360:getfield        #237 <Field Long bbc.g>
	//  160  363:invokevirtual   #243 <Method long Long.longValue()>
	//  161  366:ladd            
	//  162  367:ladd            
	//  163  368:putfield        #60  <Field long i>
_L10:
		flag = flag1;
	//  164  371:iload           11
	//  165  373:istore          10
		if(q == null)
			break MISSING_BLOCK_LABEL_415;
	//  166  375:aload_0         
	//  167  376:getfield        #113 <Field DisplayMetrics q>
	//  168  379:ifnull          415
		flag = flag1;
	//  169  382:iload           11
	//  170  384:istore          10
		if(motionevent == null)
			break MISSING_BLOCK_LABEL_415;
	//  171  386:aload_1         
	//  172  387:ifnull          415
		flag = flag1;
	//  173  390:iload           11
	//  174  392:istore          10
		if(((bbc) (motionevent)).e == null)
			break MISSING_BLOCK_LABEL_415;
	//  175  394:aload_1         
	//  176  395:getfield        #245 <Field Long bbc.e>
	//  177  398:ifnull          415
		flag = flag1;
	//  178  401:iload           11
	//  179  403:istore          10
		if(((bbc) (motionevent)).h != null)
	//* 180  405:aload_1         
	//* 181  406:getfield        #247 <Field Long bbc.h>
	//* 182  409:ifnull          415
			flag = true;
	//  183  412:iconst_1        
	//  184  413:istore          10
		if(!flag)
			break; /* Loop/switch isn't completed */
	//  185  415:iload           10
	//  186  417:ifeq            565
		try
		{
			j = j + (((bbc) (motionevent)).e.longValue() + ((bbc) (motionevent)).h.longValue());
	//  187  420:aload_0         
	//  188  421:aload_0         
	//  189  422:getfield        #62  <Field long j>
	//  190  425:aload_1         
	//  191  426:getfield        #245 <Field Long bbc.e>
	//  192  429:invokevirtual   #243 <Method long Long.longValue()>
	//  193  432:aload_1         
	//  194  433:getfield        #247 <Field Long bbc.h>
	//  195  436:invokevirtual   #243 <Method long Long.longValue()>
	//  196  439:ladd            
	//  197  440:ladd            
	//  198  441:putfield        #62  <Field long j>
		}
	//* 199  444:goto            565
	//* 200  447:aload_0         
	//* 201  448:aload_1         
	//* 202  449:invokestatic    #250 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//* 203  452:putfield        #163 <Field MotionEvent b>
	//* 204  455:aload_0         
	//* 205  456:getfield        #48  <Field LinkedList c>
	//* 206  459:aload_0         
	//* 207  460:getfield        #163 <Field MotionEvent b>
	//* 208  463:invokevirtual   #254 <Method boolean LinkedList.add(Object)>
	//* 209  466:pop             
	//* 210  467:aload_0         
	//* 211  468:getfield        #48  <Field LinkedList c>
	//* 212  471:invokevirtual   #257 <Method int LinkedList.size()>
	//* 213  474:bipush          6
	//* 214  476:icmple          492
	//* 215  479:aload_0         
	//* 216  480:getfield        #48  <Field LinkedList c>
	//* 217  483:invokevirtual   #260 <Method Object LinkedList.remove()>
	//* 218  486:checkcast       #165 <Class MotionEvent>
	//* 219  489:invokevirtual   #168 <Method void MotionEvent.recycle()>
	//* 220  492:aload_0         
	//* 221  493:aload_0         
	//* 222  494:getfield        #54  <Field long f>
	//* 223  497:lconst_1        
	//* 224  498:ladd            
	//* 225  499:putfield        #54  <Field long f>
	//* 226  502:aload_0         
	//* 227  503:aload_0         
	//* 228  504:new             #41  <Class Throwable>
	//* 229  507:dup             
	//* 230  508:invokespecial   #261 <Method void Throwable()>
	//* 231  511:invokevirtual   #265 <Method StackTraceElement[] Throwable.getStackTrace()>
	//* 232  514:invokevirtual   #267 <Method long a(StackTraceElement[])>
	//* 233  517:putfield        #58  <Field long h>
	//* 234  520:goto            565
	//* 235  523:aload_0         
	//* 236  524:aload_1         
	//* 237  525:invokevirtual   #270 <Method float MotionEvent.getX()>
	//* 238  528:putfield        #272 <Field float l>
	//* 239  531:aload_0         
	//* 240  532:aload_1         
	//* 241  533:invokevirtual   #275 <Method float MotionEvent.getY()>
	//* 242  536:putfield        #277 <Field float m>
	//* 243  539:aload_0         
	//* 244  540:aload_1         
	//* 245  541:invokevirtual   #203 <Method float MotionEvent.getRawX()>
	//* 246  544:putfield        #279 <Field float n>
	//* 247  547:aload_0         
	//* 248  548:aload_1         
	//* 249  549:invokevirtual   #206 <Method float MotionEvent.getRawY()>
	//* 250  552:putfield        #281 <Field float o>
	//* 251  555:aload_0         
	//* 252  556:aload_0         
	//* 253  557:getfield        #50  <Field long d>
	//* 254  560:lconst_1        
	//* 255  561:ladd            
	//* 256  562:putfield        #50  <Field long d>
	//* 257  565:aload_0         
	//* 258  566:iconst_1        
	//* 259  567:putfield        #66  <Field boolean p>
	//* 260  570:return          
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent) { }
	//  261  571:astore_1        
		break; /* Loop/switch isn't completed */
	//  262  572:goto            565
_L3:
		b = MotionEvent.obtain(motionevent);
		c.add(((Object) (b)));
		if(c.size() > 6)
			((MotionEvent)c.remove()).recycle();
		f = f + 1L;
		h = a((new Throwable()).getStackTrace());
		break; /* Loop/switch isn't completed */
_L2:
		l = motionevent.getX();
		m = motionevent.getY();
		n = motionevent.getRawX();
		o = motionevent.getRawY();
		d = d + 1L;
		p = true;
		return;
_L7:
		flag = false;
	//  263  575:iconst_0        
	//  264  576:istore          10
		if(true) goto _L12; else goto _L11
	//  265  578:goto            342
_L11:
	}

	public void a(View view)
	{
	//    0    0:return          
	}

	protected abstract bbc b(MotionEvent motionevent);

	protected static volatile bav a;
	protected MotionEvent b;
	protected LinkedList c;
	protected long d;
	protected long e;
	protected long f;
	protected long g;
	protected long h;
	protected long i;
	protected long j;
	protected double k;
	protected float l;
	protected float m;
	protected float n;
	protected float o;
	protected boolean p;
	protected DisplayMetrics q;
	private double r;
	private double s;
	private boolean t;

	static 
	{
	//    0    0:return          
	}
}
