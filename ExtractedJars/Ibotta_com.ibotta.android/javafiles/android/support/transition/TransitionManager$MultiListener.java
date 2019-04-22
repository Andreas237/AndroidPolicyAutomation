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
		if(!TransitionManager.sPendingTransitions.remove(((Object) (mSceneRoot))))
	//*   2    4:getstatic       #52  <Field ArrayList TransitionManager.sPendingTransitions>
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field ViewGroup mSceneRoot>
	//*   5   11:invokevirtual   #58  <Method boolean ArrayList.remove(Object)>
	//*   6   14:ifne            19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		final ArrayMap runningTransitions = TransitionManager.getRunningTransitions();
	//    9   19:invokestatic    #62  <Method ArrayMap TransitionManager.getRunningTransitions()>
	//   10   22:astore          4
		ArrayList arraylist2 = (ArrayList)runningTransitions.get(((Object) (mSceneRoot)));
	//   11   24:aload           4
	//   12   26:aload_0         
	//   13   27:getfield        #26  <Field ViewGroup mSceneRoot>
	//   14   30:invokevirtual   #68  <Method Object ArrayMap.get(Object)>
	//   15   33:checkcast       #54  <Class ArrayList>
	//   16   36:astore_3        
		ArrayList arraylist1 = null;
	//   17   37:aconst_null     
	//   18   38:astore_2        
		ArrayList arraylist;
		if(arraylist2 == null)
	//*  19   39:aload_3         
	//*  20   40:ifnonnull       65
		{
			arraylist = new ArrayList();
	//   21   43:new             #54  <Class ArrayList>
	//   22   46:dup             
	//   23   47:invokespecial   #69  <Method void ArrayList()>
	//   24   50:astore_1        
			runningTransitions.put(((Object) (mSceneRoot)), ((Object) (arraylist)));
	//   25   51:aload           4
	//   26   53:aload_0         
	//   27   54:getfield        #26  <Field ViewGroup mSceneRoot>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
	//   30   61:pop             
		} else
	//*  31   62:goto            85
		{
			arraylist = arraylist2;
	//   32   65:aload_3         
	//   33   66:astore_1        
			if(arraylist2.size() > 0)
	//*  34   67:aload_3         
	//*  35   68:invokevirtual   #77  <Method int ArrayList.size()>
	//*  36   71:ifle            85
			{
				arraylist1 = new ArrayList(((java.util.Collection) (arraylist2)));
	//   37   74:new             #54  <Class ArrayList>
	//   38   77:dup             
	//   39   78:aload_3         
	//   40   79:invokespecial   #80  <Method void ArrayList(java.util.Collection)>
	//   41   82:astore_2        
				arraylist = arraylist2;
	//   42   83:aload_3         
	//   43   84:astore_1        
			}
		}
		arraylist.add(((Object) (mTransition)));
	//   44   85:aload_1         
	//   45   86:aload_0         
	//   46   87:getfield        #24  <Field Transition mTransition>
	//   47   90:invokevirtual   #83  <Method boolean ArrayList.add(Object)>
	//   48   93:pop             
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
	//   49   94:aload_0         
	//   50   95:getfield        #24  <Field Transition mTransition>
	//   51   98:new             #13  <Class TransitionManager$MultiListener$1>
	//   52  101:dup             
	//   53  102:aload_0         
	//   54  103:aload           4
	//   55  105:invokespecial   #86  <Method void TransitionManager$MultiListener$1(TransitionManager$MultiListener, ArrayMap)>
	//   56  108:invokevirtual   #92  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   57  111:pop             
		mTransition.captureValues(mSceneRoot, false);
	//   58  112:aload_0         
	//   59  113:getfield        #24  <Field Transition mTransition>
	//   60  116:aload_0         
	//   61  117:getfield        #26  <Field ViewGroup mSceneRoot>
	//   62  120:iconst_0        
	//   63  121:invokevirtual   #96  <Method void Transition.captureValues(ViewGroup, boolean)>
		if(arraylist1 != null)
	//*  64  124:aload_2         
	//*  65  125:ifnull          161
		{
			for(Iterator iterator = arraylist1.iterator(); iterator.hasNext(); ((Transition)iterator.next()).resume(((View) (mSceneRoot))));
	//   66  128:aload_2         
	//   67  129:invokevirtual   #100 <Method Iterator ArrayList.iterator()>
	//   68  132:astore_1        
	//   69  133:aload_1         
	//   70  134:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   71  139:ifeq            161
	//   72  142:aload_1         
	//   73  143:invokeinterface #109 <Method Object Iterator.next()>
	//   74  148:checkcast       #88  <Class Transition>
	//   75  151:aload_0         
	//   76  152:getfield        #26  <Field ViewGroup mSceneRoot>
	//   77  155:invokevirtual   #113 <Method void Transition.resume(View)>
		}
	//*  78  158:goto            133
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
		TransitionManager.sPendingTransitions.remove(((Object) (mSceneRoot)));
	//    2    4:getstatic       #52  <Field ArrayList TransitionManager.sPendingTransitions>
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
	//*  16   34:invokevirtual   #77  <Method int ArrayList.size()>
	//*  17   37:ifle            73
			for(view = ((View) (((ArrayList) (view)).iterator())); ((Iterator) (view)).hasNext(); ((Transition)((Iterator) (view)).next()).resume(((View) (mSceneRoot))));
	//   18   40:aload_1         
	//   19   41:invokevirtual   #100 <Method Iterator ArrayList.iterator()>
	//   20   44:astore_1        
	//   21   45:aload_1         
	//   22   46:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   23   51:ifeq            73
	//   24   54:aload_1         
	//   25   55:invokeinterface #109 <Method Object Iterator.next()>
	//   26   60:checkcast       #88  <Class Transition>
	//   27   63:aload_0         
	//   28   64:getfield        #26  <Field ViewGroup mSceneRoot>
	//   29   67:invokevirtual   #113 <Method void Transition.resume(View)>
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
