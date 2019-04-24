.class public Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity_ViewBinding;
.super Ljava/lang/Object;
.source "RedeemRetailersActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 30
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'ablAppBarLayout\'"

    .line 31
    const-class v1, Landroid/support/design/widget/AppBarLayout;

    const v2, 0x7f090029

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    const-string v0, "field \'tsvTabSelector\'"

    .line 32
    const-class v1, Lcom/ibotta/android/view/common/TabSelectorView;

    const v2, 0x7f0904a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TabSelectorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const-string v0, "field \'vpRetailers\'"

    .line 33
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905cd

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'evEmpty\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/empty/EmptyView;

    const v2, 0x7f0901d8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/empty/EmptyView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 42
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->vpRetailers:Landroid/support/v4/view/ViewPager;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
