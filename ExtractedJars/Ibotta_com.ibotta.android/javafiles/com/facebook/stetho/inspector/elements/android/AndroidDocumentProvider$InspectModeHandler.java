// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.content.Context;
import android.graphics.Canvas;
import android.view.*;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Predicate;
import com.facebook.stetho.common.android.ViewUtil;
import com.facebook.stetho.inspector.elements.DocumentProviderListener;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDocumentProvider, DocumentHiddenView, ViewHighlighter

private final class AndroidDocumentProvider$InspectModeHandler
{
	private final class OverlayView extends DocumentHiddenView
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
				View view = ViewUtil.hitTest((View)getParent(), motionevent.getX(), motionevent.getY(), mViewSelector);
		//    4   10:aload_0         
		//    5   11:invokevirtual   #37  <Method android.view.ViewParent getParent()>
		//    6   14:checkcast       #39  <Class View>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #45  <Method float MotionEvent.getX()>
		//    9   21:aload_1         
		//   10   22:invokevirtual   #48  <Method float MotionEvent.getY()>
		//   11   25:aload_0         
		//   12   26:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
		//   13   29:invokestatic    #52  <Method Predicate AndroidDocumentProvider$InspectModeHandler.access$600(AndroidDocumentProvider$InspectModeHandler)>
		//   14   32:invokestatic    #58  <Method View ViewUtil.hitTest(View, float, float, Predicate)>
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

		public OverlayView(Context context)
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


	public void disable()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AndroidDocumentProvider this$0>
	//    2    4:invokevirtual   #48  <Method void AndroidDocumentProvider.verifyThreadAccess()>
		if(mOverlays == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field List mOverlays>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		for(int i = 0; i < mOverlays.size(); i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #42  <Field List mOverlays>
	//*  12   22:invokeinterface #54  <Method int List.size()>
	//*  13   27:icmpge          62
		{
			View view = (View)mOverlays.get(i);
	//   14   30:aload_0         
	//   15   31:getfield        #42  <Field List mOverlays>
	//   16   34:iload_1         
	//   17   35:invokeinterface #58  <Method Object List.get(int)>
	//   18   40:checkcast       #60  <Class View>
	//   19   43:astore_2        
			((ViewGroup)view.getParent()).removeView(view);
	//   20   44:aload_2         
	//   21   45:invokevirtual   #64  <Method android.view.ViewParent View.getParent()>
	//   22   48:checkcast       #66  <Class ViewGroup>
	//   23   51:aload_2         
	//   24   52:invokevirtual   #70  <Method void ViewGroup.removeView(View)>
		}

	//   25   55:iload_1         
	//   26   56:iconst_1        
	//   27   57:iadd            
	//   28   58:istore_1        
	//*  29   59:goto            17
		mOverlays = null;
	//   30   62:aload_0         
	//   31   63:aconst_null     
	//   32   64:putfield        #42  <Field List mOverlays>
	//   33   67:return          
	}

	public void enable()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AndroidDocumentProvider this$0>
	//    2    4:invokevirtual   #48  <Method void AndroidDocumentProvider.verifyThreadAccess()>
		if(mOverlays != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field List mOverlays>
	//*   5   11:ifnull          18
			disable();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #73  <Method void disable()>
		mOverlays = ((List) (new ArrayList()));
	//    8   18:aload_0         
	//    9   19:new             #75  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #76  <Method void ArrayList()>
	//   12   26:putfield        #42  <Field List mOverlays>
		AndroidDocumentProvider.access$500(AndroidDocumentProvider.this, new Accumulator() {

			public void store(Window window)
			{
				if(window.peekDecorView() instanceof ViewGroup)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #32  <Method View Window.peekDecorView()>
			//*   2    4:instanceof      #34  <Class ViewGroup>
			//*   3    7:ifeq            82
				{
					window = ((Window) ((ViewGroup)window.peekDecorView()));
			//    4   10:aload_1         
			//    5   11:invokevirtual   #32  <Method View Window.peekDecorView()>
			//    6   14:checkcast       #34  <Class ViewGroup>
			//    7   17:astore_1        
					Object obj = ((Object) (AndroidDocumentProvider.InspectModeHandler.this));
			//    8   18:aload_0         
			//    9   19:getfield        #21  <Field AndroidDocumentProvider$InspectModeHandler this$1>
			//   10   22:astore_2        
					obj = ((Object) (((OverlayView) (obj)). new OverlayView(((Context) (AndroidDocumentProvider.access$300(((AndroidDocumentProvider.InspectModeHandler) (obj)).this$0))))));
			//   11   23:new             #36  <Class AndroidDocumentProvider$InspectModeHandler$OverlayView>
			//   12   26:dup             
			//   13   27:aload_2         
			//   14   28:aload_2         
			//   15   29:getfield        #40  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
			//   16   32:invokestatic    #44  <Method android.app.Application AndroidDocumentProvider.access$300(AndroidDocumentProvider)>
			//   17   35:invokespecial   #47  <Method void AndroidDocumentProvider$InspectModeHandler$OverlayView(AndroidDocumentProvider$InspectModeHandler, Context)>
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
					((ViewGroup) (window)).addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
			//   29   57:aload_1         
			//   30   58:aload_2         
			//   31   59:aload_3         
			//   32   60:invokevirtual   #61  <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
					((ViewGroup) (window)).bringChildToFront(((View) (obj)));
			//   33   63:aload_1         
			//   34   64:aload_2         
			//   35   65:invokevirtual   #65  <Method void ViewGroup.bringChildToFront(View)>
					mOverlays.add(obj);
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
);
	//   13   29:aload_0         
	//   14   30:getfield        #26  <Field AndroidDocumentProvider this$0>
	//   15   33:new             #11  <Class AndroidDocumentProvider$InspectModeHandler$2>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #77  <Method void AndroidDocumentProvider$InspectModeHandler$2(AndroidDocumentProvider$InspectModeHandler)>
	//   19   41:invokestatic    #81  <Method void AndroidDocumentProvider.access$500(AndroidDocumentProvider, Accumulator)>
	//   20   44:return          
	}

	private List mOverlays;
	private final Predicate mViewSelector;
	final AndroidDocumentProvider this$0;


/*
	static List access$400(AndroidDocumentProvider$InspectModeHandler androiddocumentprovider$inspectmodehandler)
	{
		return androiddocumentprovider$inspectmodehandler.mOverlays;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List mOverlays>
	//    2    4:areturn         
	}

*/


/*
	static Predicate access$600(AndroidDocumentProvider$InspectModeHandler androiddocumentprovider$inspectmodehandler)
	{
		return androiddocumentprovider$inspectmodehandler.mViewSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Predicate mViewSelector>
	//    2    4:areturn         
	}

*/

	private AndroidDocumentProvider$InspectModeHandler()
	{
		this$0 = AndroidDocumentProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field AndroidDocumentProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void Object()>
		mViewSelector = new Predicate() {

			public boolean apply(View view)
			{
				return !(view instanceof DocumentHiddenView);
			//    0    0:aload_1         
			//    1    1:instanceof      #26  <Class DocumentHiddenView>
			//    2    4:ifne            9
			//    3    7:iconst_1        
			//    4    8:ireturn         
			//    5    9:iconst_0        
			//    6   10:ireturn         
			}

			public volatile boolean apply(Object obj)
			{
				return apply((View)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class View>
			//    3    5:invokevirtual   #31  <Method boolean apply(View)>
			//    4    8:ireturn         
			}

			final AndroidDocumentProvider.InspectModeHandler this$1;

			
			{
				this$1 = AndroidDocumentProvider.InspectModeHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AndroidDocumentProvider$InspectModeHandler this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5    9:aload_0         
	//    6   10:new             #9   <Class AndroidDocumentProvider$InspectModeHandler$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #32  <Method void AndroidDocumentProvider$InspectModeHandler$1(AndroidDocumentProvider$InspectModeHandler)>
	//   10   18:putfield        #34  <Field Predicate mViewSelector>
	//   11   21:return          
	}

	AndroidDocumentProvider$InspectModeHandler(AndroidDocumentProvider._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void AndroidDocumentProvider$InspectModeHandler(AndroidDocumentProvider)>
	//    3    5:return          
	}
}
