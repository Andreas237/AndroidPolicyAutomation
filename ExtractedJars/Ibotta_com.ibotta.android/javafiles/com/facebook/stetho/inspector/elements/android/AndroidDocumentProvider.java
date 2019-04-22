// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.*;
import android.content.Context;
import android.graphics.Canvas;
import android.view.*;
import android.widget.TextView;
import com.facebook.stetho.common.*;
import com.facebook.stetho.common.android.ViewUtil;
import com.facebook.stetho.inspector.elements.*;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDescriptorHost, AndroidDocumentRoot, ActivityDescriptor, ApplicationDescriptor, 
//			DialogDescriptor, DialogFragmentDescriptor, FragmentDescriptor, TextViewDescriptor, 
//			ViewDescriptor, ViewGroupDescriptor, WindowDescriptor, ViewHighlighter, 
//			HighlightableDescriptor, DocumentHiddenView

final class AndroidDocumentProvider extends ThreadBoundProxy
	implements DocumentProvider, AndroidDescriptorHost
{
	private final class InspectModeHandler
	{

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
			getWindows(new Accumulator() {

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
						Object obj = ((Object) (InspectModeHandler.this));
				//    8   18:aload_0         
				//    9   19:getfield        #21  <Field AndroidDocumentProvider$InspectModeHandler this$1>
				//   10   22:astore_2        
						obj = ((Object) (((InspectModeHandler.OverlayView) (obj)). new OverlayView(((Context) (((InspectModeHandler) (obj))._fld0.mApplication)))));
				//   11   23:new             #36  <Class AndroidDocumentProvider$InspectModeHandler$OverlayView>
				//   12   26:dup             
				//   13   27:aload_2         
				//   14   28:aload_2         
				//   15   29:getfield        #40  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
				//   16   32:invokestatic    #44  <Method Application AndroidDocumentProvider.access$300(AndroidDocumentProvider)>
				//   17   35:invokespecial   #47  <Method void AndroidDocumentProvider$InspectModeHandler$OverlayView(AndroidDocumentProvider$InspectModeHandler, Context)>
				//   18   38:astore_2        
						android.view.WindowManager.LayoutParams layoutparams = new LayoutParams();
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

				final InspectModeHandler this$1;

			
			{
				this$1 = InspectModeHandler.this;
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
		static List access$400(InspectModeHandler inspectmodehandler)
		{
			return inspectmodehandler.mOverlays;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field List mOverlays>
		//    2    4:areturn         
		}

*/


/*
		static Predicate access$600(InspectModeHandler inspectmodehandler)
		{
			return inspectmodehandler.mViewSelector;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Predicate mViewSelector>
		//    2    4:areturn         
		}

*/

		private InspectModeHandler()
		{
			this$0 = AndroidDocumentProvider.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field AndroidDocumentProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #29  <Method void Object()>
			mViewSelector = new _cls1();
		//    5    9:aload_0         
		//    6   10:new             #9   <Class AndroidDocumentProvider$InspectModeHandler$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:invokespecial   #32  <Method void AndroidDocumentProvider$InspectModeHandler$1(AndroidDocumentProvider$InspectModeHandler)>
		//   10   18:putfield        #34  <Field Predicate mViewSelector>
		//   11   21:return          
		}

	}

	private final class InspectModeHandler.OverlayView extends DocumentHiddenView
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
					mHighlighter.setHighlightedView(view, 0x404040ff);
		//   22   48:aload_0         
		//   23   49:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
		//   24   52:getfield        #66  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
		//   25   55:invokestatic    #70  <Method ViewHighlighter AndroidDocumentProvider.access$700(AndroidDocumentProvider)>
		//   26   58:aload_2         
		//   27   59:ldc1            #71  <Int 0x404040ff>
		//   28   61:invokevirtual   #77  <Method void ViewHighlighter.setHighlightedView(View, int)>
					if(motionevent.getAction() == 1 && mListener != null)
		//*  29   64:aload_1         
		//*  30   65:invokevirtual   #62  <Method int MotionEvent.getAction()>
		//*  31   68:iconst_1        
		//*  32   69:icmpne          101
		//*  33   72:aload_0         
		//*  34   73:getfield        #16  <Field AndroidDocumentProvider$InspectModeHandler this$1>
		//*  35   76:getfield        #66  <Field AndroidDocumentProvider AndroidDocumentProvider$InspectModeHandler.this$0>
		//*  36   79:invokestatic    #81  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
		//*  37   82:ifnull          101
						mListener.onInspectRequested(((Object) (view)));
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

		final InspectModeHandler this$1;

		public InspectModeHandler.OverlayView(Context context)
		{
			this$1 = InspectModeHandler.this;
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


	public AndroidDocumentProvider(Application application, ThreadBound threadbound)
	{
		super(threadbound);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #53  <Method void ThreadBoundProxy(ThreadBound)>
		mIsReportChangesTimerPosted = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #55  <Field boolean mIsReportChangesTimerPosted>
	//    6   10:aload_0         
	//    7   11:new             #10  <Class AndroidDocumentProvider$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #58  <Method void AndroidDocumentProvider$1(AndroidDocumentProvider)>
	//   11   19:putfield        #60  <Field Runnable mReportChangesTimer>
		mApplication = (Application)Util.throwIfNull(((Object) (application)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokestatic    #66  <Method Object Util.throwIfNull(Object)>
	//   15   27:checkcast       #68  <Class Application>
	//   16   30:putfield        #70  <Field Application mApplication>
		mDocumentRoot = new AndroidDocumentRoot(application);
	//   17   33:aload_0         
	//   18   34:new             #72  <Class AndroidDocumentRoot>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokespecial   #75  <Method void AndroidDocumentRoot(Application)>
	//   22   42:putfield        #77  <Field AndroidDocumentRoot mDocumentRoot>
		mDescriptorMap = (new DescriptorMap()).beginInit().register(android/app/Activity, ((Descriptor) (new ActivityDescriptor()))).register(com/facebook/stetho/inspector/elements/android/AndroidDocumentRoot, ((Descriptor) (mDocumentRoot))).register(android/app/Application, ((Descriptor) (new ApplicationDescriptor()))).register(android/app/Dialog, ((Descriptor) (new DialogDescriptor())));
	//   23   45:aload_0         
	//   24   46:new             #79  <Class DescriptorMap>
	//   25   49:dup             
	//   26   50:invokespecial   #82  <Method void DescriptorMap()>
	//   27   53:invokevirtual   #86  <Method DescriptorMap DescriptorMap.beginInit()>
	//   28   56:ldc1            #88  <Class Activity>
	//   29   58:new             #90  <Class ActivityDescriptor>
	//   30   61:dup             
	//   31   62:invokespecial   #91  <Method void ActivityDescriptor()>
	//   32   65:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   33   68:ldc1            #72  <Class AndroidDocumentRoot>
	//   34   70:aload_0         
	//   35   71:getfield        #77  <Field AndroidDocumentRoot mDocumentRoot>
	//   36   74:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   37   77:ldc1            #68  <Class Application>
	//   38   79:new             #97  <Class ApplicationDescriptor>
	//   39   82:dup             
	//   40   83:invokespecial   #98  <Method void ApplicationDescriptor()>
	//   41   86:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   42   89:ldc1            #100 <Class Dialog>
	//   43   91:new             #102 <Class DialogDescriptor>
	//   44   94:dup             
	//   45   95:invokespecial   #103 <Method void DialogDescriptor()>
	//   46   98:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   47  101:putfield        #105 <Field DescriptorMap mDescriptorMap>
		DialogFragmentDescriptor.register(mDescriptorMap);
	//   48  104:aload_0         
	//   49  105:getfield        #105 <Field DescriptorMap mDescriptorMap>
	//   50  108:invokestatic    #110 <Method DescriptorMap DialogFragmentDescriptor.register(DescriptorMap)>
	//   51  111:pop             
		FragmentDescriptor.register(mDescriptorMap).register(java/lang/Object, ((Descriptor) (new ObjectDescriptor()))).register(android/widget/TextView, ((Descriptor) (new TextViewDescriptor()))).register(android/view/View, ((Descriptor) (new ViewDescriptor()))).register(android/view/ViewGroup, ((Descriptor) (new ViewGroupDescriptor()))).register(android/view/Window, ((Descriptor) (new WindowDescriptor()))).setHost(((com.facebook.stetho.inspector.elements.Descriptor.Host) (this))).endInit();
	//   52  112:aload_0         
	//   53  113:getfield        #105 <Field DescriptorMap mDescriptorMap>
	//   54  116:invokestatic    #113 <Method DescriptorMap FragmentDescriptor.register(DescriptorMap)>
	//   55  119:ldc1            #115 <Class Object>
	//   56  121:new             #117 <Class ObjectDescriptor>
	//   57  124:dup             
	//   58  125:invokespecial   #118 <Method void ObjectDescriptor()>
	//   59  128:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   60  131:ldc1            #120 <Class TextView>
	//   61  133:new             #122 <Class TextViewDescriptor>
	//   62  136:dup             
	//   63  137:invokespecial   #123 <Method void TextViewDescriptor()>
	//   64  140:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   65  143:ldc1            #125 <Class View>
	//   66  145:new             #127 <Class ViewDescriptor>
	//   67  148:dup             
	//   68  149:invokespecial   #128 <Method void ViewDescriptor()>
	//   69  152:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   70  155:ldc1            #130 <Class ViewGroup>
	//   71  157:new             #132 <Class ViewGroupDescriptor>
	//   72  160:dup             
	//   73  161:invokespecial   #133 <Method void ViewGroupDescriptor()>
	//   74  164:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   75  167:ldc1            #135 <Class Window>
	//   76  169:new             #137 <Class WindowDescriptor>
	//   77  172:dup             
	//   78  173:invokespecial   #138 <Method void WindowDescriptor()>
	//   79  176:invokevirtual   #95  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   80  179:aload_0         
	//   81  180:invokevirtual   #142 <Method DescriptorMap DescriptorMap.setHost(com.facebook.stetho.inspector.elements.Descriptor$Host)>
	//   82  183:invokevirtual   #145 <Method DescriptorMap DescriptorMap.endInit()>
	//   83  186:pop             
	//   84  187:aload_0         
	//   85  188:invokestatic    #151 <Method ViewHighlighter ViewHighlighter.newInstance()>
	//   86  191:putfield        #153 <Field ViewHighlighter mHighlighter>
	//   87  194:aload_0         
	//   88  195:new             #14  <Class AndroidDocumentProvider$InspectModeHandler>
	//   89  198:dup             
	//   90  199:aload_0         
	//   91  200:aconst_null     
	//   92  201:invokespecial   #156 <Method void AndroidDocumentProvider$InspectModeHandler(AndroidDocumentProvider, AndroidDocumentProvider$1)>
	//   93  204:putfield        #158 <Field AndroidDocumentProvider$InspectModeHandler mInspectModeHandler>
	//   94  207:return          
	}

	private void getWindows(final Accumulator accumulator)
	{
		Descriptor descriptor = getDescriptor(((Object) (mApplication)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field Application mApplication>
	//    3    5:invokevirtual   #179 <Method Descriptor getDescriptor(Object)>
	//    4    8:astore_2        
		if(descriptor != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          32
		{
			accumulator = new Accumulator() {

				public void store(Object obj)
				{
					if(obj instanceof Window)
				//*   0    0:aload_1         
				//*   1    1:instanceof      #30  <Class Window>
				//*   2    4:ifeq            21
					{
						accumulator.store(((Object) ((Window)obj)));
				//    3    7:aload_0         
				//    4    8:getfield        #22  <Field Accumulator val$accumulator>
				//    5   11:aload_1         
				//    6   12:checkcast       #30  <Class Window>
				//    7   15:invokeinterface #32  <Method void Accumulator.store(Object)>
						return;
				//    8   20:return          
					}
					Descriptor descriptor1 = getDescriptor(obj);
				//    9   21:aload_0         
				//   10   22:getfield        #20  <Field AndroidDocumentProvider this$0>
				//   11   25:aload_1         
				//   12   26:invokevirtual   #36  <Method Descriptor AndroidDocumentProvider.getDescriptor(Object)>
				//   13   29:astore_2        
					if(descriptor1 != null)
				//*  14   30:aload_2         
				//*  15   31:ifnull          40
						descriptor1.getChildren(obj, ((Accumulator) (this)));
				//   16   34:aload_2         
				//   17   35:aload_1         
				//   18   36:aload_0         
				//   19   37:invokevirtual   #42  <Method void Descriptor.getChildren(Object, Accumulator)>
				//   20   40:return          
				}

				final AndroidDocumentProvider this$0;
				final Accumulator val$accumulator;

			
			{
				this$0 = AndroidDocumentProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AndroidDocumentProvider this$0>
				accumulator = accumulator1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Accumulator val$accumulator>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    7   13:new             #12  <Class AndroidDocumentProvider$2>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #181 <Method void AndroidDocumentProvider$2(AndroidDocumentProvider, Accumulator)>
	//   12   22:astore_1        
			descriptor.getChildren(((Object) (mApplication)), accumulator);
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:getfield        #70  <Field Application mApplication>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #187 <Method void Descriptor.getChildren(Object, Accumulator)>
		}
	//   18   32:return          
	}

	public void dispose()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		mHighlighter.clearHighlight();
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field ViewHighlighter mHighlighter>
	//    4    8:invokevirtual   #196 <Method void ViewHighlighter.clearHighlight()>
		mInspectModeHandler.disable();
	//    5   11:aload_0         
	//    6   12:getfield        #158 <Field AndroidDocumentProvider$InspectModeHandler mInspectModeHandler>
	//    7   15:invokevirtual   #199 <Method void AndroidDocumentProvider$InspectModeHandler.disable()>
		removeCallbacks(mReportChangesTimer);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #60  <Field Runnable mReportChangesTimer>
	//   11   23:invokevirtual   #203 <Method void removeCallbacks(Runnable)>
		mIsReportChangesTimerPosted = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #55  <Field boolean mIsReportChangesTimerPosted>
		mListener = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #165 <Field DocumentProviderListener mListener>
	//   18   36:return          
	}

	public Descriptor getDescriptor(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return mDescriptorMap.get(obj.getClass());
	//    4    6:aload_0         
	//    5    7:getfield        #105 <Field DescriptorMap mDescriptorMap>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #207 <Method Class Object.getClass()>
	//    8   14:invokevirtual   #211 <Method Descriptor DescriptorMap.get(Class)>
	//    9   17:areturn         
	}

	public View getHighlightingView(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Class class1 = obj.getClass();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #207 <Method Class Object.getClass()>
	//    6   10:astore_2        
		Descriptor descriptor = null;
	//    7   11:aconst_null     
	//    8   12:astore          4
		Object obj1;
		Object obj2;
		for(obj1 = ((Object) (descriptor)); obj1 == null && class1 != null; obj1 = obj2)
	//*   9   14:aload           4
	//*  10   16:astore_3        
	//*  11   17:aload_3         
	//*  12   18:ifnonnull       91
	//*  13   21:aload_2         
	//*  14   22:ifnull          91
		{
			Descriptor descriptor1 = mDescriptorMap.get(class1);
	//   15   25:aload_0         
	//   16   26:getfield        #105 <Field DescriptorMap mDescriptorMap>
	//   17   29:aload_2         
	//   18   30:invokevirtual   #211 <Method Descriptor DescriptorMap.get(Class)>
	//   19   33:astore          6
			if(descriptor1 == null)
	//*  20   35:aload           6
	//*  21   37:ifnonnull       42
				return null;
	//   22   40:aconst_null     
	//   23   41:areturn         
			obj2 = obj1;
	//   24   42:aload_3         
	//   25   43:astore          5
			if(descriptor1 != descriptor)
	//*  26   45:aload           6
	//*  27   47:aload           4
	//*  28   49:if_acmpeq       76
			{
				obj2 = obj1;
	//   29   52:aload_3         
	//   30   53:astore          5
				if(descriptor1 instanceof HighlightableDescriptor)
	//*  31   55:aload           6
	//*  32   57:instanceof      #215 <Class HighlightableDescriptor>
	//*  33   60:ifeq            76
					obj2 = ((Object) (((HighlightableDescriptor)descriptor1).getViewForHighlighting(obj)));
	//   34   63:aload           6
	//   35   65:checkcast       #215 <Class HighlightableDescriptor>
	//   36   68:aload_1         
	//   37   69:invokeinterface #218 <Method View HighlightableDescriptor.getViewForHighlighting(Object)>
	//   38   74:astore          5
			}
			class1 = class1.getSuperclass();
	//   39   76:aload_2         
	//   40   77:invokevirtual   #223 <Method Class Class.getSuperclass()>
	//   41   80:astore_2        
			descriptor = descriptor1;
	//   42   81:aload           6
	//   43   83:astore          4
		}

	//   44   85:aload           5
	//   45   87:astore_3        
	//*  46   88:goto            17
		return ((View) (obj1));
	//   47   91:aload_3         
	//   48   92:areturn         
	}

	public NodeDescriptor getNodeDescriptor(Object obj)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		return ((NodeDescriptor) (getDescriptor(obj)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #179 <Method Descriptor getDescriptor(Object)>
	//    5    9:areturn         
	}

	public Object getRootElement()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		return ((Object) (mDocumentRoot));
	//    2    4:aload_0         
	//    3    5:getfield        #77  <Field AndroidDocumentRoot mDocumentRoot>
	//    4    8:areturn         
	}

	public void hideHighlight()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		mHighlighter.clearHighlight();
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field ViewHighlighter mHighlighter>
	//    4    8:invokevirtual   #196 <Method void ViewHighlighter.clearHighlight()>
	//    5   11:return          
	}

	public void highlightElement(Object obj, int i)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		obj = ((Object) (getHighlightingView(obj)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #232 <Method View getHighlightingView(Object)>
	//    5    9:astore_1        
		if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       22
		{
			mHighlighter.clearHighlight();
	//    8   14:aload_0         
	//    9   15:getfield        #153 <Field ViewHighlighter mHighlighter>
	//   10   18:invokevirtual   #196 <Method void ViewHighlighter.clearHighlight()>
			return;
	//   11   21:return          
		} else
		{
			mHighlighter.setHighlightedView(((View) (obj)), i);
	//   12   22:aload_0         
	//   13   23:getfield        #153 <Field ViewHighlighter mHighlighter>
	//   14   26:aload_1         
	//   15   27:iload_2         
	//   16   28:invokevirtual   #236 <Method void ViewHighlighter.setHighlightedView(View, int)>
			return;
	//   17   31:return          
		}
	}

	public void onAttributeModified(Object obj, String s, String s1)
	{
		DocumentProviderListener documentproviderlistener = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field DocumentProviderListener mListener>
	//    2    4:astore          4
		if(documentproviderlistener != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			documentproviderlistener.onAttributeModified(obj, s, s1);
	//    5   11:aload           4
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:aload_3         
	//    9   16:invokeinterface #242 <Method void DocumentProviderListener.onAttributeModified(Object, String, String)>
	//   10   21:return          
	}

	public void onAttributeRemoved(Object obj, String s)
	{
		DocumentProviderListener documentproviderlistener = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field DocumentProviderListener mListener>
	//    2    4:astore_3        
		if(documentproviderlistener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			documentproviderlistener.onAttributeRemoved(obj, s);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #246 <Method void DocumentProviderListener.onAttributeRemoved(Object, String)>
	//    9   17:return          
	}

	public void setAttributesAsText(Object obj, String s)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		Descriptor descriptor = mDescriptorMap.get(obj.getClass());
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field DescriptorMap mDescriptorMap>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #207 <Method Class Object.getClass()>
	//    6   12:invokevirtual   #211 <Method Descriptor DescriptorMap.get(Class)>
	//    7   15:astore_3        
		if(descriptor != null)
	//*   8   16:aload_3         
	//*   9   17:ifnull          26
			descriptor.setAttributesAsText(obj, s);
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #249 <Method void Descriptor.setAttributesAsText(Object, String)>
	//   14   26:return          
	}

	public void setInspectModeEnabled(boolean flag)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            16
		{
			mInspectModeHandler.enable();
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field AndroidDocumentProvider$InspectModeHandler mInspectModeHandler>
	//    6   12:invokevirtual   #254 <Method void AndroidDocumentProvider$InspectModeHandler.enable()>
			return;
	//    7   15:return          
		} else
		{
			mInspectModeHandler.disable();
	//    8   16:aload_0         
	//    9   17:getfield        #158 <Field AndroidDocumentProvider$InspectModeHandler mInspectModeHandler>
	//   10   20:invokevirtual   #199 <Method void AndroidDocumentProvider$InspectModeHandler.disable()>
			return;
	//   11   23:return          
		}
	}

	public void setListener(DocumentProviderListener documentproviderlistener)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void verifyThreadAccess()>
		mListener = documentproviderlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #165 <Field DocumentProviderListener mListener>
		if(mListener == null && mIsReportChangesTimerPosted)
	//*   5    9:aload_0         
	//*   6   10:getfield        #165 <Field DocumentProviderListener mListener>
	//*   7   13:ifnonnull       37
	//*   8   16:aload_0         
	//*   9   17:getfield        #55  <Field boolean mIsReportChangesTimerPosted>
	//*  10   20:ifeq            37
		{
			mIsReportChangesTimerPosted = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #55  <Field boolean mIsReportChangesTimerPosted>
			removeCallbacks(mReportChangesTimer);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #60  <Field Runnable mReportChangesTimer>
	//   17   33:invokevirtual   #203 <Method void removeCallbacks(Runnable)>
			return;
	//   18   36:return          
		}
		if(mListener != null && !mIsReportChangesTimerPosted)
	//*  19   37:aload_0         
	//*  20   38:getfield        #165 <Field DocumentProviderListener mListener>
	//*  21   41:ifnull          67
	//*  22   44:aload_0         
	//*  23   45:getfield        #55  <Field boolean mIsReportChangesTimerPosted>
	//*  24   48:ifne            67
		{
			mIsReportChangesTimerPosted = true;
	//   25   51:aload_0         
	//   26   52:iconst_1        
	//   27   53:putfield        #55  <Field boolean mIsReportChangesTimerPosted>
			postDelayed(mReportChangesTimer, 1000L);
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #60  <Field Runnable mReportChangesTimer>
	//   31   61:ldc2w           #30  <Long 1000L>
	//   32   64:invokevirtual   #260 <Method void postDelayed(Runnable, long)>
		}
	//   33   67:return          
	}

	private static final int INSPECT_HOVER_COLOR = 0x404040ff;
	private static final int INSPECT_OVERLAY_COLOR = 0x40ffffff;
	private static final long REPORT_CHANGED_INTERVAL_MS = 1000L;
	private final Application mApplication;
	private final DescriptorMap mDescriptorMap;
	private final AndroidDocumentRoot mDocumentRoot;
	private final ViewHighlighter mHighlighter = ViewHighlighter.newInstance();
	private final InspectModeHandler mInspectModeHandler = new InspectModeHandler();
	private boolean mIsReportChangesTimerPosted;
	private DocumentProviderListener mListener;
	private final Runnable mReportChangesTimer = new Runnable() {

		public void run()
		{
			mIsReportChangesTimerPosted = false;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field AndroidDocumentProvider this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #23  <Method boolean AndroidDocumentProvider.access$002(AndroidDocumentProvider, boolean)>
		//    4    8:pop             
			if(mListener != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #14  <Field AndroidDocumentProvider this$0>
		//*   7   13:invokestatic    #27  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
		//*   8   16:ifnull          51
			{
				mListener.onPossiblyChanged();
		//    9   19:aload_0         
		//   10   20:getfield        #14  <Field AndroidDocumentProvider this$0>
		//   11   23:invokestatic    #27  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
		//   12   26:invokeinterface #32  <Method void DocumentProviderListener.onPossiblyChanged()>
				mIsReportChangesTimerPosted = true;
		//   13   31:aload_0         
		//   14   32:getfield        #14  <Field AndroidDocumentProvider this$0>
		//   15   35:iconst_1        
		//   16   36:invokestatic    #23  <Method boolean AndroidDocumentProvider.access$002(AndroidDocumentProvider, boolean)>
		//   17   39:pop             
				postDelayed(((Runnable) (this)), 1000L);
		//   18   40:aload_0         
		//   19   41:getfield        #14  <Field AndroidDocumentProvider this$0>
		//   20   44:aload_0         
		//   21   45:ldc2w           #33  <Long 1000L>
		//   22   48:invokevirtual   #38  <Method void AndroidDocumentProvider.postDelayed(Runnable, long)>
			}
		//   23   51:return          
		}

		final AndroidDocumentProvider this$0;

			
			{
				this$0 = AndroidDocumentProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AndroidDocumentProvider this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;


/*
	static boolean access$002(AndroidDocumentProvider androiddocumentprovider, boolean flag)
	{
		androiddocumentprovider.mIsReportChangesTimerPosted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean mIsReportChangesTimerPosted>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static DocumentProviderListener access$100(AndroidDocumentProvider androiddocumentprovider)
	{
		return androiddocumentprovider.mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field DocumentProviderListener mListener>
	//    2    4:areturn         
	}

*/


/*
	static Application access$300(AndroidDocumentProvider androiddocumentprovider)
	{
		return androiddocumentprovider.mApplication;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Application mApplication>
	//    2    4:areturn         
	}

*/


/*
	static void access$500(AndroidDocumentProvider androiddocumentprovider, Accumulator accumulator)
	{
		androiddocumentprovider.getWindows(accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #173 <Method void getWindows(Accumulator)>
		return;
	//    3    5:return          
	}

*/


/*
	static ViewHighlighter access$700(AndroidDocumentProvider androiddocumentprovider)
	{
		return androiddocumentprovider.mHighlighter;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field ViewHighlighter mHighlighter>
	//    2    4:areturn         
	}

*/

	// Unreferenced inner class com/facebook/stetho/inspector/elements/android/AndroidDocumentProvider$InspectModeHandler$1

/* anonymous class */
	class InspectModeHandler._cls1
		implements Predicate
	{

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

		final InspectModeHandler this$1;

			
			{
				this$1 = InspectModeHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AndroidDocumentProvider$InspectModeHandler this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
