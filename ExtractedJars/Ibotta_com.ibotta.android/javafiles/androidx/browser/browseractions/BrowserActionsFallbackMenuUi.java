// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionItem, BrowserActionsFallbackMenuDialog

class BrowserActionsFallbackMenuUi
	implements android.widget.AdapterView.OnItemClickListener
{
	static interface BrowserActionsFallMenuUiListener
	{

		public abstract void onMenuShown(View view);
	}


	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (((BrowserActionItem)mMenuItems.get(i)).getAction()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mMenuItems>
	//    2    4:iload_3         
	//    3    5:invokeinterface #27  <Method Object List.get(int)>
	//    4   10:checkcast       #29  <Class BrowserActionItem>
	//    5   13:invokevirtual   #33  <Method PendingIntent BrowserActionItem.getAction()>
	//    6   16:astore_1        
		try
		{
			((PendingIntent) (adapterview)).send();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #39  <Method void PendingIntent.send()>
			mBrowserActionsDialog.dismiss();
	//    9   21:aload_0         
	//   10   22:getfield        #41  <Field BrowserActionsFallbackMenuDialog mBrowserActionsDialog>
	//   11   25:invokevirtual   #46  <Method void BrowserActionsFallbackMenuDialog.dismiss()>
			return;
	//   12   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(AdapterView adapterview)
	//*  13   29:astore_1        
		{
			Log.e("BrowserActionskMenuUi", "Failed to send custom item action", ((Throwable) (adapterview)));
	//   14   30:ldc1            #48  <String "BrowserActionskMenuUi">
	//   15   32:ldc1            #50  <String "Failed to send custom item action">
	//   16   34:aload_1         
	//   17   35:invokestatic    #56  <Method int Log.e(String, String, Throwable)>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
	private final List mMenuItems;
}
