// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			MarginLayoutParamsCompat

static class MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase
	implements MarginLayoutParamsCompat.MarginLayoutParamsCompatImpl
{

	public int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return marginlayoutparams.rightMargin;
	//    0    0:aload_1         
	//    1    1:getfield        #23  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//    2    4:ireturn         
	}

	public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return marginlayoutparams.leftMargin;
	//    0    0:aload_1         
	//    1    1:getfield        #27  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    2    4:ireturn         
	}

	public boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
	//    0    0:return          
	}

	public void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
	//    0    0:return          
	}

	public void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		marginlayoutparams.rightMargin = i;
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:putfield        #23  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//    3    5:return          
	}

	public void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		marginlayoutparams.leftMargin = i;
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:putfield        #27  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    3    5:return          
	}

	MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
