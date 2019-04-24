// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//			a, ViewPager, p

class ViewPager$c extends a
{

	private boolean b()
	{
		return a.b != null && a.b.getCount() > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ViewPager a>
	//    2    4:getfield        #22  <Field p android.support.v4.view.ViewPager.b>
	//    3    7:ifnull          26
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ViewPager a>
	//    6   14:getfield        #22  <Field p android.support.v4.view.ViewPager.b>
	//    7   17:invokevirtual   #28  <Method int p.getCount()>
	//    8   20:iconst_1        
	//    9   21:icmple          26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void a(View view, b b1)
	{
		super.a(view, b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void a.a(View, b)>
		b1.b(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class ViewPager>
	//    6    9:invokevirtual   #37  <Method String Class.getName()>
	//    7   12:invokevirtual   #42  <Method void b.b(CharSequence)>
		b1.k(b());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokespecial   #44  <Method boolean b()>
	//   11   20:invokevirtual   #48  <Method void b.k(boolean)>
		if(a.canScrollHorizontally(1))
	//*  12   23:aload_0         
	//*  13   24:getfield        #13  <Field ViewPager a>
	//*  14   27:iconst_1        
	//*  15   28:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  16   31:ifeq            41
			b1.a(4096);
	//   17   34:aload_2         
	//   18   35:sipush          4096
	//   19   38:invokevirtual   #55  <Method void b.a(int)>
		if(a.canScrollHorizontally(-1))
	//*  20   41:aload_0         
	//*  21   42:getfield        #13  <Field ViewPager a>
	//*  22   45:iconst_m1       
	//*  23   46:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  24   49:ifeq            59
			b1.a(8192);
	//   25   52:aload_2         
	//   26   53:sipush          8192
	//   27   56:invokevirtual   #55  <Method void b.a(int)>
	//   28   59:return          
	}

	public void a(View view, AccessibilityEvent accessibilityevent)
	{
		super.a(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void a.a(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class ViewPager>
	//    6    9:invokevirtual   #37  <Method String Class.getName()>
	//    7   12:invokevirtual   #63  <Method void AccessibilityEvent.setClassName(CharSequence)>
		accessibilityevent.setScrollable(b());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokespecial   #44  <Method boolean b()>
	//   11   20:invokevirtual   #66  <Method void AccessibilityEvent.setScrollable(boolean)>
		if(accessibilityevent.getEventType() == 4096 && a.b != null)
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #69  <Method int AccessibilityEvent.getEventType()>
	//*  14   27:sipush          4096
	//*  15   30:icmpne          79
	//*  16   33:aload_0         
	//*  17   34:getfield        #13  <Field ViewPager a>
	//*  18   37:getfield        #22  <Field p android.support.v4.view.ViewPager.b>
	//*  19   40:ifnull          79
		{
			accessibilityevent.setItemCount(a.b.getCount());
	//   20   43:aload_2         
	//   21   44:aload_0         
	//   22   45:getfield        #13  <Field ViewPager a>
	//   23   48:getfield        #22  <Field p android.support.v4.view.ViewPager.b>
	//   24   51:invokevirtual   #28  <Method int p.getCount()>
	//   25   54:invokevirtual   #72  <Method void AccessibilityEvent.setItemCount(int)>
			accessibilityevent.setFromIndex(a.c);
	//   26   57:aload_2         
	//   27   58:aload_0         
	//   28   59:getfield        #13  <Field ViewPager a>
	//   29   62:getfield        #75  <Field int ViewPager.c>
	//   30   65:invokevirtual   #78  <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(a.c);
	//   31   68:aload_2         
	//   32   69:aload_0         
	//   33   70:getfield        #13  <Field ViewPager a>
	//   34   73:getfield        #75  <Field int ViewPager.c>
	//   35   76:invokevirtual   #81  <Method void AccessibilityEvent.setToIndex(int)>
		}
	//   36   79:return          
	}

	public boolean a(View view, int i, Bundle bundle)
	{
		if(super.a(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #84  <Method boolean a.a(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(i == 4096) goto _L2; else goto _L1
	//    8   12:iload_2         
	//    9   13:sipush          4096
	//   10   16:icmpeq          63
_L1:
		if(i != 8192)
	//*  11   19:iload_2         
	//*  12   20:sipush          8192
	//*  13   23:icmpeq          28
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		if(!a.canScrollHorizontally(-1)) goto _L4; else goto _L3
	//   16   28:aload_0         
	//   17   29:getfield        #13  <Field ViewPager a>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
	//   20   36:ifeq            61
_L3:
		view = ((View) (a));
	//   21   39:aload_0         
	//   22   40:getfield        #13  <Field ViewPager a>
	//   23   43:astore_1        
		i = a.c - 1;
	//   24   44:aload_0         
	//   25   45:getfield        #13  <Field ViewPager a>
	//   26   48:getfield        #75  <Field int ViewPager.c>
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:istore_2        
_L6:
		((ViewPager) (view)).setCurrentItem(i);
	//   30   54:aload_1         
	//   31   55:iload_2         
	//   32   56:invokevirtual   #87  <Method void ViewPager.setCurrentItem(int)>
		return true;
	//   33   59:iconst_1        
	//   34   60:ireturn         
_L4:
		return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
_L2:
		if(a.canScrollHorizontally(1))
	//*  37   63:aload_0         
	//*  38   64:getfield        #13  <Field ViewPager a>
	//*  39   67:iconst_1        
	//*  40   68:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  41   71:ifeq            92
		{
			view = ((View) (a));
	//   42   74:aload_0         
	//   43   75:getfield        #13  <Field ViewPager a>
	//   44   78:astore_1        
			i = a.c + 1;
	//   45   79:aload_0         
	//   46   80:getfield        #13  <Field ViewPager a>
	//   47   83:getfield        #75  <Field int ViewPager.c>
	//   48   86:iconst_1        
	//   49   87:iadd            
	//   50   88:istore_2        
		} else
	//*  51   89:goto            54
		{
			return false;
	//   52   92:iconst_0        
	//   53   93:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	final ViewPager a;

	ViewPager$c(ViewPager viewpager)
	{
		a = viewpager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ViewPager a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void a()>
	//    5    9:return          
	}
}
