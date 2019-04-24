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
	static class PopupWindowCompatApi19Impl extends PopupWindowCompatBaseImpl
	{

		public void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
		{
			popupwindow.showAsDropDown(view, i, j, k);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #22  <Method void PopupWindow.showAsDropDown(View, int, int, int)>
		//    6   10:return          
		}

		PopupWindowCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void PopupWindowCompat$PopupWindowCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class PopupWindowCompatApi21Impl extends PopupWindowCompatApi19Impl
	{

		public boolean getOverlapAnchor(PopupWindow popupwindow)
		{
			if(sOverlapAnchorField == null)
				break MISSING_BLOCK_LABEL_32;
		//    0    0:getstatic       #32  <Field Field sOverlapAnchorField>
		//    1    3:ifnull          32
			boolean flag = ((Boolean)sOverlapAnchorField.get(((Object) (popupwindow)))).booleanValue();
		//    2    6:getstatic       #32  <Field Field sOverlapAnchorField>
		//    3    9:aload_1         
		//    4   10:invokevirtual   #58  <Method Object Field.get(Object)>
		//    5   13:checkcast       #60  <Class Boolean>
		//    6   16:invokevirtual   #64  <Method boolean Boolean.booleanValue()>
		//    7   19:istore_2        
			return flag;
		//    8   20:iload_2         
		//    9   21:ireturn         
			popupwindow;
		//   10   22:astore_1        
			Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
		//   11   23:ldc1            #14  <String "PopupWindowCompatApi21">
		//   12   25:ldc1            #66  <String "Could not get overlap anchor field in PopupWindow">
		//   13   27:aload_1         
		//   14   28:invokestatic    #46  <Method int Log.i(String, String, Throwable)>
		//   15   31:pop             
			return false;
		//   16   32:iconst_0        
		//   17   33:ireturn         
		}

		public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
		{
			if(sOverlapAnchorField != null)
		//*   0    0:getstatic       #32  <Field Field sOverlapAnchorField>
		//*   1    3:ifnull          28
				try
				{
					sOverlapAnchorField.set(((Object) (popupwindow)), ((Object) (Boolean.valueOf(flag))));
		//    2    6:getstatic       #32  <Field Field sOverlapAnchorField>
		//    3    9:aload_1         
		//    4   10:iload_2         
		//    5   11:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
		//    6   14:invokevirtual   #76  <Method void Field.set(Object, Object)>
					return;
		//    7   17:return          
				}
				// Misplaced declaration of an exception variable
				catch(PopupWindow popupwindow)
		//*   8   18:astore_1        
				{
					Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
		//    9   19:ldc1            #14  <String "PopupWindowCompatApi21">
		//   10   21:ldc1            #78  <String "Could not set overlap anchor field in PopupWindow">
		//   11   23:aload_1         
		//   12   24:invokestatic    #46  <Method int Log.i(String, String, Throwable)>
		//   13   27:pop             
				}
		//   14   28:return          
		}

		private static final String TAG = "PopupWindowCompatApi21";
		private static Field sOverlapAnchorField;

		static 
		{
			try
			{
				sOverlapAnchorField = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOverlapAnchor");
		//    0    0:ldc1            #22  <Class PopupWindow>
		//    1    2:ldc1            #24  <String "mOverlapAnchor">
		//    2    4:invokevirtual   #30  <Method Field Class.getDeclaredField(String)>
		//    3    7:putstatic       #32  <Field Field sOverlapAnchorField>
				sOverlapAnchorField.setAccessible(true);
		//    4   10:getstatic       #32  <Field Field sOverlapAnchorField>
		//    5   13:iconst_1        
		//    6   14:invokevirtual   #38  <Method void Field.setAccessible(boolean)>
		//    7   17:return          
			}
			catch(NoSuchFieldException nosuchfieldexception)
		//*   8   18:astore_0        
			{
				Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable) (nosuchfieldexception)));
		//    9   19:ldc1            #14  <String "PopupWindowCompatApi21">
		//   10   21:ldc1            #40  <String "Could not fetch mOverlapAnchor field from PopupWindow">
		//   11   23:aload_0         
		//   12   24:invokestatic    #46  <Method int Log.i(String, String, Throwable)>
		//   13   27:pop             
			}
		//*  14   28:return          
		}

		PopupWindowCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void PopupWindowCompat$PopupWindowCompatApi19Impl()>
		//    2    4:return          
		}
	}

	static class PopupWindowCompatApi23Impl extends PopupWindowCompatApi21Impl
	{

		public boolean getOverlapAnchor(PopupWindow popupwindow)
		{
			return popupwindow.getOverlapAnchor();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method boolean PopupWindow.getOverlapAnchor()>
		//    2    4:ireturn         
		}

		public int getWindowLayoutType(PopupWindow popupwindow)
		{
			return popupwindow.getWindowLayoutType();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method int PopupWindow.getWindowLayoutType()>
		//    2    4:ireturn         
		}

		public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
		{
			popupwindow.setOverlapAnchor(flag);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #32  <Method void PopupWindow.setOverlapAnchor(boolean)>
		//    3    5:return          
		}

		public void setWindowLayoutType(PopupWindow popupwindow, int i)
		{
			popupwindow.setWindowLayoutType(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #37  <Method void PopupWindow.setWindowLayoutType(int)>
		//    3    5:return          
		}

		PopupWindowCompatApi23Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void PopupWindowCompat$PopupWindowCompatApi21Impl()>
		//    2    4:return          
		}
	}

	static class PopupWindowCompatBaseImpl
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

		PopupWindowCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	private PopupWindowCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public static boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		return IMPL.getOverlapAnchor(popupwindow);
	//    0    0:getstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method boolean PopupWindowCompat$PopupWindowCompatBaseImpl.getOverlapAnchor(PopupWindow)>
	//    3    7:ireturn         
	}

	public static int getWindowLayoutType(PopupWindow popupwindow)
	{
		return IMPL.getWindowLayoutType(popupwindow);
	//    0    0:getstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #46  <Method int PopupWindowCompat$PopupWindowCompatBaseImpl.getWindowLayoutType(PopupWindow)>
	//    3    7:ireturn         
	}

	public static void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		IMPL.setOverlapAnchor(popupwindow, flag);
	//    0    0:getstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #50  <Method void PopupWindowCompat$PopupWindowCompatBaseImpl.setOverlapAnchor(PopupWindow, boolean)>
	//    4    8:return          
	}

	public static void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		IMPL.setWindowLayoutType(popupwindow, i);
	//    0    0:getstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #54  <Method void PopupWindowCompat$PopupWindowCompatBaseImpl.setWindowLayoutType(PopupWindow, int)>
	//    4    8:return          
	}

	public static void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
	{
		IMPL.showAsDropDown(popupwindow, view, i, j, k);
	//    0    0:getstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #58  <Method void PopupWindowCompat$PopupWindowCompatBaseImpl.showAsDropDown(PopupWindow, View, int, int, int)>
	//    7   12:return          
	}

	static final PopupWindowCompatBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			IMPL = ((PopupWindowCompatBaseImpl) (new PopupWindowCompatApi23Impl()));
	//    3    8:new             #12  <Class PopupWindowCompat$PopupWindowCompatApi23Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #29  <Method void PopupWindowCompat$PopupWindowCompatApi23Impl()>
	//    6   15:putstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   19:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          21
	//*  10   24:icmplt          38
			IMPL = ((PopupWindowCompatBaseImpl) (new PopupWindowCompatApi21Impl()));
	//   11   27:new             #9   <Class PopupWindowCompat$PopupWindowCompatApi21Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #32  <Method void PopupWindowCompat$PopupWindowCompatApi21Impl()>
	//   14   34:putstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   38:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          19
	//*  18   43:icmplt          57
			IMPL = ((PopupWindowCompatBaseImpl) (new PopupWindowCompatApi19Impl()));
	//   19   46:new             #6   <Class PopupWindowCompat$PopupWindowCompatApi19Impl>
	//   20   49:dup             
	//   21   50:invokespecial   #33  <Method void PopupWindowCompat$PopupWindowCompatApi19Impl()>
	//   22   53:putstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//   23   56:return          
		else
			IMPL = new PopupWindowCompatBaseImpl();
	//   24   57:new             #15  <Class PopupWindowCompat$PopupWindowCompatBaseImpl>
	//   25   60:dup             
	//   26   61:invokespecial   #34  <Method void PopupWindowCompat$PopupWindowCompatBaseImpl()>
	//   27   64:putstatic       #31  <Field PopupWindowCompat$PopupWindowCompatBaseImpl IMPL>
	//*  28   67:return          
	}
}
