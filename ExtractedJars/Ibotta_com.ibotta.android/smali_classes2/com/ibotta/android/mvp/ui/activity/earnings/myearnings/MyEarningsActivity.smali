.class public Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "MyEarningsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;
.implements Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;
.implements Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;
.implements Lcom/ibotta/android/views/empty/EmptyViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;",
        "Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;",
        "Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;",
        "Lcom/ibotta/android/views/empty/EmptyViewEvents;"
    }
.end annotation


# instance fields
.field brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected evEmpty:Lcom/ibotta/android/views/empty/EmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d8
    .end annotation
.end field

.field protected llEarningsGraphContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090308
    .end annotation
.end field

.field protected mehvEarningsHistory:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090355
    .end annotation
.end field

.field protected metvTeammates:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09035c
    .end annotation
.end field

.field notificationIntentCreator:Lcom/ibotta/android/routing/intent/NotificationIntentCreator;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rvBarGraph:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d7
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tvMemeberSinceDate:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090547
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
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initSubtitle()V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    const v1, 0x7f110420

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private initTitle()V
    .locals 2

    const/4 v0, 0x0

    .line 100
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvTitle:Landroid/widget/TextView;

    const v1, 0x7f110421

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;
    .locals 1

    .line 68
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;

    move-result-object v0

    .line 69
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;)V

    .line 70
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->myEarningsModule(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;

    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 47
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;)V
    .locals 0

    .line 76
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;)V

    return-void
.end method

.method public onActionButtonClick()V
    .locals 0

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->showFindRebates()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 81
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c004f

    .line 83
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->setContentView(I)V

    .line 84
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->initTitle()V

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->initSubtitle()V

    return-void
.end method

.method public onEarningRowViewClicked(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;->onEarningsRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V

    return-void
.end method

.method public synthetic onEmptyViewClicked()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/empty/EmptyViewEvents$-CC;->$default$onEmptyViewClicked(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 92
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onResume()V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackMyRankView()V

    return-void
.end method

.method public onTeammateClicked(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 1

    .line 182
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->start(Landroid/content/Context;I)V

    return-void
.end method

.method public onViewAllTeammatesClicked()V
    .locals 0

    .line 195
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->start(Landroid/content/Context;)V

    return-void
.end method

.method public onViewFullEarningsHistoryClicked()V
    .locals 0

    .line 177
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->start(Landroid/content/Context;)V

    return-void
.end method

.method public setMyEarningsVisibility(Z)V
    .locals 4

    if-nez p1, :cond_0

    .line 149
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->llEarningsGraphContainer:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 150
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->mehvEarningsHistory:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->setVisibility(I)V

    .line 151
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/empty/EmptyView;->setVisibility(I)V

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyViewState;

    const v1, 0x7f080290

    const v2, 0x7f11041f

    .line 154
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1102c2

    .line 155
    invoke-virtual {p0, v3}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    .line 156
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/empty/EmptyView;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    :cond_0
    return-void
.end method

.method public setSubtitleValue(Ljava/lang/String;)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvSubtitleValue:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setupMyEarningsGraph(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 3

    if-nez p1, :cond_0

    .line 126
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->rvBarGraph:Landroid/support/v7/widget/RecyclerView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    goto :goto_0

    .line 128
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;-><init>()V

    .line 129
    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->setGraphData(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->rvBarGraph:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 132
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->rvBarGraph:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 134
    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->getItemCount()I

    move-result p1

    if-eqz p1, :cond_1

    .line 135
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->rvBarGraph:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setupMyEarningsHistory(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)V"
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->mehvEarningsHistory:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->setup(Ljava/util/List;)V

    .line 143
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->mehvEarningsHistory:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->setListener(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;)V

    return-void
.end method

.method public setupMyEarningsMemberSince(Ljava/lang/String;)V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvMemeberSinceDate:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setupTeammates(Ljava/util/List;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;II)V"
        }
    .end annotation

    .line 162
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->metvTeammates:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->setVisibility(I)V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->metvTeammates:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->setup(Ljava/util/List;II)V

    .line 166
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->metvTeammates:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->setListener(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;)V

    :goto_0
    return-void
.end method

.method public showCustomerBonusDetails(Ljava/lang/String;I)V
    .locals 2

    .line 205
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 206
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    .line 207
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 208
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 205
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showEarningsDetails(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
    .locals 0

    .line 200
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->start(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V

    return-void
.end method
