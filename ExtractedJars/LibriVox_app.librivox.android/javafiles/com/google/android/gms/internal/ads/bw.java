// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			cp, bz, abw, p, 
//			bwk, bh, zv, bg, 
//			bl, by, wx, vt, 
//			vs, bpu, xg, bx

public final class bw extends cp
	implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, bz
{

	public bw(View view, HashMap hashmap, HashMap hashmap1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void cp()>
	//    2    4:aload_0         
	//    3    5:new             #56  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void Object()>
	//    6   12:putfield        #59  <Field Object b>
	//    7   15:aload_0         
	//    8   16:new             #61  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #62  <Method void HashMap()>
	//   11   23:putfield        #64  <Field Map d>
	//   12   26:aload_0         
	//   13   27:new             #61  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #62  <Method void HashMap()>
	//   16   34:putfield        #66  <Field Map e>
	//   17   37:aload_0         
	//   18   38:new             #61  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #62  <Method void HashMap()>
	//   21   45:putfield        #68  <Field Map f>
		i = new Point();
	//   22   48:aload_0         
	//   23   49:new             #70  <Class Point>
	//   24   52:dup             
	//   25   53:invokespecial   #71  <Method void Point()>
	//   26   56:putfield        #73  <Field Point i>
		j = new Point();
	//   27   59:aload_0         
	//   28   60:new             #70  <Class Point>
	//   29   63:dup             
	//   30   64:invokespecial   #71  <Method void Point()>
	//   31   67:putfield        #75  <Field Point j>
		k = new WeakReference(((Object) (null)));
	//   32   70:aload_0         
	//   33   71:new             #77  <Class WeakReference>
	//   34   74:dup             
	//   35   75:aconst_null     
	//   36   76:invokespecial   #80  <Method void WeakReference(Object)>
	//   37   79:putfield        #82  <Field WeakReference k>
		aw.D();
	//   38   82:invokestatic    #88  <Method abw aw.D()>
	//   39   85:pop             
		com.google.android.gms.internal.ads.abw.a(view, ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   40   86:aload_1         
	//   41   87:aload_0         
	//   42   88:invokestatic    #93  <Method void com.google.android.gms.internal.ads.abw.a(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		aw.D();
	//   43   91:invokestatic    #88  <Method abw aw.D()>
	//   44   94:pop             
		com.google.android.gms.internal.ads.abw.a(view, ((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   45   95:aload_1         
	//   46   96:aload_0         
	//   47   97:invokestatic    #96  <Method void com.google.android.gms.internal.ads.abw.a(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
		view.setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//   48  100:aload_1         
	//   49  101:aload_0         
	//   50  102:invokevirtual   #102 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		view.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   51  105:aload_1         
	//   52  106:aload_0         
	//   53  107:invokevirtual   #106 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		c = new WeakReference(((Object) (view)));
	//   54  110:aload_0         
	//   55  111:new             #77  <Class WeakReference>
	//   56  114:dup             
	//   57  115:aload_1         
	//   58  116:invokespecial   #80  <Method void WeakReference(Object)>
	//   59  119:putfield        #108 <Field WeakReference c>
		hashmap = ((HashMap) (((Map) (hashmap)).entrySet().iterator()));
	//   60  122:aload_2         
	//   61  123:invokeinterface #114 <Method Set Map.entrySet()>
	//   62  128:invokeinterface #120 <Method Iterator Set.iterator()>
	//   63  133:astore_2        
		do
		{
			if(!((Iterator) (hashmap)).hasNext())
				break;
	//   64  134:aload_2         
	//   65  135:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//   66  140:ifeq            245
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (hashmap)).next()));
	//   67  143:aload_2         
	//   68  144:invokeinterface #130 <Method Object Iterator.next()>
	//   69  149:checkcast       #132 <Class java.util.Map$Entry>
	//   70  152:astore          5
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   71  154:aload           5
	//   72  156:invokeinterface #135 <Method Object java.util.Map$Entry.getKey()>
	//   73  161:checkcast       #41  <Class String>
	//   74  164:astore          4
			obj = ((Object) ((View)((java.util.Map.Entry) (obj)).getValue()));
	//   75  166:aload           5
	//   76  168:invokeinterface #138 <Method Object java.util.Map$Entry.getValue()>
	//   77  173:checkcast       #98  <Class View>
	//   78  176:astore          5
			if(obj != null)
	//*  79  178:aload           5
	//*  80  180:ifnull          134
			{
				d.put(((Object) (s)), ((Object) (new WeakReference(obj))));
	//   81  183:aload_0         
	//   82  184:getfield        #64  <Field Map d>
	//   83  187:aload           4
	//   84  189:new             #77  <Class WeakReference>
	//   85  192:dup             
	//   86  193:aload           5
	//   87  195:invokespecial   #80  <Method void WeakReference(Object)>
	//   88  198:invokeinterface #142 <Method Object Map.put(Object, Object)>
	//   89  203:pop             
				if(!"1098".equals(((Object) (s))) && !"3011".equals(((Object) (s))))
	//*  90  204:ldc1            #144 <String "1098">
	//*  91  206:aload           4
	//*  92  208:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  93  211:ifne            134
	//*  94  214:ldc1            #150 <String "3011">
	//*  95  216:aload           4
	//*  96  218:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  97  221:ifne            134
				{
					((View) (obj)).setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//   98  224:aload           5
	//   99  226:aload_0         
	//  100  227:invokevirtual   #102 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
					((View) (obj)).setClickable(true);
	//  101  230:aload           5
	//  102  232:iconst_1        
	//  103  233:invokevirtual   #154 <Method void View.setClickable(boolean)>
					((View) (obj)).setOnClickListener(((android.view.View.OnClickListener) (this)));
	//  104  236:aload           5
	//  105  238:aload_0         
	//  106  239:invokevirtual   #106 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
				}
			}
		} while(true);
	//  107  242:goto            134
		f.putAll(d);
	//  108  245:aload_0         
	//  109  246:getfield        #68  <Field Map f>
	//  110  249:aload_0         
	//  111  250:getfield        #64  <Field Map d>
	//  112  253:invokeinterface #158 <Method void Map.putAll(Map)>
		hashmap = ((HashMap) (((Map) (hashmap1)).entrySet().iterator()));
	//  113  258:aload_3         
	//  114  259:invokeinterface #114 <Method Set Map.entrySet()>
	//  115  264:invokeinterface #120 <Method Iterator Set.iterator()>
	//  116  269:astore_2        
		do
		{
			if(!((Iterator) (hashmap)).hasNext())
				break;
	//  117  270:aload_2         
	//  118  271:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//  119  276:ifeq            342
			hashmap1 = ((HashMap) ((java.util.Map.Entry)((Iterator) (hashmap)).next()));
	//  120  279:aload_2         
	//  121  280:invokeinterface #130 <Method Object Iterator.next()>
	//  122  285:checkcast       #132 <Class java.util.Map$Entry>
	//  123  288:astore_3        
			View view1 = (View)((java.util.Map.Entry) (hashmap1)).getValue();
	//  124  289:aload_3         
	//  125  290:invokeinterface #138 <Method Object java.util.Map$Entry.getValue()>
	//  126  295:checkcast       #98  <Class View>
	//  127  298:astore          4
			if(view1 != null)
	//* 128  300:aload           4
	//* 129  302:ifnull          270
			{
				e.put(((Object) ((String)((java.util.Map.Entry) (hashmap1)).getKey())), ((Object) (new WeakReference(((Object) (view1))))));
	//  130  305:aload_0         
	//  131  306:getfield        #66  <Field Map e>
	//  132  309:aload_3         
	//  133  310:invokeinterface #135 <Method Object java.util.Map$Entry.getKey()>
	//  134  315:checkcast       #41  <Class String>
	//  135  318:new             #77  <Class WeakReference>
	//  136  321:dup             
	//  137  322:aload           4
	//  138  324:invokespecial   #80  <Method void WeakReference(Object)>
	//  139  327:invokeinterface #142 <Method Object Map.put(Object, Object)>
	//  140  332:pop             
				view1.setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//  141  333:aload           4
	//  142  335:aload_0         
	//  143  336:invokevirtual   #102 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
			}
		} while(true);
	//  144  339:goto            270
		f.putAll(e);
	//  145  342:aload_0         
	//  146  343:getfield        #68  <Field Map f>
	//  147  346:aload_0         
	//  148  347:getfield        #66  <Field Map e>
	//  149  350:invokeinterface #158 <Method void Map.putAll(Map)>
		com.google.android.gms.internal.ads.p.a(view.getContext());
	//  150  355:aload_1         
	//  151  356:invokevirtual   #162 <Method android.content.Context View.getContext()>
	//  152  359:invokestatic    #167 <Method void com.google.android.gms.internal.ads.p.a(android.content.Context)>
	//  153  362:return          
	}

	private final int a(int l)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			com.google.android.gms.internal.ads.bwk.a();
	//    5    7:invokestatic    #173 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//    6   10:pop             
			l = zv.b(g.p(), l);
	//    7   11:aload_0         
	//    8   12:getfield        #175 <Field bh g>
	//    9   15:invokeinterface #180 <Method android.content.Context bh.p()>
	//   10   20:iload_1         
	//   11   21:invokestatic    #185 <Method int zv.b(android.content.Context, int)>
	//   12   24:istore_1        
		}
	//   13   25:aload_2         
	//   14   26:monitorexit     
		return l;
	//   15   27:iload_1         
	//   16   28:ireturn         
		exception;
	//   17   29:astore_3        
		obj;
	//   18   30:aload_2         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_3         
	//   21   33:athrow          
	}

	private final void a(View view)
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object b>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		bh bh1;
		if(g == null)
			break MISSING_BLOCK_LABEL_54;
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field bh g>
	//    7   11:ifnull          54
		if(g instanceof bg)
	//*   8   14:aload_0         
	//*   9   15:getfield        #175 <Field bh g>
	//*  10   18:instanceof      #188 <Class bg>
	//*  11   21:ifeq            38
		{
			bh1 = ((bg)g).i();
	//   12   24:aload_0         
	//   13   25:getfield        #175 <Field bh g>
	//   14   28:checkcast       #188 <Class bg>
	//   15   31:invokevirtual   #191 <Method bh bg.i()>
	//   16   34:astore_2        
			break MISSING_BLOCK_LABEL_43;
	//   17   35:goto            43
		}
		bh1 = g;
	//   18   38:aload_0         
	//   19   39:getfield        #175 <Field bh g>
	//   20   42:astore_2        
		if(bh1 == null)
			break MISSING_BLOCK_LABEL_54;
	//   21   43:aload_2         
	//   22   44:ifnull          54
		bh1.c(view);
	//   23   47:aload_2         
	//   24   48:aload_1         
	//   25   49:invokeinterface #193 <Method void bh.c(View)>
		obj;
	//   26   54:aload_3         
		JVM INSTR monitorexit ;
	//   27   55:monitorexit     
		return;
	//   28   56:return          
		view;
	//   29   57:astore_1        
		obj;
	//   30   58:aload_3         
		JVM INSTR monitorexit ;
	//   31   59:monitorexit     
		throw view;
	//   32   60:aload_1         
	//   33   61:athrow          
	}

	private final void a(bl bl1)
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object b>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i1;
		String as[];
		as = a;
	//    5    9:getstatic       #49  <Field String[] a>
	//    6   12:astore          4
		i1 = as.length;
	//    7   14:aload           4
	//    8   16:arraylength     
	//    9   17:istore_3        
		int l = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
_L3:
		Object obj1;
		if(l >= i1)
			break MISSING_BLOCK_LABEL_137;
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:icmpge          137
		obj1 = ((Object) (as[l]));
	//   15   25:aload           4
	//   16   27:iload_2         
	//   17   28:aaload          
	//   18   29:astore          6
		obj1 = ((Object) ((WeakReference)f.get(obj1)));
	//   19   31:aload_0         
	//   20   32:getfield        #68  <Field Map f>
	//   21   35:aload           6
	//   22   37:invokeinterface #198 <Method Object Map.get(Object)>
	//   23   42:checkcast       #77  <Class WeakReference>
	//   24   45:astore          6
		if(obj1 == null) goto _L2; else goto _L1
	//   25   47:aload           6
	//   26   49:ifnull          130
_L1:
		View view = (View)((WeakReference) (obj1)).get();
	//   27   52:aload           6
	//   28   54:invokevirtual   #200 <Method Object WeakReference.get()>
	//   29   57:checkcast       #98  <Class View>
	//   30   60:astore          4
	//*  31   62:goto            65
_L4:
		if(view instanceof FrameLayout)
			break MISSING_BLOCK_LABEL_81;
	//   32   65:aload           4
	//   33   67:instanceof      #202 <Class FrameLayout>
	//   34   70:ifne            81
		bl1.l();
	//   35   73:aload_1         
	//   36   74:invokevirtual   #207 <Method void bl.l()>
		obj;
	//   37   77:aload           5
		JVM INSTR monitorexit ;
	//   38   79:monitorexit     
		return;
	//   39   80:return          
		obj1 = ((Object) (new by(this, view)));
	//   40   81:new             #209 <Class by>
	//   41   84:dup             
	//   42   85:aload_0         
	//   43   86:aload           4
	//   44   88:invokespecial   #212 <Method void by(bw, View)>
	//   45   91:astore          6
		if(bl1 instanceof bg)
	//*  46   93:aload_1         
	//*  47   94:instanceof      #188 <Class bg>
	//*  48   97:ifeq            112
		{
			bl1.b(view, ((bf) (obj1)));
	//   49  100:aload_1         
	//   50  101:aload           4
	//   51  103:aload           6
	//   52  105:invokevirtual   #215 <Method boolean bl.b(View, bf)>
	//   53  108:pop             
			break MISSING_BLOCK_LABEL_120;
	//   54  109:goto            120
		}
		bl1.a(view, ((bf) (obj1)));
	//   55  112:aload_1         
	//   56  113:aload           4
	//   57  115:aload           6
	//   58  117:invokevirtual   #218 <Method void com.google.android.gms.internal.ads.bl.a(View, bf)>
		obj;
	//   59  120:aload           5
		JVM INSTR monitorexit ;
	//   60  122:monitorexit     
		return;
	//   61  123:return          
		bl1;
	//   62  124:astore_1        
		obj;
	//   63  125:aload           5
		JVM INSTR monitorexit ;
	//   64  127:monitorexit     
		throw bl1;
	//   65  128:aload_1         
	//   66  129:athrow          
_L2:
		l++;
	//   67  130:iload_2         
	//   68  131:iconst_1        
	//   69  132:iadd            
	//   70  133:istore_2        
		  goto _L3
	//*  71  134:goto            20
		view = null;
	//   72  137:aconst_null     
	//   73  138:astore          4
		  goto _L4
	//*  74  140:goto            65
	}

	static void a(bw bw1, bl bl1)
	{
		bw1.a(bl1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #221 <Method void a(bl)>
	//    3    5:return          
	}

	static boolean a(bw bw1, String as[])
	{
		return bw1.a(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #225 <Method boolean a(String[])>
	//    3    5:ireturn         
	}

	private final boolean a(String as[])
	{
		int j1 = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int l = 0; l < j1; l++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          38
		{
			String s = as[l];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(d.get(((Object) (s))) != null)
	//*  12   15:aload_0         
	//*  13   16:getfield        #64  <Field Map d>
	//*  14   19:aload           4
	//*  15   21:invokeinterface #198 <Method Object Map.get(Object)>
	//*  16   26:ifnull          31
				return true;
	//   17   29:iconst_1        
	//   18   30:ireturn         
		}

	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
	//*  23   35:goto            5
		j1 = as.length;
	//   24   38:aload_1         
	//   25   39:arraylength     
	//   26   40:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  27   41:iconst_0        
	//*  28   42:istore_2        
	//*  29   43:iload_2         
	//*  30   44:iload_3         
	//*  31   45:icmpge          76
		{
			String s1 = as[i1];
	//   32   48:aload_1         
	//   33   49:iload_2         
	//   34   50:aaload          
	//   35   51:astore          4
			if(e.get(((Object) (s1))) != null)
	//*  36   53:aload_0         
	//*  37   54:getfield        #66  <Field Map e>
	//*  38   57:aload           4
	//*  39   59:invokeinterface #198 <Method Object Map.get(Object)>
	//*  40   64:ifnull          69
				return false;
	//   41   67:iconst_0        
	//   42   68:ireturn         
		}

	//   43   69:iload_2         
	//   44   70:iconst_1        
	//   45   71:iadd            
	//   46   72:istore_2        
	//*  47   73:goto            43
		return false;
	//   48   76:iconst_0        
	//   49   77:ireturn         
	}

	public final void a()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			h = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #227 <Field View h>
			g = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #175 <Field bh g>
			i = null;
	//   11   17:aload_0         
	//   12   18:aconst_null     
	//   13   19:putfield        #73  <Field Point i>
			j = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #75  <Field Point j>
		}
	//   17   27:aload_1         
	//   18   28:monitorexit     
		return;
	//   19   29:return          
		exception;
	//   20   30:astore_2        
		obj;
	//   21   31:aload_1         
		JVM INSTR monitorexit ;
	//   22   32:monitorexit     
		throw exception;
	//   23   33:aload_2         
	//   24   34:athrow          
	}

	public final void a(a a1)
	{
		Object obj1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object b>
	//    2    4:astore          5
		obj1;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore          4
		a(((View) (null)));
	//    7   12:aload_0         
	//    8   13:aconst_null     
	//    9   14:invokespecial   #230 <Method void a(View)>
		a1 = ((a) (com.google.android.gms.c.d.a(a1)));
	//   10   17:aload_1         
	//   11   18:invokestatic    #235 <Method Object d.a(a)>
	//   12   21:astore_1        
		if(a1 instanceof bl)
			break MISSING_BLOCK_LABEL_38;
	//   13   22:aload_1         
	//   14   23:instanceof      #204 <Class bl>
	//   15   26:ifne            38
		wx.e("Not an instance of native engine. This is most likely a transient error");
	//   16   29:ldc1            #237 <String "Not an instance of native engine. This is most likely a transient error">
	//   17   31:invokestatic    #242 <Method void wx.e(String)>
		obj1;
	//   18   34:aload           5
		JVM INSTR monitorexit ;
	//   19   36:monitorexit     
		return;
	//   20   37:return          
		Object obj2;
		obj2 = ((Object) ((bl)a1));
	//   21   38:aload_1         
	//   22   39:checkcast       #204 <Class bl>
	//   23   42:astore          6
		if(((bl) (obj2)).c())
			break MISSING_BLOCK_LABEL_61;
	//   24   44:aload           6
	//   25   46:invokevirtual   #244 <Method boolean bl.c()>
	//   26   49:ifne            61
		wx.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
	//   27   52:ldc1            #246 <String "Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.">
	//   28   54:invokestatic    #248 <Method void wx.c(String)>
		obj1;
	//   29   57:aload           5
		JVM INSTR monitorexit ;
	//   30   59:monitorexit     
		return;
	//   31   60:return          
		Object obj3 = ((Object) ((View)c.get()));
	//   32   61:aload_0         
	//   33   62:getfield        #108 <Field WeakReference c>
	//   34   65:invokevirtual   #200 <Method Object WeakReference.get()>
	//   35   68:checkcast       #98  <Class View>
	//   36   71:astore          7
		if(g == null || obj3 == null)
			break MISSING_BLOCK_LABEL_100;
	//   37   73:aload_0         
	//   38   74:getfield        #175 <Field bh g>
	//   39   77:ifnull          100
	//   40   80:aload           7
	//   41   82:ifnull          100
		g.b(((View) (obj3)), f);
	//   42   85:aload_0         
	//   43   86:getfield        #175 <Field bh g>
	//   44   89:aload           7
	//   45   91:aload_0         
	//   46   92:getfield        #68  <Field Map f>
	//   47   95:invokeinterface #251 <Method void bh.b(View, Map)>
		a1 = ((a) (b));
	//   48  100:aload_0         
	//   49  101:getfield        #59  <Field Object b>
	//   50  104:astore_1        
		a1;
	//   51  105:aload_1         
		JVM INSTR monitorenter ;
	//   52  106:monitorenter    
		boolean flag = g instanceof bl;
	//   53  107:aload_0         
	//   54  108:getfield        #175 <Field bh g>
	//   55  111:instanceof      #204 <Class bl>
	//   56  114:istore_3        
		int l = 0;
	//   57  115:iconst_0        
	//   58  116:istore_2        
		if(flag) goto _L2; else goto _L1
	//   59  117:iload_3         
	//   60  118:ifne            126
_L1:
		a1;
	//   61  121:aload_1         
		JVM INSTR monitorexit ;
	//   62  122:monitorexit     
		  goto _L3
	//*  63  123:goto            228
_L2:
		Object obj4;
		Object obj5;
		obj4 = ((Object) ((bl)g));
	//   64  126:aload_0         
	//   65  127:getfield        #175 <Field bh g>
	//   66  130:checkcast       #204 <Class bl>
	//   67  133:astore          8
		obj5 = ((Object) ((View)c.get()));
	//   68  135:aload_0         
	//   69  136:getfield        #108 <Field WeakReference c>
	//   70  139:invokevirtual   #200 <Method Object WeakReference.get()>
	//   71  142:checkcast       #98  <Class View>
	//   72  145:astore          9
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_226;
	//   73  147:aload           8
	//   74  149:ifnull          226
		if(((bl) (obj4)).p() == null || obj5 == null)
			break MISSING_BLOCK_LABEL_226;
	//   75  152:aload           8
	//   76  154:invokevirtual   #252 <Method android.content.Context bl.p()>
	//   77  157:ifnull          226
	//   78  160:aload           9
	//   79  162:ifnull          226
		if(!aw.E().a(((View) (obj5)).getContext()))
			break MISSING_BLOCK_LABEL_226;
	//   80  165:invokestatic    #256 <Method vt aw.E()>
	//   81  168:aload           9
	//   82  170:invokevirtual   #162 <Method android.content.Context View.getContext()>
	//   83  173:invokevirtual   #261 <Method boolean com.google.android.gms.internal.ads.vt.a(android.content.Context)>
	//   84  176:ifeq            226
		obj4 = ((Object) (((bl) (obj4)).r()));
	//   85  179:aload           8
	//   86  181:invokevirtual   #265 <Method vs bl.r()>
	//   87  184:astore          8
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_197;
	//   88  186:aload           8
	//   89  188:ifnull          197
		((vs) (obj4)).a(false);
	//   90  191:aload           8
	//   91  193:iconst_0        
	//   92  194:invokevirtual   #269 <Method void com.google.android.gms.internal.ads.vs.a(boolean)>
		obj5 = ((Object) ((bpu)k.get()));
	//   93  197:aload_0         
	//   94  198:getfield        #82  <Field WeakReference k>
	//   95  201:invokevirtual   #200 <Method Object WeakReference.get()>
	//   96  204:checkcast       #271 <Class bpu>
	//   97  207:astore          9
		if(obj5 == null || obj4 == null)
			break MISSING_BLOCK_LABEL_226;
	//   98  209:aload           9
	//   99  211:ifnull          226
	//  100  214:aload           8
	//  101  216:ifnull          226
		((bpu) (obj5)).b(((bpy) (obj4)));
	//  102  219:aload           9
	//  103  221:aload           8
	//  104  223:invokevirtual   #274 <Method void bpu.b(bpy)>
		a1;
	//  105  226:aload_1         
		JVM INSTR monitorexit ;
	//  106  227:monitorexit     
_L3:
		if((g instanceof bg) && ((bg)g).h())
	//* 107  228:aload_0         
	//* 108  229:getfield        #175 <Field bh g>
	//* 109  232:instanceof      #188 <Class bg>
	//* 110  235:ifeq            266
	//* 111  238:aload_0         
	//* 112  239:getfield        #175 <Field bh g>
	//* 113  242:checkcast       #188 <Class bg>
	//* 114  245:invokevirtual   #276 <Method boolean bg.h()>
	//* 115  248:ifeq            266
		{
			((bg)g).a(((bh) (obj2)));
	//  116  251:aload_0         
	//  117  252:getfield        #175 <Field bh g>
	//  118  255:checkcast       #188 <Class bg>
	//  119  258:aload           6
	//  120  260:invokevirtual   #279 <Method void com.google.android.gms.internal.ads.bg.a(bh)>
			break MISSING_BLOCK_LABEL_289;
	//  121  263:goto            289
		}
		g = ((bh) (obj2));
	//  122  266:aload_0         
	//  123  267:aload           6
	//  124  269:putfield        #175 <Field bh g>
		if(obj2 instanceof bg)
	//* 125  272:aload           6
	//* 126  274:instanceof      #188 <Class bg>
	//* 127  277:ifeq            289
			((bg)obj2).a(((bh) (null)));
	//  128  280:aload           6
	//  129  282:checkcast       #188 <Class bg>
	//  130  285:aconst_null     
	//  131  286:invokevirtual   #279 <Method void com.google.android.gms.internal.ads.bg.a(bh)>
_L8:
		if(l >= 2)
			break MISSING_BLOCK_LABEL_669;
	//  132  289:iload_2         
	//  133  290:iconst_2        
	//  134  291:icmpge          669
		a1 = ((a) ((new String[] {
			"1098", "3011"
		})[l]));
	//  135  294:iconst_2        
	//  136  295:anewarray       String[]
	//  137  298:dup             
	//  138  299:iconst_0        
	//  139  300:ldc1            #144 <String "1098">
	//  140  302:aastore         
	//  141  303:dup             
	//  142  304:iconst_1        
	//  143  305:ldc1            #150 <String "3011">
	//  144  307:aastore         
	//  145  308:iload_2         
	//  146  309:aaload          
	//  147  310:astore_1        
		a1 = ((a) ((WeakReference)f.get(((Object) (a1)))));
	//  148  311:aload_0         
	//  149  312:getfield        #68  <Field Map f>
	//  150  315:aload_1         
	//  151  316:invokeinterface #198 <Method Object Map.get(Object)>
	//  152  321:checkcast       #77  <Class WeakReference>
	//  153  324:astore_1        
		if(a1 == null) goto _L5; else goto _L4
	//  154  325:aload_1         
	//  155  326:ifnull          662
_L4:
		a1 = ((a) ((View)((WeakReference) (a1)).get()));
	//  156  329:aload_1         
	//  157  330:invokevirtual   #200 <Method Object WeakReference.get()>
	//  158  333:checkcast       #98  <Class View>
	//  159  336:astore_1        
	//* 160  337:goto            340
_L9:
		if(a1 != null)
			break MISSING_BLOCK_LABEL_353;
	//  161  340:aload_1         
	//  162  341:ifnonnull       353
		wx.e("Ad choices asset view is not provided.");
	//  163  344:ldc2            #281 <String "Ad choices asset view is not provided.">
	//  164  347:invokestatic    #242 <Method void wx.e(String)>
		break MISSING_BLOCK_LABEL_451;
	//  165  350:goto            451
		if(a1 instanceof ViewGroup)
	//* 166  353:aload_1         
	//* 167  354:instanceof      #283 <Class ViewGroup>
	//* 168  357:ifeq            366
			obj = ((Object) ((ViewGroup)a1));
	//  169  360:aload_1         
	//  170  361:checkcast       #283 <Class ViewGroup>
	//  171  364:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_451;
	//  172  366:aload           4
	//  173  368:ifnull          451
		h = ((bl) (obj2)).a(((android.view.View.OnClickListener) (this)), true);
	//  174  371:aload_0         
	//  175  372:aload           6
	//  176  374:aload_0         
	//  177  375:iconst_1        
	//  178  376:invokevirtual   #286 <Method View com.google.android.gms.internal.ads.bl.a(android.view.View$OnClickListener, boolean)>
	//  179  379:putfield        #227 <Field View h>
		if(h != null)
	//* 180  382:aload_0         
	//* 181  383:getfield        #227 <Field View h>
	//* 182  386:ifnull          451
		{
			f.put("1007", ((Object) (new WeakReference(((Object) (h))))));
	//  183  389:aload_0         
	//  184  390:getfield        #68  <Field Map f>
	//  185  393:ldc2            #288 <String "1007">
	//  186  396:new             #77  <Class WeakReference>
	//  187  399:dup             
	//  188  400:aload_0         
	//  189  401:getfield        #227 <Field View h>
	//  190  404:invokespecial   #80  <Method void WeakReference(Object)>
	//  191  407:invokeinterface #142 <Method Object Map.put(Object, Object)>
	//  192  412:pop             
			d.put("1007", ((Object) (new WeakReference(((Object) (h))))));
	//  193  413:aload_0         
	//  194  414:getfield        #64  <Field Map d>
	//  195  417:ldc2            #288 <String "1007">
	//  196  420:new             #77  <Class WeakReference>
	//  197  423:dup             
	//  198  424:aload_0         
	//  199  425:getfield        #227 <Field View h>
	//  200  428:invokespecial   #80  <Method void WeakReference(Object)>
	//  201  431:invokeinterface #142 <Method Object Map.put(Object, Object)>
	//  202  436:pop             
			((ViewGroup) (obj)).removeAllViews();
	//  203  437:aload           4
	//  204  439:invokevirtual   #291 <Method void ViewGroup.removeAllViews()>
			((ViewGroup) (obj)).addView(h);
	//  205  442:aload           4
	//  206  444:aload_0         
	//  207  445:getfield        #227 <Field View h>
	//  208  448:invokevirtual   #294 <Method void ViewGroup.addView(View)>
		}
		((bl) (obj2)).a(((View) (obj3)), d, e, ((android.view.View.OnTouchListener) (this)), ((android.view.View.OnClickListener) (this)));
	//  209  451:aload           6
	//  210  453:aload           7
	//  211  455:aload_0         
	//  212  456:getfield        #64  <Field Map d>
	//  213  459:aload_0         
	//  214  460:getfield        #66  <Field Map e>
	//  215  463:aload_0         
	//  216  464:aload_0         
	//  217  465:invokevirtual   #297 <Method void com.google.android.gms.internal.ads.bl.a(View, Map, Map, android.view.View$OnTouchListener, android.view.View$OnClickListener)>
		com.google.android.gms.internal.ads.xg.a.post(((Runnable) (new bx(this, ((bl) (obj2))))));
	//  218  468:getstatic       #302 <Field Handler com.google.android.gms.internal.ads.xg.a>
	//  219  471:new             #304 <Class bx>
	//  220  474:dup             
	//  221  475:aload_0         
	//  222  476:aload           6
	//  223  478:invokespecial   #306 <Method void bx(bw, bl)>
	//  224  481:invokevirtual   #312 <Method boolean Handler.post(Runnable)>
	//  225  484:pop             
		a(((View) (obj3)));
	//  226  485:aload_0         
	//  227  486:aload           7
	//  228  488:invokespecial   #230 <Method void a(View)>
		g.b(((View) (obj3)));
	//  229  491:aload_0         
	//  230  492:getfield        #175 <Field bh g>
	//  231  495:aload           7
	//  232  497:invokeinterface #314 <Method void bh.b(View)>
		obj2 = b;
	//  233  502:aload_0         
	//  234  503:getfield        #59  <Field Object b>
	//  235  506:astore          6
		obj2;
	//  236  508:aload           6
		JVM INSTR monitorenter ;
	//  237  510:monitorenter    
		if(g instanceof bl) goto _L7; else goto _L6
	//  238  511:aload_0         
	//  239  512:getfield        #175 <Field bh g>
	//  240  515:instanceof      #204 <Class bl>
	//  241  518:ifne            527
	//* 242  521:aload           6
	//* 243  523:monitorexit     
	//* 244  524:goto            639
_L7:
		obj3 = ((Object) ((bl)g));
	//  245  527:aload_0         
	//  246  528:getfield        #175 <Field bh g>
	//  247  531:checkcast       #204 <Class bl>
	//  248  534:astore          7
		obj4 = ((Object) ((View)c.get()));
	//  249  536:aload_0         
	//  250  537:getfield        #108 <Field WeakReference c>
	//  251  540:invokevirtual   #200 <Method Object WeakReference.get()>
	//  252  543:checkcast       #98  <Class View>
	//  253  546:astore          8
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_636;
	//  254  548:aload           7
	//  255  550:ifnull          636
		if(((bl) (obj3)).p() == null || obj4 == null)
			break MISSING_BLOCK_LABEL_636;
	//  256  553:aload           7
	//  257  555:invokevirtual   #252 <Method android.content.Context bl.p()>
	//  258  558:ifnull          636
	//  259  561:aload           8
	//  260  563:ifnull          636
		if(!aw.E().a(((View) (obj4)).getContext()))
			break MISSING_BLOCK_LABEL_636;
	//  261  566:invokestatic    #256 <Method vt aw.E()>
	//  262  569:aload           8
	//  263  571:invokevirtual   #162 <Method android.content.Context View.getContext()>
	//  264  574:invokevirtual   #261 <Method boolean com.google.android.gms.internal.ads.vt.a(android.content.Context)>
	//  265  577:ifeq            636
		obj = ((Object) ((bpu)k.get()));
	//  266  580:aload_0         
	//  267  581:getfield        #82  <Field WeakReference k>
	//  268  584:invokevirtual   #200 <Method Object WeakReference.get()>
	//  269  587:checkcast       #271 <Class bpu>
	//  270  590:astore          4
		a1 = ((a) (obj));
	//  271  592:aload           4
	//  272  594:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_627;
	//  273  595:aload           4
	//  274  597:ifnonnull       627
		a1 = ((a) (new bpu(((View) (obj4)).getContext(), ((View) (obj4)))));
	//  275  600:new             #271 <Class bpu>
	//  276  603:dup             
	//  277  604:aload           8
	//  278  606:invokevirtual   #162 <Method android.content.Context View.getContext()>
	//  279  609:aload           8
	//  280  611:invokespecial   #317 <Method void bpu(android.content.Context, View)>
	//  281  614:astore_1        
		k = new WeakReference(((Object) (a1)));
	//  282  615:aload_0         
	//  283  616:new             #77  <Class WeakReference>
	//  284  619:dup             
	//  285  620:aload_1         
	//  286  621:invokespecial   #80  <Method void WeakReference(Object)>
	//  287  624:putfield        #82  <Field WeakReference k>
		((bpu) (a1)).a(((bpy) (((bl) (obj3)).r())));
	//  288  627:aload_1         
	//  289  628:aload           7
	//  290  630:invokevirtual   #265 <Method vs bl.r()>
	//  291  633:invokevirtual   #319 <Method void com.google.android.gms.internal.ads.bpu.a(bpy)>
		obj2;
	//  292  636:aload           6
		JVM INSTR monitorexit ;
	//  293  638:monitorexit     
_L6:
		obj1;
	//  294  639:aload           5
		JVM INSTR monitorexit ;
	//  295  641:monitorexit     
		return;
	//  296  642:return          
		a1;
	//  297  643:astore_1        
		obj2;
	//  298  644:aload           6
		JVM INSTR monitorexit ;
	//  299  646:monitorexit     
		throw a1;
	//  300  647:aload_1         
	//  301  648:athrow          
		Exception exception;
		exception;
	//  302  649:astore          4
		a1;
	//  303  651:aload_1         
		JVM INSTR monitorexit ;
	//  304  652:monitorexit     
		throw exception;
	//  305  653:aload           4
	//  306  655:athrow          
		a1;
	//  307  656:astore_1        
		obj1;
	//  308  657:aload           5
		JVM INSTR monitorexit ;
	//  309  659:monitorexit     
		throw a1;
	//  310  660:aload_1         
	//  311  661:athrow          
_L5:
		l++;
	//  312  662:iload_2         
	//  313  663:iconst_1        
	//  314  664:iadd            
	//  315  665:istore_2        
		  goto _L8
	//* 316  666:goto            289
		a1 = null;
	//  317  669:aconst_null     
	//  318  670:astore_1        
		  goto _L9
	//* 319  671:goto            340
	}

	public final Map b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = f;
	//    2    2:aload_0         
	//    3    3:getfield        #68  <Field Map f>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return map;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final void b(a a1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			g.a((View)com.google.android.gms.c.d.a(a1));
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field bh g>
	//    7   11:aload_1         
	//    8   12:invokestatic    #235 <Method Object d.a(a)>
	//    9   15:checkcast       #98  <Class View>
	//   10   18:invokeinterface #321 <Method void com.google.android.gms.internal.ads.bh.a(View)>
		}
	//   11   23:aload_2         
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		a1;
	//   14   26:astore_1        
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		throw a1;
	//   17   29:aload_1         
	//   18   30:athrow          
	}

	public final View c()
	{
		return (View)c.get();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field WeakReference c>
	//    2    4:invokevirtual   #200 <Method Object WeakReference.get()>
	//    3    7:checkcast       #98  <Class View>
	//    4   10:areturn         
	}

	public final void onClick(View view)
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(g != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field bh g>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		View view1 = (View)c.get();
	//   11   17:aload_0         
	//   12   18:getfield        #108 <Field WeakReference c>
	//   13   21:invokevirtual   #200 <Method Object WeakReference.get()>
	//   14   24:checkcast       #98  <Class View>
	//   15   27:astore_3        
		if(view1 != null)
			break MISSING_BLOCK_LABEL_35;
	//   16   28:aload_3         
	//   17   29:ifnonnull       35
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return;
	//   20   34:return          
		Bundle bundle;
		bundle = new Bundle();
	//   21   35:new             #325 <Class Bundle>
	//   22   38:dup             
	//   23   39:invokespecial   #326 <Method void Bundle()>
	//   24   42:astore          4
		bundle.putFloat("x", a(i.x));
	//   25   44:aload           4
	//   26   46:ldc2            #328 <String "x">
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #73  <Field Point i>
	//   30   54:getfield        #331 <Field int Point.x>
	//   31   57:invokespecial   #333 <Method int a(int)>
	//   32   60:i2f             
	//   33   61:invokevirtual   #337 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("y", a(i.y));
	//   34   64:aload           4
	//   35   66:ldc2            #339 <String "y">
	//   36   69:aload_0         
	//   37   70:aload_0         
	//   38   71:getfield        #73  <Field Point i>
	//   39   74:getfield        #341 <Field int Point.y>
	//   40   77:invokespecial   #333 <Method int a(int)>
	//   41   80:i2f             
	//   42   81:invokevirtual   #337 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("start_x", a(j.x));
	//   43   84:aload           4
	//   44   86:ldc2            #343 <String "start_x">
	//   45   89:aload_0         
	//   46   90:aload_0         
	//   47   91:getfield        #75  <Field Point j>
	//   48   94:getfield        #331 <Field int Point.x>
	//   49   97:invokespecial   #333 <Method int a(int)>
	//   50  100:i2f             
	//   51  101:invokevirtual   #337 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("start_y", a(j.y));
	//   52  104:aload           4
	//   53  106:ldc2            #345 <String "start_y">
	//   54  109:aload_0         
	//   55  110:aload_0         
	//   56  111:getfield        #75  <Field Point j>
	//   57  114:getfield        #341 <Field int Point.y>
	//   58  117:invokespecial   #333 <Method int a(int)>
	//   59  120:i2f             
	//   60  121:invokevirtual   #337 <Method void Bundle.putFloat(String, float)>
		if(h == null || !((Object) (h)).equals(((Object) (view))))
			break MISSING_BLOCK_LABEL_219;
	//   61  124:aload_0         
	//   62  125:getfield        #227 <Field View h>
	//   63  128:ifnull          219
	//   64  131:aload_0         
	//   65  132:getfield        #227 <Field View h>
	//   66  135:aload_1         
	//   67  136:invokevirtual   #346 <Method boolean Object.equals(Object)>
	//   68  139:ifeq            219
		if(g instanceof bg)
	//*  69  142:aload_0         
	//*  70  143:getfield        #175 <Field bh g>
	//*  71  146:instanceof      #188 <Class bg>
	//*  72  149:ifeq            195
		{
			if(((bg)g).i() != null)
	//*  73  152:aload_0         
	//*  74  153:getfield        #175 <Field bh g>
	//*  75  156:checkcast       #188 <Class bg>
	//*  76  159:invokevirtual   #191 <Method bh bg.i()>
	//*  77  162:ifnull          236
				((bg)g).i().a(view, "1007", bundle, f, view1, false);
	//   78  165:aload_0         
	//   79  166:getfield        #175 <Field bh g>
	//   80  169:checkcast       #188 <Class bg>
	//   81  172:invokevirtual   #191 <Method bh bg.i()>
	//   82  175:aload_1         
	//   83  176:ldc2            #288 <String "1007">
	//   84  179:aload           4
	//   85  181:aload_0         
	//   86  182:getfield        #68  <Field Map f>
	//   87  185:aload_3         
	//   88  186:iconst_0        
	//   89  187:invokeinterface #349 <Method void com.google.android.gms.internal.ads.bh.a(View, String, Bundle, Map, View, boolean)>
			break MISSING_BLOCK_LABEL_236;
	//   90  192:goto            236
		}
		g.a(view, "1007", bundle, f, view1, false);
	//   91  195:aload_0         
	//   92  196:getfield        #175 <Field bh g>
	//   93  199:aload_1         
	//   94  200:ldc2            #288 <String "1007">
	//   95  203:aload           4
	//   96  205:aload_0         
	//   97  206:getfield        #68  <Field Map f>
	//   98  209:aload_3         
	//   99  210:iconst_0        
	//  100  211:invokeinterface #349 <Method void com.google.android.gms.internal.ads.bh.a(View, String, Bundle, Map, View, boolean)>
		break MISSING_BLOCK_LABEL_236;
	//  101  216:goto            236
		g.a(view, f, bundle, view1);
	//  102  219:aload_0         
	//  103  220:getfield        #175 <Field bh g>
	//  104  223:aload_1         
	//  105  224:aload_0         
	//  106  225:getfield        #68  <Field Map f>
	//  107  228:aload           4
	//  108  230:aload_3         
	//  109  231:invokeinterface #352 <Method void com.google.android.gms.internal.ads.bh.a(View, Map, Bundle, View)>
		obj;
	//  110  236:aload_2         
		JVM INSTR monitorexit ;
	//  111  237:monitorexit     
		return;
	//  112  238:return          
		view;
	//  113  239:astore_1        
		obj;
	//  114  240:aload_2         
		JVM INSTR monitorexit ;
	//  115  241:monitorexit     
		throw view;
	//  116  242:aload_1         
	//  117  243:athrow          
	}

	public final void onGlobalLayout()
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object b>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		View view;
		if(g == null)
			break MISSING_BLOCK_LABEL_43;
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field bh g>
	//    7   11:ifnull          43
		view = (View)c.get();
	//    8   14:aload_0         
	//    9   15:getfield        #108 <Field WeakReference c>
	//   10   18:invokevirtual   #200 <Method Object WeakReference.get()>
	//   11   21:checkcast       #98  <Class View>
	//   12   24:astore_2        
		if(view == null)
			break MISSING_BLOCK_LABEL_43;
	//   13   25:aload_2         
	//   14   26:ifnull          43
		g.c(view, f);
	//   15   29:aload_0         
	//   16   30:getfield        #175 <Field bh g>
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:getfield        #68  <Field Map f>
	//   20   38:invokeinterface #355 <Method void bh.c(View, Map)>
		obj;
	//   21   43:aload_1         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return;
	//   23   45:return          
		Exception exception;
		exception;
	//   24   46:astore_2        
		obj;
	//   25   47:aload_1         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		throw exception;
	//   27   49:aload_2         
	//   28   50:athrow          
	}

	public final void onScrollChanged()
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object b>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		View view;
		if(g == null)
			break MISSING_BLOCK_LABEL_43;
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field bh g>
	//    7   11:ifnull          43
		view = (View)c.get();
	//    8   14:aload_0         
	//    9   15:getfield        #108 <Field WeakReference c>
	//   10   18:invokevirtual   #200 <Method Object WeakReference.get()>
	//   11   21:checkcast       #98  <Class View>
	//   12   24:astore_2        
		if(view == null)
			break MISSING_BLOCK_LABEL_43;
	//   13   25:aload_2         
	//   14   26:ifnull          43
		g.c(view, f);
	//   15   29:aload_0         
	//   16   30:getfield        #175 <Field bh g>
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:getfield        #68  <Field Map f>
	//   20   38:invokeinterface #355 <Method void bh.c(View, Map)>
		obj;
	//   21   43:aload_1         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return;
	//   23   45:return          
		Exception exception;
		exception;
	//   24   46:astore_2        
		obj;
	//   25   47:aload_1         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		throw exception;
	//   27   49:aload_2         
	//   28   50:athrow          
	}

	public final boolean onTouch(View view, MotionEvent motionevent)
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(g != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field bh g>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		View view1 = (View)c.get();
	//   12   18:aload_0         
	//   13   19:getfield        #108 <Field WeakReference c>
	//   14   22:invokevirtual   #200 <Method Object WeakReference.get()>
	//   15   25:checkcast       #98  <Class View>
	//   16   28:astore          7
		if(view1 != null)
			break MISSING_BLOCK_LABEL_39;
	//   17   30:aload           7
	//   18   32:ifnonnull       39
		view;
	//   19   35:aload_1         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		float f1;
		int ai[];
		ai = new int[2];
	//   23   39:iconst_2        
	//   24   40:newarray        int[]
	//   25   42:astore          8
		view1.getLocationOnScreen(ai);
	//   26   44:aload           7
	//   27   46:aload           8
	//   28   48:invokevirtual   #362 <Method void View.getLocationOnScreen(int[])>
		f1 = motionevent.getRawX();
	//   29   51:aload_2         
	//   30   52:invokevirtual   #368 <Method float MotionEvent.getRawX()>
	//   31   55:fstore_3        
		float f2 = ai[0];
	//   32   56:aload           8
	//   33   58:iconst_0        
	//   34   59:iaload          
	//   35   60:i2f             
	//   36   61:fstore          4
		float f3 = motionevent.getRawY();
	//   37   63:aload_2         
	//   38   64:invokevirtual   #371 <Method float MotionEvent.getRawY()>
	//   39   67:fstore          5
		float f4 = ai[1];
	//   40   69:aload           8
	//   41   71:iconst_1        
	//   42   72:iaload          
	//   43   73:i2f             
	//   44   74:fstore          6
		Point point = new Point((int)(f1 - f2), (int)(f3 - f4));
	//   45   76:new             #70  <Class Point>
	//   46   79:dup             
	//   47   80:fload_3         
	//   48   81:fload           4
	//   49   83:fsub            
	//   50   84:f2i             
	//   51   85:fload           5
	//   52   87:fload           6
	//   53   89:fsub            
	//   54   90:f2i             
	//   55   91:invokespecial   #374 <Method void Point(int, int)>
	//   56   94:astore          7
		i = point;
	//   57   96:aload_0         
	//   58   97:aload           7
	//   59   99:putfield        #73  <Field Point i>
		if(motionevent.getAction() == 0)
	//*  60  102:aload_2         
	//*  61  103:invokevirtual   #378 <Method int MotionEvent.getAction()>
	//*  62  106:ifne            115
			j = point;
	//   63  109:aload_0         
	//   64  110:aload           7
	//   65  112:putfield        #75  <Field Point j>
		motionevent = MotionEvent.obtain(motionevent);
	//   66  115:aload_2         
	//   67  116:invokestatic    #382 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//   68  119:astore_2        
		motionevent.setLocation(point.x, point.y);
	//   69  120:aload_2         
	//   70  121:aload           7
	//   71  123:getfield        #331 <Field int Point.x>
	//   72  126:i2f             
	//   73  127:aload           7
	//   74  129:getfield        #341 <Field int Point.y>
	//   75  132:i2f             
	//   76  133:invokevirtual   #386 <Method void MotionEvent.setLocation(float, float)>
		g.a(motionevent);
	//   77  136:aload_0         
	//   78  137:getfield        #175 <Field bh g>
	//   79  140:aload_2         
	//   80  141:invokeinterface #389 <Method void com.google.android.gms.internal.ads.bh.a(MotionEvent)>
		motionevent.recycle();
	//   81  146:aload_2         
	//   82  147:invokevirtual   #392 <Method void MotionEvent.recycle()>
		view;
	//   83  150:aload_1         
		JVM INSTR monitorexit ;
	//   84  151:monitorexit     
		return false;
	//   85  152:iconst_0        
	//   86  153:ireturn         
		motionevent;
	//   87  154:astore_2        
		view;
	//   88  155:aload_1         
		JVM INSTR monitorexit ;
	//   89  156:monitorexit     
		throw motionevent;
	//   90  157:aload_2         
	//   91  158:athrow          
	}

	static final String a[] = {
		"2011", "1009", "3010"
	};
	private final Object b = new Object();
	private final WeakReference c;
	private final Map d = new HashMap();
	private final Map e = new HashMap();
	private final Map f = new HashMap();
	private bh g;
	private View h;
	private Point i;
	private Point j;
	private WeakReference k;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #43  <String "2011">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #45  <String "1009">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #47  <String "3010">
	//   13   18:aastore         
	//   14   19:putstatic       #49  <Field String[] a>
	//*  15   22:return          
	}
}
