.class public interface abstract Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;
.super Ljava/lang/Object;
.source "MeasurementProducer.java"


# virtual methods
.method public abstract drainMeasurements()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;
.end method

.method public abstract produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
.end method

.method public abstract produceMeasurements(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;)V"
        }
    .end annotation
.end method
