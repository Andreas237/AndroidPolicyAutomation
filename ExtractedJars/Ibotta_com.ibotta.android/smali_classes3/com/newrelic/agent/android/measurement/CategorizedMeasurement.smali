.class public Lcom/newrelic/agent/android/measurement/CategorizedMeasurement;
.super Lcom/newrelic/agent/android/measurement/BaseMeasurement;
.source "CategorizedMeasurement.java"


# instance fields
.field private category:Lcom/newrelic/agent/android/instrumentation/MetricCategory;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method public getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/CategorizedMeasurement;->category:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    return-object v0
.end method

.method public setCategory(Lcom/newrelic/agent/android/instrumentation/MetricCategory;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/CategorizedMeasurement;->category:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    return-void
.end method
