// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip, ViewPager, PagerAdapter

private class PagerTitleStrip$PageListener extends DataSetObserver
	implements r, ener
{

	public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
	{
		updateAdapter(pageradapter, pageradapter1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PagerTitleStrip this$0>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #29  <Method void PagerTitleStrip.updateAdapter(PagerAdapter, PagerAdapter)>
	//    5    9:return          
	}

	public void onChanged()
	{
		updateText(mPager.getCurrentItem(), mPager.getAdapter());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PagerTitleStrip this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field PagerTitleStrip this$0>
	//    4    8:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//    5   11:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field PagerTitleStrip this$0>
	//    8   18:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//    9   21:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
	//   10   24:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
		float f1 = mLastKnownPositionOffset;
	//   11   27:aload_0         
	//   12   28:getfield        #19  <Field PagerTitleStrip this$0>
	//   13   31:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   14   34:fstore_2        
		float f = 0.0F;
	//   15   35:fconst_0        
	//   16   36:fstore_1        
		if(f1 >= 0.0F)
	//*  17   37:fload_2         
	//*  18   38:fconst_0        
	//*  19   39:fcmpl           
	//*  20   40:iflt            51
			f = mLastKnownPositionOffset;
	//   21   43:aload_0         
	//   22   44:getfield        #19  <Field PagerTitleStrip this$0>
	//   23   47:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   24   50:fstore_1        
		updateTextPositions(mPager.getCurrentItem(), f, true);
	//   25   51:aload_0         
	//   26   52:getfield        #19  <Field PagerTitleStrip this$0>
	//   27   55:aload_0         
	//   28   56:getfield        #19  <Field PagerTitleStrip this$0>
	//   29   59:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   30   62:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   31   65:fload_1         
	//   32   66:iconst_1        
	//   33   67:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
	//   34   70:return          
	}

	public void onPageScrollStateChanged(int i)
	{
		mScrollState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int mScrollState>
	//    3    5:return          
	}

	public void onPageScrolled(int i, float f, int j)
	{
		j = i;
	//    0    0:iload_1         
	//    1    1:istore_3        
		if(f > 0.5F)
	//*   2    2:fload_2         
	//*   3    3:ldc1            #63  <Float 0.5F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            13
			j = i + 1;
	//    6    9:iload_1         
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:istore_3        
		updateTextPositions(j, f, false);
	//   10   13:aload_0         
	//   11   14:getfield        #19  <Field PagerTitleStrip this$0>
	//   12   17:iload_3         
	//   13   18:fload_2         
	//   14   19:iconst_0        
	//   15   20:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
	//   16   23:return          
	}

	public void onPageSelected(int i)
	{
		if(mScrollState == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int mScrollState>
	//*   2    4:ifne            77
		{
			updateText(mPager.getCurrentItem(), mPager.getAdapter());
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field PagerTitleStrip this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field PagerTitleStrip this$0>
	//    7   15:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//    8   18:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field PagerTitleStrip this$0>
	//   11   25:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   12   28:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
	//   13   31:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
			float f1 = mLastKnownPositionOffset;
	//   14   34:aload_0         
	//   15   35:getfield        #19  <Field PagerTitleStrip this$0>
	//   16   38:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   17   41:fstore_3        
			float f = 0.0F;
	//   18   42:fconst_0        
	//   19   43:fstore_2        
			if(f1 >= 0.0F)
	//*  20   44:fload_3         
	//*  21   45:fconst_0        
	//*  22   46:fcmpl           
	//*  23   47:iflt            58
				f = mLastKnownPositionOffset;
	//   24   50:aload_0         
	//   25   51:getfield        #19  <Field PagerTitleStrip this$0>
	//   26   54:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   27   57:fstore_2        
			updateTextPositions(mPager.getCurrentItem(), f, true);
	//   28   58:aload_0         
	//   29   59:getfield        #19  <Field PagerTitleStrip this$0>
	//   30   62:aload_0         
	//   31   63:getfield        #19  <Field PagerTitleStrip this$0>
	//   32   66:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   33   69:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   34   72:fload_2         
	//   35   73:iconst_1        
	//   36   74:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		}
	//   37   77:return          
	}

	private int mScrollState;
	final PagerTitleStrip this$0;

	PagerTitleStrip$PageListener()
	{
		this$0 = PagerTitleStrip.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PagerTitleStrip this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
