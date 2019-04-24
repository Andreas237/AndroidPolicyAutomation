.class public Lcom/newrelic/agent/android/measurement/MeasurementPool;
.super Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.source "MeasurementPool.java"

# interfaces
.implements Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private final consumers:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;",
            ">;"
        }
    .end annotation
.end field

.field private final producers:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Any:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    .line 34
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    .line 35
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    .line 39
    invoke-virtual {p0, p0}, Lcom/newrelic/agent/android/measurement/MeasurementPool;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    return-void
.end method


# virtual methods
.method public addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V
    .locals 4

    if-eqz p1, :cond_1

    .line 83
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    monitor-enter v0

    .line 84
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 85
    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attempted to add the same MeasurementConsumer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " multiple times."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 86
    monitor-exit v0

    return-void

    .line 88
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 89
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 91
    :cond_1
    sget-object p1, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Attempted to add null MeasurementConsumer."

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V
    .locals 4

    if-eqz p1, :cond_1

    .line 49
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attempted to add the same MeasurementProducer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "  multiple times."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 52
    monitor-exit v0

    return-void

    .line 54
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 57
    :cond_1
    sget-object p1, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Attempted to add null MeasurementProducer."

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public broadcastMeasurements()V
    .locals 9

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 120
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    monitor-enter v1

    .line 121
    :try_start_0
    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;

    .line 122
    invoke-interface {v3}, Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;->drainMeasurements()Ljava/util/Collection;

    move-result-object v3

    .line 123
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 124
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_0
    const/4 v3, 0x0

    .line 126
    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 131
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 133
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 136
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    monitor-enter v1

    .line 137
    :try_start_1
    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;

    .line 139
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 142
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/newrelic/agent/android/measurement/Measurement;

    .line 143
    invoke-interface {v3}, Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;->getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;

    move-result-object v6

    invoke-interface {v5}, Lcom/newrelic/agent/android/measurement/Measurement;->getType()Lcom/newrelic/agent/android/measurement/MeasurementType;

    move-result-object v7

    if-eq v6, v7, :cond_4

    invoke-interface {v3}, Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;->getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;

    move-result-object v6

    sget-object v7, Lcom/newrelic/agent/android/measurement/MeasurementType;->Any:Lcom/newrelic/agent/android/measurement/MeasurementType;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v6, v7, :cond_3

    .line 146
    :cond_4
    :try_start_2
    invoke-interface {v3, v5}, Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;->consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v5

    .line 148
    :try_start_3
    invoke-static {v5}, Lcom/newrelic/agent/android/util/ExceptionHelper;->exceptionToErrorCode(Ljava/lang/Exception;)I

    .line 149
    sget-object v6, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "broadcastMeasurements exception["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 154
    :cond_5
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_6
    :goto_2
    return-void

    :catchall_1
    move-exception v0

    .line 131
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    .locals 0

    .line 160
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/measurement/MeasurementPool;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method

.method public consumeMeasurements(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;)V"
        }
    .end annotation

    .line 165
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/measurement/MeasurementPool;->produceMeasurements(Ljava/util/Collection;)V

    return-void
.end method

.method public getMeasurementConsumers()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;",
            ">;"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    return-object v0
.end method

.method public getMeasurementProducers()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;",
            ">;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    return-object v0
.end method

.method public getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;
    .locals 1

    .line 170
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Any:Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-object v0
.end method

.method public removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V
    .locals 4

    .line 102
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    monitor-enter v0

    .line 104
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 105
    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attempted to remove MeasurementConsumer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " which is not registered."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 106
    monitor-exit v0

    return-void

    .line 108
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->consumers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 109
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V
    .locals 4

    .line 67
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    monitor-enter v0

    .line 68
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 69
    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementPool;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attempted to remove MeasurementProducer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " which is not registered."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 70
    monitor-exit v0

    return-void

    .line 72
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/MeasurementPool;->producers:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 73
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
