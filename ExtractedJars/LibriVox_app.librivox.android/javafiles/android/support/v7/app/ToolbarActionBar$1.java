// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			ToolbarActionBar

class ToolbarActionBar$1
	implements Runnable
{

	public void run()
	{
		populateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ToolbarActionBar this$0>
	//    2    4:invokevirtual   #22  <Method void ToolbarActionBar.populateOptionsMenu()>
	//    3    7:return          
	}

	final ToolbarActionBar this$0;

	ToolbarActionBar$1()
	{
		this$0 = ToolbarActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ToolbarActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
