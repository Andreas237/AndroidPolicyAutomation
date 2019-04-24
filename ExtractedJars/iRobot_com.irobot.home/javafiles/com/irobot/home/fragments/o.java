// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.support.v4.view.s;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.FloorPlanListItem;
import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;
import com.irobot.core.MapsUIServiceData;
import com.irobot.core.PersistentMapsDestination;
import com.irobot.core.RegionListItem;
import com.irobot.home.IRobotApplication;
import com.irobot.home.b.h;
import com.irobot.home.b.i;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.mixpanel.android.a.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.irobot.home.fragments:
//			j, o

public class o extends com.irobot.home.fragments.j
	implements com.irobot.home.b.h.a, com.irobot.home.b.i.b, com.irobot.home.b.i.d
{
	private class a extends d
	{
		private class a extends android.view.View.AccessibilityDelegate
		{

			public android.view.View.AccessibilityDelegate a()
			{
				return b;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//    2    4:areturn         
			}

			public void a(a a1)
			{
				if(b == a1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//*   2    4:aload_1         
			//*   3    5:if_acmpne       17
				{
					b = a1.a();
			//    4    8:aload_0         
			//    5    9:aload_1         
			//    6   10:invokevirtual   #26  <Method android.view.View$AccessibilityDelegate a()>
			//    7   13:putfield        #21  <Field android.view.View$AccessibilityDelegate b>
					return;
			//    8   16:return          
				}
				if(b instanceof a)
			//*   9   17:aload_0         
			//*  10   18:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//*  11   21:instanceof      #2   <Class o$a$a>
			//*  12   24:ifeq            38
					((a)b).a(a1);
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//   15   31:checkcast       #2   <Class o$a$a>
			//   16   34:aload_1         
			//   17   35:invokevirtual   #28  <Method void a(o$a$a)>
			//   18   38:return          
			}

			public boolean a(String s1)
			{
				if(a.d() == s1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field o$a a>
			//*   2    4:invokevirtual   #33  <Method String o$a.d()>
			//*   3    7:aload_1         
			//*   4    8:if_acmpne       13
					return true;
			//    5   11:iconst_1        
			//    6   12:ireturn         
				if(b instanceof a)
			//*   7   13:aload_0         
			//*   8   14:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//*   9   17:instanceof      #2   <Class o$a$a>
			//*  10   20:ifeq            35
					return ((a)b).a(s1);
			//   11   23:aload_0         
			//   12   24:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//   13   27:checkcast       #2   <Class o$a$a>
			//   14   30:aload_1         
			//   15   31:invokevirtual   #35  <Method boolean a(String)>
			//   16   34:ireturn         
				else
					return false;
			//   17   35:iconst_0        
			//   18   36:ireturn         
			}

			public void sendAccessibilityEvent(View view, int i1)
			{
				if(i1 == com.mixpanel.android.b.a.a(a))
			//*   0    0:iload_2         
			//*   1    1:aload_0         
			//*   2    2:getfield        #16  <Field o$a a>
			//*   3    5:invokestatic    #40  <Method int com.mixpanel.android.b.o$a.a(o$a)>
			//*   4    8:icmpne          19
					a.c(view);
			//    5   11:aload_0         
			//    6   12:getfield        #16  <Field o$a a>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #44  <Method void o$a.c(View)>
				if(b != null)
			//*   9   19:aload_0         
			//*  10   20:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//*  11   23:ifnull          35
					b.sendAccessibilityEvent(view, i1);
			//   12   26:aload_0         
			//   13   27:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//   14   30:aload_1         
			//   15   31:iload_2         
			//   16   32:invokevirtual   #46  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
			//   17   35:return          
			}

			final a a;
			private android.view.View.AccessibilityDelegate b;

			public a(android.view.View.AccessibilityDelegate accessibilitydelegate)
			{
				a = a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field o$a a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void android.view.View$AccessibilityDelegate()>
				b = accessibilitydelegate;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #21  <Field android.view.View$AccessibilityDelegate b>
			//    8   14:return          
			}
		}


		static int a(a a1)
		{
			return a1.a;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int a>
		//    2    4:ireturn         
		}

		private android.view.View.AccessibilityDelegate d(View view)
		{
			view = ((View) ((android.view.View.AccessibilityDelegate)((Object) (view)).getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(((Object) (view)), new Object[0])));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #45  <Method Class Object.getClass()>
		//    2    4:ldc1            #47  <String "getAccessibilityDelegate">
		//    3    6:iconst_0        
		//    4    7:anewarray       Class[]
		//    5   10:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
		//    6   13:aload_1         
		//    7   14:iconst_0        
		//    8   15:anewarray       Object[]
		//    9   18:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
		//   10   21:checkcast       #61  <Class android.view.View$AccessibilityDelegate>
		//   11   24:astore_1        
			return ((android.view.View.AccessibilityDelegate) (view));
		//   12   25:aload_1         
		//   13   26:areturn         
			view;
		//   14   27:astore_1        
			com.mixpanel.android.a.f.d("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", ((Throwable) (view)));
		//   15   28:ldc1            #63  <String "MixpanelAPI.ViewVisitor">
		//   16   30:ldc1            #65  <String "getAccessibilityDelegate threw an exception when called.">
		//   17   32:aload_1         
		//   18   33:invokestatic    #70  <Method void f.d(String, String, Throwable)>
_L2:
			return null;
		//   19   36:aconst_null     
		//   20   37:areturn         
			view;
		//   21   38:astore_1        
			if(true) goto _L2; else goto _L1
_L1:
		//*  22   39:goto            36
		}

		public void a()
		{
			Iterator iterator = b.entrySet().iterator();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakHashMap b>
		//    2    4:invokevirtual   #74  <Method Set WeakHashMap.entrySet()>
		//    3    7:invokeinterface #80  <Method Iterator Set.iterator()>
		//    4   12:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
		//    5   13:aload_1         
		//    6   14:invokeinterface #86  <Method boolean Iterator.hasNext()>
		//    7   19:ifeq            96
				Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
		//    8   22:aload_1         
		//    9   23:invokeinterface #90  <Method Object Iterator.next()>
		//   10   28:checkcast       #92  <Class java.util.Map$Entry>
		//   11   31:astore_3        
				View view = (View)((java.util.Map.Entry) (obj)).getKey();
		//   12   32:aload_3         
		//   13   33:invokeinterface #95  <Method Object java.util.Map$Entry.getKey()>
		//   14   38:checkcast       #97  <Class View>
		//   15   41:astore_2        
				obj = ((Object) ((a)((java.util.Map.Entry) (obj)).getValue()));
		//   16   42:aload_3         
		//   17   43:invokeinterface #100 <Method Object java.util.Map$Entry.getValue()>
		//   18   48:checkcast       #9   <Class o$a$a>
		//   19   51:astore_3        
				android.view.View.AccessibilityDelegate accessibilitydelegate = d(view);
		//   20   52:aload_0         
		//   21   53:aload_2         
		//   22   54:invokespecial   #102 <Method android.view.View$AccessibilityDelegate d(View)>
		//   23   57:astore          4
				if(accessibilitydelegate == obj)
		//*  24   59:aload           4
		//*  25   61:aload_3         
		//*  26   62:if_acmpne       76
					view.setAccessibilityDelegate(((a) (obj)).a());
		//   27   65:aload_2         
		//   28   66:aload_3         
		//   29   67:invokevirtual   #105 <Method android.view.View$AccessibilityDelegate com.mixpanel.android.b.o$a$a.a()>
		//   30   70:invokevirtual   #109 <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
				else
		//*  31   73:goto            13
				if(accessibilitydelegate instanceof a)
		//*  32   76:aload           4
		//*  33   78:instanceof      #9   <Class o$a$a>
		//*  34   81:ifeq            13
					((a)accessibilitydelegate).a(((a) (obj)));
		//   35   84:aload           4
		//   36   86:checkcast       #9   <Class o$a$a>
		//   37   89:aload_3         
		//   38   90:invokevirtual   #112 <Method void com.mixpanel.android.b.o$a$a.a(o$a$a)>
			} while(true);
		//   39   93:goto            13
			b.clear();
		//   40   96:aload_0         
		//   41   97:getfield        #27  <Field WeakHashMap b>
		//   42  100:invokevirtual   #115 <Method void WeakHashMap.clear()>
		//   43  103:return          
		}

		public void a(View view)
		{
			Object obj = ((Object) (d(view)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #102 <Method android.view.View$AccessibilityDelegate d(View)>
		//    3    5:astore_2        
			if((obj instanceof a) && ((a)obj).a(d()))
		//*   4    6:aload_2         
		//*   5    7:instanceof      #9   <Class o$a$a>
		//*   6   10:ifeq            28
		//*   7   13:aload_2         
		//*   8   14:checkcast       #9   <Class o$a$a>
		//*   9   17:aload_0         
		//*  10   18:invokevirtual   #119 <Method String d()>
		//*  11   21:invokevirtual   #122 <Method boolean com.mixpanel.android.b.o$a$a.a(String)>
		//*  12   24:ifeq            28
			{
				return;
		//   13   27:return          
			} else
			{
				obj = ((Object) (new a(((android.view.View.AccessibilityDelegate) (obj)))));
		//   14   28:new             #9   <Class o$a$a>
		//   15   31:dup             
		//   16   32:aload_0         
		//   17   33:aload_2         
		//   18   34:invokespecial   #125 <Method void o$a$a(o$a, android.view.View$AccessibilityDelegate)>
		//   19   37:astore_2        
				view.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (obj)));
		//   20   38:aload_1         
		//   21   39:aload_2         
		//   22   40:invokevirtual   #109 <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
				b.put(((Object) (view)), obj);
		//   23   43:aload_0         
		//   24   44:getfield        #27  <Field WeakHashMap b>
		//   25   47:aload_1         
		//   26   48:aload_2         
		//   27   49:invokevirtual   #129 <Method Object WeakHashMap.put(Object, Object)>
		//   28   52:pop             
				return;
		//   29   53:return          
			}
		}

		public volatile void b(View view)
		{
			super.b(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #131 <Method void o$d.b(View)>
		//    3    5:return          
		}

		private final int a;
		private final WeakHashMap b = new WeakHashMap();

		public a(List list, int i1, String s1, h h1)
		{
			super(list, s1, h1, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:iconst_0        
		//    5    6:invokespecial   #18  <Method void o$d(List, String, o$h, boolean)>
			a = i1;
		//    6    9:aload_0         
		//    7   10:iload_2         
		//    8   11:putfield        #20  <Field int a>
		//    9   14:aload_0         
		//   10   15:new             #22  <Class WeakHashMap>
		//   11   18:dup             
		//   12   19:invokespecial   #25  <Method void WeakHashMap()>
		//   13   22:putfield        #27  <Field WeakHashMap b>
		//   14   25:return          
		}
	}

	public static interface b extends d
	{
		private class a
			implements TextWatcher
		{

			public void afterTextChanged(Editable editable)
			{
				a.c(b);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field o$b a>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field View b>
			//    4    8:invokevirtual   #30  <Method void o$b.c(View)>
			//    5   11:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
			{
			//    0    0:return          
			}

			final b a;
			private final View b;

			public a(View view)
			{
				a = b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field o$b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
				b = view;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #23  <Field View b>
			//    8   14:return          
			}
		}


		public void a()
		{
			java.util.Map.Entry entry;
			for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field Map a>
		//*   2    4:invokeinterface #33  <Method Set Map.entrySet()>
		//*   3    9:invokeinterface #39  <Method Iterator Set.iterator()>
		//*   4   14:astore_1        
		//*   5   15:aload_1         
		//*   6   16:invokeinterface #45  <Method boolean Iterator.hasNext()>
		//*   7   21:ifeq            58
				entry = (java.util.Map.Entry)iterator.next();
		//    8   24:aload_1         
		//    9   25:invokeinterface #49  <Method Object Iterator.next()>
		//   10   30:checkcast       #51  <Class java.util.Map$Entry>
		//   11   33:astore_2        

		//   12   34:aload_2         
		//   13   35:invokeinterface #54  <Method Object java.util.Map$Entry.getKey()>
		//   14   40:checkcast       #56  <Class TextView>
		//   15   43:aload_2         
		//   16   44:invokeinterface #59  <Method Object java.util.Map$Entry.getValue()>
		//   17   49:checkcast       #61  <Class TextWatcher>
		//   18   52:invokevirtual   #65  <Method void TextView.removeTextChangedListener(TextWatcher)>
		//*  19   55:goto            15
			a.clear();
		//   20   58:aload_0         
		//   21   59:getfield        #24  <Field Map a>
		//   22   62:invokeinterface #68  <Method void Map.clear()>
		//   23   67:return          
		}

		public void a(View view)
		{
			if(view instanceof TextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #56  <Class TextView>
		//*   2    4:ifeq            62
			{
				view = ((View) ((TextView)view));
		//    3    7:aload_1         
		//    4    8:checkcast       #56  <Class TextView>
		//    5   11:astore_1        
				a a1 = new a(view);
		//    6   12:new             #9   <Class o$b$a>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #72  <Method void o$b$a(o$b, View)>
		//   11   21:astore_2        
				TextWatcher textwatcher = (TextWatcher)a.get(((Object) (view)));
		//   12   22:aload_0         
		//   13   23:getfield        #24  <Field Map a>
		//   14   26:aload_1         
		//   15   27:invokeinterface #76  <Method Object Map.get(Object)>
		//   16   32:checkcast       #61  <Class TextWatcher>
		//   17   35:astore_3        
				if(textwatcher != null)
		//*  18   36:aload_3         
		//*  19   37:ifnull          45
					((TextView) (view)).removeTextChangedListener(textwatcher);
		//   20   40:aload_1         
		//   21   41:aload_3         
		//   22   42:invokevirtual   #65  <Method void TextView.removeTextChangedListener(TextWatcher)>
				((TextView) (view)).addTextChangedListener(((TextWatcher) (a1)));
		//   23   45:aload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #79  <Method void TextView.addTextChangedListener(TextWatcher)>
				a.put(((Object) (view)), ((Object) (a1)));
		//   26   50:aload_0         
		//   27   51:getfield        #24  <Field Map a>
		//   28   54:aload_1         
		//   29   55:aload_2         
		//   30   56:invokeinterface #83  <Method Object Map.put(Object, Object)>
		//   31   61:pop             
			}
		//   32   62:return          
		}

		public volatile void b(View view)
		{
			super.b(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #85  <Method void o$d.b(View)>
		//    3    5:return          
		}

		private final Map a = new HashMap();

		public b(List list, String s1, h h1)
		{
			super(list, s1, h1, true);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iconst_1        
		//    5    5:invokespecial   #17  <Method void o$d(List, String, o$h, boolean)>
		//    6    8:aload_0         
		//    7    9:new             #19  <Class HashMap>
		//    8   12:dup             
		//    9   13:invokespecial   #22  <Method void HashMap()>
		//   10   16:putfield        #24  <Field Map a>
		//   11   19:return          
		}
	}


	public o()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void com.irobot.home.fragments.j()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #77  <Field int o>
		p = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #79  <Field int p>
		t = ((b) (new y(this) {

			public void b(View view)
			{
				if(a.k && a.f != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field o a>
			//*   2    4:getfield        #22  <Field boolean o.k>
			//*   3    7:ifeq            42
			//*   4   10:aload_0         
			//*   5   11:getfield        #12  <Field o a>
			//*   6   14:getfield        #26  <Field View android.support.v7.app.o.f>
			//*   7   17:ifnull          42
				{
					a.f.setTranslationY(0.0F);
			//    8   20:aload_0         
			//    9   21:getfield        #12  <Field o a>
			//   10   24:getfield        #26  <Field View android.support.v7.app.o.f>
			//   11   27:fconst_0        
			//   12   28:invokevirtual   #32  <Method void View.setTranslationY(float)>
					a.c.setTranslationY(0.0F);
			//   13   31:aload_0         
			//   14   32:getfield        #12  <Field o a>
			//   15   35:getfield        #36  <Field ActionBarContainer o.c>
			//   16   38:fconst_0        
			//   17   39:invokevirtual   #39  <Method void ActionBarContainer.setTranslationY(float)>
				}
				a.c.setVisibility(8);
			//   18   42:aload_0         
			//   19   43:getfield        #12  <Field o a>
			//   20   46:getfield        #36  <Field ActionBarContainer o.c>
			//   21   49:bipush          8
			//   22   51:invokevirtual   #43  <Method void ActionBarContainer.setVisibility(int)>
				a.c.setTransitioning(false);
			//   23   54:aload_0         
			//   24   55:getfield        #12  <Field o a>
			//   25   58:getfield        #36  <Field ActionBarContainer o.c>
			//   26   61:iconst_0        
			//   27   62:invokevirtual   #47  <Method void ActionBarContainer.setTransitioning(boolean)>
				a.n = null;
			//   28   65:aload_0         
			//   29   66:getfield        #12  <Field o a>
			//   30   69:aconst_null     
			//   31   70:putfield        #51  <Field android.support.v7.view.h o.n>
				a.h();
			//   32   73:aload_0         
			//   33   74:getfield        #12  <Field o a>
			//   34   77:invokevirtual   #54  <Method void android.support.v7.app.o.h()>
				if(a.b != null)
			//*  35   80:aload_0         
			//*  36   81:getfield        #12  <Field o a>
			//*  37   84:getfield        #57  <Field android.support.v7.widget.ActionBarOverlayLayout o.b>
			//*  38   87:ifnull          100
					android.support.v4.view.s.p(((View) (a.b)));
			//   39   90:aload_0         
			//   40   91:getfield        #12  <Field o a>
			//   41   94:getfield        #57  <Field android.support.v7.widget.ActionBarOverlayLayout o.b>
			//   42   97:invokestatic    #62  <Method void s.p(View)>
			//   43  100:return          
			}

			final o a;

			
			{
				a = o1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field o a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void y()>
			//    5    9:return          
			}
		}
));
	//    8   14:aload_0         
	//    9   15:new             #12  <Class o$1>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #82  <Method void o$1(o)>
	//   13   23:putfield        #84  <Field o$b t>
		j = new ArrayList();
	//   14   26:aload_0         
	//   15   27:new             #86  <Class ArrayList>
	//   16   30:dup             
	//   17   31:invokespecial   #87  <Method void ArrayList()>
	//   18   34:putfield        #89  <Field ArrayList j>
		u = new ArrayList();
	//   19   37:aload_0         
	//   20   38:new             #86  <Class ArrayList>
	//   21   41:dup             
	//   22   42:invokespecial   #87  <Method void ArrayList()>
	//   23   45:putfield        #91  <Field ArrayList u>
		v = new ArrayList();
	//   24   48:aload_0         
	//   25   49:new             #86  <Class ArrayList>
	//   26   52:dup             
	//   27   53:invokespecial   #87  <Method void ArrayList()>
	//   28   56:putfield        #93  <Field ArrayList v>
		w = new ArrayList();
	//   29   59:aload_0         
	//   30   60:new             #86  <Class ArrayList>
	//   31   63:dup             
	//   32   64:invokespecial   #87  <Method void ArrayList()>
	//   33   67:putfield        #95  <Field ArrayList w>
		z = null;
	//   34   70:aload_0         
	//   35   71:aconst_null     
	//   36   72:putfield        #97  <Field MapsUIService z>
		A = null;
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:putfield        #99  <Field o$a A>
	//   40   80:return          
	}

	static void a(o o1)
	{
		o1.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void l()>
	//    2    4:return          
	}

	static void a(o o1, ArrayList arraylist, int i1)
	{
		o1.a(arraylist, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #105 <Method void a(ArrayList, int)>
	//    4    6:return          
	}

	static void a(o o1, ArrayList arraylist, FloorPlanListItem floorplanlistitem, int i1, int j1)
	{
		o1.a(arraylist, floorplanlistitem, i1, j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #109 <Method void a(ArrayList, FloorPlanListItem, int, int)>
	//    6    9:return          
	}

	private void a(ArrayList arraylist, int i1)
	{
label0:
		{
			u = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field ArrayList u>
			t.a(u);
	//    3    5:aload_0         
	//    4    6:getfield        #84  <Field o$b t>
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field ArrayList u>
	//    7   13:invokeinterface #112 <Method void com.irobot.home.fragments.o$b.a(ArrayList)>
			C = new h(((android.content.Context) (getActivity())), 0x7f0b0107, ((List) (u)));
	//    8   18:aload_0         
	//    9   19:new             #114 <Class h>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #118 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   13   27:ldc1            #119 <Int 0x7f0b0107>
	//   14   29:aload_0         
	//   15   30:getfield        #91  <Field ArrayList u>
	//   16   33:invokespecial   #122 <Method void h(android.content.Context, int, List)>
	//   17   36:putfield        #124 <Field h C>
			b.setAdapter(((android.widget.SpinnerAdapter) (C)));
	//   18   39:aload_0         
	//   19   40:getfield        #126 <Field Spinner b>
	//   20   43:aload_0         
	//   21   44:getfield        #124 <Field h C>
	//   22   47:invokevirtual   #132 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
			if(i1 != -1)
	//*  23   50:iload_2         
	//*  24   51:iconst_m1       
	//*  25   52:icmpeq          66
			{
				b.setSelection(i1);
	//   26   55:aload_0         
	//   27   56:getfield        #126 <Field Spinner b>
	//   28   59:iload_2         
	//   29   60:invokevirtual   #136 <Method void Spinner.setSelection(int)>
			} else
	//*  30   63:goto            89
			{
				com.irobot.home.util.o.e(n, "Could not find selected floor! Defaulting to first in list if available.");
	//   31   66:getstatic       #138 <Field String n>
	//   32   69:ldc1            #140 <String "Could not find selected floor! Defaulting to first in list if available.">
	//   33   71:invokestatic    #145 <Method void com.irobot.home.util.o.e(String, String)>
				if(arraylist.isEmpty())
					break label0;
	//   34   74:aload_1         
	//   35   75:invokevirtual   #149 <Method boolean ArrayList.isEmpty()>
	//   36   78:ifne            250
				b.setSelection(0);
	//   37   81:aload_0         
	//   38   82:getfield        #126 <Field Spinner b>
	//   39   85:iconst_0        
	//   40   86:invokevirtual   #136 <Method void Spinner.setSelection(int)>
			}
			C.a(((com.irobot.home.b.h.a) (this)));
	//   41   89:aload_0         
	//   42   90:getfield        #124 <Field h C>
	//   43   93:aload_0         
	//   44   94:invokevirtual   #152 <Method void h.a(com.irobot.home.b.h$a)>
			b.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (C)));
	//   45   97:aload_0         
	//   46   98:getfield        #126 <Field Spinner b>
	//   47  101:aload_0         
	//   48  102:getfield        #124 <Field h C>
	//   49  105:invokevirtual   #156 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			b.invalidate();
	//   50  108:aload_0         
	//   51  109:getfield        #126 <Field Spinner b>
	//   52  112:invokevirtual   #159 <Method void Spinner.invalidate()>
			if(u.size() == 1)
	//*  53  115:aload_0         
	//*  54  116:getfield        #91  <Field ArrayList u>
	//*  55  119:invokevirtual   #163 <Method int ArrayList.size()>
	//*  56  122:iconst_1        
	//*  57  123:icmpne          249
			{
				arraylist = ((ArrayList) ((FloorPlanListItem)u.get(0)));
	//   58  126:aload_0         
	//   59  127:getfield        #91  <Field ArrayList u>
	//   60  130:iconst_0        
	//   61  131:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   62  134:checkcast       #169 <Class FloorPlanListItem>
	//   63  137:astore_1        
				String s1 = n;
	//   64  138:getstatic       #138 <Field String n>
	//   65  141:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   66  142:new             #171 <Class StringBuilder>
	//   67  145:dup             
	//   68  146:invokespecial   #172 <Method void StringBuilder()>
	//   69  149:astore          4
				stringbuilder.append("Only one floor shown. Will show single floor title: ");
	//   70  151:aload           4
	//   71  153:ldc1            #174 <String "Only one floor shown. Will show single floor title: ">
	//   72  155:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   73  158:pop             
				stringbuilder.append(m);
	//   74  159:aload           4
	//   75  161:aload_0         
	//   76  162:getfield        #180 <Field boolean m>
	//   77  165:invokevirtual   #183 <Method StringBuilder StringBuilder.append(boolean)>
	//   78  168:pop             
				com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   79  169:aload_3         
	//   80  170:aload           4
	//   81  172:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   82  175:invokestatic    #189 <Method void com.irobot.home.util.o.b(String, String)>
				if(m)
	//*  83  178:aload_0         
	//*  84  179:getfield        #180 <Field boolean m>
	//*  85  182:ifeq            231
				{
					c.setVisibility(0);
	//   86  185:aload_0         
	//   87  186:getfield        #191 <Field View c>
	//   88  189:iconst_0        
	//   89  190:invokevirtual   #196 <Method void View.setVisibility(int)>
					d.setText(((CharSequence) (((FloorPlanListItem) (arraylist)).getName())));
	//   90  193:aload_0         
	//   91  194:getfield        #198 <Field TextView d>
	//   92  197:aload_1         
	//   93  198:invokevirtual   #201 <Method String FloorPlanListItem.getName()>
	//   94  201:invokevirtual   #207 <Method void TextView.setText(CharSequence)>
					e.setText(((CharSequence) (getString(0x7f0f032e, new Object[] {
						Integer.valueOf(((FloorPlanListItem) (arraylist)).getLabeledRegionsCount())
					}))));
	//   95  204:aload_0         
	//   96  205:getfield        #209 <Field TextView e>
	//   97  208:aload_0         
	//   98  209:ldc1            #210 <Int 0x7f0f032e>
	//   99  211:iconst_1        
	//  100  212:anewarray       Object[]
	//  101  215:dup             
	//  102  216:iconst_0        
	//  103  217:aload_1         
	//  104  218:invokevirtual   #215 <Method int FloorPlanListItem.getLabeledRegionsCount()>
	//  105  221:invokestatic    #221 <Method Integer Integer.valueOf(int)>
	//  106  224:aastore         
	//  107  225:invokevirtual   #225 <Method String getString(int, Object[])>
	//  108  228:invokevirtual   #207 <Method void TextView.setText(CharSequence)>
				}
				b.setVisibility(8);
	//  109  231:aload_0         
	//  110  232:getfield        #126 <Field Spinner b>
	//  111  235:bipush          8
	//  112  237:invokevirtual   #226 <Method void Spinner.setVisibility(int)>
				f.setVisibility(8);
	//  113  240:aload_0         
	//  114  241:getfield        #228 <Field View f>
	//  115  244:bipush          8
	//  116  246:invokevirtual   #196 <Method void View.setVisibility(int)>
			}
			return;
	//  117  249:return          
		}
		com.irobot.home.util.o.e(n, "No floors at all! Hiding UI to prevent damage.");
	//  118  250:getstatic       #138 <Field String n>
	//  119  253:ldc1            #230 <String "No floors at all! Hiding UI to prevent damage.">
	//  120  255:invokestatic    #145 <Method void com.irobot.home.util.o.e(String, String)>
		b.setVisibility(8);
	//  121  258:aload_0         
	//  122  259:getfield        #126 <Field Spinner b>
	//  123  262:bipush          8
	//  124  264:invokevirtual   #226 <Method void Spinner.setVisibility(int)>
		f.setVisibility(8);
	//  125  267:aload_0         
	//  126  268:getfield        #228 <Field View f>
	//  127  271:bipush          8
	//  128  273:invokevirtual   #196 <Method void View.setVisibility(int)>
		i.setVisibility(8);
	//  129  276:aload_0         
	//  130  277:getfield        #232 <Field RecyclerView i>
	//  131  280:bipush          8
	//  132  282:invokevirtual   #235 <Method void RecyclerView.setVisibility(int)>
		l();
	//  133  285:aload_0         
	//  134  286:invokespecial   #101 <Method void l()>
	//  135  289:return          
	}

	private void a(ArrayList arraylist, FloorPlanListItem floorplanlistitem, int i1, int j1)
	{
		v = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field ArrayList v>
		k = floorplanlistitem.getMapIdString();
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #240 <Method String FloorPlanListItem.getMapIdString()>
	//    6   10:putfield        #242 <Field String k>
		x = floorplanlistitem.getMapVersion();
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #245 <Method String FloorPlanListItem.getMapVersion()>
	//   10   18:putfield        #247 <Field String x>
		y = floorplanlistitem.getLastUserEditedMapVersion();
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #250 <Method String FloorPlanListItem.getLastUserEditedMapVersion()>
	//   14   26:putfield        #252 <Field String y>
		j.clear();
	//   15   29:aload_0         
	//   16   30:getfield        #89  <Field ArrayList j>
	//   17   33:invokevirtual   #255 <Method void ArrayList.clear()>
		w.clear();
	//   18   36:aload_0         
	//   19   37:getfield        #95  <Field ArrayList w>
	//   20   40:invokevirtual   #255 <Method void ArrayList.clear()>
		p = j1;
	//   21   43:aload_0         
	//   22   44:iload           4
	//   23   46:putfield        #79  <Field int p>
		arraylist = ((ArrayList) (v.iterator()));
	//   24   49:aload_0         
	//   25   50:getfield        #93  <Field ArrayList v>
	//   26   53:invokevirtual   #259 <Method Iterator ArrayList.iterator()>
	//   27   56:astore_1        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//   28   57:aload_1         
	//   29   58:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//   30   63:ifeq            114
			RegionListItem regionlistitem = (RegionListItem)((Iterator) (arraylist)).next();
	//   31   66:aload_1         
	//   32   67:invokeinterface #268 <Method Object Iterator.next()>
	//   33   72:checkcast       #270 <Class RegionListItem>
	//   34   75:astore          5
			if(regionlistitem.getIsSelected())
	//*  35   77:aload           5
	//*  36   79:invokevirtual   #273 <Method boolean RegionListItem.getIsSelected()>
	//*  37   82:ifeq            57
			{
				j.add(((Object) (regionlistitem.getRegionId())));
	//   38   85:aload_0         
	//   39   86:getfield        #89  <Field ArrayList j>
	//   40   89:aload           5
	//   41   91:invokevirtual   #276 <Method String RegionListItem.getRegionId()>
	//   42   94:invokevirtual   #280 <Method boolean ArrayList.add(Object)>
	//   43   97:pop             
				w.add(((Object) (regionlistitem.getName())));
	//   44   98:aload_0         
	//   45   99:getfield        #95  <Field ArrayList w>
	//   46  102:aload           5
	//   47  104:invokevirtual   #281 <Method String RegionListItem.getName()>
	//   48  107:invokevirtual   #280 <Method boolean ArrayList.add(Object)>
	//   49  110:pop             
			}
		} while(true);
	//   50  111:goto            57
		b(floorplanlistitem, i1);
	//   51  114:aload_0         
	//   52  115:aload_2         
	//   53  116:iload_3         
	//   54  117:invokevirtual   #284 <Method void b(FloorPlanListItem, int)>
	//   55  120:return          
	}

	static AssetInfo b(o o1)
	{
		return o1.s;
	//    0    0:aload_0         
	//    1    1:getfield        #288 <Field AssetInfo s>
	//    2    4:areturn         
	}

	static String j()
	{
		return n;
	//    0    0:getstatic       #138 <Field String n>
	//    1    3:areturn         
	}

	private void k()
	{
		if(t != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field o$b t>
	//*   2    4:ifnull          16
			t.i();
	//    3    7:aload_0         
	//    4    8:getfield        #84  <Field o$b t>
	//    5   11:invokeinterface #290 <Method void com.irobot.home.fragments.o$b.i()>
		v.clear();
	//    6   16:aload_0         
	//    7   17:getfield        #93  <Field ArrayList v>
	//    8   20:invokevirtual   #255 <Method void ArrayList.clear()>
		B.a(v, p);
	//    9   23:aload_0         
	//   10   24:getfield        #292 <Field i B>
	//   11   27:aload_0         
	//   12   28:getfield        #93  <Field ArrayList v>
	//   13   31:aload_0         
	//   14   32:getfield        #79  <Field int p>
	//   15   35:invokevirtual   #295 <Method void i.a(ArrayList, int)>
		u.clear();
	//   16   38:aload_0         
	//   17   39:getfield        #91  <Field ArrayList u>
	//   18   42:invokevirtual   #255 <Method void ArrayList.clear()>
		if(C != null)
	//*  19   45:aload_0         
	//*  20   46:getfield        #124 <Field h C>
	//*  21   49:ifnull          59
			C.clear();
	//   22   52:aload_0         
	//   23   53:getfield        #124 <Field h C>
	//   24   56:invokevirtual   #296 <Method void h.clear()>
	//   25   59:return          
	}

	private void l()
	{
		t.h();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field o$b t>
	//    2    4:invokeinterface #299 <Method void com.irobot.home.fragments.o$b.h()>
	//    3    9:return          
	}

	public void a()
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #305 <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_1        
		mapsuiservicedata.setFloorPlanSelectionListItem(q, r);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #307 <Field FloorPlanListItem q>
	//    5    9:aload_0         
	//    6   10:getfield        #309 <Field int r>
	//    7   13:invokevirtual   #312 <Method void MapsUIServiceData.setFloorPlanSelectionListItem(FloorPlanListItem, int)>
		mapsuiservicedata.setFloorPlanMapsDestination(PersistentMapsDestination.MapCustomizaton);
	//    8   16:aload_1         
	//    9   17:getstatic       #318 <Field PersistentMapsDestination PersistentMapsDestination.MapCustomizaton>
	//   10   20:invokevirtual   #322 <Method void MapsUIServiceData.setFloorPlanMapsDestination(PersistentMapsDestination)>
		z.sendCommand(MapsUIServiceCommand.PerformNavigation, mapsuiservicedata);
	//   11   23:aload_0         
	//   12   24:getfield        #97  <Field MapsUIService z>
	//   13   27:getstatic       #328 <Field MapsUIServiceCommand MapsUIServiceCommand.PerformNavigation>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #334 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   16   34:return          
	}

	public void a(FloorPlanListItem floorplanlistitem, int i1)
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #305 <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_3        
		mapsuiservicedata.setFloorPlanSelectionListItem(floorplanlistitem, i1);
	//    2    4:aload_3         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #312 <Method void MapsUIServiceData.setFloorPlanSelectionListItem(FloorPlanListItem, int)>
		z.sendCommand(MapsUIServiceCommand.HandleFloorSelection, mapsuiservicedata);
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field MapsUIService z>
	//    8   14:getstatic       #337 <Field MapsUIServiceCommand MapsUIServiceCommand.HandleFloorSelection>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #334 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   11   21:return          
	}

	public void a(b b1)
	{
		t = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field o$b t>
	//    3    5:return          
	}

	protected void b()
	{
		i.setHasFixedSize(true);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field RecyclerView i>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #342 <Method void RecyclerView.setHasFixedSize(boolean)>
		D = ((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((android.content.Context) (getActivity())))));
	//    4    8:aload_0         
	//    5    9:new             #344 <Class LinearLayoutManager>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #118 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    9   17:invokespecial   #347 <Method void LinearLayoutManager(android.content.Context)>
	//   10   20:putfield        #349 <Field android.support.v7.widget.RecyclerView$h D>
		i.setLayoutManager(D);
	//   11   23:aload_0         
	//   12   24:getfield        #232 <Field RecyclerView i>
	//   13   27:aload_0         
	//   14   28:getfield        #349 <Field android.support.v7.widget.RecyclerView$h D>
	//   15   31:invokevirtual   #353 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		B = new i(v, ((android.content.Context) (getActivity())));
	//   16   34:aload_0         
	//   17   35:new             #294 <Class i>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:getfield        #93  <Field ArrayList v>
	//   21   43:aload_0         
	//   22   44:invokevirtual   #118 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   23   47:invokespecial   #356 <Method void i(ArrayList, android.content.Context)>
	//   24   50:putfield        #292 <Field i B>
		B.a(((com.irobot.home.b.i.b) (this)));
	//   25   53:aload_0         
	//   26   54:getfield        #292 <Field i B>
	//   27   57:aload_0         
	//   28   58:invokevirtual   #359 <Method void i.a(com.irobot.home.b.i$b)>
		B.a(((com.irobot.home.b.i.d) (this)));
	//   29   61:aload_0         
	//   30   62:getfield        #292 <Field i B>
	//   31   65:aload_0         
	//   32   66:invokevirtual   #362 <Method void i.a(com.irobot.home.b.i$d)>
		i.setAdapter(((android.support.v7.widget.RecyclerView.a) (B)));
	//   33   69:aload_0         
	//   34   70:getfield        #232 <Field RecyclerView i>
	//   35   73:aload_0         
	//   36   74:getfield        #292 <Field i B>
	//   37   77:invokevirtual   #365 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		i.invalidate();
	//   38   80:aload_0         
	//   39   81:getfield        #232 <Field RecyclerView i>
	//   40   84:invokevirtual   #366 <Method void RecyclerView.invalidate()>
		s = com.irobot.home.util.j.j().a();
	//   41   87:aload_0         
	//   42   88:invokestatic    #371 <Method a j.j()>
	//   43   91:invokevirtual   #376 <Method AssetInfo a.a()>
	//   44   94:putfield        #288 <Field AssetInfo s>
		z = Assembler.getInstance().getMapsUIService(s.getAssetId());
	//   45   97:aload_0         
	//   46   98:invokestatic    #382 <Method Assembler Assembler.getInstance()>
	//   47  101:aload_0         
	//   48  102:getfield        #288 <Field AssetInfo s>
	//   49  105:invokevirtual   #388 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   50  108:invokevirtual   #392 <Method MapsUIService Assembler.getMapsUIService(com.irobot.core.AssetId)>
	//   51  111:putfield        #97  <Field MapsUIService z>
		A = new a(this);
	//   52  114:aload_0         
	//   53  115:new             #18  <Class o$a>
	//   54  118:dup             
	//   55  119:aload_0         
	//   56  120:aconst_null     
	//   57  121:invokespecial   #395 <Method void o$a(o, o$1)>
	//   58  124:putfield        #99  <Field o$a A>
	//   59  127:return          
	}

	public void b(int i1)
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #305 <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_2        
		mapsuiservicedata.setToggleRegionSelectionId(((RegionListItem)v.get(i1)).getRegionId());
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field ArrayList v>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//    7   13:checkcast       #270 <Class RegionListItem>
	//    8   16:invokevirtual   #276 <Method String RegionListItem.getRegionId()>
	//    9   19:invokevirtual   #399 <Method void MapsUIServiceData.setToggleRegionSelectionId(String)>
		z.sendCommand(MapsUIServiceCommand.ToggleRegionSelectionId, mapsuiservicedata);
	//   10   22:aload_0         
	//   11   23:getfield        #97  <Field MapsUIService z>
	//   12   26:getstatic       #402 <Field MapsUIServiceCommand MapsUIServiceCommand.ToggleRegionSelectionId>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #334 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   15   33:return          
	}

	protected void b(FloorPlanListItem floorplanlistitem, int i1)
	{
		q = floorplanlistitem;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #307 <Field FloorPlanListItem q>
		r = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #309 <Field int r>
		B.a(v, p);
	//    6   10:aload_0         
	//    7   11:getfield        #292 <Field i B>
	//    8   14:aload_0         
	//    9   15:getfield        #93  <Field ArrayList v>
	//   10   18:aload_0         
	//   11   19:getfield        #79  <Field int p>
	//   12   22:invokevirtual   #295 <Method void i.a(ArrayList, int)>
		t.a(v, floorplanlistitem);
	//   13   25:aload_0         
	//   14   26:getfield        #84  <Field o$b t>
	//   15   29:aload_0         
	//   16   30:getfield        #93  <Field ArrayList v>
	//   17   33:aload_1         
	//   18   34:invokeinterface #405 <Method void com.irobot.home.fragments.o$b.a(ArrayList, FloorPlanListItem)>
	//   19   39:return          
	}

	public void c()
	{
		MapsUIServiceData.create();
	//    0    0:invokestatic    #305 <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:pop             
		z.sendCommand(MapsUIServiceCommand.StartMissionAction, ((MapsUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field MapsUIService z>
	//    4    8:getstatic       #408 <Field MapsUIServiceCommand MapsUIServiceCommand.StartMissionAction>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #334 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//    7   15:return          
	}

	public String d()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field String k>
	//    2    4:areturn         
	}

	public String e()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field String x>
	//    2    4:areturn         
	}

	public String f()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field String y>
	//    2    4:areturn         
	}

	public ArrayList g()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ArrayList j>
	//    2    4:areturn         
	}

	public ArrayList h()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ArrayList w>
	//    2    4:areturn         
	}

	public int i()
	{
		return j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ArrayList j>
	//    2    4:invokevirtual   #163 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void j.onPause()>
		z.unregisterSubscriber(((com.irobot.core.MapsUIServiceDataCallback) (A)));
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field MapsUIService z>
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field o$a A>
	//    6   12:invokevirtual   #418 <Method boolean MapsUIService.unregisterSubscriber(com.irobot.core.MapsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #421 <Method void j.onResume()>
		k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #423 <Method void k()>
		z.registerUISubscriber(((com.irobot.core.MapsUIServiceDataCallback) (A)));
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field MapsUIService z>
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field o$a A>
	//    8   16:invokevirtual   #426 <Method boolean MapsUIService.registerUISubscriber(com.irobot.core.MapsUIServiceDataCallback)>
	//    9   19:pop             
		y y1 = new y(this) {

			public void b(View view)
			{
				a.n = null;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field o a>
			//    2    4:aconst_null     
			//    3    5:putfield        #22  <Field android.support.v7.view.h o.n>
				a.c.requestLayout();
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field o a>
			//    6   12:getfield        #26  <Field ActionBarContainer o.c>
			//    7   15:invokevirtual   #31  <Method void ActionBarContainer.requestLayout()>
			//    8   18:return          
			}

			final o a;

			
			{
				a = o1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field o a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void y()>
			//    5    9:return          
			}
		}
;
	//   10   20:new             #14  <Class o$2>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #427 <Method void o$2(o)>
	//   14   28:astore_1        
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//   15   29:invokestatic    #305 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   16   32:astore_2        
		mapsuiservicedata.setFloorPlanListItemMode(((java.util.HashSet) (y1)));
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #431 <Method void MapsUIServiceData.setFloorPlanListItemMode(java.util.HashSet)>
		z.sendCommand(MapsUIServiceCommand.SetFloorListItemModes, mapsuiservicedata);
	//   20   38:aload_0         
	//   21   39:getfield        #97  <Field MapsUIService z>
	//   22   42:getstatic       #434 <Field MapsUIServiceCommand MapsUIServiceCommand.SetFloorListItemModes>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #334 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		if(k != null && !j.isEmpty())
	//*  25   49:aload_0         
	//*  26   50:getfield        #242 <Field String k>
	//*  27   53:ifnull          102
	//*  28   56:aload_0         
	//*  29   57:getfield        #89  <Field ArrayList j>
	//*  30   60:invokevirtual   #149 <Method boolean ArrayList.isEmpty()>
	//*  31   63:ifne            102
		{
			com.irobot.home.util.o.b(n, "Load up existing selections.");
	//   32   66:getstatic       #138 <Field String n>
	//   33   69:ldc2            #436 <String "Load up existing selections.">
	//   34   72:invokestatic    #189 <Method void com.irobot.home.util.o.b(String, String)>
			mapsuiservicedata.setActiveFloorMapId(k);
	//   35   75:aload_2         
	//   36   76:aload_0         
	//   37   77:getfield        #242 <Field String k>
	//   38   80:invokevirtual   #439 <Method void MapsUIServiceData.setActiveFloorMapId(String)>
			mapsuiservicedata.setActiveFloorRegionIds(j);
	//   39   83:aload_2         
	//   40   84:aload_0         
	//   41   85:getfield        #89  <Field ArrayList j>
	//   42   88:invokevirtual   #442 <Method void MapsUIServiceData.setActiveFloorRegionIds(ArrayList)>
			z.sendCommand(MapsUIServiceCommand.SetActiveFloorAndRegions, mapsuiservicedata);
	//   43   91:aload_0         
	//   44   92:getfield        #97  <Field MapsUIService z>
	//   45   95:getstatic       #445 <Field MapsUIServiceCommand MapsUIServiceCommand.SetActiveFloorAndRegions>
	//   46   98:aload_2         
	//   47   99:invokevirtual   #334 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		}
	//   48  102:return          
	}

	private static final String n = "o";
	private a A;
	private i B;
	private h C;
	private android.support.v7.widget.RecyclerView.h D;
	IRobotApplication a;
	protected Spinner b;
	protected View c;
	protected TextView d;
	protected TextView e;
	protected View f;
	protected RecyclerView i;
	protected ArrayList j;
	protected String k;
	protected boolean l;
	protected boolean m;
	private final int o = 1;
	private int p;
	private FloorPlanListItem q;
	private int r;
	private AssetInfo s;
	private b t;
	private ArrayList u;
	private ArrayList v;
	private ArrayList w;
	private String x;
	private String y;
	private MapsUIService z;

	static 
	{
	//    0    0:return          
	}

	// Unreferenced inner class android/support/v7/app/o$3

/* anonymous class */
	static class _cls3
		implements z
	{

		public void a(View view)
		{
			((View)a.c.getParent()).invalidate();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field o a>
		//    2    4:getfield        #23  <Field ActionBarContainer o.c>
		//    3    7:invokevirtual   #29  <Method android.view.ViewParent ActionBarContainer.getParent()>
		//    4   10:checkcast       #31  <Class View>
		//    5   13:invokevirtual   #34  <Method void View.invalidate()>
		//    6   16:return          
		}

		final o a;

			
			{
				a = o1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field o a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}

}
