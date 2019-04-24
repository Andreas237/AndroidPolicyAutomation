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
		if(val$enterTransition != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object val$enterTransition>
	//*   2    4:ifnull          55
		{
			val$impl.removeTarget(val$enterTransition, val$nonExistentView);
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field FragmentTransitionImpl val$impl>
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field Object val$enterTransition>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field View val$nonExistentView>
	//    9   19:invokevirtual   #53  <Method void FragmentTransitionImpl.removeTarget(Object, View)>
			ArrayList arraylist = FragmentTransition.access$100(val$impl, val$enterTransition, val$inFragment, val$sharedElementsIn, val$nonExistentView);
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field FragmentTransitionImpl val$impl>
	//   12   26:aload_0         
	//   13   27:getfield        #28  <Field Object val$enterTransition>
	//   14   30:aload_0         
	//   15   31:getfield        #34  <Field Fragment val$inFragment>
	//   16   34:aload_0         
	//   17   35:getfield        #36  <Field ArrayList val$sharedElementsIn>
	//   18   38:aload_0         
	//   19   39:getfield        #32  <Field View val$nonExistentView>
	//   20   42:invokestatic    #57  <Method ArrayList FragmentTransition.access$100(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   21   45:astore_1        
			val$enteringViews.addAll(((java.util.Collection) (arraylist)));
	//   22   46:aload_0         
	//   23   47:getfield        #38  <Field ArrayList val$enteringViews>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #63  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   26   54:pop             
		}
		if(val$exitingViews != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #40  <Field ArrayList val$exitingViews>
	//*  29   59:ifnull          121
		{
			if(val$exitTransition != null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #42  <Field Object val$exitTransition>
	//*  32   66:ifnull          102
			{
				ArrayList arraylist1 = new ArrayList();
	//   33   69:new             #59  <Class ArrayList>
	//   34   72:dup             
	//   35   73:invokespecial   #64  <Method void ArrayList()>
	//   36   76:astore_1        
				arraylist1.add(((Object) (val$nonExistentView)));
	//   37   77:aload_1         
	//   38   78:aload_0         
	//   39   79:getfield        #32  <Field View val$nonExistentView>
	//   40   82:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
	//   41   85:pop             
				val$impl.replaceTargets(val$exitTransition, val$exitingViews, arraylist1);
	//   42   86:aload_0         
	//   43   87:getfield        #30  <Field FragmentTransitionImpl val$impl>
	//   44   90:aload_0         
	//   45   91:getfield        #42  <Field Object val$exitTransition>
	//   46   94:aload_0         
	//   47   95:getfield        #40  <Field ArrayList val$exitingViews>
	//   48   98:aload_1         
	//   49   99:invokevirtual   #72  <Method void FragmentTransitionImpl.replaceTargets(Object, ArrayList, ArrayList)>
			}
			val$exitingViews.clear();
	//   50  102:aload_0         
	//   51  103:getfield        #40  <Field ArrayList val$exitingViews>
	//   52  106:invokevirtual   #75  <Method void ArrayList.clear()>
			val$exitingViews.add(((Object) (val$nonExistentView)));
	//   53  109:aload_0         
	//   54  110:getfield        #40  <Field ArrayList val$exitingViews>
	//   55  113:aload_0         
	//   56  114:getfield        #32  <Field View val$nonExistentView>
	//   57  117:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
	//   58  120:pop             
		}
	//   59  121:return          
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
