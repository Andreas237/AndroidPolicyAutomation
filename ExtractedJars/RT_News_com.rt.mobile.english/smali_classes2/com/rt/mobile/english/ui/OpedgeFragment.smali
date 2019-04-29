.class public Lcom/rt/mobile/english/ui/OpedgeFragment;
.super Landroid/support/v4/app/Fragment;
.source "OpedgeFragment.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lretrofit/Callback;
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
.implements Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/articles/Article;",
        ">;>;>;",
        "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;",
        "Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;"
    }
.end annotation


# instance fields
.field ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

.field ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

.field articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;
    .annotation runtime Ljavax/inject/Inject;
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

.field recyclerView:Landroid/support/v7/widget/RecyclerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09012c
    .end annotation
.end field

.field responseItem:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;"
        }
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
        value = 0x7f090025
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private onResponse(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 262
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 266
    :cond_1
    new-instance v0, Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, v0

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v2 .. v8}, Lcom/rt/mobile/english/ui/ArticlesAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/rt/mobile/english/data/Message;)V

    .line 267
    iget-object v2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 268
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-eqz v0, :cond_2

    .line 269
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setVisibility(I)V

    .line 271
    :cond_2
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 272
    iput-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->responseItem:Ljava/util/List;

    .line 273
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->updateVisual()V

    return-void
.end method

.method private updateVisual()V
    .locals 7

    .line 194
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f10011d

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070051

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070052

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    .line 196
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    .line 195
    invoke-virtual {v0, v2, v4, v3, v5}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 198
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->setRecyclerViewLayoutManager()V

    goto :goto_0

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070053

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v4, v3}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 201
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->setRecyclerViewLayoutManager()V

    .line 205
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    new-instance v0, Lcom/rt/mobile/english/ui/OpedgeFragment$2;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/OpedgeFragment$2;-><init>(Lcom/rt/mobile/english/ui/OpedgeFragment;)V

    .line 213
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a0005

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 214
    iget-object v1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    check-cast v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    goto :goto_1

    .line 216
    :cond_1
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 219
    :goto_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 230
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Load items error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 231
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-eqz p1, :cond_0

    .line 232
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 234
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 120
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 121
    new-instance p1, Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/SpacingItemDecoration;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    .line 122
    new-instance p1, Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/SpacingItemDecorationList;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    .line 123
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f10011d

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 124
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    goto :goto_0

    .line 126
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 128
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f100035

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onArticleClicked(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation

    .line 278
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 280
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/articles/Article;

    .line 281
    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 282
    iget-object v2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 285
    :cond_1
    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-direct {p2, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "articles_string"

    .line 286
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const-string v0, "initial_position"

    .line 287
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "section_title"

    .line 288
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    const-string p1, "opedge"

    const/4 v0, 0x1

    .line 289
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 291
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/OpedgeFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 73
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 74
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onBreakingNews(Lcom/rt/mobile/english/data/Message;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 186
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 187
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->updateVisual()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 79
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 80
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->reloadData()V

    .line 81
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 84
    :try_start_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "open_uri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "open_uri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 86
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 88
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "article_id"

    .line 89
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "section_title"

    .line 90
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    const-string p1, "opedge"

    const/4 v1, 0x1

    .line 91
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 93
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c0054

    .line 104
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 105
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 106
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 107
    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 109
    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 110
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->setRecyclerViewLayoutManager()V

    .line 111
    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 112
    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070052

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p2, p3, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressViewOffset(ZII)V

    .line 113
    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-object p1
.end method

.method public onRateAppFinished()V
    .locals 0

    return-void
.end method

.method public onRefresh()V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 181
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->reloadData()V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 175
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->reloadData()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 163
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 239
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f100112

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 240
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->responseItem:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 241
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->responseItem:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/OpedgeFragment;->onResponse(Ljava/util/List;)V

    goto :goto_0

    .line 243
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->reloadData()V

    .line 246
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    const p2, 0x7f10011d

    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 247
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 248
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    goto :goto_1

    .line 250
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 251
    iget-object p1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 253
    :goto_1
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->updateVisual()V

    :cond_2
    return-void
.end method

.method public reloadData()V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->getPosts(Lretrofit/Callback;)V

    return-void
.end method

.method public setRecyclerViewLayoutManager()V
    .locals 6

    .line 134
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 136
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 138
    iget-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 139
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 142
    :cond_1
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f10011d

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 143
    new-instance v1, Lcom/rt/mobile/english/ui/OpedgeFragment$1;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/OpedgeFragment$1;-><init>(Lcom/rt/mobile/english/ui/OpedgeFragment;)V

    .line 150
    new-instance v2, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0a0005

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 151
    iget-object v2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    check-cast v2, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    goto :goto_1

    .line 153
    :cond_2
    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/OpedgeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 157
    :goto_1
    iget-object v1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 158
    iget-object v1, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 225
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/OpedgeFragment;->onResponse(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 45
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/OpedgeFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
