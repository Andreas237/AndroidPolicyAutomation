// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.e;
import android.support.v7.view.c;
import android.text.*;
import android.text.style.ImageSpan;
import android.util.*;
import android.view.*;
import android.view.inputmethod.*;
import android.widget.*;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, av, ax, ap, 
//			bd, AppCompatAutoCompleteTextView

public class SearchView extends LinearLayoutCompat
	implements android.support.v7.view.c
{
	static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #46  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("SearchView.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #49  <String "SearchView.SavedState{">
		//    6   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #59  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #65  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" isIconified=");
		//   14   27:aload_1         
		//   15   28:ldc1            #67  <String " isIconified=">
		//   16   30:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(a);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #39  <Field boolean a>
		//   21   39:invokevirtual   #70  <Method StringBuilder StringBuilder.append(boolean)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #72  <String "}">
		//   25   46:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #74  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #78  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeValue(((Object) (Boolean.valueOf(a))));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #39  <Field boolean a>
		//    7   11:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
		//    8   14:invokevirtual   #86  <Method void Parcel.writeValue(Object)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SearchView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SearchView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class SearchView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void SearchView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i1)
			{
				return new SavedState[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method SearchView$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method SearchView$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method SearchView$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		boolean a;

		static 
		{
		//    0    0:new             #9   <Class SearchView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void SearchView$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #31  <Method Object Parcel.readValue(ClassLoader)>
		//    8   12:checkcast       #33  <Class Boolean>
		//    9   15:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
		//   10   18:putfield        #39  <Field boolean a>
		//   11   21:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static class SearchAutoComplete extends AppCompatAutoCompleteTextView
	{

		static void a(SearchAutoComplete searchautocomplete, boolean flag)
		{
			searchautocomplete.setImeVisibility(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #48  <Method void setImeVisibility(boolean)>
		//    3    5:return          
		}

		private boolean a()
		{
			return TextUtils.getTrimmedLength(((CharSequence) (getText()))) == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #53  <Method Editable getText()>
		//    2    4:invokestatic    #59  <Method int TextUtils.getTrimmedLength(CharSequence)>
		//    3    7:ifne            12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		static boolean a(SearchAutoComplete searchautocomplete)
		{
			return searchautocomplete.a();
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
				((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((View) (this)), 0);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #69  <Method Context getContext()>
		//    5   11:ldc1            #71  <String "input_method">
		//    6   13:invokevirtual   #77  <Method Object Context.getSystemService(String)>
		//    7   16:checkcast       #79  <Class InputMethodManager>
		//    8   19:aload_0         
		//    9   20:iconst_0        
		//   10   21:invokevirtual   #83  <Method boolean InputMethodManager.showSoftInput(View, int)>
		//   11   24:pop             
				d = false;
		//   12   25:aload_0         
		//   13   26:iconst_0        
		//   14   27:putfield        #65  <Field boolean d>
			}
		//   15   30:return          
		}

		static void b(SearchAutoComplete searchautocomplete)
		{
			searchautocomplete.b();
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
			int i1 = configuration.screenWidthDp;
		//    4    8:aload_3         
		//    5    9:getfield        #101 <Field int Configuration.screenWidthDp>
		//    6   12:istore_1        
			int j1 = configuration.screenHeightDp;
		//    7   13:aload_3         
		//    8   14:getfield        #104 <Field int Configuration.screenHeightDp>
		//    9   17:istore_2        
			if(i1 >= 960 && j1 >= 720 && configuration.orientation == 2)
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
			return i1 < 600 && (i1 < 640 || j1 < 480) ? 160 : 192;
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
			if(inputmethodmanager.isActive(((View) (this))))
		//*  23   42:aload_2         
		//*  24   43:aload_0         
		//*  25   44:invokevirtual   #123 <Method boolean InputMethodManager.isActive(View)>
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
				inputmethodmanager.showSoftInput(((View) (this)), 0);
		//   35   64:aload_2         
		//   36   65:aload_0         
		//   37   66:iconst_0        
		//   38   67:invokevirtual   #83  <Method boolean InputMethodManager.showSoftInput(View, int)>
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

		protected void onFocusChanged(boolean flag, int i1, Rect rect)
		{
			super.onFocusChanged(flag, i1, rect);
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

		public boolean onKeyPreIme(int i1, KeyEvent keyevent)
		{
			if(i1 == 4)
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
			return super.onKeyPreIme(i1, keyevent);
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
					SearchView.i.a(((AutoCompleteTextView) (this)), true);
		//   19   41:getstatic       #211 <Field SearchView$a SearchView.i>
		//   20   44:aload_0         
		//   21   45:iconst_1        
		//   22   46:invokevirtual   #216 <Method void SearchView$a.a(AutoCompleteTextView, boolean)>
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

		public void setThreshold(int i1)
		{
			super.setThreshold(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #224 <Method void AppCompatAutoCompleteTextView.setThreshold(int)>
			b = i1;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #43  <Field int b>
		//    6   10:return          
		}

		final Runnable a;
		private int b;
		private SearchView c;
		private boolean d;

		public SearchAutoComplete(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #22  <Method void SearchView$SearchAutoComplete(Context, AttributeSet)>
		//    4    6:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset)
		{
			this(context, attributeset, android.support.v7.a.a.a.autoCompleteTextViewStyle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #28  <Field int android.support.v7.a.a$a.autoCompleteTextViewStyle>
		//    4    6:invokespecial   #31  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
		//    5    9:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
		{
			super(context, attributeset, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #32  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
			a = new _cls1(this);
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

	private static class a
	{

		void a(AutoCompleteTextView autocompletetextview)
		{
			if(a == null)
				break MISSING_BLOCK_LABEL_20;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Method a>
		//    2    4:ifnull          20
			a.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field Method a>
		//    5   11:aload_1         
		//    6   12:iconst_0        
		//    7   13:anewarray       Object[]
		//    8   16:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
		//    9   19:pop             
			return;
		//   10   20:return          
			autocompletetextview;
		//   11   21:astore_1        
		//   12   22:return          
		}

		void a(AutoCompleteTextView autocompletetextview, boolean flag)
		{
			if(c == null)
				break MISSING_BLOCK_LABEL_27;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Method c>
		//    2    4:ifnull          27
			c.invoke(((Object) (autocompletetextview)), new Object[] {
				Boolean.valueOf(flag)
			});
		//    3    7:aload_0         
		//    4    8:getfield        #51  <Field Method c>
		//    5   11:aload_1         
		//    6   12:iconst_1        
		//    7   13:anewarray       Object[]
		//    8   16:dup             
		//    9   17:iconst_0        
		//   10   18:iload_2         
		//   11   19:invokestatic    #64  <Method Boolean Boolean.valueOf(boolean)>
		//   12   22:aastore         
		//   13   23:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
		//   14   26:pop             
			return;
		//   15   27:return          
			autocompletetextview;
		//   16   28:astore_1        
		//   17   29:return          
		}

		void b(AutoCompleteTextView autocompletetextview)
		{
			if(b == null)
				break MISSING_BLOCK_LABEL_20;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field Method b>
		//    2    4:ifnull          20
			b.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field Method b>
		//    5   11:aload_1         
		//    6   12:iconst_0        
		//    7   13:anewarray       Object[]
		//    8   16:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
		//    9   19:pop             
			return;
		//   10   20:return          
			autocompletetextview;
		//   11   21:astore_1        
		//   12   22:return          
		}

		private Method a;
		private Method b;
		private Method c;

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			try
			{
				a = ((Class) (android/widget/AutoCompleteTextView)).getDeclaredMethod("doBeforeTextChanged", new Class[0]);
		//    2    4:aload_0         
		//    3    5:ldc1            #18  <Class AutoCompleteTextView>
		//    4    7:ldc1            #20  <String "doBeforeTextChanged">
		//    5    9:iconst_0        
		//    6   10:anewarray       Class[]
		//    7   13:invokevirtual   #26  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    8   16:putfield        #28  <Field Method a>
				a.setAccessible(true);
		//    9   19:aload_0         
		//   10   20:getfield        #28  <Field Method a>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #34  <Method void Method.setAccessible(boolean)>
			}
		//*  13   27:aload_0         
		//*  14   28:ldc1            #18  <Class AutoCompleteTextView>
		//*  15   30:ldc1            #36  <String "doAfterTextChanged">
		//*  16   32:iconst_0        
		//*  17   33:anewarray       Class[]
		//*  18   36:invokevirtual   #26  <Method Method Class.getDeclaredMethod(String, Class[])>
		//*  19   39:putfield        #38  <Field Method b>
		//*  20   42:aload_0         
		//*  21   43:getfield        #38  <Field Method b>
		//*  22   46:iconst_1        
		//*  23   47:invokevirtual   #34  <Method void Method.setAccessible(boolean)>
		//*  24   50:aload_0         
		//*  25   51:ldc1            #18  <Class AutoCompleteTextView>
		//*  26   53:ldc1            #40  <String "ensureImeVisible">
		//*  27   55:iconst_1        
		//*  28   56:anewarray       Class[]
		//*  29   59:dup             
		//*  30   60:iconst_0        
		//*  31   61:getstatic       #46  <Field Class Boolean.TYPE>
		//*  32   64:aastore         
		//*  33   65:invokevirtual   #49  <Method Method Class.getMethod(String, Class[])>
		//*  34   68:putfield        #51  <Field Method c>
		//*  35   71:aload_0         
		//*  36   72:getfield        #51  <Field Method c>
		//*  37   75:iconst_1        
		//*  38   76:invokevirtual   #34  <Method void Method.setAccessible(boolean)>
		//*  39   79:return          
			catch(NoSuchMethodException nosuchmethodexception) { }
		//   40   80:astore_1        
			try
			{
				b = ((Class) (android/widget/AutoCompleteTextView)).getDeclaredMethod("doAfterTextChanged", new Class[0]);
				b.setAccessible(true);
			}
		//*  41   81:goto            27
			catch(NoSuchMethodException nosuchmethodexception1) { }
		//   42   84:astore_1        
			try
			{
				c = ((Class) (android/widget/AutoCompleteTextView)).getMethod("ensureImeVisible", new Class[] {
					Boolean.TYPE
				});
				c.setAccessible(true);
				return;
			}
		//*  43   85:goto            50
			catch(NoSuchMethodException nosuchmethodexception2)
		//*  44   88:astore_1        
			{
				return;
		//   45   89:return          
			}
		}
	}

	public static interface b
	{

		public abstract boolean a();
	}

	public static interface c
	{

		public abstract boolean a(String s1);

		public abstract boolean b(String s1);
	}

	public static interface d
	{

		public abstract boolean a(int i1);

		public abstract boolean b(int i1);
	}

	private static class e extends TouchDelegate
	{

		public void a(Rect rect, Rect rect1)
		{
			b.set(rect);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Rect b>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #60  <Method void Rect.set(Rect)>
			d.set(rect);
		//    4    8:aload_0         
		//    5    9:getfield        #48  <Field Rect d>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #60  <Method void Rect.set(Rect)>
			d.inset(-e, -e);
		//    8   16:aload_0         
		//    9   17:getfield        #48  <Field Rect d>
		//   10   20:aload_0         
		//   11   21:getfield        #39  <Field int e>
		//   12   24:ineg            
		//   13   25:aload_0         
		//   14   26:getfield        #39  <Field int e>
		//   15   29:ineg            
		//   16   30:invokevirtual   #64  <Method void Rect.inset(int, int)>
			c.set(rect1);
		//   17   33:aload_0         
		//   18   34:getfield        #50  <Field Rect c>
		//   19   37:aload_2         
		//   20   38:invokevirtual   #60  <Method void Rect.set(Rect)>
		//   21   41:return          
		}

		public boolean onTouchEvent(MotionEvent motionevent)
		{
			int j1 = (int)motionevent.getX();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #72  <Method float MotionEvent.getX()>
		//    2    4:f2i             
		//    3    5:istore          5
			int k1 = (int)motionevent.getY();
		//    4    7:aload_1         
		//    5    8:invokevirtual   #75  <Method float MotionEvent.getY()>
		//    6   11:f2i             
		//    7   12:istore          6
			int i1 = motionevent.getAction();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #78  <Method int MotionEvent.getAction()>
		//   10   18:istore_3        
			boolean flag = true;
		//   11   19:iconst_1        
		//   12   20:istore          4
			boolean flag2 = false;
		//   13   22:iconst_0        
		//   14   23:istore          8
			boolean flag1;
			switch(i1)
		//*  15   25:iload_3         
			{
		//*  16   26:tableswitch     0 3: default 56
		//		               0 124
		//		               1 76
		//		               2 76
		//		               3 59
		//*  17   56:goto            152
			case 3: // '\003'
				flag1 = f;
		//   18   59:aload_0         
		//   19   60:getfield        #80  <Field boolean f>
		//   20   63:istore          7
				f = false;
		//   21   65:aload_0         
		//   22   66:iconst_0        
		//   23   67:putfield        #80  <Field boolean f>
				i1 = ((int) (flag));
		//   24   70:iload           4
		//   25   72:istore_3        
				break;
		//   26   73:goto            158

			case 1: // '\001'
			case 2: // '\002'
				boolean flag3 = f;
		//   27   76:aload_0         
		//   28   77:getfield        #80  <Field boolean f>
		//   29   80:istore          9
				flag1 = flag3;
		//   30   82:iload           9
		//   31   84:istore          7
				i1 = ((int) (flag));
		//   32   86:iload           4
		//   33   88:istore_3        
				if(flag3)
		//*  34   89:iload           9
		//*  35   91:ifeq            158
				{
					flag1 = flag3;
		//   36   94:iload           9
		//   37   96:istore          7
					i1 = ((int) (flag));
		//   38   98:iload           4
		//   39  100:istore_3        
					if(!d.contains(j1, k1))
		//*  40  101:aload_0         
		//*  41  102:getfield        #48  <Field Rect d>
		//*  42  105:iload           5
		//*  43  107:iload           6
		//*  44  109:invokevirtual   #84  <Method boolean Rect.contains(int, int)>
		//*  45  112:ifne            158
					{
						i1 = 0;
		//   46  115:iconst_0        
		//   47  116:istore_3        
						flag1 = flag3;
		//   48  117:iload           9
		//   49  119:istore          7
					}
				}
				break;
		//   50  121:goto            158

			case 0: // '\0'
				if(b.contains(j1, k1))
		//*  51  124:aload_0         
		//*  52  125:getfield        #46  <Field Rect b>
		//*  53  128:iload           5
		//*  54  130:iload           6
		//*  55  132:invokevirtual   #84  <Method boolean Rect.contains(int, int)>
		//*  56  135:ifeq            152
				{
					f = true;
		//   57  138:aload_0         
		//   58  139:iconst_1        
		//   59  140:putfield        #80  <Field boolean f>
					flag1 = true;
		//   60  143:iconst_1        
		//   61  144:istore          7
					i1 = ((int) (flag));
		//   62  146:iload           4
		//   63  148:istore_3        
					break;
		//   64  149:goto            158
				}
				// fall through

			default:
				flag1 = false;
		//   65  152:iconst_0        
		//   66  153:istore          7
				i1 = ((int) (flag));
		//   67  155:iload           4
		//   68  157:istore_3        
				break;
			}
			if(flag1)
		//*  69  158:iload           7
		//*  70  160:ifeq            245
			{
				float f1;
				if(i1 && !c.contains(j1, k1))
		//*  71  163:iload_3         
		//*  72  164:ifeq            205
		//*  73  167:aload_0         
		//*  74  168:getfield        #50  <Field Rect c>
		//*  75  171:iload           5
		//*  76  173:iload           6
		//*  77  175:invokevirtual   #84  <Method boolean Rect.contains(int, int)>
		//*  78  178:ifne            205
				{
					f1 = a.getWidth() / 2;
		//   79  181:aload_0         
		//   80  182:getfield        #55  <Field View a>
		//   81  185:invokevirtual   #87  <Method int View.getWidth()>
		//   82  188:iconst_2        
		//   83  189:idiv            
		//   84  190:i2f             
		//   85  191:fstore_2        
					i1 = a.getHeight() / 2;
		//   86  192:aload_0         
		//   87  193:getfield        #55  <Field View a>
		//   88  196:invokevirtual   #90  <Method int View.getHeight()>
		//   89  199:iconst_2        
		//   90  200:idiv            
		//   91  201:istore_3        
				} else
		//*  92  202:goto            228
				{
					f1 = j1 - c.left;
		//   93  205:iload           5
		//   94  207:aload_0         
		//   95  208:getfield        #50  <Field Rect c>
		//   96  211:getfield        #93  <Field int Rect.left>
		//   97  214:isub            
		//   98  215:i2f             
		//   99  216:fstore_2        
					i1 = k1 - c.top;
		//  100  217:iload           6
		//  101  219:aload_0         
		//  102  220:getfield        #50  <Field Rect c>
		//  103  223:getfield        #96  <Field int Rect.top>
		//  104  226:isub            
		//  105  227:istore_3        
				}
				motionevent.setLocation(f1, i1);
		//  106  228:aload_1         
		//  107  229:fload_2         
		//  108  230:iload_3         
		//  109  231:i2f             
		//  110  232:invokevirtual   #100 <Method void MotionEvent.setLocation(float, float)>
				flag2 = a.dispatchTouchEvent(motionevent);
		//  111  235:aload_0         
		//  112  236:getfield        #55  <Field View a>
		//  113  239:aload_1         
		//  114  240:invokevirtual   #103 <Method boolean View.dispatchTouchEvent(MotionEvent)>
		//  115  243:istore          8
			}
			return flag2;
		//  116  245:iload           8
		//  117  247:ireturn         
		}

		private final View a;
		private final Rect b = new Rect();
		private final Rect c = new Rect();
		private final Rect d = new Rect();
		private final int e;
		private boolean f;

		public e(Rect rect, Rect rect1, View view)
		{
			super(rect, view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_3         
		//    3    3:invokespecial   #21  <Method void TouchDelegate(Rect, View)>
			e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:invokevirtual   #27  <Method Context View.getContext()>
		//    7   11:invokestatic    #33  <Method ViewConfiguration ViewConfiguration.get(Context)>
		//    8   14:invokevirtual   #37  <Method int ViewConfiguration.getScaledTouchSlop()>
		//    9   17:putfield        #39  <Field int e>
		//   10   20:aload_0         
		//   11   21:new             #41  <Class Rect>
		//   12   24:dup             
		//   13   25:invokespecial   #44  <Method void Rect()>
		//   14   28:putfield        #46  <Field Rect b>
		//   15   31:aload_0         
		//   16   32:new             #41  <Class Rect>
		//   17   35:dup             
		//   18   36:invokespecial   #44  <Method void Rect()>
		//   19   39:putfield        #48  <Field Rect d>
		//   20   42:aload_0         
		//   21   43:new             #41  <Class Rect>
		//   22   46:dup             
		//   23   47:invokespecial   #44  <Method void Rect()>
		//   24   50:putfield        #50  <Field Rect c>
			a(rect, rect1);
		//   25   53:aload_0         
		//   26   54:aload_1         
		//   27   55:aload_2         
		//   28   56:invokevirtual   #53  <Method void a(Rect, Rect)>
			a = view;
		//   29   59:aload_0         
		//   30   60:aload_3         
		//   31   61:putfield        #55  <Field View a>
		//   32   64:return          
		}
	}


	public SearchView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #136 <Method void SearchView(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.searchViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #141 <Field int android.support.v7.a.a$a.searchViewStyle>
	//    4    6:invokespecial   #144 <Method void SearchView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #145 <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		p = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #147 <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #148 <Method void Rect()>
	//    9   15:putfield        #150 <Field Rect p>
		q = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #147 <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #148 <Method void Rect()>
	//   14   26:putfield        #152 <Field Rect q>
		r = new int[2];
	//   15   29:aload_0         
	//   16   30:iconst_2        
	//   17   31:newarray        int[]
	//   18   33:putfield        #154 <Field int[] r>
		s = new int[2];
	//   19   36:aload_0         
	//   20   37:iconst_2        
	//   21   38:newarray        int[]
	//   22   40:putfield        #156 <Field int[] s>
		R = new Runnable() {

			public void run()
			{
				a.d();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView a>
			//    2    4:invokevirtual   #22  <Method void SearchView.d()>
			//    3    7:return          
			}

			final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   23   43:aload_0         
	//   24   44:new             #8   <Class SearchView$1>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:invokespecial   #159 <Method void SearchView$1(SearchView)>
	//   28   52:putfield        #161 <Field Runnable R>
	//   29   55:aload_0         
	//   30   56:new             #14  <Class SearchView$3>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #162 <Method void SearchView$3(SearchView)>
	//   34   64:putfield        #164 <Field Runnable S>
		T = new WeakHashMap();
	//   35   67:aload_0         
	//   36   68:new             #166 <Class WeakHashMap>
	//   37   71:dup             
	//   38   72:invokespecial   #167 <Method void WeakHashMap()>
	//   39   75:putfield        #169 <Field WeakHashMap T>
		U = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(view == a.b)
			//*   0    0:aload_1         
			//*   1    1:aload_0         
			//*   2    2:getfield        #14  <Field SearchView a>
			//*   3    5:getfield        #24  <Field ImageView SearchView.b>
			//*   4    8:if_acmpne       19
				{
					a.g();
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field SearchView a>
			//    7   15:invokevirtual   #27  <Method void SearchView.g()>
					return;
			//    8   18:return          
				}
				if(view == a.d)
			//*   9   19:aload_1         
			//*  10   20:aload_0         
			//*  11   21:getfield        #14  <Field SearchView a>
			//*  12   24:getfield        #30  <Field ImageView SearchView.d>
			//*  13   27:if_acmpne       38
				{
					a.f();
			//   14   30:aload_0         
			//   15   31:getfield        #14  <Field SearchView a>
			//   16   34:invokevirtual   #33  <Method void SearchView.f()>
					return;
			//   17   37:return          
				}
				if(view == a.c)
			//*  18   38:aload_1         
			//*  19   39:aload_0         
			//*  20   40:getfield        #14  <Field SearchView a>
			//*  21   43:getfield        #36  <Field ImageView android.support.v7.widget.SearchView.c>
			//*  22   46:if_acmpne       57
				{
					a.e();
			//   23   49:aload_0         
			//   24   50:getfield        #14  <Field SearchView a>
			//   25   53:invokevirtual   #39  <Method void android.support.v7.widget.SearchView.e()>
					return;
			//   26   56:return          
				}
				if(view == a.e)
			//*  27   57:aload_1         
			//*  28   58:aload_0         
			//*  29   59:getfield        #14  <Field SearchView a>
			//*  30   62:getfield        #41  <Field ImageView android.support.v7.widget.SearchView.e>
			//*  31   65:if_acmpne       76
				{
					a.h();
			//   32   68:aload_0         
			//   33   69:getfield        #14  <Field SearchView a>
			//   34   72:invokevirtual   #44  <Method void SearchView.h()>
					return;
			//   35   75:return          
				}
				if(view == a.a)
			//*  36   76:aload_1         
			//*  37   77:aload_0         
			//*  38   78:getfield        #14  <Field SearchView a>
			//*  39   81:getfield        #47  <Field SearchView$SearchAutoComplete SearchView.a>
			//*  40   84:if_acmpne       94
					a.l();
			//   41   87:aload_0         
			//   42   88:getfield        #14  <Field SearchView a>
			//   43   91:invokevirtual   #50  <Method void SearchView.l()>
			//   44   94:return          
			}

			final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   40   78:aload_0         
	//   41   79:new             #20  <Class SearchView$6>
	//   42   82:dup             
	//   43   83:aload_0         
	//   44   84:invokespecial   #170 <Method void SearchView$6(SearchView)>
	//   45   87:putfield        #172 <Field android.view.View$OnClickListener U>
	//   46   90:aload_0         
	//   47   91:new             #22  <Class SearchView$7>
	//   48   94:dup             
	//   49   95:aload_0         
	//   50   96:invokespecial   #173 <Method void SearchView$7(SearchView)>
	//   51   99:putfield        #175 <Field android.view.View$OnKeyListener j>
		V = new android.widget.TextView.OnEditorActionListener() {

			public boolean onEditorAction(TextView textview, int j1, KeyEvent keyevent)
			{
				a.e();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView a>
			//    2    4:invokevirtual   #23  <Method void android.support.v7.widget.SearchView.e()>
				return true;
			//    3    7:iconst_1        
			//    4    8:ireturn         
			}

			final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   52  102:aload_0         
	//   53  103:new             #24  <Class SearchView$8>
	//   54  106:dup             
	//   55  107:aload_0         
	//   56  108:invokespecial   #176 <Method void SearchView$8(SearchView)>
	//   57  111:putfield        #178 <Field android.widget.TextView$OnEditorActionListener V>
		W = new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view, int j1, long l1)
			{
				a.a(j1, 0, ((String) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView a>
			//    2    4:iload_3         
			//    3    5:iconst_0        
			//    4    6:aconst_null     
			//    5    7:invokevirtual   #23  <Method boolean SearchView.a(int, int, String)>
			//    6   10:pop             
			//    7   11:return          
			}

			final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   58  114:aload_0         
	//   59  115:new             #26  <Class SearchView$9>
	//   60  118:dup             
	//   61  119:aload_0         
	//   62  120:invokespecial   #179 <Method void SearchView$9(SearchView)>
	//   63  123:putfield        #181 <Field android.widget.AdapterView$OnItemClickListener W>
		aa = new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view, int j1, long l1)
			{
				a.a(j1);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView a>
			//    2    4:iload_3         
			//    3    5:invokevirtual   #23  <Method boolean SearchView.a(int)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void onNothingSelected(AdapterView adapterview)
			{
			//    0    0:return          
			}

			final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   64  126:aload_0         
	//   65  127:new             #10  <Class SearchView$10>
	//   66  130:dup             
	//   67  131:aload_0         
	//   68  132:invokespecial   #182 <Method void SearchView$10(SearchView)>
	//   69  135:putfield        #184 <Field android.widget.AdapterView$OnItemSelectedListener aa>
	//   70  138:aload_0         
	//   71  139:new             #12  <Class SearchView$2>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:invokespecial   #185 <Method void SearchView$2(SearchView)>
	//   75  147:putfield        #187 <Field TextWatcher ab>
		attributeset = ((AttributeSet) (av.a(context, attributeset, android.support.v7.a.a.j.SearchView, i1, 0)));
	//   76  150:aload_1         
	//   77  151:aload_2         
	//   78  152:getstatic       #192 <Field int[] android.support.v7.a.a$j.SearchView>
	//   79  155:iload_3         
	//   80  156:iconst_0        
	//   81  157:invokestatic    #197 <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   82  160:astore_2        
		LayoutInflater.from(context).inflate(((av) (attributeset)).g(android.support.v7.a.a.j.SearchView_layout, android.support.v7.a.a.g.abc_search_view), ((android.view.ViewGroup) (this)), true);
	//   83  161:aload_1         
	//   84  162:invokestatic    #203 <Method LayoutInflater LayoutInflater.from(Context)>
	//   85  165:aload_2         
	//   86  166:getstatic       #206 <Field int android.support.v7.a.a$j.SearchView_layout>
	//   87  169:getstatic       #211 <Field int android.support.v7.a.a$g.abc_search_view>
	//   88  172:invokevirtual   #214 <Method int av.g(int, int)>
	//   89  175:aload_0         
	//   90  176:iconst_1        
	//   91  177:invokevirtual   #218 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   92  180:pop             
		a = (SearchAutoComplete)findViewById(android.support.v7.a.a.f.search_src_text);
	//   93  181:aload_0         
	//   94  182:aload_0         
	//   95  183:getstatic       #223 <Field int android.support.v7.a.a$f.search_src_text>
	//   96  186:invokevirtual   #227 <Method View findViewById(int)>
	//   97  189:checkcast       #33  <Class SearchView$SearchAutoComplete>
	//   98  192:putfield        #229 <Field SearchView$SearchAutoComplete a>
		a.setSearchView(this);
	//   99  195:aload_0         
	//  100  196:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  101  199:aload_0         
	//  102  200:invokevirtual   #232 <Method void SearchView$SearchAutoComplete.setSearchView(SearchView)>
		k = findViewById(android.support.v7.a.a.f.search_edit_frame);
	//  103  203:aload_0         
	//  104  204:aload_0         
	//  105  205:getstatic       #235 <Field int android.support.v7.a.a$f.search_edit_frame>
	//  106  208:invokevirtual   #227 <Method View findViewById(int)>
	//  107  211:putfield        #237 <Field View k>
		l = findViewById(android.support.v7.a.a.f.search_plate);
	//  108  214:aload_0         
	//  109  215:aload_0         
	//  110  216:getstatic       #240 <Field int android.support.v7.a.a$f.search_plate>
	//  111  219:invokevirtual   #227 <Method View findViewById(int)>
	//  112  222:putfield        #242 <Field View l>
		m = findViewById(android.support.v7.a.a.f.submit_area);
	//  113  225:aload_0         
	//  114  226:aload_0         
	//  115  227:getstatic       #245 <Field int android.support.v7.a.a$f.submit_area>
	//  116  230:invokevirtual   #227 <Method View findViewById(int)>
	//  117  233:putfield        #247 <Field View m>
		b = (ImageView)findViewById(android.support.v7.a.a.f.search_button);
	//  118  236:aload_0         
	//  119  237:aload_0         
	//  120  238:getstatic       #250 <Field int android.support.v7.a.a$f.search_button>
	//  121  241:invokevirtual   #227 <Method View findViewById(int)>
	//  122  244:checkcast       #252 <Class ImageView>
	//  123  247:putfield        #254 <Field ImageView b>
		c = (ImageView)findViewById(android.support.v7.a.a.f.search_go_btn);
	//  124  250:aload_0         
	//  125  251:aload_0         
	//  126  252:getstatic       #257 <Field int android.support.v7.a.a$f.search_go_btn>
	//  127  255:invokevirtual   #227 <Method View findViewById(int)>
	//  128  258:checkcast       #252 <Class ImageView>
	//  129  261:putfield        #259 <Field ImageView c>
		d = (ImageView)findViewById(android.support.v7.a.a.f.search_close_btn);
	//  130  264:aload_0         
	//  131  265:aload_0         
	//  132  266:getstatic       #262 <Field int android.support.v7.a.a$f.search_close_btn>
	//  133  269:invokevirtual   #227 <Method View findViewById(int)>
	//  134  272:checkcast       #252 <Class ImageView>
	//  135  275:putfield        #264 <Field ImageView d>
		e = (ImageView)findViewById(android.support.v7.a.a.f.search_voice_btn);
	//  136  278:aload_0         
	//  137  279:aload_0         
	//  138  280:getstatic       #267 <Field int android.support.v7.a.a$f.search_voice_btn>
	//  139  283:invokevirtual   #227 <Method View findViewById(int)>
	//  140  286:checkcast       #252 <Class ImageView>
	//  141  289:putfield        #269 <Field ImageView e>
		t = (ImageView)findViewById(android.support.v7.a.a.f.search_mag_icon);
	//  142  292:aload_0         
	//  143  293:aload_0         
	//  144  294:getstatic       #272 <Field int android.support.v7.a.a$f.search_mag_icon>
	//  145  297:invokevirtual   #227 <Method View findViewById(int)>
	//  146  300:checkcast       #252 <Class ImageView>
	//  147  303:putfield        #274 <Field ImageView t>
		android.support.v4.view.s.a(l, ((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_queryBackground));
	//  148  306:aload_0         
	//  149  307:getfield        #242 <Field View l>
	//  150  310:aload_2         
	//  151  311:getstatic       #277 <Field int android.support.v7.a.a$j.SearchView_queryBackground>
	//  152  314:invokevirtual   #280 <Method Drawable av.a(int)>
	//  153  317:invokestatic    #285 <Method void s.a(View, Drawable)>
		android.support.v4.view.s.a(m, ((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_submitBackground));
	//  154  320:aload_0         
	//  155  321:getfield        #247 <Field View m>
	//  156  324:aload_2         
	//  157  325:getstatic       #288 <Field int android.support.v7.a.a$j.SearchView_submitBackground>
	//  158  328:invokevirtual   #280 <Method Drawable av.a(int)>
	//  159  331:invokestatic    #285 <Method void s.a(View, Drawable)>
		b.setImageDrawable(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_searchIcon));
	//  160  334:aload_0         
	//  161  335:getfield        #254 <Field ImageView b>
	//  162  338:aload_2         
	//  163  339:getstatic       #291 <Field int android.support.v7.a.a$j.SearchView_searchIcon>
	//  164  342:invokevirtual   #280 <Method Drawable av.a(int)>
	//  165  345:invokevirtual   #295 <Method void ImageView.setImageDrawable(Drawable)>
		c.setImageDrawable(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_goIcon));
	//  166  348:aload_0         
	//  167  349:getfield        #259 <Field ImageView c>
	//  168  352:aload_2         
	//  169  353:getstatic       #298 <Field int android.support.v7.a.a$j.SearchView_goIcon>
	//  170  356:invokevirtual   #280 <Method Drawable av.a(int)>
	//  171  359:invokevirtual   #295 <Method void ImageView.setImageDrawable(Drawable)>
		d.setImageDrawable(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_closeIcon));
	//  172  362:aload_0         
	//  173  363:getfield        #264 <Field ImageView d>
	//  174  366:aload_2         
	//  175  367:getstatic       #301 <Field int android.support.v7.a.a$j.SearchView_closeIcon>
	//  176  370:invokevirtual   #280 <Method Drawable av.a(int)>
	//  177  373:invokevirtual   #295 <Method void ImageView.setImageDrawable(Drawable)>
		e.setImageDrawable(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_voiceIcon));
	//  178  376:aload_0         
	//  179  377:getfield        #269 <Field ImageView e>
	//  180  380:aload_2         
	//  181  381:getstatic       #304 <Field int android.support.v7.a.a$j.SearchView_voiceIcon>
	//  182  384:invokevirtual   #280 <Method Drawable av.a(int)>
	//  183  387:invokevirtual   #295 <Method void ImageView.setImageDrawable(Drawable)>
		t.setImageDrawable(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_searchIcon));
	//  184  390:aload_0         
	//  185  391:getfield        #274 <Field ImageView t>
	//  186  394:aload_2         
	//  187  395:getstatic       #291 <Field int android.support.v7.a.a$j.SearchView_searchIcon>
	//  188  398:invokevirtual   #280 <Method Drawable av.a(int)>
	//  189  401:invokevirtual   #295 <Method void ImageView.setImageDrawable(Drawable)>
		u = ((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_searchHintIcon);
	//  190  404:aload_0         
	//  191  405:aload_2         
	//  192  406:getstatic       #307 <Field int android.support.v7.a.a$j.SearchView_searchHintIcon>
	//  193  409:invokevirtual   #280 <Method Drawable av.a(int)>
	//  194  412:putfield        #309 <Field Drawable u>
		ax.a(((View) (b)), ((CharSequence) (getResources().getString(android.support.v7.a.a.h.abc_searchview_description_search))));
	//  195  415:aload_0         
	//  196  416:getfield        #254 <Field ImageView b>
	//  197  419:aload_0         
	//  198  420:invokevirtual   #313 <Method Resources getResources()>
	//  199  423:getstatic       #318 <Field int android.support.v7.a.a$h.abc_searchview_description_search>
	//  200  426:invokevirtual   #324 <Method String Resources.getString(int)>
	//  201  429:invokestatic    #329 <Method void ax.a(View, CharSequence)>
		v = ((av) (attributeset)).g(android.support.v7.a.a.j.SearchView_suggestionRowLayout, android.support.v7.a.a.g.abc_search_dropdown_item_icons_2line);
	//  202  432:aload_0         
	//  203  433:aload_2         
	//  204  434:getstatic       #332 <Field int android.support.v7.a.a$j.SearchView_suggestionRowLayout>
	//  205  437:getstatic       #335 <Field int android.support.v7.a.a$g.abc_search_dropdown_item_icons_2line>
	//  206  440:invokevirtual   #214 <Method int av.g(int, int)>
	//  207  443:putfield        #337 <Field int v>
		w = ((av) (attributeset)).g(android.support.v7.a.a.j.SearchView_commitIcon, 0);
	//  208  446:aload_0         
	//  209  447:aload_2         
	//  210  448:getstatic       #340 <Field int android.support.v7.a.a$j.SearchView_commitIcon>
	//  211  451:iconst_0        
	//  212  452:invokevirtual   #214 <Method int av.g(int, int)>
	//  213  455:putfield        #342 <Field int w>
		b.setOnClickListener(U);
	//  214  458:aload_0         
	//  215  459:getfield        #254 <Field ImageView b>
	//  216  462:aload_0         
	//  217  463:getfield        #172 <Field android.view.View$OnClickListener U>
	//  218  466:invokevirtual   #346 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		d.setOnClickListener(U);
	//  219  469:aload_0         
	//  220  470:getfield        #264 <Field ImageView d>
	//  221  473:aload_0         
	//  222  474:getfield        #172 <Field android.view.View$OnClickListener U>
	//  223  477:invokevirtual   #346 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		c.setOnClickListener(U);
	//  224  480:aload_0         
	//  225  481:getfield        #259 <Field ImageView c>
	//  226  484:aload_0         
	//  227  485:getfield        #172 <Field android.view.View$OnClickListener U>
	//  228  488:invokevirtual   #346 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		e.setOnClickListener(U);
	//  229  491:aload_0         
	//  230  492:getfield        #269 <Field ImageView e>
	//  231  495:aload_0         
	//  232  496:getfield        #172 <Field android.view.View$OnClickListener U>
	//  233  499:invokevirtual   #346 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		a.setOnClickListener(U);
	//  234  502:aload_0         
	//  235  503:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  236  506:aload_0         
	//  237  507:getfield        #172 <Field android.view.View$OnClickListener U>
	//  238  510:invokevirtual   #347 <Method void SearchView$SearchAutoComplete.setOnClickListener(android.view.View$OnClickListener)>
		a.addTextChangedListener(ab);
	//  239  513:aload_0         
	//  240  514:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  241  517:aload_0         
	//  242  518:getfield        #187 <Field TextWatcher ab>
	//  243  521:invokevirtual   #351 <Method void SearchView$SearchAutoComplete.addTextChangedListener(TextWatcher)>
		a.setOnEditorActionListener(V);
	//  244  524:aload_0         
	//  245  525:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  246  528:aload_0         
	//  247  529:getfield        #178 <Field android.widget.TextView$OnEditorActionListener V>
	//  248  532:invokevirtual   #355 <Method void SearchView$SearchAutoComplete.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		a.setOnItemClickListener(W);
	//  249  535:aload_0         
	//  250  536:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  251  539:aload_0         
	//  252  540:getfield        #181 <Field android.widget.AdapterView$OnItemClickListener W>
	//  253  543:invokevirtual   #359 <Method void SearchView$SearchAutoComplete.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		a.setOnItemSelectedListener(aa);
	//  254  546:aload_0         
	//  255  547:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  256  550:aload_0         
	//  257  551:getfield        #184 <Field android.widget.AdapterView$OnItemSelectedListener aa>
	//  258  554:invokevirtual   #363 <Method void SearchView$SearchAutoComplete.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		a.setOnKeyListener(j);
	//  259  557:aload_0         
	//  260  558:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  261  561:aload_0         
	//  262  562:getfield        #175 <Field android.view.View$OnKeyListener j>
	//  263  565:invokevirtual   #367 <Method void SearchView$SearchAutoComplete.setOnKeyListener(android.view.View$OnKeyListener)>
		a.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

			public void onFocusChange(View view, boolean flag)
			{
				if(a.f != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field SearchView a>
			//*   2    4:getfield        #26  <Field android.view.View$OnFocusChangeListener SearchView.f>
			//*   3    7:ifnull          27
					a.f.onFocusChange(((View) (a)), flag);
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field SearchView a>
			//    6   14:getfield        #26  <Field android.view.View$OnFocusChangeListener SearchView.f>
			//    7   17:aload_0         
			//    8   18:getfield        #16  <Field SearchView a>
			//    9   21:iload_2         
			//   10   22:invokeinterface #28  <Method void android.view.View$OnFocusChangeListener.onFocusChange(View, boolean)>
			//   11   27:return          
			}

			final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  264  568:aload_0         
	//  265  569:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  266  572:new             #16  <Class SearchView$4>
	//  267  575:dup             
	//  268  576:aload_0         
	//  269  577:invokespecial   #368 <Method void SearchView$4(SearchView)>
	//  270  580:invokevirtual   #372 <Method void SearchView$SearchAutoComplete.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
		setIconifiedByDefault(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_iconifiedByDefault, true));
	//  271  583:aload_0         
	//  272  584:aload_2         
	//  273  585:getstatic       #375 <Field int android.support.v7.a.a$j.SearchView_iconifiedByDefault>
	//  274  588:iconst_1        
	//  275  589:invokevirtual   #378 <Method boolean av.a(int, boolean)>
	//  276  592:invokevirtual   #382 <Method void setIconifiedByDefault(boolean)>
		i1 = ((av) (attributeset)).e(android.support.v7.a.a.j.SearchView_android_maxWidth, -1);
	//  277  595:aload_2         
	//  278  596:getstatic       #385 <Field int android.support.v7.a.a$j.SearchView_android_maxWidth>
	//  279  599:iconst_m1       
	//  280  600:invokevirtual   #387 <Method int android.support.v7.widget.av.e(int, int)>
	//  281  603:istore_3        
		if(i1 != -1)
	//* 282  604:iload_3         
	//* 283  605:iconst_m1       
	//* 284  606:icmpeq          614
			setMaxWidth(i1);
	//  285  609:aload_0         
	//  286  610:iload_3         
	//  287  611:invokevirtual   #391 <Method void setMaxWidth(int)>
		z = ((av) (attributeset)).c(android.support.v7.a.a.j.SearchView_defaultQueryHint);
	//  288  614:aload_0         
	//  289  615:aload_2         
	//  290  616:getstatic       #394 <Field int android.support.v7.a.a$j.SearchView_defaultQueryHint>
	//  291  619:invokevirtual   #397 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  292  622:putfield        #399 <Field CharSequence z>
		H = ((av) (attributeset)).c(android.support.v7.a.a.j.SearchView_queryHint);
	//  293  625:aload_0         
	//  294  626:aload_2         
	//  295  627:getstatic       #402 <Field int android.support.v7.a.a$j.SearchView_queryHint>
	//  296  630:invokevirtual   #397 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  297  633:putfield        #404 <Field CharSequence H>
		i1 = ((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_android_imeOptions, -1);
	//  298  636:aload_2         
	//  299  637:getstatic       #407 <Field int android.support.v7.a.a$j.SearchView_android_imeOptions>
	//  300  640:iconst_m1       
	//  301  641:invokevirtual   #409 <Method int av.a(int, int)>
	//  302  644:istore_3        
		if(i1 != -1)
	//* 303  645:iload_3         
	//* 304  646:iconst_m1       
	//* 305  647:icmpeq          655
			setImeOptions(i1);
	//  306  650:aload_0         
	//  307  651:iload_3         
	//  308  652:invokevirtual   #412 <Method void setImeOptions(int)>
		i1 = ((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_android_inputType, -1);
	//  309  655:aload_2         
	//  310  656:getstatic       #415 <Field int android.support.v7.a.a$j.SearchView_android_inputType>
	//  311  659:iconst_m1       
	//  312  660:invokevirtual   #409 <Method int av.a(int, int)>
	//  313  663:istore_3        
		if(i1 != -1)
	//* 314  664:iload_3         
	//* 315  665:iconst_m1       
	//* 316  666:icmpeq          674
			setInputType(i1);
	//  317  669:aload_0         
	//  318  670:iload_3         
	//  319  671:invokevirtual   #418 <Method void setInputType(int)>
		setFocusable(((av) (attributeset)).a(android.support.v7.a.a.j.SearchView_android_focusable, true));
	//  320  674:aload_0         
	//  321  675:aload_2         
	//  322  676:getstatic       #421 <Field int android.support.v7.a.a$j.SearchView_android_focusable>
	//  323  679:iconst_1        
	//  324  680:invokevirtual   #378 <Method boolean av.a(int, boolean)>
	//  325  683:invokevirtual   #424 <Method void setFocusable(boolean)>
		((av) (attributeset)).a();
	//  326  686:aload_2         
	//  327  687:invokevirtual   #426 <Method void av.a()>
		x = new Intent("android.speech.action.WEB_SEARCH");
	//  328  690:aload_0         
	//  329  691:new             #428 <Class Intent>
	//  330  694:dup             
	//  331  695:ldc2            #430 <String "android.speech.action.WEB_SEARCH">
	//  332  698:invokespecial   #433 <Method void Intent(String)>
	//  333  701:putfield        #435 <Field Intent x>
		x.addFlags(0x10000000);
	//  334  704:aload_0         
	//  335  705:getfield        #435 <Field Intent x>
	//  336  708:ldc2            #436 <Int 0x10000000>
	//  337  711:invokevirtual   #440 <Method Intent Intent.addFlags(int)>
	//  338  714:pop             
		x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
	//  339  715:aload_0         
	//  340  716:getfield        #435 <Field Intent x>
	//  341  719:ldc2            #442 <String "android.speech.extra.LANGUAGE_MODEL">
	//  342  722:ldc2            #444 <String "web_search">
	//  343  725:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//  344  728:pop             
		y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
	//  345  729:aload_0         
	//  346  730:new             #428 <Class Intent>
	//  347  733:dup             
	//  348  734:ldc2            #450 <String "android.speech.action.RECOGNIZE_SPEECH">
	//  349  737:invokespecial   #433 <Method void Intent(String)>
	//  350  740:putfield        #452 <Field Intent y>
		y.addFlags(0x10000000);
	//  351  743:aload_0         
	//  352  744:getfield        #452 <Field Intent y>
	//  353  747:ldc2            #436 <Int 0x10000000>
	//  354  750:invokevirtual   #440 <Method Intent Intent.addFlags(int)>
	//  355  753:pop             
		n = findViewById(a.getDropDownAnchor());
	//  356  754:aload_0         
	//  357  755:aload_0         
	//  358  756:aload_0         
	//  359  757:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//  360  760:invokevirtual   #456 <Method int SearchView$SearchAutoComplete.getDropDownAnchor()>
	//  361  763:invokevirtual   #227 <Method View findViewById(int)>
	//  362  766:putfield        #458 <Field View n>
		if(n != null)
	//* 363  769:aload_0         
	//* 364  770:getfield        #458 <Field View n>
	//* 365  773:ifnull          791
			n.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

				public void onLayoutChange(View view, int j1, int k1, int l1, int i2, int j2, int k2, 
						int l2, int i3)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field SearchView a>
				//    2    4:invokevirtual   #25  <Method void SearchView.k()>
				//    3    7:return          
				}

				final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  366  776:aload_0         
	//  367  777:getfield        #458 <Field View n>
	//  368  780:new             #18  <Class SearchView$5>
	//  369  783:dup             
	//  370  784:aload_0         
	//  371  785:invokespecial   #459 <Method void SearchView$5(SearchView)>
	//  372  788:invokevirtual   #465 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		a(E);
	//  373  791:aload_0         
	//  374  792:aload_0         
	//  375  793:getfield        #467 <Field boolean E>
	//  376  796:invokespecial   #469 <Method void a(boolean)>
		r();
	//  377  799:aload_0         
	//  378  800:invokespecial   #471 <Method void r()>
	//  379  803:return          
	}

	private Intent a(Intent intent, SearchableInfo searchableinfo)
	{
		Intent intent1 = new Intent(intent);
	//    0    0:new             #428 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #475 <Method void Intent(Intent)>
	//    4    8:astore_3        
		intent = ((Intent) (searchableinfo.getSearchActivity()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #481 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    7   13:astore_1        
		if(intent == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
			intent = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		else
	//*  12   20:goto            28
			intent = ((Intent) (((ComponentName) (intent)).flattenToShortString()));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #487 <Method String ComponentName.flattenToShortString()>
	//   15   27:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//   16   28:aload_3         
	//   17   29:ldc2            #489 <String "calling_package">
	//   18   32:aload_1         
	//   19   33:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   20   36:pop             
		return intent1;
	//   21   37:aload_3         
	//   22   38:areturn         
	}

	private Intent a(Cursor cursor, int i1, String s1)
	{
		Object obj;
		Object obj1;
		Object obj2;
		String s2;
		try
		{
			obj1 = ((Object) (ap.a(cursor, "suggest_intent_action")));
	//    0    0:aload_1         
	//    1    1:ldc2            #494 <String "suggest_intent_action">
	//    2    4:invokestatic    #499 <Method String ap.a(Cursor, String)>
	//    3    7:astore          5
		}
	//*   4    9:aload           5
	//*   5   11:astore          4
	//*   6   13:aload           5
	//*   7   15:ifnonnull       230
	//*   8   18:aload_0         
	//*   9   19:getfield        #501 <Field SearchableInfo h>
	//*  10   22:invokevirtual   #504 <Method String SearchableInfo.getSuggestIntentAction()>
	//*  11   25:astore          4
	//*  12   27:goto            230
	//*  13   30:aload_1         
	//*  14   31:ldc2            #506 <String "suggest_intent_data">
	//*  15   34:invokestatic    #499 <Method String ap.a(Cursor, String)>
	//*  16   37:astore          6
	//*  17   39:aload           6
	//*  18   41:astore          4
	//*  19   43:aload           6
	//*  20   45:ifnonnull       57
	//*  21   48:aload_0         
	//*  22   49:getfield        #501 <Field SearchableInfo h>
	//*  23   52:invokevirtual   #509 <Method String SearchableInfo.getSuggestIntentData()>
	//*  24   55:astore          4
	//*  25   57:aload           4
	//*  26   59:astore          6
	//*  27   61:aload           4
	//*  28   63:ifnull          247
	//*  29   66:aload_1         
	//*  30   67:ldc2            #511 <String "suggest_intent_data_id">
	//*  31   70:invokestatic    #499 <Method String ap.a(Cursor, String)>
	//*  32   73:astore          7
	//*  33   75:aload           4
	//*  34   77:astore          6
	//*  35   79:aload           7
	//*  36   81:ifnull          247
	//*  37   84:new             #513 <Class StringBuilder>
	//*  38   87:dup             
	//*  39   88:invokespecial   #514 <Method void StringBuilder()>
	//*  40   91:astore          6
	//*  41   93:aload           6
	//*  42   95:aload           4
	//*  43   97:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//*  44  100:pop             
	//*  45  101:aload           6
	//*  46  103:ldc2            #520 <String "/">
	//*  47  106:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//*  48  109:pop             
	//*  49  110:aload           6
	//*  50  112:aload           7
	//*  51  114:invokestatic    #526 <Method String Uri.encode(String)>
	//*  52  117:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//*  53  120:pop             
	//*  54  121:aload           6
	//*  55  123:invokevirtual   #529 <Method String StringBuilder.toString()>
	//*  56  126:astore          6
	//*  57  128:goto            247
	//*  58  131:aload           6
	//*  59  133:invokestatic    #533 <Method Uri Uri.parse(String)>
	//*  60  136:astore          4
	//*  61  138:aload_1         
	//*  62  139:ldc2            #535 <String "suggest_intent_query">
	//*  63  142:invokestatic    #499 <Method String ap.a(Cursor, String)>
	//*  64  145:astore          6
	//*  65  147:aload_0         
	//*  66  148:aload           5
	//*  67  150:aload           4
	//*  68  152:aload_1         
	//*  69  153:ldc2            #537 <String "suggest_intent_extra_data">
	//*  70  156:invokestatic    #499 <Method String ap.a(Cursor, String)>
	//*  71  159:aload           6
	//*  72  161:iload_2         
	//*  73  162:aload_3         
	//*  74  163:invokespecial   #540 <Method Intent a(String, Uri, String, String, int, String)>
	//*  75  166:astore_3        
	//*  76  167:aload_3         
	//*  77  168:areturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  78  169:astore_3        
		{
			try
			{
				i1 = cursor.getPosition();
	//   79  170:aload_1         
	//   80  171:invokeinterface #545 <Method int Cursor.getPosition()>
	//   81  176:istore_2        
			}
	//*  82  177:goto            182
	//*  83  180:iconst_m1       
	//*  84  181:istore_2        
	//*  85  182:new             #513 <Class StringBuilder>
	//*  86  185:dup             
	//*  87  186:invokespecial   #514 <Method void StringBuilder()>
	//*  88  189:astore_1        
	//*  89  190:aload_1         
	//*  90  191:ldc2            #547 <String "Search suggestions cursor at row ">
	//*  91  194:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//*  92  197:pop             
	//*  93  198:aload_1         
	//*  94  199:iload_2         
	//*  95  200:invokevirtual   #550 <Method StringBuilder StringBuilder.append(int)>
	//*  96  203:pop             
	//*  97  204:aload_1         
	//*  98  205:ldc2            #552 <String " returned exception.">
	//*  99  208:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//* 100  211:pop             
	//* 101  212:ldc2            #553 <String "SearchView">
	//* 102  215:aload_1         
	//* 103  216:invokevirtual   #529 <Method String StringBuilder.toString()>
	//* 104  219:aload_3         
	//* 105  220:invokestatic    #558 <Method int Log.w(String, String, Throwable)>
	//* 106  223:pop             
	//* 107  224:aconst_null     
	//* 108  225:areturn         
			// Misplaced declaration of an exception variable
			catch(Cursor cursor)
			{
				i1 = -1;
			}
			cursor = ((Cursor) (new StringBuilder()));
			((StringBuilder) (cursor)).append("Search suggestions cursor at row ");
			((StringBuilder) (cursor)).append(i1);
			((StringBuilder) (cursor)).append(" returned exception.");
			Log.w("SearchView", ((StringBuilder) (cursor)).toString(), ((Throwable) (s1)));
			return null;
		}
		obj = obj1;
		if(obj1 != null) goto _L2; else goto _L1
_L1:
		obj = ((Object) (h.getSuggestIntentAction()));
		  goto _L2
_L6:
		obj2 = ((Object) (ap.a(cursor, "suggest_intent_data")));
		obj = obj2;
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_57;
		obj = ((Object) (h.getSuggestIntentData()));
		obj2 = obj;
		if(obj == null) goto _L4; else goto _L3
_L3:
		s2 = ap.a(cursor, "suggest_intent_data_id");
		obj2 = obj;
		if(s2 == null) goto _L4; else goto _L5
_L5:
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append(((String) (obj)));
		((StringBuilder) (obj2)).append("/");
		((StringBuilder) (obj2)).append(Uri.encode(s2));
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
		  goto _L4
_L8:
		obj = ((Object) (Uri.parse(((String) (obj2)))));
_L9:
		obj2 = ((Object) (ap.a(cursor, "suggest_intent_query")));
		s1 = ((String) (a(((String) (obj1)), ((Uri) (obj)), ap.a(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i1, s1)));
		return ((Intent) (s1));
	//* 109  226:astore_1        
	//* 110  227:goto            180
_L2:
		obj1 = obj;
	//  111  230:aload           4
	//  112  232:astore          5
		if(obj == null)
	//* 113  234:aload           4
	//* 114  236:ifnonnull       30
			obj1 = "android.intent.action.SEARCH";
	//  115  239:ldc2            #560 <String "android.intent.action.SEARCH">
	//  116  242:astore          5
		  goto _L6
	//* 117  244:goto            30
_L4:
		if(obj2 != null) goto _L8; else goto _L7
	//  118  247:aload           6
	//  119  249:ifnonnull       131
_L7:
		obj = null;
	//  120  252:aconst_null     
	//  121  253:astore          4
		  goto _L9
	//* 122  255:goto            138
	}

	private Intent a(String s1, Uri uri, String s2, String s3, int i1, String s4)
	{
		s1 = ((String) (new Intent(s1)));
	//    0    0:new             #428 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #433 <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s1)).addFlags(0x10000000);
	//    5    9:aload_1         
	//    6   10:ldc2            #436 <Int 0x10000000>
	//    7   13:invokevirtual   #440 <Method Intent Intent.addFlags(int)>
	//    8   16:pop             
		if(uri != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			((Intent) (s1)).setData(uri);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #564 <Method Intent Intent.setData(Uri)>
	//   14   26:pop             
		((Intent) (s1)).putExtra("user_query", N);
	//   15   27:aload_1         
	//   16   28:ldc2            #566 <String "user_query">
	//   17   31:aload_0         
	//   18   32:getfield        #568 <Field CharSequence N>
	//   19   35:invokevirtual   #571 <Method Intent Intent.putExtra(String, CharSequence)>
	//   20   38:pop             
		if(s3 != null)
	//*  21   39:aload           4
	//*  22   41:ifnull          54
			((Intent) (s1)).putExtra("query", s3);
	//   23   44:aload_1         
	//   24   45:ldc2            #573 <String "query">
	//   25   48:aload           4
	//   26   50:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   27   53:pop             
		if(s2 != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          67
			((Intent) (s1)).putExtra("intent_extra_data_key", s2);
	//   30   58:aload_1         
	//   31   59:ldc2            #575 <String "intent_extra_data_key">
	//   32   62:aload_3         
	//   33   63:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   34   66:pop             
		if(Q != null)
	//*  35   67:aload_0         
	//*  36   68:getfield        #577 <Field Bundle Q>
	//*  37   71:ifnull          86
			((Intent) (s1)).putExtra("app_data", Q);
	//   38   74:aload_1         
	//   39   75:ldc2            #579 <String "app_data">
	//   40   78:aload_0         
	//   41   79:getfield        #577 <Field Bundle Q>
	//   42   82:invokevirtual   #582 <Method Intent Intent.putExtra(String, Bundle)>
	//   43   85:pop             
		if(i1 != 0)
	//*  44   86:iload           5
	//*  45   88:ifeq            111
		{
			((Intent) (s1)).putExtra("action_key", i1);
	//   46   91:aload_1         
	//   47   92:ldc2            #584 <String "action_key">
	//   48   95:iload           5
	//   49   97:invokevirtual   #587 <Method Intent Intent.putExtra(String, int)>
	//   50  100:pop             
			((Intent) (s1)).putExtra("action_msg", s4);
	//   51  101:aload_1         
	//   52  102:ldc2            #589 <String "action_msg">
	//   53  105:aload           6
	//   54  107:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   55  110:pop             
		}
		((Intent) (s1)).setComponent(h.getSearchActivity());
	//   56  111:aload_1         
	//   57  112:aload_0         
	//   58  113:getfield        #501 <Field SearchableInfo h>
	//   59  116:invokevirtual   #481 <Method ComponentName SearchableInfo.getSearchActivity()>
	//   60  119:invokevirtual   #593 <Method Intent Intent.setComponent(ComponentName)>
	//   61  122:pop             
		return ((Intent) (s1));
	//   62  123:aload_1         
	//   63  124:areturn         
	}

	private void a(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			getContext().startActivity(intent);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #597 <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #602 <Method void Context.startActivity(Intent)>
			return;
	//    7   13:return          
		}
		catch(RuntimeException runtimeexception)
	//*   8   14:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #513 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #514 <Method void StringBuilder()>
	//   12   22:astore_3        
			stringbuilder.append("Failed launch activity: ");
	//   13   23:aload_3         
	//   14   24:ldc2            #604 <String "Failed launch activity: ">
	//   15   27:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			stringbuilder.append(((Object) (intent)));
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #607 <Method StringBuilder StringBuilder.append(Object)>
	//   20   36:pop             
			Log.e("SearchView", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   21   37:ldc2            #553 <String "SearchView">
	//   22   40:aload_3         
	//   23   41:invokevirtual   #529 <Method String StringBuilder.toString()>
	//   24   44:aload_2         
	//   25   45:invokestatic    #609 <Method int Log.e(String, String, Throwable)>
	//   26   48:pop             
			return;
	//   27   49:return          
		}
	}

	private void a(View view, Rect rect)
	{
		view.getLocationInWindow(r);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #154 <Field int[] r>
	//    3    5:invokevirtual   #614 <Method void View.getLocationInWindow(int[])>
		getLocationInWindow(s);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #156 <Field int[] s>
	//    7   13:invokevirtual   #615 <Method void getLocationInWindow(int[])>
		int i1 = r[1] - s[1];
	//    8   16:aload_0         
	//    9   17:getfield        #154 <Field int[] r>
	//   10   20:iconst_1        
	//   11   21:iaload          
	//   12   22:aload_0         
	//   13   23:getfield        #156 <Field int[] s>
	//   14   26:iconst_1        
	//   15   27:iaload          
	//   16   28:isub            
	//   17   29:istore_3        
		int j1 = r[0] - s[0];
	//   18   30:aload_0         
	//   19   31:getfield        #154 <Field int[] r>
	//   20   34:iconst_0        
	//   21   35:iaload          
	//   22   36:aload_0         
	//   23   37:getfield        #156 <Field int[] s>
	//   24   40:iconst_0        
	//   25   41:iaload          
	//   26   42:isub            
	//   27   43:istore          4
		rect.set(j1, i1, view.getWidth() + j1, view.getHeight() + i1);
	//   28   45:aload_2         
	//   29   46:iload           4
	//   30   48:iload_3         
	//   31   49:aload_1         
	//   32   50:invokevirtual   #618 <Method int View.getWidth()>
	//   33   53:iload           4
	//   34   55:iadd            
	//   35   56:aload_1         
	//   36   57:invokevirtual   #621 <Method int View.getHeight()>
	//   37   60:iload_3         
	//   38   61:iadd            
	//   39   62:invokevirtual   #625 <Method void Rect.set(int, int, int, int)>
	//   40   65:return          
	}

	private void a(boolean flag)
	{
		F = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #627 <Field boolean F>
		byte byte1 = 8;
	//    3    5:bipush          8
	//    4    7:istore_3        
		boolean flag1 = false;
	//    5    8:iconst_0        
	//    6    9:istore          4
		byte byte0;
		if(flag)
	//*   7   11:iload_1         
	//*   8   12:ifeq            20
			byte0 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		else
	//*  11   17:goto            23
			byte0 = 8;
	//   12   20:bipush          8
	//   13   22:istore_2        
		boolean flag2 = TextUtils.isEmpty(((CharSequence) (a.getText()))) ^ true;
	//   14   23:aload_0         
	//   15   24:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   16   27:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//   17   30:invokestatic    #637 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   18   33:iconst_1        
	//   19   34:ixor            
	//   20   35:istore          5
		b.setVisibility(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:getfield        #254 <Field ImageView b>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #640 <Method void ImageView.setVisibility(int)>
		b(flag2);
	//   25   45:aload_0         
	//   26   46:iload           5
	//   27   48:invokespecial   #642 <Method void b(boolean)>
		View view = k;
	//   28   51:aload_0         
	//   29   52:getfield        #237 <Field View k>
	//   30   55:astore          6
		if(flag)
	//*  31   57:iload_1         
	//*  32   58:ifeq            67
			byte0 = 8;
	//   33   61:bipush          8
	//   34   63:istore_2        
		else
	//*  35   64:goto            69
			byte0 = 0;
	//   36   67:iconst_0        
	//   37   68:istore_2        
		view.setVisibility(((int) (byte0)));
	//   38   69:aload           6
	//   39   71:iload_2         
	//   40   72:invokevirtual   #643 <Method void View.setVisibility(int)>
		byte0 = byte1;
	//   41   75:iload_3         
	//   42   76:istore_2        
		if(t.getDrawable() != null)
	//*  43   77:aload_0         
	//*  44   78:getfield        #274 <Field ImageView t>
	//*  45   81:invokevirtual   #647 <Method Drawable ImageView.getDrawable()>
	//*  46   84:ifnull          101
			if(E)
	//*  47   87:aload_0         
	//*  48   88:getfield        #467 <Field boolean E>
	//*  49   91:ifeq            99
				byte0 = byte1;
	//   50   94:iload_3         
	//   51   95:istore_2        
			else
	//*  52   96:goto            101
				byte0 = 0;
	//   53   99:iconst_0        
	//   54  100:istore_2        
		t.setVisibility(((int) (byte0)));
	//   55  101:aload_0         
	//   56  102:getfield        #274 <Field ImageView t>
	//   57  105:iload_2         
	//   58  106:invokevirtual   #640 <Method void ImageView.setVisibility(int)>
		p();
	//   59  109:aload_0         
	//   60  110:invokespecial   #649 <Method void p()>
		flag = flag1;
	//   61  113:iload           4
	//   62  115:istore_1        
		if(!flag2)
	//*  63  116:iload           5
	//*  64  118:ifne            123
			flag = true;
	//   65  121:iconst_1        
	//   66  122:istore_1        
		c(flag);
	//   67  123:aload_0         
	//   68  124:iload_1         
	//   69  125:invokespecial   #651 <Method void c(boolean)>
		o();
	//   70  128:aload_0         
	//   71  129:invokespecial   #653 <Method void o()>
	//   72  132:return          
	}

	static boolean a(Context context)
	{
		return context.getResources().getConfiguration().orientation == 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #659 <Method Configuration Resources.getConfiguration()>
	//    3    7:getfield        #664 <Field int Configuration.orientation>
	//    4   10:iconst_2        
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private Intent b(Intent intent, SearchableInfo searchableinfo)
	{
		ComponentName componentname = searchableinfo.getSearchActivity();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #481 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    2    4:astore          10
		Object obj = ((Object) (new Intent("android.intent.action.SEARCH")));
	//    3    6:new             #428 <Class Intent>
	//    4    9:dup             
	//    5   10:ldc2            #560 <String "android.intent.action.SEARCH">
	//    6   13:invokespecial   #433 <Method void Intent(String)>
	//    7   16:astore          5
		((Intent) (obj)).setComponent(componentname);
	//    8   18:aload           5
	//    9   20:aload           10
	//   10   22:invokevirtual   #593 <Method Intent Intent.setComponent(ComponentName)>
	//   11   25:pop             
		PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #597 <Method Context getContext()>
	//   14   30:iconst_0        
	//   15   31:aload           5
	//   16   33:ldc2            #665 <Int 0x40000000>
	//   17   36:invokestatic    #671 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   18   39:astore          8
		Bundle bundle = new Bundle();
	//   19   41:new             #673 <Class Bundle>
	//   20   44:dup             
	//   21   45:invokespecial   #674 <Method void Bundle()>
	//   22   48:astore          9
		if(Q != null)
	//*  23   50:aload_0         
	//*  24   51:getfield        #577 <Field Bundle Q>
	//*  25   54:ifnull          69
			bundle.putParcelable("app_data", ((Parcelable) (Q)));
	//   26   57:aload           9
	//   27   59:ldc2            #579 <String "app_data">
	//   28   62:aload_0         
	//   29   63:getfield        #577 <Field Bundle Q>
	//   30   66:invokevirtual   #678 <Method void Bundle.putParcelable(String, Parcelable)>
		Intent intent1 = new Intent(intent);
	//   31   69:new             #428 <Class Intent>
	//   32   72:dup             
	//   33   73:aload_1         
	//   34   74:invokespecial   #475 <Method void Intent(Intent)>
	//   35   77:astore          11
		intent = "free_form";
	//   36   79:ldc2            #680 <String "free_form">
	//   37   82:astore_1        
		int i1 = 1;
	//   38   83:iconst_1        
	//   39   84:istore_3        
		Object obj1 = ((Object) (getResources()));
	//   40   85:aload_0         
	//   41   86:invokevirtual   #313 <Method Resources getResources()>
	//   42   89:astore          6
		if(searchableinfo.getVoiceLanguageModeId() != 0)
	//*  43   91:aload_2         
	//*  44   92:invokevirtual   #683 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//*  45   95:ifeq            108
			intent = ((Intent) (((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageModeId())));
	//   46   98:aload           6
	//   47  100:aload_2         
	//   48  101:invokevirtual   #683 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//   49  104:invokevirtual   #324 <Method String Resources.getString(int)>
	//   50  107:astore_1        
		int j1 = searchableinfo.getVoicePromptTextId();
	//   51  108:aload_2         
	//   52  109:invokevirtual   #686 <Method int SearchableInfo.getVoicePromptTextId()>
	//   53  112:istore          4
		Object obj2 = null;
	//   54  114:aconst_null     
	//   55  115:astore          7
		if(j1 != 0)
	//*  56  117:iload           4
	//*  57  119:ifeq            136
			obj = ((Object) (((Resources) (obj1)).getString(searchableinfo.getVoicePromptTextId())));
	//   58  122:aload           6
	//   59  124:aload_2         
	//   60  125:invokevirtual   #686 <Method int SearchableInfo.getVoicePromptTextId()>
	//   61  128:invokevirtual   #324 <Method String Resources.getString(int)>
	//   62  131:astore          5
		else
	//*  63  133:goto            139
			obj = null;
	//   64  136:aconst_null     
	//   65  137:astore          5
		if(searchableinfo.getVoiceLanguageId() != 0)
	//*  66  139:aload_2         
	//*  67  140:invokevirtual   #689 <Method int SearchableInfo.getVoiceLanguageId()>
	//*  68  143:ifeq            160
			obj1 = ((Object) (((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageId())));
	//   69  146:aload           6
	//   70  148:aload_2         
	//   71  149:invokevirtual   #689 <Method int SearchableInfo.getVoiceLanguageId()>
	//   72  152:invokevirtual   #324 <Method String Resources.getString(int)>
	//   73  155:astore          6
		else
	//*  74  157:goto            163
			obj1 = null;
	//   75  160:aconst_null     
	//   76  161:astore          6
		if(searchableinfo.getVoiceMaxResults() != 0)
	//*  77  163:aload_2         
	//*  78  164:invokevirtual   #692 <Method int SearchableInfo.getVoiceMaxResults()>
	//*  79  167:ifeq            175
			i1 = searchableinfo.getVoiceMaxResults();
	//   80  170:aload_2         
	//   81  171:invokevirtual   #692 <Method int SearchableInfo.getVoiceMaxResults()>
	//   82  174:istore_3        
		intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", ((String) (intent)));
	//   83  175:aload           11
	//   84  177:ldc2            #442 <String "android.speech.extra.LANGUAGE_MODEL">
	//   85  180:aload_1         
	//   86  181:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   87  184:pop             
		intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
	//   88  185:aload           11
	//   89  187:ldc2            #694 <String "android.speech.extra.PROMPT">
	//   90  190:aload           5
	//   91  192:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   92  195:pop             
		intent1.putExtra("android.speech.extra.LANGUAGE", ((String) (obj1)));
	//   93  196:aload           11
	//   94  198:ldc2            #696 <String "android.speech.extra.LANGUAGE">
	//   95  201:aload           6
	//   96  203:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//   97  206:pop             
		intent1.putExtra("android.speech.extra.MAX_RESULTS", i1);
	//   98  207:aload           11
	//   99  209:ldc2            #698 <String "android.speech.extra.MAX_RESULTS">
	//  100  212:iload_3         
	//  101  213:invokevirtual   #587 <Method Intent Intent.putExtra(String, int)>
	//  102  216:pop             
		if(componentname == null)
	//* 103  217:aload           10
	//* 104  219:ifnonnull       228
			intent = ((Intent) (obj2));
	//  105  222:aload           7
	//  106  224:astore_1        
		else
	//* 107  225:goto            234
			intent = ((Intent) (componentname.flattenToShortString()));
	//  108  228:aload           10
	//  109  230:invokevirtual   #487 <Method String ComponentName.flattenToShortString()>
	//  110  233:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//  111  234:aload           11
	//  112  236:ldc2            #489 <String "calling_package">
	//  113  239:aload_1         
	//  114  240:invokevirtual   #448 <Method Intent Intent.putExtra(String, String)>
	//  115  243:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", ((Parcelable) (pendingintent)));
	//  116  244:aload           11
	//  117  246:ldc2            #700 <String "android.speech.extra.RESULTS_PENDINGINTENT">
	//  118  249:aload           8
	//  119  251:invokevirtual   #703 <Method Intent Intent.putExtra(String, Parcelable)>
	//  120  254:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
	//  121  255:aload           11
	//  122  257:ldc2            #705 <String "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE">
	//  123  260:aload           9
	//  124  262:invokevirtual   #582 <Method Intent Intent.putExtra(String, Bundle)>
	//  125  265:pop             
		return intent1;
	//  126  266:aload           11
	//  127  268:areturn         
	}

	private void b(boolean flag)
	{
		byte byte0;
		if(G && n() && hasFocus() && (flag || !L))
	//*   0    0:aload_0         
	//*   1    1:getfield        #707 <Field boolean G>
	//*   2    4:ifeq            37
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #710 <Method boolean n()>
	//*   5   11:ifeq            37
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #713 <Method boolean hasFocus()>
	//*   8   18:ifeq            37
	//*   9   21:iload_1         
	//*  10   22:ifne            32
	//*  11   25:aload_0         
	//*  12   26:getfield        #715 <Field boolean L>
	//*  13   29:ifne            37
			byte0 = 0;
	//   14   32:iconst_0        
	//   15   33:istore_2        
		else
	//*  16   34:goto            40
			byte0 = 8;
	//   17   37:bipush          8
	//   18   39:istore_2        
		c.setVisibility(((int) (byte0)));
	//   19   40:aload_0         
	//   20   41:getfield        #259 <Field ImageView c>
	//   21   44:iload_2         
	//   22   45:invokevirtual   #640 <Method void ImageView.setVisibility(int)>
	//   23   48:return          
	}

	private boolean b(int i1, int j1, String s1)
	{
		Cursor cursor = g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #718 <Field e g>
	//    2    4:invokevirtual   #723 <Method Cursor e.a()>
	//    3    7:astore          4
		if(cursor != null && cursor.moveToPosition(i1))
	//*   4    9:aload           4
	//*   5   11:ifnull          39
	//*   6   14:aload           4
	//*   7   16:iload_1         
	//*   8   17:invokeinterface #727 <Method boolean Cursor.moveToPosition(int)>
	//*   9   22:ifeq            39
		{
			a(a(cursor, j1, s1));
	//   10   25:aload_0         
	//   11   26:aload_0         
	//   12   27:aload           4
	//   13   29:iload_2         
	//   14   30:aload_3         
	//   15   31:invokespecial   #729 <Method Intent a(Cursor, int, String)>
	//   16   34:invokespecial   #731 <Method void a(Intent)>
			return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
		} else
		{
			return false;
	//   19   39:iconst_0        
	//   20   40:ireturn         
		}
	}

	private CharSequence c(CharSequence charsequence)
	{
		if(E)
	//*   0    0:aload_0         
	//*   1    1:getfield        #467 <Field boolean E>
	//*   2    4:ifeq            79
		{
			if(u == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #309 <Field Drawable u>
	//*   5   11:ifnonnull       16
			{
				return charsequence;
	//    6   14:aload_1         
	//    7   15:areturn         
			} else
			{
				int i1 = (int)((double)a.getTextSize() * 1.25D);
	//    8   16:aload_0         
	//    9   17:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   10   20:invokevirtual   #736 <Method float SearchView$SearchAutoComplete.getTextSize()>
	//   11   23:f2d             
	//   12   24:ldc2w           #737 <Double 1.25D>
	//   13   27:dmul            
	//   14   28:d2i             
	//   15   29:istore_2        
				u.setBounds(0, 0, i1, i1);
	//   16   30:aload_0         
	//   17   31:getfield        #309 <Field Drawable u>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:iload_2         
	//   21   37:iload_2         
	//   22   38:invokevirtual   #743 <Method void Drawable.setBounds(int, int, int, int)>
				SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
	//   23   41:new             #745 <Class SpannableStringBuilder>
	//   24   44:dup             
	//   25   45:ldc2            #747 <String "   ">
	//   26   48:invokespecial   #750 <Method void SpannableStringBuilder(CharSequence)>
	//   27   51:astore_3        
				spannablestringbuilder.setSpan(((Object) (new ImageSpan(u))), 1, 2, 33);
	//   28   52:aload_3         
	//   29   53:new             #752 <Class ImageSpan>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:getfield        #309 <Field Drawable u>
	//   33   61:invokespecial   #754 <Method void ImageSpan(Drawable)>
	//   34   64:iconst_1        
	//   35   65:iconst_2        
	//   36   66:bipush          33
	//   37   68:invokevirtual   #758 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				spannablestringbuilder.append(charsequence);
	//   38   71:aload_3         
	//   39   72:aload_1         
	//   40   73:invokevirtual   #761 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   41   76:pop             
				return ((CharSequence) (spannablestringbuilder));
	//   42   77:aload_3         
	//   43   78:areturn         
			}
		} else
		{
			return charsequence;
	//   44   79:aload_1         
	//   45   80:areturn         
		}
	}

	private void c(boolean flag)
	{
		byte byte0;
		if(L && !c() && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #715 <Field boolean L>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #763 <Method boolean c()>
	//*   5   11:ifne            32
	//*   6   14:iload_1         
	//*   7   15:ifeq            32
		{
			byte0 = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
			c.setVisibility(8);
	//   10   20:aload_0         
	//   11   21:getfield        #259 <Field ImageView c>
	//   12   24:bipush          8
	//   13   26:invokevirtual   #640 <Method void ImageView.setVisibility(int)>
		} else
	//*  14   29:goto            35
		{
			byte0 = 8;
	//   15   32:bipush          8
	//   16   34:istore_2        
		}
		e.setVisibility(((int) (byte0)));
	//   17   35:aload_0         
	//   18   36:getfield        #269 <Field ImageView e>
	//   19   39:iload_2         
	//   20   40:invokevirtual   #640 <Method void ImageView.setVisibility(int)>
	//   21   43:return          
	}

	private void e(int i1)
	{
		Editable editable = a.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_2        
		Object obj = ((Object) (g.a()));
	//    4    8:aload_0         
	//    5    9:getfield        #718 <Field e g>
	//    6   12:invokevirtual   #723 <Method Cursor e.a()>
	//    7   15:astore_3        
		if(obj == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(((Cursor) (obj)).moveToPosition(i1))
	//*  11   21:aload_3         
	//*  12   22:iload_1         
	//*  13   23:invokeinterface #727 <Method boolean Cursor.moveToPosition(int)>
	//*  14   28:ifeq            50
		{
			obj = ((Object) (g.c(((Cursor) (obj)))));
	//   15   31:aload_0         
	//   16   32:getfield        #718 <Field e g>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #766 <Method CharSequence e.c(Cursor)>
	//   19   39:astore_3        
			if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          50
			{
				setQuery(((CharSequence) (obj)));
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:invokespecial   #769 <Method void setQuery(CharSequence)>
				return;
	//   25   49:return          
			}
		}
		setQuery(((CharSequence) (editable)));
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:invokespecial   #769 <Method void setQuery(CharSequence)>
	//   29   55:return          
	}

	private int getPreferredHeight()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.a.a.d.abc_search_view_preferred_height);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #597 <Method Context getContext()>
	//    2    4:invokevirtual   #655 <Method Resources Context.getResources()>
	//    3    7:getstatic       #775 <Field int android.support.v7.a.a$d.abc_search_view_preferred_height>
	//    4   10:invokevirtual   #779 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private int getPreferredWidth()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.a.a.d.abc_search_view_preferred_width);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #597 <Method Context getContext()>
	//    2    4:invokevirtual   #655 <Method Resources Context.getResources()>
	//    3    7:getstatic       #783 <Field int android.support.v7.a.a$d.abc_search_view_preferred_width>
	//    4   10:invokevirtual   #779 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private boolean m()
	{
		SearchableInfo searchableinfo = h;
	//    0    0:aload_0         
	//    1    1:getfield        #501 <Field SearchableInfo h>
	//    2    4:astore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = flag1;
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(searchableinfo != null)
	//*   7    9:aload_3         
	//*   8   10:ifnull          87
		{
			flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(h.getVoiceSearchEnabled())
	//*  11   15:aload_0         
	//*  12   16:getfield        #501 <Field SearchableInfo h>
	//*  13   19:invokevirtual   #786 <Method boolean SearchableInfo.getVoiceSearchEnabled()>
	//*  14   22:ifeq            87
			{
				Intent intent = null;
	//   15   25:aconst_null     
	//   16   26:astore_3        
				if(h.getVoiceSearchLaunchWebSearch())
	//*  17   27:aload_0         
	//*  18   28:getfield        #501 <Field SearchableInfo h>
	//*  19   31:invokevirtual   #789 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*  20   34:ifeq            45
					intent = x;
	//   21   37:aload_0         
	//   22   38:getfield        #435 <Field Intent x>
	//   23   41:astore_3        
				else
	//*  24   42:goto            60
				if(h.getVoiceSearchLaunchRecognizer())
	//*  25   45:aload_0         
	//*  26   46:getfield        #501 <Field SearchableInfo h>
	//*  27   49:invokevirtual   #792 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  28   52:ifeq            60
					intent = y;
	//   29   55:aload_0         
	//   30   56:getfield        #452 <Field Intent y>
	//   31   59:astore_3        
				flag = flag1;
	//   32   60:iload_2         
	//   33   61:istore_1        
				if(intent != null)
	//*  34   62:aload_3         
	//*  35   63:ifnull          87
				{
					flag = flag1;
	//   36   66:iload_2         
	//   37   67:istore_1        
					if(getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #597 <Method Context getContext()>
	//*  40   72:invokevirtual   #796 <Method PackageManager Context.getPackageManager()>
	//*  41   75:aload_3         
	//*  42   76:ldc2            #797 <Int 0x10000>
	//*  43   79:invokevirtual   #803 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*  44   82:ifnull          87
						flag = true;
	//   45   85:iconst_1        
	//   46   86:istore_1        
				}
			}
		}
		return flag;
	//   47   87:iload_1         
	//   48   88:ireturn         
	}

	private boolean n()
	{
		return (G || L) && !c();
	//    0    0:aload_0         
	//    1    1:getfield        #707 <Field boolean G>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #715 <Field boolean L>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:invokevirtual   #763 <Method boolean c()>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void o()
	{
		byte byte0;
		if(n() && (c.getVisibility() == 0 || e.getVisibility() == 0))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #710 <Method boolean n()>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #259 <Field ImageView c>
	//*   5   11:invokevirtual   #806 <Method int ImageView.getVisibility()>
	//*   6   14:ifeq            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #269 <Field ImageView e>
	//*   9   21:invokevirtual   #806 <Method int ImageView.getVisibility()>
	//*  10   24:ifne            32
			byte0 = 0;
	//   11   27:iconst_0        
	//   12   28:istore_1        
		else
	//*  13   29:goto            35
			byte0 = 8;
	//   14   32:bipush          8
	//   15   34:istore_1        
		m.setVisibility(((int) (byte0)));
	//   16   35:aload_0         
	//   17   36:getfield        #247 <Field View m>
	//   18   39:iload_1         
	//   19   40:invokevirtual   #643 <Method void View.setVisibility(int)>
	//   20   43:return          
	}

	private void p()
	{
		boolean flag4 = TextUtils.isEmpty(((CharSequence) (a.getText())));
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:invokestatic    #637 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4   10:istore          5
		boolean flag2 = true;
	//    5   12:iconst_1        
	//    6   13:istore_3        
		boolean flag3 = flag4 ^ true;
	//    7   14:iload           5
	//    8   16:iconst_1        
	//    9   17:ixor            
	//   10   18:istore          4
		boolean flag1 = false;
	//   11   20:iconst_0        
	//   12   21:istore_2        
		boolean flag = flag2;
	//   13   22:iload_3         
	//   14   23:istore_1        
		if(!flag3)
	//*  15   24:iload           4
	//*  16   26:ifne            50
			if(E && !O)
	//*  17   29:aload_0         
	//*  18   30:getfield        #467 <Field boolean E>
	//*  19   33:ifeq            48
	//*  20   36:aload_0         
	//*  21   37:getfield        #808 <Field boolean O>
	//*  22   40:ifne            48
				flag = flag2;
	//   23   43:iload_3         
	//   24   44:istore_1        
			else
	//*  25   45:goto            50
				flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_1        
		ImageView imageview = d;
	//   28   50:aload_0         
	//   29   51:getfield        #264 <Field ImageView d>
	//   30   54:astore          6
		byte byte0;
		if(flag)
	//*  31   56:iload_1         
	//*  32   57:ifeq            65
			byte0 = ((byte) (flag1));
	//   33   60:iload_2         
	//   34   61:istore_1        
		else
	//*  35   62:goto            68
			byte0 = 8;
	//   36   65:bipush          8
	//   37   67:istore_1        
		imageview.setVisibility(((int) (byte0)));
	//   38   68:aload           6
	//   39   70:iload_1         
	//   40   71:invokevirtual   #640 <Method void ImageView.setVisibility(int)>
		Drawable drawable = d.getDrawable();
	//   41   74:aload_0         
	//   42   75:getfield        #264 <Field ImageView d>
	//   43   78:invokevirtual   #647 <Method Drawable ImageView.getDrawable()>
	//   44   81:astore          7
		if(drawable != null)
	//*  45   83:aload           7
	//*  46   85:ifnull          114
		{
			int ai[];
			if(flag3)
	//*  47   88:iload           4
	//*  48   90:ifeq            101
				ai = ENABLED_STATE_SET;
	//   49   93:getstatic       #811 <Field int[] ENABLED_STATE_SET>
	//   50   96:astore          6
			else
	//*  51   98:goto            106
				ai = EMPTY_STATE_SET;
	//   52  101:getstatic       #814 <Field int[] EMPTY_STATE_SET>
	//   53  104:astore          6
			drawable.setState(ai);
	//   54  106:aload           7
	//   55  108:aload           6
	//   56  110:invokevirtual   #818 <Method boolean Drawable.setState(int[])>
	//   57  113:pop             
		}
	//   58  114:return          
	}

	private void q()
	{
		post(R);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #161 <Field Runnable R>
	//    3    5:invokevirtual   #822 <Method boolean post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void r()
	{
		CharSequence charsequence = getQueryHint();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #826 <Method CharSequence getQueryHint()>
	//    2    4:astore_2        
		SearchAutoComplete searchautocomplete = a;
	//    3    5:aload_0         
	//    4    6:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    5    9:astore_3        
		Object obj = ((Object) (charsequence));
	//    6   10:aload_2         
	//    7   11:astore_1        
		if(charsequence == null)
	//*   8   12:aload_2         
	//*   9   13:ifnonnull       20
			obj = "";
	//   10   16:ldc2            #828 <String "">
	//   11   19:astore_1        
		searchautocomplete.setHint(c(((CharSequence) (obj))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokespecial   #830 <Method CharSequence c(CharSequence)>
	//   16   26:invokevirtual   #833 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
	//   17   29:return          
	}

	private void s()
	{
		a.setThreshold(h.getSuggestThreshold());
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:aload_0         
	//    3    5:getfield        #501 <Field SearchableInfo h>
	//    4    8:invokevirtual   #836 <Method int SearchableInfo.getSuggestThreshold()>
	//    5   11:invokevirtual   #839 <Method void SearchView$SearchAutoComplete.setThreshold(int)>
		a.setImeOptions(h.getImeOptions());
	//    6   14:aload_0         
	//    7   15:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    8   18:aload_0         
	//    9   19:getfield        #501 <Field SearchableInfo h>
	//   10   22:invokevirtual   #842 <Method int SearchableInfo.getImeOptions()>
	//   11   25:invokevirtual   #843 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		int j1 = h.getInputType();
	//   12   28:aload_0         
	//   13   29:getfield        #501 <Field SearchableInfo h>
	//   14   32:invokevirtual   #846 <Method int SearchableInfo.getInputType()>
	//   15   35:istore_3        
		boolean flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_2        
		int i1 = j1;
	//   18   38:iload_3         
	//   19   39:istore_1        
		if((j1 & 0xf) == 1)
	//*  20   40:iload_3         
	//*  21   41:bipush          15
	//*  22   43:iand            
	//*  23   44:iconst_1        
	//*  24   45:icmpne          76
		{
			j1 &= 0xfffeffff;
	//   25   48:iload_3         
	//   26   49:ldc2            #847 <Int 0xfffeffff>
	//   27   52:iand            
	//   28   53:istore_3        
			i1 = j1;
	//   29   54:iload_3         
	//   30   55:istore_1        
			if(h.getSuggestAuthority() != null)
	//*  31   56:aload_0         
	//*  32   57:getfield        #501 <Field SearchableInfo h>
	//*  33   60:invokevirtual   #850 <Method String SearchableInfo.getSuggestAuthority()>
	//*  34   63:ifnull          76
				i1 = j1 | 0x10000 | 0x80000;
	//   35   66:iload_3         
	//   36   67:ldc2            #797 <Int 0x10000>
	//   37   70:ior             
	//   38   71:ldc2            #851 <Int 0x80000>
	//   39   74:ior             
	//   40   75:istore_1        
		}
		a.setInputType(i1);
	//   41   76:aload_0         
	//   42   77:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   43   80:iload_1         
	//   44   81:invokevirtual   #852 <Method void SearchView$SearchAutoComplete.setInputType(int)>
		if(g != null)
	//*  45   84:aload_0         
	//*  46   85:getfield        #718 <Field e g>
	//*  47   88:ifnull          99
			g.a(((Cursor) (null)));
	//   48   91:aload_0         
	//   49   92:getfield        #718 <Field e g>
	//   50   95:aconst_null     
	//   51   96:invokevirtual   #855 <Method void e.a(Cursor)>
		if(h.getSuggestAuthority() != null)
	//*  52   99:aload_0         
	//*  53  100:getfield        #501 <Field SearchableInfo h>
	//*  54  103:invokevirtual   #850 <Method String SearchableInfo.getSuggestAuthority()>
	//*  55  106:ifnull          170
		{
			g = ((android.support.v4.widget.e) (new ap(getContext(), this, h, T)));
	//   56  109:aload_0         
	//   57  110:new             #496 <Class ap>
	//   58  113:dup             
	//   59  114:aload_0         
	//   60  115:invokevirtual   #597 <Method Context getContext()>
	//   61  118:aload_0         
	//   62  119:aload_0         
	//   63  120:getfield        #501 <Field SearchableInfo h>
	//   64  123:aload_0         
	//   65  124:getfield        #169 <Field WeakHashMap T>
	//   66  127:invokespecial   #858 <Method void ap(Context, SearchView, SearchableInfo, WeakHashMap)>
	//   67  130:putfield        #718 <Field e g>
			a.setAdapter(((android.widget.ListAdapter) (g)));
	//   68  133:aload_0         
	//   69  134:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   70  137:aload_0         
	//   71  138:getfield        #718 <Field e g>
	//   72  141:invokevirtual   #862 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
			ap ap1 = (ap)g;
	//   73  144:aload_0         
	//   74  145:getfield        #718 <Field e g>
	//   75  148:checkcast       #496 <Class ap>
	//   76  151:astore          4
			byte byte0 = ((byte) (flag));
	//   77  153:iload_2         
	//   78  154:istore_1        
			if(I)
	//*  79  155:aload_0         
	//*  80  156:getfield        #864 <Field boolean I>
	//*  81  159:ifeq            164
				byte0 = 2;
	//   82  162:iconst_2        
	//   83  163:istore_1        
			ap1.a(((int) (byte0)));
	//   84  164:aload           4
	//   85  166:iload_1         
	//   86  167:invokevirtual   #866 <Method void ap.a(int)>
		}
	//   87  170:return          
	}

	private void setQuery(CharSequence charsequence)
	{
		a.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #869 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		SearchAutoComplete searchautocomplete = a;
	//    4    8:aload_0         
	//    5    9:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    6   12:astore_3        
		int i1;
		if(TextUtils.isEmpty(charsequence))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #637 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifeq            25
			i1 = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		else
	//*  12   22:goto            32
			i1 = charsequence.length();
	//   13   25:aload_1         
	//   14   26:invokeinterface #874 <Method int CharSequence.length()>
	//   15   31:istore_2        
		searchautocomplete.setSelection(i1);
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #877 <Method void SearchView$SearchAutoComplete.setSelection(int)>
	//   19   37:return          
	}

	private void t()
	{
		a.dismissDropDown();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #880 <Method void SearchView$SearchAutoComplete.dismissDropDown()>
	//    3    7:return          
	}

	public void a()
	{
		if(O)
	//*   0    0:aload_0         
	//*   1    1:getfield        #808 <Field boolean O>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			O = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #808 <Field boolean O>
			P = a.getImeOptions();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   10   18:invokevirtual   #881 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//   11   21:putfield        #883 <Field int P>
			a.setImeOptions(P | 0x2000000);
	//   12   24:aload_0         
	//   13   25:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   14   28:aload_0         
	//   15   29:getfield        #883 <Field int P>
	//   16   32:ldc2            #884 <Int 0x2000000>
	//   17   35:ior             
	//   18   36:invokevirtual   #843 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
			a.setText("");
	//   19   39:aload_0         
	//   20   40:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   21   43:ldc2            #828 <String "">
	//   22   46:invokevirtual   #869 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			setIconified(false);
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #887 <Method void setIconified(boolean)>
			return;
	//   26   54:return          
		}
	}

	void a(int i1, String s1, String s2)
	{
		s1 = ((String) (a("android.intent.action.SEARCH", ((Uri) (null)), ((String) (null)), s2, i1, s1)));
	//    0    0:aload_0         
	//    1    1:ldc2            #560 <String "android.intent.action.SEARCH">
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_3         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #540 <Method Intent a(String, Uri, String, String, int, String)>
	//    8   12:astore_2        
		getContext().startActivity(((Intent) (s1)));
	//    9   13:aload_0         
	//   10   14:invokevirtual   #597 <Method Context getContext()>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #602 <Method void Context.startActivity(Intent)>
	//   13   21:return          
	}

	void a(CharSequence charsequence)
	{
		setQuery(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #769 <Method void setQuery(CharSequence)>
	//    3    5:return          
	}

	public void a(CharSequence charsequence, boolean flag)
	{
		a.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #869 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		if(charsequence != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
		{
			a.setSelection(a.length());
	//    6   12:aload_0         
	//    7   13:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    8   16:aload_0         
	//    9   17:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   10   20:invokevirtual   #890 <Method int SearchView$SearchAutoComplete.length()>
	//   11   23:invokevirtual   #877 <Method void SearchView$SearchAutoComplete.setSelection(int)>
			N = charsequence;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #568 <Field CharSequence N>
		}
		if(flag && !TextUtils.isEmpty(charsequence))
	//*  15   31:iload_2         
	//*  16   32:ifeq            46
	//*  17   35:aload_1         
	//*  18   36:invokestatic    #637 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   39:ifne            46
			e();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #892 <Method void e()>
	//   22   46:return          
	}

	boolean a(int i1)
	{
		if(C != null && C.a(i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #894 <Field SearchView$d C>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #894 <Field SearchView$d C>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #896 <Method boolean SearchView$d.a(int)>
	//*   7   17:ifne            23
	//*   8   20:goto            25
		{
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
		} else
		{
			e(i1);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #898 <Method void e(int)>
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		}
	}

	boolean a(int i1, int j1, String s1)
	{
		if(C != null && C.b(i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #894 <Field SearchView$d C>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #894 <Field SearchView$d C>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #900 <Method boolean SearchView$d.b(int)>
	//*   7   17:ifne            23
	//*   8   20:goto            25
		{
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
		} else
		{
			b(i1, 0, ((String) (null)));
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:iconst_0        
	//   14   28:aconst_null     
	//   15   29:invokespecial   #902 <Method boolean b(int, int, String)>
	//   16   32:pop             
			SearchAutoComplete.a(a, false);
	//   17   33:aload_0         
	//   18   34:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   19   37:iconst_0        
	//   20   38:invokestatic    #905 <Method void SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete, boolean)>
			t();
	//   21   41:aload_0         
	//   22   42:invokespecial   #907 <Method void t()>
			return true;
	//   23   45:iconst_1        
	//   24   46:ireturn         
		}
	}

	boolean a(View view, int i1, KeyEvent keyevent)
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #501 <Field SearchableInfo h>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(g == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #718 <Field e g>
	//*   7   13:ifnonnull       18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(keyevent.getAction() == 0 && keyevent.hasNoModifiers())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #913 <Method int KeyEvent.getAction()>
	//*  12   22:ifne            155
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #916 <Method boolean KeyEvent.hasNoModifiers()>
	//*  15   29:ifeq            155
			if(i1 != 66 && i1 != 84 && i1 != 61)
	//*  16   32:iload_2         
	//*  17   33:bipush          66
	//*  18   35:icmpeq          141
	//*  19   38:iload_2         
	//*  20   39:bipush          84
	//*  21   41:icmpeq          141
	//*  22   44:iload_2         
	//*  23   45:bipush          61
	//*  24   47:icmpne          53
	//*  25   50:goto            141
			{
				if(i1 != 21 && i1 != 22)
	//*  26   53:iload_2         
	//*  27   54:bipush          21
	//*  28   56:icmpeq          86
	//*  29   59:iload_2         
	//*  30   60:bipush          22
	//*  31   62:icmpne          68
	//*  32   65:goto            86
				{
					if(i1 == 19 && a.getListSelection() == 0)
	//*  33   68:iload_2         
	//*  34   69:bipush          19
	//*  35   71:icmpne          155
	//*  36   74:aload_0         
	//*  37   75:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//*  38   78:invokevirtual   #919 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//*  39   81:ifne            155
						return false;
	//   40   84:iconst_0        
	//   41   85:ireturn         
				} else
				{
					if(i1 == 21)
	//*  42   86:iload_2         
	//*  43   87:bipush          21
	//*  44   89:icmpne          97
						i1 = 0;
	//   45   92:iconst_0        
	//   46   93:istore_2        
					else
	//*  47   94:goto            105
						i1 = a.length();
	//   48   97:aload_0         
	//   49   98:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   50  101:invokevirtual   #890 <Method int SearchView$SearchAutoComplete.length()>
	//   51  104:istore_2        
					a.setSelection(i1);
	//   52  105:aload_0         
	//   53  106:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   54  109:iload_2         
	//   55  110:invokevirtual   #877 <Method void SearchView$SearchAutoComplete.setSelection(int)>
					a.setListSelection(0);
	//   56  113:aload_0         
	//   57  114:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   58  117:iconst_0        
	//   59  118:invokevirtual   #922 <Method void SearchView$SearchAutoComplete.setListSelection(int)>
					a.clearListSelection();
	//   60  121:aload_0         
	//   61  122:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   62  125:invokevirtual   #925 <Method void SearchView$SearchAutoComplete.clearListSelection()>
					i.a(((AutoCompleteTextView) (a)), true);
	//   63  128:getstatic       #131 <Field SearchView$a i>
	//   64  131:aload_0         
	//   65  132:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   66  135:iconst_1        
	//   67  136:invokevirtual   #928 <Method void SearchView$a.a(AutoCompleteTextView, boolean)>
					return true;
	//   68  139:iconst_1        
	//   69  140:ireturn         
				}
			} else
			{
				return a(a.getListSelection(), 0, ((String) (null)));
	//   70  141:aload_0         
	//   71  142:aload_0         
	//   72  143:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   73  146:invokevirtual   #919 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//   74  149:iconst_0        
	//   75  150:aconst_null     
	//   76  151:invokevirtual   #930 <Method boolean a(int, int, String)>
	//   77  154:ireturn         
			}
		return false;
	//   78  155:iconst_0        
	//   79  156:ireturn         
	}

	public void b()
	{
		a("", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #828 <String "">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #932 <Method void a(CharSequence, boolean)>
		clearFocus();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #935 <Method void clearFocus()>
		a(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #469 <Method void a(boolean)>
		a.setImeOptions(P);
	//    9   17:aload_0         
	//   10   18:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   11   21:aload_0         
	//   12   22:getfield        #883 <Field int P>
	//   13   25:invokevirtual   #843 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		O = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #808 <Field boolean O>
	//   17   33:return          
	}

	void b(CharSequence charsequence)
	{
		Editable editable = a.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore          4
		N = ((CharSequence) (editable));
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:putfield        #568 <Field CharSequence N>
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (editable)));
	//    7   15:aload           4
	//    8   17:invokestatic    #637 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   20:istore_3        
		boolean flag = true;
	//   10   21:iconst_1        
	//   11   22:istore_2        
		flag1 ^= true;
	//   12   23:iload_3         
	//   13   24:iconst_1        
	//   14   25:ixor            
	//   15   26:istore_3        
		b(flag1);
	//   16   27:aload_0         
	//   17   28:iload_3         
	//   18   29:invokespecial   #642 <Method void b(boolean)>
		if(flag1)
	//*  19   32:iload_3         
	//*  20   33:ifne            39
	//*  21   36:goto            41
			flag = false;
	//   22   39:iconst_0        
	//   23   40:istore_2        
		c(flag);
	//   24   41:aload_0         
	//   25   42:iload_2         
	//   26   43:invokespecial   #651 <Method void c(boolean)>
		p();
	//   27   46:aload_0         
	//   28   47:invokespecial   #649 <Method void p()>
		o();
	//   29   50:aload_0         
	//   30   51:invokespecial   #653 <Method void o()>
		if(A != null && !TextUtils.equals(charsequence, M))
	//*  31   54:aload_0         
	//*  32   55:getfield        #937 <Field SearchView$c A>
	//*  33   58:ifnull          88
	//*  34   61:aload_1         
	//*  35   62:aload_0         
	//*  36   63:getfield        #939 <Field CharSequence M>
	//*  37   66:invokestatic    #943 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  38   69:ifne            88
			A.b(charsequence.toString());
	//   39   72:aload_0         
	//   40   73:getfield        #937 <Field SearchView$c A>
	//   41   76:aload_1         
	//   42   77:invokeinterface #944 <Method String CharSequence.toString()>
	//   43   82:invokeinterface #947 <Method boolean SearchView$c.b(String)>
	//   44   87:pop             
		M = ((CharSequence) (charsequence.toString()));
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokeinterface #944 <Method String CharSequence.toString()>
	//   48   95:putfield        #939 <Field CharSequence M>
	//   49   98:return          
	}

	public boolean c()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #627 <Field boolean F>
	//    2    4:ireturn         
	}

	public void clearFocus()
	{
		J = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #949 <Field boolean J>
		super.clearFocus();
	//    3    5:aload_0         
	//    4    6:invokespecial   #950 <Method void LinearLayoutCompat.clearFocus()>
		a.clearFocus();
	//    5    9:aload_0         
	//    6   10:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    7   13:invokevirtual   #951 <Method void SearchView$SearchAutoComplete.clearFocus()>
		SearchAutoComplete.a(a, false);
	//    8   16:aload_0         
	//    9   17:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   10   20:iconst_0        
	//   11   21:invokestatic    #905 <Method void SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete, boolean)>
		J = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #949 <Field boolean J>
	//   15   29:return          
	}

	void d()
	{
		int ai[];
		if(a.hasFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//*   2    4:invokevirtual   #952 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   3    7:ifeq            17
			ai = FOCUSED_STATE_SET;
	//    4   10:getstatic       #955 <Field int[] FOCUSED_STATE_SET>
	//    5   13:astore_1        
		else
	//*   6   14:goto            21
			ai = EMPTY_STATE_SET;
	//    7   17:getstatic       #814 <Field int[] EMPTY_STATE_SET>
	//    8   20:astore_1        
		Drawable drawable = l.getBackground();
	//    9   21:aload_0         
	//   10   22:getfield        #242 <Field View l>
	//   11   25:invokevirtual   #958 <Method Drawable View.getBackground()>
	//   12   28:astore_2        
		if(drawable != null)
	//*  13   29:aload_2         
	//*  14   30:ifnull          39
			drawable.setState(ai);
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #818 <Method boolean Drawable.setState(int[])>
	//   18   38:pop             
		drawable = m.getBackground();
	//   19   39:aload_0         
	//   20   40:getfield        #247 <Field View m>
	//   21   43:invokevirtual   #958 <Method Drawable View.getBackground()>
	//   22   46:astore_2        
		if(drawable != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          57
			drawable.setState(ai);
	//   25   51:aload_2         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #818 <Method boolean Drawable.setState(int[])>
	//   28   56:pop             
		invalidate();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #961 <Method void invalidate()>
	//   31   61:return          
	}

	void e()
	{
		Editable editable = a.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_1        
		if(editable != null && TextUtils.getTrimmedLength(((CharSequence) (editable))) > 0 && (A == null || !A.a(((CharSequence) (editable)).toString())))
	//*   4    8:aload_1         
	//*   5    9:ifnull          75
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #965 <Method int TextUtils.getTrimmedLength(CharSequence)>
	//*   8   16:ifle            75
	//*   9   19:aload_0         
	//*  10   20:getfield        #937 <Field SearchView$c A>
	//*  11   23:ifnull          44
	//*  12   26:aload_0         
	//*  13   27:getfield        #937 <Field SearchView$c A>
	//*  14   30:aload_1         
	//*  15   31:invokeinterface #944 <Method String CharSequence.toString()>
	//*  16   36:invokeinterface #967 <Method boolean SearchView$c.a(String)>
	//*  17   41:ifne            75
		{
			if(h != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #501 <Field SearchableInfo h>
	//*  20   48:ifnull          63
				a(0, ((String) (null)), ((CharSequence) (editable)).toString());
	//   21   51:aload_0         
	//   22   52:iconst_0        
	//   23   53:aconst_null     
	//   24   54:aload_1         
	//   25   55:invokeinterface #944 <Method String CharSequence.toString()>
	//   26   60:invokevirtual   #969 <Method void a(int, String, String)>
			SearchAutoComplete.a(a, false);
	//   27   63:aload_0         
	//   28   64:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   29   67:iconst_0        
	//   30   68:invokestatic    #905 <Method void SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete, boolean)>
			t();
	//   31   71:aload_0         
	//   32   72:invokespecial   #907 <Method void t()>
		}
	//   33   75:return          
	}

	void f()
	{
		if(TextUtils.isEmpty(((CharSequence) (a.getText()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//*   2    4:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//*   3    7:invokestatic    #637 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            49
		{
			if(E && (B == null || !B.a()))
	//*   5   13:aload_0         
	//*   6   14:getfield        #467 <Field boolean E>
	//*   7   17:ifeq            75
	//*   8   20:aload_0         
	//*   9   21:getfield        #971 <Field SearchView$b B>
	//*  10   24:ifnull          39
	//*  11   27:aload_0         
	//*  12   28:getfield        #971 <Field SearchView$b B>
	//*  13   31:invokeinterface #973 <Method boolean SearchView$b.a()>
	//*  14   36:ifne            75
			{
				clearFocus();
	//   15   39:aload_0         
	//   16   40:invokevirtual   #935 <Method void clearFocus()>
				a(true);
	//   17   43:aload_0         
	//   18   44:iconst_1        
	//   19   45:invokespecial   #469 <Method void a(boolean)>
				return;
	//   20   48:return          
			}
		} else
		{
			a.setText("");
	//   21   49:aload_0         
	//   22   50:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   23   53:ldc2            #828 <String "">
	//   24   56:invokevirtual   #869 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			a.requestFocus();
	//   25   59:aload_0         
	//   26   60:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   27   63:invokevirtual   #976 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//   28   66:pop             
			SearchAutoComplete.a(a, true);
	//   29   67:aload_0         
	//   30   68:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   31   71:iconst_1        
	//   32   72:invokestatic    #905 <Method void SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete, boolean)>
		}
	//   33   75:return          
	}

	void g()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #469 <Method void a(boolean)>
		a.requestFocus();
	//    3    5:aload_0         
	//    4    6:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    5    9:invokevirtual   #976 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//    6   12:pop             
		SearchAutoComplete.a(a, true);
	//    7   13:aload_0         
	//    8   14:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    9   17:iconst_1        
	//   10   18:invokestatic    #905 <Method void SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete, boolean)>
		if(D != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #978 <Field android.view.View$OnClickListener D>
	//*  13   25:ifnull          38
			D.onClick(((View) (this)));
	//   14   28:aload_0         
	//   15   29:getfield        #978 <Field android.view.View$OnClickListener D>
	//   16   32:aload_0         
	//   17   33:invokeinterface #984 <Method void android.view.View$OnClickListener.onClick(View)>
	//   18   38:return          
	}

	public int getImeOptions()
	{
		return a.getImeOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #881 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//    3    7:ireturn         
	}

	public int getInputType()
	{
		return a.getInputType();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #985 <Method int SearchView$SearchAutoComplete.getInputType()>
	//    3    7:ireturn         
	}

	public int getMaxWidth()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #988 <Field int K>
	//    2    4:ireturn         
	}

	public CharSequence getQuery()
	{
		return ((CharSequence) (a.getText()));
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:invokevirtual   #631 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:areturn         
	}

	public CharSequence getQueryHint()
	{
		if(H != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #404 <Field CharSequence H>
	//*   2    4:ifnull          12
			return H;
	//    3    7:aload_0         
	//    4    8:getfield        #404 <Field CharSequence H>
	//    5   11:areturn         
		if(h != null && h.getHintId() != 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #501 <Field SearchableInfo h>
	//*   8   16:ifnull          44
	//*   9   19:aload_0         
	//*  10   20:getfield        #501 <Field SearchableInfo h>
	//*  11   23:invokevirtual   #992 <Method int SearchableInfo.getHintId()>
	//*  12   26:ifeq            44
			return getContext().getText(h.getHintId());
	//   13   29:aload_0         
	//   14   30:invokevirtual   #597 <Method Context getContext()>
	//   15   33:aload_0         
	//   16   34:getfield        #501 <Field SearchableInfo h>
	//   17   37:invokevirtual   #992 <Method int SearchableInfo.getHintId()>
	//   18   40:invokevirtual   #994 <Method CharSequence Context.getText(int)>
	//   19   43:areturn         
		else
			return z;
	//   20   44:aload_0         
	//   21   45:getfield        #399 <Field CharSequence z>
	//   22   48:areturn         
	}

	int getSuggestionCommitIconResId()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field int w>
	//    2    4:ireturn         
	}

	int getSuggestionRowLayout()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field int v>
	//    2    4:ireturn         
	}

	public android.support.v4.widget.e getSuggestionsAdapter()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #718 <Field e g>
	//    2    4:areturn         
	}

	void h()
	{
		Object obj;
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #501 <Field SearchableInfo h>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		obj = ((Object) (h));
	//    4    8:aload_0         
	//    5    9:getfield        #501 <Field SearchableInfo h>
	//    6   12:astore_1        
		if(!((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch()) goto _L2; else goto _L1
	//    7   13:aload_1         
	//    8   14:invokevirtual   #789 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//    9   17:ifeq            39
_L1:
		obj = ((Object) (a(x, ((SearchableInfo) (obj)))));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #435 <Field Intent x>
	//   13   25:aload_1         
	//   14   26:invokespecial   #1002 <Method Intent a(Intent, SearchableInfo)>
	//   15   29:astore_1        
_L4:
		getContext().startActivity(((Intent) (obj)));
	//   16   30:aload_0         
	//   17   31:invokevirtual   #597 <Method Context getContext()>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #602 <Method void Context.startActivity(Intent)>
		return;
	//   20   38:return          
_L2:
		if(!((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer())
			break; /* Loop/switch isn't completed */
	//   21   39:aload_1         
	//   22   40:invokevirtual   #792 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//   23   43:ifeq            69
		obj = ((Object) (b(y, ((SearchableInfo) (obj)))));
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #452 <Field Intent y>
	//   27   51:aload_1         
	//   28   52:invokespecial   #1004 <Method Intent b(Intent, SearchableInfo)>
	//   29   55:astore_1        
		if(true) goto _L4; else goto _L3
	//   30   56:goto            30
_L6:
		Log.w("SearchView", "Could not find voice search activity");
	//   31   59:ldc2            #553 <String "SearchView">
	//   32   62:ldc2            #1006 <String "Could not find voice search activity">
	//   33   65:invokestatic    #1009 <Method int Log.w(String, String)>
	//   34   68:pop             
_L3:
		return;
	//   35   69:return          
		ActivityNotFoundException activitynotfoundexception;
		activitynotfoundexception;
	//   36   70:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//*  37   71:goto            59
	}

	void i()
	{
		a(c());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #763 <Method boolean c()>
	//    3    5:invokespecial   #469 <Method void a(boolean)>
		q();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1011 <Method void q()>
		if(a.hasFocus())
	//*   6   12:aload_0         
	//*   7   13:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//*   8   16:invokevirtual   #952 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   9   19:ifeq            26
			l();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #1013 <Method void l()>
	//   12   26:return          
	}

	void k()
	{
		if(n.getWidth() > 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #458 <Field View n>
	//*   2    4:invokevirtual   #618 <Method int View.getWidth()>
	//*   3    7:iconst_1        
	//*   4    8:icmple          159
		{
			Resources resources = getContext().getResources();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #597 <Method Context getContext()>
	//    7   15:invokevirtual   #655 <Method Resources Context.getResources()>
	//    8   18:astore          7
			int k1 = l.getPaddingLeft();
	//    9   20:aload_0         
	//   10   21:getfield        #242 <Field View l>
	//   11   24:invokevirtual   #1016 <Method int View.getPaddingLeft()>
	//   12   27:istore_3        
			Rect rect = new Rect();
	//   13   28:new             #147 <Class Rect>
	//   14   31:dup             
	//   15   32:invokespecial   #148 <Method void Rect()>
	//   16   35:astore          8
			boolean flag = bd.a(((View) (this)));
	//   17   37:aload_0         
	//   18   38:invokestatic    #1021 <Method boolean bd.a(View)>
	//   19   41:istore          6
			int i1;
			if(E)
	//*  20   43:aload_0         
	//*  21   44:getfield        #467 <Field boolean E>
	//*  22   47:ifeq            71
				i1 = resources.getDimensionPixelSize(android.support.v7.a.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(android.support.v7.a.a.d.abc_dropdownitem_text_padding_left);
	//   23   50:aload           7
	//   24   52:getstatic       #1024 <Field int android.support.v7.a.a$d.abc_dropdownitem_icon_width>
	//   25   55:invokevirtual   #779 <Method int Resources.getDimensionPixelSize(int)>
	//   26   58:aload           7
	//   27   60:getstatic       #1027 <Field int android.support.v7.a.a$d.abc_dropdownitem_text_padding_left>
	//   28   63:invokevirtual   #779 <Method int Resources.getDimensionPixelSize(int)>
	//   29   66:iadd            
	//   30   67:istore_1        
			else
	//*  31   68:goto            73
				i1 = 0;
	//   32   71:iconst_0        
	//   33   72:istore_1        
			a.getDropDownBackground().getPadding(rect);
	//   34   73:aload_0         
	//   35   74:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   36   77:invokevirtual   #1030 <Method Drawable SearchView$SearchAutoComplete.getDropDownBackground()>
	//   37   80:aload           8
	//   38   82:invokevirtual   #1034 <Method boolean Drawable.getPadding(Rect)>
	//   39   85:pop             
			int j1;
			if(flag)
	//*  40   86:iload           6
	//*  41   88:ifeq            101
				j1 = -rect.left;
	//   42   91:aload           8
	//   43   93:getfield        #1037 <Field int Rect.left>
	//   44   96:ineg            
	//   45   97:istore_2        
			else
	//*  46   98:goto            111
				j1 = k1 - (rect.left + i1);
	//   47  101:iload_3         
	//   48  102:aload           8
	//   49  104:getfield        #1037 <Field int Rect.left>
	//   50  107:iload_1         
	//   51  108:iadd            
	//   52  109:isub            
	//   53  110:istore_2        
			a.setDropDownHorizontalOffset(j1);
	//   54  111:aload_0         
	//   55  112:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   56  115:iload_2         
	//   57  116:invokevirtual   #1040 <Method void SearchView$SearchAutoComplete.setDropDownHorizontalOffset(int)>
			j1 = n.getWidth();
	//   58  119:aload_0         
	//   59  120:getfield        #458 <Field View n>
	//   60  123:invokevirtual   #618 <Method int View.getWidth()>
	//   61  126:istore_2        
			int l1 = rect.left;
	//   62  127:aload           8
	//   63  129:getfield        #1037 <Field int Rect.left>
	//   64  132:istore          4
			int i2 = rect.right;
	//   65  134:aload           8
	//   66  136:getfield        #1043 <Field int Rect.right>
	//   67  139:istore          5
			a.setDropDownWidth((j1 + l1 + i2 + i1) - k1);
	//   68  141:aload_0         
	//   69  142:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   70  145:iload_2         
	//   71  146:iload           4
	//   72  148:iadd            
	//   73  149:iload           5
	//   74  151:iadd            
	//   75  152:iload_1         
	//   76  153:iadd            
	//   77  154:iload_3         
	//   78  155:isub            
	//   79  156:invokevirtual   #1046 <Method void SearchView$SearchAutoComplete.setDropDownWidth(int)>
		}
	//   80  159:return          
	}

	void l()
	{
		i.a(((AutoCompleteTextView) (a)));
	//    0    0:getstatic       #131 <Field SearchView$a i>
	//    1    3:aload_0         
	//    2    4:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    3    7:invokevirtual   #1049 <Method void SearchView$a.a(AutoCompleteTextView)>
		i.b(((AutoCompleteTextView) (a)));
	//    4   10:getstatic       #131 <Field SearchView$a i>
	//    5   13:aload_0         
	//    6   14:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    7   17:invokevirtual   #1051 <Method void SearchView$a.b(AutoCompleteTextView)>
	//    8   20:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(R);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #161 <Field Runnable R>
	//    3    5:invokevirtual   #1055 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(S);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #164 <Field Runnable S>
	//    8   14:invokevirtual   #822 <Method boolean post(Runnable)>
	//    9   17:pop             
		super.onDetachedFromWindow();
	//   10   18:aload_0         
	//   11   19:invokespecial   #1057 <Method void LinearLayoutCompat.onDetachedFromWindow()>
	//   12   22:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		super.onLayout(flag, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #1061 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		if(flag)
	//*   7   11:iload_1         
	//*   8   12:ifeq            107
		{
			a(((View) (a)), p);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   12   20:aload_0         
	//   13   21:getfield        #150 <Field Rect p>
	//   14   24:invokespecial   #1063 <Method void a(View, Rect)>
			q.set(p.left, 0, p.right, l1 - j1);
	//   15   27:aload_0         
	//   16   28:getfield        #152 <Field Rect q>
	//   17   31:aload_0         
	//   18   32:getfield        #150 <Field Rect p>
	//   19   35:getfield        #1037 <Field int Rect.left>
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #150 <Field Rect p>
	//   23   43:getfield        #1043 <Field int Rect.right>
	//   24   46:iload           5
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:invokevirtual   #625 <Method void Rect.set(int, int, int, int)>
			if(o == null)
	//*  28   53:aload_0         
	//*  29   54:getfield        #1065 <Field SearchView$e o>
	//*  30   57:ifnonnull       92
			{
				o = new e(q, p, ((View) (a)));
	//   31   60:aload_0         
	//   32   61:new             #50  <Class SearchView$e>
	//   33   64:dup             
	//   34   65:aload_0         
	//   35   66:getfield        #152 <Field Rect q>
	//   36   69:aload_0         
	//   37   70:getfield        #150 <Field Rect p>
	//   38   73:aload_0         
	//   39   74:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   40   77:invokespecial   #1068 <Method void SearchView$e(Rect, Rect, View)>
	//   41   80:putfield        #1065 <Field SearchView$e o>
				setTouchDelegate(((TouchDelegate) (o)));
	//   42   83:aload_0         
	//   43   84:aload_0         
	//   44   85:getfield        #1065 <Field SearchView$e o>
	//   45   88:invokevirtual   #1072 <Method void setTouchDelegate(TouchDelegate)>
				return;
	//   46   91:return          
			}
			o.a(q, p);
	//   47   92:aload_0         
	//   48   93:getfield        #1065 <Field SearchView$e o>
	//   49   96:aload_0         
	//   50   97:getfield        #152 <Field Rect q>
	//   51  100:aload_0         
	//   52  101:getfield        #150 <Field Rect p>
	//   53  104:invokevirtual   #1075 <Method void SearchView$e.a(Rect, Rect)>
		}
	//   54  107:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int k1;
		int i2;
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #763 <Method boolean c()>
	//*   2    4:ifeq            14
		{
			super.onMeasure(i1, j1);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1079 <Method void LinearLayoutCompat.onMeasure(int, int)>
			return;
	//    7   13:return          
		}
		i2 = android.view.View.MeasureSpec.getMode(i1);
	//    8   14:iload_1         
	//    9   15:invokestatic    #1084 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   18:istore          4
		k1 = android.view.View.MeasureSpec.getSize(i1);
	//   11   20:iload_1         
	//   12   21:invokestatic    #1087 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   24:istore_3        
		if(i2 == 0x80000000) goto _L2; else goto _L1
	//   14   25:iload           4
	//   15   27:ldc2            #1088 <Int 0x80000000>
	//   16   30:icmpeq          86
_L1:
		if(i2 == 0) goto _L4; else goto _L3
	//   17   33:iload           4
	//   18   35:ifeq            63
_L3:
		if(i2 == 0x40000000) goto _L6; else goto _L5
	//   19   38:iload           4
	//   20   40:ldc2            #665 <Int 0x40000000>
	//   21   43:icmpeq          51
_L5:
		i1 = k1;
	//   22   46:iload_3         
	//   23   47:istore_1        
		  goto _L7
	//*  24   48:goto            115
_L6:
		i1 = k1;
	//   25   51:iload_3         
	//   26   52:istore_1        
		if(K <= 0) goto _L7; else goto _L8
	//   27   53:aload_0         
	//   28   54:getfield        #988 <Field int K>
	//   29   57:ifle            115
	//*  30   60:goto            93
_L4:
		if(K > 0)
	//*  31   63:aload_0         
	//*  32   64:getfield        #988 <Field int K>
	//*  33   67:ifle            78
			i1 = K;
	//   34   70:aload_0         
	//   35   71:getfield        #988 <Field int K>
	//   36   74:istore_1        
		else
	//*  37   75:goto            115
			i1 = getPreferredWidth();
	//   38   78:aload_0         
	//   39   79:invokespecial   #1090 <Method int getPreferredWidth()>
	//   40   82:istore_1        
		  goto _L7
	//*  41   83:goto            115
_L2:
		if(K <= 0) goto _L9; else goto _L8
	//   42   86:aload_0         
	//   43   87:getfield        #988 <Field int K>
	//   44   90:ifle            107
_L8:
		i1 = K;
	//   45   93:aload_0         
	//   46   94:getfield        #988 <Field int K>
	//   47   97:istore_1        
_L10:
		i1 = Math.min(i1, k1);
	//   48   98:iload_1         
	//   49   99:iload_3         
	//   50  100:invokestatic    #1095 <Method int Math.min(int, int)>
	//   51  103:istore_1        
		break; /* Loop/switch isn't completed */
	//   52  104:goto            115
_L9:
		i1 = getPreferredWidth();
	//   53  107:aload_0         
	//   54  108:invokespecial   #1090 <Method int getPreferredWidth()>
	//   55  111:istore_1        
		if(true) goto _L10; else goto _L7
	//   56  112:goto            98
_L7:
		int l1 = android.view.View.MeasureSpec.getMode(j1);
	//   57  115:iload_2         
	//   58  116:invokestatic    #1084 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   59  119:istore_3        
		j1 = android.view.View.MeasureSpec.getSize(j1);
	//   60  120:iload_2         
	//   61  121:invokestatic    #1087 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   62  124:istore_2        
		if(l1 != 0x80000000)
	//*  63  125:iload_3         
	//*  64  126:ldc2            #1088 <Int 0x80000000>
	//*  65  129:icmpeq          147
		{
			if(l1 == 0)
	//*  66  132:iload_3         
	//*  67  133:ifeq            139
	//*  68  136:goto            156
				j1 = getPreferredHeight();
	//   69  139:aload_0         
	//   70  140:invokespecial   #1097 <Method int getPreferredHeight()>
	//   71  143:istore_2        
		} else
	//*  72  144:goto            156
		{
			j1 = Math.min(getPreferredHeight(), j1);
	//   73  147:aload_0         
	//   74  148:invokespecial   #1097 <Method int getPreferredHeight()>
	//   75  151:iload_2         
	//   76  152:invokestatic    #1095 <Method int Math.min(int, int)>
	//   77  155:istore_2        
		}
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
	//   78  156:aload_0         
	//   79  157:iload_1         
	//   80  158:ldc2            #665 <Int 0x40000000>
	//   81  161:invokestatic    #1100 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   82  164:iload_2         
	//   83  165:ldc2            #665 <Int 0x40000000>
	//   84  168:invokestatic    #1100 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   85  171:invokespecial   #1079 <Method void LinearLayoutCompat.onMeasure(int, int)>
		return;
	//   86  174:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #28  <Class SearchView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1104 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #28  <Class SearchView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1107 <Method Parcelable SearchView$SavedState.a()>
	//   13   23:invokespecial   #1104 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			a(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #1109 <Field boolean SearchView$SavedState.a>
	//   17   31:invokespecial   #469 <Method void a(boolean)>
			requestLayout();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #1112 <Method void requestLayout()>
			return;
	//   20   38:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #28  <Class SearchView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1115 <Method Parcelable LinearLayoutCompat.onSaveInstanceState()>
	//    4    8:invokespecial   #1117 <Method void SearchView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = c();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #763 <Method boolean c()>
	//    9   17:putfield        #1109 <Field boolean SearchView$SavedState.a>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1120 <Method void LinearLayoutCompat.onWindowFocusChanged(boolean)>
		q();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1011 <Method void q()>
	//    5    9:return          
	}

	public boolean requestFocus(int i1, Rect rect)
	{
		if(J)
	//*   0    0:aload_0         
	//*   1    1:getfield        #949 <Field boolean J>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!isFocusable())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #1124 <Method boolean isFocusable()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(!c())
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #763 <Method boolean c()>
	//*  12   22:ifne            46
		{
			boolean flag = a.requestFocus(i1, rect);
	//   13   25:aload_0         
	//   14   26:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   15   29:iload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #1126 <Method boolean SearchView$SearchAutoComplete.requestFocus(int, Rect)>
	//   18   34:istore_3        
			if(flag)
	//*  19   35:iload_3         
	//*  20   36:ifeq            44
				a(false);
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:invokespecial   #469 <Method void a(boolean)>
			return flag;
	//   24   44:iload_3         
	//   25   45:ireturn         
		} else
		{
			return super.requestFocus(i1, rect);
	//   26   46:aload_0         
	//   27   47:iload_1         
	//   28   48:aload_2         
	//   29   49:invokespecial   #1127 <Method boolean LinearLayoutCompat.requestFocus(int, Rect)>
	//   30   52:ireturn         
		}
	}

	public void setAppSearchData(Bundle bundle)
	{
		Q = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #577 <Field Bundle Q>
	//    3    5:return          
	}

	public void setIconified(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
		{
			f();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1131 <Method void f()>
			return;
	//    4    8:return          
		} else
		{
			g();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1133 <Method void g()>
			return;
	//    7   13:return          
		}
	}

	public void setIconifiedByDefault(boolean flag)
	{
		if(E == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #467 <Field boolean E>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			E = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #467 <Field boolean E>
			a(flag);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #469 <Method void a(boolean)>
			r();
	//   11   19:aload_0         
	//   12   20:invokespecial   #471 <Method void r()>
			return;
	//   13   23:return          
		}
	}

	public void setImeOptions(int i1)
	{
		a.setImeOptions(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #843 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
	//    4    8:return          
	}

	public void setInputType(int i1)
	{
		a.setInputType(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #852 <Method void SearchView$SearchAutoComplete.setInputType(int)>
	//    4    8:return          
	}

	public void setMaxWidth(int i1)
	{
		K = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #988 <Field int K>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1112 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setOnCloseListener(b b1)
	{
		B = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #971 <Field SearchView$b B>
	//    3    5:return          
	}

	public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
	{
		f = onfocuschangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1138 <Field android.view.View$OnFocusChangeListener f>
	//    3    5:return          
	}

	public void setOnQueryTextListener(c c1)
	{
		A = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #937 <Field SearchView$c A>
	//    3    5:return          
	}

	public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
	{
		D = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #978 <Field android.view.View$OnClickListener D>
	//    3    5:return          
	}

	public void setOnSuggestionListener(d d1)
	{
		C = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #894 <Field SearchView$d C>
	//    3    5:return          
	}

	public void setQueryHint(CharSequence charsequence)
	{
		H = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #404 <Field CharSequence H>
		r();
	//    3    5:aload_0         
	//    4    6:invokespecial   #471 <Method void r()>
	//    5    9:return          
	}

	public void setQueryRefinementEnabled(boolean flag)
	{
		I = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #864 <Field boolean I>
		if(g instanceof ap)
	//*   3    5:aload_0         
	//*   4    6:getfield        #718 <Field e g>
	//*   5    9:instanceof      #496 <Class ap>
	//*   6   12:ifeq            39
		{
			ap ap1 = (ap)g;
	//    7   15:aload_0         
	//    8   16:getfield        #718 <Field e g>
	//    9   19:checkcast       #496 <Class ap>
	//   10   22:astore_3        
			byte byte0;
			if(flag)
	//*  11   23:iload_1         
	//*  12   24:ifeq            32
				byte0 = 2;
	//   13   27:iconst_2        
	//   14   28:istore_2        
			else
	//*  15   29:goto            34
				byte0 = 1;
	//   16   32:iconst_1        
	//   17   33:istore_2        
			ap1.a(((int) (byte0)));
	//   18   34:aload_3         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #866 <Method void ap.a(int)>
		}
	//   21   39:return          
	}

	public void setSearchableInfo(SearchableInfo searchableinfo)
	{
		h = searchableinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #501 <Field SearchableInfo h>
		if(h != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #501 <Field SearchableInfo h>
	//*   5    9:ifnull          20
		{
			s();
	//    6   12:aload_0         
	//    7   13:invokespecial   #1149 <Method void s()>
			r();
	//    8   16:aload_0         
	//    9   17:invokespecial   #471 <Method void r()>
		}
		L = m();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #1151 <Method boolean m()>
	//   13   25:putfield        #715 <Field boolean L>
		if(L)
	//*  14   28:aload_0         
	//*  15   29:getfield        #715 <Field boolean L>
	//*  16   32:ifeq            45
			a.setPrivateImeOptions("nm");
	//   17   35:aload_0         
	//   18   36:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//   19   39:ldc2            #1153 <String "nm">
	//   20   42:invokevirtual   #1156 <Method void SearchView$SearchAutoComplete.setPrivateImeOptions(String)>
		a(c());
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:invokevirtual   #763 <Method boolean c()>
	//   24   50:invokespecial   #469 <Method void a(boolean)>
	//   25   53:return          
	}

	public void setSubmitButtonEnabled(boolean flag)
	{
		G = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #707 <Field boolean G>
		a(c());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #763 <Method boolean c()>
	//    6   10:invokespecial   #469 <Method void a(boolean)>
	//    7   13:return          
	}

	public void setSuggestionsAdapter(android.support.v4.widget.e e1)
	{
		g = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #718 <Field e g>
		a.setAdapter(((android.widget.ListAdapter) (g)));
	//    3    5:aload_0         
	//    4    6:getfield        #229 <Field SearchView$SearchAutoComplete a>
	//    5    9:aload_0         
	//    6   10:getfield        #718 <Field e g>
	//    7   13:invokevirtual   #862 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
	//    8   16:return          
	}

	static final a i = new a();
	private c A;
	private b B;
	private d C;
	private android.view.View.OnClickListener D;
	private boolean E;
	private boolean F;
	private boolean G;
	private CharSequence H;
	private boolean I;
	private boolean J;
	private int K;
	private boolean L;
	private CharSequence M;
	private CharSequence N;
	private boolean O;
	private int P;
	private Bundle Q;
	private final Runnable R;
	private Runnable S = new Runnable() {

		public void run()
		{
			if(a.g != null && (a.g instanceof ap))
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SearchView a>
		//*   2    4:getfield        #23  <Field e SearchView.g>
		//*   3    7:ifnull          34
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field SearchView a>
		//*   6   14:getfield        #23  <Field e SearchView.g>
		//*   7   17:instanceof      #25  <Class ap>
		//*   8   20:ifeq            34
				a.g.a(((Cursor) (null)));
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field SearchView a>
		//   11   27:getfield        #23  <Field e SearchView.g>
		//   12   30:aconst_null     
		//   13   31:invokevirtual   #30  <Method void e.a(Cursor)>
		//   14   34:return          
		}

		final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final WeakHashMap T;
	private final android.view.View.OnClickListener U;
	private final android.widget.TextView.OnEditorActionListener V;
	private final android.widget.AdapterView.OnItemClickListener W;
	final SearchAutoComplete a;
	private final android.widget.AdapterView.OnItemSelectedListener aa;
	private TextWatcher ab = new TextWatcher() {

		public void afterTextChanged(Editable editable)
		{
		//    0    0:return          
		}

		public void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
		{
		//    0    0:return          
		}

		public void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
		{
			a.b(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field SearchView a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method void SearchView.b(CharSequence)>
		//    4    8:return          
		}

		final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final ImageView b;
	final ImageView c;
	final ImageView d;
	final ImageView e;
	android.view.View.OnFocusChangeListener f;
	android.support.v4.widget.e g;
	SearchableInfo h;
	android.view.View.OnKeyListener j = new android.view.View.OnKeyListener() {

		public boolean onKey(View view, int j1, KeyEvent keyevent)
		{
			if(a.h == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SearchView a>
		//*   2    4:getfield        #24  <Field SearchableInfo SearchView.h>
		//*   3    7:ifnonnull       12
				return false;
		//    4   10:iconst_0        
		//    5   11:ireturn         
			if(a.a.isPopupShowing() && a.a.getListSelection() != -1)
		//*   6   12:aload_0         
		//*   7   13:getfield        #14  <Field SearchView a>
		//*   8   16:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
		//*   9   19:invokevirtual   #33  <Method boolean SearchView$SearchAutoComplete.isPopupShowing()>
		//*  10   22:ifeq            50
		//*  11   25:aload_0         
		//*  12   26:getfield        #14  <Field SearchView a>
		//*  13   29:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
		//*  14   32:invokevirtual   #37  <Method int SearchView$SearchAutoComplete.getListSelection()>
		//*  15   35:iconst_m1       
		//*  16   36:icmpeq          50
				return a.a(view, j1, keyevent);
		//   17   39:aload_0         
		//   18   40:getfield        #14  <Field SearchView a>
		//   19   43:aload_1         
		//   20   44:iload_2         
		//   21   45:aload_3         
		//   22   46:invokevirtual   #39  <Method boolean SearchView.a(View, int, KeyEvent)>
		//   23   49:ireturn         
			if(!SearchAutoComplete.a(a.a) && keyevent.hasNoModifiers() && keyevent.getAction() == 1 && j1 == 66)
		//*  24   50:aload_0         
		//*  25   51:getfield        #14  <Field SearchView a>
		//*  26   54:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
		//*  27   57:invokestatic    #42  <Method boolean SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete)>
		//*  28   60:ifne            112
		//*  29   63:aload_3         
		//*  30   64:invokevirtual   #47  <Method boolean KeyEvent.hasNoModifiers()>
		//*  31   67:ifeq            112
		//*  32   70:aload_3         
		//*  33   71:invokevirtual   #50  <Method int KeyEvent.getAction()>
		//*  34   74:iconst_1        
		//*  35   75:icmpne          112
		//*  36   78:iload_2         
		//*  37   79:bipush          66
		//*  38   81:icmpne          112
			{
				view.cancelLongPress();
		//   39   84:aload_1         
		//   40   85:invokevirtual   #55  <Method void View.cancelLongPress()>
				a.a(0, ((String) (null)), ((Object) (a.a.getText())).toString());
		//   41   88:aload_0         
		//   42   89:getfield        #14  <Field SearchView a>
		//   43   92:iconst_0        
		//   44   93:aconst_null     
		//   45   94:aload_0         
		//   46   95:getfield        #14  <Field SearchView a>
		//   47   98:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
		//   48  101:invokevirtual   #59  <Method Editable SearchView$SearchAutoComplete.getText()>
		//   49  104:invokevirtual   #63  <Method String Object.toString()>
		//   50  107:invokevirtual   #66  <Method void SearchView.a(int, String, String)>
				return true;
		//   51  110:iconst_1        
		//   52  111:ireturn         
			} else
			{
				return false;
		//   53  112:iconst_0        
		//   54  113:ireturn         
			}
		}

		final SearchView a;

			
			{
				a = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final View k;
	private final View l;
	private final View m;
	private final View n;
	private e o;
	private Rect p;
	private Rect q;
	private int r[];
	private int s[];
	private final ImageView t;
	private final Drawable u;
	private final int v;
	private final int w;
	private final Intent x;
	private final Intent y;
	private final CharSequence z;

	static 
	{
	//    0    0:new             #38  <Class SearchView$a>
	//    1    3:dup             
	//    2    4:invokespecial   #129 <Method void SearchView$a()>
	//    3    7:putstatic       #131 <Field SearchView$a i>
	//*   4   10:return          
	}

	// Unreferenced inner class android/support/v7/widget/SearchView$SearchAutoComplete$1

/* anonymous class */
	class SearchAutoComplete._cls1
		implements Runnable
	{

		public void run()
		{
			SearchAutoComplete.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field SearchView$SearchAutoComplete a>
		//    2    4:invokestatic    #25  <Method void SearchView$SearchAutoComplete.b(SearchView$SearchAutoComplete)>
		//    3    7:return          
		}

		final SearchAutoComplete a;

			
			{
				a = searchautocomplete;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchView$SearchAutoComplete a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
