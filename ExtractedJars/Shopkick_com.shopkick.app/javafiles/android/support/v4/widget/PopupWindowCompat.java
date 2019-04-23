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

	private PopupWindowCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		Field field;
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return popupwindow.getOverlapAnchor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #40  <Method boolean PopupWindow.getOverlapAnchor()>
	//    5   12:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_93;
	//    6   13:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//    7   16:bipush          21
	//    8   18:icmplt          93
		if(!sOverlapAnchorFieldAttempted)
	//*   9   21:getstatic       #42  <Field boolean sOverlapAnchorFieldAttempted>
	//*  10   24:ifne            61
		{
			try
			{
				sOverlapAnchorField = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOverlapAnchor");
	//   11   27:ldc1            #37  <Class PopupWindow>
	//   12   29:ldc1            #44  <String "mOverlapAnchor">
	//   13   31:invokevirtual   #50  <Method Field Class.getDeclaredField(String)>
	//   14   34:putstatic       #52  <Field Field sOverlapAnchorField>
				sOverlapAnchorField.setAccessible(true);
	//   15   37:getstatic       #52  <Field Field sOverlapAnchorField>
	//   16   40:iconst_1        
	//   17   41:invokevirtual   #58  <Method void Field.setAccessible(boolean)>
			}
	//*  18   44:goto            57
			catch(NoSuchFieldException nosuchfieldexception)
	//*  19   47:astore_2        
			{
				Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable) (nosuchfieldexception)));
	//   20   48:ldc1            #8   <String "PopupWindowCompatApi21">
	//   21   50:ldc1            #60  <String "Could not fetch mOverlapAnchor field from PopupWindow">
	//   22   52:aload_2         
	//   23   53:invokestatic    #66  <Method int Log.i(String, String, Throwable)>
	//   24   56:pop             
			}
			sOverlapAnchorFieldAttempted = true;
	//   25   57:iconst_1        
	//   26   58:putstatic       #42  <Field boolean sOverlapAnchorFieldAttempted>
		}
		field = sOverlapAnchorField;
	//   27   61:getstatic       #52  <Field Field sOverlapAnchorField>
	//   28   64:astore_2        
		if(field == null)
			break MISSING_BLOCK_LABEL_93;
	//   29   65:aload_2         
	//   30   66:ifnull          93
		boolean flag = ((Boolean)field.get(((Object) (popupwindow)))).booleanValue();
	//   31   69:aload_2         
	//   32   70:aload_0         
	//   33   71:invokevirtual   #70  <Method Object Field.get(Object)>
	//   34   74:checkcast       #72  <Class Boolean>
	//   35   77:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//   36   80:istore_1        
		return flag;
	//   37   81:iload_1         
	//   38   82:ireturn         
		popupwindow;
	//   39   83:astore_0        
		Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//   40   84:ldc1            #8   <String "PopupWindowCompatApi21">
	//   41   86:ldc1            #77  <String "Could not get overlap anchor field in PopupWindow">
	//   42   88:aload_0         
	//   43   89:invokestatic    #66  <Method int Log.i(String, String, Throwable)>
	//   44   92:pop             
		return false;
	//   45   93:iconst_0        
	//   46   94:ireturn         
	}

	public static int getWindowLayoutType(PopupWindow popupwindow)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return popupwindow.getWindowLayoutType();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #85  <Method int PopupWindow.getWindowLayoutType()>
	//    5   12:ireturn         
		if(!sGetWindowLayoutTypeMethodAttempted)
	//*   6   13:getstatic       #87  <Field boolean sGetWindowLayoutTypeMethodAttempted>
	//*   7   16:ifne            44
		{
			int i;
			Method method;
			try
			{
				sGetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getWindowLayoutType", new Class[0]);
	//    8   19:ldc1            #37  <Class PopupWindow>
	//    9   21:ldc1            #88  <String "getWindowLayoutType">
	//   10   23:iconst_0        
	//   11   24:anewarray       Class[]
	//   12   27:invokevirtual   #92  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   13   30:putstatic       #94  <Field Method sGetWindowLayoutTypeMethod>
				sGetWindowLayoutTypeMethod.setAccessible(true);
	//   14   33:getstatic       #94  <Field Method sGetWindowLayoutTypeMethod>
	//   15   36:iconst_1        
	//   16   37:invokevirtual   #97  <Method void Method.setAccessible(boolean)>
			}
	//*  17   40:iconst_1        
	//*  18   41:putstatic       #87  <Field boolean sGetWindowLayoutTypeMethodAttempted>
	//*  19   44:getstatic       #94  <Field Method sGetWindowLayoutTypeMethod>
	//*  20   47:astore_2        
	//*  21   48:aload_2         
	//*  22   49:ifnull          70
	//*  23   52:aload_2         
	//*  24   53:aload_0         
	//*  25   54:iconst_0        
	//*  26   55:anewarray       Object[]
	//*  27   58:invokevirtual   #101 <Method Object Method.invoke(Object, Object[])>
	//*  28   61:checkcast       #103 <Class Integer>
	//*  29   64:invokevirtual   #106 <Method int Integer.intValue()>
	//*  30   67:istore_1        
	//*  31   68:iload_1         
	//*  32   69:ireturn         
	//*  33   70:iconst_0        
	//*  34   71:ireturn         
			catch(Exception exception) { }
	//   35   72:astore_2        
			sGetWindowLayoutTypeMethodAttempted = true;
		}
		method = sGetWindowLayoutTypeMethod;
		if(method != null)
		{
			try
			{
				i = ((Integer)method.invoke(((Object) (popupwindow)), new Object[0])).intValue();
			}
	//*  36   73:goto            40
			// Misplaced declaration of an exception variable
			catch(PopupWindow popupwindow)
	//*  37   76:astore_0        
			{
				return 0;
	//   38   77:iconst_0        
	//   39   78:ireturn         
			}
			return i;
		} else
		{
			return 0;
		}
	}

	public static void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			popupwindow.setOverlapAnchor(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #110 <Method void PopupWindow.setOverlapAnchor(boolean)>
			return;
	//    6   13:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   14:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          21
	//*   9   19:icmplt          90
		{
			if(!sOverlapAnchorFieldAttempted)
	//*  10   22:getstatic       #42  <Field boolean sOverlapAnchorFieldAttempted>
	//*  11   25:ifne            62
			{
				try
				{
					sOverlapAnchorField = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOverlapAnchor");
	//   12   28:ldc1            #37  <Class PopupWindow>
	//   13   30:ldc1            #44  <String "mOverlapAnchor">
	//   14   32:invokevirtual   #50  <Method Field Class.getDeclaredField(String)>
	//   15   35:putstatic       #52  <Field Field sOverlapAnchorField>
					sOverlapAnchorField.setAccessible(true);
	//   16   38:getstatic       #52  <Field Field sOverlapAnchorField>
	//   17   41:iconst_1        
	//   18   42:invokevirtual   #58  <Method void Field.setAccessible(boolean)>
				}
	//*  19   45:goto            58
				catch(NoSuchFieldException nosuchfieldexception)
	//*  20   48:astore_2        
				{
					Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable) (nosuchfieldexception)));
	//   21   49:ldc1            #8   <String "PopupWindowCompatApi21">
	//   22   51:ldc1            #60  <String "Could not fetch mOverlapAnchor field from PopupWindow">
	//   23   53:aload_2         
	//   24   54:invokestatic    #66  <Method int Log.i(String, String, Throwable)>
	//   25   57:pop             
				}
				sOverlapAnchorFieldAttempted = true;
	//   26   58:iconst_1        
	//   27   59:putstatic       #42  <Field boolean sOverlapAnchorFieldAttempted>
			}
			Field field = sOverlapAnchorField;
	//   28   62:getstatic       #52  <Field Field sOverlapAnchorField>
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
	//   35   73:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//   36   76:invokevirtual   #118 <Method void Field.set(Object, Object)>
					return;
	//   37   79:return          
				}
				// Misplaced declaration of an exception variable
				catch(PopupWindow popupwindow)
	//*  38   80:astore_0        
				{
					Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//   39   81:ldc1            #8   <String "PopupWindowCompatApi21">
	//   40   83:ldc1            #120 <String "Could not set overlap anchor field in PopupWindow">
	//   41   85:aload_0         
	//   42   86:invokestatic    #66  <Method int Log.i(String, String, Throwable)>
	//   43   89:pop             
				}
		}
	//   44   90:return          
	}

	public static void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			popupwindow.setWindowLayoutType(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #125 <Method void PopupWindow.setWindowLayoutType(int)>
			return;
	//    6   13:return          
		}
		if(!sSetWindowLayoutTypeMethodAttempted)
	//*   7   14:getstatic       #127 <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*   8   17:ifne            51
		{
			Method method;
			try
			{
				sSetWindowLayoutTypeMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setWindowLayoutType", new Class[] {
					Integer.TYPE
				});
	//    9   20:ldc1            #37  <Class PopupWindow>
	//   10   22:ldc1            #128 <String "setWindowLayoutType">
	//   11   24:iconst_1        
	//   12   25:anewarray       Class[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:getstatic       #132 <Field Class Integer.TYPE>
	//   16   33:aastore         
	//   17   34:invokevirtual   #92  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   18   37:putstatic       #134 <Field Method sSetWindowLayoutTypeMethod>
				sSetWindowLayoutTypeMethod.setAccessible(true);
	//   19   40:getstatic       #134 <Field Method sSetWindowLayoutTypeMethod>
	//   20   43:iconst_1        
	//   21   44:invokevirtual   #97  <Method void Method.setAccessible(boolean)>
			}
	//*  22   47:iconst_1        
	//*  23   48:putstatic       #127 <Field boolean sSetWindowLayoutTypeMethodAttempted>
	//*  24   51:getstatic       #134 <Field Method sSetWindowLayoutTypeMethod>
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
	//*  35   68:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//*  36   71:aastore         
	//*  37   72:invokevirtual   #101 <Method Object Method.invoke(Object, Object[])>
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
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          18
		{
			popupwindow.showAsDropDown(view, i, j, k);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #142 <Method void PopupWindow.showAsDropDown(View, int, int, int)>
			return;
	//    9   17:return          
		}
		int l = i;
	//   10   18:iload_2         
	//   11   19:istore          5
		if((GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(view)) & 7) == 5)
	//*  12   21:iload           4
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #148 <Method int ViewCompat.getLayoutDirection(View)>
	//*  15   27:invokestatic    #154 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  16   30:bipush          7
	//*  17   32:iand            
	//*  18   33:iconst_5        
	//*  19   34:icmpne          50
			l = i - (popupwindow.getWidth() - view.getWidth());
	//   20   37:iload_2         
	//   21   38:aload_0         
	//   22   39:invokevirtual   #157 <Method int PopupWindow.getWidth()>
	//   23   42:aload_1         
	//   24   43:invokevirtual   #160 <Method int View.getWidth()>
	//   25   46:isub            
	//   26   47:isub            
	//   27   48:istore          5
		popupwindow.showAsDropDown(view, l, j);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:iload           5
	//   31   54:iload_3         
	//   32   55:invokevirtual   #163 <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   33   58:return          
	}

	private static final String TAG = "PopupWindowCompatApi21";
	private static Method sGetWindowLayoutTypeMethod;
	private static boolean sGetWindowLayoutTypeMethodAttempted;
	private static Field sOverlapAnchorField;
	private static boolean sOverlapAnchorFieldAttempted;
	private static Method sSetWindowLayoutTypeMethod;
	private static boolean sSetWindowLayoutTypeMethodAttempted;
}
