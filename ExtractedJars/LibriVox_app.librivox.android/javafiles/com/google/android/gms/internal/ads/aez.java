// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aeq, add, wx

public final class aez extends aeq
{

	public aez(add add1)
	{
		super(add1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void aeq(add)>
	//    3    5:return          
	}

	public final boolean a(String s)
	{
		add add1 = (add)c.get();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field WeakReference c>
	//    2    4:invokevirtual   #22  <Method Object WeakReference.get()>
	//    3    7:checkcast       #24  <Class add>
	//    4   10:astore_2        
		if(add1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          27
			add1.a(((aeq)this).b(s), ((aeq) (this)));
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #28  <Method String aeq.b(String)>
	//   11   21:aload_0         
	//   12   22:invokeinterface #31  <Method void add.a(String, aeq)>
		wx.e("VideoStreamNoopCache is doing nothing.");
	//   13   27:ldc1            #33  <String "VideoStreamNoopCache is doing nothing.">
	//   14   29:invokestatic    #39  <Method void wx.e(String)>
		((aeq)this).a(s, ((aeq)this).b(s), "noop", "Noop cache is a noop.");
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #28  <Method String aeq.b(String)>
	//   20   39:ldc1            #41  <String "noop">
	//   21   41:ldc1            #43  <String "Noop cache is a noop.">
	//   22   43:invokevirtual   #46  <Method void aeq.a(String, String, String, String)>
		return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
	}

	public final void b()
	{
	//    0    0:return          
	}
}
