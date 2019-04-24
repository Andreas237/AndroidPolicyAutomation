// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

class PointerIconCompatApi24
{

	PointerIconCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object create(Bitmap bitmap, float f, float f1)
	{
		return ((Object) (PointerIcon.create(bitmap, f, f1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #19  <Method PointerIcon PointerIcon.create(Bitmap, float, float)>
	//    4    6:areturn         
	}

	public static Object getSystemIcon(Context context, int i)
	{
		return ((Object) (PointerIcon.getSystemIcon(context, i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #24  <Method PointerIcon PointerIcon.getSystemIcon(Context, int)>
	//    3    5:areturn         
	}

	public static Object load(Resources resources, int i)
	{
		return ((Object) (PointerIcon.load(resources, i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #29  <Method PointerIcon PointerIcon.load(Resources, int)>
	//    3    5:areturn         
	}
}
