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
		if(obj != null) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:ifnonnull       10
_L1:
		return;
	//    5    9:return          
_L2:
		if(!(obj instanceof TransitionSet))
			break; /* Loop/switch isn't completed */
	//    6   10:aload_0         
	//    7   11:instanceof      #42  <Class TransitionSet>
	//    8   14:ifeq            50
		obj = ((Object) ((TransitionSet)obj));
	//    9   17:aload_0         
	//   10   18:checkcast       #42  <Class TransitionSet>
	//   11   21:astore_0        
		int k = ((TransitionSet) (obj)).getTransitionCount();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #46  <Method int TransitionSet.getTransitionCount()>
	//   14   26:istore_3        
		int i = 0;
	//   15   27:iconst_0        
	//   16   28:istore_2        
		while(i < k) 
	//*  17   29:iload_2         
	//*  18   30:iload_3         
	//*  19   31:icmpge          9
		{
			addTargets(((Object) (((TransitionSet) (obj)).getTransitionAt(i))), arraylist);
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #50  <Method Transition TransitionSet.getTransitionAt(int)>
	//   23   39:aload_1         
	//   24   40:invokestatic    #52  <Method void addTargets(Object, ArrayList)>
			i++;
	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
		}
		if(true) goto _L1; else goto _L3
	//   29   47:goto            29
_L3:
		if(!hasSimpleTarget(((Transition) (obj))) && isNullOrEmpty(((Transition) (obj)).getTargets()))
	//*  30   50:aload_0         
	//*  31   51:invokestatic    #56  <Method boolean hasSimpleTarget(Transition)>
	//*  32   54:ifne            9
	//*  33   57:aload_0         
	//*  34   58:invokevirtual   #60  <Method List Transition.getTargets()>
	//*  35   61:invokestatic    #64  <Method boolean isNullOrEmpty(List)>
	//*  36   64:ifeq            9
		{
			int l = arraylist.size();
	//   37   67:aload_1         
	//   38   68:invokevirtual   #69  <Method int ArrayList.size()>
	//   39   71:istore_3        
			int j = 0;
	//   40   72:iconst_0        
	//   41   73:istore_2        
			while(j < l) 
	//*  42   74:iload_2         
	//*  43   75:iload_3         
	//*  44   76:icmpge          9
			{
				((Transition) (obj)).addTarget((View)arraylist.get(j));
	//   45   79:aload_0         
	//   46   80:aload_1         
	//   47   81:iload_2         
	//   48   82:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   49   85:checkcast       #75  <Class View>
	//   50   88:invokevirtual   #38  <Method Transition Transition.addTarget(View)>
	//   51   91:pop             
				j++;
	//   52   92:iload_2         
	//   53   93:iconst_1        
	//   54   94:iadd            
	//   55   95:istore_2        
			}
		}
		if(true) goto _L1; else goto _L4
	//   56   96:goto            74
_L4:
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
		if(!containedBeforeIndex(list, view, k))
	//*   3    8:aload_0         
	//*   4    9:aload_1         
	//*   5   10:iload           4
	//*   6   12:invokestatic    #93  <Method boolean containedBeforeIndex(List, View, int)>
	//*   7   15:ifeq            19
	//*   8   18:return          
		{
			list.add(((Object) (view)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #97  <Method boolean List.add(Object)>
	//   12   26:pop             
			int i = k;
	//   13   27:iload           4
	//   14   29:istore_2        
			while(i < list.size()) 
	//*  15   30:iload_2         
	//*  16   31:aload_0         
	//*  17   32:invokeinterface #89  <Method int List.size()>
	//*  18   37:icmpge          18
			{
				view = (View)list.get(i);
	//   19   40:aload_0         
	//   20   41:iload_2         
	//   21   42:invokeinterface #98  <Method Object List.get(int)>
	//   22   47:checkcast       #75  <Class View>
	//   23   50:astore_1        
				if(view instanceof ViewGroup)
	//*  24   51:aload_1         
	//*  25   52:instanceof      #100 <Class ViewGroup>
	//*  26   55:ifeq            111
				{
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
	//*  55  108:goto            71
				i++;
	//   56  111:iload_2         
	//   57  112:iconst_1        
	//   58  113:iadd            
	//   59  114:istore_2        
			}
		}
	//*  60  115:goto            30
	}

	public static void captureTransitioningViews(ArrayList arraylist, View view)
	{
label0:
		{
			if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #113 <Method int View.getVisibility()>
	//*   2    4:ifne            32
			{
				if(!(view instanceof ViewGroup))
					break label0;
	//    3    7:aload_1         
	//    4    8:instanceof      #100 <Class ViewGroup>
	//    5   11:ifeq            61
				view = ((View) ((ViewGroup)view));
	//    6   14:aload_1         
	//    7   15:checkcast       #100 <Class ViewGroup>
	//    8   18:astore_1        
				if(((ViewGroup) (view)).isTransitionGroup())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #117 <Method boolean ViewGroup.isTransitionGroup()>
	//*  11   23:ifeq            33
				{
					arraylist.add(((Object) (view)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   15   31:pop             
				} else
	//*  16   32:return          
				{
					int j = ((ViewGroup) (view)).getChildCount();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #103 <Method int ViewGroup.getChildCount()>
	//   19   37:istore_3        
					int i = 0;
	//   20   38:iconst_0        
	//   21   39:istore_2        
					while(i < j) 
	//*  22   40:iload_2         
	//*  23   41:iload_3         
	//*  24   42:icmpge          32
					{
						captureTransitioningViews(arraylist, ((ViewGroup) (view)).getChildAt(i));
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:iload_2         
	//   28   48:invokevirtual   #107 <Method View ViewGroup.getChildAt(int)>
	//   29   51:invokestatic    #120 <Method void captureTransitioningViews(ArrayList, View)>
						i++;
	//   30   54:iload_2         
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:istore_2        
					}
				}
			}
			return;
		}
	//*  34   58:goto            40
		arraylist.add(((Object) (view)));
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   38   66:pop             
	//   39   67:return          
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
	//*   6   18:ifeq            54
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
	//*  15   41:ifeq            12
				return (String)entry.getKey();
	//   16   44:aload_2         
	//   17   45:invokeinterface #162 <Method Object java.util.Map$Entry.getKey()>
	//   18   50:checkcast       #156 <Class String>
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
	//*  12   18:ifnull          75
	//*  13   21:aload_1         
	//*  14   22:ifnull          75
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
	//*  25   45:aload_2         
	//*  26   46:ifnull          93
	//*  27   49:new             #42  <Class TransitionSet>
	//*  28   52:dup             
	//*  29   53:invokespecial   #209 <Method void TransitionSet()>
	//*  30   56:astore_1        
	//*  31   57:aload_0         
	//*  32   58:ifnull          67
	//*  33   61:aload_1         
	//*  34   62:aload_0         
	//*  35   63:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//*  36   66:pop             
	//*  37   67:aload_1         
	//*  38   68:aload_2         
	//*  39   69:invokevirtual   #213 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//*  40   72:pop             
	//*  41   73:aload_1         
	//*  42   74:areturn         
		if(obj == null)
	//*  43   75:aload_0         
	//*  44   76:ifnull          82
	//*  45   79:goto            45
		{
			obj = ((Object) (obj3));
	//   46   82:aload_3         
	//   47   83:astore_0        
			if(obj1 != null)
	//*  48   84:aload_1         
	//*  49   85:ifnull          45
				obj = obj1;
	//   50   88:aload_1         
	//   51   89:astore_0        
		}
		if(obj2 != null)
		{
			obj1 = ((Object) (new TransitionSet()));
			if(obj != null)
				((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
			((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
			return obj1;
		} else
	//*  52   90:goto            45
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

	public static ArrayList prepareSetNameOverridesReordered(ArrayList arraylist)
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
	//*   5    9:ifeq            48
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
	//*  16   28:icmpge          168
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
		} else
	//*  27   45:goto            25
		if(!hasSimpleTarget(((Transition) (obj))))
	//*  28   48:aload_0         
	//*  29   49:invokestatic    #56  <Method boolean hasSimpleTarget(Transition)>
	//*  30   52:ifne            168
		{
			List list = ((Transition) (obj)).getTargets();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #60  <Method List Transition.getTargets()>
	//   33   59:astore          5
			if(list != null && list.size() == arraylist.size() && list.containsAll(((java.util.Collection) (arraylist))))
	//*  34   61:aload           5
	//*  35   63:ifnull          168
	//*  36   66:aload           5
	//*  37   68:invokeinterface #89  <Method int List.size()>
	//*  38   73:aload_1         
	//*  39   74:invokevirtual   #69  <Method int ArrayList.size()>
	//*  40   77:icmpne          168
	//*  41   80:aload           5
	//*  42   82:aload_1         
	//*  43   83:invokeinterface #237 <Method boolean List.containsAll(java.util.Collection)>
	//*  44   88:ifeq            168
			{
				int j;
				int i1;
				if(arraylist1 == null)
	//*  45   91:aload_2         
	//*  46   92:ifnonnull       129
					j = 0;
	//   47   95:iconst_0        
	//   48   96:istore_3        
				else
	//*  49   97:iconst_0        
	//*  50   98:istore          4
	//*  51  100:iload           4
	//*  52  102:iload_3         
	//*  53  103:icmpge          137
	//*  54  106:aload_0         
	//*  55  107:aload_2         
	//*  56  108:iload           4
	//*  57  110:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//*  58  113:checkcast       #75  <Class View>
	//*  59  116:invokevirtual   #38  <Method Transition Transition.addTarget(View)>
	//*  60  119:pop             
	//*  61  120:iload           4
	//*  62  122:iconst_1        
	//*  63  123:iadd            
	//*  64  124:istore          4
	//*  65  126:goto            100
					j = arraylist1.size();
	//   66  129:aload_2         
	//   67  130:invokevirtual   #69  <Method int ArrayList.size()>
	//   68  133:istore_3        
				for(i1 = 0; i1 < j; i1++)
					((Transition) (obj)).addTarget((View)arraylist1.get(i1));

	//*  69  134:goto            97
				for(int k = arraylist.size() - 1; k >= 0; k--)
	//*  70  137:aload_1         
	//*  71  138:invokevirtual   #69  <Method int ArrayList.size()>
	//*  72  141:iconst_1        
	//*  73  142:isub            
	//*  74  143:istore_3        
	//*  75  144:iload_3         
	//*  76  145:iflt            168
					((Transition) (obj)).removeTarget((View)arraylist.get(k));
	//   77  148:aload_0         
	//   78  149:aload_1         
	//   79  150:iload_3         
	//   80  151:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   81  154:checkcast       #75  <Class View>
	//   82  157:invokevirtual   #229 <Method Transition Transition.removeTarget(View)>
	//   83  160:pop             

	//   84  161:iload_3         
	//   85  162:iconst_1        
	//   86  163:isub            
	//   87  164:istore_3        
			}
		}
	//*  88  165:goto            144
	//   89  168:return          
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
	//    5    7:invokespecial   #281 <Method void FragmentTransitionCompat21$4(ArrayList, Map)>
	//    6   10:invokestatic    #258 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static void setNameOverridesReordered(View view, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, Map map)
	{
		int i;
		int k;
		ArrayList arraylist3;
		k = arraylist1.size();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #69  <Method int ArrayList.size()>
	//    2    4:istore          7
		arraylist3 = new ArrayList();
	//    3    6:new             #66  <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #221 <Method void ArrayList()>
	//    6   13:astore          8
		i = 0;
	//    7   15:iconst_0        
	//    8   16:istore          5
_L2:
		String s;
		Object obj;
		if(i >= k)
			break MISSING_BLOCK_LABEL_135;
	//    9   18:iload           5
	//   10   20:iload           7
	//   11   22:icmpge          135
		obj = ((Object) ((View)arraylist.get(i)));
	//   12   25:aload_1         
	//   13   26:iload           5
	//   14   28:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #75  <Class View>
	//   16   34:astore          10
		s = ((View) (obj)).getTransitionName();
	//   17   36:aload           10
	//   18   38:invokevirtual   #169 <Method String View.getTransitionName()>
	//   19   41:astore          9
		arraylist3.add(((Object) (s)));
	//   20   43:aload           8
	//   21   45:aload           9
	//   22   47:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   23   50:pop             
		if(s != null)
			break; /* Loop/switch isn't completed */
	//   24   51:aload           9
	//   25   53:ifnonnull       65
_L3:
		i++;
	//   26   56:iload           5
	//   27   58:iconst_1        
	//   28   59:iadd            
	//   29   60:istore          5
		if(true) goto _L2; else goto _L1
	//   30   62:goto            18
_L1:
		int j;
		((View) (obj)).setTransitionName(((String) (null)));
	//   31   65:aload           10
	//   32   67:aconst_null     
	//   33   68:invokevirtual   #225 <Method void View.setTransitionName(String)>
		obj = ((Object) ((String)map.get(((Object) (s)))));
	//   34   71:aload           4
	//   35   73:aload           9
	//   36   75:invokeinterface #286 <Method Object Map.get(Object)>
	//   37   80:checkcast       #156 <Class String>
	//   38   83:astore          10
		j = 0;
	//   39   85:iconst_0        
	//   40   86:istore          6
_L4:
		if(j < k)
	//*  41   88:iload           6
	//*  42   90:iload           7
	//*  43   92:icmpge          56
		{
label0:
			{
				if(!((String) (obj)).equals(arraylist2.get(j)))
					break label0;
	//   44   95:aload           10
	//   45   97:aload_3         
	//   46   98:iload           6
	//   47  100:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   48  103:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   49  106:ifeq            126
				((View)arraylist1.get(j)).setTransitionName(s);
	//   50  109:aload_2         
	//   51  110:iload           6
	//   52  112:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   53  115:checkcast       #75  <Class View>
	//   54  118:aload           9
	//   55  120:invokevirtual   #225 <Method void View.setTransitionName(String)>
			}
		}
		  goto _L3
	//*  56  123:goto            56
		j++;
	//   57  126:iload           6
	//   58  128:iconst_1        
	//   59  129:iadd            
	//   60  130:istore          6
		  goto _L4
	//*  61  132:goto            88
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
	//   62  135:aload_0         
	//   63  136:new             #10  <Class FragmentTransitionCompat21$3>
	//   64  139:dup             
	//   65  140:iload           7
	//   66  142:aload_2         
	//   67  143:aload_3         
	//   68  144:aload_1         
	//   69  145:aload           8
	//   70  147:invokespecial   #289 <Method void FragmentTransitionCompat21$3(int, ArrayList, ArrayList, ArrayList, ArrayList)>
	//   71  150:invokestatic    #258 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   72  153:pop             
		return;
	//   73  154:return          
		  goto _L3
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
