// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener, PopupMenu

class PopupMenu$3 extends ForwardingListener
{

	public ShowableListMenu getPopup()
	{
		return ((ShowableListMenu) (mPopup.getPopup()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PopupMenu this$0>
	//    2    4:getfield        #25  <Field MenuPopupHelper PopupMenu.mPopup>
	//    3    7:invokevirtual   #30  <Method android.support.v7.view.menu.MenuPopup MenuPopupHelper.getPopup()>
	//    4   10:areturn         
	}

	protected boolean onForwardingStarted()
	{
		show();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PopupMenu this$0>
	//    2    4:invokevirtual   #36  <Method void PopupMenu.show()>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	protected boolean onForwardingStopped()
	{
		dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PopupMenu this$0>
	//    2    4:invokevirtual   #40  <Method void PopupMenu.dismiss()>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	final PopupMenu this$0;

	PopupMenu$3(View view)
	{
		this$0 = PopupMenu.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field PopupMenu this$0>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void ForwardingListener(View)>
	//    6   10:return          
	}
}
