.class public Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ProductActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/product/ProductView;
.implements Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;
.implements Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductView;",
        "Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;",
        "Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;",
        "Lcom/ibotta/android/tracking/proprietary/event/EventContributor;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected llContentContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090304
    .end annotation
.end field

.field private productId:Ljava/lang/String;

.field private productModel:Lcom/ibotta/api/model/ProductModel;

.field protected psdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903b8
    .end annotation
.end field

.field protected pstcvTopContent:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ba
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ProductActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "setProduct"

    const-string v3, "com.ibotta.android.mvp.ui.activity.product.ProductActivity"

    const-string v4, "com.ibotta.api.model.ProductModel"

    const-string v5, "productModel"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x81

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private getProductImageUrl(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;
    .locals 1

    .line 138
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 139
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private initDetails()V
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->psdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->setProductModel(Lcom/ibotta/api/model/ProductModel;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "product_id"

    .line 104
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productId:Ljava/lang/String;

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "product_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productId:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method private trackProductView()V
    .locals 2

    .line 202
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 203
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 206
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;-><init>()V

    .line 207
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const/4 v0, 0x1

    .line 209
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setCounter(I)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 190
    :cond_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SPOTLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setProductId(Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;
    .locals 1

    .line 60
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;

    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/product/ProductView;)V

    .line 62
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->productModule(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;)Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;

    move-result-object p1

    return-object p1
.end method

.method public finish()V
    .locals 2

    .line 230
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010039

    .line 231
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 236
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SPOTLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 45
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;)V
    .locals 0

    .line 68
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f010038

    const/4 v1, 0x0

    .line 75
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->overridePendingTransition(II)V

    .line 77
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c005a

    .line 79
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->setContentView(I)V

    .line 80
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v0, 0x7f0800a1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->initBottomSheetBehavior(Landroid/widget/LinearLayout;)V

    .line 85
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->pstcvTopContent:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

    invoke-virtual {p1, p0, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->setListeners(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;)V

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productId:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;->setProductId(Ljava/lang/String;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0011

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 94
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDismissedNotificationClicked(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V
    .locals 0

    .line 197
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDismissedNotificationClicked(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V

    .line 198
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;->onProductNotFoundDisplayed()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 112
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090020

    if-eq v0, v1, :cond_0

    .line 118
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 114
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;->onModalCloseClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method public onProductImageClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 0

    .line 181
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;->onProductImageCardClicked()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 123
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "product_id"

    .line 124
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onShopClicked()V
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;->onShopClicked()V

    return-void
.end method

.method protected onTopSpacingClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0905bd
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;->onModalTopSpacingClicked()V

    return-void
.end method

.method public onUnlockClicked()V
    .locals 0

    return-void
.end method

.method public setProduct(Lcom/ibotta/api/model/ProductModel;)V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 129
    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 131
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->pstcvTopContent:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

    .line 132
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->getProductImageUrl(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;

    move-result-object p1

    .line 131
    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->updateViewState(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;)V

    .line 133
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->initDetails()V

    .line 134
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->trackProductView()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
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

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method public showFullScreenImage(Ljava/lang/String;)V
    .locals 1

    .line 159
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;-><init>(Landroid/content/Context;)V

    .line 160
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->setImageUrl(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->show()V

    return-void
.end method

.method public showProductNotFound()V
    .locals 3

    const v0, 0x7f1101c6

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 154
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public trackProductShop()V
    .locals 3

    .line 215
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 216
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 219
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;-><init>()V

    .line 220
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 222
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 223
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 224
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setCounter(I)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
