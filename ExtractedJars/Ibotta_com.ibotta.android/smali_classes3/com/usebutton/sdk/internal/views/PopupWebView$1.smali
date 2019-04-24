.class Lcom/usebutton/sdk/internal/views/PopupWebView$1;
.super Landroid/webkit/WebChromeClient;
.source "PopupWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/PopupWebView;->initPopup()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/PopupWebView;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView$1;->this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 0

    .line 64
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView$1;->this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/PopupWebView;->close()V

    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 5

    const-string v0, "ButtonPopupWebView"

    const-string v1, "onConsoleMessage %s: %s"

    const/4 v2, 0x2

    .line 58
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    move-result-object v3

    invoke-virtual {v3}, Landroid/webkit/ConsoleMessage$MessageLevel;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    return p1
.end method
