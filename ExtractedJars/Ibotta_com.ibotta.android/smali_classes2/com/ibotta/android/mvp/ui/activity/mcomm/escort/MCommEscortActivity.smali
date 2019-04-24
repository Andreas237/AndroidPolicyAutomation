.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "MCommEscortActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;
.implements Lcom/usebutton/sdk/action/ActionListener;
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;",
        "Lcom/usebutton/sdk/action/ActionListener;",
        "Lcom/usebutton/sdk/purchasepath/PurchasePathListener;"
    }
.end annotation


# static fields
.field private static final LOAD_ANIMATION_SPEED:J


# instance fields
.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLoad1:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b0
    .end annotation
.end field

.field protected ivLoad2:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b1
    .end annotation
.end field

.field protected ivLoad3:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b2
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field private loadAnimation:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field

.field userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 55
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->LOAD_ANIMATION_SPEED:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->onLoadAnimationTransitioned()V

    return-void
.end method

.method private getBestIconUrl()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object v0

    .line 287
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private initLoadAnimation()V
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->loadAnimation:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;

    if-eqz v0, :cond_0

    .line 164
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 167
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$1;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->loadAnimation:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;

    .line 168
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->onLoadAnimationTransitioned()V

    return-void
.end method

.method private initLogo()V
    .locals 4

    .line 139
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getBestIconUrl()Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getBestIconUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLogo:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->BUTTON_APP_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, p0, v1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initMessage()V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v0

    .line 159
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/ibotta/android/util/RedemptionFormat;->getRedemptionString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 119
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->builder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    if-eqz p1, :cond_0

    const-string v0, "mcomm_escort_params_parcel"

    .line 121
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lorg/parceler/Parcels;->unwrap(Landroid/os/Parcelable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "mcomm_escort_params_parcel"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lorg/parceler/Parcels;->unwrap(Landroid/os/Parcelable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    :cond_1
    :goto_0
    return-void
.end method

.method private onLoadAnimationTransitioned()V
    .locals 4

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->loadAnimation:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;

    if-nez v0, :cond_0

    return-void

    .line 176
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->handler:Landroid/os/Handler;

    sget-wide v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->LOAD_ANIMATION_SPEED:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 52
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;
    .locals 1

    .line 76
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;

    move-result-object v0

    .line 77
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;)V

    .line 78
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->mCommEscortModule(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;

    move-result-object p1

    return-object p1
.end method

.method public getButtonBrowserSubtitle()Ljava/lang/String;
    .locals 1

    const v0, 0x7f11028c

    .line 276
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNullCashBackString()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110490

    .line 281
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 52
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;)V
    .locals 0

    .line 84
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V

    return-void
.end method

.method public invokeButtonAction(Lcom/usebutton/sdk/action/ButtonAction;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;I)V
    .locals 7

    .line 184
    new-instance v6, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->handler:Landroid/os/Handler;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;-><init>(Landroid/content/Context;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;ILandroid/os/Handler;Lcom/ibotta/android/util/AppHelper;)V

    .line 190
    invoke-static {}, Lcom/usebutton/sdk/Button;->purchasePath()Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;

    move-result-object p2

    invoke-interface {p2, v6}, Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;->setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V

    .line 191
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/action/ButtonAction;->start(Landroid/content/Context;)V

    return-void
.end method

.method public invokePurchasePath(Lcom/usebutton/sdk/purchasepath/PurchasePath;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;I)V
    .locals 7

    .line 199
    new-instance v6, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->handler:Landroid/os/Handler;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;-><init>(Landroid/content/Context;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;ILandroid/os/Handler;Lcom/ibotta/android/util/AppHelper;)V

    .line 205
    invoke-static {}, Lcom/usebutton/sdk/Button;->purchasePath()Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;

    move-result-object p2

    invoke-interface {p2, v6}, Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;->setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V

    .line 206
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePath;->start(Landroid/content/Context;)V

    return-void
.end method

.method public onComplete(Lcom/usebutton/sdk/action/ButtonAction;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/action/ButtonAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 249
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->showScreenLoadFailed()V

    return-void

    .line 253
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;->onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)V

    return-void
.end method

.method public onComplete(Lcom/usebutton/sdk/purchasepath/PurchasePath;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePath;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 259
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->showScreenLoadFailed()V

    return-void

    .line 263
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;->onPurchasePathAcquired(Lcom/usebutton/sdk/purchasepath/PurchasePath;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 89
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c004c

    .line 93
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->setContentView(I)V

    .line 94
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 96
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;->setMcommEscortParamsParcel(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->initLogo()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->initMessage()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 129
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "mcomm_escort_params_parcel"

    .line 130
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-static {v1}, Lorg/parceler/Parcels;->wrap(Ljava/lang/Object;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onStart()V
    .locals 0

    .line 104
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStart()V

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->initLoadAnimation()V

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->loadAnimation:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;

    if-eqz v0, :cond_0

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 112
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->loadAnimation:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;

    .line 115
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStop()V

    return-void
.end method

.method public requestAppAction(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 217
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->showScreenLoadFailed()V

    return-void

    .line 221
    :cond_0
    sget-object v0, Landroid/util/Patterns;->WEB_URL:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    new-instance v0, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;-><init>(Ljava/lang/String;)V

    .line 227
    invoke-static {}, Lcom/usebutton/sdk/Button;->purchasePath()Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;

    move-result-object p1

    invoke-interface {p1, v0, p0}, Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;->fetch(Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V

    goto :goto_1

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_2

    .line 234
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lcom/usebutton/sdk/action/ActionQuery;->withDate(Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object v0

    goto :goto_0

    .line 236
    :cond_2
    new-instance v1, Lcom/usebutton/sdk/context/Location;

    .line 237
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/usebutton/sdk/context/Location;-><init>(DD)V

    .line 236
    invoke-static {v1}, Lcom/usebutton/sdk/action/ActionQuery;->withSubjectLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object v0

    .line 239
    :goto_0
    new-instance v1, Lcom/usebutton/sdk/action/ActionRequest;

    invoke-direct {v1, p1, v0}, Lcom/usebutton/sdk/action/ActionRequest;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)V

    .line 242
    invoke-static {}, Lcom/usebutton/sdk/Button;->actions()Lcom/usebutton/sdk/action/ButtonActionsInterface;

    move-result-object p1

    invoke-interface {p1, v1, p0}, Lcom/usebutton/sdk/action/ButtonActionsInterface;->fetch(Lcom/usebutton/sdk/action/ActionRequest;Lcom/usebutton/sdk/action/ActionListener;)V

    :goto_1
    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->withRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    .line 270
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->initLogo()V

    .line 271
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->initMessage()V

    return-void
.end method

.method public setTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public showFailedToLaunchAppMessage()V
    .locals 2

    const/4 v0, 0x1

    const v1, 0x7f1103f6

    .line 211
    invoke-virtual {p0, v1, v0, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showSubmittedJobLoading()V
    .locals 0

    return-void
.end method
