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
		mPreviousScrollState = mScrollState;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field int mScrollState>
	//    3    5:putfield        #34  <Field int mPreviousScrollState>
		mScrollState = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #32  <Field int mScrollState>
	//    7   13:return          
	}

	public void onPageScrolled(int i, float f, int j)
	{
		TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mTabLayoutRef>
	//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class TabLayout>
	//    4   10:astore          6
		if(tablayout != null)
	//*   5   12:aload           6
	//*   6   14:ifnull          65
		{
			boolean flag;
			boolean flag1;
			if(mScrollState != 2 || mPreviousScrollState == 1)
	//*   7   17:aload_0         
	//*   8   18:getfield        #32  <Field int mScrollState>
	//*   9   21:iconst_2        
	//*  10   22:icmpne          33
	//*  11   25:aload_0         
	//*  12   26:getfield        #34  <Field int mPreviousScrollState>
	//*  13   29:iconst_1        
	//*  14   30:icmpne          66
				flag = true;
	//   15   33:iconst_1        
	//   16   34:istore          4
			else
	//*  17   36:aload_0         
	//*  18   37:getfield        #32  <Field int mScrollState>
	//*  19   40:iconst_2        
	//*  20   41:icmpne          51
	//*  21   44:aload_0         
	//*  22   45:getfield        #34  <Field int mPreviousScrollState>
	//*  23   48:ifeq            72
	//*  24   51:iconst_1        
	//*  25   52:istore          5
	//*  26   54:aload           6
	//*  27   56:iload_1         
	//*  28   57:fload_2         
	//*  29   58:iload           4
	//*  30   60:iload           5
	//*  31   62:invokevirtual   #44  <Method void TabLayout.setScrollPosition(int, float, boolean, boolean)>
	//*  32   65:return          
				flag = false;
	//   33   66:iconst_0        
	//   34   67:istore          4
			if(mScrollState != 2 || mPreviousScrollState != 0)
				flag1 = true;
			else
	//*  35   69:goto            36
				flag1 = false;
	//   36   72:iconst_0        
	//   37   73:istore          5
			tablayout.setScrollPosition(i, f, flag, flag1);
		}
	//*  38   75:goto            54
	}

	public void onPageSelected(int i)
	{
		TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mTabLayoutRef>
	//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class TabLayout>
	//    4   10:astore_3        
		if(tablayout != null && tablayout.getSelectedTabPosition() != i && i < tablayout.getTabCount())
	//*   5   11:aload_3         
	//*   6   12:ifnull          65
	//*   7   15:aload_3         
	//*   8   16:invokevirtual   #49  <Method int TabLayout.getSelectedTabPosition()>
	//*   9   19:iload_1         
	//*  10   20:icmpeq          65
	//*  11   23:iload_1         
	//*  12   24:aload_3         
	//*  13   25:invokevirtual   #52  <Method int TabLayout.getTabCount()>
	//*  14   28:icmpge          65
		{
			boolean flag;
			if(mScrollState == 0 || mScrollState == 2 && mPreviousScrollState == 0)
	//*  15   31:aload_0         
	//*  16   32:getfield        #32  <Field int mScrollState>
	//*  17   35:ifeq            53
	//*  18   38:aload_0         
	//*  19   39:getfield        #32  <Field int mScrollState>
	//*  20   42:iconst_2        
	//*  21   43:icmpne          66
	//*  22   46:aload_0         
	//*  23   47:getfield        #34  <Field int mPreviousScrollState>
	//*  24   50:ifne            66
				flag = true;
	//   25   53:iconst_1        
	//   26   54:istore_2        
			else
	//*  27   55:aload_3         
	//*  28   56:aload_3         
	//*  29   57:iload_1         
	//*  30   58:invokevirtual   #56  <Method TabLayout$Tab TabLayout.getTabAt(int)>
	//*  31   61:iload_2         
	//*  32   62:invokevirtual   #60  <Method void TabLayout.selectTab(TabLayout$Tab, boolean)>
	//*  33   65:return          
				flag = false;
	//   34   66:iconst_0        
	//   35   67:istore_2        
			tablayout.selectTab(tablayout.getTabAt(i), flag);
		}
	//*  36   68:goto            55
	}

	void reset()
	{
		mScrollState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #32  <Field int mScrollState>
		mPreviousScrollState = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #34  <Field int mPreviousScrollState>
	//    6   10:return          
	}

	private int mPreviousScrollState;
	private int mScrollState;
	private final WeakReference mTabLayoutRef;

	public TabLayout$TabLayoutOnPageChangeListener(TabLayout tablayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mTabLayoutRef = new WeakReference(((Object) (tablayout)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
	//    7   13:putfield        #27  <Field WeakReference mTabLayoutRef>
	//    8   16:return          
	}
}
