.class public Lcom/rt/mobile/english/ui/OpedgeFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "OpedgeFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/OpedgeFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'recyclerView\'"

    const v1, 0x7f09012c

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    const-string v0, "field \'loadingView\'"

    const v1, 0x7f0900d7

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Lcom/rt/mobile/english/ui/widget/LoadingView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const-string v0, "field \'swipeRefreshLayout\'"

    const v1, 0x7f09017f

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 17
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/OpedgeFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'toolbar_and_tabs\'"

    const v1, 0x7f090025

    .line 18
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 19
    iput-object p0, p1, Lcom/rt/mobile/english/ui/OpedgeFragment;->toolbar_and_tabs:Landroid/view/View;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/OpedgeFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 24
    iput-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    .line 25
    iput-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 26
    iput-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 27
    iput-object v0, p0, Lcom/rt/mobile/english/ui/OpedgeFragment;->toolbar_and_tabs:Landroid/view/View;

    return-void
.end method
