// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.f.a;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransition, FragmentTransitionCompat21, Fragment

static final class FragmentTransition$4
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (FragmentTransition.access$300(val$nameOverrides, val$finalSharedElementTransition, val$fragments)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field a val$nameOverrides>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Object val$finalSharedElementTransition>
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
	//    6   12:invokestatic    #63  <Method a FragmentTransition.access$300(a, Object, FragmentTransition$FragmentContainerTransition)>
	//    7   15:astore_1        
		if(obj != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          44
		{
			val$sharedElementsIn.addAll(((a) (obj)).values());
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field ArrayList val$sharedElementsIn>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #69  <Method java.util.Collection a.values()>
	//   14   28:invokevirtual   #75  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   15   31:pop             
			val$sharedElementsIn.add(((Object) (val$nonExistentView)));
	//   16   32:aload_0         
	//   17   33:getfield        #40  <Field ArrayList val$sharedElementsIn>
	//   18   36:aload_0         
	//   19   37:getfield        #42  <Field View val$nonExistentView>
	//   20   40:invokevirtual   #79  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		}
		FragmentTransition.access$200(val$inFragment, val$outFragment, val$inIsPop, ((a) (obj)), false);
	//   22   44:aload_0         
	//   23   45:getfield        #44  <Field Fragment val$inFragment>
	//   24   48:aload_0         
	//   25   49:getfield        #46  <Field Fragment val$outFragment>
	//   26   52:aload_0         
	//   27   53:getfield        #48  <Field boolean val$inIsPop>
	//   28   56:aload_1         
	//   29   57:iconst_0        
	//   30   58:invokestatic    #83  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, a, boolean)>
		if(val$finalSharedElementTransition != null)
	//*  31   61:aload_0         
	//*  32   62:getfield        #36  <Field Object val$finalSharedElementTransition>
	//*  33   65:ifnull          112
		{
			FragmentTransitionCompat21.swapSharedElementTargets(val$finalSharedElementTransition, val$sharedElementsOut, val$sharedElementsIn);
	//   34   68:aload_0         
	//   35   69:getfield        #36  <Field Object val$finalSharedElementTransition>
	//   36   72:aload_0         
	//   37   73:getfield        #50  <Field ArrayList val$sharedElementsOut>
	//   38   76:aload_0         
	//   39   77:getfield        #40  <Field ArrayList val$sharedElementsIn>
	//   40   80:invokestatic    #89  <Method void FragmentTransitionCompat21.swapSharedElementTargets(Object, ArrayList, ArrayList)>
			obj = ((Object) (FragmentTransition.access$400(((a) (obj)), val$fragments, val$enterTransition, val$inIsPop)));
	//   41   83:aload_1         
	//   42   84:aload_0         
	//   43   85:getfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
	//   44   88:aload_0         
	//   45   89:getfield        #52  <Field Object val$enterTransition>
	//   46   92:aload_0         
	//   47   93:getfield        #48  <Field boolean val$inIsPop>
	//   48   96:invokestatic    #93  <Method View FragmentTransition.access$400(a, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//   49   99:astore_1        
			if(obj != null)
	//*  50  100:aload_1         
	//*  51  101:ifnull          112
				FragmentTransitionCompat21.getBoundsOnScreen(((View) (obj)), val$inEpicenter);
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #54  <Field Rect val$inEpicenter>
	//   55  109:invokestatic    #97  <Method void FragmentTransitionCompat21.getBoundsOnScreen(View, Rect)>
		}
	//   56  112:return          
	}

	final Object val$enterTransition;
	final Object val$finalSharedElementTransition;
	final agmentContainerTransition val$fragments;
	final Rect val$inEpicenter;
	final Fragment val$inFragment;
	final boolean val$inIsPop;
	final a val$nameOverrides;
	final View val$nonExistentView;
	final Fragment val$outFragment;
	final ArrayList val$sharedElementsIn;
	final ArrayList val$sharedElementsOut;

	FragmentTransition$4(a a1, Object obj, agmentContainerTransition agmentcontainertransition, ArrayList arraylist, View view, Fragment fragment, Fragment fragment1, 
			boolean flag, ArrayList arraylist1, Object obj1, Rect rect)
	{
		val$nameOverrides = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field a val$nameOverrides>
		val$finalSharedElementTransition = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #36  <Field Object val$finalSharedElementTransition>
		val$fragments = agmentcontainertransition;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
		val$sharedElementsIn = arraylist;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #40  <Field ArrayList val$sharedElementsIn>
		val$nonExistentView = view;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #42  <Field View val$nonExistentView>
		val$inFragment = fragment;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #44  <Field Fragment val$inFragment>
		val$outFragment = fragment1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #46  <Field Fragment val$outFragment>
		val$inIsPop = flag;
	//   21   39:aload_0         
	//   22   40:iload           8
	//   23   42:putfield        #48  <Field boolean val$inIsPop>
		val$sharedElementsOut = arraylist1;
	//   24   45:aload_0         
	//   25   46:aload           9
	//   26   48:putfield        #50  <Field ArrayList val$sharedElementsOut>
		val$enterTransition = obj1;
	//   27   51:aload_0         
	//   28   52:aload           10
	//   29   54:putfield        #52  <Field Object val$enterTransition>
		val$inEpicenter = rect;
	//   30   57:aload_0         
	//   31   58:aload           11
	//   32   60:putfield        #54  <Field Rect val$inEpicenter>
		super();
	//   33   63:aload_0         
	//   34   64:invokespecial   #57  <Method void Object()>
	//   35   67:return          
	}
}
