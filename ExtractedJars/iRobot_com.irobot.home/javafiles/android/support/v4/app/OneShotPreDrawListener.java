// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

class OneShotPreDrawListener
	implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnPreDrawListener
{

	private OneShotPreDrawListener(View view, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field View mView>
		mViewTreeObserver = view.getViewTreeObserver();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #27  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    8   14:putfield        #29  <Field ViewTreeObserver mViewTreeObserver>
		mRunnable = runnable;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #31  <Field Runnable mRunnable>
	//   12   22:return          
	}

	public static OneShotPreDrawListener add(View view, Runnable runnable)
	{
		runnable = ((Runnable) (new OneShotPreDrawListener(view, runnable)));
	//    0    0:new             #2   <Class OneShotPreDrawListener>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #36  <Method void OneShotPreDrawListener(View, Runnable)>
	//    5    9:astore_1        
		view.getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (runnable)));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #27  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #42  <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (runnable)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #46  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		return ((OneShotPreDrawListener) (runnable));
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public boolean onPreDraw()
	{
		removeListener();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method void removeListener()>
		mRunnable.run();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Runnable mRunnable>
	//    4    8:invokeinterface #56  <Method void Runnable.run()>
		return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
	}

	public void onViewAttachedToWindow(View view)
	{
		mViewTreeObserver = view.getViewTreeObserver();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    3    5:putfield        #29  <Field ViewTreeObserver mViewTreeObserver>
	//    4    8:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		removeListener();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method void removeListener()>
	//    2    4:return          
	}

	public void removeListener()
	{
		ViewTreeObserver viewtreeobserver;
		if(mViewTreeObserver.isAlive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field ViewTreeObserver mViewTreeObserver>
	//*   2    4:invokevirtual   #62  <Method boolean ViewTreeObserver.isAlive()>
	//*   3    7:ifeq            23
			viewtreeobserver = mViewTreeObserver;
	//    4   10:aload_0         
	//    5   11:getfield        #29  <Field ViewTreeObserver mViewTreeObserver>
	//    6   14:astore_1        
		else
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #65  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
	//*  10   20:goto            34
			viewtreeobserver = mView.getViewTreeObserver();
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field View mView>
	//   13   27:invokevirtual   #27  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   14   30:astore_1        
		viewtreeobserver.removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (this)));
	//*  15   31:goto            15
		mView.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   16   34:aload_0         
	//   17   35:getfield        #21  <Field View mView>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #68  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//   20   42:return          
	}

	private final Runnable mRunnable;
	private final View mView;
	private ViewTreeObserver mViewTreeObserver;
}
