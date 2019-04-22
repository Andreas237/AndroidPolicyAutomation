// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerActivity, BonusPickerPagerAdapter

class BonusesPickerActivity$1
	implements android.support.design.widget.istener
{

	public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
	{
	//    0    0:return          
	}

	public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
	{
		BonusesPickerActivity.access$000(BonusesPickerActivity.this).setTabVisible(tab);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BonusesPickerActivity this$0>
	//    2    4:invokestatic    #27  <Method BonusPickerPagerAdapter BonusesPickerActivity.access$000(BonusesPickerActivity)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method void BonusPickerPagerAdapter.setTabVisible(android.support.design.widget.TabLayout$Tab)>
	//    5   11:return          
	}

	public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
	{
		BonusesPickerActivity.access$000(BonusesPickerActivity.this).setTabHidden(tab);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BonusesPickerActivity this$0>
	//    2    4:invokestatic    #27  <Method BonusPickerPagerAdapter BonusesPickerActivity.access$000(BonusesPickerActivity)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #36  <Method void BonusPickerPagerAdapter.setTabHidden(android.support.design.widget.TabLayout$Tab)>
	//    5   11:return          
	}

	final BonusesPickerActivity this$0;

	BonusesPickerActivity$1()
	{
		this$0 = BonusesPickerActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BonusesPickerActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
