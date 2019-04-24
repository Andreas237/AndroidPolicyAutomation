.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 594
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;)V
    .locals 0

    .line 594
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 599
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    .line 602
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .line 649
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 651
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 653
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->o(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    .line 655
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->l(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lo/bcs;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bcs;->setOriginUrl(Ljava/lang/String;)V

    .line 657
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->m(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 659
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;J)J

    .line 661
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$4;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 670
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 671
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 672
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 635
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->k(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;J)J

    .line 640
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 641
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 643
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lo/bcv$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcv$c;->b()V

    .line 644
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 740
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "page load error, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/webkit/WebView;)V

    .line 742
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 748
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 750
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "page load error, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getErrorCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/webkit/WebView;)V

    .line 753
    :cond_0
    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 760
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 762
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http page load error, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 763
    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getReasonPhrase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 762
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 764
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/webkit/WebView;)V

    .line 766
    :cond_0
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 5

    .line 677
    move-object v4, p2

    .line 686
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive ssl error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 690
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 692
    return-void

    .line 695
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    if-nez v0, :cond_1

    .line 698
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/huawei/android/sns/R$string;->sns_webview_security_warning:I

    .line 699
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_webview_ssl_warnings_header:I

    .line 700
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 701
    const v2, 0x1010355

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIconAttribute(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_webview_ssl_continue:I

    new-instance v3, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$3;

    invoke-direct {v3, p0, v4}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$3;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;Landroid/webkit/SslErrorHandler;)V

    .line 702
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_webview_ssl_go_back:I

    new-instance v3, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$1;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$1;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;)V

    .line 711
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;

    invoke-direct {v2, p0, v4}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;Landroid/webkit/SslErrorHandler;)V

    .line 719
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 728
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 698
    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 731
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 732
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 629
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->h(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 5

    .line 608
    new-instance v3, Lo/bdc;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    invoke-direct {v3, v0, p2, v1}, Lo/bdc;-><init>(Landroid/app/Activity;Ljava/lang/String;Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 610
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->i(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v0, v1, v2}, Lo/bdc;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 611
    invoke-virtual {v3, p2}, Lo/bdc;->a(Ljava/lang/String;)Z

    move-result v4

    .line 614
    if-nez v4, :cond_0

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 618
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 621
    :cond_0
    return v4
.end method
