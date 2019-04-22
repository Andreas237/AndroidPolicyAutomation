// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.ViewGroup;
import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDocumentProvider

class AndroidDocumentProvider$InspectModeHandler$2
	implements Accumulator
{

	public void store(Window window)
	{
		if(window.peekDecorView() instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #32  <Method android.view.View Window.peekDecorView()>
	//*   2    4:instanceof      #34  <Class ViewGroup>
	//*   3    7:ifeq            82
		{
			window = ((Window) ((ViewGroup)window.peekDecorView()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #32  <Method android.view.View Window.peekDecorView()>
	//    6   14:checkcast       #34  <Class ViewGroup>
	//    7   17:astore_1        
			Object obj = ((Object) (AndroidDocumentProvider.InspectModeHandler.this));
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field AndroidDocumentProvider$InspectModeHandler this$1>
	//   10   22:astore_2        
			obj = ((Object) (new erlayView(((AndroidDocumentProvider.InspectModeHandler) (obj)), ((android.content.Context) (AndroidDocumentProvider.access$300(((AndroidDocumentProvider.InspectModeHandler) (obj)).this$0))))));
	//   11   23:new             #36  <Class AndroidDocumentProvider$InspectModeHandler$OverlayView>
	//   12   26:dup             
	//   13   27:aload_2         
	//   14   28:aload_2         
	//   15   29:getfield        #40  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
	//   16   32:invokestatic    #44  <Method android.app.Application AndroidDocumentProvider.access$300(AndroidDocumentProvider)>
	//   17   35:invokespecial   #47  <Method void AndroidDocumentProvider$InspectModeHandler$OverlayView(AndroidDocumentProvider$InspectModeHandler, android.content.Context)>
	//   18   38:astore_2        
			android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
	//   19   39:new             #49  <Class android.view.WindowManager$LayoutParams>
	//   20   42:dup             
	//   21   43:invokespecial   #50  <Method void android.view.WindowManager$LayoutParams()>
	//   22   46:astore_3        
			layoutparams.width = -1;
	//   23   47:aload_3         
	//   24   48:iconst_m1       
	//   25   49:putfield        #54  <Field int android.view.WindowManager$LayoutParams.width>
			layoutparams.height = -1;
	//   26   52:aload_3         
	//   27   53:iconst_m1       
	//   28   54:putfield        #57  <Field int android.view.WindowManager$LayoutParams.height>
			((ViewGroup) (window)).addView(((android.view.View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:aload_3         
	//   32   60:invokevirtual   #61  <Method void ViewGroup.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			((ViewGroup) (window)).bringChildToFront(((android.view.View) (obj)));
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:invokevirtual   #65  <Method void ViewGroup.bringChildToFront(android.view.View)>
			AndroidDocumentProvider.InspectModeHandler.access$400(AndroidDocumentProvider.InspectModeHandler.this).add(obj);
	//   36   68:aload_0         
	//   37   69:getfield        #21  <Field AndroidDocumentProvider$InspectModeHandler this$1>
	//   38   72:invokestatic    #69  <Method List AndroidDocumentProvider$InspectModeHandler.access$400(AndroidDocumentProvider$InspectModeHandler)>
	//   39   75:aload_2         
	//   40   76:invokeinterface #75  <Method boolean List.add(Object)>
	//   41   81:pop             
		}
	//   42   82:return          
	}

	public volatile void store(Object obj)
	{
		store((Window)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class Window>
	//    3    5:invokevirtual   #78  <Method void store(Window)>
	//    4    8:return          
	}

	final AndroidDocumentProvider.InspectModeHandler this$1;

	AndroidDocumentProvider$InspectModeHandler$2()
	{
		this$1 = AndroidDocumentProvider.InspectModeHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AndroidDocumentProvider$InspectModeHandler this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
