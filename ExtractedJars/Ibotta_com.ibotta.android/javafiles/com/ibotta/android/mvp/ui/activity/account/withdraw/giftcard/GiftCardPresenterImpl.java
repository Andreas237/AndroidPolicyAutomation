// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawalDetails;
import com.ibotta.android.service.api.job.*;
import com.ibotta.android.state.user.UserState;
import com.ibotta.api.call.card.GiftCardsCall;
import com.ibotta.api.call.card.GiftCardsResponse;
import com.ibotta.api.call.customer.CustomerByIdCall;
import com.ibotta.api.call.customer.CustomerByIdResponse;
import com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall;
import com.ibotta.api.helper.card.GiftCardHelper;
import com.ibotta.api.model.card.GiftCard;
import com.ibotta.api.model.customer.Customer;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardPresenter, GiftCardView

public class GiftCardPresenterImpl extends AbstractPasswordUsingMvpPresenter
	implements GiftCardPresenter
{

	public GiftCardPresenterImpl(MvpPresenterActions mvppresenteractions, UserState userstate, GiftCardHelper giftcardhelper, CacheClearJobFactory cacheclearjobfactory)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void AbstractPasswordUsingMvpPresenter(MvpPresenterActions)>
		userState = userstate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #33  <Field UserState userState>
		giftCardHelper = giftcardhelper;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #35  <Field GiftCardHelper giftCardHelper>
		cacheClearFactory = cacheclearjobfactory;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #37  <Field CacheClearJobFactory cacheClearFactory>
	//   12   21:return          
	}

	private WithdrawalDetails getWithdrawalDetails()
	{
		WithdrawalDetails withdrawaldetails = new WithdrawalDetails();
	//    0    0:new             #42  <Class WithdrawalDetails>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void WithdrawalDetails()>
	//    3    7:astore_1        
		com.ibotta.api.model.card.GiftCard.Template template = giftCard.getFirstTemplate();
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field GiftCard giftCard>
	//    6   12:invokevirtual   #53  <Method com.ibotta.api.model.card.GiftCard$Template GiftCard.getFirstTemplate()>
	//    7   15:astore_2        
		withdrawaldetails.setAmount(amount.floatValue());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #55  <Field Float amount>
	//   11   21:invokevirtual   #61  <Method float Float.floatValue()>
	//   12   24:invokevirtual   #65  <Method void WithdrawalDetails.setAmount(float)>
		withdrawaldetails.setMethod(giftCard.getName());
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field GiftCard giftCard>
	//   16   32:invokevirtual   #69  <Method String GiftCard.getName()>
	//   17   35:invokevirtual   #73  <Method void WithdrawalDetails.setMethod(String)>
		if(template != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          50
			withdrawaldetails.setMethodImg(template.getThumbnailUrl());
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:invokevirtual   #78  <Method String com.ibotta.api.model.card.GiftCard$Template.getThumbnailUrl()>
	//   23   47:invokevirtual   #81  <Method void WithdrawalDetails.setMethodImg(String)>
		return withdrawaldetails;
	//   24   50:aload_1         
	//   25   51:areturn         
	}

	private void purchaseGiftCard()
	{
		com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall.CallParams callparams = new com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall.CallParams();
	//    0    0:new             #84  <Class com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams()>
	//    3    7:astore_1        
		com.ibotta.api.model.card.GiftCard.Template template = giftCard.getFirstTemplate();
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field GiftCard giftCard>
	//    6   12:invokevirtual   #53  <Method com.ibotta.api.model.card.GiftCard$Template GiftCard.getFirstTemplate()>
	//    7   15:astore_2        
		callparams.setAmount(amount.floatValue());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #55  <Field Float amount>
	//   11   21:invokevirtual   #61  <Method float Float.floatValue()>
	//   12   24:invokevirtual   #86  <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams.setAmount(float)>
		callparams.setCustomerId(userState.getCustomerId());
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field UserState userState>
	//   16   32:invokeinterface #92  <Method int UserState.getCustomerId()>
	//   17   37:invokevirtual   #96  <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams.setCustomerId(int)>
		callparams.setGiftCardId(giftCardId);
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #98  <Field int giftCardId>
	//   21   45:invokevirtual   #101 <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams.setGiftCardId(int)>
		if(template != null)
	//*  22   48:aload_2         
	//*  23   49:ifnull          60
			callparams.setGiftCardTemplateId(template.getId());
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokevirtual   #104 <Method int com.ibotta.api.model.card.GiftCard$Template.getId()>
	//   27   57:invokevirtual   #107 <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams.setGiftCardTemplateId(int)>
		callparams.setPassword(password);
	//   28   60:aload_1         
	//   29   61:aload_0         
	//   30   62:getfield        #109 <Field String password>
	//   31   65:invokevirtual   #112 <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams.setPassword(String)>
		callparams.setReferenceId(userState.getVerifiedDeviceReferenceId());
	//   32   68:aload_1         
	//   33   69:aload_0         
	//   34   70:getfield        #33  <Field UserState userState>
	//   35   73:invokeinterface #115 <Method String UserState.getVerifiedDeviceReferenceId()>
	//   36   78:invokevirtual   #118 <Method void com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams.setReferenceId(String)>
		submitApiCall(((com.ibotta.api.ApiCall) (new CustomerGiftCardPostCall(callparams))));
	//   37   81:aload_0         
	//   38   82:new             #120 <Class CustomerGiftCardPostCall>
	//   39   85:dup             
	//   40   86:aload_1         
	//   41   87:invokespecial   #123 <Method void CustomerGiftCardPostCall(com.ibotta.api.call.customer.giftcard.CustomerGiftCardPostCall$CallParams)>
	//   42   90:invokevirtual   #127 <Method void submitApiCall(com.ibotta.api.ApiCall)>
	//   43   93:return          
	}

	private boolean validate()
	{
		Float float1 = amount;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Float amount>
	//    2    4:astore          8
		boolean flag7 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		if(float1 != null)
	//*   5    9:aload           8
	//*   6   11:ifnull          180
		{
			boolean flag1;
			if(float1.floatValue() > 0.0F)
	//*   7   14:aload           8
	//*   8   16:invokevirtual   #61  <Method float Float.floatValue()>
	//*   9   19:fconst_0        
	//*  10   20:fcmpl           
	//*  11   21:ifle            29
				flag1 = true;
	//   12   24:iconst_1        
	//   13   25:istore_2        
			else
	//*  14   26:goto            31
				flag1 = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
			boolean flag2;
			if(amount.floatValue() <= customer.getBalance())
	//*  17   31:aload_0         
	//*  18   32:getfield        #55  <Field Float amount>
	//*  19   35:invokevirtual   #61  <Method float Float.floatValue()>
	//*  20   38:aload_0         
	//*  21   39:getfield        #131 <Field Customer customer>
	//*  22   42:invokevirtual   #136 <Method float Customer.getBalance()>
	//*  23   45:fcmpg           
	//*  24   46:ifgt            54
				flag2 = true;
	//   25   49:iconst_1        
	//   26   50:istore_3        
			else
	//*  27   51:goto            56
				flag2 = false;
	//   28   54:iconst_0        
	//   29   55:istore_3        
			boolean flag;
			boolean flag3;
			if(com.ibotta.api.model.card.GiftCard.DenominationType.RANGE == giftCard.getDenominationTypeEnum())
	//*  30   56:getstatic       #142 <Field com.ibotta.api.model.card.GiftCard$DenominationType com.ibotta.api.model.card.GiftCard$DenominationType.RANGE>
	//*  31   59:aload_0         
	//*  32   60:getfield        #47  <Field GiftCard giftCard>
	//*  33   63:invokevirtual   #146 <Method com.ibotta.api.model.card.GiftCard$DenominationType GiftCard.getDenominationTypeEnum()>
	//*  34   66:if_acmpne       136
			{
				if(amount.floatValue() >= giftCard.getMinimum())
	//*  35   69:aload_0         
	//*  36   70:getfield        #55  <Field Float amount>
	//*  37   73:invokevirtual   #61  <Method float Float.floatValue()>
	//*  38   76:aload_0         
	//*  39   77:getfield        #47  <Field GiftCard giftCard>
	//*  40   80:invokevirtual   #149 <Method float GiftCard.getMinimum()>
	//*  41   83:fcmpl           
	//*  42   84:iflt            92
					flag = true;
	//   43   87:iconst_1        
	//   44   88:istore_1        
				else
	//*  45   89:goto            94
					flag = false;
	//   46   92:iconst_0        
	//   47   93:istore_1        
				if(amount.floatValue() <= giftCard.getMaximum())
	//*  48   94:aload_0         
	//*  49   95:getfield        #55  <Field Float amount>
	//*  50   98:invokevirtual   #61  <Method float Float.floatValue()>
	//*  51  101:aload_0         
	//*  52  102:getfield        #47  <Field GiftCard giftCard>
	//*  53  105:invokevirtual   #152 <Method float GiftCard.getMaximum()>
	//*  54  108:fcmpg           
	//*  55  109:ifgt            124
				{
					boolean flag4 = true;
	//   56  112:iconst_1        
	//   57  113:istore          5
					flag3 = flag;
	//   58  115:iload_1         
	//   59  116:istore          4
					flag = flag4;
	//   60  118:iload           5
	//   61  120:istore_1        
				} else
	//*  62  121:goto            141
				{
					boolean flag5 = false;
	//   63  124:iconst_0        
	//   64  125:istore          5
					flag3 = flag;
	//   65  127:iload_1         
	//   66  128:istore          4
					flag = flag5;
	//   67  130:iload           5
	//   68  132:istore_1        
				}
			} else
	//*  69  133:goto            141
			{
				flag3 = true;
	//   70  136:iconst_1        
	//   71  137:istore          4
				flag = true;
	//   72  139:iconst_1        
	//   73  140:istore_1        
			}
			boolean flag6 = flag7;
	//   74  141:iload           7
	//   75  143:istore          6
			if(flag1)
	//*  76  145:iload_2         
	//*  77  146:ifeq            177
			{
				flag6 = flag7;
	//   78  149:iload           7
	//   79  151:istore          6
				if(flag2)
	//*  80  153:iload_3         
	//*  81  154:ifeq            177
				{
					flag6 = flag7;
	//   82  157:iload           7
	//   83  159:istore          6
					if(flag3)
	//*  84  161:iload           4
	//*  85  163:ifeq            177
					{
						flag6 = flag7;
	//   86  166:iload           7
	//   87  168:istore          6
						if(flag)
	//*  88  170:iload_1         
	//*  89  171:ifeq            177
							flag6 = true;
	//   90  174:iconst_1        
	//   91  175:istore          6
					}
				}
			}
			return flag6;
	//   92  177:iload           6
	//   93  179:ireturn         
		} else
		{
			return false;
	//   94  180:iconst_0        
	//   95  181:ireturn         
		}
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #156 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #157 <Method void HashSet()>
	//    3    7:astore_1        
		if(custByIdJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #159 <Field SingleApiJob custByIdJob>
	//*   6   12:ifnonnull       42
			custByIdJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new CustomerByIdCall(userState.getCustomerId()))));
	//    7   15:aload_0         
	//    8   16:new             #161 <Class SingleApiJob>
	//    9   19:dup             
	//   10   20:new             #163 <Class CustomerByIdCall>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field UserState userState>
	//   14   28:invokeinterface #92  <Method int UserState.getCustomerId()>
	//   15   33:invokespecial   #165 <Method void CustomerByIdCall(int)>
	//   16   36:invokespecial   #167 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   17   39:putfield        #159 <Field SingleApiJob custByIdJob>
		if(giftCardsJob == null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #169 <Field SingleApiJob giftCardsJob>
	//*  20   46:ifnonnull       67
			giftCardsJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new GiftCardsCall())));
	//   21   49:aload_0         
	//   22   50:new             #161 <Class SingleApiJob>
	//   23   53:dup             
	//   24   54:new             #171 <Class GiftCardsCall>
	//   25   57:dup             
	//   26   58:invokespecial   #172 <Method void GiftCardsCall()>
	//   27   61:invokespecial   #167 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   28   64:putfield        #169 <Field SingleApiJob giftCardsJob>
		((Set) (hashset)).add(((Object) (custByIdJob)));
	//   29   67:aload_1         
	//   30   68:aload_0         
	//   31   69:getfield        #159 <Field SingleApiJob custByIdJob>
	//   32   72:invokeinterface #178 <Method boolean Set.add(Object)>
	//   33   77:pop             
		((Set) (hashset)).add(((Object) (giftCardsJob)));
	//   34   78:aload_1         
	//   35   79:aload_0         
	//   36   80:getfield        #169 <Field SingleApiJob giftCardsJob>
	//   37   83:invokeinterface #178 <Method boolean Set.add(Object)>
	//   38   88:pop             
		return ((Set) (hashset));
	//   39   89:aload_1         
	//   40   90:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		custByIdJob = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #159 <Field SingleApiJob custByIdJob>
		giftCardsJob = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #169 <Field SingleApiJob giftCardsJob>
	//    6   10:return          
	}

	public void onAmountSelected(float f)
	{
		amount = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #186 <Method Float Float.valueOf(float)>
	//    3    5:putfield        #55  <Field Float amount>
		((GiftCardView)mvpView).setPurchaseGiftCardEnabled(validate());
	//    4    8:aload_0         
	//    5    9:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    6   12:checkcast       #192 <Class GiftCardView>
	//    7   15:aload_0         
	//    8   16:invokespecial   #194 <Method boolean validate()>
	//    9   19:invokeinterface #198 <Method void GiftCardView.setPurchaseGiftCardEnabled(boolean)>
		((GiftCardView)mvpView).setPurchaseGiftCardText(f);
	//   10   24:aload_0         
	//   11   25:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   12   28:checkcast       #192 <Class GiftCardView>
	//   13   31:fload_1         
	//   14   32:invokeinterface #201 <Method void GiftCardView.setPurchaseGiftCardText(float)>
		((GiftCardView)mvpView).setBalanceRemainingText(f);
	//   15   37:aload_0         
	//   16   38:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   41:checkcast       #192 <Class GiftCardView>
	//   18   44:fload_1         
	//   19   45:invokeinterface #204 <Method void GiftCardView.setBalanceRemainingText(float)>
	//   20   50:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		customer = ((CustomerByIdResponse)custByIdJob.getApiResponse()).getCustomer();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #159 <Field SingleApiJob custByIdJob>
	//    3    5:invokevirtual   #209 <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    4    8:checkcast       #211 <Class CustomerByIdResponse>
	//    5   11:invokevirtual   #215 <Method Customer CustomerByIdResponse.getCustomer()>
	//    6   14:putfield        #131 <Field Customer customer>
		((GiftCardView)mvpView).setBalance(customer.getBalance());
	//    7   17:aload_0         
	//    8   18:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    9   21:checkcast       #192 <Class GiftCardView>
	//   10   24:aload_0         
	//   11   25:getfield        #131 <Field Customer customer>
	//   12   28:invokevirtual   #136 <Method float Customer.getBalance()>
	//   13   31:invokeinterface #218 <Method void GiftCardView.setBalance(float)>
		java.util.List list = ((GiftCardsResponse)giftCardsJob.getApiResponse()).getGiftCards();
	//   14   36:aload_0         
	//   15   37:getfield        #169 <Field SingleApiJob giftCardsJob>
	//   16   40:invokevirtual   #209 <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//   17   43:checkcast       #220 <Class GiftCardsResponse>
	//   18   46:invokevirtual   #224 <Method java.util.List GiftCardsResponse.getGiftCards()>
	//   19   49:astore_1        
		giftCard = giftCardHelper.findById(list, giftCardId);
	//   20   50:aload_0         
	//   21   51:aload_0         
	//   22   52:getfield        #35  <Field GiftCardHelper giftCardHelper>
	//   23   55:aload_1         
	//   24   56:aload_0         
	//   25   57:getfield        #98  <Field int giftCardId>
	//   26   60:invokeinterface #230 <Method GiftCard GiftCardHelper.findById(java.util.List, int)>
	//   27   65:putfield        #47  <Field GiftCard giftCard>
		((GiftCardView)mvpView).setGiftCard(giftCard);
	//   28   68:aload_0         
	//   29   69:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   30   72:checkcast       #192 <Class GiftCardView>
	//   31   75:aload_0         
	//   32   76:getfield        #47  <Field GiftCard giftCard>
	//   33   79:invokeinterface #234 <Method void GiftCardView.setGiftCard(GiftCard)>
		if(com.ibotta.api.model.card.GiftCard.DenominationType.FIXED == giftCard.getDenominationTypeEnum())
	//*  34   84:getstatic       #237 <Field com.ibotta.api.model.card.GiftCard$DenominationType com.ibotta.api.model.card.GiftCard$DenominationType.FIXED>
	//*  35   87:aload_0         
	//*  36   88:getfield        #47  <Field GiftCard giftCard>
	//*  37   91:invokevirtual   #146 <Method com.ibotta.api.model.card.GiftCard$DenominationType GiftCard.getDenominationTypeEnum()>
	//*  38   94:if_acmpne       124
		{
			((GiftCardView)mvpView).showFixedAmounts(giftCard.getDenominationValues(), customer.getBalance());
	//   39   97:aload_0         
	//   40   98:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   41  101:checkcast       #192 <Class GiftCardView>
	//   42  104:aload_0         
	//   43  105:getfield        #47  <Field GiftCard giftCard>
	//   44  108:invokevirtual   #241 <Method float[] GiftCard.getDenominationValues()>
	//   45  111:aload_0         
	//   46  112:getfield        #131 <Field Customer customer>
	//   47  115:invokevirtual   #136 <Method float Customer.getBalance()>
	//   48  118:invokeinterface #245 <Method void GiftCardView.showFixedAmounts(float[], float)>
			return;
	//   49  123:return          
		} else
		{
			((GiftCardView)mvpView).showRangeAmounts(giftCard.getMinimum(), Math.min(giftCard.getMaximum(), customer.getBalance()));
	//   50  124:aload_0         
	//   51  125:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   52  128:checkcast       #192 <Class GiftCardView>
	//   53  131:aload_0         
	//   54  132:getfield        #47  <Field GiftCard giftCard>
	//   55  135:invokevirtual   #149 <Method float GiftCard.getMinimum()>
	//   56  138:aload_0         
	//   57  139:getfield        #47  <Field GiftCard giftCard>
	//   58  142:invokevirtual   #152 <Method float GiftCard.getMaximum()>
	//   59  145:aload_0         
	//   60  146:getfield        #131 <Field Customer customer>
	//   61  149:invokevirtual   #136 <Method float Customer.getBalance()>
	//   62  152:invokestatic    #251 <Method float Math.min(float, float)>
	//   63  155:invokeinterface #255 <Method void GiftCardView.showRangeAmounts(float, float)>
			return;
	//   64  160:return          
		}
	}

	protected void onFetchFinishedWithFailures()
	{
		super.onFetchFinishedWithFailures();
	//    0    0:aload_0         
	//    1    1:invokespecial   #258 <Method void AbstractPasswordUsingMvpPresenter.onFetchFinishedWithFailures()>
		((GiftCardView)mvpView).setTitleForLoadFailure();
	//    2    4:aload_0         
	//    3    5:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    4    8:checkcast       #192 <Class GiftCardView>
	//    5   11:invokeinterface #261 <Method void GiftCardView.setTitleForLoadFailure()>
	//    6   16:return          
	}

	public void onPasswordCaptured(String s)
	{
		password = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field String password>
		purchaseGiftCard();
	//    3    5:aload_0         
	//    4    6:invokespecial   #264 <Method void purchaseGiftCard()>
	//    5    9:return          
	}

	public void onPurchaseClicked()
	{
		if(validate())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #194 <Method boolean validate()>
	//*   2    4:ifeq            26
			((GiftCardView)mvpView).showCapturePassword(customer.getEmail());
	//    3    7:aload_0         
	//    4    8:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #192 <Class GiftCardView>
	//    6   14:aload_0         
	//    7   15:getfield        #131 <Field Customer customer>
	//    8   18:invokevirtual   #268 <Method String Customer.getEmail()>
	//    9   21:invokeinterface #271 <Method void GiftCardView.showCapturePassword(String)>
	//   10   26:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		super.onSubmitJobSuccess(singleapijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #275 <Method void AbstractPasswordUsingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
		if(singleapijob.getApiCall() instanceof CustomerGiftCardPostCall)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #279 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//*   5    9:instanceof      #120 <Class CustomerGiftCardPostCall>
	//*   6   12:ifeq            52
		{
			cacheClearFactory.create().clearCustomer(true).clearBonuses().clearCustomerGiftCards(false).clear();
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field CacheClearJobFactory cacheClearFactory>
	//    9   19:invokevirtual   #285 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//   10   22:iconst_1        
	//   11   23:invokevirtual   #291 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//   12   26:invokevirtual   #294 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearBonuses()>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #297 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomerGiftCards(boolean)>
	//   15   33:invokevirtual   #300 <Method void CacheClearBatchApiJob.clear()>
			((GiftCardView)mvpView).finishSuccessfully(getWithdrawalDetails());
	//   16   36:aload_0         
	//   17   37:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   18   40:checkcast       #192 <Class GiftCardView>
	//   19   43:aload_0         
	//   20   44:invokespecial   #302 <Method WithdrawalDetails getWithdrawalDetails()>
	//   21   47:invokeinterface #306 <Method void GiftCardView.finishSuccessfully(WithdrawalDetails)>
		}
	//   22   52:return          
	}

	public void onTermsClicked()
	{
		((GiftCardView)mvpView).showTerms(giftCardId);
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #192 <Class GiftCardView>
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field int giftCardId>
	//    5   11:invokeinterface #310 <Method void GiftCardView.showTerms(int)>
	//    6   16:return          
	}

	public void setGiftCardId(int i)
	{
		giftCardId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int giftCardId>
	//    3    5:return          
	}

	private Float amount;
	private final CacheClearJobFactory cacheClearFactory;
	private SingleApiJob custByIdJob;
	private Customer customer;
	private GiftCard giftCard;
	private final GiftCardHelper giftCardHelper;
	private int giftCardId;
	protected SingleApiJob giftCardsJob;
	private String password;
	private final UserState userState;
}
