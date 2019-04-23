// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ViewDataBinding

class ViewDataBinding$8
	implements android.view.eCallback
{

	public void doFrame(long l)
	{
		ViewDataBinding.access$100(ViewDataBinding.this).run();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ViewDataBinding this$0>
	//    2    4:invokestatic    #26  <Method Runnable ViewDataBinding.access$100(ViewDataBinding)>
	//    3    7:invokeinterface #31  <Method void Runnable.run()>
	//    4   12:return          
	}

	final ViewDataBinding this$0;

	ViewDataBinding$8()
	{
		this$0 = ViewDataBinding.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ViewDataBinding this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
