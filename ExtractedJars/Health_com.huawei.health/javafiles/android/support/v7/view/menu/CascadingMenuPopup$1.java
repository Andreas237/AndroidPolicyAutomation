// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.widget.MenuPopupWindow;
import android.view.View;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.view.menu:
//			CascadingMenuPopup

class CascadingMenuPopup$1
	implements android.view.obalLayoutListener
{

	public void onGlobalLayout()
	{
		if(isShowing() && mShowingMenus.size() > 0 && !((scadingMenuInfo)mShowingMenus.get(0)).window.isModal())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field CascadingMenuPopup this$0>
	//*   2    4:invokevirtual   #23  <Method boolean CascadingMenuPopup.isShowing()>
	//*   3    7:ifeq            117
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field CascadingMenuPopup this$0>
	//*   6   14:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
	//*   7   17:invokeinterface #33  <Method int List.size()>
	//*   8   22:ifle            117
	//*   9   25:aload_0         
	//*  10   26:getfield        #14  <Field CascadingMenuPopup this$0>
	//*  11   29:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
	//*  12   32:iconst_0        
	//*  13   33:invokeinterface #37  <Method Object List.get(int)>
	//*  14   38:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  15   41:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  16   44:invokevirtual   #48  <Method boolean MenuPopupWindow.isModal()>
	//*  17   47:ifne            117
		{
			View view = mShownAnchorView;
	//   18   50:aload_0         
	//   19   51:getfield        #14  <Field CascadingMenuPopup this$0>
	//   20   54:getfield        #52  <Field View CascadingMenuPopup.mShownAnchorView>
	//   21   57:astore_1        
			if(view == null || !view.isShown())
	//*  22   58:aload_1         
	//*  23   59:ifnull          69
	//*  24   62:aload_1         
	//*  25   63:invokevirtual   #57  <Method boolean View.isShown()>
	//*  26   66:ifne            77
			{
				dismiss();
	//   27   69:aload_0         
	//   28   70:getfield        #14  <Field CascadingMenuPopup this$0>
	//   29   73:invokevirtual   #60  <Method void CascadingMenuPopup.dismiss()>
				return;
	//   30   76:return          
			}
			for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); ((scadingMenuInfo)iterator.next()).window.show());
	//   31   77:aload_0         
	//   32   78:getfield        #14  <Field CascadingMenuPopup this$0>
	//   33   81:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
	//   34   84:invokeinterface #64  <Method Iterator List.iterator()>
	//   35   89:astore_1        
	//   36   90:aload_1         
	//   37   91:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   38   96:ifeq            117
	//   39   99:aload_1         
	//   40  100:invokeinterface #73  <Method Object Iterator.next()>
	//   41  105:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   42  108:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   43  111:invokevirtual   #76  <Method void MenuPopupWindow.show()>
		}
	//*  44  114:goto            90
	//   45  117:return          
	}

	final CascadingMenuPopup this$0;

	CascadingMenuPopup$1()
	{
		this$0 = CascadingMenuPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CascadingMenuPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
