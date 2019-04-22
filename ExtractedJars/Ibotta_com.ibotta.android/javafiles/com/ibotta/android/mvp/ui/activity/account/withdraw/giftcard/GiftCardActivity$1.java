// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import android.text.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardActivity, GiftCardPresenter

class GiftCardActivity$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		editable = ((Editable) (((Object) (editable)).toString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method String Object.toString()>
	//    2    4:astore_1        
		float f;
		if(!TextUtils.isEmpty(((CharSequence) (editable))))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #32  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifne            20
			f = Float.parseFloat(((String) (editable)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #38  <Method float Float.parseFloat(String)>
	//    8   16:fstore_2        
		else
	//*   9   17:goto            22
			f = 0.0F;
	//   10   20:fconst_0        
	//   11   21:fstore_2        
		((GiftCardPresenter)GiftCardActivity.access$000(GiftCardActivity.this)).onAmountSelected(f);
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field GiftCardActivity this$0>
	//   14   26:invokestatic    #42  <Method com.ibotta.android.mvp.base.MvpPresenter GiftCardActivity.access$000(GiftCardActivity)>
	//   15   29:checkcast       #44  <Class GiftCardPresenter>
	//   16   32:fload_2         
	//   17   33:invokeinterface #48  <Method void GiftCardPresenter.onAmountSelected(float)>
	//   18   38:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final GiftCardActivity this$0;

	GiftCardActivity$1()
	{
		this$0 = GiftCardActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GiftCardActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
