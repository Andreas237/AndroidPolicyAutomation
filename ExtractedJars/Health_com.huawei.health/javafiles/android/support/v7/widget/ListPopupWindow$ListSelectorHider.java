// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow

class ListPopupWindow$ListSelectorHider
	implements Runnable
{

	public void run()
	{
		clearListSelection();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ListPopupWindow this$0>
	//    2    4:invokevirtual   #23  <Method void ListPopupWindow.clearListSelection()>
	//    3    7:return          
	}

	final ListPopupWindow this$0;

	ListPopupWindow$ListSelectorHider()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
