// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

class PopupWindowCompatApi21
{

	PopupWindowCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	static boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		if(sOverlapAnchorField == null)
			break MISSING_BLOCK_LABEL_32;
	//    0    0:getstatic       #29  <Field Field sOverlapAnchorField>
	//    1    3:ifnull          32
		boolean flag = ((Boolean)sOverlapAnchorField.get(((Object) (popupwindow)))).booleanValue();
	//    2    6:getstatic       #29  <Field Field sOverlapAnchorField>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #55  <Method Object Field.get(Object)>
	//    5   13:checkcast       #57  <Class Boolean>
	//    6   16:invokevirtual   #61  <Method boolean Boolean.booleanValue()>
	//    7   19:istore_1        
		return flag;
	//    8   20:iload_1         
	//    9   21:ireturn         
		popupwindow;
	//   10   22:astore_0        
		Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//   11   23:ldc1            #11  <String "PopupWindowCompatApi21">
	//   12   25:ldc1            #63  <String "Could not get overlap anchor field in PopupWindow">
	//   13   27:aload_0         
	//   14   28:invokestatic    #43  <Method int Log.i(String, String, Throwable)>
	//   15   31:pop             
		return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	static void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		if(sOverlapAnchorField != null)
	//*   0    0:getstatic       #29  <Field Field sOverlapAnchorField>
	//*   1    3:ifnull          28
			try
			{
				sOverlapAnchorField.set(((Object) (popupwindow)), ((Object) (Boolean.valueOf(flag))));
	//    2    6:getstatic       #29  <Field Field sOverlapAnchorField>
	//    3    9:aload_0         
	//    4   10:iload_1         
	//    5   11:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:invokevirtual   #73  <Method void Field.set(Object, Object)>
				return;
	//    7   17:return          
			}
			// Misplaced declaration of an exception variable
			catch(PopupWindow popupwindow)
	//*   8   18:astore_0        
			{
				Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//    9   19:ldc1            #11  <String "PopupWindowCompatApi21">
	//   10   21:ldc1            #75  <String "Could not set overlap anchor field in PopupWindow">
	//   11   23:aload_0         
	//   12   24:invokestatic    #43  <Method int Log.i(String, String, Throwable)>
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
	//    0    0:ldc1            #19  <Class PopupWindow>
	//    1    2:ldc1            #21  <String "mOverlapAnchor">
	//    2    4:invokevirtual   #27  <Method Field Class.getDeclaredField(String)>
	//    3    7:putstatic       #29  <Field Field sOverlapAnchorField>
			sOverlapAnchorField.setAccessible(true);
	//    4   10:getstatic       #29  <Field Field sOverlapAnchorField>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #35  <Method void Field.setAccessible(boolean)>
	//    7   17:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*   8   18:astore_0        
		{
			Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", ((Throwable) (nosuchfieldexception)));
	//    9   19:ldc1            #11  <String "PopupWindowCompatApi21">
	//   10   21:ldc1            #37  <String "Could not fetch mOverlapAnchor field from PopupWindow">
	//   11   23:aload_0         
	//   12   24:invokestatic    #43  <Method int Log.i(String, String, Throwable)>
	//   13   27:pop             
		}
	//*  14   28:return          
	}
}
