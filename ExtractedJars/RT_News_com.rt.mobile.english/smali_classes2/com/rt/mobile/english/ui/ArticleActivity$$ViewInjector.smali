.class public Lcom/rt/mobile/english/ui/ArticleActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "ArticleActivity$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/ArticleActivity;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'toolbar_and_tabs\'"

    const v1, 0x7f090197

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar_and_tabs:Landroid/view/View;

    const-string v0, "field \'loadingView\'"

    const v1, 0x7f090027

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Lcom/rt/mobile/english/ui/widget/LoadingView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const-string v0, "field \'fab\'"

    const v1, 0x7f090099

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 17
    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    const-string v0, "field \'fabShare\'"

    const v1, 0x7f09009a

    .line 18
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 19
    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    const-string v0, "field \'fabBookmarks\'"

    const v1, 0x7f09009b

    .line 20
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 21
    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    const-string v0, "field \'fabChangeSize\'"

    const v1, 0x7f09009c

    .line 22
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 23
    check-cast p0, Landroid/support/design/widget/FloatingActionButton;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/ArticleActivity;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 28
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar_and_tabs:Landroid/view/View;

    .line 29
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    .line 30
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    .line 31
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    .line 32
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    .line 33
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    return-void
.end method