// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			DropDownListView

private class DropDownListView$ResolveHoverRunnable
	implements Runnable
{

	public void cancel()
	{
		DropDownListView.access$102(DropDownListView.this, ((DropDownListView$ResolveHoverRunnable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DropDownListView this$0>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #27  <Method DropDownListView$ResolveHoverRunnable DropDownListView.access$102(DropDownListView, DropDownListView$ResolveHoverRunnable)>
	//    4    8:pop             
		removeCallbacks(((Runnable) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field DropDownListView this$0>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #31  <Method boolean DropDownListView.removeCallbacks(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void post()
	{
		DropDownListView.this.post(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DropDownListView this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #34  <Method boolean DropDownListView.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void run()
	{
		DropDownListView.access$102(DropDownListView.this, ((DropDownListView$ResolveHoverRunnable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DropDownListView this$0>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #27  <Method DropDownListView$ResolveHoverRunnable DropDownListView.access$102(DropDownListView, DropDownListView$ResolveHoverRunnable)>
	//    4    8:pop             
		drawableStateChanged();
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field DropDownListView this$0>
	//    7   13:invokevirtual   #38  <Method void DropDownListView.drawableStateChanged()>
	//    8   16:return          
	}

	final DropDownListView this$0;

	private DropDownListView$ResolveHoverRunnable()
	{
		this$0 = DropDownListView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DropDownListView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	DropDownListView$ResolveHoverRunnable(DropDownListView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void DropDownListView$ResolveHoverRunnable(DropDownListView)>
	//    3    5:return          
	}
}
