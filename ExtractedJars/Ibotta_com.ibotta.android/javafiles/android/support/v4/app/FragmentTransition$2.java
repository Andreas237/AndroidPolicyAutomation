// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransition, FragmentTransitionImpl, Fragment

static final class FragmentTransition$2
	implements Runnable
{

	public void run()
	{
		Object obj = val$enterTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object val$enterTransition>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          54
		{
			val$impl.removeTarget(obj, val$nonExistentView);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field FragmentTransitionImpl val$impl>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field View val$nonExistentView>
	//   10   18:invokevirtual   #53  <Method void FragmentTransitionImpl.removeTarget(Object, View)>
			obj = ((Object) (FragmentTransition.configureEnteringExitingViews(val$impl, val$enterTransition, val$inFragment, val$sharedElementsIn, val$nonExistentView)));
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field FragmentTransitionImpl val$impl>
	//   13   25:aload_0         
	//   14   26:getfield        #28  <Field Object val$enterTransition>
	//   15   29:aload_0         
	//   16   30:getfield        #34  <Field Fragment val$inFragment>
	//   17   33:aload_0         
	//   18   34:getfield        #36  <Field ArrayList val$sharedElementsIn>
	//   19   37:aload_0         
	//   20   38:getfield        #32  <Field View val$nonExistentView>
	//   21   41:invokestatic    #57  <Method ArrayList FragmentTransition.configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   22   44:astore_1        
			val$enteringViews.addAll(((java.util.Collection) (obj)));
	//   23   45:aload_0         
	//   24   46:getfield        #38  <Field ArrayList val$enteringViews>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #63  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   27   53:pop             
		}
		if(val$exitingViews != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #40  <Field ArrayList val$exitingViews>
	//*  30   58:ifnull          120
		{
			if(val$exitTransition != null)
	//*  31   61:aload_0         
	//*  32   62:getfield        #42  <Field Object val$exitTransition>
	//*  33   65:ifnull          101
			{
				ArrayList arraylist = new ArrayList();
	//   34   68:new             #59  <Class ArrayList>
	//   35   71:dup             
	//   36   72:invokespecial   #64  <Method void ArrayList()>
	//   37   75:astore_1        
				arraylist.add(((Object) (val$nonExistentView)));
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:getfield        #32  <Field View val$nonExistentView>
	//   41   81:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
	//   42   84:pop             
				val$impl.replaceTargets(val$exitTransition, val$exitingViews, arraylist);
	//   43   85:aload_0         
	//   44   86:getfield        #30  <Field FragmentTransitionImpl val$impl>
	//   45   89:aload_0         
	//   46   90:getfield        #42  <Field Object val$exitTransition>
	//   47   93:aload_0         
	//   48   94:getfield        #40  <Field ArrayList val$exitingViews>
	//   49   97:aload_1         
	//   50   98:invokevirtual   #72  <Method void FragmentTransitionImpl.replaceTargets(Object, ArrayList, ArrayList)>
			}
			val$exitingViews.clear();
	//   51  101:aload_0         
	//   52  102:getfield        #40  <Field ArrayList val$exitingViews>
	//   53  105:invokevirtual   #75  <Method void ArrayList.clear()>
			val$exitingViews.add(((Object) (val$nonExistentView)));
	//   54  108:aload_0         
	//   55  109:getfield        #40  <Field ArrayList val$exitingViews>
	//   56  112:aload_0         
	//   57  113:getfield        #32  <Field View val$nonExistentView>
	//   58  116:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
	//   59  119:pop             
		}
	//   60  120:return          
	}

	final Object val$enterTransition;
	final ArrayList val$enteringViews;
	final Object val$exitTransition;
	final ArrayList val$exitingViews;
	final FragmentTransitionImpl val$impl;
	final Fragment val$inFragment;
	final View val$nonExistentView;
	final ArrayList val$sharedElementsIn;

	FragmentTransition$2(Object obj, FragmentTransitionImpl fragmenttransitionimpl, View view, Fragment fragment, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, 
			Object obj1)
	{
		val$enterTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Object val$enterTransition>
		val$impl = fragmenttransitionimpl;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field FragmentTransitionImpl val$impl>
		val$nonExistentView = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field View val$nonExistentView>
		val$inFragment = fragment;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Fragment val$inFragment>
		val$sharedElementsIn = arraylist;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field ArrayList val$sharedElementsIn>
		val$enteringViews = arraylist1;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #38  <Field ArrayList val$enteringViews>
		val$exitingViews = arraylist2;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #40  <Field ArrayList val$exitingViews>
		val$exitTransition = obj1;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #42  <Field Object val$exitTransition>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #45  <Method void Object()>
	//   26   49:return          
	}
}
