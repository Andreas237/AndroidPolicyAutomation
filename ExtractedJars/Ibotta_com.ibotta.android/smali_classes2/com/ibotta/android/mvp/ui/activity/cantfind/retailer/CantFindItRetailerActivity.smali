.class public Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "CantFindItRetailerActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;
.implements Lcom/ibotta/android/views/base/info/InformationRowViewEvents;
.implements Lcom/ibotta/android/views/content/row/ContentRowViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewEvents;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;"
    }
.end annotation


# instance fields
.field protected ilvRetailerPicker:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024a
    .end annotation
.end field

.field private offerId:I

.field private retailerLocationsData:Landroid/content/Intent;

.field private retailerLocationsResultCode:I

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initRetailerPickerList()V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->ilvRetailerPicker:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f1100e1

    .line 98
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->setTitle(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "offer_id"

    .line 80
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->offerId:I

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "offer_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->offerId:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 28
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;
    .locals 1

    .line 46
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;)V

    .line 48
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent$Builder;->cantFindItRetailerModule(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerModule;)Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent$Builder;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/DaggerCantFindItRetailerComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithRetailerLocationsResult()V
    .locals 2

    .line 121
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->retailerLocationsResultCode:I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->retailerLocationsData:Landroid/content/Intent;

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->setResult(ILandroid/content/Intent;)V

    .line 122
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->finish()V

    return-void
.end method

.method public getPickerInformationString()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1100e0

    .line 127
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;)V
    .locals 0

    .line 54
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0xe

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x2

    if-ne p2, p1, :cond_1

    .line 91
    :cond_0
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->retailerLocationsResultCode:I

    .line 92
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->retailerLocationsData:Landroid/content/Intent;

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;->onRetailerLocationsDataSuccess()V

    :cond_1
    return-void
.end method

.method public onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;->onMainButtonClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 59
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0023

    .line 63
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->setContentView(I)V

    .line 64
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->initTitle()V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->initRetailerPickerList()V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->offerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;->setOfferId(I)V

    return-void
.end method

.method public onInformationRowClicked(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V
    .locals 0

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;->onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onRowRetailerImageClicked()V
    .locals 0

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 74
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "offer_id"

    .line 75
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public showRetailerLocationsMap(IZI)V
    .locals 1

    .line 112
    new-instance v0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;-><init>(Landroid/content/Context;I)V

    .line 113
    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->cantFindIt(Z)Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    move-result-object p1

    .line 114
    invoke-virtual {p1, p3}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->offerId(I)Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    move-result-object p1

    .line 115
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0xe

    .line 116
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public updateListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;->ilvRetailerPicker:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method
