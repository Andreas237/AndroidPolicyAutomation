// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.support.design.widget.AppBarLayout;
import android.view.View;
import android.view.Window;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.mvp.ui.view.bonus.BonusDetailView;
import com.ibotta.android.mvp.ui.view.bonus.BonusView;
import com.ibotta.android.mvp.ui.view.spotlight.RelatedOffersList;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusDetailActivity

public class BonusDetailActivity_ViewBinding
	implements Unbinder
{

	public BonusDetailActivity_ViewBinding(BonusDetailActivity bonusdetailactivity)
	{
		this(bonusdetailactivity, bonusdetailactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window BonusDetailActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void BonusDetailActivity_ViewBinding(BonusDetailActivity, View)>
	//    6   12:return          
	}

	public BonusDetailActivity_ViewBinding(BonusDetailActivity bonusdetailactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = bonusdetailactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field BonusDetailActivity target>
		bonusdetailactivity.bvBonus = (BonusView)Utils.findRequiredViewAsType(view, 0x7f0900df, "field 'bvBonus'", com/ibotta/android/mvp/ui/view/bonus/BonusView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f0900df>
	//    8   13:ldc1            #36  <String "field 'bvBonus'">
	//    9   15:ldc1            #38  <Class BonusView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class BonusView>
	//   12   23:putfield        #48  <Field BonusView BonusDetailActivity.bvBonus>
		bonusdetailactivity.bdvBonusDetail = (BonusDetailView)Utils.findRequiredViewAsType(view, 0x7f0900b6, "field 'bdvBonusDetail'", com/ibotta/android/mvp/ui/view/bonus/BonusDetailView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #49  <Int 0x7f0900b6>
	//   16   30:ldc1            #51  <String "field 'bdvBonusDetail'">
	//   17   32:ldc1            #53  <Class BonusDetailView>
	//   18   34:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #53  <Class BonusDetailView>
	//   20   40:putfield        #57  <Field BonusDetailView BonusDetailActivity.bdvBonusDetail>
		bonusdetailactivity.srrvRelatedRebates = (RelatedOffersList)Utils.findRequiredViewAsType(view, 0x7f090428, "field 'srrvRelatedRebates'", com/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #58  <Int 0x7f090428>
	//   24   47:ldc1            #60  <String "field 'srrvRelatedRebates'">
	//   25   49:ldc1            #62  <Class RelatedOffersList>
	//   26   51:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #62  <Class RelatedOffersList>
	//   28   57:putfield        #66  <Field RelatedOffersList BonusDetailActivity.srrvRelatedRebates>
		bonusdetailactivity.appBarLayout = (AppBarLayout)Utils.findRequiredViewAsType(view, 0x7f090029, "field 'appBarLayout'", android/support/design/widget/AppBarLayout);
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:ldc1            #67  <Int 0x7f090029>
	//   32   64:ldc1            #69  <String "field 'appBarLayout'">
	//   33   66:ldc1            #71  <Class AppBarLayout>
	//   34   68:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   35   71:checkcast       #71  <Class AppBarLayout>
	//   36   74:putfield        #75  <Field AppBarLayout BonusDetailActivity.appBarLayout>
	//   37   77:return          
	}

	public void unbind()
	{
		BonusDetailActivity bonusdetailactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field BonusDetailActivity target>
	//    2    4:astore_1        
		if(bonusdetailactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field BonusDetailActivity target>
			bonusdetailactivity.bvBonus = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field BonusView BonusDetailActivity.bvBonus>
			bonusdetailactivity.bdvBonusDetail = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #57  <Field BonusDetailView BonusDetailActivity.bdvBonusDetail>
			bonusdetailactivity.srrvRelatedRebates = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #66  <Field RelatedOffersList BonusDetailActivity.srrvRelatedRebates>
			bonusdetailactivity.appBarLayout = null;
	//   17   29:aload_1         
	//   18   30:aconst_null     
	//   19   31:putfield        #75  <Field AppBarLayout BonusDetailActivity.appBarLayout>
			return;
	//   20   34:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   21   35:new             #79  <Class IllegalStateException>
	//   22   38:dup             
	//   23   39:ldc1            #81  <String "Bindings already cleared.">
	//   24   41:invokespecial   #84  <Method void IllegalStateException(String)>
	//   25   44:athrow          
		}
	}

	private BonusDetailActivity target;
}
