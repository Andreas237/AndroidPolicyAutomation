.class public interface abstract Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;
.super Ljava/lang/Object;
.source "MeasurementConsumer.java"


# virtual methods
.method public abstract consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
.end method

.method public abstract consumeMeasurements(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/measurement/Measurement;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getMeasurementType()Lcom/newrelic/agent/android/measurement/MeasurementType;
.end method
