// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.*;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionImpl

class FragmentTransitionCompat21 extends FragmentTransitionImpl
{

	FragmentTransitionCompat21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void FragmentTransitionImpl()>
	//    2    4:return          
	}

	private static boolean hasSimpleTarget(Transition transition)
	{
		return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method List Transition.getTargetIds()>
	//    2    4:invokestatic    #32  <Method boolean isNullOrEmpty(List)>
	//    3    7:ifeq            35
	//    4   10:aload_0         
	//    5   11:invokevirtual   #35  <Method List Transition.getTargetNames()>
	//    6   14:invokestatic    #32  <Method boolean isNullOrEmpty(List)>
	//    7   17:ifeq            35
	//    8   20:aload_0         
	//    9   21:invokevirtual   #38  <Method List Transition.getTargetTypes()>
	//   10   24:invokestatic    #32  <Method boolean isNullOrEmpty(List)>
	//   11   27:ifne            33
	//   12   30:goto            35
	//   13   33:iconst_0        
	//   14   34:ireturn         
	//   15   35:iconst_1        
	//   16   36:ireturn         
	}

	public void addTarget(Object obj, View view)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			((Transition)obj).addTarget(view);
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class Transition>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #43  <Method Transition Transition.addTarget(View)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void addTargets(Object obj, ArrayList arraylist)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class Transition>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		boolean flag = obj instanceof TransitionSet;
	//    6   10:aload_1         
	//    7   11:instanceof      #47  <Class TransitionSet>
	//    8   14:istore          6
		int k = 0;
	//    9   16:iconst_0        
	//   10   17:istore          4
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		if(flag)
	//*  13   21:iload           6
	//*  14   23:ifeq            60
		{
			obj = ((Object) ((TransitionSet)obj));
	//   15   26:aload_1         
	//   16   27:checkcast       #47  <Class TransitionSet>
	//   17   30:astore_1        
			for(k = ((TransitionSet) (obj)).getTransitionCount(); i < k; i++)
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #51  <Method int TransitionSet.getTransitionCount()>
	//*  20   35:istore          4
	//*  21   37:iload_3         
	//*  22   38:iload           4
	//*  23   40:icmpge          112
				addTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist);
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:iload_3         
	//   27   46:invokevirtual   #55  <Method Transition TransitionSet.getTransitionAt(int)>
	//   28   49:aload_2         
	//   29   50:invokevirtual   #57  <Method void addTargets(Object, ArrayList)>

	//   30   53:iload_3         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:istore_3        
		} else
	//*  34   57:goto            37
		if(!hasSimpleTarget(((Transition) (obj))) && isNullOrEmpty(((Transition) (obj)).getTargets()))
	//*  35   60:aload_1         
	//*  36   61:invokestatic    #59  <Method boolean hasSimpleTarget(Transition)>
	//*  37   64:ifne            112
	//*  38   67:aload_1         
	//*  39   68:invokevirtual   #62  <Method List Transition.getTargets()>
	//*  40   71:invokestatic    #32  <Method boolean isNullOrEmpty(List)>
	//*  41   74:ifeq            112
		{
			int l = arraylist.size();
	//   42   77:aload_2         
	//   43   78:invokevirtual   #67  <Method int ArrayList.size()>
	//   44   81:istore          5
			for(int j = k; j < l; j++)
	//*  45   83:iload           4
	//*  46   85:istore_3        
	//*  47   86:iload_3         
	//*  48   87:iload           5
	//*  49   89:icmpge          112
				((Transition) (obj)).addTarget((View)arraylist.get(j));
	//   50   92:aload_1         
	//   51   93:aload_2         
	//   52   94:iload_3         
	//   53   95:invokevirtual   #71  <Method Object ArrayList.get(int)>
	//   54   98:checkcast       #73  <Class View>
	//   55  101:invokevirtual   #43  <Method Transition Transition.addTarget(View)>
	//   56  104:pop             

	//   57  105:iload_3         
	//   58  106:iconst_1        
	//   59  107:iadd            
	//   60  108:istore_3        
		}
	//*  61  109:goto            86
	//   62  112:return          
	}

	public void beginDelayedTransition(ViewGroup viewgroup, Object obj)
	{
		TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #24  <Class Transition>
	//    3    5:invokestatic    #82  <Method void TransitionManager.beginDelayedTransition(ViewGroup, Transition)>
	//    4    8:return          
	}

	public boolean canHandle(Object obj)
	{
		return obj instanceof Transition;
	//    0    0:aload_1         
	//    1    1:instanceof      #24  <Class Transition>
	//    2    4:ireturn         
	}

	public Object cloneTransition(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			return ((Object) (((Transition)obj).clone()));
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class Transition>
	//    4    8:invokevirtual   #90  <Method Transition Transition.clone()>
	//    5   11:areturn         
		else
			return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public Object mergeTransitionsInSequence(Object obj, Object obj1, Object obj2)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class Transition>
	//    2    4:astore_1        
		obj1 = ((Object) ((Transition)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #24  <Class Transition>
	//    5    9:astore_2        
		obj2 = ((Object) ((Transition)obj2));
	//    6   10:aload_3         
	//    7   11:checkcast       #24  <Class Transition>
	//    8   14:astore_3        
		if(obj != null && obj1 != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          46
	//*  11   19:aload_2         
	//*  12   20:ifnull          46
			obj = ((Object) ((new TransitionSet()).addTransition(((Transition) (obj))).addTransition(((Transition) (obj1))).setOrdering(1)));
	//   13   23:new             #47  <Class TransitionSet>
	//   14   26:dup             
	//   15   27:invokespecial   #93  <Method void TransitionSet()>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #101 <Method TransitionSet TransitionSet.setOrdering(int)>
	//   22   42:astore_1        
		else
	//*  23   43:goto            64
		if(obj == null)
	//*  24   46:aload_1         
	//*  25   47:ifnull          53
	//*  26   50:goto            64
			if(obj1 != null)
	//*  27   53:aload_2         
	//*  28   54:ifnull          62
				obj = obj1;
	//   29   57:aload_2         
	//   30   58:astore_1        
			else
	//*  31   59:goto            64
				obj = null;
	//   32   62:aconst_null     
	//   33   63:astore_1        
		if(obj2 != null)
	//*  34   64:aload_3         
	//*  35   65:ifnull          94
		{
			obj1 = ((Object) (new TransitionSet()));
	//   36   68:new             #47  <Class TransitionSet>
	//   37   71:dup             
	//   38   72:invokespecial   #93  <Method void TransitionSet()>
	//   39   75:astore_2        
			if(obj != null)
	//*  40   76:aload_1         
	//*  41   77:ifnull          86
				((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
	//   42   80:aload_2         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   45   85:pop             
			((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
	//   46   86:aload_2         
	//   47   87:aload_3         
	//   48   88:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   49   91:pop             
			return obj1;
	//   50   92:aload_2         
	//   51   93:areturn         
		} else
		{
			return obj;
	//   52   94:aload_1         
	//   53   95:areturn         
		}
	}

	public Object mergeTransitionsTogether(Object obj, Object obj1, Object obj2)
	{
		TransitionSet transitionset = new TransitionSet();
	//    0    0:new             #47  <Class TransitionSet>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void TransitionSet()>
	//    3    7:astore          4
		if(obj != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          23
			transitionset.addTransition((Transition)obj);
	//    6   13:aload           4
	//    7   15:aload_1         
	//    8   16:checkcast       #24  <Class Transition>
	//    9   19:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   10   22:pop             
		if(obj1 != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          37
			transitionset.addTransition((Transition)obj1);
	//   13   27:aload           4
	//   14   29:aload_2         
	//   15   30:checkcast       #24  <Class Transition>
	//   16   33:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   17   36:pop             
		if(obj2 != null)
	//*  18   37:aload_3         
	//*  19   38:ifnull          51
			transitionset.addTransition((Transition)obj2);
	//   20   41:aload           4
	//   21   43:aload_3         
	//   22   44:checkcast       #24  <Class Transition>
	//   23   47:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   24   50:pop             
		return ((Object) (transitionset));
	//   25   51:aload           4
	//   26   53:areturn         
	}

	public void removeTarget(Object obj, View view)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			((Transition)obj).removeTarget(view);
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class Transition>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #105 <Method Transition Transition.removeTarget(View)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void replaceTargets(Object obj, ArrayList arraylist, ArrayList arraylist1)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class Transition>
	//    2    4:astore_1        
		boolean flag = obj instanceof TransitionSet;
	//    3    5:aload_1         
	//    4    6:instanceof      #47  <Class TransitionSet>
	//    5    9:istore          6
		int l = 0;
	//    6   11:iconst_0        
	//    7   12:istore          5
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore          4
		if(flag)
	//*  10   17:iload           6
	//*  11   19:ifeq            61
		{
			obj = ((Object) ((TransitionSet)obj));
	//   12   22:aload_1         
	//   13   23:checkcast       #47  <Class TransitionSet>
	//   14   26:astore_1        
			for(l = ((TransitionSet) (obj)).getTransitionCount(); i < l; i++)
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #51  <Method int TransitionSet.getTransitionCount()>
	//*  17   31:istore          5
	//*  18   33:iload           4
	//*  19   35:iload           5
	//*  20   37:icmpge          186
				replaceTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist, arraylist1);
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:iload           4
	//   24   44:invokevirtual   #55  <Method Transition TransitionSet.getTransitionAt(int)>
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #109 <Method void replaceTargets(Object, ArrayList, ArrayList)>

	//   28   52:iload           4
	//   29   54:iconst_1        
	//   30   55:iadd            
	//   31   56:istore          4
		} else
	//*  32   58:goto            33
		if(!hasSimpleTarget(((Transition) (obj))))
	//*  33   61:aload_1         
	//*  34   62:invokestatic    #59  <Method boolean hasSimpleTarget(Transition)>
	//*  35   65:ifne            186
		{
			List list = ((Transition) (obj)).getTargets();
	//   36   68:aload_1         
	//   37   69:invokevirtual   #62  <Method List Transition.getTargets()>
	//   38   72:astore          7
			if(list != null && list.size() == arraylist.size() && list.containsAll(((java.util.Collection) (arraylist))))
	//*  39   74:aload           7
	//*  40   76:ifnull          186
	//*  41   79:aload           7
	//*  42   81:invokeinterface #112 <Method int List.size()>
	//*  43   86:aload_2         
	//*  44   87:invokevirtual   #67  <Method int ArrayList.size()>
	//*  45   90:icmpne          186
	//*  46   93:aload           7
	//*  47   95:aload_2         
	//*  48   96:invokeinterface #116 <Method boolean List.containsAll(java.util.Collection)>
	//*  49  101:ifeq            186
			{
				int j;
				if(arraylist1 == null)
	//*  50  104:aload_3         
	//*  51  105:ifnonnull       114
					j = 0;
	//   52  108:iconst_0        
	//   53  109:istore          4
				else
	//*  54  111:goto            120
					j = arraylist1.size();
	//   55  114:aload_3         
	//   56  115:invokevirtual   #67  <Method int ArrayList.size()>
	//   57  118:istore          4
				for(; l < j; l++)
	//*  58  120:iload           5
	//*  59  122:iload           4
	//*  60  124:icmpge          150
					((Transition) (obj)).addTarget((View)arraylist1.get(l));
	//   61  127:aload_1         
	//   62  128:aload_3         
	//   63  129:iload           5
	//   64  131:invokevirtual   #71  <Method Object ArrayList.get(int)>
	//   65  134:checkcast       #73  <Class View>
	//   66  137:invokevirtual   #43  <Method Transition Transition.addTarget(View)>
	//   67  140:pop             

	//   68  141:iload           5
	//   69  143:iconst_1        
	//   70  144:iadd            
	//   71  145:istore          5
	//*  72  147:goto            120
				for(int k = arraylist.size() - 1; k >= 0; k--)
	//*  73  150:aload_2         
	//*  74  151:invokevirtual   #67  <Method int ArrayList.size()>
	//*  75  154:iconst_1        
	//*  76  155:isub            
	//*  77  156:istore          4
	//*  78  158:iload           4
	//*  79  160:iflt            186
					((Transition) (obj)).removeTarget((View)arraylist.get(k));
	//   80  163:aload_1         
	//   81  164:aload_2         
	//   82  165:iload           4
	//   83  167:invokevirtual   #71  <Method Object ArrayList.get(int)>
	//   84  170:checkcast       #73  <Class View>
	//   85  173:invokevirtual   #105 <Method Transition Transition.removeTarget(View)>
	//   86  176:pop             

	//   87  177:iload           4
	//   88  179:iconst_1        
	//   89  180:isub            
	//   90  181:istore          4
			}
		}
	//*  91  183:goto            158
	//   92  186:return          
	}

	public void scheduleHideFragmentView(Object obj, final View fragmentView, final ArrayList exitingViews)
	{
		((Transition)obj).addListener(new android.transition.Transition.TransitionListener() {

			public void onTransitionCancel(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionEnd(Transition transition)
			{
				transition.removeListener(((android.transition.Transition.TransitionListener) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:invokevirtual   #38  <Method Transition Transition.removeListener(android.transition.Transition$TransitionListener)>
			//    3    5:pop             
				fragmentView.setVisibility(8);
			//    4    6:aload_0         
			//    5    7:getfield        #23  <Field View val$fragmentView>
			//    6   10:bipush          8
			//    7   12:invokevirtual   #44  <Method void View.setVisibility(int)>
				int j = exitingViews.size();
			//    8   15:aload_0         
			//    9   16:getfield        #25  <Field ArrayList val$exitingViews>
			//   10   19:invokevirtual   #50  <Method int ArrayList.size()>
			//   11   22:istore_3        
				for(int i = 0; i < j; i++)
			//*  12   23:iconst_0        
			//*  13   24:istore_2        
			//*  14   25:iload_2         
			//*  15   26:iload_3         
			//*  16   27:icmpge          52
					((View)exitingViews.get(i)).setVisibility(0);
			//   17   30:aload_0         
			//   18   31:getfield        #25  <Field ArrayList val$exitingViews>
			//   19   34:iload_2         
			//   20   35:invokevirtual   #54  <Method Object ArrayList.get(int)>
			//   21   38:checkcast       #40  <Class View>
			//   22   41:iconst_0        
			//   23   42:invokevirtual   #44  <Method void View.setVisibility(int)>

			//   24   45:iload_2         
			//   25   46:iconst_1        
			//   26   47:iadd            
			//   27   48:istore_2        
			//*  28   49:goto            25
			//   29   52:return          
			}

			public void onTransitionPause(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionResume(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionStart(Transition transition)
			{
			//    0    0:return          
			}

			final FragmentTransitionCompat21 this$0;
			final ArrayList val$exitingViews;
			final View val$fragmentView;

			
			{
				this$0 = FragmentTransitionCompat21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentTransitionCompat21 this$0>
				fragmentView = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View val$fragmentView>
				exitingViews = arraylist;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field ArrayList val$exitingViews>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class Transition>
	//    2    4:new             #8   <Class FragmentTransitionCompat21$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #122 <Method void FragmentTransitionCompat21$2(FragmentTransitionCompat21, View, ArrayList)>
	//    8   14:invokevirtual   #126 <Method Transition Transition.addListener(android.transition.Transition$TransitionListener)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void scheduleRemoveTargets(Object obj, final Object enterTransition, final ArrayList enteringViews, final Object exitTransition, final ArrayList exitingViews, final Object sharedElementTransition, final ArrayList sharedElementsIn)
	{
		((Transition)obj).addListener(new android.transition.Transition.TransitionListener() {

			public void onTransitionCancel(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionEnd(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionPause(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionResume(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionStart(Transition transition)
			{
				if(enterTransition != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #27  <Field Object val$enterTransition>
			//*   2    4:ifnull          23
					replaceTargets(enterTransition, enteringViews, ((ArrayList) (null)));
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field FragmentTransitionCompat21 this$0>
			//    5   11:aload_0         
			//    6   12:getfield        #27  <Field Object val$enterTransition>
			//    7   15:aload_0         
			//    8   16:getfield        #29  <Field ArrayList val$enteringViews>
			//    9   19:aconst_null     
			//   10   20:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
				if(exitTransition != null)
			//*  11   23:aload_0         
			//*  12   24:getfield        #31  <Field Object val$exitTransition>
			//*  13   27:ifnull          46
					replaceTargets(exitTransition, exitingViews, ((ArrayList) (null)));
			//   14   30:aload_0         
			//   15   31:getfield        #25  <Field FragmentTransitionCompat21 this$0>
			//   16   34:aload_0         
			//   17   35:getfield        #31  <Field Object val$exitTransition>
			//   18   38:aload_0         
			//   19   39:getfield        #33  <Field ArrayList val$exitingViews>
			//   20   42:aconst_null     
			//   21   43:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
				if(sharedElementTransition != null)
			//*  22   46:aload_0         
			//*  23   47:getfield        #35  <Field Object val$sharedElementTransition>
			//*  24   50:ifnull          69
					replaceTargets(sharedElementTransition, sharedElementsIn, ((ArrayList) (null)));
			//   25   53:aload_0         
			//   26   54:getfield        #25  <Field FragmentTransitionCompat21 this$0>
			//   27   57:aload_0         
			//   28   58:getfield        #35  <Field Object val$sharedElementTransition>
			//   29   61:aload_0         
			//   30   62:getfield        #37  <Field ArrayList val$sharedElementsIn>
			//   31   65:aconst_null     
			//   32   66:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
			//   33   69:return          
			}

			final FragmentTransitionCompat21 this$0;
			final Object val$enterTransition;
			final ArrayList val$enteringViews;
			final Object val$exitTransition;
			final ArrayList val$exitingViews;
			final Object val$sharedElementTransition;
			final ArrayList val$sharedElementsIn;

			
			{
				this$0 = FragmentTransitionCompat21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field FragmentTransitionCompat21 this$0>
				enterTransition = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Object val$enterTransition>
				enteringViews = arraylist;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field ArrayList val$enteringViews>
				exitTransition = obj1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field Object val$exitTransition>
				exitingViews = arraylist1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field ArrayList val$exitingViews>
				sharedElementTransition = obj2;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #35  <Field Object val$sharedElementTransition>
				sharedElementsIn = arraylist2;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #37  <Field ArrayList val$sharedElementsIn>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #40  <Method void Object()>
			//   23   43:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class Transition>
	//    2    4:new             #10  <Class FragmentTransitionCompat21$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:aload           7
	//   11   19:invokespecial   #132 <Method void FragmentTransitionCompat21$3(FragmentTransitionCompat21, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
	//   12   22:invokevirtual   #126 <Method Transition Transition.addListener(android.transition.Transition$TransitionListener)>
	//   13   25:pop             
	//   14   26:return          
	}

	public void setEpicenter(Object obj, final Rect epicenter)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
			((Transition)obj).setEpicenterCallback(((android.transition.Transition.EpicenterCallback) (new android.transition.Transition.EpicenterCallback() {

				public Rect onGetEpicenter(Transition transition)
				{
					if(epicenter != null && !epicenter.isEmpty())
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field Rect val$epicenter>
				//*   2    4:ifnull          25
				//*   3    7:aload_0         
				//*   4    8:getfield        #19  <Field Rect val$epicenter>
				//*   5   11:invokevirtual   #31  <Method boolean Rect.isEmpty()>
				//*   6   14:ifeq            20
				//*   7   17:goto            25
						return epicenter;
				//    8   20:aload_0         
				//    9   21:getfield        #19  <Field Rect val$epicenter>
				//   10   24:areturn         
					else
						return null;
				//   11   25:aconst_null     
				//   12   26:areturn         
				}

				final FragmentTransitionCompat21 this$0;
				final Rect val$epicenter;

			
			{
				this$0 = FragmentTransitionCompat21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FragmentTransitionCompat21 this$0>
				epicenter = rect;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Rect val$epicenter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void android.transition.Transition$EpicenterCallback()>
			//    8   14:return          
			}
			}
)));
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class Transition>
	//    4    8:new             #12  <Class FragmentTransitionCompat21$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #138 <Method void FragmentTransitionCompat21$4(FragmentTransitionCompat21, Rect)>
	//    9   17:invokevirtual   #142 <Method void Transition.setEpicenterCallback(android.transition.Transition$EpicenterCallback)>
	//   10   20:return          
	}

	public void setEpicenter(Object obj, View view)
	{
		if(view != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          36
		{
			obj = ((Object) ((Transition)obj));
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class Transition>
	//    4    8:astore_1        
			final Rect epicenter = new Rect();
	//    5    9:new             #144 <Class Rect>
	//    6   12:dup             
	//    7   13:invokespecial   #145 <Method void Rect()>
	//    8   16:astore_3        
			getBoundsOnScreen(view, epicenter);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #149 <Method void getBoundsOnScreen(View, Rect)>
			((Transition) (obj)).setEpicenterCallback(((android.transition.Transition.EpicenterCallback) (new android.transition.Transition.EpicenterCallback() {

				public Rect onGetEpicenter(Transition transition)
				{
					return epicenter;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field Rect val$epicenter>
				//    2    4:areturn         
				}

				final FragmentTransitionCompat21 this$0;
				final Rect val$epicenter;

			
			{
				this$0 = FragmentTransitionCompat21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FragmentTransitionCompat21 this$0>
				epicenter = rect;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Rect val$epicenter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void android.transition.Transition$EpicenterCallback()>
			//    8   14:return          
			}
			}
)));
	//   13   23:aload_1         
	//   14   24:new             #6   <Class FragmentTransitionCompat21$1>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokespecial   #150 <Method void FragmentTransitionCompat21$1(FragmentTransitionCompat21, Rect)>
	//   19   33:invokevirtual   #142 <Method void Transition.setEpicenterCallback(android.transition.Transition$EpicenterCallback)>
		}
	//   20   36:return          
	}

	public void setSharedElementTargets(Object obj, View view, ArrayList arraylist)
	{
		obj = ((Object) ((TransitionSet)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #47  <Class TransitionSet>
	//    2    4:astore_1        
		List list = ((TransitionSet) (obj)).getTargets();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #152 <Method List TransitionSet.getTargets()>
	//    5    9:astore          6
		list.clear();
	//    6   11:aload           6
	//    7   13:invokeinterface #155 <Method void List.clear()>
		int j = arraylist.size();
	//    8   18:aload_3         
	//    9   19:invokevirtual   #67  <Method int ArrayList.size()>
	//   10   22:istore          5
		for(int i = 0; i < j; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore          4
	//*  13   27:iload           4
	//*  14   29:iload           5
	//*  15   31:icmpge          57
			bfsAddViewChildren(list, (View)arraylist.get(i));
	//   16   34:aload           6
	//   17   36:aload_3         
	//   18   37:iload           4
	//   19   39:invokevirtual   #71  <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #73  <Class View>
	//   21   45:invokestatic    #159 <Method void bfsAddViewChildren(List, View)>

	//   22   48:iload           4
	//   23   50:iconst_1        
	//   24   51:iadd            
	//   25   52:istore          4
	//*  26   54:goto            27
		list.add(((Object) (view)));
	//   27   57:aload           6
	//   28   59:aload_2         
	//   29   60:invokeinterface #162 <Method boolean List.add(Object)>
	//   30   65:pop             
		arraylist.add(((Object) (view)));
	//   31   66:aload_3         
	//   32   67:aload_2         
	//   33   68:invokevirtual   #163 <Method boolean ArrayList.add(Object)>
	//   34   71:pop             
		addTargets(obj, arraylist);
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:aload_3         
	//   38   75:invokevirtual   #57  <Method void addTargets(Object, ArrayList)>
	//   39   78:return          
	}

	public void swapSharedElementTargets(Object obj, ArrayList arraylist, ArrayList arraylist1)
	{
		obj = ((Object) ((TransitionSet)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #47  <Class TransitionSet>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          36
		{
			((TransitionSet) (obj)).getTargets().clear();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #152 <Method List TransitionSet.getTargets()>
	//    7   13:invokeinterface #155 <Method void List.clear()>
			((TransitionSet) (obj)).getTargets().addAll(((java.util.Collection) (arraylist1)));
	//    8   18:aload_1         
	//    9   19:invokevirtual   #152 <Method List TransitionSet.getTargets()>
	//   10   22:aload_3         
	//   11   23:invokeinterface #167 <Method boolean List.addAll(java.util.Collection)>
	//   12   28:pop             
			replaceTargets(obj, arraylist, arraylist1);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #109 <Method void replaceTargets(Object, ArrayList, ArrayList)>
		}
	//   18   36:return          
	}

	public Object wrapTransitionInSet(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			TransitionSet transitionset = new TransitionSet();
	//    4    6:new             #47  <Class TransitionSet>
	//    5    9:dup             
	//    6   10:invokespecial   #93  <Method void TransitionSet()>
	//    7   13:astore_2        
			transitionset.addTransition((Transition)obj);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:checkcast       #24  <Class Transition>
	//   11   19:invokevirtual   #97  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   12   22:pop             
			return ((Object) (transitionset));
	//   13   23:aload_2         
	//   14   24:areturn         
		}
	}
}
