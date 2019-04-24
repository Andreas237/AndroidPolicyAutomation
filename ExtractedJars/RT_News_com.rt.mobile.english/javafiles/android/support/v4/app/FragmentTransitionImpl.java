// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.view.View;
import android.view.ViewGroup;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			OneShotPreDrawListener

public abstract class FragmentTransitionImpl
{

	public FragmentTransitionImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	protected static void bfsAddViewChildren(List list, View view)
	{
		int k = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #27  <Method int List.size()>
	//    2    6:istore          4
		if(containedBeforeIndex(list, view, k))
	//*   3    8:aload_0         
	//*   4    9:aload_1         
	//*   5   10:iload           4
	//*   6   12:invokestatic    #31  <Method boolean containedBeforeIndex(List, View, int)>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		list.add(((Object) (view)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #35  <Method boolean List.add(Object)>
	//   12   26:pop             
		for(int i = k; i < list.size(); i++)
	//*  13   27:iload           4
	//*  14   29:istore_2        
	//*  15   30:iload_2         
	//*  16   31:aload_0         
	//*  17   32:invokeinterface #27  <Method int List.size()>
	//*  18   37:icmpge          118
		{
			view = (View)list.get(i);
	//   19   40:aload_0         
	//   20   41:iload_2         
	//   21   42:invokeinterface #39  <Method Object List.get(int)>
	//   22   47:checkcast       #41  <Class View>
	//   23   50:astore_1        
			if(!(view instanceof ViewGroup))
				continue;
	//   24   51:aload_1         
	//   25   52:instanceof      #43  <Class ViewGroup>
	//   26   55:ifeq            111
			view = ((View) ((ViewGroup)view));
	//   27   58:aload_1         
	//   28   59:checkcast       #43  <Class ViewGroup>
	//   29   62:astore_1        
			int l = ((ViewGroup) (view)).getChildCount();
	//   30   63:aload_1         
	//   31   64:invokevirtual   #46  <Method int ViewGroup.getChildCount()>
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
	//   40   79:invokevirtual   #50  <Method View ViewGroup.getChildAt(int)>
	//   41   82:astore          6
				if(!containedBeforeIndex(list, view1, k))
	//*  42   84:aload_0         
	//*  43   85:aload           6
	//*  44   87:iload           4
	//*  45   89:invokestatic    #31  <Method boolean containedBeforeIndex(List, View, int)>
	//*  46   92:ifne            104
					list.add(((Object) (view1)));
	//   47   95:aload_0         
	//   48   96:aload           6
	//   49   98:invokeinterface #35  <Method boolean List.add(Object)>
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
	//*   7    9:invokeinterface #39  <Method Object List.get(int)>
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

	static String findKeyForValue(Map map, String s)
	{
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #61  <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #67  <Method Iterator Set.iterator()>
	//*   3   11:astore_0        
	//*   4   12:aload_0         
	//*   5   13:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            54
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_0         
	//    8   22:invokeinterface #77  <Method Object Iterator.next()>
	//    9   27:checkcast       #79  <Class java.util.Map$Entry>
	//   10   30:astore_2        
			if(s.equals(entry.getValue()))
	//*  11   31:aload_1         
	//*  12   32:aload_2         
	//*  13   33:invokeinterface #82  <Method Object java.util.Map$Entry.getValue()>
	//*  14   38:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  15   41:ifeq            12
				return (String)entry.getKey();
	//   16   44:aload_2         
	//   17   45:invokeinterface #90  <Method Object java.util.Map$Entry.getKey()>
	//   18   50:checkcast       #84  <Class String>
	//   19   53:areturn         
		}

		return null;
	//   20   54:aconst_null     
	//   21   55:areturn         
	}

	protected static boolean isNullOrEmpty(List list)
	{
		return list == null || list.isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:aload_0         
	//    3    5:invokeinterface #96  <Method boolean List.isEmpty()>
	//    4   10:ifeq            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public abstract void addTarget(Object obj, View view);

	public abstract void addTargets(Object obj, ArrayList arraylist);

	public abstract void beginDelayedTransition(ViewGroup viewgroup, Object obj);

	public abstract boolean canHandle(Object obj);

	void captureTransitioningViews(ArrayList arraylist, View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #108 <Method int View.getVisibility()>
	//*   2    4:ifne            70
			if(view instanceof ViewGroup)
	//*   3    7:aload_2         
	//*   4    8:instanceof      #43  <Class ViewGroup>
	//*   5   11:ifeq            64
			{
				view = ((View) ((ViewGroup)view));
	//    6   14:aload_2         
	//    7   15:checkcast       #43  <Class ViewGroup>
	//    8   18:astore_2        
				if(ViewGroupCompat.isTransitionGroup(((ViewGroup) (view))))
	//*   9   19:aload_2         
	//*  10   20:invokestatic    #114 <Method boolean ViewGroupCompat.isTransitionGroup(ViewGroup)>
	//*  11   23:ifeq            33
				{
					arraylist.add(((Object) (view)));
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   15   31:pop             
					return;
	//   16   32:return          
				}
				int j = ((ViewGroup) (view)).getChildCount();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #46  <Method int ViewGroup.getChildCount()>
	//   19   37:istore          4
				for(int i = 0; i < j; i++)
	//*  20   39:iconst_0        
	//*  21   40:istore_3        
	//*  22   41:iload_3         
	//*  23   42:iload           4
	//*  24   44:icmpge          70
					captureTransitioningViews(arraylist, ((ViewGroup) (view)).getChildAt(i));
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:iload_3         
	//   29   51:invokevirtual   #50  <Method View ViewGroup.getChildAt(int)>
	//   30   54:invokevirtual   #119 <Method void captureTransitioningViews(ArrayList, View)>

	//   31   57:iload_3         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_3        
			} else
	//*  35   61:goto            41
			{
				arraylist.add(((Object) (view)));
	//   36   64:aload_1         
	//   37   65:aload_2         
	//   38   66:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   39   69:pop             
			}
	//   40   70:return          
	}

	public abstract Object cloneTransition(Object obj);

	void findNamedViews(Map map, View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #108 <Method int View.getVisibility()>
	//*   2    4:ifne            71
		{
			String s = ViewCompat.getTransitionName(view);
	//    3    7:aload_2         
	//    4    8:invokestatic    #130 <Method String ViewCompat.getTransitionName(View)>
	//    5   11:astore          5
			if(s != null)
	//*   6   13:aload           5
	//*   7   15:ifnull          28
				map.put(((Object) (s)), ((Object) (view)));
	//    8   18:aload_1         
	//    9   19:aload           5
	//   10   21:aload_2         
	//   11   22:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   12   27:pop             
			if(view instanceof ViewGroup)
	//*  13   28:aload_2         
	//*  14   29:instanceof      #43  <Class ViewGroup>
	//*  15   32:ifeq            71
			{
				view = ((View) ((ViewGroup)view));
	//   16   35:aload_2         
	//   17   36:checkcast       #43  <Class ViewGroup>
	//   18   39:astore_2        
				int j = ((ViewGroup) (view)).getChildCount();
	//   19   40:aload_2         
	//   20   41:invokevirtual   #46  <Method int ViewGroup.getChildCount()>
	//   21   44:istore          4
				for(int i = 0; i < j; i++)
	//*  22   46:iconst_0        
	//*  23   47:istore_3        
	//*  24   48:iload_3         
	//*  25   49:iload           4
	//*  26   51:icmpge          71
					findNamedViews(map, ((ViewGroup) (view)).getChildAt(i));
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:aload_2         
	//   30   57:iload_3         
	//   31   58:invokevirtual   #50  <Method View ViewGroup.getChildAt(int)>
	//   32   61:invokevirtual   #136 <Method void findNamedViews(Map, View)>

	//   33   64:iload_3         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_3        
			}
		}
	//*  37   68:goto            48
	//   38   71:return          
	}

	protected void getBoundsOnScreen(View view, Rect rect)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_3        
		view.getLocationOnScreen(ai);
	//    3    4:aload_1         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #143 <Method void View.getLocationOnScreen(int[])>
		rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:iconst_0        
	//    9   12:iaload          
	//   10   13:aload_3         
	//   11   14:iconst_1        
	//   12   15:iaload          
	//   13   16:aload_3         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:aload_1         
	//   17   20:invokevirtual   #146 <Method int View.getWidth()>
	//   18   23:iadd            
	//   19   24:aload_3         
	//   20   25:iconst_1        
	//   21   26:iaload          
	//   22   27:aload_1         
	//   23   28:invokevirtual   #149 <Method int View.getHeight()>
	//   24   31:iadd            
	//   25   32:invokevirtual   #155 <Method void Rect.set(int, int, int, int)>
	//   26   35:return          
	}

	public abstract Object mergeTransitionsInSequence(Object obj, Object obj1, Object obj2);

	public abstract Object mergeTransitionsTogether(Object obj, Object obj1, Object obj2);

	ArrayList prepareSetNameOverridesReordered(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #116 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void ArrayList()>
	//    3    7:astore          4
		int j = arraylist.size();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #162 <Method int ArrayList.size()>
	//    6   13:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:iload_3         
	//*  11   18:icmpge          55
		{
			View view = (View)arraylist.get(i);
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #163 <Method Object ArrayList.get(int)>
	//   15   26:checkcast       #41  <Class View>
	//   16   29:astore          5
			arraylist1.add(((Object) (ViewCompat.getTransitionName(view))));
	//   17   31:aload           4
	//   18   33:aload           5
	//   19   35:invokestatic    #130 <Method String ViewCompat.getTransitionName(View)>
	//   20   38:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   21   41:pop             
			ViewCompat.setTransitionName(view, ((String) (null)));
	//   22   42:aload           5
	//   23   44:aconst_null     
	//   24   45:invokestatic    #167 <Method void ViewCompat.setTransitionName(View, String)>
		}

	//   25   48:iload_2         
	//   26   49:iconst_1        
	//   27   50:iadd            
	//   28   51:istore_2        
	//*  29   52:goto            16
		return arraylist1;
	//   30   55:aload           4
	//   31   57:areturn         
	}

	public abstract void removeTarget(Object obj, View view);

	public abstract void replaceTargets(Object obj, ArrayList arraylist, ArrayList arraylist1);

	public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList arraylist);

	void scheduleNameReset(ViewGroup viewgroup, final ArrayList sharedElementsIn, final Map nameOverrides)
	{
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable() {

			public void run()
			{
				int j = sharedElementsIn.size();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ArrayList val$sharedElementsIn>
			//    2    4:invokevirtual   #36  <Method int ArrayList.size()>
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
			//   10   16:getfield        #23  <Field ArrayList val$sharedElementsIn>
			//   11   19:iload_1         
			//   12   20:invokevirtual   #40  <Method Object ArrayList.get(int)>
			//   13   23:checkcast       #42  <Class View>
			//   14   26:astore_3        
					String s = ViewCompat.getTransitionName(view);
			//   15   27:aload_3         
			//   16   28:invokestatic    #48  <Method String ViewCompat.getTransitionName(View)>
			//   17   31:astore          4
					ViewCompat.setTransitionName(view, (String)nameOverrides.get(((Object) (s))));
			//   18   33:aload_3         
			//   19   34:aload_0         
			//   20   35:getfield        #25  <Field Map val$nameOverrides>
			//   21   38:aload           4
			//   22   40:invokeinterface #53  <Method Object Map.get(Object)>
			//   23   45:checkcast       #55  <Class String>
			//   24   48:invokestatic    #59  <Method void ViewCompat.setTransitionName(View, String)>
				}

			//   25   51:iload_1         
			//   26   52:iconst_1        
			//   27   53:iadd            
			//   28   54:istore_1        
			//*  29   55:goto            10
			//   30   58:return          
			}

			final FragmentTransitionImpl this$0;
			final Map val$nameOverrides;
			final ArrayList val$sharedElementsIn;

			
			{
				this$0 = FragmentTransitionImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentTransitionImpl this$0>
				sharedElementsIn = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ArrayList val$sharedElementsIn>
				nameOverrides = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Map val$nameOverrides>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:new             #10  <Class FragmentTransitionImpl$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #178 <Method void FragmentTransitionImpl$3(FragmentTransitionImpl, ArrayList, Map)>
	//    7   11:invokestatic    #183 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public abstract void scheduleRemoveTargets(Object obj, Object obj1, ArrayList arraylist, Object obj2, ArrayList arraylist1, Object obj3, ArrayList arraylist2);

	public abstract void setEpicenter(Object obj, Rect rect);

	public abstract void setEpicenter(Object obj, View view);

	void setNameOverridesOrdered(View view, final ArrayList sharedElementsIn, final Map nameOverrides)
	{
		OneShotPreDrawListener.add(view, new Runnable() {

			public void run()
			{
				int j = sharedElementsIn.size();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ArrayList val$sharedElementsIn>
			//    2    4:invokevirtual   #36  <Method int ArrayList.size()>
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
			//   10   16:getfield        #23  <Field ArrayList val$sharedElementsIn>
			//   11   19:iload_1         
			//   12   20:invokevirtual   #40  <Method Object ArrayList.get(int)>
			//   13   23:checkcast       #42  <Class View>
			//   14   26:astore_3        
					String s = ViewCompat.getTransitionName(view1);
			//   15   27:aload_3         
			//   16   28:invokestatic    #48  <Method String ViewCompat.getTransitionName(View)>
			//   17   31:astore          4
					if(s != null)
			//*  18   33:aload           4
			//*  19   35:ifnull          51
						ViewCompat.setTransitionName(view1, FragmentTransitionImpl.findKeyForValue(nameOverrides, s));
			//   20   38:aload_3         
			//   21   39:aload_0         
			//   22   40:getfield        #25  <Field Map val$nameOverrides>
			//   23   43:aload           4
			//   24   45:invokestatic    #52  <Method String FragmentTransitionImpl.findKeyForValue(Map, String)>
			//   25   48:invokestatic    #56  <Method void ViewCompat.setTransitionName(View, String)>
				}

			//   26   51:iload_1         
			//   27   52:iconst_1        
			//   28   53:iadd            
			//   29   54:istore_1        
			//*  30   55:goto            10
			//   31   58:return          
			}

			final FragmentTransitionImpl this$0;
			final Map val$nameOverrides;
			final ArrayList val$sharedElementsIn;

			
			{
				this$0 = FragmentTransitionImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentTransitionImpl this$0>
				sharedElementsIn = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ArrayList val$sharedElementsIn>
				nameOverrides = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Map val$nameOverrides>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:new             #8   <Class FragmentTransitionImpl$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #191 <Method void FragmentTransitionImpl$2(FragmentTransitionImpl, ArrayList, Map)>
	//    7   11:invokestatic    #183 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//    8   14:pop             
	//    9   15:return          
	}

	void setNameOverridesReordered(View view, final ArrayList sharedElementsOut, final ArrayList sharedElementsIn, final ArrayList inNames, Map map)
	{
		final int numSharedElements = sharedElementsIn.size();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #162 <Method int ArrayList.size()>
	//    2    4:istore          8
		final ArrayList outNames = new ArrayList();
	//    3    6:new             #116 <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #161 <Method void ArrayList()>
	//    6   13:astore          9
label0:
		for(int i = 0; i < numSharedElements; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore          6
	//*   9   18:iload           6
	//*  10   20:iload           8
	//*  11   22:icmpge          139
		{
			Object obj = ((Object) ((View)sharedElementsOut.get(i)));
	//   12   25:aload_2         
	//   13   26:iload           6
	//   14   28:invokevirtual   #163 <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #41  <Class View>
	//   16   34:astore          11
			String s = ViewCompat.getTransitionName(((View) (obj)));
	//   17   36:aload           11
	//   18   38:invokestatic    #130 <Method String ViewCompat.getTransitionName(View)>
	//   19   41:astore          10
			outNames.add(((Object) (s)));
	//   20   43:aload           9
	//   21   45:aload           10
	//   22   47:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   23   50:pop             
			if(s == null)
	//*  24   51:aload           10
	//*  25   53:ifnonnull       59
				continue;
	//   26   56:goto            130
			ViewCompat.setTransitionName(((View) (obj)), ((String) (null)));
	//   27   59:aload           11
	//   28   61:aconst_null     
	//   29   62:invokestatic    #167 <Method void ViewCompat.setTransitionName(View, String)>
			obj = ((Object) ((String)map.get(((Object) (s)))));
	//   30   65:aload           5
	//   31   67:aload           10
	//   32   69:invokeinterface #196 <Method Object Map.get(Object)>
	//   33   74:checkcast       #84  <Class String>
	//   34   77:astore          11
			int j = 0;
	//   35   79:iconst_0        
	//   36   80:istore          7
			do
			{
				if(j >= numSharedElements)
					continue label0;
	//   37   82:iload           7
	//   38   84:iload           8
	//   39   86:icmpge          130
				if(((String) (obj)).equals(inNames.get(j)))
	//*  40   89:aload           11
	//*  41   91:aload           4
	//*  42   93:iload           7
	//*  43   95:invokevirtual   #163 <Method Object ArrayList.get(int)>
	//*  44   98:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  45  101:ifeq            121
				{
					ViewCompat.setTransitionName((View)sharedElementsIn.get(j), s);
	//   46  104:aload_3         
	//   47  105:iload           7
	//   48  107:invokevirtual   #163 <Method Object ArrayList.get(int)>
	//   49  110:checkcast       #41  <Class View>
	//   50  113:aload           10
	//   51  115:invokestatic    #167 <Method void ViewCompat.setTransitionName(View, String)>
					continue label0;
	//   52  118:goto            130
				}
				j++;
	//   53  121:iload           7
	//   54  123:iconst_1        
	//   55  124:iadd            
	//   56  125:istore          7
			} while(true);
	//   57  127:goto            82
		}

	//   58  130:iload           6
	//   59  132:iconst_1        
	//   60  133:iadd            
	//   61  134:istore          6
	//*  62  136:goto            18
		OneShotPreDrawListener.add(view, new Runnable() {

			public void run()
			{
				for(int k = 0; k < numSharedElements; k++)
			//*   0    0:iconst_0        
			//*   1    1:istore_1        
			//*   2    2:iload_1         
			//*   3    3:aload_0         
			//*   4    4:getfield        #26  <Field int val$numSharedElements>
			//*   5    7:icmpge          67
				{
					ViewCompat.setTransitionName((View)sharedElementsIn.get(k), (String)inNames.get(k));
			//    6   10:aload_0         
			//    7   11:getfield        #28  <Field ArrayList val$sharedElementsIn>
			//    8   14:iload_1         
			//    9   15:invokevirtual   #45  <Method Object ArrayList.get(int)>
			//   10   18:checkcast       #47  <Class View>
			//   11   21:aload_0         
			//   12   22:getfield        #30  <Field ArrayList val$inNames>
			//   13   25:iload_1         
			//   14   26:invokevirtual   #45  <Method Object ArrayList.get(int)>
			//   15   29:checkcast       #49  <Class String>
			//   16   32:invokestatic    #55  <Method void ViewCompat.setTransitionName(View, String)>
					ViewCompat.setTransitionName((View)sharedElementsOut.get(k), (String)outNames.get(k));
			//   17   35:aload_0         
			//   18   36:getfield        #32  <Field ArrayList val$sharedElementsOut>
			//   19   39:iload_1         
			//   20   40:invokevirtual   #45  <Method Object ArrayList.get(int)>
			//   21   43:checkcast       #47  <Class View>
			//   22   46:aload_0         
			//   23   47:getfield        #34  <Field ArrayList val$outNames>
			//   24   50:iload_1         
			//   25   51:invokevirtual   #45  <Method Object ArrayList.get(int)>
			//   26   54:checkcast       #49  <Class String>
			//   27   57:invokestatic    #55  <Method void ViewCompat.setTransitionName(View, String)>
				}

			//   28   60:iload_1         
			//   29   61:iconst_1        
			//   30   62:iadd            
			//   31   63:istore_1        
			//*  32   64:goto            2
			//   33   67:return          
			}

			final FragmentTransitionImpl this$0;
			final ArrayList val$inNames;
			final int val$numSharedElements;
			final ArrayList val$outNames;
			final ArrayList val$sharedElementsIn;
			final ArrayList val$sharedElementsOut;

			
			{
				this$0 = FragmentTransitionImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field FragmentTransitionImpl this$0>
				numSharedElements = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #26  <Field int val$numSharedElements>
				sharedElementsIn = arraylist;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field ArrayList val$sharedElementsIn>
				inNames = arraylist1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field ArrayList val$inNames>
				sharedElementsOut = arraylist2;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field ArrayList val$sharedElementsOut>
				outNames = arraylist3;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #34  <Field ArrayList val$outNames>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #37  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//   63  139:aload_1         
	//   64  140:new             #6   <Class FragmentTransitionImpl$1>
	//   65  143:dup             
	//   66  144:aload_0         
	//   67  145:iload           8
	//   68  147:aload_3         
	//   69  148:aload           4
	//   70  150:aload_2         
	//   71  151:aload           9
	//   72  153:invokespecial   #199 <Method void FragmentTransitionImpl$1(FragmentTransitionImpl, int, ArrayList, ArrayList, ArrayList, ArrayList)>
	//   73  156:invokestatic    #183 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   74  159:pop             
	//   75  160:return          
	}

	public abstract void setSharedElementTargets(Object obj, View view, ArrayList arraylist);

	public abstract void swapSharedElementTargets(Object obj, ArrayList arraylist, ArrayList arraylist1);

	public abstract Object wrapTransitionInSet(Object obj);
}
