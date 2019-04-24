// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			ShareActionProvider, ActivityChooserModel

class ShareActionProvider$ShareMenuItemOnMenuItemClickListener
	implements android.view.MenuItem.OnMenuItemClickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		menuitem = ((MenuItem) (ActivityChooserModel.get(mContext, mShareHistoryFileName).chooseActivity(menuitem.getItemId())));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ShareActionProvider this$0>
	//    2    4:getfield        #25  <Field Context ShareActionProvider.mContext>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field ShareActionProvider this$0>
	//    5   11:getfield        #29  <Field String ShareActionProvider.mShareHistoryFileName>
	//    6   14:invokestatic    #35  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
	//    7   17:aload_1         
	//    8   18:invokeinterface #41  <Method int MenuItem.getItemId()>
	//    9   23:invokevirtual   #45  <Method Intent ActivityChooserModel.chooseActivity(int)>
	//   10   26:astore_1        
		if(menuitem != null)
	//*  11   27:aload_1         
	//*  12   28:ifnull          73
		{
			String s = ((Intent) (menuitem)).getAction();
	//   13   31:aload_1         
	//   14   32:invokevirtual   #51  <Method String Intent.getAction()>
	//   15   35:astore_2        
			if("android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s))))
	//*  16   36:ldc1            #53  <String "android.intent.action.SEND">
	//*  17   38:aload_2         
	//*  18   39:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  19   42:ifne            54
	//*  20   45:ldc1            #61  <String "android.intent.action.SEND_MULTIPLE">
	//*  21   47:aload_2         
	//*  22   48:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  23   51:ifeq            62
				updateIntent(((Intent) (menuitem)));
	//   24   54:aload_0         
	//   25   55:getfield        #15  <Field ShareActionProvider this$0>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #65  <Method void ShareActionProvider.updateIntent(Intent)>
			mContext.startActivity(((Intent) (menuitem)));
	//   28   62:aload_0         
	//   29   63:getfield        #15  <Field ShareActionProvider this$0>
	//   30   66:getfield        #25  <Field Context ShareActionProvider.mContext>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #70  <Method void Context.startActivity(Intent)>
		}
		return true;
	//   33   73:iconst_1        
	//   34   74:ireturn         
	}

	final ShareActionProvider this$0;

	ShareActionProvider$ShareMenuItemOnMenuItemClickListener()
	{
		this$0 = ShareActionProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ShareActionProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
