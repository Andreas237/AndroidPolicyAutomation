// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout, DrawerLayoutCompatApi21

static class DrawerLayout$DrawerLayoutCompatImplApi21
	implements DrawerLayout.DrawerLayoutCompatImpl
{

	public void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
	{
		DrawerLayoutCompatApi21.applyMarginInsets(marginlayoutparams, obj, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #20  <Method void DrawerLayoutCompatApi21.applyMarginInsets(android.view.ViewGroup$MarginLayoutParams, Object, int)>
	//    4    6:return          
	}

	public void configureApplyInsets(View view)
	{
		DrawerLayoutCompatApi21.configureApplyInsets(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method void DrawerLayoutCompatApi21.configureApplyInsets(View)>
	//    2    4:return          
	}

	public void dispatchChildInsets(View view, Object obj, int i)
	{
		DrawerLayoutCompatApi21.dispatchChildInsets(view, obj, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #28  <Method void DrawerLayoutCompatApi21.dispatchChildInsets(View, Object, int)>
	//    4    6:return          
	}

	public Drawable getDefaultStatusBarBackground(Context context)
	{
		return DrawerLayoutCompatApi21.getDefaultStatusBarBackground(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method Drawable DrawerLayoutCompatApi21.getDefaultStatusBarBackground(Context)>
	//    2    4:areturn         
	}

	public int getTopInset(Object obj)
	{
		return DrawerLayoutCompatApi21.getTopInset(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method int DrawerLayoutCompatApi21.getTopInset(Object)>
	//    2    4:ireturn         
	}

	DrawerLayout$DrawerLayoutCompatImplApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
