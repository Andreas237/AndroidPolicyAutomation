// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.*;

// Referenced classes of package com.mixpanel.android.b:
//			o, h

public static class o$g extends o
{

	private boolean a(Set set, SparseArray sparsearray)
	{
		TreeMap treemap = new TreeMap(new Comparator() {

			public int a(View view1, View view2)
			{
				if(view1 == view2)
			//*   0    0:aload_1         
			//*   1    1:aload_2         
			//*   2    2:if_acmpne       7
					return 0;
			//    3    5:iconst_0        
			//    4    6:ireturn         
				if(view1 == null)
			//*   5    7:aload_1         
			//*   6    8:ifnonnull       13
					return -1;
			//    7   11:iconst_m1       
			//    8   12:ireturn         
				if(view2 == null)
			//*   9   13:aload_2         
			//*  10   14:ifnonnull       19
					return 1;
			//   11   17:iconst_1        
			//   12   18:ireturn         
				else
					return ((Object) (view2)).hashCode() - ((Object) (view1)).hashCode();
			//   13   19:aload_2         
			//   14   20:invokevirtual   #29  <Method int Object.hashCode()>
			//   15   23:aload_1         
			//   16   24:invokevirtual   #29  <Method int Object.hashCode()>
			//   17   27:isub            
			//   18   28:ireturn         
			}

			public int compare(Object obj, Object obj1)
			{
				return a((View)obj, (View)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class View>
			//    3    5:aload_2         
			//    4    6:checkcast       #33  <Class View>
			//    5    9:invokevirtual   #35  <Method int a(View, View)>
			//    6   12:ireturn         
			}

			final o.g a;

			
			{
				a = o.g.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field o$g a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #79  <Class TreeMap>
	//    1    3:dup             
	//    2    4:new             #7   <Class o$g$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #82  <Method void o$g$1(o$g)>
	//    6   12:invokespecial   #85  <Method void TreeMap(Comparator)>
	//    7   15:astore          6
		int j = sparsearray.size();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #91  <Method int SparseArray.size()>
	//   10   21:istore          4
		for(int i = 0; i < j; i++)
	//*  11   23:iconst_0        
	//*  12   24:istore_3        
	//*  13   25:iload_3         
	//*  14   26:iload           4
	//*  15   28:icmpge          148
		{
			View view = (View)sparsearray.valueAt(i);
	//   16   31:aload_2         
	//   17   32:iload_3         
	//   18   33:invokevirtual   #95  <Method Object SparseArray.valueAt(int)>
	//   19   36:checkcast       #97  <Class View>
	//   20   39:astore          7
			int ai[] = ((android.widget.tiveLayout.LayoutParams)view.getLayoutParams()).getRules();
	//   21   41:aload           7
	//   22   43:invokevirtual   #101 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   46:checkcast       #103 <Class android.widget.RelativeLayout$LayoutParams>
	//   24   49:invokevirtual   #107 <Method int[] android.widget.RelativeLayout$LayoutParams.getRules()>
	//   25   52:astore          8
			ArrayList arraylist = new ArrayList();
	//   26   54:new             #109 <Class ArrayList>
	//   27   57:dup             
	//   28   58:invokespecial   #110 <Method void ArrayList()>
	//   29   61:astore          9
			Iterator iterator = set.iterator();
	//   30   63:aload_1         
	//   31   64:invokeinterface #116 <Method Iterator Set.iterator()>
	//   32   69:astore          10
			do
			{
				if(!iterator.hasNext())
					break;
	//   33   71:aload           10
	//   34   73:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   35   78:ifeq            131
				int k = ai[((Integer)iterator.next()).intValue()];
	//   36   81:aload           8
	//   37   83:aload           10
	//   38   85:invokeinterface #126 <Method Object Iterator.next()>
	//   39   90:checkcast       #30  <Class Integer>
	//   40   93:invokevirtual   #129 <Method int Integer.intValue()>
	//   41   96:iaload          
	//   42   97:istore          5
				if(k > 0 && k != view.getId())
	//*  43   99:iload           5
	//*  44  101:ifle            71
	//*  45  104:iload           5
	//*  46  106:aload           7
	//*  47  108:invokevirtual   #132 <Method int View.getId()>
	//*  48  111:icmpeq          71
					((List) (arraylist)).add(sparsearray.get(k));
	//   49  114:aload           9
	//   50  116:aload_2         
	//   51  117:iload           5
	//   52  119:invokevirtual   #135 <Method Object SparseArray.get(int)>
	//   53  122:invokeinterface #141 <Method boolean List.add(Object)>
	//   54  127:pop             
			} while(true);
	//   55  128:goto            71
			treemap.put(((Object) (view)), ((Object) (arraylist)));
	//   56  131:aload           6
	//   57  133:aload           7
	//   58  135:aload           9
	//   59  137:invokevirtual   #145 <Method Object TreeMap.put(Object, Object)>
	//   60  140:pop             
		}

	//   61  141:iload_3         
	//   62  142:iconst_1        
	//   63  143:iadd            
	//   64  144:istore_3        
	//*  65  145:goto            25
		return h.a(treemap);
	//   66  148:aload_0         
	//   67  149:getfield        #74  <Field o$c h>
	//   68  152:aload           6
	//   69  154:invokevirtual   #148 <Method boolean o$c.a(TreeMap)>
	//   70  157:ireturn         
	}

	public void a()
	{
		Iterator iterator = a.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field WeakHashMap a>
	//    2    4:invokevirtual   #153 <Method Set WeakHashMap.entrySet()>
	//    3    7:invokeinterface #116 <Method Iterator Set.iterator()>
	//    4   12:astore_3        
		do
		{
			boolean flag = iterator.hasNext();
	//    5   13:aload_3         
	//    6   14:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//    7   19:istore_2        
			int i = 0;
	//    8   20:iconst_0        
	//    9   21:istore_1        
			if(flag)
	//*  10   22:iload_2         
	//*  11   23:ifeq            105
			{
				java.util.Entry entry = (java.util.Entry)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #126 <Method Object Iterator.next()>
	//   14   32:checkcast       #155 <Class java.util.Map$Entry>
	//   15   35:astore          5
				View view = (View)entry.getKey();
	//   16   37:aload           5
	//   17   39:invokeinterface #158 <Method Object java.util.Map$Entry.getKey()>
	//   18   44:checkcast       #97  <Class View>
	//   19   47:astore          4
				int ai[] = (int[])entry.getValue();
	//   20   49:aload           5
	//   21   51:invokeinterface #161 <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #163 <Class int[]>
	//   23   59:astore          5
				android.widget.tiveLayout.LayoutParams layoutparams = (android.widget.tiveLayout.LayoutParams)view.getLayoutParams();
	//   24   61:aload           4
	//   25   63:invokevirtual   #101 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   66:checkcast       #103 <Class android.widget.RelativeLayout$LayoutParams>
	//   27   69:astore          6
				for(; i < ai.length; i++)
	//*  28   71:iload_1         
	//*  29   72:aload           5
	//*  30   74:arraylength     
	//*  31   75:icmpge          95
					layoutparams.addRule(i, ai[i]);
	//   32   78:aload           6
	//   33   80:iload_1         
	//   34   81:aload           5
	//   35   83:iload_1         
	//   36   84:iaload          
	//   37   85:invokevirtual   #167 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>

	//   38   88:iload_1         
	//   39   89:iconst_1        
	//   40   90:iadd            
	//   41   91:istore_1        
	//*  42   92:goto            71
				view.setLayoutParams(((android.view.Group.LayoutParams) (layoutparams)));
	//   43   95:aload           4
	//   44   97:aload           6
	//   45   99:invokevirtual   #171 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//*  46  102:goto            13
			{
				f = false;
	//   47  105:aload_0         
	//   48  106:iconst_0        
	//   49  107:putfield        #65  <Field boolean f>
				return;
	//   50  110:return          
			}
		} while(true);
	}

	public void a(View view)
	{
		view = ((View) ((ViewGroup)view));
	//    0    0:aload_1         
	//    1    1:checkcast       #174 <Class ViewGroup>
	//    2    4:astore_1        
		SparseArray sparsearray = new SparseArray();
	//    3    5:new             #87  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #175 <Method void SparseArray()>
	//    6   12:astore          6
		int k = ((ViewGroup) (view)).getChildCount();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #178 <Method int ViewGroup.getChildCount()>
	//    9   18:istore          4
		boolean flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_3        
		for(int i = 0; i < k; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload           4
	//*  16   27:icmpge          65
		{
			View view1 = ((ViewGroup) (view)).getChildAt(i);
	//   17   30:aload_1         
	//   18   31:iload_2         
	//   19   32:invokevirtual   #182 <Method View ViewGroup.getChildAt(int)>
	//   20   35:astore          7
			int l = view1.getId();
	//   21   37:aload           7
	//   22   39:invokevirtual   #132 <Method int View.getId()>
	//   23   42:istore          5
			if(l > 0)
	//*  24   44:iload           5
	//*  25   46:ifle            58
				sparsearray.put(l, ((Object) (view1)));
	//   26   49:aload           6
	//   27   51:iload           5
	//   28   53:aload           7
	//   29   55:invokevirtual   #185 <Method void SparseArray.put(int, Object)>
		}

	//   30   58:iload_2         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_2        
	//*  34   62:goto            24
		k = b.size();
	//   35   65:aload_0         
	//   36   66:getfield        #61  <Field List b>
	//   37   69:invokeinterface #186 <Method int List.size()>
	//   38   74:istore          4
		for(int j = ((int) (flag)); j < k; j++)
	//*  39   76:iload_3         
	//*  40   77:istore_2        
	//*  41   78:iload_2         
	//*  42   79:iload           4
	//*  43   81:icmpge          307
		{
			view = ((View) ((o$f)b.get(j)));
	//   44   84:aload_0         
	//   45   85:getfield        #61  <Field List b>
	//   46   88:iload_2         
	//   47   89:invokeinterface #187 <Method Object List.get(int)>
	//   48   94:checkcast       #189 <Class o$f>
	//   49   97:astore_1        
			View view2 = (View)sparsearray.get(((o$f) (view)).a);
	//   50   98:aload           6
	//   51  100:aload_1         
	//   52  101:getfield        #192 <Field int o$f.a>
	//   53  104:invokevirtual   #135 <Method Object SparseArray.get(int)>
	//   54  107:checkcast       #97  <Class View>
	//   55  110:astore          7
			if(view2 == null)
	//*  56  112:aload           7
	//*  57  114:ifnonnull       120
				continue;
	//   58  117:goto            300
			android.widget.tiveLayout.LayoutParams layoutparams = (android.widget.tiveLayout.LayoutParams)view2.getLayoutParams();
	//   59  120:aload           7
	//   60  122:invokevirtual   #101 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   61  125:checkcast       #103 <Class android.widget.RelativeLayout$LayoutParams>
	//   62  128:astore          8
			int ai[] = (int[])((int []) (layoutparams.getRules())).clone();
	//   63  130:aload           8
	//   64  132:invokevirtual   #107 <Method int[] android.widget.RelativeLayout$LayoutParams.getRules()>
	//   65  135:invokevirtual   #195 <Method Object _5B_I.clone()>
	//   66  138:checkcast       #163 <Class int[]>
	//   67  141:astore          9
			if(ai[((o$f) (view)).b] == ((o$f) (view)).c)
	//*  68  143:aload           9
	//*  69  145:aload_1         
	//*  70  146:getfield        #197 <Field int o$f.b>
	//*  71  149:iaload          
	//*  72  150:aload_1         
	//*  73  151:getfield        #199 <Field int o$f.c>
	//*  74  154:icmpne          160
				continue;
	//   75  157:goto            300
			if(!a.containsKey(((Object) (view2))))
	//*  76  160:aload_0         
	//*  77  161:getfield        #59  <Field WeakHashMap a>
	//*  78  164:aload           7
	//*  79  166:invokevirtual   #202 <Method boolean WeakHashMap.containsKey(Object)>
	//*  80  169:ifeq            175
	//*  81  172:goto            187
				a.put(((Object) (view2)), ((Object) (ai)));
	//   82  175:aload_0         
	//   83  176:getfield        #59  <Field WeakHashMap a>
	//   84  179:aload           7
	//   85  181:aload           9
	//   86  183:invokevirtual   #203 <Method Object WeakHashMap.put(Object, Object)>
	//   87  186:pop             
			layoutparams.addRule(((o$f) (view)).b, ((o$f) (view)).c);
	//   88  187:aload           8
	//   89  189:aload_1         
	//   90  190:getfield        #197 <Field int o$f.b>
	//   91  193:aload_1         
	//   92  194:getfield        #199 <Field int o$f.c>
	//   93  197:invokevirtual   #167 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
			if(d.contains(((Object) (Integer.valueOf(((o$f) (view)).b)))))
	//*  94  200:getstatic       #46  <Field Set d>
	//*  95  203:aload_1         
	//*  96  204:getfield        #197 <Field int o$f.b>
	//*  97  207:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//*  98  210:invokeinterface #206 <Method boolean Set.contains(Object)>
	//*  99  215:ifeq            225
				view = ((View) (d));
	//  100  218:getstatic       #46  <Field Set d>
	//  101  221:astore_1        
			else
	//* 102  222:goto            252
			if(e.contains(((Object) (Integer.valueOf(((o$f) (view)).b)))))
	//* 103  225:getstatic       #48  <Field Set e>
	//* 104  228:aload_1         
	//* 105  229:getfield        #197 <Field int o$f.b>
	//* 106  232:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 107  235:invokeinterface #206 <Method boolean Set.contains(Object)>
	//* 108  240:ifeq            250
				view = ((View) (e));
	//  109  243:getstatic       #48  <Field Set e>
	//  110  246:astore_1        
			else
	//* 111  247:goto            252
				view = null;
	//  112  250:aconst_null     
	//  113  251:astore_1        
			if(view != null && !a(((Set) (view)), sparsearray))
	//* 114  252:aload_1         
	//* 115  253:ifnull          293
	//* 116  256:aload_0         
	//* 117  257:aload_1         
	//* 118  258:aload           6
	//* 119  260:invokespecial   #208 <Method boolean a(Set, SparseArray)>
	//* 120  263:ifne            293
			{
				a();
	//  121  266:aload_0         
	//  122  267:invokevirtual   #210 <Method void a()>
				g.a(new o$e("circular_dependency", c));
	//  123  270:aload_0         
	//  124  271:getfield        #67  <Field o$i g>
	//  125  274:new             #212 <Class o$e>
	//  126  277:dup             
	//  127  278:ldc1            #214 <String "circular_dependency">
	//  128  280:aload_0         
	//  129  281:getfield        #63  <Field String c>
	//  130  284:invokespecial   #217 <Method void o$e(String, String)>
	//  131  287:invokeinterface #222 <Method void o$i.a(o$e)>
				return;
	//  132  292:return          
			}
			view2.setLayoutParams(((android.view.Group.LayoutParams) (layoutparams)));
	//  133  293:aload           7
	//  134  295:aload           8
	//  135  297:invokevirtual   #171 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}

	//  136  300:iload_2         
	//  137  301:iconst_1        
	//  138  302:iadd            
	//  139  303:istore_2        
	//* 140  304:goto            78
	//  141  307:return          
	}

	public void b(View view)
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field boolean f>
	//*   2    4:ifeq            20
			c().a(view, b(), ((h$a) (this)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #225 <Method h c()>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #228 <Method List b()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #233 <Method void h.a(View, List, h$a)>
	//   10   20:return          
	}

	private static final Set d = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(7)
	}))))));
	private static final Set e = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8)
	}))))));
	private final WeakHashMap a = new WeakHashMap();
	private final List b;
	private final String c;
	private boolean f;
	private final o$i g;
	private final o$c h = new o$c(((o$1) (null)));

	static 
	{
	//    0    0:new             #28  <Class HashSet>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:anewarray       Integer[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:iconst_1        
	//   12   18:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   13   21:aastore         
	//   14   22:dup             
	//   15   23:iconst_2        
	//   16   24:iconst_5        
	//   17   25:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   18   28:aastore         
	//   19   29:dup             
	//   20   30:iconst_3        
	//   21   31:bipush          7
	//   22   33:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   23   36:aastore         
	//   24   37:invokestatic    #40  <Method List Arrays.asList(Object[])>
	//   25   40:invokespecial   #44  <Method void HashSet(java.util.Collection)>
	//   26   43:putstatic       #46  <Field Set d>
	//   27   46:new             #28  <Class HashSet>
	//   28   49:dup             
	//   29   50:iconst_5        
	//   30   51:anewarray       Integer[]
	//   31   54:dup             
	//   32   55:iconst_0        
	//   33   56:iconst_2        
	//   34   57:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   35   60:aastore         
	//   36   61:dup             
	//   37   62:iconst_1        
	//   38   63:iconst_3        
	//   39   64:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   40   67:aastore         
	//   41   68:dup             
	//   42   69:iconst_2        
	//   43   70:iconst_4        
	//   44   71:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   45   74:aastore         
	//   46   75:dup             
	//   47   76:iconst_3        
	//   48   77:bipush          6
	//   49   79:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   50   82:aastore         
	//   51   83:dup             
	//   52   84:iconst_4        
	//   53   85:bipush          8
	//   54   87:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   55   90:aastore         
	//   56   91:invokestatic    #40  <Method List Arrays.asList(Object[])>
	//   57   94:invokespecial   #44  <Method void HashSet(java.util.Collection)>
	//   58   97:putstatic       #48  <Field Set e>
	//*  59  100:return          
	}

	public o$g(List list, List list1, String s, o$i o$i1)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void o(List)>
	//    3    5:aload_0         
	//    4    6:new             #55  <Class WeakHashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #57  <Method void WeakHashMap()>
	//    7   13:putfield        #59  <Field WeakHashMap a>
		b = list1;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #61  <Field List b>
		c = s;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #63  <Field String c>
		f = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #65  <Field boolean f>
		g = o$i1;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #67  <Field o$i g>
	//   20   37:aload_0         
	//   21   38:new             #69  <Class o$c>
	//   22   41:dup             
	//   23   42:aconst_null     
	//   24   43:invokespecial   #72  <Method void o$c(o$1)>
	//   25   46:putfield        #74  <Field o$c h>
	//   26   49:return          
	}
}
