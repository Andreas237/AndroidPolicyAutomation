.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_ViewBinding;
.super Ljava/lang/Object;
.source "MyOffersActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 31
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'tsvTabSelector\'"

    .line 32
    const-class v1, Lcom/ibotta/android/view/common/TabSelectorView;

    const v2, 0x7f0904a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TabSelectorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const-string v0, "field \'vpPager\'"

    .line 33
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905cc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'mrevEmpty\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    const v2, 0x7f090362

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mrevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    const-string v0, "field \'nbvNavBar\'"

    .line 35
    const-class v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v2, 0x7f090374

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'toolbar\'"

    .line 36
    const-class v1, Landroid/support/v7/widget/Toolbar;

    const v2, 0x7f09043a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/Toolbar;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 44
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mrevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-void

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
