.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_ViewBinding;
.super Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;
.source "FeaturedActivity_ViewBinding.java"


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Landroid/view/View;)V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 30
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'flvRecycler\'"

    .line 31
    const-class v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    const v2, 0x7f090201

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    const-string v0, "field \'nbvNavBar\'"

    .line 32
    const-class v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v2, 0x7f090374

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'ilvSearchResults\'"

    .line 33
    const-class v1, Lcom/ibotta/android/views/list/IbottaListView;

    const v2, 0x7f09024c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    const-string v0, "field \'svSearchView\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/search/SearchView;

    const v2, 0x7f090437

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/search/SearchView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    .line 49
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;->unbind()V

    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
