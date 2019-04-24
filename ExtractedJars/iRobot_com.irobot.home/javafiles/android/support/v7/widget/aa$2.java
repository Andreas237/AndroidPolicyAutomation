// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			aa, RecyclerView

class aa$2 extends lerView.l
{

	public void a(RecyclerView recyclerview, int i, int j)
	{
		a.a(recyclerview.computeHorizontalScrollOffset(), recyclerview.computeVerticalScrollOffset());
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field aa a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method int RecyclerView.computeHorizontalScrollOffset()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #26  <Method int RecyclerView.computeVerticalScrollOffset()>
	//    6   12:invokevirtual   #29  <Method void aa.a(int, int)>
	//    7   15:return          
	}

	final aa a;

	aa$2(aa aa1)
	{
		a = aa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field aa a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void RecyclerView$l()>
	//    5    9:return          
	}
}
