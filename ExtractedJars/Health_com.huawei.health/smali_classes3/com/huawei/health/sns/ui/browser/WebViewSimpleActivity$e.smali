.class Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;)V
    .locals 0

    .line 218
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 230
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->d(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    .line 236
    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 242
    const-string v0, "WebViewSimpleActivity"

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

    .line 244
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->a(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    .line 245
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 251
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    const-string v0, "WebViewSimpleActivity"

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

    .line 255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->a(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    .line 257
    :cond_0
    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 264
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    const-string v0, "WebViewSimpleActivity"

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

    .line 267
    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getReasonPhrase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 266
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->a(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    .line 271
    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 223
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 224
    const/4 v0, 0x1

    return v0
.end method
