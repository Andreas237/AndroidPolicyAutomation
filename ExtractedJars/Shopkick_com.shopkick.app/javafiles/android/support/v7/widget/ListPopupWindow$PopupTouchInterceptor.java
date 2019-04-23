// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow

private class ListPopupWindow$PopupTouchInterceptor
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		int i = motionevent.getAction();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
	//    2    4:istore_3        
		int j = (int)motionevent.getX();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #31  <Method float MotionEvent.getX()>
	//    5    9:f2i             
	//    6   10:istore          4
		int k = (int)motionevent.getY();
	//    7   12:aload_2         
	//    8   13:invokevirtual   #34  <Method float MotionEvent.getY()>
	//    9   16:f2i             
	//   10   17:istore          5
		if(i == 0 && mPopup != null && mPopup.isShowing() && j >= 0 && j < mPopup.getWidth() && k >= 0 && k < mPopup.getHeight())
	//*  11   19:iload_3         
	//*  12   20:ifne            110
	//*  13   23:aload_0         
	//*  14   24:getfield        #15  <Field ListPopupWindow this$0>
	//*  15   27:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
	//*  16   30:ifnull          110
	//*  17   33:aload_0         
	//*  18   34:getfield        #15  <Field ListPopupWindow this$0>
	//*  19   37:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
	//*  20   40:invokevirtual   #44  <Method boolean PopupWindow.isShowing()>
	//*  21   43:ifeq            110
	//*  22   46:iload           4
	//*  23   48:iflt            110
	//*  24   51:iload           4
	//*  25   53:aload_0         
	//*  26   54:getfield        #15  <Field ListPopupWindow this$0>
	//*  27   57:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
	//*  28   60:invokevirtual   #47  <Method int PopupWindow.getWidth()>
	//*  29   63:icmpge          110
	//*  30   66:iload           5
	//*  31   68:iflt            110
	//*  32   71:iload           5
	//*  33   73:aload_0         
	//*  34   74:getfield        #15  <Field ListPopupWindow this$0>
	//*  35   77:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
	//*  36   80:invokevirtual   #50  <Method int PopupWindow.getHeight()>
	//*  37   83:icmpge          110
			mHandler.postDelayed(((Runnable) (mResizePopupRunnable)), 250L);
	//   38   86:aload_0         
	//   39   87:getfield        #15  <Field ListPopupWindow this$0>
	//   40   90:getfield        #54  <Field Handler ListPopupWindow.mHandler>
	//   41   93:aload_0         
	//   42   94:getfield        #15  <Field ListPopupWindow this$0>
	//   43   97:getfield        #58  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
	//   44  100:ldc2w           #59  <Long 250L>
	//   45  103:invokevirtual   #66  <Method boolean Handler.postDelayed(Runnable, long)>
	//   46  106:pop             
		else
	//*  47  107:goto            132
		if(i == 1)
	//*  48  110:iload_3         
	//*  49  111:iconst_1        
	//*  50  112:icmpne          132
			mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
	//   51  115:aload_0         
	//   52  116:getfield        #15  <Field ListPopupWindow this$0>
	//   53  119:getfield        #54  <Field Handler ListPopupWindow.mHandler>
	//   54  122:aload_0         
	//   55  123:getfield        #15  <Field ListPopupWindow this$0>
	//   56  126:getfield        #58  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
	//   57  129:invokevirtual   #70  <Method void Handler.removeCallbacks(Runnable)>
		return false;
	//   58  132:iconst_0        
	//   59  133:ireturn         
	}

	final ListPopupWindow this$0;

	ListPopupWindow$PopupTouchInterceptor()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
