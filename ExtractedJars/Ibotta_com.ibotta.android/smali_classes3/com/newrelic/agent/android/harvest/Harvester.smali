.class public Lcom/newrelic/agent/android/harvest/Harvester;
.super Ljava/lang/Object;
.source "Harvester.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/harvest/Harvester$State;
    }
.end annotation


# instance fields
.field private agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

.field private configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

.field private harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

.field private harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

.field private final harvestListeners:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;",
            ">;"
        }
    .end annotation
.end field

.field private final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field private state:Lcom/newrelic/agent/android/harvest/Harvester$State;

.field protected stateChanged:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 52
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->UNINITIALIZED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    .line 62
    invoke-static {}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDefaultHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    return-void
.end method

.method private changeState(Lcom/newrelic/agent/android/harvest/Harvester$State;)V
    .locals 3

    .line 401
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Harvester changing state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 403
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    if-ne v0, v1, :cond_1

    .line 404
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    if-ne p1, v0, :cond_0

    .line 405
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestDisconnected()V

    goto :goto_0

    .line 406
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    if-ne p1, v0, :cond_1

    .line 407
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestDisabled()V

    .line 410
    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    const/4 p1, 0x1

    .line 411
    iput-boolean p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->stateChanged:Z

    return-void
.end method

.method private configureHarvester(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V
    .locals 1

    .line 394
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->reconfigure(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    .line 395
    iget-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->setDataToken(Lcom/newrelic/agent/android/harvest/DataToken;)V

    .line 396
    iget-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-static {p1}, Lcom/newrelic/agent/android/harvest/Harvest;->setHarvestConfiguration(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    return-void
.end method

.method private fireOnHarvest()V
    .locals 3

    .line 602
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 603
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvest()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 606
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvest"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 607
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestBefore()V
    .locals 3

    .line 566
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 567
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestBefore()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 570
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestBefore"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 571
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestComplete()V
    .locals 3

    .line 674
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 675
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestComplete()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 678
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestComplete"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 679
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestConnected()V
    .locals 3

    .line 686
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 687
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestConnected()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 690
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestConnected"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 691
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestDisabled()V
    .locals 3

    .line 626
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 627
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestDisabled()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 630
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestDisabled"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 631
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestDisconnected()V
    .locals 3

    .line 638
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 639
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestDisconnected()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 642
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestDisconnected"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 643
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestError()V
    .locals 3

    .line 650
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 651
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestError()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 654
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestError"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 655
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestFinalize()V
    .locals 3

    .line 614
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 615
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestFinalize()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 618
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestFinalize"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 619
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestSendFailed()V
    .locals 3

    .line 662
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 663
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestSendFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 666
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestSendFailed"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 667
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestStart()V
    .locals 3

    .line 578
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 579
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestStart()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 582
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestStart"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 583
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private fireOnHarvestStop()V
    .locals 3

    .line 590
    :try_start_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->getHarvestListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    .line 591
    invoke-interface {v1}, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;->onHarvestStop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 594
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error in fireOnHarvestStop"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 595
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method private getHarvestListeners()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;",
            ">;"
        }
    .end annotation

    .line 700
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private parseHarvesterConfiguration(Lcom/newrelic/agent/android/harvest/HarvestResponse;)Lcom/newrelic/agent/android/harvest/HarvestConfiguration;
    .locals 3

    .line 380
    new-instance v0, Lcom/newrelic/com/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;-><init>()V

    .line 381
    const-class v1, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    new-instance v2, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfigurationDeserializer;

    invoke-direct {v2}, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfigurationDeserializer;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/GsonBuilder;

    .line 382
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;->create()Lcom/newrelic/com/google/gson/Gson;

    move-result-object v0

    .line 385
    :try_start_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p1

    const-class v1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v0, p1, v1}, Lcom/newrelic/com/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;
    :try_end_0
    .catch Lcom/newrelic/com/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 387
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse collector configuration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 388
    invoke-static {p1}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private varargs stateIn(Lcom/newrelic/agent/android/harvest/Harvester$State;[Lcom/newrelic/agent/android/harvest/Harvester$State;)Z
    .locals 4

    .line 416
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method


# virtual methods
.method public addHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V
    .locals 2

    if-nez p1, :cond_0

    .line 442
    iget-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Can\'t add null harvest listener"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 443
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void

    .line 447
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    monitor-enter v0

    .line 448
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 449
    monitor-exit v0

    return-void

    .line 450
    :cond_1
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 451
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected connected()V
    .locals 5

    .line 192
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Harvester: connected"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Harvester: Sending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestData;->getHttpTransactions()Lcom/newrelic/agent/android/harvest/HttpTransactions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HttpTransactions;->count()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " HTTP transactions."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 194
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Harvester: Sending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestData;->getHttpErrors()Lcom/newrelic/agent/android/harvest/HttpErrors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HttpErrors;->count()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " HTTP errors."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Harvester: Sending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestData;->getActivityTraces()Lcom/newrelic/agent/android/harvest/ActivityTraces;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->count()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " activity traces."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getEnableAnalyticsEvents()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestData;->setAnalyticsEnabled(Z)V

    .line 199
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/AgentConfiguration;->getEnableAnalyticsEvents()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->AnalyticsEvents:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getEventManager()Lcom/newrelic/agent/android/analytics/EventManager;

    move-result-object v0

    .line 203
    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/EventManager;->isTransmitRequired()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 208
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 209
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getSystemAttributes()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 210
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getUserAttributes()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 211
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2, v1}, Lcom/newrelic/agent/android/harvest/HarvestData;->setSessionAttributes(Ljava/util/Set;)V

    .line 213
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Harvester: Sending "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v3}, Lcom/newrelic/agent/android/harvest/HarvestData;->getSessionAttributes()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " session attributes."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 215
    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/EventManager;->getQueuedEvents()Ljava/util/Collection;

    move-result-object v1

    .line 216
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2, v1}, Lcom/newrelic/agent/android/harvest/HarvestData;->setAnalyticsEvents(Ljava/util/Collection;)V

    .line 218
    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/EventManager;->empty()V

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Harvester: Sending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestData;->getAnalyticsEvents()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " analytics events."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->sendData(Lcom/newrelic/agent/android/harvest/type/Harvestable;)Lcom/newrelic/agent/android/harvest/HarvestResponse;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 227
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->isUnknown()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_1

    .line 232
    :cond_2
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HarvestData;->reset()V

    .line 234
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v1

    const-string v2, "Supportability/AgentHealth/Collector/Harvest"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseTime()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/newrelic/agent/android/stats/StatsEngine;->sampleTimeMs(Ljava/lang/String;J)V

    .line 236
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Harvest data response: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseCode()Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 237
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Harvest data response status code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getStatusCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 238
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Harvest data response BODY: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 240
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->isError()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 241
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestError()V

    .line 243
    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseCode()Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 263
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "An unknown error occurred when connecting to the Collector."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 260
    :pswitch_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Invalid ConnectionInformation was sent to the Collector."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 250
    :pswitch_1
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->isDisableCommand()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 251
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Collector has commanded Agent to disable."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 252
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    goto :goto_0

    .line 255
    :cond_3
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Unexpected Collector response: FORBIDDEN"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 256
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    goto :goto_0

    .line 246
    :pswitch_2
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->clear()V

    .line 247
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    :goto_0
    return-void

    .line 269
    :cond_4
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestComplete()V

    return-void

    .line 228
    :cond_5
    :goto_1
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestSendFailed()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected disabled()V
    .locals 0

    .line 278
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->stop()V

    .line 279
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestDisabled()V

    return-void
.end method

.method protected disconnected()V
    .locals 5

    .line 108
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    if-nez v0, :cond_0

    .line 109
    invoke-static {}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDefaultHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->configureHarvester(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Skipping connect call, saved state is available: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestData;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 117
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    const-string v1, "Session/Start"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/stats/StatsEngine;->sample(Ljava/lang/String;F)V

    .line 118
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestConnected()V

    .line 119
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    .line 120
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->execute()V

    return-void

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connecting, saved state is not available: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestData;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->sendConnect()Lcom/newrelic/agent/android/harvest/HarvestResponse;

    move-result-object v0

    if-nez v0, :cond_2

    .line 131
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Unable to connect to the Collector."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 136
    :cond_2
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->isOK()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 137
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->parseHarvesterConfiguration(Lcom/newrelic/agent/android/harvest/HarvestResponse;)Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v1

    if-nez v1, :cond_3

    .line 139
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Unable to configure Harvester using Collector configuration."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 143
    :cond_3
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/harvest/Harvester;->configureHarvester(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    .line 144
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v1

    const-string v2, "Supportability/AgentHealth/Collector/Harvest"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseTime()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/newrelic/agent/android/stats/StatsEngine;->sampleTimeMs(Ljava/lang/String;J)V

    .line 145
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestConnected()V

    .line 148
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    return-void

    .line 152
    :cond_4
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Harvest connect response: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseCode()Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 155
    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->getResponseCode()Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 177
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "An unknown error occurred when connecting to the Collector."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 174
    :pswitch_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Invalid ConnectionInformation was sent to the Collector."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 164
    :pswitch_1
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->isDisableCommand()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 165
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Collector has commanded Agent to disable."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 166
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestDisabled()V

    .line 167
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    return-void

    .line 170
    :cond_5
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Unexpected Collector response: FORBIDDEN"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 160
    :pswitch_2
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->clear()V

    .line 161
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestDisconnected()V

    return-void

    .line 180
    :goto_0
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestError()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected execute()V
    .locals 3

    .line 288
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Harvester state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 290
    iput-boolean v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->stateChanged:Z

    .line 293
    :try_start_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->expireHarvestData()V

    .line 295
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/Harvester$State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 316
    new-instance v0, Ljava/lang/IllegalStateException;

    goto :goto_0

    .line 313
    :pswitch_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->disabled()V

    goto :goto_1

    .line 304
    :pswitch_1
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestBefore()V

    .line 305
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvest()V

    .line 306
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestFinalize()V

    .line 308
    invoke-static {}, Lcom/newrelic/agent/android/TaskQueue;->synchronousDequeue()V

    .line 310
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->connected()V

    goto :goto_1

    .line 300
    :pswitch_2
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestBefore()V

    .line 301
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->disconnected()V

    goto :goto_1

    .line 297
    :pswitch_3
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->uninitialized()V

    goto :goto_1

    .line 316
    :goto_0
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 319
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Exception encountered while attempting to harvest"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 320
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public expireActivityTraces()V
    .locals 10

    .line 519
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getActivityTraces()Lcom/newrelic/agent/android/harvest/ActivityTraces;

    move-result-object v0

    .line 523
    monitor-enter v0

    .line 524
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 525
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getActivity_trace_max_report_attempts()I

    move-result v2

    int-to-long v2, v2

    .line 528
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->getActivityTraces()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    .line 529
    invoke-virtual {v5}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->getReportAttemptCount()J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-ltz v8, :cond_0

    .line 530
    iget-object v6, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ActivityTrace has had "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->getReportAttemptCount()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " report attempts, purging: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 532
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 537
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    .line 538
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->remove(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V

    goto :goto_1

    .line 540
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public expireHarvestData()V
    .locals 0

    .line 463
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->expireHttpErrors()V

    .line 464
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->expireHttpTransactions()V

    .line 465
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->expireActivityTraces()V

    return-void
.end method

.method public expireHttpErrors()V
    .locals 13

    .line 469
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getHttpErrors()Lcom/newrelic/agent/android/harvest/HttpErrors;

    move-result-object v0

    .line 473
    monitor-enter v0

    .line 474
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 475
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 476
    iget-object v4, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getReportMaxTransactionAgeMilliseconds()J

    move-result-wide v4

    .line 479
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HttpErrors;->getHttpErrors()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/newrelic/agent/android/harvest/HttpError;

    .line 480
    invoke-virtual {v7}, Lcom/newrelic/agent/android/harvest/HttpError;->getTimestamp()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    sub-long v10, v2, v4

    cmp-long v12, v8, v10

    if-gez v12, :cond_0

    .line 481
    iget-object v8, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "HttpError too old, purging: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 482
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 487
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/HttpError;

    .line 488
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/HttpErrors;->removeHttpError(Lcom/newrelic/agent/android/harvest/HttpError;)V

    goto :goto_1

    .line 490
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public expireHttpTransactions()V
    .locals 13

    .line 494
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getHttpTransactions()Lcom/newrelic/agent/android/harvest/HttpTransactions;

    move-result-object v0

    .line 498
    monitor-enter v0

    .line 499
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 500
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 501
    iget-object v4, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getReportMaxTransactionAgeMilliseconds()J

    move-result-wide v4

    .line 504
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HttpTransactions;->getHttpTransactions()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/newrelic/agent/android/harvest/HttpTransaction;

    .line 505
    invoke-virtual {v7}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getTimestamp()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    sub-long v10, v2, v4

    cmp-long v12, v8, v10

    if-gez v12, :cond_0

    .line 506
    iget-object v8, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "HttpTransaction too old, purging: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 507
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 512
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/HttpTransaction;

    .line 513
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/HttpTransactions;->remove(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    goto :goto_1

    .line 515
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getCurrentState()Lcom/newrelic/agent/android/harvest/Harvester$State;
    .locals 1

    .line 428
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    return-object v0
.end method

.method public getHarvestConnection()Lcom/newrelic/agent/android/harvest/HarvestConnection;
    .locals 1

    .line 552
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    return-object v0
.end method

.method public getHarvestData()Lcom/newrelic/agent/android/harvest/HarvestData;
    .locals 1

    .line 560
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    return-object v0
.end method

.method public isDisabled()Z
    .locals 2

    .line 437
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public removeHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V
    .locals 2

    .line 455
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    monitor-enter v0

    .line 456
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 457
    monitor-exit v0

    return-void

    .line 458
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestListeners:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 459
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setAgentConfiguration(Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 0

    .line 544
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    return-void
.end method

.method public setConfiguration(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V
    .locals 0

    .line 696
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    return-void
.end method

.method public setHarvestConnection(Lcom/newrelic/agent/android/harvest/HarvestConnection;)V
    .locals 0

    .line 548
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    return-void
.end method

.method public setHarvestData(Lcom/newrelic/agent/android/harvest/HarvestData;)V
    .locals 0

    .line 556
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    return-void
.end method

.method public start()V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestStart()V

    return-void
.end method

.method public stop()V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->fireOnHarvestStop()V

    return-void
.end method

.method protected transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V
    .locals 6

    .line 344
    iget-boolean v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->stateChanged:Z

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring multiple transition: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    if-ne v0, p1, :cond_1

    return-void

    .line 353
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->state:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/Harvester$State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    .line 368
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 363
    :pswitch_0
    new-array v0, v2, [Lcom/newrelic/agent/android/harvest/Harvester$State;

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v3

    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->stateIn(Lcom/newrelic/agent/android/harvest/Harvester$State;[Lcom/newrelic/agent/android/harvest/Harvester$State;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 365
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 359
    :pswitch_1
    new-array v0, v1, [Lcom/newrelic/agent/android/harvest/Harvester$State;

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->UNINITIALIZED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->stateIn(Lcom/newrelic/agent/android/harvest/Harvester$State;[Lcom/newrelic/agent/android/harvest/Harvester$State;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 361
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_2
    const/4 v0, 0x4

    .line 355
    new-array v0, v0, [Lcom/newrelic/agent/android/harvest/Harvester$State;

    sget-object v5, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v5, v0, v4

    aput-object p1, v0, v3

    sget-object v3, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v3, v0, v2

    sget-object v2, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v2, v0, v1

    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->stateIn(Lcom/newrelic/agent/android/harvest/Harvester$State;[Lcom/newrelic/agent/android/harvest/Harvester$State;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 370
    :goto_0
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/harvest/Harvester;->changeState(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    return-void

    .line 357
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected uninitialized()V
    .locals 3

    .line 81
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Agent configuration unavailable."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 86
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->updateSavedConnectInformation()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    invoke-static {}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDefaultHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->configureHarvester(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    .line 88
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestData:Lcom/newrelic/agent/android/harvest/HarvestData;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->clear()V

    .line 92
    :cond_1
    new-instance v0, Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v1

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/ConnectInformation;-><init>(Lcom/newrelic/agent/android/harvest/ApplicationInformation;Lcom/newrelic/agent/android/harvest/DeviceInformation;)V

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->setHarvestConnectInformation(Lcom/newrelic/agent/android/harvest/ConnectInformation;)V

    .line 94
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->setApplicationToken(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getCollectorHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->setCollectorHost(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Harvester;->harvestConnection:Lcom/newrelic/agent/android/harvest/HarvestConnection;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Harvester;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->useSsl()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->useSsl(Z)V

    .line 98
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/Harvester;->transition(Lcom/newrelic/agent/android/harvest/Harvester$State;)V

    .line 99
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/Harvester;->execute()V

    return-void
.end method
