// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.digits.sdk.android:
//			CountryListAdapter, CountryListLoadTask, Digits, CountryInfo

public class CountryListSpinner extends TextView
	implements android.view.View.OnClickListener, CountryListLoadTask.Listener
{
	public class DialogPopup
		implements android.content.DialogInterface.OnClickListener
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
			selectedCountryName = ((CountryInfo) (dialoginterface)).country;
		//    6   12:aload_0         
		//    7   13:getfield        #21  <Field CountryListSpinner this$0>
		//    8   16:aload_1         
		//    9   17:getfield        #52  <Field String CountryInfo.country>
		//   10   20:invokestatic    #56  <Method String CountryListSpinner.access$002(CountryListSpinner, String)>
		//   11   23:pop             
			setSpinnerText(((CountryInfo) (dialoginterface)).countryCode, ((CountryInfo) (dialoginterface)).country);
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

		public void show(int i)
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
				dialog = (new android.app.AlertDialog.Builder(getContext())).setSingleChoiceItems(((android.widget.ListAdapter) (listAdapter)), 0, ((android.content.DialogInterface.OnClickListener) (this))).create();
		//    4    8:aload_0         
		//    5    9:new             #69  <Class android.app.AlertDialog$Builder>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:getfield        #21  <Field CountryListSpinner this$0>
		//    9   17:invokevirtual   #73  <Method Context CountryListSpinner.getContext()>
		//   10   20:invokespecial   #76  <Method void android.app.AlertDialog$Builder(Context)>
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
				listView.postDelayed(((_cls1) (i)). new Runnable() {

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

					final DialogPopup this$1;
					final ListView val$listView;
					final int val$selected;

			
			{
				this$1 = final_dialogpopup;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CountryListSpinner$DialogPopup this$1>
				listView = listview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ListView val$listView>
				selected = I.this;
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

		DialogPopup(CountryListAdapter countrylistadapter)
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


	public CountryListSpinner(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x1010081);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #26  <Int 0x1010081>
	//    4    5:invokespecial   #29  <Method void CountryListSpinner(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public CountryListSpinner(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void TextView(Context, AttributeSet, int)>
		init();
	//    5    7:aload_0         
	//    6    8:invokespecial   #35  <Method void init()>
	//    7   11:return          
	}

	private void executeUserClickListener(View view)
	{
		android.view.View.OnClickListener onclicklistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field android.view.View$OnClickListener listener>
	//    2    4:astore_2        
		if(onclicklistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			onclicklistener.onClick(view);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #52  <Method void android.view.View$OnClickListener.onClick(View)>
	//    8   16:return          
	}

	private void init()
	{
		if(!(this instanceof View))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #54  <Class View>
	//*   2    4:ifne            15
			super.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #58  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*   6   12:goto            23
			ViewInstrumentation.setOnClickListener((View)this, ((android.view.View.OnClickListener) (this)));
	//    7   15:aload_0         
	//    8   16:checkcast       #54  <Class View>
	//    9   19:aload_0         
	//   10   20:invokestatic    #63  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		countryListAdapter = new CountryListAdapter(getContext());
	//   11   23:aload_0         
	//   12   24:new             #65  <Class CountryListAdapter>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokevirtual   #69  <Method Context getContext()>
	//   16   32:invokespecial   #72  <Method void CountryListAdapter(Context)>
	//   17   35:putfield        #74  <Field CountryListAdapter countryListAdapter>
		dialogPopup = new DialogPopup(countryListAdapter);
	//   18   38:aload_0         
	//   19   39:new             #10  <Class CountryListSpinner$DialogPopup>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #74  <Field CountryListAdapter countryListAdapter>
	//   24   48:invokespecial   #77  <Method void CountryListSpinner$DialogPopup(CountryListSpinner, CountryListAdapter)>
	//   25   51:putfield        #79  <Field CountryListSpinner$DialogPopup dialogPopup>
		textFormat = getResources().getString(R.string.dgts__country_spinner_format);
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:invokevirtual   #83  <Method Resources getResources()>
	//   29   59:getstatic       #89  <Field int R$string.dgts__country_spinner_format>
	//   30   62:invokevirtual   #95  <Method String Resources.getString(int)>
	//   31   65:putfield        #97  <Field String textFormat>
		selectedCountryName = "";
	//   32   68:aload_0         
	//   33   69:ldc1            #99  <String "">
	//   34   71:putfield        #39  <Field String selectedCountryName>
		setSpinnerText(1, Locale.US.getDisplayCountry());
	//   35   74:aload_0         
	//   36   75:iconst_1        
	//   37   76:getstatic       #105 <Field Locale Locale.US>
	//   38   79:invokevirtual   #109 <Method String Locale.getDisplayCountry()>
	//   39   82:invokespecial   #45  <Method void setSpinnerText(int, String)>
	//   40   85:return          
	}

	private void loadCountryList()
	{
		(new CountryListLoadTask(((CountryListLoadTask.Listener) (this)))).executeOnExecutor(((java.util.concurrent.Executor) (Digits.getInstance().getExecutorService())), ((Object []) (new Void[0])));
	//    0    0:new             #112 <Class CountryListLoadTask>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void CountryListLoadTask(CountryListLoadTask$Listener)>
	//    4    8:invokestatic    #121 <Method Digits Digits.getInstance()>
	//    5   11:invokevirtual   #125 <Method java.util.concurrent.ExecutorService Digits.getExecutorService()>
	//    6   14:iconst_0        
	//    7   15:anewarray       Void[]
	//    8   18:invokevirtual   #131 <Method io.fabric.sdk.android.services.concurrency.AsyncTask CountryListLoadTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//    9   21:pop             
	//   10   22:return          
	}

	private void setSpinnerText(int i, String s)
	{
		setText(((CharSequence) (String.format(textFormat, new Object[] {
			s, Integer.valueOf(i)
		}))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #97  <Field String textFormat>
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:iload_1         
	//   12   16:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//   13   19:aastore         
	//   14   20:invokestatic    #145 <Method String String.format(String, Object[])>
	//   15   23:invokevirtual   #149 <Method void setText(CharSequence)>
		setTag(((Object) (Integer.valueOf(i))));
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//   19   31:invokevirtual   #153 <Method void setTag(Object)>
	//   20   34:return          
	}

	public void onClick(View view)
	{
		if(countryListAdapter.getCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field CountryListAdapter countryListAdapter>
	//*   2    4:invokevirtual   #157 <Method int CountryListAdapter.getCount()>
	//*   3    7:ifne            17
			loadCountryList();
	//    4   10:aload_0         
	//    5   11:invokespecial   #159 <Method void loadCountryList()>
		else
	//*   6   14:goto            35
			dialogPopup.show(countryListAdapter.getPositionForCountry(selectedCountryName));
	//    7   17:aload_0         
	//    8   18:getfield        #79  <Field CountryListSpinner$DialogPopup dialogPopup>
	//    9   21:aload_0         
	//   10   22:getfield        #74  <Field CountryListAdapter countryListAdapter>
	//   11   25:aload_0         
	//   12   26:getfield        #39  <Field String selectedCountryName>
	//   13   29:invokevirtual   #163 <Method int CountryListAdapter.getPositionForCountry(String)>
	//   14   32:invokevirtual   #167 <Method void CountryListSpinner$DialogPopup.show(int)>
		CommonUtils.hideKeyboard(getContext(), ((View) (this)));
	//   15   35:aload_0         
	//   16   36:invokevirtual   #69  <Method Context getContext()>
	//   17   39:aload_0         
	//   18   40:invokestatic    #173 <Method void CommonUtils.hideKeyboard(Context, View)>
		executeUserClickListener(view);
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:invokespecial   #175 <Method void executeUserClickListener(View)>
	//   22   48:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void TextView.onDetachedFromWindow()>
		if(dialogPopup.isShowing())
	//*   2    4:aload_0         
	//*   3    5:getfield        #79  <Field CountryListSpinner$DialogPopup dialogPopup>
	//*   4    8:invokevirtual   #182 <Method boolean CountryListSpinner$DialogPopup.isShowing()>
	//*   5   11:ifeq            21
			dialogPopup.dismiss();
	//    6   14:aload_0         
	//    7   15:getfield        #79  <Field CountryListSpinner$DialogPopup dialogPopup>
	//    8   18:invokevirtual   #185 <Method void CountryListSpinner$DialogPopup.dismiss()>
	//    9   21:return          
	}

	public void onLoadComplete(List list)
	{
		countryListAdapter.setData(list);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field CountryListAdapter countryListAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #190 <Method void CountryListAdapter.setData(List)>
		dialogPopup.show(countryListAdapter.getPositionForCountry(selectedCountryName));
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field CountryListSpinner$DialogPopup dialogPopup>
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field CountryListAdapter countryListAdapter>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field String selectedCountryName>
	//   10   20:invokevirtual   #163 <Method int CountryListAdapter.getPositionForCountry(String)>
	//   11   23:invokevirtual   #167 <Method void CountryListSpinner$DialogPopup.show(int)>
	//   12   26:return          
	}

	void setDialogPopup(DialogPopup dialogpopup)
	{
		dialogPopup = dialogpopup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field CountryListSpinner$DialogPopup dialogPopup>
	//    3    5:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		listener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field android.view.View$OnClickListener listener>
	//    3    5:return          
	}

	public void setSelectedForCountry(String s, String s1)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))) && !TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #202 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            31
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #202 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifne            31
		{
			selectedCountryName = s;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #39  <Field String selectedCountryName>
			setSpinnerText(Integer.valueOf(s1).intValue(), s);
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokestatic    #205 <Method Integer Integer.valueOf(String)>
	//   12   24:invokevirtual   #208 <Method int Integer.intValue()>
	//   13   27:aload_1         
	//   14   28:invokespecial   #45  <Method void setSpinnerText(int, String)>
		}
	//   15   31:return          
	}

	private CountryListAdapter countryListAdapter;
	private DialogPopup dialogPopup;
	private android.view.View.OnClickListener listener;
	private String selectedCountryName;
	private String textFormat;


/*
	static String access$002(CountryListSpinner countrylistspinner, String s)
	{
		countrylistspinner.selectedCountryName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String selectedCountryName>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$100(CountryListSpinner countrylistspinner, int i, String s)
	{
		countrylistspinner.setSpinnerText(i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method void setSpinnerText(int, String)>
		return;
	//    4    6:return          
	}

*/
}
