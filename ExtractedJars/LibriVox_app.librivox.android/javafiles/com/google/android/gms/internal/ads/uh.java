// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			uf, bzg, tu

public final class uh
	implements c
{

	public uh(Context context, tu tu)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object c>
	//    7   15:aload_0         
	//    8   16:new             #24  <Class uf>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #27  <Method void uf(com.google.android.gms.ads.reward.d)>
	//   12   24:putfield        #29  <Field uf d>
		Object obj = ((Object) (tu));
	//   13   27:aload_2         
	//   14   28:astore_3        
		if(tu == null)
	//*  15   29:aload_2         
	//*  16   30:ifnonnull       41
			obj = ((Object) (new bzg()));
	//   17   33:new             #31  <Class bzg>
	//   18   36:dup             
	//   19   37:invokespecial   #32  <Method void bzg()>
	//   20   40:astore_3        
		a = ((tu) (obj));
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #34  <Field tu a>
		b = context.getApplicationContext();
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #40  <Method Context Context.getApplicationContext()>
	//   27   51:putfield        #42  <Field Context b>
	//   28   54:return          
	}

	private final tu a;
	private final Context b;
	private final Object c = new Object();
	private final uf d = new uf(((com.google.android.gms.ads.reward.d) (null)));
}
