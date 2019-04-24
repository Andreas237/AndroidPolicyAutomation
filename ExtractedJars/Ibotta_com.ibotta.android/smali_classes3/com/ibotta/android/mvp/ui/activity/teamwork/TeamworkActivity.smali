.class public Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "TeamworkActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;"
    }
.end annotation


# instance fields
.field appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bAddTeammates:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007d
    .end annotation
.end field

.field protected bdvBonusDetail:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b6
    .end annotation
.end field

.field protected bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900bf
    .end annotation
.end field

.field protected evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d8
    .end annotation
.end field

.field fbCallbackManager:Lcom/facebook/CallbackManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected hbvFacebook:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09021f
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected llContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090330
    .end annotation
.end field

.field protected rvTeammates:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903df
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tbvTeammatesTitle:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044c
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;I)V
    .locals 0

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showQuickMessage(I)V

    return-void
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showQuickMessage(Ljava/lang/String;)V

    return-void
.end method

.method private initViews()V
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bAddTeammates:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;->getCta()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->setListener(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public static synthetic lambda$initAdapter$0(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;I)V
    .locals 4

    const-string v0, "onFriendClicked: %1$d"

    const/4 v1, 0x1

    .line 208
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFriendClicked(I)V

    return-void
.end method

.method public static synthetic lambda$initAdapter$1(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;I)Z
    .locals 5

    const-string v0, "onFriendLongClicked: %1$d"

    const/4 v1, 0x1

    .line 213
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFriendLongClicked(I)V

    return v1
.end method

.method public static synthetic lambda$showRemoveConfirmation$2(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 263
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onRemoveCanceled()V

    return-void
.end method

.method public static synthetic lambda$showRemoveConfirmation$3(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/view/model/FriendItem;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 266
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onRemoveConfirmed(Lcom/ibotta/android/view/model/FriendItem;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;
    .locals 1

    .line 88
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;

    move-result-object v0

    .line 89
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;)V

    .line 90
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->teamworkModule(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;

    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;

    move-result-object p1

    return-object p1
.end method

.method public doFacebookShare(Lcom/facebook/share/internal/ShareFeedContent;)V
    .locals 3

    .line 288
    new-instance v0, Lcom/facebook/share/widget/ShareDialog;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/ShareDialog;-><init>(Landroid/app/Activity;)V

    .line 289
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbCallbackManager:Lcom/facebook/CallbackManager;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/share/widget/ShareDialog;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 307
    invoke-virtual {v0, p1}, Lcom/facebook/share/widget/ShareDialog;->show(Ljava/lang/Object;)V

    return-void
.end method

.method public getFriendName(Lcom/ibotta/android/view/model/FriendItem;Lcom/ibotta/api/model/friend/Friend;)Lcom/ibotta/android/view/model/FriendItem;
    .locals 2

    .line 312
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result v0

    if-eqz v0, :cond_0

    const p2, 0x7f1101ae

    .line 313
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/model/FriendItem;->setName(Ljava/lang/String;)V

    goto :goto_0

    .line 315
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v0

    .line 316
    invoke-virtual {p2}, Lcom/ibotta/api/model/friend/Friend;->getLastName()Ljava/lang/String;

    move-result-object p2

    .line 317
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, v0, p2}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/model/FriendItem;->setName(Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public hideFacebookLoading()V
    .locals 0

    .line 335
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->hideSubmittedJobLoading()V

    return-void
.end method

.method public hideRemovingFriendMessage()V
    .locals 0

    .line 278
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->hideSubmittedJobLoading()V

    return-void
.end method

.method public initAdapter(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 204
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, p1, v1, v2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;-><init>(Ljava/util/List;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;)V

    const/4 p1, 0x1

    .line 205
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->setBonusContribution(Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 207
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$eNyYM202DYsIjsqSgI2lRurpKRM;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$eNyYM202DYsIjsqSgI2lRurpKRM;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->setClickListener(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;)V

    .line 212
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$xgXTv9u15P2RsU_aDzecCfgwqXU;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$xgXTv9u15P2RsU_aDzecCfgwqXU;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->setOnItemLongClickListener(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;)V

    .line 218
    new-instance p2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {p2, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 219
    invoke-virtual {p2, p1}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 221
    new-instance p1, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-direct {p1, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 223
    invoke-virtual {p1, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    check-cast p1, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 224
    invoke-virtual {p1, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    check-cast p1, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 225
    invoke-virtual {p1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object p1

    .line 227
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/support/v4/view/ViewCompat;->setNestedScrollingEnabled(Landroid/view/View;Z)V

    .line 228
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, p2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 229
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 230
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 232
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, v2}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 233
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->tbvTeammatesTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/views/base/title/TitleBarView;->setVisibility(I)V

    return-void
.end method

.method public initSocialViewVisibility(Ljava/lang/Boolean;)V
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->llContainer:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 194
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 195
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->hbvFacebook:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;->setVisibility(I)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->hbvFacebook:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 66
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;)V
    .locals 0

    .line 96
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    return-void
.end method

.method public isAutoSocialConnect()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public launchBonus(Lcom/ibotta/api/model/BonusModel;)V
    .locals 3

    .line 153
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 154
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    .line 155
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result p1

    const/4 v2, 0x0

    aput p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 153
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public launchFriendScreen(I)V
    .locals 0

    .line 251
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->start(Landroid/content/Context;I)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 244
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/social/facebook/FacebookManager;->onActivityResult(IILandroid/content/Intent;)V

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbCallbackManager:Lcom/facebook/CallbackManager;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    return-void
.end method

.method protected onAddTeammatesClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007d
        }
    .end annotation

    .line 391
    new-instance v0, Lcom/ibotta/android/routing/intent/InviteIntentCreator;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/InviteIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/InviteIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 101
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "onCreate: %1$s"

    const/4 v1, 0x1

    .line 103
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setUiListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;)V

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setInfoListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;)V

    .line 107
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setAuthListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;)V

    .line 108
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setLoginListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;)V

    .line 109
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setLinkListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;)V

    const p1, 0x7f0c0071

    .line 111
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->setContentView(I)V

    const p1, 0x7f110626

    .line 112
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->setTitle(I)V

    .line 113
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 114
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->initViews()V

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onCreate()V

    .line 117
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->setFacebookManager(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onDestroy()V

    .line 239
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onDestroy()V

    return-void
.end method

.method public onFacebookAuthFailed()V
    .locals 3

    const v0, 0x7f1102ac

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 345
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showQuickMessage(IZZ)V

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookAuthFailed()V

    return-void
.end method

.method public onFacebookAuthSuccess()V
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookAuthSuccess()V

    return-void
.end method

.method public onFacebookInfoFailed()V
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookAuthFailed()V

    return-void
.end method

.method public onFacebookInfoSuccess()V
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookInfoSuccess()V

    return-void
.end method

.method public onFacebookLinkFailed()V
    .locals 3

    const v0, 0x7f1102ac

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 376
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public onFacebookLinkSuccess()V
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookLinkSuccess()V

    return-void
.end method

.method public onFacebookLoginFailed()V
    .locals 3

    const v0, 0x7f1102ac

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 366
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public onFacebookLoginSuccess(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 361
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookLoginSuccess()V

    return-void
.end method

.method protected onFacebookSignInClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09021f
        }
    .end annotation

    .line 396
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onFacebookClicked()V

    return-void
.end method

.method public onFacebookUnlinkFailed()V
    .locals 0

    return-void
.end method

.method public onFacebookUnlinkSuccess()V
    .locals 0

    return-void
.end method

.method public setBonusDetail(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 2

    if-nez p1, :cond_0

    .line 175
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bdvBonusDetail:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->setVisibility(I)V

    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bdvBonusDetail:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bdvBonusDetail:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->setup(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    :goto_0
    return-void
.end method

.method public setBonuses(Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 161
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 162
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->setRows(Ljava/util/List;)V

    .line 163
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->setVisibility(I)V

    goto :goto_0

    .line 166
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public showEmptyBonuses(Z)V
    .locals 4

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;->setVisibility(I)V

    .line 185
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyViewState;

    const v1, 0x7f08020e

    const v2, 0x7f110627

    .line 187
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 185
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method

.method public showFacebookLoading(Ljava/lang/String;)V
    .locals 0

    .line 330
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method

.method public showRemoveConfirmation(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 3

    const v0, 0x7f110625

    .line 256
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110623

    .line 257
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 259
    new-instance v2, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 260
    invoke-virtual {v2, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 261
    invoke-virtual {v2, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 262
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$nIZ2JLy3Xm5jzVgk7x5EDSOK9bM;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$nIZ2JLy3Xm5jzVgk7x5EDSOK9bM;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    const v1, 0x7f1101b9

    invoke-virtual {v2, v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 265
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/view/model/FriendItem;)V

    const p1, 0x7f11020d

    invoke-virtual {v2, p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 268
    invoke-virtual {v2}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method

.method public showRemovedFriendSuccess()V
    .locals 1

    const v0, 0x7f110624

    .line 283
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showQuickMessage(I)V

    return-void
.end method

.method public showRemovingFriendMessage()V
    .locals 1

    const v0, 0x7f1103db

    .line 273
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method
