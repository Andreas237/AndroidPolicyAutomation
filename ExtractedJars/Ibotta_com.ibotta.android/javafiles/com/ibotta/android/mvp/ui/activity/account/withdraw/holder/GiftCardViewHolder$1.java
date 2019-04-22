// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.view.View;
import com.ibotta.api.model.card.GiftCard;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.holder:
//			GiftCardViewHolder

class GiftCardViewHolder$1
	implements android.view.View$OnClickListener
{

	public void onClick(View view)
	{
		GiftCardViewHolder.access$000(GiftCardViewHolder.this, (GiftCard)view.getTag());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GiftCardViewHolder this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method Object View.getTag()>
	//    4    8:checkcast       #31  <Class GiftCard>
	//    5   11:invokestatic    #35  <Method void GiftCardViewHolder.access$000(GiftCardViewHolder, GiftCard)>
	//    6   14:return          
	}

	final GiftCardViewHolder this$0;

	GiftCardViewHolder$1()
	{
		this$0 = GiftCardViewHolder.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GiftCardViewHolder this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
