// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			PagerTabStrip, ViewPager

class PagerTabStrip$2
	implements android.view.ener
{

	public void onClick(View view)
	{
		a.a.setCurrentItem(a.a.getCurrentItem() + 1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PagerTabStrip a>
	//    2    4:getfield        #25  <Field ViewPager PagerTabStrip.a>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field PagerTabStrip a>
	//    5   11:getfield        #25  <Field ViewPager PagerTabStrip.a>
	//    6   14:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
	//    7   17:iconst_1        
	//    8   18:iadd            
	//    9   19:invokevirtual   #35  <Method void ViewPager.setCurrentItem(int)>
	//   10   22:return          
	}

	final PagerTabStrip a;

	PagerTabStrip$2(PagerTabStrip pagertabstrip)
	{
		a = pagertabstrip;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field PagerTabStrip a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
