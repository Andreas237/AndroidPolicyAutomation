.class Lcom/shopkick/app/webview/SKWebView$1;
.super Ljava/lang/Object;
.source "SKWebView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/webview/SKWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/webview/SKWebView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/webview/SKWebView;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$100(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 238
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 239
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->goBack()V

    goto :goto_0

    .line 241
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$200(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 242
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->canGoForward()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 243
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->goForward()V

    goto :goto_0

    .line 245
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$300(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 246
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$1;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->reload()V

    :cond_2
    :goto_0
    return-void
.end method
