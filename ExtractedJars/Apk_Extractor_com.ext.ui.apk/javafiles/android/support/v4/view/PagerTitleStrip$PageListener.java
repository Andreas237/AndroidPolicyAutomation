// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip, ViewPager, PagerAdapter

private class PagerTitleStrip$PageListener extends DataSetObserver
	implements ener, r
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
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		updateText(mPager.getCurrentItem(), mPager.getAdapter());
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field PagerTitleStrip this$0>
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field PagerTitleStrip this$0>
	//    6   10:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//    7   13:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field PagerTitleStrip this$0>
	//   10   20:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   11   23:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
	//   12   26:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
		if(mLastKnownPositionOffset >= 0.0F)
	//*  13   29:aload_0         
	//*  14   30:getfield        #19  <Field PagerTitleStrip this$0>
	//*  15   33:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//*  16   36:fconst_0        
	//*  17   37:fcmpl           
	//*  18   38:iflt            49
			f = mLastKnownPositionOffset;
	//   19   41:aload_0         
	//   20   42:getfield        #19  <Field PagerTitleStrip this$0>
	//   21   45:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   22   48:fstore_1        
		updateTextPositions(mPager.getCurrentItem(), f, true);
	//   23   49:aload_0         
	//   24   50:getfield        #19  <Field PagerTitleStrip this$0>
	//   25   53:aload_0         
	//   26   54:getfield        #19  <Field PagerTitleStrip this$0>
	//   27   57:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   28   60:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   29   63:fload_1         
	//   30   64:iconst_1        
	//   31   65:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
	//   32   68:return          
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
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		if(mScrollState == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #60  <Field int mScrollState>
	//*   4    6:ifne            75
		{
			updateText(mPager.getCurrentItem(), mPager.getAdapter());
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field PagerTitleStrip this$0>
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field PagerTitleStrip this$0>
	//    9   17:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   10   20:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field PagerTitleStrip this$0>
	//   13   27:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   14   30:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
	//   15   33:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
			if(mLastKnownPositionOffset >= 0.0F)
	//*  16   36:aload_0         
	//*  17   37:getfield        #19  <Field PagerTitleStrip this$0>
	//*  18   40:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//*  19   43:fconst_0        
	//*  20   44:fcmpl           
	//*  21   45:iflt            56
				f = mLastKnownPositionOffset;
	//   22   48:aload_0         
	//   23   49:getfield        #19  <Field PagerTitleStrip this$0>
	//   24   52:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   25   55:fstore_2        
			updateTextPositions(mPager.getCurrentItem(), f, true);
	//   26   56:aload_0         
	//   27   57:getfield        #19  <Field PagerTitleStrip this$0>
	//   28   60:aload_0         
	//   29   61:getfield        #19  <Field PagerTitleStrip this$0>
	//   30   64:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   31   67:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   32   70:fload_2         
	//   33   71:iconst_1        
	//   34   72:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		}
	//   35   75:return          
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
