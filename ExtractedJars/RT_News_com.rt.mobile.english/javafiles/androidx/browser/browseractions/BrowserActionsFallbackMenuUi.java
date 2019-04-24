// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.v4.widget.TextViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import java.util.List;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionsFallbackMenuView, BrowserActionsFallbackMenuAdapter, BrowserActionsFallbackMenuDialog, BrowserActionItem

class BrowserActionsFallbackMenuUi
	implements android.widget.AdapterView.OnItemClickListener
{
	static interface BrowserActionsFallMenuUiListener
	{

		public abstract void onMenuShown(View view);
	}


	BrowserActionsFallbackMenuUi(Context context, Uri uri, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Context mContext>
		mUri = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field Uri mUri>
		mMenuItems = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field List mMenuItems>
	//   11   19:return          
	}

	private BrowserActionsFallbackMenuView initMenuView(View view)
	{
		BrowserActionsFallbackMenuView browseractionsfallbackmenuview = (BrowserActionsFallbackMenuView)view.findViewById(android.support.customtabs.R.id.browser_actions_menu_view);
	//    0    0:aload_1         
	//    1    1:getstatic       #54  <Field int android.support.customtabs.R$id.browser_actions_menu_view>
	//    2    4:invokevirtual   #60  <Method View View.findViewById(int)>
	//    3    7:checkcast       #62  <Class BrowserActionsFallbackMenuView>
	//    4   10:astore_2        
		final TextView urlTextView = (TextView)view.findViewById(android.support.customtabs.R.id.browser_actions_header_text);
	//    5   11:aload_1         
	//    6   12:getstatic       #65  <Field int android.support.customtabs.R$id.browser_actions_header_text>
	//    7   15:invokevirtual   #60  <Method View View.findViewById(int)>
	//    8   18:checkcast       #67  <Class TextView>
	//    9   21:astore_3        
		urlTextView.setText(((CharSequence) (mUri.toString())));
	//   10   22:aload_3         
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field Uri mUri>
	//   13   27:invokevirtual   #73  <Method String Uri.toString()>
	//   14   30:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
		urlTextView.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				if(TextViewCompat.getMaxLines(urlTextView) == 0x7fffffff)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field TextView val$urlTextView>
			//*   2    4:invokestatic    #33  <Method int TextViewCompat.getMaxLines(TextView)>
			//*   3    7:ldc1            #34  <Int 0x7fffffff>
			//*   4    9:icmpne          31
				{
					urlTextView.setMaxLines(1);
			//    5   12:aload_0         
			//    6   13:getfield        #21  <Field TextView val$urlTextView>
			//    7   16:iconst_1        
			//    8   17:invokevirtual   #40  <Method void TextView.setMaxLines(int)>
					urlTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
			//    9   20:aload_0         
			//   10   21:getfield        #21  <Field TextView val$urlTextView>
			//   11   24:getstatic       #46  <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
			//   12   27:invokevirtual   #50  <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
					return;
			//   13   30:return          
				} else
				{
					urlTextView.setMaxLines(0x7fffffff);
			//   14   31:aload_0         
			//   15   32:getfield        #21  <Field TextView val$urlTextView>
			//   16   35:ldc1            #34  <Int 0x7fffffff>
			//   17   37:invokevirtual   #40  <Method void TextView.setMaxLines(int)>
					urlTextView.setEllipsize(((android.text.TextUtils.TruncateAt) (null)));
			//   18   40:aload_0         
			//   19   41:getfield        #21  <Field TextView val$urlTextView>
			//   20   44:aconst_null     
			//   21   45:invokevirtual   #50  <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
					return;
			//   22   48:return          
				}
			}

			final BrowserActionsFallbackMenuUi this$0;
			final TextView val$urlTextView;

			
			{
				this$0 = BrowserActionsFallbackMenuUi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BrowserActionsFallbackMenuUi this$0>
				urlTextView = textview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TextView val$urlTextView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   15   33:aload_3         
	//   16   34:new             #10  <Class BrowserActionsFallbackMenuUi$2>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:invokespecial   #80  <Method void BrowserActionsFallbackMenuUi$2(BrowserActionsFallbackMenuUi, TextView)>
	//   21   43:invokevirtual   #84  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		view = ((View) ((ListView)view.findViewById(android.support.customtabs.R.id.browser_actions_menu_items)));
	//   22   46:aload_1         
	//   23   47:getstatic       #87  <Field int android.support.customtabs.R$id.browser_actions_menu_items>
	//   24   50:invokevirtual   #60  <Method View View.findViewById(int)>
	//   25   53:checkcast       #89  <Class ListView>
	//   26   56:astore_1        
		((ListView) (view)).setAdapter(((android.widget.ListAdapter) (new BrowserActionsFallbackMenuAdapter(mMenuItems, mContext))));
	//   27   57:aload_1         
	//   28   58:new             #91  <Class BrowserActionsFallbackMenuAdapter>
	//   29   61:dup             
	//   30   62:aload_0         
	//   31   63:getfield        #39  <Field List mMenuItems>
	//   32   66:aload_0         
	//   33   67:getfield        #35  <Field Context mContext>
	//   34   70:invokespecial   #94  <Method void BrowserActionsFallbackMenuAdapter(List, Context)>
	//   35   73:invokevirtual   #98  <Method void ListView.setAdapter(android.widget.ListAdapter)>
		((ListView) (view)).setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   36   76:aload_1         
	//   37   77:aload_0         
	//   38   78:invokevirtual   #102 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		return browseractionsfallbackmenuview;
	//   39   81:aload_2         
	//   40   82:areturn         
	}

	public void displayMenu()
	{
		final View view = LayoutInflater.from(mContext).inflate(android.support.customtabs.R.layout.browser_actions_context_menu_page, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Context mContext>
	//    2    4:invokestatic    #109 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:getstatic       #114 <Field int android.support.customtabs.R$layout.browser_actions_context_menu_page>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #118 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    6   14:astore_1        
		mBrowserActionsDialog = new BrowserActionsFallbackMenuDialog(mContext, ((View) (initMenuView(view))));
	//    7   15:aload_0         
	//    8   16:new             #120 <Class BrowserActionsFallbackMenuDialog>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field Context mContext>
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #122 <Method BrowserActionsFallbackMenuView initMenuView(View)>
	//   15   29:invokespecial   #125 <Method void BrowserActionsFallbackMenuDialog(Context, View)>
	//   16   32:putfield        #127 <Field BrowserActionsFallbackMenuDialog mBrowserActionsDialog>
		mBrowserActionsDialog.setContentView(view);
	//   17   35:aload_0         
	//   18   36:getfield        #127 <Field BrowserActionsFallbackMenuDialog mBrowserActionsDialog>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #131 <Method void BrowserActionsFallbackMenuDialog.setContentView(View)>
		if(mMenuUiListener != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #46  <Field BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener mMenuUiListener>
	//*  23   47:ifnull          66
			mBrowserActionsDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

				public void onShow(DialogInterface dialoginterface)
				{
					mMenuUiListener.onMenuShown(view);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BrowserActionsFallbackMenuUi this$0>
				//    2    4:invokestatic    #30  <Method BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener BrowserActionsFallbackMenuUi.access$000(BrowserActionsFallbackMenuUi)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field View val$view>
				//    5   11:invokeinterface #36  <Method void BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener.onMenuShown(View)>
				//    6   16:return          
				}

				final BrowserActionsFallbackMenuUi this$0;
				final View val$view;

			
			{
				this$0 = BrowserActionsFallbackMenuUi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BrowserActionsFallbackMenuUi this$0>
				view = view1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   24   50:aload_0         
	//   25   51:getfield        #127 <Field BrowserActionsFallbackMenuDialog mBrowserActionsDialog>
	//   26   54:new             #8   <Class BrowserActionsFallbackMenuUi$1>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokespecial   #134 <Method void BrowserActionsFallbackMenuUi$1(BrowserActionsFallbackMenuUi, View)>
	//   31   63:invokevirtual   #138 <Method void BrowserActionsFallbackMenuDialog.setOnShowListener(android.content.DialogInterface$OnShowListener)>
		mBrowserActionsDialog.show();
	//   32   66:aload_0         
	//   33   67:getfield        #127 <Field BrowserActionsFallbackMenuDialog mBrowserActionsDialog>
	//   34   70:invokevirtual   #141 <Method void BrowserActionsFallbackMenuDialog.show()>
	//   35   73:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (((BrowserActionItem)mMenuItems.get(i)).getAction()));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List mMenuItems>
	//    2    4:iload_3         
	//    3    5:invokeinterface #151 <Method Object List.get(int)>
	//    4   10:checkcast       #153 <Class BrowserActionItem>
	//    5   13:invokevirtual   #157 <Method PendingIntent BrowserActionItem.getAction()>
	//    6   16:astore_1        
		try
		{
			((PendingIntent) (adapterview)).send();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #162 <Method void PendingIntent.send()>
			mBrowserActionsDialog.dismiss();
	//    9   21:aload_0         
	//   10   22:getfield        #127 <Field BrowserActionsFallbackMenuDialog mBrowserActionsDialog>
	//   11   25:invokevirtual   #165 <Method void BrowserActionsFallbackMenuDialog.dismiss()>
			return;
	//   12   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(AdapterView adapterview)
	//*  13   29:astore_1        
		{
			Log.e("BrowserActionskMenuUi", "Failed to send custom item action", ((Throwable) (adapterview)));
	//   14   30:ldc1            #17  <String "BrowserActionskMenuUi">
	//   15   32:ldc1            #167 <String "Failed to send custom item action">
	//   16   34:aload_1         
	//   17   35:invokestatic    #173 <Method int Log.e(String, String, Throwable)>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	void setMenuUiListener(BrowserActionsFallMenuUiListener browseractionsfallmenuuilistener)
	{
		mMenuUiListener = browseractionsfallmenuuilistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener mMenuUiListener>
	//    3    5:return          
	}

	private static final String TAG = "BrowserActionskMenuUi";
	private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
	private final Context mContext;
	private final List mMenuItems;
	private BrowserActionsFallMenuUiListener mMenuUiListener;
	private final Uri mUri;


/*
	static BrowserActionsFallMenuUiListener access$000(BrowserActionsFallbackMenuUi browseractionsfallbackmenuui)
	{
		return browseractionsfallbackmenuui.mMenuUiListener;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener mMenuUiListener>
	//    2    4:areturn         
	}

*/
}
