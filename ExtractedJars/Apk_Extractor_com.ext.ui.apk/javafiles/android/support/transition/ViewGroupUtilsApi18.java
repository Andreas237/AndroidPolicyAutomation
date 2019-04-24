// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			ViewGroupUtilsApi14, ViewGroupOverlayApi18, ViewGroupOverlayImpl

class ViewGroupUtilsApi18 extends ViewGroupUtilsApi14
{

	ViewGroupUtilsApi18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ViewGroupUtilsApi14()>
	//    2    4:return          
	}

	private void fetchSuppressLayoutMethod()
	{
		if(!sSuppressLayoutMethodFetched)
	//*   0    0:getstatic       #25  <Field boolean sSuppressLayoutMethodFetched>
	//*   1    3:ifne            37
		{
			try
			{
				sSuppressLayoutMethod = ((Class) (android/view/ViewGroup)).getDeclaredMethod("suppressLayout", new Class[] {
					Boolean.TYPE
				});
	//    2    6:ldc1            #27  <Class ViewGroup>
	//    3    8:ldc1            #29  <String "suppressLayout">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #37  <Field Class Boolean.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #43  <Field Method sSuppressLayoutMethod>
				sSuppressLayoutMethod.setAccessible(true);
	//   12   26:getstatic       #43  <Field Method sSuppressLayoutMethod>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #49  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:iconst_1        
	//*  16   34:putstatic       #25  <Field boolean sSuppressLayoutMethodFetched>
	//*  17   37:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  18   38:astore_1        
			{
				Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", ((Throwable) (nosuchmethodexception)));
	//   19   39:ldc1            #11  <String "ViewUtilsApi18">
	//   20   41:ldc1            #51  <String "Failed to retrieve suppressLayout method">
	//   21   43:aload_1         
	//   22   44:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   23   47:pop             
			}
			sSuppressLayoutMethodFetched = true;
		}
	//*  24   48:goto            33
	}

	public ViewGroupOverlayImpl getOverlay(ViewGroup viewgroup)
	{
		return ((ViewGroupOverlayImpl) (new ViewGroupOverlayApi18(viewgroup)));
	//    0    0:new             #62  <Class ViewGroupOverlayApi18>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #65  <Method void ViewGroupOverlayApi18(ViewGroup)>
	//    4    8:areturn         
	}

	public void suppressLayout(ViewGroup viewgroup, boolean flag)
	{
		fetchSuppressLayoutMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void fetchSuppressLayoutMethod()>
		if(sSuppressLayoutMethod == null)
			break MISSING_BLOCK_LABEL_29;
	//    2    4:getstatic       #43  <Field Method sSuppressLayoutMethod>
	//    3    7:ifnull          29
		sSuppressLayoutMethod.invoke(((Object) (viewgroup)), new Object[] {
			Boolean.valueOf(flag)
		});
	//    4   10:getstatic       #43  <Field Method sSuppressLayoutMethod>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:iload_2         
	//   11   21:invokestatic    #79  <Method Boolean Boolean.valueOf(boolean)>
	//   12   24:aastore         
	//   13   25:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
	//   14   28:pop             
		return;
	//   15   29:return          
		viewgroup;
	//   16   30:astore_1        
		Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", ((Throwable) (viewgroup)));
	//   17   31:ldc1            #11  <String "ViewUtilsApi18">
	//   18   33:ldc1            #85  <String "Failed to invoke suppressLayout method">
	//   19   35:aload_1         
	//   20   36:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   21   39:pop             
		return;
	//   22   40:return          
		viewgroup;
	//   23   41:astore_1        
		Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", ((Throwable) (viewgroup)));
	//   24   42:ldc1            #11  <String "ViewUtilsApi18">
	//   25   44:ldc1            #87  <String "Error invoking suppressLayout method">
	//   26   46:aload_1         
	//   27   47:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   28   50:pop             
		return;
	//   29   51:return          
	}

	private static final String TAG = "ViewUtilsApi18";
	private static Method sSuppressLayoutMethod;
	private static boolean sSuppressLayoutMethodFetched;
}
