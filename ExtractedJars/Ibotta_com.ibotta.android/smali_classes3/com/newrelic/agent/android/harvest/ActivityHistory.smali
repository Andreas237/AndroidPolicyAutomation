.class public Lcom/newrelic/agent/android/harvest/ActivityHistory;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "ActivityHistory.java"


# instance fields
.field private final activityHistory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/harvest/ActivitySighting;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/harvest/ActivitySighting;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ActivityHistory;->activityHistory:Ljava/util/List;

    return-void
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonArray;)Lcom/newrelic/agent/android/harvest/ActivityHistory;
    .locals 2

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/com/google/gson/JsonElement;

    .line 51
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/ActivitySighting;->newFromJson(Lcom/newrelic/com/google/gson/JsonArray;)Lcom/newrelic/agent/android/harvest/ActivitySighting;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 54
    :cond_0
    new-instance p0, Lcom/newrelic/agent/android/harvest/ActivityHistory;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/ActivityHistory;-><init>(Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 28
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 30
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ActivityHistory;->activityHistory:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/ActivitySighting;

    .line 31
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/ActivitySighting;->asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public asJsonArrayWithoutDuration()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 38
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 40
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ActivityHistory;->activityHistory:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/ActivitySighting;

    .line 41
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/ActivitySighting;->asJsonArrayWithoutDuration()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityHistory;->activityHistory:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
