.class Lorg/researchstack/backbone/ui/views/LocalWebView$2;
.super Landroid/webkit/WebChromeClient;
.source "LocalWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/views/LocalWebView;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/views/LocalWebView;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/views/LocalWebView;

    .prologue
    .line 97
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$2;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 101
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$2;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->access$000(Lorg/researchstack/backbone/ui/views/LocalWebView;)Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$2;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->access$000(Lorg/researchstack/backbone/ui/views/LocalWebView;)Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;

    move-result-object v0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;->onTitleLoaded(Ljava/lang/String;)V

    .line 106
    :cond_0
    return-void
.end method
