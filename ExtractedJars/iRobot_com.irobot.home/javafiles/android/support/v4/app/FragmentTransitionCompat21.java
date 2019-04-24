// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.*;
import android.view.View;
import android.view.ViewGroup;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			OneShotPreDrawListener

class FragmentTransitionCompat21
{

	FragmentTransitionCompat21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static void addTarget(Object obj, View view)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			((Transition)obj).addTarget(view);
	//    2    4:aload_0         
	//    3    5:checkcast       #32  <Class Transition>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #35  <Method Transition Transition.addTarget(View)>
	//    6   12:pop             
	//    7   13:return          
	}

	public static void addTargets(Object obj, ArrayList arraylist)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #32  <Class Transition>
	//    2    4:astore_0        
		if(obj == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		boolean flag = obj instanceof TransitionSet;
	//    6   10:aload_0         
	//    7   11:instanceof      #39  <Class TransitionSet>
	//    8   14:istore          5
		int k = 0;
	//    9   16:iconst_0        
	//   10   17:istore_3        
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		if(flag)
	//*  13   20:iload           5
	//*  14   22:ifeq            56
		{
			obj = ((Object) ((TransitionSet)obj));
	//   15   25:aload_0         
	//   16   26:checkcast       #39  <Class TransitionSet>
	//   17   29:astore_0        
			for(k = ((TransitionSet) (obj)).getTransitionCount(); i < k; i++)
	//*  18   30:aload_0         
	//*  19   31:invokevirtual   #43  <Method int TransitionSet.getTransitionCount()>
	//*  20   34:istore_3        
	//*  21   35:iload_2         
	//*  22   36:iload_3         
	//*  23   37:icmpge          107
				addTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist);
	//   24   40:aload_0         
	//   25   41:iload_2         
	//   26   42:invokevirtual   #47  <Method Transition TransitionSet.getTransitionAt(int)>
	//   27   45:aload_1         
	//   28   46:invokestatic    #49  <Method void addTargets(Object, ArrayList)>

	//   29   49:iload_2         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_2        
		} else
	//*  33   53:goto            35
		if(!hasSimpleTarget(((Transition) (obj))) && isNullOrEmpty(((Transition) (obj)).getTargets()))
	//*  34   56:aload_0         
	//*  35   57:invokestatic    #53  <Method boolean hasSimpleTarget(Transition)>
	//*  36   60:ifne            107
	//*  37   63:aload_0         
	//*  38   64:invokevirtual   #57  <Method List Transition.getTargets()>
	//*  39   67:invokestatic    #61  <Method boolean isNullOrEmpty(List)>
	//*  40   70:ifeq            107
		{
			int l = arraylist.size();
	//   41   73:aload_1         
	//   42   74:invokevirtual   #66  <Method int ArrayList.size()>
	//   43   77:istore          4
			for(int j = k; j < l; j++)
	//*  44   79:iload_3         
	//*  45   80:istore_2        
	//*  46   81:iload_2         
	//*  47   82:iload           4
	//*  48   84:icmpge          107
				((Transition) (obj)).addTarget((View)arraylist.get(j));
	//   49   87:aload_0         
	//   50   88:aload_1         
	//   51   89:iload_2         
	//   52   90:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   53   93:checkcast       #72  <Class View>
	//   54   96:invokevirtual   #35  <Method Transition Transition.addTarget(View)>
	//   55   99:pop             

	//   56  100:iload_2         
	//   57  101:iconst_1        
	//   58  102:iadd            
	//   59  103:istore_2        
		}
	//*  60  104:goto            81
	//   61  107:return          
	}

	public static void beginDelayedTransition(ViewGroup viewgroup, Object obj)
	{
		TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class Transition>
	//    3    5:invokestatic    #81  <Method void TransitionManager.beginDelayedTransition(ViewGroup, Transition)>
	//    4    8:return          
	}

	private static void bfsAddViewChildren(List list, View view)
	{
		int k = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #86  <Method int List.size()>
	//    2    6:istore          4
		if(containedBeforeIndex(list, view, k))
	//*   3    8:aload_0         
	//*   4    9:aload_1         
	//*   5   10:iload           4
	//*   6   12:invokestatic    #90  <Method boolean containedBeforeIndex(List, View, int)>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		list.add(((Object) (view)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #94  <Method boolean List.add(Object)>
	//   12   26:pop             
		for(int i = k; i < list.size(); i++)
	//*  13   27:iload           4
	//*  14   29:istore_2        
	//*  15   30:iload_2         
	//*  16   31:aload_0         
	//*  17   32:invokeinterface #86  <Method int List.size()>
	//*  18   37:icmpge          118
		{
			view = (View)list.get(i);
	//   19   40:aload_0         
	//   20   41:iload_2         
	//   21   42:invokeinterface #95  <Method Object List.get(int)>
	//   22   47:checkcast       #72  <Class View>
	//   23   50:astore_1        
			if(!(view instanceof ViewGroup))
				continue;
	//   24   51:aload_1         
	//   25   52:instanceof      #97  <Class ViewGroup>
	//   26   55:ifeq            111
			view = ((View) ((ViewGroup)view));
	//   27   58:aload_1         
	//   28   59:checkcast       #97  <Class ViewGroup>
	//   29   62:astore_1        
			int l = ((ViewGroup) (view)).getChildCount();
	//   30   63:aload_1         
	//   31   64:invokevirtual   #100 <Method int ViewGroup.getChildCount()>
	//   32   67:istore          5
			for(int j = 0; j < l; j++)
	//*  33   69:iconst_0        
	//*  34   70:istore_3        
	//*  35   71:iload_3         
	//*  36   72:iload           5
	//*  37   74:icmpge          111
			{
				View view1 = ((ViewGroup) (view)).getChildAt(j);
	//   38   77:aload_1         
	//   39   78:iload_3         
	//   40   79:invokevirtual   #104 <Method View ViewGroup.getChildAt(int)>
	//   41   82:astore          6
				if(!containedBeforeIndex(list, view1, k))
	//*  42   84:aload_0         
	//*  43   85:aload           6
	//*  44   87:iload           4
	//*  45   89:invokestatic    #90  <Method boolean containedBeforeIndex(List, View, int)>
	//*  46   92:ifne            104
					list.add(((Object) (view1)));
	//   47   95:aload_0         
	//   48   96:aload           6
	//   49   98:invokeinterface #94  <Method boolean List.add(Object)>
	//   50  103:pop             
			}

	//   51  104:iload_3         
	//   52  105:iconst_1        
	//   53  106:iadd            
	//   54  107:istore_3        
		}

	//   55  108:goto            71
	//   56  111:iload_2         
	//   57  112:iconst_1        
	//   58  113:iadd            
	//   59  114:istore_2        
	//*  60  115:goto            30
	//   61  118:return          
	}

	public static void captureTransitioningViews(ArrayList arraylist, View view)
	{
label0:
		{
			if(view.getVisibility() != 0)
				break label0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #110 <Method int View.getVisibility()>
	//    2    4:ifne            71
			Object obj = ((Object) (view));
	//    3    7:aload_1         
	//    4    8:astore          4
			if(view instanceof ViewGroup)
	//*   5   10:aload_1         
	//*   6   11:instanceof      #97  <Class ViewGroup>
	//*   7   14:ifeq            64
			{
				obj = ((Object) ((ViewGroup)view));
	//    8   17:aload_1         
	//    9   18:checkcast       #97  <Class ViewGroup>
	//   10   21:astore          4
				if(!((ViewGroup) (obj)).isTransitionGroup())
	//*  11   23:aload           4
	//*  12   25:invokevirtual   #114 <Method boolean ViewGroup.isTransitionGroup()>
	//*  13   28:ifeq            34
	//*  14   31:goto            64
				{
					int j = ((ViewGroup) (obj)).getChildCount();
	//   15   34:aload           4
	//   16   36:invokevirtual   #100 <Method int ViewGroup.getChildCount()>
	//   17   39:istore_3        
					for(int i = 0; i < j; i++)
	//*  18   40:iconst_0        
	//*  19   41:istore_2        
	//*  20   42:iload_2         
	//*  21   43:iload_3         
	//*  22   44:icmpge          71
						captureTransitioningViews(arraylist, ((ViewGroup) (obj)).getChildAt(i));
	//   23   47:aload_0         
	//   24   48:aload           4
	//   25   50:iload_2         
	//   26   51:invokevirtual   #104 <Method View ViewGroup.getChildAt(int)>
	//   27   54:invokestatic    #116 <Method void captureTransitioningViews(ArrayList, View)>

	//   28   57:iload_2         
	//   29   58:iconst_1        
	//   30   59:iadd            
	//   31   60:istore_2        
					break label0;
	//   32   61:goto            42
				}
			}
			arraylist.add(obj);
	//   33   64:aload_0         
	//   34   65:aload           4
	//   35   67:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   36   70:pop             
		}
	//   37   71:return          
	}

	public static Object cloneTransition(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return ((Object) (((Transition)obj).clone()));
	//    2    4:aload_0         
	//    3    5:checkcast       #32  <Class Transition>
	//    4    8:invokevirtual   #124 <Method Transition Transition.clone()>
	//    5   11:areturn         
		else
			return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	private static boolean containedBeforeIndex(List list, View view, int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iload_2         
	//*   4    4:icmpge          27
			if(list.get(j) == view)
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:invokeinterface #95  <Method Object List.get(int)>
	//*   8   14:aload_1         
	//*   9   15:if_acmpne       20
				return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         

	//   12   20:iload_3         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:istore_3        
	//*  16   24:goto            2
		return false;
	//   17   27:iconst_0        
	//   18   28:ireturn         
	}

	private static String findKeyForValue(Map map, String s)
	{
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #131 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #137 <Method Iterator Set.iterator()>
	//*   3   11:astore_0        
	//*   4   12:aload_0         
	//*   5   13:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            54
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_0         
	//    8   22:invokeinterface #146 <Method Object Iterator.next()>
	//    9   27:checkcast       #148 <Class java.util.Map$Entry>
	//   10   30:astore_2        
			if(s.equals(entry.getValue()))
	//*  11   31:aload_1         
	//*  12   32:aload_2         
	//*  13   33:invokeinterface #151 <Method Object java.util.Map$Entry.getValue()>
	//*  14   38:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  15   41:ifeq            12
				return (String)entry.getKey();
	//   16   44:aload_2         
	//   17   45:invokeinterface #159 <Method Object java.util.Map$Entry.getKey()>
	//   18   50:checkcast       #153 <Class String>
	//   19   53:areturn         
		}

		return null;
	//   20   54:aconst_null     
	//   21   55:areturn         
	}

	public static void findNamedViews(Map map, View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #110 <Method int View.getVisibility()>
	//*   2    4:ifne            68
		{
			String s = view.getTransitionName();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #166 <Method String View.getTransitionName()>
	//    5   11:astore          4
			if(s != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          28
				map.put(((Object) (s)), ((Object) (view)));
	//    8   18:aload_0         
	//    9   19:aload           4
	//   10   21:aload_1         
	//   11   22:invokeinterface #170 <Method Object Map.put(Object, Object)>
	//   12   27:pop             
			if(view instanceof ViewGroup)
	//*  13   28:aload_1         
	//*  14   29:instanceof      #97  <Class ViewGroup>
	//*  15   32:ifeq            68
			{
				view = ((View) ((ViewGroup)view));
	//   16   35:aload_1         
	//   17   36:checkcast       #97  <Class ViewGroup>
	//   18   39:astore_1        
				int j = ((ViewGroup) (view)).getChildCount();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #100 <Method int ViewGroup.getChildCount()>
	//   21   44:istore_3        
				for(int i = 0; i < j; i++)
	//*  22   45:iconst_0        
	//*  23   46:istore_2        
	//*  24   47:iload_2         
	//*  25   48:iload_3         
	//*  26   49:icmpge          68
					findNamedViews(map, ((ViewGroup) (view)).getChildAt(i));
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:iload_2         
	//   30   55:invokevirtual   #104 <Method View ViewGroup.getChildAt(int)>
	//   31   58:invokestatic    #172 <Method void findNamedViews(Map, View)>

	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
			}
		}
	//*  36   65:goto            47
	//   37   68:return          
	}

	public static void getBoundsOnScreen(View view, Rect rect)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_2        
		view.getLocationOnScreen(ai);
	//    3    4:aload_0         
	//    4    5:aload_2         
	//    5    6:invokevirtual   #179 <Method void View.getLocationOnScreen(int[])>
		rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:iconst_0        
	//    9   12:iaload          
	//   10   13:aload_2         
	//   11   14:iconst_1        
	//   12   15:iaload          
	//   13   16:aload_2         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:aload_0         
	//   17   20:invokevirtual   #182 <Method int View.getWidth()>
	//   18   23:iadd            
	//   19   24:aload_2         
	//   20   25:iconst_1        
	//   21   26:iaload          
	//   22   27:aload_0         
	//   23   28:invokevirtual   #185 <Method int View.getHeight()>
	//   24   31:iadd            
	//   25   32:invokevirtual   #191 <Method void Rect.set(int, int, int, int)>
	//   26   35:return          
	}

	private static boolean hasSimpleTarget(Transition transition)
	{
		return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #194 <Method List Transition.getTargetIds()>
	//    2    4:invokestatic    #61  <Method boolean isNullOrEmpty(List)>
	//    3    7:ifeq            35
	//    4   10:aload_0         
	//    5   11:invokevirtual   #197 <Method List Transition.getTargetNames()>
	//    6   14:invokestatic    #61  <Method boolean isNullOrEmpty(List)>
	//    7   17:ifeq            35
	//    8   20:aload_0         
	//    9   21:invokevirtual   #200 <Method List Transition.getTargetTypes()>
	//   10   24:invokestatic    #61  <Method boolean isNullOrEmpty(List)>
	//   11   27:ifne            33
	//   12   30:goto            35
	//   13   33:iconst_0        
	//   14   34:ireturn         
	//   15   35:iconst_1        
	//   16   36:ireturn         
	}

	private static boolean isNullOrEmpty(List list)
	{
		return list == null || list.isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:aload_0         
	//    3    5:invokeinterface #203 <Method boolean List.isEmpty()>
	//    4   10:ifeq            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public static Object mergeTransitionsInSequence(Object obj, Object obj1, Object obj2)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #32  <Class Transition>
	//    2    4:astore_0        
		obj1 = ((Object) ((Transition)obj1));
	//    3    5:aload_1         
	//    4    6:checkcast       #32  <Class Transition>
	//    5    9:astore_1        
		obj2 = ((Object) ((Transition)obj2));
	//    6   10:aload_2         
	//    7   11:checkcast       #32  <Class Transition>
	//    8   14:astore_2        
		if(obj != null && obj1 != null)
	//*   9   15:aload_0         
	//*  10   16:ifnull          46
	//*  11   19:aload_1         
	//*  12   20:ifnull          46
			obj = ((Object) ((new TransitionSet()).addTransition(((Transition) (obj))).addTransition(((Transition) (obj1))).setOrdering(1)));
	//   13   23:new             #39  <Class TransitionSet>
	//   14   26:dup             
	//   15   27:invokespecial   #206 <Method void TransitionSet()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #214 <Method TransitionSet TransitionSet.setOrdering(int)>
	//   22   42:astore_0        
		else
	//*  23   43:goto            64
		if(obj == null)
	//*  24   46:aload_0         
	//*  25   47:ifnull          53
	//*  26   50:goto            64
			if(obj1 != null)
	//*  27   53:aload_1         
	//*  28   54:ifnull          62
				obj = obj1;
	//   29   57:aload_1         
	//   30   58:astore_0        
			else
	//*  31   59:goto            64
				obj = null;
	//   32   62:aconst_null     
	//   33   63:astore_0        
		if(obj2 != null)
	//*  34   64:aload_2         
	//*  35   65:ifnull          94
		{
			obj1 = ((Object) (new TransitionSet()));
	//   36   68:new             #39  <Class TransitionSet>
	//   37   71:dup             
	//   38   72:invokespecial   #206 <Method void TransitionSet()>
	//   39   75:astore_1        
			if(obj != null)
	//*  40   76:aload_0         
	//*  41   77:ifnull          86
				((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
	//   42   80:aload_1         
	//   43   81:aload_0         
	//   44   82:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   45   85:pop             
			((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
	//   46   86:aload_1         
	//   47   87:aload_2         
	//   48   88:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   49   91:pop             
			return obj1;
	//   50   92:aload_1         
	//   51   93:areturn         
		} else
		{
			return obj;
	//   52   94:aload_0         
	//   53   95:areturn         
		}
	}

	public static Object mergeTransitionsTogether(Object obj, Object obj1, Object obj2)
	{
		TransitionSet transitionset = new TransitionSet();
	//    0    0:new             #39  <Class TransitionSet>
	//    1    3:dup             
	//    2    4:invokespecial   #206 <Method void TransitionSet()>
	//    3    7:astore_3        
		if(obj != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          21
			transitionset.addTransition((Transition)obj);
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:checkcast       #32  <Class Transition>
	//    9   17:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   10   20:pop             
		if(obj1 != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          34
			transitionset.addTransition((Transition)obj1);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:checkcast       #32  <Class Transition>
	//   16   30:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   17   33:pop             
		if(obj2 != null)
	//*  18   34:aload_2         
	//*  19   35:ifnull          47
			transitionset.addTransition((Transition)obj2);
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:checkcast       #32  <Class Transition>
	//   23   43:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   24   46:pop             
		return ((Object) (transitionset));
	//   25   47:aload_3         
	//   26   48:areturn         
	}

	public static ArrayList prepareSetNameOverridesReordered(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #63  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void ArrayList()>
	//    3    7:astore_3        
		int j = arraylist.size();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #66  <Method int ArrayList.size()>
	//    6   12:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          53
		{
			View view = (View)arraylist.get(i);
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #72  <Class View>
	//   16   28:astore          4
			arraylist1.add(((Object) (view.getTransitionName())));
	//   17   30:aload_3         
	//   18   31:aload           4
	//   19   33:invokevirtual   #166 <Method String View.getTransitionName()>
	//   20   36:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   21   39:pop             
			view.setTransitionName(((String) (null)));
	//   22   40:aload           4
	//   23   42:aconst_null     
	//   24   43:invokevirtual   #222 <Method void View.setTransitionName(String)>
		}

	//   25   46:iload_1         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_1        
	//*  29   50:goto            15
		return arraylist1;
	//   30   53:aload_3         
	//   31   54:areturn         
	}

	public static void removeTarget(Object obj, View view)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			((Transition)obj).removeTarget(view);
	//    2    4:aload_0         
	//    3    5:checkcast       #32  <Class Transition>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #226 <Method Transition Transition.removeTarget(View)>
	//    6   12:pop             
	//    7   13:return          
	}

	public static void replaceTargets(Object obj, ArrayList arraylist, ArrayList arraylist1)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #32  <Class Transition>
	//    2    4:astore_0        
		boolean flag = obj instanceof TransitionSet;
	//    3    5:aload_0         
	//    4    6:instanceof      #39  <Class TransitionSet>
	//    5    9:istore          5
		int l = 0;
	//    6   11:iconst_0        
	//    7   12:istore          4
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_3        
		if(flag)
	//*  10   16:iload           5
	//*  11   18:ifeq            55
		{
			obj = ((Object) ((TransitionSet)obj));
	//   12   21:aload_0         
	//   13   22:checkcast       #39  <Class TransitionSet>
	//   14   25:astore_0        
			for(l = ((TransitionSet) (obj)).getTransitionCount(); i < l; i++)
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #43  <Method int TransitionSet.getTransitionCount()>
	//*  17   30:istore          4
	//*  18   32:iload_3         
	//*  19   33:iload           4
	//*  20   35:icmpge          172
				replaceTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist, arraylist1);
	//   21   38:aload_0         
	//   22   39:iload_3         
	//   23   40:invokevirtual   #47  <Method Transition TransitionSet.getTransitionAt(int)>
	//   24   43:aload_1         
	//   25   44:aload_2         
	//   26   45:invokestatic    #230 <Method void replaceTargets(Object, ArrayList, ArrayList)>

	//   27   48:iload_3         
	//   28   49:iconst_1        
	//   29   50:iadd            
	//   30   51:istore_3        
		} else
	//*  31   52:goto            32
		if(!hasSimpleTarget(((Transition) (obj))))
	//*  32   55:aload_0         
	//*  33   56:invokestatic    #53  <Method boolean hasSimpleTarget(Transition)>
	//*  34   59:ifne            172
		{
			List list = ((Transition) (obj)).getTargets();
	//   35   62:aload_0         
	//   36   63:invokevirtual   #57  <Method List Transition.getTargets()>
	//   37   66:astore          6
			if(list != null && list.size() == arraylist.size() && list.containsAll(((java.util.Collection) (arraylist))))
	//*  38   68:aload           6
	//*  39   70:ifnull          172
	//*  40   73:aload           6
	//*  41   75:invokeinterface #86  <Method int List.size()>
	//*  42   80:aload_1         
	//*  43   81:invokevirtual   #66  <Method int ArrayList.size()>
	//*  44   84:icmpne          172
	//*  45   87:aload           6
	//*  46   89:aload_1         
	//*  47   90:invokeinterface #234 <Method boolean List.containsAll(java.util.Collection)>
	//*  48   95:ifeq            172
			{
				int j;
				if(arraylist1 == null)
	//*  49   98:aload_2         
	//*  50   99:ifnonnull       107
					j = 0;
	//   51  102:iconst_0        
	//   52  103:istore_3        
				else
	//*  53  104:goto            112
					j = arraylist1.size();
	//   54  107:aload_2         
	//   55  108:invokevirtual   #66  <Method int ArrayList.size()>
	//   56  111:istore_3        
				for(; l < j; l++)
	//*  57  112:iload           4
	//*  58  114:iload_3         
	//*  59  115:icmpge          141
					((Transition) (obj)).addTarget((View)arraylist1.get(l));
	//   60  118:aload_0         
	//   61  119:aload_2         
	//   62  120:iload           4
	//   63  122:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   64  125:checkcast       #72  <Class View>
	//   65  128:invokevirtual   #35  <Method Transition Transition.addTarget(View)>
	//   66  131:pop             

	//   67  132:iload           4
	//   68  134:iconst_1        
	//   69  135:iadd            
	//   70  136:istore          4
	//*  71  138:goto            112
				for(int k = arraylist.size() - 1; k >= 0; k--)
	//*  72  141:aload_1         
	//*  73  142:invokevirtual   #66  <Method int ArrayList.size()>
	//*  74  145:iconst_1        
	//*  75  146:isub            
	//*  76  147:istore_3        
	//*  77  148:iload_3         
	//*  78  149:iflt            172
					((Transition) (obj)).removeTarget((View)arraylist.get(k));
	//   79  152:aload_0         
	//   80  153:aload_1         
	//   81  154:iload_3         
	//   82  155:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   83  158:checkcast       #72  <Class View>
	//   84  161:invokevirtual   #226 <Method Transition Transition.removeTarget(View)>
	//   85  164:pop             

	//   86  165:iload_3         
	//   87  166:iconst_1        
	//   88  167:isub            
	//   89  168:istore_3        
			}
		}
	//*  90  169:goto            148
	//   91  172:return          
	}

	public static void scheduleHideFragmentView(Object obj, View view, ArrayList arraylist)
	{
		((Transition)obj).addListener(new android.transition.Transition.TransitionListener(view, arraylist) {

			public void onTransitionCancel(Transition transition)
			{
			//    0    0:return          
			}

			public void onTransitionEnd(Transition transition)
			{
				transition.removeListener(((android.transition.Transition.TransitionListener) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:invokevirtual   #34  <Method Transition Transition.removeListener(android.transition.Transition$TransitionListener)>
			//    3    5:pop             
				fragmentView.setVisibility(8);
			//    4    6:aload_0         
			//    5    7:getfield        #19  <Field View val$fragmentView>
			//    6   10:bipush          8
			//    7   12:invokevirtual   #40  <Method void View.setVisibility(int)>
				int j = exitingViews.size();
			//    8   15:aload_0         
			//    9   16:getfield        #21  <Field ArrayList val$exitingViews>
			//   10   19:invokevirtual   #46  <Method int ArrayList.size()>
			//   11   22:istore_3        
				for(int i = 0; i < j; i++)
			//*  12   23:iconst_0        
			//*  13   24:istore_2        
			//*  14   25:iload_2         
			//*  15   26:iload_3         
			//*  16   27:icmpge          52
					((View)exitingViews.get(i)).setVisibility(0);
			//   17   30:aload_0         
			//   18   31:getfield        #21  <Field ArrayList val$exitingViews>
			//   19   34:iload_2         
			//   20   35:invokevirtual   #50  <Method Object ArrayList.get(int)>
			//   21   38:checkcast       #36  <Class View>
			//   22   41:iconst_0        
			//   23   42:invokevirtual   #40  <Method void View.setVisibility(int)>

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

			final ArrayList val$exitingViews;
			final View val$fragmentView;

			
			{
				fragmentView = view;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field View val$fragmentView>
				exitingViews = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$exitingViews>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:checkcast       #32  <Class Transition>
	//    2    4:new             #8   <Class FragmentTransitionCompat21$2>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #240 <Method void FragmentTransitionCompat21$2(View, ArrayList)>
	//    7   13:invokevirtual   #244 <Method Transition Transition.addListener(android.transition.Transition$TransitionListener)>
	//    8   16:pop             
	//    9   17:return          
	}

	public static void scheduleNameReset(ViewGroup viewgroup, ArrayList arraylist, Map map)
	{
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(arraylist, map) {

			public void run()
			{
				int j = sharedElementsIn.size();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ArrayList val$sharedElementsIn>
			//    2    4:invokevirtual   #32  <Method int ArrayList.size()>
			//    3    7:istore_2        
				for(int i = 0; i < j; i++)
			//*   4    8:iconst_0        
			//*   5    9:istore_1        
			//*   6   10:iload_1         
			//*   7   11:iload_2         
			//*   8   12:icmpge          58
				{
					View view = (View)sharedElementsIn.get(i);
			//    9   15:aload_0         
			//   10   16:getfield        #19  <Field ArrayList val$sharedElementsIn>
			//   11   19:iload_1         
			//   12   20:invokevirtual   #36  <Method Object ArrayList.get(int)>
			//   13   23:checkcast       #38  <Class View>
			//   14   26:astore_3        
					String s = view.getTransitionName();
			//   15   27:aload_3         
			//   16   28:invokevirtual   #42  <Method String View.getTransitionName()>
			//   17   31:astore          4
					view.setTransitionName((String)nameOverrides.get(((Object) (s))));
			//   18   33:aload_3         
			//   19   34:aload_0         
			//   20   35:getfield        #21  <Field Map val$nameOverrides>
			//   21   38:aload           4
			//   22   40:invokeinterface #47  <Method Object Map.get(Object)>
			//   23   45:checkcast       #49  <Class String>
			//   24   48:invokevirtual   #53  <Method void View.setTransitionName(String)>
				}

			//   25   51:iload_1         
			//   26   52:iconst_1        
			//   27   53:iadd            
			//   28   54:istore_1        
			//*  29   55:goto            10
			//   30   58:return          
			}

			final Map val$nameOverrides;
			final ArrayList val$sharedElementsIn;

			
			{
				sharedElementsIn = arraylist;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ArrayList val$sharedElementsIn>
				nameOverrides = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map val$nameOverrides>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #18  <Class FragmentTransitionCompat21$7>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #250 <Method void FragmentTransitionCompat21$7(ArrayList, Map)>
	//    6   10:invokestatic    #255 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static void scheduleRemoveTargets(Object obj, Object obj1, ArrayList arraylist, Object obj2, ArrayList arraylist1, Object obj3, ArrayList arraylist2)
	{
		((Transition)obj).addListener(new android.transition.Transition.TransitionListener(obj1, arraylist, obj2, arraylist1, obj3, arraylist2) {

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
			//*   1    1:getfield        #23  <Field Object val$enterTransition>
			//*   2    4:ifnull          19
					FragmentTransitionCompat21.replaceTargets(enterTransition, enteringViews, ((ArrayList) (null)));
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field Object val$enterTransition>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field ArrayList val$enteringViews>
			//    7   15:aconst_null     
			//    8   16:invokestatic    #47  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
				if(exitTransition != null)
			//*   9   19:aload_0         
			//*  10   20:getfield        #27  <Field Object val$exitTransition>
			//*  11   23:ifnull          38
					FragmentTransitionCompat21.replaceTargets(exitTransition, exitingViews, ((ArrayList) (null)));
			//   12   26:aload_0         
			//   13   27:getfield        #27  <Field Object val$exitTransition>
			//   14   30:aload_0         
			//   15   31:getfield        #29  <Field ArrayList val$exitingViews>
			//   16   34:aconst_null     
			//   17   35:invokestatic    #47  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
				if(sharedElementTransition != null)
			//*  18   38:aload_0         
			//*  19   39:getfield        #31  <Field Object val$sharedElementTransition>
			//*  20   42:ifnull          57
					FragmentTransitionCompat21.replaceTargets(sharedElementTransition, sharedElementsIn, ((ArrayList) (null)));
			//   21   45:aload_0         
			//   22   46:getfield        #31  <Field Object val$sharedElementTransition>
			//   23   49:aload_0         
			//   24   50:getfield        #33  <Field ArrayList val$sharedElementsIn>
			//   25   53:aconst_null     
			//   26   54:invokestatic    #47  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
			//   27   57:return          
			}

			final Object val$enterTransition;
			final ArrayList val$enteringViews;
			final Object val$exitTransition;
			final ArrayList val$exitingViews;
			final Object val$sharedElementTransition;
			final ArrayList val$sharedElementsIn;

			
			{
				enterTransition = obj;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Object val$enterTransition>
				enteringViews = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field ArrayList val$enteringViews>
				exitTransition = obj1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Object val$exitTransition>
				exitingViews = arraylist1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field ArrayList val$exitingViews>
				sharedElementTransition = obj2;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #31  <Field Object val$sharedElementTransition>
				sharedElementsIn = arraylist2;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #33  <Field ArrayList val$sharedElementsIn>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #36  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:checkcast       #32  <Class Transition>
	//    2    4:new             #14  <Class FragmentTransitionCompat21$5>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:invokespecial   #261 <Method void FragmentTransitionCompat21$5(Object, ArrayList, Object, ArrayList, Object, ArrayList)>
	//   11   20:invokevirtual   #244 <Method Transition Transition.addListener(android.transition.Transition$TransitionListener)>
	//   12   23:pop             
	//   13   24:return          
	}

	public static void setEpicenter(Object obj, Rect rect)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          19
			((Transition)obj).setEpicenterCallback(((android.transition.Transition.EpicenterCallback) (new android.transition.Transition.EpicenterCallback(rect) {

				public Rect onGetEpicenter(Transition transition)
				{
					if(epicenter != null && !epicenter.isEmpty())
				//*   0    0:aload_0         
				//*   1    1:getfield        #15  <Field Rect val$epicenter>
				//*   2    4:ifnull          25
				//*   3    7:aload_0         
				//*   4    8:getfield        #15  <Field Rect val$epicenter>
				//*   5   11:invokevirtual   #27  <Method boolean Rect.isEmpty()>
				//*   6   14:ifeq            20
				//*   7   17:goto            25
						return epicenter;
				//    8   20:aload_0         
				//    9   21:getfield        #15  <Field Rect val$epicenter>
				//   10   24:areturn         
					else
						return null;
				//   11   25:aconst_null     
				//   12   26:areturn         
				}

				final Rect val$epicenter;

			
			{
				epicenter = rect;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Rect val$epicenter>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.transition.Transition$EpicenterCallback()>
			//    5    9:return          
			}
			}
)));
	//    2    4:aload_0         
	//    3    5:checkcast       #32  <Class Transition>
	//    4    8:new             #16  <Class FragmentTransitionCompat21$6>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #267 <Method void FragmentTransitionCompat21$6(Rect)>
	//    8   16:invokevirtual   #271 <Method void Transition.setEpicenterCallback(android.transition.Transition$EpicenterCallback)>
	//    9   19:return          
	}

	public static void setEpicenter(Object obj, View view)
	{
		if(view != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          34
		{
			obj = ((Object) ((Transition)obj));
	//    2    4:aload_0         
	//    3    5:checkcast       #32  <Class Transition>
	//    4    8:astore_0        
			Rect rect = new Rect();
	//    5    9:new             #187 <Class Rect>
	//    6   12:dup             
	//    7   13:invokespecial   #272 <Method void Rect()>
	//    8   16:astore_2        
			getBoundsOnScreen(view, rect);
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokestatic    #274 <Method void getBoundsOnScreen(View, Rect)>
			((Transition) (obj)).setEpicenterCallback(((android.transition.Transition.EpicenterCallback) (new android.transition.Transition.EpicenterCallback(rect) {

				public Rect onGetEpicenter(Transition transition)
				{
					return epicenter;
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field Rect val$epicenter>
				//    2    4:areturn         
				}

				final Rect val$epicenter;

			
			{
				epicenter = rect;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Rect val$epicenter>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.transition.Transition$EpicenterCallback()>
			//    5    9:return          
			}
			}
)));
	//   12   22:aload_0         
	//   13   23:new             #6   <Class FragmentTransitionCompat21$1>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:invokespecial   #275 <Method void FragmentTransitionCompat21$1(Rect)>
	//   17   31:invokevirtual   #271 <Method void Transition.setEpicenterCallback(android.transition.Transition$EpicenterCallback)>
		}
	//   18   34:return          
	}

	public static void setNameOverridesOrdered(View view, ArrayList arraylist, Map map)
	{
		OneShotPreDrawListener.add(view, new Runnable(arraylist, map) {

			public void run()
			{
				int j = sharedElementsIn.size();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ArrayList val$sharedElementsIn>
			//    2    4:invokevirtual   #32  <Method int ArrayList.size()>
			//    3    7:istore_2        
				for(int i = 0; i < j; i++)
			//*   4    8:iconst_0        
			//*   5    9:istore_1        
			//*   6   10:iload_1         
			//*   7   11:iload_2         
			//*   8   12:icmpge          58
				{
					View view1 = (View)sharedElementsIn.get(i);
			//    9   15:aload_0         
			//   10   16:getfield        #19  <Field ArrayList val$sharedElementsIn>
			//   11   19:iload_1         
			//   12   20:invokevirtual   #36  <Method Object ArrayList.get(int)>
			//   13   23:checkcast       #38  <Class View>
			//   14   26:astore_3        
					String s = view1.getTransitionName();
			//   15   27:aload_3         
			//   16   28:invokevirtual   #42  <Method String View.getTransitionName()>
			//   17   31:astore          4
					if(s != null)
			//*  18   33:aload           4
			//*  19   35:ifnull          51
						view1.setTransitionName(FragmentTransitionCompat21.findKeyForValue(nameOverrides, s));
			//   20   38:aload_3         
			//   21   39:aload_0         
			//   22   40:getfield        #21  <Field Map val$nameOverrides>
			//   23   43:aload           4
			//   24   45:invokestatic    #46  <Method String FragmentTransitionCompat21.access$000(Map, String)>
			//   25   48:invokevirtual   #50  <Method void View.setTransitionName(String)>
				}

			//   26   51:iload_1         
			//   27   52:iconst_1        
			//   28   53:iadd            
			//   29   54:istore_1        
			//*  30   55:goto            10
			//   31   58:return          
			}

			final Map val$nameOverrides;
			final ArrayList val$sharedElementsIn;

			
			{
				sharedElementsIn = arraylist;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ArrayList val$sharedElementsIn>
				nameOverrides = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map val$nameOverrides>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #12  <Class FragmentTransitionCompat21$4>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #278 <Method void FragmentTransitionCompat21$4(ArrayList, Map)>
	//    6   10:invokestatic    #255 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static void setNameOverridesReordered(View view, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, Map map)
	{
		int k = arraylist1.size();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #66  <Method int ArrayList.size()>
	//    2    4:istore          7
		ArrayList arraylist3 = new ArrayList();
	//    3    6:new             #63  <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #218 <Method void ArrayList()>
	//    6   13:astore          8
label0:
		for(int i = 0; i < k; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore          5
	//*   9   18:iload           5
	//*  10   20:iload           7
	//*  11   22:icmpge          138
		{
			Object obj = ((Object) ((View)arraylist.get(i)));
	//   12   25:aload_1         
	//   13   26:iload           5
	//   14   28:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #72  <Class View>
	//   16   34:astore          10
			String s = ((View) (obj)).getTransitionName();
	//   17   36:aload           10
	//   18   38:invokevirtual   #166 <Method String View.getTransitionName()>
	//   19   41:astore          9
			arraylist3.add(((Object) (s)));
	//   20   43:aload           8
	//   21   45:aload           9
	//   22   47:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   23   50:pop             
			if(s == null)
	//*  24   51:aload           9
	//*  25   53:ifnonnull       59
				continue;
	//   26   56:goto            129
			((View) (obj)).setTransitionName(((String) (null)));
	//   27   59:aload           10
	//   28   61:aconst_null     
	//   29   62:invokevirtual   #222 <Method void View.setTransitionName(String)>
			obj = ((Object) ((String)map.get(((Object) (s)))));
	//   30   65:aload           4
	//   31   67:aload           9
	//   32   69:invokeinterface #283 <Method Object Map.get(Object)>
	//   33   74:checkcast       #153 <Class String>
	//   34   77:astore          10
			int j = 0;
	//   35   79:iconst_0        
	//   36   80:istore          6
			do
			{
				if(j >= k)
					continue label0;
	//   37   82:iload           6
	//   38   84:iload           7
	//   39   86:icmpge          129
				if(((String) (obj)).equals(arraylist2.get(j)))
	//*  40   89:aload           10
	//*  41   91:aload_3         
	//*  42   92:iload           6
	//*  43   94:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//*  44   97:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  45  100:ifeq            120
				{
					((View)arraylist1.get(j)).setTransitionName(s);
	//   46  103:aload_2         
	//   47  104:iload           6
	//   48  106:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   49  109:checkcast       #72  <Class View>
	//   50  112:aload           9
	//   51  114:invokevirtual   #222 <Method void View.setTransitionName(String)>
					continue label0;
	//   52  117:goto            129
				}
				j++;
	//   53  120:iload           6
	//   54  122:iconst_1        
	//   55  123:iadd            
	//   56  124:istore          6
			} while(true);
	//   57  126:goto            82
		}

	//   58  129:iload           5
	//   59  131:iconst_1        
	//   60  132:iadd            
	//   61  133:istore          5
	//*  62  135:goto            18
		OneShotPreDrawListener.add(view, new Runnable(k, arraylist1, arraylist2, arraylist, arraylist3) {

			public void run()
			{
				for(int l = 0; l < numSharedElements; l++)
			//*   0    0:iconst_0        
			//*   1    1:istore_1        
			//*   2    2:iload_1         
			//*   3    3:aload_0         
			//*   4    4:getfield        #22  <Field int val$numSharedElements>
			//*   5    7:icmpge          67
				{
					((View)sharedElementsIn.get(l)).setTransitionName((String)inNames.get(l));
			//    6   10:aload_0         
			//    7   11:getfield        #24  <Field ArrayList val$sharedElementsIn>
			//    8   14:iload_1         
			//    9   15:invokevirtual   #41  <Method Object ArrayList.get(int)>
			//   10   18:checkcast       #43  <Class View>
			//   11   21:aload_0         
			//   12   22:getfield        #26  <Field ArrayList val$inNames>
			//   13   25:iload_1         
			//   14   26:invokevirtual   #41  <Method Object ArrayList.get(int)>
			//   15   29:checkcast       #45  <Class String>
			//   16   32:invokevirtual   #49  <Method void View.setTransitionName(String)>
					((View)sharedElementsOut.get(l)).setTransitionName((String)outNames.get(l));
			//   17   35:aload_0         
			//   18   36:getfield        #28  <Field ArrayList val$sharedElementsOut>
			//   19   39:iload_1         
			//   20   40:invokevirtual   #41  <Method Object ArrayList.get(int)>
			//   21   43:checkcast       #43  <Class View>
			//   22   46:aload_0         
			//   23   47:getfield        #30  <Field ArrayList val$outNames>
			//   24   50:iload_1         
			//   25   51:invokevirtual   #41  <Method Object ArrayList.get(int)>
			//   26   54:checkcast       #45  <Class String>
			//   27   57:invokevirtual   #49  <Method void View.setTransitionName(String)>
				}

			//   28   60:iload_1         
			//   29   61:iconst_1        
			//   30   62:iadd            
			//   31   63:istore_1        
			//*  32   64:goto            2
			//   33   67:return          
			}

			final ArrayList val$inNames;
			final int val$numSharedElements;
			final ArrayList val$outNames;
			final ArrayList val$sharedElementsIn;
			final ArrayList val$sharedElementsOut;

			
			{
				numSharedElements = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #22  <Field int val$numSharedElements>
				sharedElementsIn = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ArrayList val$sharedElementsIn>
				inNames = arraylist1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field ArrayList val$inNames>
				sharedElementsOut = arraylist2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field ArrayList val$sharedElementsOut>
				outNames = arraylist3;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #30  <Field ArrayList val$outNames>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   63  138:aload_0         
	//   64  139:new             #10  <Class FragmentTransitionCompat21$3>
	//   65  142:dup             
	//   66  143:iload           7
	//   67  145:aload_2         
	//   68  146:aload_3         
	//   69  147:aload_1         
	//   70  148:aload           8
	//   71  150:invokespecial   #286 <Method void FragmentTransitionCompat21$3(int, ArrayList, ArrayList, ArrayList, ArrayList)>
	//   72  153:invokestatic    #255 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   73  156:pop             
	//   74  157:return          
	}

	public static void setSharedElementTargets(Object obj, View view, ArrayList arraylist)
	{
		obj = ((Object) ((TransitionSet)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class TransitionSet>
	//    2    4:astore_0        
		List list = ((TransitionSet) (obj)).getTargets();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #289 <Method List TransitionSet.getTargets()>
	//    5    9:astore          5
		list.clear();
	//    6   11:aload           5
	//    7   13:invokeinterface #292 <Method void List.clear()>
		int j = arraylist.size();
	//    8   18:aload_2         
	//    9   19:invokevirtual   #66  <Method int ArrayList.size()>
	//   10   22:istore          4
		for(int i = 0; i < j; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore_3        
	//*  13   26:iload_3         
	//*  14   27:iload           4
	//*  15   29:icmpge          52
			bfsAddViewChildren(list, (View)arraylist.get(i));
	//   16   32:aload           5
	//   17   34:aload_2         
	//   18   35:iload_3         
	//   19   36:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   20   39:checkcast       #72  <Class View>
	//   21   42:invokestatic    #294 <Method void bfsAddViewChildren(List, View)>

	//   22   45:iload_3         
	//   23   46:iconst_1        
	//   24   47:iadd            
	//   25   48:istore_3        
	//*  26   49:goto            26
		list.add(((Object) (view)));
	//   27   52:aload           5
	//   28   54:aload_1         
	//   29   55:invokeinterface #94  <Method boolean List.add(Object)>
	//   30   60:pop             
		arraylist.add(((Object) (view)));
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   34   66:pop             
		addTargets(obj, arraylist);
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:invokestatic    #49  <Method void addTargets(Object, ArrayList)>
	//   38   72:return          
	}

	public static void swapSharedElementTargets(Object obj, ArrayList arraylist, ArrayList arraylist1)
	{
		obj = ((Object) ((TransitionSet)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class TransitionSet>
	//    2    4:astore_0        
		if(obj != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          35
		{
			((TransitionSet) (obj)).getTargets().clear();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #289 <Method List TransitionSet.getTargets()>
	//    7   13:invokeinterface #292 <Method void List.clear()>
			((TransitionSet) (obj)).getTargets().addAll(((java.util.Collection) (arraylist1)));
	//    8   18:aload_0         
	//    9   19:invokevirtual   #289 <Method List TransitionSet.getTargets()>
	//   10   22:aload_2         
	//   11   23:invokeinterface #298 <Method boolean List.addAll(java.util.Collection)>
	//   12   28:pop             
			replaceTargets(obj, arraylist, arraylist1);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokestatic    #230 <Method void replaceTargets(Object, ArrayList, ArrayList)>
		}
	//   17   35:return          
	}

	public static Object wrapTransitionInSet(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			TransitionSet transitionset = new TransitionSet();
	//    4    6:new             #39  <Class TransitionSet>
	//    5    9:dup             
	//    6   10:invokespecial   #206 <Method void TransitionSet()>
	//    7   13:astore_1        
			transitionset.addTransition((Transition)obj);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:checkcast       #32  <Class Transition>
	//   11   19:invokevirtual   #210 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   12   22:pop             
			return ((Object) (transitionset));
	//   13   23:aload_1         
	//   14   24:areturn         
		}
	}


/*
	static String access$000(Map map, String s)
	{
		return findKeyForValue(map, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method String findKeyForValue(Map, String)>
	//    3    5:areturn         
	}

*/
}
