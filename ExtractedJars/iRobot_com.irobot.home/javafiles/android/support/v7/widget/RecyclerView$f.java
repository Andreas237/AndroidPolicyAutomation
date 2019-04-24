// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

private class RecyclerView$f
	implements b
{

	public void a(RecyclerView$u recyclerview$u)
	{
		recyclerview$u.a(true);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #25  <Method void RecyclerView$u.a(boolean)>
		if(recyclerview$u.h != null && recyclerview$u.i == null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #29  <Field RecyclerView$u RecyclerView$u.h>
	//*   5    9:ifnull          24
	//*   6   12:aload_1         
	//*   7   13:getfield        #32  <Field RecyclerView$u RecyclerView$u.i>
	//*   8   16:ifnonnull       24
			recyclerview$u.h = null;
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:putfield        #29  <Field RecyclerView$u RecyclerView$u.h>
		recyclerview$u.i = null;
	//   12   24:aload_1         
	//   13   25:aconst_null     
	//   14   26:putfield        #32  <Field RecyclerView$u RecyclerView$u.i>
		if(!RecyclerView$u.c(recyclerview$u) && !a.a(recyclerview$u.a) && recyclerview$u.r())
	//*  15   29:aload_1         
	//*  16   30:invokestatic    #36  <Method boolean RecyclerView$u.c(RecyclerView$u)>
	//*  17   33:ifne            69
	//*  18   36:aload_0         
	//*  19   37:getfield        #15  <Field RecyclerView a>
	//*  20   40:aload_1         
	//*  21   41:getfield        #39  <Field android.view.View RecyclerView$u.a>
	//*  22   44:invokevirtual   #42  <Method boolean RecyclerView.a(android.view.View)>
	//*  23   47:ifne            69
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #46  <Method boolean RecyclerView$u.r()>
	//*  26   54:ifeq            69
			a.removeDetachedView(recyclerview$u.a, false);
	//   27   57:aload_0         
	//   28   58:getfield        #15  <Field RecyclerView a>
	//   29   61:aload_1         
	//   30   62:getfield        #39  <Field android.view.View RecyclerView$u.a>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #50  <Method void RecyclerView.removeDetachedView(android.view.View, boolean)>
	//   33   69:return          
	}

	final RecyclerView a;

	RecyclerView$f(RecyclerView recyclerview)
	{
		a = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field RecyclerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
