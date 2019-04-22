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

	SearchView$AutoCompleteTextViewReflector()
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
