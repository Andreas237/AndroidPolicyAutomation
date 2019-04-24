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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.view.CollapsibleActionView;
import android.text.*;
import android.text.style.ImageSpan;
import android.util.*;
import android.view.*;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, TintTypedArray, SuggestionsAdapter, ViewUtils, 
//			AppCompatAutoCompleteTextView

public class SearchView extends LinearLayoutCompat
	implements CollapsibleActionView
{
	static class AutoCompleteTextViewReflector
	{

		void doAfterTextChanged(AutoCompleteTextView autocompletetextview)
		{
			if(doAfterTextChanged != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field Method doAfterTextChanged>
		//*   2    4:ifnull          22
				try
				{
					doAfterTextChanged.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field Method doAfterTextChanged>
		//    5   11:aload_1         
		//    6   12:iconst_0        
		//    7   13:anewarray       Object[]
		//    8   16:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
		//    9   19:pop             
					return;
		//   10   20:return          
				}
				// Misplaced declaration of an exception variable
				catch(AutoCompleteTextView autocompletetextview) { }
		//   11   21:astore_1        
		//   12   22:return          
		}

		void doBeforeTextChanged(AutoCompleteTextView autocompletetextview)
		{
			if(doBeforeTextChanged != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field Method doBeforeTextChanged>
		//*   2    4:ifnull          22
				try
				{
					doBeforeTextChanged.invoke(((Object) (autocompletetextview)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field Method doBeforeTextChanged>
		//    5   11:aload_1         
		//    6   12:iconst_0        
		//    7   13:anewarray       Object[]
		//    8   16:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
		//    9   19:pop             
					return;
		//   10   20:return          
				}
				// Misplaced declaration of an exception variable
				catch(AutoCompleteTextView autocompletetextview) { }
		//   11   21:astore_1        
		//   12   22:return          
		}

		void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
		{
			if(ensureImeVisible != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #50  <Field Method ensureImeVisible>
		//*   2    4:ifnull          29
				try
				{
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
		//   11   19:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
		//   12   22:aastore         
		//   13   23:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
		//   14   26:pop             
					return;
		//   15   27:return          
				}
				// Misplaced declaration of an exception variable
				catch(AutoCompleteTextView autocompletetextview) { }
		//   16   28:astore_1        
		//   17   29:return          
		}

		void showSoftInputUnchecked(InputMethodManager inputmethodmanager, View view, int i)
		{
			if(showSoftInputUnchecked != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field Method showSoftInputUnchecked>
		//*   2    4:ifnull          34
				try
				{
					showSoftInputUnchecked.invoke(((Object) (inputmethodmanager)), new Object[] {
						Integer.valueOf(i), null
					});
		//    3    7:aload_0         
		//    4    8:getfield        #60  <Field Method showSoftInputUnchecked>
		//    5   11:aload_1         
		//    6   12:iconst_2        
		//    7   13:anewarray       Object[]
		//    8   16:dup             
		//    9   17:iconst_0        
		//   10   18:iload_3         
		//   11   19:invokestatic    #77  <Method Integer Integer.valueOf(int)>
		//   12   22:aastore         
		//   13   23:dup             
		//   14   24:iconst_1        
		//   15   25:aconst_null     
		//   16   26:aastore         
		//   17   27:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
		//   18   30:pop             
					return;
		//   19   31:return          
				}
				catch(Exception exception) { }
		//   20   32:astore          4
			inputmethodmanager.showSoftInput(view, i);
		//   21   34:aload_1         
		//   22   35:aload_2         
		//   23   36:iload_3         
		//   24   37:invokevirtual   #81  <Method boolean InputMethodManager.showSoftInput(View, int)>
		//   25   40:pop             
		//   26   41:return          
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
		//*  13   27:goto            31
			catch(NoSuchMethodException nosuchmethodexception) { }
		//   14   30:astore_1        
			try
			{
				doAfterTextChanged = ((Class) (android/widget/AutoCompleteTextView)).getDeclaredMethod("doAfterTextChanged", new Class[0]);
		//   15   31:aload_0         
		//   16   32:ldc1            #20  <Class AutoCompleteTextView>
		//   17   34:ldc1            #36  <String "doAfterTextChanged">
		//   18   36:iconst_0        
		//   19   37:anewarray       Class[]
		//   20   40:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   21   43:putfield        #38  <Field Method doAfterTextChanged>
				doAfterTextChanged.setAccessible(true);
		//   22   46:aload_0         
		//   23   47:getfield        #38  <Field Method doAfterTextChanged>
		//   24   50:iconst_1        
		//   25   51:invokevirtual   #35  <Method void Method.setAccessible(boolean)>
			}
		//*  26   54:goto            58
			catch(NoSuchMethodException nosuchmethodexception1) { }
		//   27   57:astore_1        
			try
			{
				ensureImeVisible = ((Class) (android/widget/AutoCompleteTextView)).getMethod("ensureImeVisible", new Class[] {
					Boolean.TYPE
				});
		//   28   58:aload_0         
		//   29   59:ldc1            #20  <Class AutoCompleteTextView>
		//   30   61:ldc1            #39  <String "ensureImeVisible">
		//   31   63:iconst_1        
		//   32   64:anewarray       Class[]
		//   33   67:dup             
		//   34   68:iconst_0        
		//   35   69:getstatic       #45  <Field Class Boolean.TYPE>
		//   36   72:aastore         
		//   37   73:invokevirtual   #48  <Method Method Class.getMethod(String, Class[])>
		//   38   76:putfield        #50  <Field Method ensureImeVisible>
				ensureImeVisible.setAccessible(true);
		//   39   79:aload_0         
		//   40   80:getfield        #50  <Field Method ensureImeVisible>
		//   41   83:iconst_1        
		//   42   84:invokevirtual   #35  <Method void Method.setAccessible(boolean)>
			}
		//*  43   87:goto            91
			catch(NoSuchMethodException nosuchmethodexception2) { }
		//   44   90:astore_1        
			try
			{
				showSoftInputUnchecked = ((Class) (android/view/inputmethod/InputMethodManager)).getMethod("showSoftInputUnchecked", new Class[] {
					Integer.TYPE, android/os/ResultReceiver
				});
		//   45   91:aload_0         
		//   46   92:ldc1            #52  <Class InputMethodManager>
		//   47   94:ldc1            #53  <String "showSoftInputUnchecked">
		//   48   96:iconst_2        
		//   49   97:anewarray       Class[]
		//   50  100:dup             
		//   51  101:iconst_0        
		//   52  102:getstatic       #56  <Field Class Integer.TYPE>
		//   53  105:aastore         
		//   54  106:dup             
		//   55  107:iconst_1        
		//   56  108:ldc1            #58  <Class ResultReceiver>
		//   57  110:aastore         
		//   58  111:invokevirtual   #48  <Method Method Class.getMethod(String, Class[])>
		//   59  114:putfield        #60  <Field Method showSoftInputUnchecked>
				showSoftInputUnchecked.setAccessible(true);
		//   60  117:aload_0         
		//   61  118:getfield        #60  <Field Method showSoftInputUnchecked>
		//   62  121:iconst_1        
		//   63  122:invokevirtual   #35  <Method void Method.setAccessible(boolean)>
				return;
		//   64  125:return          
			}
			catch(NoSuchMethodException nosuchmethodexception3)
		//*  65  126:astore_1        
			{
				return;
		//   66  127:return          
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
			return (new StringBuilder()).append("SearchView.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" isIconified=").append(isIconified).append("}").toString();
		//    0    0:new             #52  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #53  <Method void StringBuilder()>
		//    3    7:ldc1            #55  <String "SearchView.SavedState{">
		//    4    9:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #65  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #71  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #73  <String " isIconified=">
		//   10   24:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #45  <Field boolean isIconified>
		//   13   31:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
		//   14   34:ldc1            #78  <String "}">
		//   15   36:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #84  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeValue(((Object) (Boolean.valueOf(isIconified))));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #45  <Field boolean isIconified>
		//    7   11:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
		//    8   14:invokevirtual   #92  <Method void Parcel.writeValue(Object)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

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

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #25  <Method SearchView$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #30  <Method SearchView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
);
		boolean isIconified;

		static 
		{
		//    0    0:new             #9   <Class SearchView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void SearchView$SavedState$1()>
		//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
			isIconified = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #37  <Method Object Parcel.readValue(ClassLoader)>
		//    8   12:checkcast       #39  <Class Boolean>
		//    9   15:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
		//   10   18:putfield        #45  <Field boolean isIconified>
		//   11   21:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static class SearchAutoComplete extends AppCompatAutoCompleteTextView
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
		//    1    1:invokevirtual   #68  <Method Editable getText()>
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
				((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(((View) (this)), 0);
		//   12   26:aload_0         
		//   13   27:invokevirtual   #158 <Method Context getContext()>
		//   14   30:ldc1            #160 <String "input_method">
		//   15   32:invokevirtual   #166 <Method Object Context.getSystemService(String)>
		//   16   35:checkcast       #168 <Class InputMethodManager>
		//   17   38:aload_0         
		//   18   39:iconst_0        
		//   19   40:invokevirtual   #172 <Method boolean InputMethodManager.showSoftInput(View, int)>
		//   20   43:pop             
				if(SearchView.isLandscapeMode(getContext()))
		//*  21   44:aload_0         
		//*  22   45:invokevirtual   #158 <Method Context getContext()>
		//*  23   48:invokestatic    #176 <Method boolean SearchView.isLandscapeMode(Context)>
		//*  24   51:ifeq            62
					SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(((AutoCompleteTextView) (this)), true);
		//   25   54:getstatic       #180 <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
		//   26   57:aload_0         
		//   27   58:iconst_1        
		//   28   59:invokevirtual   #186 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
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
		static boolean access$000(SearchAutoComplete searchautocomplete)
		{
			return searchautocomplete.isEmpty();
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method boolean isEmpty()>
		//    2    4:ireturn         
		}

*/

		public SearchAutoComplete(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #20  <Method void SearchView$SearchAutoComplete(Context, AttributeSet)>
		//    4    6:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset)
		{
			this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #26  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
		//    4    6:invokespecial   #29  <Method void SearchView$SearchAutoComplete(Context, AttributeSet, int)>
		//    5    9:return          
		}

		public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
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

	static class UpdatableTouchDelegate extends TouchDelegate
	{

		public boolean onTouchEvent(MotionEvent motionevent)
		{
			int i = (int)motionevent.getX();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #66  <Method float MotionEvent.getX()>
		//    2    4:f2i             
		//    3    5:istore          4
			int j = (int)motionevent.getY();
		//    4    7:aload_1         
		//    5    8:invokevirtual   #69  <Method float MotionEvent.getY()>
		//    6   11:f2i             
		//    7   12:istore          5
			boolean flag2 = false;
		//    8   14:iconst_0        
		//    9   15:istore          6
			boolean flag1 = true;
		//   10   17:iconst_1        
		//   11   18:istore_3        
			boolean flag3 = false;
		//   12   19:iconst_0        
		//   13   20:istore          7
			boolean flag;
			switch(motionevent.getAction())
		//*  14   22:aload_1         
		//*  15   23:invokevirtual   #72  <Method int MotionEvent.getAction()>
			{
		//*  16   26:tableswitch     0 3: default 56
		//		               0 61
		//		               1 90
		//		               2 90
		//		               3 136
			default:
				flag = flag1;
		//   17   56:iload_3         
		//   18   57:istore_2        
				break;

		//*  19   58:goto            149
			case 0: // '\0'
				flag = flag1;
		//   20   61:iload_3         
		//   21   62:istore_2        
				if(mTargetBounds.contains(i, j))
		//*  22   63:aload_0         
		//*  23   64:getfield        #47  <Field Rect mTargetBounds>
		//*  24   67:iload           4
		//*  25   69:iload           5
		//*  26   71:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
		//*  27   74:ifeq            149
				{
					mDelegateTargeted = true;
		//   28   77:aload_0         
		//   29   78:iconst_1        
		//   30   79:putfield        #78  <Field boolean mDelegateTargeted>
					flag2 = true;
		//   31   82:iconst_1        
		//   32   83:istore          6
					flag = flag1;
		//   33   85:iload_3         
		//   34   86:istore_2        
				}
				break;

		//*  35   87:goto            149
			case 1: // '\001'
			case 2: // '\002'
				boolean flag4 = mDelegateTargeted;
		//   36   90:aload_0         
		//   37   91:getfield        #78  <Field boolean mDelegateTargeted>
		//   38   94:istore          8
				flag2 = flag4;
		//   39   96:iload           8
		//   40   98:istore          6
				flag = flag1;
		//   41  100:iload_3         
		//   42  101:istore_2        
				if(flag4)
		//*  43  102:iload           8
		//*  44  104:ifeq            149
				{
					flag2 = flag4;
		//   45  107:iload           8
		//   46  109:istore          6
					flag = flag1;
		//   47  111:iload_3         
		//   48  112:istore_2        
					if(!mSlopBounds.contains(i, j))
		//*  49  113:aload_0         
		//*  50  114:getfield        #49  <Field Rect mSlopBounds>
		//*  51  117:iload           4
		//*  52  119:iload           5
		//*  53  121:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
		//*  54  124:ifne            149
					{
						flag = false;
		//   55  127:iconst_0        
		//   56  128:istore_2        
						flag2 = flag4;
		//   57  129:iload           8
		//   58  131:istore          6
					}
				}
				break;

		//*  59  133:goto            149
			case 3: // '\003'
				flag2 = mDelegateTargeted;
		//   60  136:aload_0         
		//   61  137:getfield        #78  <Field boolean mDelegateTargeted>
		//   62  140:istore          6
				mDelegateTargeted = false;
		//   63  142:aload_0         
		//   64  143:iconst_0        
		//   65  144:putfield        #78  <Field boolean mDelegateTargeted>
				flag = flag1;
		//   66  147:iload_3         
		//   67  148:istore_2        
				break;
			}
			if(flag2)
		//*  68  149:iload           6
		//*  69  151:ifeq            235
			{
				if(flag && !mActualBounds.contains(i, j))
		//*  70  154:iload_2         
		//*  71  155:ifeq            199
		//*  72  158:aload_0         
		//*  73  159:getfield        #51  <Field Rect mActualBounds>
		//*  74  162:iload           4
		//*  75  164:iload           5
		//*  76  166:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
		//*  77  169:ifne            199
					motionevent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
		//   78  172:aload_1         
		//   79  173:aload_0         
		//   80  174:getfield        #57  <Field View mDelegateView>
		//   81  177:invokevirtual   #81  <Method int View.getWidth()>
		//   82  180:iconst_2        
		//   83  181:idiv            
		//   84  182:i2f             
		//   85  183:aload_0         
		//   86  184:getfield        #57  <Field View mDelegateView>
		//   87  187:invokevirtual   #84  <Method int View.getHeight()>
		//   88  190:iconst_2        
		//   89  191:idiv            
		//   90  192:i2f             
		//   91  193:invokevirtual   #88  <Method void MotionEvent.setLocation(float, float)>
				else
		//*  92  196:goto            225
					motionevent.setLocation(i - mActualBounds.left, j - mActualBounds.top);
		//   93  199:aload_1         
		//   94  200:iload           4
		//   95  202:aload_0         
		//   96  203:getfield        #51  <Field Rect mActualBounds>
		//   97  206:getfield        #91  <Field int Rect.left>
		//   98  209:isub            
		//   99  210:i2f             
		//  100  211:iload           5
		//  101  213:aload_0         
		//  102  214:getfield        #51  <Field Rect mActualBounds>
		//  103  217:getfield        #94  <Field int Rect.top>
		//  104  220:isub            
		//  105  221:i2f             
		//  106  222:invokevirtual   #88  <Method void MotionEvent.setLocation(float, float)>
				flag3 = mDelegateView.dispatchTouchEvent(motionevent);
		//  107  225:aload_0         
		//  108  226:getfield        #57  <Field View mDelegateView>
		//  109  229:aload_1         
		//  110  230:invokevirtual   #97  <Method boolean View.dispatchTouchEvent(MotionEvent)>
		//  111  233:istore          7
			}
			return flag3;
		//  112  235:iload           7
		//  113  237:ireturn         
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
	//    3    3:invokespecial   #154 <Method void SearchView(Context, AttributeSet)>
	//    4    6:return          
	}

	public SearchView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.searchViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #159 <Field int android.support.v7.appcompat.R$attr.searchViewStyle>
	//    4    6:invokespecial   #162 <Method void SearchView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SearchView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #163 <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		mSearchSrcTextViewBounds = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #165 <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #166 <Method void Rect()>
	//    9   15:putfield        #168 <Field Rect mSearchSrcTextViewBounds>
		mSearchSrtTextViewBoundsExpanded = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #165 <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #166 <Method void Rect()>
	//   14   26:putfield        #170 <Field Rect mSearchSrtTextViewBoundsExpanded>
		mTemp = new int[2];
	//   15   29:aload_0         
	//   16   30:iconst_2        
	//   17   31:newarray        int[]
	//   18   33:putfield        #172 <Field int[] mTemp>
		mTemp2 = new int[2];
	//   19   36:aload_0         
	//   20   37:iconst_2        
	//   21   38:newarray        int[]
	//   22   40:putfield        #174 <Field int[] mTemp2>
	//   23   43:aload_0         
	//   24   44:new             #8   <Class SearchView$1>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:invokespecial   #177 <Method void SearchView$1(SearchView)>
	//   28   52:putfield        #179 <Field Runnable mShowImeRunnable>
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
	//   29   55:aload_0         
	//   30   56:new             #16  <Class SearchView$2>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #180 <Method void SearchView$2(SearchView)>
	//   34   64:putfield        #182 <Field Runnable mUpdateDrawableStateRunnable>
	//   35   67:aload_0         
	//   36   68:new             #18  <Class SearchView$3>
	//   37   71:dup             
	//   38   72:aload_0         
	//   39   73:invokespecial   #183 <Method void SearchView$3(SearchView)>
	//   40   76:putfield        #185 <Field Runnable mReleaseCursorRunnable>
		mOutsideDrawablesCache = new WeakHashMap();
	//   41   79:aload_0         
	//   42   80:new             #187 <Class WeakHashMap>
	//   43   83:dup             
	//   44   84:invokespecial   #188 <Method void WeakHashMap()>
	//   45   87:putfield        #190 <Field WeakHashMap mOutsideDrawablesCache>
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
	//   46   90:aload_0         
	//   47   91:new             #26  <Class SearchView$7>
	//   48   94:dup             
	//   49   95:aload_0         
	//   50   96:invokespecial   #191 <Method void SearchView$7(SearchView)>
	//   51   99:putfield        #193 <Field android.view.View$OnClickListener mOnClickListener>
	//   52  102:aload_0         
	//   53  103:new             #28  <Class SearchView$8>
	//   54  106:dup             
	//   55  107:aload_0         
	//   56  108:invokespecial   #194 <Method void SearchView$8(SearchView)>
	//   57  111:putfield        #196 <Field android.view.View$OnKeyListener mTextKeyListener>
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
	//   58  114:aload_0         
	//   59  115:new             #30  <Class SearchView$9>
	//   60  118:dup             
	//   61  119:aload_0         
	//   62  120:invokespecial   #197 <Method void SearchView$9(SearchView)>
	//   63  123:putfield        #199 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
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
	//   64  126:aload_0         
	//   65  127:new             #10  <Class SearchView$10>
	//   66  130:dup             
	//   67  131:aload_0         
	//   68  132:invokespecial   #200 <Method void SearchView$10(SearchView)>
	//   69  135:putfield        #202 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
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
	//   70  138:aload_0         
	//   71  139:new             #12  <Class SearchView$11>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:invokespecial   #203 <Method void SearchView$11(SearchView)>
	//   75  147:putfield        #205 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//   76  150:aload_0         
	//   77  151:new             #14  <Class SearchView$12>
	//   78  154:dup             
	//   79  155:aload_0         
	//   80  156:invokespecial   #206 <Method void SearchView$12(SearchView)>
	//   81  159:putfield        #208 <Field TextWatcher mTextWatcher>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SearchView, i, 0)));
	//   82  162:aload_1         
	//   83  163:aload_2         
	//   84  164:getstatic       #212 <Field int[] android.support.v7.appcompat.R$styleable.SearchView>
	//   85  167:iload_3         
	//   86  168:iconst_0        
	//   87  169:invokestatic    #218 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   88  172:astore_2        
		LayoutInflater.from(context).inflate(((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_layout, android.support.v7.appcompat.R.layout.abc_search_view), ((android.view.ViewGroup) (this)), true);
	//   89  173:aload_1         
	//   90  174:invokestatic    #224 <Method LayoutInflater LayoutInflater.from(Context)>
	//   91  177:aload_2         
	//   92  178:getstatic       #227 <Field int android.support.v7.appcompat.R$styleable.SearchView_layout>
	//   93  181:getstatic       #232 <Field int android.support.v7.appcompat.R$layout.abc_search_view>
	//   94  184:invokevirtual   #236 <Method int TintTypedArray.getResourceId(int, int)>
	//   95  187:aload_0         
	//   96  188:iconst_1        
	//   97  189:invokevirtual   #240 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   98  192:pop             
		mSearchSrcTextView = (SearchAutoComplete)findViewById(android.support.v7.appcompat.R.id.search_src_text);
	//   99  193:aload_0         
	//  100  194:aload_0         
	//  101  195:getstatic       #245 <Field int android.support.v7.appcompat.R$id.search_src_text>
	//  102  198:invokevirtual   #249 <Method View findViewById(int)>
	//  103  201:checkcast       #49  <Class SearchView$SearchAutoComplete>
	//  104  204:putfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
		mSearchSrcTextView.setSearchView(this);
	//  105  207:aload_0         
	//  106  208:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  107  211:aload_0         
	//  108  212:invokevirtual   #254 <Method void SearchView$SearchAutoComplete.setSearchView(SearchView)>
		mSearchEditFrame = findViewById(android.support.v7.appcompat.R.id.search_edit_frame);
	//  109  215:aload_0         
	//  110  216:aload_0         
	//  111  217:getstatic       #257 <Field int android.support.v7.appcompat.R$id.search_edit_frame>
	//  112  220:invokevirtual   #249 <Method View findViewById(int)>
	//  113  223:putfield        #259 <Field View mSearchEditFrame>
		mSearchPlate = findViewById(android.support.v7.appcompat.R.id.search_plate);
	//  114  226:aload_0         
	//  115  227:aload_0         
	//  116  228:getstatic       #262 <Field int android.support.v7.appcompat.R$id.search_plate>
	//  117  231:invokevirtual   #249 <Method View findViewById(int)>
	//  118  234:putfield        #264 <Field View mSearchPlate>
		mSubmitArea = findViewById(android.support.v7.appcompat.R.id.submit_area);
	//  119  237:aload_0         
	//  120  238:aload_0         
	//  121  239:getstatic       #267 <Field int android.support.v7.appcompat.R$id.submit_area>
	//  122  242:invokevirtual   #249 <Method View findViewById(int)>
	//  123  245:putfield        #269 <Field View mSubmitArea>
		mSearchButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_button);
	//  124  248:aload_0         
	//  125  249:aload_0         
	//  126  250:getstatic       #272 <Field int android.support.v7.appcompat.R$id.search_button>
	//  127  253:invokevirtual   #249 <Method View findViewById(int)>
	//  128  256:checkcast       #274 <Class ImageView>
	//  129  259:putfield        #276 <Field ImageView mSearchButton>
		mGoButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_go_btn);
	//  130  262:aload_0         
	//  131  263:aload_0         
	//  132  264:getstatic       #279 <Field int android.support.v7.appcompat.R$id.search_go_btn>
	//  133  267:invokevirtual   #249 <Method View findViewById(int)>
	//  134  270:checkcast       #274 <Class ImageView>
	//  135  273:putfield        #281 <Field ImageView mGoButton>
		mCloseButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_close_btn);
	//  136  276:aload_0         
	//  137  277:aload_0         
	//  138  278:getstatic       #284 <Field int android.support.v7.appcompat.R$id.search_close_btn>
	//  139  281:invokevirtual   #249 <Method View findViewById(int)>
	//  140  284:checkcast       #274 <Class ImageView>
	//  141  287:putfield        #286 <Field ImageView mCloseButton>
		mVoiceButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_voice_btn);
	//  142  290:aload_0         
	//  143  291:aload_0         
	//  144  292:getstatic       #289 <Field int android.support.v7.appcompat.R$id.search_voice_btn>
	//  145  295:invokevirtual   #249 <Method View findViewById(int)>
	//  146  298:checkcast       #274 <Class ImageView>
	//  147  301:putfield        #291 <Field ImageView mVoiceButton>
		mCollapsedIcon = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_mag_icon);
	//  148  304:aload_0         
	//  149  305:aload_0         
	//  150  306:getstatic       #294 <Field int android.support.v7.appcompat.R$id.search_mag_icon>
	//  151  309:invokevirtual   #249 <Method View findViewById(int)>
	//  152  312:checkcast       #274 <Class ImageView>
	//  153  315:putfield        #296 <Field ImageView mCollapsedIcon>
		ViewCompat.setBackground(mSearchPlate, ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_queryBackground));
	//  154  318:aload_0         
	//  155  319:getfield        #264 <Field View mSearchPlate>
	//  156  322:aload_2         
	//  157  323:getstatic       #299 <Field int android.support.v7.appcompat.R$styleable.SearchView_queryBackground>
	//  158  326:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  159  329:invokestatic    #309 <Method void ViewCompat.setBackground(View, Drawable)>
		ViewCompat.setBackground(mSubmitArea, ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_submitBackground));
	//  160  332:aload_0         
	//  161  333:getfield        #269 <Field View mSubmitArea>
	//  162  336:aload_2         
	//  163  337:getstatic       #312 <Field int android.support.v7.appcompat.R$styleable.SearchView_submitBackground>
	//  164  340:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  165  343:invokestatic    #309 <Method void ViewCompat.setBackground(View, Drawable)>
		mSearchButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
	//  166  346:aload_0         
	//  167  347:getfield        #276 <Field ImageView mSearchButton>
	//  168  350:aload_2         
	//  169  351:getstatic       #315 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchIcon>
	//  170  354:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  171  357:invokevirtual   #319 <Method void ImageView.setImageDrawable(Drawable)>
		mGoButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_goIcon));
	//  172  360:aload_0         
	//  173  361:getfield        #281 <Field ImageView mGoButton>
	//  174  364:aload_2         
	//  175  365:getstatic       #322 <Field int android.support.v7.appcompat.R$styleable.SearchView_goIcon>
	//  176  368:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  177  371:invokevirtual   #319 <Method void ImageView.setImageDrawable(Drawable)>
		mCloseButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_closeIcon));
	//  178  374:aload_0         
	//  179  375:getfield        #286 <Field ImageView mCloseButton>
	//  180  378:aload_2         
	//  181  379:getstatic       #325 <Field int android.support.v7.appcompat.R$styleable.SearchView_closeIcon>
	//  182  382:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  183  385:invokevirtual   #319 <Method void ImageView.setImageDrawable(Drawable)>
		mVoiceButton.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_voiceIcon));
	//  184  388:aload_0         
	//  185  389:getfield        #291 <Field ImageView mVoiceButton>
	//  186  392:aload_2         
	//  187  393:getstatic       #328 <Field int android.support.v7.appcompat.R$styleable.SearchView_voiceIcon>
	//  188  396:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  189  399:invokevirtual   #319 <Method void ImageView.setImageDrawable(Drawable)>
		mCollapsedIcon.setImageDrawable(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
	//  190  402:aload_0         
	//  191  403:getfield        #296 <Field ImageView mCollapsedIcon>
	//  192  406:aload_2         
	//  193  407:getstatic       #315 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchIcon>
	//  194  410:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  195  413:invokevirtual   #319 <Method void ImageView.setImageDrawable(Drawable)>
		mSearchHintIcon = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchHintIcon);
	//  196  416:aload_0         
	//  197  417:aload_2         
	//  198  418:getstatic       #331 <Field int android.support.v7.appcompat.R$styleable.SearchView_searchHintIcon>
	//  199  421:invokevirtual   #303 <Method Drawable TintTypedArray.getDrawable(int)>
	//  200  424:putfield        #333 <Field Drawable mSearchHintIcon>
		ViewCompat.setTooltipText(((View) (mSearchButton)), ((CharSequence) (getResources().getString(android.support.v7.appcompat.R.string.abc_searchview_description_search))));
	//  201  427:aload_0         
	//  202  428:getfield        #276 <Field ImageView mSearchButton>
	//  203  431:aload_0         
	//  204  432:invokevirtual   #337 <Method Resources getResources()>
	//  205  435:getstatic       #342 <Field int android.support.v7.appcompat.R$string.abc_searchview_description_search>
	//  206  438:invokevirtual   #348 <Method String Resources.getString(int)>
	//  207  441:invokestatic    #352 <Method void ViewCompat.setTooltipText(View, CharSequence)>
		mSuggestionRowLayout = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_suggestionRowLayout, android.support.v7.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
	//  208  444:aload_0         
	//  209  445:aload_2         
	//  210  446:getstatic       #355 <Field int android.support.v7.appcompat.R$styleable.SearchView_suggestionRowLayout>
	//  211  449:getstatic       #358 <Field int android.support.v7.appcompat.R$layout.abc_search_dropdown_item_icons_2line>
	//  212  452:invokevirtual   #236 <Method int TintTypedArray.getResourceId(int, int)>
	//  213  455:putfield        #360 <Field int mSuggestionRowLayout>
		mSuggestionCommitIconResId = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SearchView_commitIcon, 0);
	//  214  458:aload_0         
	//  215  459:aload_2         
	//  216  460:getstatic       #363 <Field int android.support.v7.appcompat.R$styleable.SearchView_commitIcon>
	//  217  463:iconst_0        
	//  218  464:invokevirtual   #236 <Method int TintTypedArray.getResourceId(int, int)>
	//  219  467:putfield        #365 <Field int mSuggestionCommitIconResId>
		mSearchButton.setOnClickListener(mOnClickListener);
	//  220  470:aload_0         
	//  221  471:getfield        #276 <Field ImageView mSearchButton>
	//  222  474:aload_0         
	//  223  475:getfield        #193 <Field android.view.View$OnClickListener mOnClickListener>
	//  224  478:invokevirtual   #369 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mCloseButton.setOnClickListener(mOnClickListener);
	//  225  481:aload_0         
	//  226  482:getfield        #286 <Field ImageView mCloseButton>
	//  227  485:aload_0         
	//  228  486:getfield        #193 <Field android.view.View$OnClickListener mOnClickListener>
	//  229  489:invokevirtual   #369 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mGoButton.setOnClickListener(mOnClickListener);
	//  230  492:aload_0         
	//  231  493:getfield        #281 <Field ImageView mGoButton>
	//  232  496:aload_0         
	//  233  497:getfield        #193 <Field android.view.View$OnClickListener mOnClickListener>
	//  234  500:invokevirtual   #369 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mVoiceButton.setOnClickListener(mOnClickListener);
	//  235  503:aload_0         
	//  236  504:getfield        #291 <Field ImageView mVoiceButton>
	//  237  507:aload_0         
	//  238  508:getfield        #193 <Field android.view.View$OnClickListener mOnClickListener>
	//  239  511:invokevirtual   #369 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		mSearchSrcTextView.setOnClickListener(mOnClickListener);
	//  240  514:aload_0         
	//  241  515:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  242  518:aload_0         
	//  243  519:getfield        #193 <Field android.view.View$OnClickListener mOnClickListener>
	//  244  522:invokevirtual   #370 <Method void SearchView$SearchAutoComplete.setOnClickListener(android.view.View$OnClickListener)>
		mSearchSrcTextView.addTextChangedListener(mTextWatcher);
	//  245  525:aload_0         
	//  246  526:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  247  529:aload_0         
	//  248  530:getfield        #208 <Field TextWatcher mTextWatcher>
	//  249  533:invokevirtual   #374 <Method void SearchView$SearchAutoComplete.addTextChangedListener(TextWatcher)>
		mSearchSrcTextView.setOnEditorActionListener(mOnEditorActionListener);
	//  250  536:aload_0         
	//  251  537:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  252  540:aload_0         
	//  253  541:getfield        #199 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
	//  254  544:invokevirtual   #378 <Method void SearchView$SearchAutoComplete.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		mSearchSrcTextView.setOnItemClickListener(mOnItemClickListener);
	//  255  547:aload_0         
	//  256  548:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  257  551:aload_0         
	//  258  552:getfield        #202 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
	//  259  555:invokevirtual   #382 <Method void SearchView$SearchAutoComplete.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		mSearchSrcTextView.setOnItemSelectedListener(mOnItemSelectedListener);
	//  260  558:aload_0         
	//  261  559:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  262  562:aload_0         
	//  263  563:getfield        #205 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//  264  566:invokevirtual   #386 <Method void SearchView$SearchAutoComplete.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		mSearchSrcTextView.setOnKeyListener(mTextKeyListener);
	//  265  569:aload_0         
	//  266  570:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  267  573:aload_0         
	//  268  574:getfield        #196 <Field android.view.View$OnKeyListener mTextKeyListener>
	//  269  577:invokevirtual   #390 <Method void SearchView$SearchAutoComplete.setOnKeyListener(android.view.View$OnKeyListener)>
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
	//  270  580:aload_0         
	//  271  581:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  272  584:new             #20  <Class SearchView$4>
	//  273  587:dup             
	//  274  588:aload_0         
	//  275  589:invokespecial   #391 <Method void SearchView$4(SearchView)>
	//  276  592:invokevirtual   #395 <Method void SearchView$SearchAutoComplete.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
		setIconifiedByDefault(((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
	//  277  595:aload_0         
	//  278  596:aload_2         
	//  279  597:getstatic       #398 <Field int android.support.v7.appcompat.R$styleable.SearchView_iconifiedByDefault>
	//  280  600:iconst_1        
	//  281  601:invokevirtual   #402 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  282  604:invokevirtual   #406 <Method void setIconifiedByDefault(boolean)>
		i = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SearchView_android_maxWidth, -1);
	//  283  607:aload_2         
	//  284  608:getstatic       #409 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_maxWidth>
	//  285  611:iconst_m1       
	//  286  612:invokevirtual   #412 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  287  615:istore_3        
		if(i != -1)
	//* 288  616:iload_3         
	//* 289  617:iconst_m1       
	//* 290  618:icmpeq          626
			setMaxWidth(i);
	//  291  621:aload_0         
	//  292  622:iload_3         
	//  293  623:invokevirtual   #416 <Method void setMaxWidth(int)>
		mDefaultQueryHint = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SearchView_defaultQueryHint);
	//  294  626:aload_0         
	//  295  627:aload_2         
	//  296  628:getstatic       #419 <Field int android.support.v7.appcompat.R$styleable.SearchView_defaultQueryHint>
	//  297  631:invokevirtual   #423 <Method CharSequence TintTypedArray.getText(int)>
	//  298  634:putfield        #425 <Field CharSequence mDefaultQueryHint>
		mQueryHint = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SearchView_queryHint);
	//  299  637:aload_0         
	//  300  638:aload_2         
	//  301  639:getstatic       #428 <Field int android.support.v7.appcompat.R$styleable.SearchView_queryHint>
	//  302  642:invokevirtual   #423 <Method CharSequence TintTypedArray.getText(int)>
	//  303  645:putfield        #430 <Field CharSequence mQueryHint>
		i = ((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SearchView_android_imeOptions, -1);
	//  304  648:aload_2         
	//  305  649:getstatic       #433 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_imeOptions>
	//  306  652:iconst_m1       
	//  307  653:invokevirtual   #436 <Method int TintTypedArray.getInt(int, int)>
	//  308  656:istore_3        
		if(i != -1)
	//* 309  657:iload_3         
	//* 310  658:iconst_m1       
	//* 311  659:icmpeq          667
			setImeOptions(i);
	//  312  662:aload_0         
	//  313  663:iload_3         
	//  314  664:invokevirtual   #439 <Method void setImeOptions(int)>
		i = ((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SearchView_android_inputType, -1);
	//  315  667:aload_2         
	//  316  668:getstatic       #442 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_inputType>
	//  317  671:iconst_m1       
	//  318  672:invokevirtual   #436 <Method int TintTypedArray.getInt(int, int)>
	//  319  675:istore_3        
		if(i != -1)
	//* 320  676:iload_3         
	//* 321  677:iconst_m1       
	//* 322  678:icmpeq          686
			setInputType(i);
	//  323  681:aload_0         
	//  324  682:iload_3         
	//  325  683:invokevirtual   #445 <Method void setInputType(int)>
		setFocusable(((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SearchView_android_focusable, true));
	//  326  686:aload_0         
	//  327  687:aload_2         
	//  328  688:getstatic       #448 <Field int android.support.v7.appcompat.R$styleable.SearchView_android_focusable>
	//  329  691:iconst_1        
	//  330  692:invokevirtual   #402 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  331  695:invokevirtual   #451 <Method void setFocusable(boolean)>
		((TintTypedArray) (attributeset)).recycle();
	//  332  698:aload_2         
	//  333  699:invokevirtual   #454 <Method void TintTypedArray.recycle()>
		mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
	//  334  702:aload_0         
	//  335  703:new             #456 <Class Intent>
	//  336  706:dup             
	//  337  707:ldc2            #458 <String "android.speech.action.WEB_SEARCH">
	//  338  710:invokespecial   #461 <Method void Intent(String)>
	//  339  713:putfield        #463 <Field Intent mVoiceWebSearchIntent>
		mVoiceWebSearchIntent.addFlags(0x10000000);
	//  340  716:aload_0         
	//  341  717:getfield        #463 <Field Intent mVoiceWebSearchIntent>
	//  342  720:ldc2            #464 <Int 0x10000000>
	//  343  723:invokevirtual   #468 <Method Intent Intent.addFlags(int)>
	//  344  726:pop             
		mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
	//  345  727:aload_0         
	//  346  728:getfield        #463 <Field Intent mVoiceWebSearchIntent>
	//  347  731:ldc2            #470 <String "android.speech.extra.LANGUAGE_MODEL">
	//  348  734:ldc2            #472 <String "web_search">
	//  349  737:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//  350  740:pop             
		mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
	//  351  741:aload_0         
	//  352  742:new             #456 <Class Intent>
	//  353  745:dup             
	//  354  746:ldc2            #478 <String "android.speech.action.RECOGNIZE_SPEECH">
	//  355  749:invokespecial   #461 <Method void Intent(String)>
	//  356  752:putfield        #480 <Field Intent mVoiceAppSearchIntent>
		mVoiceAppSearchIntent.addFlags(0x10000000);
	//  357  755:aload_0         
	//  358  756:getfield        #480 <Field Intent mVoiceAppSearchIntent>
	//  359  759:ldc2            #464 <Int 0x10000000>
	//  360  762:invokevirtual   #468 <Method Intent Intent.addFlags(int)>
	//  361  765:pop             
		mDropDownAnchor = findViewById(mSearchSrcTextView.getDropDownAnchor());
	//  362  766:aload_0         
	//  363  767:aload_0         
	//  364  768:aload_0         
	//  365  769:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//  366  772:invokevirtual   #484 <Method int SearchView$SearchAutoComplete.getDropDownAnchor()>
	//  367  775:invokevirtual   #249 <Method View findViewById(int)>
	//  368  778:putfield        #486 <Field View mDropDownAnchor>
		if(mDropDownAnchor != null)
	//* 369  781:aload_0         
	//* 370  782:getfield        #486 <Field View mDropDownAnchor>
	//* 371  785:ifnull          807
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//* 372  788:getstatic       #491 <Field int android.os.Build$VERSION.SDK_INT>
	//* 373  791:bipush          11
	//* 374  793:icmplt          803
				addOnLayoutChangeListenerToDropDownAnchorSDK11();
	//  375  796:aload_0         
	//  376  797:invokespecial   #494 <Method void addOnLayoutChangeListenerToDropDownAnchorSDK11()>
			else
	//* 377  800:goto            807
				addOnLayoutChangeListenerToDropDownAnchorBase();
	//  378  803:aload_0         
	//  379  804:invokespecial   #497 <Method void addOnLayoutChangeListenerToDropDownAnchorBase()>
		updateViewsVisibility(mIconifiedByDefault);
	//  380  807:aload_0         
	//  381  808:aload_0         
	//  382  809:getfield        #499 <Field boolean mIconifiedByDefault>
	//  383  812:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
		updateQueryHint();
	//  384  815:aload_0         
	//  385  816:invokespecial   #505 <Method void updateQueryHint()>
	//  386  819:return          
	}

	private void addOnLayoutChangeListenerToDropDownAnchorBase()
	{
		mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				adjustDropDownSizeAndPosition();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchView this$0>
			//    2    4:invokevirtual   #24  <Method void SearchView.adjustDropDownSizeAndPosition()>
			//    3    7:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #486 <Field View mDropDownAnchor>
	//    2    4:invokevirtual   #511 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    3    7:new             #24  <Class SearchView$6>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #512 <Method void SearchView$6(SearchView)>
	//    7   15:invokevirtual   #518 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    8   18:return          
	}

	private void addOnLayoutChangeListenerToDropDownAnchorSDK11()
	{
		mDropDownAnchor.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

			public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
					int k1, int l1)
			{
				adjustDropDownSizeAndPosition();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchView this$0>
			//    2    4:invokevirtual   #25  <Method void SearchView.adjustDropDownSizeAndPosition()>
			//    3    7:return          
			}

			final SearchView this$0;

			
			{
				this$0 = SearchView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #486 <Field View mDropDownAnchor>
	//    2    4:new             #22  <Class SearchView$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #519 <Method void SearchView$5(SearchView)>
	//    6   12:invokevirtual   #523 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
	//    7   15:return          
	}

	private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
	{
		s = ((String) (new Intent(s)));
	//    0    0:new             #456 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #461 <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s)).addFlags(0x10000000);
	//    5    9:aload_1         
	//    6   10:ldc2            #464 <Int 0x10000000>
	//    7   13:invokevirtual   #468 <Method Intent Intent.addFlags(int)>
	//    8   16:pop             
		if(uri != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			((Intent) (s)).setData(uri);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #529 <Method Intent Intent.setData(Uri)>
	//   14   26:pop             
		((Intent) (s)).putExtra("user_query", mUserQuery);
	//   15   27:aload_1         
	//   16   28:ldc2            #531 <String "user_query">
	//   17   31:aload_0         
	//   18   32:getfield        #533 <Field CharSequence mUserQuery>
	//   19   35:invokevirtual   #536 <Method Intent Intent.putExtra(String, CharSequence)>
	//   20   38:pop             
		if(s2 != null)
	//*  21   39:aload           4
	//*  22   41:ifnull          54
			((Intent) (s)).putExtra("query", s2);
	//   23   44:aload_1         
	//   24   45:ldc2            #538 <String "query">
	//   25   48:aload           4
	//   26   50:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   27   53:pop             
		if(s1 != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          67
			((Intent) (s)).putExtra("intent_extra_data_key", s1);
	//   30   58:aload_1         
	//   31   59:ldc2            #540 <String "intent_extra_data_key">
	//   32   62:aload_3         
	//   33   63:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   34   66:pop             
		if(mAppSearchData != null)
	//*  35   67:aload_0         
	//*  36   68:getfield        #542 <Field Bundle mAppSearchData>
	//*  37   71:ifnull          86
			((Intent) (s)).putExtra("app_data", mAppSearchData);
	//   38   74:aload_1         
	//   39   75:ldc2            #544 <String "app_data">
	//   40   78:aload_0         
	//   41   79:getfield        #542 <Field Bundle mAppSearchData>
	//   42   82:invokevirtual   #547 <Method Intent Intent.putExtra(String, Bundle)>
	//   43   85:pop             
		if(i != 0)
	//*  44   86:iload           5
	//*  45   88:ifeq            111
		{
			((Intent) (s)).putExtra("action_key", i);
	//   46   91:aload_1         
	//   47   92:ldc2            #549 <String "action_key">
	//   48   95:iload           5
	//   49   97:invokevirtual   #552 <Method Intent Intent.putExtra(String, int)>
	//   50  100:pop             
			((Intent) (s)).putExtra("action_msg", s3);
	//   51  101:aload_1         
	//   52  102:ldc2            #554 <String "action_msg">
	//   53  105:aload           6
	//   54  107:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   55  110:pop             
		}
		((Intent) (s)).setComponent(mSearchable.getSearchActivity());
	//   56  111:aload_1         
	//   57  112:aload_0         
	//   58  113:getfield        #556 <Field SearchableInfo mSearchable>
	//   59  116:invokevirtual   #562 <Method ComponentName SearchableInfo.getSearchActivity()>
	//   60  119:invokevirtual   #566 <Method Intent Intent.setComponent(ComponentName)>
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
	//    1    1:ldc2            #572 <String "suggest_intent_action">
	//    2    4:invokestatic    #578 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//    3    7:astore          5
		}
	//*   4    9:aload           5
	//*   5   11:astore          4
	//*   6   13:aload           5
	//*   7   15:ifnonnull       205
	//*   8   18:aload_0         
	//*   9   19:getfield        #556 <Field SearchableInfo mSearchable>
	//*  10   22:invokevirtual   #582 <Method String SearchableInfo.getSuggestIntentAction()>
	//*  11   25:astore          4
	//*  12   27:goto            205
	//*  13   30:aload_1         
	//*  14   31:ldc2            #584 <String "suggest_intent_data">
	//*  15   34:invokestatic    #578 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  16   37:astore          6
	//*  17   39:aload           6
	//*  18   41:astore          4
	//*  19   43:aload           6
	//*  20   45:ifnonnull       57
	//*  21   48:aload_0         
	//*  22   49:getfield        #556 <Field SearchableInfo mSearchable>
	//*  23   52:invokevirtual   #587 <Method String SearchableInfo.getSuggestIntentData()>
	//*  24   55:astore          4
	//*  25   57:aload           4
	//*  26   59:astore          6
	//*  27   61:aload           4
	//*  28   63:ifnull          222
	//*  29   66:aload_1         
	//*  30   67:ldc2            #589 <String "suggest_intent_data_id">
	//*  31   70:invokestatic    #578 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  32   73:astore          7
	//*  33   75:aload           4
	//*  34   77:astore          6
	//*  35   79:aload           7
	//*  36   81:ifnull          222
	//*  37   84:new             #591 <Class StringBuilder>
	//*  38   87:dup             
	//*  39   88:invokespecial   #592 <Method void StringBuilder()>
	//*  40   91:aload           4
	//*  41   93:invokevirtual   #596 <Method StringBuilder StringBuilder.append(String)>
	//*  42   96:ldc2            #598 <String "/">
	//*  43   99:invokevirtual   #596 <Method StringBuilder StringBuilder.append(String)>
	//*  44  102:aload           7
	//*  45  104:invokestatic    #604 <Method String Uri.encode(String)>
	//*  46  107:invokevirtual   #596 <Method StringBuilder StringBuilder.append(String)>
	//*  47  110:invokevirtual   #607 <Method String StringBuilder.toString()>
	//*  48  113:astore          6
	//*  49  115:goto            222
	//*  50  118:aload           6
	//*  51  120:invokestatic    #611 <Method Uri Uri.parse(String)>
	//*  52  123:astore          4
	//*  53  125:aload_1         
	//*  54  126:ldc2            #613 <String "suggest_intent_query">
	//*  55  129:invokestatic    #578 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  56  132:astore          6
	//*  57  134:aload_0         
	//*  58  135:aload           5
	//*  59  137:aload           4
	//*  60  139:aload_1         
	//*  61  140:ldc2            #615 <String "suggest_intent_extra_data">
	//*  62  143:invokestatic    #578 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
	//*  63  146:aload           6
	//*  64  148:iload_2         
	//*  65  149:aload_3         
	//*  66  150:invokespecial   #617 <Method Intent createIntent(String, Uri, String, String, int, String)>
	//*  67  153:astore_3        
	//*  68  154:aload_3         
	//*  69  155:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  70  156:astore_3        
		{
			try
			{
				i = cursor.getPosition();
	//   71  157:aload_1         
	//   72  158:invokeinterface #622 <Method int Cursor.getPosition()>
	//   73  163:istore_2        
			}
	//*  74  164:goto            170
			// Misplaced declaration of an exception variable
			catch(Cursor cursor)
	//*  75  167:astore_1        
			{
				i = -1;
	//   76  168:iconst_m1       
	//   77  169:istore_2        
			}
			Log.w("SearchView", (new StringBuilder()).append("Search suggestions cursor at row ").append(i).append(" returned exception.").toString(), ((Throwable) (s)));
	//   78  170:ldc1            #65  <String "SearchView">
	//   79  172:new             #591 <Class StringBuilder>
	//   80  175:dup             
	//   81  176:invokespecial   #592 <Method void StringBuilder()>
	//   82  179:ldc2            #624 <String "Search suggestions cursor at row ">
	//   83  182:invokevirtual   #596 <Method StringBuilder StringBuilder.append(String)>
	//   84  185:iload_2         
	//   85  186:invokevirtual   #627 <Method StringBuilder StringBuilder.append(int)>
	//   86  189:ldc2            #629 <String " returned exception.">
	//   87  192:invokevirtual   #596 <Method StringBuilder StringBuilder.append(String)>
	//   88  195:invokevirtual   #607 <Method String StringBuilder.toString()>
	//   89  198:aload_3         
	//   90  199:invokestatic    #635 <Method int Log.w(String, String, Throwable)>
	//   91  202:pop             
			return null;
	//   92  203:aconst_null     
	//   93  204:areturn         
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
		obj2 = ((Object) ((new StringBuilder()).append(((String) (obj))).append("/").append(Uri.encode(s1)).toString()));
		  goto _L4
_L8:
		obj = ((Object) (Uri.parse(((String) (obj2)))));
_L9:
		obj2 = ((Object) (SuggestionsAdapter.getColumnString(cursor, "suggest_intent_query")));
		s = ((String) (createIntent(((String) (obj1)), ((Uri) (obj)), SuggestionsAdapter.getColumnString(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i, s)));
		return ((Intent) (s));
_L2:
		obj1 = obj;
	//   94  205:aload           4
	//   95  207:astore          5
		if(obj == null)
	//*  96  209:aload           4
	//*  97  211:ifnonnull       30
			obj1 = "android.intent.action.SEARCH";
	//   98  214:ldc2            #637 <String "android.intent.action.SEARCH">
	//   99  217:astore          5
		  goto _L6
	//* 100  219:goto            30
_L4:
		if(obj2 != null) goto _L8; else goto _L7
	//  101  222:aload           6
	//  102  224:ifnonnull       118
_L7:
		obj = null;
	//  103  227:aconst_null     
	//  104  228:astore          4
		  goto _L9
	//* 105  230:goto            125
	}

	private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
	{
		ComponentName componentname = searchableinfo.getSearchActivity();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #562 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    2    4:astore          9
		Object obj = ((Object) (new Intent("android.intent.action.SEARCH")));
	//    3    6:new             #456 <Class Intent>
	//    4    9:dup             
	//    5   10:ldc2            #637 <String "android.intent.action.SEARCH">
	//    6   13:invokespecial   #461 <Method void Intent(String)>
	//    7   16:astore          4
		((Intent) (obj)).setComponent(componentname);
	//    8   18:aload           4
	//    9   20:aload           9
	//   10   22:invokevirtual   #566 <Method Intent Intent.setComponent(ComponentName)>
	//   11   25:pop             
		PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #643 <Method Context getContext()>
	//   14   30:iconst_0        
	//   15   31:aload           4
	//   16   33:ldc2            #644 <Int 0x40000000>
	//   17   36:invokestatic    #650 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   18   39:astore          6
		Bundle bundle = new Bundle();
	//   19   41:new             #652 <Class Bundle>
	//   20   44:dup             
	//   21   45:invokespecial   #653 <Method void Bundle()>
	//   22   48:astore          7
		if(mAppSearchData != null)
	//*  23   50:aload_0         
	//*  24   51:getfield        #542 <Field Bundle mAppSearchData>
	//*  25   54:ifnull          69
			bundle.putParcelable("app_data", ((Parcelable) (mAppSearchData)));
	//   26   57:aload           7
	//   27   59:ldc2            #544 <String "app_data">
	//   28   62:aload_0         
	//   29   63:getfield        #542 <Field Bundle mAppSearchData>
	//   30   66:invokevirtual   #657 <Method void Bundle.putParcelable(String, Parcelable)>
		Intent intent1 = new Intent(intent);
	//   31   69:new             #456 <Class Intent>
	//   32   72:dup             
	//   33   73:aload_1         
	//   34   74:invokespecial   #660 <Method void Intent(Intent)>
	//   35   77:astore          8
		intent = "free_form";
	//   36   79:ldc2            #662 <String "free_form">
	//   37   82:astore_1        
		obj = null;
	//   38   83:aconst_null     
	//   39   84:astore          4
		String s = null;
	//   40   86:aconst_null     
	//   41   87:astore          5
		int i = 1;
	//   42   89:iconst_1        
	//   43   90:istore_3        
		Resources resources = getResources();
	//   44   91:aload_0         
	//   45   92:invokevirtual   #337 <Method Resources getResources()>
	//   46   95:astore          10
		if(searchableinfo.getVoiceLanguageModeId() != 0)
	//*  47   97:aload_2         
	//*  48   98:invokevirtual   #665 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//*  49  101:ifeq            114
			intent = ((Intent) (resources.getString(searchableinfo.getVoiceLanguageModeId())));
	//   50  104:aload           10
	//   51  106:aload_2         
	//   52  107:invokevirtual   #665 <Method int SearchableInfo.getVoiceLanguageModeId()>
	//   53  110:invokevirtual   #348 <Method String Resources.getString(int)>
	//   54  113:astore_1        
		if(searchableinfo.getVoicePromptTextId() != 0)
	//*  55  114:aload_2         
	//*  56  115:invokevirtual   #668 <Method int SearchableInfo.getVoicePromptTextId()>
	//*  57  118:ifeq            132
			obj = ((Object) (resources.getString(searchableinfo.getVoicePromptTextId())));
	//   58  121:aload           10
	//   59  123:aload_2         
	//   60  124:invokevirtual   #668 <Method int SearchableInfo.getVoicePromptTextId()>
	//   61  127:invokevirtual   #348 <Method String Resources.getString(int)>
	//   62  130:astore          4
		if(searchableinfo.getVoiceLanguageId() != 0)
	//*  63  132:aload_2         
	//*  64  133:invokevirtual   #671 <Method int SearchableInfo.getVoiceLanguageId()>
	//*  65  136:ifeq            150
			s = resources.getString(searchableinfo.getVoiceLanguageId());
	//   66  139:aload           10
	//   67  141:aload_2         
	//   68  142:invokevirtual   #671 <Method int SearchableInfo.getVoiceLanguageId()>
	//   69  145:invokevirtual   #348 <Method String Resources.getString(int)>
	//   70  148:astore          5
		if(searchableinfo.getVoiceMaxResults() != 0)
	//*  71  150:aload_2         
	//*  72  151:invokevirtual   #674 <Method int SearchableInfo.getVoiceMaxResults()>
	//*  73  154:ifeq            162
			i = searchableinfo.getVoiceMaxResults();
	//   74  157:aload_2         
	//   75  158:invokevirtual   #674 <Method int SearchableInfo.getVoiceMaxResults()>
	//   76  161:istore_3        
		intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", ((String) (intent)));
	//   77  162:aload           8
	//   78  164:ldc2            #470 <String "android.speech.extra.LANGUAGE_MODEL">
	//   79  167:aload_1         
	//   80  168:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   81  171:pop             
		intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
	//   82  172:aload           8
	//   83  174:ldc2            #676 <String "android.speech.extra.PROMPT">
	//   84  177:aload           4
	//   85  179:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   86  182:pop             
		intent1.putExtra("android.speech.extra.LANGUAGE", s);
	//   87  183:aload           8
	//   88  185:ldc2            #678 <String "android.speech.extra.LANGUAGE">
	//   89  188:aload           5
	//   90  190:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   91  193:pop             
		intent1.putExtra("android.speech.extra.MAX_RESULTS", i);
	//   92  194:aload           8
	//   93  196:ldc2            #680 <String "android.speech.extra.MAX_RESULTS">
	//   94  199:iload_3         
	//   95  200:invokevirtual   #552 <Method Intent Intent.putExtra(String, int)>
	//   96  203:pop             
		if(componentname == null)
	//*  97  204:aload           9
	//*  98  206:ifnonnull       214
			intent = null;
	//   99  209:aconst_null     
	//  100  210:astore_1        
		else
	//* 101  211:goto            220
			intent = ((Intent) (componentname.flattenToShortString()));
	//  102  214:aload           9
	//  103  216:invokevirtual   #685 <Method String ComponentName.flattenToShortString()>
	//  104  219:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//  105  220:aload           8
	//  106  222:ldc2            #687 <String "calling_package">
	//  107  225:aload_1         
	//  108  226:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//  109  229:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", ((Parcelable) (pendingintent)));
	//  110  230:aload           8
	//  111  232:ldc2            #689 <String "android.speech.extra.RESULTS_PENDINGINTENT">
	//  112  235:aload           6
	//  113  237:invokevirtual   #692 <Method Intent Intent.putExtra(String, Parcelable)>
	//  114  240:pop             
		intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
	//  115  241:aload           8
	//  116  243:ldc2            #694 <String "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE">
	//  117  246:aload           7
	//  118  248:invokevirtual   #547 <Method Intent Intent.putExtra(String, Bundle)>
	//  119  251:pop             
		return intent1;
	//  120  252:aload           8
	//  121  254:areturn         
	}

	private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
	{
		Intent intent1 = new Intent(intent);
	//    0    0:new             #456 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #660 <Method void Intent(Intent)>
	//    4    8:astore_3        
		intent = ((Intent) (searchableinfo.getSearchActivity()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #562 <Method ComponentName SearchableInfo.getSearchActivity()>
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
	//   14   24:invokevirtual   #685 <Method String ComponentName.flattenToShortString()>
	//   15   27:astore_1        
		intent1.putExtra("calling_package", ((String) (intent)));
	//   16   28:aload_3         
	//   17   29:ldc2            #687 <String "calling_package">
	//   18   32:aload_1         
	//   19   33:invokevirtual   #476 <Method Intent Intent.putExtra(String, String)>
	//   20   36:pop             
		return intent1;
	//   21   37:aload_3         
	//   22   38:areturn         
	}

	private void dismissSuggestions()
	{
		mSearchSrcTextView.dismissDropDown();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #699 <Method void SearchView$SearchAutoComplete.dismissDropDown()>
	//    3    7:return          
	}

	private void getChildBoundsWithinSearchView(View view, Rect rect)
	{
		view.getLocationInWindow(mTemp);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #172 <Field int[] mTemp>
	//    3    5:invokevirtual   #705 <Method void View.getLocationInWindow(int[])>
		getLocationInWindow(mTemp2);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #174 <Field int[] mTemp2>
	//    7   13:invokevirtual   #706 <Method void getLocationInWindow(int[])>
		int i = mTemp[1] - mTemp2[1];
	//    8   16:aload_0         
	//    9   17:getfield        #172 <Field int[] mTemp>
	//   10   20:iconst_1        
	//   11   21:iaload          
	//   12   22:aload_0         
	//   13   23:getfield        #174 <Field int[] mTemp2>
	//   14   26:iconst_1        
	//   15   27:iaload          
	//   16   28:isub            
	//   17   29:istore_3        
		int j = mTemp[0] - mTemp2[0];
	//   18   30:aload_0         
	//   19   31:getfield        #172 <Field int[] mTemp>
	//   20   34:iconst_0        
	//   21   35:iaload          
	//   22   36:aload_0         
	//   23   37:getfield        #174 <Field int[] mTemp2>
	//   24   40:iconst_0        
	//   25   41:iaload          
	//   26   42:isub            
	//   27   43:istore          4
		rect.set(j, i, view.getWidth() + j, view.getHeight() + i);
	//   28   45:aload_2         
	//   29   46:iload           4
	//   30   48:iload_3         
	//   31   49:aload_1         
	//   32   50:invokevirtual   #709 <Method int View.getWidth()>
	//   33   53:iload           4
	//   34   55:iadd            
	//   35   56:aload_1         
	//   36   57:invokevirtual   #712 <Method int View.getHeight()>
	//   37   60:iload_3         
	//   38   61:iadd            
	//   39   62:invokevirtual   #716 <Method void Rect.set(int, int, int, int)>
	//   40   65:return          
	}

	private CharSequence getDecoratedHint(CharSequence charsequence)
	{
		if(!mIconifiedByDefault || mSearchHintIcon == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #499 <Field boolean mIconifiedByDefault>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #333 <Field Drawable mSearchHintIcon>
	//*   5   11:ifnonnull       16
		{
			return charsequence;
	//    6   14:aload_1         
	//    7   15:areturn         
		} else
		{
			int i = (int)((double)mSearchSrcTextView.getTextSize() * 1.25D);
	//    8   16:aload_0         
	//    9   17:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:invokevirtual   #722 <Method float SearchView$SearchAutoComplete.getTextSize()>
	//   11   23:f2d             
	//   12   24:ldc2w           #723 <Double 1.25D>
	//   13   27:dmul            
	//   14   28:d2i             
	//   15   29:istore_2        
			mSearchHintIcon.setBounds(0, 0, i, i);
	//   16   30:aload_0         
	//   17   31:getfield        #333 <Field Drawable mSearchHintIcon>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:iload_2         
	//   21   37:iload_2         
	//   22   38:invokevirtual   #729 <Method void Drawable.setBounds(int, int, int, int)>
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
	//   23   41:new             #731 <Class SpannableStringBuilder>
	//   24   44:dup             
	//   25   45:ldc2            #733 <String "   ">
	//   26   48:invokespecial   #736 <Method void SpannableStringBuilder(CharSequence)>
	//   27   51:astore_3        
			spannablestringbuilder.setSpan(((Object) (new ImageSpan(mSearchHintIcon))), 1, 2, 33);
	//   28   52:aload_3         
	//   29   53:new             #738 <Class ImageSpan>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:getfield        #333 <Field Drawable mSearchHintIcon>
	//   33   61:invokespecial   #740 <Method void ImageSpan(Drawable)>
	//   34   64:iconst_1        
	//   35   65:iconst_2        
	//   36   66:bipush          33
	//   37   68:invokevirtual   #744 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			spannablestringbuilder.append(charsequence);
	//   38   71:aload_3         
	//   39   72:aload_1         
	//   40   73:invokevirtual   #747 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   41   76:pop             
			return ((CharSequence) (spannablestringbuilder));
	//   42   77:aload_3         
	//   43   78:areturn         
		}
	}

	private int getPreferredHeight()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_height);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #643 <Method Context getContext()>
	//    2    4:invokevirtual   #751 <Method Resources Context.getResources()>
	//    3    7:getstatic       #756 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_height>
	//    4   10:invokevirtual   #759 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private int getPreferredWidth()
	{
		return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_width);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #643 <Method Context getContext()>
	//    2    4:invokevirtual   #751 <Method Resources Context.getResources()>
	//    3    7:getstatic       #763 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_width>
	//    4   10:invokevirtual   #759 <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private boolean hasVoiceSearch()
	{
		if(mSearchable != null && mSearchable.getVoiceSearchEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #556 <Field SearchableInfo mSearchable>
	//*   2    4:ifnull          77
	//*   3    7:aload_0         
	//*   4    8:getfield        #556 <Field SearchableInfo mSearchable>
	//*   5   11:invokevirtual   #768 <Method boolean SearchableInfo.getVoiceSearchEnabled()>
	//*   6   14:ifeq            77
		{
			Intent intent = null;
	//    7   17:aconst_null     
	//    8   18:astore_1        
			if(mSearchable.getVoiceSearchLaunchWebSearch())
	//*   9   19:aload_0         
	//*  10   20:getfield        #556 <Field SearchableInfo mSearchable>
	//*  11   23:invokevirtual   #771 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*  12   26:ifeq            37
				intent = mVoiceWebSearchIntent;
	//   13   29:aload_0         
	//   14   30:getfield        #463 <Field Intent mVoiceWebSearchIntent>
	//   15   33:astore_1        
			else
	//*  16   34:goto            52
			if(mSearchable.getVoiceSearchLaunchRecognizer())
	//*  17   37:aload_0         
	//*  18   38:getfield        #556 <Field SearchableInfo mSearchable>
	//*  19   41:invokevirtual   #774 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  20   44:ifeq            52
				intent = mVoiceAppSearchIntent;
	//   21   47:aload_0         
	//   22   48:getfield        #480 <Field Intent mVoiceAppSearchIntent>
	//   23   51:astore_1        
			if(intent != null)
	//*  24   52:aload_1         
	//*  25   53:ifnull          77
				return getContext().getPackageManager().resolveActivity(intent, 0x10000) != null;
	//   26   56:aload_0         
	//   27   57:invokevirtual   #643 <Method Context getContext()>
	//   28   60:invokevirtual   #778 <Method PackageManager Context.getPackageManager()>
	//   29   63:aload_1         
	//   30   64:ldc2            #779 <Int 0x10000>
	//   31   67:invokevirtual   #785 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   32   70:ifnull          75
	//   33   73:iconst_1        
	//   34   74:ireturn         
	//   35   75:iconst_0        
	//   36   76:ireturn         
		}
		return false;
	//   37   77:iconst_0        
	//   38   78:ireturn         
	}

	static boolean isLandscapeMode(Context context)
	{
		return context.getResources().getConfiguration().orientation == 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #751 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #791 <Method Configuration Resources.getConfiguration()>
	//    3    7:getfield        #796 <Field int Configuration.orientation>
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
	//    1    1:getfield        #799 <Field boolean mSubmitButtonEnabled>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #801 <Field boolean mVoiceButtonEnabled>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:invokevirtual   #804 <Method boolean isIconified()>
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
	//    4    6:invokevirtual   #643 <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #808 <Method void Context.startActivity(Intent)>
			return;
	//    7   13:return          
		}
		catch(RuntimeException runtimeexception)
	//*   8   14:astore_2        
		{
			Log.e("SearchView", (new StringBuilder()).append("Failed launch activity: ").append(((Object) (intent))).toString(), ((Throwable) (runtimeexception)));
	//    9   15:ldc1            #65  <String "SearchView">
	//   10   17:new             #591 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #592 <Method void StringBuilder()>
	//   13   24:ldc2            #810 <String "Failed launch activity: ">
	//   14   27:invokevirtual   #596 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #813 <Method StringBuilder StringBuilder.append(Object)>
	//   17   34:invokevirtual   #607 <Method String StringBuilder.toString()>
	//   18   37:aload_2         
	//   19   38:invokestatic    #816 <Method int Log.e(String, String, Throwable)>
	//   20   41:pop             
		}
	//   21   42:return          
	}

	private boolean launchSuggestion(int i, int j, String s)
	{
		Cursor cursor = mSuggestionsAdapter.getCursor();
	//    0    0:aload_0         
	//    1    1:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//    2    4:invokevirtual   #826 <Method Cursor CursorAdapter.getCursor()>
	//    3    7:astore          4
		if(cursor != null && cursor.moveToPosition(i))
	//*   4    9:aload           4
	//*   5   11:ifnull          39
	//*   6   14:aload           4
	//*   7   16:iload_1         
	//*   8   17:invokeinterface #830 <Method boolean Cursor.moveToPosition(int)>
	//*   9   22:ifeq            39
		{
			launchIntent(createIntentFromSuggestion(cursor, j, s));
	//   10   25:aload_0         
	//   11   26:aload_0         
	//   12   27:aload           4
	//   13   29:iload_2         
	//   14   30:aload_3         
	//   15   31:invokespecial   #832 <Method Intent createIntentFromSuggestion(Cursor, int, String)>
	//   16   34:invokespecial   #834 <Method void launchIntent(Intent)>
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
	//    2    2:getfield        #182 <Field Runnable mUpdateDrawableStateRunnable>
	//    3    5:invokevirtual   #839 <Method boolean post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void rewriteQueryFromSuggestion(int i)
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_2        
		Object obj = ((Object) (mSuggestionsAdapter.getCursor()));
	//    4    8:aload_0         
	//    5    9:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//    6   12:invokevirtual   #826 <Method Cursor CursorAdapter.getCursor()>
	//    7   15:astore_3        
		if(obj == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(((Cursor) (obj)).moveToPosition(i))
	//*  11   21:aload_3         
	//*  12   22:iload_1         
	//*  13   23:invokeinterface #830 <Method boolean Cursor.moveToPosition(int)>
	//*  14   28:ifeq            58
		{
			obj = ((Object) (mSuggestionsAdapter.convertToString(((Cursor) (obj)))));
	//   15   31:aload_0         
	//   16   32:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #847 <Method CharSequence CursorAdapter.convertToString(Cursor)>
	//   19   39:astore_3        
			if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          52
				setQuery(((CharSequence) (obj)));
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:invokespecial   #850 <Method void setQuery(CharSequence)>
			else
	//*  25   49:goto            57
				setQuery(((CharSequence) (editable)));
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:invokespecial   #850 <Method void setQuery(CharSequence)>
			return;
	//   29   57:return          
		} else
		{
			setQuery(((CharSequence) (editable)));
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:invokespecial   #850 <Method void setQuery(CharSequence)>
			return;
	//   33   63:return          
		}
	}

	private void setQuery(CharSequence charsequence)
	{
		mSearchSrcTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    4    8:aload_0         
	//    5    9:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    6   12:astore_3        
		int i;
		if(TextUtils.isEmpty(charsequence))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #859 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifeq            25
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		else
	//*  12   22:goto            32
			i = charsequence.length();
	//   13   25:aload_1         
	//   14   26:invokeinterface #864 <Method int CharSequence.length()>
	//   15   31:istore_2        
		searchautocomplete.setSelection(i);
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #867 <Method void SearchView$SearchAutoComplete.setSelection(int)>
	//   19   37:return          
	}

	private void updateCloseButton()
	{
		boolean flag;
		if(!TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//*   3    7:invokestatic    #859 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifne            18
			flag = true;
	//    5   13:iconst_1        
	//    6   14:istore_1        
		else
	//*   7   15:goto            20
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		boolean flag1;
		if(flag || mIconifiedByDefault && !mExpandedInActionView)
	//*  10   20:iload_1         
	//*  11   21:ifne            38
	//*  12   24:aload_0         
	//*  13   25:getfield        #499 <Field boolean mIconifiedByDefault>
	//*  14   28:ifeq            43
	//*  15   31:aload_0         
	//*  16   32:getfield        #870 <Field boolean mExpandedInActionView>
	//*  17   35:ifne            43
			flag1 = true;
	//   18   38:iconst_1        
	//   19   39:istore_2        
		else
	//*  20   40:goto            45
			flag1 = false;
	//   21   43:iconst_0        
	//   22   44:istore_2        
		ImageView imageview = mCloseButton;
	//   23   45:aload_0         
	//   24   46:getfield        #286 <Field ImageView mCloseButton>
	//   25   49:astore_3        
		byte byte0;
		if(flag1)
	//*  26   50:iload_2         
	//*  27   51:ifeq            59
			byte0 = 0;
	//   28   54:iconst_0        
	//   29   55:istore_2        
		else
	//*  30   56:goto            62
			byte0 = 8;
	//   31   59:bipush          8
	//   32   61:istore_2        
		imageview.setVisibility(((int) (byte0)));
	//   33   62:aload_3         
	//   34   63:iload_2         
	//   35   64:invokevirtual   #873 <Method void ImageView.setVisibility(int)>
		Drawable drawable = mCloseButton.getDrawable();
	//   36   67:aload_0         
	//   37   68:getfield        #286 <Field ImageView mCloseButton>
	//   38   71:invokevirtual   #876 <Method Drawable ImageView.getDrawable()>
	//   39   74:astore          4
		if(drawable != null)
	//*  40   76:aload           4
	//*  41   78:ifnull          103
		{
			int ai[];
			if(flag)
	//*  42   81:iload_1         
	//*  43   82:ifeq            92
				ai = ENABLED_STATE_SET;
	//   44   85:getstatic       #879 <Field int[] ENABLED_STATE_SET>
	//   45   88:astore_3        
			else
	//*  46   89:goto            96
				ai = EMPTY_STATE_SET;
	//   47   92:getstatic       #882 <Field int[] EMPTY_STATE_SET>
	//   48   95:astore_3        
			drawable.setState(ai);
	//   49   96:aload           4
	//   50   98:aload_3         
	//   51   99:invokevirtual   #886 <Method boolean Drawable.setState(int[])>
	//   52  102:pop             
		}
	//   53  103:return          
	}

	private void updateQueryHint()
	{
		Object obj = ((Object) (getQueryHint()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #890 <Method CharSequence getQueryHint()>
	//    2    4:astore_1        
		SearchAutoComplete searchautocomplete = mSearchSrcTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:astore_2        
		if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       21
			obj = "";
	//    8   14:ldc2            #892 <String "">
	//    9   17:astore_1        
	//*  10   18:goto            21
		searchautocomplete.setHint(getDecoratedHint(((CharSequence) (obj))));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #894 <Method CharSequence getDecoratedHint(CharSequence)>
	//   15   27:invokevirtual   #897 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
	//   16   30:return          
	}

	private void updateSearchAutoComplete()
	{
		mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_0         
	//    3    5:getfield        #556 <Field SearchableInfo mSearchable>
	//    4    8:invokevirtual   #901 <Method int SearchableInfo.getSuggestThreshold()>
	//    5   11:invokevirtual   #904 <Method void SearchView$SearchAutoComplete.setThreshold(int)>
		mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
	//    6   14:aload_0         
	//    7   15:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    8   18:aload_0         
	//    9   19:getfield        #556 <Field SearchableInfo mSearchable>
	//   10   22:invokevirtual   #907 <Method int SearchableInfo.getImeOptions()>
	//   11   25:invokevirtual   #908 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		int j = mSearchable.getInputType();
	//   12   28:aload_0         
	//   13   29:getfield        #556 <Field SearchableInfo mSearchable>
	//   14   32:invokevirtual   #911 <Method int SearchableInfo.getInputType()>
	//   15   35:istore_2        
		int i = j;
	//   16   36:iload_2         
	//   17   37:istore_1        
		if((j & 0xf) == 1)
	//*  18   38:iload_2         
	//*  19   39:bipush          15
	//*  20   41:iand            
	//*  21   42:iconst_1        
	//*  22   43:icmpne          74
		{
			j &= 0xfffeffff;
	//   23   46:iload_2         
	//   24   47:ldc2            #912 <Int 0xfffeffff>
	//   25   50:iand            
	//   26   51:istore_2        
			i = j;
	//   27   52:iload_2         
	//   28   53:istore_1        
			if(mSearchable.getSuggestAuthority() != null)
	//*  29   54:aload_0         
	//*  30   55:getfield        #556 <Field SearchableInfo mSearchable>
	//*  31   58:invokevirtual   #915 <Method String SearchableInfo.getSuggestAuthority()>
	//*  32   61:ifnull          74
				i = j | 0x10000 | 0x80000;
	//   33   64:iload_2         
	//   34   65:ldc2            #779 <Int 0x10000>
	//   35   68:ior             
	//   36   69:ldc2            #916 <Int 0x80000>
	//   37   72:ior             
	//   38   73:istore_1        
		}
		mSearchSrcTextView.setInputType(i);
	//   39   74:aload_0         
	//   40   75:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   41   78:iload_1         
	//   42   79:invokevirtual   #917 <Method void SearchView$SearchAutoComplete.setInputType(int)>
		if(mSuggestionsAdapter != null)
	//*  43   82:aload_0         
	//*  44   83:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//*  45   86:ifnull          97
			mSuggestionsAdapter.changeCursor(((Cursor) (null)));
	//   46   89:aload_0         
	//   47   90:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//   48   93:aconst_null     
	//   49   94:invokevirtual   #921 <Method void CursorAdapter.changeCursor(Cursor)>
		if(mSearchable.getSuggestAuthority() != null)
	//*  50   97:aload_0         
	//*  51   98:getfield        #556 <Field SearchableInfo mSearchable>
	//*  52  101:invokevirtual   #915 <Method String SearchableInfo.getSuggestAuthority()>
	//*  53  104:ifnull          169
		{
			mSuggestionsAdapter = ((CursorAdapter) (new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache)));
	//   54  107:aload_0         
	//   55  108:new             #574 <Class SuggestionsAdapter>
	//   56  111:dup             
	//   57  112:aload_0         
	//   58  113:invokevirtual   #643 <Method Context getContext()>
	//   59  116:aload_0         
	//   60  117:aload_0         
	//   61  118:getfield        #556 <Field SearchableInfo mSearchable>
	//   62  121:aload_0         
	//   63  122:getfield        #190 <Field WeakHashMap mOutsideDrawablesCache>
	//   64  125:invokespecial   #924 <Method void SuggestionsAdapter(Context, SearchView, SearchableInfo, WeakHashMap)>
	//   65  128:putfield        #820 <Field CursorAdapter mSuggestionsAdapter>
			mSearchSrcTextView.setAdapter(((android.widget.ListAdapter) (mSuggestionsAdapter)));
	//   66  131:aload_0         
	//   67  132:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   68  135:aload_0         
	//   69  136:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//   70  139:invokevirtual   #928 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
			SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
	//   71  142:aload_0         
	//   72  143:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//   73  146:checkcast       #574 <Class SuggestionsAdapter>
	//   74  149:astore_3        
			byte byte0;
			if(mQueryRefinement)
	//*  75  150:aload_0         
	//*  76  151:getfield        #930 <Field boolean mQueryRefinement>
	//*  77  154:ifeq            162
				byte0 = 2;
	//   78  157:iconst_2        
	//   79  158:istore_1        
			else
	//*  80  159:goto            164
				byte0 = 1;
	//   81  162:iconst_1        
	//   82  163:istore_1        
			suggestionsadapter.setQueryRefinement(((int) (byte0)));
	//   83  164:aload_3         
	//   84  165:iload_1         
	//   85  166:invokevirtual   #933 <Method void SuggestionsAdapter.setQueryRefinement(int)>
		}
	//   86  169:return          
	}

	private void updateSubmitArea()
	{
		byte byte0;
label0:
		{
			byte byte1 = 8;
	//    0    0:bipush          8
	//    1    2:istore_2        
			byte0 = byte1;
	//    2    3:iload_2         
	//    3    4:istore_1        
			if(!isSubmitAreaEnabled())
				break label0;
	//    4    5:aload_0         
	//    5    6:invokespecial   #936 <Method boolean isSubmitAreaEnabled()>
	//    6    9:ifeq            36
			if(mGoButton.getVisibility() != 0)
	//*   7   12:aload_0         
	//*   8   13:getfield        #281 <Field ImageView mGoButton>
	//*   9   16:invokevirtual   #939 <Method int ImageView.getVisibility()>
	//*  10   19:ifeq            34
			{
				byte0 = byte1;
	//   11   22:iload_2         
	//   12   23:istore_1        
				if(mVoiceButton.getVisibility() != 0)
					break label0;
	//   13   24:aload_0         
	//   14   25:getfield        #291 <Field ImageView mVoiceButton>
	//   15   28:invokevirtual   #939 <Method int ImageView.getVisibility()>
	//   16   31:ifne            36
			}
			byte0 = 0;
	//   17   34:iconst_0        
	//   18   35:istore_1        
		}
		mSubmitArea.setVisibility(((int) (byte0)));
	//   19   36:aload_0         
	//   20   37:getfield        #269 <Field View mSubmitArea>
	//   21   40:iload_1         
	//   22   41:invokevirtual   #940 <Method void View.setVisibility(int)>
	//   23   44:return          
	}

	private void updateSubmitButton(boolean flag)
	{
		byte byte0;
label0:
		{
			byte byte1 = 8;
	//    0    0:bipush          8
	//    1    2:istore_3        
			byte0 = byte1;
	//    2    3:iload_3         
	//    3    4:istore_2        
			if(!mSubmitButtonEnabled)
				break label0;
	//    4    5:aload_0         
	//    5    6:getfield        #799 <Field boolean mSubmitButtonEnabled>
	//    6    9:ifeq            45
			byte0 = byte1;
	//    7   12:iload_3         
	//    8   13:istore_2        
			if(!isSubmitAreaEnabled())
				break label0;
	//    9   14:aload_0         
	//   10   15:invokespecial   #936 <Method boolean isSubmitAreaEnabled()>
	//   11   18:ifeq            45
			byte0 = byte1;
	//   12   21:iload_3         
	//   13   22:istore_2        
			if(!hasFocus())
				break label0;
	//   14   23:aload_0         
	//   15   24:invokevirtual   #944 <Method boolean hasFocus()>
	//   16   27:ifeq            45
			if(!flag)
	//*  17   30:iload_1         
	//*  18   31:ifne            43
			{
				byte0 = byte1;
	//   19   34:iload_3         
	//   20   35:istore_2        
				if(mVoiceButtonEnabled)
					break label0;
	//   21   36:aload_0         
	//   22   37:getfield        #801 <Field boolean mVoiceButtonEnabled>
	//   23   40:ifne            45
			}
			byte0 = 0;
	//   24   43:iconst_0        
	//   25   44:istore_2        
		}
		mGoButton.setVisibility(((int) (byte0)));
	//   26   45:aload_0         
	//   27   46:getfield        #281 <Field ImageView mGoButton>
	//   28   49:iload_2         
	//   29   50:invokevirtual   #873 <Method void ImageView.setVisibility(int)>
	//   30   53:return          
	}

	private void updateViewsVisibility(boolean flag)
	{
		mIconified = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #946 <Field boolean mIconified>
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		boolean flag1;
		if(!TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText()))))
	//*  10   17:aload_0         
	//*  11   18:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*  12   21:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//*  13   24:invokestatic    #859 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   27:ifne            35
			flag1 = true;
	//   15   30:iconst_1        
	//   16   31:istore_3        
		else
	//*  17   32:goto            37
			flag1 = false;
	//   18   35:iconst_0        
	//   19   36:istore_3        
		mSearchButton.setVisibility(((int) (byte0)));
	//   20   37:aload_0         
	//   21   38:getfield        #276 <Field ImageView mSearchButton>
	//   22   41:iload_2         
	//   23   42:invokevirtual   #873 <Method void ImageView.setVisibility(int)>
		updateSubmitButton(flag1);
	//   24   45:aload_0         
	//   25   46:iload_3         
	//   26   47:invokespecial   #948 <Method void updateSubmitButton(boolean)>
		View view = mSearchEditFrame;
	//   27   50:aload_0         
	//   28   51:getfield        #259 <Field View mSearchEditFrame>
	//   29   54:astore          4
		if(flag)
	//*  30   56:iload_1         
	//*  31   57:ifeq            66
			byte0 = 8;
	//   32   60:bipush          8
	//   33   62:istore_2        
		else
	//*  34   63:goto            68
			byte0 = 0;
	//   35   66:iconst_0        
	//   36   67:istore_2        
		view.setVisibility(((int) (byte0)));
	//   37   68:aload           4
	//   38   70:iload_2         
	//   39   71:invokevirtual   #940 <Method void View.setVisibility(int)>
		if(mCollapsedIcon.getDrawable() == null || mIconifiedByDefault)
	//*  40   74:aload_0         
	//*  41   75:getfield        #296 <Field ImageView mCollapsedIcon>
	//*  42   78:invokevirtual   #876 <Method Drawable ImageView.getDrawable()>
	//*  43   81:ifnull          91
	//*  44   84:aload_0         
	//*  45   85:getfield        #499 <Field boolean mIconifiedByDefault>
	//*  46   88:ifeq            97
			byte0 = 8;
	//   47   91:bipush          8
	//   48   93:istore_2        
		else
	//*  49   94:goto            99
			byte0 = 0;
	//   50   97:iconst_0        
	//   51   98:istore_2        
		mCollapsedIcon.setVisibility(((int) (byte0)));
	//   52   99:aload_0         
	//   53  100:getfield        #296 <Field ImageView mCollapsedIcon>
	//   54  103:iload_2         
	//   55  104:invokevirtual   #873 <Method void ImageView.setVisibility(int)>
		updateCloseButton();
	//   56  107:aload_0         
	//   57  108:invokespecial   #950 <Method void updateCloseButton()>
		if(!flag1)
	//*  58  111:iload_3         
	//*  59  112:ifne            120
			flag = true;
	//   60  115:iconst_1        
	//   61  116:istore_1        
		else
	//*  62  117:goto            122
			flag = false;
	//   63  120:iconst_0        
	//   64  121:istore_1        
		updateVoiceButton(flag);
	//   65  122:aload_0         
	//   66  123:iload_1         
	//   67  124:invokespecial   #953 <Method void updateVoiceButton(boolean)>
		updateSubmitArea();
	//   68  127:aload_0         
	//   69  128:invokespecial   #955 <Method void updateSubmitArea()>
	//   70  131:return          
	}

	private void updateVoiceButton(boolean flag)
	{
		byte byte1 = 8;
	//    0    0:bipush          8
	//    1    2:istore_3        
		byte byte0 = byte1;
	//    2    3:iload_3         
	//    3    4:istore_2        
		if(mVoiceButtonEnabled)
	//*   4    5:aload_0         
	//*   5    6:getfield        #801 <Field boolean mVoiceButtonEnabled>
	//*   6    9:ifeq            38
		{
			byte0 = byte1;
	//    7   12:iload_3         
	//    8   13:istore_2        
			if(!isIconified())
	//*   9   14:aload_0         
	//*  10   15:invokevirtual   #804 <Method boolean isIconified()>
	//*  11   18:ifne            38
			{
				byte0 = byte1;
	//   12   21:iload_3         
	//   13   22:istore_2        
				if(flag)
	//*  14   23:iload_1         
	//*  15   24:ifeq            38
				{
					byte0 = 0;
	//   16   27:iconst_0        
	//   17   28:istore_2        
					mGoButton.setVisibility(8);
	//   18   29:aload_0         
	//   19   30:getfield        #281 <Field ImageView mGoButton>
	//   20   33:bipush          8
	//   21   35:invokevirtual   #873 <Method void ImageView.setVisibility(int)>
				}
			}
		}
		mVoiceButton.setVisibility(((int) (byte0)));
	//   22   38:aload_0         
	//   23   39:getfield        #291 <Field ImageView mVoiceButton>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #873 <Method void ImageView.setVisibility(int)>
	//   26   46:return          
	}

	void adjustDropDownSizeAndPosition()
	{
		if(mDropDownAnchor.getWidth() > 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #486 <Field View mDropDownAnchor>
	//*   2    4:invokevirtual   #709 <Method int View.getWidth()>
	//*   3    7:iconst_1        
	//*   4    8:icmple          159
		{
			Resources resources = getContext().getResources();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #643 <Method Context getContext()>
	//    7   15:invokevirtual   #751 <Method Resources Context.getResources()>
	//    8   18:astore          7
			int k = mSearchPlate.getPaddingLeft();
	//    9   20:aload_0         
	//   10   21:getfield        #264 <Field View mSearchPlate>
	//   11   24:invokevirtual   #959 <Method int View.getPaddingLeft()>
	//   12   27:istore_3        
			Rect rect = new Rect();
	//   13   28:new             #165 <Class Rect>
	//   14   31:dup             
	//   15   32:invokespecial   #166 <Method void Rect()>
	//   16   35:astore          8
			boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   17   37:aload_0         
	//   18   38:invokestatic    #965 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   19   41:istore          6
			int i;
			if(mIconifiedByDefault)
	//*  20   43:aload_0         
	//*  21   44:getfield        #499 <Field boolean mIconifiedByDefault>
	//*  22   47:ifeq            71
				i = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_text_padding_left);
	//   23   50:aload           7
	//   24   52:getstatic       #968 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_icon_width>
	//   25   55:invokevirtual   #759 <Method int Resources.getDimensionPixelSize(int)>
	//   26   58:aload           7
	//   27   60:getstatic       #971 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_text_padding_left>
	//   28   63:invokevirtual   #759 <Method int Resources.getDimensionPixelSize(int)>
	//   29   66:iadd            
	//   30   67:istore_1        
			else
	//*  31   68:goto            73
				i = 0;
	//   32   71:iconst_0        
	//   33   72:istore_1        
			mSearchSrcTextView.getDropDownBackground().getPadding(rect);
	//   34   73:aload_0         
	//   35   74:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   36   77:invokevirtual   #974 <Method Drawable SearchView$SearchAutoComplete.getDropDownBackground()>
	//   37   80:aload           8
	//   38   82:invokevirtual   #978 <Method boolean Drawable.getPadding(Rect)>
	//   39   85:pop             
			int j;
			if(flag)
	//*  40   86:iload           6
	//*  41   88:ifeq            101
				j = -rect.left;
	//   42   91:aload           8
	//   43   93:getfield        #981 <Field int Rect.left>
	//   44   96:ineg            
	//   45   97:istore_2        
			else
	//*  46   98:goto            111
				j = k - (rect.left + i);
	//   47  101:iload_3         
	//   48  102:aload           8
	//   49  104:getfield        #981 <Field int Rect.left>
	//   50  107:iload_1         
	//   51  108:iadd            
	//   52  109:isub            
	//   53  110:istore_2        
			mSearchSrcTextView.setDropDownHorizontalOffset(j);
	//   54  111:aload_0         
	//   55  112:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   56  115:iload_2         
	//   57  116:invokevirtual   #984 <Method void SearchView$SearchAutoComplete.setDropDownHorizontalOffset(int)>
			j = mDropDownAnchor.getWidth();
	//   58  119:aload_0         
	//   59  120:getfield        #486 <Field View mDropDownAnchor>
	//   60  123:invokevirtual   #709 <Method int View.getWidth()>
	//   61  126:istore_2        
			int l = rect.left;
	//   62  127:aload           8
	//   63  129:getfield        #981 <Field int Rect.left>
	//   64  132:istore          4
			int i1 = rect.right;
	//   65  134:aload           8
	//   66  136:getfield        #987 <Field int Rect.right>
	//   67  139:istore          5
			mSearchSrcTextView.setDropDownWidth((j + l + i1 + i) - k);
	//   68  141:aload_0         
	//   69  142:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   70  145:iload_2         
	//   71  146:iload           4
	//   72  148:iadd            
	//   73  149:iload           5
	//   74  151:iadd            
	//   75  152:iload_1         
	//   76  153:iadd            
	//   77  154:iload_3         
	//   78  155:isub            
	//   79  156:invokevirtual   #990 <Method void SearchView$SearchAutoComplete.setDropDownWidth(int)>
		}
	//   80  159:return          
	}

	public void clearFocus()
	{
		mClearingFocus = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #993 <Field boolean mClearingFocus>
		setImeVisibility(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #996 <Method void setImeVisibility(boolean)>
		super.clearFocus();
	//    6   10:aload_0         
	//    7   11:invokespecial   #998 <Method void LinearLayoutCompat.clearFocus()>
		mSearchSrcTextView.clearFocus();
	//    8   14:aload_0         
	//    9   15:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   18:invokevirtual   #999 <Method void SearchView$SearchAutoComplete.clearFocus()>
		mClearingFocus = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #993 <Field boolean mClearingFocus>
	//   14   26:return          
	}

	void forceSuggestionQuery()
	{
		HIDDEN_METHOD_INVOKER.doBeforeTextChanged(((AutoCompleteTextView) (mSearchSrcTextView)));
	//    0    0:getstatic       #149 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//    1    3:aload_0         
	//    2    4:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    3    7:invokevirtual   #1004 <Method void SearchView$AutoCompleteTextViewReflector.doBeforeTextChanged(AutoCompleteTextView)>
		HIDDEN_METHOD_INVOKER.doAfterTextChanged(((AutoCompleteTextView) (mSearchSrcTextView)));
	//    4   10:getstatic       #149 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//    5   13:aload_0         
	//    6   14:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    7   17:invokevirtual   #1007 <Method void SearchView$AutoCompleteTextViewReflector.doAfterTextChanged(AutoCompleteTextView)>
	//    8   20:return          
	}

	public int getImeOptions()
	{
		return mSearchSrcTextView.getImeOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #1008 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//    3    7:ireturn         
	}

	public int getInputType()
	{
		return mSearchSrcTextView.getInputType();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #1009 <Method int SearchView$SearchAutoComplete.getInputType()>
	//    3    7:ireturn         
	}

	public int getMaxWidth()
	{
		return mMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #1012 <Field int mMaxWidth>
	//    2    4:ireturn         
	}

	public CharSequence getQuery()
	{
		return ((CharSequence) (mSearchSrcTextView.getText()));
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:areturn         
	}

	public CharSequence getQueryHint()
	{
		if(mQueryHint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #430 <Field CharSequence mQueryHint>
	//*   2    4:ifnull          12
			return mQueryHint;
	//    3    7:aload_0         
	//    4    8:getfield        #430 <Field CharSequence mQueryHint>
	//    5   11:areturn         
		if(mSearchable != null && mSearchable.getHintId() != 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #556 <Field SearchableInfo mSearchable>
	//*   8   16:ifnull          44
	//*   9   19:aload_0         
	//*  10   20:getfield        #556 <Field SearchableInfo mSearchable>
	//*  11   23:invokevirtual   #1017 <Method int SearchableInfo.getHintId()>
	//*  12   26:ifeq            44
			return getContext().getText(mSearchable.getHintId());
	//   13   29:aload_0         
	//   14   30:invokevirtual   #643 <Method Context getContext()>
	//   15   33:aload_0         
	//   16   34:getfield        #556 <Field SearchableInfo mSearchable>
	//   17   37:invokevirtual   #1017 <Method int SearchableInfo.getHintId()>
	//   18   40:invokevirtual   #1018 <Method CharSequence Context.getText(int)>
	//   19   43:areturn         
		else
			return mDefaultQueryHint;
	//   20   44:aload_0         
	//   21   45:getfield        #425 <Field CharSequence mDefaultQueryHint>
	//   22   48:areturn         
	}

	int getSuggestionCommitIconResId()
	{
		return mSuggestionCommitIconResId;
	//    0    0:aload_0         
	//    1    1:getfield        #365 <Field int mSuggestionCommitIconResId>
	//    2    4:ireturn         
	}

	int getSuggestionRowLayout()
	{
		return mSuggestionRowLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #360 <Field int mSuggestionRowLayout>
	//    2    4:ireturn         
	}

	public CursorAdapter getSuggestionsAdapter()
	{
		return mSuggestionsAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//    2    4:areturn         
	}

	public boolean isIconfiedByDefault()
	{
		return mIconifiedByDefault;
	//    0    0:aload_0         
	//    1    1:getfield        #499 <Field boolean mIconifiedByDefault>
	//    2    4:ireturn         
	}

	public boolean isIconified()
	{
		return mIconified;
	//    0    0:aload_0         
	//    1    1:getfield        #946 <Field boolean mIconified>
	//    2    4:ireturn         
	}

	public boolean isQueryRefinementEnabled()
	{
		return mQueryRefinement;
	//    0    0:aload_0         
	//    1    1:getfield        #930 <Field boolean mQueryRefinement>
	//    2    4:ireturn         
	}

	public boolean isSubmitButtonEnabled()
	{
		return mSubmitButtonEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #799 <Field boolean mSubmitButtonEnabled>
	//    2    4:ireturn         
	}

	void launchQuerySearch(int i, String s, String s1)
	{
		s = ((String) (createIntent("android.intent.action.SEARCH", ((Uri) (null)), ((String) (null)), s1, i, s)));
	//    0    0:aload_0         
	//    1    1:ldc2            #637 <String "android.intent.action.SEARCH">
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_3         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #617 <Method Intent createIntent(String, Uri, String, String, int, String)>
	//    8   12:astore_2        
		getContext().startActivity(((Intent) (s)));
	//    9   13:aload_0         
	//   10   14:invokevirtual   #643 <Method Context getContext()>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #808 <Method void Context.startActivity(Intent)>
	//   13   21:return          
	}

	public void onActionViewCollapsed()
	{
		setQuery("", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #892 <String "">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1032 <Method void setQuery(CharSequence, boolean)>
		clearFocus();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1033 <Method void clearFocus()>
		updateViewsVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
		mSearchSrcTextView.setImeOptions(mCollapsedImeOptions);
	//    9   17:aload_0         
	//   10   18:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   11   21:aload_0         
	//   12   22:getfield        #1035 <Field int mCollapsedImeOptions>
	//   13   25:invokevirtual   #908 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
		mExpandedInActionView = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #870 <Field boolean mExpandedInActionView>
	//   17   33:return          
	}

	public void onActionViewExpanded()
	{
		if(mExpandedInActionView)
	//*   0    0:aload_0         
	//*   1    1:getfield        #870 <Field boolean mExpandedInActionView>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mExpandedInActionView = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #870 <Field boolean mExpandedInActionView>
			mCollapsedImeOptions = mSearchSrcTextView.getImeOptions();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   18:invokevirtual   #1008 <Method int SearchView$SearchAutoComplete.getImeOptions()>
	//   11   21:putfield        #1035 <Field int mCollapsedImeOptions>
			mSearchSrcTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
	//   12   24:aload_0         
	//   13   25:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   14   28:aload_0         
	//   15   29:getfield        #1035 <Field int mCollapsedImeOptions>
	//   16   32:ldc2            #1037 <Int 0x2000000>
	//   17   35:ior             
	//   18   36:invokevirtual   #908 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
			mSearchSrcTextView.setText("");
	//   19   39:aload_0         
	//   20   40:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   21   43:ldc2            #892 <String "">
	//   22   46:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			setIconified(false);
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #1040 <Method void setIconified(boolean)>
			return;
	//   26   54:return          
		}
	}

	void onCloseClicked()
	{
		if(TextUtils.isEmpty(((CharSequence) (mSearchSrcTextView.getText()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//*   3    7:invokestatic    #859 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            49
		{
			if(mIconifiedByDefault && (mOnCloseListener == null || !mOnCloseListener.onClose()))
	//*   5   13:aload_0         
	//*   6   14:getfield        #499 <Field boolean mIconifiedByDefault>
	//*   7   17:ifeq            72
	//*   8   20:aload_0         
	//*   9   21:getfield        #1043 <Field SearchView$OnCloseListener mOnCloseListener>
	//*  10   24:ifnull          39
	//*  11   27:aload_0         
	//*  12   28:getfield        #1043 <Field SearchView$OnCloseListener mOnCloseListener>
	//*  13   31:invokeinterface #1046 <Method boolean SearchView$OnCloseListener.onClose()>
	//*  14   36:ifne            72
			{
				clearFocus();
	//   15   39:aload_0         
	//   16   40:invokevirtual   #1033 <Method void clearFocus()>
				updateViewsVisibility(true);
	//   17   43:aload_0         
	//   18   44:iconst_1        
	//   19   45:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
				return;
	//   20   48:return          
			}
		} else
		{
			mSearchSrcTextView.setText("");
	//   21   49:aload_0         
	//   22   50:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   23   53:ldc2            #892 <String "">
	//   24   56:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
			mSearchSrcTextView.requestFocus();
	//   25   59:aload_0         
	//   26   60:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   27   63:invokevirtual   #1049 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//   28   66:pop             
			setImeVisibility(true);
	//   29   67:aload_0         
	//   30   68:iconst_1        
	//   31   69:invokevirtual   #996 <Method void setImeVisibility(boolean)>
		}
	//   32   72:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mUpdateDrawableStateRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #182 <Field Runnable mUpdateDrawableStateRunnable>
	//    3    5:invokevirtual   #1053 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(mReleaseCursorRunnable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #185 <Field Runnable mReleaseCursorRunnable>
	//    8   14:invokevirtual   #839 <Method boolean post(Runnable)>
	//    9   17:pop             
		super.onDetachedFromWindow();
	//   10   18:aload_0         
	//   11   19:invokespecial   #1055 <Method void LinearLayoutCompat.onDetachedFromWindow()>
	//   12   22:return          
	}

	boolean onItemClicked(int i, int j, String s)
	{
		if(mOnSuggestionListener == null || !mOnSuggestionListener.onSuggestionClick(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #1058 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #1058 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #1061 <Method boolean SearchView$OnSuggestionListener.onSuggestionClick(int)>
	//*   7   17:ifne            39
		{
			launchSuggestion(i, 0, ((String) (null)));
	//    8   20:aload_0         
	//    9   21:iload_1         
	//   10   22:iconst_0        
	//   11   23:aconst_null     
	//   12   24:invokespecial   #1063 <Method boolean launchSuggestion(int, int, String)>
	//   13   27:pop             
			setImeVisibility(false);
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #996 <Method void setImeVisibility(boolean)>
			dismissSuggestions();
	//   17   33:aload_0         
	//   18   34:invokespecial   #1065 <Method void dismissSuggestions()>
			return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		} else
		{
			return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
		}
	}

	boolean onItemSelected(int i)
	{
		if(mOnSuggestionListener == null || !mOnSuggestionListener.onSuggestionSelect(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #1058 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #1058 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #1069 <Method boolean SearchView$OnSuggestionListener.onSuggestionSelect(int)>
	//*   7   17:ifne            27
		{
			rewriteQueryFromSuggestion(i);
	//    8   20:aload_0         
	//    9   21:iload_1         
	//   10   22:invokespecial   #1071 <Method void rewriteQueryFromSuggestion(int)>
			return true;
	//   11   25:iconst_1        
	//   12   26:ireturn         
		} else
		{
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
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
	//    6    8:invokespecial   #1075 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		if(flag)
	//*   7   11:iload_1         
	//*   8   12:ifeq            107
		{
			getChildBoundsWithinSearchView(((View) (mSearchSrcTextView)), mSearchSrcTextViewBounds);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   12   20:aload_0         
	//   13   21:getfield        #168 <Field Rect mSearchSrcTextViewBounds>
	//   14   24:invokespecial   #1077 <Method void getChildBoundsWithinSearchView(View, Rect)>
			mSearchSrtTextViewBoundsExpanded.set(mSearchSrcTextViewBounds.left, 0, mSearchSrcTextViewBounds.right, l - j);
	//   15   27:aload_0         
	//   16   28:getfield        #170 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   17   31:aload_0         
	//   18   32:getfield        #168 <Field Rect mSearchSrcTextViewBounds>
	//   19   35:getfield        #981 <Field int Rect.left>
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #168 <Field Rect mSearchSrcTextViewBounds>
	//   23   43:getfield        #987 <Field int Rect.right>
	//   24   46:iload           5
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:invokevirtual   #716 <Method void Rect.set(int, int, int, int)>
			if(mTouchDelegate == null)
	//*  28   53:aload_0         
	//*  29   54:getfield        #1079 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//*  30   57:ifnonnull       92
			{
				mTouchDelegate = new UpdatableTouchDelegate(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds, ((View) (mSearchSrcTextView)));
	//   31   60:aload_0         
	//   32   61:new             #52  <Class SearchView$UpdatableTouchDelegate>
	//   33   64:dup             
	//   34   65:aload_0         
	//   35   66:getfield        #170 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   36   69:aload_0         
	//   37   70:getfield        #168 <Field Rect mSearchSrcTextViewBounds>
	//   38   73:aload_0         
	//   39   74:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   40   77:invokespecial   #1082 <Method void SearchView$UpdatableTouchDelegate(Rect, Rect, View)>
	//   41   80:putfield        #1079 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
				setTouchDelegate(((TouchDelegate) (mTouchDelegate)));
	//   42   83:aload_0         
	//   43   84:aload_0         
	//   44   85:getfield        #1079 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//   45   88:invokevirtual   #1086 <Method void setTouchDelegate(TouchDelegate)>
				return;
	//   46   91:return          
			}
			mTouchDelegate.setBounds(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds);
	//   47   92:aload_0         
	//   48   93:getfield        #1079 <Field SearchView$UpdatableTouchDelegate mTouchDelegate>
	//   49   96:aload_0         
	//   50   97:getfield        #170 <Field Rect mSearchSrtTextViewBoundsExpanded>
	//   51  100:aload_0         
	//   52  101:getfield        #168 <Field Rect mSearchSrcTextViewBounds>
	//   53  104:invokevirtual   #1089 <Method void SearchView$UpdatableTouchDelegate.setBounds(Rect, Rect)>
		}
	//   54  107:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(isIconified())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #804 <Method boolean isIconified()>
	//*   2    4:ifeq            14
		{
			super.onMeasure(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1093 <Method void LinearLayoutCompat.onMeasure(int, int)>
			return;
	//    7   13:return          
		}
		int l = android.view.View.MeasureSpec.getMode(i);
	//    8   14:iload_1         
	//    9   15:invokestatic    #1098 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   18:istore          4
		int k = android.view.View.MeasureSpec.getSize(i);
	//   11   20:iload_1         
	//   12   21:invokestatic    #1101 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   24:istore_3        
		switch(l)
	//*  14   25:iload           4
		{
	//*  15   27:lookupswitch    3: default 60
	//	               -2147483648: 65
	//	               0: 117
	//	               1073741824: 96
		default:
			i = k;
	//   16   60:iload_3         
	//   17   61:istore_1        
			break;
	//   18   62:goto            137

		case -2147483648: 
			if(mMaxWidth > 0)
	//*  19   65:aload_0         
	//*  20   66:getfield        #1012 <Field int mMaxWidth>
	//*  21   69:ifle            84
				i = Math.min(mMaxWidth, k);
	//   22   72:aload_0         
	//   23   73:getfield        #1012 <Field int mMaxWidth>
	//   24   76:iload_3         
	//   25   77:invokestatic    #1106 <Method int Math.min(int, int)>
	//   26   80:istore_1        
			else
	//*  27   81:goto            137
				i = Math.min(getPreferredWidth(), k);
	//   28   84:aload_0         
	//   29   85:invokespecial   #1108 <Method int getPreferredWidth()>
	//   30   88:iload_3         
	//   31   89:invokestatic    #1106 <Method int Math.min(int, int)>
	//   32   92:istore_1        
			break;
	//   33   93:goto            137

		case 1073741824: 
			i = k;
	//   34   96:iload_3         
	//   35   97:istore_1        
			if(mMaxWidth > 0)
	//*  36   98:aload_0         
	//*  37   99:getfield        #1012 <Field int mMaxWidth>
	//*  38  102:ifle            137
				i = Math.min(mMaxWidth, k);
	//   39  105:aload_0         
	//   40  106:getfield        #1012 <Field int mMaxWidth>
	//   41  109:iload_3         
	//   42  110:invokestatic    #1106 <Method int Math.min(int, int)>
	//   43  113:istore_1        
			break;
	//   44  114:goto            137

		case 0: // '\0'
			if(mMaxWidth > 0)
	//*  45  117:aload_0         
	//*  46  118:getfield        #1012 <Field int mMaxWidth>
	//*  47  121:ifle            132
				i = mMaxWidth;
	//   48  124:aload_0         
	//   49  125:getfield        #1012 <Field int mMaxWidth>
	//   50  128:istore_1        
			else
	//*  51  129:goto            137
				i = getPreferredWidth();
	//   52  132:aload_0         
	//   53  133:invokespecial   #1108 <Method int getPreferredWidth()>
	//   54  136:istore_1        
			break;
		}
		k = android.view.View.MeasureSpec.getMode(j);
	//   55  137:iload_2         
	//   56  138:invokestatic    #1098 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   57  141:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//   58  142:iload_2         
	//   59  143:invokestatic    #1101 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   60  146:istore_2        
		switch(k)
	//*  61  147:iload_3         
		{
	//*  62  148:lookupswitch    2: default 176
	//	               -2147483648: 179
	//	               0: 191
	//*  63  176:goto            196
		case -2147483648: 
			j = Math.min(getPreferredHeight(), j);
	//   64  179:aload_0         
	//   65  180:invokespecial   #1110 <Method int getPreferredHeight()>
	//   66  183:iload_2         
	//   67  184:invokestatic    #1106 <Method int Math.min(int, int)>
	//   68  187:istore_2        
			break;

	//*  69  188:goto            196
		case 0: // '\0'
			j = getPreferredHeight();
	//   70  191:aload_0         
	//   71  192:invokespecial   #1110 <Method int getPreferredHeight()>
	//   72  195:istore_2        
			break;
		}
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
	//   73  196:aload_0         
	//   74  197:iload_1         
	//   75  198:ldc2            #644 <Int 0x40000000>
	//   76  201:invokestatic    #1113 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   77  204:iload_2         
	//   78  205:ldc2            #644 <Int 0x40000000>
	//   79  208:invokestatic    #1113 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   80  211:invokespecial   #1093 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   81  214:return          
	}

	void onQueryRefine(CharSequence charsequence)
	{
		setQuery(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #850 <Method void setQuery(CharSequence)>
	//    3    5:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #44  <Class SearchView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1118 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #44  <Class SearchView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1122 <Method Parcelable SearchView$SavedState.getSuperState()>
	//   13   23:invokespecial   #1118 <Method void LinearLayoutCompat.onRestoreInstanceState(Parcelable)>
			updateViewsVisibility(((SavedState) (parcelable)).isIconified);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #1124 <Field boolean SearchView$SavedState.isIconified>
	//   17   31:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
			requestLayout();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #1127 <Method void requestLayout()>
			return;
	//   20   38:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #44  <Class SearchView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1130 <Method Parcelable LinearLayoutCompat.onSaveInstanceState()>
	//    4    8:invokespecial   #1132 <Method void SearchView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.isIconified = isIconified();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #804 <Method boolean isIconified()>
	//    9   17:putfield        #1124 <Field boolean SearchView$SavedState.isIconified>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	void onSearchClicked()
	{
		updateViewsVisibility(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
		mSearchSrcTextView.requestFocus();
	//    3    5:aload_0         
	//    4    6:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:invokevirtual   #1049 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
	//    6   12:pop             
		setImeVisibility(true);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #996 <Method void setImeVisibility(boolean)>
		if(mOnSearchClickListener != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #1135 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//*  12   22:ifnull          35
			mOnSearchClickListener.onClick(((View) (this)));
	//   13   25:aload_0         
	//   14   26:getfield        #1135 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//   15   29:aload_0         
	//   16   30:invokeinterface #1141 <Method void android.view.View$OnClickListener.onClick(View)>
	//   17   35:return          
	}

	void onSubmitQuery()
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_1        
		if(editable != null && TextUtils.getTrimmedLength(((CharSequence) (editable))) > 0 && (mOnQueryChangeListener == null || !mOnQueryChangeListener.onQueryTextSubmit(((CharSequence) (editable)).toString())))
	//*   4    8:aload_1         
	//*   5    9:ifnull          72
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #1146 <Method int TextUtils.getTrimmedLength(CharSequence)>
	//*   8   16:ifle            72
	//*   9   19:aload_0         
	//*  10   20:getfield        #1148 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  11   23:ifnull          44
	//*  12   26:aload_0         
	//*  13   27:getfield        #1148 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  14   30:aload_1         
	//*  15   31:invokeinterface #1149 <Method String CharSequence.toString()>
	//*  16   36:invokeinterface #1153 <Method boolean SearchView$OnQueryTextListener.onQueryTextSubmit(String)>
	//*  17   41:ifne            72
		{
			if(mSearchable != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #556 <Field SearchableInfo mSearchable>
	//*  20   48:ifnull          63
				launchQuerySearch(0, ((String) (null)), ((CharSequence) (editable)).toString());
	//   21   51:aload_0         
	//   22   52:iconst_0        
	//   23   53:aconst_null     
	//   24   54:aload_1         
	//   25   55:invokeinterface #1149 <Method String CharSequence.toString()>
	//   26   60:invokevirtual   #1155 <Method void launchQuerySearch(int, String, String)>
			setImeVisibility(false);
	//   27   63:aload_0         
	//   28   64:iconst_0        
	//   29   65:invokevirtual   #996 <Method void setImeVisibility(boolean)>
			dismissSuggestions();
	//   30   68:aload_0         
	//   31   69:invokespecial   #1065 <Method void dismissSuggestions()>
		}
	//   32   72:return          
	}

	boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
	{
		if(mSearchable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #556 <Field SearchableInfo mSearchable>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(mSuggestionsAdapter == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//*   7   13:ifnonnull       18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(keyevent.getAction() == 0 && keyevent.hasNoModifiers())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #1162 <Method int KeyEvent.getAction()>
	//*  12   22:ifne            149
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #1165 <Method boolean KeyEvent.hasNoModifiers()>
	//*  15   29:ifeq            149
		{
			if(i == 66 || i == 84 || i == 61)
	//*  16   32:iload_2         
	//*  17   33:bipush          66
	//*  18   35:icmpeq          50
	//*  19   38:iload_2         
	//*  20   39:bipush          84
	//*  21   41:icmpeq          50
	//*  22   44:iload_2         
	//*  23   45:bipush          61
	//*  24   47:icmpne          64
				return onItemClicked(mSearchSrcTextView.getListSelection(), 0, ((String) (null)));
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   28   55:invokevirtual   #1168 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//   29   58:iconst_0        
	//   30   59:aconst_null     
	//   31   60:invokevirtual   #1170 <Method boolean onItemClicked(int, int, String)>
	//   32   63:ireturn         
			if(i == 21 || i == 22)
	//*  33   64:iload_2         
	//*  34   65:bipush          21
	//*  35   67:icmpeq          76
	//*  36   70:iload_2         
	//*  37   71:bipush          22
	//*  38   73:icmpne          131
			{
				if(i == 21)
	//*  39   76:iload_2         
	//*  40   77:bipush          21
	//*  41   79:icmpne          87
					i = 0;
	//   42   82:iconst_0        
	//   43   83:istore_2        
				else
	//*  44   84:goto            95
					i = mSearchSrcTextView.length();
	//   45   87:aload_0         
	//   46   88:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   47   91:invokevirtual   #1171 <Method int SearchView$SearchAutoComplete.length()>
	//   48   94:istore_2        
				mSearchSrcTextView.setSelection(i);
	//   49   95:aload_0         
	//   50   96:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   51   99:iload_2         
	//   52  100:invokevirtual   #867 <Method void SearchView$SearchAutoComplete.setSelection(int)>
				mSearchSrcTextView.setListSelection(0);
	//   53  103:aload_0         
	//   54  104:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   55  107:iconst_0        
	//   56  108:invokevirtual   #1174 <Method void SearchView$SearchAutoComplete.setListSelection(int)>
				mSearchSrcTextView.clearListSelection();
	//   57  111:aload_0         
	//   58  112:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   59  115:invokevirtual   #1177 <Method void SearchView$SearchAutoComplete.clearListSelection()>
				HIDDEN_METHOD_INVOKER.ensureImeVisible(((AutoCompleteTextView) (mSearchSrcTextView)), true);
	//   60  118:getstatic       #149 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//   61  121:aload_0         
	//   62  122:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   63  125:iconst_1        
	//   64  126:invokevirtual   #1181 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
				return true;
	//   65  129:iconst_1        
	//   66  130:ireturn         
			}
			if(i == 19 && mSearchSrcTextView.getListSelection() == 0)
	//*  67  131:iload_2         
	//*  68  132:bipush          19
	//*  69  134:icmpne          149
	//*  70  137:aload_0         
	//*  71  138:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*  72  141:invokevirtual   #1168 <Method int SearchView$SearchAutoComplete.getListSelection()>
	//*  73  144:ifne            149
				return false;
	//   74  147:iconst_0        
	//   75  148:ireturn         
		}
		return false;
	//   76  149:iconst_0        
	//   77  150:ireturn         
	}

	void onTextChanged(CharSequence charsequence)
	{
		Editable editable = mSearchSrcTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:invokevirtual   #843 <Method Editable SearchView$SearchAutoComplete.getText()>
	//    3    7:astore_3        
		mUserQuery = ((CharSequence) (editable));
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:putfield        #533 <Field CharSequence mUserQuery>
		boolean flag;
		if(!TextUtils.isEmpty(((CharSequence) (editable))))
	//*   7   13:aload_3         
	//*   8   14:invokestatic    #859 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifne            25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		updateSubmitButton(flag);
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:invokespecial   #948 <Method void updateSubmitButton(boolean)>
		if(!flag)
	//*  18   32:iload_2         
	//*  19   33:ifne            41
			flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_2        
		else
	//*  22   38:goto            43
			flag = false;
	//   23   41:iconst_0        
	//   24   42:istore_2        
		updateVoiceButton(flag);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokespecial   #953 <Method void updateVoiceButton(boolean)>
		updateCloseButton();
	//   28   48:aload_0         
	//   29   49:invokespecial   #950 <Method void updateCloseButton()>
		updateSubmitArea();
	//   30   52:aload_0         
	//   31   53:invokespecial   #955 <Method void updateSubmitArea()>
		if(mOnQueryChangeListener != null && !TextUtils.equals(charsequence, mOldQueryText))
	//*  32   56:aload_0         
	//*  33   57:getfield        #1148 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//*  34   60:ifnull          90
	//*  35   63:aload_1         
	//*  36   64:aload_0         
	//*  37   65:getfield        #1184 <Field CharSequence mOldQueryText>
	//*  38   68:invokestatic    #1188 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  39   71:ifne            90
			mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
	//   40   74:aload_0         
	//   41   75:getfield        #1148 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//   42   78:aload_1         
	//   43   79:invokeinterface #1149 <Method String CharSequence.toString()>
	//   44   84:invokeinterface #1191 <Method boolean SearchView$OnQueryTextListener.onQueryTextChange(String)>
	//   45   89:pop             
		mOldQueryText = ((CharSequence) (charsequence.toString()));
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:invokeinterface #1149 <Method String CharSequence.toString()>
	//   49   97:putfield        #1184 <Field CharSequence mOldQueryText>
	//   50  100:return          
	}

	void onTextFocusChanged()
	{
		updateViewsVisibility(isIconified());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #804 <Method boolean isIconified()>
	//    3    5:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
		postUpdateFocusedState();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1194 <Method void postUpdateFocusedState()>
		if(mSearchSrcTextView.hasFocus())
	//*   6   12:aload_0         
	//*   7   13:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   8   16:invokevirtual   #1195 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   9   19:ifeq            26
			forceSuggestionQuery();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #1197 <Method void forceSuggestionQuery()>
	//   12   26:return          
	}

	void onVoiceClicked()
	{
		if(mSearchable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #556 <Field SearchableInfo mSearchable>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Object obj = ((Object) (mSearchable));
	//    4    8:aload_0         
	//    5    9:getfield        #556 <Field SearchableInfo mSearchable>
	//    6   12:astore_1        
		try
		{
			if(((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #771 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
	//*   9   17:ifeq            41
			{
				obj = ((Object) (createVoiceWebSearchIntent(mVoiceWebSearchIntent, ((SearchableInfo) (obj)))));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #463 <Field Intent mVoiceWebSearchIntent>
	//   13   25:aload_1         
	//   14   26:invokespecial   #1202 <Method Intent createVoiceWebSearchIntent(Intent, SearchableInfo)>
	//   15   29:astore_1        
				getContext().startActivity(((Intent) (obj)));
	//   16   30:aload_0         
	//   17   31:invokevirtual   #643 <Method Context getContext()>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #808 <Method void Context.startActivity(Intent)>
				break MISSING_BLOCK_LABEL_66;
	//   20   38:goto            66
			}
		}
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #774 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
	//*  23   45:ifeq            66
	//*  24   48:aload_0         
	//*  25   49:aload_0         
	//*  26   50:getfield        #480 <Field Intent mVoiceAppSearchIntent>
	//*  27   53:aload_1         
	//*  28   54:invokespecial   #1204 <Method Intent createVoiceAppSearchIntent(Intent, SearchableInfo)>
	//*  29   57:astore_1        
	//*  30   58:aload_0         
	//*  31   59:invokevirtual   #643 <Method Context getContext()>
	//*  32   62:aload_1         
	//*  33   63:invokevirtual   #808 <Method void Context.startActivity(Intent)>
	//*  34   66:return          
		catch(ActivityNotFoundException activitynotfoundexception)
	//*  35   67:astore_1        
		{
			Log.w("SearchView", "Could not find voice search activity");
	//   36   68:ldc1            #65  <String "SearchView">
	//   37   70:ldc2            #1206 <String "Could not find voice search activity">
	//   38   73:invokestatic    #1209 <Method int Log.w(String, String)>
	//   39   76:pop             
			return;
	//   40   77:return          
		}
		if(((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer())
		{
			obj = ((Object) (createVoiceAppSearchIntent(mVoiceAppSearchIntent, ((SearchableInfo) (obj)))));
			getContext().startActivity(((Intent) (obj)));
		}
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1212 <Method void LinearLayoutCompat.onWindowFocusChanged(boolean)>
		postUpdateFocusedState();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1194 <Method void postUpdateFocusedState()>
	//    5    9:return          
	}

	public boolean requestFocus(int i, Rect rect)
	{
		if(mClearingFocus)
	//*   0    0:aload_0         
	//*   1    1:getfield        #993 <Field boolean mClearingFocus>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!isFocusable())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #1216 <Method boolean isFocusable()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(!isIconified())
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #804 <Method boolean isIconified()>
	//*  12   22:ifne            46
		{
			boolean flag = mSearchSrcTextView.requestFocus(i, rect);
	//   13   25:aload_0         
	//   14   26:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   15   29:iload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #1218 <Method boolean SearchView$SearchAutoComplete.requestFocus(int, Rect)>
	//   18   34:istore_3        
			if(flag)
	//*  19   35:iload_3         
	//*  20   36:ifeq            44
				updateViewsVisibility(false);
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
			return flag;
	//   24   44:iload_3         
	//   25   45:ireturn         
		} else
		{
			return super.requestFocus(i, rect);
	//   26   46:aload_0         
	//   27   47:iload_1         
	//   28   48:aload_2         
	//   29   49:invokespecial   #1219 <Method boolean LinearLayoutCompat.requestFocus(int, Rect)>
	//   30   52:ireturn         
		}
	}

	public void setAppSearchData(Bundle bundle)
	{
		mAppSearchData = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #542 <Field Bundle mAppSearchData>
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
	//    3    5:invokevirtual   #1227 <Method void onCloseClicked()>
			return;
	//    4    8:return          
		} else
		{
			onSearchClicked();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1229 <Method void onSearchClicked()>
			return;
	//    7   13:return          
		}
	}

	public void setIconifiedByDefault(boolean flag)
	{
		if(mIconifiedByDefault == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #499 <Field boolean mIconifiedByDefault>
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
	//    7   11:putfield        #499 <Field boolean mIconifiedByDefault>
			updateViewsVisibility(flag);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
			updateQueryHint();
	//   11   19:aload_0         
	//   12   20:invokespecial   #505 <Method void updateQueryHint()>
			return;
	//   13   23:return          
		}
	}

	public void setImeOptions(int i)
	{
		mSearchSrcTextView.setImeOptions(i);
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #908 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
	//    4    8:return          
	}

	void setImeVisibility(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
		{
			post(mShowImeRunnable);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #179 <Field Runnable mShowImeRunnable>
	//    5    9:invokevirtual   #839 <Method boolean post(Runnable)>
	//    6   12:pop             
			return;
	//    7   13:return          
		}
		removeCallbacks(mShowImeRunnable);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #179 <Field Runnable mShowImeRunnable>
	//   11   19:invokevirtual   #1053 <Method boolean removeCallbacks(Runnable)>
	//   12   22:pop             
		InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
	//   13   23:aload_0         
	//   14   24:invokevirtual   #643 <Method Context getContext()>
	//   15   27:ldc2            #1231 <String "input_method">
	//   16   30:invokevirtual   #1235 <Method Object Context.getSystemService(String)>
	//   17   33:checkcast       #1237 <Class InputMethodManager>
	//   18   36:astore_2        
		if(inputmethodmanager != null)
	//*  19   37:aload_2         
	//*  20   38:ifnull          51
			inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #1241 <Method android.os.IBinder getWindowToken()>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #1245 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   26   50:pop             
	//   27   51:return          
	}

	public void setInputType(int i)
	{
		mSearchSrcTextView.setInputType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #917 <Method void SearchView$SearchAutoComplete.setInputType(int)>
	//    4    8:return          
	}

	public void setMaxWidth(int i)
	{
		mMaxWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1012 <Field int mMaxWidth>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1127 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setOnCloseListener(OnCloseListener oncloselistener)
	{
		mOnCloseListener = oncloselistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1043 <Field SearchView$OnCloseListener mOnCloseListener>
	//    3    5:return          
	}

	public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
	{
		mOnQueryTextFocusChangeListener = onfocuschangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1250 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
	//    3    5:return          
	}

	public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
	{
		mOnQueryChangeListener = onquerytextlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1148 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
	//    3    5:return          
	}

	public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
	{
		mOnSearchClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1135 <Field android.view.View$OnClickListener mOnSearchClickListener>
	//    3    5:return          
	}

	public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
	{
		mOnSuggestionListener = onsuggestionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1058 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
	//    3    5:return          
	}

	public void setQuery(CharSequence charsequence, boolean flag)
	{
		mSearchSrcTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
		if(charsequence != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
		{
			mSearchSrcTextView.setSelection(mSearchSrcTextView.length());
	//    6   12:aload_0         
	//    7   13:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    8   16:aload_0         
	//    9   17:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   10   20:invokevirtual   #1171 <Method int SearchView$SearchAutoComplete.length()>
	//   11   23:invokevirtual   #867 <Method void SearchView$SearchAutoComplete.setSelection(int)>
			mUserQuery = charsequence;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #533 <Field CharSequence mUserQuery>
		}
		if(flag && !TextUtils.isEmpty(charsequence))
	//*  15   31:iload_2         
	//*  16   32:ifeq            46
	//*  17   35:aload_1         
	//*  18   36:invokestatic    #859 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   39:ifne            46
			onSubmitQuery();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #1257 <Method void onSubmitQuery()>
	//   22   46:return          
	}

	public void setQueryHint(CharSequence charsequence)
	{
		mQueryHint = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #430 <Field CharSequence mQueryHint>
		updateQueryHint();
	//    3    5:aload_0         
	//    4    6:invokespecial   #505 <Method void updateQueryHint()>
	//    5    9:return          
	}

	public void setQueryRefinementEnabled(boolean flag)
	{
		mQueryRefinement = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #930 <Field boolean mQueryRefinement>
		if(mSuggestionsAdapter instanceof SuggestionsAdapter)
	//*   3    5:aload_0         
	//*   4    6:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//*   5    9:instanceof      #574 <Class SuggestionsAdapter>
	//*   6   12:ifeq            39
		{
			SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
	//    7   15:aload_0         
	//    8   16:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//    9   19:checkcast       #574 <Class SuggestionsAdapter>
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
	//   20   36:invokevirtual   #933 <Method void SuggestionsAdapter.setQueryRefinement(int)>
		}
	//   21   39:return          
	}

	public void setSearchableInfo(SearchableInfo searchableinfo)
	{
		mSearchable = searchableinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #556 <Field SearchableInfo mSearchable>
		if(mSearchable != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #556 <Field SearchableInfo mSearchable>
	//*   5    9:ifnull          20
		{
			updateSearchAutoComplete();
	//    6   12:aload_0         
	//    7   13:invokespecial   #1264 <Method void updateSearchAutoComplete()>
			updateQueryHint();
	//    8   16:aload_0         
	//    9   17:invokespecial   #505 <Method void updateQueryHint()>
		}
		mVoiceButtonEnabled = hasVoiceSearch();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #1266 <Method boolean hasVoiceSearch()>
	//   13   25:putfield        #801 <Field boolean mVoiceButtonEnabled>
		if(mVoiceButtonEnabled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #801 <Field boolean mVoiceButtonEnabled>
	//*  16   32:ifeq            44
			mSearchSrcTextView.setPrivateImeOptions("nm");
	//   17   35:aload_0         
	//   18   36:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//   19   39:ldc1            #62  <String "nm">
	//   20   41:invokevirtual   #1269 <Method void SearchView$SearchAutoComplete.setPrivateImeOptions(String)>
		updateViewsVisibility(isIconified());
	//   21   44:aload_0         
	//   22   45:aload_0         
	//   23   46:invokevirtual   #804 <Method boolean isIconified()>
	//   24   49:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
	//   25   52:return          
	}

	public void setSubmitButtonEnabled(boolean flag)
	{
		mSubmitButtonEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #799 <Field boolean mSubmitButtonEnabled>
		updateViewsVisibility(isIconified());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #804 <Method boolean isIconified()>
	//    6   10:invokespecial   #502 <Method void updateViewsVisibility(boolean)>
	//    7   13:return          
	}

	public void setSuggestionsAdapter(CursorAdapter cursoradapter)
	{
		mSuggestionsAdapter = cursoradapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #820 <Field CursorAdapter mSuggestionsAdapter>
		mSearchSrcTextView.setAdapter(((android.widget.ListAdapter) (mSuggestionsAdapter)));
	//    3    5:aload_0         
	//    4    6:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//    5    9:aload_0         
	//    6   10:getfield        #820 <Field CursorAdapter mSuggestionsAdapter>
	//    7   13:invokevirtual   #928 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
	//    8   16:return          
	}

	void updateFocusedState()
	{
		int ai[];
		if(mSearchSrcTextView.hasFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #251 <Field SearchView$SearchAutoComplete mSearchSrcTextView>
	//*   2    4:invokevirtual   #1195 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
	//*   3    7:ifeq            17
			ai = FOCUSED_STATE_SET;
	//    4   10:getstatic       #1276 <Field int[] FOCUSED_STATE_SET>
	//    5   13:astore_1        
		else
	//*   6   14:goto            21
			ai = EMPTY_STATE_SET;
	//    7   17:getstatic       #882 <Field int[] EMPTY_STATE_SET>
	//    8   20:astore_1        
		Drawable drawable = mSearchPlate.getBackground();
	//    9   21:aload_0         
	//   10   22:getfield        #264 <Field View mSearchPlate>
	//   11   25:invokevirtual   #1279 <Method Drawable View.getBackground()>
	//   12   28:astore_2        
		if(drawable != null)
	//*  13   29:aload_2         
	//*  14   30:ifnull          39
			drawable.setState(ai);
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #886 <Method boolean Drawable.setState(int[])>
	//   18   38:pop             
		drawable = mSubmitArea.getBackground();
	//   19   39:aload_0         
	//   20   40:getfield        #269 <Field View mSubmitArea>
	//   21   43:invokevirtual   #1279 <Method Drawable View.getBackground()>
	//   22   46:astore_2        
		if(drawable != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          57
			drawable.setState(ai);
	//   25   51:aload_2         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #886 <Method boolean Drawable.setState(int[])>
	//   28   56:pop             
		invalidate();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #1282 <Method void invalidate()>
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
	private Runnable mShowImeRunnable = new Runnable() {

		public void run()
		{
			InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field SearchView this$0>
		//    2    4:invokevirtual   #23  <Method Context SearchView.getContext()>
		//    3    7:ldc1            #25  <String "input_method">
		//    4    9:invokevirtual   #31  <Method Object Context.getSystemService(String)>
		//    5   12:checkcast       #33  <Class InputMethodManager>
		//    6   15:astore_1        
			if(inputmethodmanager != null)
		//*   7   16:aload_1         
		//*   8   17:ifnull          32
				SearchView.HIDDEN_METHOD_INVOKER.showSoftInputUnchecked(inputmethodmanager, ((View) (SearchView.this)), 0);
		//    9   20:getstatic       #37  <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
		//   10   23:aload_1         
		//   11   24:aload_0         
		//   12   25:getfield        #14  <Field SearchView this$0>
		//   13   28:iconst_0        
		//   14   29:invokevirtual   #43  <Method void SearchView$AutoCompleteTextViewReflector.showSoftInputUnchecked(InputMethodManager, View, int)>
		//   15   32:return          
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
		//*  27   57:invokestatic    #45  <Method boolean SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete)>
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
	//    0    0:new             #32  <Class SearchView$AutoCompleteTextViewReflector>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void SearchView$AutoCompleteTextViewReflector()>
	//    3    7:putstatic       #149 <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
	//*   4   10:return          
	}
}
