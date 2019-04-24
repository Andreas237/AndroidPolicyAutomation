.class final Lcom/usebutton/sdk/internal/core/CommandExecutor$3;
.super Lcom/usebutton/sdk/internal/core/Command;
.source "CommandExecutor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/core/CommandExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0

    .line 145
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Command;-><init>(Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    const-string v0, "kill-pill"

    return-object v0
.end method
