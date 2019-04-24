.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_ViewBinding;
.super Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;
.source "GalleryActivity_ViewBinding.java"


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Landroid/view/View;)V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    const-string v0, "field \'header\'"

    .line 36
    const-class v1, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    const v2, 0x7f09020c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    const-string v0, "field \'tsvTabSelector\'"

    .line 37
    const-class v1, Lcom/ibotta/android/view/common/TabSelectorView;

    const v2, 0x7f0904a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TabSelectorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 38
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'vpPager\'"

    .line 39
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905cc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'evEmpty\'"

    .line 40
    const-class v1, Lcom/ibotta/android/views/empty/EmptyView;

    const v2, 0x7f0901d8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/empty/EmptyView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    const-string v0, "field \'nbvNavBar\'"

    .line 41
    const-class v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v2, 0x7f090374

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'nbvNavBarSearch\'"

    .line 42
    const-class v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v2, 0x7f090376

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBarSearch:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'clSearchContainer\'"

    .line 43
    const-class v1, Landroid/support/design/widget/CoordinatorLayout;

    const v2, 0x7f0900f9

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/CoordinatorLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clSearchContainer:Landroid/support/design/widget/CoordinatorLayout;

    const-string v0, "field \'clRegularContainer\'"

    .line 44
    const-class v1, Landroid/support/design/widget/CoordinatorLayout;

    const v2, 0x7f0900f8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/CoordinatorLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    const-string v0, "field \'ilvSearchResults\'"

    .line 45
    const-class v1, Lcom/ibotta/android/views/list/IbottaListView;

    const v2, 0x7f09024c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    const-string v0, "field \'appBarLayout\'"

    .line 46
    const-class v1, Landroid/support/design/widget/AppBarLayout;

    const v2, 0x7f090029

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    const-string v0, "field \'svSearchView\'"

    .line 47
    const-class v1, Lcom/ibotta/android/views/search/SearchView;

    const v2, 0x7f090437

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/search/SearchView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 54
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBarSearch:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clSearchContainer:Landroid/support/design/widget/CoordinatorLayout;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    .line 69
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_ViewBinding;->unbind()V

    return-void

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
