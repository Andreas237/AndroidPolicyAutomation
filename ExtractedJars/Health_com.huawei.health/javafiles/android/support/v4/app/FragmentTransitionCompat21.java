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
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static void addTarget(Object obj, View view)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			((Transition)obj).addTarget(view);
	//    2    4:aload_0         
	//    3    5:checkcast       #35  <Class Transition>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #38  <Method Transition Transition.addTarget(View)>
	//    6   12:pop             
	//    7   13:return          
	}

	public static void addTargets(Object obj, ArrayList arraylist)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class Transition>
	//    2    4:astore_0        
		if(obj == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(obj instanceof TransitionSet)
	//*   6   10:aload_0         
	//*   7   11:instanceof      #42  <Class TransitionSet>
	//*   8   14:ifeq            51
		{
			obj = ((Object) ((TransitionSet)obj));
	//    9   17:aload_0         
	//   10   18:checkcast       #42  <Class TransitionSet>
	//   11   21:astore_0        
			int k = ((TransitionSet) (obj)).getTransitionCount();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #46  <Method int TransitionSet.getTransitionCount()>
	//   14   26:istore_3        
			for(int i = 0; i < k; i++)
	//*  15   27:iconst_0        
	//*  16   28:istore_2        
	//*  17   29:iload_2         
	//*  18   30:iload_3         
	//*  19   31:icmpge          50
				addTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist);
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #50  <Method Transition TransitionSet.getTransitionAt(int)>
	//   23   39:aload_1         
	//   24   40:invokestatic    #52  <Method void addTargets(Object, ArrayList)>

	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
	//*  29   47:goto            29
			return;
	//   30   50:return          
		}
		if(!hasSimpleTarget(((Transition) (obj))) && isNullOrEmpty(((Transition) (obj)).getTargets()))
	//*  31   51:aload_0         
	//*  32   52:invokestatic    #56  <Method boolean hasSimpleTarget(Transition)>
	//*  33   55:ifne            100
	//*  34   58:aload_0         
	//*  35   59:invokevirtual   #60  <Method List Transition.getTargets()>
	//*  36   62:invokestatic    #64  <Method boolean isNullOrEmpty(List)>
	//*  37   65:ifeq            100
		{
			int l = arraylist.size();
	//   38   68:aload_1         
	//   39   69:invokevirtual   #69  <Method int ArrayList.size()>
	//   40   72:istore_3        
			for(int j = 0; j < l; j++)
	//*  41   73:iconst_0        
	//*  42   74:istore_2        
	//*  43   75:iload_2         
	//*  44   76:iload_3         
	//*  45   77:icmpge          100
				((Transition) (obj)).addTarget((View)arraylist.get(j));
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:iload_2         
	//   49   83:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   50   86:checkcast       #75  <Class View>
	//   51   89:invokevirtual   #38  <Method Transition Transition.addTarget(View)>
	//   52   92:pop             

	//   53   93:iload_2         
	//   54   94:iconst_1        
	//   55   95:iadd            
	//   56   96:istore_2        
		}
	//*  57   97:goto            75
	//   58  100:return          
	}

	public static void beginDelayedTransition(ViewGroup viewgroup, Object obj)
	{
		TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Transition>
	//    3    5:invokestatic    #84  <Method void TransitionManager.beginDelayedTransition(ViewGroup, Transition)>
	//    4    8:return          
	}

	private static void bfsAddViewChildren(List list, View view)
	{
		int k = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #89  <Method int List.size()>
	//    2    6:istore          4
		if(containedBeforeIndex(list, view, k))
	//*   3    8:aload_0         
	//*   4    9:aload_1         
	//*   5   10:iload           4
	//*   6   12:invokestatic    #93  <Method boolean containedBeforeIndex(List, View, int)>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		list.add(((Object) (view)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #97  <Method boolean List.add(Object)>
	//   12   26:pop             
		for(int i = k; i < list.size(); i++)
	//*  13   27:iload           4
	//*  14   29:istore_2        
	//*  15   30:iload_2         
	//*  16   31:aload_0         
	//*  17   32:invokeinterface #89  <Method int List.size()>
	//*  18   37:icmpge          118
		{
			view = (View)list.get(i);
	//   19   40:aload_0         
	//   20   41:iload_2         
	//   21   42:invokeinterface #98  <Method Object List.get(int)>
	//   22   47:checkcast       #75  <Class View>
	//   23   50:astore_1        
			if(!(view instanceof ViewGroup))
				continue;
	//   24   51:aload_1         
	//   25   52:instanceof      #100 <Class ViewGroup>
	//   26   55:ifeq            111
			view = ((View) ((ViewGroup)view));
	//   27   58:aload_1         
	//   28   59:checkcast       #100 <Class ViewGroup>
	//   29   62:astore_1        
			int l = ((ViewGroup) (view)).getChildCount();
	//   30   63:aload_1         
	//   31   64:invokevirtual   #103 <Method int ViewGroup.getChildCount()>
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
	//   40   79:invokevirtual   #107 <Method View ViewGroup.getChildAt(int)>
	//   41   82:astore          6
				if(!containedBeforeIndex(list, view1, k))
	//*  42   84:aload_0         
	//*  43   85:aload           6
	//*  44   87:iload           4
	//*  45   89:invokestatic    #93  <Method boolean containedBeforeIndex(List, View, int)>
	//*  46   92:ifne            104
					list.add(((Object) (view1)));
	//   47   95:aload_0         
	//   48   96:aload           6
	//   49   98:invokeinterface #97  <Method boolean List.add(Object)>
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
		if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #113 <Method int View.getVisibility()>
	//*   2    4:ifne            70
		{
			if(view instanceof ViewGroup)
	//*   3    7:aload_1         
	//*   4    8:instanceof      #100 <Class ViewGroup>
	//*   5   11:ifeq            64
			{
				view = ((View) ((ViewGroup)view));
	//    6   14:aload_1         
	//    7   15:checkcast       #100 <Class ViewGroup>
	//    8   18:astore_1        
				if(((ViewGroup) (view)).isTransitionGroup())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #117 <Method boolean ViewGroup.isTransitionGroup()>
	//*  11   23:ifeq            35
				{
					arraylist.add(((Object) (view)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   15   31:pop             
				} else
	//*  16   32:goto            63
				{
					int j = ((ViewGroup) (view)).getChildCount();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #103 <Method int ViewGroup.getChildCount()>
	//   19   39:istore_3        
					for(int i = 0; i < j; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iload_3         
	//*  24   44:icmpge          63
						captureTransitioningViews(arraylist, ((ViewGroup) (view)).getChildAt(i));
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:iload_2         
	//   28   50:invokevirtual   #107 <Method View ViewGroup.getChildAt(int)>
	//   29   53:invokestatic    #120 <Method void captureTransitioningViews(ArrayList, View)>

	//   30   56:iload_2         
	//   31   57:iconst_1        
	//   32   58:iadd            
	//   33   59:istore_2        
				}
	//*  34   60:goto            42
				return;
	//   35   63:return          
			}
			arraylist.add(((Object) (view)));
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   39   69:pop             
		}
	//   40   70:return          
	}

	public static Object cloneTransition(Object obj)
	{
		Transition transition = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(obj != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          14
			transition = ((Transition)obj).clone();
	//    4    6:aload_0         
	//    5    7:checkcast       #35  <Class Transition>
	//    6   10:invokevirtual   #127 <Method Transition Transition.clone()>
	//    7   13:astore_1        
		return ((Object) (transition));
	//    8   14:aload_1         
	//    9   15:areturn         
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
	//*   7    9:invokeinterface #98  <Method Object List.get(int)>
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
	//*   1    1:invokeinterface #134 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #140 <Method Iterator Set.iterator()>
	//*   3   11:astore_0        
	//*   4   12:aload_0         
	//*   5   13:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            57
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_0         
	//    8   22:invokeinterface #149 <Method Object Iterator.next()>
	//    9   27:checkcast       #151 <Class java.util.Map$Entry>
	//   10   30:astore_2        
			if(s.equals(entry.getValue()))
	//*  11   31:aload_1         
	//*  12   32:aload_2         
	//*  13   33:invokeinterface #154 <Method Object java.util.Map$Entry.getValue()>
	//*  14   38:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  15   41:ifeq            54
				return (String)entry.getKey();
	//   16   44:aload_2         
	//   17   45:invokeinterface #162 <Method Object java.util.Map$Entry.getKey()>
	//   18   50:checkcast       #156 <Class String>
	//   19   53:areturn         
		}

	//*  20   54:goto            12
		return null;
	//   21   57:aconst_null     
	//   22   58:areturn         
	}

	public static void findNamedViews(Map map, View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #113 <Method int View.getVisibility()>
	//*   2    4:ifne            68
		{
			String s = view.getTransitionName();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #169 <Method String View.getTransitionName()>
	//    5   11:astore          4
			if(s != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          28
				map.put(((Object) (s)), ((Object) (view)));
	//    8   18:aload_0         
	//    9   19:aload           4
	//   10   21:aload_1         
	//   11   22:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//   12   27:pop             
			if(view instanceof ViewGroup)
	//*  13   28:aload_1         
	//*  14   29:instanceof      #100 <Class ViewGroup>
	//*  15   32:ifeq            68
			{
				view = ((View) ((ViewGroup)view));
	//   16   35:aload_1         
	//   17   36:checkcast       #100 <Class ViewGroup>
	//   18   39:astore_1        
				int j = ((ViewGroup) (view)).getChildCount();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #103 <Method int ViewGroup.getChildCount()>
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
	//   30   55:invokevirtual   #107 <Method View ViewGroup.getChildAt(int)>
	//   31   58:invokestatic    #175 <Method void findNamedViews(Map, View)>

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
	//    5    6:invokevirtual   #182 <Method void View.getLocationOnScreen(int[])>
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
	//   17   20:invokevirtual   #185 <Method int View.getWidth()>
	//   18   23:iadd            
	//   19   24:aload_2         
	//   20   25:iconst_1        
	//   21   26:iaload          
	//   22   27:aload_0         
	//   23   28:invokevirtual   #188 <Method int View.getHeight()>
	//   24   31:iadd            
	//   25   32:invokevirtual   #194 <Method void Rect.set(int, int, int, int)>
	//   26   35:return          
	}

	private static boolean hasSimpleTarget(Transition transition)
	{
		return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method List Transition.getTargetIds()>
	//    2    4:invokestatic    #64  <Method boolean isNullOrEmpty(List)>
	//    3    7:ifeq            30
	//    4   10:aload_0         
	//    5   11:invokevirtual   #200 <Method List Transition.getTargetNames()>
	//    6   14:invokestatic    #64  <Method boolean isNullOrEmpty(List)>
	//    7   17:ifeq            30
	//    8   20:aload_0         
	//    9   21:invokevirtual   #203 <Method List Transition.getTargetTypes()>
	//   10   24:invokestatic    #64  <Method boolean isNullOrEmpty(List)>
	//   11   27:ifne            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private static boolean isNullOrEmpty(List list)
	{
		return list == null || list.isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokeinterface #206 <Method boolean List.isEmpty()>
	//    4   10:ifeq            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static Object mergeTransitionsInSequence(Object obj, Object obj1, Object obj2)
	{
		Object obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj = ((Object) ((Transition)obj));
	//    2    2:aload_0         
	//    3    3:checkcast       #35  <Class Transition>
	//    4    6:astore_0        
		obj1 = ((Object) ((Transition)obj1));
	//    5    7:aload_1         
	//    6    8:checkcast       #35  <Class Transition>
	//    7   11:astore_1        
		obj2 = ((Object) ((Transition)obj2));
	//    8   12:aload_2         
	//    9   13:checkcast       #35  <Class Transition>
	//   10   16:astore_2        
		if(obj != null && obj1 != null)
	//*  11   17:aload_0         
	//*  12   18:ifnull          48
	//*  13   21:aload_1         
	//*  14   22:ifnull          48
			obj = ((Object) ((new TransitionSet()).addTransition(((Transition) (obj))).addTransition(((Transition) (obj1))).setOrdering(1)));
	//   15   25:new             #42  <Class TransitionSet>
	//   16   28:dup             
	//   17   29:invokespecial   #209 <Method void TransitionSet()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #217 <Method TransitionSet TransitionSet.setOrdering(int)>
	//   24   44:astore_0        
		else
	//*  25   45:goto            63
		if(obj == null)
	//*  26   48:aload_0         
	//*  27   49:ifnull          55
	//*  28   52:goto            63
		{
			obj = ((Object) (obj3));
	//   29   55:aload_3         
	//   30   56:astore_0        
			if(obj1 != null)
	//*  31   57:aload_1         
	//*  32   58:ifnull          63
				obj = obj1;
	//   33   61:aload_1         
	//   34   62:astore_0        
		}
		if(obj2 != null)
	//*  35   63:aload_2         
	//*  36   64:ifnull          93
		{
			obj1 = ((Object) (new TransitionSet()));
	//   37   67:new             #42  <Class TransitionSet>
	//   38   70:dup             
	//   39   71:invokespecial   #209 <Method void TransitionSet()>
	//   40   74:astore_1        
			if(obj != null)
	//*  41   75:aload_0         
	//*  42   76:ifnull          85
				((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
	//   43   79:aload_1         
	//   44   80:aload_0         
	//   45   81:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   46   84:pop             
			((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
	//   47   85:aload_1         
	//   48   86:aload_2         
	//   49   87:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   50   90:pop             
			return obj1;
	//   51   91:aload_1         
	//   52   92:areturn         
		} else
		{
			return obj;
	//   53   93:aload_0         
	//   54   94:areturn         
		}
	}

	public static Object mergeTransitionsTogether(Object obj, Object obj1, Object obj2)
	{
		TransitionSet transitionset = new TransitionSet();
	//    0    0:new             #42  <Class TransitionSet>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void TransitionSet()>
	//    3    7:astore_3        
		if(obj != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          21
			transitionset.addTransition((Transition)obj);
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:checkcast       #35  <Class Transition>
	//    9   17:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   10   20:pop             
		if(obj1 != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          34
			transitionset.addTransition((Transition)obj1);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:checkcast       #35  <Class Transition>
	//   16   30:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   17   33:pop             
		if(obj2 != null)
	//*  18   34:aload_2         
	//*  19   35:ifnull          47
			transitionset.addTransition((Transition)obj2);
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:checkcast       #35  <Class Transition>
	//   23   43:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   24   46:pop             
		return ((Object) (transitionset));
	//   25   47:aload_3         
	//   26   48:areturn         
	}

	public static ArrayList prepareSetNameOverridesOptimized(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #66  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void ArrayList()>
	//    3    7:astore_3        
		int j = arraylist.size();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method int ArrayList.size()>
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
	//   14   22:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #75  <Class View>
	//   16   28:astore          4
			arraylist1.add(((Object) (view.getTransitionName())));
	//   17   30:aload_3         
	//   18   31:aload           4
	//   19   33:invokevirtual   #169 <Method String View.getTransitionName()>
	//   20   36:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   21   39:pop             
			view.setTransitionName(((String) (null)));
	//   22   40:aload           4
	//   23   42:aconst_null     
	//   24   43:invokevirtual   #225 <Method void View.setTransitionName(String)>
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
	//    3    5:checkcast       #35  <Class Transition>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #229 <Method Transition Transition.removeTarget(View)>
	//    6   12:pop             
	//    7   13:return          
	}

	public static void replaceTargets(Object obj, ArrayList arraylist, ArrayList arraylist1)
	{
		obj = ((Object) ((Transition)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class Transition>
	//    2    4:astore_0        
		if(obj instanceof TransitionSet)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #42  <Class TransitionSet>
	//*   5    9:ifeq            49
		{
			obj = ((Object) ((TransitionSet)obj));
	//    6   12:aload_0         
	//    7   13:checkcast       #42  <Class TransitionSet>
	//    8   16:astore_0        
			int l = ((TransitionSet) (obj)).getTransitionCount();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #46  <Method int TransitionSet.getTransitionCount()>
	//   11   21:istore          4
			for(int i = 0; i < l; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_3        
	//*  14   25:iload_3         
	//*  15   26:iload           4
	//*  16   28:icmpge          48
				replaceTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist, arraylist1);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:invokevirtual   #50  <Method Transition TransitionSet.getTransitionAt(int)>
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokestatic    #233 <Method void replaceTargets(Object, ArrayList, ArrayList)>

	//   23   41:iload_3         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_3        
	//*  27   45:goto            25
			return;
	//   28   48:return          
		}
		if(!hasSimpleTarget(((Transition) (obj))))
	//*  29   49:aload_0         
	//*  30   50:invokestatic    #56  <Method boolean hasSimpleTarget(Transition)>
	//*  31   53:ifne            169
		{
			List list = ((Transition) (obj)).getTargets();
	//   32   56:aload_0         
	//   33   57:invokevirtual   #60  <Method List Transition.getTargets()>
	//   34   60:astore          5
			if(list != null && list.size() == arraylist.size() && list.containsAll(((java.util.Collection) (arraylist))))
	//*  35   62:aload           5
	//*  36   64:ifnull          169
	//*  37   67:aload           5
	//*  38   69:invokeinterface #89  <Method int List.size()>
	//*  39   74:aload_1         
	//*  40   75:invokevirtual   #69  <Method int ArrayList.size()>
	//*  41   78:icmpne          169
	//*  42   81:aload           5
	//*  43   83:aload_1         
	//*  44   84:invokeinterface #237 <Method boolean List.containsAll(java.util.Collection)>
	//*  45   89:ifeq            169
			{
				int j;
				if(arraylist1 == null)
	//*  46   92:aload_2         
	//*  47   93:ifnonnull       101
					j = 0;
	//   48   96:iconst_0        
	//   49   97:istore_3        
				else
	//*  50   98:goto            106
					j = arraylist1.size();
	//   51  101:aload_2         
	//   52  102:invokevirtual   #69  <Method int ArrayList.size()>
	//   53  105:istore_3        
				for(int i1 = 0; i1 < j; i1++)
	//*  54  106:iconst_0        
	//*  55  107:istore          4
	//*  56  109:iload           4
	//*  57  111:iload_3         
	//*  58  112:icmpge          138
					((Transition) (obj)).addTarget((View)arraylist1.get(i1));
	//   59  115:aload_0         
	//   60  116:aload_2         
	//   61  117:iload           4
	//   62  119:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   63  122:checkcast       #75  <Class View>
	//   64  125:invokevirtual   #38  <Method Transition Transition.addTarget(View)>
	//   65  128:pop             

	//   66  129:iload           4
	//   67  131:iconst_1        
	//   68  132:iadd            
	//   69  133:istore          4
	//*  70  135:goto            109
				for(int k = arraylist.size() - 1; k >= 0; k--)
	//*  71  138:aload_1         
	//*  72  139:invokevirtual   #69  <Method int ArrayList.size()>
	//*  73  142:iconst_1        
	//*  74  143:isub            
	//*  75  144:istore_3        
	//*  76  145:iload_3         
	//*  77  146:iflt            169
					((Transition) (obj)).removeTarget((View)arraylist.get(k));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:iload_3         
	//   81  152:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   82  155:checkcast       #75  <Class View>
	//   83  158:invokevirtual   #229 <Method Transition Transition.removeTarget(View)>
	//   84  161:pop             

	//   85  162:iload_3         
	//   86  163:iconst_1        
	//   87  164:isub            
	//   88  165:istore_3        
			}
		}
	//*  89  166:goto            145
	//   90  169:return          
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
	//    1    1:checkcast       #35  <Class Transition>
	//    2    4:new             #8   <Class FragmentTransitionCompat21$2>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #243 <Method void FragmentTransitionCompat21$2(View, ArrayList)>
	//    7   13:invokevirtual   #247 <Method Transition Transition.addListener(android.transition.Transition$TransitionListener)>
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
	//    5    7:invokespecial   #253 <Method void FragmentTransitionCompat21$7(ArrayList, Map)>
	//    6   10:invokestatic    #258 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
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
	//    1    1:checkcast       #35  <Class Transition>
	//    2    4:new             #14  <Class FragmentTransitionCompat21$5>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:invokespecial   #264 <Method void FragmentTransitionCompat21$5(Object, ArrayList, Object, ArrayList, Object, ArrayList)>
	//   11   20:invokevirtual   #247 <Method Transition Transition.addListener(android.transition.Transition$TransitionListener)>
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
					if(epicenter == null || epicenter.isEmpty())
				//*   0    0:aload_0         
				//*   1    1:getfield        #15  <Field Rect val$epicenter>
				//*   2    4:ifnull          17
				//*   3    7:aload_0         
				//*   4    8:getfield        #15  <Field Rect val$epicenter>
				//*   5   11:invokevirtual   #27  <Method boolean Rect.isEmpty()>
				//*   6   14:ifeq            19
						return null;
				//    7   17:aconst_null     
				//    8   18:areturn         
					else
						return epicenter;
				//    9   19:aload_0         
				//   10   20:getfield        #15  <Field Rect val$epicenter>
				//   11   23:areturn         
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
	//    3    5:checkcast       #35  <Class Transition>
	//    4    8:new             #16  <Class FragmentTransitionCompat21$6>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #270 <Method void FragmentTransitionCompat21$6(Rect)>
	//    8   16:invokevirtual   #274 <Method void Transition.setEpicenterCallback(android.transition.Transition$EpicenterCallback)>
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
	//    3    5:checkcast       #35  <Class Transition>
	//    4    8:astore_0        
			Rect rect = new Rect();
	//    5    9:new             #190 <Class Rect>
	//    6   12:dup             
	//    7   13:invokespecial   #275 <Method void Rect()>
	//    8   16:astore_2        
			getBoundsOnScreen(view, rect);
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokestatic    #277 <Method void getBoundsOnScreen(View, Rect)>
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
	//   16   28:invokespecial   #278 <Method void FragmentTransitionCompat21$1(Rect)>
	//   17   31:invokevirtual   #274 <Method void Transition.setEpicenterCallback(android.transition.Transition$EpicenterCallback)>
		}
	//   18   34:return          
	}

	public static void setNameOverridesOptimized(View view, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, Map map)
	{
		int k = arraylist1.size();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #69  <Method int ArrayList.size()>
	//    2    4:istore          7
		ArrayList arraylist3 = new ArrayList();
	//    3    6:new             #66  <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #221 <Method void ArrayList()>
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
	//   14   28:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #75  <Class View>
	//   16   34:astore          10
			String s = ((View) (obj)).getTransitionName();
	//   17   36:aload           10
	//   18   38:invokevirtual   #169 <Method String View.getTransitionName()>
	//   19   41:astore          9
			arraylist3.add(((Object) (s)));
	//   20   43:aload           8
	//   21   45:aload           9
	//   22   47:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   23   50:pop             
			if(s == null)
	//*  24   51:aload           9
	//*  25   53:ifnonnull       59
				continue;
	//   26   56:goto            129
			((View) (obj)).setTransitionName(((String) (null)));
	//   27   59:aload           10
	//   28   61:aconst_null     
	//   29   62:invokevirtual   #225 <Method void View.setTransitionName(String)>
			obj = ((Object) ((String)map.get(((Object) (s)))));
	//   30   65:aload           4
	//   31   67:aload           9
	//   32   69:invokeinterface #282 <Method Object Map.get(Object)>
	//   33   74:checkcast       #156 <Class String>
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
	//*  43   94:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//*  44   97:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  45  100:ifeq            120
				{
					((View)arraylist1.get(j)).setTransitionName(s);
	//   46  103:aload_2         
	//   47  104:iload           6
	//   48  106:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   49  109:checkcast       #75  <Class View>
	//   50  112:aload           9
	//   51  114:invokevirtual   #225 <Method void View.setTransitionName(String)>
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
	//   71  150:invokespecial   #285 <Method void FragmentTransitionCompat21$3(int, ArrayList, ArrayList, ArrayList, ArrayList)>
	//   72  153:invokestatic    #258 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   73  156:pop             
	//   74  157:return          
	}

	public static void setNameOverridesUnoptimized(View view, ArrayList arraylist, Map map)
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
	//    5    7:invokespecial   #289 <Method void FragmentTransitionCompat21$4(ArrayList, Map)>
	//    6   10:invokestatic    #258 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static void setSharedElementTargets(Object obj, View view, ArrayList arraylist)
	{
		obj = ((Object) ((TransitionSet)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #42  <Class TransitionSet>
	//    2    4:astore_0        
		List list = ((TransitionSet) (obj)).getTargets();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #292 <Method List TransitionSet.getTargets()>
	//    5    9:astore          5
		list.clear();
	//    6   11:aload           5
	//    7   13:invokeinterface #295 <Method void List.clear()>
		int j = arraylist.size();
	//    8   18:aload_2         
	//    9   19:invokevirtual   #69  <Method int ArrayList.size()>
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
	//   19   36:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   20   39:checkcast       #75  <Class View>
	//   21   42:invokestatic    #297 <Method void bfsAddViewChildren(List, View)>

	//   22   45:iload_3         
	//   23   46:iconst_1        
	//   24   47:iadd            
	//   25   48:istore_3        
	//*  26   49:goto            26
		list.add(((Object) (view)));
	//   27   52:aload           5
	//   28   54:aload_1         
	//   29   55:invokeinterface #97  <Method boolean List.add(Object)>
	//   30   60:pop             
		arraylist.add(((Object) (view)));
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   34   66:pop             
		addTargets(obj, arraylist);
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:invokestatic    #52  <Method void addTargets(Object, ArrayList)>
	//   38   72:return          
	}

	public static void swapSharedElementTargets(Object obj, ArrayList arraylist, ArrayList arraylist1)
	{
		obj = ((Object) ((TransitionSet)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #42  <Class TransitionSet>
	//    2    4:astore_0        
		if(obj != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          35
		{
			((TransitionSet) (obj)).getTargets().clear();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #292 <Method List TransitionSet.getTargets()>
	//    7   13:invokeinterface #295 <Method void List.clear()>
			((TransitionSet) (obj)).getTargets().addAll(((java.util.Collection) (arraylist1)));
	//    8   18:aload_0         
	//    9   19:invokevirtual   #292 <Method List TransitionSet.getTargets()>
	//   10   22:aload_2         
	//   11   23:invokeinterface #301 <Method boolean List.addAll(java.util.Collection)>
	//   12   28:pop             
			replaceTargets(obj, arraylist, arraylist1);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokestatic    #233 <Method void replaceTargets(Object, ArrayList, ArrayList)>
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
	//    4    6:new             #42  <Class TransitionSet>
	//    5    9:dup             
	//    6   10:invokespecial   #209 <Method void TransitionSet()>
	//    7   13:astore_1        
			transitionset.addTransition((Transition)obj);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:checkcast       #35  <Class Transition>
	//   11   19:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
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
	//    2    2:invokestatic    #31  <Method String findKeyForValue(Map, String)>
	//    3    5:areturn         
	}

*/
}
