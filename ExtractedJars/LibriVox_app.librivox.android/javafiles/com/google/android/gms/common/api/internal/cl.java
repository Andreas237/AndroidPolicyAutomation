// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.d.h;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			cj, j, bu, t, 
//			y, q, aa

public final class cl extends cj
{

	public cl(q q, h h1)
	{
		super(4, h1);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void cj(int, h)>
		b = q;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #13  <Field q b>
	//    7   11:return          
	}

	public final volatile void a(Status status)
	{
		super.a(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void cj.a(Status)>
	//    3    5:return          
	}

	public final volatile void a(aa aa, boolean flag)
	{
	//    0    0:return          
	}

	public final volatile void a(RuntimeException runtimeexception)
	{
		super.a(runtimeexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void cj.a(RuntimeException)>
	//    3    5:return          
	}

	public final Feature[] b(j j1)
	{
		j1 = ((j) ((bu)j1.c().get(((Object) (b)))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method Map j.c()>
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field q b>
	//    4    8:invokeinterface #35  <Method Object Map.get(Object)>
	//    5   13:checkcast       #37  <Class bu>
	//    6   16:astore_1        
		if(j1 == null)
	//*   7   17:aload_1         
	//*   8   18:ifnonnull       23
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		else
			return ((bu) (j1)).a.b();
	//   11   23:aload_1         
	//   12   24:getfield        #40  <Field t bu.a>
	//   13   27:invokevirtual   #45  <Method Feature[] t.b()>
	//   14   30:areturn         
	}

	public final boolean c(j j1)
	{
		j1 = ((j) ((bu)j1.c().get(((Object) (b)))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method Map j.c()>
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field q b>
	//    4    8:invokeinterface #35  <Method Object Map.get(Object)>
	//    5   13:checkcast       #37  <Class bu>
	//    6   16:astore_1        
		return j1 != null && ((bu) (j1)).a.c();
	//    7   17:aload_1         
	//    8   18:ifnull          33
	//    9   21:aload_1         
	//   10   22:getfield        #40  <Field t bu.a>
	//   11   25:invokevirtual   #49  <Method boolean t.c()>
	//   12   28:ifeq            33
	//   13   31:iconst_1        
	//   14   32:ireturn         
	//   15   33:iconst_0        
	//   16   34:ireturn         
	}

	public final void d(j j1)
	{
		bu bu1 = (bu)j1.c().remove(((Object) (b)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method Map j.c()>
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field q b>
	//    4    8:invokeinterface #54  <Method Object Map.remove(Object)>
	//    5   13:checkcast       #37  <Class bu>
	//    6   16:astore_2        
		if(bu1 != null)
	//*   7   17:aload_2         
	//*   8   18:ifnull          44
		{
			bu1.b.a(((com.google.android.gms.common.api.c) (j1.b())), a);
	//    9   21:aload_2         
	//   10   22:getfield        #57  <Field y bu.b>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #60  <Method com.google.android.gms.common.api.l j.b()>
	//   13   29:aload_0         
	//   14   30:getfield        #63  <Field h a>
	//   15   33:invokevirtual   #68  <Method void y.a(com.google.android.gms.common.api.c, h)>
			bu1.a.a();
	//   16   36:aload_2         
	//   17   37:getfield        #40  <Field t bu.a>
	//   18   40:invokevirtual   #71  <Method void t.a()>
			return;
	//   19   43:return          
		} else
		{
			a.b(((Object) (Boolean.valueOf(false))));
	//   20   44:aload_0         
	//   21   45:getfield        #63  <Field h a>
	//   22   48:iconst_0        
	//   23   49:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
	//   24   52:invokevirtual   #82  <Method boolean h.b(Object)>
	//   25   55:pop             
			return;
	//   26   56:return          
		}
	}

	private final q b;
}
