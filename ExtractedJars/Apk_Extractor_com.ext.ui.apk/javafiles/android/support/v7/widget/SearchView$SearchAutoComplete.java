// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.*;

// Referenced classes of package android.support.v7.widget:
//			AppCompatAutoCompleteTextView, SearchView

public static class SearchView$SearchAutoComplete extends AppCompatAutoCompleteTextView
{

	private int getSearchViewTextMinWidthDp()
	{
		Configuration configuration = getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Resources getResources()>
	//    2    4:invokevirtual   #75  <Method Configuration Resources.getConfiguration()>
	//    3    7:astore_3        
		int i = configuration.screenWidthDp;
	//    4    8:aload_3         
	//    5    9:getfield        #80  <Field int Configuration.screenWidthDp>
	//    6   12:istore_1        
		int j = configuration.screenHeightDp;
	//    7   13:aload_3         
	//    8   14:getfield        #83  <Field int Configuration.screenHeightDp>
	//    9   17:istore_2        
		if(i >= 960 && j >= 720 && configuration.orientation == 2)
	//*  10   18:iload_1         
	//*  11   19:sipush          960
	//*  12   22:icmplt          44
	//*  13   25:iload_2         
	//*  14   26:sipush          720
	//*  15   29:icmplt          44
	//*  16   32:aload_3         
	//*  17   33:getfield        #86  <Field int Configuration.orientation>
	//*  18   36:iconst_2        
	//*  19   37:icmpne          44
			return 256;
	//   20   40:sipush          256
	//   21   43:ireturn         
		return i < 600 && (i < 640 || j < 480) ? 160 : 192;
	//   22   44:iload_1         
	//   23   45:sipush          600
	//   24   48:icmpge          65
	//   25   51:iload_1         
	//   26   52:sipush          640
	//   27   55:icmplt          69
	//   28   58:iload_2         
	//   29   59:sipush          480
	//   30   62:icmplt          69
	//   31   65:sipush          192
	//   32   68:ireturn         
	//   33   69:sipush          160
	//   34   72:ireturn         
	}

	private boolean isEmpty()
	{
		return TextUtils.getTrimmedLength(((CharSequence) (getText()))) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method android.text.Editable getText()>
	//    2    4:invokestatic    #96  <Method int TextUtils.getTrimmedLength(CharSequence)>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private void setImeVisibility(boolean flag)
	{
		InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Context getContext()>
	//    2    4:ldc1            #102 <String "input_method">
	//    3    6:invokevirtual   #108 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #110 <Class InputMethodManager>
	//    5   12:astore_2        
		if(!flag)
	//*   6   13:iload_1         
	//*   7   14:ifne            42
		{
			mHasPendingShowSoftInputRequest = false;
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:putfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
			removeCallbacks(mRunShowSoftInputIfNecessary);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #41  <Field Runnable mRunShowSoftInputIfNecessary>
	//   14   27:invokevirtual   #116 <Method boolean removeCallbacks(Runnable)>
	//   15   30:pop             
			inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #120 <Method android.os.IBinder getWindowToken()>
	//   19   36:iconst_0        
	//   20   37:invokevirtual   #124 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   21   40:pop             
			return;
	//   22   41:return          
		}
		if(inputmethodmanager.isActive(((android.view.View) (this))))
	//*  23   42:aload_2         
	//*  24   43:aload_0         
	//*  25   44:invokevirtual   #128 <Method boolean InputMethodManager.isActive(android.view.View)>
	//*  26   47:ifeq            72
		{
			mHasPendingShowSoftInputRequest = false;
	//   27   50:aload_0         
	//   28   51:iconst_0        
	//   29   52:putfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
			removeCallbacks(mRunShowSoftInputIfNecessary);
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:getfield        #41  <Field Runnable mRunShowSoftInputIfNecessary>
	//   33   60:invokevirtual   #116 <Method boolean removeCallbacks(Runnable)>
	//   34   63:pop             
			inputmethodmanager.showSoftInput(((android.view.View) (this)), 0);
	//   35   64:aload_2         
	//   36   65:aload_0         
	//   37   66:iconst_0        
	//   38   67:invokevirtual   #132 <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   39   70:pop             
			return;
	//   40   71:return          
		} else
		{
			mHasPendingShowSoftInputRequest = true;
	//   41   72:aload_0         
	//   42   73:iconst_1        
	//   43   74:putfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
			return;
	//   44   77:return          
		}
	}

	private void showSoftInputIfNecessary()
	{
		if(mHasPendingShowSoftInputRequest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
	//*   2    4:ifeq            30
		{
			((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((android.view.View) (this)), 0);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #100 <Method Context getContext()>
	//    5   11:ldc1            #102 <String "input_method">
	//    6   13:invokevirtual   #108 <Method Object Context.getSystemService(String)>
	//    7   16:checkcast       #110 <Class InputMethodManager>
	//    8   19:aload_0         
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #132 <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   11   24:pop             
			mHasPendingShowSoftInputRequest = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
		}
	//   15   30:return          
	}

	public boolean enoughToFilter()
	{
		return mThreshold <= 0 || super.enoughToFilter();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mThreshold>
	//    2    4:ifle            14
	//    3    7:aload_0         
	//    4    8:invokespecial   #135 <Method boolean AppCompatAutoCompleteTextView.enoughToFilter()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		editorinfo = ((EditorInfo) (super.onCreateInputConnection(editorinfo)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #139 <Method InputConnection AppCompatAutoCompleteTextView.onCreateInputConnection(EditorInfo)>
	//    3    5:astore_1        
		if(mHasPendingShowSoftInputRequest)
	//*   4    6:aload_0         
	//*   5    7:getfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
	//*   6   10:ifeq            31
		{
			removeCallbacks(mRunShowSoftInputIfNecessary);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field Runnable mRunShowSoftInputIfNecessary>
	//   10   18:invokevirtual   #116 <Method boolean removeCallbacks(Runnable)>
	//   11   21:pop             
			post(mRunShowSoftInputIfNecessary);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #41  <Field Runnable mRunShowSoftInputIfNecessary>
	//   15   27:invokevirtual   #142 <Method boolean post(Runnable)>
	//   16   30:pop             
		}
		return ((InputConnection) (editorinfo));
	//   17   31:aload_1         
	//   18   32:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void AppCompatAutoCompleteTextView.onFinishInflate()>
		android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #69  <Method Resources getResources()>
	//    4    8:invokevirtual   #149 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    5   11:astore_1        
		setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displaymetrics));
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:invokespecial   #151 <Method int getSearchViewTextMinWidthDp()>
	//   10   18:i2f             
	//   11   19:aload_1         
	//   12   20:invokestatic    #157 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   13   23:f2i             
	//   14   24:invokevirtual   #161 <Method void setMinWidth(int)>
	//   15   27:return          
	}

	protected void onFocusChanged(boolean flag, int i, Rect rect)
	{
		super.onFocusChanged(flag, i, rect);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #165 <Method void AppCompatAutoCompleteTextView.onFocusChanged(boolean, int, Rect)>
		mSearchView.onTextFocusChanged();
	//    5    7:aload_0         
	//    6    8:getfield        #167 <Field SearchView mSearchView>
	//    7   11:invokevirtual   #170 <Method void SearchView.onTextFocusChanged()>
	//    8   14:return          
	}

	public boolean onKeyPreIme(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          86
		{
			if(keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #177 <Method int KeyEvent.getAction()>
	//*   5    9:ifne            36
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #180 <Method int KeyEvent.getRepeatCount()>
	//*   8   16:ifne            36
			{
				android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #184 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
	//   11   23:astore_3        
				if(dispatcherstate != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          34
					dispatcherstate.startTracking(keyevent, ((Object) (this)));
	//   14   28:aload_3         
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #190 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			}
			if(keyevent.getAction() == 1)
	//*  20   36:aload_2         
	//*  21   37:invokevirtual   #177 <Method int KeyEvent.getAction()>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          86
			{
				android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
	//   24   44:aload_0         
	//   25   45:invokevirtual   #184 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
	//   26   48:astore_3        
				if(dispatcherstate1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          58
					dispatcherstate1.handleUpEvent(keyevent);
	//   29   53:aload_3         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #194 <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
				if(keyevent.isTracking() && !keyevent.isCanceled())
	//*  32   58:aload_2         
	//*  33   59:invokevirtual   #197 <Method boolean KeyEvent.isTracking()>
	//*  34   62:ifeq            86
	//*  35   65:aload_2         
	//*  36   66:invokevirtual   #200 <Method boolean KeyEvent.isCanceled()>
	//*  37   69:ifne            86
				{
					mSearchView.clearFocus();
	//   38   72:aload_0         
	//   39   73:getfield        #167 <Field SearchView mSearchView>
	//   40   76:invokevirtual   #203 <Method void SearchView.clearFocus()>
					setImeVisibility(false);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:invokespecial   #53  <Method void setImeVisibility(boolean)>
					return true;
	//   44   84:iconst_1        
	//   45   85:ireturn         
				}
			}
		}
		return super.onKeyPreIme(i, keyevent);
	//   46   86:aload_0         
	//   47   87:iload_1         
	//   48   88:aload_2         
	//   49   89:invokespecial   #205 <Method boolean AppCompatAutoCompleteTextView.onKeyPreIme(int, KeyEvent)>
	//   50   92:ireturn         
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #208 <Method void AppCompatAutoCompleteTextView.onWindowFocusChanged(boolean)>
		if(flag && mSearchView.hasFocus() && getVisibility() == 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            49
	//*   5    9:aload_0         
	//*   6   10:getfield        #167 <Field SearchView mSearchView>
	//*   7   13:invokevirtual   #211 <Method boolean SearchView.hasFocus()>
	//*   8   16:ifeq            49
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #214 <Method int getVisibility()>
	//*  11   23:ifne            49
		{
			mHasPendingShowSoftInputRequest = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #112 <Field boolean mHasPendingShowSoftInputRequest>
			if(SearchView.isLandscapeMode(getContext()))
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #100 <Method Context getContext()>
	//*  17   35:invokestatic    #218 <Method boolean SearchView.isLandscapeMode(Context)>
	//*  18   38:ifeq            49
				SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(((android.widget.AutoCompleteTextView) (this)), true);
	//   19   41:getstatic       #222 <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
	//   20   44:aload_0         
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #228 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(android.widget.AutoCompleteTextView, boolean)>
		}
	//   23   49:return          
	}

	public void performCompletion()
	{
	//    0    0:return          
	}

	protected void replaceText(CharSequence charsequence)
	{
	//    0    0:return          
	}

	void setSearchView(SearchView searchview)
	{
		mSearchView = searchview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #167 <Field SearchView mSearchView>
	//    3    5:return          
	}

	public void setThreshold(int i)
	{
		super.setThreshold(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #236 <Method void AppCompatAutoCompleteTextView.setThreshold(int)>
		mThreshold = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #47  <Field int mThreshold>
	//    6   10:return          
	}

	private boolean mHasPendingShowSoftInputRequest;
	final Runnable mRunShowSoftInputIfNecessary;
	private SearchView mSearchView;
	private int mThreshold;


/*
	static void access$000(SearchView$SearchAutoComplete searchview$searchautocomplete, boolean flag)
	{
		searchview$searchautocomplete.setImeVisibility(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #53  <Method void setImeVisibility(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$100(SearchView$SearchAutoComplete searchview$searchautocomplete)
	{
		return searchview$searchautocomplete.isEmpty();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method boolean isEmpty()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(SearchView$SearchAutoComplete searchview$searchautocomplete)
	{
		searchview$searchautocomplete.showSoftInputIfNecessary();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void showSoftInputIfNecessary()>
		return;
	//    2    4:return          
	}

*/

	public SearchView$SearchAutoComplete(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void SearchView$SearchAutoComplete(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView$SearchAutoComplete(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #32  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
	//    4    6:invokespecial   #35  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView$SearchAutoComplete(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #36  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
		mRunShowSoftInputIfNecessary = new Runnable() {

			public void run()
			{
				showSoftInputIfNecessary();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchView$SearchAutoComplete this$0>
			//    2    4:invokestatic    #25  <Method void SearchView$SearchAutoComplete.access$200(SearchView$SearchAutoComplete)>
			//    3    7:return          
			}

			final SearchView.SearchAutoComplete this$0;

			
			{
				this$0 = SearchView.SearchAutoComplete.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchView$SearchAutoComplete this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5    7:aload_0         
	//    6    8:new             #9   <Class SearchView$SearchAutoComplete$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #39  <Method void SearchView$SearchAutoComplete$1(SearchView$SearchAutoComplete)>
	//   10   16:putfield        #41  <Field Runnable mRunShowSoftInputIfNecessary>
		mThreshold = getThreshold();
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #45  <Method int getThreshold()>
	//   14   24:putfield        #47  <Field int mThreshold>
	//   15   27:return          
	}
}
