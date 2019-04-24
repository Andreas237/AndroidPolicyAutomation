// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransition, FragmentTransitionCompat21, Fragment

static final class FragmentTransition$2
	implements Runnable
{

	public void run()
	{
		if(val$enterTransition != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Object val$enterTransition>
	//*   2    4:ifnull          47
		{
			FragmentTransitionCompat21.removeTarget(val$enterTransition, val$nonExistentView);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object val$enterTransition>
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field View val$nonExistentView>
	//    7   15:invokestatic    #49  <Method void FragmentTransitionCompat21.removeTarget(Object, View)>
			ArrayList arraylist = FragmentTransition.access$100(val$enterTransition, val$inFragment, val$sharedElementsIn, val$nonExistentView);
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field Object val$enterTransition>
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field Fragment val$inFragment>
	//   12   26:aload_0         
	//   13   27:getfield        #32  <Field ArrayList val$sharedElementsIn>
	//   14   30:aload_0         
	//   15   31:getfield        #28  <Field View val$nonExistentView>
	//   16   34:invokestatic    #53  <Method ArrayList FragmentTransition.access$100(Object, Fragment, ArrayList, View)>
	//   17   37:astore_1        
			val$enteringViews.addAll(((java.util.Collection) (arraylist)));
	//   18   38:aload_0         
	//   19   39:getfield        #34  <Field ArrayList val$enteringViews>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #59  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   22   46:pop             
		}
		if(val$exitingViews != null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #36  <Field ArrayList val$exitingViews>
	//*  25   51:ifnull          109
		{
			if(val$exitTransition != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #38  <Field Object val$exitTransition>
	//*  28   58:ifnull          90
			{
				ArrayList arraylist1 = new ArrayList();
	//   29   61:new             #55  <Class ArrayList>
	//   30   64:dup             
	//   31   65:invokespecial   #60  <Method void ArrayList()>
	//   32   68:astore_1        
				arraylist1.add(((Object) (val$nonExistentView)));
	//   33   69:aload_1         
	//   34   70:aload_0         
	//   35   71:getfield        #28  <Field View val$nonExistentView>
	//   36   74:invokevirtual   #64  <Method boolean ArrayList.add(Object)>
	//   37   77:pop             
				FragmentTransitionCompat21.replaceTargets(val$exitTransition, val$exitingViews, arraylist1);
	//   38   78:aload_0         
	//   39   79:getfield        #38  <Field Object val$exitTransition>
	//   40   82:aload_0         
	//   41   83:getfield        #36  <Field ArrayList val$exitingViews>
	//   42   86:aload_1         
	//   43   87:invokestatic    #68  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
			}
			val$exitingViews.clear();
	//   44   90:aload_0         
	//   45   91:getfield        #36  <Field ArrayList val$exitingViews>
	//   46   94:invokevirtual   #71  <Method void ArrayList.clear()>
			val$exitingViews.add(((Object) (val$nonExistentView)));
	//   47   97:aload_0         
	//   48   98:getfield        #36  <Field ArrayList val$exitingViews>
	//   49  101:aload_0         
	//   50  102:getfield        #28  <Field View val$nonExistentView>
	//   51  105:invokevirtual   #64  <Method boolean ArrayList.add(Object)>
	//   52  108:pop             
		}
	//   53  109:return          
	}

	final Object val$enterTransition;
	final ArrayList val$enteringViews;
	final Object val$exitTransition;
	final ArrayList val$exitingViews;
	final Fragment val$inFragment;
	final View val$nonExistentView;
	final ArrayList val$sharedElementsIn;

	FragmentTransition$2(Object obj, View view, Fragment fragment, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, Object obj1)
	{
		val$enterTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Object val$enterTransition>
		val$nonExistentView = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field View val$nonExistentView>
		val$inFragment = fragment;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field Fragment val$inFragment>
		val$sharedElementsIn = arraylist;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field ArrayList val$sharedElementsIn>
		val$enteringViews = arraylist1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field ArrayList val$enteringViews>
		val$exitingViews = arraylist2;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #36  <Field ArrayList val$exitingViews>
		val$exitTransition = obj1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #38  <Field Object val$exitTransition>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #41  <Method void Object()>
	//   23   43:return          
	}
}
