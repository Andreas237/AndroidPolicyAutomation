// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper

class InAppMessageViewWrapper$1
	implements android.view.ayoutListener
{

	public void onGlobalLayout()
	{
		String s = InAppMessageViewWrapper.access$000();
	//    0    0:invokestatic    #34  <Method String InAppMessageViewWrapper.access$000()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("Detected root view height of ");
	//    6   12:aload_2         
	//    7   13:ldc1            #39  <String "Detected root view height of ">
	//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(val$frameLayout.getHeight());
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #23  <Field FrameLayout val$frameLayout>
	//   13   24:invokevirtual   #49  <Method int FrameLayout.getHeight()>
	//   14   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   15   30:pop             
		stringbuilder.append(", display height of ");
	//   16   31:aload_2         
	//   17   32:ldc1            #54  <String ", display height of ">
	//   18   34:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(val$displayHeight);
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #25  <Field int val$displayHeight>
	//   23   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   24   46:pop             
		stringbuilder.append(" in onGlobalLayout");
	//   25   47:aload_2         
	//   26   48:ldc1            #56  <String " in onGlobalLayout">
	//   27   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   29   54:aload_1         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   32   59:invokestatic    #65  <Method int AppboyLogger.d(String, String)>
	//   33   62:pop             
		val$frameLayout.removeView(InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this));
	//   34   63:aload_0         
	//   35   64:getfield        #23  <Field FrameLayout val$frameLayout>
	//   36   67:aload_0         
	//   37   68:getfield        #21  <Field InAppMessageViewWrapper this$0>
	//   38   71:invokestatic    #69  <Method android.view.View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//   39   74:invokevirtual   #73  <Method void FrameLayout.removeView(android.view.View)>
		InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this, val$frameLayout, val$displayHeight);
	//   40   77:aload_0         
	//   41   78:getfield        #21  <Field InAppMessageViewWrapper this$0>
	//   42   81:aload_0         
	//   43   82:getfield        #23  <Field FrameLayout val$frameLayout>
	//   44   85:aload_0         
	//   45   86:getfield        #25  <Field int val$displayHeight>
	//   46   89:invokestatic    #76  <Method void InAppMessageViewWrapper.access$200(InAppMessageViewWrapper, FrameLayout, int)>
		val$frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ayoutListener) (this)));
	//   47   92:aload_0         
	//   48   93:getfield        #23  <Field FrameLayout val$frameLayout>
	//   49   96:invokevirtual   #80  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//   50   99:aload_0         
	//   51  100:invokevirtual   #86  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   52  103:return          
	}

	final InAppMessageViewWrapper this$0;
	final int val$displayHeight;
	final FrameLayout val$frameLayout;

	InAppMessageViewWrapper$1()
	{
		this$0 = final_inappmessageviewwrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field InAppMessageViewWrapper this$0>
		val$frameLayout = framelayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field FrameLayout val$frameLayout>
		val$displayHeight = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$displayHeight>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
