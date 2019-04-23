// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;


// Referenced classes of package android.support.v7.view.menu:
//			MenuPopupHelper

class MenuPopupHelper$1
	implements android.widget.issListener
{

	public void onDismiss()
	{
		MenuPopupHelper.this.onDismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MenuPopupHelper this$0>
	//    2    4:invokevirtual   #21  <Method void MenuPopupHelper.onDismiss()>
	//    3    7:return          
	}

	final MenuPopupHelper this$0;

	MenuPopupHelper$1()
	{
		this$0 = MenuPopupHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MenuPopupHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
