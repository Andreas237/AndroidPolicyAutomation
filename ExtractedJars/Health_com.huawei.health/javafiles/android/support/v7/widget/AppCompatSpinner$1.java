// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener, AppCompatSpinner

class AppCompatSpinner$1 extends ForwardingListener
{

	public ShowableListMenu getPopup()
	{
		return ((ShowableListMenu) (val$popup));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AppCompatSpinner$DropdownPopup val$popup>
	//    2    4:areturn         
	}

	public boolean onForwardingStarted()
	{
		if(!mPopup.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field AppCompatSpinner this$0>
	//*   2    4:getfield        #29  <Field AppCompatSpinner$DropdownPopup AppCompatSpinner.mPopup>
	//*   3    7:invokevirtual   #34  <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
	//*   4   10:ifne            23
			mPopup.show();
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field AppCompatSpinner this$0>
	//    7   17:getfield        #29  <Field AppCompatSpinner$DropdownPopup AppCompatSpinner.mPopup>
	//    8   20:invokevirtual   #38  <Method void AppCompatSpinner$DropdownPopup.show()>
		return true;
	//    9   23:iconst_1        
	//   10   24:ireturn         
	}

	final AppCompatSpinner this$0;
	final opdownPopup val$popup;

	AppCompatSpinner$1(opdownPopup opdownpopup)
	{
		this$0 = final_appcompatspinner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppCompatSpinner this$0>
		val$popup = opdownpopup;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field AppCompatSpinner$DropdownPopup val$popup>
		super(View.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #21  <Method void ForwardingListener(View)>
	//    9   15:return          
	}
}
