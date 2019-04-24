// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.view.*;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.transition:
//			AutoTransition, Transition, Scene, TransitionListenerAdapter

public class TransitionManager
{
	private static class MultiListener
		implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnPreDrawListener
	{

		private void removeListeners()
		{
			mSceneRoot.getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field ViewGroup mSceneRoot>
		//    2    4:invokevirtual   #34  <Method ViewTreeObserver ViewGroup.getViewTreeObserver()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #40  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			mSceneRoot.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
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
		//*   2    4:invokestatic    #52  <Method ArrayList TransitionManager.access$000()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field ViewGroup mSceneRoot>
		//*   5   11:invokevirtual   #58  <Method boolean ArrayList.remove(Object)>
		//*   6   14:ifne            19
				return true;
		//    7   17:iconst_1        
		//    8   18:ireturn         
			ArrayMap arraymap = TransitionManager.getRunningTransitions();
		//    9   19:invokestatic    #62  <Method ArrayMap TransitionManager.getRunningTransitions()>
		//   10   22:astore_3        
			ArrayList arraylist = (ArrayList)arraymap.get(((Object) (mSceneRoot)));
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
				arraymap.put(((Object) (mSceneRoot)), ((Object) (arraylist)));
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
			mTransition.addListener(((Transition.TransitionListener) (((_cls1) (arraymap)). new TransitionListenerAdapter() {

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

				final MultiListener this$0;
				final ArrayMap val$runningTransitions;

			
			{
				this$0 = final_multilistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TransitionManager$MultiListener this$0>
				runningTransitions = ArrayMap.this;
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
			TransitionManager.sPendingTransitions.remove(((Object) (mSceneRoot)));
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

		MultiListener(Transition transition, ViewGroup viewgroup)
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


	public TransitionManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		mSceneTransitions = new ArrayMap();
	//    2    4:aload_0         
	//    3    5:new             #49  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #50  <Method void ArrayMap()>
	//    6   12:putfield        #52  <Field ArrayMap mSceneTransitions>
		mScenePairTransitions = new ArrayMap();
	//    7   15:aload_0         
	//    8   16:new             #49  <Class ArrayMap>
	//    9   19:dup             
	//   10   20:invokespecial   #50  <Method void ArrayMap()>
	//   11   23:putfield        #54  <Field ArrayMap mScenePairTransitions>
	//   12   26:return          
	}

	public static void beginDelayedTransition(ViewGroup viewgroup)
	{
		beginDelayedTransition(viewgroup, ((Transition) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #62  <Method void beginDelayedTransition(ViewGroup, Transition)>
	//    3    5:return          
	}

	public static void beginDelayedTransition(ViewGroup viewgroup, Transition transition)
	{
		if(!sPendingTransitions.contains(((Object) (viewgroup))) && ViewCompat.isLaidOut(((View) (viewgroup))))
	//*   0    0:getstatic       #45  <Field ArrayList sPendingTransitions>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #68  <Method boolean ArrayList.contains(Object)>
	//*   3    7:ifne            55
	//*   4   10:aload_0         
	//*   5   11:invokestatic    #74  <Method boolean ViewCompat.isLaidOut(View)>
	//*   6   14:ifeq            55
		{
			sPendingTransitions.add(((Object) (viewgroup)));
	//    7   17:getstatic       #45  <Field ArrayList sPendingTransitions>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #77  <Method boolean ArrayList.add(Object)>
	//   10   24:pop             
			Transition transition1 = transition;
	//   11   25:aload_1         
	//   12   26:astore_2        
			if(transition == null)
	//*  13   27:aload_1         
	//*  14   28:ifnonnull       35
				transition1 = sDefaultTransition;
	//   15   31:getstatic       #35  <Field Transition sDefaultTransition>
	//   16   34:astore_2        
			transition = transition1.clone();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #83  <Method Transition Transition.clone()>
	//   19   39:astore_1        
			sceneChangeSetup(viewgroup, transition);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokestatic    #86  <Method void sceneChangeSetup(ViewGroup, Transition)>
			Scene.setCurrentScene(((View) (viewgroup)), ((Scene) (null)));
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:invokestatic    #92  <Method void Scene.setCurrentScene(View, Scene)>
			sceneChangeRunTransition(viewgroup, transition);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokestatic    #95  <Method void sceneChangeRunTransition(ViewGroup, Transition)>
		}
	//   29   55:return          
	}

	private static void changeScene(Scene scene, Transition transition)
	{
		ViewGroup viewgroup;
label0:
		{
			viewgroup = scene.getSceneRoot();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method ViewGroup Scene.getSceneRoot()>
	//    2    4:astore_2        
			if(!sPendingTransitions.contains(((Object) (viewgroup))))
	//*   3    5:getstatic       #45  <Field ArrayList sPendingTransitions>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #68  <Method boolean ArrayList.contains(Object)>
	//*   6   12:ifne            23
			{
				if(transition != null)
					break label0;
	//    7   15:aload_1         
	//    8   16:ifnonnull       24
				scene.enter();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #104 <Method void Scene.enter()>
			}
			return;
	//   11   23:return          
		}
		sPendingTransitions.add(((Object) (viewgroup)));
	//   12   24:getstatic       #45  <Field ArrayList sPendingTransitions>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #77  <Method boolean ArrayList.add(Object)>
	//   15   31:pop             
		transition = transition.clone();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #83  <Method Transition Transition.clone()>
	//   18   36:astore_1        
		transition.setSceneRoot(viewgroup);
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #108 <Method Transition Transition.setSceneRoot(ViewGroup)>
	//   22   42:pop             
		Scene scene1 = Scene.getCurrentScene(((View) (viewgroup)));
	//   23   43:aload_2         
	//   24   44:invokestatic    #112 <Method Scene Scene.getCurrentScene(View)>
	//   25   47:astore_3        
		if(scene1 != null && scene1.isCreatedFromLayoutResource())
	//*  26   48:aload_3         
	//*  27   49:ifnull          64
	//*  28   52:aload_3         
	//*  29   53:invokevirtual   #116 <Method boolean Scene.isCreatedFromLayoutResource()>
	//*  30   56:ifeq            64
			transition.setCanRemoveViews(true);
	//   31   59:aload_1         
	//   32   60:iconst_1        
	//   33   61:invokevirtual   #120 <Method void Transition.setCanRemoveViews(boolean)>
		sceneChangeSetup(viewgroup, transition);
	//   34   64:aload_2         
	//   35   65:aload_1         
	//   36   66:invokestatic    #86  <Method void sceneChangeSetup(ViewGroup, Transition)>
		scene.enter();
	//   37   69:aload_0         
	//   38   70:invokevirtual   #104 <Method void Scene.enter()>
		sceneChangeRunTransition(viewgroup, transition);
	//   39   73:aload_2         
	//   40   74:aload_1         
	//   41   75:invokestatic    #95  <Method void sceneChangeRunTransition(ViewGroup, Transition)>
	//   42   78:return          
	}

	public static void endTransitions(ViewGroup viewgroup)
	{
		sPendingTransitions.remove(((Object) (viewgroup)));
	//    0    0:getstatic       #45  <Field ArrayList sPendingTransitions>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #124 <Method boolean ArrayList.remove(Object)>
	//    3    7:pop             
		ArrayList arraylist = (ArrayList)getRunningTransitions().get(((Object) (viewgroup)));
	//    4    8:invokestatic    #128 <Method ArrayMap getRunningTransitions()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #132 <Method Object ArrayMap.get(Object)>
	//    7   15:checkcast       #42  <Class ArrayList>
	//    8   18:astore_2        
		if(arraylist != null && !arraylist.isEmpty())
	//*   9   19:aload_2         
	//*  10   20:ifnull          69
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #135 <Method boolean ArrayList.isEmpty()>
	//*  13   27:ifne            69
		{
			arraylist = new ArrayList(((java.util.Collection) (arraylist)));
	//   14   30:new             #42  <Class ArrayList>
	//   15   33:dup             
	//   16   34:aload_2         
	//   17   35:invokespecial   #138 <Method void ArrayList(java.util.Collection)>
	//   18   38:astore_2        
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*  19   39:aload_2         
	//*  20   40:invokevirtual   #142 <Method int ArrayList.size()>
	//*  21   43:iconst_1        
	//*  22   44:isub            
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:iflt            69
				((Transition)arraylist.get(i)).forceToEnd(viewgroup);
	//   26   50:aload_2         
	//   27   51:iload_1         
	//   28   52:invokevirtual   #145 <Method Object ArrayList.get(int)>
	//   29   55:checkcast       #79  <Class Transition>
	//   30   58:aload_0         
	//   31   59:invokevirtual   #148 <Method void Transition.forceToEnd(ViewGroup)>

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:isub            
	//   35   65:istore_1        
		}
	//*  36   66:goto            46
	//   37   69:return          
	}

	static ArrayMap getRunningTransitions()
	{
		WeakReference weakreference;
label0:
		{
			WeakReference weakreference1 = (WeakReference)sRunningTransitions.get();
	//    0    0:getstatic       #40  <Field ThreadLocal sRunningTransitions>
	//    1    3:invokevirtual   #151 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #153 <Class WeakReference>
	//    3    9:astore_1        
			if(weakreference1 != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          23
			{
				weakreference = weakreference1;
	//    6   14:aload_1         
	//    7   15:astore_0        
				if(weakreference1.get() != null)
					break label0;
	//    8   16:aload_1         
	//    9   17:invokevirtual   #154 <Method Object WeakReference.get()>
	//   10   20:ifnonnull       45
			}
			weakreference = new WeakReference(((Object) (new ArrayMap())));
	//   11   23:new             #153 <Class WeakReference>
	//   12   26:dup             
	//   13   27:new             #49  <Class ArrayMap>
	//   14   30:dup             
	//   15   31:invokespecial   #50  <Method void ArrayMap()>
	//   16   34:invokespecial   #157 <Method void WeakReference(Object)>
	//   17   37:astore_0        
			sRunningTransitions.set(((Object) (weakreference)));
	//   18   38:getstatic       #40  <Field ThreadLocal sRunningTransitions>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #160 <Method void ThreadLocal.set(Object)>
		}
		return (ArrayMap)weakreference.get();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #154 <Method Object WeakReference.get()>
	//   23   49:checkcast       #49  <Class ArrayMap>
	//   24   52:areturn         
	}

	private Transition getTransition(Scene scene)
	{
		Object obj = ((Object) (scene.getSceneRoot()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method ViewGroup Scene.getSceneRoot()>
	//    2    4:astore_2        
		if(obj == null) goto _L2; else goto _L1
	//    3    5:aload_2         
	//    4    6:ifnull          51
_L1:
		obj = ((Object) (Scene.getCurrentScene(((View) (obj)))));
	//    5    9:aload_2         
	//    6   10:invokestatic    #112 <Method Scene Scene.getCurrentScene(View)>
	//    7   13:astore_2        
		if(obj == null) goto _L2; else goto _L3
	//    8   14:aload_2         
	//    9   15:ifnull          51
_L3:
		ArrayMap arraymap = (ArrayMap)mScenePairTransitions.get(((Object) (scene)));
	//   10   18:aload_0         
	//   11   19:getfield        #54  <Field ArrayMap mScenePairTransitions>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #132 <Method Object ArrayMap.get(Object)>
	//   14   26:checkcast       #49  <Class ArrayMap>
	//   15   29:astore_3        
		if(arraymap == null) goto _L2; else goto _L4
	//   16   30:aload_3         
	//   17   31:ifnull          51
_L4:
		obj = ((Object) ((Transition)arraymap.get(obj)));
	//   18   34:aload_3         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #132 <Method Object ArrayMap.get(Object)>
	//   21   39:checkcast       #79  <Class Transition>
	//   22   42:astore_2        
		if(obj == null) goto _L2; else goto _L5
	//   23   43:aload_2         
	//   24   44:ifnull          51
_L5:
		scene = ((Scene) (obj));
	//   25   47:aload_2         
	//   26   48:astore_1        
_L7:
		return ((Transition) (scene));
	//   27   49:aload_1         
	//   28   50:areturn         
_L2:
		Transition transition = (Transition)mSceneTransitions.get(((Object) (scene)));
	//   29   51:aload_0         
	//   30   52:getfield        #52  <Field ArrayMap mSceneTransitions>
	//   31   55:aload_1         
	//   32   56:invokevirtual   #132 <Method Object ArrayMap.get(Object)>
	//   33   59:checkcast       #79  <Class Transition>
	//   34   62:astore_2        
		scene = ((Scene) (transition));
	//   35   63:aload_2         
	//   36   64:astore_1        
		if(transition == null)
	//*  37   65:aload_2         
	//*  38   66:ifnonnull       49
			return sDefaultTransition;
	//   39   69:getstatic       #35  <Field Transition sDefaultTransition>
	//   40   72:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public static void go(Scene scene)
	{
		changeScene(scene, sDefaultTransition);
	//    0    0:aload_0         
	//    1    1:getstatic       #35  <Field Transition sDefaultTransition>
	//    2    4:invokestatic    #168 <Method void changeScene(Scene, Transition)>
	//    3    7:return          
	}

	public static void go(Scene scene, Transition transition)
	{
		changeScene(scene, transition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #168 <Method void changeScene(Scene, Transition)>
	//    3    5:return          
	}

	private static void sceneChangeRunTransition(ViewGroup viewgroup, Transition transition)
	{
		if(transition != null && viewgroup != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
	//*   2    4:aload_0         
	//*   3    5:ifnull          31
		{
			transition = ((Transition) (new MultiListener(transition, viewgroup)));
	//    4    8:new             #6   <Class TransitionManager$MultiListener>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokespecial   #171 <Method void TransitionManager$MultiListener(Transition, ViewGroup)>
	//    9   17:astore_1        
			viewgroup.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (transition)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #177 <Method void ViewGroup.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			viewgroup.getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (transition)));
	//   13   23:aload_0         
	//   14   24:invokevirtual   #181 <Method ViewTreeObserver ViewGroup.getViewTreeObserver()>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #187 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
	//   17   31:return          
	}

	private static void sceneChangeSetup(ViewGroup viewgroup, Transition transition)
	{
		Object obj = ((Object) ((ArrayList)getRunningTransitions().get(((Object) (viewgroup)))));
	//    0    0:invokestatic    #128 <Method ArrayMap getRunningTransitions()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #132 <Method Object ArrayMap.get(Object)>
	//    3    7:checkcast       #42  <Class ArrayList>
	//    4   10:astore_2        
		if(obj != null && ((ArrayList) (obj)).size() > 0)
	//*   5   11:aload_2         
	//*   6   12:ifnull          52
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #142 <Method int ArrayList.size()>
	//*   9   19:ifle            52
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Transition)((Iterator) (obj)).next()).pause(((View) (viewgroup))));
	//   10   22:aload_2         
	//   11   23:invokevirtual   #191 <Method Iterator ArrayList.iterator()>
	//   12   26:astore_2        
	//   13   27:aload_2         
	//   14   28:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            52
	//   16   36:aload_2         
	//   17   37:invokeinterface #199 <Method Object Iterator.next()>
	//   18   42:checkcast       #79  <Class Transition>
	//   19   45:aload_0         
	//   20   46:invokevirtual   #203 <Method void Transition.pause(View)>
	//*  21   49:goto            27
		if(transition != null)
	//*  22   52:aload_1         
	//*  23   53:ifnull          62
			transition.captureValues(viewgroup, true);
	//   24   56:aload_1         
	//   25   57:aload_0         
	//   26   58:iconst_1        
	//   27   59:invokevirtual   #207 <Method void Transition.captureValues(ViewGroup, boolean)>
		viewgroup = ((ViewGroup) (Scene.getCurrentScene(((View) (viewgroup)))));
	//   28   62:aload_0         
	//   29   63:invokestatic    #112 <Method Scene Scene.getCurrentScene(View)>
	//   30   66:astore_0        
		if(viewgroup != null)
	//*  31   67:aload_0         
	//*  32   68:ifnull          75
			((Scene) (viewgroup)).exit();
	//   33   71:aload_0         
	//   34   72:invokevirtual   #210 <Method void Scene.exit()>
	//   35   75:return          
	}

	public void setTransition(Scene scene, Scene scene1, Transition transition)
	{
		ArrayMap arraymap1 = (ArrayMap)mScenePairTransitions.get(((Object) (scene1)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ArrayMap mScenePairTransitions>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #132 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #49  <Class ArrayMap>
	//    5   11:astore          5
		ArrayMap arraymap = arraymap1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(arraymap1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			arraymap = new ArrayMap();
	//   10   22:new             #49  <Class ArrayMap>
	//   11   25:dup             
	//   12   26:invokespecial   #50  <Method void ArrayMap()>
	//   13   29:astore          4
			mScenePairTransitions.put(((Object) (scene1)), ((Object) (arraymap)));
	//   14   31:aload_0         
	//   15   32:getfield        #54  <Field ArrayMap mScenePairTransitions>
	//   16   35:aload_2         
	//   17   36:aload           4
	//   18   38:invokevirtual   #216 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		arraymap.put(((Object) (scene)), ((Object) (transition)));
	//   20   42:aload           4
	//   21   44:aload_1         
	//   22   45:aload_3         
	//   23   46:invokevirtual   #216 <Method Object ArrayMap.put(Object, Object)>
	//   24   49:pop             
	//   25   50:return          
	}

	public void setTransition(Scene scene, Transition transition)
	{
		mSceneTransitions.put(((Object) (scene)), ((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ArrayMap mSceneTransitions>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #216 <Method Object ArrayMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void transitionTo(Scene scene)
	{
		changeScene(scene, getTransition(scene));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #219 <Method Transition getTransition(Scene)>
	//    4    6:invokestatic    #168 <Method void changeScene(Scene, Transition)>
	//    5    9:return          
	}

	private static final String LOG_TAG = "TransitionManager";
	private static Transition sDefaultTransition = new AutoTransition();
	private static ArrayList sPendingTransitions = new ArrayList();
	private static ThreadLocal sRunningTransitions = new ThreadLocal();
	private ArrayMap mScenePairTransitions;
	private ArrayMap mSceneTransitions;

	static 
	{
	//    0    0:new             #30  <Class AutoTransition>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void AutoTransition()>
	//    3    7:putstatic       #35  <Field Transition sDefaultTransition>
	//    4   10:new             #37  <Class ThreadLocal>
	//    5   13:dup             
	//    6   14:invokespecial   #38  <Method void ThreadLocal()>
	//    7   17:putstatic       #40  <Field ThreadLocal sRunningTransitions>
	//    8   20:new             #42  <Class ArrayList>
	//    9   23:dup             
	//   10   24:invokespecial   #43  <Method void ArrayList()>
	//   11   27:putstatic       #45  <Field ArrayList sPendingTransitions>
	//*  12   30:return          
	}


/*
	static ArrayList access$000()
	{
		return sPendingTransitions;
	//    0    0:getstatic       #45  <Field ArrayList sPendingTransitions>
	//    1    3:areturn         
	}

*/
}
