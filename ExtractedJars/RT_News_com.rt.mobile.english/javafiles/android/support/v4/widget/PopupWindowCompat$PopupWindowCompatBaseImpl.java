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

static class PopupWindowCompat$PopupWindowCompatBaseImpl
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
	//*   0    0:getstatic       #26  <Field boolean sGetWindowLayoutTypeMethodAttempted>
	//*   1    3:ifne            31
		{
			int i;
			try
			{
				sGetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getWindowLayoutType", new Class[0]);
	//    2    6:ldc1            #28  <Class PopupWindow>
	//    3    8:ldc1            #29  <String "getWindowLayoutType">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #35  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #37  <Field Method sGetWindowLayoutTypeMethod>
				sGetWindowLayoutTypeMethod.setAccessible(true);
	//    8   20:getstatic       #37  <Field Method sGetWindowLayoutTypeMethod>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #43  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:iconst_1        
	//*  12   28:putstatic       #26  <Field boolean sGetWindowLayoutTypeMethodAttempted>
	//*  13   31:getstatic       #37  <Field Method sGetWindowLayoutTypeMethod>
	//*  14   34:ifnull          57
	//*  15   37:getstatic       #37  <Field Method sGetWindowLayoutTypeMethod>
	//*  16   40:aload_1         
	//*  17   41:iconst_0        
	//*  18   42:anewarray       Object[]
	//*  19   45:invokevirtual   #47  <Method Object Method.invoke(Object, Object[])>
	//*  20   48:checkcast       #49  <Class Integer>
	//*  21   51:invokevirtual   #53  <Method int Integer.intValue()>
	//*  22   54:istore_2        
	//*  23   55:iload_2         
	//*  24   56:ireturn         
	//*  25   57:iconst_0        
	//*  26   58:ireturn         
			catch(Exception exception) { }
	//   27   59:astore_3        
			sGetWindowLayoutTypeMethodAttempted = true;
		}
		if(sGetWindowLayoutTypeMethod != null)
		{
			try
			{
				i = ((Integer)sGetWindowLayoutTypeMethod.invoke(((Object) (popupwindow)), new Object[0])).intValue();
			}
	//*  28   60:goto            27
			// Misplaced declaration of an exception variable
			catch(PopupWindow popupwindow)
	//*  29   63:astore_1        
			{
				return 0;
	//   30   64:iconst_0        
	//   31   65:ireturn         
			}
			return i;
		} else
		{
			return 0;
		}
	}

	public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
	//    0    0:return          
	}

	public void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		if(!sSetWindowLayoutTypeMethodAttempted)
	//*   0    0:getstatic       #59  <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*   1    3:ifne            37
		{
			try
			{
				sSetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setWindowLayoutType", new Class[] {
					Integer.TYPE
				});
	//    2    6:ldc1            #28  <Class PopupWindow>
	//    3    8:ldc1            #60  <String "setWindowLayoutType">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #64  <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #35  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #66  <Field Method sSetWindowLayoutTypeMethod>
				sSetWindowLayoutTypeMethod.setAccessible(true);
	//   12   26:getstatic       #66  <Field Method sSetWindowLayoutTypeMethod>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #43  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:iconst_1        
	//*  16   34:putstatic       #59  <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*  17   37:getstatic       #66  <Field Method sSetWindowLayoutTypeMethod>
	//*  18   40:ifnull          62
	//*  19   43:getstatic       #66  <Field Method sSetWindowLayoutTypeMethod>
	//*  20   46:aload_1         
	//*  21   47:iconst_1        
	//*  22   48:anewarray       Object[]
	//*  23   51:dup             
	//*  24   52:iconst_0        
	//*  25   53:iload_2         
	//*  26   54:invokestatic    #70  <Method Integer Integer.valueOf(int)>
	//*  27   57:aastore         
	//*  28   58:invokevirtual   #47  <Method Object Method.invoke(Object, Object[])>
	//*  29   61:pop             
	//*  30   62:return          
			catch(Exception exception) { }
	//   31   63:astore_3        
			sSetWindowLayoutTypeMethodAttempted = true;
		}
		if(sSetWindowLayoutTypeMethod == null)
			break MISSING_BLOCK_LABEL_62;
		sSetWindowLayoutTypeMethod.invoke(((Object) (popupwindow)), new Object[] {
			Integer.valueOf(i)
		});
		return;
	//*  32   64:goto            33
		popupwindow;
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
	//*   4    6:invokestatic    #78  <Method int ViewCompat.getLayoutDirection(View)>
	//*   5    9:invokestatic    #84  <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*   6   12:bipush          7
	//*   7   14:iand            
	//*   8   15:iconst_5        
	//*   9   16:icmpne          32
			l = i - (popupwindow.getWidth() - view.getWidth());
	//   10   19:iload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #87  <Method int PopupWindow.getWidth()>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #90  <Method int View.getWidth()>
	//   15   28:isub            
	//   16   29:isub            
	//   17   30:istore          6
		popupwindow.showAsDropDown(view, l, j);
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:iload           6
	//   21   36:iload           4
	//   22   38:invokevirtual   #93  <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   23   41:return          
	}

	private static Method sGetWindowLayoutTypeMethod;
	private static boolean sGetWindowLayoutTypeMethodAttempted;
	private static Method sSetWindowLayoutTypeMethod;
	private static boolean sSetWindowLayoutTypeMethodAttempted;

	PopupWindowCompat$PopupWindowCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
