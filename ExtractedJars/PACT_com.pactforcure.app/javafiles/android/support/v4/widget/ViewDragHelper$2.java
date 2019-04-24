// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			ViewDragHelper

class ViewDragHelper$2
	implements Runnable
{

	public void run()
	{
		setDragState(0);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ViewDragHelper this$0>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #23  <Method void ViewDragHelper.setDragState(int)>
	//    4    8:return          
	}

	final ViewDragHelper this$0;

	ViewDragHelper$2()
	{
		this$0 = ViewDragHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ViewDragHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
