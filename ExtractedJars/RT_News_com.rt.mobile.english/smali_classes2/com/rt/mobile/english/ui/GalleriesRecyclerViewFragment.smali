.class public Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;
.super Landroid/support/v4/app/Fragment;
.source "GalleriesRecyclerViewFragment.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;
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
        "Lcom/rt/mobile/english/data/galleries/Gallery;",
        ">;>;>;"
    }
.end annotation


# static fields
.field public static final ARGUMENT_GALLERY_STRING:Ljava/lang/String; = "gallery_string"


# instance fields
.field galleriesService:Lcom/rt/mobile/english/data/galleries/GalleriesService;
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

.field picasso:Lcom/squareup/picasso/Picasso;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field recyclerView:Landroid/support/v7/widget/RecyclerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09012c
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

    .line 60
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;ILjava/util/List;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->onGalleryClicked(ILjava/util/List;)V

    return-void
.end method

.method private onGalleryClicked(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/Gallery;",
            ">;)V"
        }
    .end annotation

    .line 167
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "gallery_string"

    .line 168
    iget-object v2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 199
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Load galleries error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 200
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 201
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 99
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 100
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f100028

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 87
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 88
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .line 132
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 133
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 134
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070051

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 135
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070052

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 136
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 137
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 134
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 93
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 94
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    const v0, 0x7f0c0057

    .line 115
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 116
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 117
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 118
    new-instance p2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 119
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 120
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 121
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 122
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v0, Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/rt/mobile/english/ui/SpacingItemDecoration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 123
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 124
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/rt/mobile/english/Utils;->getActionBarSize(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070052

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, p3, p3, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressViewOffset(ZII)V

    .line 125
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-object p1
.end method

.method public onRefresh()V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 181
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 105
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 175
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 163
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 143
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    return-void
.end method

.method public reloadData()V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->galleriesService:Lcom/rt/mobile/english/data/galleries/GalleriesService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/galleries/GalleriesService;->listGalleries(Lretrofit/Callback;)V

    return-void
.end method

.method public setRecyclerViewLayoutManager()V
    .locals 5

    .line 149
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 151
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 155
    :goto_0
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a0005

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 157
    iget-object v1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 158
    iget-object v1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

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
            "Lcom/rt/mobile/english/data/galleries/Gallery;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 186
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 187
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 191
    :cond_0
    new-instance p2, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;-><init>(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;Ljava/util/List;)V

    .line 192
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 193
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setVisibility(I)V

    .line 194
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 60
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
