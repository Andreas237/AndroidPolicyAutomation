// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

class ActionMenuPresenter$OpenOverflowRunnable
	implements Runnable
{

	public void run()
	{
		if(ActionMenuPresenter.access$300(ActionMenuPresenter.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ActionMenuPresenter this$0>
	//*   2    4:invokestatic    #28  <Method MenuBuilder ActionMenuPresenter.access$300(ActionMenuPresenter)>
	//*   3    7:ifnull          20
			ActionMenuPresenter.access$400(ActionMenuPresenter.this).changeMenuMode();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field ActionMenuPresenter this$0>
	//    6   14:invokestatic    #31  <Method MenuBuilder ActionMenuPresenter.access$400(ActionMenuPresenter)>
	//    7   17:invokevirtual   #36  <Method void MenuBuilder.changeMenuMode()>
		View view = (View)ActionMenuPresenter.access$500(ActionMenuPresenter.this);
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field ActionMenuPresenter this$0>
	//   10   24:invokestatic    #40  <Method android.support.v7.view.menu.MenuView ActionMenuPresenter.access$500(ActionMenuPresenter)>
	//   11   27:checkcast       #42  <Class View>
	//   12   30:astore_1        
		if(view != null && view.getWindowToken() != null && mPopup.tryShow())
	//*  13   31:aload_1         
	//*  14   32:ifnull          63
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #46  <Method android.os.IBinder View.getWindowToken()>
	//*  17   39:ifnull          63
	//*  18   42:aload_0         
	//*  19   43:getfield        #22  <Field ActionMenuPresenter$OverflowPopup mPopup>
	//*  20   46:invokevirtual   #52  <Method boolean ActionMenuPresenter$OverflowPopup.tryShow()>
	//*  21   49:ifeq            63
			mOverflowPopup = mPopup;
	//   22   52:aload_0         
	//   23   53:getfield        #17  <Field ActionMenuPresenter this$0>
	//   24   56:aload_0         
	//   25   57:getfield        #22  <Field ActionMenuPresenter$OverflowPopup mPopup>
	//   26   60:putfield        #55  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
		mPostedOpenRunnable = null;
	//   27   63:aload_0         
	//   28   64:getfield        #17  <Field ActionMenuPresenter this$0>
	//   29   67:aconst_null     
	//   30   68:putfield        #59  <Field ActionMenuPresenter$OpenOverflowRunnable ActionMenuPresenter.mPostedOpenRunnable>
	//   31   71:return          
	}

	private ActionMenuPresenter.OverflowPopup mPopup;
	final ActionMenuPresenter this$0;

	public ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter.OverflowPopup overflowpopup)
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActionMenuPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mPopup = overflowpopup;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ActionMenuPresenter$OverflowPopup mPopup>
	//    8   14:return          
	}
}
