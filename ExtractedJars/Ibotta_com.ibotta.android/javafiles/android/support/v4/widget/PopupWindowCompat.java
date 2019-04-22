// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class PopupWindowCompat
{

	public static void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			popupwindow.setOverlapAnchor(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #29  <Method void PopupWindow.setOverlapAnchor(boolean)>
			return;
	//    6   13:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   14:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          21
	//*   9   19:icmplt          90
		{
			if(!sOverlapAnchorFieldAttempted)
	//*  10   22:getstatic       #31  <Field boolean sOverlapAnchorFieldAttempted>
	//*  11   25:ifne            62
			{
				try
				{
					sOverlapAnchorField = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOverlapAnchor");
	//   12   28:ldc1            #26  <Class PopupWindow>
	//   13   30:ldc1            #33  <String "mOverlapAnchor">
	//   14   32:invokevirtual   #39  <Method Field Class.getDeclaredField(String)>
	//   15   35:putstatic       #41  <Field Field sOverlapAnchorField>
					sOverlapAnchorField.setAccessible(true);
	//   16   38:getstatic       #41  <Field Field sOverlapAnchorField>
	//   17   41:iconst_1        
	//   18   42:invokevirtual   #46  <Method void Field.setAccessible(boolean)>
				}
	//*  19   45:goto            58
				catch(NoSuchFieldException nosuchfieldexception)
	//*  20   48:astore_2        
				{
					Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable) (nosuchfieldexception)));
	//   21   49:ldc1            #48  <String "PopupWindowCompatApi21">
	//   22   51:ldc1            #50  <String "Could not fetch mOverlapAnchor field from PopupWindow">
	//   23   53:aload_2         
	//   24   54:invokestatic    #56  <Method int Log.i(String, String, Throwable)>
	//   25   57:pop             
				}
				sOverlapAnchorFieldAttempted = true;
	//   26   58:iconst_1        
	//   27   59:putstatic       #31  <Field boolean sOverlapAnchorFieldAttempted>
			}
			Field field = sOverlapAnchorField;
	//   28   62:getstatic       #41  <Field Field sOverlapAnchorField>
	//   29   65:astore_2        
			if(field != null)
	//*  30   66:aload_2         
	//*  31   67:ifnull          90
				try
				{
					field.set(((Object) (popupwindow)), ((Object) (Boolean.valueOf(flag))));
	//   32   70:aload_2         
	//   33   71:aload_0         
	//   34   72:iload_1         
	//   35   73:invokestatic    #62  <Method Boolean Boolean.valueOf(boolean)>
	//   36   76:invokevirtual   #66  <Method void Field.set(Object, Object)>
					return;
	//   37   79:return          
				}
				// Misplaced declaration of an exception variable
				catch(PopupWindow popupwindow)
	//*  38   80:astore_0        
				{
					Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//   39   81:ldc1            #48  <String "PopupWindowCompatApi21">
	//   40   83:ldc1            #68  <String "Could not set overlap anchor field in PopupWindow">
	//   41   85:aload_0         
	//   42   86:invokestatic    #56  <Method int Log.i(String, String, Throwable)>
	//   43   89:pop             
				}
		}
	//   44   90:return          
	}

	public static void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			popupwindow.setWindowLayoutType(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #77  <Method void PopupWindow.setWindowLayoutType(int)>
			return;
	//    6   13:return          
		}
		if(!sSetWindowLayoutTypeMethodAttempted)
	//*   7   14:getstatic       #79  <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*   8   17:ifne            51
		{
			Method method;
			try
			{
				sSetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setWindowLayoutType", new Class[] {
					Integer.TYPE
				});
	//    9   20:ldc1            #26  <Class PopupWindow>
	//   10   22:ldc1            #80  <String "setWindowLayoutType">
	//   11   24:iconst_1        
	//   12   25:anewarray       Class[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:getstatic       #86  <Field Class Integer.TYPE>
	//   16   33:aastore         
	//   17   34:invokevirtual   #90  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   18   37:putstatic       #92  <Field Method sSetWindowLayoutTypeMethod>
				sSetWindowLayoutTypeMethod.setAccessible(true);
	//   19   40:getstatic       #92  <Field Method sSetWindowLayoutTypeMethod>
	//   20   43:iconst_1        
	//   21   44:invokevirtual   #95  <Method void Method.setAccessible(boolean)>
			}
	//*  22   47:iconst_1        
	//*  23   48:putstatic       #79  <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*  24   51:getstatic       #92  <Field Method sSetWindowLayoutTypeMethod>
	//*  25   54:astore_2        
	//*  26   55:aload_2         
	//*  27   56:ifnull          76
	//*  28   59:aload_2         
	//*  29   60:aload_0         
	//*  30   61:iconst_1        
	//*  31   62:anewarray       Object[]
	//*  32   65:dup             
	//*  33   66:iconst_0        
	//*  34   67:iload_1         
	//*  35   68:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//*  36   71:aastore         
	//*  37   72:invokevirtual   #102 <Method Object Method.invoke(Object, Object[])>
	//*  38   75:pop             
	//*  39   76:return          
			catch(Exception exception) { }
	//   40   77:astore_2        
			sSetWindowLayoutTypeMethodAttempted = true;
		}
		method = sSetWindowLayoutTypeMethod;
		if(method == null)
			break MISSING_BLOCK_LABEL_76;
		method.invoke(((Object) (popupwindow)), new Object[] {
			Integer.valueOf(i)
		});
		return;
	//*  41   78:goto            47
		popupwindow;
	//   42   81:astore_0        
	//   43   82:return          
	}

	public static void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          18
		{
			popupwindow.showAsDropDown(view, i, j, k);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #107 <Method void PopupWindow.showAsDropDown(View, int, int, int)>
			return;
	//    9   17:return          
		}
		int l = i;
	//   10   18:iload_2         
	//   11   19:istore          5
		if((GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(view)) & 7) == 5)
	//*  12   21:iload           4
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #113 <Method int ViewCompat.getLayoutDirection(View)>
	//*  15   27:invokestatic    #119 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  16   30:bipush          7
	//*  17   32:iand            
	//*  18   33:iconst_5        
	//*  19   34:icmpne          50
			l = i - (popupwindow.getWidth() - view.getWidth());
	//   20   37:iload_2         
	//   21   38:aload_0         
	//   22   39:invokevirtual   #123 <Method int PopupWindow.getWidth()>
	//   23   42:aload_1         
	//   24   43:invokevirtual   #126 <Method int View.getWidth()>
	//   25   46:isub            
	//   26   47:isub            
	//   27   48:istore          5
		popupwindow.showAsDropDown(view, l, j);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:iload           5
	//   31   54:iload_3         
	//   32   55:invokevirtual   #129 <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   33   58:return          
	}

	private static Field sOverlapAnchorField;
	private static boolean sOverlapAnchorFieldAttempted;
	private static Method sSetWindowLayoutTypeMethod;
	private static boolean sSetWindowLayoutTypeMethodAttempted;
}
