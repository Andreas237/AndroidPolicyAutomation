.class public Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;
.super Lcom/launchdarkly/android/response/interpreter/BaseFlagResponseInterpreter;
.source "PatchFlagResponseInterpreter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/launchdarkly/android/response/interpreter/BaseFlagResponseInterpreter<",
        "Lcom/launchdarkly/android/response/FlagResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/launchdarkly/android/response/interpreter/BaseFlagResponseInterpreter;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Lcom/google/gson/JsonObject;)Lcom/launchdarkly/android/response/FlagResponse;
    .locals 10
    .param p1    # Lcom/google/gson/JsonObject;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_2

    const-string v0, "key"

    .line 20
    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    const-string v1, "value"

    .line 21
    invoke-virtual {p1, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    const-string v1, "version"

    .line 22
    invoke-virtual {p1, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    const-string v2, "flagVersion"

    .line 23
    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    .line 24
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;->getTrackEvents(Lcom/google/gson/JsonObject;)Ljava/lang/Boolean;

    move-result-object v8

    .line 25
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;->getDebugEventsUntilDate(Lcom/google/gson/JsonObject;)Ljava/lang/Long;

    move-result-object v9

    const/4 v3, -0x1

    if-eqz v1, :cond_0

    .line 26
    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/gson/JsonPrimitive;->isNumber()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 27
    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v1

    move v5, v1

    goto :goto_0

    :cond_0
    const/4 v5, -0x1

    .line 29
    :goto_0
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;->getVariation(Lcom/google/gson/JsonObject;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v2, :cond_1

    .line 30
    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonPrimitive;->isNumber()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 31
    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result p1

    move v6, p1

    goto :goto_1

    :cond_1
    const/4 v6, -0x1

    :goto_1
    if-eqz v0, :cond_2

    .line 35
    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v3

    .line 36
    new-instance p1, Lcom/launchdarkly/android/response/UserFlagResponse;

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lcom/launchdarkly/android/response/UserFlagResponse;-><init>(Ljava/lang/String;Lcom/google/gson/JsonElement;IILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 14
    check-cast p1, Lcom/google/gson/JsonObject;

    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/interpreter/PatchFlagResponseInterpreter;->apply(Lcom/google/gson/JsonObject;)Lcom/launchdarkly/android/response/FlagResponse;

    move-result-object p1

    return-object p1
.end method
