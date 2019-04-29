.class public Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;
.super Landroid/support/v4/app/Fragment;
.source "ArticlesRecyclerViewFragment.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
.implements Lretrofit/Callback;
.implements Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/articles/Article;",
        ">;>;>;",
        "Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;"
    }
.end annotation


# static fields
.field public static final ARGUMENT_OTHER_NEWS:Ljava/lang/String; = "other_news"

.field public static final ARGUMENT_SECTION_ID:Ljava/lang/String; = "section_id"

.field public static final ARGUMENT_SECTION_POSITION:Ljava/lang/String; = "section_position"

.field public static final ARGUMENT_SECTION_TITLE:Ljava/lang/String; = "section_title"


# instance fields
.field ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

.field ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

.field articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field breakingNews:Lcom/rt/mobile/english/data/Message;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
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

.field private otherNews:Z

.field private positionFragment:I

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

.field private rootView:Landroid/view/View;

.field sectionId:Ljava/lang/String;

.field sectionTitle:Ljava/lang/String;

.field swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09017f
    .end annotation
.end field

.field toolbar:Landroid/support/v7/widget/Toolbar;

.field toolbar_rvf:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->otherNews:Z

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

    .line 349
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {v0, v7}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 352
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 359
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->breakingNews:Lcom/rt/mobile/english/data/Message;

    if-eqz v0, :cond_2

    .line 360
    new-instance v8, Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->positionFragment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-object v6, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->breakingNews:Lcom/rt/mobile/english/data/Message;

    move-object v0, v8

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/rt/mobile/english/ui/ArticlesAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/rt/mobile/english/data/Message;)V

    goto :goto_0

    .line 362
    :cond_2
    new-instance v8, Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->positionFragment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v8

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/rt/mobile/english/ui/ArticlesAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/rt/mobile/english/data/Message;)V

    .line 367
    :goto_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_3

    .line 368
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v8}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    goto :goto_1

    .line 370
    :cond_3
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 371
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->rootView:Landroid/view/View;

    const v1, 0x7f09012c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 372
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v8}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 375
    :goto_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-eqz v0, :cond_4

    .line 376
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {v0, v7}, Landroid/support/v4/widget/SwipeRefreshLayout;->setVisibility(I)V

    .line 378
    :cond_4
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 379
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->responseItem:Ljava/util/List;

    .line 380
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->updateVisual()V

    return-void
.end method

.method private updateVisual()V
    .locals 7

    .line 295
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f10011d

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070051

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070052

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    .line 297
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    .line 296
    invoke-virtual {v0, v2, v4, v3, v5}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 299
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    goto :goto_0

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070053

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v4, v3}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 302
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 306
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    new-instance v0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$3;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$3;-><init>(Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;)V

    .line 314
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a0005

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 315
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    check-cast v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    goto :goto_1

    .line 317
    :cond_1
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 320
    :goto_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 387
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Load items error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 388
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-eqz p1, :cond_0

    .line 389
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 391
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 171
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 172
    new-instance p1, Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/SpacingItemDecoration;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    .line 173
    new-instance p1, Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/SpacingItemDecorationList;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    .line 174
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f10011d

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 175
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    goto :goto_0

    .line 177
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    :goto_0
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

    .line 236
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 238
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

    .line 239
    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 240
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 243
    :cond_1
    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-direct {p2, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "articles_string"

    .line 244
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const-string v0, "initial_position"

    .line 245
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "section_title"

    .line 246
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->sectionTitle:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .line 114
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 115
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 117
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "section_id"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->sectionId:Ljava/lang/String;

    .line 118
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "section_title"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->sectionTitle:Ljava/lang/String;

    .line 119
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "section_position"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->positionFragment:I

    .line 120
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "other_news"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->otherNews:Z

    :cond_0
    return-void
.end method

.method public onBreakingNews(Lcom/rt/mobile/english/data/Message;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
            ">;)V"
        }
    .end annotation

    .line 253
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "section_title"

    const-string v2, ""

    .line 254
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "article_id"

    .line 255
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/articles/Breaking;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/articles/Breaking;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 287
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 288
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->updateVisual()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 126
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 127
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 128
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    new-instance v0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;-><init>(Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;)V

    invoke-interface {p1, v0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->getBreaking(Lretrofit/Callback;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c0057

    .line 147
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 148
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 149
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->toolbar_rvf:Landroid/support/v7/widget/Toolbar;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 151
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p2

    const-string v0, "main"

    invoke-static {p2, v0}, Lcom/rt/mobile/english/Utils;->findFragmentByTag(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p2

    instance-of p2, p2, Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    if-eqz p2, :cond_0

    .line 152
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p2

    const-string v0, "main"

    invoke-static {p2, v0}, Lcom/rt/mobile/english/Utils;->findFragmentByTag(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getToolbar()Landroid/support/v7/widget/Toolbar;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 155
    :cond_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz p2, :cond_1

    .line 156
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 159
    :cond_1
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 160
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 161
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 162
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070052

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p2, p3, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressViewOffset(ZII)V

    .line 163
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 165
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->rootView:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 189
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 190
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onRateAppFinished()V
    .locals 3

    .line 101
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a000e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 102
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    instance-of v0, v0, Landroid/support/v7/widget/GridLayoutManager;

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager$DefaultSpanSizeLookup;

    invoke-direct {v1}, Landroid/support/v7/widget/GridLayoutManager$DefaultSpanSizeLookup;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    .line 108
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->updateVisual()V

    return-void
.end method

.method public onRefresh()V
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 282
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 184
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 276
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 231
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 325
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

    .line 326
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->responseItem:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 327
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->responseItem:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->onResponse(Ljava/util/List;)V

    goto :goto_0

    .line 329
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->reloadData()V

    .line 332
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    const p2, 0x7f10011d

    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 333
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 334
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    goto :goto_1

    .line 336
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 337
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 339
    :goto_1
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->updateVisual()V

    :cond_2
    return-void
.end method

.method public reloadData()V
    .locals 2

    .line 260
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->otherNews:Z

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->sectionId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->listOtherArticles(Ljava/lang/String;Lretrofit/Callback;)V

    goto :goto_0

    .line 263
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object v0

    sget-object v1, Lcom/rt/mobile/english/Utils$EditionEnum;->EN:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->sectionId:Ljava/lang/String;

    const-string v1, "opedge"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->getPosts(Lretrofit/Callback;)V

    goto :goto_0

    .line 266
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->sectionId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->listArticles(Ljava/lang/String;Lretrofit/Callback;)V

    :goto_0
    return-void
.end method

.method public setRecyclerViewLayoutManager()V
    .locals 6

    .line 197
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 199
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 201
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 202
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 205
    :cond_1
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f10011d

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 206
    new-instance v1, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$2;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$2;-><init>(Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;)V

    .line 218
    new-instance v2, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0a0005

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 219
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    check-cast v2, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    goto :goto_1

    .line 221
    :cond_2
    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 225
    :goto_1
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 226
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

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

    .line 345
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->onResponse(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 60
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
