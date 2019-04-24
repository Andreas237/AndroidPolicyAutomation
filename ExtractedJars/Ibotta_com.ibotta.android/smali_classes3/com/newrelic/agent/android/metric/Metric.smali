.class public Lcom/newrelic/agent/android/metric/Metric;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "Metric.java"


# instance fields
.field private count:J

.field private exclusive:Ljava/lang/Double;

.field private max:Ljava/lang/Double;

.field private min:Ljava/lang/Double;

.field private name:Ljava/lang/String;

.field private scope:Ljava/lang/String;

.field private sumOfSquares:Ljava/lang/Double;

.field private total:Ljava/lang/Double;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/metric/Metric;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    .line 40
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->name:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getScope()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getMin()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    .line 43
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getMax()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    .line 44
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    .line 45
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getSumOfSquares()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    .line 46
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getExclusive()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    .line 47
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getCount()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/metric/Metric;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->name:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    const-wide/16 p1, 0x0

    .line 36
    iput-wide p1, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    return-void
.end method


# virtual methods
.method public addExclusive(D)V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    if-nez v0, :cond_0

    .line 139
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    add-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    :goto_0
    return-void
.end method

.method public aggregate(Lcom/newrelic/agent/android/metric/Metric;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 103
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getCount()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/metric/Metric;->increment(J)V

    .line 105
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->isCountOnly()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v2

    add-double/2addr v0, v2

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    .line 110
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getSumOfSquares()D

    move-result-wide v0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getSumOfSquares()D

    move-result-wide v2

    add-double/2addr v0, v2

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    .line 111
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getExclusive()D

    move-result-wide v0

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getExclusive()D

    move-result-wide v2

    add-double/2addr v0, v2

    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    .line 113
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getMin()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/metric/Metric;->setMin(Ljava/lang/Double;)V

    .line 114
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getMax()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/metric/Metric;->setMax(Ljava/lang/Double;)V

    return-void
.end method

.method public asJson()Lcom/newrelic/com/google/gson/JsonElement;
    .locals 3

    .line 217
    invoke-virtual {p0}, Lcom/newrelic/agent/android/metric/Metric;->isCountOnly()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-wide v1, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    return-object v0

    .line 220
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/metric/Metric;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v0

    return-object v0
.end method

.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 5

    .line 226
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    const-string v1, "count"

    .line 228
    new-instance v2, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-wide v3, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 229
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    if-eqz v1, :cond_0

    const-string v2, "total"

    .line 230
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 231
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    if-eqz v1, :cond_1

    const-string v2, "min"

    .line 232
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 233
    :cond_1
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    if-eqz v1, :cond_2

    const-string v2, "max"

    .line 234
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 235
    :cond_2
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    if-eqz v1, :cond_3

    const-string v2, "sum_of_squares"

    .line 236
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 237
    :cond_3
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    if-eqz v1, :cond_4

    const-string v2, "exclusive"

    .line 238
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    :cond_4
    return-object v0
.end method

.method public clear()V
    .locals 2

    const/4 v0, 0x0

    .line 195
    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    .line 196
    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    .line 197
    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    .line 198
    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    .line 199
    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    const-wide/16 v0, 0x0

    .line 200
    iput-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    return-void
.end method

.method public getCount()J
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    return-wide v0
.end method

.method public getExclusive()D
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getMax()D
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getMin()D
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getScope()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    return-object v0
.end method

.method public getStringScope()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public getSumOfSquares()D
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getTotal()D
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public increment()V
    .locals 2

    const-wide/16 v0, 0x1

    .line 122
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/metric/Metric;->increment(J)V

    return-void
.end method

.method public increment(J)V
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    return-void
.end method

.method public isCountOnly()Z
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isScoped()Z
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isUnscoped()Z
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public sample(D)V
    .locals 4

    .line 51
    iget-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    .line 53
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    if-nez v0, :cond_0

    .line 54
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    mul-double v0, p1, p1

    .line 55
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    add-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    .line 58
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    mul-double v2, p1, p1

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    .line 61
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/metric/Metric;->setMin(Ljava/lang/Double;)V

    .line 62
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/metric/Metric;->setMax(Ljava/lang/Double;)V

    return-void
.end method

.method public setCount(J)V
    .locals 0

    .line 191
    iput-wide p1, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    return-void
.end method

.method public setExclusive(Ljava/lang/Double;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    return-void
.end method

.method public setMax(Ljava/lang/Double;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    if-nez v0, :cond_1

    .line 87
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpl-double v4, v0, v2

    if-lez v4, :cond_2

    .line 90
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    :cond_2
    :goto_0
    return-void
.end method

.method public setMaxFieldValue(Ljava/lang/Double;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    return-void
.end method

.method public setMin(Ljava/lang/Double;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    if-nez v0, :cond_1

    .line 70
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpg-double v4, v0, v2

    if-gez v4, :cond_2

    .line 73
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    :cond_2
    :goto_0
    return-void
.end method

.method public setMinFieldValue(Ljava/lang/Double;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->name:Ljava/lang/String;

    return-void
.end method

.method public setScope(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    return-void
.end method

.method public setSumOfSquares(Ljava/lang/Double;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    return-void
.end method

.method public setTotal(Ljava/lang/Double;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Metric{count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/newrelic/agent/android/metric/Metric;->count:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->total:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->max:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", min="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->min:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scope=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/metric/Metric;->scope:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", name=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/metric/Metric;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", exclusive=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/metric/Metric;->exclusive:Ljava/lang/Double;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", sumofsquares=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/metric/Metric;->sumOfSquares:Ljava/lang/Double;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
