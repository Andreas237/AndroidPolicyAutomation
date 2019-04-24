.class public Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "RedeemRetailersActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;
.implements Lcom/ibotta/android/views/empty/EmptyViewEvents;
.implements Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;",
        "Lcom/ibotta/android/views/empty/EmptyViewEvents;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;"
    }
.end annotation


# instance fields
.field protected ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090029
    .end annotation
.end field

.field protected evEmpty:Lcom/ibotta/android/views/empty/EmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d8
    .end annotation
.end field

.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

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

.field protected vpRetailers:Landroid/support/v4/view/ViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905cd
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->onTabSelected(I)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method

.method private createViewFromData(ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)Landroid/view/View;
    .locals 4

    .line 198
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0c01b3

    const/4 v3, 0x0

    .line 199
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 201
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;)V

    .line 204
    invoke-static {v1, v0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 205
    invoke-direct {p0, v1, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->setupViewHolder(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V

    return-object v0
.end method

.method private initEmptyView()V
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v1, Lcom/ibotta/android/views/empty/EmptyViewState;

    const v2, 0x7f110581

    .line 160
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1101c8

    .line 161
    invoke-virtual {p0, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f0801a3

    invoke-direct {v1, v4, v2, v3}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 158
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/views/empty/EmptyView;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method private initTabSelector()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-static {}, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->values()[Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    return-void
.end method

.method private initTabTitles()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f11058a

    .line 112
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->setTitle(I)V

    return-void
.end method

.method private initViewPager()V
    .locals 2

    .line 116
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;-><init>()V

    .line 117
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 118
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->setupViewPagerListener()V

    return-void
.end method

.method private onTabSelected(I)V
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 233
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V

    :cond_0
    return-void
.end method

.method private onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;->onTabSelected(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V

    return-void
.end method

.method private setupViewHolder(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 211
    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {p1, v0, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->setFastBubbleScrollEnabled(ZLandroid/support/design/widget/AppBarLayout;Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;)V

    .line 214
    invoke-virtual {p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V

    .line 215
    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V

    return-void
.end method

.method private setupViewPagerListener()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method private switchToTab(I)V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    return-void
.end method


# virtual methods
.method public addTabViewState(ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;

    if-eqz v0, :cond_0

    .line 174
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->createViewFromData(ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->addView(ILandroid/view/View;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;
    .locals 1

    .line 70
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;)V

    .line 72
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->redeemRetailersModule(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;-><init>(Landroid/app/Activity;)V

    .line 73
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->imScreenModule(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-nez v0, :cond_0

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 45
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;)V
    .locals 0

    .line 79
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V

    return-void
.end method

.method public onActionButtonClick()V
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;->onNoUnlocksOkClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "event_context"

    .line 87
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "event_context"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    :cond_1
    :goto_0
    const p1, 0x7f0c0064

    .line 92
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->setContentView(I)V

    .line 93
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->initTitle()V

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->initTabSelector()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->initTabTitles()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->initViewPager()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->initEmptyView()V

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

.method public onRetailerBound(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;->onRetailerBound(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;->onRetailerClicked(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 104
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-eqz v0, :cond_0

    const-string v1, "event_context"

    .line 107
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public removeAllTabs()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    return-void
.end method

.method public selectTab(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V
    .locals 1

    .line 180
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$3;->$SwitchMap$com$ibotta$android$view$retailer$RetailerFilterOption:[I

    invoke-virtual {p1}, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 188
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown tab selected"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 p1, 0x1

    .line 185
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->switchToTab(I)V

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x0

    .line 182
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->switchToTab(I)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public showNoUnlocks()V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/design/widget/AppBarLayout;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/empty/EmptyView;->setVisibility(I)V

    return-void
.end method

.method public showRedeemScreen(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    return-void
.end method
