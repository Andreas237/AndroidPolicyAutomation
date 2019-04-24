// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			SearchView

private static class SearchView$AutoCompleteTextViewReflector
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
