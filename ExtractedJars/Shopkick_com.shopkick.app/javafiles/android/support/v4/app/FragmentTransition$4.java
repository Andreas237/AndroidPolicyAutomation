// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.util.ArrayMap;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransition, FragmentTransitionImpl, Fragment

static final class FragmentTransition$4
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (FragmentTransition.captureInSharedElements(val$impl, val$nameOverrides, val$finalSharedElementTransition, val$fragments)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field FragmentTransitionImpl val$impl>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field ArrayMap val$nameOverrides>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field Object val$finalSharedElementTransition>
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
	//    8   16:invokestatic    #67  <Method ArrayMap FragmentTransition.captureInSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//    9   19:astore_1        
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          48
		{
			val$sharedElementsIn.addAll(((ArrayMap) (obj)).values());
	//   12   24:aload_0         
	//   13   25:getfield        #44  <Field ArrayList val$sharedElementsIn>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #73  <Method java.util.Collection ArrayMap.values()>
	//   16   32:invokevirtual   #79  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   17   35:pop             
			val$sharedElementsIn.add(((Object) (val$nonExistentView)));
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field ArrayList val$sharedElementsIn>
	//   20   40:aload_0         
	//   21   41:getfield        #46  <Field View val$nonExistentView>
	//   22   44:invokevirtual   #83  <Method boolean ArrayList.add(Object)>
	//   23   47:pop             
		}
		FragmentTransition.callSharedElementStartEnd(val$inFragment, val$outFragment, val$inIsPop, ((ArrayMap) (obj)), false);
	//   24   48:aload_0         
	//   25   49:getfield        #48  <Field Fragment val$inFragment>
	//   26   52:aload_0         
	//   27   53:getfield        #50  <Field Fragment val$outFragment>
	//   28   56:aload_0         
	//   29   57:getfield        #52  <Field boolean val$inIsPop>
	//   30   60:aload_1         
	//   31   61:iconst_0        
	//   32   62:invokestatic    #87  <Method void FragmentTransition.callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		Object obj1 = val$finalSharedElementTransition;
	//   33   65:aload_0         
	//   34   66:getfield        #40  <Field Object val$finalSharedElementTransition>
	//   35   69:astore_2        
		if(obj1 != null)
	//*  36   70:aload_2         
	//*  37   71:ifnull          123
		{
			val$impl.swapSharedElementTargets(obj1, val$sharedElementsOut, val$sharedElementsIn);
	//   38   74:aload_0         
	//   39   75:getfield        #36  <Field FragmentTransitionImpl val$impl>
	//   40   78:aload_2         
	//   41   79:aload_0         
	//   42   80:getfield        #54  <Field ArrayList val$sharedElementsOut>
	//   43   83:aload_0         
	//   44   84:getfield        #44  <Field ArrayList val$sharedElementsIn>
	//   45   87:invokevirtual   #93  <Method void FragmentTransitionImpl.swapSharedElementTargets(Object, ArrayList, ArrayList)>
			obj = ((Object) (FragmentTransition.getInEpicenterView(((ArrayMap) (obj)), val$fragments, val$enterTransition, val$inIsPop)));
	//   46   90:aload_1         
	//   47   91:aload_0         
	//   48   92:getfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
	//   49   95:aload_0         
	//   50   96:getfield        #56  <Field Object val$enterTransition>
	//   51   99:aload_0         
	//   52  100:getfield        #52  <Field boolean val$inIsPop>
	//   53  103:invokestatic    #97  <Method View FragmentTransition.getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//   54  106:astore_1        
			if(obj != null)
	//*  55  107:aload_1         
	//*  56  108:ifnull          123
				val$impl.getBoundsOnScreen(((View) (obj)), val$inEpicenter);
	//   57  111:aload_0         
	//   58  112:getfield        #36  <Field FragmentTransitionImpl val$impl>
	//   59  115:aload_1         
	//   60  116:aload_0         
	//   61  117:getfield        #58  <Field Rect val$inEpicenter>
	//   62  120:invokevirtual   #101 <Method void FragmentTransitionImpl.getBoundsOnScreen(View, Rect)>
		}
	//   63  123:return          
	}

	final Object val$enterTransition;
	final Object val$finalSharedElementTransition;
	final agmentContainerTransition val$fragments;
	final FragmentTransitionImpl val$impl;
	final Rect val$inEpicenter;
	final Fragment val$inFragment;
	final boolean val$inIsPop;
	final ArrayMap val$nameOverrides;
	final View val$nonExistentView;
	final Fragment val$outFragment;
	final ArrayList val$sharedElementsIn;
	final ArrayList val$sharedElementsOut;

	FragmentTransition$4(FragmentTransitionImpl fragmenttransitionimpl, ArrayMap arraymap, Object obj, agmentContainerTransition agmentcontainertransition, ArrayList arraylist, View view, Fragment fragment, 
			Fragment fragment1, boolean flag, ArrayList arraylist1, Object obj1, Rect rect)
	{
		val$impl = fragmenttransitionimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field FragmentTransitionImpl val$impl>
		val$nameOverrides = arraymap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #38  <Field ArrayMap val$nameOverrides>
		val$finalSharedElementTransition = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #40  <Field Object val$finalSharedElementTransition>
		val$fragments = agmentcontainertransition;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
		val$sharedElementsIn = arraylist;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #44  <Field ArrayList val$sharedElementsIn>
		val$nonExistentView = view;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #46  <Field View val$nonExistentView>
		val$inFragment = fragment;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #48  <Field Fragment val$inFragment>
		val$outFragment = fragment1;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #50  <Field Fragment val$outFragment>
		val$inIsPop = flag;
	//   24   45:aload_0         
	//   25   46:iload           9
	//   26   48:putfield        #52  <Field boolean val$inIsPop>
		val$sharedElementsOut = arraylist1;
	//   27   51:aload_0         
	//   28   52:aload           10
	//   29   54:putfield        #54  <Field ArrayList val$sharedElementsOut>
		val$enterTransition = obj1;
	//   30   57:aload_0         
	//   31   58:aload           11
	//   32   60:putfield        #56  <Field Object val$enterTransition>
		val$inEpicenter = rect;
	//   33   63:aload_0         
	//   34   64:aload           12
	//   35   66:putfield        #58  <Field Rect val$inEpicenter>
		super();
	//   36   69:aload_0         
	//   37   70:invokespecial   #61  <Method void Object()>
	//   38   73:return          
	}
}
