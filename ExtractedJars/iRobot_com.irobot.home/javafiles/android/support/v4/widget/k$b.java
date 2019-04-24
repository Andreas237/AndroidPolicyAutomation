// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.widget:
//			k

static class k$b extends k$a
{

	public void a(PopupWindow popupwindow, boolean flag)
	{
		if(a != null)
	//*   0    0:getstatic       #25  <Field Field a>
	//*   1    3:ifnull          28
			try
			{
				a.set(((Object) (popupwindow)), ((Object) (Boolean.valueOf(flag))));
	//    2    6:getstatic       #25  <Field Field a>
	//    3    9:aload_1         
	//    4   10:iload_2         
	//    5   11:invokestatic    #54  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:invokevirtual   #58  <Method void Field.set(Object, Object)>
				return;
	//    7   17:return          
			}
			// Misplaced declaration of an exception variable
			catch(PopupWindow popupwindow)
	//*   8   18:astore_1        
			{
				Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//    9   19:ldc1            #33  <String "PopupWindowCompatApi21">
	//   10   21:ldc1            #60  <String "Could not set overlap anchor field in PopupWindow">
	//   11   23:aload_1         
	//   12   24:invokestatic    #41  <Method int Log.i(String, String, Throwable)>
	//   13   27:pop             
			}
	//   14   28:return          
	}

	private static Field a;

	static 
	{
		try
		{
			a = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOverlapAnchor");
	//    0    0:ldc1            #15  <Class PopupWindow>
	//    1    2:ldc1            #17  <String "mOverlapAnchor">
	//    2    4:invokevirtual   #23  <Method Field Class.getDeclaredField(String)>
	//    3    7:putstatic       #25  <Field Field a>
			a.setAccessible(true);
	//    4   10:getstatic       #25  <Field Field a>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #31  <Method void Field.setAccessible(boolean)>
	//    7   17:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*   8   18:astore_0        
		{
			Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable) (nosuchfieldexception)));
	//    9   19:ldc1            #33  <String "PopupWindowCompatApi21">
	//   10   21:ldc1            #35  <String "Could not fetch mOverlapAnchor field from PopupWindow">
	//   11   23:aload_0         
	//   12   24:invokestatic    #41  <Method int Log.i(String, String, Throwable)>
	//   13   27:pop             
		}
	//*  14   28:return          
	}

	k$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void k$a()>
	//    2    4:return          
	}
}
