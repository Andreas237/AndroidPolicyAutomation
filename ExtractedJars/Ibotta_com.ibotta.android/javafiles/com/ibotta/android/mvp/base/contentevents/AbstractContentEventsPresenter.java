// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.contentevents;

import com.ibotta.android.App;
import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.AbstractMvpPresenter;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.android.util.content.ContentHelper;
import com.ibotta.api.model.ContentModel;
import com.ibotta.api.model.RetailerModel;
import com.ibotta.api.model.favorites.FavoriteRetailersManager;

// Referenced classes of package com.ibotta.android.mvp.base.contentevents:
//			ContentEventsPresenter, ContentEventsView

public abstract class AbstractContentEventsPresenter extends AbstractMvpPresenter
	implements ContentEventsPresenter
{

	public AbstractContentEventsPresenter(MvpPresenterActions mvppresenteractions)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AbstractMvpPresenter(MvpPresenterActions)>
	//    3    5:aload_0         
	//    4    6:invokestatic    #26  <Method App App.instance()>
	//    5    9:invokevirtual   #30  <Method MainComponent App.getMainComponent()>
	//    6   12:invokeinterface #36  <Method ContentHelper MainComponent.getContentHelper()>
	//    7   17:putfield        #38  <Field ContentHelper contentHelper>
	//    8   20:return          
	}

	public static void lambda$onMcommEscort$0(AbstractContentEventsPresenter abstractcontenteventspresenter, McommEscortParamsParcel mcommescortparamsparcel)
	{
		((ContentEventsView)abstractcontenteventspresenter.mvpView).showMcommEscort(mcommescortparamsparcel);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #47  <Class ContentEventsView>
	//    3    7:aload_1         
	//    4    8:invokeinterface #51  <Method void ContentEventsView.showMcommEscort(McommEscortParamsParcel)>
	//    5   13:return          
	}

	private void showOfferSpotlight(int i, Integer integer)
	{
		((ContentEventsView)mvpView).showOfferSpotlight(integer, retailerCategoryId, new int[] {
			i
		});
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #47  <Class ContentEventsView>
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field Integer retailerCategoryId>
	//    6   12:iconst_1        
	//    7   13:newarray        int[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:iload_1         
	//   11   18:iastore         
	//   12   19:invokeinterface #58  <Method void ContentEventsView.showOfferSpotlight(Integer, Integer, int[])>
		retailerCategoryId = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #55  <Field Integer retailerCategoryId>
	//   16   29:return          
	}

	public void onContentClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		onContentClicked(contentmodel, retailermodel, ((RetailerCategoryParcel) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #64  <Method void onContentClicked(ContentModel, RetailerModel, RetailerCategoryParcel)>
	//    5    7:return          
	}

	public void onContentClicked(ContentModel contentmodel, RetailerModel retailermodel, RetailerCategoryParcel retailercategoryparcel)
	{
		if(retailermodel != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          17
			retailermodel = ((RetailerModel) (Integer.valueOf(retailermodel.getId())));
	//    2    4:aload_2         
	//    3    5:invokeinterface #70  <Method int RetailerModel.getId()>
	//    4   10:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//    5   13:astore_2        
		else
	//*   6   14:goto            19
			retailermodel = null;
	//    7   17:aconst_null     
	//    8   18:astore_2        
		static class _cls1
		{

			static final int $SwitchMap$com$ibotta$api$model$ContentModel$Type[];

			static 
			{
				$SwitchMap$com$ibotta$api$model$ContentModel$Type = new int[com.ibotta.api.model.ContentModel.Type.values().length];
			//    0    0:invokestatic    #18  <Method com.ibotta.api.model.ContentModel$Type[] com.ibotta.api.model.ContentModel$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.OFFER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//    5   12:getstatic       #24  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.OFFER>
			//    6   15:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  10   23:getstatic       #31  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.PRODUCT>
			//*  11   26:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  15   34:getstatic       #34  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.DEAL>
			//*  16   37:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  20   45:getstatic       #37  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.BUYABLE_GIFT_CARD>
			//*  21   48:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  25   56:getstatic       #40  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.FEATURED_RETAILER>
			//*  26   59:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  30   67:getstatic       #43  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.RETAILER>
			//*  31   70:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  35   79:getstatic       #46  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.FEATURE>
			//*  36   82:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  40   91:getstatic       #49  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.BONUS>
			//*  41   94:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$ContentModel$Type>
			//*  45  103:getstatic       #52  <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.NO_OP>
			//*  46  106:invokevirtual   #28  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   50  113:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.PRODUCT.ordinal()] = 2;
				}
			//*  51  114:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   52  117:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.DEAL.ordinal()] = 3;
				}
			//*  53  118:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   54  121:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.BUYABLE_GIFT_CARD.ordinal()] = 4;
				}
			//*  55  122:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   56  125:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.FEATURED_RETAILER.ordinal()] = 5;
				}
			//*  57  126:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   58  129:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.RETAILER.ordinal()] = 6;
				}
			//*  59  130:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   60  133:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.FEATURE.ordinal()] = 7;
				}
			//*  61  134:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   62  137:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.BONUS.ordinal()] = 8;
				}
			//*  63  138:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   64  141:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$ContentModel$Type[com.ibotta.api.model.ContentModel.Type.NO_OP.ordinal()] = 9;
				}
			//*  65  142:goto            100
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   66  145:astore_0        
			//*  67  146:return          
			}
		}

		switch(_cls1..SwitchMap.com.ibotta.api.model.ContentModel.Type[contentmodel.getTypeEnum().ordinal()])
	//*   9   19:getstatic       #80  <Field int[] AbstractContentEventsPresenter$1.$SwitchMap$com$ibotta$api$model$ContentModel$Type>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #86  <Method com.ibotta.api.model.ContentModel$Type ContentModel.getTypeEnum()>
	//*  12   28:invokevirtual   #91  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
	//*  13   31:iaload          
		{
	//*  14   32:tableswitch     1 8: default 80
	//	               1 175
	//	               2 156
	//	               3 137
	//	               4 111
	//	               5 93
	//	               6 93
	//	               7 186
	//	               8 186
		default:
			((ContentEventsView)mvpView).showUnknownErrorMessage();
	//   15   80:aload_0         
	//   16   81:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   84:checkcast       #47  <Class ContentEventsView>
	//   18   87:invokeinterface #95  <Method void ContentEventsView.showUnknownErrorMessage()>
			return;
	//   19   92:return          

		case 5: // '\005'
		case 6: // '\006'
			((ContentEventsView)mvpView).showRetailerGallery((RetailerModel)contentmodel, retailercategoryparcel);
	//   20   93:aload_0         
	//   21   94:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   22   97:checkcast       #47  <Class ContentEventsView>
	//   23  100:aload_1         
	//   24  101:checkcast       #66  <Class RetailerModel>
	//   25  104:aload_3         
	//   26  105:invokeinterface #99  <Method void ContentEventsView.showRetailerGallery(RetailerModel, RetailerCategoryParcel)>
			return;
	//   27  110:return          

		case 4: // '\004'
			contentmodel = ((ContentModel) (ContentId.create(8, contentmodel.getId())));
	//   28  111:bipush          8
	//   29  113:aload_1         
	//   30  114:invokeinterface #100 <Method int ContentModel.getId()>
	//   31  119:invokestatic    #106 <Method ContentId ContentId.create(int, int)>
	//   32  122:astore_1        
			((ContentEventsView)mvpView).showContentDetail(((ContentId) (contentmodel)));
	//   33  123:aload_0         
	//   34  124:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   35  127:checkcast       #47  <Class ContentEventsView>
	//   36  130:aload_1         
	//   37  131:invokeinterface #110 <Method void ContentEventsView.showContentDetail(ContentId)>
			return;
	//   38  136:return          

		case 3: // '\003'
			((ContentEventsView)mvpView).showDealDetail(contentmodel.getIdString());
	//   39  137:aload_0         
	//   40  138:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   41  141:checkcast       #47  <Class ContentEventsView>
	//   42  144:aload_1         
	//   43  145:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   44  150:invokeinterface #118 <Method void ContentEventsView.showDealDetail(String)>
			return;
	//   45  155:return          

		case 2: // '\002'
			((ContentEventsView)mvpView).showProductDetail(contentmodel.getIdString());
	//   46  156:aload_0         
	//   47  157:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   48  160:checkcast       #47  <Class ContentEventsView>
	//   49  163:aload_1         
	//   50  164:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   51  169:invokeinterface #121 <Method void ContentEventsView.showProductDetail(String)>
			return;
	//   52  174:return          

		case 1: // '\001'
			showOfferSpotlight(contentmodel.getId(), ((Integer) (retailermodel)));
	//   53  175:aload_0         
	//   54  176:aload_1         
	//   55  177:invokeinterface #100 <Method int ContentModel.getId()>
	//   56  182:aload_2         
	//   57  183:invokespecial   #123 <Method void showOfferSpotlight(int, Integer)>
			// fall through

		case 7: // '\007'
		case 8: // '\b'
			return;
	//   58  186:return          
		}
	}

	public void onContentImageCardClicked(ContentModel contentmodel, RetailerModel retailermodel, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            33
		{
			contentmodel = ((ContentModel) (contentHelper.getBestImageUrl(contentmodel)));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field ContentHelper contentHelper>
	//    4    8:aload_1         
	//    5    9:invokeinterface #131 <Method String ContentHelper.getBestImageUrl(ContentModel)>
	//    6   14:astore_1        
			if(contentmodel != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          39
			{
				((ContentEventsView)mvpView).showFullScreenImage(((String) (contentmodel)));
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   11   23:checkcast       #47  <Class ContentEventsView>
	//   12   26:aload_1         
	//   13   27:invokeinterface #134 <Method void ContentEventsView.showFullScreenImage(String)>
				return;
	//   14   32:return          
			}
		} else
		{
			onContentClicked(contentmodel, retailermodel);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #136 <Method void onContentClicked(ContentModel, RetailerModel)>
		}
	//   19   39:return          
	}

	public void onFavoriteClicked(int i, FavoriteRetailersManager favoriteretailersmanager)
	{
		if(favoriteretailersmanager.isFavorited(i))
	//*   0    0:aload_2         
	//*   1    1:iload_1         
	//*   2    2:invokeinterface #144 <Method boolean FavoriteRetailersManager.isFavorited(int)>
	//*   3    7:ifeq            18
		{
			favoriteretailersmanager.unfavorite(i);
	//    4   10:aload_2         
	//    5   11:iload_1         
	//    6   12:invokeinterface #148 <Method void FavoriteRetailersManager.unfavorite(int)>
			return;
	//    7   17:return          
		} else
		{
			favoriteretailersmanager.favorite(i);
	//    8   18:aload_2         
	//    9   19:iload_1         
	//   10   20:invokeinterface #151 <Method void FavoriteRetailersManager.favorite(int)>
			return;
	//   11   25:return          
		}
	}

	public void onFavoriteClicked(ContentId contentid, FavoriteRetailersManager favoriteretailersmanager)
	{
		onFavoriteClicked(contentid.getIntId(), favoriteretailersmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #155 <Method int ContentId.getIntId()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #157 <Method void onFavoriteClicked(int, FavoriteRetailersManager)>
	//    5    9:return          
	}

	public void onFavoriteClicked(RetailerModel retailermodel, FavoriteRetailersManager favoriteretailersmanager)
	{
		onFavoriteClicked(retailermodel.getId(), favoriteretailersmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #70  <Method int RetailerModel.getId()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #157 <Method void onFavoriteClicked(int, FavoriteRetailersManager)>
	//    5   11:return          
	}

	public void onMcommEscort(McommEscortParamsParcel mcommescortparamsparcel)
	{
		ifNetworkConnected(((Runnable) (new _2D_..Lambda.AbstractContentEventsPresenter.rOJS_ZuEeNScsI_2NjGM3SKjr34(this, mcommescortparamsparcel))));
	//    0    0:aload_0         
	//    1    1:new             #161 <Class _2D_$$Lambda$AbstractContentEventsPresenter$rOJS_ZuEeNScsI_2NjGM3SKjr34>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #163 <Method void _2D_$$Lambda$AbstractContentEventsPresenter$rOJS_ZuEeNScsI_2NjGM3SKjr34(AbstractContentEventsPresenter, McommEscortParamsParcel)>
	//    6   10:invokevirtual   #167 <Method void ifNetworkConnected(Runnable)>
	//    7   13:return          
	}

	public void onModalCloseClicked()
	{
		((ContentEventsView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #47  <Class ContentEventsView>
	//    3    7:invokeinterface #171 <Method void ContentEventsView.finish()>
	//    4   12:return          
	}

	public void onModalTopSpacingClicked()
	{
		((ContentEventsView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #47  <Class ContentEventsView>
	//    3    7:invokeinterface #171 <Method void ContentEventsView.finish()>
	//    4   12:return          
	}

	public void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		onShopClicked(contentmodel, retailermodel, ((EventContext) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #176 <Method void onShopClicked(ContentModel, RetailerModel, EventContext, String)>
	//    6    8:return          
	}

	public void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel, EventContext eventcontext, String s)
	{
label0:
		{
			switch(_cls1..SwitchMap.com.ibotta.api.model.ContentModel.Type[contentmodel.getTypeEnum().ordinal()])
	//*   0    0:getstatic       #80  <Field int[] AbstractContentEventsPresenter$1.$SwitchMap$com$ibotta$api$model$ContentModel$Type>
	//*   1    3:aload_1         
	//*   2    4:invokeinterface #86  <Method com.ibotta.api.model.ContentModel$Type ContentModel.getTypeEnum()>
	//*   3    9:invokevirtual   #91  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
	//*   4   12:iaload          
			{
	//*   5   13:tableswitch     1 8: default 60
	//	               1 203
	//	               2 157
	//	               3 111
	//	               4 75
	//	               5 252
	//	               6 252
	//	               7 252
	//	               8 252
			default:
				((ContentEventsView)mvpView).showUnknownErrorMessage();
	//    6   60:aload_0         
	//    7   61:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    8   64:checkcast       #47  <Class ContentEventsView>
	//    9   67:invokeinterface #95  <Method void ContentEventsView.showUnknownErrorMessage()>
				break;
	//   10   72:goto            252

			case 5: // '\005'
			case 6: // '\006'
			case 7: // '\007'
			case 8: // '\b'
				break;

			case 4: // '\004'
				((ContentEventsView)mvpView).showPwiFlow(mvpPresenterActions.toRetailerParcel(retailermodel), ContentId.create(8, contentmodel.getId()));
	//   11   75:aload_0         
	//   12   76:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   13   79:checkcast       #47  <Class ContentEventsView>
	//   14   82:aload_0         
	//   15   83:getfield        #180 <Field MvpPresenterActions mvpPresenterActions>
	//   16   86:aload_2         
	//   17   87:invokeinterface #186 <Method com.ibotta.android.fragment.retailer.RetailerParcel MvpPresenterActions.toRetailerParcel(RetailerModel)>
	//   18   92:bipush          8
	//   19   94:aload_1         
	//   20   95:invokeinterface #100 <Method int ContentModel.getId()>
	//   21  100:invokestatic    #106 <Method ContentId ContentId.create(int, int)>
	//   22  103:invokeinterface #190 <Method void ContentEventsView.showPwiFlow(com.ibotta.android.fragment.retailer.RetailerParcel, ContentId)>
				break;
	//   23  108:goto            252

			case 3: // '\003'
				contentmodel = ((ContentModel) (McommEscortParamsParcel.builder(mvpPresenterActions.toRetailerParcel(retailermodel), ((ContentEventsView)mvpView).getEventContext()).dealId(contentmodel.getIdString()).searchTerm(s).build()));
	//   24  111:aload_0         
	//   25  112:getfield        #180 <Field MvpPresenterActions mvpPresenterActions>
	//   26  115:aload_2         
	//   27  116:invokeinterface #186 <Method com.ibotta.android.fragment.retailer.RetailerParcel MvpPresenterActions.toRetailerParcel(RetailerModel)>
	//   28  121:aload_0         
	//   29  122:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   30  125:checkcast       #47  <Class ContentEventsView>
	//   31  128:invokeinterface #194 <Method EventContext ContentEventsView.getEventContext()>
	//   32  133:invokestatic    #200 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder McommEscortParamsParcel.builder(com.ibotta.android.fragment.retailer.RetailerParcel, EventContext)>
	//   33  136:aload_1         
	//   34  137:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   35  142:invokevirtual   #206 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.dealId(String)>
	//   36  145:aload           4
	//   37  147:invokevirtual   #209 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.searchTerm(String)>
	//   38  150:invokevirtual   #213 <Method McommEscortParamsParcel com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.build()>
	//   39  153:astore_1        
				break label0;
	//   40  154:goto            254

			case 2: // '\002'
				contentmodel = ((ContentModel) (McommEscortParamsParcel.builder(mvpPresenterActions.toRetailerParcel(retailermodel), ((ContentEventsView)mvpView).getEventContext()).productId(contentmodel.getIdString()).searchTerm(s).build()));
	//   41  157:aload_0         
	//   42  158:getfield        #180 <Field MvpPresenterActions mvpPresenterActions>
	//   43  161:aload_2         
	//   44  162:invokeinterface #186 <Method com.ibotta.android.fragment.retailer.RetailerParcel MvpPresenterActions.toRetailerParcel(RetailerModel)>
	//   45  167:aload_0         
	//   46  168:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   47  171:checkcast       #47  <Class ContentEventsView>
	//   48  174:invokeinterface #194 <Method EventContext ContentEventsView.getEventContext()>
	//   49  179:invokestatic    #200 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder McommEscortParamsParcel.builder(com.ibotta.android.fragment.retailer.RetailerParcel, EventContext)>
	//   50  182:aload_1         
	//   51  183:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   52  188:invokevirtual   #216 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.productId(String)>
	//   53  191:aload           4
	//   54  193:invokevirtual   #209 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.searchTerm(String)>
	//   55  196:invokevirtual   #213 <Method McommEscortParamsParcel com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.build()>
	//   56  199:astore_1        
				break label0;
	//   57  200:goto            254

			case 1: // '\001'
				contentmodel = ((ContentModel) (McommEscortParamsParcel.builder(mvpPresenterActions.toRetailerParcel(retailermodel), ((ContentEventsView)mvpView).getEventContext()).offerId(Integer.valueOf(contentmodel.getId())).searchTerm(s).build()));
	//   58  203:aload_0         
	//   59  204:getfield        #180 <Field MvpPresenterActions mvpPresenterActions>
	//   60  207:aload_2         
	//   61  208:invokeinterface #186 <Method com.ibotta.android.fragment.retailer.RetailerParcel MvpPresenterActions.toRetailerParcel(RetailerModel)>
	//   62  213:aload_0         
	//   63  214:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   64  217:checkcast       #47  <Class ContentEventsView>
	//   65  220:invokeinterface #194 <Method EventContext ContentEventsView.getEventContext()>
	//   66  225:invokestatic    #200 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder McommEscortParamsParcel.builder(com.ibotta.android.fragment.retailer.RetailerParcel, EventContext)>
	//   67  228:aload_1         
	//   68  229:invokeinterface #100 <Method int ContentModel.getId()>
	//   69  234:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   70  237:invokevirtual   #220 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.offerId(Integer)>
	//   71  240:aload           4
	//   72  242:invokevirtual   #209 <Method com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.searchTerm(String)>
	//   73  245:invokevirtual   #213 <Method McommEscortParamsParcel com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel$Builder.build()>
	//   74  248:astore_1        
				break label0;
	//   75  249:goto            254
			}
			contentmodel = null;
	//   76  252:aconst_null     
	//   77  253:astore_1        
		}
		if(contentmodel != null)
	//*  78  254:aload_1         
	//*  79  255:ifnull          263
			onMcommEscort(((McommEscortParamsParcel) (contentmodel)));
	//   80  258:aload_0         
	//   81  259:aload_1         
	//   82  260:invokevirtual   #222 <Method void onMcommEscort(McommEscortParamsParcel)>
	//   83  263:return          
	}

	public void onUnlockClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		if(retailermodel != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          17
			retailermodel = ((RetailerModel) (Integer.valueOf(retailermodel.getId())));
	//    2    4:aload_2         
	//    3    5:invokeinterface #70  <Method int RetailerModel.getId()>
	//    4   10:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//    5   13:astore_2        
		else
	//*   6   14:goto            19
			retailermodel = null;
	//    7   17:aconst_null     
	//    8   18:astore_2        
		switch(_cls1..SwitchMap.com.ibotta.api.model.ContentModel.Type[contentmodel.getTypeEnum().ordinal()])
	//*   9   19:getstatic       #80  <Field int[] AbstractContentEventsPresenter$1.$SwitchMap$com$ibotta$api$model$ContentModel$Type>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #86  <Method com.ibotta.api.model.ContentModel$Type ContentModel.getTypeEnum()>
	//*  12   28:invokevirtual   #91  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
	//*  13   31:iaload          
		{
	//*  14   32:tableswitch     1 8: default 80
	//	               1 131
	//	               2 112
	//	               3 93
	//	               4 80
	//	               5 150
	//	               6 150
	//	               7 150
	//	               8 150
		case 4: // '\004'
		default:
			((ContentEventsView)mvpView).showUnknownErrorMessage();
	//   15   80:aload_0         
	//   16   81:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   84:checkcast       #47  <Class ContentEventsView>
	//   18   87:invokeinterface #95  <Method void ContentEventsView.showUnknownErrorMessage()>
			return;
	//   19   92:return          

		case 3: // '\003'
			((ContentEventsView)mvpView).showDealDetail(contentmodel.getIdString());
	//   20   93:aload_0         
	//   21   94:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   22   97:checkcast       #47  <Class ContentEventsView>
	//   23  100:aload_1         
	//   24  101:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   25  106:invokeinterface #118 <Method void ContentEventsView.showDealDetail(String)>
			return;
	//   26  111:return          

		case 2: // '\002'
			((ContentEventsView)mvpView).showProductDetail(contentmodel.getIdString());
	//   27  112:aload_0         
	//   28  113:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   29  116:checkcast       #47  <Class ContentEventsView>
	//   30  119:aload_1         
	//   31  120:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   32  125:invokeinterface #121 <Method void ContentEventsView.showProductDetail(String)>
			return;
	//   33  130:return          

		case 1: // '\001'
			((ContentEventsView)mvpView).showEngagement(contentmodel.getId(), ((Integer) (retailermodel)));
	//   34  131:aload_0         
	//   35  132:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   36  135:checkcast       #47  <Class ContentEventsView>
	//   37  138:aload_1         
	//   38  139:invokeinterface #100 <Method int ContentModel.getId()>
	//   39  144:aload_2         
	//   40  145:invokeinterface #226 <Method void ContentEventsView.showEngagement(int, Integer)>
			// fall through

		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return;
	//   41  150:return          
		}
	}

	public void onUnlockedClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		if(retailermodel != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          17
			retailermodel = ((RetailerModel) (Integer.valueOf(retailermodel.getId())));
	//    2    4:aload_2         
	//    3    5:invokeinterface #70  <Method int RetailerModel.getId()>
	//    4   10:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//    5   13:astore_2        
		else
	//*   6   14:goto            19
			retailermodel = null;
	//    7   17:aconst_null     
	//    8   18:astore_2        
		switch(_cls1..SwitchMap.com.ibotta.api.model.ContentModel.Type[contentmodel.getTypeEnum().ordinal()])
	//*   9   19:getstatic       #80  <Field int[] AbstractContentEventsPresenter$1.$SwitchMap$com$ibotta$api$model$ContentModel$Type>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #86  <Method com.ibotta.api.model.ContentModel$Type ContentModel.getTypeEnum()>
	//*  12   28:invokevirtual   #91  <Method int com.ibotta.api.model.ContentModel$Type.ordinal()>
	//*  13   31:iaload          
		{
	//*  14   32:tableswitch     1 8: default 80
	//	               1 131
	//	               2 112
	//	               3 93
	//	               4 80
	//	               5 142
	//	               6 142
	//	               7 142
	//	               8 142
		case 4: // '\004'
		default:
			((ContentEventsView)mvpView).showUnknownErrorMessage();
	//   15   80:aload_0         
	//   16   81:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   84:checkcast       #47  <Class ContentEventsView>
	//   18   87:invokeinterface #95  <Method void ContentEventsView.showUnknownErrorMessage()>
			return;
	//   19   92:return          

		case 3: // '\003'
			((ContentEventsView)mvpView).showDealDetail(contentmodel.getIdString());
	//   20   93:aload_0         
	//   21   94:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   22   97:checkcast       #47  <Class ContentEventsView>
	//   23  100:aload_1         
	//   24  101:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   25  106:invokeinterface #118 <Method void ContentEventsView.showDealDetail(String)>
			return;
	//   26  111:return          

		case 2: // '\002'
			((ContentEventsView)mvpView).showProductDetail(contentmodel.getIdString());
	//   27  112:aload_0         
	//   28  113:getfield        #45  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   29  116:checkcast       #47  <Class ContentEventsView>
	//   30  119:aload_1         
	//   31  120:invokeinterface #114 <Method String ContentModel.getIdString()>
	//   32  125:invokeinterface #121 <Method void ContentEventsView.showProductDetail(String)>
			return;
	//   33  130:return          

		case 1: // '\001'
			showOfferSpotlight(contentmodel.getId(), ((Integer) (retailermodel)));
	//   34  131:aload_0         
	//   35  132:aload_1         
	//   36  133:invokeinterface #100 <Method int ContentModel.getId()>
	//   37  138:aload_2         
	//   38  139:invokespecial   #123 <Method void showOfferSpotlight(int, Integer)>
			// fall through

		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return;
	//   39  142:return          
		}
	}

	public void setRetailerCategoryId(Integer integer)
	{
		retailerCategoryId = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Integer retailerCategoryId>
	//    3    5:return          
	}

	private final ContentHelper contentHelper = App.instance().getMainComponent().getContentHelper();
	protected Integer retailerCategoryId;
	protected Long retailerId;
}
