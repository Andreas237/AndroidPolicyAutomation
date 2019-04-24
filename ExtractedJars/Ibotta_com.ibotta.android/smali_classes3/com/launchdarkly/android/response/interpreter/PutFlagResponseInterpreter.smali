.class public Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;
.super Lcom/launchdarkly/android/response/interpreter/BaseFlagResponseInterpreter;
.source "PutFlagResponseInterpreter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/launchdarkly/android/response/interpreter/BaseFlagResponseInterpreter<",
        "Ljava/util/List<",
        "Lcom/launchdarkly/android/response/FlagResponse;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/launchdarkly/android/response/interpreter/BaseFlagResponseInterpreter;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 20
    check-cast p1, Lcom/google/gson/JsonObject;

    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;->apply(Lcom/google/gson/JsonObject;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public apply(Lcom/google/gson/JsonObject;)Ljava/util/List;
    .locals 11
    .param p1    # Lcom/google/gson/JsonObject;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/response/FlagResponse;",
            ">;"
        }
    .end annotation

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    .line 27
    invoke-virtual {p1}, Lcom/google/gson/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/JsonElement;

    .line 29
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 30
    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "version"

    .line 33
    invoke-virtual {v1, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    const-string v3, "value"

    .line 34
    invoke-virtual {v1, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v5

    const-string v3, "flagVersion"

    .line 35
    invoke-virtual {v1, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    .line 36
    invoke-virtual {p0, v1}, Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;->getTrackEvents(Lcom/google/gson/JsonObject;)Ljava/lang/Boolean;

    move-result-object v9

    .line 37
    invoke-virtual {p0, v1}, Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;->getDebugEventsUntilDate(Lcom/google/gson/JsonObject;)Ljava/lang/Long;

    move-result-object v10

    const/4 v6, -0x1

    if-eqz v2, :cond_1

    .line 38
    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/gson/JsonPrimitive;->isNumber()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 39
    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    .line 41
    :goto_1
    invoke-virtual {p0, v1}, Lcom/launchdarkly/android/response/interpreter/PutFlagResponseInterpreter;->getVariation(Lcom/google/gson/JsonObject;)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v3, :cond_2

    .line 42
    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonPrimitive;->isNumber()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 43
    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v1

    move v7, v1

    goto :goto_2

    :cond_2
    const/4 v7, -0x1

    .line 46
    :goto_2
    new-instance v1, Lcom/launchdarkly/android/response/UserFlagResponse;

    move-object v3, v1

    move v6, v2

    invoke-direct/range {v3 .. v10}, Lcom/launchdarkly/android/response/UserFlagResponse;-><init>(Ljava/lang/String;Lcom/google/gson/JsonElement;IILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method
