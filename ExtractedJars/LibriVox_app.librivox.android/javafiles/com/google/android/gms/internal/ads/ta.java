// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			sz, tb, p, bwk, 
//			m, sy

final class ta
	implements Callable
{

	ta(sz sz1, Context context)
	{
		b = sz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field sz b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final Object call()
	{
		Object obj;
label0:
		{
			obj = ((Object) ((tb)sz.a(b).get(((Object) (a)))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field sz b>
	//    2    4:invokestatic    #27  <Method WeakHashMap sz.a(sz)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Context a>
	//    5   11:invokevirtual   #33  <Method Object WeakHashMap.get(Object)>
	//    6   14:checkcast       #35  <Class tb>
	//    7   17:astore          4
			if(obj != null)
	//*   8   19:aload           4
	//*   9   21:ifnull          98
			{
				long l = ((tb) (obj)).a;
	//   10   24:aload           4
	//   11   26:getfield        #38  <Field long tb.a>
	//   12   29:lstore_2        
				com.google.android.gms.internal.ads.e e1 = p.aX;
	//   13   30:getstatic       #44  <Field com.google.android.gms.internal.ads.e p.aX>
	//   14   33:astore          5
				boolean flag;
				if(l + ((Long)com.google.android.gms.internal.ads.bwk.e().a(e1)).longValue() < aw.l().a())
	//*  15   35:lload_2         
	//*  16   36:invokestatic    #50  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  17   39:aload           5
	//*  18   41:invokevirtual   #55  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  19   44:checkcast       #57  <Class Long>
	//*  20   47:invokevirtual   #61  <Method long Long.longValue()>
	//*  21   50:ladd            
	//*  22   51:invokestatic    #67  <Method e aw.l()>
	//*  23   54:invokeinterface #71  <Method long e.a()>
	//*  24   59:lcmp            
	//*  25   60:ifge            68
					flag = true;
	//   26   63:iconst_1        
	//   27   64:istore_1        
				else
	//*  28   65:goto            70
					flag = false;
	//   29   68:iconst_0        
	//   30   69:istore_1        
				if(!flag)
	//*  31   70:iload_1         
	//*  32   71:ifne            98
				{
					obj = ((Object) ((new sy(a, ((tb) (obj)).b)).a()));
	//   33   74:new             #73  <Class sy>
	//   34   77:dup             
	//   35   78:aload_0         
	//   36   79:getfield        #16  <Field Context a>
	//   37   82:aload           4
	//   38   84:getfield        #76  <Field sw tb.b>
	//   39   87:invokespecial   #79  <Method void sy(Context, sw)>
	//   40   90:invokevirtual   #82  <Method sw sy.a()>
	//   41   93:astore          4
					break label0;
	//   42   95:goto            114
				}
			}
			obj = ((Object) ((new sy(a)).a()));
	//   43   98:new             #73  <Class sy>
	//   44  101:dup             
	//   45  102:aload_0         
	//   46  103:getfield        #16  <Field Context a>
	//   47  106:invokespecial   #85  <Method void sy(Context)>
	//   48  109:invokevirtual   #82  <Method sw sy.a()>
	//   49  112:astore          4
		}
		sz.a(b).put(((Object) (a)), ((Object) (new tb(b, ((sw) (obj))))));
	//   50  114:aload_0         
	//   51  115:getfield        #14  <Field sz b>
	//   52  118:invokestatic    #27  <Method WeakHashMap sz.a(sz)>
	//   53  121:aload_0         
	//   54  122:getfield        #16  <Field Context a>
	//   55  125:new             #35  <Class tb>
	//   56  128:dup             
	//   57  129:aload_0         
	//   58  130:getfield        #14  <Field sz b>
	//   59  133:aload           4
	//   60  135:invokespecial   #88  <Method void tb(sz, sw)>
	//   61  138:invokevirtual   #92  <Method Object WeakHashMap.put(Object, Object)>
	//   62  141:pop             
		return obj;
	//   63  142:aload           4
	//   64  144:areturn         
	}

	private final Context a;
	private final sz b;
}
