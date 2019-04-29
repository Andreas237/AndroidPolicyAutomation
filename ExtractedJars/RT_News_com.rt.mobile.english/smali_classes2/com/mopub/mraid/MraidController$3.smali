.class Lcom/mopub/mraid/MraidController$3;
.super Ljava/lang/Object;
.source "MraidController.java"

# interfaces
.implements Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mraid/MraidController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mraid/MraidController;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidController;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClose()V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->handleClose()V

    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 1
    .param p1    # Landroid/webkit/ConsoleMessage;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 210
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->handleConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    return p1
.end method

.method public onExpand(Ljava/net/URI;Z)V
    .locals 1
    .param p1    # Ljava/net/URI;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/mraid/MraidCommandException;
        }
    .end annotation

    .line 227
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->handleExpand(Ljava/net/URI;Z)V

    return-void
.end method

.method public onJsAlert(Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/JsResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 205
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->handleJsAlert(Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result p1

    return p1
.end method

.method public onOpen(Ljava/net/URI;)V
    .locals 1
    .param p1    # Ljava/net/URI;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 243
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->handleOpen(Ljava/lang/String;)V

    return-void
.end method

.method public onPageFailedToLoad()V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->access$000(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidController$MraidListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->access$000(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidController$MraidListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mraid/MraidController$MraidListener;->onFailedToLoad()V

    :cond_0
    return-void
.end method

.method public onPageLoaded()V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->handlePageLoad()V

    return-void
.end method

.method public onPlayVideo(Ljava/net/URI;)V
    .locals 1
    .param p1    # Ljava/net/URI;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 248
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->handleShowVideo(Ljava/lang/String;)V

    return-void
.end method

.method public onResize(IIIILcom/mopub/common/CloseableLayout$ClosePosition;Z)V
    .locals 7
    .param p5    # Lcom/mopub/common/CloseableLayout$ClosePosition;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/mraid/MraidCommandException;
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/mopub/mraid/MraidController;->handleResize(IIIILcom/mopub/common/CloseableLayout$ClosePosition;Z)V

    return-void
.end method

.method public onSetOrientationProperties(ZLcom/mopub/mraid/MraidOrientation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/mraid/MraidCommandException;
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->handleSetOrientationProperties(ZLcom/mopub/mraid/MraidOrientation;)V

    return-void
.end method

.method public onUseCustomClose(Z)V
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->handleCustomClose(Z)V

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->access$100(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidBridge;->isAttached()Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$3;->this$0:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->access$200(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidBridge;->notifyViewability(Z)V

    :cond_0
    return-void
.end method
