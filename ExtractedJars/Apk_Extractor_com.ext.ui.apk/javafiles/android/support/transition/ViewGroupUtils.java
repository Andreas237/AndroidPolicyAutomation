// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			ViewGroupUtilsApi18, ViewGroupUtilsApi14, ViewGroupUtilsImpl, ViewGroupOverlayImpl

class ViewGroupUtils
{

	ViewGroupUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static ViewGroupOverlayImpl getOverlay(ViewGroup viewgroup)
	{
		return IMPL.getOverlay(viewgroup);
	//    0    0:getstatic       #21  <Field ViewGroupUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #33  <Method ViewGroupOverlayImpl ViewGroupUtilsImpl.getOverlay(ViewGroup)>
	//    3    9:areturn         
	}

	static void suppressLayout(ViewGroup viewgroup, boolean flag)
	{
		IMPL.suppressLayout(viewgroup, flag);
	//    0    0:getstatic       #21  <Field ViewGroupUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #38  <Method void ViewGroupUtilsImpl.suppressLayout(ViewGroup, boolean)>
	//    4   10:return          
	}

	private static final ViewGroupUtilsImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			IMPL = ((ViewGroupUtilsImpl) (new ViewGroupUtilsApi18()));
	//    3    8:new             #16  <Class ViewGroupUtilsApi18>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void ViewGroupUtilsApi18()>
	//    6   15:putstatic       #21  <Field ViewGroupUtilsImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ViewGroupUtilsImpl) (new ViewGroupUtilsApi14()));
	//    8   19:new             #23  <Class ViewGroupUtilsApi14>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void ViewGroupUtilsApi14()>
	//   11   26:putstatic       #21  <Field ViewGroupUtilsImpl IMPL>
	//*  12   29:return          
	}
}
