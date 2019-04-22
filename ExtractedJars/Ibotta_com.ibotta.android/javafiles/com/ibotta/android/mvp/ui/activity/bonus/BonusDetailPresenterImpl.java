// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.account.bonus.BonusDetailReducer;
import com.ibotta.android.aop.tracking.TrackingAspect;
import com.ibotta.android.features.variant.retailers.LoadRetailersVariant;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.graphql.bonus.*;
import com.ibotta.android.graphql.offer.OffersGraphQLCall;
import com.ibotta.android.graphql.offer.OffersGraphQLResponse;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.service.api.Outcome;
import com.ibotta.android.service.api.job.*;
import com.ibotta.api.call.home.HomeResponse;
import com.ibotta.api.helper.bonus.BonusHelper;
import com.ibotta.api.helper.offer.OfferHelper;
import com.ibotta.api.helper.retailer.RetailerHelper;
import com.ibotta.api.model.*;
import java.util.*;
import org.aspectj.runtime.reflect.Factory;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusDetailPresenter, BonusDetailView

public class BonusDetailPresenterImpl extends AbstractLoadingMvpPresenter
	implements BonusDetailPresenter
{

	public BonusDetailPresenterImpl(MvpPresenterActions mvppresenteractions, RetailerHelper retailerhelper, OfferHelper offerhelper, BonusHelper bonushelper, GraphQLCallFactory graphqlcallfactory, LoadRetailersVariant loadretailersvariant, BonusDetailReducer bonusdetailreducer)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		retailerHelper = retailerhelper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #48  <Field RetailerHelper retailerHelper>
		offerHelper = offerhelper;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #50  <Field OfferHelper offerHelper>
		bonusHelper = bonushelper;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #52  <Field BonusHelper bonusHelper>
		graphQLCallFactory = graphqlcallfactory;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #54  <Field GraphQLCallFactory graphQLCallFactory>
		loadRetailersVariant = loadretailersvariant;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #56  <Field LoadRetailersVariant loadRetailersVariant>
		bonusDetailReducer = bonusdetailreducer;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #58  <Field BonusDetailReducer bonusDetailReducer>
	//   21   39:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("BonusDetailPresenterImpl.java", com/ibotta/android/mvp/ui/activity/bonus/BonusDetailPresenterImpl);
	//    0    0:new             #60  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #62  <String "BonusDetailPresenterImpl.java">
	//    3    6:ldc1            #2   <Class BonusDetailPresenterImpl>
	//    4    8:invokespecial   #65  <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("2", "handleBonusNotFound", "com.ibotta.android.mvp.ui.activity.bonus.BonusDetailPresenterImpl", "", "", "", "void"))), 190);
	//    6   12:aload_0         
	//    7   13:ldc1            #67  <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #69  <String "2">
	//   10   18:ldc1            #71  <String "handleBonusNotFound">
	//   11   20:ldc1            #73  <String "com.ibotta.android.mvp.ui.activity.bonus.BonusDetailPresenterImpl">
	//   12   22:ldc1            #75  <String "">
	//   13   24:ldc1            #75  <String "">
	//   14   26:ldc1            #75  <String "">
	//   15   28:ldc1            #77  <String "void">
	//   16   30:invokevirtual   #81  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:sipush          190
	//   18   36:invokevirtual   #85  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   39:putstatic       #87  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//   20   42:return          
	}

	private void findBonusInResponse()
	{
		if(explicitRequest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field boolean explicitRequest>
	//*   2    4:ifeq            25
		{
			bonusModel = ((BonusGraphQLResponse)bonusByIdJob.getApiResponse()).getBonus();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field SingleApiJob bonusByIdJob>
	//    6   12:invokevirtual   #98  <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    7   15:checkcast       #100 <Class BonusGraphQLResponse>
	//    8   18:invokevirtual   #104 <Method BonusModel BonusGraphQLResponse.getBonus()>
	//    9   21:putfield        #106 <Field BonusModel bonusModel>
			return;
	//   10   24:return          
		}
		List list = ((BonusesGraphQLResponse)bonusesJob.getApiResponse()).getAllBonuses();
	//   11   25:aload_0         
	//   12   26:getfield        #108 <Field SingleApiJob bonusesJob>
	//   13   29:invokevirtual   #98  <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//   14   32:checkcast       #110 <Class BonusesGraphQLResponse>
	//   15   35:invokevirtual   #114 <Method List BonusesGraphQLResponse.getAllBonuses()>
	//   16   38:astore_2        
		bonusModel = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #106 <Field BonusModel bonusModel>
		int i = 0;
	//   20   44:iconst_0        
	//   21   45:istore_1        
		do
		{
			int ai[] = bonusIds;
	//   22   46:aload_0         
	//   23   47:getfield        #116 <Field int[] bonusIds>
	//   24   50:astore_3        
			if(i < ai.length)
	//*  25   51:iload_1         
	//*  26   52:aload_3         
	//*  27   53:arraylength     
	//*  28   54:icmpge          89
			{
				bonusModel = bonusHelper.findBonusById(list, ai[i]);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #52  <Field BonusHelper bonusHelper>
	//   32   62:aload_2         
	//   33   63:aload_3         
	//   34   64:iload_1         
	//   35   65:iaload          
	//   36   66:invokeinterface #122 <Method BonusModel BonusHelper.findBonusById(List, int)>
	//   37   71:putfield        #106 <Field BonusModel bonusModel>
				if(bonusModel != null)
	//*  38   74:aload_0         
	//*  39   75:getfield        #106 <Field BonusModel bonusModel>
	//*  40   78:ifnull          82
					return;
	//   41   81:return          
				i++;
	//   42   82:iload_1         
	//   43   83:iconst_1        
	//   44   84:iadd            
	//   45   85:istore_1        
			} else
	//*  46   86:goto            46
			{
				return;
	//   47   89:return          
			}
		} while(true);
	}

	private int getFirstBonusId()
	{
		int ai[] = bonusIds;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int[] bonusIds>
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i = ((int) (flag));
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(ai != null)
	//*   7    9:aload_3         
	//*   8   10:ifnull          24
		{
			i = ((int) (flag));
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(ai.length > 0)
	//*  11   15:aload_3         
	//*  12   16:arraylength     
	//*  13   17:ifle            24
				i = ai[0];
	//   14   20:aload_3         
	//   15   21:iconst_0        
	//   16   22:iaload          
	//   17   23:istore_1        
		}
		return i;
	//   18   24:iload_1         
	//   19   25:ireturn         
	}

	private RetailerModel getMcommRetailerModel(List list, OfferModel offermodel)
	{
		if(!offermodel.getRetailers().isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #132 <Method Set OfferModel.getRetailers()>
	//*   2    6:invokeinterface #138 <Method boolean Set.isEmpty()>
	//*   3   11:ifne            55
		{
			int i = ((Integer)offermodel.getRetailers().iterator().next()).intValue();
	//    4   14:aload_2         
	//    5   15:invokeinterface #132 <Method Set OfferModel.getRetailers()>
	//    6   20:invokeinterface #142 <Method Iterator Set.iterator()>
	//    7   25:invokeinterface #148 <Method Object Iterator.next()>
	//    8   30:checkcast       #150 <Class Integer>
	//    9   33:invokevirtual   #153 <Method int Integer.intValue()>
	//   10   36:istore_3        
			list = ((List) (retailerHelper.findRetailerById(list, i)));
	//   11   37:aload_0         
	//   12   38:getfield        #48  <Field RetailerHelper retailerHelper>
	//   13   41:aload_1         
	//   14   42:iload_3         
	//   15   43:invokeinterface #159 <Method RetailerModel RetailerHelper.findRetailerById(List, int)>
	//   16   48:astore_1        
			if(list != null)
	//*  17   49:aload_1         
	//*  18   50:ifnull          55
				return ((RetailerModel) (list));
	//   19   53:aload_1         
	//   20   54:areturn         
		}
		return null;
	//   21   55:aconst_null     
	//   22   56:areturn         
	}

	private void handleBonusNotFound()
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)));
	//    0    0:getstatic       #87  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:invokestatic    #171 <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object)>
	//    4    8:astore_1        
		try
		{
			((BonusDetailView)mvpView).showBonusNotFound();
	//    5    9:aload_0         
	//    6   10:getfield        #175 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    7   13:checkcast       #177 <Class BonusDetailView>
	//    8   16:invokeinterface #180 <Method void BonusDetailView.showBonusNotFound()>
		}
	//*   9   21:invokestatic    #186 <Method TrackingAspect TrackingAspect.aspectOf()>
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #190 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
	//*  12   28:return          
		catch(Throwable throwable)
	//*  13   29:astore_2        
		{
			TrackingAspect.aspectOf().after(joinpoint);
	//   14   30:invokestatic    #186 <Method TrackingAspect TrackingAspect.aspectOf()>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #190 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
			throw throwable;
	//   17   37:aload_2         
	//   18   38:athrow          
		}
		TrackingAspect.aspectOf().after(joinpoint);
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #194 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #196 <Method void HashSet()>
	//    3    7:astore_1        
		if(explicitRequest && bonusByIdJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #90  <Field boolean explicitRequest>
	//*   6   12:ifeq            49
	//*   7   15:aload_0         
	//*   8   16:getfield        #92  <Field SingleApiJob bonusByIdJob>
	//*   9   19:ifnonnull       49
			bonusByIdJob = new SingleApiJob(((com.ibotta.api.ApiCall) (graphQLCallFactory.createBonusCall(getFirstBonusId()))));
	//   10   22:aload_0         
	//   11   23:new             #94  <Class SingleApiJob>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #54  <Field GraphQLCallFactory graphQLCallFactory>
	//   15   31:aload_0         
	//   16   32:invokespecial   #198 <Method int getFirstBonusId()>
	//   17   35:invokeinterface #204 <Method BonusGraphQLCall GraphQLCallFactory.createBonusCall(int)>
	//   18   40:invokespecial   #207 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   19   43:putfield        #92  <Field SingleApiJob bonusByIdJob>
		else
	//*  20   46:goto            83
		if(!explicitRequest && bonusesJob == null)
	//*  21   49:aload_0         
	//*  22   50:getfield        #90  <Field boolean explicitRequest>
	//*  23   53:ifne            83
	//*  24   56:aload_0         
	//*  25   57:getfield        #108 <Field SingleApiJob bonusesJob>
	//*  26   60:ifnonnull       83
			bonusesJob = new SingleApiJob(((com.ibotta.api.ApiCall) (graphQLCallFactory.createBonusesCall())));
	//   27   63:aload_0         
	//   28   64:new             #94  <Class SingleApiJob>
	//   29   67:dup             
	//   30   68:aload_0         
	//   31   69:getfield        #54  <Field GraphQLCallFactory graphQLCallFactory>
	//   32   72:invokeinterface #211 <Method BonusesGraphQLCall GraphQLCallFactory.createBonusesCall()>
	//   33   77:invokespecial   #207 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   34   80:putfield        #108 <Field SingleApiJob bonusesJob>
		if(homeJob == null)
	//*  35   83:aload_0         
	//*  36   84:getfield        #213 <Field HomeApiJob homeJob>
	//*  37   87:ifnonnull       102
			homeJob = new HomeApiJob(0);
	//   38   90:aload_0         
	//   39   91:new             #215 <Class HomeApiJob>
	//   40   94:dup             
	//   41   95:iconst_0        
	//   42   96:invokespecial   #218 <Method void HomeApiJob(int)>
	//   43   99:putfield        #213 <Field HomeApiJob homeJob>
		if(offersGraphQLJob == null)
	//*  44  102:aload_0         
	//*  45  103:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//*  46  106:ifnonnull       129
			offersGraphQLJob = new OptionalWaitingApiJob(((com.ibotta.api.ApiCall) (graphQLCallFactory.createOffersCall())));
	//   47  109:aload_0         
	//   48  110:new             #222 <Class OptionalWaitingApiJob>
	//   49  113:dup             
	//   50  114:aload_0         
	//   51  115:getfield        #54  <Field GraphQLCallFactory graphQLCallFactory>
	//   52  118:invokeinterface #226 <Method OffersGraphQLCall GraphQLCallFactory.createOffersCall()>
	//   53  123:invokespecial   #227 <Method void OptionalWaitingApiJob(com.ibotta.api.ApiCall)>
	//   54  126:putfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
		if(explicitRequest)
	//*  55  129:aload_0         
	//*  56  130:getfield        #90  <Field boolean explicitRequest>
	//*  57  133:ifeq            150
			((Set) (hashset)).add(((Object) (bonusByIdJob)));
	//   58  136:aload_1         
	//   59  137:aload_0         
	//   60  138:getfield        #92  <Field SingleApiJob bonusByIdJob>
	//   61  141:invokeinterface #231 <Method boolean Set.add(Object)>
	//   62  146:pop             
		else
	//*  63  147:goto            161
			((Set) (hashset)).add(((Object) (bonusesJob)));
	//   64  150:aload_1         
	//   65  151:aload_0         
	//   66  152:getfield        #108 <Field SingleApiJob bonusesJob>
	//   67  155:invokeinterface #231 <Method boolean Set.add(Object)>
	//   68  160:pop             
		((Set) (hashset)).add(((Object) (homeJob)));
	//   69  161:aload_1         
	//   70  162:aload_0         
	//   71  163:getfield        #213 <Field HomeApiJob homeJob>
	//   72  166:invokeinterface #231 <Method boolean Set.add(Object)>
	//   73  171:pop             
		((Set) (hashset)).add(((Object) (offersGraphQLJob)));
	//   74  172:aload_1         
	//   75  173:aload_0         
	//   76  174:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//   77  177:invokeinterface #231 <Method boolean Set.add(Object)>
	//   78  182:pop             
		return ((Set) (hashset));
	//   79  183:aload_1         
	//   80  184:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		bonusByIdJob = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #92  <Field SingleApiJob bonusByIdJob>
		bonusesJob = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #108 <Field SingleApiJob bonusesJob>
		homeJob = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #213 <Field HomeApiJob homeJob>
		offersGraphQLJob = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//   12   20:return          
	}

	public void onBonusNotFoundDisplayed()
	{
		((BonusDetailView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #177 <Class BonusDetailView>
	//    3    7:invokeinterface #237 <Method void BonusDetailView.finish()>
	//    4   12:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		if(bonusModel == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field BonusModel bonusModel>
	//*   2    4:ifnonnull       12
		{
			handleBonusNotFound();
	//    3    7:aload_0         
	//    4    8:invokespecial   #240 <Method void handleBonusNotFound()>
			return;
	//    5   11:return          
		}
		Object obj = ((Object) ((HomeResponse)homeJob.getApiResponse()));
	//    6   12:aload_0         
	//    7   13:getfield        #213 <Field HomeApiJob homeJob>
	//    8   16:invokevirtual   #241 <Method com.ibotta.api.ApiResponse HomeApiJob.getApiResponse()>
	//    9   19:checkcast       #243 <Class HomeResponse>
	//   10   22:astore          4
		ArrayList arraylist = new ArrayList();
	//   11   24:new             #245 <Class ArrayList>
	//   12   27:dup             
	//   13   28:invokespecial   #246 <Method void ArrayList()>
	//   14   31:astore          5
		if(offersGraphQLJob.getApiResponse() instanceof OffersGraphQLResponse)
	//*  15   33:aload_0         
	//*  16   34:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//*  17   37:invokevirtual   #247 <Method com.ibotta.api.ApiResponse OptionalWaitingApiJob.getApiResponse()>
	//*  18   40:instanceof      #249 <Class OffersGraphQLResponse>
	//*  19   43:ifeq            67
			((List) (arraylist)).addAll(((java.util.Collection) (((OffersGraphQLResponse)offersGraphQLJob.getApiResponse()).getOffersAsModels())));
	//   20   46:aload           5
	//   21   48:aload_0         
	//   22   49:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//   23   52:invokevirtual   #247 <Method com.ibotta.api.ApiResponse OptionalWaitingApiJob.getApiResponse()>
	//   24   55:checkcast       #249 <Class OffersGraphQLResponse>
	//   25   58:invokevirtual   #252 <Method List OffersGraphQLResponse.getOffersAsModels()>
	//   26   61:invokeinterface #258 <Method boolean List.addAll(java.util.Collection)>
	//   27   66:pop             
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   28   67:new             #260 <Class LinkedHashMap>
	//   29   70:dup             
	//   30   71:invokespecial   #261 <Method void LinkedHashMap()>
	//   31   74:astore_3        
		if(bonusModel.getOffers() != null)
	//*  32   75:aload_0         
	//*  33   76:getfield        #106 <Field BonusModel bonusModel>
	//*  34   79:invokeinterface #266 <Method Set BonusModel.getOffers()>
	//*  35   84:ifnull          185
		{
			Iterator iterator = bonusModel.getOffers().iterator();
	//   36   87:aload_0         
	//   37   88:getfield        #106 <Field BonusModel bonusModel>
	//   38   91:invokeinterface #266 <Method Set BonusModel.getOffers()>
	//   39   96:invokeinterface #142 <Method Iterator Set.iterator()>
	//   40  101:astore          6
			do
			{
				if(!iterator.hasNext())
					break;
	//   41  103:aload           6
	//   42  105:invokeinterface #269 <Method boolean Iterator.hasNext()>
	//   43  110:ifeq            185
				int i = ((Integer)iterator.next()).intValue();
	//   44  113:aload           6
	//   45  115:invokeinterface #148 <Method Object Iterator.next()>
	//   46  120:checkcast       #150 <Class Integer>
	//   47  123:invokevirtual   #153 <Method int Integer.intValue()>
	//   48  126:istore_1        
				OfferModel offermodel = offerHelper.findOfferById(((List) (arraylist)), i);
	//   49  127:aload_0         
	//   50  128:getfield        #50  <Field OfferHelper offerHelper>
	//   51  131:aload           5
	//   52  133:iload_1         
	//   53  134:invokeinterface #275 <Method OfferModel OfferHelper.findOfferById(List, int)>
	//   54  139:astore          7
				if(offermodel != null)
	//*  55  141:aload           7
	//*  56  143:ifnull          103
				{
					RetailerModel retailermodel = null;
	//   57  146:aconst_null     
	//   58  147:astore_2        
					if(offerHelper.isShopNow(offermodel))
	//*  59  148:aload_0         
	//*  60  149:getfield        #50  <Field OfferHelper offerHelper>
	//*  61  152:aload           7
	//*  62  154:invokeinterface #279 <Method boolean OfferHelper.isShopNow(OfferModel)>
	//*  63  159:ifeq            174
						retailermodel = getMcommRetailerModel(((HomeResponse) (obj)).getRetailersAsModels(), offermodel);
	//   64  162:aload_0         
	//   65  163:aload           4
	//   66  165:invokevirtual   #282 <Method List HomeResponse.getRetailersAsModels()>
	//   67  168:aload           7
	//   68  170:invokespecial   #284 <Method RetailerModel getMcommRetailerModel(List, OfferModel)>
	//   69  173:astore_2        
					linkedhashmap.put(((Object) (offermodel)), ((Object) (retailermodel)));
	//   70  174:aload_3         
	//   71  175:aload           7
	//   72  177:aload_2         
	//   73  178:invokevirtual   #288 <Method Object LinkedHashMap.put(Object, Object)>
	//   74  181:pop             
				}
			} while(true);
	//   75  182:goto            103
		}
		BonusDetailView bonusdetailview = (BonusDetailView)mvpView;
	//   76  185:aload_0         
	//   77  186:getfield        #175 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   78  189:checkcast       #177 <Class BonusDetailView>
	//   79  192:astore_2        
		obj = ((Object) (bonusModel));
	//   80  193:aload_0         
	//   81  194:getfield        #106 <Field BonusModel bonusModel>
	//   82  197:astore          4
		bonusdetailview.setup(((BonusModel) (obj)), linkedhashmap, bonusDetailReducer.createBonusTitle(((BonusModel) (obj))), bonusDetailReducer.getRelatedOffersTitle());
	//   83  199:aload_2         
	//   84  200:aload           4
	//   85  202:aload_3         
	//   86  203:aload_0         
	//   87  204:getfield        #58  <Field BonusDetailReducer bonusDetailReducer>
	//   88  207:aload           4
	//   89  209:invokevirtual   #294 <Method com.ibotta.android.views.base.title.TitleBarViewState BonusDetailReducer.createBonusTitle(BonusModel)>
	//   90  212:aload_0         
	//   91  213:getfield        #58  <Field BonusDetailReducer bonusDetailReducer>
	//   92  216:invokevirtual   #298 <Method com.ibotta.android.views.base.title.TitleBarViewState BonusDetailReducer.getRelatedOffersTitle()>
	//   93  219:invokeinterface #302 <Method void BonusDetailView.setup(BonusModel, LinkedHashMap, com.ibotta.android.views.base.title.TitleBarViewState, com.ibotta.android.views.base.title.TitleBarViewState)>
		if(isQuest)
	//*  94  224:aload_0         
	//*  95  225:getfield        #304 <Field boolean isQuest>
	//*  96  228:ifeq            264
			((BonusDetailView)mvpView).populateQuestAppBar(bonusDetailReducer.createQuestHeader(bonusModel), (int)bonusModel.getPercentComplete());
	//   97  231:aload_0         
	//   98  232:getfield        #175 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   99  235:checkcast       #177 <Class BonusDetailView>
	//  100  238:aload_0         
	//  101  239:getfield        #58  <Field BonusDetailReducer bonusDetailReducer>
	//  102  242:aload_0         
	//  103  243:getfield        #106 <Field BonusModel bonusModel>
	//  104  246:invokevirtual   #308 <Method com.ibotta.android.views.account.bonus.QuestToolbarViewState BonusDetailReducer.createQuestHeader(BonusModel)>
	//  105  249:aload_0         
	//  106  250:getfield        #106 <Field BonusModel bonusModel>
	//  107  253:invokeinterface #312 <Method float BonusModel.getPercentComplete()>
	//  108  258:f2i             
	//  109  259:invokeinterface #316 <Method void BonusDetailView.populateQuestAppBar(com.ibotta.android.views.account.bonus.QuestToolbarViewState, int)>
	//  110  264:return          
	}

	protected void onFetchFinishedWithFailures()
	{
		super.onFetchFinishedWithFailures();
	//    0    0:aload_0         
	//    1    1:invokespecial   #319 <Method void AbstractLoadingMvpPresenter.onFetchFinishedWithFailures()>
		handleBonusNotFound();
	//    2    4:aload_0         
	//    3    5:invokespecial   #240 <Method void handleBonusNotFound()>
	//    4    8:return          
	}

	protected void onFetchJobSuccess(ApiJob apijob)
	{
		super.onFetchJobSuccess(apijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #323 <Method void AbstractLoadingMvpPresenter.onFetchJobSuccess(ApiJob)>
		apijob = ((ApiJob) ((SingleApiJob)apijob));
	//    3    5:aload_1         
	//    4    6:checkcast       #94  <Class SingleApiJob>
	//    5    9:astore_1        
		boolean flag2 = ((SingleApiJob) (apijob)).getApiCall() instanceof BonusGraphQLCall;
	//    6   10:aload_1         
	//    7   11:invokevirtual   #327 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//    8   14:instanceof      #329 <Class BonusGraphQLCall>
	//    9   17:istore          4
		boolean flag3 = ((SingleApiJob) (apijob)).getApiCall() instanceof BonusesGraphQLCall;
	//   10   19:aload_1         
	//   11   20:invokevirtual   #327 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//   12   23:instanceof      #331 <Class BonusesGraphQLCall>
	//   13   26:istore          5
		apijob = ((ApiJob) (bonusByIdJob));
	//   14   28:aload_0         
	//   15   29:getfield        #92  <Field SingleApiJob bonusByIdJob>
	//   16   32:astore_1        
		boolean flag;
		if(apijob != null && ((SingleApiJob) (apijob)).getOutcome() == Outcome.SUCCESS)
	//*  17   33:aload_1         
	//*  18   34:ifnull          52
	//*  19   37:aload_1         
	//*  20   38:invokevirtual   #335 <Method Outcome SingleApiJob.getOutcome()>
	//*  21   41:getstatic       #341 <Field Outcome Outcome.SUCCESS>
	//*  22   44:if_acmpne       52
			flag = true;
	//   23   47:iconst_1        
	//   24   48:istore_2        
		else
	//*  25   49:goto            54
			flag = false;
	//   26   52:iconst_0        
	//   27   53:istore_2        
		apijob = ((ApiJob) (bonusesJob));
	//   28   54:aload_0         
	//   29   55:getfield        #108 <Field SingleApiJob bonusesJob>
	//   30   58:astore_1        
		boolean flag1;
		if(apijob != null && ((SingleApiJob) (apijob)).getOutcome() == Outcome.SUCCESS)
	//*  31   59:aload_1         
	//*  32   60:ifnull          78
	//*  33   63:aload_1         
	//*  34   64:invokevirtual   #335 <Method Outcome SingleApiJob.getOutcome()>
	//*  35   67:getstatic       #341 <Field Outcome Outcome.SUCCESS>
	//*  36   70:if_acmpne       78
			flag1 = true;
	//   37   73:iconst_1        
	//   38   74:istore_3        
		else
	//*  39   75:goto            80
			flag1 = false;
	//   40   78:iconst_0        
	//   41   79:istore_3        
		if(flag2 && flag || flag3 && flag1)
	//*  42   80:iload           4
	//*  43   82:ifeq            89
	//*  44   85:iload_2         
	//*  45   86:ifne            98
	//*  46   89:iload           5
	//*  47   91:ifeq            166
	//*  48   94:iload_3         
	//*  49   95:ifeq            166
		{
			findBonusInResponse();
	//   50   98:aload_0         
	//   51   99:invokespecial   #343 <Method void findBonusInResponse()>
			apijob = ((ApiJob) (bonusModel));
	//   52  102:aload_0         
	//   53  103:getfield        #106 <Field BonusModel bonusModel>
	//   54  106:astore_1        
			if(apijob == null)
	//*  55  107:aload_1         
	//*  56  108:ifnonnull       120
			{
				offersGraphQLJob.signal(true);
	//   57  111:aload_0         
	//   58  112:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//   59  115:iconst_1        
	//   60  116:invokevirtual   #347 <Method void OptionalWaitingApiJob.signal(boolean)>
				return;
	//   61  119:return          
			}
			apijob = ((ApiJob) (new HashSet(((java.util.Collection) (((BonusModel) (apijob)).getOffers())))));
	//   62  120:new             #194 <Class HashSet>
	//   63  123:dup             
	//   64  124:aload_1         
	//   65  125:invokeinterface #266 <Method Set BonusModel.getOffers()>
	//   66  130:invokespecial   #350 <Method void HashSet(java.util.Collection)>
	//   67  133:astore_1        
			Timber.d("Signaling OffersGraphQLCall to stop waiting and run now.", new Object[0]);
	//   68  134:ldc2            #352 <String "Signaling OffersGraphQLCall to stop waiting and run now.">
	//   69  137:iconst_0        
	//   70  138:anewarray       Object[]
	//   71  141:invokestatic    #360 <Method void Timber.d(String, Object[])>
			((OffersGraphQLCall)offersGraphQLJob.getApiCall()).setOfferIds(((Set) (apijob)));
	//   72  144:aload_0         
	//   73  145:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//   74  148:invokevirtual   #361 <Method com.ibotta.api.ApiCall OptionalWaitingApiJob.getApiCall()>
	//   75  151:checkcast       #363 <Class OffersGraphQLCall>
	//   76  154:aload_1         
	//   77  155:invokevirtual   #367 <Method void OffersGraphQLCall.setOfferIds(Set)>
			offersGraphQLJob.signal(false);
	//   78  158:aload_0         
	//   79  159:getfield        #220 <Field OptionalWaitingApiJob offersGraphQLJob>
	//   80  162:iconst_0        
	//   81  163:invokevirtual   #347 <Method void OptionalWaitingApiJob.signal(boolean)>
		}
	//   82  166:return          
	}

	public void onUnlockCompleted()
	{
		reload();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #371 <Method void reload()>
		((BonusDetailView)mvpView).showUnlockAnimation();
	//    2    4:aload_0         
	//    3    5:getfield        #175 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    4    8:checkcast       #177 <Class BonusDetailView>
	//    5   11:invokeinterface #374 <Method void BonusDetailView.showUnlockAnimation()>
	//    6   16:return          
	}

	public void setBonusIds(int ai[])
	{
		bonusIds = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field int[] bonusIds>
		if(bonusIds == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #116 <Field int[] bonusIds>
	//*   5    9:ifnonnull       19
			bonusIds = new int[0];
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:newarray        int[]
	//    9   16:putfield        #116 <Field int[] bonusIds>
	//   10   19:return          
	}

	public void setExplicitRequest(boolean flag)
	{
		explicitRequest = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean explicitRequest>
	//    3    5:return          
	}

	public void setIsQuest(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			((BonusDetailView)mvpView).showQuestAppBar();
	//    2    4:aload_0         
	//    3    5:getfield        #175 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    4    8:checkcast       #177 <Class BonusDetailView>
	//    5   11:invokeinterface #381 <Method void BonusDetailView.showQuestAppBar()>
		isQuest = flag;
	//    6   16:aload_0         
	//    7   17:iload_1         
	//    8   18:putfield        #304 <Field boolean isQuest>
	//    9   21:return          
	}

	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	private SingleApiJob bonusByIdJob;
	private final BonusDetailReducer bonusDetailReducer;
	private final BonusHelper bonusHelper;
	private int bonusIds[];
	private BonusModel bonusModel;
	private SingleApiJob bonusesJob;
	private boolean explicitRequest;
	private final GraphQLCallFactory graphQLCallFactory;
	private HomeApiJob homeJob;
	private boolean isQuest;
	private final LoadRetailersVariant loadRetailersVariant;
	private final OfferHelper offerHelper;
	private OptionalWaitingApiJob offersGraphQLJob;
	private final RetailerHelper retailerHelper;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #40  <Method void ajc$preClinit()>
	//*   1    3:return          
	}
}
