// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			ViewUtilsApi14, ViewOverlayApi18, WindowIdApi18, ViewOverlayImpl, 
//			WindowIdImpl

class ViewUtilsApi18 extends ViewUtilsApi14
{

	ViewUtilsApi18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ViewUtilsApi14()>
	//    2    4:return          
	}

	public ViewOverlayImpl getOverlay(View view)
	{
		return ((ViewOverlayImpl) (new ViewOverlayApi18(view)));
	//    0    0:new             #17  <Class ViewOverlayApi18>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #20  <Method void ViewOverlayApi18(View)>
	//    4    8:areturn         
	}

	public WindowIdImpl getWindowId(View view)
	{
		return ((WindowIdImpl) (new WindowIdApi18(view)));
	//    0    0:new             #25  <Class WindowIdApi18>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #26  <Method void WindowIdApi18(View)>
	//    4    8:areturn         
	}
}
