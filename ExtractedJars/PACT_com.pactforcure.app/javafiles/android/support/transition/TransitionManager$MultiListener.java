// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.util.ArrayMap;
import android.view.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.transition:
//			TransitionManager, Transition, TransitionListenerAdapter

private static class TransitionManager$MultiListener
	implements android.view.er, android.view.
{

	private void removeListeners()
	{
		mSceneRoot.getViewTreeObserver().removeOnPreDrawListener(((android.view.er) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ViewGroup mSceneRoot>
	//    2    4:invokevirtual   #34  <Method ViewTreeObserver ViewGroup.getViewTreeObserver()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #40  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mSceneRoot.removeOnAttachStateChangeListener(((android.view.) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field ViewGroup mSceneRoot>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #44  <Method void ViewGroup.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//    9   19:return          
	}

	public boolean onPreDraw()
	{
		ArrayList arraylist;
		ArrayList arraylist1;
		final ArrayMap runningTransitions;
		removeListeners();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void removeListeners()>
		if(!TransitionManager.access$000().remove(((Object) (mSceneRoot))))
	//*   2    4:invokestatic    #52  <Method ArrayList TransitionManager.access$000()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field ViewGroup mSceneRoot>
	//*   5   11:invokevirtual   #58  <Method boolean ArrayList.remove(Object)>
	//*   6   14:ifne            19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		runningTransitions = TransitionManager.getRunningTransitions();
	//    9   19:invokestatic    #62  <Method ArrayMap TransitionManager.getRunningTransitions()>
	//   10   22:astore          4
		arraylist1 = (ArrayList)runningTransitions.get(((Object) (mSceneRoot)));
	//   11   24:aload           4
	//   12   26:aload_0         
	//   13   27:getfield        #26  <Field ViewGroup mSceneRoot>
	//   14   30:invokevirtual   #68  <Method Object ArrayMap.get(Object)>
	//   15   33:checkcast       #54  <Class ArrayList>
	//   16   36:astore_3        
		arraylist = null;
	//   17   37:aconst_null     
	//   18   38:astore_2        
		if(arraylist1 != null) goto _L2; else goto _L1
	//   19   39:aload_3         
	//   20   40:ifnonnull       138
_L1:
		Object obj;
		obj = ((Object) (new ArrayList()));
	//   21   43:new             #54  <Class ArrayList>
	//   22   46:dup             
	//   23   47:invokespecial   #69  <Method void ArrayList()>
	//   24   50:astore_1        
		runningTransitions.put(((Object) (mSceneRoot)), obj);
	//   25   51:aload           4
	//   26   53:aload_0         
	//   27   54:getfield        #26  <Field ViewGroup mSceneRoot>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
	//   30   61:pop             
_L4:
		((ArrayList) (obj)).add(((Object) (mTransition)));
	//   31   62:aload_1         
	//   32   63:aload_0         
	//   33   64:getfield        #24  <Field Transition mTransition>
	//   34   67:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   35   70:pop             
		mTransition.addListener(((Transition.TransitionListener) (new TransitionListenerAdapter() {

			public void onTransitionEnd(Transition transition)
			{
				((ArrayList)runningTransitions.get(((Object) (mSceneRoot)))).remove(((Object) (transition)));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ArrayMap val$runningTransitions>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field TransitionManager$MultiListener this$0>
			//    4    8:getfield        #33  <Field ViewGroup TransitionManager$MultiListener.mSceneRoot>
			//    5   11:invokevirtual   #39  <Method Object ArrayMap.get(Object)>
			//    6   14:checkcast       #41  <Class ArrayList>
			//    7   17:aload_1         
			//    8   18:invokevirtual   #45  <Method boolean ArrayList.remove(Object)>
			//    9   21:pop             
			//   10   22:return          
			}

			final TransitionManager.MultiListener this$0;
			final ArrayMap val$runningTransitions;

			
			{
				this$0 = TransitionManager.MultiListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TransitionManager$MultiListener this$0>
				runningTransitions = arraymap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ArrayMap val$runningTransitions>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void TransitionListenerAdapter()>
			//    8   14:return          
			}
		}
)));
	//   36   71:aload_0         
	//   37   72:getfield        #24  <Field Transition mTransition>
	//   38   75:new             #13  <Class TransitionManager$MultiListener$1>
	//   39   78:dup             
	//   40   79:aload_0         
	//   41   80:aload           4
	//   42   82:invokespecial   #79  <Method void TransitionManager$MultiListener$1(TransitionManager$MultiListener, ArrayMap)>
	//   43   85:invokevirtual   #85  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   44   88:pop             
		mTransition.captureValues(mSceneRoot, false);
	//   45   89:aload_0         
	//   46   90:getfield        #24  <Field Transition mTransition>
	//   47   93:aload_0         
	//   48   94:getfield        #26  <Field ViewGroup mSceneRoot>
	//   49   97:iconst_0        
	//   50   98:invokevirtual   #89  <Method void Transition.captureValues(ViewGroup, boolean)>
		if(arraylist != null)
	//*  51  101:aload_2         
	//*  52  102:ifnull          161
			for(obj = ((Object) (arraylist.iterator())); ((Iterator) (obj)).hasNext(); ((Transition)((Iterator) (obj)).next()).resume(((View) (mSceneRoot))));
	//   53  105:aload_2         
	//   54  106:invokevirtual   #93  <Method Iterator ArrayList.iterator()>
	//   55  109:astore_1        
	//   56  110:aload_1         
	//   57  111:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   58  116:ifeq            161
	//   59  119:aload_1         
	//   60  120:invokeinterface #102 <Method Object Iterator.next()>
	//   61  125:checkcast       #81  <Class Transition>
	//   62  128:aload_0         
	//   63  129:getfield        #26  <Field ViewGroup mSceneRoot>
	//   64  132:invokevirtual   #106 <Method void Transition.resume(View)>
		break; /* Loop/switch isn't completed */
	//   65  135:goto            110
_L2:
		obj = ((Object) (arraylist1));
	//   66  138:aload_3         
	//   67  139:astore_1        
		if(arraylist1.size() > 0)
	//*  68  140:aload_3         
	//*  69  141:invokevirtual   #110 <Method int ArrayList.size()>
	//*  70  144:ifle            62
		{
			arraylist = new ArrayList(((java.util.Collection) (arraylist1)));
	//   71  147:new             #54  <Class ArrayList>
	//   72  150:dup             
	//   73  151:aload_3         
	//   74  152:invokespecial   #113 <Method void ArrayList(java.util.Collection)>
	//   75  155:astore_2        
			obj = ((Object) (arraylist1));
	//   76  156:aload_3         
	//   77  157:astore_1        
		}
		if(true) goto _L4; else goto _L3
	//   78  158:goto            62
_L3:
		mTransition.playTransition(mSceneRoot);
	//   79  161:aload_0         
	//   80  162:getfield        #24  <Field Transition mTransition>
	//   81  165:aload_0         
	//   82  166:getfield        #26  <Field ViewGroup mSceneRoot>
	//   83  169:invokevirtual   #117 <Method void Transition.playTransition(ViewGroup)>
		return true;
	//   84  172:iconst_1        
	//   85  173:ireturn         
	}

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		removeListeners();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void removeListeners()>
		TransitionManager.access$000().remove(((Object) (mSceneRoot)));
	//    2    4:invokestatic    #52  <Method ArrayList TransitionManager.access$000()>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ViewGroup mSceneRoot>
	//    5   11:invokevirtual   #58  <Method boolean ArrayList.remove(Object)>
	//    6   14:pop             
		view = ((View) ((ArrayList)TransitionManager.getRunningTransitions().get(((Object) (mSceneRoot)))));
	//    7   15:invokestatic    #62  <Method ArrayMap TransitionManager.getRunningTransitions()>
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field ViewGroup mSceneRoot>
	//   10   22:invokevirtual   #68  <Method Object ArrayMap.get(Object)>
	//   11   25:checkcast       #54  <Class ArrayList>
	//   12   28:astore_1        
		if(view != null && ((ArrayList) (view)).size() > 0)
	//*  13   29:aload_1         
	//*  14   30:ifnull          73
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #110 <Method int ArrayList.size()>
	//*  17   37:ifle            73
			for(view = ((View) (((ArrayList) (view)).iterator())); ((Iterator) (view)).hasNext(); ((Transition)((Iterator) (view)).next()).resume(((View) (mSceneRoot))));
	//   18   40:aload_1         
	//   19   41:invokevirtual   #93  <Method Iterator ArrayList.iterator()>
	//   20   44:astore_1        
	//   21   45:aload_1         
	//   22   46:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   23   51:ifeq            73
	//   24   54:aload_1         
	//   25   55:invokeinterface #102 <Method Object Iterator.next()>
	//   26   60:checkcast       #81  <Class Transition>
	//   27   63:aload_0         
	//   28   64:getfield        #26  <Field ViewGroup mSceneRoot>
	//   29   67:invokevirtual   #106 <Method void Transition.resume(View)>
	//*  30   70:goto            45
		mTransition.clearValues(true);
	//   31   73:aload_0         
	//   32   74:getfield        #24  <Field Transition mTransition>
	//   33   77:iconst_1        
	//   34   78:invokevirtual   #123 <Method void Transition.clearValues(boolean)>
	//   35   81:return          
	}

	ViewGroup mSceneRoot;
	Transition mTransition;

	TransitionManager$MultiListener(Transition transition, ViewGroup viewgroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mTransition = transition;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Transition mTransition>
		mSceneRoot = viewgroup;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field ViewGroup mSceneRoot>
	//    8   14:return          
	}
}
