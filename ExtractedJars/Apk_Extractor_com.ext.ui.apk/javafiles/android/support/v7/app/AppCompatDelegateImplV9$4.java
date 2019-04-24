// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$4
	implements android.support.v7.widget.hListener
{

	public void onAttachedFromWindow()
	{
	//    0    0:return          
	}

	public void onDetachedFromWindow()
	{
		dismissPopups();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppCompatDelegateImplV9 this$0>
	//    2    4:invokevirtual   #26  <Method void AppCompatDelegateImplV9.dismissPopups()>
	//    3    7:return          
	}

	final AppCompatDelegateImplV9 this$0;

	AppCompatDelegateImplV9$4()
	{
		this$0 = AppCompatDelegateImplV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppCompatDelegateImplV9 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
