// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


class MarginLayoutParamsCompatJellybeanMr1
{

	MarginLayoutParamsCompatJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return marginlayoutparams.getLayoutDirection();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method int android.view.ViewGroup$MarginLayoutParams.getLayoutDirection()>
	//    2    4:ireturn         
	}

	public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return marginlayoutparams.getMarginEnd();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int android.view.ViewGroup$MarginLayoutParams.getMarginEnd()>
	//    2    4:ireturn         
	}

	public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return marginlayoutparams.getMarginStart();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method int android.view.ViewGroup$MarginLayoutParams.getMarginStart()>
	//    2    4:ireturn         
	}

	public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return marginlayoutparams.isMarginRelative();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method boolean android.view.ViewGroup$MarginLayoutParams.isMarginRelative()>
	//    2    4:ireturn         
	}

	public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		marginlayoutparams.resolveLayoutDirection(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method void android.view.ViewGroup$MarginLayoutParams.resolveLayoutDirection(int)>
	//    3    5:return          
	}

	public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		marginlayoutparams.setLayoutDirection(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #38  <Method void android.view.ViewGroup$MarginLayoutParams.setLayoutDirection(int)>
	//    3    5:return          
	}

	public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		marginlayoutparams.setMarginEnd(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #41  <Method void android.view.ViewGroup$MarginLayoutParams.setMarginEnd(int)>
	//    3    5:return          
	}

	public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		marginlayoutparams.setMarginStart(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #44  <Method void android.view.ViewGroup$MarginLayoutParams.setMarginStart(int)>
	//    3    5:return          
	}
}
