// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			Toolbar

class Toolbar$2
	implements Runnable
{

	public void run()
	{
		showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Toolbar this$0>
	//    2    4:invokevirtual   #23  <Method boolean Toolbar.showOverflowMenu()>
	//    3    7:pop             
	//    4    8:return          
	}

	final Toolbar this$0;

	Toolbar$2()
	{
		this$0 = Toolbar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Toolbar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
