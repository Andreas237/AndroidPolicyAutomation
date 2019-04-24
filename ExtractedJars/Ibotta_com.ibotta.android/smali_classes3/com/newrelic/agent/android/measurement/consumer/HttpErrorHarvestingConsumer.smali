.class public Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;
.super Lcom/newrelic/agent/android/measurement/consumer/BaseMeasurementConsumer;
.source "HttpErrorHarvestingConsumer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->HttpError:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/BaseMeasurementConsumer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method public consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    .locals 1

    .line 16
    new-instance v0, Lcom/newrelic/agent/android/harvest/HttpError;

    check-cast p1, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/harvest/HttpError;-><init>(Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;)V

    .line 17
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->addHttpErrorTrace(Lcom/newrelic/agent/android/harvest/HttpError;)V

    return-void
.end method
