.class public Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.super Ljava/lang/Object;
.source "BaseMeasurementProducer.java"

# interfaces
.implements Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private final producedMeasurementType:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field private final producedMeasurements:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    .line 22
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurementType:Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-void
.end method


# virtual methods
.method public drainMeasurements()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    monitor-enter v0

    .line 53
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 54
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 55
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 56
    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 57
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurementType:Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-object v0
.end method

.method public produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    monitor-enter v0

    if-eqz p1, :cond_0

    .line 34
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public produceMeasurements(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;)V"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    monitor-enter v0

    if-eqz p1, :cond_0

    .line 42
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 44
    :goto_0
    iget-object p1, p0, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->producedMeasurements:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
