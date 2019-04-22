// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.stetho.common.android.ViewUtil;
import com.facebook.stetho.inspector.elements.DocumentProviderListener;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			DocumentHiddenView, AndroidDocumentProvider, ViewHighlighter

private final class AndroidDocumentProvider$InspectModeHandler$OverlayView extends DocumentHiddenView
{

	protected void onDraw(Canvas canvas)
	{
		canvas.drawColor(0x40ffffff);
	//    0    0:aload_1         
	//    1    1:ldc1            #23  <Int 0x40ffffff>
	//    2    3:invokevirtual   #29  <Method void Canvas.drawColor(int)>
		super.onDraw(canvas);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #31  <Method void DocumentHiddenView.onDraw(Canvas)>
	//    6   11:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(getParent() instanceof View)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method android.view.ViewParent getParent()>
	//*   2    4:instanceof      #39  <Class View>
	//*   3    7:ifeq            101
		{
			View view = ViewUtil.hitTest((View)getParent(), motionevent.getX(), motionevent.getY(), AndroidDocumentProvider.InspectModeHandler.access$600(AndroidDocumentProvider.InspectModeHandler.this));
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method android.view.ViewParent getParent()>
	//    6   14:checkcast       #39  <Class View>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #45  <Method float MotionEvent.getX()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #48  <Method float MotionEvent.getY()>
	//   11   25:aload_0         
	//   12   26:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
	//   13   29:invokestatic    #52  <Method com.facebook.stetho.common.Predicate AndroidDocumentProvider$InspectModeHandler.access$600(AndroidDocumentProvider$InspectModeHandler)>
	//   14   32:invokestatic    #58  <Method View ViewUtil.hitTest(View, float, float, com.facebook.stetho.common.Predicate)>
	//   15   35:astore_2        
			if(motionevent.getAction() != 3 && view != null)
	//*  16   36:aload_1         
	//*  17   37:invokevirtual   #62  <Method int MotionEvent.getAction()>
	//*  18   40:iconst_3        
	//*  19   41:icmpeq          101
	//*  20   44:aload_2         
	//*  21   45:ifnull          101
			{
				AndroidDocumentProvider.access$700(this$0).setHighlightedView(view, 0x404040ff);
	//   22   48:aload_0         
	//   23   49:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
	//   24   52:getfield        #66  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
	//   25   55:invokestatic    #70  <Method ViewHighlighter AndroidDocumentProvider.access$700(AndroidDocumentProvider)>
	//   26   58:aload_2         
	//   27   59:ldc1            #71  <Int 0x404040ff>
	//   28   61:invokevirtual   #77  <Method void ViewHighlighter.setHighlightedView(View, int)>
				if(motionevent.getAction() == 1 && AndroidDocumentProvider.access$100(this$0) != null)
	//*  29   64:aload_1         
	//*  30   65:invokevirtual   #62  <Method int MotionEvent.getAction()>
	//*  31   68:iconst_1        
	//*  32   69:icmpne          101
	//*  33   72:aload_0         
	//*  34   73:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
	//*  35   76:getfield        #66  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
	//*  36   79:invokestatic    #81  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
	//*  37   82:ifnull          101
					AndroidDocumentProvider.access$100(this$0).onInspectRequested(((Object) (view)));
	//   38   85:aload_0         
	//   39   86:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
	//   40   89:getfield        #66  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
	//   41   92:invokestatic    #81  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
	//   42   95:aload_2         
	//   43   96:invokeinterface #87  <Method void DocumentProviderListener.onInspectRequested(Object)>
			}
		}
		return true;
	//   44  101:iconst_1        
	//   45  102:ireturn         
	}

	final AndroidDocumentProvider.InspectModeHandler this$1;

	public AndroidDocumentProvider$InspectModeHandler$OverlayView(Context context)
	{
		this$1 = AndroidDocumentProvider.InspectModeHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void DocumentHiddenView(Context)>
	//    6   10:return          
	}
}
