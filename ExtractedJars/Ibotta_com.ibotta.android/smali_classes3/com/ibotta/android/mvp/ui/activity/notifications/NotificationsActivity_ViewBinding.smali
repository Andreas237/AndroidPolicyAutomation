.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "NotificationsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    const-string v0, "field \'tsvTabSelector\'"

    .line 28
    const-class v1, Lcom/ibotta/android/view/common/TabSelectorView;

    const v2, 0x7f0904a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TabSelectorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 29
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'vpPager\'"

    .line 30
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905cc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/v4/view/ViewPager;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
