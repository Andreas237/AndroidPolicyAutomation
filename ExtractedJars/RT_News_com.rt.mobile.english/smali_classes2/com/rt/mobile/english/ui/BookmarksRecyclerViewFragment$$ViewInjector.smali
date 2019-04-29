.class public Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "BookmarksRecyclerViewFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'recyclerView\'"

    const v1, 0x7f09012c

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'toolbar_and_tabs\'"

    const v1, 0x7f090197

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->toolbar_and_tabs:Landroid/view/View;

    const-string v0, "field \'no_bookmarks\'"

    const v1, 0x7f090106

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 17
    check-cast p0, Landroid/widget/LinearLayout;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->no_bookmarks:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 22
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 23
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->toolbar_and_tabs:Landroid/view/View;

    .line 24
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->no_bookmarks:Landroid/widget/LinearLayout;

    return-void
.end method
