.class public Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;
.super Landroid/support/v4/app/Fragment;
.source "ShowEpisodesRecyclerViewFragment.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;
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
        "Lcom/rt/mobile/english/data/shows/ShowEpisode;",
        ">;>;>;"
    }
.end annotation


# static fields
.field private static final ARG_SHOW_ID:Ljava/lang/String; = "show_id"

.field private static final ARG_SHOW_TITLE:Ljava/lang/String; = "show_title"


# instance fields
.field episodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/shows/ShowEpisode;",
            ">;"
        }
    .end annotation
.end field

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

.field noEpisodes:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090107
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

.field showId:Ljava/lang/String;

.field showTitle:Ljava/lang/String;

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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->onEpisodeClicked(I)V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;
    .locals 3

    .line 79
    new-instance v0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;-><init>()V

    .line 80
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "show_id"

    .line 81
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "show_title"

    .line 82
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private onEpisodeClicked(I)V
    .locals 4

    .line 137
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 138
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->episodes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rt/mobile/english/data/shows/ShowEpisode;

    .line 139
    iget-object v3, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v3, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 141
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const-class v3, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "episodes_string"

    .line 142
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const-string v0, "initial_position"

    .line 143
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "section_title"

    .line 144
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->showTitle:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 198
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Load episodes error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 199
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 200
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 129
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 90
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 100
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 101
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "show_id"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->showId:Ljava/lang/String;

    .line 102
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "show_title"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->showTitle:Ljava/lang/String;

    .line 103
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    const v0, 0x7f0c0057

    .line 109
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 110
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 111
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 112
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 113
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v0, Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/rt/mobile/english/ui/SpacingItemDecoration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 114
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 115
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 116
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070052

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, p3, p3, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressViewOffset(ZII)V

    .line 117
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-object p1
.end method

.method public onRefresh()V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 172
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 123
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 124
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f100027

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 166
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 95
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    return-void
.end method

.method public reloadData()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->showsService:Lcom/rt/mobile/english/data/shows/ShowsService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->showId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/shows/ShowsService;->listEpisodes(Ljava/lang/String;Lretrofit/Callback;)V

    return-void
.end method

.method public setRecyclerViewLayoutManager()V
    .locals 5

    .line 153
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 155
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 158
    :goto_0
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a0005

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 159
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 160
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/shows/ShowEpisode;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 177
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 178
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->episodes:Ljava/util/List;

    .line 179
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 184
    :cond_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->episodes:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_1

    .line 185
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->noEpisodes:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 187
    :cond_1
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->noEpisodes:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 190
    :goto_0
    new-instance p2, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;-><init>(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;Ljava/util/List;)V

    .line 191
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 192
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setVisibility(I)V

    .line 193
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 44
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
