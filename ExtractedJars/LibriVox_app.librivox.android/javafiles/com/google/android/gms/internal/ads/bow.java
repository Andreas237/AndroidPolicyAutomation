// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bpe, p, hw, bwk, 
//			m, box, wd, afn, 
//			bpd, bpf, bpj, zzbbi, 
//			zzwf, bqi

public final class bow
	implements bpe
{

	public bow(Context context, zzbbi zzbbi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void Object()>
	//    6   12:putfield        #27  <Field Object a>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class WeakHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void WeakHashMap()>
	//   11   23:putfield        #32  <Field WeakHashMap b>
	//   12   26:aload_0         
	//   13   27:new             #34  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #35  <Method void ArrayList()>
	//   16   34:putfield        #37  <Field ArrayList c>
		d = context.getApplicationContext();
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//   20   42:putfield        #45  <Field Context d>
		e = zzbbi;
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:putfield        #47  <Field zzbbi e>
		context = context.getApplicationContext();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//   26   54:astore_1        
		e e1 = p.a;
	//   27   55:getstatic       #52  <Field e p.a>
	//   28   58:astore_3        
		f = new hw(context, zzbbi, (String)bwk.e().a(e1));
	//   29   59:aload_0         
	//   30   60:new             #54  <Class hw>
	//   31   63:dup             
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:invokestatic    #59  <Method m bwk.e()>
	//   35   69:aload_3         
	//   36   70:invokevirtual   #64  <Method Object m.a(e)>
	//   37   73:checkcast       #66  <Class String>
	//   38   76:invokespecial   #69  <Method void hw(Context, zzbbi, String)>
	//   39   79:putfield        #71  <Field hw f>
	//   40   82:return          
	}

	private final boolean e(wd wd1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		wd1 = ((wd) ((box)b.get(((Object) (wd1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field WeakHashMap b>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #77  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #79  <Class box>
	//   10   18:astore_1        
		if(wd1 == null) goto _L2; else goto _L1
	//   11   19:aload_1         
	//   12   20:ifnull          44
_L1:
		if(!((box) (wd1)).c()) goto _L2; else goto _L3
	//   13   23:aload_1         
	//   14   24:invokevirtual   #82  <Method boolean box.c()>
	//   15   27:ifeq            44
_L3:
		boolean flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
	//*  18   32:goto            35
_L5:
		obj;
	//   19   35:aload_3         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return flag;
	//   21   37:iload_2         
	//   22   38:ireturn         
		wd1;
	//   23   39:astore_1        
		obj;
	//   24   40:aload_3         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		throw wd1;
	//   26   42:aload_1         
	//   27   43:athrow          
_L2:
		flag = false;
	//   28   44:iconst_0        
	//   29   45:istore_2        
		if(true) goto _L5; else goto _L4
	//   30   46:goto            35
_L4:
	}

	public final void a(box box1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!box1.c())
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #82  <Method boolean box.c()>
	//*   7   11:ifne            72
		{
			c.remove(((Object) (box1)));
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field ArrayList c>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #87  <Method boolean ArrayList.remove(Object)>
	//   12   22:pop             
			Iterator iterator = b.entrySet().iterator();
	//   13   23:aload_0         
	//   14   24:getfield        #32  <Field WeakHashMap b>
	//   15   27:invokevirtual   #91  <Method Set WeakHashMap.entrySet()>
	//   16   30:invokeinterface #97  <Method Iterator Set.iterator()>
	//   17   35:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   18   36:aload_3         
	//   19   37:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   20   42:ifeq            72
				if(((java.util.Map.Entry)iterator.next()).getValue() == box1)
	//*  21   45:aload_3         
	//*  22   46:invokeinterface #106 <Method Object Iterator.next()>
	//*  23   51:checkcast       #108 <Class java.util.Map$Entry>
	//*  24   54:invokeinterface #111 <Method Object java.util.Map$Entry.getValue()>
	//*  25   59:aload_1         
	//*  26   60:if_acmpne       36
					iterator.remove();
	//   27   63:aload_3         
	//   28   64:invokeinterface #113 <Method void Iterator.remove()>
			} while(true);
	//   29   69:goto            36
		}
		obj;
	//   30   72:aload_2         
		JVM INSTR monitorexit ;
	//   31   73:monitorexit     
		return;
	//   32   74:return          
		box1;
	//   33   75:astore_1        
		obj;
	//   34   76:aload_2         
		JVM INSTR monitorexit ;
	//   35   77:monitorexit     
		throw box1;
	//   36   78:aload_1         
	//   37   79:athrow          
	}

	public final void a(wd wd1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		wd1 = ((wd) ((box)b.get(((Object) (wd1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field WeakHashMap b>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #77  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #79  <Class box>
	//   10   18:astore_1        
		if(wd1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((box) (wd1)).b();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #116 <Method void box.b()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		wd1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw wd1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final void a(zzwf zzwf, wd wd1)
	{
		a(zzwf, wd1, wd1.b.getView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_2         
	//    4    4:getfield        #122 <Field afn wd.b>
	//    5    7:invokeinterface #128 <Method View afn.getView()>
	//    6   12:invokevirtual   #131 <Method void a(zzwf, wd, View)>
	//    7   15:return          
	}

	public final void a(zzwf zzwf, wd wd1, View view)
	{
		a(zzwf, wd1, ((bqi) (new bpd(view, wd1))), ((afn) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #133 <Class bpd>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:aload_2         
	//    7    9:invokespecial   #136 <Method void bpd(View, wd)>
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #139 <Method void a(zzwf, wd, bqi, afn)>
	//   10   16:return          
	}

	public final void a(zzwf zzwf, wd wd1, View view, afn afn1)
	{
		a(zzwf, wd1, ((bqi) (new bpd(view, wd1))), afn1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #133 <Class bpd>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:aload_2         
	//    7    9:invokespecial   #136 <Method void bpd(View, wd)>
	//    8   12:aload           4
	//    9   14:invokevirtual   #139 <Method void a(zzwf, wd, bqi, afn)>
	//   10   17:return          
	}

	public final void a(zzwf zzwf, wd wd1, bqi bqi, afn afn1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(e(wd1))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:invokespecial   #142 <Method boolean e(wd)>
	//*   8   14:ifeq            32
		{
			zzwf = ((zzwf) ((box)b.get(((Object) (wd1)))));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field WeakHashMap b>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #77  <Method Object WeakHashMap.get(Object)>
	//   13   25:checkcast       #79  <Class box>
	//   14   28:astore_1        
			break MISSING_BLOCK_LABEL_75;
	//   15   29:goto            75
		}
		zzwf = ((zzwf) (new box(d, zzwf, wd1, e, bqi)));
	//   16   32:new             #79  <Class box>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:getfield        #45  <Field Context d>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:getfield        #47  <Field zzbbi e>
	//   24   46:aload_3         
	//   25   47:invokespecial   #145 <Method void box(Context, zzwf, wd, zzbbi, bqi)>
	//   26   50:astore_1        
		((box) (zzwf)).a(((bpe) (this)));
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:invokevirtual   #148 <Method void box.a(bpe)>
		b.put(((Object) (wd1)), ((Object) (zzwf)));
	//   30   56:aload_0         
	//   31   57:getfield        #32  <Field WeakHashMap b>
	//   32   60:aload_2         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #152 <Method Object WeakHashMap.put(Object, Object)>
	//   35   65:pop             
		c.add(((Object) (zzwf)));
	//   36   66:aload_0         
	//   37   67:getfield        #37  <Field ArrayList c>
	//   38   70:aload_1         
	//   39   71:invokevirtual   #155 <Method boolean ArrayList.add(Object)>
	//   40   74:pop             
		if(afn1 == null)
			break MISSING_BLOCK_LABEL_97;
	//   41   75:aload           4
	//   42   77:ifnull          97
		((box) (zzwf)).a(((bpt) (new bpf(((box) (zzwf)), afn1))));
	//   43   80:aload_1         
	//   44   81:new             #157 <Class bpf>
	//   45   84:dup             
	//   46   85:aload_1         
	//   47   86:aload           4
	//   48   88:invokespecial   #160 <Method void bpf(box, afn)>
	//   49   91:invokevirtual   #163 <Method void box.a(bpt)>
		break MISSING_BLOCK_LABEL_117;
	//   50   94:goto            117
		((box) (zzwf)).a(((bpt) (new bpj(((box) (zzwf)), f, d))));
	//   51   97:aload_1         
	//   52   98:new             #165 <Class bpj>
	//   53  101:dup             
	//   54  102:aload_1         
	//   55  103:aload_0         
	//   56  104:getfield        #71  <Field hw f>
	//   57  107:aload_0         
	//   58  108:getfield        #45  <Field Context d>
	//   59  111:invokespecial   #168 <Method void bpj(box, hw, Context)>
	//   60  114:invokevirtual   #163 <Method void box.a(bpt)>
		obj;
	//   61  117:aload           5
		JVM INSTR monitorexit ;
	//   62  119:monitorexit     
		return;
	//   63  120:return          
		zzwf;
	//   64  121:astore_1        
		obj;
	//   65  122:aload           5
		JVM INSTR monitorexit ;
	//   66  124:monitorexit     
		throw zzwf;
	//   67  125:aload_1         
	//   68  126:athrow          
	}

	public final void b(wd wd1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		wd1 = ((wd) ((box)b.get(((Object) (wd1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field WeakHashMap b>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #77  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #79  <Class box>
	//   10   18:astore_1        
		if(wd1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((box) (wd1)).d();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #170 <Method void box.d()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		wd1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw wd1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final void c(wd wd1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		wd1 = ((wd) ((box)b.get(((Object) (wd1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field WeakHashMap b>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #77  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #79  <Class box>
	//   10   18:astore_1        
		if(wd1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((box) (wd1)).e();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #172 <Method void box.e()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		wd1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw wd1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final void d(wd wd1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		wd1 = ((wd) ((box)b.get(((Object) (wd1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field WeakHashMap b>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #77  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #79  <Class box>
	//   10   18:astore_1        
		if(wd1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((box) (wd1)).f();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #174 <Method void box.f()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		wd1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw wd1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	private final Object a = new Object();
	private final WeakHashMap b = new WeakHashMap();
	private final ArrayList c = new ArrayList();
	private final Context d;
	private final zzbbi e;
	private final hw f;
}
