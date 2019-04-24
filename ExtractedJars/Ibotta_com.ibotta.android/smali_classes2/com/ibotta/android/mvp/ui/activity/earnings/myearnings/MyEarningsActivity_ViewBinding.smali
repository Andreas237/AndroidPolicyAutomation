.class public Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "MyEarningsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;

    const-string v0, "field \'tvTitle\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090587

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvSubtitle\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09057c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    const-string v0, "field \'tvSubtitleValue\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090580

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvSubtitleValue:Landroid/widget/TextView;

    const-string v0, "field \'tvMemeberSinceDate\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090547

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvMemeberSinceDate:Landroid/widget/TextView;

    const-string v0, "field \'rvBarGraph\'"

    .line 36
    const-class v1, Landroid/support/v7/widget/RecyclerView;

    const v2, 0x7f0903d7

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->rvBarGraph:Landroid/support/v7/widget/RecyclerView;

    const-string v0, "field \'mehvEarningsHistory\'"

    .line 37
    const-class v1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    const v2, 0x7f090355

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->mehvEarningsHistory:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    const-string v0, "field \'metvTeammates\'"

    .line 38
    const-class v1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    const v2, 0x7f09035c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->metvTeammates:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    const-string v0, "field \'evEmpty\'"

    .line 39
    const-class v1, Lcom/ibotta/android/views/empty/EmptyView;

    const v2, 0x7f0901d8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/empty/EmptyView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    const-string v0, "field \'llEarningsGraphContainer\'"

    .line 40
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090308

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->llEarningsGraphContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 41
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 49
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvTitle:Landroid/widget/TextView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvSubtitle:Landroid/widget/TextView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvSubtitleValue:Landroid/widget/TextView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->tvMemeberSinceDate:Landroid/widget/TextView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->rvBarGraph:Landroid/support/v7/widget/RecyclerView;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->mehvEarningsHistory:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->metvTeammates:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->llEarningsGraphContainer:Landroid/widget/LinearLayout;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-void

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
