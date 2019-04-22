// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerListView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusPickerPagerAdapter

protected static class BonusPickerPagerAdapter$ViewHolder
{

	protected BonusPickerListView bplvBonusList;

	public BonusPickerPagerAdapter$ViewHolder(ViewGroup viewgroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		ButterKnife.bind(((Object) (this)), ((android.view.View) (viewgroup)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method butterknife.Unbinder ButterKnife.bind(Object, android.view.View)>
	//    5    9:pop             
	//    6   10:return          
	}
}
