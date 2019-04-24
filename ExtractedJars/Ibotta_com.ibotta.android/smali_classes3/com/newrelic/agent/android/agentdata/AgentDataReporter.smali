.class public Lcom/newrelic/agent/android/agentdata/AgentDataReporter;
.super Lcom/newrelic/agent/android/payload/PayloadReporter;
.source "AgentDataReporter.java"

# interfaces
.implements Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;


# static fields
.field protected static final instance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/newrelic/agent/android/agentdata/AgentDataReporter;",
            ">;"
        }
    .end annotation
.end field

.field private static reportExceptions:Z


# instance fields
.field protected final payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/agent/android/payload/PayloadStore<",
            "Lcom/newrelic/agent/android/payload/Payload;",
            ">;"
        }
    .end annotation
.end field

.field protected final reportCachedAgentDataCallable:Ljava/util/concurrent/Callable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    .line 25
    sput-boolean v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportExceptions:Z

    return-void
.end method

.method protected constructor <init>(Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 1

    .line 79
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/payload/PayloadReporter;-><init>(Lcom/newrelic/agent/android/AgentConfiguration;)V

    .line 29
    new-instance v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$1;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$1;-><init>(Lcom/newrelic/agent/android/agentdata/AgentDataReporter;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportCachedAgentDataCallable:Ljava/util/concurrent/Callable;

    .line 80
    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getPayloadStore()Lcom/newrelic/agent/android/payload/PayloadStore;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    .line 81
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getReportHandledExceptions()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method static synthetic access$000()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 23
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method static synthetic access$100()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 23
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method public static getInstance()Lcom/newrelic/agent/android/agentdata/AgentDataReporter;
    .locals 1

    .line 38
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    return-object v0
.end method

.method public static initialize(Lcom/newrelic/agent/android/AgentConfiguration;)Lcom/newrelic/agent/android/agentdata/AgentDataReporter;
    .locals 3

    .line 42
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    invoke-direct {v1, p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;-><init>(Lcom/newrelic/agent/android/AgentConfiguration;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AgentConfiguration;->getReportHandledExceptions()Z

    move-result p0

    sput-boolean p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportExceptions:Z

    .line 45
    sget-object p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    return-object p0
.end method

.method protected static isInitialized()Z
    .locals 1

    .line 74
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isPayloadStale(Lcom/newrelic/agent/android/payload/Payload;)Z
    .locals 3

    .line 158
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/AgentConfiguration;->getPayloadTTL()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/newrelic/agent/android/payload/Payload;->isStale(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/payload/PayloadStore;->delete(Ljava/lang/Object;)V

    .line 160
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Payload ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/payload/Payload;->getUuid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] has become stale, and has been removed"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 161
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object p1

    const-string v0, "Supportability/AgentHealth/Payload/Removed/Stale"

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static reportAgentData([B)Z
    .locals 1

    .line 60
    invoke-static {}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    sget-boolean v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportExceptions:Z

    if-eqz v0, :cond_1

    .line 62
    new-instance v0, Lcom/newrelic/agent/android/payload/Payload;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/payload/Payload;-><init>([B)V

    .line 63
    sget-object p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->storeAndReportAgentData(Lcom/newrelic/agent/android/payload/Payload;)Ljava/util/concurrent/Future;

    const/4 p0, 0x1

    goto :goto_0

    .line 67
    :cond_0
    sget-object p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "AgentDataReporter not initialized"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static shutdown()V
    .locals 3

    .line 49
    invoke-static {}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 51
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    sget-object v1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method private submitBatchedPayload(Ljava/util/List;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/payload/Payload;",
            ">;)[B"
        }
    .end annotation

    .line 174
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 177
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 180
    :try_start_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/payload/Payload;

    .line 181
    invoke-virtual {v2}, Lcom/newrelic/agent/android/payload/Payload;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 187
    :cond_0
    new-instance v1, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;-><init>(Ljava/nio/ByteBuffer;)V

    .line 191
    invoke-virtual {v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dataBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    .line 193
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 196
    new-instance v1, Lcom/newrelic/agent/android/agentdata/AgentDataSender;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    sget-object v2, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    iget-object v2, v2, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-direct {v1, v0, v2}, Lcom/newrelic/agent/android/agentdata/AgentDataSender;-><init>([BLcom/newrelic/agent/android/AgentConfiguration;)V

    .line 198
    new-instance v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;

    invoke-direct {v0, p0, p1}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;-><init>(Lcom/newrelic/agent/android/agentdata/AgentDataReporter;Ljava/util/List;)V

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitPayload(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)Ljava/util/concurrent/Future;

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public onHarvest()V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportCachedAgentDataCallable:Ljava/util/concurrent/Callable;

    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public onHarvestBefore()V
    .locals 0

    return-void
.end method

.method public onHarvestComplete()V
    .locals 0

    return-void
.end method

.method public onHarvestConnected()V
    .locals 0

    return-void
.end method

.method public onHarvestDisabled()V
    .locals 0

    return-void
.end method

.method public onHarvestDisconnected()V
    .locals 0

    return-void
.end method

.method public onHarvestError()V
    .locals 0

    return-void
.end method

.method public onHarvestFinalize()V
    .locals 0

    return-void
.end method

.method public onHarvestSendFailed()V
    .locals 0

    return-void
.end method

.method public onHarvestStart()V
    .locals 0

    return-void
.end method

.method public onHarvestStop()V
    .locals 0

    return-void
.end method

.method protected reportAgentData(Lcom/newrelic/agent/android/payload/Payload;)Ljava/util/concurrent/Future;
    .locals 2

    .line 123
    new-instance v0, Lcom/newrelic/agent/android/agentdata/AgentDataSender;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->getAgentConfiguration()Lcom/newrelic/agent/android/AgentConfiguration;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/newrelic/agent/android/agentdata/AgentDataSender;-><init>(Lcom/newrelic/agent/android/payload/Payload;Lcom/newrelic/agent/android/AgentConfiguration;)V

    .line 125
    new-instance p1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$2;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$2;-><init>(Lcom/newrelic/agent/android/agentdata/AgentDataReporter;)V

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/payload/PayloadController;->submitPayload(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method protected reportCachedAgentData()V
    .locals 3

    .line 106
    invoke-static {}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    if-eqz v0, :cond_2

    .line 109
    invoke-interface {v0}, Lcom/newrelic/agent/android/payload/PayloadStore;->fetchAll()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/payload/Payload;

    .line 110
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isPayloadStale(Lcom/newrelic/agent/android/payload/Payload;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 111
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportAgentData(Lcom/newrelic/agent/android/payload/Payload;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 116
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AgentDataReporter not initialized"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public start()V
    .locals 3

    .line 86
    invoke-static {}, Lcom/newrelic/agent/android/payload/PayloadController;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    invoke-virtual {p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportCachedAgentDataCallable:Ljava/util/concurrent/Callable;

    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 90
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/Harvest;->addHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    goto :goto_0

    .line 94
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AgentDataReporter.start(): Must initialize PayloadController first."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public stop()V
    .locals 0

    .line 100
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/Harvest;->removeHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    return-void
.end method

.method public storeAndReportAgentData(Lcom/newrelic/agent/android/payload/Payload;)Ljava/util/concurrent/Future;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/newrelic/agent/android/payload/Payload;->isPersisted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/payload/PayloadStore;->store(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 150
    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/payload/Payload;->setPersisted(Z)V

    .line 154
    :cond_0
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportAgentData(Lcom/newrelic/agent/android/payload/Payload;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method
