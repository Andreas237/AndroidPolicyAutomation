// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.util.ArrayMap;
import android.view.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.transition:
//			TransitionManager, Transition

static class TransitionManager$c
	implements android.view.reDrawListener, android.view.angeListener
{

	private void b()
	{
		c.getViewTreeObserver().removeOnPreDrawListener(((android.view.reDrawListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroup c>
	//    2    4:invokevirtual   #33  <Method ViewTreeObserver ViewGroup.getViewTreeObserver()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #39  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		c.removeOnAttachStateChangeListener(((android.view.angeListener) (this)));
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
		TransitionManager.access$000().remove(((Object) (c)));
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
		e.addListener(((nListener) (new Transition.TransitionListenerAdapter(arraymap) {

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
			final TransitionManager.c e;

			
			{
				e = TransitionManager.c.this;
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
		TransitionManager.access$000().remove(((Object) (c)));
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

	TransitionManager$c(Transition transition, ViewGroup viewgroup)
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
