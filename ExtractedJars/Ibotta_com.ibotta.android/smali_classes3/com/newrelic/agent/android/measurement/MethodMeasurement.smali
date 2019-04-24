.class public Lcom/newrelic/agent/android/measurement/MethodMeasurement;
.super Lcom/newrelic/agent/android/measurement/CategorizedMeasurement;
.source "MethodMeasurement.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJLcom/newrelic/agent/android/instrumentation/MetricCategory;)V
    .locals 1

    .line 10
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Method:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/CategorizedMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    .line 11
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setName(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setScope(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0, p3, p4}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setStartTime(J)V

    .line 14
    invoke-virtual {p0, p5, p6}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setEndTime(J)V

    .line 15
    invoke-virtual {p0, p7, p8}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setExclusiveTime(J)V

    .line 16
    invoke-virtual {p0, p9}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setCategory(Lcom/newrelic/agent/android/instrumentation/MetricCategory;)V

    return-void
.end method
