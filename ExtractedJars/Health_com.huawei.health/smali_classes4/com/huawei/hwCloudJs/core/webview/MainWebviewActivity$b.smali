.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    const-string v0, "MainWebviewActivity"

    const-string v1, "onPageFinished"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "MainWebviewActivity"

    const-string v1, "onPageStarted"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Z)Z

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->invalidateOptionsMenu()V

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedError"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/huawei/hwCloudJs/api/IJsWebview;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;I)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->l(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedError new"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedError new true"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;I)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->l(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedHttpError"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedHttpError true"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;I)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->l(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hwCloudJs/api/IJsWebview;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;I)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->l(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedSslError"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, ".html"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const-string v4, "text/html"

    goto :goto_0

    :cond_3
    const-string v0, ".css"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v4, "text/css"

    goto :goto_0

    :cond_4
    const-string v0, ".js"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v4, "application/x-javascript"

    :cond_5
    :goto_0
    const/4 v6, 0x0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0, v3, v4}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v6

    return-object v6
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 7

    const/4 v3, 0x0

    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "MainWebviewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MalformedURLException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0

    :goto_0
    const-string v4, ""

    invoke-virtual {v3}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ".html"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v4, "text/html"

    goto :goto_1

    :cond_1
    const-string v0, ".css"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v4, "text/css"

    goto :goto_1

    :cond_2
    const-string v0, ".js"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v4, "application/x-javascript"

    :cond_3
    :goto_1
    const/4 v6, 0x0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0, p2, v4}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v6

    return-object v6
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwCloudJs/api/IJsWebview;->overrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->c(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v0, "android.intent.category.BROWSABLE"

    :try_start_0
    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setSelector(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->startActivityIfNeeded(Landroid/content/Intent;I)Z
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "MainWebviewActivity"

    const-string v1, "ActivityNotFoundException..."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_3
    const-string v0, "MainWebviewActivity"

    const-string v1, "shouldOverrideUrlLoading"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method
