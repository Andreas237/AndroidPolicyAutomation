.class Lcom/huawei/ui/commonui/webview/WebViewActivity$d;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/webview/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/commonui/webview/WebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 474
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;Lcom/huawei/ui/commonui/webview/WebViewActivity$5;)V
    .locals 0

    .line 474
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 534
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 535
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 518
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Ljava/lang/String;)V

    .line 521
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->f(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    .line 512
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 513
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0, p4}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Lcom/huawei/ui/commonui/webview/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 527
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->g(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    .line 528
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 529
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 1

    .line 541
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 542
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->l(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    .line 543
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    .line 477
    const-string v0, "WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldOverrideUrlLoading = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a(Lcom/huawei/ui/commonui/webview/WebViewActivity;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 479
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 482
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 483
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Override Url startsWith ResultUrl."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 485
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 486
    const-string v0, "WebViewActivity.RESULT_URL"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 487
    const/4 v0, -0x1

    invoke-virtual {v4, v0, v5}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 488
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 489
    const/4 v0, 0x1

    return v0

    .line 491
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "huaweischeme:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e(Lcom/huawei/ui/commonui/webview/WebViewActivity;Landroid/content/Context;Ljava/lang/String;)V

    .line 494
    const/4 v0, 0x1

    return v0

    .line 497
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;->c:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 498
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHitTestResult()Landroid/webkit/WebView$HitTestResult;

    move-result-object v4

    .line 499
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz v4, :cond_4

    .line 500
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 504
    :cond_4
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 505
    const/4 v0, 0x1

    return v0
.end method
