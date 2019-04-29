.class public Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;
.super Landroid/support/v4/app/Fragment;
.source "ShowsRecyclerViewFragment.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/shows/Show;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900d7
    .end annotation
.end field

.field picasso:Lcom/squareup/picasso/Picasso;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field recyclerView:Landroid/support/v7/widget/RecyclerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09012c
    .end annotation
.end field

.field showsService:Lcom/rt/mobile/english/data/shows/ShowsService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09017f
    .end annotation
.end field

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field

.field toolbar_and_tabs:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090197
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;Lcom/rt/mobile/english/data/shows/Show;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->onShowClicked(Lcom/rt/mobile/english/data/shows/Show;)V

    return-void
.end method

.method private onShowClicked(Lcom/rt/mobile/english/data/shows/Show;)V
    .locals 3

    .line 144
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/EpisodesActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "show"

    .line 145
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 146
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 190
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Load episodes error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 191
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 192
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 123
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 71
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 72
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .line 128
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 129
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 130
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070051

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070052

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 131
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 130
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 77
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 78
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 79
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "open_uri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 80
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 82
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 83
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    .line 84
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const-class v4, Lcom/rt/mobile/english/ui/EpisodesActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "show_id"

    .line 85
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "episode_id"

    .line 86
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 89
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const-class v3, Lcom/rt/mobile/english/ui/EpisodesActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "show_id"

    .line 90
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    .line 95
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    const v0, 0x7f0c0057

    .line 101
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 102
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 103
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 104
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 105
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 106
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 107
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v0, Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/rt/mobile/english/ui/SpacingItemDecoration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 108
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 109
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070052

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, p3, p3, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressViewOffset(ZII)V

    .line 110
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-object p1
.end method

.method public onRefresh()V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 172
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 117
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 118
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f100039

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 166
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 136
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    return-void
.end method

.method public reloadData()V
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->showsService:Lcom/rt/mobile/english/data/shows/ShowsService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/shows/ShowsService;->listShows(Lretrofit/Callback;)V

    return-void
.end method

.method public setRecyclerViewLayoutManager()V
    .locals 5

    .line 152
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 154
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 157
    :goto_0
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a0005

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 158
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 159
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/shows/Show;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 177
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 178
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 182
    :cond_0
    new-instance p2, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;-><init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;Ljava/util/List;)V

    .line 183
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 184
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setVisibility(I)V

    .line 185
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 45
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
