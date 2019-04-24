.class Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient$1;
.super Ljava/lang/Object;
.source "SKWebView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;


# direct methods
.method constructor <init>(Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;)V
    .locals 0

    .line 627
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient$1;->this$1:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 630
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 631
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient$1;->this$1:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    iget-object p1, p1, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->result:Landroid/webkit/JsResult;

    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    return-void
.end method
