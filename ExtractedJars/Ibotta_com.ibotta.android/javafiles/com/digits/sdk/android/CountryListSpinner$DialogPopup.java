// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListView;

// Referenced classes of package com.digits.sdk.android:
//			CountryListSpinner, CountryListAdapter, CountryInfo

public class CountryListSpinner$DialogPopup
	implements android.content.
{

	public void dismiss()
	{
		AlertDialog alertdialog = dialog;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AlertDialog dialog>
	//    2    4:astore_1        
		if(alertdialog != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			alertdialog.dismiss();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method void AlertDialog.dismiss()>
			dialog = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #30  <Field AlertDialog dialog>
		}
	//   10   18:return          
	}

	public boolean isShowing()
	{
		AlertDialog alertdialog = dialog;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AlertDialog dialog>
	//    2    4:astore_1        
		return alertdialog != null && alertdialog.isShowing();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method boolean AlertDialog.isShowing()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) ((CountryInfo)listAdapter.getItem(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CountryListAdapter listAdapter>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #46  <Method Object CountryListAdapter.getItem(int)>
	//    4    8:checkcast       #48  <Class CountryInfo>
	//    5   11:astore_1        
		CountryListSpinner.access$002(CountryListSpinner.this, ((CountryInfo) (dialoginterface)).country);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field CountryListSpinner this$0>
	//    8   16:aload_1         
	//    9   17:getfield        #52  <Field String CountryInfo.country>
	//   10   20:invokestatic    #56  <Method String CountryListSpinner.access$002(CountryListSpinner, String)>
	//   11   23:pop             
		CountryListSpinner.access$100(CountryListSpinner.this, ((CountryInfo) (dialoginterface)).countryCode, ((CountryInfo) (dialoginterface)).country);
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field CountryListSpinner this$0>
	//   14   28:aload_1         
	//   15   29:getfield        #60  <Field int CountryInfo.countryCode>
	//   16   32:aload_1         
	//   17   33:getfield        #52  <Field String CountryInfo.country>
	//   18   36:invokestatic    #64  <Method void CountryListSpinner.access$100(CountryListSpinner, int, String)>
		dismiss();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #65  <Method void dismiss()>
	//   21   43:return          
	}

	public void show(final int selected)
	{
		if(listAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field CountryListAdapter listAdapter>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			dialog = (new android.app.AlertDialog.Builder(getContext())).setSingleChoiceItems(((android.widget.ListAdapter) (listAdapter)), 0, ((android.content.) (this))).create();
	//    4    8:aload_0         
	//    5    9:new             #69  <Class android.app.AlertDialog$Builder>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field CountryListSpinner this$0>
	//    9   17:invokevirtual   #73  <Method android.content.Context CountryListSpinner.getContext()>
	//   10   20:invokespecial   #76  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:aload_0         
	//   12   24:getfield        #26  <Field CountryListAdapter listAdapter>
	//   13   27:iconst_0        
	//   14   28:aload_0         
	//   15   29:invokevirtual   #80  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setSingleChoiceItems(android.widget.ListAdapter, int, android.content.DialogInterface$OnClickListener)>
	//   16   32:invokevirtual   #84  <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   17   35:putfield        #30  <Field AlertDialog dialog>
			dialog.setCanceledOnTouchOutside(true);
	//   18   38:aload_0         
	//   19   39:getfield        #30  <Field AlertDialog dialog>
	//   20   42:iconst_1        
	//   21   43:invokevirtual   #88  <Method void AlertDialog.setCanceledOnTouchOutside(boolean)>
			final ListView listView = dialog.getListView();
	//   22   46:aload_0         
	//   23   47:getfield        #30  <Field AlertDialog dialog>
	//   24   50:invokevirtual   #92  <Method ListView AlertDialog.getListView()>
	//   25   53:astore_2        
			listView.setFastScrollEnabled(true);
	//   26   54:aload_2         
	//   27   55:iconst_1        
	//   28   56:invokevirtual   #97  <Method void ListView.setFastScrollEnabled(boolean)>
			listView.postDelayed(new Runnable() {

				public void run()
				{
					listView.setSelection(selected);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field ListView val$listView>
				//    2    4:aload_0         
				//    3    5:getfield        #28  <Field int val$selected>
				//    4    8:invokevirtual   #38  <Method void ListView.setSelection(int)>
				//    5   11:return          
				}

				final CountryListSpinner.DialogPopup this$1;
				final ListView val$listView;
				final int val$selected;

			
			{
				this$1 = CountryListSpinner.DialogPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CountryListSpinner$DialogPopup this$1>
				listView = listview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ListView val$listView>
				selected = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field int val$selected>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
, 10L);
	//   29   59:aload_2         
	//   30   60:new             #11  <Class CountryListSpinner$DialogPopup$1>
	//   31   63:dup             
	//   32   64:aload_0         
	//   33   65:aload_2         
	//   34   66:iload_1         
	//   35   67:invokespecial   #100 <Method void CountryListSpinner$DialogPopup$1(CountryListSpinner$DialogPopup, ListView, int)>
	//   36   70:ldc2w           #101 <Long 10L>
	//   37   73:invokevirtual   #106 <Method boolean ListView.postDelayed(Runnable, long)>
	//   38   76:pop             
			dialog.show();
	//   39   77:aload_0         
	//   40   78:getfield        #30  <Field AlertDialog dialog>
	//   41   81:invokevirtual   #108 <Method void AlertDialog.show()>
			return;
	//   42   84:return          
		}
	}

	private AlertDialog dialog;
	private final CountryListAdapter listAdapter;
	final CountryListSpinner this$0;

	CountryListSpinner$DialogPopup(CountryListAdapter countrylistadapter)
	{
		this$0 = CountryListSpinner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CountryListSpinner this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		listAdapter = countrylistadapter;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field CountryListAdapter listAdapter>
	//    8   14:return          
	}
}
