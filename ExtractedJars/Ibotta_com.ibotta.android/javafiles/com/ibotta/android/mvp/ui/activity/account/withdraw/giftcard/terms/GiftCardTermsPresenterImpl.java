// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.service.api.job.SingleApiJob;
import com.ibotta.api.call.card.GiftCardsCall;
import com.ibotta.api.call.card.GiftCardsResponse;
import com.ibotta.api.helper.card.GiftCardHelper;
import com.ibotta.api.model.card.GiftCard;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms:
//			GiftCardTermsPresenter, GiftCardTermsView

public class GiftCardTermsPresenterImpl extends AbstractLoadingMvpPresenter
	implements GiftCardTermsPresenter
{

	public GiftCardTermsPresenterImpl(MvpPresenterActions mvppresenteractions, GiftCardHelper giftcardhelper)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		giftCardHelper = giftcardhelper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field GiftCardHelper giftCardHelper>
	//    6   10:return          
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #25  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void HashSet()>
	//    3    7:astore_1        
		if(giftCardsJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #30  <Field SingleApiJob giftCardsJob>
	//*   6   12:ifnonnull       33
			giftCardsJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new GiftCardsCall())));
	//    7   15:aload_0         
	//    8   16:new             #32  <Class SingleApiJob>
	//    9   19:dup             
	//   10   20:new             #34  <Class GiftCardsCall>
	//   11   23:dup             
	//   12   24:invokespecial   #35  <Method void GiftCardsCall()>
	//   13   27:invokespecial   #38  <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   14   30:putfield        #30  <Field SingleApiJob giftCardsJob>
		((Set) (hashset)).add(((Object) (giftCardsJob)));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #30  <Field SingleApiJob giftCardsJob>
	//   18   38:invokeinterface #44  <Method boolean Set.add(Object)>
	//   19   43:pop             
		return ((Set) (hashset));
	//   20   44:aload_1         
	//   21   45:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		giftCardsJob = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #30  <Field SingleApiJob giftCardsJob>
	//    3    5:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		Object obj = ((Object) (((GiftCardsResponse)giftCardsJob.getApiResponse()).getGiftCards()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field SingleApiJob giftCardsJob>
	//    2    4:invokevirtual   #52  <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    3    7:checkcast       #54  <Class GiftCardsResponse>
	//    4   10:invokevirtual   #58  <Method java.util.List GiftCardsResponse.getGiftCards()>
	//    5   13:astore_1        
		obj = ((Object) (giftCardHelper.findById(((java.util.List) (obj)), giftCardId)));
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field GiftCardHelper giftCardHelper>
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #60  <Field int giftCardId>
	//   11   23:invokeinterface #66  <Method GiftCard GiftCardHelper.findById(java.util.List, int)>
	//   12   28:astore_1        
		((GiftCardTermsView)mvpView).setTerms(((GiftCard) (obj)).getTerms());
	//   13   29:aload_0         
	//   14   30:getfield        #70  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   15   33:checkcast       #72  <Class GiftCardTermsView>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #78  <Method String GiftCard.getTerms()>
	//   18   40:invokeinterface #82  <Method void GiftCardTermsView.setTerms(String)>
	//   19   45:return          
	}

	public void setGiftCardId(int i)
	{
		giftCardId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int giftCardId>
	//    3    5:return          
	}

	private final GiftCardHelper giftCardHelper;
	private int giftCardId;
	private SingleApiJob giftCardsJob;
}
