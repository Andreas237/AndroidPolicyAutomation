// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			ViewPager

class ViewPager$3
	implements Runnable
{

	public void run()
	{
		setScrollState(0);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ViewPager this$0>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #23  <Method void ViewPager.setScrollState(int)>
		populate();
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field ViewPager this$0>
	//    6   12:invokevirtual   #26  <Method void ViewPager.populate()>
	//    7   15:return          
	}

	final ViewPager this$0;

	ViewPager$3()
	{
		this$0 = ViewPager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ViewPager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
