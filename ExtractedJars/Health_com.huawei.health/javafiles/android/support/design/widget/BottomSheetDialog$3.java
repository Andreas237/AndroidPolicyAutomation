// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetDialog

class BottomSheetDialog$3 extends BottomSheetCallback
{

	public void onSlide(View view, float f)
	{
	//    0    0:return          
	}

	public void onStateChanged(View view, int i)
	{
		if(i == 5)
	//*   0    0:iload_2         
	//*   1    1:iconst_5        
	//*   2    2:icmpne          12
			b.cancel();
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field BottomSheetDialog b>
	//    5    9:invokevirtual   #25  <Method void BottomSheetDialog.cancel()>
	//    6   12:return          
	}

	final BottomSheetDialog b;

	BottomSheetDialog$3(BottomSheetDialog bottomsheetdialog)
	{
		b = bottomsheetdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BottomSheetDialog b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BottomSheetBehavior$BottomSheetCallback()>
	//    5    9:return          
	}
}
