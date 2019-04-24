.class Lcom/usebutton/sdk/internal/ButtonPrivate$3;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Lcom/usebutton/sdk/internal/models/Configuration;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$3;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 0

    return-void
.end method

.method public onResult(Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$3;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$300(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->setConfiguration(Lcom/usebutton/sdk/internal/models/Configuration;)V

    .line 377
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isButtonDisabled()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "ButtonPrivate"

    const-string v0, "Requested to stop SDK from remote configuration."

    .line 378
    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$3;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->stop()V

    :cond_1
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 370
    check-cast p1, Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate$3;->onResult(Lcom/usebutton/sdk/internal/models/Configuration;)V

    return-void
.end method
