// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$5
	implements android.support.v7.widget.achListener
{

	public void onAttachedFromWindow()
	{
	//    0    0:return          
	}

	public void onDetachedFromWindow()
	{
		dismissPopups();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field AppCompatDelegateImpl this$0>
	//    2    4:invokevirtual   #23  <Method void AppCompatDelegateImpl.dismissPopups()>
	//    3    7:return          
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$5()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
