// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerListView;

public class BonusPickerPagerAdapter$ViewHolder_ViewBinding
	implements Unbinder
{

	public void unbind()
	{
		BonusPickerPagerAdapter.ViewHolder viewholder = target;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BonusPickerPagerAdapter$ViewHolder target>
	//    2    4:astore_1        
		if(viewholder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field BonusPickerPagerAdapter$ViewHolder target>
			viewholder.bplvBonusList = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #33  <Field BonusPickerListView BonusPickerPagerAdapter$ViewHolder.bplvBonusList>
			return;
	//   11   19:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   12   20:new             #39  <Class IllegalStateException>
	//   13   23:dup             
	//   14   24:ldc1            #41  <String "Bindings already cleared.">
	//   15   26:invokespecial   #44  <Method void IllegalStateException(String)>
	//   16   29:athrow          
		}
	}

	private BonusPickerPagerAdapter.ViewHolder target;

	public BonusPickerPagerAdapter$ViewHolder_ViewBinding(BonusPickerPagerAdapter.ViewHolder viewholder, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		target = viewholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field BonusPickerPagerAdapter$ViewHolder target>
		viewholder.bplvBonusList = (BonusPickerListView)Utils.findRequiredViewAsType(view, 0x7f0900bf, "field 'bplvBonusList'", com/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #17  <Int 0x7f0900bf>
	//    8   13:ldc1            #19  <String "field 'bplvBonusList'">
	//    9   15:ldc1            #21  <Class BonusPickerListView>
	//   10   17:invokestatic    #27  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #21  <Class BonusPickerListView>
	//   12   23:putfield        #33  <Field BonusPickerListView BonusPickerPagerAdapter$ViewHolder.bplvBonusList>
	//   13   26:return          
	}
}
