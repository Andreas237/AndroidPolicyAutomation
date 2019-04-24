.class Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->loadBtnSdkJs(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

.field final synthetic val$btnSdkJs:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;->val$btnSdkJs:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 141
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->access$000(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;->val$btnSdkJs:Ljava/lang/String;

    new-instance v2, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2$1;

    invoke-direct {v2, p0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2$1;-><init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;)V

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method
