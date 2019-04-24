// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.f;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

// Referenced classes of package android.support.v4.widget:
//			NestedScrollView

static class NestedScrollView$a extends a
{

	public void a(View view, b b1)
	{
		super.a(view, b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void a.a(View, b)>
		view = ((View) ((NestedScrollView)view));
	//    4    6:aload_1         
	//    5    7:checkcast       #6   <Class NestedScrollView>
	//    6   10:astore_1        
		b1.b(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
	//    7   11:aload_2         
	//    8   12:ldc1            #17  <Class ScrollView>
	//    9   14:invokevirtual   #23  <Method String Class.getName()>
	//   10   17:invokevirtual   #29  <Method void b.b(CharSequence)>
		if(((NestedScrollView) (view)).isEnabled())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #33  <Method boolean NestedScrollView.isEnabled()>
	//*  13   24:ifeq            70
		{
			int i = ((NestedScrollView) (view)).getScrollRange();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
	//   16   31:istore_3        
			if(i > 0)
	//*  17   32:iload_3         
	//*  18   33:ifle            70
			{
				b1.k(true);
	//   19   36:aload_2         
	//   20   37:iconst_1        
	//   21   38:invokevirtual   #41  <Method void b.k(boolean)>
				if(((NestedScrollView) (view)).getScrollY() > 0)
	//*  22   41:aload_1         
	//*  23   42:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//*  24   45:ifle            55
					b1.a(8192);
	//   25   48:aload_2         
	//   26   49:sipush          8192
	//   27   52:invokevirtual   #47  <Method void b.a(int)>
				if(((NestedScrollView) (view)).getScrollY() < i)
	//*  28   55:aload_1         
	//*  29   56:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//*  30   59:iload_3         
	//*  31   60:icmpge          70
					b1.a(4096);
	//   32   63:aload_2         
	//   33   64:sipush          4096
	//   34   67:invokevirtual   #47  <Method void b.a(int)>
			}
		}
	//   35   70:return          
	}

	public void a(View view, AccessibilityEvent accessibilityevent)
	{
		super.a(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void a.a(View, AccessibilityEvent)>
		view = ((View) ((NestedScrollView)view));
	//    4    6:aload_1         
	//    5    7:checkcast       #6   <Class NestedScrollView>
	//    6   10:astore_1        
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
	//    7   11:aload_2         
	//    8   12:ldc1            #17  <Class ScrollView>
	//    9   14:invokevirtual   #23  <Method String Class.getName()>
	//   10   17:invokevirtual   #55  <Method void AccessibilityEvent.setClassName(CharSequence)>
		boolean flag;
		if(((NestedScrollView) (view)).getScrollRange() > 0)
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
	//*  13   24:ifle            32
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore_3        
		else
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_3        
		accessibilityevent.setScrollable(flag);
	//   19   34:aload_2         
	//   20   35:iload_3         
	//   21   36:invokevirtual   #58  <Method void AccessibilityEvent.setScrollable(boolean)>
		accessibilityevent.setScrollX(((NestedScrollView) (view)).getScrollX());
	//   22   39:aload_2         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #61  <Method int NestedScrollView.getScrollX()>
	//   25   44:invokevirtual   #64  <Method void AccessibilityEvent.setScrollX(int)>
		accessibilityevent.setScrollY(((NestedScrollView) (view)).getScrollY());
	//   26   47:aload_2         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//   29   52:invokevirtual   #67  <Method void AccessibilityEvent.setScrollY(int)>
		f.a(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollX());
	//   30   55:aload_2         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #61  <Method int NestedScrollView.getScrollX()>
	//   33   60:invokestatic    #72  <Method void f.a(android.view.accessibility.AccessibilityRecord, int)>
		f.b(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollRange());
	//   34   63:aload_2         
	//   35   64:aload_1         
	//   36   65:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
	//   37   68:invokestatic    #74  <Method void f.b(android.view.accessibility.AccessibilityRecord, int)>
	//   38   71:return          
	}

	public boolean a(View view, int i, Bundle bundle)
	{
		if(super.a(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #77  <Method boolean a.a(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		view = ((View) ((NestedScrollView)view));
	//    8   12:aload_1         
	//    9   13:checkcast       #6   <Class NestedScrollView>
	//   10   16:astore_1        
		if(!((NestedScrollView) (view)).isEnabled())
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #33  <Method boolean NestedScrollView.isEnabled()>
	//*  13   21:ifne            26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		if(i != 4096)
	//*  16   26:iload_2         
	//*  17   27:sipush          4096
	//*  18   30:icmpeq          94
		{
			if(i != 8192)
	//*  19   33:iload_2         
	//*  20   34:sipush          8192
	//*  21   37:icmpeq          42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			i = ((NestedScrollView) (view)).getHeight();
	//   24   42:aload_1         
	//   25   43:invokevirtual   #80  <Method int NestedScrollView.getHeight()>
	//   26   46:istore_2        
			int j = ((NestedScrollView) (view)).getPaddingBottom();
	//   27   47:aload_1         
	//   28   48:invokevirtual   #83  <Method int NestedScrollView.getPaddingBottom()>
	//   29   51:istore          4
			int l = ((NestedScrollView) (view)).getPaddingTop();
	//   30   53:aload_1         
	//   31   54:invokevirtual   #86  <Method int NestedScrollView.getPaddingTop()>
	//   32   57:istore          5
			i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - j - l), 0);
	//   33   59:aload_1         
	//   34   60:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//   35   63:iload_2         
	//   36   64:iload           4
	//   37   66:isub            
	//   38   67:iload           5
	//   39   69:isub            
	//   40   70:isub            
	//   41   71:iconst_0        
	//   42   72:invokestatic    #92  <Method int Math.max(int, int)>
	//   43   75:istore_2        
			if(i != ((NestedScrollView) (view)).getScrollY())
	//*  44   76:iload_2         
	//*  45   77:aload_1         
	//*  46   78:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//*  47   81:icmpeq          92
			{
				((NestedScrollView) (view)).c(0, i);
	//   48   84:aload_1         
	//   49   85:iconst_0        
	//   50   86:iload_2         
	//   51   87:invokevirtual   #96  <Method void NestedScrollView.c(int, int)>
				return true;
	//   52   90:iconst_1        
	//   53   91:ireturn         
			} else
			{
				return false;
	//   54   92:iconst_0        
	//   55   93:ireturn         
			}
		}
		i = ((NestedScrollView) (view)).getHeight();
	//   56   94:aload_1         
	//   57   95:invokevirtual   #80  <Method int NestedScrollView.getHeight()>
	//   58   98:istore_2        
		int k = ((NestedScrollView) (view)).getPaddingBottom();
	//   59   99:aload_1         
	//   60  100:invokevirtual   #83  <Method int NestedScrollView.getPaddingBottom()>
	//   61  103:istore          4
		int i1 = ((NestedScrollView) (view)).getPaddingTop();
	//   62  105:aload_1         
	//   63  106:invokevirtual   #86  <Method int NestedScrollView.getPaddingTop()>
	//   64  109:istore          5
		i = Math.min(((NestedScrollView) (view)).getScrollY() + (i - k - i1), ((NestedScrollView) (view)).getScrollRange());
	//   65  111:aload_1         
	//   66  112:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//   67  115:iload_2         
	//   68  116:iload           4
	//   69  118:isub            
	//   70  119:iload           5
	//   71  121:isub            
	//   72  122:iadd            
	//   73  123:aload_1         
	//   74  124:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
	//   75  127:invokestatic    #99  <Method int Math.min(int, int)>
	//   76  130:istore_2        
		if(i != ((NestedScrollView) (view)).getScrollY())
	//*  77  131:iload_2         
	//*  78  132:aload_1         
	//*  79  133:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
	//*  80  136:icmpeq          147
		{
			((NestedScrollView) (view)).c(0, i);
	//   81  139:aload_1         
	//   82  140:iconst_0        
	//   83  141:iload_2         
	//   84  142:invokevirtual   #96  <Method void NestedScrollView.c(int, int)>
			return true;
	//   85  145:iconst_1        
	//   86  146:ireturn         
		} else
		{
			return false;
	//   87  147:iconst_0        
	//   88  148:ireturn         
		}
	}

	NestedScrollView$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void a()>
	//    2    4:return          
	}
}
