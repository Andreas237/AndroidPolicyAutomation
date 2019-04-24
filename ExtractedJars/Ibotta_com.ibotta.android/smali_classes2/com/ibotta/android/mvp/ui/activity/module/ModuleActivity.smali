.class public Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "ModuleActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;
.implements Lcom/ibotta/android/views/content/row/ContentRowViewEvents;
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;"
    }
.end annotation


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private ilvList:Lcom/ibotta/android/views/list/IbottaListView;

.field private localBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private moduleId:I

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;Landroid/content/Intent;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->onLocalBroadcastReceived(Landroid/content/Intent;)V

    return-void
.end method

.method private initRecycler()V
    .locals 2

    .line 134
    new-instance v0, Lcom/ibotta/android/views/list/IbottaListView;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/list/IbottaListView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->addView(Landroid/view/View;)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "module_id"

    .line 126
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->moduleId:I

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "module_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->moduleId:I

    :cond_1
    :goto_0
    return-void
.end method

.method private onLocalBroadcastReceived(Landroid/content/Intent;)V
    .locals 1

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/LocalBroadcast;->isRefreshData(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->moduleId:I

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getRecentlyViewedModuleId()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onRefresh()V

    :cond_0
    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 162
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 163
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->moduleId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->getModuleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleName(Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;
    .locals 1

    .line 63
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;

    move-result-object v0

    .line 64
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;)V

    .line 65
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->moduleModule(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;)Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;

    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 169
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MODULE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 45
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;)V
    .locals 0

    .line 99
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 116
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, 0x3

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 120
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onUnlockCompleted()V

    :cond_0
    return-void
.end method

.method public onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 104
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c004d

    .line 108
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->setContentView(I)V

    .line 109
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 111
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->moduleId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->setModuleId(I)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onContentClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onRowRetailerImageClicked()V
    .locals 0

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 156
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "module_id"

    .line 157
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->moduleId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 71
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStart()V

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 78
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.ibotta.android.LOCAL"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 91
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 94
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStop()V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    if-nez v0, :cond_0

    .line 143
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->initRecycler()V

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f1101c7

    .line 204
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->setTitle(I)V

    return-void
.end method

.method public showFailedToLoad()V
    .locals 3

    const v0, 0x7f110406

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 151
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->showQuickMessage(IZZ)V

    return-void
.end method
