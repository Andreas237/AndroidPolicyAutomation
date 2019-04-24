.class public Lcom/newrelic/agent/android/measurement/consumer/BaseMeasurementConsumer;
.super Lcom/newrelic/agent/android/harvest/HarvestAdapter;
.source "BaseMeasurementConsumer.java"

# interfaces
.implements Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;


# instance fields
.field private final measurementType:Lcom/newrelic/agent/android/measurement/MeasurementType;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestAdapter;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/consumer/BaseMeasurementConsumer;->measurementType:Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-void
.end method


# virtual methods
.method public consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    .locals 0

    return-void
.end method

.method public consumeMeasurements(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/measurement/Measurement;

    .line 33
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/BaseMeasurementConsumer;->consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/BaseMeasurementConsumer;->measurementType:Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-object v0
.end method
