.class public Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "EarningsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;
.implements Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;",
        "Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;"
    }
.end annotation


# instance fields
.field protected elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ac
    .end annotation
.end field

.field private pendingOnly:Z

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvSubtitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09057c
    .end annotation
.end field

.field protected tvSubtitleValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090580
    .end annotation
.end field

.field protected tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    return-void
.end method

.method private initNotifications()V
    .locals 3

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->setListener(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->setFilter(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private initTitle()V
    .locals 2

    const/4 v0, 0x0

    .line 148
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 149
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvTitle:Landroid/widget/TextView;

    const v1, 0x7f1104ac

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvTitle:Landroid/widget/TextView;

    const v1, 0x7f11028d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "pending_only"

    .line 117
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "pending_only"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;Z)Landroid/content/Intent;
    .locals 2

    .line 67
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "pending_only"

    .line 68
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-static {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->start(Landroid/content/Context;Z)V

    return-void
.end method

.method public static start(Landroid/content/Context;Z)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 63
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->newIntent(Landroid/content/Context;Z)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;
    .locals 1

    .line 79
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;

    move-result-object v0

    .line 80
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;)V

    .line 81
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->earningsModule(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;)Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;

    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public hideLoadingEarnings()V
    .locals 1

    .line 183
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->hideScreenLoading()V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->hideLoading()V

    return-void
.end method

.method public initSubtitle()V
    .locals 2

    .line 206
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    const v1, 0x7f1104ab

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    const v1, 0x7f1103c4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;)V
    .locals 0

    .line 87
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 92
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 94
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->loadState(Landroid/os/Bundle;)V

    .line 95
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;->setPendingOnly(Z)V

    const p1, 0x7f0c0031

    .line 97
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->setContentView(I)V

    .line 98
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->initTitle()V

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->initSubtitle()V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->initNotifications()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0005

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 133
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onEarningRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;->onEarningRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V

    return-void
.end method

.method public onEarningsLoadFailed()V
    .locals 3

    const v0, 0x7f11048a

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 189
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public onLastItemDisplayed(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;->onLastRowDisplayed(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 138
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f09001c

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 140
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;->onHelpIconClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 125
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "pending_only"

    .line 126
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 107
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStart()V

    .line 108
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->pendingOnly:Z

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "pending_earnings"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->view(Ljava/lang/String;)V

    goto :goto_0

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "all_earnings"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->view(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;)V"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public setSubtitleValue(Ljava/lang/String;)V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitleValue:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showCustomerBonusDetails(Ljava/lang/String;I)V
    .locals 2

    .line 199
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 200
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    .line 201
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 202
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 199
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showEarningsDetails(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
    .locals 0

    .line 194
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->start(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V

    return-void
.end method

.method public showHelpCenter()V
    .locals 1

    .line 158
    new-instance v0, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showLoadingEarnings(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->showScreenLoading()V

    goto :goto_0

    .line 177
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->showLoading()V

    :goto_0
    return-void
.end method
