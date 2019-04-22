// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.graphql.offer.OfferGraphQLCall;
import com.ibotta.android.graphql.offer.OfferGraphQLResponse;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.service.api.job.SingleApiJob;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcPresenter, AddUpcView

public class AddUpcPresenterImpl extends AbstractLoadingMvpPresenter
	implements AddUpcPresenter
{

	public AddUpcPresenterImpl(MvpPresenterActions mvppresenteractions, GraphQLCallFactory graphqlcallfactory)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		graphQLCallFactory = graphqlcallfactory;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field GraphQLCallFactory graphQLCallFactory>
	//    6   10:return          
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #25  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void HashSet()>
	//    3    7:astore_1        
		if(offerJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #30  <Field SingleApiJob offerJob>
	//*   6   12:ifnonnull       64
		{
			OfferGraphQLCall offergraphqlcall = graphQLCallFactory.createOfferCall();
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field GraphQLCallFactory graphQLCallFactory>
	//    9   19:invokeinterface #36  <Method OfferGraphQLCall GraphQLCallFactory.createOfferCall()>
	//   10   24:astore_2        
			offergraphqlcall.setOfferId(Integer.valueOf(offerId));
	//   11   25:aload_2         
	//   12   26:aload_0         
	//   13   27:getfield        #38  <Field int offerId>
	//   14   30:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   15   33:invokevirtual   #50  <Method void OfferGraphQLCall.setOfferId(Integer)>
			offergraphqlcall.setIgnoreTargeting(Boolean.valueOf(false));
	//   16   36:aload_2         
	//   17   37:iconst_0        
	//   18   38:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//   19   41:invokevirtual   #59  <Method void OfferGraphQLCall.setIgnoreTargeting(Boolean)>
			offergraphqlcall.setProducts(Boolean.valueOf(false));
	//   20   44:aload_2         
	//   21   45:iconst_0        
	//   22   46:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//   23   49:invokevirtual   #62  <Method void OfferGraphQLCall.setProducts(Boolean)>
			offerJob = new SingleApiJob(((com.ibotta.api.ApiCall) (offergraphqlcall)));
	//   24   52:aload_0         
	//   25   53:new             #64  <Class SingleApiJob>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:invokespecial   #67  <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   29   61:putfield        #30  <Field SingleApiJob offerJob>
		}
		((Set) (hashset)).add(((Object) (offerJob)));
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getfield        #30  <Field SingleApiJob offerJob>
	//   33   69:invokeinterface #73  <Method boolean Set.add(Object)>
	//   34   74:pop             
		return ((Set) (hashset));
	//   35   75:aload_1         
	//   36   76:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		offerJob = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #30  <Field SingleApiJob offerJob>
	//    3    5:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		OfferGraphQLResponse offergraphqlresponse = (OfferGraphQLResponse)offerJob.getApiResponse();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field SingleApiJob offerJob>
	//    2    4:invokevirtual   #81  <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    3    7:checkcast       #83  <Class OfferGraphQLResponse>
	//    4   10:astore_1        
		((AddUpcView)mvpView).setOfferModel(offergraphqlresponse.getOfferAsModel());
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    7   15:checkcast       #89  <Class AddUpcView>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #93  <Method com.ibotta.api.model.OfferModel OfferGraphQLResponse.getOfferAsModel()>
	//   10   22:invokeinterface #97  <Method void AddUpcView.setOfferModel(com.ibotta.api.model.OfferModel)>
	//   11   27:return          
	}

	public void onNoClicked()
	{
		((AddUpcView)mvpView).finishWithNoResult();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #89  <Class AddUpcView>
	//    3    7:invokeinterface #101 <Method void AddUpcView.finishWithNoResult()>
	//    4   12:return          
	}

	public void onYesClicked()
	{
		((AddUpcView)mvpView).finishWithYesResult();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #89  <Class AddUpcView>
	//    3    7:invokeinterface #105 <Method void AddUpcView.finishWithYesResult()>
	//    4   12:return          
	}

	public void setOfferId(int i)
	{
		offerId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int offerId>
	//    3    5:return          
	}

	private final GraphQLCallFactory graphQLCallFactory;
	private int offerId;
	private SingleApiJob offerJob;
}
