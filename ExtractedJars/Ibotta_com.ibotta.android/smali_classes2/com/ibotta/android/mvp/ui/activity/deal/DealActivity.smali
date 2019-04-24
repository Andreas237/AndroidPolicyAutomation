.class public Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "DealActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/deal/DealView;
.implements Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealView;",
        "Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;",
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

.field protected stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09042f
    .end annotation
.end field

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "DealActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "setupCard"

    const-string v3, "com.ibotta.android.mvp.ui.activity.deal.DealActivity"

    const-string v4, "com.ibotta.android.content.card.ContentCardViewState"

    const-string v5, "contentCardViewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x82

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "deal_id"

    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "deal_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 83
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->setDealId(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->getDealId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 204
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->getDealId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setDealId(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerId(Ljava/lang/Integer;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;
    .locals 1

    .line 47
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent$Builder;

    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealView;)V

    .line 49
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent$Builder;->dealModule(Lcom/ibotta/android/mvp/ui/activity/deal/DealModule;)Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent$Builder;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DaggerDealComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;

    move-result-object p1

    return-object p1
.end method

.method public finish()V
    .locals 2

    .line 122
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010039

    .line 123
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 211
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SPOTLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;)V
    .locals 0

    .line 55
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onContentImageCardClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 60
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f010038

    const/4 v1, 0x0

    .line 62
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->overridePendingTransition(II)V

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c002a

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->setContentView(I)V

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v0, 0x7f0800a1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    .line 70
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->initBottomSheetBehavior(Landroid/widget/LinearLayout;)V

    .line 72
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0011

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 90
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 100
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090020

    if-eq v0, v1, :cond_0

    .line 106
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 102
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onModalCloseClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 111
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "deal_id"

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->getDealId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 160
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->trackDealShop()V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onTopSpacingClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0905bd
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onModalTopSpacingClicked()V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setupCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 130
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
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

.method public showFullScreenImage(Ljava/lang/String;)V
    .locals 1

    .line 135
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;-><init>(Landroid/content/Context;)V

    .line 136
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->setImageUrl(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->show()V

    return-void
.end method

.method public trackDealShop()V
    .locals 3

    .line 185
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 186
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 189
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;-><init>()V

    .line 190
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 192
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 193
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 194
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;->setCounter(I)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public trackDealView()V
    .locals 2

    .line 172
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 173
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 176
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;-><init>()V

    .line 177
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const/4 v0, 0x1

    .line 179
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;->setCounter(I)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
