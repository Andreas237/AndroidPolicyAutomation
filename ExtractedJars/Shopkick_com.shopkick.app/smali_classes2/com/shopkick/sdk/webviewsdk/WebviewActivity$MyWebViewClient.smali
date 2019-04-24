.class Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "WebviewActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/webviewsdk/WebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyWebViewClient"
.end annotation


# instance fields
.field private resources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;


# direct methods
.method public constructor <init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;->this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 150
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;->resources:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 178
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 179
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;->resources:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 163
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 164
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;->this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;

    invoke-static {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->access$100(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 169
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 170
    sget-object p1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    if-eqz p1, :cond_0

    .line 171
    sget-object p1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;->resources:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1, p2, v0}, Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;->onWebviewPageFinished(Ljava/lang/String;Ljava/util/List;)V

    .line 172
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;->resources:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 184
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 185
    sget-object p1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    if-eqz p1, :cond_0

    .line 186
    sget-object p1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    invoke-interface {p1, p2, p3}, Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;->onWebviewReceivedError(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0

    .line 155
    sget-object p1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    if-eqz p1, :cond_0

    .line 156
    sget-object p1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    invoke-interface {p1, p2}, Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;->shouldWebviewLoadUrl(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
