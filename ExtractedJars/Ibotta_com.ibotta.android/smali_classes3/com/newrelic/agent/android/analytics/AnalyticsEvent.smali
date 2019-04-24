.class public Lcom/newrelic/agent/android/analytics/AnalyticsEvent;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "AnalyticsEvent.java"


# static fields
.field protected static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private attributeSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end field

.field private category:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field private eventType:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 29
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, v1}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;)V
    .locals 1

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;JLjava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    .line 41
    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->name:Ljava/lang/String;

    if-nez p2, :cond_0

    .line 43
    sget-object p2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    iput-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->category:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    .line 45
    :cond_0
    iput-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->category:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    :goto_0
    if-nez p3, :cond_1

    const-string p2, "Mobile"

    .line 48
    iput-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->eventType:Ljava/lang/String;

    goto :goto_1

    .line 50
    :cond_1
    iput-object p3, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->eventType:Ljava/lang/String;

    .line 52
    :goto_1
    iput-wide p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->timestamp:J

    if-eqz p6, :cond_2

    .line 55
    invoke-interface {p6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 56
    iget-object p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    new-instance p5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {p5, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    invoke-interface {p4, p5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    .line 62
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    new-instance p2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string p3, "name"

    iget-object p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->name:Ljava/lang/String;

    invoke-direct {p2, p3, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    :cond_3
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    new-instance p2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string p3, "timestamp"

    iget-wide p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->timestamp:J

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    new-instance p2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string p3, "category"

    iget-object p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->category:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-virtual {p4}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->name()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    new-instance p2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string p3, "eventType"

    iget-object p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->eventType:Ljava/lang/String;

    invoke-direct {p2, p3, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)V"
        }
    .end annotation

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;JLjava/util/Set;)V

    return-void
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/analytics/AnalyticsEvent;
    .locals 12

    .line 122
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 128
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move-object v3, v0

    move-wide v4, v1

    move-object v1, v3

    move-object v2, v1

    .line 130
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 132
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "name"

    .line 134
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 135
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v8, "category"

    .line 136
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 137
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->fromString(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v8, "eventType"

    .line 138
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 139
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_3
    const-string v8, "timestamp"

    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 141
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsLong()J

    move-result-wide v4

    goto :goto_0

    .line 143
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    .line 144
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isString()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    .line 145
    new-instance v8, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v7, v0, v9}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 146
    :cond_5
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isBoolean()Z

    move-result v8

    if-eqz v8, :cond_6

    .line 147
    new-instance v8, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsBoolean()Z

    move-result v0

    invoke-direct {v8, v7, v0, v9}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;ZZ)V

    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 148
    :cond_6
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isNumber()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 149
    new-instance v8, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsFloat()F

    move-result v0

    float-to-double v10, v0

    invoke-direct {v8, v7, v10, v11, v9}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;DZ)V

    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 154
    :cond_7
    new-instance p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;JLjava/util/Set;)V

    return-object p0
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonArray;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/JsonArray;",
            ")",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;"
        }
    .end annotation

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 166
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 167
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 168
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/com/google/gson/JsonElement;

    .line 169
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/analytics/AnalyticsEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public addAttributes(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 71
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 72
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 73
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to add attribute "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to event "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": the event already contains that attribute."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 4

    .line 97
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 98
    monitor-enter p0

    .line 99
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 100
    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->asJsonElement()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    .line 102
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAttributeSet()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->attributeSet:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getCategory()Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->category:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 88
    iget-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->timestamp:J

    return-wide v0
.end method
