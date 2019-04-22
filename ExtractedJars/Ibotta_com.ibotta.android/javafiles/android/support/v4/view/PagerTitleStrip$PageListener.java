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
		PagerTitleStrip pagertitlestrip = PagerTitleStrip.this;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PagerTitleStrip this$0>
	//    2    4:astore_3        
		pagertitlestrip.updateText(pagertitlestrip.mPager.getCurrentItem(), mPager.getAdapter());
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//    6   10:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field PagerTitleStrip this$0>
	//    9   17:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   10   20:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
	//   11   23:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
		float f1 = mLastKnownPositionOffset;
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field PagerTitleStrip this$0>
	//   14   30:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   15   33:fstore_2        
		float f = 0.0F;
	//   16   34:fconst_0        
	//   17   35:fstore_1        
		if(f1 >= 0.0F)
	//*  18   36:fload_2         
	//*  19   37:fconst_0        
	//*  20   38:fcmpl           
	//*  21   39:iflt            50
			f = mLastKnownPositionOffset;
	//   22   42:aload_0         
	//   23   43:getfield        #19  <Field PagerTitleStrip this$0>
	//   24   46:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   25   49:fstore_1        
		pagertitlestrip = PagerTitleStrip.this;
	//   26   50:aload_0         
	//   27   51:getfield        #19  <Field PagerTitleStrip this$0>
	//   28   54:astore_3        
		pagertitlestrip.updateTextPositions(pagertitlestrip.mPager.getCurrentItem(), f, true);
	//   29   55:aload_3         
	//   30   56:aload_3         
	//   31   57:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   32   60:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   33   63:fload_1         
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
	//   36   68:return          
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
	//*   2    4:ifne            81
		{
			PagerTitleStrip pagertitlestrip = PagerTitleStrip.this;
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field PagerTitleStrip this$0>
	//    5   11:astore          4
			pagertitlestrip.updateText(pagertitlestrip.mPager.getCurrentItem(), mPager.getAdapter());
	//    6   13:aload           4
	//    7   15:aload           4
	//    8   17:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//    9   20:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   10   23:aload_0         
	//   11   24:getfield        #19  <Field PagerTitleStrip this$0>
	//   12   27:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   13   30:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
	//   14   33:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
			float f1 = mLastKnownPositionOffset;
	//   15   36:aload_0         
	//   16   37:getfield        #19  <Field PagerTitleStrip this$0>
	//   17   40:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   18   43:fstore_3        
			float f = 0.0F;
	//   19   44:fconst_0        
	//   20   45:fstore_2        
			if(f1 >= 0.0F)
	//*  21   46:fload_3         
	//*  22   47:fconst_0        
	//*  23   48:fcmpl           
	//*  24   49:iflt            60
				f = mLastKnownPositionOffset;
	//   25   52:aload_0         
	//   26   53:getfield        #19  <Field PagerTitleStrip this$0>
	//   27   56:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   28   59:fstore_2        
			pagertitlestrip = PagerTitleStrip.this;
	//   29   60:aload_0         
	//   30   61:getfield        #19  <Field PagerTitleStrip this$0>
	//   31   64:astore          4
			pagertitlestrip.updateTextPositions(pagertitlestrip.mPager.getCurrentItem(), f, true);
	//   32   66:aload           4
	//   33   68:aload           4
	//   34   70:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   35   73:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   36   76:fload_2         
	//   37   77:iconst_1        
	//   38   78:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		}
	//   39   81:return          
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
