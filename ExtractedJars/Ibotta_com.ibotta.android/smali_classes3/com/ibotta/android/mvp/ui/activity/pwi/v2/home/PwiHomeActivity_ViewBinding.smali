.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity_ViewBinding;
.super Ljava/lang/Object;
.source "PwiHomeActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    const-string v0, "field \'phtvToolbar\'"

    .line 29
    const-class v1, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    const v2, 0x7f09039d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->phtvToolbar:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    const-string v0, "field \'tsvTabSelector\'"

    .line 30
    const-class v1, Lcom/ibotta/android/view/common/TabSelectorView;

    const v2, 0x7f0904a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TabSelectorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const-string v0, "field \'vpHomePager\'"

    .line 31
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905ca

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'cvTabSelector\'"

    .line 32
    const-class v1, Landroid/support/v7/widget/CardView;

    const v2, 0x7f09017e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/CardView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->cvTabSelector:Landroid/support/v7/widget/CardView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->phtvToolbar:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->cvTabSelector:Landroid/support/v7/widget/CardView;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
