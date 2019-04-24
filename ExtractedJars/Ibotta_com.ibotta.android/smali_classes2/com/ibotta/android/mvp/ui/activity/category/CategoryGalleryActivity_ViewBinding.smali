.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_ViewBinding;
.super Ljava/lang/Object;
.source "CategoryGalleryActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    const-string v0, "field \'tsvTabSelector\'"

    .line 31
    const-class v1, Lcom/ibotta/android/view/common/TabSelectorView;

    const v2, 0x7f0904a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TabSelectorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 32
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'vpPager\'"

    .line 33
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905cc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'nbvNavBar\'"

    .line 34
    const-class v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v2, 0x7f090374

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'appBarLayout\'"

    .line 35
    const-class v1, Landroid/support/design/widget/AppBarLayout;

    const v2, 0x7f090029

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    const-string v0, "field \'clRegularContainer\'"

    .line 36
    const-class v1, Landroid/support/design/widget/CoordinatorLayout;

    const v2, 0x7f0900f8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/design/widget/CoordinatorLayout;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 44
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    return-void

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
