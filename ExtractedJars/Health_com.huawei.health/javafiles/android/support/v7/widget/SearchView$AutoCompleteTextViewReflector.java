// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			SearchView

static class SearchView$AutoCompleteTextViewReflector
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

	SearchView$AutoCompleteTextViewReflector()
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
