.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_ViewBinding;
.super Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;
.source "FindRebatesActivity_ViewBinding.java"


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Landroid/view/View;)V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    const-string v0, "field \'clRegularContainer\'"

    .line 32
    const-class v1, Landroid/support/design/widget/CoordinatorLayout;

    const v2, 0x7f0900f8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/CoordinatorLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    const-string v0, "field \'appBarLayout\'"

    .line 33
    const-class v1, Landroid/support/design/widget/AppBarLayout;

    const v2, 0x7f09005e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 34
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'frlvRecycler\'"

    .line 35
    const-class v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    const v2, 0x7f090205

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    const-string v0, "field \'nbvNavBar\'"

    .line 36
    const-class v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v2, 0x7f090374

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'ilvSearchResults\'"

    .line 37
    const-class v1, Lcom/ibotta/android/views/list/IbottaListView;

    const v2, 0x7f09024c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    const-string v0, "field \'svSearchView\'"

    .line 38
    const-class v1, Lcom/ibotta/android/views/search/SearchView;

    const v2, 0x7f090437

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/search/SearchView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 45
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    .line 55
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;->unbind()V

    return-void

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
