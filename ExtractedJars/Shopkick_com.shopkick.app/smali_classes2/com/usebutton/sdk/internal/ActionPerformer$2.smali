.class Lcom/usebutton/sdk/internal/ActionPerformer$2;
.super Ljava/lang/Object;
.source "ActionPerformer.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ActionPerformer;

.field final synthetic val$executeRunnable:Ljava/lang/Runnable;

.field final synthetic val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

.field final synthetic val$tapSignal:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ActionPerformer;Ljava/lang/String;Ljava/lang/Runnable;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->this$0:Lcom/usebutton/sdk/internal/ActionPerformer;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$tapSignal:Ljava/lang/String;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$executeRunnable:Ljava/lang/Runnable;

    iput-object p4, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 3

    .line 102
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$tapSignal:Ljava/lang/String;

    const-string v1, "require-ack"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    new-instance v1, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v2, "Failed to report tap event"

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/models/AppAction$Listener;->onFailure(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 92
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer$2;->onResult(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onResult(Lorg/json/JSONObject;)V
    .locals 1

    .line 95
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$tapSignal:Ljava/lang/String;

    const-string v0, "require-ack"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 96
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer$2;->val$executeRunnable:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
