.class Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;
.super Ljava/lang/Object;
.source "BrowserWebChromeClient.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->openPopup(Landroid/webkit/WebView;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPopupClosed()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->access$100(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->access$000(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;)Lcom/usebutton/sdk/internal/views/PopupWebView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 126
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->access$002(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;Lcom/usebutton/sdk/internal/views/PopupWebView;)Lcom/usebutton/sdk/internal/views/PopupWebView;

    return-void
.end method
