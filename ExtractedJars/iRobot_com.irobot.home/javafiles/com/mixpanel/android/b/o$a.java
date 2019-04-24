// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.view.View;
import com.mixpanel.android.a.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.mixpanel.android.b:
//			o

public static class o$a extends o$d
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

		public boolean a(String s)
		{
			if(a.d() == s)
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
				return ((a)b).a(s);
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

		public void sendAccessibilityEvent(View view, int i)
		{
			if(i == o.a.a(a))
		//*   0    0:iload_2         
		//*   1    1:aload_0         
		//*   2    2:getfield        #16  <Field o$a a>
		//*   3    5:invokestatic    #40  <Method int o$a.a(o$a)>
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
				b.sendAccessibilityEvent(view, i);
		//   12   26:aload_0         
		//   13   27:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
		//   14   30:aload_1         
		//   15   31:iload_2         
		//   16   32:invokevirtual   #46  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
		//   17   35:return          
		}

		final o.a a;
		private android.view.View.AccessibilityDelegate b;

		public a(android.view.View.AccessibilityDelegate accessibilitydelegate)
		{
			a = o.a.this;
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


	static int a(o$a o$a1)
	{
		return o$a1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int a>
	//    2    4:ireturn         
	}

	private android.view..AccessibilityDelegate d(View view)
	{
		view = ((View) ((android.view..AccessibilityDelegate)((Object) (view)).getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(((Object) (view)), new Object[0])));
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
		return ((android.view..AccessibilityDelegate) (view));
	//   12   25:aload_1         
	//   13   26:areturn         
		view;
	//   14   27:astore_1        
		f.d("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", ((Throwable) (view)));
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
			Object obj = ((Object) ((java.util.Entry)iterator.next()));
	//    8   22:aload_1         
	//    9   23:invokeinterface #90  <Method Object Iterator.next()>
	//   10   28:checkcast       #92  <Class java.util.Map$Entry>
	//   11   31:astore_3        
			View view = (View)((java.util.Entry) (obj)).getKey();
	//   12   32:aload_3         
	//   13   33:invokeinterface #95  <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #97  <Class View>
	//   15   41:astore_2        
			obj = ((Object) ((a)((java.util.Entry) (obj)).getValue()));
	//   16   42:aload_3         
	//   17   43:invokeinterface #100 <Method Object java.util.Map$Entry.getValue()>
	//   18   48:checkcast       #9   <Class o$a$a>
	//   19   51:astore_3        
			android.view..AccessibilityDelegate accessibilitydelegate = d(view);
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
	//   29   67:invokevirtual   #105 <Method android.view.View$AccessibilityDelegate o$a$a.a()>
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
	//   38   90:invokevirtual   #112 <Method void o$a$a.a(o$a$a)>
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
	//*  11   21:invokevirtual   #122 <Method boolean o$a$a.a(String)>
	//*  12   24:ifeq            28
		{
			return;
	//   13   27:return          
		} else
		{
			obj = ((Object) (new a(((android.view..AccessibilityDelegate) (obj)))));
	//   14   28:new             #9   <Class o$a$a>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #125 <Method void o$a$a(o$a, android.view.View$AccessibilityDelegate)>
	//   19   37:astore_2        
			view.setAccessibilityDelegate(((android.view..AccessibilityDelegate) (obj)));
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

	public o$a(List list, int i, String s, o$h o$h)
	{
		super(list, s, o$h, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iconst_0        
	//    5    6:invokespecial   #18  <Method void o$d(List, String, o$h, boolean)>
		a = i;
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
