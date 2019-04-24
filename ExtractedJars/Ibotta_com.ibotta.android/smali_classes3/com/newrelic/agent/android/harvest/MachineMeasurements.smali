.class public Lcom/newrelic/agent/android/harvest/MachineMeasurements;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "MachineMeasurements.java"


# instance fields
.field private final metrics:Lcom/newrelic/agent/android/metric/MetricStore;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 15
    new-instance v0, Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-direct {v0}, Lcom/newrelic/agent/android/metric/MetricStore;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    return-void
.end method


# virtual methods
.method public addMetric(Lcom/newrelic/agent/android/metric/Metric;)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/metric/MetricStore;->add(Lcom/newrelic/agent/android/metric/Metric;)V

    return-void
.end method

.method public addMetric(Ljava/lang/String;D)V
    .locals 1

    .line 24
    new-instance v0, Lcom/newrelic/agent/android/metric/Metric;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/metric/Metric;-><init>(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0, p2, p3}, Lcom/newrelic/agent/android/metric/Metric;->sample(D)V

    .line 26
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    return-void
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 7

    .line 47
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 49
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/MetricStore;->getAll()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/metric/Metric;

    .line 50
    new-instance v3, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v3}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 52
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "name"

    .line 53
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "scope"

    .line 54
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getStringScope()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    new-instance v5, Lcom/newrelic/com/google/gson/Gson;

    invoke-direct {v5}, Lcom/newrelic/com/google/gson/Gson;-><init>()V

    sget-object v6, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->GSON_STRING_MAP_TYPE:Ljava/lang/reflect/Type;

    invoke-virtual {v5, v4, v6}, Lcom/newrelic/com/google/gson/Gson;->toJsonTree(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 57
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 58
    invoke-virtual {v0, v3}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public clear()V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/metric/MetricStore;->clear()V

    return-void
.end method

.method public getMetrics()Lcom/newrelic/agent/android/metric/MetricStore;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/metric/MetricStore;->isEmpty()Z

    move-result v0

    return v0
.end method
