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
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.view.CollapsibleActionView;
import android.text.*;
import android.text.style.ImageSpan;
import android.util.*;
import android.view.*;
import android.view.inputmethod.*;
import android.widget.*;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, TintTypedArray, TooltipCompat, SuggestionsAdapter, 
//			ViewUtils, AppCompatAutoCompleteTextView

public class SearchView extends LinearLayoutCompat
	implements CollapsibleActionView
{
	private static class AutoCompleteTextViewReflector
	{

		void doAfterTextChanged(AutoCompleteTextView autocompletetextview)
		{
			if(doAfterTextChanged == null)
				break MISSING_BLOCK_LABEL_20;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field Method doAfterTextChanged>
		//    2    4:ifnull          20
			doAfterTextChanged.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field Method doAfterTextChanged>
		//    5   11:aload_1         
		//    6   12:iconst_0        
		//    7   13:anewarray       Object[]
		//    8   16:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
		//    9   19:pop             
			return;
		//   10   20:return          
			autocompletetextview;
		//   11   21:astore_1        
		//   12   22:return          
		}

		void doBeforeTextChanged(AutoCompleteTextView autocompletetextview)
		{
			if(doBeforeTextChanged == null)
				break MISSING_BLOCK_LABEL_20;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Method doBeforeTextChanged>
		//    2    4:ifnull          20
			doBeforeTextChanged.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field Method doBeforeTextChanged>
		//    5   11:aload_1         
		//    6   12:iconst_0        
		//    7   13:anewarray       Object[]
		//    8   16:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
		//    9   19:pop             
			return;
		//   10   20:return          
			autocompletetextview;
		//   11   21:astore_1        
		//   12   22:return          
		}

		void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
		{
			if(ensureImeVisible == null)
				break MISSING_BLOCK_LABEL_27;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field Method ensureImeVisible>
		//    2    4:ifnull          27
			ensureImeVisible.invoke(((Object) (autocompletetextview)), new Object[] {
				Boolean.valueOf(flag)
			});
		//    3    7:aload_0         
		//    4    8:getfield        #50  <Field Method ensureImeVisible>
		//    5   11:aload_1         
		//    6   12:iconst_1        
		//    7   13:anewarray       Object[]
		//    8   16:dup             
		//    9   17:iconst_0        
		//   10   18:iload_2         
		//   11   19:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
		//   12   22:aastore         
		//   13   23:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
		//   14   26:pop             
			return;
		//   15   27:return          
			autocompletetextview;
		//   16   28:astore_1        
		//   17   29:return          
		}

		private Method doAfterTextChanged;
		private Method doBeforeTextChanged;
		private Method ensureImeVisible;
		private Method showSoftInputUnchecked;

		AutoCompleteTextViewReflector()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			try
			{
				doBeforeTextChanged = ((Class) (android/widget/AutoCompleteTextView)).getDeclaredMethod("doBeforeTextChanged", new Class[0]);
		//    2    4:aload_0         
		//    3    5:ldc1            #20  <Class AutoCompleteTextView>
		//    4    7:ldc1            #21  <String "doBeforeTextChanged">
		//    5    9:iconst_0        
		//    6   10:anewarray       Class[]
		//    7   13:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    8   16:putfield        #29  <Field Method doBeforeTextChanged>
				doBeforeTextChanged.setAccessible(true);
		//    9   19:aload_0         
		//   10   20:getfield        #29  <Field Method doBeforeTextChanged>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #35  <Method void Method.setAccessible(boolean)>
			}
		//*  13   27:aload_0         
		//*  14   28:ldc1            #20  <Class AutoCompleteTextView>
		//*  15   30:ldc1            #36  <String "doAfterTextChanged">
		//*  16   32:iconst_0        
		//*  17   33:anewarray       Class[]
		//*  18   36:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
		//*  19   39:putfield        #38  <Field Method doAfterTextChanged>
		//*  20   42:aload_0         
		//*  21   43:getfield        #38  <Field Method doAfterTextChanged>
		//*  22   46:iconst_1        
		//*  23   47:invokevirtual   #35  <Method void Method.setAccessible(boolean)>
		//*  24   50:aload_0         
		//*  25   51:ldc1            #20  <Class AutoCompleteTextView>
		//*  26   53:ldc1            #39  <String "ensureImeVisible">
		//*  27   55:iconst_1        
		//*  28   56:anewarray       Class[]
		//*  29   59:dup             
		//*  30   60:iconst_0        
		//*  31   61:getstatic       #45  <Field Class Boolean.TYPE>
		//*  32   64:aastore         
		//*  33   65:invokevirtual   #48  <Method Method Class.getMethod(String, Class[])>
		//*  34   68:putfield        #50  <Field Method ensureImeVisible>
		//*  35   71:aload_0         
		//*  36   72:getfield        #50  <Field Method ensureImeVisible>
		//*  37   75:iconst_1        
		//*  38   76:invokevirtual   #35  <Method void Method.setAccessible(boolean)>
		//*  39   79:return          
			catch(NoSuchMethodException nosuchmethodexception) { }
		//   40   80:astore_1        
			try
			{
				doAfterTextChanged = ((Class) (android/widget/AutoCompleteTextView)).getDeclaredMethod("doAfterTextChanged", new Class[0]);
				doAfterTextChanged.setAccessible(true);
			}
		//*  41   81:goto            27
			catch(NoSuchMethodException nosuchmethodexception1) { }
		//   42   84:astore_1        
			try
			{
				ensureImeVisible = ((Class) (android/widget/AutoCompleteTextView)).getMethod("ensureImeVisible", new Class[] {
					Boolean.TYPE
				});
				ensureImeVisible.setAccessible(true);
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

	public static interface OnCloseListener
	{

		public abstract boolean onClose();
	}

	public static interface OnQueryTextListener
	{

		public abstract boolean onQueryTextChange(String s);

		public abstract boolean onQueryTextSubmit(String s);
	}

	public static interface OnSuggestionListener
	{

		public abstract boolean onSuggestionClick(int i);

		public abstract boolean onSuggestionSelect(int i);
	}

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
			stringbuilder.append(isIconified);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #39  <Field boolean isIconified>
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

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #78  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeValue(((Object) (Boolean.valueOf(isIconified))));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #39  <Field boolean isIconified>
		//    7   11:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
		//    8   14:invokevirtual   #86  <Method void Parcel.writeValue(Object)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SearchView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SearchView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class SearchView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void SearchView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method SearchView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method SearchView$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method SearchView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean isIconified;

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
			isIconified = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #31  <Method Object Parcel.readValue(ClassLoader)>
		//    8   12:checkcast       #33  <Class Boolean>
		//    9   15:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
		//   10   18:putfield        #39  <Field boolean isIconified>
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

		private boolean isEmpty()
		{
			return TextUtils.getTrimmedLength(((CharSequence) (getText()))) == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #90  <Method Editable getText()>
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
			if(inputmethodmanager.isActive(((View) (this))))
		//*  23   42:aload_2         
		//*  24   43:aload_0         
		//*  25   44:invokevirtual   #128 <Method boolean InputMethodManager.isActive(View)>
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
				inputmethodmanager.showSoftInput(((View) (this)), 0);
		//   35   64:aload_2         
		//   36   65:aload_0         
		//   37   66:iconst_0        
		//   38   67:invokevirtual   #132 <Method boolean InputMethodManager.showSoftInput(View, int)>
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
				((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((View) (this)), 0);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #100 <Method Context getContext()>
		//    5   11:ldc1            #102 <String "input_method">
		//    6   13:invokevirtual   #108 <Method Object Context.getSystemService(String)>
		//    7   16:checkcast       #110 <Class InputMethodManager>
		//    8   19:aload_0         
		//    9   20:iconst_0        
		//   10   21:invokevirtual   #132 <Method boolean InputMethodManager.showSoftInput(View, int)>
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
		//    2    4:ifle            19
		//    3    7:aload_0         
		//    4    8:invokespecial   #135 <Method boolean AppCompatAutoCompleteTextView.enoughToFilter()>
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
					SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(((AutoCompleteTextView) (this)), true);
		//   19   41:getstatic       #222 <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
		//   20   44:aload_0         
		//   21   45:iconst_1        
		//   22   46:invokevirtual   #228 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
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
		static void access$000(SearchAutoComplete searchautocomplete, boolean flag)
		{
			searchautocomplete.setImeVisibility(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #53  <Method void setImeVisibility(boolean)>
			return;
		//    3    5:return          
		}

*/


/*
		static boolean access$100(SearchAutoComplete searchautocomplete)
		{
			return searchautocomplete.isEmpty();
		//    0    0:aload_0         
		//    1    1:invokespecial   #59  <Method boolean isEmpty()>
		//    2    4:ireturn         
		}

*/


/*
		static void access$200(SearchAutoComplete searchautocomplete)
		{
			searchautocomplete.showSoftInputIfNecessary();
		//    0    0:aload_0         
		//    1    1:invokespecial   #64  <Method void showSoftInputIfNecessary()>
			return;
		//    2    4:return          
		}

*/

		public SearchAutoComplete(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #26  <Method void SearchView$SearchAutoComplete(Context, AttributeSet)>
		//    4    6:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset)
		{
			this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #32  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
		//    4    6:invokespecial   #35  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
		//    5    9:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
		{
			super(context, attributeset, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #36  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
			mRunShowSoftInputIfNecessary = new _cls1();
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

	private static class UpdatableTouchDelegate extends TouchDelegate
	{

		public boolean onTouchEvent(MotionEvent motionevent)
		{
			int j = (int)motionevent.getX();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #66  <Method float MotionEvent.getX()>
		//    2    4:f2i             
		//    3    5:istore          4
			int k = (int)motionevent.getY();
		//    4    7:aload_1         
		//    5    8:invokevirtual   #69  <Method float MotionEvent.getY()>
		//    6   11:f2i             
		//    7   12:istore          5
			int i = motionevent.getAction();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #72  <Method int MotionEvent.getAction()>
		//   10   18:istore_2        
			boolean flag = true;
		//   11   19:iconst_1        
		//   12   20:istore_3        
			boolean flag2 = false;
		//   13   21:iconst_0        
		//   14   22:istore          7
			boolean flag1;
			switch(i)
		//*  15   24:iload_2         
			{
		//*  16   25:tableswitch     0 3: default 56
		//		               0 121
		//		               1 75
		//		               2 75
		//		               3 59
		//*  17   56:goto            148
			case 3: // '\003'
				flag1 = mDelegateTargeted;
		//   18   59:aload_0         
		//   19   60:getfield        #74  <Field boolean mDelegateTargeted>
		//   20   63:istore          6
				mDelegateTargeted = false;
		//   21   65:aload_0         
		//   22   66:iconst_0        
		//   23   67:putfield        #74  <Field boolean mDelegateTargeted>
				i = ((int) (flag));
		//   24   70:iload_3         
		//   25   71:istore_2        
				break;
		//   26   72:goto            153

			case 1: // '\001'
			case 2: // '\002'
				boolean flag3 = mDelegateTargeted;
		//   27   75:aload_0         
		//   28   76:getfield        #74  <Field boolean mDelegateTargeted>
		//   29   79:istore          8
				flag1 = flag3;
		//   30   81:iload           8
		//   31   83:istore          6
				i = ((int) (flag));
		//   32   85:iload_3         
		//   33   86:istore_2        
				if(flag3)
		//*  34   87:iload           8
		//*  35   89:ifeq            153
				{
					flag1 = flag3;
		//   36   92:iload           8
		//   37   94:istore          6
					i = ((int) (flag));
		//   38   96:iload_3         
		//   39   97:istore_2        
					if(!mSlopBounds.contains(j, k))
		//*  40   98:aload_0         
		//*  41   99:getfield        #49  <Field Rect mSlopBounds>
		//*  42  102:iload           4
		//*  43  104:iload           5
		//*  44  106:invokevirtual   #78  <Method boolean Rect.contains(int, int)>
		//*  45  109:ifne            153
					{
						i = 0;
		//   46  112:iconst_0        
		//   47  113:istore_2        
						flag1 = flag3;
		//   48  114:iload           8
		//   49  116:istore          6
					}
				}
				break;
		//   50  118:goto            153

			case 0: // '\0'
				if(mTargetBounds.contains(j, k))
		//*  51  121:aload_0         
		//*  52  122:getfield        #47  <Field Rect mTargetBounds>
		//*  53  125:iload           4
		//*  54  127:iload           5
		//*  55  129:invokevirtual   #78  <Method boolean Rect.contains(int, int)>
		//*  56  132:ifeq            148
				{
					mDelegateTargeted = true;
		//   57  135:aload_0         
		//   58  136:iconst_1        
		//   59  137:putfield        #74  <Field boolean mDelegateTargeted>
					flag1 = true;
		//   60  140:iconst_1        
		//   61  141:istore          6
					i = ((int) (flag));
		//   62  143:iload_3         
		//   63  144:istore_2        
					break;
		//   64  145:goto            153
				}
				// fall through

			default:
				flag1 = false;
		//   65  148:iconst_0        
		//   66  149:istore          6
				i = ((int) (flag));
		//   67  151:iload_3         
		//   68  152:istore_2        
				break;
			}
			if(flag1)
		//*  69  153:iload           6
		//*  70  155:ifeq            239
			{
				if(i && !mActualBounds.contains(j, k))
		//*  71  158:iload_2         
		//*  72  159:ifeq            203
		//*  73  162:aload_0         
		//*  74  163:getfield        #51  <Field Rect mActualBounds>
		//*  75  166:iload           4
		//*  76  168:iload           5
		//*  77  170:invokevirtual   #78  <Method boolean Rect.contains(int, int)>
		//*  78  173:ifne            203
					motionevent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
		//   79  176:aload_1         
		//   80  177:aload_0         
		//   81  178:getfield        #57  <Field View mDelegateView>
		//   82  181:invokevirtual   #81  <Method int View.getWidth()>
		//   83  184:iconst_2        
		//   84  185:idiv            
		//   85  186:i2f             
		//   86  187:aload_0         
		//   87  188:getfield        #57  <Field View mDelegateView>
		//   88  191:invokevirtual   #84  <Method int View.getHeight()>
		//   89  194:iconst_2        
		//   90  195:idiv            
		//   91  196:i2f             
		//   92  197:invokevirtual   #88  <Method void MotionEvent.setLocation(float, float)>
				else
		//*  93  200:goto            229
					motionevent.setLocation(j - mActualBounds.left, k - mActualBounds.top);
		//   94  203:aload_1         
		//   95  204:iload           4
		//   96  206:aload_0         
		//   97  207:getfield        #51  <Field Rect mActualBounds>
		//   98  210:getfield        #91  <Field int Rect.left>
		//   99  213:isub            
		//  100  214:i2f             
		//  101  215:iload           5
		//  102  217:aload_0         
		//  103  218:getfield        #51  <Field Rect mActualBounds>
		//  104  221:getfield        #94  <Field int Rect.top>
		//  105  224:isub            
		//  106  225:i2f             
		//  107  226:invokevirtual   #88  <Method void MotionEvent.setLocation(float, float)>
				flag2 = mDelegateView.dispatchTouchEvent(motionevent);
		//  108  229:aload_0         
		//  109  230:getfield        #57  <Field View mDelegateView>
		//  110  233:aload_1         
		//  111  234:invokevirtual   #97  <Method boolean View.dispatchTouchEvent(MotionEvent)>
		//  112  237:istore          7
			}
			return flag2;
		//  113  239:iload           7
		//  114  241:ireturn         
		}

		public void setBounds(Rect rect, Rect rect1)
		{
			mTargetBounds.set(rect);
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Rect mTargetBounds>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #101 <Method void Rect.set(Rect)>
			mSlopBounds.set(rect);
		//    4    8:aload_0         
		//    5    9:getfield        #49  <Field Rect mSlopBounds>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #101 <Method void Rect.set(Rect)>
			mSlopBounds.inset(-mSlop, -mSlop);
		//    8   16:aload_0         
		//    9   17:getfield        #49  <Field Rect mSlopBounds>
		//   10   20:aload_0         
		//   11   21:getfield        #40  <Field int mSlop>
		//   12   24:ineg            
		//   13   25:aload_0         
		//   14   26:getfield        #40  <Field int mSlop>
		//   15   29:ineg            
		//   16   30:invokevirtual   #105 <Method void Rect.inset(int, int)>
			mActualBounds.set(rect1);
		//   17   33:aload_0         
		//   18   34:getfield        #51  <Field Rect mActualBounds>
		//   19   37:aload_2         
		//   20   38:invokevirtual   #101 <Method void Rect.set(Rect)>
		//   21   41:return          
		}

		private final Rect mActualBounds = new Rect();
		private boolean mDelegateTargeted;
		private final View mDelegateView;
		private final int mSlop;
		private final Rect mSlopBounds = new Rect();
		private final Rect mTargetBounds = new Rect();

		public UpdatableTouchDelegate(Rect rect, Rect rect1, View view)
		{
			super(rect, view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_3         
		//    3    3:invokespecial   #22  <Method void TouchDelegate(Rect, View)>
			mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:invokevirtual   #28  <Method Context View.getContext()>
		//    7   11:invokestatic    #34  <Method ViewConfiguration ViewConfiguration.get(Context)>
		//    8   14:invokevirtual   #38  <Method int ViewConfiguration.getScaledTouchSlop()>
		//    9   17:putfield        #40  <Field int mSlop>
		//   10   20:aload_0         
		//   11   21:new             #42  <Class Rect>
		//   12   24:dup             
		//   13   25:invokespecial   #45  <Method void Rect()>
		//   14   28:putfield        #47  <Field Rect mTargetBounds>
		//   15   31:aload_0         
		//   16   32:new             #42  <Class Rect>
		//   17   35:dup             
		//   18   36:invokespecial   #45  <Method void Rect()>
		//   19   39:putfield        #49  <Field Rect mSlopBounds>
		//   20   42:aload_0         
		//   21   43:new             #42  <Class Rect>
		//   22   46:dup             
		//   23   47:invokespecial   #45  <Method void Rect()>
		//   24   50:putfield        #51  <Field Rect mActualBounds>
			setBounds(rect, rect1);
		//   25   53:aload_0         
		//   26   54:aload_1         
		//   27   55:aload_2         
		//   28   56:invokevirtual   #55  <Method void setBounds(Rect, Rect)>
			mDelegateView = view;
		//   29   59:aload_0         
		//   30   60:aload_3         
		//   31   61:putfield        #57  <Field View mDelegateView>
		//   32   64:return          
		}
	}


	public SearchView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #151 <Method void SearchView(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.searchViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #156 <Field int android.support.v7.appcompat.R$attr.searchViewStyle>
	//    4    6:invokespecial   #159 <Method void SearchView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #160 <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		mSearchSrcTextViewBounds = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #162 <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #163 <Method void Rect()>
	//    9   15:putfield        #165 <Field Rect mSearchSrcTextViewBounds>
		mSearchSrtTextViewBoundsExpanded = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #162 <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #163 <Method void Rect()>
	//   14   26:putfield        #167 <Field Rect mSearchSrtTextViewBoundsExpanded>
		mTemp = new int[2];
	//   15   29:aload_0         
	//   16   30:iconst_2        
	//   17   31:newarray        int[]
	//   18   33:putfield        #169 <Field int[] mTemp>
		mTemp2 = new int[2];
	//   19   36:aload_0         
	//   20   37:iconst_2        
	//   21   38:newarray        int[]
	//   22   40:putfield        #171 <Field int[] mTemp2>
		mUpdateDrawableStateRunnable = new Runnable() {

			public void run()
			{
				updateFocusedState();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView this$0>
			//    2    4:invokevirtual   #22  <Method void SearchView.updateFocusedState()>
			//    3    7:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
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
	//   27   49:invokespecial   #174 <Method void SearchView$1(SearchView)>
	//   28   52:putfield        #176 <Field Runnable mUpdateDrawableStateRunnable>
	//   29   55:aload_0         
	//   30   56:new             #12  <Class SearchView$2>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #177 <Method void SearchView$2(SearchView)>
	//   34   64:putfield        #179 <Field Runnable mReleaseCursorRunnable>
		mOutsideDrawablesCache = new WeakHashMap();
	//   35   67:aload_0         
	//   36   68:new             #181 <Class WeakHashMap>
	//   37   71:dup             
	//   38   72:invokespecial   #182 <Method void WeakHashMap()>
	//   39   75:putfield        #184 <Field WeakHashMap mOutsideDrawablesCache>
		mOnClickListener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(view == mSearchButton)
			//*   0    0:aload_1         
			//*   1    1:aload_0         
			//*   2    2:getfield        #14  <Field SearchView this$0>
			//*   3    5:getfield        #24  <Field ImageView SearchView.mSearchButton>
			//*   4    8:if_acmpne       19
				{
					onSearchClicked();
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field SearchView this$0>
			//    7   15:invokevirtual   #27  <Method void SearchView.onSearchClicked()>
					return;
			//    8   18:return          
				}
				if(view == mCloseButton)
			//*   9   19:aload_1         
			//*  10   20:aload_0         
			//*  11   21:getfield        #14  <Field SearchView this$0>
			//*  12   24:getfield        #30  <Field ImageView SearchView.mCloseButton>
			//*  13   27:if_acmpne       38
				{
					onCloseClicked();
			//   14   30:aload_0         
			//   15   31:getfield        #14  <Field SearchView this$0>
			//   16   34:invokevirtual   #33  <Method void SearchView.onCloseClicked()>
					return;
			//   17   37:return          
				}
				if(view == mGoButton)
			//*  18   38:aload_1         
			//*  19   39:aload_0         
			//*  20   40:getfield        #14  <Field SearchView this$0>
			//*  21   43:getfield        #36  <Field ImageView SearchView.mGoButton>
			//*  22   46:if_acmpne       57
				{
					onSubmitQuery();
			//   23   49:aload_0         
			//   24   50:getfield        #14  <Field SearchView this$0>
			//   25   53:invokevirtual   #39  <Method void SearchView.onSubmitQuery()>
					return;
			//   26   56:return          
				}
				if(view == mVoiceButton)
			//*  27   57:aload_1         
			//*  28   58:aload_0         
			//*  29   59:getfield        #14  <Field SearchView this$0>
			//*  30   62:getfield        #42  <Field ImageView SearchView.mVoiceButton>
			//*  31   65:if_acmpne       76
				{
					onVoiceClicked();
			//   32   68:aload_0         
			//   33   69:getfield        #14  <Field SearchView this$0>
			//   34   72:invokevirtual   #45  <Method void SearchView.onVoiceClicked()>
					return;
			//   35   75:return          
				}
				if(view == mSearchSrcTextView)
			//*  36   76:aload_1         
			//*  37   77:aload_0         
			//*  38   78:getfield        #14  <Field SearchView this$0>
			//*  39   81:getfield        #49  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
			//*  40   84:if_acmpne       94
					forceSuggestionQuery();
			//   41   87:aload_0         
			//   42   88:getfield        #14  <Field SearchView this$0>
			//   43   91:invokevirtual   #52  <Method void SearchView.forceSuggestionQuery()>
			//   44   94:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   40   78:aload_0         
	//   41   79:new             #18  <Class SearchView$5>
	//   42   82:dup             
	//   43   83:aload_0         
	//   44   84:invokespecial   #185 <Method void SearchView$5(SearchView)>
	//   45   87:putfield        #187 <Field android.view.View$OnClickListener mOnClickListener>
	//   46   90:aload_0         
	//   47   91:new             #20  <Class SearchView$6>
	//   48   94:dup             
	//   49   95:aload_0         
	//   50   96:invokespecial   #188 <Method void SearchView$6(SearchView)>
	//   51   99:putfield        #190 <Field android.view.View$OnKeyListener mTextKeyListener>
		mOnEditorActionListener = new android.widget.TextView.OnEditorActionListener() {

			public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
			{
				onSubmitQuery();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView this$0>
			//    2    4:invokevirtual   #23  <Method void SearchView.onSubmitQuery()>
				return true;
			//    3    7:iconst_1        
			//    4    8:ireturn         
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   52  102:aload_0         
	//   53  103:new             #22  <Class SearchView$7>
	//   54  106:dup             
	//   55  107:aload_0         
	//   56  108:invokespecial   #191 <Method void SearchView$7(SearchView)>
	//   57  111:putfield        #193 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
		mOnItemClickListener = new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view, int j, long l)
			{
				onItemClicked(j, 0, ((String) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView this$0>
			//    2    4:iload_3         
			//    3    5:iconst_0        
			//    4    6:aconst_null     
			//    5    7:invokevirtual   #24  <Method boolean SearchView.onItemClicked(int, int, String)>
			//    6   10:pop             
			//    7   11:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   58  114:aload_0         
	//   59  115:new             #24  <Class SearchView$8>
	//   60  118:dup             
	//   61  119:aload_0         
	//   62  120:invokespecial   #194 <Method void SearchView$8(SearchView)>
	//   63  123:putfield        #196 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
		mOnItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view, int j, long l)
			{
				SearchView.this.onItemSelected(j);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SearchView this$0>
			//    2    4:iload_3         
			//    3    5:invokevirtual   #23  <Method boolean SearchView.onItemSelected(int)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void onNothingSelected(AdapterView adapterview)
			{
			//    0    0:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   64  126:aload_0         
	//   65  127:new             #26  <Class SearchView$9>
	//   66  130:dup             
	//   67  131:aload_0         
	//   68  132:invokespecial   #197 <Method void SearchView$9(SearchView)>
	//   69  135:putfield        #199 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//   70  138:aload_0         
	//   71  139:new             #10  <Class SearchView$10>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:invokespecial   #200 <Method void SearchView$10(SearchView)>
	//   75  147:putfield        #202 <Field TextWatcher mTextWatcher>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SearchView, i, 0)));
	//   76  150:aload_1         
	//   77  151:aload_2         
	//   78  152:getstatic       #206 <Field int[] android.support.v7.appcompat.R$styleable.SearchView>
	//   79  155:iload_3         
	//   80  156:iconst_0        
	//   81  157:invokestatic    #212 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   82  160:astore_2        
		LayoutInflater.from(context).inflate(((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_layout, android.support.v7.appcompat.R.layout.abc_search_view), ((android.view.ViewGroup) (this)), true);
	//   83  161:aload_1         
	//   84  162:invokestatic    #218 <Method LayoutInflater LayoutInflater.from(Context)>
	//   85  165:aload_2         
	//   86  166:getstatic       #221 <Field int android.support.v7.appcompat.R$styleable.SearchView_layout>
	//   87  169:getstatic       #226 <Field int android.support.v7.appcompat.R$layout.abc_search_view>
	//   88  172:invokevirtual   #230 <Method int TintTypedArray.getResourceId(int, int)>
	//   89  175:aload_0         
	//   90  176:iconst_1        
	//   91  177:invokevirtual   #234 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   92  180:pop             
		mSearchSrcTextView = (SearchAutoComplete)findViewById(android.support.v7.appcompat.R.id.search_src_text);
	//   93  181:aload_0         
	//   94  182:aload_0         
	//   95  183:getstatic       #239 <Field int android.support.v7.appcompat.R$id.search_src_text>
	//   96  186:invokevirtual   #243 <Method View findViewById(int)>
	//   97  189:checkcast       #45  <Class SearchView$SearchAutoComplete>
	//   98  192:putfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
		mSearchSrcTextView.setSearchView(this);
	//   99  195:aload_0         
	//  100  196:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  101  199:aload_0         
	//  102  200:invokevirtual   #248 <Method void SearchView$SearchAutoComplete.setSearchView(SearchView)>
		mSearchEditFrame = findViewById(android.support.v7.appcompat.R.id.search_edit_frame);
	//  103  203:aload_0         
	//  104  204:aload_0         
	//  105  205:getstatic       #251 <Field int android.support.v7.appcompat.R$id.search_edit_frame>
	//  106  208:invokevirtual   #243 <Method View findViewById(int)>
	//  107  211:putfield        #253 <Field View mSearchEditFrame>
		mSearchPlate = findViewById(android.support.v7.appcompat.R.id.search_plate);
	//  108  214:aload_0         
	//  109  215:aload_0         
	//  110  216:getstatic       #256 <Field int android.support.v7.appcompat.R$id.search_plate>
	//  111  219:invokevirtual   #243 <Method View findViewById(int)>
	//  112  222:putfield        #258 <Field View mSearchPlate>
		mSubmitArea = findViewById(android.support.v7.appcompat.R.id.submit_area);
	//  113  225:aload_0         
	//  114  226:aload_0         
	//  115  227:getstatic       #261 <Field int android.support.v7.appcompat.R$id.submit_area>
	//  116  230:invokevirtual   #243 <Method View findViewById(int)>
	//  117  233:putfield        #263 <Field View mSubmitArea>
		mSearchButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_button);
	//  118  236:aload_0         
	//  119  237:aload_0         
	//  120  238:getstatic       #266 <Field int android.support.v7.appcompat.R$id.search_button>
	//  121  241:invokevirtual   #243 <Method View findViewById(int)>
	//  122  244:checkcast       #268 <Class ImageView>
	//  123  247:putfield        #270 <Field ImageView mSearchButton>
		mGoButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_go_btn);
	//  124  250:aload_0         
	//  125  251:aload_0         
	//  126  252:getstatic       #273 <Field int android.support.v7.appcompat.R$id.search_go_btn>
	//  127  255:invokevirtual   #243 <Method View findViewById(int)>
	//  128  258:checkcast       #268 <Class ImageView>
	//  129  261:putfield        #275 <Field ImageView mGoButton>
		mCloseButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_close_btn);
	//  130  264:aload_0         
	//  131  265:aload_0         
	//  132  266:getstatic       #278 <Field int android.support.v7.appcompat.R$id.search_close_btn>
	//  133  269:invokevirtual   #243 <Method View findViewById(int)>
	//  134  272:checkcast       #268 <Class ImageView>
	//  135  275:putfield        #280 <Field ImageView mCloseButton>
		mVoiceButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_voice_btn);
	//  136  278:aload_0         
	//  137  279:aload_0         
	//  138  280:getstatic       #283 <Field int android.support.v7.appcompat.R$id.search_voice_btn>
	//  139  283:invokevirtual   #243 <Method View findViewById(int)>
	//  140  286:checkcast       #268 <Class ImageView>
	//  141  289:putfield        #285 <Field ImageView mVoiceButton>
		mCollapsedIcon = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_mag_icon);
	//  142  292:aload_0         
	//  143  293:aload_0         
	//  144  294:getstatic       #288 <Field int android.support.v7.appcompat.R$id.search_mag_icon>
	//  145  297:invokevirtual   #243 <Method View findViewById(int)>
	//  146  300:checkcast       #268 <Class ImageView>
	//  147  303:putfield        #290 <Field ImageView mCollapsedIcon>
		ViewCompat.setBackground(mSearchPlate, ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_queryBackground));
	//  148  306:aload_0         
	//  149  307:getfield        #258 <Field View mSearchPlate>
	//  150  310:aload_2         
	//  151  311:getstatic       #293 <Field int android.support.v7.appcompat.R$styleable.SearchView_queryBackground>
	//  152  314:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  153  317:invokestatic    #303 <Method void ViewCompat.setBackground(View, Drawable)>
		ViewCompat.setBackground(mSubmitArea, ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_submitBackground));
	//  154  320:aload_0         
	//  155  321:getfield        #263 <Field View mSubmitArea>
	//  156  324:aload_2         
	//  157  325:getstatic       #306 <Field int android.support.v7.appcompat.R$styleable.SearchView_submitBackground>
	//  158  328:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  159  331:invokestatic    #303 <Method void ViewCompat.setBackground(View, Drawable)>
		mSearchButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
	//  160  334:aload_0         
	//  161  335:getfield        #270 <Field ImageView mSearchButton>
	//  162  338:aload_2         
	//  163  339:getstatic       #309 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchIcon>
	//  164  342:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  165  345:invokevirtual   #313 <Method void ImageView.setImageDrawable(Drawable)>
		mGoButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_goIcon));
	//  166  348:aload_0         
	//  167  349:getfield        #275 <Field ImageView mGoButton>
	//  168  352:aload_2         
	//  169  353:getstatic       #316 <Field int android.support.v7.appcompat.R$styleable.SearchView_goIcon>
	//  170  356:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  171  359:invokevirtual   #313 <Method void ImageView.setImageDrawable(Drawable)>
		mCloseButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_closeIcon));
	//  172  362:aload_0         
	//  173  363:getfield        #280 <Field ImageView mCloseButton>
	//  174  366:aload_2         
	//  175  367:getstatic       #319 <Field int android.support.v7.appcompat.R$styleable.SearchView_closeIcon>
	//  176  370:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  177  373:invokevirtual   #313 <Method void ImageView.setImageDrawable(Drawable)>
		mVoiceButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_voiceIcon));
	//  178  376:aload_0         
	//  179  377:getfield        #285 <Field ImageView mVoiceButton>
	//  180  380:aload_2         
	//  181  381:getstatic       #322 <Field int android.support.v7.appcompat.R$styleable.SearchView_voiceIcon>
	//  182  384:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  183  387:invokevirtual   #313 <Method void ImageView.setImageDrawable(Drawable)>
		mCollapsedIcon.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
	//  184  390:aload_0         
	//  185  391:getfield        #290 <Field ImageView mCollapsedIcon>
	//  186  394:aload_2         
	//  187  395:getstatic       #309 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchIcon>
	//  188  398:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  189  401:invokevirtual   #313 <Method void ImageView.setImageDrawable(Drawable)>
		mSearchHintIcon = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchHintIcon);
	//  190  404:aload_0         
	//  191  405:aload_2         
	//  192  406:getstatic       #325 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchHintIcon>
	//  193  409:invokevirtual   #297 <Method Drawable TintTypedArray.getDrawable(int)>
	//  194  412:putfield        #327 <Field Drawable mSearchHintIcon>
		TooltipCompat.setTooltipText(((View) (mSearchButton)), ((CharSequence) (getResources().getString(android.support.v7.appcompat.R.string.abc_searchview_description_search))));
	//  195  415:aload_0         
	//  196  416:getfield        #270 <Field ImageView mSearchButton>
	//  197  419:aload_0         
	//  198  420:invokevirtual   #331 <Method Resources getResources()>
	//  199  423:getstatic       #336 <Field int android.support.v7.appcompat.R$string.abc_searchview_description_search>
	//  200  426:invokevirtual   #342 <Method String Resources.getString(int)>
	//  201  429:invokestatic    #348 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		mSuggestionRowLayout = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_suggestionRowLayout, android.support.v7.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
	//  202  432:aload_0         
	//  203  433:aload_2         
	//  204  434:getstatic       #351 <Field int android.support.v7.appcompat.R$styleable.SearchView_suggestionRowLayout>
	//  205  437:getstatic       #354 <Field int android.support.v7.appcompat.R$layout.abc_search_dropdown_item_icons_2line>
	//  206  440:invokevirtual   #230 <Method int TintTypedArray.getResourceId(int, int)>
	//  207  443:putfield        #356 <Field int mSuggestionRowLayout>
		mSuggestionCommitIconResId = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_commitIcon, 0);
	//  208  446:aload_0         
	//  209  447:aload_2         
	//  210  448:getstatic       #359 <Field int android.support.v7.appcompat.R$styleable.SearchView_commitIcon>
	//  211  451:iconst_0        
	//  212  452:invokevirtual   #230 <Method int TintTypedArray.getResourceId(int, int)>
	//  213  455:putfield        #361 <Field int mSuggestionCommitIconResId>
		mSearchButton.setOnClickListener(mOnClickListener);
	//  214  458:aload_0         
	//  215  459:getfield        #270 <Field ImageView mSearchButton>
	//  216  462:aload_0         
	//  217  463:getfield        #187 <Field android.view.View$OnClickListener mOnClickListener>
	//  218  466:invokevirtual   #365 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mCloseButton.setOnClickListener(mOnClickListener);
	//  219  469:aload_0         
	//  220  470:getfield        #280 <Field ImageView mCloseButton>
	//  221  473:aload_0         
	//  222  474:getfield        #187 <Field android.view.View$OnClickListener mOnClickListener>
	//  223  477:invokevirtual   #365 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mGoButton.setOnClickListener(mOnClickListener);
	//  224  480:aload_0         
	//  225  481:getfield        #275 <Field ImageView mGoButton>
	//  226  484:aload_0         
	//  227  485:getfield        #187 <Field android.view.View$OnClickListener mOnClickListener>
	//  228  488:invokevirtual   #365 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mVoiceButton.setOnClickListener(mOnClickListener);
	//  229  491:aload_0         
	//  230  492:getfield        #285 <Field ImageView mVoiceButton>
	//  231  495:aload_0         
	//  232  496:getfield        #187 <Field android.view.View$OnClickListener mOnClickListener>
	//  233  499:invokevirtual   #365 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mSearchSrcTextView.setOnClickListener(mOnClickListener);
	//  234  502:aload_0         
	//  235  503:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  236  506:aload_0         
	//  237  507:getfield        #187 <Field android.view.View$OnClickListener mOnClickListener>
	//  238  510:invokevirtual   #366 <Method void SearchView$SearchAutoComplete.setOnClickListener(android.view.View$OnClickListener)>
		mSearchSrcTextView.addTextChangedListener(mTextWatcher);
	//  239  513:aload_0         
	//  240  514:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  241  517:aload_0         
	//  242  518:getfield        #202 <Field TextWatcher mTextWatcher>
	//  243  521:invokevirtual   #370 <Method void SearchView$SearchAutoComplete.addTextChangedListener(TextWatcher)>
		mSearchSrcTextView.setOnEditorActionListener(mOnEditorActionListener);
	//  244  524:aload_0         
	//  245  525:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  246  528:aload_0         
	//  247  529:getfield        #193 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
	//  248  532:invokevirtual   #374 <Method void SearchView$SearchAutoComplete.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		mSearchSrcTextView.setOnItemClickListener(mOnItemClickListener);
	//  249  535:aload_0         
	//  250  536:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  251  539:aload_0         
	//  252  540:getfield        #196 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
	//  253  543:invokevirtual   #378 <Method void SearchView$SearchAutoComplete.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		mSearchSrcTextView.setOnItemSelectedListener(mOnItemSelectedListener);
	//  254  546:aload_0         
	//  255  547:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  256  550:aload_0         
	//  257  551:getfield        #199 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//  258  554:invokevirtual   #382 <Method void SearchView$SearchAutoComplete.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		mSearchSrcTextView.setOnKeyListener(mTextKeyListener);
	//  259  557:aload_0         
	//  260  558:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  261  561:aload_0         
	//  262  562:getfield        #190 <Field android.view.View$OnKeyListener mTextKeyListener>
	//  263  565:invokevirtual   #386 <Method void SearchView$SearchAutoComplete.setOnKeyListener(android.view.View$OnKeyListener)>
		mSearchSrcTextView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

			public void onFocusChange(View view, boolean flag)
			{
				if(mOnQueryTextFocusChangeListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field SearchView this$0>
			//*   2    4:getfield        #26  <Field android.view.View$OnFocusChangeListener SearchView.mOnQueryTextFocusChangeListener>
			//*   3    7:ifnull          27
					mOnQueryTextFocusChangeListener.onFocusChange(((View) (SearchView.this)), flag);
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field SearchView this$0>
			//    6   14:getfield        #26  <Field android.view.View$OnFocusChangeListener SearchView.mOnQueryTextFocusChangeListener>
			//    7   17:aload_0         
			//    8   18:getfield        #16  <Field SearchView this$0>
			//    9   21:iload_2         
			//   10   22:invokeinterface #28  <Method void android.view.View$OnFocusChangeListener.onFocusChange(View, boolean)>
			//   11   27:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  264  568:aload_0         
	//  265  569:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  266  572:new             #14  <Class SearchView$3>
	//  267  575:dup             
	//  268  576:aload_0         
	//  269  577:invokespecial   #387 <Method void SearchView$3(SearchView)>
	//  270  580:invokevirtual   #391 <Method void SearchView$SearchAutoComplete.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
		setIconifiedByDefault(((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
	//  271  583:aload_0         
	//  272  584:aload_2         
	//  273  585:getstatic       #394 <Field int android.support.v7.appcompat.R$styleable.SearchView_iconifiedByDefault>
	//  274  588:iconst_1        
	//  275  589:invokevirtual   #398 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  276  592:invokevirtual   #402 <Method void setIconifiedByDefault(boolean)>
		i = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SearchView_android_maxWidth, -1);
	//  277  595:aload_2         
	//  278  596:getstatic       #405 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_maxWidth>
	//  279  599:iconst_m1       
	//  280  600:invokevirtual   #408 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  281  603:istore_3        
		if(i != -1)
	//* 282  604:iload_3         
	//* 283  605:iconst_m1       
	//* 284  606:icmpeq          614
			setMaxWidth(i);
	//  285  609:aload_0         
	//  286  610:iload_3         
	//  287  611:invokevirtual   #412 <Method void setMaxWidth(int)>
		mDefaultQueryHint = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SearchView_defaultQueryHint);
	//  288  614:aload_0         
	//  289  615:aload_2         
	//  290  616:getstatic       #415 <Field int android.support.v7.appcompat.R$styleable.SearchView_defaultQueryHint>
	//  291  619:invokevirtual   #419 <Method CharSequence TintTypedArray.getText(int)>
	//  292  622:putfield        #421 <Field CharSequence mDefaultQueryHint>
		mQueryHint = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SearchView_queryHint);
	//  293  625:aload_0         
	//  294  626:aload_2         
	//  295  627:getstatic       #424 <Field int android.support.v7.appcompat.R$styleable.SearchView_queryHint>
	//  296  630:invokevirtual   #419 <Method CharSequence TintTypedArray.getText(int)>
	//  297  633:putfield        #426 <Field CharSequence mQueryHint>
		i = ((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SearchView_android_imeOptions, -1);
	//  298  636:aload_2         
	//  299  637:getstatic       #429 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_imeOptions>
	//  300  640:iconst_m1       
	//  301  641:invokevirtual   #432 <Method int TintTypedArray.getInt(int, int)>
	//  302  644:istore_3        
		if(i != -1)
	//* 303  645:iload_3         
	//* 304  646:iconst_m1       
	//* 305  647:icmpeq          655
			setImeOptions(i);
	//  306  650:aload_0         
	//  307  651:iload_3         
	//  308  652:invokevirtual   #435 <Method void setImeOptions(int)>
		i = ((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SearchView_android_inputType, -1);
	//  309  655:aload_2         
	//  310  656:getstatic       #438 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_inputType>
	//  311  659:iconst_m1       
	//  312  660:invokevirtual   #432 <Method int TintTypedArray.getInt(int, int)>
	//  313  663:istore_3        
		if(i != -1)
	//* 314  664:iload_3         
	//* 315  665:iconst_m1       
	//* 316  666:icmpeq          674
			setInputType(i);
	//  317  669:aload_0         
	//  318  670:iload_3         
	//  319  671:invokevirtual   #441 <Method void setInputType(int)>
		setFocusable(((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SearchView_android_focusable, true));
	//  320  674:aload_0         
	//  321  675:aload_2         
	//  322  676:getstatic       #444 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_focusable>
	//  323  679:iconst_1        
	//  324  680:invokevirtual   #398 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  325  683:invokevirtual   #447 <Method void setFocusable(boolean)>
		((TintTypedArray) (attributeset)).recycle();
	//  326  686:aload_2         
	//  327  687:invokevirtual   #450 <Method void TintTypedArray.recycle()>
		mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
	//  328  690:aload_0         
	//  329  691:new             #452 <Class Intent>
	//  330  694:dup             
	//  331  695:ldc2            #454 <String "android.speech.action.WEB_SEARCH">
	//  332  698:invokespecial   #457 <Method void Intent(String)>
	//  333  701:putfield        #459 <Field Intent mVoiceWebSearchIntent>
		mVoiceWebSearchIntent.addFlags(0x10000000);
	//  334  704:aload_0         
	//  335  705:getfield        #459 <Field Intent mVoiceWebSearchIntent>
	//  336  708:ldc2            #460 <Int 0x10000000>
	//  337  711:invokevirtual   #464 <Method Intent Intent.addFlags(int)>
	//  338  714:pop             
		mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
	//  339  715:aload_0         
	//  340  716:getfield        #459 <Field Intent mVoiceWebSearchIntent>
	//  341  719:ldc2            #466 <String "android.speech.extra.LANGUAGE_MODEL">
	//  342  722:ldc2            #468 <String "web_search">
	//  343  725:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//  344  728:pop             
		mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
	//  345  729:aload_0         
	//  346  730:new             #452 <Class Intent>
	//  347  733:dup             
	//  348  734:ldc2            #474 <String "android.speech.action.RECOGNIZE_SPEECH">
	//  349  737:invokespecial   #457 <Method void Intent(String)>
	//  350  740:putfield        #476 <Field Intent mVoiceAppSearchIntent>
		mVoiceAppSearchIntent.addFlags(0x10000000);
	//  351  743:aload_0         
	//  352  744:getfield        #476 <Field Intent mVoiceAppSearchIntent>
	//  353  747:ldc2            #460 <Int 0x10000000>
	//  354  750:invokevirtual   #464 <Method Intent Intent.addFlags(int)>
	//  355  753:pop             
		mDropDownAnchor = findViewById(mSearchSrcTextView.getDropDownAnchor());
	//  356  754:aload_0         
	//  357  755:aload_0         
	//  358  756:aload_0         
	//  359  757:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  360  760:invokevirtual   #480 <Method int SearchView$SearchAutoComplete.getDropDownAnchor()>
	//  361  763:invokevirtual   #243 <Method View findViewById(int)>
	//  362  766:putfield        #482 <Field View mDropDownAnchor>
		if(mDropDownAnchor != null)
	//* 363  769:aload_0         
	//* 364  770:getfield        #482 <Field View mDropDownAnchor>
	//* 365  773:ifnull          791
			mDropDownAnchor.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

				public void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
						int l1, int i2)
				{
					adjustDropDownSizeAndPosition();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field SearchView this$0>
				//    2    4:invokevirtual   #25  <Method void SearchView.adjustDropDownSizeAndPosition()>
				//    3    7:return          
				}

				final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  366  776:aload_0         
	//  367  777:getfield        #482 <Field View mDropDownAnchor>
	//  368  780:new             #16  <Class SearchView$4>
	//  369  783:dup             
	//  370  784:aload_0         
	//  371  785:invokespecial   #483 <Method void SearchView$4(SearchView)>
	//  372  788:invokevirtual   #489 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		updateViewsVisibility(mIconifiedByDefault);
	//  373  791:aload_0         
	//  374  792:aload_0         
	//  375  793:getfield        #491 <Field boolean mIconifiedByDefault>
	//  376  796:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
		updateQueryHint();
	//  377  799:aload_0         
	//  378  800:invokespecial   #497 <Method void updateQueryHint()>
	//  379  803:return          
	}

	private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
	{
		s = ((String) (new Intent(s)));
	//    0    0:new             #452 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #457 <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s)).addFlags(0x10000000);
	//    5    9:aload_1         
	//    6   10:ldc2            #460 <Int 0x10000000>
	//    7   13:invokevirtual   #464 <Method Intent Intent.addFlags(int)>
	//    8   16:pop             
		if(uri != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			((Intent) (s)).setData(uri);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #503 <Method Intent Intent.setData(Uri)>
	//   14   26:pop             
		((Intent) (s)).putExtra("user_query", mUserQuery);
	//   15   27:aload_1         
	//   16   28:ldc2            #505 <String "user_query">
	//   17   31:aload_0         
	//   18   32:getfield        #507 <Field CharSequence mUserQuery>
	//   19   35:invokevirtual   #510 <Method Intent Intent.putExtra(String, CharSequence)>
	//   20   38:pop             
		if(s2 != null)
	//*  21   39:aload           4
	//*  22   41:ifnull          54
			((Intent) (s)).putExtra("query", s2);
	//   23   44:aload_1         
	//   24   45:ldc2            #512 <String "query">
	//   25   48:aload           4
	//   26   50:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   27   53:pop             
		if(s1 != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          67
			((Intent) (s)).putExtra("intent_extra_data_key", s1);
	//   30   58:aload_1         
	//   31   59:ldc2            #514 <String "intent_extra_data_key">
	//   32   62:aload_3         
	//   33   63:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   34   66:pop             
		if(mAppSearchData != null)
	//*  35   67:aload_0         
	//*  36   68:getfield        #516 <Field Bundle mAppSearchData>
	//*  37   71:ifnull          86
			((Intent) (s)).putExtra("app_data", mAppSearchData);
	//   38   74:aload_1         
	//   39   75:ldc2            #518 <String "app_data">
	//   40   78:aload_0         
	//   41   79:getfield        #516 <Field Bundle mAppSearchData>
	//   42   82:invokevirtual   #521 <Method Intent Intent.putExtra(String, Bundle)>
	//   43   85:pop             
		if(i != 0)
	//*  44   86:iload           5
	//*  45   88:ifeq            111
		{
			((Intent) (s)).putExtra("action_key", i);
	//   46   91:aload_1         
	//   47   92:ldc2            #523 <String "action_key">
	//   48   95:iload           5
	//   49   97:invokevirtual   #526 <Method Intent Intent.putExtra(String, int)>
	//   50  100:pop             
			((Intent) (s)).putExtra("action_msg", s3);
	//   51  101:aload_1         
	//   52  102:ldc2            #528 <String "action_msg">
	//   53  105:aload           6
	//   54  107:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   55  110:pop             
		}
		((Intent) (s)).setComponent(mSearchable.getSearchActivity());
	//   56  111:aload_1         
	//   57  112:aload_0         
	//   58  113:getfield        #530 <Field SearchableInfo mSearchable>
	//   59  116:invokevirtual   #536 <Method ComponentName SearchableInfo.getSearchActivity()>
	//   60  119:invokevirtual   #540 <Method Intent Intent.setComponent(ComponentName)>
	//   61  122:pop             
		return ((Intent) (s));
	//   62  123:aload_1         
	//   63  124:areturn         
	}

	private Intent createIntentFromSuggestion(Cursor cursor, int i, String s)
	{
		Object obj;
		Object obj1;
		Object obj2;
		String s1;
		try
		{
			obj1 = ((Object) (SuggestionsAdapter.getColumnString(cursor, "suggest_intent_action")));
	//    0    0:aload_1         
	//    1    1:ldc2            #546 <String "suggest_intent_action">
	//    2    4:invokestatic    #552 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//    3    7:astore          5
		}
	//*   4    9:aload           5
	//*   5   11:astore          4
	//*   6   13:aload           5
	//*   7   15:ifnonnull       229
	//*   8   18:aload_0         
	//*   9   19:getfield        #530 <Field SearchableInfo mSearchable>
	//*  10   22:invokevirtual   #556 <Method String SearchableInfo.getSuggestIntentAction()>
	//*  11   25:astore          4
	//*  12   27:goto            229
	//*  13   30:aload_1         
	//*  14   31:ldc2            #558 <String "suggest_intent_data">
	//*  15   34:invokestatic    #552 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  16   37:astore          6
	//*  17   39:aload           6
	//*  18   41:astore          4
	//*  19   43:aload           6
	//*  20   45:ifnonnull       57
	//*  21   48:aload_0         
	//*  22   49:getfield        #530 <Field SearchableInfo mSearchable>
	//*  23   52:invokevirtual   #561 <Method String SearchableInfo.getSuggestIntentData()>
	//*  24   55:astore          4
	//*  25   57:aload           4
	//*  26   59:astore          6
	//*  27   61:aload           4
	//*  28   63:ifnull          246
	//*  29   66:aload_1         
	//*  30   67:ldc2            #563 <String "suggest_intent_data_id">
	//*  31   70:invokestatic    #552 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  32   73:astore          7
	//*  33   75:aload           4
	//*  34   77:astore          6
	//*  35   79:aload           7
	//*  36   81:ifnull          246
	//*  37   84:new             #565 <Class StringBuilder>
	//*  38   87:dup             
	//*  39   88:invokespecial   #566 <Method void StringBuilder()>
	//*  40   91:astore          6
	//*  41   93:aload           6
	//*  42   95:aload           4
	//*  43   97:invokevirtual   #570 <Method StringBuilder StringBuilder.append(String)>
	//*  44  100:pop             
	//*  45  101:aload           6
	//*  46  103:ldc2            #572 <String "/">
	//*  47  106:invokevirtual   #570 <Method StringBuilder StringBuilder.append(String)>
	//*  48  109:pop             
	//*  49  110:aload           6
	//*  50  112:aload           7
	//*  51  114:invokestatic    #578 <Method String Uri.encode(String)>
	//*  52  117:invokevirtual   #570 <Method StringBuilder StringBuilder.append(String)>
	//*  53  120:pop             
	//*  54  121:aload           6
	//*  55  123:invokevirtual   #581 <Method String StringBuilder.toString()>
	//*  56  126:astore          6
	//*  57  128:goto            246
	//*  58  131:aload           6
	//*  59  133:invokestatic    #585 <Method Uri Uri.parse(String)>
	//*  60  136:astore          4
	//*  61  138:aload_1         
	//*  62  139:ldc2            #587 <String "suggest_intent_query">
	//*  63  142:invokestatic    #552 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  64  145:astore          6
	//*  65  147:aload_0         
	//*  66  148:aload           5
	//*  67  150:aload           4
	//*  68  152:aload_1         
	//*  69  153:ldc2            #589 <String "suggest_intent_extra_data">
	//*  70  156:invokestatic    #552 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  71  159:aload           6
	//*  72  161:iload_2         
	//*  73  162:aload_3         
	//*  74  163:invokespecial   #591 <Method Intent createIntent(String, Uri, String, String, int, String)>
	//*  75  166:astore_3        
	//*  76  167:aload_3         
	//*  77  168:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  78  169:astore_3        
		{
			try
			{
				i = cursor.getPosition();
	//   79  170:aload_1         
	//   80  171:invokeinterface #596 <Method int Cursor.getPosition()>
	//   81  176:istore_2        
			}
	//*  82  177:goto            182
	//*  83  180:iconst_m1       
	//*  84  181:istore_2        
	//*  85  182:new             #565 <Class StringBuilder>
	//*  86  185:dup             
	//*  87  186:invokespecial   #566 <Method void StringBuilder()>
	//*  88  189:astore_1        
	//*  89  190:aload_1         
	//*  90  191:ldc2            #598 <String "Search suggestions cursor at row ">
	//*  91  194:invokevirtual   #570 <Method StringBuilder StringBuilder.append(String)>
	//*  92  197:pop             
	//*  93  198:aload_1         
	//*  94  199:iload_2         
	//*  95  200:invokevirtual   #601 <Method StringBuilder StringBuilder.append(int)>
	//*  96  203:pop             
	//*  97  204:aload_1         
	//*  98  205:ldc2            #603 <String " returned exception.">
	//*  99  208:invokevirtual   #570 <Method StringBuilder StringBuilder.append(String)>
	//* 100  211:pop             
	//* 101  212:ldc1            #63  <String "SearchView">
	//* 102  214:aload_1         
	//* 103  215:invokevirtual   #581 <Method String StringBuilder.toString()>
	//* 104  218:aload_3         
	//* 105  219:invokestatic    #609 <Method int Log.w(String, String, Throwable)>
	//* 106  222:pop             
	//* 107  223:aconst_null     
	//* 108  224:areturn         
			// Misplaced declaration of an exception variable
			catch(Cursor cursor)
			{
				i = -1;
			}
			cursor = ((Cursor) (new StringBuilder()));
			((StringBuilder) (cursor)).append("Search suggestions cursor at row ");
			((StringBuilder) (cursor)).append(i);
			((StringBuilder) (cursor)).append(" returned exception.");
			Log.w("SearchView", ((StringBuilder) (cursor)).toString(), ((Throwable) (s)));
			return null;
		}
		obj = obj1;
		if(obj1 != null) goto _L2; else goto _L1
_L1:
		obj = ((Object) (mSearchable.getSuggestIntentAction()));
		  goto _L2
_L6:
		obj2 = ((Object) (SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data")));
		obj = obj2;
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_57;
		obj = ((Object) (mSearchable.getSuggestIntentData()));
		obj2 = obj;
		if(obj == null) goto _L4; else goto _L3
_L3:
		s1 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data_id");
		obj2 = obj;
		if(s1 == null) goto _L4; else goto _L5
_L5:
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append(((String) (obj)));
		((StringBuilder) (obj2)).append("/");
		((StringBuilder) (obj2)).append(Uri.encode(s1));
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
		  goto _L4
_L8:
		obj = ((Object) (Uri.parse(((String) (obj2)))));
_L9:
		obj2 = ((Object) (SuggestionsAdapter.getColumnString(cursor, "suggest_intent_query")));
		s = ((String) (createIntent(((String) (obj1)), ((Uri) (obj)), SuggestionsAdapter.getColumnString(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i, s)));
		return ((Intent) (s));
	//* 109  225:astore_1        
	//* 110  226:goto            180
_L2:
		obj1 = obj;
	//  111  229:aload           4
	//  112  231:astore          5
		if(obj == null)
	//* 113  233:aload           4
	//* 114  235:ifnonnull       30
			obj1 = "android.intent.action.SEARCH";
	//  115  238:ldc2            #611 <String "android.intent.action.SEARCH">
	//  116  241:astore          5
		  goto _L6
	//* 117  243:goto            30
_L4:
		if(obj2 != null) goto _L8; else goto _L7
	//  118  246:aload           6
	//  119  248:ifnonnull       131
_L7:
		obj = null;
	//  120  251:aconst_null     
	//  121  252:astore          4
		  goto _L9
	//* 122  254:goto            138
	}

	private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
	{
		ComponentName componentname = searchableinfo.getSearchActivity();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #536 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    2    4:astore          10
		Object obj = ((Object) (new Intent("android.intent.action.SEARCH")));
	//    3    6:new             #452 <Class Intent>
	//    4    9:dup             
	//    5   10:ldc2            #611 <String "android.intent.action.SEARCH">
	//    6   13:invokespecial   #457 <Method void Intent(String)>
	//    7   16:astore          5
		((Intent) (obj)).setComponent(componentname);
	//    8   18:aload           5
	//    9   20:aload           10
	//   10   22:invokevirtual   #540 <Method Intent Intent.setComponent(ComponentName)>
	//   11   25:pop             
		PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #617 <Method Context getContext()>
	//   14   30:iconst_0        
	//   15   31:aload           5
	//   16   33:ldc2            #618 <Int 0x40000000>
	//   17   36:invokestatic    #624 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   18   39:astore          8
		Bundle bundle = new Bundle();
	//   19   41:new             #626 <Class Bundle>
	//   20   44:dup             
	//   21   45:invokespecial   #627 <Method void Bundle()>
	//   22   48:astore          9
		if(mAppSearchData != null)
	//*  23   50:aload_0         
	//*  24   51:getfield        #516 <Field Bundle mAppSearchData>
	//*  25   54:ifnull          69
			bundle.putParcelable("app_data", ((Parcelable) (mAppSearchData)));
	//   26   57:aload           9
	//   27   59:ldc2            #518 <String "app_data">
	//   28   62:aload_0         
	//   29   63:getfield        #516 <Field Bundle mAppSearchData>
	//   30   66:invokevirtual   #631 <Method void Bundle.putParcelable(String, Parcelable)>
		Intent intent1 = new Intent(intent);
	//   31   69:new             #452 <Class Intent>
	//   32   72:dup             
	//   33   73:aload_1         
	//   34   74:invokespecial   #634 <Method void Intent(Intent)>
	//   35   77:astore          11
		intent = "free_form";
	//   36   79:ldc2            #636 <String "free_form">
	//   37   82:astore_1        
		int i = 1;
	//   38   83:iconst_1        
	//   39   84:istore_3        
		Object obj1 = ((Object) (getResources()));
	//   40   85:aload_0         
	//   41   86:invokevirtual   #331 <Method Resources getResources()>
	//   42   89:astore          6
		if(searchableinfo.getVoiceLanguageModeId() != 0)
	//*  43   91:aload_2         
	//*  44   92:invokevirtual   #639 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//*  45   95:ifeq            108
			intent = ((Intent) (((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageModeId())));
	//   46   98:aload           6
	//   47  100:aload_2         
	//   48  101:invokevirtual   #639 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//   49  104:invokevirtual   #342 <Method String Resources.getString(int)>
	//   50  107:astore_1        
		int j = searchableinfo.getVoicePromptTextId();
	//   51  108:aload_2         
	//   52  109:invokevirtual   #642 <Method int SearchableInfo.getVoicePromptTextId()>
	//   53  112:istore          4
		Object obj2 = null;
	//   54  114:aconst_null     
	//   55  115:astore          7
		if(j != 0)
	//*  56  117:iload           4
	//*  57  119:ifeq            136
			obj = ((Object) (((Resources) (obj1)).getString(searchableinfo.getVoicePromptTextId())));
	//   58  122:aload           6
	//   59  124:aload_2         
	//   60  125:invokevirtual   #642 <Method int SearchableInfo.getVoicePromptTextId()>
	//   61  128:invokevirtual   #342 <Method String Resources.getString(int)>
	//   62  131:astore          5
		else
	//*  63  133:goto            139
			obj = null;
	//   64  136:aconst_null     
	//   65  137:astore          5
		if(searchableinfo.getVoiceLanguageId() != 0)
	//*  66  139:aload_2         
	//*  67  140:invokevirtual   #645 <Method int SearchableInfo.getVoiceLanguageId()>
	//*  68  143:ifeq            160
			obj1 = ((Object) (((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageId())));
	//   69  146:aload           6
	//   70  148:aload_2         
	//   71  149:invokevirtual   #645 <Method int SearchableInfo.getVoiceLanguageId()>
	//   72  152:invokevirtual   #342 <Method String Resources.getString(int)>
	//   73  155:astore          6
		else
	//*  74  157:goto            163
			obj1 = null;
	//   75  160:aconst_null     
	//   76  161:astore          6
		if(searchableinfo.getVoiceMaxResults() != 0)
	//*  77  163:aload_2         
	//*  78  164:invokevirtual   #648 <Method int SearchableInfo.getVoiceMaxResults()>
	//*  79  167:ifeq            175
			i = searchableinfo.getVoiceMaxResults();
	//   80  170:aload_2         
	//   81  171:invokevirtual   #648 <Method int SearchableInfo.getVoiceMaxResults()>
	//   82  174:istore_3        
		intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", ((String) (intent)));
	//   83  175:aload           11
	//   84  177:ldc2            #466 <String "android.speech.extra.LANGUAGE_MODEL">
	//   85  180:aload_1         
	//   86  181:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   87  184:pop             
		intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
	//   88  185:aload           11
	//   89  187:ldc2            #650 <String "android.speech.extra.PROMPT">
	//   90  190:aload           5
	//   91  192:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   92  195:pop             
		intent1.putExtra("android.speech.extra.LANGUAGE", ((String) (obj1)));
	//   93  196:aload           11
	//   94  198:ldc2            #652 <String "android.speech.extra.LANGUAGE">
	//   95  201:aload           6
	//   96  203:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   97  206:pop             
		intent1.putExtra("android.speech.extra.MAX_RESULTS", i);
	//   98  207:aload           11
	//   99  209:ldc2            #654 <String "android.speech.extra.MAX_RESULTS">
	//  100  212:iload_3         
	//  101  213:invokevirtual   #526 <Method Intent Intent.putExtra(String, int)>
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
	//  109  230:invokevirtual   #659 <Method String ComponentName.flattenToShortString()>
	//  110  233:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//  111  234:aload           11
	//  112  236:ldc2            #661 <String "calling_package">
	//  113  239:aload_1         
	//  114  240:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//  115  243:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", ((Parcelable) (pendingintent)));
	//  116  244:aload           11
	//  117  246:ldc2            #663 <String "android.speech.extra.RESULTS_PENDINGINTENT">
	//  118  249:aload           8
	//  119  251:invokevirtual   #666 <Method Intent Intent.putExtra(String, Parcelable)>
	//  120  254:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
	//  121  255:aload           11
	//  122  257:ldc2            #668 <String "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE">
	//  123  260:aload           9
	//  124  262:invokevirtual   #521 <Method Intent Intent.putExtra(String, Bundle)>
	//  125  265:pop             
		return intent1;
	//  126  266:aload           11
	//  127  268:areturn         
	}

	private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
	{
		Intent intent1 = new Intent(intent);
	//    0    0:new             #452 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #634 <Method void Intent(Intent)>
	//    4    8:astore_3        
		intent = ((Intent) (searchableinfo.getSearchActivity()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #536 <Method ComponentName SearchableInfo.getSearchActivity()>
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
	//   14   24:invokevirtual   #659 <Method String ComponentName.flattenToShortString()>
	//   15   27:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//   16   28:aload_3         
	//   17   29:ldc2            #661 <String "calling_package">
	//   18   32:aload_1         
	//   19   33:invokevirtual   #472 <Method Intent Intent.putExtra(String, String)>
	//   20   36:pop             
		return intent1;
	//   21   37:aload_3         
	//   22   38:areturn         
	}

	private void dismissSuggestions()
	{
		mSearchSrcTextView.dismissDropDown();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #673 <Method void SearchView$SearchAutoComplete.dismissDropDown()>
	//    3    7:return          
	}

	private void getChildBoundsWithinSearchView(View view, Rect rect)
	{
		view.getLocationInWindow(mTemp);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #169 <Field int[] mTemp>
	//    3    5:invokevirtual   #679 <Method void View.getLocationInWindow(int[])>
		getLocationInWindow(mTemp2);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #171 <Field int[] mTemp2>
	//    7   13:invokevirtual   #680 <Method void getLocationInWindow(int[])>
		int i = mTemp[1] - mTemp2[1];
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field int[] mTemp>
	//   10   20:iconst_1        
	//   11   21:iaload          
	//   12   22:aload_0         
	//   13   23:getfield        #171 <Field int[] mTemp2>
	//   14   26:iconst_1        
	//   15   27:iaload          
	//   16   28:isub            
	//   17   29:istore_3        
		int j = mTemp[0] - mTemp2[0];
	//   18   30:aload_0         
	//   19   31:getfield        #169 <Field int[] mTemp>
	//   20   34:iconst_0        
	//   21   35:iaload          
	//   22   36:aload_0         
	//   23   37:getfield        #171 <Field int[] mTemp2>
	//   24   40:iconst_0        
	//   25   41:iaload          
	//   26   42:isub            
	//   27   43:istore          4
		rect.set(j, i, view.getWidth() + j, view.getHeight() + i);
	//   28   45:aload_2         
	//   29   46:iload           4
	//   30   48:iload_3         
	//   31   49:aload_1         
	//   32   50:invokevirtual   #683 <Method int View.getWidth()>
	//   33   53:iload           4
	//   34   55:iadd            
	//   35   56:aload_1         
	//   36   57:invokevirtual   #686 <Method int View.getHeight()>
	//   37   60:iload_3         
	//   38   61:iadd            
	//   39   62:invokevirtual   #690 <Method void Rect.set(int, int, int, int)>
	//   40   65:return          
	}

	private CharSequence getDecoratedHint(CharSequence charsequence)
	{
		if(mIconifiedByDefault)
	//*   0    0:aload_0         
	//*   1    1:getfield        #491 <Field boolean mIconifiedByDefault>
	//*   2    4:ifeq            79
		{
			if(mSearchHintIcon == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #327 <Field Drawable mSearchHintIcon>
	//*   5   11:ifnonnull       16
			{
				return charsequence;
	//    6   14:aload_1         
	//    7   15:areturn         
			} else
			{
				int i = (int)((double)mSearchSrcTextView.getTextSize() * 1.25D);
	//    8   16:aload_0         
	//    9   17:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:invokevirtual   #696 <Method float SearchView$SearchAutoComplete.getTextSize()>
	//   11   23:f2d             
	//   12   24:ldc2w           #697 <Double 1.25D>
	//   13   27:dmul            
	//   14   28:d2i             
	//   15   29:istore_2        
				mSearchHintIcon.setBounds(0, 0, i, i);
	//   16   30:aload_0         
	//   17   31:getfield        #327 <Field Drawable mSearchHintIcon>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:iload_2         
	//   21   37:iload_2         
	//   22   38:invokevirtual   #703 <Method void Drawable.setBounds(int, int, int, int)>
				SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
	//   23   41:new             #705 <Class SpannableStringBuilder>
	//   24   44:dup             
	//   25   45:ldc2            #707 <String "   ">
	//   26   48:invokespecial   #710 <Method void SpannableStringBuilder(CharSequence)>
	//   27   51:astore_3        
				spannablestringbuilder.setSpan(((Object) (new ImageSpan(mSearchHintIcon))), 1, 2, 33);
	//   28   52:aload_3         
	//   29   53:new             #712 <Class ImageSpan>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:getfield        #327 <Field Drawable mSearchHintIcon>
	//   33   61:invokespecial   #714 <Method void ImageSpan(Drawable)>
	//   34   64:iconst_1        
	//   35   65:iconst_2        
	//   36   66:bipush          33
	//   37   68:invokevirtual   #718 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				spannablestringbuilder.append(charsequence);
	//   38   71:aload_3         
	//   39   72:aload_1         
	//   40   73:invokevirtual   #721 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
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

	private int getPreferredHeight()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_height);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #617 <Method Context getContext()>
	//    2    4:invokevirtual   #725 <Method Resources Context.getResources()>
	//    3    7:getstatic       #730 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_height>
	//    4   10:invokevirtual   #733 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private int getPreferredWidth()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_width);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #617 <Method Context getContext()>
	//    2    4:invokevirtual   #725 <Method Resources Context.getResources()>
	//    3    7:getstatic       #737 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_width>
	//    4   10:invokevirtual   #733 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private boolean hasVoiceSearch()
	{
		SearchableInfo searchableinfo = mSearchable;
	//    0    0:aload_0         
	//    1    1:getfield        #530 <Field SearchableInfo mSearchable>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(searchableinfo != null && mSearchable.getVoiceSearchEnabled())
	//*   5    7:aload_2         
	//*   6    8:ifnull          81
	//*   7   11:aload_0         
	//*   8   12:getfield        #530 <Field SearchableInfo mSearchable>
	//*   9   15:invokevirtual   #742 <Method boolean SearchableInfo.getVoiceSearchEnabled()>
	//*  10   18:ifeq            81
		{
			Intent intent = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
			if(mSearchable.getVoiceSearchLaunchWebSearch())
	//*  13   23:aload_0         
	//*  14   24:getfield        #530 <Field SearchableInfo mSearchable>
	//*  15   27:invokevirtual   #745 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*  16   30:ifeq            41
				intent = mVoiceWebSearchIntent;
	//   17   33:aload_0         
	//   18   34:getfield        #459 <Field Intent mVoiceWebSearchIntent>
	//   19   37:astore_2        
			else
	//*  20   38:goto            56
			if(mSearchable.getVoiceSearchLaunchRecognizer())
	//*  21   41:aload_0         
	//*  22   42:getfield        #530 <Field SearchableInfo mSearchable>
	//*  23   45:invokevirtual   #748 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  24   48:ifeq            56
				intent = mVoiceAppSearchIntent;
	//   25   51:aload_0         
	//   26   52:getfield        #476 <Field Intent mVoiceAppSearchIntent>
	//   27   55:astore_2        
			if(intent != null)
	//*  28   56:aload_2         
	//*  29   57:ifnull          81
			{
				if(getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
	//*  30   60:aload_0         
	//*  31   61:invokevirtual   #617 <Method Context getContext()>
	//*  32   64:invokevirtual   #752 <Method PackageManager Context.getPackageManager()>
	//*  33   67:aload_2         
	//*  34   68:ldc2            #753 <Int 0x10000>
	//*  35   71:invokevirtual   #759 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*  36   74:ifnull          79
					flag = true;
	//   37   77:iconst_1        
	//   38   78:istore_1        
				return flag;
	//   39   79:iload_1         
	//   40   80:ireturn         
			}
		}
		return false;
	//   41   81:iconst_0        
	//   42   82:ireturn         
	}

	static boolean isLandscapeMode(Context context)
	{
		return context.getResources().getConfiguration().orientation == 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #725 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #765 <Method Configuration Resources.getConfiguration()>
	//    3    7:getfield        #770 <Field int Configuration.orientation>
	//    4   10:iconst_2        
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private boolean isSubmitAreaEnabled()
	{
		return (mSubmitButtonEnabled || mVoiceButtonEnabled) && !isIconified();
	//    0    0:aload_0         
	//    1    1:getfield        #773 <Field boolean mSubmitButtonEnabled>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #775 <Field boolean mVoiceButtonEnabled>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:invokevirtual   #778 <Method boolean isIconified()>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void launchIntent(Intent intent)
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
	//    4    6:invokevirtual   #617 <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #782 <Method void Context.startActivity(Intent)>
			return;
	//    7   13:return          
		}
		catch(RuntimeException runtimeexception)
	//*   8   14:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #565 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #566 <Method void StringBuilder()>
	//   12   22:astore_3        
			stringbuilder.append("Failed launch activity: ");
	//   13   23:aload_3         
	//   14   24:ldc2            #784 <String "Failed launch activity: ">
	//   15   27:invokevirtual   #570 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			stringbuilder.append(((Object) (intent)));
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #787 <Method StringBuilder StringBuilder.append(Object)>
	//   20   36:pop             
			Log.e("SearchView", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   21   37:ldc1            #63  <String "SearchView">
	//   22   39:aload_3         
	//   23   40:invokevirtual   #581 <Method String StringBuilder.toString()>
	//   24   43:aload_2         
	//   25   44:invokestatic    #790 <Method int Log.e(String, String, Throwable)>
	//   26   47:pop             
			return;
	//   27   48:return          
		}
	}

	private boolean launchSuggestion(int i, int j, String s)
	{
		Cursor cursor = mSuggestionsAdapter.getCursor();
	//    0    0:aload_0         
	//    1    1:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//    2    4:invokevirtual   #800 <Method Cursor CursorAdapter.getCursor()>
	//    3    7:astore          4
		if(cursor != null && cursor.moveToPosition(i))
	//*   4    9:aload           4
	//*   5   11:ifnull          39
	//*   6   14:aload           4
	//*   7   16:iload_1         
	//*   8   17:invokeinterface #804 <Method boolean Cursor.moveToPosition(int)>
	//*   9   22:ifeq            39
		{
			launchIntent(createIntentFromSuggestion(cursor, j, s));
	//   10   25:aload_0         
	//   11   26:aload_0         
	//   12   27:aload           4
	//   13   29:iload_2         
	//   14   30:aload_3         
	//   15   31:invokespecial   #806 <Method Intent createIntentFromSuggestion(Cursor, int, String)>
	//   16   34:invokespecial   #808 <Method void launchIntent(Intent)>
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

	private void postUpdateFocusedState()
	{
		post(mUpdateDrawableStateRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #176 <Field Runnable mUpdateDrawableStateRunnable>
	//    3    5:invokevirtual   #813 <Method boolean post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void rewriteQueryFromSuggestion(int i)
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_2        
		Object obj = ((Object) (mSuggestionsAdapter.getCursor()));
	//    4    8:aload_0         
	//    5    9:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//    6   12:invokevirtual   #800 <Method Cursor CursorAdapter.getCursor()>
	//    7   15:astore_3        
		if(obj == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(((Cursor) (obj)).moveToPosition(i))
	//*  11   21:aload_3         
	//*  12   22:iload_1         
	//*  13   23:invokeinterface #804 <Method boolean Cursor.moveToPosition(int)>
	//*  14   28:ifeq            56
		{
			obj = ((Object) (mSuggestionsAdapter.convertToString(((Cursor) (obj)))));
	//   15   31:aload_0         
	//   16   32:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #821 <Method CharSequence CursorAdapter.convertToString(Cursor)>
	//   19   39:astore_3        
			if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          50
			{
				setQuery(((CharSequence) (obj)));
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:invokespecial   #824 <Method void setQuery(CharSequence)>
				return;
	//   25   49:return          
			} else
			{
				setQuery(((CharSequence) (editable)));
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:invokespecial   #824 <Method void setQuery(CharSequence)>
				return;
	//   29   55:return          
			}
		} else
		{
			setQuery(((CharSequence) (editable)));
	//   30   56:aload_0         
	//   31   57:aload_2         
	//   32   58:invokespecial   #824 <Method void setQuery(CharSequence)>
			return;
	//   33   61:return          
		}
	}

	private void setQuery(CharSequence charsequence)
	{
		mSearchSrcTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #827 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    4    8:aload_0         
	//    5    9:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    6   12:astore_3        
		int i;
		if(TextUtils.isEmpty(charsequence))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #833 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifeq            25
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		else
	//*  12   22:goto            32
			i = charsequence.length();
	//   13   25:aload_1         
	//   14   26:invokeinterface #838 <Method int CharSequence.length()>
	//   15   31:istore_2        
		searchautocomplete.setSelection(i);
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #841 <Method void SearchView$SearchAutoComplete.setSelection(int)>
	//   19   37:return          
	}

	private void updateCloseButton()
	{
		boolean flag4 = TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText())));
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:invokestatic    #833 <Method boolean TextUtils.isEmpty(CharSequence)>
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
			if(mIconifiedByDefault && !mExpandedInActionView)
	//*  17   29:aload_0         
	//*  18   30:getfield        #491 <Field boolean mIconifiedByDefault>
	//*  19   33:ifeq            48
	//*  20   36:aload_0         
	//*  21   37:getfield        #844 <Field boolean mExpandedInActionView>
	//*  22   40:ifne            48
				flag = flag2;
	//   23   43:iload_3         
	//   24   44:istore_1        
			else
	//*  25   45:goto            50
				flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_1        
		ImageView imageview = mCloseButton;
	//   28   50:aload_0         
	//   29   51:getfield        #280 <Field ImageView mCloseButton>
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
	//   40   71:invokevirtual   #847 <Method void ImageView.setVisibility(int)>
		Drawable drawable = mCloseButton.getDrawable();
	//   41   74:aload_0         
	//   42   75:getfield        #280 <Field ImageView mCloseButton>
	//   43   78:invokevirtual   #850 <Method Drawable ImageView.getDrawable()>
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
	//   49   93:getstatic       #853 <Field int[] ENABLED_STATE_SET>
	//   50   96:astore          6
			else
	//*  51   98:goto            106
				ai = EMPTY_STATE_SET;
	//   52  101:getstatic       #856 <Field int[] EMPTY_STATE_SET>
	//   53  104:astore          6
			drawable.setState(ai);
	//   54  106:aload           7
	//   55  108:aload           6
	//   56  110:invokevirtual   #860 <Method boolean Drawable.setState(int[])>
	//   57  113:pop             
		}
	//   58  114:return          
	}

	private void updateQueryHint()
	{
		CharSequence charsequence = getQueryHint();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #864 <Method CharSequence getQueryHint()>
	//    2    4:astore_2        
		SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:astore_3        
		Object obj = ((Object) (charsequence));
	//    6   10:aload_2         
	//    7   11:astore_1        
		if(charsequence == null)
	//*   8   12:aload_2         
	//*   9   13:ifnonnull       20
			obj = "";
	//   10   16:ldc2            #866 <String "">
	//   11   19:astore_1        
		searchautocomplete.setHint(getDecoratedHint(((CharSequence) (obj))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokespecial   #868 <Method CharSequence getDecoratedHint(CharSequence)>
	//   16   26:invokevirtual   #871 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
	//   17   29:return          
	}

	private void updateSearchAutoComplete()
	{
		mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_0         
	//    3    5:getfield        #530 <Field SearchableInfo mSearchable>
	//    4    8:invokevirtual   #875 <Method int SearchableInfo.getSuggestThreshold()>
	//    5   11:invokevirtual   #878 <Method void SearchView$SearchAutoComplete.setThreshold(int)>
		mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
	//    6   14:aload_0         
	//    7   15:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    8   18:aload_0         
	//    9   19:getfield        #530 <Field SearchableInfo mSearchable>
	//   10   22:invokevirtual   #881 <Method int SearchableInfo.getImeOptions()>
	//   11   25:invokevirtual   #882 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		int j = mSearchable.getInputType();
	//   12   28:aload_0         
	//   13   29:getfield        #530 <Field SearchableInfo mSearchable>
	//   14   32:invokevirtual   #885 <Method int SearchableInfo.getInputType()>
	//   15   35:istore_3        
		boolean flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_2        
		int i = j;
	//   18   38:iload_3         
	//   19   39:istore_1        
		if((j & 0xf) == 1)
	//*  20   40:iload_3         
	//*  21   41:bipush          15
	//*  22   43:iand            
	//*  23   44:iconst_1        
	//*  24   45:icmpne          76
		{
			j &= 0xfffeffff;
	//   25   48:iload_3         
	//   26   49:ldc2            #886 <Int 0xfffeffff>
	//   27   52:iand            
	//   28   53:istore_3        
			i = j;
	//   29   54:iload_3         
	//   30   55:istore_1        
			if(mSearchable.getSuggestAuthority() != null)
	//*  31   56:aload_0         
	//*  32   57:getfield        #530 <Field SearchableInfo mSearchable>
	//*  33   60:invokevirtual   #889 <Method String SearchableInfo.getSuggestAuthority()>
	//*  34   63:ifnull          76
				i = j | 0x10000 | 0x80000;
	//   35   66:iload_3         
	//   36   67:ldc2            #753 <Int 0x10000>
	//   37   70:ior             
	//   38   71:ldc2            #890 <Int 0x80000>
	//   39   74:ior             
	//   40   75:istore_1        
		}
		mSearchSrcTextView.setInputType(i);
	//   41   76:aload_0         
	//   42   77:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   43   80:iload_1         
	//   44   81:invokevirtual   #891 <Method void SearchView$SearchAutoComplete.setInputType(int)>
		if(mSuggestionsAdapter != null)
	//*  45   84:aload_0         
	//*  46   85:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//*  47   88:ifnull          99
			mSuggestionsAdapter.changeCursor(((Cursor) (null)));
	//   48   91:aload_0         
	//   49   92:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//   50   95:aconst_null     
	//   51   96:invokevirtual   #895 <Method void CursorAdapter.changeCursor(Cursor)>
		if(mSearchable.getSuggestAuthority() != null)
	//*  52   99:aload_0         
	//*  53  100:getfield        #530 <Field SearchableInfo mSearchable>
	//*  54  103:invokevirtual   #889 <Method String SearchableInfo.getSuggestAuthority()>
	//*  55  106:ifnull          170
		{
			mSuggestionsAdapter = ((CursorAdapter) (new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache)));
	//   56  109:aload_0         
	//   57  110:new             #548 <Class SuggestionsAdapter>
	//   58  113:dup             
	//   59  114:aload_0         
	//   60  115:invokevirtual   #617 <Method Context getContext()>
	//   61  118:aload_0         
	//   62  119:aload_0         
	//   63  120:getfield        #530 <Field SearchableInfo mSearchable>
	//   64  123:aload_0         
	//   65  124:getfield        #184 <Field WeakHashMap mOutsideDrawablesCache>
	//   66  127:invokespecial   #898 <Method void SuggestionsAdapter(Context, SearchView, SearchableInfo, WeakHashMap)>
	//   67  130:putfield        #794 <Field CursorAdapter mSuggestionsAdapter>
			mSearchSrcTextView.setAdapter(((android.widget.ListAdapter) (mSuggestionsAdapter)));
	//   68  133:aload_0         
	//   69  134:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   70  137:aload_0         
	//   71  138:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//   72  141:invokevirtual   #902 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
			SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
	//   73  144:aload_0         
	//   74  145:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//   75  148:checkcast       #548 <Class SuggestionsAdapter>
	//   76  151:astore          4
			byte byte0 = ((byte) (flag));
	//   77  153:iload_2         
	//   78  154:istore_1        
			if(mQueryRefinement)
	//*  79  155:aload_0         
	//*  80  156:getfield        #904 <Field boolean mQueryRefinement>
	//*  81  159:ifeq            164
				byte0 = 2;
	//   82  162:iconst_2        
	//   83  163:istore_1        
			suggestionsadapter.setQueryRefinement(((int) (byte0)));
	//   84  164:aload           4
	//   85  166:iload_1         
	//   86  167:invokevirtual   #907 <Method void SuggestionsAdapter.setQueryRefinement(int)>
		}
	//   87  170:return          
	}

	private void updateSubmitArea()
	{
		byte byte0;
		if(isSubmitAreaEnabled() && (mGoButton.getVisibility() == 0 || mVoiceButton.getVisibility() == 0))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #910 <Method boolean isSubmitAreaEnabled()>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #275 <Field ImageView mGoButton>
	//*   5   11:invokevirtual   #913 <Method int ImageView.getVisibility()>
	//*   6   14:ifeq            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #285 <Field ImageView mVoiceButton>
	//*   9   21:invokevirtual   #913 <Method int ImageView.getVisibility()>
	//*  10   24:ifne            32
			byte0 = 0;
	//   11   27:iconst_0        
	//   12   28:istore_1        
		else
	//*  13   29:goto            35
			byte0 = 8;
	//   14   32:bipush          8
	//   15   34:istore_1        
		mSubmitArea.setVisibility(((int) (byte0)));
	//   16   35:aload_0         
	//   17   36:getfield        #263 <Field View mSubmitArea>
	//   18   39:iload_1         
	//   19   40:invokevirtual   #914 <Method void View.setVisibility(int)>
	//   20   43:return          
	}

	private void updateSubmitButton(boolean flag)
	{
		byte byte0;
		if(mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (flag || !mVoiceButtonEnabled))
	//*   0    0:aload_0         
	//*   1    1:getfield        #773 <Field boolean mSubmitButtonEnabled>
	//*   2    4:ifeq            37
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #910 <Method boolean isSubmitAreaEnabled()>
	//*   5   11:ifeq            37
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #918 <Method boolean hasFocus()>
	//*   8   18:ifeq            37
	//*   9   21:iload_1         
	//*  10   22:ifne            32
	//*  11   25:aload_0         
	//*  12   26:getfield        #775 <Field boolean mVoiceButtonEnabled>
	//*  13   29:ifne            37
			byte0 = 0;
	//   14   32:iconst_0        
	//   15   33:istore_2        
		else
	//*  16   34:goto            40
			byte0 = 8;
	//   17   37:bipush          8
	//   18   39:istore_2        
		mGoButton.setVisibility(((int) (byte0)));
	//   19   40:aload_0         
	//   20   41:getfield        #275 <Field ImageView mGoButton>
	//   21   44:iload_2         
	//   22   45:invokevirtual   #847 <Method void ImageView.setVisibility(int)>
	//   23   48:return          
	}

	private void updateViewsVisibility(boolean flag)
	{
		mIconified = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #920 <Field boolean mIconified>
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
		boolean flag2 = TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText()))) ^ true;
	//   14   23:aload_0         
	//   15   24:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   16   27:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//   17   30:invokestatic    #833 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   18   33:iconst_1        
	//   19   34:ixor            
	//   20   35:istore          5
		mSearchButton.setVisibility(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:getfield        #270 <Field ImageView mSearchButton>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #847 <Method void ImageView.setVisibility(int)>
		updateSubmitButton(flag2);
	//   25   45:aload_0         
	//   26   46:iload           5
	//   27   48:invokespecial   #922 <Method void updateSubmitButton(boolean)>
		View view = mSearchEditFrame;
	//   28   51:aload_0         
	//   29   52:getfield        #253 <Field View mSearchEditFrame>
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
	//   40   72:invokevirtual   #914 <Method void View.setVisibility(int)>
		byte0 = byte1;
	//   41   75:iload_3         
	//   42   76:istore_2        
		if(mCollapsedIcon.getDrawable() != null)
	//*  43   77:aload_0         
	//*  44   78:getfield        #290 <Field ImageView mCollapsedIcon>
	//*  45   81:invokevirtual   #850 <Method Drawable ImageView.getDrawable()>
	//*  46   84:ifnull          101
			if(mIconifiedByDefault)
	//*  47   87:aload_0         
	//*  48   88:getfield        #491 <Field boolean mIconifiedByDefault>
	//*  49   91:ifeq            99
				byte0 = byte1;
	//   50   94:iload_3         
	//   51   95:istore_2        
			else
	//*  52   96:goto            101
				byte0 = 0;
	//   53   99:iconst_0        
	//   54  100:istore_2        
		mCollapsedIcon.setVisibility(((int) (byte0)));
	//   55  101:aload_0         
	//   56  102:getfield        #290 <Field ImageView mCollapsedIcon>
	//   57  105:iload_2         
	//   58  106:invokevirtual   #847 <Method void ImageView.setVisibility(int)>
		updateCloseButton();
	//   59  109:aload_0         
	//   60  110:invokespecial   #924 <Method void updateCloseButton()>
		flag = flag1;
	//   61  113:iload           4
	//   62  115:istore_1        
		if(!flag2)
	//*  63  116:iload           5
	//*  64  118:ifne            123
			flag = true;
	//   65  121:iconst_1        
	//   66  122:istore_1        
		updateVoiceButton(flag);
	//   67  123:aload_0         
	//   68  124:iload_1         
	//   69  125:invokespecial   #927 <Method void updateVoiceButton(boolean)>
		updateSubmitArea();
	//   70  128:aload_0         
	//   71  129:invokespecial   #929 <Method void updateSubmitArea()>
	//   72  132:return          
	}

	private void updateVoiceButton(boolean flag)
	{
		byte byte0;
		if(mVoiceButtonEnabled && !isIconified() && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #775 <Field boolean mVoiceButtonEnabled>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #778 <Method boolean isIconified()>
	//*   5   11:ifne            32
	//*   6   14:iload_1         
	//*   7   15:ifeq            32
		{
			byte0 = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
			mGoButton.setVisibility(8);
	//   10   20:aload_0         
	//   11   21:getfield        #275 <Field ImageView mGoButton>
	//   12   24:bipush          8
	//   13   26:invokevirtual   #847 <Method void ImageView.setVisibility(int)>
		} else
	//*  14   29:goto            35
		{
			byte0 = 8;
	//   15   32:bipush          8
	//   16   34:istore_2        
		}
		mVoiceButton.setVisibility(((int) (byte0)));
	//   17   35:aload_0         
	//   18   36:getfield        #285 <Field ImageView mVoiceButton>
	//   19   39:iload_2         
	//   20   40:invokevirtual   #847 <Method void ImageView.setVisibility(int)>
	//   21   43:return          
	}

	void adjustDropDownSizeAndPosition()
	{
		if(mDropDownAnchor.getWidth() > 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #482 <Field View mDropDownAnchor>
	//*   2    4:invokevirtual   #683 <Method int View.getWidth()>
	//*   3    7:iconst_1        
	//*   4    8:icmple          159
		{
			Resources resources = getContext().getResources();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #617 <Method Context getContext()>
	//    7   15:invokevirtual   #725 <Method Resources Context.getResources()>
	//    8   18:astore          7
			int k = mSearchPlate.getPaddingLeft();
	//    9   20:aload_0         
	//   10   21:getfield        #258 <Field View mSearchPlate>
	//   11   24:invokevirtual   #933 <Method int View.getPaddingLeft()>
	//   12   27:istore_3        
			Rect rect = new Rect();
	//   13   28:new             #162 <Class Rect>
	//   14   31:dup             
	//   15   32:invokespecial   #163 <Method void Rect()>
	//   16   35:astore          8
			boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   17   37:aload_0         
	//   18   38:invokestatic    #939 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   19   41:istore          6
			int i;
			if(mIconifiedByDefault)
	//*  20   43:aload_0         
	//*  21   44:getfield        #491 <Field boolean mIconifiedByDefault>
	//*  22   47:ifeq            71
				i = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_text_padding_left);
	//   23   50:aload           7
	//   24   52:getstatic       #942 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_icon_width>
	//   25   55:invokevirtual   #733 <Method int Resources.getDimensionPixelSize(int)>
	//   26   58:aload           7
	//   27   60:getstatic       #945 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_text_padding_left>
	//   28   63:invokevirtual   #733 <Method int Resources.getDimensionPixelSize(int)>
	//   29   66:iadd            
	//   30   67:istore_1        
			else
	//*  31   68:goto            73
				i = 0;
	//   32   71:iconst_0        
	//   33   72:istore_1        
			mSearchSrcTextView.getDropDownBackground().getPadding(rect);
	//   34   73:aload_0         
	//   35   74:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   36   77:invokevirtual   #948 <Method Drawable SearchView$SearchAutoComplete.getDropDownBackground()>
	//   37   80:aload           8
	//   38   82:invokevirtual   #952 <Method boolean Drawable.getPadding(Rect)>
	//   39   85:pop             
			int j;
			if(flag)
	//*  40   86:iload           6
	//*  41   88:ifeq            101
				j = -rect.left;
	//   42   91:aload           8
	//   43   93:getfield        #955 <Field int Rect.left>
	//   44   96:ineg            
	//   45   97:istore_2        
			else
	//*  46   98:goto            111
				j = k - (rect.left + i);
	//   47  101:iload_3         
	//   48  102:aload           8
	//   49  104:getfield        #955 <Field int Rect.left>
	//   50  107:iload_1         
	//   51  108:iadd            
	//   52  109:isub            
	//   53  110:istore_2        
			mSearchSrcTextView.setDropDownHorizontalOffset(j);
	//   54  111:aload_0         
	//   55  112:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   56  115:iload_2         
	//   57  116:invokevirtual   #958 <Method void SearchView$SearchAutoComplete.setDropDownHorizontalOffset(int)>
			j = mDropDownAnchor.getWidth();
	//   58  119:aload_0         
	//   59  120:getfield        #482 <Field View mDropDownAnchor>
	//   60  123:invokevirtual   #683 <Method int View.getWidth()>
	//   61  126:istore_2        
			int l = rect.left;
	//   62  127:aload           8
	//   63  129:getfield        #955 <Field int Rect.left>
	//   64  132:istore          4
			int i1 = rect.right;
	//   65  134:aload           8
	//   66  136:getfield        #961 <Field int Rect.right>
	//   67  139:istore          5
			mSearchSrcTextView.setDropDownWidth((j + l + i1 + i) - k);
	//   68  141:aload_0         
	//   69  142:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   70  145:iload_2         
	//   71  146:iload           4
	//   72  148:iadd            
	//   73  149:iload           5
	//   74  151:iadd            
	//   75  152:iload_1         
	//   76  153:iadd            
	//   77  154:iload_3         
	//   78  155:isub            
	//   79  156:invokevirtual   #964 <Method void SearchView$SearchAutoComplete.setDropDownWidth(int)>
		}
	//   80  159:return          
	}

	public void clearFocus()
	{
		mClearingFocus = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #967 <Field boolean mClearingFocus>
		super.clearFocus();
	//    3    5:aload_0         
	//    4    6:invokespecial   #969 <Method void LinearLayoutCompat.clearFocus()>
		mSearchSrcTextView.clearFocus();
	//    5    9:aload_0         
	//    6   10:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    7   13:invokevirtual   #970 <Method void SearchView$SearchAutoComplete.clearFocus()>
		mSearchSrcTextView.setImeVisibility(false);
	//    8   16:aload_0         
	//    9   17:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:iconst_0        
	//   11   21:invokestatic    #974 <Method void SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete, boolean)>
		mClearingFocus = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #967 <Field boolean mClearingFocus>
	//   15   29:return          
	}

	void forceSuggestionQuery()
	{
		HIDDEN_METHOD_INVOKER.doBeforeTextChanged(((AutoCompleteTextView) (mSearchSrcTextView)));
	//    0    0:getstatic       #146 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//    1    3:aload_0         
	//    2    4:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    3    7:invokevirtual   #979 <Method void SearchView$AutoCompleteTextViewReflector.doBeforeTextChanged(AutoCompleteTextView)>
		HIDDEN_METHOD_INVOKER.doAfterTextChanged(((AutoCompleteTextView) (mSearchSrcTextView)));
	//    4   10:getstatic       #146 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//    5   13:aload_0         
	//    6   14:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    7   17:invokevirtual   #982 <Method void SearchView$AutoCompleteTextViewReflector.doAfterTextChanged(AutoCompleteTextView)>
	//    8   20:return          
	}

	public int getImeOptions()
	{
		return mSearchSrcTextView.getImeOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #983 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//    3    7:ireturn         
	}

	public int getInputType()
	{
		return mSearchSrcTextView.getInputType();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #984 <Method int SearchView$SearchAutoComplete.getInputType()>
	//    3    7:ireturn         
	}

	public int getMaxWidth()
	{
		return mMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #987 <Field int mMaxWidth>
	//    2    4:ireturn         
	}

	public CharSequence getQuery()
	{
		return ((CharSequence) (mSearchSrcTextView.getText()));
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:areturn         
	}

	public CharSequence getQueryHint()
	{
		if(mQueryHint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #426 <Field CharSequence mQueryHint>
	//*   2    4:ifnull          12
			return mQueryHint;
	//    3    7:aload_0         
	//    4    8:getfield        #426 <Field CharSequence mQueryHint>
	//    5   11:areturn         
		if(mSearchable != null && mSearchable.getHintId() != 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #530 <Field SearchableInfo mSearchable>
	//*   8   16:ifnull          44
	//*   9   19:aload_0         
	//*  10   20:getfield        #530 <Field SearchableInfo mSearchable>
	//*  11   23:invokevirtual   #992 <Method int SearchableInfo.getHintId()>
	//*  12   26:ifeq            44
			return getContext().getText(mSearchable.getHintId());
	//   13   29:aload_0         
	//   14   30:invokevirtual   #617 <Method Context getContext()>
	//   15   33:aload_0         
	//   16   34:getfield        #530 <Field SearchableInfo mSearchable>
	//   17   37:invokevirtual   #992 <Method int SearchableInfo.getHintId()>
	//   18   40:invokevirtual   #993 <Method CharSequence Context.getText(int)>
	//   19   43:areturn         
		else
			return mDefaultQueryHint;
	//   20   44:aload_0         
	//   21   45:getfield        #421 <Field CharSequence mDefaultQueryHint>
	//   22   48:areturn         
	}

	int getSuggestionCommitIconResId()
	{
		return mSuggestionCommitIconResId;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field int mSuggestionCommitIconResId>
	//    2    4:ireturn         
	}

	int getSuggestionRowLayout()
	{
		return mSuggestionRowLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field int mSuggestionRowLayout>
	//    2    4:ireturn         
	}

	public CursorAdapter getSuggestionsAdapter()
	{
		return mSuggestionsAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//    2    4:areturn         
	}

	public boolean isIconfiedByDefault()
	{
		return mIconifiedByDefault;
	//    0    0:aload_0         
	//    1    1:getfield        #491 <Field boolean mIconifiedByDefault>
	//    2    4:ireturn         
	}

	public boolean isIconified()
	{
		return mIconified;
	//    0    0:aload_0         
	//    1    1:getfield        #920 <Field boolean mIconified>
	//    2    4:ireturn         
	}

	public boolean isQueryRefinementEnabled()
	{
		return mQueryRefinement;
	//    0    0:aload_0         
	//    1    1:getfield        #904 <Field boolean mQueryRefinement>
	//    2    4:ireturn         
	}

	public boolean isSubmitButtonEnabled()
	{
		return mSubmitButtonEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #773 <Field boolean mSubmitButtonEnabled>
	//    2    4:ireturn         
	}

	void launchQuerySearch(int i, String s, String s1)
	{
		s = ((String) (createIntent("android.intent.action.SEARCH", ((Uri) (null)), ((String) (null)), s1, i, s)));
	//    0    0:aload_0         
	//    1    1:ldc2            #611 <String "android.intent.action.SEARCH">
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_3         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #591 <Method Intent createIntent(String, Uri, String, String, int, String)>
	//    8   12:astore_2        
		getContext().startActivity(((Intent) (s)));
	//    9   13:aload_0         
	//   10   14:invokevirtual   #617 <Method Context getContext()>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #782 <Method void Context.startActivity(Intent)>
	//   13   21:return          
	}

	public void onActionViewCollapsed()
	{
		setQuery("", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #866 <String "">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1007 <Method void setQuery(CharSequence, boolean)>
		clearFocus();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1008 <Method void clearFocus()>
		updateViewsVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
		mSearchSrcTextView.setImeOptions(mCollapsedImeOptions);
	//    9   17:aload_0         
	//   10   18:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   11   21:aload_0         
	//   12   22:getfield        #1010 <Field int mCollapsedImeOptions>
	//   13   25:invokevirtual   #882 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		mExpandedInActionView = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #844 <Field boolean mExpandedInActionView>
	//   17   33:return          
	}

	public void onActionViewExpanded()
	{
		if(mExpandedInActionView)
	//*   0    0:aload_0         
	//*   1    1:getfield        #844 <Field boolean mExpandedInActionView>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mExpandedInActionView = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #844 <Field boolean mExpandedInActionView>
			mCollapsedImeOptions = mSearchSrcTextView.getImeOptions();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   18:invokevirtual   #983 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//   11   21:putfield        #1010 <Field int mCollapsedImeOptions>
			mSearchSrcTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
	//   12   24:aload_0         
	//   13   25:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   14   28:aload_0         
	//   15   29:getfield        #1010 <Field int mCollapsedImeOptions>
	//   16   32:ldc2            #1012 <Int 0x2000000>
	//   17   35:ior             
	//   18   36:invokevirtual   #882 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
			mSearchSrcTextView.setText("");
	//   19   39:aload_0         
	//   20   40:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   21   43:ldc2            #866 <String "">
	//   22   46:invokevirtual   #827 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			setIconified(false);
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #1015 <Method void setIconified(boolean)>
			return;
	//   26   54:return          
		}
	}

	void onCloseClicked()
	{
		if(TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//*   3    7:invokestatic    #833 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            49
		{
			if(mIconifiedByDefault && (mOnCloseListener == null || !mOnCloseListener.onClose()))
	//*   5   13:aload_0         
	//*   6   14:getfield        #491 <Field boolean mIconifiedByDefault>
	//*   7   17:ifeq            75
	//*   8   20:aload_0         
	//*   9   21:getfield        #1018 <Field SearchView$OnCloseListener mOnCloseListener>
	//*  10   24:ifnull          39
	//*  11   27:aload_0         
	//*  12   28:getfield        #1018 <Field SearchView$OnCloseListener mOnCloseListener>
	//*  13   31:invokeinterface #1021 <Method boolean SearchView$OnCloseListener.onClose()>
	//*  14   36:ifne            75
			{
				clearFocus();
	//   15   39:aload_0         
	//   16   40:invokevirtual   #1008 <Method void clearFocus()>
				updateViewsVisibility(true);
	//   17   43:aload_0         
	//   18   44:iconst_1        
	//   19   45:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
				return;
	//   20   48:return          
			}
		} else
		{
			mSearchSrcTextView.setText("");
	//   21   49:aload_0         
	//   22   50:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   23   53:ldc2            #866 <String "">
	//   24   56:invokevirtual   #827 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			mSearchSrcTextView.requestFocus();
	//   25   59:aload_0         
	//   26   60:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   27   63:invokevirtual   #1024 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//   28   66:pop             
			mSearchSrcTextView.setImeVisibility(true);
	//   29   67:aload_0         
	//   30   68:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   31   71:iconst_1        
	//   32   72:invokestatic    #974 <Method void SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete, boolean)>
		}
	//   33   75:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mUpdateDrawableStateRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #176 <Field Runnable mUpdateDrawableStateRunnable>
	//    3    5:invokevirtual   #1028 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(mReleaseCursorRunnable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #179 <Field Runnable mReleaseCursorRunnable>
	//    8   14:invokevirtual   #813 <Method boolean post(Runnable)>
	//    9   17:pop             
		super.onDetachedFromWindow();
	//   10   18:aload_0         
	//   11   19:invokespecial   #1030 <Method void LinearLayoutCompat.onDetachedFromWindow()>
	//   12   22:return          
	}

	boolean onItemClicked(int i, int j, String s)
	{
		if(mOnSuggestionListener != null && mOnSuggestionListener.onSuggestionClick(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #1033 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #1033 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #1036 <Method boolean SearchView$OnSuggestionListener.onSuggestionClick(int)>
	//*   7   17:ifne            23
	//*   8   20:goto            25
		{
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
		} else
		{
			launchSuggestion(i, 0, ((String) (null)));
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:iconst_0        
	//   14   28:aconst_null     
	//   15   29:invokespecial   #1038 <Method boolean launchSuggestion(int, int, String)>
	//   16   32:pop             
			mSearchSrcTextView.setImeVisibility(false);
	//   17   33:aload_0         
	//   18   34:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   19   37:iconst_0        
	//   20   38:invokestatic    #974 <Method void SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete, boolean)>
			dismissSuggestions();
	//   21   41:aload_0         
	//   22   42:invokespecial   #1040 <Method void dismissSuggestions()>
			return true;
	//   23   45:iconst_1        
	//   24   46:ireturn         
		}
	}

	boolean onItemSelected(int i)
	{
		if(mOnSuggestionListener != null && mOnSuggestionListener.onSuggestionSelect(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #1033 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #1033 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #1044 <Method boolean SearchView$OnSuggestionListener.onSuggestionSelect(int)>
	//*   7   17:ifne            23
	//*   8   20:goto            25
		{
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
		} else
		{
			rewriteQueryFromSuggestion(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #1046 <Method void rewriteQueryFromSuggestion(int)>
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #1050 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		if(flag)
	//*   7   11:iload_1         
	//*   8   12:ifeq            107
		{
			getChildBoundsWithinSearchView(((View) (mSearchSrcTextView)), mSearchSrcTextViewBounds);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   12   20:aload_0         
	//   13   21:getfield        #165 <Field Rect mSearchSrcTextViewBounds>
	//   14   24:invokespecial   #1052 <Method void getChildBoundsWithinSearchView(View, Rect)>
			mSearchSrtTextViewBoundsExpanded.set(mSearchSrcTextViewBounds.left, 0, mSearchSrcTextViewBounds.right, l - j);
	//   15   27:aload_0         
	//   16   28:getfield        #167 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   17   31:aload_0         
	//   18   32:getfield        #165 <Field Rect mSearchSrcTextViewBounds>
	//   19   35:getfield        #955 <Field int Rect.left>
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #165 <Field Rect mSearchSrcTextViewBounds>
	//   23   43:getfield        #961 <Field int Rect.right>
	//   24   46:iload           5
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:invokevirtual   #690 <Method void Rect.set(int, int, int, int)>
			if(mTouchDelegate == null)
	//*  28   53:aload_0         
	//*  29   54:getfield        #1054 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//*  30   57:ifnonnull       92
			{
				mTouchDelegate = new UpdatableTouchDelegate(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds, ((View) (mSearchSrcTextView)));
	//   31   60:aload_0         
	//   32   61:new             #50  <Class SearchView$UpdatableTouchDelegate>
	//   33   64:dup             
	//   34   65:aload_0         
	//   35   66:getfield        #167 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   36   69:aload_0         
	//   37   70:getfield        #165 <Field Rect mSearchSrcTextViewBounds>
	//   38   73:aload_0         
	//   39   74:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   40   77:invokespecial   #1057 <Method void SearchView$UpdatableTouchDelegate(Rect, Rect, View)>
	//   41   80:putfield        #1054 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
				setTouchDelegate(((TouchDelegate) (mTouchDelegate)));
	//   42   83:aload_0         
	//   43   84:aload_0         
	//   44   85:getfield        #1054 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//   45   88:invokevirtual   #1061 <Method void setTouchDelegate(TouchDelegate)>
				return;
	//   46   91:return          
			}
			mTouchDelegate.setBounds(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds);
	//   47   92:aload_0         
	//   48   93:getfield        #1054 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//   49   96:aload_0         
	//   50   97:getfield        #167 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   51  100:aload_0         
	//   52  101:getfield        #165 <Field Rect mSearchSrcTextViewBounds>
	//   53  104:invokevirtual   #1064 <Method void SearchView$UpdatableTouchDelegate.setBounds(Rect, Rect)>
		}
	//   54  107:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(isIconified())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #778 <Method boolean isIconified()>
	//*   2    4:ifeq            14
		{
			super.onMeasure(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1068 <Method void LinearLayoutCompat.onMeasure(int, int)>
			return;
	//    7   13:return          
		}
		int l = android.view.View.MeasureSpec.getMode(i);
	//    8   14:iload_1         
	//    9   15:invokestatic    #1073 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   18:istore          4
		int k = android.view.View.MeasureSpec.getSize(i);
	//   11   20:iload_1         
	//   12   21:invokestatic    #1076 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   24:istore_3        
		if(l != 0x80000000)
	//*  14   25:iload           4
	//*  15   27:ldc2            #1077 <Int 0x80000000>
	//*  16   30:icmpeq          95
		{
			if(l != 0)
	//*  17   33:iload           4
	//*  18   35:ifeq            72
			{
				if(l != 0x40000000)
	//*  19   38:iload           4
	//*  20   40:ldc2            #618 <Int 0x40000000>
	//*  21   43:icmpeq          51
				{
					i = k;
	//   22   46:iload_3         
	//   23   47:istore_1        
				} else
	//*  24   48:goto            123
				{
					i = k;
	//   25   51:iload_3         
	//   26   52:istore_1        
					if(mMaxWidth > 0)
	//*  27   53:aload_0         
	//*  28   54:getfield        #987 <Field int mMaxWidth>
	//*  29   57:ifle            123
						i = Math.min(mMaxWidth, k);
	//   30   60:aload_0         
	//   31   61:getfield        #987 <Field int mMaxWidth>
	//   32   64:iload_3         
	//   33   65:invokestatic    #1082 <Method int Math.min(int, int)>
	//   34   68:istore_1        
				}
			} else
	//*  35   69:goto            123
			if(mMaxWidth > 0)
	//*  36   72:aload_0         
	//*  37   73:getfield        #987 <Field int mMaxWidth>
	//*  38   76:ifle            87
				i = mMaxWidth;
	//   39   79:aload_0         
	//   40   80:getfield        #987 <Field int mMaxWidth>
	//   41   83:istore_1        
			else
	//*  42   84:goto            123
				i = getPreferredWidth();
	//   43   87:aload_0         
	//   44   88:invokespecial   #1084 <Method int getPreferredWidth()>
	//   45   91:istore_1        
		} else
	//*  46   92:goto            123
		if(mMaxWidth > 0)
	//*  47   95:aload_0         
	//*  48   96:getfield        #987 <Field int mMaxWidth>
	//*  49   99:ifle            114
			i = Math.min(mMaxWidth, k);
	//   50  102:aload_0         
	//   51  103:getfield        #987 <Field int mMaxWidth>
	//   52  106:iload_3         
	//   53  107:invokestatic    #1082 <Method int Math.min(int, int)>
	//   54  110:istore_1        
		else
	//*  55  111:goto            123
			i = Math.min(getPreferredWidth(), k);
	//   56  114:aload_0         
	//   57  115:invokespecial   #1084 <Method int getPreferredWidth()>
	//   58  118:iload_3         
	//   59  119:invokestatic    #1082 <Method int Math.min(int, int)>
	//   60  122:istore_1        
		k = android.view.View.MeasureSpec.getMode(j);
	//   61  123:iload_2         
	//   62  124:invokestatic    #1073 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   63  127:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//   64  128:iload_2         
	//   65  129:invokestatic    #1076 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   66  132:istore_2        
		if(k != 0x80000000)
	//*  67  133:iload_3         
	//*  68  134:ldc2            #1077 <Int 0x80000000>
	//*  69  137:icmpeq          155
		{
			if(k == 0)
	//*  70  140:iload_3         
	//*  71  141:ifeq            147
	//*  72  144:goto            164
				j = getPreferredHeight();
	//   73  147:aload_0         
	//   74  148:invokespecial   #1086 <Method int getPreferredHeight()>
	//   75  151:istore_2        
		} else
	//*  76  152:goto            164
		{
			j = Math.min(getPreferredHeight(), j);
	//   77  155:aload_0         
	//   78  156:invokespecial   #1086 <Method int getPreferredHeight()>
	//   79  159:iload_2         
	//   80  160:invokestatic    #1082 <Method int Math.min(int, int)>
	//   81  163:istore_2        
		}
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
	//   82  164:aload_0         
	//   83  165:iload_1         
	//   84  166:ldc2            #618 <Int 0x40000000>
	//   85  169:invokestatic    #1089 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   86  172:iload_2         
	//   87  173:ldc2            #618 <Int 0x40000000>
	//   88  176:invokestatic    #1089 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   89  179:invokespecial   #1068 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   90  182:return          
	}

	void onQueryRefine(CharSequence charsequence)
	{
		setQuery(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #824 <Method void setQuery(CharSequence)>
	//    3    5:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #40  <Class SearchView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1094 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #40  <Class SearchView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1098 <Method Parcelable SearchView$SavedState.getSuperState()>
	//   13   23:invokespecial   #1094 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			updateViewsVisibility(((SavedState) (parcelable)).isIconified);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #1100 <Field boolean SearchView$SavedState.isIconified>
	//   17   31:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
			requestLayout();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #1103 <Method void requestLayout()>
			return;
	//   20   38:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #40  <Class SearchView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1106 <Method Parcelable LinearLayoutCompat.onSaveInstanceState()>
	//    4    8:invokespecial   #1108 <Method void SearchView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.isIconified = isIconified();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #778 <Method boolean isIconified()>
	//    9   17:putfield        #1100 <Field boolean SearchView$SavedState.isIconified>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	void onSearchClicked()
	{
		updateViewsVisibility(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
		mSearchSrcTextView.requestFocus();
	//    3    5:aload_0         
	//    4    6:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:invokevirtual   #1024 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//    6   12:pop             
		mSearchSrcTextView.setImeVisibility(true);
	//    7   13:aload_0         
	//    8   14:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    9   17:iconst_1        
	//   10   18:invokestatic    #974 <Method void SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete, boolean)>
		if(mOnSearchClickListener != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #1111 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//*  13   25:ifnull          38
			mOnSearchClickListener.onClick(((View) (this)));
	//   14   28:aload_0         
	//   15   29:getfield        #1111 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//   16   32:aload_0         
	//   17   33:invokeinterface #1117 <Method void android.view.View$OnClickListener.onClick(View)>
	//   18   38:return          
	}

	void onSubmitQuery()
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_1        
		if(editable != null && TextUtils.getTrimmedLength(((CharSequence) (editable))) > 0 && (mOnQueryChangeListener == null || !mOnQueryChangeListener.onQueryTextSubmit(((CharSequence) (editable)).toString())))
	//*   4    8:aload_1         
	//*   5    9:ifnull          75
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #1122 <Method int TextUtils.getTrimmedLength(CharSequence)>
	//*   8   16:ifle            75
	//*   9   19:aload_0         
	//*  10   20:getfield        #1124 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  11   23:ifnull          44
	//*  12   26:aload_0         
	//*  13   27:getfield        #1124 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  14   30:aload_1         
	//*  15   31:invokeinterface #1125 <Method String CharSequence.toString()>
	//*  16   36:invokeinterface #1129 <Method boolean SearchView$OnQueryTextListener.onQueryTextSubmit(String)>
	//*  17   41:ifne            75
		{
			if(mSearchable != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #530 <Field SearchableInfo mSearchable>
	//*  20   48:ifnull          63
				launchQuerySearch(0, ((String) (null)), ((CharSequence) (editable)).toString());
	//   21   51:aload_0         
	//   22   52:iconst_0        
	//   23   53:aconst_null     
	//   24   54:aload_1         
	//   25   55:invokeinterface #1125 <Method String CharSequence.toString()>
	//   26   60:invokevirtual   #1131 <Method void launchQuerySearch(int, String, String)>
			mSearchSrcTextView.setImeVisibility(false);
	//   27   63:aload_0         
	//   28   64:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   29   67:iconst_0        
	//   30   68:invokestatic    #974 <Method void SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete, boolean)>
			dismissSuggestions();
	//   31   71:aload_0         
	//   32   72:invokespecial   #1040 <Method void dismissSuggestions()>
		}
	//   33   75:return          
	}

	boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
	{
		if(mSearchable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #530 <Field SearchableInfo mSearchable>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(mSuggestionsAdapter == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//*   7   13:ifnonnull       18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(keyevent.getAction() == 0 && keyevent.hasNoModifiers())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #1138 <Method int KeyEvent.getAction()>
	//*  12   22:ifne            155
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #1141 <Method boolean KeyEvent.hasNoModifiers()>
	//*  15   29:ifeq            155
			if(i != 66 && i != 84 && i != 61)
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
				if(i != 21 && i != 22)
	//*  26   53:iload_2         
	//*  27   54:bipush          21
	//*  28   56:icmpeq          86
	//*  29   59:iload_2         
	//*  30   60:bipush          22
	//*  31   62:icmpne          68
	//*  32   65:goto            86
				{
					if(i == 19 && mSearchSrcTextView.getListSelection() == 0)
	//*  33   68:iload_2         
	//*  34   69:bipush          19
	//*  35   71:icmpne          155
	//*  36   74:aload_0         
	//*  37   75:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*  38   78:invokevirtual   #1144 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//*  39   81:ifne            155
						return false;
	//   40   84:iconst_0        
	//   41   85:ireturn         
				} else
				{
					if(i == 21)
	//*  42   86:iload_2         
	//*  43   87:bipush          21
	//*  44   89:icmpne          97
						i = 0;
	//   45   92:iconst_0        
	//   46   93:istore_2        
					else
	//*  47   94:goto            105
						i = mSearchSrcTextView.length();
	//   48   97:aload_0         
	//   49   98:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   50  101:invokevirtual   #1145 <Method int SearchView$SearchAutoComplete.length()>
	//   51  104:istore_2        
					mSearchSrcTextView.setSelection(i);
	//   52  105:aload_0         
	//   53  106:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   54  109:iload_2         
	//   55  110:invokevirtual   #841 <Method void SearchView$SearchAutoComplete.setSelection(int)>
					mSearchSrcTextView.setListSelection(0);
	//   56  113:aload_0         
	//   57  114:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   58  117:iconst_0        
	//   59  118:invokevirtual   #1148 <Method void SearchView$SearchAutoComplete.setListSelection(int)>
					mSearchSrcTextView.clearListSelection();
	//   60  121:aload_0         
	//   61  122:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   62  125:invokevirtual   #1151 <Method void SearchView$SearchAutoComplete.clearListSelection()>
					HIDDEN_METHOD_INVOKER.ensureImeVisible(((AutoCompleteTextView) (mSearchSrcTextView)), true);
	//   63  128:getstatic       #146 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//   64  131:aload_0         
	//   65  132:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   66  135:iconst_1        
	//   67  136:invokevirtual   #1155 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
					return true;
	//   68  139:iconst_1        
	//   69  140:ireturn         
				}
			} else
			{
				return onItemClicked(mSearchSrcTextView.getListSelection(), 0, ((String) (null)));
	//   70  141:aload_0         
	//   71  142:aload_0         
	//   72  143:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   73  146:invokevirtual   #1144 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//   74  149:iconst_0        
	//   75  150:aconst_null     
	//   76  151:invokevirtual   #1157 <Method boolean onItemClicked(int, int, String)>
	//   77  154:ireturn         
			}
		return false;
	//   78  155:iconst_0        
	//   79  156:ireturn         
	}

	void onTextChanged(CharSequence charsequence)
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #817 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore          4
		mUserQuery = ((CharSequence) (editable));
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:putfield        #507 <Field CharSequence mUserQuery>
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (editable)));
	//    7   15:aload           4
	//    8   17:invokestatic    #833 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   20:istore_3        
		boolean flag = true;
	//   10   21:iconst_1        
	//   11   22:istore_2        
		flag1 ^= true;
	//   12   23:iload_3         
	//   13   24:iconst_1        
	//   14   25:ixor            
	//   15   26:istore_3        
		updateSubmitButton(flag1);
	//   16   27:aload_0         
	//   17   28:iload_3         
	//   18   29:invokespecial   #922 <Method void updateSubmitButton(boolean)>
		if(flag1)
	//*  19   32:iload_3         
	//*  20   33:ifne            39
	//*  21   36:goto            41
			flag = false;
	//   22   39:iconst_0        
	//   23   40:istore_2        
		updateVoiceButton(flag);
	//   24   41:aload_0         
	//   25   42:iload_2         
	//   26   43:invokespecial   #927 <Method void updateVoiceButton(boolean)>
		updateCloseButton();
	//   27   46:aload_0         
	//   28   47:invokespecial   #924 <Method void updateCloseButton()>
		updateSubmitArea();
	//   29   50:aload_0         
	//   30   51:invokespecial   #929 <Method void updateSubmitArea()>
		if(mOnQueryChangeListener != null && !TextUtils.equals(charsequence, mOldQueryText))
	//*  31   54:aload_0         
	//*  32   55:getfield        #1124 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  33   58:ifnull          88
	//*  34   61:aload_1         
	//*  35   62:aload_0         
	//*  36   63:getfield        #1160 <Field CharSequence mOldQueryText>
	//*  37   66:invokestatic    #1164 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  38   69:ifne            88
			mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
	//   39   72:aload_0         
	//   40   73:getfield        #1124 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//   41   76:aload_1         
	//   42   77:invokeinterface #1125 <Method String CharSequence.toString()>
	//   43   82:invokeinterface #1167 <Method boolean SearchView$OnQueryTextListener.onQueryTextChange(String)>
	//   44   87:pop             
		mOldQueryText = ((CharSequence) (charsequence.toString()));
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokeinterface #1125 <Method String CharSequence.toString()>
	//   48   95:putfield        #1160 <Field CharSequence mOldQueryText>
	//   49   98:return          
	}

	void onTextFocusChanged()
	{
		updateViewsVisibility(isIconified());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #778 <Method boolean isIconified()>
	//    3    5:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
		postUpdateFocusedState();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1170 <Method void postUpdateFocusedState()>
		if(mSearchSrcTextView.hasFocus())
	//*   6   12:aload_0         
	//*   7   13:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   8   16:invokevirtual   #1171 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   9   19:ifeq            26
			forceSuggestionQuery();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #1173 <Method void forceSuggestionQuery()>
	//   12   26:return          
	}

	void onVoiceClicked()
	{
		Object obj;
		if(mSearchable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #530 <Field SearchableInfo mSearchable>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		obj = ((Object) (mSearchable));
	//    4    8:aload_0         
	//    5    9:getfield        #530 <Field SearchableInfo mSearchable>
	//    6   12:astore_1        
		if(((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #745 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*   9   17:ifeq            39
		{
			obj = ((Object) (createVoiceWebSearchIntent(mVoiceWebSearchIntent, ((SearchableInfo) (obj)))));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #459 <Field Intent mVoiceWebSearchIntent>
	//   13   25:aload_1         
	//   14   26:invokespecial   #1178 <Method Intent createVoiceWebSearchIntent(Intent, SearchableInfo)>
	//   15   29:astore_1        
			getContext().startActivity(((Intent) (obj)));
	//   16   30:aload_0         
	//   17   31:invokevirtual   #617 <Method Context getContext()>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #782 <Method void Context.startActivity(Intent)>
			return;
	//   20   38:return          
		}
		ActivityNotFoundException activitynotfoundexception;
		try
		{
			if(((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer())
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #748 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  23   43:ifeq            74
			{
				obj = ((Object) (createVoiceAppSearchIntent(mVoiceAppSearchIntent, ((SearchableInfo) (obj)))));
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #476 <Field Intent mVoiceAppSearchIntent>
	//   27   51:aload_1         
	//   28   52:invokespecial   #1180 <Method Intent createVoiceAppSearchIntent(Intent, SearchableInfo)>
	//   29   55:astore_1        
				getContext().startActivity(((Intent) (obj)));
	//   30   56:aload_0         
	//   31   57:invokevirtual   #617 <Method Context getContext()>
	//   32   60:aload_1         
	//   33   61:invokevirtual   #782 <Method void Context.startActivity(Intent)>
				return;
	//   34   64:return          
			}
		}
	//*  35   65:ldc1            #63  <String "SearchView">
	//*  36   67:ldc2            #1182 <String "Could not find voice search activity">
	//*  37   70:invokestatic    #1185 <Method int Log.w(String, String)>
	//*  38   73:pop             
	//*  39   74:return          
		// Misplaced declaration of an exception variable
		catch(ActivityNotFoundException activitynotfoundexception)
		{
			Log.w("SearchView", "Could not find voice search activity");
		}
		return;
	//*  40   75:astore_1        
	//*  41   76:goto            65
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1188 <Method void LinearLayoutCompat.onWindowFocusChanged(boolean)>
		postUpdateFocusedState();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1170 <Method void postUpdateFocusedState()>
	//    5    9:return          
	}

	public boolean requestFocus(int i, Rect rect)
	{
		if(mClearingFocus)
	//*   0    0:aload_0         
	//*   1    1:getfield        #967 <Field boolean mClearingFocus>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!isFocusable())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #1192 <Method boolean isFocusable()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(!isIconified())
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #778 <Method boolean isIconified()>
	//*  12   22:ifne            46
		{
			boolean flag = mSearchSrcTextView.requestFocus(i, rect);
	//   13   25:aload_0         
	//   14   26:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   15   29:iload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #1194 <Method boolean SearchView$SearchAutoComplete.requestFocus(int, Rect)>
	//   18   34:istore_3        
			if(flag)
	//*  19   35:iload_3         
	//*  20   36:ifeq            44
				updateViewsVisibility(false);
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
			return flag;
	//   24   44:iload_3         
	//   25   45:ireturn         
		} else
		{
			return super.requestFocus(i, rect);
	//   26   46:aload_0         
	//   27   47:iload_1         
	//   28   48:aload_2         
	//   29   49:invokespecial   #1195 <Method boolean LinearLayoutCompat.requestFocus(int, Rect)>
	//   30   52:ireturn         
		}
	}

	public void setAppSearchData(Bundle bundle)
	{
		mAppSearchData = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #516 <Field Bundle mAppSearchData>
	//    3    5:return          
	}

	public void setIconified(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
		{
			onCloseClicked();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1203 <Method void onCloseClicked()>
			return;
	//    4    8:return          
		} else
		{
			onSearchClicked();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1205 <Method void onSearchClicked()>
			return;
	//    7   13:return          
		}
	}

	public void setIconifiedByDefault(boolean flag)
	{
		if(mIconifiedByDefault == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #491 <Field boolean mIconifiedByDefault>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mIconifiedByDefault = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #491 <Field boolean mIconifiedByDefault>
			updateViewsVisibility(flag);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
			updateQueryHint();
	//   11   19:aload_0         
	//   12   20:invokespecial   #497 <Method void updateQueryHint()>
			return;
	//   13   23:return          
		}
	}

	public void setImeOptions(int i)
	{
		mSearchSrcTextView.setImeOptions(i);
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #882 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
	//    4    8:return          
	}

	public void setInputType(int i)
	{
		mSearchSrcTextView.setInputType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #891 <Method void SearchView$SearchAutoComplete.setInputType(int)>
	//    4    8:return          
	}

	public void setMaxWidth(int i)
	{
		mMaxWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #987 <Field int mMaxWidth>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1103 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setOnCloseListener(OnCloseListener oncloselistener)
	{
		mOnCloseListener = oncloselistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1018 <Field SearchView$OnCloseListener mOnCloseListener>
	//    3    5:return          
	}

	public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
	{
		mOnQueryTextFocusChangeListener = onfocuschangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1210 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
	//    3    5:return          
	}

	public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
	{
		mOnQueryChangeListener = onquerytextlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1124 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//    3    5:return          
	}

	public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
	{
		mOnSearchClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1111 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//    3    5:return          
	}

	public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
	{
		mOnSuggestionListener = onsuggestionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1033 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//    3    5:return          
	}

	public void setQuery(CharSequence charsequence, boolean flag)
	{
		mSearchSrcTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #827 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		if(charsequence != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
		{
			mSearchSrcTextView.setSelection(mSearchSrcTextView.length());
	//    6   12:aload_0         
	//    7   13:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    8   16:aload_0         
	//    9   17:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:invokevirtual   #1145 <Method int SearchView$SearchAutoComplete.length()>
	//   11   23:invokevirtual   #841 <Method void SearchView$SearchAutoComplete.setSelection(int)>
			mUserQuery = charsequence;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #507 <Field CharSequence mUserQuery>
		}
		if(flag && !TextUtils.isEmpty(charsequence))
	//*  15   31:iload_2         
	//*  16   32:ifeq            46
	//*  17   35:aload_1         
	//*  18   36:invokestatic    #833 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   39:ifne            46
			onSubmitQuery();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #1217 <Method void onSubmitQuery()>
	//   22   46:return          
	}

	public void setQueryHint(CharSequence charsequence)
	{
		mQueryHint = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #426 <Field CharSequence mQueryHint>
		updateQueryHint();
	//    3    5:aload_0         
	//    4    6:invokespecial   #497 <Method void updateQueryHint()>
	//    5    9:return          
	}

	public void setQueryRefinementEnabled(boolean flag)
	{
		mQueryRefinement = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #904 <Field boolean mQueryRefinement>
		if(mSuggestionsAdapter instanceof SuggestionsAdapter)
	//*   3    5:aload_0         
	//*   4    6:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//*   5    9:instanceof      #548 <Class SuggestionsAdapter>
	//*   6   12:ifeq            39
		{
			SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
	//    7   15:aload_0         
	//    8   16:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//    9   19:checkcast       #548 <Class SuggestionsAdapter>
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
			suggestionsadapter.setQueryRefinement(((int) (byte0)));
	//   18   34:aload_3         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #907 <Method void SuggestionsAdapter.setQueryRefinement(int)>
		}
	//   21   39:return          
	}

	public void setSearchableInfo(SearchableInfo searchableinfo)
	{
		mSearchable = searchableinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #530 <Field SearchableInfo mSearchable>
		if(mSearchable != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #530 <Field SearchableInfo mSearchable>
	//*   5    9:ifnull          20
		{
			updateSearchAutoComplete();
	//    6   12:aload_0         
	//    7   13:invokespecial   #1224 <Method void updateSearchAutoComplete()>
			updateQueryHint();
	//    8   16:aload_0         
	//    9   17:invokespecial   #497 <Method void updateQueryHint()>
		}
		mVoiceButtonEnabled = hasVoiceSearch();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #1226 <Method boolean hasVoiceSearch()>
	//   13   25:putfield        #775 <Field boolean mVoiceButtonEnabled>
		if(mVoiceButtonEnabled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #775 <Field boolean mVoiceButtonEnabled>
	//*  16   32:ifeq            44
			mSearchSrcTextView.setPrivateImeOptions("nm");
	//   17   35:aload_0         
	//   18   36:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   19   39:ldc1            #60  <String "nm">
	//   20   41:invokevirtual   #1229 <Method void SearchView$SearchAutoComplete.setPrivateImeOptions(String)>
		updateViewsVisibility(isIconified());
	//   21   44:aload_0         
	//   22   45:aload_0         
	//   23   46:invokevirtual   #778 <Method boolean isIconified()>
	//   24   49:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
	//   25   52:return          
	}

	public void setSubmitButtonEnabled(boolean flag)
	{
		mSubmitButtonEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #773 <Field boolean mSubmitButtonEnabled>
		updateViewsVisibility(isIconified());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #778 <Method boolean isIconified()>
	//    6   10:invokespecial   #494 <Method void updateViewsVisibility(boolean)>
	//    7   13:return          
	}

	public void setSuggestionsAdapter(CursorAdapter cursoradapter)
	{
		mSuggestionsAdapter = cursoradapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #794 <Field CursorAdapter mSuggestionsAdapter>
		mSearchSrcTextView.setAdapter(((android.widget.ListAdapter) (mSuggestionsAdapter)));
	//    3    5:aload_0         
	//    4    6:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:aload_0         
	//    6   10:getfield        #794 <Field CursorAdapter mSuggestionsAdapter>
	//    7   13:invokevirtual   #902 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
	//    8   16:return          
	}

	void updateFocusedState()
	{
		int ai[];
		if(mSearchSrcTextView.hasFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #1171 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   3    7:ifeq            17
			ai = FOCUSED_STATE_SET;
	//    4   10:getstatic       #1236 <Field int[] FOCUSED_STATE_SET>
	//    5   13:astore_1        
		else
	//*   6   14:goto            21
			ai = EMPTY_STATE_SET;
	//    7   17:getstatic       #856 <Field int[] EMPTY_STATE_SET>
	//    8   20:astore_1        
		Drawable drawable = mSearchPlate.getBackground();
	//    9   21:aload_0         
	//   10   22:getfield        #258 <Field View mSearchPlate>
	//   11   25:invokevirtual   #1239 <Method Drawable View.getBackground()>
	//   12   28:astore_2        
		if(drawable != null)
	//*  13   29:aload_2         
	//*  14   30:ifnull          39
			drawable.setState(ai);
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #860 <Method boolean Drawable.setState(int[])>
	//   18   38:pop             
		drawable = mSubmitArea.getBackground();
	//   19   39:aload_0         
	//   20   40:getfield        #263 <Field View mSubmitArea>
	//   21   43:invokevirtual   #1239 <Method Drawable View.getBackground()>
	//   22   46:astore_2        
		if(drawable != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          57
			drawable.setState(ai);
	//   25   51:aload_2         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #860 <Method boolean Drawable.setState(int[])>
	//   28   56:pop             
		invalidate();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #1242 <Method void invalidate()>
	//   31   61:return          
	}

	static final boolean DBG = false;
	static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
	private static final String IME_OPTION_NO_MICROPHONE = "nm";
	static final String LOG_TAG = "SearchView";
	private Bundle mAppSearchData;
	private boolean mClearingFocus;
	final ImageView mCloseButton;
	private final ImageView mCollapsedIcon;
	private int mCollapsedImeOptions;
	private final CharSequence mDefaultQueryHint;
	private final View mDropDownAnchor;
	private boolean mExpandedInActionView;
	final ImageView mGoButton;
	private boolean mIconified;
	private boolean mIconifiedByDefault;
	private int mMaxWidth;
	private CharSequence mOldQueryText;
	private final android.view.View.OnClickListener mOnClickListener;
	private OnCloseListener mOnCloseListener;
	private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
	private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
	private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
	private OnQueryTextListener mOnQueryChangeListener;
	android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
	private android.view.View.OnClickListener mOnSearchClickListener;
	private OnSuggestionListener mOnSuggestionListener;
	private final WeakHashMap mOutsideDrawablesCache;
	private CharSequence mQueryHint;
	private boolean mQueryRefinement;
	private Runnable mReleaseCursorRunnable = new Runnable() {

		public void run()
		{
			if(mSuggestionsAdapter != null && (mSuggestionsAdapter instanceof SuggestionsAdapter))
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SearchView this$0>
		//*   2    4:getfield        #23  <Field CursorAdapter SearchView.mSuggestionsAdapter>
		//*   3    7:ifnull          34
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field SearchView this$0>
		//*   6   14:getfield        #23  <Field CursorAdapter SearchView.mSuggestionsAdapter>
		//*   7   17:instanceof      #25  <Class SuggestionsAdapter>
		//*   8   20:ifeq            34
				mSuggestionsAdapter.changeCursor(((Cursor) (null)));
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field SearchView this$0>
		//   11   27:getfield        #23  <Field CursorAdapter SearchView.mSuggestionsAdapter>
		//   12   30:aconst_null     
		//   13   31:invokevirtual   #31  <Method void CursorAdapter.changeCursor(Cursor)>
		//   14   34:return          
		}

		final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final ImageView mSearchButton;
	private final View mSearchEditFrame;
	private final Drawable mSearchHintIcon;
	private final View mSearchPlate;
	final SearchAutoComplete mSearchSrcTextView;
	private Rect mSearchSrcTextViewBounds;
	private Rect mSearchSrtTextViewBoundsExpanded;
	SearchableInfo mSearchable;
	private final View mSubmitArea;
	private boolean mSubmitButtonEnabled;
	private final int mSuggestionCommitIconResId;
	private final int mSuggestionRowLayout;
	CursorAdapter mSuggestionsAdapter;
	private int mTemp[];
	private int mTemp2[];
	android.view.View.OnKeyListener mTextKeyListener = new android.view.View.OnKeyListener() {

		public boolean onKey(View view, int j, KeyEvent keyevent)
		{
			if(mSearchable == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SearchView this$0>
		//*   2    4:getfield        #24  <Field SearchableInfo SearchView.mSearchable>
		//*   3    7:ifnonnull       12
				return false;
		//    4   10:iconst_0        
		//    5   11:ireturn         
			if(mSearchSrcTextView.isPopupShowing() && mSearchSrcTextView.getListSelection() != -1)
		//*   6   12:aload_0         
		//*   7   13:getfield        #14  <Field SearchView this$0>
		//*   8   16:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
		//*   9   19:invokevirtual   #34  <Method boolean SearchView$SearchAutoComplete.isPopupShowing()>
		//*  10   22:ifeq            50
		//*  11   25:aload_0         
		//*  12   26:getfield        #14  <Field SearchView this$0>
		//*  13   29:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
		//*  14   32:invokevirtual   #38  <Method int SearchView$SearchAutoComplete.getListSelection()>
		//*  15   35:iconst_m1       
		//*  16   36:icmpeq          50
				return onSuggestionsKey(view, j, keyevent);
		//   17   39:aload_0         
		//   18   40:getfield        #14  <Field SearchView this$0>
		//   19   43:aload_1         
		//   20   44:iload_2         
		//   21   45:aload_3         
		//   22   46:invokevirtual   #41  <Method boolean SearchView.onSuggestionsKey(View, int, KeyEvent)>
		//   23   49:ireturn         
			if(!mSearchSrcTextView.isEmpty() && keyevent.hasNoModifiers() && keyevent.getAction() == 1 && j == 66)
		//*  24   50:aload_0         
		//*  25   51:getfield        #14  <Field SearchView this$0>
		//*  26   54:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
		//*  27   57:invokestatic    #45  <Method boolean SearchView$SearchAutoComplete.access$100(SearchView$SearchAutoComplete)>
		//*  28   60:ifne            112
		//*  29   63:aload_3         
		//*  30   64:invokevirtual   #50  <Method boolean KeyEvent.hasNoModifiers()>
		//*  31   67:ifeq            112
		//*  32   70:aload_3         
		//*  33   71:invokevirtual   #53  <Method int KeyEvent.getAction()>
		//*  34   74:iconst_1        
		//*  35   75:icmpne          112
		//*  36   78:iload_2         
		//*  37   79:bipush          66
		//*  38   81:icmpne          112
			{
				view.cancelLongPress();
		//   39   84:aload_1         
		//   40   85:invokevirtual   #58  <Method void View.cancelLongPress()>
				launchQuerySearch(0, ((String) (null)), ((Object) (mSearchSrcTextView.getText())).toString());
		//   41   88:aload_0         
		//   42   89:getfield        #14  <Field SearchView this$0>
		//   43   92:iconst_0        
		//   44   93:aconst_null     
		//   45   94:aload_0         
		//   46   95:getfield        #14  <Field SearchView this$0>
		//   47   98:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
		//   48  101:invokevirtual   #62  <Method Editable SearchView$SearchAutoComplete.getText()>
		//   49  104:invokevirtual   #66  <Method String Object.toString()>
		//   50  107:invokevirtual   #70  <Method void SearchView.launchQuerySearch(int, String, String)>
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

		final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private TextWatcher mTextWatcher = new TextWatcher() {

		public void afterTextChanged(Editable editable)
		{
		//    0    0:return          
		}

		public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
		{
		//    0    0:return          
		}

		public void onTextChanged(CharSequence charsequence, int j, int k, int l)
		{
			SearchView.this.onTextChanged(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field SearchView this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method void SearchView.onTextChanged(CharSequence)>
		//    4    8:return          
		}

		final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private UpdatableTouchDelegate mTouchDelegate;
	private final Runnable mUpdateDrawableStateRunnable;
	private CharSequence mUserQuery;
	private final Intent mVoiceAppSearchIntent;
	final ImageView mVoiceButton;
	private boolean mVoiceButtonEnabled;
	private final Intent mVoiceWebSearchIntent;

	static 
	{
	//    0    0:new             #28  <Class SearchView$AutoCompleteTextViewReflector>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void SearchView$AutoCompleteTextViewReflector()>
	//    3    7:putstatic       #146 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//*   4   10:return          
	}

	// Unreferenced inner class android/support/v7/widget/SearchView$SearchAutoComplete$1

/* anonymous class */
	class SearchAutoComplete._cls1
		implements Runnable
	{

		public void run()
		{
			showSoftInputIfNecessary();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field SearchView$SearchAutoComplete this$0>
		//    2    4:invokestatic    #25  <Method void SearchView$SearchAutoComplete.access$200(SearchView$SearchAutoComplete)>
		//    3    7:return          
		}

		final SearchAutoComplete this$0;

			
			{
				this$0 = SearchAutoComplete.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchView$SearchAutoComplete this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
