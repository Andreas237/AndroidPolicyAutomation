.class public Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "GetConfigurationCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand<",
        "Lcom/usebutton/sdk/internal/models/Configuration;",
        ">;"
    }
.end annotation


# instance fields
.field private final storage:Lcom/usebutton/sdk/internal/core/Storage;

.field private final updatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .param p4    # Lcom/usebutton/sdk/internal/core/FailableReceiver;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2, p4}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 20
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->updatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    .line 21
    iput-object p2, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    return-void
.end method


# virtual methods
.method public execute()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->updatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->shouldUpdate()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/core/Storage;->setConfiguration(Lcom/usebutton/sdk/internal/models/Configuration;)V

    .line 30
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->updatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->setState()V

    .line 31
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->updatePolicy:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->getState()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/core/Storage;->setConfigState(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)V

    return-object v0
.end method

.method public bridge synthetic execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 11
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;->execute()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 37
    const-class v0, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
