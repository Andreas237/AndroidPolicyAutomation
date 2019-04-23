// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			PopupMenu

class PopupMenu$2
	implements android.widget.OnDismissListener
{

	public void onDismiss()
	{
		if(mOnDismissListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field PopupMenu this$0>
	//*   2    4:getfield        #25  <Field PopupMenu$OnDismissListener PopupMenu.mOnDismissListener>
	//*   3    7:ifnull          26
			mOnDismissListener.onDismiss(PopupMenu.this);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field PopupMenu this$0>
	//    6   14:getfield        #25  <Field PopupMenu$OnDismissListener PopupMenu.mOnDismissListener>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field PopupMenu this$0>
	//    9   21:invokeinterface #29  <Method void PopupMenu$OnDismissListener.onDismiss(PopupMenu)>
	//   10   26:return          
	}

	final PopupMenu this$0;

	PopupMenu$2()
	{
		this$0 = PopupMenu.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field PopupMenu this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
