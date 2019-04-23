// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			GhostViewImpl

class GhostViewApi21
	implements GhostViewImpl
{

	private GhostViewApi21(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mGhostView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field View mGhostView>
	//    5    9:return          
	}

	static GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
	{
		fetchAddGhostMethod();
	//    0    0:invokestatic    #44  <Method void fetchAddGhostMethod()>
		Method method = sAddGhostMethod;
	//    1    3:getstatic       #46  <Field Method sAddGhostMethod>
	//    2    6:astore_3        
		if(method != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          58
		{
			try
			{
				view = ((View) (new GhostViewApi21((View)method.invoke(((Object) (null)), new Object[] {
					view, viewgroup, matrix
				}))));
	//    5   11:new             #2   <Class GhostViewApi21>
	//    6   14:dup             
	//    7   15:aload_3         
	//    8   16:aconst_null     
	//    9   17:iconst_3        
	//   10   18:anewarray       Object[]
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:aload_1         
	//   18   28:aastore         
	//   19   29:dup             
	//   20   30:iconst_2        
	//   21   31:aload_2         
	//   22   32:aastore         
	//   23   33:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   24   36:checkcast       #54  <Class View>
	//   25   39:invokespecial   #56  <Method void GhostViewApi21(View)>
	//   26   42:astore_0        
			}
	//*  27   43:aload_0         
	//*  28   44:areturn         
	//*  29   45:astore_0        
	//*  30   46:new             #58  <Class RuntimeException>
	//*  31   49:dup             
	//*  32   50:aload_0         
	//*  33   51:invokevirtual   #62  <Method Throwable InvocationTargetException.getCause()>
	//*  34   54:invokespecial   #65  <Method void RuntimeException(Throwable)>
	//*  35   57:athrow          
	//*  36   58:aconst_null     
	//*  37   59:areturn         
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  38   60:astore_0        
			{
				return null;
	//   39   61:aconst_null     
	//   40   62:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
			return ((GhostViewImpl) (view));
		} else
		{
			return null;
		}
	}

	private static void fetchAddGhostMethod()
	{
		if(!sAddGhostMethodFetched)
	//*   0    0:getstatic       #69  <Field boolean sAddGhostMethodFetched>
	//*   1    3:ifne            63
		{
			try
			{
				fetchGhostViewClass();
	//    2    6:invokestatic    #72  <Method void fetchGhostViewClass()>
				sAddGhostMethod = sGhostViewClass.getDeclaredMethod("addGhost", new Class[] {
					android/view/View, android/view/ViewGroup, android/graphics/Matrix
				});
	//    3    9:getstatic       #74  <Field Class sGhostViewClass>
	//    4   12:ldc1            #75  <String "addGhost">
	//    5   14:iconst_3        
	//    6   15:anewarray       Class[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:ldc1            #54  <Class View>
	//   10   22:aastore         
	//   11   23:dup             
	//   12   24:iconst_1        
	//   13   25:ldc1            #79  <Class ViewGroup>
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_2        
	//   17   30:ldc1            #81  <Class Matrix>
	//   18   32:aastore         
	//   19   33:invokevirtual   #85  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   20   36:putstatic       #46  <Field Method sAddGhostMethod>
				sAddGhostMethod.setAccessible(true);
	//   21   39:getstatic       #46  <Field Method sAddGhostMethod>
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #89  <Method void Method.setAccessible(boolean)>
			}
	//*  24   46:goto            59
			catch(NoSuchMethodException nosuchmethodexception)
	//*  25   49:astore_0        
			{
				Log.i("GhostViewApi21", "Failed to retrieve addGhost method", ((Throwable) (nosuchmethodexception)));
	//   26   50:ldc1            #13  <String "GhostViewApi21">
	//   27   52:ldc1            #91  <String "Failed to retrieve addGhost method">
	//   28   54:aload_0         
	//   29   55:invokestatic    #97  <Method int Log.i(String, String, Throwable)>
	//   30   58:pop             
			}
			sAddGhostMethodFetched = true;
	//   31   59:iconst_1        
	//   32   60:putstatic       #69  <Field boolean sAddGhostMethodFetched>
		}
	//   33   63:return          
	}

	private static void fetchGhostViewClass()
	{
		if(!sGhostViewClassFetched)
	//*   0    0:getstatic       #101 <Field boolean sGhostViewClassFetched>
	//*   1    3:ifne            31
		{
			try
			{
				sGhostViewClass = Class.forName("android.view.GhostView");
	//    2    6:ldc1            #103 <String "android.view.GhostView">
	//    3    8:invokestatic    #107 <Method Class Class.forName(String)>
	//    4   11:putstatic       #74  <Field Class sGhostViewClass>
			}
	//*   5   14:goto            27
			catch(ClassNotFoundException classnotfoundexception)
	//*   6   17:astore_0        
			{
				Log.i("GhostViewApi21", "Failed to retrieve GhostView class", ((Throwable) (classnotfoundexception)));
	//    7   18:ldc1            #13  <String "GhostViewApi21">
	//    8   20:ldc1            #109 <String "Failed to retrieve GhostView class">
	//    9   22:aload_0         
	//   10   23:invokestatic    #97  <Method int Log.i(String, String, Throwable)>
	//   11   26:pop             
			}
			sGhostViewClassFetched = true;
	//   12   27:iconst_1        
	//   13   28:putstatic       #101 <Field boolean sGhostViewClassFetched>
		}
	//   14   31:return          
	}

	private static void fetchRemoveGhostMethod()
	{
		if(!sRemoveGhostMethodFetched)
	//*   0    0:getstatic       #112 <Field boolean sRemoveGhostMethodFetched>
	//*   1    3:ifne            53
		{
			try
			{
				fetchGhostViewClass();
	//    2    6:invokestatic    #72  <Method void fetchGhostViewClass()>
				sRemoveGhostMethod = sGhostViewClass.getDeclaredMethod("removeGhost", new Class[] {
					android/view/View
				});
	//    3    9:getstatic       #74  <Field Class sGhostViewClass>
	//    4   12:ldc1            #114 <String "removeGhost">
	//    5   14:iconst_1        
	//    6   15:anewarray       Class[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:ldc1            #54  <Class View>
	//   10   22:aastore         
	//   11   23:invokevirtual   #85  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   12   26:putstatic       #116 <Field Method sRemoveGhostMethod>
				sRemoveGhostMethod.setAccessible(true);
	//   13   29:getstatic       #116 <Field Method sRemoveGhostMethod>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #89  <Method void Method.setAccessible(boolean)>
			}
	//*  16   36:goto            49
			catch(NoSuchMethodException nosuchmethodexception)
	//*  17   39:astore_0        
			{
				Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", ((Throwable) (nosuchmethodexception)));
	//   18   40:ldc1            #13  <String "GhostViewApi21">
	//   19   42:ldc1            #118 <String "Failed to retrieve removeGhost method">
	//   20   44:aload_0         
	//   21   45:invokestatic    #97  <Method int Log.i(String, String, Throwable)>
	//   22   48:pop             
			}
			sRemoveGhostMethodFetched = true;
	//   23   49:iconst_1        
	//   24   50:putstatic       #112 <Field boolean sRemoveGhostMethodFetched>
		}
	//   25   53:return          
	}

	static void removeGhost(View view)
	{
		fetchRemoveGhostMethod();
	//    0    0:invokestatic    #120 <Method void fetchRemoveGhostMethod()>
		Method method = sRemoveGhostMethod;
	//    1    3:getstatic       #116 <Field Method sRemoveGhostMethod>
	//    2    6:astore_1        
		if(method != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          39
			try
			{
				method.invoke(((Object) (null)), new Object[] {
					view
				});
	//    5   11:aload_1         
	//    6   12:aconst_null     
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:aastore         
	//   13   21:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   14   24:pop             
				return;
	//   15   25:return          
			}
	//*  16   26:astore_0        
	//*  17   27:new             #58  <Class RuntimeException>
	//*  18   30:dup             
	//*  19   31:aload_0         
	//*  20   32:invokevirtual   #62  <Method Throwable InvocationTargetException.getCause()>
	//*  21   35:invokespecial   #65  <Method void RuntimeException(Throwable)>
	//*  22   38:athrow          
	//*  23   39:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  24   40:astore_0        
			{
				return;
	//   25   41:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	public void reserveEndViewTransition(ViewGroup viewgroup, View view)
	{
	//    0    0:return          
	}

	public void setVisibility(int i)
	{
		mGhostView.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field View mGhostView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method void View.setVisibility(int)>
	//    4    8:return          
	}

	private static final String TAG = "GhostViewApi21";
	private static Method sAddGhostMethod;
	private static boolean sAddGhostMethodFetched;
	private static Class sGhostViewClass;
	private static boolean sGhostViewClassFetched;
	private static Method sRemoveGhostMethod;
	private static boolean sRemoveGhostMethodFetched;
	private final View mGhostView;
}
