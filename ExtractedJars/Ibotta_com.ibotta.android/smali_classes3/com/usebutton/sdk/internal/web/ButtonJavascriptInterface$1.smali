.class Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->onNavigation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->access$000(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 70
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->access$100(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;->onNavigateJs(Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->access$200(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Lcom/usebutton/sdk/internal/web/Navigator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/web/Navigator;->onNavigation()V

    return-void
.end method
