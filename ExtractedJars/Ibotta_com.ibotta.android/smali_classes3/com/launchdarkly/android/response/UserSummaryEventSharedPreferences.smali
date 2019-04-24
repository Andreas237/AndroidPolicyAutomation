.class public Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;
.super Lcom/launchdarkly/android/response/BaseUserSharedPreferences;
.source "UserSummaryEventSharedPreferences.java"

# interfaces
.implements Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;-><init>()V

    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, p2, v0}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method

.method private addNewCountersElement(Lcom/google/gson/JsonArray;Lcom/google/gson/JsonElement;IIZ)V
    .locals 2
    .param p2    # Lcom/google/gson/JsonElement;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    const/4 v1, 0x1

    if-eqz p5, :cond_0

    const-string p2, "unknown"

    .line 75
    new-instance p3, Lcom/google/gson/JsonPrimitive;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-direct {p3, p4}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v0, p2, p3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    const-string p5, "value"

    .line 77
    invoke-virtual {v0, p5, p2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string p2, "version"

    .line 78
    new-instance p5, Lcom/google/gson/JsonPrimitive;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p5, p3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, p2, p5}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string p2, "variation"

    .line 79
    new-instance p3, Lcom/google/gson/JsonPrimitive;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p3, p4}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, p2, p3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    :goto_0
    const-string p2, "count"

    .line 81
    new-instance p3, Lcom/google/gson/JsonPrimitive;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p3, p4}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, p2, p3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 82
    invoke-virtual {p1, v0}, Lcom/google/gson/JsonArray;->add(Lcom/google/gson/JsonElement;)V

    return-void
.end method

.method private createNewEvent(Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;IIZ)Lcom/google/gson/JsonObject;
    .locals 8

    .line 64
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    const-string v1, "default"

    .line 65
    invoke-virtual {v0, v1, p2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 66
    new-instance p2, Lcom/google/gson/JsonArray;

    invoke-direct {p2}, Lcom/google/gson/JsonArray;-><init>()V

    move-object v2, p0

    move-object v3, p2

    move-object v4, p1

    move v5, p3

    move v6, p4

    move v7, p5

    .line 67
    invoke-direct/range {v2 .. v7}, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->addNewCountersElement(Lcom/google/gson/JsonArray;Lcom/google/gson/JsonElement;IIZ)V

    const-string p1, "counters"

    .line 68
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    return-object v0
.end method


# virtual methods
.method public addOrUpdateEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;IIZ)V
    .locals 9

    .line 25
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->getValueAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->createNewEvent(Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;IIZ)Lcom/google/gson/JsonObject;

    move-result-object v0

    goto/16 :goto_1

    :cond_0
    const-string p3, "counters"

    .line 29
    invoke-virtual {v0, p3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lcom/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    .line 33
    instance-of v5, v1, Lcom/google/gson/JsonObject;

    if-eqz v5, :cond_1

    .line 34
    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v1

    const-string v5, "variation"

    .line 35
    invoke-virtual {v1, v5}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v5

    const-string v6, "version"

    .line 36
    invoke-virtual {v1, v6}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v7, "version"

    .line 38
    invoke-virtual {v1, v7}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/gson/JsonElement;->getAsFloat()F

    move-result v7

    int-to-float v8, p4

    cmpl-float v7, v7, v8

    if-nez v7, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    if-eqz v5, :cond_3

    .line 39
    invoke-virtual {v5}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v8

    if-ne v8, p5, :cond_3

    const/4 v3, 0x1

    :cond_3
    if-eqz v7, :cond_4

    if-nez v3, :cond_5

    :cond_4
    if-nez v5, :cond_1

    if-nez v6, :cond_1

    if-eqz p6, :cond_1

    :cond_5
    const-string p3, "count"

    .line 42
    invoke-virtual {v1, p3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result p3

    const-string v3, "count"

    .line 43
    new-instance v5, Lcom/google/gson/JsonPrimitive;

    add-int/2addr p3, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {v5, p3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v1, v3, v5}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const/4 v3, 0x1

    :cond_6
    if-nez v3, :cond_7

    move-object v1, p0

    move-object v3, p2

    move v4, p4

    move v5, p5

    move v6, p6

    .line 50
    invoke-direct/range {v1 .. v6}, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->addNewCountersElement(Lcom/google/gson/JsonArray;Lcom/google/gson/JsonElement;IIZ)V

    .line 54
    :cond_7
    :goto_1
    iget-object p2, p0, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_8

    const-string p2, "startDate"

    .line 55
    new-instance p3, Lcom/google/gson/JsonPrimitive;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-direct {p3, p4}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, p2, p3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 58
    :cond_8
    iget-object p2, p0, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    .line 59
    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 60
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public bridge synthetic clear()V
    .locals 0

    .line 17
    invoke-super {p0}, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;->clear()V

    return-void
.end method

.method public getFeaturesJsonObject()Lcom/google/gson/JsonObject;
    .locals 8

    .line 87
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    .line 88
    iget-object v1, p0, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 89
    invoke-virtual {p0, v2}, Lcom/launchdarkly/android/response/UserSummaryEventSharedPreferences;->getValueAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "counters"

    .line 91
    invoke-virtual {v3, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v4

    .line 92
    invoke-virtual {v4}, Lcom/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    .line 93
    invoke-virtual {v5}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v5

    const-string v6, "variation"

    .line 95
    invoke-virtual {v5, v6}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "variation"

    invoke-virtual {v5, v6}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_1

    const-string v6, "variation"

    .line 96
    invoke-virtual {v5, v6}, Lcom/google/gson/JsonObject;->remove(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v0, v2, v3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    goto :goto_0

    :cond_3
    return-object v0
.end method
