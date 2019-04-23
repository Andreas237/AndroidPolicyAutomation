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
	//*   1    1:getfield        #12  <Field CascadingMenuPopup this$0>
	//*   2    4:invokevirtual   #23  <Method boolean CascadingMenuPopup.isShowing()>
	//*   3    7:ifeq            119
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field CascadingMenuPopup this$0>
	//*   6   14:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
	//*   7   17:invokeinterface #33  <Method int List.size()>
	//*   8   22:ifle            119
	//*   9   25:aload_0         
	//*  10   26:getfield        #12  <Field CascadingMenuPopup this$0>
	//*  11   29:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
	//*  12   32:iconst_0        
	//*  13   33:invokeinterface #37  <Method Object List.get(int)>
	//*  14   38:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  15   41:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  16   44:invokevirtual   #48  <Method boolean MenuPopupWindow.isModal()>
	//*  17   47:ifne            119
		{
			View view = mShownAnchorView;
	//   18   50:aload_0         
	//   19   51:getfield        #12  <Field CascadingMenuPopup this$0>
	//   20   54:getfield        #52  <Field View CascadingMenuPopup.mShownAnchorView>
	//   21   57:astore_1        
			if(view != null && view.isShown())
	//*  22   58:aload_1         
	//*  23   59:ifnull          112
	//*  24   62:aload_1         
	//*  25   63:invokevirtual   #57  <Method boolean View.isShown()>
	//*  26   66:ifne            72
	//*  27   69:goto            112
			{
				for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); ((scadingMenuInfo)iterator.next()).window.show());
	//   28   72:aload_0         
	//   29   73:getfield        #12  <Field CascadingMenuPopup this$0>
	//   30   76:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
	//   31   79:invokeinterface #61  <Method Iterator List.iterator()>
	//   32   84:astore_1        
	//   33   85:aload_1         
	//   34   86:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   35   91:ifeq            119
	//   36   94:aload_1         
	//   37   95:invokeinterface #70  <Method Object Iterator.next()>
	//   38  100:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   39  103:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   40  106:invokevirtual   #73  <Method void MenuPopupWindow.show()>
			} else
	//*  41  109:goto            85
			{
				dismiss();
	//   42  112:aload_0         
	//   43  113:getfield        #12  <Field CascadingMenuPopup this$0>
	//   44  116:invokevirtual   #76  <Method void CascadingMenuPopup.dismiss()>
			}
		}
	//   45  119:return          
	}

	final CascadingMenuPopup this$0;

	CascadingMenuPopup$1()
	{
		this$0 = CascadingMenuPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field CascadingMenuPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
