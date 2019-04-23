// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.graphics.drawable.*;

// Referenced classes of package com.bumptech.glide.request.transition:
//			Transition

public class DrawableCrossFadeTransition
	implements Transition
{

	public DrawableCrossFadeTransition(int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		duration = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int duration>
		isCrossFadeEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean isCrossFadeEnabled>
	//    8   14:return          
	}

	public boolean transition(Drawable drawable, Transition.ViewAdapter viewadapter)
	{
		Drawable drawable1 = viewadapter.getCurrentDrawable();
	//    0    0:aload_2         
	//    1    1:invokeinterface #29  <Method Drawable Transition$ViewAdapter.getCurrentDrawable()>
	//    2    6:astore          4
		Object obj = ((Object) (drawable1));
	//    3    8:aload           4
	//    4   10:astore_3        
		if(drawable1 == null)
	//*   5   11:aload           4
	//*   6   13:ifnonnull       25
			obj = ((Object) (new ColorDrawable(0)));
	//    7   16:new             #31  <Class ColorDrawable>
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:invokespecial   #34  <Method void ColorDrawable(int)>
	//   11   24:astore_3        
		drawable = ((Drawable) (new TransitionDrawable(new Drawable[] {
			obj, drawable
		})));
	//   12   25:new             #36  <Class TransitionDrawable>
	//   13   28:dup             
	//   14   29:iconst_2        
	//   15   30:anewarray       Drawable[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload_3         
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:aload_1         
	//   23   40:aastore         
	//   24   41:invokespecial   #41  <Method void TransitionDrawable(Drawable[])>
	//   25   44:astore_1        
		((TransitionDrawable) (drawable)).setCrossFadeEnabled(isCrossFadeEnabled);
	//   26   45:aload_1         
	//   27   46:aload_0         
	//   28   47:getfield        #20  <Field boolean isCrossFadeEnabled>
	//   29   50:invokevirtual   #45  <Method void TransitionDrawable.setCrossFadeEnabled(boolean)>
		((TransitionDrawable) (drawable)).startTransition(duration);
	//   30   53:aload_1         
	//   31   54:aload_0         
	//   32   55:getfield        #18  <Field int duration>
	//   33   58:invokevirtual   #48  <Method void TransitionDrawable.startTransition(int)>
		viewadapter.setDrawable(drawable);
	//   34   61:aload_2         
	//   35   62:aload_1         
	//   36   63:invokeinterface #52  <Method void Transition$ViewAdapter.setDrawable(Drawable)>
		return true;
	//   37   68:iconst_1        
	//   38   69:ireturn         
	}

	public volatile boolean transition(Object obj, Transition.ViewAdapter viewadapter)
	{
		return transition((Drawable)obj, viewadapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class Drawable>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #55  <Method boolean transition(Drawable, Transition$ViewAdapter)>
	//    5    9:ireturn         
	}

	private final int duration;
	private final boolean isCrossFadeEnabled;
}
