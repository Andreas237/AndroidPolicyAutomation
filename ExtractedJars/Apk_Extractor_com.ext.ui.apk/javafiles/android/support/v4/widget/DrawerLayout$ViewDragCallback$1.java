// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

class DrawerLayout$ViewDragCallback$1
	implements Runnable
{

	public void run()
	{
		peekDrawer();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DrawerLayout$ViewDragCallback this$1>
	//    2    4:invokevirtual   #25  <Method void DrawerLayout$ViewDragCallback.peekDrawer()>
	//    3    7:return          
	}

	final DrawerLayout.ViewDragCallback this$1;

	DrawerLayout$ViewDragCallback$1()
	{
		this$1 = DrawerLayout.ViewDragCallback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DrawerLayout$ViewDragCallback this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
