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
//			AutoTransition, Transition, Scene

public class TransitionManager
{
	static class c
		implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener
	{

		private void b()
		{
			c.getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewGroup c>
		//    2    4:invokevirtual   #33  <Method ViewTreeObserver ViewGroup.getViewTreeObserver()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #39  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			c.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field ViewGroup c>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #43  <Method void ViewGroup.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		//    9   19:return          
		}

		public boolean onPreDraw()
		{
			b();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void b()>
			TransitionManager.sPendingTransitions.remove(((Object) (c)));
		//    2    4:invokestatic    #51  <Method ArrayList TransitionManager.access$000()>
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field ViewGroup c>
		//    5   11:invokevirtual   #57  <Method boolean ArrayList.remove(Object)>
		//    6   14:pop             
			ArrayMap arraymap = TransitionManager.getRunningTransitions();
		//    7   15:invokestatic    #61  <Method ArrayMap TransitionManager.getRunningTransitions()>
		//    8   18:astore          4
			ArrayList arraylist2 = (ArrayList)arraymap.get(((Object) (c)));
		//    9   20:aload           4
		//   10   22:aload_0         
		//   11   23:getfield        #25  <Field ViewGroup c>
		//   12   26:invokevirtual   #67  <Method Object ArrayMap.get(Object)>
		//   13   29:checkcast       #53  <Class ArrayList>
		//   14   32:astore_3        
			ArrayList arraylist1 = null;
		//   15   33:aconst_null     
		//   16   34:astore_2        
			ArrayList arraylist;
			if(arraylist2 == null)
		//*  17   35:aload_3         
		//*  18   36:ifnonnull       61
			{
				arraylist = new ArrayList();
		//   19   39:new             #53  <Class ArrayList>
		//   20   42:dup             
		//   21   43:invokespecial   #68  <Method void ArrayList()>
		//   22   46:astore_1        
				arraymap.put(((Object) (c)), ((Object) (arraylist)));
		//   23   47:aload           4
		//   24   49:aload_0         
		//   25   50:getfield        #25  <Field ViewGroup c>
		//   26   53:aload_1         
		//   27   54:invokevirtual   #72  <Method Object ArrayMap.put(Object, Object)>
		//   28   57:pop             
			} else
		//*  29   58:goto            81
			{
				arraylist = arraylist2;
		//   30   61:aload_3         
		//   31   62:astore_1        
				if(arraylist2.size() > 0)
		//*  32   63:aload_3         
		//*  33   64:invokevirtual   #76  <Method int ArrayList.size()>
		//*  34   67:ifle            81
				{
					arraylist1 = new ArrayList(((java.util.Collection) (arraylist2)));
		//   35   70:new             #53  <Class ArrayList>
		//   36   73:dup             
		//   37   74:aload_3         
		//   38   75:invokespecial   #79  <Method void ArrayList(java.util.Collection)>
		//   39   78:astore_2        
					arraylist = arraylist2;
		//   40   79:aload_3         
		//   41   80:astore_1        
				}
			}
			arraylist.add(((Object) (e)));
		//   42   81:aload_1         
		//   43   82:aload_0         
		//   44   83:getfield        #23  <Field Transition e>
		//   45   86:invokevirtual   #82  <Method boolean ArrayList.add(Object)>
		//   46   89:pop             
			e.addListener(((Transition.TransitionListener) (new Transition.TransitionListenerAdapter(this, arraymap) {

				public void onTransitionEnd(Transition transition)
				{
					((ArrayList)a.get(((Object) (e.c)))).remove(((Object) (transition)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field ArrayMap a>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field TransitionManager$c e>
				//    4    8:getfield        #32  <Field ViewGroup TransitionManager$c.c>
				//    5   11:invokevirtual   #38  <Method Object ArrayMap.get(Object)>
				//    6   14:checkcast       #40  <Class ArrayList>
				//    7   17:aload_1         
				//    8   18:invokevirtual   #44  <Method boolean ArrayList.remove(Object)>
				//    9   21:pop             
				//   10   22:return          
				}

				final ArrayMap a;
				final c e;

			
			{
				e = c1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TransitionManager$c e>
				a = arraymap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ArrayMap a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Transition$TransitionListenerAdapter()>
			//    8   14:return          
			}
			}
)));
		//   47   90:aload_0         
		//   48   91:getfield        #23  <Field Transition e>
		//   49   94:new             #13  <Class TransitionManager$c$4>
		//   50   97:dup             
		//   51   98:aload_0         
		//   52   99:aload           4
		//   53  101:invokespecial   #85  <Method void TransitionManager$c$4(TransitionManager$c, ArrayMap)>
		//   54  104:invokevirtual   #91  <Method Transition Transition.addListener(Transition$TransitionListener)>
		//   55  107:pop             
			e.captureValues(c, false);
		//   56  108:aload_0         
		//   57  109:getfield        #23  <Field Transition e>
		//   58  112:aload_0         
		//   59  113:getfield        #25  <Field ViewGroup c>
		//   60  116:iconst_0        
		//   61  117:invokevirtual   #95  <Method void Transition.captureValues(ViewGroup, boolean)>
			if(arraylist1 != null)
		//*  62  120:aload_2         
		//*  63  121:ifnull          157
			{
				for(Iterator iterator = arraylist1.iterator(); iterator.hasNext(); ((Transition)iterator.next()).resume(((View) (c))));
		//   64  124:aload_2         
		//   65  125:invokevirtual   #99  <Method Iterator ArrayList.iterator()>
		//   66  128:astore_1        
		//   67  129:aload_1         
		//   68  130:invokeinterface #104 <Method boolean Iterator.hasNext()>
		//   69  135:ifeq            157
		//   70  138:aload_1         
		//   71  139:invokeinterface #108 <Method Object Iterator.next()>
		//   72  144:checkcast       #87  <Class Transition>
		//   73  147:aload_0         
		//   74  148:getfield        #25  <Field ViewGroup c>
		//   75  151:invokevirtual   #112 <Method void Transition.resume(View)>
			}
		//*  76  154:goto            129
			e.playTransition(c);
		//   77  157:aload_0         
		//   78  158:getfield        #23  <Field Transition e>
		//   79  161:aload_0         
		//   80  162:getfield        #25  <Field ViewGroup c>
		//   81  165:invokevirtual   #116 <Method void Transition.playTransition(ViewGroup)>
			return true;
		//   82  168:iconst_1        
		//   83  169:ireturn         
		}

		public void onViewAttachedToWindow(View view)
		{
		//    0    0:return          
		}

		public void onViewDetachedFromWindow(View view)
		{
			b();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void b()>
			TransitionManager.sPendingTransitions.remove(((Object) (c)));
		//    2    4:invokestatic    #51  <Method ArrayList TransitionManager.access$000()>
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field ViewGroup c>
		//    5   11:invokevirtual   #57  <Method boolean ArrayList.remove(Object)>
		//    6   14:pop             
			view = ((View) ((ArrayList)TransitionManager.getRunningTransitions().get(((Object) (c)))));
		//    7   15:invokestatic    #61  <Method ArrayMap TransitionManager.getRunningTransitions()>
		//    8   18:aload_0         
		//    9   19:getfield        #25  <Field ViewGroup c>
		//   10   22:invokevirtual   #67  <Method Object ArrayMap.get(Object)>
		//   11   25:checkcast       #53  <Class ArrayList>
		//   12   28:astore_1        
			if(view != null && ((ArrayList) (view)).size() > 0)
		//*  13   29:aload_1         
		//*  14   30:ifnull          73
		//*  15   33:aload_1         
		//*  16   34:invokevirtual   #76  <Method int ArrayList.size()>
		//*  17   37:ifle            73
				for(view = ((View) (((ArrayList) (view)).iterator())); ((Iterator) (view)).hasNext(); ((Transition)((Iterator) (view)).next()).resume(((View) (c))));
		//   18   40:aload_1         
		//   19   41:invokevirtual   #99  <Method Iterator ArrayList.iterator()>
		//   20   44:astore_1        
		//   21   45:aload_1         
		//   22   46:invokeinterface #104 <Method boolean Iterator.hasNext()>
		//   23   51:ifeq            73
		//   24   54:aload_1         
		//   25   55:invokeinterface #108 <Method Object Iterator.next()>
		//   26   60:checkcast       #87  <Class Transition>
		//   27   63:aload_0         
		//   28   64:getfield        #25  <Field ViewGroup c>
		//   29   67:invokevirtual   #112 <Method void Transition.resume(View)>
		//*  30   70:goto            45
			e.clearValues(true);
		//   31   73:aload_0         
		//   32   74:getfield        #23  <Field Transition e>
		//   33   77:iconst_1        
		//   34   78:invokevirtual   #122 <Method void Transition.clearValues(boolean)>
		//   35   81:return          
		}

		ViewGroup c;
		Transition e;

		c(Transition transition, ViewGroup viewgroup)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			e = transition;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Transition e>
			c = viewgroup;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field ViewGroup c>
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
		ViewGroup viewgroup = scene.getSceneRoot();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method ViewGroup Scene.getSceneRoot()>
	//    2    4:astore_3        
		Transition transition1 = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(transition != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
		{
			transition1 = transition.clone();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method Transition Transition.clone()>
	//    9   15:astore_2        
			transition1.setSceneRoot(viewgroup);
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #105 <Method Transition Transition.setSceneRoot(ViewGroup)>
	//   13   21:pop             
		}
		transition = ((Transition) (Scene.getCurrentScene(((View) (viewgroup)))));
	//   14   22:aload_3         
	//   15   23:invokestatic    #109 <Method Scene Scene.getCurrentScene(View)>
	//   16   26:astore_1        
		if(transition != null && ((Scene) (transition)).isCreatedFromLayoutResource())
	//*  17   27:aload_1         
	//*  18   28:ifnull          43
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #113 <Method boolean Scene.isCreatedFromLayoutResource()>
	//*  21   35:ifeq            43
			transition1.setCanRemoveViews(true);
	//   22   38:aload_2         
	//   23   39:iconst_1        
	//   24   40:invokevirtual   #117 <Method void Transition.setCanRemoveViews(boolean)>
		sceneChangeSetup(viewgroup, transition1);
	//   25   43:aload_3         
	//   26   44:aload_2         
	//   27   45:invokestatic    #86  <Method void sceneChangeSetup(ViewGroup, Transition)>
		scene.enter();
	//   28   48:aload_0         
	//   29   49:invokevirtual   #120 <Method void Scene.enter()>
		sceneChangeRunTransition(viewgroup, transition1);
	//   30   52:aload_3         
	//   31   53:aload_2         
	//   32   54:invokestatic    #95  <Method void sceneChangeRunTransition(ViewGroup, Transition)>
	//   33   57:return          
	}

	static ArrayMap getRunningTransitions()
	{
		WeakReference weakreference;
label0:
		{
			WeakReference weakreference1 = (WeakReference)sRunningTransitions.get();
	//    0    0:getstatic       #40  <Field ThreadLocal sRunningTransitions>
	//    1    3:invokevirtual   #126 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #128 <Class WeakReference>
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
	//    9   17:invokevirtual   #129 <Method Object WeakReference.get()>
	//   10   20:ifnonnull       45
			}
			weakreference = new WeakReference(((Object) (new ArrayMap())));
	//   11   23:new             #128 <Class WeakReference>
	//   12   26:dup             
	//   13   27:new             #49  <Class ArrayMap>
	//   14   30:dup             
	//   15   31:invokespecial   #50  <Method void ArrayMap()>
	//   16   34:invokespecial   #132 <Method void WeakReference(Object)>
	//   17   37:astore_0        
			sRunningTransitions.set(((Object) (weakreference)));
	//   18   38:getstatic       #40  <Field ThreadLocal sRunningTransitions>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #135 <Method void ThreadLocal.set(Object)>
		}
		return (ArrayMap)weakreference.get();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #129 <Method Object WeakReference.get()>
	//   23   49:checkcast       #49  <Class ArrayMap>
	//   24   52:areturn         
	}

	private Transition getTransition(Scene scene)
	{
		Object obj = ((Object) (scene.getSceneRoot()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method ViewGroup Scene.getSceneRoot()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          49
		{
			obj = ((Object) (Scene.getCurrentScene(((View) (obj)))));
	//    5    9:aload_2         
	//    6   10:invokestatic    #109 <Method Scene Scene.getCurrentScene(View)>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          49
			{
				ArrayMap arraymap = (ArrayMap)mScenePairTransitions.get(((Object) (scene)));
	//   10   18:aload_0         
	//   11   19:getfield        #54  <Field ArrayMap mScenePairTransitions>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #142 <Method Object ArrayMap.get(Object)>
	//   14   26:checkcast       #49  <Class ArrayMap>
	//   15   29:astore_3        
				if(arraymap != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          49
				{
					obj = ((Object) ((Transition)arraymap.get(obj)));
	//   18   34:aload_3         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #142 <Method Object ArrayMap.get(Object)>
	//   21   39:checkcast       #79  <Class Transition>
	//   22   42:astore_2        
					if(obj != null)
	//*  23   43:aload_2         
	//*  24   44:ifnull          49
						return ((Transition) (obj));
	//   25   47:aload_2         
	//   26   48:areturn         
				}
			}
		}
		scene = ((Scene) ((Transition)mSceneTransitions.get(((Object) (scene)))));
	//   27   49:aload_0         
	//   28   50:getfield        #52  <Field ArrayMap mSceneTransitions>
	//   29   53:aload_1         
	//   30   54:invokevirtual   #142 <Method Object ArrayMap.get(Object)>
	//   31   57:checkcast       #79  <Class Transition>
	//   32   60:astore_1        
		if(scene != null)
	//*  33   61:aload_1         
	//*  34   62:ifnull          67
			return ((Transition) (scene));
	//   35   65:aload_1         
	//   36   66:areturn         
		else
			return sDefaultTransition;
	//   37   67:getstatic       #35  <Field Transition sDefaultTransition>
	//   38   70:areturn         
	}

	public static void go(Scene scene)
	{
		changeScene(scene, sDefaultTransition);
	//    0    0:aload_0         
	//    1    1:getstatic       #35  <Field Transition sDefaultTransition>
	//    2    4:invokestatic    #146 <Method void changeScene(Scene, Transition)>
	//    3    7:return          
	}

	public static void go(Scene scene, Transition transition)
	{
		changeScene(scene, transition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #146 <Method void changeScene(Scene, Transition)>
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
			transition = ((Transition) (new c(transition, viewgroup)));
	//    4    8:new             #6   <Class TransitionManager$c>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokespecial   #149 <Method void TransitionManager$c(Transition, ViewGroup)>
	//    9   17:astore_1        
			viewgroup.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (transition)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #155 <Method void ViewGroup.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			viewgroup.getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (transition)));
	//   13   23:aload_0         
	//   14   24:invokevirtual   #159 <Method ViewTreeObserver ViewGroup.getViewTreeObserver()>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #165 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
	//   17   31:return          
	}

	private static void sceneChangeSetup(ViewGroup viewgroup, Transition transition)
	{
		Object obj = ((Object) ((ArrayList)getRunningTransitions().get(((Object) (viewgroup)))));
	//    0    0:invokestatic    #167 <Method ArrayMap getRunningTransitions()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #142 <Method Object ArrayMap.get(Object)>
	//    3    7:checkcast       #42  <Class ArrayList>
	//    4   10:astore_2        
		if(obj != null && ((ArrayList) (obj)).size() > 0)
	//*   5   11:aload_2         
	//*   6   12:ifnull          52
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #171 <Method int ArrayList.size()>
	//*   9   19:ifle            52
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Transition)((Iterator) (obj)).next()).pause(((View) (viewgroup))));
	//   10   22:aload_2         
	//   11   23:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//   12   26:astore_2        
	//   13   27:aload_2         
	//   14   28:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            52
	//   16   36:aload_2         
	//   17   37:invokeinterface #183 <Method Object Iterator.next()>
	//   18   42:checkcast       #79  <Class Transition>
	//   19   45:aload_0         
	//   20   46:invokevirtual   #187 <Method void Transition.pause(View)>
	//*  21   49:goto            27
		if(transition != null)
	//*  22   52:aload_1         
	//*  23   53:ifnull          62
			transition.captureValues(viewgroup, true);
	//   24   56:aload_1         
	//   25   57:aload_0         
	//   26   58:iconst_1        
	//   27   59:invokevirtual   #191 <Method void Transition.captureValues(ViewGroup, boolean)>
		viewgroup = ((ViewGroup) (Scene.getCurrentScene(((View) (viewgroup)))));
	//   28   62:aload_0         
	//   29   63:invokestatic    #109 <Method Scene Scene.getCurrentScene(View)>
	//   30   66:astore_0        
		if(viewgroup != null)
	//*  31   67:aload_0         
	//*  32   68:ifnull          75
			((Scene) (viewgroup)).exit();
	//   33   71:aload_0         
	//   34   72:invokevirtual   #194 <Method void Scene.exit()>
	//   35   75:return          
	}

	public void setTransition(Scene scene, Scene scene1, Transition transition)
	{
		ArrayMap arraymap1 = (ArrayMap)mScenePairTransitions.get(((Object) (scene1)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ArrayMap mScenePairTransitions>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #142 <Method Object ArrayMap.get(Object)>
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
	//   18   38:invokevirtual   #200 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		arraymap.put(((Object) (scene)), ((Object) (transition)));
	//   20   42:aload           4
	//   21   44:aload_1         
	//   22   45:aload_3         
	//   23   46:invokevirtual   #200 <Method Object ArrayMap.put(Object, Object)>
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
	//    4    6:invokevirtual   #200 <Method Object ArrayMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void transitionTo(Scene scene)
	{
		changeScene(scene, getTransition(scene));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #203 <Method Transition getTransition(Scene)>
	//    4    6:invokestatic    #146 <Method void changeScene(Scene, Transition)>
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
