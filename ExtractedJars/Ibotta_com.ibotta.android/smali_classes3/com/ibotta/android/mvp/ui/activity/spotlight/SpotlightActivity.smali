.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "SpotlightActivity.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;
.implements Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;
.implements Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;
.implements Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;
.implements Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;",
        ">;",
        "Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;",
        "Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;",
        "Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;",
        "Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;",
        "Lcom/ibotta/android/tracking/proprietary/event/EventContributor;"
    }
.end annotation


# static fields
.field private static final PRODUCT_IMAGE_WIDTH:I = 0x280

.field private static final SHARE_PARAM_FRIEND:Ljava/lang/String; = "friend"

.field private static final SHARE_PARAM_REF:Ljava/lang/String; = "ref"

.field private static final SHARE_PARAM_REF_VALUE:Ljava/lang/String; = "appshare"

.field private static final TAG_ADD_PRODUCT_RETRY:Ljava/lang/String; = "add_product_retry"

.field private static final TAG_FLY_UP_ADD_PRODUCT_UPC_APPROVED:Ljava/lang/String; = "fly_up_add_product_upc_approved"

.field private static final TAG_FLY_UP_ADD_PRODUCT_UPC_PENDING:Ljava/lang/String; = "fly_up_add_product_upc_pending"

.field private static final TAG_FLY_UP_ADD_PRODUCT_UPC_REJECTED:Ljava/lang/String; = "fly_up_add_product_upc_rejected"

.field private static final TAG_FLY_UP_FIX_REBATE:Ljava/lang/String; = "fly_up_fix_rebate"

.field private static final TAG_PROCESSING_PRODUCT_IMAGE:Ljava/lang/String; = "processing_product_image"

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

.field protected brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private customRebateRewardMessage:Ljava/lang/String;

.field protected debugState:Lcom/ibotta/android/state/app/debug/DebugState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

.field private failedVerificationProductImagePath:Ljava/lang/String;

.field protected fileProviderHelper:Lcom/ibotta/android/share/FileProviderHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090227
    .end annotation
.end field

.field protected ilvRecentlyViewed:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090249
    .end annotation
.end field

.field protected llContentContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090304
    .end annotation
.end field

.field private newRebateRewarded:Z

.field protected offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private offerIds:[I

.field protected pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private productImageResizeTask:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;

.field private rebateRewarded:Z

.field protected recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private relatedBonusId:Ljava/lang/Integer;

.field private retailerCategoryId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected rsdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d3
    .end annotation
.end field

.field protected sbvAbout:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903f2
    .end annotation
.end field

.field protected sbvFinePrint:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903f3
    .end annotation
.end field

.field protected slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090414
    .end annotation
.end field

.field protected srovAlsoBoughtViewedOffers:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090427
    .end annotation
.end field

.field protected ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ec
    .end annotation
.end field

.field protected stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09042e
    .end annotation
.end field

.field protected tbvRecentlyViewed:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044b
    .end annotation
.end field

.field protected userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Ljava/lang/Integer;)V
    .locals 0

    .line 115
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onLocateStoreMapClicked(Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Ljava/io/File;Z)V
    .locals 0

    .line 115
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onProductImageResizeFinished(Ljava/io/File;Z)V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "SpotlightActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "setupContentCard"

    const-string v3, "com.ibotta.android.mvp.ui.activity.spotlight.SpotlightActivity"

    const-string v4, "com.ibotta.android.content.card.ContentCardViewState"

    const-string v5, "contentCardViewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x145

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "showOfferNotFound"

    const-string v3, "com.ibotta.android.mvp.ui.activity.spotlight.SpotlightActivity"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x28a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initDetails(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 391
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rsdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;)V

    .line 392
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rsdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method private initFinePrint(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 405
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getLegal()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvFinePrint:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getLegal()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->setBlurb(Ljava/lang/String;)V

    .line 407
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvFinePrint:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->setVisibility(I)V

    goto :goto_0

    .line 409
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvFinePrint:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initRelatedBonuses()V
    .locals 2

    .line 398
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    .line 399
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;)V

    .line 401
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initTitle(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 421
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->isShowOfferIdInSpotlight()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1105f6

    const/4 v1, 0x1

    .line 422
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getIdString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-string v2, "offer_ids"

    .line 243
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerIds:[I

    const-string v2, "retailer_id"

    .line 244
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "retailer_id"

    .line 245
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    const-string v2, "retailer_category_id"

    .line 246
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "retailer_category_id"

    .line 247
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerCategoryId:Ljava/lang/Integer;

    const-string v0, "rebate_rewarded"

    .line 248
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rebateRewarded:Z

    const-string v0, "new_rebate_rewarded"

    .line 249
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->newRebateRewarded:Z

    const-string v0, "custom_rebate_reward_message"

    .line 250
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->customRebateRewardMessage:Ljava/lang/String;

    const-string v0, "failed_verification_image_file_path"

    .line 251
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationProductImagePath:Ljava/lang/String;

    const-string v0, "failed_verification_barcode"

    .line 252
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    goto/16 :goto_3

    .line 253
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 254
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "offer_ids"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerIds:[I

    .line 255
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "related_bonus_id"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 256
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "related_bonus_id"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->relatedBonusId:Ljava/lang/Integer;

    .line 257
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "retailer_id"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "retailer_id"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v0

    :goto_2
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    .line 258
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "retailer_category_id"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 259
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer_category_id"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_5
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerCategoryId:Ljava/lang/Integer;

    .line 260
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "rebate_rewarded"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rebateRewarded:Z

    .line 261
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "new_rebate_rewarded"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->newRebateRewarded:Z

    .line 262
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "custom_rebate_reward_message"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->customRebateRewardMessage:Ljava/lang/String;

    :cond_6
    :goto_3
    return-void
.end method

.method private onBarcodeGaveUp(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "last_barcode"

    .line 703
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    .line 704
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onProductVerificationGaveUp(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    return-void
.end method

.method private onBarcodeScanned(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 696
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onProductVerified()V

    goto :goto_0

    .line 698
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onProductVerificationFailed()V

    :goto_0
    return-void
.end method

.method private onCantFindItSuccess()V
    .locals 1

    .line 732
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onCantFindItSuccess()V

    return-void
.end method

.method private onFixRebate()V
    .locals 1

    .line 708
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onFixRebate()V

    return-void
.end method

.method private onLocateStoreMapClicked(Ljava/lang/Integer;)V
    .locals 1

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onLocateStoreMapClicked(Ljava/lang/Integer;)V

    return-void
.end method

.method private onProductImageCaptured()V
    .locals 4

    .line 712
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->productImageResizeTask:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 713
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->cancel(Z)Z

    .line 715
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

    const/16 v2, 0x280

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationProductImagePath:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/pipeline/PipelineFactory;ILjava/lang/String;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->productImageResizeTask:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;

    .line 717
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->productImageResizeTask:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    instance-of v2, v0, Landroid/os/AsyncTask;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method private onProductImageResizeFinished(Ljava/io/File;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 721
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->productImageResizeTask:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;

    if-nez p2, :cond_1

    if-eqz p1, :cond_0

    .line 723
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_1

    .line 724
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onProductImageCaptureFailed()V

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    .line 727
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationProductImagePath:Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onProductImageCaptureSuccess(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private showRebateRewardDialog(Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    .line 661
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rebateRewarded:Z

    .line 662
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->newRebateRewarded:Z

    return-void
.end method


# virtual methods
.method public captureProductImage(Ljava/lang/String;)V
    .locals 4

    .line 594
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationProductImagePath:Ljava/lang/String;

    .line 596
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 597
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 598
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->fileProviderHelper:Lcom/ibotta/android/share/FileProviderHelper;

    .line 599
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 598
    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/share/FileProviderHelper;->applyFileToImageCaptureIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/io/File;)V

    const/16 p1, 0xa

    .line 601
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 603
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onCaptureProductImageNotPossible()V

    :goto_0
    return-void
.end method

.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 2

    .line 817
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerIds:[I

    if-eqz v0, :cond_1

    array-length v0, v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 821
    :cond_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SPOTLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 822
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 823
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerCategoryId:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    .line 824
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerIds:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 825
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->getOfferSegmentId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 115
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;
    .locals 1

    .line 171
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;

    move-result-object v0

    .line 172
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;)V

    .line 173
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->spotlightModule(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;)Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;

    move-result-object p1

    .line 174
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;

    move-result-object p1

    return-object p1
.end method

.method public finish()V
    .locals 2

    .line 879
    invoke-static {}, Lcom/ibotta/android/LocalBroadcast;->broadcastRefreshData()V

    .line 880
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010039

    .line 881
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public getAvailableAtTitle(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 926
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f1105e8

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 911
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SPOTLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;
    .locals 0

    return-object p0
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 3

    const-string v0, "fly_up_fix_rebate"

    .line 759
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f1102ea

    .line 760
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1102e3

    .line 761
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1102e2

    .line 762
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 764
    new-instance v2, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;

    invoke-direct {v2, p2, p1, v0, v1}, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "fly_up_add_product_upc_approved"

    .line 765
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p1, 0x7f1102e1

    .line 766
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1102e0

    .line 767
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1102df

    .line 768
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 770
    new-instance v2, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;

    invoke-direct {v2, p2, p1, v0, v1}, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "fly_up_add_product_upc_pending"

    .line 771
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const p1, 0x7f1102e9

    .line 772
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1102e8

    .line 773
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1102e7

    .line 774
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 776
    new-instance v2, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;

    invoke-direct {v2, p2, p1, v0, v1}, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v0, "fly_up_add_product_upc_rejected"

    .line 777
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f1102e6

    .line 778
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1102e5

    .line 779
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1102e4

    .line 780
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 782
    new-instance v2, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;

    invoke-direct {v2, p2, p1, v0, v1}, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    return-object v2
.end method

.method public getRecentlyViewedTitle()Ljava/lang/String;
    .locals 1

    .line 916
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->tbvRecentlyViewed:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getTitleValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 115
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;)V
    .locals 0

    .line 179
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    if-ne p2, v0, :cond_0

    .line 669
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onUnlockCompleted()V

    goto :goto_0

    :cond_0
    const/16 v1, 0xc

    const/4 v2, 0x2

    if-ne p1, v1, :cond_2

    if-ne p2, v0, :cond_1

    .line 673
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onBarcodeScanned(I)V

    goto :goto_0

    :cond_1
    if-ne p2, v2, :cond_6

    .line 675
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onBarcodeGaveUp(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x9

    if-ne p1, v1, :cond_3

    if-ne p2, v0, :cond_3

    .line 680
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onFixRebate()V

    goto :goto_0

    :cond_3
    const/16 v1, 0xa

    if-ne p1, v1, :cond_4

    const/4 v1, -0x1

    if-ne p2, v1, :cond_4

    .line 684
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onProductImageCaptured()V

    goto :goto_0

    :cond_4
    const/16 v1, 0xe

    if-ne p1, v1, :cond_6

    if-eq p2, v0, :cond_5

    if-ne p2, v2, :cond_6

    .line 688
    :cond_5
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onCantFindItSuccess()V

    .line 691
    :cond_6
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onAvailableAtCantFindThisItem()V
    .locals 1

    .line 747
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onAvailableAtCantFindThisItem()V

    return-void
.end method

.method public onAvailableAtCantFindThisItem(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 752
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onAvailableAtCantFindThisItem(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;)V
    .locals 1

    .line 742
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public onCheckProductClicked()V
    .locals 1

    .line 737
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onCheckProductClicked()V

    return-void
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const-string v0, "add_product_retry"

    .line 808
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f11020d

    if-ne p2, v0, :cond_0

    .line 809
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onRetryAddProduct()V

    goto :goto_0

    .line 811
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onChoice(Ljava/lang/String;ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 886
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 1

    .line 906
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onRebateImageCardClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 184
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    const v1, 0x7f010038

    .line 186
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->overridePendingTransition(II)V

    .line 188
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->loadState(Landroid/os/Bundle;)V

    .line 190
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->relatedBonusId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 191
    new-instance v1, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v1, p0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    new-array v2, v2, [I

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->relatedBonusId:Ljava/lang/Integer;

    .line 192
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v0

    invoke-virtual {v1, v2}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object v0

    .line 193
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 191
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    const v0, 0x7f0c006c

    .line 196
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->setContentView(I)V

    .line 197
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerIds:[I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->setOfferIds([I)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->setRetailerId(Ljava/lang/Integer;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rebateRewarded:Z

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->newRebateRewarded:Z

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->customRebateRewardMessage:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->setRebateRewarded(ZZLjava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationProductImagePath:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->setFailedVerificationProductImagePath(Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->setFailedVerificationBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundResource(I)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->init(Landroid/os/Bundle;)V

    .line 207
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v0, 0x7f0800a1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    .line 208
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->initBottomSheetBehavior(Landroid/widget/LinearLayout;)V

    .line 210
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 211
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ilvRecentlyViewed:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 290
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0011

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 292
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onDestroy()V
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->destroy()V

    .line 233
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDestroy()V

    return-void
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 1

    const-string v0, "fly_up_fix_rebate"

    .line 790
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 791
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->getEventId()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 792
    sget-object p1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string p2, "fly_up_fix_rebate"

    invoke-virtual {p1, p0, p2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 793
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onFixRebateNoticeConfirmed()V

    goto :goto_0

    :cond_0
    const-string p2, "fly_up_add_product_upc_approved"

    .line 794
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "fly_up_add_product_upc_pending"

    .line 795
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "fly_up_add_product_upc_rejected"

    .line 796
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 797
    :cond_1
    sget-object p2, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    invoke-virtual {p2, p0, p1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 297
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090020

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    const v1, 0x7f090026

    if-eq v0, v1, :cond_0

    .line 306
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 299
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onShareClicked()V

    return v2

    .line 302
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onModalCloseClicked()V

    return v2
.end method

.method protected onPause()V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->onPause()V

    .line 227
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 216
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onResume()V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->onResume()V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackSpotlightView(Ljava/lang/Integer;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerCategoryId:Ljava/lang/Integer;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackSpotlightRetailerCategoryView(Ljava/lang/Integer;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->saveMapState(Landroid/os/Bundle;)V

    .line 270
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "offer_ids"

    .line 271
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerIds:[I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const-string v1, "retailer_id"

    .line 274
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerCategoryId:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const-string v1, "retailer_category_id"

    .line 278
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    const-string v0, "rebate_rewarded"

    .line 281
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rebateRewarded:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "new_rebate_rewarded"

    .line 282
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->newRebateRewarded:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "custom_rebate_reward_message"

    .line 283
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->customRebateRewardMessage:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "failed_verification_image_file_path"

    .line 284
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationProductImagePath:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "failed_verification_barcode"

    .line 285
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 901
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onTopSpacingClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0905bd
        }
    .end annotation

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onModalTopSpacingClicked()V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 891
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 896
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setAvailableAtRetailers(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "ZZ)V"
        }
    .end annotation

    .line 513
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;)V

    const/16 v0, 0x8

    if-nez p4, :cond_2

    .line 515
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    .line 519
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    invoke-virtual {p4, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->setCantFindItemVisibility(I)V

    .line 522
    :cond_1
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    invoke-virtual {p4, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->setup(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void

    .line 516
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->setVisibility(I)V

    return-void
.end method

.method public setCheckProductAllowed(Z)V
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rsdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setCheckProductVisible(Z)V

    return-void
.end method

.method public setRelatedBonuses(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation

    .line 359
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 361
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-static {p1}, Lcom/ibotta/android/mvp/parser/BonusParser;->fromBonusModels(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setBonusItems(Ljava/util/List;)V

    .line 362
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibility(I)V

    goto :goto_0

    .line 364
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 320
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 330
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->initTitle(Lcom/ibotta/api/model/OfferModel;)V

    .line 331
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->initDetails(Lcom/ibotta/api/model/OfferModel;)V

    .line 332
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->initFinePrint(Lcom/ibotta/api/model/OfferModel;)V

    .line 333
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->initRelatedBonuses()V

    return-void
.end method

.method public setupAlsoBoughtViewedOffers(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/LinkedHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferModel;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->srovAlsoBoughtViewedOffers:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->setContentCardViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 348
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->srovAlsoBoughtViewedOffers:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->setup(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/LinkedHashMap;)V

    .line 349
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->srovAlsoBoughtViewedOffers:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->setVisibility(I)V

    return-void
.end method

.method public setupContentCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 325
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 326
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method public setupLocateStore(Z)V
    .locals 1

    if-eqz p1, :cond_1

    .line 369
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 370
    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->isGooglePlayServicesAvailable()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    .line 372
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->hasPermissions()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 377
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setVisibility(I)V

    .line 378
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setLocation(Landroid/location/Location;)V

    .line 379
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setRetailerId(Ljava/lang/Integer;)V

    .line 380
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setAllowedToLoad(Z)V

    .line 382
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;)V

    return-void

    .line 373
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setVisibility(I)V

    return-void
.end method

.method public shareRebate(Lcom/ibotta/api/model/customer/Customer;Ljava/lang/Integer;Lcom/ibotta/api/model/OfferModel;)V
    .locals 7

    .line 466
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getFriendCode()Ljava/lang/String;

    move-result-object p1

    .line 467
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p3}, Lcom/ibotta/api/model/OfferModel;->getShareUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 471
    invoke-virtual {p2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p2

    const-string v0, "ref"

    const-string v1, "appshare"

    .line 472
    invoke-virtual {p2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p2

    const-string v0, "friend"

    .line 473
    invoke-virtual {p2, v0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 474
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 475
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 478
    invoke-interface {p3}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object p2

    .line 479
    invoke-interface {p3}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f110499

    const/4 v1, 0x1

    .line 480
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f11049b

    const/4 v4, 0x2

    .line 481
    new-array v5, v4, [Ljava/lang/Object;

    aput-object p2, v5, v3

    aput-object p3, v5, v1

    invoke-virtual {p0, v2, v5}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v5, 0x7f11049a

    const/4 v6, 0x3

    .line 482
    new-array v6, v6, [Ljava/lang/Object;

    aput-object p2, v6, v3

    aput-object p3, v6, v1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v6, v4

    invoke-virtual {p0, v5, v6}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 484
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.SEND"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p3, "text/plain"

    .line 485
    invoke-virtual {p2, p3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "android.intent.extra.SUBJECT"

    .line 486
    invoke-virtual {p2, p3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "android.intent.extra.TEXT"

    .line 487
    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x8000000

    .line 488
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    .line 489
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 491
    :try_start_0
    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const p1, 0x7f1101ba

    const/4 p2, 0x0

    .line 493
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showErrorMessage(ILjava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public showAbout(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 415
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvAbout:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 416
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvAbout:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAbout()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->setBlurb(Ljava/lang/String;)V

    .line 417
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvAbout:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->setVisibility(I)V

    return-void
.end method

.method public showAddProductUpcApproved()V
    .locals 3

    const/4 v0, 0x0

    .line 626
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 627
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 628
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_add_product_upc_approved"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showAddProductUpcFail()V
    .locals 3

    .line 640
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const v1, 0x7f110497

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 641
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f110496

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 642
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    .line 643
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 644
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 645
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "add_product_retry"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f1101b9
        0x7f11020d
    .end array-data
.end method

.method public showAddProductUpcPending()V
    .locals 3

    const/4 v0, 0x0

    .line 619
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 620
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 621
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_add_product_upc_pending"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showAddProductUpcRejected()V
    .locals 3

    const/4 v0, 0x0

    .line 633
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 634
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 635
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_add_product_upc_rejected"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showBonus(Lcom/ibotta/api/model/BonusModel;)V
    .locals 3

    .line 500
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 501
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    .line 502
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result p1

    const/4 v2, 0x0

    aput p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 503
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 500
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showCantFindItSuccessMessage(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 2

    .line 565
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;

    const v1, 0x7f120188

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;-><init>(Landroid/content/Context;I)V

    .line 566
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    const p1, 0x7f1105ea

    .line 567
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->setMessage(I)V

    .line 569
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->show()V

    return-void
.end method

.method public showCantFindItem(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 530
    new-instance v0, Lcom/ibotta/android/routing/intent/CantFindItRetailerIntentCreator;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/CantFindItRetailerIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CantFindItRetailerIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0xe

    .line 531
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showCantFindItem(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)V
    .locals 1

    .line 536
    new-instance v0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;-><init>(Landroid/content/Context;I)V

    const/4 p2, 0x1

    .line 537
    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->cantFindIt(Z)Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    move-result-object p2

    .line 538
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->offerId(I)Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    move-result-object p1

    .line 539
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0xe

    .line 540
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showCaptureProductImageNotPossible()V
    .locals 3

    const v0, 0x7f1105f7

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 609
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showFixRebateNotice()V
    .locals 3

    const/4 v0, 0x0

    .line 582
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 583
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 584
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_fix_rebate"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showFullScreenImage(Ljava/lang/String;)V
    .locals 1

    .line 574
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;-><init>(Landroid/content/Context;)V

    .line 575
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->setImageUrl(Ljava/lang/String;)V

    .line 577
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->show()V

    return-void
.end method

.method public showNewRebateRewarded()V
    .locals 1

    const v0, 0x7f1105fe

    .line 560
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showRebateRewardDialog(Ljava/lang/String;)V

    return-void
.end method

.method public showNoPlaceToSaveImageError()V
    .locals 1

    const v0, 0x7f1105f8

    .line 589
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showQuickMessage(I)V

    return-void
.end method

.method public showOfferNotFound()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_DEAD_END:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 650
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    const v0, 0x7f1101c6

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showProductBarcodeScanner(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 428
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getVerifyMaxScanAttempts()I

    move-result v0

    .line 430
    new-instance v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    invoke-direct {v1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;-><init>()V

    .line 431
    sget-object v2, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setVerifyBarcodeMode(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;)V

    .line 432
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setOfferId(I)V

    const/4 v2, 0x0

    .line 433
    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setProductGroupId(Ljava/lang/Integer;)V

    const-string v2, ""

    .line 434
    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setTitle(Ljava/lang/String;)V

    .line 435
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isBlockCustomerSubmittedUpcs()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    .line 437
    invoke-virtual {v1, p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setGiveUpCount(I)V

    goto :goto_0

    .line 440
    :cond_0
    invoke-virtual {v1, v0}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setGiveUpCount(I)V

    .line 443
    :goto_0
    new-instance p1, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->retailerId:Ljava/lang/Integer;

    invoke-direct {p1, p0, v0, v1}, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/Integer;Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0xc

    .line 444
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showProductImageCaptureFailed()V
    .locals 3

    const v0, 0x7f1105f9

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 614
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showProductNotMatched(ILcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
    .locals 0

    .line 459
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    .line 460
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/addupc/AddUpcActivity;->startForResult(Landroid/app/Activity;I)V

    return-void
.end method

.method public showProductVerificationFailed()V
    .locals 1

    const v0, 0x7f1105fa

    .line 454
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showQuickMessage(I)V

    return-void
.end method

.method public showProductVerifiedSuccessfully()V
    .locals 1

    const v0, 0x7f1105fb

    .line 449
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showQuickMessage(I)V

    return-void
.end method

.method public showRebateRewarded()V
    .locals 1

    const v0, 0x7f1105ff

    .line 550
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showRebateRewardDialog(Ljava/lang/String;)V

    return-void
.end method

.method public showRebateRewarded(Ljava/lang/String;)V
    .locals 0

    .line 555
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->showRebateRewardDialog(Ljava/lang/String;)V

    return-void
.end method

.method public showRecentlyViewedContent(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ilvRecentlyViewed:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 339
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ilvRecentlyViewed:Lcom/ibotta/android/views/list/IbottaListView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/IbottaListView;->setVisibility(I)V

    .line 341
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->tbvRecentlyViewed:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->setVisibility(I)V

    return-void
.end method

.method public showRetailerLocationsMap(Ljava/lang/Integer;)V
    .locals 1

    .line 545
    new-instance v0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
