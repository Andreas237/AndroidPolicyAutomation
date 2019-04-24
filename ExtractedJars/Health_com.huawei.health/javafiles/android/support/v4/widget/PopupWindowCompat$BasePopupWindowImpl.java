// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat

static class PopupWindowCompat$BasePopupWindowImpl
	implements PopupWindowCompat.PopupWindowImpl
{

	public boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getWindowLayoutType(PopupWindow popupwindow)
	{
		if(!sGetWindowLayoutTypeMethodAttempted)
	//*   0    0:getstatic       #28  <Field boolean sGetWindowLayoutTypeMethodAttempted>
	//*   1    3:ifne            35
		{
			try
			{
				sGetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getWindowLayoutType", new Class[0]);
	//    2    6:ldc1            #30  <Class PopupWindow>
	//    3    8:ldc1            #31  <String "getWindowLayoutType">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #37  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #39  <Field Method sGetWindowLayoutTypeMethod>
				sGetWindowLayoutTypeMethod.setAccessible(true);
	//    8   20:getstatic       #39  <Field Method sGetWindowLayoutTypeMethod>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:goto            31
			catch(Exception exception) { }
	//   12   30:astore_3        
			sGetWindowLayoutTypeMethodAttempted = true;
	//   13   31:iconst_1        
	//   14   32:putstatic       #28  <Field boolean sGetWindowLayoutTypeMethodAttempted>
		}
		if(sGetWindowLayoutTypeMethod == null)
			break MISSING_BLOCK_LABEL_62;
	//   15   35:getstatic       #39  <Field Method sGetWindowLayoutTypeMethod>
	//   16   38:ifnull          62
		int i = ((Integer)sGetWindowLayoutTypeMethod.invoke(((Object) (popupwindow)), new Object[0])).intValue();
	//   17   41:getstatic       #39  <Field Method sGetWindowLayoutTypeMethod>
	//   18   44:aload_1         
	//   19   45:iconst_0        
	//   20   46:anewarray       Object[]
	//   21   49:invokevirtual   #49  <Method Object Method.invoke(Object, Object[])>
	//   22   52:checkcast       #51  <Class Integer>
	//   23   55:invokevirtual   #55  <Method int Integer.intValue()>
	//   24   58:istore_2        
		return i;
	//   25   59:iload_2         
	//   26   60:ireturn         
		popupwindow;
	//   27   61:astore_1        
		return 0;
	//   28   62:iconst_0        
	//   29   63:ireturn         
	}

	public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
	//    0    0:return          
	}

	public void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		if(!sSetWindowLayoutTypeMethodAttempted)
	//*   0    0:getstatic       #61  <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*   1    3:ifne            41
		{
			try
			{
				sSetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setWindowLayoutType", new Class[] {
					Integer.TYPE
				});
	//    2    6:ldc1            #30  <Class PopupWindow>
	//    3    8:ldc1            #62  <String "setWindowLayoutType">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #66  <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #37  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #68  <Field Method sSetWindowLayoutTypeMethod>
				sSetWindowLayoutTypeMethod.setAccessible(true);
	//   12   26:getstatic       #68  <Field Method sSetWindowLayoutTypeMethod>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:goto            37
			catch(Exception exception) { }
	//   16   36:astore_3        
			sSetWindowLayoutTypeMethodAttempted = true;
	//   17   37:iconst_1        
	//   18   38:putstatic       #61  <Field boolean sSetWindowLayoutTypeMethodAttempted>
		}
		if(sSetWindowLayoutTypeMethod != null)
	//*  19   41:getstatic       #68  <Field Method sSetWindowLayoutTypeMethod>
	//*  20   44:ifnull          68
			try
			{
				sSetWindowLayoutTypeMethod.invoke(((Object) (popupwindow)), new Object[] {
					Integer.valueOf(i)
				});
	//   21   47:getstatic       #68  <Field Method sSetWindowLayoutTypeMethod>
	//   22   50:aload_1         
	//   23   51:iconst_1        
	//   24   52:anewarray       Object[]
	//   25   55:dup             
	//   26   56:iconst_0        
	//   27   57:iload_2         
	//   28   58:invokestatic    #72  <Method Integer Integer.valueOf(int)>
	//   29   61:aastore         
	//   30   62:invokevirtual   #49  <Method Object Method.invoke(Object, Object[])>
	//   31   65:pop             
				return;
	//   32   66:return          
			}
			// Misplaced declaration of an exception variable
			catch(PopupWindow popupwindow) { }
	//   33   67:astore_1        
	//   34   68:return          
	}

	public void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
	{
		int l = i;
	//    0    0:iload_3         
	//    1    1:istore          6
		if((GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(view)) & 7) == 5)
	//*   2    3:iload           5
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #80  <Method int ViewCompat.getLayoutDirection(View)>
	//*   5    9:invokestatic    #86  <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*   6   12:bipush          7
	//*   7   14:iand            
	//*   8   15:iconst_5        
	//*   9   16:icmpne          32
			l = i - (popupwindow.getWidth() - view.getWidth());
	//   10   19:iload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #89  <Method int PopupWindow.getWidth()>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #92  <Method int View.getWidth()>
	//   15   28:isub            
	//   16   29:isub            
	//   17   30:istore          6
		popupwindow.showAsDropDown(view, l, j);
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:iload           6
	//   21   36:iload           4
	//   22   38:invokevirtual   #95  <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   23   41:return          
	}

	private static Method sGetWindowLayoutTypeMethod;
	private static boolean sGetWindowLayoutTypeMethodAttempted;
	private static Method sSetWindowLayoutTypeMethod;
	private static boolean sSetWindowLayoutTypeMethodAttempted;

	PopupWindowCompat$BasePopupWindowImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
