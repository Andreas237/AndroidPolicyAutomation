// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static class TabLayout$TabLayoutOnPageChangeListener
	implements android.support.v4.view.ViewPager.OnPageChangeListener
{

	public void onPageScrollStateChanged(int i)
	{
		previousScrollState = scrollState;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field int scrollState>
	//    3    5:putfield        #34  <Field int previousScrollState>
		scrollState = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #32  <Field int scrollState>
	//    7   13:return          
	}

	public void onPageScrolled(int i, float f, int j)
	{
		TabLayout tablayout = (TabLayout)tabLayoutRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference tabLayoutRef>
	//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class TabLayout>
	//    4   10:astore          6
		if(tablayout != null)
	//*   5   12:aload           6
	//*   6   14:ifnull          79
		{
			j = scrollState;
	//    7   17:aload_0         
	//    8   18:getfield        #32  <Field int scrollState>
	//    9   21:istore_3        
			boolean flag1 = false;
	//   10   22:iconst_0        
	//   11   23:istore          5
			boolean flag;
			if(j == 2 && previousScrollState != 1)
	//*  12   25:iload_3         
	//*  13   26:iconst_2        
	//*  14   27:icmpne          47
	//*  15   30:aload_0         
	//*  16   31:getfield        #34  <Field int previousScrollState>
	//*  17   34:iconst_1        
	//*  18   35:icmpne          41
	//*  19   38:goto            47
				flag = false;
	//   20   41:iconst_0        
	//   21   42:istore          4
			else
	//*  22   44:goto            50
				flag = true;
	//   23   47:iconst_1        
	//   24   48:istore          4
			if(scrollState != 2 || previousScrollState != 0)
	//*  25   50:aload_0         
	//*  26   51:getfield        #32  <Field int scrollState>
	//*  27   54:iconst_2        
	//*  28   55:icmpne          65
	//*  29   58:aload_0         
	//*  30   59:getfield        #34  <Field int previousScrollState>
	//*  31   62:ifeq            68
				flag1 = true;
	//   32   65:iconst_1        
	//   33   66:istore          5
			tablayout.setScrollPosition(i, f, flag, flag1);
	//   34   68:aload           6
	//   35   70:iload_1         
	//   36   71:fload_2         
	//   37   72:iload           4
	//   38   74:iload           5
	//   39   76:invokevirtual   #44  <Method void TabLayout.setScrollPosition(int, float, boolean, boolean)>
		}
	//   40   79:return          
	}

	public void onPageSelected(int i)
	{
		TabLayout tablayout = (TabLayout)tabLayoutRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference tabLayoutRef>
	//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class TabLayout>
	//    4   10:astore          4
		if(tablayout != null && tablayout.getSelectedTabPosition() != i && i < tablayout.getTabCount())
	//*   5   12:aload           4
	//*   6   14:ifnull          78
	//*   7   17:aload           4
	//*   8   19:invokevirtual   #49  <Method int TabLayout.getSelectedTabPosition()>
	//*   9   22:iload_1         
	//*  10   23:icmpeq          78
	//*  11   26:iload_1         
	//*  12   27:aload           4
	//*  13   29:invokevirtual   #52  <Method int TabLayout.getTabCount()>
	//*  14   32:icmpge          78
		{
			int j = scrollState;
	//   15   35:aload_0         
	//   16   36:getfield        #32  <Field int scrollState>
	//   17   39:istore_2        
			boolean flag;
			if(j != 0 && (j != 2 || previousScrollState != 0))
	//*  18   40:iload_2         
	//*  19   41:ifeq            64
	//*  20   44:iload_2         
	//*  21   45:iconst_2        
	//*  22   46:icmpne          59
	//*  23   49:aload_0         
	//*  24   50:getfield        #34  <Field int previousScrollState>
	//*  25   53:ifne            59
	//*  26   56:goto            64
				flag = false;
	//   27   59:iconst_0        
	//   28   60:istore_3        
			else
	//*  29   61:goto            66
				flag = true;
	//   30   64:iconst_1        
	//   31   65:istore_3        
			tablayout.selectTab(tablayout.getTabAt(i), flag);
	//   32   66:aload           4
	//   33   68:aload           4
	//   34   70:iload_1         
	//   35   71:invokevirtual   #56  <Method TabLayout$Tab TabLayout.getTabAt(int)>
	//   36   74:iload_3         
	//   37   75:invokevirtual   #60  <Method void TabLayout.selectTab(TabLayout$Tab, boolean)>
		}
	//   38   78:return          
	}

	void reset()
	{
		scrollState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #32  <Field int scrollState>
		previousScrollState = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #34  <Field int previousScrollState>
	//    6   10:return          
	}

	private int previousScrollState;
	private int scrollState;
	private final WeakReference tabLayoutRef;

	public TabLayout$TabLayoutOnPageChangeListener(TabLayout tablayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		tabLayoutRef = new WeakReference(((Object) (tablayout)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
	//    7   13:putfield        #27  <Field WeakReference tabLayoutRef>
	//    8   16:return          
	}
}
