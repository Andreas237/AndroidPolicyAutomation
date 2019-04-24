// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

public final class PointerIconCompat
{

	private PointerIconCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		mPointerIcon = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field Object mPointerIcon>
	//    5    9:return          
	}

	public static PointerIconCompat create(Bitmap bitmap, float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          22
			return new PointerIconCompat(((Object) (PointerIcon.create(bitmap, f, f1))));
	//    3    8:new             #2   <Class PointerIconCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:fload_1         
	//    7   14:fload_2         
	//    8   15:invokestatic    #72  <Method PointerIcon PointerIcon.create(Bitmap, float, float)>
	//    9   18:invokespecial   #74  <Method void PointerIconCompat(Object)>
	//   10   21:areturn         
		else
			return new PointerIconCompat(((Object) (null)));
	//   11   22:new             #2   <Class PointerIconCompat>
	//   12   25:dup             
	//   13   26:aconst_null     
	//   14   27:invokespecial   #74  <Method void PointerIconCompat(Object)>
	//   15   30:areturn         
	}

	public static PointerIconCompat getSystemIcon(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          21
			return new PointerIconCompat(((Object) (PointerIcon.getSystemIcon(context, i))));
	//    3    8:new             #2   <Class PointerIconCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:invokestatic    #79  <Method PointerIcon PointerIcon.getSystemIcon(Context, int)>
	//    8   17:invokespecial   #74  <Method void PointerIconCompat(Object)>
	//    9   20:areturn         
		else
			return new PointerIconCompat(((Object) (null)));
	//   10   21:new             #2   <Class PointerIconCompat>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:invokespecial   #74  <Method void PointerIconCompat(Object)>
	//   14   29:areturn         
	}

	public static PointerIconCompat load(Resources resources, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          21
			return new PointerIconCompat(((Object) (PointerIcon.load(resources, i))));
	//    3    8:new             #2   <Class PointerIconCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:invokestatic    #84  <Method PointerIcon PointerIcon.load(Resources, int)>
	//    8   17:invokespecial   #74  <Method void PointerIconCompat(Object)>
	//    9   20:areturn         
		else
			return new PointerIconCompat(((Object) (null)));
	//   10   21:new             #2   <Class PointerIconCompat>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:invokespecial   #74  <Method void PointerIconCompat(Object)>
	//   14   29:areturn         
	}

	public Object getPointerIcon()
	{
		return mPointerIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mPointerIcon>
	//    2    4:areturn         
	}

	public static final int TYPE_ALIAS = 1010;
	public static final int TYPE_ALL_SCROLL = 1013;
	public static final int TYPE_ARROW = 1000;
	public static final int TYPE_CELL = 1006;
	public static final int TYPE_CONTEXT_MENU = 1001;
	public static final int TYPE_COPY = 1011;
	public static final int TYPE_CROSSHAIR = 1007;
	public static final int TYPE_DEFAULT = 1000;
	public static final int TYPE_GRAB = 1020;
	public static final int TYPE_GRABBING = 1021;
	public static final int TYPE_HAND = 1002;
	public static final int TYPE_HELP = 1003;
	public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
	public static final int TYPE_NO_DROP = 1012;
	public static final int TYPE_NULL = 0;
	public static final int TYPE_TEXT = 1008;
	public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
	public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
	public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
	public static final int TYPE_VERTICAL_TEXT = 1009;
	public static final int TYPE_WAIT = 1004;
	public static final int TYPE_ZOOM_IN = 1018;
	public static final int TYPE_ZOOM_OUT = 1019;
	private Object mPointerIcon;
}
