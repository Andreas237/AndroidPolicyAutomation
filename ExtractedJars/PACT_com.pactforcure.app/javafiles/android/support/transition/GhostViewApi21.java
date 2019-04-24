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
	static class Creator
		implements GhostViewImpl.Creator
	{

		public GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
		{
			GhostViewApi21.fetchAddGhostMethod();
		//    0    0:invokestatic    #23  <Method void GhostViewApi21.access$000()>
			if(GhostViewApi21.sAddGhostMethod == null)
				break MISSING_BLOCK_LABEL_60;
		//    1    3:invokestatic    #27  <Method Method GhostViewApi21.access$100()>
		//    2    6:ifnull          60
			view = ((View) (new GhostViewApi21((View)GhostViewApi21.sAddGhostMethod.invoke(((Object) (null)), new Object[] {
				view, viewgroup, matrix
			}))));
		//    3    9:new             #8   <Class GhostViewApi21>
		//    4   12:dup             
		//    5   13:invokestatic    #27  <Method Method GhostViewApi21.access$100()>
		//    6   16:aconst_null     
		//    7   17:iconst_3        
		//    8   18:anewarray       Object[]
		//    9   21:dup             
		//   10   22:iconst_0        
		//   11   23:aload_1         
		//   12   24:aastore         
		//   13   25:dup             
		//   14   26:iconst_1        
		//   15   27:aload_2         
		//   16   28:aastore         
		//   17   29:dup             
		//   18   30:iconst_2        
		//   19   31:aload_3         
		//   20   32:aastore         
		//   21   33:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
		//   22   36:checkcast       #35  <Class View>
		//   23   39:aconst_null     
		//   24   40:invokespecial   #38  <Method void GhostViewApi21(View, GhostViewApi21$1)>
		//   25   43:astore_1        
			return ((GhostViewImpl) (view));
		//   26   44:aload_1         
		//   27   45:areturn         
			view;
		//   28   46:astore_1        
			throw new RuntimeException(((InvocationTargetException) (view)).getCause());
		//   29   47:new             #40  <Class RuntimeException>
		//   30   50:dup             
		//   31   51:aload_1         
		//   32   52:invokevirtual   #44  <Method Throwable InvocationTargetException.getCause()>
		//   33   55:invokespecial   #47  <Method void RuntimeException(Throwable)>
		//   34   58:athrow          
			view;
		//   35   59:astore_1        
			return null;
		//   36   60:aconst_null     
		//   37   61:areturn         
		}

		public void removeGhost(View view)
		{
			GhostViewApi21.fetchRemoveGhostMethod();
		//    0    0:invokestatic    #52  <Method void GhostViewApi21.access$300()>
			if(GhostViewApi21.sRemoveGhostMethod == null)
				break MISSING_BLOCK_LABEL_25;
		//    1    3:invokestatic    #55  <Method Method GhostViewApi21.access$400()>
		//    2    6:ifnull          25
			GhostViewApi21.sRemoveGhostMethod.invoke(((Object) (null)), new Object[] {
				view
			});
		//    3    9:invokestatic    #55  <Method Method GhostViewApi21.access$400()>
		//    4   12:aconst_null     
		//    5   13:iconst_1        
		//    6   14:anewarray       Object[]
		//    7   17:dup             
		//    8   18:iconst_0        
		//    9   19:aload_1         
		//   10   20:aastore         
		//   11   21:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
		//   12   24:pop             
			return;
		//   13   25:return          
			view;
		//   14   26:astore_1        
			throw new RuntimeException(((InvocationTargetException) (view)).getCause());
		//   15   27:new             #40  <Class RuntimeException>
		//   16   30:dup             
		//   17   31:aload_1         
		//   18   32:invokevirtual   #44  <Method Throwable InvocationTargetException.getCause()>
		//   19   35:invokespecial   #47  <Method void RuntimeException(Throwable)>
		//   20   38:athrow          
			view;
		//   21   39:astore_1        
		//   22   40:return          
		}

		Creator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	private GhostViewApi21(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mGhostView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field View mGhostView>
	//    5    9:return          
	}


	private static void fetchAddGhostMethod()
	{
		if(!sAddGhostMethodFetched)
	//*   0    0:getstatic       #62  <Field boolean sAddGhostMethodFetched>
	//*   1    3:ifne            50
		{
			try
			{
				fetchGhostViewClass();
	//    2    6:invokestatic    #65  <Method void fetchGhostViewClass()>
				sAddGhostMethod = sGhostViewClass.getDeclaredMethod("addGhost", new Class[] {
					android/view/View, android/view/ViewGroup, android/graphics/Matrix
				});
	//    3    9:getstatic       #67  <Field Class sGhostViewClass>
	//    4   12:ldc1            #69  <String "addGhost">
	//    5   14:iconst_3        
	//    6   15:anewarray       Class[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:ldc1            #73  <Class View>
	//   10   22:aastore         
	//   11   23:dup             
	//   12   24:iconst_1        
	//   13   25:ldc1            #75  <Class ViewGroup>
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_2        
	//   17   30:ldc1            #77  <Class Matrix>
	//   18   32:aastore         
	//   19   33:invokevirtual   #81  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   20   36:putstatic       #51  <Field Method sAddGhostMethod>
				sAddGhostMethod.setAccessible(true);
	//   21   39:getstatic       #51  <Field Method sAddGhostMethod>
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #87  <Method void Method.setAccessible(boolean)>
			}
	//*  24   46:iconst_1        
	//*  25   47:putstatic       #62  <Field boolean sAddGhostMethodFetched>
	//*  26   50:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  27   51:astore_0        
			{
				Log.i("GhostViewApi21", "Failed to retrieve addGhost method", ((Throwable) (nosuchmethodexception)));
	//   28   52:ldc1            #18  <String "GhostViewApi21">
	//   29   54:ldc1            #89  <String "Failed to retrieve addGhost method">
	//   30   56:aload_0         
	//   31   57:invokestatic    #95  <Method int Log.i(String, String, Throwable)>
	//   32   60:pop             
			}
			sAddGhostMethodFetched = true;
		}
	//*  33   61:goto            46
	}

	private static void fetchGhostViewClass()
	{
		if(!sGhostViewClassFetched)
	//*   0    0:getstatic       #99  <Field boolean sGhostViewClassFetched>
	//*   1    3:ifne            18
		{
			try
			{
				sGhostViewClass = Class.forName("android.view.GhostView");
	//    2    6:ldc1            #101 <String "android.view.GhostView">
	//    3    8:invokestatic    #105 <Method Class Class.forName(String)>
	//    4   11:putstatic       #67  <Field Class sGhostViewClass>
			}
	//*   5   14:iconst_1        
	//*   6   15:putstatic       #99  <Field boolean sGhostViewClassFetched>
	//*   7   18:return          
			catch(ClassNotFoundException classnotfoundexception)
	//*   8   19:astore_0        
			{
				Log.i("GhostViewApi21", "Failed to retrieve GhostView class", ((Throwable) (classnotfoundexception)));
	//    9   20:ldc1            #18  <String "GhostViewApi21">
	//   10   22:ldc1            #107 <String "Failed to retrieve GhostView class">
	//   11   24:aload_0         
	//   12   25:invokestatic    #95  <Method int Log.i(String, String, Throwable)>
	//   13   28:pop             
			}
			sGhostViewClassFetched = true;
		}
	//*  14   29:goto            14
	}

	private static void fetchRemoveGhostMethod()
	{
		if(!sRemoveGhostMethodFetched)
	//*   0    0:getstatic       #109 <Field boolean sRemoveGhostMethodFetched>
	//*   1    3:ifne            40
		{
			try
			{
				fetchGhostViewClass();
	//    2    6:invokestatic    #65  <Method void fetchGhostViewClass()>
				sRemoveGhostMethod = sGhostViewClass.getDeclaredMethod("removeGhost", new Class[] {
					android/view/View
				});
	//    3    9:getstatic       #67  <Field Class sGhostViewClass>
	//    4   12:ldc1            #111 <String "removeGhost">
	//    5   14:iconst_1        
	//    6   15:anewarray       Class[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:ldc1            #73  <Class View>
	//   10   22:aastore         
	//   11   23:invokevirtual   #81  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   12   26:putstatic       #58  <Field Method sRemoveGhostMethod>
				sRemoveGhostMethod.setAccessible(true);
	//   13   29:getstatic       #58  <Field Method sRemoveGhostMethod>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #87  <Method void Method.setAccessible(boolean)>
			}
	//*  16   36:iconst_1        
	//*  17   37:putstatic       #109 <Field boolean sRemoveGhostMethodFetched>
	//*  18   40:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  19   41:astore_0        
			{
				Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", ((Throwable) (nosuchmethodexception)));
	//   20   42:ldc1            #18  <String "GhostViewApi21">
	//   21   44:ldc1            #113 <String "Failed to retrieve removeGhost method">
	//   22   46:aload_0         
	//   23   47:invokestatic    #95  <Method int Log.i(String, String, Throwable)>
	//   24   50:pop             
			}
			sRemoveGhostMethodFetched = true;
		}
	//*  25   51:goto            36
	}

	public void reserveEndViewTransition(ViewGroup viewgroup, View view)
	{
	//    0    0:return          
	}

	public void setVisibility(int i)
	{
		mGhostView.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field View mGhostView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #119 <Method void View.setVisibility(int)>
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


/*
	static void access$000()
	{
		fetchAddGhostMethod();
	//    0    0:invokestatic    #47  <Method void fetchAddGhostMethod()>
		return;
	//    1    3:return          
	}

*/


/*
	static Method access$100()
	{
		return sAddGhostMethod;
	//    0    0:getstatic       #51  <Field Method sAddGhostMethod>
	//    1    3:areturn         
	}

*/


/*
	static void access$300()
	{
		fetchRemoveGhostMethod();
	//    0    0:invokestatic    #55  <Method void fetchRemoveGhostMethod()>
		return;
	//    1    3:return          
	}

*/


/*
	static Method access$400()
	{
		return sRemoveGhostMethod;
	//    0    0:getstatic       #58  <Field Method sRemoveGhostMethod>
	//    1    3:areturn         
	}

*/
}
