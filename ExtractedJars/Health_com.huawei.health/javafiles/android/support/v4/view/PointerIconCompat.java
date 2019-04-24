// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.os.BuildCompat;

// Referenced classes of package android.support.v4.view:
//			PointerIconCompatApi24

public final class PointerIconCompat
{
	static class Api24PointerIconCompatImpl extends BasePointerIconCompatImpl
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

		Api24PointerIconCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PointerIconCompat$BasePointerIconCompatImpl()>
		//    2    4:return          
		}
	}

	static class BasePointerIconCompatImpl
		implements PointerIconCompatImpl
	{

		public Object create(Bitmap bitmap, float f, float f1)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object getSystemIcon(Context context, int i)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object load(Resources resources, int i)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		BasePointerIconCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface PointerIconCompatImpl
	{

		public abstract Object create(Bitmap bitmap, float f, float f1);

		public abstract Object getSystemIcon(Context context, int i);

		public abstract Object load(Resources resources, int i);
	}


	private PointerIconCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		mPointerIcon = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #82  <Field Object mPointerIcon>
	//    5    9:return          
	}

	public static PointerIconCompat create(Bitmap bitmap, float f, float f1)
	{
		return new PointerIconCompat(IMPL.create(bitmap, f, f1));
	//    0    0:new             #2   <Class PointerIconCompat>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field PointerIconCompat$PointerIconCompatImpl IMPL>
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:fload_2         
	//    6   10:invokeinterface #87  <Method Object PointerIconCompat$PointerIconCompatImpl.create(Bitmap, float, float)>
	//    7   15:invokespecial   #89  <Method void PointerIconCompat(Object)>
	//    8   18:areturn         
	}

	public static PointerIconCompat getSystemIcon(Context context, int i)
	{
		return new PointerIconCompat(IMPL.getSystemIcon(context, i));
	//    0    0:new             #2   <Class PointerIconCompat>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field PointerIconCompat$PointerIconCompatImpl IMPL>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokeinterface #94  <Method Object PointerIconCompat$PointerIconCompatImpl.getSystemIcon(Context, int)>
	//    6   14:invokespecial   #89  <Method void PointerIconCompat(Object)>
	//    7   17:areturn         
	}

	public static PointerIconCompat load(Resources resources, int i)
	{
		return new PointerIconCompat(IMPL.load(resources, i));
	//    0    0:new             #2   <Class PointerIconCompat>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field PointerIconCompat$PointerIconCompatImpl IMPL>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokeinterface #99  <Method Object PointerIconCompat$PointerIconCompatImpl.load(Resources, int)>
	//    6   14:invokespecial   #89  <Method void PointerIconCompat(Object)>
	//    7   17:areturn         
	}

	public Object getPointerIcon()
	{
		return mPointerIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Object mPointerIcon>
	//    2    4:areturn         
	}

	static final PointerIconCompatImpl IMPL;
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

	static 
	{
		if(BuildCompat.isAtLeastN())
	//*   0    0:invokestatic    #71  <Method boolean BuildCompat.isAtLeastN()>
	//*   1    3:ifeq            17
			IMPL = ((PointerIconCompatImpl) (new Api24PointerIconCompatImpl()));
	//    2    6:new             #6   <Class PointerIconCompat$Api24PointerIconCompatImpl>
	//    3    9:dup             
	//    4   10:invokespecial   #74  <Method void PointerIconCompat$Api24PointerIconCompatImpl()>
	//    5   13:putstatic       #76  <Field PointerIconCompat$PointerIconCompatImpl IMPL>
	//    6   16:return          
		else
			IMPL = ((PointerIconCompatImpl) (new BasePointerIconCompatImpl()));
	//    7   17:new             #9   <Class PointerIconCompat$BasePointerIconCompatImpl>
	//    8   20:dup             
	//    9   21:invokespecial   #77  <Method void PointerIconCompat$BasePointerIconCompatImpl()>
	//   10   24:putstatic       #76  <Field PointerIconCompat$PointerIconCompatImpl IMPL>
	//*  11   27:return          
	}
}
