.class public Lcom/newrelic/agent/android/connectivity/CatFacade;
.super Ljava/lang/Object;
.source "CatFacade.java"

# interfaces
.implements Lcom/newrelic/agent/android/connectivity/ConnectivityFacade;
.implements Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;


# static fields
.field private static final instance:Lcom/newrelic/agent/android/connectivity/CatFacade;


# instance fields
.field private atomicId:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private atomicTraceId:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/newrelic/agent/android/connectivity/CatFacade;

    invoke-direct {v0}, Lcom/newrelic/agent/android/connectivity/CatFacade;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/CatFacade;->instance:Lcom/newrelic/agent/android/connectivity/CatFacade;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-static {}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDefaultHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicTraceId:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicId:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private generateRandom16CharHex()Ljava/lang/String;
    .locals 3

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->randomNumber()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->randomNumber()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->randomNumber()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->randomNumber()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lcom/newrelic/agent/android/connectivity/CatFacade;
    .locals 1

    .line 46
    sget-object v0, Lcom/newrelic/agent/android/connectivity/CatFacade;->instance:Lcom/newrelic/agent/android/connectivity/CatFacade;

    return-object v0
.end method

.method private randomNumber()Ljava/lang/Long;
    .locals 4

    .line 50
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide v2, 0x40efffe000000000L    # 65535.0

    mul-double v0, v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public createCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;
    .locals 5

    .line 32
    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->generateRandom16CharHex()Ljava/lang/String;

    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getAccount_id()Ljava/lang/String;

    move-result-object v1

    .line 35
    iget-object v2, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getApplication_id()Ljava/lang/String;

    move-result-object v2

    .line 37
    new-instance v3, Lcom/newrelic/agent/android/connectivity/CatPayload;

    iget-object v4, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicTraceId:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v1, v2, v0, v4}, Lcom/newrelic/agent/android/connectivity/CatPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public onHarvest()V
    .locals 0

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
    .locals 1

    .line 99
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

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

.method public setConfiguration(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    return-void
.end method

.method public declared-synchronized startTrip()Lcom/newrelic/agent/android/connectivity/CatPayload;
    .locals 5

    monitor-enter p0

    .line 18
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicTraceId:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->generateRandom16CharHex()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 19
    iget-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicId:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Lcom/newrelic/agent/android/connectivity/CatFacade;->generateRandom16CharHex()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 21
    new-instance v0, Lcom/newrelic/agent/android/connectivity/CatPayload;

    iget-object v1, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    .line 22
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getAccount_id()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    .line 23
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getApplication_id()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicId:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/newrelic/agent/android/connectivity/CatFacade;->atomicTraceId:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/newrelic/agent/android/connectivity/CatPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
