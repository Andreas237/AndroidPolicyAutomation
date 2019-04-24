.class Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "WebviewActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/webviewsdk/WebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyWebChromeClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebChromeClient;->this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;)V
    .locals 0

    .line 133
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebChromeClient;-><init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V

    return-void
.end method


# virtual methods
.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .line 141
    sget-object v0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    invoke-interface {v0}, Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;->onWebviewReceiveJsAlert()V

    .line 142
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result p1

    return p1
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 0

    .line 136
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    return-void
.end method
