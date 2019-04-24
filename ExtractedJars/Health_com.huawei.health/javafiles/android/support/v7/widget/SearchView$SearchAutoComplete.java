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
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package android.support.v7.widget:
//			AppCompatAutoCompleteTextView, SearchView

public static class SearchView$SearchAutoComplete extends AppCompatAutoCompleteTextView
{

	private int getSearchViewTextMinWidthDp()
	{
		Configuration configuration = getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Resources getResources()>
	//    2    4:invokevirtual   #53  <Method Configuration Resources.getConfiguration()>
	//    3    7:astore_3        
		int i = configuration.screenWidthDp;
	//    4    8:aload_3         
	//    5    9:getfield        #58  <Field int Configuration.screenWidthDp>
	//    6   12:istore_1        
		int j = configuration.screenHeightDp;
	//    7   13:aload_3         
	//    8   14:getfield        #61  <Field int Configuration.screenHeightDp>
	//    9   17:istore_2        
		if(i >= 960 && j >= 720 && configuration.orientation == 2)
	//*  10   18:iload_1         
	//*  11   19:sipush          960
	//*  12   22:icmplt          44
	//*  13   25:iload_2         
	//*  14   26:sipush          720
	//*  15   29:icmplt          44
	//*  16   32:aload_3         
	//*  17   33:getfield        #64  <Field int Configuration.orientation>
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
	//    1    1:invokevirtual   #68  <Method android.text.Editable getText()>
	//    2    4:invokestatic    #74  <Method int TextUtils.getTrimmedLength(CharSequence)>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean enoughToFilter()
	{
		return mThreshold <= 0 || super.enoughToFilter();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int mThreshold>
	//    2    4:ifle            14
	//    3    7:aload_0         
	//    4    8:invokespecial   #77  <Method boolean AppCompatAutoCompleteTextView.enoughToFilter()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void AppCompatAutoCompleteTextView.onFinishInflate()>
		android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #47  <Method Resources getResources()>
	//    4    8:invokevirtual   #85  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    5   11:astore_1        
		setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displaymetrics));
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:invokespecial   #87  <Method int getSearchViewTextMinWidthDp()>
	//   10   18:i2f             
	//   11   19:aload_1         
	//   12   20:invokestatic    #93  <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   13   23:f2i             
	//   14   24:invokevirtual   #97  <Method void setMinWidth(int)>
	//   15   27:return          
	}

	protected void onFocusChanged(boolean flag, int i, Rect rect)
	{
		super.onFocusChanged(flag, i, rect);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #101 <Method void AppCompatAutoCompleteTextView.onFocusChanged(boolean, int, Rect)>
		mSearchView.onTextFocusChanged();
	//    5    7:aload_0         
	//    6    8:getfield        #103 <Field SearchView mSearchView>
	//    7   11:invokevirtual   #106 <Method void SearchView.onTextFocusChanged()>
	//    8   14:return          
	}

	public boolean onKeyPreIme(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          89
		{
			if(keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #113 <Method int KeyEvent.getAction()>
	//*   5    9:ifne            36
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #116 <Method int KeyEvent.getRepeatCount()>
	//*   8   16:ifne            36
			{
				android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #120 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
	//   11   23:astore_3        
				if(dispatcherstate != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          34
					dispatcherstate.startTracking(keyevent, ((Object) (this)));
	//   14   28:aload_3         
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #126 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			}
			if(keyevent.getAction() == 1)
	//*  20   36:aload_2         
	//*  21   37:invokevirtual   #113 <Method int KeyEvent.getAction()>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          89
			{
				android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
	//   24   44:aload_0         
	//   25   45:invokevirtual   #120 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
	//   26   48:astore_3        
				if(dispatcherstate1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          58
					dispatcherstate1.handleUpEvent(keyevent);
	//   29   53:aload_3         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #130 <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
				if(keyevent.isTracking() && !keyevent.isCanceled())
	//*  32   58:aload_2         
	//*  33   59:invokevirtual   #133 <Method boolean KeyEvent.isTracking()>
	//*  34   62:ifeq            89
	//*  35   65:aload_2         
	//*  36   66:invokevirtual   #136 <Method boolean KeyEvent.isCanceled()>
	//*  37   69:ifne            89
				{
					mSearchView.clearFocus();
	//   38   72:aload_0         
	//   39   73:getfield        #103 <Field SearchView mSearchView>
	//   40   76:invokevirtual   #139 <Method void SearchView.clearFocus()>
					mSearchView.setImeVisibility(false);
	//   41   79:aload_0         
	//   42   80:getfield        #103 <Field SearchView mSearchView>
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #143 <Method void SearchView.setImeVisibility(boolean)>
					return true;
	//   45   87:iconst_1        
	//   46   88:ireturn         
				}
			}
		}
		return super.onKeyPreIme(i, keyevent);
	//   47   89:aload_0         
	//   48   90:iload_1         
	//   49   91:aload_2         
	//   50   92:invokespecial   #145 <Method boolean AppCompatAutoCompleteTextView.onKeyPreIme(int, KeyEvent)>
	//   51   95:ireturn         
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #148 <Method void AppCompatAutoCompleteTextView.onWindowFocusChanged(boolean)>
		if(flag && mSearchView.hasFocus() && getVisibility() == 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            62
	//*   5    9:aload_0         
	//*   6   10:getfield        #103 <Field SearchView mSearchView>
	//*   7   13:invokevirtual   #151 <Method boolean SearchView.hasFocus()>
	//*   8   16:ifeq            62
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #154 <Method int getVisibility()>
	//*  11   23:ifne            62
		{
			((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((android.view.View) (this)), 0);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #158 <Method Context getContext()>
	//   14   30:ldc1            #160 <String "input_method">
	//   15   32:invokevirtual   #166 <Method Object Context.getSystemService(String)>
	//   16   35:checkcast       #168 <Class InputMethodManager>
	//   17   38:aload_0         
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #172 <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   20   43:pop             
			if(SearchView.isLandscapeMode(getContext()))
	//*  21   44:aload_0         
	//*  22   45:invokevirtual   #158 <Method Context getContext()>
	//*  23   48:invokestatic    #176 <Method boolean SearchView.isLandscapeMode(Context)>
	//*  24   51:ifeq            62
				SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(((android.widget.AutoCompleteTextView) (this)), true);
	//   25   54:getstatic       #180 <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
	//   26   57:aload_0         
	//   27   58:iconst_1        
	//   28   59:invokevirtual   #186 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(android.widget.AutoCompleteTextView, boolean)>
		}
	//   29   62:return          
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
	//    2    2:putfield        #103 <Field SearchView mSearchView>
	//    3    5:return          
	}

	public void setThreshold(int i)
	{
		super.setThreshold(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #194 <Method void AppCompatAutoCompleteTextView.setThreshold(int)>
		mThreshold = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #36  <Field int mThreshold>
	//    6   10:return          
	}

	private SearchView mSearchView;
	private int mThreshold;


/*
	static boolean access$000(SearchView$SearchAutoComplete searchview$searchautocomplete)
	{
		return searchview$searchautocomplete.isEmpty();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method boolean isEmpty()>
	//    2    4:ireturn         
	}

*/

	public SearchView$SearchAutoComplete(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void SearchView$SearchAutoComplete(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView$SearchAutoComplete(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #26  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
	//    4    6:invokespecial   #29  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView$SearchAutoComplete(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #30  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
		mThreshold = getThreshold();
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #34  <Method int getThreshold()>
	//    8   12:putfield        #36  <Field int mThreshold>
	//    9   15:return          
	}
}
