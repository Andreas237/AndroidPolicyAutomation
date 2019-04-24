// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			SearchView

private static class SearchView$a
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

	SearchView$a()
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
