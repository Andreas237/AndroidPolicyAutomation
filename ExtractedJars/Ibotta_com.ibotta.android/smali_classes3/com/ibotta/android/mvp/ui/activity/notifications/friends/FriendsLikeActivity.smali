.class public Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "FriendsLikeActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected lvFriendsLike:Landroid/widget/ListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090346
    .end annotation
.end field

.field private offerId:I

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initListView()V
    .locals 5

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Ljava/util/List;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->lvFriendsLike:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->lvFriendsLike:Landroid/widget/ListView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/-$$Lambda$FriendsLikeActivity$2iFgn0WwHGxeIFNziAVXTwzateU;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/-$$Lambda$FriendsLikeActivity$2iFgn0WwHGxeIFNziAVXTwzateU;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;)V

    instance-of v2, v0, Landroid/widget/AdapterView;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/widget/AdapterView;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/AdapterViewInstrumentation;->setOnItemClickListener(Landroid/widget/AdapterView;Landroid/widget/AdapterView$OnItemClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initListView$0(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 93
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->onFriendClicked(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "offer_id"

    .line 75
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->offerId:I

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "offer_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->offerId:I

    .line 80
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->offerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenter;->setOfferId(I)V

    return-void
.end method

.method private onFriendClicked(I)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

    if-nez v0, :cond_0

    return-void

    .line 101
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/FriendItem;

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->start(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;
    .locals 1

    .line 50
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;)V

    .line 52
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent$Builder;->friendsLikeModule(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;)Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent$Builder;

    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/DaggerFriendsLikeComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;

    move-result-object p1

    return-object p1
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;)V
    .locals 0

    .line 58
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 63
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0039

    .line 67
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->setContentView(I)V

    .line 68
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->initListView()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 85
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "offer_id"

    .line 86
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public setFriendItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)V"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->clear()V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->addAll(Ljava/util/Collection;)V

    return-void
.end method
