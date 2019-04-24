.class Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;
.super Landroid/webkit/WebViewClient;
.source "AuthChallengeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/AuthChallengeActivity;->loadUrl(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 142
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->resetScroll()V

    .line 143
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onUrlLoadComplete(Ljava/lang/String;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 137
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onUrlLoadStart(Ljava/lang/String;)V

    return-void
.end method
