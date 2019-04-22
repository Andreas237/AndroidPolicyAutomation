// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.stetho.common.Util;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlighter, ViewHighlightOverlays

private static final class ViewHighlighter$OverlayHighlighter extends ViewHighlighter
{

	private void highlightViewOnUiThread()
	{
		View view = (View)mViewToHighlight.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AtomicReference mViewToHighlight>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #72  <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #74  <Class View>
	//    5   11:astore_1        
		View view1 = mHighlightedView;
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field View mHighlightedView>
	//    8   16:astore_2        
		if(view == view1)
	//*   9   17:aload_1         
	//*  10   18:aload_2         
	//*  11   19:if_acmpne       23
			return;
	//   12   22:return          
		if(view1 != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          35
			mHighlightOverlays.removeHighlight(view1);
	//   15   27:aload_0         
	//   16   28:getfield        #35  <Field ViewHighlightOverlays mHighlightOverlays>
	//   17   31:aload_2         
	//   18   32:invokevirtual   #80  <Method void ViewHighlightOverlays.removeHighlight(View)>
		if(view != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          54
			mHighlightOverlays.highlightView(view, mContentColor.get());
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field ViewHighlightOverlays mHighlightOverlays>
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #45  <Field AtomicInteger mContentColor>
	//   26   48:invokevirtual   #84  <Method int AtomicInteger.get()>
	//   27   51:invokevirtual   #88  <Method void ViewHighlightOverlays.highlightView(View, int)>
		mHighlightedView = view;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:putfield        #76  <Field View mHighlightedView>
	//   31   59:return          
	}

	private void setHighlightedViewImpl(View view, int i)
	{
		mHandler.removeCallbacks(mHighlightViewOnUiThreadRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field Runnable mHighlightViewOnUiThreadRunnable>
	//    4    8:invokevirtual   #94  <Method void Handler.removeCallbacks(Runnable)>
		mViewToHighlight.set(((Object) (view)));
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field AtomicReference mViewToHighlight>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #98  <Method void AtomicReference.set(Object)>
		mContentColor.set(i);
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field AtomicInteger mContentColor>
	//   11   23:iload_2         
	//   12   24:invokevirtual   #101 <Method void AtomicInteger.set(int)>
		mHandler.postDelayed(mHighlightViewOnUiThreadRunnable, 100L);
	//   13   27:aload_0         
	//   14   28:getfield        #63  <Field Handler mHandler>
	//   15   31:aload_0         
	//   16   32:getfield        #50  <Field Runnable mHighlightViewOnUiThreadRunnable>
	//   17   35:ldc2w           #102 <Long 100L>
	//   18   38:invokevirtual   #107 <Method boolean Handler.postDelayed(Runnable, long)>
	//   19   41:pop             
	//   20   42:return          
	}

	public void clearHighlight()
	{
		setHighlightedViewImpl(((View) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:invokespecial   #111 <Method void setHighlightedViewImpl(View, int)>
	//    4    6:return          
	}

	public void setHighlightedView(View view, int i)
	{
		setHighlightedViewImpl((View)Util.throwIfNull(((Object) (view))), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #117 <Method Object Util.throwIfNull(Object)>
	//    3    5:checkcast       #74  <Class View>
	//    4    8:iload_2         
	//    5    9:invokespecial   #111 <Method void setHighlightedViewImpl(View, int)>
	//    6   12:return          
	}

	private AtomicInteger mContentColor;
	private final Handler mHandler = new Handler(Looper.getMainLooper());
	private final ViewHighlightOverlays mHighlightOverlays = ViewHighlightOverlays.newInstance();
	private final Runnable mHighlightViewOnUiThreadRunnable = new Runnable() {

		public void run()
		{
			highlightViewOnUiThread();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ViewHighlighter$OverlayHighlighter this$0>
		//    2    4:invokestatic    #25  <Method void ViewHighlighter$OverlayHighlighter.access$100(ViewHighlighter$OverlayHighlighter)>
		//    3    7:return          
		}

		final ViewHighlighter.OverlayHighlighter this$0;

			
			{
				this$0 = ViewHighlighter.OverlayHighlighter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ViewHighlighter$OverlayHighlighter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private View mHighlightedView;
	private AtomicReference mViewToHighlight;


/*
	static void access$100(ViewHighlighter$OverlayHighlighter viewhighlighter$overlayhighlighter)
	{
		viewhighlighter$overlayhighlighter.highlightViewOnUiThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void highlightViewOnUiThread()>
		return;
	//    2    4:return          
	}

*/

	public ViewHighlighter$OverlayHighlighter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ViewHighlighter()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #33  <Method ViewHighlightOverlays ViewHighlightOverlays.newInstance()>
	//    4    8:putfield        #35  <Field ViewHighlightOverlays mHighlightOverlays>
		mViewToHighlight = new AtomicReference();
	//    5   11:aload_0         
	//    6   12:new             #37  <Class AtomicReference>
	//    7   15:dup             
	//    8   16:invokespecial   #38  <Method void AtomicReference()>
	//    9   19:putfield        #40  <Field AtomicReference mViewToHighlight>
		mContentColor = new AtomicInteger();
	//   10   22:aload_0         
	//   11   23:new             #42  <Class AtomicInteger>
	//   12   26:dup             
	//   13   27:invokespecial   #43  <Method void AtomicInteger()>
	//   14   30:putfield        #45  <Field AtomicInteger mContentColor>
	//   15   33:aload_0         
	//   16   34:new             #7   <Class ViewHighlighter$OverlayHighlighter$1>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #48  <Method void ViewHighlighter$OverlayHighlighter$1(ViewHighlighter$OverlayHighlighter)>
	//   20   42:putfield        #50  <Field Runnable mHighlightViewOnUiThreadRunnable>
	//   21   45:aload_0         
	//   22   46:new             #52  <Class Handler>
	//   23   49:dup             
	//   24   50:invokestatic    #58  <Method Looper Looper.getMainLooper()>
	//   25   53:invokespecial   #61  <Method void Handler(Looper)>
	//   26   56:putfield        #63  <Field Handler mHandler>
	//   27   59:return          
	}
}
