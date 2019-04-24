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
	implements android.view., android.view.er
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
		final ArrayMap runningTransitions = TransitionManager.getRunningTransitions();
	//    9   19:invokestatic    #62  <Method ArrayMap TransitionManager.getRunningTransitions()>
	//   10   22:astore_3        
		ArrayList arraylist = (ArrayList)runningTransitions.get(((Object) (mSceneRoot)));
	//   11   23:aload_3         
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field ViewGroup mSceneRoot>
	//   14   28:invokevirtual   #68  <Method Object ArrayMap.get(Object)>
	//   15   31:checkcast       #54  <Class ArrayList>
	//   16   34:astore_2        
		Object obj;
		if(arraylist == null)
	//*  17   35:aload_2         
	//*  18   36:ifnonnull       134
		{
			arraylist = new ArrayList();
	//   19   39:new             #54  <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #69  <Method void ArrayList()>
	//   22   46:astore_2        
			runningTransitions.put(((Object) (mSceneRoot)), ((Object) (arraylist)));
	//   23   47:aload_3         
	//   24   48:aload_0         
	//   25   49:getfield        #26  <Field ViewGroup mSceneRoot>
	//   26   52:aload_2         
	//   27   53:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
	//   28   56:pop             
			obj = null;
	//   29   57:aconst_null     
	//   30   58:astore_1        
		} else
	//*  31   59:aload_2         
	//*  32   60:aload_0         
	//*  33   61:getfield        #24  <Field Transition mTransition>
	//*  34   64:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//*  35   67:pop             
	//*  36   68:aload_0         
	//*  37   69:getfield        #24  <Field Transition mTransition>
	//*  38   72:new             #13  <Class TransitionManager$MultiListener$1>
	//*  39   75:dup             
	//*  40   76:aload_0         
	//*  41   77:aload_3         
	//*  42   78:invokespecial   #79  <Method void TransitionManager$MultiListener$1(TransitionManager$MultiListener, ArrayMap)>
	//*  43   81:invokevirtual   #85  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//*  44   84:pop             
	//*  45   85:aload_0         
	//*  46   86:getfield        #24  <Field Transition mTransition>
	//*  47   89:aload_0         
	//*  48   90:getfield        #26  <Field ViewGroup mSceneRoot>
	//*  49   93:iconst_0        
	//*  50   94:invokevirtual   #89  <Method void Transition.captureValues(ViewGroup, boolean)>
	//*  51   97:aload_1         
	//*  52   98:ifnull          153
	//*  53  101:aload_1         
	//*  54  102:invokevirtual   #93  <Method Iterator ArrayList.iterator()>
	//*  55  105:astore_1        
	//*  56  106:aload_1         
	//*  57  107:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*  58  112:ifeq            153
	//*  59  115:aload_1         
	//*  60  116:invokeinterface #102 <Method Object Iterator.next()>
	//*  61  121:checkcast       #81  <Class Transition>
	//*  62  124:aload_0         
	//*  63  125:getfield        #26  <Field ViewGroup mSceneRoot>
	//*  64  128:invokevirtual   #106 <Method void Transition.resume(View)>
	//*  65  131:goto            106
		if(arraylist.size() > 0)
	//*  66  134:aload_2         
	//*  67  135:invokevirtual   #110 <Method int ArrayList.size()>
	//*  68  138:ifle            166
			obj = ((Object) (new ArrayList(((java.util.Collection) (arraylist)))));
	//   69  141:new             #54  <Class ArrayList>
	//   70  144:dup             
	//   71  145:aload_2         
	//   72  146:invokespecial   #113 <Method void ArrayList(java.util.Collection)>
	//   73  149:astore_1        
		else
	//*  74  150:goto            59
	//*  75  153:aload_0         
	//*  76  154:getfield        #24  <Field Transition mTransition>
	//*  77  157:aload_0         
	//*  78  158:getfield        #26  <Field ViewGroup mSceneRoot>
	//*  79  161:invokevirtual   #117 <Method void Transition.playTransition(ViewGroup)>
	//*  80  164:iconst_1        
	//*  81  165:ireturn         
			obj = null;
	//   82  166:aconst_null     
	//   83  167:astore_1        
		arraylist.add(((Object) (mTransition)));
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
		mTransition.captureValues(mSceneRoot, false);
		if(obj != null)
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Transition)((Iterator) (obj)).next()).resume(((View) (mSceneRoot))));
		mTransition.playTransition(mSceneRoot);
		return true;
	//*  84  168:goto            59
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
