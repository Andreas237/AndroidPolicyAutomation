// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetDialog

class BottomSheetDialog$1
	implements android.view.
{

	public void onClick(View view)
	{
		if(cancelable && isShowing() && shouldWindowCloseOnTouchOutside())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field BottomSheetDialog this$0>
	//*   2    4:getfield        #27  <Field boolean BottomSheetDialog.cancelable>
	//*   3    7:ifeq            37
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field BottomSheetDialog this$0>
	//*   6   14:invokevirtual   #31  <Method boolean BottomSheetDialog.isShowing()>
	//*   7   17:ifeq            37
	//*   8   20:aload_0         
	//*   9   21:getfield        #17  <Field BottomSheetDialog this$0>
	//*  10   24:invokevirtual   #34  <Method boolean BottomSheetDialog.shouldWindowCloseOnTouchOutside()>
	//*  11   27:ifeq            37
			cancel();
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field BottomSheetDialog this$0>
	//   14   34:invokevirtual   #37  <Method void BottomSheetDialog.cancel()>
	//   15   37:return          
	}

	final BottomSheetDialog this$0;

	BottomSheetDialog$1()
	{
		this$0 = BottomSheetDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BottomSheetDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
