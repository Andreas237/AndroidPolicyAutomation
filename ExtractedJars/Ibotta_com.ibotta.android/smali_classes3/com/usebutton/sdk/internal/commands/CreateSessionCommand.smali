.class public Lcom/usebutton/sdk/internal/commands/CreateSessionCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "CreateSessionCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    return-void
.end method


# virtual methods
.method public key()Ljava/lang/String;
    .locals 1

    const-string v0, "create-session"

    return-object v0
.end method
