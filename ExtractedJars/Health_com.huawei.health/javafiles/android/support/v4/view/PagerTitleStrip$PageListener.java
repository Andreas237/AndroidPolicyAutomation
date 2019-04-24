// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip, ViewPager, PagerAdapter

class PagerTitleStrip$PageListener extends DataSetObserver
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
		float f;
		if(mLastKnownPositionOffset >= 0.0F)
	//*  11   27:aload_0         
	//*  12   28:getfield        #19  <Field PagerTitleStrip this$0>
	//*  13   31:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//*  14   34:fconst_0        
	//*  15   35:fcmpl           
	//*  16   36:iflt            50
			f = mLastKnownPositionOffset;
	//   17   39:aload_0         
	//   18   40:getfield        #19  <Field PagerTitleStrip this$0>
	//   19   43:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   20   46:fstore_1        
		else
	//*  21   47:goto            52
			f = 0.0F;
	//   22   50:fconst_0        
	//   23   51:fstore_1        
		updateTextPositions(mPager.getCurrentItem(), f, true);
	//   24   52:aload_0         
	//   25   53:getfield        #19  <Field PagerTitleStrip this$0>
	//   26   56:aload_0         
	//   27   57:getfield        #19  <Field PagerTitleStrip this$0>
	//   28   60:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   29   63:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   30   66:fload_1         
	//   31   67:iconst_1        
	//   32   68:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
	//   33   71:return          
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
	//*   2    4:ifne            78
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
			float f;
			if(mLastKnownPositionOffset >= 0.0F)
	//*  14   34:aload_0         
	//*  15   35:getfield        #19  <Field PagerTitleStrip this$0>
	//*  16   38:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//*  17   41:fconst_0        
	//*  18   42:fcmpl           
	//*  19   43:iflt            57
				f = mLastKnownPositionOffset;
	//   20   46:aload_0         
	//   21   47:getfield        #19  <Field PagerTitleStrip this$0>
	//   22   50:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
	//   23   53:fstore_2        
			else
	//*  24   54:goto            59
				f = 0.0F;
	//   25   57:fconst_0        
	//   26   58:fstore_2        
			updateTextPositions(mPager.getCurrentItem(), f, true);
	//   27   59:aload_0         
	//   28   60:getfield        #19  <Field PagerTitleStrip this$0>
	//   29   63:aload_0         
	//   30   64:getfield        #19  <Field PagerTitleStrip this$0>
	//   31   67:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
	//   32   70:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
	//   33   73:fload_2         
	//   34   74:iconst_1        
	//   35   75:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		}
	//   36   78:return          
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
