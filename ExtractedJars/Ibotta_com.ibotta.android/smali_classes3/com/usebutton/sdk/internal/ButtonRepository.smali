.class public Lcom/usebutton/sdk/internal/ButtonRepository;
.super Ljava/lang/Object;
.source "ButtonRepository.java"


# instance fields
.field private final buttonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

.field private final commandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

.field private final storage:Lcom/usebutton/sdk/internal/core/Storage;

.field private final user:Lcom/usebutton/sdk/internal/user/UserImpl;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/user/UserImpl;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->buttonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 33
    iput-object p2, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    .line 34
    iput-object p3, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->commandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    .line 35
    iput-object p4, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->user:Lcom/usebutton/sdk/internal/user/UserImpl;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->clear()V

    .line 76
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->user:Lcom/usebutton/sdk/internal/user/UserImpl;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->clearCachedUserProfile()V

    return-void
.end method

.method public fetchConfiguration(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;)V
    .locals 1

    .line 104
    new-instance v0, Lcom/usebutton/sdk/internal/core/NoOpReceiver;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/core/NoOpReceiver;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->fetchConfiguration(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    return-void
.end method

.method public fetchConfiguration(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;)V"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->commandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v1, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->buttonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/usebutton/sdk/internal/commands/GetConfigurationCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public getAutofillMappings(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .line 52
    new-instance v0, Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->buttonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 55
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->commandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public getConfigState()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getConfigState()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    move-result-object v0

    return-object v0
.end method

.method public getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    if-nez v0, :cond_0

    .line 85
    invoke-static {}, Lcom/usebutton/sdk/internal/models/Configuration;->emptyConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;)I
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->getInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;)I

    move-result p1

    return p1
.end method

.method public getStorage()Lcom/usebutton/sdk/internal/core/Storage;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    return-object v0
.end method

.method public getUser()Lcom/usebutton/sdk/internal/user/UserImpl;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->user:Lcom/usebutton/sdk/internal/user/UserImpl;

    return-object v0
.end method

.method public postPageView(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .line 60
    new-instance v7, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->buttonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    move-object v0, v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 64
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->commandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    invoke-virtual {p1, v7}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public postTap(Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .line 68
    new-instance v0, Lcom/usebutton/sdk/internal/commands/PostTapCommand;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->buttonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/usebutton/sdk/internal/commands/PostTapCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 71
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->commandExecutor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method public setConfigState(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->setConfigState(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)V

    return-void
.end method

.method public setConfiguration(Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->setConfiguration(Lcom/usebutton/sdk/internal/models/Configuration;)V

    .line 93
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->setState()V

    return-void
.end method

.method public setInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;I)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonRepository;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/core/Storage;->setInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;I)V

    return-void
.end method
