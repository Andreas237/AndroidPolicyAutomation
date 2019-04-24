.class public Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ContentDetailActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;
.implements Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;",
        "Lcom/ibotta/android/mvp/ui/misc/ModalIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;",
        "Lcom/ibotta/android/tracking/proprietary/event/EventContributor;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected bPayAtRetailer:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090098
    .end annotation
.end field

.field protected csdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090173
    .end annotation
.end field

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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ContentDetailActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "setupCard"

    const-string v3, "com.ibotta.android.mvp.ui.activity.content.ContentDetailActivity"

    const-string v4, "com.ibotta.android.content.card.ContentCardViewState"

    const-string v5, "contentCardViewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "content_id"

    .line 76
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/content/ContentId;

    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "content_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/content/ContentId;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 81
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->setContentId(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 35
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;
    .locals 1

    .line 45
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent$Builder;

    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;)V

    .line 47
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent$Builder;->contentDetailModule(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailModule;)Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent$Builder;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/content/DaggerContentDetailComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;

    move-result-object p1

    return-object p1
.end method

.method public finish()V
    .locals 2

    .line 120
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010039

    .line 121
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 176
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SPOTLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 35
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;)V
    .locals 0

    .line 53
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onContentImageCardClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 58
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f010038

    const/4 v1, 0x0

    .line 60
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->overridePendingTransition(II)V

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0028

    .line 64
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->setContentView(I)V

    .line 65
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 67
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v0, 0x7f0800a1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->initBottomSheetBehavior(Landroid/widget/LinearLayout;)V

    .line 70
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0011

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 94
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

    .line 104
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090020

    if-eq v0, v1, :cond_0

    .line 110
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 106
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onModalCloseClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method protected onPayAtRetailerClicked(Landroid/view/View;)V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090098
        }
    .end annotation

    .line 171
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onPayAtRetailerClicked()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 86
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "content_id"

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onTopSpacingClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0905bd
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onModalTopSpacingClicked()V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setupButton(Ljava/lang/String;)V
    .locals 3

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->bPayAtRetailer:Landroid/widget/Button;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11052d

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->bPayAtRetailer:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method public setupCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 128
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
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

.method public setupDetails(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->csdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->setContentModel(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
