.class public Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "SeasonalActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;
.implements Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;",
        "Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;"
    }
.end annotation


# instance fields
.field private retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

.field protected slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090415
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initRecycler()V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "retailer_category"

    .line 88
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer_category"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 38
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;
    .locals 1

    .line 53
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;

    move-result-object v0

    .line 54
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;)V

    .line 55
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->seasonalModule(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;)Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 201
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SEASONAL:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getRetailerCategoryId()I
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v0

    return v0
.end method

.method protected initToolBar()V
    .locals 2

    .line 80
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->initToolBar()V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 38
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;)V
    .locals 0

    .line 61
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;)V

    return-void
.end method

.method public launchRoute(Ljava/lang/String;)V
    .locals 2

    .line 141
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 102
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, 0x3

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onUnlockCompleted()V

    :cond_0
    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 66
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 68
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0068

    .line 69
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->setContentView(I)V

    .line 70
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const/4 p1, 0x0

    .line 71
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 73
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->initRecycler()V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 96
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer_category"

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->trackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
    .locals 2

    .line 112
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    .line 113
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getCategoryType()Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/retailer/CategoryType;->HOT:Lcom/ibotta/api/model/retailer/CategoryType;

    if-ne v0, v1, :cond_0

    const p1, 0x7f1105c7

    .line 114
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->setTitle(I)V

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->setTitle(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;)V"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->slvRecycler:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f1101e6

    .line 196
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->setTitle(I)V

    return-void
.end method

.method public showFailedToLoad()V
    .locals 3

    const v0, 0x7f1105c6

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 131
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;->showQuickMessage(IZZ)V

    return-void
.end method
