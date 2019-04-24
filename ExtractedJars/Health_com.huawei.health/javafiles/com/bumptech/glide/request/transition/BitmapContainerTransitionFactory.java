// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, Transition

public abstract class BitmapContainerTransitionFactory
	implements TransitionFactory
{
	class BitmapGlideAnimation
		implements Transition
	{

		public boolean transition(Object obj, Transition.ViewAdapter viewadapter)
		{
			obj = ((Object) (new BitmapDrawable(viewadapter.getView().getResources(), getBitmap(obj))));
		//    0    0:new             #30  <Class BitmapDrawable>
		//    1    3:dup             
		//    2    4:aload_2         
		//    3    5:invokeinterface #36  <Method View Transition$ViewAdapter.getView()>
		//    4   10:invokevirtual   #42  <Method android.content.res.Resources View.getResources()>
		//    5   13:aload_0         
		//    6   14:getfield        #19  <Field BitmapContainerTransitionFactory this$0>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #46  <Method Bitmap BitmapContainerTransitionFactory.getBitmap(Object)>
		//    9   21:invokespecial   #49  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
		//   10   24:astore_1        
			return transition.transition(obj, viewadapter);
		//   11   25:aload_0         
		//   12   26:getfield        #24  <Field Transition transition>
		//   13   29:aload_1         
		//   14   30:aload_2         
		//   15   31:invokeinterface #51  <Method boolean Transition.transition(Object, Transition$ViewAdapter)>
		//   16   36:ireturn         
		}

		final BitmapContainerTransitionFactory this$0;
		private final Transition transition;

		public BitmapGlideAnimation(Transition transition1)
		{
			this$0 = BitmapContainerTransitionFactory.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BitmapContainerTransitionFactory this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			transition = transition1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Transition transition>
		//    8   14:return          
		}
	}


	public BitmapContainerTransitionFactory(TransitionFactory transitionfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		realFactory = transitionfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field TransitionFactory realFactory>
	//    5    9:return          
	}

	public Transition build(DataSource datasource, boolean flag)
	{
		return ((Transition) (new BitmapGlideAnimation(realFactory.build(datasource, flag))));
	//    0    0:new             #9   <Class BitmapContainerTransitionFactory$BitmapGlideAnimation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field TransitionFactory realFactory>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokeinterface #27  <Method Transition TransitionFactory.build(DataSource, boolean)>
	//    8   16:invokespecial   #30  <Method void BitmapContainerTransitionFactory$BitmapGlideAnimation(BitmapContainerTransitionFactory, Transition)>
	//    9   19:areturn         
	}

	protected abstract Bitmap getBitmap(Object obj);

	private final TransitionFactory realFactory;
}
