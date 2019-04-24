.class public Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "MoreStoresActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;
.implements Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;",
        "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a2
    .end annotation
.end field

.field protected vpPager:Landroid/support/v4/view/ViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905cc
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initTabSelector()V
    .locals 3

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->setSwipeRefresh(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110416

    .line 81
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->setTitle(I)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 48
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 44
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;
    .locals 1

    .line 58
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;

    move-result-object v0

    .line 59
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;)V

    .line 60
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->moreStoresModule(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;)Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;)V
    .locals 0

    .line 66
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 71
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c004e

    .line 73
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->setContentView(I)V

    .line 74
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->initTitle()V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->initTabSelector()V

    return-void
.end method

.method public onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;->onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setDataMap(Ljava/util/LinkedHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;>;)V"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->setDataMap(Ljava/util/LinkedHashMap;)V

    return-void
.end method

.method public showMyOffersGallery(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 105
    new-instance v0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;-><init>(Landroid/content/Context;)V

    .line 106
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId(I)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object v0

    .line 107
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x12

    .line 109
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
