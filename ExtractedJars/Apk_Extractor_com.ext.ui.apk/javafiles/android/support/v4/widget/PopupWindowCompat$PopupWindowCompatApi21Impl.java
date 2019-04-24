// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat

static class PopupWindowCompat$PopupWindowCompatApi21Impl extends PopupWindowCompat$PopupWindowCompatApi19Impl
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
		if(sOverlapAnchorField == null)
			break MISSING_BLOCK_LABEL_17;
	//    0    0:getstatic       #32  <Field Field sOverlapAnchorField>
	//    1    3:ifnull          17
		sOverlapAnchorField.set(((Object) (popupwindow)), ((Object) (Boolean.valueOf(flag))));
	//    2    6:getstatic       #32  <Field Field sOverlapAnchorField>
	//    3    9:aload_1         
	//    4   10:iload_2         
	//    5   11:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:invokevirtual   #76  <Method void Field.set(Object, Object)>
		return;
	//    7   17:return          
		popupwindow;
	//    8   18:astore_1        
		Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", ((Throwable) (popupwindow)));
	//    9   19:ldc1            #14  <String "PopupWindowCompatApi21">
	//   10   21:ldc1            #78  <String "Could not set overlap anchor field in PopupWindow">
	//   11   23:aload_1         
	//   12   24:invokestatic    #46  <Method int Log.i(String, String, Throwable)>
	//   13   27:pop             
		return;
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

	PopupWindowCompat$PopupWindowCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void PopupWindowCompat$PopupWindowCompatApi19Impl()>
	//    2    4:return          
	}
}
