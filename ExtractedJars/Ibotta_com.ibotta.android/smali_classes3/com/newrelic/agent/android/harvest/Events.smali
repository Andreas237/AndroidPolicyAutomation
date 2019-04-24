.class public Lcom/newrelic/agent/android/harvest/Events;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "Events.java"


# instance fields
.field private final events:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/harvest/Event;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/Events;->events:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public addEvent(Lcom/newrelic/agent/android/harvest/Event;)V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/Events;->events:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 14
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 15
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/Events;->events:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/Event;

    .line 16
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/Event;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method
