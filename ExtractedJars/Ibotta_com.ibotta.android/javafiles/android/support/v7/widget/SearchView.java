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
			Method method;
			method = doAfterTextChanged;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field Method doAfterTextChanged>
		//    2    4:astore_2        
			if(method == null)
				break MISSING_BLOCK_LABEL_19;
		//    3    5:aload_2         
		//    4    6:ifnull          19
			method.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:iconst_0        
		//    8   12:anewarray       Object[]
		//    9   15:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
		//   10   18:pop             
			return;
		//   11   19:return          
			autocompletetextview;
		//   12   20:astore_1        
		//   13   21:return          
		}

		void doBeforeTextChanged(AutoCompleteTextView autocompletetextview)
		{
			Method method;
			method = doBeforeTextChanged;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Method doBeforeTextChanged>
		//    2    4:astore_2        
			if(method == null)
				break MISSING_BLOCK_LABEL_19;
		//    3    5:aload_2         
		//    4    6:ifnull          19
			method.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:iconst_0        
		//    8   12:anewarray       Object[]
		//    9   15:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
		//   10   18:pop             
			return;
		//   11   19:return          
			autocompletetextview;
		//   12   20:astore_1        
		//   13   21:return          
		}

		void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
		{
			Method method;
			method = ensureImeVisible;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Method ensureImeVisible>
		//    2    4:astore_3        
			if(method == null)
				break MISSING_BLOCK_LABEL_26;
		//    3    5:aload_3         
		//    4    6:ifnull          26
			method.invoke(((Object) (autocompletetextview)), new Object[] {
				Boolean.valueOf(flag)
			});
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:iconst_1        
		//    8   12:anewarray       Object[]
		//    9   15:dup             
		//   10   16:iconst_0        
		//   11   17:iload_2         
		//   12   18:invokestatic    #62  <Method Boolean Boolean.valueOf(boolean)>
		//   13   21:aastore         
		//   14   22:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
		//   15   25:pop             
			return;
		//   16   26:return          
			autocompletetextview;
		//   17   27:astore_1        
		//   18   28:return          
		}

		private Method doAfterTextChanged;
		private Method doBeforeTextChanged;
		private Method ensureImeVisible;

		AutoCompleteTextViewReflector()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			try
			{
				doBeforeTextChanged = ((Class) (android/widget/AutoCompleteTextView)).getDeclaredMethod("doBeforeTextChanged", new Class[0]);
		//    2    4:aload_0         
		//    3    5:ldc1            #19  <Class AutoCompleteTextView>
		//    4    7:ldc1            #20  <String "doBeforeTextChanged">
		//    5    9:iconst_0        
		//    6   10:anewarray       Class[]
		//    7   13:invokevirtual   #26  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    8   16:putfield        #28  <Field Method doBeforeTextChanged>
				doBeforeTextChanged.setAccessible(true);
		//    9   19:aload_0         
		//   10   20:getfield        #28  <Field Method doBeforeTextChanged>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #34  <Method void Method.setAccessible(boolean)>
			}
		//*  13   27:aload_0         
		//*  14   28:ldc1            #19  <Class AutoCompleteTextView>
		//*  15   30:ldc1            #35  <String "doAfterTextChanged">
		//*  16   32:iconst_0        
		//*  17   33:anewarray       Class[]
		//*  18   36:invokevirtual   #26  <Method Method Class.getDeclaredMethod(String, Class[])>
		//*  19   39:putfield        #37  <Field Method doAfterTextChanged>
		//*  20   42:aload_0         
		//*  21   43:getfield        #37  <Field Method doAfterTextChanged>
		//*  22   46:iconst_1        
		//*  23   47:invokevirtual   #34  <Method void Method.setAccessible(boolean)>
		//*  24   50:aload_0         
		//*  25   51:ldc1            #19  <Class AutoCompleteTextView>
		//*  26   53:ldc1            #38  <String "ensureImeVisible">
		//*  27   55:iconst_1        
		//*  28   56:anewarray       Class[]
		//*  29   59:dup             
		//*  30   60:iconst_0        
		//*  31   61:getstatic       #44  <Field Class Boolean.TYPE>
		//*  32   64:aastore         
		//*  33   65:invokevirtual   #47  <Method Method Class.getMethod(String, Class[])>
		//*  34   68:putfield        #49  <Field Method ensureImeVisible>
		//*  35   71:aload_0         
		//*  36   72:getfield        #49  <Field Method ensureImeVisible>
		//*  37   75:iconst_1        
		//*  38   76:invokevirtual   #34  <Method void Method.setAccessible(boolean)>
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
		//    1    1:invokevirtual   #49  <Method Resources getResources()>
		//    2    4:invokevirtual   #55  <Method Configuration Resources.getConfiguration()>
		//    3    7:astore_3        
			int i = configuration.screenWidthDp;
		//    4    8:aload_3         
		//    5    9:getfield        #60  <Field int Configuration.screenWidthDp>
		//    6   12:istore_1        
			int j = configuration.screenHeightDp;
		//    7   13:aload_3         
		//    8   14:getfield        #63  <Field int Configuration.screenHeightDp>
		//    9   17:istore_2        
			if(i >= 960 && j >= 720 && configuration.orientation == 2)
		//*  10   18:iload_1         
		//*  11   19:sipush          960
		//*  12   22:icmplt          44
		//*  13   25:iload_2         
		//*  14   26:sipush          720
		//*  15   29:icmplt          44
		//*  16   32:aload_3         
		//*  17   33:getfield        #66  <Field int Configuration.orientation>
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

		public boolean enoughToFilter()
		{
			return mThreshold <= 0 || super.enoughToFilter();
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int mThreshold>
		//    2    4:ifle            19
		//    3    7:aload_0         
		//    4    8:invokespecial   #70  <Method boolean AppCompatAutoCompleteTextView.enoughToFilter()>
		//    5   11:ifeq            17
		//    6   14:goto            19
		//    7   17:iconst_0        
		//    8   18:ireturn         
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		boolean isEmpty()
		{
			return TextUtils.getTrimmedLength(((CharSequence) (getText()))) == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method Editable getText()>
		//    2    4:invokestatic    #81  <Method int TextUtils.getTrimmedLength(CharSequence)>
		//    3    7:ifne            12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public InputConnection onCreateInputConnection(EditorInfo editorinfo)
		{
			editorinfo = ((EditorInfo) (super.onCreateInputConnection(editorinfo)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #85  <Method InputConnection AppCompatAutoCompleteTextView.onCreateInputConnection(EditorInfo)>
		//    3    5:astore_1        
			if(mHasPendingShowSoftInputRequest)
		//*   4    6:aload_0         
		//*   5    7:getfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
		//*   6   10:ifeq            31
			{
				removeCallbacks(mRunShowSoftInputIfNecessary);
		//    7   13:aload_0         
		//    8   14:aload_0         
		//    9   15:getfield        #38  <Field Runnable mRunShowSoftInputIfNecessary>
		//   10   18:invokevirtual   #91  <Method boolean removeCallbacks(Runnable)>
		//   11   21:pop             
				post(mRunShowSoftInputIfNecessary);
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:getfield        #38  <Field Runnable mRunShowSoftInputIfNecessary>
		//   15   27:invokevirtual   #94  <Method boolean post(Runnable)>
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
		//    1    1:invokespecial   #98  <Method void AppCompatAutoCompleteTextView.onFinishInflate()>
			android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #49  <Method Resources getResources()>
		//    4    8:invokevirtual   #102 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
		//    5   11:astore_1        
			setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displaymetrics));
		//    6   12:aload_0         
		//    7   13:iconst_1        
		//    8   14:aload_0         
		//    9   15:invokespecial   #104 <Method int getSearchViewTextMinWidthDp()>
		//   10   18:i2f             
		//   11   19:aload_1         
		//   12   20:invokestatic    #110 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
		//   13   23:f2i             
		//   14   24:invokevirtual   #114 <Method void setMinWidth(int)>
		//   15   27:return          
		}

		protected void onFocusChanged(boolean flag, int i, Rect rect)
		{
			super.onFocusChanged(flag, i, rect);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #118 <Method void AppCompatAutoCompleteTextView.onFocusChanged(boolean, int, Rect)>
			mSearchView.onTextFocusChanged();
		//    5    7:aload_0         
		//    6    8:getfield        #120 <Field SearchView mSearchView>
		//    7   11:invokevirtual   #123 <Method void SearchView.onTextFocusChanged()>
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
		//*   4    6:invokevirtual   #130 <Method int KeyEvent.getAction()>
		//*   5    9:ifne            36
		//*   6   12:aload_2         
		//*   7   13:invokevirtual   #133 <Method int KeyEvent.getRepeatCount()>
		//*   8   16:ifne            36
				{
					android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #137 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
		//   11   23:astore_3        
					if(dispatcherstate != null)
		//*  12   24:aload_3         
		//*  13   25:ifnull          34
						dispatcherstate.startTracking(keyevent, ((Object) (this)));
		//   14   28:aload_3         
		//   15   29:aload_2         
		//   16   30:aload_0         
		//   17   31:invokevirtual   #143 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
					return true;
		//   18   34:iconst_1        
		//   19   35:ireturn         
				}
				if(keyevent.getAction() == 1)
		//*  20   36:aload_2         
		//*  21   37:invokevirtual   #130 <Method int KeyEvent.getAction()>
		//*  22   40:iconst_1        
		//*  23   41:icmpne          86
				{
					android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
		//   24   44:aload_0         
		//   25   45:invokevirtual   #137 <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
		//   26   48:astore_3        
					if(dispatcherstate1 != null)
		//*  27   49:aload_3         
		//*  28   50:ifnull          58
						dispatcherstate1.handleUpEvent(keyevent);
		//   29   53:aload_3         
		//   30   54:aload_2         
		//   31   55:invokevirtual   #147 <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
					if(keyevent.isTracking() && !keyevent.isCanceled())
		//*  32   58:aload_2         
		//*  33   59:invokevirtual   #150 <Method boolean KeyEvent.isTracking()>
		//*  34   62:ifeq            86
		//*  35   65:aload_2         
		//*  36   66:invokevirtual   #153 <Method boolean KeyEvent.isCanceled()>
		//*  37   69:ifne            86
					{
						mSearchView.clearFocus();
		//   38   72:aload_0         
		//   39   73:getfield        #120 <Field SearchView mSearchView>
		//   40   76:invokevirtual   #156 <Method void SearchView.clearFocus()>
						setImeVisibility(false);
		//   41   79:aload_0         
		//   42   80:iconst_0        
		//   43   81:invokevirtual   #160 <Method void setImeVisibility(boolean)>
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
		//   49   89:invokespecial   #162 <Method boolean AppCompatAutoCompleteTextView.onKeyPreIme(int, KeyEvent)>
		//   50   92:ireturn         
		}

		public void onWindowFocusChanged(boolean flag)
		{
			super.onWindowFocusChanged(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #165 <Method void AppCompatAutoCompleteTextView.onWindowFocusChanged(boolean)>
			if(flag && mSearchView.hasFocus() && getVisibility() == 0)
		//*   3    5:iload_1         
		//*   4    6:ifeq            49
		//*   5    9:aload_0         
		//*   6   10:getfield        #120 <Field SearchView mSearchView>
		//*   7   13:invokevirtual   #168 <Method boolean SearchView.hasFocus()>
		//*   8   16:ifeq            49
		//*   9   19:aload_0         
		//*  10   20:invokevirtual   #171 <Method int getVisibility()>
		//*  11   23:ifne            49
			{
				mHasPendingShowSoftInputRequest = true;
		//   12   26:aload_0         
		//   13   27:iconst_1        
		//   14   28:putfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
				if(SearchView.isLandscapeMode(getContext()))
		//*  15   31:aload_0         
		//*  16   32:invokevirtual   #175 <Method Context getContext()>
		//*  17   35:invokestatic    #179 <Method boolean SearchView.isLandscapeMode(Context)>
		//*  18   38:ifeq            49
					SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(((AutoCompleteTextView) (this)), true);
		//   19   41:getstatic       #183 <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
		//   20   44:aload_0         
		//   21   45:iconst_1        
		//   22   46:invokevirtual   #189 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
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

		void setImeVisibility(boolean flag)
		{
			InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
		//    0    0:aload_0         
		//    1    1:invokevirtual   #175 <Method Context getContext()>
		//    2    4:ldc1            #194 <String "input_method">
		//    3    6:invokevirtual   #200 <Method Object Context.getSystemService(String)>
		//    4    9:checkcast       #202 <Class InputMethodManager>
		//    5   12:astore_2        
			if(!flag)
		//*   6   13:iload_1         
		//*   7   14:ifne            42
			{
				mHasPendingShowSoftInputRequest = false;
		//    8   17:aload_0         
		//    9   18:iconst_0        
		//   10   19:putfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
				removeCallbacks(mRunShowSoftInputIfNecessary);
		//   11   22:aload_0         
		//   12   23:aload_0         
		//   13   24:getfield        #38  <Field Runnable mRunShowSoftInputIfNecessary>
		//   14   27:invokevirtual   #91  <Method boolean removeCallbacks(Runnable)>
		//   15   30:pop             
				inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
		//   16   31:aload_2         
		//   17   32:aload_0         
		//   18   33:invokevirtual   #206 <Method android.os.IBinder getWindowToken()>
		//   19   36:iconst_0        
		//   20   37:invokevirtual   #210 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
		//   21   40:pop             
				return;
		//   22   41:return          
			}
			if(inputmethodmanager.isActive(((View) (this))))
		//*  23   42:aload_2         
		//*  24   43:aload_0         
		//*  25   44:invokevirtual   #214 <Method boolean InputMethodManager.isActive(View)>
		//*  26   47:ifeq            72
			{
				mHasPendingShowSoftInputRequest = false;
		//   27   50:aload_0         
		//   28   51:iconst_0        
		//   29   52:putfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
				removeCallbacks(mRunShowSoftInputIfNecessary);
		//   30   55:aload_0         
		//   31   56:aload_0         
		//   32   57:getfield        #38  <Field Runnable mRunShowSoftInputIfNecessary>
		//   33   60:invokevirtual   #91  <Method boolean removeCallbacks(Runnable)>
		//   34   63:pop             
				inputmethodmanager.showSoftInput(((View) (this)), 0);
		//   35   64:aload_2         
		//   36   65:aload_0         
		//   37   66:iconst_0        
		//   38   67:invokevirtual   #218 <Method boolean InputMethodManager.showSoftInput(View, int)>
		//   39   70:pop             
				return;
		//   40   71:return          
			} else
			{
				mHasPendingShowSoftInputRequest = true;
		//   41   72:aload_0         
		//   42   73:iconst_1        
		//   43   74:putfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
				return;
		//   44   77:return          
			}
		}

		void setSearchView(SearchView searchview)
		{
			mSearchView = searchview;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #120 <Field SearchView mSearchView>
		//    3    5:return          
		}

		public void setThreshold(int i)
		{
			super.setThreshold(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #223 <Method void AppCompatAutoCompleteTextView.setThreshold(int)>
			mThreshold = i;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #44  <Field int mThreshold>
		//    6   10:return          
		}

		void showSoftInputIfNecessary()
		{
			if(mHasPendingShowSoftInputRequest)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
		//*   2    4:ifeq            30
			{
				((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((View) (this)), 0);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #175 <Method Context getContext()>
		//    5   11:ldc1            #194 <String "input_method">
		//    6   13:invokevirtual   #200 <Method Object Context.getSystemService(String)>
		//    7   16:checkcast       #202 <Class InputMethodManager>
		//    8   19:aload_0         
		//    9   20:iconst_0        
		//   10   21:invokevirtual   #218 <Method boolean InputMethodManager.showSoftInput(View, int)>
		//   11   24:pop             
				mHasPendingShowSoftInputRequest = false;
		//   12   25:aload_0         
		//   13   26:iconst_0        
		//   14   27:putfield        #87  <Field boolean mHasPendingShowSoftInputRequest>
			}
		//   15   30:return          
		}

		private boolean mHasPendingShowSoftInputRequest;
		final Runnable mRunShowSoftInputIfNecessary;
		private SearchView mSearchView;
		private int mThreshold;

		public SearchAutoComplete(Context context, AttributeSet attributeset)
		{
			this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #28  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
		//    4    6:invokespecial   #31  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
		//    5    9:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
		{
			super(context, attributeset, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #33  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
			mRunShowSoftInputIfNecessary = new _cls1();
		//    5    7:aload_0         
		//    6    8:new             #9   <Class SearchView$SearchAutoComplete$1>
		//    7   11:dup             
		//    8   12:aload_0         
		//    9   13:invokespecial   #36  <Method void SearchView$SearchAutoComplete$1(SearchView$SearchAutoComplete)>
		//   10   16:putfield        #38  <Field Runnable mRunShowSoftInputIfNecessary>
			mThreshold = getThreshold();
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:invokevirtual   #42  <Method int getThreshold()>
		//   14   24:putfield        #44  <Field int mThreshold>
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
			rect = mSlopBounds;
		//    8   16:aload_0         
		//    9   17:getfield        #49  <Field Rect mSlopBounds>
		//   10   20:astore_1        
			int i = mSlop;
		//   11   21:aload_0         
		//   12   22:getfield        #40  <Field int mSlop>
		//   13   25:istore_3        
			rect.inset(-i, -i);
		//   14   26:aload_1         
		//   15   27:iload_3         
		//   16   28:ineg            
		//   17   29:iload_3         
		//   18   30:ineg            
		//   19   31:invokevirtual   #105 <Method void Rect.inset(int, int)>
			mActualBounds.set(rect1);
		//   20   34:aload_0         
		//   21   35:getfield        #51  <Field Rect mActualBounds>
		//   22   38:aload_2         
		//   23   39:invokevirtual   #101 <Method void Rect.set(Rect)>
		//   24   42:return          
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
	//    3    3:invokespecial   #142 <Method void SearchView(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.searchViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #147 <Field int android.support.v7.appcompat.R$attr.searchViewStyle>
	//    4    6:invokespecial   #150 <Method void SearchView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #151 <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		mSearchSrcTextViewBounds = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #153 <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #154 <Method void Rect()>
	//    9   15:putfield        #156 <Field Rect mSearchSrcTextViewBounds>
		mSearchSrtTextViewBoundsExpanded = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #153 <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #154 <Method void Rect()>
	//   14   26:putfield        #158 <Field Rect mSearchSrtTextViewBoundsExpanded>
		mTemp = new int[2];
	//   15   29:aload_0         
	//   16   30:iconst_2        
	//   17   31:newarray        int[]
	//   18   33:putfield        #160 <Field int[] mTemp>
		mTemp2 = new int[2];
	//   19   36:aload_0         
	//   20   37:iconst_2        
	//   21   38:newarray        int[]
	//   22   40:putfield        #162 <Field int[] mTemp2>
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
	//   27   49:invokespecial   #165 <Method void SearchView$1(SearchView)>
	//   28   52:putfield        #167 <Field Runnable mUpdateDrawableStateRunnable>
	//   29   55:aload_0         
	//   30   56:new             #12  <Class SearchView$2>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #168 <Method void SearchView$2(SearchView)>
	//   34   64:putfield        #170 <Field Runnable mReleaseCursorRunnable>
		mOutsideDrawablesCache = new WeakHashMap();
	//   35   67:aload_0         
	//   36   68:new             #172 <Class WeakHashMap>
	//   37   71:dup             
	//   38   72:invokespecial   #173 <Method void WeakHashMap()>
	//   39   75:putfield        #175 <Field WeakHashMap mOutsideDrawablesCache>
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
	//   44   84:invokespecial   #176 <Method void SearchView$5(SearchView)>
	//   45   87:putfield        #178 <Field android.view.View$OnClickListener mOnClickListener>
	//   46   90:aload_0         
	//   47   91:new             #20  <Class SearchView$6>
	//   48   94:dup             
	//   49   95:aload_0         
	//   50   96:invokespecial   #179 <Method void SearchView$6(SearchView)>
	//   51   99:putfield        #181 <Field android.view.View$OnKeyListener mTextKeyListener>
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
	//   56  108:invokespecial   #182 <Method void SearchView$7(SearchView)>
	//   57  111:putfield        #184 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
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
	//   62  120:invokespecial   #185 <Method void SearchView$8(SearchView)>
	//   63  123:putfield        #187 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
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
	//   68  132:invokespecial   #188 <Method void SearchView$9(SearchView)>
	//   69  135:putfield        #190 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//   70  138:aload_0         
	//   71  139:new             #10  <Class SearchView$10>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:invokespecial   #191 <Method void SearchView$10(SearchView)>
	//   75  147:putfield        #193 <Field TextWatcher mTextWatcher>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SearchView, i, 0)));
	//   76  150:aload_1         
	//   77  151:aload_2         
	//   78  152:getstatic       #198 <Field int[] android.support.v7.appcompat.R$styleable.SearchView>
	//   79  155:iload_3         
	//   80  156:iconst_0        
	//   81  157:invokestatic    #204 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   82  160:astore_2        
		LayoutInflater.from(context).inflate(((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_layout, android.support.v7.appcompat.R.layout.abc_search_view), ((android.view.ViewGroup) (this)), true);
	//   83  161:aload_1         
	//   84  162:invokestatic    #210 <Method LayoutInflater LayoutInflater.from(Context)>
	//   85  165:aload_2         
	//   86  166:getstatic       #213 <Field int android.support.v7.appcompat.R$styleable.SearchView_layout>
	//   87  169:getstatic       #218 <Field int android.support.v7.appcompat.R$layout.abc_search_view>
	//   88  172:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//   89  175:aload_0         
	//   90  176:iconst_1        
	//   91  177:invokevirtual   #226 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   92  180:pop             
		mSearchSrcTextView = (SearchAutoComplete)findViewById(android.support.v7.appcompat.R.id.search_src_text);
	//   93  181:aload_0         
	//   94  182:aload_0         
	//   95  183:getstatic       #231 <Field int android.support.v7.appcompat.R$id.search_src_text>
	//   96  186:invokevirtual   #235 <Method View findViewById(int)>
	//   97  189:checkcast       #45  <Class SearchView$SearchAutoComplete>
	//   98  192:putfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
		mSearchSrcTextView.setSearchView(this);
	//   99  195:aload_0         
	//  100  196:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  101  199:aload_0         
	//  102  200:invokevirtual   #240 <Method void SearchView$SearchAutoComplete.setSearchView(SearchView)>
		mSearchEditFrame = findViewById(android.support.v7.appcompat.R.id.search_edit_frame);
	//  103  203:aload_0         
	//  104  204:aload_0         
	//  105  205:getstatic       #243 <Field int android.support.v7.appcompat.R$id.search_edit_frame>
	//  106  208:invokevirtual   #235 <Method View findViewById(int)>
	//  107  211:putfield        #245 <Field View mSearchEditFrame>
		mSearchPlate = findViewById(android.support.v7.appcompat.R.id.search_plate);
	//  108  214:aload_0         
	//  109  215:aload_0         
	//  110  216:getstatic       #248 <Field int android.support.v7.appcompat.R$id.search_plate>
	//  111  219:invokevirtual   #235 <Method View findViewById(int)>
	//  112  222:putfield        #250 <Field View mSearchPlate>
		mSubmitArea = findViewById(android.support.v7.appcompat.R.id.submit_area);
	//  113  225:aload_0         
	//  114  226:aload_0         
	//  115  227:getstatic       #253 <Field int android.support.v7.appcompat.R$id.submit_area>
	//  116  230:invokevirtual   #235 <Method View findViewById(int)>
	//  117  233:putfield        #255 <Field View mSubmitArea>
		mSearchButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_button);
	//  118  236:aload_0         
	//  119  237:aload_0         
	//  120  238:getstatic       #258 <Field int android.support.v7.appcompat.R$id.search_button>
	//  121  241:invokevirtual   #235 <Method View findViewById(int)>
	//  122  244:checkcast       #260 <Class ImageView>
	//  123  247:putfield        #262 <Field ImageView mSearchButton>
		mGoButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_go_btn);
	//  124  250:aload_0         
	//  125  251:aload_0         
	//  126  252:getstatic       #265 <Field int android.support.v7.appcompat.R$id.search_go_btn>
	//  127  255:invokevirtual   #235 <Method View findViewById(int)>
	//  128  258:checkcast       #260 <Class ImageView>
	//  129  261:putfield        #267 <Field ImageView mGoButton>
		mCloseButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_close_btn);
	//  130  264:aload_0         
	//  131  265:aload_0         
	//  132  266:getstatic       #270 <Field int android.support.v7.appcompat.R$id.search_close_btn>
	//  133  269:invokevirtual   #235 <Method View findViewById(int)>
	//  134  272:checkcast       #260 <Class ImageView>
	//  135  275:putfield        #272 <Field ImageView mCloseButton>
		mVoiceButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_voice_btn);
	//  136  278:aload_0         
	//  137  279:aload_0         
	//  138  280:getstatic       #275 <Field int android.support.v7.appcompat.R$id.search_voice_btn>
	//  139  283:invokevirtual   #235 <Method View findViewById(int)>
	//  140  286:checkcast       #260 <Class ImageView>
	//  141  289:putfield        #277 <Field ImageView mVoiceButton>
		mCollapsedIcon = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_mag_icon);
	//  142  292:aload_0         
	//  143  293:aload_0         
	//  144  294:getstatic       #280 <Field int android.support.v7.appcompat.R$id.search_mag_icon>
	//  145  297:invokevirtual   #235 <Method View findViewById(int)>
	//  146  300:checkcast       #260 <Class ImageView>
	//  147  303:putfield        #282 <Field ImageView mCollapsedIcon>
		ViewCompat.setBackground(mSearchPlate, ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_queryBackground));
	//  148  306:aload_0         
	//  149  307:getfield        #250 <Field View mSearchPlate>
	//  150  310:aload_2         
	//  151  311:getstatic       #285 <Field int android.support.v7.appcompat.R$styleable.SearchView_queryBackground>
	//  152  314:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  153  317:invokestatic    #295 <Method void ViewCompat.setBackground(View, Drawable)>
		ViewCompat.setBackground(mSubmitArea, ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_submitBackground));
	//  154  320:aload_0         
	//  155  321:getfield        #255 <Field View mSubmitArea>
	//  156  324:aload_2         
	//  157  325:getstatic       #298 <Field int android.support.v7.appcompat.R$styleable.SearchView_submitBackground>
	//  158  328:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  159  331:invokestatic    #295 <Method void ViewCompat.setBackground(View, Drawable)>
		mSearchButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
	//  160  334:aload_0         
	//  161  335:getfield        #262 <Field ImageView mSearchButton>
	//  162  338:aload_2         
	//  163  339:getstatic       #301 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchIcon>
	//  164  342:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  165  345:invokevirtual   #305 <Method void ImageView.setImageDrawable(Drawable)>
		mGoButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_goIcon));
	//  166  348:aload_0         
	//  167  349:getfield        #267 <Field ImageView mGoButton>
	//  168  352:aload_2         
	//  169  353:getstatic       #308 <Field int android.support.v7.appcompat.R$styleable.SearchView_goIcon>
	//  170  356:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  171  359:invokevirtual   #305 <Method void ImageView.setImageDrawable(Drawable)>
		mCloseButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_closeIcon));
	//  172  362:aload_0         
	//  173  363:getfield        #272 <Field ImageView mCloseButton>
	//  174  366:aload_2         
	//  175  367:getstatic       #311 <Field int android.support.v7.appcompat.R$styleable.SearchView_closeIcon>
	//  176  370:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  177  373:invokevirtual   #305 <Method void ImageView.setImageDrawable(Drawable)>
		mVoiceButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_voiceIcon));
	//  178  376:aload_0         
	//  179  377:getfield        #277 <Field ImageView mVoiceButton>
	//  180  380:aload_2         
	//  181  381:getstatic       #314 <Field int android.support.v7.appcompat.R$styleable.SearchView_voiceIcon>
	//  182  384:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  183  387:invokevirtual   #305 <Method void ImageView.setImageDrawable(Drawable)>
		mCollapsedIcon.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
	//  184  390:aload_0         
	//  185  391:getfield        #282 <Field ImageView mCollapsedIcon>
	//  186  394:aload_2         
	//  187  395:getstatic       #301 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchIcon>
	//  188  398:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  189  401:invokevirtual   #305 <Method void ImageView.setImageDrawable(Drawable)>
		mSearchHintIcon = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchHintIcon);
	//  190  404:aload_0         
	//  191  405:aload_2         
	//  192  406:getstatic       #317 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchHintIcon>
	//  193  409:invokevirtual   #289 <Method Drawable TintTypedArray.getDrawable(int)>
	//  194  412:putfield        #319 <Field Drawable mSearchHintIcon>
		TooltipCompat.setTooltipText(((View) (mSearchButton)), ((CharSequence) (getResources().getString(android.support.v7.appcompat.R.string.abc_searchview_description_search))));
	//  195  415:aload_0         
	//  196  416:getfield        #262 <Field ImageView mSearchButton>
	//  197  419:aload_0         
	//  198  420:invokevirtual   #323 <Method Resources getResources()>
	//  199  423:getstatic       #328 <Field int android.support.v7.appcompat.R$string.abc_searchview_description_search>
	//  200  426:invokevirtual   #334 <Method String Resources.getString(int)>
	//  201  429:invokestatic    #340 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		mSuggestionRowLayout = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_suggestionRowLayout, android.support.v7.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
	//  202  432:aload_0         
	//  203  433:aload_2         
	//  204  434:getstatic       #343 <Field int android.support.v7.appcompat.R$styleable.SearchView_suggestionRowLayout>
	//  205  437:getstatic       #346 <Field int android.support.v7.appcompat.R$layout.abc_search_dropdown_item_icons_2line>
	//  206  440:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//  207  443:putfield        #348 <Field int mSuggestionRowLayout>
		mSuggestionCommitIconResId = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_commitIcon, 0);
	//  208  446:aload_0         
	//  209  447:aload_2         
	//  210  448:getstatic       #351 <Field int android.support.v7.appcompat.R$styleable.SearchView_commitIcon>
	//  211  451:iconst_0        
	//  212  452:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//  213  455:putfield        #353 <Field int mSuggestionCommitIconResId>
		mSearchButton.setOnClickListener(mOnClickListener);
	//  214  458:aload_0         
	//  215  459:getfield        #262 <Field ImageView mSearchButton>
	//  216  462:aload_0         
	//  217  463:getfield        #178 <Field android.view.View$OnClickListener mOnClickListener>
	//  218  466:invokevirtual   #357 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mCloseButton.setOnClickListener(mOnClickListener);
	//  219  469:aload_0         
	//  220  470:getfield        #272 <Field ImageView mCloseButton>
	//  221  473:aload_0         
	//  222  474:getfield        #178 <Field android.view.View$OnClickListener mOnClickListener>
	//  223  477:invokevirtual   #357 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mGoButton.setOnClickListener(mOnClickListener);
	//  224  480:aload_0         
	//  225  481:getfield        #267 <Field ImageView mGoButton>
	//  226  484:aload_0         
	//  227  485:getfield        #178 <Field android.view.View$OnClickListener mOnClickListener>
	//  228  488:invokevirtual   #357 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mVoiceButton.setOnClickListener(mOnClickListener);
	//  229  491:aload_0         
	//  230  492:getfield        #277 <Field ImageView mVoiceButton>
	//  231  495:aload_0         
	//  232  496:getfield        #178 <Field android.view.View$OnClickListener mOnClickListener>
	//  233  499:invokevirtual   #357 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mSearchSrcTextView.setOnClickListener(mOnClickListener);
	//  234  502:aload_0         
	//  235  503:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  236  506:aload_0         
	//  237  507:getfield        #178 <Field android.view.View$OnClickListener mOnClickListener>
	//  238  510:invokevirtual   #358 <Method void SearchView$SearchAutoComplete.setOnClickListener(android.view.View$OnClickListener)>
		mSearchSrcTextView.addTextChangedListener(mTextWatcher);
	//  239  513:aload_0         
	//  240  514:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  241  517:aload_0         
	//  242  518:getfield        #193 <Field TextWatcher mTextWatcher>
	//  243  521:invokevirtual   #362 <Method void SearchView$SearchAutoComplete.addTextChangedListener(TextWatcher)>
		mSearchSrcTextView.setOnEditorActionListener(mOnEditorActionListener);
	//  244  524:aload_0         
	//  245  525:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  246  528:aload_0         
	//  247  529:getfield        #184 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
	//  248  532:invokevirtual   #366 <Method void SearchView$SearchAutoComplete.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		mSearchSrcTextView.setOnItemClickListener(mOnItemClickListener);
	//  249  535:aload_0         
	//  250  536:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  251  539:aload_0         
	//  252  540:getfield        #187 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
	//  253  543:invokevirtual   #370 <Method void SearchView$SearchAutoComplete.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		mSearchSrcTextView.setOnItemSelectedListener(mOnItemSelectedListener);
	//  254  546:aload_0         
	//  255  547:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  256  550:aload_0         
	//  257  551:getfield        #190 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//  258  554:invokevirtual   #374 <Method void SearchView$SearchAutoComplete.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		mSearchSrcTextView.setOnKeyListener(mTextKeyListener);
	//  259  557:aload_0         
	//  260  558:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  261  561:aload_0         
	//  262  562:getfield        #181 <Field android.view.View$OnKeyListener mTextKeyListener>
	//  263  565:invokevirtual   #378 <Method void SearchView$SearchAutoComplete.setOnKeyListener(android.view.View$OnKeyListener)>
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
	//  265  569:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  266  572:new             #14  <Class SearchView$3>
	//  267  575:dup             
	//  268  576:aload_0         
	//  269  577:invokespecial   #379 <Method void SearchView$3(SearchView)>
	//  270  580:invokevirtual   #383 <Method void SearchView$SearchAutoComplete.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
		setIconifiedByDefault(((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
	//  271  583:aload_0         
	//  272  584:aload_2         
	//  273  585:getstatic       #386 <Field int android.support.v7.appcompat.R$styleable.SearchView_iconifiedByDefault>
	//  274  588:iconst_1        
	//  275  589:invokevirtual   #390 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  276  592:invokevirtual   #394 <Method void setIconifiedByDefault(boolean)>
		i = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SearchView_android_maxWidth, -1);
	//  277  595:aload_2         
	//  278  596:getstatic       #397 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_maxWidth>
	//  279  599:iconst_m1       
	//  280  600:invokevirtual   #400 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  281  603:istore_3        
		if(i != -1)
	//* 282  604:iload_3         
	//* 283  605:iconst_m1       
	//* 284  606:icmpeq          614
			setMaxWidth(i);
	//  285  609:aload_0         
	//  286  610:iload_3         
	//  287  611:invokevirtual   #404 <Method void setMaxWidth(int)>
		mDefaultQueryHint = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SearchView_defaultQueryHint);
	//  288  614:aload_0         
	//  289  615:aload_2         
	//  290  616:getstatic       #407 <Field int android.support.v7.appcompat.R$styleable.SearchView_defaultQueryHint>
	//  291  619:invokevirtual   #411 <Method CharSequence TintTypedArray.getText(int)>
	//  292  622:putfield        #413 <Field CharSequence mDefaultQueryHint>
		mQueryHint = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SearchView_queryHint);
	//  293  625:aload_0         
	//  294  626:aload_2         
	//  295  627:getstatic       #416 <Field int android.support.v7.appcompat.R$styleable.SearchView_queryHint>
	//  296  630:invokevirtual   #411 <Method CharSequence TintTypedArray.getText(int)>
	//  297  633:putfield        #418 <Field CharSequence mQueryHint>
		i = ((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SearchView_android_imeOptions, -1);
	//  298  636:aload_2         
	//  299  637:getstatic       #421 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_imeOptions>
	//  300  640:iconst_m1       
	//  301  641:invokevirtual   #424 <Method int TintTypedArray.getInt(int, int)>
	//  302  644:istore_3        
		if(i != -1)
	//* 303  645:iload_3         
	//* 304  646:iconst_m1       
	//* 305  647:icmpeq          655
			setImeOptions(i);
	//  306  650:aload_0         
	//  307  651:iload_3         
	//  308  652:invokevirtual   #427 <Method void setImeOptions(int)>
		i = ((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SearchView_android_inputType, -1);
	//  309  655:aload_2         
	//  310  656:getstatic       #430 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_inputType>
	//  311  659:iconst_m1       
	//  312  660:invokevirtual   #424 <Method int TintTypedArray.getInt(int, int)>
	//  313  663:istore_3        
		if(i != -1)
	//* 314  664:iload_3         
	//* 315  665:iconst_m1       
	//* 316  666:icmpeq          674
			setInputType(i);
	//  317  669:aload_0         
	//  318  670:iload_3         
	//  319  671:invokevirtual   #433 <Method void setInputType(int)>
		setFocusable(((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SearchView_android_focusable, true));
	//  320  674:aload_0         
	//  321  675:aload_2         
	//  322  676:getstatic       #436 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_focusable>
	//  323  679:iconst_1        
	//  324  680:invokevirtual   #390 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  325  683:invokevirtual   #439 <Method void setFocusable(boolean)>
		((TintTypedArray) (attributeset)).recycle();
	//  326  686:aload_2         
	//  327  687:invokevirtual   #442 <Method void TintTypedArray.recycle()>
		mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
	//  328  690:aload_0         
	//  329  691:new             #444 <Class Intent>
	//  330  694:dup             
	//  331  695:ldc2            #446 <String "android.speech.action.WEB_SEARCH">
	//  332  698:invokespecial   #449 <Method void Intent(String)>
	//  333  701:putfield        #451 <Field Intent mVoiceWebSearchIntent>
		mVoiceWebSearchIntent.addFlags(0x10000000);
	//  334  704:aload_0         
	//  335  705:getfield        #451 <Field Intent mVoiceWebSearchIntent>
	//  336  708:ldc2            #452 <Int 0x10000000>
	//  337  711:invokevirtual   #456 <Method Intent Intent.addFlags(int)>
	//  338  714:pop             
		mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
	//  339  715:aload_0         
	//  340  716:getfield        #451 <Field Intent mVoiceWebSearchIntent>
	//  341  719:ldc2            #458 <String "android.speech.extra.LANGUAGE_MODEL">
	//  342  722:ldc2            #460 <String "web_search">
	//  343  725:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//  344  728:pop             
		mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
	//  345  729:aload_0         
	//  346  730:new             #444 <Class Intent>
	//  347  733:dup             
	//  348  734:ldc2            #466 <String "android.speech.action.RECOGNIZE_SPEECH">
	//  349  737:invokespecial   #449 <Method void Intent(String)>
	//  350  740:putfield        #468 <Field Intent mVoiceAppSearchIntent>
		mVoiceAppSearchIntent.addFlags(0x10000000);
	//  351  743:aload_0         
	//  352  744:getfield        #468 <Field Intent mVoiceAppSearchIntent>
	//  353  747:ldc2            #452 <Int 0x10000000>
	//  354  750:invokevirtual   #456 <Method Intent Intent.addFlags(int)>
	//  355  753:pop             
		mDropDownAnchor = findViewById(mSearchSrcTextView.getDropDownAnchor());
	//  356  754:aload_0         
	//  357  755:aload_0         
	//  358  756:aload_0         
	//  359  757:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  360  760:invokevirtual   #472 <Method int SearchView$SearchAutoComplete.getDropDownAnchor()>
	//  361  763:invokevirtual   #235 <Method View findViewById(int)>
	//  362  766:putfield        #474 <Field View mDropDownAnchor>
		context = ((Context) (mDropDownAnchor));
	//  363  769:aload_0         
	//  364  770:getfield        #474 <Field View mDropDownAnchor>
	//  365  773:astore_1        
		if(context != null)
	//* 366  774:aload_1         
	//* 367  775:ifnull          790
			((View) (context)).addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

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
	//  368  778:aload_1         
	//  369  779:new             #16  <Class SearchView$4>
	//  370  782:dup             
	//  371  783:aload_0         
	//  372  784:invokespecial   #475 <Method void SearchView$4(SearchView)>
	//  373  787:invokevirtual   #481 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		updateViewsVisibility(mIconifiedByDefault);
	//  374  790:aload_0         
	//  375  791:aload_0         
	//  376  792:getfield        #483 <Field boolean mIconifiedByDefault>
	//  377  795:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
		updateQueryHint();
	//  378  798:aload_0         
	//  379  799:invokespecial   #489 <Method void updateQueryHint()>
	//  380  802:return          
	}

	private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
	{
		s = ((String) (new Intent(s)));
	//    0    0:new             #444 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #449 <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s)).addFlags(0x10000000);
	//    5    9:aload_1         
	//    6   10:ldc2            #452 <Int 0x10000000>
	//    7   13:invokevirtual   #456 <Method Intent Intent.addFlags(int)>
	//    8   16:pop             
		if(uri != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			((Intent) (s)).setData(uri);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #495 <Method Intent Intent.setData(Uri)>
	//   14   26:pop             
		((Intent) (s)).putExtra("user_query", mUserQuery);
	//   15   27:aload_1         
	//   16   28:ldc2            #497 <String "user_query">
	//   17   31:aload_0         
	//   18   32:getfield        #499 <Field CharSequence mUserQuery>
	//   19   35:invokevirtual   #502 <Method Intent Intent.putExtra(String, CharSequence)>
	//   20   38:pop             
		if(s2 != null)
	//*  21   39:aload           4
	//*  22   41:ifnull          54
			((Intent) (s)).putExtra("query", s2);
	//   23   44:aload_1         
	//   24   45:ldc2            #504 <String "query">
	//   25   48:aload           4
	//   26   50:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   27   53:pop             
		if(s1 != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          67
			((Intent) (s)).putExtra("intent_extra_data_key", s1);
	//   30   58:aload_1         
	//   31   59:ldc2            #506 <String "intent_extra_data_key">
	//   32   62:aload_3         
	//   33   63:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   34   66:pop             
		uri = ((Uri) (mAppSearchData));
	//   35   67:aload_0         
	//   36   68:getfield        #508 <Field Bundle mAppSearchData>
	//   37   71:astore_2        
		if(uri != null)
	//*  38   72:aload_2         
	//*  39   73:ifnull          85
			((Intent) (s)).putExtra("app_data", ((Bundle) (uri)));
	//   40   76:aload_1         
	//   41   77:ldc2            #510 <String "app_data">
	//   42   80:aload_2         
	//   43   81:invokevirtual   #513 <Method Intent Intent.putExtra(String, Bundle)>
	//   44   84:pop             
		if(i != 0)
	//*  45   85:iload           5
	//*  46   87:ifeq            110
		{
			((Intent) (s)).putExtra("action_key", i);
	//   47   90:aload_1         
	//   48   91:ldc2            #515 <String "action_key">
	//   49   94:iload           5
	//   50   96:invokevirtual   #518 <Method Intent Intent.putExtra(String, int)>
	//   51   99:pop             
			((Intent) (s)).putExtra("action_msg", s3);
	//   52  100:aload_1         
	//   53  101:ldc2            #520 <String "action_msg">
	//   54  104:aload           6
	//   55  106:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   56  109:pop             
		}
		((Intent) (s)).setComponent(mSearchable.getSearchActivity());
	//   57  110:aload_1         
	//   58  111:aload_0         
	//   59  112:getfield        #522 <Field SearchableInfo mSearchable>
	//   60  115:invokevirtual   #528 <Method ComponentName SearchableInfo.getSearchActivity()>
	//   61  118:invokevirtual   #532 <Method Intent Intent.setComponent(ComponentName)>
	//   62  121:pop             
		return ((Intent) (s));
	//   63  122:aload_1         
	//   64  123:areturn         
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
	//    1    1:ldc2            #538 <String "suggest_intent_action">
	//    2    4:invokestatic    #544 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//    3    7:astore          5
		}
	//*   4    9:aload           5
	//*   5   11:astore          4
	//*   6   13:aload           5
	//*   7   15:ifnonnull       230
	//*   8   18:aload_0         
	//*   9   19:getfield        #522 <Field SearchableInfo mSearchable>
	//*  10   22:invokevirtual   #548 <Method String SearchableInfo.getSuggestIntentAction()>
	//*  11   25:astore          4
	//*  12   27:goto            230
	//*  13   30:aload_1         
	//*  14   31:ldc2            #550 <String "suggest_intent_data">
	//*  15   34:invokestatic    #544 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  16   37:astore          6
	//*  17   39:aload           6
	//*  18   41:astore          4
	//*  19   43:aload           6
	//*  20   45:ifnonnull       57
	//*  21   48:aload_0         
	//*  22   49:getfield        #522 <Field SearchableInfo mSearchable>
	//*  23   52:invokevirtual   #553 <Method String SearchableInfo.getSuggestIntentData()>
	//*  24   55:astore          4
	//*  25   57:aload           4
	//*  26   59:astore          6
	//*  27   61:aload           4
	//*  28   63:ifnull          250
	//*  29   66:aload_1         
	//*  30   67:ldc2            #555 <String "suggest_intent_data_id">
	//*  31   70:invokestatic    #544 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  32   73:astore          7
	//*  33   75:aload           4
	//*  34   77:astore          6
	//*  35   79:aload           7
	//*  36   81:ifnull          250
	//*  37   84:new             #557 <Class StringBuilder>
	//*  38   87:dup             
	//*  39   88:invokespecial   #558 <Method void StringBuilder()>
	//*  40   91:astore          6
	//*  41   93:aload           6
	//*  42   95:aload           4
	//*  43   97:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//*  44  100:pop             
	//*  45  101:aload           6
	//*  46  103:ldc2            #564 <String "/">
	//*  47  106:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//*  48  109:pop             
	//*  49  110:aload           6
	//*  50  112:aload           7
	//*  51  114:invokestatic    #570 <Method String Uri.encode(String)>
	//*  52  117:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//*  53  120:pop             
	//*  54  121:aload           6
	//*  55  123:invokevirtual   #573 <Method String StringBuilder.toString()>
	//*  56  126:astore          6
	//*  57  128:goto            250
	//*  58  131:aload           6
	//*  59  133:invokestatic    #577 <Method Uri Uri.parse(String)>
	//*  60  136:astore          4
	//*  61  138:aload_1         
	//*  62  139:ldc2            #579 <String "suggest_intent_query">
	//*  63  142:invokestatic    #544 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  64  145:astore          6
	//*  65  147:aload_0         
	//*  66  148:aload           5
	//*  67  150:aload           4
	//*  68  152:aload_1         
	//*  69  153:ldc2            #581 <String "suggest_intent_extra_data">
	//*  70  156:invokestatic    #544 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  71  159:aload           6
	//*  72  161:iload_2         
	//*  73  162:aload_3         
	//*  74  163:invokespecial   #583 <Method Intent createIntent(String, Uri, String, String, int, String)>
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
	//   80  171:invokeinterface #588 <Method int Cursor.getPosition()>
	//   81  176:istore_2        
			}
	//*  82  177:goto            182
	//*  83  180:iconst_m1       
	//*  84  181:istore_2        
	//*  85  182:new             #557 <Class StringBuilder>
	//*  86  185:dup             
	//*  87  186:invokespecial   #558 <Method void StringBuilder()>
	//*  88  189:astore_1        
	//*  89  190:aload_1         
	//*  90  191:ldc2            #590 <String "Search suggestions cursor at row ">
	//*  91  194:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//*  92  197:pop             
	//*  93  198:aload_1         
	//*  94  199:iload_2         
	//*  95  200:invokevirtual   #593 <Method StringBuilder StringBuilder.append(int)>
	//*  96  203:pop             
	//*  97  204:aload_1         
	//*  98  205:ldc2            #595 <String " returned exception.">
	//*  99  208:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//* 100  211:pop             
	//* 101  212:ldc2            #596 <String "SearchView">
	//* 102  215:aload_1         
	//* 103  216:invokevirtual   #573 <Method String StringBuilder.toString()>
	//* 104  219:aload_3         
	//* 105  220:invokestatic    #602 <Method int Log.w(String, String, Throwable)>
	//* 106  223:pop             
	//* 107  224:aconst_null     
	//* 108  225:areturn         
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
	//* 109  226:astore_1        
	//* 110  227:goto            180
_L2:
		if(obj == null)
	//* 111  230:aload           4
	//* 112  232:ifnonnull       243
			obj1 = "android.intent.action.SEARCH";
	//  113  235:ldc2            #604 <String "android.intent.action.SEARCH">
	//  114  238:astore          5
		else
	//* 115  240:goto            30
			obj1 = obj;
	//  116  243:aload           4
	//  117  245:astore          5
		  goto _L6
	//* 118  247:goto            30
_L4:
		if(obj2 != null) goto _L8; else goto _L7
	//  119  250:aload           6
	//  120  252:ifnonnull       131
_L7:
		obj = null;
	//  121  255:aconst_null     
	//  122  256:astore          4
		  goto _L9
	//* 123  258:goto            138
	}

	private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
	{
		ComponentName componentname = searchableinfo.getSearchActivity();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #528 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    2    4:astore          10
		Object obj = ((Object) (new Intent("android.intent.action.SEARCH")));
	//    3    6:new             #444 <Class Intent>
	//    4    9:dup             
	//    5   10:ldc2            #604 <String "android.intent.action.SEARCH">
	//    6   13:invokespecial   #449 <Method void Intent(String)>
	//    7   16:astore          5
		((Intent) (obj)).setComponent(componentname);
	//    8   18:aload           5
	//    9   20:aload           10
	//   10   22:invokevirtual   #532 <Method Intent Intent.setComponent(ComponentName)>
	//   11   25:pop             
		PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #610 <Method Context getContext()>
	//   14   30:iconst_0        
	//   15   31:aload           5
	//   16   33:ldc2            #611 <Int 0x40000000>
	//   17   36:invokestatic    #617 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   18   39:astore          8
		Bundle bundle = new Bundle();
	//   19   41:new             #619 <Class Bundle>
	//   20   44:dup             
	//   21   45:invokespecial   #620 <Method void Bundle()>
	//   22   48:astore          9
		obj = ((Object) (mAppSearchData));
	//   23   50:aload_0         
	//   24   51:getfield        #508 <Field Bundle mAppSearchData>
	//   25   54:astore          5
		if(obj != null)
	//*  26   56:aload           5
	//*  27   58:ifnull          71
			bundle.putParcelable("app_data", ((Parcelable) (obj)));
	//   28   61:aload           9
	//   29   63:ldc2            #510 <String "app_data">
	//   30   66:aload           5
	//   31   68:invokevirtual   #624 <Method void Bundle.putParcelable(String, Parcelable)>
		Intent intent1 = new Intent(intent);
	//   32   71:new             #444 <Class Intent>
	//   33   74:dup             
	//   34   75:aload_1         
	//   35   76:invokespecial   #627 <Method void Intent(Intent)>
	//   36   79:astore          11
		intent = "free_form";
	//   37   81:ldc2            #629 <String "free_form">
	//   38   84:astore_1        
		int i = 1;
	//   39   85:iconst_1        
	//   40   86:istore_3        
		Object obj1 = ((Object) (getResources()));
	//   41   87:aload_0         
	//   42   88:invokevirtual   #323 <Method Resources getResources()>
	//   43   91:astore          6
		if(searchableinfo.getVoiceLanguageModeId() != 0)
	//*  44   93:aload_2         
	//*  45   94:invokevirtual   #632 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//*  46   97:ifeq            110
			intent = ((Intent) (((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageModeId())));
	//   47  100:aload           6
	//   48  102:aload_2         
	//   49  103:invokevirtual   #632 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//   50  106:invokevirtual   #334 <Method String Resources.getString(int)>
	//   51  109:astore_1        
		int j = searchableinfo.getVoicePromptTextId();
	//   52  110:aload_2         
	//   53  111:invokevirtual   #635 <Method int SearchableInfo.getVoicePromptTextId()>
	//   54  114:istore          4
		Object obj2 = null;
	//   55  116:aconst_null     
	//   56  117:astore          7
		if(j != 0)
	//*  57  119:iload           4
	//*  58  121:ifeq            138
			obj = ((Object) (((Resources) (obj1)).getString(searchableinfo.getVoicePromptTextId())));
	//   59  124:aload           6
	//   60  126:aload_2         
	//   61  127:invokevirtual   #635 <Method int SearchableInfo.getVoicePromptTextId()>
	//   62  130:invokevirtual   #334 <Method String Resources.getString(int)>
	//   63  133:astore          5
		else
	//*  64  135:goto            141
			obj = null;
	//   65  138:aconst_null     
	//   66  139:astore          5
		if(searchableinfo.getVoiceLanguageId() != 0)
	//*  67  141:aload_2         
	//*  68  142:invokevirtual   #638 <Method int SearchableInfo.getVoiceLanguageId()>
	//*  69  145:ifeq            162
			obj1 = ((Object) (((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageId())));
	//   70  148:aload           6
	//   71  150:aload_2         
	//   72  151:invokevirtual   #638 <Method int SearchableInfo.getVoiceLanguageId()>
	//   73  154:invokevirtual   #334 <Method String Resources.getString(int)>
	//   74  157:astore          6
		else
	//*  75  159:goto            165
			obj1 = null;
	//   76  162:aconst_null     
	//   77  163:astore          6
		if(searchableinfo.getVoiceMaxResults() != 0)
	//*  78  165:aload_2         
	//*  79  166:invokevirtual   #641 <Method int SearchableInfo.getVoiceMaxResults()>
	//*  80  169:ifeq            177
			i = searchableinfo.getVoiceMaxResults();
	//   81  172:aload_2         
	//   82  173:invokevirtual   #641 <Method int SearchableInfo.getVoiceMaxResults()>
	//   83  176:istore_3        
		intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", ((String) (intent)));
	//   84  177:aload           11
	//   85  179:ldc2            #458 <String "android.speech.extra.LANGUAGE_MODEL">
	//   86  182:aload_1         
	//   87  183:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   88  186:pop             
		intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
	//   89  187:aload           11
	//   90  189:ldc2            #643 <String "android.speech.extra.PROMPT">
	//   91  192:aload           5
	//   92  194:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   93  197:pop             
		intent1.putExtra("android.speech.extra.LANGUAGE", ((String) (obj1)));
	//   94  198:aload           11
	//   95  200:ldc2            #645 <String "android.speech.extra.LANGUAGE">
	//   96  203:aload           6
	//   97  205:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   98  208:pop             
		intent1.putExtra("android.speech.extra.MAX_RESULTS", i);
	//   99  209:aload           11
	//  100  211:ldc2            #647 <String "android.speech.extra.MAX_RESULTS">
	//  101  214:iload_3         
	//  102  215:invokevirtual   #518 <Method Intent Intent.putExtra(String, int)>
	//  103  218:pop             
		if(componentname == null)
	//* 104  219:aload           10
	//* 105  221:ifnonnull       230
			intent = ((Intent) (obj2));
	//  106  224:aload           7
	//  107  226:astore_1        
		else
	//* 108  227:goto            236
			intent = ((Intent) (componentname.flattenToShortString()));
	//  109  230:aload           10
	//  110  232:invokevirtual   #652 <Method String ComponentName.flattenToShortString()>
	//  111  235:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//  112  236:aload           11
	//  113  238:ldc2            #654 <String "calling_package">
	//  114  241:aload_1         
	//  115  242:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//  116  245:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", ((Parcelable) (pendingintent)));
	//  117  246:aload           11
	//  118  248:ldc2            #656 <String "android.speech.extra.RESULTS_PENDINGINTENT">
	//  119  251:aload           8
	//  120  253:invokevirtual   #659 <Method Intent Intent.putExtra(String, Parcelable)>
	//  121  256:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
	//  122  257:aload           11
	//  123  259:ldc2            #661 <String "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE">
	//  124  262:aload           9
	//  125  264:invokevirtual   #513 <Method Intent Intent.putExtra(String, Bundle)>
	//  126  267:pop             
		return intent1;
	//  127  268:aload           11
	//  128  270:areturn         
	}

	private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
	{
		Intent intent1 = new Intent(intent);
	//    0    0:new             #444 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #627 <Method void Intent(Intent)>
	//    4    8:astore_3        
		intent = ((Intent) (searchableinfo.getSearchActivity()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #528 <Method ComponentName SearchableInfo.getSearchActivity()>
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
	//   14   24:invokevirtual   #652 <Method String ComponentName.flattenToShortString()>
	//   15   27:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//   16   28:aload_3         
	//   17   29:ldc2            #654 <String "calling_package">
	//   18   32:aload_1         
	//   19   33:invokevirtual   #464 <Method Intent Intent.putExtra(String, String)>
	//   20   36:pop             
		return intent1;
	//   21   37:aload_3         
	//   22   38:areturn         
	}

	private void dismissSuggestions()
	{
		mSearchSrcTextView.dismissDropDown();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #666 <Method void SearchView$SearchAutoComplete.dismissDropDown()>
	//    3    7:return          
	}

	private void getChildBoundsWithinSearchView(View view, Rect rect)
	{
		view.getLocationInWindow(mTemp);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #160 <Field int[] mTemp>
	//    3    5:invokevirtual   #672 <Method void View.getLocationInWindow(int[])>
		getLocationInWindow(mTemp2);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #162 <Field int[] mTemp2>
	//    7   13:invokevirtual   #673 <Method void getLocationInWindow(int[])>
		int ai[] = mTemp;
	//    8   16:aload_0         
	//    9   17:getfield        #160 <Field int[] mTemp>
	//   10   20:astore          5
		int i = ai[1];
	//   11   22:aload           5
	//   12   24:iconst_1        
	//   13   25:iaload          
	//   14   26:istore_3        
		int ai1[] = mTemp2;
	//   15   27:aload_0         
	//   16   28:getfield        #162 <Field int[] mTemp2>
	//   17   31:astore          6
		i -= ai1[1];
	//   18   33:iload_3         
	//   19   34:aload           6
	//   20   36:iconst_1        
	//   21   37:iaload          
	//   22   38:isub            
	//   23   39:istore_3        
		int j = ai[0] - ai1[0];
	//   24   40:aload           5
	//   25   42:iconst_0        
	//   26   43:iaload          
	//   27   44:aload           6
	//   28   46:iconst_0        
	//   29   47:iaload          
	//   30   48:isub            
	//   31   49:istore          4
		rect.set(j, i, view.getWidth() + j, view.getHeight() + i);
	//   32   51:aload_2         
	//   33   52:iload           4
	//   34   54:iload_3         
	//   35   55:aload_1         
	//   36   56:invokevirtual   #676 <Method int View.getWidth()>
	//   37   59:iload           4
	//   38   61:iadd            
	//   39   62:aload_1         
	//   40   63:invokevirtual   #679 <Method int View.getHeight()>
	//   41   66:iload_3         
	//   42   67:iadd            
	//   43   68:invokevirtual   #683 <Method void Rect.set(int, int, int, int)>
	//   44   71:return          
	}

	private CharSequence getDecoratedHint(CharSequence charsequence)
	{
		if(mIconifiedByDefault)
	//*   0    0:aload_0         
	//*   1    1:getfield        #483 <Field boolean mIconifiedByDefault>
	//*   2    4:ifeq            79
		{
			if(mSearchHintIcon == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #319 <Field Drawable mSearchHintIcon>
	//*   5   11:ifnonnull       16
			{
				return charsequence;
	//    6   14:aload_1         
	//    7   15:areturn         
			} else
			{
				int i = (int)((double)mSearchSrcTextView.getTextSize() * 1.25D);
	//    8   16:aload_0         
	//    9   17:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:invokevirtual   #689 <Method float SearchView$SearchAutoComplete.getTextSize()>
	//   11   23:f2d             
	//   12   24:ldc2w           #690 <Double 1.25D>
	//   13   27:dmul            
	//   14   28:d2i             
	//   15   29:istore_2        
				mSearchHintIcon.setBounds(0, 0, i, i);
	//   16   30:aload_0         
	//   17   31:getfield        #319 <Field Drawable mSearchHintIcon>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:iload_2         
	//   21   37:iload_2         
	//   22   38:invokevirtual   #696 <Method void Drawable.setBounds(int, int, int, int)>
				SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
	//   23   41:new             #698 <Class SpannableStringBuilder>
	//   24   44:dup             
	//   25   45:ldc2            #700 <String "   ">
	//   26   48:invokespecial   #703 <Method void SpannableStringBuilder(CharSequence)>
	//   27   51:astore_3        
				spannablestringbuilder.setSpan(((Object) (new ImageSpan(mSearchHintIcon))), 1, 2, 33);
	//   28   52:aload_3         
	//   29   53:new             #705 <Class ImageSpan>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:getfield        #319 <Field Drawable mSearchHintIcon>
	//   33   61:invokespecial   #707 <Method void ImageSpan(Drawable)>
	//   34   64:iconst_1        
	//   35   65:iconst_2        
	//   36   66:bipush          33
	//   37   68:invokevirtual   #711 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				spannablestringbuilder.append(charsequence);
	//   38   71:aload_3         
	//   39   72:aload_1         
	//   40   73:invokevirtual   #714 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
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
	//    1    1:invokevirtual   #610 <Method Context getContext()>
	//    2    4:invokevirtual   #718 <Method Resources Context.getResources()>
	//    3    7:getstatic       #723 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_height>
	//    4   10:invokevirtual   #726 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private int getPreferredWidth()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_width);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #610 <Method Context getContext()>
	//    2    4:invokevirtual   #718 <Method Resources Context.getResources()>
	//    3    7:getstatic       #730 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_width>
	//    4   10:invokevirtual   #726 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private boolean hasVoiceSearch()
	{
		SearchableInfo searchableinfo = mSearchable;
	//    0    0:aload_0         
	//    1    1:getfield        #522 <Field SearchableInfo mSearchable>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(searchableinfo != null && searchableinfo.getVoiceSearchEnabled())
	//*   5    7:aload_2         
	//*   6    8:ifnull          78
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #735 <Method boolean SearchableInfo.getVoiceSearchEnabled()>
	//*   9   15:ifeq            78
		{
			Intent intent = null;
	//   10   18:aconst_null     
	//   11   19:astore_2        
			if(mSearchable.getVoiceSearchLaunchWebSearch())
	//*  12   20:aload_0         
	//*  13   21:getfield        #522 <Field SearchableInfo mSearchable>
	//*  14   24:invokevirtual   #738 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*  15   27:ifeq            38
				intent = mVoiceWebSearchIntent;
	//   16   30:aload_0         
	//   17   31:getfield        #451 <Field Intent mVoiceWebSearchIntent>
	//   18   34:astore_2        
			else
	//*  19   35:goto            53
			if(mSearchable.getVoiceSearchLaunchRecognizer())
	//*  20   38:aload_0         
	//*  21   39:getfield        #522 <Field SearchableInfo mSearchable>
	//*  22   42:invokevirtual   #741 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  23   45:ifeq            53
				intent = mVoiceAppSearchIntent;
	//   24   48:aload_0         
	//   25   49:getfield        #468 <Field Intent mVoiceAppSearchIntent>
	//   26   52:astore_2        
			if(intent != null)
	//*  27   53:aload_2         
	//*  28   54:ifnull          78
			{
				if(getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #610 <Method Context getContext()>
	//*  31   61:invokevirtual   #745 <Method PackageManager Context.getPackageManager()>
	//*  32   64:aload_2         
	//*  33   65:ldc2            #746 <Int 0x10000>
	//*  34   68:invokevirtual   #752 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*  35   71:ifnull          76
					flag = true;
	//   36   74:iconst_1        
	//   37   75:istore_1        
				return flag;
	//   38   76:iload_1         
	//   39   77:ireturn         
			}
		}
		return false;
	//   40   78:iconst_0        
	//   41   79:ireturn         
	}

	static boolean isLandscapeMode(Context context)
	{
		return context.getResources().getConfiguration().orientation == 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #718 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #758 <Method Configuration Resources.getConfiguration()>
	//    3    7:getfield        #763 <Field int Configuration.orientation>
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
	//    1    1:getfield        #766 <Field boolean mSubmitButtonEnabled>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #768 <Field boolean mVoiceButtonEnabled>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:invokevirtual   #771 <Method boolean isIconified()>
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
	//    4    6:invokevirtual   #610 <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #775 <Method void Context.startActivity(Intent)>
			return;
	//    7   13:return          
		}
		catch(RuntimeException runtimeexception)
	//*   8   14:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #557 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #558 <Method void StringBuilder()>
	//   12   22:astore_3        
			stringbuilder.append("Failed launch activity: ");
	//   13   23:aload_3         
	//   14   24:ldc2            #777 <String "Failed launch activity: ">
	//   15   27:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			stringbuilder.append(((Object) (intent)));
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #780 <Method StringBuilder StringBuilder.append(Object)>
	//   20   36:pop             
			Log.e("SearchView", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   21   37:ldc2            #596 <String "SearchView">
	//   22   40:aload_3         
	//   23   41:invokevirtual   #573 <Method String StringBuilder.toString()>
	//   24   44:aload_2         
	//   25   45:invokestatic    #783 <Method int Log.e(String, String, Throwable)>
	//   26   48:pop             
			return;
	//   27   49:return          
		}
	}

	private boolean launchSuggestion(int i, int j, String s)
	{
		Cursor cursor = mSuggestionsAdapter.getCursor();
	//    0    0:aload_0         
	//    1    1:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//    2    4:invokevirtual   #793 <Method Cursor CursorAdapter.getCursor()>
	//    3    7:astore          4
		if(cursor != null && cursor.moveToPosition(i))
	//*   4    9:aload           4
	//*   5   11:ifnull          39
	//*   6   14:aload           4
	//*   7   16:iload_1         
	//*   8   17:invokeinterface #797 <Method boolean Cursor.moveToPosition(int)>
	//*   9   22:ifeq            39
		{
			launchIntent(createIntentFromSuggestion(cursor, j, s));
	//   10   25:aload_0         
	//   11   26:aload_0         
	//   12   27:aload           4
	//   13   29:iload_2         
	//   14   30:aload_3         
	//   15   31:invokespecial   #799 <Method Intent createIntentFromSuggestion(Cursor, int, String)>
	//   16   34:invokespecial   #801 <Method void launchIntent(Intent)>
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
	//    2    2:getfield        #167 <Field Runnable mUpdateDrawableStateRunnable>
	//    3    5:invokevirtual   #806 <Method boolean post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void rewriteQueryFromSuggestion(int i)
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_2        
		Object obj = ((Object) (mSuggestionsAdapter.getCursor()));
	//    4    8:aload_0         
	//    5    9:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//    6   12:invokevirtual   #793 <Method Cursor CursorAdapter.getCursor()>
	//    7   15:astore_3        
		if(obj == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(((Cursor) (obj)).moveToPosition(i))
	//*  11   21:aload_3         
	//*  12   22:iload_1         
	//*  13   23:invokeinterface #797 <Method boolean Cursor.moveToPosition(int)>
	//*  14   28:ifeq            56
		{
			obj = ((Object) (mSuggestionsAdapter.convertToString(((Cursor) (obj)))));
	//   15   31:aload_0         
	//   16   32:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #814 <Method CharSequence CursorAdapter.convertToString(Cursor)>
	//   19   39:astore_3        
			if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          50
			{
				setQuery(((CharSequence) (obj)));
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:invokespecial   #817 <Method void setQuery(CharSequence)>
				return;
	//   25   49:return          
			} else
			{
				setQuery(((CharSequence) (editable)));
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:invokespecial   #817 <Method void setQuery(CharSequence)>
				return;
	//   29   55:return          
			}
		} else
		{
			setQuery(((CharSequence) (editable)));
	//   30   56:aload_0         
	//   31   57:aload_2         
	//   32   58:invokespecial   #817 <Method void setQuery(CharSequence)>
			return;
	//   33   61:return          
		}
	}

	private void setQuery(CharSequence charsequence)
	{
		mSearchSrcTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #820 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    4    8:aload_0         
	//    5    9:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    6   12:astore_3        
		int i;
		if(TextUtils.isEmpty(charsequence))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #826 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifeq            25
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		else
	//*  12   22:goto            32
			i = charsequence.length();
	//   13   25:aload_1         
	//   14   26:invokeinterface #831 <Method int CharSequence.length()>
	//   15   31:istore_2        
		searchautocomplete.setSelection(i);
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #834 <Method void SearchView$SearchAutoComplete.setSelection(int)>
	//   19   37:return          
	}

	private void updateCloseButton()
	{
		boolean flag4 = TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText())));
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:invokestatic    #826 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//*  18   30:getfield        #483 <Field boolean mIconifiedByDefault>
	//*  19   33:ifeq            48
	//*  20   36:aload_0         
	//*  21   37:getfield        #837 <Field boolean mExpandedInActionView>
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
	//   29   51:getfield        #272 <Field ImageView mCloseButton>
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
	//   40   71:invokevirtual   #840 <Method void ImageView.setVisibility(int)>
		Drawable drawable = mCloseButton.getDrawable();
	//   41   74:aload_0         
	//   42   75:getfield        #272 <Field ImageView mCloseButton>
	//   43   78:invokevirtual   #843 <Method Drawable ImageView.getDrawable()>
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
	//   49   93:getstatic       #846 <Field int[] ENABLED_STATE_SET>
	//   50   96:astore          6
			else
	//*  51   98:goto            106
				ai = EMPTY_STATE_SET;
	//   52  101:getstatic       #849 <Field int[] EMPTY_STATE_SET>
	//   53  104:astore          6
			drawable.setState(ai);
	//   54  106:aload           7
	//   55  108:aload           6
	//   56  110:invokevirtual   #853 <Method boolean Drawable.setState(int[])>
	//   57  113:pop             
		}
	//   58  114:return          
	}

	private void updateQueryHint()
	{
		CharSequence charsequence = getQueryHint();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #857 <Method CharSequence getQueryHint()>
	//    2    4:astore_2        
		SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:astore_3        
		Object obj = ((Object) (charsequence));
	//    6   10:aload_2         
	//    7   11:astore_1        
		if(charsequence == null)
	//*   8   12:aload_2         
	//*   9   13:ifnonnull       20
			obj = "";
	//   10   16:ldc2            #859 <String "">
	//   11   19:astore_1        
		searchautocomplete.setHint(getDecoratedHint(((CharSequence) (obj))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokespecial   #861 <Method CharSequence getDecoratedHint(CharSequence)>
	//   16   26:invokevirtual   #864 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
	//   17   29:return          
	}

	private void updateSearchAutoComplete()
	{
		mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_0         
	//    3    5:getfield        #522 <Field SearchableInfo mSearchable>
	//    4    8:invokevirtual   #868 <Method int SearchableInfo.getSuggestThreshold()>
	//    5   11:invokevirtual   #871 <Method void SearchView$SearchAutoComplete.setThreshold(int)>
		mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
	//    6   14:aload_0         
	//    7   15:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    8   18:aload_0         
	//    9   19:getfield        #522 <Field SearchableInfo mSearchable>
	//   10   22:invokevirtual   #874 <Method int SearchableInfo.getImeOptions()>
	//   11   25:invokevirtual   #875 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		int j = mSearchable.getInputType();
	//   12   28:aload_0         
	//   13   29:getfield        #522 <Field SearchableInfo mSearchable>
	//   14   32:invokevirtual   #878 <Method int SearchableInfo.getInputType()>
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
	//   26   49:ldc2            #879 <Int 0xfffeffff>
	//   27   52:iand            
	//   28   53:istore_3        
			i = j;
	//   29   54:iload_3         
	//   30   55:istore_1        
			if(mSearchable.getSuggestAuthority() != null)
	//*  31   56:aload_0         
	//*  32   57:getfield        #522 <Field SearchableInfo mSearchable>
	//*  33   60:invokevirtual   #882 <Method String SearchableInfo.getSuggestAuthority()>
	//*  34   63:ifnull          76
				i = j | 0x10000 | 0x80000;
	//   35   66:iload_3         
	//   36   67:ldc2            #746 <Int 0x10000>
	//   37   70:ior             
	//   38   71:ldc2            #883 <Int 0x80000>
	//   39   74:ior             
	//   40   75:istore_1        
		}
		mSearchSrcTextView.setInputType(i);
	//   41   76:aload_0         
	//   42   77:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   43   80:iload_1         
	//   44   81:invokevirtual   #884 <Method void SearchView$SearchAutoComplete.setInputType(int)>
		CursorAdapter cursoradapter = mSuggestionsAdapter;
	//   45   84:aload_0         
	//   46   85:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//   47   88:astore          4
		if(cursoradapter != null)
	//*  48   90:aload           4
	//*  49   92:ifnull          101
			cursoradapter.changeCursor(((Cursor) (null)));
	//   50   95:aload           4
	//   51   97:aconst_null     
	//   52   98:invokevirtual   #888 <Method void CursorAdapter.changeCursor(Cursor)>
		if(mSearchable.getSuggestAuthority() != null)
	//*  53  101:aload_0         
	//*  54  102:getfield        #522 <Field SearchableInfo mSearchable>
	//*  55  105:invokevirtual   #882 <Method String SearchableInfo.getSuggestAuthority()>
	//*  56  108:ifnull          172
		{
			mSuggestionsAdapter = ((CursorAdapter) (new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache)));
	//   57  111:aload_0         
	//   58  112:new             #540 <Class SuggestionsAdapter>
	//   59  115:dup             
	//   60  116:aload_0         
	//   61  117:invokevirtual   #610 <Method Context getContext()>
	//   62  120:aload_0         
	//   63  121:aload_0         
	//   64  122:getfield        #522 <Field SearchableInfo mSearchable>
	//   65  125:aload_0         
	//   66  126:getfield        #175 <Field WeakHashMap mOutsideDrawablesCache>
	//   67  129:invokespecial   #891 <Method void SuggestionsAdapter(Context, SearchView, SearchableInfo, WeakHashMap)>
	//   68  132:putfield        #787 <Field CursorAdapter mSuggestionsAdapter>
			mSearchSrcTextView.setAdapter(((android.widget.ListAdapter) (mSuggestionsAdapter)));
	//   69  135:aload_0         
	//   70  136:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   71  139:aload_0         
	//   72  140:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//   73  143:invokevirtual   #895 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
			SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
	//   74  146:aload_0         
	//   75  147:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//   76  150:checkcast       #540 <Class SuggestionsAdapter>
	//   77  153:astore          4
			byte byte0 = ((byte) (flag));
	//   78  155:iload_2         
	//   79  156:istore_1        
			if(mQueryRefinement)
	//*  80  157:aload_0         
	//*  81  158:getfield        #897 <Field boolean mQueryRefinement>
	//*  82  161:ifeq            166
				byte0 = 2;
	//   83  164:iconst_2        
	//   84  165:istore_1        
			suggestionsadapter.setQueryRefinement(((int) (byte0)));
	//   85  166:aload           4
	//   86  168:iload_1         
	//   87  169:invokevirtual   #900 <Method void SuggestionsAdapter.setQueryRefinement(int)>
		}
	//   88  172:return          
	}

	private void updateSubmitArea()
	{
		byte byte0;
		if(isSubmitAreaEnabled() && (mGoButton.getVisibility() == 0 || mVoiceButton.getVisibility() == 0))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #903 <Method boolean isSubmitAreaEnabled()>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #267 <Field ImageView mGoButton>
	//*   5   11:invokevirtual   #906 <Method int ImageView.getVisibility()>
	//*   6   14:ifeq            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #277 <Field ImageView mVoiceButton>
	//*   9   21:invokevirtual   #906 <Method int ImageView.getVisibility()>
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
	//   17   36:getfield        #255 <Field View mSubmitArea>
	//   18   39:iload_1         
	//   19   40:invokevirtual   #907 <Method void View.setVisibility(int)>
	//   20   43:return          
	}

	private void updateSubmitButton(boolean flag)
	{
		byte byte0;
		if(mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (flag || !mVoiceButtonEnabled))
	//*   0    0:aload_0         
	//*   1    1:getfield        #766 <Field boolean mSubmitButtonEnabled>
	//*   2    4:ifeq            37
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #903 <Method boolean isSubmitAreaEnabled()>
	//*   5   11:ifeq            37
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #911 <Method boolean hasFocus()>
	//*   8   18:ifeq            37
	//*   9   21:iload_1         
	//*  10   22:ifne            32
	//*  11   25:aload_0         
	//*  12   26:getfield        #768 <Field boolean mVoiceButtonEnabled>
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
	//   20   41:getfield        #267 <Field ImageView mGoButton>
	//   21   44:iload_2         
	//   22   45:invokevirtual   #840 <Method void ImageView.setVisibility(int)>
	//   23   48:return          
	}

	private void updateViewsVisibility(boolean flag)
	{
		mIconified = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #913 <Field boolean mIconified>
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
	//   15   24:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   16   27:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//   17   30:invokestatic    #826 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   18   33:iconst_1        
	//   19   34:ixor            
	//   20   35:istore          5
		mSearchButton.setVisibility(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:getfield        #262 <Field ImageView mSearchButton>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #840 <Method void ImageView.setVisibility(int)>
		updateSubmitButton(flag2);
	//   25   45:aload_0         
	//   26   46:iload           5
	//   27   48:invokespecial   #915 <Method void updateSubmitButton(boolean)>
		View view = mSearchEditFrame;
	//   28   51:aload_0         
	//   29   52:getfield        #245 <Field View mSearchEditFrame>
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
	//   40   72:invokevirtual   #907 <Method void View.setVisibility(int)>
		byte0 = byte1;
	//   41   75:iload_3         
	//   42   76:istore_2        
		if(mCollapsedIcon.getDrawable() != null)
	//*  43   77:aload_0         
	//*  44   78:getfield        #282 <Field ImageView mCollapsedIcon>
	//*  45   81:invokevirtual   #843 <Method Drawable ImageView.getDrawable()>
	//*  46   84:ifnull          101
			if(mIconifiedByDefault)
	//*  47   87:aload_0         
	//*  48   88:getfield        #483 <Field boolean mIconifiedByDefault>
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
	//   56  102:getfield        #282 <Field ImageView mCollapsedIcon>
	//   57  105:iload_2         
	//   58  106:invokevirtual   #840 <Method void ImageView.setVisibility(int)>
		updateCloseButton();
	//   59  109:aload_0         
	//   60  110:invokespecial   #917 <Method void updateCloseButton()>
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
	//   69  125:invokespecial   #920 <Method void updateVoiceButton(boolean)>
		updateSubmitArea();
	//   70  128:aload_0         
	//   71  129:invokespecial   #922 <Method void updateSubmitArea()>
	//   72  132:return          
	}

	private void updateVoiceButton(boolean flag)
	{
		byte byte0;
		if(mVoiceButtonEnabled && !isIconified() && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #768 <Field boolean mVoiceButtonEnabled>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #771 <Method boolean isIconified()>
	//*   5   11:ifne            32
	//*   6   14:iload_1         
	//*   7   15:ifeq            32
		{
			byte0 = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
			mGoButton.setVisibility(8);
	//   10   20:aload_0         
	//   11   21:getfield        #267 <Field ImageView mGoButton>
	//   12   24:bipush          8
	//   13   26:invokevirtual   #840 <Method void ImageView.setVisibility(int)>
		} else
	//*  14   29:goto            35
		{
			byte0 = 8;
	//   15   32:bipush          8
	//   16   34:istore_2        
		}
		mVoiceButton.setVisibility(((int) (byte0)));
	//   17   35:aload_0         
	//   18   36:getfield        #277 <Field ImageView mVoiceButton>
	//   19   39:iload_2         
	//   20   40:invokevirtual   #840 <Method void ImageView.setVisibility(int)>
	//   21   43:return          
	}

	void adjustDropDownSizeAndPosition()
	{
		if(mDropDownAnchor.getWidth() > 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #474 <Field View mDropDownAnchor>
	//*   2    4:invokevirtual   #676 <Method int View.getWidth()>
	//*   3    7:iconst_1        
	//*   4    8:icmple          159
		{
			Resources resources = getContext().getResources();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #610 <Method Context getContext()>
	//    7   15:invokevirtual   #718 <Method Resources Context.getResources()>
	//    8   18:astore          7
			int k = mSearchPlate.getPaddingLeft();
	//    9   20:aload_0         
	//   10   21:getfield        #250 <Field View mSearchPlate>
	//   11   24:invokevirtual   #926 <Method int View.getPaddingLeft()>
	//   12   27:istore_3        
			Rect rect = new Rect();
	//   13   28:new             #153 <Class Rect>
	//   14   31:dup             
	//   15   32:invokespecial   #154 <Method void Rect()>
	//   16   35:astore          8
			boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   17   37:aload_0         
	//   18   38:invokestatic    #932 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   19   41:istore          6
			int i;
			if(mIconifiedByDefault)
	//*  20   43:aload_0         
	//*  21   44:getfield        #483 <Field boolean mIconifiedByDefault>
	//*  22   47:ifeq            71
				i = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_text_padding_left);
	//   23   50:aload           7
	//   24   52:getstatic       #935 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_icon_width>
	//   25   55:invokevirtual   #726 <Method int Resources.getDimensionPixelSize(int)>
	//   26   58:aload           7
	//   27   60:getstatic       #938 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_text_padding_left>
	//   28   63:invokevirtual   #726 <Method int Resources.getDimensionPixelSize(int)>
	//   29   66:iadd            
	//   30   67:istore_1        
			else
	//*  31   68:goto            73
				i = 0;
	//   32   71:iconst_0        
	//   33   72:istore_1        
			mSearchSrcTextView.getDropDownBackground().getPadding(rect);
	//   34   73:aload_0         
	//   35   74:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   36   77:invokevirtual   #941 <Method Drawable SearchView$SearchAutoComplete.getDropDownBackground()>
	//   37   80:aload           8
	//   38   82:invokevirtual   #945 <Method boolean Drawable.getPadding(Rect)>
	//   39   85:pop             
			int j;
			if(flag)
	//*  40   86:iload           6
	//*  41   88:ifeq            101
				j = -rect.left;
	//   42   91:aload           8
	//   43   93:getfield        #948 <Field int Rect.left>
	//   44   96:ineg            
	//   45   97:istore_2        
			else
	//*  46   98:goto            111
				j = k - (rect.left + i);
	//   47  101:iload_3         
	//   48  102:aload           8
	//   49  104:getfield        #948 <Field int Rect.left>
	//   50  107:iload_1         
	//   51  108:iadd            
	//   52  109:isub            
	//   53  110:istore_2        
			mSearchSrcTextView.setDropDownHorizontalOffset(j);
	//   54  111:aload_0         
	//   55  112:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   56  115:iload_2         
	//   57  116:invokevirtual   #951 <Method void SearchView$SearchAutoComplete.setDropDownHorizontalOffset(int)>
			j = mDropDownAnchor.getWidth();
	//   58  119:aload_0         
	//   59  120:getfield        #474 <Field View mDropDownAnchor>
	//   60  123:invokevirtual   #676 <Method int View.getWidth()>
	//   61  126:istore_2        
			int l = rect.left;
	//   62  127:aload           8
	//   63  129:getfield        #948 <Field int Rect.left>
	//   64  132:istore          4
			int i1 = rect.right;
	//   65  134:aload           8
	//   66  136:getfield        #954 <Field int Rect.right>
	//   67  139:istore          5
			mSearchSrcTextView.setDropDownWidth((j + l + i1 + i) - k);
	//   68  141:aload_0         
	//   69  142:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   70  145:iload_2         
	//   71  146:iload           4
	//   72  148:iadd            
	//   73  149:iload           5
	//   74  151:iadd            
	//   75  152:iload_1         
	//   76  153:iadd            
	//   77  154:iload_3         
	//   78  155:isub            
	//   79  156:invokevirtual   #957 <Method void SearchView$SearchAutoComplete.setDropDownWidth(int)>
		}
	//   80  159:return          
	}

	public void clearFocus()
	{
		mClearingFocus = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #960 <Field boolean mClearingFocus>
		super.clearFocus();
	//    3    5:aload_0         
	//    4    6:invokespecial   #962 <Method void LinearLayoutCompat.clearFocus()>
		mSearchSrcTextView.clearFocus();
	//    5    9:aload_0         
	//    6   10:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    7   13:invokevirtual   #963 <Method void SearchView$SearchAutoComplete.clearFocus()>
		mSearchSrcTextView.setImeVisibility(false);
	//    8   16:aload_0         
	//    9   17:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #966 <Method void SearchView$SearchAutoComplete.setImeVisibility(boolean)>
		mClearingFocus = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #960 <Field boolean mClearingFocus>
	//   15   29:return          
	}

	void forceSuggestionQuery()
	{
		HIDDEN_METHOD_INVOKER.doBeforeTextChanged(((AutoCompleteTextView) (mSearchSrcTextView)));
	//    0    0:getstatic       #137 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//    1    3:aload_0         
	//    2    4:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    3    7:invokevirtual   #971 <Method void SearchView$AutoCompleteTextViewReflector.doBeforeTextChanged(AutoCompleteTextView)>
		HIDDEN_METHOD_INVOKER.doAfterTextChanged(((AutoCompleteTextView) (mSearchSrcTextView)));
	//    4   10:getstatic       #137 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//    5   13:aload_0         
	//    6   14:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    7   17:invokevirtual   #974 <Method void SearchView$AutoCompleteTextViewReflector.doAfterTextChanged(AutoCompleteTextView)>
	//    8   20:return          
	}

	public int getImeOptions()
	{
		return mSearchSrcTextView.getImeOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #975 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//    3    7:ireturn         
	}

	public int getInputType()
	{
		return mSearchSrcTextView.getInputType();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #976 <Method int SearchView$SearchAutoComplete.getInputType()>
	//    3    7:ireturn         
	}

	public int getMaxWidth()
	{
		return mMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #979 <Field int mMaxWidth>
	//    2    4:ireturn         
	}

	public CharSequence getQuery()
	{
		return ((CharSequence) (mSearchSrcTextView.getText()));
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:areturn         
	}

	public CharSequence getQueryHint()
	{
		Object obj = ((Object) (mQueryHint));
	//    0    0:aload_0         
	//    1    1:getfield        #418 <Field CharSequence mQueryHint>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((CharSequence) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		obj = ((Object) (mSearchable));
	//    7   11:aload_0         
	//    8   12:getfield        #522 <Field SearchableInfo mSearchable>
	//    9   15:astore_1        
		if(obj != null && ((SearchableInfo) (obj)).getHintId() != 0)
	//*  10   16:aload_1         
	//*  11   17:ifnull          42
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #984 <Method int SearchableInfo.getHintId()>
	//*  14   24:ifeq            42
			return getContext().getText(mSearchable.getHintId());
	//   15   27:aload_0         
	//   16   28:invokevirtual   #610 <Method Context getContext()>
	//   17   31:aload_0         
	//   18   32:getfield        #522 <Field SearchableInfo mSearchable>
	//   19   35:invokevirtual   #984 <Method int SearchableInfo.getHintId()>
	//   20   38:invokevirtual   #985 <Method CharSequence Context.getText(int)>
	//   21   41:areturn         
		else
			return mDefaultQueryHint;
	//   22   42:aload_0         
	//   23   43:getfield        #413 <Field CharSequence mDefaultQueryHint>
	//   24   46:areturn         
	}

	int getSuggestionCommitIconResId()
	{
		return mSuggestionCommitIconResId;
	//    0    0:aload_0         
	//    1    1:getfield        #353 <Field int mSuggestionCommitIconResId>
	//    2    4:ireturn         
	}

	int getSuggestionRowLayout()
	{
		return mSuggestionRowLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field int mSuggestionRowLayout>
	//    2    4:ireturn         
	}

	public CursorAdapter getSuggestionsAdapter()
	{
		return mSuggestionsAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//    2    4:areturn         
	}

	public boolean isIconified()
	{
		return mIconified;
	//    0    0:aload_0         
	//    1    1:getfield        #913 <Field boolean mIconified>
	//    2    4:ireturn         
	}

	void launchQuerySearch(int i, String s, String s1)
	{
		s = ((String) (createIntent("android.intent.action.SEARCH", ((Uri) (null)), ((String) (null)), s1, i, s)));
	//    0    0:aload_0         
	//    1    1:ldc2            #604 <String "android.intent.action.SEARCH">
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_3         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #583 <Method Intent createIntent(String, Uri, String, String, int, String)>
	//    8   12:astore_2        
		getContext().startActivity(((Intent) (s)));
	//    9   13:aload_0         
	//   10   14:invokevirtual   #610 <Method Context getContext()>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #775 <Method void Context.startActivity(Intent)>
	//   13   21:return          
	}

	public void onActionViewCollapsed()
	{
		setQuery("", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #859 <String "">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #996 <Method void setQuery(CharSequence, boolean)>
		clearFocus();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #997 <Method void clearFocus()>
		updateViewsVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
		mSearchSrcTextView.setImeOptions(mCollapsedImeOptions);
	//    9   17:aload_0         
	//   10   18:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   11   21:aload_0         
	//   12   22:getfield        #999 <Field int mCollapsedImeOptions>
	//   13   25:invokevirtual   #875 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		mExpandedInActionView = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #837 <Field boolean mExpandedInActionView>
	//   17   33:return          
	}

	public void onActionViewExpanded()
	{
		if(mExpandedInActionView)
	//*   0    0:aload_0         
	//*   1    1:getfield        #837 <Field boolean mExpandedInActionView>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mExpandedInActionView = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #837 <Field boolean mExpandedInActionView>
			mCollapsedImeOptions = mSearchSrcTextView.getImeOptions();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   18:invokevirtual   #975 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//   11   21:putfield        #999 <Field int mCollapsedImeOptions>
			mSearchSrcTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
	//   12   24:aload_0         
	//   13   25:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   14   28:aload_0         
	//   15   29:getfield        #999 <Field int mCollapsedImeOptions>
	//   16   32:ldc2            #1001 <Int 0x2000000>
	//   17   35:ior             
	//   18   36:invokevirtual   #875 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
			mSearchSrcTextView.setText("");
	//   19   39:aload_0         
	//   20   40:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   21   43:ldc2            #859 <String "">
	//   22   46:invokevirtual   #820 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			setIconified(false);
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #1004 <Method void setIconified(boolean)>
			return;
	//   26   54:return          
		}
	}

	void onCloseClicked()
	{
		if(TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//*   3    7:invokestatic    #826 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            48
		{
			if(mIconifiedByDefault)
	//*   5   13:aload_0         
	//*   6   14:getfield        #483 <Field boolean mIconifiedByDefault>
	//*   7   17:ifeq            74
			{
				OnCloseListener oncloselistener = mOnCloseListener;
	//    8   20:aload_0         
	//    9   21:getfield        #1007 <Field SearchView$OnCloseListener mOnCloseListener>
	//   10   24:astore_1        
				if(oncloselistener == null || !oncloselistener.onClose())
	//*  11   25:aload_1         
	//*  12   26:ifnull          38
	//*  13   29:aload_1         
	//*  14   30:invokeinterface #1010 <Method boolean SearchView$OnCloseListener.onClose()>
	//*  15   35:ifne            74
				{
					clearFocus();
	//   16   38:aload_0         
	//   17   39:invokevirtual   #997 <Method void clearFocus()>
					updateViewsVisibility(true);
	//   18   42:aload_0         
	//   19   43:iconst_1        
	//   20   44:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
					return;
	//   21   47:return          
				}
			}
		} else
		{
			mSearchSrcTextView.setText("");
	//   22   48:aload_0         
	//   23   49:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   24   52:ldc2            #859 <String "">
	//   25   55:invokevirtual   #820 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			mSearchSrcTextView.requestFocus();
	//   26   58:aload_0         
	//   27   59:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   28   62:invokevirtual   #1013 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//   29   65:pop             
			mSearchSrcTextView.setImeVisibility(true);
	//   30   66:aload_0         
	//   31   67:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   32   70:iconst_1        
	//   33   71:invokevirtual   #966 <Method void SearchView$SearchAutoComplete.setImeVisibility(boolean)>
		}
	//   34   74:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mUpdateDrawableStateRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #167 <Field Runnable mUpdateDrawableStateRunnable>
	//    3    5:invokevirtual   #1017 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(mReleaseCursorRunnable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #170 <Field Runnable mReleaseCursorRunnable>
	//    8   14:invokevirtual   #806 <Method boolean post(Runnable)>
	//    9   17:pop             
		super.onDetachedFromWindow();
	//   10   18:aload_0         
	//   11   19:invokespecial   #1019 <Method void LinearLayoutCompat.onDetachedFromWindow()>
	//   12   22:return          
	}

	boolean onItemClicked(int i, int j, String s)
	{
		s = ((String) (mOnSuggestionListener));
	//    0    0:aload_0         
	//    1    1:getfield        #1022 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//    2    4:astore_3        
		if(s != null && ((OnSuggestionListener) (s)).onSuggestionClick(i))
	//*   3    5:aload_3         
	//*   4    6:ifnull          24
	//*   5    9:aload_3         
	//*   6   10:iload_1         
	//*   7   11:invokeinterface #1025 <Method boolean SearchView$OnSuggestionListener.onSuggestionClick(int)>
	//*   8   16:ifne            22
	//*   9   19:goto            24
		{
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		} else
		{
			launchSuggestion(i, 0, ((String) (null)));
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:iconst_0        
	//   15   27:aconst_null     
	//   16   28:invokespecial   #1027 <Method boolean launchSuggestion(int, int, String)>
	//   17   31:pop             
			mSearchSrcTextView.setImeVisibility(false);
	//   18   32:aload_0         
	//   19   33:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #966 <Method void SearchView$SearchAutoComplete.setImeVisibility(boolean)>
			dismissSuggestions();
	//   22   40:aload_0         
	//   23   41:invokespecial   #1029 <Method void dismissSuggestions()>
			return true;
	//   24   44:iconst_1        
	//   25   45:ireturn         
		}
	}

	boolean onItemSelected(int i)
	{
		OnSuggestionListener onsuggestionlistener = mOnSuggestionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #1022 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//    2    4:astore_2        
		if(onsuggestionlistener != null && onsuggestionlistener.onSuggestionSelect(i))
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_2         
	//*   6   10:iload_1         
	//*   7   11:invokeinterface #1033 <Method boolean SearchView$OnSuggestionListener.onSuggestionSelect(int)>
	//*   8   16:ifne            22
	//*   9   19:goto            24
		{
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		} else
		{
			rewriteQueryFromSuggestion(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #1035 <Method void rewriteQueryFromSuggestion(int)>
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
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
	//    6    8:invokespecial   #1039 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		if(flag)
	//*   7   11:iload_1         
	//*   8   12:ifeq            109
		{
			getChildBoundsWithinSearchView(((View) (mSearchSrcTextView)), mSearchSrcTextViewBounds);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   12   20:aload_0         
	//   13   21:getfield        #156 <Field Rect mSearchSrcTextViewBounds>
	//   14   24:invokespecial   #1041 <Method void getChildBoundsWithinSearchView(View, Rect)>
			mSearchSrtTextViewBoundsExpanded.set(mSearchSrcTextViewBounds.left, 0, mSearchSrcTextViewBounds.right, l - j);
	//   15   27:aload_0         
	//   16   28:getfield        #158 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   17   31:aload_0         
	//   18   32:getfield        #156 <Field Rect mSearchSrcTextViewBounds>
	//   19   35:getfield        #948 <Field int Rect.left>
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #156 <Field Rect mSearchSrcTextViewBounds>
	//   23   43:getfield        #954 <Field int Rect.right>
	//   24   46:iload           5
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:invokevirtual   #683 <Method void Rect.set(int, int, int, int)>
			UpdatableTouchDelegate updatabletouchdelegate = mTouchDelegate;
	//   28   53:aload_0         
	//   29   54:getfield        #1043 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//   30   57:astore          6
			if(updatabletouchdelegate == null)
	//*  31   59:aload           6
	//*  32   61:ifnonnull       96
			{
				mTouchDelegate = new UpdatableTouchDelegate(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds, ((View) (mSearchSrcTextView)));
	//   33   64:aload_0         
	//   34   65:new             #50  <Class SearchView$UpdatableTouchDelegate>
	//   35   68:dup             
	//   36   69:aload_0         
	//   37   70:getfield        #158 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   38   73:aload_0         
	//   39   74:getfield        #156 <Field Rect mSearchSrcTextViewBounds>
	//   40   77:aload_0         
	//   41   78:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   42   81:invokespecial   #1046 <Method void SearchView$UpdatableTouchDelegate(Rect, Rect, View)>
	//   43   84:putfield        #1043 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
				setTouchDelegate(((TouchDelegate) (mTouchDelegate)));
	//   44   87:aload_0         
	//   45   88:aload_0         
	//   46   89:getfield        #1043 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//   47   92:invokevirtual   #1050 <Method void setTouchDelegate(TouchDelegate)>
				return;
	//   48   95:return          
			}
			updatabletouchdelegate.setBounds(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds);
	//   49   96:aload           6
	//   50   98:aload_0         
	//   51   99:getfield        #158 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   52  102:aload_0         
	//   53  103:getfield        #156 <Field Rect mSearchSrcTextViewBounds>
	//   54  106:invokevirtual   #1053 <Method void SearchView$UpdatableTouchDelegate.setBounds(Rect, Rect)>
		}
	//   55  109:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(isIconified())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #771 <Method boolean isIconified()>
	//*   2    4:ifeq            14
		{
			super.onMeasure(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1057 <Method void LinearLayoutCompat.onMeasure(int, int)>
			return;
	//    7   13:return          
		}
		int l = android.view.View.MeasureSpec.getMode(i);
	//    8   14:iload_1         
	//    9   15:invokestatic    #1062 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   18:istore          4
		int k = android.view.View.MeasureSpec.getSize(i);
	//   11   20:iload_1         
	//   12   21:invokestatic    #1065 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   24:istore_3        
		if(l != 0x80000000)
	//*  14   25:iload           4
	//*  15   27:ldc2            #1066 <Int 0x80000000>
	//*  16   30:icmpeq          94
		{
			if(l != 0)
	//*  17   33:iload           4
	//*  18   35:ifeq            74
			{
				if(l != 0x40000000)
	//*  19   38:iload           4
	//*  20   40:ldc2            #611 <Int 0x40000000>
	//*  21   43:icmpeq          51
				{
					i = k;
	//   22   46:iload_3         
	//   23   47:istore_1        
				} else
	//*  24   48:goto            121
				{
					int i1 = mMaxWidth;
	//   25   51:aload_0         
	//   26   52:getfield        #979 <Field int mMaxWidth>
	//   27   55:istore          4
					i = k;
	//   28   57:iload_3         
	//   29   58:istore_1        
					if(i1 > 0)
	//*  30   59:iload           4
	//*  31   61:ifle            121
						i = Math.min(i1, k);
	//   32   64:iload           4
	//   33   66:iload_3         
	//   34   67:invokestatic    #1071 <Method int Math.min(int, int)>
	//   35   70:istore_1        
				}
			} else
	//*  36   71:goto            121
			{
				i = mMaxWidth;
	//   37   74:aload_0         
	//   38   75:getfield        #979 <Field int mMaxWidth>
	//   39   78:istore_1        
				if(i <= 0)
	//*  40   79:iload_1         
	//*  41   80:ifle            86
	//*  42   83:goto            121
					i = getPreferredWidth();
	//   43   86:aload_0         
	//   44   87:invokespecial   #1073 <Method int getPreferredWidth()>
	//   45   90:istore_1        
			}
		} else
	//*  46   91:goto            121
		{
			i = mMaxWidth;
	//   47   94:aload_0         
	//   48   95:getfield        #979 <Field int mMaxWidth>
	//   49   98:istore_1        
			if(i > 0)
	//*  50   99:iload_1         
	//*  51  100:ifle            112
				i = Math.min(i, k);
	//   52  103:iload_1         
	//   53  104:iload_3         
	//   54  105:invokestatic    #1071 <Method int Math.min(int, int)>
	//   55  108:istore_1        
			else
	//*  56  109:goto            121
				i = Math.min(getPreferredWidth(), k);
	//   57  112:aload_0         
	//   58  113:invokespecial   #1073 <Method int getPreferredWidth()>
	//   59  116:iload_3         
	//   60  117:invokestatic    #1071 <Method int Math.min(int, int)>
	//   61  120:istore_1        
		}
		k = android.view.View.MeasureSpec.getMode(j);
	//   62  121:iload_2         
	//   63  122:invokestatic    #1062 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   64  125:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//   65  126:iload_2         
	//   66  127:invokestatic    #1065 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   67  130:istore_2        
		if(k != 0x80000000)
	//*  68  131:iload_3         
	//*  69  132:ldc2            #1066 <Int 0x80000000>
	//*  70  135:icmpeq          153
		{
			if(k == 0)
	//*  71  138:iload_3         
	//*  72  139:ifeq            145
	//*  73  142:goto            162
				j = getPreferredHeight();
	//   74  145:aload_0         
	//   75  146:invokespecial   #1075 <Method int getPreferredHeight()>
	//   76  149:istore_2        
		} else
	//*  77  150:goto            162
		{
			j = Math.min(getPreferredHeight(), j);
	//   78  153:aload_0         
	//   79  154:invokespecial   #1075 <Method int getPreferredHeight()>
	//   80  157:iload_2         
	//   81  158:invokestatic    #1071 <Method int Math.min(int, int)>
	//   82  161:istore_2        
		}
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
	//   83  162:aload_0         
	//   84  163:iload_1         
	//   85  164:ldc2            #611 <Int 0x40000000>
	//   86  167:invokestatic    #1078 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   87  170:iload_2         
	//   88  171:ldc2            #611 <Int 0x40000000>
	//   89  174:invokestatic    #1078 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   90  177:invokespecial   #1057 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   91  180:return          
	}

	void onQueryRefine(CharSequence charsequence)
	{
		setQuery(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #817 <Method void setQuery(CharSequence)>
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
	//    5    9:invokespecial   #1083 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #1087 <Method Parcelable SearchView$SavedState.getSuperState()>
	//   13   23:invokespecial   #1083 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			updateViewsVisibility(((SavedState) (parcelable)).isIconified);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #1089 <Field boolean SearchView$SavedState.isIconified>
	//   17   31:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
			requestLayout();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #1092 <Method void requestLayout()>
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
	//    3    5:invokespecial   #1095 <Method Parcelable LinearLayoutCompat.onSaveInstanceState()>
	//    4    8:invokespecial   #1097 <Method void SearchView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.isIconified = isIconified();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #771 <Method boolean isIconified()>
	//    9   17:putfield        #1089 <Field boolean SearchView$SavedState.isIconified>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	void onSearchClicked()
	{
		updateViewsVisibility(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
		mSearchSrcTextView.requestFocus();
	//    3    5:aload_0         
	//    4    6:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:invokevirtual   #1013 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//    6   12:pop             
		mSearchSrcTextView.setImeVisibility(true);
	//    7   13:aload_0         
	//    8   14:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #966 <Method void SearchView$SearchAutoComplete.setImeVisibility(boolean)>
		android.view.View.OnClickListener onclicklistener = mOnSearchClickListener;
	//   11   21:aload_0         
	//   12   22:getfield        #1100 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//   13   25:astore_1        
		if(onclicklistener != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          37
			onclicklistener.onClick(((View) (this)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokeinterface #1106 <Method void android.view.View$OnClickListener.onClick(View)>
	//   19   37:return          
	}

	void onSubmitQuery()
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_1        
		if(editable != null && TextUtils.getTrimmedLength(((CharSequence) (editable))) > 0)
	//*   4    8:aload_1         
	//*   5    9:ifnull          74
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #1111 <Method int TextUtils.getTrimmedLength(CharSequence)>
	//*   8   16:ifle            74
		{
			OnQueryTextListener onquerytextlistener = mOnQueryChangeListener;
	//    9   19:aload_0         
	//   10   20:getfield        #1113 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//   11   23:astore_2        
			if(onquerytextlistener == null || !onquerytextlistener.onQueryTextSubmit(((CharSequence) (editable)).toString()))
	//*  12   24:aload_2         
	//*  13   25:ifnull          43
	//*  14   28:aload_2         
	//*  15   29:aload_1         
	//*  16   30:invokeinterface #1114 <Method String CharSequence.toString()>
	//*  17   35:invokeinterface #1118 <Method boolean SearchView$OnQueryTextListener.onQueryTextSubmit(String)>
	//*  18   40:ifne            74
			{
				if(mSearchable != null)
	//*  19   43:aload_0         
	//*  20   44:getfield        #522 <Field SearchableInfo mSearchable>
	//*  21   47:ifnull          62
					launchQuerySearch(0, ((String) (null)), ((CharSequence) (editable)).toString());
	//   22   50:aload_0         
	//   23   51:iconst_0        
	//   24   52:aconst_null     
	//   25   53:aload_1         
	//   26   54:invokeinterface #1114 <Method String CharSequence.toString()>
	//   27   59:invokevirtual   #1120 <Method void launchQuerySearch(int, String, String)>
				mSearchSrcTextView.setImeVisibility(false);
	//   28   62:aload_0         
	//   29   63:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   30   66:iconst_0        
	//   31   67:invokevirtual   #966 <Method void SearchView$SearchAutoComplete.setImeVisibility(boolean)>
				dismissSuggestions();
	//   32   70:aload_0         
	//   33   71:invokespecial   #1029 <Method void dismissSuggestions()>
			}
		}
	//   34   74:return          
	}

	boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
	{
		if(mSearchable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #522 <Field SearchableInfo mSearchable>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(mSuggestionsAdapter == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//*   7   13:ifnonnull       18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(keyevent.getAction() == 0 && keyevent.hasNoModifiers())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #1127 <Method int KeyEvent.getAction()>
	//*  12   22:ifne            155
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #1130 <Method boolean KeyEvent.hasNoModifiers()>
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
	//*  37   75:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*  38   78:invokevirtual   #1133 <Method int SearchView$SearchAutoComplete.getListSelection()>
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
	//   49   98:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   50  101:invokevirtual   #1134 <Method int SearchView$SearchAutoComplete.length()>
	//   51  104:istore_2        
					mSearchSrcTextView.setSelection(i);
	//   52  105:aload_0         
	//   53  106:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   54  109:iload_2         
	//   55  110:invokevirtual   #834 <Method void SearchView$SearchAutoComplete.setSelection(int)>
					mSearchSrcTextView.setListSelection(0);
	//   56  113:aload_0         
	//   57  114:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   58  117:iconst_0        
	//   59  118:invokevirtual   #1137 <Method void SearchView$SearchAutoComplete.setListSelection(int)>
					mSearchSrcTextView.clearListSelection();
	//   60  121:aload_0         
	//   61  122:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   62  125:invokevirtual   #1140 <Method void SearchView$SearchAutoComplete.clearListSelection()>
					HIDDEN_METHOD_INVOKER.ensureImeVisible(((AutoCompleteTextView) (mSearchSrcTextView)), true);
	//   63  128:getstatic       #137 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//   64  131:aload_0         
	//   65  132:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   66  135:iconst_1        
	//   67  136:invokevirtual   #1144 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
					return true;
	//   68  139:iconst_1        
	//   69  140:ireturn         
				}
			} else
			{
				return onItemClicked(mSearchSrcTextView.getListSelection(), 0, ((String) (null)));
	//   70  141:aload_0         
	//   71  142:aload_0         
	//   72  143:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   73  146:invokevirtual   #1133 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//   74  149:iconst_0        
	//   75  150:aconst_null     
	//   76  151:invokevirtual   #1146 <Method boolean onItemClicked(int, int, String)>
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
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #810 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore          4
		mUserQuery = ((CharSequence) (editable));
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:putfield        #499 <Field CharSequence mUserQuery>
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (editable)));
	//    7   15:aload           4
	//    8   17:invokestatic    #826 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//   18   29:invokespecial   #915 <Method void updateSubmitButton(boolean)>
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
	//   26   43:invokespecial   #920 <Method void updateVoiceButton(boolean)>
		updateCloseButton();
	//   27   46:aload_0         
	//   28   47:invokespecial   #917 <Method void updateCloseButton()>
		updateSubmitArea();
	//   29   50:aload_0         
	//   30   51:invokespecial   #922 <Method void updateSubmitArea()>
		if(mOnQueryChangeListener != null && !TextUtils.equals(charsequence, mOldQueryText))
	//*  31   54:aload_0         
	//*  32   55:getfield        #1113 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  33   58:ifnull          88
	//*  34   61:aload_1         
	//*  35   62:aload_0         
	//*  36   63:getfield        #1149 <Field CharSequence mOldQueryText>
	//*  37   66:invokestatic    #1153 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  38   69:ifne            88
			mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
	//   39   72:aload_0         
	//   40   73:getfield        #1113 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//   41   76:aload_1         
	//   42   77:invokeinterface #1114 <Method String CharSequence.toString()>
	//   43   82:invokeinterface #1156 <Method boolean SearchView$OnQueryTextListener.onQueryTextChange(String)>
	//   44   87:pop             
		mOldQueryText = ((CharSequence) (charsequence.toString()));
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokeinterface #1114 <Method String CharSequence.toString()>
	//   48   95:putfield        #1149 <Field CharSequence mOldQueryText>
	//   49   98:return          
	}

	void onTextFocusChanged()
	{
		updateViewsVisibility(isIconified());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #771 <Method boolean isIconified()>
	//    3    5:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
		postUpdateFocusedState();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1159 <Method void postUpdateFocusedState()>
		if(mSearchSrcTextView.hasFocus())
	//*   6   12:aload_0         
	//*   7   13:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   8   16:invokevirtual   #1160 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   9   19:ifeq            26
			forceSuggestionQuery();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #1162 <Method void forceSuggestionQuery()>
	//   12   26:return          
	}

	void onVoiceClicked()
	{
		Object obj;
		obj = ((Object) (mSearchable));
	//    0    0:aload_0         
	//    1    1:getfield        #522 <Field SearchableInfo mSearchable>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #738 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*   8   14:ifeq            36
		{
			obj = ((Object) (createVoiceWebSearchIntent(mVoiceWebSearchIntent, ((SearchableInfo) (obj)))));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #451 <Field Intent mVoiceWebSearchIntent>
	//   12   22:aload_1         
	//   13   23:invokespecial   #1167 <Method Intent createVoiceWebSearchIntent(Intent, SearchableInfo)>
	//   14   26:astore_1        
			getContext().startActivity(((Intent) (obj)));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #610 <Method Context getContext()>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #775 <Method void Context.startActivity(Intent)>
			return;
	//   19   35:return          
		}
		ActivityNotFoundException activitynotfoundexception;
		try
		{
			if(((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer())
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #741 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  22   40:ifeq            72
			{
				obj = ((Object) (createVoiceAppSearchIntent(mVoiceAppSearchIntent, ((SearchableInfo) (obj)))));
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #468 <Field Intent mVoiceAppSearchIntent>
	//   26   48:aload_1         
	//   27   49:invokespecial   #1169 <Method Intent createVoiceAppSearchIntent(Intent, SearchableInfo)>
	//   28   52:astore_1        
				getContext().startActivity(((Intent) (obj)));
	//   29   53:aload_0         
	//   30   54:invokevirtual   #610 <Method Context getContext()>
	//   31   57:aload_1         
	//   32   58:invokevirtual   #775 <Method void Context.startActivity(Intent)>
				return;
	//   33   61:return          
			}
		}
	//*  34   62:ldc2            #596 <String "SearchView">
	//*  35   65:ldc2            #1171 <String "Could not find voice search activity">
	//*  36   68:invokestatic    #1174 <Method int Log.w(String, String)>
	//*  37   71:pop             
	//*  38   72:return          
		// Misplaced declaration of an exception variable
		catch(ActivityNotFoundException activitynotfoundexception)
		{
			Log.w("SearchView", "Could not find voice search activity");
		}
		return;
	//*  39   73:astore_1        
	//*  40   74:goto            62
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1177 <Method void LinearLayoutCompat.onWindowFocusChanged(boolean)>
		postUpdateFocusedState();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1159 <Method void postUpdateFocusedState()>
	//    5    9:return          
	}

	public boolean requestFocus(int i, Rect rect)
	{
		if(mClearingFocus)
	//*   0    0:aload_0         
	//*   1    1:getfield        #960 <Field boolean mClearingFocus>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!isFocusable())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #1181 <Method boolean isFocusable()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(!isIconified())
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #771 <Method boolean isIconified()>
	//*  12   22:ifne            46
		{
			boolean flag = mSearchSrcTextView.requestFocus(i, rect);
	//   13   25:aload_0         
	//   14   26:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   15   29:iload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #1183 <Method boolean SearchView$SearchAutoComplete.requestFocus(int, Rect)>
	//   18   34:istore_3        
			if(flag)
	//*  19   35:iload_3         
	//*  20   36:ifeq            44
				updateViewsVisibility(false);
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
			return flag;
	//   24   44:iload_3         
	//   25   45:ireturn         
		} else
		{
			return super.requestFocus(i, rect);
	//   26   46:aload_0         
	//   27   47:iload_1         
	//   28   48:aload_2         
	//   29   49:invokespecial   #1184 <Method boolean LinearLayoutCompat.requestFocus(int, Rect)>
	//   30   52:ireturn         
		}
	}

	public void setAppSearchData(Bundle bundle)
	{
		mAppSearchData = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #508 <Field Bundle mAppSearchData>
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
	//    3    5:invokevirtual   #1192 <Method void onCloseClicked()>
			return;
	//    4    8:return          
		} else
		{
			onSearchClicked();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1194 <Method void onSearchClicked()>
			return;
	//    7   13:return          
		}
	}

	public void setIconifiedByDefault(boolean flag)
	{
		if(mIconifiedByDefault == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #483 <Field boolean mIconifiedByDefault>
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
	//    7   11:putfield        #483 <Field boolean mIconifiedByDefault>
			updateViewsVisibility(flag);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
			updateQueryHint();
	//   11   19:aload_0         
	//   12   20:invokespecial   #489 <Method void updateQueryHint()>
			return;
	//   13   23:return          
		}
	}

	public void setImeOptions(int i)
	{
		mSearchSrcTextView.setImeOptions(i);
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #875 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
	//    4    8:return          
	}

	public void setInputType(int i)
	{
		mSearchSrcTextView.setInputType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #884 <Method void SearchView$SearchAutoComplete.setInputType(int)>
	//    4    8:return          
	}

	public void setMaxWidth(int i)
	{
		mMaxWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #979 <Field int mMaxWidth>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1092 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setOnCloseListener(OnCloseListener oncloselistener)
	{
		mOnCloseListener = oncloselistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1007 <Field SearchView$OnCloseListener mOnCloseListener>
	//    3    5:return          
	}

	public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
	{
		mOnQueryTextFocusChangeListener = onfocuschangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1199 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
	//    3    5:return          
	}

	public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
	{
		mOnQueryChangeListener = onquerytextlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1113 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//    3    5:return          
	}

	public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
	{
		mOnSearchClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1100 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//    3    5:return          
	}

	public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
	{
		mOnSuggestionListener = onsuggestionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1022 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//    3    5:return          
	}

	public void setQuery(CharSequence charsequence, boolean flag)
	{
		mSearchSrcTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #820 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		if(charsequence != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          30
		{
			SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    6   12:aload_0         
	//    7   13:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    8   16:astore_3        
			searchautocomplete.setSelection(searchautocomplete.length());
	//    9   17:aload_3         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #1134 <Method int SearchView$SearchAutoComplete.length()>
	//   12   22:invokevirtual   #834 <Method void SearchView$SearchAutoComplete.setSelection(int)>
			mUserQuery = charsequence;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #499 <Field CharSequence mUserQuery>
		}
		if(flag && !TextUtils.isEmpty(charsequence))
	//*  16   30:iload_2         
	//*  17   31:ifeq            45
	//*  18   34:aload_1         
	//*  19   35:invokestatic    #826 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   38:ifne            45
			onSubmitQuery();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #1206 <Method void onSubmitQuery()>
	//   23   45:return          
	}

	public void setQueryHint(CharSequence charsequence)
	{
		mQueryHint = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #418 <Field CharSequence mQueryHint>
		updateQueryHint();
	//    3    5:aload_0         
	//    4    6:invokespecial   #489 <Method void updateQueryHint()>
	//    5    9:return          
	}

	public void setQueryRefinementEnabled(boolean flag)
	{
		mQueryRefinement = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #897 <Field boolean mQueryRefinement>
		Object obj = ((Object) (mSuggestionsAdapter));
	//    3    5:aload_0         
	//    4    6:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//    5    9:astore_3        
		if(obj instanceof SuggestionsAdapter)
	//*   6   10:aload_3         
	//*   7   11:instanceof      #540 <Class SuggestionsAdapter>
	//*   8   14:ifeq            38
		{
			obj = ((Object) ((SuggestionsAdapter)obj));
	//    9   17:aload_3         
	//   10   18:checkcast       #540 <Class SuggestionsAdapter>
	//   11   21:astore_3        
			byte byte0;
			if(flag)
	//*  12   22:iload_1         
	//*  13   23:ifeq            31
				byte0 = 2;
	//   14   26:iconst_2        
	//   15   27:istore_2        
			else
	//*  16   28:goto            33
				byte0 = 1;
	//   17   31:iconst_1        
	//   18   32:istore_2        
			((SuggestionsAdapter) (obj)).setQueryRefinement(((int) (byte0)));
	//   19   33:aload_3         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #900 <Method void SuggestionsAdapter.setQueryRefinement(int)>
		}
	//   22   38:return          
	}

	public void setSearchableInfo(SearchableInfo searchableinfo)
	{
		mSearchable = searchableinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #522 <Field SearchableInfo mSearchable>
		if(mSearchable != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #522 <Field SearchableInfo mSearchable>
	//*   5    9:ifnull          20
		{
			updateSearchAutoComplete();
	//    6   12:aload_0         
	//    7   13:invokespecial   #1213 <Method void updateSearchAutoComplete()>
			updateQueryHint();
	//    8   16:aload_0         
	//    9   17:invokespecial   #489 <Method void updateQueryHint()>
		}
		mVoiceButtonEnabled = hasVoiceSearch();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #1215 <Method boolean hasVoiceSearch()>
	//   13   25:putfield        #768 <Field boolean mVoiceButtonEnabled>
		if(mVoiceButtonEnabled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #768 <Field boolean mVoiceButtonEnabled>
	//*  16   32:ifeq            45
			mSearchSrcTextView.setPrivateImeOptions("nm");
	//   17   35:aload_0         
	//   18   36:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   19   39:ldc2            #1217 <String "nm">
	//   20   42:invokevirtual   #1220 <Method void SearchView$SearchAutoComplete.setPrivateImeOptions(String)>
		updateViewsVisibility(isIconified());
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:invokevirtual   #771 <Method boolean isIconified()>
	//   24   50:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
	//   25   53:return          
	}

	public void setSubmitButtonEnabled(boolean flag)
	{
		mSubmitButtonEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #766 <Field boolean mSubmitButtonEnabled>
		updateViewsVisibility(isIconified());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #771 <Method boolean isIconified()>
	//    6   10:invokespecial   #486 <Method void updateViewsVisibility(boolean)>
	//    7   13:return          
	}

	public void setSuggestionsAdapter(CursorAdapter cursoradapter)
	{
		mSuggestionsAdapter = cursoradapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #787 <Field CursorAdapter mSuggestionsAdapter>
		mSearchSrcTextView.setAdapter(((android.widget.ListAdapter) (mSuggestionsAdapter)));
	//    3    5:aload_0         
	//    4    6:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:aload_0         
	//    6   10:getfield        #787 <Field CursorAdapter mSuggestionsAdapter>
	//    7   13:invokevirtual   #895 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
	//    8   16:return          
	}

	void updateFocusedState()
	{
		int ai[];
		if(mSearchSrcTextView.hasFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #1160 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   3    7:ifeq            17
			ai = FOCUSED_STATE_SET;
	//    4   10:getstatic       #1227 <Field int[] FOCUSED_STATE_SET>
	//    5   13:astore_1        
		else
	//*   6   14:goto            21
			ai = EMPTY_STATE_SET;
	//    7   17:getstatic       #849 <Field int[] EMPTY_STATE_SET>
	//    8   20:astore_1        
		Drawable drawable = mSearchPlate.getBackground();
	//    9   21:aload_0         
	//   10   22:getfield        #250 <Field View mSearchPlate>
	//   11   25:invokevirtual   #1230 <Method Drawable View.getBackground()>
	//   12   28:astore_2        
		if(drawable != null)
	//*  13   29:aload_2         
	//*  14   30:ifnull          39
			drawable.setState(ai);
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #853 <Method boolean Drawable.setState(int[])>
	//   18   38:pop             
		drawable = mSubmitArea.getBackground();
	//   19   39:aload_0         
	//   20   40:getfield        #255 <Field View mSubmitArea>
	//   21   43:invokevirtual   #1230 <Method Drawable View.getBackground()>
	//   22   46:astore_2        
		if(drawable != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          57
			drawable.setState(ai);
	//   25   51:aload_2         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #853 <Method boolean Drawable.setState(int[])>
	//   28   56:pop             
		invalidate();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #1233 <Method void invalidate()>
	//   31   61:return          
	}

	static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
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
		//*  27   57:invokevirtual   #44  <Method boolean SearchView$SearchAutoComplete.isEmpty()>
		//*  28   60:ifne            111
		//*  29   63:aload_3         
		//*  30   64:invokevirtual   #49  <Method boolean KeyEvent.hasNoModifiers()>
		//*  31   67:ifeq            111
		//*  32   70:aload_3         
		//*  33   71:invokevirtual   #52  <Method int KeyEvent.getAction()>
		//*  34   74:iconst_1        
		//*  35   75:icmpne          111
		//*  36   78:iload_2         
		//*  37   79:bipush          66
		//*  38   81:icmpne          111
			{
				view.cancelLongPress();
		//   39   84:aload_1         
		//   40   85:invokevirtual   #57  <Method void View.cancelLongPress()>
				view = ((View) (SearchView.this));
		//   41   88:aload_0         
		//   42   89:getfield        #14  <Field SearchView this$0>
		//   43   92:astore_1        
				((SearchView) (view)).launchQuerySearch(0, ((String) (null)), ((Object) (((SearchView) (view)).mSearchSrcTextView.getText())).toString());
		//   44   93:aload_1         
		//   45   94:iconst_0        
		//   46   95:aconst_null     
		//   47   96:aload_1         
		//   48   97:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
		//   49  100:invokevirtual   #61  <Method Editable SearchView$SearchAutoComplete.getText()>
		//   50  103:invokevirtual   #65  <Method String Object.toString()>
		//   51  106:invokevirtual   #69  <Method void SearchView.launchQuerySearch(int, String, String)>
				return true;
		//   52  109:iconst_1        
		//   53  110:ireturn         
			} else
			{
				return false;
		//   54  111:iconst_0        
		//   55  112:ireturn         
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
	//    2    4:invokespecial   #135 <Method void SearchView$AutoCompleteTextViewReflector()>
	//    3    7:putstatic       #137 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
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
		//    2    4:invokevirtual   #25  <Method void SearchView$SearchAutoComplete.showSoftInputIfNecessary()>
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
