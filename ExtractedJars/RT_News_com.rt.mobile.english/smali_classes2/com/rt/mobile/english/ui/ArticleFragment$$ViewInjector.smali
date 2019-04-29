.class public Lcom/rt/mobile/english/ui/ArticleFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "ArticleFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/ArticleFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'webView\'"

    const v1, 0x7f0901b5

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    const-string v0, "field \'swipeRefreshLayout\'"

    const v1, 0x7f090180

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const-string v0, "field \'loadingView\'"

    const v1, 0x7f0900d7

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 15
    check-cast p0, Lcom/rt/mobile/english/ui/widget/LoadingView;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/ArticleFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    .line 20
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 21
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    return-void
.end method
