.class public Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "EarningsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;

    const-string v0, "field \'tvTitle\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090587

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvSubtitle\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09057c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    const-string v0, "field \'tvSubtitleValue\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090580

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitleValue:Landroid/widget/TextView;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 31
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'elvEarnings\'"

    .line 32
    const-class v1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    const v2, 0x7f0901ac

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvTitle:Landroid/widget/TextView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->tvSubtitleValue:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;->elvEarnings:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
