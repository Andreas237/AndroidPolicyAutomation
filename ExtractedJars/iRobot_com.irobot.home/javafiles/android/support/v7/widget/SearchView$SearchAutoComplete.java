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

	static void a(SearchView$SearchAutoComplete searchview$searchautocomplete, boolean flag)
	{
		searchview$searchautocomplete.setImeVisibility(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #48  <Method void setImeVisibility(boolean)>
	//    3    5:return          
	}

	private boolean a()
	{
		return TextUtils.getTrimmedLength(((CharSequence) (getText()))) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method android.text.Editable getText()>
	//    2    4:invokestatic    #59  <Method int TextUtils.getTrimmedLength(CharSequence)>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	static boolean a(SearchView$SearchAutoComplete searchview$searchautocomplete)
	{
		return searchview$searchautocomplete.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method boolean a()>
	//    2    4:ireturn         
	}

	private void b()
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field boolean d>
	//*   2    4:ifeq            30
		{
			((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((android.view.View) (this)), 0);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #69  <Method Context getContext()>
	//    5   11:ldc1            #71  <String "input_method">
	//    6   13:invokevirtual   #77  <Method Object Context.getSystemService(String)>
	//    7   16:checkcast       #79  <Class InputMethodManager>
	//    8   19:aload_0         
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #83  <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   11   24:pop             
			d = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #65  <Field boolean d>
		}
	//   15   30:return          
	}

	static void b(SearchView$SearchAutoComplete searchview$searchautocomplete)
	{
		searchview$searchautocomplete.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void b()>
	//    2    4:return          
	}

	private int getSearchViewTextMinWidthDp()
	{
		Configuration configuration = getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method Resources getResources()>
	//    2    4:invokevirtual   #96  <Method Configuration Resources.getConfiguration()>
	//    3    7:astore_3        
		int i = configuration.screenWidthDp;
	//    4    8:aload_3         
	//    5    9:getfield        #101 <Field int Configuration.screenWidthDp>
	//    6   12:istore_1        
		int j = configuration.screenHeightDp;
	//    7   13:aload_3         
	//    8   14:getfield        #104 <Field int Configuration.screenHeightDp>
	//    9   17:istore_2        
		if(i >= 960 && j >= 720 && configuration.orientation == 2)
	//*  10   18:iload_1         
	//*  11   19:sipush          960
	//*  12   22:icmplt          44
	//*  13   25:iload_2         
	//*  14   26:sipush          720
	//*  15   29:icmplt          44
	//*  16   32:aload_3         
	//*  17   33:getfield        #107 <Field int Configuration.orientation>
	//*  18   36:iconst_2        
	//*  19   37:icmpne          44
			return 256;
	//   20   40:sipush          256
	//   21   43:ireturn         
		return i < 600 && (i < 640 || j < 480) ? 160 : 192;
	//   22   44:iload_1         
	//   23   45:sipush          600
	//   24   48:icmpge          72
	//   25   51:iload_1         
	//   26   52:sipush          640
	//   27   55:icmplt          68
	//   28   58:iload_2         
	//   29   59:sipush          480
	//   30   62:icmplt          68
	//   31   65:goto            72
	//   32   68:sipush          160
	//   33   71:ireturn         
	//   34   72:sipush          192
	//   35   75:ireturn         
	}

	private void setImeVisibility(boolean flag)
	{
		InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Context getContext()>
	//    2    4:ldc1            #71  <String "input_method">
	//    3    6:invokevirtual   #77  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #79  <Class InputMethodManager>
	//    5   12:astore_2        
		if(!flag)
	//*   6   13:iload_1         
	//*   7   14:ifne            42
		{
			d = false;
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:putfield        #65  <Field boolean d>
			removeCallbacks(a);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #37  <Field Runnable a>
	//   14   27:invokevirtual   #111 <Method boolean removeCallbacks(Runnable)>
	//   15   30:pop             
			inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #115 <Method android.os.IBinder getWindowToken()>
	//   19   36:iconst_0        
	//   20   37:invokevirtual   #119 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   21   40:pop             
			return;
	//   22   41:return          
		}
		if(inputmethodmanager.isActive(((android.view.View) (this))))
	//*  23   42:aload_2         
	//*  24   43:aload_0         
	//*  25   44:invokevirtual   #123 <Method boolean InputMethodManager.isActive(android.view.View)>
	//*  26   47:ifeq            72
		{
			d = false;
	//   27   50:aload_0         
	//   28   51:iconst_0        
	//   29   52:putfield        #65  <Field boolean d>
			removeCallbacks(a);
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:getfield        #37  <Field Runnable a>
	//   33   60:invokevirtual   #111 <Method boolean removeCallbacks(Runnable)>
	//   34   63:pop             
			inputmethodmanager.showSoftInput(((android.view.View) (this)), 0);
	//   35   64:aload_2         
	//   36   65:aload_0         
	//   37   66:iconst_0        
	//   38   67:invokevirtual   #83  <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   39   70:pop             
			return;
	//   40   71:return          
		} else
		{
			d = true;
	//   41   72:aload_0         
	//   42   73:iconst_1        
	//   43   74:putfield        #65  <Field boolean d>
			return;
	//   44   77:return          
		}
	}

	public boolean enoughToFilter()
	{
		return b <= 0 || super.enoughToFilter();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int b>
	//    2    4:ifle            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #126 <Method boolean AppCompatAutoCompleteTextView.enoughToFilter()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		editorinfo = ((EditorInfo) (super.onCreateInputConnection(editorinfo)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method InputConnection AppCompatAutoCompleteTextView.onCreateInputConnection(EditorInfo)>
	//    3    5:astore_1        
		if(d)
	//*   4    6:aload_0         
	//*   5    7:getfield        #65  <Field boolean d>
	//*   6   10:ifeq            31
		{
			removeCallbacks(a);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field Runnable a>
	//   10   18:invokevirtual   #111 <Method boolean removeCallbacks(Runnable)>
	//   11   21:pop             
			post(a);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #37  <Field Runnable a>
	//   15   27:invokevirtual   #133 <Method boolean post(Runnable)>
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
	//    1    1:invokespecial   #136 <Method void AppCompatAutoCompleteTextView.onFinishInflate()>
		android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #90  <Method Resources getResources()>
	//    4    8:invokevirtual   #140 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    5   11:astore_1        
		setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displaymetrics));
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:invokespecial   #142 <Method int getSearchViewTextMinWidthDp()>
	//   10   18:i2f             
	//   11   19:aload_1         
	//   12   20:invokestatic    #148 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   13   23:f2i             
	//   14   24:invokevirtual   #152 <Method void setMinWidth(int)>
	//   15   27:return          
	}

	protected void onFocusChanged(boolean flag, int i, Rect rect)
	{
		super.onFocusChanged(flag, i, rect);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #156 <Method void AppCompatAutoCompleteTextView.onFocusChanged(boolean, int, Rect)>
		c.i();
	//    5    7:aload_0         
	//    6    8:getfield        #158 <Field SearchView c>
	//    7   11:invokevirtual   #161 <Method void SearchView.i()>
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
	//*   4    6:invokevirtual   #168 <Method int KeyEvent.getAction()>
	//*   5    9:ifne            36
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #171 <Method int KeyEvent.getRepeatCount()>
	//*   8   16:ifne            36
			{
				android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #175 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
	//   11   23:astore_3        
				if(dispatcherstate != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          34
					dispatcherstate.startTracking(keyevent, ((Object) (this)));
	//   14   28:aload_3         
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #181 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			}
			if(keyevent.getAction() == 1)
	//*  20   36:aload_2         
	//*  21   37:invokevirtual   #168 <Method int KeyEvent.getAction()>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          86
			{
				android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
	//   24   44:aload_0         
	//   25   45:invokevirtual   #175 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
	//   26   48:astore_3        
				if(dispatcherstate1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          58
					dispatcherstate1.handleUpEvent(keyevent);
	//   29   53:aload_3         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #185 <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
				if(keyevent.isTracking() && !keyevent.isCanceled())
	//*  32   58:aload_2         
	//*  33   59:invokevirtual   #188 <Method boolean KeyEvent.isTracking()>
	//*  34   62:ifeq            86
	//*  35   65:aload_2         
	//*  36   66:invokevirtual   #191 <Method boolean KeyEvent.isCanceled()>
	//*  37   69:ifne            86
				{
					c.clearFocus();
	//   38   72:aload_0         
	//   39   73:getfield        #158 <Field SearchView c>
	//   40   76:invokevirtual   #194 <Method void SearchView.clearFocus()>
					setImeVisibility(false);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:invokespecial   #48  <Method void setImeVisibility(boolean)>
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
	//   49   89:invokespecial   #196 <Method boolean AppCompatAutoCompleteTextView.onKeyPreIme(int, KeyEvent)>
	//   50   92:ireturn         
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #199 <Method void AppCompatAutoCompleteTextView.onWindowFocusChanged(boolean)>
		if(flag && c.hasFocus() && getVisibility() == 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            49
	//*   5    9:aload_0         
	//*   6   10:getfield        #158 <Field SearchView c>
	//*   7   13:invokevirtual   #202 <Method boolean SearchView.hasFocus()>
	//*   8   16:ifeq            49
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #205 <Method int getVisibility()>
	//*  11   23:ifne            49
		{
			d = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #65  <Field boolean d>
			if(SearchView.a(getContext()))
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #69  <Method Context getContext()>
	//*  17   35:invokestatic    #208 <Method boolean SearchView.a(Context)>
	//*  18   38:ifeq            49
				SearchView.i.a(((android.widget.AutoCompleteTextView) (this)), true);
	//   19   41:getstatic       #211 <Field SearchView$a SearchView.i>
	//   20   44:aload_0         
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #216 <Method void SearchView$a.a(android.widget.AutoCompleteTextView, boolean)>
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
		c = searchview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field SearchView c>
	//    3    5:return          
	}

	public void setThreshold(int i)
	{
		super.setThreshold(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #224 <Method void AppCompatAutoCompleteTextView.setThreshold(int)>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #43  <Field int b>
	//    6   10:return          
	}

	final Runnable a;
	private int b;
	private SearchView c;
	private boolean d;

	public SearchView$SearchAutoComplete(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void SearchView$SearchAutoComplete(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView$SearchAutoComplete(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.autoCompleteTextViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #28  <Field int android.support.v7.a.a$a.autoCompleteTextViewStyle>
	//    4    6:invokespecial   #31  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView$SearchAutoComplete(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #32  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
		a = new Runnable() {

			public void run()
			{
				SearchView.SearchAutoComplete.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchView$SearchAutoComplete a>
			//    2    4:invokestatic    #25  <Method void SearchView$SearchAutoComplete.b(SearchView$SearchAutoComplete)>
			//    3    7:return          
			}

			final SearchView.SearchAutoComplete a;

			
			{
				a = SearchView.SearchAutoComplete.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchView$SearchAutoComplete a>
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
	//    9   13:invokespecial   #35  <Method void SearchView$SearchAutoComplete$1(SearchView$SearchAutoComplete)>
	//   10   16:putfield        #37  <Field Runnable a>
		b = getThreshold();
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #41  <Method int getThreshold()>
	//   14   24:putfield        #43  <Field int b>
	//   15   27:return          
	}
}
