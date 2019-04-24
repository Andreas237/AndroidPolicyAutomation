// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.view:
//			PointerIconCompat, PointerIconCompatApi24

static class PointerIconCompat$Api24PointerIconCompatImpl extends PointerIconCompat.BasePointerIconCompatImpl
{

	public Object create(Bitmap bitmap, float f, float f1)
	{
		return PointerIconCompatApi24.create(bitmap, f, f1);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokestatic    #18  <Method Object PointerIconCompatApi24.create(Bitmap, float, float)>
	//    4    6:areturn         
	}

	public Object getSystemIcon(Context context, int i)
	{
		return PointerIconCompatApi24.getSystemIcon(context, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #22  <Method Object PointerIconCompatApi24.getSystemIcon(Context, int)>
	//    3    5:areturn         
	}

	public Object load(Resources resources, int i)
	{
		return PointerIconCompatApi24.load(resources, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #26  <Method Object PointerIconCompatApi24.load(Resources, int)>
	//    3    5:areturn         
	}

	PointerIconCompat$Api24PointerIconCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PointerIconCompat$BasePointerIconCompatImpl()>
	//    2    4:return          
	}
}
