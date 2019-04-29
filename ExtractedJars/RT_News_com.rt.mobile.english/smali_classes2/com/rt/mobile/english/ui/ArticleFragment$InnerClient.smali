.class final Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;
.super Landroid/webkit/WebViewClient;
.source "ArticleFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ArticleFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "InnerClient"
.end annotation


# instance fields
.field loaded:Z

.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticleFragment;


# direct methods
.method private constructor <init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 p1, 0x0

    .line 459
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->loaded:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/rt/mobile/english/ui/ArticleFragment;Lcom/rt/mobile/english/ui/ArticleFragment$1;)V
    .locals 0

    .line 458
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 504
    iget-boolean p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->loaded:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    .line 505
    iput-boolean p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->loaded:Z

    .line 506
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p2, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 507
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p2, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 508
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 544
    iget-boolean p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->loaded:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_0

    .line 545
    iput-boolean v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->loaded:Z

    .line 546
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p2, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 547
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p2, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 548
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 551
    :cond_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$700(Lcom/rt/mobile/english/ui/ArticleFragment;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 552
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {p2, v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$802(Lcom/rt/mobile/english/ui/ArticleFragment;Z)Z

    .line 553
    new-array p2, v1, [Landroid/webkit/WebView;

    aput-object p1, p2, v0

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getShowAction()Lbutterknife/ButterKnife$Action;

    move-result-object p2

    invoke-static {p1, p2}, Lbutterknife/ButterKnife;->apply(Ljava/util/List;Lbutterknife/ButterKnife$Action;)V

    :cond_1
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 463
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    const/4 p1, 0x0

    .line 464
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->loaded:Z

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 559
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 560
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$702(Lcom/rt/mobile/english/ui/ArticleFragment;Z)Z

    .line 561
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    const/4 p1, 0x1

    .line 470
    :try_start_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 472
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    const-string v3, ""

    .line 474
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 475
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v3

    invoke-virtual {v3}, Lcom/rt/mobile/english/Utils;->getAppUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x8

    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 476
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :cond_1
    if-eqz v1, :cond_2

    const-string v3, "mixi.media"

    .line 479
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 480
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    iget-object v3, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {v3}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const-string v4, "Mixi_App"

    const-string v5, "click"

    invoke-virtual {v1, v3, v4, v5, p2}, Lcom/rt/mobile/english/Utils;->sendEvent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const-string v1, "video"

    .line 483
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 484
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$600(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    return p1

    :cond_3
    const-string v1, "html"

    .line 488
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 489
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->startActivity(Landroid/content/Intent;)V

    return p1

    .line 492
    :cond_4
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p2

    .line 497
    invoke-static {p2}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    return p1
.end method
