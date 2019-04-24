// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$2
	implements Runnable
{

	public void run()
	{
		if(a.x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field RecyclerView a>
	//*   2    4:getfield        #23  <Field RecyclerView$e RecyclerView.x>
	//*   3    7:ifnull          20
			a.x.a();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field RecyclerView a>
	//    6   14:getfield        #23  <Field RecyclerView$e RecyclerView.x>
	//    7   17:invokevirtual   #27  <Method void RecyclerView$e.a()>
		a.E = false;
	//    8   20:aload_0         
	//    9   21:getfield        #14  <Field RecyclerView a>
	//   10   24:iconst_0        
	//   11   25:putfield        #31  <Field boolean RecyclerView.E>
	//   12   28:return          
	}

	final RecyclerView a;

	RecyclerView$2(RecyclerView recyclerview)
	{
		a = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RecyclerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
