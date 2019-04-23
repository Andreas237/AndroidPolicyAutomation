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
		DropDownListView dropdownlistview = DropDownListView.this;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DropDownListView this$0>
	//    2    4:astore_1        
		dropdownlistview.mResolveHoverRunnable = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #24  <Field DropDownListView$ResolveHoverRunnable DropDownListView.mResolveHoverRunnable>
		dropdownlistview.removeCallbacks(((Runnable) (this)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #28  <Method boolean DropDownListView.removeCallbacks(Runnable)>
	//    9   15:pop             
	//   10   16:return          
	}

	public void post()
	{
		DropDownListView.this.post(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DropDownListView this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method boolean DropDownListView.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void run()
	{
		DropDownListView dropdownlistview = DropDownListView.this;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DropDownListView this$0>
	//    2    4:astore_1        
		dropdownlistview.mResolveHoverRunnable = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #24  <Field DropDownListView$ResolveHoverRunnable DropDownListView.mResolveHoverRunnable>
		dropdownlistview.drawableStateChanged();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #35  <Method void DropDownListView.drawableStateChanged()>
	//    8   14:return          
	}

	final DropDownListView this$0;

	DropDownListView$ResolveHoverRunnable()
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
}
