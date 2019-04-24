.class public Lcom/newrelic/agent/android/harvest/ActivitySighting;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "ActivitySighting.java"


# instance fields
.field private durationMs:J

.field private name:Ljava/lang/String;

.field private final timestampMs:J


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    const-wide/16 v0, 0x0

    .line 15
    iput-wide v0, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->durationMs:J

    .line 20
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->timestampMs:J

    .line 21
    iput-object p3, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->name:Ljava/lang/String;

    return-void
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonArray;)Lcom/newrelic/agent/android/harvest/ActivitySighting;
    .locals 4

    .line 71
    new-instance v0, Lcom/newrelic/agent/android/harvest/ActivitySighting;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->get(I)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsLong()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Lcom/newrelic/com/google/gson/JsonArray;->get(I)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/newrelic/agent/android/harvest/ActivitySighting;-><init>(JLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 51
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 52
    monitor-enter p0

    .line 53
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->name:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 54
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->timestampMs:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 55
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->durationMs:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 56
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public asJsonArrayWithoutDuration()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 62
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 63
    monitor-enter p0

    .line 64
    :try_start_0
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->timestampMs:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 65
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->name:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 66
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public end(J)V
    .locals 2

    .line 43
    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->timestampMs:J

    sub-long/2addr p1, v0

    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->durationMs:J

    .line 45
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getDuration()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->durationMs:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestampMs()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->timestampMs:J

    return-wide v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 29
    monitor-enter p0

    .line 30
    :try_start_0
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ActivitySighting;->name:Ljava/lang/String;

    .line 31
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
